import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("STTRNURD")
public class class49 {

    @OriginalMember(owner = "STTRNURD", name = "b", descriptor = "I")
    private int field1297;

    @OriginalMember(owner = "STTRNURD", name = "c", descriptor = "[LZSZDCWXM;")
    private class72[] field1298;

    @OriginalMember(owner = "STTRNURD", name = "a", descriptor = "I")
    private int field1296;

    @OriginalMember(owner = "STTRNURD", name = "<init>", descriptor = "(ZI)V")
    public class49(boolean arg0, int arg1) {
        this.field1297 = arg1;
        this.field1298 = new class72[arg1];
        if (arg0) {
            throw new NullPointerException();
        }
        for (int var3 = 0; var3 < arg1; var3++) {
            class72 var4 = this.field1298[var3] = new class72();
            var4.field1711 = var4;
            var4.field1712 = var4;
        }
    }

    @OriginalMember(owner = "STTRNURD", name = "a", descriptor = "(J)LZSZDCWXM;")
    public class72 method414(long arg0) {
        class72 var3 = this.field1298[(int) (arg0 & (long) (this.field1297 - 1))];
        for (class72 var4 = var3.field1711; var4 != var3; var4 = var4.field1711) {
            if (var4.field1710 == arg0) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "STTRNURD", name = "a", descriptor = "(JLZSZDCWXM;I)V")
    public void method415(long arg0, class72 arg1, int arg2) {
        if (arg1.field1712 != null) {
            arg1.method589();
        }
        class72 var5 = this.field1298[(int) (arg0 & (long) (this.field1297 - 1))];
        arg1.field1712 = var5.field1712;
        arg1.field1711 = var5;
        arg1.field1712.field1711 = arg1;
        arg1.field1711.field1712 = arg1;
        if (arg2 < 1 || arg2 > 1) {
            this.field1296 = 54;
        }
        arg1.field1710 = arg0;
    }
}
