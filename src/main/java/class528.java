import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class528 extends class253 {

    @OriginalMember(owner = "client!hg", name = "T", descriptor = "I")
    public static int field7374 = 0;

    @OriginalMember(owner = "client!hg", name = "N", descriptor = "I")
    public static int field7368;

    @OriginalMember(owner = "client!hg", name = "O", descriptor = "I")
    public static int field7369;

    @OriginalMember(owner = "client!hg", name = "P", descriptor = "I")
    public static int field7370;

    @OriginalMember(owner = "client!hg", name = "Q", descriptor = "I")
    public static int field7371;

    @OriginalMember(owner = "client!hg", name = "R", descriptor = "I")
    public static int field7372;

    @OriginalMember(owner = "client!hg", name = "L", descriptor = "Lbm;")
    public static class712 field7367;

    @OriginalMember(owner = "client!hg", name = "S", descriptor = "[B")
    private byte[] field7373;

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "(IIII)V")
    public static final void method3086(int arg0, int arg1, int arg2, int arg3) {
        int var4 = class420.field5820.field9491.method1367(17539) * arg2 >> 8;
        field7370++;
        if (arg3 <= 3) {
            method3087(-115);
        }
        if (arg1 == -1 && !class301.field4330) {
            class460.method2687(-66);
        } else if (arg1 != -1 && (class371.field5236 != arg1 || !class556.method3205(true)) && var4 != 0 && !class301.field4330) {
            class31.method259(-86, arg1, false, 0, class399.field5495, var4, arg0);
            class646.method3658((byte) -51);
        }
        if (class371.field5236 != arg1) {
            class602.field8558 = null;
        }
        class371.field5236 = arg1;
    }

    @OriginalMember(owner = "client!hg", name = "<init>", descriptor = "()V")
    public class528() {
        super(12, 5, 16, 2, 2, 0.45F);
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IBZ)V")
    public final void method172(int arg0, byte arg1, boolean arg2) {
        field7371++;
        int var4 = arg0 * 2;
        byte var5 = (byte) (((arg1 & 0xFF) >> 1) + 127);
        if (!arg2) {
            field7367 = null;
        }
        this.field7373[var4++] = var5;
        this.field7373[var4] = var5;
    }

    @OriginalMember(owner = "client!hg", name = "g", descriptor = "(I)V")
    public static void method3087(int arg0) {
        if (arg0 != 12) {
            method3088(true, null, null);
        }
        field7367 = null;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(ZLd;Lgga;)V")
    public static final void method3088(boolean arg0, class103 arg1, class513 arg2) {
        if (!arg0) {
            field7369++;
            class721.field10068 = arg2;
            class106.field1527 = arg1;
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IBII)[B")
    public final byte[] method3089(int arg0, byte arg1, int arg2, int arg3) {
        field7368++;
        this.field7373 = new byte[arg0 * arg3 * arg2 * 2];
        int var5 = 120 % ((14 - arg1) / 44);
        this.method4046(arg3, -4995, arg0, arg2);
        return this.field7373;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IIIII)V")
    public static final void method3090(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field7372++;
        if (class388.field5420 != 1) {
            return;
        }
        int var5 = arg3 / class657.field9274;
        int var6 = arg4 / class657.field9274;
        if (arg0 != 3985) {
            return;
        }
        int var7 = arg2 / class36.field432;
        int var8 = arg1 / class36.field432;
        if (class448.field6176 <= var5 || var6 < 0 || class600.field8557 <= var7 || var8 < 0) {
            return;
        }
        if (var5 < 0) {
            var5 = 0;
        }
        if (class600.field8557 <= var8) {
            var8 = class600.field8557 - 1;
        }
        if (var7 < 0) {
            var7 = 0;
        }
        if (class448.field6176 <= var6) {
            var6 = class448.field6176 - 1;
        }
        for (int var9 = var7; var9 <= var8; var9++) {
            int var10 = class381.method2295(27328, class600.field8557, class754.field10490 + var9) * class448.field6176;
            for (int var11 = var5; var11 <= var6; var11++) {
                int var12 = class381.method2295(27328, class448.field6176, class359.field5087 + var11) + var10;
                class770.field10633[var12] = class7.field98;
            }
        }
    }
}
