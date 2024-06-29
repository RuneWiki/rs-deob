import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jv")
public class class55 extends class354 {

    @OriginalMember(owner = "client!jv", name = "K", descriptor = "I")
    private int field805 = 204;

    @OriginalMember(owner = "client!jv", name = "O", descriptor = "I")
    private int field809 = 1;

    @OriginalMember(owner = "client!jv", name = "I", descriptor = "I")
    private int field803 = 1;

    @OriginalMember(owner = "client!jv", name = "R", descriptor = "F")
    public static float field812;

    @OriginalMember(owner = "client!jv", name = "J", descriptor = "I")
    public static int field804;

    @OriginalMember(owner = "client!jv", name = "L", descriptor = "I")
    public static int field806;

    @OriginalMember(owner = "client!jv", name = "M", descriptor = "I")
    public static int field807;

    @OriginalMember(owner = "client!jv", name = "Q", descriptor = "I")
    public static int field811;

    @OriginalMember(owner = "client!jv", name = "S", descriptor = "I")
    public static int field813;

    @OriginalMember(owner = "client!jv", name = "N", descriptor = "Loa;")
    public static class488 field808;

    @OriginalMember(owner = "client!jv", name = "P", descriptor = "[I")
    public static int[] field810;

    @OriginalMember(owner = "client!jv", name = "e", descriptor = "(I)V", line = 6)
    public static final void method396(int arg0) {
        ++field806;
        if (~class41.field633.length() != -1) {
            int var1 = -91 % ((arg0 - 22) / 55);
            class105.method796("--> " + class41.field633, (byte) 119);
            class92.method745(false, (byte) -91, class41.field633);
            class41.field633 = "";
            class348.field5285 = 0;
            class192.field2812 = 0;
        }
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(IC)Z", line = 25)
    public static final boolean method397(int arg0, char arg1) {
        ++field811;
        if ((arg1 <= 0 || arg1 >= 128) && (arg1 < 160 || arg1 > 255)) {
            if (arg0 != -19623) {
                method398((String) null, (byte) -62);
            }
            if (~arg1 != -1) {
                char[] var2 = class60.field1047;
                for (int var3 = 0; var2.length > var3; ++var3) {
                    char var4 = var2[var3];
                    if (arg1 == var4) {
                        return true;
                    }
                }
            }
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(IB)[I", line = 58)
    public final int[] method253(int arg0, byte arg1) {
        ++field813;
        int[] var3 = super.field5357.method861(true, arg0);
        if (super.field5357.field1869) {
            for (int var4 = 0; var4 < class404.field5952; ++var4) {
                int var5 = class154.field2358[var4];
                int var6 = class278.field4009[arg0];
                int var7 = this.field803 * var5 >> 12;
                int var8 = this.field809 * var6 >> 12;
                int var9 = var5 % (4096 / this.field803) * this.field803;
                int var10 = var6 % (4096 / this.field809) * this.field809;
                if (~var10 > ~this.field805) {
                    for (var7 -= var8; ~var7 > -1; var7 += 4) {
                    }
                    while (~var7 < -4) {
                        var7 -= 4;
                    }
                    if (var7 != 1) {
                        var3[var4] = 0;
                        continue;
                    }
                    if (~this.field805 < ~var9) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                if (~this.field805 < ~var9) {
                    int var11;
                    for (var11 = var7 - var8; var11 < 0; var11 += 4) {
                    }
                    while (~var11 < -4) {
                        var11 -= 4;
                    }
                    if (~var11 < -1) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                var3[var4] = 4096;
            }
        }
        if (arg1 != -95) {
            this.method206(-24, (class303) null, -81);
        }
        return var3;
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(Ljava/lang/String;B)I", line = 143)
    public static final int method398(String arg0, byte arg1) {
        if (arg1 != 9) {
            field808 = null;
        }
        ++field807;
        for (int var2 = 0; ~var2 > ~class483.field7084.length; ++var2) {
            if (class483.field7084[var2].equalsIgnoreCase(arg0)) {
                return var2;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!jv", name = "<init>", descriptor = "()V", line = 165)
    public class55() {
        super(0, true);
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(ILti;I)V", line = 170)
    public final void method206(int arg0, class303 arg1, int arg2) {
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (arg2 == 2) {
                    this.field805 = arg1.method1868(0);
                }
            } else {
                this.field809 = arg1.method1918((byte) 126);
            }
        } else {
            this.field803 = arg1.method1918((byte) 79);
        }
        if (arg0 != 15180) {
            method396(95);
        }
        ++field804;
    }

    @OriginalMember(owner = "client!jv", name = "d", descriptor = "(Z)V", line = 230)
    public static void method399(boolean arg0) {
        if (!arg0) {
            field808 = null;
            field810 = null;
        }
    }
}
