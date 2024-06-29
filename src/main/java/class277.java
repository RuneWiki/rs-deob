import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public class class277 extends class623 {

    @OriginalMember(owner = "client!rk", name = "w", descriptor = "Z")
    public boolean field3502 = true;

    @OriginalMember(owner = "client!rk", name = "v", descriptor = "I")
    public static int field3501;

    @OriginalMember(owner = "client!rk", name = "x", descriptor = "I")
    public static int field3503;

    @OriginalMember(owner = "client!rk", name = "y", descriptor = "I")
    public static int field3504;

    @OriginalMember(owner = "client!rk", name = "A", descriptor = "I")
    public static int field3506;

    @OriginalMember(owner = "client!rk", name = "B", descriptor = "I")
    public static int field3507;

    @OriginalMember(owner = "client!rk", name = "C", descriptor = "I")
    public static int field3508;

    @OriginalMember(owner = "client!rk", name = "E", descriptor = "I")
    public static int field3510;

    @OriginalMember(owner = "client!rk", name = "F", descriptor = "I")
    public static int field3511;

    @OriginalMember(owner = "client!rk", name = "G", descriptor = "I")
    public static int field3512;

    @OriginalMember(owner = "client!rk", name = "s", descriptor = "Lhv;")
    public class214 field3498;

    @OriginalMember(owner = "client!rk", name = "t", descriptor = "[I")
    public int[] field3499;

    @OriginalMember(owner = "client!rk", name = "D", descriptor = "[I")
    private int[] field3509;

    @OriginalMember(owner = "client!rk", name = "z", descriptor = "[Ljava/lang/String;")
    private String[] field3505;

    @OriginalMember(owner = "client!rk", name = "u", descriptor = "[[I")
    private int[][] field3500;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(Ltn;I)Ljava/lang/String;", line = 5)
    public final String method1655(class179 arg0, int arg1) {
        field3503++;
        StringBuffer var3 = new StringBuffer(80);
        if (this.field3509 != null) {
            for (int var4 = 0; var4 < this.field3509.length; var4++) {
                var3.append(this.field3505[var4]);
                var3.append(this.field3498.method1300(this.field3500[var4], arg0.method1135(true, class738.method4135(this.field3509[var4], 15).field1679), -57, this.method1656(31102, var4)));
            }
        }
        if (arg1 != 0) {
            this.method1662(false);
        }
        var3.append(this.field3505[this.field3505.length - 1]);
        return var3.toString();
    }

    @OriginalMember(owner = "client!rk", name = "c", descriptor = "(II)Lfq;", line = 34)
    public final class141 method1656(int arg0, int arg1) {
        if (arg0 == 31102) {
            field3506++;
            return this.field3509 == null || arg1 < 0 || arg1 > this.field3509.length ? null : class738.method4135(this.field3509[arg1], 116);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IZI)I", line = 49)
    public final int method1657(int arg0, boolean arg1, int arg2) {
        field3501++;
        if (this.field3509 == null || arg2 < 0 || this.field3509.length < arg2) {
            return -1;
        } else if (this.field3500[arg2] == null || arg0 < 0 || this.field3500[arg2].length < arg0) {
            return -1;
        } else {
            if (arg1) {
                this.method1656(-47, -9);
            }
            return this.field3500[arg2][arg0];
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(ILtn;)V", line = 68)
    public final void method1658(int arg0, class179 arg1) {
        field3504++;
        if (arg0 != 7967) {
            return;
        }
        while (true) {
            int var3 = arg1.method1094(255);
            if (var3 == 0) {
                return;
            }
            this.method1660(var3, 87, arg1);
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "([IILtn;)V", line = 89)
    public final void method1659(int[] arg0, int arg1, class179 arg2) {
        field3510++;
        if (this.field3509 == null) {
            return;
        }
        for (int var4 = arg1; var4 < this.field3509.length; var4++) {
            if (arg0.length <= var4) {
                return;
            }
            int var5 = this.method1656(31102, var4).field1678;
            if (var5 > 0) {
                arg2.method1127(var5, (long) arg0[var4], (byte) -119);
            }
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IILtn;)V", line = 116)
    private final void method1660(int arg0, int arg1, class179 arg2) {
        field3512++;
        if (arg0 == 1) {
            this.field3505 = class124.method809('<', -123, arg2.method1106(-1));
        } else if (arg0 == 2) {
            int var9 = arg2.method1094(255);
            this.field3499 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3499[var10] = arg2.method1107(false);
            }
        } else if (arg0 == 3) {
            int var4 = arg2.method1094(255);
            this.field3509 = new int[var4];
            this.field3500 = new int[var4][];
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg2.method1107(false);
                class141 var7 = class738.method4135(var6, 4);
                if (var7 != null) {
                    this.field3509[var5] = var6;
                    this.field3500[var5] = new int[var7.field1677];
                    for (int var8 = 0; var8 < var7.field1677; var8++) {
                        this.field3500[var5][var8] = arg2.method1107(false);
                    }
                }
            }
        } else if (arg0 == 4) {
            this.field3502 = false;
        }
        if (arg1 <= 76) {
            this.method1656(-111, -76);
        }
    }

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "(I)V", line = 191)
    public final void method1661(int arg0) {
        field3507++;
        if (arg0 != 25402) {
            this.field3500 = null;
        }
        if (this.field3499 != null) {
            for (int var2 = 0; var2 < this.field3499.length; var2++) {
                this.field3499[var2] = class216.method1308(this.field3499[var2], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(Z)I", line = 212)
    public final int method1662(boolean arg0) {
        field3508++;
        if (!arg0) {
            this.field3498 = null;
        }
        return this.field3509 == null ? 0 : this.field3509.length;
    }

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "(B)Ljava/lang/String;", line = 238)
    public final String method1663(byte arg0) {
        field3511++;
        StringBuffer var2 = new StringBuffer(80);
        if (this.field3505 == null) {
            return "";
        }
        var2.append(this.field3505[0]);
        for (int var3 = 1; var3 < this.field3505.length; var3++) {
            var2.append("...");
            var2.append(this.field3505[var3]);
        }
        if (arg0 != -115) {
            this.field3499 = null;
        }
        return var2.toString();
    }
}
