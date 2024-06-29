import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eu")
public class class636 extends class244 {

    @OriginalMember(owner = "client!eu", name = "D", descriptor = "Z")
    public static boolean field9235;

    @OriginalMember(owner = "client!eu", name = "E", descriptor = "Ljava/lang/String;")
    public static String field9236;

    @OriginalMember(owner = "client!eu", name = "F", descriptor = "[I")
    public static int[] field9237;

    @OriginalMember(owner = "client!eu", name = "C", descriptor = "I")
    public static int field9234;

    @OriginalMember(owner = "client!eu", name = "G", descriptor = "I")
    public static int field9238;

    @OriginalMember(owner = "client!eu", name = "B", descriptor = "[B")
    private byte[] field9233;

    @OriginalMember(owner = "client!eu", name = "c", descriptor = "(III)V")
    public static final void method3673(int arg0, int arg1, int arg2) {
        boolean var3 = class277.field4051[0][arg1][arg2] != null && class277.field4051[0][arg1][arg2].field2667 != null;
        for (int var4 = arg0; var4 >= 0; var4--) {
            if (class277.field4051[var4][arg1][arg2] == null) {
                class184 var5 = class277.field4051[var4][arg1][arg2] = new class184(var4, arg1, arg2);
                if (var3) {
                    var5.field2668++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!eu", name = "c", descriptor = "(IIII)[B")
    public final byte[] method3674(int arg0, int arg1, int arg2, int arg3) {
        this.field9233 = new byte[arg2 * 2 * arg3 * arg0];
        field9238++;
        if (arg1 > -124) {
            return null;
        } else {
            this.method1864(arg3, (byte) 15, arg2, arg0);
            return this.field9233;
        }
    }

    @OriginalMember(owner = "client!eu", name = "d", descriptor = "(I)V")
    public static void method3675(int arg0) {
        field9236 = null;
        field9237 = null;
        if (arg0 != -1196) {
            field9236 = null;
        }
    }

    @OriginalMember(owner = "client!eu", name = "<init>", descriptor = "()V")
    public class636() {
        super(12, 5, 16, 2, 2, 0.45F);
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(BIZ)V")
    public final void method1548(byte arg0, int arg1, boolean arg2) {
        field9234++;
        if (!arg2) {
            field9235 = true;
        }
        int var4 = arg1 * 2;
        byte var5 = (byte) (((arg0 & 0xFF) >> 1) + 127);
        int var6 = var4 + 1;
        this.field9233[var4] = var5;
        this.field9233[var6] = var5;
    }

    static {
        new class567("This mute will remain for a further ", "Diese Stummschaltung gilt für weitere ", "Votre accès restera bloqué encore ", "Este veto permanecerá por mais ");
        field9235 = false;
        field9236 = "";
        field9237 = new int[6];
    }
}
