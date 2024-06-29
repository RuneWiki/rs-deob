import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class233 {

    @OriginalMember(owner = "client!o", name = "c", descriptor = "Lig;")
    public static class9 field4251 = new class9();

    @OriginalMember(owner = "client!o", name = "e", descriptor = "Lhj;")
    public static class69 field4253 = class181.method1318("", (byte) -124);

    @OriginalMember(owner = "client!o", name = "d", descriptor = "I")
    public static int field4252 = 0;

    @OriginalMember(owner = "client!o", name = "j", descriptor = "[Lsi;")
    public static class192[] field4258 = new class192[500];

    @OriginalMember(owner = "client!o", name = "l", descriptor = "Lhj;")
    public static class69 field4260 = class181.method1318("Update)2Liste geladen)3", (byte) -121);

    @OriginalMember(owner = "client!o", name = "f", descriptor = "Lhj;")
    private static class69 field4254 = class181.method1318("Starting 3d library", (byte) -121);

    @OriginalMember(owner = "client!o", name = "p", descriptor = "Lhj;")
    public static class69 field4264 = class181.method1318(" )2> ", (byte) -122);

    @OriginalMember(owner = "client!o", name = "g", descriptor = "Lhj;")
    public static class69 field4255 = null;

    @OriginalMember(owner = "client!o", name = "q", descriptor = "Lhj;")
    private static class69 field4265 = class181.method1318("yellow:", (byte) -126);

    @OriginalMember(owner = "client!o", name = "m", descriptor = "Z")
    public static boolean field4261 = true;

    @OriginalMember(owner = "client!o", name = "k", descriptor = "Lhj;")
    public static class69 field4259 = field4254;

    @OriginalMember(owner = "client!o", name = "o", descriptor = "[Lhj;")
    public static class69[] field4263 = new class69[1000];

    @OriginalMember(owner = "client!o", name = "n", descriptor = "Lhj;")
    public static class69 field4262 = field4265;

    @OriginalMember(owner = "client!o", name = "i", descriptor = "Lhj;")
    public static class69 field4257 = field4265;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "I")
    public static int field4249;

    @OriginalMember(owner = "client!o", name = "b", descriptor = "I")
    public static int field4250;

    @OriginalMember(owner = "client!o", name = "h", descriptor = "Z")
    public static boolean field4256;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(I)V")
    public static void method1654(int arg0) {
        field4265 = null;
        field4257 = null;
        field4264 = null;
        field4263 = null;
        field4253 = null;
        if (arg0 != 0) {
            method1654(35);
        }
        field4258 = null;
        field4262 = null;
        field4251 = null;
        field4260 = null;
        field4255 = null;
        field4254 = null;
        field4259 = null;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IB)Lkj;")
    public static final class141 method1655(int arg0, byte arg1) {
        field4249++;
        class141 var2 = (class141) class193.field3519.method1714((long) arg0, (byte) -128);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class24.field358.method590(arg0, 1, 0);
        class141 var4 = new class141();
        if (arg1 > -32) {
            return null;
        }
        if (var3 != null) {
            var4.method1080(new class128(var3), 16711680, arg0);
        }
        class193.field3519.method1705((byte) 125, var4, (long) arg0);
        return var4;
    }
}
