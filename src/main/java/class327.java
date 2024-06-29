import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vo")
public class class327 extends class305 implements class218 {

    @OriginalMember(owner = "client!vo", name = "L", descriptor = "Z")
    private boolean field4894;

    @OriginalMember(owner = "client!vo", name = "fb", descriptor = "B")
    private byte field4913;

    @OriginalMember(owner = "client!vo", name = "B", descriptor = "Z")
    private boolean field4884;

    @OriginalMember(owner = "client!vo", name = "bb", descriptor = "Z")
    private boolean field4909;

    @OriginalMember(owner = "client!vo", name = "J", descriptor = "B")
    private byte field4892;

    @OriginalMember(owner = "client!vo", name = "jb", descriptor = "S")
    private short field4917;

    @OriginalMember(owner = "client!vo", name = "D", descriptor = "B")
    private byte field4886;

    @OriginalMember(owner = "client!vo", name = "cb", descriptor = "Z")
    private boolean field4910;

    @OriginalMember(owner = "client!vo", name = "N", descriptor = "Lns;")
    public class57 field4896;

    @OriginalMember(owner = "client!vo", name = "eb", descriptor = "Lfq;")
    private class87 field4912;

    @OriginalMember(owner = "client!vo", name = "C", descriptor = "Lo;")
    public static class332 field4885 = new class332("Loaded core fonts", "Schriftarten geladen", "Polices chargées", "Fontes principais carregadas");

    @OriginalMember(owner = "client!vo", name = "K", descriptor = "Ltl;")
    public static class400 field4893 = new class400(50);

    @OriginalMember(owner = "client!vo", name = "lb", descriptor = "Lct;")
    public static class285 field4919 = new class285(34, 7);

    @OriginalMember(owner = "client!vo", name = "mb", descriptor = "Lj;")
    public static class240 field4920 = new class240(7, 7);

    @OriginalMember(owner = "client!vo", name = "E", descriptor = "I")
    public static int field4887;

    @OriginalMember(owner = "client!vo", name = "F", descriptor = "I")
    public static int field4888;

    @OriginalMember(owner = "client!vo", name = "G", descriptor = "I")
    public static int field4889;

    @OriginalMember(owner = "client!vo", name = "H", descriptor = "I")
    public static int field4890;

    @OriginalMember(owner = "client!vo", name = "I", descriptor = "I")
    public static int field4891;

    @OriginalMember(owner = "client!vo", name = "M", descriptor = "I")
    public static int field4895;

    @OriginalMember(owner = "client!vo", name = "O", descriptor = "I")
    public static int field4897;

    @OriginalMember(owner = "client!vo", name = "P", descriptor = "I")
    public static int field4898;

    @OriginalMember(owner = "client!vo", name = "R", descriptor = "I")
    public static int field4899;

    @OriginalMember(owner = "client!vo", name = "S", descriptor = "I")
    public static int field4900;

    @OriginalMember(owner = "client!vo", name = "T", descriptor = "I")
    public static int field4901;

    @OriginalMember(owner = "client!vo", name = "U", descriptor = "I")
    public static int field4902;

    @OriginalMember(owner = "client!vo", name = "V", descriptor = "I")
    public static int field4903;

    @OriginalMember(owner = "client!vo", name = "W", descriptor = "I")
    public static int field4904;

    @OriginalMember(owner = "client!vo", name = "X", descriptor = "I")
    public static int field4905;

    @OriginalMember(owner = "client!vo", name = "Y", descriptor = "I")
    public static int field4906;

    @OriginalMember(owner = "client!vo", name = "Z", descriptor = "I")
    public static int field4907;

    @OriginalMember(owner = "client!vo", name = "ab", descriptor = "I")
    public static int field4908;

    @OriginalMember(owner = "client!vo", name = "db", descriptor = "I")
    public static int field4911;

    @OriginalMember(owner = "client!vo", name = "gb", descriptor = "I")
    public static int field4914;

    @OriginalMember(owner = "client!vo", name = "hb", descriptor = "I")
    public static int field4915;

    @OriginalMember(owner = "client!vo", name = "ib", descriptor = "I")
    public static int field4916;

