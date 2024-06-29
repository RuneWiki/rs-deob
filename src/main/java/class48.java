import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class48 extends class107 {

    @OriginalMember(owner = "client!rh", name = "K", descriptor = "I")
    private int field708 = 1365;

    @OriginalMember(owner = "client!rh", name = "H", descriptor = "I")
    private int field705 = 20;

    @OriginalMember(owner = "client!rh", name = "Q", descriptor = "I")
    private int field714 = 0;

    @OriginalMember(owner = "client!rh", name = "S", descriptor = "I")
    private int field716 = 0;

    @OriginalMember(owner = "client!rh", name = "F", descriptor = "Ljava/lang/String;")
    public static String field703 = "Mechscape is loading - please wait...";

    @OriginalMember(owner = "client!rh", name = "P", descriptor = "I")
    public static int field713 = 0;

    @OriginalMember(owner = "client!rh", name = "D", descriptor = "[Lai;")
    public static class91[] field701 = new class91[14];

    @OriginalMember(owner = "client!rh", name = "G", descriptor = "I")
    public static int field704;

    @OriginalMember(owner = "client!rh", name = "I", descriptor = "I")
    public static int field706;

    @OriginalMember(owner = "client!rh", name = "J", descriptor = "I")
    public static int field707;

    @OriginalMember(owner = "client!rh", name = "L", descriptor = "I")
    public static int field709;

    @OriginalMember(owner = "client!rh", name = "N", descriptor = "I")
    public static int field711;

    @OriginalMember(owner = "client!rh", name = "O", descriptor = "J")
    public static long field712;

    @OriginalMember(owner = "client!rh", name = "R", descriptor = "Z")
    public static boolean field715;

    @OriginalMember(owner = "client!rh", name = "E", descriptor = "[I")
    public static int[] field702;

    @OriginalMember(owner = "client!rh", name = "M", descriptor = "[[[Lke;")
    public static class116[][][] field710;

    @OriginalMember(owner = "client!rh", name = "<init>", descriptor = "()V")
    public class48() {
        super(0, true);
    }

    @OriginalMember(owner = "client!rh", name = "e", descriptor = "(I)V")
    public static void method313(int arg0) {
        field703 = null;
        field702 = null;
        field710 = null;
        int var1 = -106 % ((67 - arg0) / 53);
        field701 = null;
    }

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "(II)Z")
    public static final boolean method314(int arg0, int arg1) {
        ++field711;
        if (~class199.field3191 == ~arg1) {
            return false;
        } else {
            class101.field1582 = new int[104][104];
            class144.field2319 = new int[104][104];
            if (arg0 != 1) {
                return false;
            } else {
                class28.field499 = new int[104][104];
                class290.field4757 = new int[4][13][13];
                for (int var2 = 0; var2 < 4; ++var2) {
                    class310.field5021[var2] = new class55(104, 104);
                }
                class217.field3412 = new byte[4][104][104];
                class296.field4827 = new class223[4][104][104];
                class214.field3386 = new byte[4][104][104];
                class199.field3191 = arg1;
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "(II)[I")
    public final int[] method189(int arg0, int arg1) {
        int[] var3 = super.field1661.method894(-124, arg1);
        if (super.field1661.field2115) {
            for (int var4 = 0; class24.field443 > var4; ++var4) {
                int var5 = (class221.field3486[var4] << 12) / this.field708 + this.field716;
                int var6 = (class259.field4254[arg1] << 12) / this.field708 + this.field714;
                int var7 = var5;
                int var8 = var6;
                int var9 = var5;
                int var10 = var6;
                int var11 = var6 * var6 >> 12;
                int var12 = var5 * var5 >> 12;
                int var13 = 0;
                while (var12 - -var11 < 16384 && var13 < this.field705) {
                    ++var13;
                    var10 = (var9 * var10 >> 12) * 2 + var8;
                    var9 = -var11 + var7 + var12;
                    var11 = var10 * var10 >> 12;
                    var12 = var9 * var9 >> 12;
                }
                var3[var4] = this.field705 + -1 > var13 ? (var13 << 12) / this.field705 : 0;
            }
        }
        ++field704;
        int var14 = -42 / ((-34 - arg0) / 49);
        return var3;
    }

    @OriginalMember(owner = "client!rh", name = "f", descriptor = "(I)[Lud;")
    public static final class2[] method315(int arg0) {
        class2[] var1 = new class2[class98.field1559];
        ++field707;
        if (arg0 > -58) {
            return null;
        } else {
            for (int var2 = 0; var2 < class98.field1559; ++var2) {
                var1[var2] = new class2(class14.field295, class13.field272, class80.field1286[var2], class211.field3364[var2], class217.field3413[var2], class140.field2284[var2], class232.field3635[var2], class310.field5024);
            }
            class180.method1265(39);
            return var1;
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lhd;I)V")
    public static final void method316(class12 arg0, int arg1) {
        ++field706;
        class273 var2 = (class273) class33.field546.method371(-116, class162.method1114((byte) -113, arg0.field222));
        if (arg1 <= 59) {
            method315(12);
        }
        if (var2 != null) {
            if (var2.field4413 != null) {
                class89.field1397.method1357(var2.field4413);
                var2.field4413 = null;
            }
            var2.method952((byte) 46);
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(ILfj;B)V")
    public final void method195(int arg0, class274 arg1, byte arg2) {
        if (arg2 != 28) {
            method315(49);
        }
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (arg0 != 2) {
                    if (~arg0 == -4) {
                        this.field714 = arg1.method1837(252);
                    }
                } else {
                    this.field716 = arg1.method1837(252);
                }
            } else {
                this.field705 = arg1.method1837(arg2 ^ 224);
            }
        } else {
            this.field708 = arg1.method1837(252);
        }
        ++field709;
    }
}
