import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public class class689 extends class504 {

    @OriginalMember(owner = "client!ql", name = "n", descriptor = "I")
    public volatile int field9706 = -1;

    @OriginalMember(owner = "client!ql", name = "l", descriptor = "Ljava/lang/String;")
    public volatile String field9704;

    @OriginalMember(owner = "client!ql", name = "i", descriptor = "I")
    public static int field9701;

    @OriginalMember(owner = "client!ql", name = "j", descriptor = "I")
    public static int field9702;

    @OriginalMember(owner = "client!ql", name = "k", descriptor = "I")
    public static int field9703;

    @OriginalMember(owner = "client!ql", name = "m", descriptor = "I")
    public static int field9705;

    @OriginalMember(owner = "client!ql", name = "o", descriptor = "I")
    public static int field9707;

    @OriginalMember(owner = "client!ql", name = "p", descriptor = "I")
    public static int field9708;

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(IC)Z", line = 12)
    public static final boolean method3826(int arg0, char arg1) {
        if (arg0 != -3476) {
            method3830(-59);
        }
        field9701++;
        if (!(arg1 <= '\u0000' || arg1 >= '\u0080') || !(arg1 < ' ' || arg1 > 'ÿ')) {
            return true;
        }
        if (arg1 != '\u0000') {
            char[] var2 = class104.field1562;
            for (int var3 = 0; var3 < var2.length; var3++) {
                char var4 = var2[var3];
                if (arg1 == var4) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(I)V", line = 48)
    public static final void method3827(int arg0) {
        field9708++;
        class433.field5920.method1269(-70);
        for (int var1 = 0; var1 < 32; var1++) {
            class38.field574[var1] = 0L;
        }
        for (int var2 = 0; var2 < 32; var2++) {
            class597.field7935[var2] = 0L;
        }
        if (arg0 >= -75) {
            method3830(116);
        }
        class510.field6796 = 0;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(B)V", line = 74)
    public static final void method3828(byte arg0) {
        class214.field3063 = new class593();
        field9705++;
        if (arg0 != 125) {
            method3826(22, '$');
        }
    }

    @OriginalMember(owner = "client!ql", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 88)
    public class689(String arg0) {
        this.field9704 = arg0;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(BI)I", line = 96)
    public static final int method3829(byte arg0, int arg1) {
        field9703++;
        if (arg0 < 126) {
            field9702 = 58;
        }
        if (arg1 < 96) {
            return 0;
        } else if (arg1 < 128) {
            return 2;
        } else {
            return 3;
        }
    }

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "(I)I", line = 113)
    public static final int method3830(int arg0) {
        field9707++;
        class651 var1 = class10.field197;
        boolean var2 = false;
        if (class571.field7587 != 0) {
            Canvas var3 = new Canvas();
            var3.setSize(100, 100);
            var1 = class651.method3571(0, var3, arg0 ^ 0xFFFFFFE1, 0, null, null);
            var2 = true;
        }
        long var4 = class681.method3802(-23600);
        for (int var6 = arg0; var6 < 10000; var6++) {
            var1.method448(5, 10, 75, 50, 15, 90, -65536, -65536, -65536, 1);
        }
        int var7 = (int) (class681.method3802(arg0 - 23600) - var4);
        var1.method3567(100, 0, 100, 0, -16777216, (byte) 116);
        if (var2) {
            var1.method3574(-120);
        }
        return var7;
    }
}
