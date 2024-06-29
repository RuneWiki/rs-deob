import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!SOYNUDRE")
public class class53 {

    @OriginalMember(owner = "client!SOYNUDRE", name = "a", descriptor = "I")
    private int field1301 = 568;

    @OriginalMember(owner = "client!SOYNUDRE", name = "b", descriptor = "Z")
    private boolean field1302 = false;

    @OriginalMember(owner = "client!SOYNUDRE", name = "c", descriptor = "I")
    private int field1303;

    @OriginalMember(owner = "client!SOYNUDRE", name = "d", descriptor = "[LBRISMNPP;")
    private class8[] field1304;

    @OriginalMember(owner = "client!SOYNUDRE", name = "<init>", descriptor = "(IB)V")
    public class53(int arg0, byte arg1) {
        this.field1303 = arg0;
        this.field1304 = new class8[arg0];
        if (arg1 != 34) {
            throw new NullPointerException();
        }
        for (int var3 = 0; var3 < arg0; var3++) {
            class8 var4 = this.field1304[var3] = new class8();
            var4.field111 = var4;
            var4.field112 = var4;
        }
    }

    @OriginalMember(owner = "client!SOYNUDRE", name = "a", descriptor = "(J)LBRISMNPP;")
    public class8 method440(long arg0) {
        class8 var3 = this.field1304[(int) (arg0 & (long) (this.field1303 - 1))];
        for (class8 var4 = var3.field111; var4 != var3; var4 = var4.field111) {
            if (var4.field110 == arg0) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!SOYNUDRE", name = "a", descriptor = "(ZLBRISMNPP;J)V")
    public void method441(boolean arg0, class8 arg1, long arg2) {
        if (arg1.field112 != null) {
            arg1.method20();
        }
        class8 var5 = this.field1304[(int) (arg2 & (long) (this.field1303 - 1))];
        arg1.field112 = var5.field112;
        arg1.field111 = var5;
        arg1.field112.field111 = arg1;
        if (!arg0) {
            arg1.field111.field112 = arg1;
            arg1.field110 = arg2;
        }
    }
}
