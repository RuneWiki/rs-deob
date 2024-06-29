import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lo")
public class class528 extends class271 {

    @OriginalMember(owner = "client!lo", name = "I", descriptor = "I")
    private int field7812;

    @OriginalMember(owner = "client!lo", name = "B", descriptor = "I")
    public static int field7805;

    @OriginalMember(owner = "client!lo", name = "C", descriptor = "I")
    public static int field7806;

    @OriginalMember(owner = "client!lo", name = "E", descriptor = "I")
    public static int field7808;

    @OriginalMember(owner = "client!lo", name = "F", descriptor = "I")
    public static int field7809;

    @OriginalMember(owner = "client!lo", name = "G", descriptor = "I")
    public static int field7810;

    @OriginalMember(owner = "client!lo", name = "H", descriptor = "[Lwr;")
    public class316[] field7811;

    @OriginalMember(owner = "client!lo", name = "D", descriptor = "[[B")
    private byte[][] field7807;

    @OriginalMember(owner = "client!lo", name = "b", descriptor = "(II)Z")
    public final boolean method3116(int arg0, int arg1) {
        if (arg0 > -109) {
            this.field7811 = null;
        }
        field7810++;
        return this.field7811[arg1].field4515;
    }

    @OriginalMember(owner = "client!lo", name = "c", descriptor = "(II)Z")
    public final boolean method3117(int arg0, int arg1) {
        field7806++;
        if (arg1 <= 33) {
            this.method3118(-34);
        }
        return this.field7811[arg0].field4516;
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(I)Z")
    public final boolean method3118(int arg0) {
        field7809++;
        if (this.field7811 != null) {
            return true;
        }
        if (this.field7807 == null) {
            if (!class158.field2335.method2949(this.field7812, false)) {
                return false;
            }
            int[] var2 = class158.field2335.method2951(this.field7812, false);
            this.field7807 = new byte[var2.length][];
            for (int var3 = 0; var3 < var2.length; var3++) {
                this.field7807[var3] = class158.field2335.method2945(this.field7812, var2[var3], true);
            }
        }
        boolean var4 = true;
        for (int var5 = 0; var5 < this.field7807.length; var5++) {
            byte[] var14 = this.field7807[var5];
            int var15 = (var14[0] & 0xFF) << 8 | var14[1] & 0xFF;
            var4 &= class73.field1086.method2924((byte) -128, var15);
        }
        if (!var4) {
            return false;
        }
        class123 var6 = new class123();
        int var7 = class158.field2335.method2942(false, this.field7812);
        this.field7811 = new class316[var7];
        int[] var8 = class158.field2335.method2951(this.field7812, false);
        if (arg0 != 255) {
            this.method3117(84, 95);
        }
        for (int var9 = 0; var9 < var8.length; var9++) {
            byte[] var10 = this.field7807[var9];
            int var11 = (var10[0] & 0xFF) << 8 | var10[1] & 0xFF;
            class36 var12 = null;
            for (class36 var13 = (class36) var6.method816(122); var13 != null; var13 = (class36) var6.method812(110)) {
                if (var13.field379 == var11) {
                    var12 = var13;
                    break;
                }
            }
            if (var12 == null) {
                var12 = new class36(var11, class73.field1086.method2944(var11, 41));
                var6.method809(var12, false);
            }
            this.field7811[var8[var9]] = new class316(var10, var12);
        }
        this.field7807 = null;
        return true;
    }

    @OriginalMember(owner = "client!lo", name = "d", descriptor = "(II)Z")
    public final boolean method3119(int arg0, int arg1) {
        if (arg0 == -1956869444) {
            field7805++;
            return this.field7811[arg1].field4520;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(Lmv;II)Z")
    public static final boolean method3120(class252 arg0, int arg1, int arg2) {
        field7808++;
        int var3 = arg0.method1690((byte) 1, 2);
        if (var3 == 0) {
            if (arg0.method1690((byte) 1, 1) != 0) {
                method3120(arg0, arg1, -91);
            }
            int var4 = arg0.method1690((byte) 1, 6);
            int var5 = arg0.method1690((byte) 1, 6);
            boolean var6 = arg0.method1690((byte) 1, 1) == 1;
            if (var6) {
                class314.field4472[class310.field4450++] = arg1;
            }
            if (class44.field707[arg1] != null) {
                throw new RuntimeException("hr:lr");
            }
            class105 var7 = class244.field3610[arg1];
            class239 var8 = class44.field707[arg1] = new class239();
            var8.field1942 = arg1;
            if (class353.field5403[arg1] != null) {
                var8.method1621(class353.field5403[arg1], 5);
            }
            var8.method855(var7.field1519, 2);
            var8.field1904 = var7.field1526;
            int var9 = var7.field1523;
            int var10 = var9 >> 28;
            int var11 = (var9 & 0x3FD414) >> 14;
            int var12 = var9 & 0xFF;
            var8.field3525 = var7.field1518;
            var8.field2003[0] = class284.field4082[arg1];
            var8.field1768 = (byte) var10;
            var8.method1616((var11 << 6) + var4 - class68.field1038, (byte) 106, (var12 << 6) + var5 - class24.field259);
            var8.field3512 = false;
            class244.field3610[arg1] = null;
            return true;
        } else if (var3 == 1) {
            int var13 = arg0.method1690((byte) 1, 2);
            int var14 = class244.field3610[arg1].field1523;
            class244.field3610[arg1].field1523 = (((var14 >> 28) + var13 & 0x3) << 28) + (var14 & 0xFFFFFFF);
            return false;
        } else if (var3 == 2) {
            int var15 = arg0.method1690((byte) 1, 5);
            int var16 = var15 >> 3;
            int var17 = var15 & 0x7;
            int var18 = class244.field3610[arg1].field1523;
            int var19 = (var18 >> 28) + var16 & 0x3;
            int var20 = var18 >> 14 & 0xFF;
            int var21 = var18 & 0xFF;
            if (var17 == 0) {
                var21--;
                var20--;
            }
            if (var17 == 1) {
                var21--;
            }
            if (var17 == 2) {
                var20++;
                var21--;
            }
            if (var17 == 3) {
                var20--;
            }
            if (var17 == 4) {
                var20++;
            }
            if (var17 == 5) {
                var21++;
                var20--;
            }
            if (var17 == 6) {
                var21++;
            }
            if (var17 == 7) {
                var21++;
                var20++;
            }
            class244.field3610[arg1].field1523 = (var19 << 28) + (var20 << 14) + var21;
            return false;
        } else {
            int var22 = arg0.method1690((byte) 1, 18);
            int var23 = var22 >> 16;
            int var24 = var22 >> 8 & 0xFF;
            if (arg2 > -67) {
                return false;
            }
            int var25 = var22 & 0xFF;
            int var26 = class244.field3610[arg1].field1523;
            int var27 = (var26 >> 28) + var23 & 0x3;
            int var28 = (var26 >> 14) + var24 & 0xFF;
            int var29 = var25 + var26 & 0xFF;
            class244.field3610[arg1].field1523 = (var27 << 28) + (var28 << 14) + var29;
            return false;
        }
    }

    @OriginalMember(owner = "client!lo", name = "<init>", descriptor = "(I)V")
    public class528(int arg0) {
        this.field7812 = arg0;
    }
}
