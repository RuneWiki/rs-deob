import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!LIHZBJAU")
public class class31 {

    @OriginalMember(owner = "client!LIHZBJAU", name = "a", descriptor = "Z")
    private boolean field924 = true;

    @OriginalMember(owner = "client!LIHZBJAU", name = "b", descriptor = "B")
    private byte field925 = 8;

    @OriginalMember(owner = "client!LIHZBJAU", name = "c", descriptor = "LPFQOGDTY;")
    public class48 field926 = new class48();

    @OriginalMember(owner = "client!LIHZBJAU", name = "d", descriptor = "LPFQOGDTY;")
    private class48 field927;

    @OriginalMember(owner = "client!LIHZBJAU", name = "<init>", descriptor = "(I)V")
    public class31(int arg0) {
        if (arg0 != 0) {
            this.field924 = !this.field924;
        }
        this.field926.field1414 = this.field926;
        this.field926.field1415 = this.field926;
    }

    @OriginalMember(owner = "client!LIHZBJAU", name = "a", descriptor = "(LPFQOGDTY;)V")
    public void method265(class48 arg0) {
        if (arg0.field1415 != null) {
            arg0.method423();
        }
        arg0.field1415 = this.field926.field1415;
        arg0.field1414 = this.field926;
        arg0.field1415.field1414 = arg0;
        arg0.field1414.field1415 = arg0;
    }

    @OriginalMember(owner = "client!LIHZBJAU", name = "a", descriptor = "()LPFQOGDTY;")
    public class48 method266() {
        class48 var1 = this.field926.field1414;
        if (this.field926 == var1) {
            return null;
        } else {
            var1.method423();
            return var1;
        }
    }

    @OriginalMember(owner = "client!LIHZBJAU", name = "b", descriptor = "()LPFQOGDTY;")
    public class48 method267() {
        class48 var1 = this.field926.field1414;
        if (this.field926 == var1) {
            this.field927 = null;
            return null;
        } else {
            this.field927 = var1.field1414;
            return var1;
        }
    }

    @OriginalMember(owner = "client!LIHZBJAU", name = "a", descriptor = "(B)LPFQOGDTY;")
    public class48 method268(byte arg0) {
        if (this.field925 != arg0) {
            throw new NullPointerException();
        }
        class48 var2 = this.field927;
        if (this.field926 == var2) {
            this.field927 = null;
            return null;
        } else {
            this.field927 = var2.field1414;
            return var2;
        }
    }

    @OriginalMember(owner = "client!LIHZBJAU", name = "c", descriptor = "()I")
    public int method269() {
        int var1 = 0;
        for (class48 var2 = this.field926.field1414; var2 != this.field926; var2 = var2.field1414) {
            var1++;
        }
        return var1;
    }
}
