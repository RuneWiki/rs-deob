import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gp")
public class class52 {

    @OriginalMember(owner = "client!gp", name = "i", descriptor = "Ljda;")
    private class239 field749 = new class239(256);

    @OriginalMember(owner = "client!gp", name = "n", descriptor = "Ld;")
    private class161 field754;

    @OriginalMember(owner = "client!gp", name = "c", descriptor = "Ldia;")
    private class246 field743;

    @OriginalMember(owner = "client!gp", name = "e", descriptor = "Lmga;")
    public static class739 field745 = new class739(39, -1);

    @OriginalMember(owner = "client!gp", name = "m", descriptor = "[I")
    public static int[] field753 = new int[8];

    @OriginalMember(owner = "client!gp", name = "l", descriptor = "Lhv;")
    public static class546 field752 = new class546(8, 1);

    @OriginalMember(owner = "client!gp", name = "o", descriptor = "[I")
    public static int[] field755 = new int[1000];

    @OriginalMember(owner = "client!gp", name = "p", descriptor = "I")
    public static int field756 = 1401;

    @OriginalMember(owner = "client!gp", name = "q", descriptor = "[I")
    public static int[] field757 = new int[128];

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "I")
    public static int field741;

    @OriginalMember(owner = "client!gp", name = "b", descriptor = "I")
    public static int field742;

    @OriginalMember(owner = "client!gp", name = "d", descriptor = "I")
    public static int field744;

    @OriginalMember(owner = "client!gp", name = "f", descriptor = "I")
    public static int field746;

    @OriginalMember(owner = "client!gp", name = "g", descriptor = "I")
    public static int field747;

    @OriginalMember(owner = "client!gp", name = "h", descriptor = "I")
    public static int field748;

    @OriginalMember(owner = "client!gp", name = "j", descriptor = "I")
    public static int field750;

    @OriginalMember(owner = "client!gp", name = "k", descriptor = "I")
    public static int field751;

    static {
        for (int var0 = 0; var0 < field757.length; var0++) {
            field757[var0] = -1;
        }
        for (int var1 = 65; var1 <= 90; var1++) {
            field757[var1] = var1 - 65;
        }
        for (int var2 = 97; var2 <= 122; var2++) {
            field757[var2] = var2 + 26 - 97;
        }
        for (int var3 = 48; var3 <= 57; var3++) {
            field757[var3] = var3 + 52 - 48;
        }
        field757[45] = field757[47] = 63;
        field757[42] = field757[43] = 62;
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(Z)V", line = 3)
    public static void method377(boolean arg0) {
        field753 = null;
        if (arg0) {
            field757 = null;
        }
        field757 = null;
        field752 = null;
        field745 = null;
        field755 = null;
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(IIIIIII)V", line = 18)
    public static final void method378(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field744++;
        if (arg2 != 2) {
            field745 = null;
        }
        for (class122 var7 = (class122) class237.field3201.method109(0); var7 != null; var7 = (class122) class237.field3201.method115((byte) -104)) {
            if (class100.field1401 >= var7.field1779) {
                var7.method2922((byte) -82);
            } else {
                class86.method707((var7.field1771 << 9) + 256, arg1 >> 1, 67, arg4 >> 1, arg6, var7.field1772 * 2, arg0, var7.field1777, (var7.field1773 << 9) + 256);
                class251.field3716.method579(class744.field10277[0] + arg3, 0, var7.field1783 | 0xFF000000, (byte) 38, var7.field1774, class744.field10277[1] + arg5);
            }
        }
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(I[FI)[F", line = 49)
    public static final float[] method379(int arg0, float[] arg1, int arg2) {
        field741++;
        float[] var3 = new float[arg2];
        class278.method1795(arg1, arg0, var3, 0, arg2);
        return var3;
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(B)V", line = 62)
    public final void method380(byte arg0) {
        if (arg0 >= -15) {
            this.method382(-111, (byte) 86);
        }
        field742++;
        this.field749.method1555((byte) -3);
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(I)V", line = 73)
    public final void method381(int arg0) {
        field746++;
        if (arg0 != -18254) {
            method378(1, 53, -47, 36, -35, 62, -67);
        }
        this.field749.method1546(5, (byte) -8);
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(IB)Ltca;", line = 84)
    public final class184 method382(int arg0, byte arg1) {
        field748++;
        Object var3 = this.field749.method1541(-10, (long) arg0);
        if (var3 != null) {
            return (class184) var3;
        } else if (this.field754.method1173(true, arg0)) {
            class662 var4 = this.field754.method1174(arg0, true);
            int var5 = var4.field9143 ? 64 : this.field743.field3514;
            class184 var7;
            if (var4.field9158 && this.field743.method461()) {
                float[] var6 = this.field754.method1176((byte) -13, var5, false, 0.7F, arg0, var5);
                var7 = new class184(this.field743, 3553, 34842, var5, var5, var4.field9153 != 0, var6, 6408);
            } else {
                int[] var8;
                if (var4.field9135 != 2 && class758.method4216(var4.field9140, 33)) {
                    var8 = this.field754.method1177(var5, true, var5, 0.7F, arg0, (byte) -117);
                } else {
                    var8 = this.field754.method1178(var5, arg0, -99, 0.7F, var5, false);
                }
                var7 = new class184(this.field743, 3553, 6408, var5, var5, var4.field9153 != 0, var8, 0, 0, false);
            }
            var7.method1274(var4.field9147, var4.field9155, 10242);
            this.field749.method1544(true, var7, (long) arg0);
            int var9 = -65 % ((arg1 - 9) / 32);
            return var7;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(III)Z", line = 133)
    public static final boolean method383(int arg0, int arg1, int arg2) {
        field751++;
        if (arg2 <= 9) {
            field755 = null;
        }
        return (arg1 & 0x8000) != 0;
    }

    @OriginalMember(owner = "client!gp", name = "b", descriptor = "(B)Ljp;", line = 144)
    public static final class376 method384(byte arg0) {
        field750++;
        class376 var1 = new class376(518);
        class47.field712 = new int[4];
        class47.field712[1] = (int) (Math.random() * 9.9999999E7D);
        class47.field712[2] = (int) (Math.random() * 9.9999999E7D);
        class47.field712[3] = (int) (Math.random() * 9.9999999E7D);
        class47.field712[0] = (int) (Math.random() * 9.9999999E7D);
        var1.method2380(65280, 10);
        var1.method2354(class47.field712[0], (byte) 75);
        var1.method2354(class47.field712[1], (byte) 73);
        var1.method2354(class47.field712[2], (byte) 92);
        if (arg0 > -39) {
            return null;
        } else {
            var1.method2354(class47.field712[3], (byte) 60);
            return var1;
        }
    }

    @OriginalMember(owner = "client!gp", name = "b", descriptor = "(I)[Lhv;", line = 175)
    public static final class546[] method385(int arg0) {
        if (arg0 != -65) {
            method377(true);
        }
        field747++;
        return new class546[] { class503.field6971, class193.field2588, class148.field2077, class10.field159, class788.field10848, class522.field7160, class59.field818, class537.field7304, field752, class178.field2374 };
    }

    @OriginalMember(owner = "client!gp", name = "<init>", descriptor = "(Ldia;Ld;)V", line = 200)
    public class52(class246 arg0, class161 arg1) {
        this.field754 = arg1;
        this.field743 = arg0;
    }
}
