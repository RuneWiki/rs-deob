import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public class class60 extends class193 {

    @OriginalMember(owner = "client!ni", name = "l", descriptor = "I")
    public static int field874;

    @OriginalMember(owner = "client!ni", name = "m", descriptor = "I")
    public static int field875;

    @OriginalMember(owner = "client!ni", name = "n", descriptor = "I")
    public static int field876;

    @OriginalMember(owner = "client!ni", name = "k", descriptor = "Lni;")
    public class60 field873;

    @OriginalMember(owner = "client!ni", name = "o", descriptor = "Lni;")
    public class60 field877;

    @OriginalMember(owner = "client!ni", name = "c", descriptor = "(I)I", line = 12)
    public static final int method475(int arg0) {
        field874++;
        if ((double) class105.field1504 == 3.0D) {
            return 37;
        } else if ((double) class105.field1504 == 4.0D) {
            return 50;
        } else if ((double) class105.field1504 == 6.0D) {
            return 75;
        } else if ((double) class105.field1504 == 8.0D) {
            return 100;
        } else if (arg0 > -79) {
            return -11;
        } else {
            return 200;
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(B)V", line = 36)
    public static final void method476(byte arg0) {
        field875++;
        class245.method1798();
        class85.field1204 = new class163[8];
        class85.field1204[1] = new class269();
        class85.field1204[2] = new class153();
        class85.field1204[3] = new class39();
        class85.field1204[4] = new class161();
        class85.field1204[5] = new class220();
        class85.field1204[6] = new class293();
        if (arg0 == -124) {
            class85.field1204[7] = new class302();
        }
    }

    @OriginalMember(owner = "client!ni", name = "d", descriptor = "(I)V", line = 57)
    public final void method477(int arg0) {
        field876++;
        if (this.field873 == null) {
            return;
        }
        this.field873.field877 = this.field877;
        if (arg0 != -11336) {
            this.field873 = (class60) null;
        }
        this.field877.field873 = this.field873;
        this.field873 = null;
        this.field877 = null;
    }
}
