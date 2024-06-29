import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cv")
public class class568 {

    @OriginalMember(owner = "client!cv", name = "n", descriptor = "I")
    private int field8071 = 0;

    @OriginalMember(owner = "client!cv", name = "l", descriptor = "I")
    private int field8069 = -1;

    @OriginalMember(owner = "client!cv", name = "d", descriptor = "Lbg;")
    private class464 field8061 = new class464();

    @OriginalMember(owner = "client!cv", name = "p", descriptor = "Z")
    public boolean field8073 = false;

    @OriginalMember(owner = "client!cv", name = "i", descriptor = "I")
    private int field8066;

    @OriginalMember(owner = "client!cv", name = "m", descriptor = "I")
    private int field8070;

    @OriginalMember(owner = "client!cv", name = "o", descriptor = "[[I")
    private int[][] field8072;

    @OriginalMember(owner = "client!cv", name = "k", descriptor = "[Lcia;")
    private class612[] field8068;

    @OriginalMember(owner = "client!cv", name = "c", descriptor = "D")
    public static double field8060;

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "I")
    public static int field8058;

    @OriginalMember(owner = "client!cv", name = "b", descriptor = "I")
    public static int field8059;

    @OriginalMember(owner = "client!cv", name = "e", descriptor = "I")
    public static int field8062;

    @OriginalMember(owner = "client!cv", name = "g", descriptor = "I")
    public static int field8064;

    @OriginalMember(owner = "client!cv", name = "h", descriptor = "I")
    public static int field8065;

    @OriginalMember(owner = "client!cv", name = "j", descriptor = "I")
    public static int field8067;

    @OriginalMember(owner = "client!cv", name = "f", descriptor = "[I")
    public static int[] field8063;

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(IIB)Z")
    public static final boolean method3268(int arg0, int arg1, byte arg2) {
        if (arg2 == 5) {
            field8062++;
            return class268.method1746(arg0, (byte) -113, arg1) | (arg1 & 0x800) != 0 || class129.method862(4285, arg1, arg0);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(Z)[[I")
    public final int[][] method3269(boolean arg0) {
        field8058++;
        if (this.field8070 != this.field8066) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        if (!arg0) {
            this.field8068 = null;
        }
        for (int var2 = 0; var2 < this.field8070; var2++) {
            this.field8068[var2] = class233.field3141;
        }
        return this.field8072;
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(IB)[I")
    public final int[] method3270(int arg0, byte arg1) {
        if (arg1 != -42) {
            return null;
        }
        field8067++;
        if (this.field8070 == this.field8066) {
            this.field8073 = this.field8068[arg0] == null;
            this.field8068[arg0] = class233.field3141;
            return this.field8072[arg0];
        } else if (this.field8070 == 1) {
            this.field8073 = this.field8069 != arg0;
            this.field8069 = arg0;
            return this.field8072[0];
        } else {
            class612 var3 = this.field8068[arg0];
            if (var3 == null) {
                this.field8073 = true;
                if (this.field8070 > this.field8071) {
                    var3 = new class612(arg0, this.field8071);
                    this.field8071++;
                } else {
                    class612 var4 = (class612) this.field8061.method2763(arg1 ^ 0xFFFFFFA3);
                    var3 = new class612(arg0, var4.field8585);
                    this.field8068[var4.field8584] = null;
                    var4.method1185(-106);
                }
                this.field8068[arg0] = var3;
            } else {
                this.field8073 = false;
            }
            this.field8061.method2769(var3, arg1 + 128);
            return this.field8072[var3.field8585];
        }
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(I)V")
    public final void method3271(int arg0) {
        field8064++;
        for (int var2 = 0; var2 < this.field8070; var2++) {
            this.field8072[var2] = null;
        }
        this.field8068 = null;
        this.field8072 = null;
        this.field8061.method2767((byte) -19);
        this.field8061 = null;
        if (arg0 != -15341) {
            field8063 = null;
        }
    }

    @OriginalMember(owner = "client!cv", name = "b", descriptor = "(I)V")
    public static void method3272(int arg0) {
        if (arg0 > -97) {
            method3268(-99, 23, (byte) 42);
        }
        field8063 = null;
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(BI)Z")
    public static final boolean method3273(byte arg0, int arg1) {
        int var2 = -27 % ((arg0 - 22) / 35);
        field8065++;
        return arg1 == 0 || arg1 == 1 || arg1 == 2;
    }

    @OriginalMember(owner = "client!cv", name = "<init>", descriptor = "(III)V")
    public class568(int arg0, int arg1, int arg2) {
        this.field8066 = arg1;
        this.field8070 = arg0;
        this.field8072 = new int[this.field8070][arg2];
        this.field8068 = new class612[this.field8066];
    }
}
