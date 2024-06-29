import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public class class140 {

    @OriginalMember(owner = "client!uj", name = "d", descriptor = "[Lnh;")
    private class115[] field2547;

    @OriginalMember(owner = "client!uj", name = "c", descriptor = "Lhc;")
    public static class171 field2546 = new class171(64);

    @OriginalMember(owner = "client!uj", name = "f", descriptor = "Z")
    public static boolean field2549 = false;

    @OriginalMember(owner = "client!uj", name = "i", descriptor = "Lud;")
    public static class279 field2552 = class130.method1024(")3", 255);

    @OriginalMember(owner = "client!uj", name = "l", descriptor = "Lud;")
    private static class279 field2555 = class130.method1024("Allocated memory", 255);

    @OriginalMember(owner = "client!uj", name = "h", descriptor = "Lud;")
    public static class279 field2551 = field2555;

    @OriginalMember(owner = "client!uj", name = "k", descriptor = "I")
    public static int field2554 = 0;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "I")
    public static int field2544;

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "I")
    public static int field2545;

    @OriginalMember(owner = "client!uj", name = "e", descriptor = "I")
    public static int field2548;

    @OriginalMember(owner = "client!uj", name = "j", descriptor = "I")
    public static int field2553;

    @OriginalMember(owner = "client!uj", name = "g", descriptor = "[S")
    public static short[] field2550;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IB)[B", line = 16)
    public static final byte[] method1080(int arg0, byte arg1) {
        class240 var2 = (class240) class185.field3391.method1767((byte) -37, (long) arg0);
        if (var2 == null) {
            byte[] var3 = new byte[512];
            Random var4 = new Random((long) arg0);
            for (int var5 = 0; var5 < 255; var5++) {
                var3[var5] = (byte) var5;
            }
            for (int var6 = 0; var6 < 255; var6++) {
                int var7 = 255 - var6;
                int var8 = class133.method1041(var4, var7, 10061);
                byte var9 = var3[var8];
                var3[var8] = var3[var7];
                var3[var7] = var3[511 - var6] = var9;
            }
            var2 = new class240(var3);
            class185.field3391.method1771(2, (long) arg0, var2);
        }
        field2548++;
        return arg1 > -111 ? (byte[]) null : var2.field4225;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(ZI)V", line = 63)
    public static final void method1081(boolean arg0, int arg1) {
        if (arg1 <= 25) {
            return;
        }
        for (class52 var2 = (class52) class322.field5623.method2248(110); var2 != null; var2 = (class52) class322.field5623.method2240(1138)) {
            if (var2.field1083 != null) {
                class322.field5630.method1957(var2.field1083);
                var2.field1083 = null;
            }
            if (var2.field1096 != null) {
                class322.field5630.method1957(var2.field1096);
                var2.field1096 = null;
            }
            var2.method2221(true);
        }
        field2544++;
        if (!arg0) {
            return;
        }
        for (class52 var3 = (class52) class60.field1263.method2248(-91); var3 != null; var3 = (class52) class60.field1263.method2240(1138)) {
            if (var3.field1083 != null) {
                class322.field5630.method1957(var3.field1083);
                var3.field1083 = null;
            }
            var3.method2221(true);
        }
        for (class52 var4 = (class52) class15.field438.method609(-26368); var4 != null; var4 = (class52) class15.field438.method604(2)) {
            if (var4.field1083 != null) {
                class322.field5630.method1957(var4.field1083);
                var4.field1083 = null;
            }
            var4.method2221(true);
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(I)V", line = 132)
    public static void method1082(int arg0) {
        field2552 = null;
        field2546 = null;
        field2550 = null;
        field2555 = null;
        int var1 = -24 / ((arg0 + 48) / 60);
        field2551 = null;
    }

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "(I)I", line = 153)
    public static final int method1083(int arg0) {
        field2545++;
        if ((double) class183.field3356 == 3.0D) {
            return 37;
        } else if ((double) class183.field3356 == 4.0D) {
            return 50;
        } else if (arg0 != 255) {
            return 23;
        } else if ((double) class183.field3356 == 6.0D) {
            return 75;
        } else if ((double) class183.field3356 == 8.0D) {
            return 100;
        } else {
            return 200;
        }
    }

    @OriginalMember(owner = "client!uj", name = "<init>", descriptor = "(I)V", line = 218)
    public class140(int arg0) {
        this.field2547 = new class115[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class115 var3 = this.field2547[var2] = new class115();
            var3.field2105 = var3;
            var3.field2094 = var3;
        }
    }
}
