import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public class class151 {

    @OriginalMember(owner = "client!nj", name = "e", descriptor = "Lmb;")
    public static class132 field2761 = class166.method1092(" zuerst von Ihrer Ignorieren)2Liste(Q", 115);

    @OriginalMember(owner = "client!nj", name = "k", descriptor = "I")
    public static int field2767 = -1;

    @OriginalMember(owner = "client!nj", name = "g", descriptor = "Lmb;")
    public static class132 field2763 = class166.method1092("(U4", 114);

    @OriginalMember(owner = "client!nj", name = "j", descriptor = "Lmb;")
    public static class132 field2766 = class166.method1092("Bitte geben Sie Ihren Benutzernamen ein)3", 112);

    @OriginalMember(owner = "client!nj", name = "i", descriptor = "D")
    public static double field2765;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "I")
    public static int field2757;

    @OriginalMember(owner = "client!nj", name = "h", descriptor = "I")
    public static int field2764;

    @OriginalMember(owner = "client!nj", name = "l", descriptor = "I")
    public static int field2768;

    @OriginalMember(owner = "client!nj", name = "n", descriptor = "I")
    public static int field2770;

    @OriginalMember(owner = "client!nj", name = "d", descriptor = "J")
    public long field2760;

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "Lnj;")
    public class151 field2759;

    @OriginalMember(owner = "client!nj", name = "m", descriptor = "Lnj;")
    public class151 field2769;

    @OriginalMember(owner = "client!nj", name = "f", descriptor = "[Lmb;")
    public static class132[] field2762;

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "[S")
    public static short[] field2758;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(I)V")
    public static void method994(int arg0) {
        field2758 = null;
        field2763 = null;
        field2766 = null;
        if (arg0 == 11) {
            field2762 = null;
            field2761 = null;
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(B)V")
    public final void method995(byte arg0) {
        field2770++;
        if (this.field2769 == null) {
            return;
        }
        this.field2769.field2759 = this.field2759;
        this.field2759.field2769 = this.field2769;
        this.field2769 = null;
        this.field2759 = null;
        int var2 = 19 / ((arg0 - 34) / 44);
    }

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "(B)Z")
    public final boolean method996(byte arg0) {
        if (arg0 == 85) {
            field2768++;
            return this.field2769 != null;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "(I)V")
    public static final void method997(int arg0) {
        field2757++;
        while (class118.field2241.method653(class39.field630, (byte) -19) >= 11) {
            int var1 = class118.field2241.method649(11, 25091);
            if (var1 == 2047) {
                break;
            }
            boolean var2 = false;
            if (class68.field1120[var1] == null) {
                var2 = true;
                class68.field1120[var1] = new class159();
                if (class187.field3472[var1] != null) {
                    class68.field1120[var1].method1031(class187.field3472[var1], arg0 ^ 0x71C7);
                }
            }
            class33.field527[class160.field2906++] = var1;
            class159 var3 = class68.field1120[var1];
            var3.field669 = class30.field460;
            int var4 = class118.field2241.method649(5, arg0 ^ 0x13C4);
            if (var4 > 15) {
                var4 -= 32;
            }
            int var5 = class118.field2241.method649(1, 25091);
            int var6 = class118.field2241.method649(1, 25091);
            if (var6 == 1) {
                class211.field3874[class220.field4003++] = var1;
            }
            int var7 = class118.field2241.method649(5, 25091);
            int var8 = class209.field3809[class118.field2241.method649(3, 25091)];
            if (var2) {
                var3.field739 = var3.field707 = var8;
            }
            if (var7 > 15) {
                var7 -= 32;
            }
            var3.method290(class210.field3854.field676[0] + var7, class210.field3854.field703[0] + var4, (byte) -98, var5 == 1);
        }
        class118.field2241.method650(-83);
        if (arg0 != 29127) {
            field2767 = -60;
        }
    }
}
