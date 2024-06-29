import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public abstract class class306 {

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "Lmh;")
    public static class128 field5204 = class22.method156(127, "Stufe: ");

    @OriginalMember(owner = "client!oi", name = "k", descriptor = "Lmh;")
    public static class128 field5212 = class22.method156(127, "sch-Utteln:");

    @OriginalMember(owner = "client!oi", name = "e", descriptor = "Lmh;")
    public static class128 field5206 = class22.method156(123, ")2");

    @OriginalMember(owner = "client!oi", name = "o", descriptor = "[I")
    public static int[] field5216 = new int[5];

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "I")
    public static int field5202;

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "I")
    public static int field5203;

    @OriginalMember(owner = "client!oi", name = "d", descriptor = "I")
    public static int field5205;

    @OriginalMember(owner = "client!oi", name = "f", descriptor = "I")
    public static int field5207;

    @OriginalMember(owner = "client!oi", name = "g", descriptor = "I")
    public static int field5208;

    @OriginalMember(owner = "client!oi", name = "h", descriptor = "I")
    public static int field5209;

    @OriginalMember(owner = "client!oi", name = "i", descriptor = "I")
    public static int field5210;

    @OriginalMember(owner = "client!oi", name = "l", descriptor = "I")
    public static int field5213;

    @OriginalMember(owner = "client!oi", name = "n", descriptor = "I")
    public static int field5215;

    @OriginalMember(owner = "client!oi", name = "p", descriptor = "I")
    public static int field5217;

    @OriginalMember(owner = "client!oi", name = "q", descriptor = "I")
    public static int field5218;

    @OriginalMember(owner = "client!oi", name = "j", descriptor = "J")
    public static long field5211;

    @OriginalMember(owner = "client!oi", name = "m", descriptor = "Loe;")
    public static class120 field5214;

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "(B)V", line = 11)
    public static final void method2088(byte arg0) {
        int var1 = -50 / ((arg0 - 49) / 43);
        field5207++;
        class56.field1071.method1832((byte) 68);
        class156.field2676.method1832((byte) 61);
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(II)V", line = 26)
    public static final void method2089(int arg0, int arg1) {
        field5215++;
        class229 var2 = class241.method1638(arg0, 126, arg1);
        var2.method1566((byte) -3);
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(IBIIIII)V", line = 59)
    public static final void method2090(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field5217++;
        int var7 = class7.method59(class181.field3173, arg4, class70.field1315, 0);
        int var8 = class7.method59(class181.field3173, arg5, class70.field1315, 0);
        int var9 = class7.method59(class43.field875, arg2, class193.field3335, 0);
        int var10 = class7.method59(class43.field875, arg6, class193.field3335, 0);
        int var11 = class7.method59(class181.field3173, arg3 + arg4, class70.field1315, 0);
        int var12 = class7.method59(class181.field3173, arg5 - arg3, class70.field1315, 0);
        for (int var13 = var7; var13 < var11; var13++) {
            class314.method2138(var10, true, arg0, class219.field3850[var13], var9);
        }
        int var14 = var8;
        int var15 = 35 % ((13 - arg1) / 45);
        while (var12 < var14) {
            class314.method2138(var10, true, arg0, class219.field3850[var14], var9);
            var14--;
        }
        int var16 = class7.method59(class43.field875, arg2 + arg3, class193.field3335, 0);
        int var17 = class7.method59(class43.field875, arg6 - arg3, class193.field3335, 0);
        for (int var18 = var11; var18 <= var12; var18++) {
            int[] var19 = class219.field3850[var18];
            class314.method2138(var16, true, arg0, var19, var9);
            class314.method2138(var10, true, arg0, var19, var17);
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(I)V", line = 110)
    public static void method2091(int arg0) {
        field5206 = null;
        field5214 = null;
        field5216 = null;
        if (arg0 != 1) {
            field5214 = (class120) null;
        }
        field5204 = null;
        field5212 = null;
    }

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "(I)[Lvd;", line = 125)
    public static final class127[] method2092(int arg0) {
        if (arg0 != 4) {
            return (class127[]) null;
        }
        field5208++;
        class127[] var1 = new class127[class75.field1405];
        for (int var2 = 0; var2 < class75.field1405; var2++) {
            var1[var2] = new class127(class72.field1327, class132.field2294, class151.field2607[var2], class266.field4603[var2], class125.field2106[var2], class178.field3128[var2], class157.field2690[var2], class205.field3614);
        }
        class15.method113(51);
        return var1;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(Lmh;I)I", line = 148)
    public static final int method2093(class128 arg0, int arg1) {
        if (arg1 == -1) {
            field5203++;
            return arg0.method865((byte) -128) + 1;
        } else {
            return -35;
        }
    }

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "(B)V", line = 165)
    public static final void method2094(byte arg0) {
        field5218++;
        for (int var1 = -1; var1 < class75.field1404; var1++) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class203.field3593[var1];
            }
            class123 var3 = class140.field2405[var2];
            if (var3 != null) {
                class203.method1410((byte) -112, var3.method118(-1), var3);
            }
        }
        if (arg0 != -88) {
            field5212 = (class128) null;
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(Ldj;I)V", line = 197)
    public static final void method2095(class314 arg0, int arg1) {
        field5205++;
        class291.field4975 = arg0;
        class54.field1053 = class291.field4975.method2146((byte) 89, arg1);
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(B)Lnd;")
    public abstract class303 method52(byte arg0);

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(IB)I")
    public abstract int method54(int arg0, byte arg1);

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(IZ)V")
    public abstract void method51(int arg0, boolean arg1);

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(BI)[B")
    public abstract byte[] method43(byte arg0, int arg1);
}
