import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bn")
public class class66 extends class96 {

    @OriginalMember(owner = "client!bn", name = "K", descriptor = "I")
    public int field1030 = 0;

    @OriginalMember(owner = "client!bn", name = "L", descriptor = "I")
    public int field1031 = -1;

    @OriginalMember(owner = "client!bn", name = "S", descriptor = "I")
    public int field1038 = 12800;

    @OriginalMember(owner = "client!bn", name = "Z", descriptor = "I")
    public int field1045 = 0;

    @OriginalMember(owner = "client!bn", name = "cb", descriptor = "I")
    public int field1048 = 12800;

    @OriginalMember(owner = "client!bn", name = "P", descriptor = "Z")
    public boolean field1035 = true;

    @OriginalMember(owner = "client!bn", name = "db", descriptor = "I")
    public int field1049 = -1;

    @OriginalMember(owner = "client!bn", name = "T", descriptor = "I")
    public int field1039;

    @OriginalMember(owner = "client!bn", name = "bb", descriptor = "Lna;")
    public class26 field1047;

    @OriginalMember(owner = "client!bn", name = "Q", descriptor = "Lna;")
    public class26 field1036;

    @OriginalMember(owner = "client!bn", name = "Y", descriptor = "I")
    public int field1044;

    @OriginalMember(owner = "client!bn", name = "ab", descriptor = "Lih;")
    public class32 field1046;

    @OriginalMember(owner = "client!bn", name = "V", descriptor = "I")
    public static int field1041 = 0;

    @OriginalMember(owner = "client!bn", name = "eb", descriptor = "I")
    public static int field1050 = 0;

    @OriginalMember(owner = "client!bn", name = "I", descriptor = "I")
    public static int field1028;

    @OriginalMember(owner = "client!bn", name = "J", descriptor = "I")
    public static int field1029;

    @OriginalMember(owner = "client!bn", name = "M", descriptor = "I")
    public static int field1032;

    @OriginalMember(owner = "client!bn", name = "O", descriptor = "I")
    public static int field1034;

    @OriginalMember(owner = "client!bn", name = "R", descriptor = "I")
    public static int field1037;

    @OriginalMember(owner = "client!bn", name = "U", descriptor = "I")
    public static int field1040;

    @OriginalMember(owner = "client!bn", name = "W", descriptor = "I")
    public static int field1042;

    @OriginalMember(owner = "client!bn", name = "X", descriptor = "I")
    public static int field1043;

    @OriginalMember(owner = "client!bn", name = "N", descriptor = "Lbe;")
    public static class297 field1033;

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(IBI)Z", line = 4)
    public final boolean method489(int arg0, byte arg1, int arg2) {
        field1042++;
        if (this.field1038 > arg2 || arg2 > this.field1045 || arg0 < this.field1048 || arg0 > this.field1030) {
            return false;
        }
        for (class23 var4 = (class23) this.field1046.method264(-28); var4 != null; var4 = (class23) this.field1046.method263(arg1 - 93)) {
            if (var4.method143((byte) -45, arg0, arg2)) {
                return true;
            }
        }
        if (arg1 != 97) {
            method496(-51, 82);
        }
        return false;
    }

    @OriginalMember(owner = "client!bn", name = "<init>", descriptor = "(Lna;Lna;IIIZI)V", line = 269)
    public class66(class26 arg0, class26 arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        this.field1039 = arg3;
        this.field1031 = arg4;
        this.field1035 = arg5;
        this.field1047 = arg0;
        this.field1036 = arg1;
        this.field1049 = arg6;
        this.field1044 = arg2;
        if (this.field1049 == 255) {
            this.field1049 = 0;
        }
        this.field1046 = new class32();
    }

