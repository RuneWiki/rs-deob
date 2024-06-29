import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!po")
public class class583 extends class399 implements class484 {

    @OriginalMember(owner = "client!po", name = "X", descriptor = "Z")
    private boolean field8240 = false;

    @OriginalMember(owner = "client!po", name = "Q", descriptor = "Lnia;")
    public class671 field8233;

    @OriginalMember(owner = "client!po", name = "U", descriptor = "Z")
    private boolean field8237;

    @OriginalMember(owner = "client!po", name = "ib", descriptor = "F")
    public static float field8251 = 1.0F;

    @OriginalMember(owner = "client!po", name = "J", descriptor = "I")
    public static int field8226;

    @OriginalMember(owner = "client!po", name = "K", descriptor = "I")
    public static int field8227;

    @OriginalMember(owner = "client!po", name = "L", descriptor = "I")
    public static int field8228;

    @OriginalMember(owner = "client!po", name = "M", descriptor = "I")
    public static int field8229;

    @OriginalMember(owner = "client!po", name = "N", descriptor = "I")
    public static int field8230;

    @OriginalMember(owner = "client!po", name = "O", descriptor = "I")
    public static int field8231;

    @OriginalMember(owner = "client!po", name = "P", descriptor = "I")
    public static int field8232;

    @OriginalMember(owner = "client!po", name = "R", descriptor = "I")
    public static int field8234;

    @OriginalMember(owner = "client!po", name = "S", descriptor = "I")
    public static int field8235;

    @OriginalMember(owner = "client!po", name = "T", descriptor = "I")
    public static int field8236;

    @OriginalMember(owner = "client!po", name = "V", descriptor = "I")
    public static int field8238;

    @OriginalMember(owner = "client!po", name = "W", descriptor = "I")
    public static int field8239;

    @OriginalMember(owner = "client!po", name = "Y", descriptor = "I")
    public static int field8241;

    @OriginalMember(owner = "client!po", name = "Z", descriptor = "I")
    public static int field8242;

    @OriginalMember(owner = "client!po", name = "ab", descriptor = "I")
    public static int field8243;

    @OriginalMember(owner = "client!po", name = "bb", descriptor = "I")
    public static int field8244;

    @OriginalMember(owner = "client!po", name = "db", descriptor = "I")
    public static int field8246;

    @OriginalMember(owner = "client!po", name = "eb", descriptor = "I")
    public static int field8247;

    @OriginalMember(owner = "client!po", name = "fb", descriptor = "I")
    public static int field8248;

    @OriginalMember(owner = "client!po", name = "gb", descriptor = "I")
    public static int field8249;

    @OriginalMember(owner = "client!po", name = "hb", descriptor = "I")
    public static int field8250;

    @OriginalMember(owner = "client!po", name = "jb", descriptor = "I")
    public static int field8252;

    @OriginalMember(owner = "client!po", name = "cb", descriptor = "Lrn;")
    private class281 field8245;

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(I)I")
    public final int method1483(int arg0) {
        if (arg0 != 24853) {
            return 62;
        } else {
            ++field8236;
            return this.field8233.field9332;
        }
    }

    @OriginalMember(owner = "client!po", name = "e", descriptor = "(I)I")
    public final int method917(int arg0) {
        if (arg0 != -1760267218) {
            return -66;
        } else {
            ++field8235;
            return this.field8233.method3821(1);
        }
    }

