import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class106 {

    @OriginalMember(owner = "client!rf", name = "d", descriptor = "Lmo;")
    private class336 field1482 = new class336(64);

    @OriginalMember(owner = "client!rf", name = "r", descriptor = "Lmo;")
    public class336 field1496 = new class336(64);

    @OriginalMember(owner = "client!rf", name = "f", descriptor = "Lnl;")
    private class435 field1484;

    @OriginalMember(owner = "client!rf", name = "n", descriptor = "Lnl;")
    public class435 field1492;

    @OriginalMember(owner = "client!rf", name = "j", descriptor = "Lap;")
    public static class310 field1488 = new class310(53, 6);

    @OriginalMember(owner = "client!rf", name = "o", descriptor = "[[B")
    public static byte[][] field1493 = new byte[1000][];

    @OriginalMember(owner = "client!rf", name = "q", descriptor = "[I")
    public static int[] field1495 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

    @OriginalMember(owner = "client!rf", name = "p", descriptor = "[Ljava/lang/String;")
    public static String[] field1494 = new String[8];

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "I")
    public static int field1479;

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "I")
    public static int field1480;

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "I")
    public static int field1481;

    @OriginalMember(owner = "client!rf", name = "e", descriptor = "I")
    public static int field1483;

    @OriginalMember(owner = "client!rf", name = "g", descriptor = "I")
    public static int field1485;

    @OriginalMember(owner = "client!rf", name = "h", descriptor = "I")
    public static int field1486;

    @OriginalMember(owner = "client!rf", name = "i", descriptor = "I")
    public static int field1487;

    @OriginalMember(owner = "client!rf", name = "k", descriptor = "I")
    public static int field1489;

    @OriginalMember(owner = "client!rf", name = "l", descriptor = "I")
    public static int field1490;

    @OriginalMember(owner = "client!rf", name = "m", descriptor = "I")
    public static int field1491;

    @OriginalMember(owner = "client!rf", name = "s", descriptor = "I")
    public static int field1497;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(I)V", line = 7)
    public final void method841(int arg0) {
        class336 var2 = this.field1482;
        synchronized (this.field1482) {
            this.field1482.method2109(-1);
        }
        field1479++;
        class336 var3 = this.field1496;
        synchronized (this.field1496) {
            int var4 = -65 / ((-arg0 - 35) / 35);
            this.field1496.method2109(-1);
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;IILjava/lang/String;)V", line = 24)
    public static final void method842(String arg0, int arg1, String arg2, int arg3, int arg4, String arg5) {
        field1491++;
        class385.method2346(arg5, arg3, arg1, arg0, arg2, (String) null, (byte) 103, -1);
        if (arg4 != 0) {
            method847(113, -86, 36, (Class) null);
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(II)Lqe;", line = 38)
    public final class51 method843(int arg0, int arg1) {
        field1485++;
        if (arg0 <= 55) {
            return null;
        }
        class336 var3 = this.field1482;
        class51 var4;
        synchronized (this.field1482) {
            var4 = (class51) this.field1482.method2113(0, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field1484.method2633(34, arg1, 83);
        class51 var6 = new class51();
        var6.field739 = this;
        if (var5 != null) {
            var6.method491((byte) -21, new class161(var5));
        }
        class336 var7 = this.field1482;
        synchronized (this.field1482) {
            this.field1482.method2116((long) arg1, (byte) -31, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(B)V", line = 70)
    public static void method844(byte arg0) {
        field1493 = null;
        field1495 = null;
        field1494 = null;
        if (arg0 > -59) {
            field1497 = -80;
        }
        field1488 = null;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IJ[II)Ljava/lang/String;", line = 83)
    public static final String method845(int arg0, long arg1, int[] arg2, int arg3) {
        field1480++;
        if (arg0 != 6) {
            field1494 = null;
        }
        if (class62.field912 != null) {
            String var5 = class62.field912.method2034(arg2, (byte) -41, arg1, arg3);
            if (var5 != null) {
                return var5;
            }
        }
        return Long.toString(arg1);
    }

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "(II)V", line = 104)
    public final void method846(int arg0, int arg1) {
        class336 var3 = this.field1482;
        synchronized (this.field1482) {
            this.field1482.method2120((byte) -71, arg0);
        }
        field1489++;
        class336 var4 = this.field1496;
        synchronized (this.field1496) {
            if (arg1 > -85) {
                field1493 = null;
            }
            this.field1496.method2120((byte) 125, arg0);
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IIILjava/lang/Class;)Lwt;", line = 122)
    public static final class325 method847(int arg0, int arg1, int arg2, Class arg3) {
        class52 var4 = class385.field5285[arg0][arg1][arg2];
        if (var4 == null) {
            return null;
        }
        for (class131 var5 = var4.field763; var5 != null; var5 = var5.field1796) {
            class325 var6 = var5.field1803;
            if (arg3.isAssignableFrom(var6.getClass()) && var6.field4535 == arg1 && var6.field4539 == arg2) {
                return var6;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IZI)V", line = 148)
    public final void method848(int arg0, boolean arg1, int arg2) {
        field1483++;
        if (!arg1) {
            this.field1482 = new class336(arg0);
            this.field1496 = new class336(arg2);
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lkk;B)V", line = 162)
    public static final void method849(class161 arg0, byte arg1) {
        field1486++;
        int var2 = arg0.method1133(0);
        class166.field2414 = new class25[var2];
        if (arg1 != -44) {
            field1495 = null;
        }
        for (int var3 = 0; var3 < var2; var3++) {
            class166.field2414[var3] = new class25();
            class166.field2414[var3].field262 = arg0.method1133(0);
            class166.field2414[var3].field261 = arg0.method1136(-114);
        }
        class262.field3772 = arg0.method1133(0);
        class150.field2079 = arg0.method1133(0);
        class267.field3921 = arg0.method1133(0);
        class162.field2364 = new class21[class150.field2079 + 1 - class262.field3772];
        for (int var4 = 0; var4 < class267.field3921; var4++) {
            int var5 = arg0.method1133(0);
            class21 var6 = class162.field2364[var5] = new class21();
            var6.field3075 = arg0.method1172((byte) 24);
            var6.field3071 = arg0.method1168(arg1 + 299);
            var6.field228 = var5 + class262.field3772;
            var6.field232 = arg0.method1136(-82);
            var6.field220 = arg0.method1136(-91);
        }
        class37.field454 = arg0.method1168(255);
        class6.field36 = true;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Z)V", line = 213)
    public final void method850(boolean arg0) {
        class336 var2 = this.field1482;
        synchronized (this.field1482) {
            this.field1482.method2119(0);
        }
        if (!arg0) {
            this.method846(15, -97);
        }
        field1490++;
        class336 var3 = this.field1496;
        synchronized (this.field1496) {
            this.field1496.method2119(0);
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(BJ)Ljava/lang/String;", line = 230)
    public static final String method851(byte arg0, long arg1) {
        field1481++;
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return null;
        } else if ((arg1 % 37L) == 0L) {
            return null;
        } else {
            int var3 = 0;
            long var4 = arg1;
            while (var4 != 0L) {
                var4 /= 37L;
                var3++;
            }
            int var6 = 79 / ((arg0 + 44) / 63);
            StringBuffer var7 = new StringBuffer(var3);
            while (arg1 != 0L) {
                long var8 = arg1;
                arg1 /= 37L;
                var7.append(class223.field3224[(int) (var8 - (arg1 * 37L))]);
            }
            return var7.reverse().toString();
        }
    }

    @OriginalMember(owner = "client!rf", name = "<init>", descriptor = "(Llo;ILnl;Lnl;)V", line = 296)
    public class106(class280 arg0, int arg1, class435 arg2, class435 arg3) {
        this.field1484 = arg2;
        this.field1492 = arg3;
        this.field1484.method2638(1, 34);
    }
}
