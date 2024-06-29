import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class175 extends class303 {

    @OriginalMember(owner = "client!hc", name = "G", descriptor = "I")
    private int field2745 = 0;

    @OriginalMember(owner = "client!hc", name = "N", descriptor = "I")
    private int field2752 = 2048;

    @OriginalMember(owner = "client!hc", name = "Q", descriptor = "I")
    private int field2755 = 2048;

    @OriginalMember(owner = "client!hc", name = "R", descriptor = "I")
    private int field2756 = 4096;

    @OriginalMember(owner = "client!hc", name = "S", descriptor = "I")
    private int field2757 = 12288;

    @OriginalMember(owner = "client!hc", name = "O", descriptor = "I")
    private int field2753 = 8192;

    @OriginalMember(owner = "client!hc", name = "U", descriptor = "I")
    private int field2759 = 0;

    @OriginalMember(owner = "client!hc", name = "L", descriptor = "Lik;")
    public static class259 field2750 = new class259(4);

    @OriginalMember(owner = "client!hc", name = "H", descriptor = "I")
    public static int field2746;

    @OriginalMember(owner = "client!hc", name = "I", descriptor = "I")
    public static int field2747;

    @OriginalMember(owner = "client!hc", name = "J", descriptor = "I")
    public static int field2748;

    @OriginalMember(owner = "client!hc", name = "K", descriptor = "I")
    public static int field2749;

    @OriginalMember(owner = "client!hc", name = "M", descriptor = "I")
    public static int field2751;

    @OriginalMember(owner = "client!hc", name = "P", descriptor = "I")
    public static int field2754;

    @OriginalMember(owner = "client!hc", name = "T", descriptor = "I")
    public static int field2758;

    @OriginalMember(owner = "client!hc", name = "X", descriptor = "I")
    public static int field2762;

    @OriginalMember(owner = "client!hc", name = "V", descriptor = "Lja;")
    public static class64 field2760;

    @OriginalMember(owner = "client!hc", name = "W", descriptor = "Lja;")
    public static class64 field2761;

    @OriginalMember(owner = "client!hc", name = "<init>", descriptor = "()V", line = 5)
    public class175() {
        super(0, true);
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIB)Z", line = 10)
    private final boolean method1307(int arg0, int arg1, byte arg2) {
        if (arg2 > -63) {
            field2750 = (class259) null;
        }
        int var4 = (arg1 + arg0) * this.field2757 >> 12;
        field2748++;
        int var5 = class123.field1971[(var4 * 255 & 0xFF6E3) >> 12];
        int var6 = (var5 << 12) / this.field2757;
        int var7 = (var6 << 12) / this.field2753;
        int var8 = this.field2756 * var7 >> 12;
        return (arg1 - arg0) < var8 && -var8 < arg1 - arg0;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IILvi;II)V", line = 37)
    public static final void method1308(int arg0, int arg1, class6 arg2, int arg3, int arg4) {
        if (arg3 <= 59) {
            field2762 = 29;
        }
        field2747++;
        for (class254 var5 = (class254) class67.field1071.method1490(200); var5 != null; var5 = (class254) class67.field1071.method1487((byte) 117)) {
            if (var5.field3919 == arg0 && arg4 * 128 == var5.field3921 && arg1 * 128 == var5.field3929 && var5.field3937.field106 == arg2.field106) {
                if (var5.field3925 != null) {
                    class128.field2045.method358(var5.field3925);
                    var5.field3925 = null;
                }
                if (var5.field3935 != null) {
                    class128.field2045.method358(var5.field3935);
                    var5.field3935 = null;
                }
                var5.method1701(-116);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "(I)V", line = 79)
    public final void method70(int arg0) {
        class226.method1635(4096);
        if (arg0 >= 13) {
            field2746++;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(ILpe;I)V", line = 90)
    public final void method65(int arg0, class101 arg1, int arg2) {
        field2754++;
        if (arg0 != -4004) {
            this.field2745 = 11;
        }
        if (arg2 == 0) {
            this.field2755 = arg1.method731(false);
        } else if (arg2 == 1) {
            this.field2759 = arg1.method731(false);
        } else if (arg2 == 2) {
            this.field2745 = arg1.method731(false);
        } else if (arg2 == 3) {
            this.field2752 = arg1.method731(false);
        } else if (arg2 == 4) {
            this.field2757 = arg1.method731(false);
        } else if (arg2 == 5) {
            this.field2756 = arg1.method731(false);
        } else if (arg2 == 6) {
            this.field2753 = arg1.method731(false);
        }
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(II)[I", line = 177)
    public final int[] method67(int arg0, int arg1) {
        field2751++;
        int[] var3 = this.field4763.method394(arg0 ^ arg0, arg1);
        if (this.field4763.field863) {
            int var4 = class36.field591[arg1] - 2048;
            for (int var5 = 0; var5 < class70.field1108; var5++) {
                int var6 = this.field2759 + var4;
                int var7 = this.field2752 + var4;
                int var8 = var7 < -2048 ? var7 + 4096 : var7;
                int var9 = var6 >= -2048 ? var6 : var6 + 4096;
                int var10 = var8 > 2048 ? var8 - 4096 : var8;
                int var11 = class291.field4427[var5] - 2048;
                int var12 = var9 <= 2048 ? var9 : var9 - 4096;
                int var13 = this.field2755 + var11;
                int var14 = this.field2745 + var11;
                int var15 = var14 < -2048 ? var14 + 4096 : var14;
                int var16 = var13 < -2048 ? var13 + 4096 : var13;
                int var17 = var16 <= 2048 ? var16 : var16 - 4096;
                int var18 = var15 <= 2048 ? var15 : var15 - 4096;
                var3[var5] = this.method1310(var12, var17, 18347) || this.method1307(var18, var10, (byte) -86) ? 4096 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hc", name = "f", descriptor = "(I)V", line = 226)
    public static void method1309(int arg0) {
        field2760 = null;
        if (arg0 <= -11) {
            field2761 = null;
            field2750 = null;
        }
    }

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "(III)Z", line = 257)
    private final boolean method1310(int arg0, int arg1, int arg2) {
        field2758++;
        int var4 = (arg0 - arg1) * this.field2757 >> 12;
        if (arg2 != 18347) {
            this.field2752 = 114;
        }
        int var5 = class123.field1971[(var4 * 255 & 0xFF742) >> 12];
        int var6 = (var5 << 12) / this.field2757;
        int var7 = (var6 << 12) / this.field2753;
        int var8 = this.field2756 * var7 >> 12;
        return (arg0 + arg1) < var8 && (-var8) < (arg0 + arg1);
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lob;IB)Ljava/lang/String;", line = 274)
    public static final String method1311(class292 arg0, int arg1, byte arg2) {
        field2749++;
        if (arg2 != 81) {
            return (String) null;
        } else if (!client.method1786(arg0).method342(arg1, 1) && arg0.field4452 == null) {
            return null;
        } else if (arg0.field4493 == null || arg1 >= arg0.field4493.length || arg0.field4493[arg1] == null || arg0.field4493[arg1].trim().length() == 0) {
            return class31.field523 ? "Hidden-" + arg1 : null;
        } else {
            return arg0.field4493[arg1];
        }
    }
}
