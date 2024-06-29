import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class261 {

    @OriginalMember(owner = "client!ah", name = "d", descriptor = "Lnj;")
    private class162 field3625 = new class162(64);

    @OriginalMember(owner = "client!ah", name = "i", descriptor = "Lmg;")
    private class101 field3630;

    @OriginalMember(owner = "client!ah", name = "f", descriptor = "I")
    public static int field3627 = 64;

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "[B")
    public static byte[] field3624;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "I")
    public static int field3622;

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "I")
    public static int field3623;

    @OriginalMember(owner = "client!ah", name = "e", descriptor = "I")
    public static int field3626;

    @OriginalMember(owner = "client!ah", name = "g", descriptor = "I")
    public static int field3628;

    @OriginalMember(owner = "client!ah", name = "h", descriptor = "I")
    public static int field3629;

    @OriginalMember(owner = "client!ah", name = "j", descriptor = "I")
    public static int field3631;

    static {
        int var0 = 0;
        field3624 = new byte[32896];
        for (int var1 = 0; var1 < 256; var1++) {
            for (int var2 = 0; var2 <= var1; var2++) {
                field3624[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var1 * var1 + var2 * var2 + 65535) / 65535.0F))));
            }
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(I)V", line = 7)
    public final void method1567(int arg0) {
        class162 var2 = this.field3625;
        synchronized (this.field3625) {
            this.field3625.method1066(4080);
        }
        if (arg0 == 7470) {
            field3626++;
        }
    }

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "(I)V", line = 20)
    public static void method1568(int arg0) {
        field3624 = null;
        if (arg0 > -100) {
            field3627 = -123;
        }
    }

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "(I)V", line = 30)
    public final void method1569(int arg0) {
        class162 var2 = this.field3625;
        synchronized (this.field3625) {
            this.field3625.method1068(arg0 - 64);
            if (arg0 != 64) {
                field3631 = -94;
            }
        }
        field3629++;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(II)Ljc;", line = 52)
    public final class304 method1570(int arg0, int arg1) {
        field3623++;
        class162 var3 = this.field3625;
        class304 var4;
        synchronized (this.field3625) {
            var4 = (class304) this.field3625.method1073((long) arg0, false);
        }
        if (var4 != null) {
            return var4;
        }
        if (arg1 != 32896) {
            this.method1569(-122);
        }
        byte[] var5 = this.field3630.method727(class307.method1783((byte) 48, arg0), class254.method1526(arg0, arg1 + 399482538), -111);
        class304 var6 = new class304();
        if (var5 != null) {
            var6.method1771(new class391(var5), 32441);
        }
        class162 var7 = this.field3625;
        synchronized (this.field3625) {
            this.field3625.method1072((long) arg0, var6, false);
            return var6;
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(BI)V", line = 104)
    public final void method1571(byte arg0, int arg1) {
        field3622++;
        class162 var3 = this.field3625;
        synchronized (this.field3625) {
            if (arg0 > -2) {
                this.method1567(32);
            }
            this.field3625.method1068(0);
            this.field3625 = new class162(arg1);
        }
    }

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "(II)V", line = 118)
    public final void method1572(int arg0, int arg1) {
        class162 var3 = this.field3625;
        synchronized (this.field3625) {
            this.field3625.method1065((byte) -95, arg0);
        }
        int var4 = -18 / ((arg1 + 11) / 45);
        field3628++;
    }

    @OriginalMember(owner = "client!ah", name = "<init>", descriptor = "(Lal;ILmg;)V", line = 134)
    public class261(class66 arg0, int arg1, class101 arg2) {
        this.field3630 = arg2;
        if (this.field3630 != null) {
            int var4 = this.field3630.method746(109) - 1;
            this.field3630.method753(var4, -86);
        }
    }
}
