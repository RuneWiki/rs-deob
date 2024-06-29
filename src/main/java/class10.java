import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!EDMDOBNM")
public class class10 {

    @OriginalMember(owner = "client!EDMDOBNM", name = "b", descriptor = "LMCYIFIZT;")
    public class36 field667 = new class36();

    @OriginalMember(owner = "client!EDMDOBNM", name = "a", descriptor = "I")
    private int field666;

    @OriginalMember(owner = "client!EDMDOBNM", name = "c", descriptor = "LMCYIFIZT;")
    private class36 field668;

    @OriginalMember(owner = "client!EDMDOBNM", name = "<init>", descriptor = "(I)V")
    public class10(int arg0) {
        if (arg0 != 0) {
            this.field666 = 64;
        }
        this.field667.field1035 = this.field667;
        this.field667.field1036 = this.field667;
    }

    @OriginalMember(owner = "client!EDMDOBNM", name = "a", descriptor = "(LMCYIFIZT;)V")
    public void method193(class36 arg0) {
        if (arg0.field1036 != null) {
            arg0.method380();
        }
        arg0.field1036 = this.field667.field1036;
        arg0.field1035 = this.field667;
        arg0.field1036.field1035 = arg0;
        arg0.field1035.field1036 = arg0;
    }

    @OriginalMember(owner = "client!EDMDOBNM", name = "a", descriptor = "()LMCYIFIZT;")
    public class36 method194() {
        class36 var1 = this.field667.field1035;
        if (this.field667 == var1) {
            return null;
        } else {
            var1.method380();
            return var1;
        }
    }

    @OriginalMember(owner = "client!EDMDOBNM", name = "b", descriptor = "()LMCYIFIZT;")
    public class36 method195() {
        class36 var1 = this.field667.field1035;
        if (this.field667 == var1) {
            this.field668 = null;
            return null;
        } else {
            this.field668 = var1.field1035;
            return var1;
        }
    }

    @OriginalMember(owner = "client!EDMDOBNM", name = "a", descriptor = "(I)LMCYIFIZT;")
    public class36 method196(int arg0) {
        if (arg0 < 6 || arg0 > 6) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        class36 var3 = this.field668;
        if (this.field667 == var3) {
            this.field668 = null;
            return null;
        } else {
            this.field668 = var3.field1035;
            return var3;
        }
    }

    @OriginalMember(owner = "client!EDMDOBNM", name = "c", descriptor = "()I")
    public int method197() {
        int var1 = 0;
        for (class36 var2 = this.field667.field1035; var2 != this.field667; var2 = var2.field1035) {
            var1++;
        }
        return var1;
    }
}
