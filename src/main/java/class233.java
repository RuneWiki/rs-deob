import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qn")
public class class233 extends class305 {

    @OriginalMember(owner = "client!qn", name = "G", descriptor = "Z")
    public boolean field3645 = true;

    @OriginalMember(owner = "client!qn", name = "L", descriptor = "I")
    public static int field3650 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!qn", name = "D", descriptor = "Lth;")
    public static class55 field3643 = new class55();

    @OriginalMember(owner = "client!qn", name = "V", descriptor = "F")
    public static float field3659;

    @OriginalMember(owner = "client!qn", name = "F", descriptor = "I")
    public static int field3644;

    @OriginalMember(owner = "client!qn", name = "H", descriptor = "I")
    public static int field3646;

    @OriginalMember(owner = "client!qn", name = "J", descriptor = "I")
    public static int field3648;

    @OriginalMember(owner = "client!qn", name = "K", descriptor = "I")
    public static int field3649;

    @OriginalMember(owner = "client!qn", name = "M", descriptor = "I")
    public static int field3651;

    @OriginalMember(owner = "client!qn", name = "N", descriptor = "I")
    public static int field3652;

    @OriginalMember(owner = "client!qn", name = "O", descriptor = "I")
    public static int field3653;

    @OriginalMember(owner = "client!qn", name = "P", descriptor = "I")
    public static int field3654;

    @OriginalMember(owner = "client!qn", name = "R", descriptor = "I")
    public static int field3656;

    @OriginalMember(owner = "client!qn", name = "S", descriptor = "I")
    public static int field3657;

    @OriginalMember(owner = "client!qn", name = "U", descriptor = "I")
    public static int field3658;

    @OriginalMember(owner = "client!qn", name = "X", descriptor = "I")
    public static int field3661;

    @OriginalMember(owner = "client!qn", name = "Y", descriptor = "I")
    public static int field3662;

    @OriginalMember(owner = "client!qn", name = "ab", descriptor = "I")
    public static int field3664;

    @OriginalMember(owner = "client!qn", name = "I", descriptor = "[I")
    private int[] field3647;

    @OriginalMember(owner = "client!qn", name = "Q", descriptor = "[I")
    public int[] field3655;

    @OriginalMember(owner = "client!qn", name = "W", descriptor = "[Ljava/lang/String;")
    private String[] field3660;

    @OriginalMember(owner = "client!qn", name = "Z", descriptor = "[[I")
    private int[][] field3663;

    @OriginalMember(owner = "client!qn", name = "d", descriptor = "(I)V", line = 6)
    public static void method1537(int arg0) {
        field3643 = null;
        if (arg0 != 4) {
            field3650 = 125;
        }
    }

