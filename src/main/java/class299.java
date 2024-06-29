import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gq")
public class class299 extends class390 {

    @OriginalMember(owner = "client!gq", name = "r", descriptor = "Lng;")
    public static class190 field4141 = new class190(64);

    @OriginalMember(owner = "client!gq", name = "s", descriptor = "I")
    public static int field4142 = -1;

    @OriginalMember(owner = "client!gq", name = "t", descriptor = "[B")
    public static byte[] field4143 = new byte[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "client!gq", name = "u", descriptor = "[I")
    public static int[] field4144 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!gq", name = "v", descriptor = "I")
    public static int field4145 = 0;

    @OriginalMember(owner = "client!gq", name = "l", descriptor = "I")
    public static int field4135;

    @OriginalMember(owner = "client!gq", name = "m", descriptor = "I")
    public static int field4136;

    @OriginalMember(owner = "client!gq", name = "n", descriptor = "I")
    public static int field4137;

    @OriginalMember(owner = "client!gq", name = "q", descriptor = "I")
    public static int field4140;

    @OriginalMember(owner = "client!gq", name = "o", descriptor = "Lgq;")
    public class299 field4138;

    @OriginalMember(owner = "client!gq", name = "p", descriptor = "Lgq;")
    public class299 field4139;

    @OriginalMember(owner = "client!gq", name = "b", descriptor = "(I)V")
    public final void method1928(int arg0) {
        field4137++;
        if (this.field4139 == null) {
            return;
        }
        this.field4139.field4138 = this.field4138;
        this.field4138.field4139 = this.field4139;
        if (arg0 >= 29) {
            this.field4138 = null;
            this.field4139 = null;
        }
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(II)V")
    public static final void method1929(int arg0, int arg1) {
        class142 var2 = class5.field79[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class142 var4 = class5.field79[var3][arg0][arg1] = class5.field79[var3 + 1][arg0][arg1];
            if (var4 != null) {
                var4.field2040--;
                for (class218 var5 = var4.field2043; var5 != null; var5 = var5.field2884) {
                    class430 var6 = var5.field2882;
                    if (var6.field6182 == arg0 && var6.field6186 == arg1) {
                        var6.field6198--;
                    }
                }
            }
        }
        if (class5.field79[0][arg0][arg1] == null) {
            class5.field79[0][arg0][arg1] = new class142(0, arg0, arg1);
            class5.field79[0][arg0][arg1].field2053 = 1;
        }
        class5.field79[0][arg0][arg1].field2041 = var2;
        class5.field79[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(IIIIII)V")
    public static final void method1930(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field4140++;
        int var6 = (arg1 - 32) * arg1 / arg2;
        if (var6 < 8) {
            var6 = 8;
        }
        class369.field5183[0].method867(arg0, arg3);
        int var7 = (arg1 - var6 - 32) * arg4 / (arg2 - arg1);
        class369.field5183[1].method867(arg0, arg1 + arg3 - 16);
        class408.field5920.method1762(arg3 + 16, arg1 + -32, arg0, class170.field2429, 16, -1);
        class408.field5920.method1762(arg3 + var7 + 16, var6, arg0, class450.field6550, 16, -1);
        class408.field5920.method1820(1, arg0, var6, arg3 + var7 + 16, class434.field6236);
        class408.field5920.method1820(1, arg0 + 1, var6, arg3 + var7 + 16, class434.field6236);
        class408.field5920.method1739(class434.field6236, 1, arg3 + var7 + 16, arg0, 16);
        class408.field5920.method1739(class434.field6236, 1, arg3 + var7 + 17, arg0, 16);
        int var8 = 28 % ((arg5 + 10) / 36);
        class408.field5920.method1820(1, arg0 + 15, var6, arg3 + var7 + 16, class5.field81);
        class408.field5920.method1820(1, arg0 + 14, var6 + -1, var7 + arg3 + 17, class5.field81);
        class408.field5920.method1739(class5.field81, 1, arg3 + var7 + var6 + 15, arg0, 16);
        class408.field5920.method1739(class5.field81, 1, arg3 + var7 - (-var6 + -14), arg0 + 1, 15);
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(IIILmg;Lmg;)V")
    public static final void method1931(int arg0, int arg1, int arg2, class81 arg3, class81 arg4) {
        if (class5.field79[arg0][arg1][arg2] == null) {
            class61.method403(arg0, arg1, arg2);
        }
        class5.field79[arg0][arg1][arg2].field2052 = arg3;
        class5.field79[arg0][arg1][arg2].field2035 = arg4;
    }

    @OriginalMember(owner = "client!gq", name = "b", descriptor = "(B)I")
    public static final int method1932(byte arg0) {
        field4135++;
        int var1 = -128 / ((arg0 + 17) / 62);
        return class14.field171;
    }

    @OriginalMember(owner = "client!gq", name = "c", descriptor = "(I)V")
    public static void method1933(int arg0) {
        field4143 = null;
        if (arg0 != 8) {
            method1931(-28, -107, -5, (class81) null, (class81) null);
        }
        field4141 = null;
        field4144 = null;
    }
}
