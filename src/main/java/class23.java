import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qia")
public abstract class class23 {

    @OriginalMember(owner = "client!qia", name = "a", descriptor = "[I")
    public static int[] field231 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

    @OriginalMember(owner = "client!qia", name = "b", descriptor = "I")
    public static int field232 = 0;

    @OriginalMember(owner = "client!qia", name = "e", descriptor = "[I")
    public static int[] field235 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!qia", name = "g", descriptor = "[I")
    public static int[] field237 = new int[2];

    @OriginalMember(owner = "client!qia", name = "c", descriptor = "I")
    public static int field233;

    @OriginalMember(owner = "client!qia", name = "d", descriptor = "I")
    public static int field234;

    @OriginalMember(owner = "client!qia", name = "f", descriptor = "I")
    public static int field236;

    @OriginalMember(owner = "client!qia", name = "a", descriptor = "(BI)Z")
    public abstract boolean method133(byte arg0, int arg1) throws IOException;

    @OriginalMember(owner = "client!qia", name = "a", descriptor = "(B)V")
    public static final void method134(byte arg0) {
        for (class116 var1 = (class116) class138.field1861.method1249((byte) -104); var1 != null; var1 = (class116) class138.field1861.method1246(true)) {
            class384.method2389(0, var1.field1563);
        }
        int var2 = -21 % ((arg0 - 13) / 46);
        field233++;
    }

    @OriginalMember(owner = "client!qia", name = "a", descriptor = "(BI[BI)I")
    public abstract int method135(byte arg0, int arg1, byte[] arg2, int arg3) throws IOException;

    @OriginalMember(owner = "client!qia", name = "a", descriptor = "(I)V")
    public abstract void method136(int arg0);

    @OriginalMember(owner = "client!qia", name = "a", descriptor = "(IB[BI)V")
    public abstract void method137(int arg0, byte arg1, byte[] arg2, int arg3) throws IOException;

    @OriginalMember(owner = "client!qia", name = "b", descriptor = "(I)V")
    public abstract void method138(int arg0);

    @OriginalMember(owner = "client!qia", name = "c", descriptor = "(I)V")
    public static final void method139(int arg0) {
        if (arg0 < 63) {
            return;
        }
        for (int var1 = 0; var1 < class328.field4667.length; var1++) {
            for (int var2 = 0; var2 < class328.field4667[0].length; var2++) {
                for (int var3 = 0; var3 < class328.field4667[0][0].length; var3++) {
                    class328.field4667[var1][var2][var3] = 0;
                }
            }
        }
        field236++;
    }

    @OriginalMember(owner = "client!qia", name = "d", descriptor = "(I)V")
    public static void method140(int arg0) {
        field235 = null;
        if (arg0 != -28996) {
            field237 = null;
        }
        field237 = null;
        field231 = null;
    }
}
