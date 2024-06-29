import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iaa")
public class class458 extends class184 implements class388 {

    @OriginalMember(owner = "client!iaa", name = "A", descriptor = "[I")
    public static int[] field6351 = new int[16];

    @OriginalMember(owner = "client!iaa", name = "z", descriptor = "Llh;")
    public static class487 field6350 = new class487(10, 7);

    @OriginalMember(owner = "client!iaa", name = "B", descriptor = "I")
    public static int field6352;

    @OriginalMember(owner = "client!iaa", name = "<init>", descriptor = "(Ltba;IZ[[I)V", line = 8)
    public class458(class147 arg0, int arg1, boolean arg2, int[][] arg3) {
        super(arg0, 34067, class129.field1851, class309.field4271, arg1 * arg1 * 6, arg2);
        super.field2672.method2241(this, (byte) 44);
        if (!arg2) {
            for (int var5 = 0; var5 < 6; ++var5) {
                OpenGL.glTexImage2Di(var5 + 34069, 0, this.method1262(-121), arg1, arg1, 0, class216.method1395(super.field2651, (byte) -101), super.field2672.field2176, arg3[var5], 0);
            }
        } else {
            for (int var6 = 0; var6 < 6; ++var6) {
                this.method1264(34069 - -var6, arg1, arg1, true, arg3[var6]);
            }
        }
    }

    @OriginalMember(owner = "client!iaa", name = "d", descriptor = "(B)V", line = 43)
    public static void method2610(byte arg0) {
        field6351 = null;
        field6350 = null;
        if (arg0 >= -28) {
            method2610((byte) 67);
        }
    }
}
