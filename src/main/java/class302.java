import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class302 {

    @OriginalMember(owner = "client!be", name = "a", descriptor = "Lsf;")
    public static class108 field5246 = class140.method973(255, "::fpson");

    @OriginalMember(owner = "client!be", name = "f", descriptor = "Lsf;")
    public static class108 field5251 = class140.method973(255, "Sprites geladen)3");

    @OriginalMember(owner = "client!be", name = "b", descriptor = "I")
    public static int field5247;

    @OriginalMember(owner = "client!be", name = "c", descriptor = "I")
    public static int field5248;

    @OriginalMember(owner = "client!be", name = "d", descriptor = "I")
    public static int field5249;

    @OriginalMember(owner = "client!be", name = "e", descriptor = "I")
    public static int field5250;

    @OriginalMember(owner = "client!be", name = "h", descriptor = "I")
    public static int field5253;

    @OriginalMember(owner = "client!be", name = "i", descriptor = "I")
    public static int field5254;

    @OriginalMember(owner = "client!be", name = "g", descriptor = "Ldn;")
    public static class232 field5252;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(BII)V", line = 11)
    public static final void method2121(byte arg0, int arg1, int arg2) {
        if (arg0 != 95) {
            method2121((byte) 127, -63, 25);
        }
        field5254++;
        if (class219.method1508(arg1, arg0 - 218)) {
            class62.method432((byte) 119, class320.field5485[arg1], arg2);
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(B)V", line = 30)
    public static void method2122(byte arg0) {
        field5251 = null;
        if (arg0 > 44) {
            field5246 = null;
            field5252 = null;
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IIIIIII)V", line = 46)
    public static final void method2123(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class295[] var7 = class121.field2075;
        int var8 = 0;
        if (arg4 <= 28) {
            field5252 = (class232) null;
        }
        while (var8 < var7.length) {
            class295 var9 = var7[var8];
            if (var9 != null && var9.field5146 == 2) {
                class129.method887(var9.field5142 * 2, arg0, (var9.field5141 - class137.field2421 << 7) + var9.field5143, arg2 >> 1, (var9.field5148 - class305.field5295 << 7) + var9.field5153, 106, arg5 >> 1, arg6);
                if (class169.field3035 > -1 && (class116.field2000 % 20) < 10) {
                    class86.field1362[var9.field5147].method81(class169.field3035 + arg3 - 12, arg1 + -28 + class180.field3307);
                }
            }
            var8++;
        }
        field5250++;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Lik;Lik;BLdh;Lik;)Z", line = 73)
    public static final boolean method2124(class262 arg0, class262 arg1, byte arg2, class171 arg3, class262 arg4) {
        class299.field5214 = arg1;
        int var5 = 22 / ((50 - arg2) / 44);
        class58.field862 = arg0;
        class324.field5531 = arg3;
        field5247++;
        class248.field4303 = arg4;
        return true;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(I[J[I)V", line = 90)
    public static final void method2125(int arg0, long[] arg1, int[] arg2) {
        int var3 = -87 / ((arg0 + 44) / 55);
        field5253++;
        class36.method250(arg1, arg2, 0, arg1.length - 1, (byte) -91);
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(II)I", line = 102)
    public static final int method2126(int arg0, int arg1) {
        field5249++;
        if (arg1 != 1405909032) {
            field5252 = (class232) null;
        }
        return arg0 >>> 8;
    }
}
