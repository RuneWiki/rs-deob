import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public class class85 {

    @OriginalMember(owner = "client!hi", name = "c", descriptor = "I")
    public static int field1154 = 99;

    @OriginalMember(owner = "client!hi", name = "f", descriptor = "[I")
    public static int[] field1157 = new int[32768];

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "I")
    public static int field1152;

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "I")
    public static int field1153;

    @OriginalMember(owner = "client!hi", name = "d", descriptor = "I")
    public static int field1155;

    @OriginalMember(owner = "client!hi", name = "e", descriptor = "I")
    public static int field1156;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(ZIIIIIII)V", line = 7)
    public static final void method614(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1156++;
        if (arg3 == arg7) {
            class259.method1864(arg5, arg4, arg6, arg1, arg7, arg2, (byte) 127);
        } else if (arg0) {
            if ((arg6 - arg7) >= class291.field4490 && arg6 + arg7 <= class210.field3309 && arg5 - arg3 >= class42.field579 && class334.field5205 >= (arg5 + arg3)) {
                class149.method1094(arg3, arg4, (byte) 97, arg7, arg1, arg6, arg2, arg5);
            } else {
                class139.method1034(arg7, arg6, arg1, arg5, (byte) -120, arg3, arg2, arg4);
            }
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIII)V", line = 36)
    public static final void method615(int arg0, int arg1, int arg2, int arg3) {
        class124 var4 = class83.field1138[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class283 var5 = var4.field1779;
        if (var5 != null) {
            var5.field4370 = var5.field4370 * arg3 / 16;
            var5.field4378 = var5.field4378 * arg3 / 16;
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(II)[B", line = 55)
    public static final synchronized byte[] method616(int arg0, int arg1) {
        field1155++;
        if (arg1 == 100 && class175.field2871 > 0) {
            byte[] var2 = class5.field48[--class175.field2871];
            class5.field48[class175.field2871] = null;
            return var2;
        } else if (arg1 == 5000 && class116.field1619 > 0) {
            byte[] var3 = class161.field2571[--class116.field1619];
            class161.field2571[class116.field1619] = null;
            return var3;
        } else {
            if (arg0 >= -1) {
                method616(15, 49);
            }
            if (arg1 == 30000 && class99.field1320 > 0) {
                byte[] var4 = class225.field3582[--class99.field1320];
                class225.field3582[class99.field1320] = null;
                return var4;
            } else {
                return new byte[arg1];
            }
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(B)[Lun;", line = 93)
    public static final class190[] method617(byte arg0) {
        field1152++;
        if (arg0 != -28) {
            method616(-15, -44);
        }
        class190[] var1 = new class190[class230.field3599];
        for (int var2 = 0; var2 < class230.field3599; var2++) {
            int var3 = class81.field1103[var2] * class213.field3355[var2];
            byte[] var4 = class207.field3298[var2];
            int[] var5 = new int[var3];
            for (int var6 = 0; var6 < var3; var6++) {
                var5[var6] = class81.field1101[class333.method2319(var4[var6], 255)];
            }
            var1[var2] = new class190(class243.field3796, class126.field1825, class119.field1659[var2], class206.field3261[var2], class213.field3355[var2], class81.field1103[var2], var5);
        }
        class207.method1526(0);
        return var1;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 129)
    public static final void method618(String arg0, int arg1) {
        field1153++;
        class315.field4933 = arg0;
        if (class42.field581.field2181 == null) {
            return;
        }
        if (arg1 >= -99) {
            field1154 = -107;
        }
        try {
            String var2 = class42.field581.field2181.getParameter("cookieprefix");
            String var3 = class42.field581.field2181.getParameter("cookiehost");
            String var4 = var2 + "settings=" + arg0 + "; version=1; path=/; domain=" + var3;
            String var5;
            if (arg0.length() == 0) {
                var5 = var4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                var5 = var4 + "; Expires=" + class265.method1896(12, class219.method1609(-898) + 94608000000L) + "; Max-Age=" + 94608000L;
            }
            class209.method1532("document.cookie=\"" + var5 + "\"", 18221, class42.field581.field2181);
        } catch (Throwable var7) {
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(I)V", line = 163)
    public static void method619(int arg0) {
        field1157 = null;
        if (arg0 != -21864) {
            method616(41, 1);
        }
    }
}
