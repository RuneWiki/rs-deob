import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class324 {

    @OriginalMember(owner = "client!re", name = "h", descriptor = "Lhk;")
    public static class153 field4599 = new class153(6, 0, 4, 2);

    @OriginalMember(owner = "client!re", name = "i", descriptor = "[I")
    public static int[] field4600 = new int[8];

    @OriginalMember(owner = "client!re", name = "a", descriptor = "I")
    public static int field4592;

    @OriginalMember(owner = "client!re", name = "b", descriptor = "I")
    public static int field4593;

    @OriginalMember(owner = "client!re", name = "c", descriptor = "I")
    public static int field4594;

    @OriginalMember(owner = "client!re", name = "d", descriptor = "I")
    public static int field4595;

    @OriginalMember(owner = "client!re", name = "e", descriptor = "I")
    public static int field4596;

    @OriginalMember(owner = "client!re", name = "f", descriptor = "I")
    public static int field4597;

    @OriginalMember(owner = "client!re", name = "g", descriptor = "I")
    public static int field4598;

    @OriginalMember(owner = "client!re", name = "j", descriptor = "I")
    public static int field4601;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(I[B)V")
    public static final synchronized void method1954(int arg0, byte[] arg1) {
        field4593++;
        if (arg1.length == 100 && class112.field1621 < 1000) {
            class267.field3773[class112.field1621++] = arg1;
        } else if (arg1.length == 5000 && class773.field10646 < 250) {
            class93.field1326[class773.field10646++] = arg1;
        } else if (arg0 == 32572) {
            if (arg1.length == 30000 && class597.field8528 < 50) {
                class179.field2716[class597.field8528++] = arg1;
            } else if (class564.field7872 != null) {
                for (int var2 = 0; var2 < class81.field1202.length; var2++) {
                    if (class81.field1202[var2] == arg1.length && class564.field7872[var2].length > class617.field8748[var2]) {
                        class564.field7872[var2][class617.field8748[var2]++] = arg1;
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Ljava/lang/String;Lcea;II)Lot;")
    public static final class746 method1955(String arg0, class111 arg1, int arg2, int arg3) {
        field4592++;
        if (arg2 == 0) {
            return arg1.method908(arg0, (byte) -51);
        } else if (arg2 == 1) {
            try {
                class154.method1206(class343.field4881, new Object[] { (new URL(class343.field4881.getCodeBase(), arg0)).toString() }, (byte) 116, "openjs");
                class746 var4 = new class746();
                var4.field10365 = 1;
                return var4;
            } catch (Throwable var11) {
                class746 var5 = new class746();
                var5.field10365 = 2;
                return var5;
            }
        } else {
            int var6 = 61 % ((arg3 - 13) / 55);
            if (arg2 == 2) {
                try {
                    class343.field4881.getAppletContext().showDocument(new URL(class343.field4881.getCodeBase(), arg0), "_blank");
                    class746 var7 = new class746();
                    var7.field10365 = 1;
                    return var7;
                } catch (Exception var12) {
                    class746 var8 = new class746();
                    var8.field10365 = 2;
                    return var8;
                }
            } else if (arg2 == 3) {
                try {
                    class154.method1204(class343.field4881, "loggedout", 22458);
                } catch (Throwable var14) {
                }
                try {
                    class343.field4881.getAppletContext().showDocument(new URL(class343.field4881.getCodeBase(), arg0), "_top");
                    class746 var9 = new class746();
                    var9.field10365 = 1;
                    return var9;
                } catch (Exception var13) {
                    class746 var10 = new class746();
                    var10.field10365 = 2;
                    return var10;
                }
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Ljava/lang/String;IILjava/lang/String;)I")
    public static final int method1956(String arg0, int arg1, int arg2, String arg3) {
        field4598++;
        int var4 = arg3.length();
        int var5 = arg0.length();
        int var6 = 0;
        int var7 = 0;
        char var8 = 0;
        char var9 = 0;
        while (var6 - var8 < var4 || (var7 - var9) < var5) {
            if (var4 <= (var6 - var8)) {
                return -1;
            }
            if (var5 <= var7 - var9) {
                return 1;
            }
            char var22;
            if (var8 == '\u0000') {
                var22 = arg3.charAt(var6++);
            } else {
                var22 = var8;
                boolean var23 = false;
            }
            char var24;
            if (var9 == '\u0000') {
                var24 = arg0.charAt(var7++);
            } else {
                var24 = var9;
                boolean var25 = false;
            }
            var8 = class591.method3463(-340, var22);
            var9 = class591.method3463(-340, var24);
            char var26 = class255.method1681(var22, arg2, 79);
            char var27 = class255.method1681(var24, arg2, 79);
            if (var26 != var27 && Character.toUpperCase(var26) != Character.toUpperCase(var27)) {
                char var28 = Character.toLowerCase(var26);
                char var29 = Character.toLowerCase(var27);
                if (var28 != var29) {
                    return class409.method2410(arg2, var28, -6) - class409.method2410(arg2, var29, -30);
                }
            }
        }
        int var10 = Math.min(var4, var5);
        for (int var11 = arg1; var11 < var10; var11++) {
            int var16;
            int var17;
            if (arg2 == 2) {
                var16 = var5 - var11 - 1;
                var17 = var4 - (var11 + 1);
            } else {
                var16 = var11;
                var17 = var11;
            }
            char var18 = arg3.charAt(var17);
            char var19 = arg0.charAt(var16);
            if (var18 != var19 && Character.toUpperCase(var18) != Character.toUpperCase(var19)) {
                char var20 = Character.toLowerCase(var18);
                char var21 = Character.toLowerCase(var19);
                if (var20 != var21) {
                    return class409.method2410(arg2, var20, 86) - class409.method2410(arg2, var21, arg1 + 52);
                }
            }
        }
        int var12 = var4 - var5;
        if (var12 != 0) {
            return var12;
        }
        for (int var13 = 0; var13 < var10; var13++) {
            char var14 = arg3.charAt(var13);
            char var15 = arg0.charAt(var13);
            if (var14 != var15) {
                return class409.method2410(arg2, var14, -127) - class409.method2410(arg2, var15, arg1 - 127);
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Llt;FIIIFFFI[BFII)V")
    public static final void method1957(class323 arg0, float arg1, int arg2, int arg3, int arg4, float arg5, float arg6, float arg7, int arg8, byte[] arg9, float arg10, int arg11, int arg12) {
        field4597++;
        int var13 = 0;
        if (arg4 != 256) {
            method1958(null, (byte) 69, null, 117);
        }
        while (arg2 > var13) {
            class737.method4066(arg7, var13, arg6, arg2, arg10, arg9, arg12, arg11, (byte) 83, arg8, arg3, arg5, arg1, arg0);
            arg8 += arg3 * arg11;
            var13++;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Lje;BLnfa;I)V")
    public static final void method1958(class98 arg0, byte arg1, class745 arg2, int arg3) {
        field4595++;
        if (class57.field884 >= 50 || arg0 == null || arg0.field1424 == null || arg3 >= arg0.field1424.length || arg0.field1424[arg3] == null) {
            return;
        }
        int var4 = arg0.field1424[arg3][0];
        int var5 = var4 >> 8;
        int var6 = var4 >> 5 & 0x7;
        int var7 = var4 & 0x1F;
        if (arg0.field1424[arg3].length > 1) {
            int var8 = (int) ((double) arg0.field1424[arg3].length * Math.random());
            if (var8 > 0) {
                var5 = arg0.field1424[arg3][var8];
            }
        }
        int var9 = 256;
        if (arg0.field1389 != null && arg0.field1422 != null) {
            var9 = arg0.field1389[arg3] + (int) ((double) (arg0.field1422[arg3] - arg0.field1389[arg3]) * Math.random());
        }
        int var10 = arg0.field1403 == null ? 255 : arg0.field1403[arg3];
        if (var7 == 0) {
            if (class719.field10041 == arg2) {
                if (arg0.field1399) {
                    class75.method691(var6, var10, var5, 0, var9, false, arg1 - 42);
                    return;
                }
                class588.method3448(var5, var6, var10, var9, -1, 0);
            }
        } else if (class420.field5820.field9484.method1367(arg1 + 17497) != 0) {
            int var11 = arg2.field10347 - 256 >> 9;
            int var12 = arg2.field10350 - 256 >> 9;
            int var13 = class719.field10041 == arg2 ? 0 : (var12 << 8) + (arg2.field10361 << 24) + (var11 << 16) + var7;
            if (arg1 == 42) {
                class278.field4014[class57.field884++] = new class420((byte) (arg0.field1399 ? 2 : 1), var5, var6, 0, var10, var13, var9, arg2);
            }
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(B)V")
    public static final void method1959(byte arg0) {
        class321.field4568.method511(class469.field6391, class420.field5820.field9459.method3485(17539) == 1 ? class515.field7099 + 256 << 2 : -1, 0);
        if (arg0 > -36) {
            field4601 = -97;
        }
        field4594++;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(I)V")
    public static void method1960(int arg0) {
        if (arg0 == 7) {
            field4599 = null;
            field4600 = null;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(II)[B")
    public static final synchronized byte[] method1961(int arg0, int arg1) {
        field4596++;
        if (arg1 == 100 && class112.field1621 > 0) {
            byte[] var2 = class267.field3773[--class112.field1621];
            class267.field3773[class112.field1621] = null;
            return var2;
        } else if (arg1 == 5000 && class773.field10646 > 0) {
            byte[] var3 = class93.field1326[--class773.field10646];
            class93.field1326[class773.field10646] = null;
            return var3;
        } else if (arg1 == 30000 && class597.field8528 > 0) {
            byte[] var4 = class179.field2716[--class597.field8528];
            class179.field2716[class597.field8528] = null;
            return var4;
        } else {
            if (class564.field7872 != null) {
                for (int var5 = 0; var5 < class81.field1202.length; var5++) {
                    if (class81.field1202[var5] == arg1 && class617.field8748[var5] > 0) {
                        byte[] var6 = class564.field7872[var5][--class617.field8748[var5]];
                        class564.field7872[var5][class617.field8748[var5]] = null;
                        return var6;
                    }
                }
            }
            return arg0 == -1 ? new byte[arg1] : null;
        }
    }
}
