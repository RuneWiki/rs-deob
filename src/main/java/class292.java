import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class292 {

    @OriginalMember(owner = "client!k", name = "m", descriptor = "[Lkf;")
    public static class293[] field4345 = new class293[14];

    @OriginalMember(owner = "client!k", name = "i", descriptor = "J")
    public static long field4341 = 0L;

    @OriginalMember(owner = "client!k", name = "g", descriptor = "Lnk;")
    public static class206 field4339 = new class206();

    @OriginalMember(owner = "client!k", name = "b", descriptor = "C")
    public static char field4334;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "I")
    public static int field4333;

    @OriginalMember(owner = "client!k", name = "c", descriptor = "I")
    public static int field4335;

    @OriginalMember(owner = "client!k", name = "d", descriptor = "I")
    public static int field4336;

    @OriginalMember(owner = "client!k", name = "e", descriptor = "I")
    public static int field4337;

    @OriginalMember(owner = "client!k", name = "h", descriptor = "I")
    public static int field4340;

    @OriginalMember(owner = "client!k", name = "j", descriptor = "I")
    public static int field4342;

    @OriginalMember(owner = "client!k", name = "k", descriptor = "I")
    public static int field4343;

    @OriginalMember(owner = "client!k", name = "l", descriptor = "I")
    public static int field4344;

    @OriginalMember(owner = "client!k", name = "f", descriptor = "Ldp;")
    public static class174 field4338;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;IIILjava/lang/String;Ljava/lang/String;)V", line = 8)
    public static final void method2038(String arg0, byte arg1, String arg2, int arg3, int arg4, int arg5, String arg6, String arg7) {
        field4337++;
        int var8 = 99;
        if (arg1 > -112) {
            field4341 = -112L;
        }
        while (var8 > 0) {
            class293.field4356[var8] = class293.field4356[var8 - 1];
            class30.field444[var8] = class30.field444[var8 - 1];
            class452.field6562[var8] = class452.field6562[var8 - 1];
            class99.field1550[var8] = class99.field1550[var8 - 1];
            class282.field4231[var8] = class282.field4231[var8 - 1];
            class333.field4779[var8] = class333.field4779[var8 - 1];
            class72.field1204[var8] = class72.field1204[var8 - 1];
            var8--;
        }
        class293.field4356[0] = arg3;
        class30.field444[0] = arg5;
        class452.field6562[0] = arg7;
        class99.field1550[0] = arg2;
        class282.field4231[0] = arg6;
        class72.field1204[0] = arg4;
        class333.field4779[0] = arg0;
        class47.field762++;
        class23.field352 = class341.field4845;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(III)V", line = 47)
    public static final void method2039(int arg0, int arg1, int arg2) {
        if (arg2 == -1) {
            class270.field4049 = arg0 - class272.field4096;
            class243.field3541 = arg1 - class272.field4088;
            field4342++;
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IIIZ)V", line = 60)
    public static final void method2040(int arg0, int arg1, int arg2, boolean arg3) {
        field4335++;
        if (arg1 < 8000 || arg1 > 48000) {
            throw new IllegalArgumentException();
        }
        class267.field3998 = arg0;
        class122.field1929 = arg3;
        if (arg2 > -75) {
            field4341 = -126L;
        }
        class326.field4692 = arg1;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Z)V", line = 85)
    public static final void method2041(boolean arg0) {
        field4344++;
        class444.method2776((long) class267.field4002, class73.field1235, (byte) -83);
        if (class321.field4642 != -1) {
            class339.method2198((byte) 4, class321.field4642);
        }
        if (arg0) {
            field4334 = 'Q';
        }
        for (int var1 = 0; var1 < class32.field449; var1++) {
            if (class254.field3685[var1]) {
                class255.field3697[var1] = true;
            }
            class371.field5250[var1] = class254.field3685[var1];
            class254.field3685[var1] = false;
        }
        class423.field6169 = class267.field4002;
        if (class73.field1235.method707()) {
            class289.field4316 = true;
        }
        class369.field5235 = null;
        if (class321.field4642 != -1) {
            class32.field449 = 0;
            class129.method1086((byte) -118);
        }
        class73.field1235.method751();
        class58.method449(92, class206.field3027);
        class409.field5967 = 0;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(I)V", line = 126)
    public static final void method2042(int arg0) {
        class18 var1 = class83.field1360;
        synchronized (class83.field1360) {
            if (arg0 != 0) {
                method2045(-99);
            }
            class83.field1360.method106((byte) -104);
        }
        field4343++;
        class18 var2 = class418.field6059;
        synchronized (class418.field6059) {
            class418.field6059.method106((byte) -108);
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(ILja;)V", line = 142)
    public static final void method2043(int arg0, class90 arg1) {
        if (arg0 != -1) {
            field4341 = -104L;
        }
        if (class84.field1365) {
            class21.method143(true, arg1);
        } else {
            class41.method342(arg1, false);
        }
        field4333++;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "([III[IB)V", line = 157)
    public static final void method2044(int[] arg0, int arg1, int arg2, int[] arg3, byte arg4) {
        if (arg4 < 53) {
            method2039(89, 80, -53);
        }
        if (arg2 > arg1) {
            int var5 = (arg1 + arg2) / 2;
            int var6 = arg1;
            int var7 = arg0[var5];
            arg0[var5] = arg0[arg2];
            arg0[arg2] = var7;
            int var8 = arg3[var5];
            arg3[var5] = arg3[arg2];
            arg3[arg2] = var8;
            for (int var9 = arg1; var9 < arg2; var9++) {
                if (arg0[var9] < (var9 & 0x1) + var7) {
                    int var10 = arg0[var9];
                    arg0[var9] = arg0[var6];
                    arg0[var6] = var10;
                    int var11 = arg3[var9];
                    arg3[var9] = arg3[var6];
                    arg3[var6++] = var11;
                }
            }
            arg0[arg2] = arg0[var6];
            arg0[var6] = var7;
            arg3[arg2] = arg3[var6];
            arg3[var6] = var8;
            method2044(arg0, arg1, var6 - 1, arg3, (byte) 73);
            method2044(arg0, var6 + 1, arg2, arg3, (byte) 118);
        }
        field4336++;
    }

    @OriginalMember(owner = "client!k", name = "b", descriptor = "(I)V", line = 213)
    public static void method2045(int arg0) {
        field4339 = null;
        field4338 = null;
        field4345 = null;
        if (arg0 != 0) {
            method2038((String) null, (byte) -43, (String) null, -41, 16, -81, (String) null, (String) null);
        }
    }
}
