import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fq")
public class class97 extends class467 {

    @OriginalMember(owner = "client!fq", name = "o", descriptor = "J")
    public long field1406;

    @OriginalMember(owner = "client!fq", name = "r", descriptor = "I")
    public static int field1409 = 0;

    @OriginalMember(owner = "client!fq", name = "s", descriptor = "I")
    public static int field1410 = 0;

    @OriginalMember(owner = "client!fq", name = "q", descriptor = "Lui;")
    public static class375 field1408 = new class375("Loaded interfaces", "Benutzeroberfläche geladen.", "Interfaces chargées", "Interfaces carregadas");

    @OriginalMember(owner = "client!fq", name = "n", descriptor = "I")
    public static int field1405;

    @OriginalMember(owner = "client!fq", name = "t", descriptor = "I")
    public static int field1411;

    @OriginalMember(owner = "client!fq", name = "p", descriptor = "Lns;")
    public static class438 field1407;

    static {
        new class375("Invalid name", "Unzulässiger Name!", "Nom incorrect", "Nome inválido");
    }

    @OriginalMember(owner = "client!fq", name = "b", descriptor = "(I)V", line = 6)
    public static void method667(int arg0) {
        field1407 = null;
        field1408 = null;
        int var1 = -81 / ((arg0 + 64) / 56);
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(Lbw;BI)V", line = 16)
    public static final void method668(class20 arg0, byte arg1, int arg2) {
        field1411++;
        if (class518.field7689) {
            arg2 = 0;
            class518.field7689 = false;
        }
        if (class6.field85 == null || !class6.field85.method164(arg0, 0)) {
            class6.field85 = arg0;
            class55.field749 = class264.method1698(true);
            class274.field3812 = arg2;
            class124.field1778 = arg2;
            if (class124.field1778 == 0) {
                class98.method671((byte) 73);
            } else {
                class251.field3478 = class333.field5148;
                class435.field6468 = class197.field2783;
                class256.field3547 = class504.field7528;
                class162.field2366 = class193.field2741;
                class103.field1472 = class205.field2895;
                class16.field265 = class370.field5683;
                class25.field407 = class163.field2389;
                class75.field1020 = class327.field5014;
                class36.field587 = class36.field579;
                class456.field6695 = class513.field7615;
            }
        }
        if (arg1 != 122) {
            method667(74);
        }
    }

    @OriginalMember(owner = "client!fq", name = "<init>", descriptor = "()V", line = 68)
    public class97() {
    }

    @OriginalMember(owner = "client!fq", name = "<init>", descriptor = "(J)V", line = 70)
    public class97(long arg0) {
        this.field1406 = arg0;
    }
}
