import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class175 extends class152 {

    @OriginalMember(owner = "client!mf", name = "S", descriptor = "I")
    private int field3088 = 4096;

    @OriginalMember(owner = "client!mf", name = "V", descriptor = "I")
    private int field3091 = 0;

    @OriginalMember(owner = "client!mf", name = "W", descriptor = "Lce;")
    public static class126 field3092 = class206.method1445(-7923, "::serverjs5drop");

    @OriginalMember(owner = "client!mf", name = "R", descriptor = "[I")
    public static int[] field3087 = new int[100];

    @OriginalMember(owner = "client!mf", name = "ab", descriptor = "[I")
    public static int[] field3096 = new int[] { 6, 0, 0, 0, 0, 0, 0, 1, 6, 0, 0, 3, 14, 6, 0, 2, 3, 0, 0, 0, 0, 0, 0, 0, -2, -1, 0, 0, 1, 0, -1, 2, 0, 0, -2, 5, 0, -2, 3, -2, 5, 14, 15, 8, 0, 0, 10, 0, 10, 0, 24, -1, 0, 6, 0, 0, 1, 10, 0, -2, 0, 8, 0, 15, 0, 0, 0, 4, 0, 0, 0, 0, 0, 8, 2, 0, 0, 0, -1, 5, 6, 0, 0, 0, 0, 0, 0, 5, 7, 0, 4, 0, 7, 0, 0, 0, 0, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 10, 0, 0, 6, 8, 0, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6, 9, 0, -1, 0, 0, 0, 0, 0, -1, 0, 5, 0, 0, 6, 0, 0, 0, 0, 0, 0, -1, -2, 0, 0, 0, 9, 3, 4, 0, 0, 0, 0, -2, -1, -2, 1, 0, 0, 20, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, -2, -2, 5, 0, -1, -1, 0, 0, 0, -1, 0, 0, 0, 0, 12, 10, 0, 0, 8, 0, 0, 0, 0, 0, 0, 7, 0, -1, 0, 0, 4, 0, -1, 1, 0, 0, 5, 2, 0, 0, 0, 0, 0, -2, 0, 0, 0, -1, 0, 2, 8, -2, 0, 0, 0, 0, 0, 0, 0, 0, 12, 2, 0, 0, -2, 0, 6, 0, 6, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!mf", name = "cb", descriptor = "I")
    public static int field3098 = 0;

    @OriginalMember(owner = "client!mf", name = "T", descriptor = "I")
    public static int field3089;

    @OriginalMember(owner = "client!mf", name = "U", descriptor = "I")
    public static int field3090;

    @OriginalMember(owner = "client!mf", name = "X", descriptor = "I")
    public static int field3093;

    @OriginalMember(owner = "client!mf", name = "Y", descriptor = "I")
    public static int field3094;

    @OriginalMember(owner = "client!mf", name = "Z", descriptor = "I")
    public static int field3095;

    @OriginalMember(owner = "client!mf", name = "bb", descriptor = "I")
    public static int field3097;

    @OriginalMember(owner = "client!mf", name = "<init>", descriptor = "()V", line = 4)
    public class175() {
        super(1, true);
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(ZLjava/awt/Component;IILvh;)Ltc;", line = 14)
    public static final class144 method1268(boolean arg0, Component arg1, int arg2, int arg3, class147 arg4) {
        field3090++;
        if (class102.field1633 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class144 var5 = (class144) Class.forName("wb").getDeclaredConstructor().newInstance();
                var5.field2637 = arg3;
                var5.field2629 = new int[(class142.field2572 ? 2 : 1) * 256];
                var5.method311(arg1);
                var5.field2634 = (arg3 & 0xFFFFFC00) + 1024;
                if (var5.field2634 > 16384) {
                    var5.field2634 = 16384;
                }
                var5.method315(var5.field2634);
                if (class192.field3283 > 0 && class68.field1123 == null) {
                    class68.field1123 = new class172();
                    class68.field1123.field3051 = arg4;
                    arg4.method1105(8, class68.field1123, class192.field3283);
                }
                if (class68.field1123 != null) {
                    if (class68.field1123.field3038[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    class68.field1123.field3038[arg2] = var5;
                }
                return var5;
            } catch (Throwable var10) {
                try {
                    class49 var7 = new class49(arg4, arg2);
                    var7.field2637 = arg3;
                    var7.field2629 = new int[(class142.field2572 ? 2 : 1) * 256];
                    var7.method311(arg1);
                    var7.field2634 = 16384;
                    var7.method315(var7.field2634);
                    if (class192.field3283 > 0 && class68.field1123 == null) {
                        class68.field1123 = new class172();
                        class68.field1123.field3051 = arg4;
                        arg4.method1105(8, class68.field1123, class192.field3283);
                    }
                    if (arg0) {
                        field3096 = (int[]) null;
                    }
                    if (class68.field1123 != null) {
                        if (class68.field1123.field3038[arg2] != null) {
                            throw new IllegalArgumentException();
                        }
                        class68.field1123.field3038[arg2] = var7;
                    }
                    return var7;
                } catch (Throwable var9) {
                    return new class144();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(ZI)[I", line = 106)
    public final int[] method6(boolean arg0, int arg1) {
        if (!arg0) {
            return (int[]) null;
        }
        field3093++;
        int[] var3 = this.field2776.method1799((byte) 107, arg1);
        if (this.field2776.field4516) {
            int[] var4 = this.method1132(arg1, -101, 0);
            for (int var5 = 0; var5 < class244.field4133; var5++) {
                int var6 = var4[var5];
                var3[var5] = this.field3091 <= var6 && var6 <= this.field3088 ? 4096 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IILbb;)V", line = 139)
    public final void method5(int arg0, int arg1, class134 arg2) {
        if (arg0 != 8) {
            field3092 = (class126) null;
        }
        field3097++;
        if (arg1 == 0) {
            this.field3091 = arg2.method942(true);
        } else if (arg1 == 1) {
            this.field3088 = arg2.method942(true);
        }
    }

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(Z)I", line = 175)
    public static final int method1269(boolean arg0) {
        field3089++;
        if (arg0) {
            method1268(false, (Component) null, 82, 4, (class147) null);
        }
        return 16;
    }

    @OriginalMember(owner = "client!mf", name = "f", descriptor = "(I)V", line = 187)
    public static final void method1270(int arg0) {
        class288 var1 = (class288) class63.field1037.method898((byte) -52);
        field3095++;
        if (arg0 != -1) {
            field3098 = 17;
        }
        while (var1 != null) {
            class238 var2 = var1.field4780;
            if (class131.field2250 != var2.field4020 || var2.field4018) {
                var1.method499((byte) 64);
            } else if (class249.field4174 >= var2.field4005) {
                var2.method1641(7, class303.field5038);
                if (var2.field4018) {
                    var1.method499((byte) 64);
                } else {
                    class199.method1411(var2.field4020, var2.field4022, var2.field4023, var2.field4021, 60, var2, 0, -1L, false);
                }
            }
            var1 = (class288) class63.field1037.method893((byte) -111);
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "()V", line = 229)
    public static final void method1271() {
        class306.field5134 = 0;
        label194: for (int var0 = 0; var0 < class50.field764; var0++) {
            class76 var1 = class39.field623[var0];
            if (class30.field418 != null) {
                for (int var2 = 0; var2 < class30.field418.length; var2++) {
                    if (class30.field418[var2] != -1000000 && (var1.field1235 <= class30.field418[var2] || var1.field1232 <= class30.field418[var2]) && (var1.field1244 <= class286.field4757[var2] || var1.field1229 <= class286.field4757[var2]) && (var1.field1244 >= class89.field1397[var2] || var1.field1229 >= class89.field1397[var2]) && (var1.field1233 <= class31.field427[var2] || var1.field1231 <= class31.field427[var2]) && (var1.field1233 >= class241.field4079[var2] || var1.field1231 >= class241.field4079[var2])) {
                        continue label194;
                    }
                }
            }
            if (var1.field1242 == 1) {
                int var3 = var1.field1246 + class31.field438 - field3094;
                if (var3 >= 0 && var3 <= class31.field438 + class31.field438) {
                    int var4 = var1.field1239 + class31.field438 - class169.field3016;
                    if (var4 < 0) {
                        var4 = 0;
                    }
                    int var5 = var1.field1234 + class31.field438 - class169.field3016;
                    if (var5 > class31.field438 + class31.field438) {
                        var5 = class31.field438 + class31.field438;
                    }
                    boolean var6 = false;
                    while (var4 <= var5) {
                        if (class29.field411[var3][var4++]) {
                            var6 = true;
                            break;
                        }
                    }
                    if (var6) {
                        int var7 = class39.field625 - var1.field1244;
                        if (var7 > 32) {
                            var1.field1240 = 1;
                        } else {
                            if (var7 >= -32) {
                                continue;
                            }
                            var1.field1240 = 2;
                            var7 = -var7;
                        }
                        var1.field1225 = (var1.field1233 - class318.field5452 << 8) / var7;
                        var1.field1230 = (var1.field1231 - class318.field5452 << 8) / var7;
                        var1.field1227 = (var1.field1235 - class189.field3241 << 8) / var7;
                        var1.field1237 = (var1.field1232 - class189.field3241 << 8) / var7;
                        class286.field4749[class306.field5134++] = var1;
                    }
                }
            } else if (var1.field1242 == 2) {
                int var8 = var1.field1239 + class31.field438 - class169.field3016;
                if (var8 >= 0 && var8 <= class31.field438 + class31.field438) {
                    int var9 = var1.field1246 + class31.field438 - field3094;
                    if (var9 < 0) {
                        var9 = 0;
                    }
                    int var10 = var1.field1226 + class31.field438 - field3094;
                    if (var10 > class31.field438 + class31.field438) {
                        var10 = class31.field438 + class31.field438;
                    }
                    boolean var11 = false;
                    while (var9 <= var10) {
                        if (class29.field411[var9++][var8]) {
                            var11 = true;
                            break;
                        }
                    }
                    if (var11) {
                        int var12 = class318.field5452 - var1.field1233;
                        if (var12 > 32) {
                            var1.field1240 = 3;
                        } else {
                            if (var12 >= -32) {
                                continue;
                            }
                            var1.field1240 = 4;
                            var12 = -var12;
                        }
                        var1.field1228 = (var1.field1244 - class39.field625 << 8) / var12;
                        var1.field1222 = (var1.field1229 - class39.field625 << 8) / var12;
                        var1.field1227 = (var1.field1235 - class189.field3241 << 8) / var12;
                        var1.field1237 = (var1.field1232 - class189.field3241 << 8) / var12;
                        class286.field4749[class306.field5134++] = var1;
                    }
                }
            } else if (var1.field1242 == 4) {
                int var13 = var1.field1235 - class189.field3241;
                if (var13 > 128) {
                    int var14 = var1.field1239 + class31.field438 - class169.field3016;
                    if (var14 < 0) {
                        var14 = 0;
                    }
                    int var15 = var1.field1234 + class31.field438 - class169.field3016;
                    if (var15 > class31.field438 + class31.field438) {
                        var15 = class31.field438 + class31.field438;
                    }
                    if (var14 <= var15) {
                        int var16 = var1.field1246 + class31.field438 - field3094;
                        if (var16 < 0) {
                            var16 = 0;
                        }
                        int var17 = var1.field1226 + class31.field438 - field3094;
                        if (var17 > class31.field438 + class31.field438) {
                            var17 = class31.field438 + class31.field438;
                        }
                        boolean var18 = false;
                        label166: for (int var19 = var16; var19 <= var17; var19++) {
                            for (int var20 = var14; var20 <= var15; var20++) {
                                if (class29.field411[var19][var20]) {
                                    var18 = true;
                                    break label166;
                                }
                            }
                        }
                        if (var18) {
                            var1.field1240 = 5;
                            var1.field1228 = (var1.field1244 - class39.field625 << 8) / var13;
                            var1.field1222 = (var1.field1229 - class39.field625 << 8) / var13;
                            var1.field1225 = (var1.field1233 - class318.field5452 << 8) / var13;
                            var1.field1230 = (var1.field1231 - class318.field5452 << 8) / var13;
                            class286.field4749[class306.field5134++] = var1;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mf", name = "g", descriptor = "(I)V", line = 454)
    public static void method1272(int arg0) {
        if (arg0 < 113) {
            field3094 = 53;
        }
        field3096 = null;
        field3087 = null;
        field3092 = null;
    }
}
