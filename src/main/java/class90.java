import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class90 extends Canvas {

    @OriginalMember(owner = "client!eh", name = "k", descriptor = "Ljava/awt/Component;")
    private Component field1370;

    @OriginalMember(owner = "client!eh", name = "m", descriptor = "Ljava/lang/String;")
    public static String field1372 = "wave2:";

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "I")
    public static int field1360;

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "I")
    public static int field1361;

    @OriginalMember(owner = "client!eh", name = "d", descriptor = "I")
    public static int field1363;

    @OriginalMember(owner = "client!eh", name = "f", descriptor = "I")
    public static int field1365;

    @OriginalMember(owner = "client!eh", name = "g", descriptor = "I")
    public static int field1366;

    @OriginalMember(owner = "client!eh", name = "h", descriptor = "I")
    public static int field1367;

    @OriginalMember(owner = "client!eh", name = "i", descriptor = "I")
    public static int field1368;

    @OriginalMember(owner = "client!eh", name = "j", descriptor = "I")
    public static int field1369;

    @OriginalMember(owner = "client!eh", name = "l", descriptor = "I")
    public static int field1371;

    @OriginalMember(owner = "client!eh", name = "n", descriptor = "I")
    public static int field1373;

    @OriginalMember(owner = "client!eh", name = "o", descriptor = "I")
    public static int field1374;

    @OriginalMember(owner = "client!eh", name = "p", descriptor = "I")
    public static int field1375;

    @OriginalMember(owner = "client!eh", name = "q", descriptor = "I")
    public static int field1376;

    @OriginalMember(owner = "client!eh", name = "r", descriptor = "I")
    public static int field1377;

    @OriginalMember(owner = "client!eh", name = "e", descriptor = "Lpk;")
    public static class237 field1364;

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "Ln;")
    public static class283 field1362;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIIII)V")
    public static final void method680(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1361++;
        class220.field3433 = class133.field1956 * arg3 / arg2;
        class12.field171 = class235.field3619 * arg1 / arg0;
        class244.field3784 = -1;
        class66.field1087 = arg4;
        class160.method1083(arg4 ^ 0xFFFF883A);
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(Lqf;ZZZIILqf;)I")
    public static final int method681(class293 arg0, boolean arg1, boolean arg2, boolean arg3, int arg4, int arg5, class293 arg6) {
        field1375++;
        if (!arg2) {
            method681((class293) null, true, true, false, 104, -35, (class293) null);
        }
        int var7 = class154.method1042(arg3, arg4, -25585, arg0, arg6);
        if (var7 != 0) {
            return arg3 ? -var7 : var7;
        } else if (arg5 == -1) {
            return 0;
        } else {
            int var8 = class154.method1042(arg1, arg5, -25585, arg0, arg6);
            return arg1 ? -var8 : var8;
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(B)V")
    public static final void method682(byte arg0) {
        if (class26.field509.toLowerCase().indexOf("microsoft") == -1) {
            class162.field2343[45] = 26;
            if (class26.field519 == null) {
                class162.field2343[192] = 58;
                class162.field2343[222] = 59;
            } else {
                class162.field2343[520] = 59;
                class162.field2343[222] = 58;
                class162.field2343[192] = 28;
            }
            class162.field2343[47] = 73;
            class162.field2343[92] = 74;
            class162.field2343[93] = 43;
            class162.field2343[59] = 57;
            class162.field2343[61] = 27;
            class162.field2343[91] = 42;
            class162.field2343[44] = 71;
            class162.field2343[46] = 72;
        } else {
            class162.field2343[187] = 27;
            class162.field2343[186] = 57;
            class162.field2343[221] = 43;
            class162.field2343[222] = 59;
            class162.field2343[192] = 58;
            class162.field2343[188] = 71;
            class162.field2343[190] = 72;
            class162.field2343[191] = 73;
            class162.field2343[189] = 26;
            class162.field2343[223] = 28;
            class162.field2343[220] = 74;
            class162.field2343[219] = 42;
        }
        field1374++;
        int var1 = -111 / ((66 - arg0) / 53);
    }

    @OriginalMember(owner = "client!eh", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field1373++;
        this.field1370.update(arg0);
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(I)Lji;")
    public static final class256 method683(int arg0) {
        field1360++;
        int var1 = class27.field525[0] * class173.field2530[0];
        byte[] var2 = class209.field3125[0];
        int[] var3 = new int[var1];
        for (int var4 = 0; var4 < var1; var4++) {
            var3[var4] = class15.field221[class131.method904(255, var2[var4])];
        }
        class289 var5 = new class289(client.field729, class126.field1857, class135.field1973[0], class5.field69[arg0], class27.field525[0], class173.field2530[0], var3);
        class293.method1936(arg0 - 48);
        return var5;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(DI)V")
    public static final void method684(double arg0, int arg1) {
        if (class112.field1715 != arg0) {
            for (int var3 = 0; var3 < 256; var3++) {
                int var4 = (int) (Math.pow((double) var3 / 255.0D, arg0) * 255.0D);
                class61.field1002[var3] = var4 > 255 ? 255 : var4;
            }
            class112.field1715 = arg0;
        }
        field1365++;
        if (arg1 != 255) {
            method688((byte) -62);
        }
    }

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "(I)Ljg;")
    public static final class287 method685(int arg0) {
        field1369++;
        if (arg0 != 16560) {
            return null;
        }
        try {
            return (class287) Class.forName("pa").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "(I)V")
    public static void method686(int arg0) {
        field1372 = null;
        if (arg0 == 71) {
            field1362 = null;
            field1364 = null;
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(ILca;IIIZIIZIII)V")
    public static final void method687(int arg0, class54 arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, boolean arg8, int arg9, int arg10, int arg11) {
        if (arg7 >= 0 && arg7 < 104 && arg3 >= 0 && arg3 < 104) {
            if (!arg8 && !arg5) {
                class247.field3844[arg0][arg7][arg3] = 0;
            }
            while (true) {
                int var12 = arg1.method407(255);
                if (var12 == 0) {
                    if (arg8) {
                        class166.field2451[0][arg4 + arg7][arg3 + arg10] = class287.field4389[0][arg4 + arg7][arg3 + arg10];
                    } else if (arg0 == 0) {
                        class166.field2451[0][arg4 + arg7][arg3 + arg10] = -class133.method917(0, arg11 + 932731, 556238 - -arg9) * 8;
                    } else {
                        class166.field2451[arg0][arg4 + arg7][arg3 + arg10] = class166.field2451[arg0 - 1][arg4 + arg7][arg3 + arg10] - 240;
                    }
                    break;
                }
                if (var12 == 1) {
                    int var13 = arg1.method407(255);
                    if (arg8) {
                        class166.field2451[0][arg4 + arg7][arg3 + arg10] = var13 * 8 + class287.field4389[0][arg4 + arg7][arg3 + arg10];
                    } else {
                        if (var13 == 1) {
                            var13 = 0;
                        }
                        if (arg0 == 0) {
                            class166.field2451[0][arg4 + arg7][arg3 + arg10] = -var13 * 8;
                        } else {
                            class166.field2451[arg0][arg4 + arg7][arg3 + arg10] = class166.field2451[arg0 - 1][arg4 + arg7][arg3 + arg10] - (var13 * 8);
                        }
                    }
                    break;
                }
                if (var12 <= 49) {
                    if (arg5) {
                        arg1.method407(255);
                    } else {
                        class186.field2719[arg0][arg7][arg3] = arg1.method459(false);
                        class167.field2460[arg0][arg7][arg3] = (byte) ((var12 - 2) / 4);
                        class264.field4130[arg0][arg7][arg3] = (byte) class131.method904(arg2 + var12 - 2, 3);
                    }
                } else if (var12 <= 81) {
                    if (!arg8 && !arg5) {
                        class247.field3844[arg0][arg7][arg3] = (byte) (var12 - 49);
                    }
                } else if (!arg5) {
                    class58.field957[arg0][arg7][arg3] = (byte) (var12 - 81);
                }
            }
        } else {
            while (true) {
                int var14 = arg1.method407(arg6 ^ 0xFFFFDFF6);
                if (var14 == 0) {
                    break;
                }
                if (var14 == 1) {
                    arg1.method407(arg6 + 8694);
                    break;
                }
                if (var14 <= 49) {
                    arg1.method407(255);
                }
            }
        }
        field1371++;
        if (arg6 != -8439) {
            field1377 = 125;
        }
    }

    @OriginalMember(owner = "client!eh", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        field1363++;
        this.field1370.paint(arg0);
    }

    @OriginalMember(owner = "client!eh", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class90(Component arg0) {
        this.field1370 = arg0;
    }

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "(B)V")
    public static final void method688(byte arg0) {
        class231.field3576.method944(65535);
        field1368++;
        if (arg0 != -69) {
            field1364 = null;
        }
    }
}
