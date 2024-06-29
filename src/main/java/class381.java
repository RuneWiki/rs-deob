import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public abstract class class381 extends class387 {

    @OriginalMember(owner = "client!s", name = "r", descriptor = "Z")
    public boolean field5716 = false;

    @OriginalMember(owner = "client!s", name = "t", descriptor = "Z")
    public boolean field5718 = false;

    @OriginalMember(owner = "client!s", name = "p", descriptor = "I")
    public int field5714;

    @OriginalMember(owner = "client!s", name = "l", descriptor = "I")
    public int field5710;

    @OriginalMember(owner = "client!s", name = "n", descriptor = "I")
    public int field5712;

    @OriginalMember(owner = "client!s", name = "q", descriptor = "[B")
    public static byte[] field5715 = new byte[32896];

    @OriginalMember(owner = "client!s", name = "u", descriptor = "[J")
    public static long[] field5719;

    @OriginalMember(owner = "client!s", name = "s", descriptor = "I")
    public static int field5717;

    @OriginalMember(owner = "client!s", name = "v", descriptor = "Z")
    public static boolean field5720;

    @OriginalMember(owner = "client!s", name = "o", descriptor = "F")
    public static float field5713;

    @OriginalMember(owner = "client!s", name = "m", descriptor = "I")
    public static int field5711;

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 256; var1++) {
            for (int var6 = 0; var6 <= var1; var6++) {
                field5715[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var1 * var1 + var6 * var6 + 65535) / 65535.0F))));
            }
        }
        field5719 = new long[256];
        field5717 = 1;
        for (int var2 = 0; var2 < 256; var2++) {
            long var3 = (long) var2;
            for (int var5 = 0; var5 < 8; var5++) {
                if ((var3 & 0x1L) == 1L) {
                    var3 = var3 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var3 >>>= 0x1;
                }
            }
            field5719[var2] = var3;
        }
        field5720 = false;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(II)V", line = 7)
    public static final void method2510(int arg0, int arg1) {
        field5711++;
        class77.field1055.method215(0, arg0);
        class327.field4700.method215(0, arg0);
        if (arg1 <= 43) {
            method2510(-29, -69);
        }
    }

    @OriginalMember(owner = "client!s", name = "f", descriptor = "(I)V", line = 28)
    public static void method2511(int arg0) {
        if (arg0 != 7893) {
            method2510(30, 19);
        }
        field5719 = null;
        field5715 = null;
    }

    @OriginalMember(owner = "client!s", name = "<init>", descriptor = "(IIIZZ)V", line = 71)
    public class381(int arg0, int arg1, int arg2, boolean arg3, boolean arg4) {
        this.field5714 = arg1;
        this.field5710 = arg2;
        this.field5716 = arg3;
        this.field5712 = arg0;
        this.field5718 = arg4;
    }
}
