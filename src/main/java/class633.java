import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public class class633 implements class693 {

    @OriginalMember(owner = "client!jk", name = "e", descriptor = "Lwr;")
    private class459 field8788 = new class459(128);

    @OriginalMember(owner = "client!jk", name = "i", descriptor = "[I")
    public int[] field8792 = new int[class684.field9522.field1577];

    @OriginalMember(owner = "client!jk", name = "m", descriptor = "[I")
    private int[] field8796 = new int[class684.field9522.field1577];

    @OriginalMember(owner = "client!jk", name = "n", descriptor = "Llga;")
    public static class712 field8797 = new class712(42, 4);

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "I")
    public static int field8784;

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "I")
    public static int field8785;

    @OriginalMember(owner = "client!jk", name = "d", descriptor = "I")
    public static int field8787;

    @OriginalMember(owner = "client!jk", name = "f", descriptor = "I")
    public static int field8789;

    @OriginalMember(owner = "client!jk", name = "g", descriptor = "I")
    public static int field8790;

    @OriginalMember(owner = "client!jk", name = "h", descriptor = "I")
    public static int field8791;

    @OriginalMember(owner = "client!jk", name = "l", descriptor = "I")
    public static int field8795;

    @OriginalMember(owner = "client!jk", name = "o", descriptor = "I")
    public static int field8798;

    @OriginalMember(owner = "client!jk", name = "p", descriptor = "I")
    public static int field8799;

    @OriginalMember(owner = "client!jk", name = "q", descriptor = "I")
    public static int field8800;

    @OriginalMember(owner = "client!jk", name = "j", descriptor = "Ldi;")
    public static class128 field8793;

    @OriginalMember(owner = "client!jk", name = "c", descriptor = "Ldga;")
    public static class208 field8786;

    @OriginalMember(owner = "client!jk", name = "k", descriptor = "[Z")
    public static boolean[] field8794;

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(I)V", line = 6)
    public static void method3551(int arg0) {
        field8797 = null;
        field8793 = null;
        if (arg0 != -4492) {
            method3555(-125, -67, -94);
        }
        field8794 = null;
        field8786 = null;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(III)V", line = 22)
    public final void method3552(int arg0, int arg1, int arg2) {
        field8784++;
        if (arg0 != -7469) {
            this.method3557(39, -35, -126);
        }
        this.field8796[arg2] = arg1;
        class677 var4 = (class677) this.field8788.method2552((long) arg2, -1);
        if (var4 == null) {
            class677 var5 = new class677(4611686018427387905L);
            this.field8788.method2558(var5, (long) arg2, -1);
        } else if (var4.field9450 != 4611686018427387905L) {
            var4.field9450 = class538.method2963(-47) + 500L | 0x4000000000000000L;
            return;
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(II)I", line = 50)
    public final int method3553(int arg0, int arg1) {
        int var3 = -51 / ((-arg1 - 34) / 41);
        field8799++;
        return this.field8792[arg0];
    }

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "(II)I", line = 60)
    public final int method3554(int arg0, int arg1) {
        field8791++;
        class68 var3 = class465.field6445.method1839(arg0, (byte) 40);
        int var4 = var3.field748;
        int var5 = var3.field749;
        int var6 = var3.field751;
        if (arg1 == 7373) {
            int var7 = class73.field780[var6 - var5];
            return this.field8792[var4] >> var5 & var7;
        } else {
            return -48;
        }
    }

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "(III)Z", line = 81)
    public static final boolean method3555(int arg0, int arg1, int arg2) {
        field8800++;
        if (arg2 == 2048) {
            return (arg0 & 0x800) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(B)V", line = 92)
    public final void method3556(byte arg0) {
        field8785++;
        int var2 = 0;
        int var3 = 40 / ((arg0 - 1) / 42);
        while (class684.field9522.field1577 > var2) {
            class171 var4 = class684.field9522.method785(var2, 16);
            if (var4 != null && var4.field2133 == 0) {
                this.field8796[var2] = 0;
                this.field8792[var2] = 0;
            }
            var2++;
        }
        this.field8788 = new class459(128);
    }

    @OriginalMember(owner = "client!jk", name = "c", descriptor = "(III)V", line = 120)
    public final void method3557(int arg0, int arg1, int arg2) {
        field8795++;
        class68 var4 = class465.field6445.method1839(arg1, (byte) 68);
        int var5 = var4.field748;
        int var6 = var4.field749;
        int var7 = var4.field751;
        int var8 = class73.field780[var7 - var6];
        if (arg0 < arg2 || arg0 > var8) {
            arg0 = 0;
        }
        int var9 = var8 << var6;
        this.method3559(var5, 86, var9 & arg0 << var6 | ~var9 & this.field8792[var5]);
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(IZ)I", line = 146)
    public final int method3558(int arg0, boolean arg1) {
        field8790++;
        long var3 = class538.method2963(-47);
        class677 var5 = arg1 ? (class677) this.field8788.method2560(117) : (class677) this.field8788.method2557(-1);
        int var6 = -62 / ((-arg0 - 29) / 39);
        while (var5 != null) {
            if ((var5.field9450 & 0x3FFFFFFFFFFFFFFFL) < var3) {
                if ((var5.field9450 & 0x4000000000000000L) != 0L) {
                    int var7 = (int) var5.field556;
                    this.field8792[var7] = this.field8796[var7];
                    var5.method315(45);
                    return var7;
                }
                var5.method315(59);
            }
            var5 = (class677) this.field8788.method2557(-1);
        }
        return -1;
    }

    @OriginalMember(owner = "client!jk", name = "d", descriptor = "(III)V", line = 202)
    public final void method3559(int arg0, int arg1, int arg2) {
        field8787++;
        this.field8792[arg0] = arg2;
        class677 var4 = (class677) this.field8788.method2552((long) arg0, -1);
        if (var4 == null) {
            class677 var5 = new class677(class538.method2963(-47) + 500L);
            this.field8788.method2558(var5, (long) arg0, -1);
        } else {
            var4.field9450 = class538.method2963(-47) + 500L;
        }
        if (arg1 <= 58) {
            this.method3552(36, 108, 47);
        }
    }

    @OriginalMember(owner = "client!jk", name = "e", descriptor = "(III)V", line = 230)
    public final void method3560(int arg0, int arg1, int arg2) {
        field8798++;
        class68 var4 = class465.field6445.method1839(arg0, (byte) 98);
        int var5 = var4.field748;
        if (arg2 != -32727) {
            return;
        }
        int var6 = var4.field749;
        int var7 = var4.field751;
        int var8 = class73.field780[var7 - var6];
        if (arg1 < 0 || var8 < arg1) {
            arg1 = 0;
        }
        int var9 = var8 << var6;
        this.method3552(arg2 + 25258, arg1 << var6 & var9 | this.field8796[var5] & ~var9, var5);
    }
}
