import java.awt.Canvas;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Insets;
import java.awt.Rectangle;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.Socket;
import java.util.GregorianCalendar;
import java.util.Vector;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!client")
public class client extends class752 {

    @OriginalMember(owner = "client!client", name = "Cb", descriptor = "[Ljava/lang/String;")
    private static final String[] field9728 = new String[] { method4983(method4982("~K*")), method4983(method4982("b\u0005{\u007f\f8\u0000ruW8X")), method4983(method4982("\u0010\u0013x\u007f")), method4983(method4982("=\n}v_*H[R\u0019")), method4983(method4982("=\n}v_*HYR\u0019")), method4983(method4982("=\n}v_*HR;")), method4983(method4982("~NFvR1\u0010qaT:O4")), method4983(method4982("=\n}v_*HVR\u0019")), method4983(method4982("=\n}v_*HWR\u0019")), method4983(method4982("=\n}v_*HZR\u0019")), method4983(method4982("=\n}v_*HX;")), method4983(method4982("\u0014\u0007svI")), method4983(method4982("oT#=\u0001pV:\"")), method4983(method4982("=\n}v_*HP;")), method4983(method4982("=\n}v_*HSR\u0019")), method4983(method4982("4\u0015!p^0\bqpE")), method4983(method4982("4\u0015!p^0\bqpE\u0001\u0000a\u007f]")), method4983(method4982("4\u0015!cC1\u001emL")), method4983(method4982("4\u0015!pC=")), method4983(method4982("4\u0015!z^")), method4983(method4982("4\u0015!p^0\bqpE\u0001\tag^8\u0002ugT")), method4983(method4982("0\u0013x\u007f")), method4983(method4982("9\u0007yv\u0002")), method4983(method4982("9\u0007yv\u0000")), method4983(method4982(",\u0005")), method4983(method4982("=\n}v_*HyrX0N")), method4983(method4982("%H:=L")), method4983(method4982("3\tpvF6\u0007`")), method4983(method4982("\u001f\u0014sf\\;\b`3R1\u0013zg")), method4983(method4982("9\u0007yv")), method4983(method4982("9\u0007yv\u0003")), method4983(method4982("9\u0003f~P0")), method4983(method4982("2\u0007ztD?\u0001q")), method4983(method4982("9\u0007yv\u0001")), method4983(method4982(";\bs\u007fX-\u000e")), method4983(method4982("2\u000fbv")), method4983(method4982(")\u000fd")), method4983(method4982("b\u0004f-")), method4983(method4982("{O")), method4983(method4982("b\u0004f-\u0019")), method4983(method4982("=\n}v_*H]R\u0019")), method4983(method4982("=\n}v_*HB;")), method4983(method4982("=\n}v_*HRR\u0019")), method4983(method4982("4\u0015")), method4983(method4982("2\u0007zt")), method4983(method4982("8\tfpThRyq")), method4983(method4982("+\u0015qaw2\tc")), method4983(method4982(")\tf\u007fU8\nutB")), method4983(method4982("?\u0002bvC*")), method4983(method4982("?\u0002pzE7\tzr]\u0017\br|")), method4983(method4982("1\u0004~vR*\u0012ut")), method4983(method4982("-\u0003`gX0\u0001g")), method4983(method4982(")\tf\u007fU7\u0002")), method4983(method4982("*\u0014av")), method4983(method4982("=\n}v_*H}}X*N")), method4983(method4982("2\tvqH7\u0002")), method4983(method4982("-\u0015\u007fvH")), method4983(method4982("/\u0013}gD,\n")), method4983(method4982("3\tpvF6\u0003fv")), method4983(method4982("?\u0000rzU")), method4983(method4982("+\bpvC")), method4983(method4982("=\ta}E,\u001f")), method4983(method4982("8\u0014{~S7\nxz_9")), method4983(method4982("2\tvqH?\u0002paT-\u0015")), method4983(method4982("-\u000f`vB;\u0012`z_9\u0015K~T3\u0004qa")), method4983(method4982("=\tx|D,\u000fp")), method4983(method4982("=\n}v_*H^R\u0019")), method4983(method4982("6\u0007zw];")), method4983(method4982("0\u0007`zG;*}qC?\u0014}vB")), method4983(method4982("\"W!:")), method4983(method4982("fO")), method4983(method4982("4\u0007br\u001f2\u0007zt\u001f\u001d\nu`B\u0012\tuwT,")), method4983(method4982("iO")), method4983(method4982("lO")), method4983(method4982("oU=")), method4983(method4982("\"R=")), method4983(method4982("-\u0003`RR=\u0003g`X<\nq")), method4983(method4982("gO")), method4983(method4982("-\u0011'w\u001f:\nx")), method4983(method4982("oV=")), method4983(method4982("=\n}v_*")), method4983(method4982("0\u0007yv")), method4983(method4982("oT=")), method4983(method4982("oW=")), method4983(method4982("4\u0007br\u001f2\u0007zt\u001f,\u0003r\u007fT=\u0012:RR=\u0003g`X<\nq\\S4\u0003wg")), method4983(method4982("\"S=")), method4983(method4982("\"W\":")), method4983(method4982("oR=")), method4983(method4982("=\n}v_*HZ;")), method4983(method4982("mO")), method4983(method4982("\u0005W=")), method4983(method4982("\"P=")), method4983(method4982("=\n}v_*HQ;")), method4983(method4982("=\u0007zeP-")), method4983(method4982("=\n}v_*HE;")), method4983(method4982("=\n}v_*HDR\u0019")), method4983(method4982("=\n}v_*HD;")) };

    @OriginalMember(owner = "client!client", name = "tb", descriptor = "I")
    public static int field9705;

    @OriginalMember(owner = "client!client", name = "wb", descriptor = "I")
    public static int field9706;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
    public static int field9707;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
    public static int field9708;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field9709;

    @OriginalMember(owner = "client!client", name = "nb", descriptor = "I")
    public static int field9710;

    @OriginalMember(owner = "client!client", name = "pb", descriptor = "I")
    public static int field9711;

    @OriginalMember(owner = "client!client", name = "rb", descriptor = "I")
    public static int field9712;

    @OriginalMember(owner = "client!client", name = "vb", descriptor = "I")
    public static int field9713;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    public static int field9715;

    @OriginalMember(owner = "client!client", name = "ub", descriptor = "I")
    public static int field9716;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
    public static int field9717;

    @OriginalMember(owner = "client!client", name = "ob", descriptor = "I")
    public static int field9718;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field9719;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field9720;

    @OriginalMember(owner = "client!client", name = "Bb", descriptor = "I")
    public static int field9721;

    @OriginalMember(owner = "client!client", name = "yb", descriptor = "I")
    public static int field9722;

    @OriginalMember(owner = "client!client", name = "sb", descriptor = "I")
    public static int field9723;

