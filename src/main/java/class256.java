import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public abstract class class256 extends class102 {

    @OriginalMember(owner = "client!jb", name = "N", descriptor = "J")
    public static long field4491 = 0L;

    @OriginalMember(owner = "client!jb", name = "Y", descriptor = "Lr;")
    public static class66 field4502 = class93.method641(43, "null");

    @OriginalMember(owner = "client!jb", name = "V", descriptor = "Lc;")
    public static class125 field4499 = new class125();

    @OriginalMember(owner = "client!jb", name = "bb", descriptor = "Lr;")
    public static class66 field4505 = class93.method641(43, "W-=hlen Sie eine Welt");

    @OriginalMember(owner = "client!jb", name = "J", descriptor = "I")
    public static int field4487;

    @OriginalMember(owner = "client!jb", name = "K", descriptor = "I")
    public int field4488;

    @OriginalMember(owner = "client!jb", name = "L", descriptor = "I")
    public static int field4489;

    @OriginalMember(owner = "client!jb", name = "M", descriptor = "I")
    public int field4490;

    @OriginalMember(owner = "client!jb", name = "O", descriptor = "I")
    public static int field4492;

    @OriginalMember(owner = "client!jb", name = "P", descriptor = "I")
    public static int field4493;

    @OriginalMember(owner = "client!jb", name = "Q", descriptor = "I")
    public int field4494;

    @OriginalMember(owner = "client!jb", name = "R", descriptor = "I")
    public static int field4495;

    @OriginalMember(owner = "client!jb", name = "S", descriptor = "I")
    public int field4496;

    @OriginalMember(owner = "client!jb", name = "T", descriptor = "I")
    public static int field4497;

    @OriginalMember(owner = "client!jb", name = "U", descriptor = "I")
    public int field4498;

    @OriginalMember(owner = "client!jb", name = "W", descriptor = "I")
    public int field4500;

    @OriginalMember(owner = "client!jb", name = "X", descriptor = "I")
    public static int field4501;

    @OriginalMember(owner = "client!jb", name = "ab", descriptor = "I")
    public static int field4504;

    @OriginalMember(owner = "client!jb", name = "Z", descriptor = "Lwa;")
    public static class139 field4503;

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "(II)V")
    public abstract void method980(int arg0, int arg1);

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIIIB)V")
    public final void method1713(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field4493++;
        int var6 = this.field4490 << 3;
        int var7 = (arg2 << 4) + (var6 & 0xF);
        int var8 = this.field4498 << 3;
        int var9 = (arg1 << 4) + (var8 & 0xF);
        int var10 = -44 / ((36 - arg4) / 52);
        this.method971(var6, var8, var7, var9, arg0, arg3);
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIIII)V")
    public abstract void method978(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(ZI[Lr;I)Lr;")
    public static final class66 method1714(boolean arg0, int arg1, class66[] arg2, int arg3) {
        field4492++;
        int var4 = 0;
        for (int var5 = 0; var5 < arg3; var5++) {
            if (arg2[arg1 + var5] == null) {
                arg2[arg1 + var5] = class132.field2461;
            }
            var4 += arg2[arg1 + var5].field1308;
        }
        byte[] var6 = new byte[var4];
        int var7 = 0;
        for (int var8 = 0; var8 < arg3; var8++) {
            class66 var10 = arg2[arg1 + var8];
            class46.method331(var10.field1283, 0, var6, var7, var10.field1308);
            var7 += var10.field1308;
        }
        class66 var9 = new class66();
        var9.field1308 = var4;
        var9.field1283 = var6;
        return arg0 ? var9 : null;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIIIII)V")
    public abstract void method971(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "(II)V")
    public abstract void method974(int arg0, int arg1);

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(ILcj;Lcj;)V")
    public static final void method1715(int arg0, class28 arg1, class28 arg2) {
        field4497++;
        class151.field2714 = arg1;
        class1.field8 = arg2;
        class202.field3468 = class1.field8.method152(3, 0);
        if (arg0 >= -102) {
            field4503 = null;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(III)V")
    public abstract void method981(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IZIII)V")
    public static final void method1716(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        class194.method1266(arg3 - arg2, (byte) -17, arg0, class15.field183[arg4], arg2 + arg3);
        field4489++;
        int var5 = -arg2;
        int var6 = 0;
        if (!arg1) {
            return;
        }
        int var7 = arg2;
        int var8 = -1;
        while (var7 > var6) {
            var8 += 2;
            var6++;
            var5 += var8;
            if (var5 >= 0) {
                var7--;
                var5 -= var7 << 1;
                int[] var9 = class15.field183[arg4 - var7];
                int[] var10 = class15.field183[arg4 + var7];
                int var11 = arg3 + var6;
                int var12 = arg3 - var6;
                class194.method1266(var12, (byte) -17, arg0, var10, var11);
                class194.method1266(var12, (byte) -17, arg0, var9, var11);
            }
            int var13 = arg3 - var7;
            int[] var14 = class15.field183[arg4 - var6];
            int var15 = arg3 + var7;
            int[] var16 = class15.field183[arg4 + var6];
            class194.method1266(var13, (byte) -17, arg0, var16, var15);
            class194.method1266(var13, (byte) -17, arg0, var14, var15);
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIII)V")
    public abstract void method1153(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(IIII)V")
    public abstract void method1157(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IBLjava/util/Random;)I")
    public static final int method1717(int arg0, byte arg1, Random arg2) {
        field4501++;
        if (arg0 <= 0) {
            throw new IllegalArgumentException();
        }
        if (arg1 != 70) {
            field4503 = null;
        }
        if (class247.method1625(arg0, -1)) {
            return (int) (((long) arg2.nextInt() & 0xFFFFFFFFL) * (long) arg0 >> 32);
        }
        int var3 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg0);
        int var4;
        do {
            var4 = arg2.nextInt();
        } while (var4 >= var3);
        return class95.method654((byte) 20, var4, arg0);
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(ZLik;)V")
    public static final void method1718(boolean arg0, class117 arg1) {
        field4487++;
        class137 var2 = null;
        try {
            class232 var3 = arg1.method780(arg0, "runescape");
            while (var3.field4066 == 0) {
                class91.method636(-5, 1L);
            }
            if (var3.field4066 == 1) {
                var2 = (class137) var3.field4069;
                class249 var4 = class172.method1169(0);
                var2.method944(0, var4.field4350, 18405, var4.field4335);
            }
        } catch (Exception var6) {
        }
        try {
            if (var2 != null) {
                var2.method943(-8143);
            }
        } catch (Exception var5) {
        }
    }

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "(B)V")
    public static void method1719(byte arg0) {
        field4503 = null;
        field4502 = null;
        if (arg0 >= -97) {
            method1716(-12, true, 107, 127, -107);
        }
        field4505 = null;
        field4499 = null;
    }
}
