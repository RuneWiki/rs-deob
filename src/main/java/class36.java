import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("NRLTHETF")
public class class36 {

    @OriginalMember(owner = "NRLTHETF", name = "a", descriptor = "Z")
    private boolean field1094 = false;

    @OriginalMember(owner = "NRLTHETF", name = "b", descriptor = "Z")
    private boolean field1095 = false;

    @OriginalMember(owner = "NRLTHETF", name = "d", descriptor = "Z")
    private boolean field1097 = false;

    @OriginalMember(owner = "NRLTHETF", name = "g", descriptor = "I")
    public int field1100 = -1;

    @OriginalMember(owner = "NRLTHETF", name = "i", descriptor = "[I")
    public int[] field1102 = new int[6];

    @OriginalMember(owner = "NRLTHETF", name = "j", descriptor = "[I")
    public int[] field1103 = new int[6];

    @OriginalMember(owner = "NRLTHETF", name = "k", descriptor = "[I")
    public int[] field1104 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "NRLTHETF", name = "l", descriptor = "Z")
    public boolean field1105 = false;

    @OriginalMember(owner = "NRLTHETF", name = "c", descriptor = "I")
    private static int field1096 = -77;

    @OriginalMember(owner = "NRLTHETF", name = "e", descriptor = "I")
    public static int field1098;

    @OriginalMember(owner = "NRLTHETF", name = "h", descriptor = "[I")
    public int[] field1101;

    @OriginalMember(owner = "NRLTHETF", name = "f", descriptor = "[LNRLTHETF;")
    public static class36[] field1099;

    @OriginalMember(owner = "NRLTHETF", name = "a", descriptor = "(ILRVLWVPJQ;)V")
    public static void method333(int arg0, class50 arg1) {
        class55 var2 = new class55(741, arg1.method424("idk.dat", null));
        field1098 = var2.method457();
        if (arg0 != 0) {
            field1096 = 491;
        }
        if (field1099 == null) {
            field1099 = new class36[field1098];
        }
        for (int var3 = 0; var3 < field1098; var3++) {
            if (field1099[var3] == null) {
                field1099[var3] = new class36();
            }
            field1099[var3].method334(-7321, var2);
        }
    }

    @OriginalMember(owner = "NRLTHETF", name = "a", descriptor = "(ILUAWAYCTK;)V")
    public void method334(int arg0, class55 arg1) {
        if (arg0 != -7321) {
            this.field1094 = !this.field1094;
        }
        while (true) {
            while (true) {
                int var3 = arg1.method455();
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    this.field1100 = arg1.method455();
                } else if (var3 == 2) {
                    int var4 = arg1.method455();
                    this.field1101 = new int[var4];
                    for (int var5 = 0; var5 < var4; var5++) {
                        this.field1101[var5] = arg1.method457();
                    }
                } else if (var3 == 3) {
                    this.field1105 = true;
                } else if (var3 >= 40 && var3 < 50) {
                    this.field1102[var3 - 40] = arg1.method457();
                } else if (var3 >= 50 && var3 < 60) {
                    this.field1103[var3 - 50] = arg1.method457();
                } else if (var3 >= 60 && var3 < 70) {
                    this.field1104[var3 - 60] = arg1.method457();
                } else {
                    System.out.println("Error unrecognised config code: " + var3);
                }
            }
        }
    }

    @OriginalMember(owner = "NRLTHETF", name = "a", descriptor = "(I)Z")
    public boolean method335(int arg0) {
        if (arg0 < 4 || arg0 > 4) {
            throw new NullPointerException();
        } else if (this.field1101 == null) {
            return true;
        } else {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field1101.length; var3++) {
                if (!class66.method526(this.field1101[var3])) {
                    var2 = false;
                }
            }
            return var2;
        }
    }

    @OriginalMember(owner = "NRLTHETF", name = "a", descriptor = "(B)LWEVRTBOZ;")
    public class66 method336(byte arg0) {
        if (arg0 == 4) {
            boolean var2 = false;
        } else {
            this.field1097 = !this.field1097;
        }
        if (this.field1101 == null) {
            return null;
        }
        class66[] var3 = new class66[this.field1101.length];
        for (int var4 = 0; var4 < this.field1101.length; var4++) {
            var3[var4] = class66.method525(892, this.field1101[var4]);
        }
        class66 var5;
        if (var3.length == 1) {
            var5 = var3[0];
        } else {
            var5 = new class66(true, var3.length, var3);
        }
        for (int var6 = 0; var6 < 6 && this.field1102[var6] != 0; var6++) {
            var5.method539(this.field1102[var6], this.field1103[var6]);
        }
        return var5;
    }

    @OriginalMember(owner = "NRLTHETF", name = "a", descriptor = "(Z)Z")
    public boolean method337(boolean arg0) {
        boolean var2 = true;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field1104[var3] != -1 && !class66.method526(this.field1104[var3])) {
                var2 = false;
            }
        }
        if (arg0) {
            this.field1094 = !this.field1094;
        }
        return var2;
    }

    @OriginalMember(owner = "NRLTHETF", name = "b", descriptor = "(I)LWEVRTBOZ;")
    public class66 method338(int arg0) {
        class66[] var2 = new class66[5];
        int var3 = 0;
        if (arg0 != 2) {
            throw new NullPointerException();
        }
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field1104[var4] != -1) {
                var2[var3++] = class66.method525(892, this.field1104[var4]);
            }
        }
        class66 var5 = new class66(true, var3, var2);
        for (int var6 = 0; var6 < 6 && this.field1102[var6] != 0; var6++) {
            var5.method539(this.field1102[var6], this.field1103[var6]);
        }
        return var5;
    }

    @OriginalMember(owner = "NRLTHETF", name = "<init>", descriptor = "()V")
    public class36() {
        if (class40.field1193) {
        }
    }
}
