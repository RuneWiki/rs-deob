import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nr")
public class class142 extends class163 implements class628 {

    @OriginalMember(owner = "client!nr", name = "w", descriptor = "Luaa;")
    public static class395 field2216 = new class395(4);

    @OriginalMember(owner = "client!nr", name = "x", descriptor = "I")
    public static int field2217 = 0;

    @OriginalMember(owner = "client!nr", name = "u", descriptor = "I")
    public static int field2214;

    @OriginalMember(owner = "client!nr", name = "y", descriptor = "Lm;")
    public static class105 field2218;

    @OriginalMember(owner = "client!nr", name = "v", descriptor = "[I")
    public static int[] field2215;

    @OriginalMember(owner = "client!nr", name = "z", descriptor = "[I")
    public static int[] field2219;

    @OriginalMember(owner = "client!nr", name = "<init>", descriptor = "(Llh;IZ[[I)V")
    public class142(class125 arg0, int arg1, boolean arg2, int[][] arg3) {
        super(arg0, 34067, class85.field1472, class343.field4922, arg1 * 6 * arg1, arg2);
        super.field2405.method3577(this, true);
        if (!arg2) {
            for (int var5 = 0; var5 < 6; ++var5) {
                OpenGL.glTexImage2Di(var5 + 34069, 0, this.method1140((byte) 122), arg1, arg1, 0, class387.method2348(super.field2417, (byte) -116), super.field2405.field2064, arg3[var5], 0);
            }
        } else {
            for (int var6 = 0; ~var6 > -7; ++var6) {
                this.method1141(arg1, arg1, 34069 - -var6, 23292, arg3[var6]);
            }
        }
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(IBI)Z")
    public static final boolean method1054(int arg0, byte arg1, int arg2) {
        int var3 = 45 / ((-18 - arg1) / 43);
        ++field2214;
        return ~(arg0 & 1024) != -1;
    }

    @OriginalMember(owner = "client!nr", name = "c", descriptor = "(B)V")
    public static void method1055(byte arg0) {
        field2218 = null;
        if (arg0 != -111) {
            method1054(-78, (byte) 85, 9);
        }
        field2216 = null;
        field2219 = null;
        field2215 = null;
    }
}
