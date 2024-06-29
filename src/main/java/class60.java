import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class60 extends class24 {

    @OriginalMember(owner = "client!id", name = "fb", descriptor = "[S")
    private short[] field1208 = new short[6];

    @OriginalMember(owner = "client!id", name = "xb", descriptor = "I")
    public int field1226 = -1;

    @OriginalMember(owner = "client!id", name = "qb", descriptor = "I")
    private int field1219 = 0;

    @OriginalMember(owner = "client!id", name = "Bb", descriptor = "I")
    private int field1230 = 128;

    @OriginalMember(owner = "client!id", name = "Z", descriptor = "I")
    private int field1202 = 0;

    @OriginalMember(owner = "client!id", name = "Cb", descriptor = "I")
    private int field1231 = 128;

    @OriginalMember(owner = "client!id", name = "ab", descriptor = "[S")
    private short[] field1203 = new short[6];

    @OriginalMember(owner = "client!id", name = "rb", descriptor = "I")
    private int field1220 = 0;

    @OriginalMember(owner = "client!id", name = "X", descriptor = "Lqf;")
    private static class117 field1200 = class72.method514(124, "Loaded title screen");

    @OriginalMember(owner = "client!id", name = "gb", descriptor = "Lqf;")
    private static class117 field1209 = class72.method514(98, "Nov");

    @OriginalMember(owner = "client!id", name = "cb", descriptor = "Lqf;")
    private static class117 field1205 = class72.method514(121, "Dec");

    @OriginalMember(owner = "client!id", name = "kb", descriptor = "Lqf;")
    private static class117 field1213 = class72.method514(115, "Apr");

    @OriginalMember(owner = "client!id", name = "mb", descriptor = "Lqf;")
    public static class117 field1215 = field1200;

    @OriginalMember(owner = "client!id", name = "bb", descriptor = "Lqf;")
    private static class117 field1204 = class72.method514(105, "Jul");

    @OriginalMember(owner = "client!id", name = "db", descriptor = "Lqf;")
    public static class117 field1206 = class72.method514(125, "Unerwartete Antwort vom Anmelde)2Server");

    @OriginalMember(owner = "client!id", name = "U", descriptor = "[I")
    public static int[] field1197 = new int[500];

    @OriginalMember(owner = "client!id", name = "hb", descriptor = "Lqf;")
    private static class117 field1210 = class72.method514(106, "Mar");

    @OriginalMember(owner = "client!id", name = "vb", descriptor = "Lqf;")
    private static class117 field1224 = class72.method514(113, "Jun");

    @OriginalMember(owner = "client!id", name = "nb", descriptor = "Lqf;")
    private static class117 field1216 = class72.method514(115, "Invalid loginserver requested)3");

    @OriginalMember(owner = "client!id", name = "ib", descriptor = "Lqf;")
    private static class117 field1211 = class72.method514(113, "Feb");

    @OriginalMember(owner = "client!id", name = "Y", descriptor = "Lqf;")
    public static class117 field1201 = field1216;

    @OriginalMember(owner = "client!id", name = "tb", descriptor = "Lqf;")
    private static class117 field1222 = class72.method514(126, "May");

    @OriginalMember(owner = "client!id", name = "ob", descriptor = "Lqf;")
    private static class117 field1217 = class72.method514(119, "Jan");

    @OriginalMember(owner = "client!id", name = "yb", descriptor = "Z")
    public static boolean field1227 = false;

    @OriginalMember(owner = "client!id", name = "ub", descriptor = "Lqf;")
    private static class117 field1223 = class72.method514(113, "Aug");

    @OriginalMember(owner = "client!id", name = "lb", descriptor = "Lqf;")
    private static class117 field1214 = class72.method514(117, "Oct");

    @OriginalMember(owner = "client!id", name = "zb", descriptor = "I")
    public static int field1228 = 0;

    @OriginalMember(owner = "client!id", name = "pb", descriptor = "Lqf;")
    private static class117 field1218 = class72.method514(114, "Sep");

    @OriginalMember(owner = "client!id", name = "jb", descriptor = "[Lqf;")
    public static class117[] field1212 = new class117[] { field1217, field1211, field1210, field1213, field1222, field1224, field1204, field1223, field1218, field1214, field1209, field1205 };

    @OriginalMember(owner = "client!id", name = "Db", descriptor = "I")
    public static int field1232 = 0;

    @OriginalMember(owner = "client!id", name = "T", descriptor = "I")
    public static int field1196;

    @OriginalMember(owner = "client!id", name = "V", descriptor = "I")
    public static int field1198;

    @OriginalMember(owner = "client!id", name = "W", descriptor = "I")
    public int field1199;

    @OriginalMember(owner = "client!id", name = "eb", descriptor = "I")
    public static int field1207;

    @OriginalMember(owner = "client!id", name = "sb", descriptor = "I")
    public static int field1221;

    @OriginalMember(owner = "client!id", name = "wb", descriptor = "I")
    private int field1225;

    @OriginalMember(owner = "client!id", name = "Ab", descriptor = "I")
    public static int field1229;

    @OriginalMember(owner = "client!id", name = "Eb", descriptor = "I")
    public static int field1233;

    @OriginalMember(owner = "client!id", name = "i", descriptor = "(I)V")
    public static final void method418(int arg0) {
        if (arg0 < 59) {
            field1211 = null;
        }
        field1207++;
        class120.method964(1);
        class4.field70 = true;
        class138.method1075((byte) 101);
        if (class69.field1445) {
            class144.field3554.method325(class141.field3376, 239, 40, 0, -1);
            class144.field3554.method325(class73.method530((byte) -83, new class117[] { class46.method317(class141.field3412), class15.field220 }), 239, 60, 128, -1);
        } else if (class124.field2924 == 1) {
            class144.field3554.method325(class126.field2970, 239, 40, 0, -1);
            class144.field3554.method325(class73.method530((byte) -83, new class117[] { class46.method317(class141.field3393), class15.field220 }), 239, 60, 128, -1);
        } else if (class124.field2924 == 2) {
            class144.field3554.method325(class117.field2820, 239, 40, 0, -1);
            class144.field3554.method325(class73.method530((byte) -83, new class117[] { class46.method317(class141.field3393), class15.field220 }), 239, 60, 128, -1);
        } else if (class124.field2924 == 3) {
            if (class141.field3393 != class141.field3365) {
                class52.method384(class141.field3393, (byte) 125);
                class141.field3365 = class141.field3393;
            }
            class46 var17 = class25.field501;
            class49.method358(0, 0, 463, 77);
            for (int var18 = 0; var18 < class21.field345; var18++) {
                int var19 = var18 * 14 + 18 - class68.field1418;
                if (var19 > 0 && var19 < 110) {
                    var17.method325(class71.field1525[var18], 239, var19, 0, -1);
                }
            }
            class49.method363();
            if (class21.field345 > 5) {
                class91.method726(77, 463, class68.field1418, (byte) 67, 0, class21.field345 * 14 + 7);
            }
            if (class141.field3393.method915(27) == 0) {
                class144.field3554.method325(class58.field1183, 239, 40, 255, -1);
            } else if (class21.field345 == 0) {
                class144.field3554.method325(class101.field2451, 239, 40, 0, -1);
            }
            var17.method325(class73.method530((byte) -83, new class117[] { class46.method317(class141.field3393), class15.field220 }), 239, 90, 0, -1);
            class49.method352(0, 77, 479, 0);
        } else if (class124.field2924 == 4) {
            class144.field3554.method325(class141.field3400, 239, 40, 0, -1);
            class144.field3554.method325(class73.method530((byte) -83, new class117[] { class46.method317(class141.field3393), class15.field220 }), 239, 60, 128, -1);
        } else if (class149.field3694 != null) {
            class144.field3554.method319(class149.field3694, 10, 20, 459, 40, 0, -1, 1, 1, 0);
            class144.field3554.method325(class62.field1246, 239, 80, 128, -1);
        } else if (class95.field2288 != -1) {
            boolean var1 = class19.method153(2, -19850, class95.field2288, 479, 0, 96, 0);
            if (!var1) {
                class87.field1993 = true;
            }
        } else if (class152.field3738 == -1) {
            class46 var3 = class25.field501;
            class49.method358(0, 0, 463, 77);
            int var4 = 0;
            for (int var5 = 0; var5 < 100; var5++) {
                if (class148.field3656[var5] != null) {
                    int var7 = class70.field1486[var5];
                    int var8 = class68.field1423 + 70 - var4 * 14;
                    class117 var9 = class119.field2852[var5];
                    byte var10 = 0;
                    if (var9 != null && var9.method932(class53.field1105, -79)) {
                        var9 = var9.method908(5, (byte) 120);
                        var10 = 1;
                    }
                    if (var9 != null && var9.method932(class124.field2921, -95)) {
                        var9 = var9.method908(5, (byte) 120);
                        var10 = 2;
                    }
                    if (var7 == 0) {
                        var4++;
                        if (var8 > 0 && var8 < 110) {
                            var3.method330(class148.field3656[var5], 4, var8, 0, -1);
                        }
                    }
                    if ((var7 == 1 || var7 == 2) && (var7 == 1 || class32.field695 == 0 || class32.field695 == 1 && class81.method637(true, var9))) {
                        if (var8 > 0 && var8 < 110) {
                            int var11 = 4;
                            if (var10 == 1) {
                                class117.field2825[0].method951(var11, var8 - 12);
                                var11 += 14;
                            }
                            if (var10 == 2) {
                                class117.field2825[1].method951(var11, var8 - 12);
                                var11 += 14;
                            }
                            var3.method330(class73.method530((byte) -83, new class117[] { var9, class35.field737 }), var11, var8, 0, -1);
                            int var12 = var11 + var3.method331(var9) + 8;
                            var3.method330(class148.field3656[var5], var12, var8, 255, -1);
                        }
                        var4++;
                    }
                    if ((var7 == 3 || var7 == 7) && class45.field898 == 0 && (var7 == 7 || class70.field1475 == 0 || class70.field1475 == 1 && class81.method637(true, var9))) {
                        if (var8 > 0 && var8 < 110) {
                            byte var13 = 4;
                            var3.method330(class69.field1451, var13, var8, 0, -1);
                            int var14 = var13 + var3.method331(class69.field1451);
                            int var15 = var14 + var3.method333(32);
                            if (var10 == 1) {
                                class117.field2825[0].method951(var15, var8 - 12);
                                var15 += 14;
                            }
                            if (var10 == 2) {
                                class117.field2825[1].method951(var15, var8 - 12);
                                var15 += 14;
                            }
                            var3.method330(class73.method530((byte) -83, new class117[] { var9, class35.field737 }), var15, var8, 0, -1);
                            int var16 = var15 + var3.method331(var9) + 8;
                            var3.method330(class148.field3656[var5], var16, var8, 8388608, -1);
                        }
                        var4++;
                    }
                    if (var7 == 4 && (class75.field1646 == 0 || class75.field1646 == 1 && class81.method637(true, var9))) {
                        var4++;
                        if (var8 > 0 && var8 < 110) {
                            var3.method330(class73.method530((byte) -83, new class117[] { var9, class36.field780, class148.field3656[var5] }), 4, var8, 8388736, -1);
                        }
                    }
                    if (var7 == 5 && class45.field898 == 0 && class70.field1475 < 2) {
                        if (var8 > 0 && var8 < 110) {
                            var3.method330(class148.field3656[var5], 4, var8, 8388608, -1);
                        }
                        var4++;
                    }
                    if (var7 == 6 && class45.field898 == 0 && class70.field1475 < 2) {
                        if (var8 > 0 && var8 < 110) {
                            var3.method330(class73.method530((byte) -83, new class117[] { class150.field3733, class36.field780, var9, class35.field737 }), 4, var8, 0, -1);
                            var3.method330(class148.field3656[var5], var3.method331(class73.method530((byte) -83, new class117[] { class150.field3733, class36.field780, var9 })) + 12, var8, 8388608, -1);
                        }
                        var4++;
                    }
                    if (var7 == 8 && (class75.field1646 == 0 || class75.field1646 == 1 && class81.method637(true, var9))) {
                        var4++;
                        if (var8 > 0 && var8 < 110) {
                            var3.method330(class73.method530((byte) -83, new class117[] { var9, class36.field780, class148.field3656[var5] }), 4, var8, 8270336, -1);
                        }
                    }
                }
            }
            class49.method363();
            class125.field2949 = var4 * 14 + 7;
            if (class125.field2949 < 78) {
                class125.field2949 = 78;
            }
            class91.method726(77, 463, class125.field2949 - class68.field1423 - 77, (byte) 113, 0, class125.field2949);
            class117 var6;
            if (class141.field3395 == null || class141.field3395.field356 == null) {
                var6 = class126.field2991;
            } else {
                var6 = class141.field3395.field356;
            }
            var3.method330(class73.method530((byte) -83, new class117[] { var6, class35.field737 }), 4, 90, 0, -1);
            var3.method330(class73.method530((byte) -83, new class117[] { class46.method317(class141.field3406), class15.field220 }), var3.method331(class73.method530((byte) -83, new class117[] { var6, class13.field194 })) + 6, 90, 255, -1);
            class49.method352(0, 77, 479, 0);
        } else {
            boolean var2 = class19.method153(3, -19850, class152.field3738, 479, 0, 96, 0);
            if (!var2) {
                class87.field1993 = true;
            }
        }
        if (class81.field1864 && class24.field468 == 2) {
            class58.method415(112);
        }
        class104.method800(true);
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(ILla;I)V")
    private final void method419(int arg0, class77 arg1, int arg2) {
        if (arg0 == 1) {
            this.field1225 = arg1.method597(38);
        } else if (arg0 == 2) {
            this.field1226 = arg1.method597(68);
        } else if (arg0 == 4) {
            this.field1230 = arg1.method597(52);
        } else if (arg0 == 5) {
            this.field1231 = arg1.method597(32);
        } else if (arg0 == 6) {
            this.field1220 = arg1.method597(arg2 + 39);
        } else if (arg0 == 7) {
            this.field1202 = arg1.method570((byte) 123);
        } else if (arg0 == 8) {
            this.field1219 = arg1.method570((byte) 123);
        } else if (arg0 >= 40 && arg0 < 50) {
            this.field1203[arg0 - 40] = (short) arg1.method597(110);
        } else if (arg0 >= 50 && arg0 < 60) {
            this.field1208[arg0 - 50] = (short) arg1.method597(95);
        }
        field1233++;
        if (arg2 != 0) {
            field1210 = null;
        }
    }

    @OriginalMember(owner = "client!id", name = "j", descriptor = "(I)V")
    public static void method420(int arg0) {
        field1213 = null;
        field1223 = null;
        field1216 = null;
        field1197 = null;
        field1200 = null;
        field1201 = null;
        field1217 = null;
        field1224 = null;
        field1209 = null;
        field1206 = null;
        field1215 = null;
        field1212 = null;
        field1210 = null;
        if (arg0 > -1) {
            method420(-120);
        }
        field1204 = null;
        field1222 = null;
        field1218 = null;
        field1211 = null;
        field1205 = null;
        field1214 = null;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Lla;B)V")
    public final void method421(class77 arg0, byte arg1) {
        if (arg1 < 41) {
            this.method423(-47, true);
        }
        field1196++;
        while (true) {
            int var3 = arg0.method570((byte) 123);
            if (var3 == 0) {
                return;
            }
            this.method419(var3, arg0, 0);
        }
    }

    @OriginalMember(owner = "client!id", name = "k", descriptor = "(I)V")
    public static final void method422(int arg0) {
        field1229++;
        try {
            if (arg0 != 14) {
                field1232 = 107;
            }
            Graphics var1 = class3.field64.getGraphics();
            class148.field3608.method210(0, 4, (byte) 78, var1);
            class91.field2224.method210(0, 357, (byte) 78, var1);
            class77.field1693.method210(722, 4, (byte) 78, var1);
            class32.field691.method210(743, 205, (byte) 78, var1);
            class4.field73.method210(0, 0, (byte) 78, var1);
            class68.field1428.method210(516, 4, (byte) 78, var1);
            class85.field1922.method210(516, 205, (byte) 78, var1);
            class75.field1631.method210(496, 357, (byte) 78, var1);
            class18.field272.method210(0, 338, (byte) 78, var1);
        } catch (Exception var2) {
            class3.field64.repaint();
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IZ)Lea;")
    public final class30 method423(int arg0, boolean arg1) {
        field1198++;
        if (arg1) {
            field1232 = 3;
        }
        class30 var3 = (class30) class153.field3792.method247(0, (long) this.field1199);
        if (var3 == null) {
            class142 var4 = class142.method1142(class77.field1711, this.field1225, 0);
            if (var4 == null) {
                return null;
            }
            for (int var5 = 0; var5 < 6; var5++) {
                if (this.field1203[0] != 0) {
                    var4.method1133(this.field1203[var5], this.field1208[var5]);
                }
            }
            var3 = var4.method1129(this.field1202 + 64, this.field1219 + 850, -30, -50, -30);
            class153.field3792.method248((long) this.field1199, (byte) -125, var3);
        }
        class30 var6;
        if (this.field1226 == -1 || arg0 == -1) {
            var6 = var3.method233(true);
        } else {
            var6 = class130.method1013(this.field1226, -82).method750(true, arg0, var3);
        }
        if (this.field1230 != 128 || this.field1231 != 128) {
            var6.method236(this.field1230, this.field1231, this.field1230);
        }
        if (this.field1220 != 0) {
            if (this.field1220 == 90) {
                var6.method237();
            }
            if (this.field1220 == 180) {
                var6.method237();
                var6.method237();
            }
            if (this.field1220 == 270) {
                var6.method237();
                var6.method237();
                var6.method237();
            }
        }
        return var6;
    }
}
