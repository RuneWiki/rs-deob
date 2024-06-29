import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!HRSVWDNF")
public class class27 {

    @OriginalMember(owner = "client!HRSVWDNF", name = "a", descriptor = "Z")
    private boolean field975 = false;

    @OriginalMember(owner = "client!HRSVWDNF", name = "b", descriptor = "Z")
    private boolean field976 = true;

    @OriginalMember(owner = "client!HRSVWDNF", name = "c", descriptor = "LYCAZQYJA;")
    public class68 field977 = new class68();

    @OriginalMember(owner = "client!HRSVWDNF", name = "d", descriptor = "LYCAZQYJA;")
    private class68 field978;

    @OriginalMember(owner = "client!HRSVWDNF", name = "<init>", descriptor = "(B)V")
    public class27(byte arg0) {
        if (arg0 != 77) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        this.field977.field1705 = this.field977;
        this.field977.field1706 = this.field977;
    }

    @OriginalMember(owner = "client!HRSVWDNF", name = "a", descriptor = "(LYCAZQYJA;)V")
    public void method356(class68 arg0) {
        if (arg0.field1706 != null) {
            arg0.method583();
        }
        arg0.field1706 = this.field977.field1706;
        arg0.field1705 = this.field977;
        arg0.field1706.field1705 = arg0;
        arg0.field1705.field1706 = arg0;
    }

    @OriginalMember(owner = "client!HRSVWDNF", name = "a", descriptor = "()LYCAZQYJA;")
    public class68 method357() {
        class68 var1 = this.field977.field1705;
        if (this.field977 == var1) {
            return null;
        } else {
            var1.method583();
            return var1;
        }
    }

    @OriginalMember(owner = "client!HRSVWDNF", name = "b", descriptor = "()LYCAZQYJA;")
    public class68 method358() {
        class68 var1 = this.field977.field1705;
        if (this.field977 == var1) {
            this.field978 = null;
            return null;
        } else {
            this.field978 = var1.field1705;
            return var1;
        }
    }

    @OriginalMember(owner = "client!HRSVWDNF", name = "a", descriptor = "(I)LYCAZQYJA;")
    public class68 method359(int arg0) {
        class68 var2 = this.field978;
        int var3 = 30 / arg0;
        if (this.field977 == var2) {
            this.field978 = null;
            return null;
        } else {
            this.field978 = var2.field1705;
            return var2;
        }
    }

    @OriginalMember(owner = "client!HRSVWDNF", name = "c", descriptor = "()I")
    public int method360() {
        int var1 = 0;
        for (class68 var2 = this.field977.field1705; var2 != this.field977; var2 = var2.field1705) {
            var1++;
        }
        return var1;
    }
}
