import jagex3.jagmisc.jagmisc;
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
public class client extends class108 {

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field3593;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field3594;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field3595;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field3596;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field3597;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field3598;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field3600;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    public static int field3601;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
    public static int field3602;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
    public static int field3603;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
    public static int field3604;

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "I")
    public static int field3605;

    @OriginalMember(owner = "client!client", name = "nb", descriptor = "I")
    public static int field3606;

    @OriginalMember(owner = "client!client", name = "ob", descriptor = "I")
    public static int field3607;

    @OriginalMember(owner = "client!client", name = "pb", descriptor = "I")
    public static int field3608;

    @OriginalMember(owner = "client!client", name = "qb", descriptor = "I")
    public static int field3609;

    @OriginalMember(owner = "client!client", name = "rb", descriptor = "I")
    public static int field3610;

    @OriginalMember(owner = "client!client", name = "sb", descriptor = "I")
    public static int field3611;

    @OriginalMember(owner = "client!client", name = "tb", descriptor = "I")
    public static int field3612;

    // $FF: synthetic field
    @OriginalMember(owner = "client!client", name = "ub", descriptor = "Ljava/lang/Class;")
    public static Class field3613;

    @OriginalMember(owner = "client!client", name = "vb", descriptor = "Z")
    public static boolean field3614;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "[[I")
    public static int[][] field3599;

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
    public static final void method1666(int arg0) {
        int var1 = class88.field1018;
        int[] var2 = class457.field6839;
        int var3 = class592.field8494 ? var1 : class387.field5958 + var1;
        for (int var4 = 0; var4 < var3; var4++) {
            class191 var5;
            if (var4 < var1) {
                var5 = class142.field1749[var2[var4]];
            } else {
                var5 = ((class411) class42.field456.method524((byte) 92, (long) class362.field5141[var4 - var1])).field6254;
            }
            if (var5.field1757 == arg0) {
                var5.field2436 = 0;
                if (var5.field2511 < 0) {
                    var5.field2448 = false;
                } else {
                    int var6 = var5.method1153(true);
                    if ((var6 & 0x1) == 0) {
                        if ((var5.field1764 & 0x1FF) != 0 || (var5.field1768 & 0x1FF) != 0) {
                            var5.field2448 = false;
                            continue;
                        }
                    } else if ((var5.field1764 & 0x1FF) != 256 || (var5.field1768 & 0x1FF) != 256) {
                        var5.field2448 = false;
                        continue;
                    }
                    int var10002;
                    if (var6 == 1) {
                        int var7 = var5.field1764 >> 9;
                        int var8 = var5.field1768 >> 9;
                        if (class524.field7604[var7][var8] != var5.field2511) {
                            var5.field2448 = true;
                            continue;
                        }
                        if (class72.field775[var7][var8] > 1) {
                            var10002 = class72.field775[var7][var8]--;
                            var5.field2448 = true;
                            continue;
                        }
                    } else {
                        int var9 = (var6 - 1) * 256 + 252;
                        int var10 = var5.field1764 - var9 >> 9;
                        int var11 = var5.field1768 - var9 >> 9;
                        int var12 = var5.field1764 + var9 >> 9;
                        int var13 = var5.field1768 + var9 >> 9;
                        if (!class343.method2208(1, var5.field2511, var13, var12, var11, var10)) {
                            for (int var14 = var10; var14 <= var12; var14++) {
                                for (int var15 = var11; var15 <= var13; var15++) {
                                    if (class524.field7604[var14][var15] == var5.field2511) {
                                        var10002 = class72.field775[var14][var15]--;
                                    }
                                }
                            }
                            var5.field2448 = true;
                            continue;
                        }
                    }
                    if (var5 instanceof class655 && var5.field2522 != null && class287.field3982 >= var5.field2522.field7986 && class287.field3982 < var5.field2522.field7987) {
                        ((class655) var5).field9450 = false;
                    }
                    var5.field2448 = false;
                    var5.field1769 = class399.method2547(var5.field1768, var5.field1764, (byte) -126, var5.field1757);
                    class367.method2355(var5, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(B)Ljava/lang/String;")
    public final String method668(byte arg0) {
        field3600++;
        String var2 = null;
        try {
            var2 = "[1)" + class287.field3980 + "," + class250.field3549 + "," + class90.field1032 + "," + class30.field349 + "|";
            if (class439.field6548 != null) {
                var2 = var2 + "2)" + class226.field3179 + "," + (class439.field6548.field2515[0] + class287.field3980) + "," + (class439.field6548.field2524[0] + class250.field3549) + "|";
            }
            var2 = var2 + "3)" + class81.field908 + "|4)" + class595.field8694.field6538 + "|5)" + class562.method3250(-32068) + "|6)" + class581.field8366 + "," + class298.field4407 + "|";
            var2 = var2 + "7)" + class595.field8694.method2732(class81.field908, (byte) -120) + "|";
            var2 = var2 + "8)" + class595.field8694.method2735((byte) -128, class81.field908) + "|";
            var2 = var2 + "9)" + class595.field8694.field6556 + "|";
            var2 = var2 + "10)" + class595.field8694.field6539 + "|";
            var2 = var2 + "11)" + class595.field8694.field6523 + "|";
            var2 = var2 + "12)" + class595.field8694.method2426(class81.field908, -5) + "|";
            var2 = var2 + "13)" + class362.field5189 + "|";
            var2 = var2 + "14)" + class133.field1673;
            try {
                var2 = var2 + "|15)" + jagmisc.getTotalPhysicalMemory();
                int var3 = 58 % ((arg0 - 7) / 38);
            } catch (Throwable var16) {
            }
            try {
                if (class81.field908 == 2) {
                    Class var4 = Class.forName("java.lang.ClassLoader");
                    Field var5 = var4.getDeclaredField("nativeLibraries");
                    Class var6 = Class.forName("java.lang.reflect.AccessibleObject");
                    Method var7 = var6.getDeclaredMethod("setAccessible", Boolean.TYPE);
                    var7.invoke(var5, Boolean.TRUE);
                    Vector var8 = (Vector) var5.get((field3613 == null ? (field3613 = method1687("client")) : field3613).getClassLoader());
                    for (int var9 = 0; var9 < var8.size(); var9++) {
                        try {
                            Object var10 = var8.elementAt(var9);
                            Field var11 = var10.getClass().getDeclaredField("name");
                            var7.invoke(var11, Boolean.TRUE);
                            try {
                                String var12 = (String) var11.get(var10);
                                if (var12 != null && var12.indexOf("sw3d.dll") != -1) {
                                    Field var13 = var10.getClass().getDeclaredField("handle");
                                    var7.invoke(var13, Boolean.TRUE);
                                    var2 = var2 + "|16)" + Long.toHexString(var13.getLong(var10));
                                    var7.invoke(var13, Boolean.FALSE);
                                }
                            } catch (Throwable var14) {
                            }
                            var7.invoke(var11, Boolean.FALSE);
                        } catch (Throwable var15) {
                        }
                    }
                }
            } catch (Throwable var17) {
            }
            var2 = var2 + "]";
        } catch (Throwable var18) {
        }
        return var2;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lqf;)Lqf;")
    public static final class593 method1667(class593 arg0) {
        int var1 = method1682(arg0).method1773(27812);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class259.method1728(40, arg0.field8533);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BIII)I")
    public static final int method1668(byte arg0, int arg1, int arg2, int arg3) {
        field3605++;
        if (arg0 > -41) {
            method1666(52);
        }
        if (arg3 > 243) {
            arg2 >>= 0x4;
        } else if (arg3 > 217) {
            arg2 >>= 0x3;
        } else if (arg3 > 192) {
            arg2 >>= 0x2;
        } else if (arg3 > 179) {
            arg2 >>= 0x1;
        }
        return (arg3 >> 1) + (arg2 >> 5 << 7) + ((arg1 >> 2 & 0x3F) << 10);
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        field3594++;
        try {
            if (arg0.length != 6) {
                class344.method2212(3382, "Argument count");
            }
            class2.field14 = new class129();
            class2.field14.field1603 = Integer.parseInt(arg0[0]);
            class606.field8861 = new class129();
            class606.field8861.field1603 = Integer.parseInt(arg0[1]);
            class475.field7013 = new class129();
            class475.field7013.field1603 = Integer.parseInt(arg0[2]);
            class197.field2667 = class40.field440;
            if (arg0[3].equals("live")) {
                class118.field1480 = class260.field3706;
            } else if (arg0[3].equals("rc")) {
                class118.field1480 = class67.field736;
            } else if (arg0[3].equals("wip")) {
                class118.field1480 = class213.field2944;
            } else {
                class344.method2212(3382, "modewhat");
            }
            class35.field396 = class91.method582(arg0[4], (byte) -75);
            if (class35.field396 == -1) {
                if (arg0[4].equals("english")) {
                    class35.field396 = 0;
                } else if (arg0[4].equals("german")) {
                    class35.field396 = 1;
                } else {
                    class344.method2212(3382, "language");
                }
            }
            class254.field3629 = false;
            class436.field6484 = false;
            if (arg0[5].equals("game0")) {
                class184.field2291 = class325.field4688;
            } else if (arg0[5].equals("game1")) {
                class184.field2291 = class408.field6151;
            } else {
                class344.method2212(3382, "game");
            }
            class622.field9000 = false;
            class346.field4964 = 0;
            class651.field9388 = "";
            class295.field4387 = class184.field2291.field1843;
            class19.field195 = null;
            class657.field9498 = true;
            class114.field1429 = true;
            class243.field3448 = false;
            class448.field6686 = 0;
            class82.field911 = 0;
            client var1 = new client();
            class254.field3624 = var1;
            var1.method670(1024, 32, 768, 611, 0, false, class184.field2291.field1844, class118.field1480.method3153(4) + 32);
            class114.field1430.setLocation(40, 40);
        } catch (Exception var3) {
            class630.method3607(7, var3, null);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
    public static final void method1669() {
        int var0 = class88.field1018;
        int[] var1 = class457.field6839;
        boolean var2 = class595.field8694.field6542 == 1 && var0 > 200 || class595.field8694.field6542 == 0 && var0 > 50;
        for (int var3 = 0; var3 < var0; var3++) {
            class655 var13 = class142.field1749[var1[var3]];
            if (var13.method3740(0)) {
                var13.method862((byte) 69);
                if (var13.field1773 >= 0 && var13.field1758 >= 0 && var13.field1762 < class90.field1032 && var13.field1761 < class30.field349) {
                    var13.field9450 = var13.field2432 ? var2 : false;
                    if (class439.field6548 == var13) {
                        var13.field2511 = Integer.MAX_VALUE;
                    } else {
                        int var14 = 0;
                        if (!var13.field2448) {
                            var14++;
                        }
                        if (var13.field2457 > class287.field3982) {
                            var14 += 2;
                        }
                        int var15 = var14 + (5 - var13.method1153(true) << 2);
                        if (var13.field9476) {
                            var15 += 512;
                        } else {
                            if (class73.field785 == 0) {
                                var15 += 32;
                            } else {
                                var15 += 128;
                            }
                            var15 += 256;
                        }
                        var13.field2511 = var15 + 1;
                    }
                } else {
                    var13.field2511 = -1;
                }
            } else {
                var13.field2511 = -1;
            }
        }
        for (int var4 = 0; var4 < class387.field5958; var4++) {
            class78 var10 = ((class411) class42.field456.method524((byte) 105, (long) class362.field5141[var4])).field6254;
            if (var10.method508(0) && var10.field864.method3280(class23.field243, -11063)) {
                var10.method862((byte) 69);
                if (var10.field1773 >= 0 && var10.field1758 >= 0 && var10.field1762 < class90.field1032 && var10.field1761 < class30.field349) {
                    int var11 = 0;
                    if (!var10.field2448) {
                        var11++;
                    }
                    if (var10.field2457 > class287.field3982) {
                        var11 += 2;
                    }
                    int var12 = var11 + (5 - var10.method1153(true) << 2);
                    if (class73.field785 == 0) {
                        if (var10.field864.field8068) {
                            var12 += 64;
                        } else {
                            var12 += 128;
                        }
                    } else if (class73.field785 == 1) {
                        if (var10.field864.field8068) {
                            var12 += 32;
                        } else {
                            var12 += 64;
                        }
                    }
                    if (var10.field864.field8128) {
                        var12 += 1024;
                    } else if (!var10.field864.field8102) {
                        var12 += 256;
                    }
                    var10.field2511 = var12 + 1;
                } else {
                    var10.field2511 = -1;
                }
            } else {
                var10.field2511 = -1;
            }
        }
        for (int var5 = 0; var5 < class13.field117.length; var5++) {
            class360 var6 = class13.field117[var5];
            if (var6 != null) {
                if (var6.field5102 == 1) {
                    class411 var7 = (class411) class42.field456.method524((byte) 105, (long) var6.field5105);
                    if (var7 != null) {
                        class78 var8 = var7.field6254;
                        if (var8.field2511 >= 0) {
                            var8.field2511 += 2048;
                        }
                    }
                } else if (var6.field5102 == 10) {
                    class655 var9 = class142.field1749[var6.field5105];
                    if (var9 != null && class439.field6548 != var9 && var9.field2511 >= 0) {
                        var9.field2511 += 2048;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
    private final void method1670(int arg0, int arg1) {
        class564.field8033.field6636 = arg1;
        class184.field2302 = 0;
        int var3 = 29 / ((arg0 - 40) / 47);
        class48.field511 = null;
        class564.field8033.field6639++;
        field3595++;
        class294.field4251 = null;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Lqf;IIIIIIIII)V")
    public static final void method1671(class593[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        for (int var10 = 0; var10 < arg0.length; var10++) {
            class593 var11 = arg0[var10];
            if (var11 != null && var11.field8533 == arg1) {
                int var12 = var11.field8586 + arg6;
                int var13 = var11.field8637 + arg7;
                int var14;
                int var15;
                int var16;
                int var17;
                if (var11.field8507 == 2) {
                    var14 = arg2;
                    var15 = arg3;
                    var16 = arg4;
                    var17 = arg5;
                } else {
                    int var18 = var11.field8570 + var12;
                    int var19 = var11.field8518 + var13;
                    if (var11.field8507 == 9) {
                        var18++;
                        var19++;
                    }
                    var14 = var12 > arg2 ? var12 : arg2;
                    var15 = var13 > arg3 ? var13 : arg3;
                    var16 = var18 < arg4 ? var18 : arg4;
                    var17 = var19 < arg5 ? var19 : arg5;
                }
                if (var11.field8507 == 0 || var11.field8610 || method1682(var11).field3798 != 0 || class273.field3821 == var11 || class281.field3923 == var11.field8603) {
                    if (!method1684(var11)) {
                        if (class39.field425 == var11 && class522.method3083(class39.field425, (byte) 108) != null) {
                            class384.field5788 = true;
                            class332.field4783 = var12;
                            class56.field663 = var13;
                        }
                        if (var11.field8553 || var14 < var16 && var15 < var17) {
                            if (var11.field8594 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                for (class86 var20 = (class86) class463.field6892.method719(false); var20 != null; var20 = (class86) class463.field6892.method716(14)) {
                                    if (var20.field981) {
                                        var20.method2108(true);
                                        var20.field976.field8536 = false;
                                    }
                                }
                                if (class509.field7459 == 0) {
                                    class39.field425 = null;
                                    class273.field3821 = null;
                                }
                                class514.field7505 = 0;
                                class304.field4477 = false;
                                class274.field3843 = false;
                                if (!class600.field8764) {
                                    class492.method2953((byte) -71);
                                }
                            }
                            boolean var21;
                            if (class32.field369.method778(6) >= var14 && class32.field369.method777((byte) 110) >= var15 && class32.field369.method778(6) < var16 && class32.field369.method777((byte) -92) < var17) {
                                var21 = true;
                            } else {
                                var21 = false;
                            }
                            if (!class169.field2063 && var21) {
                                if (var11.field8655 >= 0) {
                                    class595.field8697 = var11.field8655;
                                } else if (var11.field8594) {
                                    class595.field8697 = -1;
                                }
                            }
                            if (!class600.field8764 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                class636.method3629(var11, arg8 - var12, arg9 - var13, 4);
                            }
                            boolean var22 = false;
                            if (class32.field369.method782((byte) -5) && var21) {
                                var22 = true;
                            }
                            boolean var23 = false;
                            class458 var24 = (class458) class187.field2310.method719(false);
                            if (var24 != null && var24.method228(-12152) == 0 && var24.method227(-4915) >= var14 && var24.method230((byte) 54) >= var15 && var24.method227(-4915) < var16 && var24.method230((byte) 54) < var17) {
                                var23 = true;
                            }
                            if (var11.field8590 != null) {
                                for (int var25 = 0; var25 < var11.field8590.length; var25++) {
                                    if (class280.field3915.method284(38, var11.field8590[var25])) {
                                        if (var11.field8581 == null || class287.field3982 >= var11.field8581[var25]) {
                                            byte var26 = var11.field8575[var25];
                                            if (var26 == 0 || ((var26 & 0x8) == 0 || !class280.field3915.method284(94, 86) && !class280.field3915.method284(39, 82) && !class280.field3915.method284(-94, 81)) && ((var26 & 0x2) == 0 || class280.field3915.method284(-112, 86)) && ((var26 & 0x1) == 0 || class280.field3915.method284(54, 82)) && ((var26 & 0x4) == 0 || class280.field3915.method284(-99, 81))) {
                                                if (var25 < 10) {
                                                    class471.method2887(var11.field8579, "", var25 + 1, -1, (byte) 127);
                                                } else if (var25 == 10) {
                                                    class650.method3713(true);
                                                    class271 var27 = method1682(var11);
                                                    class93.method589(var27.method1771((byte) 76), (byte) -27, var27.field3804, var11);
                                                    class442.field6600 = class309.method2051(var11, (byte) 102);
                                                    if (class442.field6600 == null) {
                                                        class442.field6600 = "Null";
                                                    }
                                                    class180.field2210 = var11.field8563 + "<col=ffffff>";
                                                }
                                                int var28 = var11.field8622[var25];
                                                if (var11.field8581 == null) {
                                                    var11.field8581 = new int[var11.field8590.length];
                                                }
                                                if (var28 == 0) {
                                                    var11.field8581[var25] = Integer.MAX_VALUE;
                                                } else {
                                                    var11.field8581[var25] = class287.field3982 + var28;
                                                }
                                            }
                                        }
                                    } else if (var11.field8581 != null) {
                                        var11.field8581[var25] = 0;
                                    }
                                }
                            }
                            if (var23) {
                                class176.method998(var24.method227(-4915) - var12, var24.method230((byte) 54) - var13, (byte) -105, var11);
                            }
                            if (class39.field425 != null && class39.field425 != var11 && var21 && method1682(var11).method1778(116)) {
                                class273.field3814 = var11;
                            }
                            if (class273.field3821 == var11) {
                                class34.field386 = true;
                                class454.field6781 = var12;
                                class332.field4782 = var13;
                            }
                            if (var11.field8610 || var11.field8603 != 0) {
                                if (var21 && class90.field1039 != 0 && var11.field8552 != null) {
                                    class86 var29 = new class86();
                                    var29.field981 = true;
                                    var29.field976 = var11;
                                    var29.field978 = class90.field1039;
                                    var29.field985 = var11.field8552;
                                    class463.field6892.method706(var29, true);
                                }
                                if (class39.field425 != null || class600.field8764 || class301.field4431 != var11.field8603 && class514.field7505 > 0) {
                                    var23 = false;
                                    var22 = false;
                                    var21 = false;
                                }
                                if (var11.field8603 != 0) {
                                    if (class110.field1355 == var11.field8603 || class276.field3852 == var11.field8603) {
                                        class638.field9171 = var11;
                                        if (class291.field4035 != null) {
                                            class291.field4035.method2041(var11.field8518, class413.field6264, true);
                                        }
                                        if (class110.field1355 == var11.field8603) {
                                            if (!class600.field8764 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                                class327.method2121(arg9, class413.field6264, arg8, 1);
                                                for (class171 var30 = (class171) class1.field1.method3297((byte) 93); var30 != null; var30 = (class171) class1.field1.method3296((byte) -117)) {
                                                    if (arg8 >= var30.field2110 && arg8 < var30.field2112 && arg9 >= var30.field2108 && arg9 < var30.field2104) {
                                                        class492.method2953((byte) -64);
                                                        class28.method164(-20629, var30.field2109);
                                                    }
                                                }
                                            }
                                            class573.method3333(var13, (byte) 122, var11, var12);
                                            continue;
                                        }
                                    }
                                    if (class281.field3923 == var11.field8603) {
                                        if (var11.method3456(class413.field6264, true) == null || class17.field172 != 0 && class17.field172 != 3 || class600.field8764 || arg8 < var14 || arg9 < var15 || arg8 >= var16 || arg9 >= var17) {
                                            continue;
                                        }
                                        int var31 = arg8 - var12;
                                        int var32 = arg9 - var13;
                                        int var33 = var11.field8580[var32];
                                        if (var31 < var33 || var31 > var11.field8550[var32] + var33) {
                                            continue;
                                        }
                                        int var34 = var31 - var11.field8570 / 2;
                                        int var35 = var32 - var11.field8518 / 2;
                                        int var36;
                                        if (class236.field3384 == 4) {
                                            var36 = (int) class388.field5967 & 0x3FFF;
                                        } else {
                                            var36 = (int) class388.field5967 + class17.field173 & 0x3FFF;
                                        }
                                        int var37 = class605.field8859[var36];
                                        int var38 = class605.field8858[var36];
                                        if (class236.field3384 != 4) {
                                            var37 = (class34.field389 + 256) * var37 >> 8;
                                            var38 = (class34.field389 + 256) * var38 >> 8;
                                        }
                                        int var39 = var34 * var38 + var35 * var37 >> 14;
                                        int var40 = var35 * var38 - var34 * var37 >> 14;
                                        int var41;
                                        int var42;
                                        if (class236.field3384 == 4) {
                                            var41 = (class326.field4703 >> 9) + (var39 >> 2);
                                            var42 = (class151.field1860 >> 9) - (var40 >> 2);
                                        } else {
                                            int var43 = (class439.field6548.method1153(true) - 1) * 256;
                                            var41 = (class439.field6548.field1764 - var43 >> 9) + (var39 >> 2);
                                            var42 = (class439.field6548.field1768 - var43 >> 9) - (var40 >> 2);
                                        }
                                        if (class169.field2063 && (class580.field8354 & 0x40) != 0) {
                                            class593 var44 = class322.method2103(class238.field3397, false, class405.field6120);
                                            if (var44 == null) {
                                                class650.method3713(true);
                                            } else {
                                                class36.method198(true, " ->", var11.field8601, class442.field6600, class259.field3692, true, var42, var41, false, 44, 1L);
                                            }
                                            continue;
                                        }
                                        if (class408.field6151 == class184.field2291) {
                                            class36.method198(true, "", -1, class358.field5087.method2902(class35.field396, -20139), -1, true, var42, var41, false, 23, 1L);
                                        }
                                        class36.method198(true, "", -1, class80.field890, class261.field3713, true, var42, var41, false, 21, 1L);
                                        continue;
                                    }
                                    if (class301.field4431 == var11.field8603) {
                                        class50.field537 = var11;
                                        if (var21) {
                                            class304.field4477 = true;
                                        }
                                        if (var23) {
                                            int var45 = (int) ((double) (var24.method227(-4915) - var12 - var11.field8570 / 2) * 2.0D / (double) class182.field2259);
                                            int var46 = (int) (-((double) (var24.method230((byte) 54) - var13 - var11.field8518 / 2) * 2.0D / (double) class182.field2259));
                                            int var47 = class421.field6299 + var45 + class182.field2273;
                                            int var48 = class75.field814 + var46 + class182.field2267;
                                            class291 var49 = class652.method3720(-33);
                                            if (var49 == null) {
                                                continue;
                                            }
                                            int[] var50 = new int[3];
                                            var49.method1881(var48, var50, var47, 12800);
                                            if (var50 != null) {
                                                if (class280.field3915.method284(-107, 82) && class315.field4597 > 0) {
                                                    class212.method1386(var50[0], -112, var50[1], var50[2]);
                                                    continue;
                                                }
                                                class274.field3843 = true;
                                                class126.field1562 = var50[0];
                                                class301.field4425 = var50[1];
                                                class67.field734 = var50[2];
                                            }
                                            class514.field7505 = 1;
                                            class247.field3500 = false;
                                            class556.field7893 = class32.field369.method778(6);
                                            class87.field994 = class32.field369.method777((byte) -127);
                                            continue;
                                        }
                                        if (var22 && class514.field7505 > 0) {
                                            if (class514.field7505 == 1 && (class556.field7893 != class32.field369.method778(6) || class87.field994 != class32.field369.method777((byte) 74))) {
                                                class615.field8953 = class421.field6299;
                                                class444.field6652 = class75.field814;
                                                class514.field7505 = 2;
                                            }
                                            if (class514.field7505 == 2) {
                                                class247.field3500 = true;
                                                class451.method2790(-11900, class615.field8953 + (int) ((double) (class556.field7893 - class32.field369.method778(6)) * 2.0D / (double) class182.field2252));
                                                class554.method3203(class444.field6652 - (int) ((double) (class87.field994 - class32.field369.method777((byte) -44)) * 2.0D / (double) class182.field2252), 0);
                                            }
                                            continue;
                                        }
                                        if (class514.field7505 > 0 && !class247.field3500) {
                                            if ((class319.field4622 == 1 || class264.method1746((byte) 127)) && class111.field1359 > 2) {
                                                class93.method593(class87.field994, class556.field7893, false);
                                            } else if (class507.method3014(24250)) {
                                                class93.method593(class87.field994, class556.field7893, false);
                                            }
                                        }
                                        class514.field7505 = 0;
                                        continue;
                                    }
                                    if (class56.field656 == var11.field8603) {
                                        if (var22) {
                                            class437.method2723(class32.field369.method778(6) - var12, var11.field8518, -2, class32.field369.method777((byte) 101) - var13, var11.field8570);
                                        }
                                        continue;
                                    }
                                    if (class250.field3551 == var11.field8603) {
                                        class619.method3561(var11, 4096, var12, var13);
                                        continue;
                                    }
                                }
                                if (!var11.field8591 && var23) {
                                    var11.field8591 = true;
                                    if (var11.field8652 != null) {
                                        class86 var51 = new class86();
                                        var51.field981 = true;
                                        var51.field976 = var11;
                                        var51.field980 = var24.method227(-4915) - var12;
                                        var51.field978 = var24.method230((byte) 54) - var13;
                                        var51.field985 = var11.field8652;
                                        class463.field6892.method706(var51, true);
                                    }
                                }
                                if (var11.field8591 && var22 && var11.field8520 != null) {
                                    class86 var52 = new class86();
                                    var52.field981 = true;
                                    var52.field976 = var11;
                                    var52.field980 = class32.field369.method778(6) - var12;
                                    var52.field978 = class32.field369.method777((byte) -85) - var13;
                                    var52.field985 = var11.field8520;
                                    class463.field6892.method706(var52, true);
                                }
                                if (var11.field8591 && !var22) {
                                    var11.field8591 = false;
                                    if (var11.field8653 != null) {
                                        class86 var53 = new class86();
                                        var53.field981 = true;
                                        var53.field976 = var11;
                                        var53.field980 = class32.field369.method778(6) - var12;
                                        var53.field978 = class32.field369.method777((byte) -56) - var13;
                                        var53.field985 = var11.field8653;
                                        class566.field8109.method706(var53, true);
                                    }
                                }
                                if (var22 && var11.field8528 != null) {
                                    class86 var54 = new class86();
                                    var54.field981 = true;
                                    var54.field976 = var11;
                                    var54.field980 = class32.field369.method778(6) - var12;
                                    var54.field978 = class32.field369.method777((byte) -68) - var13;
                                    var54.field985 = var11.field8528;
                                    class463.field6892.method706(var54, true);
                                }
                                if (!var11.field8536 && var21) {
                                    var11.field8536 = true;
                                    if (var11.field8664 != null) {
                                        class86 var55 = new class86();
                                        var55.field981 = true;
                                        var55.field976 = var11;
                                        var55.field980 = class32.field369.method778(6) - var12;
                                        var55.field978 = class32.field369.method777((byte) -66) - var13;
                                        var55.field985 = var11.field8664;
                                        class463.field6892.method706(var55, true);
                                    }
                                }
                                if (var11.field8536 && var21 && var11.field8649 != null) {
                                    class86 var56 = new class86();
                                    var56.field981 = true;
                                    var56.field976 = var11;
                                    var56.field980 = class32.field369.method778(6) - var12;
                                    var56.field978 = class32.field369.method777((byte) 93) - var13;
                                    var56.field985 = var11.field8649;
                                    class463.field6892.method706(var56, true);
                                }
                                if (var11.field8536 && !var21) {
                                    var11.field8536 = false;
                                    if (var11.field8651 != null) {
                                        class86 var57 = new class86();
                                        var57.field981 = true;
                                        var57.field976 = var11;
                                        var57.field980 = class32.field369.method778(6) - var12;
                                        var57.field978 = class32.field369.method777((byte) 74) - var13;
                                        var57.field985 = var11.field8651;
                                        class566.field8109.method706(var57, true);
                                    }
                                }
                                if (var11.field8517 != null) {
                                    class86 var58 = new class86();
                                    var58.field976 = var11;
                                    var58.field985 = var11.field8517;
                                    class94.field1106.method706(var58, true);
                                }
                                if (var11.field8606 != null && class290.field4017 > var11.field8668) {
                                    if (var11.field8547 == null || class290.field4017 - var11.field8668 > 32) {
                                        class86 var63 = new class86();
                                        var63.field976 = var11;
                                        var63.field985 = var11.field8606;
                                        class463.field6892.method706(var63, true);
                                    } else {
                                        label693: for (int var59 = var11.field8668; var59 < class290.field4017; var59++) {
                                            int var60 = class484.field7090[var59 & 0x1F];
                                            for (int var61 = 0; var61 < var11.field8547.length; var61++) {
                                                if (var11.field8547[var61] == var60) {
                                                    class86 var62 = new class86();
                                                    var62.field976 = var11;
                                                    var62.field985 = var11.field8606;
                                                    class463.field6892.method706(var62, true);
                                                    break label693;
                                                }
                                            }
                                        }
                                    }
                                    var11.field8668 = class290.field4017;
                                }
                                if (var11.field8534 != null && class46.field499 > var11.field8516) {
                                    if (var11.field8657 == null || class46.field499 - var11.field8516 > 32) {
                                        class86 var68 = new class86();
                                        var68.field976 = var11;
                                        var68.field985 = var11.field8534;
                                        class463.field6892.method706(var68, true);
                                    } else {
                                        label669: for (int var64 = var11.field8516; var64 < class46.field499; var64++) {
                                            int var65 = class602.field8783[var64 & 0x1F];
                                            for (int var66 = 0; var66 < var11.field8657.length; var66++) {
                                                if (var11.field8657[var66] == var65) {
                                                    class86 var67 = new class86();
                                                    var67.field976 = var11;
                                                    var67.field985 = var11.field8534;
                                                    class463.field6892.method706(var67, true);
                                                    break label669;
                                                }
                                            }
                                        }
                                    }
                                    var11.field8516 = class46.field499;
                                }
                                if (var11.field8564 != null && class224.field3160 > var11.field8509) {
                                    if (var11.field8628 == null || class224.field3160 - var11.field8509 > 32) {
                                        class86 var73 = new class86();
                                        var73.field976 = var11;
                                        var73.field985 = var11.field8564;
                                        class463.field6892.method706(var73, true);
                                    } else {
                                        label645: for (int var69 = var11.field8509; var69 < class224.field3160; var69++) {
                                            int var70 = class426.field6338[var69 & 0x1F];
                                            for (int var71 = 0; var71 < var11.field8628.length; var71++) {
                                                if (var11.field8628[var71] == var70) {
                                                    class86 var72 = new class86();
                                                    var72.field976 = var11;
                                                    var72.field985 = var11.field8564;
                                                    class463.field6892.method706(var72, true);
                                                    break label645;
                                                }
                                            }
                                        }
                                    }
                                    var11.field8509 = class224.field3160;
                                }
                                if (var11.field8650 != null && class509.field7407 > var11.field8592) {
                                    if (var11.field8529 == null || class509.field7407 - var11.field8592 > 32) {
                                        class86 var78 = new class86();
                                        var78.field976 = var11;
                                        var78.field985 = var11.field8650;
                                        class463.field6892.method706(var78, true);
                                    } else {
                                        label621: for (int var74 = var11.field8592; var74 < class509.field7407; var74++) {
                                            int var75 = class365.field5527[var74 & 0x1F];
                                            for (int var76 = 0; var76 < var11.field8529.length; var76++) {
                                                if (var11.field8529[var76] == var75) {
                                                    class86 var77 = new class86();
                                                    var77.field976 = var11;
                                                    var77.field985 = var11.field8650;
                                                    class463.field6892.method706(var77, true);
                                                    break label621;
                                                }
                                            }
                                        }
                                    }
                                    var11.field8592 = class509.field7407;
                                }
                                if (var11.field8567 != null && class103.field1243 > var11.field8515) {
                                    if (var11.field8523 == null || class103.field1243 - var11.field8515 > 32) {
                                        class86 var83 = new class86();
                                        var83.field976 = var11;
                                        var83.field985 = var11.field8567;
                                        class463.field6892.method706(var83, true);
                                    } else {
                                        label597: for (int var79 = var11.field8515; var79 < class103.field1243; var79++) {
                                            int var80 = class18.field179[var79 & 0x1F];
                                            for (int var81 = 0; var81 < var11.field8523.length; var81++) {
                                                if (var11.field8523[var81] == var80) {
                                                    class86 var82 = new class86();
                                                    var82.field976 = var11;
                                                    var82.field985 = var11.field8567;
                                                    class463.field6892.method706(var82, true);
                                                    break label597;
                                                }
                                            }
                                        }
                                    }
                                    var11.field8515 = class103.field1243;
                                }
                                if (class218.field2988 > var11.field8530 && var11.field8614 != null) {
                                    class86 var84 = new class86();
                                    var84.field976 = var11;
                                    var84.field985 = var11.field8614;
                                    class463.field6892.method706(var84, true);
                                }
                                if (class236.field3383 > var11.field8530 && var11.field8544 != null) {
                                    class86 var85 = new class86();
                                    var85.field976 = var11;
                                    var85.field985 = var11.field8544;
                                    class463.field6892.method706(var85, true);
                                }
                                if (class218.field2997 > var11.field8530 && var11.field8559 != null) {
                                    class86 var86 = new class86();
                                    var86.field976 = var11;
                                    var86.field985 = var11.field8559;
                                    class463.field6892.method706(var86, true);
                                }
                                if (class208.field2793 > var11.field8530 && var11.field8660 != null) {
                                    class86 var87 = new class86();
                                    var87.field976 = var11;
                                    var87.field985 = var11.field8660;
                                    class463.field6892.method706(var87, true);
                                }
                                if (class367.field5553 > var11.field8530 && var11.field8572 != null) {
                                    class86 var88 = new class86();
                                    var88.field976 = var11;
                                    var88.field985 = var11.field8572;
                                    class463.field6892.method706(var88, true);
                                }
                                var11.field8530 = class240.field3406;
                                if (var11.field8510 != null) {
                                    for (int var89 = 0; var89 < class430.field6381; var89++) {
                                        class86 var90 = new class86();
                                        var90.field976 = var11;
                                        var90.field977 = class128.field1576[var89].method2198((byte) 114);
                                        var90.field979 = class128.field1576[var89].method2204((byte) -117);
                                        var90.field985 = var11.field8510;
                                        class463.field6892.method706(var90, true);
                                    }
                                }
                                if (class494.field7201 && var11.field8556 != null) {
                                    class86 var91 = new class86();
                                    var91.field976 = var11;
                                    var91.field985 = var11.field8556;
                                    class463.field6892.method706(var91, true);
                                }
                            }
                            if (var11.field8507 == 5 && var11.field8541 != -1) {
                                var11.method3464(class61.field702, class173.field2125, false).method2041(var11.field8518, class413.field6264, true);
                            }
                            class174.method997(var11, (byte) 6);
                            if (var11.field8507 == 0) {
                                method1671(arg0, var11.field8579, var14, var15, var16, var17, var12 - var11.field8598, var13 - var11.field8662, arg8, arg9);
                                if (var11.field8512 != null) {
                                    method1671(var11.field8512, var11.field8579, var14, var15, var16, var17, var12 - var11.field8598, var13 - var11.field8662, arg8, arg9);
                                }
                                class563 var92 = (class563) class234.field3309.method524((byte) 97, (long) var11.field8579);
                                if (var92 != null) {
                                    if (class325.field4688 == class184.field2291 && var92.field8021 == 0 && !class600.field8764 && var21 && !class541.field7761) {
                                        class492.method2953((byte) -106);
                                    }
                                    class154.method895(var14, var15, var12, arg8, arg9, var13, var17, var92.field8022, (byte) 111, var16);
                                }
                            }
                        }
                    }
                } else if (var14 < var16 && var15 < var17) {
                    class174.method997(var11, (byte) 6);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
    private final void method1672(int arg0) {
        field3609++;
        if (class133.field1673 == 13) {
            return;
        }
        long var2 = class454.method2805(-61) / 1000000L - class366.field5528;
        class366.field5528 = class454.method2805(-19) / 1000000L;
        boolean var4 = class288.method1866(-103);
        if (var4 && class93.field1095 && class227.field3184 != null) {
            class227.field3184.method162(8);
        }
        if (class647.method3706((byte) -61, class133.field1673)) {
            if (class167.field2045 != 0L && class167.field2045 < class84.method550((byte) -94)) {
                class225.method1465(class595.field8694.field6546, class562.method3250(-32068), false, arg0 ^ 0xFFFFFFA4, class595.field8694.field6559);
            } else if (!class413.field6264.method395() && class27.field292) {
                class72.method484((byte) -95);
            }
        }
        if (class375.field5714 == null) {
            Container var5;
            if (class114.field1430 != null) {
                var5 = class114.field1430;
            } else if (class635.field9135 == null) {
                var5 = class385.field5811;
            } else {
                var5 = class635.field9135;
            }
            int var6 = var5.getSize().width;
            int var7 = var5.getSize().height;
            if (class114.field1430 == var5) {
                Insets var8 = class114.field1430.getInsets();
                var6 -= var8.right + var8.left;
                var7 -= var8.top + var8.bottom;
            }
            if (class477.field7037 != var6 || class434.field6446 != var7 || class141.field1740) {
                if (class413.field6264 == null || class413.field6264.method390()) {
                    class50.method281((byte) -22);
                } else {
                    class477.field7037 = var6;
                    class434.field6446 = var7;
                }
                class167.field2045 = class84.method550((byte) -88) + 500L;
                class141.field1740 = false;
            }
        }
        if (class375.field5714 != null && !class44.field466 && class647.method3706((byte) -102, class133.field1673)) {
            class225.method1465(-1, class595.field8694.field6543, false, arg0 - 21, -1);
        }
        boolean var9 = false;
        if (class630.field9093) {
            var9 = true;
            class630.field9093 = false;
        }
        if (var9) {
            class112.method692(-17);
        }
        if (class413.field6264 != null && class413.field6264.method395() || class562.method3250(-32068) != 1) {
            class410.method2598(106);
        }
        if (class133.field1673 == arg0) {
            class379.method2443(class595.field8696, class288.field3987[class295.field4387], class650.field9381[class295.field4387], (byte) -97, class325.field4694[class295.field4387], class599.field8754);
        } else if (class133.field1673 == 1) {
            class32.method185(class650.field9381[class295.field4387].getRGB(), class325.field4694[class295.field4387].getRGB(), class288.field3987[class295.field4387].getRGB(), class472.field6992, false, class413.field6264.method395() | var9, class413.field6264);
        } else if (class507.method3018((byte) -37, class133.field1673)) {
            class78.method500((byte) 68);
        } else if (class177.method1004((byte) 110, class133.field1673)) {
            class78.method500((byte) 86);
        } else if (class348.method2222(0, class133.field1673)) {
            if (class620.field8986 == 1) {
                if (class3.field22 < class531.field7692) {
                    class3.field22 = class531.field7692;
                }
                int var11 = (class3.field22 - class531.field7692) * 50 / class3.field22;
                class120.method745(true, -74, class445.field6665, class151.field1857.method2902(class35.field396, -20139) + "<br>(" + var11 + "%)");
            } else if (class620.field8986 == 2) {
                if (class517.field7525 < class97.field1141) {
                    class517.field7525 = class97.field1141;
                }
                int var10 = (class517.field7525 - class97.field1141) * 50 / class517.field7525 + 50;
                class120.method745(true, -74, class445.field6665, class151.field1857.method2902(class35.field396, arg0 ^ 0xFFFFB155) + "<br>(" + var10 + "%)");
            } else {
                class120.method745(true, -99, class445.field6665, class151.field1857.method2902(class35.field396, arg0 ^ 0xFFFFB155));
            }
        } else if (class133.field1673 == 9) {
            class365.method2347(arg0 - 4, var2);
        } else if (class133.field1673 == 12) {
            class120.method745(true, -72, class445.field6665, class243.field3446.method2902(class35.field396, arg0 - 20139) + "<br>" + class286.field3945.method2902(class35.field396, -20139));
        }
        if (class344.field4923 == 3) {
            for (int var12 = 0; var12 < class384.field5785; var12++) {
                Rectangle var13 = class288.field3985[var12];
                if (class320.field4635[var12]) {
                    class413.field6264.method3524(var13.width, var13.y, (byte) 92, -1996553985, var13.height, var13.x);
                } else if (class570.field8224[var12]) {
                    class413.field6264.method3524(var13.width, var13.y, (byte) 92, -1996554240, var13.height, var13.x);
                }
            }
        }
        if (class645.method3672(-1645761693)) {
            class277.method1804(class413.field6264, 5385);
        }
        if (class20.field197.field7802 && class647.method3706((byte) -79, class133.field1673) && class344.field4923 == 0 && class562.method3250(-32068) == 1 && !var9) {
            int var16 = 0;
            for (int var17 = 0; var17 < class384.field5785; var17++) {
                if (class570.field8224[var17]) {
                    class570.field8224[var17] = false;
                    class406.field6128[var16++] = class288.field3985[var17];
                }
            }
            try {
                class413.field6264.method383(class406.field6128, var16);
            } catch (class27 var18) {
            }
        } else if (class133.field1673 != 0) {
            for (int var14 = 0; var14 < class384.field5785; var14++) {
                class570.field8224[var14] = false;
            }
            try {
                class413.field6264.method338();
            } catch (class27 var19) {
                class630.method3607(7, var19, var19.getMessage() + " (Recovered) " + this.method668((byte) 58));
                class418.method2644(0, (byte) 80);
            }
        }
        if (class595.field8694.field6557 == 0) {
            class646.method3696(1, 15L);
        } else if (class595.field8694.field6557 == 1) {
            class646.method3696(1, 10L);
        } else if (class595.field8694.field6557 == 2) {
            class646.method3696(arg0 + 1, 5L);
        } else if (class595.field8694.field6557 == 3) {
            class646.method3696(arg0 ^ 0x1, 2L);
        }
        if (class177.field2182) {
            class119.method737(22);
        }
        if (class595.field8694.field6521 && class133.field1673 == 2 && class518.field7542 != -1) {
            class595.field8694.field6521 = false;
            class595.field8694.method2440(class20.field197, -120);
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
    public final void method678(byte arg0) {
        if (class622.field9000) {
            class362.field5189 = 64;
        }
        field3596++;
        Frame var2 = new Frame("Jagex");
        var2.pack();
        var2.dispose();
        class50.method281((byte) -65);
        class298.field4409 = new class215(class20.field197);
        class564.field8033 = new class443();
        if (class646.field9321 != class197.field2667) {
            class272.field3808 = new byte[50][];
        }
        class595.field8694 = new class377(class20.field197);
        if (class646.field9321 == class197.field2667) {
            class2.field14.field1598 = this.getCodeBase().getHost();
        } else if (class48.method265(663028206, class197.field2667)) {
            class2.field14.field1598 = this.getCodeBase().getHost();
            class2.field14.field1595 = class2.field14.field1603 + 40000;
            class606.field8861.field1595 = class606.field8861.field1603 + 40000;
            class475.field7013.field1595 = class475.field7013.field1603 + 40000;
            class2.field14.field1601 = class2.field14.field1603 + 50000;
            class606.field8861.field1601 = class606.field8861.field1603 + 50000;
            class475.field7013.field1601 = class475.field7013.field1603 + 50000;
        } else if (class40.field440 == class197.field2667) {
            class2.field14.field1598 = "127.0.0.1";
            class606.field8861.field1598 = "127.0.0.1";
            class2.field14.field1595 = class2.field14.field1603 + 40000;
            class475.field7013.field1598 = "127.0.0.1";
            class606.field8861.field1595 = class606.field8861.field1603 + 40000;
            class475.field7013.field1595 = class475.field7013.field1603 + 40000;
            class2.field14.field1601 = class2.field14.field1603 + 50000;
            class606.field8861.field1601 = class606.field8861.field1603 + 50000;
            class475.field7013.field1601 = class475.field7013.field1603 + 50000;
        }
        class461.field6876 = class2.field14;
        if (class325.field4688 == class184.field2291) {
            class521.field7578 = false;
        }
        if (class408.field6151 == class184.field2291) {
            class13.field116 = class405.field6110;
            class132.field1658 = class436.field6495;
            class404.field6105 = 16777215;
            class118.field1467 = class388.field5966;
            class204.field2746 = class606.field8863;
            class102.field1226 = 0;
            class565.field8057 = true;
        } else {
            class132.field1658 = class90.field1040;
            class118.field1467 = class394.field6025;
            class204.field2746 = class145.field1784;
            class13.field116 = class527.field7643;
        }
        class591.field8489 = class521.field7581 = class517.field7533 = class345.field4943 = new short[256];
        if (arg0 != 31) {
            method1684(null);
        }
        class280.field3915 = class291.method1884(class30.field348, true);
        class32.field369 = class260.method1731(true, (byte) 37, class30.field348);
        try {
            if (class20.field197.field7791 != null) {
                class375.field5705 = new class253(class20.field197.field7791, 5200, 0);
                for (int var3 = 0; var3 < 32; var3++) {
                    class550.field7851[var3] = new class253(class20.field197.field7789[var3], 6000, 0);
                }
                class194.field2634 = new class253(class20.field197.field7803, 6000, 0);
                class492.field7166 = new class121(255, class375.field5705, class194.field2634, 500000);
                class27.field287 = new class253(class20.field197.field7781, 24, 0);
                class20.field197.field7781 = null;
                class20.field197.field7789 = null;
                class20.field197.field7803 = null;
                class20.field197.field7791 = null;
            }
        } catch (IOException var4) {
            class375.field5705 = null;
            class492.field7166 = null;
            class27.field287 = null;
            class194.field2634 = null;
        }
        if (class646.field9321 != class197.field2667) {
            class517.field7528 = true;
        }
        if (class325.field4688 == class184.field2291) {
            class339.field4848 = class51.field541.method2902(class35.field396, -20139);
        } else if (class408.field6151 == class184.field2291) {
            class339.field4848 = class24.field267.method2902(class35.field396, arg0 - 20170);
            return;
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
    public static void method1673(byte arg0) {
        if (arg0 != -93) {
            field3599 = null;
        }
        field3599 = null;
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
    private final void method1674(int arg0) {
        field3612++;
        if (class144.field1775 < class564.field8033.field6639) {
            class461.field6876.method797((byte) -78);
            class541.field7752 = (class564.field8033.field6639 * 50 - 50) * 5;
            if (class541.field7752 > 3000) {
                class541.field7752 = 3000;
            }
            if (class564.field8033.field6639 >= 2 && class564.field8033.field6636 == 6) {
                this.method667("js5connect_outofdate", 50);
                class133.field1673 = 13;
                return;
            }
            if (class564.field8033.field6639 >= 4 && class564.field8033.field6636 == -1) {
                this.method667("js5crc", 72);
                class133.field1673 = 13;
                return;
            }
            if (class564.field8033.field6639 >= 4 && class102.method631(13542, class133.field1673)) {
                if (class564.field8033.field6636 == 7 || class564.field8033.field6636 == 9) {
                    this.method667("js5connect_full", 41);
                } else if (class564.field8033.field6636 > 0) {
                    this.method667("js5connect", 80);
                } else {
                    this.method667("js5io", 104);
                }
                class133.field1673 = 13;
                return;
            }
        }
        class144.field1775 = class564.field8033.field6639;
        if (class541.field7752 > 0) {
            class541.field7752--;
            return;
        }
        try {
            if (class184.field2302 == 0) {
                class48.field511 = class461.field6876.method798(32, class20.field197);
                class184.field2302++;
            }
            if (arg0 == 8) {
                if (class184.field2302 == 1) {
                    if (class48.field511.field2138 == 2) {
                        this.method1670(-86, 1000);
                        return;
                    }
                    if (class48.field511.field2138 == 1) {
                        class184.field2302++;
                    }
                }
                if (class184.field2302 == 2) {
                    class294.field4251 = new class555((Socket) class48.field511.field2140, class20.field197);
                    class194 var2 = new class194(5);
                    var2.method1205((byte) -69, class129.field1600.field9114);
                    var2.method1223(true, 611);
                    class294.field4251.method3207(0, 5, var2.field2622, 0);
                    class184.field2302++;
                    class149.field1838 = class84.method550((byte) -86);
                }
                if (class184.field2302 == 3) {
                    if (class102.method631(13542, class133.field1673) || class294.field4251.method3205(arg0 + 119) > 0) {
                        int var3 = class294.field4251.method3206(0);
                        if (var3 != 0) {
                            this.method1670(-72, var3);
                            return;
                        }
                        class184.field2302++;
                    } else if (class84.method550((byte) -125) - class149.field1838 > 30000L) {
                        this.method1670(arg0 ^ 0x7F, 1001);
                        return;
                    }
                }
                if (class184.field2302 == 4) {
                    boolean var4 = class133.field1673 == 1 || class63.method444(class133.field1673, (byte) -59) || class10.method56(class133.field1673, 3521);
                    class564.field8033.method2757(127, class294.field4251, !var4);
                    class294.field4251 = null;
                    class48.field511 = null;
                    class184.field2302 = 0;
                }
            }
        } catch (IOException var5) {
            this.method1670(arg0 - 23, 1002);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
    public final void method669(boolean arg0) {
        if (arg0) {
            return;
        }
        if (class81.field908 == 2) {
            try {
                this.method1672(0);
            } catch (Throwable var3) {
                class630.method3607(7, var3, var3.getMessage() + " (Recovered) " + this.method668((byte) 69));
                class418.method2644(0, (byte) 80);
            }
        } else {
            this.method1672(0);
        }
        field3601++;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(I[B)V")
    private final void method1675(int arg0, byte[] arg1) {
        if (arg0 != 90) {
            return;
        }
        field3607++;
        class194 var3 = new class194(arg1);
        while (true) {
            while (true) {
                while (true) {
                    int var4 = var3.method1177(255);
                    if (var4 == 0) {
                        return;
                    }
                    if (var4 == 1) {
                        int[] var9 = class244.field3461 = new int[6];
                        var9[0] = var3.method1220(arg0 + 21);
                        var9[1] = var3.method1220(124);
                        var9[2] = var3.method1220(-127);
                        var9[3] = var3.method1220(111);
                        var9[4] = var3.method1220(arg0 - 177);
                        var9[5] = var3.method1220(class92.method583(arg0, -114));
                    } else if (var4 == 4) {
                        int var5 = var3.method1177(255);
                        class4.field45 = new int[var5];
                        for (int var6 = 0; var6 < var5; var6++) {
                            class4.field45[var6] = var3.method1220(-104);
                            if (class4.field45[var6] == 65535) {
                                class4.field45[var6] = -1;
                            }
                        }
                    } else if (var4 == 5) {
                        int var7 = var3.method1177(255);
                        class556.field7894 = new int[var7];
                        for (int var8 = 0; var8 < var7; var8++) {
                            class556.field7894[var8] = var3.method1220(-11);
                            if (class556.field7894[var8] == 65535) {
                                class556.field7894[var8] = -1;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
    public final void method673(boolean arg0) {
        field3604++;
        method1673((byte) -93);
        class301.method2000((byte) 80);
        class30.method180(27876);
        class467.method2853(false);
        class195.method1244((byte) 56);
        class647.method3708(true);
        class324.method2106(-3901);
        class248.method1640(false);
        class80.method527(124);
        class108.method671(10);
        class543.method3155(-21188);
        class528.method3101(true);
        class149.method881((byte) -124);
        class364.method2344((byte) 101);
        class605.method3527(-2);
        class377.method2438((byte) -92);
        class360.method2246((byte) 102);
        class564.method3260(0);
        class114.method708(-27281);
        class555.method3209(-11835);
        class443.method2759(false);
        class215.method1419((byte) 100);
        class103.method641(-99);
        class571.method3323((byte) -50);
        class203.method1295(-82);
        class121.method749(65280);
        class277.method1802(17745);
        class612.method3540(-1);
        class333.method2166(24207);
        class613.method3547(64);
        class59.method425((byte) -128);
        class233.method1500((byte) 0);
        class16.method107(true);
        class4.method22(3);
        class602.method3496((byte) 106);
        class538.method3135((byte) 116);
        class494.method2965(-20340);
        class305.method2032((byte) -58);
        class644.method3665(46);
        class117.method723((byte) 41);
        class448.method2782(125);
        class157.method908(159677890);
        class197.method1260(467425826);
        class162.method939(0);
        class46.method244(-7831);
        class585.method3402((byte) -127);
        class411.method2605(7448);
        class285.method1845((byte) -94);
        class645.method3673(true);
        class206.method1319(0);
        class82.method537((byte) -60);
        class126.method774(15534);
        class468.method2868(!arg0);
        class270.method1764((byte) 77);
        class291.method1880((byte) -94);
        class136.method828(14955);
        class308.method2042(-25128);
        class567.method3292(-22);
        class593.method3450(-8);
        class290.method1875(0);
        class655.method3741(8948);
        class400.method2550((byte) 95);
        class151.method889(-128);
        class194.method1221(2);
        class191.method1151(65535);
        class181.method1032(true);
        class99.method616(true);
        class629.method3605(-78);
        class55.method408(122);
        class236.method1585(true);
        class78.method501(0);
        class563.method3259(arg0);
        class271.method1774(28);
        class73.method488(-1975151103);
        class319.method2083(true);
        class615.method3551(26708);
        class98.method611((byte) 88);
        class418.method2642((byte) 123);
        class601.method3486((byte) 79);
        class496.method2977(-103);
        class481.method2921(19);
        class84.method551(28870);
        class638.method3635(-1);
        class427.method2670(-126);
        class511.method3038(-2);
        class368.method2357(false);
        class129.method795(0);
        class457.method2822((byte) -75);
        class74.method490((byte) 38);
        class101.method622(false);
        class472.method2893(-1);
        class96.method604((byte) -83);
        class439.method2733(false);
        class274.method1786(124);
        class66.method457(1);
        class177.method1010((byte) -14);
        class283.method1833(-77);
        class327.method2117(false);
        class226.method1472(-20691);
        class636.method3628(-37);
        class622.method3572(78);
        class385.method2462(false);
        class557.method3228((byte) -98);
        class651.method3718(0);
        class132.method816((byte) 99);
        class566.method3284((byte) 109);
        class190.method1135((byte) -118);
        class393.method2534(-122);
        class479.method2918((byte) 92);
        class27.method160(-1);
        class199.method1267(true);
        class35.method195(false);
        class402.method2558(-127);
        class321.method2092(-3809);
        class623.method3576(1);
        class386.method2484(47);
        class547.method3181(2);
        class238.method1594((byte) 108);
        class202.method1277(9);
        class169.method970(0);
        class501.method2993(arg0);
        class464.method2844(111);
        class174.method996((byte) -21);
        class504.method3004(!arg0);
        class556.method3212((byte) 86);
        class14.method83(-16);
        class144.method863((byte) -88);
        class429.method2675((byte) 79);
        class630.method3610(arg0);
        class425.method2660(-2324);
        class211.method1339();
        class560.method3240(111);
        class154.method900(-128);
        class3.method11(46);
        class598.method3477(0);
        class296.method1986(105);
        class39.method210(0);
        class606.method3528((byte) -90);
        class604.method3505();
        class182.method1054();
        class486.method2928((byte) 35);
        class89.method570(-11419);
        class476.method2915();
        class431.method2694(-1);
        class633.method3615(2132);
        class240.method1601(-84);
        class624.method3578(true);
        class428.method2673(-63);
        class61.method431((byte) -125);
        class375.method2412(90);
        class614.method3549(-22172);
        class184.method1073(0);
        class266.method1749(-20543);
        class403.method2563(67);
        class589.method3440((byte) 113);
        class242.method1608((byte) -54);
        class346.method2219(21339);
        class40.method214(-125);
        class287.method1856(-1);
        class329.method2149(true);
        class565.method3273(-3);
        class193.method1163(-74);
        class165.method959((byte) -126);
        class331.method2158((byte) -118);
        class180.method1026(-922);
        class576.method3345(-14);
        class10.method53(-80);
        class408.method2582((byte) -95);
        class310.method2054(23);
        class18.method115(0);
        class258.method1718(105);
        class406.method2573(0);
        class272.method1781(0);
        class102.method632((byte) -116);
        class550.method3192((byte) -86);
        class390.method2512(101);
        class293.method1891(5428);
        class29.method176();
        class264.method1747(-22971);
        class142.method861((byte) -37);
        class517.method3065(64);
        class473.method2901((byte) 100);
        class86.method554(-123);
        class407.method2580((byte) -120);
        class208.method1324((byte) -77);
        class262.method1737(-123);
        class49.method271((byte) 110);
        class111.method685((byte) -119);
        class247.method1639(-13335);
        class599.method3483(10);
        class356.method2239(262144);
        class104.method646(98);
        class460.method2834(9195);
        class176.method999(-1);
        class75.method494((byte) -117);
        class522.method3086(13);
        class392.method2526(-122);
        class575.method3338(-105);
        class116.method720();
        class485.method2927((byte) -91);
        class594.method3470(13662);
        class404.method2570((byte) 76);
        class654.method3730();
        class68.method463(58);
        class110.method682(76);
        class409.method2589(true);
        class577.method3351(true);
        class513.method3045((byte) -40);
        class95.method599(-114);
        class359.method2245(-95);
        class463.method2839(89);
        class245.method1627(88);
        class620.method3570((byte) 66);
        class160.method923(-11133);
        class70.method468((byte) 48);
        class171.method984((byte) -93);
        class640.method3652((byte) 106);
        class56.method414((byte) 20);
        class592.method3448(999999);
        class446.method2778(-12552);
        class69.method466((byte) -23);
        class281.method1828((byte) -85);
        class58.method419(1);
        class643.method3658((byte) 93);
        class170.method974(false);
        class349.method2224(0);
        class354.method2236(97);
        class94.method594((byte) 3);
        class399.method2545((byte) 115);
        class618.method3558(!arg0);
        class304.method2024((byte) 43);
        class288.method1865(false);
        class656.method3748(2048);
        class261.method1736((byte) -113);
        class97.method606(-15797);
        class626.method3594((byte) 105);
        class2.method6(-25);
        class67.method459(1583);
        class422.method2652();
        class435.method2717(106);
        class337.method2181(-1004911764);
        class150.method887(0);
        class611.method3538(-14466);
        class269.method1758(-27132);
        class450.method2786(15);
        class363.method2342(arg0);
        class495.method2971(8222);
        class204.method1313(0);
        class344.method2211((byte) 113);
        class343.method2209((byte) 27);
        class15.method85(6001);
        class249.method1648((byte) -58);
        class83.method547(2048);
        class561.method3247((byte) 126);
        class72.method481(-124);
        class388.method2508(125);
        class621.method3571(0);
        class562.method3252(-1);
        class426.method2667(64);
        class263.method1740(57);
        class229.method1483(-27127);
        class328.method2127();
        class519.method3072(false);
        class436.method2720(true);
        class76.method497();
        class214.method1407();
        class378.method2441(-79);
        class488.method2935(false);
        class265.method1748();
        class90.method578((byte) 75);
        class44.method232(56);
        class309.method2049(83128144);
        class546.method3180(-32448);
        class251.method1655(-29123);
        class92.method584((byte) 47);
        class239.method1596(20);
        class124.method763();
        class353.method2234((byte) 113);
        class145.method867(arg0);
        class280.method1825(2);
        class315.method2076(-29604);
        class13.method79((byte) -88);
        class244.method1625(96);
        class297.method1987(540800);
        class341.method2191(512);
        class1.method2(65280);
        class119.method744((byte) -70);
        class213.method1404(-115);
        class320.method2086(-85);
        class475.method2908(arg0);
        class273.method1782((byte) 58);
        class118.method730((byte) -22);
        class437.method2725((byte) 87);
        class509.method3034(!arg0);
        class449.method2783(-26648);
        class362.method2277(-107);
        class471.method2885(0);
        class292.method1889(-122);
        class625.method3581((byte) 1);
        class455.method2814((byte) 15);
        class113.method701(false);
        class302.method2015((byte) 122);
        class489.method2937((byte) -114);
        class453.method2802(arg0);
        class535.method3118((byte) 71);
        class507.method3022((byte) -123);
        class289.method1868(false);
        class200.method1270(-2543);
        class325.method2111((byte) 26);
        class212.method1384(58);
        class371.method2390(-15305);
        class257.method1713((byte) 34);
        class158.method915(5121);
        class294.method1902(16202);
        class596.method3476(107);
        class256.method1710(0);
        class616.method3553(6);
        class646.method3704((byte) 92);
        class398.method2540(3);
        class87.method556(0);
        class581.method3371((byte) -121);
        class452.method2792(!arg0);
        class607.method3530((byte) 25);
        class379.method2442((byte) -99);
        class286.method1852(true);
        class358.method2243((byte) 103);
        class421.method2649((byte) 2);
        class299.method1994(121);
        class123.method759(127);
        class234.method1506(770);
        class348.method2223(0);
        class21.method131();
        class529.method3104(94);
        class259.method1730((byte) 106);
        class609.method3534(1);
        class499.method2990((byte) -125);
        class38.method204(1);
        class318.method2081((byte) -74);
        class554.method3202(0);
        class135.method826(-14897);
        class122.method758(52);
        class187.method1082((byte) 106);
        class23.method144(-119);
        class146.method873(-24573);
        class20.method126((byte) -128);
        class24.method148((byte) 10);
        class218.method1431(4);
        class332.method2159(114);
        class461.method2835(true);
        class608.method3532((byte) 54);
        class250.method1650(-121);
        class619.method3563((byte) 62);
        class527.method3099((byte) 76);
        class17.method113(true);
        class574.method3337((byte) -82);
        class641.method3656((byte) -126);
        class32.method183((byte) 59);
        class164.method952(0);
        class254.method1689((byte) -86);
        class155.method901(20);
        class207.method1320(!arg0);
        class512.method3042(false);
        class394.method2535(68);
        class224.method1462((byte) -36);
        class330.method2153(-92);
        class365.method2349(0);
        class369.method2379();
        class48.method267(false);
        class156.method903((byte) 116);
        class339.method2187((byte) -109);
        class553.method3199();
        class595.method3472((byte) 18);
        class413.method2606(-60);
        class51.method282(16);
        class628.method3601(true);
        class515.method3059(5);
        class278.method1815(0);
        class430.method2686(true);
        class410.method2593((byte) 124);
        class300.method1996(-106);
        class506.method3010(-26243);
        class434.method2709((byte) 120);
        class93.method590(-1);
        class635.method3624(0);
        class141.method851(-48);
        class11.method66(-31270);
        class168.method967((byte) -73);
        class128.method792((byte) -82);
        class334.method2170(128);
        class591.method3444((byte) -33);
        class34.method191(6406);
        class19.method123(-124);
        class22.method135((byte) -34);
        class600.method3485(-93);
        class225.method1466((byte) 115);
        class355.method2238(22945);
        class227.method1474(-1945);
        class65.method449(0);
        class524.method3091((byte) 28);
        class459.method2828(4000);
        class107.method657(arg0);
        class445.method2775(-16568);
        class91.method581((byte) 122);
        class405.method2572(-121);
        class451.method2787(-126);
        class63.method445(-85);
        class316.method2079(36);
        class477.method2916(110);
        class374.method2408(100);
        class130.method800(26826);
        class243.method1624(128);
        class514.method3052((byte) -63);
        class246.method1633(3072);
        class50.method280((byte) -69);
        class53.method290(0);
        class442.method2750((byte) 69);
        class639.method3640(false);
        class526.method3096(-5781);
        class268.method1752(-16543);
        class441.method2745(1);
        class228.method1479(64);
        class570.method3311(0);
        class133.method820(1);
        class521.method3082(0);
        class454.method2808(-41);
        class298.method1990(-698);
        class351.method2228(0);
        class42.method225(34067);
        class559.method3239(-25997);
        class260.method1734(-112);
        class484.method2925(38);
        class603.method3501(-1);
        class544.method3158(-91);
        class201.method1273(108);
        class166.method961(-77);
        class31.method181(77);
        class173.method992(-107);
        class345.method2215(81);
        class198.method1261((byte) -103);
        class573.method3332(-21);
        class139.method833(128);
        class493.method2960(-885157695);
        class541.method3143((byte) -54);
        class637.method3633((byte) 124);
        class276.method1793((byte) -85);
        class237.method1588((byte) 80);
        class352.method2232(-109);
        class216.method1425((byte) -123);
        class163.method949((byte) 98);
        class491.method2949(26070);
        class631.method3611((byte) -86);
        class490.method2943(arg0);
        class492.method2951(765);
        class384.method2450(!arg0);
        class140.method843(116657156);
        class295.method1979(0);
        class37.method203((byte) 99);
        class498.method2985((byte) 59);
        class568.method3298(95);
        class326.method2115(-90);
        class650.method3712(0);
        class159.method918((byte) -121);
        class322.method2104(false);
        class81.method534((byte) 60);
        class387.method2507(127);
        class112.method687((byte) -125);
        class444.method2774(arg0);
        class518.method3069(-5949);
        class223.method1455(-1);
        class367.method2352(false);
        class41.method219(-90);
        class414.method2612((byte) -61);
        class456.method2820((byte) 91);
        if (class108.field1321) {
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Z[B)V")
    private final void method1676(boolean arg0, byte[] arg1) {
        field3611++;
        if (!arg0) {
            method1679();
        }
        class194 var3 = new class194(arg1);
        while (true) {
            int var4 = var3.method1177(255);
            if (var4 == 0) {
                return;
            }
            if (var4 == 2) {
                class555.field7871 = var3.method1220(120);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
    public static final void method1677(int arg0) {
        int var1 = class88.field1018;
        int[] var2 = class457.field6839;
        for (int var3 = 0; var3 < class387.field5958 + var1; var3++) {
            class191 var4;
            if (var3 < var1) {
                var4 = class142.field1749[var2[var3]];
            } else {
                var4 = ((class411) class42.field456.method524((byte) 83, (long) class362.field5141[var3 - var1])).field6254;
            }
            if (var4.field1757 == arg0 && var4.field2511 >= 0) {
                int var5 = var4.method1153(true);
                if ((var5 & 0x1) == 0) {
                    if ((var4.field1764 & 0x1FF) != 0 || (var4.field1768 & 0x1FF) != 0) {
                        continue;
                    }
                } else if ((var4.field1764 & 0x1FF) != 256 || (var4.field1768 & 0x1FF) != 256) {
                    continue;
                }
                int var10002;
                if (var5 == 1) {
                    int var6 = var4.field1764 >> 9;
                    int var7 = var4.field1768 >> 9;
                    if (var4.field2511 > class524.field7604[var6][var7]) {
                        class524.field7604[var6][var7] = var4.field2511;
                        class72.field775[var6][var7] = 1;
                    } else if (class524.field7604[var6][var7] == var4.field2511) {
                        var10002 = class72.field775[var6][var7]++;
                    }
                } else {
                    int var8 = (var5 - 1) * 256 + 60;
                    int var9 = var4.field1764 - var8 >> 9;
                    int var10 = var4.field1768 - var8 >> 9;
                    int var11 = var4.field1764 + var8 >> 9;
                    int var12 = var4.field1768 + var8 >> 9;
                    for (int var13 = var9; var13 <= var11; var13++) {
                        for (int var14 = var10; var14 <= var12; var14++) {
                            if (var4.field2511 > class524.field7604[var13][var14]) {
                                class524.field7604[var13][var14] = var4.field2511;
                                class72.field775[var13][var14] = 1;
                            } else if (class524.field7604[var13][var14] == var4.field2511) {
                                var10002 = class72.field775[var13][var14]++;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field3597++;
        if (!this.method662(22656)) {
            return;
        }
        class2.field14 = new class129();
        class2.field14.field1603 = Integer.parseInt(this.getParameter("worldid"));
        class606.field8861 = new class129();
        class606.field8861.field1603 = Integer.parseInt(this.getParameter("lobbyid"));
        class606.field8861.field1598 = this.getParameter("lobbyaddress");
        class475.field7013 = new class129();
        class475.field7013.field1603 = Integer.parseInt(this.getParameter("demoid"));
        class475.field7013.field1598 = this.getParameter("demoaddress");
        class197.field2667 = class181.method1040(Integer.parseInt(this.getParameter("modewhere")), (byte) 119);
        if (!class48.method265(663028206, class197.field2667) && class646.field9321 != class197.field2667) {
            class197.field2667 = class646.field9321;
        }
        class118.field1480 = class495.method2972(Integer.parseInt(this.getParameter("modewhat")), false);
        if (class213.field2944 != class118.field1480 && class67.field736 != class118.field1480 && class260.field3706 != class118.field1480) {
            class118.field1480 = class260.field3706;
        }
        try {
            class35.field396 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var12) {
            class35.field396 = 0;
        }
        String var1 = this.getParameter("objecttag");
        if (var1 != null && var1.equals("1")) {
            class254.field3629 = true;
        } else {
            class254.field3629 = false;
        }
        String var2 = this.getParameter("js");
        if (var2 != null && var2.equals("1")) {
            class436.field6484 = true;
        } else {
            class436.field6484 = false;
        }
        String var3 = this.getParameter("advert");
        if (var3 != null && var3.equals("1")) {
            class341.field4868 = true;
        } else {
            class341.field4868 = false;
        }
        String var4 = this.getParameter("game");
        if (var4 != null) {
            if (var4.equals("0")) {
                class184.field2291 = class325.field4688;
            } else if (var4.equals("1")) {
                class184.field2291 = class408.field6151;
            }
        }
        try {
            class448.field6686 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var11) {
            class448.field6686 = 0;
        }
        class73.field782 = this.getParameter("quiturl");
        class651.field9388 = this.getParameter("settings");
        if (class651.field9388 == null) {
            class651.field9388 = "";
        }
        String var5 = this.getParameter("country");
        if (var5 != null) {
            try {
                class346.field4964 = Integer.parseInt(var5);
            } catch (Exception var10) {
                class346.field4964 = 0;
            }
        }
        class295.field4387 = Integer.parseInt(this.getParameter("colourid"));
        if (class295.field4387 < 0 || class295.field4387 >= class288.field3987.length) {
            class295.field4387 = 0;
        }
        if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
            class657.field9498 = true;
            class114.field1429 = true;
        }
        String var6 = this.getParameter("frombilling");
        if (var6 != null && var6.equals("true")) {
            class243.field3448 = true;
        }
        class19.field195 = this.getParameter("sskey");
        if (class19.field195 != null && class19.field195.length() < 2) {
            class19.field195 = null;
        }
        String var7 = this.getParameter("force64mb");
        if (var7 != null && var7.equals("true")) {
            class622.field9000 = true;
        }
        String var8 = this.getParameter("worldflags");
        if (var8 != null) {
            try {
                class82.field911 = Integer.parseInt(var8);
            } catch (Exception var9) {
            }
        }
        class254.field3624 = this;
        if (class325.field4688 == class184.field2291) {
            class629.field9079 = 503;
            class492.field7169 = 765;
        } else if (class408.field6151 == class184.field2291) {
            class629.field9079 = 480;
            class492.field7169 = 640;
        }
        this.method666(class629.field9079, 32, class118.field1480.method3153(4) + 32, class492.field7169, class184.field2291.field1844, 611, (byte) 109);
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "()V")
    public static final void method1678() {
        for (int var0 = 0; var0 < class90.field1032; var0++) {
            int[] var1 = class524.field7604[var0];
            for (int var2 = 0; var2 < class30.field349; var2++) {
                var1[var2] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "()V")
    public static final void method1679() {
        class646.field9357 = 0;
        for (int var0 = 0; var0 < class387.field5958; var0++) {
            class78 var1 = ((class411) class42.field456.method524((byte) 87, (long) class362.field5141[var0])).field6254;
            if (var1.field2448 && var1.method510((byte) 75) != -1) {
                int var2 = (var1.method1153(true) - 1) * 256 + 252;
                int var3 = var1.field1764 - var2 >> 9;
                int var4 = var1.field1768 - var2 >> 9;
                class191 var5 = class305.method2027(var4, (byte) 60, var1.field1757, var3);
                if (var5 != null) {
                    int var6 = var5.field2495;
                    if (var5 instanceof class78) {
                        var6 += 2048;
                    }
                    if (var5.field2436 == 0 && var5.method510((byte) 75) != -1) {
                        class574.field8288[class646.field9357] = var6;
                        class110.field1352[class646.field9357] = var6;
                        class646.field9357++;
                        var5.field2436++;
                    }
                    class574.field8288[class646.field9357] = var6;
                    class110.field1352[class646.field9357] = var1.field2495 + 2048;
                    class646.field9357++;
                    var5.field2436++;
                }
            }
        }
        class448.method2780(class574.field8288, class110.field1352, class646.field9357 - 1, -90, 0);
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
    private final void method1680(int arg0) {
        field3602++;
        if (class133.field1673 == 13) {
            return;
        }
        class287.field3982++;
        if (class287.field3982 % 1000 == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class437.field6499 = var2.get(11) * 600 + (var2.get(12) * 10) + var2.get(13) / 6;
            class19.field194.setSeed((long) class437.field6499);
        }
        if (class287.field3982 % 50 == 0) {
            class168.field2056 = class576.field8330;
            class576.field8330 = 0;
            class427.field6352 = class306.field4513;
            class306.field4513 = 0;
        }
        this.method1686(false);
        if (class144.field1763 != null) {
            class144.field1763.method642(0);
        }
        class652.method3721(5);
        class280.field3915.method287((byte) -120);
        class32.field369.method779(-107);
        if (class413.field6264 != null) {
            class413.field6264.method400((int) class84.method550((byte) -85));
        }
        class593.method3451(-12086);
        class1.field4 = 0;
        class430.field6381 = 0;
        for (class478 var3 = class280.field3915.method286((byte) -87); var3 != null; var3 = class280.field3915.method286((byte) -87)) {
            int var6 = var3.method2201((byte) -109);
            if (var6 == 2 || var6 == 3) {
                char var7 = var3.method2204((byte) -115);
                if (class657.method3755((byte) -103) && (var7 == '`' || var7 == '§')) {
                    if (class645.method3672(-1645761693)) {
                        class149.method884((byte) 109);
                    } else {
                        class264.method1744(arg0 ^ 0xFFFFC967);
                    }
                } else if (class430.field6381 < 128) {
                    class128.field1576[class430.field6381] = var3;
                    class430.field6381++;
                }
            } else if (var6 == 0 && class1.field4 < 75) {
                class591.field8487[class1.field4] = var3;
                class1.field4++;
            }
        }
        class90.field1039 = 0;
        if (arg0 != 2) {
            method1684(null);
        }
        for (class458 var4 = class32.field369.method780(false); var4 != null; var4 = class32.field369.method780(false)) {
            int var5 = var4.method228(-12152);
            if (var5 == -1) {
                class455.field6821.method706(var4, true);
            } else if (var5 == 6) {
                class90.field1039 += var4.method231(-104);
            } else if (class384.method2451((byte) -55, var5)) {
                class187.field2310.method706(var4, true);
                if (class187.field2310.method707((byte) -106) > 10) {
                    class187.field2310.method714(true);
                }
            }
        }
        if (class645.method3672(arg0 ^ 0x9DE7AB61)) {
            class472.method2895(-1);
        }
        if (class133.field1673 == 0) {
            this.method1683((byte) 123);
            class387.method2505(104);
        } else if (class133.field1673 == 1) {
            this.method1683((byte) 120);
            class387.method2505(arg0 + 82);
        } else if (class348.method2222(0, class133.field1673)) {
            class44.method233((byte) -111);
        }
        if (class63.method444(class133.field1673, (byte) -70) && !class348.method2222(0, class133.field1673)) {
            this.method1685(true);
            class364.method2345(69);
            class190.method1138(false);
        } else if (class10.method56(class133.field1673, 3521) && !class348.method2222(arg0 ^ 0x2, class133.field1673)) {
            this.method1685(true);
            class190.method1138(false);
        } else if (class133.field1673 == 11) {
            class190.method1138(false);
        } else if (class463.method2838(10, class133.field1673) && !class348.method2222(0, class133.field1673)) {
            class320.method2087(-64);
        } else if (class133.field1673 == 12) {
            class190.method1138(false);
            if (class123.field1539 != -3 && class123.field1539 != 2 && class123.field1539 != 15) {
                class177.method1007((byte) -50, false);
            }
        }
        class387.method2506(arg0 - 2, class413.field6264);
        class187.field2310.method714(true);
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "()V")
    public static final void method1681() {
        int var0 = class88.field1018;
        int[] var1 = class457.field6839;
        int var2 = class592.field8494 ? var0 : class387.field5958 + var0;
        for (int var3 = 0; var3 < var2; var3++) {
            class191 var4;
            if (var3 < var0) {
                var4 = class142.field1749[var1[var3]];
            } else {
                var4 = ((class411) class42.field456.method524((byte) 101, (long) class362.field5141[var3 - var0])).field6254;
            }
            if (var4.field2511 >= 0) {
                int var5 = var4.method1153(true);
                if ((var5 & 0x1) == 0) {
                    if ((var4.field1764 & 0x1FF) == 0 && (var4.field1768 & 0x1FF) == 0) {
                        continue;
                    }
                } else if ((var4.field1764 & 0x1FF) == 256 && (var4.field1768 & 0x1FF) == 256) {
                    continue;
                }
                if (var4 instanceof class655 && var4.field2522 != null && class287.field3982 >= var4.field2522.field7986 && class287.field3982 < var4.field2522.field7987) {
                    ((class655) var4).field9450 = false;
                }
                var4.field1769 = class399.method2547(var4.field1768, var4.field1764, (byte) -125, var4.field1757);
                class367.method2355(var4, true);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Lqf;)Ldh;")
    public static final class271 method1682(class593 arg0) {
        class271 var1 = (class271) class547.field7835.method524((byte) 113, ((long) arg0.field8579 << 32) + (long) arg0.field8593);
        return var1 == null ? arg0.field8623 : var1;
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
    public final void method665(byte arg0) {
        if (class81.field908 == 2) {
            try {
                this.method1680(2);
            } catch (Throwable var3) {
                class630.method3607(7, var3, var3.getMessage() + " (Recovered) " + this.method668((byte) 58));
                class418.method2644(0, (byte) 80);
            }
        } else {
            this.method1680(2);
        }
        if (arg0 < 65) {
            method1669();
        }
        field3598++;
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V")
    private final void method1683(byte arg0) {
        if (!class595.field8694.field6521) {
            for (int var2 = 0; var2 < class430.field6381; var2++) {
                if (class128.field1576[var2].method2204((byte) -102) == 's' || class128.field1576[var2].method2204((byte) -121) == 'S') {
                    class595.field8694.field6521 = true;
                    break;
                }
            }
        }
        field3606++;
        if (class504.field7298 == 0) {
            Runtime var3 = Runtime.getRuntime();
            int var4 = (int) ((var3.totalMemory() - var3.freeMemory()) / 1024L);
            long var5 = class84.method550((byte) -87);
            if (class82.field927 == 0L) {
                class82.field927 = var5;
            }
            if (var4 > 16384 && var5 - class82.field927 < 5000L) {
                if ((var5 - class383.field5781) > 1000L) {
                    System.gc();
                    class383.field5781 = var5;
                }
                class595.field8696 = class173.field2121.method2902(class35.field396, -20139);
                class599.field8754 = 5;
            } else {
                class595.field8696 = class251.field3555.method2902(class35.field396, -20139);
                class504.field7298 = 10;
                class599.field8754 = 5;
            }
        } else if (class504.field7298 == 10) {
            for (int var7 = 0; var7 < 4; var7++) {
                class14.field120[var7] = class31.method182(class90.field1032, 29317, class30.field349);
            }
            class595.field8696 = class257.field3666.method2902(class35.field396, -20139);
            class599.field8754 = 10;
            class504.field7298 = 20;
        } else {
            if (arg0 < 119) {
                this.method1686(true);
            }
            if (class504.field7298 == 20) {
                if (class144.field1763 == null) {
                    class144.field1763 = new class103(class564.field8033, class298.field4409, class517.field7531, class471.field6981);
                }
                if (class144.field1763.method643(true)) {
                    class327.field4710 = class585.method3403(true, 1, false, 1, 0);
                    class581.field8364 = class585.method3403(true, 1, false, 1, 1);
                    class195.field2652 = class585.method3403(true, 1, false, 1, 2);
                    class330.field4747 = class585.method3403(true, 1, false, 1, 3);
                    class573.field8275 = class585.method3403(true, 1, false, 1, 4);
                    class647.field9367 = class585.method3403(true, 1, true, 1, 5);
                    class150.field1846 = class585.method3403(false, 1, true, 1, 6);
                    class30.field345 = class585.method3403(true, 1, false, 1, 7);
                    class319.field4621 = class585.method3403(true, 1, false, 1, 8);
                    class224.field3163 = class585.method3403(true, 1, false, 1, 9);
                    class97.field1140 = class585.method3403(true, 1, false, 1, 10);
                    class498.field7254 = class585.method3403(true, 1, false, 1, 11);
                    class656.field9485 = class585.method3403(true, 1, false, 1, 12);
                    class227.field3191 = class585.method3403(true, 1, false, 1, 13);
                    class110.field1356 = class585.method3403(false, 1, false, 1, 14);
                    class585.field8407 = class585.method3403(true, 1, false, 1, 15);
                    class434.field6438 = class585.method3403(true, 1, false, 1, 16);
                    class459.field6852 = class585.method3403(true, 1, false, 1, 17);
                    class359.field5094 = class585.method3403(true, 1, false, 1, 18);
                    class345.field4942 = class585.method3403(true, 1, false, 1, 19);
                    class290.field4010 = class585.method3403(true, 1, false, 1, 20);
                    class345.field4945 = class585.method3403(true, 1, false, 1, 21);
                    class39.field427 = class585.method3403(true, 1, false, 1, 22);
                    class144.field1770 = class585.method3403(true, 1, true, 1, 23);
                    class557.field7928 = class585.method3403(true, 1, false, 1, 24);
                    class626.field9049 = class585.method3403(true, 1, false, 1, 25);
                    class310.field4565 = class585.method3403(true, 1, true, 1, 26);
                    class449.field6713 = class585.method3403(true, 1, false, 1, 27);
                    class456.field6834 = class585.method3403(true, 1, true, 1, 28);
                    class289.field4007 = class585.method3403(true, 1, false, 1, 29);
                    class142.field1753 = class585.method3403(true, 1, true, 1, 30);
                    class73.field780 = class585.method3403(true, 1, true, 1, 31);
                    class595.field8696 = class11.field96.method2902(class35.field396, -20139);
                    class599.field8754 = 15;
                    class504.field7298 = 30;
                } else {
                    class595.field8696 = class386.field5922.method2902(class35.field396, -20139);
                    class599.field8754 = 12;
                }
            } else if (class504.field7298 == 30) {
                int var8 = 0;
                for (int var9 = 0; var9 < 32; var9++) {
                    var8 += class126.field1561[var9].method3321(75) * class38.field418[var9] / 100;
                }
                if (var8 == 100) {
                    class595.field8696 = class430.field6385.method2902(class35.field396, -20139);
                    class599.field8754 = 20;
                    class233.method1498((byte) 2, class319.field4621);
                    class515.method3057(class319.field4621, (byte) 16);
                    class504.field7298 = 35;
                } else {
                    if (var8 != 0) {
                        class595.field8696 = class601.field8770.method2902(class35.field396, -20139) + var8 + "%";
                    }
                    class599.field8754 = 20;
                }
            } else if (class504.field7298 == 35) {
                class246.method1630(class142.field1753, (byte) 30, class20.field197);
                class595.field8696 = class140.field1728.method2902(class35.field396, -20139);
                class504.field7298 = 40;
                class599.field8754 = 20;
            } else if (class504.field7298 == 40) {
                if (class456.field6834.method1305(2)) {
                    this.method1675(90, class456.field6834.method1308((byte) -126, 1));
                    this.method1676(true, class456.field6834.method1308((byte) -128, 3));
                    if (class555.field7871 == -1 || class30.field345.method1284(class555.field7871, (byte) 52, 0)) {
                        class595.field8696 = class319.field4620.method2902(class35.field396, -20139);
                        class599.field8754 = 25;
                        class504.field7298 = 41;
                    }
                } else {
                    class595.field8696 = class40.field428.method2902(class35.field396, -20139) + class456.field6834.method1306(true) + "%";
                    class599.field8754 = 25;
                }
            } else if (class504.field7298 == 41) {
                int var10 = class99.method615("jaggl", (byte) 95);
                if (var10 >= 0 && var10 < 100) {
                    class595.field8696 = class46.field500.method2902(class35.field396, -20139) + var10 + "%";
                    class599.field8754 = 25;
                } else {
                    class595.field8696 = class156.field1938.method2902(class35.field396, -20139);
                    class504.field7298 = 42;
                    class599.field8754 = 25;
                }
            } else if (class504.field7298 == 42) {
                int var11 = class99.method615("jagdx", (byte) 88);
                if (var11 >= 0 && var11 < 100) {
                    class595.field8696 = class266.field3756.method2902(class35.field396, -20139) + var11 + "%";
                    class599.field8754 = 25;
                } else {
                    class595.field8696 = class298.field4404.method2902(class35.field396, -20139);
                    class504.field7298 = 43;
                    class599.field8754 = 25;
                }
            } else if (class504.field7298 == 43) {
                int var12 = class99.method615("jagmisc", (byte) -94);
                if (var12 >= 0 && var12 < 100) {
                    class595.field8696 = class117.field1459.method2902(class35.field396, -20139) + var12 + "%";
                    class599.field8754 = 25;
                } else {
                    if (var12 == 100) {
                        this.method675(true);
                    }
                    class595.field8696 = class229.field3225.method2902(class35.field396, -20139);
                    class504.field7298 = 44;
                    class599.field8754 = 25;
                }
            } else if (class504.field7298 == 44) {
                int var13 = class99.method615("sw3d", (byte) 120);
                if (var13 >= 0 && var13 < 100) {
                    class595.field8696 = class575.field8299.method2902(class35.field396, -20139) + var13 + "%";
                    class599.field8754 = 25;
                } else {
                    class595.field8696 = class308.field4527.method2902(class35.field396, -20139);
                    class599.field8754 = 25;
                    class504.field7298 = 45;
                }
            } else if (class504.field7298 == 45) {
                int var14 = class99.method615("jaclib", (byte) -87);
                if (var14 >= 0 && var14 < 100) {
                    class595.field8696 = class448.field6685.method2902(class35.field396, -20139) + var14 + "%";
                    class599.field8754 = 25;
                } else {
                    if (var14 == 100) {
                        this.method661(-1);
                    }
                    class595.field8696 = class410.field6227.method2902(class35.field396, -20139);
                    class599.field8754 = 25;
                    class504.field7298 = 46;
                }
            } else if (class504.field7298 == 46) {
                int var15 = class99.method615("hw3d", (byte) -106);
                if (var15 >= 0 && var15 < 100) {
                    class595.field8696 = class331.field4759.method2902(class35.field396, -20139) + var15 + "%";
                    class599.field8754 = 25;
                } else {
                    class595.field8696 = class333.field4788.method2902(class35.field396, -20139);
                    class599.field8754 = 25;
                    class504.field7298 = 47;
                }
            } else if (class504.field7298 == 47) {
                if (class73.field780.method1305(2)) {
                    class595.field8696 = class177.field2183.method2902(class35.field396, -20139);
                    class599.field8754 = 25;
                    class504.field7298 = 50;
                } else {
                    class595.field8696 = class206.field2761.method2902(class35.field396, -20139);
                    class599.field8754 = 25;
                }
            } else if (class504.field7298 == 50) {
                class509.method3035(-3);
                class595.field8696 = class293.field4066.method2902(class35.field396, -20139);
                class504.field7298 = 60;
                class599.field8754 = 30;
            } else if (class504.field7298 == 60) {
                int var16 = class371.method2389(class319.field4621, 0, class227.field3191);
                int var17 = class190.method1137(true);
                if (var17 > var16) {
                    class595.field8696 = class589.field8472.method2902(class35.field396, -20139) + var16 * 100 / var17 + "%";
                    class599.field8754 = 35;
                } else {
                    class595.field8696 = class633.field9116.method2902(class35.field396, -20139);
                    class599.field8754 = 35;
                    class504.field7298 = 70;
                }
            } else if (class504.field7298 == 70) {
                int var18 = class311.method2058(-1737, class319.field4621);
                int var19 = class625.method3582(7);
                if (var19 > var18) {
                    class595.field8696 = class191.field2492.method2902(class35.field396, -20139) + var18 * 100 / var19 + "%";
                    class599.field8754 = 40;
                } else {
                    class595.field8696 = class140.field1732.method2902(class35.field396, -20139);
                    class504.field7298 = 80;
                    class599.field8754 = 40;
                }
            } else if (class504.field7298 == 80) {
                if (class310.field4565.method1305(2)) {
                    class206.field2762 = new class61(class310.field4565, class224.field3163, class319.field4621);
                    class595.field8696 = class68.field744.method2902(class35.field396, -20139);
                    class504.field7298 = 90;
                    class599.field8754 = 45;
                } else {
                    class595.field8696 = class477.field7041.method2902(class35.field396, -20139) + class310.field4565.method1306(true) + "%";
                    class599.field8754 = 45;
                }
            } else if (class504.field7298 == 90) {
                class595.field8696 = class595.field8688.method2902(class35.field396, -20139);
                class504.field7298 = 95;
                class599.field8754 = 50;
            } else if (class504.field7298 == 95) {
                if (class595.field8694.field6521) {
                    class595.field8694.field6558 = 0;
                    class595.field8694.field6538 = 0;
                    class595.field8694.field6552 = 0;
                    class595.field8694.field6537 = 0;
                    class595.field8694.field6543 = 1;
                }
                class595.field8694.field6521 = true;
                class595.field8694.method2440(class20.field197, -122);
                class302.method2022(false, class595.field8694.field6558, -2221);
                class595.field8696 = class400.field6061.method2902(class35.field396, -20139);
                class504.field7298 = 100;
                class599.field8754 = 55;
            } else if (class504.field7298 == 100) {
                class199.method1265(class319.field4621, class227.field3191, class413.field6264, (byte) -102);
                class595.field8696 = class354.field5041.method2902(class35.field396, -20139);
                class599.field8754 = 60;
                class353.method2235(1, 1);
                class504.field7298 = 110;
            } else if (class504.field7298 == 110) {
                byte var20 = 0;
                class195.field2652.method1305(2);
                int var21 = var20 + class195.field2652.method1306(true);
                class434.field6438.method1305(2);
                int var22 = var21 + class434.field6438.method1306(true);
                class459.field6852.method1305(2);
                int var23 = var22 + class459.field6852.method1306(true);
                class359.field5094.method1305(2);
                int var24 = var23 + class359.field5094.method1306(true);
                class345.field4942.method1305(2);
                int var25 = var24 + class345.field4942.method1306(true);
                class290.field4010.method1305(2);
                int var26 = var25 + class290.field4010.method1306(true);
                class345.field4945.method1305(2);
                int var27 = var26 + class345.field4945.method1306(true);
                class39.field427.method1305(2);
                int var28 = var27 + class39.field427.method1306(true);
                class557.field7928.method1305(2);
                int var29 = var28 + class557.field7928.method1306(true);
                class626.field9049.method1305(2);
                int var30 = var29 + class626.field9049.method1306(true);
                class449.field6713.method1305(2);
                int var31 = var30 + class449.field6713.method1306(true);
                class289.field4007.method1305(2);
                int var32 = var31 + class289.field4007.method1306(true);
                if (var32 < 1200) {
                    class595.field8696 = class244.field3458.method2902(class35.field396, -20139) + var32 / 12 + "%";
                    class599.field8754 = 65;
                } else {
                    class565.field8053 = new class602(class184.field2291, class35.field396, class195.field2652);
                    class393.field6020 = new class6(class184.field2291, class35.field396, class195.field2652);
                    class281.field3925 = new class9(class184.field2291, class35.field396, class195.field2652, class319.field4621);
                    class573.field8276 = new class612(class184.field2291, class35.field396, class459.field6852);
                    class402.field6088 = new class333(class184.field2291, class35.field396, class195.field2652);
                    class108.field1317 = new class79(class184.field2291, class35.field396, class195.field2652);
                    class130.field1626 = new class613(class184.field2291, class35.field396, class195.field2652, class30.field345);
                    class81.field904 = new class652(class184.field2291, class35.field396, class195.field2652);
                    class3.field23 = new class59(class184.field2291, class35.field396, class195.field2652);
                    class575.field8301 = new class233(class184.field2291, class35.field396, true, class434.field6438, class30.field345);
                    class59.field680 = new class178(class184.field2291, class35.field396, class195.field2652, class319.field4621);
                    class601.field8769 = new class16(class184.field2291, class35.field396, class195.field2652, class319.field4621);
                    class224.field3151 = new class279(class184.field2291, class35.field396, true, class359.field5094, class30.field345);
                    class622.field8999 = new class4(class184.field2291, class35.field396, true, class565.field8053, class345.field4942, class30.field345);
                    class122.field1533 = new class538(class184.field2291, class35.field396, class195.field2652);
                    class259.field3686 = new class494(class184.field2291, class35.field396, class290.field4010, class327.field4710, class581.field8364);
                    class61.field702 = new class305(class184.field2291, class35.field396, class195.field2652);
                    class173.field2125 = new class179(class184.field2291, class35.field396, class195.field2652);
                    class141.field1735 = new class644(class184.field2291, class35.field396, class345.field4945, class30.field345);
                    class509.field7410 = new class117(class184.field2291, class35.field396, class195.field2652);
                    class655.field9434 = new class448(class184.field2291, class35.field396, class195.field2652);
                    class640.field9231 = new class157(class184.field2291, class35.field396, class195.field2652);
                    class300.field4421 = new class197(class184.field2291, class35.field396, class39.field427);
                    class574.field8290 = new class162(class184.field2291, class35.field396, class195.field2652);
                    class349.method2225(class30.field345, 17819, class227.field3191, class330.field4747, class319.field4621);
                    class94.method597(class289.field4007, 0);
                    class166.field2040 = new class46(class35.field396, class557.field7928, class626.field9049);
                    class498.field7255 = new class585(class35.field396, class557.field7928, class626.field9049, new class406());
                    class595.field8696 = class467.field6932.method2902(class35.field396, -20139);
                    class599.field8754 = 65;
                    class145.method870(0);
                    class575.field8301.method1501((byte) -98, !class595.field8694.method2426(class81.field908, -5));
                    class23.field243 = new class564();
                    class170.method982(17526);
                    class615.method3552(class449.field6713, 94);
                    class194.method1179(class206.field2762, class30.field345, (byte) -23);
                    class504.field7298 = 120;
                }
            } else if (class504.field7298 == 120) {
                int var33 = class104.method645(class319.field4621, (byte) -29);
                int var34 = class471.method2888((byte) 12);
                if (var34 > var33) {
                    class595.field8696 = class477.field7035.method2902(class35.field396, -20139) + var33 * 100 / var34 + "%";
                    class599.field8754 = 70;
                } else {
                    class248.method1647(-1, class319.field4621, class413.field6264);
                    class41.method221(0, class603.field8816);
                    class595.field8696 = class473.field6997.method2902(class35.field396, -20139);
                    class599.field8754 = 70;
                    class504.field7298 = 130;
                }
            } else if (class504.field7298 == 130) {
                if (class97.field1140.method1301("huffman", "", 12291)) {
                    class264 var35 = new class264(class97.field1140.method1281((byte) -37, "", "huffman"));
                    class215.method1417(var35, false);
                    class595.field8696 = class512.field7480.method2902(class35.field396, -20139);
                    class599.field8754 = 75;
                    class504.field7298 = 140;
                } else {
                    class595.field8696 = class40.field437.method2902(class35.field396, -20139) + "0%";
                    class599.field8754 = 75;
                }
            } else if (class504.field7298 == 140) {
                if (class330.field4747.method1305(2)) {
                    class595.field8696 = class101.field1201.method2902(class35.field396, -20139);
                    class599.field8754 = 80;
                    class504.field7298 = 150;
                } else {
                    class595.field8696 = class236.field3382.method2902(class35.field396, -20139) + class330.field4747.method1306(true) + "%";
                    class599.field8754 = 80;
                }
            } else if (class504.field7298 == 150) {
                if (class656.field9485.method1305(2)) {
                    class595.field8696 = class173.field2124.method2902(class35.field396, -20139);
                    class599.field8754 = 82;
                    class504.field7298 = 160;
                } else {
                    class595.field8696 = class428.field6356.method2902(class35.field396, -20139) + class656.field9485.method1306(true) + "%";
                    class599.field8754 = 82;
                }
            } else if (class504.field7298 == 160) {
                if (class227.field3191.method1305(2)) {
                    class595.field8696 = class486.field7104.method2902(class35.field396, -20139);
                    class599.field8754 = 85;
                    class504.field7298 = 170;
                } else {
                    class595.field8696 = class486.field7104.method2902(class35.field396, -20139) + class227.field3191.method1306(true) + "%";
                    class599.field8754 = 85;
                }
            } else if (class504.field7298 == 170) {
                if (class144.field1770.method1289("details", 74)) {
                    class182.method1061(class144.field1770, class402.field6088, class108.field1317, class575.field8301, class59.field680, class601.field8769, class23.field243);
                    class595.field8696 = class506.field7326.method2902(class35.field396, -20139);
                    class599.field8754 = 89;
                    class504.field7298 = 190;
                } else {
                    class595.field8696 = class320.field4633.method2902(class35.field396, -20139) + class144.field1770.method1310("details", 1) + "%";
                    class599.field8754 = 87;
                }
            } else if (class504.field7298 == 190) {
                class144.field1760 = new boolean[class640.field9231.field1942];
                class603.field8815 = new String[class655.field9434.field6682];
                class285.field3942 = new int[class640.field9231.field1942];
                for (int var36 = 0; var36 < class640.field9231.field1942; var36++) {
                    if (class640.field9231.method910((byte) -125, var36).field6146 == 0) {
                        class144.field1760[var36] = true;
                        class313.field4578++;
                    }
                    class285.field3942[var36] = -1;
                }
                class90.method579(1);
                class512.field7479 = class330.field4747.method1283((byte) -110, "loginscreen");
                class256.field3659 = class330.field4747.method1283((byte) -43, "lobbyscreen");
                class647.field9367.method1298(53, true, false);
                class150.field1846.method1298(-101, true, true);
                class319.field4621.method1298(-115, true, true);
                class227.field3191.method1298(-120, true, true);
                class97.field1140.method1298(-99, true, true);
                class330.field4747.method1298(66, true, true);
                class177.field2182 = true;
                class195.field2652.field2708 = 2;
                class459.field6852.field2708 = 2;
                class434.field6438.field2708 = 2;
                class359.field5094.field2708 = 2;
                class345.field4942.field2708 = 2;
                class290.field4010.field2708 = 2;
                class345.field4945.field2708 = 2;
                class225.method1465(-1, class595.field8694.field6543, false, -89, -1);
                class595.field8696 = class49.field515.method2902(class35.field396, -20139);
                class599.field8754 = 95;
                class504.field7298 = 200;
            } else if (class504.field7298 == 200) {
                class353.method2235(2, 1);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
    public final void method674(int arg0) {
        field3610++;
        if (class95.field1125) {
            class110.method681((byte) -78);
        }
        if (class413.field6264 != null) {
            class413.field6264.method3522(16384);
        }
        if (class375.field5714 != null) {
            class514.method3053(-83, class375.field5714, class20.field197);
            class375.field5714 = null;
        }
        if (arg0 != 0) {
            return;
        }
        if (class170.field2077 != null) {
            class170.field2077.method1841(arg0 ^ 0xFFFFFF9B);
            class170.field2077 = null;
        }
        class320.method2088(-1);
        class564.field8033.method2763(9);
        class298.field4409.method1418(1);
        if (class635.field9129 != null) {
            class635.field9129.method544(89);
            class635.field9129 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Lqf;)Z")
    public static final boolean method1684(class593 arg0) {
        if (class541.field7761) {
            if (method1682(arg0).field3798 != 0) {
                return false;
            }
            if (arg0.field8507 == 0) {
                return false;
            }
        }
        return arg0.field8561;
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(Z)V")
    private final void method1685(boolean arg0) {
        if (class133.field1673 == 6 && class306.field4499 == 0) {
            if (class260.field3703 > 1) {
                class260.field3703--;
                class367.field5553 = class240.field3406;
            }
            if (!class600.field8764) {
                class492.method2953((byte) -19);
            }
            for (int var2 = 0; var2 < 100 && class58.method420(4667); var2++) {
            }
        }
        field3608++;
        class529.field7661++;
        class573.method3333(-1, (byte) 110, null, -1);
        class619.method3561(null, 4096, -1, -1);
        class650.method3715((byte) -107);
        class240.field3406++;
        for (int var3 = 0; var3 < class458.field6840; var3++) {
            class78 var4 = class599.field8757[var3].field6254;
            if (var4 != null) {
                byte var5 = var4.field864.field8074;
                if ((var5 & 0x1) != 0) {
                    int var6 = var4.method1153(true);
                    if ((var5 & 0x2) != 0 && var4.field2517 == 0 && Math.random() * 1000.0D < 10.0D) {
                        int var7 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        int var8 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        if (var7 != 0 || var8 != 0) {
                            int var9 = var4.field2515[0] + var7;
                            if (var9 < 0) {
                                var9 = 0;
                            } else if ((class90.field1032 - var6 - 1) < var9) {
                                var9 = class90.field1032 - var6 - 1;
                            }
                            int var10 = var4.field2524[0] + var8;
                            if (var10 < 0) {
                                var10 = 0;
                            } else if (class30.field349 - var6 - 1 < var10) {
                                var10 = class30.field349 - var6 - 1;
                            }
                            int var11 = class371.method2388(0, var4.field2524[0], var6, var6, (byte) 116, class353.field5027, class14.field120[var4.field1757], class322.field4656, true, var6, 0, -1, var4.field2515[0], var10, var9);
                            if (var11 > 0) {
                                if (var11 > 9) {
                                    var11 = 9;
                                }
                                for (int var12 = 0; var12 < var11; var12++) {
                                    var4.field2515[var12] = class322.field4656[var11 - var12 - 1];
                                    var4.field2524[var12] = class353.field5027[var11 - var12 - 1];
                                    var4.field2525[var12] = 1;
                                }
                                var4.field2517 = var11;
                            }
                        }
                    }
                    class46.method247(0, true, var4);
                    int var13 = class603.method3503(var4, -1);
                    class406.method2574(class248.field3528, var13, class119.field1501, !arg0, var4);
                    class139.method836(var4, (byte) -18);
                }
            }
        }
        if (class306.field4499 == 0 && class360.field5099 == 0) {
            if (class236.field3384 == 2) {
                class246.method1631(-82);
            } else {
                class59.method421(512);
            }
            if ((class337.field4821 >> 9) < 14 || class90.field1032 - 14 <= class337.field4821 >> 9 || (class207.field2781 >> 9) < 14 || (class30.field349 - 14) <= (class207.field2781 >> 9)) {
                class319.method2082(100016300);
            }
        }
        while (true) {
            class86 var14;
            class593 var15;
            class593 var16;
            do {
                var14 = (class86) class94.field1106.method714(true);
                if (var14 == null) {
                    while (true) {
                        class86 var17;
                        class593 var18;
                        class593 var19;
                        do {
                            var17 = (class86) class566.field8109.method714(true);
                            if (var17 == null) {
                                while (true) {
                                    class86 var20;
                                    class593 var21;
                                    class593 var22;
                                    do {
                                        var20 = (class86) class463.field6892.method714(true);
                                        if (var20 == null) {
                                            if (class39.field425 != null) {
                                                class168.method966(2);
                                            }
                                            if (class287.field3982 % 1500 == 0) {
                                                class414.method2611(arg0);
                                            }
                                            if (class133.field1673 == 6 && class306.field4499 == 0) {
                                                class572.method3329(113);
                                            }
                                            class494.method2962(arg0);
                                            if (class95.field1125 && class145.field1789 < class84.method550((byte) -121) - 60000L) {
                                                class110.method681((byte) -91);
                                            }
                                            for (class541 var23 = (class541) class201.field2689.method3297((byte) 115); var23 != null; var23 = (class541) class201.field2689.method3296((byte) -110)) {
                                                if ((long) var23.field7757 < class84.method550((byte) -97) / 1000L - 5L) {
                                                    if (var23.field7755 > 0) {
                                                        class117.method726("", -1, 0, var23.field7753 + class651.field9390.method2902(class35.field396, -20139), "", 5, "");
                                                    }
                                                    if (var23.field7755 == 0) {
                                                        class117.method726("", -1, 0, var23.field7753 + class567.field8143.method2902(class35.field396, -20139), "", 5, "");
                                                    }
                                                    var23.method3488(!arg0);
                                                }
                                            }
                                            if (class133.field1673 == 6 && class306.field4499 == 0) {
                                                if (class170.field2077 == null) {
                                                    class177.method1007((byte) -50, false);
                                                    return;
                                                }
                                                class290.field4012++;
                                                if (class290.field4012 > 50) {
                                                    class308.method2044(class193.field2552, -7434);
                                                    class147.field1807++;
                                                }
                                                try {
                                                    if (class170.field2077 != null && class468.field6960.field2610 > 0) {
                                                        class576.field8330 += class468.field6960.field2610;
                                                        class170.field2077.method1840(0, class468.field6960.field2610, class468.field6960.field2622, 0);
                                                        class290.field4012 = 0;
                                                        class468.field6960.field2610 = 0;
                                                        return;
                                                    }
                                                } catch (IOException var24) {
                                                    class177.method1007((byte) -50, false);
                                                    return;
                                                }
                                            }
                                            return;
                                        }
                                        var21 = var20.field976;
                                        if (var21.field8593 < 0) {
                                            break;
                                        }
                                        var22 = class259.method1728(40, var21.field8533);
                                    } while (var22 == null || var22.field8512 == null || var21.field8593 >= var22.field8512.length || var22.field8512[var21.field8593] != var21);
                                    class604.method3516(var20);
                                }
                            }
                            var18 = var17.field976;
                            if (var18.field8593 < 0) {
                                break;
                            }
                            var19 = class259.method1728(40, var18.field8533);
                        } while (var19 == null || var19.field8512 == null || var19.field8512.length <= var18.field8593 || var19.field8512[var18.field8593] != var18);
                        class604.method3516(var17);
                    }
                }
                var15 = var14.field976;
                if (var15.field8593 < 0) {
                    break;
                }
                var16 = class259.method1728(40, var15.field8533);
            } while (var16 == null || var16.field8512 == null || var16.field8512.length <= var15.field8593 || var16.field8512[var15.field8593] != var15);
            class604.method3516(var14);
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(Z)V")
    private final void method1686(boolean arg0) {
        field3593++;
        if (arg0) {
            field3599 = null;
        }
        boolean var2 = class564.field8033.method2761(62);
        if (!var2) {
            this.method1674(8);
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1687(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
