import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class17 {

    @OriginalMember(owner = "client!cb", name = "g", descriptor = "Lkf;")
    private class75 field350 = new class75();

    @OriginalMember(owner = "client!cb", name = "p", descriptor = "Lob;")
    private class99 field359 = new class99();

    @OriginalMember(owner = "client!cb", name = "o", descriptor = "I")
    private int field358;

    @OriginalMember(owner = "client!cb", name = "s", descriptor = "I")
    private int field362;

    @OriginalMember(owner = "client!cb", name = "q", descriptor = "Lud;")
    private class143 field360;

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "Lod;")
    public static class101 field348 = class46.method335(-73, "titlebox");

    @OriginalMember(owner = "client!cb", name = "m", descriptor = "Lod;")
    public static class101 field356 = class46.method335(-98, "Benutzen");

    @OriginalMember(owner = "client!cb", name = "h", descriptor = "[[I")
    public static int[][] field351 = new int[104][104];

    @OriginalMember(owner = "client!cb", name = "n", descriptor = "I")
    public static int field357 = 3353893;

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "Llb;")
    public static class78 field345 = new class78();

    @OriginalMember(owner = "client!cb", name = "t", descriptor = "Lod;")
    public static class101 field363 = class46.method335(81, "Welt");

    @OriginalMember(owner = "client!cb", name = "w", descriptor = "Z")
    public static boolean field366 = false;

    @OriginalMember(owner = "client!cb", name = "y", descriptor = "Lod;")
    private static class101 field368 = class46.method335(-78, "Your ignore list is full)3 Max of 100 hit");

    @OriginalMember(owner = "client!cb", name = "v", descriptor = "Lod;")
    public static class101 field365 = field368;

    @OriginalMember(owner = "client!cb", name = "x", descriptor = "Lod;")
    public static class101 field367 = class46.method335(107, "mapfunction");

    @OriginalMember(owner = "client!cb", name = "z", descriptor = "I")
    public static int field369 = 1;

    @OriginalMember(owner = "client!cb", name = "u", descriptor = "Lie;")
    public static class61 field364 = new class61(5000);

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "I")
    public static int field344;

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "I")
    public static int field346;

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "I")
    public static int field347;

    @OriginalMember(owner = "client!cb", name = "f", descriptor = "I")
    public static int field349;

    @OriginalMember(owner = "client!cb", name = "i", descriptor = "I")
    public static int field352;

    @OriginalMember(owner = "client!cb", name = "j", descriptor = "I")
    public static int field353;

    @OriginalMember(owner = "client!cb", name = "k", descriptor = "I")
    public static int field354;

    @OriginalMember(owner = "client!cb", name = "l", descriptor = "I")
    public static int field355;

    @OriginalMember(owner = "client!cb", name = "r", descriptor = "I")
    public static int field361;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)V")
    public static void method134(int arg0) {
        field363 = null;
        field351 = null;
        field356 = null;
        field348 = null;
        field345 = null;
        field364 = null;
        field368 = null;
        if (arg0 < 90) {
            field367 = null;
        }
        field365 = null;
        field367 = null;
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(I)V")
    public final void method135(int arg0) {
        if (arg0 != 0) {
            return;
        }
        field344++;
        while (true) {
            class75 var2 = this.field359.method686((byte) 27);
            if (var2 == null) {
                this.field358 = this.field362;
                return;
            }
            var2.method959(11835);
            var2.method517(79);
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(ZI)V")
    public static final void method136(boolean arg0, int arg1) {
        field355++;
        if (class13.field283 == null) {
            return;
        }
        try {
            class138 var2 = new class138(4);
            var2.method1101(arg0 ? 2 : 3, (byte) -32);
            var2.method1081(0, 215180960);
            class13.field283.method442(4, arg1 ^ 0xFFFFFF9C, 0, var2.field3213);
            if (arg1 != 2) {
                method134(-36);
            }
        } catch (IOException var4) {
            try {
                class13.field283.method444((byte) -95);
            } catch (Exception var3) {
            }
            class6.field82++;
            class13.field283 = null;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lod;IBII)V")
    public static final void method137(class101 arg0, int arg1, byte arg2, int arg3, int arg4) {
        class126 var5 = class63.method434(arg1, arg3, 258);
        field352++;
        if (var5 == null) {
            return;
        }
        if (var5.field2740 != null) {
            class141 var6 = new class141();
            var6.field3238 = var5;
            var6.field3245 = arg0;
            var6.field3247 = var5.field2740;
            var6.field3246 = arg4;
            class31.method237((byte) -71, var6);
        }
        boolean var7 = true;
        if (var5.field2856 > 0) {
            var7 = class44.method325(var5, arg2 ^ 0xFFFFAB8F);
        }
        if (!var7 || (!class149.method1162(class42.method313(var5, (byte) -57), (byte) 71, arg4 - 1) || arg2 != 39)) {
            return;
        }
        if (arg4 == 1) {
            class134.field3075++;
            field364.method419(250, (byte) 0);
            field364.method1090((byte) 38, arg1);
            field364.method1068(arg3, 28588);
        }
        if (arg4 == 2) {
            field364.method419(71, (byte) 0);
            field364.method1090((byte) 38, arg1);
            field364.method1068(arg3, 28588);
            class42.field1021++;
        }
        if (arg4 == 3) {
            class146.field3342++;
            field364.method419(249, (byte) 0);
            field364.method1090((byte) 38, arg1);
            field364.method1068(arg3, 28588);
        }
        if (arg4 == 4) {
            class146.field3345++;
            field364.method419(146, (byte) 0);
            field364.method1090((byte) 38, arg1);
            field364.method1068(arg3, 28588);
        }
        if (arg4 == 5) {
            class78.field1638++;
            field364.method419(37, (byte) 0);
            field364.method1090((byte) 38, arg1);
            field364.method1068(arg3, 28588);
        }
        if (arg4 == 6) {
            field364.method419(9, (byte) 0);
            field364.method1090((byte) 38, arg1);
            field364.method1068(arg3, 28588);
            class29.field772++;
        }
        if (arg4 == 7) {
            field364.method419(233, (byte) 0);
            field364.method1090((byte) 38, arg1);
            field364.method1068(arg3, 28588);
            class141.field3257++;
        }
        if (arg4 == 8) {
            field364.method419(4, (byte) 0);
            class140.field3222++;
            field364.method1090((byte) 38, arg1);
            field364.method1068(arg3, 28588);
        }
        if (arg4 == 9) {
            class57.field1293++;
            field364.method419(160, (byte) 0);
            field364.method1090((byte) 38, arg1);
            field364.method1068(arg3, 28588);
        }
        if (arg4 == 10) {
            field364.method419(90, (byte) 0);
            class6.field93++;
            field364.method1090((byte) 38, arg1);
            field364.method1068(arg3, 28588);
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(BJ)V")
    public final void method138(byte arg0, long arg1) {
        class75 var4 = (class75) this.field360.method1141(arg1, -1);
        if (var4 != null) {
            var4.method959(11835);
            var4.method517(97);
            this.field358++;
        }
        field346++;
        if (arg0 < 121) {
            this.field358 = 46;
        }
    }

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "(I)V")
    public static final void method139(int arg0) {
        field353++;
        for (int var1 = arg0; var1 < class40.field959; var1++) {
            int var2 = class73.field1586[var1];
            class62 var3 = class18.field376[var2];
            if (var3 != null) {
                class27.method219(arg0, var3, var3.field1374.field2540);
            }
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(ZJ)Lkf;")
    public final class75 method140(boolean arg0, long arg1) {
        class75 var4 = (class75) this.field360.method1141(arg1, -1);
        if (var4 != null) {
            this.field359.method690(var4, 0);
        }
        if (!arg0) {
            field366 = false;
        }
        field347++;
        return var4;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lkf;JB)V")
    public final void method141(class75 arg0, long arg1, byte arg2) {
        if (this.field358 == 0) {
            class75 var5 = this.field359.method686((byte) 27);
            var5.method959(11835);
            var5.method517(89);
            if (this.field350 == var5) {
                class75 var6 = this.field359.method686((byte) 101);
                var6.method959(11835);
                var6.method517(77);
            }
        } else {
            this.field358--;
        }
        int var7 = 115 % ((arg2 + 84) / 38);
        field361++;
        this.field360.method1137((byte) -89, arg1, arg0);
        this.field359.method690(arg0, 0);
    }

    @OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(I)V")
    public class17(int arg0) {
        this.field358 = arg0;
        this.field362 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field360 = new class143(var2);
    }
}
