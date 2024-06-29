import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hm")
public class class186 {

    @OriginalMember(owner = "client!hm", name = "e", descriptor = "I")
    public int field2609 = -1;

    @OriginalMember(owner = "client!hm", name = "b", descriptor = "I")
    public static int field2606;

    @OriginalMember(owner = "client!hm", name = "d", descriptor = "I")
    public static int field2608;

    @OriginalMember(owner = "client!hm", name = "f", descriptor = "I")
    public static int field2610;

    @OriginalMember(owner = "client!hm", name = "h", descriptor = "I")
    public static int field2612;

    @OriginalMember(owner = "client!hm", name = "c", descriptor = "Lfh;")
    public class560 field2607;

    @OriginalMember(owner = "client!hm", name = "g", descriptor = "[I")
    public int[] field2611;

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "[Ljava/lang/String;")
    public String[] field2605;

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(I)V")
    public static final void method1158(int arg0) {
        if (arg0 == -1) {
            field2610++;
            class494.field6919.method1334(class571.field7877, class491.field6875.field3346 ? class215.field3071 + 256 << 0 : -1, 256);
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(Ljava/lang/String;B)I")
    public static final int method1159(String arg0, byte arg1) {
        field2608++;
        for (int var2 = 0; var2 < class207.field2908.length; var2++) {
            if (class207.field2908[var2].equalsIgnoreCase(arg0)) {
                return var2;
            }
        }
        int var3 = -17 % ((arg1 + 44) / 44);
        return -1;
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(B)I")
    public static final int method1160(byte arg0) {
        field2606++;
        class207 var1 = class69.field1165;
        boolean var2 = false;
        if (class103.field1570 != 0) {
            Canvas var3 = new Canvas();
            var3.setSize(100, 100);
            var2 = true;
            var1 = class207.method1358(0, var3, -14968, 0, null, null);
        }
        long var4 = class488.method2835(30160);
        int var6 = 0;
        if (arg0 != -76) {
            return 28;
        }
        while (var6 < 10000) {
            var1.method1341(5, 10, 75, 50, 15, 90, -65536, -65536, -65536, 1);
            var6++;
        }
        int var7 = (int) (class488.method2835(30160) - var4);
        var1.method1368(0, 100, 100, -16777216, 0, (byte) -16);
        if (var2) {
            var1.method1284((byte) -70);
        }
        return var7;
    }
}
