import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qea")
public class class356 {

    @OriginalMember(owner = "client!qea", name = "g", descriptor = "Ltq;")
    private class536 field4342 = new class536(64);

    @OriginalMember(owner = "client!qea", name = "k", descriptor = "Lwm;")
    private class30 field4346;

    @OriginalMember(owner = "client!qea", name = "m", descriptor = "Lmp;")
    public class334 field4348;

    @OriginalMember(owner = "client!qea", name = "h", descriptor = "[[Z")
    public static boolean[][] field4343 = new boolean[][] { new boolean[13], { false, false, true, true, true, true, true, false, false, false, false, false, true }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { false, true, true, true, true, true, false, false, false, false, false, false, true }, { false, true, true, true, true, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, false, true, true, true, true, true, true, false, false, true, true, false }, { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true } };

    @OriginalMember(owner = "client!qea", name = "j", descriptor = "[[Z")
    public static boolean[][] field4345 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };

    @OriginalMember(owner = "client!qea", name = "b", descriptor = "Ltia;")
    public static class740 field4337 = new class740(15000);

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "I")
    public static int field4336;

    @OriginalMember(owner = "client!qea", name = "c", descriptor = "I")
    public static int field4338;

    @OriginalMember(owner = "client!qea", name = "d", descriptor = "I")
    public static int field4339;

    @OriginalMember(owner = "client!qea", name = "e", descriptor = "I")
    public static int field4340;

    @OriginalMember(owner = "client!qea", name = "f", descriptor = "I")
    public static int field4341;

    @OriginalMember(owner = "client!qea", name = "l", descriptor = "I")
    public static int field4347;

    @OriginalMember(owner = "client!qea", name = "i", descriptor = "Lwm;")
    public static class30 field4344;

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "(IZ)I", line = 4)
    public static final int method2045(int arg0, boolean arg1) {
        field4338++;
        if (arg0 < 96) {
            return 0;
        } else if (arg0 < 128) {
            return 2;
        } else {
            if (!arg1) {
                method2049(30, (byte) -62, 76);
            }
            return 3;
        }
    }

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "(IB)V", line = 24)
    public final void method2046(int arg0, byte arg1) {
        field4341++;
        class536 var3 = this.field4342;
        synchronized (this.field4342) {
            this.field4342.method2928(true, arg0);
            if (arg1 != 124) {
                method2049(-93, (byte) -85, 36);
            }
        }
    }

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "(Z)V", line = 37)
    public static void method2047(boolean arg0) {
        field4337 = null;
        field4343 = null;
        field4345 = null;
        field4344 = null;
        if (arg0) {
            method2045(18, true);
        }
    }

    @OriginalMember(owner = "client!qea", name = "b", descriptor = "(IB)Lin;", line = 50)
    public final class68 method2048(int arg0, byte arg1) {
        field4336++;
        class536 var3 = this.field4342;
        class68 var4;
        synchronized (this.field4342) {
            var4 = (class68) this.field4342.method2931((long) arg0, (byte) -105);
        }
        if (var4 != null) {
            return var4;
        }
        class30 var5 = this.field4346;
        byte[] var6;
        synchronized (this.field4346) {
            var6 = this.field4346.method139(32, (byte) -94, arg0);
        }
        class68 var7 = new class68();
        if (arg1 <= 108) {
            return null;
        }
        var7.field929 = this;
        if (var6 != null) {
            var7.method393((byte) -110, new class234(var6));
        }
        class536 var8 = this.field4342;
        synchronized (this.field4342) {
            this.field4342.method2918((long) arg0, var7, 102);
            return var7;
        }
    }

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "(IBI)Z", line = 83)
    public static final boolean method2049(int arg0, byte arg1, int arg2) {
        int var3 = -37 % ((arg1 - 38) / 57);
        field4339++;
        return (arg2 & 0x60000) != 0 | class381.method2180(arg2, arg0, -1) || class173.method1085(-25808, arg0, arg2);
    }

    @OriginalMember(owner = "client!qea", name = "b", descriptor = "(Z)V", line = 94)
    public final void method2050(boolean arg0) {
        field4340++;
        if (!arg0) {
            class536 var2 = this.field4342;
            synchronized (this.field4342) {
                this.field4342.method2919(0);
            }
        }
    }

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "(I)V", line = 107)
    public final void method2051(int arg0) {
        class536 var2 = this.field4342;
        synchronized (this.field4342) {
            this.field4342.method2932((byte) 80);
        }
        field4347++;
        if (arg0 > -106) {
            method2045(-2, false);
        }
    }

    @OriginalMember(owner = "client!qea", name = "<init>", descriptor = "(Lega;ILwm;Lmp;)V", line = 140)
    public class356(class473 arg0, int arg1, class30 arg2, class334 arg3) {
        this.field4346 = arg2;
        this.field4346.method138(0, 32);
        this.field4348 = arg3;
    }
}
