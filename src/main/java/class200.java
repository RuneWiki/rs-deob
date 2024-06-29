import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public class class200 extends class42 implements Runnable {

    @OriginalMember(owner = "client!wj", name = "p", descriptor = "Z")
    private boolean field2359 = true;

    @OriginalMember(owner = "client!wj", name = "o", descriptor = "I")
    public int field2358 = -1;

    @OriginalMember(owner = "client!wj", name = "r", descriptor = "Lgh;")
    private class51 field2361;

    @OriginalMember(owner = "client!wj", name = "k", descriptor = "I")
    public static int field2354;

    @OriginalMember(owner = "client!wj", name = "l", descriptor = "I")
    public static int field2355;

    @OriginalMember(owner = "client!wj", name = "m", descriptor = "I")
    public static int field2356;

    @OriginalMember(owner = "client!wj", name = "n", descriptor = "I")
    public static int field2357;

    @OriginalMember(owner = "client!wj", name = "q", descriptor = "I")
    public static int field2360;

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "(I)V")
    public final void method1232(int arg0) {
        field2356++;
        int var2 = 83 % ((44 - arg0) / 55);
        this.field2359 = false;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(B)V")
    public final void method1233(byte arg0) {
        if (arg0 != 113) {
            this.field2361 = null;
        }
        (new Thread(this, "a")).start();
        field2357++;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "([BIILuo;ZB[Lg;)V")
    public static final void method1234(byte[] arg0, int arg1, int arg2, class118 arg3, boolean arg4, byte arg5, class366[] arg6) {
        field2354++;
        if (arg5 != 123) {
            return;
        }
        class242 var7 = new class242(arg0);
        int var8 = -1;
        while (true) {
            int var9 = var7.method1561(-114);
            if (var9 == 0) {
                return;
            }
            var8 += var9;
            int var10 = 0;
            while (true) {
                int var11 = var7.method1559((byte) -66);
                if (var11 == 0) {
                    break;
                }
                var10 += var11 - 1;
                int var12 = var10 & 0x3F;
                int var13 = var10 >> 6 & 0x3F;
                int var14 = var10 >> 12;
                int var15 = var7.method1563(-128);
                int var16 = var15 >> 2;
                int var17 = var15 & 0x3;
                int var18 = arg2 + var13;
                int var19 = arg1 + var12;
                if (var18 > 0 && var19 > 0 && var18 < (class22.field232 - 1) && class196.field2329 - 1 > var19) {
                    class366 var20 = null;
                    if (!arg4) {
                        int var21 = var14;
                        if ((class222.field2770[1][var18][var19] & 0x2) == 2) {
                            var21 = var14 - 1;
                        }
                        if (var21 >= 0) {
                            var20 = arg6[var21];
                        }
                    }
                    class423.method2591(-1, arg3, var14, var14, true, var17, true, var8, var16, var18, arg4, var19, var20);
                }
            }
        }
    }

    @OriginalMember(owner = "client!wj", name = "run", descriptor = "()V")
    public final void run() {
        field2355++;
        while (this.field2359) {
            this.field2361.method287(this, (byte) 99);
        }
    }

    @OriginalMember(owner = "client!wj", name = "<init>", descriptor = "(Lgh;)V")
    public class200(class51 arg0) {
        this.field2361 = arg0;
    }
}
