import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!LKYWDMZN")
public class class29 {

    @OriginalMember(owner = "client!LKYWDMZN", name = "a", descriptor = "I")
    private int field975 = 357;

    @OriginalMember(owner = "client!LKYWDMZN", name = "b", descriptor = "I")
    private int field976 = -653;

    @OriginalMember(owner = "client!LKYWDMZN", name = "c", descriptor = "LAPQXVAYL;")
    public class2 field977 = new class2();

    @OriginalMember(owner = "client!LKYWDMZN", name = "d", descriptor = "LAPQXVAYL;")
    private class2 field978;

    @OriginalMember(owner = "client!LKYWDMZN", name = "<init>", descriptor = "(I)V")
    public class29(int arg0) {
        this.field977.field27 = this.field977;
        this.field977.field28 = this.field977;
        if (arg0 != 0) {
            this.field975 = 426;
        }
    }

    @OriginalMember(owner = "client!LKYWDMZN", name = "a", descriptor = "(LAPQXVAYL;)V")
    public void method326(class2 arg0) {
        if (arg0.field28 != null) {
            arg0.method4();
        }
        arg0.field28 = this.field977.field28;
        arg0.field27 = this.field977;
        arg0.field28.field27 = arg0;
        arg0.field27.field28 = arg0;
    }

    @OriginalMember(owner = "client!LKYWDMZN", name = "a", descriptor = "()LAPQXVAYL;")
    public class2 method327() {
        class2 var1 = this.field977.field27;
        if (this.field977 == var1) {
            return null;
        } else {
            var1.method4();
            return var1;
        }
    }

    @OriginalMember(owner = "client!LKYWDMZN", name = "b", descriptor = "()LAPQXVAYL;")
    public class2 method328() {
        class2 var1 = this.field977.field27;
        if (this.field977 == var1) {
            this.field978 = null;
            return null;
        } else {
            this.field978 = var1.field27;
            return var1;
        }
    }

    @OriginalMember(owner = "client!LKYWDMZN", name = "a", descriptor = "(B)LAPQXVAYL;")
    public class2 method329(byte arg0) {
        class2 var2 = this.field978;
        if (arg0 != 6) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        if (this.field977 == var2) {
            this.field978 = null;
            return null;
        } else {
            this.field978 = var2.field27;
            return var2;
        }
    }

    @OriginalMember(owner = "client!LKYWDMZN", name = "c", descriptor = "()I")
    public int method330() {
        int var1 = 0;
        for (class2 var2 = this.field977.field27; var2 != this.field977; var2 = var2.field27) {
            var1++;
        }
        return var1;
    }
}
