import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class257 extends class128 {

    @OriginalMember(owner = "client!fe", name = "P", descriptor = "I")
    private int field3907 = 1;

    @OriginalMember(owner = "client!fe", name = "T", descriptor = "[B")
    private byte[] field3911 = new byte[512];

    @OriginalMember(owner = "client!fe", name = "S", descriptor = "I")
    private int field3910 = 5;

    @OriginalMember(owner = "client!fe", name = "K", descriptor = "I")
    private int field3902 = 5;

    @OriginalMember(owner = "client!fe", name = "Q", descriptor = "[S")
    private short[] field3908 = new short[512];

    @OriginalMember(owner = "client!fe", name = "I", descriptor = "I")
    private int field3900 = 2048;

    @OriginalMember(owner = "client!fe", name = "W", descriptor = "I")
    private int field3914 = 0;

    @OriginalMember(owner = "client!fe", name = "V", descriptor = "I")
    private int field3913 = 2;

    @OriginalMember(owner = "client!fe", name = "O", descriptor = "Lvm;")
    public static class84 field3906 = new class84();

    @OriginalMember(owner = "client!fe", name = "H", descriptor = "I")
    public static int field3899;

    @OriginalMember(owner = "client!fe", name = "J", descriptor = "I")
    public static int field3901;

    @OriginalMember(owner = "client!fe", name = "L", descriptor = "I")
    public static int field3903;

    @OriginalMember(owner = "client!fe", name = "M", descriptor = "I")
    public static int field3904;

    @OriginalMember(owner = "client!fe", name = "N", descriptor = "I")
    public static int field3905;

    @OriginalMember(owner = "client!fe", name = "R", descriptor = "I")
    public static int field3909;

    @OriginalMember(owner = "client!fe", name = "U", descriptor = "I")
    public static int field3912;

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(B)V", line = 7)
    private final void method1861(byte arg0) {
        field3904++;
        Random var2 = new Random((long) this.field3914);
        this.field3908 = new short[512];
        if (this.field3900 > 0) {
            for (int var3 = 0; var3 < 512; var3++) {
                this.field3908[var3] = (short) class31.method189(this.field3900, 71, var2);
            }
        }
        if (arg0 < 21) {
            this.method107((class107) null, 91, 5);
        }
    }

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "(B)V", line = 38)
    public static void method1862(byte arg0) {
        field3906 = null;
        if (arg0 >= -72) {
            method1863((byte) -49, 11);
        }
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(Z)V", line = 49)
    public final void method130(boolean arg0) {
        this.field3911 = method1863((byte) -125, this.field3914);
        if (arg0) {
            method1862((byte) -122);
        }
        this.method1861((byte) 77);
        field3903++;
    }

    @OriginalMember(owner = "client!fe", name = "<init>", descriptor = "()V", line = 116)
    public class257() {
        super(0, true);
    }

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "(BI)[B", line = 70)
    public static final byte[] method1863(byte arg0, int arg1) {
        int var2 = -3 % ((-arg0 - 7) / 60);
        class252 var3 = (class252) class85.field1083.method1562(0, (long) arg1);
        field3905++;
        if (var3 == null) {
            byte[] var4 = new byte[512];
            Random var5 = new Random((long) arg1);
            for (int var6 = 0; var6 < 255; var6++) {
                var4[var6] = (byte) var6;
            }
            for (int var7 = 0; var7 < 255; var7++) {
                int var8 = 255 - var7;
                int var9 = class31.method189(var8, 127, var5);
                byte var10 = var4[var9];
                var4[var9] = var4[var8];
                var4[var8] = var4[511 - var7] = var10;
            }
            var3 = new class252(var4);
            class85.field1083.method1565((long) arg1, var3, (byte) 76);
        }
        return var3.field3831;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lp;II)V", line = 124)
    public final void method107(class107 arg0, int arg1, int arg2) {
        field3901++;
        if (arg1 == 0) {
            this.field3910 = this.field3902 = arg0.method661(-1);
        } else if (arg1 == 1) {
            this.field3914 = arg0.method661(-1);
        } else if (arg1 == 2) {
            this.field3900 = arg0.method624(14612);
        } else if (arg1 == 3) {
            this.field3913 = arg0.method661(-1);
        } else if (arg1 == 4) {
            this.field3907 = arg0.method661(-1);
        } else if (arg1 == 5) {
            this.field3910 = arg0.method661(-1);
        } else if (arg1 == 6) {
            this.field3902 = arg0.method661(-1);
        }
        if (arg2 >= -85) {
            this.field3911 = (byte[]) null;
        }
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(IB)V", line = 206)
    public static final void method1864(int arg0, byte arg1) {
        field3912++;
        int var2 = -126 % ((14 - arg1) / 58);
        class96 var3 = class141.method935(arg0, 12, 109);
        var3.method582(-1);
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(BI)[I", line = 231)
    public final int[] method126(byte arg0, int arg1) {
        if (arg0 < 100) {
            this.field3911 = (byte[]) null;
        }
        int[] var3 = this.field1748.method902(arg1, true);
        field3909++;
        if (this.field1748.field1878) {
            int var4 = (class49.field600[arg1] * this.field3902) + 2048;
            int var5 = var4 >> 12;
            int var6 = var5 + 1;
            for (int var7 = 0; var7 < class10.field141; var7++) {
                class152.field2093 = Integer.MAX_VALUE;
                class62.field772 = Integer.MAX_VALUE;
                class185.field2673 = Integer.MAX_VALUE;
                class183.field2639 = Integer.MAX_VALUE;
                int var8 = (class334.field5157[var7] * this.field3910) + 2048;
                int var9 = var8 >> 12;
                int var10 = var9 + 1;
                for (int var11 = var5 - 1; var11 <= var6; var11++) {
                    int var12 = this.field3911[(this.field3902 <= var11 ? var11 - this.field3902 : var11) & 0xFF] & 0xFF;
                    for (int var13 = var9 - 1; var13 <= var10; var13++) {
                        int var14 = (this.field3911[var12 + (this.field3910 > var13 ? var13 : var13 - this.field3910) & 0xFF] & 0xFF) * 2;
                        int var10000 = -(var13 << 12);
                        int var27 = var14 + 1;
                        int var15 = var10000 + var8 - this.field3908[var14];
                        int var16 = var4 - (var11 << 12) - this.field3908[var27];
                        int var17 = this.field3907;
                        int var18;
                        if (var17 == 1) {
                            var18 = var15 * var15 + var16 * var16 >> 12;
                        } else if (var17 == 3) {
                            int var19 = var16 < 0 ? -var16 : var16;
                            int var20 = var15 < 0 ? -var15 : var15;
                            var18 = var19 < var20 ? var20 : var19;
                        } else if (var17 == 4) {
                            int var23 = (int) (Math.sqrt((double) ((float) (var15 < 0 ? -var15 : var15) / 4096.0F)) * 4096.0D);
                            int var24 = (int) (Math.sqrt((double) ((float) (var16 >= 0 ? var16 : -var16) / 4096.0F)) * 4096.0D);
                            int var25 = var23 + var24;
                            var18 = var25 * var25 >> 12;
                        } else if (var17 == 5) {
                            int var21 = var16 * var16;
                            int var22 = var15 * var15;
                            var18 = (int) (Math.sqrt(Math.sqrt((double) ((float) (var21 + var22) / 1.6777216E7F))) * 4096.0D);
                        } else if (var17 == 2) {
                            var18 = (var15 < 0 ? -var15 : var15) + (var16 < 0 ? -var16 : var16);
                        } else {
                            var18 = (int) (Math.sqrt((double) ((float) (var15 * var15 + var16 * var16) / 1.6777216E7F)) * 4096.0D);
                        }
                        if (var18 < class183.field2639) {
                            class152.field2093 = class62.field772;
                            class62.field772 = class185.field2673;
                            class185.field2673 = class183.field2639;
                            class183.field2639 = var18;
                        } else if (class185.field2673 > var18) {
                            class152.field2093 = class62.field772;
                            class62.field772 = class185.field2673;
                            class185.field2673 = var18;
                        } else if (var18 < class62.field772) {
                            class152.field2093 = class62.field772;
                            class62.field772 = var18;
                        } else if (class152.field2093 > var18) {
                            class152.field2093 = var18;
                        }
                    }
                }
                int var26 = this.field3913;
                if (var26 == 0) {
                    var3[var7] = class183.field2639;
                } else if (var26 == 1) {
                    var3[var7] = class185.field2673;
                } else if (var26 == 3) {
                    var3[var7] = class62.field772;
                } else if (var26 == 4) {
                    var3[var7] = class152.field2093;
                } else if (var26 == 2) {
                    var3[var7] = class185.field2673 - class183.field2639;
                }
            }
        }
        return var3;
    }
}
