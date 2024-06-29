import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!QBINVEVU")
public class class47 {

    @OriginalMember(owner = "client!QBINVEVU", name = "b", descriptor = "Z")
    private boolean field1334 = true;

    @OriginalMember(owner = "client!QBINVEVU", name = "i", descriptor = "I")
    public int field1341 = -1;

    @OriginalMember(owner = "client!QBINVEVU", name = "k", descriptor = "Z")
    public boolean field1343 = false;

    @OriginalMember(owner = "client!QBINVEVU", name = "l", descriptor = "I")
    public int field1344 = 5;

    @OriginalMember(owner = "client!QBINVEVU", name = "m", descriptor = "I")
    public int field1345 = -1;

    @OriginalMember(owner = "client!QBINVEVU", name = "n", descriptor = "I")
    public int field1346 = -1;

    @OriginalMember(owner = "client!QBINVEVU", name = "o", descriptor = "I")
    public int field1347 = 99;

    @OriginalMember(owner = "client!QBINVEVU", name = "p", descriptor = "I")
    public int field1348 = -1;

    @OriginalMember(owner = "client!QBINVEVU", name = "q", descriptor = "I")
    public int field1349 = -1;

    @OriginalMember(owner = "client!QBINVEVU", name = "r", descriptor = "I")
    public int field1350 = 2;

    @OriginalMember(owner = "client!QBINVEVU", name = "a", descriptor = "I")
    private static int field1333 = 503;

    @OriginalMember(owner = "client!QBINVEVU", name = "c", descriptor = "I")
    public static int field1335;

    @OriginalMember(owner = "client!QBINVEVU", name = "e", descriptor = "I")
    public int field1337;

    @OriginalMember(owner = "client!QBINVEVU", name = "s", descriptor = "I")
    public int field1351;

    @OriginalMember(owner = "client!QBINVEVU", name = "t", descriptor = "I")
    public static int field1352;

    @OriginalMember(owner = "client!QBINVEVU", name = "f", descriptor = "[I")
    public int[] field1338;

    @OriginalMember(owner = "client!QBINVEVU", name = "g", descriptor = "[I")
    public int[] field1339;

    @OriginalMember(owner = "client!QBINVEVU", name = "h", descriptor = "[I")
    private int[] field1340;

    @OriginalMember(owner = "client!QBINVEVU", name = "j", descriptor = "[I")
    public int[] field1342;

    @OriginalMember(owner = "client!QBINVEVU", name = "d", descriptor = "[LQBINVEVU;")
    public static class47[] field1336;

    @OriginalMember(owner = "client!QBINVEVU", name = "a", descriptor = "(LNXFIIFAD;I)V")
    public static void method450(class41 arg0, int arg1) {
        class37 var2 = new class37(arg0.method431("seq.dat", null), -670);
        if (arg1 != 24570) {
            field1333 = -352;
        }
        field1335 = var2.method388();
        if (field1336 == null) {
            field1336 = new class47[field1335];
        }
        for (int var3 = 0; var3 < field1335; var3++) {
            if (field1336[var3] == null) {
                field1336[var3] = new class47();
            }
            field1336[var3].method452(var2, 0);
        }
    }

    @OriginalMember(owner = "client!QBINVEVU", name = "a", descriptor = "(II)I")
    public int method451(int arg0, int arg1) {
        int var3 = this.field1340[arg1];
        if (arg0 != 13126) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        if (var3 == 0) {
            class17 var5 = class17.method210(this.field1338[arg1]);
            if (var5 != null) {
                var3 = this.field1340[arg1] = var5.field723;
            }
        }
        if (var3 == 0) {
            var3 = 1;
        }
        return var3;
    }

    @OriginalMember(owner = "client!QBINVEVU", name = "a", descriptor = "(LMNKDCXXG;I)V")
    public void method452(class37 arg0, int arg1) {
        if (arg1 != 0) {
            this.field1334 = !this.field1334;
        }
        while (true) {
            while (true) {
                int var3 = arg0.method386();
                if (var3 == 0) {
                    if (this.field1337 == 0) {
                        this.field1337 = 1;
                        this.field1338 = new int[1];
                        this.field1338[0] = -1;
                        this.field1339 = new int[1];
                        this.field1339[0] = -1;
                        this.field1340 = new int[1];
                        this.field1340[0] = -1;
                    }
                    if (this.field1348 == -1) {
                        if (this.field1342 == null) {
                            this.field1348 = 0;
                        } else {
                            this.field1348 = 2;
                        }
                    }
                    if (this.field1349 == -1) {
                        if (this.field1342 != null) {
                            this.field1349 = 2;
                            return;
                        }
                        this.field1349 = 0;
                        return;
                    }
                    return;
                }
                if (var3 == 1) {
                    this.field1337 = arg0.method386();
                    this.field1338 = new int[this.field1337];
                    this.field1339 = new int[this.field1337];
                    this.field1340 = new int[this.field1337];
                    for (int var4 = 0; var4 < this.field1337; var4++) {
                        this.field1338[var4] = arg0.method388();
                        this.field1339[var4] = arg0.method388();
                        if (this.field1339[var4] == 65535) {
                            this.field1339[var4] = -1;
                        }
                        this.field1340[var4] = arg0.method388();
                    }
                } else if (var3 == 2) {
                    this.field1341 = arg0.method388();
                } else if (var3 == 3) {
                    int var5 = arg0.method386();
                    this.field1342 = new int[var5 + 1];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field1342[var6] = arg0.method386();
                    }
                    this.field1342[var5] = 9999999;
                } else if (var3 == 4) {
                    this.field1343 = true;
                } else if (var3 == 5) {
                    this.field1344 = arg0.method386();
                } else if (var3 == 6) {
                    this.field1345 = arg0.method388();
                } else if (var3 == 7) {
                    this.field1346 = arg0.method388();
                } else if (var3 == 8) {
                    this.field1347 = arg0.method386();
                } else if (var3 == 9) {
                    this.field1348 = arg0.method386();
                } else if (var3 == 10) {
                    this.field1349 = arg0.method386();
                } else if (var3 == 11) {
                    this.field1350 = arg0.method386();
                } else if (var3 == 12) {
                    this.field1351 = arg0.method391();
                } else {
                    System.out.println("Error unrecognised seq config code: " + var3);
                }
            }
        }
    }
}
