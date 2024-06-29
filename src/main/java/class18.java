import java.awt.FontMetrics;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!k")
public class class18 extends class10 {

    @OriginalMember(owner = "mapview!k", name = "u", descriptor = "I")
    public int field186;

    @OriginalMember(owner = "mapview!k", name = "r", descriptor = "[B")
    public byte[] field183;

    @OriginalMember(owner = "mapview!k", name = "o", descriptor = "[[[[B")
    public static byte[][][][] field180 = new byte[5][][][];

    @OriginalMember(owner = "mapview!k", name = "n", descriptor = "Lw;")
    public static class38 field179 = class35.method219("Find", true);

    @OriginalMember(owner = "mapview!k", name = "p", descriptor = "I")
    public static int field181 = 0;

    @OriginalMember(owner = "mapview!k", name = "q", descriptor = "I")
    public static int field182 = -1;

    @OriginalMember(owner = "mapview!k", name = "t", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field185;

    @OriginalMember(owner = "mapview!k", name = "s", descriptor = "[Lb;")
    public static class3[] field184;

    @OriginalMember(owner = "mapview!k", name = "a", descriptor = "(II)Lw;", line = 25)
    public static final class38 method99(int arg0, int arg1) {
        if (arg1 >= -6) {
            method111(27, 54, -37);
        }
        return class33.method200(arg0, 10, -3466, false);
    }

    @OriginalMember(owner = "mapview!k", name = "b", descriptor = "(II)I", line = 43)
    public static int method100(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "mapview!k", name = "c", descriptor = "(II)V", line = 57)
    public final void method101(int arg0, int arg1) {
        if (arg1 <= 97) {
            field181 = 78;
        }
        this.field183[this.field186++] = (byte) arg0;
    }

    @OriginalMember(owner = "mapview!k", name = "a", descriptor = "(BI[BI)V", line = 70)
    public final void method102(byte arg0, int arg1, byte[] arg2, int arg3) {
        for (int var5 = arg3; var5 < arg1 + arg3; var5++) {
            arg2[var5] = this.field183[this.field186++];
        }
        if (arg0 > -93) {
            field180 = null;
        }
    }

    @OriginalMember(owner = "mapview!k", name = "a", descriptor = "(I)I", line = 127)
    public final int method103(int arg0) {
        if (arg0 != 255) {
            field185 = null;
        }
        return this.field183[this.field186++] & 0xFF;
    }

    @OriginalMember(owner = "mapview!k", name = "a", descriptor = "(BLjava/lang/Throwable;)Ljava/lang/String;", line = 145)
    public static final String method104(byte arg0, Throwable arg1) throws IOException {
        String var2;
        if (arg1 instanceof class26) {
            class26 var3 = (class26) arg1;
            arg1 = var3.field363;
            var2 = var3.field365 + " | ";
        } else {
            var2 = "";
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        arg1.printStackTrace(var5);
        var5.close();
        String var6 = var4.toString();
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        String var8 = var7.readLine();
        while (true) {
            while (true) {
                String var9 = var7.readLine();
                if (var9 == null) {
                    if (arg0 != -42) {
                        return (String) null;
                    }
                    return var2 + "| " + var8;
                }
                int var10 = var9.indexOf(40);
                int var11 = var9.indexOf(41, var10 + 1);
                if (var10 >= 0 && var11 >= 0) {
                    String var12 = var9.substring(var10 + 1, var11);
                    int var13 = var12.indexOf(".java:");
                    if (var13 >= 0) {
                        String var14 = var12.substring(0, var13) + var12.substring(var13 + 5);
                        var2 = var2 + var14 + ' ';
                        continue;
                    }
                    var9 = var9.substring(0, var10);
                }
                String var15 = var9.trim();
                String var16 = var15.substring(var15.lastIndexOf(32) + 1);
                String var17 = var16.substring(var16.lastIndexOf(9) + 1);
                var2 = var2 + var17 + ' ';
            }
        }
    }

    @OriginalMember(owner = "mapview!k", name = "a", descriptor = "(III[I)V", line = 218)
    public final void method105(int arg0, int arg1, int arg2, int[] arg3) {
        int var5 = this.field186;
        int var6 = (arg2 - arg0) / 8;
        if (arg1 != -1) {
            return;
        }
        this.field186 = arg0;
        for (int var7 = 0; var7 < var6; var7++) {
            int var8 = this.method113((byte) 111);
            int var9 = this.method113((byte) 78);
            int var10 = -957401312;
            int var11 = -1640531527;
            int var12 = 32;
            while (var12-- > 0) {
                var9 -= var10 + arg3[var10 >>> 11 & 0x7600003] ^ (var8 << 4 ^ var8 >>> 5) + var8;
                var10 -= var11;
                var8 -= arg3[var10 & 0x3] + var10 ^ (var9 >>> 5 ^ var9 << 4) + var9;
            }
            this.field186 -= 8;
            this.method106(-96089736, var8);
            this.method106(-96089736, var9);
        }
        this.field186 = var5;
    }

    @OriginalMember(owner = "mapview!k", name = "d", descriptor = "(II)V", line = 259)
    public final void method106(int arg0, int arg1) {
        this.field183[this.field186++] = (byte) (arg1 >> arg0);
        this.field183[this.field186++] = (byte) (arg1 >> 16);
        this.field183[this.field186++] = (byte) (arg1 >> 8);
        this.field183[this.field186++] = (byte) arg1;
    }

    @OriginalMember(owner = "mapview!k", name = "b", descriptor = "(I)I", line = 284)
    public final int method107(int arg0) {
        this.field186 += 2;
        if (arg0 != -5286) {
            field181 = -22;
        }
        return ((this.field183[this.field186 - 2] & 0xFF) << 8) + (this.field183[this.field186 - 1] & 0xFF);
    }

    @OriginalMember(owner = "mapview!k", name = "c", descriptor = "(I)V", line = 295)
    public static void method108(int arg0) {
        field185 = null;
        if (arg0 < 62) {
            field179 = null;
        }
        field179 = null;
        field180 = null;
        field184 = null;
    }

    @OriginalMember(owner = "mapview!k", name = "a", descriptor = "(Z)B", line = 308)
    public final byte method109(boolean arg0) {
        return arg0 ? 106 : this.field183[this.field186++];
    }

    @OriginalMember(owner = "mapview!k", name = "d", descriptor = "(B)Lw;", line = 325)
    public final class38 method110(byte arg0) {
        int var2 = this.field186;
        while (this.field183[this.field186++] != 0) {
        }
        int var3 = 113 / (-arg0 / 40);
        return class6.method28((byte) 5, var2, this.field186 - var2 - 1, this.field183);
    }

    @OriginalMember(owner = "mapview!k", name = "a", descriptor = "(III)B", line = 348)
    public static final byte method111(int arg0, int arg1, int arg2) {
        int var3 = arg1 >> 6;
        if (arg0 != 4032) {
            method111(127, -41, -120);
        }
        int var4 = arg2 >> 6;
        if (class3.field16[var4][var3] == null) {
            return 0;
        } else if (class3.field16[var4][var3].field486 == null) {
            return class3.field16[var4][var3].field488;
        } else {
            return class3.field16[var4][var3].field486[(arg2 & 0xFC0) + arg1 & 0x3F];
        }
    }

    @OriginalMember(owner = "mapview!k", name = "d", descriptor = "(I)I", line = 372)
    public final int method112(int arg0) {
        if (arg0 == 1687217264) {
            this.field186 += 3;
            return ((this.field183[this.field186 - 3] & 0xFF) << 16) - (-((this.field183[this.field186 - 2] & 0xFF) << 8) - (this.field183[this.field186 - 1] & 0xFF));
        } else {
            return -43;
        }
    }

    @OriginalMember(owner = "mapview!k", name = "e", descriptor = "(B)I", line = 391)
    public final int method113(byte arg0) {
        this.field186 += 4;
        return arg0 < 51 ? -105 : ((this.field183[this.field186 - 3] & 0xFF) << 16) + (-16777216 & this.field183[this.field186 - 4] << 24) + ((this.field183[this.field186 + -2] & 0xFF) << 8) + (this.field183[this.field186 + -1] & 0xFF);
    }

    @OriginalMember(owner = "mapview!k", name = "<init>", descriptor = "(I)V", line = 421)
    public class18(int arg0) {
        this.field186 = 0;
        this.field183 = class5.method22((byte) 23, arg0);
    }

    @OriginalMember(owner = "mapview!k", name = "<init>", descriptor = "([B)V", line = 436)
    public class18(byte[] arg0) {
        this.field183 = arg0;
        this.field186 = 0;
    }
}
