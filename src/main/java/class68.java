import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class68 {

    @OriginalMember(owner = "client!g", name = "e", descriptor = "I")
    public static int field955 = 0;

    @OriginalMember(owner = "client!g", name = "h", descriptor = "I")
    public static int field958 = 0;

    @OriginalMember(owner = "client!g", name = "i", descriptor = "Lma;")
    public static class5 field959 = new class5();

    @OriginalMember(owner = "client!g", name = "k", descriptor = "J")
    public static long field961 = 0L;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "I")
    public static int field951;

    @OriginalMember(owner = "client!g", name = "b", descriptor = "I")
    public static int field952;

    @OriginalMember(owner = "client!g", name = "c", descriptor = "I")
    public static int field953;

    @OriginalMember(owner = "client!g", name = "d", descriptor = "I")
    public static int field954;

    @OriginalMember(owner = "client!g", name = "f", descriptor = "I")
    public int field956;

    @OriginalMember(owner = "client!g", name = "j", descriptor = "I")
    public static int field960;

    @OriginalMember(owner = "client!g", name = "g", descriptor = "Ljava/lang/String;")
    public String field957;

    @OriginalMember(owner = "client!g", name = "l", descriptor = "[[[B")
    public static byte[][][] field962;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(I)V", line = 5)
    public static final void method535(int arg0) {
        field960++;
        class37.field541.method1355(false);
        if (arg0 == 128) {
            class34.field498.method1355(false);
        }
    }

    @OriginalMember(owner = "client!g", name = "b", descriptor = "(I)V", line = 22)
    public static final void method536(int arg0) {
        field952++;
        class277.field4283.method1355(false);
        if (arg0 != 5004) {
            method540(122, (class6) null);
        }
        class164.field2656.method1355(false);
        class344.field5345.method1355(false);
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(III)V", line = 36)
    public static final void method537(int arg0, int arg1, int arg2) {
        field954++;
        class5 var3 = class304.field4750[class154.field2392][arg2][arg1];
        if (var3 == null) {
            class55.method438(class154.field2392, arg2, arg1);
            return;
        }
        int var4 = -99999999;
        class132 var5 = null;
        for (class132 var6 = (class132) var3.method22((byte) 123); var6 != null; var6 = (class132) var3.method26((byte) -114)) {
            class316 var7 = class149.method1092((byte) -104, var6.field1947.field1097);
            int var8 = var7.field4993;
            if (var7.field4981 == 1) {
                var8 = (var6.field1947.field1100 + 1) * var8;
            }
            if (var8 > var4) {
                var5 = var6;
                var4 = var8;
            }
        }
        if (var5 == null) {
            class55.method438(class154.field2392, arg2, arg1);
            return;
        }
        var3.method28(var5, 11759);
        class132 var9 = (class132) var3.method22((byte) 119);
        if (arg0 > -105) {
            field961 = 101L;
        }
        class81 var10 = null;
        class81 var11 = null;
        while (var9 != null) {
            class81 var12 = var9.field1947;
            if (var5.field1947.field1097 != var12.field1097) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field1097 != var12.field1097 && var11 == null) {
                    var11 = var12;
                }
            }
            var9 = (class132) var3.method26((byte) -127);
        }
        long var13 = (long) (arg2 + (arg1 << 7) + 1610612736);
        class92.method667(class154.field2392, arg2, arg1, class320.method2245((byte) -123, arg1 * 128 + 64, class154.field2392, arg2 * 128 + 64), var5.field1947, var13, var10, var11);
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(II)V", line = 117)
    public static final void method538(int arg0, int arg1) {
        if (arg0 > -89) {
            field962 = (byte[][][]) ((byte[][][]) null);
        }
        field953++;
        if (class105.field1388 == arg1) {
            return;
        }
        if (class105.field1388 == 0) {
            class32.method300((byte) -93);
        }
        if (arg1 == 40) {
            class129.method945(false);
        }
        if (arg1 != 40 && class221.field3508 != null) {
            class221.field3508.method218(true);
            class221.field3508 = null;
        }
        boolean var2 = arg1 == 5 || arg1 == 10 || arg1 == 28;
        if (arg1 == 25 || arg1 == 28) {
            class46.field608 = 0;
            class145.field2285 = 1;
            class335.field5224 = 0;
            class10.field195 = 1;
            class64.field929 = 0;
            class326.method2291(true, 122);
        }
        if (arg1 == 25 || arg1 == 10) {
            class147.method1083(-38);
        }
        if (arg1 == 5) {
            class291.method2034((byte) -35, class256.field4042);
        } else {
            class52.method379(false);
        }
        boolean var3 = class105.field1388 == 5 || class105.field1388 == 10 || class105.field1388 == 28;
        if (var2 != var3) {
            if (var2) {
                class149.field2331 = class281.field4350;
                if (class204.field3233 == 0) {
                    class175.method1293(109, 2);
                } else {
                    class305.method2113(false, 2, class281.field4350, 0, 0, 255, class249.field3913);
                }
                class147.field2322.method2154(15153, false);
            } else {
                class175.method1293(107, 2);
                class147.field2322.method2154(15153, true);
            }
        }
        if (class109.field1458 && (arg1 == 25 || arg1 == 28 || arg1 == 40)) {
            class109.method769();
        }
        class105.field1388 = arg1;
    }

    @OriginalMember(owner = "client!g", name = "c", descriptor = "(I)V", line = 197)
    public static void method539(int arg0) {
        field959 = null;
        if (arg0 != 128) {
            field961 = 42L;
        }
        field962 = (byte[][][]) null;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(ILvl;)Lhj;", line = 209)
    public static final class258 method540(int arg0, class6 arg1) {
        if (arg0 <= 15) {
            method538(-39, -93);
        }
        field951++;
        return new class258(arg1.method78((byte) -101), arg1.method78((byte) -23), arg1.method78((byte) -76), arg1.method78((byte) -90), arg1.method31(-22888), arg1.method31(-22888), arg1.method58(-288140008));
    }
}
