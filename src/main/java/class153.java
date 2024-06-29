import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public class class153 {

    @OriginalMember(owner = "client!ak", name = "r", descriptor = "Z")
    public boolean field2376 = true;

    @OriginalMember(owner = "client!ak", name = "f", descriptor = "I")
    public int field2364;

    @OriginalMember(owner = "client!ak", name = "k", descriptor = "I")
    public int field2369;

    @OriginalMember(owner = "client!ak", name = "n", descriptor = "I")
    public int field2372;

    @OriginalMember(owner = "client!ak", name = "g", descriptor = "I")
    public int field2365;

    @OriginalMember(owner = "client!ak", name = "t", descriptor = "I")
    public int field2378;

    @OriginalMember(owner = "client!ak", name = "j", descriptor = "I")
    public int field2368;

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "I")
    public static int field2360 = 0;

    @OriginalMember(owner = "client!ak", name = "e", descriptor = "[Lom;")
    public static class165[] field2363 = new class165[4];

    @OriginalMember(owner = "client!ak", name = "o", descriptor = "I")
    public static int field2373 = 0;

    @OriginalMember(owner = "client!ak", name = "p", descriptor = "Ljava/lang/String;")
    public static String field2374 = " is already on your ignore list.";

    @OriginalMember(owner = "client!ak", name = "s", descriptor = "[Ljava/lang/String;")
    public static String[] field2377 = new String[100];

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "I")
    public static int field2361;

    @OriginalMember(owner = "client!ak", name = "d", descriptor = "I")
    public static int field2362;

    @OriginalMember(owner = "client!ak", name = "h", descriptor = "I")
    public static int field2366;

    @OriginalMember(owner = "client!ak", name = "l", descriptor = "I")
    public static int field2370;

    @OriginalMember(owner = "client!ak", name = "m", descriptor = "I")
    public static int field2371;

    @OriginalMember(owner = "client!ak", name = "q", descriptor = "I")
    public static int field2375;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "Lcd;")
    public static class136 field2359;

    @OriginalMember(owner = "client!ak", name = "i", descriptor = "Ltn;")
    public static class38 field2367;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(I)V", line = 19)
    public static final void method1112(int arg0) {
        class81.field1115.method1355(false);
        field2361++;
        if (arg0 != -27862) {
            method1117(64, 75, (class6) null);
        }
    }

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "(I)V", line = 32)
    public static void method1113(int arg0) {
        if (arg0 >= -15) {
            field2377 = (String[]) null;
        }
        field2374 = null;
        field2363 = null;
        field2377 = null;
        field2367 = null;
        field2359 = null;
    }

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "(I)V", line = 47)
    public static final void method1114(int arg0) {
        if (arg0 != -32) {
            field2359 = (class136) null;
        }
        field2370++;
        if (class258.field4072 > 0) {
            class305.method2112((byte) -26);
        } else {
            class221.field3508 = class275.field4247;
            class275.field4247 = null;
            class68.method538(arg0 ^ 0x70, 40);
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(ILcd;IIZIII)V", line = 73)
    public static final void method1115(int arg0, class136 arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7) {
        if (class337.field5254) {
            class48.field629 = 32;
        } else {
            class48.field629 = 0;
        }
        class337.field5254 = arg4;
        if (class183.field2971 != 0) {
            if (arg2 >= arg0 && arg0 + 16 > arg2 && arg3 <= arg6 && arg6 < arg3 + 16) {
                arg1.field2018 -= 4;
                class167.method1250(arg1, 412);
            } else if (arg0 <= arg2 && arg2 < (arg0 + 16) && (arg3 + arg7 - 16) <= arg6 && arg6 < arg3 + arg7) {
                arg1.field2018 += 4;
                class167.method1250(arg1, 412);
            } else if (arg0 - class48.field629 <= arg2 && (arg0 + class48.field629 + 16) > arg2 && (arg3 + 16) <= arg6 && arg6 < (arg7 + arg3 - 16)) {
                int var8 = (arg7 - 32) * arg7 / arg5;
                if (var8 < 8) {
                    var8 = 8;
                }
                int var9 = arg6 - arg3 - (var8 / 2 + 16);
                int var10 = arg7 - var8 - 32;
                arg1.field2018 = (arg5 - arg7) * var9 / var10;
                class167.method1250(arg1, 412);
                class337.field5254 = true;
            }
        }
        field2366++;
        if (class195.field3118 == 0) {
            return;
        }
        int var11 = arg1.field2137;
        if (arg0 - var11 <= arg2 && arg6 >= arg3 && arg0 + 16 > arg2 && arg3 + arg7 >= arg6) {
            arg1.field2018 += class195.field3118 * 45;
            class167.method1250(arg1, 412);
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(B)I", line = 140)
    public static final int method1116(byte arg0) {
        field2375++;
        if (arg0 > -7) {
            return 59;
        } else if (class72.field1002 == 0) {
            return 0;
        } else {
            return class327.field5130[class72.field1002].method352();
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IILvl;)Ljava/lang/String;", line = 154)
    public static final String method1117(int arg0, int arg1, class6 arg2) {
        field2371++;
        try {
            int var3 = arg2.method52(-32768);
            if (arg1 != 6264) {
                field2367 = (class38) null;
            }
            if (arg0 < var3) {
                var3 = arg0;
            }
            byte[] var4 = new byte[var3];
            arg2.field111 += class238.field3731.method1713(var3, (byte) -87, arg2.field111, 0, arg2.field115, var4);
            return class37.method316(var4, 87, var3, 0);
        } catch (Exception var7) {
            return "Cabbage";
        }
    }

    @OriginalMember(owner = "client!ak", name = "<init>", descriptor = "(IIIIIIZ)V", line = 192)
    public class153(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field2364 = arg0;
        this.field2369 = arg3;
        this.field2376 = arg6;
        this.field2372 = arg1;
        this.field2365 = arg5;
        this.field2378 = arg4;
        this.field2368 = arg2;
    }
}
