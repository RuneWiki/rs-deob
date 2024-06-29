import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bea")
public class class234 {

    @OriginalMember(owner = "client!bea", name = "d", descriptor = "[Ljava/lang/String;")
    private String[] field3517 = new String[0];

    @OriginalMember(owner = "client!bea", name = "j", descriptor = "I")
    private int field3523 = -1;

    @OriginalMember(owner = "client!bea", name = "n", descriptor = "Z")
    private boolean field3527 = false;

    @OriginalMember(owner = "client!bea", name = "f", descriptor = "I")
    private int field3519;

    @OriginalMember(owner = "client!bea", name = "b", descriptor = "[I")
    public static int[] field3515 = new int[] { 2047, 16383, 65535 };

    @OriginalMember(owner = "client!bea", name = "e", descriptor = "I")
    public static int field3518 = 0;

    @OriginalMember(owner = "client!bea", name = "c", descriptor = "Lbu;")
    public static class21 field3516 = new class21(123, 6);

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "I")
    public static int field3514;

    @OriginalMember(owner = "client!bea", name = "g", descriptor = "I")
    public static int field3520;

    @OriginalMember(owner = "client!bea", name = "h", descriptor = "I")
    public static int field3521;

    @OriginalMember(owner = "client!bea", name = "i", descriptor = "I")
    public static int field3522;

    @OriginalMember(owner = "client!bea", name = "k", descriptor = "I")
    public static int field3524;

    @OriginalMember(owner = "client!bea", name = "l", descriptor = "I")
    public static int field3525;

    @OriginalMember(owner = "client!bea", name = "m", descriptor = "I")
    public static int field3526;

    @OriginalMember(owner = "client!bea", name = "o", descriptor = "I")
    public static int field3528;

    @OriginalMember(owner = "client!bea", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field3522++;
        StringBuffer var1 = new StringBuffer();
        var1.append("[");
        for (int var2 = 0; var2 < this.field3523; var2++) {
            if (var2 != 0) {
                var1.append(", ");
            }
            var1.append(this.field3517[var2]);
        }
        var1.append("]");
        return var1.toString();
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(Z)V")
    public static void method1566(boolean arg0) {
        field3516 = null;
        if (arg0) {
            method1566(true);
        }
        field3515 = null;
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(I)[Ljava/lang/String;")
    public final String[] method1567(int arg0) {
        field3525++;
        String[] var2 = new String[this.field3523 + 1];
        if (arg0 <= 3) {
            this.method1570((byte) 80, null, 27);
        }
        class595.method3472(this.field3517, 0, var2, 0, this.field3523 + 1);
        return var2;
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(IZ)V")
    public static final void method1568(int arg0, boolean arg1) {
        field3520++;
        if (class46.field578.length() == 0) {
            return;
        }
        class587.method3423("--> " + class46.field578, -112);
        class90.method675(class46.field578, 6, arg1, false);
        if (arg0 >= -127) {
            method1566(false);
        }
        class148.field2135 = 0;
        class46.field578 = "";
        class284.field4199 = 0;
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public final void method1569(String arg0, int arg1) {
        field3514++;
        this.method1570((byte) -99, arg0, this.field3523 + arg1);
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(BLjava/lang/String;I)V")
    private final void method1570(byte arg0, String arg1, int arg2) {
        field3524++;
        if (arg2 > this.field3523) {
            this.field3523 = arg2;
        }
        if (arg0 != -99) {
            this.method1571(-21, 59);
        }
        if (arg2 >= this.field3517.length) {
            this.method1571(0, arg2);
        }
        this.field3517[arg2] = arg1;
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(II)V")
    private final void method1571(int arg0, int arg1) {
        field3521++;
        String[] var3 = new String[this.method1572((byte) -109, arg1)];
        class595.method3472(this.field3517, arg0, var3, 0, this.field3517.length);
        this.field3517 = var3;
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(BI)I")
    private final int method1572(byte arg0, int arg1) {
        field3526++;
        int var3 = -21 % ((-arg0 - 34) / 49);
        int var4 = this.field3517.length;
        while (arg1 >= var4) {
            if (!this.field3527) {
                var4 += this.field3519;
            } else if (var4 == 0) {
                var4 = 1;
            } else {
                var4 = this.field3519 * var4;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!bea", name = "<init>", descriptor = "(IZ)V")
    public class234(int arg0, boolean arg1) {
        this.field3519 = arg0;
        this.field3527 = arg1;
    }
}
