import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class106 {

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "[Lsp;")
    private class452[] field1488;

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "I")
    private int field1490;

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "I")
    public static int field1491;

    @OriginalMember(owner = "client!vf", name = "g", descriptor = "I")
    public static int field1494;

    @OriginalMember(owner = "client!vf", name = "i", descriptor = "I")
    public static int field1496;

    @OriginalMember(owner = "client!vf", name = "j", descriptor = "I")
    public static int field1497;

    @OriginalMember(owner = "client!vf", name = "k", descriptor = "I")
    public static int field1498;

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "J")
    private long field1489;

    @OriginalMember(owner = "client!vf", name = "f", descriptor = "Lsp;")
    private class452 field1493;

    @OriginalMember(owner = "client!vf", name = "e", descriptor = "Z")
    public static boolean field1492;

    @OriginalMember(owner = "client!vf", name = "h", descriptor = "[S")
    public static short[] field1495;

    static {
        new class234("Swap this note at any bank for the equivalent item.", "Dieses Zertifikat kann in einer Bank entsprechend eingetauscht werden.", "Échangez ce reçu contre l'objet correspondant dans la banque de votre choix.", "Vá a qualquer banco para trocar esta nota pelo objeto equivalente.");
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IJ)Lsp;", line = 4)
    public final class452 method821(int arg0, long arg1) {
        field1498++;
        this.field1489 = arg1;
        class452 var4 = this.field1488[(int) (arg1 & (long) (this.field1490 - 1))];
        for (this.field1493 = var4.field6598; this.field1493 != var4; this.field1493 = this.field1493.field6598) {
            if (this.field1493.field6596 == arg1) {
                class452 var5 = this.field1493;
                this.field1493 = this.field1493.field6598;
                return var5;
            }
        }
        this.field1493 = null;
        if (arg0 != -3) {
            this.field1490 = -112;
        }
        return null;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(B)V", line = 41)
    public static void method822(byte arg0) {
        if (arg0 >= -78) {
            method823(116, -127, 126, 92, -98, (byte) -37, -40, null, -57, -61, -47, null, 109);
        }
        field1495 = null;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIIIIBI[[[BIIILya;I)V", line = 51)
    public static final void method823(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, byte[][][] arg7, int arg8, int arg9, int arg10, class38 arg11, int arg12) {
        field1496++;
        if (arg0 == 0 || arg8 == 0) {
            return;
        }
        if (arg0 == 9) {
            arg0 = 1;
            arg6 = arg6 + 1 & 0x3;
        }
        if (arg5 > -13) {
            field1497 = 52;
        }
        if (arg0 == 10) {
            arg0 = 1;
            arg6 = arg6 + 3 & 0x3;
        }
        if (arg0 == 11) {
            arg6 = arg6 + 3 & 0x3;
            arg0 = 8;
        }
        arg11.method326(arg3, arg9, arg4, arg12, arg1, arg10, arg7[arg0 - 1][arg6], arg8, arg2);
    }

    @OriginalMember(owner = "client!vf", name = "<init>", descriptor = "(I)V", line = 93)
    public class106(int arg0) {
        this.field1488 = new class452[arg0];
        this.field1490 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class452 var3 = this.field1488[var2] = new class452();
            var3.field6598 = var3;
            var3.field6603 = var3;
        }
    }

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(B)Lsp;", line = 126)
    public final class452 method824(byte arg0) {
        field1491++;
        if (this.field1493 == null) {
            return null;
        }
        class452 var2 = this.field1488[(int) (this.field1489 & (long) (this.field1490 - 1))];
        if (arg0 < 102) {
            return null;
        }
        while (this.field1493 != var2) {
            if (this.field1493.field6596 == this.field1489) {
                class452 var3 = this.field1493;
                this.field1493 = this.field1493.field6598;
                return var3;
            }
            this.field1493 = this.field1493.field6598;
        }
        this.field1493 = null;
        return null;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lsp;JI)V", line = 159)
    public final void method825(class452 arg0, long arg1, int arg2) {
        if (arg0.field6603 != null) {
            arg0.method2754(-152804768);
        }
        field1494++;
        class452 var5 = this.field1488[(int) (arg1 & (long) (this.field1490 - 1))];
        arg0.field6603 = var5.field6603;
        arg0.field6598 = var5;
        if (arg2 != 0) {
            this.field1488 = null;
        }
        arg0.field6603.field6598 = arg0;
        arg0.field6598.field6603 = arg0;
        arg0.field6596 = arg1;
    }
}
