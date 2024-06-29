import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class392 extends class251 {

    @OriginalMember(owner = "client!v", name = "w", descriptor = "I")
    public int field5736 = 0;

    @OriginalMember(owner = "client!v", name = "y", descriptor = "Lsk;")
    public static class423 field5738 = new class423(" from your ignore list first.", " zuerst von deiner Ignorieren-Liste!", " de votre liste noire.", " da sua lista de ignorados primeiro.");

    @OriginalMember(owner = "client!v", name = "A", descriptor = "I")
    public static int field5740;

    @OriginalMember(owner = "client!v", name = "t", descriptor = "I")
    public static int field5733;

    @OriginalMember(owner = "client!v", name = "u", descriptor = "I")
    public static int field5734;

    @OriginalMember(owner = "client!v", name = "v", descriptor = "I")
    public static int field5735;

    @OriginalMember(owner = "client!v", name = "x", descriptor = "I")
    public static int field5737;

    @OriginalMember(owner = "client!v", name = "z", descriptor = "I")
    public static int field5739;

    static {
        new class423("Loaded additional fonts", "Zusatzschriftarten geladen", "Polices secondaires chargées", "Fontes principais carregadas");
        field5740 = -1;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(ZLha;I)V", line = 3)
    private final void method2332(boolean arg0, class40 arg1, int arg2) {
        if (arg2 == 2) {
            this.field5736 = arg1.method254((byte) -117);
        }
        if (arg0) {
            field5733++;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Lha;I)V", line = 20)
    public final void method2333(class40 arg0, int arg1) {
        field5735++;
        int var3 = 96 % ((arg1 + 1) / 32);
        while (true) {
            int var4 = arg0.method257((byte) 68);
            if (var4 == 0) {
                return;
            }
            this.method2332(true, arg0, var4);
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IIBII)V", line = 42)
    public static final void method2334(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        field5734++;
        int var5 = 0;
        int var6 = arg1;
        int var7 = -arg1;
        int var8 = -1;
        class78.method566(class69.field1212[arg0], arg1 + arg3, arg4, -7, arg3 - arg1);
        while (var6 > var5) {
            var8 += 2;
            var5++;
            var7 += var8;
            if (var7 >= 0) {
                var6--;
                var7 -= var6 << 1;
                int[] var9 = class69.field1212[arg0 + var6];
                int[] var10 = class69.field1212[arg0 - var6];
                int var11 = arg3 + var5;
                int var12 = arg3 - var5;
                class78.method566(var9, var11, arg4, -7, var12);
                class78.method566(var10, var11, arg4, arg2 - 28, var12);
            }
            int var13 = arg3 + var6;
            int var14 = arg3 - var6;
            int[] var15 = class69.field1212[arg0 + var5];
            int[] var16 = class69.field1212[arg0 - var5];
            class78.method566(var15, var13, arg4, -7, var14);
            class78.method566(var16, var13, arg4, -7, var14);
        }
        if (arg2 != 21) {
            method2334(-44, 120, (byte) -79, -112, -126);
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(B)V", line = 96)
    public static void method2335(byte arg0) {
        int var1 = 94 / ((-arg0 - 6) / 57);
        field5738 = null;
    }

    @OriginalMember(owner = "client!v", name = "f", descriptor = "(I)Z", line = 112)
    public static final boolean method2336(int arg0) {
        field5737++;
        try {
            return arg0 == -51 ? class160.method1025((byte) 74) : false;
        } catch (IOException var4) {
            class499.method3001(-93);
            return true;
        } catch (Exception var5) {
            String var2 = "T2 - " + (class374.field5459 == null ? -1 : class374.field5459.method865(97)) + "," + (class257.field3918 == null ? -1 : class257.field3918.method865(97)) + "," + (class461.field7090 == null ? -1 : class461.field7090.method865(97)) + " - " + class60.field1014 + "," + (class381.field5550 + class286.field4329.field2232[0]) + "," + (class286.field4329.field2239[0] + class320.field4827) + " - ";
            for (int var3 = 0; var3 < class60.field1014 && var3 < 50; var3++) {
                var2 = var2 + class491.field7457.field536[var3] + ",";
            }
            class32.method177(var5, (byte) -114, var2);
            class345.method2114(0);
            return true;
        }
    }
}
