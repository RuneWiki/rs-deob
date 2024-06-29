import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!SPUHKLMC")
public class class50 {

    @OriginalMember(owner = "client!SPUHKLMC", name = "b", descriptor = "Z")
    private boolean field1390 = true;

    @OriginalMember(owner = "client!SPUHKLMC", name = "i", descriptor = "I")
    public int field1397 = -1;

    @OriginalMember(owner = "client!SPUHKLMC", name = "k", descriptor = "Z")
    public boolean field1399 = false;

    @OriginalMember(owner = "client!SPUHKLMC", name = "l", descriptor = "I")
    public int field1400 = 5;

    @OriginalMember(owner = "client!SPUHKLMC", name = "m", descriptor = "I")
    public int field1401 = -1;

    @OriginalMember(owner = "client!SPUHKLMC", name = "n", descriptor = "I")
    public int field1402 = -1;

    @OriginalMember(owner = "client!SPUHKLMC", name = "o", descriptor = "I")
    public int field1403 = 99;

    @OriginalMember(owner = "client!SPUHKLMC", name = "p", descriptor = "I")
    public int field1404 = -1;

    @OriginalMember(owner = "client!SPUHKLMC", name = "q", descriptor = "I")
    public int field1405 = -1;

    @OriginalMember(owner = "client!SPUHKLMC", name = "r", descriptor = "I")
    public int field1406 = 2;

    @OriginalMember(owner = "client!SPUHKLMC", name = "a", descriptor = "I")
    private static int field1389 = 4;

    @OriginalMember(owner = "client!SPUHKLMC", name = "c", descriptor = "I")
    public static int field1391;

    @OriginalMember(owner = "client!SPUHKLMC", name = "e", descriptor = "I")
    public int field1393;

    @OriginalMember(owner = "client!SPUHKLMC", name = "s", descriptor = "I")
    public int field1407;

    @OriginalMember(owner = "client!SPUHKLMC", name = "t", descriptor = "I")
    public static int field1408;

    @OriginalMember(owner = "client!SPUHKLMC", name = "f", descriptor = "[I")
    public int[] field1394;

    @OriginalMember(owner = "client!SPUHKLMC", name = "g", descriptor = "[I")
    public int[] field1395;

    @OriginalMember(owner = "client!SPUHKLMC", name = "h", descriptor = "[I")
    private int[] field1396;

    @OriginalMember(owner = "client!SPUHKLMC", name = "j", descriptor = "[I")
    public int[] field1398;

    @OriginalMember(owner = "client!SPUHKLMC", name = "d", descriptor = "[LSPUHKLMC;")
    public static class50[] field1392;

    @OriginalMember(owner = "client!SPUHKLMC", name = "a", descriptor = "(ZLVSQMPWOM;)V")
    public static void method506(boolean arg0, class59 arg1) {
        if (!arg0) {
            field1389 = 267;
        }
        class3 var2 = new class3(arg1.method526("seq.dat", null), -990);
        field1391 = var2.method56();
        if (field1392 == null) {
            field1392 = new class50[field1391];
        }
        for (int var3 = 0; var3 < field1391; var3++) {
            if (field1392[var3] == null) {
                field1392[var3] = new class50();
            }
            field1392[var3].method508((byte) -11, var2);
        }
    }

    @OriginalMember(owner = "client!SPUHKLMC", name = "a", descriptor = "(II)I")
    public int method507(int arg0, int arg1) {
        int var3 = this.field1396[arg0];
        if (arg1 <= 0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        if (var3 == 0) {
            class6 var5 = class6.method114(this.field1394[arg0]);
            if (var5 != null) {
                var3 = this.field1396[arg0] = var5.field94;
            }
        }
        if (var3 == 0) {
            var3 = 1;
        }
        return var3;
    }

    @OriginalMember(owner = "client!SPUHKLMC", name = "a", descriptor = "(BLBFQIDHPO;)V")
    public void method508(byte arg0, class3 arg1) {
        if (arg0 != -11) {
            this.field1390 = !this.field1390;
        }
        while (true) {
            while (true) {
                int var3 = arg1.method54();
                if (var3 == 0) {
                    if (this.field1393 == 0) {
                        this.field1393 = 1;
                        this.field1394 = new int[1];
                        this.field1394[0] = -1;
                        this.field1395 = new int[1];
                        this.field1395[0] = -1;
                        this.field1396 = new int[1];
                        this.field1396[0] = -1;
                    }
                    if (this.field1404 == -1) {
                        if (this.field1398 == null) {
                            this.field1404 = 0;
                        } else {
                            this.field1404 = 2;
                        }
                    }
                    if (this.field1405 == -1) {
                        if (this.field1398 != null) {
                            this.field1405 = 2;
                            return;
                        }
                        this.field1405 = 0;
                        return;
                    }
                    return;
                }
                if (var3 == 1) {
                    this.field1393 = arg1.method54();
                    this.field1394 = new int[this.field1393];
                    this.field1395 = new int[this.field1393];
                    this.field1396 = new int[this.field1393];
                    for (int var4 = 0; var4 < this.field1393; var4++) {
                        this.field1394[var4] = arg1.method56();
                        this.field1395[var4] = arg1.method56();
                        if (this.field1395[var4] == 65535) {
                            this.field1395[var4] = -1;
                        }
                        this.field1396[var4] = arg1.method56();
                    }
                } else if (var3 == 2) {
                    this.field1397 = arg1.method56();
                } else if (var3 == 3) {
                    int var5 = arg1.method54();
                    this.field1398 = new int[var5 + 1];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field1398[var6] = arg1.method54();
                    }
                    this.field1398[var5] = 9999999;
                } else if (var3 == 4) {
                    this.field1399 = true;
                } else if (var3 == 5) {
                    this.field1400 = arg1.method54();
                } else if (var3 == 6) {
                    this.field1401 = arg1.method56();
                } else if (var3 == 7) {
                    this.field1402 = arg1.method56();
                } else if (var3 == 8) {
                    this.field1403 = arg1.method54();
                } else if (var3 == 9) {
                    this.field1404 = arg1.method54();
                } else if (var3 == 10) {
                    this.field1405 = arg1.method54();
                } else if (var3 == 11) {
                    this.field1406 = arg1.method54();
                } else if (var3 == 12) {
                    this.field1407 = arg1.method59();
                } else {
                    System.out.println("Error unrecognised seq config code: " + var3);
                }
            }
        }
    }
}
