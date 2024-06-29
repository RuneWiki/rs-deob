import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bu")
public class class19 extends class634 {

    @OriginalMember(owner = "client!bu", name = "K", descriptor = "I")
    private int field168 = 2000;

    @OriginalMember(owner = "client!bu", name = "J", descriptor = "I")
    private int field167 = 16;

    @OriginalMember(owner = "client!bu", name = "M", descriptor = "I")
    private int field170 = 4096;

    @OriginalMember(owner = "client!bu", name = "I", descriptor = "I")
    private int field166 = 0;

    @OriginalMember(owner = "client!bu", name = "H", descriptor = "I")
    private int field165 = 0;

    @OriginalMember(owner = "client!bu", name = "G", descriptor = "Z")
    public static boolean field164 = false;

    @OriginalMember(owner = "client!bu", name = "L", descriptor = "Lpia;")
    public static class94 field169 = new class94(49, -1);

    @OriginalMember(owner = "client!bu", name = "Q", descriptor = "Lpia;")
    public static class94 field174 = new class94(1, 7);

    @OriginalMember(owner = "client!bu", name = "R", descriptor = "[Ljava/lang/String;")
    public static String[] field175 = new String[200];

    @OriginalMember(owner = "client!bu", name = "T", descriptor = "[S")
    public static short[] field177 = new short[256];

    @OriginalMember(owner = "client!bu", name = "S", descriptor = "F")
    public static float field176;

    @OriginalMember(owner = "client!bu", name = "F", descriptor = "I")
    public static int field163;

    @OriginalMember(owner = "client!bu", name = "N", descriptor = "I")
    public static int field171;

    @OriginalMember(owner = "client!bu", name = "O", descriptor = "I")
    public static int field172;

    @OriginalMember(owner = "client!bu", name = "P", descriptor = "I")
    public static int field173;

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(Z)V")
    public static final void method86(boolean arg0) {
        ++field171;
        if (~class242.field2882 != 0 && class125.field1312 != -1) {
            int var1 = ((class34.field365 - class624.field8956) * class102.field1059 >> 16) + class624.field8956;
            class102.field1059 += var1;
            if (class102.field1059 < 65535) {
                class151.field1663 = false;
                class228.field2645 = false;
            } else {
                class102.field1059 = 65535;
                if (class151.field1663) {
                    class228.field2645 = false;
                } else {
                    class228.field2645 = true;
                }
                class151.field1663 = true;
            }
            float var2 = (float) class102.field1059 / 65535.0F;
            float[] var3 = new float[3];
            if (arg0) {
                method88((byte) 85);
            }
            int var4 = class535.field7742 * 2;
            for (int var5 = 0; ~var5 > -4; ++var5) {
                int var21 = class622.field8916[class242.field2882][var4][var5] * 3;
                int var22 = class622.field8916[class242.field2882][var4 - -1][var5] * 3;
                int var23 = (-class622.field8916[class242.field2882][var4 - -3][var5] - (-class622.field8916[class242.field2882][var4 - -2][var5] - class622.field8916[class242.field2882][var4 + 2][var5])) * 3;
                int var24 = class622.field8916[class242.field2882][var4][var5];
                int var25 = -var21 + var22;
                int var26 = var21 + var23 + -(var22 * 2);
                int var27 = var22 - var23 + class622.field8916[class242.field2882][var4 + 2][var5] + -var24;
                var3[var5] = (((float) var27 * var2 + (float) var26) * var2 + (float) var25) * var2 + (float) var24;
            }
            class204.field2409 = (int) var3[1] * -1;
            class590.field8319 = (int) var3[2] + -(class181.field2144 * 512);
            class167.field1855 = (int) var3[0] + -(class464.field6624 * 512);
            float[] var6 = new float[3];
            int var7 = class407.field5572 * 2;
            for (int var8 = 0; var8 < 3; ++var8) {
                int var14 = class622.field8916[class125.field1312][var7][var8] * 3;
                int var15 = class622.field8916[class125.field1312][var7 - -1][var8] * 3;
                int var16 = (class622.field8916[class125.field1312][var7 - -2][var8] + -class622.field8916[class125.field1312][var7 - -3][var8] + class622.field8916[class125.field1312][var7 + 2][var8]) * 3;
                int var17 = class622.field8916[class125.field1312][var7][var8];
                int var18 = -var14 + var15;
                int var19 = -(var15 * 2) + var14 + var16;
                int var20 = -var16 + -var17 + class622.field8916[class125.field1312][var7 - -2][var8] + var15;
                var6[var8] = (((float) var20 * var2 + (float) var19) * var2 + (float) var18) * var2 + (float) var17;
            }
            float var9 = var6[0] + -var3[0];
            float var10 = (var6[1] + -var3[1]) * -1.0F;
            float var11 = var6[2] - var3[2];
            double var12 = Math.sqrt((double) (var9 * var9 + var11 * var11));
            class27.field281 = 16383 & (int) (Math.atan2((double) var10, var12) * 2607.5945876176133D);
            class152.field1670 = (int) (-Math.atan2((double) var9, (double) var11) * 2607.5945876176133D) & 16383;
            class522.field7423 = class622.field8916[class242.field2882][var4][3] - -((class622.field8916[class242.field2882][var4 + 2][3] - class622.field8916[class242.field2882][var4][3]) * class102.field1059 >> 16);
        }
    }

