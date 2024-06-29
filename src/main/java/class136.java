import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class136 extends class200 {

    @OriginalMember(owner = "client!me", name = "W", descriptor = "Ltg;")
    public class207 field2440;

    @OriginalMember(owner = "client!me", name = "L", descriptor = "I")
    public static int field2429 = -1;

    @OriginalMember(owner = "client!me", name = "P", descriptor = "Ldj;")
    public static class44 field2433 = class89.method650(255, "Update)2Liste geladen)3");

    @OriginalMember(owner = "client!me", name = "S", descriptor = "Ldj;")
    public static class44 field2436 = class89.method650(255, "Mitglieder)2Welt");

    @OriginalMember(owner = "client!me", name = "O", descriptor = "[I")
    public static int[] field2432 = new int[25];

    @OriginalMember(owner = "client!me", name = "R", descriptor = "[I")
    public static int[] field2435 = new int[2000];

    @OriginalMember(owner = "client!me", name = "U", descriptor = "Ldj;")
    public static class44 field2438 = class89.method650(255, "Zu viele Verbindungen von Ihrer Adresse)3");

    @OriginalMember(owner = "client!me", name = "V", descriptor = "Z")
    public static boolean field2439 = false;

    @OriginalMember(owner = "client!me", name = "K", descriptor = "I")
    public static int field2428;

    @OriginalMember(owner = "client!me", name = "M", descriptor = "I")
    public static int field2430;

    @OriginalMember(owner = "client!me", name = "N", descriptor = "I")
    public static int field2431;

    @OriginalMember(owner = "client!me", name = "Q", descriptor = "I")
    public static int field2434;

    @OriginalMember(owner = "client!me", name = "T", descriptor = "I")
    public static int field2437;

    @OriginalMember(owner = "client!me", name = "X", descriptor = "I")
    public static int field2441;

    @OriginalMember(owner = "client!me", name = "d", descriptor = "(II)V")
    public static final void method914(int arg0, int arg1) {
        class134.field2399 = null;
        class19.field322 = 0;
        class130.field2320 = -1;
        int var2 = -59 % ((arg1 - 55) / 42);
        field2430++;
        class101.field1851 = 1;
        class174.field3027 = false;
        class115.field2065 = arg0;
        class52.field940 = -1;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IIIIII)V")
    public static final void method915(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2441++;
        class42.method290(class108.field1979[arg5], arg2 - 1760071784, -arg0 + arg1, arg1 + arg0, arg3);
        int var6 = 0;
        int var7 = arg4;
        int var8 = arg0 * arg0;
        int var9 = var8 << 1;
        int var10 = arg4 * arg4;
        int var11 = var10 << 1;
        int var12 = arg4 << 1;
        int var13 = (1 - var12) * var8 + var11;
        int var14 = var8 << 2;
        int var15 = var10 - (var12 - 1) * var9;
        int var16 = var10 << 2;
        int var17 = ((var6 << 1) + 3) * var11;
        int var18 = ((arg4 << 1) - 3) * var9;
        int var19 = (var6 + 1) * var16;
        int var20 = (arg4 - 1) * var14;
        if (arg2 != 1760071777) {
            field2435 = null;
        }
        while (var7 > 0) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var13 += var17;
                    var17 += var16;
                    var15 += var19;
                    var19 += var16;
                    var6++;
                }
            }
            if (var15 < 0) {
                var6++;
                var13 += var17;
                var17 += var16;
                var15 += var19;
                var19 += var16;
            }
            var15 += -var18;
            int var21 = arg1 - var6;
            int var22 = arg1 + var6;
            var18 -= var14;
            var13 += -var20;
            var20 -= var14;
            var7--;
            int var23 = arg5 + var7;
            int var24 = arg5 - var7;
            class42.method290(class108.field1979[var24], -7, var21, var22, arg3);
            class42.method290(class108.field1979[var23], -7, var21, var22, arg3);
        }
    }

    @OriginalMember(owner = "client!me", name = "c", descriptor = "(B)V")
    public static void method916(byte arg0) {
        field2433 = null;
        field2435 = null;
        field2436 = null;
        int var1 = -124 % ((arg0 - 20) / 57);
        field2438 = null;
        field2432 = null;
    }

    @OriginalMember(owner = "client!me", name = "d", descriptor = "(I)Lod;")
    public static final class155 method917(int arg0) {
        field2437++;
        class155 var1 = new class155();
        var1.field2689 = class92.field1725;
        var1.field2693 = class94.field1745[0];
        var1.field2687 = class175.field3039[0];
        byte[] var2 = class58.field1082[0];
        var1.field2692 = class227.field4275;
        var1.field2690 = class88.field1684[0];
        if (arg0 != 1760071777) {
            method917(79);
        }
        var1.field2688 = class38.field672[0];
        int var3 = var1.field2693 * var1.field2687;
        var1.field2691 = new int[var3];
        for (int var4 = 0; var4 < var3; var4++) {
            var1.field2691[var4] = class170.field2933[class29.method202(var2[var4], 255)];
        }
        class122.method840(-33);
        return var1;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IB)Ldj;")
    public static final class44 method918(int arg0, byte arg1) {
        field2434++;
        if (arg1 <= 96) {
            method918(-115, (byte) -23);
        }
        class44 var2 = new class44();
        var2.field849 = 0;
        var2.field822 = new byte[arg0];
        return var2;
    }

    @OriginalMember(owner = "client!me", name = "<init>", descriptor = "(Ltg;)V")
    public class136(class207 arg0) {
        this.field2440 = arg0;
    }
}
