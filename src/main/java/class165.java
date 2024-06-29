import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class165 {

    @OriginalMember(owner = "client!af", name = "d", descriptor = "J")
    public long field2175;

    @OriginalMember(owner = "client!af", name = "c", descriptor = "Lqj;")
    private class548 field2174;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "I")
    public static int field2172;

    @OriginalMember(owner = "client!af", name = "b", descriptor = "I")
    public static int field2173;

    @OriginalMember(owner = "client!af", name = "e", descriptor = "I")
    public static int field2176;

    @OriginalMember(owner = "client!af", name = "finalize", descriptor = "()V", line = 3)
    protected final void finalize() throws Throwable {
        this.field2174.method2976(this.field2175, 46);
        field2173++;
        super.finalize();
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(II[BBII)V", line = 12)
    public static final void method939(int arg0, int arg1, byte[] arg2, byte arg3, int arg4, int arg5) {
        field2172++;
        if (arg4 <= arg0) {
            return;
        }
        int var6 = arg0 + arg5;
        int var7 = arg4 - arg0 >> 2;
        if (arg3 <= 80) {
            return;
        }
        while (true) {
            var7--;
            if (var7 < 0) {
                int var8 = arg4 - arg0 & 0x3;
                while (true) {
                    var8--;
                    if (var8 < 0) {
                        return;
                    }
                    arg2[var6++] = 1;
                }
            }
            arg2[var6++] = 1;
            arg2[var6++] = 1;
            arg2[var6++] = 1;
            arg2[var6++] = 1;
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "([I[IBLac;[I)V", line = 50)
    public static final void method940(int[] arg0, int[] arg1, byte arg2, class307 arg3, int[] arg4) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            int var6 = arg0[var5];
            int var7 = arg4[var5];
            int var8 = arg1[var5];
            int var9 = 0;
            while (var7 != 0 && arg3.field9704.length > var9) {
                if ((var7 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg3.field9704[var9] = null;
                    } else {
                        class395 var10 = class583.field8149.method1844(arg2 + 158, var6);
                        int var11 = var10.field4970;
                        class248 var12 = arg3.field9704[var9];
                        if (var12 != null) {
                            if (var12.field3060 == var6) {
                                if (var11 == 0) {
                                    var12 = arg3.field9704[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field3064 = 1;
                                    var12.field3059 = 0;
                                    var12.field3061 = 0;
                                    var12.field3062 = 0;
                                    var12.field3058 = var8;
                                    class192.method1159(arg3.field6470, var10, arg3.field6461, arg3.field6464, arg2 ^ 0xFFFFFFE9, 0, false);
                                } else if (var11 == 2) {
                                    var12.field3062 = 0;
                                }
                            } else if (var10.field4983 >= class583.field8149.method1844(64, var12.field3060).field4983) {
                                var12 = arg3.field9704[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class248 var13 = arg3.field9704[var9] = new class248();
                            var13.field3060 = var6;
                            var13.field3059 = 0;
                            var13.field3062 = 0;
                            var13.field3061 = 0;
                            var13.field3058 = var8;
                            var13.field3064 = 1;
                            class192.method1159(arg3.field6470, var10, arg3.field6461, arg3.field6464, 60, 0, false);
                        }
                    }
                }
                var9++;
                var7 >>>= 0x1;
            }
        }
        field2176++;
        if (arg2 == -94) {
            ;
        }
    }

    @OriginalMember(owner = "client!af", name = "<init>", descriptor = "(Lqj;JI)V", line = 145)
    public class165(class548 arg0, long arg1, int arg2) {
        this.field2175 = arg1;
        this.field2174 = arg0;
    }
}
