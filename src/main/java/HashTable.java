import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!JLFXAIRK")
public class HashTable {

    @OriginalMember(owner = "client!JLFXAIRK", name = "a", descriptor = "Z")
    private boolean field897 = true;

    @OriginalMember(owner = "client!JLFXAIRK", name = "b", descriptor = "Z")
    private boolean field898 = true;

    @OriginalMember(owner = "client!JLFXAIRK", name = "c", descriptor = "I")
    private int field899;

    @OriginalMember(owner = "client!JLFXAIRK", name = "d", descriptor = "[LZUOIJLRD;")
    private Linkable[] field900;

    @OriginalMember(owner = "client!JLFXAIRK", name = "<init>", descriptor = "(BI)V")
    public HashTable(byte arg0, int arg1) {
        this.field899 = arg1;
        this.field900 = new Linkable[arg1];
        for (int var3 = 0; var3 < arg1; var3++) {
            Linkable var5 = this.field900[var3] = new Linkable();
            var5.field1770 = var5;
            var5.field1771 = var5;
        }
        if (arg0 != 0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
    }

    @OriginalMember(owner = "client!JLFXAIRK", name = "a", descriptor = "(J)LZUOIJLRD;")
    public Linkable method259(long arg0) {
        Linkable var3 = this.field900[(int) (arg0 & (long) (this.field899 - 1))];
        for (Linkable var4 = var3.field1770; var4 != var3; var4 = var4.field1770) {
            if (var4.field1769 == arg0) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!JLFXAIRK", name = "a", descriptor = "(ILZUOIJLRD;J)V")
    public void method260(int arg0, Linkable arg1, long arg2) {
        if (arg1.field1771 != null) {
            arg1.method604();
        }
        Linkable var5 = this.field900[(int) (arg2 & (long) (this.field899 - 1))];
        if (arg0 != 6) {
            return;
        }
        arg1.field1771 = var5.field1771;
        arg1.field1770 = var5;
        arg1.field1771.field1770 = arg1;
        arg1.field1770.field1771 = arg1;
        arg1.field1769 = arg2;
    }
}
