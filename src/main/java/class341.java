import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vv")
public class class341 extends class72 implements class274 {

    @OriginalMember(owner = "client!vv", name = "l", descriptor = "I")
    private int field5061;

    @OriginalMember(owner = "client!vv", name = "i", descriptor = "[I")
    public static int[] field5058 = new int[6];

    @OriginalMember(owner = "client!vv", name = "j", descriptor = "I")
    public static int field5059 = 1;

    @OriginalMember(owner = "client!vv", name = "h", descriptor = "[I")
    public static int[] field5057 = new int[64];

    @OriginalMember(owner = "client!vv", name = "c", descriptor = "I")
    public static int field5052;

    @OriginalMember(owner = "client!vv", name = "d", descriptor = "I")
    public static int field5053;

    @OriginalMember(owner = "client!vv", name = "e", descriptor = "I")
    public static int field5054;

    @OriginalMember(owner = "client!vv", name = "f", descriptor = "I")
    public static int field5055;

    @OriginalMember(owner = "client!vv", name = "g", descriptor = "I")
    public static int field5056;

    @OriginalMember(owner = "client!vv", name = "k", descriptor = "I")
    public static int field5060;

    @OriginalMember(owner = "client!vv", name = "m", descriptor = "I")
    public static int field5062;

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(IIZLjava/lang/String;Ljava/lang/String;)V")
    public static final void method2186(int arg0, int arg1, boolean arg2, String arg3, String arg4) {
        ++field5052;
        class731 var5 = class744.method4154((byte) -115);
        var5.field10211.method851((byte) -2, class17.field286.field8702);
        var5.field10211.method860(0, (byte) 118);
        int var6 = var5.field10211.field1521;
        var5.field10211.method860(644, (byte) 119);
        int[] var7 = class757.method4182(31035, var5);
        int var8 = var5.field10211.field1521;
        var5.field10211.method880(true, arg4);
        var5.field10211.method860(class87.field1139, (byte) 125);
        var5.field10211.method880(true, arg3);
        var5.field10211.method848(class411.field5802, true);
        var5.field10211.method851((byte) -2, class526.field7494);
        var5.field10211.method851((byte) -2, class536.field7555.field1305);
        class165.method1286(var5.field10211, (byte) 112);
        String var9 = class557.field7920;
        int var10 = -80 % ((arg1 - 47) / 46);
        var5.field10211.method851((byte) -2, var9 != null ? 1 : 0);
        if (var9 != null) {
            var5.field10211.method880(true, var9);
        }
        var5.field10211.method851((byte) -2, arg0);
        var5.field10211.method851((byte) -2, !arg2 ? 0 : 1);
        var5.field10211.field1521 += 7;
        var5.field10211.method887(var7, var8, 64, var5.field10211.field1521);
        var5.field10211.method844(var5.field10211.field1521 - var6, -1816748120);
        class533.method3088(var5, 0);
        class715.field10078 = -3;
        class789.field10835 = 0;
        class284.field4365 = 1;
        class207.field3027 = 0;
        if (arg0 < 13) {
            class621.field8760 = true;
            class118.method826(29693);
        }
    }

    @OriginalMember(owner = "client!vv", name = "b", descriptor = "(I)J")
    public final long method1777(int arg0) {
        if (arg0 != -30677) {
            return -75L;
        } else {
            ++field5060;
            return super.field970.getAddress();
        }
    }

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(BII[B)V")
    public final void method1776(byte arg0, int arg1, int arg2, byte[] arg3) {
        this.method567(arg3, arg1);
        int var5 = -19 / ((arg0 - 58) / 41);
        ++field5053;
        this.field5061 = arg2;
    }

    @OriginalMember(owner = "client!vv", name = "c", descriptor = "(I)V")
    public static void method2187(int arg0) {
        field5058 = null;
        if (arg0 != -30495) {
            method2186(100, 36, false, (String) null, (String) null);
        }
        field5057 = null;
    }

    @OriginalMember(owner = "client!vv", name = "<init>", descriptor = "(Lkv;I[BI)V")
    public class341(class280 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field5061 = arg1;
    }

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(I)I")
    public final int method1774(int arg0) {
        ++field5062;
        int var2 = -40 % ((7 - arg0) / 61);
        return 0;
    }

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(Z)I")
    public final int method1775(boolean arg0) {
        if (arg0) {
            this.method1775(false);
        }
        ++field5054;
        return this.field5061;
    }
}
