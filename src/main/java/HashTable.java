import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("t")
public class HashTable {

    @OriginalMember(owner = "t", name = "a", descriptor = "I")
    private int field283 = 647;

    @OriginalMember(owner = "t", name = "b", descriptor = "I")
    private int field284;

    @OriginalMember(owner = "t", name = "c", descriptor = "[Lu;")
    private Linkable[] field285;

    @OriginalMember(owner = "t", name = "<init>", descriptor = "(BI)V")
    public HashTable(byte arg0, int arg1) {
        this.field284 = arg1;
        if (arg0 != 1) {
            throw new NullPointerException();
        }
        boolean var3 = false;
        this.field285 = new Linkable[arg1];
        for (int var4 = 0; var4 < arg1; var4++) {
            Linkable var5 = this.field285[var4] = new Linkable();
            var5.field287 = var5;
            var5.field288 = var5;
        }
    }

    @OriginalMember(owner = "t", name = "a", descriptor = "(J)Lu;")
    public Linkable method102(long arg0) {
        Linkable var3 = this.field285[(int) (arg0 & (long) (this.field284 - 1))];
        for (Linkable var4 = var3.field287; var4 != var3; var4 = var4.field287) {
            if (var4.field286 == arg0) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "t", name = "a", descriptor = "(Lu;IJ)V")
    public void method103(Linkable arg0, int arg1, long arg2) {
        if (arg0.field288 != null) {
            arg0.method104();
        }
        Linkable var5 = this.field285[(int) (arg2 & (long) (this.field284 - 1))];
        arg0.field288 = var5.field288;
        arg0.field287 = var5;
        arg0.field288.field287 = arg0;
        arg0.field287.field288 = arg0;
        if (arg1 < 0) {
            arg0.field286 = arg2;
        }
    }
}
