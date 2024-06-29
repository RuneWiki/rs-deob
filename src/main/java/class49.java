import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class49 {

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "Lhb;")
    public static class44 field1207 = class102.method810("null", -28606);

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "I")
    public static int field1208 = 0;

    @OriginalMember(owner = "client!ia", name = "i", descriptor = "Lhb;")
    public static class44 field1215 = class102.method810("Aus", -28606);

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "I")
    public static int field1210;

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "I")
    public static int field1211;

    @OriginalMember(owner = "client!ia", name = "f", descriptor = "I")
    public static int field1212;

    @OriginalMember(owner = "client!ia", name = "g", descriptor = "I")
    public static int field1213;

    @OriginalMember(owner = "client!ia", name = "h", descriptor = "I")
    public static int field1214;

    @OriginalMember(owner = "client!ia", name = "j", descriptor = "I")
    public static int field1216;

    @OriginalMember(owner = "client!ia", name = "k", descriptor = "I")
    public static int field1217;

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "Ljava/awt/Frame;")
    public static Frame field1209;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(I[B)V", line = 8)
    public static final void method458(int arg0, byte[] arg1) {
        class131 var2 = new class131(arg1);
        if (arg0 != 30686) {
            field1215 = null;
        }
        field1214++;
        var2.field3182 = arg1.length - 2;
        class101.field2570 = var2.method1001(65280);
        class84.field2147 = new byte[class101.field2570][];
        class41.field941 = new int[class101.field2570];
        class84.field2133 = new int[class101.field2570];
        class63.field1607 = new int[class101.field2570];
        class63.field1602 = new int[class101.field2570];
        var2.field3182 = arg1.length - class101.field2570 * 8 - 7;
        class77.field1935 = var2.method1001(65280);
        class31.field768 = var2.method1001(65280);
        int var3 = (var2.method971(true) & 0xFF) + 1;
        for (int var4 = 0; var4 < class101.field2570; var4++) {
            class63.field1602[var4] = var2.method1001(65280);
        }
        for (int var5 = 0; var5 < class101.field2570; var5++) {
            class84.field2133[var5] = var2.method1001(65280);
        }
        for (int var6 = 0; var6 < class101.field2570; var6++) {
            class41.field941[var6] = var2.method1001(65280);
        }
        for (int var7 = 0; var7 < class101.field2570; var7++) {
            class63.field1607[var7] = var2.method1001(arg0 + 34594);
        }
        var2.field3182 = arg1.length + 3 - class101.field2570 * 8 - var3 * 3 - 7;
        class117.field2861 = new int[var3];
        for (int var8 = 1; var8 < var3; var8++) {
            class117.field2861[var8] = var2.method974(255);
            if (class117.field2861[var8] == 0) {
                class117.field2861[var8] = 1;
            }
        }
        var2.field3182 = 0;
        for (int var9 = 0; var9 < class101.field2570; var9++) {
            int var10 = class63.field1607[var9];
            int var11 = class41.field941[var9];
            int var12 = var10 * var11;
            byte[] var13 = new byte[var12];
            class84.field2147[var9] = var13;
            int var14 = var2.method971(true);
            if (var14 == 0) {
                for (int var17 = 0; var17 < var12; var17++) {
                    var13[var17] = var2.method982(-18000);
                }
            } else if (var14 == 1) {
                for (int var15 = 0; var15 < var11; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var13[var11 * var16 + var15] = var2.method982(-18000);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(I)V", line = 129)
    public static final void method459(int arg0) {
        class53.field1304.method699(false);
        field1213++;
        int var1 = 10 % ((-arg0 - 37) / 34);
        int var2 = class53.field1304.method700(1, 116);
        if (var2 == 0) {
            return;
        }
        int var3 = class53.field1304.method700(2, -108);
        if (var3 == 0) {
            class96.field2446[class81.field2080++] = 2047;
        } else if (var3 == 1) {
            int var4 = class53.field1304.method700(3, 87);
            class72.field1820.method506(true, false, var4);
            int var5 = class53.field1304.method700(1, -93);
            if (var5 == 1) {
                class96.field2446[class81.field2080++] = 2047;
            }
        } else if (var3 == 2) {
            int var6 = class53.field1304.method700(3, -61);
            class72.field1820.method506(true, true, var6);
            int var7 = class53.field1304.method700(3, -39);
            class72.field1820.method506(true, true, var7);
            int var8 = class53.field1304.method700(1, 122);
            if (var8 == 1) {
                class96.field2446[class81.field2080++] = 2047;
            }
        } else if (var3 == 3) {
            int var9 = class53.field1304.method700(1, 126);
            if (var9 == 1) {
                class96.field2446[class81.field2080++] = 2047;
            }
            class79.field1993 = class53.field1304.method700(2, -90);
            int var10 = class53.field1304.method700(1, 86);
            int var11 = class53.field1304.method700(7, 107);
            int var12 = class53.field1304.method700(7, -52);
            class72.field1820.method509(8613, var10 == 1, var12, var11);
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lhb;Lhb;BI)V", line = 209)
    public static final void method460(class44 arg0, class44 arg1, byte arg2, int arg3) {
        if (class98.field2496 == -1) {
            class16.field306 = true;
        }
        field1217++;
        if (arg3 == 0 && class74.field1886 != -1) {
            class131.field3146 = arg0;
            class128.field3074 = 0;
        }
        for (int var4 = 99; var4 > 0; var4--) {
            class95.field2407[var4] = class95.field2407[var4 - 1];
            class64.field1624[var4] = class64.field1624[var4 - 1];
            class95.field2409[var4] = class95.field2409[var4 - 1];
        }
        if (arg2 <= 88) {
            method460(null, null, (byte) 10, -22);
        }
        class95.field2407[0] = arg3;
        class64.field1624[0] = arg1;
        class95.field2409[0] = arg0;
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(I)V", line = 248)
    public static void method461(int arg0) {
        field1215 = null;
        if (arg0 != 10927) {
            field1210 = -19;
        }
        field1209 = null;
        field1207 = null;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "([BIBZI)V", line = 261)
    public static final void method462(byte[] arg0, int arg1, byte arg2, boolean arg3, int arg4) {
        field1211++;
        if (class103.field2635 == null) {
            return;
        }
        if (class44.field1122 >= 0) {
            class98.field2484 = arg4;
            if (class44.field1122 == 0) {
                class18.field352 = 1;
            } else {
                int var5 = class31.method312(true, class44.field1122);
                int var6 = var5 - class92.field2317;
                class18.field352 = (var6 + 3600) / arg4;
                if (class18.field352 < 1) {
                    class18.field352 = 1;
                }
            }
            class97.field2460 = arg1;
            class25.field582 = arg0;
            client.field377 = arg3;
        } else if (class18.field352 == 0) {
            class111.method849((byte) 93, arg3, arg1, arg0);
        } else {
            class97.field2460 = arg1;
            client.field377 = arg3;
            class25.field582 = arg0;
        }
        if (arg2 >= -19) {
            field1210 = 49;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lr;I[BI)V", line = 311)
    public static final void method463(class102 arg0, int arg1, byte[] arg2, int arg3) {
        field1216++;
        class107 var4 = new class107();
        var4.field2729 = 0;
        var4.field3057 = arg1;
        var4.field2706 = arg2;
        var4.field2710 = arg0;
        class47 var5 = class128.field3082;
        synchronized (class128.field3082) {
            if (arg3 != 2) {
                method463(null, -44, null, -38);
            }
            class128.field3082.method448(var4, true);
        }
        class66.method583(arg3 + 598);
    }
}
