import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public abstract class class114 {

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "I")
    public int field1662;

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "I")
    public int field1661;

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "I")
    public int field1663;

    @OriginalMember(owner = "client!hd", name = "m", descriptor = "I")
    public static int field1672 = 0;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "I")
    public static int field1660;

    @OriginalMember(owner = "client!hd", name = "e", descriptor = "I")
    public static int field1664;

    @OriginalMember(owner = "client!hd", name = "f", descriptor = "I")
    public static int field1665;

    @OriginalMember(owner = "client!hd", name = "g", descriptor = "I")
    public static int field1666;

    @OriginalMember(owner = "client!hd", name = "h", descriptor = "I")
    public static int field1667;

    @OriginalMember(owner = "client!hd", name = "i", descriptor = "I")
    public static int field1668;

    @OriginalMember(owner = "client!hd", name = "k", descriptor = "I")
    public static int field1670;

    @OriginalMember(owner = "client!hd", name = "j", descriptor = "Lvl;")
    public static class73 field1669;

    @OriginalMember(owner = "client!hd", name = "l", descriptor = "[[I")
    public static int[][] field1671;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(II[Lfe;)V")
    public static final void method752(int arg0, int arg1, class231[] arg2) {
        for (int var3 = 0; var3 < arg2.length; var3++) {
            class231 var4 = arg2[var3];
            if (var4 != null) {
                if (var4.field3620 == 0) {
                    if (var4.field3578 != null) {
                        method752(arg0, 27780, var4.field3578);
                    }
                    class104 var5 = (class104) class115.field1674.method1064(-1, (long) var4.field3595);
                    if (var5 != null) {
                        class290.method1969(arg0, var5.field1511, 6404);
                    }
                }
                if (arg0 == 0 && var4.field3627 != null) {
                    class122 var6 = new class122();
                    var6.field1752 = var4;
                    var6.field1755 = var4.field3627;
                    class122.method795(var6, -105);
                }
                if (arg0 == 1 && var4.field3588 != null) {
                    if (var4.field3739 >= 0) {
                        class231 var7 = class201.method1398(var4.field3595, arg1 - 27780);
                        if (var7 == null || var7.field3578 == null || var4.field3739 >= var7.field3578.length || var7.field3578[var4.field3739] != var4) {
                            continue;
                        }
                    }
                    class122 var8 = new class122();
                    var8.field1752 = var4;
                    var8.field1755 = var4.field3588;
                    class122.method795(var8, -123);
                }
            }
        }
        if (arg1 != 27780) {
            method752(115, 35, (class231[]) null);
        }
        field1664++;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Z)V")
    public static final void method753(boolean arg0) {
        class229.field3537.method178(!arg0);
        int var1 = 0;
        if (!arg0) {
            field1671 = null;
        }
        while (var1 < 32) {
            class212.field3302[var1] = 0L;
            var1++;
        }
        for (int var2 = 0; var2 < 32; var2++) {
            class6.field83[var2] = 0L;
        }
        class188.field2940 = 0;
        field1665++;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIZIII)V")
    public static final void method754(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        field1668++;
        int var6 = 0;
        int var7 = arg0;
        if (arg2) {
            method759((byte) -23);
        }
        int var8 = arg1 * arg1;
        int var9 = arg0 * arg0;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg0 << 1;
        int var13 = var9 - ((var12 - 1) * var11);
        int var14 = (1 - var12) * var8 + var10;
        int var15 = var9 << 2;
        int var16 = ((arg0 << 1) - 3) * var11;
        int var17 = ((var6 << 1) + 3) * var10;
        int var18 = var8 << 2;
        if (class115.field1678 <= arg5 && arg5 <= class60.field882) {
            int var19 = class196.method1369(class187.field2938, arg1 + arg3, true, class56.field816);
            int var20 = class196.method1369(class187.field2938, arg3 - arg1, true, class56.field816);
            class16.method97(-7, class78.field1180[arg5], var19, arg4, var20);
        }
        int var21 = (var6 + 1) * var15;
        int var22 = (arg0 - 1) * var18;
        while (var7 > 0) {
            if (var14 < 0) {
                while (var14 < 0) {
                    var13 += var21;
                    var6++;
                    var14 += var17;
                    var21 += var15;
                    var17 += var15;
                }
            }
            var7--;
            int var23 = arg5 - var7;
            int var24 = arg5 + var7;
            if (var13 < 0) {
                var13 += var21;
                var14 += var17;
                var17 += var15;
                var21 += var15;
                var6++;
            }
            var13 += -var16;
            var16 -= var18;
            var14 += -var22;
            var22 -= var18;
            if (class115.field1678 <= var24 && var23 <= class60.field882) {
                int var25 = class196.method1369(class187.field2938, arg3 + var6, !arg2, class56.field816);
                int var26 = class196.method1369(class187.field2938, arg3 - var6, true, class56.field816);
                if (class115.field1678 <= var23) {
                    class16.method97(-7, class78.field1180[var23], var25, arg4, var26);
                }
                if (class60.field882 >= var24) {
                    class16.method97(-7, class78.field1180[var24], var25, arg4, var26);
                }
            }
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(II)V")
    public static final void method755(int arg0, int arg1) {
        field1660++;
        class182 var2 = (class182) class38.field464.method1064(arg1, (long) arg0);
        if (var2 != null) {
            for (int var3 = 0; var3 < var2.field2864.length; var3++) {
                var2.field2864[var3] = -1;
                var2.field2866[var3] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(III)V")
    public abstract void method105(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(ILvl;I)Lci;")
    public static final class189 method756(int arg0, class73 arg1, int arg2) {
        field1670++;
        if (class75.method521(arg0, arg1, (byte) -123)) {
            return arg2 == -21159 ? class159.method1097(arg2 + 43303) : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!hd", name = "<init>", descriptor = "(III)V")
    public class114(int arg0, int arg1, int arg2) {
        this.field1662 = arg0;
        this.field1661 = arg1;
        this.field1663 = arg2;
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(Z)V")
    public static void method757(boolean arg0) {
        if (!arg0) {
            field1671 = null;
        }
        field1669 = null;
        field1671 = null;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lvl;Z)V")
    public static final void method758(class73 arg0, boolean arg1) {
        class16.field225 = class256.method1814(-16586, class129.field1860, arg0);
        class210.field3281 = new int[256];
        for (int var2 = 0; var2 < 3; var2++) {
            float var4 = (float) (class159.field2374[var2] >> 16 & 0xFF);
            float var5 = (float) ((class159.field2374[var2] & 0xFF00) >> 8);
            int var6 = (class159.field2374[var2 + 1] & 0xFF00) >> 8;
            int var7 = class159.field2374[var2 + 1] >> 16 & 0xFF;
            float var8 = (float) (class159.field2374[var2] & 0xFF);
            float var9 = ((float) var6 - var5) / 64.0F;
            float var10 = ((float) var7 - var4) / 64.0F;
            int var11 = class159.field2374[var2 + 1] & 0xFF;
            float var12 = ((float) var11 - var8) / 64.0F;
            for (int var13 = 0; var13 < 64; var13++) {
                class210.field3281[var2 * 64 + var13] = class243.method1723(class243.method1723((int) var4 << 16, (int) var5 << 8), (int) var8);
                var5 += var9;
                var8 += var12;
                var4 += var10;
            }
        }
        if (!arg1) {
            return;
        }
        field1667++;
        for (int var3 = 192; var3 < 255; var3++) {
            class210.field3281[var3] = class159.field2374[3];
        }
        class302.field4810 = new int[32768];
        class270.field4396 = new int[32768];
        class275.method1904((class91) null, (byte) -9);
        class310.field4988 = new int[32768];
        class90.field1363 = new int[32768];
        class282.field4587 = new class48(128, 254);
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(B)V")
    public static final void method759(byte arg0) {
        class81 var1 = class108.field1568;
        synchronized (class108.field1568) {
            class284.field4606 = class223.field3495;
            class50.field633 = class243.field3910;
            class216.field3371++;
            class71.field1042 = class129.field1862;
            class235.field3796 = class36.field442;
            class171.field2686 = class300.field4794;
            class223.field3493 = class80.field1223;
            if (arg0 != -83) {
                return;
            }
            class86.field1305 = class18.field252;
            class36.field442 = 0;
        }
        field1666++;
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(III)V")
    public abstract void method106(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "(III)V")
    public abstract void method103(int arg0, int arg1, int arg2);
}
