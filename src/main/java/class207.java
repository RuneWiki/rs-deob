import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gm")
public class class207 extends class216 {

    @OriginalMember(owner = "client!gm", name = "x", descriptor = "Ltg;")
    public class605 field3469 = new class605();

    @OriginalMember(owner = "client!gm", name = "A", descriptor = "Lmda;")
    public class349 field3472 = new class349();

    @OriginalMember(owner = "client!gm", name = "t", descriptor = "Lul;")
    private class363 field3465;

    @OriginalMember(owner = "client!gm", name = "w", descriptor = "Z")
    public static boolean field3468 = false;

    @OriginalMember(owner = "client!gm", name = "v", descriptor = "F")
    public static float field3467;

    @OriginalMember(owner = "client!gm", name = "o", descriptor = "I")
    public static int field3460;

    @OriginalMember(owner = "client!gm", name = "p", descriptor = "I")
    public static int field3461;

    @OriginalMember(owner = "client!gm", name = "q", descriptor = "I")
    public static int field3462;

    @OriginalMember(owner = "client!gm", name = "r", descriptor = "I")
    public static int field3463;

    @OriginalMember(owner = "client!gm", name = "s", descriptor = "I")
    public static int field3464;

    @OriginalMember(owner = "client!gm", name = "u", descriptor = "I")
    public static int field3466;

    @OriginalMember(owner = "client!gm", name = "y", descriptor = "I")
    public static int field3470;

