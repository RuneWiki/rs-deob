import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class190 extends InputStream {

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "I")
    public static int field2920 = 0;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "I")
    public static int field2919;

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "I")
    public static int field2921;

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "I")
    public static int field2922;

    @OriginalMember(owner = "client!bd", name = "e", descriptor = "I")
    public static int field2923;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lpf;ZI)Lmc;")
    public static final class201 method1192(class294 arg0, boolean arg1, int arg2) {
        if (arg1) {
            field2921++;
            return class225.method1431(arg2, arg0, (byte) 90) ? class62.method415((byte) -39) : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bd", name = "read", descriptor = "()I")
    public final int read() {
        field2922++;
        class250.method1643(1, 30000L);
        return -1;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lpf;Lpf;ZLpf;)V")
    public static final void method1193(class294 arg0, class294 arg1, boolean arg2, class294 arg3) {
        class237.field3580 = arg0;
        if (arg2) {
            class226.field3392 = arg3;
            field2919++;
            class239.field3596 = arg1;
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(I)Lmc;")
    public static final class201 method1194(int arg0) {
        int var1 = class82.field1312[0] * class220.field3315[0];
        if (arg0 != -10215) {
            field2920 = -113;
        }
        byte[] var2 = class10.field129[0];
        class201 var6;
        if (class101.field1587[0]) {
            byte[] var3 = class198.field3011[0];
            int[] var4 = new int[var1];
            for (int var5 = 0; var5 < var1; var5++) {
                var4[var5] = class63.method428(class94.method598(var3[var5], 255) << 24, class183.field2775[class94.method598(255, var2[var5])]);
            }
            var6 = new class279(class162.field2494, class256.field3915, class10.field139[0], class273.field4104[0], class220.field3315[0], class82.field1312[0], var4);
        } else {
            int[] var7 = new int[var1];
            for (int var8 = 0; var8 < var1; var8++) {
                var7[var8] = class183.field2775[class94.method598(255, var2[var8])];
            }
            var6 = new class201(class162.field2494, class256.field3915, class10.field139[0], class273.field4104[0], class220.field3315[0], class82.field1312[0], var7);
        }
        class82.method537(0);
        field2923++;
        return var6;
    }
}
