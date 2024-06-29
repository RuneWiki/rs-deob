import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class116 {

    @OriginalMember(owner = "client!m", name = "a", descriptor = "Ldd;")
    public static class35 field2589 = class180.method1196((byte) 127, "mapfunction");

    @OriginalMember(owner = "client!m", name = "b", descriptor = "I")
    public static int field2590 = 50;

    @OriginalMember(owner = "client!m", name = "d", descriptor = "I")
    public static int field2592;

    @OriginalMember(owner = "client!m", name = "e", descriptor = "I")
    public static int field2593;

    @OriginalMember(owner = "client!m", name = "f", descriptor = "I")
    public static int field2594;

    @OriginalMember(owner = "client!m", name = "c", descriptor = "[I")
    public static int[] field2591;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IJIB)Z")
    public static final boolean method841(int arg0, long arg1, int arg2, byte arg3) {
        field2594++;
        if (arg3 < 42) {
            method842(-110, (byte) -118, 101);
        }
        int var5 = (int) arg1 >> 14 & 0x1F;
        int var6 = (int) arg1 >> 20 & 0x3;
        int var7 = (int) (arg1 >>> 32) & Integer.MAX_VALUE;
        if (var5 == 10 || var5 == 11 || var5 == 22) {
            class145 var8 = class4.method23((byte) -93, var7);
            int var9;
            int var10;
            if (var6 == 0 || var6 == 2) {
                var10 = var8.field3034;
                var9 = var8.field3017;
            } else {
                var9 = var8.field3034;
                var10 = var8.field3017;
            }
            int var11 = var8.field3020;
            if (var6 != 0) {
                var11 = (var11 >> 4 - var6) + (var11 << var6 & 0xF);
            }
            class55.method476(false, class71.field1704.field1605[0], var10, 0, true, arg0, arg2, 2, 0, class71.field1704.field1603[0], var11, var9);
        } else {
            class55.method476(false, class71.field1704.field1605[0], 0, var5 + 1, true, arg0, arg2, 2, var6, class71.field1704.field1603[0], 0, 0);
        }
        class170.field3399 = class134.field2859;
        class110.field2427 = 2;
        class113.field2535 = 0;
        class131.field2833 = class9.field187;
        return true;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IBI)V")
    public static final void method842(int arg0, byte arg1, int arg2) {
        class1.field11.method659(156, true);
        if (arg1 != 1) {
            field2589 = null;
        }
        field2592++;
        class45.field969++;
        class1.field11.method220((byte) -110, arg0);
        class1.field11.method228(arg2, 15358);
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(I)V")
    public static void method843(int arg0) {
        field2589 = null;
        field2591 = null;
        if (arg0 >= -126) {
            method841(-104, -84L, 113, (byte) -116);
        }
    }
}
