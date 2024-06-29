import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class322 extends class3 {

    @OriginalMember(owner = "client!fb", name = "U", descriptor = "I")
    private int field5299 = 0;

    @OriginalMember(owner = "client!fb", name = "H", descriptor = "I")
    private int field5286 = 4096;

    @OriginalMember(owner = "client!fb", name = "I", descriptor = "Z")
    public static boolean field5287 = true;

    @OriginalMember(owner = "client!fb", name = "F", descriptor = "I")
    public static int field5284 = 0;

    @OriginalMember(owner = "client!fb", name = "M", descriptor = "[Ljava/lang/String;")
    public static String[] field5291 = new String[] { "en", "de", "fr", "pt" };

    @OriginalMember(owner = "client!fb", name = "G", descriptor = "I")
    public static int field5285;

    @OriginalMember(owner = "client!fb", name = "J", descriptor = "I")
    public static int field5288;

    @OriginalMember(owner = "client!fb", name = "L", descriptor = "I")
    public static int field5290;

    @OriginalMember(owner = "client!fb", name = "O", descriptor = "I")
    public static int field5293;

    @OriginalMember(owner = "client!fb", name = "P", descriptor = "I")
    public static int field5294;

    @OriginalMember(owner = "client!fb", name = "Q", descriptor = "I")
    public static int field5295;

    @OriginalMember(owner = "client!fb", name = "R", descriptor = "I")
    public static int field5296;

    @OriginalMember(owner = "client!fb", name = "V", descriptor = "I")
    public static int field5300;

    @OriginalMember(owner = "client!fb", name = "W", descriptor = "I")
    public static int field5301;

    @OriginalMember(owner = "client!fb", name = "X", descriptor = "I")
    public static int field5302;

    @OriginalMember(owner = "client!fb", name = "T", descriptor = "Lnm;")
    public static class221 field5298;

    @OriginalMember(owner = "client!fb", name = "N", descriptor = "Lho;")
    public static class68 field5292;

    @OriginalMember(owner = "client!fb", name = "K", descriptor = "[I")
    public static int[] field5289;

    @OriginalMember(owner = "client!fb", name = "S", descriptor = "[I")
    public static int[] field5297;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(BI)[I", line = 11)
    public final int[] method25(byte arg0, int arg1) {
        if (arg0 < 57) {
            field5291 = (String[]) null;
        }
        int[] var3 = this.field21.method1258(arg1, 0);
        if (this.field21.field2808) {
            int[] var4 = this.method24(arg1, 1, 0);
            for (int var5 = 0; var5 < class326.field5342; var5++) {
                int var6 = var4[var5];
                var3[var5] = this.field5299 <= var6 && this.field5286 >= var6 ? 4096 : 0;
            }
        }
        field5300++;
        return var3;
    }

    @OriginalMember(owner = "client!fb", name = "<init>", descriptor = "()V", line = 45)
    public class322() {
        super(1, true);
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lfh;IZ)V", line = 53)
    public final void method14(class313 arg0, int arg1, boolean arg2) {
        if (arg2) {
            this.method25((byte) -19, 98);
        }
        field5295++;
        if (arg1 == 0) {
            this.field5299 = arg0.method2250(-1613178296);
        } else if (arg1 == 1) {
            this.field5286 = arg0.method2250(-1613178296);
        }
    }

    @OriginalMember(owner = "client!fb", name = "e", descriptor = "(B)V", line = 97)
    public static final void method2308(byte arg0) {
        class214.field3299 = null;
        class47.field687 = null;
        field5302++;
        class209.field3186 = null;
        if (arg0 != -9) {
            field5294 = -9;
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Ljava/lang/String;ISZILjava/lang/String;IJ)V", line = 110)
    public static final void method2309(String arg0, int arg1, short arg2, boolean arg3, int arg4, String arg5, int arg6, long arg7) {
        field5288++;
        if (arg3) {
            field5284 = 37;
        }
        if (class286.field4681 || class117.field1701 >= 500) {
            return;
        }
        class39.field570[class117.field1701] = arg5;
        class190.field2938[class117.field1701] = arg0;
        class109.field1622[class117.field1701] = arg4 == -1 ? class83.field1199 : arg4;
        class300.field4949[class117.field1701] = arg2;
        class258.field4095[class117.field1701] = arg7;
        class100.field1450[class117.field1701] = arg1;
        class86.field1243[class117.field1701] = arg6;
        class117.field1701++;
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(ZI)V", line = 144)
    public static final void method2310(boolean arg0, int arg1) {
        class211 var2 = class17.method115(5, arg1, 4086);
        if (arg0) {
            method2314(-85L, true);
        }
        var2.method1435((byte) -2);
        field5290++;
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(II)Lae;", line = 163)
    public static final class109 method2311(int arg0, int arg1) {
        if (arg1 >= -93) {
            field5289 = (int[]) null;
        }
        field5296++;
        class109 var2 = (class109) class37.field557.method652((long) arg0, false);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class276.field4551.method1504(class306.method2141((byte) -108, arg0), true, class4.method38(arg0, -98));
        class109 var4 = new class109();
        var4.field1551 = arg0;
        if (var3 != null) {
            var4.method714(false, new class313(var3));
        }
        var4.method726((byte) 123);
        if (var4.field1555 != -1) {
            var4.method716(method2311(var4.field1555, -116), (byte) -13, method2311(var4.field1580, -122));
        }
        if (var4.field1557 != -1) {
            var4.method717(0, method2311(var4.field1557, -111), method2311(var4.field1567, -105));
        }
        if (!class37.field554 && var4.field1601) {
            var4.field1607 = false;
            var4.field1575 = 0;
            var4.field1569 = class345.field5532;
            var4.field1596 = class305.field4993;
            var4.field1625 = class34.field529;
        }
        class37.field557.method642(var4, (long) arg0, -102);
        return var4;
    }

    @OriginalMember(owner = "client!fb", name = "e", descriptor = "(I)V", line = 208)
    public static void method2312(int arg0) {
        field5291 = null;
        field5292 = null;
        field5289 = null;
        if (arg0 != 22835) {
            field5298 = (class221) null;
        }
        field5297 = null;
        field5298 = null;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(BLfh;)V", line = 224)
    public static final void method2313(byte arg0, class313 arg1) {
        for (int var2 = 0; var2 < class249.field3967; var2++) {
            int var3 = arg1.method2201(128);
            int var4 = arg1.method2250(-1613178296);
            if (var4 == 65535) {
                var4 = -1;
            }
            if (class266.field4377[var3] != null) {
                class266.field4377[var3].field3151 = var4;
            }
        }
        if (arg0 <= -44) {
            field5293++;
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(JZ)Ljava/lang/String;", line = 256)
    public static final String method2314(long arg0, boolean arg1) {
        field5285++;
        if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
            return null;
        } else if ((arg0 % 37L) == 0L) {
            return null;
        } else {
            if (!arg1) {
                field5289 = (int[]) null;
            }
            int var3 = 0;
            for (long var4 = arg0; var4 != 0L; var4 /= 37L) {
                var3++;
            }
            StringBuffer var6 = new StringBuffer(var3);
            while (arg0 != 0L) {
                long var7 = arg0;
                arg0 /= 37L;
                char var9 = class147.field2375[(int) (var7 - (arg0 * 37L))];
                if (var9 == '_') {
                    int var10 = var6.length() - 1;
                    var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
                    var9 = ' ';
                }
                var6.append(var9);
            }
            var6.reverse();
            var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
            return var6.toString();
        }
    }
}
