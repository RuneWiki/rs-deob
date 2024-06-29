import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class345 {

    @OriginalMember(owner = "client!f", name = "b", descriptor = "I")
    public static int field5350 = 0;

    @OriginalMember(owner = "client!f", name = "e", descriptor = "I")
    public static int field5353 = 0;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "I")
    public static int field5349;

    @OriginalMember(owner = "client!f", name = "c", descriptor = "I")
    public static int field5351;

    @OriginalMember(owner = "client!f", name = "d", descriptor = "I")
    public static int field5352;

    @OriginalMember(owner = "client!f", name = "f", descriptor = "I")
    public static int field5354;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(B)V", line = 4)
    public static final void method2381(byte arg0) {
        if (arg0 != -57) {
            method2381((byte) -6);
        }
        field5349++;
        for (class197 var1 = (class197) class68.field959.method22((byte) 127); var1 != null; var1 = (class197) class68.field959.method26((byte) -115)) {
            if (var1.field3142 == -1) {
                var1.field3153 = 0;
                class317.method2223(var1, (byte) -93);
            } else {
                var1.method2028(arg0 ^ 0xFFFFCBD6);
            }
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(III[B)Z", line = 34)
    public static final boolean method2382(int arg0, int arg1, int arg2, byte[] arg3) {
        class6 var4 = new class6(arg3);
        if (arg2 <= 35) {
            method2383((byte) 119);
        }
        field5354++;
        boolean var5 = true;
        int var6 = -1;
        label77: while (true) {
            int var7 = var4.method49((byte) -118);
            if (var7 == 0) {
                return var5;
            }
            boolean var8 = false;
            int var9 = 0;
            var6 += var7;
            while (true) {
                int var13;
                class121 var16;
                do {
                    int var14;
                    int var15;
                    do {
                        do {
                            do {
                                do {
                                    while (var8) {
                                        int var17 = var4.method52(-32768);
                                        if (var17 == 0) {
                                            continue label77;
                                        }
                                        var4.method58(-288140008);
                                    }
                                    int var10 = var4.method52(-32768);
                                    if (var10 == 0) {
                                        continue label77;
                                    }
                                    var9 += var10 - 1;
                                    int var11 = var9 & 0x3F;
                                    int var12 = var9 >> 6 & 0x3F;
                                    var13 = var4.method58(-288140008) >> 2;
                                    var14 = arg0 + var12;
                                    var15 = var11 + arg1;
                                } while (var14 <= 0);
                            } while (var15 <= 0);
                        } while (var14 >= 103);
                    } while (var15 >= 103);
                    var16 = class249.method1790(50, var6);
                } while (var13 == 22 && !class99.field1334 && var16.field1747 == 0 && var16.field1750 != 1 && !var16.field1693);
                if (!var16.method869(false)) {
                    class46.field608++;
                    var5 = false;
                }
                var8 = true;
            }
        }
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(B)Z", line = 119)
    public static final boolean method2383(byte arg0) {
        if (arg0 < 64) {
            return true;
        }
        field5352++;
        try {
            if (class202.field3228 == 2) {
                if (class215.field3393 == null) {
                    class215.field3393 = class323.method2278(class3.field31, class270.field4193, class113.field1575);
                    if (class215.field3393 == null) {
                        return false;
                    }
                }
                if (class161.field2561 == null) {
                    class161.field2561 = new class101(class197.field3160, class282.field4367);
                }
                if (class92.field1228.method1150(-27358, 22050, class215.field3393, class133.field1961, class161.field2561)) {
                    class92.field1228.method1184((byte) -127);
                    class92.field1228.method1169(-1606523955, class237.field3711);
                    class92.field1228.method1181(class251.field3951, (byte) 119, class215.field3393);
                    class3.field31 = null;
                    class161.field2561 = null;
                    class215.field3393 = null;
                    class202.field3228 = 0;
                    return true;
                }
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class92.field1228.method1174(54);
            class3.field31 = null;
            class202.field3228 = 0;
            class215.field3393 = null;
            class161.field2561 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(ILjava/lang/String;)Z", line = 170)
    public static final boolean method2384(int arg0, String arg1) {
        field5351++;
        if (arg1 == null) {
            return false;
        }
        for (int var2 = arg0; var2 < class162.field2640; var2++) {
            if (arg1.equalsIgnoreCase(class281.field4349[var2])) {
                return true;
            }
        }
        return false;
    }
}
