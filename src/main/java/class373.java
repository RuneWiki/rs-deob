import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public class class373 extends class65 {

    @OriginalMember(owner = "client!nl", name = "n", descriptor = "[B")
    public byte[] field5647;

    @OriginalMember(owner = "client!nl", name = "k", descriptor = "I")
    public static int field5644;

    @OriginalMember(owner = "client!nl", name = "l", descriptor = "I")
    public static int field5645;

    @OriginalMember(owner = "client!nl", name = "m", descriptor = "I")
    public static int field5646;

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(BII)Z")
    public static final boolean method2370(byte arg0, int arg1, int arg2) {
        field5644++;
        if (arg0 != 66) {
            method2371(null, 63, 91, -28);
        }
        return class650.method3662(arg0 - 64, arg2, arg1) || class10.method43(arg2, arg0 - 66, arg1);
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(Lraa;III)V")
    public static final void method2371(class353 arg0, int arg1, int arg2, int arg3) {
        class13.field121 = arg2;
        class382.field5739 = arg3;
        int var4 = -83 % ((arg1 - 44) / 47);
        field5645++;
        class550.field7847 = arg0;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(IIIJ)V")
    public static final void method2372(int arg0, int arg1, int arg2, long arg3) {
        int var5 = 81 % ((-arg0 - 50) / 34);
        field5646++;
        int var6 = ((int) arg3 & 0x7FFE1) >> 14;
        int var7 = ((int) arg3 & 0x3CF8ED) >> 20;
        int var8 = (int) (arg3 >>> 32) & Integer.MAX_VALUE;
        if (var6 != 10 && var6 != 11 && var6 != 22) {
            class490.method2973(arg1, 0, -30526, true, 0, var7, var6, arg2, 0);
            return;
        }
        class595 var9 = class576.field8167.method3074(0, var8);
        int var10;
        int var11;
        if (var7 == 0 || var7 == 2) {
            var11 = var9.field8384;
            var10 = var9.field8429;
        } else {
            var10 = var9.field8384;
            var11 = var9.field8429;
        }
        int var12 = var9.field8371;
        if (var7 != 0) {
            var12 = (var12 << var7 & 0xF) + (var12 >> 4 - var7);
        }
        class490.method2973(arg1, var11, -30526, true, var10, 0, 0, arg2, var12);
    }

    @OriginalMember(owner = "client!nl", name = "<init>", descriptor = "([B)V")
    public class373(byte[] arg0) {
        this.field5647 = arg0;
    }
}