    @OriginalMember(owner = "client!client", name = "xb", descriptor = "I")
    public static int field9724;

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "I")
    public static int field9725;

    @OriginalMember(owner = "client!client", name = "zb", descriptor = "I")
    public static int field9727;

    // $FF: synthetic field
    @OriginalMember(owner = "client!client", name = "Ab", descriptor = "Ljava/lang/Class;")
    public static Class field9726;

    @OriginalMember(owner = "client!client", name = "qb", descriptor = "[Z")
    public static boolean[] field9714;

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(I)Ljava/lang/String;")
    public final String method4953(int arg0) {
        try {
            field9723++;
            String var2 = null;
            try {
                var2 = field9728[90] + class537.field7895 + "," + class655.field9286 + "," + class625.field8929 + "," + class14.field187 + "|";
                if (class203.field2988 != null) {
                    var2 = var2 + field9728[73] + class693.field9689 + "," + (class203.field2988.field2252[0] + class537.field7895) + "," + (class203.field2988.field2256[0] + class655.field9286) + "|";
                }
                var2 = var2 + field9728[89] + class451.field6612.field9134.method4717(3) + field9728[75] + class451.field6612.field9116.method2747(3) + field9728[85] + class680.method4883(21) + field9728[91] + class391.field5700 + "," + class711.field9998 + "|";
                var2 = var2 + field9728[72] + class451.field6612.field9127.method5475(3) + "|";
                var2 = var2 + field9728[70] + class451.field6612.field9113.method1072(3) + "|";
                var2 = var2 + field9728[77] + class451.field6612.field9105.method1260(3) + "|";
                var2 = var2 + field9728[79] + class451.field6612.field9092.method2151(3) + "|";
                var2 = var2 + field9728[83] + class451.field6612.field9130.method2195(3) + "|";
                var2 = var2 + field9728[82] + class451.field6612.field9089.method5427(3) + "|";
                var2 = var2 + field9728[74] + class342.field4980 + "|";
                var2 = var2 + field9728[87] + class559.field8139;
                int var3 = -1 % ((-arg0 - 28) / 41);
                if (class799.field11611 != null) {
                    var2 = var2 + field9728[69] + class799.field11611.field337;
                }
                try {
                    if (class451.field6612.field9134.method4717(3) == 2) {
                        Class var4 = Class.forName(field9728[71]);
                        Field var5 = var4.getDeclaredField(field9728[68]);
                        Class var6 = Class.forName(field9728[84]);
                        Method var7 = var6.getDeclaredMethod(field9728[76], Boolean.TYPE);
                        var7.invoke(var5, Boolean.TRUE);
                        Vector var8 = (Vector) var5.get((field9726 == null ? (field9726 = method4981(field9728[80])) : field9726).getClassLoader());
                        for (int var9 = 0; var9 < var8.size(); var9++) {
                            try {
                                Object var10 = var8.elementAt(var9);
                                Field var11 = var10.getClass().getDeclaredField(field9728[81]);
                                var7.invoke(var11, Boolean.TRUE);
                                try {
                                    String var12 = (String) var11.get(var10);
                                    if (var12 != null && var12.indexOf(field9728[78]) != -1) {
                                        Field var13 = var10.getClass().getDeclaredField(field9728[67]);
                                        var7.invoke(var13, Boolean.TRUE);
                                        var2 = var2 + field9728[86] + Long.toHexString(var13.getLong(var10));
                                        var7.invoke(var13, Boolean.FALSE);
                                    }
                                } catch (Throwable var15) {
                                }
                                var7.invoke(var11, Boolean.FALSE);
                            } catch (Throwable var16) {
                            }
                        }
                    }
                } catch (Throwable var17) {
                }
                var2 = var2 + "]";
            } catch (Throwable var18) {
            }
            return var2;
        } catch (RuntimeException var19) {
            throw class665.method4799(var19, field9728[88] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BZLqo;)V")
    public static final void method4954(byte arg0, boolean arg1, class170 arg2) {
        try {
            field9722++;
            class765 var3 = arg2.method1430(27750);
            if (arg2.field2257 == 0) {
                class71.field1036 = 0;
                arg2.field2262 = 0;
                class657.field9310 = -1;
            } else {
                if (arg0 <= 108) {
                    field9714 = null;
                }
                if (arg2.field2228.method835(false) && !arg2.field2228.method826(-1)) {
                    class437 var4 = arg2.field2228.method846(12763);
                    if (arg2.field2258 > 0 && var4.field6449 == 0) {
                        class71.field1036 = 0;
                        class657.field9310 = -1;
                        arg2.field2262++;
                        return;
                    }
                    if (arg2.field2258 <= 0 && var4.field6445 == 0) {
                        class71.field1036 = 0;
                        class657.field9310 = -1;
                        arg2.field2262++;
                        return;
                    }
                }
                for (int var5 = 0; var5 < arg2.field2230.length; var5++) {
                    if (arg2.field2230[var5].field6627 != -1 && arg2.field2230[var5].field6631.method826(-1)) {
                        class595 var6 = class11.field153.method3479(arg2.field2230[var5].field6627, 102);
                        if (var6.field8546 && var6.field8565 != -1) {
                            class437 var7 = class10.field132.method1889(var6.field8565, true);
                            if (arg2.field2258 > 0 && var7.field6449 == 0) {
                                class71.field1036 = 0;
                                class657.field9310 = -1;
                                arg2.field2262++;
                                return;
                            }
                            if (arg2.field2258 <= 0 && var7.field6445 == 0) {
                                class657.field9310 = -1;
                                arg2.field2262++;
                                class71.field1036 = 0;
                                return;
                            }
                        }
                    }
                }
                int var8 = arg2.field2969;
                int var9 = arg2.field2984;
                int var10 = arg2.field2252[arg2.field2257 - 1] * 512 + (arg2.method1437((byte) -28) * 256);
                int var11 = arg2.field2256[arg2.field2257 - 1] * 512 + arg2.method1437((byte) -28) * 256;
                if (var10 <= var8) {
                    if (var8 <= var10) {
                        if (var9 < var11) {
                            arg2.method1432(16383, 8192);
                        } else if (var9 > var11) {
                            arg2.method1432(16383, 0);
                        }
                    } else if (var9 < var11) {
                        arg2.method1432(16383, 6144);
                    } else if (var9 <= var11) {
                        arg2.method1432(16383, 4096);
                    } else {
                        arg2.method1432(16383, 2048);
                    }
                } else if (var11 > var9) {
                    arg2.method1432(16383, 10240);
                } else if (var9 <= var11) {
                    arg2.method1432(16383, 12288);
                } else {
                    arg2.method1432(16383, 14336);
                }
                byte var12 = arg2.field2254[arg2.field2257 - 1];
                if (arg1 || var10 - var8 <= 1024 && (var10 - var8) >= -1024 && (var11 - var9) <= 1024 && var11 - var9 >= -1024) {
                    int var13 = 16;
                    boolean var14 = true;
                    if (arg2 instanceof class717) {
                        var14 = ((class717) arg2).field10229.field1666;
                    }
                    if (var14) {
                        int var15 = arg2.field2235 - arg2.field2234.field91;
                        if (var15 != 0 && arg2.field2219 == -1 && arg2.field2231 != 0) {
                            var13 = 8;
                        }
                        if (!arg1 && arg2.field2257 > 2) {
                            var13 = 24;
                        }
                        if (!arg1 && arg2.field2257 > 3) {
                            var13 = 32;
                        }
                    } else {
                        if (!arg1 && arg2.field2257 > 1) {
                            var13 = 24;
                        }
                        if (!arg1 && arg2.field2257 > 2) {
                            var13 = 32;
                        }
                    }
                    if (arg2.field2262 > 0 && arg2.field2257 > 1) {
                        var13 = 32;
                        arg2.field2262--;
                    }
                    if (var12 == 2) {
                        var13 <<= 0x1;
                    } else if (var12 == 0) {
                        var13 >>= 0x1;
                    }
                    class71.field1036 = 0;
                    if (var3.field10907 != -1) {
                        int var16 = var13 << 9;
                        if (arg2.field2257 == 1) {
                            int var17 = arg2.field2253 * arg2.field2253;
                            int var18 = (arg2.field2969 > var10 ? arg2.field2969 - var10 : -arg2.field2969 + var10) << 9;
                            int var19 = (arg2.field2984 > var11 ? arg2.field2984 - var11 : var11 - arg2.field2984) << 9;
                            int var20 = var19 >= var18 ? var19 : var18;
                            int var21 = var3.field10907 * 2 * var20;
                            if (var21 < var17) {
                                arg2.field2253 /= 2;
                            } else if ((var17 / 2) > var20) {
                                arg2.field2253 -= var3.field10907;
                                if (arg2.field2253 < 0) {
                                    arg2.field2253 = 0;
                                }
                            } else if (var16 > arg2.field2253) {
                                arg2.field2253 += var3.field10907;
                                if (var16 < arg2.field2253) {
                                    arg2.field2253 = var16;
                                }
                            }
                        } else if (var16 > arg2.field2253) {
                            arg2.field2253 += var3.field10907;
                            if (var16 < arg2.field2253) {
                                arg2.field2253 = var16;
                            }
                        } else if (arg2.field2253 > 0) {
                            arg2.field2253 -= var3.field10907;
                            if (arg2.field2253 < 0) {
                                arg2.field2253 = 0;
                            }
                        }
                        var13 = arg2.field2253 >> 9;
                        if (var13 < 1) {
                            var13 = 1;
                        }
                    }
                    if (var8 == var10 && var9 == var11) {
                        class657.field9310 = -1;
                    } else {
                        if (var8 < var10) {
                            class71.field1036 |= 0x4;
                            arg2.field2969 += var13;
                            if (arg2.field2969 > var10) {
                                arg2.field2969 = var10;
                            }
                        } else if (var8 > var10) {
                            class71.field1036 |= 0x8;
                            arg2.field2969 -= var13;
                            if (var10 > arg2.field2969) {
                                arg2.field2969 = var10;
                            }
                        }
                        if (var13 >= 32) {
                            class657.field9310 = 2;
                        } else {
                            class657.field9310 = var12;
                        }
                        if (var9 < var11) {
                            arg2.field2984 += var13;
                            class71.field1036 |= 0x1;
                            if (arg2.field2984 > var11) {
                                arg2.field2984 = var11;
                            }
                        } else if (var11 < var9) {
                            arg2.field2984 -= var13;
                            class71.field1036 |= 0x2;
                            if (var11 > arg2.field2984) {
                                arg2.field2984 = var11;
                            }
                        }
                    }
                    if (arg2.field2969 == var10 && arg2.field2984 == var11) {
                        if (arg2.field2258 > 0) {
                            arg2.field2258--;
                        }
                        arg2.field2257--;
                    }
                } else {
                    arg2.field2969 = var10;
                    arg2.field2984 = var11;
                    arg2.method1436(2, false, arg2.field2235);
                    class657.field9310 = -1;
                    arg2.field2257--;
                    if (arg2.field2258 > 0) {
                        arg2.field2258--;
                    }
                    class71.field1036 = 0;
                }
            }
        } catch (RuntimeException var23) {
            throw class665.method4799(var23, field9728[41] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field9728[21] : field9728[26]) + ')');
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "()V")
    public static final void method4955() {
        for (int var0 = 0; var0 < class625.field8929; var0++) {
            int[] var1 = class613.field8771[var0];
            for (int var2 = 0; var2 < class14.field187; var2++) {
                var1[var2] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
    private final void method4956(int arg0, int arg1) {
        try {
            class45.field646.field9779++;
            class760.field10837 = null;
            field9724++;
            class351.field5086 = null;
            class45.field646.field9781 = arg1;
            class478.field7058 = arg0;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field9728[7] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lvo;)Lle;")
    public static final class135 method4957(class782 arg0) {
        class135 var1 = (class135) class184.field2379.method3693(false, ((long) arg0.field11158 << 32) + (long) arg0.field11206);
        return var1 == null ? arg0.field11269 : var1;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
    public static final void method4958() {
        class130.field1619 = 0;
        for (int var0 = 0; var0 < class438.field6458; var0++) {
            class717 var1 = ((class527) class479.field7063.method3693(false, (long) class343.field4987[var0])).field7672;
            if (var1.field2212 && var1.method1443(5247) != -1) {
                int var2 = (var1.method1437((byte) -28) - 1) * 256 + 252;
                int var3 = var1.field2969 - var2 >> 9;
                int var4 = var1.field2984 - var2 >> 9;
                class170 var5 = class747.method5410(var4, -85, var3, var1.field2981);
                if (var5 != null) {
                    int var6 = var5.field2200;
                    if (var5 instanceof class717) {
                        var6 += 2048;
                    }
                    if (var5.field2191 == 0 && var5.method1443(5247) != -1) {
                        class744.field10567[class130.field1619] = var6;
                        class38.field596[class130.field1619] = var6;
                        class130.field1619++;
                        var5.field2191++;
                    }
                    class744.field10567[class130.field1619] = var6;
                    class38.field596[class130.field1619] = var1.field2200 + 2048;
                    class130.field1619++;
                    var5.field2191++;
                }
            }
        }
        class316.method2514(class38.field596, (byte) -119, class130.field1619 - 1, class744.field10567, 0);
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
    public static final void method4959(int arg0) {
        int var1 = class689.field9642;
        int[] var2 = class599.field8595;
        int var3 = class268.field3801 ? var1 : class438.field6458 + var1;
        for (int var4 = 0; var4 < var3; var4++) {
            class170 var5;
            if (var4 < var1) {
                var5 = class748.field10666[var2[var4]];
            } else {
                var5 = ((class527) class479.field7063.method3693(false, (long) class343.field4987[var4 - var1])).field7672;
            }
            if (var5.field2981 == arg0) {
                var5.field2191 = 0;
                if (var5.field2174 < 0) {
                    var5.field2212 = false;
                } else {
                    int var6 = var5.method1437((byte) -28);
                    if ((var6 & 0x1) == 0) {
                        if ((var5.field2969 & 0x1FF) != 0 || (var5.field2984 & 0x1FF) != 0) {
                            var5.field2212 = false;
                            continue;
                        }
                    } else if ((var5.field2969 & 0x1FF) != 256 || (var5.field2984 & 0x1FF) != 256) {
                        var5.field2212 = false;
                        continue;
                    }
                    int var10002;
                    if (var6 == 1) {
                        int var7 = var5.field2969 >> 9;
                        int var8 = var5.field2984 >> 9;
                        if (class613.field8771[var7][var8] != var5.field2174) {
                            var5.field2212 = true;
                            continue;
                        }
                        if (class674.field9463[var7][var8] > 1) {
                            var10002 = class674.field9463[var7][var8]--;
                            var5.field2212 = true;
                            continue;
                        }
                    } else {
                        int var9 = (var6 - 1) * 256 + 252;
                        int var10 = var5.field2969 - var9 >> 9;
                        int var11 = var5.field2984 - var9 >> 9;
                        int var12 = var5.field2969 + var9 >> 9;
                        int var13 = var5.field2984 + var9 >> 9;
                        if (!class336.method2700(14300, var5.field2174, var12, var13, var10, var11)) {
                            for (int var14 = var10; var14 <= var12; var14++) {
                                for (int var15 = var11; var15 <= var13; var15++) {
                                    if (class613.field8771[var14][var15] == var5.field2174) {
                                        var10002 = class674.field9463[var14][var15]--;
                                    }
                                }
                            }
                            var5.field2212 = true;
                            continue;
                        }
                    }
                    var5.field2212 = false;
                    var5.field2975 = class100.method977(-1, var5.field2984, var5.field2981, var5.field2969);
                    class90.method889(var5, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
    public final void method4960(boolean arg0) {
        try {
            field9709++;
            if (class451.field6612.field9134.method4717(3) == 2) {
                try {
                    this.method4965((byte) -120);
                } catch (ThreadDeath var5) {
                    throw var5;
                } catch (Throwable var6) {
                    class162.method1374(var6, var6.getMessage() + field9728[6] + this.method4953(-113), (byte) -93);
                    class615.field8784 = true;
                    class279.method2271(7, false, 0);
                }
            } else {
                this.method4965((byte) -128);
            }
            if (!arg0) {
                method4961(-110);
            }
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field9728[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
    public static void method4961(int arg0) {
        try {
            if (arg0 != 512) {
                method4958();
            }
            field9714 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field9728[95] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Llga;I)I")
    public static final int method4962(class47 arg0, int arg1) {
        try {
            field9720++;
            if (arg1 <= 125) {
                main(null);
            }
            int var2 = 0;
            if (arg0.method530(false, class398.field5791)) {
                var2++;
            }
            if (arg0.method530(false, class425.field6134)) {
                var2++;
            }
            if (arg0.method530(false, class742.field10550)) {
                var2++;
            }
            if (arg0.method530(false, class153.field1964)) {
                var2++;
            }
            if (arg0.method530(false, class126.field1579)) {
                var2++;
            }
            if (arg0.method530(false, class538.field7901)) {
                var2++;
            }
            if (arg0.method530(false, class239.field3456)) {
                var2++;
            }
            if (arg0.method530(false, class47.field699)) {
                var2++;
            }
            if (arg0.method530(false, class322.field4388)) {
                var2++;
            }
            if (arg0.method530(false, class725.field10310)) {
                var2++;
            }
            if (arg0.method530(false, class396.field5747)) {
                var2++;
            }
            if (arg0.method530(false, class533.field7712)) {
                var2++;
            }
            if (arg0.method530(false, class429.field6219)) {
                var2++;
            }
            if (arg0.method530(false, class202.field2979)) {
                var2++;
            }
            if (arg0.method530(false, class354.field5133)) {
                var2++;
            }
            if (arg0.method530(false, class635.field9009)) {
                var2++;
            }
            return var2;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field9728[66] + (arg0 == null ? field9728[21] : field9728[26]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Lvo;IIIIIIIIIII)V")
    public static final void method4963(class782[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        label864: for (int var12 = 0; var12 < arg0.length; var12++) {
            class782 var13 = arg0[var12];
            if (var13 != null && var13.field11136 == arg1) {
                int var14 = var13.field11288 + arg6;
                int var15 = var13.field11218 + arg7;
                int var16;
                int var17;
                int var18;
                int var19;
                if (var13.field11291 == 2) {
                    var16 = arg2;
                    var17 = arg3;
                    var18 = arg4;
                    var19 = arg5;
                } else {
                    int var20 = var13.field11295 + var14;
                    int var21 = var13.field11244 + var15;
                    if (var13.field11291 == 9) {
                        var20++;
                        var21++;
                    }
                    var16 = var14 > arg2 ? var14 : arg2;
                    var17 = var15 > arg3 ? var15 : arg3;
                    var18 = var20 < arg4 ? var20 : arg4;
                    var19 = var21 < arg5 ? var21 : arg5;
                }
                if (var13.field11291 == 0 || var13.field11145 || method4957(var13).field1739 != 0 || class198.field2936 == var13 || class750.field10676 == var13.field11219 || class143.field1857 == var13.field11219) {
                    if (!method4977(var13)) {
                        int var22 = 0;
                        int var23 = 0;
                        if (class212.field3119) {
                            var22 = class784.method5647((byte) 105);
                            var23 = class30.method328(-17233);
                        }
                        if (class543.field7943 == var13 && class288.method2337(class543.field7943, 1) != null) {
                            class684.field9604 = true;
                            class701.field9807 = var14;
                            class479.field7065 = var15;
                        }
                        if (var13.field11260 || var16 < var18 && var17 < var19) {
                            if (var13.field11238 && arg10 >= var16 && arg11 >= var17 && arg10 < var18 && arg11 < var19) {
                                for (class618 var24 = (class618) class594.field8536.method3977((byte) -45); var24 != null; var24 = (class618) class594.field8536.method3987(0)) {
                                    if (var24.field8808) {
                                        var24.method4294(0);
                                        var24.field8805.field11153 = false;
                                    }
                                }
                                if (class41.field621 == 0) {
                                    class543.field7943 = null;
                                    class198.field2936 = null;
                                }
                                class577.field8367 = 0;
                                class61.field934 = false;
                                class99.field1345 = false;
                                if (!class86.field1217) {
                                    class161.method1360(-107);
                                }
                            }
                            boolean var25;
                            if (class604.field8668.method2881((byte) 121) + var22 >= var16 && class604.field8668.method2879(-237) + var23 >= var17 && class604.field8668.method2881((byte) 121) + var22 < var18 && class604.field8668.method2879(-237) + var23 < var19) {
                                var25 = true;
                            } else {
                                var25 = false;
                            }
                            if (!class351.field5091 && var25) {
                                if (var13.field11126 >= 0) {
                                    class670.field9445 = var13.field11126;
                                } else if (var13.field11238) {
                                    class670.field9445 = -1;
                                }
                            }
                            if (!class86.field1217 && arg10 >= var16 && arg11 >= var17 && arg10 < var18 && arg11 < var19) {
                                class24.method280(52, var13, arg11 - var15, arg10 - var14);
                            }
                            boolean var26 = false;
                            if (class604.field8668.method2882(false) && var25) {
                                var26 = true;
                            }
                            boolean var27 = false;
                            class682 var28 = (class682) class530.field7694.method3977((byte) -113);
                            if (var28 != null && var28.method1084(128) == 0 && var28.method1086((byte) 123) + var22 >= var16 && var28.method1088(-6) + var23 >= var17 && var28.method1086((byte) 126) + var22 < var18 && var28.method1088(-6) + var23 < var19) {
                                var27 = true;
                            }
                            if (var13.field11142 != null && !class101.method985((byte) 3)) {
                                for (int var29 = 0; var29 < var13.field11142.length; var29++) {
                                    if (class496.field7286.method2604(var13.field11142[var29], true)) {
                                        if (var13.field11174 == null || class694.field9700 >= var13.field11174[var29]) {
                                            byte var30 = var13.field11195[var29];
                                            if (var30 == 0 || ((var30 & 0x8) == 0 || !class496.field7286.method2604(86, true) && !class496.field7286.method2604(82, true) && !class496.field7286.method2604(81, true)) && ((var30 & 0x2) == 0 || class496.field7286.method2604(86, true)) && ((var30 & 0x1) == 0 || class496.field7286.method2604(82, true)) && ((var30 & 0x4) == 0 || class496.field7286.method2604(81, true))) {
                                                if (var29 < 10) {
                                                    class687.method4915(var29 + 1, -8, "", -1, var13.field11158);
                                                } else if (var29 == 10) {
                                                    class598.method4410((byte) 75);
                                                    class135 var31 = method4957(var13);
                                                    class652.method4743(var31.method1188(1), var13, 13022, var31.field1742);
                                                    class268.field3795 = class521.method3962(0, var13);
                                                    if (class268.field3795 == null) {
                                                        class268.field3795 = field9728[2];
                                                    }
                                                    class109.field1426 = var13.field11179 + field9728[1];
                                                }
                                                int var32 = var13.field11159[var29];
                                                if (var13.field11174 == null) {
                                                    var13.field11174 = new int[var13.field11142.length];
                                                }
                                                if (var32 == 0) {
                                                    var13.field11174[var29] = Integer.MAX_VALUE;
                                                } else {
                                                    var13.field11174[var29] = class694.field9700 + var32;
                                                }
                                            }
                                        }
                                    } else if (var13.field11174 != null) {
                                        var13.field11174[var29] = 0;
                                    }
                                }
                            }
                            if (var27) {
                                class574.method4271((byte) -99, var13, var23 + var28.method1088(-6) - var15, var22 + var28.method1086((byte) 126) - var14);
                            }
                            if (class543.field7943 != null && class543.field7943 != var13 && var25 && method4957(var13).method1184(true)) {
                                class260.field3694 = var13;
                            }
                            if (class198.field2936 == var13) {
                                class618.field8817 = true;
                                class565.field8250 = var14;
                                class741.field10535 = var15;
                            }
                            if (var13.field11145 || var13.field11219 != 0) {
                                if (var25 && class526.field7655 != 0 && var13.field11193 != null) {
                                    class618 var33 = new class618();
                                    var33.field8808 = true;
                                    var33.field8805 = var13;
                                    var33.field8810 = class526.field7655;
                                    var33.field8812 = var13.field11193;
                                    class594.field8536.method3984(var33, 0);
                                }
                                if (class543.field7943 != null || class86.field1217 || class557.field8116 != var13.field11219 && class577.field8367 > 0) {
                                    var27 = false;
                                    var26 = false;
                                    var25 = false;
                                }
                                if (var13.field11219 != 0) {
                                    if (class189.field2510 == var13.field11219 || class219.field3193 == var13.field11219) {
                                        class532.field7706 = var13;
                                        if (class320.field4367 != null) {
                                            class320.field4367.method5577(var13.field11244, class236.field3418, (byte) -100, class451.field6612.field9117.method4339(3));
                                        }
                                        if (class189.field2510 == var13.field11219) {
                                            if (class86.field1217 || arg10 < var16 || arg11 < var17 || arg10 >= var18 || arg11 >= var19) {
                                                continue;
                                            }
                                            class669.method4820(arg9, 1, arg8, class236.field3418);
                                            class87 var34 = (class87) class317.field4344.method3617(false);
                                            while (true) {
                                                if (var34 == null) {
                                                    continue label864;
                                                }
                                                if (arg10 >= var34.field1223 && arg10 < var34.field1226 && arg11 >= var34.field1227 && arg11 < var34.field1224) {
                                                    class161.method1360(113);
                                                    class712.method5154(110, var34.field1228);
                                                }
                                                var34 = (class87) class317.field4344.method3612(3);
                                            }
                                        }
                                    }
                                    if (class750.field10676 == var13.field11219) {
                                        if (var13.method5630((byte) -33, class236.field3418) == null || class345.field5028 != 0 && class345.field5028 != 3 || class86.field1217 || arg10 < var16 || arg11 < var17 || arg10 >= var18 || arg11 >= var19) {
                                            continue;
                                        }
                                        int var35 = arg10 - var14;
                                        int var36 = arg11 - var15;
                                        int var37 = var13.field11137[var36];
                                        if (var35 < var37 || var35 > var13.field11208[var36] + var37) {
                                            continue;
                                        }
                                        int var38 = var35 - var13.field11295 / 2;
                                        int var39 = var36 - var13.field11244 / 2;
                                        int var40;
                                        if (class596.field8579 == 4) {
                                            var40 = (int) class349.field5057 & 0x3FFF;
                                        } else {
                                            var40 = (int) class349.field5057 + class801.field11658 & 0x3FFF;
                                        }
                                        int var41 = class487.field7151[var40];
                                        int var42 = class487.field7150[var40];
                                        if (class596.field8579 != 4) {
                                            var41 = (class398.field5794 + 256) * var41 >> 8;
                                            var42 = (class398.field5794 + 256) * var42 >> 8;
                                        }
                                        int var43 = var38 * var42 + var39 * var41 >> 14;
                                        int var44 = var39 * var42 - var38 * var41 >> 14;
                                        int var45;
                                        int var46;
                                        if (class596.field8579 == 4) {
                                            var45 = (class36.field439 >> 9) + (var43 >> 2);
                                            var46 = (class138.field1805 >> 9) - (var44 >> 2);
                                        } else {
                                            int var47 = (class203.field2988.method1437((byte) -28) - 1) * 256;
                                            var45 = (class203.field2988.field2969 - var47 >> 9) + (var43 >> 2);
                                            var46 = (class203.field2988.field2984 - var47 >> 9) - (var44 >> 2);
                                        }
                                        if (class351.field5091 && (class140.field1826 & 0x40) != 0) {
                                            class782 var48 = class372.method2952(class121.field1535, class671.field9452, 0);
                                            if (var48 == null) {
                                                class598.method4410((byte) 93);
                                            } else {
                                                class751.method5441(class121.field1534, field9728[0], var45, -1, (long) (var13.field11206 << 0 | var13.field11158), true, class268.field3795, var13.field11276, true, var46, false, 44, 1L);
                                            }
                                            continue;
                                        }
                                        if (class544.field7978 == class316.field4323) {
                                            class751.method5441(-1, "", var45, -1, 0L, true, class537.field7857.method4068((byte) -123, class405.field5883), -1, true, var46, false, 49, 1L);
                                        }
                                        class751.method5441(class495.field7273, "", var45, -1, 0L, true, class255.field3663, -1, true, var46, false, 17, 1L);
                                        continue;
                                    }
                                    if (class557.field8116 == var13.field11219) {
                                        class226.field3277 = var13;
                                        if (var25) {
                                            class61.field934 = true;
                                        }
                                        if (var27) {
                                            int var49 = (int) ((double) (var22 + var28.method1086((byte) -71) - var14 - var13.field11295 / 2) * 2.0D / (double) class534.field7736);
                                            int var50 = (int) (-((double) (var23 + var28.method1088(-6) - var15 - var13.field11244 / 2) * 2.0D / (double) class534.field7736));
                                            int var51 = class601.field8605 + var49 + class534.field7745;
                                            int var52 = class30.field383 + var50 + class534.field7751;
                                            class715 var53 = class78.method780(-1);
                                            if (var53 == null) {
                                                continue;
                                            }
                                            int[] var54 = new int[3];
                                            var53.method5189(var54, true, var51, var52);
                                            if (var54 != null) {
                                                if (class496.field7286.method2604(82, true) && class440.field6485 > 0) {
                                                    class708.method5070(var54[0], var54[1], -63, var54[2]);
                                                    continue;
                                                }
                                                class99.field1345 = true;
                                                class229.field3320 = var54[0];
                                                class653.field9274 = var54[1];
                                                class731.field10445 = var54[2];
                                            }
                                            class577.field8367 = 1;
                                            class552.field8054 = false;
                                            class527.field7667 = class604.field8668.method2881((byte) 121);
                                            class738.field10511 = class604.field8668.method2879(-237);
                                            continue;
                                        }
                                        if (var26 && class577.field8367 > 0) {
                                            if (class577.field8367 == 1 && (class527.field7667 != class604.field8668.method2881((byte) 121) || class738.field10511 != class604.field8668.method2879(-237))) {
                                                class294.field4139 = class601.field8605;
                                                class160.field2055 = class30.field383;
                                                class577.field8367 = 2;
                                            }
                                            if (class577.field8367 == 2) {
                                                class552.field8054 = true;
                                                class184.method1519(class294.field4139 + (int) ((double) (class527.field7667 - class604.field8668.method2881((byte) 121)) * 2.0D / (double) class534.field7740), (byte) 48);
                                                class797.method5746(458752, class160.field2055 - (int) ((double) (class738.field10511 - class604.field8668.method2879(-237)) * 2.0D / (double) class534.field7740));
                                            }
                                            continue;
                                        }
                                        if (class577.field8367 > 0 && !class552.field8054) {
                                            if ((class753.field10766 == 1 || class592.method4373(true)) && class72.field1049 > 2) {
                                                class628.method4608(class738.field10511, class527.field7667, 14918);
                                            } else if (class559.method4184(false)) {
                                                class628.method4608(class738.field10511, class527.field7667, 14918);
                                            }
                                        }
                                        class577.field8367 = 0;
                                        continue;
                                    }
                                    if (class500.field7306 == var13.field11219) {
                                        if (var26) {
                                            class194.method1611(var13.field11295, var13.field11244, -2535, var22 + class604.field8668.method2881((byte) 121) - var14, var23 + class604.field8668.method2879(-237) - var15);
                                        }
                                        continue;
                                    }
                                    if (class143.field1857 == var13.field11219) {
                                        class281.method2289(var13, var14, -115, var15);
                                        continue;
                                    }
                                }
                                if (!var13.field11230 && var27) {
                                    var13.field11230 = true;
                                    if (var13.field11152 != null) {
                                        class618 var55 = new class618();
                                        var55.field8808 = true;
                                        var55.field8805 = var13;
                                        var55.field8813 = var22 + var28.method1086((byte) 125) - var14;
                                        var55.field8810 = var23 + var28.method1088(-6) - var15;
                                        var55.field8812 = var13.field11152;
                                        class594.field8536.method3984(var55, 0);
                                    }
                                }
                                if (var13.field11230 && var26 && var13.field11289 != null) {
                                    class618 var56 = new class618();
                                    var56.field8808 = true;
                                    var56.field8805 = var13;
                                    var56.field8813 = var22 + class604.field8668.method2881((byte) 121) - var14;
                                    var56.field8810 = var23 + class604.field8668.method2879(-237) - var15;
                                    var56.field8812 = var13.field11289;
                                    class594.field8536.method3984(var56, 0);
                                }
                                if (var13.field11230 && !var26) {
                                    var13.field11230 = false;
                                    if (var13.field11182 != null) {
                                        class618 var57 = new class618();
                                        var57.field8808 = true;
                                        var57.field8805 = var13;
                                        var57.field8813 = var22 + class604.field8668.method2881((byte) 121) - var14;
                                        var57.field8810 = var23 + class604.field8668.method2879(-237) - var15;
                                        var57.field8812 = var13.field11182;
                                        class129.field1605.method3984(var57, 0);
                                    }
                                }
                                if (var26 && var13.field11228 != null) {
                                    class618 var58 = new class618();
                                    var58.field8808 = true;
                                    var58.field8805 = var13;
                                    var58.field8813 = var22 + class604.field8668.method2881((byte) 121) - var14;
                                    var58.field8810 = var23 + class604.field8668.method2879(-237) - var15;
                                    var58.field8812 = var13.field11228;
                                    class594.field8536.method3984(var58, 0);
                                }
                                if (!var13.field11153 && var25) {
                                    var13.field11153 = true;
                                    if (var13.field11285 != null) {
                                        class618 var59 = new class618();
                                        var59.field8808 = true;
                                        var59.field8805 = var13;
                                        var59.field8813 = var22 + class604.field8668.method2881((byte) 121) - var14;
                                        var59.field8810 = var23 + class604.field8668.method2879(-237) - var15;
                                        var59.field8812 = var13.field11285;
                                        class594.field8536.method3984(var59, 0);
                                    }
                                }
                                if (var13.field11153 && var25 && var13.field11180 != null) {
                                    class618 var60 = new class618();
                                    var60.field8808 = true;
                                    var60.field8805 = var13;
                                    var60.field8813 = var22 + class604.field8668.method2881((byte) 121) - var14;
                                    var60.field8810 = var23 + class604.field8668.method2879(-237) - var15;
                                    var60.field8812 = var13.field11180;
                                    class594.field8536.method3984(var60, 0);
                                }
                                if (var13.field11153 && !var25) {
                                    var13.field11153 = false;
                                    if (var13.field11296 != null) {
                                        class618 var61 = new class618();
                                        var61.field8808 = true;
                                        var61.field8805 = var13;
                                        var61.field8813 = var22 + class604.field8668.method2881((byte) 121) - var14;
                                        var61.field8810 = var23 + class604.field8668.method2879(-237) - var15;
                                        var61.field8812 = var13.field11296;
                                        class129.field1605.method3984(var61, 0);
                                    }
                                }
                                if (var13.field11133 != null) {
                                    class618 var62 = new class618();
                                    var62.field8805 = var13;
                                    var62.field8812 = var13.field11133;
                                    class733.field10456.method3984(var62, 0);
                                }
                                if (var13.field11207 != null && class686.field9619 > var13.field11140) {
                                    if (var13.field11160 == null || class686.field9619 - var13.field11140 > 32) {
                                        class618 var67 = new class618();
                                        var67.field8805 = var13;
                                        var67.field8812 = var13.field11207;
                                        class594.field8536.method3984(var67, 0);
                                    } else {
                                        label751: for (int var63 = var13.field11140; var63 < class686.field9619; var63++) {
                                            int var64 = class49.field709[var63 & 0x1F];
                                            for (int var65 = 0; var65 < var13.field11160.length; var65++) {
                                                if (var13.field11160[var65] == var64) {
                                                    class618 var66 = new class618();
                                                    var66.field8805 = var13;
                                                    var66.field8812 = var13.field11207;
                                                    class594.field8536.method3984(var66, 0);
                                                    break label751;
                                                }
                                            }
                                        }
                                    }
                                    var13.field11140 = class686.field9619;
                                }
                                if (var13.field11278 != null && class785.field11338 > var13.field11292) {
                                    if (var13.field11253 == null || class785.field11338 - var13.field11292 > 32) {
                                        class618 var72 = new class618();
                                        var72.field8805 = var13;
                                        var72.field8812 = var13.field11278;
                                        class594.field8536.method3984(var72, 0);
                                    } else {
                                        label727: for (int var68 = var13.field11292; var68 < class785.field11338; var68++) {
                                            int var69 = class18.field241[var68 & 0x1F];
                                            for (int var70 = 0; var70 < var13.field11253.length; var70++) {
                                                if (var13.field11253[var70] == var69) {
                                                    class618 var71 = new class618();
                                                    var71.field8805 = var13;
                                                    var71.field8812 = var13.field11278;
                                                    class594.field8536.method3984(var71, 0);
                                                    break label727;
                                                }
                                            }
                                        }
                                    }
                                    var13.field11292 = class785.field11338;
                                }
                                if (var13.field11125 != null && class202.field2983 > var13.field11186) {
                                    if (var13.field11156 == null || class202.field2983 - var13.field11186 > 32) {
                                        class618 var77 = new class618();
                                        var77.field8805 = var13;
                                        var77.field8812 = var13.field11125;
                                        class594.field8536.method3984(var77, 0);
                                    } else {
                                        label703: for (int var73 = var13.field11186; var73 < class202.field2983; var73++) {
                                            int var74 = class369.field5341[var73 & 0x1F];
                                            for (int var75 = 0; var75 < var13.field11156.length; var75++) {
                                                if (var13.field11156[var75] == var74) {
                                                    class618 var76 = new class618();
                                                    var76.field8805 = var13;
                                                    var76.field8812 = var13.field11125;
                                                    class594.field8536.method3984(var76, 0);
                                                    break label703;
                                                }
                                            }
                                        }
                                    }
                                    var13.field11186 = class202.field2983;
                                }
                                if (var13.field11217 != null && class681.field9571 > var13.field11249) {
                                    if (var13.field11259 == null || class681.field9571 - var13.field11249 > 32) {
                                        class618 var82 = new class618();
                                        var82.field8805 = var13;
                                        var82.field8812 = var13.field11217;
                                        class594.field8536.method3984(var82, 0);
                                    } else {
                                        label679: for (int var78 = var13.field11249; var78 < class681.field9571; var78++) {
                                            int var79 = class539.field7926[var78 & 0x1F];
                                            for (int var80 = 0; var80 < var13.field11259.length; var80++) {
                                                if (var13.field11259[var80] == var79) {
                                                    class618 var81 = new class618();
                                                    var81.field8805 = var13;
                                                    var81.field8812 = var13.field11217;
                                                    class594.field8536.method3984(var81, 0);
                                                    break label679;
                                                }
                                            }
                                        }
                                    }
                                    var13.field11249 = class681.field9571;
                                }
                                if (var13.field11210 != null && class355.field5162 > var13.field11122) {
                                    if (var13.field11123 == null || class355.field5162 - var13.field11122 > 32) {
                                        class618 var87 = new class618();
                                        var87.field8805 = var13;
                                        var87.field8812 = var13.field11210;
                                        class594.field8536.method3984(var87, 0);
                                    } else {
                                        label655: for (int var83 = var13.field11122; var83 < class355.field5162; var83++) {
                                            int var84 = class8.field98[var83 & 0x1F];
                                            for (int var85 = 0; var85 < var13.field11123.length; var85++) {
                                                if (var13.field11123[var85] == var84) {
                                                    class618 var86 = new class618();
                                                    var86.field8805 = var13;
                                                    var86.field8812 = var13.field11210;
                                                    class594.field8536.method3984(var86, 0);
                                                    break label655;
                                                }
                                            }
                                        }
                                    }
                                    var13.field11122 = class355.field5162;
                                }
                                if (var13.field11237 != null && class604.field8656 > var13.field11231) {
                                    if (var13.field11286 == null || class604.field8656 - var13.field11231 > 32) {
                                        class618 var92 = new class618();
                                        var92.field8805 = var13;
                                        var92.field8812 = var13.field11237;
                                        class594.field8536.method3984(var92, 0);
                                    } else {
                                        label631: for (int var88 = var13.field11231; var88 < class604.field8656; var88++) {
                                            int var89 = class379.field5541[var88 & 0x1F];
                                            for (int var90 = 0; var90 < var13.field11286.length; var90++) {
                                                if (var13.field11286[var90] == var89) {
                                                    class618 var91 = new class618();
                                                    var91.field8805 = var13;
                                                    var91.field8812 = var13.field11237;
                                                    class594.field8536.method3984(var91, 0);
                                                    break label631;
                                                }
                                            }
                                        }
                                    }
                                    var13.field11231 = class604.field8656;
                                }
                                if (class273.field3873 > var13.field11232 && var13.field11138 != null) {
                                    class618 var93 = new class618();
                                    var93.field8805 = var13;
                                    var93.field8812 = var13.field11138;
                                    class594.field8536.method3984(var93, 0);
                                }
                                if (class391.field5712 > var13.field11232 && var13.field11225 != null) {
                                    class618 var94 = new class618();
                                    var94.field8805 = var13;
                                    var94.field8812 = var13.field11225;
                                    class594.field8536.method3984(var94, 0);
                                }
                                if (class341.field4968 > var13.field11232 && var13.field11246 != null) {
                                    class618 var95 = new class618();
                                    var95.field8805 = var13;
                                    var95.field8812 = var13.field11246;
                                    class594.field8536.method3984(var95, 0);
                                }
                                if (class586.field8459 > var13.field11232 && var13.field11227 != null) {
                                    class618 var96 = new class618();
                                    var96.field8805 = var13;
                                    var96.field8812 = var13.field11227;
                                    class594.field8536.method3984(var96, 0);
                                }
                                if (class344.field5010 > var13.field11232 && var13.field11226 != null) {
                                    class618 var97 = new class618();
                                    var97.field8805 = var13;
                                    var97.field8812 = var13.field11226;
                                    class594.field8536.method3984(var97, 0);
                                }
                                if (class239.field3454 > var13.field11232 && var13.field11274 != null) {
                                    class618 var98 = new class618();
                                    var98.field8805 = var13;
                                    var98.field8812 = var13.field11274;
                                    class594.field8536.method3984(var98, 0);
                                }
                                if (class190.field2522 > var13.field11232 && var13.field11275 != null) {
                                    class618 var99 = new class618();
                                    var99.field8805 = var13;
                                    var99.field8812 = var13.field11275;
                                    class594.field8536.method3984(var99, 0);
                                }
                                var13.field11232 = class522.field7612;
                                if (var13.field11220 != null) {
                                    for (int var100 = 0; var100 < class9.field104; var100++) {
                                        class618 var101 = new class618();
                                        var101.field8805 = var13;
                                        var101.field8811 = class327.field4479[var100].method3485((byte) 106);
                                        var101.field8814 = class327.field4479[var100].method3488(-4705);
                                        var101.field8812 = var13.field11220;
                                        class594.field8536.method3984(var101, 0);
                                    }
                                }
                                if (class113.field1456 && var13.field11168 != null) {
                                    class618 var102 = new class618();
                                    var102.field8805 = var13;
                                    var102.field8812 = var13.field11168;
                                    class594.field8536.method3984(var102, 0);
                                }
                            }
                            if (var13.field11291 == 5 && var13.field11272 != -1) {
                                var13.method5627(-409731664, class463.field6758, class671.field9451).method5577(var13.field11244, class236.field3418, (byte) -100, class451.field6612.field9117.method4339(3));
                            }
                            class791.method5704(var13, (byte) -83);
                            if (var13.field11291 == 0) {
                                method4963(arg0, var13.field11158, var16, var17, var18, var19, var14 - var13.field11252, var15 - var13.field11262, arg8, arg9, arg10, arg11);
                                if (var13.field11290 != null) {
                                    method4963(var13.field11290, var13.field11158, var16, var17, var18, var19, var14 - var13.field11252, var15 - var13.field11262, arg8, arg9, arg10, arg11);
                                }
                                class509 var103 = (class509) class104.field1375.method3693(false, (long) var13.field11158);
                                if (var103 != null) {
                                    if (class544.field7978 == class378.field5530 && var103.field7473 == 0 && !class86.field1217 && var25 && !class556.field8095) {
                                        class161.method1360(-127);
                                    }
                                    class756.method5480(var103.field7472, var15, var14, arg9, var18, arg11, var19, (byte) 42, arg8, var16, arg10, var17);
                                }
                            }
                        }
                    }
                } else if (var16 < var18 && var17 < var19) {
                    class791.method5704(var13, (byte) -62);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIII)V")
    public static final void method4964(int arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            if (class557.field8113 <= arg3 && class50.field717 >= arg3) {
                int var9 = class679.method4875(class507.field7453, class335.field4844, arg4, -1);
                int var8 = class679.method4875(class507.field7453, class335.field4844, arg2, -1);
                class318.method2525(var8, false, var9, arg1, arg3);
            }
            field9712++;
            int var5 = -93 / ((-arg0 - 72) / 34);
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field9728[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        try {
            field9716++;
            try {
                if (arg0.length != 6) {
                    class637.method4640(field9728[28], (byte) 89);
                }
                class405.field5878 = new class792();
                class405.field5878.field11524 = Integer.parseInt(arg0[0]);
                class671.field9456 = new class792();
                class671.field9456.field11524 = Integer.parseInt(arg0[1]);
                class35.field426 = class581.field8393;
                if (arg0[3].equals(field9728[35])) {
                    class797.field11583 = class714.field10153;
                } else if (arg0[3].equals(field9728[24])) {
                    class797.field11583 = class601.field8609;
                } else if (arg0[3].equals(field9728[36])) {
                    class797.field11583 = class490.field7184;
                } else {
                    class637.method4640(field9728[27], (byte) 89);
                }
                class405.field5883 = class794.method5724(-5, arg0[4]);
                if (class405.field5883 == -1) {
                    if (arg0[4].equals(field9728[34])) {
                        class405.field5883 = 0;
                    } else if (arg0[4].equals(field9728[31])) {
                        class405.field5883 = 1;
                    } else {
                        class637.method4640(field9728[32], (byte) 89);
                    }
                }
                class104.field1371 = false;
                class369.field5346 = false;
                if (arg0[5].equals(field9728[33])) {
                    class544.field7978 = class378.field5530;
                } else if (arg0[5].equals(field9728[23])) {
                    class544.field7978 = class316.field4323;
                } else if (arg0[5].equals(field9728[30])) {
                    class544.field7978 = class248.field3561;
                } else if (arg0[5].equals(field9728[22])) {
                    class544.field7978 = class727.field10422;
                } else {
                    class637.method4640(field9728[29], (byte) 89);
                }
                class799.field11615 = null;
                class784.field11322 = class544.field7978.field11572;
                class451.field6613 = 0;
                class4.field59 = false;
                class269.field3808 = "";
                class713.field10069 = 0;
                class323.field4402 = false;
                class482.field7094 = null;
                class728.field10428 = true;
                class282.field3975 = true;
                class570.field8266 = 0;
                class791.field11509 = 0L;
                client var1 = new client();
                class572.field8287 = var1;
                var1.method5451(1024, false, class544.field7978.field11574, class797.field11583.method1457(28687) + 32, 658, 768, 37, true);
                class543.field7942.setLocation(40, 40);
            } catch (Exception var4) {
                class162.method1374(var4, null, (byte) -93);
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field9728[25] + (arg0 == null ? field9728[21] : field9728[26]) + ')');
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        try {
            field9718++;
            if (this.method5445(-75)) {
                class405.field5878 = new class792();
                class405.field5878.field11524 = Integer.parseInt(this.getParameter(field9728[52]));
                class671.field9456 = new class792();
                class671.field9456.field11524 = Integer.parseInt(this.getParameter(field9728[55]));
                class671.field9456.field11516 = this.getParameter(field9728[63]);
                class35.field426 = class443.method3445(Integer.parseInt(this.getParameter(field9728[58])), -6145);
                if (class581.field8393 == class35.field426) {
                    class35.field426 = class46.field648;
                } else if (!class301.method2411(class35.field426, true) && class398.field5793 != class35.field426) {
                    class35.field426 = class398.field5793;
                }
                class797.field11583 = class347.method2780(Integer.parseInt(this.getParameter(field9728[27])), -100);
                if (class797.field11583 != class490.field7184 && class797.field11583 != class601.field8609 && class797.field11583 != class714.field10153) {
                    class797.field11583 = class714.field10153;
                }
                try {
                    class405.field5883 = Integer.parseInt(this.getParameter(field9728[44]));
                } catch (Exception var16) {
                    class405.field5883 = 0;
                }
                String var1 = this.getParameter(field9728[50]);
                if (var1 != null && var1.equals("1")) {
                    class369.field5346 = true;
                } else {
                    class369.field5346 = false;
                }
                String var2 = this.getParameter(field9728[43]);
                if (var2 != null && var2.equals("1")) {
                    class104.field1371 = true;
                } else {
                    class104.field1371 = false;
                }
                String var3 = this.getParameter(field9728[48]);
                if (var3 != null && var3.equals("1")) {
                    class364.field5276 = true;
                } else {
                    class364.field5276 = false;
                }
                String var4 = this.getParameter(field9728[29]);
                if (var4 != null) {
                    if (var4.equals("0")) {
                        class544.field7978 = class378.field5530;
                    } else if (var4.equals("1")) {
                        class544.field7978 = class316.field4323;
                    } else if (var4.equals("2")) {
                        class544.field7978 = class248.field3561;
                    } else if (var4.equals("3")) {
                        class544.field7978 = class727.field10422;
                    }
                }
                try {
                    class713.field10069 = Integer.parseInt(this.getParameter(field9728[59]));
                } catch (Exception var15) {
                    class713.field10069 = 0;
                }
                class36.field463 = this.getParameter(field9728[57]);
                class269.field3808 = this.getParameter(field9728[51]);
                if (class269.field3808 == null) {
                    class269.field3808 = "";
                }
                class10.field133 = "1".equals(this.getParameter(field9728[60]));
                String var5 = this.getParameter(field9728[61]);
                if (var5 != null) {
                    try {
                        class570.field8266 = Integer.parseInt(var5);
                    } catch (Exception var14) {
                        class570.field8266 = 0;
                    }
                }
                class784.field11322 = Integer.parseInt(this.getParameter(field9728[65]));
                if (class784.field11322 < 0 || class160.field2052.length <= class784.field11322) {
                    class784.field11322 = 0;
                }
                if (Integer.parseInt(this.getParameter(field9728[64])) == 1) {
                    class728.field10428 = true;
                    class282.field3975 = true;
                }
                String var6 = this.getParameter(field9728[62]);
                if (var6 != null && var6.equals(field9728[53])) {
                    class323.field4402 = true;
                }
                String var7 = this.getParameter(field9728[56]);
                if (var7 != null) {
                    class482.field7094 = class491.method3783(82, class493.method3808(16, var7));
                    if (class482.field7094.length < 16) {
                        class482.field7094 = null;
                    }
                }
                String var8 = this.getParameter(field9728[45]);
                if (var8 != null && var8.equals(field9728[53])) {
                    class4.field59 = true;
                }
                String var9 = this.getParameter(field9728[47]);
                if (var9 != null) {
                    try {
                        class451.field6613 = Integer.parseInt(var9);
                    } catch (Exception var13) {
                    }
                }
                String var10 = this.getParameter(field9728[46]);
                if (var10 != null) {
                    try {
                        class791.field11509 = Long.parseLong(var10);
                    } catch (NumberFormatException var12) {
                    }
                }
                class799.field11615 = this.getParameter(field9728[49]);
                if (class799.field11615 != null && class799.field11615.length() > 50) {
                    class799.field11615 = null;
                }
                class572.field8287 = this;
                if (class544.field7978 == class378.field5530) {
                    class791.field11507 = 503;
                    class500.field7304 = 765;
                } else if (class544.field7978 == class316.field4323) {
                    class500.field7304 = 640;
                    class791.field11507 = 480;
                }
                this.method5453(658, 37, class544.field7978.field11574, 0, class791.field11507, class797.field11583.method1457(28687) + 32, class500.field7304);
            }
        } catch (RuntimeException var17) {
            throw class665.method4799(var17, field9728[54] + ')');
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
    private final void method4965(byte arg0) {
        try {
            field9725++;
            if (class559.field8139 != 16) {
                long var2 = class341.method2742(true) / 1000000L - class639.field9079;
                class639.field9079 = class341.method2742(true) / 1000000L;
                boolean var4 = class86.method862(356);
                if (var4 && class399.field5812 && class499.field7298 != null) {
                    class499.field7298.method3430(2000);
                }
                if (class381.method3007(class559.field8139, (byte) -126)) {
                    if (class527.field7669 != 0L && class527.field7669 < class614.method4531(-56)) {
                        class585.method4331(class380.field5550, class279.field3936, class680.method4883(49), true, false);
                    } else if (!class236.field3418.method215() && class706.field9874) {
                        class247.method2013(-125);
                    }
                }
                if (class321.field4374 == null) {
                    Container var5;
                    if (class543.field7942 != null) {
                        var5 = class543.field7942;
                    } else if (class290.field4091 == null) {
                        var5 = class743.field10561;
                    } else {
                        var5 = class290.field4091;
                    }
                    int var6 = var5.getSize().width;
                    int var7 = var5.getSize().height;
                    if (class543.field7942 == var5) {
                        Insets var8 = class543.field7942.getInsets();
                        var6 -= var8.right + var8.left;
                        var7 -= var8.top + var8.bottom;
                    }
                    if (class792.field11523 != var6 || class40.field615 != var7 || class381.field5555) {
                        if (class236.field3418 == null || class236.field3418.method216()) {
                            class169.method1422((byte) 20);
                        } else {
                            class40.field615 = var7;
                            class792.field11523 = var6;
                        }
                        class527.field7669 = class614.method4531(-115) + 500L;
                        class381.field5555 = false;
                    }
                }
                if (class321.field4374 != null && !class257.field3676 && class381.method3007(class559.field8139, (byte) -126)) {
                    class585.method4331(-1, -1, class451.field6612.field9129.method1595(3), true, false);
                }
                boolean var9 = false;
                if (class485.field7121) {
                    class485.field7121 = false;
                    var9 = true;
                }
                if (var9) {
                    class595.method4389(8976);
                }
                if (class236.field3418 != null && class236.field3418.method215() || class680.method4883(-117) != 1) {
                    class591.method4369(0);
                }
                if (class108.method1023(123, class559.field8139)) {
                    class543.method4095(var9, (byte) 67);
                } else if (class419.method3264(false, class559.field8139)) {
                    class14.method95(0);
                } else if (class195.method1695(14756, class559.field8139)) {
                    class14.method95(0);
                } else if (class288.method2341(class559.field8139, (byte) -106)) {
                    if (class772.field11000 == 1) {
                        if (class36.field433 > class11.field146) {
                            class11.field146 = class36.field433;
                        }
                        int var10 = (class11.field146 - class36.field433) * 50 / class11.field146;
                        class649.method4730(2, class84.field1185, class537.field7842.method4068((byte) -94, class405.field5883) + field9728[39] + var10 + field9728[38], class23.field279, class236.field3418, true);
                    } else if (class772.field11000 == 2) {
                        if (class185.field2400 > class725.field10316) {
                            class725.field10316 = class185.field2400;
                        }
                        int var11 = (class725.field10316 - class185.field2400) * 50 / class725.field10316 + 50;
                        class649.method4730(2, class84.field1185, class537.field7842.method4068((byte) -98, class405.field5883) + field9728[39] + var11 + field9728[38], class23.field279, class236.field3418, true);
                    } else {
                        class649.method4730(2, class84.field1185, class537.field7842.method4068((byte) -77, class405.field5883), class23.field279, class236.field3418, true);
                    }
                } else if (class559.field8139 == 11) {
                    class594.method4381(-121, var2);
                } else if (class559.field8139 == 14) {
                    class649.method4730(2, class84.field1185, class537.field7844.method4068((byte) -66, class405.field5883) + field9728[37] + class537.field7845.method4068((byte) -120, class405.field5883), class23.field279, class236.field3418, false);
                } else if (class559.field8139 == 15) {
                    class649.method4730(2, class84.field1185, class537.field7861.method4068((byte) -92, class405.field5883), class23.field279, class236.field3418, false);
                }
                if (class209.field3041 == 3) {
                    for (int var12 = 0; var12 < class153.field1962; var12++) {
                        Rectangle var13 = class353.field5107[var12];
                        if (class106.field1387[var12]) {
                            class236.field3418.method241(var13.height, var13.y, -65281, -50, var13.width, var13.x);
                        } else if (class7.field92[var12]) {
                            class236.field3418.method241(var13.height, var13.y, -65536, -33, var13.width, var13.x);
                        } else {
                            class236.field3418.method241(var13.height, var13.y, -16711936, -93, var13.width, var13.x);
                        }
                    }
                }
                if (arg0 >= -117) {
                    field9714 = null;
                }
                if (class101.method985((byte) 16)) {
                    class434.method3379(class236.field3418, 21);
                }
                if (class651.field9249.field2483 && class381.method3007(class559.field8139, (byte) -126) && class209.field3041 == 0 && class680.method4883(104) == 1 && !var9) {
                    int var16 = 0;
                    for (int var17 = 0; var17 < class153.field1962; var17++) {
                        if (class7.field92[var17]) {
                            class7.field92[var17] = false;
                            class301.field4193[var16++] = class353.field5107[var17];
                        }
                    }
                    try {
                        if (class212.field3119) {
                            class70.method730(var16, 14, class301.field4193);
                        } else {
                            class236.field3418.method183(var16, true, class301.field4193);
                        }
                    } catch (class142 var20) {
                    }
                } else if (!class108.method1023(-118, class559.field8139)) {
                    for (int var14 = 0; var14 < class153.field1962; var14++) {
                        class7.field92[var14] = false;
                    }
                    try {
                        if (class212.field3119) {
                            class626.method4598(3163);
                        } else {
                            class236.field3418.method131((byte) 87);
                        }
                    } catch (class142 var21) {
                        class162.method1374(var21, var21.getMessage() + field9728[6] + this.method4953(-127), (byte) -93);
                        class279.method2271(7, false, 0);
                    }
                }
                class474.method3662((byte) 47);
                int var18 = class451.field6612.field9123.method3357(3);
                if (var18 == 0) {
                    class449.method3474(20817, 15L);
                } else if (var18 == 1) {
                    class449.method3474(20817, 10L);
                } else if (var18 == 2) {
                    class449.method3474(20817, 5L);
                } else if (var18 == 3) {
                    class449.method3474(20817, 2L);
                }
                if (class514.field7560) {
                    class29.method324((byte) -90);
                }
                if (class451.field6612.field9138.method4468(3) == 1 && class559.field8139 == 3 && class572.field8291 != -1) {
                    class451.field6612.method4681(0, class451.field6612.field9138, (byte) -111);
                    class536.method4064(10);
                }
            }
        } catch (RuntimeException var22) {
            throw class665.method4799(var22, field9728[40] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V")
    private final void method4966(boolean arg0) {
        try {
            if (class559.field8139 == 7 && !class514.method3940((byte) 2) || class559.field8139 == 9 && class555.field8081 == 42) {
                if (class179.field2331 > 1) {
                    class179.field2331--;
                    class190.field2522 = class522.field7612;
                }
                if (!class86.field1217) {
                    class161.method1360(50);
                }
                for (int var2 = 0; var2 < 100 && class263.method2175(class60.field911, 39); var2++) {
                }
            }
            field9706++;
            class393.field5721++;
            class298.method2391(null, -1, (byte) -86, -1);
            class281.method2289(null, -1, -114, -1);
            class472.method3637(110);
            class522.field7612++;
            for (int var3 = 0; var3 < class715.field10182; var3++) {
                class717 var4 = class677.field9494[var3].field7672;
                if (var4 != null) {
                    byte var5 = var4.field10229.field1676;
                    if ((var5 & 0x1) != 0) {
                        int var6 = var4.method1437((byte) -28);
                        if ((var5 & 0x2) != 0 && var4.field2257 == 0 && Math.random() * 1000.0D < 10.0D) {
                            int var7 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                            int var8 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                            if (var7 != 0 || var8 != 0) {
                                int var9 = var4.field2252[0] + var7;
                                if (var9 < 0) {
                                    var9 = 0;
                                } else if (var9 > (class625.field8929 - var6 - 1)) {
                                    var9 = class625.field8929 - var6 - 1;
                                }
                                int var10 = var4.field2256[0] + var8;
                                if (var10 < 0) {
                                    var10 = 0;
                                } else if ((class14.field187 - var6 - 1) < var10) {
                                    var10 = class14.field187 - var6 - 1;
                                }
                                int var11 = class670.method4825(var6, var6, var4.field2256[0], var4.field2252[0], var9, class480.field7073, class584.field8433, 0, 15705, class195.field2919[var4.field2981], -1, true, 0, var6, var10);
                                if (var11 > 0) {
                                    if (var11 > 9) {
                                        var11 = 9;
                                    }
                                    for (int var12 = 0; var12 < var11; var12++) {
                                        var4.field2252[var12] = class480.field7073[var11 - var12 - 1];
                                        var4.field2256[var12] = class584.field8433[var11 - var12 - 1];
                                        var4.field2254[var12] = 1;
                                    }
                                    var4.field2257 = var11;
                                }
                            }
                        }
                        method4954((byte) 126, true, var4);
                        int var13 = class619.method4554(var4, false);
                        class314.method2499(32, var4);
                        class443.method3451(var4, 6144, var13, class657.field9310, class71.field1036);
                        class558.method4176(var4, class657.field9310, (byte) 1);
                        class150.method1278(-2, var4);
                    }
                }
            }
            if ((!class514.method3940((byte) 2) || class559.field8139 == 9 && class555.field8081 == 42) && class189.field2516 == 0) {
                if (class596.field8579 == 2) {
                    class320.method2538(false);
                } else {
                    class738.method5354(-119);
                }
                if ((class670.field9442 >> 9) < 14 || (class625.field8929 - 14) <= (class670.field9442 >> 9) || class688.field9635 >> 9 < 14 || (class14.field187 - 14) <= (class688.field9635 >> 9)) {
                    class429.method3314((byte) -126);
                }
            }
            while (true) {
                class618 var14;
                class782 var15;
                class782 var16;
                do {
                    var14 = (class618) class733.field10456.method3980(-27119);
                    if (var14 == null) {
                        while (true) {
                            class618 var17;
                            class782 var18;
                            class782 var19;
                            do {
                                var17 = (class618) class129.field1605.method3980(-27119);
                                if (var17 == null) {
                                    while (true) {
                                        class618 var20;
                                        class782 var21;
                                        class782 var22;
                                        do {
                                            var20 = (class618) class594.field8536.method3980(-27119);
                                            if (var20 == null) {
                                                if (class543.field7943 != null) {
                                                    class723.method5231(0);
                                                }
                                                if (class694.field9700 % 1500 == 0) {
                                                    class40.method462(false);
                                                }
                                                if (class559.field8139 == 7 && !class514.method3940((byte) 2) || class559.field8139 == 9 && class555.field8081 == 42) {
                                                    class504.method3855(27);
                                                }
                                                class551.method4123((byte) -67);
                                                if (class204.field2995 && (class614.method4531(-111) - 60000L) > class291.field4101) {
                                                    class692.method4937(30908);
                                                }
                                                for (class129 var23 = (class129) class107.field1412.method3617(arg0); var23 != null; var23 = (class129) class107.field1412.method3612(3)) {
                                                    if (((long) var23.field1603) < (class614.method4531(-35) / 1000L - 5L)) {
                                                        if (var23.field1606 > 0) {
                                                            class459.method3533("", (byte) 55, "", "", 0, var23.field1610 + class537.field7849.method4068((byte) -38, class405.field5883), 5);
                                                        }
                                                        if (var23.field1606 == 0) {
                                                            class459.method3533("", (byte) 55, "", "", 0, var23.field1610 + class537.field7850.method4068((byte) -73, class405.field5883), 5);
                                                        }
                                                        var23.method4736(0);
                                                    }
                                                }
                                                if (class559.field8139 == 7 && !class514.method3940((byte) 2) || class559.field8139 == 9 && class555.field8081 == 42) {
                                                    if (class559.field8139 != 9 && class60.field911.field11096 == null) {
                                                        class794.method5727(-1, false);
                                                        return;
                                                    }
                                                    if (class60.field911 != null) {
                                                        class60.field911.field11107++;
                                                        if (class60.field911.field11107 > 50) {
                                                            class38.field595++;
                                                            class274 var24 = class375.method2969((byte) 1, class691.field9664, class60.field911.field11100);
                                                            class60.field911.method5608(var24, 29867);
                                                        }
                                                        try {
                                                            class60.field911.method5603(0);
                                                            return;
                                                        } catch (IOException var26) {
                                                            if (class559.field8139 != 9) {
                                                                class794.method5727(-1, false);
                                                                return;
                                                            }
                                                            class60.field911.method5604(1350);
                                                            return;
                                                        }
                                                    }
                                                }
                                                return;
                                            }
                                            var21 = var20.field8805;
                                            if (var21.field11206 < 0) {
                                                break;
                                            }
                                            var22 = class435.method3389(var21.field11136, (byte) -124);
                                        } while (var22 == null || var22.field11148 == null || var21.field11206 >= var22.field11148.length || var22.field11148[var21.field11206] != var21);
                                        class158.method1334(var20);
                                    }
                                }
                                var18 = var17.field8805;
                                if (var18.field11206 < 0) {
                                    break;
                                }
                                var19 = class435.method3389(var18.field11136, (byte) -118);
                            } while (var19 == null || var19.field11148 == null || var19.field11148.length <= var18.field11206 || var19.field11148[var18.field11206] != var18);
                            class158.method1334(var17);
                        }
                    }
                    var15 = var14.field8805;
                    if (var15.field11206 < 0) {
                        break;
                    }
                    var16 = class435.method3389(var15.field11136, (byte) -114);
                } while (var16 == null || var16.field11148 == null || var15.field11206 >= var16.field11148.length || var16.field11148[var15.field11206] != var15);
                class158.method1334(var14);
            }
        } catch (RuntimeException var27) {
            throw class665.method4799(var27, field9728[42] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
    public final void method4967(int arg0) {
        try {
            field9719++;
            if (class451.field6612.field9134.method4717(3) == 2) {
                try {
                    this.method4972(true);
                } catch (ThreadDeath var6) {
                    throw var6;
                } catch (Throwable var7) {
                    class162.method1374(var7, var7.getMessage() + field9728[6] + this.method4953(-82), (byte) -93);
                    class615.field8784 = true;
                    class279.method2271(7, false, 0);
                }
            } else {
                this.method4972(true);
            }
            int var4 = 120 % ((-arg0 - 88) / 36);
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field9728[13] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(Z)V")
    private final void method4968(boolean arg0) {
        try {
            if (arg0) {
                field9714 = null;
            }
            field9711++;
            boolean var2 = class45.field646.method5021(-1);
            if (!var2) {
                this.method4974(2);
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field9728[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Lvo;)Lvo;")
    public static final class782 method4969(class782 arg0) {
        int var1 = method4957(arg0).method1185((byte) -79);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class435.method3389(arg0.field11136, (byte) -116);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
    public final void method4970(byte arg0) {
        try {
            method4961(512);
            field9721++;
            class444.method3454(-74);
            class294.method2377(4707);
            class537.method4072(1);
            class331.method2606((byte) -29);
            class791.method5705(-88);
            class8.method59(true);
            class301.method2410(21530);
            class381.method3008(arg0 ^ 0x74C2);
            class403.method3161(true);
            class405.method3171(10);
            class84.method824((byte) 114);
            class459.method3534(0);
            class167.method1405((byte) 65);
            class273.method2238(false);
            class760.method5506((byte) -128);
            class36.method373(2);
            class687.method4912(3);
            class578.method4292((byte) 96);
            class514.method3933(arg0 - 221);
            class477.method3700(arg0 - 3);
            class752.method5455(arg0 - 103);
            class320.method2539(true);
            class173.method1458(122);
            class741.method5369(125);
            class796.method5742(102);
            class104.method996(91);
            class18.method152(115);
            class640.method4676(arg0 ^ 0xFFFFFFFB);
            class337.method2708(arg0 - 198);
            class490.method3772(-238043880);
            class524.method3973((byte) 125);
            class678.method4860((byte) 95);
            class492.method3791((byte) -127);
            class47.method510((byte) 82);
            class350.method2795((byte) -30);
            class611.method4513(arg0 - 185);
            class343.method2754(true);
            class290.method2354((byte) -106);
            class590.method4349(arg0);
            class354.method2830(500);
            class269.method2204(-67);
            class415.method3242(arg0 - 40);
            class57.method605((byte) 126);
            class725.method5247((byte) -6);
            class226.method1884(100);
            class449.method3477(255);
            class580.method4306(true);
            class486.method3747(arg0 ^ 0x31);
            class234.method1937(true);
            class520.method3954(arg0 - 676427332);
            class632.method4621(-27483);
            class28.method317(-16457);
            class779.method5605(0);
            class560.method4193(-127);
            class532.method4026(0);
            class302.method2418((byte) -127);
            class794.method5722((byte) -30);
            class715.method5190((byte) 113);
            class663.method4795(104);
            class470.method3609(arg0 ^ 0x66);
            class189.method1587((byte) -36);
            class359.method2869(arg0 - 90);
            class26.method301(-1);
            class180.method1500(-20521);
            class274.method2245(-113);
            class621.method4566((byte) 29);
            class260.method2163(-96);
            class135.method1186((byte) 99);
            class683.method4895(false);
            class261.method2167(arg0 - 206);
            class646.method4704(121);
            class476.method3679((byte) 119);
            class531.method4018(16);
            class651.method4738(arg0 ^ 0x64);
            class737.method5351(-127);
            class592.method4372((byte) 115);
            class614.method4530(5583);
            class380.method3003(arg0 - 168);
            class287.method2333(arg0 - 189);
            class583.method4319(arg0 + 6);
            class792.method5711(-79);
            class644.method4700((byte) 115);
            class643.method4697(29);
            class38.method444((byte) 31);
            class111.method1043((byte) 111);
            class552.method4130(-32283);
            class248.method2021(100);
            class289.method2349(19300);
            class43.method475(-16);
            class249.method2027((byte) 44);
            class471.method3634(arg0 ^ 0xFFFFFFE5);
            class363.method2891(-109);
            class761.method5511((byte) 101);
            class128.method1133((byte) 102);
            class277.method2261(53);
            class774.method5568(-6465);
            class369.method2923(-72);
            class305.method2450(false);
            class789.method5686(true);
            class60.method651(0);
            class795.method5737((byte) -116);
            class751.method5438(0);
            class626.method4596(-80);
            class434.method3380(arg0 ^ 0x6D);
            class371.method2929(-98);
            class216.method1822(0);
            class72.method756(65);
            class23.method277(false);
            class342.method2746(true);
            class267.method2193(0);
            class293.method2368(arg0 - 99);
            class364.method2896(-97);
            class474.method3660(true);
            class736.method5346(arg0 - 26320);
            class299.method2396(119);
            class511.method3901(3);
            class225.method1878(110);
            class755.method5477(256);
            class118.method1073(-9722);
            class115.method1057(-124);
            class530.method4014(false);
            class787.method5664(62);
            class587.method4338(arg0 ^ 0xFFFFC1B8);
            class483.method3728((byte) 7);
            class647.method4714(-122);
            class750.method5432(arg0 + 1313245216);
            class146.method1259(0);
            class191.method1596((byte) -20);
            class127.method1127(-116);
            class109.method1028(true);
            class431.method3358(1);
            class605.method4469(false);
            class314.method2500(0);
            class254.method2131(arg0 + 20);
            class142.method1229(arg0 ^ 0x64);
            class348.method2783(true);
            class161.method1362(arg0 - 103);
            class788.method5672((byte) -125);
            class330.method2599(true);
            class35.method359((byte) -100);
            class604.method4465((byte) -122);
            class202.method1733((byte) 98);
            class429.method3331(74);
            class440.method3428((byte) 79);
            class441.method3433((byte) 67);
            class437.method3405(-26883);
            class158.method1332();
            class125.method1114(false);
            class574.method4269((byte) 37);
            class107.method1017((byte) 127);
            class397.method3098(-11);
            class378.method2988(false);
            class89.method880(false);
            class754.method5466(false);
            class20.method254((byte) 103);
            class176.method1478(-125);
            class744.method5389(121);
            class746.method5399(19);
            class758.method5497(arg0 ^ 0xFFFFEC49);
            class748.method5416((byte) -22);
            class610.method4506(-112);
            class321.method2543((byte) -119);
            class679.method4877((byte) -123);
            class282.method2293(6);
            class322.method2550(arg0 - 102);
            class124.method1110(50);
            class534.method4050();
            class272.method2228(0);
            class674.method4836(0);
            class732.method5327(110);
            class105.method1001(102);
            class12.method82(3);
            class499.method3828(arg0 + 24773);
            class479.method3709(9697);
            class217.method1838((byte) -122);
            class297.method2384(-11370);
            class311.method2486(arg0 - 50);
            class453.method3509(-96);
            class550.method4119((byte) -36);
            class7.method49(true);
            class464.method3576();
            class765.method5526((byte) 68);
            class393.method3077((byte) 116);
            class562.method4207(false);
            class565.method4222((byte) -89);
            class568.method4238((byte) -74);
            class203.method1739(-13);
            class336.method2697(28802);
            class353.method2820((byte) 33);
            class484.method3738();
            class231.method1918((byte) 71);
            class357.method2857(126);
            class706.method5063(arg0 - 103);
            class558.method4175(-96);
            class745.method5393(true);
            class618.method4550((byte) 124);
            class90.method888(false);
            class100.method976(106);
            class717.method5201(21130);
            class319.method2532(arg0 - 28);
            class207.method1762(false);
            class382.method3014(false);
            class376.method2977((byte) -24);
            class122.method1100((byte) -73);
            class571.method4253((byte) 42);
            class219.method1851((byte) -99);
            class412.method3224(84);
            class83.method817();
            class510.method3893(4392);
            class264.method2182(-111);
            class533.method4030(6);
            class616.method4542(-97);
            class669.method4813(47);
            class284.method2302();
            class198.method1714(true);
            class351.method2799(arg0 ^ 0xFFFFFFE8);
            class797.method5745((byte) 5);
            class375.method2968(arg0 - 87);
            class628.method4609((byte) 0);
            class193.method1603(true);
            class570.method4250(-20933);
            class239.method1979(0);
            class259.method2157(-48);
            class186.method1542();
            class97.method958(arg0 ^ 0x98);
            class106.method1012(-6);
            class67.method708((byte) -111);
            class596.method4400(arg0 - 224);
            class11.method77(arg0 ^ 0xFFFFFF61);
            class153.method1299(4519);
            class690.method4929(-23558);
            class210.method1777(-26);
            class539.method4087((byte) 102);
            class424.method3294(-65);
            class585.method4328((byte) -72);
            class340.method2733(-73);
            class119.method1081(false);
            class672.method4833(10);
            class425.method3298((byte) 120);
            class692.method4938((byte) -78);
            class224.method1874(6939);
            class238.method1970(-244);
            class74.method766(0);
            class21.method259(-126);
            class625.method4590(122);
            class230.method1908((byte) 122);
            class87.method865(true);
            class747.method5405((byte) 123);
            class447.method3469(-84);
            class206.method1759(3);
            class594.method4383(0);
            class442.method3439(arg0 ^ 0xB);
            class714.method5175(512);
            class671.method4829(-18339);
            class15.method100(false);
            class716.method5194((byte) -84);
            class466.method3584(-8137);
            class365.method2912(arg0 - 103);
            class710.method5079(0);
            class55.method577(-107);
            class80.method795((byte) 85);
            class306.method2453(false);
            class677.method4853(-5);
            class360.method2885((byte) -16);
            class240.method1986(arg0 ^ 0xFFFFFF38);
            class4.method28(arg0);
            class543.method4098(arg0 - 6);
            class51.method556((byte) 114);
            class427.method3302(arg0 - 103);
            class44.method481(arg0);
            class753.method5459((byte) -52);
            class232.method1926(9960);
            class778.method5598((byte) -126);
            class667.method4804((byte) 87);
            class684.method4901((byte) -64);
            class246.method2005(false);
            class9.method62(true);
            class658.method4777(arg0 ^ 0x67);
            class659.method4782(37);
            class147.method1265(-27138);
            class182.method1511(-100);
            class409.method3213(-25);
            class323.method2559((byte) -125);
            class155.method1302((byte) 104);
            class33.method346(30735);
            class54.method569((byte) -72);
            class45.method485(arg0 ^ 0x1E);
            class190.method1590(119);
            class156.method1310(1);
            class110.method1036((byte) 76);
            class76.method770(1038186785);
            class420.method3270();
            class211.method1783((byte) 89);
            class433.method3371((byte) -42);
            class101.method988((byte) 85);
            class276.method2252((byte) 104);
            class705.method5059(25238);
            class2.method16(1);
            class468.method3592(-93);
            class563.method4211((byte) 115);
            class229.method1905(true);
            class138.method1208(arg0 - 218);
            class785.method5652(0);
            class529.method4007((byte) -91);
            class482.method3721(arg0 ^ 0x5EAC);
            class341.method2737(false);
            class108.method1022(arg0 ^ 0x3B);
            class136.method1191((byte) 52);
            class395.method3087(false);
            class554.method4146();
            class607.method4483((byte) 115);
            class317.method2520(arg0 ^ 0x65);
            class456.method3519();
            class233.method1930();
            class367.method2920((byte) 101);
            class235.method1947(arg0 ^ 0x98E);
            class454.method3512();
            class653.method4746(true);
            class518.method3945((byte) 114);
            class145.method1255(-97);
            class635.method4634((byte) 70);
            class169.method1419(-31402);
            class777.method5595((byte) -119);
            class505.method3862(10);
            class50.method547((byte) 94);
            class271.method2218(arg0 ^ 0x2777);
            class742.method5375(0);
            class462.method3550((byte) 109);
            class650.method4733(4);
            class222.method1863(-1);
            class379.method2996(true);
            class312.method2490((byte) 42);
            class776.method5585((byte) 109);
            class720.method5213(6594);
            class213.method1792((byte) -116);
            class512.method3910();
            class507.method3879((byte) -42);
            class324.method2563((byte) 77);
            class345.method2770(1);
            class123.method1104(-20769);
            class701.method5046(arg0 - 221);
            class257.method2147(1);
            class201.method1726(arg0 + 22441);
            class702.method5052(false);
            class236.method1956(1);
            class603.method4458((byte) 45);
            class372.method2950(0);
            class49.method543(true);
            class10.method70(arg0 - 229);
            class452.method3504((byte) -124);
            class693.method4943(arg0 - 226);
            class157.method1316(true);
            class451.method3498((byte) 66);
            class344.method2761((byte) 10);
            class660.method4786((byte) 83);
            class536.method4060((byte) 8);
            class194.method1668(-26520);
            class463.method3559((byte) -119);
            class561.method4196(arg0 ^ 0x4B);
            class504.method3854(-109);
            class209.method1773(1);
            class162.method1384((byte) -108);
            class513.method3920(-5088);
            class117.method1069((byte) -127);
            class58.method614((byte) -16);
            class268.method2198(-34038);
            class435.method3384(false);
            class316.method2512(arg0 - 103);
            class318.method2526((byte) 50);
            class112.method1047((byte) -119);
            class334.method2636(true);
            class212.method1786(2);
            class496.method3817(arg0 ^ 0x6CFA);
            class130.method1141(false);
            class639.method4671((byte) 110);
            class733.method5332(arg0 - 12906);
            class740.method5366(-122);
            class599.method4419((byte) 10);
            class270.method2213(2023);
            class564.method4217(false);
            class137.method1194(87);
            class218.method1845(arg0 ^ 0xFFFFFF98);
            class250.method2032((byte) 56);
            class608.method4490((byte) 100);
            class121.method1092((byte) -110);
            class700.method5040((byte) 127);
            class713.method5160(3);
            class799.method5766(101);
            class352.method2814();
            class654.method4750(arg0 - 103);
            class410.method3217(-105);
            class735.method5341(4096);
            class327.method2580(true);
            class298.method2392((byte) -124);
            class99.method972(115);
            class699.method5037(27874);
            class768.method5547(3);
            class703.method5055((byte) 47);
            class634.method4630(false);
            class631.method4614(arg0 + 3993);
            class200.method1722(-31980);
            class481.method3717(-123);
            class620.method4562((byte) -100);
            class502.method3842(-63);
            class652.method4742(false);
            class195.method1692(-2116253268);
            class41.method469((byte) 110);
            class309.method2462(120);
            class98.method967(32);
            class53.method564((byte) -39);
            class762.method5522(false);
            class460.method3540(90);
            class582.method4314((byte) 63);
            class757.method5491((byte) -102);
            class648.method4722(-17671);
            class358.method2866((byte) 83);
            class555.method4157((byte) -68);
            class546.method4107((byte) 119);
            class208.method1767(arg0 + 1945);
            class709.method5073(arg0 ^ 0xFFFFFFE6);
            class615.method4534(338);
            class91.method895();
            class597.method4404(-19350);
            class303.method2437((byte) -128);
            class495.method3812(99);
            class385.method3032(-87);
            class557.method4170((byte) 116);
            class446.method3465(arg0 ^ 0x28);
            class503.method3847(107);
            class1.method4(1);
            class622.method4570(1);
            class584.method4323(arg0 - 194);
            class349.method2786(-4);
            class487.method3752(true);
            class215.method1809(15);
            class96.method952(arg0 - 102);
            class113.method1050(true);
            class63.method674(arg0 ^ 0x8863);
            class326.method2574((byte) 125);
            class143.method1239((byte) -41);
            class581.method4310(-34);
            class13.method89(127);
            class356.method2847(arg0 ^ 0x63);
            class572.method4256(-93);
            class46.method490(-94);
            class443.method3449((byte) 63);
            class767.method5541(arg0 - 24);
            class493.method3806(37);
            class304.method2442(121);
            class103.method991(arg0 + 3214);
            class686.method4907(4);
            class501.method3837(arg0 + 667);
            class396.method3094(0);
            class457.method3522(11160);
            class551.method4124((byte) -84);
            class221.method1857(arg0 - 103);
            class613.method4524((byte) 68);
            class432.method3368((byte) 98);
            class383.method3020(-77);
            class430.method3349(-127);
            class544.method4103(true);
            class538.method4081((byte) -116);
            class591.method4365(-19467);
            class140.method1218((byte) 123);
            class347.method2779(arg0 + 4);
            class467.method3588((byte) -45);
            class438.method3416(arg0 ^ 0x27);
            class772.method5561(arg0 - 27640);
            class151.method1283(20586);
            class61.method663(114);
            class734.method5335((byte) 91);
            class414.method3232(arg0 + 3211);
            class602.method4448(true);
            class696.method5015((byte) -75);
            class308.method2456(arg0 + 33964);
            class637.method4642(arg0 ^ 0xFFFFFFED);
            class790.method5699(-1);
            class355.method2842(1);
            class784.method5648(59);
            class3.method22(true);
            class391.method3056(true);
            class288.method2340(arg0 - 3);
            class465.method3580((byte) 76);
            class522.method3968((byte) 73);
            class759.method5502((byte) 83);
            class256.method2143((byte) 84);
            class279.method2275(true);
            class694.method4947(0);
            class292.method2364((byte) 111);
            class247.method2016((byte) 60);
            class29.method322((byte) -50);
            class255.method2134(arg0 ^ 0xFFFFFF9B);
            class263.method2173((byte) -88);
            class129.method1136(false);
            class489.method3763(-1);
            class617.method4546(125);
            class682.method4892(-6);
            class500.method3834(123);
            class488.method3758(arg0 - 224);
            class384.method3024(32590);
            class150.method1280(-1863171896);
            class126.method1121((byte) -34);
            class727.method5294(false);
            class801.method5776(-52);
            class228.method1896((byte) -71);
            class627.method4603(false);
            class559.method4183((byte) -104);
            class52.method561(-123);
            class14.method94(-126);
            class387.method3037((byte) 45);
            class114.method1053(true);
            class184.method1520(-1123);
            class17.method114((byte) 107);
            class783.method5643((byte) 97);
            class283.method2299((byte) 67);
            class601.method4442(-1);
            class278.method2267(-30684);
            class491.method3782(true);
            class164.method1397(-1);
            class786.method5660(false);
            class525.method3990(0);
            class30.method330((byte) -5);
            class450.method3486(-22006);
            class390.method3053(60);
            class508.method3883(arg0 - 102);
            class5.method33((byte) -121);
            class71.method747(-68);
            class185.method1524(-81);
            class62.method669(10);
            class281.method2288((byte) 42);
            class24.method281((byte) 52);
            class480.method3713(false);
            class398.method3115((byte) -126);
            class445.method3459((byte) 39);
            class144.method1243(-85);
            class16.method107(2);
            class723.method5230(false);
            class285.method2305((byte) 44);
            class722.method5226(arg0 + 21);
            class160.method1351(-91);
            class177.method1483((byte) 115);
            class521.method3960(13);
            class691.method4934((byte) -70);
            class721.method5218(true);
            class553.method4134((byte) -124);
            class731.method5324((byte) 62);
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field9728[94] + arg0 + ')');
        }
        if (class752.field10743) {
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "()V")
    public static final void method4971() {
        int var0 = class689.field9642;
        int[] var1 = class599.field8595;
        int var2 = class451.field6612.field9096.method1879(3);
        boolean var3 = var2 == 1 && var0 > 200 || var2 == 0 && var0 > 50;
        for (int var4 = 0; var4 < var0; var4++) {
            class339 var14 = class748.field10666[var1[var4]];
            if (!var14.method2726(123)) {
                var14.field2174 = -1;
            } else if (var14.field4937) {
                var14.field2174 = -1;
            } else {
                var14.method1427((byte) -11);
                if (var14.field8663 >= 0 && var14.field8669 >= 0 && var14.field8666 < class625.field8929 && var14.field8661 < class14.field187) {
                    var14.field4939 = var14.field2204 ? var3 : false;
                    if (class203.field2988 == var14) {
                        var14.field2174 = Integer.MAX_VALUE;
                    } else {
                        int var15 = 0;
                        if (!var14.field2212) {
                            var15++;
                        }
                        if (var14.field2214 > class694.field9700) {
                            var15 += 2;
                        }
                        int var16 = var15 + (5 - var14.method1437((byte) -28) << 2);
                        if (var14.field4909 || var14.field4910) {
                            var16 += 512;
                        } else {
                            if (class440.field6490 == 0) {
                                var16 += 32;
                            } else {
                                var16 += 128;
                            }
                            var16 += 256;
                        }
                        var14.field2174 = var16 + 1;
                    }
                } else {
                    var14.field2174 = -1;
                }
            }
        }
        for (int var5 = 0; var5 < class438.field6458; var5++) {
            class717 var11 = ((class527) class479.field7063.method3693(false, (long) class343.field4987[var5])).field7672;
            if (var11.method5204(16) && var11.field10229.method1177(class734.field10459, 104)) {
                var11.method1427((byte) -82);
                if (var11.field8663 >= 0 && var11.field8669 >= 0 && var11.field8666 < class625.field8929 && var11.field8661 < class14.field187) {
                    int var12 = 0;
                    if (!var11.field2212) {
                        var12++;
                    }
                    if (var11.field2214 > class694.field9700) {
                        var12 += 2;
                    }
                    int var13 = var12 + (5 - var11.method1437((byte) -28) << 2);
                    if (class440.field6490 == 0) {
                        if (var11.field10229.field1677) {
                            var13 += 64;
                        } else {
                            var13 += 128;
                        }
                    } else if (class440.field6490 == 1) {
                        if (var11.field10229.field1677) {
                            var13 += 32;
                        } else {
                            var13 += 64;
                        }
                    }
                    if (var11.field10229.field1707) {
                        var13 += 1024;
                    } else if (!var11.field10229.field1687) {
                        var13 += 256;
                    }
                    var11.field2174 = var13 + 1;
                } else {
                    var11.field2174 = -1;
                }
            } else {
                var11.field2174 = -1;
            }
        }
        for (int var6 = 0; var6 < class99.field1336.length; var6++) {
            class337 var7 = class99.field1336[var6];
            if (var7 != null) {
                if (var7.field4876 == 1) {
                    class527 var8 = (class527) class479.field7063.method3693(false, (long) var7.field4877);
                    if (var8 != null) {
                        class717 var9 = var8.field7672;
                        if (var9.field2174 >= 0) {
                            var9.field2174 += 2048;
                        }
                    }
                } else if (var7.field4876 == 10) {
                    class339 var10 = class748.field10666[var7.field4877];
                    if (var10 != null && class203.field2988 != var10 && var10.field2174 >= 0) {
                        var10.field2174 += 2048;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(Z)V")
    private final void method4972(boolean arg0) {
        try {
            field9710++;
            if (class559.field8139 != 16) {
                class694.field9700++;
                if ((class694.field9700 % 1000) == 1) {
                    GregorianCalendar var2 = new GregorianCalendar();
                    class23.field273 = var2.get(11) * 600 - (-(var2.get(12) * 10) - (var2.get(13) / 6));
                    class799.field11609.setSeed((long) class23.field273);
                }
                class60.field916.method5606(7732);
                class60.field911.method5606(7732);
                this.method4968(false);
                if (class722.field10274 != null) {
                    class722.field10274.method2189((byte) 110);
                }
                class250.method2034((byte) 17);
                class159.method1342(-8785);
                class496.field7286.method2602(true);
                class604.field8668.method2877((byte) -35);
                if (class236.field3418 != null) {
                    class236.field3418.method175((int) class614.method4531(-105));
                }
                class140.method1217((byte) 124);
                class330.field4506 = 0;
                class9.field104 = 0;
                for (class781 var3 = class496.field7286.method2605(-77); var3 != null; var3 = class496.field7286.method2605(-83)) {
                    int var4 = var3.method3489(112);
                    if (var4 == 2 || var4 == 3) {
                        char var5 = var3.method3488(-4705);
                        if (class482.method3724(1027279812) && (var5 == '`' || var5 == '§' || var5 == '²')) {
                            if (class101.method985((byte) -90)) {
                                class367.method2916((byte) -123);
                            } else {
                                class660.method4787(0);
                            }
                        } else if (class9.field104 < 128) {
                            class327.field4479[class9.field104] = var3;
                            class9.field104++;
                        }
                    } else if (var4 == 0 && class330.field4506 < 75) {
                        class551.field8047[class330.field4506] = var3;
                        class330.field4506++;
                    }
                }
                class526.field7655 = 0;
                for (class682 var6 = class604.field8668.method2887(210); var6 != null; var6 = class604.field8668.method2887(210)) {
                    int var7 = var6.method1084(128);
                    if (var7 == -1) {
                        class263.field3713.method3984(var6, 0);
                    } else if (var7 == 6) {
                        class526.field7655 += var6.method1087(24700);
                    } else if (class741.method5370(var7, (byte) 25)) {
                        class530.field7694.method3984(var6, 0);
                        if (class530.field7694.method3981(0) > 10) {
                            class530.field7694.method3980(-27119);
                        }
                    }
                }
                if (class101.method985((byte) 9)) {
                    class255.method2138((byte) -62);
                }
                if (class108.method1023(-62, class559.field8139)) {
                    class576.method4281(!arg0);
                    class258.method2150((byte) -32);
                } else if (class288.method2341(class559.field8139, (byte) -94)) {
                    class442.method3441((byte) 95);
                }
                if (class354.method2835(class559.field8139, 0) && !class288.method2341(class559.field8139, (byte) -74)) {
                    this.method4966(false);
                    class497.method3822(false);
                    class718.method5209((byte) 117);
                } else if (class322.method2551(class559.field8139, -5) && !class288.method2341(class559.field8139, (byte) -119)) {
                    this.method4966(false);
                    class718.method5209((byte) 32);
                } else if (class559.field8139 == 13) {
                    class718.method5209((byte) -115);
                } else if (class211.method1781(class559.field8139, (byte) 115) && !class288.method2341(class559.field8139, (byte) -86)) {
                    class329.method2585(127);
                } else if (class559.field8139 == 14 || class559.field8139 == 15) {
                    class718.method5209((byte) -77);
                    if (class555.field8081 != -3 && class555.field8081 != 2 && class555.field8081 != 15) {
                        if (class559.field8139 == 15) {
                            class96.field1303 = class649.field9228;
                            class748.field10664 = class555.field8081;
                            class57.field800 = class754.field10787;
                            if (class596.field8570) {
                                class778.method5599(class176.field2306.field11524, 24611, class176.field2306.field11516);
                                class60.field916.field11096 = null;
                                class699.method5035(14, 31754);
                            } else {
                                class794.method5727(-1, class24.field285);
                            }
                        } else {
                            class794.method5727(-1, false);
                        }
                    }
                }
                class717.method5206(class236.field3418, arg0);
                class530.field7694.method3980(-27119);
            }
        } catch (RuntimeException var9) {
            throw class665.method4799(var9, field9728[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
    public final void method4973(boolean arg0) {
        try {
            if (arg0) {
                if (class204.field2995) {
                    class692.method4937(30908);
                }
                field9705++;
                class73.method762(0);
                if (class236.field3418 != null) {
                    class236.field3418.method177((byte) -87);
                }
                if (class321.field4374 != null) {
                    class653.method4747(class321.field4374, 1, class651.field9249);
                    class321.field4374 = null;
                }
                class60.field916.method5604(1350);
                class60.field911.method5604(1350);
                class431.method3354((byte) 113);
                class45.field646.method5030(20);
                class308.field4252.method291((byte) 126);
                if (class703.field9829 != null) {
                    class703.field9829.method4188(1);
                    class703.field9829 = null;
                }
                try {
                    class504.field7375.method1159(0);
                    for (int var2 = 0; var2 < 37; var2++) {
                        class74.field1069[var2].method1159(0);
                    }
                    class682.field9576.method1159(0);
                    class397.field5776.method1159(0);
                    class759.method5501(121);
                } catch (Exception var4) {
                }
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field9728[96] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V")
    private final void method4974(int arg0) {
        try {
            field9708++;
            if (class45.field646.field9779 > class199.field2944) {
                class467.field6812.method5713(arg0 ^ 0x54);
                class327.field4476 = (class45.field646.field9779 * 50 - 50) * 5;
                if (class327.field4476 > 3000) {
                    class327.field4476 = 3000;
                }
                if (class45.field646.field9779 >= 2 && class45.field646.field9781 == 6) {
                    this.method5450(arg0 ^ 0x1B15, field9728[20]);
                    class559.field8139 = 16;
                    return;
                }
                if (class45.field646.field9779 >= 4 && class45.field646.field9781 == -1) {
                    this.method5450(6935, field9728[18]);
                    class559.field8139 = 16;
                    return;
                }
                if (class45.field646.field9779 >= 4 && class108.method1023(-104, class559.field8139)) {
                    if (class45.field646.field9781 == 7 || class45.field646.field9781 == 9) {
                        this.method5450(6935, field9728[16]);
                    } else if (class45.field646.field9781 <= 0) {
                        this.method5450(6935, field9728[19]);
                    } else if (class654.field9279 == null) {
                        this.method5450(6935, field9728[15]);
                    } else {
                        this.method5450(6935, field9728[17] + class654.field9279.trim());
                    }
                    class559.field8139 = 16;
                    return;
                }
            }
            class199.field2944 = class45.field646.field9779;
            if (class327.field4476 > 0) {
                class327.field4476--;
            } else {
                try {
                    if (class478.field7058 == 0) {
                        class760.field10837 = class467.field6812.method5709(43594, class651.field9249);
                        class478.field7058++;
                    }
                    if (class478.field7058 == 1) {
                        if (class760.field10837.field4486 == 2) {
                            if (class760.field10837.field4487 != null) {
                                class654.field9279 = (String) class760.field10837.field4487;
                            }
                            this.method4956(0, 1000);
                            return;
                        }
                        if (class760.field10837.field4486 == 1) {
                            class478.field7058++;
                        }
                    }
                    if (class478.field7058 == arg0) {
                        class351.field5086 = new class678((Socket) class760.field10837.field4487, class651.field9249, 25000);
                        class711 var2 = new class711(5);
                        var2.method5114(255, class414.field5952.field5193);
                        var2.method5127(658, 26108);
                        class351.field5086.method4869((byte) 85, 5, 0, var2.field9996);
                        class478.field7058++;
                        class309.field4263 = class614.method4531(-17);
                    }
                    if (class478.field7058 == 3) {
                        if (class108.method1023(22, class559.field8139) || class351.field5086.method4867(0) > 0) {
                            int var3 = class351.field5086.method4866(true);
                            if (var3 != 0) {
                                this.method4956(0, var3);
                                return;
                            }
                            class478.field7058++;
                        } else if (class614.method4531(arg0 - 112) - class309.field4263 > 30000L) {
                            this.method4956(0, 1001);
                            return;
                        }
                    }
                    if (class478.field7058 == 4) {
                        boolean var4 = class108.method1023(arg0 - 36, class559.field8139) || class354.method2835(class559.field8139, 0) || class322.method2551(class559.field8139, -124);
                        class403[] var5 = class403.method3158(arg0 + 7);
                        class711 var6 = new class711(var5.length * 4);
                        class351.field5086.method4863(var6.field9996.length, -49, 0, var6.field9996);
                        for (int var7 = 0; var7 < var5.length; var7++) {
                            var5[var7].method3163(var6.method5113(18443), (byte) -85);
                        }
                        class45.field646.method5023(!var4, class351.field5086, arg0 ^ 0xFFFFFFFC);
                        class351.field5086 = null;
                        class760.field10837 = null;
                        class478.field7058 = 0;
                    }
                } catch (IOException var9) {
                    this.method4956(0, 1002);
                }
            }
        } catch (RuntimeException var10) {
            throw class665.method4799(var10, field9728[14] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "()V")
    public static final void method4975() {
        int var0 = class689.field9642;
        int[] var1 = class599.field8595;
        int var2 = class268.field3801 ? var0 : class438.field6458 + var0;
        for (int var3 = 0; var3 < var2; var3++) {
            class170 var4;
            if (var3 < var0) {
                var4 = class748.field10666[var1[var3]];
            } else {
                var4 = ((class527) class479.field7063.method3693(false, (long) class343.field4987[var3 - var0])).field7672;
            }
            if (var4.field2174 >= 0) {
                int var5 = var4.method1437((byte) -28);
                if ((var5 & 0x1) == 0) {
                    if ((var4.field2969 & 0x1FF) == 0 && (var4.field2984 & 0x1FF) == 0) {
                        continue;
                    }
                } else if ((var4.field2969 & 0x1FF) == 256 && (var4.field2984 & 0x1FF) == 256) {
                    continue;
                }
                var4.field2975 = class100.method977(-1, var4.field2984, var4.field2981, var4.field2969);
                class90.method889(var4, true);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
    public final void method4976(byte arg0) {
        try {
            field9717++;
            if (class4.field59) {
                class342.field4980 = 64;
            }
            Frame var2 = new Frame(field9728[11]);
            var2.pack();
            var2.dispose();
            class169.method1422((byte) 32);
            class308.field4252 = new class25(class651.field9249);
            class45.field646 = new class698();
            class789.method5676(-74, new int[] { 20, 260 }, new int[] { 1000, 100 });
            if (class398.field5793 != class35.field426) {
                class322.field4395 = new byte[50][];
            }
            class451.field6612 = class740.method5365(false);
            if (class398.field5793 == class35.field426) {
                class405.field5878.field11516 = this.getCodeBase().getHost();
            } else if (class301.method2411(class35.field426, true)) {
                class405.field5878.field11516 = this.getCodeBase().getHost();
                class405.field5878.field11525 = class405.field5878.field11524 + 40000;
                class671.field9456.field11525 = class671.field9456.field11524 + 40000;
                class405.field5878.field11518 = class405.field5878.field11524 + 50000;
                class671.field9456.field11518 = class671.field9456.field11524 + 50000;
            } else if (class581.field8393 == class35.field426) {
                class405.field5878.field11516 = field9728[12];
                class405.field5878.field11525 = class405.field5878.field11524 + 40000;
                class671.field9456.field11516 = field9728[12];
                class405.field5878.field11518 = class405.field5878.field11524 + 50000;
                class671.field9456.field11525 = class671.field9456.field11524 + 40000;
                class671.field9456.field11518 = class671.field9456.field11524 + 50000;
            }
            if (class544.field7978 == class378.field5530) {
                class514.field7561 = false;
            }
            if (class544.field7978 == class316.field4323) {
                class532.field7708 = 0;
                class511.field7497 = class189.field2515;
                class113.field1460 = true;
                class459.field6676 = 16777215;
                class617.field8803 = class450.field6595;
            } else if (class727.field10422 == class544.field7978) {
                class511.field7497 = class652.field9263;
                class617.field8803 = class507.field7448;
            } else {
                class511.field7497 = class705.field9861;
                class617.field8803 = class760.field10836;
            }
            if (arg0 < -120) {
                class644.field9164 = class16.field205 = class110.field1437 = class126.field1580 = new short[256];
                class467.field6812 = class405.field5878;
                try {
                    class560.field8144 = class572.field8287.getToolkit().getSystemClipboard();
                } catch (Exception var5) {
                }
                class496.field7286 = class772.method5560(class560.field8153, true);
                class604.field8668 = class182.method1510(class560.field8153, 0, true);
                try {
                    if (class651.field9249.field2489 != null) {
                        class504.field7375 = new class133(class651.field9249.field2489, 5200, 0);
                        for (int var3 = 0; var3 < 37; var3++) {
                            class74.field1069[var3] = new class133(class651.field9249.field2500[var3], 6000, 0);
                        }
                        class682.field9576 = new class133(class651.field9249.field2494, 6000, 0);
                        class2.field31 = new class335(255, class504.field7375, class682.field9576, 500000);
                        class397.field5776 = new class133(class651.field9249.field2496, 24, 0);
                        class651.field9249.field2496 = null;
                        class651.field9249.field2500 = null;
                        class651.field9249.field2489 = null;
                        class651.field9249.field2494 = null;
                    }
                } catch (IOException var6) {
                    class2.field31 = null;
                    class504.field7375 = null;
                    class682.field9576 = null;
                    class397.field5776 = null;
                }
                if (class398.field5793 != class35.field426) {
                    class453.field6626 = true;
                }
                class617.field8802 = class537.field7842.method4068((byte) -59, class405.field5883);
            }
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field9728[10] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Lvo;)Z")
    public static final boolean method4977(class782 arg0) {
        if (class556.field8095) {
            if (method4957(arg0).field1739 != 0) {
                return false;
            }
            if (arg0.field11291 == 0) {
                return false;
            }
        }
        return arg0.field11215;
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
    public static final void method4978(int arg0) {
        int var1 = class689.field9642;
        int[] var2 = class599.field8595;
        for (int var3 = 0; var3 < class438.field6458 + var1; var3++) {
            class170 var4;
            if (var3 < var1) {
                var4 = class748.field10666[var2[var3]];
            } else {
                var4 = ((class527) class479.field7063.method3693(false, (long) class343.field4987[var3 - var1])).field7672;
            }
            if (var4.field2981 == arg0 && var4.field2174 >= 0) {
                int var5 = var4.method1437((byte) -28);
                if ((var5 & 0x1) == 0) {
                    if ((var4.field2969 & 0x1FF) != 0 || (var4.field2984 & 0x1FF) != 0) {
                        continue;
                    }
                } else if ((var4.field2969 & 0x1FF) != 256 || (var4.field2984 & 0x1FF) != 256) {
                    continue;
                }
                int var10002;
                if (var5 == 1) {
                    int var6 = var4.field2969 >> 9;
                    int var7 = var4.field2984 >> 9;
                    if (var4.field2174 > class613.field8771[var6][var7]) {
                        class613.field8771[var6][var7] = var4.field2174;
                        class674.field9463[var6][var7] = 1;
                    } else if (class613.field8771[var6][var7] == var4.field2174) {
                        var10002 = class674.field9463[var6][var7]++;
                    }
                } else {
                    int var8 = (var5 - 1) * 256 + 60;
                    int var9 = var4.field2969 - var8 >> 9;
                    int var10 = var4.field2984 - var8 >> 9;
                    int var11 = var4.field2969 + var8 >> 9;
                    int var12 = var4.field2984 + var8 >> 9;
                    for (int var13 = var9; var13 <= var11; var13++) {
                        for (int var14 = var10; var14 <= var12; var14++) {
                            if (var4.field2174 > class613.field8771[var13][var14]) {
                                class613.field8771[var13][var14] = var4.field2174;
                                class674.field9463[var13][var14] = 1;
                            } else if (class613.field8771[var13][var14] == var4.field2174) {
                                var10002 = class674.field9463[var13][var14]++;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
    public final synchronized void method4979(int arg0) {
        try {
            field9707++;
            int var2 = 56 / ((arg0 + 12) / 39);
            if (class290.field4091 != null && class560.field8153 == null && !class651.field9249.field2483) {
                try {
                    Class var3 = class290.field4091.getClass();
                    Field var4 = var3.getDeclaredField(field9728[93]);
                    class560.field8153 = (Canvas) var4.get(class290.field4091);
                    var4.set(class290.field4091, null);
                    if (class560.field8153 != null) {
                        return;
                    }
                } catch (Exception var6) {
                }
            }
            super.method4979(-112);
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field9728[92] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
    public static final void method4980(int arg0) {
        try {
            class555.field8081 = -2;
            class561.field8167 = 0;
            if (arg0 != 17712) {
                main(null);
            }
            field9713++;
            class381.field5556 = -2;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field9728[3] + arg0 + ')');
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method4981(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!client", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4982(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x31);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!client", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4983(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 94;
                    break;
                case 1:
                    var10005 = 102;
                    break;
                case 2:
                    var10005 = 20;
                    break;
                case 3:
                    var10005 = 19;
                    break;
                default:
                    var10005 = 49;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
