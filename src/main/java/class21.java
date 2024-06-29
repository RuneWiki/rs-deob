import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class21 {

    @OriginalMember(owner = "client!a", name = "b", descriptor = "Z")
    public boolean field373 = true;

    @OriginalMember(owner = "client!a", name = "d", descriptor = "I")
    public int field375 = 128;

    @OriginalMember(owner = "client!a", name = "g", descriptor = "Z")
    public boolean field378 = false;

    @OriginalMember(owner = "client!a", name = "e", descriptor = "Z")
    public boolean field376 = true;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "I")
    public int field372 = 1190717;

    @OriginalMember(owner = "client!a", name = "i", descriptor = "I")
    public int field380 = 8;

    @OriginalMember(owner = "client!a", name = "p", descriptor = "I")
    public int field387 = 0;

    @OriginalMember(owner = "client!a", name = "r", descriptor = "I")
    public int field389 = -1;

    @OriginalMember(owner = "client!a", name = "h", descriptor = "I")
    public int field379 = 16;

    @OriginalMember(owner = "client!a", name = "t", descriptor = "I")
    public int field391 = -1;

    @OriginalMember(owner = "client!a", name = "s", descriptor = "I")
    public int field390 = -1;

    @OriginalMember(owner = "client!a", name = "l", descriptor = "I")
    public static int field383 = 0;

    @OriginalMember(owner = "client!a", name = "f", descriptor = "Ljava/lang/String;")
    public static String field377 = "glow2:";

    @OriginalMember(owner = "client!a", name = "n", descriptor = "I")
    public static int field385 = 1;

    @OriginalMember(owner = "client!a", name = "q", descriptor = "I")
    public static int field388 = 0;

    @OriginalMember(owner = "client!a", name = "m", descriptor = "Z")
    public static boolean field384 = false;

    @OriginalMember(owner = "client!a", name = "c", descriptor = "I")
    public static int field374;

    @OriginalMember(owner = "client!a", name = "j", descriptor = "I")
    public static int field381;

    @OriginalMember(owner = "client!a", name = "k", descriptor = "I")
    public static int field382;

    @OriginalMember(owner = "client!a", name = "o", descriptor = "I")
    public static int field386;

    @OriginalMember(owner = "client!a", name = "u", descriptor = "I")
    public static int field392;

    @OriginalMember(owner = "client!a", name = "v", descriptor = "I")
    public static int field393;

    @OriginalMember(owner = "client!a", name = "w", descriptor = "[I")
    public static int[] field394;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(BI)Lul;")
    public static final class255 method190(byte arg0, int arg1) {
        field386++;
        class51 var2 = class142.field1807;
        class255 var3;
        synchronized (class142.field1807) {
            if (arg0 >= -10) {
                field388 = 17;
            }
            var3 = (class255) class142.field1807.method378((byte) 28, (long) arg1);
            if (var3 == null) {
                var3 = new class255(arg1);
                class142.field1807.method367((long) arg1, var3, true);
            }
        }
        synchronized (var3) {
            return var3.method1650(0) ? var3 : null;
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lfb;III)V")
    private final void method191(class341 arg0, int arg1, int arg2, int arg3) {
        if (arg3 != 2009) {
            this.field373 = true;
        }
        if (arg1 == 1) {
            this.field387 = class74.method600(arg0.method2249(32767), (byte) 121);
        } else if (arg1 == 2) {
            this.field391 = arg0.method2233((byte) 104);
        } else if (arg1 == 3) {
            this.field391 = arg0.method2239(arg3 - 1076229969);
            if (this.field391 == 65535) {
                this.field391 = -1;
            }
        } else if (arg1 == 5) {
            this.field373 = false;
        } else if (arg1 == 7) {
            this.field390 = class74.method600(arg0.method2249(32767), (byte) 99);
        } else if (arg1 == 8) {
            class298.field4506 = arg2;
        } else if (arg1 == 9) {
            this.field375 = arg0.method2239(-1076227960);
        } else if (arg1 == 10) {
            this.field376 = false;
        } else if (arg1 == 11) {
            this.field380 = arg0.method2233((byte) 104);
        } else if (arg1 == 12) {
            this.field378 = true;
        } else if (arg1 == 13) {
            this.field372 = arg0.method2249(32767);
        } else if (arg1 == 14) {
            this.field379 = arg0.method2233((byte) 104);
        } else if (arg1 == 15) {
            this.field389 = arg0.method2239(-1076227960);
            if (this.field389 == 65535) {
                this.field389 = -1;
            }
        }
        field374++;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(I)V")
    public static void method192(int arg0) {
        int var1 = 34 % ((14 - arg0) / 61);
        field394 = null;
        field377 = null;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IIBI)V")
    public static final void method193(int arg0, int arg1, byte arg2, int arg3) {
        field381++;
        class406.field5912 = new byte[arg0][arg1][arg3];
        if (arg2 != 119) {
            field388 = 70;
        }
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(BI)V")
    public final void method194(byte arg0, int arg1) {
        int var3 = 33 / ((arg0 - 16) / 51);
        if (this.field389 == -1) {
            this.field389 = this.field391;
        }
        field382++;
        this.field380 = this.field380 << 8 | arg1;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Z)V")
    public static final void method195(boolean arg0) {
        if (arg0) {
            return;
        }
        for (int var1 = 0; var1 < class144.field1829.length; var1++) {
            for (int var2 = 0; var2 < class144.field1829[var1].length; var2++) {
                class144.field1829[var1][var2] = class165.field2241;
            }
        }
        field392++;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IZLfb;)V")
    public final void method196(int arg0, boolean arg1, class341 arg2) {
        while (true) {
            int var4 = arg2.method2233((byte) 104);
            if (var4 == 0) {
                field393++;
                if (!arg1) {
                    this.method191((class341) null, -69, -81, -1);
                    return;
                }
                return;
            }
            this.method191(arg2, var4, arg0, 2009);
        }
    }
}
