import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!saa")
public class class328 extends class177 implements class258 {

    @OriginalMember(owner = "client!saa", name = "J", descriptor = "Z")
    private boolean field4552 = false;

    @OriginalMember(owner = "client!saa", name = "T", descriptor = "Lbv;")
    public class309 field4562;

    @OriginalMember(owner = "client!saa", name = "eb", descriptor = "Z")
    private boolean field4573;

    @OriginalMember(owner = "client!saa", name = "N", descriptor = "[I")
    public static int[] field4556 = new int[1];

    @OriginalMember(owner = "client!saa", name = "H", descriptor = "I")
    public static int field4550;

    @OriginalMember(owner = "client!saa", name = "I", descriptor = "I")
    public static int field4551;

    @OriginalMember(owner = "client!saa", name = "K", descriptor = "I")
    public static int field4553;

    @OriginalMember(owner = "client!saa", name = "L", descriptor = "I")
    public static int field4554;

    @OriginalMember(owner = "client!saa", name = "M", descriptor = "I")
    public static int field4555;

    @OriginalMember(owner = "client!saa", name = "P", descriptor = "I")
    public static int field4558;

    @OriginalMember(owner = "client!saa", name = "Q", descriptor = "I")
    public static int field4559;

    @OriginalMember(owner = "client!saa", name = "R", descriptor = "I")
    public static int field4560;

    @OriginalMember(owner = "client!saa", name = "S", descriptor = "I")
    public static int field4561;

    @OriginalMember(owner = "client!saa", name = "U", descriptor = "I")
    public static int field4563;

    @OriginalMember(owner = "client!saa", name = "V", descriptor = "I")
    public static int field4564;

    @OriginalMember(owner = "client!saa", name = "W", descriptor = "I")
    public static int field4565;

    @OriginalMember(owner = "client!saa", name = "Y", descriptor = "I")
    public static int field4567;

    @OriginalMember(owner = "client!saa", name = "Z", descriptor = "I")
    public static int field4568;

    @OriginalMember(owner = "client!saa", name = "ab", descriptor = "I")
    public static int field4569;

    @OriginalMember(owner = "client!saa", name = "bb", descriptor = "I")
    public static int field4570;

    @OriginalMember(owner = "client!saa", name = "cb", descriptor = "I")
    public static int field4571;

    @OriginalMember(owner = "client!saa", name = "db", descriptor = "I")
    public static int field4572;

    @OriginalMember(owner = "client!saa", name = "fb", descriptor = "I")
    public static int field4574;

    @OriginalMember(owner = "client!saa", name = "gb", descriptor = "I")
    public static int field4575;

    @OriginalMember(owner = "client!saa", name = "O", descriptor = "Lhw;")
    private class132 field4557;

    @OriginalMember(owner = "client!saa", name = "X", descriptor = "[Lmi;")
    public static class496[] field4566;

    @OriginalMember(owner = "client!saa", name = "e", descriptor = "(I)I", line = 5)
    public final int method589(int arg0) {
        ++field4550;
        if (arg0 > -62) {
            this.field4557 = null;
        }
        return this.field4562.field4290;
    }

    @OriginalMember(owner = "client!saa", name = "c", descriptor = "(Lha;I)V", line = 16)
    public final void method31(class59 arg0, int arg1) {
        if (arg1 > -125) {
            method2086((String) null, -65);
        }
        ++field4569;
        class472 var3 = this.field4562.method2012(true, true, -128, 262144, arg0);
        if (var3 != null) {
            int var4 = super.field5922 >> 9;
            int var5 = super.field5933 >> 9;
            class661 var6 = arg0.method322();
            var6.method744(super.field5922, super.field5927, super.field5933);
            this.field4562.method2014(var4, var6, var5, arg0, var4, var3, false, (byte) -73, var5);
        }
    }

    @OriginalMember(owner = "client!saa", name = "c", descriptor = "(Z)I", line = 40)
    public final int method38(boolean arg0) {
        if (!arg0) {
            return -82;
        } else {
            ++field4570;
            return this.field4562.method2007(109);
        }
    }

    @OriginalMember(owner = "client!saa", name = "c", descriptor = "(I)V", line = 52)
    public final void method582(int arg0) {
        if (arg0 != -12031) {
            method2086((String) null, -125);
        }
        ++field4561;
    }

    @OriginalMember(owner = "client!saa", name = "d", descriptor = "(I)I", line = 66)
    public final int method588(int arg0) {
        ++field4564;
        return arg0 != -32228 ? -36 : this.field4562.field4279;
    }

    @OriginalMember(owner = "client!saa", name = "e", descriptor = "(B)Z", line = 77)
    public static final boolean method2084(byte arg0) {
        ++class106.field1870;
        class123.field2116 = true;
        if (arg0 > -123) {
            field4556 = null;
        }
        ++field4574;
        return true;
    }

    @OriginalMember(owner = "client!saa", name = "f", descriptor = "(B)V", line = 90)
    public static void method2085(byte arg0) {
        if (arg0 != -83) {
            field4556 = null;
        }
        field4566 = null;
        field4556 = null;
    }

