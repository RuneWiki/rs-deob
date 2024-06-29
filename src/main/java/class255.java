import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class255 extends class85 {

    @OriginalMember(owner = "client!qc", name = "O", descriptor = "Z")
    public boolean field3229 = true;

    @OriginalMember(owner = "client!qc", name = "M", descriptor = "Z")
    public static boolean field3227 = true;

    @OriginalMember(owner = "client!qc", name = "P", descriptor = "B")
    public static byte field3230;

    @OriginalMember(owner = "client!qc", name = "y", descriptor = "I")
    public static int field3214;

    @OriginalMember(owner = "client!qc", name = "z", descriptor = "I")
    public static int field3215;

    @OriginalMember(owner = "client!qc", name = "B", descriptor = "I")
    public static int field3217;

    @OriginalMember(owner = "client!qc", name = "D", descriptor = "I")
    public static int field3219;

    @OriginalMember(owner = "client!qc", name = "E", descriptor = "I")
    public static int field3220;

    @OriginalMember(owner = "client!qc", name = "F", descriptor = "I")
    public static int field3221;

    @OriginalMember(owner = "client!qc", name = "G", descriptor = "I")
    public static int field3222;

    @OriginalMember(owner = "client!qc", name = "I", descriptor = "I")
    public static int field3224;

    @OriginalMember(owner = "client!qc", name = "J", descriptor = "I")
    public static int field3225;

    @OriginalMember(owner = "client!qc", name = "N", descriptor = "I")
    public static int field3228;

    @OriginalMember(owner = "client!qc", name = "H", descriptor = "Lwe;")
    public class141 field3223;

    @OriginalMember(owner = "client!qc", name = "A", descriptor = "[I")
    public int[] field3216;

    @OriginalMember(owner = "client!qc", name = "Q", descriptor = "[I")
    private int[] field3231;

    @OriginalMember(owner = "client!qc", name = "C", descriptor = "[Ljava/lang/String;")
    private String[] field3218;

    @OriginalMember(owner = "client!qc", name = "K", descriptor = "[[I")
    private int[][] field3226;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(III)I", line = 11)
    public final int method1589(int arg0, int arg1, int arg2) {
        field3224++;
        if (this.field3231 == null || arg1 < 0 || this.field3231.length < arg1) {
            return -1;
        } else {
            if (arg2 != -1) {
                this.field3229 = false;
            }
            return this.field3226[arg1] == null || arg0 < 0 || this.field3226[arg1].length < arg0 ? -1 : this.field3226[arg1][arg0];
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(ZLbt;[I)V", line = 29)
    public final void method1590(boolean arg0, class88 arg1, int[] arg2) {
        field3215++;
        if (this.field3231 == null) {
            return;
        }
        for (int var4 = 0; this.field3231.length > var4 && arg2.length > var4; var4++) {
            int var5 = this.method1594((byte) 109, var4).field5465;
            if (var5 > 0) {
                arg1.method586(var5, (long) arg2[var4], (byte) 94);
            }
        }
        if (!arg0) {
            this.method1592(91, null, (byte) -112);
        }
    }

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "(B)V", line = 57)
    public final void method1591(byte arg0) {
        if (this.field3216 != null) {
            for (int var2 = 0; var2 < this.field3216.length; var2++) {
                this.field3216[var2] = class31.method213(this.field3216[var2], 32768);
            }
        }
        if (arg0 <= 73) {
            this.field3216 = null;
        }
        field3214++;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(ILbt;B)V", line = 83)
    private final void method1592(int arg0, class88 arg1, byte arg2) {
        field3217++;
        if (arg0 == 1) {
            this.field3218 = class332.method1978((byte) -119, '<', arg1.method591(20557));
        } else if (arg0 == 2) {
            int var4 = arg1.method617(2);
            this.field3216 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3216[var5] = arg1.method568((byte) 110);
            }
        } else if (arg0 == 3) {
            int var6 = arg1.method617(2);
            this.field3226 = new int[var6][];
            this.field3231 = new int[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                int var9 = arg1.method568((byte) 110);
                class408 var10 = class20.method133(-74, var9);
                if (var10 != null) {
                    this.field3231[var7] = var9;
                    this.field3226[var7] = new int[var10.field5464];
                    for (int var11 = 0; var11 < var10.field5464; var11++) {
                        this.field3226[var7][var11] = arg1.method568((byte) 110);
                    }
                }
            }
        } else if (arg0 == 4) {
            this.field3229 = false;
        }
        int var8 = 100 % ((arg2 + 10) / 47);
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(III)Z", line = 157)
    public static final boolean method1593(int arg0, int arg1, int arg2) {
        field3228++;
        if (arg1 < 75) {
            method1593(-10, 106, 30);
        }
        return (arg0 & 0x84080) != 0;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(BI)Ljd;", line = 169)
    public final class408 method1594(byte arg0, int arg1) {
        if (arg0 <= 87) {
            return null;
        } else {
            field3225++;
            return this.field3231 == null || arg1 < 0 || this.field3231.length < arg1 ? null : class20.method133(91, this.field3231[arg1]);
        }
    }

    @OriginalMember(owner = "client!qc", name = "e", descriptor = "(B)Ljava/lang/String;", line = 183)
    public final String method1595(byte arg0) {
        field3219++;
        StringBuffer var2 = new StringBuffer(80);
        if (this.field3218 == null) {
            return "";
        }
        var2.append(this.field3218[0]);
        for (int var3 = 1; var3 < this.field3218.length; var3++) {
            var2.append("...");
            var2.append(this.field3218[var3]);
        }
        int var4 = -89 % (arg0 / 62);
        return var2.toString();
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(I)I", line = 210)
    public final int method1596(int arg0) {
        field3221++;
        if (this.field3231 == null) {
            return 0;
        } else if (arg0 == 0) {
            return this.field3231.length;
        } else {
            return 127;
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(ZLbt;)Ljava/lang/String;", line = 231)
    public final String method1597(boolean arg0, class88 arg1) {
        field3222++;
        StringBuffer var3 = new StringBuffer(80);
        if (arg0) {
            this.method1598(null, 45);
        }
        if (this.field3231 != null) {
            for (int var4 = 0; var4 < this.field3231.length; var4++) {
                var3.append(this.field3218[var4]);
                var3.append(this.field3223.method974(this.field3226[var4], arg1.method616((byte) 17, class20.method133(-112, this.field3231[var4]).field5469), this.method1594((byte) 118, var4), 0));
            }
        }
        var3.append(this.field3218[this.field3218.length - 1]);
        return var3.toString();
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lbt;I)V", line = 261)
    public final void method1598(class88 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method617(arg1 ^ 0xFFFFFFFD);
            if (var3 == 0) {
                field3220++;
                if (arg1 != -1) {
                    this.method1598(null, 127);
                    return;
                }
                return;
            }
            this.method1592(var3, arg0, (byte) 89);
        }
    }
}
