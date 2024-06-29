import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class101 {

    @OriginalMember(owner = "client!mg", name = "n", descriptor = "Lqn;")
    private class46 field1517 = null;

    @OriginalMember(owner = "client!mg", name = "u", descriptor = "Z")
    private boolean field1524;

    @OriginalMember(owner = "client!mg", name = "L", descriptor = "I")
    public int field1541;

    @OriginalMember(owner = "client!mg", name = "k", descriptor = "Lrg;")
    private class453 field1514;

    @OriginalMember(owner = "client!mg", name = "E", descriptor = "I")
    public static int field1534;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "I")
    public static int field1504;

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "I")
    public static int field1505;

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "I")
    public static int field1506;

    @OriginalMember(owner = "client!mg", name = "d", descriptor = "I")
    public static int field1507;

    @OriginalMember(owner = "client!mg", name = "e", descriptor = "I")
    public static int field1508;

    @OriginalMember(owner = "client!mg", name = "f", descriptor = "I")
    public static int field1509;

    @OriginalMember(owner = "client!mg", name = "g", descriptor = "I")
    public static int field1510;

    @OriginalMember(owner = "client!mg", name = "h", descriptor = "I")
    public static int field1511;

    @OriginalMember(owner = "client!mg", name = "i", descriptor = "I")
    public static int field1512;

    @OriginalMember(owner = "client!mg", name = "j", descriptor = "I")
    public static int field1513;

    @OriginalMember(owner = "client!mg", name = "l", descriptor = "I")
    public static int field1515;

    @OriginalMember(owner = "client!mg", name = "m", descriptor = "I")
    public static int field1516;

    @OriginalMember(owner = "client!mg", name = "p", descriptor = "I")
    public static int field1519;

    @OriginalMember(owner = "client!mg", name = "q", descriptor = "I")
    public static int field1520;

    @OriginalMember(owner = "client!mg", name = "r", descriptor = "I")
    public static int field1521;

    @OriginalMember(owner = "client!mg", name = "s", descriptor = "I")
    public static int field1522;

    @OriginalMember(owner = "client!mg", name = "t", descriptor = "I")
    public static int field1523;

    @OriginalMember(owner = "client!mg", name = "v", descriptor = "I")
    public static int field1525;

    @OriginalMember(owner = "client!mg", name = "w", descriptor = "I")
    public static int field1526;

    @OriginalMember(owner = "client!mg", name = "x", descriptor = "I")
    public static int field1527;

    @OriginalMember(owner = "client!mg", name = "y", descriptor = "I")
    public static int field1528;

    @OriginalMember(owner = "client!mg", name = "A", descriptor = "I")
    public static int field1530;

    @OriginalMember(owner = "client!mg", name = "B", descriptor = "I")
    public static int field1531;

    @OriginalMember(owner = "client!mg", name = "C", descriptor = "I")
    public static int field1532;

    @OriginalMember(owner = "client!mg", name = "D", descriptor = "I")
    public static int field1533;

    @OriginalMember(owner = "client!mg", name = "F", descriptor = "I")
    public static int field1535;

    @OriginalMember(owner = "client!mg", name = "G", descriptor = "I")
    public static int field1536;

    @OriginalMember(owner = "client!mg", name = "H", descriptor = "I")
    public static int field1537;

    @OriginalMember(owner = "client!mg", name = "I", descriptor = "I")
    public static int field1538;

    @OriginalMember(owner = "client!mg", name = "J", descriptor = "I")
    public static int field1539;

    @OriginalMember(owner = "client!mg", name = "K", descriptor = "I")
    public static int field1540;

    @OriginalMember(owner = "client!mg", name = "o", descriptor = "[Ljava/lang/Object;")
    private Object[] field1518;

    @OriginalMember(owner = "client!mg", name = "z", descriptor = "[[Ljava/lang/Object;")
    private Object[][] field1529;

    static {
        new class466("This player is on a quick chat world and cannot receive your message.", "Der Spieler kann auf einer Direktchat-Welt keine Nachrichten empfangen.", "Ce joueur est sur un serveur à messagerie rapide et ne peut pas recevoir votre message.", "Este jogador não pode receber sua mensagem porque está em um mundo de papo rápido.");
        field1534 = 0;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(Z)V", line = 6)
    public final void method726(boolean arg0) {
        field1508++;
        if (this.field1518 != null) {
            for (int var2 = 0; var2 < this.field1518.length; var2++) {
                this.field1518[var2] = null;
            }
        }
        if (!arg0) {
            this.method727(-67, -49, 85);
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(III)[B", line = 30)
    public final byte[] method727(int arg0, int arg1, int arg2) {
        field1511++;
        int var4 = 16 / ((-arg2 - 28) / 39);
        return this.method732(arg0, 23159, null, arg1);
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(II)V", line = 40)
    private final void method728(int arg0, int arg1) {
        field1512++;
        if (this.field1524) {
            this.field1518[arg1] = this.field1514.method2669((byte) 105, arg1);
        } else {
            this.field1518[arg1] = class407.method2439((byte) 117, false, this.field1514.method2669((byte) 126, arg1));
        }
        if (arg0 <= 29) {
            this.method728(-103, -107);
        }
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(III)Z", line = 55)
    public final boolean method729(int arg0, int arg1, int arg2) {
        field1522++;
        if (!this.method744(arg0, arg1, 0)) {
            return false;
        } else if (this.field1529[arg0] != null && this.field1529[arg0][arg1] != null) {
            return true;
        } else if (this.field1518[arg0] == null) {
            this.method728(51, arg0);
            if (this.field1518[arg0] == null) {
                return arg2 != -8410;
            } else {
                return true;
            }
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "([IIII)Z", line = 82)
    private final boolean method730(int[] arg0, int arg1, int arg2, int arg3) {
        field1530++;
        if (!this.method739(arg2, -1049)) {
            return false;
        } else if (this.field1518[arg2] == null) {
            return false;
        } else {
            int var5 = this.field1517.field563[arg2];
            int[] var6 = this.field1517.field556[arg2];
            if (this.field1529[arg2] == null) {
                this.field1529[arg2] = new Object[this.field1517.field551[arg2]];
            }
            Object[] var7 = this.field1529[arg2];
            boolean var8 = true;
            for (int var9 = 0; var9 < var5; var9++) {
                int var10;
                if (var6 == null) {
                    var10 = var9;
                } else {
                    var10 = var6[var9];
                }
                if (var7[var10] == null) {
                    var8 = false;
                    break;
                }
            }
            if (var8) {
                return true;
            }
            byte[] var11;
            if (arg0 == null || arg0[0] == 0 && arg0[1] == 0 && arg0[2] == 0 && arg0[3] == 0) {
                var11 = class526.method3129(this.field1518[arg2], false, (byte) 40);
            } else {
                var11 = class526.method3129(this.field1518[arg2], true, (byte) 40);
                class391 var12 = new class391(var11);
                var12.method2341(arg0, 1316243429, 5, var12.field5678.length);
            }
            byte[] var13;
            try {
                var13 = class129.method894(var11, (byte) -113);
            } catch (RuntimeException var49) {
                throw class255.method1531(var49, "T3 - " + (arg0 != null) + "," + arg2 + "," + var11.length + "," + class147.method986((byte) 62, var11, var11.length) + "," + class147.method986((byte) 62, var11, var11.length - 2) + "," + this.field1517.field558[arg2] + "," + this.field1517.field566);
            }
            if (this.field1524) {
                this.field1518[arg2] = null;
            }
            if (arg3 > -96) {
                this.method733(-87, false);
            }
            if (var5 <= 1) {
                int var48;
                if (var6 == null) {
                    var48 = 0;
                } else {
                    var48 = var6[0];
                }
                if (this.field1541 == 0) {
                    var7[var48] = class407.method2439((byte) 91, false, var13);
                } else {
                    var7[var48] = var13;
                }
            } else if (this.field1541 == 2) {
                int var15 = var13.length;
                int var50 = var15 - 1;
                int var16 = var13[var50] & 0xFF;
                int var17 = var50 - var16 * 4 * var5;
                class391 var18 = new class391(var13);
                int var19 = 0;
                int var20 = 0;
                var18.field5719 = var17;
                for (int var21 = 0; var21 < var16; var21++) {
                    int var22 = 0;
                    for (int var23 = 0; var23 < var5; var23++) {
                        var22 += var18.method2361((byte) -56);
                        int var24;
                        if (var6 == null) {
                            var24 = var23;
                        } else {
                            var24 = var6[var23];
                        }
                        if (arg1 == var24) {
                            var20 = var24;
                            var19 += var22;
                        }
                    }
                }
                if (var19 == 0) {
                    return true;
                }
                byte[] var25 = new byte[var19];
                var18.field5719 = var17;
                int var26 = 0;
                int var27 = 0;
                for (int var28 = 0; var28 < var16; var28++) {
                    int var29 = 0;
                    for (int var30 = 0; var30 < var5; var30++) {
                        var29 += var18.method2361((byte) -56);
                        int var31;
                        if (var6 == null) {
                            var31 = var30;
                        } else {
                            var31 = var6[var30];
                        }
                        if (arg1 == var31) {
                            class91.method678(var13, var27, var25, var26, var29);
                            var26 += var29;
                        }
                        var27 += var29;
                    }
                }
                var7[var20] = var25;
            } else {
                int var32 = var13.length;
                int var51 = var32 - 1;
                int var33 = var13[var51] & 0xFF;
                int var34 = var51 - var5 * var33 * 4;
                class391 var35 = new class391(var13);
                var35.field5719 = var34;
                int[] var36 = new int[var5];
                for (int var37 = 0; var37 < var33; var37++) {
                    int var38 = 0;
                    for (int var39 = 0; var39 < var5; var39++) {
                        var38 += var35.method2361((byte) -56);
                        var36[var39] += var38;
                    }
                }
                byte[][] var40 = new byte[var5][];
                for (int var41 = 0; var41 < var5; var41++) {
                    var40[var41] = new byte[var36[var41]];
                    var36[var41] = 0;
                }
                var35.field5719 = var34;
                int var42 = 0;
                for (int var43 = 0; var43 < var33; var43++) {
                    int var44 = 0;
                    for (int var45 = 0; var45 < var5; var45++) {
                        var44 += var35.method2361((byte) -56);
                        class91.method678(var13, var42, var40[var45], var36[var45], var44);
                        var36[var45] += var44;
                        var42 += var44;
                    }
                }
                for (int var46 = 0; var46 < var5; var46++) {
                    int var47;
                    if (var6 == null) {
                        var47 = var46;
                    } else {
                        var47 = var6[var46];
                    }
                    if (this.field1541 == 0) {
                        var7[var47] = class407.method2439((byte) 95, false, var40[var46]);
                    } else {
                        var7[var47] = var40[var46];
                    }
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(B)I", line = 369)
    public final int method731(byte arg0) {
        field1532++;
        if (!this.method741((byte) -103)) {
            return 0;
        }
        int var2 = 0;
        int var3 = 0;
        for (int var4 = 0; var4 < this.field1518.length; var4++) {
            if (this.field1517.field563[var4] > 0) {
                var2 += 100;
                var3 += this.method751(var4, -5762);
            }
        }
        if (arg0 < 121) {
            this.method729(117, -112, 12);
        }
        if (var2 == 0) {
            return 100;
        } else {
            return var3 * 100 / var2;
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(II[II)[B", line = 410)
    public final byte[] method732(int arg0, int arg1, int[] arg2, int arg3) {
        field1535++;
        if (!this.method744(arg3, arg0, 0)) {
            return null;
        }
        if (this.field1529[arg3] == null || this.field1529[arg3][arg0] == null) {
            boolean var5 = this.method730(arg2, arg0, arg3, -117);
            if (!var5) {
                this.method728(55, arg3);
                boolean var6 = this.method730(arg2, arg0, arg3, arg1 ^ 0xFFFFA5E5);
                if (!var6) {
                    return null;
                }
            }
        }
        byte[] var7 = class526.method3129(this.field1529[arg3][arg0], false, (byte) 40);
        if (this.field1541 == 1) {
            this.field1529[arg3][arg0] = null;
            if (this.field1517.field551[arg3] == 1) {
                this.field1529[arg3] = null;
            }
        } else if (this.field1541 == 2) {
            this.field1529[arg3] = null;
        }
        if (arg1 != 23159) {
            field1534 = 49;
        }
        return var7;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(IZ)I", line = 460)
    public final int method733(int arg0, boolean arg1) {
        if (!arg1) {
            return -121;
        }
        field1507++;
        if (this.method741((byte) -103)) {
            int var3 = this.field1517.field560.method1097((byte) 83, arg0);
            return this.method739(var3, -1049) ? var3 : -1;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;)Z", line = 480)
    public final boolean method734(String arg0, byte arg1, String arg2) {
        field1516++;
        if (!this.method741((byte) -103)) {
            return false;
        }
        String var4 = arg0.toLowerCase();
        String var5 = arg2.toLowerCase();
        int var6 = this.field1517.field560.method1097((byte) 83, class371.method2227(0, var4));
        if (!this.method739(var6, -1049)) {
            return false;
        }
        int var7 = this.field1517.field568[var6].method1097((byte) 83, class371.method2227(0, var5));
        if (arg1 < 54) {
            this.method750(15, 61);
        }
        return this.method729(var6, var7, -8410);
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(ILjava/lang/String;)I", line = 515)
    public final int method735(int arg0, String arg1) {
        int var3 = 32 % ((-arg0 - 32) / 34);
        field1525++;
        if (this.method741((byte) -103)) {
            String var4 = arg1.toLowerCase();
            int var5 = this.field1517.field560.method1097((byte) 83, class371.method2227(0, var4));
            return this.method739(var5, -1049) ? var5 : -1;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(BLjava/lang/String;)I", line = 536)
    public final int method736(byte arg0, String arg1) {
        field1538++;
        if (!this.method741((byte) -103)) {
            return 0;
        }
        String var3 = arg1.toLowerCase();
        if (arg0 == -109) {
            int var4 = this.field1517.field560.method1097((byte) 83, class371.method2227(0, var3));
            return this.method751(var4, -5762);
        } else {
            return -21;
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(I)Z", line = 554)
    public final boolean method737(int arg0) {
        field1509++;
        if (!this.method741((byte) -103)) {
            return false;
        }
        boolean var2 = true;
        int var3 = -19 / ((arg0 - 24) / 62);
        for (int var4 = 0; var4 < this.field1517.field565.length; var4++) {
            int var5 = this.field1517.field565[var4];
            if (this.field1518[var5] == null) {
                this.method728(93, var5);
                if (this.field1518[var5] == null) {
                    var2 = false;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(B)I", line = 590)
    public final int method738(byte arg0) {
        field1537++;
        if (!this.method741((byte) -103)) {
            throw new IllegalStateException("");
        }
        if (arg0 >= -58) {
            this.field1524 = false;
        }
        return this.field1517.field566;
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(II)Z", line = 608)
    private final boolean method739(int arg0, int arg1) {
        field1521++;
        if (arg1 != -1049) {
            this.field1529 = null;
        }
        if (!this.method741((byte) -103)) {
            return false;
        } else if (arg0 >= 0 && this.field1517.field551.length > arg0 && this.field1517.field551[arg0] != 0) {
            return true;
        } else if (class120.field1775) {
            throw new IllegalArgumentException(Integer.toString(arg0));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(ZLjava/lang/String;)Z", line = 634)
    public final boolean method740(boolean arg0, String arg1) {
        field1513++;
        if (!this.method741((byte) -103)) {
            return false;
        }
        if (!arg0) {
            this.method738((byte) -39);
        }
        String var3 = arg1.toLowerCase();
        int var4 = this.field1517.field560.method1097((byte) 83, class371.method2227(0, var3));
        return this.method750(var4, 56);
    }

    @OriginalMember(owner = "client!mg", name = "<init>", descriptor = "(Lrg;ZI)V", line = 1034)
    public class101(class453 arg0, boolean arg1, int arg2) {
        if (arg2 < 0 || arg2 > 2) {
            throw new IllegalArgumentException("js5: Invalid value " + arg2 + " supplied for discardunpacked");
        }
        this.field1524 = arg1;
        this.field1541 = arg2;
        this.field1514 = arg0;
    }

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "(B)Z", line = 656)
    private final boolean method741(byte arg0) {
        field1519++;
        if (arg0 != -103) {
            this.field1517 = null;
        }
        if (this.field1517 == null) {
            this.field1517 = this.field1514.method2671((byte) 0);
            if (this.field1517 == null) {
                return false;
            }
            this.field1529 = new Object[this.field1517.field555][];
            this.field1518 = new Object[this.field1517.field555];
        }
        return true;
    }

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "(II)[B", line = 677)
    public final byte[] method742(int arg0, int arg1) {
        field1528++;
        if (!this.method741((byte) -103)) {
            return null;
        } else if (this.field1517.field551.length == arg1) {
            return this.method727(arg0, 0, -118);
        } else if (!this.method739(arg0, -1049)) {
            return null;
        } else if (this.field1517.field551[arg0] == 1) {
            return this.method727(0, arg0, -83);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(ZLjava/lang/String;)Z", line = 704)
    public final boolean method743(boolean arg0, String arg1) {
        field1504++;
        if (!this.method741((byte) -103)) {
            return false;
        }
        String var3 = arg1.toLowerCase();
        int var4 = this.field1517.field560.method1097((byte) 83, class371.method2227(0, var3));
        if (var4 < 0) {
            return false;
        } else {
            return !arg0;
        }
    }

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "(III)Z", line = 728)
    private final boolean method744(int arg0, int arg1, int arg2) {
        field1540++;
        if (!this.method741((byte) -103)) {
            return false;
        } else if (arg2 <= arg0 && arg1 >= 0 && arg0 < this.field1517.field551.length && arg1 < this.field1517.field551[arg0]) {
            return true;
        } else if (class120.field1775) {
            throw new IllegalArgumentException(arg0 + "," + arg1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!mg", name = "d", descriptor = "(II)V", line = 752)
    private final void method745(int arg0, int arg1) {
        field1505++;
        if (arg0 == 100) {
            this.field1514.method2667(arg0 ^ 0x74, arg1);
        }
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(I)I", line = 763)
    public final int method746(int arg0) {
        field1506++;
        if (arg0 <= 15) {
            this.field1524 = true;
        }
        return this.method741((byte) -103) ? this.field1517.field551.length : -1;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(IB)Z", line = 781)
    public final boolean method747(int arg0, byte arg1) {
        if (arg1 != -68) {
            return true;
        }
        field1520++;
        if (!this.method741((byte) -103)) {
            return false;
        } else if (this.field1517.field551.length == 1) {
            return this.method729(0, arg0, -8410);
        } else if (!this.method739(arg0, -1049)) {
            return false;
        } else if (this.field1517.field551[arg0] == 1) {
            return this.method729(arg0, 0, -8410);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "(I)V", line = 813)
    public final void method748(int arg0) {
        if (this.field1529 != null) {
            for (int var2 = 0; var2 < this.field1529.length; var2++) {
                this.field1529[var2] = null;
            }
        }
        if (arg0 != 0) {
            this.method749(false, true, (byte) -49);
        }
        field1536++;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(ZZB)V", line = 834)
    public final void method749(boolean arg0, boolean arg1, byte arg2) {
        field1515++;
        if (!this.method741((byte) -103)) {
            return;
        }
        if (arg0) {
            this.field1517.field568 = null;
            this.field1517.field564 = null;
        }
        if (arg1) {
            this.field1517.field560 = null;
            this.field1517.field562 = null;
        }
        if (arg2 > -1) {
            field1534 = 60;
        }
    }

    @OriginalMember(owner = "client!mg", name = "e", descriptor = "(II)Z", line = 861)
    public final boolean method750(int arg0, int arg1) {
        field1510++;
        if (!this.method739(arg0, -1049)) {
            return false;
        } else if (this.field1518[arg0] == null) {
            this.method728(90, arg0);
            if (arg1 <= 24) {
                this.field1518 = null;
            }
            return this.field1518[arg0] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!mg", name = "f", descriptor = "(II)I", line = 886)
    private final int method751(int arg0, int arg1) {
        field1527++;
        if (this.method739(arg0, -1049)) {
            if (arg1 != -5762) {
                field1534 = 124;
            }
            return this.field1518[arg0] == null ? this.field1514.method2670(arg0, (byte) 87) : 100;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)[B", line = 909)
    public final byte[] method752(String arg0, String arg1, int arg2) {
        field1531++;
        if (!this.method741((byte) -103)) {
            return null;
        }
        String var4 = arg0.toLowerCase();
        if (arg2 <= 117) {
            this.method742(113, 17);
        }
        String var5 = arg1.toLowerCase();
        int var6 = this.field1517.field560.method1097((byte) 83, class371.method2227(0, var4));
        if (this.method739(var6, -1049)) {
            int var7 = this.field1517.field568[var6].method1097((byte) 83, class371.method2227(0, var5));
            return this.method727(var7, var6, -71);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!mg", name = "g", descriptor = "(II)I", line = 934)
    public final int method753(int arg0, int arg1) {
        field1523++;
        if (arg1 > -53) {
            return -58;
        } else if (this.method739(arg0, -1049)) {
            return this.field1517.field551[arg0];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(IB)[I", line = 951)
    public final int[] method754(int arg0, byte arg1) {
        field1526++;
        if (arg1 != 82) {
            this.field1517 = null;
        }
        if (!this.method739(arg0, arg1 - 1131)) {
            return null;
        }
        int[] var3 = this.field1517.field556[arg0];
        if (var3 == null) {
            var3 = new int[this.field1517.field563[arg0]];
            int var4 = 0;
            while (var4 < var3.length) {
                var3[var4] = var4++;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!mg", name = "h", descriptor = "(II)V", line = 986)
    public final void method755(int arg0, int arg1) {
        field1539++;
        if (!this.method739(arg1, -1049)) {
            return;
        }
        if (this.field1529 != null) {
            this.field1529[arg1] = null;
        }
        if (arg0 != -1) {
            this.field1517 = null;
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(Ljava/lang/String;B)V", line = 1018)
    public final void method756(String arg0, byte arg1) {
        field1533++;
        if (this.method741((byte) -103)) {
            String var3 = arg0.toLowerCase();
            int var4 = 54 % ((-arg1 - 32) / 44);
            int var5 = this.field1517.field560.method1097((byte) 83, class371.method2227(0, var3));
            this.method745(100, var5);
        }
    }
}
