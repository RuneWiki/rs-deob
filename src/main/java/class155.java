import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class155 extends class134 {

    @OriginalMember(owner = "client!gf", name = "v", descriptor = "I")
    public static int field2572 = 0;

    @OriginalMember(owner = "client!gf", name = "u", descriptor = "Z")
    public static boolean field2571 = false;

    @OriginalMember(owner = "client!gf", name = "o", descriptor = "I")
    public static int field2565;

    @OriginalMember(owner = "client!gf", name = "p", descriptor = "I")
    public static int field2566;

    @OriginalMember(owner = "client!gf", name = "q", descriptor = "I")
    public static int field2567;

    @OriginalMember(owner = "client!gf", name = "w", descriptor = "I")
    public static int field2573;

    @OriginalMember(owner = "client!gf", name = "x", descriptor = "I")
    public static int field2574;

    @OriginalMember(owner = "client!gf", name = "y", descriptor = "I")
    public static int field2575;

    @OriginalMember(owner = "client!gf", name = "z", descriptor = "I")
    public static int field2576;

    @OriginalMember(owner = "client!gf", name = "t", descriptor = "J")
    public long field2570;

    @OriginalMember(owner = "client!gf", name = "r", descriptor = "Lgf;")
    public class155 field2568;

    @OriginalMember(owner = "client!gf", name = "s", descriptor = "Lgf;")
    public class155 field2569;

    @OriginalMember(owner = "client!gf", name = "f", descriptor = "(I)V")
    public final void method1174(int arg0) {
        field2573++;
        if (this.field2568 == null) {
            return;
        }
        this.field2568.field2569 = this.field2569;
        this.field2569.field2568 = this.field2568;
        if (arg0 != -25741) {
            method1175(-58);
        }
        this.field2569 = null;
        this.field2568 = null;
    }

    @OriginalMember(owner = "client!gf", name = "g", descriptor = "(I)V")
    public static final void method1175(int arg0) {
        class185.field2952 = null;
        int var1 = 73 / ((arg0 - 7) / 40);
        class49.field842 = null;
        field2576++;
        class43.field656 = null;
        class73.field1283 = null;
        class297.field4859 = null;
        class289.field4758 = null;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(II)V")
    public static final void method1176(int arg0, int arg1) {
        if (arg0 == -27219) {
            field2574++;
            class196.field3156.method98(1, arg1);
            class162.field2633.method98(1, arg1);
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIIII)V")
    public static final void method1177(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class240.field4053 = arg1;
        if (arg0 != 0) {
            field2572 = -118;
        }
        class55.field972 = arg2;
        class23.field423 = arg3;
        class272.field4552 = arg4;
        field2575++;
    }

    @OriginalMember(owner = "client!gf", name = "h", descriptor = "(I)Z")
    public final boolean method1178(int arg0) {
        field2566++;
        if (this.field2568 == null) {
            return false;
        } else {
            int var2 = -37 / ((-arg0 - 28) / 45);
            return true;
        }
    }
}
