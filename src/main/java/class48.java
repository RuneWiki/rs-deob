import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class48 {

    @OriginalMember(owner = "client!pj", name = "d", descriptor = "[I")
    private int[] field845;

    @OriginalMember(owner = "client!pj", name = "l", descriptor = "[I")
    private int[] field853;

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "[B")
    private byte[] field843;

    @OriginalMember(owner = "client!pj", name = "i", descriptor = "Lmb;")
    public static class96 field850 = class243.method1708(":duelstake:", (byte) 108);

    @OriginalMember(owner = "client!pj", name = "e", descriptor = "Lmb;")
    public static class96 field846 = class243.method1708("Hierhin gehen", (byte) 95);

    @OriginalMember(owner = "client!pj", name = "n", descriptor = "Lmb;")
    public static class96 field855 = class243.method1708("um", (byte) 115);

    @OriginalMember(owner = "client!pj", name = "j", descriptor = "I")
    public static int field851 = -1;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "I")
    public static int field842;

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "I")
    public static int field844;

    @OriginalMember(owner = "client!pj", name = "g", descriptor = "I")
    public static int field848;

    @OriginalMember(owner = "client!pj", name = "h", descriptor = "I")
    public static int field849;

    @OriginalMember(owner = "client!pj", name = "m", descriptor = "I")
    public static int field854;

    @OriginalMember(owner = "client!pj", name = "o", descriptor = "I")
    public static int field856;

    @OriginalMember(owner = "client!pj", name = "f", descriptor = "Lw;")
    public static class107 field847;

    @OriginalMember(owner = "client!pj", name = "k", descriptor = "Lff;")
    public static class3 field852;

    @OriginalMember(owner = "client!pj", name = "p", descriptor = "[[[B")
    public static byte[][][] field857;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(I)V")
    public static void method368(int arg0) {
        if (arg0 != 3194) {
            return;
        }
        field847 = null;
        field855 = null;
        field850 = null;
        field846 = null;
        field852 = null;
        field857 = null;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IZ)V")
    public static final void method369(int arg0, boolean arg1) {
        class19.field319 = 1000 / arg0;
        if (arg1) {
            field857 = null;
        }
        field854++;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lkg;")
    public static final class99 method370(Throwable arg0, String arg1) {
        field842++;
        class99 var2;
        if (arg0 instanceof class99) {
            var2 = (class99) arg0;
            var2.field1677 = var2.field1677 + ' ' + arg1;
        } else {
            var2 = new class99(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIIZ[B[B)I")
    public final int method371(int arg0, int arg1, int arg2, boolean arg3, byte[] arg4, byte[] arg5) {
        field856++;
        if (arg0 == 0) {
            return 0;
        }
        if (arg3) {
            method370((Throwable) null, (String) null);
        }
        int var7 = 0;
        int var8 = arg0 + arg1;
        int var9 = arg2;
        while (true) {
            byte var10 = arg5[var9];
            if (var10 < 0) {
                var7 = this.field853[var7];
            } else {
                var7++;
            }
            int var11;
            if ((var11 = this.field853[var7]) < 0) {
                arg4[arg1++] = (byte) (~var11);
                if (arg1 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var7++;
            } else {
                var7 = this.field853[var7];
            }
            int var12;
            if ((var12 = this.field853[var7]) < 0) {
                arg4[arg1++] = (byte) (~var12);
                if (arg1 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var7++;
            } else {
                var7 = this.field853[var7];
            }
            int var13;
            if ((var13 = this.field853[var7]) < 0) {
                arg4[arg1++] = (byte) (~var13);
                if (arg1 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var7++;
            } else {
                var7 = this.field853[var7];
            }
            int var14;
            if ((var14 = this.field853[var7]) < 0) {
                arg4[arg1++] = (byte) (~var14);
                if (var8 <= arg1) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var7++;
            } else {
                var7 = this.field853[var7];
            }
            int var15;
            if ((var15 = this.field853[var7]) < 0) {
                arg4[arg1++] = (byte) (~var15);
                if (var8 <= arg1) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var7++;
            } else {
                var7 = this.field853[var7];
            }
            int var16;
            if ((var16 = this.field853[var7]) < 0) {
                arg4[arg1++] = (byte) (~var16);
                if (arg1 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var7++;
            } else {
                var7 = this.field853[var7];
            }
            int var17;
            if ((var17 = this.field853[var7]) < 0) {
                arg4[arg1++] = (byte) (~var17);
                if (arg1 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var7++;
            } else {
                var7 = this.field853[var7];
            }
            int var18;
            if ((var18 = this.field853[var7]) < 0) {
                arg4[arg1++] = (byte) (~var18);
                if (arg1 >= var8) {
                    break;
                }
                var7 = 0;
            }
            var9++;
        }
        return var9 + 1 - arg2;
    }

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "(I)[Lmj;")
    public static final class246[] method372(int arg0) {
        class246[] var1 = new class246[class252.field4368];
        field849++;
        for (int var2 = 0; var2 < class252.field4368; var2++) {
            byte[] var3 = class217.field3724[var2];
            int var4 = class31.field490[var2] * class170.field2982[var2];
            if (class180.field3113[var2]) {
                byte[] var7 = class163.field2894[var2];
                int[] var8 = new int[var4];
                for (int var9 = 0; var9 < var4; var9++) {
                    var8[var9] = class45.method348(class139.field2492[class130.method985(255, var3[var9])], class130.method985(255, var7[var9]) << 24);
                }
                var1[var2] = new class142(class249.field4309, class109.field2019, class241.field4187[var2], class176.field3064[var2], class31.field490[var2], class170.field2982[var2], var8);
            } else {
                int[] var5 = new int[var4];
                for (int var6 = 0; var6 < var4; var6++) {
                    var5[var6] = class139.field2492[class130.method985(var3[var6], 255)];
                }
                var1[var2] = new class174(class249.field4309, class109.field2019, class241.field4187[var2], class176.field3064[var2], class31.field490[var2], class170.field2982[var2], var5);
            }
        }
        if (arg0 != 14933) {
            method372(-81);
        }
        class192.method1344(0);
        return var1;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(II[BBI[B)I")
    public final int method373(int arg0, int arg1, byte[] arg2, byte arg3, int arg4, byte[] arg5) {
        field848++;
        if (arg3 > -18) {
            return 56;
        }
        int var7 = arg1 + arg4;
        int var8 = arg0 << 3;
        int var9 = 0;
        while (arg4 < var7) {
            int var10 = arg5[arg4] & 0xFF;
            int var11 = this.field845[var10];
            byte var12 = this.field843[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var8 >> 3;
            int var14 = var8 & 0x7;
            int var15 = var9 & -var14 >> 31;
            var8 += var12;
            int var16 = var13 + (var14 + var12 - 1 >> 3);
            int var17 = var14 + 24;
            arg2[var13] = (byte) (var9 = class45.method348(var15, var11 >>> var17));
            if (var13 < var16) {
                var14 = var17 - 8;
                var13++;
                arg2[var13] = (byte) (var9 = var11 >>> var14);
                if (var13 < var16) {
                    var13++;
                    var14 -= 8;
                    arg2[var13] = (byte) (var9 = var11 >>> var14);
                    if (var16 > var13) {
                        var13++;
                        var14 -= 8;
                        arg2[var13] = (byte) (var9 = var11 >>> var14);
                        if (var13 < var16) {
                            var13++;
                            var14 -= 8;
                            arg2[var13] = (byte) (var9 = var11 << -var14);
                        }
                    }
                }
            }
            arg4++;
        }
        return (var8 + 7 >> 3) - arg0;
    }

    @OriginalMember(owner = "client!pj", name = "<init>", descriptor = "([B)V")
    public class48(byte[] arg0) {
        int[] var2 = new int[33];
        int var3 = arg0.length;
        this.field845 = new int[var3];
        this.field853 = new int[8];
        this.field843 = arg0;
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var2[var6];
                this.field845[var5] = var8;
                int var12;
                if ((var7 & var8) == 0) {
                    for (int var9 = var6 - 1; var9 >= 1; var9--) {
                        int var10 = var2[var9];
                        if (var8 != var10) {
                            break;
                        }
                        int var11 = 0x1 << 32 - var9;
                        if ((var11 & var10) != 0) {
                            var2[var9] = var2[var9 - 1];
                            break;
                        }
                        var2[var9] = class45.method348(var10, var11);
                    }
                    var12 = var7 | var8;
                } else {
                    var12 = var2[var6 - 1];
                }
                var2[var6] = var12;
                for (int var13 = var6 + 1; var13 <= 32; var13++) {
                    if (var2[var13] == var8) {
                        var2[var13] = var12;
                    }
                }
                int var14 = 0;
                for (int var15 = 0; var15 < var6; var15++) {
                    int var16 = Integer.MIN_VALUE >>> var15;
                    if ((var16 & var8) == 0) {
                        var14++;
                    } else {
                        if (this.field853[var14] == 0) {
                            this.field853[var14] = var4;
                        }
                        var14 = this.field853[var14];
                    }
                    int var17 = var16 >>> 1;
                    if (this.field853.length <= var14) {
                        int[] var18 = new int[this.field853.length * 2];
                        for (int var19 = 0; var19 < this.field853.length; var19++) {
                            var18[var19] = this.field853[var19];
                        }
                        this.field853 = var18;
                    }
                }
                if (var4 <= var14) {
                    var4 = var14 + 1;
                }
                this.field853[var14] = ~var5;
            }
        }
    }
}
