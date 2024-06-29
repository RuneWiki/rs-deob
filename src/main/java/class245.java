import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class245 extends class200 {

    @OriginalMember(owner = "client!qf", name = "L", descriptor = "Loa;")
    public static class99 field4224 = class221.method1463(2844, "<br>");

    @OriginalMember(owner = "client!qf", name = "I", descriptor = "Loa;")
    public static class99 field4221 = class221.method1463(2844, "Utiliser");

    @OriginalMember(owner = "client!qf", name = "O", descriptor = "Loa;")
    public static class99 field4227 = class221.method1463(2844, ":assist:");

    @OriginalMember(owner = "client!qf", name = "P", descriptor = "[I")
    public static int[] field4228 = new int[1000];

    @OriginalMember(owner = "client!qf", name = "G", descriptor = "I")
    public static int field4219;

    @OriginalMember(owner = "client!qf", name = "H", descriptor = "I")
    public static int field4220;

    @OriginalMember(owner = "client!qf", name = "K", descriptor = "I")
    public static int field4223;

    @OriginalMember(owner = "client!qf", name = "M", descriptor = "I")
    public static int field4225;

    @OriginalMember(owner = "client!qf", name = "N", descriptor = "Ltg;")
    public static class182 field4226;

    @OriginalMember(owner = "client!qf", name = "J", descriptor = "Lbg;")
    private class237 field4222;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IILoa;)Loa;")
    public final class99 method1582(int arg0, int arg1, class99 arg2) {
        field4219++;
        if (this.field4222 == null) {
            return arg2;
        }
        class169 var4 = (class169) this.field4222.method1550(true, (long) arg1);
        if (arg0 == 5095) {
            return var4 == null ? arg2 : var4.field3016;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIIIZ)V")
    public static final void method1583(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class253.field4372 = arg1;
        class172.field3051 = arg2;
        class24.field366 = arg3;
        class288.field5054 = new class216[arg0][class253.field4372][class172.field3051];
        class112.field2025 = new int[arg0][class253.field4372 + 1][class172.field3051 + 1];
        if (arg4) {
            class107.field1925 = new class216[1][class253.field4372][class172.field3051];
            class60.field1002 = new int[class253.field4372][class172.field3051];
            class64.field1079 = new int[1][class253.field4372 + 1][class172.field3051 + 1];
        } else {
            class107.field1925 = null;
            class60.field1002 = null;
            class64.field1079 = null;
        }
        class12.method82(false);
        class94.field1592 = new class57[500];
        class60.field1003 = 0;
        class255.field4405 = new class57[500];
        class151.field2659 = 0;
        class94.field1585 = new int[arg0][class253.field4372 + 1][class172.field3051 + 1];
        class242.field4198 = new class77[5000];
        class288.field5032 = 0;
        class198.field3451 = new class77[100];
        class196.field3414 = new boolean[class24.field366 + class24.field366 + 1][class24.field366 + class24.field366 + 1];
        class74.field1252 = new boolean[class24.field366 + class24.field366 + 2][class24.field366 + class24.field366 + 2];
        class223.field3871 = new byte[arg0][class253.field4372][class172.field3051];
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(Z)V")
    public static void method1584(boolean arg0) {
        field4228 = null;
        field4226 = null;
        if (arg0) {
            field4227 = null;
        }
        field4224 = null;
        field4221 = null;
        field4227 = null;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(BLik;)V")
    public final void method1585(byte arg0, class261 arg1) {
        while (true) {
            int var3 = arg1.method1693((byte) -124);
            if (var3 == 0) {
                int var4 = -106 % ((arg0 + 4) / 48);
                field4225++;
                return;
            }
            this.method1586(var3, arg1, -127);
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(ILik;I)V")
    private final void method1586(int arg0, class261 arg1, int arg2) {
        int var4 = 111 / ((-arg2 - 66) / 55);
        if (arg0 == 249) {
            int var5 = arg1.method1693((byte) -105);
            if (this.field4222 == null) {
                int var6 = class48.method342(1049852161, var5);
                this.field4222 = new class237(var6);
            }
            for (int var7 = 0; var7 < var5; var7++) {
                boolean var8 = arg1.method1693((byte) 24) == 1;
                int var9 = arg1.method1747(false);
                class125 var10;
                if (var8) {
                    var10 = new class169(arg1.method1705(7));
                } else {
                    var10 = new class208(arg1.method1712(-4));
                }
                this.field4222.method1544((byte) 77, (long) var9, var10);
            }
        }
        field4223++;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIB)I")
    public final int method1587(int arg0, int arg1, byte arg2) {
        if (arg2 != 22) {
            field4221 = null;
        }
        field4220++;
        if (this.field4222 == null) {
            return arg0;
        } else {
            class208 var4 = (class208) this.field4222.method1550(true, (long) arg1);
            return var4 == null ? arg0 : var4.field3605;
        }
    }
}
