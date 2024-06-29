import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class26 extends class129 {

    @OriginalMember(owner = "client!ea", name = "V", descriptor = "I")
    public int field694 = 0;

    @OriginalMember(owner = "client!ea", name = "T", descriptor = "Lv;")
    public static class122 field692 = class55.method425(-118, "Freunde");

    @OriginalMember(owner = "client!ea", name = "db", descriptor = "Lv;")
    public static class122 field702 = class55.method425(-54, "@cr2@");

    @OriginalMember(owner = "client!ea", name = "R", descriptor = "Lv;")
    public static class122 field690 = class55.method425(-57, " Millionen");

    @OriginalMember(owner = "client!ea", name = "cb", descriptor = "I")
    public static int field701 = 1;

    @OriginalMember(owner = "client!ea", name = "bb", descriptor = "[[I")
    public static int[][] field700 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!ea", name = "fb", descriptor = "Ljb;")
    public static class56 field704 = new class56(100);

    @OriginalMember(owner = "client!ea", name = "Q", descriptor = "I")
    public static int field689;

    @OriginalMember(owner = "client!ea", name = "S", descriptor = "I")
    public static int field691;

    @OriginalMember(owner = "client!ea", name = "U", descriptor = "I")
    public static int field693;

    @OriginalMember(owner = "client!ea", name = "W", descriptor = "I")
    public static int field695;

    @OriginalMember(owner = "client!ea", name = "Y", descriptor = "I")
    public static int field697;

    @OriginalMember(owner = "client!ea", name = "Z", descriptor = "I")
    public static int field698;

    @OriginalMember(owner = "client!ea", name = "eb", descriptor = "I")
    public static int field703;

    @OriginalMember(owner = "client!ea", name = "X", descriptor = "Lkb;")
    public static class62 field696;

    @OriginalMember(owner = "client!ea", name = "ab", descriptor = "[Lab;")
    public static class3[] field699;

    @OriginalMember(owner = "client!ea", name = "g", descriptor = "(I)V", line = 5)
    public static void method262(int arg0) {
        field699 = null;
        if (arg0 != 4302) {
            field689 = 47;
        }
        field690 = null;
        field700 = null;
        field696 = null;
        field702 = null;
        field704 = null;
        field692 = null;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IILkd;)V", line = 24)
    private final void method263(int arg0, int arg1, class64 arg2) {
        field691++;
        if (arg0 == arg1) {
            this.field694 = arg2.method506((byte) -90);
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIII)Z", line = 56)
    public static final boolean method264(int arg0, int arg1, int arg2, int arg3) {
        field693++;
        int var4 = arg3 >> 14 & 0x7FFF;
        int var5 = class90.field2306.method22(class34.field848, arg1, arg0, arg3);
        if (var5 == -1) {
            return false;
        }
        int var6 = var5 >> 6 & 0x3;
        int var7 = var5 & 0x1F;
        if (var7 == 10 || var7 == 11 || var7 == 22) {
            class42 var8 = class14.method124((byte) 52, var4);
            int var9;
            int var10;
            if (var6 == 0 || var6 == 2) {
                var10 = var8.field1090;
                var9 = var8.field1080;
            } else {
                var9 = var8.field1090;
                var10 = var8.field1080;
            }
            int var11 = var8.field1074;
            if (var6 != 0) {
                var11 = (var11 >> 4 - var6) + (var11 << var6 & 0xF);
            }
            class95.method751(var11, true, 0, var10, class70.field1828.field287[0], 0, arg1, var9, arg2 + 127, arg0, class70.field1828.field307[0], 2);
        } else {
            class95.method751(0, true, var7 + 1, 0, class70.field1828.field287[0], var6, arg1, 0, 127, arg0, class70.field1828.field307[0], 2);
        }
        client.field459 = 2;
        class56.field1480 = class34.field865;
        class47.field1215 = arg2;
        class42.field1061 = class125.field3049;
        return true;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Z)V", line = 115)
    public static final void method265(boolean arg0) {
        field698++;
        class28 var1 = class125.field3039;
        synchronized (class125.field3039) {
            class4.field112 = class73.field1889;
            class7.field171 = class4.field111;
            class72.field1855 = class108.field2675;
            class93.field2382 = class14.field367;
            class125.field3049 = class59.field1520;
            class34.field865 = class42.field1120;
            if (arg0) {
                method262(64);
            }
            class19.field497 = class33.field813;
            class14.field367 = 0;
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIIIBI)V", line = 147)
    public static final void method266(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        if (arg4 != 5) {
            method262(-9);
        }
        field697++;
        int var6 = (arg2 - 32) * arg2 / arg0;
        if (var6 < 8) {
            var6 = 8;
        }
        int var7 = (arg2 - var6 - 32) * arg5 / (arg0 - arg2);
        class94.field2416[0].method63(arg3, arg1);
        class94.field2416[1].method63(arg3, arg1 + arg2 - 16);
        class117.method895(arg3, arg1 + 16, 16, arg2 - 32, class81.field2106);
        class117.method895(arg3, arg1 + var7 + 16, 16, var6, class42.field1070);
        class117.method889(arg3, arg1 + var7 + 16, var6, class33.field827);
        class117.method889(arg3 + 1, arg1 + var7 + 16, var6, class33.field827);
        class117.method901(arg3, arg1 + var7 + 16, 16, class33.field827);
        class117.method901(arg3, var7 + arg1 + 17, 16, class33.field827);
        class117.method889(arg3 + 15, var7 + 16 + arg1, var6, class11.field344);
        class117.method889(arg3 + 14, arg1 + 17 + var7, var6 - 1, class11.field344);
        class117.method901(arg3, var6 + var7 + arg1 + 15, 16, class11.field344);
        class117.method901(arg3 + 1, arg1 + 14 + var7 + var6, 15, class11.field344);
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lkd;I)V", line = 180)
    public final void method267(class64 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method520(-118);
            if (var3 == 0) {
                field695++;
                if (arg1 != -21626) {
                    field699 = null;
                    return;
                }
                return;
            }
            this.method263(var3, arg1 + 21631, arg0);
        }
    }
}