    @OriginalMember(owner = "client!bn", name = "f", descriptor = "(B)V", line = 46)
    public final void method490(byte arg0) {
        field1037++;
        this.field1048 = 12800;
        this.field1045 = 0;
        if (arg0 != 103) {
            field1033 = (class297) null;
        }
        this.field1030 = 0;
        this.field1038 = 12800;
        for (class23 var2 = (class23) this.field1046.method264(-74); var2 != null; var2 = (class23) this.field1046.method263(4)) {
            if (var2.field332 < this.field1048) {
                this.field1048 = var2.field332;
            }
            if (var2.field330 < this.field1038) {
                this.field1038 = var2.field330;
            }
            if (var2.field333 > this.field1045) {
                this.field1045 = var2.field333;
            }
            if (this.field1030 < var2.field335) {
                this.field1030 = var2.field335;
            }
        }
    }

    @OriginalMember(owner = "client!bn", name = "c", descriptor = "(II)V", line = 80)
    public static final void method491(int arg0, int arg1) {
        if (arg0 != 0) {
            method494((byte) 73);
        }
        class157.field2447.method1985(arg0 ^ 0xFFFFFF82, arg1);
        field1029++;
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(III)I", line = 92)
    public static final int method492(int arg0, int arg1, int arg2) {
        if (arg1 != -14314) {
            return 116;
        }
        int var3 = 0;
        field1032++;
        while (arg0 > 0) {
            var3 = var3 << 1 | arg2 & 0x1;
            arg2 >>>= 0x1;
            arg0--;
        }
        return var3;
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(BZLna;)V", line = 125)
    public static final void method493(byte arg0, boolean arg1, class26 arg2) {
        field1028++;
        class26 var3 = arg2.method165(-98);
        int var4 = 0;
        int var5 = -26 / ((62 - arg0) / 58);
        short[] var6 = new short[16];
        int var7 = arg1 ? 32768 : 0;
        int var8 = (arg1 ? class236.field3763 : class243.field3997) + var7;
        for (int var9 = var7; var9 < var8; var9++) {
            class281 var10 = class56.method410(12345678, var9);
            if (var10.field4677 && var10.method1976(-1).method165(-98).method182(var3, 112) != -1) {
                if (var4 >= 50) {
                    class212.field3288 = -1;
                    class67.field1053 = null;
                    return;
                }
                if (var4 >= var6.length) {
                    short[] var11 = new short[var6.length * 2];
                    for (int var12 = 0; var12 < var4; var12++) {
                        var11[var12] = var6[var12];
                    }
                    var6 = var11;
                }
                var6[var4++] = (short) var9;
            }
        }
        class67.field1053 = var6;
        class212.field3288 = var4;
        class241.field3891 = 0;
        class26[] var13 = new class26[class212.field3288];
        for (int var14 = 0; var14 < class212.field3288; var14++) {
            var13[var14] = class56.method410(12345678, var6[var14]).method1976(-1);
        }
        class240.method1651(var13, class67.field1053, 100);
    }

    @OriginalMember(owner = "client!bn", name = "g", descriptor = "(B)V", line = 201)
    public static void method494(byte arg0) {
        if (arg0 != -46) {
            field1034 = 7;
        }
        field1033 = null;
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(IIB)I", line = 211)
    public static final int method495(int arg0, int arg1, byte arg2) {
        field1043++;
        if (arg2 > -71) {
            return -52;
        } else {
            int var3 = class324.method2248(arg0 - 1, 38, arg1 - 1) + class324.method2248(arg0 + 1, 38, arg1 - 1) - (-class324.method2248(arg0 + -1, 38, arg1 - -1) + -class324.method2248(arg0 + 1, 38, arg1 - -1));
            int var4 = class324.method2248(arg0 - 1, 38, arg1) + class324.method2248(arg0 + 1, 38, arg1) + (class324.method2248(arg0, 38, arg1 + -1) - -class324.method2248(arg0, 38, arg1 + 1));
            int var5 = class324.method2248(arg0, 38, arg1);
            return var3 / 16 + var4 / 8 + (var5 / 4);
        }
    }

    @OriginalMember(owner = "client!bn", name = "d", descriptor = "(II)Z", line = 238)
    public static final boolean method496(int arg0, int arg1) {
        field1040++;
        if (arg0 == -49) {
            return arg1 >= 48 && arg1 <= 57;
        } else {
            return true;
        }
    }
}
