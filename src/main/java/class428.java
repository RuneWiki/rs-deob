import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iq")
public class class428 extends class439 {

    @OriginalMember(owner = "client!iq", name = "n", descriptor = "I")
    public int field6248;

    @OriginalMember(owner = "client!iq", name = "q", descriptor = "I")
    public int field6251;

    @OriginalMember(owner = "client!iq", name = "o", descriptor = "Lvp;")
    public static class123 field6249 = new class123(79, -1);

    @OriginalMember(owner = "client!iq", name = "s", descriptor = "[F")
    public static float[] field6253 = new float[16384];

    @OriginalMember(owner = "client!iq", name = "u", descriptor = "[Lje;")
    public static class275[] field6255 = new class275[30];

    @OriginalMember(owner = "client!iq", name = "v", descriptor = "[F")
    public static float[] field6256 = new float[16384];

    @OriginalMember(owner = "client!iq", name = "p", descriptor = "I")
    public static int field6250;

    @OriginalMember(owner = "client!iq", name = "r", descriptor = "I")
    public static int field6252;

    @OriginalMember(owner = "client!iq", name = "t", descriptor = "I")
    public static int field6254;

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field6253[var2] = (float) Math.sin((double) var2 * var0);
            field6256[var2] = (float) Math.cos((double) var2 * var0);
        }
    }

    @OriginalMember(owner = "client!iq", name = "c", descriptor = "(I)V", line = 6)
    public static void method2609(int arg0) {
        field6249 = null;
        field6253 = null;
        field6255 = null;
        int var1 = 18 / ((arg0 - 30) / 55);
        field6256 = null;
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(ILkh;IBLbo;ILps;I)V", line = 18)
    public static final void method2610(int arg0, class13 arg1, int arg2, byte arg3, class510 arg4, int arg5, class62 arg6, int arg7) {
        field6252++;
        class81 var8 = new class81();
        var8.field1332 = arg2 << 7;
        if (arg3 <= 104) {
            method2610(-113, null, -77, (byte) -66, null, -96, null, -85);
        }
        var8.field1340 = arg0;
        var8.field1342 = arg7 << 7;
        if (arg4 != null) {
            var8.field1331 = arg4;
            int var10 = arg4.field7459;
            int var11 = arg4.field7475;
            if (arg5 == 1 || arg5 == 3) {
                var10 = arg4.field7475;
                var11 = arg4.field7459;
            }
            var8.field1352 = arg4.field7470;
            var8.field1344 = arg4.field7487;
            var8.field1330 = arg4.field7502;
            var8.field1336 = arg2 + var10 << 7;
            var8.field1346 = arg7 + var11 << 7;
            var8.field1333 = arg4.field7457 << 7;
            var8.field1341 = arg4.field7503;
            var8.field1338 = arg4.field7461;
            if (arg4.field7497 != null) {
                var8.field1345 = true;
                var8.method649(115);
            }
            if (var8.field1338 != null) {
                var8.field1348 = (int) (Math.random() * (double) (var8.field1352 - var8.field1330)) + var8.field1330;
            }
            class278.field4007.method2270(0, var8);
        } else if (arg1 != null) {
            var8.field1334 = arg1;
            class148 var9 = arg1.field210;
            if (var9.field2193 != null) {
                var8.field1345 = true;
                var9 = var9.method1059((byte) -51, class526.field7733);
            }
            if (var9 != null) {
                var8.field1346 = var9.field2214 + arg7 << 7;
                var8.field1336 = var9.field2214 + arg2 << 7;
                var8.field1341 = class286.method1791(arg1, (byte) 78);
                var8.field1333 = var9.field2206 << 7;
                var8.field1344 = var9.field2189;
            }
            class11.field192.method2270(0, var8);
        } else if (arg6 != null) {
            var8.field1350 = arg6;
            var8.field1336 = arg6.method184(1) + arg2 << 7;
            var8.field1346 = arg6.method184(1) + arg7 << 7;
            var8.field1341 = class360.method2318(arg6, -1);
            var8.field1333 = arg6.field1085 << 7;
            var8.field1344 = arg6.field1069;
            class351.field5333.method2486(-122, var8, (long) arg6.field331);
            return;
        }
    }

    @OriginalMember(owner = "client!iq", name = "d", descriptor = "(I)I", line = 114)
    public static final int method2611(int arg0) {
        field6254++;
        if (arg0 != 1) {
            method2609(41);
        }
        if (class320.field4577 == null) {
            return class396.field5828 ? 2 : 1;
        } else {
            return 3;
        }
    }

    @OriginalMember(owner = "client!iq", name = "<init>", descriptor = "(II)V", line = 134)
    public class428(int arg0, int arg1) {
        this.field6248 = arg0;
        this.field6251 = arg1;
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(IIIII)I", line = 152)
    public static final int method2612(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field6250++;
        int var5 = arg0 & 0xF;
        int var6 = var5 >= 8 ? arg4 : arg1;
        int var7 = arg3 < ~var5 ? arg4 : (var5 == 12 || var5 == 14 ? arg1 : arg2);
        return ((var5 & 0x2) == 0 ? var7 : -var7) + ((var5 & 0x1) == 0 ? var6 : -var6);
    }
}
