import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pv")
public class class663 implements class86 {

    @OriginalMember(owner = "client!pv", name = "l", descriptor = "Lsa;")
    private class203 field9474;

    @OriginalMember(owner = "client!pv", name = "f", descriptor = "I")
    public int field9468;

    @OriginalMember(owner = "client!pv", name = "b", descriptor = "I")
    public int field9464;

    @OriginalMember(owner = "client!pv", name = "d", descriptor = "[I")
    public int[] field9466;

    @OriginalMember(owner = "client!pv", name = "e", descriptor = "Lqga;")
    private class193 field9467;

    @OriginalMember(owner = "client!pv", name = "j", descriptor = "[F")
    public float[] field9472;

    @OriginalMember(owner = "client!pv", name = "h", descriptor = "I")
    public static int field9470 = 0;

    @OriginalMember(owner = "client!pv", name = "g", descriptor = "Lufa;")
    public static class740 field9469 = new class740(2, 16);

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "I")
    public static int field9463;

    @OriginalMember(owner = "client!pv", name = "c", descriptor = "I")
    public static int field9465;

    @OriginalMember(owner = "client!pv", name = "i", descriptor = "I")
    public static int field9471;

    @OriginalMember(owner = "client!pv", name = "k", descriptor = "I")
    public static int field9473;

    @OriginalMember(owner = "client!pv", name = "n", descriptor = "I")
    public static int field9476;

    @OriginalMember(owner = "client!pv", name = "m", descriptor = "[Ltd;")
    public static class515[] field9475;

    @OriginalMember(owner = "client!pv", name = "b", descriptor = "(IIIIIIZZ)V", line = 3)
    public final void method687(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7) {
        class617.method3585(arg3, arg5, arg7 ? this.field9474.field3042 : null, this.field9466, 0, this.field9474.field3010.field10016, this.field9464, arg6 ? this.field9474.field3010.field10015 : null, arg2, arg7 ? this.field9472 : null, arg0, arg1, arg4);
        field9471++;
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(I)V", line = 11)
    public static void method3776(int arg0) {
        field9469 = null;
        field9475 = null;
        if (arg0 != -15891) {
            method3777(-99, (byte) -83);
        }
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(IIIIIIZZ)V", line = 22)
    public final void method686(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7) {
        class617.method3585(arg3, arg5, arg7 ? this.field9472 : null, this.field9474.field3010.field10015, 0, this.field9464, this.field9474.field3010.field10016, arg6 ? this.field9466 : null, arg2, arg7 ? this.field9474.field3042 : null, arg0, arg1, arg4);
        field9463++;
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(IB)I", line = 44)
    public static final int method3777(int arg0, byte arg1) {
        field9465++;
        int var2 = 77 / ((arg1 - 52) / 50);
        if (arg0 == 6406) {
            return 1;
        } else if (arg0 == 6409) {
            return 1;
        } else if (arg0 == 32841) {
            return 1;
        } else if (arg0 == 6410) {
            return 2;
        } else if (arg0 == 6407) {
            return 3;
        } else if (arg0 == 6408) {
            return 4;
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(B)V", line = 79)
    public static final void method3778(byte arg0) {
        if (arg0 != -117) {
            method3777(-43, (byte) -94);
        }
        field9473++;
        if (class25.field223 != class246.field3590) {
            try {
                class665.method3803(class660.field9437, "tbrefresh", (byte) 80);
            } catch (Throwable var1) {
            }
        }
    }

    @OriginalMember(owner = "client!pv", name = "<init>", descriptor = "(Lsa;Ltd;Lqga;)V", line = 103)
    public class663(class203 arg0, class515 arg1, class193 arg2) {
        this.field9474 = arg0;
        if (arg1 instanceof class722) {
            class722 var4 = (class722) arg1;
            this.field9468 = var4.field1524;
            this.field9464 = var4.field1517;
            this.field9466 = var4.field10157;
        } else if ((arg1 instanceof class110)) {
            class110 var5 = (class110) arg1;
            this.field9468 = var5.field1524;
            this.field9464 = var5.field1517;
            this.field9466 = var5.field1569;
        } else {
            throw new RuntimeException();
        }
        if (arg2 != null) {
            this.field9467 = arg2;
            if (this.field9467.field2829 != this.field9464 || this.field9467.field2832 != this.field9468) {
                throw new RuntimeException();
            }
            this.field9472 = this.field9467.field2834;
        }
    }
}
