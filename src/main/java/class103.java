import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lfa")
public class class103 {

    @OriginalMember(owner = "client!lfa", name = "q", descriptor = "Lrda;")
    private class620 field1543 = new class620();

    @OriginalMember(owner = "client!lfa", name = "r", descriptor = "Lrda;")
    private class620 field1544 = new class620();

    @OriginalMember(owner = "client!lfa", name = "s", descriptor = "Lrda;")
    private class620 field1545 = new class620();

    @OriginalMember(owner = "client!lfa", name = "t", descriptor = "Lrda;")
    private class620 field1546 = new class620();

    @OriginalMember(owner = "client!lfa", name = "v", descriptor = "Leh;")
    private class335 field1548 = new class335(4);

    @OriginalMember(owner = "client!lfa", name = "z", descriptor = "B")
    private byte field1552 = 0;

    @OriginalMember(owner = "client!lfa", name = "A", descriptor = "I")
    public volatile int field1553 = 0;

    @OriginalMember(owner = "client!lfa", name = "y", descriptor = "I")
    public volatile int field1551 = 0;

    @OriginalMember(owner = "client!lfa", name = "B", descriptor = "Leh;")
    private class335 field1554 = new class335(8);

    @OriginalMember(owner = "client!lfa", name = "d", descriptor = "Lcu;")
    public static class206 field1530 = new class206(64, 7);

    @OriginalMember(owner = "client!lfa", name = "b", descriptor = "I")
    public static int field1528;

    @OriginalMember(owner = "client!lfa", name = "c", descriptor = "I")
    public static int field1529;

    @OriginalMember(owner = "client!lfa", name = "e", descriptor = "I")
    public static int field1531;

    @OriginalMember(owner = "client!lfa", name = "f", descriptor = "I")
    public static int field1532;

    @OriginalMember(owner = "client!lfa", name = "g", descriptor = "I")
    public static int field1533;

    @OriginalMember(owner = "client!lfa", name = "h", descriptor = "I")
    public static int field1534;

    @OriginalMember(owner = "client!lfa", name = "i", descriptor = "I")
    public static int field1535;

    @OriginalMember(owner = "client!lfa", name = "j", descriptor = "I")
    public static int field1536;

    @OriginalMember(owner = "client!lfa", name = "k", descriptor = "I")
    public static int field1537;

    @OriginalMember(owner = "client!lfa", name = "l", descriptor = "I")
    public static int field1538;

    @OriginalMember(owner = "client!lfa", name = "m", descriptor = "I")
    public static int field1539;

    @OriginalMember(owner = "client!lfa", name = "o", descriptor = "I")
    public static int field1541;

    @OriginalMember(owner = "client!lfa", name = "p", descriptor = "I")
    public static int field1542;

    @OriginalMember(owner = "client!lfa", name = "u", descriptor = "I")
    private int field1547;

    @OriginalMember(owner = "client!lfa", name = "w", descriptor = "J")
    private long field1549;

    @OriginalMember(owner = "client!lfa", name = "x", descriptor = "Lfv;")
    private class110 field1550;

    @OriginalMember(owner = "client!lfa", name = "n", descriptor = "Lbi;")
    public static class449 field1540;

    @OriginalMember(owner = "client!lfa", name = "C", descriptor = "Lve;")
    private class470 field1555;

    @OriginalMember(owner = "client!lfa", name = "a", descriptor = "[[[S")
    public static short[][][] field1527;

    @OriginalMember(owner = "client!lfa", name = "a", descriptor = "(ILfv;Z)V")
    public final void method779(int arg0, class110 arg1, boolean arg2) {
        field1528++;
        if (this.field1550 != null) {
            try {
                this.field1550.method820(0);
            } catch (Exception var8) {
            }
            this.field1550 = null;
        }
        this.field1550 = arg1;
        this.method782((byte) 30);
        this.method791(arg2, (byte) 15);
        this.field1555 = null;
        this.field1554.field4619 = 0;
        while (true) {
            class470 var4 = (class470) this.field1544.method3392((byte) 58);
            if (var4 == null) {
                while (true) {
                    class470 var5 = (class470) this.field1546.method3392((byte) 58);
                    if (var5 == null) {
                        if (this.field1552 != arg0) {
                            try {
                                this.field1548.field4619 = 0;
                                this.field1548.method1980(-345277664, 4);
                                this.field1548.method1980(-345277664, this.field1552);
                                this.field1548.method2031((byte) 54, 0);
                                this.field1550.method815(0, this.field1548.field4600, 28, 4);
                            } catch (IOException var7) {
                                try {
                                    this.field1550.method820(0);
                                } catch (Exception var6) {
                                }
                                this.field1553++;
                                this.field1551 = -2;
                                this.field1550 = null;
                            }
                        }
                        this.field1547 = 0;
                        this.field1549 = class681.method3802(-23600);
                        return;
                    }
                    this.field1545.method3396(var5, -1);
                }
            }
            this.field1543.method3396(var4, arg0 - 1);
        }
    }

