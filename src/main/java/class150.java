import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nt")
public class class150 {

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "Lni;")
    public static class367 field1967 = new class367(26, 11);

    @OriginalMember(owner = "client!nt", name = "f", descriptor = "Lke;")
    public static class431 field1972;

    @OriginalMember(owner = "client!nt", name = "b", descriptor = "I")
    public static int field1968;

    @OriginalMember(owner = "client!nt", name = "c", descriptor = "I")
    public static int field1969;

    @OriginalMember(owner = "client!nt", name = "d", descriptor = "I")
    public static int field1970;

    @OriginalMember(owner = "client!nt", name = "e", descriptor = "I")
    public static int field1971;

    static {
        new class446("Use", "Benutzen", "Utiliser", "Usar");
        field1972 = new class431();
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(III)Z", line = 3)
    public static final boolean method982(int arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            method983((byte) 108, 90, 105, 71);
        }
        field1971++;
        return class539.method3181(arg2, arg0, true) || class222.method1495(arg2, (byte) 118, arg0);
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(BIII)I", line = 14)
    public static final int method983(byte arg0, int arg1, int arg2, int arg3) {
        field1969++;
        int var4 = arg2 & 0x3;
        if (var4 == 0) {
            return arg1;
        } else if (var4 == 1) {
            return 1023 - arg3;
        } else if (var4 == 2) {
            return 1023 - arg1;
        } else {
            if (arg0 <= 64) {
                method984(-61);
            }
            return arg3;
        }
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(I)V", line = 43)
    public static void method984(int arg0) {
        field1967 = null;
        if (arg0 != -1293) {
            method982(-101, 57, 103);
        }
        field1972 = null;
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(ILqa;Luu;)V", line = 57)
    public static final void method985(int arg0, class165 arg1, class191 arg2) {
        field1968++;
        class252[] var3 = class252.method1638(arg2, class180.field2426, 0);
        class493.field7268 = new class341[var3.length];
        for (int var4 = 0; var4 < var3.length; var4++) {
            class493.field7268[var4] = arg1.method774(var3[var4], true);
        }
        class252[] var5 = class252.method1638(arg2, class254.field3522, 0);
        class372.field5670 = new class341[var5.length];
        for (int var6 = 0; var6 < var5.length; var6++) {
            class372.field5670[var6] = arg1.method774(var5[var6], true);
        }
        class252[] var7 = class252.method1638(arg2, class41.field611, 0);
        class406.field6163 = new class341[var7.length];
        for (int var8 = 0; var8 < var7.length; var8++) {
            class406.field6163[var8] = arg1.method774(var7[var8], true);
        }
        class252[] var9 = class252.method1638(arg2, class435.field6592, 0);
        class407.field6181 = new class341[var9.length];
        for (int var10 = 0; var10 < var9.length; var10++) {
            class407.field6181[var10] = arg1.method774(var9[var10], true);
        }
        class252[] var11 = class252.method1638(arg2, class248.field3453, 0);
        class296.field4380 = new class341[var11.length];
        if (arg0 != 13515) {
            return;
        }
        for (int var12 = 0; var12 < var11.length; var12++) {
            class296.field4380[var12] = arg1.method774(var11[var12], true);
        }
        class252[] var13 = class252.method1638(arg2, class498.field7350, 0);
        class389.field5944 = new class341[var13.length];
        for (int var14 = 0; var14 < var13.length; var14++) {
            class389.field5944[var14] = arg1.method774(var13[var14], true);
        }
        class252[] var15 = class252.method1638(arg2, class334.field5193, 0);
        class145.field1933 = new class341[var15.length];
        for (int var16 = 0; var16 < var15.length; var16++) {
            class145.field1933[var16] = arg1.method774(var15[var16], true);
        }
        class252[] var17 = class252.method1638(arg2, class165.field2240, 0);
        class116.field1599 = new class341[var17.length];
        for (int var18 = 0; var18 < var17.length; var18++) {
            class116.field1599[var18] = arg1.method774(var17[var18], true);
        }
        class252[] var19 = class252.method1638(arg2, class484.field7134, 0);
        class55.field776 = new class341[var19.length];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class55.field776[var20] = arg1.method774(var19[var20], true);
        }
        class252[] var21 = class252.method1638(arg2, class247.field3450, 0);
        class383.field5827 = new class341[var21.length];
        for (int var22 = 0; var22 < var21.length; var22++) {
            class383.field5827[var22] = arg1.method774(var21[var22], true);
        }
        class252[] var23 = class252.method1638(arg2, class418.field6366, 0);
        class357.field5500 = new class341[var23.length];
        for (int var24 = 0; var24 < var23.length; var24++) {
            class357.field5500[var24] = arg1.method774(var23[var24], true);
        }
        class252[] var25 = class252.method1638(arg2, class163.field2149, 0);
        class434.field6586 = new class341[var25.length];
        for (int var26 = 0; var26 < var25.length; var26++) {
            class434.field6586[var26] = arg1.method774(var25[var26], true);
        }
        class391.field5962 = arg1.method774(class252.method1630(arg2, class229.field3280, 0), true);
        class507.field7463 = arg1.method774(class252.method1630(arg2, class191.field2578, 0), true);
        class252[] var27 = class252.method1638(arg2, class304.field4437, 0);
        class478.field7075 = new class341[var27.length];
        for (int var28 = 0; var28 < var27.length; var28++) {
            class478.field7075[var28] = arg1.method774(var27[var28], true);
        }
    }
}
