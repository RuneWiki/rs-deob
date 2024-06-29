import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class38 extends class416 {

    @OriginalMember(owner = "client!sc", name = "H", descriptor = "Lra;")
    public static class361 field549 = new class361(41, 6);

    @OriginalMember(owner = "client!sc", name = "J", descriptor = "I")
    public static int field551 = 0;

    @OriginalMember(owner = "client!sc", name = "E", descriptor = "I")
    public static int field546;

    @OriginalMember(owner = "client!sc", name = "F", descriptor = "I")
    public static int field547;

    @OriginalMember(owner = "client!sc", name = "G", descriptor = "I")
    public static int field548;

    @OriginalMember(owner = "client!sc", name = "I", descriptor = "I")
    public static int field550;

    @OriginalMember(owner = "client!sc", name = "D", descriptor = "[B")
    private byte[] field545;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IBZ)V")
    public final void method303(int arg0, byte arg1, boolean arg2) {
        field548++;
        byte var4 = (byte) ((arg1 >> 1 & 0x7F) + 127);
        int var5 = arg0 * 2;
        int var10001 = var5;
        int var6 = var5 + 1;
        this.field545[var10001] = var4;
        if (arg2) {
            this.field545[var6] = var4;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIIB)[B")
    public final byte[] method304(int arg0, int arg1, int arg2, byte arg3) {
        field546++;
        this.field545 = new byte[arg0 * arg2 * arg1 * 2];
        if (arg3 == 105) {
            this.method3734(arg0, arg2, 255, arg1);
            return this.field545;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "(I)V")
    public static void method305(int arg0) {
        field549 = null;
        if (arg0 != 127) {
            method306(true, false, null, 73);
        }
    }

    @OriginalMember(owner = "client!sc", name = "<init>", descriptor = "()V")
    public class38() {
        super(12, 5, 16, 2, 2, 0.45F);
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(ZZLoa;I)Lbd;")
    public static final class435 method306(boolean arg0, boolean arg1, class43 arg2, int arg3) {
        field550++;
        if (arg3 == -1) {
            return null;
        }
        if (class220.field2886 != null) {
            for (int var4 = 0; var4 < class220.field2886.length; var4++) {
                if (class220.field2886[var4] == arg3) {
                    return class550.field7145[var4];
                }
            }
        }
        class435 var5 = (class435) class346.field4418.method3655(-13, (long) arg3);
        if (var5 != null) {
            if (arg1 && var5.field5640 == null) {
                class547 var6 = class155.method1116(class169.field2101, !arg0, arg3);
                if (var6 == null) {
                    return null;
                }
                var5.field5640 = var6;
            }
            return var5;
        }
        if (arg0) {
            field551 = 57;
        }
        class506[] var7 = class506.method2737(class284.field3695, arg3);
        if (var7 == null) {
            return null;
        }
        class547 var8 = class155.method1116(class169.field2101, true, arg3);
        if (var8 == null) {
            return null;
        }
        class435 var9;
        if (arg1) {
            var9 = new class435(arg2.method405(var8, var7, true), var8);
        } else {
            var9 = new class435(arg2.method405(var8, var7, true));
        }
        class346.field4418.method3650((long) arg3, -117, var9);
        return var9;
    }
}
