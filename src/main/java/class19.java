import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class19 implements class30 {

    @OriginalMember(owner = "client!l", name = "c", descriptor = "I")
    public static int field400 = 0;

    @OriginalMember(owner = "client!l", name = "e", descriptor = "[Lb;")
    public static class95[] field402 = new class95[6];

    @OriginalMember(owner = "client!l", name = "i", descriptor = "I")
    public static int field406 = 128;

    @OriginalMember(owner = "client!l", name = "d", descriptor = "Lij;")
    public static class50 field401 = class78.method578(125, ": ");

    @OriginalMember(owner = "client!l", name = "g", descriptor = "Lij;")
    public static class50 field404 = class78.method578(122, "<col=ffff00>");

    @OriginalMember(owner = "client!l", name = "n", descriptor = "Lij;")
    public static class50 field411 = class78.method578(122, "Okay");

    @OriginalMember(owner = "client!l", name = "j", descriptor = "Lij;")
    public static class50 field407 = null;

    @OriginalMember(owner = "client!l", name = "b", descriptor = "I")
    public static int field399;

    @OriginalMember(owner = "client!l", name = "f", descriptor = "I")
    public static int field403;

    @OriginalMember(owner = "client!l", name = "h", descriptor = "I")
    public static int field405;

    @OriginalMember(owner = "client!l", name = "k", descriptor = "I")
    public static int field408;

    @OriginalMember(owner = "client!l", name = "l", descriptor = "I")
    public static int field409;

    @OriginalMember(owner = "client!l", name = "m", descriptor = "I")
    public static int field410;

    @OriginalMember(owner = "client!l", name = "o", descriptor = "I")
    public static int field412;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "Lce;")
    public static class10 field398;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(I[IIJ)Lij;")
    public final class50 method140(int arg0, int[] arg1, int arg2, long arg3) {
        if (arg2 != 2) {
            return null;
        }
        field412++;
        if (arg0 == 0) {
            class117 var6 = class211.method1413((byte) -125, arg1[0]);
            return var6.method844((int) arg3, (byte) -117);
        } else if (arg0 == 1 || arg0 == 10) {
            class239 var7 = class15.method111((int) arg3, false);
            return var7.field4103;
        } else if (arg0 == 6 || arg0 == 7) {
            return class211.method1413((byte) -126, arg1[0]).method844((int) arg3, (byte) -120);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(II)V")
    public static final void method141(int arg0, int arg1) {
        field405++;
        if (!class10.method67(arg0, (byte) 107)) {
            return;
        }
        class10[] var2 = class137.field2380[arg0];
        for (int var3 = arg1; var3 < var2.length; var3++) {
            class10 var4 = var2[var3];
            if (var4 != null) {
                var4.field237 = 0;
                var4.field301 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Lda;I)I")
    public static final int method142(class22 arg0, int arg1) {
        if (arg1 >= -111) {
            method142((class22) null, 89);
        }
        field399++;
        int var2 = 0;
        if (arg0.method188((byte) 116, class140.field2441)) {
            var2++;
        }
        if (arg0.method188((byte) 118, class109.field1961)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(I)V")
    public static final void method143(int arg0) {
        while (true) {
            if (class119.field2109.method1597(8, class20.field428) >= 11) {
                int var1 = class119.field2109.method1600(arg0 + 4, 11);
                if (var1 != 2047) {
                    boolean var2 = false;
                    if (class71.field1370[var1] == null) {
                        var2 = true;
                        class71.field1370[var1] = new class187();
                        if (class174.field2913[var1] != null) {
                            class71.field1370[var1].method1265(class174.field2913[var1], arg0 ^ 0x134A);
                        }
                    }
                    class60.field1116[class78.field1450++] = var1;
                    class187 var3 = class71.field1370[var1];
                    var3.field3981 = class244.field4245;
                    int var4 = class119.field2109.method1600(2, 1);
                    if (var4 == 1) {
                        class249.field4322[class170.field2855++] = var1;
                    }
                    int var5 = class119.field2109.method1600(2, 5);
                    int var6 = class119.field2109.method1600(2, 1);
                    if (var5 > 15) {
                        var5 -= 32;
                    }
                    int var7 = class119.field2109.method1600(2, 5);
                    if (var7 > 15) {
                        var7 -= 32;
                    }
                    int var8 = class114.field2004[class119.field2109.method1600(2, 3)];
                    if (var2) {
                        var3.field3992 = var3.field3993 = var8;
                    }
                    var3.method1609(var6 == 1, -46, class239.field4067.field3978[0] + var7, class239.field4067.field3980[0] + var5);
                    continue;
                }
            }
            field403++;
            if (arg0 != -2) {
                field406 = 107;
            }
            class119.field2109.method1592((byte) 57);
            return;
        }
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(II)Lub;")
    public static final class227 method144(int arg0, int arg1) {
        if (arg0 != -15731) {
            field404 = null;
        }
        class227 var2 = (class227) class84.field1597.method764((byte) 70, (long) arg1);
        field408++;
        if (var2 != null) {
            return var2;
        }
        class227 var3 = class96.method724(false, arg1, class20.field420, false, class85.field1639);
        if (var3 != null) {
            class84.field1597.method765((byte) -128, var3, (long) arg1);
        }
        return var3;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Lij;ILjava/awt/Color;ZZ)V")
    public static final void method145(class50 arg0, int arg1, Color arg2, boolean arg3, boolean arg4) {
        field409++;
        try {
            Graphics var5 = class228.field3834.getGraphics();
            if (class260.field4527 == null) {
                class260.field4527 = new Font("Helvetica", 1, 13);
                class114.field1998 = class228.field3834.getFontMetrics(class260.field4527);
            }
            if (arg4) {
                var5.setColor(Color.black);
                var5.fillRect(0, 0, class1.field1, class136.field2370);
            }
            if (arg2 == null) {
                arg2 = new Color(140, 17, 17);
            }
            try {
                if (class144.field2514 == null) {
                    class144.field2514 = class228.field3834.createImage(304, 34);
                }
                if (!arg3) {
                    return;
                }
                Graphics var6 = class144.field2514.getGraphics();
                var6.setColor(arg2);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg1 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect((arg1 * 3) + 2, 2, 300 - (arg1 * 3), 30);
                var6.setFont(class260.field4527);
                var6.setColor(Color.white);
                arg0.method400(22, 22, var6, (304 - arg0.method382(0, class114.field1998)) / 2);
                var5.drawImage(class144.field2514, class1.field1 / 2 - 152, class136.field2370 / 2 - 18, (ImageObserver) null);
            } catch (Exception var9) {
                int var7 = class1.field1 / 2 - 152;
                int var8 = class136.field2370 / 2 - 18;
                var5.setColor(arg2);
                var5.drawRect(var7, var8, 303, 33);
                var5.fillRect(var7 + 2, var8 + 2, arg1 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(var7 + 1, var8 + 1, 301, 31);
                var5.fillRect(var7 - (-(arg1 * 3) - 2), var8 + 2, 300 - (arg1 * 3), 30);
                var5.setFont(class260.field4527);
                var5.setColor(Color.white);
                arg0.method400(-113, var8 + 22, var5, (304 - arg0.method382(0, class114.field1998)) / 2 + var7);
            }
            if (class104.field1900 != null) {
                var5.setFont(class260.field4527);
                var5.setColor(Color.white);
                class104.field1900.method400(-103, class136.field2370 / 2 - 26, var5, class1.field1 / 2 - (class104.field1900.method382(0, class114.field1998) / 2));
            }
        } catch (Exception var10) {
            class228.field3834.repaint();
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(B)V")
    public static void method146(byte arg0) {
        field402 = null;
        if (arg0 > -31) {
            return;
        }
        field407 = null;
        field411 = null;
        field404 = null;
        field401 = null;
        field398 = null;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(II[[[Lr;ZI)V")
    public static final void method147(int arg0, int arg1, class65[][][] arg2, boolean arg3, int arg4) {
        field410++;
        byte var5 = (byte) (class6.field79 & 0xFF);
        if (class115.field2016[class201.field3312][arg0][arg1] == var5) {
            return;
        }
        byte var6 = 0;
        class101.field1857[var6] = arg0;
        int var30 = var6 + 1;
        class20.field429[var6] = arg1;
        if (!arg3) {
            return;
        }
        int var7 = 0;
        class115.field2016[class201.field3312][arg0][arg1] = var5;
        while (var30 != var7) {
            int var8 = class101.field1857[var7] >> 24 & 0xFF;
            int var9 = (class101.field1857[var7] & 0xFF9A75) >> 16;
            int var10 = class101.field1857[var7] & 0xFFFF;
            int var11 = class20.field429[var7] >> 16 & 0xFF;
            int var12 = class20.field429[var7] & 0xFFFF;
            boolean var13 = false;
            var7 = var7 + 1 & 0xFFF;
            boolean var14 = false;
            if ((class210.field3495[class201.field3312][var10][var12] & 0x4) == 0) {
                var13 = true;
            }
            label220: for (int var15 = class201.field3312 + 1; var15 <= 3; var15++) {
                if ((class210.field3495[var15][var10][var12] & 0x8) == 0) {
                    if (var13 && arg2[var15][var10][var12] != null) {
                        if (arg2[var15][var10][var12].field1233 != null) {
                            int var18 = class124.method898(-4, var9);
                            if (arg2[var15][var10][var12].field1233.field992 == var18 || arg2[var15][var10][var12].field1233.field991 == var18) {
                                continue;
                            }
                            if (var8 != 0) {
                                int var19 = class124.method898(-4, var8);
                                if (arg2[var15][var10][var12].field1233.field992 == var19 || arg2[var15][var10][var12].field1233.field991 == var19) {
                                    continue;
                                }
                            }
                            if (var11 != 0) {
                                int var20 = class124.method898(-4, var11);
                                if (arg2[var15][var10][var12].field1233.field992 == var20 || arg2[var15][var10][var12].field1233.field991 == var20) {
                                    continue;
                                }
                            }
                        }
                        if (arg2[var15][var10][var12].field1236 != null) {
                            for (int var21 = 0; var21 < arg2[var15][var10][var12].field1244; var21++) {
                                int var22 = (int) (arg2[var15][var10][var12].field1236[var21].field1905 >> 14 & 0x3FL);
                                if (var22 == 21) {
                                    var22 = 19;
                                }
                                int var23 = (int) (arg2[var15][var10][var12].field1236[var21].field1905 >> 20 & 0x3L);
                                int var24 = var23 << 6 | var22;
                                if (var9 == var24 || var8 != 0 && var8 == var24 || var11 != 0 && var11 == var24) {
                                    continue label220;
                                }
                            }
                        }
                    }
                    class65 var25 = arg2[var15][var10][var12];
                    var14 = true;
                    if (var25 != null && var25.field1244 > 0) {
                        for (int var26 = 0; var26 < var25.field1244; var26++) {
                            class106 var27 = var25.field1236[var26];
                            if (var27.field1913 != var27.field1907 || var27.field1919 != var27.field1906) {
                                for (int var28 = var27.field1913; var28 <= var27.field1907; var28++) {
                                    for (int var29 = var27.field1906; var29 <= var27.field1919; var29++) {
                                        class115.field2016[var15][var28][var29] = var5;
                                    }
                                }
                            }
                        }
                    }
                    class115.field2016[var15][var10][var12] = var5;
                }
            }
            if (var14) {
                int var16 = var10 << 7;
                int var17 = var12 << 7;
                if (class245.field4257[class201.field3312 + 1][var10][var12] > class142.field2494[arg4]) {
                    class142.field2494[arg4] = class245.field4257[class201.field3312 + 1][var10][var12];
                }
                if (class1.field7[arg4] > var16) {
                    class1.field7[arg4] = var16;
                } else if (var16 > class22.field467[arg4]) {
                    class22.field467[arg4] = var16;
                }
                if (class216.field3568[arg4] > var17) {
                    class216.field3568[arg4] = var17;
                } else if (class197.field3259[arg4] < var17) {
                    class197.field3259[arg4] = var17;
                }
            }
            if (!var13) {
                if (var10 >= 1 && class115.field2016[class201.field3312][var10 - 1][var12] != var5) {
                    class101.field1857[var30] = class29.method261(-754974720, class29.method261(1179648, var10 - 1));
                    class20.field429[var30] = class29.method261(1245184, var12);
                    class115.field2016[class201.field3312][var10 - 1][var12] = var5;
                    var30 = var30 + 1 & 0xFFF;
                }
                var12++;
                if (var12 < 104) {
                    if ((var10 - 1) >= 0 && class115.field2016[class201.field3312][var10 - 1][var12] != var5 && (class210.field3495[class201.field3312][var10][var12] & 0x4) == 0 && (class210.field3495[class201.field3312][var10 - 1][var12 - 1] & 0x4) == 0) {
                        class101.field1857[var30] = class29.method261(1375731712, class29.method261(var10 - 1, 1179648));
                        class20.field429[var30] = class29.method261(1245184, var12);
                        class115.field2016[class201.field3312][var10 - 1][var12] = var5;
                        var30 = var30 + 1 & 0xFFF;
                    }
                    if (class115.field2016[class201.field3312][var10][var12] != var5) {
                        class101.field1857[var30] = class29.method261(318767104, class29.method261(5373952, var10));
                        class20.field429[var30] = class29.method261(var12, 5439488);
                        var30 = var30 + 1 & 0xFFF;
                        class115.field2016[class201.field3312][var10][var12] = var5;
                    }
                    if (var10 + 1 < 104 && class115.field2016[class201.field3312][var10 + 1][var12] != var5 && (class210.field3495[class201.field3312][var10][var12] & 0x4) == 0 && (class210.field3495[class201.field3312][var10 + 1][var12 - 1] & 0x4) == 0) {
                        class101.field1857[var30] = class29.method261(-1845493760, class29.method261(var10 + 1, 5373952));
                        class20.field429[var30] = class29.method261(var12, 5439488);
                        var30 = var30 + 1 & 0xFFF;
                        class115.field2016[class201.field3312][var10 + 1][var12] = var5;
                    }
                }
                var12--;
                if ((var10 + 1) < 104 && class115.field2016[class201.field3312][var10 + 1][var12] != var5) {
                    class101.field1857[var30] = class29.method261(class29.method261(var10 + 1, 9568256), 1392508928);
                    class20.field429[var30] = class29.method261(var12, 9633792);
                    class115.field2016[class201.field3312][var10 + 1][var12] = var5;
                    var30 = var30 + 1 & 0xFFF;
                }
                var12--;
                if (var12 >= 0) {
                    if (var10 - 1 >= 0 && class115.field2016[class201.field3312][var10 - 1][var12] != var5 && (class210.field3495[class201.field3312][var10][var12] & 0x4) == 0 && (class210.field3495[class201.field3312][var10 - 1][var12 + 1] & 0x4) == 0) {
                        class101.field1857[var30] = class29.method261(301989888, class29.method261(var10 - 1, 13762560));
                        class20.field429[var30] = class29.method261(var12, 13828096);
                        class115.field2016[class201.field3312][var10 - 1][var12] = var5;
                        var30 = var30 + 1 & 0xFFF;
                    }
                    if (class115.field2016[class201.field3312][var10][var12] != var5) {
                        class101.field1857[var30] = class29.method261(class29.method261(var10, 13762560), -1828716544);
                        class20.field429[var30] = class29.method261(13828096, var12);
                        class115.field2016[class201.field3312][var10][var12] = var5;
                        var30 = var30 + 1 & 0xFFF;
                    }
                    if (var10 + 1 < 104 && class115.field2016[class201.field3312][var10 + 1][var12] != var5 && (class210.field3495[class201.field3312][var10][var12] & 0x4) == 0 && (class210.field3495[class201.field3312][var10 + 1][var12 + 1] & 0x4) == 0) {
                        class101.field1857[var30] = class29.method261(-771751936, class29.method261(9568256, var10 + 1));
                        class20.field429[var30] = class29.method261(var12, 9633792);
                        var30 = var30 + 1 & 0xFFF;
                        class115.field2016[class201.field3312][var10 + 1][var12] = var5;
                    }
                }
            }
        }
        if (class142.field2494[arg4] == -1000000) {
            return;
        }
        class142.field2494[arg4] += 10;
        class1.field7[arg4] -= 50;
        class22.field467[arg4] += 50;
        class197.field3259[arg4] += 50;
        class216.field3568[arg4] -= 50;
    }
}
