import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gq")
public class class209 {

    @OriginalMember(owner = "client!gq", name = "i", descriptor = "Lvi;")
    private class560 field2746 = new class560(16);

    @OriginalMember(owner = "client!gq", name = "h", descriptor = "Lpq;")
    private class159 field2745;

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "I")
    public static int field2738;

    @OriginalMember(owner = "client!gq", name = "b", descriptor = "I")
    public static int field2739;

    @OriginalMember(owner = "client!gq", name = "d", descriptor = "I")
    public static int field2741;

    @OriginalMember(owner = "client!gq", name = "e", descriptor = "I")
    public static int field2742;

    @OriginalMember(owner = "client!gq", name = "f", descriptor = "I")
    public static int field2743;

    @OriginalMember(owner = "client!gq", name = "g", descriptor = "I")
    public static int field2744;

    @OriginalMember(owner = "client!gq", name = "c", descriptor = "Lpq;")
    public static class159 field2740;

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(BI)V", line = 6)
    public final void method1306(byte arg0, int arg1) {
        class560 var3 = this.field2746;
        synchronized (this.field2746) {
            this.field2746.method3129(arg1, arg0 + 14657);
        }
        if (arg0 != -74) {
            this.method1308(-55, -35);
        }
        field2743++;
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(III)Z", line = 20)
    public static final boolean method1307(int arg0, int arg1, int arg2) {
        int var3 = 75 % ((-arg1 - 36) / 52);
        field2741++;
        return (arg0 & 0x400) != 0;
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(II)Lmp;", line = 33)
    public final class603 method1308(int arg0, int arg1) {
        field2738++;
        class560 var3 = this.field2746;
        class603 var4;
        synchronized (this.field2746) {
            var4 = (class603) this.field2746.method3134((long) arg1, -56);
        }
        if (var4 != null) {
            return var4;
        }
        class159 var5 = this.field2745;
        byte[] var6;
        synchronized (this.field2745) {
            var6 = this.field2745.method1087(arg0, arg1, 1);
        }
        class603 var7 = new class603();
        if (var6 != null) {
            var7.method3337((byte) 115, new class138(var6));
        }
        class560 var8 = this.field2746;
        synchronized (this.field2746) {
            this.field2746.method3130((long) arg1, true, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(I)V", line = 61)
    public final void method1309(int arg0) {
        class560 var2 = this.field2746;
        synchronized (this.field2746) {
            this.field2746.method3142(false);
            if (arg0 != -22751) {
                this.method1309(-94);
            }
        }
        field2744++;
    }

    @OriginalMember(owner = "client!gq", name = "b", descriptor = "(I)V", line = 75)
    public static void method1310(int arg0) {
        field2740 = null;
        int var1 = 111 / (-arg0 / 58);
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(Lcga;IIIII)V", line = 88)
    public static final void method1311(class255 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        arg0.field3524 = 0;
        for (int var6 = 0; var6 < 4; var6++) {
            if (arg0.field3515[var6] != null) {
                arg0.field3524++;
            }
        }
        label50: for (int var7 = 0; var7 < arg0.field3524; var7++) {
            long var8 = class369.field5304[arg1][arg2][arg3];
            while (var8 != 0L) {
                class123 var14 = class660.field9370[(int) ((var8 & 0xFFFFL) - 1L)];
                var8 >>>= 0x10;
                if (arg0.field3515[var7] == var14.field1591) {
                    continue label50;
                }
            }
            long var10 = class369.field5304[arg1][arg4][arg5];
            while (var10 != 0L) {
                class123 var13 = class660.field9370[(int) ((var10 & 0xFFFFL) - 1L)];
                var10 >>>= 0x10;
                if (arg0.field3515[var7] == var13.field1591) {
                    continue label50;
                }
            }
            for (int var12 = var7; var12 < arg0.field3524 - 1; var12++) {
                arg0.field3515[var12] = arg0.field3515[var12 + 1];
            }
            arg0.field3524--;
        }
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(B)V", line = 142)
    public final void method1312(byte arg0) {
        field2742++;
        class560 var2 = this.field2746;
        synchronized (this.field2746) {
            int var3 = -114 / ((64 - arg0) / 42);
            this.field2746.method3144(true);
        }
    }

    @OriginalMember(owner = "client!gq", name = "<init>", descriptor = "(Luea;ILpq;)V", line = 157)
    public class209(class484 arg0, int arg1, class159 arg2) {
        this.field2745 = arg2;
        this.field2745.method1076(30, 0);
    }
}
