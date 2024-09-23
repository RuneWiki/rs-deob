import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("FEPBPONH")
public class class15 {

    @OriginalMember(owner = "FEPBPONH", name = "a", descriptor = "Z")
    private boolean field779 = false;

    @OriginalMember(owner = "FEPBPONH", name = "b", descriptor = "I")
    private int field780 = 145;

    @OriginalMember(owner = "FEPBPONH", name = "c", descriptor = "LCSUKQTYW;")
    public class8 field781 = new class8();

    @OriginalMember(owner = "FEPBPONH", name = "d", descriptor = "LCSUKQTYW;")
    private class8 field782;

    @OriginalMember(owner = "FEPBPONH", name = "<init>", descriptor = "(I)V")
    public class15(int arg0) {
        if (arg0 <= 0) {
            throw new NullPointerException();
        }
        this.field781.field615 = this.field781;
        this.field781.field616 = this.field781;
    }

    @OriginalMember(owner = "FEPBPONH", name = "a", descriptor = "(LCSUKQTYW;)V")
    public void method266(class8 arg0) {
        if (arg0.field616 != null) {
            arg0.method221();
        }
        arg0.field616 = this.field781.field616;
        arg0.field615 = this.field781;
        arg0.field616.field615 = arg0;
        arg0.field615.field616 = arg0;
    }

    @OriginalMember(owner = "FEPBPONH", name = "a", descriptor = "(LCSUKQTYW;Z)V")
    public void method267(class8 arg0, boolean arg1) {
        if (arg0.field616 != null) {
            arg0.method221();
        }
        arg0.field616 = this.field781;
        arg0.field615 = this.field781.field615;
        if (arg1) {
            arg0.field616.field615 = arg0;
            arg0.field615.field616 = arg0;
        }
    }

    @OriginalMember(owner = "FEPBPONH", name = "a", descriptor = "()LCSUKQTYW;")
    public class8 method268() {
        class8 var1 = this.field781.field615;
        if (this.field781 == var1) {
            return null;
        } else {
            var1.method221();
            return var1;
        }
    }

    @OriginalMember(owner = "FEPBPONH", name = "b", descriptor = "()LCSUKQTYW;")
    public class8 method269() {
        class8 var1 = this.field781.field615;
        if (this.field781 == var1) {
            this.field782 = null;
            return null;
        } else {
            this.field782 = var1.field615;
            return var1;
        }
    }

    @OriginalMember(owner = "FEPBPONH", name = "a", descriptor = "(I)LCSUKQTYW;")
    public class8 method270(int arg0) {
        if (arg0 != 0) {
            throw new NullPointerException();
        }
        class8 var2 = this.field781.field616;
        if (this.field781 == var2) {
            this.field782 = null;
            return null;
        } else {
            this.field782 = var2.field616;
            return var2;
        }
    }

    @OriginalMember(owner = "FEPBPONH", name = "b", descriptor = "(I)LCSUKQTYW;")
    public class8 method271(int arg0) {
        class8 var2 = this.field782;
        if (this.field781 == var2) {
            this.field782 = null;
            return null;
        }
        this.field782 = var2.field615;
        if (arg0 != 15175) {
            throw new NullPointerException();
        }
        return var2;
    }

    @OriginalMember(owner = "FEPBPONH", name = "a", descriptor = "(B)LCSUKQTYW;")
    public class8 method272(byte arg0) {
        class8 var2 = this.field782;
        if (this.field781 == var2) {
            this.field782 = null;
            return null;
        }
        this.field782 = var2.field616;
        if (arg0 != -48) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        return var2;
    }

    @OriginalMember(owner = "FEPBPONH", name = "c", descriptor = "()V")
    public void method273() {
        if (this.field781.field615 == this.field781) {
            return;
        }
        while (true) {
            class8 var1 = this.field781.field615;
            if (this.field781 == var1) {
                return;
            }
            var1.method221();
        }
    }
}
