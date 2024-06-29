import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public class class40 {

    @OriginalMember(owner = "client!hl", name = "h", descriptor = "I")
    public int field577 = -1;

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "I")
    public static int field571 = 0;

    @OriginalMember(owner = "client!hl", name = "c", descriptor = "Z")
    public static boolean field572 = false;

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "I")
    public static int field570;

    @OriginalMember(owner = "client!hl", name = "e", descriptor = "I")
    public static int field574;

    @OriginalMember(owner = "client!hl", name = "f", descriptor = "I")
    public static int field575;

    @OriginalMember(owner = "client!hl", name = "i", descriptor = "I")
    public static int field578;

    @OriginalMember(owner = "client!hl", name = "j", descriptor = "I")
    public static int field579;

    @OriginalMember(owner = "client!hl", name = "k", descriptor = "I")
    public static int field580;

    @OriginalMember(owner = "client!hl", name = "l", descriptor = "I")
    public static int field581;

    @OriginalMember(owner = "client!hl", name = "m", descriptor = "Lfl;")
    public class248 field582;

    @OriginalMember(owner = "client!hl", name = "d", descriptor = "[I")
    public int[] field573;

    @OriginalMember(owner = "client!hl", name = "g", descriptor = "[Ljava/lang/String;")
    public String[] field576;

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(II)V")
    public static final void method294(int arg0, int arg1) {
        field575++;
        if (arg0 != 24685) {
            method297((byte) 79);
        }
        class41 var2 = class221.method1492((byte) -42, arg1, 3);
        var2.method303(23981);
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(I)V")
    public static final void method295(int arg0) {
        class241.field3922.method1888(-111);
        field570++;
        class112.field1835.method1888(-71);
        if (arg0 < 93) {
            field581 = 91;
        }
    }

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "(II)V")
    public static final void method296(int arg0, int arg1) {
        class167.field2617.method1897(true, arg0);
        if (arg1 > -95) {
            field571 = 3;
        }
        field580++;
        class150.field2361.method1897(true, arg0);
        class268.field4281.method1897(true, arg0);
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(B)V")
    public static final void method297(byte arg0) {
        field574++;
        if (class255.field4087 == 0) {
            return;
        }
        try {
            int var1 = -10 % ((arg0 - 84) / 34);
            if (++class47.field688 > 2000) {
                if (class249.field4022 != null) {
                    class249.field4022.method899((byte) 120);
                    class249.field4022 = null;
                }
                if (class15.field234 >= 1) {
                    class171.field2677 = -5;
                    class255.field4087 = 0;
                    return;
                }
                class47.field688 = 0;
                class255.field4087 = 1;
                class15.field234++;
                if (class88.field1539 == class177.field2773) {
                    class177.field2773 = class184.field2845;
                } else {
                    class177.field2773 = class88.field1539;
                }
            }
            if (class255.field4087 == 1) {
                class194.field3073 = class179.field2788.method246(class173.field2719, class177.field2773, false);
                class255.field4087 = 2;
            }
            if (class255.field4087 == 2) {
                if (class194.field3073.field1255 == 2) {
                    throw new IOException();
                }
                if (class194.field3073.field1255 != 1) {
                    return;
                }
                class249.field4022 = new class130((Socket) class194.field3073.field1258, class179.field2788);
                class194.field3073 = null;
                class249.field4022.method897(client.field2435.field1535, client.field2435.field1471, 0, 5000);
                if (class222.field3412 != null) {
                    class222.field3412.method558(0);
                }
                if (class183.field2844 != null) {
                    class183.field2844.method558(0);
                }
                int var2 = class249.field4022.method906(-114);
                if (class222.field3412 != null) {
                    class222.field3412.method558(0);
                }
                if (class183.field2844 != null) {
                    class183.field2844.method558(0);
                }
                if (var2 != 21) {
                    class171.field2677 = var2;
                    class255.field4087 = 0;
                    class249.field4022.method899((byte) 2);
                    class249.field4022 = null;
                    return;
                }
                class255.field4087 = 3;
            }
            if (class255.field4087 == 3) {
                if (class249.field4022.method898(37) < 1) {
                    return;
                }
                class26.field347 = new String[class249.field4022.method906(-114)];
                class255.field4087 = 4;
            }
            if (class255.field4087 == 4 && class249.field4022.method898(37) >= class26.field347.length * 8) {
                class236.field3814.field1535 = 0;
                class249.field4022.method907((byte) 117, class26.field347.length * 8, class236.field3814.field1471, 0);
                for (int var3 = 0; var3 < class26.field347.length; var3++) {
                    class26.field347[var3] = class130.method903(-26704, class236.field3814.method625((byte) -22));
                }
                class171.field2677 = 21;
                class255.field4087 = 0;
                class249.field4022.method899((byte) -36);
                class249.field4022 = null;
            }
        } catch (IOException var4) {
            if (class249.field4022 != null) {
                class249.field4022.method899((byte) 115);
                class249.field4022 = null;
            }
            if (class15.field234 >= 1) {
                class171.field2677 = -4;
                class255.field4087 = 0;
            } else {
                class47.field688 = 0;
                if (class88.field1539 == class177.field2773) {
                    class177.field2773 = class184.field2845;
                } else {
                    class177.field2773 = class88.field1539;
                }
                class15.field234++;
                class255.field4087 = 1;
            }
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(III)V")
    public static final void method298(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class158.field2460; var3++) {
            class87 var4 = class218.method1466(var3, false);
            if (var4 != null) {
                int var5 = var4.field1469;
                if (var5 >= 0 && !class195.field3087.method496(255, var5)) {
                    var5 = -1;
                }
                int var9;
                if (var4.field1460 >= 0) {
                    int var6 = var4.field1460;
                    int var7 = (var6 & 0x7F) + arg0;
                    if (var7 < 0) {
                        var7 = 0;
                    } else if (var7 > 127) {
                        var7 = 127;
                    }
                    int var8 = (var6 + arg2 & 0xFC00) + (var6 & 0x380) + var7;
                    var9 = class195.field3077[class130.method902(105, 96, var8)];
                } else if (var5 >= 0) {
                    var9 = class195.field3077[class130.method902(124, 96, class195.field3087.method497(var5, (byte) -74))];
                } else if (var4.field1462 == -1) {
                    var9 = -1;
                } else {
                    int var10 = var4.field1462;
                    int var11 = (var10 & 0x7F) + arg0;
                    if (var11 < 0) {
                        var11 = 0;
                    } else if (var11 > 127) {
                        var11 = 127;
                    }
                    int var12 = (var10 & 0x380) + ((arg2 + var10 & 0xFC00) + var11);
                    var9 = class195.field3077[class130.method902(93, 96, var12)];
                }
                class271.field4358[var3 + 1] = var9;
            }
        }
        if (arg1 <= 63) {
            field581 = 47;
        }
        field578++;
    }
}
