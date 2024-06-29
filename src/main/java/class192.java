import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class192 implements class246 {

    @OriginalMember(owner = "client!bf", name = "k", descriptor = "I")
    private int field3423 = 50;

    @OriginalMember(owner = "client!bf", name = "y", descriptor = "Z")
    private boolean field3437 = false;

    @OriginalMember(owner = "client!bf", name = "w", descriptor = "Lng;")
    private class121 field3435;

    @OriginalMember(owner = "client!bf", name = "n", descriptor = "Lng;")
    private class121 field3426;

    @OriginalMember(owner = "client!bf", name = "x", descriptor = "Lpk;")
    private class66 field3436;

    @OriginalMember(owner = "client!bf", name = "m", descriptor = "[Z")
    private boolean[] field3425;

    @OriginalMember(owner = "client!bf", name = "C", descriptor = "[Z")
    private boolean[] field3441;

    @OriginalMember(owner = "client!bf", name = "z", descriptor = "[B")
    private byte[] field3438;

    @OriginalMember(owner = "client!bf", name = "E", descriptor = "[B")
    private byte[] field3443;

    @OriginalMember(owner = "client!bf", name = "e", descriptor = "[B")
    private byte[] field3417;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "[B")
    private byte[] field3413;

    @OriginalMember(owner = "client!bf", name = "i", descriptor = "[S")
    private short[] field3421;

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "[Z")
    private boolean[] field3416;

    @OriginalMember(owner = "client!bf", name = "r", descriptor = "[Z")
    private boolean[] field3430;

    @OriginalMember(owner = "client!bf", name = "v", descriptor = "[Z")
    private boolean[] field3434;

    @OriginalMember(owner = "client!bf", name = "j", descriptor = "[I")
    public static int[] field3422 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @OriginalMember(owner = "client!bf", name = "o", descriptor = "I")
    public static int field3427 = -1;

    @OriginalMember(owner = "client!bf", name = "f", descriptor = "Le;")
    public static class191 field3418 = class54.method368("<col=ff3000>", 2047);

    @OriginalMember(owner = "client!bf", name = "t", descriptor = "Le;")
    private static class191 field3432 = class54.method368("purple:", 2047);

    @OriginalMember(owner = "client!bf", name = "h", descriptor = "Le;")
    public static class191 field3420 = field3432;

    @OriginalMember(owner = "client!bf", name = "s", descriptor = "Le;")
    public static class191 field3431 = field3432;

    @OriginalMember(owner = "client!bf", name = "H", descriptor = "I")
    public static int field3446 = 0;

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "I")
    public static int field3414;

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "I")
    public static int field3415;

    @OriginalMember(owner = "client!bf", name = "g", descriptor = "I")
    public static int field3419;

    @OriginalMember(owner = "client!bf", name = "l", descriptor = "I")
    public static int field3424;

    @OriginalMember(owner = "client!bf", name = "p", descriptor = "I")
    public static int field3428;

    @OriginalMember(owner = "client!bf", name = "q", descriptor = "I")
    public static int field3429;

    @OriginalMember(owner = "client!bf", name = "u", descriptor = "I")
    public static int field3433;

    @OriginalMember(owner = "client!bf", name = "A", descriptor = "I")
    public static int field3439;

    @OriginalMember(owner = "client!bf", name = "B", descriptor = "I")
    public static int field3440;

    @OriginalMember(owner = "client!bf", name = "D", descriptor = "I")
    public static int field3442;

    @OriginalMember(owner = "client!bf", name = "F", descriptor = "I")
    public static int field3444;

    @OriginalMember(owner = "client!bf", name = "G", descriptor = "I")
    public static int field3445;

    @OriginalMember(owner = "client!bf", name = "I", descriptor = "I")
    public static int field3447;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(II)[I")
    public final int[] method1360(int arg0, int arg1) {
        field3433++;
        class179 var3 = this.method1372(19225, arg1);
        int var4 = -100 % ((arg0 + 23) / 58);
        return var3 == null ? null : var3.method1207(this.field3435, this.field3437 || this.field3425[arg1], 26931, this);
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(II)Z")
    public final boolean method1361(int arg0, int arg1) {
        field3428++;
        if (arg0 != 0) {
            field3447 = 47;
        }
        return this.field3416[arg1];
    }

    @OriginalMember(owner = "client!bf", name = "e", descriptor = "(II)V")
    public final void method1362(int arg0, int arg1) {
        field3429++;
        if (arg0 != 12039) {
            method1369(-4);
        }
        for (class179 var3 = (class179) this.field3436.method436(-110); var3 != null; var3 = (class179) this.field3436.method438(-16)) {
            if (var3.field3078) {
                var3.method1201(99, arg1);
                var3.field3078 = false;
            }
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(BIIII)V")
    public static final void method1363(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < 31) {
            method1369(-90);
        }
        field3440++;
        if (arg2 - arg4 >= class37.field678 && class207.field3680 >= (arg2 + arg4) && class242.field4314 <= arg1 - arg4 && (arg1 + arg4) <= class99.field1584) {
            class99.method617(arg3, arg2, arg4, arg1, (byte) 4);
        } else {
            class179.method1203(-112, arg2, arg3, arg1, arg4);
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IZ)Z")
    public final boolean method1364(int arg0, boolean arg1) {
        field3445++;
        if (!arg1) {
            field3418 = null;
        }
        return this.field3437 || this.field3425[arg0];
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(III)J")
    public static final long method1365(int arg0, int arg1, int arg2) {
        class199 var3 = class201.field3608[arg0][arg1][arg2];
        return var3 == null || var3.field3556 == null ? 0L : var3.field3556.field4566;
    }

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "(II)Z")
    public final boolean method1366(int arg0, int arg1) {
        field3414++;
        if (arg1 != 23243) {
            field3447 = -45;
        }
        return this.field3434[arg0];
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(B)V")
    public final void method1367(byte arg0) {
        field3419++;
        this.field3436.method440((byte) 56);
        int var2 = 47 % ((arg0 + 4) / 55);
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(BZ)V")
    public final void method1368(byte arg0, boolean arg1) {
        field3444++;
        this.field3437 = arg1;
        int var3 = 24 % ((arg0 + 33) / 55);
        this.method1367((byte) -78);
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(I)V")
    public static void method1369(int arg0) {
        field3418 = null;
        field3431 = null;
        field3432 = null;
        field3422 = null;
        field3420 = null;
        if (arg0 != -14001) {
            field3427 = 100;
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IB)Z")
    public final boolean method1370(int arg0, byte arg1) {
        field3442++;
        class179 var3 = this.method1372(arg1 ^ 0x4B27, arg0);
        if (arg1 != 62) {
            this.method1368((byte) -77, true);
        }
        return var3 == null ? false : var3.method1198(this.field3435, 255, this);
    }

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "(II)I")
    public final int method1371(int arg0, int arg1) {
        field3439++;
        if (arg0 != 17045) {
            this.method1367((byte) -28);
        }
        return this.field3421[arg1] & 0xFFFF;
    }

    @OriginalMember(owner = "client!bf", name = "f", descriptor = "(II)Lpi;")
    private final class179 method1372(int arg0, int arg1) {
        field3424++;
        class179 var3 = (class179) this.field3436.method437((byte) 122, (long) arg1);
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = this.field3426.method826((byte) 35, arg1, 0);
        if (var4 == null) {
            return null;
        }
        class225 var5 = new class225(var4);
        class179 var6 = new class179(var5);
        this.field3436.method439(var6, arg0 - 19226, (long) arg1);
        if (arg0 != 19225) {
            field3431 = null;
        }
        return var6;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(FII)[I")
    public final int[] method1373(float arg0, int arg1, int arg2) {
        if (arg1 != 1536) {
            this.method1360(55, -36);
        }
        field3415++;
        class179 var4 = this.method1372(arg1 ^ 0x4D19, arg2);
        if (var4 == null) {
            return null;
        } else {
            var4.field3078 = true;
            return var4.method1199(this, this.field3437 || this.field3425[arg2], this.field3435, (byte) 79, arg0);
        }
    }

    @OriginalMember(owner = "client!bf", name = "<init>", descriptor = "(Lng;Lng;Lng;IZ)V")
    public class192(class121 arg0, class121 arg1, class121 arg2, int arg3, boolean arg4) {
        this.field3435 = arg2;
        this.field3426 = arg0;
        this.field3437 = arg4;
        this.field3423 = arg3;
        this.field3436 = new class66(this.field3423);
        class225 var6 = new class225(arg1.method826((byte) 35, 0, 0));
        int var7 = var6.method1593(true);
        this.field3425 = new boolean[var7];
        this.field3441 = new boolean[var7];
        this.field3438 = new byte[var7];
        this.field3443 = new byte[var7];
        this.field3417 = new byte[var7];
        this.field3413 = new byte[var7];
        this.field3421 = new short[var7];
        this.field3416 = new boolean[var7];
        this.field3430 = new boolean[var7];
        this.field3434 = new boolean[var7];
        for (int var8 = 0; var8 < var7; var8++) {
            this.field3430[var8] = var6.method1580(-43) == 1;
        }
        for (int var9 = 0; var9 < var7; var9++) {
            if (this.field3430[var9]) {
                this.field3416[var9] = var6.method1580(-113) == 1;
            }
        }
        for (int var10 = 0; var10 < var7; var10++) {
            if (this.field3430[var10]) {
                this.field3434[var10] = var6.method1580(-117) == 1;
            }
        }
        for (int var11 = 0; var11 < var7; var11++) {
            if (this.field3430[var11]) {
                this.field3425[var11] = var6.method1580(-44) == 1;
            }
        }
        for (int var12 = 0; var12 < var7; var12++) {
            if (this.field3430[var12]) {
                this.field3441[var12] = var6.method1580(-120) == 1;
            }
        }
        for (int var13 = 0; var13 < var7; var13++) {
            if (this.field3430[var13]) {
                this.field3413[var13] = var6.method1575(false);
            }
        }
        for (int var14 = 0; var14 < var7; var14++) {
            if (this.field3430[var14]) {
                this.field3417[var14] = var6.method1575(false);
            }
        }
        for (int var15 = 0; var15 < var7; var15++) {
            if (this.field3430[var15]) {
                this.field3443[var15] = var6.method1575(false);
            }
        }
        for (int var16 = 0; var16 < var7; var16++) {
            if (this.field3430[var16]) {
                this.field3438[var16] = var6.method1575(false);
            }
        }
        for (int var17 = 0; var17 < var7; var17++) {
            if (this.field3430[var17]) {
                this.field3421[var17] = (short) var6.method1593(true);
            }
        }
    }
}
