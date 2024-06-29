import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kda")
public class class411 extends class502 {

    @OriginalMember(owner = "client!kda", name = "i", descriptor = "Lju;")
    public static class137 field5617 = new class137(6, 3);

    @OriginalMember(owner = "client!kda", name = "p", descriptor = "Lvl;")
    public static class15 field5624 = new class15(35, -1);

    @OriginalMember(owner = "client!kda", name = "s", descriptor = "I")
    public static int field5627 = 1406;

    @OriginalMember(owner = "client!kda", name = "j", descriptor = "I")
    public static int field5618;

    @OriginalMember(owner = "client!kda", name = "k", descriptor = "I")
    public static int field5619;

    @OriginalMember(owner = "client!kda", name = "l", descriptor = "I")
    public static int field5620;

    @OriginalMember(owner = "client!kda", name = "m", descriptor = "I")
    public static int field5621;

    @OriginalMember(owner = "client!kda", name = "n", descriptor = "I")
    public static int field5622;

    @OriginalMember(owner = "client!kda", name = "o", descriptor = "I")
    public static int field5623;

    @OriginalMember(owner = "client!kda", name = "q", descriptor = "I")
    public static int field5625;

    @OriginalMember(owner = "client!kda", name = "r", descriptor = "I")
    public static int field5626;

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(II)I", line = 4)
    public final int method57(int arg0, int arg1) {
        ++field5621;
        int var3 = super.field6863.method2824((byte) -55).method193(arg1);
        if (var3 < 96) {
            return 3;
        } else if (~arg0 < -2 && ~var3 > -129) {
            return 3;
        } else {
            return ~arg0 < -4 && ~var3 > -193 ? 3 : 1;
        }
    }

    @OriginalMember(owner = "client!kda", name = "b", descriptor = "(I)V", line = 25)
    public static void method2436(int arg0) {
        field5624 = null;
        field5617 = null;
        if (arg0 != 1731778720) {
            field5622 = -114;
        }
    }

    @OriginalMember(owner = "client!kda", name = "c", descriptor = "(I)Z", line = 37)
    public final boolean method2437(int arg0) {
        ++field5623;
        int var2 = super.field6863.method2824((byte) 42).method193(arg0);
        return ~var2 <= -97;
    }

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(BLod;)I", line = 57)
    public static final int method2438(byte arg0, class534 arg1) {
        if (arg0 >= -49) {
            method2436(-70);
        }
        ++field5625;
        String var2 = class356.method2199((byte) 41, arg1);
        int[] var3 = null;
        if (class375.method2273((byte) -124, arg1.field7229)) {
            var3 = class143.field2427.method1410((byte) 82, (int) arg1.field7231).field10030;
        } else if (arg1.field7234 == -1) {
            if (!class93.method741(-124, arg1.field7229)) {
                if (class453.method2619(95, arg1.field7229)) {
                    Object var4 = null;
                    class445 var5;
                    if (~arg1.field7229 == -1008) {
                        var5 = class414.field5670.method2319((int) arg1.field7231, false);
                    } else {
                        var5 = class414.field5670.method2319((int) (2147483647L & arg1.field7231 >>> 32), false);
                    }
                    if (var5.field6028 != null) {
                        var5 = var5.method2580(126, class694.field9613);
                    }
                    if (var5 != null) {
                        var3 = var5.field6093;
                    }
                }
            } else {
                class755 var6 = (class755) class664.field9216.method337((long) ((int) arg1.field7231), 1);
                if (var6 != null) {
                    class666 var7 = var6.field10414;
                    class568 var8 = var7.field9253;
                    if (var8.field8023 != null) {
                        var8 = var8.method3283((byte) -122, class694.field9613);
                    }
                    if (var8 != null) {
                        var3 = var8.field8054;
                    }
                }
            }
        } else {
            var3 = class143.field2427.method1410((byte) 84, arg1.field7234).field10030;
        }
        if (var3 != null) {
            var2 = var2 + class57.method408((byte) -99, var3);
        }
        int var9 = class333.field4511.method1164(var2, 455, class146.field2462);
        if (arg1.field7230) {
            var9 += 4 + class467.field6329.method220();
        }
        return var9;
    }

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(Z)V", line = 128)
    public final void method58(boolean arg0) {
        ++field5619;
        if (!arg0) {
            this.method58(true);
        }
        int var2 = super.field6863.method2824((byte) 120).method193(0);
        if (~var2 > -97) {
            super.field6865 = 0;
        }
        if (~super.field6865 < -2 && var2 < 128) {
            super.field6865 = 1;
        }
        if (super.field6865 > 2 && var2 < 192) {
            super.field6865 = 2;
        }
        if (super.field6865 < 0 || ~super.field6865 < -4) {
            super.field6865 = this.method55(-2);
        }
    }

    @OriginalMember(owner = "client!kda", name = "c", descriptor = "(II)V", line = 156)
    public final void method52(int arg0, int arg1) {
        if (arg1 != 0) {
            this.method2439((byte) 40);
        }
        ++field5618;
        super.field6865 = arg0;
    }

    @OriginalMember(owner = "client!kda", name = "<init>", descriptor = "(ILeka;)V", line = 167)
    public class411(int arg0, class492 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!kda", name = "c", descriptor = "(B)I", line = 170)
    public final int method2439(byte arg0) {
        if (arg0 <= 49) {
            method2438((byte) -9, (class534) null);
        }
        ++field5620;
        return super.field6865;
    }

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(I)I", line = 183)
    public final int method55(int arg0) {
        if (arg0 != -2) {
            field5624 = null;
        }
        ++field5626;
        return 0;
    }

    @OriginalMember(owner = "client!kda", name = "<init>", descriptor = "(Leka;)V", line = 204)
    public class411(class492 arg0) {
        super(arg0);
    }
}
