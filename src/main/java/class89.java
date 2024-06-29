import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class89 {

    @OriginalMember(owner = "client!se", name = "e", descriptor = "I")
    public static int field1582 = 100;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "I")
    public static int field1578;

    @OriginalMember(owner = "client!se", name = "c", descriptor = "I")
    public static int field1580;

    @OriginalMember(owner = "client!se", name = "d", descriptor = "I")
    public static int field1581;

    @OriginalMember(owner = "client!se", name = "g", descriptor = "I")
    public static int field1584;

    @OriginalMember(owner = "client!se", name = "h", descriptor = "I")
    public static int field1585;

    @OriginalMember(owner = "client!se", name = "i", descriptor = "I")
    public static int field1586;

    @OriginalMember(owner = "client!se", name = "f", descriptor = "[I")
    public static int[] field1583;

    @OriginalMember(owner = "client!se", name = "b", descriptor = "[Lvj;")
    public static class173[] field1579;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(ILvb;ILjava/awt/Component;I)Lij;")
    public static final class258 method576(int arg0, class131 arg1, int arg2, Component arg3, int arg4) {
        field1585++;
        if (class81.field1478 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg4 < 256) {
                arg4 = 256;
            }
            if (arg0 > -87) {
                field1583 = null;
            }
            try {
                class258 var5 = (class258) Class.forName("nl").getDeclaredConstructor().newInstance();
                var5.field4238 = arg4;
                var5.field4207 = new int[(class74.field1215 ? 2 : 1) * 256];
                var5.method1597(arg3);
                var5.field4234 = (arg4 & 0xFFFFFC00) + 1024;
                if (var5.field4234 > 16384) {
                    var5.field4234 = 16384;
                }
                var5.method1598(var5.field4234);
                if (class177.field2925 > 0 && class99.field1708 == null) {
                    class99.field1708 = new class62();
                    class99.field1708.field1087 = arg1;
                    arg1.method917(class177.field2925, (byte) 120, class99.field1708);
                }
                if (class99.field1708 != null) {
                    if (class99.field1708.field1082[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    class99.field1708.field1082[arg2] = var5;
                }
                return var5;
            } catch (Throwable var8) {
                try {
                    class282 var6 = new class282(arg1, arg2);
                    var6.field4207 = new int[(class74.field1215 ? 2 : 1) * 256];
                    var6.field4238 = arg4;
                    var6.method1597(arg3);
                    var6.field4234 = 16384;
                    var6.method1598(var6.field4234);
                    if (class177.field2925 > 0 && class99.field1708 == null) {
                        class99.field1708 = new class62();
                        class99.field1708.field1087 = arg1;
                        arg1.method917(class177.field2925, (byte) 120, class99.field1708);
                    }
                    if (class99.field1708 != null) {
                        if (class99.field1708.field1082[arg2] != null) {
                            throw new IllegalArgumentException();
                        }
                        class99.field1708.field1082[arg2] = var6;
                    }
                    return var6;
                } catch (Throwable var7) {
                    return new class258();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IB)V")
    public static final void method577(int arg0, byte arg1) {
        if (arg1 != -44) {
            return;
        }
        class270.method1776((byte) -80);
        field1580++;
        class220.method1461(-1);
        int var2 = class207.method1378(arg0, (byte) 68).field2682;
        if (var2 == 0) {
            return;
        }
        int var3 = class125.field2191[arg0];
        if (var2 == 6) {
            class241.field3971 = var3;
        }
        if (var2 == 5) {
            class172.field2823 = var3;
        }
        if (var2 == 9) {
            class110.field1991 = var3;
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IZ)V")
    public static final void method578(int arg0, boolean arg1) {
        field1586++;
        if (arg1) {
            method579(-127, 124);
        }
        if (class256.field4178 == null || class256.field4178.length < arg0) {
            class256.field4178 = new int[arg0];
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(II)Lgk;")
    public static final class259 method579(int arg0, int arg1) {
        field1581++;
        class259 var2 = (class259) class272.field4362.method57((long) arg1, -71);
        if (var2 != null) {
            return var2;
        }
        if (arg0 != 87) {
            field1582 = 115;
        }
        class259 var3 = class115.method804(false, class39.field582, arg1, class243.field3989, (byte) 91);
        if (var3 != null) {
            class272.field4362.method62(arg0 ^ 0x57, var3, (long) arg1);
        }
        return var3;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(ZZLdl;)V")
    public static final void method580(boolean arg0, boolean arg1, class46 arg2) {
        if (!arg0) {
            field1583 = null;
        }
        int var3 = arg2.field665 == 0 ? arg2.field701 : arg2.field665;
        field1578++;
        int var4 = arg2.field666 == 0 ? arg2.field715 : arg2.field666;
        class139.method978(class115.field2068[arg2.field786 >> 16], var3, !arg0, arg2.field786, arg1, var4);
        if (arg2.field785 != null) {
            class139.method978(arg2.field785, var3, !arg0, arg2.field786, arg1, var4);
        }
        class194 var5 = (class194) class41.field607.method779(-81, (long) arg2.field786);
        if (var5 != null) {
            class168.method1132(var4, var3, arg1, var5.field3128, (byte) -127);
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IIZI)Ljava/lang/String;")
    public static final String method581(int arg0, int arg1, boolean arg2, int arg3) {
        field1584++;
        if (arg0 < 2 || arg0 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg0);
        } else if (arg2 && arg1 >= 0) {
            int var4 = 2;
            for (int var5 = arg1 / arg0; var5 != 0; var5 /= arg0) {
                var4++;
            }
            char[] var6 = new char[var4];
            var6[0] = '+';
            if (arg3 >= -74) {
                field1579 = null;
            }
            for (int var7 = var4 - 1; var7 > 0; var7--) {
                int var8 = arg1;
                arg1 /= arg0;
                int var9 = var8 - (arg0 * arg1);
                if (var9 >= 10) {
                    var6[var7] = (char) (var9 + 87);
                } else {
                    var6[var7] = (char) (var9 + 48);
                }
            }
            return new String(var6);
        } else {
            return Integer.toString(arg1, arg0);
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(B)V")
    public static void method582(byte arg0) {
        field1579 = null;
        if (arg0 == -56) {
            field1583 = null;
        }
    }
}
