import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class219 {

    @OriginalMember(owner = "client!li", name = "a", descriptor = "I")
    public static int field3445 = 0;

    @OriginalMember(owner = "client!li", name = "b", descriptor = "I")
    public static int field3446;

    @OriginalMember(owner = "client!li", name = "c", descriptor = "I")
    public static int field3447;

    @OriginalMember(owner = "client!li", name = "d", descriptor = "I")
    public static int field3448;

    @OriginalMember(owner = "client!li", name = "e", descriptor = "I")
    public static int field3449;

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IIIBIIIII)V", line = 7)
    public static final void method1568(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field3448++;
        int var9 = arg2 - arg1;
        int var10 = arg7 - arg5;
        int var11 = (arg4 - arg6 << 16) / var10;
        int var12 = (arg0 - arg8 << 16) / var9;
        class122.method937(arg5, arg7, arg1, var12, var11, 0, arg8, 0, arg6, arg2, (byte) 92);
        if (arg3 > -85) {
            method1570((String) null, 24, -123, -10, 112);
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(I)V", line = 27)
    public static final void method1569(int arg0) {
        class305.field4779 = new class184[class37.field563.method1513(121)][];
        class261.field3867 = new boolean[class37.field563.method1513(111)];
        field3446++;
        if (arg0 > -22) {
            field3445 = -94;
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Ljava/lang/String;IIII)V", line = 41)
    public static final void method1570(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 != -4620) {
            return;
        }
        field3447++;
        class184 var5 = class314.method2167(arg1, arg4, arg2 + 2199);
        if (var5 == null) {
            return;
        }
        if (var5.field2868 != null) {
            class167 var6 = new class167();
            var6.field2510 = var5.field2868;
            var6.field2506 = arg0;
            var6.field2515 = arg3;
            var6.field2518 = var5;
            class272.method1889(1, var6);
        }
        boolean var7 = true;
        if (var5.field2881 > 0) {
            var7 = class324.method2229(var5, 16096);
        }
        if (!var7 || !client.method1764(var5).method1928(arg3 - 1, (byte) -60)) {
            return;
        }
        if (arg3 == 1) {
            class200.field3173++;
            class159.field2372.method59(205, (byte) 73);
            class159.field2372.method259(-15195, arg4);
            class159.field2372.method263(arg1, (byte) 88);
        }
        if (arg3 == 2) {
            class159.field2372.method59(174, (byte) 73);
            class159.field2372.method259(-15195, arg4);
            class64.field957++;
            class159.field2372.method263(arg1, (byte) 90);
        }
        if (arg3 == 3) {
            class269.field4055++;
            class159.field2372.method59(62, (byte) 73);
            class159.field2372.method259(-15195, arg4);
            class159.field2372.method263(arg1, (byte) 93);
        }
        if (arg3 == 4) {
            class176.field2634++;
            class159.field2372.method59(165, (byte) 73);
            class159.field2372.method259(-15195, arg4);
            class159.field2372.method263(arg1, (byte) 95);
        }
        if (arg3 == 5) {
            class159.field2372.method59(89, (byte) 73);
            class159.field2372.method259(arg2 - 10575, arg4);
            class112.field1769++;
            class159.field2372.method263(arg1, (byte) 105);
        }
        if (arg3 == 6) {
            class282.field4351++;
            class159.field2372.method59(50, (byte) 73);
            class159.field2372.method259(arg2 - 10575, arg4);
            class159.field2372.method263(arg1, (byte) 96);
        }
        if (arg3 == 7) {
            class93.field1345++;
            class159.field2372.method59(212, (byte) 73);
            class159.field2372.method259(-15195, arg4);
            class159.field2372.method263(arg1, (byte) 90);
        }
        if (arg3 == 8) {
            class37.field561++;
            class159.field2372.method59(189, (byte) 73);
            class159.field2372.method259(-15195, arg4);
            class159.field2372.method263(arg1, (byte) 115);
        }
        if (arg3 == 9) {
            class159.field2372.method59(91, (byte) 73);
            class315.field4901++;
            class159.field2372.method259(-15195, arg4);
            class159.field2372.method263(arg1, (byte) 96);
        }
        if (arg3 == 10) {
            class159.field2372.method59(199, (byte) 73);
            class203.field3222++;
            class159.field2372.method259(-15195, arg4);
            class159.field2372.method263(arg1, (byte) 106);
        }
    }
}
