import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class422 {

    @OriginalMember(owner = "client!ce", name = "f", descriptor = "I")
    private int field5843 = -1;

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "Z")
    public boolean field5840 = true;

    @OriginalMember(owner = "client!ce", name = "h", descriptor = "Lgf;")
    private class663 field5845;

    @OriginalMember(owner = "client!ce", name = "p", descriptor = "Lpga;")
    private class492 field5853;

    @OriginalMember(owner = "client!ce", name = "k", descriptor = "I")
    private int field5848;

    @OriginalMember(owner = "client!ce", name = "l", descriptor = "I")
    private int field5849;

    @OriginalMember(owner = "client!ce", name = "o", descriptor = "Loia;")
    private class51 field5852;

    @OriginalMember(owner = "client!ce", name = "i", descriptor = "I")
    public int field5846;

    @OriginalMember(owner = "client!ce", name = "q", descriptor = "I")
    private int field5854;

    @OriginalMember(owner = "client!ce", name = "g", descriptor = "I")
    private int field5844;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "Lho;")
    private class212 field5838;

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "I")
    public static int field5839;

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "I")
    public static int field5841;

    @OriginalMember(owner = "client!ce", name = "e", descriptor = "I")
    public static int field5842;

    @OriginalMember(owner = "client!ce", name = "j", descriptor = "I")
    public static int field5847;

    @OriginalMember(owner = "client!ce", name = "n", descriptor = "I")
    public static int field5851;

    @OriginalMember(owner = "client!ce", name = "m", descriptor = "[I")
    public static int[] field5850;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(I)V", line = 8)
    public final void method2574(int arg0) {
        this.method2576(this.field5838, arg0 + arg0, this.field5846);
        field5842++;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIB)V", line = 20)
    public static final void method2575(int arg0, int arg1, byte arg2) {
        field5841++;
        if (class736.field10292 != 0) {
            if (arg1 >= 0) {
                class169.field2314[arg1] = arg0;
            } else {
                for (int var3 = 0; var3 < 16; var3++) {
                    class169.field2314[var3] = arg0;
                }
            }
        }
        int var4 = 19 % ((-arg2 - 15) / 61);
        class336.field4314.method2308(arg0, arg1, -17);
    }

    @OriginalMember(owner = "client!ce", name = "<init>", descriptor = "(Lpga;Lgf;Lsba;IIIII)V", line = 260)
    public class422(class492 arg0, class663 arg1, class556 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field5845 = arg1;
        this.field5853 = arg0;
        this.field5848 = arg7;
        this.field5849 = arg6;
        int var9 = 0x1 << arg5;
        int var10 = 0;
        int var11 = arg3 << arg5;
        int var12 = arg4 << arg5;
        for (int var13 = 0; var13 < var9; var13++) {
            int var29 = (var12 + var13) * arg2.field4344 + var11;
            for (int var30 = 0; var30 < var9; var30++) {
                short[] var31 = arg2.field7873[var29++];
                if (var31 != null) {
                    var10 += var31.length;
                }
            }
        }
        if (var10 <= 0) {
            this.field5852 = null;
            this.field5846 = 0;
        } else {
            this.field5854 = Integer.MAX_VALUE;
            this.field5844 = Integer.MIN_VALUE;
            this.field5838 = this.field5853.method634(false, true);
            this.field5838.method1399(var10, true);
            for (int var14 = 0; var14 < 4; var14++) {
                Buffer var15 = this.field5838.method1401(true, 103);
                if (var15 != null) {
                    Stream var16 = this.field5853.method2917(var15, false);
                    if (Stream.method2541()) {
                        for (int var17 = 0; var17 < var9; var17++) {
                            int var18 = (var12 + var17) * arg2.field4344 + var11;
                            for (int var19 = 0; var19 < var9; var19++) {
                                short[] var20 = arg2.field7873[var18++];
                                if (var20 != null) {
                                    for (int var21 = 0; var21 < var20.length; var21++) {
                                        int var22 = var20[var21] & 0xFFFF;
                                        if (this.field5844 < var22) {
                                            this.field5844 = var22;
                                        }
                                        if (var22 < this.field5854) {
                                            this.field5854 = var22;
                                        }
                                        var16.method2554(var22);
                                    }
                                }
                            }
                        }
                    } else {
                        for (int var23 = 0; var23 < var9; var23++) {
                            int var24 = (var12 + var23) * arg2.field4344 + var11;
                            for (int var25 = 0; var25 < var9; var25++) {
                                short[] var26 = arg2.field7873[var24++];
                                if (var26 != null) {
                                    for (int var27 = 0; var27 < var26.length; var27++) {
                                        int var28 = var26[var27] & 0xFFFF;
                                        if (this.field5854 > var28) {
                                            this.field5854 = var28;
                                        }
                                        if (var28 > this.field5844) {
                                            this.field5844 = var28;
                                        }
                                        var16.method2544(var28);
                                    }
                                }
                            }
                        }
                    }
                    var16.method2551();
                    if (this.field5838.method1400(false)) {
                        break;
                    }
                }
            }
            this.field5846 = var10 / 3;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lho;II)V", line = 54)
    public final void method2576(class212 arg0, int arg1, int arg2) {
        field5847++;
        if (arg1 != 0) {
            this.field5849 = -116;
        }
        if (arg2 > 0) {
            this.method2577((byte) 117);
            this.field5853.method2933((byte) 106, this.field5852);
            this.field5853.method612(class756.field10497, 0, this.field5854, true, this.field5844 + 1 - this.field5854, arg0, arg2);
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(B)V", line = 72)
    private final void method2577(byte arg0) {
        field5851++;
        if (!this.field5840) {
            return;
        }
        this.field5840 = false;
        if (arg0 <= 113) {
            return;
        }
        byte[] var2 = this.field5845.field9351;
        int var3 = 0;
        int var4 = this.field5845.field9347;
        int var5 = this.field5849 + (this.field5845.field9347 * this.field5848);
        for (int var6 = -128; var6 < 0; var6++) {
            var3 = (var3 << 8) - var3;
            for (int var17 = -128; var17 < 0; var17++) {
                if (var2[var5++] != 0) {
                    var3++;
                }
            }
            var5 += var4 - 128;
        }
        if (this.field5852 != null && this.field5843 == var3) {
            this.field5840 = false;
            return;
        }
        this.field5843 = var3;
        int var7 = 0;
        int var8 = this.field5849 + (this.field5848 * var4);
        if (!this.field5853.method616(class197.field2845, class720.field10164, (byte) 64)) {
            if (class173.field2366 == null) {
                class173.field2366 = new int[16384];
            }
            int[] var13 = class173.field2366;
            for (int var14 = -128; var14 < 0; var14++) {
                for (int var15 = -128; var15 < 0; var15++) {
                    if (var2[var8] == 0) {
                        int var16 = 0;
                        if (var2[var8 - 1] != 0) {
                            var16++;
                        }
                        if (var2[var8 + 1] != 0) {
                            var16++;
                        }
                        if (var2[var8 - var4] != 0) {
                            var16++;
                        }
                        if (var2[var8 + var4] != 0) {
                            var16++;
                        }
                        var13[var7++] = var16 * 17 << 24;
                    } else {
                        var13[var7++] = 1140850688;
                    }
                    var8++;
                }
                var8 += this.field5845.field9347 - 128;
            }
            if (this.field5852 == null) {
                this.field5852 = this.field5853.method2936(false, 128, 128, class173.field2366, (byte) 103);
                this.field5852.method355(false, (byte) -120, false);
            } else {
                this.field5852.method347(0, 128, 0, -2668, 0, 128, class173.field2366, 128);
            }
            return;
        }
        if (class102.field1464 == null) {
            class102.field1464 = new byte[16384];
        }
        byte[] var9 = class102.field1464;
        for (int var10 = -128; var10 < 0; var10++) {
            for (int var11 = -128; var11 < 0; var11++) {
                if (var2[var8] == 0) {
                    int var12 = 0;
                    if (var2[var8 - 1] != 0) {
                        var12++;
                    }
                    if (var2[var8 + 1] != 0) {
                        var12++;
                    }
                    if (var2[var8 - var4] != 0) {
                        var12++;
                    }
                    if (var2[var8 + var4] != 0) {
                        var12++;
                    }
                    var9[var7++] = (byte) (var12 * 17);
                } else {
                    var9[var7++] = 68;
                }
                var8++;
            }
            var8 += this.field5845.field9347 - 128;
        }
        if (this.field5852 == null) {
            this.field5852 = this.field5853.method2883(false, 128, 128, (byte) -96, class102.field1464, class197.field2845);
            this.field5852.method355(false, (byte) -109, false);
        } else {
            this.field5852.method352(class102.field1464, 0, class197.field2845, 0, 0, 128, 128, 16288, 128);
        }
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(B)V", line = 245)
    public static void method2578(byte arg0) {
        field5850 = null;
        int var1 = 79 / ((56 - arg0) / 53);
    }
}
