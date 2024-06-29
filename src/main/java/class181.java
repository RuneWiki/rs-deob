import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class181 {

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "Z")
    public boolean field3104 = true;

    @OriginalMember(owner = "client!vc", name = "p", descriptor = "I")
    public int field3117;

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "I")
    public int field3105;

    @OriginalMember(owner = "client!vc", name = "n", descriptor = "I")
    public int field3115;

    @OriginalMember(owner = "client!vc", name = "h", descriptor = "I")
    public int field3109;

    @OriginalMember(owner = "client!vc", name = "g", descriptor = "I")
    public int field3108;

    @OriginalMember(owner = "client!vc", name = "o", descriptor = "I")
    public int field3116;

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "Lcd;")
    private static class64 field3103 = class44.method335((byte) 71, "Created gameworld");

    @OriginalMember(owner = "client!vc", name = "e", descriptor = "[Lkh;")
    public static class13[] field3106 = new class13[2048];

    @OriginalMember(owner = "client!vc", name = "k", descriptor = "I")
    public static int field3112 = 0;

    @OriginalMember(owner = "client!vc", name = "i", descriptor = "Lcd;")
    public static class64 field3110 = class44.method335((byte) 71, "Ausw-=hlen");

    @OriginalMember(owner = "client!vc", name = "m", descriptor = "Lcd;")
    public static class64 field3114 = field3103;

    @OriginalMember(owner = "client!vc", name = "r", descriptor = "Lcd;")
    public static class64 field3119 = class44.method335((byte) 71, "Null");

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "I")
    public static int field3102;

    @OriginalMember(owner = "client!vc", name = "j", descriptor = "I")
    public static int field3111;

    @OriginalMember(owner = "client!vc", name = "l", descriptor = "I")
    public static int field3113;

    @OriginalMember(owner = "client!vc", name = "f", descriptor = "[Log;")
    public static class195[] field3107;

    @OriginalMember(owner = "client!vc", name = "q", descriptor = "[Lja;")
    public static class60[] field3118;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(I)V", line = 4)
    public static final void method1285(int arg0) {
        if (arg0 == 30111) {
            field3111++;
            if (class131.field2333 == 5) {
                class131.field2333 = 6;
            }
        }
    }

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(I)V", line = 23)
    public static void method1286(int arg0) {
        field3103 = null;
        field3114 = null;
        field3106 = null;
        field3107 = null;
        field3118 = null;
        field3110 = null;
        int var1 = 64 % ((arg0 + 81) / 42);
        field3119 = null;
    }

    @OriginalMember(owner = "client!vc", name = "<init>", descriptor = "(IIIIIIZ)V", line = 95)
    public class181(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field3117 = arg5;
        this.field3105 = arg3;
        this.field3104 = arg6;
        this.field3115 = arg1;
        this.field3109 = arg2;
        this.field3108 = arg0;
        this.field3116 = arg4;
    }

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "(I)V", line = 66)
    public static final void method1287(int arg0) {
        class138.field2461 = arg0;
        for (int var1 = 0; var1 < class146.field2588; var1++) {
            for (int var2 = 0; var2 < class314.field5327; var2++) {
                if (class304.field5203[arg0][var1][var2] == null) {
                    class304.field5203[arg0][var1][var2] = new class295(arg0, var1, var2);
                }
            }
        }
    }
}
