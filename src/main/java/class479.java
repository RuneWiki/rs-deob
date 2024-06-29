import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lw")
public class class479 {

    @OriginalMember(owner = "client!lw", name = "d", descriptor = "Lfc;")
    private class174 field6674 = new class174(256);

    @OriginalMember(owner = "client!lw", name = "j", descriptor = "Loi;")
    private class53 field6680;

    @OriginalMember(owner = "client!lw", name = "f", descriptor = "[I")
    public static int[] field6676 = new int[1000];

    @OriginalMember(owner = "client!lw", name = "e", descriptor = "[I")
    public static int[] field6675 = new int[6];

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "Lkn;")
    public static class530 field6671 = new class530("wave:", "welle:", "ondulation:", "onda:");

    @OriginalMember(owner = "client!lw", name = "k", descriptor = "Z")
    public static boolean field6681 = false;

    @OriginalMember(owner = "client!lw", name = "l", descriptor = "I")
    public static int field6682 = 0;

    @OriginalMember(owner = "client!lw", name = "b", descriptor = "I")
    public static int field6672;

    @OriginalMember(owner = "client!lw", name = "c", descriptor = "I")
    public static int field6673;

    @OriginalMember(owner = "client!lw", name = "g", descriptor = "I")
    public static int field6677;

    @OriginalMember(owner = "client!lw", name = "h", descriptor = "I")
    public static int field6678;

    @OriginalMember(owner = "client!lw", name = "i", descriptor = "I")
    public static int field6679;

    @OriginalMember(owner = "client!lw", name = "m", descriptor = "I")
    public static int field6683;

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(II)Lgt;")
    public final class321 method2764(int arg0, int arg1) {
        field6678++;
        class174 var3 = this.field6674;
        class321 var4;
        synchronized (this.field6674) {
            var4 = (class321) this.field6674.method1088((long) arg1, (byte) 50);
        }
        if (var4 != null) {
            return var4;
        } else if (arg0 <= 10) {
            return null;
        } else {
            class53 var5 = this.field6680;
            byte[] var6;
            synchronized (this.field6680) {
                var6 = this.field6680.method426(26, (byte) 9, arg1);
            }
            class321 var7 = new class321();
            if (var6 != null) {
                var7.method1936(new class403(var6), (byte) -39);
            }
            class174 var8 = this.field6674;
            synchronized (this.field6674) {
                this.field6674.method1097(19627, var7, (long) arg1);
                return var7;
            }
        }
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(B)V")
    public final void method2765(byte arg0) {
        if (arg0 != 99) {
            this.method2767(97, (byte) 67);
        }
        class174 var2 = this.field6674;
        synchronized (this.field6674) {
            this.field6674.method1095(arg0 ^ 0x63);
        }
        field6677++;
    }

    @OriginalMember(owner = "client!lw", name = "b", descriptor = "(B)V")
    public static final void method2766(byte arg0) {
        field6679++;
        for (class408 var1 = (class408) class191.field2730.method2655(15152); var1 != null; var1 = (class408) class191.field2730.method2660((byte) 67)) {
            if (var1.field5776 == -1) {
                var1.field5766 = 0;
                if (var1.field5770 >= 0 && var1.field5773 >= 0 && var1.field5770 < class43.field494 && class500.field7068 > var1.field5773) {
                    class60.method489((byte) 7, var1);
                }
            } else {
                var1.method2891(arg0 - 222);
            }
        }
        if (arg0 != 95) {
            field6683 = 113;
        }
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(IB)V")
    public final void method2767(int arg0, byte arg1) {
        int var3 = 11 / ((48 - arg1) / 47);
        field6673++;
        class174 var4 = this.field6674;
        synchronized (this.field6674) {
            this.field6674.method1087(1, arg0);
        }
    }

    @OriginalMember(owner = "client!lw", name = "c", descriptor = "(B)V")
    public final void method2768(byte arg0) {
        class174 var2 = this.field6674;
        synchronized (this.field6674) {
            this.field6674.method1096((byte) -38);
            if (arg0 != 23) {
                this.method2767(21, (byte) -95);
            }
        }
        field6672++;
    }

    @OriginalMember(owner = "client!lw", name = "<init>", descriptor = "(Lle;ILoi;)V")
    public class479(class205 arg0, int arg1, class53 arg2) {
        this.field6680 = arg2;
        this.field6680.method435(26, 0);
    }

    @OriginalMember(owner = "client!lw", name = "d", descriptor = "(B)V")
    public static void method2769(byte arg0) {
        field6676 = null;
        field6671 = null;
        field6675 = null;
        int var1 = 98 % ((17 - arg0) / 63);
    }
}
