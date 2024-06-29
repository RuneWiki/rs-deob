import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class83 extends class161 {

    @OriginalMember(owner = "client!rc", name = "h", descriptor = "I")
    private int field1403 = 0;

    @OriginalMember(owner = "client!rc", name = "l", descriptor = "I")
    private int field1407 = -32768;

    @OriginalMember(owner = "client!rc", name = "r", descriptor = "Z")
    private boolean field1413 = false;

    @OriginalMember(owner = "client!rc", name = "y", descriptor = "I")
    private int field1420 = -1;

    @OriginalMember(owner = "client!rc", name = "v", descriptor = "Z")
    public boolean field1417 = false;

    @OriginalMember(owner = "client!rc", name = "x", descriptor = "I")
    private int field1419 = 0;

    @OriginalMember(owner = "client!rc", name = "o", descriptor = "I")
    public int field1410;

    @OriginalMember(owner = "client!rc", name = "u", descriptor = "I")
    public int field1416;

    @OriginalMember(owner = "client!rc", name = "t", descriptor = "I")
    public int field1415;

    @OriginalMember(owner = "client!rc", name = "n", descriptor = "I")
    public int field1409;

    @OriginalMember(owner = "client!rc", name = "i", descriptor = "I")
    private int field1404;

    @OriginalMember(owner = "client!rc", name = "p", descriptor = "I")
    public int field1411;

    @OriginalMember(owner = "client!rc", name = "B", descriptor = "Ld;")
    private class43 field1423;

    @OriginalMember(owner = "client!rc", name = "j", descriptor = "I")
    public static int field1405;

    @OriginalMember(owner = "client!rc", name = "m", descriptor = "I")
    public static int field1408;

    @OriginalMember(owner = "client!rc", name = "q", descriptor = "I")
    public static int field1412;

    @OriginalMember(owner = "client!rc", name = "s", descriptor = "I")
    public static int field1414;

    @OriginalMember(owner = "client!rc", name = "w", descriptor = "I")
    public static int field1418;

    @OriginalMember(owner = "client!rc", name = "z", descriptor = "I")
    public static int field1421;

    @OriginalMember(owner = "client!rc", name = "A", descriptor = "I")
    public static int field1422;

    @OriginalMember(owner = "client!rc", name = "C", descriptor = "I")
    public static int field1424;

    @OriginalMember(owner = "client!rc", name = "k", descriptor = "Ldc;")
    private class158 field1406;

    @OriginalMember(owner = "client!rc", name = "<init>", descriptor = "(IIIIIII)V", line = 213)
    public class83(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field1410 = arg1;
        this.field1416 = arg5 + arg6;
        this.field1415 = arg4;
        this.field1409 = arg2;
        this.field1404 = arg0;
        this.field1411 = arg3;
        int var8 = class282.method2071(this.field1404, 0).field1594;
        if (var8 == -1) {
            this.field1417 = true;
        } else {
            this.field1417 = false;
            this.field1423 = class198.method1524(var8, -85);
        }
        if (this.field1416 == arg6) {
            class334.method2338(false, this.field1409, this.field1411, this.field1419, (byte) -13, this.field1423);
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(ZLo;)V", line = 16)
    private final void method669(boolean arg0, class96 arg1) {
        field1412++;
        if (class42.field607) {
            class337 var3 = (class337) arg1;
            if ((this.field1406 == null || this.field1406.field2485) && (var3.field5345 != null || var3.field5326 != null)) {
                this.field1406 = new class158(class332.field5261, 1, 1);
            }
            if (this.field1406 != null) {
                this.field1406.method1228(var3.field5345, var3.field5326, false, var3.field5344, var3.field5365, var3.field5332);
            }
        } else {
            class62 var4 = (class62) arg1;
            if ((this.field1406 == null || this.field1406.field2485) && (var4.field1047 != null || var4.field1035 != null)) {
                this.field1406 = new class158(class332.field5261, 1, 1);
            }
            if (this.field1406 != null) {
                this.field1406.method1228(var4.field1047, var4.field1035, false, var4.field1044, var4.field1042, var4.field1062);
            }
        }
        this.field1413 = arg0;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIIII)V", line = 49)
    public final void method445(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1418++;
        if (!this.field1413) {
            class96 var6 = this.method671((byte) 40);
            if (var6 == null) {
                return;
            }
            this.method669(true, var6);
        }
        if (this.field1406 != null) {
            this.field1406.method1230(arg0, arg1, arg3, arg2, arg4);
        }
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(II)V", line = 83)
    public final void method670(int arg0, int arg1) {
        field1424++;
        if (this.field1417) {
            return;
        }
        this.field1403 += arg1;
        if (arg0 != 1) {
            field1414 = -121;
        }
        while (this.field1423.field651[this.field1419] < this.field1403) {
            this.field1403 -= this.field1423.field651[this.field1419];
            this.field1419++;
            if (this.field1419 >= this.field1423.field677.length) {
                this.field1417 = true;
                break;
            }
        }
        if (!this.field1417) {
            class334.method2338(false, this.field1409, this.field1411, this.field1419, (byte) -13, this.field1423);
        }
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "()I", line = 122)
    public final int method444() {
        field1421++;
        return this.field1407;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIIIIIIIJILdc;)V", line = 134)
    public final void method440(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class158 arg10) {
        class96 var13 = this.method671((byte) 40);
        field1408++;
        if (var13 != null) {
            this.method669(true, var13);
            var13.method440(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field1406);
            this.field1407 = var13.method444();
        }
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(B)Lo;", line = 152)
    private final class96 method671(byte arg0) {
        field1422++;
        class94 var2 = class282.method2071(this.field1404, arg0 - 40);
        class96 var3;
        if (this.field1417) {
            var3 = var2.method732(0, (byte) 80, -1, -1);
        } else {
            var3 = var2.method732(this.field1403, (byte) 80, this.field1419, this.field1420);
        }
        if (var3 == null) {
            return null;
        } else {
            if (arg0 != 40) {
                this.field1411 = 19;
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(III)V", line = 185)
    public static final void method672(int arg0, int arg1, int arg2) {
        class81 var3 = class54.method426(0, arg2);
        field1405++;
        int var4 = var3.field1391;
        if (arg0 <= 43) {
            method672(87, -46, 102);
        }
        int var5 = var3.field1397;
        int var6 = var3.field1390;
        int var7 = class181.field2895[var5 - var6];
        if (arg1 < 0 || arg1 > var7) {
            arg1 = 0;
        }
        int var8 = var7 << var6;
        class248.method1910(class66.field1178[var4] & ~var8 | var8 & arg1 << var6, var4, (byte) -105);
    }
}
