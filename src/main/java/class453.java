import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rn")
public class class453 {

    @OriginalMember(owner = "client!rn", name = "f", descriptor = "I")
    private int field6652 = -1;

    @OriginalMember(owner = "client!rn", name = "m", descriptor = "I")
    private int field6659 = 0;

    @OriginalMember(owner = "client!rn", name = "c", descriptor = "Lvr;")
    private class306 field6649 = new class306();

    @OriginalMember(owner = "client!rn", name = "r", descriptor = "Z")
    public boolean field6664 = false;

    @OriginalMember(owner = "client!rn", name = "o", descriptor = "I")
    private int field6661;

    @OriginalMember(owner = "client!rn", name = "h", descriptor = "I")
    private int field6654;

    @OriginalMember(owner = "client!rn", name = "n", descriptor = "[Lbh;")
    private class301[] field6660;

    @OriginalMember(owner = "client!rn", name = "i", descriptor = "[[[I")
    private int[][][] field6655;

    @OriginalMember(owner = "client!rn", name = "e", descriptor = "[Lsk;")
    public static class333[] field6651 = new class333[128];

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "I")
    public static int field6647;

    @OriginalMember(owner = "client!rn", name = "b", descriptor = "I")
    public static int field6648;

    @OriginalMember(owner = "client!rn", name = "d", descriptor = "I")
    public static int field6650;

    @OriginalMember(owner = "client!rn", name = "g", descriptor = "I")
    public static int field6653;

    @OriginalMember(owner = "client!rn", name = "k", descriptor = "I")
    public static int field6657;

    @OriginalMember(owner = "client!rn", name = "l", descriptor = "I")
    public static int field6658;

    @OriginalMember(owner = "client!rn", name = "p", descriptor = "I")
    public static int field6662;

    @OriginalMember(owner = "client!rn", name = "q", descriptor = "I")
    public static int field6663;

    @OriginalMember(owner = "client!rn", name = "j", descriptor = "Lfc;")
    public static class430 field6656;

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(I)V")
    public static void method2725(int arg0) {
        if (arg0 < 23) {
            field6648 = -92;
        }
        field6651 = null;
        field6656 = null;
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(II)[[I")
    public final int[][] method2726(int arg0, int arg1) {
        field6650++;
        if (arg1 != 0) {
            return null;
        } else if (this.field6661 == this.field6654) {
            this.field6664 = this.field6660[arg0] == null;
            this.field6660[arg0] = class529.field7814;
            return this.field6655[arg0];
        } else if (this.field6654 == 1) {
            this.field6664 = this.field6652 != arg0;
            this.field6652 = arg0;
            return this.field6655[0];
        } else {
            class301 var3 = this.field6660[arg0];
            if (var3 == null) {
                this.field6664 = true;
                if (this.field6654 > this.field6659) {
                    var3 = new class301(arg0, this.field6659);
                    this.field6659++;
                } else {
                    class301 var4 = (class301) this.field6649.method1968(-31872);
                    var3 = new class301(arg0, var4.field4448);
                    this.field6660[var4.field4449] = null;
                    var4.method2785((byte) -120);
                }
                this.field6660[arg0] = var3;
            } else {
                this.field6664 = false;
            }
            this.field6649.method1961(var3, arg1 ^ 0x672D);
            return this.field6655[var3.field4448];
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(Z)V")
    public final void method2727(boolean arg0) {
        if (arg0) {
            return;
        }
        for (int var2 = 0; var2 < this.field6654; var2++) {
            this.field6655[var2][0] = null;
            this.field6655[var2][1] = null;
            this.field6655[var2][2] = null;
            this.field6655[var2] = null;
        }
        field6647++;
        this.field6655 = null;
        this.field6660 = null;
        this.field6649.method1959((byte) 113);
        this.field6649 = null;
    }

    @OriginalMember(owner = "client!rn", name = "b", descriptor = "(I)I")
    public static final int method2728(int arg0) {
        if (arg0 == 2) {
            field6663++;
            return class220.field3090;
        } else {
            return 13;
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(BII)Z")
    public static final boolean method2729(byte arg0, int arg1, int arg2) {
        if (arg0 != -112) {
            field6651 = null;
        }
        field6662++;
        return (arg2 & 0x800) != 0 && (arg1 & 0x37) != 0;
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(B)[[[I")
    public final int[][][] method2730(byte arg0) {
        field6653++;
        if (arg0 >= -112) {
            this.method2726(112, 72);
        }
        if (this.field6661 != this.field6654) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = 0; var2 < this.field6654; var2++) {
            this.field6660[var2] = class529.field7814;
        }
        return this.field6655;
    }

    @OriginalMember(owner = "client!rn", name = "<init>", descriptor = "(III)V")
    public class453(int arg0, int arg1, int arg2) {
        this.field6661 = arg1;
        this.field6654 = arg0;
        this.field6660 = new class301[this.field6661];
        this.field6655 = new int[this.field6654][3][arg2];
    }
}
