import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class6 extends class128 {

    @OriginalMember(owner = "client!dg", name = "I", descriptor = "Z")
    public boolean field58 = true;

    @OriginalMember(owner = "client!dg", name = "D", descriptor = "[Lel;")
    public static class82[] field53 = new class82[14];

    @OriginalMember(owner = "client!dg", name = "M", descriptor = "Ljava/lang/String;")
    public static String field62 = "Loaded defaults";

    @OriginalMember(owner = "client!dg", name = "A", descriptor = "I")
    public static int field50;

    @OriginalMember(owner = "client!dg", name = "B", descriptor = "I")
    public static int field51;

    @OriginalMember(owner = "client!dg", name = "C", descriptor = "I")
    public static int field52;

    @OriginalMember(owner = "client!dg", name = "E", descriptor = "I")
    public static int field54;

    @OriginalMember(owner = "client!dg", name = "F", descriptor = "I")
    public static int field55;

    @OriginalMember(owner = "client!dg", name = "G", descriptor = "I")
    public static int field56;

    @OriginalMember(owner = "client!dg", name = "H", descriptor = "I")
    public static int field57;

    @OriginalMember(owner = "client!dg", name = "J", descriptor = "I")
    public static int field59;

    @OriginalMember(owner = "client!dg", name = "L", descriptor = "I")
    public static int field61;

    @OriginalMember(owner = "client!dg", name = "O", descriptor = "I")
    public static int field64;

    @OriginalMember(owner = "client!dg", name = "P", descriptor = "I")
    public static int field65;

    @OriginalMember(owner = "client!dg", name = "S", descriptor = "I")
    public static int field68;

    @OriginalMember(owner = "client!dg", name = "U", descriptor = "I")
    public static int field70;

    @OriginalMember(owner = "client!dg", name = "z", descriptor = "Lnh;")
    public static class305 field49;

    @OriginalMember(owner = "client!dg", name = "N", descriptor = "Lnh;")
    public static class305 field63;

    @OriginalMember(owner = "client!dg", name = "K", descriptor = "[I")
    public int[] field60;

    @OriginalMember(owner = "client!dg", name = "T", descriptor = "[I")
    private int[] field69;

    @OriginalMember(owner = "client!dg", name = "R", descriptor = "[Ljava/lang/String;")
    private String[] field67;

    @OriginalMember(owner = "client!dg", name = "Q", descriptor = "[[I")
    private int[][] field66;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(BLbj;)V")
    public final void method28(byte arg0, class215 arg1) {
        if (arg0 != -33) {
            this.field69 = null;
        }
        field65++;
        while (true) {
            int var3 = arg1.method1374((byte) -60);
            if (var3 == 0) {
                return;
            }
            this.method36(var3, arg1, -25601);
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(III)V")
    public static final void method29(int arg0, int arg1, int arg2) {
        field56++;
        class39 var3 = class149.method935(-102, arg0, 1);
        var3.method261(0);
        int var4 = 27 % ((6 - arg2) / 39);
        var3.field598 = arg1;
    }

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(B)V")
    public static void method30(byte arg0) {
        if (arg0 != -102) {
            method29(82, 71, -16);
        }
        field63 = null;
        field62 = null;
        field49 = null;
        field53 = null;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(Z)Ljava/lang/String;")
    public final String method31(boolean arg0) {
        if (arg0) {
            this.field69 = null;
        }
        field52++;
        StringBuffer var2 = new StringBuffer(80);
        if (this.field67 == null) {
            return "";
        }
        var2.append(this.field67[0]);
        for (int var3 = 1; var3 < this.field67.length; var3++) {
            var2.append("...");
            var2.append(this.field67[var3]);
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(BLbj;)Ljava/lang/String;")
    public final String method32(byte arg0, class215 arg1) {
        field68++;
        if (arg0 >= -93) {
            return null;
        }
        StringBuffer var3 = new StringBuffer(80);
        if (this.field69 != null) {
            for (int var4 = 0; var4 < this.field69.length; var4++) {
                var3.append(this.field67[var4]);
                var3.append(class48.method299(-127, arg1.method1402(true, class254.field3966[this.field69[var4]]), this.field66[var4], this.field69[var4]));
            }
        }
        var3.append(this.field67[this.field67.length - 1]);
        return var3.toString();
    }

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "(B)V")
    public final void method33(byte arg0) {
        int var2 = 36 % ((-arg0 - 13) / 55);
        if (this.field60 != null) {
            for (int var3 = 0; var3 < this.field60.length; var3++) {
                this.field60[var3] = class161.method1003(this.field60[var3], 32768);
            }
        }
        field50++;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(ZI)I")
    public final int method34(boolean arg0, int arg1) {
        field61++;
        if (this.field69 == null || arg1 < 0 || this.field69.length < arg1) {
            return -1;
        } else if (arg0) {
            return 3;
        } else {
            return this.field69[arg1];
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(Lbj;I[I)V")
    public final void method35(class215 arg0, int arg1, int[] arg2) {
        field51++;
        if (this.field69 == null) {
            return;
        }
        if (arg1 != 0) {
            field49 = null;
        }
        for (int var4 = 0; var4 < this.field69.length; var4++) {
            if (var4 >= arg2.length) {
                return;
            }
            int var5 = class163.field2318[this.method34(false, var4)];
            if (var5 > 0) {
                arg0.method1351(var5, (byte) -62, (long) arg2[var4]);
            }
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(ILbj;I)V")
    private final void method36(int arg0, class215 arg1, int arg2) {
        if (arg0 == 1) {
            this.field67 = class26.method168(arg1.method1376(-51), '<', 111);
        } else if (arg0 == 2) {
            int var4 = arg1.method1374((byte) -60);
            this.field60 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field60[var5] = arg1.method1379(-124);
            }
        } else if (arg0 == 3) {
            int var6 = arg1.method1374((byte) -60);
            this.field66 = new int[var6][];
            this.field69 = new int[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = arg1.method1379(-78);
                this.field69[var7] = var8;
                this.field66[var7] = new int[class59.field827[var8]];
                for (int var9 = 0; var9 < class59.field827[var8]; var9++) {
                    this.field66[var7][var9] = arg1.method1379(-82);
                }
            }
        } else if (arg0 == 4) {
            this.field58 = false;
        }
        field70++;
        if (arg2 != -25601) {
            this.field69 = null;
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIB)I")
    public final int method37(int arg0, int arg1, byte arg2) {
        field54++;
        if (this.field69 == null || arg1 < 0 || this.field69.length < arg1) {
            return -1;
        } else {
            if (arg2 < 92) {
                this.field58 = true;
            }
            return this.field66[arg1] == null || arg0 < 0 || arg0 > this.field66[arg1].length ? -1 : this.field66[arg1][arg0];
        }
    }

    @OriginalMember(owner = "client!dg", name = "f", descriptor = "(I)I")
    public final int method38(int arg0) {
        field55++;
        if (arg0 != 0) {
            this.method31(true);
        }
        return this.field69 == null ? 0 : this.field69.length;
    }
}