    @OriginalMember(owner = "client!po", name = "d", descriptor = "(Z)Z")
    public final boolean method909(boolean arg0) {
        if (arg0) {
            this.method903(-92);
        }
        ++field8252;
        return false;
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(Lmi;B)V")
    public final void method3410(class520 arg0, byte arg1) {
        this.field8233.method3819(arg0, -1);
        ++field8229;
        if (arg1 < 67) {
            this.field8237 = false;
        }
    }

    @OriginalMember(owner = "client!po", name = "f", descriptor = "(I)Z")
    public final boolean method906(int arg0) {
        ++field8227;
        int var2 = 41 % ((11 - arg0) / 35);
        return this.field8240;
    }

    @OriginalMember(owner = "client!po", name = "k", descriptor = "(I)V")
    public static final void method3411(int arg0) {
        ++field8230;
        if (class319.field4527 != null) {
            try {
                String var1 = class319.field4527.getParameter("cookiehost");
                int var2 = (int) (class459.method2731(101) / (long) arg0) + -11745;
                String var3 = "usrdob=" + var2 + "; version=1; path=/; domain=" + var1;
                class323.method2081((byte) 25, "document.cookie=\"" + var3 + "\"", class319.field4527);
            } catch (Throwable var4) {
            }
        }
    }

    @OriginalMember(owner = "client!po", name = "g", descriptor = "(I)V")
    public final void method903(int arg0) {
        if (arg0 != -772) {
            this.field8233 = null;
        }
        ++field8231;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(IIILha;)Z")
    public final boolean method902(int arg0, int arg1, int arg2, class65 arg3) {
        ++field8246;
        class496 var5 = this.field8233.method3815(-779, 131072, arg3, false, false);
        if (var5 == null) {
            return false;
        } else {
            if (arg1 != -17458) {
                this.field8237 = false;
            }
            class326 var6 = arg3.method514();
            var6.method1869(super.field5742, super.field5741, super.field5746);
            return class576.field8120 ? var5.method77(arg0, arg2, var6, false, 0, class740.field10205) : var5.method95(arg0, arg2, var6, false, 0);
        }
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(ILha;)V")
    public final void method1487(int arg0, class65 arg1) {
        this.field8233.method3810(arg1, (byte) -4);
        int var3 = -18 % ((4 - arg0) / 39);
        ++field8243;
    }

    @OriginalMember(owner = "client!po", name = "b", descriptor = "(Z)I")
    public final int method916(boolean arg0) {
        ++field8248;
        if (!arg0) {
            this.field8233 = null;
        }
        return this.field8233.method3811((byte) 110);
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(Z)I")
    public final int method1482(boolean arg0) {
        if (!arg0) {
            return -25;
        } else {
            ++field8226;
            return this.field8233.field9341;
        }
    }

    @OriginalMember(owner = "client!po", name = "c", descriptor = "(Z)Z")
    public final boolean method910(boolean arg0) {
        ++field8249;
        if (!arg0) {
            this.field8237 = true;
        }
        return false;
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(Lha;I)Lmaa;")
    public final class495 method918(class65 arg0, int arg1) {
        ++field8232;
        class496 var3 = this.field8233.method3815(-779, 2048, arg0, true, false);
        if (var3 == null) {
            return null;
        } else {
            if (arg1 != -30514) {
                this.method906(-38);
            }
            class326 var4 = arg0.method514();
            var4.method1869(super.field5742, super.field5741, super.field5746);
            class495 var5 = class86.method652(this.field8237, 0, 1);
            int var6 = super.field5742 >> 9;
            int var7 = super.field5746 >> 9;
            this.field8233.method3818(var7, var3, var7, var6, var6, 0, true, var4, arg0);
            if (!class576.field8120) {
                var3.method88(var4, var5.field7067[0], 0);
            } else {
                var3.method106(var4, var5.field7067[0], class740.field10205, 0);
            }
            if (this.field8233.field9352 != null) {
                class296 var8 = this.field8233.field9352.method3450();
                if (class576.field8120) {
                    arg0.method541(var8, class740.field10205);
                } else {
                    arg0.method504(var8);
                }
            }
            this.field8240 = var3.method121() || this.field8233.field9352 != null;
            if (this.field8245 != null) {
                class546.method3268(var3, super.field5742, this.field8245, -99, super.field5746, super.field5741);
            } else {
                this.field8245 = class490.method2922((byte) 122, super.field5742, var3, super.field5746, super.field5741);
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!po", name = "b", descriptor = "(I)V")
    public final void method1484(int arg0) {
        if (arg0 > -107) {
            this.method906(61);
        }
        ++field8228;
    }

    @OriginalMember(owner = "client!po", name = "c", descriptor = "(ILha;)V")
    public final void method912(int arg0, class65 arg1) {
        ++field8234;
        if (arg0 >= 52) {
            class496 var3 = this.field8233.method3815(-779, 262144, arg1, true, true);
            if (var3 != null) {
                int var4 = super.field5742 >> 9;
                int var5 = super.field5746 >> 9;
                class326 var6 = arg1.method514();
                var6.method1869(super.field5742, super.field5741, super.field5746);
                this.field8233.method3818(var5, var3, var5, var4, var4, 0, false, var6, arg1);
            }
        }
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(B)Z")
    public final boolean method1488(byte arg0) {
        ++field8239;
        int var2 = -85 % ((-7 - arg0) / 60);
        return this.field8233.method3820((byte) 107);
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(BB)C")
    public static final char method3412(byte arg0, byte arg1) {
        int var2 = -125 % ((-57 - arg1) / 63);
        ++field8242;
        int var3 = 255 & arg0;
        if (var3 == 0) {
            throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(var3, 16) + " provided");
        } else {
            if (~var3 <= -129 && ~var3 > -161) {
                char var4 = class242.field3616[var3 + -128];
                if (var4 == 0) {
                    var4 = '?';
                }
                var3 = var4;
            }
            return (char) var3;
        }
    }

    @OriginalMember(owner = "client!po", name = "<init>", descriptor = "(Lha;Lkv;IIIIIZII)V")
    public class583(class65 arg0, class282 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9) {
        super(arg4, arg5, arg6, arg2, arg3, arg1.field4180);
        this.field8233 = new class671(arg0, arg1, 22, arg8, arg2, arg3, this, arg7, arg9);
        this.field8237 = ~arg1.field4149 != -1 && !arg7;
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(ZLje;IIILha;I)V")
    public final void method905(boolean arg0, class421 arg1, int arg2, int arg3, int arg4, class65 arg5, int arg6) {
        if (arg2 != 0) {
            this.field8240 = true;
        }
        ++field8244;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!po", name = "b", descriptor = "(B)I")
    public final int method1478(byte arg0) {
        if (arg0 < 108) {
            this.method903(-94);
        }
        ++field8247;
        return this.field8233.field9334;
    }

    @OriginalMember(owner = "client!po", name = "b", descriptor = "(Lha;I)Lrn;")
    public final class281 method901(class65 arg0, int arg1) {
        ++field8241;
        if (arg1 <= 50) {
            this.method910(false);
        }
        return this.field8245;
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(BLha;)V")
    public final void method1479(byte arg0, class65 arg1) {
        this.field8233.method3817(arg1, false);
        ++field8250;
        int var3 = 55 % ((arg0 - -19) / 48);
    }
}
