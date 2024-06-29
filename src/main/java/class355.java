import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dea")
public class class355 {

    @OriginalMember(owner = "client!dea", name = "f", descriptor = "I")
    public int field5379 = 2;

    @OriginalMember(owner = "client!dea", name = "h", descriptor = "I")
    public int field5381 = 64;

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "Z")
    public boolean field5374 = false;

    @OriginalMember(owner = "client!dea", name = "e", descriptor = "I")
    public int field5378 = -1;

    @OriginalMember(owner = "client!dea", name = "i", descriptor = "I")
    public int field5382 = 1;

    @OriginalMember(owner = "client!dea", name = "j", descriptor = "I")
    public int field5383 = 64;

    @OriginalMember(owner = "client!dea", name = "c", descriptor = "Z")
    public boolean field5376 = false;

    @OriginalMember(owner = "client!dea", name = "b", descriptor = "Ljava/lang/String;")
    public static String field5375 = null;

    @OriginalMember(owner = "client!dea", name = "d", descriptor = "I")
    public static int field5377 = -1;

    @OriginalMember(owner = "client!dea", name = "k", descriptor = "Z")
    public static volatile boolean field5384 = true;

    @OriginalMember(owner = "client!dea", name = "l", descriptor = "Z")
    public static boolean field5385 = false;

    @OriginalMember(owner = "client!dea", name = "m", descriptor = "I")
    public static int field5386;

    @OriginalMember(owner = "client!dea", name = "n", descriptor = "I")
    public static int field5387;

    @OriginalMember(owner = "client!dea", name = "g", descriptor = "[[[B")
    public static byte[][][] field5380;

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(B)V")
    public static void method2272(byte arg0) {
        if (arg0 != -20) {
            method2272((byte) 8);
        }
        field5375 = null;
        field5380 = null;
    }

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(Lofa;IZI)V")
    private final void method2273(class301 arg0, int arg1, boolean arg2, int arg3) {
        field5386++;
        if (!arg2) {
            method2272((byte) -99);
        }
        if (arg1 == 1) {
            this.field5378 = arg0.method1989((byte) -34);
            if (this.field5378 == 65535) {
                this.field5378 = -1;
            }
        } else if (arg1 == 2) {
            this.field5381 = arg0.method1989((byte) -42) + 1;
            this.field5383 = arg0.method1989((byte) -81) + 1;
        } else if (arg1 == 3) {
            arg0.method1984(4);
        } else if (arg1 == 4) {
            this.field5379 = arg0.method1987(-22);
        } else if (arg1 == 5) {
            this.field5382 = arg0.method1987(-62);
        } else if (arg1 == 6) {
            this.field5376 = true;
        } else if (arg1 == 7) {
            this.field5374 = true;
            return;
        }
    }

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(ILofa;I)V")
    public final void method2274(int arg0, class301 arg1, int arg2) {
        while (true) {
            int var4 = arg1.method1987(-116);
            if (var4 == 0) {
                field5387++;
                if (arg2 <= 37) {
                    this.field5379 = -13;
                    return;
                }
                return;
            }
            this.method2273(arg1, var4, true, arg0);
        }
    }
}
