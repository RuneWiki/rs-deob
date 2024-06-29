import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public class class614 extends class459 {

    @OriginalMember(owner = "client!lk", name = "v", descriptor = "I")
    public int field8817 = 0;

    @OriginalMember(owner = "client!lk", name = "B", descriptor = "[Ljava/lang/String;")
    private static final String[] field8821 = new String[] { method4468(method4467("l]tSf")), method4468(method4467("{\u0018t<3")), method4468(method4467("y\u00066\u0011")), method4468(method4467("{\u0018t>3")), method4468(method4467("{\u0018t?3")) };

    @OriginalMember(owner = "client!lk", name = "w", descriptor = "I")
    public static int field8815;

    @OriginalMember(owner = "client!lk", name = "x", descriptor = "I")
    public static int field8816;

    @OriginalMember(owner = "client!lk", name = "z", descriptor = "I")
    public static int field8818;

    @OriginalMember(owner = "client!lk", name = "y", descriptor = "I")
    public static int field8819;

    @OriginalMember(owner = "client!lk", name = "A", descriptor = "I")
    public static int field8820;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(ZIIIIB)V", line = 4)
    public static final void method4464(boolean arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        try {
            field8815++;
            if (class82.field1247 != null && (arg4 != 3 || class714.field10317 != arg3 || class732.field10729 != arg2)) {
                class233.method2029(100, class82.field1247, class393.field6256);
                class82.field1247 = null;
            }
            if (arg4 == 3 && class82.field1247 == null) {
                class82.field1247 = class521.method3901(arg3, 0, true, class393.field6256, arg2, 0);
                if (class82.field1247 != null) {
                    class732.field10729 = arg2;
                    class714.field10317 = arg3;
                    class574.method4222((byte) -79);
                }
            }
            if (arg5 > 87) {
                if (arg4 == 3 && class82.field1247 == null) {
                    method4464(true, arg1, -1, -1, class623.field8996.field6353.method2132(true), (byte) 92);
                } else {
                    Container var6;
                    if (class82.field1247 != null) {
                        var6 = class82.field1247;
                        class413.field6568 = arg3;
                        class464.field7131 = arg2;
                    } else if (class517.field7660 == null) {
                        if (class476.field7255 == null) {
                            var6 = class540.field7955;
                        } else {
                            var6 = class476.field7255;
                        }
                        class413.field6568 = var6.getSize().width;
                        class464.field7131 = var6.getSize().height;
                    } else {
                        Insets var7 = class517.field7660.getInsets();
                        class413.field6568 = class517.field7660.getSize().width - var7.left - var7.right;
                        int var10001 = var7.top + var7.bottom;
                        class464.field7131 = class517.field7660.getSize().height - var10001;
                        var6 = class517.field7660;
                    }
                    if (arg4 == 1) {
                        class687.field9928 = (class413.field6568 - class696.field10028) / 2;
                        class250.field3835 = 0;
                        class64.field881 = class696.field10028;
                        class333.field5444 = class518.field7672;
                    } else {
                        class376.method3095((byte) 115);
                    }
                    if (class710.field10281 != class417.field6596) {
                        boolean var10000;
                        if (class64.field881 < 1024 && class333.field5444 < 768) {
                            var10000 = true;
                        } else {
                            var10000 = false;
                        }
                    }
                    if (arg0) {
                        class456.method3537(70);
                    } else {
                        class442.field6902.setSize(class64.field881, class333.field5444);
                        if (class316.field5141) {
                            class297.method2564(class442.field6902, 3);
                        } else {
                            class662.field9437.method232(class442.field6902, class64.field881, class333.field5444);
                        }
                        if (class517.field7660 == var6) {
                            Insets var8 = class517.field7660.getInsets();
                            class442.field6902.setLocation(class687.field9928 + var8.left, class250.field3835 + var8.top);
                        } else {
                            class442.field6902.setLocation(class687.field9928, class250.field3835);
                        }
                    }
                    if (arg4 >= 2) {
                        class149.field2090 = true;
                    } else {
                        class149.field2090 = false;
                    }
                    if (class317.field5175 != -1) {
                        class210.method1900(true, (byte) -116);
                    }
                    if (class185.field2948.field2644 != null && class796.method5717(class315.field5127, (byte) -124)) {
                        class369.method3038(true);
                    }
                    for (int var9 = 0; var9 < 100; var9++) {
                        class178.field2871[var9] = true;
                    }
                    class47.field544 = true;
                }
            }
        } catch (RuntimeException var11) {
            throw class590.method4333(var11, field8821[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(ILwq;B)V", line = 137)
    private final void method4465(int arg0, class176 arg1, byte arg2) {
        try {
            int var4 = -66 % ((-arg2 - 47) / 59);
            if (arg0 == 2) {
                this.field8817 = arg1.method1687((byte) -78);
            }
            field8816++;
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field8821[1] + arg0 + ',' + (arg1 == null ? field8821[2] : field8821[0]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(ILwq;)V", line = 153)
    public final void method4466(int arg0, class176 arg1) {
        try {
            if (arg0 != 0) {
                this.field8817 = -90;
            }
            while (true) {
                int var3 = arg1.method1645((byte) -72);
                if (var3 == 0) {
                    field8819++;
                    return;
                }
                this.method4465(var3, arg1, (byte) -108);
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field8821[3] + arg0 + ',' + (arg1 == null ? field8821[2] : field8821[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!lk", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4467(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x1B);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!lk", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4468(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 23;
                    break;
                case 1:
                    var10005 = 115;
                    break;
                case 2:
                    var10005 = 90;
                    break;
                case 3:
                    var10005 = 125;
                    break;
                default:
                    var10005 = 27;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
