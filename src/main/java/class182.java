import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class182 {

    @OriginalMember(owner = "client!vb", name = "p", descriptor = "Lbl;")
    private class191 field3019 = new class191();

    @OriginalMember(owner = "client!vb", name = "x", descriptor = "Lbl;")
    private class191 field3027 = new class191();

    @OriginalMember(owner = "client!vb", name = "y", descriptor = "Lbl;")
    private class191 field3028 = new class191();

    @OriginalMember(owner = "client!vb", name = "z", descriptor = "Lbl;")
    private class191 field3029 = new class191();

    @OriginalMember(owner = "client!vb", name = "C", descriptor = "Ljj;")
    private class44 field3032 = new class44(4);

    @OriginalMember(owner = "client!vb", name = "F", descriptor = "I")
    public volatile int field3034 = 0;

    @OriginalMember(owner = "client!vb", name = "H", descriptor = "I")
    public volatile int field3036 = 0;

    @OriginalMember(owner = "client!vb", name = "I", descriptor = "B")
    private byte field3037 = 0;

    @OriginalMember(owner = "client!vb", name = "G", descriptor = "Ljj;")
    private class44 field3035 = new class44(8);

    @OriginalMember(owner = "client!vb", name = "j", descriptor = "I")
    public static int field3013 = -1;

    @OriginalMember(owner = "client!vb", name = "g", descriptor = "Z")
    public static volatile boolean field3010 = true;

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "[I")
    public static int[] field3005 = new int[25];

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "Lcd;")
    public static class69 field3004 = new class69(16);

    @OriginalMember(owner = "client!vb", name = "w", descriptor = "I")
    public static int field3026 = 0;

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "I")
    public static int field3006;

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "I")
    public static int field3007;

    @OriginalMember(owner = "client!vb", name = "e", descriptor = "I")
    public static int field3008;

    @OriginalMember(owner = "client!vb", name = "f", descriptor = "I")
    public static int field3009;

    @OriginalMember(owner = "client!vb", name = "h", descriptor = "I")
    public static int field3011;

    @OriginalMember(owner = "client!vb", name = "i", descriptor = "I")
    public static int field3012;

    @OriginalMember(owner = "client!vb", name = "k", descriptor = "I")
    public static int field3014;

    @OriginalMember(owner = "client!vb", name = "l", descriptor = "I")
    public static int field3015;

    @OriginalMember(owner = "client!vb", name = "m", descriptor = "I")
    public static int field3016;

    @OriginalMember(owner = "client!vb", name = "n", descriptor = "I")
    public static int field3017;

    @OriginalMember(owner = "client!vb", name = "o", descriptor = "I")
    public static int field3018;

    @OriginalMember(owner = "client!vb", name = "q", descriptor = "I")
    public static int field3020;

    @OriginalMember(owner = "client!vb", name = "r", descriptor = "I")
    public static int field3021;

    @OriginalMember(owner = "client!vb", name = "s", descriptor = "I")
    public static int field3022;

    @OriginalMember(owner = "client!vb", name = "t", descriptor = "I")
    public static int field3023;

    @OriginalMember(owner = "client!vb", name = "u", descriptor = "I")
    public static int field3024;

    @OriginalMember(owner = "client!vb", name = "B", descriptor = "I")
    private int field3031;

    @OriginalMember(owner = "client!vb", name = "D", descriptor = "J")
    private long field3033;

    @OriginalMember(owner = "client!vb", name = "A", descriptor = "Li;")
    private class15 field3030;

    @OriginalMember(owner = "client!vb", name = "v", descriptor = "Lak;")
    public static class172 field3025;

    @OriginalMember(owner = "client!vb", name = "K", descriptor = "Lab;")
    private class298 field3038;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(B)Z", line = 6)
    public final boolean method1359(byte arg0) {
        if (arg0 < 85) {
            return false;
        } else {
            field3006++;
            return this.method1364(-126) >= 20;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(I)V", line = 17)
    public static void method1360(int arg0) {
        field3005 = null;
        if (arg0 != 1) {
            method1362(-20, (byte) -28, -78);
        }
        field3025 = null;
        field3004 = null;
    }

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(B)V", line = 30)
    public final void method1361(byte arg0) {
        try {
            this.field3030.method91(-70);
        } catch (Exception var3) {
        }
        field3017++;
        this.field3034++;
        this.field3030 = null;
        this.field3036 = -1;
        this.field3037 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
        if (arg0 > -85) {
            field3026 = 8;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IBI)V", line = 52)
    public static final void method1362(int arg0, byte arg1, int arg2) {
        field3015++;
        class344 var3 = class110.method759(12, arg2, false);
        var3.method2390((byte) -47);
        var3.field5354 = arg0;
        if (arg1 > -65) {
            method1360(-19);
        }
    }

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(I)V", line = 67)
    public static final void method1363(int arg0) {
        if (arg0 != -16467) {
            field3004 = (class69) null;
        }
        for (int var1 = 0; var1 < class192.field3138; var1++) {
            int var2 = class322.field4988[var1];
            class234 var3 = class99.field1445[var2];
            int var4 = class247.field3898.method286((byte) -110);
            if ((var4 & 0x2) != 0) {
                var4 += class247.field3898.method286((byte) -69) << 8;
            }
            if ((var4 & 0x4) != 0) {
                int var5 = class247.field3898.method282((byte) -97);
                if (var5 == 65535) {
                    var5 = -1;
                }
                boolean var6 = true;
                int var7 = class247.field3898.method238((byte) 82);
                if (var5 != -1 && var3.field4278 != -1 && class325.method2274(class215.method1545(var5, 1).field5011, -76).field3279 < class325.method2274(class215.method1545(var3.field4278, 1).field5011, arg0 ^ 0x4035).field3279) {
                    var6 = false;
                }
                if (var6) {
                    var3.field4276 = 0;
                    var3.field4267 = 1;
                    var3.field4236 = (var7 & 0xFFFF) + class240.field3818;
                    if (class240.field3818 < var3.field4236) {
                        var3.field4276 = -1;
                    }
                    var3.field4278 = var5;
                    var3.field4211 = 0;
                    var3.field4206 = var7 >> 16;
                    if (var3.field4278 != -1 && class240.field3818 == var3.field4236) {
                        int var8 = class215.method1545(var3.field4278, arg0 ^ 0xFFFFBFAC).field5011;
                        if (var8 != -1) {
                            class202 var9 = class325.method2274(var8, -105);
                            if (var9 != null && var9.field3293 != null) {
                                class190.method1411(31, false, var9, var3.field4264, 0, var3.field4255);
                            }
                        }
                    }
                }
            }
            if ((var4 & 0x20) != 0) {
                int var10 = class247.field3898.method221((byte) -78);
                int var11 = class247.field3898.method286((byte) -124);
                var3.method1879(0, var11, var10, class240.field3818);
            }
            if ((var4 & 0x100) != 0) {
                int var12 = class247.field3898.method286((byte) -100);
                int[] var13 = new int[var12];
                int[] var14 = new int[var12];
                int[] var15 = new int[var12];
                for (int var16 = 0; var16 < var12; var16++) {
                    int var17 = class247.field3898.method271(arg0 + 37548);
                    if (var17 == 65535) {
                        var17 = -1;
                    }
                    var14[var16] = var17;
                    var15[var16] = class247.field3898.method248(true);
                    var13[var16] = class247.field3898.method282((byte) -97);
                }
                class222.method1583(false, var15, var13, var14, var3);
            }
            if ((var4 & 0x80) != 0) {
                var3.field4198 = class247.field3898.method267((byte) -79);
                if (var3.field4198 == 65535) {
                    var3.field4198 = -1;
                }
            }
            if ((var4 & 0x1) != 0) {
                var3.field4240 = class247.field3898.method265(arg0 ^ 0xFFFFBFAD);
                var3.field4257 = 100;
            }
            if ((var4 & 0x8) != 0) {
                int var18 = class247.field3898.method221((byte) -78);
                int var19 = class247.field3898.method263(true);
                var3.method1879(0, var19, var18, class240.field3818);
                var3.field4183 = class240.field3818 + 300;
                var3.field4223 = class247.field3898.method221((byte) -78);
            }
            if ((var4 & 0x200) != 0) {
                var3.field4241 = class247.field3898.method271(21081);
                var3.field4202 = class247.field3898.method282((byte) -97);
            }
            if ((var4 & 0x40) != 0) {
                if (var3.field3752.method1841(false)) {
                    class189.method1401(-1, var3);
                }
                var3.method1697(3734, class98.method666((byte) -65, class247.field3898.method282((byte) -97)));
                var3.method1883(arg0 + 16491, var3.field3752.field4051);
                var3.field4234 = var3.field3752.field4103;
                var3.field4185 = var3.field3752.field4125;
                if (var3.field3752.method1841(false)) {
                    class215.method1546((class97) null, 128, (class334) null, class49.field698, var3, var3.field4248[0], var3.field4184[0], 0);
                }
            }
            if ((var4 & 0x10) != 0) {
                int var20 = class247.field3898.method271(21081);
                if (var20 == 65535) {
                    var20 = -1;
                }
                int var21 = class247.field3898.method263(true);
                class70.method463(var21, var20, var3, false);
            }
        }
        field3009++;
    }

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "(I)I", line = 248)
    public final int method1364(int arg0) {
        if (arg0 >= -30) {
            return 108;
        } else {
            field3021++;
            return this.field3019.method1417(100) + this.field3027.method1417(100);
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IZ)V", line = 262)
    public final void method1365(int arg0, boolean arg1) {
        field3022++;
        if (this.field3030 == null) {
            return;
        }
        try {
            this.field3032.field586 = 0;
            if (arg0 <= 58) {
                return;
            }
            this.field3032.method257(-2, arg1 ? 2 : 3);
            this.field3032.method236(-120, 0);
            this.field3030.method85((byte) -103, 4, this.field3032.field573, 0);
        } catch (IOException var6) {
            try {
                this.field3030.method91(-20);
            } catch (Exception var5) {
            }
            this.field3034++;
            this.field3030 = null;
            this.field3036 = -2;
        }
    }

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "(I)I", line = 290)
    private final int method1366(int arg0) {
        if (arg0 != -1) {
            field3005 = (int[]) null;
        }
        field3012++;
        return this.field3028.method1417(100) + this.field3029.method1417(arg0 ^ 0xFFFFFF9B);
    }

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "(B)Z", line = 302)
    public final boolean method1367(byte arg0) {
        if (this.field3030 != null) {
            long var2 = class283.method2038((byte) 127);
            int var4 = (int) (var2 - this.field3033);
            if (var4 > 200) {
                var4 = 200;
            }
            this.field3033 = var2;
            this.field3031 += var4;
            if (this.field3031 > 30000) {
                try {
                    this.field3030.method91(-94);
                } catch (Exception var30) {
                }
                this.field3030 = null;
            }
        }
        field3023++;
        if (this.field3030 == null) {
            return this.method1364(-43) == 0 && this.method1366(-1) == 0;
        }
        try {
            if (arg0 >= -126) {
                this.method1369((byte) -88, -86, false, (byte) 121, 117);
            }
            this.field3030.method90((byte) -114);
            for (class298 var6 = (class298) this.field3019.method1419(200); var6 != null; var6 = (class298) this.field3019.method1416((byte) -124)) {
                this.field3032.field586 = 0;
                this.field3032.method257(-2, 1);
                this.field3032.method236(45, (int) var6.field109);
                this.field3030.method85((byte) -101, 4, this.field3032.field573, 0);
                this.field3027.method1412(var6, (byte) -2);
            }
            for (class298 var7 = (class298) this.field3028.method1419(200); var7 != null; var7 = (class298) this.field3028.method1416((byte) -126)) {
                this.field3032.field586 = 0;
                this.field3032.method257(-2, 0);
                this.field3032.method236(-128, (int) var7.field109);
                this.field3030.method85((byte) -121, 4, this.field3032.field573, 0);
                this.field3029.method1412(var7, (byte) -2);
            }
            for (int var8 = 0; var8 < 100; var8++) {
                int var9 = this.field3030.method87(5000);
                if (var9 < 0) {
                    throw new IOException();
                }
                if (var9 == 0) {
                    break;
                }
                this.field3031 = 0;
                byte var10 = 0;
                if (this.field3038 == null) {
                    var10 = 8;
                } else if (this.field3038.field4711 == 0) {
                    var10 = 1;
                }
                if (var10 <= 0) {
                    int var11 = 512 - this.field3038.field4711;
                    int var12 = this.field3038.field4710.field573.length - this.field3038.field4706;
                    if ((var12 - this.field3038.field4710.field586) < var11) {
                        var11 = var12 - this.field3038.field4710.field586;
                    }
                    if (var11 > var9) {
                        var11 = var9;
                    }
                    this.field3030.method89(var11, true, this.field3038.field4710.field573, this.field3038.field4710.field586);
                    if (this.field3037 != 0) {
                        for (int var13 = 0; var13 < var11; var13++) {
                            this.field3038.field4710.field573[this.field3038.field4710.field586 + var13] = (byte) class152.method1101(this.field3038.field4710.field573[this.field3038.field4710.field586 + var13], this.field3037);
                        }
                    }
                    this.field3038.field4711 += var11;
                    this.field3038.field4710.field586 += var11;
                    if (this.field3038.field4710.field586 == var12) {
                        this.field3038.method42((byte) -124);
                        this.field3038.field1190 = false;
                        this.field3038 = null;
                    } else if (this.field3038.field4711 == 512) {
                        this.field3038.field4711 = 0;
                    }
                } else {
                    int var14 = var10 - this.field3035.field586;
                    if (var14 > var9) {
                        var14 = var9;
                    }
                    this.field3030.method89(var14, true, this.field3035.field573, this.field3035.field586);
                    if (this.field3037 != 0) {
                        for (int var15 = 0; var15 < var14; var15++) {
                            this.field3035.field573[this.field3035.field586 + var15] = (byte) class152.method1101(this.field3035.field573[this.field3035.field586 + var15], this.field3037);
                        }
                    }
                    this.field3035.field586 += var14;
                    if (this.field3035.field586 >= var10) {
                        if (this.field3038 == null) {
                            this.field3035.field586 = 0;
                            int var16 = this.field3035.method286((byte) -111);
                            int var17 = this.field3035.method271(21081);
                            int var18 = this.field3035.method286((byte) -93);
                            int var19 = this.field3035.method238((byte) 82);
                            boolean var20 = (var18 & 0x80) != 0;
                            long var21 = (long) ((var16 << 16) + var17);
                            Object var23 = null;
                            int var24 = var18 & 0x7F;
                            class298 var25;
                            if (var20) {
                                for (var25 = (class298) this.field3029.method1419(200); var25 != null && var25.field109 != var21; var25 = (class298) this.field3029.method1416((byte) -127)) {
                                }
                            } else {
                                for (var25 = (class298) this.field3027.method1419(200); var25 != null && var25.field109 != var21; var25 = (class298) this.field3027.method1416((byte) -124)) {
                                }
                            }
                            if (var25 == null) {
                                throw new IOException();
                            }
                            int var26 = var24 == 0 ? 5 : 9;
                            this.field3038 = var25;
                            this.field3038.field4710 = new class44(var19 + this.field3038.field4706 + var26);
                            this.field3038.field4710.method257(-2, var24);
                            this.field3038.field4710.method283((byte) -51, var19);
                            this.field3038.field4711 = 8;
                            this.field3035.field586 = 0;
                        } else if (this.field3038.field4711 != 0) {
                            throw new IOException();
                        } else if (this.field3035.field573[0] == -1) {
                            this.field3035.field586 = 0;
                            this.field3038.field4711 = 1;
                        } else {
                            this.field3038 = null;
                        }
                    }
                }
            }
            return true;
        } catch (IOException var31) {
            try {
                this.field3030.method91(-89);
            } catch (Exception var29) {
            }
            this.field3036 = -2;
            this.field3034++;
            this.field3030 = null;
            return this.method1364(-82) == 0 && this.method1366(-1) == 0;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Li;ZZ)V", line = 580)
    public final void method1368(class15 arg0, boolean arg1, boolean arg2) {
        field3016++;
        if (this.field3030 != null) {
            try {
                this.field3030.method91(-62);
            } catch (Exception var11) {
            }
            this.field3030 = null;
        }
        this.field3030 = arg0;
        if (arg1) {
            this.field3036 = 46;
        }
        this.method1373(arg1);
        this.method1365(111, arg2);
        this.field3038 = null;
        this.field3035.field586 = 0;
        while (true) {
            class298 var5 = (class298) this.field3027.method1413(0);
            if (var5 == null) {
                while (true) {
                    class298 var6 = (class298) this.field3029.method1413(0);
                    if (var6 == null) {
                        if (this.field3037 != 0) {
                            try {
                                this.field3032.field586 = 0;
                                this.field3032.method257(-2, 4);
                                this.field3032.method257(-2, this.field3037);
                                this.field3032.method287(0, 0);
                                this.field3030.method85((byte) -102, 4, this.field3032.field573, 0);
                            } catch (IOException var10) {
                                try {
                                    this.field3030.method91(-102);
                                } catch (Exception var9) {
                                }
                                this.field3034++;
                                this.field3030 = null;
                                this.field3036 = -2;
                            }
                        }
                        this.field3031 = 0;
                        this.field3033 = class283.method2038((byte) 123);
                        return;
                    }
                    this.field3028.method1412(var6, (byte) -2);
                }
            }
            this.field3019.method1412(var5, (byte) -2);
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(BIZBI)Lab;", line = 648)
    public final class298 method1369(byte arg0, int arg1, boolean arg2, byte arg3, int arg4) {
        if (arg3 != -103) {
            this.field3019 = (class191) null;
        }
        field3011++;
        class298 var6 = new class298();
        var6.field1184 = arg2;
        var6.field4706 = arg0;
        long var7 = (long) ((arg4 << 16) + arg1);
        var6.field109 = var7;
        if (arg2) {
            if (this.method1364(-72) >= 20) {
                throw new RuntimeException();
            }
            this.field3019.method1412(var6, (byte) -2);
        } else if (this.method1366(arg3 + 102) < 20) {
            this.field3028.method1412(var6, (byte) -2);
        } else {
            throw new RuntimeException();
        }
        return var6;
    }

    @OriginalMember(owner = "client!vb", name = "e", descriptor = "(I)V", line = 691)
    public final void method1370(int arg0) {
        if (this.field3030 != null) {
            this.field3030.method88(18343);
        }
        field3024++;
        int var2 = 108 / ((arg0 - 31) / 63);
    }

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "(B)V", line = 704)
    public final void method1371(byte arg0) {
        field3008++;
        if (this.field3030 == null) {
            return;
        }
        try {
            this.field3032.field586 = 0;
            this.field3032.method257(-2, 7);
            int var2 = -72 / ((43 - arg0) / 38);
            this.field3032.method236(-82, 0);
            this.field3030.method85((byte) -99, 4, this.field3032.field573, 0);
        } catch (IOException var6) {
            try {
                this.field3030.method91(-124);
            } catch (Exception var5) {
            }
            this.field3030 = null;
            this.field3036 = -2;
            this.field3034++;
        }
    }

    @OriginalMember(owner = "client!vb", name = "e", descriptor = "(B)V", line = 738)
    public final void method1372(byte arg0) {
        if (this.field3030 != null) {
            this.field3030.method91(-65);
        }
        if (arg0 <= -63) {
            field3018++;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Z)V", line = 760)
    private final void method1373(boolean arg0) {
        field3014++;
        if (this.field3030 == null) {
            return;
        }
        try {
            this.field3032.field586 = 0;
            this.field3032.method257(-2, 6);
            this.field3032.method236(-79, 3);
            this.field3030.method85((byte) -114, 4, this.field3032.field573, 0);
        } catch (IOException var5) {
            try {
                this.field3030.method91(-78);
            } catch (Exception var4) {
            }
            this.field3030 = null;
            this.field3034++;
            this.field3036 = -2;
        }
        if (arg0) {
            this.field3032 = (class44) null;
        }
    }

    @OriginalMember(owner = "client!vb", name = "f", descriptor = "(I)Z", line = 800)
    public final boolean method1374(int arg0) {
        field3020++;
        if (arg0 == -21) {
            return this.method1366(arg0 + 20) >= 20;
        } else {
            return false;
        }
    }
}
