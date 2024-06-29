import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class69 extends class98 {

    @OriginalMember(owner = "client!gg", name = "mc", descriptor = "I")
    public static int field910 = 0;

    @OriginalMember(owner = "client!gg", name = "rc", descriptor = "I")
    public static int field915 = -1;

    @OriginalMember(owner = "client!gg", name = "hc", descriptor = "Lom;")
    public static class156 field905 = new class156();

    @OriginalMember(owner = "client!gg", name = "sc", descriptor = "Ljava/lang/String;")
    public static String field916 = null;

    @OriginalMember(owner = "client!gg", name = "tc", descriptor = "F")
    public static float field917;

    @OriginalMember(owner = "client!gg", name = "E", descriptor = "I")
    public static int field904;

    @OriginalMember(owner = "client!gg", name = "ic", descriptor = "I")
    public static int field906;

    @OriginalMember(owner = "client!gg", name = "jc", descriptor = "I")
    public static int field907;

    @OriginalMember(owner = "client!gg", name = "kc", descriptor = "I")
    public static int field908;

    @OriginalMember(owner = "client!gg", name = "lc", descriptor = "I")
    public static int field909;

    @OriginalMember(owner = "client!gg", name = "nc", descriptor = "I")
    public static int field911;

    @OriginalMember(owner = "client!gg", name = "oc", descriptor = "I")
    public static int field912;

    @OriginalMember(owner = "client!gg", name = "pc", descriptor = "I")
    public static int field913;

    @OriginalMember(owner = "client!gg", name = "uc", descriptor = "Lf;")
    public static class329 field918;

    @OriginalMember(owner = "client!gg", name = "qc", descriptor = "Lqm;")
    public class58 field914;

    @OriginalMember(owner = "client!gg", name = "e", descriptor = "(I)Z", line = 4)
    public final boolean method455(int arg0) {
        field909++;
        if (this.field914 == null) {
            return false;
        } else {
            if (arg0 < 115) {
                method457((class210) null, -11, (class127[]) null);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!gg", name = "f", descriptor = "(I)V", line = 19)
    public static void method456(int arg0) {
        field916 = null;
        if (arg0 != 0) {
            method456(90);
        }
        field918 = null;
        field905 = null;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Llm;I[Lle;)V", line = 35)
    public static final void method457(class210 arg0, int arg1, class127[] arg2) {
        class234.field3510 = arg2;
        if (arg1 != -1) {
            return;
        }
        field912++;
        class286.field4324 = arg0;
        class301.field4601 = new boolean[class234.field3510.length];
        class211.field3208.method1113((byte) 113);
        int var3 = class286.field4324.method1448((byte) 10, "details");
        int[] var4 = class286.field4324.method1442(var3, (byte) 104);
        for (int var5 = 0; var5 < var4.length; var5++) {
            class211.field3208.method1108(class55.method363(new class263(class286.field4324.method1441(var4[var5], (byte) -44, var3)), (byte) -101), arg1 + 65281);
        }
    }

    @OriginalMember(owner = "client!gg", name = "finalize", descriptor = "()V", line = 62)
    protected final void finalize() {
        field908++;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(ILqm;)V", line = 71)
    public final void method458(int arg0, class58 arg1) {
        this.field914 = arg1;
        field913++;
        if (arg0 == 16 && this.field1472 != null) {
            this.field1472.method120();
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "()I", line = 92)
    public final int method115() {
        field906++;
        return this.field1522;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IIIIIIIIJILbh;)V", line = 102)
    public final void method111(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class18 arg10) {
        field907++;
        if (this.field914 == null) {
            return;
        }
        class272 var13 = this.field1549 != -1 && this.field1538 == 0 ? class72.method468(this.field1549, -125) : null;
        class272 var14 = this.field1507 == -1 || this.field1507 == this.method699(0).field3597 && var13 != null ? null : class72.method468(this.field1507, -127);
        class100 var15 = this.field914.method380((byte) 40, var14, this.field1487, this.field1555, this.field1485, this.field1496, this.field1486, this.field1480, var13, this.field1500);
        if (var15 == null) {
            return;
        }
        this.field1522 = var15.method115();
        class58 var16 = this.field914;
        if (var16.field756 != null) {
            var16 = var16.method390(75);
        }
        if (class130.field2019 && var16.field737) {
            class100 var17 = class115.method790(this.field914.field751, this.field914.field740, this.field1497, this.field914.field759, arg0, this.field1505, (byte) 119, this.field914.field767, this.field1566, this.field914.field788, var15, var14 == null ? var13 : var14, var14 == null ? this.field1486 : this.field1555, this.field1510);
            if (class117.field1817) {
                float var18 = class117.method820();
                float var19 = class117.method824();
                class117.method831();
                class117.method828(var18, var19 - 150.0F);
                var17.method111(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, this.field1472);
                class117.method829();
                class117.method828(var18, var19);
            } else {
                var17.method111(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, this.field1472);
            }
        }
        this.method695(-1, var15);
        class100 var20 = null;
        this.method702(arg0, var15, 83);
        if (this.field1490 != -1 && this.field1563 != -1) {
            class48 var21 = class8.method31(this.field1490, (byte) -126);
            var20 = var21.method331(this.field1529, true, this.field1563, this.field1550);
            if (var20 != null) {
                var20.method508(0, -this.field1561, 0);
                if (var21.field601) {
                    if (class84.field1246 != 0) {
                        var20.method489(class84.field1246);
                    }
                    if (class309.field4694 != 0) {
                        var20.method503(class309.field4694);
                    }
                    if (class195.field2945 != 0) {
                        var20.method508(0, class195.field2945, 0);
                    }
                }
            }
        }
        if (!class117.field1817) {
            if (var20 != null) {
                var15 = ((class77) var15).method523(var20);
            }
            if (this.field914.field759 == 1) {
                var15.field1592 = true;
            }
            var15.method111(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field1472);
            return;
        }
        if (this.field914.field759 == 1) {
            var15.field1592 = true;
        }
        var15.method111(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field1472);
        if (var20 != null) {
            if (this.field914.field759 == 1) {
                var20.field1592 = true;
            }
            var20.method111(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field1472);
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IIIII)V", line = 218)
    public final void method108(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field904++;
        if (this.field914 == null) {
            ;
        }
    }

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(IIII)V", line = 231)
    public static final void method459(int arg0, int arg1, int arg2, int arg3) {
        class221 var4 = class158.field2367[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class226 var5 = var4.field3368;
        if (var5 != null) {
            var5.field3434 = var5.field3434 * arg3 / 16;
            var5.field3438 = var5.field3438 * arg3 / 16;
        }
    }

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "(I)I", line = 250)
    public final int method460(int arg0) {
        if (arg0 != -32299) {
            return -21;
        }
        field911++;
        if (class237.field3555 != 0 && this.field914.field756 != null) {
            class58 var2 = this.field914.method390(-1);
            if (var2 != null && var2.field763 != -1) {
                return var2.field763;
            }
        }
        return this.field1546;
    }
}
