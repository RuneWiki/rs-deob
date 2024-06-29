import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public abstract class class124 extends class153 {

    @OriginalMember(owner = "client!pb", name = "E", descriptor = "Z")
    public volatile boolean field2175 = true;

    @OriginalMember(owner = "client!pb", name = "K", descriptor = "Lpj;")
    public static class237 field2181 = class33.method353("blaugr-Un:", 89);

    @OriginalMember(owner = "client!pb", name = "I", descriptor = "I")
    public static int field2179 = 0;

    @OriginalMember(owner = "client!pb", name = "Q", descriptor = "I")
    public static int field2187 = -1;

    @OriginalMember(owner = "client!pb", name = "G", descriptor = "Z")
    public static boolean field2177 = false;

    @OriginalMember(owner = "client!pb", name = "L", descriptor = "Lpj;")
    public static class237 field2182 = class33.method353("0", 115);

    @OriginalMember(owner = "client!pb", name = "P", descriptor = "Lpj;")
    public static class237 field2186 = class33.method353("weiss:", 106);

    @OriginalMember(owner = "client!pb", name = "F", descriptor = "I")
    public static int field2176;

    @OriginalMember(owner = "client!pb", name = "M", descriptor = "I")
    public static int field2183;

    @OriginalMember(owner = "client!pb", name = "R", descriptor = "I")
    public static int field2188;

    @OriginalMember(owner = "client!pb", name = "J", descriptor = "Z")
    public boolean field2180;

    @OriginalMember(owner = "client!pb", name = "O", descriptor = "Z")
    public boolean field2185;

    @OriginalMember(owner = "client!pb", name = "H", descriptor = "[I")
    public static int[] field2178;

    @OriginalMember(owner = "client!pb", name = "N", descriptor = "[Z")
    public static boolean[] field2184;

    @OriginalMember(owner = "client!pb", name = "f", descriptor = "(I)[B")
    public abstract byte[] method885(int arg0);

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(ILfa;)V")
    public static final void method886(int arg0, class239 arg1) {
        field2176++;
        if (arg0 == -25315) {
            class169.field2972 = arg1.method1643(class256.field4411, (byte) 117);
        }
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(Z)V")
    public static void method887(boolean arg0) {
        field2178 = null;
        field2182 = null;
        if (arg0) {
            field2184 = null;
            field2186 = null;
            field2181 = null;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lie;B)Ljc;")
    public static final class230 method888(class32 arg0, byte arg1) {
        field2188++;
        if (arg1 >= -114) {
            field2181 = null;
        }
        return new class230(arg0.method309(-489706920), arg0.method309(-489706920), arg0.method309(-489706920), arg0.method309(-489706920), arg0.method309(-489706920), arg0.method309(-489706920), arg0.method309(-489706920), arg0.method309(-489706920), arg0.method313((byte) -80), arg0.method316((byte) -10));
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(B)I")
    public abstract int method889(byte arg0);
}
