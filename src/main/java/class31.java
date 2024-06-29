import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tfa")
public class class31 extends class11 {

    @OriginalMember(owner = "client!tfa", name = "G", descriptor = "Z")
    public boolean field501 = true;

    @OriginalMember(owner = "client!tfa", name = "D", descriptor = "Z")
    public static boolean field498 = true;

    @OriginalMember(owner = "client!tfa", name = "u", descriptor = "I")
    public static int field490;

    @OriginalMember(owner = "client!tfa", name = "w", descriptor = "I")
    public static int field492;

    @OriginalMember(owner = "client!tfa", name = "x", descriptor = "I")
    public static int field493;

    @OriginalMember(owner = "client!tfa", name = "y", descriptor = "I")
    public static int field494;

    @OriginalMember(owner = "client!tfa", name = "z", descriptor = "I")
    public static int field495;

    @OriginalMember(owner = "client!tfa", name = "B", descriptor = "I")
    public static int field496;

    @OriginalMember(owner = "client!tfa", name = "F", descriptor = "I")
    public static int field500;

    @OriginalMember(owner = "client!tfa", name = "H", descriptor = "I")
    public static int field502;

    @OriginalMember(owner = "client!tfa", name = "I", descriptor = "I")
    public static int field503;

    @OriginalMember(owner = "client!tfa", name = "K", descriptor = "I")
    public static int field505;

    @OriginalMember(owner = "client!tfa", name = "v", descriptor = "Lww;")
    public class686 field491;

    @OriginalMember(owner = "client!tfa", name = "E", descriptor = "[I")
    public int[] field499;

    @OriginalMember(owner = "client!tfa", name = "J", descriptor = "[I")
    private int[] field504;

    @OriginalMember(owner = "client!tfa", name = "C", descriptor = "[Ljava/lang/String;")
    private String[] field497;

    @OriginalMember(owner = "client!tfa", name = "t", descriptor = "[[I")
    private int[][] field489;

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "(Leh;I)V", line = 3)
    public final void method252(class335 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2034(255);
            if (var3 == 0) {
                if (arg1 != -1) {
                    this.method254((byte) 39, null, null);
                }
                field500++;
                return;
            }
            this.method256(var3, arg1 - 123, arg0);
        }
    }

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "(II)Llj;", line = 25)
    public final class570 method253(int arg0, int arg1) {
        if (arg0 != -1) {
            this.field501 = true;
        }
        field490++;
        return this.field504 == null || arg1 < 0 || arg1 > this.field504.length ? null : class98.method754((byte) -5, this.field504[arg1]);
    }

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "(B[ILeh;)V", line = 45)
    public final void method254(byte arg0, int[] arg1, class335 arg2) {
        field494++;
        if (this.field504 == null || arg0 > -93) {
            return;
        }
        for (int var4 = 0; var4 < this.field504.length; var4++) {
            if (arg1.length <= var4) {
                return;
            }
            int var5 = this.method253(-1, var4).field7573;
            if (var5 > 0) {
                arg2.method1991((long) arg1[var4], var5, 8);
            }
        }
    }

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "(I)Ljava/lang/String;", line = 74)
    public final String method255(int arg0) {
        field492++;
        StringBuffer var2 = new StringBuffer(80);
        if (arg0 != 22773) {
            field498 = false;
        }
        if (this.field497 == null) {
            return "";
        }
        var2.append(this.field497[0]);
        for (int var3 = 1; var3 < this.field497.length; var3++) {
            var2.append("...");
            var2.append(this.field497[var3]);
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "(IILeh;)V", line = 102)
    private final void method256(int arg0, int arg1, class335 arg2) {
        if (arg0 == 1) {
            this.field497 = class572.method3141(arg2.method2029((byte) -88), '<', (byte) 12);
        } else if (arg0 == 2) {
            int var4 = arg2.method2034(255);
            this.field499 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field499[var5] = arg2.method2001((byte) -83);
            }
        } else if (arg0 == 3) {
            int var6 = arg2.method2034(255);
            this.field489 = new int[var6][];
            this.field504 = new int[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = arg2.method2001((byte) -83);
                class570 var9 = class98.method754((byte) -5, var8);
                if (var9 != null) {
                    this.field504[var7] = var8;
                    this.field489[var7] = new int[var9.field7576];
                    for (int var10 = 0; var10 < var9.field7576; var10++) {
                        this.field489[var7][var10] = arg2.method2001((byte) -83);
                    }
                }
            }
        } else if (arg0 == 4) {
            this.field501 = false;
        }
        field502++;
        if (arg1 > -119) {
            this.method256(9, 112, null);
        }
    }

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "(IZI)I", line = 178)
    public final int method257(int arg0, boolean arg1, int arg2) {
        field503++;
        if (!arg1) {
            return 48;
        } else if (this.field504 == null || arg2 < 0 || arg2 > this.field504.length) {
            return -1;
        } else if (this.field489[arg2] == null || arg0 < 0 || arg0 > this.field489[arg2].length) {
            return -1;
        } else {
            return this.field489[arg2][arg0];
        }
    }

    @OriginalMember(owner = "client!tfa", name = "c", descriptor = "(I)I", line = 201)
    public final int method258(int arg0) {
        field505++;
        if (this.field504 == null) {
            return 0;
        } else if (arg0 == 0) {
            return this.field504.length;
        } else {
            return 85;
        }
    }

    @OriginalMember(owner = "client!tfa", name = "b", descriptor = "(II)Lae;", line = 219)
    public static final class233 method259(int arg0, int arg1) {
        field493++;
        if (class400.field5302 && class340.field4699 <= arg1 && class442.field6060 >= arg1) {
            if (arg0 != -1) {
                method259(56, -45);
            }
            return class18.field294[arg1 - class340.field4699];
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!tfa", name = "f", descriptor = "(I)V", line = 235)
    public final void method260(int arg0) {
        if (arg0 <= 55) {
            this.field499 = null;
        }
        if (this.field499 != null) {
            for (int var2 = 0; var2 < this.field499.length; var2++) {
                this.field499[var2] = class220.method1393(this.field499[var2], 32768);
            }
        }
        field496++;
    }

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "(BLeh;)Ljava/lang/String;", line = 265)
    public final String method261(byte arg0, class335 arg1) {
        if (arg0 != 32) {
            this.method261((byte) -96, null);
        }
        field495++;
        StringBuffer var3 = new StringBuffer(80);
        if (this.field504 != null) {
            for (int var4 = 0; var4 < this.field504.length; var4++) {
                var3.append(this.field497[var4]);
                var3.append(this.field491.method3815(this.method253(arg0 - 33, var4), arg1.method2038(class98.method754((byte) -5, this.field504[var4]).field7571, -592304400), this.field489[var4], -7940));
            }
        }
        var3.append(this.field497[this.field497.length - 1]);
        return var3.toString();
    }
}
