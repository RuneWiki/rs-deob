import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!TSCGUBKV")
public class class50 {

    @OriginalMember(owner = "client!TSCGUBKV", name = "a", descriptor = "I")
    private int field1450 = -420;

    @OriginalMember(owner = "client!TSCGUBKV", name = "b", descriptor = "Z")
    private boolean field1451 = false;

    @OriginalMember(owner = "client!TSCGUBKV", name = "c", descriptor = "LYBEHHNFF;")
    public class65 field1452 = new class65();

    @OriginalMember(owner = "client!TSCGUBKV", name = "d", descriptor = "LYBEHHNFF;")
    private class65 field1453;

    @OriginalMember(owner = "client!TSCGUBKV", name = "<init>", descriptor = "(I)V")
    public class50(int arg0) {
        this.field1452.field1704 = this.field1452;
        this.field1452.field1705 = this.field1452;
        if (arg0 >= 0) {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "client!TSCGUBKV", name = "a", descriptor = "(LYBEHHNFF;)V")
    public void method459(class65 arg0) {
        if (arg0.field1705 != null) {
            arg0.method567();
        }
        arg0.field1705 = this.field1452.field1705;
        arg0.field1704 = this.field1452;
        arg0.field1705.field1704 = arg0;
        arg0.field1704.field1705 = arg0;
    }

    @OriginalMember(owner = "client!TSCGUBKV", name = "a", descriptor = "()LYBEHHNFF;")
    public class65 method460() {
        class65 var1 = this.field1452.field1704;
        if (this.field1452 == var1) {
            return null;
        } else {
            var1.method567();
            return var1;
        }
    }

    @OriginalMember(owner = "client!TSCGUBKV", name = "b", descriptor = "()LYBEHHNFF;")
    public class65 method461() {
        class65 var1 = this.field1452.field1704;
        if (this.field1452 == var1) {
            this.field1453 = null;
            return null;
        } else {
            this.field1453 = var1.field1704;
            return var1;
        }
    }

    @OriginalMember(owner = "client!TSCGUBKV", name = "a", descriptor = "(I)LYBEHHNFF;")
    public class65 method462(int arg0) {
        class65 var2 = this.field1453;
        if (this.field1452 == var2) {
            this.field1453 = null;
            return null;
        }
        this.field1453 = var2.field1704;
        if (arg0 >= 0) {
            throw new NullPointerException();
        }
        return var2;
    }

    @OriginalMember(owner = "client!TSCGUBKV", name = "c", descriptor = "()I")
    public int method463() {
        int var1 = 0;
        for (class65 var2 = this.field1452.field1704; var2 != this.field1452; var2 = var2.field1704) {
            var1++;
        }
        return var1;
    }
}
