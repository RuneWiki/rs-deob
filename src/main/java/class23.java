import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("HUPZKMWH")
public class class23 {

    @OriginalMember(owner = "HUPZKMWH", name = "i", descriptor = "Z")
    public boolean field889 = false;

    @OriginalMember(owner = "HUPZKMWH", name = "j", descriptor = "I")
    public int field890 = -1;

    @OriginalMember(owner = "HUPZKMWH", name = "l", descriptor = "Z")
    public boolean field892 = true;

    @OriginalMember(owner = "HUPZKMWH", name = "a", descriptor = "Z")
    private static boolean field881 = true;

    @OriginalMember(owner = "HUPZKMWH", name = "b", descriptor = "I")
    private static int field882 = -12;

    @OriginalMember(owner = "HUPZKMWH", name = "c", descriptor = "I")
    public static int field883;

    @OriginalMember(owner = "HUPZKMWH", name = "f", descriptor = "I")
    public int field886;

    @OriginalMember(owner = "HUPZKMWH", name = "g", descriptor = "I")
    public int field887;

    @OriginalMember(owner = "HUPZKMWH", name = "h", descriptor = "I")
    public int field888;

    @OriginalMember(owner = "HUPZKMWH", name = "k", descriptor = "I")
    public int field891;

    @OriginalMember(owner = "HUPZKMWH", name = "e", descriptor = "Ljava/lang/String;")
    public String field885;

    @OriginalMember(owner = "HUPZKMWH", name = "d", descriptor = "[LHUPZKMWH;")
    public static class23[] field884;

    @OriginalMember(owner = "HUPZKMWH", name = "a", descriptor = "(ZLMJLXHQTQ;)V")
    public static void method238(boolean arg0, class44 arg1) {
        class69 var2 = new class69(arg1.method317("varbit.dat", null), -82);
        field883 = var2.method467();
        if (!arg0) {
            field882 = 72;
        }
        if (field884 == null) {
            field884 = new class23[field883];
        }
        for (int var3 = 0; var3 < field883; var3++) {
            if (field884[var3] == null) {
                field884[var3] = new class23();
            }
            field884[var3].method239(var3, 0, var2);
            if (field884[var3].field889) {
                class36.field1041[field884[var3].field886].field1053 = true;
            }
        }
        if (var2.field1651.length != var2.field1652) {
            System.out.println("varbit load mismatch");
        }
    }

    @OriginalMember(owner = "HUPZKMWH", name = "a", descriptor = "(IILXGRGMPUQ;)V")
    public void method239(int arg0, int arg1, class69 arg2) {
        if (arg1 != 0) {
            return;
        }
        while (true) {
            int var4 = arg2.method465();
            if (var4 == 0) {
                return;
            }
            if (var4 == 1) {
                this.field886 = arg2.method467();
                this.field887 = arg2.method465();
                this.field888 = arg2.method465();
            } else if (var4 == 10) {
                this.field885 = arg2.method472();
            } else if (var4 == 2) {
                this.field889 = true;
            } else if (var4 == 3) {
                this.field890 = arg2.method470();
            } else if (var4 == 4) {
                this.field891 = arg2.method470();
            } else if (var4 == 5) {
                this.field892 = false;
            } else {
                System.out.println("Error unrecognised config code: " + var4);
            }
        }
    }
}
