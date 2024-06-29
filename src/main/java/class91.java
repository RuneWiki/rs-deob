import java.awt.Canvas;
import java.lang.reflect.Constructor;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uq")
public class class91 {

    @OriginalMember(owner = "client!uq", name = "g", descriptor = "[I")
    private int[] field1378 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!uq", name = "k", descriptor = "Z")
    public boolean field1382 = false;

    @OriginalMember(owner = "client!uq", name = "q", descriptor = "I")
    public int field1388 = -1;

    @OriginalMember(owner = "client!uq", name = "o", descriptor = "I")
    public static int field1386 = 0;

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "I")
    public static int field1372;

    @OriginalMember(owner = "client!uq", name = "c", descriptor = "I")
    public static int field1374;

    @OriginalMember(owner = "client!uq", name = "d", descriptor = "I")
    public static int field1375;

    @OriginalMember(owner = "client!uq", name = "i", descriptor = "I")
    public static int field1380;

    @OriginalMember(owner = "client!uq", name = "l", descriptor = "I")
    public static int field1383;

    @OriginalMember(owner = "client!uq", name = "m", descriptor = "I")
    public static int field1384;

    @OriginalMember(owner = "client!uq", name = "r", descriptor = "I")
    public static int field1389;

    @OriginalMember(owner = "client!uq", name = "s", descriptor = "I")
    public static int field1390;

    @OriginalMember(owner = "client!uq", name = "h", descriptor = "Llf;")
    public static class130 field1379;

    @OriginalMember(owner = "client!uq", name = "b", descriptor = "Lqj;")
    public static class296 field1373;

    // $FF: synthetic field
    @OriginalMember(owner = "client!uq", name = "t", descriptor = "Ljava/lang/Class;")
    public static Class field1391;

    // $FF: synthetic field
    @OriginalMember(owner = "client!uq", name = "u", descriptor = "Ljava/lang/Class;")
    public static Class field1392;

    // $FF: synthetic field
    @OriginalMember(owner = "client!uq", name = "v", descriptor = "Ljava/lang/Class;")
    public static Class field1393;

    @OriginalMember(owner = "client!uq", name = "p", descriptor = "[I")
    private int[] field1387;

    @OriginalMember(owner = "client!uq", name = "e", descriptor = "[S")
    private short[] field1376;

    @OriginalMember(owner = "client!uq", name = "f", descriptor = "[S")
    private short[] field1377;

    @OriginalMember(owner = "client!uq", name = "j", descriptor = "[S")
    private short[] field1381;

    @OriginalMember(owner = "client!uq", name = "n", descriptor = "[S")
    private short[] field1385;

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(I)Lap;")
    public final class279 method619(int arg0) {
        field1380++;
        class279[] var2 = new class279[5];
        if (arg0 >= -104) {
            return null;
        }
        int var3 = 0;
        class296 var4 = class262.field3578;
        synchronized (class262.field3578) {
            for (int var5 = 0; var5 < 5; var5++) {
                if (this.field1378[var5] != -1) {
                    var2[var3++] = class33.method247(class262.field3578, this.field1378[var5], 0, 67);
                }
            }
        }
        class279 var6 = new class279(var2, var3);
        if (this.field1381 != null) {
            for (int var7 = 0; var7 < this.field1381.length; var7++) {
                var6.method1708(this.field1381[var7], (byte) -53, this.field1376[var7]);
            }
        }
        if (this.field1385 != null) {
            for (int var8 = 0; var8 < this.field1385.length; var8++) {
                var6.method1710((byte) 32, this.field1385[var8], this.field1377[var8]);
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(Leb;B)V")
    public final void method620(class371 arg0, byte arg1) {
        field1390++;
        if (arg1 < 17) {
            this.field1388 = -37;
        }
        while (true) {
            int var3 = arg0.method2429(0);
            if (var3 == 0) {
                return;
            }
            this.method621(var3, 0, arg0);
        }
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(IILeb;)V")
    private final void method621(int arg0, int arg1, class371 arg2) {
        if (arg1 != 0) {
            return;
        }
        if (arg0 == 1) {
            this.field1388 = arg2.method2429(0);
        } else if (arg0 == 2) {
            int var4 = arg2.method2429(0);
            this.field1387 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1387[var5] = arg2.method2403((byte) 99);
            }
        } else if (arg0 == 3) {
            this.field1382 = true;
        } else if (arg0 == 40) {
            int var8 = arg2.method2429(0);
            this.field1381 = new short[var8];
            this.field1376 = new short[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field1381[var9] = (short) arg2.method2403((byte) 71);
                this.field1376[var9] = (short) arg2.method2403((byte) 115);
            }
        } else if (arg0 == 41) {
            int var6 = arg2.method2429(0);
            this.field1377 = new short[var6];
            this.field1385 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field1385[var7] = (short) arg2.method2403((byte) 112);
                this.field1377[var7] = (short) arg2.method2403((byte) 59);
            }
        } else if (arg0 >= 60 && arg0 < 70) {
            this.field1378[arg0 - 60] = arg2.method2403((byte) 53);
        }
        field1389++;
    }

    @OriginalMember(owner = "client!uq", name = "b", descriptor = "(I)Z")
    public final boolean method622(int arg0) {
        field1384++;
        boolean var2 = true;
        class296 var3 = class262.field3578;
        synchronized (class262.field3578) {
            int var4 = 0;
            while (true) {
                if (var4 >= 5) {
                    break;
                }
                if (this.field1378[var4] != -1 && !class262.field3578.method1897(this.field1378[var4], -109, 0)) {
                    var2 = false;
                }
                var4++;
            }
        }
        if (arg0 < 51) {
            this.method627(false);
        }
        return var2;
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(Lkq;ILsr;Ljava/awt/Canvas;II)Laa;")
    public static final class281 method623(class351 arg0, int arg1, class136 arg2, Canvas arg3, int arg4, int arg5) {
        field1383++;
        try {
            Class var6 = Class.forName("hj");
            Constructor var7 = var6.getConstructor(field1391 == null ? (field1391 = method628("java.awt.Canvas")) : field1391, field1392 == null ? (field1392 = method628("sr")) : field1392, Integer.TYPE, Integer.TYPE, field1393 == null ? (field1393 = method628("kq")) : field1393);
            if (arg5 != 7) {
                method624(47, -5, 89, 29, 56, 118);
            }
            return (class281) var7.newInstance(arg3, arg2, Integer.valueOf(arg1), new Integer(arg4), arg0);
        } catch (Exception var8) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(IIIIII)Z")
    public static final boolean method624(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != arg2 || arg3 != arg4) {
            for (int var8 = arg1; var8 <= arg2; var8++) {
                for (int var14 = arg3; var14 <= arg4; var14++) {
                    if (class28.field445[arg0][var8][var14] == -class352.field4922) {
                        return false;
                    }
                }
            }
            int var9 = (arg1 << 7) + 1;
            int var10 = (arg3 << 7) + 2;
            int var11 = class249.field3456[arg0].method275(arg1, arg3) + arg5;
            if (!class431.method2709(var9, var11, var10)) {
                return false;
            }
            int var12 = (arg2 << 7) - 1;
            if (!class431.method2709(var12, var11, var10)) {
                return false;
            }
            int var13 = (arg4 << 7) - 1;
            if (!class431.method2709(var9, var11, var13)) {
                return false;
            } else if (class431.method2709(var12, var11, var13)) {
                return true;
            } else {
                return false;
            }
        } else if (class326.method2050(arg0, arg1, arg3)) {
            int var6 = arg1 << 7;
            int var7 = arg3 << 7;
            return class431.method2709(var6 + 1, class249.field3456[arg0].method275(arg1, arg3) + arg5, var7 + 1) && class431.method2709(var6 + 128 - 1, class249.field3456[arg0].method275(arg1 + 1, arg3) + arg5, var7 + 1) && class431.method2709(var6 + 128 - 1, class249.field3456[arg0].method275(arg1 + 1, arg3 + 1) + arg5, var7 + 128 - 1) && class431.method2709(var6 + 1, class249.field3456[arg0].method275(arg1, arg3 + 1) + arg5, var7 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(B)V")
    public static void method625(byte arg0) {
        field1379 = null;
        if (arg0 <= 122) {
            field1386 = -92;
        }
        field1373 = null;
    }

    @OriginalMember(owner = "client!uq", name = "c", descriptor = "(I)Lap;")
    public final class279 method626(int arg0) {
        field1375++;
        if (this.field1387 == null) {
            return null;
        }
        int var2 = 126 / ((arg0 - 47) / 59);
        class279[] var3 = new class279[this.field1387.length];
        class296 var4 = class262.field3578;
        synchronized (class262.field3578) {
            int var5 = 0;
            while (true) {
                if (this.field1387.length <= var5) {
                    break;
                }
                var3[var5] = class33.method247(class262.field3578, this.field1387[var5], 0, 63);
                var5++;
            }
        }
        class279 var6;
        if (var3.length == 1) {
            var6 = var3[0];
        } else {
            var6 = new class279(var3, var3.length);
        }
        if (var6 == null) {
            return null;
        }
        if (this.field1381 != null) {
            for (int var7 = 0; var7 < this.field1381.length; var7++) {
                var6.method1708(this.field1381[var7], (byte) -53, this.field1376[var7]);
            }
        }
        if (this.field1385 != null) {
            for (int var8 = 0; var8 < this.field1385.length; var8++) {
                var6.method1710((byte) 32, this.field1385[var8], this.field1377[var8]);
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(Z)Z")
    public final boolean method627(boolean arg0) {
        if (arg0) {
            return true;
        }
        field1374++;
        if (this.field1387 == null) {
            return true;
        }
        boolean var2 = true;
        class296 var3 = class262.field3578;
        synchronized (class262.field3578) {
            for (int var4 = 0; var4 < this.field1387.length; var4++) {
                if (!class262.field3578.method1897(this.field1387[var4], -54, 0)) {
                    var2 = false;
                }
            }
            return var2;
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method628(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
