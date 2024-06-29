import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bn")
public class class72 extends class128 {

    @OriginalMember(owner = "client!bn", name = "S", descriptor = "[I")
    private int[] field920 = new int[3];

    @OriginalMember(owner = "client!bn", name = "P", descriptor = "I")
    private int field917 = 3216;

    @OriginalMember(owner = "client!bn", name = "V", descriptor = "I")
    private int field923 = 3216;

    @OriginalMember(owner = "client!bn", name = "U", descriptor = "I")
    private int field922 = 4096;

    @OriginalMember(owner = "client!bn", name = "H", descriptor = "Z")
    public static boolean field909 = false;

    @OriginalMember(owner = "client!bn", name = "I", descriptor = "I")
    public static int field910;

    @OriginalMember(owner = "client!bn", name = "J", descriptor = "I")
    public static int field911;

    @OriginalMember(owner = "client!bn", name = "K", descriptor = "I")
    public static int field912;

    @OriginalMember(owner = "client!bn", name = "L", descriptor = "I")
    public static int field913;

    @OriginalMember(owner = "client!bn", name = "N", descriptor = "I")
    public static int field915;

    @OriginalMember(owner = "client!bn", name = "Q", descriptor = "I")
    public static int field918;

    @OriginalMember(owner = "client!bn", name = "R", descriptor = "I")
    public static int field919;

    @OriginalMember(owner = "client!bn", name = "T", descriptor = "I")
    public static int field921;

    @OriginalMember(owner = "client!bn", name = "O", descriptor = "Loe;")
    public static class136 field916;

    @OriginalMember(owner = "client!bn", name = "M", descriptor = "Llc;")
    public static class175 field914;

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "(Z)V", line = 5)
    public final void method130(boolean arg0) {
        this.method438(-3197);
        field911++;
        if (arg0) {
            this.method130(true);
        }
    }

    @OriginalMember(owner = "client!bn", name = "g", descriptor = "(I)V", line = 17)
    public static void method437(int arg0) {
        if (arg0 != -26253) {
            field914 = (class175) null;
        }
        field916 = null;
        field914 = null;
    }

    @OriginalMember(owner = "client!bn", name = "h", descriptor = "(I)V", line = 28)
    private final void method438(int arg0) {
        field921++;
        if (arg0 != -3197) {
            this.method126((byte) -103, 67);
        }
        double var2 = Math.cos((double) ((float) this.field917 / 4096.0F));
        this.field920[0] = (int) (var2 * 4096.0D * Math.sin((double) ((float) this.field923 / 4096.0F)));
        this.field920[1] = (int) (var2 * Math.cos((double) ((float) this.field923 / 4096.0F)) * 4096.0D);
        this.field920[2] = (int) (Math.sin((double) ((float) this.field917 / 4096.0F)) * 4096.0D);
        int var4 = this.field920[0] * this.field920[0] >> 12;
        int var5 = this.field920[2] * this.field920[2] >> 12;
        int var6 = this.field920[1] * this.field920[1] >> 12;
        int var7 = (int) (Math.sqrt((double) (var4 - (-var6 - var5) >> 12)) * 4096.0D);
        if (var7 != 0) {
            this.field920[1] = (this.field920[1] << 12) / var7;
            this.field920[2] = (this.field920[2] << 12) / var7;
            this.field920[0] = (this.field920[0] << 12) / var7;
        }
    }

    @OriginalMember(owner = "client!bn", name = "<init>", descriptor = "()V", line = 57)
    public class72() {
        super(1, true);
    }

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "(BI)[I", line = 68)
    public final int[] method126(byte arg0, int arg1) {
        field915++;
        if (arg0 <= 100) {
            this.method107((class107) null, 97, -28);
        }
        int[] var3 = this.field1748.method902(arg1, true);
        if (this.field1748.field1878) {
            int var4 = class185.field2671 * this.field922 >> 12;
            int[] var5 = this.method851((byte) -121, 0, arg1 - 1 & class237.field3486);
            int[] var6 = this.method851((byte) -92, 0, arg1);
            int[] var7 = this.method851((byte) -58, 0, arg1 + 1 & class237.field3486);
            for (int var8 = 0; var8 < class10.field141; var8++) {
                int var9 = (var6[class244.field3664 & var8 - 1] - var6[var8 + 1 & class244.field3664]) * var4 >> 12;
                int var10 = (var7[var8] - var5[var8]) * var4 >> 12;
                int var11 = var9 >> 4;
                if (var11 < 0) {
                    var11 = -var11;
                }
                if (var11 > 255) {
                    var11 = 255;
                }
                int var12 = var10 >> 4;
                if (var12 < 0) {
                    var12 = -var12;
                }
                if (var12 > 255) {
                    var12 = 255;
                }
                int var13 = class41.field483[var11 + ((var12 + 1) * var12 >> 1)] & 0xFF;
                int var14 = var13 * 4096 >> 8;
                int var15 = this.field920[2] * var14 >> 12;
                int var16 = var10 * var13 >> 8;
                int var17 = this.field920[1] * var16 >> 12;
                int var18 = var9 * var13 >> 8;
                int var19 = this.field920[0] * var18 >> 12;
                var3[var8] = var15 + var19 + var17;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "(IB)Lim;", line = 142)
    public static final class191 method439(int arg0, byte arg1) {
        field919++;
        class191 var2 = (class191) class229.field3339.method1239((byte) -24, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class335.field5175.method1199(28815, arg0, 32);
        class191 var4 = new class191();
        if (var3 != null) {
            var4.method1327(new class107(var3), (byte) -76);
        }
        var4.method1323(74);
        if (arg1 == 121) {
            class229.field3339.method1243(var4, (long) arg0, -29282);
            return var4;
        } else {
            return (class191) null;
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(Lp;II)V", line = 168)
    public final void method107(class107 arg0, int arg1, int arg2) {
        field912++;
        if (arg2 >= -85) {
            field909 = false;
        }
        if (arg1 == 0) {
            this.field922 = arg0.method624(14612);
        } else if (arg1 == 1) {
            this.field923 = arg0.method624(14612);
        } else if (arg1 == 2) {
            this.field917 = arg0.method624(14612);
        }
    }
}
