import java.awt.Frame;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class33 {

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "Luo;")
    public class83 field499 = new class83();

    @OriginalMember(owner = "client!ba", name = "e", descriptor = "Z")
    public static boolean field502 = false;

    @OriginalMember(owner = "client!ba", name = "g", descriptor = "I")
    public static int field504 = 0;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "I")
    public static int field498;

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "I")
    public static int field500;

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "I")
    public static int field501;

    @OriginalMember(owner = "client!ba", name = "f", descriptor = "I")
    public static int field503;

    @OriginalMember(owner = "client!ba", name = "h", descriptor = "I")
    public static int field505;

    @OriginalMember(owner = "client!ba", name = "i", descriptor = "I")
    public static int field506;

    @OriginalMember(owner = "client!ba", name = "j", descriptor = "I")
    public static int field507;

    @OriginalMember(owner = "client!ba", name = "k", descriptor = "I")
    public static int field508;

    @OriginalMember(owner = "client!ba", name = "l", descriptor = "I")
    public static int field509;

    @OriginalMember(owner = "client!ba", name = "m", descriptor = "I")
    public static int field510;

    @OriginalMember(owner = "client!ba", name = "n", descriptor = "I")
    public static int field511;

    @OriginalMember(owner = "client!ba", name = "o", descriptor = "I")
    public static int field512;

    @OriginalMember(owner = "client!ba", name = "p", descriptor = "I")
    public static int field513;

    @OriginalMember(owner = "client!ba", name = "q", descriptor = "I")
    public static int field514;

    @OriginalMember(owner = "client!ba", name = "r", descriptor = "Luo;")
    private class83 field515;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Ljava/lang/String;IZ)V", line = 5)
    public static final void method343(String arg0, int arg1, boolean arg2) {
        field505++;
        if (arg1 != 0) {
            return;
        }
        if (!arg2) {
            try {
                class141.method1176(class340.field5234.field4975, true, "loggedout");
            } catch (Throwable var9) {
            }
            try {
                class78.field1135.getAppletContext().showDocument(new URL(class78.field1135.getCodeBase(), arg0), "_top");
            } catch (Exception var8) {
            }
            return;
        }
        if (class240.field3737 && class158.field2528) {
            try {
                class141.method1177(new Object[] { (new URL(class78.field1135.getCodeBase(), arg0)).toString() }, arg1 ^ 0xA, class340.field5234.field4975, "openjs");
                return;
            } catch (Throwable var10) {
            }
        }
        try {
            class78.field1135.getAppletContext().showDocument(new URL(class78.field1135.getCodeBase(), arg0), "_blank");
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(I)Lvo;", line = 54)
    public static final class22 method344(int arg0) {
        field509++;
        if (class351.field5599 == null) {
            return null;
        }
        if (arg0 != 0) {
            field510 = 31;
        }
        for (class22 var1 = (class22) class338.field5202.method2221(true); var1 != null; var1 = (class22) class338.field5202.method2221(true)) {
            class181 var2 = class334.method2351(var1.field349, (byte) 125);
            if (var2 != null && var2.field2827 && var2.method1403(true)) {
                return var1;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "(I)Luo;", line = 83)
    public final class83 method345(int arg0) {
        class83 var2 = this.field515;
        field511++;
        if (arg0 != -1) {
            return (class83) null;
        } else if (this.field499 == var2) {
            this.field515 = null;
            return null;
        } else {
            this.field515 = var2.field1200;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lrg;III)V", line = 110)
    public static final void method346(class342 arg0, int arg1, int arg2, int arg3) {
        if (arg2 != -3) {
            field502 = false;
        }
        field498++;
        if (class256.field3937 != null || class6.field89 || arg0 == null || class86.method777(-25984, arg0) == null) {
            return;
        }
        class256.field3937 = arg0;
        class348.field5523 = class86.method777(arg2 - 25981, arg0);
        class66.field994 = arg3;
        class210.field3243 = arg1;
        class346.field5505 = 0;
        class123.field1973 = false;
    }

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "(I)Luo;", line = 138)
    public final class83 method347(int arg0) {
        class83 var2 = this.field499.field1200;
        field503++;
        if (this.field499 == var2) {
            this.field515 = null;
            return null;
        }
        this.field515 = var2.field1200;
        if (arg0 != 0) {
            field510 = 95;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Luo;I)V", line = 157)
    public final void method348(class83 arg0, int arg1) {
        if (arg0.field1195 != null) {
            arg0.method743((byte) 105);
        }
        if (arg1 >= -32) {
            field504 = -88;
        }
        arg0.field1200 = this.field499;
        arg0.field1195 = this.field499.field1195;
        arg0.field1195.field1200 = arg0;
        arg0.field1200.field1195 = arg0;
        field513++;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(ILrn;)V", line = 183)
    public static final void method349(int arg0, class18 arg1) {
        int var2 = -53 / ((arg0 - 41) / 53);
        class59.field924 = arg1;
        field514++;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lua;IIIII)Ljava/awt/Frame;", line = 192)
    public static final Frame method350(class323 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field507++;
        if (!arg0.method2271(arg5 - 25636)) {
            return null;
        }
        if (arg3 == 0) {
            class356[] var6 = class311.method2212((byte) -126, arg0);
            if (var6 == null) {
                return null;
            }
            boolean var7 = false;
            for (int var8 = 0; var8 < var6.length; var8++) {
                if (var6[var8].field5662 == arg4 && var6[var8].field5664 == arg2 && (arg1 == 0 || var6[var8].field5666 == arg1) && (!var7 || arg3 < var6[var8].field5667)) {
                    arg3 = var6[var8].field5667;
                    var7 = true;
                }
            }
            if (!var7) {
                return null;
            }
        }
        class95 var9 = arg0.method2285(8, arg2, arg1, arg4, arg3);
        while (var9.field1447 == 0) {
            class188.method1443(arg5 ^ 0xFFFFEC8B, 10L);
        }
        if (arg5 != -4991) {
            method346((class342) null, -72, 8, -24);
        }
        Frame var10 = (Frame) var9.field1446;
        if (var10 == null) {
            return null;
        } else if (var9.field1447 == 2) {
            class353.method2489(var10, arg0, arg5 ^ 0x5D73);
            return null;
        } else {
            return var10;
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(B)V", line = 274)
    public final void method351(byte arg0) {
        while (true) {
            class83 var2 = this.field499.field1200;
            if (this.field499 == var2) {
                field508++;
                this.field515 = null;
                if (arg0 < 42) {
                    field510 = -96;
                }
                return;
            }
            var2.method743((byte) 122);
        }
    }

    @OriginalMember(owner = "client!ba", name = "<init>", descriptor = "()V", line = 297)
    public class33() {
        this.field499.field1195 = this.field499;
        this.field499.field1200 = this.field499;
    }
}
