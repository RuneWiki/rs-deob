import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class209 extends class259 {

    @OriginalMember(owner = "client!md", name = "W", descriptor = "I")
    private int field3756 = 4096;

    @OriginalMember(owner = "client!md", name = "V", descriptor = "Z")
    public static boolean field3755 = true;

    @OriginalMember(owner = "client!md", name = "S", descriptor = "Lsg;")
    public static class30 field3752 = class167.method1221((byte) 33, "Opened titlescreen)3");

    @OriginalMember(owner = "client!md", name = "eb", descriptor = "Lsg;")
    public static class30 field3764 = class167.method1221((byte) 33, "<col=ffff00>");

    @OriginalMember(owner = "client!md", name = "T", descriptor = "I")
    public static int field3753;

    @OriginalMember(owner = "client!md", name = "U", descriptor = "I")
    public static int field3754;

    @OriginalMember(owner = "client!md", name = "X", descriptor = "I")
    public static int field3757;

    @OriginalMember(owner = "client!md", name = "Y", descriptor = "I")
    public static int field3758;

    @OriginalMember(owner = "client!md", name = "Z", descriptor = "I")
    public static int field3759;

    @OriginalMember(owner = "client!md", name = "ab", descriptor = "I")
    public static int field3760;

    @OriginalMember(owner = "client!md", name = "bb", descriptor = "I")
    public static int field3761;

    @OriginalMember(owner = "client!md", name = "cb", descriptor = "I")
    public static int field3762;

    @OriginalMember(owner = "client!md", name = "db", descriptor = "I")
    public static int field3763;

    @OriginalMember(owner = "client!md", name = "i", descriptor = "(I)V")
    public static final void method1479(int arg0) {
        ++field3758;
        for (int var1 = 0; ~class154.field2916 < ~var1; ++var1) {
            class88 var2 = class134.method1009((byte) 82, var1);
            if (var2 != null && ~var2.field1805 == -1) {
                class254.field4477[var1] = 0;
                class142.field2741[var1] = 0;
            }
        }
        class176.field3268 = new class157(arg0);
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IILaa;)V")
    public final void method4(int arg0, int arg1, class8 arg2) {
        ++field3760;
        if (arg1 == -1586849108) {
            if (arg0 == 0) {
                this.field3756 = arg2.method65((byte) 108);
            }
        }
    }

    @OriginalMember(owner = "client!md", name = "f", descriptor = "(III)Lrk;")
    public static final class146 method1480(int arg0, int arg1, int arg2) {
        class195 var3 = class71.field1613[arg0][arg1][arg2];
        return var3 == null ? null : var3.field3537;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IZ)[I")
    public final int[] method17(int arg0, boolean arg1) {
        if (arg1) {
            return null;
        } else {
            ++field3761;
            int[] var3 = super.field4581.method1841(18, arg0);
            if (super.field4581.field4729) {
                int[] var4 = this.method1799(0, arg0 + -1 & class263.field4649, 115);
                int[] var5 = this.method1799(0, arg0, 115);
                int[] var6 = this.method1799(0, class263.field4649 & arg0 + 1, 123);
                for (int var7 = 0; ~var7 > ~class223.field3999; ++var7) {
                    int var8 = (var6[var7] - var4[var7]) * this.field3756;
                    int var9 = (var5[var7 + 1 & class52.field1174] + -var5[var7 + -1 & class52.field1174]) * this.field3756;
                    int var10 = var8 >> 12;
                    int var11 = var9 >> 12;
                    int var12 = var11 * var11 >> 12;
                    int var13 = var10 * var10 >> 12;
                    int var14 = (int) (Math.sqrt((double) ((float) (var12 + var13 + 4096) / 4096.0F)) * 4096.0D);
                    int var15 = ~var14 != -1 ? 16777216 / var14 : 0;
                    var3[var7] = -var15 + 4096;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(IB)V")
    public static final void method1481(int arg0, byte arg1) {
        if (arg1 != -52) {
            method1480(73, -107, 106);
        }
        class68 var2 = class103.method830(arg0, 4, 6);
        ++field3757;
        var2.method610(2141640544);
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(B)V")
    public static void method1482(byte arg0) {
        field3764 = null;
        int var1 = -33 / ((16 - arg0) / 45);
        field3752 = null;
    }

    @OriginalMember(owner = "client!md", name = "<init>", descriptor = "()V")
    public class209() {
        super(1, true);
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Lwd;I)V")
    public static final void method1483(class63 arg0, int arg1) {
        ++field3762;
        int var2 = -class133.field2617 + arg0.field1367;
        int var3 = arg0.field1363 * 128 + 64 * arg0.method574(true);
        int var4 = arg0.field1382 * 128 + 64 * arg0.method574(true);
        arg0.field1360 += (-arg0.field1360 + var3) / var2;
        arg0.field1336 += (-arg0.field1336 + var4) / var2;
        if (arg0.field1393 == 0) {
            arg0.field1337 = 1024;
        }
        arg0.field1347 = 0;
        if (~arg0.field1393 == arg1) {
            arg0.field1337 = 1536;
        }
        if (~arg0.field1393 == -3) {
            arg0.field1337 = 0;
        }
        if (arg0.field1393 == 3) {
            arg0.field1337 = 512;
        }
    }
}
