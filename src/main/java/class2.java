import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class2 {

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "I")
    public int field8;

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "Z")
    public static volatile boolean field9 = true;

    @OriginalMember(owner = "client!ud", name = "f", descriptor = "I")
    public static int field12 = 0;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "Lsd;")
    public static class74 field7 = new class74(18, -1);

    @OriginalMember(owner = "client!ud", name = "i", descriptor = "Lss;")
    public static class140 field15 = new class140(13, 4);

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "I")
    public static int field10;

    @OriginalMember(owner = "client!ud", name = "e", descriptor = "I")
    public static int field11;

    @OriginalMember(owner = "client!ud", name = "g", descriptor = "I")
    public static int field13;

    @OriginalMember(owner = "client!ud", name = "h", descriptor = "I")
    public static int field14;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(BI)I")
    public static final int method5(byte arg0, int arg1) {
        field10++;
        int var2 = (arg1 * arg1 >> 12) * arg1 >> 12;
        int var3 = arg1 * 6 - 61440;
        int var4 = (arg1 * var3 >> 12) + 40960;
        if (arg0 > -72) {
            field15 = null;
        }
        return var2 * var4 >> 12;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(I)I")
    public final int method6(int arg0) {
        field13++;
        int var2 = -99 % ((-arg0 - 40) / 38);
        return this.field8;
    }

    @OriginalMember(owner = "client!ud", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field11++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(I)V")
    public static void method7(int arg0) {
        int var1 = -1 / ((arg0 + 6) / 39);
        field15 = null;
        field7 = null;
    }

    @OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class2(String arg0, int arg1) {
        this.field8 = arg1;
    }
}
