import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class446 {

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "[F")
    public static float[] field6085 = new float[16];

    @OriginalMember(owner = "client!ad", name = "f", descriptor = "Z")
    public static boolean field6088 = false;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "I")
    public static int field6083;

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "I")
    public static int field6084;

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "I")
    public static int field6086;

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "I")
    public static int field6087;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(II)V")
    public static final void method2660(int arg0, int arg1) {
        field6084++;
        if (!class217.method1490(arg0, -1) || arg1 != 1) {
            return;
        }
        class451[] var2 = class787.field10812[arg0];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class451 var4 = var2[var3];
            if (var4 != null) {
                var4.field6228 = 1;
                var4.field6324 = 0;
                var4.field6339 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!ad", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field6086++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(II)I")
    public static final int method2661(int arg0, int arg1) {
        field6083++;
        if (arg1 == 16711935) {
            return -1;
        } else {
            if (arg0 != -18523) {
                method2662(-80);
            }
            return class306.method1978(arg1, (byte) 64);
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)V")
    public static void method2662(int arg0) {
        if (arg0 != 16711935) {
            method2661(120, 75);
        }
        field6085 = null;
    }
}
