import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public abstract class class267 extends class46 {

    @OriginalMember(owner = "client!jd", name = "t", descriptor = "[Z")
    public static boolean[] field4166 = new boolean[5];

    @OriginalMember(owner = "client!jd", name = "w", descriptor = "Ljava/lang/String;")
    public static String field4169 = "Opened title screen";

    @OriginalMember(owner = "client!jd", name = "v", descriptor = "[Lon;")
    public static class328[] field4168 = new class328[50];

    @OriginalMember(owner = "client!jd", name = "o", descriptor = "I")
    public static int field4161;

    @OriginalMember(owner = "client!jd", name = "p", descriptor = "I")
    public static int field4162;

    @OriginalMember(owner = "client!jd", name = "q", descriptor = "I")
    public static int field4163;

    @OriginalMember(owner = "client!jd", name = "s", descriptor = "I")
    public static int field4165;

    @OriginalMember(owner = "client!jd", name = "u", descriptor = "I")
    public static int field4167;

    @OriginalMember(owner = "client!jd", name = "x", descriptor = "I")
    public static int field4170;

    @OriginalMember(owner = "client!jd", name = "y", descriptor = "I")
    public static int field4171;

    @OriginalMember(owner = "client!jd", name = "z", descriptor = "I")
    public static int field4172;

    @OriginalMember(owner = "client!jd", name = "A", descriptor = "I")
    public static int field4173;

    @OriginalMember(owner = "client!jd", name = "B", descriptor = "I")
    public static int field4174;

    @OriginalMember(owner = "client!jd", name = "r", descriptor = "Z")
    public boolean field4164;

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "(I)V", line = 8)
    public static void method1833(int arg0) {
        field4168 = null;
        field4166 = null;
        int var1 = -48 % ((-arg0 - 69) / 57);
        field4169 = null;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(B)Z", line = 22)
    public final boolean method1835(byte arg0) {
        if (arg0 > -50) {
            method1833(26);
        }
        field4162++;
        return false;
    }

    @OriginalMember(owner = "client!jd", name = "f", descriptor = "(I)I", line = 38)
    public final int method1837(int arg0) {
        field4174++;
        return arg0 == 0 ? 1 : 21;
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "()I", line = 53)
    public int method1839() {
        field4172++;
        return 0;
    }

    @OriginalMember(owner = "client!jd", name = "g", descriptor = "(I)Z", line = 63)
    public final boolean method1840(int arg0) {
        field4170++;
        return arg0 <= 13 ? true : this.field4164;
    }

    @OriginalMember(owner = "client!jd", name = "h", descriptor = "(I)Z", line = 75)
    public final boolean method1841(int arg0) {
        if (arg0 != 1000) {
            this.field4164 = true;
        }
        field4173++;
        return false;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IZ)Ljava/lang/String;", line = 93)
    public static final String method1844(int arg0, boolean arg1) {
        field4165++;
        if (!arg1) {
            return (String) null;
        } else if (arg0 < 100000) {
            return "<col=ffff00>" + arg0 + "</col>";
        } else if (arg0 < 10000000) {
            return "<col=ffffff>" + arg0 / 1000 + class327.field5091 + "</col>";
        } else {
            return "<col=00ff80>" + arg0 / 1000000 + class130.field2044 + "</col>";
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(III)Z", line = 119)
    public static final boolean method1845(int arg0, int arg1, int arg2) {
        field4161++;
        if (!class339.field5305) {
            return false;
        }
        int var3 = arg0 >> 16;
        if (arg2 != 1003) {
            method1844(-84, false);
        }
        int var4 = arg0 & 0xFFFF;
        if (class163.field2463[var3] == null || class163.field2463[var3][var4] == null) {
            return false;
        }
        class220 var5 = class163.field2463[var3][var4];
        if (arg1 == -1 && var5.field3468 == 0) {
            for (int var6 = 0; var6 < class301.field4706; var6++) {
                if (class233.field3689[var6] == 18 || class233.field3689[var6] == 1003 || class233.field3689[var6] == 21 || class233.field3689[var6] == 34 || class233.field3689[var6] == 3) {
                    for (class220 var7 = class68.method524((byte) -107, class95.field1528[var6]); var7 != null; var7 = class67.method513(20786, var7)) {
                        if (var5.field3404 == var7.field3404) {
                            return true;
                        }
                    }
                }
            }
        } else {
            for (int var8 = 0; var8 < class301.field4706; var8++) {
                if (class307.field4774[var8] == arg1 && class95.field1528[var8] == var5.field3404 && (class233.field3689[var8] == 18 || class233.field3689[var8] == 1003 || class233.field3689[var8] == 21 || class233.field3689[var8] == 34 || class233.field3689[var8] == 3)) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(B)V", line = 186)
    public static final void method1846(byte arg0) {
        field4163++;
        if (arg0 < 24) {
            field4169 = (String) null;
        }
        class227.field3596.method2174(-10385);
    }

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "(I)V")
    public abstract void method1832(int arg0);

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "()V")
    public abstract void method1834();

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIIII)V")
    public abstract void method1836(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(II)V")
    public abstract void method1838(int arg0, int arg1);

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "()Z")
    public abstract boolean method1842();

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "()Z")
    public abstract boolean method1843();
}
