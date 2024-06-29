import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iq")
public abstract class class190 extends class198 {

    @OriginalMember(owner = "client!iq", name = "f", descriptor = "[I")
    public static int[] field2886 = new int[2];

    @OriginalMember(owner = "client!iq", name = "e", descriptor = "I")
    public static int field2885;

    @OriginalMember(owner = "client!iq", name = "g", descriptor = "I")
    public static int field2887;

    @OriginalMember(owner = "client!iq", name = "h", descriptor = "I")
    public int field2888;

    @OriginalMember(owner = "client!iq", name = "i", descriptor = "I")
    public static int field2889;

    @OriginalMember(owner = "client!iq", name = "j", descriptor = "I")
    public static int field2890;

    @OriginalMember(owner = "client!iq", name = "k", descriptor = "I")
    public static int field2891;

    @OriginalMember(owner = "client!iq", name = "m", descriptor = "I")
    public int field2893;

    @OriginalMember(owner = "client!iq", name = "n", descriptor = "I")
    public static int field2894;

    @OriginalMember(owner = "client!iq", name = "o", descriptor = "I")
    public int field2895;

    @OriginalMember(owner = "client!iq", name = "d", descriptor = "Z")
    public boolean field2884;

    @OriginalMember(owner = "client!iq", name = "l", descriptor = "[J")
    public static long[] field2892;

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(I)V")
    public static void method1236(int arg0) {
        field2886 = null;
        if (arg0 <= 60) {
            field2886 = null;
        }
        field2892 = null;
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(ZLmj;)V")
    public static final void method1237(boolean arg0, class316 arg1) {
        if (!arg0) {
            field2892 = null;
        }
        field2890++;
        class312.field4688 = arg1;
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(ILqa;IIZLse;I)V")
    public final void method160(int arg0, class167 arg1, int arg2, int arg3, boolean arg4, class198 arg5, int arg6) {
        field2894++;
        if (arg2 != -4) {
            this.field2895 = 20;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(I[Lwca;B)V")
    public static final void method1238(int arg0, class311[] arg1, byte arg2) {
        if (arg2 != -50) {
            method1237(true, null);
        }
        for (int var3 = 0; var3 < arg1.length; var3++) {
            class311 var4 = arg1[var3];
            if (var4 != null) {
                if (var4.field4655 == 0) {
                    if (var4.field4652 != null) {
                        method1238(arg0, var4.field4652, (byte) -50);
                    }
                    class184 var5 = (class184) class600.field8865.method1333((long) var4.field4667, false);
                    if (var5 != null) {
                        class35.method176(arg0, -52, var5.field2796);
                    }
                }
                if (arg0 == 0 && var4.field4614 != null) {
                    class355 var6 = new class355();
                    var6.field5160 = var4.field4614;
                    var6.field5150 = var4;
                    class330.method2072(var6);
                }
                if (arg0 == 1 && var4.field4611 != null) {
                    if (var4.field4558 >= 0) {
                        class311 var7 = class436.method2659(true, var4.field4667);
                        if (var7 == null || var7.field4652 == null || var4.field4558 >= var7.field4652.length || var7.field4652[var4.field4558] != var4) {
                            continue;
                        }
                    }
                    class355 var8 = new class355();
                    var8.field5150 = var4;
                    var8.field5160 = var4.field4611;
                    class330.method2072(var8);
                }
            }
        }
        field2889++;
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(IZIIIII)V")
    public static final void method1239(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class111.field1408 = arg6;
        class2.field12 = arg3;
        class361.field5222 = arg5;
        field2885++;
        class383.field5590 = arg4;
        class553.field8227 = arg0;
        if (arg2 >= -70) {
            return;
        }
        if (arg1 && class361.field5222 >= 100) {
            class367.field5319 = class111.field1408 * 128 + 64;
            class358.field5200 = class2.field12 * 128 + 64;
            class111.field1412 = class226.method1477(class355.field5157, true, class358.field5200, class367.field5319) - class553.field8227;
        }
        class287.field4232 = 2;
    }

    @OriginalMember(owner = "client!iq", name = "b", descriptor = "(Z)Z")
    public final boolean method167(boolean arg0) {
        field2891++;
        return !arg0;
    }

    @OriginalMember(owner = "client!iq", name = "b", descriptor = "(B)V")
    public final void method165(byte arg0) {
        if (arg0 == -33) {
            field2887++;
            throw new IllegalStateException();
        }
    }
}
