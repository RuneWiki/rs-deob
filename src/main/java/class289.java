import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class289 {

    @OriginalMember(owner = "client!fi", name = "l", descriptor = "Lqb;")
    private class117 field4556 = new class117(256);

    @OriginalMember(owner = "client!fi", name = "o", descriptor = "Lqb;")
    private class117 field4559 = new class117(256);

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "Lnk;")
    private class16 field4548;

    @OriginalMember(owner = "client!fi", name = "f", descriptor = "Lnk;")
    private class16 field4550;

    @OriginalMember(owner = "client!fi", name = "e", descriptor = "[I")
    public static int[] field4549 = new int[128];

    @OriginalMember(owner = "client!fi", name = "i", descriptor = "Lvh;")
    public static class62 field4553 = new class62(50);

    @OriginalMember(owner = "client!fi", name = "n", descriptor = "Ljava/lang/String;")
    public static String field4558 = "red:";

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "I")
    public static int field4545;

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "I")
    public static int field4546;

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "I")
    public static int field4547;

    @OriginalMember(owner = "client!fi", name = "g", descriptor = "I")
    public static int field4551;

    @OriginalMember(owner = "client!fi", name = "h", descriptor = "I")
    public static int field4552;

    @OriginalMember(owner = "client!fi", name = "j", descriptor = "I")
    public static int field4554;

    @OriginalMember(owner = "client!fi", name = "k", descriptor = "[I")
    public static int[] field4555;

    @OriginalMember(owner = "client!fi", name = "m", descriptor = "[Ljava/lang/String;")
    public static String[] field4557;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(B[III)Lfn;", line = 8)
    private final class37 method2065(byte arg0, int[] arg1, int arg2, int arg3) {
        field4545++;
        int var5 = arg2 ^ ((arg3 & 0xF0000FFF) << 4 | arg3 >>> 12);
        int var6 = var5 | arg3 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class37 var9 = (class37) this.field4559.method770(var7, -74);
        if (var9 != null) {
            return var9;
        } else if (arg1 == null || arg1[0] > 0) {
            class221 var10 = (class221) this.field4556.method770(var7, 41);
            if (var10 == null) {
                var10 = class221.method1546(this.field4550, arg3, arg2);
                if (var10 == null) {
                    return null;
                }
                this.field4556.method764(24369, var10, var7);
            }
            class37 var11 = var10.method1539(arg1);
            if (arg0 < 57) {
                field4558 = (String) null;
            }
            if (var11 == null) {
                return null;
            } else {
                var10.method1290(104);
                this.field4559.method764(24369, var11, var7);
                return var11;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(I)V", line = 59)
    public static void method2066(int arg0) {
        if (arg0 != -8962) {
            field4553 = (class62) null;
        }
        field4549 = null;
        field4558 = null;
        field4555 = null;
        field4557 = null;
        field4553 = null;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(BI)Lro;", line = 81)
    public static final class111 method2067(byte arg0, int arg1) {
        field4554++;
        class111 var2 = (class111) class276.field4345.method380(0, (long) arg1);
        if (var2 != null) {
            return var2;
        } else if (arg0 >= -15) {
            return (class111) null;
        } else {
            byte[] var3 = class215.field3261.method100(class357.method2456(32676, arg1), class261.method1841(true, arg1), (byte) -107);
            class111 var4 = new class111();
            var4.field1540 = arg1;
            if (var3 != null) {
                var4.method719(new class143(var3), false);
            }
            var4.method720((byte) -65);
            class276.field4345.method377((long) arg1, var4, -1);
            return var4;
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(I[III)Lfn;", line = 113)
    private final class37 method2068(int arg0, int[] arg1, int arg2, int arg3) {
        int var5 = arg0 ^ (arg2 << 4 & 0xFFF5 | arg2 >>> 12);
        int var6 = var5 | arg2 << 16;
        long var7 = (long) var6;
        field4546++;
        class37 var9 = (class37) this.field4559.method770(var7, arg3 + 21204);
        if (var9 != null) {
            return var9;
        } else if (arg3 != -21312) {
            return (class37) null;
        } else if (arg1 == null || arg1[0] > 0) {
            class284 var10 = class284.method2050(this.field4548, arg2, arg0);
            if (var10 == null) {
                return null;
            }
            class37 var11 = var10.method2051();
            this.field4559.method764(24369, var11, var7);
            if (arg1 != null) {
                arg1[0] -= var11.field425.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fi", name = "<init>", descriptor = "(Lnk;Lnk;)V", line = 222)
    public class289(class16 arg0, class16 arg1) {
        this.field4548 = arg0;
        this.field4550 = arg1;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "([III)Lfn;", line = 156)
    public final class37 method2069(int[] arg0, int arg1, int arg2) {
        field4547++;
        if (this.field4550.method122(-88) == 1) {
            return this.method2065((byte) 76, arg0, arg1, 0);
        } else if (this.field4550.method110(false, arg1) == 1) {
            return this.method2065((byte) 106, arg0, 0, arg1);
        } else {
            if (arg2 != 0) {
                method2066(95);
            }
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IB[I)Lfn;", line = 179)
    public final class37 method2070(int arg0, byte arg1, int[] arg2) {
        field4552++;
        if (this.field4548.method122(-30) == 1) {
            return this.method2068(arg0, arg2, 0, -21312);
        } else if (this.field4548.method110(false, arg0) == 1) {
            return this.method2068(0, arg2, arg0, -21312);
        } else {
            if (arg1 != -82) {
                field4557 = (String[]) null;
            }
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(BZ)V", line = 202)
    public static final void method2071(byte arg0, boolean arg1) {
        field4551++;
        int var2 = 41 % ((arg0 - 75) / 43);
        if (arg1 != class242.field3766) {
            class242.field3766 = arg1;
            class28.method209((byte) -117);
        }
    }
}
