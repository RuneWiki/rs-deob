import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class467 extends class489 {

    @OriginalMember(owner = "client!gh", name = "L", descriptor = "I")
    public static int field6532 = 1338;

    @OriginalMember(owner = "client!gh", name = "O", descriptor = "I")
    public static int field6535 = 1;

    @OriginalMember(owner = "client!gh", name = "P", descriptor = "Lcea;")
    public static class180 field6536 = new class180("Unable to find ", "Spieler kann nicht gefunden werden: ", "Impossible de trouver ", "Não é possível encontrar ");

    @OriginalMember(owner = "client!gh", name = "G", descriptor = "I")
    public static int field6528;

    @OriginalMember(owner = "client!gh", name = "H", descriptor = "I")
    public static int field6529;

    @OriginalMember(owner = "client!gh", name = "K", descriptor = "I")
    public static int field6531;

    @OriginalMember(owner = "client!gh", name = "N", descriptor = "I")
    public static int field6534;

    @OriginalMember(owner = "client!gh", name = "M", descriptor = "Ldj;")
    public static class287 field6533;

    @OriginalMember(owner = "client!gh", name = "J", descriptor = "[B")
    private byte[] field6530;

    @OriginalMember(owner = "client!gh", name = "<init>", descriptor = "()V")
    public class467() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "(IIII)[B")
    public final byte[] method2723(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 != 4096) {
            this.field6530 = null;
        }
        this.field6530 = new byte[arg3 * 2 * arg0 * arg2];
        field6534++;
        this.method1777(-90, arg2, arg0, arg3);
        return this.field6530;
    }

    @OriginalMember(owner = "client!gh", name = "e", descriptor = "(I)V")
    public static final void method2724(int arg0) {
        field6529++;
        class250.field3228 = new class114[50];
        class570.field8370 = arg0;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(BBI)V")
    public final void method2725(byte arg0, byte arg1, int arg2) {
        if (arg1 <= 115) {
            this.method2725((byte) 109, (byte) -47, -35);
        }
        field6531++;
        int var4 = arg2 * 2;
        int var10001 = var4;
        int var6 = var4 + 1;
        this.field6530[var10001] = -1;
        int var5 = arg0 & 0xFF;
        this.field6530[var6] = (byte) (var5 * 3 >> 5);
    }

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "(B)V")
    public static void method2726(byte arg0) {
        field6536 = null;
        if (arg0 == -47) {
            field6533 = null;
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(BI)I")
    public static final int method2727(byte arg0, int arg1) {
        field6528++;
        int var2 = (arg1 >>> 1 & 0x55555555) + (arg1 & 0x55555555);
        int var3 = (var2 >>> 2 & 0xB3333333) + (var2 & 0x33333333);
        if (arg0 > -111) {
            field6533 = null;
        }
        int var4 = var3 + (var3 >>> 4) & 0xF0F0F0F;
        int var5 = (var4 >>> 8) + var4;
        int var6 = (var5 >>> 16) + var5;
        return var6 & 0xFF;
    }
}
