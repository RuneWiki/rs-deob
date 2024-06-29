import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ada")
public class class149 {

    @OriginalMember(owner = "client!ada", name = "h", descriptor = "Lvh;")
    private class328 field2225 = new class328(64);

    @OriginalMember(owner = "client!ada", name = "j", descriptor = "I")
    public int field2227 = 0;

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "Lpj;")
    private class132 field2218;

    @OriginalMember(owner = "client!ada", name = "f", descriptor = "I")
    public int field2223;

    @OriginalMember(owner = "client!ada", name = "d", descriptor = "F")
    public static float field2221 = 0.0F;

    @OriginalMember(owner = "client!ada", name = "b", descriptor = "I")
    public static int field2219;

    @OriginalMember(owner = "client!ada", name = "c", descriptor = "I")
    public static int field2220;

    @OriginalMember(owner = "client!ada", name = "e", descriptor = "I")
    public static int field2222;

    @OriginalMember(owner = "client!ada", name = "g", descriptor = "I")
    public static int field2224;

    @OriginalMember(owner = "client!ada", name = "i", descriptor = "I")
    public static int field2226;

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "(II)Ljp;", line = 7)
    public final class323 method1046(int arg0, int arg1) {
        if (arg0 >= -19) {
            return null;
        }
        field2226++;
        class328 var3 = this.field2225;
        class323 var4;
        synchronized (this.field2225) {
            var4 = (class323) this.field2225.method1986((byte) -125, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class132 var5 = this.field2218;
        byte[] var6;
        synchronized (this.field2218) {
            var6 = this.field2218.method940(4, arg1, 0);
        }
        class323 var7 = new class323();
        var7.field4779 = arg1;
        var7.field4782 = this;
        if (var6 != null) {
            var7.method1961(-127, new class96(var6));
        }
        var7.method1963((byte) -100);
        class328 var8 = this.field2225;
        synchronized (this.field2225) {
            this.field2225.method1985(var7, (long) arg1, (byte) -102);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ada", name = "b", descriptor = "(II)V", line = 41)
    public final void method1047(int arg0, int arg1) {
        field2220++;
        class328 var3 = this.field2225;
        synchronized (this.field2225) {
            this.field2225.method1989(arg1, (byte) 120);
        }
        if (arg0 != 4) {
            field2221 = 0.018908039F;
        }
    }

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "(I)V", line = 59)
    public final void method1048(int arg0) {
        class328 var2 = this.field2225;
        synchronized (this.field2225) {
            this.field2225.method1997(arg0 ^ 0xFFFF9782);
        }
        field2222++;
        if (arg0 != -26749) {
            this.field2225 = null;
        }
    }

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "(B)V", line = 73)
    public final void method1049(byte arg0) {
        field2219++;
        class328 var2 = this.field2225;
        synchronized (this.field2225) {
            this.field2225.method1987(-31085);
        }
        if (arg0 <= 45) {
            this.field2225 = null;
        }
    }

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "(ZLjr;I)Ljava/lang/String;", line = 92)
    public static final String method1050(boolean arg0, class96 arg1, int arg2) {
        field2224++;
        try {
            if (!arg0) {
                method1050(false, null, 48);
            }
            int var3 = arg1.method733((byte) 72);
            if (var3 > arg2) {
                var3 = arg2;
            }
            byte[] var4 = new byte[var3];
            arg1.field1301 += class135.field1905.method1952((byte) 95, var4, var3, arg1.field1316, 0, arg1.field1301);
            return class210.method1384(0, var3, var4, (byte) 31);
        } catch (Exception var6) {
            return "Cabbage";
        }
    }

    @OriginalMember(owner = "client!ada", name = "<init>", descriptor = "(Ldd;ILpj;)V", line = 129)
    public class149(class647 arg0, int arg1, class132 arg2) {
        this.field2218 = arg2;
        this.field2223 = this.field2218.method936(4, -128);
    }
}
