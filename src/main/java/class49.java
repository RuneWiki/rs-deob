import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class49 extends class7 {

    @OriginalMember(owner = "client!eh", name = "T", descriptor = "Lpi;")
    public static class158 field916 = new class158();

    @OriginalMember(owner = "client!eh", name = "W", descriptor = "Lob;")
    public static class141 field919 = class175.method1195(40, "Schrifts-=tze geladen)3");

    @OriginalMember(owner = "client!eh", name = "V", descriptor = "Lob;")
    private static class141 field918 = class175.method1195(40, "green:");

    @OriginalMember(owner = "client!eh", name = "Y", descriptor = "[I")
    public static int[] field921 = new int[50];

    @OriginalMember(owner = "client!eh", name = "Z", descriptor = "Lob;")
    public static class141 field922 = field918;

    @OriginalMember(owner = "client!eh", name = "X", descriptor = "Lob;")
    public static class141 field920 = field918;

    @OriginalMember(owner = "client!eh", name = "ab", descriptor = "Lob;")
    public static class141 field923 = class175.method1195(40, "");

    @OriginalMember(owner = "client!eh", name = "bb", descriptor = "Lob;")
    private static class141 field924 = class175.method1195(40, "Please subscribe)1 or use a different world)3");

    @OriginalMember(owner = "client!eh", name = "cb", descriptor = "Lob;")
    public static class141 field925 = field924;

    @OriginalMember(owner = "client!eh", name = "R", descriptor = "I")
    public static int field914;

    @OriginalMember(owner = "client!eh", name = "S", descriptor = "I")
    public static int field915;

    @OriginalMember(owner = "client!eh", name = "U", descriptor = "I")
    public static int field917;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(ILpe;)V")
    public static final void method320(int arg0, class154 arg1) {
        if (arg0 != 29118) {
            method322(-65);
        }
        class221.field4193 = arg1;
        ++field915;
        class221.field4187 = class221.field4193.method1058(16, (byte) -59);
    }

    @OriginalMember(owner = "client!eh", name = "<init>", descriptor = "()V")
    public class49() {
        super(1, true);
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIBI)I")
    public static final int method321(int arg0, int arg1, byte arg2, int arg3) {
        int var4 = -arg0 + 256;
        if (arg2 >= -22) {
            return 63;
        } else {
            ++field917;
            return ((16711935 & arg1) * var4 - -((16711935 & arg3) * arg0) & -16711936) + (16711680 & (arg1 & 65280) * var4 + (65280 & arg3) * arg0) >> 8;
        }
    }

    @OriginalMember(owner = "client!eh", name = "i", descriptor = "(I)V")
    public static void method322(int arg0) {
        field916 = null;
        field918 = null;
        field921 = null;
        field922 = null;
        field924 = null;
        field919 = null;
        field925 = null;
        field923 = null;
        field920 = null;
        if (arg0 != -23153) {
            method320(86, (class154) null);
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(BI)[I")
    public final int[] method30(byte arg0, int arg1) {
        ++field914;
        int[] var3 = super.field100.method842(arg1, 12);
        if (arg0 < 13) {
            field918 = null;
        }
        if (super.field100.field2534) {
            int[][] var4 = this.method42(arg1, 87, 0);
            int[] var5 = var4[1];
            int[] var6 = var4[0];
            int[] var7 = var4[2];
            for (int var8 = 0; ~var8 > ~class117.field2272; ++var8) {
                var3[var8] = (var5[var8] + var6[var8] - -var7[var8]) / 3;
            }
        }
        return var3;
    }
}
