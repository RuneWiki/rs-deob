import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public abstract class class256 extends class202 {

    @OriginalMember(owner = "client!cm", name = "o", descriptor = "I")
    public int field4040 = 0;

    @OriginalMember(owner = "client!cm", name = "x", descriptor = "I")
    public int field4049 = 0;

    @OriginalMember(owner = "client!cm", name = "u", descriptor = "I")
    public int field4046 = 0;

    @OriginalMember(owner = "client!cm", name = "U", descriptor = "I")
    public int field4072 = -1;

    @OriginalMember(owner = "client!cm", name = "bb", descriptor = "I")
    private int field4079 = 0;

    @OriginalMember(owner = "client!cm", name = "L", descriptor = "I")
    private int field4063 = 0;

    @OriginalMember(owner = "client!cm", name = "S", descriptor = "I")
    public int field4070 = 0;

    @OriginalMember(owner = "client!cm", name = "r", descriptor = "I")
    public int field4043 = 0;

    @OriginalMember(owner = "client!cm", name = "mb", descriptor = "[I")
    public int[] field4090 = new int[4];

    @OriginalMember(owner = "client!cm", name = "G", descriptor = "I")
    public int field4058 = 0;

    @OriginalMember(owner = "client!cm", name = "z", descriptor = "I")
    public int field4051 = 0;

    @OriginalMember(owner = "client!cm", name = "vb", descriptor = "I")
    public int field4099 = 0;

    @OriginalMember(owner = "client!cm", name = "M", descriptor = "I")
    public int field4064 = 0;

    @OriginalMember(owner = "client!cm", name = "lb", descriptor = "Z")
    private boolean field4089 = false;

    @OriginalMember(owner = "client!cm", name = "Z", descriptor = "[B")
    public byte[] field4077 = new byte[10];

    @OriginalMember(owner = "client!cm", name = "cb", descriptor = "I")
    public int field4080 = -1;

    @OriginalMember(owner = "client!cm", name = "X", descriptor = "I")
    public int field4075 = 0;

    @OriginalMember(owner = "client!cm", name = "ib", descriptor = "I")
    public int field4086 = 0;

    @OriginalMember(owner = "client!cm", name = "jb", descriptor = "I")
    public int field4087 = 0;

    @OriginalMember(owner = "client!cm", name = "Db", descriptor = "I")
    public int field4107 = 0;

    @OriginalMember(owner = "client!cm", name = "W", descriptor = "Ljava/lang/String;")
    public String field4074 = null;

    @OriginalMember(owner = "client!cm", name = "Fb", descriptor = "I")
    public int field4109 = 100;

    @OriginalMember(owner = "client!cm", name = "Ab", descriptor = "Z")
    public boolean field4104 = false;

    @OriginalMember(owner = "client!cm", name = "yb", descriptor = "I")
    public int field4102 = -1;

    @OriginalMember(owner = "client!cm", name = "Y", descriptor = "I")
    public int field4076 = -1000;

    @OriginalMember(owner = "client!cm", name = "R", descriptor = "Z")
    public boolean field4069 = false;

    @OriginalMember(owner = "client!cm", name = "qb", descriptor = "I")
    public int field4094 = 0;

    @OriginalMember(owner = "client!cm", name = "Gb", descriptor = "[Lje;")
    public class113[] field4110 = new class113[12];

    @OriginalMember(owner = "client!cm", name = "Jb", descriptor = "I")
    private int field4113 = 0;

    @OriginalMember(owner = "client!cm", name = "Kb", descriptor = "Z")
    public boolean field4114 = false;

    @OriginalMember(owner = "client!cm", name = "H", descriptor = "I")
    private int field4059 = 0;

    @OriginalMember(owner = "client!cm", name = "Qb", descriptor = "I")
    public int field4120 = 0;

    @OriginalMember(owner = "client!cm", name = "rb", descriptor = "I")
    public int field4095 = 0;

    @OriginalMember(owner = "client!cm", name = "Hb", descriptor = "Z")
    private boolean field4111 = false;

    @OriginalMember(owner = "client!cm", name = "Ob", descriptor = "I")
    public int field4118 = 0;

    @OriginalMember(owner = "client!cm", name = "Tb", descriptor = "I")
    public int field4123 = 0;

    @OriginalMember(owner = "client!cm", name = "Lb", descriptor = "I")
    public int field4115 = 0;

    @OriginalMember(owner = "client!cm", name = "B", descriptor = "[I")
    public int[] field4053 = new int[10];

    @OriginalMember(owner = "client!cm", name = "Cb", descriptor = "I")
    public int field4106 = 0;

    @OriginalMember(owner = "client!cm", name = "Q", descriptor = "I")
    public int field4068 = 0;

    @OriginalMember(owner = "client!cm", name = "Bb", descriptor = "Z")
    public boolean field4105 = false;

    @OriginalMember(owner = "client!cm", name = "cc", descriptor = "I")
    public int field4132 = 0;

    @OriginalMember(owner = "client!cm", name = "K", descriptor = "I")
    public int field4062 = -1;

    @OriginalMember(owner = "client!cm", name = "zb", descriptor = "I")
    private int field4103 = 0;

    @OriginalMember(owner = "client!cm", name = "t", descriptor = "I")
    public int field4045 = 32;

    @OriginalMember(owner = "client!cm", name = "dc", descriptor = "I")
    public int field4133 = -1;

    @OriginalMember(owner = "client!cm", name = "Wb", descriptor = "I")
    public int field4126 = -32768;

    @OriginalMember(owner = "client!cm", name = "v", descriptor = "I")
    public int field4047 = -1;

    @OriginalMember(owner = "client!cm", name = "Yb", descriptor = "I")
    public int field4128 = 0;

    @OriginalMember(owner = "client!cm", name = "Mb", descriptor = "I")
    public int field4116 = -1;

    @OriginalMember(owner = "client!cm", name = "Eb", descriptor = "I")
    private int field4108 = 0;

    @OriginalMember(owner = "client!cm", name = "Vb", descriptor = "I")
    public int field4125 = 0;

    @OriginalMember(owner = "client!cm", name = "lc", descriptor = "[I")
    public int[] field4141 = new int[4];

    @OriginalMember(owner = "client!cm", name = "kb", descriptor = "I")
    public int field4088 = 0;

    @OriginalMember(owner = "client!cm", name = "Pb", descriptor = "I")
    public int field4119 = 0;

    @OriginalMember(owner = "client!cm", name = "Ib", descriptor = "I")
    public int field4112 = 0;

    @OriginalMember(owner = "client!cm", name = "Xb", descriptor = "I")
    private int field4127 = 0;

    @OriginalMember(owner = "client!cm", name = "hc", descriptor = "I")
    public int field4137 = 0;

    @OriginalMember(owner = "client!cm", name = "gc", descriptor = "Z")
    public boolean field4136 = true;

    @OriginalMember(owner = "client!cm", name = "ab", descriptor = "I")
    private int field4078 = 0;

    @OriginalMember(owner = "client!cm", name = "fc", descriptor = "[I")
    public int[] field4135 = new int[4];

    @OriginalMember(owner = "client!cm", name = "nc", descriptor = "[I")
    public int[] field4143 = new int[10];

    @OriginalMember(owner = "client!cm", name = "jc", descriptor = "I")
    private int field4139 = 1;

    @OriginalMember(owner = "client!cm", name = "pc", descriptor = "Z")
    public boolean field4145 = false;

    @OriginalMember(owner = "client!cm", name = "V", descriptor = "I")
    public int field4073 = -1;

    @OriginalMember(owner = "client!cm", name = "qc", descriptor = "I")
    public int field4146 = 0;

    @OriginalMember(owner = "client!cm", name = "ob", descriptor = "I")
    public static int field4092 = 0;

    @OriginalMember(owner = "client!cm", name = "hb", descriptor = "I")
    public static int field4085 = -1;

    @OriginalMember(owner = "client!cm", name = "Rb", descriptor = "[J")
    public static long[] field4121 = new long[256];

    @OriginalMember(owner = "client!cm", name = "Sb", descriptor = "[I")
    public static int[] field4122 = new int[32];

    @OriginalMember(owner = "client!cm", name = "j", descriptor = "I")
    public static int field4035;

    @OriginalMember(owner = "client!cm", name = "k", descriptor = "I")
    public int field4036;

    @OriginalMember(owner = "client!cm", name = "l", descriptor = "I")
    public int field4037;

    @OriginalMember(owner = "client!cm", name = "m", descriptor = "I")
    public static int field4038;

    @OriginalMember(owner = "client!cm", name = "n", descriptor = "I")
    public static int field4039;

    @OriginalMember(owner = "client!cm", name = "q", descriptor = "I")
    public int field4042;

    @OriginalMember(owner = "client!cm", name = "s", descriptor = "I")
    public static int field4044;

    @OriginalMember(owner = "client!cm", name = "w", descriptor = "I")
    public int field4048;

    @OriginalMember(owner = "client!cm", name = "y", descriptor = "I")
    public static int field4050;

    @OriginalMember(owner = "client!cm", name = "A", descriptor = "I")
    public int field4052;

    @OriginalMember(owner = "client!cm", name = "C", descriptor = "I")
    public static int field4054;

    @OriginalMember(owner = "client!cm", name = "D", descriptor = "I")
    public static int field4055;

    @OriginalMember(owner = "client!cm", name = "E", descriptor = "I")
    public int field4056;

    @OriginalMember(owner = "client!cm", name = "F", descriptor = "I")
    public static int field4057;

    @OriginalMember(owner = "client!cm", name = "I", descriptor = "I")
    public static int field4060;

    @OriginalMember(owner = "client!cm", name = "J", descriptor = "I")
    public int field4061;

    @OriginalMember(owner = "client!cm", name = "N", descriptor = "I")
    public int field4065;

    @OriginalMember(owner = "client!cm", name = "O", descriptor = "I")
    public static int field4066;

    @OriginalMember(owner = "client!cm", name = "P", descriptor = "I")
    public int field4067;

    @OriginalMember(owner = "client!cm", name = "T", descriptor = "I")
    public int field4071;

    @OriginalMember(owner = "client!cm", name = "db", descriptor = "I")
    public int field4081;

    @OriginalMember(owner = "client!cm", name = "eb", descriptor = "I")
    public int field4082;

    @OriginalMember(owner = "client!cm", name = "gb", descriptor = "I")
    public int field4084;

    @OriginalMember(owner = "client!cm", name = "nb", descriptor = "I")
    public static int field4091;

    @OriginalMember(owner = "client!cm", name = "pb", descriptor = "I")
    public int field4093;

    @OriginalMember(owner = "client!cm", name = "sb", descriptor = "I")
    public static int field4096;

    @OriginalMember(owner = "client!cm", name = "tb", descriptor = "I")
    public int field4097;

    @OriginalMember(owner = "client!cm", name = "ub", descriptor = "I")
    public int field4098;

    @OriginalMember(owner = "client!cm", name = "wb", descriptor = "I")
    public int field4100;

    @OriginalMember(owner = "client!cm", name = "xb", descriptor = "I")
    public int field4101;

    @OriginalMember(owner = "client!cm", name = "Nb", descriptor = "I")
    public static int field4117;

    @OriginalMember(owner = "client!cm", name = "Ub", descriptor = "I")
    public int field4124;

    @OriginalMember(owner = "client!cm", name = "Zb", descriptor = "I")
    public static int field4129;

    @OriginalMember(owner = "client!cm", name = "ac", descriptor = "I")
    public static int field4130;

    @OriginalMember(owner = "client!cm", name = "bc", descriptor = "I")
    public static int field4131;

    @OriginalMember(owner = "client!cm", name = "ec", descriptor = "I")
    public int field4134;

    @OriginalMember(owner = "client!cm", name = "ic", descriptor = "I")
    public static int field4138;

    @OriginalMember(owner = "client!cm", name = "kc", descriptor = "I")
    public int field4140;

    @OriginalMember(owner = "client!cm", name = "mc", descriptor = "I")
    public int field4142;

    @OriginalMember(owner = "client!cm", name = "oc", descriptor = "I")
    public static int field4144;

    @OriginalMember(owner = "client!cm", name = "p", descriptor = "Lte;")
    public class220 field4041;

    @OriginalMember(owner = "client!cm", name = "fb", descriptor = "Ljava/lang/Object;")
    public Object field4083;

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(Z)V")
    public static void method1667(boolean arg0) {
        field4121 = null;
        field4122 = null;
        if (!arg0) {
            method1672((byte) -3, 40);
        }
    }

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "(B)I")
    public abstract int method1668(byte arg0);

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(ZI)V")
    public final void method1669(boolean arg0, int arg1) {
        field4117++;
        this.field4139 = arg1;
        if (arg0) {
            this.field4108 = 13;
        }
    }

    @OriginalMember(owner = "client!cm", name = "c", descriptor = "(B)I")
    public abstract int method1670(byte arg0);

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(Lmi;Lmi;I)V")
    public final void method1671(class94 arg0, class94 arg1, int arg2) {
        class66 var4 = (class66) arg0;
        class66 var5 = (class66) arg1;
        if ((this.field4041 == null || this.field4041.field3413) && (var4.field884 != null || var4.field885 != null || var5 != null && (var5.field884 != null || var5.field885 != null))) {
            this.field4041 = new class220(class35.field533, this.method1683(-119), this.method1683(arg2 ^ 0xFFFFEF24));
        }
        if (this.field4041 != null) {
            this.field4041.method1443(var4.field884, var4.field885, false, var4.field872, var4.field901, var4.field903);
        }
        this.field4114 = true;
        field4096++;
        if (arg2 != 4285) {
            this.method1683(-87);
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(BI)I")
    public static final int method1672(byte arg0, int arg1) {
        if (arg0 >= -79) {
            method1674(-47);
        }
        field4055++;
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!cm", name = "d", descriptor = "(B)I")
    public int method1673(byte arg0) {
        field4131++;
        int var2 = 59 % ((arg0 + 88) / 38);
        class85 var3 = this.method1685(0);
        if (var3.field1226 == -1) {
            return this.field4126 == -32768 ? 200 : -this.field4126;
        } else {
            return var3.field1226;
        }
    }

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "(I)V")
    public static final void method1674(int arg0) {
        field4066++;
        int var1 = class11.field186;
        int var2 = class212.field3196;
        if (arg0 > -20) {
            method1674(66);
        }
        int var3 = class284.field4553 - var1 - class218.field3386;
        int var4 = class39.field590 - class174.field2460 - var2;
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5;
            if (class43.field653 != null) {
                var5 = class43.field653;
            } else if (class31.field469 == null) {
                var5 = class45.field667.field744;
            } else {
                var5 = class31.field469;
            }
            int var6 = 0;
            int var7 = 0;
            if (class31.field469 == var5) {
                Insets var8 = class31.field469.getInsets();
                var7 = var8.left;
                var6 = var8.top;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var7, var6, var1, class39.field590);
            }
            if (var2 > 0) {
                var9.fillRect(var7, var6, class284.field4553, var2);
            }
            if (var3 > 0) {
                var9.fillRect(var7 + class284.field4553 - var3, var6, var3, class39.field590);
            }
            if (var4 > 0) {
                var9.fillRect(var7, class39.field590 + var6 - var4, class284.field4553, var4);
                return;
            }
        } catch (Exception var10) {
            return;
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(IIZ)V")
    public final void method1675(int arg0, int arg1, boolean arg2) {
        int var4 = this.field4143[0];
        field4038++;
        int var5 = this.field4053[0];
        if (this.field4133 != -1 && class280.method1815(this.field4133, -18).field2968 == 1) {
            this.field4133 = -1;
        }
        if (this.field4073 != -1) {
            class167 var6 = class291.method1952(0, this.field4073);
            if (var6.field2384 && class280.method1815(var6.field2375, 122).field2968 == 1) {
                this.field4073 = -1;
            }
        }
        if (arg1 == 0) {
            var4--;
            var5++;
        }
        if (arg1 == 1) {
            var5++;
        }
        if (arg1 == 2) {
            var5++;
            var4++;
        }
        if (this.field4064 < 9) {
            this.field4064++;
        }
        for (int var7 = this.field4064; var7 > 0; var7--) {
            this.field4143[var7] = this.field4143[var7 - 1];
            this.field4053[var7] = this.field4053[var7 - 1];
            this.field4077[var7] = this.field4077[var7 - 1];
        }
        if (!arg2) {
            this.field4071 = 35;
        }
        if (arg1 == 3) {
            var4--;
        }
        if (arg1 == 4) {
            var4++;
        }
        if (arg1 == 5) {
            var4--;
            var5--;
        }
        if (arg1 == 6) {
            var5--;
        }
        if (arg1 == 7) {
            var4++;
            var5--;
        }
        this.field4077[0] = (byte) arg0;
        this.field4143[0] = var4;
        this.field4053[0] = var5;
    }

    @OriginalMember(owner = "client!cm", name = "c", descriptor = "(I)V")
    public static final void method1676(int arg0) {
        field4144++;
        class197 var1 = (class197) class69.field966.method369((byte) -115);
        if (arg0 >= -101) {
            return;
        }
        while (var1 != null) {
            if (var1.field3013 > 0) {
                var1.field3013--;
            }
            if (var1.field3013 != 0) {
                if (var1.field3015 > 0) {
                    var1.field3015--;
                }
                if (var1.field3015 == 0 && var1.field3009 >= 1 && var1.field3006 >= 1 && var1.field3009 <= 102 && var1.field3006 <= 102 && (var1.field3010 < 0 || class187.method1186(var1.field3010, 5, var1.field3014))) {
                    class178.method1134(var1.field3010, var1.field3008, var1.field3009, (byte) -20, var1.field3014, var1.field3021, var1.field3016, var1.field3006);
                    var1.field3015 = -1;
                    if (var1.field3010 == var1.field3003 && var1.field3003 == -1) {
                        var1.method962(128);
                    } else if (var1.field3010 == var1.field3003 && var1.field3016 == var1.field3002 && var1.field3014 == var1.field3007) {
                        var1.method962(128);
                    }
                }
            } else if (var1.field3003 < 0 || class187.method1186(var1.field3003, 5, var1.field3007)) {
                class178.method1134(var1.field3003, var1.field3008, var1.field3009, (byte) -20, var1.field3007, var1.field3021, var1.field3002, var1.field3006);
                var1.method962(128);
            }
            var1 = (class197) class69.field966.method362(false);
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(IIII)V")
    public final void method1677(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 != -1854) {
            this.field4086 = -96;
        }
        field4091++;
        for (int var5 = 0; var5 < 4; var5++) {
            if (arg0 >= this.field4135[var5]) {
                this.field4090[var5] = arg2;
                this.field4141[var5] = arg1;
                this.field4135[var5] = arg0 + 70;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!cm", name = "d", descriptor = "(I)V")
    public static final void method1678(int arg0) {
        for (int var1 = 0; var1 < class114.field1647; var1++) {
            int var10002 = class191.field2910[var1]--;
            if (class191.field2910[var1] >= -10) {
                class28 var3 = class128.field1791[var1];
                if (var3 == null) {
                    var3 = class28.method183(class68.field958, class167.field2389[var1], 0);
                    if (var3 == null) {
                        continue;
                    }
                    class191.field2910[var1] += var3.method186();
                    class128.field1791[var1] = var3;
                }
                if (class191.field2910[var1] < 0) {
                    int var10;
                    if (class200.field3044[var1] == 0) {
                        var10 = class45.field670[var1] * class221.field3440 >> 8;
                    } else {
                        int var4 = (class200.field3044[var1] & 0xFF) * 128;
                        int var5 = class200.field3044[var1] >> 16 & 0xFF;
                        int var6 = var5 * 128 + 64 - class250.field3905.field4081;
                        if (var6 < 0) {
                            var6 = -var6;
                        }
                        int var7 = class200.field3044[var1] >> 8 & 0xFF;
                        int var8 = var7 * 128 + 64 - class250.field3905.field4140;
                        if (var8 < 0) {
                            var8 = -var8;
                        }
                        int var9 = var8 + var6 - 128;
                        if (var4 < var9) {
                            class191.field2910[var1] = -100;
                            continue;
                        }
                        if (var9 < 0) {
                            var9 = 0;
                        }
                        var10 = class45.field670[var1] * class209.field3110 * (var4 - var9) / var4 >> 8;
                    }
                    if (var10 > 0) {
                        class173 var11 = var3.method185().method1098(class42.field633);
                        class287 var12 = class287.method1896(var11, 100, var10);
                        var12.method1914(class106.field1515[var1] - 1);
                        class116.field1671.method916(var12);
                    }
                    class191.field2910[var1] = -100;
                }
            } else {
                class114.field1647--;
                for (int var2 = var1; var2 < class114.field1647; var2++) {
                    class167.field2389[var2] = class167.field2389[var2 + 1];
                    class128.field1791[var2] = class128.field1791[var2 + 1];
                    class106.field1515[var2] = class106.field1515[var2 + 1];
                    class191.field2910[var2] = class191.field2910[var2 + 1];
                    class200.field3044[var2] = class200.field3044[var2 + 1];
                    class45.field670[var2] = class45.field670[var2 + 1];
                }
                var1--;
            }
        }
        field4044++;
        if (arg0 != 255) {
            return;
        }
        if (class137.field1876 && !class36.method250(arg0 + 5754)) {
            if (class51.field716 != 0 && class102.field1457 != -1) {
                class80.method510(class240.field3737, true, false, 0, class51.field716, class102.field1457);
            }
            class137.field1876 = false;
        } else if (class51.field716 != 0 && class102.field1457 != -1 && !class36.method250(6009)) {
            class231.field3614.method809(130, 0);
            class231.field3614.method1398(true, class102.field1457);
            class279.field4435++;
            class102.field1457 = -1;
        }
    }

    @OriginalMember(owner = "client!cm", name = "e", descriptor = "(B)Z")
    public boolean method1679(byte arg0) {
        if (arg0 > -126) {
            this.field4067 = 54;
        }
        field4130++;
        return false;
    }

    @OriginalMember(owner = "client!cm", name = "e", descriptor = "(I)V")
    public final void method1680(int arg0) {
        this.field4046 = 0;
        this.field4064 = 0;
        field4057++;
        if (arg0 != -3130) {
            this.method1673((byte) 108);
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(IIZIB)V")
    public final void method1681(int arg0, int arg1, boolean arg2, int arg3, byte arg4) {
        field4060++;
        if (this.field4133 != -1 && class280.method1815(this.field4133, -115).field2968 == 1) {
            this.field4133 = -1;
        }
        if (this.field4073 != -1) {
            class167 var6 = class291.method1952(0, this.field4073);
            if (var6.field2384 && class280.method1815(var6.field2375, -41).field2968 == 1) {
                this.field4073 = -1;
            }
        }
        if (!arg2) {
            int var7 = arg1 - this.field4053[0];
            int var8 = arg3 - this.field4143[0];
            if (var8 >= -8 && var8 <= 8 && var7 >= -8 && var7 <= 8) {
                if (this.field4064 < 9) {
                    this.field4064++;
                }
                for (int var9 = this.field4064; var9 > 0; var9--) {
                    this.field4143[var9] = this.field4143[var9 - 1];
                    this.field4053[var9] = this.field4053[var9 - 1];
                    this.field4077[var9] = this.field4077[var9 - 1];
                }
                this.field4143[0] = arg3;
                this.field4077[0] = 1;
                this.field4053[0] = arg1;
                return;
            }
        }
        this.field4064 = 0;
        this.field4046 = 0;
        this.field4068 = 0;
        this.field4143[0] = arg3;
        this.field4053[0] = arg1;
        this.field4081 = this.field4143[0] * 128 + arg0 * 64;
        this.field4140 = this.field4053[0] * 128 + (arg0 * 64);
        if (this.field4041 != null) {
            this.field4041.method1438();
        }
        if (arg4 != -24) {
            this.method1669(false, 84);
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(Lmi;Z)V")
    public final void method1682(class94 arg0, boolean arg1) {
        if (arg1) {
            this.field4088 = 16;
        }
        field4050++;
        class85 var3 = this.method1685(0);
        if (var3.field1196 == 0 && var3.field1208 == 0) {
            return;
        }
        int var4 = 0;
        int var5 = 0;
        if (this.field4145 && this.field4070 != 0) {
            var5 = var3.field1208;
            if (this.field4070 < 0) {
                var4 = -var3.field1196;
            } else {
                var4 = var3.field1196;
            }
        }
        if (var3.field1225 != 0) {
            if (this.field4108 != var4) {
                this.field4108 = var4;
                if (this.field4127 > 0 && var4 > this.field4079) {
                    int var6 = this.field4127 * this.field4127 / (var3.field1225 * 2);
                    int var7 = var4 - this.field4079;
                    if (var6 <= var7) {
                        this.field4063 = (this.field4079 + var4 - var6) / 2;
                        int var8 = var3.field1213 * var3.field1213 / (var3.field1225 * 2);
                        this.field4111 = true;
                        int var9 = var4 - var8;
                        if (var9 > this.field4063) {
                            this.field4063 = var9;
                        }
                    } else {
                        this.field4111 = false;
                    }
                } else if (this.field4127 < 0 && var4 < this.field4079) {
                    int var10 = this.field4127 * this.field4127 / (var3.field1225 * 2);
                    int var11 = var4 - this.field4079;
                    if (var10 > var11) {
                        this.field4111 = false;
                    } else {
                        this.field4111 = true;
                        this.field4063 = (this.field4079 + var4 + var10) / 2;
                        int var12 = var3.field1213 * var3.field1213 / (var3.field1225 * 2);
                        int var13 = var4 + var12;
                        if (this.field4063 > var13) {
                            this.field4063 = var13;
                        }
                    }
                } else {
                    this.field4111 = false;
                }
            }
            if (this.field4127 == 0) {
                int var14 = this.field4108 - this.field4079;
                if (-var3.field1225 < var14 && var3.field1225 > var14) {
                    this.field4079 = this.field4108;
                } else {
                    this.field4063 = (this.field4108 + this.field4079) / 2;
                    this.field4111 = true;
                    int var15 = var3.field1213 * var3.field1213 / (var3.field1225 * 2);
                    if (var14 < 0) {
                        this.field4127 = -var3.field1225;
                        int var16 = this.field4108 + var15;
                        if (var16 < this.field4063) {
                            this.field4063 = var16;
                        }
                    } else {
                        this.field4127 = var3.field1225;
                        int var17 = this.field4108 - var15;
                        if (var17 > this.field4063) {
                            this.field4063 = var17;
                        }
                    }
                }
            } else if (this.field4127 > 0) {
                if (this.field4063 <= this.field4079) {
                    this.field4111 = false;
                }
                if (!this.field4111) {
                    this.field4127 -= var3.field1225;
                    if (this.field4127 < 0) {
                        this.field4127 = 0;
                    }
                } else if (this.field4127 < var3.field1213) {
                    this.field4127 += var3.field1225;
                }
            } else {
                if (this.field4063 >= this.field4079) {
                    this.field4111 = false;
                }
                if (!this.field4111) {
                    this.field4127 += var3.field1225;
                    if (this.field4127 > 0) {
                        this.field4127 = 0;
                    }
                } else if ((-var3.field1213) < this.field4127) {
                    this.field4127 -= var3.field1225;
                }
            }
            this.field4079 += this.field4127;
            if (this.field4079 != 0) {
                int var18 = this.field4079 >> 5 & 0x7FF;
                int var19 = arg0.method9() / 2;
                arg0.method409(0, -var19, 0);
                arg0.method414(var18);
                arg0.method409(0, var19, 0);
            }
        }
        if (var3.field1209 == 0) {
            return;
        }
        if (this.field4103 != var5) {
            if (this.field4059 > 0 && this.field4113 < var5) {
                int var20 = var5 - this.field4113;
                int var21 = this.field4059 * this.field4059 / (var3.field1209 * 2);
                if (var20 < var21) {
                    this.field4089 = false;
                } else {
                    this.field4078 = (this.field4113 + var5 - var21) / 2;
                    this.field4089 = true;
                    int var22 = var3.field1205 * var3.field1205 / (var3.field1209 * 2);
                    int var23 = var5 - var22;
                    if (this.field4078 < var23) {
                        this.field4078 = var23;
                    }
                }
            } else if (this.field4059 < 0 && var5 < this.field4113) {
                int var24 = var5 - this.field4113;
                int var25 = this.field4059 * this.field4059 / (var3.field1209 * 2);
                if (var25 <= var24) {
                    this.field4089 = true;
                    int var26 = var3.field1205 * var3.field1205 / (var3.field1209 * 2);
                    this.field4078 = (this.field4113 + var25 + var5) / 2;
                    int var27 = var5 + var26;
                    if (this.field4078 > var27) {
                        this.field4078 = var27;
                    }
                } else {
                    this.field4089 = false;
                }
            } else {
                this.field4089 = false;
            }
            this.field4103 = var5;
        }
        if (this.field4059 == 0) {
            int var28 = this.field4103 - this.field4113;
            if ((-var3.field1209) < var28 && var3.field1209 > var28) {
                this.field4113 = this.field4103;
            } else {
                this.field4089 = true;
                int var29 = var3.field1205 * var3.field1205 / (var3.field1209 * 2);
                this.field4078 = (this.field4113 + this.field4103) / 2;
                if (var28 < 0) {
                    int var30 = this.field4103 + var29;
                    if (var30 < this.field4078) {
                        this.field4078 = var30;
                    }
                    this.field4059 = -var3.field1209;
                } else {
                    this.field4059 = var3.field1209;
                    int var31 = this.field4103 - var29;
                    if (this.field4078 < var31) {
                        this.field4078 = var31;
                    }
                }
            }
        } else if (this.field4059 <= 0) {
            if (this.field4078 >= this.field4113) {
                this.field4089 = false;
            }
            if (!this.field4089) {
                this.field4059 += var3.field1209;
                if (this.field4059 > 0) {
                    this.field4059 = 0;
                }
            } else if (-var3.field1205 < this.field4059) {
                this.field4059 -= var3.field1209;
            }
        } else {
            if (this.field4078 <= this.field4113) {
                this.field4089 = false;
            }
            if (!this.field4089) {
                this.field4059 -= var3.field1209;
                if (this.field4059 < 0) {
                    this.field4059 = 0;
                }
            } else if (var3.field1205 > this.field4059) {
                this.field4059 += var3.field1209;
            }
        }
        this.field4113 += this.field4059;
        if (this.field4113 == 0) {
            return;
        }
        int var32 = this.field4113 >> 5 & 0x7FF;
        int var33 = arg0.method9() / 2;
        arg0.method409(0, -var33, 0);
        arg0.method413(var32);
        arg0.method409(0, var33, 0);
        return;
    }

    @OriginalMember(owner = "client!cm", name = "f", descriptor = "(I)I")
    public int method1683(int arg0) {
        field4039++;
        if (arg0 >= -57) {
            this.field4120 = 112;
        }
        return this.field4139;
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(ILmi;I)V")
    public final void method1684(int arg0, class94 arg1, int arg2) {
        field4138++;
        class107.field1531 = 0;
        if (arg0 != 2) {
            return;
        }
        class205.field3063 = 0;
        class56.field781 = 0;
        class85 var4 = this.method1685(0);
        int var5 = var4.field1211;
        int var6 = var4.field1197;
        if (var5 == 0 || var6 == 0) {
            return;
        }
        int var7 = class118.field1697[arg2];
        int var8 = class118.field1690[arg2];
        int var9 = -var5 / 2;
        int var10 = -var6 / 2;
        int var11 = var7 * var10 + var8 * var9 >> 16;
        int var12 = var8 * var10 - (var7 * var9) >> 16;
        int var13 = class58.method360(this.field4140 + var12, this.field4081 + var11, false, class166.field2364);
        int var14 = var5 / 2;
        int var15 = -var6 / 2;
        int var16 = var7 * var15 + var8 * var14 >> 16;
        int var17 = var8 * var15 - (var7 * var14) >> 16;
        int var18 = class58.method360(this.field4140 + var17, this.field4081 - -var16, false, class166.field2364);
        int var19 = -var5 / 2;
        int var20 = var6 / 2;
        int var21 = var7 * var20 + (var8 * var19) >> 16;
        int var22 = var5 / 2;
        int var23 = var8 * var20 - (var7 * var19) >> 16;
        int var24 = class58.method360(this.field4140 + var23, this.field4081 + var21, false, class166.field2364);
        int var25 = var6 / 2;
        int var26 = var7 * var25 + var8 * var22 >> 16;
        int var27 = var8 * var25 - var7 * var22 >> 16;
        int var28 = var13 < var18 ? var13 : var18;
        int var29 = class58.method360(this.field4140 + var27, this.field4081 + var26, false, class166.field2364);
        int var30 = var29 > var24 ? var24 : var29;
        class56.field781 = (int) (Math.atan2((double) (var28 - var30), (double) var6) * 325.95D) & 0x7FF;
        if (class56.field781 != 0) {
            arg1.method413(class56.field781);
        }
        int var31 = var18 < var29 ? var18 : var29;
        int var32 = var13 < var24 ? var13 : var24;
        class205.field3063 = (int) (Math.atan2((double) (var32 - var31), (double) var5) * 325.95D) & 0x7FF;
        if (class205.field3063 != 0) {
            arg1.method414(class205.field3063);
        }
        class107.field1531 = var13 + var29;
        if (class107.field1531 > var18 + var24) {
            class107.field1531 = var18 + var24;
        }
        class107.field1531 = (class107.field1531 >> 1) - this.field4124;
        if (class107.field1531 != 0) {
            arg1.method409(0, class107.field1531, 0);
            return;
        }
    }

    @OriginalMember(owner = "client!cm", name = "g", descriptor = "(I)Lfl;")
    public final class85 method1685(int arg0) {
        field4035++;
        int var2 = this.method1668((byte) -72);
        return ~var2 == arg0 ? class206.field3080 : class189.method1193(32620, var2);
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            long var1 = (long) var0;
            for (int var3 = 0; var3 < 8; var3++) {
                if ((var1 & 0x1L) == 1L) {
                    var1 = var1 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field4121[var0] = var1;
        }
    }
}
