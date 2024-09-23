import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("WUVIEXOA")
public class class69 {

    @OriginalMember(owner = "WUVIEXOA", name = "a", descriptor = "B")
    private byte field1696 = 7;

    @OriginalMember(owner = "WUVIEXOA", name = "b", descriptor = "Z")
    private boolean field1697 = true;

    @OriginalMember(owner = "WUVIEXOA", name = "c", descriptor = "LOGKECTLC;")
    public class45 field1698 = new class45();

    @OriginalMember(owner = "WUVIEXOA", name = "d", descriptor = "LOGKECTLC;")
    private class45 field1699;

    @OriginalMember(owner = "WUVIEXOA", name = "<init>", descriptor = "(B)V")
    public class69(byte arg0) {
        this.field1698.field1263 = this.field1698;
        this.field1698.field1264 = this.field1698;
        if (this.field1696 == arg0) {
            boolean var2 = false;
        } else {
            this.field1697 = !this.field1697;
        }
    }

    @OriginalMember(owner = "WUVIEXOA", name = "a", descriptor = "(LOGKECTLC;)V")
    public void method582(class45 arg0) {
        if (arg0.field1264 != null) {
            arg0.method450();
        }
        arg0.field1264 = this.field1698.field1264;
        arg0.field1263 = this.field1698;
        arg0.field1264.field1263 = arg0;
        arg0.field1263.field1264 = arg0;
    }

    @OriginalMember(owner = "WUVIEXOA", name = "a", descriptor = "(BLOGKECTLC;)V")
    public void method583(byte arg0, class45 arg1) {
        if (arg1.field1264 != null) {
            arg1.method450();
        }
        arg1.field1264 = this.field1698;
        arg1.field1263 = this.field1698.field1263;
        if (arg0 == 3) {
            boolean var3 = false;
            arg1.field1264.field1263 = arg1;
            arg1.field1263.field1264 = arg1;
        }
    }

    @OriginalMember(owner = "WUVIEXOA", name = "a", descriptor = "()LOGKECTLC;")
    public class45 method584() {
        class45 var1 = this.field1698.field1263;
        if (this.field1698 == var1) {
            return null;
        } else {
            var1.method450();
            return var1;
        }
    }

    @OriginalMember(owner = "WUVIEXOA", name = "b", descriptor = "()LOGKECTLC;")
    public class45 method585() {
        class45 var1 = this.field1698.field1263;
        if (this.field1698 == var1) {
            this.field1699 = null;
            return null;
        } else {
            this.field1699 = var1.field1263;
            return var1;
        }
    }

    @OriginalMember(owner = "WUVIEXOA", name = "a", descriptor = "(B)LOGKECTLC;")
    public class45 method586(byte arg0) {
        class45 var2 = this.field1698.field1264;
        if (this.field1698 == var2) {
            this.field1699 = null;
            return null;
        }
        this.field1699 = var2.field1264;
        if (arg0 == 0) {
            boolean var3 = false;
        } else {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        return var2;
    }

    @OriginalMember(owner = "WUVIEXOA", name = "a", descriptor = "(I)LOGKECTLC;")
    public class45 method587(int arg0) {
        class45 var2 = this.field1699;
        if (arg0 != 0) {
            throw new NullPointerException();
        } else if (this.field1698 == var2) {
            this.field1699 = null;
            return null;
        } else {
            this.field1699 = var2.field1263;
            return var2;
        }
    }

    @OriginalMember(owner = "WUVIEXOA", name = "b", descriptor = "(I)LOGKECTLC;")
    public class45 method588(int arg0) {
        class45 var2 = this.field1699;
        if (this.field1698 == var2) {
            this.field1699 = null;
            return null;
        }
        this.field1699 = var2.field1264;
        if (arg0 != -22947) {
            throw new NullPointerException();
        }
        return var2;
    }

    @OriginalMember(owner = "WUVIEXOA", name = "c", descriptor = "()V")
    public void method589() {
        if (this.field1698.field1263 == this.field1698) {
            return;
        }
        while (true) {
            class45 var1 = this.field1698.field1263;
            if (this.field1698 == var1) {
                return;
            }
            var1.method450();
        }
    }
}
