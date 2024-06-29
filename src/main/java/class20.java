import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!INYZAOQU")
public class class20 {

    @OriginalMember(owner = "client!INYZAOQU", name = "h", descriptor = "Z")
    public boolean field844 = false;

    @OriginalMember(owner = "client!INYZAOQU", name = "i", descriptor = "Z")
    public boolean field845 = true;

    @OriginalMember(owner = "client!INYZAOQU", name = "k", descriptor = "Z")
    public boolean field847 = false;

    @OriginalMember(owner = "client!INYZAOQU", name = "n", descriptor = "Z")
    public boolean field850 = false;

    @OriginalMember(owner = "client!INYZAOQU", name = "o", descriptor = "I")
    public int field851 = -1;

    @OriginalMember(owner = "client!INYZAOQU", name = "p", descriptor = "Z")
    public boolean field852 = true;

    @OriginalMember(owner = "client!INYZAOQU", name = "a", descriptor = "I")
    public static int field837;

    @OriginalMember(owner = "client!INYZAOQU", name = "c", descriptor = "I")
    public static int field839;

    @OriginalMember(owner = "client!INYZAOQU", name = "f", descriptor = "I")
    public int field842;

    @OriginalMember(owner = "client!INYZAOQU", name = "g", descriptor = "I")
    public int field843;

    @OriginalMember(owner = "client!INYZAOQU", name = "j", descriptor = "I")
    public int field846;

    @OriginalMember(owner = "client!INYZAOQU", name = "l", descriptor = "I")
    public int field848;

    @OriginalMember(owner = "client!INYZAOQU", name = "m", descriptor = "I")
    public int field849;

    @OriginalMember(owner = "client!INYZAOQU", name = "e", descriptor = "Ljava/lang/String;")
    public String field841;

    @OriginalMember(owner = "client!INYZAOQU", name = "d", descriptor = "[I")
    public static int[] field840;

    @OriginalMember(owner = "client!INYZAOQU", name = "b", descriptor = "[LINYZAOQU;")
    public static class20[] field838;

    @OriginalMember(owner = "client!INYZAOQU", name = "a", descriptor = "(ILMAARFNGV;)V")
    public static void method293(int arg0, class29 arg1) {
        class14 var2 = new class14(arg1.method332("varp.dat", null), true);
        field839 = 0;
        if (arg0 != 0) {
            return;
        }
        field837 = var2.method219();
        if (field838 == null) {
            field838 = new class20[field837];
        }
        if (field840 == null) {
            field840 = new int[field837];
        }
        for (int var3 = 0; var3 < field837; var3++) {
            if (field838[var3] == null) {
                field838[var3] = new class20();
            }
            field838[var3].method294(false, var2, var3);
        }
        if (var2.field706.length != var2.field707) {
            System.out.println("varptype load mismatch");
        }
    }

    @OriginalMember(owner = "client!INYZAOQU", name = "a", descriptor = "(ZLEMWAMCXW;I)V")
    public void method294(boolean arg0, class14 arg1, int arg2) {
        if (arg0) {
            return;
        }
        while (true) {
            int var4 = arg1.method217();
            if (var4 == 0) {
                return;
            }
            if (var4 == 1) {
                this.field842 = arg1.method217();
            } else if (var4 == 2) {
                this.field843 = arg1.method217();
            } else if (var4 == 3) {
                this.field844 = true;
                field840[field839++] = arg2;
            } else if (var4 == 4) {
                this.field845 = false;
            } else if (var4 == 5) {
                this.field846 = arg1.method219();
            } else if (var4 == 6) {
                this.field847 = true;
            } else if (var4 == 7) {
                this.field848 = arg1.method222();
            } else if (var4 == 8) {
                this.field849 = 1;
                this.field850 = true;
            } else if (var4 == 10) {
                this.field841 = arg1.method224();
            } else if (var4 == 11) {
                this.field850 = true;
            } else if (var4 == 12) {
                this.field851 = arg1.method222();
            } else if (var4 == 13) {
                this.field849 = 2;
                this.field850 = true;
            } else if (var4 == 14) {
                this.field852 = false;
            } else {
                System.out.println("Error unrecognised config code: " + var4);
            }
        }
    }
}
