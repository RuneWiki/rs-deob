import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public class class6 extends class135 {

    @OriginalMember(owner = "client!wj", name = "B", descriptor = "Z")
    public boolean field81 = true;

    @OriginalMember(owner = "client!wj", name = "L", descriptor = "I")
    public static int field90 = 20;

    @OriginalMember(owner = "client!wj", name = "O", descriptor = "[I")
    public static int[] field93 = new int[50];

    @OriginalMember(owner = "client!wj", name = "K", descriptor = "Lrh;")
    public static class46 field89 = new class46();

    @OriginalMember(owner = "client!wj", name = "W", descriptor = "I")
    public static int field101 = 0;

    @OriginalMember(owner = "client!wj", name = "V", descriptor = "I")
    public static int field100;

    @OriginalMember(owner = "client!wj", name = "y", descriptor = "I")
    public static int field78;

    @OriginalMember(owner = "client!wj", name = "C", descriptor = "I")
    public static int field82;

    @OriginalMember(owner = "client!wj", name = "D", descriptor = "I")
    public static int field83;

    @OriginalMember(owner = "client!wj", name = "E", descriptor = "I")
    public static int field84;

    @OriginalMember(owner = "client!wj", name = "F", descriptor = "I")
    public static int field85;

    @OriginalMember(owner = "client!wj", name = "H", descriptor = "I")
    public static int field87;

    @OriginalMember(owner = "client!wj", name = "M", descriptor = "I")
    public static int field91;

    @OriginalMember(owner = "client!wj", name = "N", descriptor = "I")
    public static int field92;

    @OriginalMember(owner = "client!wj", name = "P", descriptor = "I")
    public static int field94;

    @OriginalMember(owner = "client!wj", name = "Q", descriptor = "I")
    public static int field95;

    @OriginalMember(owner = "client!wj", name = "S", descriptor = "I")
    public static int field97;

    @OriginalMember(owner = "client!wj", name = "U", descriptor = "I")
    public static int field99;

    @OriginalMember(owner = "client!wj", name = "z", descriptor = "[I")
    private int[] field79;

    @OriginalMember(owner = "client!wj", name = "A", descriptor = "[I")
    public static int[] field80;

    @OriginalMember(owner = "client!wj", name = "G", descriptor = "[I")
    public static int[] field86;

    @OriginalMember(owner = "client!wj", name = "T", descriptor = "[I")
    public int[] field98;

    @OriginalMember(owner = "client!wj", name = "R", descriptor = "[Ljava/lang/String;")
    private String[] field96;

    @OriginalMember(owner = "client!wj", name = "I", descriptor = "[[I")
    private int[][] field88;

    @OriginalMember(owner = "client!wj", name = "d", descriptor = "(I)V")
    public static final void method30(int arg0) {
        for (int var1 = arg0; var1 < class209.field3261; var1++) {
            class5 var2 = class254.method1711(var1, false);
            if (var2 != null && var2.field70 == 0) {
                class211.field3295[var1] = 0;
                class258.field4166[var1] = 0;
            }
        }
        field83++;
        class202.field3168 = new class100(16);
    }

    @OriginalMember(owner = "client!wj", name = "e", descriptor = "(I)V")
    public static final void method31(int arg0) {
        class13.field165.method892(0, (byte) -127);
        class96.field1490++;
        if (arg0 <= 109) {
            method31(112);
        }
        class13.field165.method206(-5061, 0L);
        field91++;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(ZII[B)Ljava/lang/String;")
    public static final String method32(boolean arg0, int arg1, int arg2, byte[] arg3) {
        if (arg0) {
            return null;
        }
        field78++;
        char[] var4 = new char[arg1];
        int var5 = 0;
        for (int var6 = 0; var6 < arg1; var6++) {
            int var7 = arg3[arg2 + var6] & 0xFF;
            if (var7 != 0) {
                if (var7 >= 128 && var7 < 160) {
                    char var8 = class46.field581[var7 - 128];
                    if (var8 == '\u0000') {
                        continue;
                    }
                    var7 = var8;
                }
                var4[var5++] = (char) var7;
            }
        }
        return new String(var4, 0, var5);
    }

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "(II)I")
    public final int method33(int arg0, int arg1) {
        if (arg0 == 0) {
            field100++;
            return this.field79 == null || arg1 < 0 || arg1 > this.field79.length ? -1 : this.field79[arg1];
        } else {
            return -78;
        }
    }

    @OriginalMember(owner = "client!wj", name = "f", descriptor = "(I)V")
    public static void method34(int arg0) {
        field89 = null;
        field86 = null;
        int var1 = 78 % ((2 - arg0) / 60);
        field93 = null;
        field80 = null;
    }

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "(B)I")
    public final int method35(byte arg0) {
        field84++;
        if (this.field79 == null) {
            return 0;
        } else {
            if (arg0 > -34) {
                this.field98 = null;
            }
            return this.field79.length;
        }
    }

    @OriginalMember(owner = "client!wj", name = "g", descriptor = "(I)V")
    public final void method36(int arg0) {
        if (arg0 != -1) {
            this.method39((byte) -108, (class25) null, 21);
        }
        if (this.field98 != null) {
            for (int var2 = 0; var2 < this.field98.length; var2++) {
                this.field98[var2] = class120.method787(this.field98[var2], 32768);
            }
        }
        field87++;
    }

    @OriginalMember(owner = "client!wj", name = "c", descriptor = "(B)Ljava/lang/String;")
    public final String method37(byte arg0) {
        if (arg0 != 5) {
            return null;
        }
        field97++;
        StringBuffer var2 = new StringBuffer(80);
        if (this.field96 == null) {
            return "";
        }
        var2.append(this.field96[0]);
        for (int var3 = 1; var3 < this.field96.length; var3++) {
            var2.append("...");
            var2.append(this.field96[var3]);
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!wj", name = "h", descriptor = "(I)V")
    public static final void method38(int arg0) {
        field99++;
        for (int var1 = 0; var1 < class87.field1369; var1++) {
            int var10002 = class216.field3520[var1]--;
            if (class216.field3520[var1] >= -10) {
                class14 var3 = class71.field1000[var1];
                if (var3 == null) {
                    var3 = class14.method100(class49.field633, class100.field1556[var1], 0);
                    if (var3 == null) {
                        continue;
                    }
                    class216.field3520[var1] += var3.method101();
                    class71.field1000[var1] = var3;
                }
                if (class216.field3520[var1] < 0) {
                    int var10;
                    if (field93[var1] == 0) {
                        var10 = class76.field1074;
                    } else {
                        int var4 = field93[var1] >> 16 & 0xFF;
                        int var5 = (field93[var1] & 0xFF) * 128;
                        int var6 = var4 * 128 + 64 - class149.field2227.field1226;
                        if (var6 < 0) {
                            var6 = -var6;
                        }
                        int var7 = (field93[var1] & 0xFF99) >> 8;
                        int var8 = var7 * 128 + 64 - class149.field2227.field1273;
                        if (var8 < 0) {
                            var8 = -var8;
                        }
                        int var9 = var8 + var6 - 128;
                        if (var9 > var5) {
                            class216.field3520[var1] = -100;
                            continue;
                        }
                        if (var9 < 0) {
                            var9 = 0;
                        }
                        var10 = (var5 - var9) * class60.field841 / var5;
                    }
                    if (var10 > 0) {
                        class119 var11 = var3.method99().method783(class26.field368);
                        class255 var12 = class255.method1747(var11, 100, var10);
                        var12.method1744(class3.field29[var1] - 1);
                        class130.field1907.method709(var12);
                    }
                    class216.field3520[var1] = -100;
                }
            } else {
                class87.field1369--;
                for (int var2 = var1; var2 < class87.field1369; var2++) {
                    class100.field1556[var2] = class100.field1556[var2 + 1];
                    class71.field1000[var2] = class71.field1000[var2 + 1];
                    class3.field29[var2] = class3.field29[var2 + 1];
                    class216.field3520[var2] = class216.field3520[var2 + 1];
                    field93[var2] = field93[var2 + 1];
                }
                var1--;
            }
        }
        if (arg0 != 255) {
            method38(103);
        }
        if (class284.field4509 && !class37.method290(arg0 - 186)) {
            if (class219.field3553 != 0 && class37.field488 != -1) {
                class184.method1282(class37.field488, class219.field3553, 0, false, 118, class98.field1509);
            }
            class284.field4509 = false;
        } else if (class219.field3553 != 0 && class37.field488 != -1 && !class37.method290(22)) {
            class13.field165.method892(129, (byte) -65);
            class98.field1522++;
            class13.field165.method166(class37.field488, -3);
            class37.field488 = -1;
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(BLlj;I)V")
    private final void method39(byte arg0, class25 arg1, int arg2) {
        if (arg0 != 18) {
            this.field98 = null;
        }
        field92++;
        if (arg2 == 1) {
            this.field96 = class204.method1396(arg1.method189(false), '<', (byte) 56);
        } else if (arg2 == 2) {
            int var8 = arg1.method201(arg0 + 237);
            this.field98 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field98[var9] = arg1.method190(-3);
            }
        } else if (arg2 == 3) {
            int var4 = arg1.method201(255);
            this.field88 = new int[var4][];
            this.field79 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg1.method190(-3);
                this.field79[var5] = var6;
                this.field88[var5] = new int[class167.field2572[var6]];
                for (int var7 = 0; var7 < class167.field2572[var6]; var7++) {
                    this.field88[var5][var7] = arg1.method190(arg0 - 21);
                }
            }
        } else if (arg2 == 4) {
            this.field81 = false;
            return;
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(ILlj;)Ljava/lang/String;")
    public final String method40(int arg0, class25 arg1) {
        if (arg0 != 0) {
            return null;
        }
        field82++;
        StringBuffer var3 = new StringBuffer(80);
        if (this.field79 != null) {
            for (int var4 = 0; var4 < this.field79.length; var4++) {
                var3.append(this.field96[var4]);
                var3.append(class200.method1382(arg1.method205(class175.field2743[this.field79[var4]], 125), this.field79[var4], -27449, this.field88[var4]));
            }
        }
        var3.append(this.field96[this.field96.length - 1]);
        return var3.toString();
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(BLlj;[I)V")
    public final void method41(byte arg0, class25 arg1, int[] arg2) {
        field95++;
        if (this.field79 == null) {
            return;
        }
        int var4 = -117 % ((arg0 + 13) / 46);
        for (int var5 = 0; var5 < this.field79.length; var5++) {
            if (var5 >= arg2.length) {
                return;
            }
            int var6 = class23.field288[this.method33(0, var5)];
            if (var6 > 0) {
                arg1.method186((byte) 91, (long) arg2[var5], var6);
            }
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(BII)I")
    public final int method42(byte arg0, int arg1, int arg2) {
        field85++;
        if (this.field79 == null || arg2 < 0 || arg2 > this.field79.length) {
            return -1;
        } else {
            if (arg0 < 9) {
                method30(-120);
            }
            return this.field88[arg2] == null || arg1 < 0 || arg1 > this.field88[arg2].length ? -1 : this.field88[arg2][arg1];
        }
    }

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "(ILlj;)V")
    public final void method43(int arg0, class25 arg1) {
        field94++;
        while (true) {
            int var3 = arg1.method201(255);
            if (var3 == 0) {
                if (arg0 == -1) {
                    return;
                } else {
                    this.method35((byte) -113);
                    return;
                }
            }
            this.method39((byte) 18, arg1, var3);
        }
    }
}
