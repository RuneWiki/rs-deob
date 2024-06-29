import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public class class64 extends class35 {

    @OriginalMember(owner = "client!ji", name = "m", descriptor = "Ljava/lang/String;")
    public String field1039;

    @OriginalMember(owner = "client!ji", name = "k", descriptor = "Z")
    public static boolean field1037 = false;

    @OriginalMember(owner = "client!ji", name = "l", descriptor = "I")
    public static int field1038 = -1;

    @OriginalMember(owner = "client!ji", name = "j", descriptor = "Z")
    public static boolean field1036 = false;

    @OriginalMember(owner = "client!ji", name = "i", descriptor = "I")
    public static int field1035;

    @OriginalMember(owner = "client!ji", name = "n", descriptor = "I")
    public static int field1040;

    @OriginalMember(owner = "client!ji", name = "o", descriptor = "I")
    public static int field1041;

    @OriginalMember(owner = "client!ji", name = "p", descriptor = "I")
    public static int field1042;

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIIII)V")
    public static final void method491(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1035++;
        class221 var5 = class447.method2795(10, (byte) -49, arg2);
        var5.method1692(0);
        if (arg0 != 1) {
            field1037 = false;
        }
        var5.field3291 = arg4;
        var5.field3297 = arg3;
        var5.field3295 = arg1;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lmb;IIILja;)V")
    public static final void method492(class258 arg0, int arg1, int arg2, int arg3, class90 arg4) {
        if (arg1 < 112) {
            method491(-90, -21, -49, 91, 79);
        }
        if (arg0.field3793 == 2) {
            for (int var5 = arg3; var5 <= arg2; var5++) {
                int var6 = arg0.field3847[var5] - 1;
                if (var6 != -1) {
                    if (class47.field765 == 1 && class372.field5285 == var5 && class22.field335 == arg0.field3854) {
                        boolean var7 = class119.method1005(arg0.field3759, 2, var6, arg4, arg0.field3837[var5], true, (class153) null, 0) == null;
                        if (var7) {
                            class88.field1408.method148((byte) 117, new class441(var6, arg0.field3837[var5], 2, 0, arg0.field3759, false));
                        }
                    } else {
                        boolean var8 = class119.method1005(arg0.field3759, 1, var6, arg4, arg0.field3837[var5], true, (class153) null, -13623264) == null;
                        if (var8) {
                            class88.field1408.method148((byte) 78, new class441(var6, arg0.field3837[var5], 1, -13623264, arg0.field3759, false));
                        }
                    }
                }
            }
        } else if (arg0.field3793 == 5) {
            boolean var9 = class119.method1005(arg0.field3759, arg0.field3842, arg0.field3765, arg4, arg0.field3743, true, arg0.field3879 ? class86.field1394.field2072 : null, arg0.field3798 | 0xFF000000) == null;
            if (var9) {
                class88.field1408.method148((byte) 75, new class441(arg0.field3765, arg0.field3743, arg0.field3842, arg0.field3798 | 0xFF000000, arg0.field3759, arg0.field3879));
            }
        }
        field1041++;
    }

    @OriginalMember(owner = "client!ji", name = "<init>", descriptor = "()V")
    public class64() {
    }

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "(I)V")
    public static final void method493(int arg0) {
        if (class240.field3463 == 10) {
            class168.method1288(-6, 28);
        }
        field1042++;
        if (class240.field3463 == 30) {
            class168.method1288(-6, 25);
        }
        if (arg0 <= 117) {
            method492((class258) null, 17, 49, 31, (class90) null);
        }
    }

    @OriginalMember(owner = "client!ji", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class64(String arg0, int arg1) {
        this.field1039 = arg0;
    }
}
