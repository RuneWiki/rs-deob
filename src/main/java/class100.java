import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public abstract class class100 {

    @OriginalMember(owner = "client!id", name = "f", descriptor = "Lrc;")
    public static class9 field1714 = new class9(4);

    @OriginalMember(owner = "client!id", name = "i", descriptor = "I")
    public static int field1717 = 0;

    @OriginalMember(owner = "client!id", name = "l", descriptor = "[Ljava/lang/String;")
    public static String[] field1720 = new String[1000];

    @OriginalMember(owner = "client!id", name = "a", descriptor = "I")
    public int field1709;

    @OriginalMember(owner = "client!id", name = "b", descriptor = "I")
    public static int field1710;

    @OriginalMember(owner = "client!id", name = "c", descriptor = "I")
    public int field1711;

    @OriginalMember(owner = "client!id", name = "d", descriptor = "I")
    public int field1712;

    @OriginalMember(owner = "client!id", name = "e", descriptor = "I")
    public int field1713;

    @OriginalMember(owner = "client!id", name = "g", descriptor = "I")
    public static int field1715;

    @OriginalMember(owner = "client!id", name = "h", descriptor = "I")
    public static int field1716;

    @OriginalMember(owner = "client!id", name = "j", descriptor = "I")
    public int field1718;

    @OriginalMember(owner = "client!id", name = "k", descriptor = "I")
    public static int field1719;

    @OriginalMember(owner = "client!id", name = "m", descriptor = "I")
    public int field1721;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(III)V")
    public abstract void method630(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(II)V")
    public abstract void method631(int arg0, int arg1);

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(II)V")
    public static final void method632(int arg0, int arg1) {
        class158.field2642 = (class39) client.field4546.method779(-110, (long) arg0);
        int var2 = -88 / ((-arg1 - 5) / 62);
        field1715++;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Lga;[II[I[I)V")
    public static final void method633(class141 arg0, int[] arg1, int arg2, int[] arg3, int[] arg4) {
        if (arg2 >= -34) {
            field1714 = null;
        }
        for (int var5 = 0; var5 < arg3.length; var5++) {
            int var6 = arg3[var5];
            int var7 = arg1[var5];
            int var8 = arg4[var5];
            for (int var9 = 0; var7 != 0 && var9 < arg0.field1477.length; var9++) {
                if ((var7 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg0.field1477[var9] = null;
                    } else {
                        class167 var10 = class105.method714(var6, (byte) 77);
                        int var11 = var10.field2742;
                        class56 var12 = arg0.field1477[var9];
                        if (var12 != null) {
                            if (var12.field977 == var6) {
                                if (var11 == 0) {
                                    var12 = arg0.field1477[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field971 = 0;
                                    var12.field966 = 0;
                                    var12.field969 = 0;
                                    var12.field964 = var8;
                                    var12.field967 = 1;
                                    class112.method786(arg0.field1458, var10, 0, arg0.field1397, (byte) -111, false);
                                } else if (var11 == 2) {
                                    var12.field966 = 0;
                                }
                            } else if (var10.field2744 >= class105.method714(var12.field977, (byte) 8).field2744) {
                                var12 = arg0.field1477[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class56 var13 = arg0.field1477[var9] = new class56();
                            var13.field967 = 1;
                            var13.field977 = var6;
                            var13.field971 = 0;
                            var13.field964 = var8;
                            var13.field969 = 0;
                            var13.field966 = 0;
                            class112.method786(arg0.field1458, var10, 0, arg0.field1397, (byte) -61, false);
                        }
                    }
                }
                var7 >>>= 0x1;
            }
        }
        field1716++;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(I)V")
    public static final void method634(int arg0) {
        field1710++;
        if (arg0 >= -43) {
            field1714 = null;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Z)V")
    public static void method635(boolean arg0) {
        field1720 = null;
        if (!arg0) {
            field1720 = null;
        }
        field1714 = null;
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(I)V")
    public static final void method636(int arg0) {
        class24.field376.method58(arg0 ^ arg0);
        field1719++;
    }
}
