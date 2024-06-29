import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public abstract class class422 {

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "J")
    public static long field6372 = 0L;

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "I")
    public static int field6375 = 0;

    @OriginalMember(owner = "client!ed", name = "f", descriptor = "[I")
    public static int[] field6377 = new int[5];

    @OriginalMember(owner = "client!ed", name = "g", descriptor = "Lvv;")
    public static class313 field6378 = new class313(79, 8);

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "I")
    public static int field6373;

    @OriginalMember(owner = "client!ed", name = "e", descriptor = "I")
    public static int field6376;

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "Ljava/awt/Frame;")
    public static Frame field6374;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(ZZLjava/lang/String;)V")
    public static final void method2589(boolean arg0, boolean arg1, String arg2) {
        field6373++;
        class490.field7161.field7274 = 1;
        String var3 = arg2.toLowerCase();
        short[] var4 = new short[16];
        int var5 = 0;
        int var6 = 0;
        if (!arg0) {
            method2590(83);
        }
        while (var6 < class20.field218.field5385) {
            class104 var9 = class20.field218.method2221(var6, -1);
            if ((!arg1 || var9.field1724) && var9.field1776 == -1 && var9.field1761 == -1 && var9.field1710 == 0 && var9.field1771.toLowerCase().indexOf(var3) != -1) {
                if (var5 >= 250) {
                    class71.field1233 = -1;
                    class255.field4323 = null;
                    return;
                }
                if (var5 >= var4.length) {
                    short[] var10 = new short[var4.length * 2];
                    for (int var11 = 0; var11 < var5; var11++) {
                        var10[var11] = var4[var11];
                    }
                    var4 = var10;
                }
                var4[var5++] = (short) var6;
            }
            var6++;
        }
        class142.field2342 = 0;
        class255.field4323 = var4;
        class71.field1233 = var5;
        String[] var7 = new String[class71.field1233];
        for (int var8 = 0; var8 < class71.field1233; var8++) {
            var7[var8] = class20.field218.method2221(var4[var8], -1).field1771;
        }
        class503.method2970(357232963, class255.field4323, var7);
        class490.field7161.method2932(0);
        class490.field7161.field7274 = 2;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(I)V")
    public static void method2590(int arg0) {
        if (arg0 != 17065) {
            method2590(-82);
        }
        field6374 = null;
        field6377 = null;
        field6378 = null;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lns;I)Lns;")
    public abstract class441 method2591(class441 arg0, int arg1);
}
