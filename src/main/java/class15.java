import java.awt.Frame;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class15 {

    @OriginalMember(owner = "client!ca", name = "v", descriptor = "Ljf;")
    private class68 field360 = new class68(256);

    @OriginalMember(owner = "client!ca", name = "g", descriptor = "Lpd;")
    private class108 field345;

    @OriginalMember(owner = "client!ca", name = "l", descriptor = "Lpd;")
    private class108 field350;

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "Lja;")
    public static class62 field341 = class30.method243(43, "Sie k-Onnen sich selbst nicht auf Ihre Freunde)2Liste setzen(Q");

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "Z")
    public static boolean field339 = false;

    @OriginalMember(owner = "client!ca", name = "h", descriptor = "Lja;")
    public static class62 field346 = class30.method243(43, ":chalreq:");

    @OriginalMember(owner = "client!ca", name = "k", descriptor = "I")
    public static int field349 = 0;

    @OriginalMember(owner = "client!ca", name = "r", descriptor = "I")
    public static int field356 = 0;

    @OriginalMember(owner = "client!ca", name = "s", descriptor = "[J")
    public static long[] field357 = new long[100];

    @OriginalMember(owner = "client!ca", name = "o", descriptor = "Lja;")
    private static class62 field353 = class30.method243(43, "Enter your username (V password)3");

    @OriginalMember(owner = "client!ca", name = "m", descriptor = "Lja;")
    public static class62 field351 = field353;

    @OriginalMember(owner = "client!ca", name = "x", descriptor = "I")
    public static int field362 = 0;

    @OriginalMember(owner = "client!ca", name = "y", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field363 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!ca", name = "z", descriptor = "Lja;")
    public static class62 field364 = class30.method243(43, "sl_stars");

    @OriginalMember(owner = "client!ca", name = "A", descriptor = "Lja;")
    public static class62 field365 = class30.method243(43, "<img=1>");

    @OriginalMember(owner = "client!ca", name = "B", descriptor = "Lja;")
    public static class62 field366 = class30.method243(43, "Hierhin gehen");

    @OriginalMember(owner = "client!ca", name = "C", descriptor = "[Lpe;")
    public static class109[] field367 = new class109[50];

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "I")
    public static int field340;

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "I")
    public static int field342;

    @OriginalMember(owner = "client!ca", name = "e", descriptor = "I")
    public static int field343;

    @OriginalMember(owner = "client!ca", name = "f", descriptor = "I")
    public static int field344;

    @OriginalMember(owner = "client!ca", name = "i", descriptor = "I")
    public static int field347;

    @OriginalMember(owner = "client!ca", name = "n", descriptor = "I")
    public static int field352;

    @OriginalMember(owner = "client!ca", name = "p", descriptor = "I")
    public static int field354;

    @OriginalMember(owner = "client!ca", name = "q", descriptor = "I")
    public static int field355;

    @OriginalMember(owner = "client!ca", name = "t", descriptor = "I")
    public static int field358;

    @OriginalMember(owner = "client!ca", name = "u", descriptor = "I")
    public static int field359;

    @OriginalMember(owner = "client!ca", name = "w", descriptor = "Lpd;")
    public static class108 field361;

    @OriginalMember(owner = "client!ca", name = "D", descriptor = "Lpd;")
    public static class108 field368;

    @OriginalMember(owner = "client!ca", name = "F", descriptor = "Lq;")
    public static class114 field370;

    @OriginalMember(owner = "client!ca", name = "j", descriptor = "Ljava/awt/Frame;")
    public static Frame field348;

    @OriginalMember(owner = "client!ca", name = "E", descriptor = "[[[B")
    public static byte[][][] field369;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(III[I)Lke;")
    private final class74 method102(int arg0, int arg1, int arg2, int[] arg3) {
        field342++;
        if (arg0 != 1758952912) {
            field353 = null;
        }
        int var5 = ((arg1 & 0x20000FFF) << 4 | arg1 >>> 12) ^ arg2;
        int var6 = var5 | arg1 << 16;
        long var7 = (long) var6;
        class74 var9 = (class74) this.field360.method537(-1, var7);
        if (var9 != null) {
            return var9;
        } else if (arg3 == null || arg3[0] > 0) {
            class109 var10 = class109.method887(this.field345, arg1, arg2);
            if (var10 == null) {
                return null;
            }
            class74 var11 = var10.method885();
            this.field360.method538(var11, (byte) -27, var7);
            if (arg3 != null) {
                arg3[0] -= var11.field1855.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "([IIII)Lke;")
    private final class74 method103(int[] arg0, int arg1, int arg2, int arg3) {
        field358++;
        if (arg1 != -29911) {
            this.field360 = null;
        }
        int var5 = arg3 ^ ((arg2 & 0xFFF) << 4 | arg2 >>> 12);
        int var6 = var5 | arg2 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class74 var9 = (class74) this.field360.method537(-1, var7);
        if (var9 != null) {
            return var9;
        } else if (arg0 == null || arg0[0] > 0) {
            class129 var10 = class129.method1048(this.field350, arg2, arg3);
            if (var10 == null) {
                return null;
            }
            class74 var11 = var10.method1049();
            this.field360.method538(var11, (byte) -27, var7);
            if (arg0 != null) {
                arg0[0] -= var11.field1855.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(B)V")
    public static void method104(byte arg0) {
        field361 = null;
        field357 = null;
        field365 = null;
        field353 = null;
        if (arg0 != 118) {
            return;
        }
        field368 = null;
        field351 = null;
        field367 = null;
        field366 = null;
        field346 = null;
        field341 = null;
        field363 = null;
        field364 = null;
        field348 = null;
        field370 = null;
        field369 = null;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(ILpd;ZLpd;I)Lda;")
    public static final class22 method105(int arg0, class108 arg1, boolean arg2, class108 arg3, int arg4) {
        field347++;
        boolean var5 = true;
        int[] var6 = arg1.method872(arg0, arg4 + 9612);
        if (arg4 != 1) {
            method104((byte) -117);
        }
        for (int var7 = 0; var7 < var6.length; var7++) {
            byte[] var8 = arg1.method874(arg0, var6[var7], (byte) -108);
            if (var8 == null) {
                var5 = false;
            } else {
                int var9 = var8[1] & 0xFF | (var8[0] & 0xFF) << 8;
                byte[] var10;
                if (arg2) {
                    var10 = arg3.method874(0, var9, (byte) -122);
                } else {
                    var10 = arg3.method874(var9, 0, (byte) -126);
                }
                if (var10 == null) {
                    var5 = false;
                }
            }
        }
        if (!var5) {
            return null;
        }
        try {
            return new class22(arg1, arg3, arg0, arg2);
        } catch (Exception var11) {
            return null;
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIBI)I")
    public static final int method106(int arg0, int arg1, byte arg2, int arg3) {
        if (arg2 != 105) {
            method104((byte) -52);
        }
        field344++;
        int var4 = arg0 & 0x3;
        if (var4 == 0) {
            return arg1;
        } else if (var4 == 1) {
            return arg3;
        } else if (var4 == 2) {
            return 7 - arg1;
        } else {
            return 7 - arg3;
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIZ)V")
    public static final void method107(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            field366 = null;
        }
        if (class141.field3308 != 0 && arg1 != -1) {
            class83.method645(class141.field3308, class53.field1218, (byte) 127, false, 0, arg1);
            class56.field1383 = true;
        }
        field343++;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(BI[I)Lke;")
    public final class74 method108(byte arg0, int arg1, int[] arg2) {
        if (arg0 != 37) {
            method107(-91, 111, false);
        }
        field359++;
        if (this.field345.method862((byte) -110) == 1) {
            return this.method102(arg0 + 1758952875, 0, arg1, arg2);
        } else if (this.field345.method864(0, arg1) == 1) {
            return this.method102(arg0 ^ 0x68D77DF5, arg1, 0, arg2);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "([IBI)Lke;")
    public final class74 method109(int[] arg0, byte arg1, int arg2) {
        field340++;
        if (this.field350.method862((byte) -118) == 1) {
            return this.method103(arg0, -29911, 0, arg2);
        } else if (arg1 <= 28) {
            return null;
        } else if (this.field350.method864(0, arg2) == 1) {
            return this.method103(arg0, -29911, arg2, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Ljava/lang/Object;ZZ)[B")
    public static final byte[] method110(Object arg0, boolean arg1, boolean arg2) {
        if (arg1) {
            field368 = null;
        }
        field355++;
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var3 = (byte[]) arg0;
            return arg2 ? class102.method816(var3, 39) : var3;
        } else if (arg0 instanceof class102) {
            class102 var4 = (class102) arg0;
            return var4.method822(1000);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ca", name = "<init>", descriptor = "(Lpd;Lpd;)V")
    public class15(class108 arg0, class108 arg1) {
        this.field345 = arg0;
        this.field350 = arg1;
    }
}
