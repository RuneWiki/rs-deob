import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vr")
public class class89 {

    @OriginalMember(owner = "client!vr", name = "f", descriptor = "Z")
    public boolean field1216 = true;

    @OriginalMember(owner = "client!vr", name = "e", descriptor = "I")
    public static int field1215 = 0;

    @OriginalMember(owner = "client!vr", name = "h", descriptor = "Lfg;")
    public static class83 field1218 = new class83("Loaded title screen", "Titelbild geladen.", "Écran-titre chargé", "Tela título carregada");

    @OriginalMember(owner = "client!vr", name = "l", descriptor = "[I")
    public static int[] field1222 = new int[1];

    @OriginalMember(owner = "client!vr", name = "i", descriptor = "I")
    public static int field1219 = 0;

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "C")
    private char field1211;

    @OriginalMember(owner = "client!vr", name = "b", descriptor = "I")
    public static int field1212;

    @OriginalMember(owner = "client!vr", name = "c", descriptor = "I")
    public static int field1213;

    @OriginalMember(owner = "client!vr", name = "d", descriptor = "I")
    public static int field1214;

    @OriginalMember(owner = "client!vr", name = "j", descriptor = "I")
    public int field1220;

    @OriginalMember(owner = "client!vr", name = "k", descriptor = "I")
    public static int field1221;

    @OriginalMember(owner = "client!vr", name = "g", descriptor = "Ljava/lang/String;")
    public String field1217;

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(I)Z")
    public final boolean method615(int arg0) {
        field1221++;
        if (arg0 < 23) {
            field1218 = null;
        }
        return this.field1211 == 's';
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(B)[Lfm;")
    public static final class515[] method616(byte arg0) {
        if (arg0 != -2) {
            field1222 = null;
        }
        field1214++;
        return new class515[] { class33.field467, class140.field1994, class153.field2202 };
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(ILlh;I)V")
    private final void method617(int arg0, class365 arg1, int arg2) {
        if (arg0 != -5) {
            method616((byte) 70);
        }
        if (arg2 == 1) {
            this.field1211 = class376.method2168(arg1.method2081((byte) 109), (byte) -126);
        } else if (arg2 == 2) {
            this.field1220 = arg1.method2056((byte) 126);
        } else if (arg2 == 4) {
            this.field1216 = false;
        } else if (arg2 == 5) {
            this.field1217 = arg1.method2106(-1);
        }
        field1213++;
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(ILlh;)V")
    public final void method618(int arg0, class365 arg1) {
        field1212++;
        while (true) {
            int var3 = arg1.method2099(255);
            if (var3 == 0) {
                if (arg0 > -112) {
                    this.method615(54);
                    return;
                } else {
                    return;
                }
            }
            this.method617(-5, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!vr", name = "b", descriptor = "(I)V")
    public static void method619(int arg0) {
        if (arg0 == -31396) {
            field1222 = null;
            field1218 = null;
        }
    }
}
