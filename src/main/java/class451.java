import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public class class451 {

    @OriginalMember(owner = "client!ml", name = "e", descriptor = "I")
    public int field6542 = 8;

    @OriginalMember(owner = "client!ml", name = "d", descriptor = "I")
    public int field6541 = 128;

    @OriginalMember(owner = "client!ml", name = "k", descriptor = "I")
    public int field6548 = 0;

    @OriginalMember(owner = "client!ml", name = "h", descriptor = "Z")
    public boolean field6545 = true;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "I")
    public int field6538 = -1;

    @OriginalMember(owner = "client!ml", name = "q", descriptor = "I")
    public int field6554 = 16;

    @OriginalMember(owner = "client!ml", name = "i", descriptor = "I")
    public int field6546 = 1190717;

    @OriginalMember(owner = "client!ml", name = "f", descriptor = "Z")
    public boolean field6543 = true;

    @OriginalMember(owner = "client!ml", name = "n", descriptor = "Z")
    public boolean field6551 = false;

    @OriginalMember(owner = "client!ml", name = "c", descriptor = "I")
    public int field6540 = -1;

    @OriginalMember(owner = "client!ml", name = "x", descriptor = "I")
    public int field6561 = -1;

    @OriginalMember(owner = "client!ml", name = "g", descriptor = "I")
    public static int field6544 = 0;

    @OriginalMember(owner = "client!ml", name = "m", descriptor = "Z")
    public static boolean field6550 = true;

    @OriginalMember(owner = "client!ml", name = "t", descriptor = "I")
    public static int field6557 = -9017772;

    @OriginalMember(owner = "client!ml", name = "w", descriptor = "Ljava/lang/String;")
    public static String field6560 = "wave:";

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "I")
    public static int field6539;

    @OriginalMember(owner = "client!ml", name = "j", descriptor = "I")
    public static int field6547;

    @OriginalMember(owner = "client!ml", name = "o", descriptor = "I")
    public static int field6552;

    @OriginalMember(owner = "client!ml", name = "p", descriptor = "I")
    public static int field6553;

    @OriginalMember(owner = "client!ml", name = "r", descriptor = "I")
    public static int field6555;

    @OriginalMember(owner = "client!ml", name = "s", descriptor = "I")
    public static int field6556;

    @OriginalMember(owner = "client!ml", name = "u", descriptor = "I")
    public static int field6558;

    @OriginalMember(owner = "client!ml", name = "v", descriptor = "I")
    public static int field6559;

    @OriginalMember(owner = "client!ml", name = "l", descriptor = "Lof;")
    public static class421 field6549;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(Lec;IB)V", line = 7)
    public final void method2806(class37 arg0, int arg1, byte arg2) {
        if (arg2 != 97) {
            field6550 = true;
        }
        while (true) {
            int var4 = arg0.method271((byte) 118);
            if (var4 == 0) {
                field6558++;
                return;
            }
            this.method2809(-4, arg0, var4, arg1);
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(BI)V", line = 47)
    public final void method2807(byte arg0, int arg1) {
        if (arg0 != 89) {
            return;
        }
        this.field6542 = this.field6542 << 8 | arg1;
        field6547++;
        if (this.field6538 == -1) {
            this.field6538 = this.field6561;
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(Z)V", line = 76)
    public static void method2808(boolean arg0) {
        field6560 = null;
        if (!arg0) {
            field6560 = null;
        }
        field6549 = null;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(ILec;II)V", line = 95)
    private final void method2809(int arg0, class37 arg1, int arg2, int arg3) {
        field6539++;
        if (arg2 == 1) {
            this.field6548 = class39.method334(arg1.method295(true), -7);
        } else if (arg2 == 2) {
            this.field6561 = arg1.method271((byte) 122);
        } else if (arg2 == 3) {
            this.field6561 = arg1.method320((byte) -87);
            if (this.field6561 == 65535) {
                this.field6561 = -1;
            }
        } else if (arg2 == 5) {
            this.field6545 = false;
        } else if (arg2 == 7) {
            this.field6540 = class39.method334(arg1.method295(true), 123);
        } else if (arg2 == 8) {
            class250.field3617 = arg3;
        } else if (arg2 == 9) {
            this.field6541 = arg1.method320((byte) -87);
        } else if (arg2 == 10) {
            this.field6543 = false;
        } else if (arg2 == 11) {
            this.field6542 = arg1.method271((byte) 109);
        } else if (arg2 == 12) {
            this.field6551 = true;
        } else if (arg2 == 13) {
            this.field6546 = arg1.method295(true);
        } else if (arg2 == 14) {
            this.field6554 = arg1.method271((byte) 106);
        } else if (arg2 == 15) {
            this.field6538 = arg1.method320((byte) -87);
            if (this.field6538 == 65535) {
                this.field6538 = -1;
            }
        }
        if (arg0 != -4) {
            this.field6542 = -37;
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(II)I", line = 182)
    public static final int method2810(int arg0, int arg1) {
        field6556++;
        int var2 = (arg1 * arg1 >> 12) * arg1 >> 12;
        int var3 = arg1 * 6 - arg0;
        int var4 = (arg1 * var3 >> 12) + 40960;
        return var2 * var4 >> 12;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(ZIIIII)V", line = 196)
    public static final void method2811(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 <= class383.field5497 && class308.field4507 <= arg5) {
            boolean var6;
            if (arg2 < class185.field2727) {
                arg2 = class185.field2727;
                var6 = false;
            } else if (arg2 <= class278.field4184) {
                var6 = true;
            } else {
                arg2 = class278.field4184;
                var6 = false;
            }
            boolean var7;
            if (arg3 < class185.field2727) {
                arg3 = class185.field2727;
                var7 = false;
            } else if (class278.field4184 >= arg3) {
                var7 = true;
            } else {
                arg3 = class278.field4184;
                var7 = false;
            }
            if (class308.field4507 > arg1) {
                arg1 = class308.field4507;
            } else {
                class47.method379(arg3, (byte) 89, arg4, class286.field4283[arg1++], arg2);
            }
            if (class383.field5497 < arg5) {
                arg5 = class383.field5497;
            } else {
                class47.method379(arg3, (byte) 70, arg4, class286.field4283[arg5--], arg2);
            }
            if (var6 && var7) {
                for (int var8 = arg1; var8 <= arg5; var8++) {
                    int[] var9 = class286.field4283[var8];
                    var9[arg2] = var9[arg3] = arg4;
                }
            } else if (var6) {
                for (int var10 = arg1; var10 <= arg5; var10++) {
                    class286.field4283[var10][arg2] = arg4;
                }
            } else if (var7) {
                for (int var11 = arg1; var11 <= arg5; var11++) {
                    class286.field4283[var11][arg3] = arg4;
                }
            }
        }
        field6553++;
        if (!arg0) {
            field6560 = null;
        }
    }

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "(II)Lfb;", line = 310)
    public static final class45 method2812(int arg0, int arg1) {
        field6559++;
        class18 var2 = class46.field747;
        class45 var3;
        synchronized (class46.field747) {
            var3 = (class45) class46.field747.method103(0, (long) arg1);
        }
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = class377.field5337.method1355(class392.method2499(true, arg1), -12607, class23.method162(-10857, arg1));
        class45 var5 = new class45();
        var5.field733 = arg1;
        if (var4 != null) {
            var5.method373(new class37(var4), 42);
        }
        var5.method368(0);
        if (!class223.field3316 && var5.field700) {
            var5.field663 = null;
            var5.field701 = null;
        }
        if (var5.field711) {
            var5.field694 = false;
            var5.field714 = 0;
        }
        if (arg0 < 39) {
            return null;
        }
        class18 var6 = class46.field747;
        synchronized (class46.field747) {
            class46.field747.method113(var5, 0, (long) arg1);
            return var5;
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(ILqp;)Ljava/lang/String;", line = 365)
    public static final String method2813(int arg0, class278 arg1) {
        field6555++;
        if (arg0 != 12001) {
            field6544 = 39;
        }
        return arg1.field4179 == null || arg1.field4179.length() <= 0 ? arg1.field4173 : arg1.field4173 + class105.field1745 + arg1.field4179;
    }
}
