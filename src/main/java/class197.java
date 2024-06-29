import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bda")
public class class197 extends class28 {

    @OriginalMember(owner = "client!bda", name = "E", descriptor = "Lrea;")
    public class32 field2592;

    @OriginalMember(owner = "client!bda", name = "v", descriptor = "Lbg;")
    public class641 field2583;

    @OriginalMember(owner = "client!bda", name = "B", descriptor = "Lbc;")
    public static class9 field2589 = new class9(64);

    @OriginalMember(owner = "client!bda", name = "G", descriptor = "[Z")
    public static boolean[] field2594 = new boolean[8];

    @OriginalMember(owner = "client!bda", name = "F", descriptor = "Lfl;")
    public static class103 field2593 = new class103(2, 2);

    @OriginalMember(owner = "client!bda", name = "u", descriptor = "I")
    public static int field2582;

    @OriginalMember(owner = "client!bda", name = "w", descriptor = "I")
    public int field2584;

    @OriginalMember(owner = "client!bda", name = "x", descriptor = "I")
    public int field2585;

    @OriginalMember(owner = "client!bda", name = "y", descriptor = "I")
    public int field2586;

    @OriginalMember(owner = "client!bda", name = "z", descriptor = "I")
    public int field2587;

    @OriginalMember(owner = "client!bda", name = "A", descriptor = "I")
    public int field2588;

    @OriginalMember(owner = "client!bda", name = "C", descriptor = "I")
    public static int field2590;

    @OriginalMember(owner = "client!bda", name = "D", descriptor = "I")
    public static int field2591;

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(B)V", line = 10)
    public final void method1301(byte arg0) {
        this.field2586 = this.field2592.field479;
        this.field2588 = this.field2592.field475;
        this.field2587 = this.field2592.field470;
        field2591++;
        if (this.field2592.field472 != null) {
            this.field2592.field472.method134(this.field2583.field8912, this.field2583.field8908, this.field2583.field8925, class572.field7455);
        }
        if (arg0 > -29) {
            this.method1301((byte) 16);
        }
        this.field2584 = class572.field7455[0];
        this.field2585 = class572.field7455[2];
    }

    @OriginalMember(owner = "client!bda", name = "c", descriptor = "(I)V", line = 33)
    public static void method1302(int arg0) {
        field2593 = null;
        field2589 = null;
        if (arg0 == -1) {
            field2594 = null;
        }
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(IIIII)V", line = 45)
    public static final void method1303(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2590++;
        if (arg2 != -58) {
            field2594 = null;
        }
        for (int var5 = 0; var5 < class57.field758; var5++) {
            Rectangle var6 = class20.field220[var5];
            if ((var6.x + var6.width) > arg0 && arg0 + arg3 > var6.x && (var6.y + var6.height) > arg1 && arg1 + arg4 > var6.y) {
                class53.field719[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!bda", name = "<init>", descriptor = "(Lrea;Lru;)V", line = 76)
    public class197(class32 arg0, class231 arg1) {
        this.field2592 = arg0;
        this.field2583 = this.field2592.method260((byte) 112);
        this.method1301((byte) -127);
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(ZLjava/lang/String;II)Z", line = 96)
    public static final boolean method1304(boolean arg0, String arg1, int arg2, int arg3) {
        field2582++;
        if (arg2 < 2 || arg2 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg2);
        }
        boolean var4 = false;
        if (arg3 != -44) {
            field2593 = null;
        }
        boolean var5 = false;
        int var6 = 0;
        int var7 = arg1.length();
        for (int var8 = 0; var8 < var7; var8++) {
            char var9 = arg1.charAt(var8);
            if (var8 == 0) {
                if (var9 == '-') {
                    var4 = true;
                    continue;
                }
                if (var9 == '+' && arg0) {
                    continue;
                }
            }
            int var11;
            if (var9 >= '0' && var9 <= '9') {
                var11 = var9 - '0';
            } else if (var9 >= 'A' && var9 <= 'Z') {
                var11 = var9 - '7';
            } else if (var9 >= 'a' && var9 <= 'z') {
                var11 = var9 - 'W';
            } else {
                return false;
            }
            if (var11 >= arg2) {
                return false;
            }
            if (var4) {
                var11 = -var11;
            }
            int var10 = arg2 * var6 + var11;
            if (var10 / arg2 != var6) {
                return false;
            }
            var6 = var10;
            var5 = true;
        }
        return var5;
    }
}
