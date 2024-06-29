import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class244 {

    @OriginalMember(owner = "client!le", name = "g", descriptor = "I")
    private int field4048 = 32;

    @OriginalMember(owner = "client!le", name = "p", descriptor = "J")
    private long field4057 = class76.method507(-30994);

    @OriginalMember(owner = "client!le", name = "x", descriptor = "I")
    private int field4065 = 0;

    @OriginalMember(owner = "client!le", name = "z", descriptor = "[Lnh;")
    private class115[] field4067 = new class115[8];

    @OriginalMember(owner = "client!le", name = "E", descriptor = "J")
    private long field4072 = 0L;

    @OriginalMember(owner = "client!le", name = "F", descriptor = "J")
    private long field4073 = 0L;

    @OriginalMember(owner = "client!le", name = "I", descriptor = "I")
    private int field4076 = 0;

    @OriginalMember(owner = "client!le", name = "A", descriptor = "Z")
    private boolean field4068 = true;

    @OriginalMember(owner = "client!le", name = "K", descriptor = "I")
    private int field4078 = 0;

    @OriginalMember(owner = "client!le", name = "D", descriptor = "[Lnh;")
    private class115[] field4071 = new class115[8];

    @OriginalMember(owner = "client!le", name = "J", descriptor = "I")
    private int field4077 = 0;

    @OriginalMember(owner = "client!le", name = "q", descriptor = "Lwm;")
    public static class152 field4058 = class157.method1048("Hidden)2use", 121);

    @OriginalMember(owner = "client!le", name = "u", descriptor = "Lwm;")
    public static class152 field4062 = class157.method1048("voudrait faire un -Bchange avec vous)3", 111);

    @OriginalMember(owner = "client!le", name = "e", descriptor = "Z")
    public static boolean field4046 = false;

    @OriginalMember(owner = "client!le", name = "i", descriptor = "Lwm;")
    public static class152 field4050 = class157.method1048("(U2", 119);

    @OriginalMember(owner = "client!le", name = "b", descriptor = "I")
    public static int field4043;

    @OriginalMember(owner = "client!le", name = "c", descriptor = "I")
    public static int field4044;

    @OriginalMember(owner = "client!le", name = "d", descriptor = "I")
    public static int field4045;

    @OriginalMember(owner = "client!le", name = "f", descriptor = "I")
    public static int field4047;

    @OriginalMember(owner = "client!le", name = "h", descriptor = "I")
    public static int field4049;

    @OriginalMember(owner = "client!le", name = "j", descriptor = "I")
    public static int field4051;

    @OriginalMember(owner = "client!le", name = "k", descriptor = "I")
    public static int field4052;

    @OriginalMember(owner = "client!le", name = "m", descriptor = "I")
    public static int field4054;

    @OriginalMember(owner = "client!le", name = "n", descriptor = "I")
    public static int field4055;

    @OriginalMember(owner = "client!le", name = "o", descriptor = "I")
    public static int field4056;

    @OriginalMember(owner = "client!le", name = "r", descriptor = "I")
    public static int field4059;

    @OriginalMember(owner = "client!le", name = "s", descriptor = "I")
    public static int field4060;

    @OriginalMember(owner = "client!le", name = "t", descriptor = "I")
    public static int field4061;

    @OriginalMember(owner = "client!le", name = "v", descriptor = "I")
    public static int field4063;

    @OriginalMember(owner = "client!le", name = "w", descriptor = "I")
    public static int field4064;

    @OriginalMember(owner = "client!le", name = "y", descriptor = "I")
    public static int field4066;

    @OriginalMember(owner = "client!le", name = "B", descriptor = "I")
    private int field4069;

    @OriginalMember(owner = "client!le", name = "C", descriptor = "I")
    public int field4070;

    @OriginalMember(owner = "client!le", name = "G", descriptor = "I")
    public int field4074;

    @OriginalMember(owner = "client!le", name = "H", descriptor = "I")
    public static int field4075;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "Lnh;")
    private class115 field4042;

    @OriginalMember(owner = "client!le", name = "l", descriptor = "[I")
    public int[] field4053;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "()V", line = 4)
    public void method1670() {
        field4063++;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(I)V", line = 14)
    public final synchronized void method1671(int arg0) {
        if (class183.field2914 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class183.field2914.field4751[var3] == this) {
                    class183.field2914.field4751[var3] = null;
                }
                if (class183.field2914.field4751[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class183.field2914.field4736 = true;
                while (class183.field2914.field4748) {
                    class4.method19(0, 50L);
                }
                class183.field2914 = null;
            }
        }
        this.method1670();
        field4044++;
        this.field4053 = null;
        if (arg0 <= 31) {
            this.method1676(-106);
        }
    }

    @OriginalMember(owner = "client!le", name = "b", descriptor = "()I", line = 57)
    public int method1672() throws Exception {
        field4043++;
        return this.field4074;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "([II)V", line = 67)
    private final void method1673(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class314.field5440) {
            var3 = arg1 << 1;
        }
        class187.method1249(arg0, 0, var3);
        this.field4078 -= arg1;
        if (this.field4042 != null && this.field4078 <= 0) {
            this.field4078 += class252.field4337 >> 4;
            class94.method626((byte) 106, this.field4042);
            this.method1686(this.field4042.method456(), this.field4042, false);
            int var4 = 0;
            int var5 = 255;
            int var6 = 7;
            label105: while (var5 != 0) {
                int var7;
                int var8;
                if (var6 < 0) {
                    var7 = var6 & 0x3;
                    var8 = -(var6 >> 2);
                } else {
                    var7 = var6;
                    var8 = 0;
                }
                for (int var9 = var5 >>> var7 & 0x11111111; var9 != 0; var9 >>>= 0x4) {
                    if ((var9 & 0x1) != 0) {
                        var5 &= ~(0x1 << var7);
                        class115 var10 = null;
                        class115 var11 = this.field4071[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class246 var12 = var11.field1625;
                                if (var12 == null || var12.field4130 <= var8) {
                                    var11.field1626 = true;
                                    int var13 = var11.method452();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field4130 += var13;
                                    }
                                    if (var4 >= this.field4048) {
                                        break label105;
                                    }
                                    class115 var14 = var11.method482();
                                    if (var14 != null) {
                                        int var15 = var11.field1624;
                                        while (var14 != null) {
                                            this.method1686(var15 * var14.method456() >> 8, var14, false);
                                            var14 = var11.method461();
                                        }
                                    }
                                    class115 var16 = var11.field1627;
                                    var11.field1627 = null;
                                    if (var10 == null) {
                                        this.field4071[var7] = var16;
                                    } else {
                                        var10.field1627 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field4067[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1627;
                                }
                            }
                        }
                    }
                    var7 += 4;
                    var8++;
                }
                var6--;
            }
            for (int var17 = 0; var17 < 8; var17++) {
                class115 var18 = this.field4071[var17];
                this.field4071[var17] = this.field4067[var17] = null;
                while (var18 != null) {
                    class115 var19 = var18.field1627;
                    var18.field1627 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field4078 < 0) {
            this.field4078 = 0;
        }
        if (this.field4042 != null) {
            this.field4042.method445(arg0, 0, arg1);
        }
        this.field4057 = class76.method507(-30994);
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Lnh;I)V", line = 230)
    public final synchronized void method1674(class115 arg0, int arg1) {
        this.field4042 = arg0;
        field4056++;
        if (arg1 != 16419) {
            this.method1671(-26);
        }
    }

    @OriginalMember(owner = "client!le", name = "b", descriptor = "(I)V", line = 241)
    public void method1675(int arg0) throws Exception {
        field4054++;
    }

    @OriginalMember(owner = "client!le", name = "c", descriptor = "(I)V", line = 248)
    public final void method1676(int arg0) {
        this.field4068 = true;
        if (arg0 == -3091) {
            field4052++;
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IIIIIII)V", line = 263)
    public static final void method1677(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg6 != 1) {
            method1684(45);
        }
        field4066++;
        if (arg3 >= class308.field5283 && class238.field3902 >= arg2 && class157.field2505 <= arg4 && arg5 <= class110.field1553) {
            if (arg0 == 1) {
                class258.method1797(arg2, arg3, arg5, arg1, arg4, 35);
            } else {
                class287.method1934(arg5, arg4, arg0, arg2, 46875, arg1, arg3);
            }
        } else if (arg0 == 1) {
            class291.method2016(arg3, arg5, arg4, 112, arg2, arg1);
        } else {
            class175.method1166(arg3, arg4, arg0, (byte) -81, arg1, arg5, arg2);
        }
    }

    @OriginalMember(owner = "client!le", name = "c", descriptor = "()V", line = 294)
    public void method1678() throws Exception {
        field4045++;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 302)
    public void method1679(Component arg0) throws Exception {
        field4047++;
    }

    @OriginalMember(owner = "client!le", name = "d", descriptor = "(I)V", line = 314)
    public final synchronized void method1680(int arg0) {
        field4051++;
        if (this.field4053 == null) {
            return;
        }
        long var2 = class76.method507(-30994);
        try {
            if (this.field4072 != 0L) {
                if (var2 < this.field4072) {
                    return;
                }
                this.method1675(this.field4074);
                this.field4068 = true;
                this.field4072 = 0L;
            }
            if (arg0 != -15389) {
                this.method1676(89);
            }
            int var4 = this.method1672();
            int var5 = this.field4070 + this.field4069;
            if (this.field4065 - var4 > this.field4076) {
                this.field4076 = this.field4065 - var4;
            }
            if (var5 + 256 > 16384) {
                var5 = 16128;
            }
            if (this.field4074 < var5 + 256) {
                var4 = 0;
                this.field4074 += 1024;
                if (this.field4074 > 16384) {
                    this.field4074 = 16384;
                }
                this.method1670();
                this.method1675(this.field4074);
                if (this.field4074 < (var5 + 256)) {
                    var5 = this.field4074 - 256;
                    this.field4069 = var5 - this.field4070;
                }
                this.field4068 = true;
            }
            while (var5 > var4) {
                var4 += 256;
                this.method1673(this.field4053, 256);
                this.method1685();
            }
            if (var2 > this.field4073) {
                if (this.field4068) {
                    this.field4068 = false;
                } else if (this.field4076 == 0 && this.field4077 == 0) {
                    this.method1670();
                    this.field4072 = var2 + 2000L;
                    return;
                } else {
                    this.field4069 = Math.min(this.field4077, this.field4076);
                    this.field4077 = this.field4076;
                }
                this.field4073 = var2 + 2000L;
                this.field4076 = 0;
            }
            this.field4065 = var4;
        } catch (Exception var9) {
            this.method1670();
            this.field4072 = var2 + 2000L;
        }
        try {
            if (var2 > (this.field4057 + 500000L)) {
                var2 = this.field4057;
            }
            while ((this.field4057 + 5000L) < var2) {
                this.method1682((byte) 85, 256);
                this.field4057 += (long) (256000 / class252.field4337);
            }
        } catch (Exception var8) {
            this.field4057 = var2;
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(B)V", line = 429)
    public final synchronized void method1681(byte arg0) {
        this.field4068 = true;
        field4049++;
        try {
            if (arg0 > -127) {
                return;
            }
            this.method1678();
        } catch (Exception var3) {
            this.method1670();
            this.field4072 = class76.method507(-30994) + 2000L;
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(BI)V", line = 451)
    private final void method1682(byte arg0, int arg1) {
        field4075++;
        this.field4078 -= arg1;
        if (this.field4078 < 0) {
            this.field4078 = 0;
        }
        int var3 = 109 / ((arg0 + 57) / 63);
        if (this.field4042 != null) {
            this.field4042.method446(arg1);
        }
    }

    @OriginalMember(owner = "client!le", name = "e", descriptor = "(I)V", line = 479)
    public static void method1683(int arg0) {
        field4050 = null;
        field4062 = null;
        field4058 = null;
        if (arg0 != 0) {
            method1684(-30);
        }
    }

    @OriginalMember(owner = "client!le", name = "f", descriptor = "(I)Leg;", line = 501)
    public static final class300 method1684(int arg0) {
        field4060++;
        class300 var1 = new class300(class186.field2975, class193.field3068, class180.field2865[arg0], class179.field2856[0], class253.field4383[0], class8.field106[0], class23.field403[0], class134.field2070);
        class132.method841((byte) 28);
        return var1;
    }

    @OriginalMember(owner = "client!le", name = "d", descriptor = "()V", line = 516)
    public void method1685() throws Exception {
        field4061++;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(ILnh;Z)V", line = 536)
    private final void method1686(int arg0, class115 arg1, boolean arg2) {
        int var4 = arg0 >> 5;
        class115 var5 = this.field4067[var4];
        if (var5 == null) {
            this.field4071[var4] = arg1;
        } else {
            var5.field1627 = arg1;
        }
        if (arg2) {
            this.field4068 = true;
        }
        field4055++;
        this.field4067[var4] = arg1;
        arg1.field1624 = arg0;
    }
}
