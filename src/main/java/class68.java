import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public abstract class class68 {

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "I")
    public static int field1177 = 0;

    @OriginalMember(owner = "client!bi", name = "f", descriptor = "Loh;")
    public static class258 field1182 = class153.method1046(")4j", 100);

    @OriginalMember(owner = "client!bi", name = "g", descriptor = "Lim;")
    public static class176 field1183 = new class176(0, 0);

    @OriginalMember(owner = "client!bi", name = "j", descriptor = "Loh;")
    private static class258 field1186 = class153.method1046("Cancel", 110);

    @OriginalMember(owner = "client!bi", name = "i", descriptor = "Loh;")
    public static class258 field1185 = field1186;

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "I")
    public static int field1178;

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "I")
    public static int field1179;

    @OriginalMember(owner = "client!bi", name = "e", descriptor = "I")
    public static int field1181;

    @OriginalMember(owner = "client!bi", name = "h", descriptor = "I")
    public static int field1184;

    @OriginalMember(owner = "client!bi", name = "d", descriptor = "[[[I")
    public static int[][][] field1180;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(I)V", line = 16)
    public static void method509(int arg0) {
        field1186 = null;
        field1182 = null;
        field1185 = null;
        field1180 = (int[][][]) null;
        field1183 = null;
        if (arg0 >= -60) {
            method511(34, (byte) 35, 8, -80, -66, -15);
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lme;Ljava/lang/Object;Z)V", line = 35)
    public static final void method510(class295 arg0, Object arg1, boolean arg2) {
        field1181++;
        if (arg2) {
            field1180 = (int[][][]) ((int[][][]) null);
        }
        if (arg0.field5058 == null) {
            return;
        }
        for (int var3 = 0; var3 < 50 && arg0.field5058.peekEvent() != null; var3++) {
            class237.method1628((byte) -88, 1L);
        }
        if (arg1 != null) {
            arg0.field5058.postEvent(new ActionEvent(arg1, 1001, "dummy"));
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IBIIII)V", line = 68)
    public static final void method511(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = arg2;
        field1178++;
        int var7 = 0;
        int var8 = arg4 * arg4;
        int var9 = arg2 * arg2;
        int var10 = var9 << 1;
        int var11 = arg2 << 1;
        int var12 = var8 << 1;
        int var13 = (1 - var11) * var8 + var10;
        int var14 = var9 - ((var11 - 1) * var12);
        if (arg1 < 100) {
            method509(-58);
        }
        int var15 = var8 << 2;
        int var16 = var9 << 2;
        int var17 = ((var7 << 1) + 3) * var10;
        int var18 = ((arg2 << 1) - 3) * var12;
        if (arg0 >= class241.field4189 && class94.field1654 >= arg0) {
            int var19 = class203.method1347(class75.field1314, arg4 + arg5, 1, class206.field3562);
            int var20 = class203.method1347(class75.field1314, arg5 - arg4, 1, class206.field3562);
            class19.method126(7, arg3, class154.field2638[arg0], var20, var19);
        }
        int var21 = (arg2 - 1) * var15;
        int var22 = (var7 + 1) * var16;
        while (var6 > 0) {
            var6--;
            if (var13 < 0) {
                while (var13 < 0) {
                    var7++;
                    var13 += var17;
                    var17 += var16;
                    var14 += var22;
                    var22 += var16;
                }
            }
            if (var14 < 0) {
                var7++;
                var14 += var22;
                var22 += var16;
                var13 += var17;
                var17 += var16;
            }
            var14 += -var18;
            var13 += -var21;
            int var23 = arg0 + var6;
            int var24 = arg0 - var6;
            if (class241.field4189 <= var23 && class94.field1654 >= var24) {
                int var25 = class203.method1347(class75.field1314, arg5 + var7, 1, class206.field3562);
                int var26 = class203.method1347(class75.field1314, arg5 - var7, 1, class206.field3562);
                if (class241.field4189 <= var24) {
                    class19.method126(7, arg3, class154.field2638[var24], var26, var25);
                }
                if (class94.field1654 >= var23) {
                    class19.method126(7, arg3, class154.field2638[var23], var26, var25);
                }
            }
            var21 -= var15;
            var18 -= var15;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IBI)I", line = 168)
    public static final int method512(int arg0, byte arg1, int arg2) {
        if (arg1 < 7) {
            return 106;
        } else {
            int var3 = arg2 >>> 31;
            field1184++;
            return (arg2 + var3) / arg0 - var3;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(B)V", line = 183)
    public static final void method513(byte arg0) {
        if (client.field610[96]) {
            class31.field376 += (-class31.field376 - 24) / 2;
        } else if (client.field610[97]) {
            class31.field376 += (24 - class31.field376) / 2;
        } else {
            class31.field376 /= 2;
        }
        field1179++;
        field1177 += class31.field376 / 2;
        if (client.field610[98]) {
            class139.field2366 += (12 - class139.field2366) / 2;
        } else if (client.field610[99]) {
            class139.field2366 += (-class139.field2366 - 12) / 2;
        } else {
            class139.field2366 /= 2;
        }
        class101.field1815 += class139.field2366 / 2;
        int var1 = class119.field2101 + class152.field2606.field912;
        int var2 = class152.field2606.field934 + class115.field2051;
        if (class71.field1240 - var1 < -500 || (class71.field1240 - var1) > 500 || class147.field2500 - var2 < -500 || (class147.field2500 - var2) > 500) {
            class71.field1240 = var1;
            class147.field2500 = var2;
        }
        if (class71.field1240 != var1) {
            class71.field1240 += (var1 - class71.field1240) / 16;
        }
        if (class147.field2500 != var2) {
            class147.field2500 += (var2 - class147.field2500) / 16;
        }
        class314.method2172((byte) 6);
        int var3 = -45 / ((-arg0 - 5) / 54);
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(II)V")
    public abstract void method400(int arg0, int arg1);

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(II)I")
    public abstract int method406(int arg0, int arg1);

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "(II)[B")
    public abstract byte[] method405(int arg0, int arg1);

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(B)Lqf;")
    public abstract class313 method407(byte arg0);
}
