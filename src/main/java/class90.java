import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public class class90 extends class254 {

    @OriginalMember(owner = "client!vj", name = "w", descriptor = "[Lcc;")
    public static class217[] field1371 = new class217[28];

    @OriginalMember(owner = "client!vj", name = "r", descriptor = "I")
    public static int field1366 = -1;

    @OriginalMember(owner = "client!vj", name = "t", descriptor = "[S")
    public static short[] field1368 = new short[256];

    @OriginalMember(owner = "client!vj", name = "C", descriptor = "I")
    public static int field1377 = 2301979;

    @OriginalMember(owner = "client!vj", name = "p", descriptor = "I")
    public static int field1364;

    @OriginalMember(owner = "client!vj", name = "q", descriptor = "I")
    public static int field1365;

    @OriginalMember(owner = "client!vj", name = "u", descriptor = "I")
    public static int field1369;

    @OriginalMember(owner = "client!vj", name = "x", descriptor = "I")
    public static int field1372;

    @OriginalMember(owner = "client!vj", name = "y", descriptor = "I")
    public static int field1373;

    @OriginalMember(owner = "client!vj", name = "z", descriptor = "I")
    public static int field1374;

    @OriginalMember(owner = "client!vj", name = "A", descriptor = "I")
    public static int field1375;

    @OriginalMember(owner = "client!vj", name = "D", descriptor = "I")
    public static int field1378;

    @OriginalMember(owner = "client!vj", name = "B", descriptor = "J")
    public long field1376;

    @OriginalMember(owner = "client!vj", name = "s", descriptor = "Lvj;")
    public class90 field1367;

    @OriginalMember(owner = "client!vj", name = "v", descriptor = "Lvj;")
    public class90 field1370;

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "(I)Z")
    public static final boolean method608(int arg0) {
        field1364++;
        if (class272.field4303) {
            try {
                if ((Boolean) class6.method74("showingVideoAd", arg0 + 42559, class163.field2378.field1273)) {
                    return false;
                }
                return true;
            } catch (Throwable var1) {
            }
        }
        if (arg0 != -15921) {
            field1377 = -8;
        }
        return true;
    }

    @OriginalMember(owner = "client!vj", name = "d", descriptor = "(I)V")
    public final void method609(int arg0) {
        field1365++;
        if (this.field1370 == null) {
            return;
        }
        this.field1370.field1367 = this.field1367;
        this.field1367.field1370 = this.field1370;
        this.field1367 = null;
        this.field1370 = null;
        if (arg0 != -15747) {
            field1371 = null;
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "([Lha;IZIII)V")
    public static final void method610(class267[] arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        field1373++;
        if (arg3 < 121) {
            method610((class267[]) null, 34, true, 85, -24, -16);
        }
        for (int var6 = 0; var6 < arg0.length; var6++) {
            class267 var7 = arg0[var6];
            if (var7 != null && var7.field4139 == arg4) {
                class56.method377((byte) -76, arg5, var7, arg1, arg2);
                class181.method1172(var7, arg5, arg1, (byte) -4);
                if (var7.field4059 > (var7.field4152 - var7.field4177)) {
                    var7.field4059 = var7.field4152 - var7.field4177;
                }
                if ((var7.field4134 - var7.field4051) < var7.field4140) {
                    var7.field4140 = var7.field4134 - var7.field4051;
                }
                if (var7.field4140 < 0) {
                    var7.field4140 = 0;
                }
                if (var7.field4059 < 0) {
                    var7.field4059 = 0;
                }
                if (var7.field4149 == 0) {
                    class130.method897(-501, var7, arg2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(ILve;Z)Lij;")
    public static final class69 method611(int arg0, class233 arg1, boolean arg2) {
        field1378++;
        return class255.method1711(arg1, arg2, arg0) ? class63.method443(false) : null;
    }

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "(II)I")
    public static final int method612(int arg0, int arg1) {
        field1374++;
        if (arg1 > 0) {
            return 1;
        } else if (arg1 < arg0) {
            return -1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!vj", name = "e", descriptor = "(I)V")
    public static void method613(int arg0) {
        field1371 = null;
        if (arg0 != -1) {
            field1368 = null;
        }
        field1368 = null;
    }
}
