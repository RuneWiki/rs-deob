import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gp")
public abstract class class562 extends class108 {

    @OriginalMember(owner = "client!gp", name = "j", descriptor = "I")
    public int field7835 = 2;

    @OriginalMember(owner = "client!gp", name = "k", descriptor = "Z")
    public boolean field7836 = true;

    @OriginalMember(owner = "client!gp", name = "m", descriptor = "I")
    public int field7838 = 127;

    @OriginalMember(owner = "client!gp", name = "q", descriptor = "I")
    public int field7842 = 2;

    @OriginalMember(owner = "client!gp", name = "v", descriptor = "Z")
    public boolean field7847 = true;

    @OriginalMember(owner = "client!gp", name = "D", descriptor = "I")
    public int field7855 = 0;

    @OriginalMember(owner = "client!gp", name = "E", descriptor = "I")
    public int field7856 = 127;

    @OriginalMember(owner = "client!gp", name = "x", descriptor = "I")
    public int field7849 = 2;

    @OriginalMember(owner = "client!gp", name = "u", descriptor = "Z")
    public boolean field7846 = false;

    @OriginalMember(owner = "client!gp", name = "I", descriptor = "I")
    public int field7860 = 3;

    @OriginalMember(owner = "client!gp", name = "A", descriptor = "I")
    public int field7852 = 3;

    @OriginalMember(owner = "client!gp", name = "U", descriptor = "Z")
    public boolean field7872 = true;

    @OriginalMember(owner = "client!gp", name = "M", descriptor = "Z")
    public boolean field7864 = false;

    @OriginalMember(owner = "client!gp", name = "Q", descriptor = "Z")
    public boolean field7868 = true;

    @OriginalMember(owner = "client!gp", name = "w", descriptor = "Z")
    public boolean field7848 = true;

    @OriginalMember(owner = "client!gp", name = "K", descriptor = "I")
    public int field7862 = 1;

    @OriginalMember(owner = "client!gp", name = "z", descriptor = "I")
    public int field7851 = 127;

    @OriginalMember(owner = "client!gp", name = "r", descriptor = "Z")
    public boolean field7843 = true;

    @OriginalMember(owner = "client!gp", name = "S", descriptor = "I")
    public int field7870 = 0;

    @OriginalMember(owner = "client!gp", name = "V", descriptor = "Z")
    public boolean field7873 = true;

    @OriginalMember(owner = "client!gp", name = "Y", descriptor = "Z")
    public boolean field7876 = true;

    @OriginalMember(owner = "client!gp", name = "T", descriptor = "Z")
    public boolean field7871 = true;

    @OriginalMember(owner = "client!gp", name = "t", descriptor = "Z")
    public boolean field7845 = true;

    @OriginalMember(owner = "client!gp", name = "N", descriptor = "I")
    public int field7865 = 0;

    @OriginalMember(owner = "client!gp", name = "ab", descriptor = "I")
    public int field7878 = 0;

    @OriginalMember(owner = "client!gp", name = "C", descriptor = "I")
    public int field7854 = 2;

    @OriginalMember(owner = "client!gp", name = "X", descriptor = "Z")
    public boolean field7875 = true;

    @OriginalMember(owner = "client!gp", name = "G", descriptor = "I")
    public int field7858 = 0;

    @OriginalMember(owner = "client!gp", name = "Z", descriptor = "I")
    public int field7877 = 0;

    @OriginalMember(owner = "client!gp", name = "bb", descriptor = "Z")
    public boolean field7879 = true;

    @OriginalMember(owner = "client!gp", name = "s", descriptor = "I")
    public int field7844 = 0;

    @OriginalMember(owner = "client!gp", name = "cb", descriptor = "Z")
    public boolean field7880 = false;

    @OriginalMember(owner = "client!gp", name = "B", descriptor = "I")
    public static int field7853 = 0;

    @OriginalMember(owner = "client!gp", name = "J", descriptor = "I")
    public static int field7861 = 0;

    @OriginalMember(owner = "client!gp", name = "l", descriptor = "I")
    public static int field7837;

    @OriginalMember(owner = "client!gp", name = "n", descriptor = "I")
    public static int field7839;

    @OriginalMember(owner = "client!gp", name = "o", descriptor = "I")
    public static int field7840;

    @OriginalMember(owner = "client!gp", name = "p", descriptor = "I")
    public static int field7841;

    @OriginalMember(owner = "client!gp", name = "y", descriptor = "I")
    public static int field7850;

    @OriginalMember(owner = "client!gp", name = "H", descriptor = "I")
    public static int field7859;

