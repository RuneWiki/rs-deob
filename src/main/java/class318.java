import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class318 extends class66 {

    @OriginalMember(owner = "client!sc", name = "A", descriptor = "[I")
    public static int[] field4992 = new int[2048];

    @OriginalMember(owner = "client!sc", name = "r", descriptor = "I")
    public static int field4983;

    @OriginalMember(owner = "client!sc", name = "v", descriptor = "I")
    public static int field4987;

    @OriginalMember(owner = "client!sc", name = "w", descriptor = "I")
    public int field4988;

    @OriginalMember(owner = "client!sc", name = "y", descriptor = "I")
    public int field4990;

    @OriginalMember(owner = "client!sc", name = "t", descriptor = "J")
    public static long field4985;

    @OriginalMember(owner = "client!sc", name = "u", descriptor = "Lri;")
    public static class97 field4986;

    @OriginalMember(owner = "client!sc", name = "q", descriptor = "[I")
    public int[] field4982;

    @OriginalMember(owner = "client!sc", name = "z", descriptor = "[I")
    public int[] field4991;

    @OriginalMember(owner = "client!sc", name = "B", descriptor = "[I")
    public int[] field4993;

    @OriginalMember(owner = "client!sc", name = "x", descriptor = "[Lsw;")
    public class701[] field4989;

    @OriginalMember(owner = "client!sc", name = "C", descriptor = "[Lsw;")
    public class701[] field4994;

    @OriginalMember(owner = "client!sc", name = "s", descriptor = "[[[B")
    public byte[][][] field4984;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)V", line = 3)
    public static final void method2166(int arg0) {
        field4987++;
        class49 var1 = class567.field8140;
        synchronized (class567.field8140) {
            if (arg0 != 2048) {
                return;
            }
            class567.field8140.method563(0);
        }
        class49 var2 = class393.field6137;
        synchronized (class393.field6137) {
            class393.field6137.method563(0);
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(B)V", line = 22)
    public static void method2167(byte arg0) {
        field4986 = null;
        field4992 = null;
        if (arg0 > -6) {
            field4986 = null;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(BLpca;Z)V", line = 39)
    public static final void method2168(byte arg0, class665 arg1, boolean arg2) {
        field4983++;
        if (arg0 <= 102) {
            return;
        }
        int var3 = arg1.field9318 == 0 ? arg1.field9411 : arg1.field9318;
        int var4 = arg1.field9260 == 0 ? arg1.field9282 : arg1.field9260;
        class611.method3560(var3, var4, arg1.field9400, arg2, false, class564.field8105[arg1.field9400 >> 16]);
        if (arg1.field9296 != null) {
            class611.method3560(var3, var4, arg1.field9400, arg2, false, arg1.field9296);
        }
        class102 var5 = (class102) class486.field7115.method1558((long) arg1.field9400, (byte) -93);
        if (var5 != null) {
            class428.method2707(var3, arg2, var5.field1687, var4, -1);
        }
    }
}
