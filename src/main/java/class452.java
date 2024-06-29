import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class452 extends class314 {

    @OriginalMember(owner = "client!ef", name = "N", descriptor = "I")
    private int field6783 = 8;

    @OriginalMember(owner = "client!ef", name = "Q", descriptor = "I")
    private int field6786 = 0;

    @OriginalMember(owner = "client!ef", name = "R", descriptor = "I")
    private int field6787 = 1024;

    @OriginalMember(owner = "client!ef", name = "X", descriptor = "I")
    private int field6793 = 409;

    @OriginalMember(owner = "client!ef", name = "eb", descriptor = "I")
    private int field6800 = 81;

    @OriginalMember(owner = "client!ef", name = "bb", descriptor = "I")
    private int field6797 = 204;

    @OriginalMember(owner = "client!ef", name = "gb", descriptor = "I")
    private int field6802 = 4;

    @OriginalMember(owner = "client!ef", name = "hb", descriptor = "I")
    private int field6803 = 1024;

    @OriginalMember(owner = "client!ef", name = "S", descriptor = "[[B")
    public static byte[][] field6788 = new byte[1000][];

    @OriginalMember(owner = "client!ef", name = "L", descriptor = "I")
    private int field6781;

    @OriginalMember(owner = "client!ef", name = "M", descriptor = "I")
    private int field6782;

    @OriginalMember(owner = "client!ef", name = "O", descriptor = "I")
    public static int field6784;

    @OriginalMember(owner = "client!ef", name = "P", descriptor = "I")
    public static int field6785;

    @OriginalMember(owner = "client!ef", name = "U", descriptor = "I")
    public static int field6790;

    @OriginalMember(owner = "client!ef", name = "W", descriptor = "I")
    public static int field6792;

    @OriginalMember(owner = "client!ef", name = "Z", descriptor = "I")
    public static int field6795;

    @OriginalMember(owner = "client!ef", name = "ab", descriptor = "I")
    public static int field6796;

    @OriginalMember(owner = "client!ef", name = "cb", descriptor = "I")
    private int field6798;

    @OriginalMember(owner = "client!ef", name = "ib", descriptor = "I")
    public static int field6804;

    @OriginalMember(owner = "client!ef", name = "Y", descriptor = "Lf;")
    public static class702 field6794;

    @OriginalMember(owner = "client!ef", name = "db", descriptor = "Lri;")
    public static class97 field6799;

    @OriginalMember(owner = "client!ef", name = "V", descriptor = "[I")
    private int[] field6791;

    @OriginalMember(owner = "client!ef", name = "T", descriptor = "[[I")
    private int[][] field6789;

    @OriginalMember(owner = "client!ef", name = "fb", descriptor = "[[I")
    private int[][] field6801;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IBLie;Lk;)V")
    public static final void method2840(int arg0, byte arg1, class6 arg2, class525 arg3) {
        ++field6792;
        class318 var4 = new class318();
        var4.field4990 = arg2.method70(-9059);
        var4.field4988 = arg2.method72(-50);
        var4.field4989 = new class701[var4.field4990];
        var4.field4994 = new class701[var4.field4990];
        var4.field4984 = new byte[var4.field4990][][];
        if (arg1 == 35) {
            var4.field4991 = new int[var4.field4990];
            var4.field4982 = new int[var4.field4990];
            var4.field4993 = new int[var4.field4990];
            for (int var5 = 0; var5 < var4.field4990; ++var5) {
                try {
                    int var6 = arg2.method70(-9059);
                    if (~var6 != -1 && ~var6 != -2 && ~var6 != -3) {
                        if (~var6 == -4 || var6 == 4) {
                            String var7 = arg2.method42((byte) -35);
                            String var8 = arg2.method42((byte) -74);
                            int var9 = arg2.method70(arg1 + -9094);
                            String[] var10 = new String[var9];
                            for (int var11 = 0; var9 > var11; ++var11) {
                                var10[var11] = arg2.method42((byte) -27);
                            }
                            byte[][] var12 = new byte[var9][];
                            if (~var6 == -4) {
                                for (int var13 = 0; var13 < var9; ++var13) {
                                    int var14 = arg2.method72(arg1 + -87);
                                    var12[var13] = new byte[var14];
                                    arg2.method50(var12[var13], 0, var14, (byte) 19);
                                }
                            }
                            var4.field4982[var5] = var6;
                            Class[] var15 = new Class[var9];
                            for (int var16 = 0; var9 > var16; ++var16) {
                                var15[var16] = class38.method491(class357.method2397(arg1, 43), var10[var16]);
                            }
                            var4.field4994[var5] = arg3.method3170(var15, class38.method491(8, var7), var8, (byte) -67);
                            var4.field4984[var5] = var12;
                        }
                    } else {
                        String var17 = arg2.method42((byte) -92);
                        String var18 = arg2.method42((byte) -124);
                        int var19 = 0;
                        if (~var6 == -2) {
                            var19 = arg2.method72(-106);
                        }
                        var4.field4982[var5] = var6;
                        var4.field4993[var5] = var19;
                        var4.field4989[var5] = arg3.method3176(9, var18, class38.method491(8, var17));
                    }
                } catch (ClassNotFoundException var20) {
                    var4.field4991[var5] = -1;
                } catch (SecurityException var21) {
                    var4.field4991[var5] = -2;
                } catch (NullPointerException var22) {
                    var4.field4991[var5] = -3;
                } catch (Exception var23) {
                    var4.field4991[var5] = -4;
                } catch (Throwable var24) {
                    var4.field4991[var5] = -5;
                }
            }
            class89.field1077.method3463((byte) -87, var4);
        }
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(B)V")
    private final void method2841(byte arg0) {
        ++field6784;
        Random var2 = new Random((long) this.field6783);
        this.field6781 = this.field6800 / 2;
        this.field6782 = 4096 / this.field6802;
        if (arg0 < 30) {
            this.field6787 = -20;
        }
        this.field6798 = 4096 / this.field6783;
        int var3 = this.field6782 / 2;
        this.field6801 = new int[this.field6783][this.field6802];
        this.field6789 = new int[this.field6783][this.field6802 + 1];
        this.field6791 = new int[this.field6783 + 1];
        int var4 = this.field6798 / 2;
        this.field6791[0] = 0;
        for (int var5 = 0; this.field6783 > var5; ++var5) {
            if (var5 > 0) {
                int var6 = this.field6798;
                int var7 = (-2048 + class93.method902(8047, var2, 4096)) * this.field6797 >> 12;
                int var8 = (var4 * var7 >> 12) + var6;
                this.field6791[var5] = this.field6791[var5 + -1] + var8;
            }
            this.field6789[var5][0] = 0;
            for (int var9 = 0; ~var9 > ~this.field6802; ++var9) {
                if (var9 > 0) {
                    int var10 = this.field6782;
                    int var11 = (-2048 + class93.method902(8047, var2, 4096)) * this.field6793 >> 12;
                    int var12 = (var3 * var11 >> 12) + var10;
                    this.field6789[var5][var9] = this.field6789[var5][var9 + -1] + var12;
                }
                this.field6801[var5][var9] = this.field6803 <= 0 ? 4096 : 4096 + -class93.method902(8047, var2, this.field6803);
            }
            this.field6789[var5][this.field6802] = 4096;
        }
        this.field6791[this.field6783] = 4096;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(BLie;I)V")
    public final void method5(byte arg0, class6 arg1, int arg2) {
        if (arg0 >= -1) {
            method2840(-67, (byte) -93, (class6) null, (class525) null);
        }
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (arg2 != 2) {
                    if (~arg2 != -4) {
                        if (~arg2 != -5) {
                            if (~arg2 != -6) {
                                if (~arg2 != -7) {
                                    if (~arg2 == -8) {
                                        this.field6803 = arg1.method67(12021);
                                    }
                                } else {
                                    this.field6800 = arg1.method67(12021);
                                }
                            } else {
                                this.field6786 = arg1.method67(12021);
                            }
                        } else {
                            this.field6787 = arg1.method67(12021);
                        }
                    } else {
                        this.field6797 = arg1.method67(12021);
                    }
                } else {
                    this.field6793 = arg1.method67(12021);
                }
            } else {
                this.field6783 = arg1.method70(-9059);
            }
        } else {
            this.field6802 = arg1.method70(-9059);
        }
        ++field6785;
    }

    @OriginalMember(owner = "client!ef", name = "h", descriptor = "(I)V")
    public static final void method2842(int arg0) {
        class529.field7721.method144(class39.field529, class466.field6946, class81.field1008);
        if (arg0 != 459558252) {
            field6788 = null;
        }
        ++field6790;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(II)[I")
    public final int[] method6(int arg0, int arg1) {
        ++field6795;
        int[] var3 = super.field4928.method534((byte) -114, arg0);
        if (super.field4928.field618) {
            int var4 = 0;
            int var5;
            for (var5 = class657.field9166[arg0] + this.field6786; var5 < 0; var5 += 4096) {
            }
            while (~var5 < -4097) {
                var5 -= 4096;
            }
            while (var4 < this.field6783 && ~var5 <= ~this.field6791[var4]) {
                ++var4;
            }
            int var6 = var4 + -1;
            boolean var7 = ~(1 & var4) == -1;
            int var8 = this.field6791[var4];
            int var9 = this.field6791[var4 - 1];
            if (~(this.field6781 + var9) > ~var5 && -this.field6781 + var8 > var5) {
                for (int var10 = 0; ~class81.field1009 < ~var10; ++var10) {
                    int var11 = !var7 ? -this.field6787 : this.field6787;
                    int var12 = 0;
                    int var13;
                    for (var13 = (this.field6782 * var11 >> 12) + class328.field5091[var10]; ~var13 > -1; var13 += 4096) {
                    }
                    while (var13 > 4096) {
                        var13 -= 4096;
                    }
                    while (var12 < this.field6802 && ~var13 <= ~this.field6789[var6][var12]) {
                        ++var12;
                    }
                    int var14 = var12 + -1;
                    int var15 = this.field6789[var6][var12];
                    int var16 = this.field6789[var6][var14];
                    if (~var13 < ~(this.field6781 + var16) && ~var13 > ~(var15 - this.field6781)) {
                        var3[var10] = this.field6801[var6][var14];
                    } else {
                        var3[var10] = 0;
                    }
                }
            } else {
                class398.method2562(var3, 0, class81.field1009, 0);
            }
        }
        if (arg1 <= 109) {
            this.field6782 = 1;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ef", name = "<init>", descriptor = "()V")
    public class452() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ef", name = "i", descriptor = "(I)V")
    public static void method2843(int arg0) {
        field6799 = null;
        field6788 = null;
        field6794 = null;
        if (arg0 != 0) {
            field6788 = null;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(B)V")
    public final void method3(byte arg0) {
        ++field6804;
        if (arg0 != -15) {
            this.method2841((byte) -7);
        }
        this.method2841((byte) 97);
    }
}
