import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class85 extends class507 {

    @OriginalMember(owner = "client!fg", name = "z", descriptor = "I")
    public int field1017 = 0;

    @OriginalMember(owner = "client!fg", name = "w", descriptor = "I")
    public static int field1014 = 0;

    @OriginalMember(owner = "client!fg", name = "u", descriptor = "Ljc;")
    public static class305 field1012 = new class305("Loaded update list", "Update-Liste geladen.", "Liste des mises à jour chargée", "Lista de atualizações carregada");

    @OriginalMember(owner = "client!fg", name = "B", descriptor = "Ljc;")
    public static class305 field1019 = new class305("Discard", "Ablegen", "Jeter", "Descartar");

    @OriginalMember(owner = "client!fg", name = "t", descriptor = "I")
    public static int field1011;

    @OriginalMember(owner = "client!fg", name = "v", descriptor = "I")
    public static int field1013;

    @OriginalMember(owner = "client!fg", name = "x", descriptor = "I")
    public static int field1015;

    @OriginalMember(owner = "client!fg", name = "y", descriptor = "I")
    public static int field1016;

    @OriginalMember(owner = "client!fg", name = "A", descriptor = "I")
    public static int field1018;

    @OriginalMember(owner = "client!fg", name = "d", descriptor = "(I)V")
    public static final void method463(int arg0) {
        class492.method2979(class288.field3784, 89);
        field1013++;
        class518.field7644++;
        class106.field1443.method2449((byte) 120, class423.method2612(2));
        class106.field1443.method2444((byte) 65, class372.field5051);
        class106.field1443.method2444((byte) 65, class430.field6244);
        class106.field1443.method2449((byte) 124, class319.field4256.field4654);
        if (arg0 != 4510) {
            field1012 = null;
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(B[B)[B")
    public static final byte[] method464(byte arg0, byte[] arg1) {
        field1011++;
        if (arg1 == null) {
            return null;
        }
        byte[] var2 = new byte[arg1.length];
        class438.method2687(arg1, 0, var2, 0, arg1.length);
        if (arg0 > -51) {
            field1014 = 120;
        }
        return var2;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(ILug;)V")
    public static final void method465(int arg0, class396 arg1) {
        field1016++;
        int var2 = arg1.method2443(-104);
        class527.field7742 = new class151[var2];
        for (int var3 = arg0; var3 < var2; var3++) {
            class527.field7742[var3] = new class151();
            class527.field7742[var3].field1980 = arg1.method2443(66);
            class527.field7742[var3].field1972 = arg1.method2420((byte) -67);
        }
        class327.field4345 = arg1.method2443(arg0 + 98);
        class412.field5887 = arg1.method2443(45);
        class527.field7743 = arg1.method2443(-99);
        class178.field2306 = new class54[class412.field5887 + 1 - class327.field4345];
        for (int var4 = 0; var4 < class527.field7743; var4++) {
            int var5 = arg1.method2443(-121);
            class54 var6 = class178.field2306[var5] = new class54();
            var6.field7091 = arg1.method2388((byte) -126);
            var6.field7096 = arg1.method2406((byte) -107);
            var6.field627 = class327.field4345 + var5;
            var6.field626 = arg1.method2420((byte) -67);
            var6.field629 = arg1.method2420((byte) -67);
        }
        class514.field7480 = arg1.method2406((byte) -115);
        class65.field754 = true;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(Lug;Z)V")
    public final void method466(class396 arg0, boolean arg1) {
        field1018++;
        if (arg1) {
            this.method466(null, true);
        }
        while (true) {
            int var3 = arg0.method2388((byte) -127);
            if (var3 == 0) {
                return;
            }
            this.method467(var3, arg0, -80);
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(ILug;I)V")
    private final void method467(int arg0, class396 arg1, int arg2) {
        field1015++;
        int var4 = -83 % ((-arg2 - 33) / 38);
        if (arg0 == 2) {
            this.field1017 = arg1.method2386(-23648);
        }
    }

    @OriginalMember(owner = "client!fg", name = "e", descriptor = "(I)V")
    public static void method468(int arg0) {
        field1019 = null;
        if (arg0 >= -15) {
            method468(100);
        }
        field1012 = null;
    }
}
