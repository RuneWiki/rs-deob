import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ILVDIPQT")
public class class31 {

    @OriginalMember(owner = "ILVDIPQT", name = "a", descriptor = "I")
    private int field956 = 431;

    @OriginalMember(owner = "ILVDIPQT", name = "b", descriptor = "Z")
    private boolean field957 = false;

    @OriginalMember(owner = "ILVDIPQT", name = "c", descriptor = "Z")
    private boolean field958 = true;

    @OriginalMember(owner = "ILVDIPQT", name = "d", descriptor = "LTLIWLEHU;")
    public class54 field959 = new class54();

    @OriginalMember(owner = "ILVDIPQT", name = "e", descriptor = "LTLIWLEHU;")
    private class54 field960;

    @OriginalMember(owner = "ILVDIPQT", name = "<init>", descriptor = "(I)V")
    public class31(int arg0) {
        this.field959.field1470 = this.field959;
        this.field959.field1471 = this.field959;
        if (arg0 != -33684) {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "ILVDIPQT", name = "a", descriptor = "(LTLIWLEHU;)V")
    public void method329(class54 arg0) {
        if (arg0.field1471 != null) {
            arg0.method471();
        }
        arg0.field1471 = this.field959.field1471;
        arg0.field1470 = this.field959;
        arg0.field1471.field1470 = arg0;
        arg0.field1470.field1471 = arg0;
    }

    @OriginalMember(owner = "ILVDIPQT", name = "a", descriptor = "(LTLIWLEHU;I)V")
    public void method330(class54 arg0, int arg1) {
        int var3 = 53 / arg1;
        if (arg0.field1471 != null) {
            arg0.method471();
        }
        arg0.field1471 = this.field959;
        arg0.field1470 = this.field959.field1470;
        arg0.field1471.field1470 = arg0;
        arg0.field1470.field1471 = arg0;
        if (class54.field1472) {
        }
    }

    @OriginalMember(owner = "ILVDIPQT", name = "a", descriptor = "()LTLIWLEHU;")
    public class54 method331() {
        class54 var1 = this.field959.field1470;
        if (this.field959 == var1) {
            return null;
        } else {
            var1.method471();
            return var1;
        }
    }

    @OriginalMember(owner = "ILVDIPQT", name = "b", descriptor = "()LTLIWLEHU;")
    public class54 method332() {
        class54 var1 = this.field959.field1470;
        if (this.field959 == var1) {
            this.field960 = null;
            return null;
        } else {
            this.field960 = var1.field1470;
            return var1;
        }
    }

    @OriginalMember(owner = "ILVDIPQT", name = "a", descriptor = "(Z)LTLIWLEHU;")
    public class54 method333(boolean arg0) {
        if (arg0) {
            this.field957 = !this.field957;
        }
        class54 var2 = this.field959.field1471;
        if (this.field959 == var2) {
            this.field960 = null;
            return null;
        } else {
            this.field960 = var2.field1471;
            return var2;
        }
    }

    @OriginalMember(owner = "ILVDIPQT", name = "a", descriptor = "(I)LTLIWLEHU;")
    public class54 method334(int arg0) {
        class54 var2 = this.field960;
        if (arg0 >= 0) {
            throw new NullPointerException();
        } else if (this.field959 == var2) {
            this.field960 = null;
            return null;
        } else {
            this.field960 = var2.field1470;
            return var2;
        }
    }

    @OriginalMember(owner = "ILVDIPQT", name = "b", descriptor = "(I)LTLIWLEHU;")
    public class54 method335(int arg0) {
        class54 var2 = this.field960;
        if (this.field959 == var2) {
            this.field960 = null;
            return null;
        }
        this.field960 = var2.field1471;
        if (arg0 != 0) {
            this.field958 = !this.field958;
        }
        return var2;
    }

    @OriginalMember(owner = "ILVDIPQT", name = "c", descriptor = "()V")
    public void method336() {
        if (this.field959.field1470 == this.field959) {
            return;
        }
        while (true) {
            class54 var1 = this.field959.field1470;
            if (this.field959 == var1) {
                return;
            }
            var1.method471();
        }
    }
}
