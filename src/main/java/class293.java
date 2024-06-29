import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vv")
public class class293 {

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "Lpca;")
    private class653 field3843 = new class653(64);

    @OriginalMember(owner = "client!vv", name = "m", descriptor = "I")
    public int field3855 = 0;

    @OriginalMember(owner = "client!vv", name = "l", descriptor = "Ljo;")
    private class303 field3854;

    @OriginalMember(owner = "client!vv", name = "b", descriptor = "I")
    public int field3844;

    @OriginalMember(owner = "client!vv", name = "f", descriptor = "I")
    public static int field3848 = -1;

    @OriginalMember(owner = "client!vv", name = "c", descriptor = "I")
    public static int field3845;

    @OriginalMember(owner = "client!vv", name = "d", descriptor = "I")
    public static int field3846;

    @OriginalMember(owner = "client!vv", name = "e", descriptor = "I")
    public static int field3847;

    @OriginalMember(owner = "client!vv", name = "g", descriptor = "I")
    public static int field3849;

    @OriginalMember(owner = "client!vv", name = "h", descriptor = "I")
    public static int field3850;

    @OriginalMember(owner = "client!vv", name = "i", descriptor = "I")
    public static int field3851;

    @OriginalMember(owner = "client!vv", name = "j", descriptor = "I")
    public static int field3852;

    @OriginalMember(owner = "client!vv", name = "k", descriptor = "I")
    public static int field3853;

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(I)V")
    public final void method1667(int arg0) {
        field3845++;
        class653 var2 = this.field3843;
        synchronized (this.field3843) {
            if (arg0 != 64) {
                this.method1670(11);
            }
            this.field3843.method3687((byte) -10);
        }
    }

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(II)V")
    public final void method1668(int arg0, int arg1) {
        int var3 = 112 % ((13 - arg1) / 52);
        class653 var4 = this.field3843;
        synchronized (this.field3843) {
            this.field3843.method3691(false, arg0);
        }
        field3850++;
    }

    @OriginalMember(owner = "client!vv", name = "b", descriptor = "(II)Lgf;")
    public final class250 method1669(int arg0, int arg1) {
        field3852++;
        class653 var3 = this.field3843;
        class250 var5;
        synchronized (this.field3843) {
            if (arg0 <= 113) {
                return null;
            }
            var5 = (class250) this.field3843.method3690((byte) -55, (long) arg1);
        }
        if (var5 != null) {
            return var5;
        }
        class303 var6 = this.field3854;
        byte[] var7;
        synchronized (this.field3854) {
            var7 = this.field3854.method1719(arg1, 4, 4);
        }
        class250 var8 = new class250();
        var8.field3211 = arg1;
        var8.field3218 = this;
        if (var7 != null) {
            var8.method1433(new class452(var7), 0);
        }
        var8.method1437(true);
        class653 var9 = this.field3843;
        synchronized (this.field3843) {
            this.field3843.method3683(var8, (byte) 116, (long) arg1);
            return var8;
        }
    }

    @OriginalMember(owner = "client!vv", name = "b", descriptor = "(I)V")
    public final void method1670(int arg0) {
        class653 var2 = this.field3843;
        synchronized (this.field3843) {
            this.field3843.method3684(-17200);
        }
        int var3 = -19 / ((arg0 - 49) / 43);
        field3846++;
    }

    @OriginalMember(owner = "client!vv", name = "c", descriptor = "(I)J")
    public static final long method1671(int arg0) {
        if (arg0 != 4) {
            method1672(58, 82, -51);
        }
        field3853++;
        return class259.field3300.method1000((byte) -19);
    }

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(III)I")
    public static final int method1672(int arg0, int arg1, int arg2) {
        field3851++;
        if (arg2 == 4 || arg2 == 5) {
            return class162.field1929[arg1 & 0x3];
        } else {
            if (arg0 != -6) {
                field3847 = 87;
            }
            return 256;
        }
    }

    @OriginalMember(owner = "client!vv", name = "<init>", descriptor = "(Ljda;ILjo;)V")
    public class293(class207 arg0, int arg1, class303 arg2) {
        this.field3854 = arg2;
        this.field3844 = this.field3854.method1727(-77, 4);
    }
}
