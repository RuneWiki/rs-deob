import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public class class149 {

    @OriginalMember(owner = "client!ni", name = "c", descriptor = "Z")
    public boolean field2771 = true;

    @OriginalMember(owner = "client!ni", name = "p", descriptor = "I")
    public int field2784 = 0;

    @OriginalMember(owner = "client!ni", name = "n", descriptor = "I")
    public int field2782 = -1;

    @OriginalMember(owner = "client!ni", name = "i", descriptor = "I")
    public int field2777 = -1;

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "[Lhj;")
    public static class69[] field2770 = new class69[100];

    @OriginalMember(owner = "client!ni", name = "f", descriptor = "Lhj;")
    public static class69 field2774 = class181.method1318("null", (byte) -108);

    @OriginalMember(owner = "client!ni", name = "h", descriptor = "I")
    public static int field2776 = 0;

    @OriginalMember(owner = "client!ni", name = "j", descriptor = "I")
    public static int field2778 = 0;

    @OriginalMember(owner = "client!ni", name = "q", descriptor = "J")
    public static long field2785 = 0L;

    @OriginalMember(owner = "client!ni", name = "o", descriptor = "Lhj;")
    public static class69 field2783 = class181.method1318(")3", (byte) -121);

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "I")
    public static int field2769;

    @OriginalMember(owner = "client!ni", name = "d", descriptor = "I")
    public static int field2772;

    @OriginalMember(owner = "client!ni", name = "e", descriptor = "I")
    public static int field2773;

    @OriginalMember(owner = "client!ni", name = "g", descriptor = "I")
    public static int field2775;

    @OriginalMember(owner = "client!ni", name = "k", descriptor = "I")
    public static int field2779;

    @OriginalMember(owner = "client!ni", name = "l", descriptor = "I")
    public static int field2780;

    @OriginalMember(owner = "client!ni", name = "m", descriptor = "I")
    public static int field2781;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Lfh;II)V")
    public final void method1119(class128 arg0, int arg1, int arg2) {
        field2779++;
        while (true) {
            int var4 = arg0.method937(false);
            if (var4 == 0) {
                if (arg2 == 0) {
                    return;
                } else {
                    field2769 = -79;
                    return;
                }
            }
            this.method1122(arg0, var4, false, arg1);
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(I)V")
    public static final void method1120(int arg0) {
        field2772++;
        class49.field718.method1713(-123);
        if (arg0 < 1) {
            method1121(-3);
        }
    }

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "(I)V")
    public static final void method1121(int arg0) {
        field2781++;
        if (class266.field4735 == 0) {
            return;
        }
        try {
            if ((++class73.field1404) > 2000) {
                if (class135.field2532 != null) {
                    class135.field2532.method1270((byte) 41);
                    class135.field2532 = null;
                }
                if (class227.field4138 >= 1) {
                    class266.field4735 = 0;
                    class28.field407 = -5;
                    return;
                }
                class73.field1404 = 0;
                class227.field4138++;
                class266.field4735 = 1;
                if (class66.field1281 == class167.field3085) {
                    class167.field3085 = class202.field3645;
                } else {
                    class167.field3085 = class66.field1281;
                }
            }
            if (class266.field4735 == 1) {
                class11.field109 = class36.field508.method231(-23790, class167.field3085, class36.field507);
                class266.field4735 = 2;
            }
            if (class266.field4735 == 2) {
                if (class11.field109.field1663 == 2) {
                    throw new IOException();
                }
                if (class11.field109.field1663 != 1) {
                    return;
                }
                class135.field2532 = new class173((Socket) class11.field109.field1666, class36.field508);
                class11.field109 = null;
                class135.field2532.method1267(class48.field692.field2385, (byte) 6, 0, class48.field692.field2379);
                if (class29.field421 != null) {
                    class29.field421.method999((byte) 123);
                }
                if (class194.field3551 != null) {
                    class194.field3551.method999((byte) 120);
                }
                int var1 = class135.field2532.method1263(2);
                if (class29.field421 != null) {
                    class29.field421.method999((byte) 123);
                }
                if (class194.field3551 != null) {
                    class194.field3551.method999((byte) 127);
                }
                if (var1 != 21) {
                    class266.field4735 = 0;
                    class28.field407 = var1;
                    class135.field2532.method1270((byte) 41);
                    class135.field2532 = null;
                    return;
                }
                class266.field4735 = 3;
            }
            if (class266.field4735 == 3) {
                if (class135.field2532.method1269((byte) -85) < 1) {
                    return;
                }
                class221.field3964 = new class69[class135.field2532.method1263(2)];
                class266.field4735 = 4;
            }
            if (arg0 != -10963) {
                field2780 = 38;
            }
            if (class266.field4735 == 4 && class135.field2532.method1269((byte) -85) >= (class221.field3964.length * 8)) {
                class199.field3595.field2379 = 0;
                class135.field2532.method1265(class199.field3595.field2385, -74, 0, class221.field3964.length * 8);
                for (int var2 = 0; var2 < class221.field3964.length; var2++) {
                    class221.field3964[var2] = class101.method749(class199.field3595.method909(false), 25801);
                }
                class28.field407 = 21;
                class266.field4735 = 0;
                class135.field2532.method1270((byte) 41);
                class135.field2532 = null;
            }
        } catch (IOException var3) {
            if (class135.field2532 != null) {
                class135.field2532.method1270((byte) 41);
                class135.field2532 = null;
            }
            if (class227.field4138 >= 1) {
                class266.field4735 = 0;
                class28.field407 = -4;
            } else {
                class227.field4138++;
                class73.field1404 = 0;
                class266.field4735 = 1;
                if (class66.field1281 == class167.field3085) {
                    class167.field3085 = class202.field3645;
                } else {
                    class167.field3085 = class66.field1281;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Lfh;IZI)V")
    private final void method1122(class128 arg0, int arg1, boolean arg2, int arg3) {
        if (arg1 == 1) {
            this.field2784 = class71.method504(-126, arg0.method952((byte) -67));
        } else if (arg1 == 2) {
            this.field2777 = arg0.method937(false);
        } else if (arg1 == 3) {
            this.field2777 = arg0.method912(81);
            if (this.field2777 == 65535) {
                this.field2777 = -1;
            }
        } else if (arg1 == 5) {
            this.field2771 = false;
        } else if (arg1 == 7) {
            this.field2782 = class71.method504(-125, arg0.method952((byte) -121));
        } else if (arg1 == 8) {
            class40.field574 = arg3;
        } else if (arg1 == 9) {
            arg0.method912(-79);
        } else if (arg1 != 10) {
            if (arg1 == 11) {
                arg0.method937(false);
            } else if (arg1 != 12) {
                if (arg1 == 13) {
                    arg0.method952((byte) -105);
                } else if (arg1 == 14) {
                    arg0.method937(false);
                }
            }
        }
        if (!arg2) {
            field2773++;
        }
    }

    @OriginalMember(owner = "client!ni", name = "c", descriptor = "(I)V")
    public static void method1123(int arg0) {
        field2774 = null;
        field2783 = null;
        field2770 = null;
        if (arg0 != -9181) {
            method1123(-124);
        }
    }
}
