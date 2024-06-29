import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class17 {

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "Loc;")
    public static class99 field446 = class48.method402((byte) -104, "(Z");

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "Loc;")
    private static class99 field443 = class48.method402((byte) -104, "Please try again)3");

    @OriginalMember(owner = "client!cc", name = "m", descriptor = "Loc;")
    public static class99 field455 = field443;

    @OriginalMember(owner = "client!cc", name = "j", descriptor = "Loc;")
    public static class99 field452 = class48.method402((byte) -104, "auf der Hautpseite)3");

    @OriginalMember(owner = "client!cc", name = "g", descriptor = "J")
    public static volatile long field449 = 0L;

    @OriginalMember(owner = "client!cc", name = "n", descriptor = "Loc;")
    public static class99 field456 = class48.method402((byte) -104, "Lade Konfiguration )2 ");

    @OriginalMember(owner = "client!cc", name = "u", descriptor = "[Loc;")
    public static class99[] field463 = new class99[200];

    @OriginalMember(owner = "client!cc", name = "i", descriptor = "Loc;")
    public static class99 field451 = class48.method402((byte) -104, " loggt sich aus)3");

    @OriginalMember(owner = "client!cc", name = "l", descriptor = "Loc;")
    public static class99 field454 = class48.method402((byte) -104, "");

    @OriginalMember(owner = "client!cc", name = "v", descriptor = "I")
    public static int field464 = 0;

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "I")
    public static int field445;

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "I")
    public static int field447;

    @OriginalMember(owner = "client!cc", name = "f", descriptor = "I")
    public int field448;

    @OriginalMember(owner = "client!cc", name = "h", descriptor = "I")
    public static int field450;

    @OriginalMember(owner = "client!cc", name = "o", descriptor = "I")
    public int field457;

    @OriginalMember(owner = "client!cc", name = "p", descriptor = "I")
    public int field458;

    @OriginalMember(owner = "client!cc", name = "r", descriptor = "I")
    public static int field460;

    @OriginalMember(owner = "client!cc", name = "s", descriptor = "I")
    public static int field461;

    @OriginalMember(owner = "client!cc", name = "t", descriptor = "I")
    public static int field462;

    @OriginalMember(owner = "client!cc", name = "w", descriptor = "I")
    public int field465;

    @OriginalMember(owner = "client!cc", name = "y", descriptor = "I")
    public int field467;

    @OriginalMember(owner = "client!cc", name = "k", descriptor = "Loe;")
    public static class102 field453;

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "Lme;")
    public class88 field444;

    @OriginalMember(owner = "client!cc", name = "q", descriptor = "Lme;")
    public class88 field459;

    @OriginalMember(owner = "client!cc", name = "x", descriptor = "Lme;")
    public class88 field466;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(B)V")
    public static void method168(byte arg0) {
        field454 = null;
        field443 = null;
        if (arg0 >= -71) {
            method168((byte) -128);
        }
        field456 = null;
        field455 = null;
        field451 = null;
        field463 = null;
        field453 = null;
        field446 = null;
        field452 = null;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(ZI)V")
    public static final void method169(boolean arg0, int arg1) {
        class35.field880 += arg1 * 128;
        if (class35.field880 > class52.field1236.length) {
            class35.field880 -= class52.field1236.length;
            int var2 = (int) (Math.random() * 12.0D);
            class100.method859(-713, class1.field20[var2]);
        }
        field447++;
        short var3 = 256;
        int var4 = arg1 * 128;
        int var5 = 0;
        int var6 = (var3 - arg1) * 128;
        for (int var7 = 0; var7 < var6; var7++) {
            int var27 = class54.field1282[var5 + var4] - class52.field1236[class35.field880 + var5 & class52.field1236.length + -1] * arg1 / 6;
            if (var27 < 0) {
                var27 = 0;
            }
            class54.field1282[var5++] = var27;
        }
        for (int var8 = var3 - arg1; var8 < var3; var8++) {
            int var24 = var8 * 128;
            for (int var25 = 0; var25 < 128; var25++) {
                int var26 = (int) (Math.random() * 100.0D);
                if (var26 < 50 && var25 > 10 && var25 < 118) {
                    class54.field1282[var24 + var25] = 255;
                } else {
                    class54.field1282[var24 + var25] = 0;
                }
            }
        }
        if (class74.field1895 > 0) {
            class74.field1895 -= arg1 * 4;
        }
        if (class93.field2269 > 0) {
            class93.field2269 -= arg1 * 4;
        }
        if (class74.field1895 == 0 && class93.field2269 == 0) {
            int var9 = (int) ((double) (2000 / arg1) * Math.random());
            if (var9 == 0) {
                class74.field1895 = 1024;
            }
            if (var9 == 1) {
                class93.field2269 = 1024;
            }
        }
        if (arg0) {
            field456 = null;
        }
        for (int var10 = 0; var10 < var3 - arg1; var10++) {
            class111.field2764[var10] = class111.field2764[arg1 + var10];
        }
        for (int var11 = var3 - arg1; var11 < var3; var11++) {
            class111.field2764[var11] = (int) (Math.sin((double) class102.field2483 / 14.0D) * 16.0D + Math.sin((double) class102.field2483 / 15.0D) * 14.0D + Math.sin((double) class102.field2483 / 16.0D) * 12.0D);
            class102.field2483++;
        }
        class82.field2041 += arg1;
        int var12 = (arg1 + (class101.field2444 & 0x1)) / 2;
        if (var12 <= 0) {
            return;
        }
        for (int var13 = 0; var13 < class82.field2041 * 100; var13++) {
            int var22 = (int) (Math.random() * 124.0D) + 2;
            int var23 = (int) (Math.random() * 128.0D) + 128;
            class54.field1282[(var23 << 7) + var22] = 192;
        }
        class82.field2041 = 0;
        for (int var14 = 0; var14 < var3; var14++) {
            int var19 = 0;
            int var20 = var14 * 128;
            for (int var21 = -var12; var21 < 128; var21++) {
                if (var12 + var21 < 128) {
                    var19 += class54.field1282[var12 + var20 + var21];
                }
                if (var21 - var12 - 1 >= 0) {
                    var19 -= class54.field1282[var21 + var20 - var12 - 1];
                }
                if (var21 >= 0) {
                    class53.field1257[var20 + var21] = var19 / (var12 * 2 + 1);
                }
            }
        }
        for (int var15 = 0; var15 < 128; var15++) {
            int var16 = 0;
            for (int var17 = -var12; var17 < var3; var17++) {
                int var18 = var17 * 128;
                if (var17 + var12 < var3) {
                    var16 += class53.field1257[var12 * 128 + var18 + var15];
                }
                if (var17 - var12 - 1 >= 0) {
                    var16 -= class53.field1257[var18 + var15 - var12 * 128 - 128];
                }
                if (var17 >= 0) {
                    class54.field1282[var15 + var18] = var16 / (var12 * 2 + 1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lra;ILra;)V")
    public static final void method170(class115 arg0, int arg1, class115 arg2) {
        field450++;
        if (class80.field1978 == null) {
            class80.field1978 = class132.method1067(class109.field2703, class52.field1234, (byte) 50, class144.field3603);
        }
        if (class42.field1021 == null) {
            class42.field1021 = class72.method660(class109.field2703, class84.field2079, (byte) -112, class144.field3603);
        }
        if (class60.field1597 == null) {
            class60.field1597 = class72.method660(class109.field2703, class54.field1316, (byte) -115, class144.field3603);
        }
        if (class49.field1188 == null) {
            class49.field1188 = class72.method660(class109.field2703, class80.field1976, (byte) -94, class144.field3603);
        }
        class96.method794(0, 23, 765, 480, 0);
        class96.method785(0, 0, 125, 23, 12425273, 9135624);
        class96.method785(125, 0, 640, 23, 5197647, 2697513);
        arg0.method988(class77.field1916, 62, 15, 0);
        if (class49.field1188 != null) {
            class49.field1188[1].method216(140, 1);
            arg2.method968(class148.field3657, 152, 10, 16777215);
            class49.field1188[0].method216(140, 12);
            arg2.method968(class100.field2425, 152, 21, 16777215);
        }
        if (class60.field1597 != null) {
            short var3 = 390;
            short var4 = 280;
            short var5 = 500;
            short var6 = 610;
            if (class127.field3061[0] == 0 && class86.field2141[0] == 0) {
                class60.field1597[2].method216(var4, 4);
            } else {
                class60.field1597[0].method216(var4, 4);
            }
            if (class127.field3061[0] == 0 && class86.field2141[0] == 1) {
                class60.field1597[3].method216(var4 + 15, 4);
            } else {
                class60.field1597[1].method216(var4 + 15, 4);
            }
            arg0.method968(class109.field2700, var4 + 32, 17, 16777215);
            if (class127.field3061[0] == 1 && class86.field2141[0] == 0) {
                class60.field1597[2].method216(var3, 4);
            } else {
                class60.field1597[0].method216(var3, 4);
            }
            if (class127.field3061[0] == 1 && class86.field2141[0] == 1) {
                class60.field1597[3].method216(var3 + 15, 4);
            } else {
                class60.field1597[1].method216(var3 + 15, 4);
            }
            arg0.method968(class16.field422, var3 + 32, 17, 16777215);
            if (class127.field3061[0] == 2 && class86.field2141[0] == 0) {
                class60.field1597[2].method216(var5, 4);
            } else {
                class60.field1597[0].method216(var5, 4);
            }
            if (class127.field3061[0] == 2 && class86.field2141[0] == 1) {
                class60.field1597[3].method216(var5 + 15, 4);
            } else {
                class60.field1597[1].method216(var5 + 15, 4);
            }
            arg0.method968(class140.field3459, var5 + 32, 17, 16777215);
            if (class127.field3061[0] == 3 && class86.field2141[0] == 0) {
                class60.field1597[2].method216(var6, 4);
            } else {
                class60.field1597[0].method216(var6, 4);
            }
            if (class127.field3061[0] == 3 && class86.field2141[0] == 1) {
                class60.field1597[3].method216(var6 + 15, 4);
            } else {
                class60.field1597[1].method216(var6 + 15, 4);
            }
            arg0.method968(class37.field952, var6 + 32, 17, 16777215);
        }
        class96.method794(708, 4, 50, 16, 0);
        if (arg1 != 1) {
            return;
        }
        arg2.method988(class95.field2304, 733, 16, 16777215);
        class138.field3449 = -1;
        if (class80.field1978 != null) {
            byte var7 = 19;
            byte var8 = 88;
            int var9 = 765 / (var8 + 1);
            int var10 = 480 / (var7 + 1);
            int var11;
            int var12;
            do {
                var11 = var10;
                var12 = var9;
                if ((var9 - 1) * var10 >= class113.field2829) {
                    var9--;
                }
                if ((var10 - 1) * var9 >= class113.field2829) {
                    var10--;
                }
                if (class113.field2829 <= (var10 - 1) * var9) {
                    var10--;
                }
            } while (var10 != var11 || var9 != var12);
            int var13 = (480 - var7 * var10) / (var10 + 1);
            int var14 = (765 - var8 * var9) / (var9 + 1);
            if (var14 > 5) {
                var14 = 5;
            }
            if (var13 > 5) {
                var13 = 5;
            }
            int var15 = (480 - (var10 - 1) * var13 - var7 * var10) / 2;
            int var16 = (765 - (var9 - 1) * var14 - var8 * var9) / 2;
            int var17 = 0;
            int var18 = var15 + 23;
            int var19 = var16;
            for (int var20 = 0; var20 < class113.field2829; var20++) {
                boolean var21 = true;
                class80 var22 = class5.field104[var20];
                class99 var23 = class5.method31(var22.field1970, 10);
                if (var22.field1970 == -1) {
                    var23 = class69.field1777;
                    var21 = false;
                } else if (var22.field1970 > 1980) {
                    var21 = false;
                    var23 = class150.field3721;
                }
                if (var19 <= class148.field3656 && var18 <= class80.field1969 && var8 + var19 > class148.field3656 && class80.field1969 < var7 + var18 && var21) {
                    class138.field3449 = var20;
                    class80.field1978[var22.field1985 ? 1 : 0].method572(var19, var18, 128, 16777215);
                } else {
                    class80.field1978[var22.field1985 ? 1 : 0].method573(var19, var18);
                }
                if (class42.field1021 != null) {
                    class42.field1021[(var22.field1985 ? 8 : 0) + var22.field1984].method216(var19 + 29, var18);
                }
                arg0.method988(class5.method31(var22.field1983, arg1 ^ 0xB), var19 + 15, var18 - -(var7 / 2) + 5, 0);
                arg2.method988(var23, var19 + 60, var18 - -(var7 / 2) - -5, 268435455);
                var18 += var7 + var13;
                var17++;
                if (var10 <= var17) {
                    var18 = var15 + 23;
                    var19 += var8 + var14;
                    var17 = 0;
                }
            }
        }
        try {
            Graphics var24 = class5.field99.getGraphics();
            class104.field2518.method109(0, 0, 0, var24);
        } catch (Exception var25) {
            class5.field99.repaint();
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(II)I")
    public static int method171(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IBI)V")
    public static final void method172(int arg0, byte arg1, int arg2) {
        field461++;
        class134.field3276.method869((byte) 11, 128);
        class134.field3276.method467(arg2, true);
        class34.field815++;
        if (arg1 == 21) {
            class134.field3276.method507(25135, arg0);
        }
    }
}
