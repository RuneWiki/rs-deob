import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class394 extends class118 {

    @OriginalMember(owner = "client!oh", name = "K", descriptor = "I")
    private int field5914 = 32768;

    @OriginalMember(owner = "client!oh", name = "M", descriptor = "[I")
    public static int[] field5916;

    @OriginalMember(owner = "client!oh", name = "N", descriptor = "Z")
    public static boolean field5917;

    @OriginalMember(owner = "client!oh", name = "P", descriptor = "[B")
    public static byte[] field5919;

    @OriginalMember(owner = "client!oh", name = "G", descriptor = "I")
    public static int field5910;

    @OriginalMember(owner = "client!oh", name = "H", descriptor = "I")
    public static int field5911;

    @OriginalMember(owner = "client!oh", name = "I", descriptor = "I")
    public static int field5912;

    @OriginalMember(owner = "client!oh", name = "J", descriptor = "I")
    public static int field5913;

    @OriginalMember(owner = "client!oh", name = "L", descriptor = "I")
    public static int field5915;

    @OriginalMember(owner = "client!oh", name = "O", descriptor = "I")
    public static int field5918;

    @OriginalMember(owner = "client!oh", name = "e", descriptor = "(I)V")
    public final void method306(int arg0) {
        if (arg0 >= 103) {
            ++field5918;
            class316.method1927((byte) 96);
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(ILjava/lang/String;)I")
    public static final int method2496(int arg0, String arg1) {
        ++field5911;
        int var2 = 66 % ((arg0 - -24) / 61);
        int var3 = arg1.length();
        int var4 = 0;
        for (int var5 = 0; ~var5 > ~var3; ++var5) {
            var4 = arg1.charAt(var5) + (var4 << 5) + -var4;
        }
        return var4;
    }

    @OriginalMember(owner = "client!oh", name = "<init>", descriptor = "()V")
    public class394() {
        super(3, false);
    }

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(II)V")
    public static final void method2497(int arg0, int arg1) {
        class241 var2 = class277.field4214;
        synchronized (class277.field4214) {
            int var3 = -37 / ((arg0 - -39) / 60);
            class277.field4214.method1481(3, arg1);
        }
        ++field5913;
    }

    @OriginalMember(owner = "client!oh", name = "f", descriptor = "(I)V")
    public static void method2498(int arg0) {
        field5916 = null;
        field5919 = null;
        if (arg0 != 25668) {
            method2496(-30, (String) null);
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(II)[I")
    public final int[] method20(int arg0, int arg1) {
        ++field5915;
        int[] var3 = super.field1537.method2395(30963, arg1);
        if (super.field1537.field5756) {
            int[] var4 = this.method703(1, arg1, ~arg0);
            int[] var5 = this.method703(2, arg1, -2);
            for (int var6 = 0; var6 < class440.field6474; ++var6) {
                int var7 = (var4[var6] & 4088) >> 4;
                int var8 = var5[var6] * this.field5914 >> 12;
                int var9 = class47.field582[var7] * var8 >> 12;
                int var10 = class280.field4293[var7] * var8 >> 12;
                int var11 = class87.field1230 & (var9 >> 12) + var6;
                int var12 = (var10 >> 12) + arg1 & class438.field6441;
                int[] var13 = this.method703(0, var12, -2);
                var3[var6] = var13[var11];
            }
        }
        if (arg0 != 1) {
            this.method195(false, -80);
        }
        return var3;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method195(boolean arg0, int arg1) {
        if (arg0) {
            method2498(-29);
        }
        ++field5910;
        int[][] var3 = super.field1549.method2013(arg1, true);
        if (super.field1549.field4903) {
            int[] var4 = this.method703(1, arg1, -2);
            int[] var5 = this.method703(2, arg1, -2);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            for (int var9 = 0; ~var9 > ~class440.field6474; ++var9) {
                int var10 = (var4[var9] * 255 & 1045216) >> 12;
                int var11 = var5[var9] * this.field5914 >> 12;
                int var12 = class47.field582[var10] * var11 >> 12;
                int var13 = class280.field4293[var10] * var11 >> 12;
                int var14 = class87.field1230 & (var12 >> 12) + var9;
                int var15 = arg1 - -(var13 >> 12) & class438.field6441;
                int[][] var16 = this.method708(var15, (byte) 40, 0);
                var6[var9] = var16[0][var14];
                var7[var9] = var16[1][var14];
                var8[var9] = var16[2][var14];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IILef;)V")
    public final void method24(int arg0, int arg1, class385 arg2) {
        if (~arg0 != -1) {
            if (arg0 == 1) {
                super.field1552 = arg2.method2343(arg1 + 254) == 1;
            }
        } else {
            this.field5914 = arg2.method2323(-34) << 4;
        }
        ++field5912;
        if (arg1 != 1) {
            this.method24(97, 32, (class385) null);
        }
    }

    static {
        new class151("Unable to add name - system busy.", "Der Name konnte nicht hinzugefügt werden, das System ist derzeit ausgelastet.", "Impossible d'ajouter un nom - système occupé.", "Não foi possível adicionar o nome. O sistema está ocupado.");
        field5916 = new int[100];
        field5917 = false;
        field5919 = new byte[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };
    }
}
