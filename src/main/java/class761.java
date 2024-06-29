import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class761 extends class56 {

    @OriginalMember(owner = "client!cc", name = "M", descriptor = "I")
    private int field10527 = -1;

    @OriginalMember(owner = "client!cc", name = "I", descriptor = "Z")
    public static boolean field10523 = false;

    @OriginalMember(owner = "client!cc", name = "O", descriptor = "[I")
    public static int[] field10529 = new int[256];

    @OriginalMember(owner = "client!cc", name = "F", descriptor = "Llja;")
    public static class744 field10520 = new class744(50, 11);

    @OriginalMember(owner = "client!cc", name = "D", descriptor = "I")
    public static int field10518;

    @OriginalMember(owner = "client!cc", name = "E", descriptor = "I")
    public static int field10519;

    @OriginalMember(owner = "client!cc", name = "G", descriptor = "I")
    private int field10521;

    @OriginalMember(owner = "client!cc", name = "H", descriptor = "I")
    public static int field10522;

    @OriginalMember(owner = "client!cc", name = "K", descriptor = "I")
    public static int field10525;

    @OriginalMember(owner = "client!cc", name = "L", descriptor = "I")
    private int field10526;

    @OriginalMember(owner = "client!cc", name = "N", descriptor = "I")
    public static int field10528;

    @OriginalMember(owner = "client!cc", name = "P", descriptor = "I")
    public static int field10530;

    @OriginalMember(owner = "client!cc", name = "J", descriptor = "[I")
    private int[] field10524;

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(Z)V", line = 8)
    public final void method489(boolean arg0) {
        ++field10528;
        super.method489(arg0);
        this.field10524 = null;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(III)V", line = 20)
    public final void method491(int arg0, int arg1, int arg2) {
        ++field10518;
        super.method491(arg0, arg1, arg2);
        if (~this.field10527 <= -1 && class105.field1344 != null) {
            int var4 = class105.field1344.method1138(this.field10527, arg0 + 24173).field4451 ? 64 : 128;
            this.field10524 = class105.field1344.method1135(this.field10527, 1.0F, false, var4, var4, (byte) -26);
            this.field10521 = var4;
            this.field10526 = var4;
        }
    }

    @OriginalMember(owner = "client!cc", name = "<init>", descriptor = "()V", line = 38)
    public class761() {
        super(0, false);
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(BILes;)V", line = 43)
    public final void method144(byte arg0, int arg1, class403 arg2) {
        if (~arg1 == -1) {
            this.field10527 = arg2.method2390((byte) -102);
        }
        if (arg0 > -44) {
            this.method497(-43);
        }
        ++field10522;
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(I)I", line = 57)
    public final int method497(int arg0) {
        if (arg0 != 27738) {
            this.field10526 = -29;
        }
        ++field10519;
        return this.field10527;
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(B)V", line = 69)
    public static void method4228(byte arg0) {
        field10529 = null;
        if (arg0 < 126) {
            method4228((byte) 8);
        }
        field10520 = null;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIII)V", line = 85)
    public static final void method4229(int arg0, int arg1, int arg2, int arg3) {
        ++field10530;
        class714 var4 = class350.method2072((long) arg0, arg1, (byte) 123);
        var4.method4043(6380);
        var4.field10021 = arg2;
        var4.field10018 = arg3;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(BI)[[I", line = 107)
    public final int[][] method187(byte arg0, int arg1) {
        ++field10525;
        int[][] var3 = super.field759.method220(arg1, (byte) -91);
        if (arg0 <= 35) {
            this.field10527 = 113;
        }
        if (super.field759.field341) {
            int var4 = (~class784.field10832 == ~this.field10526 ? arg1 : this.field10526 * arg1 / class784.field10832) * this.field10521;
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            if (class642.field8759 != this.field10521) {
                for (int var8 = 0; class642.field8759 > var8; ++var8) {
                    int var9 = this.field10521 * var8 / class642.field8759;
                    int var10 = this.field10524[var4 + var9];
                    var7[var8] = class296.method1733(var10 << 4, 4080);
                    var6[var8] = class296.method1733(var10 >> 4, 4080);
                    var5[var8] = class296.method1733(var10, 16711680) >> 12;
                }
            } else {
                for (int var11 = 0; ~var11 > ~class642.field8759; ++var11) {
                    int var12 = this.field10524[var4++];
                    var7[var11] = class296.method1733(255, var12) << 4;
                    var6[var11] = class296.method1733(4080, var12 >> 4);
                    var5[var11] = class296.method1733(var12, 16711680) >> 12;
                }
            }
        }
        return var3;
    }
}
