import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qp")
public class class395 {

    @OriginalMember(owner = "client!qp", name = "b", descriptor = "Lng;")
    public static class190 field5772 = new class190(50);

    @OriginalMember(owner = "client!qp", name = "g", descriptor = "[[I")
    public static int[][] field5777 = new int[128][128];

    @OriginalMember(owner = "client!qp", name = "i", descriptor = "I")
    public static int field5779 = 0;

    @OriginalMember(owner = "client!qp", name = "h", descriptor = "[I")
    public static int[] field5778 = new int[32];

    @OriginalMember(owner = "client!qp", name = "f", descriptor = "Lng;")
    public static class190 field5776 = new class190(64);

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "I")
    public static int field5771;

    @OriginalMember(owner = "client!qp", name = "c", descriptor = "I")
    public static int field5773;

    @OriginalMember(owner = "client!qp", name = "d", descriptor = "I")
    public static int field5774;

    @OriginalMember(owner = "client!qp", name = "e", descriptor = "I")
    public static int field5775;

    @OriginalMember(owner = "client!qp", name = "j", descriptor = "I")
    public static int field5780;

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(IIZILjava/lang/String;)V")
    public static final void method2562(int arg0, int arg1, boolean arg2, int arg3, String arg4) {
        field5771++;
        class383 var5 = class315.method2010(arg1, arg0, -27590);
        if (var5 == null) {
            return;
        }
        if (var5.field5489 != null) {
            class410 var6 = new class410();
            var6.field5958 = arg3;
            var6.field5950 = arg4;
            var6.field5961 = var5.field5489;
            var6.field5946 = var5;
            class111.method738(var6);
        }
        boolean var7 = arg2;
        if (var5.field5480 > 0) {
            var7 = class308.method1955(-54, var5);
        }
        if (!var7 || !client.method1119(var5).method1643(arg3 - 1, -127)) {
            return;
        }
        if (arg3 == 1) {
            class442.field6400.method158((byte) 7, 28);
            class227.field3035++;
            class442.field6400.method2386(arg1, 19324);
            class442.field6400.method2416(22064, arg0);
        }
        if (arg3 == 2) {
            class442.field6400.method158((byte) 7, 31);
            class386.field5633++;
            class442.field6400.method2386(arg1, 19324);
            class442.field6400.method2416(22064, arg0);
        }
        if (arg3 == 3) {
            class322.field4415++;
            class442.field6400.method158((byte) 7, 80);
            class442.field6400.method2386(arg1, 19324);
            class442.field6400.method2416(22064, arg0);
        }
        if (arg3 == 4) {
            class439.field6367++;
            class442.field6400.method158((byte) 7, 224);
            class442.field6400.method2386(arg1, 19324);
            class442.field6400.method2416(22064, arg0);
        }
        if (arg3 == 5) {
            class307.field4210++;
            class442.field6400.method158((byte) 7, 32);
            class442.field6400.method2386(arg1, 19324);
            class442.field6400.method2416(22064, arg0);
        }
        if (arg3 == 6) {
            class307.field4214++;
            class442.field6400.method158((byte) 7, 53);
            class442.field6400.method2386(arg1, 19324);
            class442.field6400.method2416(22064, arg0);
        }
        if (arg3 == 7) {
            class442.field6400.method158((byte) 7, 219);
            class331.field4491++;
            class442.field6400.method2386(arg1, 19324);
            class442.field6400.method2416(22064, arg0);
        }
        if (arg3 == 8) {
            class207.field2800++;
            class442.field6400.method158((byte) 7, 254);
            class442.field6400.method2386(arg1, 19324);
            class442.field6400.method2416(22064, arg0);
        }
        if (arg3 == 9) {
            class260.field3564++;
            class442.field6400.method158((byte) 7, 33);
            class442.field6400.method2386(arg1, 19324);
            class442.field6400.method2416(22064, arg0);
        }
        if (arg3 == 10) {
            class442.field6400.method158((byte) 7, 3);
            class3.field34++;
            class442.field6400.method2386(arg1, 19324);
            class442.field6400.method2416(22064, arg0);
        }
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(B)V")
    public static final void method2563(byte arg0) {
        if (arg0 < 102) {
            field5780 = 110;
        }
        field5774++;
        class181.field2524.method1243(1000);
    }

    @OriginalMember(owner = "client!qp", name = "b", descriptor = "(B)V")
    public static void method2564(byte arg0) {
        field5772 = null;
        int var1 = -80 % ((arg0 - 58) / 33);
        field5777 = null;
        field5776 = null;
        field5778 = null;
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(II)Ljava/lang/String;")
    public static final String method2565(int arg0, int arg1) {
        field5775++;
        if (arg1 < 100000) {
            return "<col=ffff00>" + arg1 + "</col>";
        } else if (arg0 > arg1) {
            return "<col=ffffff>" + arg1 / 1000 + class13.field160 + "</col>";
        } else {
            return "<col=00ff80>" + arg1 / 1000000 + class127.field1784 + "</col>";
        }
    }
}
