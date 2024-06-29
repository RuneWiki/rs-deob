import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jt")
public class class94 {

    @OriginalMember(owner = "client!jt", name = "q", descriptor = "Lkp;")
    private class456 field1213 = new class456();

    @OriginalMember(owner = "client!jt", name = "s", descriptor = "Lkp;")
    private class456 field1215 = new class456();

    @OriginalMember(owner = "client!jt", name = "t", descriptor = "Lkp;")
    private class456 field1216 = new class456();

    @OriginalMember(owner = "client!jt", name = "u", descriptor = "Lkp;")
    private class456 field1217 = new class456();

    @OriginalMember(owner = "client!jt", name = "v", descriptor = "Lji;")
    private class572 field1218 = new class572(4);

    @OriginalMember(owner = "client!jt", name = "z", descriptor = "I")
    public volatile int field1222 = 0;

    @OriginalMember(owner = "client!jt", name = "C", descriptor = "B")
    private byte field1225 = 0;

    @OriginalMember(owner = "client!jt", name = "B", descriptor = "I")
    public volatile int field1224 = 0;

    @OriginalMember(owner = "client!jt", name = "A", descriptor = "Lji;")
    private class572 field1223 = new class572(8);

    @OriginalMember(owner = "client!jt", name = "m", descriptor = "I")
    public static int field1209 = 0;

    @OriginalMember(owner = "client!jt", name = "j", descriptor = "[B")
    public static byte[] field1206 = new byte[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "I")
    public static int field1197;

    @OriginalMember(owner = "client!jt", name = "b", descriptor = "I")
    public static int field1198;

    @OriginalMember(owner = "client!jt", name = "c", descriptor = "I")
    public static int field1199;

    @OriginalMember(owner = "client!jt", name = "d", descriptor = "I")
    public static int field1200;

    @OriginalMember(owner = "client!jt", name = "f", descriptor = "I")
    public static int field1202;

    @OriginalMember(owner = "client!jt", name = "g", descriptor = "I")
    public static int field1203;

    @OriginalMember(owner = "client!jt", name = "h", descriptor = "I")
    public static int field1204;

    @OriginalMember(owner = "client!jt", name = "i", descriptor = "I")
    public static int field1205;

    @OriginalMember(owner = "client!jt", name = "k", descriptor = "I")
    public static int field1207;

    @OriginalMember(owner = "client!jt", name = "l", descriptor = "I")
    public static int field1208;

    @OriginalMember(owner = "client!jt", name = "n", descriptor = "I")
    public static int field1210;

    @OriginalMember(owner = "client!jt", name = "o", descriptor = "I")
    public static int field1211;

    @OriginalMember(owner = "client!jt", name = "p", descriptor = "I")
    public static int field1212;

    @OriginalMember(owner = "client!jt", name = "r", descriptor = "I")
    public static int field1214;

    @OriginalMember(owner = "client!jt", name = "x", descriptor = "I")
    private int field1220;

    @OriginalMember(owner = "client!jt", name = "w", descriptor = "J")
    private long field1219;

    @OriginalMember(owner = "client!jt", name = "y", descriptor = "Lok;")
    private class238 field1221;

    @OriginalMember(owner = "client!jt", name = "E", descriptor = "Lmj;")
    private class612 field1226;

