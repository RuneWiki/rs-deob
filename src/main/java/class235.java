import jaclib.memory.Buffer;
import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vca")
public class class235 extends class439 implements class321 {

    @OriginalMember(owner = "client!vca", name = "M", descriptor = "Lge;")
    private class608 field3302;

    @OriginalMember(owner = "client!vca", name = "B", descriptor = "Lej;")
    public static class104 field3293 = new class104("Loaded defaults", "Standardeinstellungen geladen", "Paramètres par défaut chargés", "Padrões carregados");

    @OriginalMember(owner = "client!vca", name = "N", descriptor = "I")
    public static int field3303 = -1;

    @OriginalMember(owner = "client!vca", name = "D", descriptor = "I")
    public static int field3294;

    @OriginalMember(owner = "client!vca", name = "E", descriptor = "I")
    public static int field3295;

    @OriginalMember(owner = "client!vca", name = "G", descriptor = "I")
    public static int field3296;

    @OriginalMember(owner = "client!vca", name = "H", descriptor = "I")
    public static int field3297;

    @OriginalMember(owner = "client!vca", name = "I", descriptor = "I")
    public static int field3298;

    @OriginalMember(owner = "client!vca", name = "J", descriptor = "I")
    public static int field3299;

    @OriginalMember(owner = "client!vca", name = "K", descriptor = "I")
    public static int field3300;

    @OriginalMember(owner = "client!vca", name = "L", descriptor = "I")
    public static int field3301;

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;B)V")
    public static final void method1474(Throwable arg0, String arg1, byte arg2) {
        field3296++;
        try {
            String var3 = "";
            if (arg0 != null) {
                var3 = class606.method3560(-1, arg0);
            }
            if (arg1 != null) {
                if (arg0 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg1;
            }
            class300.method1909(var3, (byte) -71);
            String var4 = class184.method1147("%3a", var3, false, ":");
            String var5 = class184.method1147("%40", var4, false, "@");
            if (arg2 != 115) {
                field3293 = null;
            }
            String var6 = class184.method1147("%26", var5, false, "&");
            String var7 = class184.method1147("%23", var6, false, "#");
            if (class93.field1435.field3975 != null) {
                class382 var8 = class93.field1435.method1833(new URL(class93.field1435.field3975.getCodeBase(), "clienterror.ws?c=" + class399.field5693 + "&u=" + class163.field2365 + "&v1=" + class288.field3963 + "&v2=" + class288.field3976 + "&e=" + var7), -79);
                while (var8.field5134 == 0) {
                    class21.method220(0, 1L);
                }
                if (var8.field5134 == 1) {
                    DataInputStream var9 = (DataInputStream) var8.field5132;
                    var9.read();
                    var9.close();
                }
            }
        } catch (Exception var10) {
        }
    }

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(B)V")
    public final void method618(byte arg0) {
        super.method618((byte) 34);
        if (arg0 < 11) {
            this.field3302 = null;
        }
        field3297++;
    }

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(I)I")
    public final int method620(int arg0) {
        if (arg0 >= -120) {
            this.field3302 = null;
        }
        field3301++;
        return super.method620(-126);
    }

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(ZI)Ljaclib/memory/Buffer;")
    public final Buffer method613(boolean arg0, int arg1) {
        field3300++;
        if (arg1 != -25838) {
            this.field3302 = null;
        }
        return super.method613(arg0, -25838);
    }

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "([FBI)[F")
    public static final float[] method1475(float[] arg0, byte arg1, int arg2) {
        field3298++;
        int var3 = -81 % ((76 - arg1) / 34);
        float[] var4 = new float[arg2];
        class416.method2500(arg0, 0, var4, 0, arg2);
        return var4;
    }

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(Z)V")
    public static void method1476(boolean arg0) {
        if (arg0) {
            field3303 = -4;
        }
        field3293 = null;
    }

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(II)V")
    public final void method1477(int arg0, int arg1) {
        if (arg0 != -18855) {
            this.method620(-94);
        }
        super.method1477(arg0, this.field3302.field8755 * arg1);
        field3299++;
    }

    @OriginalMember(owner = "client!vca", name = "<init>", descriptor = "(Lpi;Lge;Z)V")
    public class235(class424 arg0, class608 arg1, boolean arg2) {
        super(arg0, 34963, arg2);
        this.field3302 = arg1;
    }

    @OriginalMember(owner = "client!vca", name = "b", descriptor = "(I)Lge;")
    public final class608 method1478(int arg0) {
        if (arg0 == -13339) {
            field3294++;
            return this.field3302;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vca", name = "b", descriptor = "(B)Z")
    public final boolean method616(byte arg0) {
        field3295++;
        if (arg0 > -65) {
            return true;
        } else {
            return super.method616((byte) -107);
        }
    }
}
