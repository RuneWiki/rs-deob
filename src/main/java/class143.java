import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class143 extends class5 {

    @OriginalMember(owner = "client!ud", name = "I", descriptor = "I")
    public int field3265;

    @OriginalMember(owner = "client!ud", name = "U", descriptor = "I")
    private int field3276;

    @OriginalMember(owner = "client!ud", name = "Q", descriptor = "[[I")
    public int[][] field3272;

    @OriginalMember(owner = "client!ud", name = "R", descriptor = "[I")
    public int[] field3273;

    @OriginalMember(owner = "client!ud", name = "T", descriptor = "Lhe;")
    private static class54 field3275 = class6.method58("green:", false);

    @OriginalMember(owner = "client!ud", name = "P", descriptor = "Lhe;")
    public static class54 field3271 = field3275;

    @OriginalMember(owner = "client!ud", name = "H", descriptor = "Lhe;")
    public static class54 field3264 = field3275;

    @OriginalMember(owner = "client!ud", name = "K", descriptor = "Ljf;")
    public static class68 field3267 = new class68();

    @OriginalMember(owner = "client!ud", name = "W", descriptor = "Lhe;")
    public static class54 field3278 = class6.method58(" loggt sich ein)3", false);

    @OriginalMember(owner = "client!ud", name = "V", descriptor = "Lhe;")
    public static class54 field3277 = class6.method58("null", false);

    @OriginalMember(owner = "client!ud", name = "J", descriptor = "I")
    public static int field3266;

    @OriginalMember(owner = "client!ud", name = "L", descriptor = "I")
    public static int field3268;

    @OriginalMember(owner = "client!ud", name = "M", descriptor = "I")
    public static int field3269;

    @OriginalMember(owner = "client!ud", name = "O", descriptor = "I")
    public static int field3270;

    @OriginalMember(owner = "client!ud", name = "S", descriptor = "I")
    public static int field3274;

    @OriginalMember(owner = "client!ud", name = "Y", descriptor = "Leb;")
    public static class31 field3280;

    @OriginalMember(owner = "client!ud", name = "X", descriptor = "[I")
    public static int[] field3279;

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(B)V")
    public static final void method1103(byte arg0) {
        class40.field1044.method461((byte) -28);
        int var1 = class40.field1044.method456(-1432215741, 1);
        if (arg0 != 42) {
            field3277 = null;
        }
        field3274++;
        if (var1 == 0) {
            return;
        }
        int var2 = class40.field1044.method456(-1432215741, 2);
        if (var2 == 0) {
            class89.field2193[class21.field579++] = 2047;
        } else if (var2 == 1) {
            int var3 = class40.field1044.method456(arg0 - 1432215783, 3);
            class108.field2639.method289(false, false, var3);
            int var4 = class40.field1044.method456(-1432215741, 1);
            if (var4 == 1) {
                class89.field2193[class21.field579++] = 2047;
            }
        } else if (var2 == 2) {
            int var5 = class40.field1044.method456(arg0 - 1432215783, 3);
            class108.field2639.method289(false, true, var5);
            int var6 = class40.field1044.method456(-1432215741, 3);
            class108.field2639.method289(false, true, var6);
            int var7 = class40.field1044.method456(-1432215741, 1);
            if (var7 == 1) {
                class89.field2193[class21.field579++] = 2047;
            }
        } else if (var2 == 3) {
            class157.field3573 = class40.field1044.method456(arg0 ^ 0xAAA21F69, 2);
            int var8 = class40.field1044.method456(-1432215741, 7);
            int var9 = class40.field1044.method456(-1432215741, 1);
            int var10 = class40.field1044.method456(-1432215741, 7);
            int var11 = class40.field1044.method456(-1432215741, 1);
            if (var11 == 1) {
                class89.field2193[class21.field579++] = 2047;
            }
            class108.field2639.method288(var8, var9 == 1, arg0 ^ 0xAA, var10);
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IJ)V")
    public static final void method1104(int arg0, long arg1) {
        field3270++;
        if (arg0 != 2) {
            field3278 = null;
        }
        if (arg1 == 0L) {
            return;
        }
        for (int var3 = 0; var3 < class54.field1347; var3++) {
            if (class15.field464[var3] == arg1) {
                class138.field3173++;
                class54.field1347--;
                for (int var4 = var3; var4 < class54.field1347; var4++) {
                    class15.field464[var4] = class15.field464[var4 + 1];
                }
                class3.field60 = class84.field2084;
                class131.field2969.method454(214, 122);
                class131.field2969.method677(arg0 ^ 0xB4951D2, arg1);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "([Lhe;I)Lhe;")
    public static final class54 method1105(class54[] arg0, int arg1) {
        field3268++;
        if (arg0.length < 2) {
            throw new IllegalArgumentException();
        } else if (arg1 == -842) {
            return class129.method973(arg1 ^ 0xFFFFFCD5, arg0.length, 0, arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "(B)V")
    public static void method1106(byte arg0) {
        field3280 = null;
        field3279 = null;
        field3264 = null;
        field3271 = null;
        field3267 = null;
        if (arg0 <= -113) {
            field3278 = null;
            field3275 = null;
            field3277 = null;
        }
    }

    @OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(I[B)V")
    public class143(int arg0, byte[] arg1) {
        this.field3265 = arg0;
        class83 var3 = new class83(arg1);
        this.field3276 = var3.method638(0);
        this.field3272 = new int[this.field3276][];
        this.field3273 = new int[this.field3276];
        for (int var4 = 0; var4 < this.field3276; var4++) {
            this.field3273[var4] = var3.method638(0);
        }
        for (int var5 = 0; var5 < this.field3276; var5++) {
            this.field3272[var5] = new int[var3.method638(0)];
        }
        for (int var6 = 0; var6 < this.field3276; var6++) {
            for (int var7 = 0; var7 < this.field3272[var6].length; var7++) {
                this.field3272[var6][var7] = var3.method638(0);
            }
        }
    }
}
