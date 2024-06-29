import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class293 {

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "[I")
    private int[] field4300;

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "Lnj;")
    public static class487 field4301 = new class487("You can't add yourself to your own friends list.", "Du kannst dich nicht auf deine eigene Freunde-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste d'amis.", "Você não pode adicionar a si próprio à sua lista de amigos.");

    @OriginalMember(owner = "client!ab", name = "g", descriptor = "[I")
    public static int[] field4304 = new int[5];

    @OriginalMember(owner = "client!ab", name = "f", descriptor = "Lica;")
    public static class205 field4303 = new class205(16);

    @OriginalMember(owner = "client!ab", name = "i", descriptor = "I")
    public static int field4306 = 0;

    @OriginalMember(owner = "client!ab", name = "h", descriptor = "I")
    public static int field4305 = -1;

    @OriginalMember(owner = "client!ab", name = "j", descriptor = "Lnj;")
    public static class487 field4307 = new class487("Loaded textures", "Texturen geladen.", "Textures chargées", "Texturas carregadas");

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "I")
    public static int field4298;

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "I")
    public static int field4299;

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "Lha;")
    public static class116 field4302;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IZ)I")
    public final int method1823(int arg0, boolean arg1) {
        field4298++;
        int var3 = (this.field4300.length >> 1) - 1;
        if (!arg1) {
            return -103;
        }
        int var4 = var3 & arg0;
        while (true) {
            int var5 = this.field4300[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field4300[var4 + var4] == arg0) {
                return var5;
            }
            var4 = var4 + 1 & var3;
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)V")
    public static final void method1824(int arg0) {
        if (arg0 != 128) {
            field4304 = null;
        }
        if (class313.field4699 == null) {
            class417 var1 = new class417();
            byte[] var2 = var1.method2481(128, 0, 16, 128);
            class313.field4699 = class149.method877(var2, false, 118);
        }
        field4299++;
        if (class114.field1510 == null) {
            class189 var3 = new class189();
            byte[] var4 = var3.method1232(128, 128, 16, (byte) 13);
            class114.field1510 = class149.method877(var4, false, 106);
        }
    }

    @OriginalMember(owner = "client!ab", name = "<init>", descriptor = "([I)V")
    public class293(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length >> 1) + arg0.length; var2 <<= 0x1) {
        }
        this.field4300 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field4300[var3] = -1;
        }
        int var4 = 0;
        while (var4 < arg0.length) {
            int var5;
            for (var5 = var2 - 1 & arg0[var4]; this.field4300[var5 + var5 + 1] != -1; var5 = var2 - 1 & var5 - -1) {
            }
            this.field4300[var5 + var5] = arg0[var4];
            this.field4300[var5 + var5 + 1] = var4++;
        }
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(I)V")
    public static void method1825(int arg0) {
        field4302 = null;
        field4304 = null;
        field4303 = null;
        if (arg0 != 128) {
            method1824(106);
        }
        field4307 = null;
        field4301 = null;
    }
}
