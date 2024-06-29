import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class232 {

    @OriginalMember(owner = "client!cb", name = "i", descriptor = "Lak;")
    public static class135 field4020 = new class135(30);

    @OriginalMember(owner = "client!cb", name = "j", descriptor = "Lge;")
    public static class69 field4021 = new class69(512);

    @OriginalMember(owner = "client!cb", name = "k", descriptor = "[Lhi;")
    public static class210[] field4022 = new class210[32768];

    @OriginalMember(owner = "client!cb", name = "l", descriptor = "Lak;")
    public static class135 field4023 = new class135(50);

    @OriginalMember(owner = "client!cb", name = "m", descriptor = "I")
    public static int field4024 = 0;

    @OriginalMember(owner = "client!cb", name = "n", descriptor = "[Ljh;")
    public static class271[] field4025 = new class271[2048];

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "I")
    public int field4013;

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "I")
    public static int field4015;

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "I")
    public int field4016;

    @OriginalMember(owner = "client!cb", name = "f", descriptor = "I")
    public int field4017;

    @OriginalMember(owner = "client!cb", name = "g", descriptor = "I")
    public static int field4018;

    @OriginalMember(owner = "client!cb", name = "h", descriptor = "I")
    public static int field4019;

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "J")
    public long field4014;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "Lqe;")
    public class95 field4012;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lpj;Z)V")
    public static final void method1540(class237 arg0, boolean arg1) {
        field4019++;
        if (class113.field1971 == null) {
            return;
        }
        long var2 = arg0.method1616(0);
        int var4 = 0;
        if (var2 == 0L) {
            return;
        }
        while (class113.field1971.length > var4 && class113.field1971[var4].field1530 != var2) {
            var4++;
        }
        if (var4 >= class113.field1971.length || class113.field1971[var4] == null) {
            return;
        }
        if (arg1) {
            method1543((class32) null, -122);
        }
        class167.field2961++;
        class223.field3830.method368(107, 138);
        class223.field3830.method292(-44, class113.field1971[var4].field1530);
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIIIII)Z")
    public static final boolean method1541(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != arg2 || arg3 != arg4) {
            for (int var8 = arg1; var8 <= arg2; var8++) {
                for (int var14 = arg3; var14 <= arg4; var14++) {
                    if (class249.field4332[arg0][var8][var14] == -class14.field234) {
                        return false;
                    }
                }
            }
            int var9 = (arg1 << 7) + 1;
            int var10 = (arg3 << 7) + 2;
            int var11 = class99.field1773[arg0][arg1][arg3] + arg5;
            if (!class272.method1813(var9, var11, var10)) {
                return false;
            }
            int var12 = (arg2 << 7) - 1;
            if (!class272.method1813(var12, var11, var10)) {
                return false;
            }
            int var13 = (arg4 << 7) - 1;
            if (!class272.method1813(var9, var11, var13)) {
                return false;
            } else if (class272.method1813(var12, var11, var13)) {
                return true;
            } else {
                return false;
            }
        } else if (class143.method983(arg0, arg1, arg3)) {
            int var6 = arg1 << 7;
            int var7 = arg3 << 7;
            return class272.method1813(var6 + 1, class99.field1773[arg0][arg1][arg3] + arg5, var7 + 1) && class272.method1813(var6 + 128 - 1, class99.field1773[arg0][arg1 + 1][arg3] + arg5, var7 + 1) && class272.method1813(var6 + 128 - 1, class99.field1773[arg0][arg1 + 1][arg3 + 1] + arg5, var7 + 128 - 1) && class272.method1813(var6 + 1, class99.field1773[arg0][arg1][arg3 + 1] + arg5, var7 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIIII)V")
    public static final void method1542(int arg0, int arg1, int arg2, int arg3, int arg4) {
        for (int var5 = 0; var5 < class68.field1348; var5++) {
            if (class260.field4458[var5] + class115.field2023[var5] > arg3 && class260.field4458[var5] < arg0 + arg3 && arg4 < (class183.field3215[var5] + class249.field4324[var5]) && class183.field3215[var5] < arg2 + arg4) {
                class166.field2941[var5] = true;
            }
        }
        if (arg1 != -26900) {
            field4021 = null;
        }
        field4015++;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lie;I)V")
    public static final void method1543(class32 arg0, int arg1) {
        field4018++;
        if (arg0.field644.length - arg0.field647 < 1) {
            return;
        }
        int var2 = arg0.method316((byte) -85);
        if (var2 < 0 || var2 > 7) {
            return;
        }
        byte var3;
        if (var2 == 7) {
            var3 = 29;
        } else if (var2 == 6) {
            var3 = 28;
        } else if (var2 == 5) {
            var3 = 28;
        } else if (var2 == 4) {
            var3 = 24;
        } else if (var2 == 3) {
            var3 = 23;
        } else if (var2 == 2) {
            var3 = 22;
        } else if (var2 == 1) {
            var3 = 23;
        } else {
            var3 = 19;
        }
        if (arg0.field644.length - arg0.field647 < var3) {
            return;
        }
        if (arg1 < 14) {
            method1544(-105);
        }
        class10.field196 = arg0.method316((byte) 102);
        if (class10.field196 < 1) {
            class10.field196 = 1;
        } else if (class10.field196 > 4) {
            class10.field196 = 4;
        }
        class177.method1226(true, arg0.method316((byte) 108) == 1);
        class92.field1662 = arg0.method316((byte) -25) == 1;
        class22.field401 = arg0.method316((byte) 117) == 1;
        class223.field3837 = arg0.method316((byte) 104) == 1;
        class13.field227 = arg0.method316((byte) 103) == 1;
        class20.field382 = arg0.method316((byte) -49) == 1;
        class59.field1207 = arg0.method316((byte) 98) == 1;
        class63.field1256 = arg0.method316((byte) -113) == 1;
        class91.field1656 = arg0.method316((byte) -19);
        if (class91.field1656 > 2) {
            class91.field1656 = 2;
        }
        if (var2 >= 2) {
            class59.field1212 = arg0.method316((byte) -34) == 1;
        } else {
            class59.field1212 = arg0.method316((byte) 113) == 1;
            arg0.method316((byte) -46);
        }
        class52.field1099 = arg0.method316((byte) -81) == 1;
        class238.field4159 = arg0.method316((byte) 104) == 1;
        class122.field2153 = arg0.method316((byte) -116);
        if (class122.field2153 > 2) {
            class122.field2153 = 2;
        }
        class141.field2499 = arg0.method316((byte) 109) == 1;
        class78.field1459 = arg0.method316((byte) 97);
        if (class78.field1459 > 127) {
            class78.field1459 = 127;
        }
        class113.field1983 = arg0.method316((byte) 108);
        class204.field3497 = arg0.method316((byte) -104);
        if (class204.field3497 > 127) {
            class204.field3497 = 127;
        }
        if (var2 >= 1) {
            class177.field3096 = arg0.method339(-16777216);
            class121.field2135 = arg0.method339(-16777216);
        }
        if (var2 >= 3 && var2 < 6) {
            arg0.method316((byte) -96);
        }
        if (var2 >= 4) {
            arg0.method316((byte) -86);
        }
        if (var2 >= 5) {
            class31.field619 = arg0.method319((byte) -18);
        }
        if (var2 >= 6) {
            class17.field298 = arg0.method316((byte) -123);
        }
        if (var2 >= 7) {
            class83.field1557 = arg0.method316((byte) -38) == 1;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)V")
    public static void method1544(int arg0) {
        if (arg0 < 66) {
            field4025 = null;
        }
        field4021 = null;
        field4025 = null;
        field4020 = null;
        field4023 = null;
        field4022 = null;
    }
}
