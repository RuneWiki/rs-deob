import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hn")
public class class33 {

    @OriginalMember(owner = "client!hn", name = "j", descriptor = "I")
    public int field556 = 0;

    @OriginalMember(owner = "client!hn", name = "d", descriptor = "[I")
    public static int[] field550 = new int[14];

    @OriginalMember(owner = "client!hn", name = "c", descriptor = "I")
    public static int field549 = -2;

    @OriginalMember(owner = "client!hn", name = "g", descriptor = "I")
    public static int field553 = 0;

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "I")
    public static int field547;

    @OriginalMember(owner = "client!hn", name = "e", descriptor = "I")
    public static int field551;

    @OriginalMember(owner = "client!hn", name = "f", descriptor = "I")
    public static int field552;

    @OriginalMember(owner = "client!hn", name = "h", descriptor = "I")
    public static int field554;

    @OriginalMember(owner = "client!hn", name = "i", descriptor = "I")
    public static int field555;

    @OriginalMember(owner = "client!hn", name = "k", descriptor = "I")
    public static int field557;

    @OriginalMember(owner = "client!hn", name = "l", descriptor = "I")
    public static int field558;

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "[Z")
    public static boolean[] field548;

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(Lpe;B)V", line = 11)
    public final void method228(class101 arg0, byte arg1) {
        if (arg1 != 60) {
            field549 = -73;
        }
        field557++;
        while (true) {
            int var3 = arg0.method741(86);
            if (var3 == 0) {
                return;
            }
            this.method230(false, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(Z)V", line = 31)
    public static final void method229(boolean arg0) {
        class114.field1861++;
        class269.field4191.method246(arg0, 26);
        field555++;
        class269.field4191.method728(class247.field3822, 1234856744);
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(ZLpe;I)V", line = 41)
    private final void method230(boolean arg0, class101 arg1, int arg2) {
        if (arg2 == 5) {
            this.field556 = arg1.method731(false);
        }
        field554++;
        if (arg0) {
            field548 = (boolean[]) null;
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(IIZIII)Lai;", line = 59)
    public static final class126 method231(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        field547++;
        if (arg1 > -110) {
            return (class126) null;
        }
        int var7 = arg0 + (arg2 ? 65536 : 0) + (arg3 << 17) + (arg4 << 19);
        long var8 = (long) arg5 * 3147483667L + (long) var7 * 3849834839L;
        class126 var10 = (class126) class285.field4371.method1830(var8, (byte) 52);
        if (var10 != null) {
            return var10;
        }
        class174.field2743 = false;
        class126 var11 = class125.method944(arg0, 3, false, arg2, arg3, arg5, arg4, false);
        if (var11 != null && !class174.field2743) {
            class285.field4371.method1831(var8, var11, -13897);
        }
        return var11;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(BI)V", line = 87)
    public static final void method232(byte arg0, int arg1) {
        class183.field2922.method1828(arg1, (byte) -45);
        int var2 = 40 / ((arg0 - 33) / 53);
        field551++;
        class103.field1740.method1828(arg1, (byte) 112);
        class134.field2127.method1828(arg1, (byte) -11);
        class11.field184.method1828(arg1, (byte) 100);
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(I)V", line = 107)
    public static final void method233(int arg0) {
        field558++;
        int var1 = class307.field4845.length;
        if (arg0 != -944314938) {
            field549 = -38;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            if (class307.field4845[var2] != null) {
                int var3 = -1;
                for (int var4 = 0; var4 < class149.field2399; var4++) {
                    if (class110.field1813[var4] == class102.field1728[var2]) {
                        var3 = var4;
                        break;
                    }
                }
                if (var3 == -1) {
                    class110.field1813[class149.field2399] = class102.field1728[var2];
                    var3 = class149.field2399++;
                }
                class101 var5 = new class101(class307.field4845[var2]);
                int var6 = 0;
                while (var5.field1667 < class307.field4845[var2].length && var6 < 511) {
                    int var7 = var6++ << 6 | var3;
                    int var8 = var5.method731(false);
                    int var9 = var8 >> 14;
                    int var10 = (var8 & 0x1FB2) >> 7;
                    int var11 = var8 & 0x3F;
                    int var12 = (class102.field1728[var2] & 0xFF) * 64 + var11 - class91.field1485;
                    int var13 = (class102.field1728[var2] >> 8) * 64 + var10 - class177.field2780;
                    class208 var14 = class17.method145((byte) -121, var5.method731(false));
                    if (class138.field2196[var7] == null && (var14.field3288 & 0x1) > 0 && class273.field4247 == var9 && var13 >= 0 && var14.field3292 + var13 < 104 && var12 >= 0 && var14.field3292 + var12 < 104) {
                        class138.field2196[var7] = new class305();
                        class305 var15 = class138.field2196[var7];
                        class145.field2279[class77.field1173++] = var7;
                        var15.field1462 = class205.field3252;
                        var15.method2112(var14, (byte) 119);
                        var15.method643(var15.field4778.field3292, (byte) -86);
                        var15.field1395 = var15.field1443 = class288.field4391[var15.field4778.field3282];
                        var15.field1384 = var15.field4778.field3319;
                        var15.field1405 = var15.field4778.field3276;
                        if (var15.field1384 == 0) {
                            var15.field1443 = 0;
                        }
                        var15.method639(21696, var12, var15.method200(-1), var13, true);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "(I)V", line = 210)
    public static void method234(int arg0) {
        field548 = null;
        int var1 = 54 % ((-arg0 - 62) / 44);
        field550 = null;
    }

    @OriginalMember(owner = "client!hn", name = "c", descriptor = "(I)V", line = 220)
    public static final void method235(int arg0) {
        class181.field2897.method1837(-24);
        if (arg0 > 10) {
            class215.field3431.method1837(-115);
            field552++;
        }
    }
}
