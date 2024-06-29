import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public class class125 extends class27 {

    @OriginalMember(owner = "client!kk", name = "O", descriptor = "I")
    private int field1814 = 4096;

    @OriginalMember(owner = "client!kk", name = "R", descriptor = "I")
    private int field1817 = 0;

    @OriginalMember(owner = "client!kk", name = "S", descriptor = "I")
    private int field1818 = 2000;

    @OriginalMember(owner = "client!kk", name = "V", descriptor = "I")
    private int field1821 = 16;

    @OriginalMember(owner = "client!kk", name = "W", descriptor = "I")
    private int field1822 = 0;

    @OriginalMember(owner = "client!kk", name = "M", descriptor = "I")
    public static int field1812 = -1;

    @OriginalMember(owner = "client!kk", name = "U", descriptor = "Lth;")
    public static class57 field1820 = new class57(50);

    @OriginalMember(owner = "client!kk", name = "L", descriptor = "I")
    public static int field1811;

    @OriginalMember(owner = "client!kk", name = "N", descriptor = "I")
    public static int field1813;

    @OriginalMember(owner = "client!kk", name = "Q", descriptor = "I")
    public static int field1816;

    @OriginalMember(owner = "client!kk", name = "T", descriptor = "I")
    public static int field1819;

    @OriginalMember(owner = "client!kk", name = "X", descriptor = "I")
    public static int field1823;

    @OriginalMember(owner = "client!kk", name = "P", descriptor = "Lof;")
    public static class223 field1815;

    @OriginalMember(owner = "client!kk", name = "e", descriptor = "(B)V", line = 7)
    public static void method928(byte arg0) {
        if (arg0 >= 53) {
            field1815 = null;
            field1820 = null;
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(BZ)V", line = 21)
    public static final void method929(byte arg0, boolean arg1) {
        if (arg1) {
            if (class257.field3850 != -1) {
                class96.method760((byte) 111, class257.field3850);
            }
            for (class98 var2 = (class98) class288.field4360.method1406(0); var2 != null; var2 = (class98) class288.field4360.method1404(-103)) {
                class343.method2396(-69, var2, true);
            }
            class257.field3850 = -1;
            class288.field4360 = new class196(8);
            class102.method788((byte) -64);
            class257.field3850 = class1.field28;
            class202.method1469(false, (byte) -58);
            class244.method1790((byte) 57);
            class237.method1763(class257.field3850, (byte) 11);
        }
        class133.field1949 = -1;
        class1.method2((byte) 120, class110.field1613);
        class1.field55 = new class228();
        if (arg0 >= -85) {
            return;
        }
        class1.field55.field5165 = 3000;
        field1816++;
        class1.field55.field5137 = 3000;
        if (!class141.field2031 && class164.field2335 == 0) {
            class343.method2401(3, class216.field3184);
            class250.method1837(10, 40);
            return;
        }
        if (class86.field1208 == 2) {
            class166.field2385 = class323.field4861 << 7;
            class137.field1991 = class340.field5255 << 7;
        } else {
            class358.method2480((byte) 7);
        }
        if (class141.field2031) {
            class110.method844(6242);
        }
        class362.method2548(-6);
        class250.method1837(28, 40);
    }

    @OriginalMember(owner = "client!kk", name = "<init>", descriptor = "()V", line = 82)
    public class125() {
        super(0, true);
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(ILsb;I)V", line = 87)
    public final void method23(int arg0, class190 arg1, int arg2) {
        if (arg0 != -5836) {
            return;
        }
        if (arg2 == 0) {
            this.field1822 = arg1.method1319(255);
        } else if (arg2 == 1) {
            this.field1818 = arg1.method1317((byte) 111);
        } else if (arg2 == 2) {
            this.field1821 = arg1.method1319(255);
        } else if (arg2 == 3) {
            this.field1817 = arg1.method1317((byte) 49);
        } else if (arg2 == 4) {
            this.field1814 = arg1.method1317((byte) 13);
        }
        field1813++;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(IB)[I", line = 162)
    public final int[] method18(int arg0, byte arg1) {
        if (arg1 != -62) {
            field1819 = -25;
        }
        field1823++;
        int[] var3 = this.field375.method2087(-60, arg0);
        if (this.field375.field4382) {
            int var4 = this.field1814 >> 1;
            int[][] var5 = this.field375.method2084(-27062);
            Random var6 = new Random((long) this.field1822);
            for (int var7 = 0; var7 < this.field1818; var7++) {
                int var8 = this.field1814 > 0 ? this.field1817 - (var4 - class127.method943((byte) -128, var6, this.field1814)) : this.field1817;
                int var9 = var8 >> 4 & 0xFF;
                int var10 = class127.method943((byte) -126, var6, class209.field3053);
                int var11 = class127.method943((byte) -83, var6, class184.field2642);
                int var12 = (class16.field270[var9] * this.field1821 >> 12) + var11;
                int var13 = (client.field646[var9] * this.field1821 >> 12) + var10;
                int var14 = var13 - var10;
                int var15 = var12 - var11;
                if (var14 != 0 || var15 != 0) {
                    if (var14 < 0) {
                        var14 = -var14;
                    }
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    boolean var16 = var15 > var14;
                    if (var16) {
                        int var17 = var10;
                        int var18 = var13;
                        var10 = var11;
                        var11 = var17;
                        var13 = var12;
                        var12 = var18;
                    }
                    if (var10 > var13) {
                        int var19 = var10;
                        int var20 = var11;
                        var11 = var12;
                        var12 = var20;
                        var10 = var13;
                        var13 = var19;
                    }
                    int var21 = var11;
                    int var22 = var12 - var11;
                    int var23 = var13 - var10;
                    int var24 = var12 <= var11 ? -1 : 1;
                    int var25 = -var23 / 2;
                    if (var22 < 0) {
                        var22 = -var22;
                    }
                    int var26 = 2048 / var23;
                    int var27 = 1024 - (class127.method943((byte) -115, var6, 4096) >> 2);
                    for (int var28 = var10; var28 < var13; var28++) {
                        int var29 = var27 - (-((var28 - var10) * var26) - 1024);
                        var25 += var22;
                        int var30 = class214.field3080 & var21;
                        if (var25 > 0) {
                            var25 += -var23;
                            var21 += var24;
                        }
                        int var31 = var28 & class150.field2180;
                        if (var16) {
                            var5[var30][var31] = var29;
                        } else {
                            var5[var31][var30] = var29;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!kk", name = "f", descriptor = "(I)V", line = 296)
    public final void method22(int arg0) {
        field1811++;
        class172.method1206(28820);
        if (arg0 > -63) {
            method929((byte) -93, false);
        }
    }
}
