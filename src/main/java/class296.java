import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bp")
public class class296 extends class264 {

    @OriginalMember(owner = "client!bp", name = "X", descriptor = "I")
    private int field4185 = -1;

    @OriginalMember(owner = "client!bp", name = "N", descriptor = "I")
    public static int field4175 = -1;

    @OriginalMember(owner = "client!bp", name = "W", descriptor = "Lae;")
    public static class172 field4184 = null;

    @OriginalMember(owner = "client!bp", name = "S", descriptor = "Lrc;")
    public static class108 field4180 = new class108(69, 9);

    @OriginalMember(owner = "client!bp", name = "O", descriptor = "I")
    public static int field4176;

    @OriginalMember(owner = "client!bp", name = "Q", descriptor = "I")
    public static int field4178;

    @OriginalMember(owner = "client!bp", name = "R", descriptor = "I")
    private int field4179;

    @OriginalMember(owner = "client!bp", name = "U", descriptor = "I")
    private int field4182;

    @OriginalMember(owner = "client!bp", name = "V", descriptor = "I")
    public static int field4183;

    @OriginalMember(owner = "client!bp", name = "Z", descriptor = "I")
    public static int field4187;

    @OriginalMember(owner = "client!bp", name = "ab", descriptor = "I")
    public static int field4188;

    @OriginalMember(owner = "client!bp", name = "P", descriptor = "Lnf;")
    public static class79 field4177;

    @OriginalMember(owner = "client!bp", name = "T", descriptor = "Z")
    public static boolean field4181;

    @OriginalMember(owner = "client!bp", name = "Y", descriptor = "[I")
    private int[] field4186;

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(B)I", line = 9)
    public final int method1781(byte arg0) {
        int var2 = 105 / ((-10 - arg0) / 54);
        ++field4178;
        return this.field4185;
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(BLkk;I)V", line = 22)
    public final void method7(byte arg0, class161 arg1, int arg2) {
        ++field4187;
        if (~arg2 == -1) {
            this.field4185 = arg1.method1134(-16848);
        }
        if (arg0 < 31) {
            method1920((byte) -57);
        }
    }

    @OriginalMember(owner = "client!bp", name = "b", descriptor = "(BI)[[I", line = 36)
    public final int[][] method5(byte arg0, int arg1) {
        ++field4183;
        if (arg0 != 116) {
            field4177 = null;
        }
        int[][] var3 = super.field3816.method1928((byte) 44, arg1);
        if (super.field3816.field4208) {
            int var4 = (class129.field1772 == this.field4179 ? arg1 : this.field4179 * arg1 / class129.field1772) * this.field4182;
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            if (~class478.field6792 == ~this.field4182) {
                for (int var8 = 0; class478.field6792 > var8; ++var8) {
                    int var9 = this.field4186[var4++];
                    var7[var8] = class88.method739(255, var9) << 4;
                    var6[var8] = class88.method739(var9 >> 4, 4080);
                    var5[var8] = class88.method739(var9, 16711680) >> 12;
                }
            } else {
                for (int var10 = 0; var10 < class478.field6792; ++var10) {
                    int var11 = this.field4182 * var10 / class478.field6792;
                    int var12 = this.field4186[var4 + var11];
                    var7[var10] = class88.method739(var12, 255) << 4;
                    var6[var10] = class88.method739(var12 >> 4, 4080);
                    var5[var10] = class88.method739(4080, var12 >> 12);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bp", name = "b", descriptor = "(B)V", line = 101)
    public static void method1920(byte arg0) {
        field4180 = null;
        field4184 = null;
        field4177 = null;
        int var1 = -78 % ((-4 - arg0) / 42);
    }

    @OriginalMember(owner = "client!bp", name = "<init>", descriptor = "()V", line = 115)
    public class296() {
        super(0, false);
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(IIB)V", line = 120)
    public final void method1783(int arg0, int arg1, byte arg2) {
        super.method1783(arg0, arg1, (byte) -93);
        ++field4188;
        int var4 = -116 % ((arg2 - -22) / 58);
        if (this.field4185 >= 0 && class168.field2431 != null) {
            int var5 = !class168.field2431.method1224((byte) 110, this.field4185).field4361 ? 128 : 64;
            this.field4186 = class168.field2431.method1231(this.field4185, var5, var5, false, -22414, 1.0F);
            this.field4182 = var5;
            this.field4179 = var5;
        }
    }

    @OriginalMember(owner = "client!bp", name = "d", descriptor = "(I)V", line = 140)
    public final void method1669(int arg0) {
        if (arg0 != -8433) {
            field4184 = null;
        }
        super.method1669(arg0);
        ++field4176;
        this.field4186 = null;
    }
}
