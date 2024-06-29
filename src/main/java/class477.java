import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public abstract class class477 extends class487 {

    @OriginalMember(owner = "client!dk", name = "d", descriptor = "I")
    public int field6357;

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "I")
    public int field6355;

    @OriginalMember(owner = "client!dk", name = "h", descriptor = "I")
    public int field6361;

    @OriginalMember(owner = "client!dk", name = "f", descriptor = "I")
    public int field6359;

    @OriginalMember(owner = "client!dk", name = "e", descriptor = "Ldb;")
    public static class298 field6358 = new class298(72, 6);

    @OriginalMember(owner = "client!dk", name = "c", descriptor = "I")
    public static int field6356;

    @OriginalMember(owner = "client!dk", name = "g", descriptor = "I")
    public static int field6360;

    @OriginalMember(owner = "client!dk", name = "i", descriptor = "[[[B")
    public static byte[][][] field6362;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(Lgba;II)Ljava/lang/String;", line = 3)
    public static final String method2673(class625 arg0, int arg1, int arg2) {
        field6356++;
        if (!client.method1701(arg0).method349(-82, arg2) && arg0.field8413 == null) {
            return null;
        } else if (arg0.field8313 == null || arg0.field8313.length <= arg2 || arg0.field8313[arg2] == null || arg0.field8313[arg2].trim().length() == 0) {
            return class295.field4171 ? "Hidden-" + arg2 : null;
        } else {
            int var3 = -9 / ((-arg1 - 48) / 55);
            return arg0.field8313[arg2];
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(II)Z", line = 26)
    public static final boolean method2674(int arg0, int arg1) {
        field6360++;
        if (arg0 != -9) {
            method2675((byte) -95);
        }
        return arg1 >= 4 && arg1 <= 8;
    }

    @OriginalMember(owner = "client!dk", name = "e", descriptor = "(B)V", line = 44)
    public static void method2675(byte arg0) {
        field6362 = null;
        if (arg0 < -27) {
            field6358 = null;
        }
    }

    @OriginalMember(owner = "client!dk", name = "<init>", descriptor = "(IIII)V", line = 57)
    public class477(int arg0, int arg1, int arg2, int arg3) {
        this.field6357 = arg3;
        this.field6355 = arg1;
        this.field6361 = arg2;
        this.field6359 = arg0;
    }
}
