import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class99 {

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "I")
    public static int field1480;

    @OriginalMember(owner = "client!wh", name = "d", descriptor = "I")
    public static int field1483;

    @OriginalMember(owner = "client!wh", name = "e", descriptor = "I")
    public static int field1484;

    @OriginalMember(owner = "client!wh", name = "f", descriptor = "I")
    public static int field1485;

    @OriginalMember(owner = "client!wh", name = "g", descriptor = "I")
    public static int field1486;

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "Ljk;")
    public static class446 field1481;

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "[[[B")
    public static byte[][][] field1482;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(ILjs;ZLjava/awt/Component;I)Lou;", line = 10)
    public static final class428 method705(int arg0, class216 arg1, boolean arg2, Component arg3, int arg4) {
        field1480++;
        if (class296.field3877 == 0) {
            throw new IllegalStateException();
        } else if (arg0 >= 0 && arg0 < 2) {
            if (arg4 < 256) {
                arg4 = 256;
            }
            try {
                class428 var5 = (class428) Class.forName("sv").getDeclaredConstructor().newInstance();
                var5.field5868 = arg4;
                var5.field5858 = new int[(class202.field2798 ? 2 : 1) * 256];
                var5.method2415(arg3);
                var5.field5870 = (arg4 & 0xFFFFFC00) + 1024;
                if (var5.field5870 > 16384) {
                    var5.field5870 = 16384;
                }
                var5.method2409(var5.field5870);
                if (class415.field5734 > 0 && class291.field3823 == null) {
                    class291.field3823 = new class368();
                    class291.field3823.field4967 = arg1;
                    arg1.method1353(class415.field5734, -34, class291.field3823);
                }
                if (class291.field3823 != null) {
                    if (class291.field3823.field4966[arg0] != null) {
                        throw new IllegalArgumentException();
                    }
                    class291.field3823.field4966[arg0] = var5;
                }
                return var5;
            } catch (Throwable var8) {
                try {
                    class418 var6 = new class418(arg1, arg0);
                    var6.field5868 = arg4;
                    var6.field5858 = new int[(class202.field2798 ? 2 : 1) * 256];
                    var6.method2415(arg3);
                    var6.field5870 = 16384;
                    var6.method2409(var6.field5870);
                    if (class415.field5734 > 0 && class291.field3823 == null) {
                        class291.field3823 = new class368();
                        class291.field3823.field4967 = arg1;
                        arg1.method1353(class415.field5734, -34, class291.field3823);
                    }
                    if (!arg2) {
                        field1482 = null;
                    }
                    if (class291.field3823 != null) {
                        if (class291.field3823.field4966[arg0] != null) {
                            throw new IllegalArgumentException();
                        }
                        class291.field3823.field4966[arg0] = var6;
                    }
                    return var6;
                } catch (Throwable var7) {
                    return new class428();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(B)V", line = 97)
    public static final void method706(byte arg0) {
        class241.field3221 = 0;
        class513.field7560 = 0;
        class186.field2630 = -1;
        class458.field6312 = -3;
        if (arg0 < -6) {
            class407.field5593 = false;
            field1484++;
            class382.field5209 = 0;
            class27.field459 = 1;
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIILqa;)V", line = 116)
    public static final void method707(int arg0, int arg1, int arg2, class162 arg3) {
        class302.field3987 = arg3;
        field1486++;
        class259.field3425 = new class149[arg1][arg0];
        if (class425.field5815 != null) {
            class434.field5954 = class21.method197(class425.field5815[0], class425.field5815[4], class425.field5815[1], class425.field5815[2], class425.field5815[3], 10, class425.field5815[5]);
        }
        class200.field2779 = new class149();
        if (arg2 <= 14) {
            method708();
        }
        class115.method789(0);
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "()V", line = 134)
    public static final void method708() {
        if (class490.field6821 != null) {
            for (int var0 = 0; var0 < class490.field6821.length; var0++) {
                for (int var1 = 0; var1 < class439.field6036; var1++) {
                    for (int var2 = 0; var2 < class318.field4170; var2++) {
                        if (class490.field6821[var0][var1][var2] != null) {
                            class490.field6821[var0][var1][var2].method2371((byte) -117);
                        }
                        class490.field6821[var0][var1][var2] = null;
                    }
                }
            }
        }
        class490.field6821 = null;
        class209.field2868 = null;
        if (class376.field5102 != null) {
            for (int var3 = 0; var3 < class376.field5102.length; var3++) {
                for (int var4 = 0; var4 < class439.field6036; var4++) {
                    for (int var5 = 0; var5 < class318.field4170; var5++) {
                        if (class376.field5102[var3][var4][var5] != null) {
                            class376.field5102[var3][var4][var5].method2371((byte) -121);
                        }
                        class376.field5102[var3][var4][var5] = null;
                    }
                }
            }
        }
        class376.field5102 = null;
        class37.field582 = null;
        class497.field6886 = null;
        class141.field2049 = null;
        class234.field3151 = 0;
        if (class466.field6426 != null) {
            for (int var6 = 0; var6 < class234.field3151; var6++) {
                class466.field6426[var6] = null;
            }
        }
        if (class32.field525 != null) {
            for (int var7 = 0; var7 < class238.field3189; var7++) {
                class32.field525[var7] = null;
            }
            class238.field3189 = 0;
        }
        if (class37.field586 != null) {
            for (int var8 = 0; var8 < class249.field3300; var8++) {
                class37.field586[var8] = null;
            }
            for (int var9 = 0; var9 < class508.field7055; var9++) {
                for (int var10 = 0; var10 < class439.field6036; var10++) {
                    for (int var11 = 0; var11 < class318.field4170; var11++) {
                        class203.field2818[var9][var10][var11] = 0L;
                    }
                }
            }
            class249.field3300 = 0;
        }
        class85.field1296 = null;
        class176.method1178(true);
        class232.field3129.method1775((byte) 127);
        class156.field2280 = null;
        class209.field2863 = null;
        class257.field3401 = null;
        class399.field5370 = null;
        class64.field1004 = null;
        class280.field3693 = null;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(I)V", line = 279)
    public static void method709(int arg0) {
        if (arg0 != 0) {
            field1482 = null;
        }
        field1481 = null;
        field1482 = null;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IBII)I", line = 300)
    public static final int method710(int arg0, byte arg1, int arg2, int arg3) {
        field1483++;
        if (arg1 != -29) {
            return 71;
        } else if (arg0 >= arg3) {
            return arg0 <= arg2 ? arg0 : arg2;
        } else {
            return arg3;
        }
    }
}
