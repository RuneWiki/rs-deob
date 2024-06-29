import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public class class25 {

    @OriginalMember(owner = "client!rk", name = "e", descriptor = "I")
    private int field442;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "[Lgf;")
    private class155[] field438;

    @OriginalMember(owner = "client!rk", name = "g", descriptor = "I")
    public static int field444 = 0;

    @OriginalMember(owner = "client!rk", name = "o", descriptor = "Ljava/lang/String;")
    public static String field452 = "yellow:";

    @OriginalMember(owner = "client!rk", name = "q", descriptor = "[I")
    public static int[] field454 = new int[2];

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "I")
    public static int field439;

    @OriginalMember(owner = "client!rk", name = "c", descriptor = "I")
    public static int field440;

    @OriginalMember(owner = "client!rk", name = "f", descriptor = "I")
    public static int field443;

    @OriginalMember(owner = "client!rk", name = "i", descriptor = "I")
    public static int field446;

    @OriginalMember(owner = "client!rk", name = "j", descriptor = "I")
    public static int field447;

    @OriginalMember(owner = "client!rk", name = "k", descriptor = "I")
    public static int field448;

    @OriginalMember(owner = "client!rk", name = "l", descriptor = "I")
    public static int field449;

    @OriginalMember(owner = "client!rk", name = "p", descriptor = "I")
    public static int field453;

    @OriginalMember(owner = "client!rk", name = "r", descriptor = "I")
    public static int field455;

    @OriginalMember(owner = "client!rk", name = "d", descriptor = "J")
    private long field441;

    @OriginalMember(owner = "client!rk", name = "h", descriptor = "Laj;")
    public static class151 field445;

    @OriginalMember(owner = "client!rk", name = "n", descriptor = "Lgf;")
    private class155 field451;

    @OriginalMember(owner = "client!rk", name = "m", descriptor = "Lme;")
    public static class165 field450;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(III)Ljava/lang/String;")
    public static final String method158(int arg0, int arg1, int arg2) {
        field448++;
        int var3 = arg1 - arg2;
        if (var3 < -9) {
            return "<col=ff0000>";
        } else if (arg0 < ~var3) {
            return "<col=ff3000>";
        } else if (var3 < -3) {
            return "<col=ff7000>";
        } else if (var3 < 0) {
            return "<col=ffb000>";
        } else if (var3 > 9) {
            return "<col=00ff00>";
        } else if (var3 > 6) {
            return "<col=40ff00>";
        } else if (var3 > 3) {
            return "<col=80ff00>";
        } else if (var3 > 0) {
            return "<col=c0ff00>";
        } else {
            return "<col=ffff00>";
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(JI)Lgf;")
    public final class155 method159(long arg0, int arg1) {
        field446++;
        this.field441 = arg0;
        if (arg1 != 25428) {
            return null;
        }
        class155 var4 = this.field438[(int) ((long) (this.field442 - 1) & arg0)];
        for (this.field451 = var4.field2569; this.field451 != var4; this.field451 = this.field451.field2569) {
            if (this.field451.field2570 == arg0) {
                class155 var5 = this.field451;
                this.field451 = this.field451.field2569;
                return var5;
            }
        }
        this.field451 = null;
        return null;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(Lgf;IJ)V")
    public final void method160(class155 arg0, int arg1, long arg2) {
        field455++;
        if (arg0.field2568 != null) {
            arg0.method1174(-25741);
        }
        class155 var5 = this.field438[(int) ((long) (this.field442 - arg1) & arg2)];
        arg0.field2570 = arg2;
        arg0.field2568 = var5.field2568;
        arg0.field2569 = var5;
        arg0.field2568.field2569 = arg0;
        arg0.field2569.field2568 = arg0;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(Laj;I)V")
    public static final void method161(class151 arg0, int arg1) {
        field453++;
        class171.field2768 = arg0;
        class51.field862 = class171.field2768.method1132(16777215, arg1);
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public static final void method162(int arg0, Component arg1) {
        field447++;
        Method var2 = class83.field1384;
        if (var2 != null) {
            try {
                var2.invoke(arg1, Boolean.FALSE);
            } catch (Throwable var4) {
            }
        }
        int var3 = -23 % ((15 - arg0) / 54);
        arg1.addKeyListener(class32.field523);
        arg1.addFocusListener(class32.field523);
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(BI)V")
    public static final void method163(byte arg0, int arg1) {
        class150.field2478.method98(arg0 ^ 0x20, arg1);
        field439++;
        if (arg0 != 33) {
            field452 = null;
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(B)Lgf;")
    public final class155 method164(byte arg0) {
        field449++;
        if (this.field451 == null) {
            return null;
        }
        class155 var2 = this.field438[(int) ((long) (this.field442 - 1) & this.field441)];
        while (this.field451 != var2) {
            if (this.field451.field2570 == this.field441) {
                class155 var3 = this.field451;
                this.field451 = this.field451.field2569;
                return var3;
            }
            this.field451 = this.field451.field2569;
        }
        if (arg0 >= -8) {
            field443 = 70;
        }
        this.field451 = null;
        return null;
    }

    @OriginalMember(owner = "client!rk", name = "<init>", descriptor = "(I)V")
    public class25(int arg0) {
        this.field442 = arg0;
        this.field438 = new class155[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class155 var3 = this.field438[var2] = new class155();
            var3.field2568 = var3;
            var3.field2569 = var3;
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(Z)V")
    public static void method165(boolean arg0) {
        field452 = null;
        if (!arg0) {
            field452 = null;
        }
        field450 = null;
        field445 = null;
        field454 = null;
    }
}
