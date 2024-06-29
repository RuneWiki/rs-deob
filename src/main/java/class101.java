import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class101 extends class282 {

    @OriginalMember(owner = "client!pe", name = "t", descriptor = "J")
    public static long field1772 = 0L;

    @OriginalMember(owner = "client!pe", name = "B", descriptor = "Lsf;")
    public static class108 field1780 = class140.method973(255, "rot:");

    @OriginalMember(owner = "client!pe", name = "v", descriptor = "I")
    public static int field1774;

    @OriginalMember(owner = "client!pe", name = "w", descriptor = "I")
    public static int field1775;

    @OriginalMember(owner = "client!pe", name = "x", descriptor = "I")
    public static int field1776;

    @OriginalMember(owner = "client!pe", name = "y", descriptor = "I")
    public static int field1777;

    @OriginalMember(owner = "client!pe", name = "z", descriptor = "I")
    public static int field1778;

    @OriginalMember(owner = "client!pe", name = "D", descriptor = "I")
    public static int field1782;

    @OriginalMember(owner = "client!pe", name = "u", descriptor = "Lpg;")
    public static class205 field1773;

    @OriginalMember(owner = "client!pe", name = "A", descriptor = "Lik;")
    public static class262 field1779;

    @OriginalMember(owner = "client!pe", name = "C", descriptor = "Lik;")
    public static class262 field1781;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(ZB)V", line = 6)
    public static final void method699(boolean arg0, byte arg1) {
        field1782++;
        if (arg0) {
            if (class322.field5511 != -1) {
                class173.method1229(true, class322.field5511);
            }
            for (class158 var2 = (class158) class191.field3456.method1672(0); var2 != null; var2 = (class158) class191.field3456.method1678(-126)) {
                class285.method2042(22, var2, true);
            }
            class322.field5511 = -1;
            class191.field3456 = new class242(8);
            class218.method1499(-32);
            class322.field5511 = class160.field2873;
            class289.method2069(0, false);
            class68.method459(false);
            class266.method1920(class322.field5511, (byte) -110);
        }
        class95.field1513 = new class51();
        if (arg1 != -114) {
            field1781 = (class262) null;
        }
        class95.field1513.field4457 = 3000;
        class95.field1513.field4452 = 3000;
        if (!class231.field4051) {
            class130.method895(arg1 ^ 0x1D, class215.field3801);
            class312.method2177(10, (byte) -102);
            return;
        }
        if (class63.field1021 == 2) {
            class15.field193 = class284.field4967 << 7;
            class255.field4443 = class70.field1084 << 7;
        } else {
            class17.method118(-96);
        }
        class122.method852(-70);
        class3.method25(-64);
        class312.method2177(28, (byte) -118);
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(JB)V", line = 69)
    public static final void method700(long arg0, byte arg1) {
        field1774++;
        if (arg0 == 0L) {
            return;
        }
        if (class176.field3205 >= 100) {
            class210.method1456(class135.field2327, 0, -73, class63.field1016);
            return;
        }
        class108 var3 = class330.method2259((byte) -109, arg0).method755(8975);
        for (int var4 = 0; var4 < class176.field3205; var4++) {
            if (class75.field1153[var4] == arg0) {
                class210.method1456(class117.method833(new class108[] { var3, class19.field286 }, false), 0, -45, class63.field1016);
                return;
            }
        }
        if (arg1 != -29) {
            return;
        }
        for (int var5 = 0; var5 < class120.field2056; var5++) {
            if (class254.field4423[var5] == arg0) {
                class210.method1456(class117.method833(new class108[] { class13.field148, var3, class277.field4871 }, false), 0, -33, class63.field1016);
                return;
            }
        }
        if (var3.method779(class95.field1513.field757, 114)) {
            class210.method1456(class252.field4393, 0, -105, class63.field1016);
            return;
        }
        class59.field882++;
        class75.field1153[class176.field3205] = arg0;
        class51.field752[class176.field3205++] = class330.method2259((byte) -99, arg0);
        class290.field5084 = class242.field4217;
        class256.field4471.method1427(253, arg1 + 29);
        class256.field4471.method1735((byte) -15, arg0);
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIIIBII)V", line = 140)
    public static final void method701(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        field1777++;
        int var7 = class174.method1236(class266.field4677, arg2, class166.field2984, -6219);
        int var8 = class174.method1236(class266.field4677, arg5, class166.field2984, -6219);
        int var9 = class174.method1236(class260.field4593, arg0, class79.field1202, -6219);
        int var10 = class174.method1236(class260.field4593, arg3, class79.field1202, -6219);
        int var11 = class174.method1236(class266.field4677, arg2 + arg1, class166.field2984, -6219);
        int var12 = class174.method1236(class266.field4677, arg5 - arg1, class166.field2984, -6219);
        for (int var13 = var7; var13 < var11; var13++) {
            class209.method1452(var10, class106.field1839[var13], 7, var9, arg6);
        }
        for (int var14 = var8; var14 > var12; var14--) {
            class209.method1452(var10, class106.field1839[var14], 7, var9, arg6);
        }
        int var15 = class174.method1236(class260.field4593, arg0 + arg1, class79.field1202, -6219);
        int var16 = class174.method1236(class260.field4593, arg3 - arg1, class79.field1202, -6219);
        for (int var17 = var11; var17 <= var12; var17++) {
            int[] var18 = class106.field1839[var17];
            class209.method1452(var15, var18, 7, var9, arg6);
            class209.method1452(var10, var18, 7, var16, arg6);
        }
        int var19 = -65 % ((6 - arg4) / 52);
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIIII)V", line = 206)
    public static final void method702(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = 0;
        if (arg0 != -1) {
            method704(67, false);
        }
        while (class273.field4806 > var5) {
            if (arg1 < (class39.field545[var5] + class26.field399[var5]) && class39.field545[var5] < (arg1 + arg2) && (class313.field5409[var5] + class242.field4216[var5]) > arg3 && arg3 + arg4 > class242.field4216[var5]) {
                class47.field692[var5] = true;
            }
            var5++;
        }
        field1778++;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(BII)V", line = 233)
    public static final void method703(byte arg0, int arg1, int arg2) {
        field1776++;
        class120 var3 = class248.method1704(5, 53, arg1);
        var3.method844((byte) -28);
        if (arg0 < 58) {
            method701(-121, 60, -58, -89, (byte) -116, 21, 109);
        }
        var3.field2066 = arg2;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IZ)V", line = 246)
    public static final void method704(int arg0, boolean arg1) {
        field1775++;
        class120 var2 = class248.method1704(4, 103, arg0);
        if (arg1) {
            var2.method843((byte) 28);
        }
    }

    @OriginalMember(owner = "client!pe", name = "f", descriptor = "(I)V", line = 259)
    public static void method705(int arg0) {
        if (arg0 != 11319) {
            method701(78, 7, 85, 80, (byte) -64, 41, -84);
        }
        field1781 = null;
        field1773 = null;
        field1779 = null;
        field1780 = null;
    }
}
