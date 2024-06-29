import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public class class128 extends class506 implements Runnable {

    @OriginalMember(owner = "client!al", name = "u", descriptor = "I")
    public int field1736 = -1;

    @OriginalMember(owner = "client!al", name = "m", descriptor = "Z")
    private boolean field1728 = true;

    @OriginalMember(owner = "client!al", name = "v", descriptor = "Lrm;")
    private class184 field1737;

    @OriginalMember(owner = "client!al", name = "q", descriptor = "Z")
    public static boolean field1732 = false;

    @OriginalMember(owner = "client!al", name = "n", descriptor = "Lss;")
    public static class213 field1729 = new class213("Your ignore list is full, max of 100.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados está cheia. O máx. é 100.");

    @OriginalMember(owner = "client!al", name = "w", descriptor = "Lsu;")
    public static class375 field1738 = new class375();

    @OriginalMember(owner = "client!al", name = "p", descriptor = "I")
    public static int field1731;

    @OriginalMember(owner = "client!al", name = "r", descriptor = "I")
    public static int field1733;

    @OriginalMember(owner = "client!al", name = "s", descriptor = "I")
    public static int field1734;

    @OriginalMember(owner = "client!al", name = "t", descriptor = "I")
    public static int field1735;

    @OriginalMember(owner = "client!al", name = "x", descriptor = "I")
    public static int field1739;

    @OriginalMember(owner = "client!al", name = "y", descriptor = "I")
    public static int field1740;

    @OriginalMember(owner = "client!al", name = "o", descriptor = "Lmn;")
    public static class162 field1730;

    @OriginalMember(owner = "client!al", name = "z", descriptor = "Lla;")
    public static class299 field1741;

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(III)I")
    public static final int method794(int arg0, int arg1, int arg2) {
        int var3 = -10 % ((arg1 - 38) / 45);
        field1731++;
        return arg0 == 1 || arg0 == 3 ? class48.field616[arg2 & 0x3] : class34.field355[arg2 & 0x3];
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(Lch;)V")
    public static final void method795(class169 arg0) {
        if (class368.field5683 >= 65535) {
            return;
        }
        class415 var1 = arg0.field2461;
        class60.field950[class368.field5683] = arg0;
        class310.field4846[class368.field5683] = false;
        class368.field5683++;
        int var2 = arg0.field2473;
        if (arg0.field2472) {
            var2 = 0;
        }
        int var3 = arg0.field2473;
        if (arg0.field2479) {
            var3 = class297.field4675 - 1;
        }
        for (int var4 = var2; var4 <= var3; var4++) {
            int var5 = 0;
            int var6 = var1.method2654(0) + class376.field5781 - var1.method2651(-115) >> class56.field908;
            if (var6 < 0) {
                var5 -= var6;
                var6 = 0;
            }
            int var7 = var1.method2654(0) + var1.method2651(-116) - class376.field5781 >> class56.field908;
            if (var7 >= class131.field1773) {
                var7 = class131.field1773 - 1;
            }
            for (int var8 = var6; var8 <= var7; var8++) {
                short var9 = arg0.field2463[var5++];
                int var10 = (var1.method2650(122) + class376.field5781 - var1.method2651(-111) >> class56.field908) + (var9 >>> 8);
                int var11 = (var9 & 0xFF) + var10 - 1;
                if (var10 < 0) {
                    var10 = 0;
                }
                if (var11 >= class252.field4075) {
                    var11 = class252.field4075 - 1;
                }
                for (int var12 = var10; var12 <= var11; var12++) {
                    long var13 = class311.field4882[var4][var12][var8];
                    if ((var13 & 0xFFFFL) == 0L) {
                        class311.field4882[var4][var12][var8] = var13 | (long) class368.field5683;
                    } else if ((var13 & 0xFFFF0000L) == 0L) {
                        class311.field4882[var4][var12][var8] = var13 | (long) class368.field5683 << 16;
                    } else if ((var13 & 0xFFFF00000000L) == 0L) {
                        class311.field4882[var4][var12][var8] = var13 | (long) class368.field5683 << 32;
                    } else if ((var13 & 0xFFFF000000000000L) == 0L) {
                        class311.field4882[var4][var12][var8] = var13 | (long) class368.field5683 << 48;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IIIIIII)V")
    public static final void method796(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg5 - arg2 >= class178.field2609 && class460.field7096 >= arg5 + arg2 && class462.field7105 <= (arg1 - arg2) && (arg1 + arg2) <= class222.field3750) {
            class307.method2071(arg3, arg5, arg4, arg6, (byte) -76, arg1, arg2);
        } else {
            class61.method452(arg5, arg4, 1, arg1, arg6, arg2, arg3);
        }
        if (arg0 == 0) {
            field1739++;
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(I)V")
    public final void method797(int arg0) {
        if (arg0 != 1) {
            method795(null);
        }
        (new Thread(this, "a")).start();
        field1740++;
    }

    @OriginalMember(owner = "client!al", name = "b", descriptor = "(B)V")
    public final void method798(byte arg0) {
        this.field1728 = false;
        field1734++;
        if (arg0 != -42) {
            method799(76, 60, 9, -103, -66, 18, 5, 86, 53);
        }
    }

    @OriginalMember(owner = "client!al", name = "run", descriptor = "()V")
    public final void run() {
        while (this.field1728) {
            this.field1737.method1153(-34, this);
        }
        field1735++;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method799(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1733++;
        if (arg7 != 3 || arg2 < 1 || arg6 < 1 || arg2 > class135.field1839 - 2 || class197.field3038 - 2 < arg6) {
            return;
        }
        int var9 = arg1;
        if (arg1 < 3 && class303.method2041(arg6, arg2, (byte) 81)) {
            var9 = arg1 + 1;
        }
        if (!class141.field1911.method1635(class452.field7013, -1) && !class402.method2585((byte) 126, var9, class254.field4119, arg6, arg2)) {
            return;
        }
        if (class217.field3699 == null) {
            return;
        }
        class196.field3035.method1687(arg6, arg1, arg2, class19.field198, arg3, class352.field5488[arg1], false);
        if (arg0 < 0) {
            return;
        }
        boolean var10 = class141.field1911.field6108;
        class141.field1911.field6108 = true;
        class196.field3035.method1682(class352.field5488[arg1], arg4, arg2, arg1, arg6, arg5, (byte) -57, var9, arg0, arg8, class19.field198);
        class141.field1911.field6108 = var10;
        return;
    }

    @OriginalMember(owner = "client!al", name = "b", descriptor = "(I)V")
    public static void method800(int arg0) {
        field1730 = null;
        field1729 = null;
        field1741 = null;
        if (arg0 != -2) {
            method796(-34, -52, 114, -92, 2, -10, -63);
        }
        field1738 = null;
    }

    @OriginalMember(owner = "client!al", name = "<init>", descriptor = "(Lrm;)V")
    public class128(class184 arg0) {
        this.field1737 = arg0;
    }
}
