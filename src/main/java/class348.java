import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class348 {

    @OriginalMember(owner = "client!pj", name = "h", descriptor = "I")
    public int field5379 = -1;

    @OriginalMember(owner = "client!pj", name = "i", descriptor = "I")
    public int field5380 = -1;

    @OriginalMember(owner = "client!pj", name = "g", descriptor = "I")
    public static int field5378 = 100;

    @OriginalMember(owner = "client!pj", name = "e", descriptor = "I")
    public static int field5376 = 0;

    @OriginalMember(owner = "client!pj", name = "k", descriptor = "[I")
    public static int[] field5382 = new int[2];

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "F")
    public static float field5372;

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "I")
    public static int field5373;

    @OriginalMember(owner = "client!pj", name = "d", descriptor = "I")
    public static int field5375;

    @OriginalMember(owner = "client!pj", name = "f", descriptor = "I")
    public static int field5377;

    @OriginalMember(owner = "client!pj", name = "j", descriptor = "I")
    public static int field5381;

    @OriginalMember(owner = "client!pj", name = "l", descriptor = "I")
    public static int field5383;

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "[I")
    public int[] field5374;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(BI)V", line = 9)
    public static final void method2441(byte arg0, int arg1) {
        field5383++;
        if (arg0 > 121) {
            class117.field1661.method464(3398, arg1);
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(BILsb;)V", line = 22)
    public final void method2442(byte arg0, int arg1, class190 arg2) {
        if (arg0 <= 124) {
            field5378 = -56;
        }
        field5373++;
        while (true) {
            int var4 = arg2.method1319(255);
            if (var4 == 0) {
                return;
            }
            this.method2444((byte) 108, arg1, arg2, var4);
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IZBII)V", line = 53)
    public static final void method2443(int arg0, boolean arg1, byte arg2, int arg3, int arg4) {
        field5375++;
        class150.field2186 = 0L;
        int var5 = class89.method706(-12311);
        if (arg4 == 3 || var5 == 3) {
            arg1 = true;
        }
        if (class61.field887.startsWith("mac") && arg4 > 0) {
            arg1 = true;
        }
        boolean var6 = false;
        if (arg2 >= -43) {
            method2445((byte) 50);
        }
        if (var5 <= 0 != arg4 <= 0) {
            var6 = true;
        }
        if (arg1 && arg4 > 0) {
            var6 = true;
        }
        class109.method832(var5, 0, arg1, var6, arg0, arg4, arg3);
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(BILsb;I)V", line = 98)
    private final void method2444(byte arg0, int arg1, class190 arg2, int arg3) {
        int var5 = 73 / ((arg0 + 39) / 32);
        field5381++;
        if (arg3 == 1) {
            this.field5380 = arg2.method1317((byte) 113);
        } else if (arg3 == 2) {
            this.field5374 = new int[arg2.method1319(255)];
            for (int var6 = 0; var6 < this.field5374.length; var6++) {
                this.field5374[var6] = arg2.method1317((byte) 52);
            }
        } else if (arg3 == 3) {
            this.field5379 = arg2.method1319(255);
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(B)V", line = 129)
    public static void method2445(byte arg0) {
        if (arg0 < 71) {
            field5376 = -123;
        }
        field5382 = null;
    }
}
