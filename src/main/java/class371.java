import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public class class371 extends class109 implements class193 {

    @OriginalMember(owner = "client!sk", name = "N", descriptor = "Lbi;")
    public class282 field5221;

    @OriginalMember(owner = "client!sk", name = "E", descriptor = "Z")
    private boolean field5213;

    @OriginalMember(owner = "client!sk", name = "D", descriptor = "I")
    public static int field5212;

    @OriginalMember(owner = "client!sk", name = "S", descriptor = "I")
    public static int field5226;

    @OriginalMember(owner = "client!sk", name = "x", descriptor = "Laa;")
    public static class283 field5206;

    @OriginalMember(owner = "client!sk", name = "w", descriptor = "I")
    public static int field5205;

    @OriginalMember(owner = "client!sk", name = "y", descriptor = "I")
    public static int field5207;

    @OriginalMember(owner = "client!sk", name = "z", descriptor = "I")
    public static int field5208;

    @OriginalMember(owner = "client!sk", name = "A", descriptor = "I")
    public static int field5209;

    @OriginalMember(owner = "client!sk", name = "B", descriptor = "I")
    public static int field5210;

    @OriginalMember(owner = "client!sk", name = "C", descriptor = "I")
    public static int field5211;

    @OriginalMember(owner = "client!sk", name = "F", descriptor = "I")
    public static int field5214;

    @OriginalMember(owner = "client!sk", name = "G", descriptor = "I")
    public static int field5215;

    @OriginalMember(owner = "client!sk", name = "H", descriptor = "I")
    public static int field5216;

    @OriginalMember(owner = "client!sk", name = "I", descriptor = "I")
    public static int field5217;

    @OriginalMember(owner = "client!sk", name = "J", descriptor = "I")
    public static int field5218;

    @OriginalMember(owner = "client!sk", name = "L", descriptor = "I")
    public static int field5219;

    @OriginalMember(owner = "client!sk", name = "M", descriptor = "I")
    public static int field5220;

    @OriginalMember(owner = "client!sk", name = "O", descriptor = "I")
    public static int field5222;

    @OriginalMember(owner = "client!sk", name = "P", descriptor = "I")
    public static int field5223;

    @OriginalMember(owner = "client!sk", name = "Q", descriptor = "I")
    public static int field5224;

    @OriginalMember(owner = "client!sk", name = "R", descriptor = "I")
    public static int field5225;

    @OriginalMember(owner = "client!sk", name = "T", descriptor = "I")
    public static int field5227;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(IILuo;I)Z")
    public final boolean method675(int arg0, int arg1, class345 arg2, int arg3) {
        ++field5217;
        if (arg1 != -20759) {
            return true;
        } else {
            class394 var5 = this.field5221.method1848(super.field1568, false, 65536, arg2, false, false, super.field1576);
            if (var5 == null) {
                return false;
            } else {
                class417 var6 = arg2.method84();
                var6.method702(super.field1568, super.field1573, super.field1576);
                return var5.method1465(arg3, arg0, var6, false);
            }
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(Luo;I)V")
    public final void method677(class345 arg0, int arg1) {
        ++field5211;
        this.field5221.method1849(true, arg0);
        if (arg1 < 33) {
            field5206 = null;
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(ILuo;)V")
    public final void method676(int arg0, class345 arg1) {
        this.field5221.method1843(-123, arg1);
        ++field5222;
        if (arg0 >= -58) {
            field5226 = 72;
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(ZLuo;)Laj;")
    public final class170 method681(boolean arg0, class345 arg1) {
        ++field5209;
        class394 var3 = this.field5221.method1848(super.field1568, true, 1024, arg1, false, false, super.field1576);
        if (var3 == null) {
            return null;
        } else {
            class417 var4 = arg1.method84();
            var4.method702(super.field1568, super.field1573, super.field1576);
            class170 var5 = null;
            if (this.field5213) {
                var5 = class175.method1152((byte) 72, 1);
            }
            if (this.field5221.field3956 != null) {
                class77 var6 = this.field5221.field3956.method2017();
                arg1.method72(var3, var6, var4, var5 == null ? null : var5.field2333[0], 0);
            } else {
                var3.method1416(var4, var5 == null ? null : var5.field2333[0], 0);
            }
            this.field5221.method1850(arg0, -124, super.field1568 >> 7, super.field1576 >> 7, arg1, super.field1568 >> 7, super.field1576 >> 7, var3);
            return var5;
        }
    }

    @OriginalMember(owner = "client!sk", name = "c", descriptor = "(I)V")
    public final void method680(int arg0) {
        if (arg0 == -24686) {
            ++field5205;
        }
    }

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "(B)Z")
    public final boolean method691(byte arg0) {
        ++field5210;
        if (arg0 != -72) {
            method2379(112);
        }
        return this.field5221.method1840(true);
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(IBIILrr;Luo;Z)V")
    public final void method679(int arg0, byte arg1, int arg2, int arg3, class203 arg4, class345 arg5, boolean arg6) {
        if (arg1 != -126) {
            method2379(-30);
        }
        ++field5223;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(I)I")
    public final int method672(int arg0) {
        if (arg0 != 17011) {
            this.method679(-126, (byte) -127, 116, 70, (class203) null, (class345) null, false);
        }
        ++field5207;
        return this.field5221.field3993;
    }

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "(Luo;I)V")
    public final void method678(class345 arg0, int arg1) {
        ++field5214;
        if (arg1 != -22948) {
            this.field5221 = null;
        }
        class394 var3 = this.field5221.method1848(super.field1568, true, 131072, arg0, false, true, super.field1576);
        if (var3 != null) {
            this.field5221.method1850(false, -121, super.field1568 >> 7, super.field1576 >> 7, arg0, super.field1568 >> 7, super.field1576 >> 7, var3);
        }
    }

    @OriginalMember(owner = "client!sk", name = "e", descriptor = "(B)V")
    public static void method2378(byte arg0) {
        field5206 = null;
        if (arg0 <= 93) {
            field5206 = null;
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(ILuo;I)Lmj;")
    public final class394 method685(int arg0, class345 arg1, int arg2) {
        if (arg2 != -9380) {
            this.method675(-9, -93, (class345) null, -4);
        }
        ++field5208;
        return this.field5221.method1848(0, false, arg0, arg1, false, false, 0);
    }

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "(I)I")
    public final int method684(int arg0) {
        if (arg0 != -13726) {
            this.method681(true, (class345) null);
        }
        ++field5216;
        return this.field5221.field3987;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(B)I")
    public final int method689(byte arg0) {
        if (arg0 != -83) {
            return 71;
        } else {
            ++field5220;
            return this.field5221.field3962;
        }
    }

    @OriginalMember(owner = "client!sk", name = "g", descriptor = "(I)V")
    public static final void method2379(int arg0) {
        class205.field2825.method888(0);
        if (arg0 <= -91) {
            ++field5227;
        }
    }

    @OriginalMember(owner = "client!sk", name = "<init>", descriptor = "(Luo;Lgm;IIIIIIZI)V")
    public class371(class345 arg0, class64 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9) {
        super(arg5, arg6, arg7, arg1.field882, arg1.field875);
        this.field5221 = new class282(arg0, arg1, 22, arg2, arg3, arg4, arg5, arg7, arg8, arg9);
        this.field5213 = ~arg1.field922 != -1 && !arg8;
    }

    @OriginalMember(owner = "client!sk", name = "d", descriptor = "(B)V")
    public final void method674(byte arg0) {
        ++field5224;
        if (arg0 == -1) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!sk", name = "c", descriptor = "(B)Z")
    public final boolean method683(byte arg0) {
        int var2 = 93 % ((47 - arg0) / 47);
        ++field5215;
        return false;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(IZC)I")
    public static final int method2380(int arg0, boolean arg1, char arg2) {
        ++field5225;
        int var3 = arg2 << 4;
        if (!arg1) {
            method2379(-105);
        }
        if (Character.isUpperCase(arg2) || Character.isTitleCase(arg2)) {
            arg2 = Character.toLowerCase(arg2);
            var3 = (arg2 << 4) + 1;
        }
        if (~arg2 == -242 && arg0 == 0) {
            var3 = 1762;
        }
        return var3;
    }

    static {
        new class442("To prevent further mutes please read the rules.", "Um eine erneute Stummschaltung zu verhindern, lies bitte die Regeln.", "Pour éviter un nouveau blocage, lisez le règlement.", "Para evitar outros vetos, leia as regras.");
        field5212 = 127;
        field5226 = 0;
        field5206 = null;
    }
}
