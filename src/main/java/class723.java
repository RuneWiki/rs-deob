import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cp")
public class class723 extends class197 {

    @OriginalMember(owner = "client!cp", name = "p", descriptor = "I")
    private int field10074 = 0;

    @OriginalMember(owner = "client!cp", name = "h", descriptor = "Lkk;")
    private class188 field10066 = new class188(16);

    @OriginalMember(owner = "client!cp", name = "G", descriptor = "I")
    private int field10091 = 0;

    @OriginalMember(owner = "client!cp", name = "K", descriptor = "Lbg;")
    private class464 field10095 = new class464();

    @OriginalMember(owner = "client!cp", name = "M", descriptor = "J")
    private long field10097 = 0L;

    @OriginalMember(owner = "client!cp", name = "d", descriptor = "Lmda;")
    private class263 field10062;

    @OriginalMember(owner = "client!cp", name = "s", descriptor = "I")
    private int field10077;

    @OriginalMember(owner = "client!cp", name = "J", descriptor = "Z")
    private boolean field10094;

    @OriginalMember(owner = "client!cp", name = "H", descriptor = "Lbg;")
    private class464 field10092;

    @OriginalMember(owner = "client!cp", name = "L", descriptor = "Z")
    private boolean field10096;

    @OriginalMember(owner = "client!cp", name = "u", descriptor = "Lmda;")
    private class263 field10079;

    @OriginalMember(owner = "client!cp", name = "l", descriptor = "[B")
    private byte[] field10070;

    @OriginalMember(owner = "client!cp", name = "A", descriptor = "Lbc;")
    private class365 field10085;

    @OriginalMember(owner = "client!cp", name = "e", descriptor = "I")
    private int field10063;

    @OriginalMember(owner = "client!cp", name = "w", descriptor = "I")
    private int field10081;

    @OriginalMember(owner = "client!cp", name = "F", descriptor = "Liq;")
    private class605 field10090;

    @OriginalMember(owner = "client!cp", name = "j", descriptor = "Lvt;")
    private class303 field10068;

    @OriginalMember(owner = "client!cp", name = "r", descriptor = "Lpca;")
    public static class714 field10076 = new class714(8);

    @OriginalMember(owner = "client!cp", name = "g", descriptor = "I")
    public static int field10065;

    @OriginalMember(owner = "client!cp", name = "i", descriptor = "I")
    public static int field10067;

    @OriginalMember(owner = "client!cp", name = "k", descriptor = "I")
    public static int field10069;

    @OriginalMember(owner = "client!cp", name = "m", descriptor = "I")
    public static int field10071;

    @OriginalMember(owner = "client!cp", name = "n", descriptor = "I")
    public static int field10072;

    @OriginalMember(owner = "client!cp", name = "o", descriptor = "I")
    public static int field10073;

    @OriginalMember(owner = "client!cp", name = "q", descriptor = "I")
    public static int field10075;

    @OriginalMember(owner = "client!cp", name = "v", descriptor = "I")
    public static int field10080;

    @OriginalMember(owner = "client!cp", name = "x", descriptor = "I")
    public static int field10082;

    @OriginalMember(owner = "client!cp", name = "z", descriptor = "I")
    public static int field10084;

    @OriginalMember(owner = "client!cp", name = "B", descriptor = "I")
    public static int field10086;

    @OriginalMember(owner = "client!cp", name = "C", descriptor = "I")
    public static int field10087;

    @OriginalMember(owner = "client!cp", name = "D", descriptor = "I")
    public static int field10088;

    @OriginalMember(owner = "client!cp", name = "E", descriptor = "I")
    public static int field10089;

    @OriginalMember(owner = "client!cp", name = "f", descriptor = "Leg;")
    private class107 field10064;

    @OriginalMember(owner = "client!cp", name = "I", descriptor = "Z")
    private boolean field10093;

    @OriginalMember(owner = "client!cp", name = "t", descriptor = "[B")
    private byte[] field10078;

