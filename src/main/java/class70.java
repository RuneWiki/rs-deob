import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public abstract class class70 {

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "I")
    public static int field1247 = 1407;

    @OriginalMember(owner = "client!kl", name = "d", descriptor = "Z")
    public static boolean field1249 = false;

    @OriginalMember(owner = "client!kl", name = "e", descriptor = "[I")
    public static int[] field1250 = new int[] { 25000, 2000 };

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "I")
    public static int field1246;

    @OriginalMember(owner = "client!kl", name = "c", descriptor = "I")
    public static int field1248;

    @OriginalMember(owner = "client!kl", name = "f", descriptor = "I")
    public static int field1251;

    @OriginalMember(owner = "client!kl", name = "h", descriptor = "I")
    public static int field1253;

    @OriginalMember(owner = "client!kl", name = "g", descriptor = "Lf;")
    public static class702 field1252;

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(IIIII)Z", line = 7)
    public static final boolean method680(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1251++;
        if (arg0 != 31530) {
            field1252 = null;
        }
        if (!class202.field2847) {
            return false;
        } else if (class416.field6031 < 100) {
            return false;
        } else if (class252.method1682(arg2, arg3, (byte) 7, arg1)) {
            int var5 = arg3 << class310.field4593;
            int var6 = arg1 << class310.field4593;
            if (class153.method1073(1021, class437.field6392, class296.field4340[arg2].method432(arg3, false, arg1), arg4, var5, class437.field6392, var6)) {
                class109.field1669++;
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(I)V", line = 50)
    public static void method681(int arg0) {
        field1250 = null;
        field1252 = null;
        if (arg0 != -1) {
            method682(-39, -117, -67, false, 111);
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(IIIZI)V", line = 63)
    public static final void method682(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        if (arg4 >= arg1) {
            for (int var5 = arg1; var5 < arg4; var5++) {
                class651.field9125[var5][arg2] = arg0;
            }
        } else {
            for (int var6 = arg4; var6 < arg1; var6++) {
                class651.field9125[var6][arg2] = arg0;
            }
        }
        field1248++;
        if (arg3) {
            field1247 = 82;
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(IZI)Z", line = 98)
    public static final boolean method683(int arg0, boolean arg1, int arg2) {
        if (!arg1) {
            method680(-53, -64, -55, 78, 44);
        }
        field1253++;
        return (arg2 & 0x70000) != 0 | class185.method1237(arg0, arg2, 1027) || class309.method1966(arg2, -8614, arg0);
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "([BI)V")
    public abstract void method679(byte[] arg0, int arg1);

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(III)[B")
    public abstract byte[] method684(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "(I)[B")
    public abstract byte[] method685(int arg0);
}
