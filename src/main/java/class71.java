import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ZYLCKQCD")
public class class71 {

    @OriginalMember(owner = "ZYLCKQCD", name = "a", descriptor = "I")
    private int field1734 = 8;

    @OriginalMember(owner = "ZYLCKQCD", name = "d", descriptor = "LRZDMTEAZ;")
    private class49 field1737 = new class49();

    @OriginalMember(owner = "ZYLCKQCD", name = "h", descriptor = "LNAZXUZWI;")
    private class36 field1741 = new class36(0);

    @OriginalMember(owner = "ZYLCKQCD", name = "e", descriptor = "I")
    private int field1738;

    @OriginalMember(owner = "ZYLCKQCD", name = "f", descriptor = "I")
    private int field1739;

    @OriginalMember(owner = "ZYLCKQCD", name = "g", descriptor = "LWIZYUELH;")
    private class56 field1740;

    @OriginalMember(owner = "ZYLCKQCD", name = "b", descriptor = "I")
    private int field1735;

    @OriginalMember(owner = "ZYLCKQCD", name = "c", descriptor = "I")
    private int field1736;

    @OriginalMember(owner = "ZYLCKQCD", name = "<init>", descriptor = "(BI)V")
    public class71(byte arg0, int arg1) {
        this.field1738 = arg1;
        this.field1739 = arg1;
        if (arg0 != -89) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.field1740 = new class56(8172, 1024);
    }

    @OriginalMember(owner = "ZYLCKQCD", name = "a", descriptor = "(J)LRZDMTEAZ;")
    public class49 method599(long arg0) {
        class49 var3 = (class49) this.field1740.method523(arg0);
        if (var3 == null) {
            this.field1735++;
        } else {
            this.field1741.method388(var3);
            this.field1736++;
        }
        return var3;
    }

    @OriginalMember(owner = "ZYLCKQCD", name = "a", descriptor = "(LRZDMTEAZ;IJ)V")
    public void method600(class49 arg0, int arg1, long arg2) {
        if (this.field1739 == 0) {
            class49 var5 = this.field1741.method389();
            var5.method221();
            var5.method495();
            if (this.field1737 == var5) {
                class49 var6 = this.field1741.method389();
                var6.method221();
                var6.method495();
            }
        } else {
            this.field1739--;
        }
        this.field1740.method524(arg0, arg2, 874);
        if (arg1 == 8) {
            this.field1741.method388(arg0);
        }
    }

    @OriginalMember(owner = "ZYLCKQCD", name = "a", descriptor = "()V")
    public void method601() {
        while (true) {
            class49 var1 = this.field1741.method389();
            if (var1 == null) {
                this.field1739 = this.field1738;
                return;
            }
            var1.method221();
            var1.method495();
        }
    }
}
