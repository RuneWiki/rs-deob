import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class204 extends class62 {

    @OriginalMember(owner = "client!vi", name = "F", descriptor = "I")
    public int field3489;

    @OriginalMember(owner = "client!vi", name = "D", descriptor = "I")
    private int field3487;

    @OriginalMember(owner = "client!vi", name = "z", descriptor = "[[I")
    public int[][] field3484;

    @OriginalMember(owner = "client!vi", name = "B", descriptor = "[Z")
    public boolean[] field3485;

    @OriginalMember(owner = "client!vi", name = "w", descriptor = "[I")
    public int[] field3481;

    @OriginalMember(owner = "client!vi", name = "v", descriptor = "Leg;")
    public static class37 field3480 = class174.method1167("(R", -24);

    @OriginalMember(owner = "client!vi", name = "y", descriptor = "Z")
    public static volatile boolean field3483 = false;

    @OriginalMember(owner = "client!vi", name = "E", descriptor = "Leg;")
    public static class37 field3488 = class174.method1167("null", -88);

    @OriginalMember(owner = "client!vi", name = "x", descriptor = "I")
    public static int field3482;

    @OriginalMember(owner = "client!vi", name = "C", descriptor = "I")
    public static int field3486;

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "(B)V")
    public static void method1419(byte arg0) {
        if (arg0 != -49) {
            method1419((byte) -58);
        }
        field3488 = null;
        field3480 = null;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(ZIII)V")
    public static final void method1420(boolean arg0, int arg1, int arg2, int arg3) {
        field3486++;
        if (arg1 < 8000 || arg1 > 48000) {
            throw new IllegalArgumentException();
        }
        class115.field1948 = arg3;
        class225.field3868 = arg0;
        if (arg2 == 23288) {
            class215.field3720 = arg1;
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(IB)V")
    public static final void method1421(int arg0, byte arg1) {
        field3482++;
        if (arg1 != 42) {
            method1420(false, 64, -45, -8);
        }
        class100 var2 = (class100) class166.field2750.method992((byte) 125, (long) arg0);
        if (var2 != null) {
            var2.method441(16773377);
        }
    }

    @OriginalMember(owner = "client!vi", name = "<init>", descriptor = "(I[B)V")
    public class204(int arg0, byte[] arg1) {
        this.field3489 = arg0;
        class187 var3 = new class187(arg1);
        this.field3487 = var3.method1268(255);
        this.field3484 = new int[this.field3487][];
        this.field3485 = new boolean[this.field3487];
        this.field3481 = new int[this.field3487];
        for (int var4 = 0; var4 < this.field3487; var4++) {
            this.field3481[var4] = var3.method1268(255);
        }
        for (int var5 = 0; var5 < this.field3487; var5++) {
            this.field3485[var5] = var3.method1268(255) == 1;
        }
        for (int var6 = 0; var6 < this.field3487; var6++) {
            this.field3484[var6] = new int[var3.method1268(255)];
        }
        for (int var7 = 0; var7 < this.field3487; var7++) {
            for (int var8 = 0; var8 < this.field3484[var7].length; var8++) {
                this.field3484[var7][var8] = var3.method1268(255);
            }
        }
    }
}
