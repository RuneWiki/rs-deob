import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ln")
public class class96 {

    @OriginalMember(owner = "client!ln", name = "e", descriptor = "Ldea;")
    public class443 field1155 = null;

    @OriginalMember(owner = "client!ln", name = "j", descriptor = "[Lgn;")
    public class691[] field1160 = null;

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "[Lgn;")
    private class691[] field1151 = null;

    @OriginalMember(owner = "client!ln", name = "m", descriptor = "Ldea;")
    public class443 field1163 = null;

    @OriginalMember(owner = "client!ln", name = "f", descriptor = "Lqq;")
    private class651 field1156;

    @OriginalMember(owner = "client!ln", name = "c", descriptor = "Z")
    public boolean field1153;

    @OriginalMember(owner = "client!ln", name = "g", descriptor = "Z")
    public static boolean field1157 = false;

    @OriginalMember(owner = "client!ln", name = "k", descriptor = "I")
    public static int field1161 = 0;

    @OriginalMember(owner = "client!ln", name = "l", descriptor = "[Ltea;")
    public static class477[] field1162 = new class477[128];

    @OriginalMember(owner = "client!ln", name = "b", descriptor = "I")
    public static int field1152;

    @OriginalMember(owner = "client!ln", name = "d", descriptor = "I")
    public static int field1154;

    @OriginalMember(owner = "client!ln", name = "h", descriptor = "I")
    public static int field1158;

    @OriginalMember(owner = "client!ln", name = "i", descriptor = "I")
    public static int field1159;

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(B)V")
    public static void method542(byte arg0) {
        field1162 = null;
        if (arg0 != -79) {
            field1161 = 42;
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(II)Z")
    public static final boolean method543(int arg0, int arg1) {
        if (arg0 != -12756) {
            method542((byte) 115);
        }
        field1154++;
        return arg1 == 10 || arg1 == 11 || arg1 == 12;
    }

    @OriginalMember(owner = "client!ln", name = "b", descriptor = "(B)Z")
    public final boolean method544(byte arg0) {
        if (arg0 > -95) {
            method542((byte) -18);
        }
        field1159++;
        if (this.field1153) {
            return this.field1155 != null;
        } else {
            return this.field1160 != null;
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(IIBIZ)V")
    public static final void method545(int arg0, int arg1, byte arg2, int arg3, boolean arg4) {
        field1158++;
        if (!arg4 && class312.field4205 == arg1 && class523.field7257 == arg3 && class32.field454 == class298.field3942 || class602.field8408.method3554(class618.field8566, (byte) -127)) {
            return;
        }
        class523.field7257 = arg3;
        class32.field454 = class298.field3942;
        class312.field4205 = arg1;
        if (class602.field8408.method3554(class618.field8566, (byte) -128)) {
            class32.field454 = 0;
        }
        class28.method182(arg0, 29697);
        class591.method3268(class325.field4382, class146.field1963, true, class371.field4891.method2141(class422.field5539, true), class401.field5319, false);
        int var5 = class125.field1745;
        class125.field1745 = (class312.field4205 - (class703.field9886 >> 4)) * 8;
        if (arg2 != 17) {
            method543(89, 57);
        }
        int var6 = class4.field23;
        class4.field23 = (class523.field7257 - (class431.field5789 >> 4)) * 8;
        class202.field2719 = class672.method3836(class312.field4205 * 8, class523.field7257 * 8);
        class448.field5932 = null;
        int var7 = class125.field1745 - var5;
        int var8 = class4.field23 - var6;
        if (arg0 == 11) {
            for (int var9 = 0; var9 < class468.field6163; var9++) {
                class407 var10 = class591.field8148[var9];
                if (var10 != null) {
                    class351 var11 = var10.field5354;
                    for (int var12 = 0; var12 < 10; var12++) {
                        var11.field3088[var12] -= var7;
                        var11.field3086[var12] -= var8;
                    }
                    var11.field398 -= var7 * 512;
                    var11.field397 -= var8 * 512;
                }
            }
        } else {
            class289.field3820 = 0;
            boolean var13 = false;
            int var14 = (class703.field9886 - 1) * 512;
            int var15 = (class431.field5789 - 1) * 512;
            for (int var16 = 0; var16 < class468.field6163; var16++) {
                class407 var29 = class591.field8148[var16];
                if (var29 != null) {
                    class351 var30 = var29.field5354;
                    var30.field398 -= var7 * 512;
                    var30.field397 -= var8 * 512;
                    if (var30.field398 >= 0 && var30.field398 <= var14 && var30.field397 >= 0 && var30.field397 <= var15) {
                        boolean var31 = true;
                        for (int var32 = 0; var32 < 10; var32++) {
                            var30.field3088[var32] -= var7;
                            var30.field3086[var32] -= var8;
                            if (var30.field3088[var32] < 0 || class703.field9886 <= var30.field3088[var32] || var30.field3086[var32] < 0 || class431.field5789 <= var30.field3086[var32]) {
                                var31 = false;
                            }
                        }
                        if (var31) {
                            class389.field5220[class289.field3820++] = var30.field3010;
                        } else {
                            var30.method2074(null, true);
                            var29.method242(true);
                            var13 = true;
                        }
                    } else {
                        var30.method2074(null, true);
                        var13 = true;
                        var29.method242(true);
                    }
                }
            }
            if (var13) {
                class468.field6163 = class296.field3921.method3060(0);
                class296.field3921.method3052(13534, class591.field8148);
            }
        }
        for (int var17 = 0; var17 < 2048; var17++) {
            class573 var27 = class513.field7145[var17];
            if (var27 != null) {
                for (int var28 = 0; var28 < 10; var28++) {
                    var27.field3088[var28] -= var7;
                    var27.field3086[var28] -= var8;
                }
                var27.field397 -= var8 * 512;
                var27.field398 -= var7 * 512;
            }
        }
        class669[] var18 = class121.field1575;
        for (int var19 = 0; var19 < var18.length; var19++) {
            class669 var26 = var18[var19];
            if (var26 != null) {
                var26.field9511 -= var8 * 512;
                var26.field9504 -= var7 * 512;
            }
        }
        for (class464 var20 = (class464) class467.field6131.method2506(68); var20 != null; var20 = (class464) class467.field6131.method2505(-121)) {
            var20.field6082 -= var7;
            var20.field6080 -= var8;
            if (class391.field5236 != 4 && (var20.field6082 < 0 || var20.field6080 < 0 || class703.field9886 <= var20.field6082 || class431.field5789 <= var20.field6080)) {
                var20.method242(true);
            }
        }
        if (class391.field5236 != 4) {
            for (class543 var21 = (class543) class290.field3835.method3053((byte) 69); var21 != null; var21 = (class543) class290.field3835.method3056(18113)) {
                int var22 = (int) (var21.field545 & 0x3FFFL);
                int var23 = var22 - class125.field1745;
                int var24 = (int) (var21.field545 >> 14 & 0x3FFFL);
                int var25 = var24 - class4.field23;
                if (var23 < 0 || var25 < 0 || var23 >= class703.field9886 || var25 >= class431.field5789) {
                    var21.method242(true);
                }
            }
        }
        if (class387.field5165 != 0) {
            class387.field5165 -= var7;
            class502.field6926 -= var8;
        }
        class31.method190(Integer.MAX_VALUE);
        if (arg0 != 11) {
            class174.field2462 -= var7;
            class147.field1980 -= var8 * 512;
            class252.field3316 -= var8;
            class82.field946 -= var7 * 512;
            class155.field2184 -= var7;
            class420.field5514 -= var8;
            if (Math.abs(var7) > class703.field9886 || Math.abs(var8) > class431.field5789) {
                class382.method2189(true);
            }
        } else if (class311.field4200 == 4) {
            class424.field5715 -= var8 * 512;
            class622.field8621 -= var8 * 512;
            class165.field2369 -= var7 * 512;
            class470.field6552 -= var7 * 512;
        } else {
            class83.field1004 = -1;
            class342.field4585 = -1;
            class311.field4200 = 1;
        }
        class440.method2485(0);
        class349.method2071(arg2 - 31445);
        class519.field7193.method2512(-11558);
        class338.field4554.method2512(-11558);
        class110.field1298.method1306((byte) -128);
        class35.method203(-82);
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(I)Z")
    public final boolean method546(int arg0) {
        field1152++;
        if (this.field1163 == null) {
            if (class133.field1848 == null) {
                byte[] var2 = class379.method2167(128, 0.6F, (byte) 107, 4.0F, new class674(419684), 128, 8, 0.5F, 16.0F, 4.0F, 16);
                class133.field1848 = class440.method2477(var2, (byte) -57, false);
            }
            byte[] var3 = class116.method682(class133.field1848, false, (byte) -35);
            byte[] var4 = new byte[var3.length * 4];
            int var5 = 0;
            for (int var6 = 0; var6 < 16; var6++) {
                int var7 = var6 * 128 * 128;
                int var8 = var7;
                for (int var9 = 0; var9 < 128; var9++) {
                    int var10 = var9 * 128 + var8;
                    int var11 = var8 + ((var9 - 1 & 0x7F) * 128);
                    int var12 = (var9 + 1 & 0x7F) * 128 + var8;
                    for (int var13 = 0; var13 < 128; var13++) {
                        float var14 = (float) ((var3[var11 + var13] & 0xFF) - (var3[var12 + var13] & 0xFF));
                        float var15 = (float) ((var3[(var13 - 1 & 0x7F) + var10] & 0xFF) - (var3[(var13 + 1 & 0x7F) + var10] & 0xFF));
                        float var16 = (float) (128.0D / Math.sqrt((double) (var14 * var14 + var15 * var15 + 16384.0F)));
                        var4[var5++] = (byte) ((int) (var15 * var16 + 127.0F));
                        var4[var5++] = (byte) ((int) (var16 * 128.0F + 127.0F));
                        var4[var5++] = (byte) ((int) (var14 * var16 + 127.0F));
                        var4[var5++] = var3[var7++];
                    }
                }
            }
            this.field1163 = this.field1156.method2003(16, 1, 128, 128, var4, class480.field6686);
        }
        if (arg0 != 128) {
            this.field1153 = true;
        }
        return this.field1163 != null;
    }

    @OriginalMember(owner = "client!ln", name = "<init>", descriptor = "(Lqq;)V")
    public class96(class651 arg0) {
        this.field1156 = arg0;
        this.field1153 = this.field1156.field9248;
        if (this.field1153 && !this.field1156.method2043(class508.field7012, class404.field5338, -16449)) {
            this.field1153 = false;
        }
        if (this.field1153 || this.field1156.method2037(class404.field5338, class508.field7012, (byte) 51)) {
            class150.method883(-2);
            if (this.field1153) {
                byte[] var2 = class116.method682(class657.field9356, false, (byte) -83);
                this.field1155 = this.field1156.method2003(16, 1, 128, 128, var2, class508.field7012);
                byte[] var3 = class116.method682(class325.field4379, false, (byte) -92);
                this.field1156.method2003(16, 1, 128, 128, var3, class508.field7012);
            } else {
                this.field1160 = new class691[16];
                for (int var4 = 0; var4 < 16; var4++) {
                    byte[] var7 = class643.method3576((byte) 124, var4 * 2 * 128 * 128, class657.field9356, 32768);
                    this.field1160[var4] = this.field1156.method3653(class508.field7012, 128, var7, true, -29799, 128);
                }
                this.field1151 = new class691[16];
                for (int var5 = 0; var5 < 16; var5++) {
                    byte[] var6 = class643.method3576((byte) 107, var5 * 128 * 128 * 2, class325.field4379, 32768);
                    this.field1151[var5] = this.field1156.method3653(class508.field7012, 128, var6, true, -29799, 128);
                }
            }
        }
    }
}
