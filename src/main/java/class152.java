import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public abstract class class152 {

    @OriginalMember(owner = "client!vf", name = "g", descriptor = "I")
    public static int field3470 = 0;

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "Lod;")
    private static class101 field3466 = class46.method335(-85, "To create a new account you need to");

    @OriginalMember(owner = "client!vf", name = "m", descriptor = "Lod;")
    public static class101 field3476 = field3466;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "I")
    public static int field3464;

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "I")
    public static int field3465;

    @OriginalMember(owner = "client!vf", name = "e", descriptor = "I")
    public static int field3468;

    @OriginalMember(owner = "client!vf", name = "h", descriptor = "I")
    public static int field3471;

    @OriginalMember(owner = "client!vf", name = "i", descriptor = "I")
    public static int field3472;

    @OriginalMember(owner = "client!vf", name = "k", descriptor = "I")
    public static int field3474;

    @OriginalMember(owner = "client!vf", name = "l", descriptor = "I")
    public static int field3475;

    @OriginalMember(owner = "client!vf", name = "n", descriptor = "I")
    public static int field3477;

    @OriginalMember(owner = "client!vf", name = "f", descriptor = "Lt;")
    public static class132 field3469;

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "Lc;")
    public static class15 field3467;

    @OriginalMember(owner = "client!vf", name = "j", descriptor = "Lke;")
    public static class74 field3473;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(BLbe;II)V")
    public static final void method1178(byte arg0, class13 arg1, int arg2, int arg3) {
        field3468++;
        if ((arg3 & 0x4) != 0) {
            int var4 = class118.field2611.method1098(true);
            int var5 = class118.field2611.method1077(4);
            int var6 = class118.field2611.method1077(4);
            int var7 = class118.field2611.field3175;
            if (arg1.field276 != null && arg1.field255 != null) {
                long var8 = arg1.field276.method717(-96);
                boolean var10 = false;
                if (var5 <= 1) {
                    for (int var11 = 0; var11 < class73.field1579; var11++) {
                        if (class29.field768[var11] == var8) {
                            var10 = true;
                            break;
                        }
                    }
                }
                if (!var10 && class133.field3051 == 0) {
                    class89.field1930.field3175 = 0;
                    class118.field2611.method1103(class89.field1930.field3213, var6, false, 0);
                    class89.field1930.field3175 = 0;
                    class101 var12 = class114.method848(class11.method84(class89.field1930, -124).method729((byte) 65));
                    arg1.field1305 = var12.method726(false);
                    arg1.field1282 = 150;
                    arg1.field1347 = var4 & 0xFF;
                    arg1.field1328 = var4 >> 8;
                    if (var5 == 2 || var5 == 3) {
                        class111.method818(1, class15.method101(111, new class101[] { class127.field2878, arg1.field276 }), 28960, var12);
                    } else if (var5 == 1) {
                        class111.method818(1, class15.method101(-65, new class101[] { class8.field131, arg1.field276 }), 28960, var12);
                    } else {
                        class111.method818(2, arg1.field276, 28960, var12);
                    }
                }
            }
            class118.field2611.field3175 = var6 + var7;
        }
        if ((arg3 & 0x200) != 0) {
            arg1.field1290 = class118.field2611.method1080((byte) -99);
            arg1.field1295 = class118.field2611.method1055(116);
            arg1.field1325 = class118.field2611.method1080((byte) 127);
            arg1.field1312 = class118.field2611.method1080((byte) -17);
            arg1.field1322 = class118.field2611.method1084(-91) + class143.field3305;
            arg1.field1349 = class118.field2611.method1098(true) + class143.field3305;
            arg1.field1343 = class118.field2611.method1055(115);
            arg1.field1333 = 1;
            arg1.field1286 = 0;
        }
        if ((arg3 & 0x20) != 0) {
            int var13 = class118.field2611.method1055(115);
            byte[] var14 = new byte[var13];
            class138 var15 = new class138(var14);
            class118.field2611.method1072(0, var13, (byte) -106, var14);
            class82.field1774[arg2] = var15;
            arg1.method92(var15, true);
        }
        if ((arg3 & 0x400) != 0) {
            arg1.field1311 = class118.field2611.method1053((byte) -34);
            int var16 = class118.field2611.method1095(-2);
            arg1.field1332 = var16 >> 16;
            arg1.field1337 = (var16 & 0xFFFF) + class143.field3305;
            arg1.field1317 = 0;
            arg1.field1329 = 0;
            if (class143.field3305 < arg1.field1337) {
                arg1.field1329 = -1;
            }
            if (arg1.field1311 == 65535) {
                arg1.field1311 = -1;
            }
        }
        if ((arg3 & 0x100) != 0) {
            int var17 = class118.field2611.method1080((byte) -66);
            int var18 = class118.field2611.method1055(112);
            arg1.method404(class143.field3305, var18, (byte) -110, var17);
            arg1.field1281 = class143.field3305 + 300;
            arg1.field1304 = class118.field2611.method1077(4);
            arg1.field1345 = class118.field2611.method1080((byte) 120);
        }
        if ((arg3 & 0x80) != 0) {
            arg1.field1305 = class118.field2611.method1058((byte) -122);
            if (arg1.field1305.method730(-125, 0) == 126) {
                arg1.field1305 = arg1.field1305.method707((byte) 101, 1);
                class111.method818(2, arg1.field276, 28960, arg1.field1305);
            } else if (class82.field1778 == arg1) {
                class111.method818(2, arg1.field276, 28960, arg1.field1305);
            }
            arg1.field1347 = 0;
            arg1.field1328 = 0;
            arg1.field1282 = 150;
        }
        if (arg0 > -53) {
            method1178((byte) -54, null, -70, -112);
        }
        if ((arg3 & 0x1) != 0) {
            arg1.field1270 = class118.field2611.method1098(true);
            arg1.field1306 = class118.field2611.method1053((byte) 125);
        }
        if ((arg3 & 0x10) != 0) {
            int var19 = class118.field2611.method1080((byte) 127);
            int var20 = class118.field2611.method1055(113);
            arg1.method404(class143.field3305, var20, (byte) -122, var19);
            arg1.field1281 = class143.field3305 + 300;
            arg1.field1304 = class118.field2611.method1055(125);
            arg1.field1345 = class118.field2611.method1055(120);
        }
        if ((arg3 & 0x8) != 0) {
            arg1.field1339 = class118.field2611.method1053((byte) 127);
            if (arg1.field1339 == 65535) {
                arg1.field1339 = -1;
            }
        }
        if ((arg3 & 0x40) == 0) {
            return;
        }
        int var21 = class118.field2611.method1053((byte) 126);
        int var22 = class118.field2611.method1077(4);
        if (var21 == 65535) {
            var21 = -1;
        }
        class101.method728(var21, 0, var22, arg1);
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(II)Lsf;")
    public static final class131 method1179(int arg0, int arg1) {
        field3474++;
        class131 var2 = (class131) class153.field3488.method140(true, (long) arg1);
        if (arg0 != -25570) {
            method1184(-84, -42, 8, -21, -89);
        }
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class129.field2955.method114((byte) 111, 4, arg1);
        class131 var4 = new class131();
        if (var3 != null) {
            var4.method1013(-1, arg1, new class138(var3));
        }
        var4.method1010(true);
        class153.field3488.method141(var4, (long) arg1, (byte) -3);
        return var4;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(B)V")
    public abstract void method12(byte arg0);

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Z)V")
    public static void method1180(boolean arg0) {
        field3476 = null;
        field3473 = null;
        field3469 = null;
        field3466 = null;
        if (arg0) {
            field3473 = null;
        }
        field3467 = null;
    }

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(II)I")
    public static final int method1181(int arg0, int arg1) {
        int var2 = (arg1 >>> 1 & 0x55555555) + (arg1 & 0x55555555);
        field3472++;
        int var3 = (var2 & 0x33333333) + ((var2 & 0xCCCCCCCF) >>> 2);
        int var4 = (var3 >>> 4) + var3 & 0xF0F0F0F;
        if (arg0 < 89) {
            method1178((byte) 21, null, -110, 124);
        }
        int var5 = (var4 >>> 8) + var4;
        int var6 = (var5 >>> 16) + var5;
        return var6 & 0xFF;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(III)I")
    public abstract int method13(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(I)V")
    public static final void method1182(int arg0) {
        field3475++;
        int var1 = 120 % ((arg0 + 20) / 44);
        Object var2 = class90.field1955;
        synchronized (class90.field1955) {
            if (class35.field898 != 0) {
                class35.field898 = 1;
                try {
                    class90.field1955.wait();
                } catch (InterruptedException var3) {
                }
            }
        }
    }

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "(II)Lod;")
    public static final class101 method1183(int arg0, int arg1) {
        field3471++;
        if (arg1 != 0) {
            field3466 = null;
        }
        return class15.method101(arg1 - 19, new class101[] { class82.method592(false, arg0 >> 24 & 0xFF), class18.field391, class82.method592(false, arg0 >> 16 & 0xFF), class18.field391, class82.method592(false, arg0 >> 8 & 0xFF), class18.field391, class82.method592(false, arg0 & 0xFF) });
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIIII)V")
    public static final void method1184(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 > -3) {
            return;
        }
        for (class157 var5 = (class157) class20.field425.method523(false); var5 != null; var5 = (class157) class20.field425.method527(true)) {
            if (var5.field3619 != -1 || var5.field3623 != null) {
                int var6 = 0;
                if (arg4 > var5.field3618) {
                    var6 += arg4 - var5.field3618;
                } else if (var5.field3601 > arg4) {
                    var6 += var5.field3601 - arg4;
                }
                if (arg3 > var5.field3620) {
                    var6 += arg3 - var5.field3620;
                } else if (var5.field3603 > arg3) {
                    var6 += var5.field3603 - arg3;
                }
                if (var6 - 64 > var5.field3608 || class145.field3332 == 0 || var5.field3614 != arg0) {
                    if (var5.field3615 != null) {
                        class133.field3039.method509(var5.field3615);
                        var5.field3615 = null;
                    }
                    if (var5.field3617 != null) {
                        class133.field3039.method509(var5.field3617);
                        var5.field3617 = null;
                    }
                } else {
                    var6 -= 64;
                    if (var6 < 0) {
                        var6 = 0;
                    }
                    int var7 = (var5.field3608 - var6) * class145.field3332 / var5.field3608;
                    if (var5.field3615 != null) {
                        var5.field3615.method494(var7);
                    } else if (var5.field3619 >= 0) {
                        class14 var8 = class14.method99(class141.field3258, var5.field3619, 0);
                        if (var8 != null) {
                            class123 var9 = var8.method100().method939(class44.field1049);
                            class68 var10 = class68.method493(var9, 100, var7);
                            var10.method455(-1);
                            class133.field3039.method504(var10);
                            var5.field3615 = var10;
                        }
                    }
                    if (var5.field3617 != null) {
                        var5.field3617.method494(var7);
                        if (!var5.field3617.method962(-31928)) {
                            var5.field3617 = null;
                        }
                    } else if (var5.field3623 != null && (var5.field3605 -= arg1) <= 0) {
                        int var11 = (int) ((double) var5.field3623.length * Math.random());
                        class14 var12 = class14.method99(class141.field3258, var5.field3623[var11], 0);
                        if (var12 != null) {
                            class123 var13 = var12.method100().method939(class44.field1049);
                            class68 var14 = class68.method493(var13, 100, var7);
                            var14.method455(0);
                            class133.field3039.method504(var14);
                            var5.field3605 = var5.field3612 + (int) (Math.random() * (double) (var5.field3624 - var5.field3612));
                            var5.field3617 = var14;
                        }
                    }
                }
            }
        }
        field3477++;
    }
}
