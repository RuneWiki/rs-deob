import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jda")
public class class224 extends class626 {

    @OriginalMember(owner = "client!jda", name = "h", descriptor = "I")
    public static int field3197 = -1;

    @OriginalMember(owner = "client!jda", name = "j", descriptor = "Lis;")
    public static class500 field3199 = new class500();

    @OriginalMember(owner = "client!jda", name = "k", descriptor = "I")
    public static int field3200;

    @OriginalMember(owner = "client!jda", name = "n", descriptor = "I")
    public static int field3203;

    @OriginalMember(owner = "client!jda", name = "o", descriptor = "I")
    public static int field3204;

    @OriginalMember(owner = "client!jda", name = "p", descriptor = "I")
    public static int field3205;

    @OriginalMember(owner = "client!jda", name = "s", descriptor = "I")
    public static int field3208;

    @OriginalMember(owner = "client!jda", name = "t", descriptor = "I")
    public static int field3209;

    @OriginalMember(owner = "client!jda", name = "v", descriptor = "J")
    public long field3211;

    @OriginalMember(owner = "client!jda", name = "l", descriptor = "Ljda;")
    public class224 field3201;

    @OriginalMember(owner = "client!jda", name = "m", descriptor = "Ljda;")
    public class224 field3202;

    @OriginalMember(owner = "client!jda", name = "i", descriptor = "Lkd;")
    public static class280 field3198;

    @OriginalMember(owner = "client!jda", name = "r", descriptor = "Lfp;")
    public static class323 field3207;

    @OriginalMember(owner = "client!jda", name = "u", descriptor = "Lav;")
    public static class637 field3210;

    // $FF: synthetic field
    @OriginalMember(owner = "client!jda", name = "w", descriptor = "Ljava/lang/Class;")
    public static Class field3212;

    @OriginalMember(owner = "client!jda", name = "q", descriptor = "[Ldm;")
    public static class50[] field3206;

    // $FF: synthetic method
    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method1555(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!jda", name = "b", descriptor = "(I)V", line = 4)
    public static void method1548(int arg0) {
        field3199 = null;
        field3198 = null;
        field3207 = null;
        field3206 = null;
        field3210 = null;
        int var1 = 122 / ((arg0 - 20) / 63);
    }

    @OriginalMember(owner = "client!jda", name = "c", descriptor = "(I)V", line = 18)
    public static final void method1549(int arg0) {
        if (class537.method3144(107)) {
            if (class748.field10459 == null) {
                class351.method2204(65536);
            }
            class269.field3877 = true;
            class647.field9160 = 0;
        }
        field3205++;
        if (arg0 != 0) {
            field3197 = -114;
        }
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(Laia;I)V", line = 42)
    public static final void method1550(class226 arg0, int arg1) {
        field3208++;
        if (class390.field5454 == null) {
            return;
        }
        class141 var2 = null;
        if (arg0.field3230 == 0) {
            var2 = (class141) class654.method3688(arg0.field3235, arg0.field3237, arg0.field3225);
        }
        if (arg0.field3230 == 1) {
            var2 = (class141) class140.method1107(arg0.field3235, arg0.field3237, arg0.field3225);
        }
        if (arg0.field3230 == 2) {
            var2 = (class141) class470.method2853(arg0.field3235, arg0.field3237, arg0.field3225, field3212 == null ? (field3212 = method1555("wk")) : field3212);
        }
        if (arg0.field3230 == 3) {
            var2 = (class141) class158.method1202(arg0.field3235, arg0.field3237, arg0.field3225);
        }
        if (arg1 < 48) {
            field3206 = null;
        }
        if (var2 == null) {
            arg0.field3228 = 0;
            arg0.field3224 = -1;
            arg0.field3223 = 0;
        } else {
            arg0.field3224 = var2.method1109((byte) -124);
            arg0.field3228 = var2.method1112((byte) -39);
            arg0.field3223 = var2.method1111(false);
        }
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(B)Z", line = 92)
    public final boolean method1551(byte arg0) {
        field3204++;
        if (this.field3202 == null) {
            return false;
        } else {
            return arg0 > 37;
        }
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(Lul;BLha;)I", line = 106)
    public static final int method1552(class569 arg0, byte arg1, class58 arg2) {
        if (arg1 != -57) {
            field3197 = -102;
        }
        field3200++;
        if (arg0.field8105 != -1) {
            return arg0.field8105;
        }
        if (arg0.field8099 != -1) {
            class546 var3 = arg2.field1084.method1154(arg1 ^ 0x50, arg0.field8099);
            if (!var3.field7705) {
                return var3.field7703;
            }
        }
        return arg0.field8093;
    }

    @OriginalMember(owner = "client!jda", name = "g", descriptor = "(I)V", line = 132)
    public final void method1553(int arg0) {
        field3209++;
        if (this.field3202 == null) {
            return;
        }
        this.field3202.field3201 = this.field3201;
        this.field3201.field3202 = this.field3202;
        this.field3201 = null;
        this.field3202 = null;
        int var2 = -71 / ((-arg0 - 52) / 48);
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(Lud;I)Lpca;", line = 155)
    public static final class712 method1554(class35 arg0, int arg1) {
        field3203++;
        if (arg1 != -23677) {
            field3197 = -92;
        }
        return new class712(arg0.method225((byte) 89), arg0.method225((byte) 113), arg0.method225((byte) 86), arg0.method225((byte) 85), arg0.method239(-25), arg0.method239(-123), arg0.method273(255));
    }
}
