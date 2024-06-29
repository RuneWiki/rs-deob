import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class413 {

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field6090 = new CRC32();

    @OriginalMember(owner = "client!kd", name = "f", descriptor = "[S")
    public static short[] field6093 = new short[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "I")
    public static int field6088;

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "I")
    public static int field6089;

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "I")
    public static int field6091;

    @OriginalMember(owner = "client!kd", name = "e", descriptor = "I")
    public static int field6092;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(B[BIIFLcc;FFIFFII)V")
    public static final void method2592(byte arg0, byte[] arg1, int arg2, int arg3, float arg4, class351 arg5, float arg6, float arg7, int arg8, float arg9, float arg10, int arg11, int arg12) {
        for (int var13 = 0; var13 < arg3; var13++) {
            class370.method2354(arg11, arg9, arg2, arg8, arg5, -101, arg4, arg7, arg12, var13, arg10, arg1, arg6, arg3);
            arg8 += arg11 * arg12;
        }
        if (arg0 != 78) {
            field6093 = null;
        }
        field6091++;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Z)V")
    public static void method2593(boolean arg0) {
        field6090 = null;
        if (!arg0) {
            field6090 = null;
        }
        field6093 = null;
    }
}
