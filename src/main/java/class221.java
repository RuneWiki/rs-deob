import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class221 extends class102 {

    @OriginalMember(owner = "client!ug", name = "P", descriptor = "I")
    private int field4079 = -1;

    @OriginalMember(owner = "client!ug", name = "Q", descriptor = "Z")
    public static boolean field4080 = false;

    @OriginalMember(owner = "client!ug", name = "V", descriptor = "Ls;")
    public static class194 field4085 = new class194(64);

    @OriginalMember(owner = "client!ug", name = "X", descriptor = "[I")
    public static int[] field4087 = new int[] { 2, 2, 4, 2, 1, 8, 4 };

    @OriginalMember(owner = "client!ug", name = "Y", descriptor = "Lqe;")
    public static class179 field4088 = class206.method1380("Fertigkeit)2", (byte) -126);

    @OriginalMember(owner = "client!ug", name = "M", descriptor = "I")
    public static int field4076;

    @OriginalMember(owner = "client!ug", name = "N", descriptor = "I")
    public static int field4077;

    @OriginalMember(owner = "client!ug", name = "O", descriptor = "I")
    private int field4078;

    @OriginalMember(owner = "client!ug", name = "R", descriptor = "I")
    public static int field4081;

    @OriginalMember(owner = "client!ug", name = "S", descriptor = "I")
    public static int field4082;

    @OriginalMember(owner = "client!ug", name = "U", descriptor = "I")
    private int field4084;

    @OriginalMember(owner = "client!ug", name = "W", descriptor = "I")
    public static int field4086;

    @OriginalMember(owner = "client!ug", name = "T", descriptor = "[I")
    private int[] field4083;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Lra;IZ)V")
    public final void method13(class185 arg0, int arg1, boolean arg2) {
        ++field4077;
        if (~arg1 == -1) {
            this.field4079 = arg0.method1252(2);
        }
        if (arg2) {
            this.field4083 = null;
        }
    }

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(Z)Z")
    private final boolean method1436(boolean arg0) {
        ++field4086;
        if (this.field4083 != null) {
            return true;
        } else if (this.field4079 >= 0) {
            int var2 = class155.field2796;
            int var3 = class117.field2216;
            int var4 = !class78.field1514.method513(this.field4079, -28240) ? 128 : 64;
            this.field4083 = class78.field1514.method521(89, this.field4079);
            this.field4078 = var4;
            this.field4084 = var4;
            class97.method623(var3, var2, 29295);
            return this.field4083 != null;
        } else {
            if (arg0) {
                method1437(-41);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(II)[[I")
    public final int[][] method14(int arg0, int arg1) {
        int[][] var3 = super.field1950.method598((byte) -109, arg0);
        if (arg1 != 64) {
            this.field4083 = null;
        }
        ++field4081;
        if (super.field1950.field1724 && this.method1436(false)) {
            int var4 = this.field4078 * (~class117.field2216 == ~this.field4084 ? arg0 : this.field4084 * arg0 / class117.field2216);
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int[] var7 = var3[0];
            if (class155.field2796 == this.field4078) {
                for (int var8 = 0; var8 < class155.field2796; ++var8) {
                    int var9 = this.field4083[var4++];
                    var6[var8] = class107.method696(var9, 255) << 4;
                    var5[var8] = class107.method696(65280, var9) >> 4;
                    var7[var8] = class107.method696(4080, var9 >> 12);
                }
            } else {
                for (int var10 = 0; var10 < class155.field2796; ++var10) {
                    int var11 = this.field4078 * var10 / class155.field2796;
                    int var12 = this.field4083[var4 + var11];
                    var6[var10] = class107.method696(4080, var12 << 4);
                    var5[var10] = class107.method696(var12, 65280) >> 4;
                    var7[var10] = class107.method696(var12 >> 12, 4080);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(I)V")
    public final void method446(int arg0) {
        if (arg0 > -56) {
            this.method13((class185) null, -59, true);
        }
        super.method446(-60);
        this.field4083 = null;
        ++field4076;
    }

    @OriginalMember(owner = "client!ug", name = "<init>", descriptor = "()V")
    public class221() {
        super(0, false);
    }

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "(B)I")
    public final int method680(byte arg0) {
        ++field4082;
        if (arg0 > -93) {
            method1437(32);
        }
        return this.field4079;
    }

    @OriginalMember(owner = "client!ug", name = "e", descriptor = "(I)V")
    public static void method1437(int arg0) {
        field4085 = null;
        field4088 = null;
        field4087 = null;
        if (arg0 <= 102) {
            field4080 = true;
        }
    }
}
