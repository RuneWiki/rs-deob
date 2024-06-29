import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class149 {

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "Lr;")
    public static class66 field2688 = class93.method641(43, "overlay");

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "I")
    public static int field2686;

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "I")
    public static int field2687;

    @OriginalMember(owner = "client!jj", name = "d", descriptor = "I")
    public static int field2689;

    @OriginalMember(owner = "client!jj", name = "e", descriptor = "I")
    public static int field2690;

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lp;Lsg;II)V")
    public static final void method1014(class86 arg0, class247 arg1, int arg2, int arg3) {
        field2686++;
        byte[] var4 = null;
        class125 var5 = class256.field4499;
        synchronized (class256.field4499) {
            for (class147 var6 = (class147) class256.field4499.method873((byte) 76); var6 != null; var6 = (class147) class256.field4499.method870((byte) -128)) {
                if ((long) arg3 == var6.field1560 && var6.field2677 == arg0 && var6.field2684 == 0) {
                    var4 = var6.field2672;
                    break;
                }
            }
        }
        if (var4 != null) {
            arg1.method1622(-71, true, var4, arg0, arg3);
            return;
        }
        if (arg2 != 1) {
            method1016(5);
        }
        byte[] var7 = arg0.method613(arg3, true);
        arg1.method1622(-44, true, var7, arg0, arg3);
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(II)V")
    public static final void method1015(int arg0, int arg1) {
        field2687++;
        if (arg0 == -1 && class25.field323 == null || class25.field323.length < arg1) {
            class25.field323 = new int[arg1];
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(I)V")
    public static void method1016(int arg0) {
        if (arg0 == -1) {
            field2688 = null;
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "([Lr;[SIZI)V")
    public static final void method1017(class66[] arg0, short[] arg1, int arg2, boolean arg3, int arg4) {
        if (arg2 > arg4) {
            int var5 = (arg2 + arg4) / 2;
            int var6 = arg4;
            class66 var7 = arg0[var5];
            arg0[var5] = arg0[arg2];
            arg0[arg2] = var7;
            short var8 = arg1[var5];
            arg1[var5] = arg1[arg2];
            arg1[arg2] = var8;
            for (int var9 = arg4; var9 < arg2; var9++) {
                if (var7 == null || arg0[var9] != null && arg0[var9].method484(arg3, var7) < (var9 & 0x1)) {
                    class66 var10 = arg0[var9];
                    arg0[var9] = arg0[var6];
                    arg0[var6] = var10;
                    short var11 = arg1[var9];
                    arg1[var9] = arg1[var6];
                    arg1[var6++] = var11;
                }
            }
            arg0[arg2] = arg0[var6];
            arg0[var6] = var7;
            arg1[arg2] = arg1[var6];
            arg1[var6] = var8;
            method1017(arg0, arg1, var6 - 1, arg3, arg4);
            method1017(arg0, arg1, arg2, false, var6 + 1);
        }
        field2690++;
        if (arg3) {
            method1016(93);
        }
    }
}
