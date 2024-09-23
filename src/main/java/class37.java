import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("KMFVYEKJ")
public class class37 {

    @OriginalMember(owner = "KMFVYEKJ", name = "a", descriptor = "Z")
    private boolean field1205 = false;

    @OriginalMember(owner = "KMFVYEKJ", name = "b", descriptor = "I")
    private int field1206 = -5196;

    @OriginalMember(owner = "KMFVYEKJ", name = "c", descriptor = "LMOVYLKVL;")
    public class41 field1207 = new class41();

    @OriginalMember(owner = "KMFVYEKJ", name = "d", descriptor = "LMOVYLKVL;")
    private class41 field1208;

    @OriginalMember(owner = "KMFVYEKJ", name = "<init>", descriptor = "(I)V")
    public class37(int arg0) {
        this.field1207.field1236 = this.field1207;
        if (arg0 != 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        this.field1207.field1237 = this.field1207;
    }

    @OriginalMember(owner = "KMFVYEKJ", name = "a", descriptor = "(LMOVYLKVL;)V")
    public void method371(class41 arg0) {
        if (arg0.field1237 != null) {
            arg0.method379();
        }
        arg0.field1237 = this.field1207.field1237;
        arg0.field1236 = this.field1207;
        arg0.field1237.field1236 = arg0;
        arg0.field1236.field1237 = arg0;
    }

    @OriginalMember(owner = "KMFVYEKJ", name = "a", descriptor = "()LMOVYLKVL;")
    public class41 method372() {
        class41 var1 = this.field1207.field1236;
        if (this.field1207 == var1) {
            return null;
        } else {
            var1.method379();
            return var1;
        }
    }

    @OriginalMember(owner = "KMFVYEKJ", name = "b", descriptor = "()LMOVYLKVL;")
    public class41 method373() {
        class41 var1 = this.field1207.field1236;
        if (this.field1207 == var1) {
            this.field1208 = null;
            return null;
        } else {
            this.field1208 = var1.field1236;
            return var1;
        }
    }

    @OriginalMember(owner = "KMFVYEKJ", name = "a", descriptor = "(I)LMOVYLKVL;")
    public class41 method374(int arg0) {
        class41 var2 = this.field1208;
        if (this.field1207 == var2) {
            this.field1208 = null;
            return null;
        }
        this.field1208 = var2.field1236;
        if (arg0 != 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        return var2;
    }

    @OriginalMember(owner = "KMFVYEKJ", name = "c", descriptor = "()I")
    public int method375() {
        int var1 = 0;
        for (class41 var2 = this.field1207.field1236; var2 != this.field1207; var2 = var2.field1236) {
            var1++;
        }
        return var1;
    }
}
