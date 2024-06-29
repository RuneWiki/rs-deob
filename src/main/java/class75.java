import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class75 {

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "Lvh;")
    private class328 field1029 = new class328(64);

    @OriginalMember(owner = "client!rf", name = "k", descriptor = "Lvh;")
    public class328 field1038 = new class328(64);

    @OriginalMember(owner = "client!rf", name = "j", descriptor = "Lpj;")
    public class132 field1037;

    @OriginalMember(owner = "client!rf", name = "f", descriptor = "Lpj;")
    private class132 field1033;

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "[F")
    public static float[] field1030 = new float[16384];

    @OriginalMember(owner = "client!rf", name = "l", descriptor = "[F")
    public static float[] field1039 = new float[16384];

    @OriginalMember(owner = "client!rf", name = "n", descriptor = "F")
    public static float field1041;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "I")
    public static int field1028;

    @OriginalMember(owner = "client!rf", name = "d", descriptor = "I")
    public static int field1031;

    @OriginalMember(owner = "client!rf", name = "e", descriptor = "I")
    public static int field1032;

    @OriginalMember(owner = "client!rf", name = "g", descriptor = "I")
    public static int field1034;

    @OriginalMember(owner = "client!rf", name = "h", descriptor = "I")
    public static int field1035;

    @OriginalMember(owner = "client!rf", name = "i", descriptor = "I")
    public static int field1036;

    @OriginalMember(owner = "client!rf", name = "m", descriptor = "Lq;")
    public static class391 field1040;

    @OriginalMember(owner = "client!rf", name = "o", descriptor = "[I")
    public static int[] field1042;

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field1039[var2] = (float) Math.sin((double) var2 * var0);
            field1030[var2] = (float) Math.cos((double) var2 * var0);
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Z)V", line = 5)
    public final void method594(boolean arg0) {
        field1031++;
        if (!arg0) {
            this.method595((byte) -81);
        }
        class328 var2 = this.field1029;
        synchronized (this.field1029) {
            this.field1029.method1987(-31085);
        }
        class328 var3 = this.field1038;
        synchronized (this.field1038) {
            this.field1038.method1987(-31085);
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(B)V", line = 27)
    public final void method595(byte arg0) {
        field1036++;
        class328 var2 = this.field1029;
        synchronized (this.field1029) {
            this.field1029.method1997(1);
        }
        class328 var3 = this.field1038;
        synchronized (this.field1038) {
            this.field1038.method1997(1);
        }
        if (arg0 < 94) {
            field1040 = null;
        }
    }

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "(B)V", line = 48)
    public static void method596(byte arg0) {
        field1040 = null;
        field1039 = null;
        field1042 = null;
        if (arg0 != -29) {
            field1042 = null;
        }
        field1030 = null;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IIB)V", line = 63)
    public final void method597(int arg0, int arg1, byte arg2) {
        if (arg2 <= -117) {
            this.field1029 = new class328(arg0);
            field1035++;
            this.field1038 = new class328(arg1);
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IB)Z", line = 76)
    public static final boolean method598(int arg0, byte arg1) {
        field1034++;
        int var2 = 34 / ((arg1 - 23) / 57);
        return arg0 >= 4 && arg0 <= 8;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(II)V", line = 87)
    public final void method599(int arg0, int arg1) {
        if (arg0 <= 98) {
            return;
        }
        class328 var3 = this.field1029;
        synchronized (this.field1029) {
            this.field1029.method1989(arg1, (byte) 126);
        }
        field1032++;
        class328 var4 = this.field1038;
        synchronized (this.field1038) {
            this.field1038.method1989(arg1, (byte) 98);
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IZ)Ljm;", line = 108)
    public final class633 method600(int arg0, boolean arg1) {
        field1028++;
        class328 var3 = this.field1029;
        class633 var4;
        synchronized (this.field1029) {
            var4 = (class633) this.field1029.method1986((byte) -127, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class132 var5 = this.field1033;
        byte[] var7;
        synchronized (this.field1033) {
            if (!arg1) {
                return null;
            }
            var7 = this.field1033.method940(34, arg0, 0);
        }
        class633 var8 = new class633();
        var8.field8860 = this;
        if (var7 != null) {
            var8.method3517(new class96(var7), 29452);
        }
        class328 var9 = this.field1029;
        synchronized (this.field1029) {
            this.field1029.method1985(var8, (long) arg0, (byte) -102);
            return var8;
        }
    }

    @OriginalMember(owner = "client!rf", name = "<init>", descriptor = "(Ldd;ILpj;Lpj;)V", line = 172)
    public class75(class647 arg0, int arg1, class132 arg2, class132 arg3) {
        this.field1037 = arg3;
        this.field1033 = arg2;
        this.field1033.method936(34, -120);
    }
}
