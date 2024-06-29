import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class289 {

    @OriginalMember(owner = "client!t", name = "b", descriptor = "[B")
    private byte[] field4790;

    @OriginalMember(owner = "client!t", name = "c", descriptor = "[I")
    private int[] field4791;

    @OriginalMember(owner = "client!t", name = "h", descriptor = "[I")
    private int[] field4796;

    @OriginalMember(owner = "client!t", name = "e", descriptor = "[I")
    public static int[] field4793 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "client!t", name = "d", descriptor = "I")
    public static int field4792 = -2;

    @OriginalMember(owner = "client!t", name = "j", descriptor = "Lce;")
    public static class126 field4798 = class206.method1445(-7923, "Objet d(Wabonn-Bs");

    @OriginalMember(owner = "client!t", name = "k", descriptor = "I")
    public static int field4799 = -1;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "I")
    public static int field4789;

    @OriginalMember(owner = "client!t", name = "f", descriptor = "I")
    public static int field4794;

    @OriginalMember(owner = "client!t", name = "g", descriptor = "I")
    public static int field4795;

    @OriginalMember(owner = "client!t", name = "l", descriptor = "I")
    public static int field4800;

    @OriginalMember(owner = "client!t", name = "i", descriptor = "Lsg;")
    public static class164 field4797;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Lbb;I)V", line = 18)
    public static final void method1917(class134 arg0, int arg1) {
        if (arg1 < 2) {
            method1919(7, 68, 61, true, 71, -70, 57);
        }
        while (true) {
            while (arg0.field2299 < arg0.field2282.length) {
                int var2 = 0;
                boolean var3 = false;
                int var4 = 0;
                if (arg0.method948(-123) == 1) {
                    var2 = arg0.method948(-124);
                    var4 = arg0.method948(-122);
                    var3 = true;
                }
                int var5 = arg0.method948(-122);
                int var6 = arg0.method948(-122);
                int var7 = class306.field5140 + class143.field2602 - (var6 * 64) - 1;
                int var8 = var5 * 64 - class220.field3702;
                if (var8 >= 0 && (var7 - 63) >= 0 && var8 + 63 < class36.field521 && class143.field2602 > var7) {
                    int var9 = var8 >> 6;
                    int var10 = var7 >> 6;
                    for (int var11 = 0; var11 < 64; var11++) {
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var3 || var11 >= (var2 * 8) && var11 < (var2 * 8 + 8) && (var4 * 8) <= var12 && var4 * 8 + 8 > var12) {
                                byte var13 = arg0.method977(19773);
                                if (var13 != 0) {
                                    if (class273.field4599[var9][var10] == null) {
                                        class273.field4599[var9][var10] = new byte[4096];
                                    }
                                    class273.field4599[var9][var10][(63 - var12 << 6) + var11] = var13;
                                    byte var14 = arg0.method977(19773);
                                    if (class48.field748[var9][var10] == null) {
                                        class48.field748[var9][var10] = new byte[4096];
                                    }
                                    class48.field748[var9][var10][(63 - var12 << 6) + var11] = var14;
                                }
                            }
                        }
                    }
                } else {
                    for (int var15 = 0; var15 < (var3 ? 64 : 4096); var15++) {
                        byte var16 = arg0.method977(19773);
                        if (var16 != 0) {
                            arg0.field2299++;
                        }
                    }
                }
            }
            field4800++;
            return;
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "([BI[BIIB)I", line = 130)
    public final int method1918(byte[] arg0, int arg1, byte[] arg2, int arg3, int arg4, byte arg5) {
        int var7 = 0;
        int var8 = arg3 << 3;
        field4789++;
        int var9 = arg1 + arg4;
        while (arg4 < var9) {
            int var10 = arg2[arg4] & 0xFF;
            byte var11 = this.field4790[var10];
            int var12 = this.field4796[var10];
            if (var11 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var8 >> 3;
            int var14 = var8 & 0x7;
            int var15 = var13 + (var11 + var14 - 1 >> 3);
            int var16 = var7 & -var14 >> 31;
            int var18 = var14 + 24;
            arg0[var13] = (byte) (var7 = class221.method1516(var16, var12 >>> var18));
            if (var15 > var13) {
                var14 = var18 - 8;
                var13++;
                arg0[var13] = (byte) (var7 = var12 >>> var14);
                if (var15 > var13) {
                    var14 -= 8;
                    var13++;
                    arg0[var13] = (byte) (var7 = var12 >>> var14);
                    if (var15 > var13) {
                        var14 -= 8;
                        var13++;
                        arg0[var13] = (byte) (var7 = var12 >>> var14);
                        if (var13 < var15) {
                            var14 -= 8;
                            var13++;
                            arg0[var13] = (byte) (var7 = var12 << -var14);
                        }
                    }
                }
            }
            var8 += var11;
            arg4++;
        }
        int var17 = -115 / ((arg5 + 75) / 33);
        return (var8 + 7 >> 3) - arg3;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IIIZIII)V", line = 200)
    public static final void method1919(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        class214.field3642 = arg0;
        class91.field1439 = arg2;
        class68.field1116 = arg4;
        class207.field3553 = arg6;
        if (arg1 != 0) {
            field4798 = (class126) null;
        }
        field4794++;
        class207.field3556 = arg5;
        if (arg3 && class207.field3553 >= 100) {
            class223.field3755 = class91.field1439 * 128 + 64;
            class152.field2780 = class207.field3556 * 128 + 64;
            class143.field2600 = class174.method1265(class223.field3755, arg1 + 8100, class131.field2250, class152.field2780) - class68.field1116;
        }
        class254.field4261 = 2;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(B)V", line = 226)
    public static void method1920(byte arg0) {
        field4798 = null;
        field4797 = null;
        if (arg0 != 69) {
            field4797 = (class164) null;
        }
        field4793 = null;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(I[BI[BII)I", line = 244)
    public final int method1921(int arg0, byte[] arg1, int arg2, byte[] arg3, int arg4, int arg5) {
        field4795++;
        if (arg0 == 0) {
            return 0;
        }
        int var7 = arg0 + arg2;
        int var8 = 0;
        int var9 = arg5;
        int var10 = 10 / ((31 - arg4) / 43);
        while (true) {
            byte var11 = arg3[var9];
            if (var11 >= 0) {
                var8++;
            } else {
                var8 = this.field4791[var8];
            }
            int var12;
            if ((var12 = this.field4791[var8]) < 0) {
                arg1[arg2++] = (byte) (~var12);
                if (var7 <= arg2) {
                    break;
                }
                var8 = 0;
            }
            if ((var11 & 0x40) == 0) {
                var8++;
            } else {
                var8 = this.field4791[var8];
            }
            int var13;
            if ((var13 = this.field4791[var8]) < 0) {
                arg1[arg2++] = (byte) (~var13);
                if (var7 <= arg2) {
                    break;
                }
                var8 = 0;
            }
            if ((var11 & 0x20) == 0) {
                var8++;
            } else {
                var8 = this.field4791[var8];
            }
            int var14;
            if ((var14 = this.field4791[var8]) < 0) {
                arg1[arg2++] = (byte) (~var14);
                if (arg2 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var11 & 0x10) == 0) {
                var8++;
            } else {
                var8 = this.field4791[var8];
            }
            int var15;
            if ((var15 = this.field4791[var8]) < 0) {
                arg1[arg2++] = (byte) (~var15);
                if (arg2 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var11 & 0x8) == 0) {
                var8++;
            } else {
                var8 = this.field4791[var8];
            }
            int var16;
            if ((var16 = this.field4791[var8]) < 0) {
                arg1[arg2++] = (byte) (~var16);
                if (var7 <= arg2) {
                    break;
                }
                var8 = 0;
            }
            if ((var11 & 0x4) == 0) {
                var8++;
            } else {
                var8 = this.field4791[var8];
            }
            int var17;
            if ((var17 = this.field4791[var8]) < 0) {
                arg1[arg2++] = (byte) (~var17);
                if (arg2 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var11 & 0x2) == 0) {
                var8++;
            } else {
                var8 = this.field4791[var8];
            }
            int var18;
            if ((var18 = this.field4791[var8]) < 0) {
                arg1[arg2++] = (byte) (~var18);
                if (var7 <= arg2) {
                    break;
                }
                var8 = 0;
            }
            if ((var11 & 0x1) == 0) {
                var8++;
            } else {
                var8 = this.field4791[var8];
            }
            int var19;
            if ((var19 = this.field4791[var8]) < 0) {
                arg1[arg2++] = (byte) (~var19);
                if (arg2 >= var7) {
                    break;
                }
                var8 = 0;
            }
            var9++;
        }
        return var9 + 1 - arg5;
    }

    @OriginalMember(owner = "client!t", name = "<init>", descriptor = "([B)V", line = 399)
    public class289(byte[] arg0) {
        int var2 = arg0.length;
        this.field4790 = arg0;
        this.field4791 = new int[8];
        int[] var3 = new int[33];
        int var4 = 0;
        this.field4796 = new int[var2];
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field4796[var5] = var8;
                int var12;
                if ((var8 & var7) == 0) {
                    for (int var9 = var6 - 1; var9 >= 1; var9--) {
                        int var10 = var3[var9];
                        if (var8 != var10) {
                            break;
                        }
                        int var11 = 0x1 << 32 - var9;
                        if ((var11 & var10) != 0) {
                            var3[var9] = var3[var9 - 1];
                            break;
                        }
                        var3[var9] = class221.method1516(var10, var11);
                    }
                    var12 = var7 | var8;
                } else {
                    var12 = var3[var6 - 1];
                }
                var3[var6] = var12;
                for (int var13 = var6 + 1; var13 <= 32; var13++) {
                    if (var3[var13] == var8) {
                        var3[var13] = var12;
                    }
                }
                int var14 = 0;
                for (int var15 = 0; var15 < var6; var15++) {
                    int var16 = Integer.MIN_VALUE >>> var15;
                    if ((var16 & var8) == 0) {
                        var14++;
                    } else {
                        if (this.field4791[var14] == 0) {
                            this.field4791[var14] = var4;
                        }
                        var14 = this.field4791[var14];
                    }
                    int var17 = var16 >>> 1;
                    if (this.field4791.length <= var14) {
                        int[] var18 = new int[this.field4791.length * 2];
                        for (int var19 = 0; var19 < this.field4791.length; var19++) {
                            var18[var19] = this.field4791[var19];
                        }
                        this.field4791 = var18;
                    }
                }
                if (var4 <= var14) {
                    var4 = var14 + 1;
                }
                this.field4791[var14] = ~var5;
            }
        }
    }
}
