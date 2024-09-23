import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("NAZXUZWI")
public class class36 {

    @OriginalMember(owner = "NAZXUZWI", name = "a", descriptor = "I")
    private int field1095 = 35;

    @OriginalMember(owner = "NAZXUZWI", name = "b", descriptor = "I")
    private int field1096 = 41;

    @OriginalMember(owner = "NAZXUZWI", name = "c", descriptor = "Z")
    private boolean field1097 = false;

    @OriginalMember(owner = "NAZXUZWI", name = "d", descriptor = "LRZDMTEAZ;")
    public class49 field1098 = new class49();

    @OriginalMember(owner = "NAZXUZWI", name = "e", descriptor = "LRZDMTEAZ;")
    private class49 field1099;

    @OriginalMember(owner = "NAZXUZWI", name = "<init>", descriptor = "(I)V")
    public class36(int arg0) {
        this.field1098.field1414 = this.field1098;
        if (arg0 != 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        this.field1098.field1415 = this.field1098;
    }

    @OriginalMember(owner = "NAZXUZWI", name = "a", descriptor = "(LRZDMTEAZ;)V")
    public void method388(class49 arg0) {
        if (arg0.field1415 != null) {
            arg0.method495();
        }
        arg0.field1415 = this.field1098.field1415;
        arg0.field1414 = this.field1098;
        arg0.field1415.field1414 = arg0;
        arg0.field1414.field1415 = arg0;
    }

    @OriginalMember(owner = "NAZXUZWI", name = "a", descriptor = "()LRZDMTEAZ;")
    public class49 method389() {
        class49 var1 = this.field1098.field1414;
        if (this.field1098 == var1) {
            return null;
        } else {
            var1.method495();
            return var1;
        }
    }

    @OriginalMember(owner = "NAZXUZWI", name = "b", descriptor = "()LRZDMTEAZ;")
    public class49 method390() {
        class49 var1 = this.field1098.field1414;
        if (this.field1098 == var1) {
            this.field1099 = null;
            return null;
        } else {
            this.field1099 = var1.field1414;
            return var1;
        }
    }

    @OriginalMember(owner = "NAZXUZWI", name = "a", descriptor = "(I)LRZDMTEAZ;")
    public class49 method391(int arg0) {
        if (arg0 != 15175) {
            this.field1096 = 262;
        }
        class49 var2 = this.field1099;
        if (this.field1098 == var2) {
            this.field1099 = null;
            return null;
        } else {
            this.field1099 = var2.field1414;
            return var2;
        }
    }

    @OriginalMember(owner = "NAZXUZWI", name = "c", descriptor = "()I")
    public int method392() {
        int var1 = 0;
        for (class49 var2 = this.field1098.field1414; var2 != this.field1098; var2 = var2.field1414) {
            var1++;
        }
        return var1;
    }
}
