import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fr")
public class class378 {

    @OriginalMember(owner = "client!fr", name = "e", descriptor = "J")
    public long field5078;

    @OriginalMember(owner = "client!fr", name = "b", descriptor = "Lkga;")
    private class506 field5075;

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "I")
    public static int field5074;

    @OriginalMember(owner = "client!fr", name = "d", descriptor = "I")
    public static int field5077;

    @OriginalMember(owner = "client!fr", name = "f", descriptor = "I")
    public static int field5079;

    @OriginalMember(owner = "client!fr", name = "g", descriptor = "I")
    public static int field5080;

    @OriginalMember(owner = "client!fr", name = "c", descriptor = "[I")
    public static int[] field5076;

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(Z)V", line = 3)
    public static void method2195(boolean arg0) {
        field5076 = null;
        if (!arg0) {
            field5076 = null;
        }
    }

    @OriginalMember(owner = "client!fr", name = "finalize", descriptor = "()V", line = 17)
    protected final void finalize() throws Throwable {
        field5079++;
        this.field5075.method3005(0, this.field5078);
        super.finalize();
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(BZLjava/lang/String;ZILjava/lang/String;I)V", line = 29)
    public static final void method2196(byte arg0, boolean arg1, String arg2, boolean arg3, int arg4, String arg5, int arg6) {
        class187.field2287.field9597 = 1;
        field5077++;
        String var7 = arg2.toLowerCase();
        short[] var8 = new short[16];
        if (arg0 <= 125) {
            return;
        }
        int var9 = -1;
        String var10 = null;
        if (arg4 != -1) {
            class184 var11 = class582.field8483.method2536((byte) -121, arg4);
            if (var11 == null || arg1 != var11.method1144(-5)) {
                return;
            }
            if (var11.method1144(-5)) {
                var10 = var11.field2249;
            } else {
                var9 = var11.field2253;
            }
        }
        int var12 = 0;
        for (int var13 = 0; var13 < class65.field1021.field310; var13++) {
            class238 var16 = class65.field1021.method178(false, var13);
            if ((!arg3 || var16.field3260) && var16.field3203 == -1 && var16.field3195 == -1 && var16.field3222 == 0 && var16.field3261.toLowerCase().indexOf(var7) != -1) {
                if (arg4 != -1) {
                    if (arg1) {
                        if (!arg5.equals(var16.method1458((byte) 93, arg4, var10))) {
                            continue;
                        }
                    } else if (var16.method1459(var9, -7356, arg4) != arg6) {
                        continue;
                    }
                }
                if (var12 >= 250) {
                    class70.field1071 = null;
                    class596.field8615 = -1;
                    return;
                }
                if (var8.length <= var12) {
                    short[] var17 = new short[var8.length * 2];
                    for (int var18 = 0; var18 < var12; var18++) {
                        var17[var18] = var8[var18];
                    }
                    var8 = var17;
                }
                var8[var12++] = (short) var13;
            }
        }
        class596.field8615 = var12;
        class70.field1071 = var8;
        class285.field3862 = 0;
        String[] var14 = new String[class596.field8615];
        for (int var15 = 0; var15 < class596.field8615; var15++) {
            var14[var15] = class65.field1021.method178(false, var8[var15]).field3261;
        }
        class228.method1386(var14, 79, class70.field1071);
        class187.field2287.method3785((byte) -117);
        class187.field2287.field9597 = 2;
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(IZI)V", line = 143)
    public static final void method2197(int arg0, boolean arg1, int arg2) {
        field5080++;
        class168.field2054 = arg2;
        class611.field8763 = 3;
        if (arg0 < 60) {
            method2196((byte) -18, false, null, true, -72, null, 34);
        }
        class426.method2565(class577.field8433.field4476, true, class577.field8433.field4480);
        if (arg1) {
            class256.method1559("", false, (byte) 23, "");
        } else {
            class496.method2890((byte) -61);
            class256.method1559(class14.field240, false, (byte) 23, class682.field9753);
        }
    }

    @OriginalMember(owner = "client!fr", name = "<init>", descriptor = "(Lkga;J[Lbba;)V", line = 163)
    public class378(class506 arg0, long arg1, class97[] arg2) {
        this.field5078 = arg1;
        this.field5075 = arg0;
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(I)V", line = 176)
    public static final void method2198(int arg0) {
        if (arg0 != -1) {
            return;
        }
        if (class323.field4325 != -1) {
            class456.method2708(-1, class323.field4325, false, (byte) -52, -1);
            class323.field4325 = -1;
        }
        field5074++;
    }
}
