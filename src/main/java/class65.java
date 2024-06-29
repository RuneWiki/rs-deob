import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qu")
public class class65 {

    @OriginalMember(owner = "client!qu", name = "f", descriptor = "I")
    public int field845;

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "I")
    public int field840;

    @OriginalMember(owner = "client!qu", name = "h", descriptor = "I")
    public int field847;

    @OriginalMember(owner = "client!qu", name = "e", descriptor = "I")
    public int field844;

    @OriginalMember(owner = "client!qu", name = "g", descriptor = "[I")
    public static int[] field846 = new int[32];

    @OriginalMember(owner = "client!qu", name = "c", descriptor = "Lak;")
    public static class234 field842 = new class234("M", "M", "M", "M");

    @OriginalMember(owner = "client!qu", name = "i", descriptor = "Lob;")
    public static class521 field848 = new class521(1, -1);

    @OriginalMember(owner = "client!qu", name = "j", descriptor = "Lhn;")
    public static class509 field849 = new class509(90, 14);

    @OriginalMember(owner = "client!qu", name = "b", descriptor = "I")
    public static int field841;

    @OriginalMember(owner = "client!qu", name = "d", descriptor = "Z")
    public static boolean field843;

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(II)V")
    public static final void method558(int arg0, int arg1) {
        class265 var2 = null;
        for (int var3 = arg0; var3 < arg1; var3++) {
            class145 var4 = class289.field4358[var3];
            if (var4 != null) {
                for (int var5 = 0; var5 < class385.field5799; var5++) {
                    for (int var6 = 0; var6 < class497.field7147; var6++) {
                        var2 = var4.method408(var6, var5, var2);
                        if (var2 != null) {
                            int var7 = var6 << class163.field2415;
                            int var8 = var5 << class163.field2415;
                            for (int var9 = var3 - 1; var9 >= 0; var9--) {
                                class145 var10 = class289.field4358[var9];
                                if (var10 != null) {
                                    int var11 = var4.method411(var6, var5) - var10.method411(var6, var5);
                                    int var12 = var4.method411(var6 + 1, var5) - var10.method411(var6 + 1, var5);
                                    int var13 = var4.method411(var6 + 1, var5 + 1) - var10.method411(var6 + 1, var5 + 1);
                                    int var14 = var4.method411(var6, var5 + 1) - var10.method411(var6, var5 + 1);
                                    var10.method410(var2, var7, (var11 + var12 + var13 + var14) / 4, var8, 0, false);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(I)V")
    public static void method559(int arg0) {
        if (arg0 != 4) {
            method559(-62);
        }
        field842 = null;
        field846 = null;
        field848 = null;
        field849 = null;
    }

    @OriginalMember(owner = "client!qu", name = "<init>", descriptor = "(IIII)V")
    public class65(int arg0, int arg1, int arg2, int arg3) {
        this.field845 = arg2;
        this.field840 = arg0;
        this.field847 = arg1;
        this.field844 = arg3;
    }

    @OriginalMember(owner = "client!qu", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field841++;
        throw new IllegalStateException();
    }
}
