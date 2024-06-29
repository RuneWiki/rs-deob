import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class523 extends class695 {

    @OriginalMember(owner = "client!lh", name = "J", descriptor = "I")
    public static int field7406 = -1;

    @OriginalMember(owner = "client!lh", name = "H", descriptor = "Lcv;")
    public static class565 field7404 = new class565();

    @OriginalMember(owner = "client!lh", name = "E", descriptor = "I")
    public static int field7401;

    @OriginalMember(owner = "client!lh", name = "G", descriptor = "I")
    public static int field7403;

    @OriginalMember(owner = "client!lh", name = "I", descriptor = "I")
    public static int field7405;

    @OriginalMember(owner = "client!lh", name = "K", descriptor = "I")
    public static int field7407;

    @OriginalMember(owner = "client!lh", name = "L", descriptor = "I")
    public static int field7408;

    @OriginalMember(owner = "client!lh", name = "N", descriptor = "I")
    public static int field7410;

    @OriginalMember(owner = "client!lh", name = "M", descriptor = "Lae;")
    public static class250 field7409;

    @OriginalMember(owner = "client!lh", name = "F", descriptor = "[B")
    private byte[] field7402;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(Ljava/awt/Canvas;III)Lid;")
    public static final class582 method3097(Canvas arg0, int arg1, int arg2, int arg3) {
        field7410++;
        try {
            if (arg2 != 8) {
                method3100(-37, 30);
            }
            Class var4 = Class.forName("og");
            class582 var5 = (class582) var4.getDeclaredConstructor().newInstance();
            var5.method39(arg1, arg0, arg3, (byte) -113);
            return var5;
        } catch (Throwable var7) {
            class7 var6 = new class7();
            var6.method39(arg1, arg0, arg3, (byte) -83);
            return var6;
        }
    }

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(IIII)[B")
    public final byte[] method3098(int arg0, int arg1, int arg2, int arg3) {
        field7407++;
        this.field7402 = new byte[arg1 * arg3 * arg2 * 2];
        if (arg0 <= 101) {
            return null;
        } else {
            this.method2430(arg1, 120, arg3, arg2);
            return this.field7402;
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(ILud;)Lada;")
    public static final class162 method3099(int arg0, class35 arg1) {
        field7403++;
        class256 var2 = class153.method1175(13282, arg1);
        if (arg0 != 255) {
            field7406 = -121;
        }
        int var3 = arg1.method234((byte) -111);
        int var4 = arg1.method234((byte) -108);
        int var5 = arg1.method253(-13900);
        return new class162(var2.field3713, var2.field3711, var2.field3710, var2.field3702, var2.field3705, var2.field3701, var2.field3714, var2.field3709, var2.field3715, var3, var4, var5);
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(II)V")
    public static final void method3100(int arg0, int arg1) {
        class613.field8875 = 3;
        class170.field2485 = 100;
        field7401++;
        class495.field7063 = arg1;
        class617.field8922 = -1;
        if (arg0 >= -21) {
            field7406 = 59;
        }
    }

    @OriginalMember(owner = "client!lh", name = "d", descriptor = "(I)I")
    public static final int method3101(int arg0) {
        field7405++;
        if (arg0 != 2) {
            field7406 = -12;
        }
        return class551.field7728;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIB)V")
    public final void method2787(int arg0, int arg1, byte arg2) {
        field7408++;
        int var4 = arg0 * 2;
        int var10001 = var4;
        int var6 = var4 + 1;
        this.field7402[var10001] = -1;
        int var5 = arg2 & 0xFF;
        if (arg1 > -25) {
            field7404 = null;
        }
        this.field7402[var6] = (byte) (var5 * 3 >> 5);
    }

    @OriginalMember(owner = "client!lh", name = "e", descriptor = "(I)V")
    public static void method3102(int arg0) {
        field7409 = null;
        if (arg0 != -1) {
            method3102(-48);
        }
        field7404 = null;
    }

    @OriginalMember(owner = "client!lh", name = "<init>", descriptor = "()V")
    public class523() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }
}
