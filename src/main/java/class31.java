import java.awt.Canvas;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class31 {

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "[I")
    public static int[] field426 = new int[2500];

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "Lvq;")
    public static class24 field425 = new class24(68, 28);

    @OriginalMember(owner = "client!ff", name = "g", descriptor = "Lmq;")
    public static class33 field430 = new class33(8);

    @OriginalMember(owner = "client!ff", name = "j", descriptor = "I")
    public static int field433 = 0;

    @OriginalMember(owner = "client!ff", name = "k", descriptor = "Lvq;")
    public static class24 field434 = new class24(51, 2);

    @OriginalMember(owner = "client!ff", name = "l", descriptor = "I")
    public static int field435 = 0;

    @OriginalMember(owner = "client!ff", name = "m", descriptor = "I")
    public static int field436 = -50;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "I")
    public static int field424;

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "I")
    public static int field427;

    @OriginalMember(owner = "client!ff", name = "e", descriptor = "I")
    public static int field428;

    @OriginalMember(owner = "client!ff", name = "f", descriptor = "I")
    public static int field429;

    @OriginalMember(owner = "client!ff", name = "h", descriptor = "I")
    public static int field431;

    @OriginalMember(owner = "client!ff", name = "i", descriptor = "Ljava/awt/Image;")
    public static Image field432;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(I)V", line = 10)
    public static void method305(int arg0) {
        field434 = null;
        int var1 = -29 % ((-arg0 - 33) / 60);
        field432 = null;
        field430 = null;
        field426 = null;
        field425 = null;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(ILjava/awt/Canvas;)Lue;", line = 24)
    public static final class136 method306(int arg0, Canvas arg1) {
        field424++;
        if (arg0 != 0) {
            field425 = null;
        }
        try {
            Class var2 = Class.forName("nq");
            class136 var3 = (class136) var2.getDeclaredConstructor().newInstance();
            var3.method858(arg1, 16628);
            return var3;
        } catch (Throwable var5) {
            class295 var4 = new class295();
            var4.method858(arg1, 16628);
            return var4;
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lva;Z)V", line = 47)
    public static final void method307(class58 arg0, boolean arg1) {
        field428++;
        arg0.field766 = arg1;
        if (arg0.field706 != -1) {
            class196 var2 = class83.method556(arg0.field706, 102);
            if (var2 == null || var2.field2784 == null) {
                arg0.field706 = -1;
                arg0.field719 = false;
            } else {
                label299: {
                    arg0.field746++;
                    if (arg0.field723 < var2.field2784.length && arg0.field746 > var2.field2763[arg0.field723]) {
                        arg0.field723++;
                        arg0.field772++;
                        arg0.field746 = 1;
                        class446.method2739(var2, class187.field2619 == arg0, arg0.field4960, arg0.field723, -49, arg0.field4954, arg0.field4951);
                    }
                    if (var2.field2784.length <= arg0.field723) {
                        arg0.field746 = 0;
                        arg0.field723 = 0;
                        if (arg0.field719) {
                            arg0.field706 = arg0.method450(0).method2747(9999);
                            if (arg0.field706 == -1) {
                                arg0.field719 = false;
                                break label299;
                            }
                            var2 = class83.method556(arg0.field706, 64);
                        }
                        class446.method2739(var2, class187.field2619 == arg0, arg0.field4960, arg0.field723, -49, arg0.field4954, arg0.field4951);
                    }
                    arg0.field772 = arg0.field723 + 1;
                    if (var2.field2784.length <= arg0.field772) {
                        arg0.field772 = 0;
                    }
                }
            }
        }
        if (arg0.field781 != -1 && class388.field5665 >= arg0.field753) {
            class302 var3 = class332.method2169(256, arg0.field781);
            int var4 = var3.field4422;
            if (var4 == -1) {
                arg0.field781 = -1;
            } else {
                label301: {
                    class196 var5 = class83.method556(var4, 98);
                    if (var3.field4424) {
                        if (var5.field2771 == 3) {
                            if (arg0.field785 > 0 && class388.field5665 >= arg0.field760 && class388.field5665 > arg0.field743) {
                                arg0.field781 = -1;
                                break label301;
                            }
                        } else if (var5.field2771 == 1 && arg0.field785 > 0 && class388.field5665 >= arg0.field760 && class388.field5665 > arg0.field743) {
                            arg0.field753 = class388.field5665 + 1;
                            break label301;
                        }
                    }
                    if (var5 == null || var5.field2784 == null) {
                        arg0.field781 = -1;
                    } else {
                        if (arg0.field759 < 0) {
                            arg0.field759 = 0;
                            class446.method2739(var5, class187.field2619 == arg0, arg0.field4960, 0, -49, arg0.field4954, arg0.field4951);
                        }
                        arg0.field724++;
                        if (var5.field2784.length > arg0.field759 && arg0.field724 > var5.field2763[arg0.field759]) {
                            arg0.field724 = 1;
                            arg0.field759++;
                            class446.method2739(var5, class187.field2619 == arg0, arg0.field4960, arg0.field759, -49, arg0.field4954, arg0.field4951);
                        }
                        if (var5.field2784.length <= arg0.field759) {
                            if (var3.field4424) {
                                arg0.field759 -= var5.field2761;
                                arg0.field765++;
                                if (var5.field2764 <= arg0.field765) {
                                    arg0.field781 = -1;
                                } else if (arg0.field759 >= 0 && var5.field2784.length > arg0.field759) {
                                    class446.method2739(var5, class187.field2619 == arg0, arg0.field4960, arg0.field759, -49, arg0.field4954, arg0.field4951);
                                } else {
                                    arg0.field781 = -1;
                                }
                            } else {
                                arg0.field781 = -1;
                            }
                        }
                        arg0.field764 = arg0.field759 + 1;
                        if (arg0.field764 >= var5.field2784.length) {
                            if (var3.field4424) {
                                arg0.field764 -= var5.field2761;
                                if (arg0.field765 + 1 >= var5.field2764) {
                                    arg0.field764 = -1;
                                } else if (arg0.field764 < 0 || arg0.field764 >= var5.field2784.length) {
                                    arg0.field764 = -1;
                                }
                            } else {
                                arg0.field764 = -1;
                            }
                        }
                    }
                }
            }
        }
        if (arg0.field751 != -1 && arg0.field737 <= 1) {
            class196 var6 = class83.method556(arg0.field751, 113);
            if (var6.field2771 == 3) {
                if (arg0.field785 > 0 && arg0.field760 <= class388.field5665 && arg0.field743 < class388.field5665) {
                    arg0.field751 = -1;
                }
            } else if (var6.field2771 == 1 && arg0.field785 > 0 && arg0.field760 <= class388.field5665 && arg0.field743 < class388.field5665) {
                arg0.field737 = 2;
            }
        }
        if (arg0.field751 != -1 && arg0.field737 == 0) {
            class196 var7 = class83.method556(arg0.field751, 73);
            if (var7 == null || var7.field2784 == null) {
                arg0.field751 = -1;
            } else {
                arg0.field756++;
                if (var7.field2784.length > arg0.field717 && var7.field2763[arg0.field717] < arg0.field756) {
                    arg0.field756 = 1;
                    arg0.field717++;
                    class446.method2739(var7, class187.field2619 == arg0, arg0.field4960, arg0.field717, -49, arg0.field4954, arg0.field4951);
                }
                if (arg0.field717 >= var7.field2784.length) {
                    arg0.field763++;
                    arg0.field717 -= var7.field2761;
                    if (var7.field2764 <= arg0.field763) {
                        arg0.field751 = -1;
                    } else if (arg0.field717 >= 0 && var7.field2784.length > arg0.field717) {
                        class446.method2739(var7, class187.field2619 == arg0, arg0.field4960, arg0.field717, -49, arg0.field4954, arg0.field4951);
                    } else {
                        arg0.field751 = -1;
                    }
                }
                arg0.field780 = arg0.field717 + 1;
                if (arg0.field780 >= var7.field2784.length) {
                    arg0.field780 -= var7.field2761;
                    if ((arg0.field763 + 1) >= var7.field2764) {
                        arg0.field780 = -1;
                    } else if (arg0.field780 < 0 || arg0.field780 >= var7.field2784.length) {
                        arg0.field780 = -1;
                    }
                }
                arg0.field766 = var7.field2785;
            }
        }
        if (arg0.field737 > 0) {
            arg0.field737--;
        }
        for (int var8 = 0; var8 < arg0.field758.length; var8++) {
            class69 var9 = arg0.field758[var8];
            if (var9 != null) {
                if (var9.field909 > 0) {
                    var9.field909--;
                } else {
                    class196 var10 = class83.method556(var9.field908, 87);
                    if (var10 == null || var10.field2784 == null) {
                        arg0.field758[var8] = null;
                    } else {
                        var9.field911++;
                        if (var10.field2784.length > var9.field913 && var10.field2763[var9.field913] < var9.field911) {
                            var9.field913++;
                            var9.field911 = 1;
                            class446.method2739(var10, class187.field2619 == arg0, arg0.field4960, var9.field913, -49, arg0.field4954, arg0.field4951);
                        }
                        if (var9.field913 >= var10.field2784.length) {
                            var9.field906++;
                            var9.field913 -= var10.field2761;
                            if (var9.field906 >= var10.field2764) {
                                arg0.field758[var8] = null;
                            } else if (var9.field913 >= 0 && var9.field913 < var10.field2784.length) {
                                class446.method2739(var10, class187.field2619 == arg0, arg0.field4960, var9.field913, -49, arg0.field4954, arg0.field4951);
                            } else {
                                arg0.field758[var8] = null;
                            }
                        }
                        var9.field910 = var9.field913 + 1;
                        if (var10.field2784.length <= var9.field910) {
                            var9.field910 -= var10.field2761;
                            if (var9.field906 + 1 >= var10.field2764) {
                                var9.field910 = -1;
                            } else if (var9.field910 < 0 || var10.field2784.length <= var9.field910) {
                                var9.field910 = -1;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(B[B)[B", line = 364)
    public static final byte[] method308(byte arg0, byte[] arg1) {
        field427++;
        class256 var2 = new class256(arg1);
        int var3 = var2.method1738((byte) 74);
        if (arg0 <= 0) {
            field425 = null;
        }
        int var4 = var2.method1746(20972);
        if (var4 < 0 || !(class160.field2143 == 0 || class160.field2143 >= var4)) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var7 = new byte[var4];
            var2.method1710(var4, 0, var7, -120);
            return var7;
        } else {
            int var5 = var2.method1746(20972);
            if (var5 < 0 || !(class160.field2143 == 0 || var5 <= class160.field2143)) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var3 == 1) {
                class379.method2400(var6, var5, arg1, var4, 9);
            } else {
                class262.field3864.method2319(-32, var2, var6);
            }
            return var6;
        }
    }
}
