import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class476 extends class11 {

    @OriginalMember(owner = "client!ee", name = "I", descriptor = "I")
    private int field6940 = 585;

    @OriginalMember(owner = "client!ee", name = "J", descriptor = "Lqp;")
    public static class466 field6941 = new class466("Connected to update server", "Verbindung zum Update-Server hergestellt.", "Connecté au serveur de mise à jour", "Conectado ao servidor de atualização");

    @OriginalMember(owner = "client!ee", name = "K", descriptor = "Z")
    public static boolean field6942 = false;

    @OriginalMember(owner = "client!ee", name = "L", descriptor = "Lqp;")
    public static class466 field6943 = new class466("Loaded core fonts", "Schriftarten geladen", "Polices chargées", "Fontes principais carregadas");

    @OriginalMember(owner = "client!ee", name = "N", descriptor = "[Z")
    public static boolean[] field6945 = new boolean[8];

    @OriginalMember(owner = "client!ee", name = "M", descriptor = "I")
    public static int field6944 = 0;

    @OriginalMember(owner = "client!ee", name = "G", descriptor = "I")
    public static int field6938;

    @OriginalMember(owner = "client!ee", name = "H", descriptor = "I")
    public static int field6939;

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "(II)[I", line = 3)
    public final int[] method44(int arg0, int arg1) {
        ++field6939;
        if (arg0 >= -42) {
            this.method44(100, -61);
        }
        int[] var3 = super.field158.method1312(arg1, (byte) 74);
        if (super.field158.field2966) {
            int var4 = class328.field4484[arg1];
            for (int var5 = 0; class90.field1316 > var5; ++var5) {
                int var6 = class448.field6606[var5];
                if (~var6 < ~this.field6940 && var6 < -this.field6940 + 4096 && -this.field6940 + 2048 < var4 && var4 < this.field6940 + 2048) {
                    int var7 = 2048 - var6;
                    int var8 = var7 >= 0 ? var7 : -var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (2048 - this.field6940);
                    var3[var5] = -var10 + 4096;
                } else if (-this.field6940 + 2048 < var6 && ~var6 > ~(this.field6940 + 2048)) {
                    int var11 = var4 - 2048;
                    int var12 = var11 < 0 ? -var11 : var11;
                    int var13 = var12 - this.field6940;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (-this.field6940 + 2048);
                } else if (var4 >= this.field6940 && var4 <= -this.field6940 + 4096) {
                    if (~this.field6940 >= ~var6 && ~var6 >= ~(-this.field6940 + 4096)) {
                        var3[var5] = 0;
                    } else {
                        int var15 = -var4 + 2048;
                        int var16 = var15 >= 0 ? var15 : -var15;
                        int var17 = var16 << 12;
                        int var18 = var17 / (-this.field6940 + 2048);
                        var3[var5] = -var18 + 4096;
                    }
                } else {
                    int var19 = var6 + -2048;
                    int var20 = ~var19 > -1 ? -var19 : var19;
                    int var21 = var20 - this.field6940;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (-this.field6940 + 2048);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "(B)V", line = 84)
    public static void method2793(byte arg0) {
        field6941 = null;
        int var1 = 56 / ((55 - arg0) / 33);
        field6945 = null;
        field6943 = null;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lsi;II)V", line = 100)
    public final void method43(class391 arg0, int arg1, int arg2) {
        ++field6938;
        if (arg1 >= -40) {
            field6943 = null;
        }
        if (arg2 == 0) {
            this.field6940 = arg0.method2353((byte) 68);
        }
    }

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "(III)Lhm;", line = 128)
    public static final class147 method2794(int arg0, int arg1, int arg2) {
        class486 var3 = class89.field1305[arg0][arg1][arg2];
        return var3 == null ? null : var3.field7105;
    }

    @OriginalMember(owner = "client!ee", name = "<init>", descriptor = "()V", line = 139)
    public class476() {
        super(0, true);
    }
}
