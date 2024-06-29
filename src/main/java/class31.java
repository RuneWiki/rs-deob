import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!MPNPHMKJ")
public class class31 {

    @OriginalMember(owner = "client!MPNPHMKJ", name = "b", descriptor = "I")
    private int field978 = 850;

    @OriginalMember(owner = "client!MPNPHMKJ", name = "c", descriptor = "I")
    private int field979;

    @OriginalMember(owner = "client!MPNPHMKJ", name = "d", descriptor = "[LNQPZRHXK;")
    private class35[] field980;

    @OriginalMember(owner = "client!MPNPHMKJ", name = "a", descriptor = "I")
    private int field977;

    @OriginalMember(owner = "client!MPNPHMKJ", name = "<init>", descriptor = "(II)V")
    public class31(int arg0, int arg1) {
        if (arg0 != 0) {
            throw new NullPointerException();
        }
        this.field979 = arg1;
        this.field980 = new class35[arg1];
        for (int var3 = 0; var3 < arg1; var3++) {
            class35 var4 = this.field980[var3] = new class35();
            var4.field1045 = var4;
            var4.field1046 = var4;
        }
    }

    @OriginalMember(owner = "client!MPNPHMKJ", name = "a", descriptor = "(J)LNQPZRHXK;")
    public class35 method264(long arg0) {
        class35 var3 = this.field980[(int) (arg0 & (long) (this.field979 - 1))];
        for (class35 var4 = var3.field1045; var4 != var3; var4 = var4.field1045) {
            if (var4.field1044 == arg0) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!MPNPHMKJ", name = "a", descriptor = "(JLNQPZRHXK;I)V")
    public void method265(long arg0, class35 arg1, int arg2) {
        if (arg1.field1046 != null) {
            arg1.method326();
        }
        class35 var5 = this.field980[(int) (arg0 & (long) (this.field979 - 1))];
        arg1.field1046 = var5.field1046;
        arg1.field1045 = var5;
        if (arg2 <= 0) {
            this.field977 = 41;
        }
        arg1.field1046.field1045 = arg1;
        arg1.field1045.field1046 = arg1;
        arg1.field1044 = arg0;
    }
}
