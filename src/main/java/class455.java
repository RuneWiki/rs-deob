import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public class class455 {

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "Lni;")
    public static class367 field6840 = new class367(73, -1);

    @OriginalMember(owner = "client!jk", name = "c", descriptor = "Lfg;")
    public static class84 field6842 = new class84(6, 0, 4, 2);

    @OriginalMember(owner = "client!jk", name = "e", descriptor = "Lof;")
    public static class446 field6844 = new class446(" is already on your ignore list.", " steht bereits auf deiner Ignorieren-Liste!", " est déjà dans votre liste noire.", " já está na sua lista de ignorados.");

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "I")
    public static int field6841;

    @OriginalMember(owner = "client!jk", name = "d", descriptor = "[[B")
    public static byte[][] field6843;

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "()V")
    public static final void method2768() {
        class129.method875(1, class141.field1892);
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(B)V")
    public static final void method2769(byte arg0) {
        class514.field7552.method450((byte) 73);
        field6841++;
        class54 var1 = (class54) class131.field1769.method445(33);
        if (arg0 != 113) {
            return;
        }
        while (var1 != null) {
            if (var1.field764 < 1000) {
                var1.method25(-13489);
                class514.field7552.method453((byte) 105, var1);
            }
            var1 = (class54) class131.field1769.method451(false);
        }
        class514.field7552.method452(class131.field1769, (byte) -126);
        int var2 = -1;
        class245 var3 = (class245) class212.field3001.method445(33);
        if (var3 != null) {
            var2 = var3.method1569(3);
        }
        if (!class139.field1850) {
            if (var2 == 0 && (class259.field3661 == 1 && class367.field5621 > 2 || class301.method1909(-126))) {
                var2 = 2;
            }
            if (var2 == 2 && class367.field5621 > 0 && var3 != null) {
                if (class466.field6949 == null && class268.field3734 == 0) {
                    class78.method540(8, var3.method1571(true), var3.method1567(-20707));
                } else {
                    class270.field3761 = 2;
                }
            }
            if (var2 == 0 && class367.field5621 > 0) {
                class31.method269(arg0 ^ 0x73);
            }
            if (class466.field6949 == null && class268.field3734 == 0) {
                class336.field5212 = null;
                class270.field3761 = 0;
                return;
            }
            return;
        }
        if (var2 == -1) {
            int var4 = class502.field7404.method2323((byte) -87);
            int var5 = class502.field7404.method2325(99);
            if (var4 < class194.field2594 - 10 || class194.field2594 - (-class428.field6504 - 10) < var4 || (class54.field756 - 10) > var5 || var5 > class54.field756 + class392.field5988 + 10) {
                class276.method1782(arg0 ^ 0xFFFFFFF5);
            }
        }
        if (var2 != 0) {
            return;
        }
        int var6 = class194.field2594;
        int var7 = class54.field756;
        int var8 = class428.field6504;
        int var9 = var3.method1571(true);
        int var10 = var3.method1567(-20707);
        int var11 = -1;
        for (int var12 = 0; var12 < class367.field5621; var12++) {
            if (class232.field3307) {
                int var16 = (class367.field5621 - var12 - 1) * 16 + var7 + 33;
                if (var6 < var9 && var9 < (var6 + var8) && (var16 - 13) < var10 && var10 < var16 + 4) {
                    var11 = var12;
                }
            } else {
                int var17 = (class367.field5621 - var12 - 1) * 16 + var7 + 31;
                if (var9 > var6 && var9 < (var6 + var8) && var10 > (var17 - 13) && var17 + 3 > var10) {
                    var11 = var12;
                }
            }
        }
        if (var11 != -1) {
            int var13 = 0;
            class162 var14 = new class162(class131.field1769);
            for (class54 var15 = (class54) var14.method1042(765); var15 != null; var15 = (class54) var14.method1041((byte) -70)) {
                if (var11 == var13) {
                    class292.method1864((byte) 91, var15, var10, var9);
                }
                var13++;
            }
        }
        class276.method1782(-104);
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(I)V")
    public static void method2770(int arg0) {
        field6843 = null;
        if (arg0 == 0) {
            field6840 = null;
            field6842 = null;
            field6844 = null;
        }
    }
}
