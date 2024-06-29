import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!efa")
public class class40 extends class554 {

    @OriginalMember(owner = "client!efa", name = "s", descriptor = "I")
    public int field532 = -1;

    @OriginalMember(owner = "client!efa", name = "o", descriptor = "I")
    public int field528;

    @OriginalMember(owner = "client!efa", name = "p", descriptor = "I")
    public static int field529;

    @OriginalMember(owner = "client!efa", name = "r", descriptor = "I")
    public static int field531;

    @OriginalMember(owner = "client!efa", name = "q", descriptor = "Ldh;")
    public static class82 field530;

    @OriginalMember(owner = "client!efa", name = "n", descriptor = "Ljava/lang/String;")
    public String field527;

    @OriginalMember(owner = "client!efa", name = "t", descriptor = "Ljava/lang/String;")
    public String field533;

    @OriginalMember(owner = "client!efa", name = "a", descriptor = "(III)B")
    public static final byte method244(int arg0, int arg1, int arg2) {
        if (arg2 != 19218) {
            return 51;
        } else {
            ++field529;
            if (~arg0 != -10) {
                return 0;
            } else {
                return (byte) ((arg1 & 1) == 0 ? 1 : 2);
            }
        }
    }

    @OriginalMember(owner = "client!efa", name = "d", descriptor = "(I)V")
    public static void method245(int arg0) {
        if (arg0 < 87) {
            method247(-105, -65);
        }
        field530 = null;
    }

    @OriginalMember(owner = "client!efa", name = "e", descriptor = "(I)Lus;")
    public final class566 method246(int arg0) {
        ++field531;
        return arg0 != 1 ? null : class667.field9494[super.field7584];
    }

    @OriginalMember(owner = "client!efa", name = "a", descriptor = "(II)V")
    public static final void method247(int arg0, int arg1) {
        class651 var2 = class145.field1841[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; ++var3) {
            class651 var4 = class145.field1841[var3][arg0][arg1] = class145.field1841[var3 + 1][arg0][arg1];
            if (var4 != null) {
                --var4.field9218;
                for (class82 var5 = var4.field9228; var5 != null; var5 = var5.field1024) {
                    class293 var6 = var5.field1027;
                    if (var6.field3921 == arg0 && var6.field3920 == arg1) {
                        --var6.field3925;
                    }
                }
            }
        }
        if (class145.field1841[0][arg0][arg1] == null) {
            class145.field1841[0][arg0][arg1] = new class651(0, arg0, arg1);
            class145.field1841[0][arg0][arg1].field9239 = 1;
        }
        class145.field1841[0][arg0][arg1].field9225 = var2;
        class145.field1841[3][arg0][arg1] = null;
    }
}
