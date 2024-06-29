import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class class259 extends class252 {

    @OriginalMember(owner = "client!d", name = "u", descriptor = "Z")
    public boolean field4239 = true;

    @OriginalMember(owner = "client!d", name = "B", descriptor = "Ljava/lang/String;")
    public static String field4246 = "Members object";

    @OriginalMember(owner = "client!d", name = "z", descriptor = "I")
    public static int field4244 = -1;

    @OriginalMember(owner = "client!d", name = "E", descriptor = "[Z")
    public static boolean[] field4249 = new boolean[100];

    @OriginalMember(owner = "client!d", name = "D", descriptor = "Ljava/lang/String;")
    public static String field4248 = null;

    @OriginalMember(owner = "client!d", name = "v", descriptor = "I")
    public static int field4240;

    @OriginalMember(owner = "client!d", name = "x", descriptor = "I")
    public static int field4242;

    @OriginalMember(owner = "client!d", name = "y", descriptor = "I")
    public static int field4243;

    @OriginalMember(owner = "client!d", name = "A", descriptor = "I")
    public static int field4245;

    @OriginalMember(owner = "client!d", name = "F", descriptor = "I")
    public static int field4250;

    @OriginalMember(owner = "client!d", name = "G", descriptor = "I")
    public static int field4251;

    @OriginalMember(owner = "client!d", name = "H", descriptor = "I")
    public static int field4252;

    @OriginalMember(owner = "client!d", name = "I", descriptor = "I")
    public static int field4253;

    @OriginalMember(owner = "client!d", name = "K", descriptor = "I")
    public static int field4255;

    @OriginalMember(owner = "client!d", name = "M", descriptor = "I")
    public static int field4257;

    @OriginalMember(owner = "client!d", name = "C", descriptor = "Lt;")
    public static class212 field4247;

    @OriginalMember(owner = "client!d", name = "J", descriptor = "[I")
    public static int[] field4254;

    @OriginalMember(owner = "client!d", name = "L", descriptor = "[I")
    public int[] field4256;

    @OriginalMember(owner = "client!d", name = "O", descriptor = "[I")
    private int[] field4259;

    @OriginalMember(owner = "client!d", name = "N", descriptor = "[Ljava/lang/String;")
    private String[] field4258;

    @OriginalMember(owner = "client!d", name = "w", descriptor = "[[I")
    private int[][] field4241;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IZ)I")
    public final int method1739(int arg0, boolean arg1) {
        field4245++;
        if (this.field4259 == null || arg0 < 0 || this.field4259.length < arg0) {
            return -1;
        } else if (arg1) {
            return 68;
        } else {
            return this.field4259[arg0];
        }
    }

    @OriginalMember(owner = "client!d", name = "e", descriptor = "(I)Ljava/lang/String;")
    public final String method1740(int arg0) {
        StringBuffer var2 = new StringBuffer(80);
        field4253++;
        if (this.field4258 == null) {
            return "";
        }
        var2.append(this.field4258[arg0]);
        for (int var3 = 1; var3 < this.field4258.length; var3++) {
            var2.append("...");
            var2.append(this.field4258[var3]);
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IIB)I")
    public final int method1741(int arg0, int arg1, byte arg2) {
        field4250++;
        int var4 = -50 % ((12 - arg2) / 34);
        if (this.field4259 == null || arg1 < 0 || arg1 > this.field4259.length) {
            return -1;
        } else if (this.field4241[arg1] == null || arg0 < 0 || arg0 > this.field4241[arg1].length) {
            return -1;
        } else {
            return this.field4241[arg1][arg0];
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(ILfj;B)V")
    private final void method1742(int arg0, class274 arg1, byte arg2) {
        if (arg2 != -26) {
            this.field4239 = false;
        }
        if (arg0 == 1) {
            this.field4258 = class231.method1602('<', arg1.method1855(arg2 + 132), -17735);
        } else if (arg0 == 2) {
            int var8 = arg1.method1849(255);
            this.field4256 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field4256[var9] = arg1.method1837(arg2 + 278);
            }
        } else if (arg0 == 3) {
            int var4 = arg1.method1849(255);
            this.field4241 = new int[var4][];
            this.field4259 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg1.method1837(252);
                this.field4259[var5] = var6;
                this.field4241[var5] = new int[class159.field2602[var6]];
                for (int var7 = 0; var7 < class159.field2602[var6]; var7++) {
                    this.field4241[var5][var7] = arg1.method1837(252);
                }
            }
        } else if (arg0 == 4) {
            this.field4239 = false;
        }
        field4242++;
    }

    @OriginalMember(owner = "client!d", name = "f", descriptor = "(I)Lrk;")
    public static final class292 method1743(int arg0) {
        field4243++;
        int var1 = class217.field3413[0] * class140.field2284[0];
        int[] var2 = new int[var1];
        byte[] var3 = class232.field3635[0];
        for (int var4 = 0; var4 < var1; var4++) {
            var2[var4] = class310.field5024[class233.method1609(255, var3[var4])];
        }
        class67 var5 = new class67(class14.field295, class13.field272, class80.field1286[0], class211.field3364[0], class217.field3413[arg0], class140.field2284[0], var2);
        class180.method1265(95);
        return var5;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Lfj;B[I)V")
    public final void method1744(class274 arg0, byte arg1, int[] arg2) {
        field4251++;
        if (this.field4259 == null) {
            return;
        }
        for (int var4 = 0; var4 < this.field4259.length && arg2.length > var4; var4++) {
            int var5 = class150.field2421[this.method1739(var4, false)];
            if (var5 > 0) {
                arg0.method1858(252, var5, (long) arg2[var4]);
            }
        }
        if (arg1 != -24) {
            this.method1749((class274) null, 16);
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Lfj;I)Ljava/lang/String;")
    public final String method1745(class274 arg0, int arg1) {
        if (arg1 != 0) {
            this.field4241 = null;
        }
        field4257++;
        StringBuffer var3 = new StringBuffer(80);
        if (this.field4259 != null) {
            for (int var4 = 0; var4 < this.field4259.length; var4++) {
                var3.append(this.field4258[var4]);
                var3.append(class76.method552(64, arg0.method1809((byte) -88, class152.field2440[this.field4259[var4]]), this.field4241[var4], this.field4259[var4]));
            }
        }
        var3.append(this.field4258[this.field4258.length - 1]);
        return var3.toString();
    }

    @OriginalMember(owner = "client!d", name = "g", descriptor = "(I)V")
    public final void method1746(int arg0) {
        if (this.field4256 != null) {
            for (int var2 = 0; var2 < this.field4256.length; var2++) {
                this.field4256[var2] = class76.method555(this.field4256[var2], 32768);
            }
        }
        if (arg0 != -4) {
            field4247 = null;
        }
        field4240++;
    }

    @OriginalMember(owner = "client!d", name = "h", descriptor = "(I)V")
    public static void method1747(int arg0) {
        field4248 = null;
        field4254 = null;
        if (arg0 < 42) {
            field4254 = null;
        }
        field4249 = null;
        field4247 = null;
        field4246 = null;
    }

    @OriginalMember(owner = "client!d", name = "c", descriptor = "(B)I")
    public final int method1748(byte arg0) {
        field4255++;
        if (this.field4259 == null) {
            return 0;
        } else {
            int var2 = 57 / ((arg0 + 33) / 37);
            return this.field4259.length;
        }
    }

    @OriginalMember(owner = "client!d", name = "b", descriptor = "(Lfj;I)V")
    public final void method1749(class274 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method1849(255);
            if (var3 == 0) {
                field4252++;
                if (arg1 <= 108) {
                    this.field4241 = null;
                    return;
                }
                return;
            }
            this.method1742(var3, arg0, (byte) -26);
        }
    }
}
