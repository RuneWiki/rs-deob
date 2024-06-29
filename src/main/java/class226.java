import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class226 {

    @OriginalMember(owner = "client!qb", name = "h", descriptor = "Lfc;")
    private class262 field2938 = new class262(64);

    @OriginalMember(owner = "client!qb", name = "g", descriptor = "Lni;")
    private class522 field2937;

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "I")
    public static int field2934 = 0;

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "I")
    public static int field2932 = -2;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "I")
    public static int field2931;

    @OriginalMember(owner = "client!qb", name = "e", descriptor = "I")
    public static int field2935;

    @OriginalMember(owner = "client!qb", name = "f", descriptor = "I")
    public static int field2936;

    @OriginalMember(owner = "client!qb", name = "i", descriptor = "I")
    public static int field2939;

    @OriginalMember(owner = "client!qb", name = "j", descriptor = "I")
    public static int field2940;

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "Lni;")
    public static class522 field2933;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(BI)V", line = 4)
    public final void method1344(byte arg0, int arg1) {
        field2939++;
        class262 var3 = this.field2938;
        synchronized (this.field2938) {
            if (arg0 != 30) {
                this.method1346(true, 112);
            }
            this.field2938.method1569((byte) 62, arg1);
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)V", line = 18)
    public static void method1345(int arg0) {
        if (arg0 < 48) {
            field2932 = -4;
        }
        field2933 = null;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(ZI)Lsc;", line = 35)
    public final class351 method1346(boolean arg0, int arg1) {
        field2936++;
        class262 var3 = this.field2938;
        class351 var4;
        synchronized (this.field2938) {
            var4 = (class351) this.field2938.method1571(-123, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class522 var5 = this.field2937;
        byte[] var6;
        synchronized (this.field2937) {
            var6 = this.field2937.method2885(arg1, 32, arg0);
        }
        class351 var7 = new class351();
        if (var6 != null) {
            var7.method2036(-22400, new class611(var6));
        }
        class262 var8 = this.field2938;
        synchronized (this.field2938) {
            this.field2938.method1574((long) arg1, var7, (byte) -80);
            return var7;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(B)V", line = 65)
    public final void method1347(byte arg0) {
        class262 var2 = this.field2938;
        synchronized (this.field2938) {
            this.field2938.method1563(102);
        }
        int var3 = 123 % ((-arg0 - 39) / 60);
        field2935++;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(BZ)V", line = 79)
    public static final void method1348(byte arg0, boolean arg1) {
        field2931++;
        class7.method18(22696);
        if (!class247.method1483(-11297, class713.field9949)) {
            return;
        }
        class303.field4093++;
        if (class303.field4093 < 50 && !arg1) {
            return;
        }
        if (arg0 < 45) {
            method1345(75);
        }
        class303.field4093 = 0;
        if (!class430.field6054 && class582.field8161 != null) {
            class161.field2027++;
            class103 var2 = class752.method4186(260, class450.field6292, class449.field6285);
            class27.method104(false, var2);
            try {
                class4.method10((byte) 81);
            } catch (IOException var3) {
                class430.field6054 = true;
            }
        }
        class7.method18(22696);
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(B)V", line = 123)
    public final void method1349(byte arg0) {
        class262 var2 = this.field2938;
        synchronized (this.field2938) {
            if (arg0 != 96) {
                this.field2937 = null;
            }
            this.field2938.method1575((byte) -121);
        }
        field2940++;
    }

    @OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(Lrga;ILni;)V", line = 140)
    public class226(class242 arg0, int arg1, class522 arg2) {
        this.field2937 = arg2;
        this.field2937.method2901(0, 32);
    }
}
