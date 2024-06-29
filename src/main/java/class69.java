import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ZEEWTYXI")
public class class69 {

    @OriginalMember(owner = "client!ZEEWTYXI", name = "a", descriptor = "Z")
    private boolean field1689 = true;

    @OriginalMember(owner = "client!ZEEWTYXI", name = "b", descriptor = "Z")
    private boolean field1690 = true;

    @OriginalMember(owner = "client!ZEEWTYXI", name = "c", descriptor = "I")
    private int field1691 = -39373;

    @OriginalMember(owner = "client!ZEEWTYXI", name = "d", descriptor = "I")
    private int field1692 = 10853;

    @OriginalMember(owner = "client!ZEEWTYXI", name = "f", descriptor = "LZMCAQRHG;")
    public class71 field1694 = new class71();

    @OriginalMember(owner = "client!ZEEWTYXI", name = "e", descriptor = "I")
    private int field1693;

    @OriginalMember(owner = "client!ZEEWTYXI", name = "g", descriptor = "LZMCAQRHG;")
    private class71 field1695;

    @OriginalMember(owner = "client!ZEEWTYXI", name = "<init>", descriptor = "(I)V")
    public class69(int arg0) {
        if (arg0 <= 0) {
            this.field1693 = 8;
        }
        this.field1694.field1727 = this.field1694;
        this.field1694.field1728 = this.field1694;
    }

    @OriginalMember(owner = "client!ZEEWTYXI", name = "a", descriptor = "(LZMCAQRHG;)V")
    public void method577(class71 arg0) {
        if (arg0.field1728 != null) {
            arg0.method602();
        }
        arg0.field1728 = this.field1694.field1728;
        arg0.field1727 = this.field1694;
        arg0.field1728.field1727 = arg0;
        arg0.field1727.field1728 = arg0;
    }

    @OriginalMember(owner = "client!ZEEWTYXI", name = "a", descriptor = "(LZMCAQRHG;I)V")
    public void method578(class71 arg0, int arg1) {
        if (arg0.field1728 != null) {
            arg0.method602();
        }
        arg0.field1728 = this.field1694;
        if (arg1 != 0) {
            this.field1690 = !this.field1690;
        }
        arg0.field1727 = this.field1694.field1727;
        arg0.field1728.field1727 = arg0;
        arg0.field1727.field1728 = arg0;
    }

    @OriginalMember(owner = "client!ZEEWTYXI", name = "a", descriptor = "()LZMCAQRHG;")
    public class71 method579() {
        class71 var1 = this.field1694.field1727;
        if (this.field1694 == var1) {
            return null;
        } else {
            var1.method602();
            return var1;
        }
    }

    @OriginalMember(owner = "client!ZEEWTYXI", name = "b", descriptor = "()LZMCAQRHG;")
    public class71 method580() {
        class71 var1 = this.field1694.field1727;
        if (this.field1694 == var1) {
            this.field1695 = null;
            return null;
        } else {
            this.field1695 = var1.field1727;
            return var1;
        }
    }

    @OriginalMember(owner = "client!ZEEWTYXI", name = "a", descriptor = "(Z)LZMCAQRHG;")
    public class71 method581(boolean arg0) {
        class71 var2 = this.field1694.field1728;
        if (this.field1694 == var2) {
            this.field1695 = null;
            return null;
        }
        this.field1695 = var2.field1728;
        if (!arg0) {
            this.field1689 = !this.field1689;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ZEEWTYXI", name = "a", descriptor = "(B)LZMCAQRHG;")
    public class71 method582(byte arg0) {
        if (arg0 != 6) {
            throw new NullPointerException();
        }
        boolean var2 = false;
        class71 var3 = this.field1695;
        if (this.field1694 == var3) {
            this.field1695 = null;
            return null;
        } else {
            this.field1695 = var3.field1727;
            return var3;
        }
    }

    @OriginalMember(owner = "client!ZEEWTYXI", name = "a", descriptor = "(I)LZMCAQRHG;")
    public class71 method583(int arg0) {
        class71 var2 = this.field1695;
        if (arg0 >= 0) {
            throw new NullPointerException();
        } else if (this.field1694 == var2) {
            this.field1695 = null;
            return null;
        } else {
            this.field1695 = var2.field1728;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ZEEWTYXI", name = "c", descriptor = "()V")
    public void method584() {
        if (this.field1694.field1727 == this.field1694) {
            return;
        }
        while (true) {
            class71 var1 = this.field1694.field1727;
            if (this.field1694 == var1) {
                return;
            }
            var1.method602();
        }
    }
}
