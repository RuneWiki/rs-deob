import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class214 extends class690 {

    @OriginalMember(owner = "client!bj", name = "p", descriptor = "I")
    private int field2775;

    @OriginalMember(owner = "client!bj", name = "y", descriptor = "I")
    private int field2784;

    @OriginalMember(owner = "client!bj", name = "x", descriptor = "I")
    private int field2783;

    @OriginalMember(owner = "client!bj", name = "v", descriptor = "I")
    private int field2781;

    @OriginalMember(owner = "client!bj", name = "q", descriptor = "I")
    private int field2776;

    @OriginalMember(owner = "client!bj", name = "t", descriptor = "Lpea;")
    private class641 field2779;

    @OriginalMember(owner = "client!bj", name = "s", descriptor = "I")
    private int field2778;

    @OriginalMember(owner = "client!bj", name = "u", descriptor = "I")
    public static int field2780;

    @OriginalMember(owner = "client!bj", name = "w", descriptor = "I")
    public static int field2782;

    @OriginalMember(owner = "client!bj", name = "r", descriptor = "Lcn;")
    private class322 field2777;

    // $FF: synthetic field
    @OriginalMember(owner = "client!bj", name = "z", descriptor = "Ljava/lang/Class;")
    public static Class field2785;

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "(I)Lcn;")
    public final class322 method1328(int arg0) {
        int var2 = -82 / ((-arg0 - 43) / 54);
        field2782++;
        if (this.field2777 == null) {
            class479 var3 = this.field2779.field9731;
            class188.field2413[3] = this.field2783;
            class188.field2413[5] = this.field2781;
            class188.field2413[4] = this.field2778;
            class188.field2413[2] = this.field2775;
            class188.field2413[1] = this.field2776;
            class188.field2413[0] = this.field2784;
            boolean var4 = false;
            int var5 = 0;
            for (int var6 = 0; var6 < 6; var6++) {
                if (!var3.method1732(class188.field2413[var6], 107)) {
                    return null;
                }
                class568 var8 = var3.method1728(-114, class188.field2413[var6]);
                int var9 = var8.field7853 ? 64 : 128;
                if (var5 < var9) {
                    var5 = var9;
                }
                if (var8.field7852 > 0) {
                    var4 = true;
                }
            }
            for (int var7 = 0; var7 < 6; var7++) {
                class518.field7144[var7] = var3.method1731(false, 1.0F, 26409, var5, var5, class188.field2413[var7]);
            }
            this.field2777 = new class322(this.field2779, 6407, var5, var4, class518.field7144);
        }
        return this.field2777;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(Z)V")
    public static final void method1329(boolean arg0) {
        for (class571 var1 = (class571) class168.field2092.method374((byte) 72); var1 != null; var1 = (class571) class168.field2092.method372(-20740)) {
            if (class145.field1841 == null) {
                var1.method175(30604);
            } else if (var1.field7907 <= class430.field5984) {
                int var14 = class286.field3869[var1.field7901];
                if (var14 == 0) {
                    class142 var15 = class147.method997(var1.field7899, var1.field7914, var1.field7909);
                    if (var15 instanceof class46) {
                        class84.method473(var1.field7899, var1.field7914, var1.field7909);
                        class46 var16 = (class46) var15;
                        if (var16.field613 != null) {
                            class350.method2188(var1.field7899, var1.field7914, var1.field7909, var16.field613, null);
                        }
                    }
                } else if (var14 == 1) {
                    class249 var21 = class7.method44(var1.field7899, var1.field7914, var1.field7909);
                    if (var21 instanceof class202) {
                        class522.method2980(var1.field7899, var1.field7914, var1.field7909);
                        class202 var22 = (class202) var21;
                        if (var22.field2661 != null) {
                            class99.method541(var1.field7899, var1.field7914, var1.field7909, var22.field2661, null);
                        }
                    }
                } else if (var14 == 2) {
                    class293 var17 = class609.method3354(var1.field7899, var1.field7914, var1.field7909, field2785 == null ? (field2785 = method1330("dda")) : field2785);
                    if (var17 instanceof class613) {
                        class445.method2556(var1.field7899, var1.field7914, var1.field7909, field2785 == null ? (field2785 = method1330("dda")) : field2785);
                        class613 var18 = (class613) var17;
                        if (var18.field8366 != null) {
                            class621.method3396(var18.field8366, false);
                        }
                    }
                } else if (var14 == 3) {
                    class331 var19 = class618.method3391(var1.field7899, var1.field7914, var1.field7909);
                    if (var19 instanceof class304) {
                        class536.method3029(var1.field7899, var1.field7914, var1.field7909);
                        class304 var20 = (class304) var19;
                        if (var20.field4086 != null) {
                            class125.method764(var1.field7899, var1.field7914, var1.field7909, var20.field4086);
                        }
                    }
                }
                var1.method175(30604);
            } else if (class430.field5984 == var1.field7905) {
                int var2 = class286.field3869[var1.field7901];
                if (var2 == 0) {
                    class142 var3 = class147.method997(var1.field7899, var1.field7914, var1.field7909);
                    if (var3 instanceof class46) {
                        var1.method175(30604);
                    } else if (class589.method3287(var1.field7899, var1.field7914, var1.field7909) == null) {
                        class46 var4 = new class46(var1.field7901, var1.field7913, var1.field7902, var1.field7903, var1.field7904, var3);
                        class350.method2188(var1.field7899, var1.field7914, var1.field7909, var4, null);
                    } else {
                        var1.method175(30604);
                    }
                } else if (var2 == 1) {
                    class249 var5 = class7.method44(var1.field7899, var1.field7914, var1.field7909);
                    if (var5 instanceof class202) {
                        var1.method175(30604);
                    } else if (class361.method2226(var1.field7899, var1.field7914, var1.field7909) == null) {
                        class202 var6 = new class202(var1.field7901, var1.field7913, var1.field7902, var1.field7903, var1.field7904, var5);
                        class99.method541(var1.field7899, var1.field7914, var1.field7909, var6, null);
                    } else {
                        var1.method175(30604);
                    }
                } else if (var2 == 2) {
                    class293 var9 = class609.method3354(var1.field7899, var1.field7914, var1.field7909, field2785 == null ? (field2785 = method1330("dda")) : field2785);
                    if (var9 instanceof class613) {
                        var1.method175(30604);
                    } else {
                        class445.method2556(var1.field7899, var1.field7914, var1.field7909, field2785 == null ? (field2785 = method1330("dda")) : field2785);
                        class252 var10 = class578.field7980.method1746(var1.field7897, (byte) 96);
                        int var11;
                        int var12;
                        if (var1.field7913 == 1 || var1.field7913 == 3) {
                            var11 = var10.field3450;
                            var12 = var10.field3431;
                        } else {
                            var11 = var10.field3431;
                            var12 = var10.field3450;
                        }
                        class613 var13 = new class613(var1.field7901, var1.field7913, var1.field7899, var1.field7902, var1.field7903, var1.field7904, var1.field7914, var12 + var1.field7914 - 1, var1.field7909, var11 + var1.field7909 - 1, var9);
                        class621.method3396(var13, false);
                    }
                } else if (var2 == 3) {
                    class331 var7 = class618.method3391(var1.field7899, var1.field7914, var1.field7909);
                    if (var7 instanceof class304) {
                        var1.method175(30604);
                    } else {
                        class304 var8 = new class304(var1.field7902, var1.field7903, var1.field7904, var7);
                        class125.method764(var1.field7899, var1.field7914, var1.field7909, var8);
                    }
                }
            }
        }
        field2780++;
        if (!arg0) {
            ;
        }
    }

    @OriginalMember(owner = "client!bj", name = "<init>", descriptor = "(Lpea;IIIIII)V")
    public class214(class641 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field2775 = arg3;
        this.field2784 = arg1;
        this.field2783 = arg4;
        this.field2781 = arg6;
        this.field2776 = arg2;
        this.field2779 = arg0;
        this.field2778 = arg5;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1330(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
