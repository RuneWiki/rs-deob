import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public abstract class class167 {

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "I")
    public static int field2433;

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "I")
    public static int field2434;

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "I")
    public int field2435;

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "I")
    public static int field2436;

    @OriginalMember(owner = "client!ue", name = "e", descriptor = "I")
    public static int field2437;

    @OriginalMember(owner = "client!ue", name = "f", descriptor = "I")
    public static int field2438;

    @OriginalMember(owner = "client!ue", name = "g", descriptor = "I")
    public static int field2439;

    @OriginalMember(owner = "client!ue", name = "h", descriptor = "I")
    public int field2440;

    @OriginalMember(owner = "client!ue", name = "i", descriptor = "I")
    public static int field2441;

    @OriginalMember(owner = "client!ue", name = "j", descriptor = "I")
    public static int field2442;

    @OriginalMember(owner = "client!ue", name = "l", descriptor = "I")
    public int field2444;

    @OriginalMember(owner = "client!ue", name = "m", descriptor = "I")
    public static int field2445;

    @OriginalMember(owner = "client!ue", name = "k", descriptor = "Lhn;")
    public static class287 field2443;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(B)Z")
    public final boolean method1053(byte arg0) {
        if (arg0 != -27) {
            this.method1063((byte) -80);
        }
        field2445++;
        return (this.field2440 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(ILza;)V")
    public static final void method1054(int arg0, class497 arg1) {
        if (arg0 != 0) {
            field2443 = null;
        }
        if (class409.field6204) {
            class234.method1661(0, arg1);
        } else {
            class20.method125((byte) 88, arg1);
        }
        field2442++;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIZII)V")
    public static final void method1055(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        field2437++;
        int var5 = 0;
        int var6 = arg1;
        if (!arg2) {
            return;
        }
        int var7 = -arg1;
        class280.method1888(arg4 - arg1, arg1 + arg4, (byte) 82, class103.field1521[arg0], arg3);
        int var8 = -1;
        while (var6 > var5) {
            var8 += 2;
            var7 += var8;
            var5++;
            if (var7 >= 0) {
                var6--;
                var7 -= var6 << 1;
                int[] var9 = class103.field1521[arg0 + var6];
                int[] var10 = class103.field1521[arg0 - var6];
                int var11 = arg4 + var5;
                int var12 = arg4 - var5;
                class280.method1888(var12, var11, (byte) 82, var9, arg3);
                class280.method1888(var12, var11, (byte) 82, var10, arg3);
            }
            int var13 = arg4 + var6;
            int var14 = arg4 - var6;
            int[] var15 = class103.field1521[arg0 + var5];
            int[] var16 = class103.field1521[arg0 - var5];
            class280.method1888(var14, var13, (byte) 82, var15, arg3);
            class280.method1888(var14, var13, (byte) 82, var16, arg3);
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IB)Z")
    public static final boolean method1056(int arg0, byte arg1) {
        int var2 = 88 / ((arg1 - 1) / 45);
        field2436++;
        return arg0 >= 0 && arg0 <= 3 || arg0 == 9;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(ILjava/util/Random;I)I")
    public static final int method1057(int arg0, Random arg1, int arg2) {
        field2438++;
        if (arg2 <= 0) {
            throw new IllegalArgumentException();
        } else if (class357.method2363(-48, arg2)) {
            return (int) ((long) arg2 * ((long) arg1.nextInt() & 0xFFFFFFFFL) >> 32);
        } else {
            if (arg0 != -3481) {
                field2443 = null;
            }
            int var3 = Integer.MIN_VALUE - ((int) (4294967296L % (long) arg2));
            int var4;
            do {
                var4 = arg1.nextInt();
            } while (var3 <= var4);
            return class214.method1586((byte) 105, var4, arg2);
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(BI)C")
    public static final char method1058(byte arg0, int arg1) {
        field2439++;
        int var2 = arg1 & arg0;
        if (var2 == 0) {
            throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(var2, 16) + " provided");
        }
        if (var2 >= 128 && var2 < 160) {
            char var3 = class270.field4308[var2 - 128];
            if (var3 == '\u0000') {
                var3 = '?';
            }
            var2 = var3;
        }
        return (char) var2;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(I)Z")
    public final boolean method1059(int arg0) {
        field2441++;
        if (arg0 != -1) {
            method1055(64, 67, true, -43, 65);
        }
        return (this.field2440 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "(B)V")
    public static void method1060(byte arg0) {
        if (arg0 >= -89) {
            method1055(43, 111, true, -18, 107);
        }
        field2443 = null;
    }

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "(B)Z")
    public final boolean method1061(byte arg0) {
        if (arg0 != -109) {
            method1056(-66, (byte) 46);
        }
        field2434++;
        return (this.field2440 & 0x8) != 0;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Lza;Lbm;III)V")
    public static final void method1062(class497 arg0, class484 arg1, int arg2, int arg3, int arg4) {
        if (arg3 < class252.field4075) {
            class409 var5 = class217.field3699[arg2][arg3 + 1][arg4];
            if (var5 != null && var5.field6176 != null && var5.field6176.method936(false)) {
                arg1.method938(0, arg0, 0, true, (byte) 77, class42.field454, var5.field6176);
            }
        }
        if (arg4 < class252.field4075) {
            class409 var6 = class217.field3699[arg2][arg3][arg4 + 1];
            if (var6 != null && var6.field6176 != null && var6.field6176.method936(false)) {
                arg1.method938(0, arg0, class42.field454, true, (byte) -120, 0, var6.field6176);
            }
        }
        if (arg3 < class252.field4075 && arg4 < class131.field1773) {
            class409 var7 = class217.field3699[arg2][arg3 + 1][arg4 + 1];
            if (var7 != null && var7.field6176 != null && var7.field6176.method936(false)) {
                arg1.method938(0, arg0, class42.field454, true, (byte) 108, class42.field454, var7.field6176);
            }
        }
        if (arg3 < class252.field4075 && arg4 > 0) {
            class409 var8 = class217.field3699[arg2][arg3 + 1][arg4 - 1];
            if (var8 != null && var8.field6176 != null && var8.field6176.method936(false)) {
                arg1.method938(0, arg0, -class42.field454, true, (byte) 72, class42.field454, var8.field6176);
            }
        }
    }

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "(B)Z")
    public final boolean method1063(byte arg0) {
        field2433++;
        if (arg0 == -106) {
            return (this.field2440 & 0x1) != 0;
        } else {
            return false;
        }
    }
}
