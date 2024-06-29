import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kr")
public class class693 {

    @OriginalMember(owner = "client!kr", name = "c", descriptor = "Lia;")
    private class546 field9867 = new class546();

    @OriginalMember(owner = "client!kr", name = "j", descriptor = "Llh;")
    public static class487 field9874 = new class487(69, 4);

    @OriginalMember(owner = "client!kr", name = "m", descriptor = "[I")
    public static int[] field9877 = new int[120];

    @OriginalMember(owner = "client!kr", name = "n", descriptor = "[J")
    public static long[] field9878 = new long[32];

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "I")
    public static int field9865;

    @OriginalMember(owner = "client!kr", name = "b", descriptor = "I")
    public static int field9866;

    @OriginalMember(owner = "client!kr", name = "d", descriptor = "I")
    public static int field9868;

    @OriginalMember(owner = "client!kr", name = "e", descriptor = "I")
    public static int field9869;

    @OriginalMember(owner = "client!kr", name = "g", descriptor = "I")
    public static int field9871;

    @OriginalMember(owner = "client!kr", name = "h", descriptor = "I")
    public static int field9872;

    @OriginalMember(owner = "client!kr", name = "i", descriptor = "I")
    public static int field9873;

    @OriginalMember(owner = "client!kr", name = "k", descriptor = "I")
    public static int field9875;

    @OriginalMember(owner = "client!kr", name = "l", descriptor = "I")
    public static int field9876;

    @OriginalMember(owner = "client!kr", name = "f", descriptor = "Lia;")
    private class546 field9870;

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(I)V")
    public static void method3897(int arg0) {
        field9874 = null;
        field9877 = null;
        field9878 = null;
        int var1 = -42 % ((arg0 - 2) / 62);
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(B)Lia;")
    public final class546 method3898(byte arg0) {
        field9869++;
        if (arg0 >= -29) {
            method3897(-78);
        }
        class546 var2 = this.field9867.field7399;
        if (this.field9867 == var2) {
            this.field9870 = null;
            return null;
        } else {
            this.field9870 = var2.field7399;
            return var2;
        }
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(CBLjava/lang/String;)I")
    public static final int method3899(char arg0, byte arg1, String arg2) {
        field9871++;
        if (arg1 <= 43) {
            return 24;
        }
        int var3 = 0;
        int var4 = arg2.length();
        for (int var5 = 0; var5 < var4; var5++) {
            if (arg2.charAt(var5) == arg0) {
                var3++;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!kr", name = "b", descriptor = "(B)Lia;")
    public final class546 method3900(byte arg0) {
        field9876++;
        class546 var2 = this.field9867.field7404;
        if (this.field9867 == var2) {
            this.field9870 = null;
            return null;
        }
        if (arg0 < 63) {
            this.method3905((byte) 52);
        }
        this.field9870 = var2.field7404;
        return var2;
    }

    @OriginalMember(owner = "client!kr", name = "b", descriptor = "(I)Lia;")
    public final class546 method3901(int arg0) {
        field9872++;
        if (arg0 != 0) {
            return null;
        }
        class546 var2 = this.field9867.field7399;
        if (this.field9867 == var2) {
            return null;
        } else {
            var2.method3074((byte) 48);
            return var2;
        }
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(Z)Lia;")
    public final class546 method3902(boolean arg0) {
        field9865++;
        class546 var2 = this.field9870;
        if (this.field9867 == var2) {
            this.field9870 = null;
            return null;
        }
        if (!arg0) {
            this.method3901(54);
        }
        this.field9870 = var2.field7399;
        return var2;
    }

    @OriginalMember(owner = "client!kr", name = "c", descriptor = "(B)I")
    public final int method3903(byte arg0) {
        field9875++;
        int var2 = 0;
        if (arg0 >= -16) {
            field9874 = null;
        }
        for (class546 var3 = this.field9867.field7399; var3 != this.field9867; var3 = var3.field7399) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!kr", name = "d", descriptor = "(B)Z")
    public final boolean method3904(byte arg0) {
        field9868++;
        int var2 = -118 % ((arg0 + 64) / 57);
        return this.field9867.field7399 == this.field9867;
    }

    @OriginalMember(owner = "client!kr", name = "e", descriptor = "(B)V")
    public final void method3905(byte arg0) {
        while (true) {
            class546 var2 = this.field9867.field7399;
            if (this.field9867 == var2) {
                field9873++;
                this.field9870 = null;
                if (arg0 > -53) {
                    method3899((char) 65451, (byte) -96, null);
                    return;
                }
                return;
            }
            var2.method3074((byte) 48);
        }
    }

    @OriginalMember(owner = "client!kr", name = "<init>", descriptor = "()V")
    public class693() {
        this.field9867.field7404 = this.field9867;
        this.field9867.field7399 = this.field9867;
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(Lia;B)V")
    public final void method3906(class546 arg0, byte arg1) {
        if (arg0.field7404 != null) {
            arg0.method3074((byte) 48);
        }
        field9866++;
        arg0.field7404 = this.field9867.field7404;
        arg0.field7399 = this.field9867;
        arg0.field7404.field7399 = arg0;
        arg0.field7399.field7404 = arg0;
        if (arg1 != -19) {
            field9874 = null;
        }
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 120; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) ((double) var2 + Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D);
            var0 += var3;
            field9877[var1] = var0 / 4;
        }
    }
}
