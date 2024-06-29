import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class395 {

    @OriginalMember(owner = "client!cf", name = "f", descriptor = "I")
    private int field5489 = 0;

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "Lgca;")
    private class209 field5486;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "I")
    public static int field5484 = 100;

    @OriginalMember(owner = "client!cf", name = "j", descriptor = "J")
    public static long field5493 = 0L;

    @OriginalMember(owner = "client!cf", name = "i", descriptor = "I")
    public static int field5492 = -50;

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "Lag;")
    public static class214 field5485 = new class214(6, 1);

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "I")
    public static int field5487;

    @OriginalMember(owner = "client!cf", name = "h", descriptor = "I")
    public static int field5491;

    @OriginalMember(owner = "client!cf", name = "g", descriptor = "Ltq;")
    private class513 field5490;

    @OriginalMember(owner = "client!cf", name = "e", descriptor = "Lwu;")
    public static class557 field5488;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(B)V")
    public static void method2405(byte arg0) {
        if (arg0 == 120) {
            field5488 = null;
            field5485 = null;
        }
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(B)Ltq;")
    public final class513 method2406(byte arg0) {
        field5491++;
        if (arg0 != 12) {
            this.field5486 = null;
        }
        this.field5489 = 0;
        return this.method2407(38);
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)Ltq;")
    public final class513 method2407(int arg0) {
        field5487++;
        if (arg0 <= 36) {
            this.field5486 = null;
        }
        if (this.field5489 > 0 && this.field5486.field2959[this.field5489 - 1] != this.field5490) {
            class513 var2 = this.field5490;
            this.field5490 = var2.field7165;
            return var2;
        }
        while (this.field5486.field2955 > this.field5489) {
            class513 var3 = this.field5486.field2959[this.field5489++].field7165;
            if (this.field5486.field2959[this.field5489 - 1] != var3) {
                this.field5490 = var3.field7165;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!cf", name = "<init>", descriptor = "()V")
    public class395() {
    }

    @OriginalMember(owner = "client!cf", name = "<init>", descriptor = "(Lgca;)V")
    public class395(class209 arg0) {
        this.field5486 = arg0;
    }
}
