import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!WOVRPCGT")
public class class61 {

    @OriginalMember(owner = "client!WOVRPCGT", name = "a", descriptor = "I")
    private int field1593 = 40071;

    @OriginalMember(owner = "client!WOVRPCGT", name = "b", descriptor = "Z")
    private boolean field1594 = true;

    @OriginalMember(owner = "client!WOVRPCGT", name = "c", descriptor = "I")
    private int field1595 = 1;

    @OriginalMember(owner = "client!WOVRPCGT", name = "d", descriptor = "LBLBQHZXT;")
    public class3 field1596 = new class3();

    @OriginalMember(owner = "client!WOVRPCGT", name = "e", descriptor = "LBLBQHZXT;")
    private class3 field1597;

    @OriginalMember(owner = "client!WOVRPCGT", name = "<init>", descriptor = "(I)V")
    public class61(int arg0) {
        this.field1596.field49 = this.field1596;
        if (arg0 >= 0) {
            throw new NullPointerException();
        }
        this.field1596.field50 = this.field1596;
    }

    @OriginalMember(owner = "client!WOVRPCGT", name = "a", descriptor = "(LBLBQHZXT;)V")
    public void method540(class3 arg0) {
        if (arg0.field50 != null) {
            arg0.method14();
        }
        arg0.field50 = this.field1596.field50;
        arg0.field49 = this.field1596;
        arg0.field50.field49 = arg0;
        arg0.field49.field50 = arg0;
    }

    @OriginalMember(owner = "client!WOVRPCGT", name = "a", descriptor = "(ILBLBQHZXT;)V")
    public void method541(int arg0, class3 arg1) {
        if (arg1.field50 != null) {
            arg1.method14();
        }
        arg1.field50 = this.field1596;
        if (this.field1593 != arg0) {
            this.field1594 = !this.field1594;
        }
        arg1.field49 = this.field1596.field49;
        arg1.field50.field49 = arg1;
        arg1.field49.field50 = arg1;
        if (class3.field51) {
        }
    }

    @OriginalMember(owner = "client!WOVRPCGT", name = "a", descriptor = "()LBLBQHZXT;")
    public class3 method542() {
        class3 var1 = this.field1596.field49;
        if (this.field1596 == var1) {
            return null;
        } else {
            var1.method14();
            return var1;
        }
    }

    @OriginalMember(owner = "client!WOVRPCGT", name = "b", descriptor = "()LBLBQHZXT;")
    public class3 method543() {
        class3 var1 = this.field1596.field49;
        if (this.field1596 == var1) {
            this.field1597 = null;
            return null;
        } else {
            this.field1597 = var1.field49;
            return var1;
        }
    }

    @OriginalMember(owner = "client!WOVRPCGT", name = "a", descriptor = "(Z)LBLBQHZXT;")
    public class3 method544(boolean arg0) {
        if (arg0) {
            this.field1594 = !this.field1594;
        }
        class3 var2 = this.field1596.field50;
        if (this.field1596 == var2) {
            this.field1597 = null;
            return null;
        } else {
            this.field1597 = var2.field50;
            return var2;
        }
    }

    @OriginalMember(owner = "client!WOVRPCGT", name = "a", descriptor = "(I)LBLBQHZXT;")
    public class3 method545(int arg0) {
        class3 var2 = this.field1597;
        if (this.field1596 == var2) {
            this.field1597 = null;
            return null;
        }
        this.field1597 = var2.field49;
        if (arg0 <= 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!WOVRPCGT", name = "b", descriptor = "(I)LBLBQHZXT;")
    public class3 method546(int arg0) {
        class3 var2 = this.field1597;
        if (this.field1596 == var2) {
            this.field1597 = null;
            return null;
        }
        this.field1597 = var2.field50;
        if (arg0 != 27382) {
            throw new NullPointerException();
        }
        return var2;
    }

    @OriginalMember(owner = "client!WOVRPCGT", name = "c", descriptor = "()V")
    public void method547() {
        if (this.field1596.field49 == this.field1596) {
            return;
        }
        while (true) {
            class3 var1 = this.field1596.field49;
            if (this.field1596 == var1) {
                return;
            }
            var1.method14();
        }
    }
}
