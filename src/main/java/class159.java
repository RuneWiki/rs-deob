import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public class class159 {

    @OriginalMember(owner = "client!ek", name = "q", descriptor = "Loe;")
    private class139 field2991 = new class139();

    @OriginalMember(owner = "client!ek", name = "u", descriptor = "Loe;")
    private class139 field2995 = new class139();

    @OriginalMember(owner = "client!ek", name = "v", descriptor = "Loe;")
    private class139 field2996 = new class139();

    @OriginalMember(owner = "client!ek", name = "w", descriptor = "Loe;")
    private class139 field2997 = new class139();

    @OriginalMember(owner = "client!ek", name = "A", descriptor = "Lqk;")
    private class200 field3001 = new class200(4);

    @OriginalMember(owner = "client!ek", name = "B", descriptor = "B")
    private byte field3002 = 0;

    @OriginalMember(owner = "client!ek", name = "D", descriptor = "I")
    public volatile int field3004 = 0;

    @OriginalMember(owner = "client!ek", name = "C", descriptor = "I")
    public volatile int field3003 = 0;

    @OriginalMember(owner = "client!ek", name = "E", descriptor = "Lqk;")
    private class200 field3005 = new class200(8);

    @OriginalMember(owner = "client!ek", name = "o", descriptor = "[I")
    public static int[] field2989 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "I")
    public static int field2975;

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "I")
    public static int field2976;

    @OriginalMember(owner = "client!ek", name = "d", descriptor = "I")
    public static int field2978;

    @OriginalMember(owner = "client!ek", name = "e", descriptor = "I")
    public static int field2979;

    @OriginalMember(owner = "client!ek", name = "f", descriptor = "I")
    public static int field2980;

    @OriginalMember(owner = "client!ek", name = "g", descriptor = "I")
    public static int field2981;

    @OriginalMember(owner = "client!ek", name = "j", descriptor = "I")
    public static int field2984;

    @OriginalMember(owner = "client!ek", name = "k", descriptor = "I")
    public static int field2985;

    @OriginalMember(owner = "client!ek", name = "l", descriptor = "I")
    public static int field2986;

    @OriginalMember(owner = "client!ek", name = "m", descriptor = "I")
    public static int field2987;

    @OriginalMember(owner = "client!ek", name = "n", descriptor = "I")
    public static int field2988;

    @OriginalMember(owner = "client!ek", name = "p", descriptor = "I")
    public static int field2990;

    @OriginalMember(owner = "client!ek", name = "r", descriptor = "I")
    public static int field2992;

    @OriginalMember(owner = "client!ek", name = "s", descriptor = "I")
    public static int field2993;

    @OriginalMember(owner = "client!ek", name = "t", descriptor = "I")
    public static int field2994;

    @OriginalMember(owner = "client!ek", name = "z", descriptor = "I")
    private int field3000;

    @OriginalMember(owner = "client!ek", name = "x", descriptor = "J")
    private long field2998;

    @OriginalMember(owner = "client!ek", name = "h", descriptor = "Lbj;")
    public static class151 field2982;

    @OriginalMember(owner = "client!ek", name = "F", descriptor = "Lwa;")
    private class246 field3006;

    @OriginalMember(owner = "client!ek", name = "y", descriptor = "Lna;")
    private class31 field2999;

    @OriginalMember(owner = "client!ek", name = "i", descriptor = "[Lmk;")
    public static class101[] field2983;

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "[[[B")
    public static byte[][][] field2977;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(I)I")
    public final int method1150(int arg0) {
        if (arg0 != 23654) {
            this.method1157(110, false);
        }
        field2978++;
        return this.field2991.method992(false) + this.field2995.method992(false);
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(B)Z")
    public final boolean method1151(byte arg0) {
        if (arg0 == 45) {
            field2979++;
            return this.method1150(23654) >= 20;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(B)I")
    private final int method1152(byte arg0) {
        if (arg0 >= -125) {
            this.method1156((class31) null, -35, false);
        }
        field2976++;
        return this.field2996.method992(false) + this.field2997.method992(false);
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(I)V")
    public static void method1153(int arg0) {
        field2989 = null;
        field2977 = null;
        field2983 = null;
        if (arg0 >= -123) {
            method1162(false);
        }
        field2982 = null;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IZIIB)Lwa;")
    public final class246 method1154(int arg0, boolean arg1, int arg2, int arg3, byte arg4) {
        field2984++;
        long var6 = (long) ((arg3 << 16) + arg2);
        if (arg0 != -22256) {
            return null;
        }
        class246 var8 = new class246();
        var8.field4381 = arg4;
        var8.field4542 = var6;
        var8.field4101 = arg1;
        if (arg1) {
            if (this.method1150(arg0 ^ 0xFFFFF576) >= 20) {
                throw new RuntimeException();
            }
            this.field2991.method991(var8, true);
        } else if (this.method1152((byte) -127) < 20) {
            this.field2996.method991(var8, true);
        } else {
            throw new RuntimeException();
        }
        return var8;
    }

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "(I)V")
    private final void method1155(int arg0) {
        field2990++;
        if (this.field2999 == null) {
            return;
        }
        try {
            this.field3001.field3565 = 0;
            this.field3001.method1388(-106, 6);
            if (arg0 != -6002) {
                this.field2996 = null;
            }
            this.field3001.method1391(3, (byte) -123);
            this.field2999.method209(this.field3001.field3547, 4900, 4, 0);
        } catch (IOException var3) {
            try {
                this.field2999.method207((byte) 99);
            } catch (Exception var2) {
            }
            this.field3003++;
            this.field2999 = null;
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(Lna;IZ)V")
    public final void method1156(class31 arg0, int arg1, boolean arg2) {
        if (arg1 != 31359) {
            this.field2991 = null;
        }
        if (this.field2999 != null) {
            try {
                this.field2999.method207((byte) 100);
            } catch (Exception var8) {
            }
            this.field2999 = null;
        }
        field2981++;
        this.field2999 = arg0;
        this.method1155(-6002);
        this.method1157(8837, arg2);
        this.field3005.field3565 = 0;
        this.field3006 = null;
        while (true) {
            class246 var4 = (class246) this.field2995.method990(arg1 ^ 0x7A7F);
            if (var4 == null) {
                while (true) {
                    class246 var5 = (class246) this.field2997.method990(0);
                    if (var5 == null) {
                        if (this.field3002 != 0) {
                            try {
                                this.field3001.field3565 = 0;
                                this.field3001.method1388(-41, 4);
                                this.field3001.method1388(-114, this.field3002);
                                this.field3001.method1428((byte) 13, 0);
                                this.field2999.method209(this.field3001.field3547, 4900, 4, 0);
                            } catch (IOException var7) {
                                try {
                                    this.field2999.method207((byte) 102);
                                } catch (Exception var6) {
                                }
                                this.field2999 = null;
                                this.field3003++;
                            }
                        }
                        this.field3000 = 0;
                        this.field2998 = class253.method1711((byte) -98);
                        return;
                    }
                    this.field2996.method991(var5, true);
                }
            }
            this.field2991.method991(var4, true);
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IZ)V")
    public final void method1157(int arg0, boolean arg1) {
        field2975++;
        if (this.field2999 == null) {
            return;
        }
        try {
            this.field3001.field3565 = 0;
            this.field3001.method1388(-106, arg1 ? 2 : 3);
            this.field3001.method1391(0, (byte) -120);
            this.field2999.method209(this.field3001.field3547, 4900, 4, 0);
        } catch (IOException var4) {
            try {
                this.field2999.method207((byte) 121);
            } catch (Exception var3) {
            }
            this.field2999 = null;
            this.field3003++;
        }
        if (arg0 != 8837) {
            method1153(-105);
        }
    }

    @OriginalMember(owner = "client!ek", name = "d", descriptor = "(I)Z")
    public final boolean method1158(int arg0) {
        field2985++;
        if (arg0 < 33) {
            method1162(false);
        }
        return this.method1152((byte) -126) >= 20;
    }

    @OriginalMember(owner = "client!ek", name = "e", descriptor = "(I)V")
    public final void method1159(int arg0) {
        this.field3002 = (byte) ((int) ((double) arg0 + Math.random() * 255.0D));
        this.field3004++;
        field2993++;
    }

    @OriginalMember(owner = "client!ek", name = "f", descriptor = "(I)V")
    public final void method1160(int arg0) {
        field2994++;
        if (this.field2999 == null) {
            return;
        }
        try {
            this.field3001.field3565 = 0;
            this.field3001.method1388(-126, 7);
            this.field3001.method1391(0, (byte) 9);
            this.field2999.method209(this.field3001.field3547, arg0 ^ 0x1320, arg0, 0);
        } catch (IOException var3) {
            try {
                this.field2999.method207((byte) 107);
            } catch (Exception var2) {
            }
            this.field2999 = null;
            this.field3003++;
        }
    }

    @OriginalMember(owner = "client!ek", name = "g", descriptor = "(I)V")
    public final void method1161(int arg0) {
        if (this.field2999 != null) {
            this.field2999.method207((byte) 103);
        }
        field2986++;
        if (arg0 != 128) {
            field2989 = null;
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(Z)I")
    public static final int method1162(boolean arg0) {
        field2992++;
        if (!arg0) {
            return 15;
        } else if ((double) class88.field1769 == 3.0D) {
            return 37;
        } else if ((double) class88.field1769 == 4.0D) {
            return 50;
        } else if ((double) class88.field1769 == 6.0D) {
            return 75;
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!ek", name = "h", descriptor = "(I)Z")
    public final boolean method1163(int arg0) {
        field2987++;
        if (this.field2999 != null) {
            long var2 = class253.method1711((byte) -99);
            int var4 = (int) (var2 - this.field2998);
            if (var4 > 200) {
                var4 = 200;
            }
            this.field3000 += var4;
            this.field2998 = var2;
            if (this.field3000 > 30000) {
                try {
                    this.field2999.method207((byte) 105);
                } catch (Exception var27) {
                }
                this.field2999 = null;
            }
        }
        if (this.field2999 == null) {
            return this.method1150(23654) == 0 && this.method1152((byte) -126) == 0;
        }
        try {
            for (class246 var5 = (class246) this.field2991.method995(26386); var5 != null; var5 = (class246) this.field2991.method996(arg0 + 1451)) {
                this.field3001.field3565 = 0;
                this.field3001.method1388(-100, 1);
                this.field3001.method1391((int) var5.field4542, (byte) 1);
                this.field2999.method209(this.field3001.field3547, 4900, 4, 0);
                this.field2995.method991(var5, true);
            }
            for (class246 var6 = (class246) this.field2996.method995(26386); var6 != null; var6 = (class246) this.field2996.method996(-103)) {
                this.field3001.field3565 = 0;
                this.field3001.method1388(arg0 ^ 0x645, 0);
                this.field3001.method1391((int) var6.field4542, (byte) 52);
                this.field2999.method209(this.field3001.field3547, 4900, 4, 0);
                this.field2997.method991(var6, true);
            }
            if (arg0 != -1548) {
                return false;
            }
            for (int var7 = 0; var7 < 100; var7++) {
                int var8 = this.field2999.method208(-11084);
                if (var8 < 0) {
                    throw new IOException();
                }
                if (var8 == 0) {
                    break;
                }
                this.field3000 = 0;
                byte var9 = 0;
                if (this.field3006 == null) {
                    var9 = 8;
                } else if (this.field3006.field4383 == 0) {
                    var9 = 1;
                }
                if (var9 <= 0) {
                    int var10 = this.field3006.field4373.field3547.length - this.field3006.field4381;
                    int var11 = 512 - this.field3006.field4383;
                    if (var11 > (var10 - this.field3006.field4373.field3565)) {
                        var11 = var10 - this.field3006.field4373.field3565;
                    }
                    if (var8 < var11) {
                        var11 = var8;
                    }
                    this.field2999.method210(this.field3006.field4373.field3547, (byte) -84, this.field3006.field4373.field3565, var11);
                    if (this.field3002 != 0) {
                        for (int var12 = 0; var12 < var11; var12++) {
                            this.field3006.field4373.field3547[this.field3006.field4373.field3565 + var12] = (byte) class177.method1249(this.field3006.field4373.field3547[this.field3006.field4373.field3565 + var12], this.field3002);
                        }
                    }
                    this.field3006.field4383 += var11;
                    this.field3006.field4373.field3565 += var11;
                    if (this.field3006.field4373.field3565 == var10) {
                        this.field3006.method1728(1000);
                        this.field3006.field4099 = false;
                        this.field3006 = null;
                    } else if (this.field3006.field4383 == 512) {
                        this.field3006.field4383 = 0;
                    }
                } else {
                    int var13 = var9 - this.field3005.field3565;
                    if (var8 < var13) {
                        var13 = var8;
                    }
                    this.field2999.method210(this.field3005.field3547, (byte) 114, this.field3005.field3565, var13);
                    if (this.field3002 != 0) {
                        for (int var14 = 0; var14 < var13; var14++) {
                            this.field3005.field3547[this.field3005.field3565 + var14] = (byte) class177.method1249(this.field3005.field3547[this.field3005.field3565 + var14], this.field3002);
                        }
                    }
                    this.field3005.field3565 += var13;
                    if (this.field3005.field3565 >= var9) {
                        if (this.field3006 == null) {
                            this.field3005.field3565 = 0;
                            int var15 = this.field3005.method1408((byte) -27);
                            int var16 = this.field3005.method1410(-89);
                            int var17 = this.field3005.method1408((byte) -85);
                            int var18 = this.field3005.method1386(-4603);
                            int var19 = var17 & 0x7F;
                            boolean var20 = (var17 & 0x80) != 0;
                            long var21 = (long) ((var15 << 16) + var16);
                            Object var23 = null;
                            class246 var24;
                            if (var20) {
                                for (var24 = (class246) this.field2997.method995(arg0 + 27934); var24 != null && var24.field4542 != var21; var24 = (class246) this.field2997.method996(-127)) {
                                }
                            } else {
                                for (var24 = (class246) this.field2995.method995(26386); var24 != null && var24.field4542 != var21; var24 = (class246) this.field2995.method996(arg0 + 1454)) {
                                }
                            }
                            if (var24 == null) {
                                throw new IOException();
                            }
                            int var25 = var19 == 0 ? 5 : 9;
                            this.field3006 = var24;
                            this.field3006.field4373 = new class200(this.field3006.field4381 + var18 + var25);
                            this.field3006.field4373.method1388(-80, var19);
                            this.field3006.field4373.method1406(arg0 + 1472535572, var18);
                            this.field3005.field3565 = 0;
                            this.field3006.field4383 = 8;
                        } else if (this.field3006.field4383 != 0) {
                            throw new IOException();
                        } else if (this.field3005.field3547[0] == -1) {
                            this.field3005.field3565 = 0;
                            this.field3006.field4383 = 1;
                        } else {
                            this.field3006 = null;
                        }
                    }
                }
            }
            return true;
        } catch (IOException var28) {
            try {
                this.field2999.method207((byte) 113);
            } catch (Exception var26) {
            }
            this.field3003++;
            this.field2999 = null;
            return this.method1150(23654) == 0 && this.method1152((byte) -127) == 0;
        }
    }
}
