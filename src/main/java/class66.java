import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("YSGENUJE")
public class class66 {

    @OriginalMember(owner = "YSGENUJE", name = "a", descriptor = "I")
    private int field1627 = 611;

    @OriginalMember(owner = "YSGENUJE", name = "b", descriptor = "Z")
    private boolean field1628 = false;

    @OriginalMember(owner = "YSGENUJE", name = "c", descriptor = "I")
    private int field1629 = 8;

    @OriginalMember(owner = "YSGENUJE", name = "d", descriptor = "I")
    private int field1630 = 6;

    @OriginalMember(owner = "YSGENUJE", name = "e", descriptor = "LZZBPVHZB;")
    public class72 field1631 = new class72();

    @OriginalMember(owner = "YSGENUJE", name = "f", descriptor = "LZZBPVHZB;")
    private class72 field1632;

    @OriginalMember(owner = "YSGENUJE", name = "<init>", descriptor = "(I)V")
    public class66(int arg0) {
        this.field1631.field1735 = this.field1631;
        if (arg0 != -41036) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        this.field1631.field1736 = this.field1631;
    }

    @OriginalMember(owner = "YSGENUJE", name = "a", descriptor = "(LZZBPVHZB;)V")
    public void method520(class72 arg0) {
        if (arg0.field1736 != null) {
            arg0.method591();
        }
        arg0.field1736 = this.field1631.field1736;
        arg0.field1735 = this.field1631;
        arg0.field1736.field1735 = arg0;
        arg0.field1735.field1736 = arg0;
    }

    @OriginalMember(owner = "YSGENUJE", name = "a", descriptor = "(LZZBPVHZB;B)V")
    public void method521(class72 arg0, byte arg1) {
        if (arg0.field1736 != null) {
            arg0.method591();
        }
        arg0.field1736 = this.field1631;
        arg0.field1735 = this.field1631.field1735;
        arg0.field1736.field1735 = arg0;
        if (arg1 == 6) {
            boolean var3 = false;
        } else {
            this.field1627 = -207;
        }
        arg0.field1735.field1736 = arg0;
        if (class72.field1737) {
        }
    }

    @OriginalMember(owner = "YSGENUJE", name = "a", descriptor = "()LZZBPVHZB;")
    public class72 method522() {
        class72 var1 = this.field1631.field1735;
        if (this.field1631 == var1) {
            return null;
        } else {
            var1.method591();
            return var1;
        }
    }

    @OriginalMember(owner = "YSGENUJE", name = "b", descriptor = "()LZZBPVHZB;")
    public class72 method523() {
        class72 var1 = this.field1631.field1735;
        if (this.field1631 == var1) {
            this.field1632 = null;
            return null;
        } else {
            this.field1632 = var1.field1735;
            return var1;
        }
    }

    @OriginalMember(owner = "YSGENUJE", name = "a", descriptor = "(I)LZZBPVHZB;")
    public class72 method524(int arg0) {
        class72 var2 = this.field1631.field1736;
        if (arg0 < 0 || arg0 > 0) {
            this.field1628 = !this.field1628;
        }
        if (this.field1631 == var2) {
            this.field1632 = null;
            return null;
        } else {
            this.field1632 = var2.field1736;
            return var2;
        }
    }

    @OriginalMember(owner = "YSGENUJE", name = "b", descriptor = "(I)LZZBPVHZB;")
    public class72 method525(int arg0) {
        class72 var2 = this.field1632;
        if (this.field1631 == var2) {
            this.field1632 = null;
            return null;
        }
        this.field1632 = var2.field1735;
        while (arg0 >= 0) {
            this.field1627 = -234;
        }
        return var2;
    }

    @OriginalMember(owner = "YSGENUJE", name = "c", descriptor = "(I)LZZBPVHZB;")
    public class72 method526(int arg0) {
        class72 var2 = this.field1632;
        if (this.field1631 == var2) {
            this.field1632 = null;
            return null;
        }
        this.field1632 = var2.field1736;
        if (this.field1630 != arg0) {
            throw new NullPointerException();
        }
        return var2;
    }

    @OriginalMember(owner = "YSGENUJE", name = "c", descriptor = "()V")
    public void method527() {
        if (this.field1631.field1735 == this.field1631) {
            return;
        }
        while (true) {
            class72 var1 = this.field1631.field1735;
            if (this.field1631 == var1) {
                return;
            }
            var1.method591();
        }
    }
}
