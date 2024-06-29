import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class63 extends class7 {

    @OriginalMember(owner = "client!gb", name = "V", descriptor = "Z")
    private boolean field1232 = true;

    @OriginalMember(owner = "client!gb", name = "S", descriptor = "I")
    private int field1229 = 4096;

    @OriginalMember(owner = "client!gb", name = "U", descriptor = "Lob;")
    public static class141 field1231 = class175.method1195(40, "bevor Sie den Vorgang wiederholen)3");

    @OriginalMember(owner = "client!gb", name = "ab", descriptor = "Lob;")
    public static class141 field1237 = class175.method1195(40, "Versteckt");

    @OriginalMember(owner = "client!gb", name = "R", descriptor = "Lwh;")
    public static class225 field1228 = new class225();

    @OriginalMember(owner = "client!gb", name = "fb", descriptor = "Lob;")
    private static class141 field1242 = class175.method1195(40, "Your account has been disabled)3");

    @OriginalMember(owner = "client!gb", name = "cb", descriptor = "Lob;")
    public static class141 field1239 = field1242;

    @OriginalMember(owner = "client!gb", name = "db", descriptor = "[B")
    public static byte[] field1240 = new byte[32896];

    @OriginalMember(owner = "client!gb", name = "T", descriptor = "I")
    public static int field1230;

    @OriginalMember(owner = "client!gb", name = "W", descriptor = "I")
    public static int field1233;

    @OriginalMember(owner = "client!gb", name = "X", descriptor = "I")
    public static int field1234;

    @OriginalMember(owner = "client!gb", name = "Y", descriptor = "I")
    public static int field1235;

    @OriginalMember(owner = "client!gb", name = "Z", descriptor = "I")
    public static int field1236;

    @OriginalMember(owner = "client!gb", name = "bb", descriptor = "I")
    public static int field1238;

    @OriginalMember(owner = "client!gb", name = "eb", descriptor = "Lra;")
    public static class170 field1241;

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(IB)[[I")
    public final int[][] method51(int arg0, byte arg1) {
        ++field1233;
        int var3 = -16 / ((arg1 - -42) / 41);
        int[][] var4 = super.field97.method1396(arg0, (byte) 45);
        if (super.field97.field4093) {
            int[] var5 = this.method52(arg0 + -1 & class54.field1050, 0, 114);
            int[] var6 = this.method52(arg0, 0, 121);
            int[] var7 = this.method52(class54.field1050 & arg0 + 1, 0, 40);
            int[] var8 = var4[0];
            int[] var9 = var4[1];
            int[] var10 = var4[2];
            for (int var11 = 0; class117.field2272 > var11; ++var11) {
                int var12 = (var6[class106.field2030 & var11 + 1] + -var6[var11 + -1 & class106.field2030]) * this.field1229;
                int var13 = (var7[var11] - var5[var11]) * this.field1229;
                int var14 = var12 >> 12;
                int var15 = var13 >> 12;
                int var16 = var14 * var14 >> 12;
                int var17 = var15 * var15 >> 12;
                int var18 = (int) (Math.sqrt((double) ((float) (var16 + var17 + 4096) / 4096.0F)) * 4096.0D);
                int var19;
                int var20;
                int var21;
                if (~var18 == -1) {
                    var19 = 0;
                    var20 = 0;
                    var21 = 0;
                } else {
                    var20 = 16777216 / var18;
                    var21 = var13 / var18;
                    var19 = var12 / var18;
                }
                if (this.field1232) {
                    var20 = (var20 >> 1) + 2048;
                    var21 = (var21 >> 1) + 2048;
                    var19 = (var19 >> 1) + 2048;
                }
                var8[var11] = var19;
                var9[var11] = var21;
                var10[var11] = var20;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!gb", name = "i", descriptor = "(I)V")
    public static final void method417(int arg0) {
        ++field1235;
        class38.method252(class66.field1275, -121);
        ++class17.field311;
        if (class135.field2562 && class110.field2122) {
            int var1 = class146.field2794;
            int var2 = var1 - class213.field4069;
            if (~var2 > ~class206.field3923) {
                var2 = class206.field3923;
            }
            if (~(class66.field1275.field3299 + var2) < ~(class206.field3923 + class204.field3915.field3299)) {
                var2 = class206.field3923 + class204.field3915.field3299 + -class66.field1275.field3299;
            }
            int var3 = -class110.field2124 + var2;
            int var4 = class174.field3452;
            int var5 = var4 - class195.field3732;
            int var6 = class66.field1275.field3339;
            if (~class162.field3135 < ~var5) {
                var5 = class162.field3135;
            }
            int var7 = var2 - -class204.field3915.field3346 + -class206.field3923;
            if (class162.field3135 + class204.field3915.field3284 < class66.field1275.field3284 + var5) {
                var5 = class204.field3915.field3284 - class66.field1275.field3284 + class162.field3135;
            }
            int var8 = class204.field3915.field3383 + var5 + -class162.field3135;
            int var9 = -class156.field3017 + var5;
            if (~class17.field311 < ~class66.field1275.field3374 && (~var6 > ~var3 || -var6 > var3 || ~var9 < ~var6 || var9 < -var6)) {
                class202.field3826 = true;
            }
            if (class66.field1275.field3271 != null && class202.field3826) {
                class220 var10 = new class220();
                var10.field4168 = class66.field1275;
                var10.field4161 = var7;
                var10.field4162 = var8;
                var10.field4177 = class66.field1275.field3271;
                class224.method1441(-103, var10);
            }
            if (~class125.field2395 == arg0) {
                if (!class202.field3826) {
                    if ((class146.field2835 == 1 || class58.method394(class188.field3637 + -1, 0)) && ~class188.field3637 < -3) {
                        class17.method105(765);
                    } else if (class188.field3637 > 0) {
                        class76.method534(class188.field3637 + -1, (byte) -37);
                    }
                } else {
                    if (class66.field1275.field3263 != null) {
                        class220 var11 = new class220();
                        var11.field4162 = var8;
                        var11.field4161 = var7;
                        var11.field4177 = class66.field1275.field3263;
                        var11.field4166 = class187.field3621;
                        var11.field4168 = class66.field1275;
                        class224.method1441(-124, var11);
                    }
                    if (class187.field3621 != null && class65.method429(-1, class66.field1275) != null) {
                        ++class206.field3922;
                        class7.field120.method32(66, 12885);
                        class7.field120.method986(class187.field3621.field3396, false);
                        class7.field120.method972(26894, class66.field1275.field3357);
                        class7.field120.method986(class66.field1275.field3396, false);
                        class7.field120.method1009(arg0 ^ 106, class187.field3621.field3357);
                    }
                }
                class66.field1275 = null;
            }
        } else {
            if (class17.field311 > 1) {
                class66.field1275 = null;
            }
        }
    }

    @OriginalMember(owner = "client!gb", name = "j", descriptor = "(I)V")
    public static void method418(int arg0) {
        field1241 = null;
        field1237 = null;
        if (arg0 != 256) {
            method420((class154) null, 64, (class154) null);
        }
        field1231 = null;
        field1242 = null;
        field1228 = null;
        field1239 = null;
        field1240 = null;
    }

    @OriginalMember(owner = "client!gb", name = "<init>", descriptor = "()V")
    public class63() {
        super(1, false);
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIB)I")
    public static final int method419(int arg0, int arg1, byte arg2) {
        ++field1238;
        int var3 = class70.method461(1508653965, arg0 + -1, arg1 + -1) + (class70.method461(1508653965, arg0 + -1, arg1 + 1) - (-class70.method461(1508653965, arg0 + 1, arg1 - 1) - class70.method461(1508653965, arg0 + 1, arg1 - -1)));
        if (arg2 != -100) {
            field1228 = null;
        }
        int var4 = class70.method461(1508653965, arg0, arg1 + -1) + class70.method461(1508653965, arg0, arg1 - -1) + class70.method461(1508653965, arg0 + -1, arg1) + class70.method461(1508653965, arg0 + 1, arg1);
        int var5 = class70.method461(arg2 + 1508654065, arg0, arg1);
        return var3 / 16 + var4 / 8 + var5 / 4;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IILog;)V")
    public final void method31(int arg0, int arg1, class146 arg2) {
        ++field1234;
        if (~arg0 != -1) {
            if (~arg0 == -2) {
                this.field1232 = ~arg2.method991(255) == -2;
            }
        } else {
            this.field1229 = arg2.method1007(49);
        }
        int var5 = -102 % ((66 - arg1) / 57);
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lpe;ILpe;)V")
    public static final void method420(class154 arg0, int arg1, class154 arg2) {
        if (arg1 == -1) {
            ++field1230;
            class50.field984 = arg2;
            class160.field3111 = arg0;
            class130.field2486 = class50.field984.method1058(3, (byte) -59);
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(BZILpe;Lpe;)Lhh;")
    public static final class78 method421(byte arg0, boolean arg1, int arg2, class154 arg3, class154 arg4) {
        ++field1236;
        int[] var5 = arg3.method1057(arg2, (byte) 119);
        boolean var6 = true;
        for (int var7 = 0; ~var7 > ~var5.length; ++var7) {
            byte[] var8 = arg3.method1070(var5[var7], arg2, 34);
            if (var8 == null) {
                var6 = false;
            } else {
                int var9 = 255 & var8[1] | 65280 & var8[0] << 8;
                byte[] var10;
                if (!arg1) {
                    var10 = arg4.method1070(0, var9, 34);
                } else {
                    var10 = arg4.method1070(var9, 0, 34);
                }
                if (var10 == null) {
                    var6 = false;
                }
            }
        }
        if (!var6) {
            return null;
        } else {
            try {
                int var11 = 96 % ((-33 - arg0) / 32);
                return new class78(arg3, arg4, arg2, arg1);
            } catch (Exception var12) {
                return null;
            }
        }
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 256; ++var1) {
            for (int var2 = 0; ~var1 <= ~var2; ++var2) {
                field1240[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var2 * var2 + var1 * var1 + 65535) / 65535.0F))));
            }
        }
    }
}
