import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lu")
public class class35 extends class334 {

    @OriginalMember(owner = "client!lu", name = "u", descriptor = "I")
    public int field360 = 0;

    @OriginalMember(owner = "client!lu", name = "s", descriptor = "I")
    public static int field358;

    @OriginalMember(owner = "client!lu", name = "t", descriptor = "I")
    public static int field359;

    @OriginalMember(owner = "client!lu", name = "v", descriptor = "I")
    public static int field361;

    @OriginalMember(owner = "client!lu", name = "w", descriptor = "I")
    public static int field362;

    @OriginalMember(owner = "client!lu", name = "x", descriptor = "I")
    public static int field363;

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(ZLhw;)V")
    public final void method216(boolean arg0, class208 arg1) {
        if (!arg0) {
            this.field360 = -115;
        }
        while (true) {
            int var3 = arg1.method1445(-107);
            if (var3 == 0) {
                field359++;
                return;
            }
            this.method218(18249, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(BZILhg;III)V")
    public static final void method217(byte arg0, boolean arg1, int arg2, class363 arg3, int arg4, int arg5, int arg6) {
        field362++;
        if (class486.field7371 >= 50 || arg3 == null || arg3.field5605 == null || arg3.field5605.length <= arg2 || arg3.field5605[arg2] == null) {
            return;
        }
        int var7 = arg3.field5605[arg2][0];
        int var8 = var7 >> 8;
        int var9 = (var7 & 0xE9) >> 5;
        if (arg3.field5605[arg2].length > 1) {
            int var10 = (int) ((double) arg3.field5605[arg2].length * Math.random());
            if (var10 > 0) {
                var8 = arg3.field5605[arg2][var10];
            }
        }
        if (arg0 != -44) {
            return;
        }
        int var11 = var7 & 0x1F;
        if (var11 == 0) {
            if (arg1) {
                class372.method2422(255, var9, -56, var8, 0);
            }
        } else if (class141.field1911.field6100 != 0) {
            int var12 = arg4 - 64 >> 7;
            int var13 = arg5 - 64 >> 7;
            class357.field5540[class486.field7371++] = new class17((byte) 1, var8, var9, 0, 255, (arg6 << 24) + (var12 << 16) + (var13 << 8) + var11);
        }
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(IILhw;)V")
    private final void method218(int arg0, int arg1, class208 arg2) {
        field361++;
        if (arg0 != 18249) {
            this.field360 = 67;
        }
        if (arg1 == 2) {
            this.field360 = arg2.method1455(arg0 ^ 0xFFFFB58C);
        }
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(III)Z")
    public static final boolean method219(int arg0, int arg1, int arg2) {
        if (arg2 != 4) {
            return false;
        }
        field358++;
        class156 var3 = class454.field7029.method3002(arg2 ^ 0xFFFFFFFB, arg1);
        if (arg0 == 11) {
            arg0 = 10;
        }
        if (arg0 >= 5 && arg0 <= 8) {
            arg0 = 4;
        }
        return var3.method953(arg0, arg2 ^ 0xFFB);
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(BC)Z")
    public static final boolean method220(byte arg0, char arg1) {
        if (arg0 != 83) {
            method217((byte) 106, false, 28, null, 27, 2, 99);
        }
        field363++;
        return arg1 >= 'A' && arg1 <= 'Z' || arg1 >= 'a' && arg1 <= 'z';
    }

    static {
        new class213("Invalid channel name entered!", "Ungültiger Chatraum-Name angegeben.", "Nom de canal incorrect !", "Nome de canal inválido!");
    }
}
