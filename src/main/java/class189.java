import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class189 implements class212 {

    @OriginalMember(owner = "client!tg", name = "n", descriptor = "Lag;")
    private class192 field2973 = new class192(256);

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "Lub;")
    private class92 field2962;

    @OriginalMember(owner = "client!tg", name = "h", descriptor = "Lub;")
    private class92 field2967;

    @OriginalMember(owner = "client!tg", name = "i", descriptor = "[Lwg;")
    private class181[] field2968;

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "I")
    public static int field2961 = 0;

    @OriginalMember(owner = "client!tg", name = "f", descriptor = "J")
    public static volatile long field2965 = 0L;

    @OriginalMember(owner = "client!tg", name = "l", descriptor = "Z")
    public static boolean field2971 = true;

    @OriginalMember(owner = "client!tg", name = "k", descriptor = "I")
    public static int field2970 = 0;

    @OriginalMember(owner = "client!tg", name = "p", descriptor = "[I")
    public static int[] field2975 = new int[8];

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "I")
    public static int field2960;

    @OriginalMember(owner = "client!tg", name = "d", descriptor = "I")
    public static int field2963;

    @OriginalMember(owner = "client!tg", name = "e", descriptor = "I")
    public static int field2964;

    @OriginalMember(owner = "client!tg", name = "g", descriptor = "I")
    public static int field2966;

    @OriginalMember(owner = "client!tg", name = "j", descriptor = "I")
    public static int field2969;

    @OriginalMember(owner = "client!tg", name = "o", descriptor = "I")
    public static int field2974;

    @OriginalMember(owner = "client!tg", name = "m", descriptor = "Z")
    public static boolean field2972;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(B)V")
    public static final void method1347(byte arg0) {
        if (class304.field4889 != null) {
            class304.field4889.method585(8);
        }
        if (class67.field1058 != null) {
            class67.field1058.method585(8);
        }
        field2966++;
        if (arg0 < 85) {
            return;
        }
        class43.method376((byte) 118, field2971, 22050, 2);
        class304.field4889 = class109.method816(class123.field1863, 22050, 99, class105.field1651, 0);
        class304.field4889.method583(-16385, class69.field1087);
        class67.field1058 = class109.method816(class123.field1863, 2048, 81, class105.field1651, 1);
        class67.field1058.method583(-16385, class83.field1251);
    }

    @OriginalMember(owner = "client!tg", name = "d", descriptor = "(II)Lwg;")
    public final class181 method1348(int arg0, int arg1) {
        field2969++;
        return arg1 == -32428 ? this.field2968[arg0] : null;
    }

    @OriginalMember(owner = "client!tg", name = "e", descriptor = "(II)Z")
    public final boolean method1349(int arg0, int arg1) {
        field2960++;
        class176 var3 = this.method1351(arg0, true);
        if (arg1 != 30508) {
            field2970 = -54;
        }
        return var3 != null && var3.method1260(0, this.field2962, this);
    }

    @OriginalMember(owner = "client!tg", name = "f", descriptor = "(II)Lab;")
    public static final class150 method1350(int arg0, int arg1) {
        field2964++;
        class150 var2 = (class150) class156.field2333.method1361((byte) -95, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class2.field45.method721((byte) -117, 26, arg1);
        class150 var4 = new class150();
        if (var3 != null) {
            var4.method1090(new class31(var3), 109);
        }
        if (arg0 <= 68) {
            return null;
        } else {
            class156.field2333.method1365((long) arg1, (byte) 13, var4);
            return var4;
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IZ)Lae;")
    public class176 method1351(int arg0, boolean arg1) {
        field2963++;
        class209 var3 = this.field2973.method1361((byte) -95, (long) arg0);
        if (var3 != null) {
            return (class176) var3;
        }
        byte[] var4 = this.field2967.method722(10560, arg0);
        if (var4 == null) {
            return null;
        } else if (arg1) {
            class176 var5 = new class176(new class31(var4));
            this.field2973.method1365((long) arg0, (byte) 13, var5);
            return var5;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Z)V")
    public static void method1352(boolean arg0) {
        field2975 = null;
        if (!arg0) {
            method1347((byte) 83);
        }
    }

    @OriginalMember(owner = "client!tg", name = "<init>", descriptor = "(Lub;Lub;Lub;)V")
    public class189(class92 arg0, class92 arg1, class92 arg2) {
        this.field2962 = arg2;
        this.field2967 = arg1;
        class31 var4 = new class31(arg0.method721((byte) -117, 0, 0));
        int var5 = var4.method260((byte) -67);
        this.field2968 = new class181[var5];
        for (int var6 = 0; var6 < var5; var6++) {
            if (var4.method265(-87) == 1) {
                this.field2968[var6] = new class181();
            }
        }
        for (int var7 = 0; var7 < var5; var7++) {
            if (this.field2968[var7] != null) {
                this.field2968[var7].field2838 = var4.method265(-119) == 0;
            }
        }
        for (int var8 = 0; var8 < var5; var8++) {
            if (this.field2968[var8] != null) {
                this.field2968[var8].field2832 = var4.method265(-87) == 1;
            }
        }
        for (int var9 = 0; var9 < var5; var9++) {
            if (this.field2968[var9] != null) {
                this.field2968[var9].field2835 = var4.method265(-128) == 1;
            }
        }
        for (int var10 = 0; var10 < var5; var10++) {
            if (this.field2968[var10] != null) {
                var4.method265(-103);
            }
        }
        for (int var11 = 0; var11 < var5; var11++) {
            if (this.field2968[var11] != null) {
                var4.method266(-129);
            }
        }
        for (int var12 = 0; var12 < var5; var12++) {
            if (this.field2968[var12] != null) {
                var4.method266(-129);
            }
        }
        for (int var13 = 0; var13 < var5; var13++) {
            if (this.field2968[var13] != null) {
                var4.method266(-129);
            }
        }
        for (int var14 = 0; var14 < var5; var14++) {
            if (this.field2968[var14] != null) {
                var4.method266(-129);
            }
        }
        for (int var15 = 0; var15 < var5; var15++) {
            if (this.field2968[var15] != null) {
                this.field2968[var15].field2849 = (short) var4.method260((byte) -67);
            }
        }
        if (var4.field560.length > var4.field541) {
            for (int var16 = 0; var16 < var5; var16++) {
                if (this.field2968[var16] != null) {
                    var4.method266(-129);
                }
            }
            for (int var17 = 0; var17 < var5; var17++) {
                if (this.field2968[var17] != null) {
                    var4.method266(-129);
                }
            }
            for (int var18 = 0; var18 < var5; var18++) {
                if (this.field2968[var18] != null) {
                    var4.method265(-126);
                }
            }
            for (int var19 = 0; var19 < var5; var19++) {
                if (this.field2968[var19] != null) {
                    this.field2968[var19].field2841 = var4.method265(-94) == 1;
                }
            }
            for (int var20 = 0; var20 < var5; var20++) {
                if (this.field2968[var20] != null) {
                    var4.method266(-129);
                }
            }
            for (int var21 = 0; var21 < var5; var21++) {
                if (this.field2968[var21] != null) {
                    var4.method265(-89);
                }
            }
            for (int var22 = 0; var22 < var5; var22++) {
                if (this.field2968[var22] != null) {
                    var4.method265(-112);
                }
            }
            for (int var23 = 0; var23 < var5; var23++) {
                if (this.field2968[var23] != null) {
                    var4.method265(-94);
                }
            }
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(ZBFIII)[I")
    public final int[] method1353(boolean arg0, byte arg1, float arg2, int arg3, int arg4, int arg5) {
        if (arg1 > -17) {
            return null;
        } else {
            field2974++;
            return this.method1351(arg3, true).method1255(arg4, -22647, this.field2968[arg3].field2841, (double) arg2, arg5, arg0, this.field2962, this);
        }
    }
}
