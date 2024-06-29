import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ns")
public class class277 {

    @OriginalMember(owner = "client!ns", name = "b", descriptor = "Lng;")
    private class226 field3991 = new class226(64);

    @OriginalMember(owner = "client!ns", name = "j", descriptor = "Lic;")
    private class491 field3999;

    @OriginalMember(owner = "client!ns", name = "g", descriptor = "I")
    public static int field3996 = -1;

    @OriginalMember(owner = "client!ns", name = "l", descriptor = "Llt;")
    public static class475 field4001 = new class475(" from your ignore list first.", " zuerst von deiner Ignorieren-Liste!", " de votre liste noire.", " da sua lista de ignorados primeiro.");

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "I")
    public static int field3990;

    @OriginalMember(owner = "client!ns", name = "c", descriptor = "I")
    public static int field3992;

    @OriginalMember(owner = "client!ns", name = "d", descriptor = "I")
    public static int field3993;

    @OriginalMember(owner = "client!ns", name = "f", descriptor = "I")
    public static int field3995;

    @OriginalMember(owner = "client!ns", name = "h", descriptor = "I")
    public static int field3997;

    @OriginalMember(owner = "client!ns", name = "i", descriptor = "I")
    public static int field3998;

    @OriginalMember(owner = "client!ns", name = "k", descriptor = "I")
    public static int field4000;

    @OriginalMember(owner = "client!ns", name = "e", descriptor = "Lic;")
    public static class491 field3994;

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(IIBIIII)V", line = 4)
    public static final void method1808(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        field4000++;
        class46.method290(true, arg3);
        int var7 = 0;
        int var8 = arg3 - arg5;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg3;
        int var10 = -arg3;
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        int var14 = -1;
        int[] var15 = class339.field4800[arg0];
        int var16 = arg6 - var8;
        class415.method2491(var16, arg6 - arg3, var15, arg1, -31541);
        int var17 = arg6 + var8;
        class415.method2491(var17, var16, var15, arg4, -31541);
        int var18 = -77 % ((35 - arg2) / 58);
        class415.method2491(arg3 + arg6, var17, var15, arg1, -31541);
        while (var7 < var9) {
            var13 += 2;
            var14 += 2;
            var10 += var13;
            var12 += var14;
            if (var12 >= 0 && var11 >= 1) {
                class159.field2352[var11] = var7;
                var11--;
                var12 -= var11 << 1;
            }
            var7++;
            if (var10 >= 0) {
                var9--;
                if (var8 > var9) {
                    int[] var19 = class339.field4800[arg0 + var9];
                    int[] var20 = class339.field4800[arg0 - var9];
                    int var21 = class159.field2352[var9];
                    int var22 = arg6 + var7;
                    int var23 = arg6 - var7;
                    int var24 = arg6 + var21;
                    int var25 = arg6 - var21;
                    class415.method2491(var25, var23, var19, arg1, -31541);
                    class415.method2491(var24, var25, var19, arg4, -31541);
                    class415.method2491(var22, var24, var19, arg1, -31541);
                    class415.method2491(var25, var23, var20, arg1, -31541);
                    class415.method2491(var24, var25, var20, arg4, -31541);
                    class415.method2491(var22, var24, var20, arg1, -31541);
                } else {
                    int[] var26 = class339.field4800[arg0 + var9];
                    int[] var27 = class339.field4800[arg0 - var9];
                    int var28 = arg6 + var7;
                    int var29 = arg6 - var7;
                    class415.method2491(var28, var29, var26, arg1, -31541);
                    class415.method2491(var28, var29, var27, arg1, -31541);
                }
                var10 -= var9 << 1;
            }
            int[] var30 = class339.field4800[arg0 + var7];
            int[] var31 = class339.field4800[arg0 - var7];
            int var32 = arg6 + var9;
            int var33 = arg6 - var9;
            if (var8 <= var7) {
                class415.method2491(var32, var33, var30, arg1, -31541);
                class415.method2491(var32, var33, var31, arg1, -31541);
            } else {
                int var34 = var11 < var7 ? class159.field2352[var7] : var11;
                int var35 = arg6 + var34;
                int var36 = arg6 - var34;
                class415.method2491(var36, var33, var30, arg1, -31541);
                class415.method2491(var35, var36, var30, arg4, -31541);
                class415.method2491(var32, var35, var30, arg1, -31541);
                class415.method2491(var36, var33, var31, arg1, -31541);
                class415.method2491(var35, var36, var31, arg4, -31541);
                class415.method2491(var32, var35, var31, arg1, -31541);
            }
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(B)V", line = 133)
    public static final void method1809(byte arg0) {
        if (arg0 != 91) {
            method1808(-29, 97, (byte) 101, 42, -97, -114, 39);
        }
        for (int var1 = 0; var1 < class491.field7281.length; var1++) {
            for (int var2 = 0; var2 < class491.field7281[var1].length; var2++) {
                class491.field7281[var1][var2] = class235.field3486;
            }
        }
        field3995++;
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(II)Ldi;", line = 161)
    public final class82 method1810(int arg0, int arg1) {
        field3992++;
        if (arg1 != 13787) {
            field4001 = null;
        }
        class226 var3 = this.field3991;
        class82 var4;
        synchronized (this.field3991) {
            var4 = (class82) this.field3991.method1536((long) arg0, 0);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field3999.method2945(32, arg0, true);
        class82 var6 = new class82();
        if (var5 != null) {
            var6.method487(118, new class209(var5));
        }
        class226 var7 = this.field3991;
        synchronized (this.field3991) {
            this.field3991.method1542(var6, (byte) 112, (long) arg0);
            return var6;
        }
    }

    @OriginalMember(owner = "client!ns", name = "b", descriptor = "(B)V", line = 195)
    public static final void method1811(byte arg0) {
        int var1 = 90 % ((52 - arg0) / 35);
        field3997++;
        class226 var2 = class263.field3855;
        synchronized (class263.field3855) {
            class263.field3855.method1539(-118);
        }
    }

    @OriginalMember(owner = "client!ns", name = "c", descriptor = "(B)V", line = 210)
    public static void method1812(byte arg0) {
        field4001 = null;
        field3994 = null;
        if (arg0 != -79) {
            method1812((byte) 68);
        }
    }

    @OriginalMember(owner = "client!ns", name = "d", descriptor = "(B)V", line = 223)
    public final void method1813(byte arg0) {
        if (arg0 != 11) {
            return;
        }
        field3993++;
        class226 var2 = this.field3991;
        synchronized (this.field3991) {
            this.field3991.method1539(-107);
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(I)V", line = 238)
    public final void method1814(int arg0) {
        field3990++;
        if (arg0 == -14540) {
            class226 var2 = this.field3991;
            synchronized (this.field3991) {
                this.field3991.method1540(0);
            }
        }
    }

    @OriginalMember(owner = "client!ns", name = "<init>", descriptor = "(Lai;ILic;)V", line = 273)
    public class277(class423 arg0, int arg1, class491 arg2) {
        this.field3999 = arg2;
        this.field3999.method2942(false, 32);
    }

    @OriginalMember(owner = "client!ns", name = "b", descriptor = "(II)V", line = 261)
    public final void method1815(int arg0, int arg1) {
        class226 var3 = this.field3991;
        synchronized (this.field3991) {
            this.field3991.method1534(0, arg0);
        }
        field3998++;
        if (arg1 < 112) {
            this.field3999 = null;
        }
    }
}
