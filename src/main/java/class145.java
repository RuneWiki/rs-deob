import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class145 extends class29 {

    @OriginalMember(owner = "client!mb", name = "H", descriptor = "[Lod;")
    public class292[] field2353;

    @OriginalMember(owner = "client!mb", name = "A", descriptor = "[I")
    public static int[] field2347 = new int[25];

    @OriginalMember(owner = "client!mb", name = "F", descriptor = "I")
    public static int field2351 = 0;

    @OriginalMember(owner = "client!mb", name = "I", descriptor = "I")
    public static int field2354 = -1;

    @OriginalMember(owner = "client!mb", name = "K", descriptor = "I")
    public static int field2356 = 0;

    @OriginalMember(owner = "client!mb", name = "E", descriptor = "Z")
    public static boolean field2350 = false;

    @OriginalMember(owner = "client!mb", name = "C", descriptor = "I")
    public static int field2348;

    @OriginalMember(owner = "client!mb", name = "D", descriptor = "I")
    public static int field2349;

    @OriginalMember(owner = "client!mb", name = "M", descriptor = "I")
    public static int field2358;

    @OriginalMember(owner = "client!mb", name = "G", descriptor = "Lph;")
    public static class229 field2352;

    @OriginalMember(owner = "client!mb", name = "L", descriptor = "Lsl;")
    public static class283 field2357;

    @OriginalMember(owner = "client!mb", name = "J", descriptor = "[Lka;")
    public static class293[] field2355;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(II)Z", line = 35)
    public final boolean method1069(int arg0, int arg1) {
        if (arg0 != 255) {
            field2355 = (class293[]) null;
        }
        field2349++;
        return this.field2353[arg1].field4779;
    }

    @OriginalMember(owner = "client!mb", name = "g", descriptor = "(I)V", line = 48)
    public static final void method1070(int arg0) {
        if (arg0 < -117) {
            field2348++;
            class232.field3838.method1415(-18218);
        }
    }

    @OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(Lsi;Lsi;IZ)V", line = 65)
    public class145(class66 arg0, class66 arg1, int arg2, boolean arg3) {
        class227 var5 = new class227();
        int var6 = arg0.method517((byte) -126, arg2);
        this.field2353 = new class292[var6];
        int[] var7 = arg0.method524(arg2, 111);
        for (int var8 = 0; var8 < var7.length; var8++) {
            class192 var9 = null;
            byte[] var10 = arg0.method523(-23, var7[var8], arg2);
            int var11 = (var10[0] & 0xFF) << 8 | var10[1] & 0xFF;
            for (class192 var12 = (class192) var5.method1580((byte) -39); var12 != null; var12 = (class192) var5.method1579((byte) 28)) {
                if (var12.field3185 == var11) {
                    var9 = var12;
                    break;
                }
            }
            if (var9 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method507(var11, 0, false);
                } else {
                    var13 = arg1.method507(0, var11, false);
                }
                var9 = new class192(var11, var13);
                var5.method1582(var9, 4);
            }
            this.field2353[var7[var8]] = new class292(var10, var9);
        }
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(Z)V", line = 130)
    public static void method1071(boolean arg0) {
        field2352 = null;
        field2347 = null;
        field2357 = null;
        if (arg0) {
            field2357 = (class283) null;
        }
        field2355 = null;
    }
}
