import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class365 {

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "[I")
    public int[] field5124;

    @OriginalMember(owner = "client!eh", name = "h", descriptor = "[[F")
    public float[][] field5130;

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "[I")
    public int[] field5125;

    @OriginalMember(owner = "client!eh", name = "e", descriptor = "[I")
    public int[] field5127;

    @OriginalMember(owner = "client!eh", name = "g", descriptor = "Z")
    public static boolean field5129 = false;

    @OriginalMember(owner = "client!eh", name = "f", descriptor = "I")
    public static int field5128 = 64;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "I")
    public static int field5123;

    @OriginalMember(owner = "client!eh", name = "d", descriptor = "[I")
    public static int[] field5126;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(ZI)V")
    public static final void method2160(boolean arg0, int arg1) {
        if (arg1 != 4734) {
            field5129 = true;
        }
        class156.field2382.method1712(class45.field585.method474());
        field5123++;
        int[] var2 = class45.field585.method469();
        class668.field9121 = var2[3];
        class100.field1275 = var2[1];
        class283.field3997 = var2[2];
        class399.field5572 = var2[0];
        if (arg0) {
            class45.field585.method445(class338.field4779, class733.field10154, class559.field7358, class649.field8628);
            class621.method3417((byte) -94, class425.field5855);
        } else {
            class45.field585.method445(class332.field4728, class264.field3683, class397.field5537, class1.field13);
            class621.method3417((byte) -115, class622.field8290);
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(B)V")
    public static void method2161(byte arg0) {
        field5126 = null;
        if (arg0 != -125) {
            field5128 = -61;
        }
    }

    @OriginalMember(owner = "client!eh", name = "<init>", descriptor = "([I[I[I[[F)V")
    public class365(int[] arg0, int[] arg1, int[] arg2, float[][] arg3) {
        this.field5124 = arg1;
        this.field5130 = arg3;
        this.field5125 = arg0;
        this.field5127 = arg2;
    }
}
