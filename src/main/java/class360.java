import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public class class360 extends class223 {

    @OriginalMember(owner = "client!ni", name = "n", descriptor = "S")
    public short field5002;

    @OriginalMember(owner = "client!ni", name = "l", descriptor = "I")
    public static int field5000;

    @OriginalMember(owner = "client!ni", name = "m", descriptor = "I")
    public static int field5001;

    static {
        new class331("You do not have a high enough rank to join this clan channel.", "Dein Rang reicht nicht aus, um diesen Chatraum zu betreten.", "Votre rang n'est pas assez élevé pour rejoindre ce canal de clan.", "Sua posição não é alta o suficiente para você entrar nesse canal de clã.");
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "([III[Ljava/lang/Object;I)V", line = 11)
    public static final void method2162(int[] arg0, int arg1, int arg2, Object[] arg3, int arg4) {
        if (arg4 > -47) {
            return;
        }
        field5001++;
        if (arg1 <= arg2) {
            return;
        }
        int var5 = (arg1 + arg2) / 2;
        int var6 = arg2;
        int var7 = arg0[var5];
        arg0[var5] = arg0[arg1];
        arg0[arg1] = var7;
        Object var8 = arg3[var5];
        arg3[var5] = arg3[arg1];
        arg3[arg1] = var8;
        int var9 = ~var7 == Integer.MIN_VALUE ? 0 : 1;
        for (int var10 = arg2; var10 < arg1; var10++) {
            if (((var10 & var9) + var7) > arg0[var10]) {
                int var11 = arg0[var10];
                arg0[var10] = arg0[var6];
                arg0[var6] = var11;
                Object var12 = arg3[var10];
                arg3[var10] = arg3[var6];
                arg3[var6++] = var12;
            }
        }
        arg0[arg1] = arg0[var6];
        arg0[var6] = var7;
        arg3[arg1] = arg3[var6];
        arg3[var6] = var8;
        method2162(arg0, var6 - 1, arg2, arg3, -81);
        method2162(arg0, arg1, var6 + 1, arg3, -58);
    }

    @OriginalMember(owner = "client!ni", name = "<init>", descriptor = "()V", line = 70)
    public class360() {
    }

    @OriginalMember(owner = "client!ni", name = "<init>", descriptor = "(S)V", line = 72)
    public class360(short arg0) {
        this.field5002 = arg0;
    }
}
