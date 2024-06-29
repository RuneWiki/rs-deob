import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!po")
public class class91 {

    @OriginalMember(owner = "client!po", name = "l", descriptor = "Z")
    public boolean field1620 = false;

    @OriginalMember(owner = "client!po", name = "b", descriptor = "[Ljava/lang/String;")
    public static String[] field1610 = new String[200];

    @OriginalMember(owner = "client!po", name = "e", descriptor = "I")
    public static int field1613 = 0;

    @OriginalMember(owner = "client!po", name = "a", descriptor = "[I")
    public static int[] field1609 = new int[32];

    @OriginalMember(owner = "client!po", name = "n", descriptor = "I")
    public static int field1622 = 0;

    @OriginalMember(owner = "client!po", name = "c", descriptor = "I")
    public static int field1611;

    @OriginalMember(owner = "client!po", name = "d", descriptor = "I")
    public int field1612;

    @OriginalMember(owner = "client!po", name = "f", descriptor = "I")
    public static int field1614;

    @OriginalMember(owner = "client!po", name = "h", descriptor = "I")
    public static int field1616;

    @OriginalMember(owner = "client!po", name = "i", descriptor = "I")
    public static int field1617;

    @OriginalMember(owner = "client!po", name = "j", descriptor = "I")
    public static int field1618;

    @OriginalMember(owner = "client!po", name = "k", descriptor = "I")
    public static int field1619;

    @OriginalMember(owner = "client!po", name = "m", descriptor = "I")
    public static int field1621;

    @OriginalMember(owner = "client!po", name = "o", descriptor = "I")
    public int field1623;

    @OriginalMember(owner = "client!po", name = "p", descriptor = "I")
    public static int field1624;

    @OriginalMember(owner = "client!po", name = "q", descriptor = "I")
    public static int field1625;

    @OriginalMember(owner = "client!po", name = "r", descriptor = "I")
    public static int field1626;

    @OriginalMember(owner = "client!po", name = "g", descriptor = "[Lg;")
    public static class181[] field1615;

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(IIZ)Lka;", line = 4)
    public final class211 method695(int arg0, int arg1, boolean arg2) {
        field1626++;
        class211 var4 = (class211) class44.field906.method893((long) ((arg2 ? 262144 : 0) | arg1 << 16 | this.field1612), arg0 + 89);
        if (var4 != null) {
            return var4;
        }
        class325.field5247.method1401(this.field1612, -2689);
        class211 var5 = class77.method585(this.field1612, class325.field5247, -97, arg0);
        if (var5 != null) {
            var5.method1454(class220.field3645, class192.field3246, class119.field2127);
            var5.field5239 = var5.field5229;
            var5.field5228 = var5.field5236;
            if (arg2) {
                var5.method1458();
            }
            for (int var6 = 0; var6 < arg1; var6++) {
                var5.method1455();
            }
            class44.field906.method888((long) ((arg2 ? 262144 : 0) | this.field1612 | arg1 << 16), var5, 34);
        }
        return var5;
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(Ljava/util/Random;II)I", line = 48)
    public static final int method696(Random arg0, int arg1, int arg2) {
        field1618++;
        if (arg1 <= 0) {
            throw new IllegalArgumentException();
        } else if (class172.method1221(arg1, 0)) {
            return (int) ((long) arg1 * ((long) arg0.nextInt() & 0xFFFFFFFFL) >> 32);
        } else if (arg2 <= 54) {
            return -43;
        } else {
            int var3 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg1);
            int var4;
            do {
                var4 = arg0.nextInt();
            } while (var4 >= var3);
            return class261.method1839(true, arg1, var4);
        }
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(IIILoe;)V", line = 85)
    private final void method697(int arg0, int arg1, int arg2, class146 arg3) {
        if (arg0 == 1) {
            this.field1612 = arg3.method989(61);
        } else if (arg0 == 2) {
            this.field1623 = arg3.method1025((byte) -117);
        } else if (arg0 == 3) {
            this.field1620 = true;
        } else if (arg0 == 4) {
            this.field1612 = -1;
        }
        if (arg1 < 40) {
            field1614 = -123;
        }
        field1624++;
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(ILoe;I)V", line = 117)
    public final void method698(int arg0, class146 arg1, int arg2) {
        field1619++;
        while (true) {
            int var4 = arg1.method1005((byte) 122);
            if (var4 == 0) {
                if (arg0 != -14782) {
                    field1610 = (String[]) null;
                }
                return;
            }
            this.method697(var4, 108, arg2, arg1);
        }
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(I)V", line = 140)
    public static final void method699(int arg0) {
        if (arg0 != 0) {
            field1617 = -18;
        }
        field1616++;
        class347.field5542.method889((byte) -4);
        class359.field5714.method889((byte) -126);
        class176.field2907.method889((byte) 33);
        class20.field517.method889((byte) -126);
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "([IIIIII)V", line = 161)
    public static final void method700(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class312 var6 = class353.field5644[arg3][arg4][arg5];
        if (var6 == null) {
            return;
        }
        class209 var7 = var6.field5087;
        if (var7 != null) {
            int var8 = var7.field3496;
            if (var8 != 0) {
                for (int var9 = 0; var9 < 4; var9++) {
                    arg0[arg1] = var8;
                    arg0[arg1 + 1] = var8;
                    arg0[arg1 + 2] = var8;
                    arg0[arg1 + 3] = var8;
                    arg1 += arg2;
                }
            }
            return;
        }
        class165 var10 = var6.field5094;
        if (var10 == null) {
            return;
        }
        int var11 = var10.field2771;
        int var12 = var10.field2760;
        int var13 = var10.field2773;
        int var14 = var10.field2769;
        int[] var15 = class25.field653[var11];
        int[] var16 = class194.field3268[var12];
        int var17 = 0;
        if (var13 != 0) {
            for (int var18 = 0; var18 < 4; var18++) {
                arg0[arg1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 2] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 3] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg1 += arg2;
            }
            return;
        }
        for (int var19 = 0; var19 < 4; var19++) {
            if (var15[var16[var17++]] != 0) {
                arg0[arg1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 2] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 3] = var14;
            }
            arg1 += arg2;
        }
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(B)V", line = 258)
    public static void method701(byte arg0) {
        field1609 = null;
        if (arg0 >= -1) {
            field1609 = (int[]) null;
        }
        field1615 = null;
        field1610 = null;
    }
}
