import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class97 extends class269 {

    @OriginalMember(owner = "client!qe", name = "ab", descriptor = "Lcf;")
    public static class93 field1729 = class147.method1066("Konfig geladen)3", -48);

    @OriginalMember(owner = "client!qe", name = "Z", descriptor = "Lcf;")
    public static class93 field1728 = class147.method1066("event_opbase", -48);

    @OriginalMember(owner = "client!qe", name = "bb", descriptor = "I")
    public static int field1730 = 0;

    @OriginalMember(owner = "client!qe", name = "jb", descriptor = "Lcf;")
    public static class93 field1738 = null;

    @OriginalMember(owner = "client!qe", name = "ib", descriptor = "I")
    public static int field1737 = -1;

    @OriginalMember(owner = "client!qe", name = "P", descriptor = "I")
    public static int field1727;

    @OriginalMember(owner = "client!qe", name = "db", descriptor = "I")
    public static int field1732;

    @OriginalMember(owner = "client!qe", name = "fb", descriptor = "I")
    public static int field1734;

    @OriginalMember(owner = "client!qe", name = "gb", descriptor = "I")
    public static int field1735;

    @OriginalMember(owner = "client!qe", name = "hb", descriptor = "I")
    public static int field1736;

    @OriginalMember(owner = "client!qe", name = "cb", descriptor = "[Ldh;")
    public static class120[] field1731;

    @OriginalMember(owner = "client!qe", name = "eb", descriptor = "[Lrc;")
    public static class67[] field1733;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method17(int arg0, boolean arg1) {
        ++field1734;
        if (arg1) {
            method709(-82L, 40);
        }
        int[][] var3 = super.field4705.method1089(arg0, 99);
        if (super.field4705.field2670 && this.method1794(-127)) {
            int[] var4 = var3[1];
            int[] var5 = var3[0];
            int var6 = arg0 % super.field4805 * super.field4805;
            int[] var7 = var3[2];
            for (int var8 = 0; class176.field3060 > var8; ++var8) {
                int var9 = super.field4804[var8 % super.field4800 + var6];
                var7[var8] = class58.method333(4080, var9 << 4);
                var4[var8] = class58.method333(4080, var9 >> 4);
                var5[var8] = class58.method333(var9, 16711680) >> 12;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "(B)V")
    public static final void method708(byte arg0) {
        if (arg0 < -25) {
            ++field1736;
            class230.field4114.method300(0);
            class77.field1438.method300(0);
            class126.field2228.method300(0);
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(JI)V")
    public static final void method709(long arg0, int arg1) {
        try {
            if (arg1 != 2) {
                field1733 = null;
            }
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
        ++field1735;
    }

    @OriginalMember(owner = "client!qe", name = "h", descriptor = "(I)V")
    public static void method710(int arg0) {
        field1728 = null;
        field1738 = null;
        if (arg0 == 0) {
            field1729 = null;
            field1731 = null;
            field1733 = null;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIIBI)V")
    public static final void method711(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        class26.field342 = arg4;
        class277.field4967 = arg0;
        int var5 = 98 / ((arg3 - -24) / 63);
        ++field1732;
        class147.field2593 = arg1;
        class271.field4820 = arg2;
    }
}
