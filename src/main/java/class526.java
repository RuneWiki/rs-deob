import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class526 implements class350 {

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "I")
    public int field7343;

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "Lkg;")
    public static class275 field7344 = new class275(18, -1);

    @OriginalMember(owner = "client!sf", name = "g", descriptor = "Z")
    public static boolean field7347 = true;

    @OriginalMember(owner = "client!sf", name = "h", descriptor = "Z")
    public static boolean field7348 = true;

    @OriginalMember(owner = "client!sf", name = "f", descriptor = "Lkg;")
    public static class275 field7346 = new class275(64, 6);

    @OriginalMember(owner = "client!sf", name = "i", descriptor = "I")
    public static int field7349 = -1;

    @OriginalMember(owner = "client!sf", name = "k", descriptor = "I")
    public static int field7351 = 0;

    @OriginalMember(owner = "client!sf", name = "j", descriptor = "[Lje;")
    public static class405[] field7350 = new class405[4];

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "I")
    public static int field7341;

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "I")
    public static int field7342;

    @OriginalMember(owner = "client!sf", name = "e", descriptor = "I")
    public static int field7345;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(BIIIIZ)V", line = 10)
    public static final void method3042(byte arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg2 < 1) {
            arg2 = 1;
        }
        if (arg1 < 1) {
            arg1 = 1;
        }
        if (arg0 > -106) {
            return;
        }
        field7345++;
        int var6 = arg2 - 334;
        if (var6 < 0) {
            var6 = 0;
        } else if (var6 > 100) {
            var6 = 100;
        }
        int var7 = class96.field1336 + ((class292.field3853 - class96.field1336) * var6 / 100);
        if (class83.field1138 > var7) {
            var7 = class83.field1138;
        } else if (var7 > class86.field1194) {
            var7 = class86.field1194;
        }
        int var8 = arg2 * 512 * var7 / (arg1 * 334);
        if (class335.field4257 > var8) {
            short var12 = class335.field4257;
            var7 = arg1 * 334 * var12 / (arg2 * 512);
            if (class86.field1194 < var7) {
                var7 = class86.field1194;
                int var13 = arg2 * var7 * 512 / (var12 * 334);
                int var14 = (arg1 - var13) / 2;
                if (arg5) {
                    class386.field4930.method446();
                    class386.field4930.method544(-16777216, arg2, arg3, 18553, var14, arg4);
                    class386.field4930.method544(-16777216, arg2, arg1 + arg3 - var14, 18553, var14, arg4);
                }
                arg1 -= var14 * 2;
                arg3 += var14;
            }
        } else if (var8 > class180.field2532) {
            short var9 = class180.field2532;
            var7 = var9 * 334 * arg1 / (arg2 * 512);
            if (class83.field1138 > var7) {
                var7 = class83.field1138;
                int var10 = arg1 * 334 * var9 / (var7 * 512);
                int var11 = (arg2 - var10) / 2;
                if (arg5) {
                    class386.field4930.method446();
                    class386.field4930.method544(-16777216, var11, arg3, 18553, arg1, arg4);
                    class386.field4930.method544(-16777216, var11, arg3, 18553, arg1, arg2 + arg4 - var11);
                }
                arg4 += var11;
                arg2 -= var11 * 2;
            }
        }
        class321.field4144 = (short) arg2;
        class162.field2229 = arg3;
        class173.field2386 = (short) arg1;
        class111.field1608 = arg4;
        class555.field7731 = arg2 * var7 / 334;
    }

    @OriginalMember(owner = "client!sf", name = "toString", descriptor = "()Ljava/lang/String;", line = 102)
    public final String toString() {
        field7341++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(B)V", line = 112)
    public static void method3043(byte arg0) {
        field7350 = null;
        field7346 = null;
        int var1 = 80 / ((-arg0 - 38) / 61);
        field7344 = null;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(II)V", line = 124)
    public static final void method3044(int arg0, int arg1) {
        if (arg0 != -1) {
            method3043((byte) -79);
        }
        field7342++;
        if (class468.field6275 == 1) {
            class456.field6076 = arg1;
        } else if (class468.field6275 == 2) {
            class117.field1727 = arg1;
        }
    }

    @OriginalMember(owner = "client!sf", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 149)
    public class526(String arg0, int arg1) {
        this.field7343 = arg1;
    }
}