    @OriginalMember(owner = "client!qn", name = "d", descriptor = "(B)Ljava/lang/String;", line = 18)
    public final String method1538(byte arg0) {
        field3652++;
        StringBuffer var2 = new StringBuffer(80);
        if (this.field3660 == null) {
            return "";
        }
        var2.append(this.field3660[0]);
        int var3 = 100 % ((9 - arg0) / 56);
        for (int var4 = 1; var4 < this.field3660.length; var4++) {
            var2.append("...");
            var2.append(this.field3660[var4]);
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!qn", name = "e", descriptor = "(I)I", line = 50)
    public final int method1539(int arg0) {
        field3653++;
        if (this.field3647 == null) {
            return 0;
        } else if (arg0 == 80) {
            return this.field3647.length;
        } else {
            return 84;
        }
    }

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "(IB)I", line = 66)
    public static final int method1540(int arg0, byte arg1) {
        field3657++;
        return arg1 <= 45 ? 83 : arg0 >>> 8;
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(Lag;I)Ljava/lang/String;", line = 80)
    public final String method1541(class202 arg0, int arg1) {
        field3654++;
        StringBuffer var3 = new StringBuffer(arg1);
        if (this.field3647 != null) {
            for (int var4 = 0; var4 < this.field3647.length; var4++) {
                var3.append(this.field3660[var4]);
                var3.append(class133.method869(this.field3663[var4], this.field3647[var4], (byte) -106, arg0.method1291(class264.field4099[this.field3647[var4]], arg1 + 2901)));
            }
        }
        var3.append(this.field3660[this.field3660.length - 1]);
        return var3.toString();
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(III)I", line = 107)
    public final int method1542(int arg0, int arg1, int arg2) {
        field3661++;
        if (arg1 != -1) {
            this.method1544((byte) 68, -70);
        }
        if (this.field3647 == null || arg0 < 0 || this.field3647.length < arg0) {
            return -1;
        } else if (this.field3663[arg0] == null || arg2 < 0 || this.field3663[arg0].length < arg2) {
            return -1;
        } else {
            return this.field3663[arg0][arg2];
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(IILag;)V", line = 128)
    private final void method1543(int arg0, int arg1, class202 arg2) {
        if (arg1 != 26115) {
            field3659 = -0.689512F;
        }
        if (arg0 == 1) {
            this.field3660 = class211.method1428(1, arg2.method1307((byte) 102), '<');
        } else if (arg0 == 2) {
            int var8 = arg2.method1317((byte) -94);
            this.field3655 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field3655[var9] = arg2.method1315(14289);
            }
        } else if (arg0 == 3) {
            int var4 = arg2.method1317((byte) -115);
            this.field3647 = new int[var4];
            this.field3663 = new int[var4][];
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg2.method1315(14289);
                this.field3647[var5] = var6;
                this.field3663[var5] = new int[class177.field2862[var6]];
                for (int var7 = 0; var7 < class177.field2862[var6]; var7++) {
                    this.field3663[var5][var7] = arg2.method1315(14289);
                }
            }
        } else if (arg0 == 4) {
            this.field3645 = false;
        }
        field3651++;
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(BI)I", line = 193)
    public final int method1544(byte arg0, int arg1) {
        if (arg0 == 104) {
            field3656++;
            return this.field3647 == null || arg1 < 0 || arg1 > this.field3647.length ? -1 : this.field3647[arg1];
        } else {
            return -44;
        }
    }

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "(Lag;I)V", line = 220)
    public final void method1545(class202 arg0, int arg1) {
        field3644++;
        if (arg1 != 1006) {
            this.method1544((byte) 77, 106);
        }
        while (true) {
            int var3 = arg0.method1317((byte) -86);
            if (var3 == 0) {
                return;
            }
            this.method1543(var3, 26115, arg0);
        }
    }

    @OriginalMember(owner = "client!qn", name = "f", descriptor = "(I)V", line = 242)
    public static final void method1546(int arg0) {
        if (class46.field953 == null || class122.field2117 == null) {
            class122.field2117 = new int[256];
            class46.field953 = new int[256];
            for (int var1 = 0; var1 < 256; var1++) {
                double var2 = (double) var1 / 255.0D * 6.283185307179586D;
                class46.field953[var1] = (int) (Math.sin(var2) * 4096.0D);
                class122.field2117[var1] = (int) (Math.cos(var2) * 4096.0D);
            }
        }
        field3649++;
        if (arg0 != 17431) {
            method1537(-79);
        }
    }

    @OriginalMember(owner = "client!qn", name = "e", descriptor = "(B)V", line = 278)
    public final void method1547(byte arg0) {
        if (this.field3655 != null) {
            for (int var2 = 0; var2 < this.field3655.length; var2++) {
                this.field3655[var2] = class212.method1434(this.field3655[var2], 32768);
            }
        }
        if (arg0 <= -20) {
            field3658++;
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(BII)Lkl;", line = 304)
    public static final class68 method1548(byte arg0, int arg1, int arg2) {
        field3646++;
        int var3 = 65 % ((arg0 + 74) / 48);
        class68 var4 = class319.method2196(-1351736944, arg1);
        if (arg2 == -1) {
            return var4;
        } else if (var4 == null || var4.field1372 == null || arg2 >= var4.field1372.length) {
            return null;
        } else {
            return var4.field1372[arg2];
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "([IILag;)V", line = 322)
    public final void method1549(int[] arg0, int arg1, class202 arg2) {
        field3664++;
        if (this.field3647 == null) {
            return;
        }
        for (int var4 = 0; this.field3647.length > var4 && arg0.length > var4; var4++) {
            int var5 = class171.field2762[this.method1544((byte) 104, var4)];
            if (var5 > 0) {
                arg2.method1289(var5, (byte) -122, (long) arg0[var4]);
            }
        }
        if (arg1 != 80) {
            field3643 = (class55) null;
        }
    }

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "(III)Z", line = 348)
    public static final boolean method1550(int arg0, int arg1, int arg2) {
        field3648++;
        if (!class290.field4459) {
            return false;
        }
        int var3 = arg1 & 0xFFFF;
        int var4 = arg1 >> 16;
        if (class138.field2300[var4] == null || class138.field2300[var4][var3] == null) {
            return false;
        }
        class68 var5 = class138.field2300[var4][var3];
        if (arg0 == -1 && var5.field1358 == 0) {
            for (int var6 = 0; var6 < class48.field999; var6++) {
                if (class120.field2088[var6] == 7 || class120.field2088[var6] == 1006 || class120.field2088[var6] == 10 || class120.field2088[var6] == 30 || class120.field2088[var6] == 39) {
                    for (class68 var7 = class319.method2196(-1351736944, class255.field3988[var6]); var7 != null; var7 = class130.method859(false, var7)) {
                        if (var5.field1284 == var7.field1284) {
                            return true;
                        }
                    }
                }
            }
        } else {
            for (int var8 = 0; var8 < class48.field999; var8++) {
                if (class153.field2502[var8] == arg0 && class255.field3988[var8] == var5.field1284 && (class120.field2088[var8] == 7 || class120.field2088[var8] == 1006 || class120.field2088[var8] == 10 || class120.field2088[var8] == 30 || class120.field2088[var8] == 39)) {
                    return true;
                }
            }
        }
        if (arg2 != -32146) {
            field3650 = -46;
        }
        return false;
    }
}
