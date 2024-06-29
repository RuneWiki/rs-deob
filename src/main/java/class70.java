import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class70 extends class76 {

    @OriginalMember(owner = "client!na", name = "bb", descriptor = "I")
    public static int field1382 = -1;

    @OriginalMember(owner = "client!na", name = "gb", descriptor = "I")
    public static int field1387 = 0;

    @OriginalMember(owner = "client!na", name = "cb", descriptor = "Lia;")
    public static class257 field1383 = class28.method234(-52, "Fertigkeit)2");

    @OriginalMember(owner = "client!na", name = "Y", descriptor = "Lia;")
    public static class257 field1379 = class28.method234(92, "Ihre Freunde)2Liste ist voll(Q Maximale Eintr-=ge: Mitglieder 200)4freie Spieler 100");

    @OriginalMember(owner = "client!na", name = "Z", descriptor = "I")
    public static int field1380;

    @OriginalMember(owner = "client!na", name = "ab", descriptor = "I")
    public static int field1381;

    @OriginalMember(owner = "client!na", name = "db", descriptor = "I")
    public static int field1384;

    @OriginalMember(owner = "client!na", name = "eb", descriptor = "I")
    public static int field1385;

    @OriginalMember(owner = "client!na", name = "fb", descriptor = "I")
    public static int field1386;

    @OriginalMember(owner = "client!na", name = "hb", descriptor = "I")
    public static int field1388;

    @OriginalMember(owner = "client!na", name = "ib", descriptor = "I")
    public static int field1389;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(BLk;)Lmg;")
    public static final class76 method527(byte arg0, class152 arg1) {
        if (arg0 >= -117) {
            return null;
        } else {
            arg1.method1051((byte) -96);
            ++field1388;
            int var2 = arg1.method1051((byte) -50);
            class76 var3 = class81.method607(var2, -125);
            var3.field1480 = arg1.method1051((byte) -94);
            int var4 = arg1.method1051((byte) -45);
            for (int var5 = 0; var4 > var5; ++var5) {
                int var6 = arg1.method1051((byte) 83);
                var3.method158(arg1, (byte) -111, var6);
            }
            var3.method209((byte) 111);
            return var3;
        }
    }

    @OriginalMember(owner = "client!na", name = "<init>", descriptor = "()V")
    public class70() {
        super(0, true);
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(III)I")
    private final int method528(int arg0, int arg1, int arg2) {
        if (arg2 != 3) {
            return 87;
        } else {
            ++field1380;
            int var4 = arg1 * 57 + arg0;
            int var5 = var4 ^ var4 << 1;
            return 4096 - (Integer.MAX_VALUE & (var5 * 15731 * var5 + 789221) * var5 - -1376312589) / 262144;
        }
    }

    @OriginalMember(owner = "client!na", name = "d", descriptor = "(II)V")
    public static final void method529(int arg0, int arg1) {
        ++field1389;
        class260 var2 = (class260) class174.field2965.method434((byte) -93, (long) arg0);
        if (arg1 != -20888) {
            field1383 = null;
        }
        if (var2 != null) {
            for (int var3 = 0; var2.field4512.length > var3; ++var3) {
                var2.field4512[var3] = -1;
                var2.field4518[var3] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!na", name = "c", descriptor = "(II)[I")
    public final int[] method169(int arg0, int arg1) {
        ++field1384;
        if (arg0 != -9351) {
            return null;
        } else {
            int[] var3 = super.field1467.method1182((byte) -48, arg1);
            if (super.field1467.field2980) {
                int var4 = class10.field197[arg1];
                for (int var5 = 0; ~var5 > ~class96.field1807; ++var5) {
                    var3[var5] = this.method528(class137.field2457[var5], var4, 3) % 4096;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IZI)V")
    public static final void method530(int arg0, boolean arg1, int arg2) {
        int var3 = arg2;
        if (arg2 > 25) {
            var3 = 25;
        }
        ++field1385;
        --arg2;
        int var4 = class36.field718[arg2];
        int var5 = class80.field1565[arg2];
        if (arg0 == 0) {
            ++class52.field1129;
            class205.field3524.method908(false, 19);
            class205.field3524.method1023(13195, var3 + 3 + var3);
        }
        if (arg0 == 1) {
            class205.field3524.method908(false, 98);
            class205.field3524.method1023(13195, var3 + 17 + var3);
            ++class55.field1169;
        }
        if (~arg0 == -3) {
            ++class87.field1682;
            class205.field3524.method908(false, 75);
            class205.field3524.method1023(13195, var3 + var3 + 3);
        }
        class205.field3524.method1047(class244.field4232 + var4, arg1);
        class205.field3524.method1023(13195, !class39.field793[82] ? 0 : 1);
        class186.field3228 = class80.field1565[0];
        class132.field2369 = class36.field718[0];
        for (int var6 = 1; ~var6 > ~var3; ++var6) {
            --arg2;
            class205.field3524.method1048((byte) 118, class36.field718[arg2] + -var4);
            class205.field3524.method1036((byte) -128, class80.field1565[arg2] + -var5);
        }
        class205.field3524.method1065(class231.field3878 + var5, 1210792072);
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IBIIIIIIII)V")
    public static final void method531(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        class34 var10 = null;
        ++field1381;
        int var11 = 113 % ((arg1 - -5) / 44);
        for (class34 var12 = (class34) class72.field1413.method288(26111); var12 != null; var12 = (class34) class72.field1413.method277(1)) {
            if (~var12.field668 == ~arg5 && var12.field661 == arg2 && var12.field662 == arg4 && ~var12.field658 == ~arg6) {
                var10 = var12;
                break;
            }
        }
        if (var10 == null) {
            var10 = new class34();
            var10.field658 = arg6;
            var10.field668 = arg5;
            var10.field662 = arg4;
            var10.field661 = arg2;
            class25.method221(var10, (byte) -73);
            class72.field1413.method287(var10, 0);
        }
        var10.field655 = arg0;
        var10.field672 = arg3;
        var10.field654 = arg8;
        var10.field673 = arg9;
        var10.field656 = arg7;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(I[Lia;ZI)Lia;")
    public static final class257 method532(int arg0, class257[] arg1, boolean arg2, int arg3) {
        ++field1386;
        int var4 = 0;
        if (!arg2) {
            field1383 = null;
        }
        for (int var5 = 0; ~arg0 < ~var5; ++var5) {
            if (arg1[arg3 - -var5] == null) {
                arg1[arg3 - -var5] = class230.field3864;
            }
            var4 += arg1[arg3 + var5].field4447;
        }
        byte[] var6 = new byte[var4];
        int var7 = 0;
        for (int var8 = 0; var8 < arg0; ++var8) {
            class257 var10 = arg1[arg3 + var8];
            class86.method644(var10.field4407, 0, var6, var7, var10.field4447);
            var7 += var10.field4447;
        }
        class257 var9 = new class257();
        var9.field4407 = var6;
        var9.field4447 = var4;
        return var9;
    }

    @OriginalMember(owner = "client!na", name = "i", descriptor = "(I)V")
    public static void method533(int arg0) {
        if (arg0 != 82) {
            method527((byte) -121, (class152) null);
        }
        field1383 = null;
        field1379 = null;
    }
}
