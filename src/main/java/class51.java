import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("PTMGRPAM")
public class class51 {

    @OriginalMember(owner = "PTMGRPAM", name = "a", descriptor = "I")
    private int field1307 = 22486;

    @OriginalMember(owner = "PTMGRPAM", name = "c", descriptor = "Z")
    private boolean field1309 = false;

    @OriginalMember(owner = "PTMGRPAM", name = "f", descriptor = "I")
    public int field1312 = -1;

    @OriginalMember(owner = "PTMGRPAM", name = "h", descriptor = "[I")
    public int[] field1314 = new int[6];

    @OriginalMember(owner = "PTMGRPAM", name = "i", descriptor = "[I")
    public int[] field1315 = new int[6];

    @OriginalMember(owner = "PTMGRPAM", name = "j", descriptor = "[I")
    public int[] field1316 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "PTMGRPAM", name = "k", descriptor = "Z")
    public boolean field1317 = false;

    @OriginalMember(owner = "PTMGRPAM", name = "b", descriptor = "I")
    private int field1308;

    @OriginalMember(owner = "PTMGRPAM", name = "d", descriptor = "I")
    public static int field1310;

    @OriginalMember(owner = "PTMGRPAM", name = "g", descriptor = "[I")
    public int[] field1313;

    @OriginalMember(owner = "PTMGRPAM", name = "e", descriptor = "[LPTMGRPAM;")
    public static class51[] field1311;

    @OriginalMember(owner = "PTMGRPAM", name = "a", descriptor = "(LVSUYIIVA;I)V")
    public static void method463(class62 arg0, int arg1) {
        class8 var2 = new class8(arg0.method570("idk.dat", null), 792);
        field1310 = var2.method32();
        int var3 = 84 / arg1;
        if (field1311 == null) {
            field1311 = new class51[field1310];
        }
        for (int var4 = 0; var4 < field1310; var4++) {
            if (field1311[var4] == null) {
                field1311[var4] = new class51();
            }
            field1311[var4].method464(var2, 22486);
        }
    }

    @OriginalMember(owner = "PTMGRPAM", name = "a", descriptor = "(LCFARFRSG;I)V")
    public void method464(class8 arg0, int arg1) {
        if (this.field1307 != arg1) {
            throw new NullPointerException();
        }
        while (true) {
            while (true) {
                int var3 = arg0.method30();
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    this.field1312 = arg0.method30();
                } else if (var3 == 2) {
                    int var4 = arg0.method30();
                    this.field1313 = new int[var4];
                    for (int var5 = 0; var5 < var4; var5++) {
                        this.field1313[var5] = arg0.method32();
                    }
                } else if (var3 == 3) {
                    this.field1317 = true;
                } else if (var3 >= 40 && var3 < 50) {
                    this.field1314[var3 - 40] = arg0.method32();
                } else if (var3 >= 50 && var3 < 60) {
                    this.field1315[var3 - 50] = arg0.method32();
                } else if (var3 >= 60 && var3 < 70) {
                    this.field1316[var3 - 60] = arg0.method32();
                } else {
                    System.out.println("Error unrecognised config code: " + var3);
                }
            }
        }
    }

    @OriginalMember(owner = "PTMGRPAM", name = "a", descriptor = "(I)Z")
    public boolean method465(int arg0) {
        int var2 = 52 / arg0;
        if (this.field1313 == null) {
            return true;
        }
        boolean var3 = true;
        for (int var4 = 0; var4 < this.field1313.length; var4++) {
            if (!class37.method342(this.field1313[var4])) {
                var3 = false;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "PTMGRPAM", name = "b", descriptor = "(I)LLFTMDGKK;")
    public class37 method466(int arg0) {
        if (arg0 != 18165) {
            this.field1309 = !this.field1309;
        }
        if (this.field1313 == null) {
            return null;
        }
        class37[] var2 = new class37[this.field1313.length];
        for (int var3 = 0; var3 < this.field1313.length; var3++) {
            var2[var3] = class37.method341(this.field1313[var3], this.field1308);
        }
        class37 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class37(var2.length, 698, var2);
        }
        for (int var5 = 0; var5 < 6 && this.field1314[var5] != 0; var5++) {
            var4.method355(this.field1314[var5], this.field1315[var5]);
        }
        return var4;
    }

    @OriginalMember(owner = "PTMGRPAM", name = "c", descriptor = "(I)Z")
    public boolean method467(int arg0) {
        boolean var2 = true;
        if (arg0 < 7 || arg0 > 7) {
            this.field1309 = !this.field1309;
        }
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field1316[var3] != -1 && !class37.method342(this.field1316[var3])) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "PTMGRPAM", name = "a", descriptor = "(B)LLFTMDGKK;")
    public class37 method468(byte arg0) {
        class37[] var2 = new class37[5];
        int var3 = 0;
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field1316[var4] != -1) {
                var2[var3++] = class37.method341(this.field1316[var4], this.field1308);
            }
        }
        class37 var5 = new class37(var3, 698, var2);
        for (int var6 = 0; var6 < 6 && this.field1314[var6] != 0; var6++) {
            var5.method355(this.field1314[var6], this.field1315[var6]);
        }
        if (arg0 != 113) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
        return var5;
    }
}
