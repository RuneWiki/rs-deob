import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class207 extends class30 {

    @OriginalMember(owner = "client!v", name = "W", descriptor = "I")
    public int field4038 = 0;

    @OriginalMember(owner = "client!v", name = "K", descriptor = "Lrd;")
    public static class173 field4026 = class133.method843("Lade Benutzeroberfl-=che )2 ", -103);

    @OriginalMember(owner = "client!v", name = "O", descriptor = "Lrd;")
    private static class173 field4030 = class133.method843("Started 3d library", -77);

    @OriginalMember(owner = "client!v", name = "R", descriptor = "I")
    public static int field4033 = -1;

    @OriginalMember(owner = "client!v", name = "P", descriptor = "[I")
    public static int[] field4031 = new int[200];

    @OriginalMember(owner = "client!v", name = "M", descriptor = "Lrd;")
    public static class173 field4028 = field4030;

    @OriginalMember(owner = "client!v", name = "L", descriptor = "I")
    public static int field4027;

    @OriginalMember(owner = "client!v", name = "N", descriptor = "I")
    public static int field4029;

    @OriginalMember(owner = "client!v", name = "Q", descriptor = "I")
    public static int field4032;

    @OriginalMember(owner = "client!v", name = "S", descriptor = "I")
    public static int field4034;

    @OriginalMember(owner = "client!v", name = "T", descriptor = "I")
    public static int field4035;

    @OriginalMember(owner = "client!v", name = "V", descriptor = "I")
    public static int field4037;

    @OriginalMember(owner = "client!v", name = "X", descriptor = "I")
    public static int field4039;

    @OriginalMember(owner = "client!v", name = "U", descriptor = "[I")
    public static int[] field4036;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IBI)I")
    public static final int method1368(int arg0, byte arg1, int arg2) {
        if (arg1 <= 39) {
            field4030 = null;
        }
        field4032++;
        class37 var3 = (class37) class8.field150.method677(-2755, (long) arg0);
        if (var3 == null) {
            return -1;
        } else if (arg2 >= 0 && arg2 < var3.field786.length) {
            return var3.field786[arg2];
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(ILrd;IBI)V")
    public static final void method1369(int arg0, class173 arg1, int arg2, byte arg3, int arg4) {
        field4037++;
        class165 var5 = class29.method231(arg4, arg2, -1);
        if (arg3 != -48 || var5 == null) {
            return;
        }
        if (var5.field3137 != null) {
            class117 var6 = new class117();
            var6.field2167 = arg1;
            var6.field2165 = arg0;
            var6.field2174 = var5.field3137;
            var6.field2155 = var5;
            class189.method1265(-3256, var6);
        }
        boolean var7 = true;
        if (var5.field3170 > 0) {
            var7 = class204.method1358(var5, (byte) 120);
        }
        if (!var7 || !class177.method1176(class78.method474(var5, 113), true, arg0 - 1)) {
            return;
        }
        if (arg0 == 1) {
            class165.field3175.method1023(79, arg3 - 21774);
            class165.field3175.method775(732495312, arg4);
            class98.field1785++;
            class165.field3175.method736(arg2, 113);
        }
        if (arg0 == 2) {
            class112.field2090++;
            class165.field3175.method1023(50, -21822);
            class165.field3175.method775(732495312, arg4);
            class165.field3175.method736(arg2, 108);
        }
        if (arg0 == 3) {
            class165.field3175.method1023(43, -21822);
            class165.field3175.method775(arg3 ^ 0xD4570200, arg4);
            class165.field3175.method736(arg2, arg3 + 112);
            class80.field1581++;
        }
        if (arg0 == 4) {
            class208.field4047++;
            class165.field3175.method1023(188, -21822);
            class165.field3175.method775(732495312, arg4);
            class165.field3175.method736(arg2, -100);
        }
        if (arg0 == 5) {
            class165.field3175.method1023(32, arg3 ^ 0x5512);
            class58.field1157++;
            class165.field3175.method775(732495312, arg4);
            class165.field3175.method736(arg2, 46);
        }
        if (arg0 == 6) {
            class165.field3175.method1023(89, arg3 - 21774);
            class165.field3175.method775(732495312, arg4);
            class165.field3175.method736(arg2, arg3 ^ 0xFFFFFF97);
            class75.field1475++;
        }
        if (arg0 == 7) {
            class151.field2867++;
            class165.field3175.method1023(27, -21822);
            class165.field3175.method775(732495312, arg4);
            class165.field3175.method736(arg2, -124);
        }
        if (arg0 == 8) {
            class175.field3438++;
            class165.field3175.method1023(140, arg3 ^ 0x5512);
            class165.field3175.method775(arg3 ^ 0xD4570200, arg4);
            class165.field3175.method736(arg2, 76);
        }
        if (arg0 == 9) {
            class163.field3020++;
            class165.field3175.method1023(166, arg3 ^ 0x5512);
            class165.field3175.method775(732495312, arg4);
            class165.field3175.method736(arg2, 120);
        }
        if (arg0 == 10) {
            class165.field3175.method1023(195, -21822);
            class165.field3175.method775(arg3 ^ 0xD4570200, arg4);
            class191.field3734++;
            class165.field3175.method736(arg2, -89);
        }
    }

    @OriginalMember(owner = "client!v", name = "e", descriptor = "(B)V")
    public static void method1370(byte arg0) {
        field4031 = null;
        field4028 = null;
        field4030 = null;
        if (arg0 != 82) {
            method1369(-3, null, 58, (byte) 84, -101);
        }
        field4026 = null;
        field4036 = null;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(III)Lrd;")
    public static final class173 method1371(int arg0, int arg1, int arg2) {
        int var3 = arg1 - arg0;
        field4027++;
        if (var3 < -9) {
            return class209.field4069;
        } else if (var3 < -6) {
            return class21.field469;
        } else if (var3 < -3) {
            return class22.field472;
        } else if (var3 < 0) {
            return class73.field1434;
        } else if (var3 > 9) {
            return class144.field2693;
        } else if (var3 > 6) {
            return class178.field3493;
        } else if (arg2 != 26451) {
            return null;
        } else if (var3 > 3) {
            return class46.field980;
        } else if (var3 > 0) {
            return class131.field2476;
        } else {
            return class17.field368;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IILmb;)V")
    private final void method1372(int arg0, int arg1, class121 arg2) {
        field4035++;
        if (arg0 == 5) {
            this.field4038 = arg2.method755((byte) -80);
        }
        if (arg1 != 15754) {
            field4026 = null;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(BLmb;)V")
    public final void method1373(byte arg0, class121 arg1) {
        while (true) {
            int var3 = arg1.method751((byte) 119);
            if (var3 == 0) {
                field4034++;
                if (arg0 != -7) {
                    method1370((byte) 30);
                    return;
                }
                return;
            }
            this.method1372(var3, 15754, arg1);
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IILve;I)V")
    public static final void method1374(int arg0, int arg1, class212 arg2, int arg3) {
        if ((arg3 & 0x2) != 0) {
            arg2.field2774 = class70.field1358.method746(-19941);
            if (arg2.field2774.method1147(7028, 0) == 126) {
                arg2.field2774 = arg2.field2774.method1140(1, (byte) 123);
                class166.method1074(arg2.field4097, 2, arg2.field2774, 93);
            } else if (class175.field3447 == arg2) {
                class166.method1074(arg2.field4097, 2, arg2.field2774, 68);
            }
            arg2.field2817 = 150;
            arg2.field2750 = 0;
            arg2.field2782 = 0;
        }
        field4039++;
        if ((arg1 & arg3) != 0) {
            int var4 = class70.field1358.method779(15151);
            byte[] var5 = new byte[var4];
            class121 var6 = new class121(var5);
            class70.field1358.method783(var4, 0, false, var5);
            class76.field1489[arg0] = var6;
            arg2.method1392(var6, 11449);
        }
        if ((arg3 & 0x4) != 0) {
            int var7 = class70.field1358.method758(true);
            int var8 = class70.field1358.method753(255);
            int var9 = class70.field1358.method779(15151);
            int var10 = class70.field1358.field2222;
            if (arg2.field4097 != null && arg2.field4109 != null) {
                boolean var11 = false;
                long var12 = arg2.field4097.method1132(arg1 + 114);
                if (var8 <= 1) {
                    for (int var14 = 0; var14 < class149.field2840; var14++) {
                        if (class52.field1074[var14] == var12) {
                            var11 = true;
                            break;
                        }
                    }
                }
                if (!var11 && class195.field3786 == 0) {
                    class59.field1162.field2222 = 0;
                    class70.field1358.method745(var9, 0, true, class59.field1162.field2218);
                    class59.field1162.field2222 = 0;
                    class173 var15 = class83.method520(class197.method1312(105, class59.field1162).method1146((byte) -54));
                    arg2.field2774 = var15.method1122(126);
                    arg2.field2782 = var7 >> 8;
                    arg2.field2817 = 150;
                    arg2.field2750 = var7 & 0xFF;
                    if (var8 == 2 || var8 == 3) {
                        class166.method1074(class173.method1158(arg1 - 11, new class173[] { class168.field3238, arg2.field4097 }), 1, var15, arg1 ^ 0x7A);
                    } else if (var8 == 1) {
                        class166.method1074(class173.method1158(-3, new class173[] { class79.field1544, arg2.field4097 }), 1, var15, -97);
                    } else {
                        class166.method1074(arg2.field4097, 2, var15, arg1 ^ 0xFFFFFFB0);
                    }
                }
            }
            class70.field1358.field2222 = var10 + var9;
        }
        if ((arg3 & 0x10) != 0) {
            arg2.field2818 = class70.field1358.method742((byte) -98);
            if (arg2.field2818 == 65535) {
                arg2.field2818 = -1;
            }
        }
        if ((arg3 & 0x20) != 0) {
            int var16 = class70.field1358.method735((byte) -51);
            int var17 = class70.field1358.method751((byte) 92);
            arg2.method972((byte) 98, var17, var16, class217.field4203);
            arg2.field2808 = class217.field4203 + 300;
            arg2.field2784 = class70.field1358.method779(15151);
        }
        if ((arg3 & 0x80) != 0) {
            arg2.field2756 = class70.field1358.method755((byte) -45);
            arg2.field2770 = class70.field1358.method742((byte) -98);
        }
        if ((arg3 & 0x400) != 0) {
            arg2.field2805 = class70.field1358.method753(255);
            arg2.field2802 = class70.field1358.method753(255);
            arg2.field2776 = class70.field1358.method753(255);
            arg2.field2761 = class70.field1358.method779(15151);
            arg2.field2812 = class70.field1358.method758(true) + class217.field4203;
            arg2.field2759 = class70.field1358.method755((byte) -36) + class217.field4203;
            arg2.field2751 = class70.field1358.method779(15151);
            arg2.field2780 = 1;
            arg2.field2771 = 0;
        }
        if ((arg3 & 0x200) != 0) {
            int var18 = class70.field1358.method735((byte) -51);
            int var19 = class70.field1358.method779(15151);
            arg2.method972((byte) 98, var19, var18, class217.field4203);
        }
        if ((arg3 & 0x100) != 0) {
            arg2.field2778 = class70.field1358.method755((byte) -86);
            int var20 = class70.field1358.method776(102);
            arg2.field2799 = 0;
            arg2.field2803 = var20 >> 16;
            arg2.field2753 = (var20 & 0xFFFF) + class217.field4203;
            if (arg2.field2778 == 65535) {
                arg2.field2778 = -1;
            }
            arg2.field2777 = 0;
            if (arg2.field2753 > class217.field4203) {
                arg2.field2799 = -1;
            }
        }
        if ((arg3 & 0x40) == 0) {
            return;
        }
        int var21 = class70.field1358.method785(arg1 ^ 0xFFFFFFF7);
        int var22 = class70.field1358.method753(255);
        if (var21 == 65535) {
            var21 = -1;
        }
        class147.method971(0, var22, var21, arg2);
    }
}
