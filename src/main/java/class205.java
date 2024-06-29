import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class205 {

    @OriginalMember(owner = "client!q", name = "l", descriptor = "I")
    public int field3301 = 16777215;

    @OriginalMember(owner = "client!q", name = "i", descriptor = "I")
    public int field3298 = 8;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "Ljava/lang/String;")
    public static String field3290 = "glow1:";

    @OriginalMember(owner = "client!q", name = "f", descriptor = "[I")
    public static int[] field3295 = new int[1000];

    @OriginalMember(owner = "client!q", name = "q", descriptor = "I")
    public static int field3306 = -1;

    @OriginalMember(owner = "client!q", name = "b", descriptor = "I")
    public int field3291;

    @OriginalMember(owner = "client!q", name = "c", descriptor = "I")
    public static int field3292;

    @OriginalMember(owner = "client!q", name = "d", descriptor = "I")
    public int field3293;

    @OriginalMember(owner = "client!q", name = "g", descriptor = "I")
    public static int field3296;

    @OriginalMember(owner = "client!q", name = "h", descriptor = "I")
    public static int field3297;

    @OriginalMember(owner = "client!q", name = "j", descriptor = "I")
    public int field3299;

    @OriginalMember(owner = "client!q", name = "m", descriptor = "I")
    public int field3302;

    @OriginalMember(owner = "client!q", name = "n", descriptor = "I")
    public int field3303;

    @OriginalMember(owner = "client!q", name = "p", descriptor = "I")
    public static int field3305;

    @OriginalMember(owner = "client!q", name = "r", descriptor = "I")
    public static int field3307;

    @OriginalMember(owner = "client!q", name = "k", descriptor = "Lsb;")
    public static class124 field3300;

    @OriginalMember(owner = "client!q", name = "e", descriptor = "Lne;")
    public static class78 field3294;

    @OriginalMember(owner = "client!q", name = "o", descriptor = "Z")
    public boolean field3304;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IBLig;I)V")
    private final void method1379(int arg0, byte arg1, class136 arg2, int arg3) {
        int var5 = 62 / ((71 - arg1) / 48);
        if (arg0 == 1) {
            this.field3298 = arg2.method996(65280);
        } else if (arg0 == 2) {
            this.field3304 = true;
        } else if (arg0 == 3) {
            this.field3299 = arg2.method1027((byte) 64);
            this.field3302 = arg2.method1027((byte) 64);
            this.field3303 = arg2.method1027((byte) 64);
        } else if (arg0 == 4) {
            this.field3291 = arg2.method1012(4);
        } else if (arg0 == 5) {
            this.field3293 = arg2.method996(65280);
        } else if (arg0 == 6) {
            this.field3301 = arg2.method1009(92);
        }
        field3305++;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(I)V")
    public static void method1380(int arg0) {
        field3300 = null;
        field3294 = null;
        field3295 = null;
        field3290 = null;
        if (arg0 >= -81) {
            method1380(93);
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(ILig;I)V")
    public final void method1381(int arg0, class136 arg1, int arg2) {
        while (true) {
            int var4 = arg1.method1012(4);
            if (var4 == 0) {
                field3307++;
                if (arg0 >= 0) {
                    method1380(24);
                    return;
                }
                return;
            }
            this.method1379(var4, (byte) -27, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(III)J")
    public static final long method1382(int arg0, int arg1, int arg2) {
        class129 var3 = class26.field455[arg0][arg1][arg2];
        return var3 == null || var3.field2133 == null ? 0L : var3.field2133.field3979;
    }
}
