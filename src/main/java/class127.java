import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class127 extends class118 {

    @OriginalMember(owner = "client!bd", name = "K", descriptor = "I")
    private int field1622 = 4096;

    @OriginalMember(owner = "client!bd", name = "I", descriptor = "Z")
    private boolean field1620 = true;

    @OriginalMember(owner = "client!bd", name = "M", descriptor = "Lwl;")
    public static class452 field1624 = new class452(47, 12);

    @OriginalMember(owner = "client!bd", name = "N", descriptor = "J")
    public static long field1625 = 0L;

    @OriginalMember(owner = "client!bd", name = "G", descriptor = "I")
    public static int field1618;

    @OriginalMember(owner = "client!bd", name = "H", descriptor = "I")
    public static int field1619;

    @OriginalMember(owner = "client!bd", name = "J", descriptor = "I")
    public static int field1621;

    @OriginalMember(owner = "client!bd", name = "L", descriptor = "I")
    public static int field1623;

    @OriginalMember(owner = "client!bd", name = "O", descriptor = "I")
    public static int field1626;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method195(boolean arg0, int arg1) {
        ++field1618;
        if (arg0) {
            return null;
        } else {
            int[][] var3 = super.field1549.method2013(arg1, true);
            if (super.field1549.field4903) {
                int[] var4 = this.method703(0, class438.field6441 & arg1 + -1, -2);
                int[] var5 = this.method703(0, arg1, -2);
                int[] var6 = this.method703(0, arg1 + 1 & class438.field6441, -2);
                int[] var7 = var3[0];
                int[] var8 = var3[1];
                int[] var9 = var3[2];
                for (int var10 = 0; ~var10 > ~class440.field6474; ++var10) {
                    int var11 = (var6[var10] + -var4[var10]) * this.field1622;
                    int var12 = (var5[var10 + 1 & class87.field1230] + -var5[class87.field1230 & var10 + -1]) * this.field1622;
                    int var13 = var12 >> 12;
                    int var14 = var11 >> 12;
                    int var15 = var13 * var13 >> 12;
                    int var16 = var14 * var14 >> 12;
                    int var17 = (int) (4096.0D * Math.sqrt((double) ((float) (var15 + var16 - -4096) / 4096.0F)));
                    int var18;
                    int var19;
                    int var20;
                    if (var17 != 0) {
                        var18 = var12 / var17;
                        var19 = var11 / var17;
                        var20 = 16777216 / var17;
                    } else {
                        var19 = 0;
                        var20 = 0;
                        var18 = 0;
                    }
                    if (this.field1620) {
                        var18 = (var18 >> 1) + 2048;
                        var19 = (var19 >> 1) + 2048;
                        var20 = (var20 >> 1) + 2048;
                    }
                    var7[var10] = var18;
                    var8[var10] = var19;
                    var9[var10] = var20;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "(B)V")
    public static final void method746(byte arg0) {
        ++field1623;
        if (arg0 >= -123) {
            method747(-3);
        }
        for (class80 var1 = (class80) class88.field1245.method2514((byte) 61); var1 != null; var1 = (class80) class88.field1245.method2511(66)) {
            class320 var2 = var1.field1047;
            if (var2.field4833) {
                var1.method625((byte) -50);
                var2.method1956(0);
            } else if (~var2.field4828 >= ~class26.field332) {
                var2.method1954(class342.field5118, (byte) -110);
                if (var2.field4833) {
                    var1.method625((byte) -50);
                } else {
                    class50.method287(var2, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!bd", name = "f", descriptor = "(I)V")
    public static final void method747(int arg0) {
        class8.field80 = -1;
        class452.field6685 = -1;
        class97.field1337 = 0;
        if (arg0 != 15204) {
            field1625 = -84L;
        }
        ++field1619;
    }

    @OriginalMember(owner = "client!bd", name = "g", descriptor = "(I)V")
    public static void method748(int arg0) {
        field1624 = null;
        if (arg0 != -1185674196) {
            method746((byte) -45);
        }
    }

    @OriginalMember(owner = "client!bd", name = "<init>", descriptor = "()V")
    public class127() {
        super(1, false);
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IILef;)V")
    public final void method24(int arg0, int arg1, class385 arg2) {
        ++field1621;
        if (arg1 != 1) {
            this.field1622 = -16;
        }
        if (~arg0 != -1) {
            if (arg0 == 1) {
                this.field1620 = arg2.method2343(255) == 1;
            }
        } else {
            this.field1622 = arg2.method2323(-101);
        }
    }

    static {
        new class151("Thank-you, your abuse report has been received.", "Vielen Dank, deine Meldung ist bei uns eingegangen.", "Merci, nous avons bien reçu votre rapport d'abus.", "Obrigado. Sua denúncia de abuso foi recebida.");
    }
}
