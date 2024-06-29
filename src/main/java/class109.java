import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class109 {

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "Ldd;")
    public static class35 field2411 = class180.method1196((byte) 126, "Sie haben gerade eine andere Welt verlassen)3");

    @OriginalMember(owner = "client!lb", name = "l", descriptor = "I")
    public static int field2422 = 0;

    @OriginalMember(owner = "client!lb", name = "m", descriptor = "I")
    public static int field2423 = 0;

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "I")
    public static int field2412;

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "I")
    public static int field2413;

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "I")
    public static int field2414;

    @OriginalMember(owner = "client!lb", name = "g", descriptor = "I")
    public static int field2417;

    @OriginalMember(owner = "client!lb", name = "j", descriptor = "I")
    public static int field2420;

    @OriginalMember(owner = "client!lb", name = "f", descriptor = "J")
    public long field2416;

    @OriginalMember(owner = "client!lb", name = "h", descriptor = "Llb;")
    public class109 field2418;

    @OriginalMember(owner = "client!lb", name = "k", descriptor = "Llb;")
    public class109 field2421;

    @OriginalMember(owner = "client!lb", name = "e", descriptor = "Ljava/awt/Frame;")
    public static Frame field2415;

    @OriginalMember(owner = "client!lb", name = "i", descriptor = "Z")
    public static boolean field2419;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(I)V")
    public final void method799(int arg0) {
        field2413++;
        if (arg0 != -24265) {
            field2422 = -100;
        }
        if (this.field2421 != null) {
            this.field2421.field2418 = this.field2418;
            this.field2418.field2421 = this.field2421;
            this.field2421 = null;
            this.field2418 = null;
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIII)I")
    public static final int method800(int arg0, int arg1, int arg2, int arg3) {
        field2417++;
        if (arg0 != 3756) {
            field2415 = null;
        }
        return (4096 - arg3) * arg1 + arg2 * arg3 >> 12;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "([IIIIII)V")
    public static final void method801(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class54 var6 = class191.field3853[arg3][arg4][arg5];
        if (var6 == null) {
            return;
        }
        class56 var7 = var6.field1224;
        if (var7 != null) {
            int var8 = var7.field1399;
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
        class117 var10 = var6.field1212;
        if (var10 == null) {
            return;
        }
        int var11 = var10.field2603;
        int var12 = var10.field2614;
        int var13 = var10.field2615;
        int var14 = var10.field2598;
        int[] var15 = class165.field3342[var11];
        int[] var16 = class102.field2280[var12];
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

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(B)Z")
    public final boolean method802(byte arg0) {
        field2412++;
        if (this.field2421 == null) {
            return false;
        } else {
            if (arg0 != 107) {
                field2415 = null;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(I)V")
    public static void method803(int arg0) {
        field2415 = null;
        field2411 = null;
        int var1 = -122 / ((-arg0 - 45) / 62);
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lkd;ZII)V")
    public static final void method804(class102 arg0, boolean arg1, int arg2, int arg3) {
        field2414++;
        if (!arg1) {
            return;
        }
        if (arg0.field1610 == arg3 && arg3 != -1) {
            class52 var4 = class160.method1070((byte) -27, arg3);
            int var5 = var4.field1163;
            if (var5 == 1) {
                arg0.field1647 = arg2;
                arg0.field1608 = 0;
                arg0.field1654 = 0;
                arg0.field1641 = 0;
                class79.method595(class71.field1704 == arg0, arg0.field1664, arg0.field1654, arg1, arg0.field1676, var4);
            }
            if (var5 == 2) {
                arg0.field1641 = 0;
                return;
            }
        } else if (arg3 == -1 || arg0.field1610 == -1 || class160.method1070((byte) -126, arg3).field1180 >= class160.method1070((byte) -57, arg0.field1610).field1180) {
            arg0.field1654 = 0;
            arg0.field1610 = arg3;
            arg0.field1608 = 0;
            arg0.field1647 = arg2;
            arg0.field1641 = 0;
            arg0.field1632 = arg0.field1648;
            if (arg0.field1610 == -1) {
                return;
            }
            class79.method595(class71.field1704 == arg0, arg0.field1664, arg0.field1654, true, arg0.field1676, class160.method1070((byte) -44, arg0.field1610));
        }
    }
}
