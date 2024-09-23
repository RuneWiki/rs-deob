import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("IEVJZYTE")
public class class23 {

    @OriginalMember(owner = "IEVJZYTE", name = "e", descriptor = "I")
    public int field905 = -1;

    @OriginalMember(owner = "IEVJZYTE", name = "g", descriptor = "[I")
    public int[] field907 = new int[6];

    @OriginalMember(owner = "IEVJZYTE", name = "h", descriptor = "[I")
    public int[] field908 = new int[6];

    @OriginalMember(owner = "IEVJZYTE", name = "i", descriptor = "[I")
    public int[] field909 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "IEVJZYTE", name = "j", descriptor = "Z")
    public boolean field910 = false;

    @OriginalMember(owner = "IEVJZYTE", name = "a", descriptor = "I")
    private static int field901 = 974;

    @OriginalMember(owner = "IEVJZYTE", name = "b", descriptor = "Z")
    private static boolean field902 = true;

    @OriginalMember(owner = "IEVJZYTE", name = "c", descriptor = "I")
    public static int field903;

    @OriginalMember(owner = "IEVJZYTE", name = "f", descriptor = "[I")
    public int[] field906;

    @OriginalMember(owner = "IEVJZYTE", name = "d", descriptor = "[LIEVJZYTE;")
    public static class23[] field904;

    @OriginalMember(owner = "IEVJZYTE", name = "a", descriptor = "(ILQDHHNYHL;)V")
    public static void method301(int arg0, class44 arg1) {
        class42 var2 = new class42(5, arg1.method488("idk.dat", null));
        field903 = var2.method422();
        if (field904 == null) {
            field904 = new class23[field903];
        }
        for (int var3 = 0; var3 < field903; var3++) {
            if (field904[var3] == null) {
                field904[var3] = new class23();
            }
            field904[var3].method302(var2, field901);
        }
        if (arg0 != 0) {
            field902 = !field902;
        }
    }

    @OriginalMember(owner = "IEVJZYTE", name = "a", descriptor = "(LPGNBHFUF;I)V")
    public void method302(class42 arg0, int arg1) {
        if (arg1 <= 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        while (true) {
            while (true) {
                int var4 = arg0.method420();
                if (var4 == 0) {
                    return;
                }
                if (var4 == 1) {
                    this.field905 = arg0.method420();
                } else if (var4 == 2) {
                    int var5 = arg0.method420();
                    this.field906 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field906[var6] = arg0.method422();
                    }
                } else if (var4 == 3) {
                    this.field910 = true;
                } else if (var4 >= 40 && var4 < 50) {
                    this.field907[var4 - 40] = arg0.method422();
                } else if (var4 >= 50 && var4 < 60) {
                    this.field908[var4 - 50] = arg0.method422();
                } else if (var4 >= 60 && var4 < 70) {
                    this.field909[var4 - 60] = arg0.method422();
                } else {
                    System.out.println("Error unrecognised config code: " + var4);
                }
            }
        }
    }

    @OriginalMember(owner = "IEVJZYTE", name = "a", descriptor = "(I)Z")
    public boolean method303(int arg0) {
        if (this.field906 == null) {
            return true;
        }
        boolean var2 = true;
        while (arg0 >= 0) {
            field902 = !field902;
        }
        for (int var3 = 0; var3 < this.field906.length; var3++) {
            if (!class43.method461(this.field906[var3])) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "IEVJZYTE", name = "a", descriptor = "(Z)LPOJFANDE;")
    public class43 method304(boolean arg0) {
        if (arg0) {
            throw new NullPointerException();
        } else if (this.field906 == null) {
            return null;
        } else {
            class43[] var2 = new class43[this.field906.length];
            for (int var3 = 0; var3 < this.field906.length; var3++) {
                var2[var3] = class43.method460(this.field906[var3]);
            }
            class43 var4;
            if (var2.length == 1) {
                var4 = var2[0];
            } else {
                var4 = new class43(var2.length, -347, var2);
            }
            for (int var5 = 0; var5 < 6 && this.field907[var5] != 0; var5++) {
                var4.method474(this.field907[var5], this.field908[var5]);
            }
            return var4;
        }
    }

    @OriginalMember(owner = "IEVJZYTE", name = "b", descriptor = "(I)Z")
    public boolean method305(int arg0) {
        boolean var2 = true;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field909[var3] != -1 && !class43.method461(this.field909[var3])) {
                var2 = false;
            }
        }
        if (arg0 != -44232) {
            field901 = -316;
        }
        return var2;
    }

    @OriginalMember(owner = "IEVJZYTE", name = "a", descriptor = "(B)LPOJFANDE;")
    public class43 method306(byte arg0) {
        class43[] var2 = new class43[5];
        int var3 = 0;
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field909[var4] != -1) {
                var2[var3++] = class43.method460(this.field909[var4]);
            }
        }
        class43 var5 = new class43(var3, -347, var2);
        if (arg0 != -100) {
            throw new NullPointerException();
        }
        for (int var6 = 0; var6 < 6 && this.field907[var6] != 0; var6++) {
            var5.method474(this.field907[var6], this.field908[var6]);
        }
        return var5;
    }

    @OriginalMember(owner = "IEVJZYTE", name = "<init>", descriptor = "()V")
    public class23() {
        if (class8.field617) {
        }
    }
}
