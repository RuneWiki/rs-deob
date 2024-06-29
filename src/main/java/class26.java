import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!JFFNRVFW")
public class class26 {

    @OriginalMember(owner = "client!JFFNRVFW", name = "b", descriptor = "I")
    private int field894 = 635;

    @OriginalMember(owner = "client!JFFNRVFW", name = "i", descriptor = "Z")
    public boolean field901 = false;

    @OriginalMember(owner = "client!JFFNRVFW", name = "j", descriptor = "I")
    public int field902 = -1;

    @OriginalMember(owner = "client!JFFNRVFW", name = "l", descriptor = "Z")
    public boolean field904 = true;

    @OriginalMember(owner = "client!JFFNRVFW", name = "a", descriptor = "I")
    private static int field893;

    @OriginalMember(owner = "client!JFFNRVFW", name = "c", descriptor = "I")
    public static int field895;

    @OriginalMember(owner = "client!JFFNRVFW", name = "f", descriptor = "I")
    public int field898;

    @OriginalMember(owner = "client!JFFNRVFW", name = "g", descriptor = "I")
    public int field899;

    @OriginalMember(owner = "client!JFFNRVFW", name = "h", descriptor = "I")
    public int field900;

    @OriginalMember(owner = "client!JFFNRVFW", name = "k", descriptor = "I")
    public int field903;

    @OriginalMember(owner = "client!JFFNRVFW", name = "e", descriptor = "Ljava/lang/String;")
    public String field897;

    @OriginalMember(owner = "client!JFFNRVFW", name = "d", descriptor = "[LJFFNRVFW;")
    public static class26[] field896;

    @OriginalMember(owner = "client!JFFNRVFW", name = "a", descriptor = "(ZLFXNTEMPE;)V")
    public static void method268(boolean arg0, class18 arg1) {
        if (!arg0) {
            field893 = 217;
        }
        class50 var2 = new class50(arg1.method212("varbit.dat", null), -46859);
        field895 = var2.method390();
        if (field896 == null) {
            field896 = new class26[field895];
        }
        for (int var3 = 0; var3 < field895; var3++) {
            if (field896[var3] == null) {
                field896[var3] = new class26();
            }
            field896[var3].method269(var3, 635, var2);
            if (field896[var3].field901) {
                class60.field1420[field896[var3].field898].field1432 = true;
            }
        }
        if (var2.field1224.length != var2.field1225) {
            System.out.println("varbit load mismatch");
        }
    }

    @OriginalMember(owner = "client!JFFNRVFW", name = "a", descriptor = "(IILRSWRPCHR;)V")
    public void method269(int arg0, int arg1, class50 arg2) {
        if (arg1 <= 0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        while (true) {
            int var5 = arg2.method388();
            if (var5 == 0) {
                return;
            }
            if (var5 == 1) {
                this.field898 = arg2.method390();
                this.field899 = arg2.method388();
                this.field900 = arg2.method388();
            } else if (var5 == 10) {
                this.field897 = arg2.method395();
            } else if (var5 == 2) {
                this.field901 = true;
            } else if (var5 == 3) {
                this.field902 = arg2.method393();
            } else if (var5 == 4) {
                this.field903 = arg2.method393();
            } else if (var5 == 5) {
                this.field904 = false;
            } else {
                System.out.println("Error unrecognised config code: " + var5);
            }
        }
    }
}
