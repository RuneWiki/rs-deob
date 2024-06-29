import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kq")
public class class77 {

    @OriginalMember(owner = "client!kq", name = "g", descriptor = "Z")
    public static boolean field985 = false;

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "I")
    public static int field979;

    @OriginalMember(owner = "client!kq", name = "b", descriptor = "I")
    public static int field980;

    @OriginalMember(owner = "client!kq", name = "c", descriptor = "I")
    public static int field981;

    @OriginalMember(owner = "client!kq", name = "d", descriptor = "I")
    public static int field982;

    @OriginalMember(owner = "client!kq", name = "e", descriptor = "I")
    public static int field983;

    @OriginalMember(owner = "client!kq", name = "f", descriptor = "I")
    public static int field984;

    @OriginalMember(owner = "client!kq", name = "h", descriptor = "I")
    public static int field986;

    @OriginalMember(owner = "client!kq", name = "i", descriptor = "I")
    public static int field987;

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(ZII)V", line = 3)
    public static final void method442(boolean arg0, int arg1, int arg2) {
        field980++;
        class357 var3 = new class357(16);
        for (class237 var4 = (class237) class376.field4885.method2087(0); var4 != null; var4 = (class237) class376.field4885.method2091(-124)) {
            var4.method3021(-122);
            int var5 = (int) (var4.field7456 >> 28);
            int var6 = (int) (var4.field7456 >> 14 & 0x3FFFL) - arg2;
            int var7 = (int) (var4.field7456 & 0x3FFFL) - arg1;
            if (var7 >= 0 && var6 >= 0 && class200.field2594 > var7 && class118.field1647 > var6) {
                var3.method2096((long) (var6 << 14 | var5 << 28 | var7), var4, (byte) 76);
            }
        }
        if (!arg0) {
            field983 = -60;
        }
        class376.field4885 = var3;
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(ID)V", line = 36)
    public static final void method443(int arg0, double arg1) {
        if (class283.field3622 != arg1) {
            for (int var3 = 0; var3 < 256; var3++) {
                int var4 = (int) (Math.pow((double) var3 / 255.0D, arg1) * 255.0D);
                class281.field3595[var3] = var4 > 255 ? 255 : var4;
            }
            class283.field3622 = arg1;
        }
        field984++;
        if (arg0 != 18356) {
            field986 = -107;
        }
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(IIIIB)V", line = 64)
    public static final void method444(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field979++;
        class436 var5 = class459.method2712(10, arg2, -1759243680);
        var5.method2574((byte) 75);
        if (arg4 >= -47) {
            method442(true, -75, -12);
        }
        var5.field5977 = arg3;
        var5.field5979 = arg1;
        var5.field5980 = arg0;
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(I)J", line = 83)
    public static final long method445(int arg0) {
        int var1 = -58 % ((arg0 + 64) / 46);
        field982++;
        return class353.field4530.method301(-1);
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(Ljava/lang/String;Z)I", line = 100)
    public static final int method446(String arg0, boolean arg1) {
        field981++;
        int var2 = arg0.length();
        int var3 = 0;
        if (arg1) {
            method443(-80, -1.1394383771766856D);
        }
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = class355.method2080(arg0.charAt(var4), -8219) + (var3 << 5) - var3;
        }
        return var3;
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(IZIIFIIII)[[I", line = 128)
    public static final int[][] method447(int arg0, boolean arg1, int arg2, int arg3, float arg4, int arg5, int arg6, int arg7, int arg8) {
        field987++;
        int[][] var9 = new int[arg7][arg0];
        class121 var10 = new class121();
        var10.field1679 = arg8;
        var10.field1695 = (int) (arg4 * 4096.0F);
        var10.field1684 = arg5;
        var10.field1678 = arg6;
        var10.field1694 = arg1;
        var10.method390(17);
        class169.method1126(arg7, -1, arg0);
        if (arg3 >= -107) {
            method445(42);
        }
        for (int var11 = 0; var11 < arg7; var11++) {
            var10.method769(var11, var9[var11], (byte) -115);
        }
        return var9;
    }
}
