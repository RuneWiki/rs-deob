import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mca")
public abstract class class29 {

    @OriginalMember(owner = "client!mca", name = "f", descriptor = "Lcga;")
    public static class449 field345 = new class449(65, -1);

    @OriginalMember(owner = "client!mca", name = "i", descriptor = "Ldr;")
    public static class675 field348 = new class675(88, 6);

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "I")
    public static int field340;

    @OriginalMember(owner = "client!mca", name = "b", descriptor = "I")
    public static int field341;

    @OriginalMember(owner = "client!mca", name = "c", descriptor = "I")
    public static int field342;

    @OriginalMember(owner = "client!mca", name = "d", descriptor = "I")
    public static int field343;

    @OriginalMember(owner = "client!mca", name = "e", descriptor = "I")
    public static int field344;

    @OriginalMember(owner = "client!mca", name = "g", descriptor = "I")
    public static int field346;

    @OriginalMember(owner = "client!mca", name = "h", descriptor = "[I")
    public static int[] field347;

    @OriginalMember(owner = "client!mca", name = "j", descriptor = "[[B")
    public static byte[][] field349;

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(IZ)V")
    public static final void method176(int arg0, boolean arg1) {
        class512.field6426++;
        field342++;
        if (arg0 != 0) {
            return;
        }
        class124 var2 = class336.method1924(class338.field4322, class636.field8620, (byte) 119);
        class197.method1156((byte) 102, var2);
        for (class293 var3 = (class293) class216.field2530.method3830((byte) -25); var3 != null; var3 = (class293) class216.field2530.method3838((byte) -92)) {
            if (!var3.method1565((byte) 124)) {
                var3 = (class293) class216.field2530.method3830((byte) -98);
                if (var3 == null) {
                    break;
                }
            }
            if (var3.field3729 == 0) {
                class190.method1128(arg1, -109, true, var3);
            }
        }
        if (class83.field1066 != null) {
            class99.method721((byte) -124, class83.field1066);
            class83.field1066 = null;
        }
    }

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(II)V")
    public static final void method177(int arg0, int arg1) {
        if (class628.field8531 == 1) {
            class424.field5372 = arg0;
        } else if (class628.field8531 == 2 || class628.field8531 == 3) {
            class55.field708 = arg0;
        }
        field340++;
        if (arg1 != 32768) {
            field349 = null;
        }
    }

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(B)[B")
    public abstract byte[] method178(byte arg0);

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(BZLjava/lang/String;)V")
    public static final void method179(byte arg0, boolean arg1, String arg2) {
        String var3 = arg2.toLowerCase();
        field344++;
        short[] var4 = new short[16];
        int var5 = 0;
        int var6 = arg1 ? 32768 : 0;
        int var7 = (arg1 ? class471.field5810.field7895 : class471.field5810.field7894) + var6;
        for (int var8 = var6; var8 < var7; var8++) {
            class673 var11 = class471.field5810.method3267(var8, 56);
            if (var11.field9193 && var11.method3736((byte) -82).toLowerCase().indexOf(var3) != -1) {
                if (var5 >= 50) {
                    class666.field9042 = null;
                    class111.field1382 = -1;
                    return;
                }
                if (var4.length <= var5) {
                    short[] var12 = new short[var4.length * 2];
                    for (int var13 = 0; var13 < var5; var13++) {
                        var12[var13] = var4[var13];
                    }
                    var4 = var12;
                }
                var4[var5++] = (short) var8;
            }
        }
        class253.field3268 = 0;
        class111.field1382 = var5;
        class666.field9042 = var4;
        String[] var9 = new String[class111.field1382];
        for (int var10 = 0; var10 < class111.field1382; var10++) {
            var9[var10] = class471.field5810.method3267(var4[var10], -112).method3736((byte) -93);
        }
        if (arg0 >= -106) {
            method185(false);
        }
        class60.method504(var9, 2688, class666.field9042);
    }

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "([BB)V")
    public abstract void method180(byte[] arg0, byte arg1);

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(Z)Z")
    public static final boolean method181(boolean arg0) {
        field341++;
        class432 var1 = (class432) class539.field6796.method1909(arg0);
        if (var1 == null) {
            return false;
        }
        for (int var2 = 0; var2 < var1.field5446; var2++) {
            if (var1.field5444[var2] != null && var1.field5444[var2].field2546 == 0) {
                return false;
            }
            if (var1.field5448[var2] != null && var1.field5448[var2].field2546 == 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(BII)[B")
    public abstract byte[] method182(byte arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(I)V")
    public static final void method183(int arg0) {
        field343++;
        class638.field8648 = 0;
        class345.field4438.method1913((byte) 112);
        if (arg0 == 65) {
            class345.field4438.method1904(class210.field2482, -102);
            class638.field8648++;
        }
    }

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(IIII)I")
    public static final int method184(int arg0, int arg1, int arg2, int arg3) {
        field346++;
        int var4 = 255 - arg2;
        if (arg1 == -16322) {
            int var5 = ((arg3 & 0xFF00) * arg2 & 0xFF0000 | (arg3 & 0xFF00FF) * arg2 & 0xFF00FF00) >>> 8;
            return (((arg0 & 0xFF00FF) * var4 & 0xFF00FF00 | (arg0 & 0xFF00) * var4 & 0xFF0000) >>> 8) + var5;
        } else {
            return 29;
        }
    }

    @OriginalMember(owner = "client!mca", name = "b", descriptor = "(Z)V")
    public static void method185(boolean arg0) {
        field349 = null;
        field348 = null;
        field347 = null;
        if (!arg0) {
            method179((byte) -1, false, null);
        }
        field345 = null;
    }
}
