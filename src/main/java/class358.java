import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gq")
public class class358 extends class339 {

    @OriginalMember(owner = "client!gq", name = "j", descriptor = "F")
    public static float field4871 = 1.0F;

    @OriginalMember(owner = "client!gq", name = "k", descriptor = "I")
    public static int field4872;

    @OriginalMember(owner = "client!gq", name = "l", descriptor = "Lie;")
    public static class6 field4873;

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(III)V")
    public static final void method2121(int arg0, int arg1, int arg2) {
        if ((class416.field5998 < class416.field5996)) {
            class416.field5998 = (float) ((double) class416.field5998 / 30.0D + (double) class416.field5998);
            if (class416.field5998 > class416.field5996) {
                class416.field5998 = class416.field5996;
            }
            class104.method631((byte) 31);
            class416.field5997 = (int) class416.field5998 >> 1;
            class416.field5999 = class517.method3093(-16384, class416.field5997);
        } else if (class416.field5996 < class416.field5998) {
            class416.field5998 = (float) ((double) class416.field5998 - (double) class416.field5998 / 30.0D);
            if (class416.field5998 < class416.field5996) {
                class416.field5998 = class416.field5996;
            }
            class104.method631((byte) 31);
            class416.field5997 = (int) class416.field5998 >> 1;
            class416.field5999 = class517.method3093(-16384, class416.field5997);
        }
        if (arg2 != 16) {
            return;
        }
        field4872++;
        if (class508.field7367 != -1 && class178.field2308 != -1) {
            int var3 = class508.field7367 - class49.field556;
            if (var3 < 2 || var3 > 2) {
                var3 /= 8;
            }
            int var4 = class178.field2308 - class163.field2133;
            if (var4 < 2 || var4 > 2) {
                var4 /= 8;
            }
            class49.field556 += var3;
            class163.field2133 += var4;
            if (var3 == 0 && var4 == 0) {
                class178.field2308 = -1;
                class508.field7367 = -1;
            }
            class104.method631((byte) 31);
        }
        if (class509.field7386 <= 0) {
            class307.field4117 = -1;
            class183.field2379 = -1;
        } else {
            class53.field615--;
            if (class53.field615 == 0) {
                class53.field615 = 100;
                class509.field7386--;
            }
        }
        if (!class121.field1571 || class342.field4590 == null) {
            return;
        }
        for (class320 var5 = (class320) class342.field4590.method970(12); var5 != null; var5 = (class320) class342.field4590.method976((byte) 5)) {
            class48 var6 = class416.field5987.method993(var5.field4272.field7646, -21143);
            if (var5.method1898(arg1, false, arg0)) {
                if (var6.field523 != null) {
                    if (var6.field523[4] != null) {
                        class144.method878(-1, var6.field512, 1004, var6.field523[4], var6.field522, 0, -1, (long) var5.field4272.field7646, true, false, (byte) -78);
                    }
                    if (var6.field523[3] != null) {
                        class144.method878(-1, var6.field512, 1003, var6.field523[3], var6.field522, 0, -1, (long) var5.field4272.field7646, true, false, (byte) -73);
                    }
                    if (var6.field523[2] != null) {
                        class144.method878(-1, var6.field512, 1010, var6.field523[2], var6.field522, 0, -1, (long) var5.field4272.field7646, true, false, (byte) -119);
                    }
                    if (var6.field523[1] != null) {
                        class144.method878(-1, var6.field512, 1001, var6.field523[1], var6.field522, 0, -1, (long) var5.field4272.field7646, true, false, (byte) -90);
                    }
                    if (var6.field523[0] != null) {
                        class144.method878(-1, var6.field512, 1007, var6.field523[0], var6.field522, 0, -1, (long) var5.field4272.field7646, true, false, (byte) -83);
                    }
                }
                if (!var5.field4272.field7652) {
                    var5.field4272.field7652 = true;
                    class432.method2650(class166.field2150, var5.field4272.field7646, var6.field512);
                }
                if (var5.field4272.field7652) {
                    class432.method2650(class51.field580, var5.field4272.field7646, var6.field512);
                }
            } else if (var5.field4272.field7652) {
                var5.field4272.field7652 = false;
                class432.method2650(class59.field688, var5.field4272.field7646, var6.field512);
            }
        }
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(IIILvv;)V")
    public static final void method2122(int arg0, int arg1, int arg2, class215 arg3) {
        class498 var4 = class61.method369(arg0, arg1, arg2);
        if (var4 != null) {
            var4.field7268 = arg3;
        }
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(IIII)V")
    public static final void method2123(int arg0, int arg1, int arg2, int arg3) {
        class498 var4 = class186.field2421[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class100 var5 = var4.field7259;
        class100 var6 = var4.field7271;
        if (var5 != null) {
            var5.field1375 = var5.field1375 * arg3 / (0x10 << class351.field4688 - 7);
            var5.field1368 = var5.field1368 * arg3 / (0x10 << class351.field4688 - 7);
        }
        if (var6 != null) {
            var6.field1375 = var6.field1375 * arg3 / (0x10 << class351.field4688 - 7);
            var6.field1368 = var6.field1368 * arg3 / (0x10 << class351.field4688 - 7);
        }
    }

    @OriginalMember(owner = "client!gq", name = "b", descriptor = "(I)V")
    public static void method2124(int arg0) {
        field4873 = null;
        if (arg0 != -19427) {
            method2121(-67, -42, -9);
        }
    }

    static {
        new class305("Unable to send message - player not on your friends list.", "Nachricht kann nicht geschickt werden,", "Impossible d'envoyer un message - joueur non inclus dans votre liste d'amis.", "Não foi possível enviar a mensagem. O jogador não está na sua lista de amigos.");
    }
}
