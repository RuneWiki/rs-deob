import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class100 extends class112 {

    @OriginalMember(owner = "client!p", name = "O", descriptor = "I")
    private int field1451 = 0;

    @OriginalMember(owner = "client!p", name = "L", descriptor = "I")
    private int field1448 = 10;

    @OriginalMember(owner = "client!p", name = "T", descriptor = "I")
    private int field1456 = 2048;

    @OriginalMember(owner = "client!p", name = "N", descriptor = "Lwm;")
    public static class152 field1450 = class157.method1048(" loggt sich aus)3", 93);

    @OriginalMember(owner = "client!p", name = "R", descriptor = "Z")
    public static boolean field1454 = true;

    @OriginalMember(owner = "client!p", name = "X", descriptor = "Lwm;")
    public static class152 field1460 = class157.method1048("; version=1; path=)4; domain=", 105);

    @OriginalMember(owner = "client!p", name = "P", descriptor = "Z")
    public static boolean field1452 = false;

    @OriginalMember(owner = "client!p", name = "K", descriptor = "I")
    public static int field1447;

    @OriginalMember(owner = "client!p", name = "M", descriptor = "I")
    public static int field1449;

    @OriginalMember(owner = "client!p", name = "S", descriptor = "I")
    public static int field1455;

    @OriginalMember(owner = "client!p", name = "U", descriptor = "I")
    public static int field1457;

    @OriginalMember(owner = "client!p", name = "W", descriptor = "I")
    public static int field1459;

    @OriginalMember(owner = "client!p", name = "Y", descriptor = "I")
    public static int field1461;

    @OriginalMember(owner = "client!p", name = "ab", descriptor = "I")
    public static int field1463;

    @OriginalMember(owner = "client!p", name = "bb", descriptor = "I")
    public static int field1464;

    @OriginalMember(owner = "client!p", name = "Z", descriptor = "Z")
    public static boolean field1462;

    @OriginalMember(owner = "client!p", name = "Q", descriptor = "[I")
    private int[] field1453;

    @OriginalMember(owner = "client!p", name = "V", descriptor = "[I")
    private int[] field1458;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(ILah;I)Lmj;", line = 7)
    public static final class229 method672(int arg0, class205 arg1, int arg2) {
        field1457++;
        if (class52.method356((byte) 94, arg1, arg2)) {
            if (arg0 != 2) {
                method672(-100, (class205) null, 42);
            }
            return class156.method1041(arg0 + 118);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!p", name = "e", descriptor = "(I)V", line = 23)
    public final void method673(int arg0) {
        if (arg0 == 8) {
            this.method675(false);
            field1463++;
        }
    }

    @OriginalMember(owner = "client!p", name = "h", descriptor = "(I)V", line = 37)
    public static void method674(int arg0) {
        field1460 = null;
        if (arg0 != -4096) {
            method674(-50);
        }
        field1450 = null;
    }

    @OriginalMember(owner = "client!p", name = "<init>", descriptor = "()V", line = 52)
    public class100() {
        super(0, true);
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Z)V", line = 64)
    private final void method675(boolean arg0) {
        this.field1458 = new int[this.field1448 + 1];
        this.field1453 = new int[this.field1448 + 1];
        field1455++;
        if (arg0) {
            field1447 = 40;
        }
        int var2 = 0;
        int var3 = 4096 / this.field1448;
        int var4 = this.field1456 * var3 >> 12;
        for (int var5 = 0; var5 < this.field1448; var5++) {
            this.field1458[var5] = var2;
            this.field1453[var5] = var2 + var4;
            var2 += var3;
        }
        this.field1458[this.field1448] = 4096;
        this.field1453[this.field1448] = this.field1453[0] + 4096;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IILhi;)V", line = 102)
    public final void method52(int arg0, int arg1, class291 arg2) {
        field1449++;
        if (arg1 == 0) {
            this.field1448 = arg2.method2011(-40);
        } else if (arg1 == 1) {
            this.field1456 = arg2.method2021((byte) 74);
        } else if (arg1 == 2) {
            this.field1451 = arg2.method2011(arg0 - 31245);
        }
        if (arg0 != 31164) {
            this.method52(-46, -85, (class291) null);
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(BI)[I", line = 173)
    public final int[] method53(byte arg0, int arg1) {
        int[] var3 = this.field1585.method1952(arg1, (byte) 96);
        field1459++;
        if (arg0 != -3) {
            this.method675(false);
        }
        if (this.field1585.field4935) {
            int var4 = class114.field1620[arg1];
            if (this.field1451 == 0) {
                short var11 = 0;
                for (int var12 = 0; var12 < this.field1448; var12++) {
                    if (this.field1458[var12] <= var4 && var4 < this.field1458[var12 + 1]) {
                        if (this.field1453[var12] > var4) {
                            var11 = 4096;
                        }
                        break;
                    }
                }
                class187.method1245(var3, 0, class58.field889, var11);
            } else {
                for (int var5 = 0; var5 < class58.field889; var5++) {
                    short var6 = 0;
                    int var7 = 0;
                    int var8 = class131.field1992[var5];
                    int var9 = this.field1451;
                    if (var9 == 1) {
                        var7 = var8;
                    } else if (var9 == 2) {
                        var7 = (var4 + var8 - 4096 >> 1) + 2048;
                    } else if (var9 == 3) {
                        var7 = (var8 - var4 >> 1) + 2048;
                    }
                    for (int var10 = 0; var10 < this.field1448; var10++) {
                        if (this.field1458[var10] <= var7 && this.field1458[var10 + 1] > var7) {
                            if (this.field1453[var10] > var7) {
                                var6 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var5] = var6;
                }
            }
        }
        return var3;
    }
}
