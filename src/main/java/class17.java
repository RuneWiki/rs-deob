import java.awt.Component;
import java.awt.event.KeyEvent;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ia")
public class class17 {

    @OriginalMember(owner = "mapview!ia", name = "f", descriptor = "[I")
    private int[] field226;

    @OriginalMember(owner = "mapview!ia", name = "a", descriptor = "Lna;")
    public static class26 field221 = class30.method205((byte) 53, " ");

    @OriginalMember(owner = "mapview!ia", name = "c", descriptor = "Lna;")
    public static class26 field223 = class30.method205((byte) 22, "Cookery Shop");

    @OriginalMember(owner = "mapview!ia", name = "b", descriptor = "Lna;")
    public static class26 field222 = class30.method205((byte) 103, "Axe Shop");

    @OriginalMember(owner = "mapview!ia", name = "e", descriptor = "Lna;")
    public static class26 field225 = class30.method205((byte) 82, "100(U");

    @OriginalMember(owner = "mapview!ia", name = "d", descriptor = "[I")
    public static int[] field224;

    @OriginalMember(owner = "mapview!ia", name = "a", descriptor = "(ILjava/awt/Component;)V", line = 9)
    public static final void method107(int arg0, Component arg1) {
        Method var2 = class40.field517;
        int var3 = 111 / ((arg0 + 40) / 37);
        if (var2 != null) {
            try {
                var2.invoke(arg1, Boolean.FALSE);
            } catch (Throwable var5) {
            }
        }
        arg1.addKeyListener(class15.field204);
        arg1.addFocusListener(class15.field204);
    }

    @OriginalMember(owner = "mapview!ia", name = "a", descriptor = "(Z)B", line = 30)
    public static final byte method108(boolean arg0) {
        if (arg0) {
            field223 = null;
        }
        return class37.field480 == null ? 0 : class37.field480[class19.field239];
    }

    @OriginalMember(owner = "mapview!ia", name = "a", descriptor = "(B)V", line = 55)
    public static void method109(byte arg0) {
        field222 = null;
        if (arg0 >= -64) {
            method111(119, 89, 79);
        }
        field223 = null;
        field225 = null;
        field221 = null;
        field224 = null;
    }

    @OriginalMember(owner = "mapview!ia", name = "a", descriptor = "(IB)I", line = 76)
    public final int method110(int arg0, byte arg1) {
        int var3 = (this.field226.length >> 1) - 1;
        if (arg1 != -4) {
            method107(-10, null);
        }
        int var4 = arg0 & var3;
        while (true) {
            int var5 = this.field226[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field226[var4 + var4] == arg0) {
                return var5;
            }
            var4 = var3 & var4 + 1;
        }
    }

    @OriginalMember(owner = "mapview!ia", name = "a", descriptor = "(III)B", line = 124)
    public static final byte method111(int arg0, int arg1, int arg2) {
        int var3 = arg2 >> 6;
        int var4 = arg1 >> 6;
        if (arg0 > -84) {
            return -103;
        } else if (mapview.field5[var3][var4] == null) {
            return 0;
        } else if (mapview.field5[var3][var4].field481 == null) {
            return mapview.field5[var3][var4].field483;
        } else {
            return mapview.field5[var3][var4].field481[(arg2 & 0xFC0) + arg1 & 0x3F];
        }
    }

    @OriginalMember(owner = "mapview!ia", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;I)I", line = 149)
    public static final int method112(KeyEvent arg0, int arg1) {
        int var2 = arg0.getKeyChar();
        if (arg1 != 128) {
            return 67;
        } else if (var2 == 8364) {
            return 128;
        } else {
            if (var2 <= 0 || var2 >= 256) {
                var2 = -1;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "mapview!ia", name = "<init>", descriptor = "([I)V", line = 168)
    public class17(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= arg0.length + (arg0.length >> 1); var2 <<= 0x1) {
        }
        this.field226 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field226[var3] = -1;
        }
        int var4 = 0;
        while (arg0.length > var4) {
            int var5;
            for (var5 = var2 - 1 & arg0[var4]; this.field226[var5 + var5 + 1] != -1; var5 = var2 - 1 & var5 + 1) {
            }
            this.field226[var5 + var5] = arg0[var4];
            this.field226[var5 + var5 + 1] = var4++;
        }
    }
}
