import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class301 {

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "Laf;")
    private class39 field4370 = new class39(64);

    @OriginalMember(owner = "client!vi", name = "j", descriptor = "Lae;")
    private class283 field4378;

    @OriginalMember(owner = "client!vi", name = "d", descriptor = "[I")
    public static int[] field4372 = new int[16];

    @OriginalMember(owner = "client!vi", name = "f", descriptor = "F")
    public static float field4374;

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "I")
    public static int field4369;

    @OriginalMember(owner = "client!vi", name = "c", descriptor = "I")
    public static int field4371;

    @OriginalMember(owner = "client!vi", name = "g", descriptor = "I")
    public static int field4375;

    @OriginalMember(owner = "client!vi", name = "h", descriptor = "I")
    public static int field4376;

    @OriginalMember(owner = "client!vi", name = "i", descriptor = "I")
    public static int field4377;

    @OriginalMember(owner = "client!vi", name = "e", descriptor = "Z")
    public static boolean field4373;

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(I)V", line = 6)
    public final void method1963(int arg0) {
        field4375++;
        class39 var2 = this.field4370;
        synchronized (this.field4370) {
            this.field4370.method314(-2);
        }
        if (arg0 > -111) {
            this.method1968((byte) 73);
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(IB)V", line = 24)
    public final void method1964(int arg0, byte arg1) {
        if (arg1 <= 50) {
            field4372 = null;
        }
        field4376++;
        class39 var3 = this.field4370;
        synchronized (this.field4370) {
            this.field4370.method308(-1, arg0);
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(BI)V", line = 41)
    public final void method1965(byte arg0, int arg1) {
        class39 var3 = this.field4370;
        synchronized (this.field4370) {
            this.field4370.method314(-2);
            this.field4370 = new class39(arg1);
        }
        if (arg0 <= 64) {
            this.method1963(-128);
        }
        field4377++;
    }

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "(I)V", line = 58)
    public static void method1966(int arg0) {
        field4372 = null;
        if (arg0 > -122) {
            method1966(115);
        }
    }

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "(BI)Luca;", line = 68)
    public final class320 method1967(byte arg0, int arg1) {
        field4369++;
        class39 var3 = this.field4370;
        class320 var4;
        synchronized (this.field4370) {
            var4 = (class320) this.field4370.method312(0, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        if (arg0 != -77) {
            this.method1967((byte) 80, -6);
        }
        class283 var5 = this.field4378;
        byte[] var6;
        synchronized (this.field4378) {
            var6 = this.field4378.method1849(class133.method894(arg1, -4850), (byte) 54, class181.method1152(arg1, false));
        }
        class320 var7 = new class320();
        if (var6 != null) {
            var7.method2040((byte) -51, new class511(var6));
        }
        class39 var8 = this.field4370;
        synchronized (this.field4370) {
            this.field4370.method305(var7, (long) arg1, arg0 + 18397);
            return var7;
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(B)V", line = 99)
    public final void method1968(byte arg0) {
        field4371++;
        class39 var2 = this.field4370;
        synchronized (this.field4370) {
            this.field4370.method319(-95);
            if (arg0 != 57) {
                method1966(127);
            }
        }
    }

    @OriginalMember(owner = "client!vi", name = "<init>", descriptor = "(Ljk;ILae;)V", line = 115)
    public class301(class788 arg0, int arg1, class283 arg2) {
        this.field4378 = arg2;
        if (this.field4378 != null) {
            int var4 = this.field4378.method1866((byte) 73) - 1;
            this.field4378.method1867(var4, (byte) 49);
        }
    }
}