    @OriginalMember(owner = "client!bu", name = "c", descriptor = "(B)V")
    public final void method87(byte arg0) {
        class581.method3345((byte) 89);
        if (arg0 < 65) {
            this.method87((byte) 103);
        }
        ++field173;
    }

    @OriginalMember(owner = "client!bu", name = "b", descriptor = "(BI)[I")
    public final int[] method13(byte arg0, int arg1) {
        if (arg0 > -55) {
            return null;
        } else {
            ++field163;
            int[] var3 = super.field9114.method1858(100, arg1);
            if (super.field9114.field3897) {
                int var4 = this.field170 >> 1;
                int[][] var5 = super.field9114.method1866((byte) 122);
                Random var6 = new Random((long) this.field165);
                for (int var7 = 0; ~var7 > ~this.field168; ++var7) {
                    int var8 = ~this.field170 >= -1 ? this.field166 : this.field166 + class661.method3763(this.field170, 30356, var6) - var4;
                    int var9 = 255 & var8 >> 4;
                    int var10 = class661.method3763(class635.field9139, 30356, var6);
                    int var11 = class661.method3763(class201.field2372, 30356, var6);
                    int var12 = var10 - -(class412.field5620[var9] * this.field167 >> 12);
                    int var13 = (class230.field2686[var9] * this.field167 >> 12) + var11;
                    int var14 = -var11 + var13;
                    int var15 = var12 - var10;
                    if (var15 != 0 || var14 != 0) {
                        if (var14 < 0) {
                            var14 = -var14;
                        }
                        if (~var15 > -1) {
                            var15 = -var15;
                        }
                        boolean var16 = ~var15 > ~var14;
                        if (var16) {
                            int var17 = var10;
                            var10 = var11;
                            int var18 = var12;
                            var12 = var13;
                            var11 = var17;
                            var13 = var18;
                        }
                        if (~var10 < ~var12) {
                            int var19 = var10;
                            var10 = var12;
                            int var20 = var11;
                            var11 = var13;
                            var12 = var19;
                            var13 = var20;
                        }
                        int var21 = var11;
                        int var22 = var12 - var10;
                        int var23 = var13 - var11;
                        int var24 = -var22 / 2;
                        int var25 = 2048 / var22;
                        int var26 = -(class661.method3763(4096, 30356, var6) >> 2) + 1024;
                        if (var23 < 0) {
                            var23 = -var23;
                        }
                        int var27 = ~var11 <= ~var13 ? -1 : 1;
                        for (int var28 = var10; ~var28 > ~var12; ++var28) {
                            int var29 = (var28 - var10) * var25 + (var26 - -1024);
                            int var30 = class110.field1162 & var28;
                            int var31 = class312.field3870 & var21;
                            var24 += var23;
                            if (var16) {
                                var5[var31][var30] = var29;
                            } else {
                                var5[var30][var31] = var29;
                            }
                            if (~var24 < -1) {
                                var21 += var27;
                                var24 += -var22;
                            }
                        }
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(ILig;Z)V")
    public final void method3(int arg0, class244 arg1, boolean arg2) {
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (arg0 != 2) {
                    if (~arg0 != -4) {
                        if (arg0 == 4) {
                            this.field170 = arg1.method1476(13);
                        }
                    } else {
                        this.field166 = arg1.method1476(-117);
                    }
                } else {
                    this.field167 = arg1.method1423(-127);
                }
            } else {
                this.field168 = arg1.method1476(33);
            }
        } else {
            this.field165 = arg1.method1423(-94);
        }
        ++field172;
        if (arg2) {
            field164 = false;
        }
    }

    @OriginalMember(owner = "client!bu", name = "d", descriptor = "(B)V")
    public static void method88(byte arg0) {
        field174 = null;
        field177 = null;
        field175 = null;
        if (arg0 != 81) {
            method86(true);
        }
        field169 = null;
    }

    @OriginalMember(owner = "client!bu", name = "<init>", descriptor = "()V")
    public class19() {
        super(0, true);
    }
}
