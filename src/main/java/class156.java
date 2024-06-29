import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public abstract class class156 extends class187 {

    @OriginalMember(owner = "client!pa", name = "p", descriptor = "[I")
    public static int[] field2442 = new int[2500];

    @OriginalMember(owner = "client!pa", name = "u", descriptor = "F")
    public static float field2447;

    @OriginalMember(owner = "client!pa", name = "n", descriptor = "I")
    public static int field2440;

    @OriginalMember(owner = "client!pa", name = "o", descriptor = "I")
    public static int field2441;

    @OriginalMember(owner = "client!pa", name = "r", descriptor = "I")
    public static int field2444;

    @OriginalMember(owner = "client!pa", name = "s", descriptor = "I")
    public static int field2445;

    @OriginalMember(owner = "client!pa", name = "t", descriptor = "I")
    public static int field2446;

    @OriginalMember(owner = "client!pa", name = "v", descriptor = "I")
    public static int field2448;

    @OriginalMember(owner = "client!pa", name = "w", descriptor = "I")
    public static int field2449;

    @OriginalMember(owner = "client!pa", name = "q", descriptor = "Z")
    public boolean field2443;

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "(I)I", line = 6)
    public final int method1081(int arg0) {
        field2449++;
        if (arg0 <= 41) {
            field2447 = 0.91096336F;
        }
        return 1;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(B)Z", line = 17)
    public final boolean method1082(byte arg0) {
        if (arg0 > -16) {
            this.method1089();
        }
        field2441++;
        return false;
    }

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "(I)V", line = 28)
    public static void method1083(int arg0) {
        field2442 = null;
        if (arg0 != 0) {
            method1093(false, 58, -127, (class306) null);
        }
    }

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "(I)Z", line = 40)
    public final boolean method1086(int arg0) {
        if (arg0 != 2500) {
            this.method1091();
        }
        field2446++;
        return false;
    }

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "()I", line = 55)
    public int method1088() {
        field2444++;
        return 0;
    }

    @OriginalMember(owner = "client!pa", name = "f", descriptor = "(I)Z", line = 75)
    public final boolean method1090(int arg0) {
        if (arg0 == 0) {
            field2440++;
            return this.field2443;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(ZIILwf;)Z", line = 93)
    public static final boolean method1093(boolean arg0, int arg1, int arg2, class306 arg3) {
        field2448++;
        byte[] var4 = arg3.method2103(0, arg2, arg1);
        if (var4 == null) {
            return false;
        } else {
            class10.method65(arg0, var4);
            return true;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(II)V")
    public abstract void method1084(int arg0, int arg1);

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "()V")
    public abstract void method1085();

    @OriginalMember(owner = "client!pa", name = "e", descriptor = "(I)V")
    public abstract void method1087(int arg0);

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "()Z")
    public abstract boolean method1089();

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "()Z")
    public abstract boolean method1091();

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "(IIIII)V")
    public abstract void method1092(int arg0, int arg1, int arg2, int arg3, int arg4);
}
