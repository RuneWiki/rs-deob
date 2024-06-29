import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class152 extends class23 {

    @OriginalMember(owner = "client!o", name = "T", descriptor = "Li;")
    public static class88 field2947 = class208.method1425(105, "Anmelde)2Limit -Uberschritten)3");

    @OriginalMember(owner = "client!o", name = "W", descriptor = "[[I")
    public static int[][] field2950 = new int[104][104];

    @OriginalMember(owner = "client!o", name = "S", descriptor = "Li;")
    private static class88 field2946 = class208.method1425(105, "button near the top of that page)3");

    @OriginalMember(owner = "client!o", name = "R", descriptor = "Li;")
    public static class88 field2945 = field2946;

    @OriginalMember(owner = "client!o", name = "Y", descriptor = "Li;")
    public static class88 field2952 = class208.method1425(105, "mem=");

    @OriginalMember(owner = "client!o", name = "Q", descriptor = "I")
    public static int field2944;

    @OriginalMember(owner = "client!o", name = "U", descriptor = "I")
    public static int field2948;

    @OriginalMember(owner = "client!o", name = "V", descriptor = "I")
    public static int field2949;

    @OriginalMember(owner = "client!o", name = "X", descriptor = "I")
    public static int field2951;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(II[Li;I[S)V")
    public static final void method1039(int arg0, int arg1, class88[] arg2, int arg3, short[] arg4) {
        if (arg1 < arg3) {
            int var5 = (arg1 - -arg3) / 2;
            class88 var6 = arg2[var5];
            arg2[var5] = arg2[arg3];
            int var7 = arg1;
            arg2[arg3] = var6;
            short var8 = arg4[var5];
            arg4[var5] = arg4[arg3];
            arg4[arg3] = var8;
            for (int var9 = arg1; arg3 > var9; ++var9) {
                if (var6 == null || arg2[var9] != null && ~arg2[var9].method625(true, var6) > ~(1 & var9)) {
                    class88 var10 = arg2[var9];
                    arg2[var9] = arg2[var7];
                    arg2[var7] = var10;
                    short var11 = arg4[var9];
                    arg4[var9] = arg4[var7];
                    arg4[var7++] = var11;
                }
            }
            arg2[arg3] = arg2[var7];
            arg2[var7] = var6;
            arg4[arg3] = arg4[var7];
            arg4[var7] = var8;
            method1039(arg0, arg1, arg2, var7 + -1, arg4);
            method1039(2, var7 + 1, arg2, arg3, arg4);
        }
        if (arg0 != 2) {
            method1042(-24);
        }
        ++field2949;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Lnb;Lnb;ILnb;)V")
    public static final void method1040(class144 arg0, class144 arg1, int arg2, class144 arg3) {
        class110.field2011 = arg1.method966(class39.field689, (byte) -3);
        class151.field2934 = arg3.method966(class62.field1143, (byte) -3);
        class104.field1898 = arg3.method966(client.field561, (byte) -3);
        ++field2948;
        class157.field3021 = arg3.method966(class116.field2091, (byte) -3);
        class245.field4504 = arg3.method966(class20.field316, (byte) -3);
        class150.field2914 = arg3.method966(class92.field1734, (byte) -3);
        class14.field209 = arg3.method966(class228.field4280, (byte) -3);
        class8.field119 = arg3.method966(class212.field4013, (byte) -3);
        class97.field1785 = arg3.method966(class47.field881, (byte) -3);
        if (arg2 != 0) {
            field2947 = null;
        }
        class120.field2197 = arg3.method966(class7.field102, (byte) -3);
        class226.field4249 = arg3.method966(class89.field1683, (byte) -3);
        class86.field1552 = arg0.method966(class119.field2158, (byte) -3);
    }

    @OriginalMember(owner = "client!o", name = "e", descriptor = "(I)V")
    public static void method1041(int arg0) {
        field2952 = null;
        field2947 = null;
        field2950 = null;
        field2945 = null;
        field2946 = null;
        if (arg0 <= 112) {
            field2945 = null;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IB)[I")
    public final int[] method54(int arg0, byte arg1) {
        ++field2944;
        if (arg1 < 19) {
            method1040((class144) null, (class144) null, 93, (class144) null);
        }
        int[] var3 = super.field379.method1080(false, arg0);
        if (super.field379.field3100) {
            int[][] var4 = this.method121(0, (byte) 126, arg0);
            int[] var5 = var4[1];
            int[] var6 = var4[2];
            int[] var7 = var4[0];
            for (int var8 = 0; class70.field1276 > var8; ++var8) {
                var3[var8] = (var6[var8] + var7[var8] + var5[var8]) / 3;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!o", name = "<init>", descriptor = "()V")
    public class152() {
        super(1, true);
    }

    @OriginalMember(owner = "client!o", name = "f", descriptor = "(I)I")
    public static final int method1042(int arg0) {
        ++field2951;
        int var1 = class239.method1586(class79.field1428, class184.field3610, 2, class149.field2909);
        if (-class108.field1956 + var1 < 800 && ~(class116.field2100[class149.field2909][class79.field1428 >> 7][class184.field3610 >> 7] & 4) != -1) {
            return class149.field2909;
        } else {
            if (arg0 >= -74) {
                method1041(104);
            }
            return 3;
        }
    }
}
