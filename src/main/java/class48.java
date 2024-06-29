import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public abstract class class48 {

    @OriginalMember(owner = "client!gf", name = "f", descriptor = "I")
    public static int field1162 = 0;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "Lnd;")
    public static class94 field1157 = new class94();

    @OriginalMember(owner = "client!gf", name = "k", descriptor = "Laf;")
    public static class7 field1167 = method406(40, "nav");

    @OriginalMember(owner = "client!gf", name = "i", descriptor = "I")
    public static int field1165 = 0;

    @OriginalMember(owner = "client!gf", name = "o", descriptor = "I")
    public static int field1171 = 0;

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "I")
    public static int field1158;

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "I")
    public static int field1159;

    @OriginalMember(owner = "client!gf", name = "d", descriptor = "I")
    public static int field1160;

    @OriginalMember(owner = "client!gf", name = "e", descriptor = "I")
    public static int field1161;

    @OriginalMember(owner = "client!gf", name = "g", descriptor = "I")
    public static int field1163;

    @OriginalMember(owner = "client!gf", name = "h", descriptor = "I")
    public static int field1164;

    @OriginalMember(owner = "client!gf", name = "l", descriptor = "Lof;")
    public static class103 field1168;

    @OriginalMember(owner = "client!gf", name = "m", descriptor = "Lr;")
    public static class118 field1169;

    @OriginalMember(owner = "client!gf", name = "p", descriptor = "Lkb;")
    public static class71 field1172;

    @OriginalMember(owner = "client!gf", name = "j", descriptor = "[I")
    public static int[] field1166;

    @OriginalMember(owner = "client!gf", name = "n", descriptor = "[I")
    public static int[] field1170;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(B)V")
    public static void method400(byte arg0) {
        field1157 = null;
        field1170 = null;
        int var1 = -95 % ((arg0 + 10) / 57);
        field1168 = null;
        field1167 = null;
        field1166 = null;
        field1169 = null;
        field1172 = null;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIIB)Z")
    public static final boolean method401(int arg0, int arg1, int arg2, byte arg3) {
        field1161++;
        int var4 = class47.field1151.method1008(class8.field186, arg2, arg0, arg1);
        if (arg3 >= -9) {
            return true;
        }
        int var5 = arg1 >> 14 & 0x7FFF;
        if (var4 == -1) {
            return false;
        }
        int var6 = var4 >> 6 & 0x3;
        int var7 = var4 & 0x1F;
        if (var7 == 10 || var7 == 11 || var7 == 22) {
            class82 var8 = class155.method1214((byte) -98, var5);
            int var9;
            int var10;
            if (var6 == 0 || var6 == 2) {
                var10 = var8.field1917;
                var9 = var8.field1914;
            } else {
                var9 = var8.field1917;
                var10 = var8.field1914;
            }
            int var11 = var8.field1927;
            if (var6 != 0) {
                var11 = (var11 << var6 & 0xF) + (var11 >> 4 - var6);
            }
            class57.method469(arg2, arg0, 10, 0, class21.field531.field493[0], var11, var9, var10, true, 2, 0, class21.field531.field509[0]);
        } else {
            class57.method469(arg2, arg0, 10, var7 + 1, class21.field531.field493[0], 0, 0, 0, true, 2, var6, class21.field531.field509[0]);
        }
        class37.field926 = 0;
        class142.field3356 = class111.field2668;
        class28.field726 = 2;
        field1162 = class10.field267;
        return true;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(I)V")
    public static final void method402(int arg0) {
        field1160++;
        class143.field3386.method391((byte) -73);
        if (arg0 != 0) {
            field1164 = 25;
        }
        class13.field332.method391((byte) -73);
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lkb;Lkb;Z)I")
    public static final int method403(class71 arg0, class71 arg1, boolean arg2) {
        field1163++;
        int var3 = 0;
        if (arg1.method564(class93.field2156, class106.field2614, (byte) -120)) {
            var3++;
        }
        if (!arg2) {
            field1162 = 51;
        }
        if (arg0.method564(class96.field2274, class106.field2614, (byte) -79)) {
            var3++;
        }
        if (arg0.method564(class4.field43, class106.field2614, (byte) -84)) {
            var3++;
        }
        if (arg0.method564(class141.field3318, class106.field2614, (byte) -79)) {
            var3++;
        }
        if (arg0.method564(class75.field1751, class106.field2614, (byte) -50)) {
            var3++;
        }
        if (arg0.method564(class73.field1678, class106.field2614, (byte) -69)) {
            var3++;
        }
        arg0.method564(class83.field1947, class106.field2614, (byte) -70);
        arg0.method564(class111.field2678, class106.field2614, (byte) -56);
        arg0.method564(class13.field327, class106.field2614, (byte) -126);
        arg0.method564(class121.field2853, class106.field2614, (byte) -125);
        arg0.method564(class148.field3492, class106.field2614, (byte) -109);
        return var3;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(I[B)V")
    public abstract void method404(int arg0, byte[] arg1);

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(I)[B")
    public abstract byte[] method405(int arg0);

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(ILjava/lang/String;)Laf;")
    public static final class7 method406(int arg0, String arg1) {
        field1159++;
        if (arg0 != 40) {
            return null;
        }
        byte[] var2 = arg1.getBytes();
        int var3 = var2.length;
        int var4 = 0;
        class7 var5 = new class7();
        var5.field162 = new byte[var3];
        while (var3 > var4) {
            int var6 = var2[var4++] & 0xFF;
            if (var6 <= 45 && var6 >= 40) {
                if (var4 >= var3) {
                    break;
                }
                int var7 = var2[var4++] & 0xFF;
                var5.field162[var5.field139++] = (byte) (var6 * 43 + var7 - 1720 - 48);
            } else if (var6 != 0) {
                var5.field162[var5.field139++] = (byte) var6;
            }
        }
        var5.method58(false);
        return var5.method66(-34);
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(BI)V")
    public static final void method407(byte arg0, int arg1) {
        if (arg1 == -1 && !class19.field440) {
            class142.method1155(103);
        } else if (arg1 != -1 && class126.field3003 != arg1 && class94.field2205 != 0 && !class19.field440) {
            class151.method1197((byte) -9, 0, 2, false, class113.field2710, class94.field2205, arg1);
        }
        field1158++;
        class126.field3003 = arg1;
        if (arg0 >= -12) {
            method401(-51, 43, 105, (byte) 113);
        }
    }
}
