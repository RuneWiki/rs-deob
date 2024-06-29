import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public class class25 {

    @OriginalMember(owner = "client!mk", name = "u", descriptor = "I")
    public int field291;

    @OriginalMember(owner = "client!mk", name = "m", descriptor = "[Ljava/lang/String;")
    public String[] field283;

    @OriginalMember(owner = "client!mk", name = "s", descriptor = "[I")
    public int[] field289;

    @OriginalMember(owner = "client!mk", name = "k", descriptor = "[I")
    public int[] field281;

    @OriginalMember(owner = "client!mk", name = "g", descriptor = "[B")
    public byte[] field277;

    @OriginalMember(owner = "client!mk", name = "c", descriptor = "I")
    public static int field273 = 0;

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "I")
    public static int field272 = 0;

    @OriginalMember(owner = "client!mk", name = "f", descriptor = "Z")
    public static boolean field276 = true;

    @OriginalMember(owner = "client!mk", name = "t", descriptor = "[I")
    public static int[] field290 = new int[500];

    @OriginalMember(owner = "client!mk", name = "v", descriptor = "[I")
    public static int[] field292 = new int[32];

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "I")
    public static int field271;

    @OriginalMember(owner = "client!mk", name = "d", descriptor = "I")
    public static int field274;

    @OriginalMember(owner = "client!mk", name = "j", descriptor = "I")
    public static int field280;

    @OriginalMember(owner = "client!mk", name = "l", descriptor = "I")
    public static int field282;

    @OriginalMember(owner = "client!mk", name = "n", descriptor = "I")
    public static int field284;

    @OriginalMember(owner = "client!mk", name = "o", descriptor = "I")
    public static int field285;

    @OriginalMember(owner = "client!mk", name = "p", descriptor = "I")
    public static int field286;

    @OriginalMember(owner = "client!mk", name = "q", descriptor = "I")
    public static int field287;

    @OriginalMember(owner = "client!mk", name = "r", descriptor = "I")
    public static int field288;

    @OriginalMember(owner = "client!mk", name = "e", descriptor = "[I")
    public static int[] field275;

    @OriginalMember(owner = "client!mk", name = "h", descriptor = "[I")
    public static int[] field278;

    @OriginalMember(owner = "client!mk", name = "i", descriptor = "[Ljava/lang/String;")
    public static String[] field279;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(BI)Lpa;", line = 6)
    public static final class163 method194(byte arg0, int arg1) {
        if (arg0 <= 0) {
            field276 = false;
        }
        field274++;
        return class132.field2012 && arg1 >= class41.field591 && class320.field4957 >= arg1 ? class84.field1229[arg1 - class41.field591] : null;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(B)V", line = 24)
    public static void method195(byte arg0) {
        field279 = null;
        int var1 = 89 % ((arg0 + 58) / 61);
        field278 = null;
        field275 = null;
        field292 = null;
        field290 = null;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(II)Z", line = 42)
    public final boolean method196(int arg0, int arg1) {
        field286++;
        if (arg1 != 4915) {
            field276 = false;
        }
        return (this.field277[arg0] & 0x10) == 0;
    }

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "(II)Z", line = 53)
    public final boolean method197(int arg0, int arg1) {
        field284++;
        if (arg0 > -40) {
            field275 = (int[]) null;
        }
        return (this.field277[arg1] & 0x8) != 0;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(ZI)Z", line = 64)
    public final boolean method198(boolean arg0, int arg1) {
        field285++;
        if (arg0) {
            return true;
        } else {
            return (this.field277[arg1] & 0x4) != 0;
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(Ljava/lang/String;I)I", line = 87)
    public static final int method199(String arg0, int arg1) {
        field271++;
        for (int var2 = arg1; var2 < class193.field3016.length; var2++) {
            if (class193.field3016[var2].equalsIgnoreCase(arg0)) {
                return var2;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(III)Lhm;", line = 104)
    public static final class91 method200(int arg0, int arg1, int arg2) {
        class79 var3 = class213.field3262[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class91 var4 = var3.field1154;
            var3.field1154 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(I)V", line = 115)
    public static final void method201(int arg0) {
        class27.field302 = null;
        class101.field1452 = null;
        class141.field2160 = null;
        class243.field3700 = null;
        int var1 = 109 / ((40 - arg0) / 51);
        field282++;
    }

    @OriginalMember(owner = "client!mk", name = "c", descriptor = "(II)I", line = 136)
    public final int method202(int arg0, int arg1) {
        if (arg0 != 3) {
            method195((byte) -14);
        }
        field287++;
        return this.field277[arg1] & 0x3;
    }

    @OriginalMember(owner = "client!mk", name = "<init>", descriptor = "(I)V", line = 147)
    public class25(int arg0) {
        this.field291 = arg0;
        this.field283 = new String[this.field291];
        this.field289 = new int[this.field291];
        this.field281 = new int[this.field291];
        this.field277 = new byte[this.field291];
    }
}
