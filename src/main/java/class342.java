import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public abstract class class342 {

    @OriginalMember(owner = "client!vg", name = "g", descriptor = "Z")
    public static boolean field5335 = true;

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "I")
    public static int field5330;

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "I")
    public static int field5331;

    @OriginalMember(owner = "client!vg", name = "d", descriptor = "I")
    public static int field5332;

    @OriginalMember(owner = "client!vg", name = "e", descriptor = "I")
    public static int field5333;

    @OriginalMember(owner = "client!vg", name = "f", descriptor = "I")
    public static int field5334;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "Lbk;")
    public static class180 field5329;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(I)V", line = 11)
    public static final void method2385(int arg0) {
        field5331++;
        class163.field2515.method1298((byte) 110);
        if (arg0 != -1) {
            field5334 = 111;
        }
        class245.field3850.method1298((byte) 110);
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(ZLjh;I)V", line = 24)
    public static final void method2386(boolean arg0, class207 arg1, int arg2) {
        field5333++;
        int var3 = arg1.field3153 == 0 ? arg1.field3169 : arg1.field3153;
        int var4 = arg1.field3187 == 0 ? arg1.field3239 : arg1.field3187;
        class177.method1201(arg0, arg1.field3250, (byte) 59, var4, class219.field3487[arg1.field3250 >> 16], var3);
        if (arg2 < 120) {
            return;
        }
        if (arg1.field3253 != null) {
            class177.method1201(arg0, arg1.field3250, (byte) 108, var4, arg1.field3253, var3);
        }
        class45 var5 = (class45) class166.field2557.method1558((long) arg1.field3250, false);
        if (var5 != null) {
            class166.method1135(11487, var5.field640, arg0, var3, var4);
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(Ljava/lang/String;B)I", line = 47)
    public static final int method2387(String arg0, byte arg1) {
        field5332++;
        if (arg1 != -1) {
            field5334 = 121;
        }
        if (class23.field293 == null || arg0.length() == 0) {
            return -1;
        }
        for (int var2 = 0; var2 < class23.field293.field1862; var2++) {
            if (class88.method599(class23.field293.field1857[var2], "<br>", arg1 - 2894, " ").equals(arg0)) {
                return var2;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "(I)V", line = 74)
    public static void method2388(int arg0) {
        field5329 = null;
        if (arg0 != 0) {
            method2385(-78);
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(Ljava/awt/Component;B)V")
    public abstract void method1071(Component arg0, byte arg1);

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public abstract void method1072(int arg0, Component arg1);

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(B)I")
    public abstract int method1070(byte arg0);
}
