import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ws")
public abstract class class530 {

    @OriginalMember(owner = "client!ws", name = "e", descriptor = "I")
    public static int field7361 = 1;

    @OriginalMember(owner = "client!ws", name = "f", descriptor = "I")
    public static int field7362 = 999999;

    @OriginalMember(owner = "client!ws", name = "b", descriptor = "I")
    public static int field7358;

    @OriginalMember(owner = "client!ws", name = "c", descriptor = "I")
    public static int field7359;

    @OriginalMember(owner = "client!ws", name = "d", descriptor = "I")
    public static int field7360;

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "[I")
    public static int[] field7357;

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(Z)V", line = 3)
    public static void method2977(boolean arg0) {
        if (!arg0) {
            method2979(-37, 94, 58, -106, null);
        }
        field7357 = null;
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(JI)V", line = 16)
    public static final void method2978(long arg0, int arg1) {
        field7358++;
        int var3 = class69.field1304;
        int var4 = class56.field807;
        if (class8.field81 != var3) {
            int var5 = var3 - class8.field81;
            int var6 = (int) ((long) var5 * arg0 / 320L);
            if (var5 <= 0) {
                if (var6 == 0) {
                    var6 = -1;
                } else if (var6 < var5) {
                    var6 = var5;
                }
            } else if (var6 == 0) {
                var6 = 1;
            } else if (var5 < var6) {
                var6 = var5;
            }
            class8.field81 += var6;
        }
        if (!class202.field2854.field7903) {
            class523.field7256 += (float) arg0 * class563.field8074 / 40.0F * 8.0F;
            class181.field2622 += (float) arg0 * class367.field5199 / 40.0F * 8.0F;
        }
        if (class372.field5377 != var4) {
            int var7 = var4 - class372.field5377;
            int var8 = (int) ((long) var7 * arg0 / 320L);
            if (var7 > 0) {
                if (var8 == 0) {
                    var8 = 1;
                } else if (var7 < var8) {
                    var8 = var7;
                }
            } else if (var8 == 0) {
                var8 = -1;
            } else if (var8 < var7) {
                var8 = var7;
            }
            class372.field5377 += var8;
        }
        class492.method2814(false);
        if (arg1 != -1) {
            field7362 = 28;
        }
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(IIIILvj;)V", line = 101)
    public static final void method2979(int arg0, int arg1, int arg2, int arg3, class382 arg4) {
        class184 var5 = class551.method3098(arg0, arg1, arg2);
        if (var5 == null) {
            return;
        }
        int var6 = 0;
        arg4.field5680 = (arg1 << class162.field2401) + class468.field6745;
        arg4.field5684 = arg3;
        arg4.field5678 = (arg2 << class162.field2401) + class468.field6745;
        for (class277 var7 = var5.field2675; var7 != null; var7 = var7.field4045) {
            if (var7.field4044.field5115) {
                int var8 = var7.field4044.method1175(false);
                if (var8 != -32768 && var8 < var6) {
                    var6 = var8;
                }
            }
        }
        if (var6 < 0) {
            arg4.field5684 += var6;
            arg4.field5675 = true;
        } else if (var5.field2662 != null) {
            arg4.field5684 -= var5.field2662.field6917;
        }
        var5.field2657 = arg4;
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(I)V", line = 143)
    public static final void method2980(int arg0) {
        for (int var1 = 0; var1 < 100; var1++) {
            class509.field7067[var1] = true;
        }
        if (arg0 != -6891) {
            field7357 = null;
        }
        field7359++;
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(Lfea;Lqa;III)V", line = 161)
    public static final void method2981(class47 arg0, class167 arg1, int arg2, int arg3, int arg4) {
        if (arg3 != 100) {
            field7361 = 22;
        }
        field7360++;
        class97.field1694.method425(-123);
        if (class54.field778) {
            return;
        }
        for (class153 var5 = (class153) arg0.method427(true); var5 != null; var5 = (class153) arg0.method420(false)) {
            class192 var6 = class212.field3095.method70(var5.field2298, 124);
            if (class299.method1873(var6, -103)) {
                boolean var7 = class23.method236(arg4, arg1, 11468, arg2, var5, var6);
                if (var7) {
                    class179.method1215(var5, var6, arg3 ^ 0xFFFFFF99, arg1);
                }
            }
        }
    }
}
