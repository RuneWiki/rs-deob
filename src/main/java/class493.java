import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iga")
public class class493 {

    @OriginalMember(owner = "client!iga", name = "c", descriptor = "I")
    private int field7136 = 0;

    @OriginalMember(owner = "client!iga", name = "j", descriptor = "I")
    private int field7143 = -1;

    @OriginalMember(owner = "client!iga", name = "m", descriptor = "Ltg;")
    private class605 field7146 = new class605();

    @OriginalMember(owner = "client!iga", name = "n", descriptor = "Z")
    public boolean field7147 = false;

    @OriginalMember(owner = "client!iga", name = "f", descriptor = "I")
    private int field7139;

    @OriginalMember(owner = "client!iga", name = "k", descriptor = "I")
    private int field7144;

    @OriginalMember(owner = "client!iga", name = "b", descriptor = "[[[I")
    private int[][][] field7135;

    @OriginalMember(owner = "client!iga", name = "d", descriptor = "[Lrda;")
    private class446[] field7137;

    @OriginalMember(owner = "client!iga", name = "i", descriptor = "Ltm;")
    public static class334 field7142;

    @OriginalMember(owner = "client!iga", name = "l", descriptor = "Lmq;")
    public static class592 field7145;

    @OriginalMember(owner = "client!iga", name = "a", descriptor = "I")
    public static int field7134;

    @OriginalMember(owner = "client!iga", name = "e", descriptor = "I")
    public static int field7138;

    @OriginalMember(owner = "client!iga", name = "g", descriptor = "I")
    public static int field7140;

    @OriginalMember(owner = "client!iga", name = "h", descriptor = "I")
    public static int field7141;

    @OriginalMember(owner = "client!iga", name = "p", descriptor = "I")
    public static int field7149;

    @OriginalMember(owner = "client!iga", name = "o", descriptor = "Lid;")
    public static class463 field7148;

    @OriginalMember(owner = "client!iga", name = "a", descriptor = "(BI)[[I")
    public final int[][] method2996(byte arg0, int arg1) {
        if (arg0 < 118) {
            method2998((byte) -109);
        }
        field7134++;
        if (this.field7144 == this.field7139) {
            this.field7147 = this.field7137[arg1] == null;
            this.field7137[arg1] = class72.field1089;
            return this.field7135[arg1];
        } else if (this.field7144 == 1) {
            this.field7147 = this.field7143 != arg1;
            this.field7143 = arg1;
            return this.field7135[0];
        } else {
            class446 var3 = this.field7137[arg1];
            if (var3 == null) {
                this.field7147 = true;
                if (this.field7144 <= this.field7136) {
                    class446 var4 = (class446) this.field7146.method3468((byte) 30);
                    var3 = new class446(arg1, var4.field6473);
                    this.field7137[var4.field6474] = null;
                    var4.method636((byte) 97);
                } else {
                    var3 = new class446(arg1, this.field7136);
                    this.field7136++;
                }
                this.field7137[arg1] = var3;
            } else {
                this.field7147 = false;
            }
            this.field7146.method3474(1807, var3);
            return this.field7135[var3.field6473];
        }
    }

    @OriginalMember(owner = "client!iga", name = "a", descriptor = "(B)V")
    public final void method2997(byte arg0) {
        for (int var2 = 0; var2 < this.field7144; var2++) {
            this.field7135[var2][0] = null;
            this.field7135[var2][1] = null;
            this.field7135[var2][2] = null;
            this.field7135[var2] = null;
        }
        field7141++;
        this.field7135 = null;
        this.field7137 = null;
        if (arg0 != -111) {
            this.field7146 = null;
        }
        this.field7146.method3465(0);
        this.field7146 = null;
    }

    @OriginalMember(owner = "client!iga", name = "b", descriptor = "(B)V")
    public static final void method2998(byte arg0) {
        if (arg0 > -99) {
            return;
        }
        if (class109.field1694 != null) {
            class109.field1694.method877((byte) 112);
        }
        field7140++;
        if (class159.field2473 != null) {
            class159.field2473.method877((byte) 85);
        }
    }

    @OriginalMember(owner = "client!iga", name = "c", descriptor = "(B)V")
    public static void method2999(byte arg0) {
        field7148 = null;
        field7142 = null;
        if (arg0 <= 39) {
            method2998((byte) -5);
        }
        field7145 = null;
    }

    @OriginalMember(owner = "client!iga", name = "a", descriptor = "(I)[[[I")
    public final int[][][] method3000(int arg0) {
        field7138++;
        if (this.field7144 != this.field7139) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = 0; var2 < this.field7144; var2++) {
            this.field7137[var2] = class72.field1089;
        }
        if (arg0 != 12313) {
            this.method2997((byte) 21);
        }
        return this.field7135;
    }

    @OriginalMember(owner = "client!iga", name = "<init>", descriptor = "(III)V")
    public class493(int arg0, int arg1, int arg2) {
        this.field7139 = arg1;
        this.field7144 = arg0;
        this.field7135 = new int[this.field7144][3][arg2];
        this.field7137 = new class446[this.field7139];
    }

    static {
        new class685("", 73);
        field7142 = new class334(45, -1);
        field7145 = new class592();
    }
}
