import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ss")
public class class303 {

    @OriginalMember(owner = "client!ss", name = "n", descriptor = "I")
    public int field4498;

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "I")
    public int field4485;

    @OriginalMember(owner = "client!ss", name = "b", descriptor = "I")
    public static int field4486;

    @OriginalMember(owner = "client!ss", name = "e", descriptor = "I")
    public int field4489;

    @OriginalMember(owner = "client!ss", name = "i", descriptor = "I")
    public static int field4493;

    @OriginalMember(owner = "client!ss", name = "j", descriptor = "I")
    public static int field4494;

    @OriginalMember(owner = "client!ss", name = "p", descriptor = "I")
    public int field4500;

    @OriginalMember(owner = "client!ss", name = "s", descriptor = "I")
    public static int field4503;

    @OriginalMember(owner = "client!ss", name = "d", descriptor = "Lml;")
    public class270 field4488;

    @OriginalMember(owner = "client!ss", name = "f", descriptor = "Ljr;")
    public static class74 field4490;

    @OriginalMember(owner = "client!ss", name = "c", descriptor = "[I")
    public int[] field4487;

    @OriginalMember(owner = "client!ss", name = "g", descriptor = "[I")
    public int[] field4491;

    @OriginalMember(owner = "client!ss", name = "h", descriptor = "[I")
    public int[] field4492;

    @OriginalMember(owner = "client!ss", name = "l", descriptor = "[I")
    public int[] field4496;

    @OriginalMember(owner = "client!ss", name = "o", descriptor = "[I")
    public int[] field4499;

    @OriginalMember(owner = "client!ss", name = "r", descriptor = "[I")
    public int[] field4502;

    @OriginalMember(owner = "client!ss", name = "m", descriptor = "[Lml;")
    public class270[] field4497;

    @OriginalMember(owner = "client!ss", name = "k", descriptor = "[[I")
    public static int[][] field4495;

    @OriginalMember(owner = "client!ss", name = "q", descriptor = "[[I")
    public int[][] field4501;

    @OriginalMember(owner = "client!ss", name = "t", descriptor = "[[I")
    public int[][] field4504;

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(ZB)V", line = 12)
    public static final void method1936(boolean arg0, byte arg1) {
        for (class211 var2 = (class211) class153.field2328.method863(-1); var2 != null; var2 = (class211) class153.field2328.method865(-1)) {
            if (var2.field3183 != null) {
                class504.field7295.method1587(var2.field3183);
                var2.field3183 = null;
            }
            if (var2.field3181 != null) {
                class504.field7295.method1587(var2.field3181);
                var2.field3181 = null;
            }
            var2.method421(22071);
        }
        int var3 = 103 / ((arg1 + 21) / 39);
        field4503++;
        if (!arg0) {
            return;
        }
        for (class211 var4 = (class211) class293.field4353.method863(-1); var4 != null; var4 = (class211) class293.field4353.method865(-1)) {
            if (var4.field3183 != null) {
                class504.field7295.method1587(var4.field3183);
                var4.field3183 = null;
            }
            var4.method421(22071);
        }
        for (class211 var5 = (class211) class462.field6679.method2285(118); var5 != null; var5 = (class211) class462.field6679.method2283((byte) 11)) {
            if (var5.field3183 != null) {
                class504.field7295.method1587(var5.field3183);
                var5.field3183 = null;
            }
            var5.method421(22071);
        }
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(II)Z", line = 78)
    public static final boolean method1937(int arg0, int arg1) {
        field4486++;
        if (arg1 == 20 || arg1 == 48 || arg1 == 8 || arg1 == 46 || arg1 == 47) {
            return true;
        } else if (arg0 == 0) {
            return arg1 == 18 || arg1 == 1010;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(B)V", line = 97)
    public static void method1938(byte arg0) {
        if (arg0 == 53) {
            field4495 = null;
            field4490 = null;
        }
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "([BZ)V", line = 114)
    private final void method1939(byte[] arg0, boolean arg1) {
        field4493++;
        class519 var3 = new class519(class377.method2299(arg0, 1));
        int var4 = var3.method3072((byte) -122);
        if (var4 != 5 && var4 != 6) {
            throw new RuntimeException();
        }
        if (var4 < 6) {
            this.field4489 = 0;
        } else {
            this.field4489 = var3.method3053(-129);
        }
        int var5 = var3.method3072((byte) -121);
        this.field4485 = var3.method3018(566990904);
        int var6 = 0;
        this.field4502 = new int[this.field4485];
        int var7 = -1;
        for (int var8 = 0; var8 < this.field4485; var8++) {
            this.field4502[var8] = var6 += var3.method3018(566990904);
            if (this.field4502[var8] > var7) {
                var7 = this.field4502[var8];
            }
        }
        this.field4500 = var7 + 1;
        this.field4491 = new int[this.field4500];
        this.field4499 = new int[this.field4500];
        this.field4487 = new int[this.field4500];
        this.field4496 = new int[this.field4500];
        if (arg1) {
            return;
        }
        this.field4501 = new int[this.field4500][];
        if (var5 != 0) {
            this.field4492 = new int[this.field4500];
            for (int var9 = 0; var9 < this.field4500; var9++) {
                this.field4492[var9] = -1;
            }
            for (int var10 = 0; var10 < this.field4485; var10++) {
                this.field4492[this.field4502[var10]] = var3.method3053(-129);
            }
            this.field4488 = new class270(this.field4492);
        }
        for (int var11 = 0; var11 < this.field4485; var11++) {
            this.field4499[this.field4502[var11]] = var3.method3053(-129);
        }
        for (int var12 = 0; var12 < this.field4485; var12++) {
            this.field4491[this.field4502[var12]] = var3.method3053(-129);
        }
        for (int var13 = 0; var13 < this.field4485; var13++) {
            this.field4487[this.field4502[var13]] = var3.method3018(566990904);
        }
        for (int var14 = 0; var14 < this.field4485; var14++) {
            int var21 = this.field4502[var14];
            int var22 = 0;
            int var23 = this.field4487[var21];
            int var24 = -1;
            this.field4501[var21] = new int[var23];
            for (int var25 = 0; var25 < var23; var25++) {
                int var26 = this.field4501[var21][var25] = var22 += var3.method3018(566990904);
                if (var24 < var26) {
                    var24 = var26;
                }
            }
            this.field4496[var21] = var24 + 1;
            if ((var24 + 1) == var23) {
                this.field4501[var21] = null;
            }
        }
        if (var5 == 0) {
            return;
        }
        this.field4497 = new class270[var7 + 1];
        this.field4504 = new int[var7 + 1][];
        for (int var15 = 0; var15 < this.field4485; var15++) {
            int var16 = this.field4502[var15];
            int var17 = this.field4487[var16];
            this.field4504[var16] = new int[this.field4496[var16]];
            for (int var18 = 0; var18 < this.field4496[var16]; var18++) {
                this.field4504[var16][var18] = -1;
            }
            for (int var19 = 0; var19 < var17; var19++) {
                int var20;
                if (this.field4501[var16] == null) {
                    var20 = var19;
                } else {
                    var20 = this.field4501[var16][var19];
                }
                this.field4504[var16][var20] = var3.method3053(-129);
            }
            this.field4497[var16] = new class270(this.field4504[var16]);
        }
    }

    @OriginalMember(owner = "client!ss", name = "<init>", descriptor = "([BI)V", line = 286)
    public class303(byte[] arg0, int arg1) {
        this.field4498 = class252.method1630(arg0.length, arg0, -74);
        if (this.field4498 != arg1) {
            throw new RuntimeException();
        }
        this.method1939(arg0, false);
    }
}
