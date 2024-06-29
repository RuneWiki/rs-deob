import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public class class186 extends class117 {

    @OriginalMember(owner = "client!nk", name = "Q", descriptor = "I")
    private int field3038;

    @OriginalMember(owner = "client!nk", name = "K", descriptor = "Ljava/lang/String;")
    public static String field3032 = "";

    @OriginalMember(owner = "client!nk", name = "I", descriptor = "I")
    public static int field3030;

    @OriginalMember(owner = "client!nk", name = "J", descriptor = "I")
    public static int field3031;

    @OriginalMember(owner = "client!nk", name = "L", descriptor = "I")
    public static int field3033;

    @OriginalMember(owner = "client!nk", name = "M", descriptor = "I")
    public static int field3034;

    @OriginalMember(owner = "client!nk", name = "N", descriptor = "I")
    public static int field3035;

    @OriginalMember(owner = "client!nk", name = "O", descriptor = "I")
    public static int field3036;

    @OriginalMember(owner = "client!nk", name = "P", descriptor = "I")
    public static int field3037;

    @OriginalMember(owner = "client!nk", name = "<init>", descriptor = "()V")
    public class186() {
        this(4096);
    }

    @OriginalMember(owner = "client!nk", name = "c", descriptor = "(B)V")
    public static final void method1331(byte arg0) {
        ++field3034;
        boolean var1 = false;
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < class83.field1384 - 1; ++var2) {
                if (~class192.field3103[var2] > -1001 && class192.field3103[var2 - -1] > 1000) {
                    var1 = false;
                    String var3 = class269.field4343[var2];
                    class269.field4343[var2] = class269.field4343[var2 + 1];
                    class269.field4343[var2 + 1] = var3;
                    String var4 = class249.field3948[var2];
                    class249.field3948[var2] = class249.field3948[var2 + 1];
                    class249.field3948[var2 + 1] = var4;
                    int var5 = class64.field1076[var2];
                    class64.field1076[var2] = class64.field1076[var2 + 1];
                    class64.field1076[var2 - -1] = var5;
                    int var6 = class255.field4124[var2];
                    class255.field4124[var2] = class255.field4124[var2 + 1];
                    class255.field4124[var2 + 1] = var6;
                    int var7 = class177.field2904[var2];
                    class177.field2904[var2] = class177.field2904[var2 + 1];
                    class177.field2904[var2 + 1] = var7;
                    short var8 = class192.field3103[var2];
                    class192.field3103[var2] = class192.field3103[var2 + 1];
                    class192.field3103[var2 + 1] = var8;
                    long var9 = class77.field1288[var2];
                    class77.field1288[var2] = class77.field1288[var2 + 1];
                    class77.field1288[var2 + 1] = var9;
                }
            }
        }
        if (arg0 >= -9) {
            field3032 = null;
        }
    }

    @OriginalMember(owner = "client!nk", name = "d", descriptor = "(B)Ljava/lang/String;")
    public static final String method1332(byte arg0) {
        ++field3031;
        String var1 = "";
        if (class160.field2545 != null) {
            var1 = "/p=" + class160.field2545;
        }
        String var2 = "www";
        if (arg0 > -2) {
            method1333(108, (class126) null, 18);
        }
        if (class225.field3652 != 0) {
            var2 = "www-wtqa";
        }
        return "http://" + var2 + ".runescape.com/l=" + class2.field28 + "/a=" + class1.field17 + var1 + "/";
    }

    @OriginalMember(owner = "client!nk", name = "<init>", descriptor = "(I)V")
    public class186(int arg0) {
        super(0, true);
        this.field3038 = 4096;
        this.field3038 = arg0;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(ILjm;I)V")
    public static final void method1333(int arg0, class126 arg1, int arg2) {
        ++field3030;
        Object[] var3 = arg1.field1989;
        int var4 = (Integer) var3[0];
        class228 var5 = class195.method1368(var4, (byte) -95);
        if (var5 != null) {
            class253.field4068 = new int[var5.field3678];
            int var6 = arg2;
            class293.field4695 = new String[var5.field3685];
            int var7 = 0;
            for (int var8 = 1; var3.length > var8; ++var8) {
                if (var3[var8] instanceof Integer) {
                    int var9 = (Integer) var3[var8];
                    if (var9 == -2147483647) {
                        var9 = arg1.field1999;
                    }
                    if (~var9 == 2147483645) {
                        var9 = arg1.field1987;
                    }
                    if (var9 == -2147483645) {
                        var9 = arg1.field2000 != null ? arg1.field2000.field3375 : -1;
                    }
                    if (var9 == -2147483644) {
                        var9 = arg1.field1991;
                    }
                    if (var9 == -2147483643) {
                        var9 = arg1.field2000 == null ? -1 : arg1.field2000.field3413;
                    }
                    if (var9 == -2147483642) {
                        var9 = arg1.field1981 != null ? arg1.field1981.field3375 : -1;
                    }
                    if (~var9 == 2147483640) {
                        var9 = arg1.field1981 == null ? -1 : arg1.field1981.field3413;
                    }
                    if (~var9 == 2147483639) {
                        var9 = arg1.field1992;
                    }
                    if (~var9 == 2147483638) {
                        var9 = arg1.field1983;
                    }
                    class253.field4068[var6++] = var9;
                } else if (var3[var8] instanceof String) {
                    String var10 = (String) var3[var8];
                    if (var10.equals("event_opbase")) {
                        var10 = arg1.field1986;
                    }
                    class293.field4695[var7++] = var10;
                }
            }
            class276.method1857(118, var5, arg0);
        }
    }

    @OriginalMember(owner = "client!nk", name = "j", descriptor = "(I)V")
    public static void method1334(int arg0) {
        field3032 = null;
        if (arg0 != 11) {
            field3032 = null;
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(Lwd;II)V")
    public final void method44(class162 arg0, int arg1, int arg2) {
        ++field3033;
        if (arg1 != 255) {
            this.field3038 = -37;
        }
        if (~arg2 == -1) {
            this.field3038 = (arg0.method1133((byte) 53) << 12) / 255;
        }
    }

    @OriginalMember(owner = "client!nk", name = "c", descriptor = "(II)Lpm;")
    public static final class60 method1335(int arg0, int arg1) {
        ++field3037;
        class60 var2 = (class60) class53.field887.method694((long) arg0, false);
        if (var2 != null) {
            return var2;
        } else if (arg1 != 18773) {
            return null;
        } else {
            byte[] var3 = class270.field4352.method1680(arg0, 11, -100);
            class60 var4 = new class60();
            if (var3 != null) {
                var4.method411(-116, new class162(var3));
            }
            class53.field887.method693((long) arg0, arg1 ^ -18799, var4);
            return var4;
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(II)[I")
    public final int[] method46(int arg0, int arg1) {
        if (arg0 != 2) {
            this.field3038 = 54;
        }
        ++field3035;
        int[] var3 = super.field1883.method531(arg1, (byte) 125);
        if (super.field1883.field1313) {
            class157.method1070(var3, 0, class168.field2737, this.field3038);
        }
        return var3;
    }
}
