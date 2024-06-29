import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class242 {

    @OriginalMember(owner = "client!hh", name = "d", descriptor = "Lsc;")
    public static class181 field4203 = class149.method967(255, " zuerst von Ihrer Freunde)2Liste(Q");

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "Lsc;")
    public static class181 field4202 = class149.method967(255, " <col=ffffff>");

    @OriginalMember(owner = "client!hh", name = "h", descriptor = "Lsc;")
    public static class181 field4207 = class149.method967(255, "<col=c0ff00>");

    @OriginalMember(owner = "client!hh", name = "i", descriptor = "Lsc;")
    public static class181 field4208 = class149.method967(255, "<col=ff3000>");

    @OriginalMember(owner = "client!hh", name = "g", descriptor = "Lhd;")
    public static class214 field4206 = new class214(4096);

    @OriginalMember(owner = "client!hh", name = "m", descriptor = "I")
    public static int field4212 = 0;

    @OriginalMember(owner = "client!hh", name = "l", descriptor = "[J")
    public static long[] field4211 = new long[1000];

    @OriginalMember(owner = "client!hh", name = "n", descriptor = "Lo;")
    public static class175 field4213 = null;

    @OriginalMember(owner = "client!hh", name = "j", descriptor = "[I")
    public static int[] field4209 = new int[25];

    @OriginalMember(owner = "client!hh", name = "p", descriptor = "Lsc;")
    public static class181 field4215 = class149.method967(255, "::fpsoff");

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "I")
    public static int field4200;

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "I")
    public static int field4201;

    @OriginalMember(owner = "client!hh", name = "e", descriptor = "I")
    public static int field4204;

    @OriginalMember(owner = "client!hh", name = "f", descriptor = "I")
    public static int field4205;

    @OriginalMember(owner = "client!hh", name = "o", descriptor = "Luf;")
    public static class217 field4214;

    @OriginalMember(owner = "client!hh", name = "k", descriptor = "[[[B")
    public static byte[][][] field4210;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(I)V")
    public static final void method1643(int arg0) {
        if (arg0 == 556) {
            field4201++;
            class128.field2120.method1798(-41);
            class115.field1876.method1798(-86);
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(B)V")
    public static void method1644(byte arg0) {
        field4208 = null;
        if (arg0 <= 40) {
            method1646(-101, (byte) 86, (class11) null, 14);
        }
        field4211 = null;
        field4202 = null;
        field4215 = null;
        field4206 = null;
        field4209 = null;
        field4213 = null;
        field4214 = null;
        field4210 = null;
        field4207 = null;
        field4203 = null;
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(B)V")
    public static final void method1645(byte arg0) {
        if (arg0 != -107) {
            field4211 = null;
        }
        field4200++;
        if (class5.field106 == 30) {
            class92.method612(25, 255);
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IBLjb;I)Z")
    public static final boolean method1646(int arg0, byte arg1, class11 arg2, int arg3) {
        field4205++;
        if (arg1 != -64) {
            return false;
        }
        byte[] var4 = arg2.method89(arg3, arg0, 118);
        if (var4 == null) {
            return false;
        } else {
            class218.method1455(true, var4);
            return true;
        }
    }
}
