import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dr")
public class class515 extends class114 {

    @OriginalMember(owner = "client!dr", name = "C", descriptor = "I")
    public static int field7566 = 0;

    @OriginalMember(owner = "client!dr", name = "v", descriptor = "Lni;")
    public static class367 field7559 = new class367(10, 3);

    @OriginalMember(owner = "client!dr", name = "D", descriptor = "Lwi;")
    public static class330 field7567 = new class330(20);

    @OriginalMember(owner = "client!dr", name = "t", descriptor = "I")
    public static int field7557;

    @OriginalMember(owner = "client!dr", name = "u", descriptor = "I")
    public static int field7558;

    @OriginalMember(owner = "client!dr", name = "w", descriptor = "I")
    public static int field7560;

    @OriginalMember(owner = "client!dr", name = "x", descriptor = "I")
    public static int field7561;

    @OriginalMember(owner = "client!dr", name = "y", descriptor = "I")
    public static int field7562;

    @OriginalMember(owner = "client!dr", name = "z", descriptor = "I")
    public static int field7563;

    @OriginalMember(owner = "client!dr", name = "B", descriptor = "I")
    public static int field7565;

    @OriginalMember(owner = "client!dr", name = "F", descriptor = "J")
    public static long field7569;

    @OriginalMember(owner = "client!dr", name = "A", descriptor = "Llp;")
    private class272 field7564;

    @OriginalMember(owner = "client!dr", name = "E", descriptor = "[[Lee;")
    public static class486[][] field7568;

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(Lqq;[[BB)V")
    public static final void method3071(class337 arg0, byte[][] arg1, byte arg2) {
        field7565++;
        int var3 = class510.field7488.length;
        if (arg2 != 63) {
            method3071(null, null, (byte) -29);
        }
        for (int var4 = 0; var4 < var3; var4++) {
            byte[] var5 = arg1[var4];
            if (var5 != null) {
                int var6 = (class510.field7490[var4] >> 8) * 64 - class331.field5162;
                int var7 = (class510.field7490[var4] & 0xFF) * 64 - class328.field5099;
                class523.method3104((byte) -1);
                arg0.method2177(var6, class400.field6090, (byte) -128, var5, class9.field174, var7);
            }
        }
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(IIB)I")
    public final int method3072(int arg0, int arg1, byte arg2) {
        field7561++;
        if (this.field7564 == null) {
            return arg0;
        }
        if (arg2 > -120) {
            this.method3073(-111, null);
        }
        class160 var4 = (class160) this.field7564.method1747((long) arg1, false);
        return var4 == null ? arg0 : var4.field2088;
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(ILnj;)V")
    public final void method3073(int arg0, class164 arg1) {
        field7562++;
        if (arg0 != 3) {
            method3077((byte) 17);
        }
        while (true) {
            int var3 = arg1.method1087(false);
            if (var3 == 0) {
                return;
            }
            this.method3074(arg1, -11982, var3);
        }
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(Lnj;II)V")
    private final void method3074(class164 arg0, int arg1, int arg2) {
        field7558++;
        if (arg1 != -11982 || arg2 != 249) {
            return;
        }
        int var4 = arg0.method1087(false);
        if (this.field7564 == null) {
            int var5 = class475.method2835(var4, arg1 ^ 0x2ECD);
            this.field7564 = new class272(var5);
        }
        for (int var6 = 0; var6 < var4; var6++) {
            boolean var7 = arg0.method1087(false) == 1;
            int var8 = arg0.method1090(-1);
            class5 var9;
            if (var7) {
                var9 = new class344(arg0.method1064(false));
            } else {
                var9 = new class160(arg0.method1099(-113));
            }
            this.field7564.method1751((long) var8, -124, var9);
        }
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(IB)V")
    public static final void method3075(int arg0, byte arg1) {
        class439.field6616 = -1;
        class84.field1223 = 3;
        field7557++;
        if (arg1 > 96) {
            class150.field1970 = 100;
            class390.field5956 = arg0;
        }
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(Ljava/lang/String;II)Ljava/lang/String;")
    public final String method3076(String arg0, int arg1, int arg2) {
        field7563++;
        if (this.field7564 == null) {
            return arg0;
        }
        class344 var4 = (class344) this.field7564.method1747((long) arg2, false);
        if (var4 == null) {
            return arg0;
        } else {
            if (arg1 != 18390) {
                this.method3074(null, -110, 33);
            }
            return var4.field5312;
        }
    }

    @OriginalMember(owner = "client!dr", name = "b", descriptor = "(B)V")
    public static void method3077(byte arg0) {
        if (arg0 == 126) {
            field7567 = null;
            field7568 = null;
            field7559 = null;
        }
    }
}
