import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fp")
public class class342 {

    @OriginalMember(owner = "client!fp", name = "c", descriptor = "Z")
    private boolean field4786 = true;

    @OriginalMember(owner = "client!fp", name = "n", descriptor = "I")
    private int field4797 = -1;

    @OriginalMember(owner = "client!fp", name = "q", descriptor = "I")
    private int field4800;

    @OriginalMember(owner = "client!fp", name = "e", descriptor = "I")
    private int field4788;

    @OriginalMember(owner = "client!fp", name = "m", descriptor = "[Lfw;")
    private class63[] field4796;

    @OriginalMember(owner = "client!fp", name = "l", descriptor = "I")
    private int field4795;

    @OriginalMember(owner = "client!fp", name = "j", descriptor = "I")
    private int field4793;

    @OriginalMember(owner = "client!fp", name = "k", descriptor = "Lfw;")
    private class63 field4794;

    @OriginalMember(owner = "client!fp", name = "t", descriptor = "[Lfw;")
    private class63[] field4803;

    @OriginalMember(owner = "client!fp", name = "r", descriptor = "I")
    public static int field4801 = 0;

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "I")
    public static int field4784;

    @OriginalMember(owner = "client!fp", name = "b", descriptor = "I")
    public static int field4785;

    @OriginalMember(owner = "client!fp", name = "d", descriptor = "I")
    public static int field4787;

    @OriginalMember(owner = "client!fp", name = "f", descriptor = "I")
    public static int field4789;

    @OriginalMember(owner = "client!fp", name = "g", descriptor = "I")
    private int field4790;

    @OriginalMember(owner = "client!fp", name = "h", descriptor = "I")
    public static int field4791;

    @OriginalMember(owner = "client!fp", name = "i", descriptor = "I")
    public static int field4792;

    @OriginalMember(owner = "client!fp", name = "o", descriptor = "I")
    public static int field4798;

    @OriginalMember(owner = "client!fp", name = "s", descriptor = "I")
    private int field4802;

    @OriginalMember(owner = "client!fp", name = "p", descriptor = "Lhh;")
    private class140 field4799;

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(I)V")
    public final void method2175(int arg0) {
        field4792++;
        if (arg0 != 0) {
            this.field4786 = true;
        }
        if (this.field4796 != null) {
            for (int var2 = 0; var2 < this.field4796.length; var2++) {
                this.field4796[var2].method390();
            }
        }
        this.field4799 = null;
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(ILjava/lang/String;I)V")
    public static final void method2176(int arg0, String arg1, int arg2) {
        field4785++;
        class778 var3 = class389.method2406(72, (long) arg0, 2);
        if (arg2 < 37) {
            field4801 = -104;
        }
        var3.method4274(118);
        var3.field10694 = arg1;
    }

    @OriginalMember(owner = "client!fp", name = "b", descriptor = "(I)V")
    public static final void method2177(int arg0) {
        field4789++;
        if (class740.field10028 != null) {
            class740.field10028 = null;
            class682.method3741(arg0, class626.field8480, class271.field3950, class588.field8032, class696.field9241);
        }
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(Lha;II)Z")
    public final boolean method2178(class66 arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            return true;
        }
        field4787++;
        if (this.field4797 != arg2) {
            this.field4797 = arg2;
            int var4 = class263.method1773(32051, arg2);
            if (var4 > 512) {
                var4 = 512;
            }
            if (var4 <= 0) {
                var4 = 1;
            }
            if (this.field4802 != var4) {
                this.field4802 = var4;
                this.field4799 = null;
            }
            if (this.field4796 != null) {
                this.field4790 = 0;
                int[] var5 = new int[this.field4796.length];
                for (int var6 = 0; var6 < this.field4796.length; var6++) {
                    class63 var7 = this.field4796[var6];
                    if (var7.method382(this.field4800, this.field4795, this.field4793, this.field4797)) {
                        var5[this.field4790] = var7.field812;
                        this.field4803[this.field4790++] = var7;
                    }
                }
                class16.method90(this.field4790 - 1, this.field4803, (byte) 113, var5, 0);
            }
            this.field4786 = true;
        }
        boolean var8 = false;
        if (this.field4786) {
            this.field4786 = false;
            for (int var9 = this.field4790 - 1; var9 >= 0; var9--) {
                boolean var10 = this.field4803[var9].method381(arg0, this.field4794);
                var8 |= var10;
                this.field4786 |= !var10;
            }
        }
        return var8;
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(ILha;IIIIBIII)V")
    public final void method2179(int arg0, class66 arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7, int arg8, int arg9) {
        int var11 = arg4 + arg8 & 0x3FFF;
        field4798++;
        if (this.field4788 == -1 || this.field4802 == 0) {
            arg1.method434(arg9, arg0, arg5, arg7, arg2, 0);
        } else {
            class577 var12 = class759.field10404.method1114(this.field4788, -23);
            if (this.field4799 == null && class759.field10404.method1112(29302, this.field4788)) {
                int[] var13 = var12.field7860 == 2 ? class759.field10404.method1111(122, 0.7F, this.field4802, this.field4788, this.field4802, false) : class759.field10404.method1113(-109, this.field4802, this.field4802, false, this.field4788, 0.7F);
                this.field4799 = arg1.method446(var13, -67, this.field4802, this.field4802, this.field4802, 0);
            }
            if (var12.field7860 == 2) {
                arg1.method434(arg9, arg0, arg5, arg7, arg2, 0);
            }
            if (this.field4799 != null) {
                int var14 = var12.field7860 == 2 ? 1 : 0;
                int var15 = arg3 * arg7 / -4096;
                int var16;
                for (var16 = arg7 * var11 / 4096 + (arg5 - arg7) / 2; var16 > arg7; var16 -= arg7) {
                }
                while (arg7 < var15) {
                    var15 -= arg7;
                }
                while (var16 < 0) {
                    var16 += arg7;
                }
                while (var15 < 0) {
                    var15 += arg7;
                }
                for (int var17 = var16 - arg7; var17 < arg5; var17 += arg7) {
                    for (int var18 = var15 - arg7; var18 < arg7; var18 += arg7) {
                        this.field4799.method976(arg9 + var17, arg0 + var18, arg7, arg7, 1, 0, var14);
                    }
                }
            }
        }
        for (int var19 = this.field4790 - 1; var19 >= 0; var19--) {
            this.field4803[var19].method383(arg1, arg9, arg0, arg5, arg7, arg3, var11);
        }
        int var20 = 112 / ((arg6 + 49) / 36);
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(ILuq;)V")
    public static final void method2180(int arg0, class172 arg1) {
        field4784++;
        class479.field6728 = arg1.method1173(false, "hitmarks");
        class582.field7908 = arg1.method1173(false, "hitbar_default");
        class208.field2673 = arg1.method1173(false, "timerbar_default");
        class220.field2860 = arg1.method1173(false, "headicons_pk");
        class670.field8980 = arg1.method1173(false, "headicons_prayer");
        class538.field7451 = arg1.method1173(false, "hint_headicons");
        class109.field1520 = arg1.method1173(false, "hint_mapmarkers");
        class785.field10788 = arg1.method1173(false, "mapflag");
        class303.field4245 = arg1.method1173(false, "cross");
        if (arg0 > -75) {
            field4801 = 45;
        }
        class171.field2241 = arg1.method1173(false, "mapdots");
        class357.field5201 = arg1.method1173(false, "scrollbar");
        class106.field1498 = arg1.method1173(false, "name_icons");
        class645.field8698 = arg1.method1173(false, "floorshadows");
        class328.field4661 = arg1.method1173(false, "compass");
        class512.field7135 = arg1.method1173(false, "otherlevel");
        class749.field10089 = arg1.method1173(false, "hint_mapedge");
    }

    @OriginalMember(owner = "client!fp", name = "<init>", descriptor = "(I[Lfw;IIII)V")
    public class342(int arg0, class63[] arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field4800 = arg3;
        this.field4788 = arg0;
        this.field4796 = arg1;
        this.field4795 = arg4;
        this.field4793 = arg5;
        if (arg1 == null) {
            this.field4794 = null;
            this.field4803 = null;
        } else {
            this.field4803 = new class63[arg1.length];
            this.field4794 = arg2 >= 0 ? arg1[arg2] : null;
        }
    }
}
