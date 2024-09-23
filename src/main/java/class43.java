import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("NRGHMRLX")
public class class43 {

    @OriginalMember(owner = "NRGHMRLX", name = "a", descriptor = "I")
    private int field1175 = 558;

    @OriginalMember(owner = "NRGHMRLX", name = "d", descriptor = "I")
    public int field1178 = -1;

    @OriginalMember(owner = "NRGHMRLX", name = "f", descriptor = "[I")
    public int[] field1180 = new int[6];

    @OriginalMember(owner = "NRGHMRLX", name = "g", descriptor = "[I")
    public int[] field1181 = new int[6];

    @OriginalMember(owner = "NRGHMRLX", name = "h", descriptor = "[I")
    public int[] field1182 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "NRGHMRLX", name = "i", descriptor = "Z")
    public boolean field1183 = false;

    @OriginalMember(owner = "NRGHMRLX", name = "b", descriptor = "I")
    public static int field1176;

    @OriginalMember(owner = "NRGHMRLX", name = "e", descriptor = "[I")
    public int[] field1179;

    @OriginalMember(owner = "NRGHMRLX", name = "c", descriptor = "[LNRGHMRLX;")
    public static class43[] field1177;

    @OriginalMember(owner = "NRGHMRLX", name = "a", descriptor = "(ILCVNWKEAW;)V")
    public static void method417(int arg0, class7 arg1) {
        if (arg0 != 0) {
            return;
        }
        class62 var2 = new class62(-417, arg1.method180("idk.dat", null));
        field1176 = var2.method523();
        if (field1177 == null) {
            field1177 = new class43[field1176];
        }
        for (int var3 = 0; var3 < field1176; var3++) {
            if (field1177[var3] == null) {
                field1177[var3] = new class43();
            }
            field1177[var3].method418((byte) 5, var2);
        }
    }

    @OriginalMember(owner = "NRGHMRLX", name = "a", descriptor = "(BLXOUQUKZW;)V")
    public void method418(byte arg0, class62 arg1) {
        if (arg0 != 5) {
            throw new NullPointerException();
        }
        while (true) {
            while (true) {
                int var3 = arg1.method521();
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    this.field1178 = arg1.method521();
                } else if (var3 == 2) {
                    int var4 = arg1.method521();
                    this.field1179 = new int[var4];
                    for (int var5 = 0; var5 < var4; var5++) {
                        this.field1179[var5] = arg1.method523();
                    }
                } else if (var3 == 3) {
                    this.field1183 = true;
                } else if (var3 >= 40 && var3 < 50) {
                    this.field1180[var3 - 40] = arg1.method523();
                } else if (var3 >= 50 && var3 < 60) {
                    this.field1181[var3 - 50] = arg1.method523();
                } else if (var3 >= 60 && var3 < 70) {
                    this.field1182[var3 - 60] = arg1.method523();
                } else {
                    System.out.println("Error unrecognised config code: " + var3);
                }
            }
        }
    }

    @OriginalMember(owner = "NRGHMRLX", name = "a", descriptor = "(I)Z")
    public boolean method419(int arg0) {
        if (this.field1179 == null) {
            return true;
        }
        boolean var2 = true;
        if (arg0 != 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        for (int var4 = 0; var4 < this.field1179.length; var4++) {
            if (!class35.method380(this.field1179[var4])) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "NRGHMRLX", name = "b", descriptor = "(I)LKPUOCBCE;")
    public class35 method420(int arg0) {
        if (this.field1179 == null) {
            return null;
        }
        class35[] var2 = new class35[this.field1179.length];
        for (int var3 = 0; var3 < this.field1179.length; var3++) {
            var2[var3] = class35.method379(this.field1179[var3], 0);
        }
        class35 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class35(false, var2.length, var2);
        }
        for (int var5 = 0; var5 < 6 && this.field1180[var5] != 0; var5++) {
            var4.method393(this.field1180[var5], this.field1181[var5]);
        }
        if (arg0 != 3246) {
            throw new NullPointerException();
        }
        return var4;
    }

    @OriginalMember(owner = "NRGHMRLX", name = "a", descriptor = "(B)Z")
    public boolean method421(byte arg0) {
        boolean var2 = true;
        if (arg0 != 4) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field1182[var4] != -1 && !class35.method380(this.field1182[var4])) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "NRGHMRLX", name = "c", descriptor = "(I)LKPUOCBCE;")
    public class35 method422(int arg0) {
        class35[] var2 = new class35[5];
        int var3 = 0;
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field1182[var4] != -1) {
                var2[var3++] = class35.method379(this.field1182[var4], 0);
            }
        }
        if (arg0 != 10940) {
            this.field1175 = -479;
        }
        class35 var5 = new class35(false, var3, var2);
        for (int var6 = 0; var6 < 6 && this.field1180[var6] != 0; var6++) {
            var5.method393(this.field1180[var6], this.field1181[var6]);
        }
        return var5;
    }

    @OriginalMember(owner = "NRGHMRLX", name = "<init>", descriptor = "()V")
    public class43() {
        if (class54.field1472) {
        }
    }
}
