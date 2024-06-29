import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import java.io.IOException;
import java.net.Socket;
import java.util.GregorianCalendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!client")
public class client extends class319 {

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "Ltl;")
    public static class222 field4218 = new class222(4);

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "I")
    public static int field4230 = 0;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "Ljava/lang/String;")
    public static String field4228 = "";

    @OriginalMember(owner = "client!client", name = "nb", descriptor = "Z")
    public static boolean field4231 = true;

    @OriginalMember(owner = "client!client", name = "A", descriptor = "I")
    public static int field4206;

    @OriginalMember(owner = "client!client", name = "E", descriptor = "I")
    public static int field4207;

    @OriginalMember(owner = "client!client", name = "Q", descriptor = "I")
    public static int field4208;

    @OriginalMember(owner = "client!client", name = "R", descriptor = "I")
    public static int field4209;

    @OriginalMember(owner = "client!client", name = "S", descriptor = "I")
    public static int field4210;

    @OriginalMember(owner = "client!client", name = "T", descriptor = "I")
    public static int field4211;

    @OriginalMember(owner = "client!client", name = "U", descriptor = "I")
    public static int field4212;

    @OriginalMember(owner = "client!client", name = "V", descriptor = "I")
    public static int field4213;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "I")
    public static int field4214;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    public static int field4215;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    public static int field4216;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    public static int field4217;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field4219;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field4220;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field4221;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field4222;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field4223;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field4224;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field4225;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    public static int field4226;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
    public static int field4227;

    @OriginalMember(owner = "client!client", name = "ob", descriptor = "I")
    public static int field4232;

    @OriginalMember(owner = "client!client", name = "pb", descriptor = "Z")
    public static boolean field4233;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "[Lag;")
    public static class123[] field4229;

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(ILjava/lang/String;)Ljava/lang/Class;", line = 5)
    public static final Class method1893(int arg0, String arg1) throws ClassNotFoundException {
        field4224++;
        if (arg1.equals("B")) {
            return Byte.TYPE;
        } else if (arg1.equals("I")) {
            return Integer.TYPE;
        } else {
            if (arg0 != 255) {
                field4232 = -51;
            }
            if (arg1.equals("S")) {
                return Short.TYPE;
            } else if (arg1.equals("J")) {
                return Long.TYPE;
            } else if (arg1.equals("Z")) {
                return Boolean.TYPE;
            } else if (arg1.equals("F")) {
                return Float.TYPE;
            } else if (arg1.equals("D")) {
                return Double.TYPE;
            } else if (arg1.equals("C")) {
                return Character.TYPE;
            } else {
                return Class.forName(arg1);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V", line = 44)
    public static final void main(String[] arg0) {
        field4222++;
        try {
            if (arg0.length != 4) {
                class287.method2017(37, "argument count");
            }
            class140.field2090 = Integer.parseInt(arg0[0]);
            class71.field917 = 2;
            if (arg0[1].equals("live")) {
                class60.field790 = 0;
            } else if (arg0[1].equals("rc")) {
                class60.field790 = 1;
            } else if (arg0[1].equals("wip")) {
                class60.field790 = 2;
            } else {
                class287.method2017(37, "modewhat");
            }
            class152.field2329 = false;
            class136.field2054 = class31.method201(14762, arg0[2]);
            if (class136.field2054 == -1) {
                if (arg0[2].equals("english")) {
                    class136.field2054 = 0;
                } else if (arg0[2].equals("german")) {
                    class136.field2054 = 1;
                } else {
                    class287.method2017(37, "language");
                }
            }
            class157.method1088(class136.field2054, true);
            class242.field3844 = false;
            class114.field1706 = false;
            if (arg0[3].equals("game0")) {
                class20.field290 = 0;
            } else if (arg0[3].equals("game1")) {
                class20.field290 = 1;
            } else {
                class287.method2017(37, "game");
            }
            class240.field3807 = 0;
            class231.field3701 = 0;
            class147.field2204 = "";
            class107.field1608 = false;
            client var1 = new client();
            class320.field4997 = var1;
            var1.method2232((byte) -97, 545, false, 1024, class60.field790 + 32, "runescape", 768, 29);
            class161.field2635.setLocation(40, 40);
        } catch (Exception var3) {
            class314.method2186((String) null, 124, var3);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lok;)Lok;", line = 115)
    public static final class160 method1894(class160 arg0) {
        int var1 = method1913(arg0).method1165((byte) 124);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class37.method238((byte) 34, arg0.field2544);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V", line = 137)
    private final void method1895(boolean arg0) {
        field4216++;
        if (class115.field1736 < class269.field4246.field3877) {
            class336.field5214 = (class269.field4246.field3877 - 1) * 50 * 5;
            if (class206.field3366 == class127.field1890) {
                class206.field3366 = class130.field1920;
            } else {
                class206.field3366 = class127.field1890;
            }
            if (class336.field5214 > 3000) {
                class336.field5214 = 3000;
            }
            if (class269.field4246.field3877 >= 2 && class269.field4246.field3878 == 6) {
                this.method2227(123, "js5connect_outofdate");
                class144.field2159 = 1000;
                return;
            }
            if (class269.field4246.field3877 >= 4 && class269.field4246.field3878 == -1) {
                this.method2227(123, "js5crc");
                class144.field2159 = 1000;
                return;
            }
            if (class269.field4246.field3877 >= 4 && (class144.field2159 == 0 || class144.field2159 == 5)) {
                if (class269.field4246.field3878 == 7 || class269.field4246.field3878 == 9) {
                    this.method2227(123, "js5connect_full");
                } else if (class269.field4246.field3878 <= 0) {
                    this.method2227(121, "js5io");
                } else {
                    this.method2227(122, "js5connect");
                }
                class144.field2159 = 1000;
                return;
            }
        }
        if (arg0) {
            this.method1903((byte) 98);
        }
        class115.field1736 = class269.field4246.field3877;
        if (class336.field5214 > 0) {
            class336.field5214--;
            return;
        }
        try {
            if (class260.field4143 == 0) {
                class208.field3405 = class264.field4183.method41(class206.field3366, class246.field3908, -1);
                class260.field4143++;
            }
            if (class260.field4143 == 1) {
                if (class208.field3405.field3488 == 2) {
                    this.method1900(false, 1000);
                    return;
                }
                if (class208.field3405.field3488 == 1) {
                    class260.field4143++;
                }
            }
            if (class260.field4143 == 2) {
                class107.field1607 = new class300((Socket) class208.field3405.field3490, class264.field4183);
                class192 var2 = new class192(5);
                var2.method1365(-32769, 15);
                var2.method1350(545, -91);
                class107.field1607.method2101(var2.field3128, (byte) 18, 0, 5);
                class260.field4143++;
                class277.field4380 = class304.method2128((byte) -93);
            }
            if (class260.field4143 == 3) {
                if (class144.field2159 == 0 || class144.field2159 == 5 || class107.field1607.method2100(0) > 0) {
                    int var3 = class107.field1607.method2099(0);
                    if (var3 != 0) {
                        this.method1900(false, var3);
                        return;
                    }
                    class260.field4143++;
                } else if ((class304.method2128((byte) -128) - class277.field4380) > 30000L) {
                    this.method1900(arg0, 1001);
                    return;
                }
            }
            if (class260.field4143 == 4) {
                boolean var4 = class144.field2159 == 5 || class144.field2159 == 10 || class144.field2159 == 28;
                class269.field4246.method1723(class107.field1607, false, !var4);
                class260.field4143 = 0;
                class208.field3405 = null;
                class107.field1607 = null;
            }
        } catch (IOException var6) {
            this.method1900(false, 1002);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Lok;)Z", line = 280)
    public static final boolean method1896(class160 arg0) {
        if (class147.field2201) {
            if (method1913(arg0).field2725 != 0) {
                return false;
            }
            if (arg0.field2608 == 0) {
                return false;
            }
        }
        return arg0.field2581;
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V", line = 297)
    public final void method1897(byte arg0) {
        field4220++;
        if (class186.field2991) {
            class186.method1285();
        }
        if (class113.field1688 != null) {
            class66.method432(class113.field1688, class264.field4183, (byte) 108);
            class113.field1688 = null;
        }
        if (class264.field4183 != null) {
            class264.field4183.method43(1, this.getClass());
        }
        if (class331.field5160 != null) {
            class331.field5160.field5192 = false;
        }
        class331.field5160 = null;
        if (arg0 < 122) {
            method1896((class160) null);
        }
        if (class69.field901 != null) {
            class69.field901.method2095(8737);
            class69.field901 = null;
        }
        class335.method2310(class338.field5247, -1);
        class214.method1565(class338.field5247, -22881);
        if (class238.field3771 != null) {
            class238.field3771.method404(class338.field5247, true);
        }
        class46.method310((byte) -104);
        class283.method2005((byte) -113);
        class238.field3771 = null;
        if (class154.field2355 != null) {
            class154.field2355.method664(-1058);
        }
        if (class296.field4640 != null) {
            class296.field4640.method664(-1058);
        }
        class269.field4246.method1725((byte) -111);
        class30.field425.method1781(-119);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ZB)V", line = 353)
    public static final void method1898(boolean arg0, byte arg1) {
        field4212++;
        int var2 = -57 % ((26 - arg1) / 42);
        byte var3;
        byte[][] var4;
        if (class186.field2991 && arg0) {
            var3 = 1;
            var4 = class71.field909;
        } else {
            var4 = class237.field3750;
            var3 = 4;
        }
        for (int var5 = 0; var5 < var3; var5++) {
            class40.method279(25259);
            for (int var6 = 0; var6 < 13; var6++) {
                for (int var7 = 0; var7 < 13; var7++) {
                    int var8 = class114.field1704[var5][var6][var7];
                    if (var8 != -1) {
                        int var9 = var8 >> 24 & 0x3;
                        if (!arg0 || var9 == 0) {
                            int var10 = (var8 & 0x7) >> 1;
                            int var11 = (var8 & 0x3FFF) >> 3;
                            int var12 = (var8 & 0xFFE52D) >> 14;
                            int var13 = (var12 / 8 << 8) + (var11 / 8);
                            for (int var14 = 0; var14 < class327.field5096.length; var14++) {
                                if (class327.field5096[var14] == var13 && var4[var14] != null) {
                                    class111.method773((var11 & 0x7) * 8, var10, var7 * 8, var6 * 8, var4[var14], arg0, 1920880130, class50.field685, var9, var5, (var12 & 0x7) * 8);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([[B[[BI[[B[[F[[F[[F[[B[[[B[[I[[II)[Lkd;", line = 439)
    public static final class83[] method1899(byte[][] arg0, byte[][] arg1, int arg2, byte[][] arg3, float[][] arg4, float[][] arg5, float[][] arg6, byte[][] arg7, byte[][][] arg8, int[][] arg9, int[][] arg10, int arg11) {
        field4223++;
        class246 var12 = new class246(128);
        for (int var13 = 1; var13 <= 102; var13++) {
            for (int var14 = 1; var14 <= 102; var14++) {
                int var15 = arg7[var13][var14] & 0xFF;
                int var16 = arg3[var13][var14] & 0xFF;
                if (var15 != 0) {
                    class291 var17 = class226.method1651(var15 - 1, (byte) 87);
                    if (var17.field4588 == -1) {
                        continue;
                    }
                    class83 var18 = class305.method2138(var12, var17, arg11 - 32578);
                    byte var19 = arg1[var13][var14];
                    int[] var20 = class295.field4633[var19];
                    var18.field1256 += var20.length / 2;
                    var18.field1265++;
                    if (var17.field4592 && var16 != 0) {
                        var18.field1256 += class50.field688[var19];
                    }
                }
                if ((arg3[var13][var14] & 0xFF) != 0 || var15 != 0 && arg1[var13][var14] == 0) {
                    int var21 = 0;
                    int[] var22 = new int[8];
                    int var23 = 0;
                    int var24 = 0;
                    int var25 = 0;
                    int var26 = 0;
                    int var27 = arg7[var13][var14 + 1] & 0xFF;
                    int var28 = arg7[var13 - 1][var14] & 0xFF;
                    int var29 = arg7[var13][var14 - 1] & 0xFF;
                    int var30 = arg7[var13 - 1][var14 + 1] & 0xFF;
                    int var31 = arg7[var13 - 1][var14 - 1] & 0xFF;
                    int var32 = arg7[var13 + 1][var14] & 0xFF;
                    int var33 = arg7[var13 + 1][var14 + 1] & 0xFF;
                    int var34 = arg7[var13 + 1][var14 - 1] & 0xFF;
                    if (var30 == 0 || var15 == var30) {
                        boolean var43 = false;
                    } else {
                        class291 var35 = class226.method1651(var30 - 1, (byte) 96);
                        if (var35.field4592 && var35.field4588 != -1) {
                            byte var36 = arg0[var13 - 1][var14 + 1];
                            byte var37 = arg1[var13 - 1][var14 + 1];
                            int var38 = class326.field5086[var37 * 4 + (var36 + 2 & 0x3)];
                            int var39 = class326.field5086[(var36 + 3 & 0x3) + var37 * 4];
                            if (class63.field829[var39][1] && class63.field829[var38][0]) {
                                boolean var40 = false;
                            } else {
                                for (int var41 = 0; var41 < 8; var41++) {
                                    if (var21 == var41) {
                                        var22[var21++] = var30;
                                        break;
                                    }
                                    if (var22[var41] == var30) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            boolean var42 = false;
                        }
                    }
                    if (var31 == 0 || var15 == var31) {
                        boolean var52 = false;
                    } else {
                        class291 var44 = class226.method1651(var31 - 1, (byte) 45);
                        if (var44.field4592 && var44.field4588 != -1) {
                            byte var45 = arg0[var13 - 1][var14 - 1];
                            byte var46 = arg1[var13 - 1][var14 - 1];
                            int var47 = class326.field5086[(var45 & 0x3) + var46 * 4];
                            int var48 = class326.field5086[(var45 + 3 & 0x3) + var46 * 4];
                            if (class63.field829[var47][1] && class63.field829[var48][0]) {
                                boolean var49 = false;
                            } else {
                                for (int var50 = 0; var50 < 8; var50++) {
                                    if (var21 == var50) {
                                        var22[var21++] = var31;
                                        break;
                                    }
                                    if (var22[var50] == var31) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            boolean var51 = false;
                        }
                    }
                    if (var34 == 0 || var15 == var34) {
                        boolean var61 = false;
                    } else {
                        class291 var53 = class226.method1651(var34 - 1, (byte) 112);
                        if (var53.field4592 && var53.field4588 != -1) {
                            byte var54 = arg0[var13 + 1][var14 - 1];
                            byte var55 = arg1[var13 + 1][var14 - 1];
                            int var56 = class326.field5086[(var54 & 0x3) + var55 * 4];
                            int var57 = class326.field5086[(var54 + 1 & 0x3) + var55 * 4];
                            if (class63.field829[var57][1] && class63.field829[var56][0]) {
                                boolean var58 = false;
                            } else {
                                for (int var59 = 0; var59 < 8; var59++) {
                                    if (var21 == var59) {
                                        var22[var21++] = var34;
                                        break;
                                    }
                                    if (var22[var59] == var34) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            boolean var60 = false;
                        }
                    }
                    if (var33 == 0 || var15 == var33) {
                        boolean var70 = false;
                    } else {
                        class291 var62 = class226.method1651(var33 - 1, (byte) 68);
                        if (var62.field4592 && var62.field4588 != -1) {
                            byte var63 = arg0[var13 + 1][var14 + 1];
                            byte var64 = arg1[var13 + 1][var14 + 1];
                            int var65 = class326.field5086[(var63 + 2 & 0x3) + var64 * 4];
                            int var66 = class326.field5086[(var63 + 1 & 0x3) + var64 * 4];
                            if (class63.field829[var65][1] && class63.field829[var66][0]) {
                                boolean var67 = false;
                            } else {
                                for (int var68 = 0; var68 < 8; var68++) {
                                    if (var21 == var68) {
                                        var22[var21++] = var33;
                                        break;
                                    }
                                    if (var22[var68] == var33) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            boolean var69 = false;
                        }
                    }
                    if (var27 != 0 && var15 != var27) {
                        class291 var71 = class226.method1651(var27 - 1, (byte) 74);
                        if (var71.field4592 && var71.field4588 != -1) {
                            var23 = class326.field5086[arg1[var13][var14 + 1] * 4 + (arg0[var13][var14 + 1] + 2 & 0x3)];
                            for (int var72 = 0; var72 < 8; var72++) {
                                if (var21 == var72) {
                                    var22[var21++] = var27;
                                    break;
                                }
                                if (var22[var72] == var27) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var28 != 0 && var15 != var28) {
                        class291 var73 = class226.method1651(var28 - 1, (byte) 82);
                        if (var73.field4592 && var73.field4588 != -1) {
                            var25 = class326.field5086[(arg0[var13 - 1][var14] + 3 & 0x3) + arg1[var13 - 1][var14] * 4];
                            for (int var74 = 0; var74 < 8; var74++) {
                                if (var21 == var74) {
                                    var22[var21++] = var28;
                                    break;
                                }
                                if (var22[var74] == var28) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var29 != 0 && var15 != var29) {
                        class291 var75 = class226.method1651(var29 - 1, (byte) 123);
                        if (var75.field4592 && var75.field4588 != -1) {
                            var24 = class326.field5086[(arg0[var13][var14 - 1] & 0x3) + arg1[var13][var14 - 1] * 4];
                            for (int var76 = 0; var76 < 8; var76++) {
                                if (var21 == var76) {
                                    var22[var21++] = var29;
                                    break;
                                }
                                if (var22[var76] == var29) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var32 != 0 && var15 != var32) {
                        class291 var77 = class226.method1651(var32 - 1, (byte) 54);
                        if (var77.field4592 && var77.field4588 != -1) {
                            var26 = class326.field5086[(arg0[var13 + 1][var14] + 1 & 0x3) + arg1[var13 + 1][var14] * 4];
                            for (int var78 = 0; var78 < 8; var78++) {
                                if (var21 == var78) {
                                    var22[var21++] = var32;
                                    break;
                                }
                                if (var22[var78] == var32) {
                                    break;
                                }
                            }
                        }
                    }
                    for (int var79 = 0; var79 < var21; var79++) {
                        int var80 = var22[var79];
                        boolean[] var81 = class63.field829[var27 == var80 ? var23 : 0];
                        boolean[] var82 = class63.field829[var28 == var80 ? var25 : 0];
                        boolean[] var83 = class63.field829[var29 == var80 ? var24 : 0];
                        boolean[] var84 = class63.field829[var32 == var80 ? var26 : 0];
                        class291 var85 = class226.method1651(var80 - 1, (byte) 84);
                        class83 var86 = class305.method2138(var12, var85, 2);
                        var86.field1256 += 5;
                        var86.field1256 += var81.length - 2;
                        var86.field1256 += var82.length - 2;
                        var86.field1256 += var83.length - 2;
                        var86.field1256 += var84.length - 2;
                        var86.field1265++;
                    }
                }
            }
        }
        for (class83 var87 = (class83) var12.method1746((byte) -33); var87 != null; var87 = (class83) var12.method1749((byte) 64)) {
            var87.method614();
        }
        for (int var88 = 1; var88 <= 102; var88++) {
            for (int var89 = 1; var89 <= 102; var89++) {
                int var90;
                if ((arg8[arg2][var88][var89] & 0x8) != 0) {
                    var90 = 0;
                } else if ((arg8[1][var88][var89] & 0x2) == 2 && arg2 > 0) {
                    var90 = arg2 - 1;
                } else {
                    var90 = arg2;
                }
                int var91 = arg3[var88][var89] & 0xFF;
                int var92 = arg7[var88][var89] & 0xFF;
                if (var92 != 0) {
                    class291 var93 = class226.method1651(var92 - 1, (byte) 109);
                    if (var93.field4588 == -1) {
                        continue;
                    }
                    class83 var94 = class305.method2138(var12, var93, 2);
                    byte var95 = arg1[var88][var89];
                    byte var96 = arg0[var88][var89];
                    int var97 = class256.method1812(arg11 - 32640, var93.field4586, arg10[var88][var89], var93.field4588);
                    int var98 = class256.method1812(-112, var93.field4586, arg10[var88 + 1][var89], var93.field4588);
                    int var99 = class256.method1812(arg11 - 32657, var93.field4586, arg10[var88 + 1][var89 + 1], var93.field4588);
                    int var100 = class256.method1812(-105, var93.field4586, arg10[var88][var89 + 1], var93.field4588);
                    class295.method2059(var97, var96, arg4, arg5, arg6, var94, var95, arg9, var88, var91 != 0 && var93.field4592, -1968038264, var100, var89, var98, var90, var99);
                }
                if ((arg3[var88][var89] & 0xFF) != 0 || var92 != 0 && arg1[var88][var89] == 0) {
                    int var101 = 0;
                    int var102 = 0;
                    int[] var103 = new int[8];
                    int var104 = 0;
                    int var105 = 0;
                    int var106 = 0;
                    int var107 = arg7[var88 - 1][var89] & 0xFF;
                    int var108 = arg7[var88][var89 + 1] & 0xFF;
                    int var109 = arg7[var88 - 1][var89 + 1] & 0xFF;
                    int var110 = arg7[var88][var89 - 1] & 0xFF;
                    int var111 = arg7[var88 + 1][var89 - 1] & 0xFF;
                    int var112 = arg7[var88 + 1][var89] & 0xFF;
                    int var113 = arg7[var88 + 1][var89 + 1] & 0xFF;
                    int var114 = arg7[var88 - 1][var89 - 1] & 0xFF;
                    if (var109 == 0 || var92 == var109) {
                        var109 = 0;
                    } else {
                        class291 var115 = class226.method1651(var109 - 1, (byte) 115);
                        if (var115.field4592 && var115.field4588 != -1) {
                            byte var116 = arg0[var88 - 1][var89 + 1];
                            byte var117 = arg1[var88 - 1][var89 + 1];
                            int var118 = class326.field5086[(var116 + 2 & 0x3) + var117 * 4];
                            int var119 = class326.field5086[(var116 + 3 & 0x3) + var117 * 4];
                            if (class63.field829[var119][1] && class63.field829[var118][0]) {
                                var109 = 0;
                            } else {
                                for (int var120 = 0; var120 < 8; var120++) {
                                    if (var101 == var120) {
                                        var103[var101++] = var109;
                                        break;
                                    }
                                    if (var103[var120] == var109) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            var109 = 0;
                        }
                    }
                    if (var114 == 0 || var92 == var114) {
                        var114 = 0;
                    } else {
                        class291 var121 = class226.method1651(var114 - 1, (byte) 92);
                        if (var121.field4592 && var121.field4588 != -1) {
                            byte var122 = arg1[var88 - 1][var89 - 1];
                            byte var123 = arg0[var88 - 1][var89 - 1];
                            int var124 = class326.field5086[(var123 & 0x3) + var122 * 4];
                            int var125 = class326.field5086[(var123 + 3 & 0x3) + var122 * 4];
                            if (class63.field829[var124][1] && class63.field829[var125][0]) {
                                var114 = 0;
                            } else {
                                for (int var126 = 0; var126 < 8; var126++) {
                                    if (var101 == var126) {
                                        var103[var101++] = var114;
                                        break;
                                    }
                                    if (var103[var126] == var114) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            var114 = 0;
                        }
                    }
                    if (var111 == 0 || var92 == var111) {
                        var111 = 0;
                    } else {
                        class291 var127 = class226.method1651(var111 - 1, (byte) 61);
                        if (var127.field4592 && var127.field4588 != -1) {
                            byte var128 = arg1[var88 + 1][var89 - 1];
                            byte var129 = arg0[var88 + 1][var89 - 1];
                            int var130 = class326.field5086[(var129 + 1 & 0x3) + var128 * 4];
                            int var131 = class326.field5086[var128 * 4 + (var129 & 0x3)];
                            if (class63.field829[var130][1] && class63.field829[var131][0]) {
                                var111 = 0;
                            } else {
                                for (int var132 = 0; var132 < 8; var132++) {
                                    if (var101 == var132) {
                                        var103[var101++] = var111;
                                        break;
                                    }
                                    if (var103[var132] == var111) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            var111 = 0;
                        }
                    }
                    if (var113 == 0 || var92 == var113) {
                        var113 = 0;
                    } else {
                        class291 var133 = class226.method1651(var113 - 1, (byte) 44);
                        if (var133.field4592 && var133.field4588 != -1) {
                            byte var134 = arg0[var88 + 1][var89 + 1];
                            byte var135 = arg1[var88 + 1][var89 + 1];
                            int var136 = class326.field5086[(var134 + 2 & 0x3) + var135 * 4];
                            int var137 = class326.field5086[var135 * 4 + (var134 + 1 & 0x3)];
                            if (class63.field829[var136][1] && class63.field829[var137][0]) {
                                var113 = 0;
                            } else {
                                for (int var138 = 0; var138 < 8; var138++) {
                                    if (var101 == var138) {
                                        var103[var101++] = var113;
                                        break;
                                    }
                                    if (var103[var138] == var113) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            var113 = 0;
                        }
                    }
                    if (var108 != 0 && var92 != var108) {
                        class291 var139 = class226.method1651(var108 - 1, (byte) 78);
                        if (var139.field4592 && var139.field4588 != -1) {
                            var102 = class326.field5086[(arg0[var88][var89 + 1] + 2 & 0x3) + arg1[var88][var89 + 1] * 4];
                            for (int var140 = 0; var140 < 8; var140++) {
                                if (var101 == var140) {
                                    var103[var101++] = var108;
                                    break;
                                }
                                if (var103[var140] == var108) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var107 != 0 && var92 != var107) {
                        class291 var141 = class226.method1651(var107 - 1, (byte) 55);
                        if (var141.field4592 && var141.field4588 != -1) {
                            var104 = class326.field5086[(arg0[var88 - 1][var89] + 3 & 0x3) + arg1[var88 - 1][var89] * 4];
                            for (int var142 = 0; var142 < 8; var142++) {
                                if (var101 == var142) {
                                    var103[var101++] = var107;
                                    break;
                                }
                                if (var103[var142] == var107) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var110 != 0 && var92 != var110) {
                        class291 var143 = class226.method1651(var110 - 1, (byte) 116);
                        if (var143.field4592 && var143.field4588 != -1) {
                            var105 = class326.field5086[arg1[var88][var89 - 1] * 4 + (arg0[var88][var89 - 1] & 0x3)];
                            for (int var144 = 0; var144 < 8; var144++) {
                                if (var101 == var144) {
                                    var103[var101++] = var110;
                                    break;
                                }
                                if (var103[var144] == var110) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var112 != 0 && var92 != var112) {
                        class291 var145 = class226.method1651(var112 - 1, (byte) 98);
                        if (var145.field4592 && var145.field4588 != -1) {
                            var106 = class326.field5086[(arg0[var88 + 1][var89] + 1 & 0x3) + arg1[var88 + 1][var89] * 4];
                            for (int var146 = 0; var146 < 8; var146++) {
                                if (var101 == var146) {
                                    var103[var101++] = var112;
                                    break;
                                }
                                if (var103[var146] == var112) {
                                    break;
                                }
                            }
                        }
                    }
                    for (int var147 = 0; var147 < var101; var147++) {
                        int var148 = var103[var147];
                        boolean[] var149 = class63.field829[var108 == var148 ? var102 : 0];
                        boolean[] var150 = class63.field829[var107 == var148 ? var104 : 0];
                        boolean[] var151 = class63.field829[var110 == var148 ? var105 : 0];
                        boolean[] var152 = class63.field829[var112 == var148 ? var106 : 0];
                        class291 var153 = class226.method1651(var148 - 1, (byte) 70);
                        class83 var154 = class305.method2138(var12, var153, 2);
                        int var155 = class256.method1812(-107, var153.field4586, arg10[var88][var89], var153.field4588) << 8 | 0xFF;
                        byte var156 = 6;
                        int var157 = class256.method1812(-42, var153.field4586, arg10[var88 + 1][var89], var153.field4588) << 8 | 0xFF;
                        int var158 = class256.method1812(-51, var153.field4586, arg10[var88 + 1][var89 + 1], var153.field4588) << 8 | 0xFF;
                        int var159 = class256.method1812(arg11 ^ 0xFFFF80D4, var153.field4586, arg10[var88][var89 + 1], var153.field4588) << 8 | 0xFF;
                        boolean var160 = var109 != var148 && var150[0] && var149[1];
                        boolean var161 = var111 != var148 && var152[0] && var151[1];
                        boolean var162 = var114 != var148 && var151[0] && var150[1];
                        int var163 = var149.length + var156 - 2;
                        boolean var164 = var113 != var148 && var149[0] && var152[1];
                        int var165 = var150.length + var163 - 2;
                        int var166 = var151.length + var165 - 2;
                        int var167 = var152.length + var166 - 2;
                        int[] var168 = new int[var167];
                        byte var169 = 0;
                        int var170 = class341.method2349(arg6, arg5, var88, arg4, (int[][]) null, true, 64, 0.0F, var89, var154, var158, 64, 0, arg9, var155, -1, var159, var157);
                        int var171 = class341.method2349(arg6, arg5, var88, arg4, (int[][]) null, var160, 0, 0.0F, var89, var154, var158, 128, 0, arg9, var155, arg11 - 32581, var159, var157);
                        int var172 = class341.method2349(arg6, arg5, var88, arg4, (int[][]) null, var164, 128, 0.0F, var89, var154, var158, 128, 0, arg9, var155, arg11 ^ 0xFFFF80BB, var159, var157);
                        int var173 = class341.method2349(arg6, arg5, var88, arg4, (int[][]) null, var162, 0, 0.0F, var89, var154, var158, 0, 0, arg9, var155, arg11 ^ 0xFFFF80BB, var159, var157);
                        int var174 = class341.method2349(arg6, arg5, var88, arg4, (int[][]) null, var161, 128, 0.0F, var89, var154, var158, 0, 0, arg9, var155, -1, var159, var157);
                        int var180 = var169 + 1;
                        var168[var169] = var170;
                        var168[var180++] = var172;
                        if (var149.length > 2) {
                            var168[var180++] = class341.method2349(arg6, arg5, var88, arg4, (int[][]) null, var149[2], 64, 0.0F, var89, var154, var158, 128, 0, arg9, var155, -1, var159, var157);
                        }
                        var168[var180++] = var171;
                        if (var150.length > 2) {
                            var168[var180++] = class341.method2349(arg6, arg5, var88, arg4, (int[][]) null, var150[2], 0, 0.0F, var89, var154, var158, 64, 0, arg9, var155, -1, var159, var157);
                        }
                        var168[var180++] = var173;
                        if (var151.length > 2) {
                            var168[var180++] = class341.method2349(arg6, arg5, var88, arg4, (int[][]) null, var151[2], 64, 0.0F, var89, var154, var158, 0, 0, arg9, var155, -1, var159, var157);
                        }
                        var168[var180++] = var174;
                        if (var152.length > 2) {
                            var168[var180++] = class341.method2349(arg6, arg5, var88, arg4, (int[][]) null, var152[2], 128, 0.0F, var89, var154, var158, 64, 0, arg9, var155, -1, var159, var157);
                        }
                        var168[var180++] = var172;
                        var154.method615(var90, var88, var89, var168, (int[]) null, true);
                    }
                }
            }
        }
        for (class83 var175 = (class83) var12.method1746((byte) -33); var175 != null; var175 = (class83) var12.method1749((byte) -68)) {
            if (var175.field1249 == 0) {
                var175.method465((byte) -122);
            } else {
                var175.method611();
            }
        }
        int var176 = var12.method1744(85);
        long[] var177 = new long[var176];
        class83[] var178 = new class83[var176];
        var12.method1752(var178, -72);
        for (int var179 = 0; var179 < var176; var179++) {
            var177[var179] = var178[var179].field916;
        }
        if (arg11 != 32580) {
            field4231 = true;
        }
        class20.method129(125, var178, var177);
        return var178;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(ZI)V", line = 1381)
    private final void method1900(boolean arg0, int arg1) {
        class269.field4246.field3877++;
        class260.field4143 = 0;
        if (!arg0) {
            class269.field4246.field3878 = arg1;
            field4207++;
            class107.field1607 = null;
            class208.field3405 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([BI)V", line = 1399)
    private final void method1901(byte[] arg0, int arg1) {
        field4215++;
        if (arg1 != 1) {
            return;
        }
        class192 var3 = new class192(arg0);
        while (true) {
            int var4 = var3.method1399(-1172389784);
            if (var4 == 0) {
                return;
            }
            if (var4 == 1) {
                int[] var5 = class300.field4685 = new int[6];
                var5[0] = var3.method1396(-57);
                var5[1] = var3.method1396(class35.method228(arg1, -113));
                var5[2] = var3.method1396(class35.method228(arg1, -57));
                var5[3] = var3.method1396(-55);
                var5[4] = var3.method1396(arg1 - 40);
                var5[5] = var3.method1396(-117);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V", line = 1438)
    private final void method1902(byte arg0) {
        if (arg0 > -116) {
            this.method1901((byte[]) null, -34);
        }
        boolean var2 = class269.field4246.method1719((byte) -53);
        field4209++;
        if (!var2) {
            this.method1895(false);
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V", line = 1456)
    public final void method1903(byte arg0) {
        method1907(75);
        class215.method1569((byte) -55);
        field4213++;
        class318.method2218((byte) 62);
        class315.method2192(4);
        class138.method931((byte) -97);
        class287.method2018(89);
        class236.method1686((byte) 44);
        class186.method1301();
        class128.method877(14050);
        class294.method2051(0);
        class334.method2302(true);
        class249.method1761(121);
        class192.method1364(-4);
        class300.method2098(30000);
        class251.method1779(0);
        class114.method789(-88);
        class173.method1187((byte) 0);
        class39.method253(false);
        class194.method1428((byte) 85);
        class176.method1235(-14);
        class222.method1622(false);
        class196.method1437(-116);
        class210.method1532(-122);
        class68.method448(true);
        class160.method1097((byte) -111);
        class103.method728(93);
        class320.method2239((byte) 49);
        class256.method1810(-114);
        class321.method2243(true);
        class246.method1742(0);
        class290.method2037((byte) 43);
        class99.method703(111);
        class175.method1220((byte) -127);
        int var2 = 107 / ((arg0 + 44) / 54);
        class91.method658((byte) 74);
        class336.method2316(658);
        class303.method2127((byte) -11);
        class80.method591((byte) -76);
        class132.method896(88);
        class230.method1662(13566);
        class149.method1056((byte) 49);
        class118.method824(true);
        class224.method1636(124);
        class170.method1161(1643688637);
        class71.method463(-403);
        class330.method2282(-125);
        class48.method340((byte) -116);
        class244.method1730(true);
        class90.method652(-21);
        class188.method1325((byte) 72);
        class233.method1674((byte) -115);
        class331.method2289(-1);
        class136.method922((byte) -6);
        class26.method180((byte) 110);
        class3.method14((byte) 61);
        class297.method2068((byte) -63);
        class121.method842(18775);
        class325.method2261(-76);
        class50.method346(1);
        class199.method1459();
        class261.method1870(57);
        class66.method431(false);
        class239.method1698((byte) 85);
        class308.method2158(256);
        class127.method872(0);
        class109.method750();
        class259.method1833();
        class266.method1889(-45);
        class75.method534();
        class74.method482((byte) 55);
        class76.method558();
        class84.method619(65535);
        class17.method114(0);
        class338.method2329(20);
        class161.method1123(-1);
        class275.method1959();
        class43.method295();
        class324.method2257((byte) -105);
        class168.method1154(false);
        class140.method939((byte) -124);
        class254.method1792((byte) 58);
        class143.method1003();
        class62.method419(-1);
        class340.method2342((byte) -100);
        class316.method2198();
        class41.method286(false);
        class312.method2174((byte) -108);
        class23.method145(66);
        class53.method370();
        class47.method329();
        class277.method1973(-1);
        class64.method429((byte) 27);
        class46.method307((byte) -103);
        class201.method1472(-23211);
        class216.method1582();
        class69.method457(12288);
        class191.method1339((byte) -44);
        class29.method190((byte) 119);
        class111.method775((byte) 100);
        class291.method2041(65535);
        class326.method2264(-110);
        class342.method2356(0);
        class288.method2024(107);
        class305.method2136((byte) -71);
        class60.method417(-128);
        class264.method1883(10);
        class206.method1507((byte) 80);
        class20.method135((byte) 127);
        class341.method2351((byte) -120);
        class147.method1029(-8770);
        class268.method1915();
        class116.method813((byte) 64);
        class280.method1985((byte) 123);
        class89.method642(0);
        class181.method1255(114);
        class281.method1990(87);
        class203.method1488();
        class333.method2299(1);
        class56.method397(0);
        class52.method355(-17151);
        class208.method1522((byte) -123);
        class270.method1924(0);
        class10.method62(true);
        class4.method17((byte) -122);
        class339.method2338((byte) 108);
        class223.method1627();
        class129.method884((byte) -128);
        class25.method170();
        class55.method387((byte) -86);
        class269.method1921(-119);
        class42.method291(8822);
        class163.method1132(-31911);
        class255.method1793(8256);
        class245.method1732(0);
        class212.method1549();
        class21.method141(-48);
        class156.method1086();
        class295.method2058(-107);
        class151.method1058((byte) -119);
        class218.method1599((byte) -28);
        class247.method1756(-36);
        class232.method1671(true);
        class83.method612();
        class271.method1933(1);
        class157.method1090((byte) -111);
        class19.method121(-104);
        class145.method1021(false);
        class49.method344(-126);
        class59.method413((byte) -89);
        class293.method2049(-301);
        class61.method418();
        class343.method2364(true);
        class258.method1826(64);
        class100.method708(0);
        class180.method1247();
        class32.method209();
        class153.method1068();
        class169.method1158(126);
        class81.method601(-90);
        class345.method2388();
        class344.method2384();
        class96.method687();
        class292.method2046(-19969);
        class237.method1688(false);
        class179.method1243(24608);
        class227.method1654(48);
        class197.method1441(false);
        class30.method194((byte) 114);
        class228.method1657(1);
        class285.method2013();
        class31.method197((byte) -103);
        class87.method636(256);
        class200.method1467(-1007);
        class88.method638((byte) 68);
        class282.method1999((byte) -114);
        class40.method276((byte) 123);
        class24.method151(0);
        class18.method120(4);
        class240.method1703(-1);
        class34.method225(-28915);
        class310.method2167(765);
        class296.method2063(-12425);
        class131.method892(-80);
        class92.method667((byte) -7);
        class329.method2275(255);
        class44.method296(89);
        class172.method1174(1);
        class276.method1968(-47);
        class164.method1136(-1);
        class257.method1822();
        class229.method1658((byte) -105);
        class93.method669(-119);
        class5.method21((byte) 110);
        class184.method1269((byte) -21);
        class35.method227(-15225);
        class105.method733((byte) -15);
        class1.method2();
        class273.method1947();
        class98.method696((byte) 127);
        class130.method888((byte) 75);
        class79.method584(13);
        class225.method1647((byte) 16);
        class70.method459();
        class137.method928();
        class238.method1692((byte) -127);
        class45.method305((byte) 86);
        class262.method1873();
        class202.method1475(-115);
        class307.method2149();
        class306.method2145();
        class77.method572(127);
        class337.method2323((byte) -127);
        class16.method110((byte) -124);
        class101.method716(6460);
        class253.method1786((byte) 17);
        class219.method1601((byte) 64);
        class242.method1710(4);
        class241.method1706((byte) 119);
        class12.method71(16711680);
        class309.method2164((byte) 122);
        class187.method1323(false);
        class15.method93((byte) -42);
        class152.method1060(true);
        class124.method862(false);
        class226.method1650(false);
        class22.method144(false);
        class174.method1193(-92);
        class148.method1036(107);
        class284.method2008(1);
        class204.method1502((byte) -99);
        class198.method1448(-84);
        class154.method1071(true);
        class289.method2030(-34);
        class97.method691(10);
        class37.method235((byte) -38);
        class314.method2184((byte) -88);
        class214.method1568((byte) 112);
        class94.method678(8465);
        class302.method2110(123);
        class313.method2176(84);
        class142.method985((byte) -66);
        class193.method1413((byte) 109);
        class250.method1768((byte) -13);
        class8.method53(-88);
        class158.method1092(-91);
        class162.method1126(true);
        class2.method9(0);
        class107.method742(-1);
        class63.method422((byte) 122);
        class58.method406(100);
        class28.method186(106);
        class113.method779((byte) -125);
        class139.method936(-35);
        class27.method184(104);
        class189.method1330((byte) -126);
        class112.method778(false);
        class299.method2087(true);
        class86.method627(2);
        class13.method74((byte) -111);
        class51.method351(112);
        class221.method1607(0);
        class231.method1665(-16651);
        class283.method2002(7);
        class327.method2270(1);
        class209.method1525(-3090);
        class119.method830(-989);
        class323.method2252(-1348706096);
        class115.method800((byte) -4);
        class183.method1261(-1024);
        class36.method233(86);
        class274.method1953(-6);
        class260.method1864(31);
        class95.method679((byte) -102);
        class185.method1272(6);
        class102.method720((byte) 37);
        class182.method1258(1);
        class146.method1028(1862790444);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Lok;IIIIIII)V", line = 1743)
    public static final void method1904(class160[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class160 var9 = arg0[var8];
            if (var9 != null && var9.field2544 == arg1 && (!var9.field2551 || var9.field2608 == 0 || var9.field2568 || method1913(var9).field2725 != 0 || class341.field5315 == var9 || var9.field2461 == 1338) && (!var9.field2551 || !method1896(var9))) {
                int var10 = var9.field2595 + arg6;
                int var11 = var9.field2602 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2608 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else {
                    int var16 = var9.field2458 + var10;
                    int var17 = var9.field2590 + var11;
                    if (var9.field2608 == 9) {
                        var16++;
                        var17++;
                    }
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var16 < arg4 ? var16 : arg4;
                    var15 = var17 < arg5 ? var17 : arg5;
                }
                if (class86.field1296 == var9) {
                    class151.field2316 = true;
                    class15.field179 = var10;
                    class292.field4598 = var11;
                }
                if (!var9.field2551 || var12 < var14 && var13 < var15) {
                    if (var9.field2608 == 0) {
                        if (!var9.field2551 && method1896(var9) && class102.field1564 != var9) {
                            continue;
                        }
                        if (var9.field2508 && class164.field2672 >= var12 && class4.field35 >= var13 && class164.field2672 < var14 && class4.field35 < var15) {
                            for (class247 var18 = (class247) class95.field1459.method1807((byte) 121); var18 != null; var18 = (class247) class95.field1459.method1808(18051)) {
                                if (var18.field3934) {
                                    var18.method465((byte) -122);
                                    var18.field3931.field2617 = false;
                                }
                            }
                            if (class248.field3944 == 0) {
                                class86.field1296 = null;
                                class341.field5315 = null;
                            }
                            class124.field1856 = 0;
                        }
                    }
                    if (var9.field2551) {
                        boolean var19;
                        if (class164.field2672 >= var12 && class4.field35 >= var13 && class164.field2672 < var14 && class4.field35 < var15) {
                            var19 = true;
                        } else {
                            var19 = false;
                        }
                        boolean var20 = false;
                        if (class342.field5335 == 1 && var19) {
                            var20 = true;
                        }
                        boolean var21 = false;
                        if (class303.field4727 == 1 && class221.field3521 >= var12 && class144.field2158 >= var13 && class221.field3521 < var14 && class144.field2158 < var15) {
                            var21 = true;
                        }
                        if (var9.field2498 != null) {
                            for (int var22 = 0; var22 < var9.field2498.length; var22++) {
                                if (class333.field5177[var9.field2498[var22]]) {
                                    if (var9.field2607 == null || class48.field648 >= var9.field2607[var22]) {
                                        byte var23 = var9.field2500[var22];
                                        if (var23 == 0 || ((var23 & 0x8) == 0 || !class333.field5177[86] && !class333.field5177[82] && !class333.field5177[81]) && ((var23 & 0x2) == 0 || class333.field5177[86]) && ((var23 & 0x1) == 0 || class333.field5177[82]) && ((var23 & 0x4) == 0 || class333.field5177[81])) {
                                            class184.method1268(-1, "", var9.field2446, 4, var22 + 1);
                                            int var24 = var9.field2491[var22];
                                            if (var9.field2607 == null) {
                                                var9.field2607 = new int[var9.field2498.length];
                                            }
                                            if (var24 == 0) {
                                                var9.field2607[var22] = Integer.MAX_VALUE;
                                            } else {
                                                var9.field2607[var22] = class48.field648 + var24;
                                            }
                                        }
                                    }
                                } else if (var9.field2607 != null) {
                                    var9.field2607[var22] = 0;
                                }
                            }
                        }
                        if (var21) {
                            class236.method1687((byte) -18, class221.field3521 - var10, var9, class144.field2158 - var11);
                        }
                        if (class86.field1296 != null && class86.field1296 != var9 && var19 && method1913(var9).method1162((byte) -48)) {
                            class27.field397 = var9;
                        }
                        if (class341.field5315 == var9) {
                            class146.field2186 = true;
                            class187.field3044 = var10;
                            class46.field627 = var11;
                        }
                        if (var9.field2568 || var9.field2461 != 0) {
                            if (var19 && class200.field3279 != 0 && var9.field2517 != null) {
                                class247 var25 = new class247();
                                var25.field3934 = true;
                                var25.field3931 = var9;
                                var25.field3938 = class200.field3279;
                                var25.field3925 = var9.field2517;
                                class95.field1459.method1815((byte) 17, var25);
                            }
                            if (class86.field1296 != null || class90.field1374 != null || class19.field274 || var9.field2461 != 1400 && class124.field1856 > 0) {
                                var21 = false;
                                var20 = false;
                                var19 = false;
                            }
                            if (var9.field2461 != 0) {
                                if (var9.field2461 == 1337) {
                                    class339.field5273 = var9;
                                    continue;
                                }
                                if (var9.field2461 == 1338) {
                                    if (var21) {
                                        class107.field1615 = class221.field3521 - var10;
                                        class20.field289 = class144.field2158 - var11;
                                    }
                                    continue;
                                }
                                if (var9.field2461 == 1400) {
                                    class119.field1829 = var9;
                                    if (var21) {
                                        if (class333.field5177[82] && class254.field4033 > 0) {
                                            int var26 = (int) ((double) (class221.field3521 - var10 - var9.field2458 / 2) * 2.0D / (double) class42.field584);
                                            int var27 = (int) ((double) (class144.field2158 - var11 - var9.field2590 / 2) * 2.0D / (double) class42.field584);
                                            int var28 = class242.field3841 + var26;
                                            int var29 = class231.field3698 + var27;
                                            int var30 = class287.field4528 + var28;
                                            int var31 = class331.field5158 + class161.field2636 - var29 - 1;
                                            class318 var32 = class196.method1436(-16199);
                                            int[] var33 = var32.method2210(7696, var30, var31);
                                            if (var33 != null) {
                                                class3.method12((byte) 100, var33[0], var33[1], var33[2]);
                                                class48.method333(0);
                                            }
                                            continue;
                                        }
                                        class124.field1856 = 1;
                                        class160.field2591 = class164.field2672;
                                        class17.field231 = class4.field35;
                                        continue;
                                    }
                                    if (var20 && class124.field1856 > 0) {
                                        if (class124.field1856 == 1 && (class164.field2672 != class160.field2591 || class4.field35 != class17.field231)) {
                                            class125.field1861 = class242.field3841;
                                            class7.field83 = class231.field3698;
                                            class124.field1856 = 2;
                                        }
                                        if (class124.field1856 == 2) {
                                            class51.method349(100, (int) ((double) (class160.field2591 - class164.field2672) * 2.0D / (double) class71.field918) + class125.field1861);
                                            class145.method1018(-54, (int) ((double) (class17.field231 - class4.field35) * 2.0D / (double) class71.field918) + class7.field83);
                                        }
                                        continue;
                                    }
                                    class124.field1856 = 0;
                                    continue;
                                }
                                if (var9.field2461 == 1401) {
                                    if (var20) {
                                        class225.method1644(class164.field2672 - var10, var9.field2590, var9.field2458, class4.field35 - var11, -1);
                                    }
                                    continue;
                                }
                                if (var9.field2461 == 1402) {
                                    if (!class186.field2991) {
                                        class219.method1600(var9, 120);
                                    }
                                    continue;
                                }
                            }
                            if (!var9.field2594 && var21) {
                                var9.field2594 = true;
                                if (var9.field2560 != null) {
                                    class247 var34 = new class247();
                                    var34.field3934 = true;
                                    var34.field3931 = var9;
                                    var34.field3930 = class221.field3521 - var10;
                                    var34.field3938 = class144.field2158 - var11;
                                    var34.field3925 = var9.field2560;
                                    class95.field1459.method1815((byte) 68, var34);
                                }
                            }
                            if (var9.field2594 && var20 && var9.field2512 != null) {
                                class247 var35 = new class247();
                                var35.field3934 = true;
                                var35.field3931 = var9;
                                var35.field3930 = class164.field2672 - var10;
                                var35.field3938 = class4.field35 - var11;
                                var35.field3925 = var9.field2512;
                                class95.field1459.method1815((byte) -123, var35);
                            }
                            if (var9.field2594 && !var20) {
                                var9.field2594 = false;
                                if (var9.field2573 != null) {
                                    class247 var36 = new class247();
                                    var36.field3934 = true;
                                    var36.field3931 = var9;
                                    var36.field3930 = class164.field2672 - var10;
                                    var36.field3938 = class4.field35 - var11;
                                    var36.field3925 = var9.field2573;
                                    class290.field4574.method1815((byte) -125, var36);
                                }
                            }
                            if (var20 && var9.field2528 != null) {
                                class247 var37 = new class247();
                                var37.field3934 = true;
                                var37.field3931 = var9;
                                var37.field3930 = class164.field2672 - var10;
                                var37.field3938 = class4.field35 - var11;
                                var37.field3925 = var9.field2528;
                                class95.field1459.method1815((byte) 79, var37);
                            }
                            if (!var9.field2617 && var19) {
                                var9.field2617 = true;
                                if (var9.field2463 != null) {
                                    class247 var38 = new class247();
                                    var38.field3934 = true;
                                    var38.field3931 = var9;
                                    var38.field3930 = class164.field2672 - var10;
                                    var38.field3938 = class4.field35 - var11;
                                    var38.field3925 = var9.field2463;
                                    class95.field1459.method1815((byte) -4, var38);
                                }
                            }
                            if (var9.field2617 && var19 && var9.field2571 != null) {
                                class247 var39 = new class247();
                                var39.field3934 = true;
                                var39.field3931 = var9;
                                var39.field3930 = class164.field2672 - var10;
                                var39.field3938 = class4.field35 - var11;
                                var39.field3925 = var9.field2571;
                                class95.field1459.method1815((byte) -125, var39);
                            }
                            if (var9.field2617 && !var19) {
                                var9.field2617 = false;
                                if (var9.field2612 != null) {
                                    class247 var40 = new class247();
                                    var40.field3934 = true;
                                    var40.field3931 = var9;
                                    var40.field3930 = class164.field2672 - var10;
                                    var40.field3938 = class4.field35 - var11;
                                    var40.field3925 = var9.field2612;
                                    class290.field4574.method1815((byte) -124, var40);
                                }
                            }
                            if (var9.field2524 != null) {
                                class247 var41 = new class247();
                                var41.field3931 = var9;
                                var41.field3925 = var9.field2524;
                                class323.field5048.method1815((byte) -124, var41);
                            }
                            if (var9.field2592 != null && class77.field1172 > var9.field2623) {
                                if (var9.field2511 == null || class77.field1172 - var9.field2623 > 32) {
                                    class247 var46 = new class247();
                                    var46.field3931 = var9;
                                    var46.field3925 = var9.field2592;
                                    class95.field1459.method1815((byte) 83, var46);
                                } else {
                                    label575: for (int var42 = var9.field2623; var42 < class77.field1172; var42++) {
                                        int var43 = class55.field728[var42 & 0x1F];
                                        for (int var44 = 0; var44 < var9.field2511.length; var44++) {
                                            if (var9.field2511[var44] == var43) {
                                                class247 var45 = new class247();
                                                var45.field3931 = var9;
                                                var45.field3925 = var9.field2592;
                                                class95.field1459.method1815((byte) -125, var45);
                                                break label575;
                                            }
                                        }
                                    }
                                }
                                var9.field2623 = class77.field1172;
                            }
                            if (var9.field2478 != null && class286.field4521 > var9.field2567) {
                                if (var9.field2485 == null || class286.field4521 - var9.field2567 > 32) {
                                    class247 var51 = new class247();
                                    var51.field3931 = var9;
                                    var51.field3925 = var9.field2478;
                                    class95.field1459.method1815((byte) -127, var51);
                                } else {
                                    label551: for (int var47 = var9.field2567; var47 < class286.field4521; var47++) {
                                        int var48 = class31.field436[var47 & 0x1F];
                                        for (int var49 = 0; var49 < var9.field2485.length; var49++) {
                                            if (var9.field2485[var49] == var48) {
                                                class247 var50 = new class247();
                                                var50.field3931 = var9;
                                                var50.field3925 = var9.field2478;
                                                class95.field1459.method1815((byte) -125, var50);
                                                break label551;
                                            }
                                        }
                                    }
                                }
                                var9.field2567 = class286.field4521;
                            }
                            if (var9.field2449 != null && class188.field3053 > var9.field2479) {
                                if (var9.field2439 == null || class188.field3053 - var9.field2479 > 32) {
                                    class247 var56 = new class247();
                                    var56.field3931 = var9;
                                    var56.field3925 = var9.field2449;
                                    class95.field1459.method1815((byte) -127, var56);
                                } else {
                                    label527: for (int var52 = var9.field2479; var52 < class188.field3053; var52++) {
                                        int var53 = class309.field4837[var52 & 0x1F];
                                        for (int var54 = 0; var54 < var9.field2439.length; var54++) {
                                            if (var9.field2439[var54] == var53) {
                                                class247 var55 = new class247();
                                                var55.field3931 = var9;
                                                var55.field3925 = var9.field2449;
                                                class95.field1459.method1815((byte) -26, var55);
                                                break label527;
                                            }
                                        }
                                    }
                                }
                                var9.field2479 = class188.field3053;
                            }
                            if (var9.field2481 != null && class149.field2279 > var9.field2442) {
                                if (var9.field2587 == null || class149.field2279 - var9.field2442 > 32) {
                                    class247 var61 = new class247();
                                    var61.field3931 = var9;
                                    var61.field3925 = var9.field2481;
                                    class95.field1459.method1815((byte) 18, var61);
                                } else {
                                    label503: for (int var57 = var9.field2442; var57 < class149.field2279; var57++) {
                                        int var58 = class35.field465[var57 & 0x1F];
                                        for (int var59 = 0; var59 < var9.field2587.length; var59++) {
                                            if (var9.field2587[var59] == var58) {
                                                class247 var60 = new class247();
                                                var60.field3931 = var9;
                                                var60.field3925 = var9.field2481;
                                                class95.field1459.method1815((byte) 123, var60);
                                                break label503;
                                            }
                                        }
                                    }
                                }
                                var9.field2442 = class149.field2279;
                            }
                            if (var9.field2585 != null && class173.field2750 > var9.field2515) {
                                if (var9.field2556 == null || class173.field2750 - var9.field2515 > 32) {
                                    class247 var66 = new class247();
                                    var66.field3931 = var9;
                                    var66.field3925 = var9.field2585;
                                    class95.field1459.method1815((byte) 94, var66);
                                } else {
                                    label479: for (int var62 = var9.field2515; var62 < class173.field2750; var62++) {
                                        int var63 = class320.field5018[var62 & 0x1F];
                                        for (int var64 = 0; var64 < var9.field2556.length; var64++) {
                                            if (var9.field2556[var64] == var63) {
                                                class247 var65 = new class247();
                                                var65.field3931 = var9;
                                                var65.field3925 = var9.field2585;
                                                class95.field1459.method1815((byte) 84, var65);
                                                break label479;
                                            }
                                        }
                                    }
                                }
                                var9.field2515 = class173.field2750;
                            }
                            if (class323.field5051 > var9.field2545 && var9.field2510 != null) {
                                class247 var67 = new class247();
                                var67.field3931 = var9;
                                var67.field3925 = var9.field2510;
                                class95.field1459.method1815((byte) 117, var67);
                            }
                            if (class93.field1444 > var9.field2545 && var9.field2471 != null) {
                                class247 var68 = new class247();
                                var68.field3931 = var9;
                                var68.field3925 = var9.field2471;
                                class95.field1459.method1815((byte) -2, var68);
                            }
                            if (class338.field5245 > var9.field2545 && var9.field2599 != null) {
                                class247 var69 = new class247();
                                var69.field3931 = var9;
                                var69.field3925 = var9.field2599;
                                class95.field1459.method1815((byte) 22, var69);
                            }
                            if (class293.field4607 > var9.field2545 && var9.field2530 != null) {
                                class247 var70 = new class247();
                                var70.field3931 = var9;
                                var70.field3925 = var9.field2530;
                                class95.field1459.method1815((byte) -123, var70);
                            }
                            if (class35.field471 > var9.field2545 && var9.field2526 != null) {
                                class247 var71 = new class247();
                                var71.field3931 = var9;
                                var71.field3925 = var9.field2526;
                                class95.field1459.method1815((byte) 67, var71);
                            }
                            var9.field2545 = class297.field4655;
                            if (var9.field2614 != null) {
                                for (int var72 = 0; var72 < class99.field1503; var72++) {
                                    class247 var73 = new class247();
                                    var73.field3931 = var9;
                                    var73.field3936 = class88.field1334[var72];
                                    var73.field3932 = class184.field2966[var72];
                                    var73.field3925 = var9.field2614;
                                    class95.field1459.method1815((byte) -128, var73);
                                }
                            }
                            if (class113.field1696 && var9.field2523 != null) {
                                class247 var74 = new class247();
                                var74.field3931 = var9;
                                var74.field3925 = var9.field2523;
                                class95.field1459.method1815((byte) 88, var74);
                            }
                        }
                    }
                    if (!var9.field2551 && class86.field1296 == null && class90.field1374 == null && !class19.field274) {
                        if ((var9.field2576 >= 0 || var9.field2455 != 0) && class164.field2672 >= var12 && class4.field35 >= var13 && class164.field2672 < var14 && class4.field35 < var15) {
                            if (var9.field2576 >= 0) {
                                class102.field1564 = arg0[var9.field2576];
                            } else {
                                class102.field1564 = var9;
                            }
                        }
                        if (var9.field2608 == 8 && class164.field2672 >= var12 && class4.field35 >= var13 && class164.field2672 < var14 && class4.field35 < var15) {
                            class242.field3840 = var9;
                        }
                        if (var9.field2495 > var9.field2590) {
                            class158.method1093(var11, var9, var9.field2458 + var10, var9.field2495, class164.field2672, var9.field2590, class4.field35, (byte) -113);
                        }
                    }
                    if (var9.field2608 == 0) {
                        method1904(arg0, var9.field2446, var12, var13, var14, var15, var10 - var9.field2466, var11 - var9.field2472);
                        if (var9.field2459 != null) {
                            method1904(var9.field2459, var9.field2446, var12, var13, var14, var15, var10 - var9.field2466, var11 - var9.field2472);
                        }
                        class224 var75 = (class224) class176.field2870.method1743((long) var9.field2446, (byte) 110);
                        if (var75 != null) {
                            class44.method298(var12, var13, var15, (byte) 80, var75.field3564, var11, var14, var10);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V", line = 2515)
    private final void method1905(int arg0) {
        for (class99.field1503 = 0; class235.method1681((byte) 105) && class99.field1503 < 128; class99.field1503++) {
            class88.field1334[class99.field1503] = class289.field4561;
            class184.field2966[class99.field1503] = class21.field323;
        }
        class274.field4353++;
        if (class246.field3904 != -1) {
            class44.method298(0, 0, class210.field3432, (byte) -37, class246.field3904, 0, class160.field2601, 0);
        }
        field4225++;
        class297.field4655++;
        if (class186.field2991) {
            int var2 = 2359807;
            label201: for (int var3 = 0; var3 < 32768; var3++) {
                class196 var4 = class297.field4657[var3];
                if (var4 != null) {
                    byte var5 = var4.field3210.field1811;
                    if ((var5 & 0x2) > 0 && var4.field1951 == 0 && Math.random() * 1000.0D < 10.0D) {
                        int var6 = (int) Math.round(Math.random() * 2.0D - 1.0D);
                        int var7 = (int) Math.round(Math.random() * 2.0D - 1.0D);
                        if (var6 != 0 || var7 != 0) {
                            var4.field1969[0] = (var4.field1980 >> 7) + var6;
                            var4.field1972[0] = 1;
                            var4.field2006[0] = (var4.field1944 >> 7) + var7;
                            class50.field685[class148.field2209].method445(var4.method910(-1), var4.method910(arg0 - 1740), (byte) 101, var4.field1944 >> 7, var4.field1980 >> 7, false, false, 0);
                            if (var4.field1969[0] >= 0 && var4.field1969[0] <= (104 - var4.method910(-1)) && var4.field2006[0] >= 0 && var4.field2006[0] <= (104 - var4.method910(-1)) && class50.field685[class148.field2209].method451(var4.field2006[0], var4.field1980 >> 7, var4.field1969[0], var4.field1944 >> 7, arg0 ^ 0xFFFFF95C)) {
                                if (var4.method910(arg0 ^ -1740) > 1) {
                                    for (int var8 = var4.field1969[0]; var4.field1969[0] + var4.method910(-1) > var8; var8++) {
                                        for (int var9 = var4.field2006[0]; var4.field2006[0] + var4.method910(-1) > var9; var9++) {
                                            if ((class50.field685[class148.field2209].field889[var8][var9] & var2) != 0) {
                                                continue label201;
                                            }
                                        }
                                    }
                                }
                                var4.field1951 = 1;
                            }
                        }
                    }
                    class170.method1159(arg0 ^ 0xFFFFF834, var4);
                    class299.method2086(var4, (byte) -30);
                    class246.method1753(arg0 ^ 0xFFFFF5FA, var4);
                    class50.field685[class148.field2209].method452(var4.method910(-1), var4.field1980 >> 7, (byte) 112, false, var4.field1944 >> 7, false, var4.method910(-1));
                }
            }
        }
        if (!class186.field2991 && class20.field290 == 0) {
            class318.method2212(1);
        } else if (class105.field1585 == 0 && class329.field5116 == 0) {
            if (class282.field4461 == 2) {
                class254.method1790(1);
            } else {
                class118.method821((byte) 54);
            }
            if (class74.field983 >> 7 < 14 || class74.field983 >> 7 >= 90 || (class27.field388 >> 7) < 14 || class27.field388 >> 7 >= 90) {
                class128.method878(true);
            }
        }
        while (true) {
            class247 var10;
            class160 var11;
            class160 var12;
            do {
                var10 = (class247) class323.field5048.method1814(-30321);
                if (var10 == null) {
                    while (true) {
                        class247 var13;
                        class160 var17;
                        class160 var18;
                        do {
                            var13 = (class247) class290.field4574.method1814(arg0 ^ 0xFFFF8F44);
                            if (var13 == null) {
                                while (true) {
                                    class247 var14;
                                    class160 var15;
                                    class160 var16;
                                    do {
                                        var14 = (class247) class95.field1459.method1814(arg0 ^ 0xFFFF8F44);
                                        if (var14 == null) {
                                            if (class86.field1296 != null) {
                                                class128.method875(1);
                                            }
                                            if (class240.field3791 != null && class240.field3791.field3488 == 1) {
                                                if (class240.field3791.field3490 != null) {
                                                    class60.method415(class42.field582, class38.field504, (byte) 125);
                                                }
                                                class240.field3791 = null;
                                                class42.field582 = null;
                                                class38.field504 = false;
                                            }
                                            if (class48.field648 % 1500 == 0) {
                                                class114.method795(18);
                                            }
                                            if (arg0 != 1739) {
                                                method1906((byte) 18);
                                            }
                                            return;
                                        }
                                        var15 = var14.field3931;
                                        if (var15.field2456 < 0) {
                                            break;
                                        }
                                        var16 = class37.method238((byte) -95, var15.field2544);
                                    } while (var16 == null || var16.field2459 == null || var15.field2456 >= var16.field2459.length || var16.field2459[var15.field2456] != var15);
                                    class69.method455(var14, (byte) -64);
                                }
                            }
                            var17 = var13.field3931;
                            if (var17.field2456 < 0) {
                                break;
                            }
                            var18 = class37.method238((byte) -79, var17.field2544);
                        } while (var18 == null || var18.field2459 == null || var17.field2456 >= var18.field2459.length || var18.field2459[var17.field2456] != var17);
                        class69.method455(var13, (byte) -64);
                    }
                }
                var11 = var10.field3931;
                if (var11.field2456 < 0) {
                    break;
                }
                var12 = class37.method238((byte) -109, var11.field2544);
            } while (var12 == null || var12.field2459 == null || var11.field2456 >= var12.field2459.length || var12.field2459[var11.field2456] != var11);
            class69.method455(var10, (byte) -64);
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(B)I", line = 2733)
    public static final int method1906(byte arg0) {
        field4206++;
        if ((double) class71.field918 == 3.0D) {
            return 37;
        } else if ((double) class71.field918 == 4.0D) {
            return 50;
        } else {
            if (arg0 > -23) {
                method1899((byte[][]) ((byte[][]) null), (byte[][]) ((byte[][]) null), -58, (byte[][]) ((byte[][]) null), (float[][]) ((float[][]) null), (float[][]) ((float[][]) null), (float[][]) ((float[][]) null), (byte[][]) ((byte[][]) null), (byte[][][]) ((byte[][][]) null), (int[][]) ((int[][]) null), (int[][]) ((int[][]) null), 94);
            }
            if ((double) class71.field918 == 6.0D) {
                return 75;
            } else if ((double) class71.field918 == 8.0D) {
                return 100;
            } else {
                return 200;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V", line = 2759)
    public static void method1907(int arg0) {
        field4229 = null;
        if (arg0 != 75) {
            method1899((byte[][]) ((byte[][]) null), (byte[][]) ((byte[][]) null), -95, (byte[][]) ((byte[][]) null), (float[][]) ((float[][]) null), (float[][]) ((float[][]) null), (float[][]) ((float[][]) null), (byte[][]) ((byte[][]) null), (byte[][][]) ((byte[][][]) null), (int[][]) ((int[][]) null), (int[][]) ((int[][]) null), 19);
        }
        field4228 = null;
        field4218 = null;
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V", line = 2777)
    public final void init() {
        field4210++;
        if (!this.method2231(47)) {
            return;
        }
        class140.field2090 = Integer.parseInt(this.getParameter("worldid"));
        class71.field917 = Integer.parseInt(this.getParameter("modewhere"));
        if (class71.field917 < 0 || class71.field917 > 1) {
            class71.field917 = 0;
        }
        class60.field790 = Integer.parseInt(this.getParameter("modewhat"));
        if (class60.field790 < 0 || class60.field790 > 2) {
            class60.field790 = 0;
        }
        String var1 = this.getParameter("advertsuppressed");
        if (var1 != null && var1.equals("1")) {
            class152.field2329 = true;
        } else {
            class152.field2329 = false;
        }
        try {
            class136.field2054 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var12) {
            class136.field2054 = 0;
        }
        class157.method1088(class136.field2054, true);
        String var3 = this.getParameter("objecttag");
        if (var3 != null && var3.equals("1")) {
            class242.field3844 = true;
        } else {
            class242.field3844 = false;
        }
        String var4 = this.getParameter("js");
        if (var4 != null && var4.equals("1")) {
            class114.field1706 = true;
        } else {
            class114.field1706 = false;
        }
        String var5 = this.getParameter("game");
        if (var5 != null && var5.equals("1")) {
            class20.field290 = 1;
        } else {
            class20.field290 = 0;
        }
        try {
            class240.field3807 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var11) {
            class240.field3807 = 0;
        }
        class147.field2204 = this.getParameter("settings");
        if (class147.field2204 == null) {
            class147.field2204 = "";
        }
        String var7 = this.getParameter("country");
        if (var7 != null) {
            try {
                class231.field3701 = Integer.parseInt(var7);
            } catch (Exception var10) {
                class231.field3701 = 0;
            }
        }
        String var9 = this.getParameter("haveie6");
        if (var9 != null && var9.equals("1")) {
            class107.field1608 = true;
        } else {
            class107.field1608 = false;
        }
        class320.field4997 = this;
        this.method2223(class60.field790 + 32, 503, 765, 1545, -122);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V", line = 2861)
    public final void method1908(int arg0) {
        class50.method348(2);
        class30.field425 = new class251();
        class269.field4246 = new class243();
        field4226++;
        if (class60.field790 != 0) {
            class242.field3843 = new byte[50][];
        }
        class68.method444(class264.field4183, (byte) -45);
        if (class71.field917 == 0) {
            class214.field3472 = this.getCodeBase().getHost();
            class329.field5119 = 443;
            class124.field1858 = 43594;
        } else if (class71.field917 == 1) {
            class214.field3472 = this.getCodeBase().getHost();
            class124.field1858 = class140.field2090 + 40000;
            class329.field5119 = class140.field2090 + 50000;
        } else if (class71.field917 == 2) {
            class329.field5119 = class140.field2090 + 50000;
            class124.field1858 = class140.field2090 + 40000;
            class214.field3472 = "127.0.0.1";
        }
        class130.field1920 = class329.field5119;
        class246.field3908 = class214.field3472;
        class326.field5089 = class124.field1858;
        if (class6.field62 == 3 && class71.field917 != 2) {
            class94.field1452 = class140.field2090;
        }
        if (class20.field290 == 1) {
            class12.field146 = true;
            class92.field1426 = class34.field446;
            class204.field3329 = class39.field552;
            class20.field305 = class182.field2943;
            class109.field1628 = 0;
            class109.field1632 = 16777215;
            class299.field4664 = class2.field10;
        } else {
            class20.field305 = class113.field1699;
            class204.field3329 = class60.field791;
            class299.field4664 = class140.field2093;
            class92.field1426 = class132.field2039;
        }
        class206.field3366 = class326.field5089;
        class127.field1890 = class124.field1858;
        class49.field673 = class308.field4820 = class45.field613 = class5.field58 = new short[256];
        class282.method1995(188);
        class291.method2040(class338.field5247, (byte) -120);
        class261.method1867(class338.field5247, true);
        if (arg0 != 1) {
            return;
        }
        class238.field3771 = class305.method2133((byte) -13);
        if (class238.field3771 != null) {
            class238.field3771.method403(class338.field5247, -1);
        }
        class236.field3741 = class6.field62;
        try {
            if (class264.field4183.field82 != null) {
                class100.field1527 = new class194(class264.field4183.field82, 5200, 0);
                for (int var2 = 0; var2 < 29; var2++) {
                    class313.field4873[var2] = new class194(class264.field4183.field66[var2], 6000, 0);
                }
                class127.field1891 = new class194(class264.field4183.field73, 6000, 0);
                class152.field2330 = new class176(255, class100.field1527, class127.field1891, 500000);
                class145.field2178 = new class194(class264.field4183.field69, 24, 0);
                class264.field4183.field66 = null;
                class264.field4183.field69 = null;
                class264.field4183.field82 = null;
                class264.field4183.field73 = null;
            }
        } catch (IOException var4) {
            class100.field1527 = null;
            class127.field1891 = null;
            class145.field2178 = null;
            class152.field2330 = null;
        }
        class292.field4596 = class294.field4622;
        if (class71.field917 != 0) {
            class305.field4762 = true;
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V", line = 2977)
    public final void method1909(byte arg0) {
        field4214++;
        if (class144.field2159 == 1000) {
            return;
        }
        long var2 = class209.method1527(1) / 1000000L - class282.field4445;
        class282.field4445 = class209.method1527(1) / 1000000L;
        boolean var4 = class338.method2328(29788);
        if (var4 && class334.field5181 && class154.field2355 != null) {
            class154.field2355.method653(-123);
        }
        if ((class144.field2159 == 30 || class144.field2159 == 10) && (class309.field4825 || class166.field2690 != 0L && class304.method2128((byte) -66) > class166.field2690)) {
            class201.method1471(class309.field4825, class198.field3256, class60.method416(-86), class80.field1213, false);
        }
        if (class113.field1688 == null) {
            Container var5;
            if (class113.field1688 != null) {
                var5 = class113.field1688;
            } else if (class161.field2635 == null) {
                var5 = class264.field4183.field68;
            } else {
                var5 = class161.field2635;
            }
            int var6 = var5.getSize().width;
            int var7 = var5.getSize().height;
            if (class161.field2635 == var5) {
                Insets var8 = class161.field2635.getInsets();
                var7 -= var8.top + var8.bottom;
                var6 -= var8.right + var8.left;
            }
            if (class71.field910 != var6 || class35.field460 != var7) {
                if (class6.field65.startsWith("mac")) {
                    class71.field910 = var6;
                    class35.field460 = var7;
                } else {
                    class50.method348(2);
                }
                class166.field2690 = class304.method2128((byte) -72) + 500L;
            }
        }
        boolean var9 = false;
        if (class113.field1688 != null && !class254.field4029 && (class144.field2159 == 30 || class144.field2159 == 10)) {
            class201.method1471(false, -1, class49.field674, -1, false);
        }
        if (class300.field4697) {
            class300.field4697 = false;
            var9 = true;
        }
        if (var9) {
            class80.method589((byte) -114);
        }
        if (class186.field2991) {
            for (int var10 = 0; var10 < 100; var10++) {
                class284.field4485[var10] = true;
            }
        }
        if (class144.field2159 == 0) {
            class330.method2280((byte) 91, class50.field689, var9, (Color) null, class74.field992);
        } else if (class144.field2159 == 5) {
            class139.method935(false, (byte) -86, class55.field732);
        } else if (class144.field2159 == 10) {
            class168.method1155((byte) -88);
        } else if (class144.field2159 == 25 || class144.field2159 == 28) {
            if (class282.field4456 == 1) {
                if (class329.field5109 > class242.field3838) {
                    class242.field3838 = class329.field5109;
                }
                int var12 = (class242.field3838 - class329.field5109) * 50 / class242.field3838;
                class303.method2126(false, class288.field4533 + "<br>(" + var12 + "%)", -13);
            } else if (class282.field4456 == 2) {
                if (class295.field4634 > class254.field4035) {
                    class254.field4035 = class295.field4634;
                }
                int var11 = (class254.field4035 - class295.field4634) * 50 / class254.field4035 + 50;
                class303.method2126(false, class288.field4533 + "<br>(" + var11 + "%)", -12);
            } else {
                class303.method2126(false, class288.field4533, -21);
            }
        } else if (class144.field2159 == 30) {
            class45.method302((byte) 126, var2);
        } else if (class144.field2159 == 40) {
            class303.method2126(false, class105.field1588 + "<br>" + class5.field56, -93);
        }
        if (class186.field2991 && class144.field2159 != 0) {
            class186.method1277();
            for (int var19 = 0; var19 < class140.field2086; var19++) {
                class237.field3748[var19] = false;
            }
        } else if ((class144.field2159 == 30 || class144.field2159 == 10) && class330.field5148 == 0 && !var9) {
            try {
                Graphics var16 = class338.field5247.getGraphics();
                for (int var17 = 0; var17 < class140.field2086; var17++) {
                    if (class237.field3748[var17]) {
                        class289.field4563.method221(class48.field647[var17], class210.field3433[var17], class283.field4466[var17], var16, class192.field3135[var17], (byte) 99);
                        class237.field3748[var17] = false;
                    }
                }
            } catch (Exception var20) {
                class338.field5247.repaint();
            }
        } else if (class144.field2159 != 0) {
            try {
                Graphics var13 = class338.field5247.getGraphics();
                class289.field4563.method222(var13, 0, 0, 69);
                for (int var14 = 0; var14 < class140.field2086; var14++) {
                    class237.field3748[var14] = false;
                }
            } catch (Exception var21) {
                class338.field5247.repaint();
            }
        }
        if (arg0 >= -6) {
            this.method1897((byte) 22);
        }
        if (class48.field663) {
            class78.method579(46);
        }
        if (class27.field390 && class144.field2159 == 10 && class246.field3904 != -1) {
            class27.field390 = false;
            class255.method1794(150, class264.field4183);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V", line = 3203)
    public static final void method1910(int arg0, int arg1) {
        if (arg0 == 1) {
            field4211++;
            class124.field1855 = (class318) class225.field3581.method1743((long) arg1, (byte) -107);
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V", line = 3214)
    public final void method1911(int arg0) {
        field4217++;
        if (class144.field2159 == 1000) {
            return;
        }
        class48.field648++;
        if ((class48.field648 % 1000) == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class331.field5157 = var2.get(11) * 600 + (var2.get(12) * 10) + (var2.get(13) / 6);
            class58.field753.setSeed((long) class331.field5157);
        }
        this.method1902((byte) -122);
        if (class12.field142 != null) {
            class12.field142.method796((byte) -119);
        }
        class189.method1333((byte) 112);
        class40.method279(25259);
        class244.method1731(79);
        if (arg0 != -6) {
            field4228 = (String) null;
        }
        class158.method1095(true);
        if (class186.field2991) {
            class275.method1960();
        }
        if (class238.field3771 != null) {
            int var3 = class238.field3771.method402((byte) -108);
            class200.field3279 = var3;
        }
        if (class144.field2159 == 0) {
            this.method1912((byte) -38);
            class170.method1167((byte) 106);
        } else if (class144.field2159 == 5) {
            this.method1912((byte) -38);
            class170.method1167((byte) -98);
        } else if (class144.field2159 == 25 || class144.field2159 == 28) {
            class18.method117((byte) -115);
        }
        if (class144.field2159 == 10) {
            this.method1905(1739);
            class103.method727(0);
            class111.method766(-3817);
            class242.method1711((byte) -74);
        } else if (class144.field2159 == 30) {
            class264.method1884(arg0 + 40);
        } else if (class144.field2159 == 40) {
            class242.method1711((byte) -113);
            if (class80.field1205 != -3) {
                if (class80.field1205 == 15) {
                    class113.method783(1);
                } else if (class80.field1205 != 2) {
                    class321.method2246((byte) -128);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(B)V", line = 3305)
    private final void method1912(byte arg0) {
        if (!class27.field390) {
            label246: while (true) {
                do {
                    if (!class235.method1681((byte) 118)) {
                        break label246;
                    }
                } while (class21.field323 != 's' && class21.field323 != 'S');
                class27.field390 = true;
            }
        }
        field4208++;
        if (class90.field1368 == 0) {
            Runtime var26 = Runtime.getRuntime();
            int var27 = (int) ((var26.totalMemory() - var26.freeMemory()) / 1024L);
            long var28 = class304.method2128((byte) -123);
            if (class102.field1563 == 0L) {
                class102.field1563 = var28;
            }
            if (var27 > 16384 && var28 - class102.field1563 < 5000L) {
                if ((var28 - class297.field4654) > 1000L) {
                    System.gc();
                    class297.field4654 = var28;
                }
                class50.field689 = class253.field4026;
                class74.field992 = 5;
            } else {
                class50.field689 = class93.field1435;
                class74.field992 = 5;
                class90.field1368 = 10;
            }
        } else if (arg0 == -38) {
            if (class90.field1368 == 10) {
                class47.method316(4, 104, 104);
                for (int var2 = 0; var2 < 4; var2++) {
                    class50.field685[var2] = new class68(104, 104);
                }
                class74.field992 = 10;
                class50.field689 = class24.field341;
                class90.field1368 = 30;
            } else if (class90.field1368 == 30) {
                if (class12.field142 == null) {
                    class12.field142 = new class114(class269.field4246, class30.field425);
                }
                if (class12.field142.method794(false)) {
                    class261.field4158 = class218.method1597(0, 26750, true, false, true);
                    class66.field865 = class218.method1597(1, 26750, true, false, true);
                    class8.field89 = class218.method1597(2, arg0 ^ 0xFFFF97A4, true, true, false);
                    class189.field3077 = class218.method1597(3, 26750, true, false, true);
                    class35.field469 = class218.method1597(4, 26750, true, false, true);
                    class239.field3775 = class218.method1597(5, 26750, true, true, true);
                    class139.field2077 = class218.method1597(6, 26750, false, true, true);
                    class182.field2946 = class218.method1597(7, 26750, true, false, true);
                    class149.field2248 = class218.method1597(8, 26750, true, false, true);
                    class337.field5236 = class218.method1597(9, arg0 ^ 0xFFFF97A4, true, false, true);
                    class283.field4465 = class218.method1597(10, 26750, true, false, true);
                    class187.field3043 = class218.method1597(11, 26750, true, false, true);
                    class305.field4757 = class218.method1597(12, arg0 ^ 0xFFFF97A4, true, false, true);
                    class121.field1841 = class218.method1597(13, 26750, true, false, true);
                    class204.field3328 = class218.method1597(14, 26750, false, false, true);
                    class107.field1618 = class218.method1597(15, arg0 ^ 0xFFFF97A4, true, false, true);
                    class63.field832 = class218.method1597(16, 26750, true, false, true);
                    class256.field4062 = class218.method1597(17, arg0 ^ 0xFFFF97A4, true, false, true);
                    class40.field558 = class218.method1597(18, 26750, true, false, true);
                    class314.field4898 = class218.method1597(19, 26750, true, false, true);
                    class34.field458 = class218.method1597(20, 26750, true, false, true);
                    class62.field820 = class218.method1597(21, 26750, true, false, true);
                    class5.field57 = class218.method1597(22, 26750, true, false, true);
                    class42.field588 = class218.method1597(23, 26750, true, true, true);
                    class20.field295 = class218.method1597(24, arg0 ^ 0xFFFF97A4, true, false, true);
                    class17.field234 = class218.method1597(25, 26750, true, false, true);
                    class204.field3333 = class218.method1597(26, 26750, true, true, true);
                    class163.field2660 = class218.method1597(27, 26750, true, false, true);
                    class215.field3477 = class218.method1597(28, 26750, true, true, true);
                    class50.field689 = class93.field1441;
                    class74.field992 = 15;
                    class90.field1368 = 40;
                } else {
                    class50.field689 = class98.field1491;
                    class74.field992 = 12;
                }
            } else if (class90.field1368 == 40) {
                int var24 = 0;
                for (int var25 = 0; var25 < 29; var25++) {
                    var24 += class34.field457[var25].method1179((byte) -37) * class147.field2206[var25] / 100;
                }
                if (var24 == 100) {
                    class74.field992 = 20;
                    class50.field689 = class46.field625;
                    class245.method1733(class149.field2248, -13946);
                    class283.method2006(class149.field2248, arg0 + 22261);
                    class274.method1952((byte) -91, class149.field2248);
                    class90.field1368 = 41;
                } else {
                    class74.field992 = 20;
                    if (var24 != 0) {
                        class50.field689 = class103.field1581 + var24 + "%";
                    }
                }
            } else if (class90.field1368 == 41) {
                if (class215.field3477.method244((byte) -97)) {
                    this.method1901(class215.field3477.method274((byte) -107, 1), 1);
                    class74.field992 = 25;
                    class50.field689 = class26.field378;
                    class90.field1368 = 45;
                } else {
                    class50.field689 = class28.field401 + class215.field3477.method262(arg0 + 37) + "%";
                    class74.field992 = 25;
                }
            } else if (class90.field1368 == 45) {
                class333.method2298(22050, (byte) 109, 2, class56.field739);
                class160.field2506 = new class175();
                class160.field2506.method1230(9, 128, 0);
                class154.field2355 = class183.method1262(22050, class338.field5247, arg0 ^ 0xFFFFCB28, 0, class264.field4183);
                class154.field2355.method659(class160.field2506, (byte) 14);
                class111.method774(class204.field3328, class107.field1618, class160.field2506, -115, class35.field469);
                class296.field4640 = class183.method1262(2048, class338.field5247, 13554, 1, class264.field4183);
                class107.field1622 = new class106();
                class296.field4640.method659(class107.field1622, (byte) 10);
                class200.field3287 = new class336(22050, class264.field4185);
                class172.field2737 = class139.field2077.method266(arg0 - 60, "scape main");
                class74.field992 = 30;
                class90.field1368 = 50;
                class50.field689 = class291.field4593;
            } else if (class90.field1368 == 50) {
                int var22 = class224.method1637(class121.field1841, 5802, class149.field2248);
                int var23 = class323.method2255(75);
                if (var22 >= var23) {
                    class90.field1368 = 60;
                    class50.field689 = class232.field3714;
                    class74.field992 = 35;
                } else {
                    class50.field689 = class98.field1496 + var22 * 100 / var23 + "%";
                    class74.field992 = 35;
                }
            } else if (class90.field1368 == 60) {
                int var3 = class206.method1504(class149.field2248, 0);
                int var4 = class343.method2366(-20854);
                if (var3 >= var4) {
                    class90.field1368 = 65;
                    class50.field689 = class326.field5081;
                    class74.field992 = 40;
                } else {
                    class50.field689 = class224.field3567 + var3 * 100 / var4 + "%";
                    class74.field992 = 40;
                }
            } else if (class90.field1368 == 65) {
                class263.method1878(class121.field1841, class149.field2248, (byte) -128);
                class50.field689 = class84.field1277;
                class74.field992 = 45;
                class173.method1180(5, 65280);
                class90.field1368 = 70;
            } else if (class90.field1368 == 70) {
                class8.field89.method244((byte) -113);
                byte var10 = 0;
                int var11 = var10 + class8.field89.method262(-1);
                class63.field832.method244((byte) -111);
                int var12 = var11 + class63.field832.method262(arg0 + 37);
                class256.field4062.method244((byte) -95);
                int var13 = var12 + class256.field4062.method262(-1);
                class40.field558.method244((byte) -122);
                int var14 = var13 + class40.field558.method262(-1);
                class314.field4898.method244((byte) -118);
                int var15 = var14 + class314.field4898.method262(-1);
                class34.field458.method244((byte) -98);
                int var16 = var15 + class34.field458.method262(-1);
                class62.field820.method244((byte) -82);
                int var17 = var16 + class62.field820.method262(-1);
                class5.field57.method244((byte) -98);
                int var18 = var17 + class5.field57.method262(arg0 + 37);
                class20.field295.method244((byte) -112);
                int var19 = var18 + class20.field295.method262(-1);
                class17.field234.method244((byte) -111);
                int var20 = var19 + class17.field234.method262(arg0 + 37);
                class163.field2660.method244((byte) -106);
                int var21 = var20 + class163.field2660.method262(-1);
                if (var21 < 1100) {
                    class50.field689 = class51.field697 + var21 / 11 + "%";
                    class74.field992 = 50;
                } else {
                    class63.method427(class8.field89, 4096);
                    class255.method1795(class8.field89, (byte) -96);
                    class115.method801(1, class8.field89);
                    class214.method1560(class182.field2946, (byte) -126, class8.field89);
                    class209.method1524(true, (byte) -70, class63.field832, class182.field2946);
                    class196.method1435(arg0 + 37, class40.field558, class182.field2946);
                    class91.method657(class314.field4898, true, class250.field3984, true, class182.field2946);
                    class138.method932(class8.field89, -122);
                    class38.method240(class66.field865, class34.field458, false, class261.field4158);
                    class91.method663((byte) -128, class8.field89);
                    class198.method1444(class182.field2946, arg0 ^ 0x43, class62.field820);
                    class19.method123(-18, class5.field57);
                    class242.method1712(class8.field89, (byte) -120);
                    class222.method1618(class121.field1841, class189.field3077, 13255, class149.field2248, class182.field2946);
                    class99.method698(class8.field89, 0);
                    class84.method620((byte) 109, class256.field4062);
                    class148.method1034(class17.field234, new class89(), class20.field295, 96);
                    class233.method1676(class17.field234, 0, class20.field295);
                    class282.method1998((byte) 105, class8.field89);
                    class293.method2050((byte) -127, class8.field89);
                    class334.method2305((byte) 20, class8.field89);
                    class331.method2287((byte) 43, class149.field2248, class8.field89);
                    class315.method2193(class149.field2248, class8.field89, -10);
                    class74.field992 = 50;
                    class50.field689 = class77.field1169;
                    class233.method1677(-121);
                    class90.field1368 = 80;
                }
            } else if (class90.field1368 == 80) {
                int var5 = class78.method575(class149.field2248, arg0 - 69);
                int var6 = class149.method1045(127);
                if (var6 <= var5) {
                    class114.method787(class149.field2248, true);
                    class50.field689 = class288.field4536;
                    class74.field992 = 60;
                    class90.field1368 = 90;
                } else {
                    class74.field992 = 60;
                    class50.field689 = class3.field26 + var5 * 100 / var6 + "%";
                }
            } else if (class90.field1368 == 90) {
                if (class204.field3333.method244((byte) -117)) {
                    class270 var9 = new class270(class337.field5236, class204.field3333, class149.field2248, 20, !class175.field2791);
                    class25.method156(var9);
                    if (class91.field1404 == 1) {
                        class25.method174(0.9F);
                    }
                    if (class91.field1404 == 2) {
                        class25.method174(0.8F);
                    }
                    if (class91.field1404 == 3) {
                        class25.method174(0.7F);
                    }
                    if (class91.field1404 == 4) {
                        class25.method174(0.6F);
                    }
                    class50.field689 = class113.field1687;
                    class90.field1368 = 100;
                    class74.field992 = 70;
                } else {
                    class50.field689 = class37.field494 + class204.field3333.method262(-1) + "%";
                    class74.field992 = 70;
                }
            } else if (class90.field1368 == 100) {
                if (class219.method1602(class149.field2248, -1)) {
                    class90.field1368 = 110;
                }
            } else if (class90.field1368 == 110) {
                class331.field5160 = new class334();
                class264.field4183.method40(10, class331.field5160, -66);
                class50.field689 = class314.field4886;
                class74.field992 = 75;
                class90.field1368 = 120;
            } else if (class90.field1368 == 120) {
                if (class283.field4465.method255((byte) 41, "huffman", "")) {
                    class55 var7 = new class55(class283.field4465.method258(-23260, "huffman", ""));
                    class234.method1678(var7, 69);
                    class74.field992 = 80;
                    class50.field689 = class44.field598;
                    class90.field1368 = 130;
                } else {
                    class50.field689 = class91.field1407 + "0%";
                    class74.field992 = 80;
                }
            } else if (class90.field1368 == 130) {
                if (!class189.field3077.method244((byte) -111)) {
                    class50.field689 = class242.field3847 + class189.field3077.method262(arg0 + 37) * 3 / 4 + "%";
                    class74.field992 = 85;
                } else if (!class305.field4757.method244((byte) -93)) {
                    class50.field689 = class242.field3847 + (class305.field4757.method262(-1) / 10 + 75) + "%";
                    class74.field992 = 85;
                } else if (!class121.field1841.method244((byte) -110)) {
                    class50.field689 = class242.field3847 + (class121.field1841.method262(arg0 ^ 0x25) / 20 + 85) + "%";
                    class74.field992 = 85;
                } else if (class42.field588.method260(-21568, "details")) {
                    class323.method2253((byte) -19, class44.field601, class42.field588);
                    class268.method1920(class182.field2946);
                    class74.field992 = 95;
                    class50.field689 = class164.field2671;
                    class90.field1368 = 135;
                } else {
                    class50.field689 = class242.field3847 + (class42.field588.method264("details", (byte) -75) / 10 + 90) + "%";
                    class74.field992 = 85;
                }
            } else if (class90.field1368 == 135) {
                int var8 = class154.method1069((byte) 6);
                if (var8 == -1) {
                    class74.field992 = 95;
                    class50.field689 = class179.field2896;
                } else if (var8 == 7 || var8 == 9) {
                    this.method2227(125, "worldlistfull");
                    class173.method1180(1000, arg0 ^ 0xFFFF00DA);
                } else if (class142.field2129) {
                    class74.field992 = 96;
                    class50.field689 = class342.field5324;
                    class90.field1368 = 140;
                } else {
                    this.method2227(122, "worldlistio_" + var8);
                    class173.method1180(1000, 65280);
                }
            } else if (class90.field1368 == 140) {
                class12.field134 = class189.field3077.method266(-101, "loginscreen");
                class239.field3775.method247(true, false, 0);
                class139.field2077.method247(true, true, 0);
                class149.field2248.method247(true, true, arg0 + 38);
                class121.field1841.method247(true, true, arg0 + 38);
                class283.field4465.method247(true, true, 0);
                class189.field3077.method247(true, true, 0);
                class48.field663 = true;
                class90.field1368 = 150;
                class74.field992 = 97;
                class50.field689 = class325.field5077;
            } else if (class90.field1368 == 150) {
                class212.method1546();
                if (class27.field390) {
                    class49.field674 = 0;
                    class327.field5098 = 0;
                    class330.field5138 = 0;
                    class86.field1304 = 0;
                }
                class27.field390 = true;
                class255.method1794(150, class264.field4183);
                class201.method1471(false, -1, class49.field674, -1, false);
                class74.field992 = 100;
                class90.field1368 = 160;
                class50.field689 = class269.field4249;
            } else if (class90.field1368 == 160) {
                class224.method1635(Integer.MAX_VALUE, true);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Lok;)Le;", line = 3836)
    public static final class170 method1913(class160 arg0) {
        class170 var1 = (class170) class101.field1550.method1743(((long) arg0.field2446 << 32) + (long) arg0.field2456, (byte) -63);
        return var1 == null ? arg0.field2579 : var1;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BIZI[BII[Lde;)[I", line = 3847)
    public static final int[] method1914(byte arg0, int arg1, boolean arg2, int arg3, byte[] arg4, int arg5, int arg6, class68[] arg7) {
        field4227++;
        byte var8;
        if (arg2) {
            var8 = 1;
        } else {
            var8 = 4;
        }
        if (!arg2) {
            for (int var9 = 0; var9 < 4; var9++) {
                for (int var10 = 0; var10 < 64; var10++) {
                    for (int var11 = 0; var11 < 64; var11++) {
                        if ((arg5 + var10) > 0 && arg5 + var10 < 103 && (arg3 + var11) > 0 && (arg3 + var11) < 103) {
                            arg7[var9].field889[arg5 + var10][arg3 + var11] = class200.method1465(arg7[var9].field889[arg5 + var10][arg3 + var11], -2097153);
                        }
                    }
                }
            }
        }
        class192 var12 = new class192(arg4);
        int var13 = arg1 + arg5;
        int var14 = arg6 + arg3;
        if (arg0 <= 29) {
            field4229 = (class123[]) null;
        }
        for (int var15 = 0; var15 < var8; var15++) {
            for (int var16 = 0; var16 < 64; var16++) {
                for (int var17 = 0; var17 < 64; var17++) {
                    class78.method580(arg2, 0, var12, var13 + var16, 0, 0, arg3 + var17, var15, var14 + var17, var16 - -arg5, false, (byte) -128);
                }
            }
        }
        boolean var18 = false;
        boolean var19 = false;
        while (var12.field3128.length > var12.field3129) {
            int var20 = var12.method1399(-1172389784);
            if (var20 == 128) {
                class183.field2956[0] = var12.method1396(-85);
                var18 = true;
                class183.field2956[1] = var12.method1389(106);
                class183.field2956[2] = var12.method1389(118);
                class183.field2956[3] = var12.method1389(118);
                class183.field2956[4] = var12.method1396(-115);
            } else {
                if (var20 != 129) {
                    var12.field3129--;
                    break;
                }
                var19 = true;
                for (int var21 = 0; var21 < 4; var21++) {
                    byte var22 = var12.method1377(true);
                    if (var22 == 0) {
                        int var23 = arg5 + 64;
                        int var24 = arg5;
                        if (arg5 < 0) {
                            var24 = 0;
                        } else if (arg5 >= 104) {
                            var24 = 104;
                        }
                        if (var23 < 0) {
                            var23 = 0;
                        } else if (var23 >= 104) {
                            var23 = 104;
                        }
                        int var25 = arg3 + 64;
                        int var26 = arg3;
                        if (arg3 < 0) {
                            var26 = 0;
                        } else if (arg3 >= 104) {
                            var26 = 104;
                        }
                        if (var25 < 0) {
                            var25 = 0;
                        } else if (var25 >= 104) {
                            var25 = 104;
                        }
                        while (var23 > var24) {
                            while (var26 < var25) {
                                class276.field4374[var21][var24][var26] = 0;
                                var26++;
                            }
                            var24++;
                        }
                    } else if (var22 == 1) {
                        for (int var27 = 0; var27 < 64; var27 += 4) {
                            for (int var28 = 0; var28 < 64; var28 += 4) {
                                byte var29 = var12.method1377(true);
                                for (int var30 = arg5 + var27; var30 < arg5 + var27 + 4; var30++) {
                                    for (int var31 = arg3 + var28; var31 < arg3 + var28 + 4; var31++) {
                                        if (var30 >= 0 && var30 < 104 && var31 >= 0 && var31 < 104) {
                                            class276.field4374[var21][var30][var31] = var29;
                                        }
                                    }
                                }
                            }
                        }
                    } else if (var22 == 2 && var21 > 0) {
                        int var32 = arg5;
                        int var33 = arg3;
                        int var34 = arg3 + 64;
                        int var35 = arg5 + 64;
                        if (var35 < 0) {
                            var35 = 0;
                        } else if (var35 >= 104) {
                            var35 = 104;
                        }
                        if (arg5 < 0) {
                            var32 = 0;
                        } else if (arg5 >= 104) {
                            var32 = 104;
                        }
                        if (var34 < 0) {
                            var34 = 0;
                        } else if (var34 >= 104) {
                            var34 = 104;
                        }
                        if (arg3 < 0) {
                            var33 = 0;
                        } else if (arg3 >= 104) {
                            var33 = 104;
                        }
                        while (var32 < var35) {
                            while (var33 < var34) {
                                class276.field4374[var21][var32][var33] = class276.field4374[var21 - 1][var32][var33];
                                var33++;
                            }
                            var32++;
                        }
                    }
                }
            }
        }
        if (class186.field2991 && !arg2) {
            class21 var36 = null;
            label290: while (true) {
                int var38;
                label283: do {
                    while (true) {
                        while (var12.field3128.length > var12.field3129) {
                            int var37 = var12.method1399(-1172389784);
                            if (var37 == 0) {
                                var36 = new class21(var12);
                            } else {
                                if (var37 == 1) {
                                    var38 = var12.method1399(-1172389784);
                                    continue label283;
                                }
                                if (var37 != 2) {
                                    throw new IllegalStateException();
                                }
                                if (var36 == null) {
                                    var36 = new class21();
                                }
                                var36.method138(true, var12);
                            }
                        }
                        if (var36 == null) {
                            var36 = new class21();
                        }
                        for (int var44 = 0; var44 < 8; var44++) {
                            for (int var45 = 0; var45 < 8; var45++) {
                                int var46 = (arg5 >> 3) + var44;
                                int var47 = (arg3 >> 3) + var45;
                                if (var46 >= 0 && var46 < 13 && var47 >= 0 && var47 < 13) {
                                    class274.field4345[var46][var47] = var36;
                                }
                            }
                        }
                        break label290;
                    }
                } while (var38 <= 0);
                for (int var39 = 0; var39 < var38; var39++) {
                    class272 var40 = new class272(var12);
                    if (var40.field4334 == 31) {
                        class56 var41 = class77.method569(var12.method1396(-65), 98);
                        var40.method1940(var41.field735, var41.field734, -47, var41.field744, var41.field745);
                    }
                    var40.field4317 += arg3 << 7;
                    var40.field4325 += arg5 << 7;
                    int var42 = var40.field4325 >> 7;
                    int var43 = var40.field4317 >> 7;
                    if (var42 >= 0 && var43 >= 0 && var42 < 104 && var43 < 104) {
                        var40.field4308 = (class81.field1229[1][var42][var43] & 0x2) != 0;
                        var40.field4312 = class84.field1282[var40.field4311][var42][var43] - var40.field4312;
                        class47.method315(var40);
                    }
                }
            }
        }
        if (!var19) {
            for (int var48 = 0; var48 < 4; var48++) {
                for (int var49 = 0; var49 < 16; var49++) {
                    for (int var50 = 0; var50 < 16; var50++) {
                        int var51 = (arg5 >> 2) + var49;
                        int var52 = (arg3 >> 2) + var50;
                        if (var51 >= 0 && var51 < 26 && var52 >= 0 && var52 < 26) {
                            class276.field4374[var48][var51][var52] = 0;
                        }
                    }
                }
            }
        }
        return var18 ? class183.field2956 : null;
    }
}
