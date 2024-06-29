import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class171 {

    @OriginalMember(owner = "client!de", name = "b", descriptor = "Lr;")
    public static class66 field3029 = class93.method641(43, " )2> <col=ff9040>");

    @OriginalMember(owner = "client!de", name = "h", descriptor = "I")
    public static int field3035 = 0;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "I")
    public static int field3028;

    @OriginalMember(owner = "client!de", name = "c", descriptor = "I")
    public static int field3030;

    @OriginalMember(owner = "client!de", name = "e", descriptor = "I")
    public static int field3032;

    @OriginalMember(owner = "client!de", name = "f", descriptor = "I")
    public static int field3033;

    @OriginalMember(owner = "client!de", name = "g", descriptor = "I")
    public static int field3034;

    @OriginalMember(owner = "client!de", name = "i", descriptor = "I")
    public static int field3036;

    @OriginalMember(owner = "client!de", name = "d", descriptor = "Lcj;")
    public static class28 field3031;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1163(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3033++;
        if (class164.method1107(arg1, (byte) -2)) {
            client.method594(class31.field466[arg1], -1, arg6, arg3, arg2, arg7, arg5, arg4);
            if (arg0 > -1) {
                field3035 = -98;
            }
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(I)V")
    public static void method1164(int arg0) {
        field3029 = null;
        field3031 = null;
        if (arg0 != 0) {
            field3034 = -33;
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Lr;ILr;IILr;)V")
    public static final void method1165(class66 arg0, int arg1, class66 arg2, int arg3, int arg4, class66 arg5) {
        for (int var6 = 99; var6 > 0; var6--) {
            class21.field288[var6] = class21.field288[var6 - 1];
            class69.field1402[var6] = class69.field1402[var6 - 1];
            class224.field3843[var6] = class224.field3843[var6 - 1];
            class196.field3391[var6] = class196.field3391[var6 - 1];
            class12.field157[var6] = class12.field157[var6 - 1];
        }
        class69.field1402[0] = arg2;
        class224.field3843[0] = arg5;
        if (arg1 != -19596) {
            return;
        }
        class153.field2723 = class15.field199;
        class21.field288[0] = arg4;
        class110.field2125++;
        field3030++;
        class12.field157[0] = arg3;
        class196.field3391[0] = arg0;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(ZLr;Z)V")
    public static final void method1166(boolean arg0, class66 arg1, boolean arg2) {
        field3028++;
        class66 var3 = arg1.method478((byte) 111);
        short[] var4 = new short[16];
        if (!arg0) {
            return;
        }
        int var5 = 0;
        for (int var6 = 0; var6 < class133.field2480; var6++) {
            class157 var9 = class40.method242(-25672, var6);
            if ((!arg2 || var9.field2817) && var9.field2836 == -1 && var9.field2790 == -1 && var9.field2792 == 0 && var9.field2813.method478((byte) -99).method465(-128, var3) != -1) {
                if (var5 >= 250) {
                    class33.field490 = -1;
                    class50.field886 = null;
                    return;
                }
                if (var4.length <= var5) {
                    short[] var10 = new short[var4.length * 2];
                    for (int var11 = 0; var11 < var5; var11++) {
                        var10[var11] = var4[var11];
                    }
                    var4 = var10;
                }
                var4[var5++] = (short) var6;
            }
        }
        class50.field886 = var4;
        class33.field490 = var5;
        class11.field139 = 0;
        class66[] var7 = new class66[class33.field490];
        for (int var8 = 0; var8 < class33.field490; var8++) {
            var7[var8] = class40.method242(-25672, var4[var8]).field2813;
        }
        class27.method117(var7, class50.field886, -122);
    }
}
