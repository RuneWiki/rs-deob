import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("LIHJZCBF")
public class class31 {

    @OriginalMember(owner = "LIHJZCBF", name = "a", descriptor = "I")
    private int field976 = 9;

    @OriginalMember(owner = "LIHJZCBF", name = "b", descriptor = "I")
    private int field977;

    @OriginalMember(owner = "LIHJZCBF", name = "c", descriptor = "[LJBHJGXME;")
    private class27[] field978;

    @OriginalMember(owner = "LIHJZCBF", name = "<init>", descriptor = "(IB)V")
    public class31(int arg0, byte arg1) {
        if (arg1 != -5) {
            throw new NullPointerException();
        }
        this.field977 = arg0;
        this.field978 = new class27[arg0];
        for (int var3 = 0; var3 < arg0; var3++) {
            class27 var4 = this.field978[var3] = new class27();
            var4.field920 = var4;
            var4.field921 = var4;
        }
    }

    @OriginalMember(owner = "LIHJZCBF", name = "a", descriptor = "(J)LJBHJGXME;")
    public class27 method279(long arg0) {
        class27 var3 = this.field978[(int) (arg0 & (long) (this.field977 - 1))];
        for (class27 var4 = var3.field920; var4 != var3; var4 = var4.field920) {
            if (var4.field919 == arg0) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "LIHJZCBF", name = "a", descriptor = "(LJBHJGXME;JI)V")
    public void method280(class27 arg0, long arg1, int arg2) {
        if (arg0.field921 != null) {
            arg0.method254();
        }
        class27 var5 = this.field978[(int) (arg1 & (long) (this.field977 - 1))];
        arg0.field921 = var5.field921;
        arg0.field920 = var5;
        if (arg2 != -24089) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        arg0.field921.field920 = arg0;
        arg0.field920.field921 = arg0;
        arg0.field919 = arg1;
    }
}
