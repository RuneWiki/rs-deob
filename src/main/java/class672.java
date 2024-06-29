import jaggl.OpenGL;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jga")
public class class672 extends class433 implements class537 {

    @OriginalMember(owner = "client!jga", name = "A", descriptor = "I")
    public static int field9516 = 0;

    @OriginalMember(owner = "client!jga", name = "C", descriptor = "I")
    public static int field9518 = 0;

    @OriginalMember(owner = "client!jga", name = "w", descriptor = "Z")
    public static boolean field9512 = false;

    @OriginalMember(owner = "client!jga", name = "y", descriptor = "F")
    public static float field9514;

    @OriginalMember(owner = "client!jga", name = "z", descriptor = "I")
    public static int field9515;

    @OriginalMember(owner = "client!jga", name = "B", descriptor = "I")
    public static int field9517;

    @OriginalMember(owner = "client!jga", name = "D", descriptor = "Llca;")
    public static class603 field9519;

    @OriginalMember(owner = "client!jga", name = "x", descriptor = "[Lxa;")
    public static class468[] field9513;

    @OriginalMember(owner = "client!jga", name = "<init>", descriptor = "(Ldc;IZ[[I)V")
    public class672(class5 arg0, int arg1, boolean arg2, int[][] arg3) {
        super(arg0, 34067, class5.field100, class294.field4160, arg1 * 6 * arg1, arg2);
        super.field5925.method897(this, true);
        if (arg2) {
            for (int var5 = 0; var5 < 6; ++var5) {
                this.method2462(var5 + 34069, arg3[var5], arg1, 22784, arg1);
            }
        } else {
            for (int var6 = 0; var6 < 6; ++var6) {
                OpenGL.glTexImage2Di(var6 + 34069, 0, this.method2461(-117), arg1, arg1, 0, class420.method2414(144, super.field5922), super.field5925.field144, arg3[var6], 0);
            }
        }
    }

    @OriginalMember(owner = "client!jga", name = "a", descriptor = "(ILeh;)Ltq;")
    public static final class587 method3762(int arg0, class335 arg1) {
        ++field9517;
        class288 var2 = class108.method805(arg1, false);
        int var3 = arg1.method2045(-98);
        if (arg0 != 0) {
            field9518 = 9;
        }
        int var4 = arg1.method2045(-98);
        return new class587(var2.field4065, var2.field4069, var2.field4064, var2.field4073, var2.field4067, var2.field4075, var2.field4070, var2.field4074, var2.field4066, var3, var4);
    }

    @OriginalMember(owner = "client!jga", name = "a", descriptor = "(B)V")
    public static void method3763(byte arg0) {
        if (arg0 > 63) {
            field9519 = null;
            field9513 = null;
        }
    }

    @OriginalMember(owner = "client!jga", name = "e", descriptor = "(I)Z")
    public static final boolean method3764(int arg0) {
        ++field9515;
        if (arg0 != 14097) {
            field9516 = 82;
        }
        try {
            return class662.method3720(-190);
        } catch (IOException var4) {
            class70.method545(-124);
            return true;
        } catch (Exception var5) {
            String var2 = "T2 - " + (class403.field5396 != null ? class403.field5396.method1822(arg0 ^ 14097) : -1) + "," + (class102.field1525 != null ? class102.field1525.method1822(arg0 ^ 14092) : -1) + "," + (class17.field272 == null ? -1 : class17.field272.method1822(67)) + " - " + class269.field3754 + "," + (class473.field6334 - -class199.field2897.field5643[0]) + "," + (class199.field2897.field5649[0] + class233.field3269) + " - ";
            for (int var3 = 0; ~class269.field3754 < ~var3 && ~var3 > -51; ++var3) {
                var2 = var2 + class439.field6039.field4600[var3] + ",";
            }
            class259.method1586(var5, var2, (byte) 8);
            class55.method365((byte) -105, false);
            return true;
        }
    }
}
