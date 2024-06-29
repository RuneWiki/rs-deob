import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lo")
public class class705 {

    @OriginalMember(owner = "client!lo", name = "h", descriptor = "Lpfa;")
    private class275 field9866;

    @OriginalMember(owner = "client!lo", name = "d", descriptor = "Lpfa;")
    private class275 field9862;

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "[F")
    public static float[] field9859 = new float[4];

    @OriginalMember(owner = "client!lo", name = "f", descriptor = "Ldga;")
    public static class195 field9864 = new class195();

    @OriginalMember(owner = "client!lo", name = "i", descriptor = "[I")
    public static int[] field9867 = new int[4096];

    @OriginalMember(owner = "client!lo", name = "b", descriptor = "I")
    public static int field9860;

    @OriginalMember(owner = "client!lo", name = "e", descriptor = "I")
    public static int field9863;

    @OriginalMember(owner = "client!lo", name = "g", descriptor = "I")
    public static int field9865;

    @OriginalMember(owner = "client!lo", name = "j", descriptor = "I")
    public static int field9868;

    @OriginalMember(owner = "client!lo", name = "c", descriptor = "Lih;")
    private class655 field9861;

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(B)Lih;")
    private final class655 method3889(byte arg0) {
        if (arg0 >= -9) {
            method3893((byte) -49, 36);
        }
        if (this.field9861 == null) {
            this.field9861 = new class655();
        }
        field9865++;
        return this.field9861;
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(Ljava/lang/String;B)V")
    public static final void method3890(String arg0, byte arg1) {
        class417.method2324("", "", "", arg0, 0, (byte) -95, 0);
        field9863++;
        if (arg1 != -110) {
            field9864 = null;
        }
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(Llba;I)Les;")
    public final class355 method3891(class515 arg0, int arg1) {
        field9860++;
        if (arg0 == null) {
            return null;
        }
        class216 var3 = arg0.method20((byte) -93);
        if (class653.field8904 == var3) {
            return new class80((class349) arg0);
        } else if (class435.field5476 == var3) {
            return new class64(this.method3889((byte) -27), (class6) arg0);
        } else if (class45.field613 == var3) {
            return new class203(this.field9862, (class268) arg0);
        } else if (class300.field3807 == var3) {
            return new class251(this.field9862, (class431) arg0);
        } else if (class256.field3285 == var3) {
            return new class376(this.field9862, this.field9866, (class406) arg0);
        } else if (class89.field1148 == var3) {
            return new class439(this.field9862, this.field9866, (class276) arg0);
        } else if (class146.field1748 == var3) {
            return new class446(this.field9862, this.field9866, (class410) arg0);
        } else {
            if (arg1 != 7) {
                method3892(39);
            }
            if (class677.field9226 == var3) {
                return new class639(this.field9862, this.field9866, (class398) arg0);
            } else if (class340.field4342 == var3) {
                return new class702(this.field9862, (class563) arg0);
            } else if (class613.field8335 == var3) {
                return new class111(this.field9862, this.field9866, (class334) arg0);
            } else {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(I)V")
    public static void method3892(int arg0) {
        field9859 = null;
        field9867 = null;
        field9864 = null;
        if (arg0 != 0) {
            method3890(null, (byte) -29);
        }
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(BI)Z")
    public static final boolean method3893(byte arg0, int arg1) {
        field9868++;
        if (arg0 == -45) {
            return arg1 == 7 || arg1 == 9;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!lo", name = "<init>", descriptor = "(Lpfa;Lpfa;)V")
    public class705(class275 arg0, class275 arg1) {
        this.field9866 = arg1;
        this.field9862 = arg0;
    }
}
