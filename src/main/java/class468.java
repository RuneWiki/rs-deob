import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class468 {

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "I")
    private int field6941;

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "Lho;")
    public static class103 field6940 = new class103(76, 8);

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "I")
    public static int field6938;

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "I")
    public static int field6939;

    @OriginalMember(owner = "client!pb", name = "e", descriptor = "I")
    public static int field6942;

    @OriginalMember(owner = "client!pb", name = "f", descriptor = "I")
    public static int field6943;

    @OriginalMember(owner = "client!pb", name = "g", descriptor = "I")
    public static int field6944;

    @OriginalMember(owner = "client!pb", name = "h", descriptor = "I")
    public static int field6945;

    @OriginalMember(owner = "client!pb", name = "i", descriptor = "I")
    public static int field6946;

    @OriginalMember(owner = "client!pb", name = "j", descriptor = "Lsm;")
    public static class188 field6947;

    // $FF: synthetic field
    @OriginalMember(owner = "client!pb", name = "k", descriptor = "Ljava/lang/Class;")
    public static Class field6948;

    // $FF: synthetic method
    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method2860(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    static {
        new class305("I can't reach that!", "Da kommst du nicht hin.", "Je ne peux pas l'atteindre !", "Não consigo alcançar!");
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(II)V", line = 4)
    public static final void method2852(int arg0, int arg1) {
        if (~arg1 > arg0 || arg1 > 2) {
            arg1 = 0;
        }
        field6943++;
        class314.field4180 = arg1;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(B)V", line = 16)
    public static void method2853(byte arg0) {
        field6947 = null;
        if (arg0 != 95) {
            method2853((byte) 107);
        }
        field6940 = null;
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(II)V", line = 27)
    public final void method2854(int arg0, int arg1) {
        OpenGL.glNewList(this.field6941 + arg1, 4864);
        if (arg0 < -16) {
            field6942++;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)V", line = 41)
    public final void method2855(int arg0) {
        if (arg0 != 22228) {
            field6940 = null;
        }
        field6946++;
        OpenGL.glEndList();
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(CI)V", line = 53)
    public final void method2856(char arg0, int arg1) {
        OpenGL.glCallList(this.field6941 + arg0);
        if (arg1 != 1) {
            field6940 = null;
        }
        field6938++;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(BIILza;IIIII)V", line = 68)
    public static final void method2857(byte arg0, int arg1, int arg2, class287 arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field6945++;
        class448 var9 = (class448) class48.method279(arg2, arg1, arg7);
        if (var9 != null) {
            class70 var10 = class123.field1593.method2920(var9.method46(33), 19219);
            int var11 = var9.method47(-15774) & 0x3;
            int var12 = var9.method48((byte) -70);
            if (var10.field853 == -1) {
                int var13 = arg6;
                if (var10.field886 > 0) {
                    var13 = arg5;
                }
                if (var12 == 0 || var12 == 2) {
                    if (var11 == 0) {
                        arg3.method1720(4, arg4, -26028, var13, arg8);
                    } else if (var11 == 1) {
                        arg3.method1718(arg4, 4, arg8, var13, false);
                    } else if (var11 == 2) {
                        arg3.method1720(4, arg4 + 3, -26028, var13, arg8);
                    } else if (var11 == 3) {
                        arg3.method1718(arg4, 4, arg8 + 3, var13, false);
                    }
                }
                if (var12 == 3) {
                    if (var11 == 0) {
                        arg3.method1717(1, arg4, 1, var13, -22794, arg8);
                    } else if (var11 == 1) {
                        arg3.method1717(1, arg4 + 3, 1, var13, -22794, arg8);
                    } else if (var11 == 2) {
                        arg3.method1717(1, arg4 + 3, 1, var13, -22794, arg8 + 3);
                    } else if (var11 == 3) {
                        arg3.method1717(1, arg4, 1, var13, -22794, arg8 + 3);
                    }
                }
                if (var12 == 2) {
                    if (var11 == 0) {
                        arg3.method1718(arg4, 4, arg8, var13, false);
                    } else if (var11 == 1) {
                        arg3.method1720(4, arg4 + 3, -26028, var13, arg8);
                    } else if (var11 == 2) {
                        arg3.method1718(arg4, 4, arg8 + 3, var13, false);
                    } else if (var11 == 3) {
                        arg3.method1720(4, arg4, -26028, var13, arg8);
                    }
                }
            } else {
                class100.method613(var11, arg8, var10, true, arg3, arg4);
            }
        }
        class448 var14 = (class448) class365.method2172(arg2, arg1, arg7, field6948 == null ? (field6948 = method2860("mh")) : field6948);
        if (var14 != null) {
            class70 var15 = class123.field1593.method2920(var14.method46(43), 19219);
            int var16 = var14.method47(-15774) & 0x3;
            int var17 = var14.method48((byte) -70);
            if (var15.field853 != -1) {
                class100.method613(var16, arg8, var15, true, arg3, arg4);
            } else if (var17 == 9) {
                int var18 = -1118482;
                if (var15.field886 > 0) {
                    var18 = -1179648;
                }
                if (var16 == 0 || var16 == 2) {
                    arg3.method1722(-85, arg4 + 3, arg8 - -3, var18, arg4, arg8);
                } else {
                    arg3.method1722(-41, arg4 + 3, arg8, var18, arg4, arg8 + 3);
                }
            }
        }
        class448 var19 = (class448) class434.method2671(arg2, arg1, arg7);
        if (var19 != null) {
            class70 var20 = class123.field1593.method2920(var19.method46(-115), 19219);
            int var21 = var19.method47(-15774) & 0x3;
            if (var20.field853 != -1) {
                class100.method613(var21, arg8, var20, true, arg3, arg4);
            }
        }
        if (arg0 < 62) {
            method2852(28, 93);
        }
    }

    @OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(Lur;I)V", line = 208)
    public class468(class377 arg0, int arg1) {
        this.field6941 = OpenGL.glGenLists(arg1);
    }

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "(II)I", line = 227)
    public static final int method2858(int arg0, int arg1) {
        if (arg1 < 99) {
            method2853((byte) 62);
        }
        field6939++;
        return arg0 >>> 10;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(BI)Lkv;", line = 238)
    public static final class178 method2859(byte arg0, int arg1) {
        field6944++;
        class178 var2 = (class178) class17.field162.method3032(3589, (long) arg1);
        int var3 = -49 / ((arg0 + 52) / 50);
        if (var2 != null) {
            return var2;
        }
        byte[] var4 = class363.field4960.method2130(1, arg1, -87);
        class178 var5 = new class178();
        var5.field2296 = arg1;
        if (var4 != null) {
            var5.method1034(new class396(var4), (byte) -5);
        }
        var5.method1033((byte) -114);
        if (var5.field2298 == 2 && class342.field4572.method295((long) arg1, -86) == null) {
            class342.field4572.method291((long) arg1, new class488(class176.field2276), -107);
            class5.field46[class176.field2276++] = var5;
        }
        class17.field162.method3046((long) arg1, var5, 1);
        return var5;
    }
}
