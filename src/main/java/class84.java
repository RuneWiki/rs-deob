import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dv")
public class class84 {

    @OriginalMember(owner = "client!dv", name = "f", descriptor = "I")
    private int field1245 = 0;

    @OriginalMember(owner = "client!dv", name = "e", descriptor = "Lpl;")
    private class616 field1244;

    @OriginalMember(owner = "client!dv", name = "g", descriptor = "I")
    public static int field1246 = 64;

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "I")
    public static int field1240;

    @OriginalMember(owner = "client!dv", name = "b", descriptor = "I")
    public static int field1241;

    @OriginalMember(owner = "client!dv", name = "c", descriptor = "I")
    public static int field1242;

    @OriginalMember(owner = "client!dv", name = "h", descriptor = "I")
    public static int field1247;

    @OriginalMember(owner = "client!dv", name = "d", descriptor = "Lds;")
    private class65 field1243;

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(FFFZ)F")
    public static final float method749(float arg0, float arg1, float arg2, boolean arg3) {
        field1247++;
        if (!arg3) {
            method749(0.69831467F, -1.0839285F, 1.2061524F, true);
        }
        return (arg2 - arg1) * arg0 + arg1;
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(I)Lds;")
    public final class65 method750(int arg0) {
        if (arg0 <= 35) {
            this.method750(-47);
        }
        field1242++;
        if (this.field1245 > 0 && this.field1244.field8680[this.field1245 - 1] != this.field1243) {
            class65 var2 = this.field1243;
            this.field1243 = var2.field1044;
            return var2;
        }
        while (this.field1245 < this.field1244.field8684) {
            class65 var3 = this.field1244.field8680[this.field1245++].field1044;
            if (this.field1244.field8680[this.field1245 - 1] != var3) {
                this.field1243 = var3.field1044;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(B)Lds;")
    public final class65 method751(byte arg0) {
        field1240++;
        this.field1245 = 0;
        if (arg0 <= 46) {
            field1246 = -126;
        }
        return this.method750(79);
    }

    @OriginalMember(owner = "client!dv", name = "<init>", descriptor = "()V")
    public class84() {
    }

    @OriginalMember(owner = "client!dv", name = "<init>", descriptor = "(Lpl;)V")
    public class84(class616 arg0) {
        this.field1244 = arg0;
    }
}
