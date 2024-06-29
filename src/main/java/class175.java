import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class175 extends class217 {

    @OriginalMember(owner = "client!pg", name = "z", descriptor = "I")
    public static int field3132 = 0;

    @OriginalMember(owner = "client!pg", name = "B", descriptor = "I")
    public static int field3134 = 0;

    @OriginalMember(owner = "client!pg", name = "H", descriptor = "I")
    public static volatile int field3140 = 0;

    @OriginalMember(owner = "client!pg", name = "C", descriptor = "Lng;")
    public static class139 field3135 = new class139(5);

    @OriginalMember(owner = "client!pg", name = "I", descriptor = "Llc;")
    public static class143 field3141 = class66.method374(" ", -1);

    @OriginalMember(owner = "client!pg", name = "J", descriptor = "Z")
    public static boolean field3142 = false;

    @OriginalMember(owner = "client!pg", name = "K", descriptor = "Llc;")
    public static class143 field3143 = class66.method374("::rect_debug", -1);

    @OriginalMember(owner = "client!pg", name = "y", descriptor = "I")
    public static int field3131;

    @OriginalMember(owner = "client!pg", name = "A", descriptor = "I")
    public static int field3133;

    @OriginalMember(owner = "client!pg", name = "D", descriptor = "I")
    public static int field3136;

    @OriginalMember(owner = "client!pg", name = "F", descriptor = "I")
    public static int field3138;

    @OriginalMember(owner = "client!pg", name = "G", descriptor = "I")
    public static int field3139;

    @OriginalMember(owner = "client!pg", name = "E", descriptor = "Ltg;")
    private class277 field3137;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lh;B)V")
    public final void method1150(class190 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method1265(arg1 ^ 0xFFFFFFAE);
            if (var3 == 0) {
                field3139++;
                if (arg1 != -41) {
                    field3132 = -121;
                    return;
                }
                return;
            }
            this.method1151(arg0, (byte) -103, var3);
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lh;BI)V")
    private final void method1151(class190 arg0, byte arg1, int arg2) {
        if (arg2 == 249) {
            int var4 = arg0.method1265(126);
            if (this.field3137 == null) {
                int var5 = class29.method198(var4, false);
                this.field3137 = new class277(var5);
            }
            for (int var6 = 0; var6 < var4; var6++) {
                boolean var7 = arg0.method1265(123) == 1;
                int var8 = arg0.method1282(110);
                class61 var9;
                if (var7) {
                    var9 = new class265(arg0.method1270((byte) -111));
                } else {
                    var9 = new class3(arg0.method1269(77));
                }
                this.field3137.method1825(var9, (byte) 64, (long) var8);
            }
        }
        field3131++;
        if (arg1 > -20) {
            field3134 = -33;
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(ILgf;)V")
    public static final void method1152(int arg0, class7 arg1) {
        field3133++;
        class6.field94 = arg1;
        if (arg0 != 5) {
            method1153((byte) -44);
        }
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(B)V")
    public static void method1153(byte arg0) {
        int var1 = -45 / ((-arg0 - 18) / 37);
        field3143 = null;
        field3135 = null;
        field3141 = null;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IILlc;)Llc;")
    public final class143 method1154(int arg0, int arg1, class143 arg2) {
        field3136++;
        if (arg0 != 8471) {
            this.method1151((class190) null, (byte) 0, -42);
        }
        if (this.field3137 == null) {
            return arg2;
        } else {
            class265 var4 = (class265) this.field3137.method1824((long) arg1, 0);
            return var4 == null ? arg2 : var4.field4767;
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(III)I")
    public final int method1155(int arg0, int arg1, int arg2) {
        field3138++;
        if (this.field3137 == null) {
            return arg0;
        } else {
            class3 var4 = (class3) this.field3137.method1824((long) arg1, arg2);
            return var4 == null ? arg0 : var4.field49;
        }
    }
}
