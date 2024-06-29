import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class246 {

    @OriginalMember(owner = "client!sh", name = "n", descriptor = "Lwd;")
    private class65 field4382 = new class65();

    @OriginalMember(owner = "client!sh", name = "s", descriptor = "Lwd;")
    private class65 field4387 = new class65();

    @OriginalMember(owner = "client!sh", name = "t", descriptor = "Lwd;")
    private class65 field4388 = new class65();

    @OriginalMember(owner = "client!sh", name = "u", descriptor = "Lwd;")
    private class65 field4389 = new class65();

    @OriginalMember(owner = "client!sh", name = "y", descriptor = "Ljd;")
    private class118 field4393 = new class118(4);

    @OriginalMember(owner = "client!sh", name = "A", descriptor = "I")
    public volatile int field4395 = 0;

    @OriginalMember(owner = "client!sh", name = "z", descriptor = "I")
    public volatile int field4394 = 0;

    @OriginalMember(owner = "client!sh", name = "C", descriptor = "B")
    private byte field4397 = 0;

    @OriginalMember(owner = "client!sh", name = "B", descriptor = "Ljd;")
    private class118 field4396 = new class118(8);

    @OriginalMember(owner = "client!sh", name = "k", descriptor = "Lfl;")
    public static class191 field4379 = new class191();

    @OriginalMember(owner = "client!sh", name = "o", descriptor = "Lfl;")
    public static class191 field4383 = new class191();

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "I")
    public static int field4369;

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "I")
    public static int field4370;

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "I")
    public static int field4371;

    @OriginalMember(owner = "client!sh", name = "d", descriptor = "I")
    public static int field4372;

    @OriginalMember(owner = "client!sh", name = "e", descriptor = "I")
    public static int field4373;

    @OriginalMember(owner = "client!sh", name = "f", descriptor = "I")
    public static int field4374;

    @OriginalMember(owner = "client!sh", name = "g", descriptor = "I")
    public static int field4375;

    @OriginalMember(owner = "client!sh", name = "h", descriptor = "I")
    public static int field4376;

    @OriginalMember(owner = "client!sh", name = "i", descriptor = "I")
    public static int field4377;

    @OriginalMember(owner = "client!sh", name = "j", descriptor = "I")
    public static int field4378;

    @OriginalMember(owner = "client!sh", name = "l", descriptor = "I")
    public static int field4380;

    @OriginalMember(owner = "client!sh", name = "m", descriptor = "I")
    public static int field4381;

    @OriginalMember(owner = "client!sh", name = "p", descriptor = "I")
    public static int field4384;

    @OriginalMember(owner = "client!sh", name = "q", descriptor = "I")
    public static int field4385;

    @OriginalMember(owner = "client!sh", name = "r", descriptor = "I")
    public static int field4386;

    @OriginalMember(owner = "client!sh", name = "w", descriptor = "I")
    private int field4391;

    @OriginalMember(owner = "client!sh", name = "x", descriptor = "J")
    private long field4392;

    @OriginalMember(owner = "client!sh", name = "v", descriptor = "Llc;")
    private class138 field4390;

    @OriginalMember(owner = "client!sh", name = "D", descriptor = "Lvg;")
    private class223 field4398;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(B)Z")
    public final boolean method1650(byte arg0) {
        if (arg0 != -9) {
            this.field4388 = null;
        }
        field4370++;
        return this.method1660(arg0 + 19896) >= 20;
    }

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "(B)Z")
    public final boolean method1651(byte arg0) {
        if (arg0 >= -46) {
            return false;
        } else {
            field4374++;
            return this.method1652(1) >= 20;
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(I)I")
    private final int method1652(int arg0) {
        field4375++;
        return arg0 == 1 ? this.field4388.method440((byte) 116) + this.field4389.method440((byte) 116) : -23;
    }

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "(I)V")
    public final void method1653(int arg0) {
        if (arg0 == 16777215) {
            field4371++;
            if (this.field4390 != null) {
                this.field4390.method985((byte) -127);
            }
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IZ)V")
    public final void method1654(int arg0, boolean arg1) {
        field4381++;
        if (this.field4390 == null) {
            return;
        }
        try {
            this.field4393.field2155 = 0;
            this.field4393.method877((byte) 97, arg1 ? 2 : 3);
            this.field4393.method869(0, true);
            this.field4390.method995(this.field4393.field2115, 0, -123, arg0);
        } catch (IOException var4) {
            try {
                this.field4390.method994((byte) -122);
            } catch (Exception var3) {
            }
            this.field4395++;
            this.field4394 = -2;
            this.field4390 = null;
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(ZIIIIIZZ)Ldd;")
    public static final class211 method1655(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7) {
        field4369++;
        class134 var8 = class165.method1179(102, arg1);
        if (arg4 > 1 && var8.field2449 != null) {
            int var9 = -1;
            for (int var10 = 0; var10 < 10; var10++) {
                if (var8.field2459[var10] <= arg4 && var8.field2459[var10] != 0) {
                    var9 = var8.field2449[var10];
                }
            }
            if (var9 != -1) {
                var8 = class165.method1179(102, var9);
            }
        }
        class222 var11 = var8.method949(-119);
        if (var11 == null) {
            return null;
        }
        class101 var12 = null;
        if (var8.field2442 != -1) {
            var12 = (class101) method1655(true, var8.field2425, 0, 1, 10, arg5, true, false);
            if (var12 == null) {
                return null;
            }
        } else if (var8.field2466 != -1) {
            var12 = (class101) method1655(true, var8.field2402, arg2, arg3, arg4, -1868, false, false);
            if (var12 == null) {
                return null;
            }
        }
        int var13 = class159.field3009;
        if (arg5 != -1868) {
            return null;
        }
        int[] var14 = class159.field3015;
        int var15 = class159.field3014;
        int[] var16 = new int[4];
        class159.method1149(var16);
        class101 var17 = new class101(36, 32);
        class159.method1147(var17.field1846, 36, 32);
        class167.method1207();
        class167.method1198(16, 16);
        class167.field3115 = false;
        int var18 = var8.field2415;
        if (arg6) {
            var18 = (int) ((double) var18 * 1.5D);
        } else if (arg3 == 2) {
            var18 = (int) ((double) var18 * 1.04D);
        }
        int var19 = class167.field3112[var8.field2448] * var18 >> 16;
        int var20 = class167.field3110[var8.field2448] * var18 >> 16;
        var11.method631(0, var8.field2455, var8.field2437, var8.field2448, var8.field2453, (var20 + var8.field2454) - (var11.method62() / 2), var8.field2454 + var19, -1L);
        if (arg3 >= 1) {
            var17.method702(1);
            if (arg3 >= 2) {
                var17.method702(16777215);
            }
            class159.method1147(var17.field1846, 36, 32);
        }
        if (arg2 != 0) {
            var17.method701(arg2);
        }
        if (var8.field2442 != -1) {
            var12.method707(0, 0);
        } else if (var8.field2466 != -1) {
            class159.method1147(var12.field1846, 36, 32);
            var17.method707(0, 0);
            var17 = var12;
        }
        if (arg7 && (var8.field2469 == 1 || arg4 != 1) && arg4 != -1) {
            class236.field4226.method1850(class210.method1478(arg4, -1), 0, 9, 16776960, 1);
        }
        class159.method1147(var14, var13, var15);
        class159.method1135(var16);
        class167.method1207();
        class167.field3115 = true;
        return var17;
    }

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "(I)V")
    public final void method1656(int arg0) {
        if (arg0 == -15765) {
            if (this.field4390 != null) {
                this.field4390.method994((byte) -48);
            }
            field4386++;
        }
    }

    @OriginalMember(owner = "client!sh", name = "d", descriptor = "(I)V")
    private final void method1657(int arg0) {
        field4373++;
        if (this.field4390 == null) {
            return;
        }
        try {
            this.field4393.field2155 = 0;
            this.field4393.method877((byte) 97, 6);
            this.field4393.method869(3, true);
            this.field4390.method995(this.field4393.field2115, 0, -96, 4);
        } catch (IOException var3) {
            try {
                this.field4390.method994((byte) -49);
            } catch (Exception var2) {
            }
            this.field4395++;
            this.field4394 = -2;
            this.field4390 = null;
        }
        if (arg0 >= -83) {
            this.field4387 = null;
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(Z)Z")
    public final boolean method1658(boolean arg0) {
        if (this.field4390 != null) {
            long var2 = class244.method1644((byte) -102);
            int var4 = (int) (var2 - this.field4392);
            if (var4 > 200) {
                var4 = 200;
            }
            this.field4392 = var2;
            this.field4391 += var4;
            if (this.field4391 > 30000) {
                try {
                    this.field4390.method994((byte) -78);
                } catch (Exception var27) {
                }
                this.field4390 = null;
            }
        }
        field4384++;
        if (this.field4390 == null) {
            return this.method1660(19887) == 0 && this.method1652(1) == 0;
        }
        try {
            this.field4390.method987(false);
            if (!arg0) {
                this.method1660(66);
            }
            for (class223 var5 = (class223) this.field4382.method437(10); var5 != null; var5 = (class223) this.field4382.method439(5439)) {
                this.field4393.field2155 = 0;
                this.field4393.method877((byte) 105, 1);
                this.field4393.method869((int) var5.field3318, arg0);
                this.field4390.method995(this.field4393.field2115, 0, -114, 4);
                this.field4387.method436((byte) -86, var5);
            }
            for (class223 var6 = (class223) this.field4388.method437(10); var6 != null; var6 = (class223) this.field4388.method439(5439)) {
                this.field4393.field2155 = 0;
                this.field4393.method877((byte) 121, 0);
                this.field4393.method869((int) var6.field3318, true);
                this.field4390.method995(this.field4393.field2115, 0, -85, 4);
                this.field4389.method436((byte) -86, var6);
            }
            for (int var7 = 0; var7 < 100; var7++) {
                int var8 = this.field4390.method991((byte) -99);
                if (var8 < 0) {
                    throw new IOException();
                }
                if (var8 == 0) {
                    break;
                }
                this.field4391 = 0;
                byte var9 = 0;
                if (this.field4398 == null) {
                    var9 = 8;
                } else if (this.field4398.field4093 == 0) {
                    var9 = 1;
                }
                if (var9 > 0) {
                    int var10 = var9 - this.field4396.field2155;
                    if (var10 > var8) {
                        var10 = var8;
                    }
                    this.field4390.method993(var10, this.field4396.field2115, 5623, this.field4396.field2155);
                    if (this.field4397 != 0) {
                        for (int var11 = 0; var11 < var10; var11++) {
                            this.field4396.field2115[this.field4396.field2155 + var11] = (byte) class260.method1766(this.field4396.field2115[this.field4396.field2155 + var11], this.field4397);
                        }
                    }
                    this.field4396.field2155 += var10;
                    if (this.field4396.field2155 >= var9) {
                        if (this.field4398 == null) {
                            this.field4396.field2155 = 0;
                            int var12 = this.field4396.method867(false);
                            int var13 = this.field4396.method827(255);
                            int var14 = this.field4396.method867(false);
                            int var15 = var14 & 0x7F;
                            int var16 = this.field4396.method875((byte) 95);
                            long var17 = (long) ((var12 << 16) + var13);
                            boolean var19 = (var14 & 0x80) != 0;
                            Object var20 = null;
                            class223 var21;
                            if (var19) {
                                for (var21 = (class223) this.field4389.method437(10); var21 != null && var21.field3318 != var17; var21 = (class223) this.field4389.method439(5439)) {
                                }
                            } else {
                                for (var21 = (class223) this.field4387.method437(10); var21 != null && var21.field3318 != var17; var21 = (class223) this.field4387.method439(5439)) {
                                }
                            }
                            if (var21 == null) {
                                throw new IOException();
                            }
                            this.field4398 = var21;
                            int var22 = var15 == 0 ? 5 : 9;
                            this.field4398.field4098 = new class118(var16 + var22 + this.field4398.field4092);
                            this.field4398.field4098.method877((byte) 100, var15);
                            this.field4398.field4098.method842(var16, -6596);
                            this.field4396.field2155 = 0;
                            this.field4398.field4093 = 8;
                        } else if (this.field4398.field4093 != 0) {
                            throw new IOException();
                        } else if (this.field4396.field2115[0] == -1) {
                            this.field4396.field2155 = 0;
                            this.field4398.field4093 = 1;
                        } else {
                            this.field4398 = null;
                        }
                    }
                } else {
                    int var23 = 512 - this.field4398.field4093;
                    int var24 = this.field4398.field4098.field2115.length - this.field4398.field4092;
                    if (var23 > var24 - this.field4398.field4098.field2155) {
                        var23 = var24 - this.field4398.field4098.field2155;
                    }
                    if (var23 > var8) {
                        var23 = var8;
                    }
                    this.field4390.method993(var23, this.field4398.field4098.field2115, 5623, this.field4398.field4098.field2155);
                    if (this.field4397 != 0) {
                        for (int var25 = 0; var25 < var23; var25++) {
                            this.field4398.field4098.field2115[this.field4398.field4098.field2155 + var25] = (byte) class260.method1766(this.field4398.field4098.field2115[this.field4398.field4098.field2155 + var25], this.field4397);
                        }
                    }
                    this.field4398.field4098.field2155 += var23;
                    this.field4398.field4093 += var23;
                    if (this.field4398.field4098.field2155 == var24) {
                        this.field4398.method1276((byte) 82);
                        this.field4398.field4709 = false;
                        this.field4398 = null;
                    } else if (this.field4398.field4093 == 512) {
                        this.field4398.field4093 = 0;
                    }
                }
            }
            return true;
        } catch (IOException var28) {
            try {
                this.field4390.method994((byte) -32);
            } catch (Exception var26) {
            }
            this.field4395++;
            this.field4394 = -2;
            this.field4390 = null;
            return this.method1660(19887) == 0 && this.method1652(1) == 0;
        }
    }

    @OriginalMember(owner = "client!sh", name = "e", descriptor = "(I)V")
    public static void method1659(int arg0) {
        field4379 = null;
        field4383 = null;
        int var1 = -5 % ((arg0 - 7) / 59);
    }

    @OriginalMember(owner = "client!sh", name = "f", descriptor = "(I)I")
    public final int method1660(int arg0) {
        if (arg0 == 19887) {
            field4377++;
            return this.field4382.method440((byte) 116) + this.field4387.method440((byte) 116);
        } else {
            return 87;
        }
    }

    @OriginalMember(owner = "client!sh", name = "g", descriptor = "(I)V")
    public final void method1661(int arg0) {
        field4380++;
        try {
            this.field4390.method994((byte) -24);
        } catch (Exception var2) {
        }
        this.field4395++;
        this.field4394 = -1;
        this.field4397 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
        if (arg0 >= 0) {
            this.field4390 = null;
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IZBII)Lvg;")
    public final class223 method1662(int arg0, boolean arg1, byte arg2, int arg3, int arg4) {
        field4376++;
        long var6 = (long) ((arg3 << 16) + arg4);
        class223 var8 = new class223();
        var8.field4092 = arg2;
        var8.field3318 = var6;
        var8.field4706 = arg1;
        if (arg0 != -27446) {
            this.field4395 = -75;
        }
        if (arg1) {
            if (this.method1660(19887) >= 20) {
                throw new RuntimeException();
            }
            this.field4382.method436((byte) -86, var8);
        } else if (this.method1652(arg0 + 27447) < 20) {
            this.field4388.method436((byte) -86, var8);
        } else {
            throw new RuntimeException();
        }
        return var8;
    }

    @OriginalMember(owner = "client!sh", name = "h", descriptor = "(I)V")
    public final void method1663(int arg0) {
        field4378++;
        if (this.field4390 == null) {
            return;
        }
        try {
            if (arg0 == -29056) {
                this.field4393.field2155 = 0;
                this.field4393.method877((byte) 105, 7);
                this.field4393.method869(0, true);
                this.field4390.method995(this.field4393.field2115, 0, 18, 4);
            }
        } catch (IOException var3) {
            try {
                this.field4390.method994((byte) -121);
            } catch (Exception var2) {
            }
            this.field4395++;
            this.field4390 = null;
            this.field4394 = -2;
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(ZLlc;Z)V")
    public final void method1664(boolean arg0, class138 arg1, boolean arg2) {
        field4372++;
        if (this.field4390 != null) {
            try {
                this.field4390.method994((byte) -44);
            } catch (Exception var8) {
            }
            this.field4390 = null;
        }
        this.field4390 = arg1;
        this.method1657(-90);
        this.method1654(4, arg0);
        this.field4396.field2155 = 0;
        this.field4398 = null;
        while (true) {
            class223 var4 = (class223) this.field4387.method441((byte) -66);
            if (var4 == null) {
                if (!arg2) {
                    field4385 = 24;
                }
                while (true) {
                    class223 var5 = (class223) this.field4389.method441((byte) -76);
                    if (var5 == null) {
                        if (this.field4397 != 0) {
                            try {
                                this.field4393.field2155 = 0;
                                this.field4393.method877((byte) 124, 4);
                                this.field4393.method877((byte) 109, this.field4397);
                                this.field4393.method856(31133, 0);
                                this.field4390.method995(this.field4393.field2115, 0, -92, 4);
                            } catch (IOException var7) {
                                try {
                                    this.field4390.method994((byte) -27);
                                } catch (Exception var6) {
                                }
                                this.field4390 = null;
                                this.field4395++;
                                this.field4394 = -2;
                            }
                        }
                        this.field4391 = 0;
                        this.field4392 = class244.method1644((byte) -77);
                        return;
                    }
                    this.field4388.method436((byte) -86, var5);
                }
            }
            this.field4382.method436((byte) -86, var4);
        }
    }
}
