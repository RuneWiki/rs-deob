import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class735 {

    @OriginalMember(owner = "client!pg", name = "f", descriptor = "Lde;")
    private class534 field10227 = new class534(128);

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "Lnd;")
    private class547 field10223;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "[I")
    public static int[] field10222 = new int[32];

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "I")
    public static int field10224;

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "I")
    public static int field10225;

    @OriginalMember(owner = "client!pg", name = "e", descriptor = "I")
    public static int field10226;

    @OriginalMember(owner = "client!pg", name = "g", descriptor = "I")
    public static int field10228;

    @OriginalMember(owner = "client!pg", name = "h", descriptor = "I")
    public static int field10229;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(II)V", line = 7)
    public final void method4096(int arg0, int arg1) {
        class534 var3 = this.field10227;
        synchronized (this.field10227) {
            if (arg0 > -71) {
                this.method4099(-4, -63);
            }
            this.field10227.method3070(arg1, 120);
        }
        field10224++;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(B)V", line = 23)
    public final void method4097(byte arg0) {
        field10228++;
        class534 var2 = this.field10227;
        synchronized (this.field10227) {
            this.field10227.method3064(false);
            if (arg0 < 124) {
                this.method4097((byte) -77);
            }
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Z)V", line = 40)
    public static void method4098(boolean arg0) {
        field10222 = null;
        if (!arg0) {
            field10222 = null;
        }
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(II)Lao;", line = 52)
    public final class290 method4099(int arg0, int arg1) {
        field10225++;
        class534 var3 = this.field10227;
        class290 var4;
        synchronized (this.field10227) {
            var4 = (class290) this.field10227.method3079((long) arg0, 0);
        }
        if (var4 != null) {
            return var4;
        }
        class547 var5 = this.field10223;
        byte[] var6;
        synchronized (this.field10223) {
            var6 = this.field10223.method3153(arg0, 0, arg1);
        }
        class290 var7 = new class290();
        if (var6 != null) {
            var7.method1738(new class461(var6), (byte) 53);
        }
        class534 var8 = this.field10227;
        synchronized (this.field10227) {
            this.field10227.method3077((byte) 109, (long) arg0, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!pg", name = "<init>", descriptor = "(Lal;ILnd;)V", line = 83)
    public class735(class102 arg0, int arg1, class547 arg2) {
        this.field10223 = arg2;
        this.field10223.method3178((byte) 62, 1);
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(Z)V", line = 98)
    public static final void method4100(boolean arg0) {
        class414.method2326(22050, class748.field10451.field10408.method1903((byte) -117) == 1, arg0, 2);
        field10226++;
        class684.field9529 = class760.method4225(class162.field2227, 1, 0, class262.field3311, 22050);
        class660.method3715(class143.method1036(-11, null), arg0, 5);
        class317.field4106 = class760.method4225(class162.field2227, 1, 1, class262.field3311, 2048);
        class307.field4055 = new class204();
        class317.field4106.method3651((byte) -106, class307.field4055);
        class18.field331 = new class396(22050, class541.field7490);
        class638.method3575(-123);
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(B)V", line = 114)
    public final void method4101(byte arg0) {
        field10229++;
        if (arg0 == -70) {
            class534 var2 = this.field10227;
            synchronized (this.field10227) {
                this.field10227.method3065(true);
            }
        }
    }
}
