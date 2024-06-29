import java.awt.Frame;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gq")
public class class476 {

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "Lce;")
    private class283 field7035 = new class283();

    @OriginalMember(owner = "client!gq", name = "f", descriptor = "Lce;")
    private class283 field7040 = new class283();

    @OriginalMember(owner = "client!gq", name = "o", descriptor = "Lce;")
    private class283 field7049 = new class283();

    @OriginalMember(owner = "client!gq", name = "z", descriptor = "Lce;")
    private class283 field7060 = new class283();

    @OriginalMember(owner = "client!gq", name = "B", descriptor = "Lie;")
    private class6 field7062 = new class6(4);

    @OriginalMember(owner = "client!gq", name = "F", descriptor = "I")
    public volatile int field7066 = 0;

    @OriginalMember(owner = "client!gq", name = "H", descriptor = "I")
    public volatile int field7068 = 0;

    @OriginalMember(owner = "client!gq", name = "G", descriptor = "B")
    private byte field7067 = 0;

    @OriginalMember(owner = "client!gq", name = "I", descriptor = "Lie;")
    private class6 field7069 = new class6(8);

    @OriginalMember(owner = "client!gq", name = "p", descriptor = "Lhga;")
    public static class158 field7050 = new class158(103, 7);

    @OriginalMember(owner = "client!gq", name = "s", descriptor = "[Z")
    public static boolean[] field7053 = new boolean[100];

    @OriginalMember(owner = "client!gq", name = "v", descriptor = "I")
    public static int field7056 = 0;

    @OriginalMember(owner = "client!gq", name = "w", descriptor = "Z")
    public static boolean field7057 = false;

    @OriginalMember(owner = "client!gq", name = "b", descriptor = "I")
    public static int field7036;

    @OriginalMember(owner = "client!gq", name = "c", descriptor = "I")
    public static int field7037;

    @OriginalMember(owner = "client!gq", name = "d", descriptor = "I")
    public static int field7038;

    @OriginalMember(owner = "client!gq", name = "e", descriptor = "I")
    public static int field7039;

    @OriginalMember(owner = "client!gq", name = "g", descriptor = "I")
    public static int field7041;

    @OriginalMember(owner = "client!gq", name = "h", descriptor = "I")
    public static int field7042;

    @OriginalMember(owner = "client!gq", name = "i", descriptor = "I")
    public static int field7043;

    @OriginalMember(owner = "client!gq", name = "j", descriptor = "I")
    public static int field7044;

    @OriginalMember(owner = "client!gq", name = "k", descriptor = "I")
    public static int field7045;

    @OriginalMember(owner = "client!gq", name = "l", descriptor = "I")
    public static int field7046;

    @OriginalMember(owner = "client!gq", name = "m", descriptor = "I")
    public static int field7047;

    @OriginalMember(owner = "client!gq", name = "n", descriptor = "I")
    public static int field7048;

    @OriginalMember(owner = "client!gq", name = "q", descriptor = "I")
    public static int field7051;

    @OriginalMember(owner = "client!gq", name = "r", descriptor = "I")
    public static int field7052;

    @OriginalMember(owner = "client!gq", name = "u", descriptor = "I")
    public static int field7055;

    @OriginalMember(owner = "client!gq", name = "D", descriptor = "I")
    private int field7064;

    @OriginalMember(owner = "client!gq", name = "E", descriptor = "J")
    private long field7065;

    @OriginalMember(owner = "client!gq", name = "t", descriptor = "Lhw;")
    public static class116 field7054;

    @OriginalMember(owner = "client!gq", name = "J", descriptor = "Lnn;")
    private class381 field7070;

    @OriginalMember(owner = "client!gq", name = "C", descriptor = "Ldv;")
    private class610 field7063;

    @OriginalMember(owner = "client!gq", name = "y", descriptor = "Ldd;")
    public static class654 field7059;

    @OriginalMember(owner = "client!gq", name = "A", descriptor = "Ljava/awt/Frame;")
    public static Frame field7061;

    @OriginalMember(owner = "client!gq", name = "x", descriptor = "[I")
    public static int[] field7058;

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(I)Z")
    public final boolean method2948(int arg0) {
        if (this.field7063 != null) {
            long var2 = class112.method1033(-11752);
            int var4 = (int) (var2 - this.field7065);
            this.field7065 = var2;
            if (var4 > 200) {
                var4 = 200;
            }
            this.field7064 += var4;
            if (this.field7064 > 30000) {
                try {
                    this.field7063.method3554((byte) 125);
                } catch (Exception var27) {
                }
                this.field7063 = null;
            }
        }
        field7042++;
        if (this.field7063 == null) {
            return this.method2953((byte) 34) == 0 && this.method2959(true) == 0;
        }
        try {
            this.field7063.method3548((byte) -119);
            for (class381 var5 = (class381) this.field7035.method2008(-3717); var5 != null; var5 = (class381) this.field7035.method2011(35)) {
                this.field7062.field57 = 0;
                this.field7062.method65(1, -77);
                this.field7062.method47((int) var5.field1586, -1088828144);
                this.field7063.method3552(this.field7062.field96, 0, 4, true);
                this.field7040.method2015(var5, -26);
            }
            class381 var6 = (class381) this.field7049.method2008(arg0 ^ 0xE87);
            if (arg0 != -4) {
                this.method2950(true, 17, null);
            }
            while (var6 != null) {
                this.field7062.field57 = 0;
                this.field7062.method65(0, arg0 ^ 0x4F);
                this.field7062.method47((int) var6.field1586, -1088828144);
                this.field7063.method3552(this.field7062.field96, 0, 4, true);
                this.field7060.method2015(var6, arg0 - 59);
                var6 = (class381) this.field7049.method2011(35);
            }
            for (int var7 = 0; var7 < 100; var7++) {
                int var8 = this.field7063.method3546(3);
                if (var8 < 0) {
                    throw new IOException();
                }
                if (var8 == 0) {
                    break;
                }
                this.field7064 = 0;
                byte var9 = 0;
                if (this.field7070 == null) {
                    var9 = 8;
                } else if (this.field7070.field5920 == 0) {
                    var9 = 1;
                }
                if (var9 > 0) {
                    int var10 = var9 - this.field7069.field57;
                    if (var8 < var10) {
                        var10 = var8;
                    }
                    this.field7063.method3555(this.field7069.field96, var10, -124, this.field7069.field57);
                    if (this.field7067 != 0) {
                        for (int var11 = 0; var11 < var10; var11++) {
                            this.field7069.field96[this.field7069.field57 + var11] = (byte) class357.method2397(this.field7069.field96[this.field7069.field57 + var11], this.field7067);
                        }
                    }
                    this.field7069.field57 += var10;
                    if (var9 <= this.field7069.field57) {
                        if (this.field7070 == null) {
                            this.field7069.field57 = 0;
                            int var12 = this.field7069.method70(-9059);
                            int var13 = this.field7069.method67(arg0 ^ 0xFFFFD109);
                            int var14 = this.field7069.method70(arg0 - 9055);
                            int var15 = this.field7069.method72(arg0 - 93);
                            int var16 = var14 & 0x7F;
                            boolean var17 = (var14 & 0x80) != 0;
                            long var18 = (long) ((var12 << 16) + var13);
                            Object var20 = null;
                            class381 var21;
                            if (var17) {
                                for (var21 = (class381) this.field7060.method2008(-3717); var21 != null && var21.field1586 != var18; var21 = (class381) this.field7060.method2011(35)) {
                                }
                            } else {
                                for (var21 = (class381) this.field7040.method2008(-3717); var21 != null && var21.field1586 != var18; var21 = (class381) this.field7040.method2011(35)) {
                                }
                            }
                            if (var21 == null) {
                                throw new IOException();
                            }
                            int var22 = var16 == 0 ? 5 : 9;
                            this.field7070 = var21;
                            this.field7070.field5915 = new class6(var15 + var22 + this.field7070.field5916);
                            this.field7070.field5915.method65(var16, -77);
                            this.field7070.field5915.method82(false, var15);
                            this.field7069.field57 = 0;
                            this.field7070.field5920 = 8;
                        } else if (this.field7070.field5920 != 0) {
                            throw new IOException();
                        } else if (this.field7069.field96[0] == -1) {
                            this.field7069.field57 = 0;
                            this.field7070.field5920 = 1;
                        } else {
                            this.field7070 = null;
                        }
                    }
                } else {
                    int var23 = this.field7070.field5915.field96.length - this.field7070.field5916;
                    int var24 = 512 - this.field7070.field5920;
                    if (var24 > var23 - this.field7070.field5915.field57) {
                        var24 = var23 - this.field7070.field5915.field57;
                    }
                    if (var8 < var24) {
                        var24 = var8;
                    }
                    this.field7063.method3555(this.field7070.field5915.field96, var24, -97, this.field7070.field5915.field57);
                    if (this.field7067 != 0) {
                        for (int var25 = 0; var25 < var24; var25++) {
                            this.field7070.field5915.field96[this.field7070.field5915.field57 + var25] = (byte) class357.method2397(this.field7070.field5915.field96[this.field7070.field5915.field57 + var25], this.field7067);
                        }
                    }
                    this.field7070.field5915.field57 += var24;
                    this.field7070.field5920 += var24;
                    if (this.field7070.field5915.field57 == var23) {
                        this.field7070.method958((byte) 69);
                        this.field7070.field644 = false;
                        this.field7070 = null;
                    } else if (this.field7070.field5920 == 512) {
                        this.field7070.field5920 = 0;
                    }
                }
            }
            return true;
        } catch (IOException var28) {
            try {
                this.field7063.method3554((byte) 117);
            } catch (Exception var26) {
            }
            this.field7066++;
            this.field7068 = -2;
            this.field7063 = null;
            return this.method2953((byte) 34) == 0 && this.method2959(true) == 0;
        }
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(B)Z")
    public final boolean method2949(byte arg0) {
        field7041++;
        int var2 = 40 / ((arg0 + 45) / 60);
        return this.method2959(true) >= 20;
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(ZILdv;)V")
    public final void method2950(boolean arg0, int arg1, class610 arg2) {
        field7047++;
        if (this.field7063 != null) {
            try {
                this.field7063.method3554((byte) 116);
            } catch (Exception var8) {
            }
            this.field7063 = null;
        }
        this.field7063 = arg2;
        this.method2955(true);
        this.method2961(arg0, -15945);
        this.field7070 = null;
        this.field7069.field57 = 0;
        while (true) {
            class381 var4 = (class381) this.field7040.method2012(false);
            if (var4 == null) {
                while (true) {
                    class381 var5 = (class381) this.field7060.method2012(false);
                    if (var5 == null) {
                        if (arg1 != 30000) {
                            field7058 = null;
                        }
                        if (this.field7067 != 0) {
                            try {
                                this.field7062.field57 = 0;
                                this.field7062.method65(4, arg1 ^ 0xFFFF8A83);
                                this.field7062.method65(this.field7067, -77);
                                this.field7062.method25(true, 0);
                                this.field7063.method3552(this.field7062.field96, 0, 4, true);
                            } catch (IOException var7) {
                                try {
                                    this.field7063.method3554((byte) 121);
                                } catch (Exception var6) {
                                }
                                this.field7068 = -2;
                                this.field7063 = null;
                                this.field7066++;
                            }
                        }
                        this.field7064 = 0;
                        this.field7065 = class112.method1033(arg1 ^ 0xFFFFA728);
                        return;
                    }
                    this.field7049.method2015(var5, arg1 ^ 0xFFFF8ABF);
                }
            }
            this.field7035.method2015(var4, -93);
        }
    }

    @OriginalMember(owner = "client!gq", name = "b", descriptor = "(I)Z")
    public final boolean method2951(int arg0) {
        field7048++;
        if (arg0 != -6508) {
            this.field7070 = null;
        }
        return this.method2953((byte) 34) >= 20;
    }

    @OriginalMember(owner = "client!gq", name = "b", descriptor = "(B)V")
    public final void method2952(byte arg0) {
        if (arg0 > -44) {
            field7057 = false;
        }
        try {
            this.field7063.method3554((byte) 102);
        } catch (Exception var2) {
        }
        field7039++;
        this.field7063 = null;
        this.field7068 = -1;
        this.field7066++;
        this.field7067 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
    }

    @OriginalMember(owner = "client!gq", name = "c", descriptor = "(B)I")
    public final int method2953(byte arg0) {
        field7037++;
        return arg0 == 34 ? this.field7035.method2009(arg0 ^ 0x633F) + this.field7040.method2009(25373) : -22;
    }

    @OriginalMember(owner = "client!gq", name = "d", descriptor = "(B)V")
    public final void method2954(byte arg0) {
        field7055++;
        if (arg0 <= 43) {
            this.method2952((byte) 42);
        }
        if (this.field7063 == null) {
            return;
        }
        try {
            this.field7062.field57 = 0;
            this.field7062.method65(7, -77);
            this.field7062.method47(0, -1088828144);
            this.field7063.method3552(this.field7062.field96, 0, 4, true);
        } catch (IOException var3) {
            try {
                this.field7063.method3554((byte) 93);
            } catch (Exception var2) {
            }
            this.field7063 = null;
            this.field7068 = -2;
            this.field7066++;
        }
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(Z)V")
    private final void method2955(boolean arg0) {
        field7044++;
        if (this.field7063 == null) {
            return;
        }
        try {
            this.field7062.field57 = 0;
            this.field7062.method65(6, -77);
            this.field7062.method47(3, -1088828144);
            this.field7063.method3552(this.field7062.field96, 0, 4, arg0);
        } catch (IOException var3) {
            try {
                this.field7063.method3554((byte) 107);
            } catch (Exception var2) {
            }
            this.field7063 = null;
            this.field7066++;
            this.field7068 = -2;
        }
        if (!arg0) {
            field7058 = null;
        }
    }

    @OriginalMember(owner = "client!gq", name = "b", descriptor = "(Z)V")
    public static void method2956(boolean arg0) {
        field7059 = null;
        field7053 = null;
        field7061 = null;
        field7058 = null;
        if (arg0) {
            field7054 = null;
            field7050 = null;
        }
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(BIZBI)Lnn;")
    public final class381 method2957(byte arg0, int arg1, boolean arg2, byte arg3, int arg4) {
        int var6 = 69 % ((arg0 + 30) / 58);
        field7046++;
        long var7 = (long) ((arg1 << 16) + arg4);
        class381 var9 = new class381();
        var9.field5916 = arg3;
        var9.field648 = arg2;
        var9.field1586 = var7;
        if (arg2) {
            if (this.method2953((byte) 34) >= 20) {
                throw new RuntimeException();
            }
            this.field7035.method2015(var9, -120);
        } else if (this.method2959(true) < 20) {
            this.field7049.method2015(var9, -74);
        } else {
            throw new RuntimeException();
        }
        return var9;
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(Lol;B)V")
    public static final void method2958(class260 arg0, byte arg1) {
        field7052++;
        if (arg0.field4183 != -1) {
            class428 var2 = class636.field8942.method2872((byte) 11, arg0.field4183);
            if (var2 == null || var2.field6521 == null) {
                arg0.field4183 = -1;
                arg0.field4217 = false;
            } else {
                label365: {
                    arg0.field4189++;
                    if (arg0.field4184 < var2.field6521.length && var2.field6532[arg0.field4184] < arg0.field4189) {
                        arg0.field4184++;
                        arg0.field4178++;
                        arg0.field4189 = 1;
                        if (!arg0.field4180) {
                            class216.method1622(arg0.field4184, arg0, (byte) -55, var2);
                        }
                    }
                    if (var2.field6521.length <= arg0.field4184) {
                        arg0.field4184 = 0;
                        arg0.field4189 = 0;
                        if (arg0.field4217) {
                            arg0.field4183 = arg0.method1856(1208).method3727((byte) 29);
                            if (arg0.field4183 == -1) {
                                arg0.field4217 = false;
                                break label365;
                            }
                            var2 = class636.field8942.method2872((byte) 11, arg0.field4183);
                        }
                        if (!arg0.field4180) {
                            class216.method1622(arg0.field4184, arg0, (byte) -123, var2);
                        }
                    }
                    arg0.field4178 = arg0.field4184 + 1;
                    if (var2.field6521 == null) {
                        arg0.field4183 = -1;
                        arg0.field4217 = false;
                    } else if (arg0.field4178 >= var2.field6521.length) {
                        arg0.field4178 = 0;
                    }
                }
            }
        }
        if (arg1 > -49) {
            return;
        }
        if (arg0.field4220 != -1 && class562.field8084 >= arg0.field4193) {
            class578 var3 = class65.field826.method3686(false, arg0.field4220);
            int var4 = var3.field8241;
            if (var4 == -1) {
                arg0.field4220 = -1;
            } else {
                label366: {
                    class428 var5 = class636.field8942.method2872((byte) 11, var4);
                    if (var3.field8230) {
                        if (var5.field6511 == 3) {
                            if (arg0.field4259 > 0 && class562.field8084 >= arg0.field4203 && class562.field8084 > arg0.field4151) {
                                arg0.field4220 = -1;
                                break label366;
                            }
                        } else if (var5.field6511 == 1 && arg0.field4259 > 0 && class562.field8084 >= arg0.field4203 && class562.field8084 > arg0.field4151) {
                            arg0.field4193 = class562.field8084 + 1;
                            break label366;
                        }
                    }
                    if (var5 == null || var5.field6521 == null) {
                        arg0.field4220 = -1;
                    } else {
                        if (arg0.field4240 < 0) {
                            arg0.field4240 = 0;
                            if (!arg0.field4180) {
                                class216.method1622(0, arg0, (byte) -50, var5);
                            }
                        }
                        arg0.field4210++;
                        if (var5.field6521.length > arg0.field4240 && var5.field6532[arg0.field4240] < arg0.field4210) {
                            arg0.field4240++;
                            arg0.field4210 = 1;
                            if (!arg0.field4180) {
                                class216.method1622(arg0.field4240, arg0, (byte) -31, var5);
                            }
                        }
                        if (var5.field6521.length <= arg0.field4240) {
                            if (var3.field8230) {
                                arg0.field4240 -= var5.field6510;
                                arg0.field4224++;
                                if (var5.field6507 <= arg0.field4224) {
                                    arg0.field4220 = -1;
                                } else if (arg0.field4240 < 0 || arg0.field4240 >= var5.field6521.length) {
                                    arg0.field4220 = -1;
                                } else if (!arg0.field4180) {
                                    class216.method1622(arg0.field4240, arg0, (byte) -25, var5);
                                }
                            } else {
                                arg0.field4220 = -1;
                            }
                        }
                        arg0.field4234 = arg0.field4240 + 1;
                        if (var5.field6521.length <= arg0.field4234) {
                            if (var3.field8230) {
                                arg0.field4234 -= var5.field6510;
                                if ((arg0.field4224 + 1) >= var5.field6507) {
                                    arg0.field4234 = -1;
                                } else if (arg0.field4234 < 0 || arg0.field4234 >= var5.field6521.length) {
                                    arg0.field4234 = -1;
                                }
                            } else {
                                arg0.field4234 = -1;
                            }
                        }
                    }
                }
            }
        }
        if (arg0.field4170 != -1 && arg0.field4254 <= class562.field8084) {
            class578 var6 = class65.field826.method3686(false, arg0.field4170);
            int var7 = var6.field8241;
            if (var7 == -1) {
                arg0.field4170 = -1;
            } else {
                label370: {
                    class428 var8 = class636.field8942.method2872((byte) 11, var7);
                    if (var6.field8230) {
                        if (var8.field6511 == 3) {
                            if (arg0.field4259 > 0 && arg0.field4203 <= class562.field8084 && class562.field8084 > arg0.field4151) {
                                arg0.field4170 = -1;
                                break label370;
                            }
                        } else if (var8.field6511 == 1 && arg0.field4259 > 0 && class562.field8084 >= arg0.field4203 && class562.field8084 > arg0.field4151) {
                            arg0.field4254 = class562.field8084 + 1;
                            break label370;
                        }
                    }
                    if (var8 == null || var8.field6521 == null) {
                        arg0.field4170 = -1;
                    } else {
                        if (arg0.field4153 < 0) {
                            arg0.field4153 = 0;
                            if (!arg0.field4180) {
                                class216.method1622(0, arg0, (byte) -19, var8);
                            }
                        }
                        arg0.field4165++;
                        if (arg0.field4153 < var8.field6521.length && arg0.field4165 > var8.field6532[arg0.field4153]) {
                            arg0.field4165 = 1;
                            arg0.field4153++;
                            if (!arg0.field4180) {
                                class216.method1622(arg0.field4153, arg0, (byte) -48, var8);
                            }
                        }
                        if (var8.field6521.length <= arg0.field4153) {
                            if (var6.field8230) {
                                arg0.field4153 -= var8.field6510;
                                arg0.field4249++;
                                if (var8.field6507 <= arg0.field4249) {
                                    arg0.field4170 = -1;
                                } else if (arg0.field4153 < 0 || arg0.field4153 >= var8.field6521.length) {
                                    arg0.field4170 = -1;
                                } else if (!arg0.field4180) {
                                    class216.method1622(arg0.field4153, arg0, (byte) -76, var8);
                                }
                            } else {
                                arg0.field4170 = -1;
                            }
                        }
                        arg0.field4158 = arg0.field4153 + 1;
                        if (arg0.field4158 >= var8.field6521.length) {
                            if (var6.field8230) {
                                arg0.field4158 -= var8.field6510;
                                if (var8.field6507 <= arg0.field4249 + 1) {
                                    arg0.field4158 = -1;
                                } else if (arg0.field4158 < 0 || arg0.field4158 >= var8.field6521.length) {
                                    arg0.field4158 = -1;
                                }
                            } else {
                                arg0.field4158 = -1;
                            }
                        }
                    }
                }
            }
        }
        if (arg0.field4215 != -1 && arg0.field4150 <= 1) {
            class428 var9 = class636.field8942.method2872((byte) 11, arg0.field4215);
            if (var9.field6511 == 3) {
                if (arg0.field4259 > 0 && arg0.field4203 <= class562.field8084 && class562.field8084 > arg0.field4151) {
                    arg0.field4174 = null;
                    arg0.field4215 = -1;
                }
            } else if (var9.field6511 == 1 && arg0.field4259 > 0 && arg0.field4203 <= class562.field8084 && class562.field8084 > arg0.field4151) {
                arg0.field4150 = 2;
            }
        }
        if (arg0.field4215 != -1 && arg0.field4150 == 0) {
            class428 var10 = class636.field8942.method2872((byte) 11, arg0.field4215);
            if (var10 == null || var10.field6521 == null) {
                arg0.field4215 = -1;
                arg0.field4174 = null;
            } else {
                arg0.field4188++;
                if (arg0.field4209 < var10.field6521.length && arg0.field4188 > var10.field6532[arg0.field4209]) {
                    arg0.field4188 = 1;
                    arg0.field4209++;
                    if (!arg0.field4180) {
                        class216.method1622(arg0.field4209, arg0, (byte) -98, var10);
                    }
                }
                if (var10.field6521.length <= arg0.field4209) {
                    arg0.field4213++;
                    arg0.field4209 -= var10.field6510;
                    if (var10.field6507 <= arg0.field4213) {
                        arg0.field4174 = null;
                        arg0.field4215 = -1;
                    } else if (arg0.field4209 < 0 || arg0.field4209 >= var10.field6521.length) {
                        arg0.field4215 = -1;
                        arg0.field4174 = null;
                    } else if (!arg0.field4180) {
                        class216.method1622(arg0.field4209, arg0, (byte) -16, var10);
                    }
                }
                arg0.field4194 = arg0.field4209 + 1;
                if (arg0.field4194 >= var10.field6521.length) {
                    arg0.field4194 -= var10.field6510;
                    if (var10.field6507 <= (arg0.field4213 + 1)) {
                        arg0.field4194 = -1;
                    } else if (arg0.field4194 < 0 || arg0.field4194 >= var10.field6521.length) {
                        arg0.field4194 = -1;
                    }
                }
            }
        }
        if (arg0.field4150 > 0) {
            arg0.field4150--;
        }
        for (int var11 = 0; var11 < arg0.field4201.length; var11++) {
            class684 var12 = arg0.field4201[var11];
            if (var12 != null) {
                if (var12.field9592 > 0) {
                    var12.field9592--;
                } else {
                    class428 var13 = class636.field8942.method2872((byte) 11, var12.field9590);
                    if (var13 == null || var13.field6521 == null) {
                        arg0.field4201[var11] = null;
                    } else {
                        var12.field9596++;
                        if (var12.field9588 < var13.field6521.length && var13.field6532[var12.field9588] < var12.field9596) {
                            var12.field9588++;
                            var12.field9596 = 1;
                            if (!arg0.field4180) {
                                class216.method1622(var12.field9588, arg0, (byte) -84, var13);
                            }
                        }
                        if (var12.field9588 >= var13.field6521.length) {
                            var12.field9591++;
                            var12.field9588 -= var13.field6510;
                            if (var12.field9591 >= var13.field6507) {
                                arg0.field4201[var11] = null;
                            } else if (var12.field9588 < 0 || var12.field9588 >= var13.field6521.length) {
                                arg0.field4201[var11] = null;
                            } else if (!arg0.field4180) {
                                class216.method1622(var12.field9588, arg0, (byte) -102, var13);
                            }
                        }
                        var12.field9595 = var12.field9588 + 1;
                        if (var12.field9595 >= var13.field6521.length) {
                            var12.field9595 -= var13.field6510;
                            if (var13.field6507 <= var12.field9591 + 1) {
                                var12.field9595 = -1;
                            } else if (var12.field9595 < 0 || var12.field9595 >= var13.field6521.length) {
                                var12.field9595 = -1;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gq", name = "c", descriptor = "(Z)I")
    private final int method2959(boolean arg0) {
        field7045++;
        if (!arg0) {
            this.field7068 = 98;
        }
        return this.field7049.method2009(25373) + this.field7060.method2009(25373);
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method2960(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field7036++;
        class257.field4073[class669.field9454++] = new class686(arg7, arg3, arg1, arg8, arg8, arg1, arg4, arg0, arg0, arg4, arg2, arg2, arg6, arg6);
        int var9 = -30 % ((arg5 + 16) / 58);
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(ZI)V")
    public final void method2961(boolean arg0, int arg1) {
        field7043++;
        if (arg1 != -15945) {
            this.method2952((byte) 93);
        }
        if (this.field7063 == null) {
            return;
        }
        try {
            this.field7062.field57 = 0;
            this.field7062.method65(arg0 ? 2 : 3, -77);
            this.field7062.method47(0, -1088828144);
            this.field7063.method3552(this.field7062.field96, 0, 4, true);
        } catch (IOException var4) {
            try {
                this.field7063.method3554((byte) 119);
            } catch (Exception var3) {
            }
            this.field7066++;
            this.field7063 = null;
            this.field7068 = -2;
        }
    }

    @OriginalMember(owner = "client!gq", name = "e", descriptor = "(B)V")
    public final void method2962(byte arg0) {
        if (this.field7063 != null) {
            this.field7063.method3554((byte) 118);
        }
        field7051++;
        if (arg0 >= -10) {
            field7056 = -103;
        }
    }

    @OriginalMember(owner = "client!gq", name = "d", descriptor = "(Z)V")
    public final void method2963(boolean arg0) {
        if (this.field7063 != null) {
            this.field7063.method3547(0);
        }
        if (!arg0) {
            this.field7035 = null;
        }
        field7038++;
    }
}