    @OriginalMember(owner = "client!gm", name = "z", descriptor = "I")
    public static int field3471;

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(IIB[ILgfa;I)V")
    private final void method1513(int arg0, int arg1, byte arg2, int[] arg3, class753 arg4, int arg5) {
        if ((this.field3465.field5535[arg4.field10499] & 0x4) != 0 && arg4.field10497 < 0) {
            int var7 = this.field3465.field5501[arg4.field10499] / class608.field8585;
            while (true) {
                int var8 = (var7 + 1048575 - arg4.field10493) / var7;
                if (var8 > arg1) {
                    arg4.field10493 += arg1 * var7;
                    break;
                }
                arg4.field10500.method563(arg3, arg0, var8);
                arg4.field10493 += var7 * var8 - 1048576;
                arg1 -= var8;
                arg0 += var8;
                int var9 = class608.field8585 / 100;
                int var10 = 262144 / var7;
                if (var10 < var9) {
                    var9 = var10;
                }
                class57 var11 = arg4.field10500;
                if (this.field3465.field5489[arg4.field10499] == 0) {
                    arg4.field10500 = class57.method556(arg4.field10512, var11.method545(), var11.method547(), var11.method565());
                } else {
                    arg4.field10500 = class57.method556(arg4.field10512, var11.method545(), 0, var11.method565());
                    this.field3465.method2309(arg4, arg4.field10488.field8953[arg4.field10502] < 0, (byte) -122);
                    arg4.field10500.method551(var9, var11.method547());
                }
                if (arg4.field10488.field8953[arg4.field10502] < 0) {
                    arg4.field10500.method536(-1);
                }
                var11.method529(var9);
                var11.method563(arg3, arg0, arg5 - arg0);
                if (var11.method539()) {
                    this.field3472.method2226(var11);
                }
            }
        }
        field3471++;
        arg4.field10500.method563(arg3, arg0, arg1);
        if (arg2 < 78) {
            this.field3469 = null;
        }
    }

    @OriginalMember(owner = "client!gm", name = "c", descriptor = "()Laca;")
    public final class216 method531() {
        field3464++;
        class753 var1;
        do {
            var1 = (class753) this.field3469.method3469((byte) 107);
            if (var1 == null) {
                return null;
            }
        } while (var1.field10500 == null);
        return var1.field10500;
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "()Laca;")
    public final class216 method532() {
        field3461++;
        class753 var1 = (class753) this.field3469.method3463((byte) -50);
        if (var1 == null) {
            return null;
        } else if (var1.field10500 == null) {
            return this.method531();
        } else {
            return var1.field10500;
        }
    }

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "()I")
    public final int method552() {
        field3466++;
        return 0;
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "([III)V")
    public final void method563(int[] arg0, int arg1, int arg2) {
        field3463++;
        this.field3472.method563(arg0, arg1, arg2);
        for (class753 var4 = (class753) this.field3469.method3463((byte) -50); var4 != null; var4 = (class753) this.field3469.method3469((byte) 107)) {
            if (!this.field3465.method2340(var4, (byte) -71)) {
                int var5 = arg2;
                int var6 = arg1;
                do {
                    if (var4.field10507 >= var5) {
                        this.method1513(var6, var5, (byte) 100, arg0, var4, var5 + var6);
                        var4.field10507 -= var5;
                        break;
                    }
                    this.method1513(var6, var4.field10507, (byte) 97, arg0, var4, var5 + var6);
                    var5 -= var4.field10507;
                    var6 += var4.field10507;
                } while (!this.field3465.method2331(var6, var5, (byte) -76, var4, arg0));
            }
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(IIIII)V")
    public static final void method1514(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3460++;
        int var5 = 0;
        int var6 = arg1;
        if (arg4 != -13628) {
            method1514(-13, 36, -82, -10, 53);
        }
        int var7 = -arg1;
        class608.method3484(class77.field1131[arg3], arg0 - arg1, -7, arg2, arg0 + arg1);
        int var8 = -1;
        while (var5 < var6) {
            var8 += 2;
            var5++;
            var7 += var8;
            if (var7 >= 0) {
                var6--;
                var7 -= var6 << 1;
                int[] var9 = class77.field1131[arg3 + var6];
                int[] var10 = class77.field1131[arg3 - var6];
                int var11 = arg0 + var5;
                int var12 = arg0 - var5;
                class608.method3484(var9, var12, -7, arg2, var11);
                class608.method3484(var10, var12, -7, arg2, var11);
            }
            int var13 = arg0 + var6;
            int var14 = arg0 - var6;
            int[] var15 = class77.field1131[arg3 + var5];
            int[] var16 = class77.field1131[arg3 - var5];
            class608.method3484(var15, var14, arg4 + 13621, arg2, var13);
            class608.method3484(var16, var14, -7, arg2, var13);
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(I)V")
    public final void method568(int arg0) {
        field3462++;
        this.field3472.method568(arg0);
        for (class753 var2 = (class753) this.field3469.method3463((byte) -50); var2 != null; var2 = (class753) this.field3469.method3469((byte) 107)) {
            if (!this.field3465.method2340(var2, (byte) -107)) {
                int var3 = arg0;
                do {
                    if (var2.field10507 >= var3) {
                        this.method1515((byte) 62, var2, var3);
                        var2.field10507 -= var3;
                        break;
                    }
                    this.method1515((byte) 116, var2, var2.field10507);
                    var3 -= var2.field10507;
                } while (!this.field3465.method2331(0, var3, (byte) -76, var2, null));
            }
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(BLgfa;I)V")
    private final void method1515(byte arg0, class753 arg1, int arg2) {
        if (arg0 <= 11) {
            return;
        }
        if ((this.field3465.field5535[arg1.field10499] & 0x4) != 0 && arg1.field10497 < 0) {
            int var4 = this.field3465.field5501[arg1.field10499] / class608.field8585;
            int var5 = (var4 + 1048575 - arg1.field10493) / var4;
            arg1.field10493 = arg2 * var4 + arg1.field10493 & 0xFFFFF;
            if (var5 <= arg2) {
                if (this.field3465.field5489[arg1.field10499] == 0) {
                    arg1.field10500 = class57.method556(arg1.field10512, arg1.field10500.method545(), arg1.field10500.method547(), arg1.field10500.method565());
                } else {
                    arg1.field10500 = class57.method556(arg1.field10512, arg1.field10500.method545(), 0, arg1.field10500.method565());
                    this.field3465.method2309(arg1, arg1.field10488.field8953[arg1.field10502] < 0, (byte) -126);
                }
                if (arg1.field10488.field8953[arg1.field10502] < 0) {
                    arg1.field10500.method536(-1);
                }
                arg2 = arg1.field10493 / var4;
            }
        }
        field3470++;
        arg1.field10500.method568(arg2);
    }

    @OriginalMember(owner = "client!gm", name = "<init>", descriptor = "(Lul;)V")
    public class207(class363 arg0) {
        this.field3465 = arg0;
    }
}