    @OriginalMember(owner = "client!gp", name = "O", descriptor = "I")
    public static int field7866;

    @OriginalMember(owner = "client!gp", name = "P", descriptor = "I")
    public static int field7867;

    @OriginalMember(owner = "client!gp", name = "W", descriptor = "I")
    public static int field7874;

    @OriginalMember(owner = "client!gp", name = "F", descriptor = "Z")
    public boolean field7857;

    @OriginalMember(owner = "client!gp", name = "L", descriptor = "Z")
    public boolean field7863;

    @OriginalMember(owner = "client!gp", name = "R", descriptor = "Z")
    public boolean field7869;

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(III)V")
    public final void method3151(int arg0, int arg1, int arg2) {
        if (arg1 != 1) {
            this.field7836 = false;
        }
        if (class36.method221(-123, arg2)) {
            this.field7854 = arg0;
        } else {
            this.field7844 = arg0;
        }
        field7874++;
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(II)Z")
    public final boolean method3152(int arg0, int arg1) {
        field7866++;
        int var3 = -27 / ((-arg0 - 28) / 63);
        return class36.method221(-123, arg1) ? this.field7857 : this.field7863;
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(Ljda;B[[B)V")
    public static final void method3153(class277 arg0, byte arg1, byte[][] arg2) {
        if (arg1 != -2) {
            return;
        }
        field7850++;
        int[] var3 = new int[] { -1, 0, 0, 0, 0 };
        for (int var4 = 0; var4 < arg0.field1271; var4++) {
            class147.method802((byte) 49);
            for (int var5 = 0; var5 < (class139.field1760 >> 3); var5++) {
                for (int var6 = 0; var6 < class369.field5135 >> 3; var6++) {
                    int var7 = class270.field3439[var4][var5][var6];
                    if (var7 != -1) {
                        int var8 = var7 >> 24 & 0x3;
                        if (!arg0.field1257 || var8 == 0) {
                            int var9 = var7 >> 1 & 0x3;
                            int var10 = var7 >> 14 & 0x3FF;
                            int var11 = (var7 & 0x3FFE) >> 3;
                            int var12 = (var10 / 8 << 8) + var11 / 8;
                            for (int var13 = 0; var13 < class258.field3206.length; var13++) {
                                if (class258.field3206[var13] == var12 && arg2[var13] != null) {
                                    class551 var14 = new class551(arg2[var13]);
                                    arg0.method523(var8, var9, var10, var4, class15.field154, (byte) -55, var11, var5 * 8, var6 * 8, var14);
                                    arg0.method1707(var14, class301.field3918, var3[0] == -1 ? var3 : null, var11, var9, var8, var5 * 8, var4, var6 * 8, arg1 + 14548, var10);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (var3[0] != -1) {
            class466.field6615 = class1.field5.method1476(var3[3], var3[0], 0, class369.field5136, var3[2], var3[1]);
            class148.field1903 = var3[4];
        }
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(BII)V")
    public static final void method3154(byte arg0, int arg1, int arg2) {
        field7859++;
        if (class134.method708(-102, arg2)) {
            int var3 = 45 % ((arg0 - 70) / 55);
            class483.method2729(false, class508.field7087[arg2], arg1);
        }
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(IIZ)V")
    public final void method3155(int arg0, int arg1, boolean arg2) {
        if (arg1 < 119) {
            this.method3151(-17, 39, 27);
        }
        field7867++;
        if (class36.method221(-127, arg0)) {
            this.field7857 = arg2;
        } else {
            this.field7863 = arg2;
        }
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(B)V")
    public static final void method3156(byte arg0) {
        field7840++;
        if (class351.field4940 != null) {
            return;
        }
        class351.field4940 = new int[65536];
        double var1 = (Math.random() * 0.03D - 0.015D) + 0.7D;
        if (arg0 != -71) {
            field7853 = 111;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < 512; var4++) {
            float var5 = ((float) (var4 >> 3) / 64.0F + 0.0078125F) * 360.0F;
            float var6 = (float) (var4 & 0x7) / 8.0F + 0.0625F;
            for (int var7 = 0; var7 < 128; var7++) {
                float var8 = (float) var7 / 128.0F;
                float var9 = 0.0F;
                float var10 = 0.0F;
                float var11 = 0.0F;
                float var12 = var5 / 60.0F;
                int var13 = (int) var12;
                int var14 = var13 % 6;
                float var15 = (float) (-var13) + var12;
                float var16 = (1.0F - var6) * var8;
                float var17 = (1.0F - var6 * var15) * var8;
                float var18 = (1.0F - ((1.0F - var15) * var6)) * var8;
                if (var14 == 0) {
                    var11 = var16;
                    var10 = var18;
                    var9 = var8;
                } else if (var14 == 1) {
                    var10 = var8;
                    var9 = var17;
                    var11 = var16;
                } else if (var14 == 2) {
                    var11 = var18;
                    var10 = var8;
                    var9 = var16;
                } else if (var14 == 3) {
                    var11 = var8;
                    var9 = var16;
                    var10 = var17;
                } else if (var14 == 4) {
                    var9 = var18;
                    var10 = var16;
                    var11 = var8;
                } else if (var14 == 5) {
                    var10 = var16;
                    var9 = var8;
                    var11 = var17;
                }
                float var19 = (float) Math.pow((double) var9, var1);
                float var20 = (float) Math.pow((double) var10, var1);
                float var21 = (float) Math.pow((double) var11, var1);
                int var22 = (int) (var19 * 256.0F);
                int var23 = (int) (var20 * 256.0F);
                int var24 = (int) (var21 * 256.0F);
                int var25 = (var22 << 16) + var24 + (var23 << 8) - 16777216;
                class351.field4940[var3++] = var25;
            }
        }
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(ILge;)V")
    public final void method3157(int arg0, class551 arg1) {
        field7839++;
        arg1.method3060(18, -25098);
        arg1.method3060(this.field7860, -25098);
        arg1.method3060(this.field7848 ? 1 : 0, -25098);
        arg1.method3060(this.field7875 ? 1 : 0, -25098);
        arg1.method3060(this.field7843 ? 1 : 0, -25098);
        arg1.method3060(this.field7879 ? 1 : 0, -25098);
        arg1.method3060(0, -25098);
        if (arg0 <= 8) {
            return;
        }
        arg1.method3060(this.field7836 ? 1 : 0, -25098);
        arg1.method3060(this.field7868 ? 1 : 0, -25098);
        arg1.method3060(this.field7876 ? 1 : 0, -25098);
        arg1.method3060(this.field7854, -25098);
        arg1.method3060(this.field7844, -25098);
        arg1.method3060(this.field7857 ? 1 : 0, -25098);
        arg1.method3060(this.field7863 ? 1 : 0, -25098);
        arg1.method3060(this.field7873 ? 1 : 0, -25098);
        arg1.method3060(this.field7872 ? 1 : 0, -25098);
        arg1.method3060(this.field7855, -25098);
        arg1.method3060(this.field7845 ? 1 : 0, -25098);
        arg1.method3060(this.field7856, -25098);
        arg1.method3060(this.field7851, -25098);
        arg1.method3060(this.field7838, -25098);
        arg1.method3042(this.field7877, -64);
        arg1.method3042(this.field7878, 124);
        arg1.method3060(class83.method474((byte) -55), -25098);
        arg1.method3071(-48, this.field7870);
        arg1.method3060(this.field7835, -25098);
        arg1.method3060(this.field7846 ? 1 : 0, -25098);
        arg1.method3060(this.field7869 ? 1 : 0, -25098);
        arg1.method3060(this.field7865, -25098);
        arg1.method3060(this.field7864 ? 1 : 0, -25098);
        arg1.method3060(this.field7871 ? 1 : 0, -25098);
        arg1.method3060(this.field7862, -25098);
        arg1.method3060(this.field7847 ? 1 : 0, -25098);
        arg1.method3060(this.field7849, -25098);
        arg1.method3060(this.field7842, -25098);
        arg1.method3060(this.field7880 ? 1 : 0, -25098);
        arg1.method3060(this.field7852, -25098);
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(BLuda;)I")
    public static final int method3158(byte arg0, class509 arg1) {
        field7837++;
        int var2 = -69 / ((65 - arg0) / 58);
        if (class149.field1929 == arg1) {
            return 6407;
        } else if (class532.field7430 == arg1) {
            return 6408;
        } else if (class33.field495 == arg1) {
            return 6406;
        } else if (class145.field1885 == arg1) {
            return 6409;
        } else if (class250.field3134 == arg1) {
            return 6410;
        } else if (class344.field4775 == arg1) {
            return 6145;
        } else {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(IZ)I")
    public final int method3159(int arg0, boolean arg1) {
        if (!arg1) {
            method3158((byte) -61, null);
        }
        field7841++;
        return class36.method221(-122, arg0) ? this.field7854 : this.field7844;
    }
}
