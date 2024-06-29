import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class228 {

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "B")
    public byte field3165;

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "S")
    public short field3164;

    @OriginalMember(owner = "client!fh", name = "e", descriptor = "Lic;")
    private class246 field3167;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "Leb;")
    public class416 field3163;

    @OriginalMember(owner = "client!fh", name = "d", descriptor = "B")
    public byte field3166;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(I)V", line = 4)
    public final void method1258(int arg0) {
        if (arg0 == 104) {
            this.field3167.method1465(this.field3163);
            this.field3163.method1301(this);
        }
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(I)V", line = 15)
    public final void method1259(int arg0) {
        if (arg0 > -125) {
            this.field3164 = -86;
        }
        this.field3167.method1465(this.field3163);
        this.field3163.method1298(this);
    }

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "(I)V", line = 27)
    public final void method1260(int arg0) {
        this.field3167.method1465(this.field3163);
        if (arg0 < -120) {
            this.field3163.method1300(this);
        }
    }

    @OriginalMember(owner = "client!fh", name = "d", descriptor = "(I)V", line = 39)
    public final void method1261(int arg0) {
        this.field3167.method1465(this.field3163);
        int var2 = -11 % ((arg0 - 42) / 43);
        this.field3163.method1299(this);
    }

    @OriginalMember(owner = "client!fh", name = "<init>", descriptor = "(Lic;Leb;III)V", line = 51)
    public class228(class246 arg0, class416 arg1, int arg2, int arg3, int arg4) {
        this.field3165 = (byte) arg3;
        this.field3164 = (short) arg2;
        this.field3167 = arg0;
        this.field3163 = arg1;
        this.field3166 = (byte) arg4;
    }
}
