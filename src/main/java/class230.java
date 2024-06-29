import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class230 extends class43 {

    @OriginalMember(owner = "client!vf", name = "Z", descriptor = "I")
    private int field4142 = 1365;

    @OriginalMember(owner = "client!vf", name = "X", descriptor = "I")
    private int field4140 = 0;

    @OriginalMember(owner = "client!vf", name = "V", descriptor = "I")
    private int field4138 = 20;

    @OriginalMember(owner = "client!vf", name = "Y", descriptor = "I")
    private int field4141 = 0;

    @OriginalMember(owner = "client!vf", name = "T", descriptor = "I")
    public static int field4136 = 0;

    @OriginalMember(owner = "client!vf", name = "eb", descriptor = "I")
    public static int field4147 = 0;

    @OriginalMember(owner = "client!vf", name = "fb", descriptor = "Z")
    public static boolean field4148 = false;

    @OriginalMember(owner = "client!vf", name = "gb", descriptor = "Lbd;")
    public static class16 field4149 = new class16();

    @OriginalMember(owner = "client!vf", name = "ib", descriptor = "Lrg;")
    public static class191 field4151 = null;

    @OriginalMember(owner = "client!vf", name = "kb", descriptor = "I")
    public static int field4153 = 0;

    @OriginalMember(owner = "client!vf", name = "U", descriptor = "I")
    public static int field4137;

    @OriginalMember(owner = "client!vf", name = "W", descriptor = "I")
    public static int field4139;

    @OriginalMember(owner = "client!vf", name = "ab", descriptor = "I")
    public static int field4143;

    @OriginalMember(owner = "client!vf", name = "cb", descriptor = "I")
    public static int field4145;

    @OriginalMember(owner = "client!vf", name = "hb", descriptor = "Lkd;")
    public static class112 field4150;

    @OriginalMember(owner = "client!vf", name = "bb", descriptor = "Loc;")
    public static class155 field4144;

    @OriginalMember(owner = "client!vf", name = "jb", descriptor = "Loc;")
    public static class155 field4152;

    @OriginalMember(owner = "client!vf", name = "db", descriptor = "[I")
    public static int[] field4146;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IBLkd;)V")
    public final void method200(int arg0, byte arg1, class112 arg2) {
        ++field4139;
        if (arg1 == -73) {
            if (~arg0 != -1) {
                if (~arg0 != -2) {
                    if (~arg0 != -3) {
                        if (~arg0 == -4) {
                            this.field4141 = arg2.method739(4);
                        }
                    } else {
                        this.field4140 = arg2.method739(118);
                    }
                } else {
                    this.field4138 = arg2.method739(arg1 + 140);
                }
            } else {
                this.field4142 = arg2.method739(arg1 ^ 78);
            }
        }
    }

    @OriginalMember(owner = "client!vf", name = "g", descriptor = "(I)V")
    public static void method1463(int arg0) {
        field4150 = null;
        field4144 = null;
        if (arg0 != -16385) {
            method1464((class132[]) null, -119, (short[]) null);
        }
        field4146 = null;
        field4152 = null;
        field4149 = null;
    }

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(II)[I")
    public final int[] method64(int arg0, int arg1) {
        ++field4137;
        int[] var3 = super.field768.method1123(arg1, arg0);
        if (super.field768.field3219) {
            for (int var4 = 0; ~var4 > ~class131.field2427; ++var4) {
                int var5 = (class2.field35[arg0] << 12) / this.field4142 + this.field4141;
                int var6 = (class156.field2849[var4] << 12) / this.field4142 - -this.field4140;
                int var7 = var6;
                int var8 = var5;
                int var9 = var5;
                int var10 = var6;
                int var11 = 0;
                int var12 = var6 * var6 >> 12;
                int var13 = var5 * var5 >> 12;
                while (~(var12 + var13) > -16385 && var11 < this.field4138) {
                    ++var11;
                    var8 = (var8 * var10 >> 12) * 2 - -var9;
                    var10 = -var13 + var7 + var12;
                    var13 = var8 * var8 >> 12;
                    var12 = var10 * var10 >> 12;
                }
                var3[var4] = ~(this.field4138 + -1) >= ~var11 ? 0 : (var11 << 12) / this.field4138;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "([Lmb;I[S)V")
    public static final void method1464(class132[] arg0, int arg1, short[] arg2) {
        class111.method702((byte) -114, arg0, arg2, arg0.length + -1, 0);
        ++field4143;
        if (arg1 != 1365) {
            field4151 = null;
        }
    }

    @OriginalMember(owner = "client!vf", name = "<init>", descriptor = "()V")
    public class230() {
        super(0, true);
    }
}
