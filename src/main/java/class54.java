import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("TFKCMRVE")
public class class54 {

    @OriginalMember(owner = "TFKCMRVE", name = "b", descriptor = "Z")
    private boolean field1354 = true;

    @OriginalMember(owner = "TFKCMRVE", name = "c", descriptor = "Z")
    private boolean field1355 = true;

    @OriginalMember(owner = "TFKCMRVE", name = "f", descriptor = "I")
    public int field1358 = -1;

    @OriginalMember(owner = "TFKCMRVE", name = "h", descriptor = "[I")
    public int[] field1360 = new int[6];

    @OriginalMember(owner = "TFKCMRVE", name = "i", descriptor = "[I")
    public int[] field1361 = new int[6];

    @OriginalMember(owner = "TFKCMRVE", name = "j", descriptor = "[I")
    public int[] field1362 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "TFKCMRVE", name = "k", descriptor = "Z")
    public boolean field1363 = false;

    @OriginalMember(owner = "TFKCMRVE", name = "d", descriptor = "I")
    public static int field1356;

    @OriginalMember(owner = "TFKCMRVE", name = "a", descriptor = "Z")
    private static boolean field1353;

    @OriginalMember(owner = "TFKCMRVE", name = "g", descriptor = "[I")
    public int[] field1359;

    @OriginalMember(owner = "TFKCMRVE", name = "e", descriptor = "[LTFKCMRVE;")
    public static class54[] field1357;

    @OriginalMember(owner = "TFKCMRVE", name = "a", descriptor = "(ILBBMKAXRK;)V")
    public static void method453(int arg0, class6 arg1) {
        class17 var2 = new class17(arg1.method30("idk.dat", null), -26583);
        if (arg0 >= 0) {
            field1353 = !field1353;
        }
        field1356 = var2.method226();
        if (field1357 == null) {
            field1357 = new class54[field1356];
        }
        for (int var3 = 0; var3 < field1356; var3++) {
            if (field1357[var3] == null) {
                field1357[var3] = new class54();
            }
            field1357[var3].method454(var2, (byte) -50);
        }
    }

    @OriginalMember(owner = "TFKCMRVE", name = "a", descriptor = "(LEILHLJCE;B)V")
    public void method454(class17 arg0, byte arg1) {
        if (arg1 != -50) {
            throw new NullPointerException();
        }
        while (true) {
            while (true) {
                int var3 = arg0.method224();
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    this.field1358 = arg0.method224();
                } else if (var3 == 2) {
                    int var4 = arg0.method224();
                    this.field1359 = new int[var4];
                    for (int var5 = 0; var5 < var4; var5++) {
                        this.field1359[var5] = arg0.method226();
                    }
                } else if (var3 == 3) {
                    this.field1363 = true;
                } else if (var3 >= 40 && var3 < 50) {
                    this.field1360[var3 - 40] = arg0.method226();
                } else if (var3 >= 50 && var3 < 60) {
                    this.field1361[var3 - 50] = arg0.method226();
                } else if (var3 >= 60 && var3 < 70) {
                    this.field1362[var3 - 60] = arg0.method226();
                } else {
                    System.out.println("Error unrecognised config code: " + var3);
                }
            }
        }
    }

    @OriginalMember(owner = "TFKCMRVE", name = "a", descriptor = "(Z)Z")
    public boolean method455(boolean arg0) {
        if (this.field1359 == null) {
            return true;
        }
        boolean var2 = true;
        if (arg0) {
            field1353 = !field1353;
        }
        for (int var3 = 0; var3 < this.field1359.length; var3++) {
            if (!class31.method340(this.field1359[var3])) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "TFKCMRVE", name = "a", descriptor = "(B)LKBEXSZSN;")
    public class31 method456(byte arg0) {
        if (this.field1359 == null) {
            return null;
        }
        class31[] var2 = new class31[this.field1359.length];
        if (arg0 != 9) {
            this.field1355 = !this.field1355;
        }
        for (int var3 = 0; var3 < this.field1359.length; var3++) {
            var2[var3] = class31.method339(this.field1359[var3]);
        }
        class31 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class31(var2.length, var2, 5);
        }
        for (int var5 = 0; var5 < 6 && this.field1360[var5] != 0; var5++) {
            var4.method353(this.field1360[var5], this.field1361[var5]);
        }
        return var4;
    }

    @OriginalMember(owner = "TFKCMRVE", name = "a", descriptor = "(I)Z")
    public boolean method457(int arg0) {
        boolean var2 = true;
        if (arg0 != 4732) {
            this.field1355 = !this.field1355;
        }
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field1362[var3] != -1 && !class31.method340(this.field1362[var3])) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "TFKCMRVE", name = "b", descriptor = "(I)LKBEXSZSN;")
    public class31 method458(int arg0) {
        class31[] var2 = new class31[5];
        int var3 = 0;
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field1362[var4] != -1) {
                var2[var3++] = class31.method339(this.field1362[var4]);
            }
        }
        class31 var5 = new class31(var3, var2, 5);
        for (int var6 = 0; var6 < 6 && this.field1360[var6] != 0; var6++) {
            var5.method353(this.field1360[var6], this.field1361[var6]);
        }
        while (arg0 >= 0) {
            this.field1354 = !this.field1354;
        }
        return var5;
    }

    @OriginalMember(owner = "TFKCMRVE", name = "<init>", descriptor = "()V")
    public class54() {
        if (class30.field987) {
        }
    }
}