    @OriginalMember(owner = "client!vo", name = "kb", descriptor = "I")
    public static int field4918;

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(Ltq;III)Z", line = 3)
    public final boolean method259(class63 arg0, int arg1, int arg2, int arg3) {
        ++field4904;
        int var5 = 97 % ((-59 - arg2) / 58);
        class57 var6 = this.method2012(arg0, 65536, (byte) -92);
        if (var6 != null) {
            class315 var7 = arg0.method565();
            var7.method482(super.field4543, super.field4554, super.field4538);
            return var6.method423(arg1, arg3, var7, false);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(BILtq;)Lns;", line = 25)
    public final class57 method255(byte arg0, int arg1, class63 arg2) {
        ++field4903;
        if (arg0 <= 108) {
            this.method258((class63) null, -100);
        }
        return this.method2012(arg2, arg1, (byte) -109);
    }

    @OriginalMember(owner = "client!vo", name = "e", descriptor = "(I)I", line = 38)
    public final int method899(int arg0) {
        ++field4911;
        if (arg0 != 0) {
            field4920 = null;
        }
        return this.field4896 != null ? this.field4896.method400() : 0;
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(Z[[I)V", line = 50)
    public static final void method2007(boolean arg0, int[][] arg1) {
        ++field4891;
        if (!arg0) {
            field4885 = null;
        }
        class49.field723 = arg1;
    }

    @OriginalMember(owner = "client!vo", name = "b", descriptor = "(B)I", line = 66)
    public final int method244(byte arg0) {
        if (arg0 >= -8) {
            return -75;
        } else {
            ++field4887;
            return this.field4913;
        }
    }

    @OriginalMember(owner = "client!vo", name = "b", descriptor = "(Z)V", line = 85)
    public final void method247(boolean arg0) {
        if (this.field4896 != null) {
            this.field4896.method422();
        }
        ++field4889;
        if (arg0) {
            field4885 = null;
        }
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(IILtq;Z)Lri;", line = 98)
    private final class447 method2008(int arg0, int arg1, class63 arg2, boolean arg3) {
        ++field4907;
        class271 var5 = class206.field3124.method338((byte) 99, this.field4917 & arg0);
        class48 var6;
        class48 var7;
        if (this.field4894) {
            var6 = class55.field765[this.field4886];
            var7 = class483.field6781[0];
        } else {
            var6 = class483.field6781[this.field4886];
            if (this.field4886 >= 3) {
                var7 = null;
            } else {
                var7 = class483.field6781[this.field4886 - -1];
            }
        }
        return var5.method1773(arg1, super.field4538, var6, super.field4543, arg2, ~this.field4892 != -12 ? this.field4892 : 10, (byte) 87, arg3, var7, this.field4892 != 11 ? this.field4913 : this.field4913 + 4, super.field4554);
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(Ltq;I)V", line = 125)
    public final void method258(class63 arg0, int arg1) {
        ++field4901;
        Object var3 = null;
        class87 var5;
        if (this.field4912 == null && this.field4910) {
            class447 var4 = this.method2008(arg1 + 87895, 131072, arg0, true);
            var5 = var4 != null ? var4.field6337 : null;
        } else {
            var5 = this.field4912;
            this.field4912 = null;
        }
        if (var5 != null) {
            class299.method1868(var5, this.field4886, super.field4543, super.field4538, (boolean[]) null);
        }
        if (arg1 != -22360) {
            field4885 = null;
        }
    }

    @OriginalMember(owner = "client!vo", name = "c", descriptor = "(B)I", line = 160)
    public final int method2009(byte arg0) {
        ++field4897;
        int var2 = -107 % ((52 - arg0) / 33);
        return this.field4896 == null ? 15 : this.field4896.method418() / 4;
    }

    @OriginalMember(owner = "client!vo", name = "c", descriptor = "(Z)I", line = 170)
    public final int method257(boolean arg0) {
        if (arg0) {
            this.field4892 = -88;
        }
        ++field4890;
        return 65535 & this.field4917;
    }

    @OriginalMember(owner = "client!vo", name = "b", descriptor = "(I)V", line = 182)
    public final void method249(int arg0) {
        this.field4909 = false;
        ++field4900;
        if (arg0 > 56) {
            if (this.field4896 != null) {
                this.field4896.method441(-32769 & this.field4896.method402());
            }
        }
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(BLtq;)V", line = 197)
    public final void method256(byte arg0, class63 arg1) {
        ++field4905;
        Object var3 = null;
        if (arg0 != 82) {
            this.method260(-83, (class63) null);
        }
        class87 var5;
        if (this.field4912 == null && this.field4910) {
            class447 var4 = this.method2008(arg0 + 65453, 131072, arg1, true);
            var5 = var4 != null ? var4.field6337 : null;
        } else {
            var5 = this.field4912;
            this.field4912 = null;
        }
        if (var5 != null) {
            class373.method2309(var5, this.field4886, super.field4543, super.field4538, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!vo", name = "h", descriptor = "(I)V", line = 224)
    public static final void method2010(int arg0) {
        class87.field1237 = new class146(class231.field3394.method2036(class4.field85, (byte) -21), "", class261.field3873, 1004, -1, 0L, 0, 0, true, false);
        if (arg0 == -23062) {
            ++field4899;
        }
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(Z)Z", line = 235)
    public final boolean method254(boolean arg0) {
        ++field4898;
        if (!arg0) {
            this.field4892 = -101;
        }
        return this.field4910;
    }

    @OriginalMember(owner = "client!vo", name = "c", descriptor = "(I)Z", line = 249)
    public final boolean method253(int arg0) {
        ++field4906;
        return arg0 > -9 ? false : this.field4909;
    }

    @OriginalMember(owner = "client!vo", name = "<init>", descriptor = "(Ltq;Lvc;IIIIIZIIIIIIZ)V", line = 260)
    public class327(class63 arg0, class271 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, boolean arg14) {
        super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, ~arg1.field4067 == -2, class361.method2217(-74, arg12, arg13));
        this.field4894 = arg7;
        this.field4913 = (byte) arg13;
        this.field4884 = arg1.field4053 != 0 && !arg7;
        this.field4909 = arg14;
        this.field4892 = (byte) arg12;
        this.field4917 = (short) arg1.field4043;
        this.field4886 = (byte) arg3;
        this.field4910 = arg0.method581() && arg1.field4087 && !this.field4894 && class337.field5038.field3952 != 0;
        int var16 = 1024;
        if (this.field4909) {
            var16 |= 32768;
        }
        class447 var17 = this.method2008(65535, var16, arg0, this.field4910);
        if (var17 != null) {
            this.field4896 = var17.field6334;
            this.field4912 = var17.field6337;
            if (this.field4909) {
                this.field4896 = this.field4896.method437((byte) 0, var16, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(B)I", line = 293)
    public final int method250(byte arg0) {
        int var2 = 39 / ((-49 - arg0) / 60);
        ++field4916;
        return this.field4892;
    }

    @OriginalMember(owner = "client!vo", name = "i", descriptor = "(I)V", line = 305)
    public static final void method2011(int arg0) {
        class150.method1017();
        ++field4908;
        for (int var1 = 0; ~var1 > -5; ++var1) {
            class183.field2717[var1].method2870(-127);
        }
        class293.method1844(47);
        int var2 = -7 % ((-70 - arg0) / 35);
        class31.method268(8);
        System.gc();
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(Ltq;IB)Lns;", line = 326)
    private final class57 method2012(class63 arg0, int arg1, byte arg2) {
        ++field4915;
        if (this.field4896 != null && arg0.method583(this.field4896.method402(), arg1) == 0) {
            return this.field4896;
        } else {
            int var4 = 105 % ((-6 - arg2) / 63);
            class447 var5 = this.method2008(65535, arg1, arg0, false);
            return var5 == null ? null : var5.field6334;
        }
    }

    @OriginalMember(owner = "client!vo", name = "d", descriptor = "(B)V", line = 348)
    public static void method2013(byte arg0) {
        field4893 = null;
        int var1 = 105 % ((82 - arg0) / 44);
        field4919 = null;
        field4885 = null;
        field4920 = null;
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(BZLtq;Lhm;III)V", line = 362)
    public final void method245(byte arg0, boolean arg1, class63 arg2, class352 arg3, int arg4, int arg5, int arg6) {
        if (!(arg3 instanceof class44)) {
            if (arg3 instanceof class327) {
                class327 var8 = (class327) arg3;
                if (this.field4896 != null && var8.field4896 != null) {
                    this.field4896.method447(var8.field4896, arg6, arg4, arg5, arg1);
                }
            }
        } else {
            class44 var9 = (class44) arg3;
            if (this.field4896 != null && var9.field604 != null) {
                this.field4896.method447(var9.field604, arg6, arg4, arg5, arg1);
            }
        }
        if (arg0 >= -41) {
            this.field4892 = -124;
        }
        ++field4895;
    }

    @OriginalMember(owner = "client!vo", name = "b", descriptor = "(Ltq;I)Lcj;", line = 395)
    public final class123 method252(class63 arg0, int arg1) {
        ++field4888;
        if (this.field4896 == null) {
            return null;
        } else {
            if (arg1 != 2) {
                this.method260(-84, (class63) null);
            }
            class315 var3 = arg0.method565();
            var3.method482(super.field4543, super.field4554, super.field4538);
            class123 var4 = null;
            if (this.field4884) {
                var4 = class225.method1462(1, -90);
            }
            this.field4896.method404(var3, var4 == null ? null : var4.field1695[0], 0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!vo", name = "e", descriptor = "(B)V", line = 422)
    public static final void method2014(byte arg0) {
        class245.field3510.method1158((byte) -126);
        if (arg0 == -86) {
            ++field4918;
            class428.field6110 = 1;
            class415.field5986 = null;
        }
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(ILtq;)V", line = 444)
    public final void method260(int arg0, class63 arg1) {
        ++field4902;
        if (arg0 != 0) {
            this.method2009((byte) -114);
        }
    }
}
