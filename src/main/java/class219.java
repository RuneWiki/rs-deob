import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class219 extends class86 {

    @OriginalMember(owner = "client!pa", name = "x", descriptor = "I")
    public int field3429;

    @OriginalMember(owner = "client!pa", name = "B", descriptor = "I")
    public int field3433;

    @OriginalMember(owner = "client!pa", name = "y", descriptor = "Ljava/lang/String;")
    public static String field3430 = "You can't add yourself to your own friend list.";

    @OriginalMember(owner = "client!pa", name = "w", descriptor = "I")
    public static int field3428 = 0;

    @OriginalMember(owner = "client!pa", name = "p", descriptor = "I")
    public static int field3421;

    @OriginalMember(owner = "client!pa", name = "q", descriptor = "I")
    public static int field3422;

    @OriginalMember(owner = "client!pa", name = "r", descriptor = "I")
    public static int field3423;

    @OriginalMember(owner = "client!pa", name = "s", descriptor = "I")
    public static int field3424;

    @OriginalMember(owner = "client!pa", name = "u", descriptor = "I")
    public static int field3426;

    @OriginalMember(owner = "client!pa", name = "v", descriptor = "I")
    public static int field3427;

    @OriginalMember(owner = "client!pa", name = "z", descriptor = "I")
    public static int field3431;

    @OriginalMember(owner = "client!pa", name = "A", descriptor = "I")
    public static int field3432;

    @OriginalMember(owner = "client!pa", name = "C", descriptor = "I")
    public static int field3434;

    @OriginalMember(owner = "client!pa", name = "D", descriptor = "I")
    public static int field3435;

    @OriginalMember(owner = "client!pa", name = "E", descriptor = "I")
    public static int field3436;

    @OriginalMember(owner = "client!pa", name = "F", descriptor = "I")
    public static int field3437;

    @OriginalMember(owner = "client!pa", name = "o", descriptor = "Luf;")
    public static class176 field3420;

    @OriginalMember(owner = "client!pa", name = "t", descriptor = "Luf;")
    public static class176 field3425;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(B)I")
    public final int method1456(byte arg0) {
        if (arg0 != 121) {
            this.field3429 = -28;
        }
        field3435++;
        return class261.method1774(this.field3429, 70);
    }

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "(I)Z")
    public static final boolean method1457(int arg0) {
        field3437++;
        if (class295.field4641 == 0) {
            int var1 = -87 / (arg0 / 40);
            return class61.field988.method1733(13308);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "(I)Z")
    public final boolean method1458(int arg0) {
        if (arg0 != 7475) {
            method1461();
        }
        field3423++;
        return (this.field3429 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "(B)Z")
    public final boolean method1459(byte arg0) {
        field3421++;
        if (arg0 > -45) {
            field3425 = null;
        }
        return (this.field3429 & 0x7390671A) >> 30 != 0;
    }

    @OriginalMember(owner = "client!pa", name = "e", descriptor = "(I)Z")
    public final boolean method1460(int arg0) {
        if (arg0 != 1) {
            this.method1456((byte) -49);
        }
        field3424++;
        return (this.field3429 >> 22 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "()V")
    public static final void method1461() {
        if (class71.field1134 != null) {
            for (int var0 = 0; var0 < class71.field1134.length; var0++) {
                for (int var1 = 0; var1 < class113.field1777; var1++) {
                    for (int var2 = 0; var2 < class191.field3032; var2++) {
                        class71.field1134[var0][var1][var2] = null;
                    }
                }
            }
        }
        if (class88.field1439 != null) {
            for (int var3 = 0; var3 < class88.field1439.length; var3++) {
                for (int var4 = 0; var4 < class113.field1777; var4++) {
                    for (int var5 = 0; var5 < class191.field3032; var5++) {
                        class88.field1439[var3][var4][var5] = null;
                    }
                }
            }
        }
        class173.field2576 = 0;
        if (class61.field990 != null) {
            for (int var6 = 0; var6 < class173.field2576; var6++) {
                class61.field990[var6] = null;
            }
        }
        if (class75.field1264 != null) {
            for (int var7 = 0; var7 < class273.field4306; var7++) {
                class75.field1264[var7] = null;
            }
            class273.field4306 = 0;
        }
        if (class295.field4642 != null) {
            for (int var8 = 0; var8 < class295.field4642.length; var8++) {
                class295.field4642[var8] = null;
            }
        }
    }

    @OriginalMember(owner = "client!pa", name = "f", descriptor = "(I)V")
    public static final void method1462(int arg0) {
        class244.field3782.method1783(arg0 - 1027033762);
        class130.field2018.method1783(arg0 - 1027033762);
        field3426++;
        class126.field1980.method1783(0);
        class159.field2442.method1783(arg0 ^ arg0);
    }

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "(B)Z")
    public final boolean method1463(byte arg0) {
        field3432++;
        if (arg0 == -17) {
            return ((this.field3429 & 0x3D374AA2) >> 29) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "(Z)V")
    public static void method1464(boolean arg0) {
        if (!arg0) {
            field3425 = null;
            field3420 = null;
            field3430 = null;
        }
    }

    @OriginalMember(owner = "client!pa", name = "g", descriptor = "(I)I")
    public final int method1465(int arg0) {
        if (arg0 <= 31) {
            this.method1467(124);
        }
        field3427++;
        return (this.field3429 & 0x1CC249) >> 18;
    }

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "(B)Z")
    public final boolean method1466(byte arg0) {
        if (arg0 != 82) {
            field3425 = null;
        }
        field3422++;
        return (this.field3429 >> 21 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!pa", name = "h", descriptor = "(I)Z")
    public final boolean method1467(int arg0) {
        int var2 = 11 / ((7 - arg0) / 59);
        field3436++;
        return (this.field3429 >> 31 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(II)Z")
    public final boolean method1468(int arg0, int arg1) {
        if (arg1 != -31322) {
            field3425 = null;
        }
        field3431++;
        return (this.field3429 >> arg0 + 1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!pa", name = "<init>", descriptor = "(II)V")
    public class219(int arg0, int arg1) {
        this.field3429 = arg0;
        this.field3433 = arg1;
    }

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "(Z)Z")
    public final boolean method1469(boolean arg0) {
        if (arg0) {
            field3434++;
            return (this.field3429 >> 28 & 0x1) != 0;
        } else {
            return false;
        }
    }
}
