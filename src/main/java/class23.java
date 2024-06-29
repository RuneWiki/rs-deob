import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!JYNIYSOU")
public class class23 {

    @OriginalMember(owner = "client!JYNIYSOU", name = "h", descriptor = "Z")
    public boolean field842 = false;

    @OriginalMember(owner = "client!JYNIYSOU", name = "i", descriptor = "I")
    public int field843 = -1;

    @OriginalMember(owner = "client!JYNIYSOU", name = "k", descriptor = "Z")
    public boolean field845 = true;

    @OriginalMember(owner = "client!JYNIYSOU", name = "b", descriptor = "I")
    public static int field836;

    @OriginalMember(owner = "client!JYNIYSOU", name = "e", descriptor = "I")
    public int field839;

    @OriginalMember(owner = "client!JYNIYSOU", name = "f", descriptor = "I")
    public int field840;

    @OriginalMember(owner = "client!JYNIYSOU", name = "g", descriptor = "I")
    public int field841;

    @OriginalMember(owner = "client!JYNIYSOU", name = "j", descriptor = "I")
    public int field844;

    @OriginalMember(owner = "client!JYNIYSOU", name = "d", descriptor = "Ljava/lang/String;")
    public String field838;

    @OriginalMember(owner = "client!JYNIYSOU", name = "a", descriptor = "Z")
    private static boolean field835;

    @OriginalMember(owner = "client!JYNIYSOU", name = "c", descriptor = "[LJYNIYSOU;")
    public static class23[] field837;

    @OriginalMember(owner = "client!JYNIYSOU", name = "a", descriptor = "(LRSPRYUFS;I)V")
    public static void method239(class49 arg0, int arg1) {
        class36 var2 = new class36(-587, arg0.method427("varbit.dat", null));
        field836 = var2.method341();
        if (field837 == null) {
            field837 = new class23[field836];
        }
        for (int var3 = 0; var3 < field836; var3++) {
            if (field837[var3] == null) {
                field837[var3] = new class23();
            }
            field837[var3].method240(var2, 29883, var3);
            if (field837[var3].field842) {
                class17.field713[field837[var3].field839].field725 = true;
            }
        }
        if (arg1 >= 0) {
            field835 = !field835;
        }
        if (var2.field1071.length != var2.field1072) {
            System.out.println("varbit load mismatch");
        }
    }

    @OriginalMember(owner = "client!JYNIYSOU", name = "a", descriptor = "(LNQUAUMDT;II)V")
    public void method240(class36 arg0, int arg1, int arg2) {
        if (arg1 != 29883) {
            return;
        }
        while (true) {
            int var4 = arg0.method339();
            if (var4 == 0) {
                return;
            }
            if (var4 == 1) {
                this.field839 = arg0.method341();
                this.field840 = arg0.method339();
                this.field841 = arg0.method339();
            } else if (var4 == 10) {
                this.field838 = arg0.method346();
            } else if (var4 == 2) {
                this.field842 = true;
            } else if (var4 == 3) {
                this.field843 = arg0.method344();
            } else if (var4 == 4) {
                this.field844 = arg0.method344();
            } else if (var4 == 5) {
                this.field845 = false;
            } else {
                System.out.println("Error unrecognised config code: " + var4);
            }
        }
    }
}
