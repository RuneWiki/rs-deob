import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ev")
public abstract class class487 {

    @OriginalMember(owner = "client!ev", name = "h", descriptor = "I")
    public int field7217;

    @OriginalMember(owner = "client!ev", name = "g", descriptor = "I")
    public int field7216;

    @OriginalMember(owner = "client!ev", name = "e", descriptor = "I")
    public int field7214;

    @OriginalMember(owner = "client!ev", name = "d", descriptor = "J")
    public static long field7213 = 0L;

    @OriginalMember(owner = "client!ev", name = "i", descriptor = "I")
    public static int field7218 = -1;

    @OriginalMember(owner = "client!ev", name = "f", descriptor = "Ljv;")
    public static class55 field7215 = new class55(32);

    @OriginalMember(owner = "client!ev", name = "j", descriptor = "I")
    public static int field7219 = -1;

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "I")
    public static int field7210;

    @OriginalMember(owner = "client!ev", name = "b", descriptor = "I")
    public static int field7211;

    @OriginalMember(owner = "client!ev", name = "c", descriptor = "I")
    public static int field7212;

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(Lqg;Lqg;I)V", line = 6)
    public static final void method2886(class320 arg0, class320 arg1, int arg2) {
        field7211++;
        if (arg2 != -532427220) {
            method2886(null, null, 125);
        }
        if (arg1.field4906 != null) {
            arg1.method2090(-1);
        }
        arg1.field4901 = arg0;
        arg1.field4906 = arg0.field4906;
        arg1.field4906.field4901 = arg1;
        arg1.field4901.field4906 = arg1;
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(B)V", line = 23)
    public static void method2887(byte arg0) {
        field7215 = null;
        if (arg0 < 94) {
            field7215 = null;
        }
    }

    @OriginalMember(owner = "client!ev", name = "<init>", descriptor = "(III)V", line = 43)
    public class487(int arg0, int arg1, int arg2) {
        this.field7217 = arg2;
        this.field7216 = arg1;
        this.field7214 = arg0;
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(IIB)I", line = 53)
    public static final int method2888(int arg0, int arg1, byte arg2) {
        if (arg2 >= -83) {
            return 95;
        }
        field7210++;
        int var3 = arg0 >>> 24;
        int var4 = ((arg0 & 0xFF00FF) * var3 & 0xFF00FF00 | (arg0 & 0xFF00) * var3 & 0xFF0000) >>> 8;
        int var5 = 255 - var3;
        return (((arg1 & 0xFF00) * var5 & 0xFF0000 | (arg1 & 0xFF00FF) * var5 & 0xFF00FF00) >>> 8) + var4;
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(BI)I", line = 74)
    public static final int method2889(byte arg0, int arg1) {
        int var2 = -39 / ((arg0 - 28) / 55);
        field7212++;
        int var3 = (arg1 * arg1 >> 12) * arg1 >> 12;
        int var4 = arg1 * 6 - 61440;
        int var5 = (arg1 * var4 >> 12) + 40960;
        return var3 * var5 >> 12;
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(IIZ)V")
    public abstract void method519(int arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(IBI)V")
    public abstract void method515(int arg0, byte arg1, int arg2);

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(III)V")
    public abstract void method516(int arg0, int arg1, int arg2);
}
