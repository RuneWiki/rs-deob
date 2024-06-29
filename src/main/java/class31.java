import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class31 {

    @OriginalMember(owner = "client!kj", name = "e", descriptor = "I")
    public static int field377 = -1;

    @OriginalMember(owner = "client!kj", name = "g", descriptor = "I")
    public static int field379 = -1;

    @OriginalMember(owner = "client!kj", name = "l", descriptor = "Z")
    public static boolean field384 = false;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "I")
    public int field373;

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "I")
    public static int field374;

    @OriginalMember(owner = "client!kj", name = "c", descriptor = "I")
    public int field375;

    @OriginalMember(owner = "client!kj", name = "d", descriptor = "I")
    public static int field376;

    @OriginalMember(owner = "client!kj", name = "f", descriptor = "I")
    public static int field378;

    @OriginalMember(owner = "client!kj", name = "h", descriptor = "I")
    public static int field380;

    @OriginalMember(owner = "client!kj", name = "i", descriptor = "I")
    public static int field381;

    @OriginalMember(owner = "client!kj", name = "k", descriptor = "I")
    public int field383;

    @OriginalMember(owner = "client!kj", name = "m", descriptor = "I")
    public static int field385;

    @OriginalMember(owner = "client!kj", name = "n", descriptor = "I")
    public int field386;

    @OriginalMember(owner = "client!kj", name = "j", descriptor = "[Ljava/lang/String;")
    public static String[] field382;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(Z)V", line = 22)
    public static final void method177(boolean arg0) {
        class210.field3038.method717((byte) 44);
        if (!arg0) {
            field384 = true;
        }
        class1.field10.method717((byte) 70);
        field385++;
        class68.field935.method717((byte) 88);
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(IIIIII)V", line = 38)
    public static final void method178(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 != 121) {
            field382 = (String[]) null;
        }
        field380++;
        if (arg1 > class44.field536 || class101.field1397 > arg2) {
            return;
        }
        boolean var6;
        if (arg3 < class206.field2952) {
            arg3 = class206.field2952;
            var6 = false;
        } else if (arg3 > class259.field3813) {
            arg3 = class259.field3813;
            var6 = false;
        } else {
            var6 = true;
        }
        boolean var7;
        if (arg5 < class206.field2952) {
            var7 = false;
            arg5 = class206.field2952;
        } else if (arg5 <= class259.field3813) {
            var7 = true;
        } else {
            var7 = false;
            arg5 = class259.field3813;
        }
        if (arg1 >= class101.field1397) {
            class190.method1329(class126.field1723[arg1++], arg3, arg4, (byte) -98, arg5);
        } else {
            arg1 = class101.field1397;
        }
        if (class44.field536 < arg2) {
            arg2 = class44.field536;
        } else {
            class190.method1329(class126.field1723[arg2--], arg3, arg4, (byte) -79, arg5);
        }
        if (var7 && var6) {
            for (int var8 = arg1; var8 <= arg2; var8++) {
                int[] var9 = class126.field1723[var8];
                var9[arg5] = var9[arg3] = arg4;
            }
        } else if (var7) {
            for (int var11 = arg1; var11 <= arg2; var11++) {
                class126.field1723[var11][arg5] = arg4;
            }
        } else if (var6) {
            for (int var10 = arg1; var10 <= arg2; var10++) {
                class126.field1723[var10][arg3] = arg4;
            }
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(IIILjava/lang/String;I)V", line = 148)
    public static final void method179(int arg0, int arg1, int arg2, String arg3, int arg4) {
        class344 var5 = class20.method128(118, arg1, arg0);
        field378++;
        if (var5 == null) {
            return;
        }
        if (var5.field5339 != null) {
            class171 var6 = new class171();
            var6.field2343 = arg4;
            var6.field2340 = arg3;
            var6.field2333 = var5.field5339;
            var6.field2341 = var5;
            class314.method2145(122, var6);
        }
        boolean var7 = true;
        if (var5.field5317 > 0) {
            var7 = class77.method599((byte) -96, var5);
        }
        if (!var7 || !client.method821(var5).method2031(false, arg4 - 1)) {
            return;
        }
        if (arg4 == 1) {
            class47.field575++;
            class90.field1264.method2238(149, (byte) -128);
            class90.field1264.method2188(255, arg1);
            class90.field1264.method2189(-1, arg0);
        }
        if (arg2 == arg4) {
            class21.field270++;
            class90.field1264.method2238(66, (byte) -128);
            class90.field1264.method2188(255, arg1);
            class90.field1264.method2189(arg2 ^ 0xFFFFFFFD, arg0);
        }
        if (arg4 == 3) {
            class90.field1264.method2238(81, (byte) -128);
            class240.field3403++;
            class90.field1264.method2188(255, arg1);
            class90.field1264.method2189(-1, arg0);
        }
        if (arg4 == 4) {
            class90.field1264.method2238(232, (byte) -128);
            class90.field1264.method2188(255, arg1);
            class90.field1264.method2189(arg2 ^ 0xFFFFFFFD, arg0);
            class249.field3580++;
        }
        if (arg4 == 5) {
            class135.field1863++;
            class90.field1264.method2238(38, (byte) -128);
            class90.field1264.method2188(255, arg1);
            class90.field1264.method2189(-1, arg0);
        }
        if (arg4 == 6) {
            class245.field3529++;
            class90.field1264.method2238(121, (byte) -128);
            class90.field1264.method2188(255, arg1);
            class90.field1264.method2189(-1, arg0);
        }
        if (arg4 == 7) {
            class90.field1264.method2238(63, (byte) -128);
            class318.field4853++;
            class90.field1264.method2188(255, arg1);
            class90.field1264.method2189(arg2 - 3, arg0);
        }
        if (arg4 == 8) {
            class237.field3361++;
            class90.field1264.method2238(36, (byte) -128);
            class90.field1264.method2188(255, arg1);
            class90.field1264.method2189(-1, arg0);
        }
        if (arg4 == 9) {
            class90.field1264.method2238(57, (byte) -128);
            class90.field1264.method2188(arg2 ^ 0xFD, arg1);
            class327.field4941++;
            class90.field1264.method2189(arg2 ^ 0xFFFFFFFD, arg0);
        }
        if (arg4 == 10) {
            class243.field3473++;
            class90.field1264.method2238(74, (byte) -128);
            class90.field1264.method2188(arg2 + 253, arg1);
            class90.field1264.method2189(-1, arg0);
        }
    }

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "(Z)V", line = 278)
    public static void method180(boolean arg0) {
        field382 = null;
        if (arg0) {
            field377 = -69;
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(B)V", line = 290)
    public static final void method181(byte arg0) {
        if (arg0 > -57) {
            return;
        }
        for (class48 var1 = (class48) class211.field3056.method110(0); var1 != null; var1 = (class48) class211.field3056.method115(0)) {
            int var2 = var1.field595;
            if (class269.method1854((byte) -107, var2)) {
                boolean var3 = true;
                class344[] var4 = class241.field3419[var2];
                for (int var5 = 0; var5 < var4.length; var5++) {
                    if (var4[var5] != null) {
                        var3 = var4[var5].field5267;
                        break;
                    }
                }
                if (!var3) {
                    int var6 = (int) var1.field2522;
                    class344 var7 = class151.method1101(-86, var6);
                    if (var7 != null) {
                        class255.method1741(var7, false);
                    }
                }
            }
        }
        field381++;
    }
}
