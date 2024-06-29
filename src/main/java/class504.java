import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class504 {

    @OriginalMember(owner = "client!j", name = "b", descriptor = "Lgv;")
    public class73 field7153 = null;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "[Lhi;")
    public class190[] field7152 = null;

    @OriginalMember(owner = "client!j", name = "d", descriptor = "Lgv;")
    public class73 field7155 = null;

    @OriginalMember(owner = "client!j", name = "k", descriptor = "[Lhi;")
    private class190[] field7162 = null;

    @OriginalMember(owner = "client!j", name = "h", descriptor = "Lcf;")
    private class562 field7159;

    @OriginalMember(owner = "client!j", name = "c", descriptor = "Z")
    public boolean field7154;

    @OriginalMember(owner = "client!j", name = "e", descriptor = "I")
    public static int field7156 = 0;

    @OriginalMember(owner = "client!j", name = "g", descriptor = "Lsb;")
    public static class266 field7158 = new class266(19, 4);

    @OriginalMember(owner = "client!j", name = "l", descriptor = "I")
    public static int field7163 = 0;

    @OriginalMember(owner = "client!j", name = "m", descriptor = "I")
    public static int field7164 = 1;

    @OriginalMember(owner = "client!j", name = "f", descriptor = "I")
    public static int field7157;

    @OriginalMember(owner = "client!j", name = "i", descriptor = "I")
    public static int field7160;

    @OriginalMember(owner = "client!j", name = "j", descriptor = "I")
    public static int field7161;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(I)V")
    public static void method2995(int arg0) {
        field7158 = null;
        if (arg0 != 25659) {
            method2997(null, null, null, (byte) 8, null);
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Z)Z")
    public final boolean method2996(boolean arg0) {
        field7160++;
        if (!arg0) {
            this.method2996(true);
        }
        if (this.field7154) {
            return this.field7155 != null;
        } else {
            return this.field7152 != null;
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "([ILan;[IB[I)V")
    public static final void method2997(int[] arg0, class22 arg1, int[] arg2, byte arg3, int[] arg4) {
        if (arg3 != 80) {
            return;
        }
        for (int var5 = 0; var5 < arg4.length; var5++) {
            int var6 = arg4[var5];
            int var7 = arg2[var5];
            int var8 = arg0[var5];
            int var9 = 0;
            while (var7 != 0 && arg1.field8768.length > var9) {
                if ((var7 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg1.field8768[var9] = null;
                    } else {
                        class138 var10 = class357.field5338.method2099(var6, true);
                        int var11 = var10.field2434;
                        class674 var12 = arg1.field8768[var9];
                        if (var12 != null) {
                            if (var12.field9589 == var6) {
                                if (var11 == 0) {
                                    var12 = arg1.field8768[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field9597 = 0;
                                    var12.field9596 = 0;
                                    var12.field9591 = 1;
                                    var12.field9590 = 0;
                                    var12.field9592 = var8;
                                    class536.method3101(0, (byte) 123, var10, arg1.field9815, arg1.field9806, arg1.field9814, false);
                                } else if (var11 == 2) {
                                    var12.field9590 = 0;
                                }
                            } else if (var10.field2441 >= class357.field5338.method2099(var12.field9589, true).field2441) {
                                var12 = arg1.field8768[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class674 var13 = arg1.field8768[var9] = new class674();
                            var13.field9596 = 0;
                            var13.field9597 = 0;
                            var13.field9592 = var8;
                            var13.field9591 = 1;
                            var13.field9589 = var6;
                            var13.field9590 = 0;
                            class536.method3101(0, (byte) 127, var10, arg1.field9815, arg1.field9806, arg1.field9814, false);
                        }
                    }
                }
                var9++;
                var7 >>>= 0x1;
            }
        }
        field7157++;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(B)Z")
    public final boolean method2998(byte arg0) {
        if (arg0 <= 89) {
            this.field7154 = false;
        }
        if (this.field7153 == null) {
            if (class573.field8323 == null) {
                byte[] var2 = class459.method2753(8, 128, new class338(419684), 4.0F, 16.0F, 0.6F, 128, 4.0F, -118, 16, 0.5F);
                class573.field8323 = class515.method3039(false, var2, -1);
            }
            byte[] var3 = class682.method3830(false, 62, class573.field8323);
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
                        float var15 = (float) ((var3[(var13 - 1 & 0x7F) + var10] & 0xFF) - (var3[var10 + (var13 + 1 & 0x7F)] & 0xFF));
                        float var16 = (float) (128.0D / Math.sqrt((double) (var14 * var14 + var15 * var15 + 16384.0F)));
                        var4[var5++] = (byte) ((int) (var15 * var16 + 127.0F));
                        var4[var5++] = (byte) ((int) (var16 * 128.0F + 127.0F));
                        var4[var5++] = (byte) ((int) (var14 * var16 + 127.0F));
                        var4[var5++] = var3[var7++];
                    }
                }
            }
            this.field7153 = this.field7159.method2842(class121.field2214, var4, 128, 16, -15004, 128);
        }
        field7161++;
        return this.field7153 != null;
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Lcf;)V")
    public class504(class562 arg0) {
        this.field7159 = arg0;
        this.field7154 = this.field7159.field8171;
        if (this.field7154 && !this.field7159.method2871(class2.field372, class288.field4304, (byte) 127)) {
            this.field7154 = false;
        }
        if (this.field7154 || this.field7159.method2848(class2.field372, class288.field4304, (byte) -122)) {
            class293.method1958(128);
            if (this.field7154) {
                byte[] var6 = class682.method3830(false, -124, class202.field3114);
                this.field7155 = this.field7159.method2842(class288.field4304, var6, 128, 16, -15004, 128);
                byte[] var7 = class682.method3830(false, 124, class434.field6280);
                this.field7159.method2842(class288.field4304, var7, 128, 16, -15004, 128);
            } else {
                this.field7152 = new class190[16];
                for (int var2 = 0; var2 < 16; var2++) {
                    byte[] var5 = class575.method3299((byte) -102, var2 * 2 * 16384, class202.field3114, 32768);
                    this.field7152[var2] = this.field7159.method3259(128, var5, 128, true, class288.field4304, 0);
                }
                this.field7162 = new class190[16];
                for (int var3 = 0; var3 < 16; var3++) {
                    byte[] var4 = class575.method3299((byte) -101, var3 * 128 * 256, class434.field6280, 32768);
                    this.field7162[var3] = this.field7159.method3259(128, var4, 128, true, class288.field4304, 0);
                }
            }
        }
    }
}
