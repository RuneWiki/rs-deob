import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class97 {

    @OriginalMember(owner = "client!o", name = "c", descriptor = "Lwd;")
    private static class150 field2222 = class2.method9(true, "Username: ");

    @OriginalMember(owner = "client!o", name = "f", descriptor = "Z")
    public static volatile boolean field2225 = true;

    @OriginalMember(owner = "client!o", name = "m", descriptor = "[Lga;")
    public static class44[] field2232 = new class44[50];

    @OriginalMember(owner = "client!o", name = "b", descriptor = "Lwd;")
    public static class150 field2221 = field2222;

    @OriginalMember(owner = "client!o", name = "g", descriptor = "Lwd;")
    public static class150 field2226 = class2.method9(true, ")1");

    @OriginalMember(owner = "client!o", name = "h", descriptor = "Z")
    public static boolean field2227 = false;

    @OriginalMember(owner = "client!o", name = "n", descriptor = "[I")
    public static int[] field2233 = new int[5];

    @OriginalMember(owner = "client!o", name = "d", descriptor = "I")
    public static int field2223;

    @OriginalMember(owner = "client!o", name = "e", descriptor = "I")
    public static int field2224;

    @OriginalMember(owner = "client!o", name = "j", descriptor = "I")
    public static int field2229;

    @OriginalMember(owner = "client!o", name = "k", descriptor = "I")
    public static int field2230;

    @OriginalMember(owner = "client!o", name = "l", descriptor = "I")
    public static int field2231;

    @OriginalMember(owner = "client!o", name = "p", descriptor = "I")
    public static int field2235;

    @OriginalMember(owner = "client!o", name = "q", descriptor = "I")
    public static int field2236;

    @OriginalMember(owner = "client!o", name = "i", descriptor = "J")
    public long field2228;

    @OriginalMember(owner = "client!o", name = "r", descriptor = "Lqd;")
    public static class114 field2237;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "Lo;")
    public class97 field2220;

    @OriginalMember(owner = "client!o", name = "o", descriptor = "Lo;")
    public class97 field2234;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(ZII)Z")
    public static final boolean method674(boolean arg0, int arg1, int arg2) {
        if (arg1 == 11) {
            arg1 = 10;
        }
        class61 var3 = class20.method145(arg2, (byte) -102);
        if (!arg0) {
            return true;
        }
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        field2224++;
        return var3.method469(arg1, (byte) 87);
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(B)Z")
    public final boolean method675(byte arg0) {
        field2235++;
        if (this.field2234 == null) {
            return false;
        } else {
            if (arg0 != 57) {
                this.field2228 = 64L;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(I)V")
    public static void method676(int arg0) {
        if (arg0 != -8880) {
            method674(true, 56, -13);
        }
        field2233 = null;
        field2222 = null;
        field2232 = null;
        field2221 = null;
        field2237 = null;
        field2226 = null;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IIBI)I")
    public static final int method677(int arg0, int arg1, byte arg2, int arg3) {
        int var4 = arg0 & 0x3;
        field2236++;
        if (var4 == 0) {
            return arg3;
        } else if (var4 == 1) {
            return 7 - arg1;
        } else {
            if (arg2 != 89) {
                method676(-116);
            }
            return var4 == 2 ? 7 - arg3 : arg1;
        }
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(B)V")
    public final void method678(byte arg0) {
        if (arg0 != -26) {
            this.method678((byte) -120);
        }
        field2231++;
        if (this.field2234 != null) {
            this.field2234.field2220 = this.field2220;
            this.field2220.field2234 = this.field2234;
            this.field2234 = null;
            this.field2220 = null;
        }
    }
}
