import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class344 extends class305 {

    @OriginalMember(owner = "client!dj", name = "o", descriptor = "I")
    public static int field4987 = -1;

    @OriginalMember(owner = "client!dj", name = "p", descriptor = "I")
    public static int field4988 = 503;

    @OriginalMember(owner = "client!dj", name = "i", descriptor = "I")
    public static int field4981;

    @OriginalMember(owner = "client!dj", name = "j", descriptor = "I")
    public static int field4982;

    @OriginalMember(owner = "client!dj", name = "k", descriptor = "I")
    public static int field4983;

    @OriginalMember(owner = "client!dj", name = "l", descriptor = "I")
    public static int field4984;

    @OriginalMember(owner = "client!dj", name = "m", descriptor = "I")
    public static int field4985;

    @OriginalMember(owner = "client!dj", name = "n", descriptor = "I")
    public static int field4986;

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "(I)I", line = 3)
    public final int method2181(int arg0) {
        if (arg0 != 17503) {
            field4988 = 0;
        }
        ++field4984;
        return super.field4320;
    }

    @OriginalMember(owner = "client!dj", name = "<init>", descriptor = "(ILhb;)V", line = 16)
    public class344(int arg0, class728 arg1) {
        super(arg1);
    }

    @OriginalMember(owner = "client!dj", name = "<init>", descriptor = "(Lhb;)V", line = 20)
    public class344(class728 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "(II)V", line = 23)
    public final void method303(int arg0, int arg1) {
        if (arg0 == -27751) {
            ++field4981;
            super.field4320 = arg1;
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIBZI[Lsca;)V", line = 34)
    public static final void method2182(int arg0, int arg1, byte arg2, boolean arg3, int arg4, class46[] arg5) {
        ++field4982;
        int var6 = 0;
        if (arg2 == 81) {
            while (var6 < arg5.length) {
                class46 var7 = arg5[var6];
                if (var7 != null && ~var7.field557 == ~arg4) {
                    class58.method406((byte) 31, arg0, arg1, var7, arg3);
                    class654.method3785(arg1, arg0, arg2 ^ 55, var7);
                    if (var7.field527 > -var7.field549 + var7.field569) {
                        var7.field527 = var7.field569 - var7.field549;
                    }
                    if (var7.field554 > -var7.field574 + var7.field573) {
                        var7.field554 = var7.field573 - var7.field574;
                    }
                    if (~var7.field527 > -1) {
                        var7.field527 = 0;
                    }
                    if (var7.field554 < 0) {
                        var7.field554 = 0;
                    }
                    if (var7.field577 == 0) {
                        class256.method1679(var7, arg2 ^ 81, arg3);
                    }
                }
                ++var6;
            }
        }
    }

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "(B)V", line = 81)
    public final void method308(byte arg0) {
        if (~super.field4320 != -2 && super.field4320 != 0) {
            super.field4320 = this.method305((byte) 68);
        }
        if (arg0 >= -40) {
            field4987 = -48;
        }
        ++field4986;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(B)I", line = 97)
    public final int method305(byte arg0) {
        ++field4983;
        if (arg0 != 68) {
            this.method305((byte) 2);
        }
        return 1;
    }

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "(II)I", line = 112)
    public final int method306(int arg0, int arg1) {
        ++field4985;
        if (arg0 != 31401) {
            this.method2181(-72);
        }
        return 1;
    }
}
