import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class121 extends class153 {

    @OriginalMember(owner = "client!fd", name = "D", descriptor = "Lqk;")
    public static class207 field2093 = null;

    @OriginalMember(owner = "client!fd", name = "F", descriptor = "Lqk;")
    public static class207 field2095 = class24.method212(255, "hint_mapedge");

    @OriginalMember(owner = "client!fd", name = "H", descriptor = "[I")
    public static int[] field2097 = new int[2];

    @OriginalMember(owner = "client!fd", name = "C", descriptor = "I")
    public static int field2092 = 0;

    @OriginalMember(owner = "client!fd", name = "B", descriptor = "I")
    public static int field2091;

    @OriginalMember(owner = "client!fd", name = "E", descriptor = "I")
    public static int field2094;

    @OriginalMember(owner = "client!fd", name = "G", descriptor = "I")
    public static int field2096;

    @OriginalMember(owner = "client!fd", name = "I", descriptor = "I")
    public static int field2098;

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(B)V")
    public static void method858(byte arg0) {
        field2097 = null;
        field2095 = null;
        field2093 = null;
        if (arg0 <= 17) {
            method859(-84, true);
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IZ)Lal;")
    public static final class230 method859(int arg0, boolean arg1) {
        field2094++;
        class230 var2 = (class230) class147.field2529.method758(arg1, (long) arg0);
        if (var2 != null) {
            return var2;
        } else if (arg1) {
            return null;
        } else {
            byte[] var3 = class24.field481.method705(class153.method1104(arg1, arg0), class125.method884(18514, arg0), -1);
            class230 var4 = new class230();
            if (var3 != null) {
                var4.method1644(0, new class149(var3));
            }
            class147.field2529.method759((long) arg0, 2, var4);
            return var4;
        }
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(II)I")
    public static int method860(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lfk;III)V")
    public static final void method861(class14 arg0, int arg1, int arg2, int arg3) {
        field2098++;
        if ((arg1 & 0x20) != 0) {
            int var4 = class17.field262.method1062(55);
            int var5 = class17.field262.method1073(false);
            if (var4 == 65535) {
                var4 = -1;
            }
            class28.method221(arg0, var5, var4, (byte) 125);
        }
        if ((arg1 & 0x8) != 0) {
            arg0.field5045 = class17.field262.method1050(1272006568);
            arg0.field5023 = class17.field262.method1050(1272006568);
        }
        if ((arg1 & 0x200) != 0) {
            int var6 = class17.field262.method1047(119);
            if (var6 == 65535) {
                var6 = -1;
            }
            int var7 = class17.field262.method1052(-1);
            boolean var8 = true;
            if (var6 != -1 && arg0.field5105 != -1 && class16.method101((byte) -104, class165.method1192(var6, -115).field4332).field1169 < class16.method101((byte) 126, class165.method1192(arg0.field5105, -101).field4332).field1169) {
                var8 = false;
            }
            if (var8) {
                arg0.field5012 = 1;
                arg0.field5059 = (var7 & 0xFFFF) + class160.field2844;
                arg0.field5105 = var6;
                arg0.field5096 = var7 >> 16;
                arg0.field5088 = 0;
                arg0.field5080 = 0;
                if (class160.field2844 < arg0.field5059) {
                    arg0.field5080 = -1;
                }
                if (arg0.field5105 != -1 && class160.field2844 == arg0.field5059) {
                    int var9 = class165.method1192(arg0.field5105, -125).field4332;
                    if (var9 != -1) {
                        class65 var10 = class16.method101((byte) 89, var9);
                        if (var10 != null && var10.field1180 != null) {
                            class69.method497(arg0.field5104, class202.field3565 == arg0, 0, -95, arg0.field5072, var10);
                        }
                    }
                }
            }
        }
        if ((arg1 & 0x1) != 0) {
            arg0.field5079 = class17.field262.method1047(109);
            if (arg0.field5079 == 65535) {
                arg0.field5079 = -1;
            }
        }
        if ((arg1 & 0x800) != 0) {
            int var11 = class17.field262.method1059(true);
            int[] var12 = new int[var11];
            int[] var13 = new int[var11];
            int[] var14 = new int[var11];
            for (int var15 = 0; var15 < var11; var15++) {
                int var16 = class17.field262.method1079(13932);
                if (var16 == 65535) {
                    var16 = -1;
                }
                var14[var15] = var16;
                var13[var15] = class17.field262.method1072(255);
                var12[var15] = class17.field262.method1079(13932);
            }
            class216.method1547(var14, arg0, (byte) 124, var12, var13);
        }
        if ((arg1 & 0x400) != 0) {
            int var17 = class17.field262.method1067(-32768);
            int var18 = class17.field262.method1073(false);
            arg0.method1945(class160.field2844, (byte) -125, var18, var17);
        }
        if ((arg1 & 0x4) != 0) {
            int var19 = class17.field262.method1050(1272006568);
            boolean var20 = (var19 & 0x8000) != 0;
            int var21 = class17.field262.method1045((byte) 79);
            int var22 = class17.field262.method1059(true);
            int var23 = class17.field262.field2593;
            if (arg0.field209 != null && arg0.field229 != null) {
                long var24 = arg0.field209.method1428(0);
                boolean var26 = false;
                if (var21 <= 1) {
                    if (var20 || (!class8.field112 || class78.field1427) && !class92.field1638) {
                        for (int var27 = 0; var27 < class54.field1013; var27++) {
                            if (class282.field4963[var27] == var24) {
                                var26 = true;
                                break;
                            }
                        }
                    } else {
                        var26 = true;
                    }
                }
                if (!var26 && class56.field1043 == 0) {
                    class67.field1201.field2593 = 0;
                    int var28 = -1;
                    class17.field262.method1038(var22, false, class67.field1201.field2568, 0);
                    class67.field1201.field2593 = 0;
                    class207 var30;
                    if (var20) {
                        class83 var29 = class255.method1776((byte) 39, class67.field1201);
                        var28 = var29.field1524;
                        var19 &= 0x7FFF;
                        var30 = var29.field1528.method1527(class67.field1201, (byte) -105);
                    } else {
                        var30 = class226.method1606(class136.method944((byte) 17, class67.field1201).method1459(0));
                    }
                    arg0.field5019 = var30.method1443(2);
                    arg0.field5025 = 150;
                    arg0.field5043 = var19 & 0xFF;
                    arg0.field5033 = var19 >> 8;
                    if (var21 == 2) {
                        class74.method539(-47, var30, class105.method757(false, new class207[] { class270.field4779, arg0.method92(false) }), var20 ? 17 : 1, (class207) null, var28);
                    } else if (var21 == 1) {
                        class74.method539(-108, var30, class105.method757(false, new class207[] { class276.field4849, arg0.method92(false) }), var20 ? 17 : 1, (class207) null, var28);
                    } else {
                        class74.method539(113, var30, arg0.method92(false), var20 ? 17 : 2, (class207) null, var28);
                    }
                }
            }
            class17.field262.field2593 = var23 + var22;
        }
        if ((arg1 & 0x80) != 0) {
            int var31 = class17.field262.method1072(255);
            byte[] var32 = new byte[var31];
            class149 var33 = new class149(var32);
            class17.field262.method1053((byte) 33, 0, var31, var32);
            class119.field2064[arg2] = var33;
            arg0.method91(1, var33);
        }
        if ((arg1 & 0x100) != 0) {
            arg0.field5027 = class17.field262.method1072(255);
            arg0.field5067 = class17.field262.method1059(true);
            arg0.field5014 = class17.field262.method1072(255);
            arg0.field5055 = class17.field262.method1072(255);
            arg0.field5038 = class17.field262.method1079(13932) + class160.field2844;
            arg0.field5086 = class17.field262.method1050(1272006568) + class160.field2844;
            arg0.field5054 = class17.field262.method1073(false);
            arg0.field5011 = 0;
            arg0.field5061 = 1;
        }
        if ((arg1 & 0x2) != 0) {
            arg0.field5019 = class17.field262.method1034(-27220);
            if (arg0.field5019.method1457(0, -12675) == 126) {
                arg0.field5019 = arg0.field5019.method1464(-23886, 1);
                class71.method511(23692, arg0.method92(false), 2, arg0.field5019);
            } else if (class202.field3565 == arg0) {
                class71.method511(23692, arg0.method92(false), 2, arg0.field5019);
            }
            arg0.field5033 = 0;
            arg0.field5025 = 150;
            arg0.field5043 = 0;
        }
        if (arg3 > -117) {
            field2097 = null;
        }
        if ((arg1 & 0x40) == 0) {
            return;
        }
        int var34 = class17.field262.method1067(-32768);
        int var35 = class17.field262.method1059(true);
        arg0.method1945(class160.field2844, (byte) -31, var35, var34);
        arg0.field5056 = class160.field2844 + 300;
        arg0.field5060 = class17.field262.method1059(true);
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method862(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg1 != 2) {
            field2095 = null;
        }
        for (int var9 = 0; var9 < class57.field1052.field3301; var9++) {
            if (class57.field1052.method1303(var9, (byte) -58)) {
                int var10 = class57.field1052.field3294[var9] - class198.field3473;
                int var11 = class111.field1932 - (class57.field1052.field3297[var9] - (class70.field1253 - 1));
                int var12 = (var11 - arg3) * (arg6 - arg4) / (arg7 - arg3) + arg4;
                int var13 = arg2 + ((arg0 - arg2) * (var10 - arg5) / (arg8 - arg5));
                int var14 = class57.field1052.method1306(var9, 3);
                int var15 = 16777215;
                class42 var16 = null;
                if (var14 == 0) {
                    if ((double) class12.field170 == 3.0D) {
                        var16 = class248.field4495;
                    }
                    if ((double) class12.field170 == 4.0D) {
                        var16 = class102.field1842;
                    }
                    if ((double) class12.field170 == 6.0D) {
                        var16 = class159.field2815;
                    }
                    if ((double) class12.field170 >= 8.0D) {
                        var16 = class98.field1740;
                    }
                }
                if (var14 == 1) {
                    if ((double) class12.field170 == 3.0D) {
                        var16 = class159.field2815;
                    }
                    if ((double) class12.field170 == 4.0D) {
                        var16 = class98.field1740;
                    }
                    if ((double) class12.field170 == 6.0D) {
                        var16 = class106.field1881;
                    }
                    if ((double) class12.field170 >= 8.0D) {
                        var16 = class267.field4726;
                    }
                }
                if (var14 == 2) {
                    var15 = 16755200;
                    if ((double) class12.field170 == 3.0D) {
                        var16 = class106.field1881;
                    }
                    if ((double) class12.field170 == 4.0D) {
                        var16 = class267.field4726;
                    }
                    if ((double) class12.field170 == 6.0D) {
                        var16 = class255.field4566;
                    }
                    if ((double) class12.field170 >= 8.0D) {
                        var16 = class164.field2904;
                    }
                }
                if (class57.field1052.field3299[var9] != -1) {
                    var15 = class57.field1052.field3299[var9];
                }
                if (var16 != null) {
                    int var17 = class167.field2940.method1602(class57.field1052.field3312[var9], (int[]) null, class118.field2047);
                    int var18 = var12 - var16.method318() * (var17 - 1) / 2;
                    int var19 = var18 + var16.method314() / 2;
                    for (int var20 = 0; var20 < var17; var20++) {
                        class207 var21 = class118.field2047[var20];
                        if (var20 < (var17 - 1)) {
                            var21.method1455(var21.method1450((byte) 115) - 4, (byte) 59);
                        }
                        var16.method316(var21, var13, var19, var15, true);
                        var19 += var16.method318();
                    }
                }
            }
        }
        field2096++;
    }
}
