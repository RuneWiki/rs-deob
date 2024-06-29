import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public class class302 {

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "J")
    public long field5061 = 0L;

    @OriginalMember(owner = "client!ak", name = "j", descriptor = "Lqd;")
    public static class40 field5068 = class147.method1106("(Z", (byte) -43);

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "I")
    public static int field5060;

    @OriginalMember(owner = "client!ak", name = "d", descriptor = "I")
    public int field5062;

    @OriginalMember(owner = "client!ak", name = "e", descriptor = "I")
    public int field5063;

    @OriginalMember(owner = "client!ak", name = "f", descriptor = "I")
    public int field5064;

    @OriginalMember(owner = "client!ak", name = "g", descriptor = "I")
    public static int field5065;

    @OriginalMember(owner = "client!ak", name = "i", descriptor = "I")
    public int field5067;

    @OriginalMember(owner = "client!ak", name = "k", descriptor = "I")
    public static int field5069;

    @OriginalMember(owner = "client!ak", name = "l", descriptor = "I")
    public static int field5070;

    @OriginalMember(owner = "client!ak", name = "m", descriptor = "I")
    public int field5071;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "Lbg;")
    public class196 field5059;

    @OriginalMember(owner = "client!ak", name = "h", descriptor = "Lbg;")
    public class196 field5066;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(ILce;)V", line = 4)
    public static final void method2061(int arg0, class239 arg1) {
        class228.field3773 = arg1.method1665(class197.field3167, (byte) -45);
        if (arg0 != -20294) {
            method2061(-83, (class239) null);
        }
        field5070++;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IIZ)V", line = 15)
    public static final void method2062(int arg0, int arg1, boolean arg2) {
        field5060++;
        class177 var3 = class177.method1310(82, 7, arg1);
        var3.method1302(-20040);
        if (!arg2) {
            field5068 = (class40) null;
        }
        var3.field2908 = arg0;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(I)V", line = 45)
    public static void method2063(int arg0) {
        field5068 = null;
        if (arg0 != 3) {
            field5068 = (class40) null;
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(BI)Lbc;", line = 56)
    public static final class112 method2064(byte arg0, int arg1) {
        field5069++;
        class112 var2 = (class112) class199.field3181.method984(0, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class186.field3005.method1651(arg1, 0, -1);
        if (var3 == null) {
            return null;
        }
        int var4 = 93 / ((arg0 + 77) / 37);
        class112 var5 = new class112();
        class26 var6 = new class26(var3);
        var6.field478 = var6.field472.length - 2;
        int var7 = var6.method197(-1);
        int var8 = var6.field472.length - var7 - 14;
        var6.field478 = var8;
        int var9 = var6.method203(-22066);
        var5.field1944 = var6.method197(-1);
        var5.field1943 = var6.method197(-1);
        var5.field1946 = var6.method197(-1);
        var5.field1939 = var6.method197(-1);
        int var10 = var6.method226(255);
        if (var10 > 0) {
            var5.field1951 = new class199[var10];
            for (int var11 = 0; var11 < var10; var11++) {
                int var12 = var6.method197(-1);
                class199 var13 = new class199(class151.method1130(56, var12));
                var5.field1951[var11] = var13;
                while (var12-- > 0) {
                    int var14 = var6.method203(-22066);
                    int var15 = var6.method203(-22066);
                    var13.method1396(-19928, (long) var14, new class270(var15));
                }
            }
        }
        var6.field478 = 0;
        var5.field1950 = var6.method229(0);
        var5.field1940 = new int[var9];
        var5.field1952 = new int[var9];
        int var16 = 0;
        var5.field1953 = new class40[var9];
        while (var6.field478 < var8) {
            int var17 = var6.method197(-1);
            if (var17 == 3) {
                var5.field1953[var16] = var6.method251((byte) 77);
            } else if (var17 >= 100 || var17 == 21 || var17 == 38 || var17 == 39) {
                var5.field1940[var16] = var6.method226(255);
            } else {
                var5.field1940[var16] = var6.method203(-22066);
            }
            var5.field1952[var16++] = var17;
        }
        class199.field3181.method982(var5, (long) arg1, (byte) 79);
        return var5;
    }
}
