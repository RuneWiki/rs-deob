import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("VLLJSJTJ")
public class class54 {

    @OriginalMember(owner = "VLLJSJTJ", name = "a", descriptor = "I")
    private int field1446 = -918;

    @OriginalMember(owner = "VLLJSJTJ", name = "b", descriptor = "Z")
    private boolean field1447 = false;

    @OriginalMember(owner = "VLLJSJTJ", name = "c", descriptor = "I")
    private int field1448 = 280;

    @OriginalMember(owner = "VLLJSJTJ", name = "d", descriptor = "Z")
    private boolean field1449 = true;

    @OriginalMember(owner = "VLLJSJTJ", name = "e", descriptor = "I")
    private int field1450 = 504;

    @OriginalMember(owner = "VLLJSJTJ", name = "f", descriptor = "LWWONSPNF;")
    public class62 field1451 = new class62();

    @OriginalMember(owner = "VLLJSJTJ", name = "g", descriptor = "LWWONSPNF;")
    private class62 field1452;

    @OriginalMember(owner = "VLLJSJTJ", name = "<init>", descriptor = "(B)V")
    public class54(byte arg0) {
        if (arg0 != 3) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        this.field1451.field1588 = this.field1451;
        this.field1451.field1589 = this.field1451;
    }

    @OriginalMember(owner = "VLLJSJTJ", name = "a", descriptor = "(LWWONSPNF;)V")
    public void method525(class62 arg0) {
        if (arg0.field1589 != null) {
            arg0.method555();
        }
        arg0.field1589 = this.field1451.field1589;
        arg0.field1588 = this.field1451;
        arg0.field1589.field1588 = arg0;
        arg0.field1588.field1589 = arg0;
        if (class62.field1590) {
        }
    }

    @OriginalMember(owner = "VLLJSJTJ", name = "a", descriptor = "(ILWWONSPNF;)V")
    public void method526(int arg0, class62 arg1) {
        if (arg1.field1589 != null) {
            arg1.method555();
        }
        arg1.field1589 = this.field1451;
        if (arg0 < 0) {
            arg1.field1588 = this.field1451.field1588;
            arg1.field1589.field1588 = arg1;
            arg1.field1588.field1589 = arg1;
        }
    }

    @OriginalMember(owner = "VLLJSJTJ", name = "a", descriptor = "()LWWONSPNF;")
    public class62 method527() {
        class62 var1 = this.field1451.field1588;
        if (this.field1451 == var1) {
            return null;
        } else {
            var1.method555();
            return var1;
        }
    }

    @OriginalMember(owner = "VLLJSJTJ", name = "b", descriptor = "()LWWONSPNF;")
    public class62 method528() {
        class62 var1 = this.field1451.field1588;
        if (this.field1451 == var1) {
            this.field1452 = null;
            return null;
        } else {
            this.field1452 = var1.field1588;
            return var1;
        }
    }

    @OriginalMember(owner = "VLLJSJTJ", name = "a", descriptor = "(I)LWWONSPNF;")
    public class62 method529(int arg0) {
        if (arg0 != 22498) {
            throw new NullPointerException();
        }
        class62 var2 = this.field1451.field1589;
        if (this.field1451 == var2) {
            this.field1452 = null;
            return null;
        } else {
            this.field1452 = var2.field1589;
            return var2;
        }
    }

    @OriginalMember(owner = "VLLJSJTJ", name = "a", descriptor = "(Z)LWWONSPNF;")
    public class62 method530(boolean arg0) {
        class62 var2 = this.field1452;
        if (this.field1451 == var2) {
            this.field1452 = null;
            return null;
        }
        this.field1452 = var2.field1588;
        if (!arg0) {
            this.field1446 = -296;
        }
        return var2;
    }

    @OriginalMember(owner = "VLLJSJTJ", name = "b", descriptor = "(I)LWWONSPNF;")
    public class62 method531(int arg0) {
        class62 var2 = this.field1452;
        if (arg0 <= 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        if (this.field1451 == var2) {
            this.field1452 = null;
            return null;
        } else {
            this.field1452 = var2.field1589;
            return var2;
        }
    }

    @OriginalMember(owner = "VLLJSJTJ", name = "c", descriptor = "()V")
    public void method532() {
        if (this.field1451.field1588 == this.field1451) {
            return;
        }
        while (true) {
            class62 var1 = this.field1451.field1588;
            if (this.field1451 == var1) {
                return;
            }
            var1.method555();
        }
    }
}
