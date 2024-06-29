import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dq")
public class class414 {

    @OriginalMember(owner = "client!dq", name = "b", descriptor = "I")
    public int field6004 = 0;

    @OriginalMember(owner = "client!dq", name = "k", descriptor = "I")
    public static volatile int field6013 = 0;

    @OriginalMember(owner = "client!dq", name = "j", descriptor = "I")
    public static int field6012 = -1;

    @OriginalMember(owner = "client!dq", name = "e", descriptor = "Lng;")
    public static class190 field6007 = new class190(260);

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "I")
    public static int field6003;

    @OriginalMember(owner = "client!dq", name = "c", descriptor = "I")
    public static int field6005;

    @OriginalMember(owner = "client!dq", name = "d", descriptor = "I")
    public static int field6006;

    @OriginalMember(owner = "client!dq", name = "f", descriptor = "I")
    public static int field6008;

    @OriginalMember(owner = "client!dq", name = "g", descriptor = "I")
    public static int field6009;

    @OriginalMember(owner = "client!dq", name = "h", descriptor = "I")
    public static int field6010;

    @OriginalMember(owner = "client!dq", name = "i", descriptor = "I")
    public static int field6011;

    @OriginalMember(owner = "client!dq", name = "l", descriptor = "I")
    public static int field6014;

    @OriginalMember(owner = "client!dq", name = "n", descriptor = "[I")
    public static int[] field6016;

    @OriginalMember(owner = "client!dq", name = "m", descriptor = "[Lvg;")
    public static class33[] field6015;

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(IIIBII)V")
    public static final void method2648(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        field6003++;
        int var6 = arg0 - arg4;
        int var7 = arg5 - arg2;
        if (var7 == 0) {
            if (var6 != 0) {
                class367.method2354(arg4, arg1, -4278, arg2, arg0);
            }
        } else if (var6 == 0) {
            class218.method1389(arg5, arg4, arg2, -501, arg1);
        } else {
            if (arg3 >= -51) {
                field6015 = null;
            }
            if (var6 < 0) {
                var6 = -var6;
            }
            if (var7 < 0) {
                var7 = -var7;
            }
            boolean var8 = var7 < var6;
            if (var8) {
                int var9 = arg2;
                arg2 = arg4;
                int var10 = arg5;
                arg5 = arg0;
                arg4 = var9;
                arg0 = var10;
            }
            if (arg2 > arg5) {
                int var11 = arg2;
                int var12 = arg4;
                arg2 = arg5;
                arg4 = arg0;
                arg5 = var11;
                arg0 = var12;
            }
            int var13 = arg4;
            int var14 = arg5 - arg2;
            int var15 = arg0 - arg4;
            int var16 = -(var14 >> 1);
            int var17 = arg4 >= arg0 ? -1 : 1;
            if (var15 < 0) {
                var15 = -var15;
            }
            if (var8) {
                for (int var19 = arg2; var19 <= arg5; var19++) {
                    var16 += var15;
                    class84.field1286[var19][var13] = arg1;
                    if (var16 > 0) {
                        var13 += var17;
                        var16 -= var14;
                    }
                }
            } else {
                for (int var18 = arg2; var18 <= arg5; var18++) {
                    var16 += var15;
                    class84.field1286[var13][var18] = arg1;
                    if (var16 > 0) {
                        var13 += var17;
                        var16 -= var14;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(II[Ljava/lang/Object;B[J)V")
    public static final void method2649(int arg0, int arg1, Object[] arg2, byte arg3, long[] arg4) {
        int var5 = 32 / ((-arg3 - 42) / 61);
        field6009++;
        if (arg1 >= arg0) {
            return;
        }
        int var6 = (arg0 + arg1) / 2;
        int var7 = arg1;
        long var8 = arg4[var6];
        arg4[var6] = arg4[arg0];
        arg4[arg0] = var8;
        Object var10 = arg2[var6];
        arg2[var6] = arg2[arg0];
        arg2[arg0] = var10;
        for (int var11 = arg1; var11 < arg0; var11++) {
            if ((long) (var11 & 0x1) + var8 > arg4[var11]) {
                long var12 = arg4[var11];
                arg4[var11] = arg4[var7];
                arg4[var7] = var12;
                Object var14 = arg2[var11];
                arg2[var11] = arg2[var7];
                arg2[var7++] = var14;
            }
        }
        arg4[arg0] = arg4[var7];
        arg4[var7] = var8;
        arg2[arg0] = arg2[var7];
        arg2[var7] = var10;
        method2649(var7 - 1, arg1, arg2, (byte) 104, arg4);
        method2649(arg0, var7 + 1, arg2, (byte) -128, arg4);
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Ltg;")
    public static final class126 method2650(Throwable arg0, String arg1) {
        field6005++;
        class126 var2;
        if ((arg0 instanceof class126)) {
            var2 = (class126) arg0;
            var2.field1774 = var2.field1774 + ' ' + arg1;
        } else {
            var2 = new class126(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(Leb;I)V")
    public final void method2651(class371 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2429(0);
            if (var3 == 0) {
                field6011++;
                if (arg1 != -1) {
                    field6016 = null;
                    return;
                }
                return;
            }
            this.method2653((byte) -73, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(IIIIIIIII)Z")
    public static final boolean method2652(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field6014++;
        if (arg0 + arg6 <= arg2 || arg6 >= arg2 + arg8) {
            return false;
        } else if (arg3 + arg5 > arg7 && (arg4 + arg7) > arg3) {
            if (arg1 > -16) {
                field6007 = null;
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(BLeb;I)V")
    private final void method2653(byte arg0, class371 arg1, int arg2) {
        field6010++;
        if (arg0 != -73) {
            this.method2653((byte) 105, (class371) null, 59);
        }
        if (arg2 == 5) {
            this.field6004 = arg1.method2403((byte) 113);
        }
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(B)V")
    public static void method2654(byte arg0) {
        field6016 = null;
        field6015 = null;
        if (arg0 > -109) {
            method2650((Throwable) null, (String) null);
        }
        field6007 = null;
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(II)V")
    public static final void method2655(int arg0, int arg1) {
        class377.field5379.method1254(arg1, -54);
        if (arg0 != -1) {
            field6007 = null;
        }
        field6008++;
    }
}
