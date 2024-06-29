import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class322 {

    @OriginalMember(owner = "client!lb", name = "h", descriptor = "Lwq;")
    private class92 field4583;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "Liq;")
    public static class362 field4576 = new class362("Loaded title screen", "Titelbild geladen.", "Écran-titre chargé", "Tela título carregada");

    @OriginalMember(owner = "client!lb", name = "j", descriptor = "[I")
    public static int[] field4585 = new int[13];

    @OriginalMember(owner = "client!lb", name = "i", descriptor = "Liq;")
    public static class362 field4584 = new class362("cyan:", "blaugrün:", "cyan:", "cyan:");

    @OriginalMember(owner = "client!lb", name = "n", descriptor = "I")
    public static int field4589 = 0;

    @OriginalMember(owner = "client!lb", name = "m", descriptor = "Lva;")
    public static class288 field4588 = new class288(512);

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "I")
    public static int field4577;

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "I")
    public static int field4578;

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "I")
    public static int field4579;

    @OriginalMember(owner = "client!lb", name = "e", descriptor = "I")
    public static int field4580;

    @OriginalMember(owner = "client!lb", name = "g", descriptor = "I")
    public static int field4582;

    @OriginalMember(owner = "client!lb", name = "k", descriptor = "I")
    public static int field4586;

    @OriginalMember(owner = "client!lb", name = "l", descriptor = "Ltq;")
    public static class376 field4587;

    @OriginalMember(owner = "client!lb", name = "f", descriptor = "Lqf;")
    private class406 field4581;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(BI)V")
    public static final void method2098(byte arg0, int arg1) {
        field4580++;
        class237 var2 = class141.field1742;
        synchronized (class141.field1742) {
            if (arg0 >= 29) {
                class141.field1742.method1629(arg1, 84);
            }
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Ltq;B)V")
    public static final void method2099(class376 arg0, byte arg1) {
        class161.field2134 = arg0.method2418("titlebg", (byte) -23);
        if (arg1 != -106) {
            method2099((class376) null, (byte) -78);
        }
        field4578++;
        class163.field2222 = arg0.method2418("logo", (byte) -23);
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(I)Lqf;")
    public final class406 method2100(int arg0) {
        if (arg0 != 512) {
            field4587 = null;
        }
        field4579++;
        class406 var2 = this.field4581;
        if (this.field4583.field1104 == var2) {
            this.field4581 = null;
            return null;
        } else {
            this.field4581 = var2.field5862;
            return var2;
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(B)V")
    public static void method2101(byte arg0) {
        field4584 = null;
        field4587 = null;
        field4585 = null;
        field4588 = null;
        field4576 = null;
        if (arg0 != 45) {
            field4585 = null;
        }
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(I)Lqf;")
    public final class406 method2102(int arg0) {
        field4577++;
        class406 var2 = this.field4583.field1104.field5862;
        if (arg0 != 13) {
            method2101((byte) 35);
        }
        if (this.field4583.field1104 == var2) {
            this.field4581 = null;
            return null;
        } else {
            this.field4581 = var2.field5862;
            return var2;
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lwq;I)V")
    public final void method2103(class92 arg0, int arg1) {
        if (arg1 == 0) {
            this.field4583 = arg0;
            field4582++;
        }
    }

    @OriginalMember(owner = "client!lb", name = "<init>", descriptor = "()V")
    public class322() {
    }

    @OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(Lwq;)V")
    public class322(class92 arg0) {
        this.field4583 = arg0;
    }
}
