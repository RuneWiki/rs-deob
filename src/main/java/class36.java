import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("MMJBXXXO")
public class class36 {

    @OriginalMember(owner = "MMJBXXXO", name = "a", descriptor = "I")
    private int field1153 = 8;

    @OriginalMember(owner = "MMJBXXXO", name = "b", descriptor = "LNTGUDCTQ;")
    public class37 field1154 = new class37();

    @OriginalMember(owner = "MMJBXXXO", name = "c", descriptor = "LNTGUDCTQ;")
    private class37 field1155;

    @OriginalMember(owner = "MMJBXXXO", name = "<init>", descriptor = "(Z)V")
    public class36(boolean arg0) {
        this.field1154.field1156 = this.field1154;
        this.field1154.field1157 = this.field1154;
        if (arg0) {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "MMJBXXXO", name = "a", descriptor = "(LNTGUDCTQ;)V")
    public void method404(class37 arg0) {
        if (arg0.field1157 != null) {
            arg0.method409();
        }
        arg0.field1157 = this.field1154.field1157;
        arg0.field1156 = this.field1154;
        arg0.field1157.field1156 = arg0;
        arg0.field1156.field1157 = arg0;
    }

    @OriginalMember(owner = "MMJBXXXO", name = "a", descriptor = "()LNTGUDCTQ;")
    public class37 method405() {
        class37 var1 = this.field1154.field1156;
        if (this.field1154 == var1) {
            return null;
        } else {
            var1.method409();
            return var1;
        }
    }

    @OriginalMember(owner = "MMJBXXXO", name = "b", descriptor = "()LNTGUDCTQ;")
    public class37 method406() {
        class37 var1 = this.field1154.field1156;
        if (this.field1154 == var1) {
            this.field1155 = null;
            return null;
        } else {
            this.field1155 = var1.field1156;
            return var1;
        }
    }

    @OriginalMember(owner = "MMJBXXXO", name = "a", descriptor = "(I)LNTGUDCTQ;")
    public class37 method407(int arg0) {
        class37 var2 = this.field1155;
        if (arg0 < 9 || arg0 > 9) {
            throw new NullPointerException();
        } else if (this.field1154 == var2) {
            this.field1155 = null;
            return null;
        } else {
            this.field1155 = var2.field1156;
            return var2;
        }
    }

    @OriginalMember(owner = "MMJBXXXO", name = "c", descriptor = "()I")
    public int method408() {
        int var1 = 0;
        for (class37 var2 = this.field1154.field1156; var2 != this.field1154; var2 = var2.field1156) {
            var1++;
        }
        return var1;
    }
}
