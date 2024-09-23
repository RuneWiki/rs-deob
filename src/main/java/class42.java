import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("OXBPHQKK")
public class class42 {

    @OriginalMember(owner = "OXBPHQKK", name = "a", descriptor = "Z")
    private boolean field1312 = false;

    @OriginalMember(owner = "OXBPHQKK", name = "h", descriptor = "I")
    public int field1319 = -1;

    @OriginalMember(owner = "OXBPHQKK", name = "j", descriptor = "Z")
    public boolean field1321 = false;

    @OriginalMember(owner = "OXBPHQKK", name = "k", descriptor = "I")
    public int field1322 = 5;

    @OriginalMember(owner = "OXBPHQKK", name = "l", descriptor = "I")
    public int field1323 = -1;

    @OriginalMember(owner = "OXBPHQKK", name = "m", descriptor = "I")
    public int field1324 = -1;

    @OriginalMember(owner = "OXBPHQKK", name = "n", descriptor = "I")
    public int field1325 = 99;

    @OriginalMember(owner = "OXBPHQKK", name = "o", descriptor = "I")
    public int field1326 = -1;

    @OriginalMember(owner = "OXBPHQKK", name = "p", descriptor = "I")
    public int field1327 = -1;

    @OriginalMember(owner = "OXBPHQKK", name = "b", descriptor = "I")
    public static int field1313;

    @OriginalMember(owner = "OXBPHQKK", name = "d", descriptor = "I")
    public int field1315;

    @OriginalMember(owner = "OXBPHQKK", name = "q", descriptor = "I")
    public int field1328;

    @OriginalMember(owner = "OXBPHQKK", name = "r", descriptor = "I")
    public int field1329;

    @OriginalMember(owner = "OXBPHQKK", name = "s", descriptor = "Z")
    public static boolean field1330;

    @OriginalMember(owner = "OXBPHQKK", name = "e", descriptor = "[I")
    public int[] field1316;

    @OriginalMember(owner = "OXBPHQKK", name = "f", descriptor = "[I")
    public int[] field1317;

    @OriginalMember(owner = "OXBPHQKK", name = "g", descriptor = "[I")
    private int[] field1318;

    @OriginalMember(owner = "OXBPHQKK", name = "i", descriptor = "[I")
    public int[] field1320;

    @OriginalMember(owner = "OXBPHQKK", name = "c", descriptor = "[LOXBPHQKK;")
    public static class42[] field1314;

    @OriginalMember(owner = "OXBPHQKK", name = "a", descriptor = "(LMNPBQFWE;B)V")
    public static void method456(class37 arg0, byte arg1) {
        class3 var2 = new class3(false, arg0.method429("seq.dat", null));
        field1313 = var2.method17();
        if (field1314 == null) {
            field1314 = new class42[field1313];
        }
        for (int var3 = 0; var3 < field1313; var3++) {
            if (field1314[var3] == null) {
                field1314[var3] = new class42();
            }
            field1314[var3].method458(674, var2);
        }
        if (arg1 == 0) {
            ;
        }
    }

    @OriginalMember(owner = "OXBPHQKK", name = "a", descriptor = "(IZ)I")
    public int method457(int arg0, boolean arg1) {
        if (arg1) {
            this.field1312 = !this.field1312;
        }
        int var3 = this.field1318[arg0];
        if (var3 == 0) {
            class59 var4 = class59.method523(1, this.field1316[arg0]);
            if (var4 != null) {
                var3 = this.field1318[arg0] = var4.field1601;
            }
        }
        if (var3 == 0) {
            var3 = 1;
        }
        return var3;
    }

    @OriginalMember(owner = "OXBPHQKK", name = "a", descriptor = "(ILBJPWOXRJ;)V")
    public void method458(int arg0, class3 arg1) {
        if (arg0 <= 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        while (true) {
            while (true) {
                int var4 = arg1.method15();
                if (var4 == 0) {
                    if (this.field1315 == 0) {
                        this.field1315 = 1;
                        this.field1316 = new int[1];
                        this.field1316[0] = -1;
                        this.field1317 = new int[1];
                        this.field1317[0] = -1;
                        this.field1318 = new int[1];
                        this.field1318[0] = -1;
                    }
                    if (this.field1326 == -1) {
                        if (this.field1320 == null) {
                            this.field1326 = 0;
                        } else {
                            this.field1326 = 2;
                        }
                    }
                    if (this.field1327 == -1) {
                        if (this.field1320 != null) {
                            this.field1327 = 2;
                            return;
                        }
                        this.field1327 = 0;
                        return;
                    }
                    return;
                }
                if (var4 == 1) {
                    this.field1315 = arg1.method15();
                    this.field1316 = new int[this.field1315];
                    this.field1317 = new int[this.field1315];
                    this.field1318 = new int[this.field1315];
                    for (int var5 = 0; var5 < this.field1315; var5++) {
                        this.field1316[var5] = arg1.method17();
                        this.field1317[var5] = arg1.method17();
                        if (this.field1317[var5] == 65535) {
                            this.field1317[var5] = -1;
                        }
                        this.field1318[var5] = arg1.method17();
                    }
                } else if (var4 == 2) {
                    this.field1319 = arg1.method17();
                } else if (var4 == 3) {
                    int var6 = arg1.method15();
                    this.field1320 = new int[var6 + 1];
                    for (int var7 = 0; var7 < var6; var7++) {
                        this.field1320[var7] = arg1.method15();
                    }
                    this.field1320[var6] = 9999999;
                } else if (var4 == 4) {
                    this.field1321 = true;
                } else if (var4 == 5) {
                    this.field1322 = arg1.method15();
                } else if (var4 == 6) {
                    this.field1323 = arg1.method17();
                } else if (var4 == 7) {
                    this.field1324 = arg1.method17();
                } else if (var4 == 8) {
                    this.field1325 = arg1.method15();
                } else if (var4 == 9) {
                    this.field1326 = arg1.method15();
                } else if (var4 == 10) {
                    this.field1327 = arg1.method15();
                } else if (var4 == 11) {
                    this.field1328 = arg1.method15();
                } else if (var4 == 12) {
                    this.field1329 = arg1.method20();
                } else {
                    System.out.println("Error unrecognised seq config code: " + var4);
                }
            }
        }
    }
}
