import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class127 {

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "I")
    public int field1435;

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "[B")
    private byte[] field1434;

    @OriginalMember(owner = "client!hc", name = "s", descriptor = "Lqo;")
    public static class21 field1450 = new class21();

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "I")
    public static int field1433;

    @OriginalMember(owner = "client!hc", name = "f", descriptor = "I")
    public static int field1437;

    @OriginalMember(owner = "client!hc", name = "g", descriptor = "I")
    public static int field1438;

    @OriginalMember(owner = "client!hc", name = "l", descriptor = "I")
    public int field1443;

    @OriginalMember(owner = "client!hc", name = "m", descriptor = "I")
    public int field1444;

    @OriginalMember(owner = "client!hc", name = "p", descriptor = "I")
    public int field1447;

    @OriginalMember(owner = "client!hc", name = "u", descriptor = "I")
    public static int field1452;

    @OriginalMember(owner = "client!hc", name = "v", descriptor = "I")
    public static int field1453;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "Ldr;")
    public class657 field1432;

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "[I")
    public int[] field1436;

    @OriginalMember(owner = "client!hc", name = "j", descriptor = "[I")
    public int[] field1441;

    @OriginalMember(owner = "client!hc", name = "k", descriptor = "[I")
    public int[] field1442;

    @OriginalMember(owner = "client!hc", name = "n", descriptor = "[I")
    public int[] field1445;

    @OriginalMember(owner = "client!hc", name = "r", descriptor = "[I")
    public int[] field1449;

    @OriginalMember(owner = "client!hc", name = "t", descriptor = "[I")
    public int[] field1451;

    @OriginalMember(owner = "client!hc", name = "o", descriptor = "[Ldr;")
    public class657[] field1446;

    @OriginalMember(owner = "client!hc", name = "q", descriptor = "[[B")
    public byte[][] field1448;

    @OriginalMember(owner = "client!hc", name = "h", descriptor = "[[I")
    public int[][] field1439;

    @OriginalMember(owner = "client!hc", name = "i", descriptor = "[[I")
    public int[][] field1440;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)V", line = 4)
    public static void method728(int arg0) {
        if (arg0 != 0) {
            field1450 = null;
        }
        field1450 = null;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IZ)V", line = 25)
    public static final void method729(int arg0, boolean arg1) {
        field1453++;
        class353.field4629 = new int[arg0];
        class319.field4129 = new int[arg0];
        if (!arg1) {
            class406.field5417 = new int[arg0];
            class247.field3181 = new int[arg0];
            class609.field8603 = new int[arg0];
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(II)V", line = 45)
    public static final void method730(int arg0, int arg1) {
        field1438++;
        class530 var2 = class242.method1402(-88, 14, arg0);
        var2.method3027((byte) -110);
        if (arg1 != 85) {
            method730(83, 8);
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(B[B)V", line = 59)
    private final void method731(byte arg0, byte[] arg1) {
        field1452++;
        class452 var3 = new class452(class149.method817(9, arg1));
        int var4 = var3.method2541(51);
        if (var4 < 5 || var4 > 6) {
            throw new RuntimeException();
        }
        if (var4 >= 6) {
            this.field1444 = var3.method2575((byte) -48);
        } else {
            this.field1444 = 0;
        }
        int var5 = var3.method2541(59);
        boolean var6 = (var5 & 0x1) != 0;
        boolean var7 = (var5 & 0x2) != 0;
        this.field1443 = var3.method2574(-1758460248);
        int var8 = 0;
        int var9 = -1;
        this.field1445 = new int[this.field1443];
        for (int var10 = 0; var10 < this.field1443; var10++) {
            this.field1445[var10] = var8 += var3.method2574(-1758460248);
            if (var9 < this.field1445[var10]) {
                var9 = this.field1445[var10];
            }
        }
        this.field1447 = var9 + 1;
        this.field1441 = new int[this.field1447];
        this.field1451 = new int[this.field1447];
        this.field1449 = new int[this.field1447];
        this.field1436 = new int[this.field1447];
        if (var7) {
            this.field1448 = new byte[this.field1447][];
        }
        this.field1439 = new int[this.field1447][];
        if (var6) {
            this.field1442 = new int[this.field1447];
            for (int var11 = 0; var11 < this.field1447; var11++) {
                this.field1442[var11] = -1;
            }
            for (int var12 = 0; var12 < this.field1443; var12++) {
                this.field1442[this.field1445[var12]] = var3.method2575((byte) -48);
            }
            this.field1432 = new class657(this.field1442);
        }
        for (int var13 = 0; var13 < this.field1443; var13++) {
            this.field1449[this.field1445[var13]] = var3.method2575((byte) -48);
        }
        if (var7) {
            for (int var14 = 0; var14 < this.field1443; var14++) {
                byte[] var15 = new byte[64];
                var3.method2552(0, 4, 64, var15);
                this.field1448[this.field1445[var14]] = var15;
            }
        }
        for (int var16 = 0; var16 < this.field1443; var16++) {
            this.field1451[this.field1445[var16]] = var3.method2575((byte) -48);
        }
        if (arg0 >= -57) {
            return;
        }
        for (int var17 = 0; var17 < this.field1443; var17++) {
            this.field1441[this.field1445[var17]] = var3.method2574(-1758460248);
        }
        for (int var18 = 0; var18 < this.field1443; var18++) {
            int var25 = this.field1445[var18];
            int var26 = 0;
            int var27 = this.field1441[var25];
            int var28 = -1;
            this.field1439[var25] = new int[var27];
            for (int var29 = 0; var29 < var27; var29++) {
                int var30 = this.field1439[var25][var29] = var26 += var3.method2574(-1758460248);
                if (var30 > var28) {
                    var28 = var30;
                }
            }
            this.field1436[var25] = var28 + 1;
            if (var28 + 1 == var27) {
                this.field1439[var25] = null;
            }
        }
        if (!var6) {
            return;
        }
        this.field1440 = new int[var9 + 1][];
        this.field1446 = new class657[var9 + 1];
        for (int var19 = 0; var19 < this.field1443; var19++) {
            int var20 = this.field1445[var19];
            int var21 = this.field1441[var20];
            this.field1440[var20] = new int[this.field1436[var20]];
            for (int var22 = 0; var22 < this.field1436[var20]; var22++) {
                this.field1440[var20][var22] = -1;
            }
            for (int var23 = 0; var23 < var21; var23++) {
                int var24;
                if (this.field1439[var20] == null) {
                    var24 = var23;
                } else {
                    var24 = this.field1439[var20][var23];
                }
                this.field1440[var20][var24] = var3.method2575((byte) -48);
            }
            this.field1446[var20] = new class657(this.field1440[var20]);
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIB)Z", line = 255)
    public static final boolean method732(int arg0, int arg1, byte arg2) {
        if (arg2 >= -43) {
            return false;
        } else {
            field1437++;
            return (class80.method517(-116, arg0, arg1) | class451.method2505((byte) -103, arg0, arg1) | class631.method3533(-60, arg0, arg1)) & class85.method535(arg1, -24976, arg0);
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(B)V", line = 274)
    public static final void method733(byte arg0) {
        if (class24.field298 != 0) {
            class154.field1735 -= class24.field298 * 5;
            if (class37.field413 <= class154.field1735) {
                class154.field1735 = class37.field413 - 1;
            }
            class24.field298 = 0;
            if (class154.field1735 < 0) {
                class154.field1735 = 0;
            }
        }
        if (class448.field6149 < 102) {
            class448.field6149 += 6;
        }
        field1433++;
        if (arg0 >= -14) {
            method732(-73, 92, (byte) -114);
        }
        for (int var1 = 0; var1 < class411.field5452; var1++) {
            class597 var2 = class420.field5582[var1];
            int var3 = var2.method38(19888);
            char var4 = var2.method41(117);
            int var5 = var2.method39(9576);
            if (var3 == 84) {
                class191.method1105(false, -125);
            }
            if (var3 == 80) {
                class191.method1105(true, 103);
            } else if (var3 == 66 && (var5 & 0x4) != 0) {
                if (class423.field5637 != null) {
                    String var6 = "";
                    for (int var7 = class535.field7652.length - 1; var7 >= 0; var7--) {
                        if (class535.field7652[var7] != null && class535.field7652[var7].length() > 0) {
                            var6 = var6 + class535.field7652[var7] + '\n';
                        }
                    }
                    class423.field5637.setContents(new StringSelection(var6), null);
                }
            } else if (var3 == 67 && (var5 & 0x4) != 0) {
                if (class423.field5637 != null) {
                    Transferable var8 = class423.field5637.getContents(null);
                    if (var8 != null) {
                        try {
                            String var9 = (String) var8.getTransferData(DataFlavor.stringFlavor);
                            if (var9 != null) {
                                String[] var10 = class107.method674(var9, 1, '\n');
                                if (var10.length <= 1) {
                                    class511.field7325 = class511.field7325 + var9;
                                } else {
                                    for (int var11 = 0; var11 < var10.length; var11++) {
                                        class511.field7325 = var10[var11];
                                        class191.method1105(false, 22);
                                    }
                                }
                            }
                        } catch (Exception var12) {
                        }
                    }
                }
            } else if (var3 == 85 && class665.field9460 > 0) {
                class511.field7325 = class511.field7325.substring(0, class665.field9460 - 1) + class511.field7325.substring(class665.field9460);
                class665.field9460--;
            } else if (var3 == 101 && class665.field9460 < class511.field7325.length()) {
                class511.field7325 = class511.field7325.substring(0, class665.field9460) + class511.field7325.substring(class665.field9460 + 1);
            } else if (var3 == 96 && class665.field9460 > 0) {
                class665.field9460--;
            } else if (var3 == 97 && class665.field9460 < class511.field7325.length()) {
                class665.field9460++;
            } else if (var3 == 102) {
                class665.field9460 = 0;
            } else if (var3 == 103) {
                class665.field9460 = class511.field7325.length();
            } else if (var3 == 104 && class535.field7652.length > class526.field7525) {
                class526.field7525++;
                class605.method3374(0);
                class665.field9460 = class511.field7325.length();
            } else if (var3 == 105 && class526.field7525 > 0) {
                class526.field7525--;
                class605.method3374(0);
                class665.field9460 = class511.field7325.length();
            } else if (class671.method3762(var4, 0) || var4 == ':' || var4 == ',' || var4 == ' ' || var4 == '_' || var4 == '-' || var4 == '+' || var4 == '[' || var4 == ']') {
                class511.field7325 = class511.field7325.substring(0, class665.field9460) + class420.field5582[var1].method41(120) + class511.field7325.substring(class665.field9460);
                class665.field9460++;
            }
        }
        class627.field8903 = 0;
        class411.field5452 = 0;
        class14.method66(12287);
    }

    @OriginalMember(owner = "client!hc", name = "<init>", descriptor = "([BI[B)V", line = 443)
    public class127(byte[] arg0, int arg1, byte[] arg2) {
        this.field1435 = class601.method3358(1, arg0, arg0.length);
        if (this.field1435 != arg1) {
            throw new RuntimeException();
        }
        if (arg2 != null) {
            if (arg2.length != 64) {
                throw new RuntimeException();
            }
            this.field1434 = class235.method1364(arg0.length, arg0, (byte) 14, 0);
            for (int var4 = 0; var4 < 64; var4++) {
                if (this.field1434[var4] != arg2[var4]) {
                    throw new RuntimeException();
                }
            }
        }
        this.method731((byte) -77, arg0);
    }
}
