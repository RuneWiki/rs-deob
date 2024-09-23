import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("FOKYUBQV")
public class class16 {

    @OriginalMember(owner = "FOKYUBQV", name = "a", descriptor = "Z")
    private boolean field718 = false;

    @OriginalMember(owner = "FOKYUBQV", name = "b", descriptor = "I")
    private int field719 = 2;

    @OriginalMember(owner = "FOKYUBQV", name = "c", descriptor = "Z")
    private boolean field720 = false;

    @OriginalMember(owner = "FOKYUBQV", name = "d", descriptor = "LFLQEGCUY;")
    public class15 field721 = new class15();

    @OriginalMember(owner = "FOKYUBQV", name = "e", descriptor = "LFLQEGCUY;")
    private class15 field722;

    @OriginalMember(owner = "FOKYUBQV", name = "<init>", descriptor = "(Z)V")
    public class16(boolean arg0) {
        this.field721.field715 = this.field721;
        this.field721.field716 = this.field721;
        if (arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
    }

    @OriginalMember(owner = "FOKYUBQV", name = "a", descriptor = "(LFLQEGCUY;)V")
    public void method196(class15 arg0) {
        if (arg0.field716 != null) {
            arg0.method195();
        }
        arg0.field716 = this.field721.field716;
        arg0.field715 = this.field721;
        arg0.field716.field715 = arg0;
        arg0.field715.field716 = arg0;
    }

    @OriginalMember(owner = "FOKYUBQV", name = "a", descriptor = "(ILFLQEGCUY;)V")
    public void method197(int arg0, class15 arg1) {
        if (arg1.field716 != null) {
            arg1.method195();
        }
        arg1.field716 = this.field721;
        arg1.field715 = this.field721.field715;
        if (arg0 == 0) {
            arg1.field716.field715 = arg1;
            arg1.field715.field716 = arg1;
        }
    }

    @OriginalMember(owner = "FOKYUBQV", name = "a", descriptor = "()LFLQEGCUY;")
    public class15 method198() {
        class15 var1 = this.field721.field715;
        if (this.field721 == var1) {
            return null;
        } else {
            var1.method195();
            return var1;
        }
    }

    @OriginalMember(owner = "FOKYUBQV", name = "b", descriptor = "()LFLQEGCUY;")
    public class15 method199() {
        class15 var1 = this.field721.field715;
        if (this.field721 == var1) {
            this.field722 = null;
            return null;
        } else {
            this.field722 = var1.field715;
            return var1;
        }
    }

    @OriginalMember(owner = "FOKYUBQV", name = "a", descriptor = "(I)LFLQEGCUY;")
    public class15 method200(int arg0) {
        class15 var2 = this.field721.field716;
        if (this.field721 == var2) {
            this.field722 = null;
            return null;
        }
        this.field722 = var2.field716;
        if (arg0 != 0) {
            throw new NullPointerException();
        }
        return var2;
    }

    @OriginalMember(owner = "FOKYUBQV", name = "b", descriptor = "(I)LFLQEGCUY;")
    public class15 method201(int arg0) {
        class15 var2 = this.field722;
        int var3 = 63 / arg0;
        if (this.field721 == var2) {
            this.field722 = null;
            return null;
        } else {
            this.field722 = var2.field715;
            return var2;
        }
    }

    @OriginalMember(owner = "FOKYUBQV", name = "c", descriptor = "(I)LFLQEGCUY;")
    public class15 method202(int arg0) {
        if (arg0 != 0) {
            this.field720 = !this.field720;
        }
        class15 var2 = this.field722;
        if (this.field721 == var2) {
            this.field722 = null;
            return null;
        } else {
            this.field722 = var2.field716;
            return var2;
        }
    }

    @OriginalMember(owner = "FOKYUBQV", name = "c", descriptor = "()V")
    public void method203() {
        if (this.field721.field715 == this.field721) {
            return;
        }
        while (true) {
            class15 var1 = this.field721.field715;
            if (this.field721 == var1) {
                return;
            }
            var1.method195();
        }
    }
}
