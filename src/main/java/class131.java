import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ru")
public class class131 extends class42 {

    @OriginalMember(owner = "client!ru", name = "y", descriptor = "Lvr;")
    public static class92 field2054 = new class92(0, 2, 2, 1);

    @OriginalMember(owner = "client!ru", name = "z", descriptor = "F")
    public static float field2055;

    @OriginalMember(owner = "client!ru", name = "p", descriptor = "I")
    public int field2045;

    @OriginalMember(owner = "client!ru", name = "r", descriptor = "I")
    public static int field2047;

    @OriginalMember(owner = "client!ru", name = "s", descriptor = "I")
    public int field2048;

    @OriginalMember(owner = "client!ru", name = "o", descriptor = "[I")
    public int[] field2044;

    @OriginalMember(owner = "client!ru", name = "u", descriptor = "[I")
    public int[] field2050;

    @OriginalMember(owner = "client!ru", name = "v", descriptor = "[I")
    public int[] field2051;

    @OriginalMember(owner = "client!ru", name = "w", descriptor = "[I")
    public static int[] field2052;

    @OriginalMember(owner = "client!ru", name = "q", descriptor = "[Lgm;")
    public class81[] field2046;

    @OriginalMember(owner = "client!ru", name = "t", descriptor = "[Lgm;")
    public class81[] field2049;

    @OriginalMember(owner = "client!ru", name = "x", descriptor = "[[[B")
    public byte[][][] field2053;

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(I)V")
    public static void method964(int arg0) {
        field2054 = null;
        field2052 = null;
        if (arg0 != 1) {
            method965(-41);
        }
    }

    @OriginalMember(owner = "client!ru", name = "b", descriptor = "(I)V")
    public static final void method965(int arg0) {
        field2047++;
        class458.field6647.method861(-1);
        for (class341 var1 = (class341) class258.field3829.method863(arg0 + 23700); var1 != null; var1 = (class341) class258.field3829.method865(arg0 ^ 0x5C94)) {
            if (var1.field5039 < 1000) {
                var1.method421(22071);
                class458.field6647.method866((byte) 10, var1);
            }
        }
        class458.field6647.method855((byte) -88, class258.field3829);
        int var2 = -1;
        if (arg0 != -23701) {
            return;
        }
        class191 var3 = (class191) class425.field6027.method863(-1);
        if (var3 != null) {
            var2 = var3.method1300(arg0 ^ 0xFFFFA36B);
        }
        if (!class248.field3714) {
            if (var2 == 0 && (class390.field5540 == 1 && class430.field6184 > 2 || class256.method1659(-51))) {
                var2 = 2;
            }
            if (var2 == 2 && class430.field6184 > 0 && var3 != null) {
                if (class290.field4312 == null && class488.field7059 == 0) {
                    class302.method1931(var3.method1302(-6), -30, var3.method1301((byte) 39));
                } else {
                    class272.field4083 = 2;
                }
            }
            if (var2 == 0 && class430.field6184 > 0) {
                class294.method1893(12227);
            }
            if (class290.field4312 == null && class488.field7059 == 0) {
                class272.field4083 = 0;
                class277.field4138 = null;
                return;
            }
            return;
        }
        if (var2 == -1) {
            int var4 = class49.field909.method639((byte) -99);
            int var5 = class49.field909.method644(101);
            if (var4 < class252.field3743 - 10 || class252.field3743 + class415.field5887 + 10 < var4 || var5 < class291.field4322 - 10 || class291.field4322 + class517.field7487 + 10 < var5) {
                class287.method1838(true);
            }
        }
        if (var2 != 0) {
            return;
        }
        int var6 = class252.field3743;
        int var7 = class291.field4322;
        int var8 = class415.field5887;
        int var9 = var3.method1301((byte) 39);
        int var10 = var3.method1302(-6);
        int var11 = -1;
        for (int var12 = 0; var12 < class430.field6184; var12++) {
            if (class535.field7888) {
                int var16 = (class430.field6184 - (var12 + 1)) * 16 + var7 + 33;
                if (var9 > var6 && var9 < (var6 + var8) && (var16 - 13) < var10 && (var16 + 4) > var10) {
                    var11 = var12;
                }
            } else {
                int var17 = (class430.field6184 - var12 - 1) * 16 + var7 + 31;
                if (var6 < var9 && (var6 + var8) > var9 && var10 > var17 - 13 && var10 < (var17 + 3)) {
                    var11 = var12;
                }
            }
        }
        if (var11 != -1) {
            int var13 = 0;
            class288 var14 = new class288(class258.field3829);
            for (class341 var15 = (class341) var14.method1846(arg0 ^ 0x1486); var15 != null; var15 = (class341) var14.method1844(95)) {
                if (var11 == var13) {
                    class391.method2359(0, var9, var10, var15);
                }
                var13++;
            }
        }
        class287.method1838(true);
    }
}
