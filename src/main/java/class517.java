import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class517 {

    @OriginalMember(owner = "client!ob", name = "i", descriptor = "I")
    public int field7629 = 1;

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "Lqp;")
    public static class466 field7622 = new class466("glow2:", "leuchten2:", "brillant2:", "brilho2:");

    @OriginalMember(owner = "client!ob", name = "g", descriptor = "I")
    public static int field7627 = 0;

    @OriginalMember(owner = "client!ob", name = "e", descriptor = "C")
    public char field7625;

    @OriginalMember(owner = "client!ob", name = "f", descriptor = "F")
    public static float field7626;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "I")
    public static int field7621;

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "I")
    public static int field7623;

    @OriginalMember(owner = "client!ob", name = "d", descriptor = "I")
    public static int field7624;

    @OriginalMember(owner = "client!ob", name = "h", descriptor = "I")
    public static int field7628;

    @OriginalMember(owner = "client!ob", name = "j", descriptor = "I")
    public static int field7630;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(I)V", line = 5)
    public static void method3075(int arg0) {
        field7622 = null;
        int var1 = 83 % ((arg0 + 43) / 48);
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIII)V", line = 16)
    public static final void method3076(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg0 << 3;
        field7624++;
        int var5 = arg2 << 3;
        int var6 = arg1 << arg3;
        if (class491.field7168 == 2) {
            class94.field1399 = var5;
            class107.field1604 = var6;
            class493.field7186 = var4;
        }
        class252.field3498 = var6;
        class498.field7255 = var5;
        class314.method1816(arg3 ^ 0x2838);
        class463.field6805 = true;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(ILsi;)V", line = 39)
    public final void method3077(int arg0, class391 arg1) {
        if (arg0 != -5944) {
            field7627 = 26;
        }
        field7630++;
        while (true) {
            int var3 = arg1.method2348(-2);
            if (var3 == 0) {
                return;
            }
            this.method3078(arg1, var3, false);
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lsi;IZ)V", line = 64)
    private final void method3078(class391 arg0, int arg1, boolean arg2) {
        if (arg2) {
            return;
        }
        if (arg1 == 1) {
            this.field7625 = class52.method452(30668, arg0.method2337(-1));
        } else if (arg1 == 2) {
            this.field7629 = 0;
        }
        field7628++;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIIIIIII)V", line = 87)
    public static final void method3079(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field7623++;
        int var8 = 102 % ((48 - arg3) / 56);
        int var9 = arg0 + arg1;
        int var10 = arg5 - arg1;
        for (int var11 = arg0; var11 < var9; var11++) {
            class210.method1300(arg4, class437.field6400[var11], (byte) 110, arg7, arg6);
        }
        int var12 = arg1 + arg4;
        int var13 = arg7 - arg1;
        for (int var14 = arg5; var14 > var10; var14--) {
            class210.method1300(arg4, class437.field6400[var14], (byte) 72, arg7, arg6);
        }
        for (int var15 = var9; var15 <= var10; var15++) {
            int[] var16 = class437.field6400[var15];
            class210.method1300(arg4, var16, (byte) 123, var12, arg6);
            class210.method1300(var12, var16, (byte) 106, var13, arg2);
            class210.method1300(var13, var16, (byte) 73, arg7, arg6);
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(B)Lmr;", line = 135)
    public static final class96 method3080(byte arg0) {
        field7621++;
        if (arg0 < 109) {
            return null;
        }
        try {
            return new class155();
        } catch (Throwable var2) {
            try {
                return (class96) Class.forName("tr").getDeclaredConstructor().newInstance();
            } catch (Throwable var1) {
                return new class160();
            }
        }
    }
}
