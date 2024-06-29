import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class252 {

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "Loh;")
    public static class258 field4332 = class153.method1046("::rebuild", 126);

    @OriginalMember(owner = "client!fc", name = "o", descriptor = "Lvf;")
    public static class39 field4344 = null;

    @OriginalMember(owner = "client!fc", name = "n", descriptor = "Loh;")
    private static class258 field4343 = class153.method1046("purple:", 99);

    @OriginalMember(owner = "client!fc", name = "p", descriptor = "Loh;")
    public static class258 field4345 = field4343;

    @OriginalMember(owner = "client!fc", name = "m", descriptor = "Z")
    public static boolean field4342 = false;

    @OriginalMember(owner = "client!fc", name = "l", descriptor = "Loh;")
    private static class258 field4341 = class153.method1046(" has logged in)3", 87);

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "Loh;")
    public static class258 field4333 = field4341;

    @OriginalMember(owner = "client!fc", name = "k", descriptor = "Loh;")
    private static class258 field4340 = class153.method1046("Loaded interfaces", 93);

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "Loh;")
    public static class258 field4330 = class153.method1046("Starte 3D)2Softwarebibliothek)3", 120);

    @OriginalMember(owner = "client!fc", name = "r", descriptor = "Loh;")
    public static class258 field4347 = field4343;

    @OriginalMember(owner = "client!fc", name = "q", descriptor = "Loh;")
    public static class258 field4346 = field4340;

    @OriginalMember(owner = "client!fc", name = "i", descriptor = "[I")
    public static int[] field4338 = new int[25];

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "I")
    public static int field4331;

    @OriginalMember(owner = "client!fc", name = "e", descriptor = "I")
    public static int field4334;

    @OriginalMember(owner = "client!fc", name = "f", descriptor = "I")
    public static int field4335;

    @OriginalMember(owner = "client!fc", name = "g", descriptor = "I")
    public static int field4336;

    @OriginalMember(owner = "client!fc", name = "h", descriptor = "I")
    public static int field4337;

    @OriginalMember(owner = "client!fc", name = "j", descriptor = "I")
    public static int field4339;

    @OriginalMember(owner = "client!fc", name = "s", descriptor = "I")
    public static int field4348;

    @OriginalMember(owner = "client!fc", name = "t", descriptor = "I")
    public static int field4349;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(ZLoh;Z)V", line = 17)
    public static final void method1705(boolean arg0, class258 arg1, boolean arg2) {
        if (arg0) {
            return;
        }
        field4331++;
        if (!arg2) {
            try {
                field4344.getAppletContext().showDocument(arg1.method1802((byte) 53, field4344.getCodeBase()), "_top");
            } catch (Exception var7) {
            }
            return;
        }
        if (class257.field4390 && class65.field1139) {
            try {
                class200.method1329("openjs", new Object[] { arg1.method1802((byte) 76, field4344.getCodeBase()).toString() }, (byte) 13, class297.field5086.field5061);
                return;
            } catch (Throwable var8) {
            }
        }
        try {
            field4344.getAppletContext().showDocument(arg1.method1802((byte) 93, field4344.getCodeBase()), "_blank");
        } catch (Exception var6) {
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(B)V", line = 68)
    public static void method1706(byte arg0) {
        field4345 = null;
        field4347 = null;
        field4346 = null;
        field4343 = null;
        field4330 = null;
        field4338 = null;
        field4341 = null;
        field4332 = null;
        field4340 = null;
        if (arg0 == -23) {
            field4333 = null;
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(ZZ)V", line = 87)
    public static final void method1707(boolean arg0, boolean arg1) {
        if ((class152.field2606.field912 >> 7) == class10.field118 && (class152.field2606.field934 >> 7) == class6.field82) {
            class10.field118 = 0;
        }
        field4337++;
        int var2 = class14.field177;
        if (arg1) {
            var2 = 1;
        }
        for (int var3 = 0; var3 < var2; var3++) {
            class231 var4;
            long var5;
            if (arg1) {
                var4 = class152.field2606;
                var5 = 8791798054912L;
            } else {
                var5 = (long) class140.field2390[var3] << 32;
                var4 = class38.field527[class140.field2390[var3]];
            }
            if (var4 != null && var4.method453((byte) -67)) {
                var4.field3997 = false;
                if ((class146.field2477 && class14.field177 > 200 || class14.field177 > 50) && !arg1 && var4.field929 == var4.field909) {
                    var4.field3997 = true;
                }
                int var7 = var4.field934 >> 7;
                int var8 = var4.field912 >> 7;
                if (var8 >= 0 && var8 < 104 && var7 >= 0 && var7 < 104) {
                    if (var4.field3984 == null || class202.field3498 < var4.field4004 || class202.field3498 >= var4.field3992) {
                        if (var4.method447(18123) == 1 && (var4.field912 & 0x7F) == 64 && (var4.field934 & 0x7F) == 64) {
                            if (class60.field1000[var8][var7] == class61.field1035) {
                                continue;
                            }
                            class60.field1000[var8][var7] = class61.field1035;
                        }
                        var4.field908 = class228.method1525(true, class272.field4704, var4.field934, var4.field912);
                        class317.method2181(class272.field4704, var4.field912, var4.field934, var4.field908, (var4.method447(18123) - 1) * 64 + 60, var4, var4.field923, var5, var4.field932);
                    } else {
                        var4.field3997 = false;
                        var4.field908 = class228.method1525(true, class272.field4704, var4.field934, var4.field912);
                        class15.method103(class272.field4704, var4.field912, var4.field934, var4.field908, var4, var4.field923, var5, var4.field4005, var4.field4014, var4.field3972, var4.field3974);
                    }
                }
            }
        }
        if (!arg0) {
            method1708(false, (byte) 82, -11, -126, 27, -0.17983365F, -77, 90);
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(ZBIIIFII)[I", line = 170)
    public static final int[] method1708(boolean arg0, byte arg1, int arg2, int arg3, int arg4, float arg5, int arg6, int arg7) {
        field4335++;
        int[] var8 = new int[arg2];
        if (arg1 != -73) {
            return (int[]) null;
        }
        class30 var9 = new class30();
        var9.field348 = arg0;
        var9.field357 = (int) (arg5 * 4096.0F);
        var9.field362 = arg7;
        var9.field364 = arg6;
        var9.field355 = arg4;
        var9.field365 = arg3;
        var9.method223(arg1 + 11208);
        class301.method2115(arg2, 1, (byte) 58);
        var9.method222(0, -114, var8);
        return var8;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;I)I", line = 195)
    public static final int method1709(KeyEvent arg0, int arg1) {
        if (arg1 != -257) {
            return -53;
        }
        int var2 = arg0.getKeyChar();
        field4348++;
        if (var2 == 8364) {
            return 128;
        } else {
            if (var2 <= 0 || var2 >= 256) {
                var2 = -1;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(ILgb;I)Lrm;", line = 217)
    public static final class113 method1710(int arg0, class213 arg1, int arg2) {
        field4336++;
        if (arg0 != 64) {
            method1708(true, (byte) 124, 119, -128, 62, 0.78690326F, -117, -101);
        }
        return class286.method2016(arg1, false, arg2) ? class6.method35(-24600) : null;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lkd;Lgb;ILgb;)V", line = 236)
    public static final void method1711(class316 arg0, class213 arg1, int arg2, class213 arg3) {
        class151.field2578 = arg3;
        class93.field1643 = arg1;
        if (arg2 != 20680) {
            method1708(true, (byte) -92, 39, 19, 20, 0.998028F, -107, 25);
        }
        field4349++;
        class23.field282 = arg0;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIIIIIB)I", line = 263)
    public static final int method1712(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        int var7 = arg0 & 0x3;
        field4334++;
        if (arg6 != 41) {
            field4341 = (class258) null;
        }
        if ((arg1 & 0x1) == 1) {
            int var8 = arg2;
            arg2 = arg5;
            arg5 = var8;
        }
        if (var7 == 0) {
            return arg3;
        } else if (var7 == 1) {
            return 7 + 1 - (arg4 + arg2);
        } else if (var7 == 2) {
            return 7 - arg3 - (arg5 + -1);
        } else {
            return arg4;
        }
    }
}
