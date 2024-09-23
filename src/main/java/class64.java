import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("YDSZUOCR")
public class class64 {

    @OriginalMember(owner = "YDSZUOCR", name = "a", descriptor = "Z")
    private boolean field1607 = true;

    @OriginalMember(owner = "YDSZUOCR", name = "b", descriptor = "I")
    private int field1608;

    @OriginalMember(owner = "YDSZUOCR", name = "c", descriptor = "[LZZBPVHZB;")
    private class72[] field1609;

    @OriginalMember(owner = "YDSZUOCR", name = "<init>", descriptor = "(II)V")
    public class64(int arg0, int arg1) {
        int var3 = 32 / arg0;
        this.field1608 = arg1;
        this.field1609 = new class72[arg1];
        for (int var4 = 0; var4 < arg1; var4++) {
            class72 var5 = this.field1609[var4] = new class72();
            var5.field1735 = var5;
            var5.field1736 = var5;
        }
    }

    @OriginalMember(owner = "YDSZUOCR", name = "a", descriptor = "(J)LZZBPVHZB;")
    public class72 method518(long arg0) {
        class72 var3 = this.field1609[(int) (arg0 & (long) (this.field1608 - 1))];
        for (class72 var4 = var3.field1735; var4 != var3; var4 = var4.field1735) {
            if (var4.field1734 == arg0) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "YDSZUOCR", name = "a", descriptor = "(ZLZZBPVHZB;J)V")
    public void method519(boolean arg0, class72 arg1, long arg2) {
        if (arg1.field1736 != null) {
            arg1.method591();
        }
        class72 var5 = this.field1609[(int) (arg2 & (long) (this.field1608 - 1))];
        arg1.field1736 = var5.field1736;
        arg1.field1735 = var5;
        arg1.field1736.field1735 = arg1;
        arg1.field1735.field1736 = arg1;
        if (!arg0) {
            this.field1607 = !this.field1607;
        }
        arg1.field1734 = arg2;
    }
}
