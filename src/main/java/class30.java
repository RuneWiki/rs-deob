import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class30 {

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "Z")
    public static boolean field418 = false;

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "[Lfo;")
    public static class542[] field421 = new class542[75];

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "I")
    public static int field419;

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "I")
    public static int field420;

    @OriginalMember(owner = "client!uc", name = "e", descriptor = "I")
    public static int field422;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(ILha;IIIII)V")
    public static final void method252(int arg0, class65 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if ((class639.field8966 == null || class205.field3183 == null || class758.field10461 == null) && class152.field2163.method4349((byte) -102, class319.field4528) && class152.field2163.method4349((byte) -102, class737.field10170) && class152.field2163.method4349((byte) -102, class528.field7548)) {
            class1 var7 = class1.method5(class152.field2163, class737.field10170, 0);
            class205.field3183 = arg1.method551(var7, true);
            var7.method6();
            class78.field888 = arg1.method551(var7, true);
            class639.field8966 = arg1.method551(class1.method5(class152.field2163, class319.field4528, 0), true);
            class1 var8 = class1.method5(class152.field2163, class528.field7548, 0);
            class758.field10461 = arg1.method551(var8, true);
            var8.method6();
            class273.field3936 = arg1.method551(var8, true);
        }
        field420++;
        if (class639.field8966 != null && class205.field3183 != null && class758.field10461 != null) {
            int var9 = (arg0 - (class758.field10461.method1508() * 2)) / class639.field8966.method1508();
            for (int var10 = 0; var10 < var9; var10++) {
                class639.field8966.method1604(arg2 - (-class758.field10461.method1508() - class639.field8966.method1508() * var10), -class639.field8966.method1502() + arg5 + arg3);
            }
            int var11 = (arg5 - class758.field10461.method1502() - arg6) / class205.field3183.method1502();
            for (int var12 = 0; var12 < var11; var12++) {
                class205.field3183.method1604(arg2, arg3 - (-arg6 - class205.field3183.method1502() * var12));
                class78.field888.method1604(arg0 + arg2 - class78.field888.method1508(), class205.field3183.method1502() * var12 + arg3 + arg6);
            }
            class758.field10461.method1604(arg2, arg3 + arg5 - class758.field10461.method1502());
            class273.field3936.method1604(arg2 + (arg0 - class758.field10461.method1508()), arg3 + (arg5 - class758.field10461.method1502()));
        }
        if (arg4 != 5308) {
            method253(-80);
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)V")
    public static void method253(int arg0) {
        field421 = null;
        if (arg0 != 2) {
            method253(-35);
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "([Ljava/lang/Object;I[JII)V")
    public static final void method254(Object[] arg0, int arg1, long[] arg2, int arg3, int arg4) {
        if (arg1 < arg4) {
            int var5 = (arg1 + arg4) / 2;
            int var6 = arg1;
            long var7 = arg2[var5];
            arg2[var5] = arg2[arg4];
            arg2[arg4] = var7;
            Object var9 = arg0[var5];
            arg0[var5] = arg0[arg4];
            arg0[arg4] = var9;
            int var10 = var7 == Long.MAX_VALUE ? 0 : 1;
            for (int var11 = arg1; var11 < arg4; var11++) {
                if (((long) (var11 & var10) + var7) > arg2[var11]) {
                    long var12 = arg2[var11];
                    arg2[var11] = arg2[var6];
                    arg2[var6] = var12;
                    Object var14 = arg0[var11];
                    arg0[var11] = arg0[var6];
                    arg0[var6++] = var14;
                }
            }
            arg2[arg4] = arg2[var6];
            arg2[var6] = var7;
            arg0[arg4] = arg0[var6];
            arg0[var6] = var9;
            method254(arg0, arg1, arg2, arg3, var6 - 1);
            method254(arg0, var6 + 1, arg2, 1, arg4);
        }
        if (arg3 != 1) {
            method254(null, 58, null, -81, -34);
        }
        field422++;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IJI)Ljava/lang/String;")
    public static final String method255(int arg0, long arg1, int arg2) {
        class193.method1338(arg1, -25);
        if (arg0 != 26105) {
            field421 = null;
        }
        field419++;
        int var4 = class4.field30.get(5);
        int var5 = class4.field30.get(2);
        int var6 = class4.field30.get(1);
        return arg2 == 3 ? class415.method2525(arg1, arg2, (byte) -128) : Integer.toString(var4 / 10) + var4 % 10 + "-" + class159.field2546[arg2][var5] + "-" + var6;
    }
}
