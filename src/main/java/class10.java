import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class10 extends class27 {

    @OriginalMember(owner = "client!ai", name = "N", descriptor = "I")
    private int field158 = 0;

    @OriginalMember(owner = "client!ai", name = "V", descriptor = "I")
    private int field166 = 4096;

    @OriginalMember(owner = "client!ai", name = "M", descriptor = "Lkb;")
    public static class93 field157 = class76.method390("cross", 0);

    @OriginalMember(owner = "client!ai", name = "Q", descriptor = "Lkb;")
    private static class93 field161 = class76.method390("Unexpected loginserver response)3", 0);

    @OriginalMember(owner = "client!ai", name = "T", descriptor = "Z")
    public static boolean field164 = false;

    @OriginalMember(owner = "client!ai", name = "S", descriptor = "Lkb;")
    public static class93 field163 = field161;

    @OriginalMember(owner = "client!ai", name = "W", descriptor = "I")
    public static int field167 = 1;

    @OriginalMember(owner = "client!ai", name = "P", descriptor = "I")
    public static int field160;

    @OriginalMember(owner = "client!ai", name = "R", descriptor = "I")
    public static int field162;

    @OriginalMember(owner = "client!ai", name = "U", descriptor = "I")
    public static int field165;

    @OriginalMember(owner = "client!ai", name = "O", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field159;

    @OriginalMember(owner = "client!ai", name = "<init>", descriptor = "()V")
    public class10() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(ZILkb;)V")
    public static final void method53(boolean arg0, int arg1, class93 arg2) {
        class151.field2908.method47(65, 8);
        class151.field2908.method1056(arg2.method482(-61), -22206);
        ++field162;
        if (arg0) {
            ++class26.field416;
            class151.field2908.method1081(arg1, !arg0);
        }
    }

    @OriginalMember(owner = "client!ai", name = "d", descriptor = "(I)V")
    public static void method54(int arg0) {
        if (arg0 < 76) {
            method54(121);
        }
        field157 = null;
        field161 = null;
        field163 = null;
        field159 = null;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(BILrd;)V")
    public final void method15(byte arg0, int arg1, class158 arg2) {
        ++field160;
        if (~arg1 != -1) {
            if (arg1 == 1) {
                this.field166 = arg2.method1071(28101);
            }
        } else {
            this.field158 = arg2.method1071(28101);
        }
        if (arg0 <= 106) {
            field167 = -124;
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IZ)[I")
    public final int[] method55(int arg0, boolean arg1) {
        ++field165;
        int[] var3 = super.field447.method1238(arg1, arg0);
        if (super.field447.field3737) {
            int[] var4 = this.method145(0, (byte) 126, arg0);
            for (int var5 = 0; ~class159.field3209 < ~var5; ++var5) {
                int var6 = var4[var5];
                var3[var5] = this.field158 <= var6 && this.field166 >= var6 ? 4096 : 0;
            }
        }
        return var3;
    }
}
