import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public class class223 extends class177 {

    @OriginalMember(owner = "client!jm", name = "U", descriptor = "I")
    public int field3754 = 0;

    @OriginalMember(owner = "client!jm", name = "T", descriptor = "Lbe;")
    public static class283 field3753 = class153.method941(22, "Verbindung mit Update)2Server)3)3)3");

    @OriginalMember(owner = "client!jm", name = "P", descriptor = "I")
    public static int field3749;

    @OriginalMember(owner = "client!jm", name = "Q", descriptor = "I")
    public static int field3750;

    @OriginalMember(owner = "client!jm", name = "R", descriptor = "I")
    public static int field3751;

    @OriginalMember(owner = "client!jm", name = "S", descriptor = "I")
    public static int field3752;

    @OriginalMember(owner = "client!jm", name = "V", descriptor = "I")
    public static int field3755;

    @OriginalMember(owner = "client!jm", name = "W", descriptor = "I")
    public static int field3756;

    @OriginalMember(owner = "client!jm", name = "X", descriptor = "I")
    public static int field3757;

    @OriginalMember(owner = "client!jm", name = "Y", descriptor = "I")
    public static int field3758;

    @OriginalMember(owner = "client!jm", name = "Z", descriptor = "I")
    public static int field3759;

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "(III)I", line = 11)
    public static final int method1462(int arg0, int arg1, int arg2) {
        if (arg2 != 28778) {
            method1466(109);
        }
        field3749++;
        int var3 = class109.method725(arg0 - 1, arg1 + -1, 9491) - (-class109.method725(arg0 + 1, arg1 + -1, 9491) + (-class109.method725(arg0 - 1, arg1 + 1, arg2 ^ 0x5579) - class109.method725(arg0 + 1, arg1 + 1, 9491)));
        int var4 = class109.method725(arg0 - 1, arg1, arg2 - 19287) + class109.method725(arg0 + 1, arg1, arg2 - 19287) + class109.method725(arg0, arg1 + -1, 9491) + class109.method725(arg0, arg1 + 1, 9491);
        int var5 = class109.method725(arg0, arg1, arg2 - 19287);
        return var3 / 16 + var4 / 8 + (var5 / 4);
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(II)I", line = 31)
    public static final int method1463(int arg0, int arg1) {
        if (arg0 == -962460278) {
            field3752++;
            return arg1 >>> 10;
        } else {
            return -27;
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(ZILfe;)V", line = 47)
    private final void method1464(boolean arg0, int arg1, class229 arg2) {
        if (arg1 == 2) {
            this.field3754 = arg2.method1496(arg0);
        }
        if (arg0) {
            field3758++;
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(IIBIIIII)V", line = 70)
    public static final void method1465(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var8 = arg6 + arg7;
        int var9 = arg4 - arg6;
        field3757++;
        int var10 = arg1 + arg6;
        int var11 = arg3 - arg6;
        for (int var12 = arg7; var12 < var8; var12++) {
            class114.method742(30197, arg1, class97.field1636[var12], arg3, arg5);
        }
        for (int var13 = arg4; var13 > var9; var13--) {
            class114.method742(30197, arg1, class97.field1636[var13], arg3, arg5);
        }
        for (int var14 = var8; var14 <= var9; var14++) {
            int[] var15 = class97.field1636[var14];
            class114.method742(30197, arg1, var15, var10, arg5);
            class114.method742(30197, var10, var15, var11, arg0);
            class114.method742(30197, var11, var15, arg3, arg5);
        }
        if (arg2 < 45) {
            field3753 = (class283) null;
        }
    }

    @OriginalMember(owner = "client!jm", name = "h", descriptor = "(I)V", line = 113)
    public static final void method1466(int arg0) {
        field3750++;
        class231.field3922.method1636(120);
        if (arg0 >= -47) {
            field3753 = (class283) null;
        }
    }

    @OriginalMember(owner = "client!jm", name = "i", descriptor = "(I)V", line = 124)
    public static void method1467(int arg0) {
        field3753 = null;
        if (arg0 > -127) {
            method1466(-30);
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(Lfe;B)V", line = 137)
    public final void method1468(class229 arg0, byte arg1) {
        int var3 = 94 / ((-arg1 - 9) / 41);
        while (true) {
            int var4 = arg0.method1535((byte) 80);
            if (var4 == 0) {
                field3751++;
                return;
            }
            this.method1464(true, var4, arg0);
        }
    }
}