    @OriginalMember(owner = "client!saa", name = "b", descriptor = "(ILha;)Ljda;", line = 102)
    public final class228 method41(int arg0, class59 arg1) {
        ++field4575;
        class472 var3 = this.field4562.method2012(false, true, -128, 2048, arg1);
        if (var3 == null) {
            return null;
        } else {
            class661 var4 = arg1.method322();
            var4.method744(super.field5922, super.field5927, super.field5933);
            class228 var5 = class345.method2171(arg0, this.field4573, false);
            int var6 = super.field5922 >> 9;
            int var7 = super.field5933 >> 9;
            this.field4562.method2014(var6, var4, var7, arg1, var6, var3, true, (byte) -73, var7);
            if (!class458.field6459) {
                var3.method521(var4, var5.field3313[0], 0);
            } else {
                var3.method497(var4, var5.field3313[0], class58.field1146, 0);
            }
            if (this.field4562.field4308 != null) {
                class266 var8 = this.field4562.field4308.method2419();
                if (class458.field6459) {
                    arg1.method295(var8, class58.field1146);
                } else {
                    arg1.method208(var8);
                }
            }
            this.field4552 = var3.method488() || this.field4562.field4308 != null;
            if (this.field4557 != null) {
                class20.method157(super.field5933, super.field5927, this.field4557, var3, false, super.field5922);
            } else {
                this.field4557 = class689.method3846(super.field5922, var3, super.field5933, super.field5927, 2);
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "(Lha;IZLga;IBI)V", line = 152)
    public final void method33(class59 arg0, int arg1, boolean arg2, class404 arg3, int arg4, byte arg5, int arg6) {
        ++field4553;
        if (arg5 > -106) {
            this.field4562 = null;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!saa", name = "<init>", descriptor = "(Lha;Liv;IIIIIZII)V", line = 163)
    public class328(class59 arg0, class99 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9) {
        super(arg4, arg5, arg6, arg2, arg3, arg1.field1765);
        this.field4562 = new class309(arg0, arg1, 22, arg8, arg2, arg3, this, arg7, arg9);
        this.field4573 = ~arg1.field1709 != -1 && !arg7;
    }

    @OriginalMember(owner = "client!saa", name = "b", descriptor = "(B)Z", line = 172)
    public final boolean method49(byte arg0) {
        ++field4571;
        if (arg0 != 122) {
            this.field4562 = null;
        }
        return this.field4552;
    }

    @OriginalMember(owner = "client!saa", name = "i", descriptor = "(I)I", line = 184)
    public final int method37(int arg0) {
        if (arg0 != -25675) {
            field4566 = null;
        }
        ++field4572;
        return this.field4562.method2008(arg0 ^ 25725);
    }

    @OriginalMember(owner = "client!saa", name = "b", descriptor = "(Z)V", line = 195)
    public final void method44(boolean arg0) {
        if (!arg0) {
            this.field4562 = null;
        }
        ++field4560;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "(Lha;III)Z", line = 214)
    public final boolean method42(class59 arg0, int arg1, int arg2, int arg3) {
        ++field4559;
        class472 var5 = this.field4562.method2012(false, false, -128, 131072, arg0);
        if (var5 == null) {
            return false;
        } else {
            class661 var6 = arg0.method322();
            if (arg3 != 0) {
                return true;
            } else {
                var6.method744(super.field5922, super.field5927, super.field5933);
                return class458.field6459 ? var5.method492(arg2, arg1, var6, false, 0, class58.field1146) : var5.method503(arg2, arg1, var6, false, 0);
            }
        }
    }

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 236)
    public static final void method2086(String arg0, int arg1) {
        int var2 = 87 / ((arg1 - -7) / 56);
        ++field4565;
        if (!arg0.equals("")) {
            ++class526.field7282;
            class564 var3 = class227.method1594(class177.field2723, class72.field1320, -124);
            var3.field7778.method1526(false, class621.method3541(arg0, -65));
            var3.field7778.method1481((byte) -5, arg0);
            class167.method1260(121, var3);
        }
    }

    @OriginalMember(owner = "client!saa", name = "b", descriptor = "(Lha;I)Lhw;", line = 255)
    public final class132 method40(class59 arg0, int arg1) {
        if (arg1 != 7) {
            return null;
        } else {
            ++field4567;
            return this.field4557;
        }
    }

    @OriginalMember(owner = "client!saa", name = "j", descriptor = "(I)Z", line = 267)
    public final boolean method35(int arg0) {
        ++field4551;
        return arg0 >= -65;
    }

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "(I)Z", line = 278)
    public final boolean method584(int arg0) {
        ++field4555;
        if (arg0 != -18443) {
            this.method40((class59) null, -3);
        }
        return this.field4562.method2009(2);
    }

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "(Lha;I)V", line = 291)
    public final void method591(class59 arg0, int arg1) {
        if (arg1 == -14218) {
            this.field4562.method2018(-1, arg0);
            ++field4558;
        }
    }

    @OriginalMember(owner = "client!saa", name = "g", descriptor = "(I)Z", line = 303)
    public final boolean method45(int arg0) {
        ++field4563;
        if (arg0 >= -12) {
            this.field4557 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!saa", name = "b", descriptor = "(I)I", line = 322)
    public final int method594(int arg0) {
        int var2 = 7 / ((-91 - arg0) / 35);
        ++field4554;
        return this.field4562.field4306;
    }

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "(ILha;)V", line = 332)
    public final void method583(int arg0, class59 arg1) {
        if (arg0 != 836) {
            this.field4573 = true;
        }
        this.field4562.method2011((byte) 116, arg1);
        ++field4568;
    }
}
