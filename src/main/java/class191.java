import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class class191 {

    @OriginalMember(owner = "client!gk", name = "g", descriptor = "Lma;")
    public static class737 field2666 = new class737();

    @OriginalMember(owner = "client!gk", name = "x", descriptor = "Lfca;")
    public static class661 field2683 = new class661();

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "B")
    public byte field2661;

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "B")
    public byte field2662;

    @OriginalMember(owner = "client!gk", name = "f", descriptor = "B")
    public byte field2665;

    @OriginalMember(owner = "client!gk", name = "l", descriptor = "B")
    public byte field2671;

    @OriginalMember(owner = "client!gk", name = "m", descriptor = "B")
    public byte field2672;

    @OriginalMember(owner = "client!gk", name = "s", descriptor = "B")
    public byte field2678;

    @OriginalMember(owner = "client!gk", name = "u", descriptor = "B")
    public byte field2680;

    @OriginalMember(owner = "client!gk", name = "e", descriptor = "I")
    public int field2664;

    @OriginalMember(owner = "client!gk", name = "h", descriptor = "I")
    public static int field2667;

    @OriginalMember(owner = "client!gk", name = "j", descriptor = "I")
    public static int field2669;

    @OriginalMember(owner = "client!gk", name = "p", descriptor = "I")
    public static int field2675;

    @OriginalMember(owner = "client!gk", name = "r", descriptor = "I")
    public int field2677;

    @OriginalMember(owner = "client!gk", name = "w", descriptor = "I")
    public int field2682;

    @OriginalMember(owner = "client!gk", name = "v", descriptor = "S")
    public short field2681;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "Z")
    public boolean field2660;

    @OriginalMember(owner = "client!gk", name = "d", descriptor = "Z")
    public boolean field2663;

    @OriginalMember(owner = "client!gk", name = "i", descriptor = "Z")
    public boolean field2668;

    @OriginalMember(owner = "client!gk", name = "k", descriptor = "Z")
    public boolean field2670;

    @OriginalMember(owner = "client!gk", name = "n", descriptor = "Z")
    public boolean field2673;

    @OriginalMember(owner = "client!gk", name = "o", descriptor = "Z")
    public boolean field2674;

    @OriginalMember(owner = "client!gk", name = "q", descriptor = "Z")
    public boolean field2676;

    @OriginalMember(owner = "client!gk", name = "t", descriptor = "Z")
    public boolean field2679;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Z)V")
    public static void method1336(boolean arg0) {
        if (!arg0) {
            field2666 = null;
            field2683 = null;
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(III)V")
    public static final void method1337(int arg0, int arg1, int arg2) {
        boolean var3 = class28.field252[0][arg1][arg2] != null && class28.field252[0][arg1][arg2].field10422 != null;
        for (int var4 = arg0; var4 >= 0; var4--) {
            if (class28.field252[var4][arg1][arg2] == null) {
                class766 var5 = class28.field252[var4][arg1][arg2] = new class766(var4);
                if (var3) {
                    var5.field10421++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIBIIII)V")
    public static final void method1338(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg4 != 8 && arg4 != 16) {
            class766 var7 = class28.field252[arg5][arg6][arg0];
            if (var7 == null) {
                var7 = new class766(arg5);
            }
            if (arg4 == 1) {
                var7.field10428 = (short) arg3;
                var7.field10427 = (short) arg1;
            } else if (arg4 == 2) {
                var7.field10429 = (short) arg1;
                var7.field10424 = (short) arg3;
            }
            if (class53.field676) {
                class70.method417(2);
            }
        } else if (arg4 == 8) {
            int var14 = arg6 << class88.field1221;
            int var15 = class722.field9480 + var14;
            int var16 = arg0 << class88.field1221;
            int var17 = class722.field9480 + var16;
            int var18 = class383.field4790[arg5].method2060(arg0, -94, arg6);
            int var19 = class383.field4790[arg5].method2060(arg0 + 1, -108, arg6 + 1);
            class763.field10388[class164.field2177++] = new class318(arg4, arg5, var14, var15, var15, var14, var18, var19, var19 - arg1, var18 - arg1, var16, var17, var17, var16);
        } else {
            int var8 = (arg6 << class88.field1221) + class722.field9480;
            int var9 = var8 - class722.field9480;
            int var10 = arg0 << class88.field1221;
            int var11 = var10 + class722.field9480;
            int var12 = class383.field4790[arg5].method2060(arg0, -128, arg6 + 1);
            int var13 = class383.field4790[arg5].method2060(arg0 + 1, -101, arg6);
            class763.field10388[class164.field2177++] = new class318(arg4, arg5, var8, var9, var9, var8, var12, var13, var13 - arg1, var12 - arg1, var10, var11, var11, var10);
        }
        field2667++;
        int var20 = 20 / ((arg2 - 58) / 60);
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(B)V")
    public static final void method1339(byte arg0) {
        class366.field4470.method2932((byte) 80);
        field2675++;
        if (arg0 >= -112) {
            method1336(false);
        }
    }
}
