import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qo")
public class class19 {

    @OriginalMember(owner = "client!qo", name = "g", descriptor = "Lr;")
    private class110 field267;

    @OriginalMember(owner = "client!qo", name = "e", descriptor = "I")
    public int field265;

    @OriginalMember(owner = "client!qo", name = "f", descriptor = "Z")
    public static boolean field266 = false;

    @OriginalMember(owner = "client!qo", name = "h", descriptor = "I")
    public static int field268 = -1;

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "I")
    public static int field261;

    @OriginalMember(owner = "client!qo", name = "c", descriptor = "I")
    public static int field263;

    @OriginalMember(owner = "client!qo", name = "d", descriptor = "I")
    public static int field264;

    @OriginalMember(owner = "client!qo", name = "b", descriptor = "Lr;")
    public static class110 field262;

    @OriginalMember(owner = "client!qo", name = "i", descriptor = "Lr;")
    public static class110 field269;

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(IZ)I")
    public static final int method120(int arg0, boolean arg1) {
        field264++;
        if (arg0 < 96) {
            return 0;
        } else if (arg0 < 128) {
            return 2;
        } else {
            if (!arg1) {
                field269 = null;
            }
            return 3;
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(IIII)I")
    public static final int method121(int arg0, int arg1, int arg2, int arg3) {
        field261++;
        if (arg2 == arg3) {
            return arg3;
        }
        int var4 = 128 - arg1;
        int var5 = (arg2 & 0x7F) * arg1 + (arg3 & 0x7F) * var4 >> 7;
        int var6 = (arg3 & 0x380) * var4 + ((arg2 & 0x380) * arg1) >> 7;
        if (arg0 == 64) {
            int var7 = (arg2 & 0xFC00) * arg1 + (arg3 & 0xFC00) * var4 >> 7;
            return var7 & 0xFC00 | var6 & 0x380 | var5 & 0x7F;
        } else {
            return 11;
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(ILbh;IB)V")
    public static final void method122(int arg0, class27 arg1, int arg2, byte arg3) {
        class177.field2408[arg2][arg0] = arg1;
        if (arg3 > -51) {
            method121(-25, -67, -39, 115);
        }
        field263++;
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(B)V")
    public static void method123(byte arg0) {
        field262 = null;
        field269 = null;
        if (arg0 >= -109) {
            method120(35, true);
        }
    }

    @OriginalMember(owner = "client!qo", name = "<init>", descriptor = "(Ldn;ILr;)V")
    public class19(class329 arg0, int arg1, class110 arg2) {
        new class76(64);
        this.field267 = arg2;
        this.field265 = this.field267.method694(15, (byte) 119);
    }
}
