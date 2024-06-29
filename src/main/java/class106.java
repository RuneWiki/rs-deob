import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gm")
public class class106 extends class501 {

    @OriginalMember(owner = "client!gm", name = "E", descriptor = "I")
    private int field1532;

    @OriginalMember(owner = "client!gm", name = "r", descriptor = "[Ldi;")
    public static class109[] field1519 = new class109[75];

    @OriginalMember(owner = "client!gm", name = "G", descriptor = "Z")
    public static boolean field1534 = false;

    @OriginalMember(owner = "client!gm", name = "q", descriptor = "I")
    public static int field1518;

    @OriginalMember(owner = "client!gm", name = "t", descriptor = "I")
    public static int field1521;

    @OriginalMember(owner = "client!gm", name = "u", descriptor = "I")
    public static int field1522;

    @OriginalMember(owner = "client!gm", name = "v", descriptor = "I")
    public static int field1523;

    @OriginalMember(owner = "client!gm", name = "w", descriptor = "I")
    public static int field1524;

    @OriginalMember(owner = "client!gm", name = "x", descriptor = "I")
    public static int field1525;

    @OriginalMember(owner = "client!gm", name = "y", descriptor = "I")
    public static int field1526;

    @OriginalMember(owner = "client!gm", name = "A", descriptor = "I")
    public static int field1528;

    @OriginalMember(owner = "client!gm", name = "B", descriptor = "I")
    public static int field1529;

    @OriginalMember(owner = "client!gm", name = "C", descriptor = "I")
    public static int field1530;

    @OriginalMember(owner = "client!gm", name = "F", descriptor = "I")
    public static int field1533;

    @OriginalMember(owner = "client!gm", name = "H", descriptor = "I")
    public static int field1535;

    @OriginalMember(owner = "client!gm", name = "s", descriptor = "Lm;")
    public static class165 field1520;

    @OriginalMember(owner = "client!gm", name = "z", descriptor = "[Luca;")
    public class439[] field1527;

    @OriginalMember(owner = "client!gm", name = "D", descriptor = "[[B")
    private byte[][] field1531;

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(IZ)Z")
    public final boolean method780(int arg0, boolean arg1) {
        if (!arg1) {
            this.method786(true, -110);
        }
        field1522++;
        return this.field1527[arg0].field5865;
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(III)V")
    public static final void method781(int arg0, int arg1, int arg2) {
        field1525++;
        class221 var3 = class65.method413(15, 0, (byte) -82);
        var3.method1426((byte) -122);
        var3.field3208 = arg1;
        var3.field3214 = arg0;
        if (arg2 != 29090) {
            method787(-111, 40, -68);
        }
    }

    @OriginalMember(owner = "client!gm", name = "c", descriptor = "(II)Z")
    public final boolean method782(int arg0, int arg1) {
        field1524++;
        int var3 = 58 / ((-arg1 - 66) / 57);
        return this.field1527[arg0].field5855;
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(B)V")
    public static void method783(byte arg0) {
        field1519 = null;
        field1520 = null;
        if (arg0 != -46) {
            method783((byte) -38);
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(I)V")
    public static final void method784(int arg0) {
        int var1 = 0;
        if (arg0 > -125) {
            method783((byte) -43);
        }
        while (var1 < 100) {
            class574.field8452[var1] = null;
            var1++;
        }
        field1528++;
        class228.field3342 = 0;
    }

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "(B)Z")
    public final boolean method785(byte arg0) {
        field1523++;
        if (this.field1527 != null) {
            return true;
        }
        if (this.field1531 == null) {
            if (!class234.field3390.method1976(this.field1532, true)) {
                return false;
            }
            int[] var2 = class234.field3390.method1994(-53, this.field1532);
            this.field1531 = new byte[var2.length][];
            for (int var3 = 0; var3 < var2.length; var3++) {
                this.field1531[var3] = class234.field3390.method1966(var2[var3], this.field1532, true);
            }
        }
        boolean var4 = true;
        for (int var5 = 0; var5 < this.field1531.length; var5++) {
            byte[] var14 = this.field1531[var5];
            int var15 = var14[1] & 0xFF | (var14[0] & 0xFF) << 8;
            var4 &= class369.field5093.method1981(true, var15);
        }
        if (!var4) {
            return false;
        } else if (arg0 < 120) {
            return false;
        } else {
            class19 var6 = new class19();
            int var7 = class234.field3390.method1975(107, this.field1532);
            this.field1527 = new class439[var7];
            int[] var8 = class234.field3390.method1994(-75, this.field1532);
            for (int var9 = 0; var9 < var8.length; var9++) {
                byte[] var10 = this.field1531[var9];
                int var11 = (var10[0] & 0xFF) << 8 | var10[1] & 0xFF;
                class209 var12 = null;
                for (class209 var13 = (class209) var6.method124((byte) 42); var13 != null; var13 = (class209) var6.method120(56)) {
                    if (var13.field3095 == var11) {
                        var12 = var13;
                        break;
                    }
                }
                if (var12 == null) {
                    var12 = new class209(var11, class369.field5093.method1984(1670, var11));
                    var6.method131(var12, 0);
                }
                this.field1527[var8[var9]] = new class439(var10, var12);
            }
            this.field1531 = null;
            return true;
        }
    }

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "(ZI)Z")
    public final boolean method786(boolean arg0, int arg1) {
        field1533++;
        if (!arg0) {
            field1526 = -27;
        }
        return this.field1527[arg1].field5862;
    }

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "(III)Z")
    public static final boolean method787(int arg0, int arg1, int arg2) {
        field1535++;
        if (arg0 != 0) {
            field1526 = -126;
        }
        return class112.method818(arg2, arg1, true) & class361.method2176(arg2, (byte) 66, arg1);
    }

    @OriginalMember(owner = "client!gm", name = "<init>", descriptor = "(I)V")
    public class106(int arg0) {
        this.field1532 = arg0;
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(Llp;I)[Luq;")
    public static final class142[] method788(class331 arg0, int arg1) {
        field1521++;
        if (!arg0.method2005((byte) -100)) {
            return new class142[0];
        }
        class21 var2 = arg0.method2002(-124);
        while (var2.field202 == 0) {
            class236.method1513(true, 10L);
        }
        if (var2.field202 == 2) {
            return new class142[0];
        }
        int[] var3 = (int[]) var2.field201;
        if (arg1 != -24188) {
            return null;
        }
        class142[] var4 = new class142[var3.length >> 2];
        for (int var5 = 0; var5 < var4.length; var5++) {
            class142 var6 = new class142();
            var4[var5] = var6;
            var6.field2003 = var3[var5 << 2];
            var6.field1999 = var3[(var5 << 2) + 1];
            var6.field1995 = var3[(var5 << 2) + 2];
            var6.field1998 = var3[(var5 << 2) + 3];
        }
        return var4;
    }
}
