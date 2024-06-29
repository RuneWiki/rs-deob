import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fr")
public class class497 {

    @OriginalMember(owner = "client!fr", name = "d", descriptor = "Lea;")
    public class115 field7365 = new class115();

    @OriginalMember(owner = "client!fr", name = "r", descriptor = "Lgn;")
    public static class526 field7379 = new class526(4, 7);

    @OriginalMember(owner = "client!fr", name = "s", descriptor = "Ldp;")
    public static class347 field7380 = new class347("Please wait - attempting to reestablish.", "Bitte warte - es wird versucht, die Verbindung wiederherzustellen.", "Veuillez patienter - tentative de rétablissement.", "Tentando reestabelecer conexão. Aguarde.");

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "I")
    public static int field7362;

    @OriginalMember(owner = "client!fr", name = "b", descriptor = "I")
    public static int field7363;

    @OriginalMember(owner = "client!fr", name = "c", descriptor = "I")
    public static int field7364;

    @OriginalMember(owner = "client!fr", name = "f", descriptor = "I")
    public static int field7367;

    @OriginalMember(owner = "client!fr", name = "g", descriptor = "I")
    public static int field7368;

    @OriginalMember(owner = "client!fr", name = "h", descriptor = "I")
    public static int field7369;

    @OriginalMember(owner = "client!fr", name = "i", descriptor = "I")
    public static int field7370;

    @OriginalMember(owner = "client!fr", name = "j", descriptor = "I")
    public static int field7371;

    @OriginalMember(owner = "client!fr", name = "k", descriptor = "I")
    public static int field7372;

    @OriginalMember(owner = "client!fr", name = "l", descriptor = "I")
    public static int field7373;

    @OriginalMember(owner = "client!fr", name = "m", descriptor = "I")
    public static int field7374;

    @OriginalMember(owner = "client!fr", name = "o", descriptor = "I")
    public static int field7376;

    @OriginalMember(owner = "client!fr", name = "p", descriptor = "I")
    public static int field7377;

    @OriginalMember(owner = "client!fr", name = "q", descriptor = "I")
    public static int field7378;

    @OriginalMember(owner = "client!fr", name = "n", descriptor = "Lea;")
    private class115 field7375;

    @OriginalMember(owner = "client!fr", name = "e", descriptor = "Lok;")
    public static class74 field7366;

    @OriginalMember(owner = "client!fr", name = "t", descriptor = "Lok;")
    public static class74 field7381;

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(I)Lea;", line = 10)
    public final class115 method2947(int arg0) {
        int var2 = -65 % ((arg0 + 27) / 44);
        field7363++;
        class115 var3 = this.field7375;
        if (this.field7365 == var3) {
            this.field7375 = null;
            return null;
        } else {
            this.field7375 = var3.field1741;
            return var3;
        }
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(BI)V", line = 29)
    public static final void method2948(byte arg0, int arg1) {
        field7369++;
        for (class115 var2 = class150.field2273.method3061(-16817); var2 != null; var2 = class150.field2273.method3066((byte) 123)) {
            if (((long) arg1) == (var2.field1739 >> 48 & 0xFFFFL)) {
                var2.method876((byte) -96);
            }
        }
        if (arg0 != -11) {
            field7380 = null;
        }
    }

    @OriginalMember(owner = "client!fr", name = "b", descriptor = "(I)Lea;", line = 52)
    public final class115 method2949(int arg0) {
        field7362++;
        class115 var2 = this.field7365.field1736;
        if (this.field7365 == var2) {
            this.field7375 = null;
            return null;
        } else {
            this.field7375 = var2.field1736;
            int var3 = 21 / ((arg0 - 73) / 49);
            return var2;
        }
    }

    @OriginalMember(owner = "client!fr", name = "c", descriptor = "(I)V", line = 77)
    public static final void method2950(int arg0) {
        field7364++;
        if (class409.field6167 == 0) {
            return;
        }
        try {
            if ((++class488.field7281) > 2000) {
                if (class232.field3269 != null) {
                    class232.field3269.method669((byte) 63);
                    class232.field3269 = null;
                }
                if (class510.field7495 >= 1) {
                    class151.field2288 = -5;
                    class409.field6167 = 0;
                    return;
                }
                class107.field1600.field3024 = !class107.field1600.field3024;
                class510.field7495++;
                class488.field7281 = 0;
                class409.field6167 = 1;
            }
            if (class409.field6167 == 1) {
                class455.field6667 = class25.field375.method832(class107.field1600.field3021, class107.field1600.method1356(-116), 0);
                class409.field6167 = 2;
            }
            if (class409.field6167 == 2) {
                if (class455.field6667.field7848 == 2) {
                    throw new IOException();
                }
                if (class455.field6667.field7848 != 1) {
                    return;
                }
                class232.field3269 = new class83((Socket) class455.field6667.field7849, class25.field375);
                class455.field6667 = null;
                class232.field3269.method658(14812, 0, class43.field559.field6830, class43.field559.field6868);
                class90.method698(arg0 ^ 0xFFFFFF89);
                int var1 = class232.field3269.method662(arg0 - 3);
                class90.method698(-46);
                if (var1 != 21) {
                    class409.field6167 = 0;
                    class151.field2288 = var1;
                    class232.field3269.method669((byte) 99);
                    class232.field3269 = null;
                    return;
                }
                class409.field6167 = 3;
            }
            if (class409.field6167 == arg0) {
                if (class232.field3269.method668(-126) < 1) {
                    return;
                }
                class524.field7705 = new String[class232.field3269.method662(arg0 - 3)];
                class409.field6167 = 4;
            }
            if (class409.field6167 == 4 && class232.field3269.method668(-127) >= (class524.field7705.length * 8)) {
                class400.field5966.field6830 = 0;
                class232.field3269.method664(class400.field5966.field6868, (byte) 103, 0, class524.field7705.length * 8);
                for (int var2 = 0; var2 < class524.field7705.length; var2++) {
                    class524.field7705[var2] = class10.method45(class400.field5966.method2725(true), (byte) 109);
                }
                class409.field6167 = 0;
                class151.field2288 = 21;
                class232.field3269.method669((byte) 100);
                class232.field3269 = null;
            }
        } catch (IOException var3) {
            if (class232.field3269 != null) {
                class232.field3269.method669((byte) 90);
                class232.field3269 = null;
            }
            if (class510.field7495 < 1) {
                class510.field7495++;
                class107.field1600.field3024 = !class107.field1600.field3024;
                class409.field6167 = 1;
                class488.field7281 = 0;
            } else {
                class409.field6167 = 0;
                class151.field2288 = -4;
            }
        }
    }

    @OriginalMember(owner = "client!fr", name = "<init>", descriptor = "()V", line = 362)
    public class497() {
        this.field7365.field1741 = this.field7365;
        this.field7365.field1736 = this.field7365;
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(B)Lea;", line = 213)
    public final class115 method2951(byte arg0) {
        field7371++;
        class115 var2 = this.field7365.field1741;
        int var3 = -17 / ((14 - arg0) / 36);
        if (this.field7365 == var2) {
            return null;
        } else {
            var2.method876((byte) -96);
            return var2;
        }
    }

    @OriginalMember(owner = "client!fr", name = "d", descriptor = "(I)V", line = 231)
    public static void method2952(int arg0) {
        field7380 = null;
        field7379 = null;
        if (arg0 == -2) {
            field7366 = null;
            field7381 = null;
        }
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(Lea;B)V", line = 245)
    public final void method2953(class115 arg0, byte arg1) {
        field7373++;
        if (arg0.field1736 != null) {
            arg0.method876((byte) -96);
        }
        arg0.field1736 = this.field7365;
        if (arg1 != 43) {
            this.field7375 = null;
        }
        arg0.field1741 = this.field7365.field1741;
        arg0.field1736.field1741 = arg0;
        arg0.field1741.field1736 = arg0;
    }

    @OriginalMember(owner = "client!fr", name = "b", descriptor = "(B)Z", line = 262)
    public final boolean method2954(byte arg0) {
        field7368++;
        int var2 = 106 / ((arg0 - 16) / 51);
        return this.field7365.field1741 == this.field7365;
    }

    @OriginalMember(owner = "client!fr", name = "e", descriptor = "(I)V", line = 273)
    public final void method2955(int arg0) {
        field7367++;
        while (true) {
            class115 var2 = this.field7365.field1741;
            if (this.field7365 == var2) {
                this.field7375 = null;
                if (arg0 == 2131289328) {
                    return;
                } else {
                    this.method2955(89);
                    return;
                }
            }
            var2.method876((byte) -96);
        }
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(Lfr;ILea;)V", line = 300)
    private final void method2956(class497 arg0, int arg1, class115 arg2) {
        field7378++;
        class115 var4 = this.field7365.field1736;
        this.field7365.field1736 = arg2.field1736;
        arg2.field1736.field1741 = this.field7365;
        if (this.field7365 != arg2) {
            arg2.field1736 = arg0.field7365.field1736;
            arg2.field1736.field1741 = arg2;
            var4.field1741 = arg0.field7365;
            arg0.field7365.field1736 = var4;
        }
        if (arg1 != 0) {
            this.method2957(-58);
        }
    }

    @OriginalMember(owner = "client!fr", name = "f", descriptor = "(I)Lea;", line = 325)
    public final class115 method2957(int arg0) {
        int var2 = 32 / ((arg0 - 23) / 61);
        field7374++;
        class115 var3 = this.field7365.field1741;
        if (this.field7365 == var3) {
            this.field7375 = null;
            return null;
        } else {
            this.field7375 = var3.field1741;
            return var3;
        }
    }

    @OriginalMember(owner = "client!fr", name = "b", descriptor = "(Lea;B)V", line = 345)
    public final void method2958(class115 arg0, byte arg1) {
        field7376++;
        if (arg0.field1736 != null) {
            arg0.method876((byte) -96);
        }
        arg0.field1741 = this.field7365;
        arg0.field1736 = this.field7365.field1736;
        arg0.field1736.field1741 = arg0;
        arg0.field1741.field1736 = arg0;
        if (arg1 < 21) {
            method2950(-104);
        }
    }

    @OriginalMember(owner = "client!fr", name = "c", descriptor = "(B)Lea;", line = 371)
    public final class115 method2959(byte arg0) {
        field7372++;
        if (arg0 != -78) {
            return null;
        }
        class115 var2 = this.field7375;
        if (this.field7365 == var2) {
            this.field7375 = null;
            return null;
        } else {
            this.field7375 = var2.field1736;
            return var2;
        }
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(Z)I", line = 392)
    public final int method2960(boolean arg0) {
        if (arg0) {
            return -50;
        }
        field7377++;
        int var2 = 0;
        class115 var3 = this.field7365.field1741;
        while (this.field7365 != var3) {
            var3 = var3.field1741;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(Lfr;B)V", line = 414)
    public final void method2961(class497 arg0, byte arg1) {
        this.method2956(arg0, 0, this.field7365.field1741);
        field7370++;
        if (arg1 != 49) {
            this.method2953(null, (byte) 103);
        }
    }
}
