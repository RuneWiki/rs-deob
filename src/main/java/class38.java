import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("OCPYCLUF")
public class class38 {

    @OriginalMember(owner = "OCPYCLUF", name = "b", descriptor = "I")
    private int field1188 = 6;

    @OriginalMember(owner = "OCPYCLUF", name = "d", descriptor = "Z")
    private boolean field1190 = true;

    @OriginalMember(owner = "OCPYCLUF", name = "e", descriptor = "LMRGQMKFG;")
    public class34 field1191 = new class34();

    @OriginalMember(owner = "OCPYCLUF", name = "c", descriptor = "I")
    private int field1189;

    @OriginalMember(owner = "OCPYCLUF", name = "a", descriptor = "I")
    private int field1187;

    @OriginalMember(owner = "OCPYCLUF", name = "f", descriptor = "LMRGQMKFG;")
    private class34 field1192;

    @OriginalMember(owner = "OCPYCLUF", name = "<init>", descriptor = "(B)V")
    public class38(byte arg0) {
        if (arg0 != 118) {
            this.field1189 = 390;
        }
        this.field1191.field1087 = this.field1191;
        this.field1191.field1088 = this.field1191;
    }

    @OriginalMember(owner = "OCPYCLUF", name = "a", descriptor = "(LMRGQMKFG;)V")
    public void method411(class34 arg0) {
        if (arg0.field1088 != null) {
            arg0.method336();
        }
        arg0.field1088 = this.field1191.field1088;
        arg0.field1087 = this.field1191;
        arg0.field1088.field1087 = arg0;
        arg0.field1087.field1088 = arg0;
    }

    @OriginalMember(owner = "OCPYCLUF", name = "a", descriptor = "(LMRGQMKFG;B)V")
    public void method412(class34 arg0, byte arg1) {
        if (arg1 != -109) {
            this.field1189 = 345;
        }
        if (arg0.field1088 != null) {
            arg0.method336();
        }
        arg0.field1088 = this.field1191;
        arg0.field1087 = this.field1191.field1087;
        arg0.field1088.field1087 = arg0;
        arg0.field1087.field1088 = arg0;
        if (class34.field1089) {
        }
    }

    @OriginalMember(owner = "OCPYCLUF", name = "a", descriptor = "()LMRGQMKFG;")
    public class34 method413() {
        class34 var1 = this.field1191.field1087;
        if (this.field1191 == var1) {
            return null;
        } else {
            var1.method336();
            return var1;
        }
    }

    @OriginalMember(owner = "OCPYCLUF", name = "b", descriptor = "()LMRGQMKFG;")
    public class34 method414() {
        class34 var1 = this.field1191.field1087;
        if (this.field1191 == var1) {
            this.field1192 = null;
            return null;
        } else {
            this.field1192 = var1.field1087;
            return var1;
        }
    }

    @OriginalMember(owner = "OCPYCLUF", name = "a", descriptor = "(I)LMRGQMKFG;")
    public class34 method415(int arg0) {
        class34 var2 = this.field1191.field1088;
        if (arg0 < this.field1188 || arg0 > this.field1188) {
            throw new NullPointerException();
        } else if (this.field1191 == var2) {
            this.field1192 = null;
            return null;
        } else {
            this.field1192 = var2.field1088;
            return var2;
        }
    }

    @OriginalMember(owner = "OCPYCLUF", name = "b", descriptor = "(I)LMRGQMKFG;")
    public class34 method416(int arg0) {
        class34 var2 = this.field1192;
        if (arg0 != 0) {
            this.field1190 = !this.field1190;
        }
        if (this.field1191 == var2) {
            this.field1192 = null;
            return null;
        } else {
            this.field1192 = var2.field1087;
            return var2;
        }
    }

    @OriginalMember(owner = "OCPYCLUF", name = "a", descriptor = "(Z)LMRGQMKFG;")
    public class34 method417(boolean arg0) {
        if (!arg0) {
            this.field1187 = -90;
        }
        class34 var2 = this.field1192;
        if (this.field1191 == var2) {
            this.field1192 = null;
            return null;
        } else {
            this.field1192 = var2.field1088;
            return var2;
        }
    }

    @OriginalMember(owner = "OCPYCLUF", name = "c", descriptor = "()V")
    public void method418() {
        if (this.field1191.field1087 == this.field1191) {
            return;
        }
        while (true) {
            class34 var1 = this.field1191.field1087;
            if (this.field1191 == var1) {
                return;
            }
            var1.method336();
        }
    }
}
