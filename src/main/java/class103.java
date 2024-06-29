import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class103 {

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "[Lcc;")
    public static class251[] field1708 = new class251[27];

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "Lda;")
    public static class275 field1709 = class255.method1672(99, "scrollen:");

    @OriginalMember(owner = "client!ki", name = "g", descriptor = "Lda;")
    public static class275 field1713 = class255.method1672(99, " steht bereits auf Ihrer Ignorieren)2Liste(Q");

    @OriginalMember(owner = "client!ki", name = "i", descriptor = "Lda;")
    public static class275 field1715 = null;

    @OriginalMember(owner = "client!ki", name = "o", descriptor = "I")
    public static int field1721 = 2;

    @OriginalMember(owner = "client!ki", name = "n", descriptor = "Lqe;")
    public static class42 field1720 = new class42(64);

    @OriginalMember(owner = "client!ki", name = "d", descriptor = "I")
    public static int field1710;

    @OriginalMember(owner = "client!ki", name = "e", descriptor = "I")
    public static int field1711;

    @OriginalMember(owner = "client!ki", name = "f", descriptor = "I")
    public static int field1712;

    @OriginalMember(owner = "client!ki", name = "k", descriptor = "I")
    public static int field1717;

    @OriginalMember(owner = "client!ki", name = "l", descriptor = "I")
    public static int field1718;

    @OriginalMember(owner = "client!ki", name = "m", descriptor = "I")
    public static int field1719;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "J")
    public long field1707;

    @OriginalMember(owner = "client!ki", name = "h", descriptor = "Lki;")
    public class103 field1714;

    @OriginalMember(owner = "client!ki", name = "j", descriptor = "Lki;")
    public class103 field1716;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(II)V")
    public static final void method735(int arg0, int arg1) {
        class252.field4474.method988(arg0, -125);
        if (arg1 == 1) {
            field1711++;
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(ZIIII)V")
    public static final void method736(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        field1717++;
        class89.field1507 = 0L;
        int var5 = class56.method353(true);
        int var6 = 83 / ((arg4 + 37) / 50);
        boolean var7 = false;
        if (var5 <= 0 == arg2 > 0) {
            var7 = true;
        }
        if (arg2 == 3 || var5 == 3) {
            arg0 = true;
        }
        if (class58.field975.startsWith("mac") && arg2 > 0) {
            arg0 = true;
        }
        if (arg0 && arg2 > 0) {
            var7 = true;
        }
        class252.method1658(arg3, var7, arg2, arg0, arg1, -1, var5);
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(I)Z")
    public final boolean method737(int arg0) {
        field1710++;
        if (this.field1714 == null) {
            return false;
        } else {
            if (arg0 != 18878) {
                method735(46, -86);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IB)Lda;")
    public static final class275 method738(int arg0, byte arg1) {
        field1719++;
        if (arg0 <= 0 || arg0 > 255) {
            throw new IllegalArgumentException();
        }
        class275 var2 = new class275();
        if (arg1 >= -118) {
            method735(37, 59);
        }
        var2.field4749 = new byte[1];
        var2.field4752 = 1;
        var2.field4749[0] = (byte) arg0;
        return var2;
    }

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "(I)V")
    public static final void method739(int arg0) {
        field1712++;
        if (arg0 != 0) {
            field1721 = -118;
        }
        if (class79.field1300 == 0) {
            return;
        }
        try {
            if (++class179.field3082 > 2000) {
                if (class52.field866 != null) {
                    class52.field866.method1402(1);
                    class52.field866 = null;
                }
                if (class52.field872 >= 1) {
                    class175.field3030 = -5;
                    class79.field1300 = 0;
                    return;
                }
                class179.field3082 = 0;
                class52.field872++;
                if (class80.field1312 == class37.field605) {
                    class80.field1312 = class224.field3779;
                } else {
                    class80.field1312 = class37.field605;
                }
                class79.field1300 = 1;
            }
            if (class79.field1300 == 1) {
                class162.field2838 = class3.field24.method373(arg0, class80.field1312, class226.field3827);
                class79.field1300 = 2;
            }
            if (class79.field1300 == 2) {
                if (class162.field2838.field4623 == 2) {
                    throw new IOException();
                }
                if (class162.field2838.field4623 != 1) {
                    return;
                }
                class52.field866 = new class219((Socket) class162.field2838.field4625, class3.field24);
                class162.field2838 = null;
                class52.field866.method1400(class149.field2597.field1381, 0, 5000, class149.field2597.field1392);
                if (class72.field1166 != null) {
                    class72.field1166.method880(arg0 + 61);
                }
                if (class120.field2160 != null) {
                    class120.field2160.method880(44);
                }
                int var1 = class52.field866.method1399(false);
                if (class72.field1166 != null) {
                    class72.field1166.method880(27);
                }
                if (class120.field2160 != null) {
                    class120.field2160.method880(73);
                }
                if (var1 != 21) {
                    class175.field3030 = var1;
                    class79.field1300 = 0;
                    class52.field866.method1402(1);
                    class52.field866 = null;
                    return;
                }
                class79.field1300 = 3;
            }
            if (class79.field1300 == 3) {
                if (class52.field866.method1404(-1048) < 1) {
                    return;
                }
                class138.field2422 = new class275[class52.field866.method1399(false)];
                class79.field1300 = 4;
            }
            if (class79.field1300 == 4 && class52.field866.method1404(arg0 - 1048) >= class138.field2422.length * 8) {
                class196.field3351.field1392 = 0;
                class52.field866.method1406(0, class196.field3351.field1381, class138.field2422.length * 8, -111);
                for (int var2 = 0; var2 < class138.field2422.length; var2++) {
                    class138.field2422[var2] = class181.method1212(0, class196.field3351.method610(false));
                }
                class175.field3030 = 21;
                class79.field1300 = 0;
                class52.field866.method1402(1);
                class52.field866 = null;
            }
        } catch (IOException var3) {
            if (class52.field866 != null) {
                class52.field866.method1402(1);
                class52.field866 = null;
            }
            if (class52.field872 < 1) {
                if (class80.field1312 == class37.field605) {
                    class80.field1312 = class224.field3779;
                } else {
                    class80.field1312 = class37.field605;
                }
                class79.field1300 = 1;
                class179.field3082 = 0;
                class52.field872++;
            } else {
                class79.field1300 = 0;
                class175.field3030 = -4;
            }
        }
    }

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "(I)V")
    public static void method740(int arg0) {
        field1720 = null;
        field1709 = null;
        field1713 = null;
        field1715 = null;
        if (arg0 != -1) {
            method735(15, 88);
        }
        field1708 = null;
    }

    @OriginalMember(owner = "client!ki", name = "d", descriptor = "(I)V")
    public final void method741(int arg0) {
        field1718++;
        if (arg0 == 3 && this.field1714 != null) {
            this.field1714.field1716 = this.field1716;
            this.field1716.field1714 = this.field1714;
            this.field1714 = null;
            this.field1716 = null;
        }
    }
}
