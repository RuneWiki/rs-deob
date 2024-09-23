import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("RPRWOACX")
public class class46 {

    @OriginalMember(owner = "RPRWOACX", name = "d", descriptor = "I")
    public int field1340 = -1;

    @OriginalMember(owner = "RPRWOACX", name = "f", descriptor = "[I")
    public int[] field1342 = new int[6];

    @OriginalMember(owner = "RPRWOACX", name = "g", descriptor = "[I")
    public int[] field1343 = new int[6];

    @OriginalMember(owner = "RPRWOACX", name = "h", descriptor = "[I")
    public int[] field1344 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "RPRWOACX", name = "i", descriptor = "Z")
    public boolean field1345 = false;

    @OriginalMember(owner = "RPRWOACX", name = "a", descriptor = "I")
    private static int field1337 = -584;

    @OriginalMember(owner = "RPRWOACX", name = "b", descriptor = "I")
    public static int field1338;

    @OriginalMember(owner = "RPRWOACX", name = "e", descriptor = "[I")
    public int[] field1341;

    @OriginalMember(owner = "RPRWOACX", name = "c", descriptor = "[LRPRWOACX;")
    public static class46[] field1339;

    @OriginalMember(owner = "RPRWOACX", name = "a", descriptor = "(ILINOFEYKQ;)V")
    public static void method431(int arg0, class21 arg1) {
        class35 var2 = new class35((byte) -103, arg1.method277("idk.dat", null));
        while (arg0 >= 0) {
            field1337 = -136;
        }
        field1338 = var2.method351();
        if (field1339 == null) {
            field1339 = new class46[field1338];
        }
        for (int var3 = 0; var3 < field1338; var3++) {
            if (field1339[var3] == null) {
                field1339[var3] = new class46();
            }
            field1339[var3].method432(false, var2);
        }
    }

    @OriginalMember(owner = "RPRWOACX", name = "a", descriptor = "(ZLNHEPCMLW;)V")
    public void method432(boolean arg0, class35 arg1) {
        if (arg0) {
            throw new NullPointerException();
        }
        while (true) {
            while (true) {
                int var3 = arg1.method349();
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    this.field1340 = arg1.method349();
                } else if (var3 == 2) {
                    int var4 = arg1.method349();
                    this.field1341 = new int[var4];
                    for (int var5 = 0; var5 < var4; var5++) {
                        this.field1341[var5] = arg1.method351();
                    }
                } else if (var3 == 3) {
                    this.field1345 = true;
                } else if (var3 >= 40 && var3 < 50) {
                    this.field1342[var3 - 40] = arg1.method351();
                } else if (var3 >= 50 && var3 < 60) {
                    this.field1343[var3 - 50] = arg1.method351();
                } else if (var3 >= 60 && var3 < 70) {
                    this.field1344[var3 - 60] = arg1.method351();
                } else {
                    System.out.println("Error unrecognised config code: " + var3);
                }
            }
        }
    }

    @OriginalMember(owner = "RPRWOACX", name = "a", descriptor = "(I)Z")
    public boolean method433(int arg0) {
        if (this.field1341 == null) {
            return true;
        }
        boolean var2 = true;
        while (arg0 >= 0) {
            field1337 = 441;
        }
        for (int var3 = 0; var3 < this.field1341.length; var3++) {
            if (!class4.method161(this.field1341[var3])) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "RPRWOACX", name = "b", descriptor = "(I)LCSGBDGDY;")
    public class4 method434(int arg0) {
        if (this.field1341 == null) {
            return null;
        }
        class4[] var2 = new class4[this.field1341.length];
        int var3 = 62 / arg0;
        for (int var4 = 0; var4 < this.field1341.length; var4++) {
            var2[var4] = class4.method160(this.field1341[var4]);
        }
        class4 var5;
        if (var2.length == 1) {
            var5 = var2[0];
        } else {
            var5 = new class4(var2.length, -39808, var2);
        }
        for (int var6 = 0; var6 < 6 && this.field1342[var6] != 0; var6++) {
            var5.method174(this.field1342[var6], this.field1343[var6]);
        }
        return var5;
    }

    @OriginalMember(owner = "RPRWOACX", name = "c", descriptor = "(I)Z")
    public boolean method435(int arg0) {
        if (arg0 < 3 || arg0 > 3) {
            throw new NullPointerException();
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field1344[var3] != -1 && !class4.method161(this.field1344[var3])) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "RPRWOACX", name = "a", descriptor = "(Z)LCSGBDGDY;")
    public class4 method436(boolean arg0) {
        class4[] var2 = new class4[5];
        int var3 = 0;
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field1344[var4] != -1) {
                var2[var3++] = class4.method160(this.field1344[var4]);
            }
        }
        class4 var5 = new class4(var3, -39808, var2);
        if (arg0) {
            throw new NullPointerException();
        }
        for (int var6 = 0; var6 < 6 && this.field1342[var6] != 0; var6++) {
            var5.method174(this.field1342[var6], this.field1343[var6]);
        }
        return var5;
    }

    @OriginalMember(owner = "RPRWOACX", name = "<init>", descriptor = "()V")
    public class46() {
        if (class34.field1089) {
        }
    }
}
