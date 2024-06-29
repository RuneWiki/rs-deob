import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class150 {

    @OriginalMember(owner = "client!qg", name = "i", descriptor = "B")
    private byte field3100;

    @OriginalMember(owner = "client!qg", name = "l", descriptor = "I")
    public int field3103;

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "I")
    public int field3094;

    @OriginalMember(owner = "client!qg", name = "p", descriptor = "I")
    public int field3107;

    @OriginalMember(owner = "client!qg", name = "n", descriptor = "I")
    public int field3105;

    @OriginalMember(owner = "client!qg", name = "h", descriptor = "I")
    public int field3099;

    @OriginalMember(owner = "client!qg", name = "g", descriptor = "Lda;")
    public static class29 field3098 = new class29(512);

    @OriginalMember(owner = "client!qg", name = "m", descriptor = "[I")
    public static int[] field3104 = new int[500];

    @OriginalMember(owner = "client!qg", name = "k", descriptor = "Lea;")
    public static class38 field3102 = class9.method46((byte) 121, "Wir vermuten)1 dass Ihr Konto gestohlen wurde");

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "I")
    public static int field3092;

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "I")
    public static int field3093;

    @OriginalMember(owner = "client!qg", name = "d", descriptor = "I")
    public static int field3095;

    @OriginalMember(owner = "client!qg", name = "e", descriptor = "I")
    public static int field3096;

    @OriginalMember(owner = "client!qg", name = "f", descriptor = "I")
    public static int field3097;

    @OriginalMember(owner = "client!qg", name = "o", descriptor = "Lda;")
    public static class29 field3106;

    @OriginalMember(owner = "client!qg", name = "j", descriptor = "[I")
    public static int[] field3101;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(I)V")
    public static void method1052(int arg0) {
        field3106 = null;
        field3104 = null;
        field3101 = null;
        field3102 = null;
        if (arg0 >= -90) {
            field3101 = null;
        }
        field3098 = null;
    }

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "(I)I")
    public final int method1053(int arg0) {
        if (arg0 == 1) {
            field3096++;
            return this.field3100 & 0x7;
        } else {
            return -104;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(B)I")
    public final int method1054(byte arg0) {
        field3092++;
        if (arg0 < 24) {
            method1052(11);
        }
        return (this.field3100 & 0x8) == 8 ? 1 : 0;
    }

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "(I)V")
    public static final void method1055(int arg0) {
        class111.field2483.method169(-1494101117, 151);
        class188.field3741++;
        if (arg0 != -9) {
            field3104 = null;
        }
        field3097++;
        for (class42 var1 = (class42) class177.field3580.method177(-52); var1 != null; var1 = (class42) class177.field3580.method185((byte) 54)) {
            if (var1.field919 == 0 || var1.field919 == 3) {
                class28.method172(-1494101117, var1, true);
            }
        }
        if (class185.field3689 != null) {
            class172.method1209(class185.field3689, -1);
            class185.field3689 = null;
        }
    }

    @OriginalMember(owner = "client!qg", name = "<init>", descriptor = "()V")
    public class150() {
    }

    @OriginalMember(owner = "client!qg", name = "<init>", descriptor = "(Lhc;)V")
    public class150(class66 arg0) {
        this.field3100 = arg0.method513((byte) 97);
        this.field3103 = arg0.method511(103);
        this.field3094 = arg0.method464(-27);
        this.field3107 = arg0.method464(-59);
        this.field3105 = arg0.method464(-115);
        this.field3099 = arg0.method464(-69);
    }
}
