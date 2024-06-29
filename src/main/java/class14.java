import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class14 {

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "[I")
    private int[] field252 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!ia", name = "h", descriptor = "I")
    public int field259 = -1;

    @OriginalMember(owner = "client!ia", name = "o", descriptor = "Z")
    public boolean field266 = false;

    @OriginalMember(owner = "client!ia", name = "l", descriptor = "Loe;")
    public static class9 field263 = new class9(5000);

    @OriginalMember(owner = "client!ia", name = "t", descriptor = "F")
    public static float field271;

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "I")
    public static int field253;

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "I")
    public static int field254;

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "I")
    public static int field255;

    @OriginalMember(owner = "client!ia", name = "g", descriptor = "I")
    public static int field258;

    @OriginalMember(owner = "client!ia", name = "i", descriptor = "I")
    public static int field260;

    @OriginalMember(owner = "client!ia", name = "j", descriptor = "I")
    public static int field261;

    @OriginalMember(owner = "client!ia", name = "k", descriptor = "I")
    public static int field262;

    @OriginalMember(owner = "client!ia", name = "m", descriptor = "I")
    public static int field264;

    @OriginalMember(owner = "client!ia", name = "r", descriptor = "I")
    public static int field269;

    @OriginalMember(owner = "client!ia", name = "s", descriptor = "I")
    public static int field270;

    @OriginalMember(owner = "client!ia", name = "n", descriptor = "[I")
    private int[] field265;

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "[S")
    private short[] field256;

    @OriginalMember(owner = "client!ia", name = "f", descriptor = "[S")
    private short[] field257;

    @OriginalMember(owner = "client!ia", name = "p", descriptor = "[S")
    private short[] field267;

    @OriginalMember(owner = "client!ia", name = "q", descriptor = "[S")
    private short[] field268;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIII)V", line = 10)
    public static final void method100(int arg0, int arg1, int arg2, int arg3) {
        class47 var4 = class326.field4975[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class11 var5 = var4.field975;
        if (var5 != null) {
            var5.field219 = var5.field219 * arg3 / 16;
            var5.field220 = var5.field220 * arg3 / 16;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lbm;B)V", line = 29)
    public static final void method101(class307 arg0, byte arg1) {
        class123.field2128 = arg0;
        class136.field2285 = class123.field2128.method2056(16, -126);
        if (arg1 <= -105) {
            field253++;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(I)Lel;", line = 44)
    public final class3 method102(int arg0) {
        field264++;
        class3[] var2 = new class3[5];
        int var3 = 0;
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field252[var4] != -1) {
                var2[var3++] = class3.method33(class325.field4960, this.field252[var4], 0);
            }
        }
        class3 var5 = new class3(var2, var3);
        if (this.field257 != null) {
            for (int var6 = 0; var6 < this.field257.length; var6++) {
                var5.method48(this.field257[var6], this.field268[var6]);
            }
        }
        if (arg0 != -22282) {
            this.field265 = (int[]) null;
        }
        if (this.field267 != null) {
            for (int var7 = 0; var7 < this.field267.length; var7++) {
                var5.method49(this.field267[var7], this.field256[var7]);
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(I)Z", line = 100)
    public final boolean method103(int arg0) {
        field254++;
        if (this.field265 == null) {
            return true;
        }
        boolean var2 = true;
        int var3 = 0;
        if (arg0 != -1) {
            this.field266 = false;
        }
        while (var3 < this.field265.length) {
            if (!class325.field4960.method2044((byte) 119, this.field265[var3], 0)) {
                var2 = false;
            }
            var3++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(III)J", line = 127)
    public static final long method104(int arg0, int arg1, int arg2) {
        class47 var3 = class326.field4975[arg0][arg1][arg2];
        return var3 == null || var3.field965 == null ? 0L : var3.field965.field795;
    }

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "(I)Z", line = 136)
    public final boolean method105(int arg0) {
        boolean var2 = true;
        for (int var3 = arg0; var3 < 5; var3++) {
            if (this.field252[var3] != -1 && !class325.field4960.method2044((byte) 61, this.field252[var3], 0)) {
                var2 = false;
            }
        }
        field261++;
        return var2;
    }

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "(I)Lel;", line = 158)
    public final class3 method106(int arg0) {
        field260++;
        if (this.field265 == null) {
            return null;
        }
        class3[] var2 = new class3[this.field265.length];
        for (int var3 = 0; var3 < this.field265.length; var3++) {
            var2[var3] = class3.method33(class325.field4960, this.field265[var3], 0);
        }
        class3 var4;
        if (var2.length == arg0) {
            var4 = var2[0];
        } else {
            var4 = new class3(var2, var2.length);
        }
        if (this.field257 != null) {
            for (int var5 = 0; var5 < this.field257.length; var5++) {
                var4.method48(this.field257[var5], this.field268[var5]);
            }
        }
        if (this.field267 != null) {
            for (int var6 = 0; var6 < this.field267.length; var6++) {
                var4.method49(this.field267[var6], this.field256[var6]);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(B)V", line = 212)
    public static void method107(byte arg0) {
        field263 = null;
        int var1 = -60 % ((arg0 + 67) / 59);
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lag;I)V", line = 236)
    public final void method108(class202 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method1317((byte) -83);
            if (var3 == 0) {
                if (arg1 > -54) {
                    return;
                }
                field269++;
                return;
            }
            this.method109(var3, 75, arg0);
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IILag;)V", line = 259)
    private final void method109(int arg0, int arg1, class202 arg2) {
        if (arg0 == 1) {
            this.field259 = arg2.method1317((byte) -92);
        } else if (arg0 == 2) {
            int var4 = arg2.method1317((byte) -81);
            this.field265 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field265[var5] = arg2.method1315(14289);
            }
        } else if (arg0 == 3) {
            this.field266 = true;
        } else if (arg0 == 40) {
            int var8 = arg2.method1317((byte) -79);
            this.field268 = new short[var8];
            this.field257 = new short[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field257[var9] = (short) arg2.method1315(14289);
                this.field268[var9] = (short) arg2.method1315(14289);
            }
        } else if (arg0 == 41) {
            int var6 = arg2.method1317((byte) -103);
            this.field267 = new short[var6];
            this.field256 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field267[var7] = (short) arg2.method1315(14289);
                this.field256[var7] = (short) arg2.method1315(14289);
            }
        } else if (arg0 >= 60 && arg0 < 70) {
            this.field252[arg0 - 60] = arg2.method1315(14289);
        }
        field262++;
        if (arg1 <= 60) {
            this.method102(104);
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lbm;Lbm;Lvn;I)V", line = 336)
    public static final void method110(class307 arg0, class307 arg1, class96 arg2, int arg3) {
        class239.field3743 = arg1;
        class130.field2207 = arg2;
        field255++;
        class190.field3089 = arg0;
        if (class190.field3089 != null) {
            class131.field2210 = class190.field3089.method2056(1, -117);
        }
        if (arg3 != 0) {
            method101((class307) null, (byte) -14);
        }
        if (class239.field3743 != null) {
            class134.field2259 = class239.field3743.method2056(1, arg3 ^ 0xFFFFFF98);
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(BI)V", line = 356)
    public static final void method111(byte arg0, int arg1) {
        field258++;
        class48.field999--;
        if (class48.field999 == arg1) {
            return;
        }
        if (arg0 > -74) {
            method110((class307) null, (class307) null, (class96) null, 30);
        }
        class129.method848(class256.field3998, arg1 + 1, class256.field3998, arg1, class48.field999 - arg1);
        class129.method848(class296.field4515, arg1 + 1, class296.field4515, arg1, class48.field999 - arg1);
        class129.method853(class169.field2715, arg1 + 1, class169.field2715, arg1, class48.field999 - arg1);
        class129.method856(class120.field2088, arg1 + 1, class120.field2088, arg1, class48.field999 - arg1);
        class129.method849(class11.field226, arg1 + 1, class11.field226, arg1, class48.field999 - arg1);
        class129.method853(class153.field2502, arg1 + 1, class153.field2502, arg1, class48.field999 - arg1);
        class129.method853(class255.field3988, arg1 + 1, class255.field3988, arg1, class48.field999 - arg1);
    }
}
