import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class161 {

    @OriginalMember(owner = "client!bg", name = "k", descriptor = "Ljava/lang/String;")
    public static String field2629 = "slide:";

    @OriginalMember(owner = "client!bg", name = "n", descriptor = "Ljava/lang/String;")
    public static String field2632 = "flash3:";

    @OriginalMember(owner = "client!bg", name = "q", descriptor = "[I")
    public static int[] field2635 = new int[14];

    @OriginalMember(owner = "client!bg", name = "m", descriptor = "I")
    public static int field2631 = 0;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "F")
    public static float field2619 = 128.0F;

    @OriginalMember(owner = "client!bg", name = "s", descriptor = "Ljava/lang/String;")
    public static String field2637 = "green:";

    @OriginalMember(owner = "client!bg", name = "p", descriptor = "[I")
    public static int[] field2634 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "I")
    public static int field2620;

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "I")
    public static int field2621;

    @OriginalMember(owner = "client!bg", name = "d", descriptor = "I")
    public int field2622;

    @OriginalMember(owner = "client!bg", name = "e", descriptor = "I")
    public int field2623;

    @OriginalMember(owner = "client!bg", name = "f", descriptor = "I")
    public int field2624;

    @OriginalMember(owner = "client!bg", name = "g", descriptor = "I")
    public static int field2625;

    @OriginalMember(owner = "client!bg", name = "h", descriptor = "I")
    public int field2626;

    @OriginalMember(owner = "client!bg", name = "j", descriptor = "I")
    public static int field2628;

    @OriginalMember(owner = "client!bg", name = "l", descriptor = "I")
    public static int field2630;

    @OriginalMember(owner = "client!bg", name = "o", descriptor = "I")
    public int field2633;

    @OriginalMember(owner = "client!bg", name = "r", descriptor = "I")
    public static int field2636;

    @OriginalMember(owner = "client!bg", name = "t", descriptor = "I")
    public static int field2638;

    @OriginalMember(owner = "client!bg", name = "u", descriptor = "I")
    public int field2639;

    @OriginalMember(owner = "client!bg", name = "v", descriptor = "I")
    public static int field2640;

    @OriginalMember(owner = "client!bg", name = "i", descriptor = "[[[I")
    public static int[][][] field2627;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Z)V")
    public static final void method1164(boolean arg0) {
        field2620++;
        for (int var1 = 0; var1 < 100; var1++) {
            class118.field1991[var1] = true;
        }
        if (!arg0) {
            method1168((byte) 53, -39);
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(B)V")
    public static final void method1165(byte arg0) {
        field2621++;
        class144.field2383.method1156(-102);
        if (arg0 != -75) {
            method1169(29);
        }
        class92.field1454.method1156(arg0 ^ 0x1E);
        class36.field618.method1156(-73);
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(I)V")
    public static final void method1166(int arg0) {
        if (arg0 != 11976) {
            method1171(-113);
        }
        class37.field630.method1157(760);
        field2628++;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Ljava/lang/Throwable;ILjava/lang/String;)V")
    public static final void method1167(Throwable arg0, int arg1, String arg2) {
        field2630++;
        try {
            String var3 = "";
            if (arg0 != null) {
                var3 = class252.method1677(arg0, (byte) -27);
            }
            if (arg2 != null) {
                if (arg0 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg2;
            }
            class114.method846(-89, var3);
            String var4 = class269.method1832(":", var3, "%3a", true);
            String var5 = class269.method1832("@", var4, "%40", true);
            String var6 = class269.method1832("&", var5, "%26", true);
            String var7 = class269.method1832("#", var6, "%23", true);
            if (class6.field69.field1291 != null) {
                class115 var8 = class6.field69.method627(new URL(class6.field69.field1291.getCodeBase(), "clienterror.ws?c=" + class256.field4079 + "&u=" + class12.field162 + "&v1=" + class78.field1297 + "&v2=" + class78.field1296 + "&e=" + var7), 4);
                while (var8.field1937 == 0) {
                    class234.method1550(-28773, 1L);
                }
                if (var8.field1937 == 1) {
                    DataInputStream var9 = (DataInputStream) var8.field1936;
                    var9.read();
                    var9.close();
                }
                if (arg1 > -120) {
                    method1169(-5);
                }
            }
        } catch (Exception var10) {
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(BI)V")
    public static final void method1168(byte arg0, int arg1) {
        field2640++;
        if (class229.field3656 == null) {
            class229.field3656 = new byte[4][104][104];
        }
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    class229.field3656[var2][var3][var4] = arg0;
                }
            }
        }
        if (arg1 != -14607) {
            field2619 = 1.9618877F;
        }
    }

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "(I)V")
    public static void method1169(int arg0) {
        field2632 = null;
        field2637 = null;
        field2627 = null;
        field2634 = null;
        field2635 = null;
        field2629 = null;
        if (arg0 != 64) {
            field2625 = 3;
        }
    }

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "(Z)V")
    public static final void method1170(boolean arg0) {
        if (arg0) {
            class26.field455 = class5.field61;
            class21.field327 = class266.field4251;
        } else {
            class26.field455 = class9.field127;
            class21.field327 = field2627;
        }
        class102.field1557 = class26.field455.length;
    }

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "(I)V")
    public static final void method1171(int arg0) {
        if (class229.field3651 != null) {
            class191 var1 = class229.field3651;
            synchronized (class229.field3651) {
                class229.field3651 = null;
            }
        }
        field2636++;
        if (arg0 != -105) {
            method1170(true);
        }
    }
}
