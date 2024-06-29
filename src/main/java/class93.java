import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class93 {

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "Ljava/lang/String;")
    public static String field1505 = "Walk here";

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "I")
    public static int field1506 = 0;

    @OriginalMember(owner = "client!bi", name = "f", descriptor = "I")
    public static int field1509 = 0;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "I")
    public static int field1504;

    @OriginalMember(owner = "client!bi", name = "d", descriptor = "I")
    public static int field1507;

    @OriginalMember(owner = "client!bi", name = "e", descriptor = "I")
    public static int field1508;

    @OriginalMember(owner = "client!bi", name = "g", descriptor = "I")
    public static int field1510;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIII)I")
    public static final int method729(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg0 / arg3;
        field1508++;
        int var5 = arg3 - 1 & arg0;
        if (arg2 != 20026) {
            return -112;
        }
        int var6 = arg1 & arg3 - 1;
        int var7 = arg1 / arg3;
        int var8 = class6.method78(-2209, var4, var7);
        int var9 = class6.method78(-2209, var4 + 1, var7);
        int var10 = class6.method78(-2209, var4, var7 + 1);
        int var11 = class6.method78(-2209, var4 + 1, var7 - -1);
        int var12 = class126.method900(var5, var9, -6, arg3, var8);
        int var13 = class126.method900(var5, var11, -6, arg3, var10);
        return class126.method900(var6, var13, -6, arg3, var12);
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(I)V")
    public static void method730(int arg0) {
        if (arg0 <= 88) {
            field1509 = 69;
        }
        field1505 = null;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(B)I")
    public static final int method731(byte arg0) {
        field1510++;
        if (arg0 != 49) {
            method732(-4, -5);
        }
        return 2;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(II)Z")
    public static final boolean method732(int arg0, int arg1) {
        field1507++;
        class209 var2 = class3.method42((byte) 37, arg0);
        if (var2 == null) {
            return false;
        } else if (class59.field927 == 1 || class59.field927 == 2 || class238.field3689 == 2) {
            class217.field3374 = var2.field3244;
            class155.field2358 = var2.field3245;
            if (class238.field3689 != 0) {
                class88.field1446 = class155.field2358 + 50000;
                class51.field810 = class155.field2358 + 40000;
                class6.field104 = class51.field810;
            }
            return true;
        } else {
            String var3 = "";
            String var4 = "";
            if (class238.field3689 != 0) {
                var3 = ":" + (var2.field3245 + 7000);
            }
            if (arg1 != 14405) {
                method732(-21, -1);
            }
            if (class174.field2588 != null) {
                var4 = "/p=" + class174.field2588;
            }
            String var5 = "http://" + var2.field3244 + var3 + "/l=" + class226.field3542 + "/a=" + class274.field4315 + var4 + "/j" + (class76.field1278 ? "1" : "0") + ",o" + (class119.field1850 ? "1" : "0") + ",a2,m" + (class191.field3038 ? "1" : "0");
            try {
                class272.field4303.getAppletContext().showDocument(new URL(var5), "_self");
                return true;
            } catch (Exception var6) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(JI)Ljava/lang/String;")
    public static final String method733(long arg0, int arg1) {
        field1504++;
        if (arg0 <= (long) arg1 || arg0 >= 6582952005840035281L) {
            return null;
        } else if ((arg0 % 37L) == 0L) {
            return null;
        } else {
            int var3 = 0;
            long var4 = arg0;
            while (var4 != 0L) {
                var4 /= 37L;
                var3++;
            }
            StringBuffer var6 = new StringBuffer(var3);
            while (arg0 != 0L) {
                long var7 = arg0;
                arg0 /= 37L;
                var6.append(class161.field2469[(int) (var7 - (arg0 * 37L))]);
            }
            return var6.reverse().toString();
        }
    }
}
