import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class172 extends class125 {

    @OriginalMember(owner = "client!ga", name = "z", descriptor = "J")
    public long field3049;

    @OriginalMember(owner = "client!ga", name = "D", descriptor = "[I")
    public static int[] field3053 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "client!ga", name = "w", descriptor = "Loa;")
    public static class99 field3046 = class221.method1463(2844, " de votre liste noire)3");

    @OriginalMember(owner = "client!ga", name = "E", descriptor = "I")
    public static int field3054 = 0;

    @OriginalMember(owner = "client!ga", name = "v", descriptor = "I")
    public static int field3045;

    @OriginalMember(owner = "client!ga", name = "x", descriptor = "I")
    public static int field3047;

    @OriginalMember(owner = "client!ga", name = "y", descriptor = "I")
    public static int field3048;

    @OriginalMember(owner = "client!ga", name = "B", descriptor = "I")
    public static int field3051;

    @OriginalMember(owner = "client!ga", name = "C", descriptor = "I")
    public static int field3052;

    @OriginalMember(owner = "client!ga", name = "F", descriptor = "I")
    public static int field3055;

    @OriginalMember(owner = "client!ga", name = "G", descriptor = "Ltg;")
    public static class182 field3056;

    @OriginalMember(owner = "client!ga", name = "A", descriptor = "Lcf;")
    public static class93 field3050;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(III)Lil;")
    public static final class163 method1155(int arg0, int arg1, int arg2) {
        class216 var3 = class128.field2236[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class163 var4 = var3.field3756;
            var3.field3756 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(Z)V")
    public static void method1156(boolean arg0) {
        field3050 = null;
        field3056 = null;
        field3053 = null;
        if (!arg0) {
            method1158(-48);
        }
        field3046 = null;
    }

    @OriginalMember(owner = "client!ga", name = "<init>", descriptor = "()V")
    public class172() {
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIII)Z")
    public static final boolean method1157(int arg0, int arg1, int arg2, int arg3) {
        if (class187.method1281(arg0, arg1, arg2)) {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            return class181.method1208(var4 + 1, class189.field3337[arg0][arg1][arg2] + arg3, var5 + 1) && class181.method1208(var4 + 128 - 1, class189.field3337[arg0][arg1 + 1][arg2] + arg3, var5 + 1) && class181.method1208(var4 + 128 - 1, class189.field3337[arg0][arg1 + 1][arg2 + 1] + arg3, var5 + 128 - 1) && class181.method1208(var4 + 1, class189.field3337[arg0][arg1][arg2 + 1] + arg3, var5 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ga", name = "<init>", descriptor = "(J)V")
    public class172(long arg0) {
        this.field3049 = arg0;
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(I)V")
    public static final void method1158(int arg0) {
        int var1 = -45 / ((11 - arg0) / 57);
        class178.field3102.method1813(-1);
        field3052++;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public static final void method1159(Component arg0, int arg1) {
        field3047++;
        arg0.addMouseListener(class205.field3552);
        arg0.addMouseMotionListener(class205.field3552);
        if (arg1 == 7) {
            arg0.addFocusListener(class205.field3552);
        }
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(III)V")
    public static final void method1160(int arg0, int arg1, int arg2) {
        class65 var3 = class152.method1010(arg0, 1, (byte) -94);
        field3055++;
        var3.method433(32);
        int var4 = -39 / ((arg1 + 7) / 48);
        var3.field1094 = arg2;
    }
}
