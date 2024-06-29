import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class287 {

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "[I")
    private int[] field3965 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!jg", name = "f", descriptor = "Lhb;")
    public static class629 field3968 = new class629(10, 6);

    @OriginalMember(owner = "client!jg", name = "o", descriptor = "I")
    public static int field3977 = 0;

    @OriginalMember(owner = "client!jg", name = "t", descriptor = "I")
    public static int field3982 = 0;

    @OriginalMember(owner = "client!jg", name = "j", descriptor = "F")
    public static float field3972;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "I")
    public static int field3963;

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "I")
    public static int field3964;

    @OriginalMember(owner = "client!jg", name = "d", descriptor = "I")
    public static int field3966;

    @OriginalMember(owner = "client!jg", name = "e", descriptor = "I")
    public static int field3967;

    @OriginalMember(owner = "client!jg", name = "k", descriptor = "I")
    public static int field3973;

    @OriginalMember(owner = "client!jg", name = "l", descriptor = "I")
    public static int field3974;

    @OriginalMember(owner = "client!jg", name = "n", descriptor = "I")
    public static int field3976;

    @OriginalMember(owner = "client!jg", name = "r", descriptor = "I")
    public static int field3980;

    @OriginalMember(owner = "client!jg", name = "s", descriptor = "I")
    public static int field3981;

    @OriginalMember(owner = "client!jg", name = "p", descriptor = "Lxa;")
    public static class433 field3978;

    @OriginalMember(owner = "client!jg", name = "i", descriptor = "Led;")
    public class613 field3971;

    @OriginalMember(owner = "client!jg", name = "h", descriptor = "[I")
    private int[] field3970;

    @OriginalMember(owner = "client!jg", name = "g", descriptor = "[S")
    private short[] field3969;

    @OriginalMember(owner = "client!jg", name = "m", descriptor = "[S")
    private short[] field3975;

    @OriginalMember(owner = "client!jg", name = "q", descriptor = "[S")
    private short[] field3979;

    @OriginalMember(owner = "client!jg", name = "u", descriptor = "[S")
    private short[] field3983;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(I)V", line = 9)
    public static void method1856(int arg0) {
        field3968 = null;
        field3978 = null;
        if (arg0 != -1) {
            method1856(16);
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IIIIIII)I", line = 22)
    public static final int method1857(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3966++;
        int var7 = arg0 & 0x3;
        if ((arg5 & 0x1) == 1) {
            int var8 = arg6;
            arg6 = arg1;
            arg1 = var8;
        }
        if (var7 == 0) {
            return arg2;
        }
        if (arg3 <= 41) {
            method1856(121);
        }
        if (var7 == 1) {
            return -arg6 - (-(7 - arg4) - 1);
        } else if (var7 == 2) {
            return 1 + 7 - arg2 - arg1;
        } else {
            return arg4;
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(B)Z", line = 51)
    public final boolean method1858(byte arg0) {
        field3964++;
        if (this.field3970 == null) {
            return true;
        }
        if (arg0 > -119) {
            this.method1863(null, (byte) -60, -92);
        }
        boolean var2 = true;
        class203 var3 = this.field3971.field8918;
        synchronized (this.field3971.field8918) {
            for (int var4 = 0; var4 < this.field3970.length; var4++) {
                if (!this.field3971.field8918.method1284(this.field3970[var4], (byte) 52, 0)) {
                    var2 = false;
                }
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(I)Lor;", line = 87)
    public final class557 method1859(int arg0) {
        field3974++;
        class557[] var2 = new class557[5];
        int var3 = 0;
        class203 var4 = this.field3971.field8918;
        synchronized (this.field3971.field8918) {
            int var5 = 0;
            while (true) {
                if (var5 >= 5) {
                    break;
                }
                if (this.field3965[var5] != -1) {
                    var2[var3++] = class471.method2890(0, this.field3965[var5], class92.method583(arg0, -117), this.field3971.field8918);
                }
                var5++;
            }
        }
        for (int var6 = arg0; var6 < 5; var6++) {
            if (var2[var6] != null && var2[var6].field7946 < 13) {
                var2[var6].method3224(arg0 - 16503, 2);
            }
        }
        class557 var7 = new class557(var2, var3);
        if (this.field3979 != null) {
            for (int var8 = 0; var8 < this.field3979.length; var8++) {
                var7.method3227(this.field3979[var8], 65535, this.field3975[var8]);
            }
        }
        if (this.field3969 != null) {
            for (int var9 = 0; var9 < this.field3969.length; var9++) {
                var7.method3220(this.field3983[var9], this.field3969[var9], (byte) 76);
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "(I)Z", line = 155)
    public final boolean method1860(int arg0) {
        if (arg0 != 11040) {
            this.method1860(62);
        }
        field3963++;
        boolean var2 = true;
        class203 var3 = this.field3971.field8918;
        synchronized (this.field3971.field8918) {
            for (int var4 = 0; var4 < 5; var4++) {
                if (this.field3965[var4] != -1 && !this.field3971.field8918.method1284(this.field3965[var4], (byte) 52, 0)) {
                    var2 = false;
                }
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!jg", name = "d", descriptor = "(I)Lor;", line = 189)
    public final class557 method1861(int arg0) {
        field3981++;
        if (this.field3970 == null) {
            return null;
        }
        class557[] var2 = new class557[this.field3970.length];
        if (arg0 <= 62) {
            field3977 = 113;
        }
        class203 var3 = this.field3971.field8918;
        synchronized (this.field3971.field8918) {
            int var4 = 0;
            while (true) {
                if (this.field3970.length <= var4) {
                    break;
                }
                var2[var4] = class471.method2890(0, this.field3970[var4], -51, this.field3971.field8918);
                var4++;
            }
        }
        for (int var5 = 0; var5 < this.field3970.length; var5++) {
            if (var2[var5].field7946 < 13) {
                var2[var5].method3224(-16503, 2);
            }
        }
        class557 var6;
        if (var2.length == 1) {
            var6 = var2[0];
        } else {
            var6 = new class557(var2, var2.length);
        }
        if (var6 == null) {
            return null;
        }
        if (this.field3979 != null) {
            for (int var7 = 0; var7 < this.field3979.length; var7++) {
                var6.method3227(this.field3979[var7], 65535, this.field3975[var7]);
            }
        }
        if (this.field3969 != null) {
            for (int var8 = 0; var8 < this.field3969.length; var8++) {
                var6.method3220(this.field3983[var8], this.field3969[var8], (byte) 76);
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(BLrt;)V", line = 272)
    public final void method1862(byte arg0, class194 arg1) {
        field3967++;
        while (true) {
            int var3 = arg1.method1177(255);
            if (var3 == 0) {
                if (arg0 > -39) {
                    method1857(73, 32, -128, -93, 41, 81, -35);
                    return;
                } else {
                    return;
                }
            }
            this.method1863(arg1, (byte) -116, var3);
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(Lrt;BI)V", line = 296)
    private final void method1863(class194 arg0, byte arg1, int arg2) {
        if (arg1 != -116) {
            this.method1860(80);
        }
        if (arg2 == 1) {
            arg0.method1177(255);
        } else if (arg2 == 2) {
            int var4 = arg0.method1177(255);
            this.field3970 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3970[var5] = arg0.method1220(118);
            }
        } else if (arg2 != 3) {
            if (arg2 == 40) {
                int var6 = arg0.method1177(arg1 + 371);
                this.field3979 = new short[var6];
                this.field3975 = new short[var6];
                for (int var7 = 0; var7 < var6; var7++) {
                    this.field3979[var7] = (short) arg0.method1220(117);
                    this.field3975[var7] = (short) arg0.method1220(121);
                }
            } else if (arg2 == 41) {
                int var8 = arg0.method1177(arg1 ^ 0xFFFFFF73);
                this.field3983 = new short[var8];
                this.field3969 = new short[var8];
                for (int var9 = 0; var9 < var8; var9++) {
                    this.field3969[var9] = (short) arg0.method1220(class92.method583(arg1, 102));
                    this.field3983[var9] = (short) arg0.method1220(-114);
                }
            } else if (arg2 >= 60 && arg2 < 70) {
                this.field3965[arg2 - 60] = arg0.method1220(125);
            }
        }
        field3976++;
    }
}
