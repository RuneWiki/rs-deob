import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rl")
public class class183 extends class86 {

    @OriginalMember(owner = "client!rl", name = "H", descriptor = "I")
    public int field3147 = 0;

    @OriginalMember(owner = "client!rl", name = "z", descriptor = "Lbe;")
    public static class283 field3139 = class153.method941(125, ":");

    @OriginalMember(owner = "client!rl", name = "T", descriptor = "Lbe;")
    public static class283 field3159 = class153.method941(125, "Benutzen");

    @OriginalMember(owner = "client!rl", name = "S", descriptor = "Z")
    public static boolean field3158 = false;

    @OriginalMember(owner = "client!rl", name = "Q", descriptor = "Lbe;")
    public static class283 field3156 = class153.method941(-45, "<)4col>");

    @OriginalMember(owner = "client!rl", name = "t", descriptor = "I")
    public int field3133;

    @OriginalMember(owner = "client!rl", name = "u", descriptor = "I")
    public int field3134;

    @OriginalMember(owner = "client!rl", name = "w", descriptor = "I")
    public int field3136;

    @OriginalMember(owner = "client!rl", name = "y", descriptor = "I")
    public int field3138;

    @OriginalMember(owner = "client!rl", name = "A", descriptor = "I")
    public int field3140;

    @OriginalMember(owner = "client!rl", name = "B", descriptor = "I")
    public static int field3141;

    @OriginalMember(owner = "client!rl", name = "C", descriptor = "I")
    public static int field3142;

    @OriginalMember(owner = "client!rl", name = "E", descriptor = "I")
    public int field3144;

    @OriginalMember(owner = "client!rl", name = "G", descriptor = "I")
    public static int field3146;

    @OriginalMember(owner = "client!rl", name = "J", descriptor = "I")
    public int field3149;

    @OriginalMember(owner = "client!rl", name = "K", descriptor = "I")
    public int field3150;

    @OriginalMember(owner = "client!rl", name = "L", descriptor = "I")
    public int field3151;

    @OriginalMember(owner = "client!rl", name = "M", descriptor = "I")
    public int field3152;

    @OriginalMember(owner = "client!rl", name = "R", descriptor = "I")
    public static int field3157;

    @OriginalMember(owner = "client!rl", name = "O", descriptor = "Lek;")
    public static class172 field3154;

    @OriginalMember(owner = "client!rl", name = "x", descriptor = "Lea;")
    public class191 field3137;

    @OriginalMember(owner = "client!rl", name = "I", descriptor = "Ll;")
    public class281 field3148;

    @OriginalMember(owner = "client!rl", name = "v", descriptor = "Lbj;")
    public class51 field3135;

    @OriginalMember(owner = "client!rl", name = "P", descriptor = "Lbj;")
    public class51 field3155;

    @OriginalMember(owner = "client!rl", name = "N", descriptor = "Lja;")
    public class60 field3153;

    @OriginalMember(owner = "client!rl", name = "F", descriptor = "Z")
    public boolean field3145;

    @OriginalMember(owner = "client!rl", name = "D", descriptor = "[I")
    public int[] field3143;

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(IB)Lbe;", line = 10)
    public static final class283 method1207(int arg0, byte arg1) {
        if (arg1 > 0) {
            method1211((byte[]) null, true, (byte) -117);
        }
        field3146++;
        return class216.field3656[arg0].method1925((byte) -44) > 0 ? class299.method2022(new class283[] { class103.field1752[arg0], class202.field3445, class216.field3656[arg0] }, (byte) 32) : class103.field1752[arg0];
    }

    @OriginalMember(owner = "client!rl", name = "d", descriptor = "(I)V", line = 27)
    public final void method1208(int arg0) {
        int var2 = this.field3140;
        field3141++;
        if (arg0 != -24750) {
            return;
        }
        if (this.field3148 != null) {
            class281 var5 = this.field3148.method1873((byte) 40);
            if (var5 == null) {
                this.field3150 = 0;
                this.field3136 = 0;
                this.field3140 = -1;
                this.field3151 = 0;
                this.field3143 = null;
            } else {
                this.field3151 = var5.field4729;
                this.field3140 = var5.field4689;
                this.field3150 = var5.field4723;
                this.field3136 = var5.field4708 * 128;
                this.field3143 = var5.field4750;
            }
        } else if (this.field3153 != null) {
            int var3 = class252.method1714(0, this.field3153);
            if (var2 != var3) {
                this.field3140 = var3;
                class129 var4 = this.field3153.field822;
                if (var4.field2193 != null) {
                    var4 = var4.method806((byte) 78);
                }
                if (var4 == null) {
                    this.field3136 = 0;
                } else {
                    this.field3136 = var4.field2182 * 128;
                }
            }
        } else if (this.field3137 != null) {
            this.field3140 = class267.method1800(this.field3137, (byte) 62);
            this.field3136 = this.field3137.field3282 * 128;
        }
        if (this.field3140 != var2 && this.field3155 != null) {
            class301.field5089.method1275(this.field3155);
            this.field3155 = null;
        }
    }

    @OriginalMember(owner = "client!rl", name = "c", descriptor = "(B)V", line = 113)
    public static void method1209(byte arg0) {
        field3156 = null;
        field3139 = null;
        field3159 = null;
        field3154 = null;
        if (arg0 >= -36) {
            field3158 = false;
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(III)Lbc;", line = 128)
    public static final class110 method1210(int arg0, int arg1, int arg2) {
        class160 var3 = class86.field1459[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class110 var4 = var3.field2617;
            var3.field2617 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "([BZB)Ljava/lang/Object;", line = 150)
    public static final Object method1211(byte[] arg0, boolean arg1, byte arg2) {
        field3157++;
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !class248.field4238) {
            try {
                class175 var3 = (class175) Class.forName("jl").getDeclaredConstructor().newInstance();
                var3.method1156((byte) 113, arg0);
                return var3;
            } catch (Throwable var5) {
                class248.field4238 = true;
            }
        }
        if (arg2 < 29) {
            method1212(48);
        }
        return arg1 ? class67.method426(arg0, true) : arg0;
    }

    @OriginalMember(owner = "client!rl", name = "e", descriptor = "(I)V", line = 185)
    public static final void method1212(int arg0) {
        field3142++;
        if (arg0 != -28828) {
            method1207(-100, (byte) 57);
        }
        if (class251.field4256.toLowerCase().indexOf("microsoft") != -1) {
            class149.field2439[221] = 43;
            class149.field2439[187] = 27;
            class149.field2439[190] = 72;
            class149.field2439[191] = 73;
            class149.field2439[189] = 26;
            class149.field2439[222] = 59;
            class149.field2439[220] = 74;
            class149.field2439[188] = 71;
            class149.field2439[223] = 28;
            class149.field2439[186] = 57;
            class149.field2439[219] = 42;
            class149.field2439[192] = 58;
            return;
        }
        class149.field2439[47] = 73;
        class149.field2439[91] = 42;
        class149.field2439[92] = 74;
        class149.field2439[44] = 71;
        class149.field2439[93] = 43;
        class149.field2439[45] = 26;
        class149.field2439[61] = 27;
        if (class251.field4274 == null) {
            class149.field2439[222] = 59;
            class149.field2439[192] = 58;
        } else {
            class149.field2439[192] = 28;
            class149.field2439[222] = 58;
            class149.field2439[520] = 59;
        }
        class149.field2439[46] = 72;
        class149.field2439[59] = 57;
    }
}
