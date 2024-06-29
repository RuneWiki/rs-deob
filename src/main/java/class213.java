import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class213 {

    @OriginalMember(owner = "client!gg", name = "f", descriptor = "Lad;")
    private class11 field2730 = new class11(64);

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "Ldn;")
    private class201 field2725;

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "I")
    public int field2726;

    @OriginalMember(owner = "client!gg", name = "d", descriptor = "[I")
    public static int[] field2728 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!gg", name = "e", descriptor = "[Lsg;")
    public static class321[] field2729 = new class321[6];

    @OriginalMember(owner = "client!gg", name = "g", descriptor = "[F")
    public static float[] field2731 = new float[4];

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "I")
    public static int field2727;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(I)V", line = 3)
    public static void method1360(int arg0) {
        field2728 = null;
        field2731 = null;
        field2729 = null;
        int var1 = -25 / ((8 - arg0) / 56);
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(BI)Lra;", line = 33)
    public final class203 method1361(byte arg0, int arg1) {
        if (arg0 != 93) {
            return null;
        }
        field2727++;
        class11 var3 = this.field2730;
        class203 var4;
        synchronized (this.field2730) {
            var4 = (class203) this.field2730.method78((long) arg1, (byte) -102);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field2725.method1313((byte) -111, 19, arg1);
        class203 var6 = new class203();
        if (var5 != null) {
            var6.method1333(new class88(var5), (byte) -94);
        }
        class11 var7 = this.field2730;
        synchronized (this.field2730) {
            this.field2730.method88((long) arg1, arg0 ^ 0xE, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!gg", name = "<init>", descriptor = "(Lgt;ILdn;)V", line = 63)
    public class213(class65 arg0, int arg1, class201 arg2) {
        this.field2725 = arg2;
        this.field2726 = this.field2725.method1302(-75, 19);
    }
}