    @OriginalMember(owner = "client!cp", name = "y", descriptor = "[Lkf;")
    public static class252[] field10083;

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(BII)I")
    public static final int method4058(byte arg0, int arg1, int arg2) {
        field10087++;
        int var3 = 78 % ((arg0 + 5) / 41);
        int var4 = 0;
        while (arg1 > 0) {
            var4 = var4 << 1 | arg2 & 0x1;
            arg1--;
            arg2 >>>= 0x1;
        }
        return var4;
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(B)V")
    public final void method4059(byte arg0) {
        field10080++;
        if (this.field10092 == null || this.method1213(12607) == null) {
            return;
        }
        for (class189 var2 = this.field10095.method2765(-12261); var2 != null; var2 = this.field10095.method2759(-15361)) {
            int var3 = (int) var2.field2546;
            if (var3 < 0 || var3 >= this.field10064.field1295 || this.field10064.field1292[var3] == 0) {
                var2.method1185(-114);
            } else {
                if (this.field10078[var3] == 0) {
                    this.method4064((byte) -82, 1, var3);
                }
                if (this.field10078[var3] == -1) {
                    this.method4064((byte) -82, 2, var3);
                }
                if (this.field10078[var3] == 1) {
                    var2.method1185(-31);
                }
            }
        }
        if (arg0 < 21) {
            this.method4059((byte) 4);
        }
    }

    @OriginalMember(owner = "client!cp", name = "b", descriptor = "(I)Leg;")
    public final class107 method1213(int arg0) {
        field10084++;
        if (this.field10064 != null) {
            return this.field10064;
        }
        if (this.field10068 == null) {
            if (this.field10090.method3410((byte) 112)) {
                return null;
            }
            this.field10068 = this.field10090.method3398((byte) 75, true, (byte) 0, this.field10077, 255);
        }
        if (this.field10068.field4256) {
            return null;
        }
        byte[] var2 = this.field10068.method735((byte) 68);
        if (this.field10068 instanceof class103) {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field10064 = new class107(var2, this.field10063, this.field10070);
                if (this.field10064.field1299 != this.field10081) {
                    throw new RuntimeException();
                }
            } catch (RuntimeException var3) {
                this.field10064 = null;
                if (this.field10090.method3410((byte) 117)) {
                    this.field10068 = null;
                } else {
                    this.field10068 = this.field10090.method3398((byte) 75, true, (byte) 0, this.field10077, 255);
                }
                return null;
            }
        } else {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field10064 = new class107(var2, this.field10063, this.field10070);
            } catch (RuntimeException var4) {
                this.field10090.method3406((byte) 126);
                this.field10064 = null;
                if (this.field10090.method3410((byte) 121)) {
                    this.field10068 = null;
                } else {
                    this.field10068 = this.field10090.method3398((byte) 75, true, (byte) 0, this.field10077, 255);
                }
                return null;
            }
            if (this.field10079 != null) {
                this.field10085.method2325(var2, 29288, this.field10079, this.field10077);
            }
        }
        if (this.field10062 != null) {
            this.field10074 = 0;
            this.field10078 = new byte[this.field10064.field1295];
        }
        if (arg0 == 12607) {
            this.field10068 = null;
            return this.field10064;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(ZI)I")
    public final int method1209(boolean arg0, int arg1) {
        field10072++;
        class303 var3 = (class303) this.field10066.method1180((byte) 26, (long) arg1);
        if (arg0) {
            this.method1212(76, -103);
        }
        return var3 == null ? 0 : var3.method734(0);
    }

    @OriginalMember(owner = "client!cp", name = "b", descriptor = "(B)V")
    public final void method4060(byte arg0) {
        field10075++;
        if (this.field10092 != null) {
            if (this.method1213(12607) == null) {
                return;
            }
            if (this.field10094) {
                boolean var6 = true;
                for (class189 var7 = this.field10092.method2765(-12261); var7 != null; var7 = this.field10092.method2759(-15361)) {
                    int var9 = (int) var7.field2546;
                    if (this.field10078[var9] == 0) {
                        this.method4064((byte) -82, 1, var9);
                    }
                    if (this.field10078[var9] == 0) {
                        var6 = false;
                    } else {
                        var7.method1185(-87);
                    }
                }
                while (this.field10064.field1292.length > this.field10091) {
                    if (this.field10064.field1292[this.field10091] == 0) {
                        this.field10091++;
                    } else {
                        if (this.field10085.field5174 >= 250) {
                            var6 = false;
                            break;
                        }
                        if (this.field10078[this.field10091] == 0) {
                            this.method4064((byte) -82, 1, this.field10091);
                        }
                        if (this.field10078[this.field10091] == 0) {
                            class189 var8 = new class189();
                            var8.field2546 = this.field10091;
                            var6 = false;
                            this.field10092.method2770((byte) -13, var8);
                        }
                        this.field10091++;
                    }
                }
                if (var6) {
                    this.field10091 = 0;
                    this.field10094 = false;
                }
            } else if (this.field10093) {
                boolean var2 = true;
                for (class189 var3 = this.field10092.method2765(-12261); var3 != null; var3 = this.field10092.method2759(-15361)) {
                    int var5 = (int) var3.field2546;
                    if (this.field10078[var5] != 1) {
                        this.method4064((byte) -82, 2, var5);
                    }
                    if (this.field10078[var5] == 1) {
                        var3.method1185(-75);
                    } else {
                        var2 = false;
                    }
                }
                while (this.field10091 < this.field10064.field1292.length) {
                    if (this.field10064.field1292[this.field10091] == 0) {
                        this.field10091++;
                    } else {
                        if (this.field10090.method3403((byte) 121)) {
                            var2 = false;
                            break;
                        }
                        if (this.field10078[this.field10091] != 1) {
                            this.method4064((byte) -82, 2, this.field10091);
                        }
                        if (this.field10078[this.field10091] != 1) {
                            class189 var4 = new class189();
                            var4.field2546 = this.field10091;
                            this.field10092.method2770((byte) -13, var4);
                            var2 = false;
                        }
                        this.field10091++;
                    }
                }
                if (var2) {
                    this.field10091 = 0;
                    this.field10093 = false;
                }
            } else {
                this.field10092 = null;
            }
        }
        if (this.field10096 && this.field10097 <= class479.method2864((byte) -101)) {
            for (class303 var10 = (class303) this.field10066.method1176(24490); var10 != null; var10 = (class303) this.field10066.method1178((byte) 71)) {
                if (!var10.field4256) {
                    if (var10.field4254) {
                        if (!var10.field4255) {
                            throw new RuntimeException();
                        }
                        var10.method1185(-116);
                    } else {
                        var10.field4254 = true;
                    }
                }
            }
            this.field10097 = class479.method2864((byte) -55) + 1000L;
        }
        int var11 = 66 / ((arg0 + 56) / 58);
    }

    @OriginalMember(owner = "client!cp", name = "c", descriptor = "(B)V")
    public static void method4061(byte arg0) {
        field10076 = null;
        field10083 = null;
        if (arg0 > -19) {
            method4061((byte) 101);
        }
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(II)[B")
    public final byte[] method1212(int arg0, int arg1) {
        field10088++;
        if (arg1 != -23159) {
            this.field10070 = null;
        }
        class303 var3 = this.method4064((byte) -82, 0, arg0);
        if (var3 == null) {
            return null;
        } else {
            byte[] var4 = var3.method735((byte) 68);
            var3.method1185(-55);
            return var4;
        }
    }

    @OriginalMember(owner = "client!cp", name = "c", descriptor = "(I)I")
    public final int method4062(int arg0) {
        field10089++;
        if (this.field10064 == null) {
            return 0;
        } else {
            if (arg0 != 0) {
                this.field10074 = -64;
            }
            return this.field10064.field1285;
        }
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(Z)I")
    public final int method4063(boolean arg0) {
        field10082++;
        if (this.field10064 == null) {
            return 0;
        } else if (this.field10094) {
            if (arg0) {
                this.method4059((byte) -34);
            }
            class189 var2 = this.field10092.method2765(-12261);
            return var2 == null ? 0 : (int) var2.field2546;
        } else {
            return this.field10064.field1285;
        }
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(BI)V")
    public final void method1210(byte arg0, int arg1) {
        field10073++;
        if (this.field10062 == null) {
            return;
        }
        for (class189 var3 = this.field10095.method2765(arg0 - 12262); var3 != null; var3 = this.field10095.method2759(-15361)) {
            if (((long) arg1) == var3.field2546) {
                return;
            }
        }
        if (arg0 != 1) {
            method4061((byte) 14);
        }
        class189 var4 = new class189();
        var4.field2546 = arg1;
        this.field10095.method2770((byte) -13, var4);
    }

    @OriginalMember(owner = "client!cp", name = "b", descriptor = "(BII)Lvt;")
    private final class303 method4064(byte arg0, int arg1, int arg2) {
        field10086++;
        if (arg0 != -82) {
            this.method4068((byte) 22);
        }
        class303 var4 = (class303) this.field10066.method1180((byte) 26, (long) arg2);
        if (var4 != null && arg1 == 0 && !var4.field4255 && var4.field4256) {
            var4.method1185(arg0 - 32);
            var4 = null;
        }
        if (var4 == null) {
            if (arg1 == 0) {
                if (this.field10062 == null || this.field10078[arg2] == -1) {
                    if (this.field10090.method3410((byte) 125)) {
                        return null;
                    }
                    var4 = this.field10090.method3398((byte) 75, true, (byte) 2, arg2, this.field10077);
                } else {
                    var4 = this.field10085.method2328(arg0 - 10888, arg2, this.field10062);
                }
            } else if (arg1 == 1) {
                if (this.field10062 == null) {
                    throw new RuntimeException();
                }
                var4 = this.field10085.method2324(arg2, this.field10062, 77);
            } else if (arg1 == 2) {
                if (this.field10062 == null) {
                    throw new RuntimeException();
                }
                if (this.field10078[arg2] != -1) {
                    throw new RuntimeException();
                }
                if (this.field10090.method3403((byte) 119)) {
                    return null;
                }
                var4 = this.field10090.method3398((byte) 75, false, (byte) 2, arg2, this.field10077);
            } else {
                throw new RuntimeException();
            }
            this.field10066.method1179((long) arg2, var4, (byte) -26);
        }
        if (var4.field4256) {
            return null;
        }
        byte[] var5 = var4.method735((byte) 68);
        if (!var4 instanceof class103) {
            try {
                label159: {
                    if (var5 != null && var5.length > 2) {
                        class182.field2432.reset();
                        class182.field2432.update(var5, 0, var5.length - 2);
                        int var12 = (int) class182.field2432.getValue();
                        if (this.field10064.field1289[arg2] != var12) {
                            throw new RuntimeException();
                        }
                        if (this.field10064.field1303 == null || this.field10064.field1303[arg2] == null) {
                            break label159;
                        }
                        byte[] var13 = this.field10064.field1303[arg2];
                        byte[] var14 = class739.method4131(var5, var5.length - 2, -113, 0);
                        int var15 = 0;
                        while (true) {
                            if (var15 >= 64) {
                                break label159;
                            }
                            if (var13[var15] != var14[var15]) {
                                throw new RuntimeException();
                            }
                            var15++;
                        }
                    }
                    throw new RuntimeException();
                }
                this.field10090.field8514 = 0;
                this.field10090.field8516 = 0;
            } catch (RuntimeException var18) {
                this.field10090.method3406((byte) 105);
                var4.method1185(-38);
                if (var4.field4255 && !this.field10090.method3410((byte) 110)) {
                    class529 var16 = this.field10090.method3398((byte) 75, true, (byte) 2, arg2, this.field10077);
                    this.field10066.method1179((long) arg2, var16, (byte) -26);
                }
                return null;
            }
            var5[var5.length - 2] = (byte) (this.field10064.field1298[arg2] >>> 8);
            var5[var5.length - 1] = (byte) this.field10064.field1298[arg2];
            if (this.field10062 != null) {
                this.field10085.method2325(var5, 29288, this.field10062, arg2);
                if (this.field10078[arg2] != 1) {
                    this.field10074++;
                    this.field10078[arg2] = 1;
                }
            }
            if (!var4.field4255) {
                var4.method1185(arg0 + 3);
            }
            return var4;
        }
        try {
            if (var5 == null || var5.length <= 2) {
                throw new RuntimeException();
            }
            class182.field2432.reset();
            class182.field2432.update(var5, 0, var5.length - 2);
            int var6 = (int) class182.field2432.getValue();
            if (this.field10064.field1289[arg2] != var6) {
                throw new RuntimeException();
            }
            if (this.field10064.field1303 != null && this.field10064.field1303[arg2] != null) {
                byte[] var7 = this.field10064.field1303[arg2];
                byte[] var8 = class739.method4131(var5, var5.length - 2, -115, 0);
                for (int var9 = 0; var9 < 64; var9++) {
                    if (var7[var9] != var8[var9]) {
                        throw new RuntimeException();
                    }
                }
            }
            int var10 = ((var5[var5.length - 2] & 0xFF) << 8) + (var5[var5.length - 1] & 0xFF);
            if ((this.field10064.field1298[arg2] & 0xFFFF) != var10) {
                throw new RuntimeException();
            }
            if (this.field10078[arg2] != 1) {
                this.field10074++;
                this.field10078[arg2] = 1;
            }
            if (!var4.field4255) {
                var4.method1185(-122);
            }
            return var4;
        } catch (Exception var17) {
            this.field10078[arg2] = -1;
            var4.method1185(-88);
            if (var4.field4255 && !this.field10090.method3410((byte) 108)) {
                class529 var11 = this.field10090.method3398((byte) 75, true, (byte) 2, arg2, this.field10077);
                this.field10066.method1179((long) arg2, var11, (byte) -26);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!cp", name = "d", descriptor = "(B)V")
    public final void method4065(byte arg0) {
        field10071++;
        if (this.field10062 == null) {
            return;
        }
        this.field10093 = true;
        if (this.field10092 == null) {
            this.field10092 = new class464();
        }
        if (arg0 != 68) {
            this.field10093 = false;
        }
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(ILvc;Lee;B)V")
    public static final void method4066(int arg0, class316 arg1, class675 arg2, byte arg3) {
        field10065++;
        class361 var4 = new class361();
        var4.field5119 = arg2.method3750((byte) 35);
        var4.field5124 = arg2.method3703(120);
        var4.field5125 = new byte[var4.field5119][][];
        var4.field5117 = new int[var4.field5119];
        var4.field5121 = new class249[var4.field5119];
        var4.field5120 = new int[var4.field5119];
        var4.field5118 = new class249[var4.field5119];
        var4.field5126 = new int[var4.field5119];
        for (int var5 = 0; var5 < var4.field5119; var5++) {
            try {
                int var6 = arg2.method3750((byte) 35);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    String var17 = arg2.method3697(-1);
                    String var18 = arg2.method3697(-1);
                    int var19 = 0;
                    if (var6 == 1) {
                        var19 = arg2.method3703(122);
                    }
                    var4.field5117[var5] = var6;
                    var4.field5126[var5] = var19;
                    var4.field5118[var5] = arg1.method2041(class271.method1770(var17, 110), var18, 118);
                } else if (var6 == 3 || var6 == 4) {
                    String var7 = arg2.method3697(arg3 - 1);
                    String var8 = arg2.method3697(-1);
                    int var9 = arg2.method3750((byte) 35);
                    String[] var10 = new String[var9];
                    for (int var11 = 0; var11 < var9; var11++) {
                        var10[var11] = arg2.method3697(-1);
                    }
                    byte[][] var12 = new byte[var9][];
                    if (var6 == 3) {
                        for (int var13 = 0; var13 < var9; var13++) {
                            int var14 = arg2.method3703(90);
                            var12[var13] = new byte[var14];
                            arg2.method3723(var12[var13], 4, var14, 0);
                        }
                    }
                    var4.field5117[var5] = var6;
                    Class[] var15 = new Class[var9];
                    for (int var16 = 0; var16 < var9; var16++) {
                        var15[var16] = class271.method1770(var10[var16], 113);
                    }
                    var4.field5121[var5] = arg1.method2045(255, var8, var15, class271.method1770(var7, 109));
                    var4.field5125[var5] = var12;
                }
            } catch (ClassNotFoundException var20) {
                var4.field5120[var5] = -1;
            } catch (SecurityException var21) {
                var4.field5120[var5] = -2;
            } catch (NullPointerException var22) {
                var4.field5120[var5] = -3;
            } catch (Exception var23) {
                var4.field5120[var5] = -4;
            } catch (Throwable var24) {
                var4.field5120[var5] = -5;
            }
        }
        class103.field1219.method2770((byte) -13, var4);
        if (arg3 != 0) {
            field10076 = null;
        }
    }

    @OriginalMember(owner = "client!cp", name = "b", descriptor = "(Z)I")
    public final int method4067(boolean arg0) {
        if (!arg0) {
            this.field10091 = -24;
        }
        field10067++;
        return this.field10074;
    }

    @OriginalMember(owner = "client!cp", name = "e", descriptor = "(B)I")
    public final int method4068(byte arg0) {
        field10069++;
        if (this.method1213(12607) == null) {
            return this.field10068 == null ? 0 : this.field10068.method734(0);
        } else if (arg0 >= -124) {
            return 106;
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!cp", name = "<init>", descriptor = "(ILmda;Lmda;Liq;Lbc;I[BIZ)V")
    public class723(int arg0, class263 arg1, class263 arg2, class605 arg3, class365 arg4, int arg5, byte[] arg6, int arg7, boolean arg8) {
        this.field10062 = arg1;
        this.field10077 = arg0;
        if (this.field10062 == null) {
            this.field10094 = false;
        } else {
            this.field10094 = true;
            this.field10092 = new class464();
        }
        this.field10096 = arg8;
        this.field10079 = arg2;
        this.field10070 = arg6;
        this.field10085 = arg4;
        this.field10063 = arg5;
        this.field10081 = arg7;
        this.field10090 = arg3;
        if (this.field10079 != null) {
            this.field10068 = this.field10085.method2328(-10970, this.field10077, this.field10079);
        }
    }
}