    @OriginalMember(owner = "client!jt", name = "e", descriptor = "[Lxa;")
    public static class468[] field1201;

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(B)V", line = 4)
    public final void method691(byte arg0) {
        if (arg0 < 116) {
            this.field1222 = 40;
        }
        field1208++;
        if (this.field1221 == null) {
            return;
        }
        try {
            this.field1218.field7313 = 0;
            this.field1218.method3090(7, 3);
            this.field1218.method3056((byte) 106, 0);
            this.field1221.method1435(this.field1218.field7318, 4, -126, 0);
        } catch (IOException var3) {
            try {
                this.field1221.method1437(true);
            } catch (Exception var2) {
            }
            this.field1221 = null;
            this.field1222++;
            this.field1224 = -2;
        }
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(I)I", line = 31)
    public final int method692(int arg0) {
        if (arg0 != 0) {
            this.method704(82);
        }
        field1205++;
        return this.field1213.method2505((byte) 127) + this.field1215.method2505((byte) 124);
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(IBZII)Lmj;", line = 51)
    public final class612 method693(int arg0, byte arg1, boolean arg2, int arg3, int arg4) {
        field1197++;
        if (arg0 <= 52) {
            method702(94);
        }
        long var6 = (long) ((arg4 << 16) + arg3);
        class612 var8 = new class612();
        var8.field8318 = arg1;
        var8.field5343 = arg2;
        var8.field4648 = var6;
        if (arg2) {
            if (this.method692(0) >= 20) {
                throw new RuntimeException();
            }
            this.field1213.method2504((byte) -99, var8);
        } else if (this.method701((byte) -87) < 20) {
            this.field1216.method2504((byte) -118, var8);
        } else {
            throw new RuntimeException();
        }
        return var8;
    }

    @OriginalMember(owner = "client!jt", name = "b", descriptor = "(B)Z", line = 93)
    public final boolean method694(byte arg0) {
        if (arg0 == 3) {
            field1203++;
            return this.method692(0) >= 20;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jt", name = "c", descriptor = "(B)V", line = 104)
    public final void method695(byte arg0) {
        field1214++;
        if (arg0 != 0) {
            this.method695((byte) -77);
        }
        if (this.field1221 != null) {
            this.field1221.method1437(true);
        }
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(IZ)V", line = 122)
    public final void method696(int arg0, boolean arg1) {
        field1199++;
        if (this.field1221 == null) {
            return;
        }
        try {
            this.field1218.field7313 = 0;
            this.field1218.method3090(arg1 ? 2 : 3, arg0 ^ 0xFFFF9AE3);
            this.field1218.method3056((byte) 106, 0);
            this.field1221.method1435(this.field1218.field7318, 4, -128, 0);
        } catch (IOException var4) {
            try {
                this.field1221.method1437(true);
            } catch (Exception var3) {
            }
            this.field1222++;
            this.field1221 = null;
            this.field1224 = -2;
        }
        if (arg0 != -25888) {
            this.method698(12);
        }
    }

    @OriginalMember(owner = "client!jt", name = "b", descriptor = "(I)V", line = 151)
    public static void method697(int arg0) {
        field1201 = null;
        field1206 = null;
        if (arg0 != -2) {
            field1201 = null;
        }
    }

    @OriginalMember(owner = "client!jt", name = "c", descriptor = "(I)Z", line = 162)
    public final boolean method698(int arg0) {
        if (this.field1221 != null) {
            long var2 = class321.method1854(-112);
            int var4 = (int) (var2 - this.field1219);
            if (var4 > 200) {
                var4 = 200;
            }
            this.field1219 = var2;
            this.field1220 += var4;
            if (this.field1220 > 30000) {
                try {
                    this.field1221.method1437(true);
                } catch (Exception var28) {
                }
                this.field1221 = null;
            }
        }
        field1212++;
        if (this.field1221 == null) {
            return this.method692(0) == 0 && this.method701((byte) -68) == 0;
        }
        try {
            this.field1221.method1438((byte) 110);
            for (class612 var5 = (class612) this.field1213.method2502(false); var5 != null; var5 = (class612) this.field1213.method2509((byte) -120)) {
                this.field1218.field7313 = 0;
                this.field1218.method3090(1, 3);
                this.field1218.method3056((byte) 106, (int) var5.field4648);
                this.field1221.method1435(this.field1218.field7318, 4, -127, 0);
                this.field1215.method2504((byte) -110, var5);
            }
            for (class612 var6 = (class612) this.field1216.method2502(false); var6 != null; var6 = (class612) this.field1216.method2509((byte) -118)) {
                this.field1218.field7313 = 0;
                this.field1218.method3090(0, 3);
                this.field1218.method3056((byte) 106, (int) var6.field4648);
                this.field1221.method1435(this.field1218.field7318, 4, -126, 0);
                this.field1217.method2504((byte) -126, var6);
            }
            int var7 = -76 % ((20 - arg0) / 46);
            for (int var8 = 0; var8 < 100; var8++) {
                int var9 = this.field1221.method1436(0);
                if (var9 < 0) {
                    throw new IOException();
                }
                if (var9 == 0) {
                    break;
                }
                this.field1220 = 0;
                byte var10 = 0;
                if (this.field1226 == null) {
                    var10 = 8;
                } else if (this.field1226.field8323 == 0) {
                    var10 = 1;
                }
                if (var10 > 0) {
                    int var11 = var10 - this.field1223.field7313;
                    if (var11 > var9) {
                        var11 = var9;
                    }
                    this.field1221.method1434(-1, var11, this.field1223.field7318, this.field1223.field7313);
                    if (this.field1225 != 0) {
                        for (int var12 = 0; var12 < var11; var12++) {
                            this.field1223.field7318[this.field1223.field7313 + var12] = (byte) class289.method1735(this.field1223.field7318[this.field1223.field7313 + var12], this.field1225);
                        }
                    }
                    this.field1223.field7313 += var11;
                    if (var10 <= this.field1223.field7313) {
                        if (this.field1226 == null) {
                            this.field1223.field7313 = 0;
                            int var13 = this.field1223.method3097((byte) 12);
                            int var14 = this.field1223.method3031(-1);
                            int var15 = this.field1223.method3097((byte) 12);
                            int var16 = this.field1223.method3064(-2031091464);
                            int var17 = var15 & 0x7F;
                            boolean var18 = (var15 & 0x80) != 0;
                            long var19 = (long) ((var13 << 16) + var14);
                            Object var21 = null;
                            class612 var22;
                            if (var18) {
                                for (var22 = (class612) this.field1217.method2502(false); var22 != null && var22.field4648 != var19; var22 = (class612) this.field1217.method2509((byte) -124)) {
                                }
                            } else {
                                for (var22 = (class612) this.field1215.method2502(false); var22 != null && var22.field4648 != var19; var22 = (class612) this.field1215.method2509((byte) -12)) {
                                }
                            }
                            if (var22 == null) {
                                throw new IOException();
                            }
                            this.field1226 = var22;
                            int var23 = var17 == 0 ? 5 : 9;
                            this.field1226.field8319 = new class572(this.field1226.field8318 + var23 + var16);
                            this.field1226.field8319.method3090(var17, 3);
                            this.field1226.field8319.method3061(var16, (byte) 115);
                            this.field1223.field7313 = 0;
                            this.field1226.field8323 = 8;
                        } else if (this.field1226.field8323 != 0) {
                            throw new IOException();
                        } else if (this.field1223.field7318[0] == -1) {
                            this.field1223.field7313 = 0;
                            this.field1226.field8323 = 1;
                        } else {
                            this.field1226 = null;
                        }
                    }
                } else {
                    int var24 = this.field1226.field8319.field7318.length - this.field1226.field8318;
                    int var25 = 512 - this.field1226.field8323;
                    if ((var24 - this.field1226.field8319.field7313) < var25) {
                        var25 = var24 - this.field1226.field8319.field7313;
                    }
                    if (var9 < var25) {
                        var25 = var9;
                    }
                    this.field1221.method1434(-1, var25, this.field1226.field8319.field7318, this.field1226.field8319.field7313);
                    if (this.field1225 != 0) {
                        for (int var26 = 0; var26 < var25; var26++) {
                            this.field1226.field8319.field7318[this.field1226.field8319.field7313 + var26] = (byte) class289.method1735(this.field1226.field8319.field7318[this.field1226.field8319.field7313 + var26], this.field1225);
                        }
                    }
                    this.field1226.field8319.field7313 += var25;
                    this.field1226.field8323 += var25;
                    if (this.field1226.field8319.field7313 == var24) {
                        this.field1226.method2110(101);
                        this.field1226.field5346 = false;
                        this.field1226 = null;
                    } else if (this.field1226.field8323 == 512) {
                        this.field1226.field8323 = 0;
                    }
                }
            }
            return true;
        } catch (IOException var29) {
            try {
                this.field1221.method1437(true);
            } catch (Exception var27) {
            }
            this.field1222++;
            this.field1224 = -2;
            this.field1221 = null;
            return this.method692(0) == 0 && this.method701((byte) -66) == 0;
        }
    }

    @OriginalMember(owner = "client!jt", name = "d", descriptor = "(I)V", line = 436)
    public final void method699(int arg0) {
        if (arg0 == 200) {
            field1202++;
            if (this.field1221 != null) {
                this.field1221.method1439(113);
            }
        }
    }

    @OriginalMember(owner = "client!jt", name = "d", descriptor = "(B)Z", line = 450)
    public final boolean method700(byte arg0) {
        if (arg0 >= -122) {
            return false;
        } else {
            field1204++;
            return this.method701((byte) -54) >= 20;
        }
    }

    @OriginalMember(owner = "client!jt", name = "e", descriptor = "(B)I", line = 464)
    private final int method701(byte arg0) {
        field1210++;
        if (arg0 >= -42) {
            this.field1215 = null;
        }
        return this.field1216.method2505((byte) 125) + this.field1217.method2505((byte) 122);
    }

    @OriginalMember(owner = "client!jt", name = "e", descriptor = "(I)V", line = 480)
    public static final void method702(int arg0) {
        if (arg0 != 12475) {
            method697(-111);
        }
        field1198++;
        class650.field8783.method1218(109);
    }

    @OriginalMember(owner = "client!jt", name = "f", descriptor = "(I)V", line = 491)
    private final void method703(int arg0) {
        if (arg0 != -27286) {
            return;
        }
        field1211++;
        if (this.field1221 == null) {
            return;
        }
        try {
            this.field1218.field7313 = 0;
            this.field1218.method3090(6, 3);
            this.field1218.method3056((byte) 106, 3);
            this.field1221.method1435(this.field1218.field7318, 4, -125, 0);
        } catch (IOException var3) {
            try {
                this.field1221.method1437(true);
            } catch (Exception var2) {
            }
            this.field1221 = null;
            this.field1222++;
            this.field1224 = -2;
        }
    }

    @OriginalMember(owner = "client!jt", name = "g", descriptor = "(I)V", line = 522)
    public final void method704(int arg0) {
        field1200++;
        try {
            this.field1221.method1437(true);
        } catch (Exception var2) {
        }
        this.field1221 = null;
        this.field1224 = -1;
        this.field1222++;
        if (arg0 != 19922) {
            this.method699(-22);
        }
        this.field1225 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(ZZLok;)V", line = 545)
    public final void method705(boolean arg0, boolean arg1, class238 arg2) {
        field1207++;
        if (this.field1221 != null) {
            try {
                this.field1221.method1437(true);
            } catch (Exception var8) {
            }
            this.field1221 = null;
        }
        this.field1221 = arg2;
        this.method703(-27286);
        this.method696(-25888, arg0);
        this.field1223.field7313 = 0;
        this.field1226 = null;
        while (true) {
            class612 var4 = (class612) this.field1215.method2507((byte) 80);
            if (var4 == null) {
                while (true) {
                    class612 var5 = (class612) this.field1217.method2507((byte) 80);
                    if (var5 == null) {
                        if (arg1) {
                            field1201 = null;
                        }
                        if (this.field1225 != 0) {
                            try {
                                this.field1218.field7313 = 0;
                                this.field1218.method3090(4, 3);
                                this.field1218.method3090(this.field1225, 3);
                                this.field1218.method3080((byte) -80, 0);
                                this.field1221.method1435(this.field1218.field7318, 4, -127, 0);
                            } catch (IOException var7) {
                                try {
                                    this.field1221.method1437(true);
                                } catch (Exception var6) {
                                }
                                this.field1221 = null;
                                this.field1224 = -2;
                                this.field1222++;
                            }
                        }
                        this.field1220 = 0;
                        this.field1219 = class321.method1854(-23);
                        return;
                    }
                    this.field1216.method2504((byte) -127, var5);
                }
            }
            this.field1213.method2504((byte) -106, var4);
        }
    }
}
