import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public abstract class class7 {

    @OriginalMember(owner = "client!j", name = "d", descriptor = "[C")
    public static char[] field102 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

    @OriginalMember(owner = "client!j", name = "f", descriptor = "I")
    public static int field104 = 0;

    @OriginalMember(owner = "client!j", name = "b", descriptor = "I")
    public static int field100 = 0;

    @OriginalMember(owner = "client!j", name = "j", descriptor = "I")
    public static int field108 = 50;

    @OriginalMember(owner = "client!j", name = "e", descriptor = "I")
    public static int field103;

    @OriginalMember(owner = "client!j", name = "g", descriptor = "I")
    public static int field105;

    @OriginalMember(owner = "client!j", name = "h", descriptor = "I")
    public static int field106;

    @OriginalMember(owner = "client!j", name = "i", descriptor = "I")
    public static int field107;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "I")
    public static int field99;

    @OriginalMember(owner = "client!j", name = "c", descriptor = "[[[B")
    public static byte[][][] field101;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(III)Lj;", line = 10)
    public class7 method34(int arg0, int arg1, int arg2) {
        field99++;
        return this;
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "()Z", line = 20)
    public boolean method35() {
        field106++;
        return false;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(I[Ljava/lang/Object;II[J)V", line = 29)
    public static final void method36(int arg0, Object[] arg1, int arg2, int arg3, long[] arg4) {
        if (arg0 > arg3) {
            int var5 = (arg0 + arg3) / 2;
            long var6 = arg4[var5];
            arg4[var5] = arg4[arg0];
            arg4[arg0] = var6;
            int var8 = arg3;
            Object var9 = arg1[var5];
            arg1[var5] = arg1[arg0];
            arg1[arg0] = var9;
            for (int var10 = arg3; var10 < arg0; var10++) {
                if (arg4[var10] < ((long) (var10 & 0x1) + var6)) {
                    long var11 = arg4[var10];
                    arg4[var10] = arg4[var8];
                    arg4[var8] = var11;
                    Object var13 = arg1[var10];
                    arg1[var10] = arg1[var8];
                    arg1[var8++] = var13;
                }
            }
            arg4[arg0] = arg4[var8];
            arg4[var8] = var6;
            arg1[arg0] = arg1[var8];
            arg1[var8] = var9;
            method36(var8 - 1, arg1, 1, arg3, arg4);
            method36(arg0, arg1, 1, var8 + 1, arg4);
        }
        field103++;
        if (arg2 != 1) {
            method37(true);
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Z)V", line = 85)
    public static void method37(boolean arg0) {
        field102 = null;
        if (arg0) {
            method36(-85, (Object[]) null, 125, 3, (long[]) null);
        }
        field101 = (byte[][][]) null;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Lj;IIIZ)V", line = 118)
    public void method40(class7 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field107++;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "()I")
    public abstract int method33();

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIIIIIIJILpe;)V")
    public abstract void method38(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class294 arg10);

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIII)V")
    public abstract void method39(int arg0, int arg1, int arg2, int arg3, int arg4);
}
