import java.awt.Image;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class175 extends class183 {

    @OriginalMember(owner = "client!od", name = "w", descriptor = "[B")
    public byte[] field2387;

    @OriginalMember(owner = "client!od", name = "q", descriptor = "[I")
    public static int[] field2381 = new int[5];

    @OriginalMember(owner = "client!od", name = "r", descriptor = "Ljava/lang/String;")
    public static String field2382 = "Loading - please wait.";

    @OriginalMember(owner = "client!od", name = "n", descriptor = "I")
    public static int field2378 = 0;

    @OriginalMember(owner = "client!od", name = "m", descriptor = "Ljava/lang/String;")
    public static String field2377 = "glow1:";

    @OriginalMember(owner = "client!od", name = "o", descriptor = "I")
    public static int field2379;

    @OriginalMember(owner = "client!od", name = "p", descriptor = "I")
    public static int field2380;

    @OriginalMember(owner = "client!od", name = "s", descriptor = "I")
    public static int field2383;

    @OriginalMember(owner = "client!od", name = "u", descriptor = "I")
    public static int field2385;

    @OriginalMember(owner = "client!od", name = "v", descriptor = "I")
    public static int field2386;

    @OriginalMember(owner = "client!od", name = "t", descriptor = "Ljava/awt/Image;")
    public static Image field2384;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IIIIZI)V", line = 6)
    public static final void method1215(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        field2386++;
        if (!arg4) {
            method1215(-80, 77, -62, 21, false, 32);
        }
        int var6 = class185.method1299(arg0, (byte) 108, class44.field536, class101.field1397);
        int var7 = class185.method1299(arg3, (byte) 111, class44.field536, class101.field1397);
        int var8 = class185.method1299(arg1, (byte) 113, class259.field3813, class206.field2952);
        int var9 = class185.method1299(arg5, (byte) 111, class259.field3813, class206.field2952);
        for (int var10 = var6; var10 <= var7; var10++) {
            class190.method1329(class126.field1723[var10], var9, arg2, (byte) -90, var8);
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Lcg;I)Ljava/lang/String;", line = 39)
    public static final String method1216(class316 arg0, int arg1) {
        field2385++;
        int var2 = -11 % ((arg1 + 27) / 42);
        return class333.method2317(arg0, 32767, -115);
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(BLjava/util/Random;I)I", line = 66)
    public static final int method1217(byte arg0, Random arg1, int arg2) {
        field2380++;
        if (arg2 <= 0) {
            throw new IllegalArgumentException();
        } else if (class343.method2364((byte) 64, arg2)) {
            return (int) ((long) arg2 * ((long) arg1.nextInt() & 0xFFFFFFFFL) >> 32);
        } else {
            if (arg0 < 58) {
                field2378 = -99;
            }
            int var3 = Integer.MIN_VALUE - ((int) (4294967296L % (long) arg2));
            int var4;
            do {
                var4 = arg1.nextInt();
            } while (var4 >= var3);
            return class340.method2349(arg2, var4, (byte) -96);
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(I)V", line = 107)
    public static void method1218(int arg0) {
        field2384 = null;
        field2382 = null;
        field2381 = null;
        field2377 = null;
        if (arg0 != 11912) {
            method1215(77, 17, 56, -119, true, -8);
        }
    }

    @OriginalMember(owner = "client!od", name = "<init>", descriptor = "([B)V", line = 122)
    public class175(byte[] arg0) {
        this.field2387 = arg0;
    }
}
