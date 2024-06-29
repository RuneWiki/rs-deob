import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public class class500 extends class13 {

    @OriginalMember(owner = "client!lm", name = "y", descriptor = "D")
    public double field6981;

    @OriginalMember(owner = "client!lm", name = "E", descriptor = "[[S")
    public short[][] field6987;

    @OriginalMember(owner = "client!lm", name = "z", descriptor = "I")
    public static int field6982 = 0;

    @OriginalMember(owner = "client!lm", name = "F", descriptor = "[I")
    public static int[] field6988 = new int[2];

    @OriginalMember(owner = "client!lm", name = "D", descriptor = "D")
    public static double field6986;

    @OriginalMember(owner = "client!lm", name = "C", descriptor = "F")
    public static float field6985;

    @OriginalMember(owner = "client!lm", name = "w", descriptor = "I")
    public static int field6979;

    @OriginalMember(owner = "client!lm", name = "x", descriptor = "I")
    public static int field6980;

    @OriginalMember(owner = "client!lm", name = "A", descriptor = "I")
    public static int field6983;

    @OriginalMember(owner = "client!lm", name = "B", descriptor = "I")
    public static int field6984;

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(I[Lat;I)V", line = 5)
    public static final void method2947(int arg0, class378[] arg1, int arg2) {
        if (arg2 != 24235) {
            return;
        }
        for (int var3 = 0; var3 < arg1.length; var3++) {
            class378 var4 = arg1[var3];
            if (var4 != null && var4.field5510 == arg0 && !client.method1982(var4)) {
                if (var4.field5450 == 0) {
                    method2947(var4.field5506, arg1, 24235);
                    if (var4.field5474 != null) {
                        method2947(var4.field5506, var4.field5474, arg2);
                    }
                    class432 var5 = (class432) class323.field4473.method1465((long) var4.field5506, -6008);
                    if (var5 != null) {
                        class165.method1246(var5.field6181, (byte) 116);
                    }
                }
                if (var4.field5450 == 6 && var4.field5375 != -1) {
                    class691 var6 = class456.field6436.method1021(var4.field5375, 7);
                    if (var6 != null) {
                        var4.field5517 += class322.field4464;
                        int var7 = var4.field5471;
                        while (var4.field5517 > var6.field9357[var4.field5471]) {
                            var4.field5517 -= var6.field9357[var4.field5471];
                            var4.field5471++;
                            if (var4.field5471 >= var6.field9327.length) {
                                var4.field5471 -= var6.field9328;
                                if (var4.field5471 < 0 || var6.field9327.length <= var4.field5471) {
                                    var4.field5471 = 0;
                                }
                            }
                            var4.field5406 = var4.field5471 + 1;
                            if (var6.field9327.length <= var4.field5406) {
                                var4.field5406 -= var6.field9328;
                                if (var4.field5406 < 0 || var4.field5406 >= var6.field9327.length) {
                                    var4.field5406 = -1;
                                }
                            }
                            class296.method1945(-9343, var4);
                        }
                        if (var4.field5471 != var7) {
                            class231.method1609(var4.field5471, var6, 98);
                        }
                    }
                }
            }
        }
        field6983++;
    }

    @OriginalMember(owner = "client!lm", name = "e", descriptor = "(B)V", line = 109)
    public static void method2948(byte arg0) {
        if (arg0 != 2) {
            field6980 = 63;
        }
        field6988 = null;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(I)J", line = 121)
    public final long method2949(int arg0) {
        if (arg0 < 76) {
            field6984 = 111;
        }
        field6979++;
        return (long) (this.field6987.length << 0 | this.field6987[0].length);
    }

    @OriginalMember(owner = "client!lm", name = "<init>", descriptor = "([[SD)V", line = 132)
    public class500(short[][] arg0, double arg1) {
        this.field6981 = arg1;
        this.field6987 = arg0;
    }
}
