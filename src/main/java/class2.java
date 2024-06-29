import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uv")
public class class2 {

    @OriginalMember(owner = "client!uv", name = "f", descriptor = "I")
    public int field12;

    @OriginalMember(owner = "client!uv", name = "c", descriptor = "I")
    private int field9;

    @OriginalMember(owner = "client!uv", name = "e", descriptor = "I")
    public static int field11 = 0;

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "Ldp;")
    public static class347 field7 = new class347(" is already on your ignore list.", " steht bereits auf deiner Ignorieren-Liste!", " est déjà dans votre liste noire.", " já está na sua lista de ignorados.");

    @OriginalMember(owner = "client!uv", name = "d", descriptor = "I")
    public static int field10;

    @OriginalMember(owner = "client!uv", name = "g", descriptor = "I")
    public static int field13;

    @OriginalMember(owner = "client!uv", name = "h", descriptor = "I")
    public static int field14;

    @OriginalMember(owner = "client!uv", name = "i", descriptor = "I")
    public static int field15;

    @OriginalMember(owner = "client!uv", name = "b", descriptor = "I")
    public static int field8;

    @OriginalMember(owner = "client!uv", name = "j", descriptor = "Luv;")
    public static class2 field16;

    static {
        new class347(" joined the channel.", " hat den Chatraum betreten.", " a rejoint le canal.", " entrou no canal.");
    }

    @OriginalMember(owner = "client!uv", name = "toString", descriptor = "()Ljava/lang/String;", line = 6)
    public final String toString() {
        field8++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(B)V", line = 20)
    public static void method5(byte arg0) {
        field16 = null;
        field7 = null;
        if (arg0 != 57) {
            method8(0.6852327F, 0.16308281F, (byte) -51, -2.004112F, -91);
        }
    }

    @OriginalMember(owner = "client!uv", name = "<init>", descriptor = "(II)V", line = 33)
    public class2(int arg0, int arg1) {
        this.field12 = arg1;
        this.field9 = arg0;
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(I)I", line = 46)
    public final int method6(int arg0) {
        if (arg0 <= 85) {
            return 121;
        } else {
            field15++;
            return this.field9;
        }
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(IIB)I", line = 59)
    public static final int method7(int arg0, int arg1, byte arg2) {
        field10++;
        if (arg2 > -6) {
            method8(-0.060903225F, 0.5034477F, (byte) 108, 0.2977464F, -76);
        }
        return arg1 == 1 || arg1 == 3 ? class97.field1505[arg0 & 0x3] : class125.field1887[arg0 & 0x3];
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(FFBFI)F", line = 75)
    public static final float method8(float arg0, float arg1, byte arg2, float arg3, int arg4) {
        field13++;
        int var5 = 90 / ((arg2 + 59) / 46);
        float[] var6 = class9.field90[arg4];
        return var6[2] * arg1 + var6[1] * arg0 + var6[0] * arg3;
    }
}
