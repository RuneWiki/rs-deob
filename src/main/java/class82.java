import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ho")
public class class82 extends class376 {

    @OriginalMember(owner = "client!ho", name = "m", descriptor = "I")
    public int field1262;

    @OriginalMember(owner = "client!ho", name = "n", descriptor = "I")
    public int field1263;

    @OriginalMember(owner = "client!ho", name = "o", descriptor = "I")
    public static int field1264;

    @OriginalMember(owner = "client!ho", name = "q", descriptor = "I")
    public static int field1266;

    @OriginalMember(owner = "client!ho", name = "r", descriptor = "I")
    public static int field1267;

    @OriginalMember(owner = "client!ho", name = "p", descriptor = "Lqj;")
    public static class296 field1265;

    @OriginalMember(owner = "client!ho", name = "c", descriptor = "(I)V", line = 4)
    public static final void method581(int arg0) {
        field1264++;
        if (arg0 != 0) {
            field1265 = null;
        }
        while (class393.field5747.method156(class120.field1712, false) >= 27) {
            int var1 = class393.field5747.method163(15, arg0 - 98);
            if (var1 == 32767) {
                break;
            }
            boolean var2 = false;
            if (class445.field6422[var1] == null) {
                class445.field6422[var1] = new class437();
                class445.field6422[var1].field862 = var1;
                var2 = true;
            }
            class437 var3 = class445.field6422[var1];
            class280.field3837[class71.field1096++] = var1;
            var3.field874 = class35.field541;
            if (var3.field6290 != null && var3.field6290.method1404((byte) 78)) {
                class346.method2217(var3, (byte) -52);
            }
            int var4 = class393.field5747.method163(1, arg0 - 117);
            int var5 = class393.field5747.method163(5, -96);
            var3.method2733(class393.method2556(class393.field5747.method163(14, arg0 - 116), 4), arg0 ^ 0xFFFFFFC1);
            if (var5 > 15) {
                var5 -= 32;
            }
            int var6 = class393.field5747.method163(5, -94);
            if (var6 > 15) {
                var6 -= 32;
            }
            int var7 = class393.field5747.method163(1, arg0 ^ 0xFFFFFF9F);
            if (var7 == 1) {
                class243.field3364[class54.field795++] = var1;
            }
            int var8 = class389.field5706[class393.field5747.method163(3, -101)];
            var3.method399(var3.field6290.field2958, 16383);
            var3.field878 = var3.field6290.field2907 << 3;
            if (var3.field878 == 0) {
                var3.method417((byte) 106, 0);
            } else if (var2) {
                var3.method417((byte) 96, var8);
            }
            var3.method396(var3.method410((byte) 44), (byte) 120, class265.field3617, class307.field4211.field956[0] + var6, class307.field4211.field944[0] + var5, var4 == 1);
            if (var3.field6290.method1404((byte) 36)) {
                class386.method2523(var3.field944[0], -30107, var3, class265.field3617, 0, (class369) null, var3.field956[0], (class354) null);
            }
        }
        class393.field5747.method157(127);
    }

    @OriginalMember(owner = "client!ho", name = "c", descriptor = "(B)V", line = 88)
    public static final void method582(byte arg0) {
        class390.field5738 = null;
        class310.field4243 = null;
        class140.field2006 = null;
        class399.field5841 = null;
        class346.field4844 = null;
        class68.field1065 = null;
        int var1 = -27 / ((arg0 + 30) / 39);
        class267.field3651 = null;
        field1267++;
        class289.field4000 = null;
        class361.field5069 = null;
        class166.field2368 = null;
        class418.field6051 = null;
        class429.field6174 = null;
    }

    @OriginalMember(owner = "client!ho", name = "d", descriptor = "(I)V", line = 109)
    public static void method583(int arg0) {
        field1265 = null;
        if (arg0 != 0) {
            method582((byte) 117);
        }
    }

    @OriginalMember(owner = "client!ho", name = "<init>", descriptor = "(II)V", line = 122)
    public class82(int arg0, int arg1) {
        this.field1262 = arg1;
        this.field1263 = arg0;
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(ZI)I", line = 132)
    public static final int method584(boolean arg0, int arg1) {
        field1266++;
        int var2 = 0;
        if (arg1 < 0 || arg1 >= 65536) {
            var2 += 16;
            arg1 >>>= 0x10;
        }
        if (arg1 >= 256) {
            arg1 >>>= 0x8;
            var2 += 8;
        }
        if (arg1 >= 16) {
            var2 += 4;
            arg1 >>>= 0x4;
        }
        if (!arg0) {
            method584(true, -61);
        }
        if (arg1 >= 4) {
            var2 += 2;
            arg1 >>>= 0x2;
        }
        if (arg1 >= 1) {
            var2++;
            arg1 >>>= 0x1;
        }
        return arg1 + var2;
    }
}
