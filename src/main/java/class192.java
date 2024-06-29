import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sq")
public class class192 {

    @OriginalMember(owner = "client!sq", name = "d", descriptor = "Lbja;")
    public static class34 field2293 = new class34(10, 2, 2, 0);

    @OriginalMember(owner = "client!sq", name = "g", descriptor = "[I")
    public static int[] field2296 = new int[3];

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "I")
    public static int field2290;

    @OriginalMember(owner = "client!sq", name = "b", descriptor = "I")
    public static int field2291;

    @OriginalMember(owner = "client!sq", name = "c", descriptor = "I")
    public static int field2292;

    @OriginalMember(owner = "client!sq", name = "f", descriptor = "I")
    public static int field2295;

    @OriginalMember(owner = "client!sq", name = "e", descriptor = "Lps;")
    public static class105 field2294;

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(II)V", line = 4)
    public static final void method1254(int arg0, int arg1) {
        class35.field532 = arg1;
        field2292++;
        class288 var2 = class374.field4698;
        synchronized (class374.field4698) {
            class374.field4698.method1690(0);
            if (arg0 != -8210) {
                method1258((byte) -18);
            }
        }
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(I[Lkq;I)V", line = 20)
    public static final void method1255(int arg0, class620[] arg1, int arg2) {
        for (int var3 = arg2; var3 < arg1.length; var3++) {
            class620 var4 = arg1[var3];
            if (var4 != null) {
                if (var4.field8371 == 0) {
                    if (var4.field8343 != null) {
                        method1255(arg0, var4.field8343, 0);
                    }
                    class52 var5 = (class52) class728.field10205.method2121(107, (long) var4.field8515);
                    if (var5 != null) {
                        class314.method1853(var5.field713, arg0, -119);
                    }
                }
                if (arg0 == 0 && var4.field8367 != null) {
                    class529 var6 = new class529();
                    var6.field7477 = var4.field8367;
                    var6.field7473 = var4;
                    class142.method1045(var6);
                }
                if (arg0 == 1 && var4.field8505 != null) {
                    if (var4.field8445 >= 0) {
                        class620 var7 = class479.method2848(var4.field8515, (byte) 116);
                        if (var7 == null || var7.field8343 == null || var4.field8445 >= var7.field8343.length || var7.field8343[var4.field8445] != var4) {
                            continue;
                        }
                    }
                    class529 var8 = new class529();
                    var8.field7477 = var4.field8505;
                    var8.field7473 = var4;
                    class142.method1045(var8);
                }
            }
        }
        field2290++;
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(III[I[I)V", line = 89)
    public static final void method1256(int arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        field2291++;
        if (arg2 < 52) {
            field2293 = null;
        }
        if (arg0 >= arg1) {
            return;
        }
        int var5 = (arg0 + arg1) / 2;
        int var6 = arg0;
        int var7 = arg3[var5];
        arg3[var5] = arg3[arg1];
        arg3[arg1] = var7;
        int var8 = arg4[var5];
        arg4[var5] = arg4[arg1];
        arg4[arg1] = var8;
        int var9 = ~var7 == Integer.MIN_VALUE ? 0 : 1;
        for (int var10 = arg0; var10 < arg1; var10++) {
            if ((var9 & var10) + var7 > arg3[var10]) {
                int var11 = arg3[var10];
                arg3[var10] = arg3[var6];
                arg3[var6] = var11;
                int var12 = arg4[var10];
                arg4[var10] = arg4[var6];
                arg4[var6++] = var12;
            }
        }
        arg3[arg1] = arg3[var6];
        arg3[var6] = var7;
        arg4[arg1] = arg4[var6];
        arg4[var6] = var8;
        method1256(arg0, var6 - 1, 86, arg3, arg4);
        method1256(var6 + 1, arg1, 98, arg3, arg4);
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(ILjava/lang/String;)I", line = 147)
    public static final int method1257(int arg0, String arg1) {
        field2295++;
        if (arg0 != 2) {
            method1255(22, null, 125);
        }
        return arg1.length() + 2;
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(B)V", line = 162)
    public static void method1258(byte arg0) {
        if (arg0 != 32) {
            method1255(17, null, -98);
        }
        field2293 = null;
        field2296 = null;
        field2294 = null;
    }
}
