import java.nio.ByteBuffer;
import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class193 {

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "I")
    public int field3334 = 0;

    @OriginalMember(owner = "client!ea", name = "k", descriptor = "Z")
    public boolean field3344 = false;

    @OriginalMember(owner = "client!ea", name = "h", descriptor = "I")
    public int field3341 = 0;

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "I")
    public static int field3335 = 0;

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "[I")
    public static int[] field3338 = new int[50];

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "Lmh;")
    public static class128 field3337 = class22.method156(126, " steht bereits auf Ihrer Ignorieren)2Liste(Q");

    @OriginalMember(owner = "client!ea", name = "f", descriptor = "I")
    public static int field3339 = -1;

    @OriginalMember(owner = "client!ea", name = "j", descriptor = "Lmh;")
    public static class128 field3343 = class22.method156(122, "::rect_debug");

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field3336 = new CRC32();

    @OriginalMember(owner = "client!ea", name = "l", descriptor = "I")
    public static int field3345;

    @OriginalMember(owner = "client!ea", name = "g", descriptor = "Lam;")
    public class244 field3340;

    @OriginalMember(owner = "client!ea", name = "i", descriptor = "Ljava/nio/ByteBuffer;")
    public ByteBuffer field3342;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIIIBII)V", line = 12)
    public static final void method1291(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        if (arg4 != 69) {
            return;
        }
        if (field3335 <= arg5 && arg1 <= class43.field875 && arg6 >= class70.field1315 && arg2 <= class181.field3173) {
            if (arg3 == 1) {
                class226.method1555(-23989, arg1, arg2, arg0, arg5, arg6);
            } else {
                class31.method227(arg0, arg3, arg6, arg4 - 156, arg1, arg5, arg2);
            }
        } else if (arg3 == 1) {
            class248.method1723(arg2, arg5, arg1, arg6, (byte) -88, arg0);
        } else {
            class306.method2090(arg0, (byte) 96, arg5, arg3, arg6, arg2, arg1);
        }
        field3345++;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(I)V", line = 55)
    public static void method1292(int arg0) {
        field3336 = null;
        field3337 = null;
        if (arg0 != 50) {
            field3338 = (int[]) null;
        }
        field3338 = null;
        field3343 = null;
    }
}
