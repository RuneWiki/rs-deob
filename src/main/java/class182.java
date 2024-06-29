import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public class class182 {

    @OriginalMember(owner = "client!pk", name = "g", descriptor = "I")
    private int field2936 = 0;

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "Lsl;")
    private class427 field2931;

    @OriginalMember(owner = "client!pk", name = "f", descriptor = "[I")
    public static int[] field2935 = new int[1000];

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "I")
    public static int field2930;

    @OriginalMember(owner = "client!pk", name = "d", descriptor = "I")
    public static int field2933;

    @OriginalMember(owner = "client!pk", name = "e", descriptor = "I")
    public static int field2934;

    @OriginalMember(owner = "client!pk", name = "c", descriptor = "Liga;")
    private class425 field2932;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(ILpl;)V")
    public static final void method1334(int arg0, class604 arg1) {
        if (arg1.field8766 != -1) {
            class138 var2 = class357.field5338.method2099(arg1.field8766, true);
            if (var2 == null || var2.field2440 == null) {
                arg1.field8766 = -1;
                arg1.field8748 = false;
            } else {
                label397: {
                    arg1.field8696++;
                    if (arg1.field8736 < var2.field2440.length && arg1.field8696 > var2.field2431[arg1.field8736]) {
                        arg1.field8685++;
                        arg1.field8736++;
                        arg1.field8696 = 1;
                        class536.method3101(arg1.field8736, (byte) 127, var2, arg1.field9815, arg1.field9806, arg1.field9814, class532.field7456 == arg1);
                    }
                    if (var2.field2440.length <= arg1.field8736) {
                        arg1.field8696 = 0;
                        arg1.field8736 = 0;
                        if (arg1.field8748) {
                            arg1.field8766 = arg1.method3465(0).method3743(true);
                            if (arg1.field8766 == -1) {
                                arg1.field8748 = false;
                                break label397;
                            }
                            var2 = class357.field5338.method2099(arg1.field8766, true);
                        }
                        class536.method3101(arg1.field8736, (byte) 124, var2, arg1.field9815, arg1.field9806, arg1.field9814, class532.field7456 == arg1);
                    }
                    arg1.field8685 = arg1.field8736 + 1;
                    if (arg1.field8685 >= var2.field2440.length) {
                        arg1.field8685 = 0;
                    }
                }
            }
        }
        field2933++;
        if (arg1.field8723 != -1 && class336.field5031 >= arg1.field8771) {
            class526 var3 = class261.field3825.method1313((byte) -114, arg1.field8723);
            int var4 = var3.field7427;
            if (var4 == -1) {
                arg1.field8723 = -1;
            } else {
                label399: {
                    class138 var5 = class357.field5338.method2099(var4, true);
                    if (var3.field7423) {
                        if (var5.field2452 == 3) {
                            if (arg1.field8780 > 0 && class336.field5031 >= arg1.field8729 && arg1.field8719 < class336.field5031) {
                                arg1.field8723 = -1;
                                break label399;
                            }
                        } else if (var5.field2452 == 1 && arg1.field8780 > 0 && arg1.field8729 <= class336.field5031 && class336.field5031 > arg1.field8719) {
                            arg1.field8771 = class336.field5031 + 1;
                            break label399;
                        }
                    }
                    if (var5 == null || var5.field2440 == null) {
                        arg1.field8723 = -1;
                    } else {
                        if (arg1.field8700 < 0) {
                            arg1.field8700 = 0;
                            class536.method3101(0, (byte) 126, var5, arg1.field9815, arg1.field9806, arg1.field9814, class532.field7456 == arg1);
                        }
                        arg1.field8678++;
                        if (arg1.field8700 < var5.field2440.length && var5.field2431[arg1.field8700] < arg1.field8678) {
                            arg1.field8678 = 1;
                            arg1.field8700++;
                            class536.method3101(arg1.field8700, (byte) 126, var5, arg1.field9815, arg1.field9806, arg1.field9814, class532.field7456 == arg1);
                        }
                        if (var5.field2440.length <= arg1.field8700) {
                            if (var3.field7423) {
                                arg1.field8700 -= var5.field2427;
                                arg1.field8684++;
                                if (arg1.field8684 >= var5.field2450) {
                                    arg1.field8723 = -1;
                                } else if (arg1.field8700 >= 0 && var5.field2440.length > arg1.field8700) {
                                    class536.method3101(arg1.field8700, (byte) 123, var5, arg1.field9815, arg1.field9806, arg1.field9814, class532.field7456 == arg1);
                                } else {
                                    arg1.field8723 = -1;
                                }
                            } else {
                                arg1.field8723 = -1;
                            }
                        }
                        arg1.field8707 = arg1.field8700 + 1;
                        if (arg1.field8707 >= var5.field2440.length) {
                            if (var3.field7423) {
                                arg1.field8707 -= var5.field2427;
                                if (arg1.field8684 + 1 >= var5.field2450) {
                                    arg1.field8707 = -1;
                                } else if (arg1.field8707 < 0 || arg1.field8707 >= var5.field2440.length) {
                                    arg1.field8707 = -1;
                                }
                            } else {
                                arg1.field8707 = -1;
                            }
                        }
                    }
                }
            }
        }
        if (arg1.field8676 != -1 && class336.field5031 >= arg1.field8731) {
            class526 var6 = class261.field3825.method1313((byte) -114, arg1.field8676);
            int var7 = var6.field7427;
            if (var7 == -1) {
                arg1.field8676 = -1;
            } else {
                label402: {
                    class138 var8 = class357.field5338.method2099(var7, true);
                    if (var6.field7423) {
                        if (var8.field2452 == 3) {
                            if (arg1.field8780 > 0 && arg1.field8729 <= class336.field5031 && class336.field5031 > arg1.field8719) {
                                arg1.field8676 = -1;
                                break label402;
                            }
                        } else if (var8.field2452 == 1 && arg1.field8780 > 0 && arg1.field8729 <= class336.field5031 && class336.field5031 > arg1.field8719) {
                            arg1.field8731 = class336.field5031 + 1;
                            break label402;
                        }
                    }
                    if (var8 == null || var8.field2440 == null) {
                        arg1.field8676 = -1;
                    } else {
                        if (arg1.field8744 < 0) {
                            arg1.field8744 = 0;
                            class536.method3101(0, (byte) 127, var8, arg1.field9815, arg1.field9806, arg1.field9814, class532.field7456 == arg1);
                        }
                        arg1.field8693++;
                        if (var8.field2440.length > arg1.field8744 && var8.field2431[arg1.field8744] < arg1.field8693) {
                            arg1.field8744++;
                            arg1.field8693 = 1;
                            class536.method3101(arg1.field8744, (byte) 125, var8, arg1.field9815, arg1.field9806, arg1.field9814, class532.field7456 == arg1);
                        }
                        if (arg1.field8744 >= var8.field2440.length) {
                            if (var6.field7423) {
                                arg1.field8679++;
                                arg1.field8744 -= var8.field2427;
                                if (arg1.field8679 >= var8.field2450) {
                                    arg1.field8676 = -1;
                                } else if (arg1.field8744 >= 0 && arg1.field8744 < var8.field2440.length) {
                                    class536.method3101(arg1.field8744, (byte) 127, var8, arg1.field9815, arg1.field9806, arg1.field9814, class532.field7456 == arg1);
                                } else {
                                    arg1.field8676 = -1;
                                }
                            } else {
                                arg1.field8676 = -1;
                            }
                        }
                        arg1.field8717 = arg1.field8744 + 1;
                        if (arg1.field8717 >= var8.field2440.length) {
                            if (var6.field7423) {
                                arg1.field8717 -= var8.field2427;
                                if ((arg1.field8679 + 1) >= var8.field2450) {
                                    arg1.field8717 = -1;
                                } else if (arg1.field8717 < 0 || var8.field2440.length <= arg1.field8717) {
                                    arg1.field8717 = -1;
                                }
                            } else {
                                arg1.field8717 = -1;
                            }
                        }
                    }
                }
            }
        }
        if (arg1.field8755 != -1 && arg1.field8738 <= 1) {
            class138 var9 = class357.field5338.method2099(arg1.field8755, true);
            if (var9.field2452 == 3) {
                if (arg1.field8780 > 0 && class336.field5031 >= arg1.field8729 && arg1.field8719 < class336.field5031) {
                    arg1.field8755 = -1;
                    arg1.field8760 = null;
                }
            } else if (var9.field2452 == 1 && arg1.field8780 > 0 && arg1.field8729 <= class336.field5031 && arg1.field8719 < class336.field5031) {
                arg1.field8738 = 2;
            }
        }
        if (arg1.field8755 != -1 && arg1.field8738 == 0) {
            class138 var10 = class357.field5338.method2099(arg1.field8755, true);
            if (var10 == null || var10.field2440 == null) {
                arg1.field8755 = -1;
                arg1.field8760 = null;
            } else {
                arg1.field8741++;
                if (var10.field2440.length > arg1.field8677 && arg1.field8741 > var10.field2431[arg1.field8677]) {
                    arg1.field8677++;
                    arg1.field8741 = 1;
                    class536.method3101(arg1.field8677, (byte) 127, var10, arg1.field9815, arg1.field9806, arg1.field9814, class532.field7456 == arg1);
                }
                if (var10.field2440.length <= arg1.field8677) {
                    arg1.field8722++;
                    arg1.field8677 -= var10.field2427;
                    if (arg1.field8722 >= var10.field2450) {
                        arg1.field8760 = null;
                        arg1.field8755 = -1;
                    } else if (arg1.field8677 >= 0 && var10.field2440.length > arg1.field8677) {
                        class536.method3101(arg1.field8677, (byte) 124, var10, arg1.field9815, arg1.field9806, arg1.field9814, class532.field7456 == arg1);
                    } else {
                        arg1.field8760 = null;
                        arg1.field8755 = -1;
                    }
                }
                arg1.field8740 = arg1.field8677 + 1;
                if (var10.field2440.length <= arg1.field8740) {
                    arg1.field8740 -= var10.field2427;
                    if ((arg1.field8722 + 1) >= var10.field2450) {
                        arg1.field8740 = -1;
                    } else if (arg1.field8740 < 0 || var10.field2440.length <= arg1.field8740) {
                        arg1.field8740 = -1;
                    }
                }
            }
        }
        if (arg1.field8738 > 0) {
            arg1.field8738--;
        }
        int var11 = 0;
        if (arg0 != 21463) {
            return;
        }
        while (var11 < arg1.field8768.length) {
            class674 var12 = arg1.field8768[var11];
            if (var12 != null) {
                if (var12.field9592 > 0) {
                    var12.field9592--;
                } else {
                    class138 var13 = class357.field5338.method2099(var12.field9589, true);
                    if (var13 == null || var13.field2440 == null) {
                        arg1.field8768[var11] = null;
                    } else {
                        var12.field9596++;
                        if (var12.field9597 < var13.field2440.length && var12.field9596 > var13.field2431[var12.field9597]) {
                            var12.field9597++;
                            var12.field9596 = 1;
                            class536.method3101(var12.field9597, (byte) 124, var13, arg1.field9815, arg1.field9806, arg1.field9814, class532.field7456 == arg1);
                        }
                        if (var12.field9597 >= var13.field2440.length) {
                            var12.field9597 -= var13.field2427;
                            var12.field9590++;
                            if (var13.field2450 <= var12.field9590) {
                                arg1.field8768[var11] = null;
                            } else if (var12.field9597 >= 0 && var13.field2440.length > var12.field9597) {
                                class536.method3101(var12.field9597, (byte) 124, var13, arg1.field9815, arg1.field9806, arg1.field9814, class532.field7456 == arg1);
                            } else {
                                arg1.field8768[var11] = null;
                            }
                        }
                        var12.field9591 = var12.field9597 + 1;
                        if (var12.field9591 >= var13.field2440.length) {
                            var12.field9591 -= var13.field2427;
                            if (var13.field2450 <= (var12.field9590 + 1)) {
                                var12.field9591 = -1;
                            } else if (var12.field9591 < 0 || var13.field2440.length <= var12.field9591) {
                                var12.field9591 = -1;
                            }
                        }
                    }
                }
            }
            var11++;
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(I)V")
    public static void method1335(int arg0) {
        field2935 = null;
        if (arg0 != 1) {
            field2935 = null;
        }
    }

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "(I)Liga;")
    public final class425 method1336(int arg0) {
        this.field2936 = 0;
        field2934++;
        if (arg0 != -1) {
            this.field2932 = null;
        }
        return this.method1337(7698);
    }

    @OriginalMember(owner = "client!pk", name = "c", descriptor = "(I)Liga;")
    public final class425 method1337(int arg0) {
        if (arg0 != 7698) {
            method1334(-75, null);
        }
        field2930++;
        if (this.field2936 > 0 && this.field2931.field6148[this.field2936 - 1] != this.field2932) {
            class425 var2 = this.field2932;
            this.field2932 = var2.field6134;
            return var2;
        }
        while (this.field2936 < this.field2931.field6158) {
            class425 var3 = this.field2931.field6148[this.field2936++].field6134;
            if (this.field2931.field6148[this.field2936 - 1] != var3) {
                this.field2932 = var3.field6134;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!pk", name = "<init>", descriptor = "()V")
    public class182() {
    }

    @OriginalMember(owner = "client!pk", name = "<init>", descriptor = "(Lsl;)V")
    public class182(class427 arg0) {
        this.field2931 = arg0;
    }
}
