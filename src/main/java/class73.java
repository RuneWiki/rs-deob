import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!naa")
public abstract class class73 extends class392 {

    @OriginalMember(owner = "client!naa", name = "x", descriptor = "I")
    public int field782;

    @OriginalMember(owner = "client!naa", name = "w", descriptor = "Lsn;")
    public class630 field781;

    @OriginalMember(owner = "client!naa", name = "v", descriptor = "[I")
    public static int[] field780 = new int[32];

    @OriginalMember(owner = "client!naa", name = "y", descriptor = "I")
    public static int field783;

    @OriginalMember(owner = "client!naa", name = "A", descriptor = "I")
    public static int field785;

    @OriginalMember(owner = "client!naa", name = "z", descriptor = "[Ljava/lang/String;")
    public static String[] field784;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field780[var1] = var0 - 1;
            var0 += var0;
        }
    }

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "(Z)V", line = 4)
    public static void method536(boolean arg0) {
        if (arg0) {
            field780 = null;
            field784 = null;
        }
    }

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "(IIII)I", line = 18)
    public static final int method537(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 >= -39) {
            return 26;
        }
        field783++;
        if (arg2 == arg3) {
            return arg2;
        }
        int var4 = 128 - arg0;
        int var5 = (arg2 & 0x7F) * var4 + (arg3 & 0x7F) * arg0 >> 7;
        int var6 = (arg2 & 0x380) * var4 + (arg3 & 0x380) * arg0 >> 7;
        int var7 = (arg2 & 0xFC00) * var4 + (arg3 & 0xFC00) * arg0 >> 7;
        return var6 & 0x380 | var7 & 0xFC00 | var5 & 0x7F;
    }

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "(II)I", line = 44)
    public static final int method538(int arg0, int arg1) {
        return class425.field5983 == null ? 0 : class425.field5983[arg0][arg1] & 0xFF;
    }

    @OriginalMember(owner = "client!naa", name = "<init>", descriptor = "(Lsn;I)V", line = 63)
    public class73(class630 arg0, int arg1) {
        this.field782 = arg1;
        this.field781 = arg0;
    }

    @OriginalMember(owner = "client!naa", name = "b", descriptor = "(I)Ljava/lang/Object;")
    public abstract Object method19(int arg0);

    @OriginalMember(owner = "client!naa", name = "c", descriptor = "(I)Z")
    public abstract boolean method20(int arg0);
}
