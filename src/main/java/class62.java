import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class62 {

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "Ltg;")
    private class345 field732 = new class345();

    @OriginalMember(owner = "client!vh", name = "q", descriptor = "I")
    private int field747;

    @OriginalMember(owner = "client!vh", name = "e", descriptor = "I")
    private int field735;

    @OriginalMember(owner = "client!vh", name = "d", descriptor = "Lqb;")
    private class117 field734;

    @OriginalMember(owner = "client!vh", name = "l", descriptor = "Ljava/lang/String;")
    public static String field742 = "purple:";

    @OriginalMember(owner = "client!vh", name = "m", descriptor = "Z")
    public static boolean field743 = false;

    @OriginalMember(owner = "client!vh", name = "g", descriptor = "[C")
    public static char[] field737 = new char[128];

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "I")
    public static int field731;

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "I")
    public static int field733;

    @OriginalMember(owner = "client!vh", name = "f", descriptor = "I")
    public static int field736;

    @OriginalMember(owner = "client!vh", name = "h", descriptor = "I")
    public static int field738;

    @OriginalMember(owner = "client!vh", name = "i", descriptor = "I")
    public static int field739;

    @OriginalMember(owner = "client!vh", name = "j", descriptor = "I")
    public static int field740;

    @OriginalMember(owner = "client!vh", name = "k", descriptor = "I")
    public static int field741;

    @OriginalMember(owner = "client!vh", name = "n", descriptor = "I")
    public static int field744;

    @OriginalMember(owner = "client!vh", name = "o", descriptor = "I")
    public static int field745;

    @OriginalMember(owner = "client!vh", name = "p", descriptor = "I")
    public static int field746;

    @OriginalMember(owner = "client!vh", name = "r", descriptor = "[[Lwb;")
    public static class175[][] field748;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(JLjava/lang/Object;I)V", line = 6)
    public final void method377(long arg0, Object arg1, int arg2) {
        this.method382(arg0, (byte) -82);
        field744++;
        if (~this.field747 == arg2) {
            class102 var5 = (class102) this.field732.method2396(1542);
            var5.method1290(arg2 ^ 0x3B);
            var5.method1829((byte) -74);
        } else {
            this.field747--;
        }
        class170 var6 = new class170(arg1);
        this.field734.method764(arg2 + 24370, var6, arg0);
        this.field732.method2395(arg2 + 16219, var6);
        var6.field4086 = 0L;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(I)V", line = 32)
    public final void method378(int arg0) {
        if (arg0 != 0) {
            return;
        }
        field740++;
        for (class102 var2 = (class102) this.field732.method2397((byte) 9); var2 != null; var2 = (class102) this.field732.method2392((byte) -22)) {
            if (var2.method646((byte) -107)) {
                var2.method1290(102);
                var2.method1829((byte) -74);
                this.field747++;
            }
        }
    }

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "(I)V", line = 57)
    public static void method379(int arg0) {
        if (arg0 > 112) {
            field748 = (class175[][]) null;
            field742 = null;
            field737 = null;
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(IJ)Ljava/lang/Object;", line = 72)
    public final Object method380(int arg0, long arg1) {
        field745++;
        class102 var4 = (class102) this.field734.method770(arg1, 90);
        if (var4 == null) {
            return null;
        }
        if (arg0 != 0) {
            this.method382(-24L, (byte) -6);
        }
        Object var5 = var4.method649((byte) 104);
        if (var5 == null) {
            var4.method1290(122);
            var4.method1829((byte) -74);
            this.field747++;
            return null;
        }
        if (var4.method646((byte) -118)) {
            class170 var6 = new class170(var5);
            this.field734.method764(24369, var6, var4.field2834);
            this.field732.method2395(arg0 + 16218, var6);
            var6.field4086 = 0L;
            var4.method1290(98);
            var4.method1829((byte) -74);
        } else {
            this.field732.method2395(16218, var4);
            var4.field4086 = 0L;
        }
        return var5;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(IIIIIB)V", line = 121)
    public static final void method381(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        field746++;
        int var6 = arg1;
        if (arg5 > 102) {
            while (var6 <= arg3) {
                class278.method1986(arg2, class347.field5501[var6], arg0, arg4, (byte) 95);
                var6++;
            }
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(JB)V", line = 141)
    public final void method382(long arg0, byte arg1) {
        field733++;
        int var4 = 121 / ((arg1 + 3) / 51);
        class102 var5 = (class102) this.field734.method770(arg0, -33);
        if (var5 != null) {
            var5.method1290(112);
            var5.method1829((byte) -74);
            this.field747++;
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(B)V", line = 159)
    public final void method383(byte arg0) {
        field741++;
        this.field732.method2393(101);
        if (arg0 == -48) {
            this.field734.method769(103);
            this.field747 = this.field735;
        }
    }

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "(B)I", line = 176)
    public final int method384(byte arg0) {
        int var2 = 0;
        for (class102 var3 = (class102) this.field732.method2397((byte) -125); var3 != null; var3 = (class102) this.field732.method2392((byte) -22)) {
            if (!var3.method646((byte) -113)) {
                var2++;
            }
        }
        if (arg0 != 60) {
            method379(-75);
        }
        field739++;
        return var2;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(BLwf;)V", line = 200)
    public static final void method385(byte arg0, class67 arg1) {
        int var2 = 22 % ((19 - arg0) / 59);
        field736++;
        class337 var3 = (class337) class168.field2574.method770(class294.method2093((byte) 100, arg1.field848), -60);
        if (var3 == null) {
            return;
        }
        if (var3.field5386 != null) {
            class20.field239.method2339(var3.field5386);
            var3.field5386 = null;
        }
        var3.method1290(-51);
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(Lwc;Z)V", line = 230)
    public static final void method386(class119 arg0, boolean arg1) {
        class99.field1343 = arg0;
        field731++;
        if (!arg1) {
            field743 = false;
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(IZ)V", line = 241)
    public final void method387(int arg0, boolean arg1) {
        field738++;
        if (class127.field1860 != null) {
            for (class102 var3 = (class102) this.field732.method2397((byte) -120); var3 != null; var3 = (class102) this.field732.method2392((byte) -22)) {
                if (var3.method646((byte) -120)) {
                    if (var3.method649((byte) 104) == null) {
                        var3.method1290(97);
                        var3.method1829((byte) -74);
                        this.field747++;
                    }
                } else if (((long) arg0) < (++var3.field4086)) {
                    class102 var4 = class127.field1860.method245(var3, (byte) -45);
                    this.field734.method764(24369, var4, var3.field2834);
                    class311.method2200(21622, var4, var3);
                    var3.method1290(-12);
                    var3.method1829((byte) -74);
                }
            }
        }
        if (arg1) {
            method379(-11);
        }
    }

    @OriginalMember(owner = "client!vh", name = "<init>", descriptor = "(I)V", line = 309)
    public class62(int arg0) {
        this.field747 = arg0;
        this.field735 = arg0;
        int var2;
        for (var2 = 1; arg0 > var2 + var2; var2 += var2) {
        }
        this.field734 = new class117(var2);
    }
}
