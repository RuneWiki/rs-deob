import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class207 extends class243 {

    @OriginalMember(owner = "client!oe", name = "ab", descriptor = "I")
    private int field3511 = 4096;

    @OriginalMember(owner = "client!oe", name = "Y", descriptor = "I")
    public static int field3509;

    @OriginalMember(owner = "client!oe", name = "bb", descriptor = "I")
    public static int field3512;

    @OriginalMember(owner = "client!oe", name = "cb", descriptor = "I")
    public static int field3513;

    @OriginalMember(owner = "client!oe", name = "db", descriptor = "I")
    public static int field3514;

    @OriginalMember(owner = "client!oe", name = "Z", descriptor = "Lnh;")
    public static class57 field3510;

    @OriginalMember(owner = "client!oe", name = "eb", descriptor = "[S")
    public static short[] field3515;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lnj;I)Lsg;")
    public static final class243 method1317(class226 arg0, int arg1) {
        arg0.method1471(255);
        int var2 = arg0.method1471(255);
        ++field3512;
        class243 var3 = class117.method740(var2, 26);
        var3.field4236 = arg0.method1471(255);
        int var4 = arg0.method1471(255);
        for (int var5 = arg1; ~var5 > ~var4; ++var5) {
            int var6 = arg0.method1471(255);
            var3.method81(arg0, false, var6);
        }
        var3.method170(false);
        return var3;
    }

    @OriginalMember(owner = "client!oe", name = "g", descriptor = "(I)V")
    public static void method1318(int arg0) {
        field3510 = null;
        field3515 = null;
        if (arg0 != -1) {
            field3510 = null;
        }
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(II)[I")
    public final int[] method77(int arg0, int arg1) {
        int var3 = 38 / ((-15 - arg0) / 51);
        int[] var4 = super.field4215.method984(arg1, 0);
        if (super.field4215.field2707) {
            int[] var5 = this.method1614(0, class254.field4469 & arg1 + -1, 116);
            int[] var6 = this.method1614(0, arg1, 111);
            int[] var7 = this.method1614(0, arg1 + 1 & class254.field4469, 115);
            for (int var8 = 0; ~var8 > ~class212.field3586; ++var8) {
                int var9 = (var7[var8] + -var5[var8]) * this.field3511;
                int var10 = (var6[class179.field3062 & var8 + 1] + -var6[class179.field3062 & var8 + -1]) * this.field3511;
                int var11 = var9 >> 12;
                int var12 = var11 * var11 >> 12;
                int var13 = var10 >> 12;
                int var14 = var13 * var13 >> 12;
                int var15 = (int) (Math.sqrt((double) ((float) (var12 + var14 + 4096) / 4096.0F)) * 4096.0D);
                int var16 = ~var15 == -1 ? 0 : 16777216 / var15;
                var4[var8] = -var16 + 4096;
            }
        }
        ++field3509;
        return var4;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lnj;ZI)V")
    public final void method81(class226 arg0, boolean arg1, int arg2) {
        if (~arg2 == -1) {
            this.field3511 = arg0.method1447(0);
        }
        if (arg1) {
            this.method77(42, -93);
        }
        ++field3514;
    }

    @OriginalMember(owner = "client!oe", name = "<init>", descriptor = "()V")
    public class207() {
        super(1, true);
    }

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "(B)V")
    public static final void method1319(byte arg0) {
        ++field3513;
        if (arg0 == 39) {
            class59.field1090.method1723(-4173);
        }
    }
}
