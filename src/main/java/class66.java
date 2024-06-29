import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public abstract class class66 {

    @OriginalMember(owner = "client!ha", name = "k", descriptor = "Ld;")
    public class160 field679;

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "I")
    public int field688;

    @OriginalMember(owner = "client!ha", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field698 = new String[] { method595(method594(";/'*&")), method595(method594(".teh")), method595(method594("(`'I\u0011h")), method595(method594("(`'R\u0011h")), method595(method594("(`'J\u0011h")), method595(method594("(`'E\u0010h")), method595(method594("\u0015L")), method595(method594("(`'U\u0011h")), method595(method594("(`'G\u0010h")), method595(method594("(`'T\u0011h")), method595(method594("(`'82.h}:s")), method595(method594("\u000eG]M")), method595(method594("(`'b2.`em!%)")), method595(method594("(`'@\u0010h")), method595(method594("(`'Q\u0011h")), method595(method594("5m")), method595(method594("5l")), method595(method594("(`'A\u0010h")), method595(method594("(`'V\u0011h")), method595(method594("(`'K\u0011h")), method595(method594("(`'P\u0011h")), method595(method594("(`'F\u0010h")), method595(method594("(`'S\u0011h")), method595(method594("(`'B\u0010h")), method595(method594("(`'W\u0011h")) };

    @OriginalMember(owner = "client!ha", name = "i", descriptor = "I")
    public static int field677;

    @OriginalMember(owner = "client!ha", name = "n", descriptor = "I")
    public static int field678;

    @OriginalMember(owner = "client!ha", name = "g", descriptor = "I")
    public static int field681;

    @OriginalMember(owner = "client!ha", name = "r", descriptor = "I")
    public static int field682;

    @OriginalMember(owner = "client!ha", name = "q", descriptor = "I")
    public static int field683;

    @OriginalMember(owner = "client!ha", name = "o", descriptor = "I")
    public static int field685;

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "I")
    public static int field686;

    @OriginalMember(owner = "client!ha", name = "h", descriptor = "I")
    public static int field687;

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "I")
    public static int field689;

    @OriginalMember(owner = "client!ha", name = "p", descriptor = "I")
    public static int field690;

    @OriginalMember(owner = "client!ha", name = "l", descriptor = "I")
    public static int field691;

    @OriginalMember(owner = "client!ha", name = "u", descriptor = "I")
    public static int field692;

    @OriginalMember(owner = "client!ha", name = "t", descriptor = "I")
    public static int field693;

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "I")
    public static int field694;

    @OriginalMember(owner = "client!ha", name = "m", descriptor = "I")
    public static int field695;

    @OriginalMember(owner = "client!ha", name = "j", descriptor = "I")
    public static int field696;

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "I")
    public static int field697;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "Lwca;")
    public static class705 field684;

    @OriginalMember(owner = "client!ha", name = "s", descriptor = "Ljava/lang/String;")
    public static String field680;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIB)V", line = 15)
    public final void method476(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        try {
            field691++;
            this.method512(arg2, arg1, arg0, arg3, 1);
            int var6 = 25 % ((-arg4 - 24) / 62);
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field698[13] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "(IIIIII)V", line = 47)
    public final void method492(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        try {
            field694++;
            this.method532(arg3, arg1, arg4, arg0, arg5, arg2);
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field698[21] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ld;IIIIILla;Ljava/awt/Canvas;)Lha;", line = 88)
    public static final synchronized class66 method518(class160 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class476 arg6, Canvas arg7) {
        try {
            field689++;
            if (arg1 == 0) {
                return class138.method1186(arg0, arg4, 6, arg7, arg3);
            } else if (arg1 == 2) {
                return class139.method1191(arg7, arg4, 0, arg3, arg0);
            } else if (arg1 == 1) {
                return class470.method3573(-126, arg7, arg5, arg0);
            } else if (arg1 == 5) {
                return class630.method4667(27190, arg7, arg6, arg0, arg5);
            } else if (arg1 == 3) {
                return class525.method3976(arg5, arg7, arg6, (byte) 23, arg0);
            } else if (arg2 <= 56) {
                return null;
            } else {
                throw new IllegalArgumentException(field698[6]);
            }
        } catch (RuntimeException var9) {
            throw class759.method5498(var9, field698[7] + (arg0 == null ? field698[1] : field698[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 == null ? field698[1] : field698[0]) + ',' + (arg7 == null ? field698[1] : field698[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(II[IBII)Lfs;", line = 126)
    public final class581 method520(int arg0, int arg1, int[] arg2, byte arg3, int arg4, int arg5) {
        try {
            field686++;
            return arg3 == 41 ? this.method560(arg2, arg0, arg4, arg1, arg5, true) : null;
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field698[23] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field698[1] : field698[0]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lla;Lla;Lla;ILjq;Lot;)Z", line = 148)
    public static final boolean method528(class476 arg0, class476 arg1, class476 arg2, int arg3, class537 arg4, class616 arg5) {
        try {
            if (arg3 != 16) {
                method544(null, 24);
            }
            class132.field1546 = arg2;
            field690++;
            class218.field3344 = arg0;
            class322.field5080 = arg1;
            class452.field6628 = arg4;
            class396.field5927 = arg5;
            class335.field5230 = new int[16];
            for (int var6 = 0; var6 < 16; var6++) {
                class335.field5230[var6] = 255;
            }
            return true;
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field698[22] + (arg0 == null ? field698[1] : field698[0]) + ',' + (arg1 == null ? field698[1] : field698[0]) + ',' + (arg2 == null ? field698[1] : field698[0]) + ',' + arg3 + ',' + (arg4 == null ? field698[1] : field698[0]) + ',' + (arg5 == null ? field698[1] : field698[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(III)Z", line = 174)
    public static final boolean method529(int arg0, int arg1, int arg2) {
        try {
            field696++;
            if (arg0 != -1) {
                method528(null, null, null, -35, null, null);
            }
            return (arg2 & 0x800) != 0;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field698[17] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIII)V", line = 189)
    public final void method533(int arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            this.method525(arg0, arg2, arg3, arg1, 1);
            if (arg4 == 9261) {
                field697++;
            }
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field698[18] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!ha", name = "i", descriptor = "(I)V", line = 207)
    public final void method540(int arg0) throws class382 {
        try {
            this.method513(0, arg0);
            field683++;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field698[24] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lec;I)V", line = 219)
    public static final void method544(class247 arg0, int arg1) {
        try {
            field685++;
            int var2 = arg0.field3827 - class375.field5711;
            if (arg1 != 4) {
                method528(null, null, null, -31, null, null);
            }
            int var3 = arg0.field3818 * 512 + (arg0.method2101(31463) * 256);
            int var4 = arg0.field3767 * 512 + (arg0.method2101(31463) * 256);
            arg0.field6211 += (var4 - arg0.field6211) / var2;
            arg0.field3867 = 0;
            arg0.field6197 += (var3 - arg0.field6197) / var2;
            if (arg0.field3832 == 0) {
                arg0.method2097(8192, arg1 ^ 0x4);
            }
            if (arg0.field3832 == 1) {
                arg0.method2097(12288, 0);
            }
            if (arg0.field3832 == 2) {
                arg0.method2097(0, 0);
            }
            if (arg0.field3832 == 3) {
                arg0.method2097(4096, arg1 - 4);
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field698[5] + (arg0 == null ? field698[1] : field698[0]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IBIII)V", line = 283)
    public final void method564(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        try {
            this.method482(arg3, arg4, arg2, arg0, 1);
            if (arg1 != 88) {
                this.method491(-25, -74, 110, -74, null);
            }
            field682++;
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field698[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!ha", name = "<init>", descriptor = "(Ld;)V", line = 294)
    public class66(class160 arg0) {
        try {
            this.field679 = arg0;
            int var2 = -1;
            for (int var3 = 0; var3 < 8; var3++) {
                if (!class133.field1558[var3]) {
                    var2 = var3;
                    class133.field1558[var3] = true;
                    break;
                }
            }
            if (var2 == -1) {
                throw new IllegalStateException(field698[11]);
            }
            this.field688 = var2;
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field698[10] + (arg0 == null ? field698[1] : field698[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!ha", name = "h", descriptor = "(I)V", line = 324)
    public static final void method565(int arg0) {
        try {
            field695++;
            boolean var1 = class430.field6332.method1426(-14788) == 1;
            int var2 = class430.field6332.method1441(118);
            class104.field1209 = class430.field6332.method1455((byte) 62);
            int var3 = class430.field6332.method1432((byte) -34);
            int var4 = class430.field6332.method1409(arg0 - 93);
            class121.method1052(arg0 - 8);
            class460.method3507(false, var4);
            class430.field6332.method155(arg0 + 655076640);
            for (int var5 = 0; var5 < 4; var5++) {
                for (int var6 = 0; var6 < class648.field9378 >> 3; var6++) {
                    for (int var7 = 0; var7 < (class659.field9506 >> 3); var7++) {
                        int var8 = class430.field6332.method156(arg0 - 10168, 1);
                        if (var8 == 1) {
                            class138.field1642[var5][var6][var7] = class430.field6332.method156(-10160, 26);
                        } else {
                            class138.field1642[var5][var6][var7] = -1;
                        }
                    }
                }
            }
            class430.field6332.method154(arg0 - 5);
            if (arg0 != 8) {
                field680 = null;
            }
            int var9 = (class476.field6930 - class430.field6332.field2201) / 16;
            class28.field350 = new int[var9][4];
            for (int var10 = 0; var10 < var9; var10++) {
                for (int var11 = 0; var11 < 4; var11++) {
                    class28.field350[var10][var11] = class430.field6332.method1453((byte) 105);
                }
            }
            class416.field6135 = new int[var9];
            class274.field4140 = new byte[var9][];
            class752.field10938 = new int[var9];
            class516.field7461 = new int[var9];
            class106.field1223 = null;
            class608.field8893 = new byte[var9][];
            class754.field10979 = new byte[var9][];
            class694.field10133 = new int[var9];
            class88.field993 = null;
            class530.field7791 = new byte[var9][];
            class301.field4726 = new int[var9];
            int var12 = 0;
            for (int var13 = 0; var13 < 4; var13++) {
                for (int var14 = 0; var14 < (class648.field9378 >> 3); var14++) {
                    for (int var15 = 0; var15 < class659.field9506 >> 3; var15++) {
                        int var16 = class138.field1642[var13][var14][var15];
                        if (var16 != -1) {
                            int var17 = var16 >> 14 & 0x3FF;
                            int var18 = (var16 & 0x3FFA) >> 3;
                            int var19 = (var17 / 8 << 8) + var18 / 8;
                            for (int var20 = 0; var20 < var12; var20++) {
                                if (class752.field10938[var20] == var19) {
                                    var19 = -1;
                                    break;
                                }
                            }
                            if (var19 != -1) {
                                class752.field10938[var12] = var19;
                                int var21 = var19 >> 8 & 0xFF;
                                int var22 = var19 & 0xFF;
                                class694.field10133[var12] = class550.field8195.method3627("m" + var21 + "_" + var22, arg0 - 123);
                                class301.field4726[var12] = class550.field8195.method3627("l" + var21 + "_" + var22, -87);
                                class516.field7461[var12] = class550.field8195.method3627(field698[16] + var21 + "_" + var22, -82);
                                class416.field6135[var12] = class550.field8195.method3627(field698[15] + var21 + "_" + var22, -102);
                                var12++;
                            }
                        }
                    }
                }
            }
            class353.method2891(0, var2, var1, 11, var3);
        } catch (RuntimeException var24) {
            throw class759.method5498(var24, field698[14] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ha", name = "finalize", descriptor = "()V", line = 476)
    protected void finalize() {
        try {
            this.method579((byte) -48);
            field681++;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field698[12] + ')');
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "([Ljava/awt/Rectangle;II)V", line = 487)
    public final void method570(Rectangle[] arg0, int arg1, int arg2) throws class382 {
        try {
            this.method504(arg0, arg2, 0, 0);
            field692++;
            if (arg1 != 8297) {
                this.method473();
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field698[3] + (arg0 == null ? field698[1] : field698[0]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "(I)V", line = 498)
    public static void method571(int arg0) {
        try {
            if (arg0 >= -70) {
                field680 = null;
            }
            field684 = null;
            field680 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field698[20] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(B)V", line = 517)
    public final void method579(byte arg0) {
        try {
            class133.field1558[this.field688] = false;
            field687++;
            this.method470();
            if (arg0 > -11) {
                this.method485(null, null, 0.716155F, null);
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field698[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "(IIIIII)V", line = 529)
    public final void method580(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        try {
            field693++;
            this.method527(arg0, arg4, arg3, arg1, arg2, arg5);
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field698[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(ILfs;)V", line = 545)
    public final void method587(int arg0, class581 arg1) {
        try {
            field678++;
            if (arg0 != -1) {
                this.method486(-61, -101);
            }
            this.method592(this.method507(arg1, this.method486(arg1.method991(), arg1.method986())));
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field698[2] + arg0 + ',' + (arg1 == null ? field698[1] : field698[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIBIII)V", line = 563)
    public final void method593(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        try {
            field677++;
            if (arg2 != -82) {
                this.method527(124, 114, -112, -102, -124, -47);
            }
            this.method556(arg1, arg5, arg4, arg3, arg0, 1);
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field698[19] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!ha", name = "M", descriptor = "()I")
    public abstract int method468();

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "()Z")
    public abstract boolean method469();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "()V")
    public abstract void method470();

    @OriginalMember(owner = "client!ha", name = "da", descriptor = "(III[I)V")
    public abstract void method471(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "()Z")
    public abstract boolean method472();

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "()V")
    public abstract void method473();

    @OriginalMember(owner = "client!ha", name = "na", descriptor = "(IIII)[I")
    public abstract int[] method474(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "k", descriptor = "(I)Lza;")
    public abstract class434 method475(int arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(II[[I[[IIII)Ls;")
    public abstract class294 method477(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(II)Lnq;")
    public abstract class485 method478(int arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "DA", descriptor = "(IIII)V")
    public abstract void method479(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "EA", descriptor = "(IIII)V")
    public abstract void method480(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(I)V")
    public abstract void method481(int arg0);

    @OriginalMember(owner = "client!ha", name = "U", descriptor = "(IIIII)V")
    public abstract void method482(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ha", name = "GA", descriptor = "(I)V")
    public abstract void method483(int arg0);

    @OriginalMember(owner = "client!ha", name = "h", descriptor = "()V")
    public abstract void method484();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lol;Lol;FLol;)Lol;")
    public abstract class299 method485(class299 arg0, class299 arg1, float arg2, class299 arg3);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(II)Lrk;")
    public abstract class35 method486(int arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Liga;Z)Lfs;")
    public abstract class581 method487(class481 arg0, boolean arg1);

    @OriginalMember(owner = "client!ha", name = "C", descriptor = "(Z)V")
    public abstract void method488(boolean arg0);

    @OriginalMember(owner = "client!ha", name = "KA", descriptor = "(IIII)V")
    public abstract void method489(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "(II)V")
    public abstract void method490(int arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "HA", descriptor = "(IIII[I)V")
    public abstract void method491(int arg0, int arg1, int arg2, int arg3, int[] arg4);

    @OriginalMember(owner = "client!ha", name = "x", descriptor = "()Lmi;")
    public abstract class521 method493();

    @OriginalMember(owner = "client!ha", name = "E", descriptor = "()I")
    public abstract int method494();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lqq;)V")
    public abstract void method495(class501 arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(II[I[I)Laa;")
    public abstract class512 method496(int arg0, int arg1, int[] arg2, int[] arg3);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(FFF)V")
    public abstract void method497(float arg0, float arg1, float arg2);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(I)V")
    public abstract void method498(int arg0);

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(II)I")
    public abstract int method499(int arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ljw;I)V")
    public abstract void method500(class580 arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "A", descriptor = "()V")
    public abstract void method501();

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "()Z")
    public abstract boolean method502();

    @OriginalMember(owner = "client!ha", name = "o", descriptor = "()Z")
    public abstract boolean method503();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
    public abstract void method504(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class382;

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(IIIIII)Lol;")
    public abstract class299 method505(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ha", name = "X", descriptor = "(I)V")
    public abstract void method506(int arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lnq;Lrk;)Lgea;")
    public abstract class82 method507(class485 arg0, class35 arg1);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method508(Canvas arg0);

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "(II)I")
    public abstract int method509(int arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "(I)V")
    public abstract void method510(int arg0);

    @OriginalMember(owner = "client!ha", name = "m", descriptor = "()Lqq;")
    public abstract class501 method511();

    @OriginalMember(owner = "client!ha", name = "P", descriptor = "(IIIII)V")
    public abstract void method512(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "(II)V")
    public abstract void method513(int arg0, int arg1) throws class382;

    @OriginalMember(owner = "client!ha", name = "s", descriptor = "()Z")
    public abstract boolean method514();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lza;)V")
    public abstract void method515(class434 arg0);

    @OriginalMember(owner = "client!ha", name = "ZA", descriptor = "(IFFFFF)V")
    public abstract void method516(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

    @OriginalMember(owner = "client!ha", name = "j", descriptor = "()Lqq;")
    public abstract class501 method517();

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(Z)V")
    public abstract void method519(boolean arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIF)Luf;")
    public abstract class471 method521(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5);

    @OriginalMember(owner = "client!ha", name = "T", descriptor = "(IIII)V")
    public abstract void method522(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "pa", descriptor = "()V")
    public abstract void method523();

    @OriginalMember(owner = "client!ha", name = "H", descriptor = "(III[I)V")
    public abstract void method524(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!ha", name = "za", descriptor = "(IIIII)V")
    public abstract void method525(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ha", name = "xa", descriptor = "(F)V")
    public abstract void method526(float arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIII)V")
    public abstract void method527(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIILaa;IIIII)V")
    public abstract void method530(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class512 arg6, int arg7, int arg8, int arg9, int arg10, int arg11);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method531(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(IIIIII)V")
    public abstract void method532(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIZ)Lfs;")
    public abstract class581 method534(int arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!ha", name = "j", descriptor = "(I)V")
    public abstract void method535(int arg0);

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(I)V")
    public abstract void method536(int arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIILaa;II)V")
    public abstract void method537(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class512 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!ha", name = "ra", descriptor = "(IIII)V")
    public abstract void method538(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "([I)V")
    public abstract void method539(int[] arg0);

    @OriginalMember(owner = "client!ha", name = "r", descriptor = "(IIIIIII)I")
    public abstract int method541(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ha", name = "l", descriptor = "()Z")
    public abstract boolean method542();

    @OriginalMember(owner = "client!ha", name = "K", descriptor = "([I)V")
    public abstract void method543(int[] arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIIIIIIIII)V")
    public abstract void method545(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12);

    @OriginalMember(owner = "client!ha", name = "I", descriptor = "()I")
    public abstract int method546();

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "()Z")
    public abstract boolean method547();

    @OriginalMember(owner = "client!ha", name = "Y", descriptor = "()[I")
    public abstract int[] method548();

    @OriginalMember(owner = "client!ha", name = "F", descriptor = "(II)V")
    public abstract void method549(int arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIII)V")
    public abstract void method550(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
    public abstract void method551(Canvas arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lju;IIII)Lka;")
    public abstract class497 method552(class137 arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ha", name = "la", descriptor = "()V")
    public abstract void method553();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Z)V")
    public abstract void method554(boolean arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lol;)V")
    public abstract void method555(class299 arg0);

    @OriginalMember(owner = "client!ha", name = "aa", descriptor = "(IIIIII)V")
    public abstract void method556(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method557(Canvas arg0);

    @OriginalMember(owner = "client!ha", name = "XA", descriptor = "()I")
    public abstract int method558();

    @OriginalMember(owner = "client!ha", name = "n", descriptor = "()Z")
    public abstract boolean method559();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "([IIIIIZ)Lfs;")
    public abstract class581 method560(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!ha", name = "t", descriptor = "()Z")
    public abstract boolean method561();

    @OriginalMember(owner = "client!ha", name = "u", descriptor = "()Z")
    public abstract boolean method562();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Llq;[Liga;Z)Lda;")
    public abstract class67 method563(class578 arg0, class481[] arg1, boolean arg2);

    @OriginalMember(owner = "client!ha", name = "y", descriptor = "()Z")
    public abstract boolean method566();

    @OriginalMember(owner = "client!ha", name = "A", descriptor = "(ILaa;II)V")
    public abstract void method567(int arg0, class512 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIZ)Lfs;")
    public abstract class581 method568(int arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIIIII)V")
    public abstract void method569(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!ha", name = "JA", descriptor = "(IIIIII)I")
    public abstract int method572(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(I[Luf;)V")
    public abstract void method573(int arg0, class471[] arg1);

    @OriginalMember(owner = "client!ha", name = "r", descriptor = "()V")
    public abstract void method574();

    @OriginalMember(owner = "client!ha", name = "p", descriptor = "()V")
    public abstract void method575();

    @OriginalMember(owner = "client!ha", name = "k", descriptor = "()Z")
    public abstract boolean method576();

    @OriginalMember(owner = "client!ha", name = "v", descriptor = "()Lqq;")
    public abstract class501 method577();

    @OriginalMember(owner = "client!ha", name = "z", descriptor = "()I")
    public abstract int method578();

    @OriginalMember(owner = "client!ha", name = "g", descriptor = "(I)V")
    public abstract void method581(int arg0);

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(IIIID)V")
    public abstract void method582(int arg0, int arg1, int arg2, int arg3, double arg4);

    @OriginalMember(owner = "client!ha", name = "i", descriptor = "()I")
    public abstract int method583();

    @OriginalMember(owner = "client!ha", name = "L", descriptor = "(III)V")
    public abstract void method584(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ha", name = "Q", descriptor = "(IIIIII[BII)V")
    public abstract void method585(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!ha", name = "ya", descriptor = "()V")
    public abstract void method586();

    @OriginalMember(owner = "client!ha", name = "w", descriptor = "()Z")
    public abstract boolean method588();

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
    public abstract void method589(Canvas arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ljw;)V")
    public abstract void method590(class580 arg0);

    @OriginalMember(owner = "client!ha", name = "q", descriptor = "()V")
    public abstract void method591();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lgea;)V")
    public abstract void method592(class82 arg0);

    @OriginalMember(owner = "client!ha", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method594(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x5B);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ha", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method595(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 64;
                    break;
                case 1:
                    var10005 = 1;
                    break;
                case 2:
                    var10005 = 9;
                    break;
                case 3:
                    var10005 = 4;
                    break;
                default:
                    var10005 = 91;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
