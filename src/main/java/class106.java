import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class class106 {

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "I")
    public int field1564;

    @OriginalMember(owner = "client!bk", name = "e", descriptor = "Lbk;")
    public static class106 field1568 = new class106(1);

    @OriginalMember(owner = "client!bk", name = "f", descriptor = "Lbk;")
    public static class106 field1569 = new class106(2);

    @OriginalMember(owner = "client!bk", name = "i", descriptor = "Lbk;")
    public static class106 field1572 = new class106(4);

    @OriginalMember(owner = "client!bk", name = "j", descriptor = "Lbk;")
    public static class106 field1573 = new class106(1);

    @OriginalMember(owner = "client!bk", name = "k", descriptor = "Lbk;")
    public static class106 field1574 = new class106(2);

    @OriginalMember(owner = "client!bk", name = "l", descriptor = "Lbk;")
    public static class106 field1575 = new class106(4);

    @OriginalMember(owner = "client!bk", name = "m", descriptor = "Lbk;")
    public static class106 field1576 = new class106(2);

    @OriginalMember(owner = "client!bk", name = "n", descriptor = "Lbk;")
    public static class106 field1577 = new class106(4);

    @OriginalMember(owner = "client!bk", name = "p", descriptor = "[I")
    public static int[] field1579 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "I")
    public static int field1565;

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "I")
    public static int field1566;

    @OriginalMember(owner = "client!bk", name = "d", descriptor = "I")
    public static int field1567;

    @OriginalMember(owner = "client!bk", name = "g", descriptor = "I")
    public static int field1570;

    @OriginalMember(owner = "client!bk", name = "h", descriptor = "I")
    public static int field1571;

    @OriginalMember(owner = "client!bk", name = "o", descriptor = "I")
    public static int field1578;

    @OriginalMember(owner = "client!bk", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field1571++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(III)V")
    public static final void method748(int arg0, int arg1, int arg2) {
        field1567++;
        class489 var3 = class704.method3942(arg2, 12, 0);
        var3.method2797(-1);
        var3.field6952 = arg0;
        if (arg1 <= 37) {
            field1576 = null;
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(I)V")
    public static final void method749(int arg0) {
        if (arg0 != 255) {
            field1578 = -96;
        }
        field1566++;
        if (class332.field4821.method624()) {
            class332.field4821.method672(class410.field6110);
            class189.method1249((byte) 28);
            class332.field4821.method613(class410.field6110);
            class332.field4821.method709(class410.field6110);
        } else {
            class409.method2509(512, class62.field996);
        }
        class12.method83((byte) -120);
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IZ)V")
    public static final void method750(int arg0, boolean arg1) {
        if (arg0 != 1911967790) {
            field1575 = null;
        }
        field1570++;
        if (arg1) {
            if (class567.field8270 != -1) {
                class233.method1441(class567.field8270, (byte) -120);
            }
            for (class200 var2 = (class200) class318.field4623.method1993(-111); var2 != null; var2 = (class200) class318.field4623.method1997(9831)) {
                if (!var2.method2359(arg0 ^ 0x2FE6D662)) {
                    var2 = (class200) class318.field4623.method1993(-95);
                    if (var2 == null) {
                        break;
                    }
                }
                class522.method2950(-3223, false, var2, true);
            }
            class567.field8270 = -1;
            class318.field4623 = new class322(8);
            class261.method1575(-1);
            class567.field8270 = class630.field9125;
            class537.method3101(false, arg0 - 1911964259);
            class12.method83((byte) -128);
            class195.method1273(class567.field8270);
        }
        class317.field4617 = true;
    }

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "(I)V")
    public static void method751(int arg0) {
        field1575 = null;
        field1569 = null;
        field1568 = null;
        field1577 = null;
        field1576 = null;
        if (arg0 > 96) {
            field1572 = null;
            field1573 = null;
            field1574 = null;
            field1579 = null;
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Llr;BI)Z")
    public static final boolean method752(class311 arg0, byte arg1, int arg2) {
        field1565++;
        int var3 = arg0.method1946(2, (byte) 120);
        if (var3 == 0) {
            if (arg0.method1946(1, (byte) 126) != 0) {
                method752(arg0, (byte) -92, arg2);
            }
            int var4 = arg0.method1946(6, (byte) 126);
            int var5 = arg0.method1946(6, (byte) 127);
            boolean var6 = arg0.method1946(1, (byte) 127) == 1;
            if (var6) {
                class191.field2586[class440.field6397++] = arg2;
            }
            if (class35.field551[arg2] != null) {
                throw new RuntimeException("hr:lr");
            }
            class143 var7 = class262.field3402[arg2];
            class71 var8 = class35.field551[arg2] = new class71();
            var8.field7405 = arg2;
            if (class46.field715[arg2] != null) {
                var8.method419(false, class46.field715[arg2]);
            }
            var8.method2956(var7.field2063, true, -57);
            var8.field7423 = var7.field2062;
            int var9 = var7.field2065;
            int var10 = var9 >> 28;
            int var11 = (var9 & 0x3FDAAE) >> 14;
            int var12 = var9 & 0xFF;
            int var13 = (var11 << 6) + var4 - class397.field6005;
            var8.field1140 = var7.field2064;
            int var14 = (var12 << 6) + var5 - class403.field6049;
            var8.field7439[0] = class647.field9308[arg2];
            var8.field7905 = var8.field7900 = (byte) var10;
            if (class125.method898(90, var13, var14)) {
                var8.field7900++;
            }
            var8.method418(0, var13, var14);
            var8.field1108 = false;
            class262.field3402[arg2] = null;
            return true;
        } else if (var3 == 1) {
            int var15 = arg0.method1946(2, (byte) 120);
            int var16 = class262.field3402[arg2].field2065;
            class262.field3402[arg2].field2065 = (((var16 >> 28) + var15 & 0x3) << 28) + (var16 & 0xFFFFFFF);
            return false;
        } else if (var3 == 2) {
            int var17 = arg0.method1946(5, (byte) 124);
            int var18 = var17 >> 3;
            int var19 = var17 & 0x7;
            int var20 = class262.field3402[arg2].field2065;
            int var21 = (var20 >> 28) + var18 & 0x3;
            int var22 = (var20 & 0x3FEC91) >> 14;
            int var23 = var20 & 0xFF;
            if (var19 == 0) {
                var23--;
                var22--;
            }
            if (var19 == 1) {
                var23--;
            }
            if (var19 == 2) {
                var22++;
                var23--;
            }
            if (var19 == 3) {
                var22--;
            }
            if (var19 == 4) {
                var22++;
            }
            if (var19 == 5) {
                var22--;
                var23++;
            }
            if (var19 == 6) {
                var23++;
            }
            if (var19 == 7) {
                var23++;
                var22++;
            }
            class262.field3402[arg2].field2065 = (var21 << 28) + (var22 << 14) + var23;
            return false;
        } else {
            int var24 = arg0.method1946(18, (byte) 125);
            int var25 = var24 >> 16;
            int var26 = (var24 & 0xFFEB) >> 8;
            int var27 = var24 & 0xFF;
            int var28 = class262.field3402[arg2].field2065;
            int var29 = (var28 >> 28) + var25 & 0x3;
            int var30 = (var28 >> 14) + var26 & 0xFF;
            int var31 = 105 / ((arg1 + 41) / 51);
            int var32 = var27 + var28 & 0xFF;
            class262.field3402[arg2].field2065 = (var29 << 28) + (var30 << 14) + var32;
            return false;
        }
    }

    @OriginalMember(owner = "client!bk", name = "<init>", descriptor = "(I)V")
    private class106(int arg0) {
        this.field1564 = arg0;
    }
}
