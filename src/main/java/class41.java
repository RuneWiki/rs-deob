import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class41 implements Runnable {

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "I")
    public static int field756 = 0;

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "Lsc;")
    public static class128 field758 = class129.method1017(false, "Zu viele Verbindungen von Ihrer Adresse)3");

    @OriginalMember(owner = "client!fe", name = "f", descriptor = "Lsc;")
    public static class128 field761 = class129.method1017(false, "(U1");

    @OriginalMember(owner = "client!fe", name = "g", descriptor = "Lsc;")
    private static class128 field762 = class129.method1017(false, "You can(Wt add yourself to your own friend list)3");

    @OriginalMember(owner = "client!fe", name = "l", descriptor = "I")
    public static int field767 = 0;

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "Lsc;")
    public static class128 field757 = field762;

    @OriginalMember(owner = "client!fe", name = "k", descriptor = "Z")
    public static boolean field766 = false;

    @OriginalMember(owner = "client!fe", name = "m", descriptor = "Lsc;")
    private static class128 field768 = class129.method1017(false, "red:");

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "Lsc;")
    public static class128 field759 = field768;

    @OriginalMember(owner = "client!fe", name = "i", descriptor = "[I")
    public static int[] field764 = new int[500];

    @OriginalMember(owner = "client!fe", name = "o", descriptor = "Lsc;")
    public static class128 field770 = field768;

    @OriginalMember(owner = "client!fe", name = "e", descriptor = "I")
    public static int field760;

    @OriginalMember(owner = "client!fe", name = "h", descriptor = "I")
    public static int field763;

    @OriginalMember(owner = "client!fe", name = "j", descriptor = "I")
    public static int field765;

    @OriginalMember(owner = "client!fe", name = "n", descriptor = "I")
    public static int field769;

    @OriginalMember(owner = "client!fe", name = "p", descriptor = "I")
    public static int field771;

    @OriginalMember(owner = "client!fe", name = "run", descriptor = "()V")
    public final void run() {
        field760++;
        try {
            while (true) {
                class121 var1 = class131.field3026;
                class102 var2;
                synchronized (class131.field3026) {
                    var2 = (class102) class131.field3026.method920((byte) -82);
                }
                if (var2 == null) {
                    class18.method164(false, 100L);
                    Object var3 = class131.field3039;
                    synchronized (class131.field3039) {
                        if (class119.field2708 <= 1) {
                            class119.field2708 = 0;
                            class131.field3039.notifyAll();
                            return;
                        }
                        class119.field2708--;
                    }
                } else {
                    if (var2.field2323 == 0) {
                        var2.field2321.method266(var2.field2330, var2.field2330.length, 16711680, (int) var2.field365);
                        class121 var5 = class131.field3026;
                        synchronized (class131.field3026) {
                            var2.method172(-2658);
                        }
                    } else if (var2.field2323 == 1) {
                        var2.field2330 = var2.field2321.method268((int) var2.field365, 0);
                        class121 var4 = class131.field3026;
                        synchronized (class131.field3026) {
                            class35.field655.method926(5569, var2);
                        }
                    }
                    Object var6 = class131.field3039;
                    synchronized (class131.field3039) {
                        if (class119.field2708 <= 1) {
                            class119.field2708 = 0;
                            class131.field3039.notifyAll();
                            return;
                        }
                        class119.field2708 = 600;
                    }
                }
            }
        } catch (Exception var17) {
            class116.method895(-1, var17, null);
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IZIIZLsf;I)V")
    public static final void method293(int arg0, boolean arg1, int arg2, int arg3, boolean arg4, class131 arg5, int arg6) {
        if (!arg4) {
            field756 = -55;
        }
        class49.field882 = arg6;
        class20.field381 = arg5;
        class27.field530 = 1;
        class30.field606 = arg0;
        field763++;
        class126.field2851 = arg2;
        class21.field410 = arg3;
        class5.field55 = arg1;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(B)V")
    public static void method294(byte arg0) {
        field764 = null;
        field761 = null;
        field770 = null;
        field768 = null;
        if (arg0 <= 12) {
            field766 = false;
        }
        field757 = null;
        field759 = null;
        field762 = null;
        field758 = null;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(I)V")
    public static final void method295(int arg0) {
        class27.field522 = new class121();
        if (arg0 < 96) {
            method296(null, 62, 119, -16, null, null);
        }
        field771++;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "([IIII[I[Lad;)V")
    public static final void method296(int[] arg0, int arg1, int arg2, int arg3, int[] arg4, class5[] arg5) {
        field769++;
        if (arg1 < arg3) {
            int var6 = arg3 + 1;
            int var7 = (arg1 + arg3) / 2;
            class5 var8 = arg5[var7];
            int var9 = arg1 - 1;
            arg5[var7] = arg5[arg1];
            arg5[arg1] = var8;
            while (var6 > var9) {
                boolean var10 = true;
                do {
                    var6--;
                    for (int var11 = 0; var11 < 4; var11++) {
                        int var12;
                        int var13;
                        if (arg0[var11] == 2) {
                            var12 = arg5[var6].field40;
                            var13 = var8.field40;
                        } else if (arg0[var11] == 1) {
                            var12 = arg5[var6].field64;
                            var13 = var8.field64;
                            if (var12 == -1 && arg4[var11] == 1) {
                                var12 = 2001;
                            }
                            if (var13 == -1 && arg4[var11] == 1) {
                                var13 = 2001;
                            }
                        } else if (arg0[var11] == 3) {
                            var13 = var8.field66 ? 1 : 0;
                            var12 = arg5[var6].field66 ? 1 : 0;
                        } else {
                            var12 = arg5[var6].field54;
                            var13 = var8.field54;
                        }
                        if (var12 != var13) {
                            if ((arg4[var11] != 1 || var12 <= var13) && (arg4[var11] != 0 || var13 <= var12)) {
                                var10 = false;
                            }
                            break;
                        }
                        if (var11 == 3) {
                            var10 = false;
                        }
                    }
                } while (var10);
                boolean var14 = true;
                do {
                    var9++;
                    for (int var15 = 0; var15 < 4; var15++) {
                        int var16;
                        int var17;
                        if (arg0[var15] == 2) {
                            var16 = var8.field40;
                            var17 = arg5[var9].field40;
                        } else if (arg0[var15] == 1) {
                            var17 = arg5[var9].field64;
                            var16 = var8.field64;
                            if (var16 == -1 && arg4[var15] == 1) {
                                var16 = 2001;
                            }
                            if (var17 == -1 && arg4[var15] == 1) {
                                var17 = 2001;
                            }
                        } else if (arg0[var15] == 3) {
                            var16 = var8.field66 ? 1 : 0;
                            var17 = arg5[var9].field66 ? 1 : 0;
                        } else {
                            var17 = arg5[var9].field54;
                            var16 = var8.field54;
                        }
                        if (var16 != var17) {
                            if ((arg4[var15] != 1 || var17 >= var16) && (arg4[var15] != 0 || var16 >= var17)) {
                                var14 = false;
                            }
                            break;
                        }
                        if (var15 == 3) {
                            var14 = false;
                        }
                    }
                } while (var14);
                if (var9 < var6) {
                    class5 var18 = arg5[var9];
                    arg5[var9] = arg5[var6];
                    arg5[var6] = var18;
                }
            }
            method296(arg0, arg1, arg2, var6, arg4, arg5);
            method296(arg0, var6 + 1, 9871, arg3, arg4, arg5);
        }
        if (arg2 != 9871) {
            field758 = null;
        }
    }
}
