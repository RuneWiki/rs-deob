import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class92 extends class155 {

    @OriginalMember(owner = "client!fa", name = "K", descriptor = "Z")
    public boolean field1479 = true;

    @OriginalMember(owner = "client!fa", name = "G", descriptor = "[Ldk;")
    public static class207[] field1475 = new class207[2048];

    @OriginalMember(owner = "client!fa", name = "N", descriptor = "I")
    public static int field1482 = 0;

    @OriginalMember(owner = "client!fa", name = "U", descriptor = "Lue;")
    public static class91 field1488 = new class91(5000);

    @OriginalMember(owner = "client!fa", name = "X", descriptor = "S")
    public static short field1491 = 1;

    @OriginalMember(owner = "client!fa", name = "V", descriptor = "Z")
    public static boolean field1489 = false;

    @OriginalMember(owner = "client!fa", name = "D", descriptor = "I")
    public static int field1472;

    @OriginalMember(owner = "client!fa", name = "F", descriptor = "I")
    public static int field1474;

    @OriginalMember(owner = "client!fa", name = "H", descriptor = "I")
    public static int field1476;

    @OriginalMember(owner = "client!fa", name = "L", descriptor = "I")
    public static int field1480;

    @OriginalMember(owner = "client!fa", name = "M", descriptor = "I")
    public static int field1481;

    @OriginalMember(owner = "client!fa", name = "O", descriptor = "I")
    public static int field1483;

    @OriginalMember(owner = "client!fa", name = "Q", descriptor = "I")
    public static int field1484;

    @OriginalMember(owner = "client!fa", name = "S", descriptor = "I")
    public static int field1486;

    @OriginalMember(owner = "client!fa", name = "T", descriptor = "I")
    public static int field1487;

    @OriginalMember(owner = "client!fa", name = "W", descriptor = "I")
    public static int field1490;

    @OriginalMember(owner = "client!fa", name = "Y", descriptor = "I")
    public static int field1492;

    @OriginalMember(owner = "client!fa", name = "Z", descriptor = "I")
    public static int field1493;

    @OriginalMember(owner = "client!fa", name = "J", descriptor = "[I")
    private int[] field1478;

    @OriginalMember(owner = "client!fa", name = "R", descriptor = "[I")
    public int[] field1485;

    @OriginalMember(owner = "client!fa", name = "I", descriptor = "[Ljava/lang/String;")
    private String[] field1477;

    @OriginalMember(owner = "client!fa", name = "E", descriptor = "[[I")
    private int[][] field1473;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(BILhc;)V")
    private final void method690(byte arg0, int arg1, class53 arg2) {
        if (arg0 >= -8) {
            method693(-4);
        }
        field1492++;
        if (arg1 == 1) {
            this.field1477 = class267.method1835((byte) 114, arg2.method326(44), '<');
        } else if (arg1 == 2) {
            int var8 = arg2.method366(-16505);
            this.field1485 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field1485[var9] = arg2.method331(-89);
            }
        } else if (arg1 == 3) {
            int var4 = arg2.method366(-16505);
            this.field1478 = new int[var4];
            this.field1473 = new int[var4][];
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg2.method331(-34);
                this.field1478[var5] = var6;
                this.field1473[var5] = new int[class36.field464[var6]];
                for (int var7 = 0; var7 < class36.field464[var6]; var7++) {
                    this.field1473[var5][var7] = arg2.method331(-97);
                }
            }
            return;
        } else if (arg1 == 4) {
            this.field1479 = false;
            return;
        }
    }

    @OriginalMember(owner = "client!fa", name = "e", descriptor = "(I)V")
    public final void method691(int arg0) {
        if (arg0 > -52) {
            this.method697(44, (class53) null);
        }
        field1493++;
        if (this.field1485 != null) {
            for (int var2 = 0; var2 < this.field1485.length; var2++) {
                this.field1485[var2] = class200.method1408(this.field1485[var2], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(BLlc;)V")
    public static final void method692(byte arg0, class270 arg1) {
        class135.field2204 = arg1;
        field1472++;
        if (arg0 >= -1) {
            field1482 = -9;
        }
    }

    @OriginalMember(owner = "client!fa", name = "f", descriptor = "(I)V")
    public static void method693(int arg0) {
        if (arg0 == -1) {
            field1475 = null;
            field1488 = null;
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(BC)Z")
    public static final boolean method694(byte arg0, char arg1) {
        if (arg0 > -103) {
            return false;
        } else {
            field1486++;
            return arg1 >= '0' && arg1 <= '9' || arg1 >= 'A' && arg1 <= 'Z' || arg1 >= 'a' && arg1 <= 'z';
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(II)I")
    public final int method695(int arg0, int arg1) {
        int var3 = -26 / ((-arg0 - 31) / 43);
        field1483++;
        return this.field1478 == null || arg1 < 0 || this.field1478.length < arg1 ? -1 : this.field1478[arg1];
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(III)I")
    public final int method696(int arg0, int arg1, int arg2) {
        field1481++;
        if (this.field1478 == null || arg1 < 0 || arg1 > this.field1478.length) {
            return -1;
        } else {
            if (arg2 != 0) {
                this.method697(36, (class53) null);
            }
            return this.field1473[arg1] == null || arg0 < 0 || arg0 > this.field1473[arg1].length ? -1 : this.field1473[arg1][arg0];
        }
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(ILhc;)Ljava/lang/String;")
    public final String method697(int arg0, class53 arg1) {
        field1487++;
        StringBuffer var3 = new StringBuffer(80);
        if (arg0 != 5542) {
            method700(125, -47, false);
        }
        if (this.field1478 != null) {
            for (int var4 = 0; var4 < this.field1478.length; var4++) {
                var3.append(this.field1477[var4]);
                var3.append(class294.method1999(arg1.method378(class146.field2352[this.field1478[var4]], true), this.field1478[var4], this.field1473[var4], arg0 - 5543));
            }
        }
        var3.append(this.field1477[this.field1477.length - 1]);
        return var3.toString();
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(B)Ljava/lang/String;")
    public final String method698(byte arg0) {
        field1474++;
        StringBuffer var2 = new StringBuffer(80);
        if (this.field1477 == null) {
            return "";
        }
        var2.append(this.field1477[0]);
        if (arg0 <= 55) {
            this.field1479 = false;
        }
        for (int var3 = 1; var3 < this.field1477.length; var3++) {
            var2.append("...");
            var2.append(this.field1477[var3]);
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lhc;Z[I)V")
    public final void method699(class53 arg0, boolean arg1, int[] arg2) {
        field1490++;
        if (arg1 || this.field1478 == null) {
            return;
        }
        for (int var4 = 0; var4 < this.field1478.length; var4++) {
            if (arg2.length <= var4) {
                return;
            }
            int var5 = class274.field4435[this.method695(-105, var4)];
            if (var5 > 0) {
                arg0.method356(var5, 19805, (long) arg2[var4]);
            }
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIZ)V")
    public static final void method700(int arg0, int arg1, boolean arg2) {
        field1480++;
        if (class206.field3032 != arg0) {
            class138.field2254 = new int[arg0];
            for (int var3 = 0; var3 < arg0; var3++) {
                class138.field2254[var3] = (var3 << 12) / arg0;
            }
            class206.field3032 = arg0;
            class181.field2722 = arg0 - 1;
            class218.field3188 = arg0 * 32;
        }
        if (arg2) {
            method700(96, -89, false);
        }
        if (class123.field2045 == arg1) {
            return;
        }
        if (class206.field3032 == arg1) {
            class140.field2272 = class138.field2254;
        } else {
            class140.field2272 = new int[arg1];
            for (int var4 = 0; var4 < arg1; var4++) {
                class140.field2272[var4] = (var4 << 12) / arg1;
            }
        }
        class32.field406 = arg1 - 1;
        class123.field2045 = arg1;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lhc;I)V")
    public final void method701(class53 arg0, int arg1) {
        field1476++;
        while (true) {
            int var3 = arg0.method366(-16505);
            if (var3 == 0) {
                if (arg1 <= 124) {
                    field1489 = true;
                    return;
                } else {
                    return;
                }
            }
            this.method690((byte) -24, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!fa", name = "g", descriptor = "(I)I")
    public final int method702(int arg0) {
        if (arg0 != 0) {
            field1475 = null;
        }
        field1484++;
        return this.field1478 == null ? 0 : this.field1478.length;
    }
}
