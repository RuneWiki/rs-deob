import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ns")
public class class280 extends class210 implements class425 {

    @OriginalMember(owner = "client!ns", name = "ab", descriptor = "B")
    private byte field4227;

    @OriginalMember(owner = "client!ns", name = "z", descriptor = "Z")
    private boolean field4201;

    @OriginalMember(owner = "client!ns", name = "K", descriptor = "S")
    private short field4211;

    @OriginalMember(owner = "client!ns", name = "C", descriptor = "Z")
    private boolean field4204;

    @OriginalMember(owner = "client!ns", name = "y", descriptor = "B")
    private byte field4200;

    @OriginalMember(owner = "client!ns", name = "W", descriptor = "B")
    private byte field4223;

    @OriginalMember(owner = "client!ns", name = "F", descriptor = "Z")
    private boolean field4207;

    @OriginalMember(owner = "client!ns", name = "N", descriptor = "Le;")
    private class374 field4214;

    @OriginalMember(owner = "client!ns", name = "U", descriptor = "Li;")
    private class31 field4221;

    @OriginalMember(owner = "client!ns", name = "H", descriptor = "Los;")
    public static class309 field4209 = new class309("K", "T", "K", "K");

    @OriginalMember(owner = "client!ns", name = "Z", descriptor = "Lbj;")
    public static class162 field4226 = new class162(7, 8);

    @OriginalMember(owner = "client!ns", name = "cb", descriptor = "Los;")
    public static class309 field4229 = new class309("You can't add yourself to your own friends list.", "Du kannst dich nicht auf deine eigene Freunde-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste d'amis.", "Você não pode adicionar a si próprio à sua lista de amigos.");

    @OriginalMember(owner = "client!ns", name = "db", descriptor = "Ls;")
    public static class186 field4230 = new class186(86, -2);

    @OriginalMember(owner = "client!ns", name = "eb", descriptor = "I")
    public static int field4231 = -1;

    @OriginalMember(owner = "client!ns", name = "A", descriptor = "I")
    public static int field4202;

    @OriginalMember(owner = "client!ns", name = "B", descriptor = "I")
    public static int field4203;

    @OriginalMember(owner = "client!ns", name = "D", descriptor = "I")
    public static int field4205;

    @OriginalMember(owner = "client!ns", name = "E", descriptor = "I")
    public static int field4206;

    @OriginalMember(owner = "client!ns", name = "G", descriptor = "I")
    public static int field4208;

    @OriginalMember(owner = "client!ns", name = "J", descriptor = "I")
    public static int field4210;

    @OriginalMember(owner = "client!ns", name = "M", descriptor = "I")
    public static int field4213;

    @OriginalMember(owner = "client!ns", name = "O", descriptor = "I")
    public static int field4215;

    @OriginalMember(owner = "client!ns", name = "P", descriptor = "I")
    public static int field4216;

    @OriginalMember(owner = "client!ns", name = "Q", descriptor = "I")
    public static int field4217;

    @OriginalMember(owner = "client!ns", name = "R", descriptor = "I")
    public static int field4218;

    @OriginalMember(owner = "client!ns", name = "S", descriptor = "I")
    public static int field4219;

    @OriginalMember(owner = "client!ns", name = "T", descriptor = "I")
    public static int field4220;

    @OriginalMember(owner = "client!ns", name = "V", descriptor = "I")
    public static int field4222;

    @OriginalMember(owner = "client!ns", name = "X", descriptor = "I")
    public static int field4224;

    @OriginalMember(owner = "client!ns", name = "Y", descriptor = "I")
    public static int field4225;

    @OriginalMember(owner = "client!ns", name = "bb", descriptor = "I")
    public static int field4228;

    @OriginalMember(owner = "client!ns", name = "L", descriptor = "Lcn;")
    public static class360 field4212;

