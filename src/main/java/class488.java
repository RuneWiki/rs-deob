import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class488 extends class499 implements class486 {

    @OriginalMember(owner = "client!cj", name = "B", descriptor = "I")
    private int field6773 = -1;

    @OriginalMember(owner = "client!cj", name = "L", descriptor = "I")
    private int field6782 = -1;

    @OriginalMember(owner = "client!cj", name = "F", descriptor = "I")
    private int field6776;

    @OriginalMember(owner = "client!cj", name = "K", descriptor = "I")
    public int field6781;

    @OriginalMember(owner = "client!cj", name = "A", descriptor = "I")
    public int field6772;

    @OriginalMember(owner = "client!cj", name = "I", descriptor = "Lbo;")
    private class511 field6779;

    @OriginalMember(owner = "client!cj", name = "E", descriptor = "I")
    private int field6775;

    @OriginalMember(owner = "client!cj", name = "C", descriptor = "I")
    private int field6774;

    @OriginalMember(owner = "client!cj", name = "H", descriptor = "Lff;")
    public static class9 field6778 = new class9(60, 1);

    @OriginalMember(owner = "client!cj", name = "y", descriptor = "I")
    public static int field6770;

    @OriginalMember(owner = "client!cj", name = "z", descriptor = "I")
    public static int field6771;

    @OriginalMember(owner = "client!cj", name = "G", descriptor = "I")
    public static int field6777;

    @OriginalMember(owner = "client!cj", name = "J", descriptor = "I")
    public static int field6780;

    @OriginalMember(owner = "client!cj", name = "M", descriptor = "I")
    public static int field6783;

    @OriginalMember(owner = "client!cj", name = "N", descriptor = "I")
    public static int field6784;

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "(Z)V", line = 4)
    public static final void method2800(boolean arg0) {
        class516.method3044(20042);
        field6784++;
        if (!arg0) {
            return;
        }
        class259.field3425 = null;
        class97.field1468 = null;
        class123.field1809 = null;
        class302.field3987 = null;
        class434.field5954 = null;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(BLqa;)V", line = 22)
    public static final void method2801(byte arg0, class162 arg1) {
        field6770++;
        int var2 = class232.field3126;
        int var3 = class462.field6398;
        int var4 = class381.field5207;
        int var5 = class522.field7714 - 3;
        byte var6 = 20;
        if (class162.field2372 == null || class174.field2530 == null) {
            if (class71.field1082.method2721(class458.field6303, (byte) 93) && class71.field1082.method2721(class46.field698, (byte) 122)) {
                class162.field2372 = arg1.method596(class134.method939(class71.field1082, class458.field6303, 0), true);
                class134 var7 = class134.method939(class71.field1082, class46.field698, 0);
                class174.field2530 = arg1.method596(var7, true);
                var7.method949();
                class461.field6371 = arg1.method596(var7, true);
            } else {
                arg1.method585(var2, var3, var4, var6, 255 - class316.field4142 << 24 | class391.field5307, 1);
            }
        }
        if (class162.field2372 != null && class174.field2530 != null) {
            int var8 = (var4 - (class174.field2530.method154() * 2)) / class162.field2372.method154();
            for (int var9 = 0; var9 < var8; var9++) {
                class162.field2372.method3109(var2 + class174.field2530.method154() + var9 * class162.field2372.method154(), var3);
            }
            class174.field2530.method3109(var2, var3);
            class461.field6371.method3109(var4 + var2 - class461.field6371.method154(), var3);
        }
        class219.field2961.method2816(class388.field5275.method1764(class489.field6789, false), true, var3 + 14, class229.field3089 | 0xFF000000, var2 + 3, -1);
        arg1.method585(var2, var3 + var6, var4, var5 - var6, -class316.field4142 + 255 << 24 | class391.field5307, 1);
        int var10 = class267.field3526.method1302(arg0 ^ 0xFFFFEEE6);
        int var11 = class267.field3526.method1297(true);
        int var12 = 0;
        for (class39 var13 = (class39) class415.field5733.method1672((byte) -104); var13 != null; var13 = (class39) class415.field5733.method1668(-1)) {
            int var30 = (class412.field5693 - var12 - 1) * 16 + var3 + var6 + 13;
            if (var2 < var10 && var2 + var4 > var10 && var30 - 13 < var11 && var30 + 4 > var11 && var13.field592) {
                arg1.method585(var2, var30 - 12, var4, 16, class389.field5279 | 255 - class454.field6158 << 24, 1);
            }
            var12++;
        }
        if ((class394.field5334 == null || class458.field6307 == null || class201.field2781 == null) && class71.field1082.method2721(class480.field6629, (byte) 97) && class71.field1082.method2721(class63.field975, (byte) 109) && class71.field1082.method2721(class61.field947, (byte) 110)) {
            class134 var14 = class134.method939(class71.field1082, class63.field975, 0);
            class458.field6307 = arg1.method596(var14, true);
            var14.method949();
            class304.field4003 = arg1.method596(var14, true);
            class394.field5334 = arg1.method596(class134.method939(class71.field1082, class480.field6629, 0), true);
            class134 var15 = class134.method939(class71.field1082, class61.field947, 0);
            class201.field2781 = arg1.method596(var15, true);
            var15.method949();
            class268.field3534 = arg1.method596(var15, true);
        }
        if (class394.field5334 != null && class458.field6307 != null && class201.field2781 != null) {
            int var16 = (var4 - (class201.field2781.method154() * 2)) / class394.field5334.method154();
            for (int var17 = 0; var17 < var16; var17++) {
                class394.field5334.method3109(class201.field2781.method154() + var2 + class394.field5334.method154() * var17, var5 + var3 + -class394.field5334.method161());
            }
            int var18 = (var5 - var6 - class201.field2781.method161()) / class458.field6307.method161();
            for (int var19 = 0; var19 < var18; var19++) {
                class458.field6307.method3109(var2, var19 * class458.field6307.method161() + var3 + var6);
                class304.field4003.method3109(var4 + var2 - class304.field4003.method154(), class458.field6307.method161() * var19 + var3 + var6);
            }
            class201.field2781.method3109(var2, var3 + var5 - class201.field2781.method161());
            class268.field3534.method3109(var4 + var2 - class201.field2781.method154(), var3 - (-var5 + class201.field2781.method161()));
        }
        if (arg0 != 16) {
            method2802((byte) -8);
        }
        int var20 = 0;
        for (class39 var21 = (class39) class415.field5733.method1672((byte) -92); var21 != null; var21 = (class39) class415.field5733.method1668(arg0 - 17)) {
            int var22 = (class412.field5693 - var20 - 1) * 16 + (var3 + var6) + 13;
            int var23 = class229.field3089 | 0xFF000000;
            if (var2 < var10 && var10 < var2 + var4 && var11 > var22 - 13 && var22 + 4 > var11 && var21.field592) {
                var23 = class387.field5267 | 0xFF000000;
            }
            int[] var24 = null;
            if (class54.method401(var21.field590, false)) {
                var24 = class127.field1852.method2390(40, (int) var21.field596).field6693;
            } else if (var21.field591 != -1) {
                var24 = class127.field1852.method2390(56, var21.field591).field6693;
            } else if (class195.method1246((byte) -106, var21.field590)) {
                class117 var27 = class291.field3822[(int) var21.field596];
                if (var27 != null) {
                    class506 var28 = var27.field1661;
                    if (var28.field6971 != null) {
                        var28 = var28.method2885(-66, class301.field3980);
                    }
                    if (var28 != null) {
                        var24 = var28.field6989;
                    }
                }
            } else if (class298.method1745(var21.field590, -27)) {
                Object var25 = null;
                class1 var26;
                if (var21.field590 == 1012) {
                    var26 = class402.field5388.method1994(-17294, (int) var21.field596);
                } else {
                    var26 = class402.field5388.method1994(-17294, (int) (var21.field596 >>> 32 & 0x7FFFFFFFL));
                }
                if (var26.field58 != null) {
                    var26 = var26.method17(class301.field3980, -97);
                }
                if (var26 != null) {
                    var24 = var26.field73;
                }
            }
            String var29 = class493.method2836(var21, (byte) -84);
            if (var24 != null) {
                var29 = var29 + class379.method2205(var24, 110);
            }
            class219.field2961.method2817(var2 + 3, var22, class9.field220, var23, 0, class294.field3843, arg0 - 16, var29);
            var20++;
            if (var21.field601) {
                class413.field5714.method3109(class173.field2525.method2455((byte) 120, var29) + var2 + 5, var22 + -12);
            }
        }
        class411.method2374(class381.field5207, class462.field6398, (byte) -32, class522.field7714, class232.field3126);
    }

    @OriginalMember(owner = "client!cj", name = "finalize", descriptor = "()V", line = 229)
    protected final void finalize() throws Throwable {
        field6777++;
        this.method2804(53);
        super.finalize();
    }

    @OriginalMember(owner = "client!cj", name = "<init>", descriptor = "(Lbo;III)V", line = 304)
    public class488(class511 arg0, int arg1, int arg2, int arg3) {
        this.field6776 = arg1;
        this.field6781 = arg3;
        this.field6772 = arg2;
        this.field6779 = arg0;
        OpenGL.glGenRenderbuffersEXT(1, class44.field646, 0);
        this.field6775 = class44.field646[0];
        OpenGL.glBindRenderbufferEXT(36161, this.field6775);
        OpenGL.glRenderbufferStorageEXT(36161, this.field6776, this.field6772, this.field6781);
        this.field6774 = this.field6772 * this.field6781 * this.field6779.method2981(113, this.field6776);
    }

    @OriginalMember(owner = "client!cj", name = "<init>", descriptor = "(Lbo;IIII)V", line = 319)
    public class488(class511 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field6779 = arg0;
        this.field6781 = arg3;
        this.field6772 = arg2;
        this.field6776 = arg1;
        OpenGL.glGenRenderbuffersEXT(1, class44.field646, 0);
        this.field6775 = class44.field646[0];
        OpenGL.glBindRenderbufferEXT(36161, this.field6775);
        OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg4, this.field6776, this.field6772, this.field6781);
        this.field6774 = this.field6781 * this.field6772 * this.field6779.method2981(8, this.field6776);
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(I)V", line = 241)
    public final void method1503(int arg0) {
        OpenGL.glFramebufferRenderbufferEXT(this.field6773, this.field6782, 36161, 0);
        field6780++;
        if (arg0 < 126) {
            this.field6781 = -102;
        }
        this.field6782 = -1;
        this.field6773 = -1;
    }

    @OriginalMember(owner = "client!cj", name = "d", descriptor = "(B)V", line = 263)
    public static void method2802(byte arg0) {
        if (arg0 > -100) {
            field6778 = null;
        }
        field6778 = null;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(III)V", line = 274)
    public final void method2803(int arg0, int arg1, int arg2) {
        field6783++;
        OpenGL.glFramebufferRenderbufferEXT(arg0, arg1, arg2, this.field6775);
        this.field6773 = arg0;
        this.field6782 = arg1;
    }

    @OriginalMember(owner = "client!cj", name = "f", descriptor = "(I)V", line = 284)
    public final void method2804(int arg0) {
        field6771++;
        if (this.field6775 > 0) {
            this.field6779.method3012(this.field6774, this.field6775, 1);
            this.field6775 = 0;
        }
        if (arg0 < 26) {
            method2801((byte) 110, null);
        }
    }
}
