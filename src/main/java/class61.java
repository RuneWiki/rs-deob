import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("UEUHLQTT")
public class class61 {

    @OriginalMember(owner = "UEUHLQTT", name = "a", descriptor = "Z")
    private boolean field1515 = true;

    @OriginalMember(owner = "UEUHLQTT", name = "b", descriptor = "I")
    private int field1516 = 46794;

    @OriginalMember(owner = "UEUHLQTT", name = "c", descriptor = "LJBHJGXME;")
    public class27 field1517 = new class27();

    @OriginalMember(owner = "UEUHLQTT", name = "d", descriptor = "LJBHJGXME;")
    private class27 field1518;

    @OriginalMember(owner = "UEUHLQTT", name = "<init>", descriptor = "(I)V")
    public class61(int arg0) {
        if (arg0 != 0) {
            this.field1516 = -378;
        }
        this.field1517.field920 = this.field1517;
        this.field1517.field921 = this.field1517;
    }

    @OriginalMember(owner = "UEUHLQTT", name = "a", descriptor = "(LJBHJGXME;)V")
    public void method507(class27 arg0) {
        if (arg0.field921 != null) {
            arg0.method254();
        }
        arg0.field921 = this.field1517.field921;
        arg0.field920 = this.field1517;
        arg0.field921.field920 = arg0;
        arg0.field920.field921 = arg0;
    }

    @OriginalMember(owner = "UEUHLQTT", name = "a", descriptor = "(LJBHJGXME;I)V")
    public void method508(class27 arg0, int arg1) {
        if (arg0.field921 != null) {
            arg0.method254();
        }
        arg0.field921 = this.field1517;
        arg0.field920 = this.field1517.field920;
        arg0.field921.field920 = arg0;
        if (arg1 >= 0) {
            this.field1515 = !this.field1515;
        }
        arg0.field920.field921 = arg0;
    }

    @OriginalMember(owner = "UEUHLQTT", name = "a", descriptor = "()LJBHJGXME;")
    public class27 method509() {
        class27 var1 = this.field1517.field920;
        if (this.field1517 == var1) {
            return null;
        } else {
            var1.method254();
            return var1;
        }
    }

    @OriginalMember(owner = "UEUHLQTT", name = "b", descriptor = "()LJBHJGXME;")
    public class27 method510() {
        class27 var1 = this.field1517.field920;
        if (this.field1517 == var1) {
            this.field1518 = null;
            return null;
        } else {
            this.field1518 = var1.field920;
            return var1;
        }
    }

    @OriginalMember(owner = "UEUHLQTT", name = "a", descriptor = "(I)LJBHJGXME;")
    public class27 method511(int arg0) {
        class27 var2 = this.field1517.field921;
        if (this.field1517 == var2) {
            this.field1518 = null;
            return null;
        }
        this.field1518 = var2.field921;
        if (arg0 <= 0) {
            throw new NullPointerException();
        }
        return var2;
    }

    @OriginalMember(owner = "UEUHLQTT", name = "a", descriptor = "(Z)LJBHJGXME;")
    public class27 method512(boolean arg0) {
        class27 var2 = this.field1518;
        if (arg0) {
            throw new NullPointerException();
        } else if (this.field1517 == var2) {
            this.field1518 = null;
            return null;
        } else {
            this.field1518 = var2.field920;
            return var2;
        }
    }

    @OriginalMember(owner = "UEUHLQTT", name = "b", descriptor = "(I)LJBHJGXME;")
    public class27 method513(int arg0) {
        int var2 = 5 / arg0;
        class27 var3 = this.field1518;
        if (this.field1517 == var3) {
            this.field1518 = null;
            return null;
        } else {
            this.field1518 = var3.field921;
            return var3;
        }
    }

    @OriginalMember(owner = "UEUHLQTT", name = "c", descriptor = "()V")
    public void method514() {
        if (this.field1517.field920 == this.field1517) {
            return;
        }
        while (true) {
            class27 var1 = this.field1517.field920;
            if (this.field1517 == var1) {
                return;
            }
            var1.method254();
        }
    }
}
