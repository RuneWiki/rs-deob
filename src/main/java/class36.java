import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class36 extends class183 {

    @OriginalMember(owner = "client!w", name = "t", descriptor = "I")
    public static int field419 = -1;

    @OriginalMember(owner = "client!w", name = "m", descriptor = "I")
    public static int field412;

    @OriginalMember(owner = "client!w", name = "q", descriptor = "I")
    public static int field416;

    @OriginalMember(owner = "client!w", name = "r", descriptor = "I")
    public static int field417;

    @OriginalMember(owner = "client!w", name = "u", descriptor = "I")
    public static int field420;

    @OriginalMember(owner = "client!w", name = "o", descriptor = "J")
    public long field414;

    @OriginalMember(owner = "client!w", name = "n", descriptor = "Lw;")
    public class36 field413;

    @OriginalMember(owner = "client!w", name = "p", descriptor = "Lw;")
    public class36 field415;

    @OriginalMember(owner = "client!w", name = "s", descriptor = "[Z")
    public static boolean[] field418;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(I)V", line = 10)
    public static void method203(int arg0) {
        field418 = null;
        if (arg0 != -1) {
            method207((class344) null, (byte) 106, (String) null);
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIIII)V", line = 31)
    public static final void method204(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var8 = arg0 + 1;
        class190.method1329(class126.field1723[arg0], arg2, arg4, (byte) -109, arg5);
        field417++;
        int var9 = arg1 - 1;
        class190.method1329(class126.field1723[arg1], arg2, arg4, (byte) -117, arg5);
        if (arg3 <= 60) {
            field418 = (boolean[]) null;
        }
        for (int var6 = var8; var6 <= var9; var6++) {
            int[] var7 = class126.field1723[var6];
            var7[arg5] = var7[arg2] = arg4;
        }
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(I)V", line = 56)
    public static final void method205(int arg0) {
        field412++;
        class257.field3786 = null;
        if (arg0 == 0) {
            class69.method507();
        }
    }

    @OriginalMember(owner = "client!w", name = "c", descriptor = "(I)V", line = 68)
    public final void method206(int arg0) {
        field416++;
        if (this.field415 == null) {
            return;
        }
        this.field415.field413 = this.field413;
        if (arg0 == -1) {
            this.field413.field415 = this.field415;
            this.field413 = null;
            this.field415 = null;
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Lin;BLjava/lang/String;)Ljava/lang/String;", line = 85)
    public static final String method207(class344 arg0, byte arg1, String arg2) {
        field420++;
        if (arg2.indexOf("%") != -1) {
            label54: while (true) {
                int var3 = arg2.indexOf("%1");
                if (var3 == -1) {
                    while (true) {
                        int var4 = arg2.indexOf("%2");
                        if (var4 == -1) {
                            while (true) {
                                int var5 = arg2.indexOf("%3");
                                if (var5 == -1) {
                                    while (true) {
                                        int var6 = arg2.indexOf("%4");
                                        if (var6 == -1) {
                                            while (true) {
                                                int var7 = arg2.indexOf("%5");
                                                if (var7 == -1) {
                                                    while (true) {
                                                        int var8 = arg2.indexOf("%dns");
                                                        if (var8 == -1) {
                                                            break label54;
                                                        }
                                                        String var9 = "";
                                                        if (class234.field3302 != null) {
                                                            if (class234.field3302.field4244 == null) {
                                                                var9 = class8.method44(255, class234.field3302.field4240);
                                                            } else {
                                                                var9 = (String) class234.field3302.field4244;
                                                            }
                                                        }
                                                        arg2 = arg2.substring(0, var8) + var9 + arg2.substring(var8 + 4);
                                                    }
                                                }
                                                arg2 = arg2.substring(0, var7) + class123.method890((byte) 72, class30.method175(100, 4, arg0)) + arg2.substring(var7 + 2);
                                            }
                                        }
                                        arg2 = arg2.substring(0, var6) + class123.method890((byte) 72, class30.method175(100, 3, arg0)) + arg2.substring(var6 + 2);
                                    }
                                }
                                arg2 = arg2.substring(0, var5) + class123.method890((byte) 72, class30.method175(100, 2, arg0)) + arg2.substring(var5 + 2);
                            }
                        }
                        arg2 = arg2.substring(0, var4) + class123.method890((byte) 72, class30.method175(100, 1, arg0)) + arg2.substring(var4 + 2);
                    }
                }
                arg2 = arg2.substring(0, var3) + class123.method890((byte) 72, class30.method175(100, 0, arg0)) + arg2.substring(var3 + 2);
            }
        }
        int var10 = -128 / ((-arg1 - 70) / 56);
        return arg2;
    }
}
