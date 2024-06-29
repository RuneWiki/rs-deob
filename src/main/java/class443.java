import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wo")
public class class443 {

    @OriginalMember(owner = "client!wo", name = "f", descriptor = "Lcs;")
    public static class189 field6474 = new class189(16);

    @OriginalMember(owner = "client!wo", name = "h", descriptor = "F")
    public static float field6476;

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "I")
    public static int field6469;

    @OriginalMember(owner = "client!wo", name = "b", descriptor = "I")
    public static int field6470;

    @OriginalMember(owner = "client!wo", name = "c", descriptor = "I")
    public static int field6471;

    @OriginalMember(owner = "client!wo", name = "d", descriptor = "I")
    public static int field6472;

    @OriginalMember(owner = "client!wo", name = "e", descriptor = "I")
    public static int field6473;

    @OriginalMember(owner = "client!wo", name = "j", descriptor = "I")
    public static int field6478;

    @OriginalMember(owner = "client!wo", name = "i", descriptor = "Lla;")
    public static class262 field6477;

    @OriginalMember(owner = "client!wo", name = "g", descriptor = "Lra;")
    public static class57 field6475;

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(IZ)I", line = 5)
    public static final int method2741(int arg0, boolean arg1) {
        field6472++;
        if (arg1) {
            field6476 = 0.88853747F;
        }
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(II)S", line = 16)
    public static final short method2742(int arg0, int arg1) {
        field6471++;
        if (arg0 <= 102) {
            method2742(46, 96);
        }
        int var2 = arg1 >> 10 & 0x3F;
        int var3 = (arg1 & 0x387) >> 3;
        int var4 = arg1 & 0x7F;
        int var5 = var4 <= 64 ? var3 * var4 >> 7 : (127 - var4) * var3 >> 7;
        int var6 = var4 + var5;
        int var7;
        if (var6 == 0) {
            var7 = var5 << 1;
        } else {
            var7 = (var5 << 8) / var6;
        }
        return (short) (var2 << 10 | var7 >> 4 << 7 | var6);
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(ILjava/lang/String;)Z", line = 48)
    public static final boolean method2743(int arg0, String arg1) {
        field6469++;
        if (arg1 == null) {
            return false;
        }
        for (int var2 = 0; var2 < class100.field1124; var2++) {
            if (arg1.equalsIgnoreCase(class302.field4300[var2])) {
                return true;
            }
        }
        if (arg1.equalsIgnoreCase(class390.field5715.field1847)) {
            return true;
        } else {
            return arg0 != -1;
        }
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(III)V", line = 77)
    public static final void method2744(int arg0, int arg1, int arg2) {
        field6470++;
        if (arg0 < -12) {
            class348 var3 = class385.method2464(6, 1302, arg2);
            var3.method2216((byte) 23);
            var3.field5093 = arg1;
        }
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(Ljf;BII)V", line = 92)
    public static final void method2745(class119 arg0, byte arg1, int arg2, int arg3) {
        if (arg0.field1487 == 0) {
            arg0.field1562 = arg0.field1499;
        } else if (arg0.field1487 == 1) {
            arg0.field1562 = (arg2 - arg0.field1498) / 2 + arg0.field1499;
        } else if (arg0.field1487 == 2) {
            arg0.field1562 = arg2 - arg0.field1498 - arg0.field1499;
        } else if (arg0.field1487 == 3) {
            arg0.field1562 = arg0.field1499 * arg2 >> 14;
        } else if (arg0.field1487 == 4) {
            arg0.field1562 = (arg0.field1499 * arg2 >> 14) + (arg2 - arg0.field1498) / 2;
        } else {
            arg0.field1562 = arg2 - (arg0.field1499 * arg2 >> 14) - arg0.field1498;
        }
        field6473++;
        if (arg0.field1547 == 0) {
            arg0.field1448 = arg0.field1414;
        } else if (arg0.field1547 == 1) {
            arg0.field1448 = (arg3 - arg0.field1552) / 2 + arg0.field1414;
        } else if (arg0.field1547 == 2) {
            arg0.field1448 = arg3 - (arg0.field1552 + arg0.field1414);
        } else if (arg0.field1547 == 3) {
            arg0.field1448 = arg0.field1414 * arg3 >> 14;
        } else if (arg0.field1547 == 4) {
            arg0.field1448 = (arg0.field1414 * arg3 >> 14) + (arg3 - arg0.field1552) / 2;
        } else {
            arg0.field1448 = arg3 - arg0.field1552 - (arg0.field1414 * arg3 >> 14);
        }
        if (arg1 != -22 || !class267.field3764 || client.method1076(arg0).field39 == 0 && arg0.field1535 != 0) {
            return;
        }
        if (arg0.field1562 < 0) {
            arg0.field1562 = 0;
        } else if (arg2 < arg0.field1562 + arg0.field1498) {
            arg0.field1562 = arg2 - arg0.field1498;
        }
        if (arg0.field1448 < 0) {
            arg0.field1448 = 0;
        } else if (arg0.field1448 + arg0.field1552 > arg3) {
            arg0.field1448 = arg3 - arg0.field1552;
            return;
        }
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(IZI)I", line = 167)
    public static final int method2746(int arg0, boolean arg1, int arg2) {
        int var3 = (arg2 & 0x7F) * arg0 >> 7;
        field6478++;
        if (!arg1) {
            method2744(-42, 62, -26);
        }
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg2 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(I)V", line = 189)
    public static void method2747(int arg0) {
        field6474 = null;
        field6477 = null;
        field6475 = null;
        if (arg0 != 8776) {
            field6474 = null;
        }
    }
}
