import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class16 {

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "Z")
    public static boolean field204 = false;

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "I")
    public static int field205 = 0;

    @OriginalMember(owner = "client!oh", name = "d", descriptor = "Lsf;")
    public static class108 field206 = class140.method973(255, "<col=ffff00>");

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "I")
    public static int field203;

    @OriginalMember(owner = "client!oh", name = "e", descriptor = "I")
    public static int field207;

    @OriginalMember(owner = "client!oh", name = "f", descriptor = "I")
    public static int field208;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(I)V", line = 16)
    public static final void method103(int arg0) {
        class293.field5127.method1429(false);
        field208++;
        int var1 = class293.field5127.method1431((byte) -94, 1);
        if (var1 == 0) {
            return;
        }
        int var2 = class293.field5127.method1431((byte) -94, 2);
        if (var2 == 0) {
            class283.field4947[class312.field5400++] = 2047;
        } else if (var2 == 1) {
            int var3 = class293.field5127.method1431((byte) -94, 3);
            class95.field1513.method1809(var3, false, arg0 ^ 0xFFFFEA34);
            int var4 = class293.field5127.method1431((byte) -94, 1);
            if (var4 == 1) {
                class283.field4947[class312.field5400++] = 2047;
            }
        } else {
            if (arg0 != -5580) {
                method104(-43);
            }
            if (var2 == 2) {
                int var5 = class293.field5127.method1431((byte) -94, 3);
                class95.field1513.method1809(var5, true, 0);
                int var6 = class293.field5127.method1431((byte) -94, 3);
                class95.field1513.method1809(var6, true, 0);
                int var7 = class293.field5127.method1431((byte) -94, 1);
                if (var7 == 1) {
                    class283.field4947[class312.field5400++] = 2047;
                }
            } else if (var2 == 3) {
                int var8 = class293.field5127.method1431((byte) -94, 7);
                class295.field5159 = class293.field5127.method1431((byte) -94, 2);
                int var9 = class293.field5127.method1431((byte) -94, 1);
                int var10 = class293.field5127.method1431((byte) -94, 1);
                if (var10 == 1) {
                    class283.field4947[class312.field5400++] = 2047;
                }
                int var11 = class293.field5127.method1431((byte) -94, 7);
                class95.field1513.method362(-17550, ~var9 == -2, var8, var11);
            }
        }
    }

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(I)V", line = 95)
    public static void method104(int arg0) {
        if (arg0 != 7) {
            method105((class262) null, (class257[]) null, (class12[]) null, (class257[]) null, (class257[]) null, (class257[]) null, -54);
        }
        field206 = null;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(Lik;[Lt;[Lse;[Lt;[Lt;[Lt;I)V", line = 111)
    public static final void method105(class262 arg0, class257[] arg1, class12[] arg2, class257[] arg3, class257[] arg4, class257[] arg5, int arg6) {
        class10.field124 = arg3;
        if (arg6 != 1) {
            field205 = -30;
        }
        class196.field3549 = arg1;
        class103.field1803 = arg5;
        field207++;
        class95.field1521 = arg2;
        class155.field2796 = arg0;
        class143.field2526 = arg4;
        class194.field3486 = new boolean[class95.field1521.length];
        class128.field2182.method9((byte) -108);
        int var7 = class155.field2796.method1887(-1, class25.field384);
        int[] var8 = class155.field2796.method1889((byte) -26, var7);
        for (int var9 = 0; var9 < var8.length; var9++) {
            class128.field2182.method5(class7.method40(new class249(class155.field2796.method1868(12236, var7, var8[var9])), true), (byte) 83);
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(II)Lsl;", line = 149)
    public static final class99 method106(int arg0, int arg1) {
        int var2 = -44 % ((arg0 + 37) / 35);
        field203++;
        class99 var3 = (class99) class57.field833.method466((long) arg1, 1);
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = class114.field1953.method1868(12236, class322.method2223(9162, arg1), class121.method847((byte) 127, arg1));
        class99 var5 = new class99();
        if (var4 != null) {
            var5.method687(1, new class249(var4));
        }
        class57.field833.method468((long) arg1, (byte) -120, var5);
        return var5;
    }
}
