import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!im")
public class class675 {

    @OriginalMember(owner = "client!im", name = "f", descriptor = "Z")
    private boolean field9562 = false;

    @OriginalMember(owner = "client!im", name = "g", descriptor = "Z")
    private boolean field9563 = false;

    @OriginalMember(owner = "client!im", name = "j", descriptor = "I")
    public int field9566 = 443;

    @OriginalMember(owner = "client!im", name = "e", descriptor = "I")
    public int field9561 = 43594;

    @OriginalMember(owner = "client!im", name = "l", descriptor = "[[S")
    public static short[][] field9568 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!im", name = "a", descriptor = "I")
    public static int field9557;

    @OriginalMember(owner = "client!im", name = "b", descriptor = "I")
    public int field9558;

    @OriginalMember(owner = "client!im", name = "c", descriptor = "I")
    public static int field9559;

    @OriginalMember(owner = "client!im", name = "h", descriptor = "I")
    public static int field9564;

    @OriginalMember(owner = "client!im", name = "i", descriptor = "I")
    public static int field9565;

    @OriginalMember(owner = "client!im", name = "k", descriptor = "I")
    public static int field9567;

    // $FF: synthetic field
    @OriginalMember(owner = "client!im", name = "m", descriptor = "Ljava/lang/Class;")
    public static Class field9569;

    @OriginalMember(owner = "client!im", name = "d", descriptor = "Ljava/lang/String;")
    public String field9560;

    // $FF: synthetic method
    @OriginalMember(owner = "client!im", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method3731(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(I)V", line = 9)
    public final void method3726(int arg0) {
        int var2 = 92 / ((arg0 + 10) / 51);
        if (!this.field9563) {
            this.field9563 = true;
            this.field9562 = true;
        } else if (this.field9562) {
            this.field9562 = false;
        } else {
            this.field9563 = false;
        }
        field9564++;
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(ILim;)Z", line = 32)
    public final boolean method3727(int arg0, class675 arg1) {
        if (arg0 != -31835) {
            method3730(-2);
        }
        field9567++;
        if (arg1 == null) {
            return false;
        } else {
            return this.field9558 == arg1.field9558 && this.field9560.equals(arg1.field9560);
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(B)V", line = 58)
    public static final void method3728(byte arg0) {
        field9565++;
        if (arg0 != 112) {
            field9568 = null;
        }
        if (class495.field6687.field1357) {
            class77.field969 = 96;
            return;
        }
        try {
            Method var1 = (field9569 == null ? (field9569 = method3731("java.lang.Runtime")) : field9569).getMethod("maxMemory");
            if (var1 != null) {
                try {
                    Runtime var2 = Runtime.getRuntime();
                    Long var3 = (Long) var1.invoke(var2, (Object[]) null);
                    class77.field969 = (int) (var3 / 1048576L) + 1;
                } catch (Throwable var4) {
                }
            }
        } catch (Exception var5) {
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(ILcr;)Lrp;", line = 97)
    public final class280 method3729(int arg0, class112 arg1) {
        field9557++;
        return arg0 > -82 ? null : arg1.method617(22, this.field9562, this.field9563 ? this.field9566 : this.field9561, this.field9560);
    }

    @OriginalMember(owner = "client!im", name = "b", descriptor = "(I)V", line = 114)
    public static void method3730(int arg0) {
        field9568 = null;
        if (arg0 != 3673) {
            method3730(-39);
        }
    }
}
