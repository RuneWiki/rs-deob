import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!FDNUHSLC")
public class class20 {

    @OriginalMember(owner = "client!FDNUHSLC", name = "a", descriptor = "Z")
    private boolean field834 = false;

    @OriginalMember(owner = "client!FDNUHSLC", name = "b", descriptor = "B")
    private byte field835 = -26;

    @OriginalMember(owner = "client!FDNUHSLC", name = "d", descriptor = "I")
    private int field837 = 616;

    @OriginalMember(owner = "client!FDNUHSLC", name = "g", descriptor = "I")
    public int field840 = -1;

    @OriginalMember(owner = "client!FDNUHSLC", name = "i", descriptor = "[I")
    public int[] field842 = new int[6];

    @OriginalMember(owner = "client!FDNUHSLC", name = "j", descriptor = "[I")
    public int[] field843 = new int[6];

    @OriginalMember(owner = "client!FDNUHSLC", name = "k", descriptor = "[I")
    public int[] field844 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!FDNUHSLC", name = "l", descriptor = "Z")
    public boolean field845 = false;

    @OriginalMember(owner = "client!FDNUHSLC", name = "c", descriptor = "I")
    private int field836;

    @OriginalMember(owner = "client!FDNUHSLC", name = "e", descriptor = "I")
    public static int field838;

    @OriginalMember(owner = "client!FDNUHSLC", name = "h", descriptor = "[I")
    public int[] field841;

    @OriginalMember(owner = "client!FDNUHSLC", name = "f", descriptor = "[LFDNUHSLC;")
    public static class20[] field839;

    @OriginalMember(owner = "client!FDNUHSLC", name = "a", descriptor = "(LLKPVZAQN;I)V")
    public static void method225(class33 arg0, int arg1) {
        int var2 = 73 / arg1;
        class58 var3 = new class58((byte) -115, arg0.method323("idk.dat", null));
        field838 = var3.method517();
        if (field839 == null) {
            field839 = new class20[field838];
        }
        for (int var4 = 0; var4 < field838; var4++) {
            if (field839[var4] == null) {
                field839[var4] = new class20();
            }
            field839[var4].method226(var3, 767);
        }
    }

    @OriginalMember(owner = "client!FDNUHSLC", name = "a", descriptor = "(LWBEWPIXO;I)V")
    public void method226(class58 arg0, int arg1) {
        int var3 = 34 / arg1;
        while (true) {
            while (true) {
                int var4 = arg0.method515();
                if (var4 == 0) {
                    return;
                }
                if (var4 == 1) {
                    this.field840 = arg0.method515();
                } else if (var4 == 2) {
                    int var5 = arg0.method515();
                    this.field841 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field841[var6] = arg0.method517();
                    }
                } else if (var4 == 3) {
                    this.field845 = true;
                } else if (var4 >= 40 && var4 < 50) {
                    this.field842[var4 - 40] = arg0.method517();
                } else if (var4 >= 50 && var4 < 60) {
                    this.field843[var4 - 50] = arg0.method517();
                } else if (var4 >= 60 && var4 < 70) {
                    this.field844[var4 - 60] = arg0.method517();
                } else {
                    System.out.println("Error unrecognised config code: " + var4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!FDNUHSLC", name = "a", descriptor = "(I)Z")
    public boolean method227(int arg0) {
        if (arg0 != 3982) {
            this.field837 = -111;
        }
        if (this.field841 == null) {
            return true;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < this.field841.length; var3++) {
            if (!class19.method200(this.field841[var3])) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!FDNUHSLC", name = "a", descriptor = "(B)LFCIDIKVY;")
    public class19 method228(byte arg0) {
        if (this.field835 != arg0) {
            this.field834 = !this.field834;
        }
        if (this.field841 == null) {
            return null;
        }
        class19[] var2 = new class19[this.field841.length];
        for (int var3 = 0; var3 < this.field841.length; var3++) {
            var2[var3] = class19.method199(this.field841[var3]);
        }
        class19 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class19(var2.length, -23, var2);
        }
        for (int var5 = 0; var5 < 6 && this.field842[var5] != 0; var5++) {
            var4.method213(this.field842[var5], this.field843[var5]);
        }
        return var4;
    }

    @OriginalMember(owner = "client!FDNUHSLC", name = "b", descriptor = "(I)Z")
    public boolean method229(int arg0) {
        boolean var2 = true;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field844[var3] != -1 && !class19.method200(this.field844[var3])) {
                var2 = false;
            }
        }
        if (arg0 >= 0) {
            this.field834 = !this.field834;
        }
        return var2;
    }

    @OriginalMember(owner = "client!FDNUHSLC", name = "c", descriptor = "(I)LFCIDIKVY;")
    public class19 method230(int arg0) {
        class19[] var2 = new class19[5];
        int var3 = 0;
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field844[var4] != -1) {
                var2[var3++] = class19.method199(this.field844[var4]);
            }
        }
        class19 var5 = new class19(var3, -23, var2);
        for (int var6 = 0; var6 < 6 && this.field842[var6] != 0; var6++) {
            var5.method213(this.field842[var6], this.field843[var6]);
        }
        if (arg0 != 3) {
            this.field836 = -98;
        }
        return var5;
    }
}
