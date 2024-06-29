import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class723 {

    @OriginalMember(owner = "client!kf", name = "j", descriptor = "I")
    public static int field10045 = 0;

    @OriginalMember(owner = "client!kf", name = "h", descriptor = "B")
    public static byte field10043;

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "I")
    public static int field10037;

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "I")
    public static int field10038;

    @OriginalMember(owner = "client!kf", name = "e", descriptor = "I")
    public static int field10040;

    @OriginalMember(owner = "client!kf", name = "g", descriptor = "I")
    public static int field10042;

    @OriginalMember(owner = "client!kf", name = "i", descriptor = "I")
    public static int field10044;

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "Luu;")
    public static class237 field10039;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "Lih;")
    public static class744 field10036;

    @OriginalMember(owner = "client!kf", name = "f", descriptor = "Ljava/lang/Object;")
    public static Object field10041;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;")
    public static final String method4041(String arg0, String arg1, String arg2, int arg3) {
        field10040++;
        for (int var4 = arg2.indexOf(arg0); var4 != -1; var4 = arg2.indexOf(arg0, var4 + arg1.length())) {
            arg2 = arg2.substring(0, var4) + arg1 + arg2.substring(var4 + arg0.length());
        }
        return arg3 == 0 ? arg2 : null;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(B)V")
    public static final void method4042(byte arg0) {
        field10037++;
        if (class172.field2390 != class164.field2263 && arg0 >= 46) {
            try {
                class69.method540("tbrefresh", class516.field7210, -126);
            } catch (Throwable var1) {
            }
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "([BI)V")
    public static final synchronized void method4043(byte[] arg0, int arg1) {
        field10042++;
        if (arg0.length == 100 && class688.field9579 < 1000) {
            class704.field9801[class688.field9579++] = arg0;
        } else if (arg0.length == 5000 && class531.field7357 < 250) {
            class121.field1599[class531.field7357++] = arg0;
        } else if (arg0.length == 30000 && class477.field6641 < 50) {
            class529.field7336[class477.field6641++] = arg0;
        } else {
            if (arg1 > -52) {
                method4044((byte) 106);
            }
            if (class608.field8193 != null) {
                for (int var2 = 0; var2 < class250.field3665.length; var2++) {
                    if (class250.field3665[var2] == arg0.length && class608.field8193[var2].length > class585.field7975[var2]) {
                        class608.field8193[var2][class585.field7975[var2]++] = arg0;
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(B)V")
    public static void method4044(byte arg0) {
        field10036 = null;
        field10041 = null;
        if (arg0 != 88) {
            method4043(null, 23);
        }
        field10039 = null;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(ZI)[B")
    public static final synchronized byte[] method4045(boolean arg0, int arg1) {
        field10044++;
        if (arg1 == 100 && class688.field9579 > 0) {
            byte[] var2 = class704.field9801[--class688.field9579];
            class704.field9801[class688.field9579] = null;
            return var2;
        } else if (arg1 == 5000 && class531.field7357 > 0) {
            byte[] var3 = class121.field1599[--class531.field7357];
            class121.field1599[class531.field7357] = null;
            return var3;
        } else if (arg1 == 30000 && class477.field6641 > 0) {
            byte[] var4 = class529.field7336[--class477.field6641];
            class529.field7336[class477.field6641] = null;
            return var4;
        } else {
            if (class608.field8193 != null) {
                for (int var5 = 0; var5 < class250.field3665.length; var5++) {
                    if (class250.field3665[var5] == arg1 && class585.field7975[var5] > 0) {
                        byte[] var6 = class608.field8193[var5][--class585.field7975[var5]];
                        class608.field8193[var5][class585.field7975[var5]] = null;
                        return var6;
                    }
                }
            }
            return arg0 ? null : new byte[arg1];
        }
    }
}
