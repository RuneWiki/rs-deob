import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kfa")
public abstract class class629 {

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "[I")
    public static int[] field8594 = new int[120];

    @OriginalMember(owner = "client!kfa", name = "c", descriptor = "Ltja;")
    public static class288 field8596;

    @OriginalMember(owner = "client!kfa", name = "d", descriptor = "Llja;")
    public static class744 field8597;

    @OriginalMember(owner = "client!kfa", name = "e", descriptor = "Lhj;")
    public static class596 field8598;

    @OriginalMember(owner = "client!kfa", name = "h", descriptor = "Z")
    public static boolean field8601;

    @OriginalMember(owner = "client!kfa", name = "b", descriptor = "I")
    public static int field8595;

    @OriginalMember(owner = "client!kfa", name = "g", descriptor = "J")
    public static long field8600;

    @OriginalMember(owner = "client!kfa", name = "f", descriptor = "Ltf;")
    public static class312 field8599;

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(BI)Z")
    public abstract boolean method765(byte arg0, int arg1) throws IOException;

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "()V")
    public static final void method3561() {
        for (int var0 = 0; var0 < class521.field7397; var0++) {
            class712 var1 = class620.field8391[var0];
            class327.method1946(var1, true);
            class620.field8391[var0] = null;
        }
        class521.field7397 = 0;
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(Lqb;B)Z")
    public static final boolean method3562(class238 arg0, byte arg1) {
        field8595++;
        class174 var2 = class379.field4811.method4192(27324, arg0.method927(-24482));
        if (var2.field2120 == -1) {
            return true;
        }
        class752 var3 = class495.field6886.method1705(27058, var2.field2120);
        if (arg1 > -106) {
            field8600 = 113L;
        }
        return var3.field10432 == -1 ? true : var3.method4205((byte) 112);
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(III[B)V")
    public abstract void method769(int arg0, int arg1, int arg2, byte[] arg3) throws IOException;

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(I)V")
    public abstract void method768(int arg0);

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "([BIII)I")
    public abstract int method766(byte[] arg0, int arg1, int arg2, int arg3) throws IOException;

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(B)V")
    public abstract void method771(byte arg0);

    @OriginalMember(owner = "client!kfa", name = "b", descriptor = "(B)V")
    public static void method3563(byte arg0) {
        field8594 = null;
        field8598 = null;
        field8596 = null;
        field8599 = null;
        field8597 = null;
        if (arg0 <= 6) {
            method3563((byte) -84);
        }
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 120; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) (Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D + (double) var2);
            var0 += var3;
            field8594[var1] = var0 / 4;
        }
        field8596 = new class288(4);
        field8597 = new class744(77, 8);
        field8598 = new class596(94, 16);
        field8601 = false;
    }
}
