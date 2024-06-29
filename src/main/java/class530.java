import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!um")
public class class530 {

    @OriginalMember(owner = "client!um", name = "g", descriptor = "Ljn;")
    private class117 field7816 = new class117(256);

    @OriginalMember(owner = "client!um", name = "i", descriptor = "Lnh;")
    private class495 field7818;

    @OriginalMember(owner = "client!um", name = "d", descriptor = "Lfa;")
    private class615 field7813;

    @OriginalMember(owner = "client!um", name = "f", descriptor = "Lvh;")
    public static class125 field7815 = new class125(35, -1);

    @OriginalMember(owner = "client!um", name = "k", descriptor = "I")
    public static int field7820 = -1;

    @OriginalMember(owner = "client!um", name = "a", descriptor = "I")
    public static int field7810;

    @OriginalMember(owner = "client!um", name = "b", descriptor = "I")
    public static int field7811;

    @OriginalMember(owner = "client!um", name = "e", descriptor = "I")
    public static int field7814;

    @OriginalMember(owner = "client!um", name = "h", descriptor = "I")
    public static int field7817;

    @OriginalMember(owner = "client!um", name = "j", descriptor = "I")
    public static int field7819;

    @OriginalMember(owner = "client!um", name = "l", descriptor = "Lqp;")
    public static class441 field7821;

    @OriginalMember(owner = "client!um", name = "c", descriptor = "[Lf;")
    public static class257[] field7812;

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(Lvo;B)V")
    public static final void method3118(class345 arg0, byte arg1) {
        field7819++;
        class171.field2779 = arg0.method2083(2, "hitmarks");
        class551.field8075 = arg0.method2083(2, "hitbar_default");
        class460.field6625 = arg0.method2083(2, "timerbar_default");
        class460.field6626 = arg0.method2083(2, "headicons_pk");
        class367.field5095 = arg0.method2083(2, "headicons_prayer");
        class323.field4490 = arg0.method2083(2, "hint_headicons");
        class514.field7629 = arg0.method2083(2, "hint_mapmarkers");
        class536.field7873 = arg0.method2083(2, "mapflag");
        class487.field6952 = arg0.method2083(2, "cross");
        class662.field9303 = arg0.method2083(2, "mapdots");
        class294.field4107 = arg0.method2083(2, "scrollbar");
        class230.field3410 = arg0.method2083(2, "name_icons");
        if (arg1 < -111) {
            class163.field2675 = arg0.method2083(2, "floorshadows");
            class676.field9625 = arg0.method2083(2, "compass");
            class516.field7638 = arg0.method2083(2, "otherlevel");
            class81.field1238 = arg0.method2083(2, "hint_mapedge");
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(IZ)Ldca;")
    public final class612 method3119(int arg0, boolean arg1) {
        if (arg1) {
            this.method3122(-80);
        }
        field7817++;
        Object var3 = this.field7816.method941((long) arg0, 0);
        if (var3 != null) {
            return (class612) var3;
        } else if (this.field7813.method2363((byte) -115, arg0)) {
            class377 var4 = this.field7813.method2359(-125, arg0);
            int var5 = var4.field5222 ? 64 : this.field7818.field7286;
            class612 var7;
            if (var4.field5235 && this.field7818.method95()) {
                float[] var6 = this.field7813.method2361(false, 0.7F, (byte) 107, var5, var5, arg0);
                var7 = this.field7818.method2951(class297.field4191, var4.field5231 != 0, (byte) 50, var5, var5, var6);
            } else {
                int[] var8 = !var4.field5225 && class348.method2118(var4.field5217, -2) ? this.field7813.method2360(var5, true, arg0, (byte) 118, 0.7F, var5) : this.field7813.method2365(var5, arg0, false, -124, 0.7F, var5);
                var7 = this.field7818.method2928(false, var5, var4.field5231 != 0, var5, var8);
            }
            var7.method414(102, var4.field5234, var4.field5221);
            this.field7816.method949((long) arg0, true, var7);
            return var7;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "([BI[BIIBIII)V")
    public static final void method3120(byte[] arg0, int arg1, byte[] arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, int arg8) {
        field7814++;
        if (arg5 > -3) {
            return;
        }
        int var9 = -(arg4 >> 2);
        int var10 = -(arg4 & 0x3);
        for (int var11 = -arg3; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg1++;
                arg2[var10001] = (byte) (arg2[var10001] - arg0[arg7++]);
                int var14 = arg1++;
                arg2[var14] = (byte) (arg2[var14] - arg0[arg7++]);
                int var15 = arg1++;
                arg2[var15] = (byte) (arg2[var15] - arg0[arg7++]);
                int var16 = arg1++;
                arg2[var16] = (byte) (arg2[var16] - arg0[arg7++]);
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg1++;
                arg2[var10001] = (byte) (arg2[var10001] - arg0[arg7++]);
            }
            arg1 += arg8;
            arg7 += arg6;
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(B)V")
    public static void method3121(byte arg0) {
        field7812 = null;
        if (arg0 >= -23) {
            field7815 = null;
        }
        field7821 = null;
        field7815 = null;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(I)V")
    public final void method3122(int arg0) {
        this.field7816.method939(28093, 5);
        if (arg0 < 116) {
            this.method3119(35, false);
        }
        field7810++;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(Z)V")
    public final void method3123(boolean arg0) {
        if (!arg0) {
            this.field7816 = null;
        }
        this.field7816.method936(-100);
        field7811++;
    }

    @OriginalMember(owner = "client!um", name = "<init>", descriptor = "(Lnh;Lfa;)V")
    public class530(class495 arg0, class615 arg1) {
        this.field7818 = arg0;
        this.field7813 = arg1;
    }
}
