import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sv")
public class class688 extends class437 {

    @OriginalMember(owner = "client!sv", name = "y", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field9681;

    @OriginalMember(owner = "client!sv", name = "w", descriptor = "[I")
    public static int[] field9679 = new int[200];

    @OriginalMember(owner = "client!sv", name = "q", descriptor = "Z")
    public static boolean field9673 = false;

    @OriginalMember(owner = "client!sv", name = "v", descriptor = "I")
    public static int field9678 = 0;

    @OriginalMember(owner = "client!sv", name = "r", descriptor = "Ltja;")
    public static class288 field9674 = new class288(8, 2);

    @OriginalMember(owner = "client!sv", name = "A", descriptor = "Z")
    public static boolean field9683 = false;

    @OriginalMember(owner = "client!sv", name = "s", descriptor = "I")
    public static int field9675;

    @OriginalMember(owner = "client!sv", name = "t", descriptor = "I")
    public static int field9676;

    @OriginalMember(owner = "client!sv", name = "x", descriptor = "I")
    public static int field9680;

    @OriginalMember(owner = "client!sv", name = "z", descriptor = "I")
    public static int field9682;

    @OriginalMember(owner = "client!sv", name = "u", descriptor = "[Lvr;")
    public static class147[] field9677;

    @OriginalMember(owner = "client!sv", name = "e", descriptor = "(B)V", line = 3)
    public static void method3819(byte arg0) {
        field9674 = null;
        field9679 = null;
        field9677 = null;
        if (arg0 >= -96) {
            field9683 = false;
        }
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(I)V", line = 17)
    public final void method3820(int arg0) {
        field9680++;
        if (arg0 != -28982) {
            field9678 = -70;
        }
        this.field9681.method3915();
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(BZ)Z", line = 36)
    public static final boolean method3821(byte arg0, boolean arg1) {
        field9682++;
        boolean var2 = class379.field5542.method461();
        int var3 = -47 % ((-arg0 - 85) / 32);
        if (arg1 == var2) {
            return true;
        }
        if (!arg1) {
            class379.field5542.method503();
        } else if (!class379.field5542.method560()) {
            arg1 = false;
        }
        if (arg1 == var2) {
            return false;
        } else {
            class712.field9959.method735(arg1 ? 1 : 0, class712.field9959.field1312, 76);
            class617.method3389(false);
            return true;
        }
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(IIILjava/lang/Class;)V", line = 80)
    public static final void method3822(int arg0, int arg1, int arg2, Class arg3) {
        class243 var4 = class626.field8501[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        for (class48 var5 = var4.field3272; var5 != null; var5 = var5.field726) {
            class319 var6 = var5.field725;
            if (arg3.isAssignableFrom(var6.getClass()) && var6.field4600 == arg1 && var6.field4590 == arg2) {
                class3.method10(var6, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!sv", name = "<init>", descriptor = "(I)V", line = 112)
    public class688(int arg0) {
        this.field9681 = new NativeHeap(arg0);
    }
}
