import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class75 extends class3 {

    @OriginalMember(owner = "client!ld", name = "N", descriptor = "I")
    private int field1135 = -1;

    @OriginalMember(owner = "client!ld", name = "Q", descriptor = "I")
    public static int field1138 = 3;

    @OriginalMember(owner = "client!ld", name = "P", descriptor = "[I")
    public static int[] field1137 = new int[256];

    @OriginalMember(owner = "client!ld", name = "J", descriptor = "Ljava/lang/String;")
    public static String field1131 = "cyan:";

    @OriginalMember(owner = "client!ld", name = "G", descriptor = "I")
    public static int field1128;

    @OriginalMember(owner = "client!ld", name = "H", descriptor = "I")
    public static int field1129;

    @OriginalMember(owner = "client!ld", name = "I", descriptor = "I")
    public static int field1130;

    @OriginalMember(owner = "client!ld", name = "K", descriptor = "I")
    public int field1132;

    @OriginalMember(owner = "client!ld", name = "M", descriptor = "I")
    public int field1134;

    @OriginalMember(owner = "client!ld", name = "O", descriptor = "I")
    public static int field1136;

    @OriginalMember(owner = "client!ld", name = "R", descriptor = "I")
    public static int field1139;

    @OriginalMember(owner = "client!ld", name = "S", descriptor = "I")
    public static int field1140;

    @OriginalMember(owner = "client!ld", name = "L", descriptor = "Llj;")
    public static class289 field1133;

    @OriginalMember(owner = "client!ld", name = "F", descriptor = "[I")
    public int[] field1127;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(II)[[I", line = 12)
    public int[][] method22(int arg0, int arg1) {
        field1129++;
        int[][] var3 = this.field20.method2435(arg1, false);
        if (arg0 != -21194) {
            this.method511(108);
        }
        if (this.field20.field5556 && this.method511(256)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = (class308.field5010 == this.field1134 ? arg1 : this.field1134 * arg1 / class308.field5010) * this.field1132;
            if (class326.field5342 == this.field1132) {
                for (int var11 = 0; var11 < class326.field5342; var11++) {
                    int var12 = this.field1127[var7++];
                    var6[var11] = class235.method1623(4080, var12 << 4);
                    var5[var11] = class235.method1623(var12 >> 4, 4080);
                    var4[var11] = class235.method1623(4080, var12 >> 12);
                }
            } else {
                for (int var8 = 0; var8 < class326.field5342; var8++) {
                    int var9 = this.field1132 * var8 / class326.field5342;
                    int var10 = this.field1127[var7 + var9];
                    var6[var8] = class235.method1623(255, var10) << 4;
                    var5[var8] = class235.method1623(var10, 65280) >> 4;
                    var4[var8] = class235.method1623(16711680, var10) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(B)I", line = 79)
    public final int method17(byte arg0) {
        int var2 = 119 % ((62 - arg0) / 33);
        field1140++;
        return this.field1135;
    }

    @OriginalMember(owner = "client!ld", name = "e", descriptor = "(B)V", line = 88)
    public static void method510(byte arg0) {
        field1131 = null;
        field1137 = null;
        if (arg0 > -18) {
            method510((byte) -127);
        }
        field1133 = null;
    }

    @OriginalMember(owner = "client!ld", name = "e", descriptor = "(I)Z", line = 106)
    public final boolean method511(int arg0) {
        field1136++;
        if (this.field1127 != null) {
            return true;
        } else if (arg0 != 256) {
            return false;
        } else if (this.field1135 >= 0) {
            class137 var2 = class11.field118 < 0 ? class55.method408(this.field1135, 19472, class116.field1698) : class307.method2143(this.field1135, class11.field118, (byte) 44, class116.field1698);
            var2.method948();
            this.field1127 = var2.field2172;
            this.field1132 = var2.field4802;
            this.field1134 = var2.field4811;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ld", name = "<init>", descriptor = "()V", line = 130)
    public class75() {
        super(0, false);
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(B)V", line = 134)
    public final void method18(byte arg0) {
        if (arg0 >= -115) {
            field1137 = (int[]) null;
        }
        super.method18((byte) -120);
        field1128++;
        this.field1127 = null;
    }

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "(III)V", line = 146)
    public static final void method512(int arg0, int arg1, int arg2) {
        if (arg0 == 15631) {
            field1130++;
            class305.field4991 = new class98(arg1);
            class279.field4594 = new class98(arg2);
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lfh;IZ)V", line = 159)
    public final void method14(class313 arg0, int arg1, boolean arg2) {
        field1139++;
        if (!arg2 && arg1 == 0) {
            this.field1135 = arg0.method2250(-1613178296);
        }
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field1137[var0] = var1;
        }
    }
}
