import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public class class620 extends class212 {

    @OriginalMember(owner = "client!tl", name = "p", descriptor = "Ltr;")
    public static class296 field8440 = new class296();

    @OriginalMember(owner = "client!tl", name = "o", descriptor = "I")
    public static int field8439;

    @OriginalMember(owner = "client!tl", name = "q", descriptor = "I")
    public static int field8441;

    @OriginalMember(owner = "client!tl", name = "r", descriptor = "I")
    public static int field8442;

    @OriginalMember(owner = "client!tl", name = "s", descriptor = "I")
    public static int field8443;

    @OriginalMember(owner = "client!tl", name = "t", descriptor = "I")
    public static int field8444;

    @OriginalMember(owner = "client!tl", name = "v", descriptor = "I")
    public static int field8446;

    @OriginalMember(owner = "client!tl", name = "w", descriptor = "I")
    public static int field8447;

    @OriginalMember(owner = "client!tl", name = "x", descriptor = "I")
    public static int field8448;

    @OriginalMember(owner = "client!tl", name = "u", descriptor = "[I")
    public static int[] field8445;

    @OriginalMember(owner = "client!tl", name = "<init>", descriptor = "(ILdh;)V")
    public class620(int arg0, class322 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!tl", name = "d", descriptor = "(I)V")
    public static void method3535(int arg0) {
        int var1 = 51 / ((arg0 - 33) / 40);
        field8445 = null;
        field8440 = null;
    }

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "(II)I")
    public final int method417(int arg0, int arg1) {
        ++field8444;
        if (arg0 != 3) {
            return -46;
        } else if (super.field3004.method2061(-62)) {
            return 3;
        } else {
            return arg1 != 0 && ~super.field3004.field4453.method1849(-32350) != -2 ? 2 : 1;
        }
    }

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "(I)I")
    public final int method422(int arg0) {
        if (arg0 != 20014) {
            field8445 = null;
        }
        ++field8439;
        return 1;
    }

    @OriginalMember(owner = "client!tl", name = "e", descriptor = "(I)I")
    public final int method3536(int arg0) {
        ++field8441;
        if (arg0 != -32350) {
            field8445 = null;
        }
        return super.field3006;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(Z)V")
    public final void method418(boolean arg0) {
        ++field8446;
        if (!arg0) {
            if (super.field3004.method2061(-94)) {
                super.field3006 = 0;
            }
            if (~super.field3006 > -1 && super.field3006 > 2) {
                super.field3006 = this.method422(20014);
            }
        }
    }

    @OriginalMember(owner = "client!tl", name = "f", descriptor = "(I)Z")
    public final boolean method3537(int arg0) {
        if (arg0 <= 85) {
            this.method3536(90);
        }
        ++field8447;
        return !super.field3004.method2061(-70);
    }

    @OriginalMember(owner = "client!tl", name = "g", descriptor = "(I)V")
    public static final void method3538(int arg0) throws IOException {
        if (class512.field7137 != null && ~class38.field938 < -1) {
            int var1 = 0;
            while (true) {
                class564 var2 = (class564) class73.field1331.method1269(arg0 ^ 4);
                if (var2 == null) {
                    class10.field137 = 0;
                    class542.field7486 += var1;
                    break;
                }
                class512.field7137.method703(0, arg0 ^ 119, var2.field7781, var2.field7778.field3066);
                var1 += var2.field7781;
                class38.field938 -= var2.field7781;
                var2.method2314((byte) 74);
                var2.field7778.method1508((byte) -69);
                var2.method3273((byte) -45);
            }
        }
        if (arg0 != 0) {
            method3535(58);
        }
        ++field8448;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(II)V")
    public final void method419(int arg0, int arg1) {
        super.field3006 = arg1;
        ++field8442;
        int var3 = 65 / ((82 - arg0) / 35);
    }

    @OriginalMember(owner = "client!tl", name = "<init>", descriptor = "(Ldh;)V")
    public class620(class322 arg0) {
        super(arg0);
    }
}
