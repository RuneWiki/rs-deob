import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public class class316 extends class24 implements class175 {

    @OriginalMember(owner = "client!vl", name = "z", descriptor = "Lqda;")
    private class689 field4370;

    @OriginalMember(owner = "client!vl", name = "G", descriptor = "[S")
    public static short[] field4376 = new short[] { 9, 58, 47, 20, 5, 15, 8, 3 };

    @OriginalMember(owner = "client!vl", name = "C", descriptor = "Ltw;")
    public static class233 field4373 = new class233();

    @OriginalMember(owner = "client!vl", name = "x", descriptor = "I")
    public static int field4368;

    @OriginalMember(owner = "client!vl", name = "y", descriptor = "I")
    public static int field4369;

    @OriginalMember(owner = "client!vl", name = "A", descriptor = "I")
    public static int field4371;

    @OriginalMember(owner = "client!vl", name = "B", descriptor = "I")
    public static int field4372;

    @OriginalMember(owner = "client!vl", name = "F", descriptor = "I")
    public static int field4375;

    @OriginalMember(owner = "client!vl", name = "H", descriptor = "I")
    public static int field4377;

    @OriginalMember(owner = "client!vl", name = "I", descriptor = "I")
    public static int field4378;

    @OriginalMember(owner = "client!vl", name = "J", descriptor = "I")
    public static int field4379;

    @OriginalMember(owner = "client!vl", name = "L", descriptor = "I")
    public static int field4380;

    @OriginalMember(owner = "client!vl", name = "D", descriptor = "[Lpi;")
    public static class302[] field4374;

    @OriginalMember(owner = "client!vl", name = "c", descriptor = "(I)I", line = 3)
    public final int method240(int arg0) {
        ++field4377;
        if (arg0 != 18471) {
            method1908((byte) -90);
        }
        return super.method240(18471);
    }

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "(I)Z", line = 15)
    public final boolean method1284(int arg0) {
        if (arg0 != -28439) {
            return true;
        } else {
            ++field4378;
            return super.method239(super.field338.field9520, -16296);
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(II)V", line = 27)
    public final void method238(int arg0, int arg1) {
        ++field4375;
        if (arg0 != -22454) {
            this.method1283((byte) -62, false);
        }
        super.method238(arg0, this.field4370.field9764 * arg1);
    }

    @OriginalMember(owner = "client!vl", name = "d", descriptor = "(B)V", line = 40)
    public static final void method1906(byte arg0) {
        class101.field1535.method2821(1);
        ++field4371;
        class693.field9846.method2103((byte) -42);
        if (arg0 <= 10) {
            method1908((byte) 126);
        }
        class223.field3337.method2103((byte) -42);
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(III)Lko;", line = 55)
    public static final class293 method1907(int arg0, int arg1, int arg2) {
        if (class541.field7946[arg0][arg1][arg2] == null) {
            boolean var3 = class541.field7946[0][arg1][arg2] != null && class541.field7946[0][arg1][arg2].field4098 != null;
            if (var3 && arg0 >= class596.field8626 - 1) {
                return null;
            }
            class526.method3099(arg0, arg1, arg2);
        }
        return class541.field7946[arg0][arg1][arg2];
    }

    @OriginalMember(owner = "client!vl", name = "e", descriptor = "(B)V", line = 75)
    public static void method1908(byte arg0) {
        field4376 = null;
        field4373 = null;
        if (arg0 != 8) {
            method1907(-117, 2, 111);
        }
        field4374 = null;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(BZ)Ljaclib/memory/Buffer;", line = 87)
    public final Buffer method1283(byte arg0, boolean arg1) {
        if (arg0 != 0) {
            return null;
        } else {
            ++field4368;
            return super.method237(super.field338.field9520, true, arg1);
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(B)V", line = 98)
    public final void method231(byte arg0) {
        super.method231(arg0);
        ++field4380;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(ILek;)Ljf;", line = 118)
    public static final class695 method1909(int arg0, class465 arg1) {
        ++field4369;
        int var2 = 12 / ((arg0 - 59) / 53);
        class609 var3 = class90.method673(true, arg1);
        int var4 = arg1.method2701(true);
        return new class695(var3.field8750, var3.field8760, var3.field8757, var3.field8755, var3.field8748, var4);
    }

    @OriginalMember(owner = "client!vl", name = "<init>", descriptor = "(Lad;Lqda;Z)V", line = 132)
    public class316(class669 arg0, class689 arg1, boolean arg2) {
        super(arg0, 34963, arg2);
        this.field4370 = arg1;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(I)Lqda;", line = 141)
    public final class689 method1282(int arg0) {
        ++field4379;
        if (arg0 != -17149) {
            method1909(119, (class465) null);
        }
        return this.field4370;
    }
}
