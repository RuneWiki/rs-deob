import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class21 {

    @OriginalMember(owner = "client!i", name = "b", descriptor = "I")
    public int field274 = 0;

    @OriginalMember(owner = "client!i", name = "d", descriptor = "Z")
    public boolean field276 = false;

    @OriginalMember(owner = "client!i", name = "g", descriptor = "I")
    public int field279 = 0;

    @OriginalMember(owner = "client!i", name = "f", descriptor = "Z")
    public static boolean field278 = false;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "I")
    public static int field273 = 0;

    @OriginalMember(owner = "client!i", name = "j", descriptor = "J")
    public static long field282 = 0L;

    @OriginalMember(owner = "client!i", name = "i", descriptor = "I")
    public static int field281;

    @OriginalMember(owner = "client!i", name = "e", descriptor = "Lng;")
    public static class138 field277;

    @OriginalMember(owner = "client!i", name = "c", descriptor = "Lre;")
    public class259 field275;

    @OriginalMember(owner = "client!i", name = "h", descriptor = "Ljava/nio/ByteBuffer;")
    public ByteBuffer field280;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(II)I", line = 15)
    public static final int method137(int arg0, int arg1) {
        field281++;
        class38 var2 = class58.method458((byte) -40, arg1);
        if (arg0 != -7787) {
            field282 = -99L;
        }
        int var3 = var2.field683;
        int var4 = var2.field687;
        int var5 = var2.field688;
        int var6 = class59.field1063[var5 - var3];
        return var6 & class97.field1741[var4] >> var3;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(B)V", line = 39)
    public static void method138(byte arg0) {
        if (arg0 >= -8) {
            field278 = false;
        }
        field277 = null;
    }
}
