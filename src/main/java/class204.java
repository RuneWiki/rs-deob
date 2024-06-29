import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vn")
public class class204 {

    @OriginalMember(owner = "client!vn", name = "j", descriptor = "Ltn;")
    private class59 field2959 = new class59();

    @OriginalMember(owner = "client!vn", name = "s", descriptor = "Ltn;")
    private class59 field2968 = new class59();

    @OriginalMember(owner = "client!vn", name = "t", descriptor = "Ltn;")
    private class59 field2969 = new class59();

    @OriginalMember(owner = "client!vn", name = "u", descriptor = "Ltn;")
    private class59 field2970 = new class59();

    @OriginalMember(owner = "client!vn", name = "x", descriptor = "Liv;")
    private class65 field2973 = new class65(4);

    @OriginalMember(owner = "client!vn", name = "A", descriptor = "I")
    public volatile int field2976 = 0;

    @OriginalMember(owner = "client!vn", name = "B", descriptor = "B")
    private byte field2977 = 0;

    @OriginalMember(owner = "client!vn", name = "C", descriptor = "I")
    public volatile int field2978 = 0;

    @OriginalMember(owner = "client!vn", name = "z", descriptor = "Liv;")
    private class65 field2975 = new class65(8);

    @OriginalMember(owner = "client!vn", name = "i", descriptor = "Lmp;")
    public static class531 field2958 = new class531();

