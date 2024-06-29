import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class127 {

    @OriginalMember(owner = "client!te", name = "l", descriptor = "I")
    private int field2158 = 0;

    @OriginalMember(owner = "client!te", name = "c", descriptor = "Lvl;")
    private class164 field2149;

    @OriginalMember(owner = "client!te", name = "m", descriptor = "I")
    public static int field2159 = 1;

    @OriginalMember(owner = "client!te", name = "k", descriptor = "Ljava/lang/String;")
    public static String field2157 = "cyan:";

    @OriginalMember(owner = "client!te", name = "h", descriptor = "I")
    public static int field2154 = 0;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "I")
    public static int field2147 = 0;

    @OriginalMember(owner = "client!te", name = "b", descriptor = "Lci;")
    public static class327 field2148 = new class327();

    @OriginalMember(owner = "client!te", name = "d", descriptor = "I")
    public static int field2150;

    @OriginalMember(owner = "client!te", name = "e", descriptor = "I")
    public static int field2151;

    @OriginalMember(owner = "client!te", name = "g", descriptor = "I")
    public static int field2153;

    @OriginalMember(owner = "client!te", name = "i", descriptor = "I")
    public static int field2155;

    @OriginalMember(owner = "client!te", name = "n", descriptor = "I")
    public static int field2160;

    @OriginalMember(owner = "client!te", name = "o", descriptor = "I")
    public static int field2161;

    @OriginalMember(owner = "client!te", name = "j", descriptor = "Lec;")
    private class45 field2156;

    @OriginalMember(owner = "client!te", name = "f", descriptor = "Lth;")
    public static class57 field2152;

    @OriginalMember(owner = "client!te", name = "p", descriptor = "[[[B")
    public static byte[][][] field2162;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(I)Lec;", line = 4)
    public final class45 method982(int arg0) {
        field2160++;
        this.field2158 = 0;
        return arg0 == 105 ? this.method985(28980) : (class45) null;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Lqm;B)Le;", line = 18)
    public static final class360 method983(class227 arg0, byte arg1) {
        field2161++;
        int var2 = 62 / ((arg1 - 58) / 63);
        return new class360(arg0.method1769(-30726), arg0.method1769(-30726), arg0.method1769(-30726), arg0.method1769(-30726), arg0.method1736(255), arg0.method1720((byte) -61));
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IZ)V", line = 28)
    public static final void method984(int arg0, boolean arg1) {
        class94.field1574 = new int[104];
        class11.field88 = new int[5];
        class23.field271 = new int[104];
        byte var2;
        if (arg1) {
            var2 = 1;
        } else {
            var2 = 4;
        }
        class74.field1267 = new byte[var2][105][105];
        class118.field2000 = new int[104];
        if (arg0 != -1) {
            method986(35);
        }
        class319.field5081 = new byte[var2][104][104];
        class336.field5320 = new int[var2][105][105];
        field2162 = new byte[var2][104][104];
        class176.field2830 = new int[104];
        class40.field590 = new byte[var2][104][104];
        field2150++;
        class123.field2108 = 99;
        class329.field5232 = new byte[var2][104][104];
        class172.field2755 = new int[104];
    }

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(I)Lec;", line = 59)
    public final class45 method985(int arg0) {
        if (arg0 != 28980) {
            field2147 = -12;
        }
        field2155++;
        if (this.field2158 > 0 && this.field2149.field2610[this.field2158 - 1] != this.field2156) {
            class45 var2 = this.field2156;
            this.field2156 = var2.field708;
            return var2;
        }
        class45 var3;
        do {
            if (this.field2149.field2598 <= this.field2158) {
                return null;
            }
            var3 = this.field2149.field2610[this.field2158++].field708;
        } while (this.field2149.field2610[this.field2158 - 1] == var3);
        this.field2156 = var3.field708;
        return var3;
    }

    @OriginalMember(owner = "client!te", name = "c", descriptor = "(I)V", line = 105)
    public static void method986(int arg0) {
        if (arg0 != -1) {
            method984(-13, false);
        }
        field2157 = null;
        field2148 = null;
        field2162 = (byte[][][]) null;
        field2152 = null;
    }

    @OriginalMember(owner = "client!te", name = "<init>", descriptor = "(Lvl;)V", line = 135)
    public class127(class164 arg0) {
        this.field2149 = arg0;
    }
}
