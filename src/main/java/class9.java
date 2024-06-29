import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public class class9 {

    @OriginalMember(owner = "client!wj", name = "e", descriptor = "I")
    public static int field80 = 0;

    @OriginalMember(owner = "client!wj", name = "j", descriptor = "B")
    public byte field85;

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "I")
    public static int field77;

    @OriginalMember(owner = "client!wj", name = "f", descriptor = "I")
    public int field81;

    @OriginalMember(owner = "client!wj", name = "g", descriptor = "I")
    public static int field82;

    @OriginalMember(owner = "client!wj", name = "h", descriptor = "I")
    public static int field83;

    @OriginalMember(owner = "client!wj", name = "i", descriptor = "I")
    public static int field84;

    @OriginalMember(owner = "client!wj", name = "k", descriptor = "I")
    public static int field86;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "Ljava/lang/String;")
    public String field76;

    @OriginalMember(owner = "client!wj", name = "c", descriptor = "Ljava/lang/String;")
    public String field78;

    @OriginalMember(owner = "client!wj", name = "d", descriptor = "Ljava/lang/String;")
    public String field79;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIII)I")
    public static final int method41(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 != 2) {
            method41(-57, -75, 76, 24);
        }
        field86++;
        int var4 = arg2 / arg3;
        int var5 = arg2 & arg3 - 1;
        int var6 = arg0 / arg3;
        int var7 = arg0 & arg3 - 1;
        int var8 = class200.method1082((byte) 126, var4, var6);
        int var9 = class200.method1082((byte) 92, var4 + 1, var6);
        int var10 = class200.method1082((byte) 123, var4, var6 + 1);
        int var11 = class200.method1082((byte) 126, var4 + 1, var6 + 1);
        int var12 = class110.method581(arg3, var9, var8, (byte) -90, var5);
        int var13 = class110.method581(arg3, var11, var10, (byte) -90, var5);
        return class110.method581(arg3, var13, var12, (byte) -90, var7);
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(ILur;BI)V")
    public static final void method42(int arg0, class91 arg1, byte arg2, int arg3) {
        int var4 = 120 % ((arg2 - 67) / 56);
        field82++;
        if (arg1.field6073 == arg0 && arg0 != -1) {
            class208 var5 = class193.method1037(84, arg0);
            int var6 = var5.field2806;
            if (var6 == 1) {
                arg1.field6059 = 0;
                arg1.field6040 = 0;
                arg1.field6033 = 0;
                arg1.field6036 = arg3;
                arg1.field6094 = 1;
                class320.method1848(false, -99, var5, arg1.field6033, arg1.field152, arg1.field154);
            }
            if (var6 == 2) {
                arg1.field6059 = 0;
                return;
            }
        } else if (arg0 == -1 || arg1.field6073 == -1 || class193.method1037(100, arg0).field2819 >= class193.method1037(23, arg1.field6073).field2819) {
            arg1.field6059 = 0;
            arg1.field6036 = arg3;
            arg1.field6094 = 1;
            arg1.field6118 = arg1.field6111;
            arg1.field6073 = arg0;
            arg1.field6033 = 0;
            arg1.field6040 = 0;
            if (arg1.field6073 != -1) {
                class320.method1848(false, 89, class193.method1037(57, arg1.field6073), arg1.field6033, arg1.field152, arg1.field154);
                return;
            }
        } else {
            return;
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public static final int method43(String arg0, int arg1) {
        field84++;
        if (arg0 == null) {
            return -1;
        } else if (arg1 == -1) {
            for (int var2 = 0; var2 < class88.field993; var2++) {
                if (arg0.equalsIgnoreCase(class198.field2647[var2])) {
                    return var2;
                }
            }
            return -1;
        } else {
            return 65;
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(I)V")
    public static final void method44(int arg0) {
        class230 var1 = class179.field2246;
        synchronized (class179.field2246) {
            class225.field3055++;
            class219.field2927 = class449.field6523;
            if (class128.field1659 >= 0) {
                while (class23.field221 != class128.field1659) {
                    int var2 = class420.field6137[class23.field221];
                    class23.field221 = class23.field221 + 1 & 0x7F;
                    if (var2 < 0) {
                        class249.field3361[~var2] = false;
                    } else {
                        class249.field3361[var2] = true;
                    }
                }
            } else {
                for (int var3 = 0; var3 < 112; var3++) {
                    class249.field3361[var3] = false;
                }
                class128.field1659 = class23.field221;
            }
            class449.field6523 = class339.field4515;
        }
        field77++;
        if (arg0 >= -104) {
            field80 = 110;
        }
    }
}