    @OriginalMember(owner = "client!vn", name = "q", descriptor = "I")
    public static int field2966 = 0;

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "I")
    public static int field2950;

    @OriginalMember(owner = "client!vn", name = "b", descriptor = "I")
    public static int field2951;

    @OriginalMember(owner = "client!vn", name = "c", descriptor = "I")
    public static int field2952;

    @OriginalMember(owner = "client!vn", name = "d", descriptor = "I")
    public static int field2953;

    @OriginalMember(owner = "client!vn", name = "e", descriptor = "I")
    public static int field2954;

    @OriginalMember(owner = "client!vn", name = "f", descriptor = "I")
    public static int field2955;

    @OriginalMember(owner = "client!vn", name = "g", descriptor = "I")
    public static int field2956;

    @OriginalMember(owner = "client!vn", name = "h", descriptor = "I")
    public static int field2957;

    @OriginalMember(owner = "client!vn", name = "k", descriptor = "I")
    public static int field2960;

    @OriginalMember(owner = "client!vn", name = "l", descriptor = "I")
    public static int field2961;

    @OriginalMember(owner = "client!vn", name = "m", descriptor = "I")
    public static int field2962;

    @OriginalMember(owner = "client!vn", name = "n", descriptor = "I")
    public static int field2963;

    @OriginalMember(owner = "client!vn", name = "o", descriptor = "I")
    public static int field2964;

    @OriginalMember(owner = "client!vn", name = "p", descriptor = "I")
    public static int field2965;

    @OriginalMember(owner = "client!vn", name = "r", descriptor = "I")
    public static int field2967;

    @OriginalMember(owner = "client!vn", name = "y", descriptor = "I")
    private int field2974;

    @OriginalMember(owner = "client!vn", name = "w", descriptor = "J")
    private long field2972;

    @OriginalMember(owner = "client!vn", name = "D", descriptor = "Lje;")
    private class276 field2979;

    @OriginalMember(owner = "client!vn", name = "v", descriptor = "Lal;")
    private class66 field2971;

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(B)I")
    private final int method1416(byte arg0) {
        field2952++;
        if (arg0 != 58) {
            this.field2974 = -126;
        }
        return this.field2969.method541(true) + this.field2970.method541(true);
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(I)Z")
    public final boolean method1417(int arg0) {
        if (arg0 != 0) {
            this.method1422(33, (byte) 9, (byte) 80, false, -3);
        }
        field2953++;
        return this.method1426(0) >= 20;
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(ILal;Z)V")
    public final void method1418(int arg0, class66 arg1, boolean arg2) {
        field2962++;
        if (this.field2971 != null) {
            try {
                this.field2971.method646(false);
            } catch (Exception var8) {
            }
            this.field2971 = null;
        }
        this.field2971 = arg1;
        this.method1419((byte) 56);
        this.method1420(arg2, (byte) 61);
        this.field2975.field827 = 0;
        this.field2979 = null;
        while (true) {
            class276 var4 = (class276) this.field2968.method539((byte) 90);
            if (var4 == null) {
                while (true) {
                    class276 var5 = (class276) this.field2970.method539((byte) -71);
                    if (var5 == null) {
                        if (this.field2977 != 0) {
                            try {
                                this.field2973.field827 = 0;
                                this.field2973.method638(255, 4);
                                this.field2973.method638(arg0 ^ 0xFF, this.field2977);
                                this.field2973.method611((byte) 67, 0);
                                this.field2971.method650(4, 0, this.field2973.field783, arg0 ^ 0x7F);
                            } catch (IOException var7) {
                                try {
                                    this.field2971.method646(false);
                                } catch (Exception var6) {
                                }
                                this.field2978 = -2;
                                this.field2976++;
                                this.field2971 = null;
                            }
                        }
                        this.field2974 = arg0;
                        this.field2972 = class437.method2644(-91);
                        return;
                    }
                    this.field2969.method536(14, var5);
                }
            }
            this.field2959.method536(30, var4);
        }
    }

    @OriginalMember(owner = "client!vn", name = "b", descriptor = "(B)V")
    private final void method1419(byte arg0) {
        field2957++;
        if (this.field2971 == null) {
            return;
        }
        try {
            this.field2973.field827 = 0;
            this.field2973.method638(255, 6);
            this.field2973.method604(-28, 3);
            if (arg0 == 56) {
                this.field2971.method650(4, 0, this.field2973.field783, arg0 + 71);
            }
        } catch (IOException var3) {
            try {
                this.field2971.method646(false);
            } catch (Exception var2) {
            }
            this.field2971 = null;
            this.field2976++;
            this.field2978 = -2;
        }
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(ZB)V")
    public final void method1420(boolean arg0, byte arg1) {
        if (arg1 < 4) {
            method1428(20);
        }
        field2954++;
        if (this.field2971 == null) {
            return;
        }
        try {
            this.field2973.field827 = 0;
            this.field2973.method638(255, arg0 ? 2 : 3);
            this.field2973.method604(-86, 0);
            this.field2971.method650(4, 0, this.field2973.field783, 126);
        } catch (IOException var4) {
            try {
                this.field2971.method646(false);
            } catch (Exception var3) {
            }
            this.field2978 = -2;
            this.field2971 = null;
            this.field2976++;
        }
    }

    @OriginalMember(owner = "client!vn", name = "c", descriptor = "(B)V")
    public final void method1421(byte arg0) {
        field2956++;
        try {
            this.field2971.method646(false);
        } catch (Exception var3) {
        }
        this.field2971 = null;
        this.field2978 = -1;
        this.field2977 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
        this.field2976++;
        int var2 = 110 / ((arg0 - 26) / 60);
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(IBBZI)Lje;")
    public final class276 method1422(int arg0, byte arg1, byte arg2, boolean arg3, int arg4) {
        field2960++;
        int var6 = 78 / ((arg2 + 8) / 37);
        long var7 = (long) ((arg0 << 16) + arg4);
        class276 var9 = new class276();
        var9.field5561 = var7;
        var9.field2234 = arg3;
        var9.field4067 = arg1;
        if (arg3) {
            if (this.method1426(0) >= 20) {
                throw new RuntimeException();
            }
            this.field2959.method536(-126, var9);
        } else if (this.method1416((byte) 58) < 20) {
            this.field2969.method536(-13, var9);
        } else {
            throw new RuntimeException();
        }
        return var9;
    }

    @OriginalMember(owner = "client!vn", name = "d", descriptor = "(B)V")
    public final void method1423(byte arg0) {
        if (this.field2971 != null) {
            this.field2971.method640(0);
        }
        int var2 = 76 / ((14 - arg0) / 35);
        field2965++;
    }

    @OriginalMember(owner = "client!vn", name = "e", descriptor = "(B)V")
    public final void method1424(byte arg0) {
        field2964++;
        if (this.field2971 == null) {
            return;
        }
        try {
            this.field2973.field827 = 0;
            this.field2973.method638(255, 7);
            this.field2973.method604(-14, 0);
            this.field2971.method650(4, 0, this.field2973.field783, 126);
        } catch (IOException var3) {
            try {
                this.field2971.method646(false);
            } catch (Exception var2) {
            }
            this.field2978 = -2;
            this.field2971 = null;
            this.field2976++;
        }
        if (arg0 != -81) {
            this.method1421((byte) 64);
        }
    }

    @OriginalMember(owner = "client!vn", name = "b", descriptor = "(I)Z")
    public final boolean method1425(int arg0) {
        field2955++;
        if (this.field2971 != null) {
            long var2 = class437.method2644(-113);
            int var4 = (int) (var2 - this.field2972);
            this.field2972 = var2;
            if (var4 > 200) {
                var4 = 200;
            }
            this.field2974 += var4;
            if (this.field2974 > 30000) {
                try {
                    this.field2971.method646(false);
                } catch (Exception var27) {
                }
                this.field2971 = null;
            }
        }
        if (this.field2971 == null) {
            return this.method1426(0) == 0 && this.method1416((byte) 58) == 0;
        }
        try {
            this.field2971.method649(-2);
            for (class276 var5 = (class276) this.field2959.method537((byte) 87); var5 != null; var5 = (class276) this.field2959.method540(true)) {
                this.field2973.field827 = 0;
                this.field2973.method638(255, 1);
                this.field2973.method604(-77, (int) var5.field5561);
                this.field2971.method650(4, 0, this.field2973.field783, 127);
                this.field2968.method536(-114, var5);
            }
            for (class276 var6 = (class276) this.field2969.method537((byte) 87); var6 != null; var6 = (class276) this.field2969.method540(true)) {
                this.field2973.field827 = 0;
                this.field2973.method638(255, 0);
                this.field2973.method604(-41, (int) var6.field5561);
                this.field2971.method650(4, 0, this.field2973.field783, 127);
                this.field2970.method536(-117, var6);
            }
            if (arg0 > -40) {
                this.field2972 = -111L;
            }
            for (int var7 = 0; var7 < 100; var7++) {
                int var8 = this.field2971.method641(3);
                if (var8 < 0) {
                    throw new IOException();
                }
                if (var8 == 0) {
                    break;
                }
                this.field2974 = 0;
                byte var9 = 0;
                if (this.field2979 == null) {
                    var9 = 8;
                } else if (this.field2979.field4065 == 0) {
                    var9 = 1;
                }
                if (var9 <= 0) {
                    int var10 = this.field2979.field4064.field783.length - this.field2979.field4067;
                    int var11 = 512 - this.field2979.field4065;
                    if ((var10 - this.field2979.field4064.field827) < var11) {
                        var11 = var10 - this.field2979.field4064.field827;
                    }
                    if (var11 > var8) {
                        var11 = var8;
                    }
                    this.field2971.method639(this.field2979.field4064.field827, (byte) 113, var11, this.field2979.field4064.field783);
                    if (this.field2977 != 0) {
                        for (int var12 = 0; var12 < var11; var12++) {
                            this.field2979.field4064.field783[this.field2979.field4064.field827 + var12] = (byte) class429.method2613(this.field2979.field4064.field783[this.field2979.field4064.field827 + var12], this.field2977);
                        }
                    }
                    this.field2979.field4064.field827 += var11;
                    this.field2979.field4065 += var11;
                    if (this.field2979.field4064.field827 == var10) {
                        this.field2979.method2307((byte) 59);
                        this.field2979.field2230 = false;
                        this.field2979 = null;
                    } else if (this.field2979.field4065 == 512) {
                        this.field2979.field4065 = 0;
                    }
                } else {
                    int var13 = var9 - this.field2975.field827;
                    if (var13 > var8) {
                        var13 = var8;
                    }
                    this.field2971.method639(this.field2975.field827, (byte) 113, var13, this.field2975.field783);
                    if (this.field2977 != 0) {
                        for (int var14 = 0; var14 < var13; var14++) {
                            this.field2975.field783[this.field2975.field827 + var14] = (byte) class429.method2613(this.field2975.field783[this.field2975.field827 + var14], this.field2977);
                        }
                    }
                    this.field2975.field827 += var13;
                    if (var9 <= this.field2975.field827) {
                        if (this.field2979 == null) {
                            this.field2975.field827 = 0;
                            int var15 = this.field2975.method577(255);
                            int var16 = this.field2975.method623((byte) -95);
                            int var17 = this.field2975.method577(255);
                            int var18 = this.field2975.method616((byte) 77);
                            int var19 = var17 & 0x7F;
                            boolean var20 = (var17 & 0x80) != 0;
                            long var21 = (long) ((var15 << 16) + var16);
                            Object var23 = null;
                            class276 var24;
                            if (var20) {
                                for (var24 = (class276) this.field2970.method537((byte) 87); var24 != null && var24.field5561 != var21; var24 = (class276) this.field2970.method540(true)) {
                                }
                            } else {
                                for (var24 = (class276) this.field2968.method537((byte) 87); var24 != null && var24.field5561 != var21; var24 = (class276) this.field2968.method540(true)) {
                                }
                            }
                            if (var24 == null) {
                                throw new IOException();
                            }
                            int var25 = var19 == 0 ? 5 : 9;
                            this.field2979 = var24;
                            this.field2979.field4064 = new class65(var18 + var25 + this.field2979.field4067);
                            this.field2979.field4064.method638(255, var19);
                            this.field2979.field4064.method618(var18, (byte) 120);
                            this.field2975.field827 = 0;
                            this.field2979.field4065 = 8;
                        } else if (this.field2979.field4065 != 0) {
                            throw new IOException();
                        } else if (this.field2975.field783[0] == -1) {
                            this.field2979.field4065 = 1;
                            this.field2975.field827 = 0;
                        } else {
                            this.field2979 = null;
                        }
                    }
                }
            }
            return true;
        } catch (IOException var28) {
            try {
                this.field2971.method646(false);
            } catch (Exception var26) {
            }
            this.field2976++;
            this.field2978 = -2;
            this.field2971 = null;
            return this.method1426(0) == 0 && this.method1416((byte) 58) == 0;
        }
    }

    @OriginalMember(owner = "client!vn", name = "c", descriptor = "(I)I")
    public final int method1426(int arg0) {
        if (arg0 != 0) {
            this.method1416((byte) -36);
        }
        field2951++;
        return this.field2959.method541(true) + this.field2968.method541(true);
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(II)Z")
    public static final boolean method1427(int arg0, int arg1) {
        if (arg0 <= 121) {
            field2966 = 12;
        }
        field2961++;
        return arg1 >= 4 && arg1 <= 8;
    }

    @OriginalMember(owner = "client!vn", name = "d", descriptor = "(I)V")
    public static void method1428(int arg0) {
        field2958 = null;
        if (arg0 != -15604) {
            method1430(null, -27);
        }
    }

    @OriginalMember(owner = "client!vn", name = "f", descriptor = "(B)Z")
    public final boolean method1429(byte arg0) {
        if (arg0 == -46) {
            field2963++;
            return this.method1416((byte) 58) >= 20;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(Lnf;I)Z")
    public static final boolean method1430(class405 arg0, int arg1) {
        field2967++;
        if (arg0 == null) {
            return false;
        } else if (!arg0.field5989) {
            return false;
        } else if (!arg0.method2481(arg1 - 11249, class399.field5894)) {
            return false;
        } else if (class57.field665.method875((long) arg0.field5999, 127) != null) {
            return false;
        } else if (class205.field2990.method875((long) arg0.field6007, 126) == null) {
            if (arg1 != 2) {
                method1427(114, -84);
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!vn", name = "e", descriptor = "(I)V")
    public final void method1431(int arg0) {
        if (arg0 != 228742352) {
            this.field2977 = -102;
        }
        field2950++;
        if (this.field2971 != null) {
            this.field2971.method646(false);
        }
    }
}
