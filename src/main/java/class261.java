import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!es")
public class class261 {

    @OriginalMember(owner = "client!es", name = "g", descriptor = "Lhn;")
    private class509 field3503 = new class509(64);

    @OriginalMember(owner = "client!es", name = "j", descriptor = "Lhn;")
    public class509 field3506 = new class509(30);

    @OriginalMember(owner = "client!es", name = "h", descriptor = "Lfo;")
    private class361 field3504;

    @OriginalMember(owner = "client!es", name = "f", descriptor = "Lfo;")
    public class361 field3502;

    @OriginalMember(owner = "client!es", name = "d", descriptor = "I")
    public static int field3500 = 0;

    @OriginalMember(owner = "client!es", name = "a", descriptor = "I")
    public static int field3497;

    @OriginalMember(owner = "client!es", name = "b", descriptor = "I")
    public static int field3498;

    @OriginalMember(owner = "client!es", name = "c", descriptor = "I")
    public static int field3499;

    @OriginalMember(owner = "client!es", name = "e", descriptor = "I")
    public static int field3501;

    @OriginalMember(owner = "client!es", name = "i", descriptor = "I")
    public static int field3505;

    @OriginalMember(owner = "client!es", name = "k", descriptor = "I")
    public int field3507;

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(Z)V")
    public final void method1607(boolean arg0) {
        class509 var2 = this.field3503;
        synchronized (this.field3503) {
            this.field3503.method3045(48);
        }
        if (!arg0) {
            return;
        }
        field3498++;
        class509 var3 = this.field3506;
        synchronized (this.field3506) {
            this.field3506.method3045(48);
        }
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(BI)Lkc;")
    public final class88 method1608(byte arg0, int arg1) {
        field3497++;
        class509 var3 = this.field3503;
        class88 var4;
        synchronized (this.field3503) {
            var4 = (class88) this.field3503.method3032(arg0 ^ 0xE57, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class361 var5 = this.field3504;
        byte[] var6;
        synchronized (this.field3504) {
            var6 = this.field3504.method2130(class502.method3013(arg1, 2), class104.method627((byte) -35, arg1), -109);
        }
        class88 var7 = new class88();
        var7.field1044 = this;
        var7.field1064 = arg1;
        if (var6 != null) {
            var7.method489(0, new class396(var6));
        }
        class509 var8 = this.field3503;
        synchronized (this.field3503) {
            if (arg0 != 82) {
                this.method1608((byte) 42, 20);
            }
            this.field3503.method3046((long) arg1, var7, 1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!es", name = "b", descriptor = "(Z)V")
    public final void method1609(boolean arg0) {
        class509 var2 = this.field3503;
        synchronized (this.field3503) {
            this.field3503.method3034((byte) 116);
        }
        field3501++;
        class509 var3 = this.field3506;
        synchronized (this.field3506) {
            this.field3506.method3034((byte) 126);
            if (arg0) {
                this.field3506 = null;
            }
        }
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(IZ)V")
    public final void method1610(int arg0, boolean arg1) {
        class509 var3 = this.field3503;
        synchronized (this.field3503) {
            this.field3503.method3036(arg0, (byte) -70);
        }
        field3499++;
        if (arg1) {
            this.method1608((byte) -113, -58);
        }
        class509 var4 = this.field3506;
        synchronized (this.field3506) {
            this.field3506.method3036(arg0, (byte) -11);
        }
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(II)V")
    public final void method1611(int arg0, int arg1) {
        field3505++;
        this.field3507 = arg0;
        class509 var3 = this.field3506;
        synchronized (this.field3506) {
            this.field3506.method3045(arg1 + 48);
            if (arg1 != 0) {
                this.field3504 = null;
            }
        }
    }

    @OriginalMember(owner = "client!es", name = "<init>", descriptor = "(Ld;ILfo;Lfo;)V")
    public class261(class104 arg0, int arg1, class361 arg2, class361 arg3) {
        this.field3504 = arg2;
        this.field3502 = arg3;
        int var5 = this.field3504.method2138(-1) - 1;
        this.field3504.method2136(-73, var5);
    }
}
