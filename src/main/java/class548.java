import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class548 extends class496 {

    @OriginalMember(owner = "client!ua", name = "o", descriptor = "I")
    public int field8168;

    @OriginalMember(owner = "client!ua", name = "u", descriptor = "I")
    public int field8174;

    @OriginalMember(owner = "client!ua", name = "m", descriptor = "I")
    public int field8166;

    @OriginalMember(owner = "client!ua", name = "l", descriptor = "Ljava/lang/String;")
    public String field8165;

    @OriginalMember(owner = "client!ua", name = "j", descriptor = "I")
    public int field8163;

    @OriginalMember(owner = "client!ua", name = "r", descriptor = "J")
    public long field8171;

    @OriginalMember(owner = "client!ua", name = "s", descriptor = "Z")
    public boolean field8172;

    @OriginalMember(owner = "client!ua", name = "t", descriptor = "I")
    public int field8173;

    @OriginalMember(owner = "client!ua", name = "i", descriptor = "Ljava/lang/String;")
    public String field8162;

    @OriginalMember(owner = "client!ua", name = "p", descriptor = "Z")
    public boolean field8169;

    @OriginalMember(owner = "client!ua", name = "q", descriptor = "[I")
    public static int[] field8170 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!ua", name = "k", descriptor = "F")
    public static float field8164;

    @OriginalMember(owner = "client!ua", name = "n", descriptor = "I")
    public static int field8167;

    @OriginalMember(owner = "client!ua", name = "v", descriptor = "I")
    public static int field8175;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IZIII)V")
    public static final void method3210(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        if (!arg1) {
            method3211(true);
        }
        if (arg0 < arg2) {
            for (int var5 = arg0; var5 < arg2; var5++) {
                class47.field558[var5][arg4] = arg3;
            }
        } else {
            for (int var6 = arg2; var6 < arg0; var6++) {
                class47.field558[var6][arg4] = arg3;
            }
        }
        field8175++;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Z)V")
    public static void method3211(boolean arg0) {
        if (!arg0) {
            method3210(-46, false, 122, -111, 111);
        }
        field8170 = null;
    }

    @OriginalMember(owner = "client!ua", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZ)V")
    public class548(String arg0, String arg1, int arg2, int arg3, int arg4, long arg5, int arg6, int arg7, boolean arg8, boolean arg9) {
        this.field8168 = arg6;
        this.field8174 = arg4;
        this.field8166 = arg7;
        this.field8165 = arg0;
        this.field8163 = arg3;
        this.field8171 = arg5;
        this.field8172 = arg8;
        this.field8173 = arg2;
        this.field8162 = arg1;
        this.field8169 = arg9;
    }
}
