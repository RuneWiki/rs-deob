import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!so")
public class class497 {

    @OriginalMember(owner = "client!so", name = "d", descriptor = "I")
    public int field7463 = -1;

    @OriginalMember(owner = "client!so", name = "c", descriptor = "I")
    public int field7459 = -1;

    @OriginalMember(owner = "client!so", name = "k", descriptor = "I")
    public int field7464 = -1;

    @OriginalMember(owner = "client!so", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field7468 = new String[] { method3762(method3761("Up\u0016b\u0003")), method3762(method3761("Up\u0016a\u0003")), method3762(method3761("Up\u0016c\u0003")) };

    @OriginalMember(owner = "client!so", name = "f", descriptor = "I")
    public static int field7453 = 0;

    @OriginalMember(owner = "client!so", name = "i", descriptor = "I")
    public static int field7466 = -1;

    @OriginalMember(owner = "client!so", name = "l", descriptor = "Lqr;")
    public static class69 field7458 = new class69(8);

    @OriginalMember(owner = "client!so", name = "j", descriptor = "Lhl;")
    public static class556 field7467 = new class556(15, -1);

    @OriginalMember(owner = "client!so", name = "n", descriptor = "I")
    public int field7454;

    @OriginalMember(owner = "client!so", name = "h", descriptor = "I")
    public int field7455;

    @OriginalMember(owner = "client!so", name = "e", descriptor = "I")
    public int field7456;

    @OriginalMember(owner = "client!so", name = "a", descriptor = "I")
    public int field7457;

    @OriginalMember(owner = "client!so", name = "b", descriptor = "I")
    public static int field7460;

    @OriginalMember(owner = "client!so", name = "g", descriptor = "I")
    public int field7461;

    @OriginalMember(owner = "client!so", name = "o", descriptor = "I")
    public static int field7462;

    @OriginalMember(owner = "client!so", name = "m", descriptor = "I")
    public int field7465;

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(IZ)Lvb;")
    public static final class205 method3758(int arg0, boolean arg1) {
        try {
            if (!arg1) {
                field7466 = -105;
            }
            field7460++;
            if (arg0 == 0) {
                if ((double) class770.field11259 == 3.0D) {
                    return class696.field10030;
                }
                if ((double) class770.field11259 == 4.0D) {
                    return class634.field9105;
                }
                if ((double) class770.field11259 == 6.0D) {
                    return class628.field9045;
                }
                if ((double) class770.field11259 >= 8.0D) {
                    return class618.field8929;
                }
            } else if (arg0 == 1) {
                if ((double) class770.field11259 == 3.0D) {
                    return class628.field9045;
                }
                if ((double) class770.field11259 == 4.0D) {
                    return class618.field8929;
                }
                if ((double) class770.field11259 == 6.0D) {
                    return class197.field3135;
                }
                if ((double) class770.field11259 >= 8.0D) {
                    return class499.field7486;
                }
            } else if (arg0 == 2) {
                if ((double) class770.field11259 == 3.0D) {
                    return class197.field3135;
                }
                if ((double) class770.field11259 == 4.0D) {
                    return class499.field7486;
                }
                if ((double) class770.field11259 == 6.0D) {
                    return class786.field11498;
                }
                if ((double) class770.field11259 >= 8.0D) {
                    return class328.field5385;
                }
            }
            return null;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field7468[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(B)V")
    public static final void method3759(byte arg0) {
        try {
            field7462++;
            client var1 = class392.field6245;
            synchronized (class392.field6245) {
                if (class82.field1247 == null) {
                    Container var2;
                    if (class517.field7660 != null) {
                        var2 = class517.field7660;
                    } else if (class476.field7255 == null) {
                        var2 = class540.field7955;
                    } else {
                        var2 = class476.field7255;
                    }
                    class413.field6568 = var2.getSize().width;
                    class464.field7131 = var2.getSize().height;
                    if (class517.field7660 == var2) {
                        Insets var3 = class517.field7660.getInsets();
                        class413.field6568 -= var3.left + var3.right;
                        class464.field7131 -= var3.top + var3.bottom;
                    }
                    if (class466.method3598(1) == 1) {
                        class250.field3835 = 0;
                        class64.field881 = class696.field10028;
                        class333.field5444 = class518.field7672;
                        class687.field9928 = (class413.field6568 - class696.field10028) / 2;
                    } else {
                        class376.method3095((byte) 104);
                    }
                    if (class710.field10281 != class417.field6596) {
                        boolean var10000;
                        if (class64.field881 < 1024 && class333.field5444 < 768) {
                            var10000 = true;
                        } else {
                            var10000 = false;
                        }
                    }
                    class442.field6902.setSize(class64.field881, class333.field5444);
                    if (class662.field9437 != null) {
                        if (class316.field5141) {
                            class297.method2564(class442.field6902, arg0 ^ 0xFFFFFFE6);
                        } else {
                            class662.field9437.method232(class442.field6902, class64.field881, class333.field5444);
                        }
                    }
                    if (class517.field7660 == var2) {
                        Insets var4 = class517.field7660.getInsets();
                        class442.field6902.setLocation(class687.field9928 + var4.left, class250.field3835 + var4.top);
                    } else {
                        class442.field6902.setLocation(class687.field9928, class250.field3835);
                    }
                    if (class317.field5175 != -1) {
                        class210.method1900(true, (byte) 44);
                    }
                    if (arg0 != -27) {
                        field7467 = null;
                    }
                    class592.method4345(true);
                }
            }
        } catch (RuntimeException var9) {
            throw class590.method4333(var9, field7468[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(I)V")
    public static void method3760(int arg0) {
        try {
            if (arg0 == -1) {
                field7458 = null;
                field7467 = null;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field7468[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!so", name = "<init>", descriptor = "(Loi;)V")
    public class497(class77 arg0) {
    }

    @OriginalMember(owner = "client!so", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3761(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x2B);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!so", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3762(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 38;
                    break;
                case 1:
                    var10005 = 31;
                    break;
                case 2:
                    var10005 = 56;
                    break;
                case 3:
                    var10005 = 32;
                    break;
                default:
                    var10005 = 43;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
