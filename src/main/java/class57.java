import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!WTGHTNMN")
public class class57 {

    @OriginalMember(owner = "client!WTGHTNMN", name = "a", descriptor = "I")
    private int field1466 = 791;

    @OriginalMember(owner = "client!WTGHTNMN", name = "c", descriptor = "Z")
    private boolean field1468 = true;

    @OriginalMember(owner = "client!WTGHTNMN", name = "d", descriptor = "LOJTWJXEY;")
    public class34 field1469 = new class34();

    @OriginalMember(owner = "client!WTGHTNMN", name = "b", descriptor = "I")
    private int field1467;

    @OriginalMember(owner = "client!WTGHTNMN", name = "e", descriptor = "LOJTWJXEY;")
    private class34 field1470;

    @OriginalMember(owner = "client!WTGHTNMN", name = "<init>", descriptor = "(I)V")
    public class57(int arg0) {
        if (arg0 != 36113) {
            this.field1468 = !this.field1468;
        }
        this.field1469.field1025 = this.field1469;
        this.field1469.field1026 = this.field1469;
    }

    @OriginalMember(owner = "client!WTGHTNMN", name = "a", descriptor = "(LOJTWJXEY;)V")
    public void method467(class34 arg0) {
        if (arg0.field1026 != null) {
            arg0.method338();
        }
        arg0.field1026 = this.field1469.field1026;
        arg0.field1025 = this.field1469;
        arg0.field1026.field1025 = arg0;
        arg0.field1025.field1026 = arg0;
    }

    @OriginalMember(owner = "client!WTGHTNMN", name = "a", descriptor = "(LOJTWJXEY;I)V")
    public void method468(class34 arg0, int arg1) {
        if (arg0.field1026 != null) {
            arg0.method338();
        }
        arg0.field1026 = this.field1469;
        arg0.field1025 = this.field1469.field1025;
        arg0.field1026.field1025 = arg0;
        if (arg1 != 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        arg0.field1025.field1026 = arg0;
    }

    @OriginalMember(owner = "client!WTGHTNMN", name = "a", descriptor = "()LOJTWJXEY;")
    public class34 method469() {
        class34 var1 = this.field1469.field1025;
        if (this.field1469 == var1) {
            return null;
        } else {
            var1.method338();
            return var1;
        }
    }

    @OriginalMember(owner = "client!WTGHTNMN", name = "b", descriptor = "()LOJTWJXEY;")
    public class34 method470() {
        class34 var1 = this.field1469.field1025;
        if (this.field1469 == var1) {
            this.field1470 = null;
            return null;
        } else {
            this.field1470 = var1.field1025;
            return var1;
        }
    }

    @OriginalMember(owner = "client!WTGHTNMN", name = "a", descriptor = "(I)LOJTWJXEY;")
    public class34 method471(int arg0) {
        class34 var2 = this.field1469.field1026;
        if (this.field1469 == var2) {
            this.field1470 = null;
            return null;
        }
        this.field1470 = var2.field1026;
        if (arg0 != 0) {
            this.field1467 = 307;
        }
        return var2;
    }

    @OriginalMember(owner = "client!WTGHTNMN", name = "a", descriptor = "(Z)LOJTWJXEY;")
    public class34 method472(boolean arg0) {
        class34 var2 = this.field1470;
        if (arg0) {
            throw new NullPointerException();
        } else if (this.field1469 == var2) {
            this.field1470 = null;
            return null;
        } else {
            this.field1470 = var2.field1025;
            return var2;
        }
    }

    @OriginalMember(owner = "client!WTGHTNMN", name = "b", descriptor = "(I)LOJTWJXEY;")
    public class34 method473(int arg0) {
        class34 var2 = this.field1470;
        if (this.field1469 == var2) {
            this.field1470 = null;
            return null;
        }
        this.field1470 = var2.field1026;
        if (arg0 >= 0) {
            throw new NullPointerException();
        }
        return var2;
    }

    @OriginalMember(owner = "client!WTGHTNMN", name = "c", descriptor = "()V")
    public void method474() {
        if (this.field1469.field1025 == this.field1469) {
            return;
        }
        while (true) {
            class34 var1 = this.field1469.field1025;
            if (this.field1469 == var1) {
                return;
            }
            var1.method338();
        }
    }
}
