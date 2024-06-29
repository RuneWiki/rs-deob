import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class48 {

    @OriginalMember(owner = "client!sh", name = "h", descriptor = "I")
    public int field671;

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "[Ljava/lang/String;")
    public static String[] field666 = new String[100];

    @OriginalMember(owner = "client!sh", name = "i", descriptor = "I")
    public static int field672 = -1;

    @OriginalMember(owner = "client!sh", name = "g", descriptor = "Z")
    public static boolean field670 = false;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "I")
    public static int field664;

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "I")
    public static int field665;

    @OriginalMember(owner = "client!sh", name = "d", descriptor = "I")
    public static int field667;

    @OriginalMember(owner = "client!sh", name = "e", descriptor = "I")
    public static int field668;

    @OriginalMember(owner = "client!sh", name = "f", descriptor = "I")
    public static int field669;

    @OriginalMember(owner = "client!sh", name = "j", descriptor = "J")
    public static long field673;

    @OriginalMember(owner = "client!sh", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field669++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(B)V")
    public static void method314(byte arg0) {
        if (arg0 != 1) {
            field672 = -17;
        }
        field666 = null;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IZII)I")
    public static final int method315(int arg0, boolean arg1, int arg2, int arg3) {
        field668++;
        class456 var4 = class264.method1626(arg3 ^ arg3, arg2, arg1);
        if (var4 == null) {
            return 0;
        } else if (arg0 == -1) {
            return 0;
        } else {
            int var5 = 0;
            for (int var6 = 0; var6 < var4.field6415.length; var6++) {
                if (var4.field6410[var6] == arg0) {
                    var5 += var4.field6415[var6];
                }
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(I[[I)V")
    public static final void method316(int arg0, int[][] arg1) {
        class128.field1676 = arg1;
        if (arg0 >= -95) {
            method319((class483) null, 113, 25, -22, -101, -89);
        }
        field664++;
    }

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "(B)V")
    public static final void method317(byte arg0) {
        field665++;
        class383 var1 = null;
        try {
            class366 var2 = class252.field3718.method2530(false);
            while (var2.field5253 == 0) {
                class111.method713(92, 1L);
            }
            if (var2.field5253 == 1) {
                var1 = (class383) var2.field5255;
                class276 var3 = new class276(class363.field5226 * 6 + 3);
                var3.method1753(true, 1);
                var3.method1711(false, class363.field5226);
                for (int var4 = 0; var4 < class156.field2320.length; var4++) {
                    if (class146.field2102[var4]) {
                        var3.method1711(false, var4);
                        var3.method1744(class156.field2320[var4], true);
                    }
                }
                var1.method2310(var3.field4021, 401, 0, var3.field4064);
            }
        } catch (Exception var6) {
        }
        if (arg0 > -89) {
            return;
        }
        try {
            if (var1 != null) {
                var1.method2311((byte) -127);
            }
        } catch (Exception var5) {
        }
        class266.field3893 = class433.method2562(-2039);
        class29.field391 = false;
    }

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "(B)I")
    public final int method318(byte arg0) {
        field667++;
        if (arg0 != -101) {
            method319((class483) null, -22, -82, 110, -56, -65);
        }
        return this.field671;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(Lqc;IIIII)V")
    public static final void method319(class483 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        arg0.field6802 = 0;
        for (int var6 = 0; var6 < 4; var6++) {
            if (arg0.field6799[var6] != null) {
                arg0.field6802++;
            }
        }
        label50: for (int var7 = 0; var7 < arg0.field6802; var7++) {
            long var8 = class337.field4910[arg1][arg2][arg3];
            while (var8 != 0L) {
                class94 var14 = class478.field6712[(int) ((var8 & 0xFFFFL) - 1L)];
                var8 >>>= 0x10;
                if (arg0.field6799[var7] == var14) {
                    continue label50;
                }
            }
            long var10 = class337.field4910[arg1][arg4][arg5];
            while (var10 != 0L) {
                class94 var13 = class478.field6712[(int) ((var10 & 0xFFFFL) - 1L)];
                var10 >>>= 0x10;
                if (arg0.field6799[var7] == var13) {
                    continue label50;
                }
            }
            for (int var12 = var7; var12 < arg0.field6802 - 1; var12++) {
                arg0.field6799[var12] = arg0.field6799[var12 + 1];
            }
            arg0.field6802--;
        }
    }

    @OriginalMember(owner = "client!sh", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class48(String arg0, int arg1) {
        this.field671 = arg1;
    }
}
