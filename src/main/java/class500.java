import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class500 extends class176 {

    @OriginalMember(owner = "client!pf", name = "m", descriptor = "I")
    public int field6963;

    @OriginalMember(owner = "client!pf", name = "s", descriptor = "I")
    public int field6969;

    @OriginalMember(owner = "client!pf", name = "p", descriptor = "I")
    public static int field6966 = -1;

    @OriginalMember(owner = "client!pf", name = "n", descriptor = "I")
    public static int field6964;

    @OriginalMember(owner = "client!pf", name = "o", descriptor = "I")
    public static int field6965;

    @OriginalMember(owner = "client!pf", name = "q", descriptor = "I")
    public static int field6967;

    @OriginalMember(owner = "client!pf", name = "t", descriptor = "I")
    public static int field6970;

    @OriginalMember(owner = "client!pf", name = "u", descriptor = "I")
    public static int field6971;

    @OriginalMember(owner = "client!pf", name = "v", descriptor = "I")
    public static int field6972;

    @OriginalMember(owner = "client!pf", name = "w", descriptor = "I")
    public static int field6973;

    @OriginalMember(owner = "client!pf", name = "r", descriptor = "Ldj;")
    public static class288 field6968;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(I)V")
    public static void method2893(int arg0) {
        field6968 = null;
        if (arg0 != 1) {
            field6966 = 65;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IB)Z")
    public final boolean method2894(int arg0, byte arg1) {
        if (arg1 < 0) {
            this.field6963 = -27;
        }
        field6973++;
        return (this.field6963 >> arg0 + 1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "(I)Z")
    public final boolean method2895(int arg0) {
        field6965++;
        if (arg0 == 198523317) {
            return (this.field6963 >> 21 & 0x1) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "(I)Z")
    public final boolean method2896(int arg0) {
        field6967++;
        int var2 = 69 % ((56 - arg0) / 43);
        return (this.field6963 & 0x7D80C6) >> 22 != 0;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(B)I")
    public final int method2897(byte arg0) {
        if (arg0 <= 111) {
            this.method2895(95);
        }
        field6964++;
        return class100.method714(this.field6963, 260522);
    }

    @OriginalMember(owner = "client!pf", name = "<init>", descriptor = "(II)V")
    public class500(int arg0, int arg1) {
        this.field6963 = arg0;
        this.field6969 = arg1;
    }

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "(B)Z")
    public final boolean method2898(byte arg0) {
        field6972++;
        int var2 = 42 % ((-arg0 - 10) / 49);
        return (this.field6963 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "(B)I")
    public final int method2899(byte arg0) {
        int var2 = 11 / ((arg0 - 24) / 36);
        field6971++;
        return (this.field6963 & 0x1FDA0A) >> 18;
    }

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "(III)V")
    public static final void method2900(int arg0, int arg1, int arg2) {
        boolean var3 = class356.field4807[0][arg1][arg2] != null && class356.field4807[0][arg1][arg2].field8967 != null;
        for (int var4 = arg0; var4 >= 0; var4--) {
            if (class356.field4807[var4][arg1][arg2] == null) {
                class622 var5 = class356.field4807[var4][arg1][arg2] = new class622(var4, arg1, arg2);
                if (var3) {
                    var5.field8970++;
                }
            }
        }
    }
}