    @OriginalMember(owner = "client!ns", name = "c", descriptor = "(I)I", line = 6)
    public final int method231(int arg0) {
        if (arg0 < 7) {
            return -37;
        } else {
            ++field4219;
            return this.field4223;
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(Lza;B)V", line = 23)
    public static final void method1753(class288 arg0, byte arg1) {
        arg0.method371(0, 0, class71.field1415, 350);
        ++field4203;
        arg0.method327(0, 0, class71.field1415, 350, 3351159 | class344.field5144 << 24, 1);
        int var2 = 350 / class150.field2479;
        if (~class103.field1955 < -1) {
            int var3 = -class150.field2479 + 346 + -4;
            int var4 = var2 * var3 / (class103.field1955 - 1 + var2);
            int var5 = 4;
            if (~class103.field1955 < -2) {
                var5 += (class103.field1955 + -1 - class433.field6450) * (var3 - var4) / (class103.field1955 + -1);
            }
            arg0.method327(class71.field1415 + -16, var5, 12, var4, class344.field5144 << 24 | 3351159, 2);
            for (int var6 = class433.field6450; ~var6 > ~(class433.field6450 + var2) && class103.field1955 > var6; ++var6) {
                String[] var7 = class266.method1697(0, '\b', class509.field7425[var6]);
                int var8 = (class71.field1415 + -8 + -16) / var7.length;
                for (int var9 = 0; var9 < var7.length; ++var9) {
                    int var10 = 8 - -(var8 * var9);
                    arg0.method371(var10, 0, var8 + var10 + -8, 350);
                    class470.field6980.method2017(var10, -1, -16777216, (byte) -85, 350 - (class162.field2597 + 2) + -((-class433.field6450 + var6) * class150.field2479) + -class398.field6038.field6963, var7[var9]);
                }
            }
        }
        arg0.method371(0, 0, class71.field1415, 350);
        arg0.method1810(class71.field1415, -1, (byte) -55, 350 - class162.field2597, 0);
        class356.field5232.method2017(10, -1, -16777216, (byte) -92, -class272.field4126.field6963 + 350 - 1, "--> " + class496.field7294);
        int var11 = 99 % ((-82 - arg1) / 42);
        int var12 = -1;
        if (~(class62.field1268 % 30) < -16) {
            var12 = 16777215;
        }
        arg0.method1804(125, 12, 10 - -class272.field4126.method2808("--> " + class496.field7294.substring(0, class73.field1501), -60), 350 - class272.field4126.field6963 + -11, var12);
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(BII)Z", line = 84)
    public static final boolean method1754(byte arg0, int arg1, int arg2) {
        ++field4225;
        if (arg0 >= -112) {
            method1757(true);
        }
        return (arg1 & 540800) != 0;
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(ILza;I)Le;", line = 97)
    public final class374 method234(int arg0, class288 arg1, int arg2) {
        ++field4213;
        if (arg0 < 99) {
            field4226 = null;
        }
        return this.method1755((byte) 53, arg1, arg2);
    }

    @OriginalMember(owner = "client!ns", name = "c", descriptor = "(B)I", line = 110)
    public final int method227(byte arg0) {
        ++field4205;
        if (arg0 != -104) {
            this.method224(51);
        }
        return this.field4214 != null ? this.field4214.method736() : 0;
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(BLza;)V", line = 128)
    public final void method9(byte arg0, class288 arg1) {
        if (arg0 > -98) {
            method1754((byte) -108, -52, -63);
        }
        ++field4222;
    }

    @OriginalMember(owner = "client!ns", name = "b", descriptor = "(I)Z", line = 140)
    public final boolean method228(int arg0) {
        if (arg0 != 1396) {
            return false;
        } else {
            ++field4215;
            return this.field4207;
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(BLza;I)Le;", line = 151)
    private final class374 method1755(byte arg0, class288 arg1, int arg2) {
        ++field4217;
        if (this.field4214 != null && ~arg1.method394(this.field4214.method768(), arg2) == -1) {
            return this.field4214;
        } else {
            int var4 = 49 / ((arg0 - -8) / 58);
            class177 var5 = this.method1756((byte) 38, arg2, false, arg1);
            return var5 == null ? null : var5.field2866;
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(I)V", line = 173)
    public final void method229(int arg0) {
        if (arg0 != -4715) {
            this.method1756((byte) 68, 28, false, (class288) null);
        }
        ++field4210;
        if (this.field4214 != null) {
            this.field4214.method718();
        }
    }

    @OriginalMember(owner = "client!ns", name = "<init>", descriptor = "(Lza;Ljc;IIIIZIIIII)V", line = 188)
    public class280(class288 arg0, class306 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        super(arg3, arg4, arg5, arg7, arg8, arg9, class373.method2292(false, arg11, arg10));
        this.field4227 = (byte) arg2;
        super.field3347 = arg3;
        this.field4201 = arg6;
        this.field4211 = (short) arg1.field4626;
        this.field4204 = ~arg1.field4587 != -1 && !arg6;
        this.field4200 = (byte) arg10;
        this.field4223 = (byte) arg11;
        super.field3344 = arg5;
        this.field4207 = arg0.method309() && arg1.field4637 && !this.field4201 && ~class186.field2990.method1130(class133.field2236, 115) != -1;
        class177 var13 = this.method1756((byte) 38, 2048, this.field4207, arg0);
        if (var13 != null) {
            this.field4214 = var13.field2866;
            this.field4221 = var13.field2871;
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(Lza;I)V", line = 213)
    public final void method233(class288 arg0, int arg1) {
        ++field4206;
        Object var3 = null;
        class31 var5;
        if (this.field4221 == null && this.field4207) {
            class177 var4 = this.method1756((byte) 38, 262144, true, arg0);
            var5 = var4 == null ? null : var4.field2871;
        } else {
            var5 = this.field4221;
            this.field4221 = null;
        }
        if (var5 != null) {
            class523.method3094(var5, this.field4227, super.field3347, super.field3344, (boolean[]) null);
        }
        if (arg1 != 13367) {
            this.method234(110, (class288) null, 77);
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(BIZLza;)Lrn;", line = 248)
    private final class177 method1756(byte arg0, int arg1, boolean arg2, class288 arg3) {
        ++field4220;
        if (arg0 != 38) {
            return null;
        } else {
            class306 var5 = class123.field2142.method1530((byte) -119, this.field4211 & 65535);
            class38 var6;
            class38 var7;
            if (!this.field4201) {
                if (~this.field4227 > -4) {
                    var6 = class531.field7727[this.field4227 - -1];
                } else {
                    var6 = null;
                }
                var7 = class531.field7727[this.field4227];
            } else {
                var7 = class293.field4481[this.field4227];
                var6 = class531.field7727[0];
            }
            return var5.method1956(arg2, this.field4223, super.field3347, super.field3344, super.field3345, arg1, var7, (byte) -10, arg3, this.field4200, var6);
        }
    }

    @OriginalMember(owner = "client!ns", name = "b", descriptor = "(Z)V", line = 278)
    public static void method1757(boolean arg0) {
        if (arg0) {
            field4230 = null;
            field4209 = null;
            field4229 = null;
            field4226 = null;
            field4212 = null;
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(Lza;Z)V", line = 292)
    public final void method232(class288 arg0, boolean arg1) {
        ++field4224;
        if (!arg1) {
            this.field4204 = true;
        }
        Object var3 = null;
        class31 var5;
        if (this.field4221 == null && this.field4207) {
            class177 var4 = this.method1756((byte) 38, 262144, true, arg0);
            var5 = var4 != null ? var4.field2871 : null;
        } else {
            var5 = this.field4221;
            this.field4221 = null;
        }
        if (var5 != null) {
            class1.method10(var5, this.field4227, super.field3347, super.field3344, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!ns", name = "b", descriptor = "(Lza;I)Lnd;", line = 321)
    public final class385 method15(class288 arg0, int arg1) {
        ++field4216;
        if (this.field4214 == null) {
            return null;
        } else {
            class124 var3 = arg0.method364();
            var3.method835(super.field3359 + super.field3347, super.field3345, super.field3352 + super.field3344);
            if (arg1 != 2) {
                this.method224(52);
            }
            class385 var4 = null;
            if (this.field4204) {
                var4 = class497.method3001(1, false);
            }
            this.field4214.method723(var3, var4 != null ? var4.field5620[0] : null, 0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(ZLza;II)Z", line = 347)
    public final boolean method14(boolean arg0, class288 arg1, int arg2, int arg3) {
        if (arg0) {
            field4231 = 9;
        }
        ++field4228;
        class374 var5 = this.method1755((byte) -110, arg1, 131072);
        if (var5 != null) {
            class124 var6 = arg1.method364();
            var6.method835(super.field3347, super.field3345, super.field3344);
            return var5.method763(arg3, arg2, var6, false);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ns", name = "d", descriptor = "(I)I", line = 372)
    public final int method224(int arg0) {
        if (arg0 != -10848) {
            return -48;
        } else {
            ++field4208;
            return 65535 & this.field4211;
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(Z)I", line = 395)
    public final int method225(boolean arg0) {
        if (arg0) {
            return -26;
        } else {
            ++field4202;
            return this.field4200;
        }
    }
}
