import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dt")
public class class226 extends class300 implements class105 {

    @OriginalMember(owner = "client!dt", name = "y", descriptor = "Lvf;")
    public static class141 field2915 = new class141(1, 2, 2, 0);

    @OriginalMember(owner = "client!dt", name = "B", descriptor = "I")
    public static int field2918 = -1;

    @OriginalMember(owner = "client!dt", name = "C", descriptor = "F")
    public static float field2919;

    @OriginalMember(owner = "client!dt", name = "z", descriptor = "I")
    public static int field2916;

    @OriginalMember(owner = "client!dt", name = "A", descriptor = "I")
    public static int field2917;

    @OriginalMember(owner = "client!dt", name = "D", descriptor = "Lpfa;")
    public static class275 field2920;

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(B)V", line = 4)
    public static void method1365(byte arg0) {
        field2920 = null;
        field2915 = null;
        if (arg0 != 76) {
            field2915 = null;
        }
    }

    @OriginalMember(owner = "client!dt", name = "<init>", descriptor = "(Lel;IZ[[I)V", line = 15)
    public class226(class513 arg0, int arg1, boolean arg2, int[][] arg3) {
        super(arg0, 34067, class556.field6946, class100.field1288, arg1 * 6 * arg1, arg2);
        super.field3828.method1349(this, false);
        if (arg2) {
            for (int var5 = 0; var5 < 6; ++var5) {
                this.method1792(1, arg1, 34069 - -var5, arg3[var5], arg1);
            }
        } else {
            for (int var6 = 0; ~var6 > -7; ++var6) {
                OpenGL.glTexImage2Di(var6 + 34069, 0, this.method1787(90), arg1, arg1, 0, class237.method1429(super.field3827, 1002608112), super.field3828.field6530, arg3[var6], 0);
            }
        }
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(IIB)Z", line = 71)
    public static final boolean method1366(int arg0, int arg1, byte arg2) {
        if (arg2 >= -34) {
            return false;
        } else {
            ++field2917;
            return ~(arg1 & 2048) != -1;
        }
    }
}
