import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class225 {

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "I")
    public int field3614 = 0;

    @OriginalMember(owner = "client!fe", name = "k", descriptor = "Z")
    public boolean field3623 = true;

    @OriginalMember(owner = "client!fe", name = "g", descriptor = "I")
    public int field3619 = -1;

    @OriginalMember(owner = "client!fe", name = "m", descriptor = "I")
    public int field3625 = -1;

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "Ljava/lang/String;")
    public static String field3615 = "flash1:";

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "[Z")
    public static boolean[] field3616 = new boolean[100];

    @OriginalMember(owner = "client!fe", name = "j", descriptor = "I")
    public static int field3622 = 0;

    @OriginalMember(owner = "client!fe", name = "e", descriptor = "[S")
    public static short[] field3617 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "I")
    public static int field3613;

    @OriginalMember(owner = "client!fe", name = "f", descriptor = "I")
    public static int field3618;

    @OriginalMember(owner = "client!fe", name = "h", descriptor = "I")
    public static int field3620;

    @OriginalMember(owner = "client!fe", name = "i", descriptor = "I")
    public static int field3621;

    @OriginalMember(owner = "client!fe", name = "n", descriptor = "I")
    public static int field3626;

    @OriginalMember(owner = "client!fe", name = "o", descriptor = "I")
    public static int field3627;

    @OriginalMember(owner = "client!fe", name = "p", descriptor = "I")
    public static int field3628;

    @OriginalMember(owner = "client!fe", name = "l", descriptor = "Leh;")
    public static class137 field3624;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lpd;III)V")
    private final void method1588(class96 arg0, int arg1, int arg2, int arg3) {
        field3627++;
        if (arg3 > -69) {
            field3622 = 109;
        }
        if (arg1 == 1) {
            this.field3614 = class177.method1232(arg0.method598(-1235752501), -125);
        } else if (arg1 == 2) {
            this.field3619 = arg0.method584(255);
        } else if (arg1 == 3) {
            this.field3619 = arg0.method549(255);
            if (this.field3619 == 65535) {
                this.field3619 = -1;
                return;
            }
        } else if (arg1 == 5) {
            this.field3623 = false;
        } else if (arg1 == 7) {
            this.field3625 = class177.method1232(arg0.method598(-1235752501), -79);
            return;
        } else {
            if (arg1 == 8) {
                class175.field2788 = arg2;
            } else if (arg1 == 9) {
                arg0.method549(255);
                return;
            } else if (arg1 != 10) {
                if (arg1 == 11) {
                    arg0.method584(255);
                    return;
                }
                if (arg1 != 12) {
                    if (arg1 == 13) {
                        arg0.method598(-1235752501);
                    } else if (arg1 == 14) {
                        arg0.method584(255);
                        return;
                    }
                    return;
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIIII)V")
    public static final void method1589(int arg0, int arg1, int arg2, int arg3, int arg4) {
        for (int var5 = arg3; var5 < class221.field3561; var5++) {
            if (arg2 < (class233.field3858[var5] + class180.field2869[var5]) && arg2 + arg4 > class233.field3858[var5] && arg0 < (class256.field4160[var5] + class148.field2328[var5]) && arg0 + arg1 > class148.field2328[var5]) {
                class21.field279[var5] = true;
            }
        }
        field3618++;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Leh;B)V")
    public static final void method1590(class137 arg0, byte arg1) {
        class86.field1059 = arg0.method929((byte) -13, "titlebg");
        if (arg1 != -56) {
            field3617 = null;
        }
        field3613++;
        class106.field1423 = arg0.method929((byte) 122, "logo");
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Z)V")
    public static void method1591(boolean arg0) {
        field3617 = null;
        if (!arg0) {
            field3624 = null;
            field3615 = null;
            field3616 = null;
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(ILjava/awt/Component;II)Lmf;")
    public static final class161 method1592(int arg0, Component arg1, int arg2, int arg3) {
        field3626++;
        try {
            Class var4 = Class.forName("l");
            class161 var5 = (class161) var4.getDeclaredConstructor().newInstance();
            var5.method48(24848, arg3, arg2, arg1);
            if (arg0 != 1) {
                field3617 = null;
            }
            return var5;
        } catch (Throwable var7) {
            class42 var6 = new class42();
            var6.method48(24848, arg3, arg2, arg1);
            return var6;
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(I)V")
    public static final void method1593(int arg0) {
        class96.field1283.method1927(-27511);
        int var1 = class96.field1283.method1919(8, 5);
        if (class134.field2122 > var1) {
            for (int var2 = var1; var2 < class134.field2122; var2++) {
                class265.field4274[class234.field3876++] = class11.field121[var2];
            }
        }
        if (arg0 != 2) {
            return;
        }
        field3621++;
        if (class134.field2122 < var1) {
            throw new RuntimeException("gnpov1");
        }
        class134.field2122 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class11.field121[var3];
            class200 var5 = class265.field4273[var4];
            int var6 = class96.field1283.method1919(1, 5);
            if (var6 == 0) {
                class11.field121[class134.field2122++] = var4;
                var5.field3797 = class73.field924;
            } else {
                int var7 = class96.field1283.method1919(2, 5);
                if (var7 == 0) {
                    class11.field121[class134.field2122++] = var4;
                    var5.field3797 = class73.field924;
                    class178.field2832[class126.field2027++] = var4;
                } else if (var7 == 1) {
                    class11.field121[class134.field2122++] = var4;
                    var5.field3797 = class73.field924;
                    int var8 = class96.field1283.method1919(3, arg0 ^ 0x7);
                    var5.method1643(false, 1, var8);
                    int var9 = class96.field1283.method1919(1, 5);
                    if (var9 == 1) {
                        class178.field2832[class126.field2027++] = var4;
                    }
                } else if (var7 == 2) {
                    class11.field121[class134.field2122++] = var4;
                    var5.field3797 = class73.field924;
                    if (class96.field1283.method1919(1, 5) == 1) {
                        int var11 = class96.field1283.method1919(3, 5);
                        var5.method1643(false, 2, var11);
                        int var12 = class96.field1283.method1919(3, arg0 ^ 0x7);
                        var5.method1643(false, 2, var12);
                    } else {
                        int var10 = class96.field1283.method1919(3, 5);
                        var5.method1643(false, 0, var10);
                    }
                    int var13 = class96.field1283.method1919(1, 5);
                    if (var13 == 1) {
                        class178.field2832[class126.field2027++] = var4;
                    }
                } else if (var7 == 3) {
                    class265.field4274[class234.field3876++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(I)V")
    public static final void method1594(int arg0) {
        for (int var1 = -1; var1 < class77.field970; var1++) {
            int var3;
            if (var1 == -1) {
                var3 = 2047;
            } else {
                var3 = class27.field385[var1];
            }
            class259 var4 = class89.field1113[var3];
            if (var4 != null) {
                class127.method859(-119, var4.method1638(-6377), var4);
            }
        }
        int var2 = 45 / ((66 - arg0) / 57);
        field3620++;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(BILpd;)V")
    public final void method1595(byte arg0, int arg1, class96 arg2) {
        if (arg0 <= 30) {
            method1591(true);
        }
        field3628++;
        while (true) {
            int var4 = arg2.method584(255);
            if (var4 == 0) {
                return;
            }
            this.method1588(arg2, var4, arg1, -73);
        }
    }
}
