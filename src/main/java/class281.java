import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public abstract class class281 {

    @OriginalMember(owner = "client!ui", name = "g", descriptor = "Z")
    public static boolean field4404 = false;

    @OriginalMember(owner = "client!ui", name = "l", descriptor = "[I")
    public static int[] field4409 = new int[5];

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "Lle;")
    public static class260 field4398 = new class260(5000);

    @OriginalMember(owner = "client!ui", name = "n", descriptor = "Ljava/lang/String;")
    public static String field4411 = "Close";

    @OriginalMember(owner = "client!ui", name = "q", descriptor = "I")
    public static int field4414 = 0;

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "I")
    public static int field4399;

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "I")
    public static int field4400;

    @OriginalMember(owner = "client!ui", name = "d", descriptor = "I")
    public int field4401;

    @OriginalMember(owner = "client!ui", name = "e", descriptor = "I")
    public int field4402;

    @OriginalMember(owner = "client!ui", name = "i", descriptor = "I")
    public static int field4406;

    @OriginalMember(owner = "client!ui", name = "k", descriptor = "I")
    public static int field4408;

    @OriginalMember(owner = "client!ui", name = "m", descriptor = "I")
    public static int field4410;

    @OriginalMember(owner = "client!ui", name = "o", descriptor = "I")
    public static int field4412;

    @OriginalMember(owner = "client!ui", name = "j", descriptor = "Lpk;")
    public static class120 field4407;

    @OriginalMember(owner = "client!ui", name = "h", descriptor = "Ljava/awt/Image;")
    public Image field4405;

    @OriginalMember(owner = "client!ui", name = "p", descriptor = "Z")
    public static boolean field4413;

    @OriginalMember(owner = "client!ui", name = "f", descriptor = "[I")
    public int[] field4403;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lbk;I)V", line = 4)
    public static final void method1976(class69 arg0, int arg1) {
        field4399++;
        class265 var2 = null;
        try {
            class23 var3 = arg0.method542("runescape", 3);
            while (var3.field405 == 0) {
                class245.method1729(-81, 1L);
            }
            if (var3.field405 == 1) {
                var2 = (class265) var3.field409;
                class1 var4 = class66.method532(-122);
                var2.method1832(0, var4.field48, 1, var4.field34);
            }
        } catch (Exception var8) {
        }
        try {
            if (var2 != null) {
                var2.method1829(-118);
            }
            if (arg1 != -7136) {
                field4404 = true;
            }
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(BILtk;I)V", line = 40)
    public static final void method1977(byte arg0, int arg1, class266 arg2, int arg3) {
        field4412++;
        if (class86.field1377 != null || class260.field3858 || arg2 == null || class5.method91(arg2, (byte) 78) == null) {
            return;
        }
        if (arg0 <= 1) {
            method1978(46, false);
        }
        class86.field1377 = arg2;
        class55.field841 = class5.method91(arg2, (byte) 78);
        class136.field2219 = false;
        class122.field1981 = 0;
        class178.field2838 = arg1;
        class120.field1937 = arg3;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IZ)V", line = 63)
    public static final void method1978(int arg0, boolean arg1) {
        class52.method428(class168.field2707, class338.field5219, class211.field3314, arg1, arg0 - 18084);
        field4408++;
        if (arg0 != -1681) {
            method1979(-122, 14, (class120) null, 85);
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IILpk;I)[Lwd;", line = 75)
    public static final class88[] method1979(int arg0, int arg1, class120 arg2, int arg3) {
        field4406++;
        if (arg0 != 10) {
            field4414 = -80;
        }
        return class107.method854(arg2, arg3, arg1, (byte) -118) ? class56.method472(108) : null;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(ZIII[[[Lsg;I)Z", line = 93)
    public static final boolean method1980(boolean arg0, int arg1, int arg2, int arg3, class42[][][] arg4, int arg5) {
        byte var6 = arg0 ? 1 : (byte) (class208.field3284 & 0xFF);
        field4410++;
        if (class242.field3621[class75.field1153][arg5][arg3] == var6) {
            return false;
        } else if ((class332.field5184[class75.field1153][arg5][arg3] & 0x4) == 0) {
            return false;
        } else {
            byte var7 = 0;
            class14.field303[var7] = arg5;
            int var8 = 0;
            int var31 = var7 + 1;
            class42.field647[var7] = arg3;
            class242.field3621[class75.field1153][arg5][arg3] = var6;
            if (arg1 != 1865) {
                field4413 = true;
            }
            while (var31 != var8) {
                int var9 = class14.field303[var8] & 0xFFFF;
                int var10 = class42.field647[var8] & 0xFFFF;
                int var11 = class42.field647[var8] >> 16 & 0xFF;
                int var12 = class14.field303[var8] >> 16 & 0xFF;
                int var13 = class14.field303[var8] >> 24 & 0xFF;
                boolean var14 = false;
                boolean var15 = false;
                if ((class332.field5184[class75.field1153][var9][var10] & 0x4) == 0) {
                    var14 = true;
                }
                label235: for (int var16 = class75.field1153 + 1; var16 <= 3; var16++) {
                    if ((class332.field5184[var16][var9][var10] & 0x8) == 0) {
                        if (var14 && arg4[var16][var9][var10] != null) {
                            if (arg4[var16][var9][var10].field665 != null) {
                                int var17 = class280.method1974(82, var12);
                                if (arg4[var16][var9][var10].field665.field1722 == var17 || arg4[var16][var9][var10].field665.field1730 == var17) {
                                    continue;
                                }
                                if (var13 != 0) {
                                    int var18 = class280.method1974(-100, var13);
                                    if (arg4[var16][var9][var10].field665.field1722 == var18 || arg4[var16][var9][var10].field665.field1730 == var18) {
                                        continue;
                                    }
                                }
                                if (var11 != 0) {
                                    int var19 = class280.method1974(28, var11);
                                    if (arg4[var16][var9][var10].field665.field1722 == var19 || arg4[var16][var9][var10].field665.field1730 == var19) {
                                        continue;
                                    }
                                }
                            }
                            if (arg4[var16][var9][var10].field659 != null) {
                                for (int var20 = 0; var20 < arg4[var16][var9][var10].field672; var20++) {
                                    int var21 = (int) (arg4[var16][var9][var10].field659[var20].field2344 >> 14 & 0x3FL);
                                    if (var21 == 21) {
                                        var21 = 19;
                                    }
                                    int var22 = (int) (arg4[var16][var9][var10].field659[var20].field2344 >> 20 & 0x3L);
                                    int var23 = var21 | var22 << 6;
                                    if (var12 == var23 || var13 != 0 && var13 == var23 || var11 != 0 && var11 == var23) {
                                        continue label235;
                                    }
                                }
                            }
                        }
                        class42 var24 = arg4[var16][var9][var10];
                        if (var24 != null && var24.field672 > 0) {
                            for (int var25 = 0; var25 < var24.field672; var25++) {
                                class144 var26 = var24.field659[var25];
                                if (var26.field2345 != var26.field2334 || var26.field2339 != var26.field2337) {
                                    for (int var27 = var26.field2345; var27 <= var26.field2334; var27++) {
                                        for (int var28 = var26.field2339; var28 <= var26.field2337; var28++) {
                                            class242.field3621[var16][var27][var28] = var6;
                                        }
                                    }
                                }
                            }
                        }
                        var15 = true;
                        class242.field3621[var16][var9][var10] = var6;
                    }
                }
                var8 = var8 + 1 & 0xFFF;
                if (var15) {
                    if (class225.field3492[arg2] < class85.field1374[class75.field1153 + 1][var9][var10]) {
                        class225.field3492[arg2] = class85.field1374[class75.field1153 + 1][var9][var10];
                    }
                    int var29 = var9 << 7;
                    if (class32.field500[arg2] > var29) {
                        class32.field500[arg2] = var29;
                    } else if (var29 > class93.field1517[arg2]) {
                        class93.field1517[arg2] = var29;
                    }
                    int var30 = var10 << 7;
                    if (class73.field1108[arg2] > var30) {
                        class73.field1108[arg2] = var30;
                    } else if (class142.field2304[arg2] < var30) {
                        class142.field2304[arg2] = var30;
                    }
                }
                if (!var14) {
                    if (var9 >= 1 && class242.field3621[class75.field1153][var9 - 1][var10] != var6) {
                        class14.field303[var31] = class251.method1740(class251.method1740(var9 - 1, 1179648), -754974720);
                        class42.field647[var31] = class251.method1740(1245184, var10);
                        var31 = var31 + 1 & 0xFFF;
                        class242.field3621[class75.field1153][var9 - 1][var10] = var6;
                    }
                    var10++;
                    if (var10 < 104) {
                        if ((var9 - 1) >= 0 && class242.field3621[class75.field1153][var9 - 1][var10] != var6 && (class332.field5184[class75.field1153][var9][var10] & 0x4) == 0 && (class332.field5184[class75.field1153][var9 - 1][var10 - 1] & 0x4) == 0) {
                            class14.field303[var31] = class251.method1740(1375731712, class251.method1740(1179648, var9 - 1));
                            class42.field647[var31] = class251.method1740(1245184, var10);
                            class242.field3621[class75.field1153][var9 - 1][var10] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                        if (class242.field3621[class75.field1153][var9][var10] != var6) {
                            class14.field303[var31] = class251.method1740(318767104, class251.method1740(5373952, var9));
                            class42.field647[var31] = class251.method1740(var10, 5439488);
                            class242.field3621[class75.field1153][var9][var10] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                        if (var9 + 1 < 104 && class242.field3621[class75.field1153][var9 + 1][var10] != var6 && (class332.field5184[class75.field1153][var9][var10] & 0x4) == 0 && (class332.field5184[class75.field1153][var9 + 1][var10 - 1] & 0x4) == 0) {
                            class14.field303[var31] = class251.method1740(class251.method1740(var9 + 1, 5373952), -1845493760);
                            class42.field647[var31] = class251.method1740(5439488, var10);
                            var31 = var31 + 1 & 0xFFF;
                            class242.field3621[class75.field1153][var9 + 1][var10] = var6;
                        }
                    }
                    var10--;
                    if ((var9 + 1) < 104 && class242.field3621[class75.field1153][var9 + 1][var10] != var6) {
                        class14.field303[var31] = class251.method1740(1392508928, class251.method1740(var9 + 1, 9568256));
                        class42.field647[var31] = class251.method1740(9633792, var10);
                        var31 = var31 + 1 & 0xFFF;
                        class242.field3621[class75.field1153][var9 + 1][var10] = var6;
                    }
                    var10--;
                    if (var10 >= 0) {
                        if (var9 - 1 >= 0 && class242.field3621[class75.field1153][var9 - 1][var10] != var6 && (class332.field5184[class75.field1153][var9][var10] & 0x4) == 0 && (class332.field5184[class75.field1153][var9 - 1][var10 + 1] & 0x4) == 0) {
                            class14.field303[var31] = class251.method1740(class251.method1740(var9 - 1, 13762560), 301989888);
                            class42.field647[var31] = class251.method1740(13828096, var10);
                            class242.field3621[class75.field1153][var9 - 1][var10] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                        if (class242.field3621[class75.field1153][var9][var10] != var6) {
                            class14.field303[var31] = class251.method1740(class251.method1740(var9, 13762560), -1828716544);
                            class42.field647[var31] = class251.method1740(13828096, var10);
                            var31 = var31 + 1 & 0xFFF;
                            class242.field3621[class75.field1153][var9][var10] = var6;
                        }
                        if ((var9 + 1) < 104 && class242.field3621[class75.field1153][var9 + 1][var10] != var6 && (class332.field5184[class75.field1153][var9][var10] & 0x4) == 0 && (class332.field5184[class75.field1153][var9 + 1][var10 + 1] & 0x4) == 0) {
                            class14.field303[var31] = class251.method1740(-771751936, class251.method1740(var9 + 1, 9568256));
                            class42.field647[var31] = class251.method1740(var10, 9633792);
                            var31 = var31 + 1 & 0xFFF;
                            class242.field3621[class75.field1153][var9 + 1][var10] = var6;
                        }
                    }
                }
            }
            if (class225.field3492[arg2] != -1000000) {
                class225.field3492[arg2] += 10;
                class32.field500[arg2] -= 50;
                class93.field1517[arg2] += 50;
                class142.field2304[arg2] += 50;
                class73.field1108[arg2] -= 50;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(I)V", line = 418)
    public final void method1981(int arg0) {
        if (arg0 != 18517) {
            method1976((class69) null, -128);
        }
        field4400++;
        class33.method299(this.field4403, this.field4401, this.field4402);
    }

    @OriginalMember(owner = "client!ui", name = "<init>", descriptor = "()V", line = 427)
    protected class281() {
    }

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "(I)V", line = 434)
    public static void method1982(int arg0) {
        field4398 = null;
        field4407 = null;
        if (arg0 == 9568256) {
            field4409 = null;
            field4411 = null;
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(BLjava/awt/Component;II)V")
    public abstract void method1285(byte arg0, Component arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Ljava/awt/Graphics;IIIII)V")
    public abstract void method1289(Graphics arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
    public abstract void method1290(int arg0, Graphics arg1, int arg2, int arg3);
}
