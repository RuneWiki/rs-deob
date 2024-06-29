import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!GJIMXWNM")
public class class23 {

    @OriginalMember(owner = "client!GJIMXWNM", name = "g", descriptor = "Z")
    public boolean field951 = false;

    @OriginalMember(owner = "client!GJIMXWNM", name = "h", descriptor = "I")
    public int field952 = -1;

    @OriginalMember(owner = "client!GJIMXWNM", name = "j", descriptor = "Z")
    public boolean field954 = true;

    @OriginalMember(owner = "client!GJIMXWNM", name = "a", descriptor = "I")
    public static int field945;

    @OriginalMember(owner = "client!GJIMXWNM", name = "d", descriptor = "I")
    public int field948;

    @OriginalMember(owner = "client!GJIMXWNM", name = "e", descriptor = "I")
    public int field949;

    @OriginalMember(owner = "client!GJIMXWNM", name = "f", descriptor = "I")
    public int field950;

    @OriginalMember(owner = "client!GJIMXWNM", name = "i", descriptor = "I")
    public int field953;

    @OriginalMember(owner = "client!GJIMXWNM", name = "c", descriptor = "Ljava/lang/String;")
    public String field947;

    @OriginalMember(owner = "client!GJIMXWNM", name = "b", descriptor = "[LGJIMXWNM;")
    public static class23[] field946;

    @OriginalMember(owner = "client!GJIMXWNM", name = "a", descriptor = "(LFUZJMGZB;I)V")
    public static void method296(class19 arg0, int arg1) {
        class32 var2 = new class32((byte) 114, arg0.method277("varbit.dat", null));
        field945 = var2.method371();
        if (arg1 != 5) {
            return;
        }
        if (field946 == null) {
            field946 = new class23[field945];
        }
        for (int var3 = 0; var3 < field945; var3++) {
            if (field946[var3] == null) {
                field946[var3] = new class23();
            }
            field946[var3].method297(false, var2, var3);
            if (field946[var3].field951) {
                class33.field1048[field946[var3].field948].field1060 = true;
            }
        }
        if (var2.field1031.length != var2.field1032) {
            System.out.println("varbit load mismatch");
        }
    }

    @OriginalMember(owner = "client!GJIMXWNM", name = "a", descriptor = "(ZLLBBVYYXO;I)V")
    public void method297(boolean arg0, class32 arg1, int arg2) {
        if (arg0) {
            return;
        }
        while (true) {
            int var4 = arg1.method369();
            if (var4 == 0) {
                return;
            }
            if (var4 == 1) {
                this.field948 = arg1.method371();
                this.field949 = arg1.method369();
                this.field950 = arg1.method369();
            } else if (var4 == 10) {
                this.field947 = arg1.method376();
            } else if (var4 == 2) {
                this.field951 = true;
            } else if (var4 == 3) {
                this.field952 = arg1.method374();
            } else if (var4 == 4) {
                this.field953 = arg1.method374();
            } else if (var4 == 5) {
                this.field954 = false;
            } else {
                System.out.println("Error unrecognised config code: " + var4);
            }
        }
    }
}
