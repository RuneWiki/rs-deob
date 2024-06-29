import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public abstract class class28 {

    @OriginalMember(owner = "client!ih", name = "d", descriptor = "Lqd;")
    public static class37 field407 = new class37(50);

    @OriginalMember(owner = "client!ih", name = "f", descriptor = "J")
    public static long field409 = 0L;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "I")
    public static int field404;

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "I")
    public static int field405;

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "I")
    public static int field406;

    @OriginalMember(owner = "client!ih", name = "e", descriptor = "I")
    public static int field408;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(III)I")
    public abstract int method207(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(B)V")
    public abstract void method208(byte arg0);

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(I)V")
    public static void method209(int arg0) {
        field407 = null;
        if (arg0 != 0) {
            field406 = 9;
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(B[B)[B")
    public static final byte[] method210(byte arg0, byte[] arg1) {
        field405++;
        if (arg0 != 68) {
            field407 = null;
        }
        class114 var2 = new class114(arg1);
        int var3 = var2.method760(false);
        int var4 = var2.method759((byte) 116);
        if (var4 < 0 || !(class187.field2663 == 0 || class187.field2663 >= var4)) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var7 = new byte[var4];
            var2.method758(var7, var4, (byte) 124, 0);
            return var7;
        } else {
            int var5 = var2.method759((byte) 119);
            if (var5 < 0 || !(class187.field2663 == 0 || class187.field2663 >= var5)) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var3 == 1) {
                class278.method1874(var6, var5, arg1, var4, 9);
            } else {
                class274.field4401.method1884(-92, var2, var6);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public static final void method211(Component arg0, int arg1) {
        field408++;
        if (arg1 > -115) {
            field407 = null;
        }
        arg0.removeKeyListener(class107.field1553);
        arg0.removeFocusListener(class107.field1553);
        class16.field236 = -1;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(ZILve;IIII)V")
    public static final void method212(boolean arg0, int arg1, class233 arg2, int arg3, int arg4, int arg5, int arg6) {
        class43.field619 = arg6;
        class182.field2599 = arg4;
        class184.field2620 = 1;
        class224.field3353 = arg0;
        class113.field1614 = arg1;
        field404++;
        class70.field1098 = arg3;
        if (arg5 != 7970) {
            method209(-11);
        }
        class154.field2255 = arg2;
    }
}
