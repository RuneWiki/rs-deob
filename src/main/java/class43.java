import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class43 extends class273 {

    @OriginalMember(owner = "client!sd", name = "U", descriptor = "I")
    private int field955 = 4096;

    @OriginalMember(owner = "client!sd", name = "db", descriptor = "I")
    private int field964 = 4096;

    @OriginalMember(owner = "client!sd", name = "eb", descriptor = "I")
    private int field965 = 4096;

    @OriginalMember(owner = "client!sd", name = "bb", descriptor = "Ljd;")
    public static class86 field962 = class122.method868(": ", true);

    @OriginalMember(owner = "client!sd", name = "gb", descriptor = "I")
    public static int field967 = -1;

    @OriginalMember(owner = "client!sd", name = "hb", descriptor = "Ljd;")
    public static class86 field968 = class122.method868("Verbindung abgebrochen)3", true);

    @OriginalMember(owner = "client!sd", name = "S", descriptor = "I")
    public static int field953;

    @OriginalMember(owner = "client!sd", name = "V", descriptor = "I")
    public static int field956;

    @OriginalMember(owner = "client!sd", name = "W", descriptor = "I")
    public static int field957;

    @OriginalMember(owner = "client!sd", name = "X", descriptor = "I")
    public static int field958;

    @OriginalMember(owner = "client!sd", name = "ab", descriptor = "I")
    public static int field961;

    @OriginalMember(owner = "client!sd", name = "cb", descriptor = "I")
    public static int field963;

    @OriginalMember(owner = "client!sd", name = "fb", descriptor = "I")
    public static int field966;

    @OriginalMember(owner = "client!sd", name = "Z", descriptor = "Lbj;")
    public static class151 field960;

    @OriginalMember(owner = "client!sd", name = "T", descriptor = "[I")
    public static int[] field954;

    @OriginalMember(owner = "client!sd", name = "Y", descriptor = "[Lod;")
    public static class90[] field959;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIII)I")
    public static final int method344(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg2 & 3;
        ++field957;
        if (arg0 == var4) {
            return arg1;
        } else if (~var4 == -2) {
            return -arg3 + 7;
        } else {
            return ~var4 == -3 ? -arg1 + 7 : arg3;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Z)V")
    public static void method345(boolean arg0) {
        field962 = null;
        field960 = null;
        field968 = null;
        field959 = null;
        field954 = null;
        if (!arg0) {
            field960 = null;
        }
    }

    @OriginalMember(owner = "client!sd", name = "<init>", descriptor = "()V")
    public class43() {
        super(1, false);
    }

    @OriginalMember(owner = "client!sd", name = "f", descriptor = "(I)Lod;")
    public static final class90 method346(int arg0) {
        ++field956;
        if (arg0 != 4096) {
            method348(116);
        }
        int var1 = class24.field592[0] * class191.field3393[0];
        byte[] var2 = class213.field3857[0];
        int[] var3 = new int[var1];
        for (int var4 = 0; var1 > var4; ++var4) {
            var3[var4] = class268.field4718[class1.method5(var2[var4], 255)];
        }
        class167 var5 = new class167(class70.field1438, class169.field3121, class138.field2628[0], class1.field6[0], class24.field592[0], class191.field3393[0], var3);
        class127.method894((byte) 20);
        return var5;
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(Z)V")
    public static final void method347(boolean arg0) {
        if (!arg0) {
            if (class209.field3776 != 2) {
                if (~class200.field3576 == ~class185.field3288 && class57.field1168 == class39.field906) {
                    class209.field3776 = 0;
                    class260.method1774((byte) -128, class16.field463 + -1);
                } else {
                    class12.field398 = class185.field3288;
                    class272.field4765 = class39.field906;
                    class209.field3776 = 2;
                }
            } else if (~class200.field3576 == ~class12.field398 && class57.field1168 == class272.field4765) {
                class209.field3776 = 0;
                class260.method1774((byte) -119, class16.field463 + -1);
            }
            ++field958;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(ILqk;I)V")
    public final void method34(int arg0, class200 arg1, int arg2) {
        ++field963;
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (~arg0 == -3) {
                    this.field964 = arg1.method1410(-113);
                }
            } else {
                this.field955 = arg1.method1410(-104);
            }
        } else {
            this.field965 = arg1.method1410(-122);
        }
        if (arg2 > -16) {
            method345(false);
        }
    }

    @OriginalMember(owner = "client!sd", name = "g", descriptor = "(I)V")
    public static final void method348(int arg0) {
        class150.method1069(5, 2312);
        ++field961;
        if (arg0 > 106) {
            class152.method1115((byte) 60, 5);
            class15.method111(5, -256);
            class142.method1011(1, 5);
            class158.method1144(5, -1);
            class171.method1231(5, (byte) 117);
            class140.method999(-7657, 5);
            class169.method1214(-122, 5);
            class112.method789(10436, 5);
            class176.method1241(5, -111);
            class122.method859((byte) -112, 5);
            class235.method1625(16777215, 50);
            class80.method558(-23850, 5);
            class210.method1488(120, 5);
            class152.field2873.method693(6, 5);
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IB)[[I")
    public final int[][] method29(int arg0, byte arg1) {
        int var3 = 6 % ((arg1 - 12) / 58);
        ++field966;
        int[][] var4 = super.field4787.method1657(arg0, (byte) -119);
        if (super.field4787.field4355) {
            int[][] var5 = this.method1859(arg0, 0, 3);
            int[] var6 = var5[1];
            int[] var7 = var5[2];
            int[] var8 = var5[0];
            int[] var9 = var4[1];
            int[] var10 = var4[0];
            int[] var11 = var4[2];
            for (int var12 = 0; var12 < class176.field3200; ++var12) {
                int var13 = var8[var12];
                int var14 = var7[var12];
                int var15 = var6[var12];
                if (~var13 == ~var14 && var14 == var15) {
                    var10[var12] = this.field965 * var13 >> 12;
                    var9[var12] = this.field955 * var14 >> 12;
                    var11[var12] = this.field964 * var15 >> 12;
                } else {
                    var10[var12] = this.field965;
                    var9[var12] = this.field955;
                    var11[var12] = this.field964;
                }
            }
        }
        return var4;
    }
}
