import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("RIUJHZLL")
public class class47 {

    @OriginalMember(owner = "RIUJHZLL", name = "h", descriptor = "I")
    public int field1285 = -1;

    @OriginalMember(owner = "RIUJHZLL", name = "j", descriptor = "Z")
    public boolean field1287 = false;

    @OriginalMember(owner = "RIUJHZLL", name = "k", descriptor = "I")
    public int field1288 = 5;

    @OriginalMember(owner = "RIUJHZLL", name = "l", descriptor = "I")
    public int field1289 = -1;

    @OriginalMember(owner = "RIUJHZLL", name = "m", descriptor = "I")
    public int field1290 = -1;

    @OriginalMember(owner = "RIUJHZLL", name = "n", descriptor = "I")
    public int field1291 = 99;

    @OriginalMember(owner = "RIUJHZLL", name = "o", descriptor = "I")
    public int field1292 = -1;

    @OriginalMember(owner = "RIUJHZLL", name = "p", descriptor = "I")
    public int field1293 = -1;

    @OriginalMember(owner = "RIUJHZLL", name = "q", descriptor = "I")
    public int field1294 = 2;

    @OriginalMember(owner = "RIUJHZLL", name = "a", descriptor = "I")
    private int field1278;

    @OriginalMember(owner = "RIUJHZLL", name = "b", descriptor = "I")
    public static int field1279;

    @OriginalMember(owner = "RIUJHZLL", name = "d", descriptor = "I")
    public int field1281;

    @OriginalMember(owner = "RIUJHZLL", name = "r", descriptor = "I")
    public int field1295;

    @OriginalMember(owner = "RIUJHZLL", name = "s", descriptor = "I")
    public static int field1296;

    @OriginalMember(owner = "RIUJHZLL", name = "e", descriptor = "[I")
    public int[] field1282;

    @OriginalMember(owner = "RIUJHZLL", name = "f", descriptor = "[I")
    public int[] field1283;

    @OriginalMember(owner = "RIUJHZLL", name = "g", descriptor = "[I")
    private int[] field1284;

    @OriginalMember(owner = "RIUJHZLL", name = "i", descriptor = "[I")
    public int[] field1286;

    @OriginalMember(owner = "RIUJHZLL", name = "c", descriptor = "[LRIUJHZLL;")
    public static class47[] field1280;

    @OriginalMember(owner = "RIUJHZLL", name = "a", descriptor = "(ILRVLWVPJQ;)V")
    public static void method413(int arg0, class50 arg1) {
        class55 var2 = new class55(741, arg1.method424("seq.dat", null));
        field1279 = var2.method457();
        if (arg0 != 0) {
            return;
        }
        if (field1280 == null) {
            field1280 = new class47[field1279];
        }
        for (int var3 = 0; var3 < field1279; var3++) {
            if (field1280[var3] == null) {
                field1280[var3] = new class47();
            }
            field1280[var3].method415(-7321, var2);
        }
    }

    @OriginalMember(owner = "RIUJHZLL", name = "a", descriptor = "(II)I")
    public int method414(int arg0, int arg1) {
        if (arg1 != 3) {
            return 1;
        }
        int var3 = this.field1284[arg0];
        if (var3 == 0) {
            class15 var4 = class15.method217(892, this.field1282[arg0]);
            if (var4 != null) {
                var3 = this.field1284[arg0] = var4.field715;
            }
        }
        if (var3 == 0) {
            var3 = 1;
        }
        return var3;
    }

    @OriginalMember(owner = "RIUJHZLL", name = "a", descriptor = "(ILUAWAYCTK;)V")
    public void method415(int arg0, class55 arg1) {
        if (arg0 != -7321) {
            this.field1278 = 452;
        }
        while (true) {
            while (true) {
                int var3 = arg1.method455();
                if (var3 == 0) {
                    if (this.field1281 == 0) {
                        this.field1281 = 1;
                        this.field1282 = new int[1];
                        this.field1282[0] = -1;
                        this.field1283 = new int[1];
                        this.field1283[0] = -1;
                        this.field1284 = new int[1];
                        this.field1284[0] = -1;
                    }
                    if (this.field1292 == -1) {
                        if (this.field1286 == null) {
                            this.field1292 = 0;
                        } else {
                            this.field1292 = 2;
                        }
                    }
                    if (this.field1293 == -1) {
                        if (this.field1286 != null) {
                            this.field1293 = 2;
                            return;
                        }
                        this.field1293 = 0;
                        return;
                    }
                    return;
                }
                if (var3 == 1) {
                    this.field1281 = arg1.method455();
                    this.field1282 = new int[this.field1281];
                    this.field1283 = new int[this.field1281];
                    this.field1284 = new int[this.field1281];
                    for (int var4 = 0; var4 < this.field1281; var4++) {
                        this.field1282[var4] = arg1.method457();
                        this.field1283[var4] = arg1.method457();
                        if (this.field1283[var4] == 65535) {
                            this.field1283[var4] = -1;
                        }
                        this.field1284[var4] = arg1.method457();
                    }
                } else if (var3 == 2) {
                    this.field1285 = arg1.method457();
                } else if (var3 == 3) {
                    int var5 = arg1.method455();
                    this.field1286 = new int[var5 + 1];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field1286[var6] = arg1.method455();
                    }
                    this.field1286[var5] = 9999999;
                } else if (var3 == 4) {
                    this.field1287 = true;
                } else if (var3 == 5) {
                    this.field1288 = arg1.method455();
                } else if (var3 == 6) {
                    this.field1289 = arg1.method457();
                } else if (var3 == 7) {
                    this.field1290 = arg1.method457();
                } else if (var3 == 8) {
                    this.field1291 = arg1.method455();
                } else if (var3 == 9) {
                    this.field1292 = arg1.method455();
                } else if (var3 == 10) {
                    this.field1293 = arg1.method455();
                } else if (var3 == 11) {
                    this.field1294 = arg1.method455();
                } else if (var3 == 12) {
                    this.field1295 = arg1.method460();
                } else {
                    System.out.println("Error unrecognised seq config code: " + var3);
                }
            }
        }
    }
}
