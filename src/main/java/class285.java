import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hfa")
public class class285 {

    @OriginalMember(owner = "client!hfa", name = "j", descriptor = "Ljava/lang/String;")
    private String field4254 = "null";

    @OriginalMember(owner = "client!hfa", name = "e", descriptor = "C")
    public char field4249;

    @OriginalMember(owner = "client!hfa", name = "o", descriptor = "C")
    public char field4259;

    @OriginalMember(owner = "client!hfa", name = "b", descriptor = "I")
    public static int field4246;

    @OriginalMember(owner = "client!hfa", name = "c", descriptor = "I")
    public static int field4247;

    @OriginalMember(owner = "client!hfa", name = "f", descriptor = "I")
    public static int field4250;

    @OriginalMember(owner = "client!hfa", name = "g", descriptor = "I")
    public static int field4251;

    @OriginalMember(owner = "client!hfa", name = "h", descriptor = "I")
    public static int field4252;

    @OriginalMember(owner = "client!hfa", name = "i", descriptor = "I")
    public static int field4253;

    @OriginalMember(owner = "client!hfa", name = "k", descriptor = "I")
    public static int field4255;

    @OriginalMember(owner = "client!hfa", name = "l", descriptor = "I")
    public static int field4256;

    @OriginalMember(owner = "client!hfa", name = "m", descriptor = "I")
    public static int field4257;

    @OriginalMember(owner = "client!hfa", name = "n", descriptor = "I")
    private int field4258;

    @OriginalMember(owner = "client!hfa", name = "p", descriptor = "I")
    public static int field4260;

    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "Lsl;")
    public class427 field4245;

    @OriginalMember(owner = "client!hfa", name = "d", descriptor = "Lsl;")
    private class427 field4248;

    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "(Lqh;II)V")
    private final void method1885(class61 arg0, int arg1, int arg2) {
        field4252++;
        if (arg1 == 1) {
            this.field4249 = class370.method2344(-7588, arg0.method710((byte) 43));
        } else if (arg1 == 2) {
            this.field4259 = class370.method2344(-7588, arg0.method710((byte) 43));
        } else if (arg1 == 3) {
            this.field4254 = arg0.method747(14598);
        } else if (arg1 == 4) {
            this.field4258 = arg0.method730(-64);
        } else if (arg1 == 5 || arg1 == 6) {
            int var4 = arg0.method723((byte) -25);
            this.field4245 = new class427(class455.method2740(-1675135295, var4));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg0.method730(102);
                class425 var7;
                if (arg1 == 5) {
                    var7 = new class426(arg0.method747(14598));
                } else {
                    var7 = new class149(arg0.method730(86));
                }
                this.field4245.method2598(var7, (long) var6, (byte) 8);
            }
        }
        if (arg2 <= 114) {
            this.field4248 = null;
        }
    }

    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "(Lqh;B)V")
    public final void method1886(class61 arg0, byte arg1) {
        field4255++;
        if (arg1 < 6) {
            return;
        }
        while (true) {
            int var3 = arg0.method732(-559537960);
            if (var3 == 0) {
                return;
            }
            this.method1885(arg0, var3, 116);
        }
    }

    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "(BI)Ljava/lang/String;")
    public final String method1887(byte arg0, int arg1) {
        field4257++;
        if (this.field4245 == null) {
            return this.field4254;
        } else {
            class426 var3 = (class426) this.field4245.method2596((long) arg1, 43);
            int var4 = -50 % ((-arg0 - 31) / 57);
            return var3 == null ? this.field4254 : var3.field6140;
        }
    }

    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "(Ljava/lang/String;B)Z")
    public final boolean method1888(String arg0, byte arg1) {
        field4253++;
        if (this.field4245 == null) {
            return false;
        }
        if (this.field4248 == null) {
            this.method1893((byte) -98);
        }
        for (class339 var3 = (class339) this.field4248.method2596(class474.method2838(arg0, 6726), arg1 ^ 0x1); var3 != null; var3 = (class339) this.field4248.method2595(27126)) {
            if (var3.field5055.equals(arg0)) {
                return true;
            }
        }
        if (arg1 != 78) {
            this.method1886(null, (byte) -41);
        }
        return false;
    }

    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "(Z)V")
    private final void method1889(boolean arg0) {
        if (!arg0) {
            this.method1888(null, (byte) -69);
        }
        field4251++;
        this.field4248 = new class427(this.field4245.method2593(-30681));
        for (class149 var2 = (class149) this.field4245.method2597((byte) -103); var2 != null; var2 = (class149) this.field4245.method2594((byte) -122)) {
            class149 var3 = new class149((int) var2.field6132);
            this.field4248.method2598(var3, (long) var2.field2560, (byte) 8);
        }
    }

    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "(IB)Z")
    public final boolean method1890(int arg0, byte arg1) {
        field4260++;
        if (this.field4245 == null) {
            return false;
        }
        if (arg1 >= -48) {
            this.field4248 = null;
        }
        if (this.field4248 == null) {
            this.method1889(true);
        }
        class149 var3 = (class149) this.field4248.method2596((long) arg0, 127);
        return var3 != null;
    }

    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "(ILjava/lang/Object;Ln;)V")
    public static final void method1891(int arg0, Object arg1, class17 arg2) {
        field4246++;
        if (arg2.field789 == null || arg0 != -17749) {
            return;
        }
        for (int var3 = 0; var3 < 50 && arg2.field789.peekEvent() != null; var3++) {
            class185.method1354(1L, 10);
        }
        try {
            if (arg1 != null) {
                arg2.field789.postEvent(new ActionEvent(arg1, 1001, "dummy"));
            }
        } catch (Exception var4) {
        }
    }

    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "(II)I")
    public final int method1892(int arg0, int arg1) {
        field4250++;
        if (this.field4245 == null) {
            return this.field4258;
        }
        class149 var3 = (class149) this.field4245.method2596((long) arg1, 117);
        if (var3 == null) {
            return this.field4258;
        } else {
            int var4 = -6 % ((arg0 - 36) / 44);
            return var3.field2560;
        }
    }

    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "(B)V")
    private final void method1893(byte arg0) {
        if (arg0 != -98) {
            this.method1886(null, (byte) -4);
        }
        field4256++;
        this.field4248 = new class427(this.field4245.method2593(-30681));
        for (class426 var2 = (class426) this.field4245.method2597((byte) -101); var2 != null; var2 = (class426) this.field4245.method2594((byte) -122)) {
            class339 var3 = new class339(var2.field6140, (int) var2.field6132);
            this.field4248.method2598(var3, class474.method2838(var2.field6140, 6726), (byte) 8);
        }
    }
}
