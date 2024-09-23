import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("LVGEETWD")
public class class38 {

    @OriginalMember(owner = "LVGEETWD", name = "a", descriptor = "Z")
    private boolean field1111 = false;

    @OriginalMember(owner = "LVGEETWD", name = "b", descriptor = "I")
    private int field1112 = 939;

    @OriginalMember(owner = "LVGEETWD", name = "c", descriptor = "I")
    private int field1113 = 123;

    @OriginalMember(owner = "LVGEETWD", name = "d", descriptor = "LZAQWNGNJ;")
    public class70 field1114 = new class70();

    @OriginalMember(owner = "LVGEETWD", name = "e", descriptor = "LZAQWNGNJ;")
    private class70 field1115;

    @OriginalMember(owner = "LVGEETWD", name = "<init>", descriptor = "(B)V")
    public class38(byte arg0) {
        this.field1114.field1637 = this.field1114;
        this.field1114.field1638 = this.field1114;
        if (arg0 != 17) {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "LVGEETWD", name = "a", descriptor = "(LZAQWNGNJ;)V")
    public void method357(class70 arg0) {
        if (arg0.field1638 != null) {
            arg0.method537();
        }
        arg0.field1638 = this.field1114.field1638;
        arg0.field1637 = this.field1114;
        arg0.field1638.field1637 = arg0;
        arg0.field1637.field1638 = arg0;
    }

    @OriginalMember(owner = "LVGEETWD", name = "a", descriptor = "()LZAQWNGNJ;")
    public class70 method358() {
        class70 var1 = this.field1114.field1637;
        if (this.field1114 == var1) {
            return null;
        } else {
            var1.method537();
            return var1;
        }
    }

    @OriginalMember(owner = "LVGEETWD", name = "b", descriptor = "()LZAQWNGNJ;")
    public class70 method359() {
        class70 var1 = this.field1114.field1637;
        if (this.field1114 == var1) {
            this.field1115 = null;
            return null;
        } else {
            this.field1115 = var1.field1637;
            return var1;
        }
    }

    @OriginalMember(owner = "LVGEETWD", name = "a", descriptor = "(I)LZAQWNGNJ;")
    public class70 method360(int arg0) {
        class70 var2 = this.field1115;
        if (arg0 <= 0) {
            this.field1111 = !this.field1111;
        }
        if (this.field1114 == var2) {
            this.field1115 = null;
            return null;
        } else {
            this.field1115 = var2.field1637;
            return var2;
        }
    }

    @OriginalMember(owner = "LVGEETWD", name = "c", descriptor = "()I")
    public int method361() {
        int var1 = 0;
        for (class70 var2 = this.field1114.field1637; var2 != this.field1114; var2 = var2.field1637) {
            var1++;
        }
        return var1;
    }
}
