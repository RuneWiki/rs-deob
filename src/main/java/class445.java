import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class445 {

    @OriginalMember(owner = "client!df", name = "b", descriptor = "Z")
    public static boolean field6183 = false;

    @OriginalMember(owner = "client!df", name = "h", descriptor = "Lhb;")
    public static class250 field6189;

    @OriginalMember(owner = "client!df", name = "i", descriptor = "I")
    public static int field6190;

    @OriginalMember(owner = "client!df", name = "c", descriptor = "I")
    public static int field6184;

    @OriginalMember(owner = "client!df", name = "d", descriptor = "I")
    public static int field6185;

    @OriginalMember(owner = "client!df", name = "e", descriptor = "I")
    public static int field6186;

    @OriginalMember(owner = "client!df", name = "f", descriptor = "I")
    public static int field6187;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "Lj;")
    public class254 field6182;

    @OriginalMember(owner = "client!df", name = "g", descriptor = "Lc;")
    public class507 field6188;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IIIBIIIIIIIIII)V")
    public static final void method2637(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        field6185++;
        if (class92.field1285 == null) {
            return;
        }
        class395 var15;
        if (arg0 < 0) {
            int var14 = -arg0 - 1;
            if (class166.field2149 == var14) {
                var15 = class37.field573;
            } else {
                var15 = class76.field952[var14];
            }
        } else {
            int var16 = arg0 - 1;
            var15 = class527.field7791[var16];
        }
        if (var15 == null) {
            return;
        }
        class402 var17 = class52.field715.method1164(arg1, 0);
        int var18;
        int var19;
        if (arg4 == 1 || arg4 == 3) {
            var19 = var17.field5396;
            var18 = var17.field5340;
        } else {
            var18 = var17.field5396;
            var19 = var17.field5340;
        }
        int var20 = (var19 >> 1) + arg11;
        int var21 = arg11 + (var19 + 1 >> 1);
        int var22 = (var18 >> 1) + arg7;
        int var23 = (var18 + 1 >> 1) + arg7;
        class251 var24 = class92.field1285[arg6];
        int var25 = var24.method1187(var20, var22) + var24.method1187(var21, var22) + (var24.method1187(var20, var23) - -var24.method1187(var21, var23)) >> 2;
        class353 var26 = new class353();
        var26.field4522 = var15.field6220;
        if (arg9 < arg5) {
            int var27 = arg5;
            arg5 = arg9;
            arg9 = var27;
        }
        var26.field4523 = arg1;
        var26.field4507 = class264.field3353 + arg10;
        var26.field4518 = arg12;
        var26.field4508 = arg4;
        var26.field4524 = class264.field3353 + arg2;
        if (arg3 > -126) {
            field6189 = null;
        }
        var26.field4515 = arg7;
        var26.field4513 = arg11;
        if (arg13 > arg8) {
            int var28 = arg13;
            arg13 = arg8;
            arg8 = var28;
        }
        var26.field4519 = arg9 + arg11;
        var26.field4509 = arg5 + arg11;
        var26.field4511 = (var26.field4513 << 7) + (var19 << 6);
        var26.field4516 = arg7 + arg13;
        var26.field4512 = arg7 + arg8;
        var26.field4520 = (var26.field4515 << 7) + (var18 << 6);
        var26.field4510 = var25;
        class206.field2682.method42(var26, 0);
        var15.field5250 = var26;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(B)V")
    public static final void method2638(byte arg0) {
        class301.field3900.method47(0);
        field6187++;
        class502 var1 = (class502) class103.field1421.method49(arg0 ^ 0x4D);
        if (arg0 != 33) {
            method2639(92, -36);
        }
        while (var1 != null) {
            if (var1.field7390 < 1000) {
                var1.method3021(-105);
                class301.field3900.method42(var1, arg0 - 33);
            }
            var1 = (class502) class103.field1421.method46((byte) 61);
        }
        class301.field3900.method43(class103.field1421, 82);
        int var2 = -1;
        class228 var3 = (class228) class61.field792.method49(arg0 - 135);
        if (var3 != null) {
            var2 = var3.method1439(-126);
        }
        if (!class450.field6267) {
            if (var2 == 0 && (class353.field4531 == 1 && class271.field3433 > 2 || class203.method1331((byte) 93))) {
                var2 = 2;
            }
            if (var2 == 2 && class271.field3433 > 0 && var3 != null) {
                if (class465.field6838 == null && class142.field1882 == 0) {
                    class258.method1616((byte) 101, var3.method1442((byte) 71), var3.method1444(arg0 - 145));
                } else {
                    class139.field1855 = 2;
                }
            }
            if (var2 == 0 && class271.field3433 > 0) {
                class28.method189((byte) 76);
            }
            if (class465.field6838 == null && class142.field1882 == 0) {
                class289.field3699 = null;
                class139.field1855 = 0;
                return;
            }
            return;
        }
        if (var2 == -1) {
            int var4 = class268.field3397.method717((byte) 82);
            int var5 = class268.field3397.method721((byte) 74);
            if (var4 < (class115.field1574 - 10) || (class98.field1374 + class115.field1574 + 10) < var4 || (class44.field642 - 10) > var5 || var5 > class44.field642 - (-class129.field1756 - 10)) {
                class450.field6267 = false;
                class475.method2855(class129.field1756, class44.field642, class115.field1574, arg0 - 33, class98.field1374);
            }
        }
        if (var2 != 0) {
            return;
        }
        int var6 = class115.field1574;
        int var7 = class44.field642;
        int var8 = class98.field1374;
        int var9 = var3.method1444(arg0 - 135);
        int var10 = var3.method1442((byte) 71);
        int var11 = -1;
        for (int var12 = 0; var12 < class271.field3433; var12++) {
            if (class419.field5575) {
                int var16 = (class271.field3433 - var12 - 1) * 16 + var7 + 33;
                if (var9 > var6 && var9 < (var6 + var8) && var10 > (var16 - 13) && var16 + 4 > var10) {
                    var11 = var12;
                }
            } else {
                int var17 = (class271.field3433 - var12 - 1) * 16 + var7 + 31;
                if (var6 < var9 && var9 < (var6 + var8) && var10 > (var17 - 13) && var10 < var17 + 3) {
                    var11 = var12;
                }
            }
        }
        if (var11 != -1) {
            int var13 = 0;
            class81 var14 = new class81(class103.field1421);
            for (class502 var15 = (class502) var14.method465(false); var15 != null; var15 = (class502) var14.method466(arg0 ^ 0xFFFFFEDE)) {
                if (var11 == var13) {
                    class182.method1204(0, var15, var9, var10);
                }
                var13++;
            }
        }
        class450.field6267 = false;
        class475.method2855(class129.field1756, class44.field642, class115.field1574, 0, class98.field1374);
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(II)Z")
    public static final boolean method2639(int arg0, int arg1) {
        if (arg1 > -75) {
            field6190 = 76;
        }
        field6186++;
        return arg0 >= 0 && arg0 <= 3 || arg0 == 9;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(JI)Ljava/lang/String;")
    public static final String method2640(long arg0, int arg1) {
        class342.field4361.setTime(new Date(arg0));
        field6184++;
        int var3 = class342.field4361.get(7);
        int var4 = class342.field4361.get(5);
        int var5 = class342.field4361.get(arg1);
        int var6 = class342.field4361.get(1);
        int var7 = class342.field4361.get(11);
        int var8 = class342.field4361.get(12);
        int var9 = class342.field4361.get(13);
        return class9.field89[var3 - 1] + ", " + var4 / 10 + var4 % 10 + "-" + class163.field2115[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(I)V")
    public static void method2641(int arg0) {
        if (arg0 != 2) {
            method2639(-105, 77);
        }
        field6189 = null;
    }

    static {
        new class169("Loaded additional fonts", "Zusatzschriftarten geladen", "Polices secondaires chargées", "Fontes principais carregadas");
        field6189 = new class250(45, 3);
        field6190 = -1;
    }
}
