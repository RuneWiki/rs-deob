import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class376 {

    @OriginalMember(owner = "client!dg", name = "e", descriptor = "I")
    public int field5354;

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "I")
    private int field5352;

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "[Lrc;")
    public static class498[] field5351 = new class498[8];

    @OriginalMember(owner = "client!dg", name = "h", descriptor = "Z")
    public static boolean field5357 = false;

    @OriginalMember(owner = "client!dg", name = "d", descriptor = "Lnea;")
    public static class664 field5353 = new class664(61, 3);

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "I")
    public static int field5350;

    @OriginalMember(owner = "client!dg", name = "f", descriptor = "I")
    public static int field5355;

    @OriginalMember(owner = "client!dg", name = "g", descriptor = "I")
    public static int field5356;

    @OriginalMember(owner = "client!dg", name = "i", descriptor = "I")
    public static int field5358;

    @OriginalMember(owner = "client!dg", name = "j", descriptor = "I")
    public static int field5359;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(Ljava/lang/String;CI)I")
    public static final int method2263(String arg0, char arg1, int arg2) {
        if (arg2 < 107) {
            return -15;
        }
        field5358++;
        int var3 = 0;
        int var4 = arg0.length();
        for (int var5 = 0; var5 < var4; var5++) {
            if (arg0.charAt(var5) == arg1) {
                var3++;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!dg", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field5356++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(I)I")
    public final int method2264(int arg0) {
        field5355++;
        if (arg0 != 8) {
            this.field5352 = -91;
        }
        return this.field5352;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IILjava/lang/String;Ljava/lang/String;BLjava/lang/String;Ljava/lang/String;)V")
    public static final void method2265(int arg0, int arg1, String arg2, String arg3, byte arg4, String arg5, String arg6) {
        class304.method1942(arg1, (byte) 110, arg3, arg5, arg2, arg6, arg0, null, -1);
        field5350++;
        if (arg4 >= -118) {
            field5351 = null;
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(B)V")
    public static void method2266(byte arg0) {
        field5351 = null;
        int var1 = 76 % ((38 - arg0) / 58);
        field5353 = null;
    }

    @OriginalMember(owner = "client!dg", name = "<init>", descriptor = "(II)V")
    public class376(int arg0, int arg1) {
        this.field5354 = arg1;
        this.field5352 = arg0;
    }
}
