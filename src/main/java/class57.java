import java.awt.Component;
import java.lang.reflect.Constructor;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class57 {

    @OriginalMember(owner = "client!vg", name = "h", descriptor = "Z")
    public boolean field709 = false;

    @OriginalMember(owner = "client!vg", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field714 = new String[] { method577(method576("hX:\u00065")), method577(method576("pJx)")), method577(method576("e\u0011:k`")), method577(method576("hX:\u00015")), method577(method576("hX:\u00075")), method577(method576("hX:\u00025")), method577(method576("hX:\u00005")), method577(method576("hX:\u00045")), method577(method576("hX:\u00035")), method577(method576("t^b$3\u007fH`k^qRd*s{Q`")), method577(method576("hX:\r5")), method577(method576("rXu")) };

    @OriginalMember(owner = "client!vg", name = "l", descriptor = "I")
    public static int field708 = 0;

    @OriginalMember(owner = "client!vg", name = "d", descriptor = "[I")
    public static int[] field698 = new int[32];

    @OriginalMember(owner = "client!vg", name = "g", descriptor = "[I")
    public static int[] field710 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!vg", name = "o", descriptor = "I")
    public static int field712 = -1;

    @OriginalMember(owner = "client!vg", name = "e", descriptor = "I")
    public static int field699;

    @OriginalMember(owner = "client!vg", name = "p", descriptor = "I")
    public static int field700;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "I")
    public static int field701;

    @OriginalMember(owner = "client!vg", name = "j", descriptor = "I")
    public int field702;

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "I")
    public static int field703;

    @OriginalMember(owner = "client!vg", name = "i", descriptor = "I")
    public int field705;

    @OriginalMember(owner = "client!vg", name = "k", descriptor = "I")
    public static int field706;

    @OriginalMember(owner = "client!vg", name = "f", descriptor = "I")
    public static int field707;

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "I")
    public static int field711;

    @OriginalMember(owner = "client!vg", name = "n", descriptor = "Leka;")
    public class492 field704;

    // $FF: synthetic field
    @OriginalMember(owner = "client!vg", name = "m", descriptor = "Ljava/lang/Class;")
    public static Class field713;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(B)V")
    public static final void method567(byte arg0) {
        try {
            field706++;
            class117 var1 = class185.field2948.field2660;
            if (arg0 != -36) {
                method567((byte) 88);
            }
            for (int var2 = 0; var2 < class149.field2088; var2++) {
                int var3 = class794.field11606[var2];
                class426 var4 = ((class19) class176.field2797.method737((byte) -39, (long) var3)).field194;
                int var5 = var1.method1645((byte) -110);
                if ((var5 & 0x4) != 0) {
                    var5 += var1.method1645((byte) -112) << 8;
                }
                if ((var5 & 0x200) != 0) {
                    var5 += var1.method1645((byte) -105) << 16;
                }
                if ((var5 & 0x20) != 0) {
                    var4.field6725 = var1.method1687((byte) -44);
                    var4.field6712 = var1.method1687((byte) -50);
                }
                if ((var5 & 0x1000) != 0) {
                    int var6 = var1.method1644((byte) 88);
                    int[] var7 = new int[var6];
                    int[] var8 = new int[var6];
                    for (int var9 = 0; var9 < var6; var9++) {
                        int var10 = var1.method1636(arg0 - 7507);
                        if ((var10 & 0xC000) == 49152) {
                            int var11 = var1.method1636(-7543);
                            var7[var9] = class553.method4099(var11, var10 << 16);
                        } else {
                            var7[var9] = var10;
                        }
                        var8[var9] = var1.method1654(-124);
                    }
                    var4.method797(false, var7, var8);
                }
                if ((var5 & 0x40) != 0) {
                    if (var4.field6716.method1528(0)) {
                        class277.method2376(var4, (byte) -116);
                    }
                    var4.method3382(arg0 ^ 0xFFFFFFDC, class395.field6267.method3142(var1.method1670((byte) -115), (byte) 80));
                    var4.method803((byte) -84, var4.field6716.field2572);
                    var4.field1145 = var4.field6716.field2624 << 3;
                    if (var4.field6716.method1528(0)) {
                        class615.method4474(var4, null, (byte) -63, 0, var4.field9975, var4.field1201[0], null, var4.field1200[0]);
                    }
                }
                if ((var5 & 0x40000) != 0) {
                    var4.field6706 = var1.method1635((byte) 85);
                    if ("".equals(var4.field6706) || var4.field6706.equals(var4.field6716.field2589)) {
                        var4.field6706 = var4.field6716.field2589;
                    }
                }
                if ((var5 & 0x800) != 0) {
                    var4.field1111 = var1.method1626(arg0 ^ 0x9);
                    var4.field1159 = var1.method1686(-128);
                    var4.field1184 = var1.method1686(-128);
                    var4.field1123 = (byte) var1.method1634((byte) 120);
                    var4.field1146 = class431.field6776 + var1.method1687((byte) -72);
                    var4.field1112 = class431.field6776 + var1.method1687((byte) -119);
                }
                if ((var5 & 0x100) != 0) {
                    int var12 = var1.method1670((byte) -128);
                    var4.field1180 = var1.method1684(true);
                    var4.field1183 = var1.method1645((byte) -74);
                    var4.field1181 = (var12 & 0x8000) != 0;
                    var4.field1134 = var12 & 0x7FFF;
                    var4.field1162 = class431.field6776 - (-var4.field1180 - var4.field1134);
                }
                if ((var5 & 0x400) != 0) {
                    int var13 = var1.method1654(-117);
                    if (var13 == 65535) {
                        var13 = -1;
                    }
                    int var14 = var1.method1628(75);
                    int var15 = var1.method1684(true);
                    int var16 = var15 & 0x7;
                    int var17 = (var15 & 0x7F) >> 3;
                    if (var17 == 15) {
                        var17 = -1;
                    }
                    var4.method795(var16, 1, var14, (byte) 102, var17, var13);
                }
                if ((var5 & 0x10000) != 0) {
                    var4.field6704 = var1.method1636(-7543);
                    if (var4.field6704 == 65535) {
                        var4.field6704 = var4.field6716.field2607;
                    }
                }
                if ((var5 & 0x8000) != 0) {
                    var4.field1187 = var1.method1626(arg0 ^ 0xF);
                    var4.field1107 = var1.method1626(40);
                    var4.field1153 = var1.method1626(arg0 ^ 0xFFFFFF84);
                    var4.field1136 = var1.method1686(-128);
                    var4.field1195 = var1.method1636(arg0 - 7507) + class431.field6776;
                    var4.field1115 = var1.method1636(-7543) + class431.field6776;
                    var4.field1170 = var1.method1634((byte) 98);
                    var4.field1187 += var4.field1201[0];
                    var4.field1136 += var4.field1200[0];
                    var4.field1208 = 0;
                    var4.field1153 += var4.field1201[0];
                    var4.field1107 += var4.field1200[0];
                    var4.field1205 = 1;
                }
                if ((var5 & 0x2000) != 0) {
                    int var18 = var1.method1644((byte) 44);
                    int[] var19 = new int[var18];
                    int[] var20 = new int[var18];
                    int[] var21 = new int[var18];
                    for (int var22 = 0; var22 < var18; var22++) {
                        int var23 = var1.method1670((byte) -128);
                        if (var23 == 65535) {
                            var23 = -1;
                        }
                        var19[var22] = var23;
                        var20[var22] = var1.method1634((byte) 106);
                        var21[var22] = var1.method1670((byte) -113);
                    }
                    class366.method3029(var21, true, var20, var4, var19);
                }
                if ((var5 & 0x10) != 0) {
                    int var24 = var1.method1645((byte) -97);
                    if (var24 > 0) {
                        for (int var25 = 0; var25 < var24; var25++) {
                            int var26 = -1;
                            int var27 = -1;
                            int var28 = var1.method1660(false);
                            int var29 = -1;
                            if (var28 == 32767) {
                                var28 = var1.method1660(false);
                                var27 = var1.method1660(false);
                                var26 = var1.method1660(false);
                                var29 = var1.method1660(false);
                            } else if (var28 == 32766) {
                                var28 = -1;
                            } else {
                                var27 = var1.method1660(false);
                            }
                            int var30 = var1.method1660(false);
                            int var31 = var1.method1644((byte) 89);
                            var4.method812((byte) -101, var30, var28, var31, class431.field6776, var26, var29, var27);
                        }
                    }
                }
                if ((var5 & 0x4000) != 0) {
                    int var32 = var4.field6716.field2602.length;
                    int var33 = 0;
                    if (var4.field6716.field2566 != null) {
                        var33 = var4.field6716.field2566.length;
                    }
                    int var34 = 0;
                    if (var4.field6716.field2600 != null) {
                        var34 = var4.field6716.field2600.length;
                    }
                    int var35 = var1.method1634((byte) 102);
                    if ((var35 & 0x1) == 1) {
                        var4.field6726 = null;
                    } else {
                        int[] var36 = null;
                        if ((var35 & 0x2) == 2) {
                            var36 = new int[var32];
                            for (int var37 = 0; var37 < var32; var37++) {
                                var36[var37] = var1.method1654(-121);
                            }
                        }
                        short[] var38 = null;
                        if ((var35 & 0x4) == 4) {
                            var38 = new short[var33];
                            for (int var39 = 0; var39 < var33; var39++) {
                                var38[var39] = (short) var1.method1636(-7543);
                            }
                        }
                        short[] var40 = null;
                        if ((var35 & 0x8) == 8) {
                            var40 = new short[var34];
                            for (int var41 = 0; var41 < var34; var41++) {
                                var40[var41] = (short) var1.method1670((byte) -112);
                            }
                        }
                        long var42 = (long) var3 | (long) (var4.field6705++) << 32;
                        var4.field6726 = new class345(var42, var36, var38, var40);
                    }
                }
                if ((var5 & 0x2) != 0) {
                    int[] var44 = new int[4];
                    for (int var45 = 0; var45 < 4; var45++) {
                        var44[var45] = var1.method1654(-125);
                        if (var44[var45] == 65535) {
                            var44[var45] = -1;
                        }
                    }
                    int var46 = var1.method1634((byte) 101);
                    class670.method4859(var46, var4, var44, 6673);
                }
                if ((var5 & 0x1) != 0) {
                    int var47 = var1.method1636(arg0 - 7507);
                    if (var47 == 65535) {
                        var47 = -1;
                    }
                    int var48 = var1.method1646((byte) 126);
                    int var49 = var1.method1684(true);
                    int var50 = var49 & 0x7;
                    int var51 = var49 >> 3 & 0xF;
                    if (var51 == 15) {
                        var51 = -1;
                    }
                    var4.method795(var50, 0, var48, (byte) 87, var51, var47);
                }
                if ((var5 & 0x20000) != 0) {
                    int var52 = var1.method1687((byte) -92);
                    if (var52 == 65535) {
                        var52 = -1;
                    }
                    int var53 = var1.method1646((byte) 46);
                    int var54 = var1.method1645((byte) -75);
                    int var55 = var54 & 0x7;
                    int var56 = var54 >> 3 & 0xF;
                    if (var56 == 15) {
                        var56 = -1;
                    }
                    var4.method795(var55, 2, var53, (byte) 105, var56, var52);
                }
                if ((var5 & 0x80000) != 0) {
                    int var57 = var4.field6716.field2575.length;
                    int var58 = 0;
                    if (var4.field6716.field2566 != null) {
                        var58 = var4.field6716.field2566.length;
                    }
                    byte var59 = 0;
                    if (var4.field6716.field2600 != null) {
                        var58 = var4.field6716.field2600.length;
                    }
                    int var60 = var1.method1684(true);
                    if ((var60 & 0x1) != 1) {
                        int[] var61 = null;
                        if ((var60 & 0x2) == 2) {
                            var61 = new int[var57];
                            for (int var62 = 0; var62 < var57; var62++) {
                                var61[var62] = var1.method1670((byte) -120);
                            }
                        }
                        short[] var63 = null;
                        if ((var60 & 0x4) == 4) {
                            var63 = new short[var58];
                            for (int var64 = 0; var64 < var58; var64++) {
                                var63[var64] = (short) var1.method1670((byte) -111);
                            }
                        }
                        short[] var65 = null;
                        if ((var60 & 0x8) == 8) {
                            var65 = new short[var59];
                            for (int var66 = 0; var66 < var59; var66++) {
                                var65[var66] = (short) var1.method1636(-7543);
                            }
                        }
                        long var67 = (long) var3 | (long) (var4.field6718++) << 32;
                        new class345(var67, var61, var63, var65);
                    }
                }
                if ((var5 & 0x80) != 0) {
                    var4.field1173 = var1.method1635((byte) 83);
                    var4.field1168 = 100;
                }
                if ((var5 & 0x8) != 0) {
                    var4.field1155 = var1.method1670((byte) -110);
                    if (var4.field1155 == 65535) {
                        var4.field1155 = -1;
                    }
                }
            }
        } catch (RuntimeException var70) {
            throw class590.method4333(var70, field714[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(Z)V")
    public static void method568(boolean arg0) {
        try {
            field698 = null;
            if (arg0) {
                field710 = null;
            }
            field710 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field714[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IZLha;I)Lhk;")
    public final class107 method569(int arg0, boolean arg1, class63 arg2, int arg3) {
        try {
            field711++;
            long var5 = (long) ((arg1 ? 262144 : 0) | arg0 << 16 | this.field705 | arg2.field865 << 19);
            if (arg3 >= -90) {
                field708 = -4;
            }
            class107 var7 = (class107) this.field704.field7413.method302(-86, var5);
            if (var7 != null) {
                return var7;
            } else if (this.field704.field7409.method595(-2, this.field705)) {
                class174 var8 = class174.method1608(this.field704.field7409, this.field705, 0);
                if (var8 != null) {
                    var8.field2780 = var8.field2774 = var8.field2777 = var8.field2778 = 0;
                    if (arg1) {
                        var8.method1614();
                    }
                    for (int var9 = 0; var9 < arg0; var9++) {
                        var8.method1616();
                    }
                }
                class107 var10 = arg2.method213(var8, true);
                if (var10 != null) {
                    this.field704.field7413.method295(false, var5, var10);
                }
                return var10;
            } else {
                return null;
            }
        } catch (RuntimeException var12) {
            throw class590.method4333(var12, field714[0] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field714[1] : field714[2]) + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(ILwq;)V")
    public final void method570(int arg0, class176 arg1) {
        try {
            field699++;
            while (true) {
                int var3 = arg1.method1645((byte) -84);
                if (var3 == 0) {
                    if (arg0 == -3437) {
                        return;
                    } else {
                        method572(-0.32241443F, (byte) 4, 60, true, -127, 67, -2, 14);
                        return;
                    }
                }
                this.method574(arg1, 7, var3);
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field714[3] + arg0 + ',' + (arg1 == null ? field714[1] : field714[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(ZILjava/awt/Component;)Ljm;")
    public static final class720 method571(boolean arg0, int arg1, Component arg2) {
        try {
            field707++;
            try {
                if (arg1 >= -7) {
                    method568(true);
                }
                Constructor var3 = Class.forName(field714[11]).getDeclaredConstructor(field713 == null ? (field713 = method575(field714[9])) : field713, Boolean.TYPE);
                return (class720) var3.newInstance(arg2, Boolean.valueOf(arg0));
            } catch (Throwable var5) {
                return new class694(arg2, arg0);
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field714[10] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field714[1] : field714[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(FBIZIIII)[I")
    public static final int[] method572(float arg0, byte arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7) {
        try {
            field703++;
            int[] var8 = new int[arg7];
            class767 var9 = new class767();
            var9.field11237 = arg5;
            if (arg1 != -59) {
                field710 = null;
            }
            var9.field11238 = arg4;
            var9.field11228 = arg2;
            var9.field11227 = (int) (arg0 * 4096.0F);
            var9.field11222 = arg6;
            var9.field11234 = arg3;
            var9.method67((byte) -20);
            class209.method1891(1, arg1 ^ 0xFFFFFFE4, arg7);
            var9.method5525(var8, 81, 0);
            return var8;
        } catch (RuntimeException var11) {
            throw class590.method4333(var11, field714[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(I)Z")
    public final boolean method573(int arg0) {
        try {
            field701++;
            if (arg0 > 0) {
                this.field709 = false;
            }
            return this.field704.field7409.method595(-2, this.field705);
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field714[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(Lwq;II)V")
    private final void method574(class176 arg0, int arg1, int arg2) {
        try {
            int var4 = 103 / ((61 - arg1) / 39);
            if (arg2 == 1) {
                this.field705 = arg0.method1687((byte) -39);
            } else if (arg2 == 2) {
                this.field702 = arg0.method1685(false);
            } else if (arg2 == 3) {
                this.field709 = true;
            } else if (arg2 == 4) {
                this.field705 = -1;
            }
            field700++;
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field714[6] + (arg0 == null ? field714[1] : field714[2]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method575(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!vg", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method576(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x1D);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!vg", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method577(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 30;
                    break;
                case 1:
                    var10005 = 63;
                    break;
                case 2:
                    var10005 = 20;
                    break;
                case 3:
                    var10005 = 69;
                    break;
                default:
                    var10005 = 29;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
