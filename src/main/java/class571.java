import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!us")
public class class571 {

    @OriginalMember(owner = "client!us", name = "a", descriptor = "I")
    public static int field7978;

    @OriginalMember(owner = "client!us", name = "b", descriptor = "I")
    public static int field7979;

    @OriginalMember(owner = "client!us", name = "d", descriptor = "I")
    public static int field7981;

    @OriginalMember(owner = "client!us", name = "e", descriptor = "I")
    public static int field7982;

    @OriginalMember(owner = "client!us", name = "f", descriptor = "I")
    public static int field7983;

    @OriginalMember(owner = "client!us", name = "c", descriptor = "Lla;")
    public static class413 field7980;

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(I)J")
    public static final synchronized long method3150(int arg0) {
        field7979++;
        long var1 = System.currentTimeMillis();
        if (arg0 <= 88) {
            return 1L;
        }
        if (class638.field8955 > var1) {
            class58.field816 += class638.field8955 - var1;
        }
        class638.field8955 = var1;
        return var1 + class58.field816;
    }

    @OriginalMember(owner = "client!us", name = "b", descriptor = "(I)V")
    public static void method3151(int arg0) {
        if (arg0 != -28376) {
            method3154(-81, null);
        }
        field7980 = null;
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(IJ)V")
    public static final void method3152(int arg0, long arg1) {
        field7978++;
        class704 var3 = class573.method3163(-111);
        var3.field9929.method3509(class350.field4477.field2831, (byte) -115);
        var3.field9929.method3494(arg1, -16719);
        if (arg0 > -105) {
            field7980 = null;
        }
        var3.field9929.method3509(class250.field3068, (byte) -121);
        class122.method654(var3, (byte) -36);
        class279.field3503 = 0;
        class290.field3618 = 0;
        class76.field1046 = -3;
        class82.field1097 = 1;
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "([Lkp;IZ)V")
    public static final void method3153(class507[] arg0, int arg1, boolean arg2) {
        field7981++;
        if (arg2) {
            return;
        }
        for (int var3 = 0; var3 < arg0.length; var3++) {
            class507 var4 = arg0[var3];
            if (var4 != null) {
                if (var4.field6735 == 0) {
                    if (var4.field6707 != null) {
                        method3153(var4.field6707, arg1, false);
                    }
                    class340 var5 = (class340) class138.field1797.method399(-32748, (long) var4.field6764);
                    if (var5 != null) {
                        class106.method603(-1630137275, var5.field4392, arg1);
                    }
                }
                if (arg1 == 0 && var4.field6835 != null) {
                    class71 var6 = new class71();
                    var6.field963 = var4.field6835;
                    var6.field952 = var4;
                    class197.method1191(var6);
                }
                if (arg1 == 1 && var4.field6839 != null) {
                    if (var4.field6834 >= 0) {
                        class507 var7 = class156.method894(-1018745488, var4.field6764);
                        if (var7 == null || var7.field6707 == null || var4.field6834 >= var7.field6707.length || var7.field6707[var4.field6834] != var4) {
                            continue;
                        }
                    }
                    class71 var8 = new class71();
                    var8.field952 = var4;
                    var8.field963 = var4.field6839;
                    class197.method1191(var8);
                }
            }
        }
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(ILjava/lang/String;)I")
    public static final int method3154(int arg0, String arg1) {
        field7983++;
        if (arg1 == null) {
            return -1;
        }
        for (int var2 = 0; var2 < class66.field904; var2++) {
            if (arg1.equalsIgnoreCase(class50.field708[var2])) {
                return var2;
            }
        }
        if (arg0 != 1) {
            method3150(54);
        }
        return -1;
    }
}
