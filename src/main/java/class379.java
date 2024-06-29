import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eaa")
public class class379 extends class756 {

    @OriginalMember(owner = "client!eaa", name = "t", descriptor = "I")
    private int field5307;

    @OriginalMember(owner = "client!eaa", name = "n", descriptor = "I")
    private int field5301;

    @OriginalMember(owner = "client!eaa", name = "m", descriptor = "I")
    private int field5300;

    @OriginalMember(owner = "client!eaa", name = "o", descriptor = "I")
    private int field5302;

    @OriginalMember(owner = "client!eaa", name = "j", descriptor = "Z")
    public static boolean field5297 = true;

    @OriginalMember(owner = "client!eaa", name = "k", descriptor = "Lmq;")
    public static class78 field5298 = new class78(74, -2);

    @OriginalMember(owner = "client!eaa", name = "l", descriptor = "I")
    public static int field5299;

    @OriginalMember(owner = "client!eaa", name = "q", descriptor = "I")
    public static int field5304;

    @OriginalMember(owner = "client!eaa", name = "r", descriptor = "I")
    public static int field5305;

    @OriginalMember(owner = "client!eaa", name = "s", descriptor = "I")
    public static int field5306;

    @OriginalMember(owner = "client!eaa", name = "p", descriptor = "Lkha;")
    public static class687 field5303;

    @OriginalMember(owner = "client!eaa", name = "b", descriptor = "(I)V", line = 6)
    public static void method2295(int arg0) {
        field5303 = null;
        if (arg0 != 16711935) {
            method2295(26);
        }
        field5298 = null;
    }

    @OriginalMember(owner = "client!eaa", name = "<init>", descriptor = "(IIIIII)V", line = 19)
    public class379(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field5307 = arg1;
        this.field5301 = arg2;
        this.field5300 = arg0;
        this.field5302 = arg3;
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(III)V", line = 30)
    public final void method1897(int arg0, int arg1, int arg2) {
        int var4 = 3 % ((68 - arg2) / 33);
        ++field5305;
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(BII)V", line = 39)
    public final void method1903(byte arg0, int arg1, int arg2) {
        int var4 = -72 / ((82 - arg0) / 40);
        ++field5304;
        int var5 = this.field5300 * arg1 >> 12;
        int var6 = this.field5301 * arg1 >> 12;
        int var7 = this.field5307 * arg2 >> 12;
        int var8 = this.field5302 * arg2 >> 12;
        class638.method3460(var5, (byte) 20, var7, super.field10533, var8, var6);
    }

    @OriginalMember(owner = "client!eaa", name = "c", descriptor = "(I)V", line = 58)
    public static final void method2296(int arg0) {
        ++field5299;
        if (class127.field1537 >= 0) {
            long var1 = class97.method654((byte) 76);
            class127.field1537 = (int) ((long) class127.field1537 - (-class400.field5538 + var1));
            if (class127.field1537 > 0) {
                int var3 = (class127.field1537 << 8) / class522.field7393;
                int var4 = -var3 + 255;
                float var5 = (float) var3 / 255.0F;
                class244.field3139 = ((16711935 & class283.field3614) * var3 + (class439.field6167.field10011 & 16711935) * var4 & -16711936) - -(16711680 & (65280 & class283.field3614) * var3 - -((65280 & class439.field6167.field10011) * var4)) >>> 8;
                float var6 = 1.0F - var5;
                class154.field1868 = ((class117.field1425 & 65280) * var3 + (65280 & class439.field6167.field10005) * var4 & 16711680) + ((16711935 & class117.field1425) * var3 + (class439.field6167.field10005 & 16711935) * var4 & -16711936) >>> 8;
                class238.field3075 = (class439.field6167.field10013 - class349.field4522) * var6 + class349.field4522;
                class153.field1857 = (-class294.field3830 + class439.field6167.field10015) * var6 + class294.field3830;
                class156.field1977 = (-class529.field7465 + class439.field6167.field10000) * var6 + class529.field7465;
                class200.field2563 = (class439.field6167.field9998 - class387.field5386) * var6 + class387.field5386;
                class402.field5571 = class220.field2794 * var3 + class439.field6167.field10010 * var4 >> 8;
                class192.field2514 = (class439.field6167.field10008 - class673.field9170) * var6 + class673.field9170;
                class306.field3937 = (class439.field6167.field10003 - class348.field4508) * var6 + class348.field4508;
                if (class404.field5703 != class439.field6167.field10006) {
                    class669.field9153 = class518.field7289.method119(class404.field5703, class439.field6167.field10006, var6, class669.field9153);
                }
            } else {
                class127.field1537 = -1;
                class154.field1868 = class439.field6167.field10005;
                class238.field3075 = class439.field6167.field10013;
                class153.field1857 = class439.field6167.field10015;
                class669.field9153 = class439.field6167.field10006;
                class402.field5571 = class439.field6167.field10010;
                class156.field1977 = class439.field6167.field10000;
                class200.field2563 = class439.field6167.field9998;
                class192.field2514 = class439.field6167.field10008;
                class244.field3139 = class439.field6167.field10011;
                class306.field3937 = class439.field6167.field10003;
            }
            class400.field5538 = var1;
        }
        if (arg0 != 13298) {
            field5297 = true;
        }
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(IIB)V", line = 114)
    public final void method1902(int arg0, int arg1, byte arg2) {
        if (arg2 <= -74) {
            ++field5306;
        }
    }
}
