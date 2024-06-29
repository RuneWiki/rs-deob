import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ar")
public class class588 extends class766 {

    @OriginalMember(owner = "client!ar", name = "y", descriptor = "[Lea;")
    public static class21[] field8451 = new class21[2048];

    @OriginalMember(owner = "client!ar", name = "n", descriptor = "I")
    public static int field8440;

    @OriginalMember(owner = "client!ar", name = "o", descriptor = "I")
    public static int field8441;

    @OriginalMember(owner = "client!ar", name = "t", descriptor = "I")
    public int field8446;

    @OriginalMember(owner = "client!ar", name = "u", descriptor = "I")
    public static int field8447;

    @OriginalMember(owner = "client!ar", name = "x", descriptor = "I")
    public int field8450;

    @OriginalMember(owner = "client!ar", name = "A", descriptor = "I")
    public static int field8453;

    @OriginalMember(owner = "client!ar", name = "B", descriptor = "I")
    public static int field8454;

    @OriginalMember(owner = "client!ar", name = "s", descriptor = "Lgga;")
    public static class513 field8445;

    @OriginalMember(owner = "client!ar", name = "p", descriptor = "[I")
    public int[] field8442;

    @OriginalMember(owner = "client!ar", name = "q", descriptor = "[I")
    public int[] field8443;

    @OriginalMember(owner = "client!ar", name = "w", descriptor = "[I")
    public int[] field8449;

    @OriginalMember(owner = "client!ar", name = "r", descriptor = "[Lot;")
    public class746[] field8444;

    @OriginalMember(owner = "client!ar", name = "v", descriptor = "[Lot;")
    public class746[] field8448;

    @OriginalMember(owner = "client!ar", name = "z", descriptor = "[[[B")
    public byte[][][] field8452;

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(Ljava/lang/String;B)V", line = 3)
    public static final void method3446(String arg0, byte arg1) {
        field8453++;
        if (!class295.field4298 || (class345.field4896 & 0x18) == 0) {
            return;
        }
        boolean var2 = false;
        int var3 = class469.field6382;
        int[] var4 = class464.field6311;
        for (int var5 = 0; var5 < var3; var5++) {
            class21 var6 = field8451[var4[var5]];
            if (var6.field212 != null && var6.field212.equalsIgnoreCase(arg0) && (class719.field10041 == var6 && (class345.field4896 & 0x10) != 0 || var6 != null && (class345.field4896 & 0x8) != 0)) {
                class363.field5164++;
                class302 var7 = class582.method3419(class522.field7316, (byte) 127, class626.field8901);
                var7.field4341.method2541((byte) -118, var4[var5]);
                var7.field4341.method2572(class121.field2051, (byte) 72);
                var7.field4341.method2562(0, 0);
                var7.field4341.method2542(337533360, class568.field7906);
                var7.field4341.method2559(class65.field979, 120);
                class501.method2928(0, var7);
                var2 = true;
                class246.method1636(-2, 0, var6.method209(true), (byte) -121, var6.field4142[0], var6.method209(true), 0, true, var6.field4136[0]);
                break;
            }
        }
        if (arg1 < 55) {
            field8445 = null;
        }
        if (!var2) {
            class446.method2645(class563.field7819.method3281(class423.field5892, -1) + arg0, 0, 4);
        }
        if (class295.field4298) {
            class558.method3253(-111);
        }
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(BLuf;Luf;)V", line = 62)
    public static final void method3447(byte arg0, class519 arg1, class519 arg2) {
        field8447++;
        class493.field6755++;
        class302 var3 = class582.method3419(class701.field9831, (byte) 125, class626.field8901);
        var3.field4341.method2548(arg1.field7247, (byte) -92);
        if (arg0 != -118) {
            method3446(null, (byte) -85);
        }
        var3.field4341.method2572(arg2.field7129, (byte) 62);
        var3.field4341.method2572(arg1.field7193, (byte) 51);
        var3.field4341.method2572(arg2.field7193, (byte) 118);
        var3.field4341.method2542(337533360, arg2.field7247);
        var3.field4341.method2572(arg1.field7129, (byte) 73);
        class501.method2928(0, var3);
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(IIIIII)V", line = 85)
    public static final void method3448(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (class420.field5820.field9448.method1367(arg4 + 17540) != 0 && arg1 != 0 && class57.field884 < 50 && arg0 != -1) {
            class278.field4014[class57.field884++] = new class420((byte) 1, arg0, arg1, arg5, arg2, 0, arg3, null);
        }
        field8441++;
        if (arg4 != -1) {
            field8445 = null;
        }
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(I)V", line = 104)
    public static void method3449(int arg0) {
        field8451 = null;
        if (arg0 == 8) {
            field8445 = null;
        }
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(ZBZ)V", line = 117)
    public static final void method3450(boolean arg0, byte arg1, boolean arg2) {
        field8440++;
        if (arg0) {
            class390.field5443++;
            class400.method2376(arg1 + 3);
        }
        if (arg1 != -6) {
            field8451 = null;
        }
        if (arg2) {
            class269.field3798++;
            class546.method3160(false);
        }
    }
}
