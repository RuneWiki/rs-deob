import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class60 {

    @OriginalMember(owner = "client!ja", name = "h", descriptor = "[Lma;")
    public static class272[] field883 = new class272[6];

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "I")
    public static int field876 = 0;

    @OriginalMember(owner = "client!ja", name = "e", descriptor = "I")
    public static int field880 = 0;

    @OriginalMember(owner = "client!ja", name = "g", descriptor = "I")
    public static int field882 = 100;

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "I")
    public static int field877;

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "I")
    public static int field878;

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "I")
    public static int field879;

    @OriginalMember(owner = "client!ja", name = "f", descriptor = "I")
    public static int field881;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIIIZ)V")
    public static final void method383(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field878++;
        if (class190.method1322(arg0, (byte) 97)) {
            class295.method1992(arg2, -1, class68.field1018[arg0], false, arg4, arg3);
            if (arg1 >= -69) {
                field880 = 88;
            }
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(I)Z")
    public static final boolean method384(int arg0) {
        if (arg0 != -4) {
            method386((int[]) null, (Object[]) null, 99, -15, 94);
        }
        field879++;
        return class3.field46;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(B)V")
    public static final void method385(byte arg0) {
        field877++;
        if (class299.field4764 == 0) {
            return;
        }
        try {
            if ((++class263.field4267) > 2000) {
                if (class270.field4405 != null) {
                    class270.field4405.method567(0);
                    class270.field4405 = null;
                }
                if (class118.field1706 >= 1) {
                    class299.field4764 = 0;
                    class130.field1863 = -5;
                    return;
                }
                if (class277.field4546 == class231.field3697) {
                    class231.field3697 = class47.field598;
                } else {
                    class231.field3697 = class277.field4546;
                }
                class118.field1706++;
                class299.field4764 = 1;
                class263.field4267 = 0;
            }
            if (class299.field4764 == 1) {
                class110.field1594 = class95.field1425.method1685(114, class231.field3697, class142.field2109);
                class299.field4764 = 2;
            }
            if (class299.field4764 == 2) {
                if (class110.field1594.field2399 == 2) {
                    throw new IOException();
                }
                if (class110.field1594.field2399 != 1) {
                    return;
                }
                class270.field4405 = new class83((Socket) class110.field1594.field2401, class95.field1425);
                class110.field1594 = null;
                class270.field4405.method562(class150.field2218.field2676, class150.field2218.field2650, 0, 76);
                if (class1.field27 != null) {
                    class1.field27.method1536(32768);
                }
                if (class195.field3078 != null) {
                    class195.field3078.method1536(32768);
                }
                int var1 = class270.field4405.method571(true);
                if (class1.field27 != null) {
                    class1.field27.method1536(32768);
                }
                if (class195.field3078 != null) {
                    class195.field3078.method1536(32768);
                }
                if (var1 != 21) {
                    class299.field4764 = 0;
                    class130.field1863 = var1;
                    class270.field4405.method567(0);
                    class270.field4405 = null;
                    return;
                }
                class299.field4764 = 3;
            }
            if (arg0 > -41) {
                method383(-17, 7, -43, -37, false);
            }
            if (class299.field4764 == 3) {
                if (class270.field4405.method558(-23644) < 1) {
                    return;
                }
                class128.field1830 = new String[class270.field4405.method571(true)];
                class299.field4764 = 4;
            }
            if (class299.field4764 == 4 && class270.field4405.method558(-23644) >= (class128.field1830.length * 8)) {
                class175.field2763.field2676 = 0;
                class270.field4405.method566(class128.field1830.length * 8, class175.field2763.field2650, false, 0);
                for (int var2 = 0; var2 < class128.field1830.length; var2++) {
                    class128.field1830[var2] = class23.method124(class175.field2763.method1181(27081), false);
                }
                class299.field4764 = 0;
                class130.field1863 = 21;
                class270.field4405.method567(0);
                class270.field4405 = null;
            }
        } catch (IOException var3) {
            if (class270.field4405 != null) {
                class270.field4405.method567(0);
                class270.field4405 = null;
            }
            if (class118.field1706 >= 1) {
                class299.field4764 = 0;
                class130.field1863 = -4;
            } else {
                class118.field1706++;
                class299.field4764 = 1;
                if (class277.field4546 == class231.field3697) {
                    class231.field3697 = class47.field598;
                } else {
                    class231.field3697 = class277.field4546;
                }
                class263.field4267 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "([I[Ljava/lang/Object;III)V")
    public static final void method386(int[] arg0, Object[] arg1, int arg2, int arg3, int arg4) {
        if (arg3 < arg2) {
            int var5 = arg3;
            int var6 = (arg2 + arg3) / 2;
            int var7 = arg0[var6];
            arg0[var6] = arg0[arg2];
            arg0[arg2] = var7;
            Object var8 = arg1[var6];
            arg1[var6] = arg1[arg2];
            arg1[arg2] = var8;
            for (int var9 = arg3; var9 < arg2; var9++) {
                if (var7 + (var9 & 0x1) > arg0[var9]) {
                    int var10 = arg0[var9];
                    arg0[var9] = arg0[var5];
                    arg0[var5] = var10;
                    Object var11 = arg1[var9];
                    arg1[var9] = arg1[var5];
                    arg1[var5++] = var11;
                }
            }
            arg0[arg2] = arg0[var5];
            arg0[var5] = var7;
            arg1[arg2] = arg1[var5];
            arg1[var5] = var8;
            method386(arg0, arg1, var5 - 1, arg3, -112);
            method386(arg0, arg1, arg2, var5 + 1, -96);
        }
        if (arg4 > -71) {
            field876 = 105;
        }
        field881++;
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(B)V")
    public static void method387(byte arg0) {
        if (arg0 != -83) {
            field882 = -113;
        }
        field883 = null;
    }
}
