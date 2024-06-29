import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!js")
public class class199 extends class139 {

    @OriginalMember(owner = "client!js", name = "L", descriptor = "[I")
    public static int[] field2905 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!js", name = "P", descriptor = "F")
    public static float field2909;

    @OriginalMember(owner = "client!js", name = "H", descriptor = "I")
    public static int field2901;

    @OriginalMember(owner = "client!js", name = "I", descriptor = "I")
    public static int field2902;

    @OriginalMember(owner = "client!js", name = "J", descriptor = "I")
    public static int field2903;

    @OriginalMember(owner = "client!js", name = "K", descriptor = "I")
    public static int field2904;

    @OriginalMember(owner = "client!js", name = "M", descriptor = "I")
    public static int field2906;

    @OriginalMember(owner = "client!js", name = "N", descriptor = "I")
    public static int field2907;

    @OriginalMember(owner = "client!js", name = "O", descriptor = "I")
    public static int field2908;

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(BLjava/awt/Canvas;)Lqn;")
    public static final class44 method1223(byte arg0, Canvas arg1) {
        ++field2908;
        try {
            Class var2 = Class.forName("ji");
            int var3 = 17 / ((-11 - arg0) / 34);
            class44 var4 = (class44) var2.newInstance();
            var4.method291(81, arg1);
            return var4;
        } catch (Throwable var6) {
            class102 var5 = new class102();
            var5.method291(93, arg1);
            return var5;
        }
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(Lrp;BI)V")
    public final void method21(class276 arg0, byte arg1, int arg2) {
        ++field2902;
        if (arg1 != -45) {
            field2905 = null;
        }
        if (arg2 == 0) {
            super.field1841 = arg0.method1701(-23121) == 1;
        }
    }

    @OriginalMember(owner = "client!js", name = "c", descriptor = "(I)V")
    public static void method1224(int arg0) {
        field2905 = null;
        if (arg0 != 1) {
            field2901 = -10;
        }
    }

    @OriginalMember(owner = "client!js", name = "c", descriptor = "(III)V")
    public static final void method1225(int arg0, int arg1, int arg2) {
        ++field2903;
        class450 var3 = class286.field4169[arg2][arg1];
        if (arg0 != 1) {
            method1224(126);
        }
        if (var3 != null) {
            class200.field2921 = var3.field6224;
            class64.field835 = var3.field6220;
            class179.field2586 = var3.field6223;
        }
        class1.method6(17018);
    }

    @OriginalMember(owner = "client!js", name = "<init>", descriptor = "()V")
    public class199() {
        super(1, false);
    }

    @OriginalMember(owner = "client!js", name = "b", descriptor = "(II)[I")
    public final int[] method22(int arg0, int arg1) {
        if (arg1 != 27782) {
            field2909 = 2.6136298F;
        }
        ++field2906;
        int[] var3 = super.field1844.method2176(arg0, 0);
        if (super.field1844.field5045) {
            int[] var4 = this.method879((byte) -29, arg0, 0);
            for (int var5 = 0; ~var5 > ~class356.field5147; ++var5) {
                var3[var5] = -var4[var5] + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(II)[[I")
    public final int[][] method33(int arg0, int arg1) {
        ++field2907;
        int[][] var3 = super.field1835.method999((byte) 104, arg1);
        if (super.field1835.field2395) {
            int[][] var4 = this.method882(0, arg1, 1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~class356.field5147 < ~var11; ++var11) {
                var8[var11] = -var5[var11] + 4096;
                var9[var11] = -var6[var11] + 4096;
                var10[var11] = -var7[var11] + 4096;
            }
        }
        return arg0 > -67 ? null : var3;
    }

    static {
        new class326("Unable to add friend - system busy.", "Der Freund konnte nicht hinzugefügt werden, das System ist derzeit ausgelastet.", "Impossible d'ajouter un ami - système occupé.", "Não foi possível adicionar o amigo. O sistema está ocupado.");
    }
}
