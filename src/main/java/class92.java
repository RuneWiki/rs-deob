import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class92 {

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "Lnf;")
    private class251 field1365 = new class251();

    @OriginalMember(owner = "client!jd", name = "j", descriptor = "Lnf;")
    private class251 field1374 = new class251();

    @OriginalMember(owner = "client!jd", name = "t", descriptor = "Lnf;")
    private class251 field1384 = new class251();

    @OriginalMember(owner = "client!jd", name = "u", descriptor = "Lnf;")
    private class251 field1385 = new class251();

    @OriginalMember(owner = "client!jd", name = "x", descriptor = "Lre;")
    private class263 field1388 = new class263(4);

    @OriginalMember(owner = "client!jd", name = "A", descriptor = "I")
    public volatile int field1391 = 0;

    @OriginalMember(owner = "client!jd", name = "C", descriptor = "I")
    public volatile int field1393 = 0;

    @OriginalMember(owner = "client!jd", name = "z", descriptor = "B")
    private byte field1390 = 0;

    @OriginalMember(owner = "client!jd", name = "B", descriptor = "Lre;")
    private class263 field1392 = new class263(8);

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "Lom;")
    public static class156 field1366 = new class156();

    @OriginalMember(owner = "client!jd", name = "o", descriptor = "I")
    public static int field1379 = 0;

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "I")
    public static int field1367;

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "I")
    public static int field1368;

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "I")
    public static int field1369;

    @OriginalMember(owner = "client!jd", name = "f", descriptor = "I")
    public static int field1370;

    @OriginalMember(owner = "client!jd", name = "g", descriptor = "I")
    public static int field1371;

    @OriginalMember(owner = "client!jd", name = "h", descriptor = "I")
    public static int field1372;

    @OriginalMember(owner = "client!jd", name = "i", descriptor = "I")
    public static int field1373;

    @OriginalMember(owner = "client!jd", name = "k", descriptor = "I")
    public static int field1375;

    @OriginalMember(owner = "client!jd", name = "l", descriptor = "I")
    public static int field1376;

    @OriginalMember(owner = "client!jd", name = "m", descriptor = "I")
    public static int field1377;

    @OriginalMember(owner = "client!jd", name = "n", descriptor = "I")
    public static int field1378;

    @OriginalMember(owner = "client!jd", name = "p", descriptor = "I")
    public static int field1380;

    @OriginalMember(owner = "client!jd", name = "q", descriptor = "I")
    public static int field1381;

    @OriginalMember(owner = "client!jd", name = "r", descriptor = "I")
    public static int field1382;

    @OriginalMember(owner = "client!jd", name = "s", descriptor = "I")
    public static int field1383;

    @OriginalMember(owner = "client!jd", name = "y", descriptor = "I")
    private int field1389;

    @OriginalMember(owner = "client!jd", name = "w", descriptor = "J")
    private long field1387;

    @OriginalMember(owner = "client!jd", name = "v", descriptor = "Lba;")
    private class161 field1386;

    @OriginalMember(owner = "client!jd", name = "D", descriptor = "Ltg;")
    private class93 field1394;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(I)Z", line = 5)
    public final boolean method645(int arg0) {
        if (arg0 < 44) {
            this.method653(86);
        }
        field1382++;
        return this.method648(106) >= 20;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(BZLba;)V", line = 16)
    public final void method646(byte arg0, boolean arg1, class161 arg2) {
        if (this.field1386 != null) {
            try {
                this.field1386.method1138(-16726864);
            } catch (Exception var11) {
            }
            this.field1386 = null;
        }
        this.field1386 = arg2;
        if (arg0 > -22) {
            field1379 = -123;
        }
        field1381++;
        this.method659(-28833);
        this.method652((byte) -106, arg1);
        this.field1394 = null;
        this.field1392.field4025 = 0;
        while (true) {
            class93 var5 = (class93) this.field1374.method1698((byte) 20);
            if (var5 == null) {
                while (true) {
                    class93 var6 = (class93) this.field1385.method1698((byte) 87);
                    if (var6 == null) {
                        if (this.field1390 != 0) {
                            try {
                                this.field1388.field4025 = 0;
                                this.field1388.method1813(-82, 4);
                                this.field1388.method1813(121, this.field1390);
                                this.field1388.method1823(0, (byte) -50);
                                this.field1386.method1134(this.field1388.field3986, true, 4, 0);
                            } catch (IOException var10) {
                                try {
                                    this.field1386.method1138(-16726864);
                                } catch (Exception var9) {
                                }
                                this.field1391++;
                                this.field1386 = null;
                                this.field1393 = -2;
                            }
                        }
                        this.field1389 = 0;
                        this.field1387 = class231.method1594(-20375);
                        return;
                    }
                    this.field1384.method1697(34, var6);
                }
            }
            this.field1365.method1697(34, var5);
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IZBII)Ltg;", line = 88)
    public final class93 method647(int arg0, boolean arg1, byte arg2, int arg3, int arg4) {
        field1372++;
        if (arg4 != 1321879792) {
            method656(-44, (String) null, (String) null, 66);
        }
        class93 var6 = new class93();
        var6.field1135 = arg1;
        var6.field1398 = arg2;
        long var7 = (long) ((arg3 << 16) + arg0);
        var6.field2955 = var7;
        if (arg1) {
            if (this.method653(512) >= 20) {
                throw new RuntimeException();
            }
            this.field1365.method1697(34, var6);
        } else if (this.method648(115) < 20) {
            this.field1384.method1697(arg4 ^ 0x4ECA48D2, var6);
        } else {
            throw new RuntimeException();
        }
        return var6;
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(I)I", line = 133)
    private final int method648(int arg0) {
        field1373++;
        int var2 = 94 % ((arg0 - 28) / 44);
        return this.field1384.method1691((byte) -128) + this.field1385.method1691((byte) -110);
    }

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "(I)Z", line = 143)
    public final boolean method649(int arg0) {
        field1375++;
        if (this.field1386 != null) {
            long var2 = class231.method1594(-20375);
            int var4 = (int) (var2 - this.field1387);
            if (var4 > 200) {
                var4 = 200;
            }
            this.field1389 += var4;
            this.field1387 = var2;
            if (this.field1389 > 30000) {
                try {
                    this.field1386.method1138(-16726864);
                } catch (Exception var30) {
                }
                this.field1386 = null;
            }
        }
        if (this.field1386 == null) {
            return this.method653(512) == 0 && this.method648(arg0 + 18710) == 0;
        }
        try {
            this.field1386.method1136(728285352);
            if (arg0 != -18808) {
                this.method649(115);
            }
            for (class93 var6 = (class93) this.field1365.method1696(-107); var6 != null; var6 = (class93) this.field1365.method1695(-12509)) {
                this.field1388.field4025 = 0;
                this.field1388.method1813(51, 1);
                this.field1388.method1844((int) var6.field2955, -100);
                this.field1386.method1134(this.field1388.field3986, true, 4, 0);
                this.field1374.method1697(34, var6);
            }
            for (class93 var7 = (class93) this.field1384.method1696(-102); var7 != null; var7 = (class93) this.field1384.method1695(-12509)) {
                this.field1388.field4025 = 0;
                this.field1388.method1813(arg0 + 18723, 0);
                this.field1388.method1844((int) var7.field2955, -96);
                this.field1386.method1134(this.field1388.field3986, true, 4, 0);
                this.field1385.method1697(34, var7);
            }
            for (int var8 = 0; var8 < 100; var8++) {
                int var9 = this.field1386.method1137(-2266);
                if (var9 < 0) {
                    throw new IOException();
                }
                if (var9 == 0) {
                    break;
                }
                byte var10 = 0;
                if (this.field1394 == null) {
                    var10 = 8;
                } else if (this.field1394.field1401 == 0) {
                    var10 = 1;
                }
                this.field1389 = 0;
                if (var10 <= 0) {
                    int var11 = this.field1394.field1402.field3986.length - this.field1394.field1398;
                    int var12 = 512 - this.field1394.field1401;
                    if (var12 > var11 - this.field1394.field1402.field4025) {
                        var12 = var11 - this.field1394.field1402.field4025;
                    }
                    if (var12 > var9) {
                        var12 = var9;
                    }
                    this.field1386.method1142(var12, true, this.field1394.field1402.field3986, this.field1394.field1402.field4025);
                    if (this.field1390 != 0) {
                        for (int var13 = 0; var13 < var12; var13++) {
                            this.field1394.field1402.field3986[this.field1394.field1402.field4025 + var13] = (byte) class206.method1421(this.field1394.field1402.field3986[this.field1394.field1402.field4025 + var13], this.field1390);
                        }
                    }
                    this.field1394.field1401 += var12;
                    this.field1394.field1402.field4025 += var12;
                    if (this.field1394.field1402.field4025 == var11) {
                        this.field1394.method1353(29792);
                        this.field1394.field1129 = false;
                        this.field1394 = null;
                    } else if (this.field1394.field1401 == 512) {
                        this.field1394.field1401 = 0;
                    }
                } else {
                    int var14 = var10 - this.field1392.field4025;
                    if (var14 > var9) {
                        var14 = var9;
                    }
                    this.field1386.method1142(var14, true, this.field1392.field3986, this.field1392.field4025);
                    if (this.field1390 != 0) {
                        for (int var15 = 0; var15 < var14; var15++) {
                            this.field1392.field3986[this.field1392.field4025 + var15] = (byte) class206.method1421(this.field1392.field3986[this.field1392.field4025 + var15], this.field1390);
                        }
                    }
                    this.field1392.field4025 += var14;
                    if (var10 <= this.field1392.field4025) {
                        if (this.field1394 == null) {
                            this.field1392.field4025 = 0;
                            int var16 = this.field1392.method1787(false);
                            int var17 = this.field1392.method1830((byte) -77);
                            int var18 = this.field1392.method1787(false);
                            int var19 = this.field1392.method1826(-206227536);
                            int var20 = var18 & 0x7F;
                            Object var21 = null;
                            long var22 = (long) ((var16 << 16) + var17);
                            boolean var24 = (var18 & 0x80) != 0;
                            class93 var25;
                            if (var24) {
                                for (var25 = (class93) this.field1385.method1696(-103); var25 != null && var25.field2955 != var22; var25 = (class93) this.field1385.method1695(-12509)) {
                                }
                            } else {
                                for (var25 = (class93) this.field1374.method1696(104); var25 != null && var25.field2955 != var22; var25 = (class93) this.field1374.method1695(-12509)) {
                                }
                            }
                            if (var25 == null) {
                                throw new IOException();
                            }
                            int var26 = var20 == 0 ? 5 : 9;
                            this.field1394 = var25;
                            this.field1394.field1402 = new class263(this.field1394.field1398 + var19 + var26);
                            this.field1394.field1402.method1813(-80, var20);
                            this.field1394.field1402.method1815(arg0 ^ 0xFFFFB6DD, var19);
                            this.field1392.field4025 = 0;
                            this.field1394.field1401 = 8;
                        } else if (this.field1394.field1401 != 0) {
                            throw new IOException();
                        } else if (this.field1392.field3986[0] == -1) {
                            this.field1392.field4025 = 0;
                            this.field1394.field1401 = 1;
                        } else {
                            this.field1394 = null;
                        }
                    }
                }
            }
            return true;
        } catch (IOException var31) {
            try {
                this.field1386.method1138(-16726864);
            } catch (Exception var29) {
            }
            this.field1393 = -2;
            this.field1386 = null;
            this.field1391++;
            return this.method653(512) == 0 && this.method648(105) == 0;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(B)V", line = 419)
    public final void method650(byte arg0) {
        if (this.field1386 != null) {
            this.field1386.method1138(-16726864);
        }
        field1380++;
        if (arg0 != 35) {
            this.field1384 = (class251) null;
        }
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(B)Z", line = 438)
    public final boolean method651(byte arg0) {
        if (arg0 <= 17) {
            this.field1365 = (class251) null;
        }
        field1367++;
        return this.method653(512) >= 20;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(BZ)V", line = 449)
    public final void method652(byte arg0, boolean arg1) {
        field1371++;
        if (this.field1386 == null) {
            return;
        }
        try {
            this.field1388.field4025 = 0;
            this.field1388.method1813(38, arg1 ? 2 : 3);
            this.field1388.method1844(0, -107);
            if (arg0 >= -11) {
                this.field1374 = (class251) null;
            }
            this.field1386.method1134(this.field1388.field3986, true, 4, 0);
        } catch (IOException var6) {
            try {
                this.field1386.method1138(-16726864);
            } catch (Exception var5) {
            }
            this.field1391++;
            this.field1393 = -2;
            this.field1386 = null;
        }
    }

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "(I)I", line = 476)
    public final int method653(int arg0) {
        if (arg0 != 512) {
            this.method651((byte) -83);
        }
        field1370++;
        return this.field1365.method1691((byte) -126) + this.field1374.method1691((byte) -124);
    }

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "(B)V", line = 490)
    public final void method654(byte arg0) {
        field1368++;
        if (this.field1386 == null) {
            return;
        }
        try {
            this.field1388.field4025 = 0;
            this.field1388.method1813(46, 7);
            this.field1388.method1844(0, -123);
            this.field1386.method1134(this.field1388.field3986, true, 4, 0);
            if (arg0 >= -73) {
                field1366 = (class156) null;
            }
        } catch (IOException var5) {
            try {
                this.field1386.method1138(-16726864);
            } catch (Exception var4) {
            }
            this.field1386 = null;
            this.field1393 = -2;
            this.field1391++;
        }
    }

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "(I)V", line = 518)
    public final void method655(int arg0) {
        if (this.field1386 != null) {
            this.field1386.method1139((byte) 110);
        }
        if (arg0 == 29896) {
            field1378++;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;I)V", line = 533)
    public static final void method656(int arg0, String arg1, String arg2, int arg3) {
        class189.method1289(arg0, arg1, arg2, (byte) -95, (String) null, arg3);
        field1383++;
    }

    @OriginalMember(owner = "client!jd", name = "f", descriptor = "(I)V", line = 551)
    public static void method657(int arg0) {
        if (arg0 != -22031) {
            field1376 = 86;
        }
        field1366 = null;
    }

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "(B)V", line = 565)
    public final void method658(byte arg0) {
        try {
            this.field1386.method1138(-16726864);
        } catch (Exception var3) {
        }
        this.field1391++;
        this.field1390 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
        field1369++;
        this.field1386 = null;
        if (arg0 <= 0) {
            field1379 = 106;
        }
        this.field1393 = -1;
    }

    @OriginalMember(owner = "client!jd", name = "g", descriptor = "(I)V", line = 583)
    private final void method659(int arg0) {
        field1377++;
        if (this.field1386 == null) {
            return;
        }
        try {
            if (arg0 != -28833) {
                field1376 = -2;
            }
            this.field1388.field4025 = 0;
            this.field1388.method1813(-87, 6);
            this.field1388.method1844(3, -91);
            this.field1386.method1134(this.field1388.field3986, true, 4, 0);
        } catch (IOException var5) {
            try {
                this.field1386.method1138(-16726864);
            } catch (Exception var4) {
            }
            this.field1386 = null;
            this.field1393 = -2;
            this.field1391++;
        }
    }
}
