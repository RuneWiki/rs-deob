import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class228 extends class23 {

    @OriginalMember(owner = "client!va", name = "Q", descriptor = "S")
    public static short field4192 = 32767;

    @OriginalMember(owner = "client!va", name = "S", descriptor = "Ldc;")
    public static class37 field4194 = class185.method1233((byte) 86, "<col=00ff00>");

    @OriginalMember(owner = "client!va", name = "N", descriptor = "I")
    public static int field4189 = 0;

    @OriginalMember(owner = "client!va", name = "L", descriptor = "I")
    private int field4187;

    @OriginalMember(owner = "client!va", name = "M", descriptor = "I")
    public static int field4188;

    @OriginalMember(owner = "client!va", name = "O", descriptor = "I")
    private int field4190;

    @OriginalMember(owner = "client!va", name = "P", descriptor = "I")
    public static int field4191;

    @OriginalMember(owner = "client!va", name = "T", descriptor = "I")
    public static int field4195;

    @OriginalMember(owner = "client!va", name = "U", descriptor = "I")
    public static int field4196;

    @OriginalMember(owner = "client!va", name = "W", descriptor = "I")
    private int field4198;

    @OriginalMember(owner = "client!va", name = "R", descriptor = "[[[B")
    public static byte[][][] field4193;

    @OriginalMember(owner = "client!va", name = "V", descriptor = "[[[I")
    public static int[][][] field4197;

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "()V")
    public class228() {
        this(0);
    }

    @OriginalMember(owner = "client!va", name = "d", descriptor = "(B)V")
    public static void method1481(byte arg0) {
        field4193 = null;
        field4197 = null;
        if (arg0 >= 9) {
            field4194 = null;
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(BI)V")
    private final void method1482(byte arg0, int arg1) {
        ++field4188;
        this.field4190 = arg1 >> 4 & 4080;
        this.field4187 = (16711680 & arg1) >> 12;
        this.field4198 = arg1 << 4 & 4080;
        if (arg0 != -62) {
            field4189 = 62;
        }
    }

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "(I)V")
    private class228(int arg0) {
        super(0, false);
        this.method1482((byte) -62, arg0);
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IB)[[I")
    public final int[][] method36(int arg0, byte arg1) {
        ++field4191;
        int[][] var3 = super.field398.method1522(arg1 ^ -29652, arg0);
        if (arg1 != 9) {
            method1481((byte) 90);
        }
        if (super.field398.field4303) {
            int[] var4 = var3[0];
            int[] var5 = var3[2];
            int[] var6 = var3[1];
            for (int var7 = 0; ~var7 > ~class199.field3705; ++var7) {
                var4[var7] = this.field4187;
                var6[var7] = this.field4190;
                var5[var7] = this.field4198;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(Lce;II)V")
    public final void method40(class28 arg0, int arg1, int arg2) {
        if (arg2 != 1000) {
            this.method1482((byte) -29, 34);
        }
        ++field4196;
        if (arg1 == 0) {
            this.method1482((byte) -62, arg0.method225(79));
        }
    }
}