    @OriginalMember(owner = "client!lfa", name = "a", descriptor = "(B)Z")
    public final boolean method780(byte arg0) {
        field1529++;
        int var2 = 107 / ((arg0 - 45) / 60);
        return this.method786((byte) 38) >= 20;
    }

    @OriginalMember(owner = "client!lfa", name = "a", descriptor = "(Z)V")
    public final void method781(boolean arg0) {
        if (this.field1550 != null) {
            this.field1550.method822(false);
        }
        if (arg0) {
            field1538++;
        }
    }

    @OriginalMember(owner = "client!lfa", name = "b", descriptor = "(B)V")
    private final void method782(byte arg0) {
        if (arg0 != 30) {
            return;
        }
        field1535++;
        if (this.field1550 == null) {
            return;
        }
        try {
            this.field1548.field4619 = 0;
            this.field1548.method1980(-345277664, 6);
            this.field1548.method2041(3, 128);
            this.field1550.method815(0, this.field1548.field4600, 106, 4);
        } catch (IOException var3) {
            try {
                this.field1550.method820(0);
            } catch (Exception var2) {
            }
            this.field1550 = null;
            this.field1551 = -2;
            this.field1553++;
        }
    }

    @OriginalMember(owner = "client!lfa", name = "a", descriptor = "(I)V")
    public static void method783(int arg0) {
        field1530 = null;
        if (arg0 != 0) {
            field1530 = null;
        }
        field1527 = null;
        field1540 = null;
    }

    @OriginalMember(owner = "client!lfa", name = "c", descriptor = "(B)V")
    public final void method784(byte arg0) {
        try {
            this.field1550.method820(0);
        } catch (Exception var2) {
        }
        field1541++;
        this.field1550 = null;
        if (arg0 != -30) {
            this.field1549 = 111L;
        }
        this.field1551 = -1;
        this.field1552 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
        this.field1553++;
    }

