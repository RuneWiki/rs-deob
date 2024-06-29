import jagex3.jagmisc.jagmisc;
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
public class client extends class395 {

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "Ldb;")
    public static class298 field3875 = new class298(94, 4);

    @OriginalMember(owner = "client!client", name = "qb", descriptor = "I")
    public static int field3892 = 0;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field3876;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field3877;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field3878;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field3879;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field3880;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field3881;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field3882;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field3883;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    public static int field3884;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
    public static int field3885;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
    public static int field3886;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
    public static int field3887;

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "I")
    public static int field3888;

    @OriginalMember(owner = "client!client", name = "nb", descriptor = "I")
    public static int field3889;

    @OriginalMember(owner = "client!client", name = "ob", descriptor = "I")
    public static int field3890;

    @OriginalMember(owner = "client!client", name = "pb", descriptor = "I")
    public static int field3891;

    // $FF: synthetic field
    @OriginalMember(owner = "client!client", name = "rb", descriptor = "Ljava/lang/Class;")
    public static Class field3893;

    @OriginalMember(owner = "client!client", name = "sb", descriptor = "Z")
    public static boolean field3894;

    // $FF: synthetic method
    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method1704(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V", line = 8)
    public final void method1679(int arg0) {
        field3880++;
        if (arg0 != 20309) {
            field3875 = null;
        }
        if (class571.field7587 != 2) {
            this.method1688(-99);
            return;
        }
        try {
            this.method1688(-100);
        } catch (ThreadDeath var4) {
            throw var4;
        } catch (Throwable var5) {
            class259.method1586(var5, var5.getMessage() + " (Recovered) " + this.method1703(256), (byte) 8);
            class405.method2326(0, -79);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ZI)V", line = 35)
    private final void method1680(boolean arg0, int arg1) {
        class315.field4343.field1551 = arg1;
        field3885++;
        class209.field2991 = null;
        class623.field8244 = null;
        class672.field9518 = 0;
        class315.field4343.field1553++;
        if (!arg0) {
            this.method1680(true, 76);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Lgba;IIIIIIIII)V", line = 54)
    public static final void method1681(class625[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        for (int var10 = 0; var10 < arg0.length; var10++) {
            class625 var11 = arg0[var10];
            if (var11 != null && var11.field8288 == arg1) {
                int var12 = var11.field8312 + arg6;
                int var13 = var11.field8317 + arg7;
                int var14;
                int var15;
                int var16;
                int var17;
                if (var11.field8421 == 2) {
                    var14 = arg2;
                    var15 = arg3;
                    var16 = arg4;
                    var17 = arg5;
                } else {
                    int var18 = var11.field8350 + var12;
                    int var19 = var11.field8361 + var13;
                    if (var11.field8421 == 9) {
                        var18++;
                        var19++;
                    }
                    var14 = var12 > arg2 ? var12 : arg2;
                    var15 = var13 > arg3 ? var13 : arg3;
                    var16 = var18 < arg4 ? var18 : arg4;
                    var17 = var19 < arg5 ? var19 : arg5;
                }
                if (var11.field8421 == 0 || var11.field8348 || method1701(var11).field725 != 0 || class673.field9525 == var11 || class61.field918 == var11.field8402) {
                    if (!method1697(var11)) {
                        if (class109.field1591 == var11 && class467.method2635(-118, class109.field1591) != null) {
                            class233.field3270 = true;
                            class210.field3000 = var12;
                            class201.field2941 = var13;
                        }
                        if (var11.field8355 || var14 < var16 && var15 < var17) {
                            if (var11.field8339 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                for (class48 var20 = (class48) class46.field658.method3257(-119); var20 != null; var20 = (class48) class46.field658.method3263((byte) -116)) {
                                    if (var20.field686) {
                                        var20.method2797(-122);
                                        var20.field692.field8310 = false;
                                    }
                                }
                                if (class549.field7326 == 0) {
                                    class109.field1591 = null;
                                    class673.field9525 = null;
                                }
                                class562.field7461 = 0;
                                class414.field5671 = false;
                                class263.field3656 = false;
                                if (!class388.field5142) {
                                    class51.method346(true);
                                }
                            }
                            boolean var21;
                            if (class164.field2564.method1110((byte) 91) >= var14 && class164.field2564.method1113(-6387) >= var15 && class164.field2564.method1110((byte) 91) < var16 && class164.field2564.method1113(-6387) < var17) {
                                var21 = true;
                            } else {
                                var21 = false;
                            }
                            if (!class400.field5305 && var21) {
                                if (var11.field8386 >= 0) {
                                    class428.field5883 = var11.field8386;
                                } else if (var11.field8339) {
                                    class428.field5883 = -1;
                                }
                            }
                            if (!class388.field5142 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                class527.method2942(12, var11, arg9 - var13, arg8 - var12);
                            }
                            boolean var22 = false;
                            if (class164.field2564.method1105(false) && var21) {
                                var22 = true;
                            }
                            boolean var23 = false;
                            class458 var24 = (class458) class399.field5298.method3257(-7);
                            if (var24 != null && var24.method1649(-20210) == 0 && var24.method1650(0) >= var14 && var24.method1654((byte) 96) >= var15 && var24.method1650(0) < var16 && var24.method1654((byte) 96) < var17) {
                                var23 = true;
                            }
                            if (var11.field8341 != null && !class310.method1855((byte) -92)) {
                                for (int var25 = 0; var25 < var11.field8341.length; var25++) {
                                    if (class561.field7444.method3271(var11.field8341[var25], 0)) {
                                        if (var11.field8345 == null || class642.field8626 >= var11.field8345[var25]) {
                                            byte var26 = var11.field8428[var25];
                                            if (var26 == 0 || ((var26 & 0x8) == 0 || !class561.field7444.method3271(86, 0) && !class561.field7444.method3271(82, 0) && !class561.field7444.method3271(81, 0)) && ((var26 & 0x2) == 0 || class561.field7444.method3271(86, 0)) && ((var26 & 0x1) == 0 || class561.field7444.method3271(82, 0)) && ((var26 & 0x4) == 0 || class561.field7444.method3271(81, 0))) {
                                                if (var25 < 10) {
                                                    class58.method475(-1, var25 + 1, var11.field8327, (byte) 122, "");
                                                } else if (var25 == 10) {
                                                    class671.method3761(1);
                                                    class52 var27 = method1701(var11);
                                                    class154.method1083(var27.method355((byte) -55), (byte) -41, var27.field729, var11);
                                                    class680.field9585 = class80.method637(-48, var11);
                                                    if (class680.field9585 == null) {
                                                        class680.field9585 = "Null";
                                                    }
                                                    class214.field3060 = var11.field8357 + "<col=ffffff>";
                                                }
                                                int var28 = var11.field8351[var25];
                                                if (var11.field8345 == null) {
                                                    var11.field8345 = new int[var11.field8341.length];
                                                }
                                                if (var28 == 0) {
                                                    var11.field8345[var25] = Integer.MAX_VALUE;
                                                } else {
                                                    var11.field8345[var25] = class642.field8626 + var28;
                                                }
                                            }
                                        }
                                    } else if (var11.field8345 != null) {
                                        var11.field8345[var25] = 0;
                                    }
                                }
                            }
                            if (var23) {
                                class413.method2372(var24.method1650(0) - var12, var11, var24.method1654((byte) 96) - var13, -118);
                            }
                            if (class109.field1591 != null && class109.field1591 != var11 && var21 && method1701(var11).method352(-27140)) {
                                class484.field6543 = var11;
                            }
                            if (class673.field9525 == var11) {
                                class704.field9907 = true;
                                class199.field2886 = var12;
                                class138.field2231 = var13;
                            }
                            if (var11.field8348 || var11.field8402 != 0) {
                                if (var21 && class36.field551 != 0 && var11.field8429 != null) {
                                    class48 var29 = new class48();
                                    var29.field686 = true;
                                    var29.field692 = var11;
                                    var29.field691 = class36.field551;
                                    var29.field681 = var11.field8429;
                                    class46.field658.method3265(var29, (byte) -61);
                                }
                                if (class109.field1591 != null || class388.field5142 || class368.field4977 != var11.field8402 && class562.field7461 > 0) {
                                    var23 = false;
                                    var22 = false;
                                    var21 = false;
                                }
                                if (var11.field8402 != 0) {
                                    if (class697.field9792 == var11.field8402 || class618.field8206 == var11.field8402) {
                                        class153.field2412 = var11;
                                        if (class111.field1784 != null) {
                                            class111.field1784.method1189(var11.field8361, class10.field197, (byte) 86);
                                        }
                                        if (class697.field9792 == var11.field8402) {
                                            if (!class388.field5142 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                                class431.method2451(0, class10.field197, arg8, arg9);
                                                for (class369 var30 = (class369) class82.field1278.method328(0); var30 != null; var30 = (class369) class82.field1278.method331((byte) 118)) {
                                                    if (arg8 >= var30.field4982 && arg8 < var30.field4985 && arg9 >= var30.field4988 && arg9 < var30.field4980) {
                                                        class51.method346(true);
                                                        class70.method543(0, var30.field4986);
                                                    }
                                                }
                                            }
                                            class575.method3150(var11, 5952, var13, var12);
                                            continue;
                                        }
                                    }
                                    if (class61.field918 == var11.field8402) {
                                        if (var11.method3431(0, class10.field197) == null || class504.field6729 != 0 && class504.field6729 != 3 || class388.field5142 || arg8 < var14 || arg9 < var15 || arg8 >= var16 || arg9 >= var17) {
                                            continue;
                                        }
                                        int var31 = arg8 - var12;
                                        int var32 = arg9 - var13;
                                        int var33 = var11.field8434[var32];
                                        if (var31 < var33 || var31 > var11.field8445[var32] + var33) {
                                            continue;
                                        }
                                        int var34 = var31 - var11.field8350 / 2;
                                        int var35 = var32 - var11.field8361 / 2;
                                        int var36;
                                        if (class140.field2254 == 4) {
                                            var36 = (int) class42.field602 & 0x3FFF;
                                        } else {
                                            var36 = (int) class42.field602 + class588.field7795 & 0x3FFF;
                                        }
                                        int var37 = class126.field2116[var36];
                                        int var38 = class126.field2105[var36];
                                        if (class140.field2254 != 4) {
                                            var37 = (class376.field5073 + 256) * var37 >> 8;
                                            var38 = (class376.field5073 + 256) * var38 >> 8;
                                        }
                                        int var39 = var34 * var38 + var35 * var37 >> 14;
                                        int var40 = var35 * var38 - var34 * var37 >> 14;
                                        int var41;
                                        int var42;
                                        if (class140.field2254 == 4) {
                                            var41 = (class247.field3443 >> 9) + (var39 >> 2);
                                            var42 = (class412.field5654 >> 9) - (var40 >> 2);
                                        } else {
                                            int var43 = (class199.field2897.method2317((byte) 40) - 1) * 256;
                                            var41 = (class199.field2897.field8620 - var43 >> 9) + (var39 >> 2);
                                            var42 = (class199.field2897.field8612 - var43 >> 9) - (var40 >> 2);
                                        }
                                        if (class400.field5305 && (class658.field9093 & 0x40) != 0) {
                                            class625 var44 = class457.method2609(class255.field3536, class522.field6979, (byte) -83);
                                            if (var44 == null) {
                                                class671.method3761(1);
                                            } else {
                                                class483.method2701(var42, false, true, " ->", 1L, 17, var41, var11.field8403, class425.field5847, class680.field9585, 6967);
                                            }
                                            continue;
                                        }
                                        if (class488.field6599 == class392.field5166) {
                                            class483.method2701(var42, false, true, "", 1L, 2, var41, -1, -1, class72.field1091.method546(class516.field6892, (byte) -35), 6967);
                                        }
                                        class483.method2701(var42, false, true, "", 1L, 58, var41, -1, class216.field3083, class148.field2364, 6967);
                                        continue;
                                    }
                                    if (class368.field4977 == var11.field8402) {
                                        class155.field2439 = var11;
                                        if (var21) {
                                            class414.field5671 = true;
                                        }
                                        if (var23) {
                                            int var45 = (int) ((double) (var24.method1650(0) - var12 - var11.field8350 / 2) * 2.0D / (double) class567.field7506);
                                            int var46 = (int) (-((double) (var24.method1654((byte) 96) - var13 - var11.field8361 / 2) * 2.0D / (double) class567.field7506));
                                            int var47 = class613.field8098 + var45 + class567.field7515;
                                            int var48 = class180.field2749 + var46 + class567.field7529;
                                            class28 var49 = class620.method3397(false);
                                            if (var49 == null) {
                                                continue;
                                            }
                                            int[] var50 = new int[3];
                                            var49.method241(var50, (byte) 119, var47, var48);
                                            if (var50 != null) {
                                                if (class561.field7444.method3271(82, 0) && class150.field2398 > 0) {
                                                    class247.method1516((byte) -44, var50[2], var50[0], var50[1]);
                                                    continue;
                                                }
                                                class263.field3656 = true;
                                                class251.field3461 = var50[0];
                                                class226.field3193 = var50[1];
                                                class690.field9714 = var50[2];
                                            }
                                            class562.field7461 = 1;
                                            class624.field8265 = false;
                                            class628.field8468 = class164.field2564.method1110((byte) 91);
                                            class643.field8627 = class164.field2564.method1113(-6387);
                                            continue;
                                        }
                                        if (var22 && class562.field7461 > 0) {
                                            if (class562.field7461 == 1 && (class628.field8468 != class164.field2564.method1110((byte) 91) || class643.field8627 != class164.field2564.method1113(-6387))) {
                                                class486.field6582 = class613.field8098;
                                                class398.field5286 = class180.field2749;
                                                class562.field7461 = 2;
                                            }
                                            if (class562.field7461 == 2) {
                                                class624.field8265 = true;
                                                class199.method1285((byte) 95, class486.field6582 + (int) ((double) (class628.field8468 - class164.field2564.method1110((byte) 91)) * 2.0D / (double) class567.field7502));
                                                class304.method1840(10569, class398.field5286 - (int) ((double) (class643.field8627 - class164.field2564.method1113(-6387)) * 2.0D / (double) class567.field7502));
                                            }
                                            continue;
                                        }
                                        if (class562.field7461 > 0 && !class624.field8265) {
                                            if ((class47.field671 == 1 || class244.method1496(-84)) && class398.field5290 > 2) {
                                                class338.method2053(class628.field8468, class643.field8627, -96);
                                            } else if (class111.method876((byte) 39)) {
                                                class338.method2053(class628.field8468, class643.field8627, -94);
                                            }
                                        }
                                        class562.field7461 = 0;
                                        continue;
                                    }
                                    if (class599.field7949 == var11.field8402) {
                                        if (var22) {
                                            class571.method3140(class164.field2564.method1113(-6387) - var13, var11.field8361, class164.field2564.method1110((byte) 91) - var12, 1, var11.field8350);
                                        }
                                        continue;
                                    }
                                    if (class234.field3289 == var11.field8402) {
                                        class585.method3218(var11, var12, -2, var13);
                                        continue;
                                    }
                                }
                                if (!var11.field8275 && var23) {
                                    var11.field8275 = true;
                                    if (var11.field8315 != null) {
                                        class48 var51 = new class48();
                                        var51.field686 = true;
                                        var51.field692 = var11;
                                        var51.field682 = var24.method1650(0) - var12;
                                        var51.field691 = var24.method1654((byte) 96) - var13;
                                        var51.field681 = var11.field8315;
                                        class46.field658.method3265(var51, (byte) -96);
                                    }
                                }
                                if (var11.field8275 && var22 && var11.field8308 != null) {
                                    class48 var52 = new class48();
                                    var52.field686 = true;
                                    var52.field692 = var11;
                                    var52.field682 = class164.field2564.method1110((byte) 91) - var12;
                                    var52.field691 = class164.field2564.method1113(-6387) - var13;
                                    var52.field681 = var11.field8308;
                                    class46.field658.method3265(var52, (byte) -109);
                                }
                                if (var11.field8275 && !var22) {
                                    var11.field8275 = false;
                                    if (var11.field8347 != null) {
                                        class48 var53 = new class48();
                                        var53.field686 = true;
                                        var53.field692 = var11;
                                        var53.field682 = class164.field2564.method1110((byte) 91) - var12;
                                        var53.field691 = class164.field2564.method1113(-6387) - var13;
                                        var53.field681 = var11.field8347;
                                        class16.field247.method3265(var53, (byte) -68);
                                    }
                                }
                                if (var22 && var11.field8396 != null) {
                                    class48 var54 = new class48();
                                    var54.field686 = true;
                                    var54.field692 = var11;
                                    var54.field682 = class164.field2564.method1110((byte) 91) - var12;
                                    var54.field691 = class164.field2564.method1113(-6387) - var13;
                                    var54.field681 = var11.field8396;
                                    class46.field658.method3265(var54, (byte) -105);
                                }
                                if (!var11.field8310 && var21) {
                                    var11.field8310 = true;
                                    if (var11.field8388 != null) {
                                        class48 var55 = new class48();
                                        var55.field686 = true;
                                        var55.field692 = var11;
                                        var55.field682 = class164.field2564.method1110((byte) 91) - var12;
                                        var55.field691 = class164.field2564.method1113(-6387) - var13;
                                        var55.field681 = var11.field8388;
                                        class46.field658.method3265(var55, (byte) -94);
                                    }
                                }
                                if (var11.field8310 && var21 && var11.field8329 != null) {
                                    class48 var56 = new class48();
                                    var56.field686 = true;
                                    var56.field692 = var11;
                                    var56.field682 = class164.field2564.method1110((byte) 91) - var12;
                                    var56.field691 = class164.field2564.method1113(-6387) - var13;
                                    var56.field681 = var11.field8329;
                                    class46.field658.method3265(var56, (byte) -67);
                                }
                                if (var11.field8310 && !var21) {
                                    var11.field8310 = false;
                                    if (var11.field8295 != null) {
                                        class48 var57 = new class48();
                                        var57.field686 = true;
                                        var57.field692 = var11;
                                        var57.field682 = class164.field2564.method1110((byte) 91) - var12;
                                        var57.field691 = class164.field2564.method1113(-6387) - var13;
                                        var57.field681 = var11.field8295;
                                        class16.field247.method3265(var57, (byte) -85);
                                    }
                                }
                                if (var11.field8376 != null) {
                                    class48 var58 = new class48();
                                    var58.field692 = var11;
                                    var58.field681 = var11.field8376;
                                    class697.field9793.method3265(var58, (byte) -116);
                                }
                                if (var11.field8437 != null && class224.field3157 > var11.field8385) {
                                    if (var11.field8407 == null || class224.field3157 - var11.field8385 > 32) {
                                        class48 var63 = new class48();
                                        var63.field692 = var11;
                                        var63.field681 = var11.field8437;
                                        class46.field658.method3265(var63, (byte) -115);
                                    } else {
                                        label694: for (int var59 = var11.field8385; var59 < class224.field3157; var59++) {
                                            int var60 = class340.field4702[var59 & 0x1F];
                                            for (int var61 = 0; var61 < var11.field8407.length; var61++) {
                                                if (var11.field8407[var61] == var60) {
                                                    class48 var62 = new class48();
                                                    var62.field692 = var11;
                                                    var62.field681 = var11.field8437;
                                                    class46.field658.method3265(var62, (byte) -77);
                                                    break label694;
                                                }
                                            }
                                        }
                                    }
                                    var11.field8385 = class224.field3157;
                                }
                                if (var11.field8417 != null && class586.field7775 > var11.field8371) {
                                    if (var11.field8384 == null || class586.field7775 - var11.field8371 > 32) {
                                        class48 var68 = new class48();
                                        var68.field692 = var11;
                                        var68.field681 = var11.field8417;
                                        class46.field658.method3265(var68, (byte) -92);
                                    } else {
                                        label670: for (int var64 = var11.field8371; var64 < class586.field7775; var64++) {
                                            int var65 = class311.field4282[var64 & 0x1F];
                                            for (int var66 = 0; var66 < var11.field8384.length; var66++) {
                                                if (var11.field8384[var66] == var65) {
                                                    class48 var67 = new class48();
                                                    var67.field692 = var11;
                                                    var67.field681 = var11.field8417;
                                                    class46.field658.method3265(var67, (byte) -101);
                                                    break label670;
                                                }
                                            }
                                        }
                                    }
                                    var11.field8371 = class586.field7775;
                                }
                                if (var11.field8359 != null && class575.field7602 > var11.field8303) {
                                    if (var11.field8399 == null || class575.field7602 - var11.field8303 > 32) {
                                        class48 var73 = new class48();
                                        var73.field692 = var11;
                                        var73.field681 = var11.field8359;
                                        class46.field658.method3265(var73, (byte) -94);
                                    } else {
                                        label646: for (int var69 = var11.field8303; var69 < class575.field7602; var69++) {
                                            int var70 = class77.field1208[var69 & 0x1F];
                                            for (int var71 = 0; var71 < var11.field8399.length; var71++) {
                                                if (var11.field8399[var71] == var70) {
                                                    class48 var72 = new class48();
                                                    var72.field692 = var11;
                                                    var72.field681 = var11.field8359;
                                                    class46.field658.method3265(var72, (byte) -81);
                                                    break label646;
                                                }
                                            }
                                        }
                                    }
                                    var11.field8303 = class575.field7602;
                                }
                                if (var11.field8415 != null && class11.field203 > var11.field8419) {
                                    if (var11.field8274 == null || class11.field203 - var11.field8419 > 32) {
                                        class48 var78 = new class48();
                                        var78.field692 = var11;
                                        var78.field681 = var11.field8415;
                                        class46.field658.method3265(var78, (byte) -70);
                                    } else {
                                        label622: for (int var74 = var11.field8419; var74 < class11.field203; var74++) {
                                            int var75 = class369.field4984[var74 & 0x1F];
                                            for (int var76 = 0; var76 < var11.field8274.length; var76++) {
                                                if (var11.field8274[var76] == var75) {
                                                    class48 var77 = new class48();
                                                    var77.field692 = var11;
                                                    var77.field681 = var11.field8415;
                                                    class46.field658.method3265(var77, (byte) -87);
                                                    break label622;
                                                }
                                            }
                                        }
                                    }
                                    var11.field8419 = class11.field203;
                                }
                                if (var11.field8389 != null && class256.field3545 > var11.field8328) {
                                    if (var11.field8300 == null || class256.field3545 - var11.field8328 > 32) {
                                        class48 var83 = new class48();
                                        var83.field692 = var11;
                                        var83.field681 = var11.field8389;
                                        class46.field658.method3265(var83, (byte) -63);
                                    } else {
                                        label598: for (int var79 = var11.field8328; var79 < class256.field3545; var79++) {
                                            int var80 = class436.field5974[var79 & 0x1F];
                                            for (int var81 = 0; var81 < var11.field8300.length; var81++) {
                                                if (var11.field8300[var81] == var80) {
                                                    class48 var82 = new class48();
                                                    var82.field692 = var11;
                                                    var82.field681 = var11.field8389;
                                                    class46.field658.method3265(var82, (byte) -72);
                                                    break label598;
                                                }
                                            }
                                        }
                                    }
                                    var11.field8328 = class256.field3545;
                                }
                                if (class355.field4827 > var11.field8316 && var11.field8378 != null) {
                                    class48 var84 = new class48();
                                    var84.field692 = var11;
                                    var84.field681 = var11.field8378;
                                    class46.field658.method3265(var84, (byte) -75);
                                }
                                if (class410.field5544 > var11.field8316 && var11.field8391 != null) {
                                    class48 var85 = new class48();
                                    var85.field692 = var11;
                                    var85.field681 = var11.field8391;
                                    class46.field658.method3265(var85, (byte) -95);
                                }
                                if (class711.field9946 > var11.field8316 && var11.field8331 != null) {
                                    class48 var86 = new class48();
                                    var86.field692 = var11;
                                    var86.field681 = var11.field8331;
                                    class46.field658.method3265(var86, (byte) -88);
                                }
                                if (class656.field8940 > var11.field8316 && var11.field8276 != null) {
                                    class48 var87 = new class48();
                                    var87.field692 = var11;
                                    var87.field681 = var11.field8276;
                                    class46.field658.method3265(var87, (byte) -81);
                                }
                                if (class301.field4203 > var11.field8316 && var11.field8301 != null) {
                                    class48 var88 = new class48();
                                    var88.field692 = var11;
                                    var88.field681 = var11.field8301;
                                    class46.field658.method3265(var88, (byte) -68);
                                }
                                var11.field8316 = class367.field4959;
                                if (var11.field8322 != null) {
                                    for (int var89 = 0; var89 < class404.field5409; var89++) {
                                        class48 var90 = new class48();
                                        var90.field692 = var11;
                                        var90.field689 = class107.field1576[var89].method1809(13772);
                                        var90.field683 = class107.field1576[var89].method1805(18449);
                                        var90.field681 = var11.field8322;
                                        class46.field658.method3265(var90, (byte) -119);
                                    }
                                }
                                if (class570.field7574 && var11.field8424 != null) {
                                    class48 var91 = new class48();
                                    var91.field692 = var11;
                                    var91.field681 = var11.field8424;
                                    class46.field658.method3265(var91, (byte) -117);
                                }
                            }
                            if (var11.field8421 == 5 && var11.field8306 != -1) {
                                var11.method3424(class152.field2405, class328.field4518, 65535).method1189(var11.field8361, class10.field197, (byte) 50);
                            }
                            class384.method2239((byte) -65, var11);
                            if (var11.field8421 == 0) {
                                method1681(arg0, var11.field8327, var14, var15, var16, var17, var12 - var11.field8365, var13 - var11.field8441, arg8, arg9);
                                if (var11.field8420 != null) {
                                    method1681(var11.field8420, var11.field8327, var14, var15, var16, var17, var12 - var11.field8365, var13 - var11.field8441, arg8, arg9);
                                }
                                class140 var92 = (class140) class264.field3667.method2918((long) var11.field8327, (byte) -47);
                                if (var92 != null) {
                                    if (class443.field6069 == class392.field5166 && var92.field2253 == 0 && !class388.field5142 && var21 && !class295.field4171) {
                                        class51.method346(true);
                                    }
                                    class266.method1623(var14, var16, (byte) -4, var13, var12, var92.field2256, arg8, var15, arg9, var17);
                                }
                            }
                        }
                    }
                } else if (var14 < var16 && var15 < var17) {
                    class384.method2239((byte) -76, var11);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V", line = 956)
    public static final void method1682(int arg0) {
        int var1 = class664.field9426;
        int[] var2 = class55.field762;
        for (int var3 = 0; var3 < class92.field1396 + var1; var3++) {
            class411 var4;
            if (var3 < var1) {
                var4 = class572.field7601[var2[var3]];
            } else {
                var4 = ((class280) class616.field8143.method2918((long) class415.field5681[var3 - var1], (byte) 113)).field3983;
            }
            if (var4.field8609 == arg0 && var4.field5612 >= 0) {
                int var5 = var4.method2317((byte) 40);
                if ((var5 & 0x1) == 0) {
                    if ((var4.field8620 & 0x1FF) != 0 || (var4.field8612 & 0x1FF) != 0) {
                        continue;
                    }
                } else if ((var4.field8620 & 0x1FF) != 256 || (var4.field8612 & 0x1FF) != 256) {
                    continue;
                }
                int var10002;
                if (var5 == 1) {
                    int var6 = var4.field8620 >> 9;
                    int var7 = var4.field8612 >> 9;
                    if (var4.field5612 > class572.field7595[var6][var7]) {
                        class572.field7595[var6][var7] = var4.field5612;
                        class223.field3136[var6][var7] = 1;
                    } else if (class572.field7595[var6][var7] == var4.field5612) {
                        var10002 = class223.field3136[var6][var7]++;
                    }
                } else {
                    int var8 = (var5 - 1) * 256 + 60;
                    int var9 = var4.field8620 - var8 >> 9;
                    int var10 = var4.field8612 - var8 >> 9;
                    int var11 = var4.field8620 + var8 >> 9;
                    int var12 = var4.field8612 + var8 >> 9;
                    for (int var13 = var9; var13 <= var11; var13++) {
                        for (int var14 = var10; var14 <= var12; var14++) {
                            if (var4.field5612 > class572.field7595[var13][var14]) {
                                class572.field7595[var13][var14] = var4.field5612;
                                class223.field3136[var13][var14] = 1;
                            } else if (class572.field7595[var13][var14] == var4.field5612) {
                                var10002 = class223.field3136[var13][var14]++;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V", line = 1058)
    public static final void main(String[] arg0) {
        field3887++;
        try {
            if (arg0.length != 6) {
                class571.method3138((byte) -108, "Argument count");
            }
            class488.field6601 = new class204();
            class488.field6601.field2955 = Integer.parseInt(arg0[0]);
            class38.field570 = new class204();
            class38.field570.field2955 = Integer.parseInt(arg0[1]);
            class367.field4972 = new class204();
            class367.field4972.field2955 = Integer.parseInt(arg0[2]);
            class137.field2222 = class281.field3991;
            if (arg0[3].equals("live")) {
                class195.field2848 = class527.field7026;
            } else if (arg0[3].equals("rc")) {
                class195.field2848 = class169.field2609;
            } else if (arg0[3].equals("wip")) {
                class195.field2848 = class529.field7048;
            } else {
                class571.method3138((byte) -108, "modewhat");
            }
            class516.field6892 = class237.method1475(arg0[4], 0);
            if (class516.field6892 == -1) {
                if (arg0[4].equals("english")) {
                    class516.field6892 = 0;
                } else if (arg0[4].equals("german")) {
                    class516.field6892 = 1;
                } else {
                    class571.method3138((byte) -108, "language");
                }
            }
            class292.field4152 = false;
            class325.field4501 = false;
            if (arg0[5].equals("game0")) {
                class392.field5166 = class443.field6069;
            } else if (arg0[5].equals("game1")) {
                class392.field5166 = class488.field6599;
            } else {
                class571.method3138((byte) -108, "game");
            }
            class88.field1330 = 0;
            class115.field1975 = 0;
            class559.field7424 = false;
            class592.field7827 = null;
            class440.field6041 = 0L;
            class482.field6480 = "";
            class331.field4538 = 0;
            class229.field3211 = false;
            class139.field2243 = true;
            class221.field3125 = true;
            class592.field7831 = null;
            class580.field7704 = class392.field5166.field9508;
            client var1 = new client();
            class139.field2244 = var1;
            var1.method2270(class392.field5166.field9511, 35, class195.field2848.method3497(0) + 32, (byte) 103, 617, 768, 1024, false);
            class490.field6611.setLocation(40, 40);
        } catch (Exception var3) {
            class259.method1586(var3, null, (byte) 8);
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V", line = 1137)
    public static final void method1683(int arg0) {
        int var1 = class664.field9426;
        int[] var2 = class55.field762;
        int var3 = class434.field5933 ? var1 : class92.field1396 + var1;
        for (int var4 = 0; var4 < var3; var4++) {
            class411 var5;
            if (var4 < var1) {
                var5 = class572.field7601[var2[var4]];
            } else {
                var5 = ((class280) class616.field8143.method2918((long) class415.field5681[var4 - var1], (byte) -126)).field3983;
            }
            if (var5.field8609 == arg0) {
                var5.field5565 = 0;
                if (var5.field5612 < 0) {
                    var5.field5564 = false;
                } else {
                    int var6 = var5.method2317((byte) 40);
                    if ((var6 & 0x1) == 0) {
                        if ((var5.field8620 & 0x1FF) != 0 || (var5.field8612 & 0x1FF) != 0) {
                            var5.field5564 = false;
                            continue;
                        }
                    } else if ((var5.field8620 & 0x1FF) != 256 || (var5.field8612 & 0x1FF) != 256) {
                        var5.field5564 = false;
                        continue;
                    }
                    int var10002;
                    if (var6 == 1) {
                        int var7 = var5.field8620 >> 9;
                        int var8 = var5.field8612 >> 9;
                        if (class572.field7595[var7][var8] != var5.field5612) {
                            var5.field5564 = true;
                            continue;
                        }
                        if (class223.field3136[var7][var8] > 1) {
                            var10002 = class223.field3136[var7][var8]--;
                            var5.field5564 = true;
                            continue;
                        }
                    } else {
                        int var9 = (var6 - 1) * 256 + 252;
                        int var10 = var5.field8620 - var9 >> 9;
                        int var11 = var5.field8612 - var9 >> 9;
                        int var12 = var5.field8620 + var9 >> 9;
                        int var13 = var5.field8612 + var9 >> 9;
                        if (!class26.method228(-93, var12, var11, var13, var10, var5.field5612)) {
                            for (int var14 = var10; var14 <= var12; var14++) {
                                for (int var15 = var11; var15 <= var13; var15++) {
                                    if (class572.field7595[var14][var15] == var5.field5612) {
                                        var10002 = class223.field3136[var14][var15]--;
                                    }
                                }
                            }
                            var5.field5564 = true;
                            continue;
                        }
                    }
                    if (var5 instanceof class403 && var5.field5646 != null && class642.field8626 >= var5.field5646.field619 && class642.field8626 < var5.field5646.field613) {
                        ((class403) var5).field5393 = false;
                    }
                    var5.field5564 = false;
                    var5.field8616 = class315.method1878(var5.field8620, 2921, var5.field8609, var5.field8612);
                    class618.method3385(var5, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "()V", line = 1255)
    public static final void method1684() {
        int var0 = class664.field9426;
        int[] var1 = class55.field762;
        boolean var2 = class344.field4718.field5456 == 1 && var0 > 200 || class344.field4718.field5456 == 0 && var0 > 50;
        for (int var3 = 0; var3 < var0; var3++) {
            class403 var13 = class572.field7601[var1[var3]];
            if (var13.method2309(-21653)) {
                var13.method2351(8);
                if (var13.field8611 >= 0 && var13.field8618 >= 0 && var13.field8622 < class34.field530 && var13.field8610 < class34.field531) {
                    var13.field5393 = var13.field5609 ? var2 : false;
                    if (class199.field2897 == var13) {
                        var13.field5612 = Integer.MAX_VALUE;
                    } else {
                        int var14 = 0;
                        if (!var13.field5564) {
                            var14++;
                        }
                        if (var13.field5603 > class642.field8626) {
                            var14 += 2;
                        }
                        int var15 = var14 + (5 - var13.method2317((byte) 40) << 2);
                        if (var13.field5394) {
                            var15 += 512;
                        } else {
                            if (class458.field6220 == 0) {
                                var15 += 32;
                            } else {
                                var15 += 128;
                            }
                            var15 += 256;
                        }
                        var13.field5612 = var15 + 1;
                    }
                } else {
                    var13.field5612 = -1;
                }
            } else {
                var13.field5612 = -1;
            }
        }
        for (int var4 = 0; var4 < class92.field1396; var4++) {
            class287 var10 = ((class280) class616.field8143.method2918((long) class415.field5681[var4], (byte) 33)).field3983;
            if (var10.method1778(-21653) && var10.field4052.method2390(1, class80.field1261)) {
                var10.method2351(8);
                if (var10.field8611 >= 0 && var10.field8618 >= 0 && var10.field8622 < class34.field530 && var10.field8610 < class34.field531) {
                    int var11 = 0;
                    if (!var10.field5564) {
                        var11++;
                    }
                    if (var10.field5603 > class642.field8626) {
                        var11 += 2;
                    }
                    int var12 = var11 + (5 - var10.method2317((byte) 40) << 2);
                    if (class458.field6220 == 0) {
                        if (var10.field4052.field5774) {
                            var12 += 64;
                        } else {
                            var12 += 128;
                        }
                    } else if (class458.field6220 == 1) {
                        if (var10.field4052.field5774) {
                            var12 += 32;
                        } else {
                            var12 += 64;
                        }
                    }
                    if (var10.field4052.field5762) {
                        var12 += 1024;
                    } else if (!var10.field4052.field5726) {
                        var12 += 256;
                    }
                    var10.field5612 = var12 + 1;
                } else {
                    var10.field5612 = -1;
                }
            } else {
                var10.field5612 = -1;
            }
        }
        for (int var5 = 0; var5 < class129.field2154.length; var5++) {
            class149 var6 = class129.field2154[var5];
            if (var6 != null) {
                if (var6.field2385 == 1) {
                    class280 var7 = (class280) class616.field8143.method2918((long) var6.field2383, (byte) -125);
                    if (var7 != null) {
                        class287 var8 = var7.field3983;
                        if (var8.field5612 >= 0) {
                            var8.field5612 += 2048;
                        }
                    }
                } else if (var6.field2385 == 10) {
                    class403 var9 = class572.field7601[var6.field2383];
                    if (var9 != null && class199.field2897 != var9 && var9.field5612 >= 0) {
                        var9.field5612 += 2048;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V", line = 1418)
    public final void method1685(int arg0) {
        field3878++;
        method1690((byte) -90);
        class384.method2237(-107);
        class356.method2106(19857);
        class382.method2234((byte) 99);
        class72.method548(4);
        class642.method3534(64);
        class147.method1059(true);
        class6.method116(false);
        class290.method1790(false);
        class253.method1539(-3674);
        class11.method130(true);
        class504.method2795((byte) 99);
        class620.method3395(-111);
        class520.method2914(false);
        class395.method2265(6);
        class633.method3496((byte) 83);
        class397.method2278(0);
        class651.method3569((byte) 70);
        class254.method1554(-104);
        class149.method1068(-412321977);
        class213.method1362((byte) 30);
        class110.method817(-115);
        class103.method783(0);
        class497.method2757(24508);
        class246.method1512(true);
        class17.method175((byte) 100);
        class449.method2529(255);
        class600.method3307((byte) 47);
        class685.method3813(-27379);
        class666.method3742((byte) 76);
        class591.method3244(49);
        class603.method3325(false);
        class601.method3315(-40);
        class197.method1275(80);
        class534.method2970(false);
        class456.method2603((byte) 125);
        class195.method1267((byte) 95);
        class242.method1488(22256);
        class36.method283((byte) -125);
        class143.method1044(-121);
        class551.method3061(16268);
        class118.method925(82);
        class362.method2143((byte) -117);
        class91.method724((byte) 16);
        class556.method3077(19);
        class78.method611(false);
        class285.method1764(0);
        class280.method1746(-31163);
        class80.method636((byte) -91);
        class371.method2181(-26752);
        class201.method1313((byte) 124);
        class176.method1188((byte) 82);
        class661.method3718(1);
        class90.method717((byte) 100);
        class28.method244(false);
        class164.method1131((byte) 101);
        class177.method1193((byte) -121);
        class47.method326(true);
        class625.method3430(-22678);
        class480.method2678(-17460);
        class403.method2313((byte) -6);
        class221.method1394(-1);
        class154.method1085(39);
        class335.method1998((byte) 2);
        class402.method2305(5696);
        class411.method2355(-88);
        class24.method219((byte) 93);
        class135.method1009((byte) 111);
        class418.method2389(3);
        class287.method1771(false);
        class140.method1024(109);
        class52.method354(-1);
        class10.method122((byte) 103);
        class533.method2967(-127);
        class668.method3754((byte) -91);
        class563.method3090(7);
        class502.method2786(-1);
        class695.method3848(57);
        class444.method2506((byte) 11);
        class681.method3803(-1);
        class646.method3543(-11251);
        class233.method1453(-120);
        class188.method1235(-9631);
        class204.method1327((byte) -119);
        class209.method1341((byte) 81);
        class120.method936(-87);
        class515.method2880(-30122);
        class470.method2648((byte) 40);
        class226.method1421(23323);
        class405.method2324((byte) -82);
        class696.method3854((byte) 42);
        class616.method3370(-121);
        class307.method1847(false);
        class358.method2118((byte) 120);
        class178.method1196(0);
        class170.method1156((byte) -9);
        class483.method2700((byte) 85);
        class338.method2054(6);
        class58.method478((byte) 105);
        class545.method3024((byte) -20);
        class392.method2256(123);
        class139.method1021(-44);
        class419.method2399(-103);
        class488.method2734(16);
        class173.method1173((byte) 47);
        class26.method225(true);
        class217.method1383(-4640);
        class37.method290(-28);
        class511.method2839((byte) 60);
        class174.method1175(122);
        class65.method521(7);
        class291.method1793(25627);
        class234.method1456(0);
        class386.method2241(87);
        class70.method544((byte) 116);
        class379.method2220((byte) 88);
        class503.method2792(false);
        class555.method3069(18);
        class460.method2615(124);
        class116.method921((byte) -40);
        class518.method2888(false);
        class415.method2375(-25577);
        class627.method3452((byte) -98);
        class677.method3786((byte) 124);
        class645.method3541(-127);
        class273.method1659(1230);
        class541.method2986(14144);
        class567.method3110();
        class230.method1440(false);
        class374.method2200((byte) -41);
        class370.method2177(0);
        class702.method3884(4309);
        class375.method2204(-108);
        class700.method3874((byte) 126);
        class169.method1155(126);
        class467.method2634(-2);
        class679.method3791((byte) -73);
        class487.method2725((byte) 65);
        class655.method3587(13964);
        class485.method2715();
        class543.method2999((byte) 72);
        class526.method2938(-65);
        class617.method3377(-2984);
        class132.method994((byte) 37);
        class439.method2494(true);
        class544.method3005();
        class578.method3174(115);
        class53.method361(0);
        class76.method600();
        class634.method3503(true);
        class665.method3731((byte) 56);
        class462.method2622(-1);
        class84.method690(false);
        class48.method332(19678);
        class529.method2956((byte) -39);
        class360.method2135(125);
        class283.method1757(-106);
        class112.method910((byte) 67);
        class225.method1412(-126);
        class618.method3384(-96);
        class477.method2675((byte) -110);
        class18.method187((byte) -110);
        class684.method3808(-29244);
        class673.method3767((byte) 48);
        class276.method1673(-113);
        class318.method1890(-2);
        class596.method3292();
        class93.method737(-74);
        class171.method1162(true);
        class263.method1609(25);
        class247.method1515(63);
        class478.method2676();
        class206.method1336(-124);
        class628.method3456(99);
        class420.method2405(1);
        class357.method2107(-6596);
        class521.method2923(-17344);
        class706.method3898(-2);
        class597.method3293(19);
        class211.method1348();
        class8.method119(true);
        class105.method799(1399495239);
        class491.method2738((byte) -29);
        class509.method2827(false);
        class366.method2159(89);
        class129.method987((byte) 84);
        class538.method2975(10);
        class568.method3127(0);
        class344.method2071(96);
        class264.method1610(false);
        class281.method1749(-81);
        class46.method316((byte) -126);
        class656.method3592(10);
        class87.method697(-31680);
        class108.method808((byte) -100);
        class270.method1644((byte) -82);
        class161.method1123(23170);
        class346.method2078(false);
        class693.method3844(true);
        class530.method2959(-9227);
        class303.method1837(0);
        class326.method1961((byte) 108);
        class267.method1632(0);
        class369.method2175((byte) -50);
        class699.method3868((byte) -109);
        class236.method1468(-78);
        class199.method1286((byte) -64);
        class513.method2853((byte) 121);
        class570.method3135(71);
        class153.method1076(125);
        class653.method3577(121);
        class62.method496(11);
        class558.method3078(-549787511);
        class396.method2275(-1);
        class69.method540((byte) -25);
        class34.method268(31);
        class595.method3277(112);
        class160.method1117(false);
        class412.method2363((byte) -51);
        class229.method1430((byte) 93);
        class410.method2347((byte) -112);
        class454.method2591(14046);
        class703.method3887(5);
        class566.method3099(false);
        class67.method535((byte) -41);
        class587.method3234(-102);
        class333.method1976(true);
        class490.method2737((byte) 43);
        class190.method1240(48);
        class364.method2152(1);
        class194.method1253(75);
        class277.method1678(-889217044);
        class576.method3152(-79);
        class313.method1866((byte) 3);
        class664.method3728(false);
        class399.method2289(true);
        class409.method2346(-82);
        class431.method2452(30);
        class528.method2948(8);
        class43.method311(1);
        class711.method3911((byte) -72);
        class245.method1498();
        class55.method364(-9082);
        class636.method3516((byte) -120);
        class214.method1368(124);
        class228.method1426(1023);
        class486.method2724((byte) -76);
        class63.method508(-41);
        class408.method2341(-12025);
        class268.method1634(58);
        class92.method728(true);
        class363.method2145(127);
        class436.method2476(0);
        class654.method3579(false);
        class562.method3088(30709);
        class531.method2963((byte) -72);
        class704.method3889(23014);
        class319.method1891((byte) -66);
        class19.method192(-12508);
        class351.method2094((byte) -61);
        class156.method1092(-1);
        class581.method3194();
        class133.method1001(-111);
        class218.method1387(108);
        class89.method709();
        class607.method3336();
        class473.method2665(121);
        class158.method1102(3);
        class652.method3576();
        class615.method3364(998);
        class75.method593((byte) 58);
        class328.method1962(0);
        class390.method2253(true);
        class239.method1481((byte) 36);
        class269.method1640((byte) -58);
        class429.method2446((byte) -128);
        class175.method1182((byte) -59);
        class355.method2105(110);
        class639.method3529(true);
        class561.method3083((byte) 122);
        class251.method1530(-1);
        class614.method3354();
        class688.method3822((byte) 109);
        class352.method2099(23696);
        class583.method3204(-74);
        class348.method2082(-82);
        class457.method2608((byte) -62);
        class115.method915(60);
        class602.method3322(-70617448);
        class505.method2802(-9050);
        class172.method1167(false);
        class629.method3460(true);
        class471.method2652(29795);
        class38.method296((byte) 63);
        class536.method2973(4);
        class690.method3838(5430);
        class353.method2101(-49);
        class187.method1230((byte) -53);
        class39.method300(true);
        class637.method3520(16711680);
        class572.method3143(25087);
        class540.method2983(1);
        class137.method1013(true);
        class274.method1662(8);
        class667.method3752((byte) -97);
        class658.method3665(true);
        class258.method1582(false);
        class590.method3241(true);
        class292.method1795(-45);
        class123.method956((byte) 50);
        class416.method2384((byte) 31);
        class701.method3879(125);
        class109.method812(122);
        class141.method1031(-46);
        class79.method613(true);
        class367.method2164(10241);
        class275.method1668((byte) 107);
        class585.method3220(-1);
        class340.method2062(true);
        class649.method3560(15201);
        class51.method348(-29682);
        class592.method3253((byte) -24);
        class111.method849(7);
        class512.method2850((byte) -50);
        class294.method1811((byte) 82);
        class29.method248(-19589);
        class74.method574(1);
        class425.method2432(125);
        class584.method3212((byte) 121);
        class670.method3758(-4867);
        class421.method2420(false);
        class669.method3756(1);
        class464.method2625(-122);
        class235.method1466(-1);
        class501.method2784((byte) 107);
        class482.method2699(-30587);
        class193.method1251(-1);
        class256.method1573(-118);
        class388.method2247(14182);
        class282.method1751(true);
        class691.method3839((byte) 125);
        class5.method98(true);
        class332.method1970(true);
        class339.method2060();
        class97.method748(-126);
        class128.method982(-125);
        class301.method1831(false);
        class308.method1848(4096);
        class250.method1529((byte) 79);
        class107.method804(-6418);
        class2.method13(1579);
        class450.method2559(false);
        class284.method1759((byte) 100);
        class549.method3051(0);
        class705.method3891((byte) 57);
        class208.method1339(false);
        class16.method171((byte) -112);
        class237.method1474((byte) 65);
        class407.method2338((byte) -97);
        class216.method1379(106);
        class25.method222(-128);
        class148.method1061((byte) 1);
        class145.method1052(-47);
        class191.method1245(94);
        class619.method3387(false);
        class508.method2818((byte) -25);
        class295.method1814(-31);
        class565.method3098((byte) 80);
        class547.method3043(-56);
        class383.method2235((byte) 117);
        class426.method2436((byte) 44);
        class406.method2334(-16385);
        class138.method1018(-6701);
        class569.method3131((byte) 10);
        class95.method744(119);
        class265.method1616(-1);
        class223.method1398((byte) -5);
        class232.method1446(false);
        class321.method1902();
        class3.method23(-1);
        class82.method679((byte) -122);
        class155.method1086(19634);
        class182.method1211();
        class400.method2292((byte) 56);
        class205.method1333(-119);
        class586.method3228(-1);
        class32.method266(2048);
        class659.method3695(0);
        class692.method3842(22);
        class262.method1607(126);
        class260.method1589((byte) -120);
        class391.method2255((byte) 109);
        class101.method771(-90);
        class398.method2286(0);
        class465.method2629(0);
        class207.method1338(128);
        class59.method487(2345);
        class548.method3047(990411344);
        class98.method753(2);
        class311.method1859(110);
        class68.method538(-70);
        class657.method3596((byte) 52);
        class179.method1199(-23737);
        class438.method2491(false);
        class124.method964(true);
        class708.method3901(false);
        class94.method738(true);
        class559.method3082((byte) 88);
        class350.method2087((byte) -74);
        class310.method1856(true);
        class23.method216(0);
        class476.method2672(3);
        class466.method2632((byte) 93);
        class255.method1570(1);
        class522.method2926(112);
        class373.method2198(-126);
        class152.method1074(8);
        class317.method1887((byte) -109);
        class198.method1281(-1);
        class516.method2882((byte) 54);
        class102.method778(true);
        class44.method314(14);
        class527.method2946(120);
        class345.method2075((byte) -120);
        class376.method2212(110);
        class611.method3348((byte) -83);
        class546.method3038(2424);
        class613.method3352((byte) -106);
        class322.method1955(-6411);
        class244.method1497(3715);
        class304.method1838(false);
        class334.method1979(true);
        class125.method968((byte) -110);
        class127.method976((byte) 96);
        class443.method2502(-4097);
        class484.method2704((byte) -74);
        class122.method943((byte) -69);
        class433.method2454((byte) 2);
        class312.method1860(28314);
        class672.method3763((byte) 110);
        class166.method1137(-1);
        class683.method3807(true);
        class446.method2512(false);
        class316.method1884(60);
        class61.method494(127);
        class381.method2225(120);
        class445.method2511((byte) -111);
        class525.method2935(119);
        class640.method3532(92);
        class286.method1766(-56);
        class126.method970((byte) -128);
        class368.method2171((byte) -115);
        class623.method3403((byte) 118);
        class189.method1237((byte) -63);
        class315.method1880(-116);
        class624.method3408(100);
        class266.method1625(-8501);
        class389.method2248(true);
        if (arg0 <= 20) {
            return;
        }
        class99.method761((byte) 27);
        class305.method1845((byte) -51);
        class119.method931((byte) -101);
        class64.method512(-2);
        class77.method604((byte) 68);
        class117.method922(-101);
        class674.method3769((byte) 86);
        class428.method2444(-21);
        class271.method1647((byte) -35);
        class510.method2830(8);
        class643.method3536(-66);
        class394.method2261((byte) 11);
        class252.method1533(27);
        class492.method2746((byte) -81);
        class663.method3727(-83);
        class249.method1527(126);
        class131.method990(84);
        class608.method3337(false);
        class168.method1150(0);
        class710.method3909((byte) 26);
        class314.method1873((byte) -124);
        class599.method3300(10);
        class104.method797(-117);
        class461.method2620(27461);
        class88.method702(-63);
        class697.method3861(true);
        class243.method1494(-20981);
        class687.method3817(-6776);
        class329.method1965(true);
        class680.method3797(4126);
        if (class395.field5240) {
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V", line = 1916)
    public final synchronized void method1686(boolean arg0) {
        field3891++;
        if (class486.field6574 != null && class443.field6072 == null) {
            try {
                Class var2 = class486.field6574.getClass();
                Field var3 = var2.getDeclaredField("canvas");
                class443.field6072 = (Canvas) var3.get(class486.field6574);
                var3.set(class486.field6574, null);
                if (class443.field6072 != null) {
                    return;
                }
            } catch (Exception var4) {
            }
        }
        super.method1686(arg0);
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V", line = 1944)
    public final void method1687(boolean arg0) {
        if (arg0) {
            method1701(null);
        }
        field3876++;
        if (class571.field7587 != 2) {
            this.method1699(-79);
            return;
        }
        try {
            this.method1699(-109);
        } catch (ThreadDeath var4) {
            throw var4;
        } catch (Throwable var5) {
            class259.method1586(var5, var5.getMessage() + " (Recovered) " + this.method1703(256), (byte) 8);
            class405.method2326(0, -98);
        }
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V", line = 1970)
    private final void method1688(int arg0) {
        field3888++;
        if (class32.field525 == 14) {
            return;
        }
        class642.field8626++;
        if ((class642.field8626 % 1000) == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class456.field6201 = var2.get(11) * 600 + var2.get(12) * 10 + var2.get(13) / 6;
            class250.field3456.setSeed((long) class456.field6201);
        }
        if (class642.field8626 % 50 == 0) {
            class345.field4752 = class413.field5664;
            class295.field4166 = class68.field1032;
            class413.field5664 = 0;
            class68.field1032 = 0;
        }
        this.method1695(false);
        if (class318.field4365 != null) {
            class318.field4365.method1507((byte) 74);
        }
        class219.method1389((byte) -120);
        class561.field7444.method3272(0);
        class164.field2564.method1104(2);
        if (class10.field197 != null) {
            class10.field197.method52((int) class681.method3802(-23600));
        }
        class123.method958(1);
        class386.field5134 = 0;
        class404.field5409 = 0;
        for (class293 var3 = class561.field7444.method3274((byte) -30); var3 != null; var3 = class561.field7444.method3274((byte) -30)) {
            int var6 = var3.method1806((byte) -80);
            if (var6 == 2 || var6 == 3) {
                char var7 = var3.method1805(18449);
                if (class571.method3136((byte) -74) && (var7 == '`' || var7 == '§')) {
                    if (class310.method1855((byte) -92)) {
                        class48.method333((byte) 0);
                    } else {
                        class389.method2251(-107);
                    }
                } else if (class404.field5409 < 128) {
                    class107.field1576[class404.field5409] = var3;
                    class404.field5409++;
                }
            } else if (var6 == 0 && class386.field5134 < 75) {
                class548.field7318[class386.field5134] = var3;
                class386.field5134++;
            }
        }
        class36.field551 = 0;
        for (class458 var4 = class164.field2564.method1107((byte) -69); var4 != null; var4 = class164.field2564.method1107((byte) -125)) {
            int var5 = var4.method1649(-20210);
            if (var5 == -1) {
                class674.field9534.method3265(var4, (byte) -67);
            } else if (var5 == 6) {
                class36.field551 += var4.method1655((byte) 29);
            } else if (class506.method2803((byte) 102, var5)) {
                class399.field5298.method3265(var4, (byte) -117);
                if (class399.field5298.method3261((byte) -67) > 10) {
                    class399.field5298.method3262(-121);
                }
            }
        }
        if (class310.method1855((byte) -92)) {
            class677.method3787((byte) -124);
        }
        if (class177.method1194((byte) -116, class32.field525)) {
            class255.method1569((byte) -50);
            class689.method3827(-76);
        } else if (class518.method2889(class32.field525, (byte) 0)) {
            class671.method3759(-108);
        }
        if (class445.method2509(-7, class32.field525) && !class518.method2889(class32.field525, (byte) 0)) {
            this.method1700(0);
            class74.method567((byte) -46);
            class290.method1789(0);
        } else if (method1691(false, class32.field525) && !class518.method2889(class32.field525, (byte) 0)) {
            this.method1700(0);
            class290.method1789(0);
        } else if (class32.field525 == 12) {
            class290.method1789(0);
        } else if (class530.method2958(class32.field525, -101) && !class518.method2889(class32.field525, (byte) 0)) {
            class473.method2666((byte) 127);
        } else if (class32.field525 == 13) {
            class290.method1789(0);
            if (class347.field4765 != -3 && class347.field4765 != 2 && class347.field4765 != 15) {
                class55.method365((byte) -114, false);
            }
        }
        class271.method1653(class10.field197, -27617);
        class399.field5298.method3262(-123);
        if (arg0 >= -67) {
            this.method1680(true, -69);
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V", line = 2137)
    public final void method1689(boolean arg0) {
        field3882++;
        if (class193.field2825) {
            class177.method1190(0);
        }
        class180.method1203((byte) 92);
        if (class10.field197 != null) {
            class10.field197.method3574(-117);
        }
        if (class216.field3087 != null) {
            class232.method1450(class216.field3087, class688.field9669, 3);
            class216.field3087 = null;
        }
        if (class370.field4996 != null) {
            class370.field4996.method633(9);
            class370.field4996 = null;
        }
        class201.method1319(-1378671193);
        class315.field4343.method793(18);
        class277.field3872.method2756(false);
        if (class216.field3081 != null) {
            class216.field3081.method1187(-1);
            class216.field3081 = null;
        }
        try {
            class563.field7465.method3305(2);
            for (int var2 = 0; var2 < 35; var2++) {
                class176.field2708[var2].method3305(2);
            }
            if (!arg0) {
                field3875 = null;
            }
            class692.field9735.method3305(2);
            class221.field3134.method3305(2);
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V", line = 2191)
    public static void method1690(byte arg0) {
        field3875 = null;
        int var1 = 83 / ((arg0 - 4) / 48);
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(ZI)Z", line = 2201)
    public static final boolean method1691(boolean arg0, int arg1) {
        field3883++;
        if (arg0) {
            return false;
        } else {
            return arg1 == 7 || arg1 == 8 || arg1 == 9;
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "()V", line = 2215)
    public static final void method1692() {
        int var0 = class664.field9426;
        int[] var1 = class55.field762;
        int var2 = class434.field5933 ? var0 : class92.field1396 + var0;
        for (int var3 = 0; var3 < var2; var3++) {
            class411 var4;
            if (var3 < var0) {
                var4 = class572.field7601[var1[var3]];
            } else {
                var4 = ((class280) class616.field8143.method2918((long) class415.field5681[var3 - var0], (byte) -127)).field3983;
            }
            if (var4.field5612 >= 0) {
                int var5 = var4.method2317((byte) 40);
                if ((var5 & 0x1) == 0) {
                    if ((var4.field8620 & 0x1FF) == 0 && (var4.field8612 & 0x1FF) == 0) {
                        continue;
                    }
                } else if ((var4.field8620 & 0x1FF) == 256 && (var4.field8612 & 0x1FF) == 256) {
                    continue;
                }
                if (var4 instanceof class403 && var4.field5646 != null && class642.field8626 >= var4.field5646.field619 && class642.field8626 < var4.field5646.field613) {
                    ((class403) var4).field5393 = false;
                }
                var4.field8616 = class315.method1878(var4.field8620, 2921, var4.field8609, var4.field8612);
                class618.method3385(var4, true);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V", line = 2259)
    private final void method1693(int arg0) {
        field3877++;
        if (class561.field7440 < class315.field4343.field1553) {
            class214.field3059.method1331(false);
            class470.field6290 = (class315.field4343.field1553 * 50 - 50) * 5;
            if (class470.field6290 > 3000) {
                class470.field6290 = 3000;
            }
            if (class315.field4343.field1553 >= 2 && class315.field4343.field1551 == 6) {
                this.method2267("js5connect_outofdate", -123);
                class32.field525 = 14;
                return;
            }
            if (class315.field4343.field1553 >= 4 && class315.field4343.field1551 == -1) {
                this.method2267("js5crc", -128);
                class32.field525 = 14;
                return;
            }
            if (class315.field4343.field1553 >= 4 && class177.method1194((byte) -120, class32.field525)) {
                if (class315.field4343.field1551 == 7 || class315.field4343.field1551 == 9) {
                    this.method2267("js5connect_full", -127);
                } else if (class315.field4343.field1551 <= 0) {
                    this.method2267("js5io", 114);
                } else if (class123.field2062 == null) {
                    this.method2267("js5connect", 76);
                } else {
                    this.method2267("js5proxy_" + class123.field2062.trim(), -119);
                }
                class32.field525 = 14;
                return;
            }
        }
        class561.field7440 = class315.field4343.field1553;
        if (class470.field6290 > 0) {
            class470.field6290--;
            return;
        }
        try {
            if (class672.field9518 == 0) {
                class623.field8244 = class214.field3059.method1330((byte) 85, class688.field9669);
                class672.field9518++;
            }
            if (arg0 <= 10) {
                this.method1689(true);
            }
            if (class672.field9518 == 1) {
                if (class623.field8244.field2816 == 2) {
                    if (class623.field8244.field2820 != null) {
                        class123.field2062 = (String) class623.field8244.field2820;
                    }
                    this.method1680(true, 1000);
                    return;
                }
                if (class623.field8244.field2816 == 1) {
                    class672.field9518++;
                }
            }
            if (class672.field9518 == 2) {
                class209.field2991 = new class110((Socket) class623.field8244.field2820, class688.field9669);
                class335 var2 = new class335(5);
                var2.method1980(-345277664, class597.field7920.field9432);
                var2.method1982(617, (byte) 63);
                class209.field2991.method815(0, var2.field4600, 66, 5);
                class672.field9518++;
                class628.field8467 = class681.method3802(-23600);
            }
            if (class672.field9518 == 3) {
                if (class177.method1194((byte) 112, class32.field525) || class209.field2991.method818(-19508) > 0) {
                    int var3 = class209.field2991.method821(false);
                    if (var3 != 0) {
                        this.method1680(true, var3);
                        return;
                    }
                    class672.field9518++;
                } else if ((class681.method3802(-23600) - class628.field8467) > 30000L) {
                    this.method1680(true, 1001);
                    return;
                }
            }
            if (class672.field9518 == 4) {
                boolean var4 = class177.method1194((byte) 69, class32.field525) || class445.method2509(-7, class32.field525) || method1691(false, class32.field525);
                class6[] var5 = class6.method113(7);
                class335 var6 = new class335(var5.length * 4);
                class209.field2991.method814(var6.field4600.length, var6.field4600, true, 0);
                for (int var7 = 0; var7 < var5.length; var7++) {
                    var5[var7].method112((byte) -121, var6.method2045(-98));
                }
                class315.field4343.method779(0, class209.field2991, !var4);
                class623.field8244 = null;
                class209.field2991 = null;
                class672.field9518 = 0;
            }
        } catch (IOException var8) {
            this.method1680(true, 1002);
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(Z)V", line = 2427)
    public final void method1694(boolean arg0) {
        field3881++;
        if (class229.field3211) {
            class660.field9362 = 64;
        }
        Frame var2 = new Frame("Jagex");
        var2.pack();
        var2.dispose();
        class583.method3205((byte) 85);
        class277.field3872 = new class497(class688.field9669);
        class315.field4343 = new class103();
        class224.method1403(new int[] { 1000, 100 }, new int[] { 20, 260 }, 0);
        if (class616.field8169 != class137.field2222) {
            class373.field5029 = new byte[50][];
        }
        class344.field4718 = new class254(class688.field9669);
        if (class616.field8169 == class137.field2222) {
            class488.field6601.field2957 = this.getCodeBase().getHost();
        } else if (class317.method1886((byte) 63, class137.field2222)) {
            class488.field6601.field2957 = this.getCodeBase().getHost();
            class488.field6601.field2958 = class488.field6601.field2955 + 40000;
            class38.field570.field2958 = class38.field570.field2955 + 40000;
            class488.field6601.field2956 = class488.field6601.field2955 + 50000;
            class367.field4972.field2958 = class367.field4972.field2955 + 40000;
            class38.field570.field2956 = class38.field570.field2955 + 50000;
            class367.field4972.field2956 = class367.field4972.field2955 + 50000;
        } else if (class281.field3991 == class137.field2222) {
            class488.field6601.field2957 = "127.0.0.1";
            class38.field570.field2957 = "127.0.0.1";
            class367.field4972.field2957 = "127.0.0.1";
            class488.field6601.field2958 = class488.field6601.field2955 + 40000;
            class38.field570.field2958 = class38.field570.field2955 + 40000;
            class488.field6601.field2956 = class488.field6601.field2955 + 50000;
            class367.field4972.field2958 = class367.field4972.field2955 + 40000;
            class38.field570.field2956 = class38.field570.field2955 + 50000;
            class367.field4972.field2956 = class367.field4972.field2955 + 50000;
        }
        if (class488.field6599 == class392.field5166) {
            class363.field4912 = true;
            class487.field6583 = class702.field9890;
            class16.field243 = 0;
            class335.field4639 = 16777215;
            class103.field1527 = class23.field393;
        } else {
            class487.field6583 = class420.field5812;
            class103.field1527 = class171.field2636;
        }
        if (class443.field6069 == class392.field5166) {
            class384.field5117 = false;
        }
        class214.field3059 = class488.field6601;
        class310.field4267 = class397.field5278 = class333.field4578 = class356.field4834 = new short[256];
        try {
            class636.field8566 = class139.field2244.getToolkit().getSystemClipboard();
        } catch (Exception var4) {
        }
        class561.field7444 = class155.method1088(class443.field6072, 121);
        class164.field2564 = class427.method2439(-69, class443.field6072, arg0);
        try {
            if (class688.field9669.field6933 != null) {
                class563.field7465 = new class600(class688.field9669.field6933, 5200, 0);
                for (int var3 = 0; var3 < 35; var3++) {
                    class176.field2708[var3] = new class600(class688.field9669.field6908[var3], 6000, 0);
                }
                class692.field9735 = new class600(class688.field9669.field6914, 6000, 0);
                class703.field9901 = new class685(255, class563.field7465, class692.field9735, 500000);
                class221.field3134 = new class600(class688.field9669.field6918, 24, 0);
                class688.field9669.field6933 = null;
                class688.field9669.field6918 = null;
                class688.field9669.field6914 = null;
                class688.field9669.field6908 = null;
            }
        } catch (IOException var5) {
            class563.field7465 = null;
            class692.field9735 = null;
            class221.field3134 = null;
            class703.field9901 = null;
        }
        if (class616.field8169 != class137.field2222) {
            class286.field4034 = true;
        }
        if (class443.field6069 == class392.field5166) {
            class335.field4594 = class72.field1064.method546(class516.field6892, (byte) -35);
        } else if (class488.field6599 == class392.field5166) {
            class335.field4594 = class72.field1067.method546(class516.field6892, (byte) -35);
            return;
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(Z)V", line = 2549)
    private final void method1695(boolean arg0) {
        if (arg0) {
            method1682(53);
        }
        field3889++;
        boolean var2 = class315.field4343.method790(8);
        if (!var2) {
            this.method1693(49);
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "()V", line = 2564)
    public static final void method1696() {
        class262.field3646 = 0;
        for (int var0 = 0; var0 < class92.field1396; var0++) {
            class287 var1 = ((class280) class616.field8143.method2918((long) class415.field5681[var0], (byte) 30)).field3983;
            if (var1.field5564 && var1.method1780((byte) 100) != -1) {
                int var2 = (var1.method2317((byte) 40) - 1) * 256 + 252;
                int var3 = var1.field8620 - var2 >> 9;
                int var4 = var1.field8612 - var2 >> 9;
                class411 var5 = class195.method1257(0, var3, var4, var1.field8609);
                if (var5 != null) {
                    int var6 = var5.field5633;
                    if (var5 instanceof class287) {
                        var6 += 2048;
                    }
                    if (var5.field5565 == 0 && var5.method1780((byte) 124) != -1) {
                        class471.field6306[class262.field3646] = var6;
                        class94.field1443[class262.field3646] = var6;
                        class262.field3646++;
                        var5.field5565++;
                    }
                    class471.field6306[class262.field3646] = var6;
                    class94.field1443[class262.field3646] = var1.field5633 + 2048;
                    class262.field3646++;
                    var5.field5565++;
                }
            }
        }
        class234.method1464(class471.field6306, 0, class262.field3646 - 1, class94.field1443, 109);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lgba;)Z", line = 2614)
    public static final boolean method1697(class625 arg0) {
        if (class295.field4171) {
            if (method1701(arg0).field725 != 0) {
                return false;
            }
            if (arg0.field8421 == 0) {
                return false;
            }
        }
        return arg0.field8432;
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "()V", line = 2632)
    public static final void method1698() {
        for (int var0 = 0; var0 < class34.field530; var0++) {
            int[] var1 = class572.field7595[var0];
            for (int var2 = 0; var2 < class34.field531; var2++) {
                var1[var2] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V", line = 2650)
    private final void method1699(int arg0) {
        field3886++;
        if (class32.field525 == 14) {
            return;
        }
        long var2 = class78.method605(-26890) / 1000000L - class93.field1417;
        class93.field1417 = class78.method605(-26890) / 1000000L;
        boolean var4 = class170.method1161(91);
        if (var4 && class137.field2225 && class394.field5189 != null) {
            class394.field5189.method1461(false);
        }
        if (class175.method1183(class32.field525, -8)) {
            if (class310.field4270 != 0L && class681.method3802(-23600) > class310.field4270) {
                class212.method1359(class662.method3719(-1), true, class344.field4718.field5447, class344.field4718.field5462, false);
            } else if (!class10.field197.method380() && class171.field2634) {
                class352.method2100(-2);
            }
        }
        if (class216.field3087 == null) {
            Container var5;
            if (class490.field6611 != null) {
                var5 = class490.field6611;
            } else if (class486.field6574 == null) {
                var5 = class619.field8207;
            } else {
                var5 = class486.field6574;
            }
            int var6 = var5.getSize().width;
            int var7 = var5.getSize().height;
            if (class490.field6611 == var5) {
                Insets var8 = class490.field6611.getInsets();
                var7 -= var8.top + var8.bottom;
                var6 -= var8.left + var8.right;
            }
            if (class559.field7427 != var6 || class164.field2569 != var7 || class543.field7145) {
                if (class10.field197 == null || class10.field197.method452()) {
                    class583.method3205((byte) 87);
                } else {
                    class164.field2569 = var7;
                    class559.field7427 = var6;
                }
                class310.field4270 = class681.method3802(-23600) + 500L;
                class543.field7145 = false;
            }
        }
        if (arg0 >= -77) {
            field3892 = 108;
        }
        if (class216.field3087 != null && !class277.field3867 && class175.method1183(class32.field525, -8)) {
            class212.method1359(class344.field4718.field5439, true, -1, -1, false);
        }
        boolean var9 = false;
        if (class617.field8185) {
            class617.field8185 = false;
            var9 = true;
        }
        if (var9) {
            class428.method2445(126);
        }
        if (class10.field197 != null && class10.field197.method380() || class662.method3719(-1) != 1) {
            class449.method2540((byte) -69);
        }
        if (class177.method1194((byte) 117, class32.field525)) {
            class506.method2807(27847, var9);
        } else if (class666.method3741(96, class32.field525)) {
            class214.method1370(-16);
        } else if (class480.method2680(-88, class32.field525)) {
            class214.method1370(116);
        } else if (class518.method2889(class32.field525, (byte) 0)) {
            if (class558.field7405 == 1) {
                if (class525.field6998 > class236.field3324) {
                    class236.field3324 = class525.field6998;
                }
                int var10 = (class236.field3324 - class525.field6998) * 50 / class236.field3324;
                class172.method1166((byte) -66, class72.field1076.method546(class516.field6892, (byte) -35) + "<br>(" + var10 + "%)", true, class10.field197, class188.field2788, class665.field9437);
            } else if (class558.field7405 == 2) {
                if (class687.field9654 > class75.field1194) {
                    class75.field1194 = class687.field9654;
                }
                int var11 = (class75.field1194 - class687.field9654) * 50 / class75.field1194 + 50;
                class172.method1166((byte) -18, class72.field1076.method546(class516.field6892, (byte) -35) + "<br>(" + var11 + "%)", true, class10.field197, class188.field2788, class665.field9437);
            } else {
                class172.method1166((byte) -64, class72.field1076.method546(class516.field6892, (byte) -35), true, class10.field197, class188.field2788, class665.field9437);
            }
        } else if (class32.field525 == 10) {
            class541.method2987(true, var2);
        } else if (class32.field525 == 13) {
            class172.method1166((byte) -22, class72.field1078.method546(class516.field6892, (byte) -35) + "<br>" + class72.field1079.method546(class516.field6892, (byte) -35), true, class10.field197, class188.field2788, class665.field9437);
        }
        if (class476.field6354 == 3) {
            for (int var12 = 0; var12 < class172.field2661; var12++) {
                Rectangle var13 = class443.field6070[var12];
                if (class87.field1313[var12]) {
                    class10.field197.method3567(var13.width, var13.x, var13.height, var13.y, -1996553985, (byte) 115);
                } else if (class209.field2994[var12]) {
                    class10.field197.method3567(var13.width, var13.x, var13.height, var13.y, -1996554240, (byte) 110);
                }
            }
        }
        if (class310.method1855((byte) -92)) {
            class172.method1169(class10.field197, 71);
        }
        if (class688.field9669.field6917 && class175.method1183(class32.field525, -8) && class476.field6354 == 0 && class662.method3719(-1) == 1 && !var9) {
            int var16 = 0;
            for (int var17 = 0; var17 < class172.field2661; var17++) {
                if (class209.field2994[var17]) {
                    class209.field2994[var17] = false;
                    class556.field7394[var16++] = class443.field6070[var17];
                }
            }
            try {
                class10.field197.method86(class556.field7394, var16);
            } catch (class26 var18) {
            }
        } else if (!class177.method1194((byte) 82, class32.field525)) {
            for (int var14 = 0; var14 < class172.field2661; var14++) {
                class209.field2994[var14] = false;
            }
            try {
                class10.field197.method97();
            } catch (class26 var19) {
                class259.method1586(var19, var19.getMessage() + " (Recovered) " + this.method1703(256), (byte) 8);
                class405.method2326(0, -123);
            }
        }
        if (class344.field4718.field5454 == 0) {
            class486.method2722(0, 15L);
        } else if (class344.field4718.field5454 == 1) {
            class486.method2722(0, 10L);
        } else if (class344.field4718.field5454 == 2) {
            class486.method2722(0, 5L);
        } else if (class344.field4718.field5454 == 3) {
            class486.method2722(0, 2L);
        }
        if (class335.field4606) {
            class73.method551(true);
        }
        if (class344.field4718.field5452 && class32.field525 == 3 && class251.field3463 != -1) {
            class344.field4718.field5452 = false;
            class344.field4718.method1562(98, class688.field9669);
        }
    }

    @OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V", line = 2900)
    private final void method1700(int arg0) {
        field3884++;
        if (class32.field525 == 7 && class139.field2251 == 0) {
            if (class108.field1587 > 1) {
                class301.field4203 = class367.field4959;
                class108.field1587--;
            }
            if (!class388.field5142) {
                class51.method346(true);
            }
            for (int var2 = 0; var2 < 100 && class672.method3764(14097); var2++) {
            }
        }
        class104.field1561++;
        class575.method3150(null, 5952, -1, -1);
        class585.method3218(null, -1, -2, -1);
        class116.method920(arg0 + 11651);
        class367.field4959++;
        for (int var3 = 0; var3 < class176.field2705; var3++) {
            class287 var4 = class51.field718[var3].field3983;
            if (var4 != null) {
                byte var5 = var4.field4052.field5735;
                if ((var5 & 0x1) != 0) {
                    int var6 = var4.method2317((byte) 40);
                    if ((var5 & 0x2) != 0 && var4.field5642 == 0 && Math.random() * 1000.0D < 10.0D) {
                        int var7 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        int var8 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        if (var7 != 0 || var8 != 0) {
                            int var9 = var4.field5643[0] + var7;
                            if (var9 < 0) {
                                var9 = 0;
                            } else if (class34.field530 - var6 - 1 < var9) {
                                var9 = class34.field530 - var6 - 1;
                            }
                            int var10 = var4.field5649[0] + var8;
                            if (var10 < 0) {
                                var10 = 0;
                            } else if ((class34.field531 - var6 - 1) < var10) {
                                var10 = class34.field531 - var6 - 1;
                            }
                            int var11 = class119.method933(var4.field5643[0], var6, var9, true, var4.field5649[0], 0, 2, class591.field7820[var4.field8609], var6, 0, var10, var6, -1, class204.field2953, class629.field8482);
                            if (var11 > 0) {
                                if (var11 > 9) {
                                    var11 = 9;
                                }
                                for (int var12 = 0; var12 < var11; var12++) {
                                    var4.field5643[var12] = class629.field8482[var11 - var12 - 1];
                                    var4.field5649[var12] = class204.field2953[var11 - var12 - 1];
                                    var4.field5650[var12] = 1;
                                }
                                var4.field5642 = var11;
                            }
                        }
                    }
                    class371.method2185(true, true, var4);
                    int var13 = class402.method2304(var4, (byte) 82);
                    class677.method3785(class540.field7119, 110, var4, class2.field14, var13);
                    class36.method281(var4, class2.field14, 5255);
                    class317.method1889(var4, -1);
                }
            }
        }
        if (class139.field2251 == 0 && class639.field8597 == 0) {
            if (class140.field2254 == 2) {
                class409.method2345(15393);
            } else {
                class438.method2492((byte) -93);
            }
            if ((class259.field3563 >> 9) < 14 || class34.field530 - 14 <= class259.field3563 >> 9 || (class643.field8632 >> 9) < 14 || class643.field8632 >> 9 >= class34.field531 - 14) {
                class412.method2365(false);
            }
        }
        while (true) {
            class48 var14;
            class625 var15;
            class625 var16;
            do {
                var14 = (class48) class697.field9793.method3262(arg0 - 121);
                if (var14 == null) {
                    while (true) {
                        class48 var17;
                        class625 var18;
                        class625 var19;
                        do {
                            var17 = (class48) class16.field247.method3262(-127);
                            if (var17 == null) {
                                while (true) {
                                    class48 var20;
                                    class625 var21;
                                    class625 var22;
                                    do {
                                        var20 = (class48) class46.field658.method3262(-123);
                                        if (var20 == null) {
                                            if (class109.field1591 != null) {
                                                class315.method1879((byte) 99);
                                            }
                                            if ((class642.field8626 % 1500) == 0) {
                                                class27.method232((byte) 0);
                                            }
                                            if (class32.field525 == 7 && class139.field2251 == 0) {
                                                class656.method3590(10);
                                            }
                                            class6.method114(-1);
                                            if (class193.field2825 && class681.method3802(-23600) - 60000L > class615.field8139) {
                                                class177.method1190(0);
                                            }
                                            for (class266 var23 = (class266) class530.field7061.method328(arg0 + arg0); var23 != null; var23 = (class266) class530.field7061.method331((byte) -104)) {
                                                if ((class681.method3802(-23600) / 1000L - 5L) > ((long) var23.field3697)) {
                                                    if (var23.field3691 > 0) {
                                                        class135.method1011("", "", var23.field3695 + class72.field1083.method546(class516.field6892, (byte) -35), 5, "", 0, 111);
                                                    }
                                                    if (var23.field3691 == 0) {
                                                        class135.method1011("", "", var23.field3695 + class72.field1084.method546(class516.field6892, (byte) -35), 5, "", 0, 105);
                                                    }
                                                    var23.method2787(false);
                                                }
                                            }
                                            if (class32.field525 == 7 && class139.field2251 == 0) {
                                                if (class370.field4996 == null) {
                                                    class55.method365((byte) -112, false);
                                                    return;
                                                }
                                                class592.field7835++;
                                                if (class592.field7835 > 50) {
                                                    class643.field8631++;
                                                    class402 var24 = class390.method2252(class586.field7770, arg0 - 114, class262.field3644);
                                                    class36.method278(0, var24);
                                                }
                                                try {
                                                    class179.method1200(81);
                                                    return;
                                                } catch (IOException var25) {
                                                    class55.method365((byte) -125, false);
                                                    return;
                                                }
                                            }
                                            return;
                                        }
                                        var21 = var20.field692;
                                        if (var21.field8418 < 0) {
                                            break;
                                        }
                                        var22 = class153.method1078(arg0 + 65535, var21.field8288);
                                    } while (var22 == null || var22.field8420 == null || var21.field8418 >= var22.field8420.length || var22.field8420[var21.field8418] != var21);
                                    class544.method3013(var20);
                                }
                            }
                            var18 = var17.field692;
                            if (var18.field8418 < 0) {
                                break;
                            }
                            var19 = class153.method1078(arg0 + 65535, var18.field8288);
                        } while (var19 == null || var19.field8420 == null || var19.field8420.length <= var18.field8418 || var19.field8420[var18.field8418] != var18);
                        class544.method3013(var17);
                    }
                }
                var15 = var14.field692;
                if (var15.field8418 < 0) {
                    break;
                }
                var16 = class153.method1078(65535, var15.field8288);
            } while (var16 == null || var16.field8420 == null || var15.field8418 >= var16.field8420.length || var16.field8420[var15.field8418] != var15);
            class544.method3013(var14);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Lgba;)Lmk;", line = 3178)
    public static final class52 method1701(class625 arg0) {
        class52 var1 = (class52) class170.field2615.method2918(((long) arg0.field8327 << 32) + (long) arg0.field8418, (byte) -126);
        return var1 == null ? arg0.field8287 : var1;
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Lgba;)Lgba;", line = 3185)
    public static final class625 method1702(class625 arg0) {
        int var1 = method1701(arg0).method350((byte) 120);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class153.method1078(65535, arg0.field8288);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V", line = 3204)
    public final void init() {
        field3890++;
        if (!this.method2262(-122)) {
            return;
        }
        class488.field6601 = new class204();
        class488.field6601.field2955 = Integer.parseInt(this.getParameter("worldid"));
        class38.field570 = new class204();
        class38.field570.field2955 = Integer.parseInt(this.getParameter("lobbyid"));
        class38.field570.field2957 = this.getParameter("lobbyaddress");
        class367.field4972 = new class204();
        class367.field4972.field2955 = Integer.parseInt(this.getParameter("demoid"));
        class367.field4972.field2957 = this.getParameter("demoaddress");
        class137.field2222 = class329.method1964((byte) 122, Integer.parseInt(this.getParameter("modewhere")));
        if (class281.field3991 == class137.field2222) {
            class137.field2222 = class677.field9568;
        } else if (!class317.method1886((byte) 95, class137.field2222) && class616.field8169 != class137.field2222) {
            class137.field2222 = class616.field8169;
        }
        class195.field2848 = class515.method2877(-67, Integer.parseInt(this.getParameter("modewhat")));
        if (class529.field7048 != class195.field2848 && class195.field2848 != class169.field2609 && class527.field7026 != class195.field2848) {
            class195.field2848 = class527.field7026;
        }
        try {
            class516.field6892 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var14) {
            class516.field6892 = 0;
        }
        String var1 = this.getParameter("objecttag");
        if (var1 != null && var1.equals("1")) {
            class325.field4501 = true;
        } else {
            class325.field4501 = false;
        }
        String var2 = this.getParameter("js");
        if (var2 != null && var2.equals("1")) {
            class292.field4152 = true;
        } else {
            class292.field4152 = false;
        }
        String var3 = this.getParameter("advert");
        if (var3 != null && var3.equals("1")) {
            class670.field9501 = true;
        } else {
            class670.field9501 = false;
        }
        String var4 = this.getParameter("game");
        if (var4 != null) {
            if (var4.equals("0")) {
                class392.field5166 = class443.field6069;
            } else if (var4.equals("1")) {
                class392.field5166 = class488.field6599;
            }
        }
        try {
            class88.field1330 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var13) {
            class88.field1330 = 0;
        }
        class141.field2272 = this.getParameter("quiturl");
        class482.field6480 = this.getParameter("settings");
        if (class482.field6480 == null) {
            class482.field6480 = "";
        }
        String var5 = this.getParameter("country");
        if (var5 != null) {
            try {
                class115.field1975 = Integer.parseInt(var5);
            } catch (Exception var12) {
                class115.field1975 = 0;
            }
        }
        class580.field7704 = Integer.parseInt(this.getParameter("colourid"));
        if (class580.field7704 < 0 || class580.field7704 >= class153.field2413.length) {
            class580.field7704 = 0;
        }
        if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
            class139.field2243 = true;
            class221.field3125 = true;
        }
        String var6 = this.getParameter("frombilling");
        if (var6 != null && var6.equals("true")) {
            class559.field7424 = true;
        }
        class592.field7831 = this.getParameter("sskey");
        if (class592.field7831 != null && class592.field7831.length() < 2) {
            class592.field7831 = null;
        }
        String var7 = this.getParameter("force64mb");
        if (var7 != null && var7.equals("true")) {
            class229.field3211 = true;
        }
        String var8 = this.getParameter("worldflags");
        if (var8 != null) {
            try {
                class331.field4538 = Integer.parseInt(var8);
            } catch (Exception var11) {
            }
        }
        String var9 = this.getParameter("userFlow");
        if (var9 != null) {
            try {
                class440.field6041 = Long.parseLong(var9);
            } catch (NumberFormatException var10) {
            }
        }
        class592.field7827 = this.getParameter("additionalInfo");
        if (class592.field7827 != null && class592.field7827.length() > 50) {
            class592.field7827 = null;
        }
        if (class443.field6069 == class392.field5166) {
            class305.field4229 = 503;
            class641.field8619 = 765;
        } else if (class488.field6599 == class392.field5166) {
            class641.field8619 = 640;
            class305.field4229 = 480;
        }
        class139.field2244 = this;
        this.method2266(class195.field2848.method3497(0) + 32, 617, class305.field4229, class641.field8619, class392.field5166.field9511, 35, 108);
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(I)Ljava/lang/String;", line = 3357)
    public final String method1703(int arg0) {
        field3879++;
        String var2 = null;
        try {
            var2 = "[1)" + class473.field6334 + "," + class233.field3269 + "," + class34.field530 + "," + class34.field531 + "|";
            if (class199.field2897 != null) {
                var2 = var2 + "2)" + class29.field476 + "," + (class199.field2897.field5643[0] + class473.field6334) + "," + (class199.field2897.field5649[0] + class233.field3269) + "|";
            }
            var2 = var2 + "3)" + class571.field7587 + "|4)" + class344.field4718.field5449 + "|5)" + class662.method3719(-1) + "|6)" + class627.field8461 + "," + class149.field2387 + "|";
            var2 = var2 + "7)" + class344.field4718.method2330(arg0 ^ 0xFFFFAE72, class571.field7587) + "|";
            var2 = var2 + "8)" + class344.field4718.method2329(108, class571.field7587) + "|";
            var2 = var2 + "9)" + class344.field4718.field5422 + "|";
            var2 = var2 + "10)" + class344.field4718.field5459 + "|";
            var2 = var2 + "11)" + class344.field4718.field5416 + "|";
            var2 = var2 + "12)" + class344.field4718.method1553(class571.field7587, arg0 - 2314) + "|";
            var2 = var2 + "13)" + class660.field9362 + "|";
            var2 = var2 + "14)" + class32.field525;
            try {
                var2 = var2 + "|15)" + jagmisc.getTotalPhysicalMemory();
            } catch (Throwable var15) {
            }
            try {
                if (class571.field7587 == 2) {
                    Class var3 = Class.forName("java.lang.ClassLoader");
                    Field var4 = var3.getDeclaredField("nativeLibraries");
                    Class var5 = Class.forName("java.lang.reflect.AccessibleObject");
                    Method var6 = var5.getDeclaredMethod("setAccessible", Boolean.TYPE);
                    var6.invoke(var4, Boolean.TRUE);
                    Vector var7 = (Vector) var4.get((field3893 == null ? (field3893 = method1704("client")) : field3893).getClassLoader());
                    for (int var8 = 0; var7.size() > var8; var8++) {
                        try {
                            Object var9 = var7.elementAt(var8);
                            Field var10 = var9.getClass().getDeclaredField("name");
                            var6.invoke(var10, Boolean.TRUE);
                            try {
                                String var11 = (String) var10.get(var9);
                                if (var11 != null && var11.indexOf("sw3d.dll") != -1) {
                                    Field var12 = var9.getClass().getDeclaredField("handle");
                                    var6.invoke(var12, Boolean.TRUE);
                                    var2 = var2 + "|16)" + Long.toHexString(var12.getLong(var9));
                                    var6.invoke(var12, Boolean.FALSE);
                                }
                            } catch (Throwable var13) {
                            }
                            var6.invoke(var10, Boolean.FALSE);
                        } catch (Throwable var14) {
                        }
                    }
                }
            } catch (Throwable var16) {
            }
            var2 = var2 + "]";
            if (arg0 != 256) {
                this.method1680(true, 7);
            }
        } catch (Throwable var17) {
        }
        return var2;
    }
}
