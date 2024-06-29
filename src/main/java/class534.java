import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iu")
public abstract class class534 {

    @OriginalMember(owner = "client!iu", name = "f", descriptor = "[[F")
    public static float[][] field7794 = new float[][] { { -0.333333F, -0.333333F, -0.333333F }, { 0.333333F, -0.333333F, -0.333333F }, { -0.333333F, 0.333333F, -0.333333F }, { 0.333333F, 0.333333F, -0.333333F }, { -0.333333F, -0.333333F, 0.333333F }, { 0.333333F, -0.333333F, 0.333333F }, { -0.333333F, 0.333333F, 0.333333F }, { 0.333333F, 0.333333F, 0.333333F } };

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "I")
    public static int field7789;

    @OriginalMember(owner = "client!iu", name = "b", descriptor = "I")
    public static int field7790;

    @OriginalMember(owner = "client!iu", name = "c", descriptor = "I")
    public int field7791;

    @OriginalMember(owner = "client!iu", name = "d", descriptor = "I")
    public static int field7792;

    @OriginalMember(owner = "client!iu", name = "e", descriptor = "I")
    public int field7793;

    @OriginalMember(owner = "client!iu", name = "g", descriptor = "I")
    public static int field7795;

    @OriginalMember(owner = "client!iu", name = "h", descriptor = "I")
    public static int field7796;

    @OriginalMember(owner = "client!iu", name = "i", descriptor = "I")
    public int field7797;

    @OriginalMember(owner = "client!iu", name = "j", descriptor = "I")
    public static int field7798;

    @OriginalMember(owner = "client!iu", name = "k", descriptor = "I")
    public static int field7799;

    @OriginalMember(owner = "client!iu", name = "l", descriptor = "Lkg;")
    public static class247 field7800;

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(I)Z")
    public final boolean method3135(int arg0) {
        field7790++;
        if (arg0 == -1) {
            return (this.field7791 & 0x1) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!iu", name = "b", descriptor = "(I)V")
    public static void method3136(int arg0) {
        if (arg0 != 500) {
            method3136(-53);
        }
        field7794 = null;
        field7800 = null;
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(III)V")
    public static final void method3137(int arg0, int arg1, int arg2) {
        field7799++;
        if (class62.method607((byte) -106, arg1)) {
            class136.method905(0, class516.field7555[arg1], arg0);
            if (arg2 != 2) {
                method3137(60, 49, 44);
            }
        }
    }

    @OriginalMember(owner = "client!iu", name = "c", descriptor = "(I)Z")
    public final boolean method3138(int arg0) {
        field7792++;
        if (arg0 != -12247) {
            this.method3135(66);
        }
        return (this.field7791 & 0x8) != 0;
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(Ljava/lang/String;I)[B")
    public static final byte[] method3139(String arg0, int arg1) {
        field7798++;
        if (arg1 != 128) {
            method3139(null, 85);
        }
        int var2 = arg0.length();
        if (var2 == 0) {
            return new byte[0];
        }
        int var3 = var2 + 3 & 0xFFFFFFFC;
        int var4 = var3 / 4 * 3;
        if (var3 - 2 >= var2 || class678.method3849(arg0.charAt(var3 - 2), -1) == -1) {
            var4 -= 2;
        } else if (var2 <= (var3 - 1) || class678.method3849(arg0.charAt(var3 - 1), -1) == -1) {
            var4--;
        }
        byte[] var5 = new byte[var4];
        class680.method3858(192, var5, 0, arg0);
        return var5;
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(B)Z")
    public final boolean method3140(byte arg0) {
        if (arg0 > -10) {
            this.method3141(108);
        }
        field7795++;
        return (this.field7791 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!iu", name = "d", descriptor = "(I)Z")
    public final boolean method3141(int arg0) {
        if (arg0 == -23627) {
            field7789++;
            return (this.field7791 & 0x2) != 0;
        } else {
            return true;
        }
    }
}