    @OriginalMember(owner = "client!lfa", name = "a", descriptor = "(Loa;Lni;IIIII)V")
    public static final void method785(class651 arg0, class487 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        boolean var7 = true;
        int var8 = arg3;
        int var9 = arg3 + arg5;
        int var10 = arg4 - 1;
        int var11 = arg4 + arg6;
        for (int var12 = arg2; var12 <= arg2 + 1; var12++) {
            if (class13.field218 != var12) {
                for (int var13 = var8; var13 <= var9; var13++) {
                    if (var13 >= 0 && var13 < class657.field8966) {
                        for (int var14 = var10; var14 <= var11; var14++) {
                            if (var14 >= 0 && var14 < class227.field3196 && (!var7 || var13 >= var9 || var14 >= var11 || var14 < arg4 && arg3 != var13)) {
                                class24 var15 = class703.field9899[var12][var13][var14];
                                if (var15 != null) {
                                    int var16 = (class218.field3099[var12].method195(var13, var14) + class218.field3099[var12].method195(var13 + 1, var14) + class218.field3099[var12].method195(var13, var14 + 1) + class218.field3099[var12].method195(var13 + 1, var14 + 1)) / 4 - (class218.field3099[arg2].method195(arg3, arg4) + class218.field3099[arg2].method195(arg3 + 1, arg4) + class218.field3099[arg2].method195(arg3, arg4 + 1) + class218.field3099[arg2].method195(arg3 + 1, arg4 + 1)) / 4;
                                    class477 var17 = var15.field411;
                                    class477 var18 = var15.field406;
                                    if (var17 != null && var17.method139(2)) {
                                        arg1.method141((var13 - arg3) * class587.field7787 + (1 - arg5) * class16.field256, arg0, var16, var17, var7, true, (var14 - arg4) * class587.field7787 + (1 - arg6) * class16.field256);
                                    }
                                    if (var18 != null && var18.method139(2)) {
                                        arg1.method141((var13 - arg3) * class587.field7787 + (1 - arg5) * class16.field256, arg0, var16, var18, var7, true, (var14 - arg4) * class587.field7787 + (1 - arg6) * class16.field256);
                                    }
                                    for (class684 var19 = var15.field409; var19 != null; var19 = var19.field9618) {
                                        class641 var20 = var19.field9619;
                                        if (var20 != null && var20.method139(2) && (var20.field8611 == var13 || var8 == var13) && (var20.field8618 == var14 || var10 == var14)) {
                                            int var21 = var20.field8622 + 1 - var20.field8611;
                                            int var22 = var20.field8610 + 1 - var20.field8618;
                                            arg1.method141((var20.field8611 - arg3) * class587.field7787 + (var21 - arg5) * class16.field256, arg0, var16, var20, var7, true, (var20.field8618 - arg4) * class587.field7787 + (var22 - arg6) * class16.field256);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var8--;
                var7 = false;
            }
        }
    }

    @OriginalMember(owner = "client!lfa", name = "d", descriptor = "(B)I")
    private final int method786(byte arg0) {
        if (arg0 == 38) {
            field1539++;
            return this.field1545.method3393(false) + this.field1546.method3393(false);
        } else {
            return -120;
        }
    }

    @OriginalMember(owner = "client!lfa", name = "a", descriptor = "(IZBIB)Lve;")
    public final class470 method787(int arg0, boolean arg1, byte arg2, int arg3, byte arg4) {
        field1536++;
        long var6 = (long) ((arg0 << 16) + arg3);
        if (arg4 != 119) {
            this.method790(0);
        }
        class470 var8 = new class470();
        var8.field207 = var6;
        var8.field6416 = arg1;
        var8.field6293 = arg2;
        if (arg1) {
            if (this.method788(3) >= 20) {
                throw new RuntimeException();
            }
            this.field1543.method3396(var8, -1);
        } else if (this.method786((byte) 38) < 20) {
            this.field1545.method3396(var8, -1);
        } else {
            throw new RuntimeException();
        }
        return var8;
    }

    @OriginalMember(owner = "client!lfa", name = "b", descriptor = "(I)I")
    public final int method788(int arg0) {
        field1533++;
        return arg0 == 3 ? this.field1543.method3393(false) + this.field1544.method3393(false) : 27;
    }

    @OriginalMember(owner = "client!lfa", name = "c", descriptor = "(I)V")
    public final void method789(int arg0) {
        field1534++;
        if (this.field1550 == null) {
            return;
        }
        try {
            this.field1548.field4619 = 0;
            this.field1548.method1980(-345277664, 7);
            this.field1548.method2041(0, 128);
            if (arg0 == -21) {
                this.field1550.method815(0, this.field1548.field4600, 120, 4);
            }
        } catch (IOException var3) {
            try {
                this.field1550.method820(0);
            } catch (Exception var2) {
            }
            this.field1553++;
            this.field1551 = -2;
            this.field1550 = null;
        }
    }

    @OriginalMember(owner = "client!lfa", name = "d", descriptor = "(I)Z")
    public final boolean method790(int arg0) {
        if (this.field1550 != null) {
            long var2 = class681.method3802(-23600);
            int var4 = (int) (var2 - this.field1549);
            this.field1549 = var2;
            if (var4 > 200) {
                var4 = 200;
            }
            this.field1547 += var4;
            if (this.field1547 > 30000) {
                try {
                    this.field1550.method820(0);
                } catch (Exception var27) {
                }
                this.field1550 = null;
            }
        }
        field1532++;
        if (this.field1550 == null) {
            return this.method788(3) == 0 && this.method786((byte) 38) == 0;
        }
        try {
            this.field1550.method819(-102);
            for (class470 var5 = (class470) this.field1543.method3390((byte) 117); var5 != null; var5 = (class470) this.field1543.method3401(-10265)) {
                this.field1548.field4619 = 0;
                this.field1548.method1980(-345277664, 1);
                this.field1548.method2041((int) var5.field207, 128);
                this.field1550.method815(0, this.field1548.field4600, 113, 4);
                this.field1544.method3396(var5, -1);
            }
            if (arg0 != 8) {
                this.field1547 = 36;
            }
            for (class470 var6 = (class470) this.field1545.method3390((byte) 84); var6 != null; var6 = (class470) this.field1545.method3401(-10265)) {
                this.field1548.field4619 = 0;
                this.field1548.method1980(arg0 ^ 0xEB6B7B28, 0);
                this.field1548.method2041((int) var6.field207, 128);
                this.field1550.method815(0, this.field1548.field4600, arg0 ^ 0x51, 4);
                this.field1546.method3396(var6, -1);
            }
            for (int var7 = 0; var7 < 100; var7++) {
                int var8 = this.field1550.method818(-19508);
                if (var8 < 0) {
                    throw new IOException();
                }
                if (var8 == 0) {
                    break;
                }
                this.field1547 = 0;
                byte var9 = 0;
                if (this.field1555 == null) {
                    var9 = 8;
                } else if (this.field1555.field6291 == 0) {
                    var9 = 1;
                }
                if (var9 <= 0) {
                    int var10 = this.field1555.field6287.field4600.length - this.field1555.field6293;
                    int var11 = 512 - this.field1555.field6291;
                    if (var10 - this.field1555.field6287.field4619 < var11) {
                        var11 = var10 - this.field1555.field6287.field4619;
                    }
                    if (var8 < var11) {
                        var11 = var8;
                    }
                    this.field1550.method814(var11, this.field1555.field6287.field4600, true, this.field1555.field6287.field4619);
                    if (this.field1552 != 0) {
                        for (int var12 = 0; var12 < var11; var12++) {
                            this.field1555.field6287.field4600[this.field1555.field6287.field4619 + var12] = (byte) class217.method1381(this.field1555.field6287.field4600[this.field1555.field6287.field4619 + var12], this.field1552);
                        }
                    }
                    this.field1555.field6287.field4619 += var11;
                    this.field1555.field6291 += var11;
                    if (this.field1555.field6287.field4619 == var10) {
                        this.field1555.method131(122);
                        this.field1555.field6415 = false;
                        this.field1555 = null;
                    } else if (this.field1555.field6291 == 512) {
                        this.field1555.field6291 = 0;
                    }
                } else {
                    int var13 = var9 - this.field1554.field4619;
                    if (var8 < var13) {
                        var13 = var8;
                    }
                    this.field1550.method814(var13, this.field1554.field4600, true, this.field1554.field4619);
                    if (this.field1552 != 0) {
                        for (int var14 = 0; var14 < var13; var14++) {
                            this.field1554.field4600[this.field1554.field4619 + var14] = (byte) class217.method1381(this.field1554.field4600[this.field1554.field4619 + var14], this.field1552);
                        }
                    }
                    this.field1554.field4619 += var13;
                    if (this.field1554.field4619 >= var9) {
                        if (this.field1555 == null) {
                            this.field1554.field4619 = 0;
                            int var15 = this.field1554.method2034(255);
                            int var16 = this.field1554.method2001((byte) -83);
                            int var17 = this.field1554.method2034(255);
                            int var18 = this.field1554.method2045(-98);
                            int var19 = var17 & 0x7F;
                            boolean var20 = (var17 & 0x80) != 0;
                            long var21 = (long) ((var15 << 16) + var16);
                            Object var23 = null;
                            class470 var24;
                            if (var20) {
                                for (var24 = (class470) this.field1546.method3390((byte) 112); var24 != null && var24.field207 != var21; var24 = (class470) this.field1546.method3401(-10265)) {
                                }
                            } else {
                                for (var24 = (class470) this.field1544.method3390((byte) 84); var24 != null && var24.field207 != var21; var24 = (class470) this.field1544.method3401(-10265)) {
                                }
                            }
                            if (var24 == null) {
                                throw new IOException();
                            }
                            this.field1555 = var24;
                            int var25 = var19 == 0 ? 5 : 9;
                            this.field1555.field6287 = new class335(var18 + var25 + this.field1555.field6293);
                            this.field1555.field6287.method1980(-345277664, var19);
                            this.field1555.field6287.method1982(var18, (byte) 63);
                            this.field1555.field6291 = 8;
                            this.field1554.field4619 = 0;
                        } else if (this.field1555.field6291 != 0) {
                            throw new IOException();
                        } else if (this.field1554.field4600[0] == -1) {
                            this.field1554.field4619 = 0;
                            this.field1555.field6291 = 1;
                        } else {
                            this.field1555 = null;
                        }
                    }
                }
            }
            return true;
        } catch (IOException var28) {
            try {
                this.field1550.method820(arg0 - 8);
            } catch (Exception var26) {
            }
            this.field1551 = -2;
            this.field1550 = null;
            this.field1553++;
            return this.method788(3) == 0 && this.method786((byte) 38) == 0;
        }
    }

    @OriginalMember(owner = "client!lfa", name = "a", descriptor = "(ZB)V")
    public final void method791(boolean arg0, byte arg1) {
        field1537++;
        if (this.field1550 == null) {
            return;
        }
        try {
            this.field1548.field4619 = 0;
            this.field1548.method1980(arg1 - 345277679, arg0 ? 2 : 3);
            if (arg1 != 15) {
                field1540 = null;
            }
            this.field1548.method2041(0, 128);
            this.field1550.method815(0, this.field1548.field4600, 80, 4);
        } catch (IOException var4) {
            try {
                this.field1550.method820(0);
            } catch (Exception var3) {
            }
            this.field1551 = -2;
            this.field1553++;
            this.field1550 = null;
        }
    }

    @OriginalMember(owner = "client!lfa", name = "e", descriptor = "(B)Z")
    public final boolean method792(byte arg0) {
        int var2 = -56 % ((59 - arg0) / 33);
        field1531++;
        return this.method788(3) >= 20;
    }

    @OriginalMember(owner = "client!lfa", name = "e", descriptor = "(I)V")
    public final void method793(int arg0) {
        int var2 = 72 % ((82 - arg0) / 37);
        field1542++;
        if (this.field1550 != null) {
            this.field1550.method820(0);
        }
    }
}
