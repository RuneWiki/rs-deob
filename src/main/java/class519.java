import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!baa")
public class class519 extends class256 {

    @OriginalMember(owner = "client!baa", name = "q", descriptor = "I")
    public int field7360;

    @OriginalMember(owner = "client!baa", name = "B", descriptor = "I")
    public int field7371;

    @OriginalMember(owner = "client!baa", name = "t", descriptor = "I")
    public int field7363;

    @OriginalMember(owner = "client!baa", name = "x", descriptor = "I")
    public int field7367;

    @OriginalMember(owner = "client!baa", name = "w", descriptor = "I")
    public int field7366;

    @OriginalMember(owner = "client!baa", name = "p", descriptor = "I")
    public int field7359;

    @OriginalMember(owner = "client!baa", name = "z", descriptor = "[I")
    public static int[] field7369 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!baa", name = "y", descriptor = "Ljw;")
    public static class551 field7368 = new class551(8, 1);

    @OriginalMember(owner = "client!baa", name = "r", descriptor = "I")
    public static int field7361;

    @OriginalMember(owner = "client!baa", name = "s", descriptor = "I")
    public static int field7362;

    @OriginalMember(owner = "client!baa", name = "u", descriptor = "I")
    public static int field7364;

    @OriginalMember(owner = "client!baa", name = "v", descriptor = "I")
    public static int field7365;

    @OriginalMember(owner = "client!baa", name = "A", descriptor = "I")
    public static int field7370;

    @OriginalMember(owner = "client!baa", name = "<init>", descriptor = "(Ljg;Ljha;IIIIIIIIIIIII)V")
    public class519(class338 arg0, class692 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        this.field7360 = arg13;
        this.field7371 = arg11;
        this.field7363 = arg14;
        this.field7367 = arg12;
        this.field7366 = arg10;
        this.field7359 = arg9;
    }

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(BIIZ)I")
    public static final int method3080(byte arg0, int arg1, int arg2, boolean arg3) {
        field7364++;
        class380 var4 = class105.method908(0, arg3, arg2);
        if (arg0 > -13) {
            field7368 = null;
        }
        if (var4 == null) {
            return -1;
        } else if (arg1 >= 0 && var4.field5295.length > arg1) {
            return var4.field5295[arg1];
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!baa", name = "d", descriptor = "(I)I")
    public static final int method3081(int arg0) {
        field7361++;
        if (class34.field450) {
            return 6;
        } else if (class522.field7394 == null) {
            return 0;
        } else {
            int var1 = class522.field7394.field1198;
            if (class23.method139(var1, (byte) -20)) {
                return 1;
            } else if (arg0 != 0) {
                return -123;
            } else if (class449.method2676(var1, 111)) {
                return 2;
            } else if (class56.method513(var1, (byte) 102)) {
                return 3;
            } else if (class237.method1607(43, var1)) {
                return 4;
            } else {
                return 5;
            }
        }
    }

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(B)V")
    public static void method3082(byte arg0) {
        field7369 = null;
        if (arg0 != 86) {
            method3083(false, null);
        }
        field7368 = null;
    }

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(ZLak;)V")
    public static final void method3083(boolean arg0, class349 arg1) {
        field7370++;
        class235 var2 = (class235) class720.field10084.method4203(arg0, (long) arg1.field931);
        if (var2 == null) {
            class229.method1575(arg1.field649, null, null, arg1, 0, -1, arg1.field995[0], arg1.field991[0]);
        } else {
            var2.method1602((byte) -92);
        }
    }

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(I)Ljw;")
    public class551 method930(int arg0) {
        field7362++;
        if (arg0 != 17503) {
            this.field7367 = 84;
        }
        return class415.field5814;
    }

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(ILvk;Ljava/lang/Object;)V")
    public static final void method3084(int arg0, class367 arg1, Object arg2) {
        field7365++;
        if (arg1.field5132 == null) {
            return;
        }
        for (int var3 = 0; var3 < 50 && arg1.field5132.peekEvent() != null; var3++) {
            class246.method1639(1L, (byte) -117);
        }
        try {
            if (arg0 > -76) {
                method3081(-46);
            }
            if (arg2 != null) {
                arg1.field5132.postEvent(new ActionEvent(arg2, 1001, "dummy"));
            }
        } catch (Exception var4) {
        }
    }
}
