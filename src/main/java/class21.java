import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("FIQZIGZB")
public class class21 {

    @OriginalMember(owner = "FIQZIGZB", name = "b", descriptor = "Z")
    private boolean field839 = false;

    @OriginalMember(owner = "FIQZIGZB", name = "c", descriptor = "I")
    private int field840 = 411;

    @OriginalMember(owner = "FIQZIGZB", name = "d", descriptor = "I")
    private int field841 = -427;

    @OriginalMember(owner = "FIQZIGZB", name = "g", descriptor = "I")
    public int field844 = -1;

    @OriginalMember(owner = "FIQZIGZB", name = "i", descriptor = "[I")
    public int[] field846 = new int[6];

    @OriginalMember(owner = "FIQZIGZB", name = "j", descriptor = "[I")
    public int[] field847 = new int[6];

    @OriginalMember(owner = "FIQZIGZB", name = "k", descriptor = "[I")
    public int[] field848 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "FIQZIGZB", name = "l", descriptor = "Z")
    public boolean field849 = false;

    @OriginalMember(owner = "FIQZIGZB", name = "a", descriptor = "Z")
    private static boolean field838 = true;

    @OriginalMember(owner = "FIQZIGZB", name = "e", descriptor = "I")
    public static int field842;

    @OriginalMember(owner = "FIQZIGZB", name = "h", descriptor = "[I")
    public int[] field845;

    @OriginalMember(owner = "FIQZIGZB", name = "f", descriptor = "[LFIQZIGZB;")
    public static class21[] field843;

    @OriginalMember(owner = "FIQZIGZB", name = "a", descriptor = "(LDYBMLHQM;Z)V")
    public static void method257(class16 arg0, boolean arg1) {
        class29 var2 = new class29((byte) -28, arg0.method248("idk.dat", null));
        field842 = var2.method310();
        if (arg1) {
            field838 = !field838;
        }
        if (field843 == null) {
            field843 = new class21[field842];
        }
        for (int var3 = 0; var3 < field842; var3++) {
            if (field843[var3] == null) {
                field843[var3] = new class21();
            }
            field843[var3].method258(6, var2);
        }
    }

    @OriginalMember(owner = "FIQZIGZB", name = "a", descriptor = "(ILINLHDAGO;)V")
    public void method258(int arg0, class29 arg1) {
        if (arg0 < 6 || arg0 > 6) {
            throw new NullPointerException();
        }
        while (true) {
            while (true) {
                int var3 = arg1.method308();
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    this.field844 = arg1.method308();
                } else if (var3 == 2) {
                    int var4 = arg1.method308();
                    this.field845 = new int[var4];
                    for (int var5 = 0; var5 < var4; var5++) {
                        this.field845[var5] = arg1.method310();
                    }
                } else if (var3 == 3) {
                    this.field849 = true;
                } else if (var3 >= 40 && var3 < 50) {
                    this.field846[var3 - 40] = arg1.method310();
                } else if (var3 >= 50 && var3 < 60) {
                    this.field847[var3 - 50] = arg1.method310();
                } else if (var3 >= 60 && var3 < 70) {
                    this.field848[var3 - 60] = arg1.method310();
                } else {
                    System.out.println("Error unrecognised config code: " + var3);
                }
            }
        }
    }

    @OriginalMember(owner = "FIQZIGZB", name = "a", descriptor = "(B)Z")
    public boolean method259(byte arg0) {
        if (this.field845 == null) {
            return true;
        }
        boolean var2 = true;
        if (arg0 == 1) {
            boolean var3 = false;
        } else {
            this.field841 = 377;
        }
        for (int var4 = 0; var4 < this.field845.length; var4++) {
            if (!class10.method192(this.field845[var4])) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "FIQZIGZB", name = "a", descriptor = "(I)LDHUPIIUL;")
    public class10 method260(int arg0) {
        if (this.field845 == null) {
            return null;
        }
        class10[] var2 = new class10[this.field845.length];
        if (arg0 != 7) {
            throw new NullPointerException();
        }
        for (int var3 = 0; var3 < this.field845.length; var3++) {
            var2[var3] = class10.method191(this.field840, this.field845[var3]);
        }
        class10 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class10(17776, var2, var2.length);
        }
        for (int var5 = 0; var5 < 6 && this.field846[var5] != 0; var5++) {
            var4.method205(this.field846[var5], this.field847[var5]);
        }
        return var4;
    }

    @OriginalMember(owner = "FIQZIGZB", name = "a", descriptor = "(Z)Z")
    public boolean method261(boolean arg0) {
        boolean var2 = true;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field848[var3] != -1 && !class10.method192(this.field848[var3])) {
                var2 = false;
            }
        }
        if (arg0) {
            this.field839 = !this.field839;
        }
        return var2;
    }

    @OriginalMember(owner = "FIQZIGZB", name = "b", descriptor = "(B)LDHUPIIUL;")
    public class10 method262(byte arg0) {
        class10[] var2 = new class10[5];
        int var3 = 0;
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field848[var4] != -1) {
                var2[var3++] = class10.method191(this.field840, this.field848[var4]);
            }
        }
        class10 var5 = new class10(17776, var2, var3);
        for (int var6 = 0; var6 < 6 && this.field846[var6] != 0; var6++) {
            var5.method205(this.field846[var6], this.field847[var6]);
        }
        if (arg0 != 3) {
            throw new NullPointerException();
        }
        return var5;
    }
}
