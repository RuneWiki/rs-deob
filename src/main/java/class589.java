import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class589 extends class108 {

    @OriginalMember(owner = "client!gi", name = "r", descriptor = "I")
    public int field8378;

    @OriginalMember(owner = "client!gi", name = "p", descriptor = "I")
    public int field8376;

    @OriginalMember(owner = "client!gi", name = "n", descriptor = "[[I")
    public static int[][] field8374 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!gi", name = "t", descriptor = "Lgi;")
    public static class589 field8380;

    @OriginalMember(owner = "client!gi", name = "k", descriptor = "I")
    public static int field8371;

    @OriginalMember(owner = "client!gi", name = "l", descriptor = "I")
    public static int field8372;

    @OriginalMember(owner = "client!gi", name = "m", descriptor = "I")
    public static int field8373;

    @OriginalMember(owner = "client!gi", name = "o", descriptor = "I")
    public static int field8375;

    @OriginalMember(owner = "client!gi", name = "q", descriptor = "I")
    public static int field8377;

    @OriginalMember(owner = "client!gi", name = "s", descriptor = "I")
    public static int field8379;

    static {
        new class567("Unable to delete friend - system busy.", "Der Freund konnte nicht entfernt werden, das System ist derzeit ausgelastet.", "Impossible de supprimer un ami - système occupé.", "Não foi possível excluir o amigo. O sistema está ocupado.");
        field8380 = new class589(0, 0);
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IBI)Z", line = 4)
    public static final boolean method3370(int arg0, byte arg1, int arg2) {
        if (arg1 != 98) {
            method3373((byte) -124);
        }
        field8375++;
        return (arg0 & 0x10000) != 0;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IILtk;IILbda;BLjk;)V", line = 17)
    public static final void method3371(int arg0, int arg1, class370 arg2, int arg3, int arg4, class400 arg5, byte arg6, class170 arg7) {
        field8372++;
        if (arg6 > -29) {
            return;
        }
        class154 var8 = new class154();
        var8.field2314 = arg3 << 7;
        var8.field2328 = arg4;
        var8.field2307 = arg0 << 7;
        if (arg2 != null) {
            var8.field2311 = arg2;
            int var9 = arg2.field5322;
            int var10 = arg2.field5277;
            if (arg1 == 1 || arg1 == 3) {
                var10 = arg2.field5322;
                var9 = arg2.field5277;
            }
            var8.field2316 = arg2.field5331;
            var8.field2315 = arg2.field5344;
            var8.field2321 = arg2.field5298;
            var8.field2320 = arg2.field5308;
            var8.field2319 = arg3 + var10 << 7;
            var8.field2324 = arg2.field5345 << 7;
            var8.field2308 = arg0 + var9 << 7;
            var8.field2313 = arg2.field5313;
            if (arg2.field5272 != null) {
                var8.field2327 = true;
                var8.method1094(84);
            }
            if (var8.field2316 != null) {
                var8.field2326 = (int) ((double) (var8.field2320 - var8.field2313) * Math.random()) + var8.field2313;
            }
            class134.field2163.method414(var8, (byte) 93);
        } else if (arg7 != null) {
            var8.field2317 = arg7;
            class432 var11 = arg7.field2492;
            if (var11.field6304 != null) {
                var8.field2327 = true;
                var11 = var11.method2582(0, class401.field6001);
            }
            if (var11 != null) {
                var8.field2308 = var11.field6337 + arg0 << 7;
                var8.field2319 = var11.field6337 + arg3 << 7;
                var8.field2315 = class19.method217(-125, arg7);
                var8.field2321 = var11.field6330;
                var8.field2324 = var11.field6335 << 7;
            }
            class90.field1611.method414(var8, (byte) 37);
        } else if (arg5 != null) {
            var8.field2322 = arg5;
            var8.field2308 = arg5.method781((byte) -124) + arg0 << 7;
            var8.field2319 = arg5.method781((byte) 60) + arg3 << 7;
            var8.field2315 = class133.method1027(arg5, false);
            var8.field2324 = arg5.field5985 << 7;
            var8.field2321 = arg5.field5962;
            class424.field6207.method737((long) arg5.field1555, (byte) 92, var8);
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lgp;I)V", line = 108)
    public static final void method3372(class561 arg0, int arg1) {
        if (arg1 > -82) {
            method3372(null, 7);
        }
        class645.field9382 = 0;
        client.field8783 = 0;
        field8373++;
        class501.field7030 = new class115();
        class358.field5088 = new class22[1024];
        class72.field1359 = new class585[class531.field7380[class507.field7055] + 1];
        class33.field448 = 0;
        class47.field653 = 0;
        class54.method452(arg0, false);
        class523.method2948(arg0, 104);
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(B)V", line = 127)
    public static final void method3373(byte arg0) {
        field8371++;
        class395 var1 = class461.field6670;
        synchronized (class461.field6670) {
            class461.field6670.method2406(arg0 + 169);
        }
        class395 var2 = class496.field6946;
        synchronized (class496.field6946) {
            class496.field6946.method2406(arg0 ^ 0xFFFFFFBE);
            if (arg0 != -78) {
                field8380 = null;
            }
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Z)V", line = 145)
    public static final void method3374(boolean arg0) {
        class111.field1837.method2406(51);
        field8377++;
        if (arg0) {
            method3373((byte) 77);
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(I)V", line = 157)
    public static void method3375(int arg0) {
        field8380 = null;
        if (arg0 <= 31) {
            method3371(47, -72, null, -127, -50, null, (byte) 87, null);
        }
        field8374 = null;
    }

    @OriginalMember(owner = "client!gi", name = "<init>", descriptor = "(II)V", line = 178)
    public class589(int arg0, int arg1) {
        this.field8378 = arg0;
        this.field8376 = arg1;
    }
}
