import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class175 extends class113 {

    @OriginalMember(owner = "client!o", name = "e", descriptor = "I")
    public static int field2451;

    @OriginalMember(owner = "client!o", name = "f", descriptor = "I")
    public int field2452;

    @OriginalMember(owner = "client!o", name = "g", descriptor = "I")
    public int field2453;

    @OriginalMember(owner = "client!o", name = "h", descriptor = "I")
    public int field2454;

    @OriginalMember(owner = "client!o", name = "i", descriptor = "I")
    public static int field2455;

    @OriginalMember(owner = "client!o", name = "j", descriptor = "I")
    public int field2456;

    @OriginalMember(owner = "client!o", name = "k", descriptor = "I")
    public static int field2457;

    @OriginalMember(owner = "client!o", name = "l", descriptor = "Lcs;")
    public class335 field2458;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IIIIZ)V", line = 4)
    public static final void method1260(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (class243.field3580.field7975.method3775(false) == 0) {
            class145.method1015(false, (byte) -87);
        } else {
            class118.field1613 = class243.field3580.field7975.method3775(false);
            class403.method2449(true, 0, -114);
        }
        field2455++;
        class378.field5502 = arg0;
        class105.field1473 = arg3;
        int var5 = -47 / ((arg1 - 47) / 56);
        class160.field2305 = arg4;
        class664.method3799(arg2);
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Lal;IB)V", line = 25)
    public static final void method1261(class123 arg0, int arg1, byte arg2) {
        if (class558.field8116) {
            arg1 = 0;
            class558.field8116 = false;
        }
        field2457++;
        if (class25.field219 == null || !class25.field219.method871(-14415, arg0)) {
            class25.field219 = arg0;
            class365.field5329 = class465.method2818(255);
            class517.field7451 = arg1;
            class381.field5520 = arg1;
            if (class381.field5520 == 0) {
                class739.method4128(false);
            } else {
                class22.field210 = class718.field10131;
                class714.field10075 = class111.field1571;
                class254.field3669 = class369.field5393;
                class680.field9656 = class285.field3969;
                class349.field5160 = class311.field4224;
                client.field6415 = class140.field1912;
                class512.field7419 = class159.field2278;
                class181.field2495 = class36.field322;
                class605.field8585 = class6.field58;
                class466.field6644 = class137.field1881;
            }
        }
        int var3 = -81 % ((arg2 - 51) / 47);
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IZIZ[Lqk;I)V", line = 72)
    public static final void method1262(int arg0, boolean arg1, int arg2, boolean arg3, class146[] arg4, int arg5) {
        if (!arg3) {
            return;
        }
        field2451++;
        for (int var6 = 0; var6 < arg4.length; var6++) {
            class146 var7 = arg4[var6];
            if (var7 != null && var7.field2109 == arg0) {
                class314.method1938(var7, arg2, arg5, arg1, (byte) -38);
                class398.method2414(var7, arg5, (byte) -112, arg2);
                if (var7.field1988 > var7.field2134 - var7.field2016) {
                    var7.field1988 = var7.field2134 - var7.field2016;
                }
                if (var7.field1988 < 0) {
                    var7.field1988 = 0;
                }
                if ((var7.field1973 - var7.field1997) < var7.field1970) {
                    var7.field1970 = var7.field1973 - var7.field1997;
                }
                if (var7.field1970 < 0) {
                    var7.field1970 = 0;
                }
                if (var7.field2112 == 0) {
                    class217.method1533(var7, arg1, -9543);
                }
            }
        }
    }
}
