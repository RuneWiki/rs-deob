import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ro")
public class class2 extends class146 {

    @OriginalMember(owner = "client!ro", name = "y", descriptor = "I")
    private int field33;

    @OriginalMember(owner = "client!ro", name = "v", descriptor = "I")
    private int field30;

    @OriginalMember(owner = "client!ro", name = "t", descriptor = "I")
    private int field28;

    @OriginalMember(owner = "client!ro", name = "n", descriptor = "I")
    private int field22;

    @OriginalMember(owner = "client!ro", name = "r", descriptor = "I")
    private int field26;

    @OriginalMember(owner = "client!ro", name = "m", descriptor = "Lgi;")
    private class583 field21;

    @OriginalMember(owner = "client!ro", name = "q", descriptor = "I")
    private int field25;

    @OriginalMember(owner = "client!ro", name = "p", descriptor = "Lh;")
    public static class571 field24 = new class571(50);

    @OriginalMember(owner = "client!ro", name = "s", descriptor = "I")
    public static int field27 = 0;

    @OriginalMember(owner = "client!ro", name = "u", descriptor = "I")
    public static int field29 = 500;

    @OriginalMember(owner = "client!ro", name = "o", descriptor = "I")
    public static int field23;

    @OriginalMember(owner = "client!ro", name = "w", descriptor = "I")
    public static int field31;

    @OriginalMember(owner = "client!ro", name = "x", descriptor = "I")
    public static int field32;

    @OriginalMember(owner = "client!ro", name = "l", descriptor = "Lnm;")
    private class403 field20;

    @OriginalMember(owner = "client!ro", name = "c", descriptor = "(I)V")
    public static void method10(int arg0) {
        if (arg0 != 19340) {
            method10(-80);
        }
        field24 = null;
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(I)Lnm;")
    public final class403 method11(int arg0) {
        field23++;
        if (this.field20 == null) {
            class130.field2095[1] = this.field26;
            class130.field2095[4] = this.field25;
            class130.field2095[2] = this.field28;
            class130.field2095[5] = this.field33;
            class130.field2095[0] = this.field22;
            class17 var2 = this.field21.field2924;
            class130.field2095[3] = this.field30;
            byte var3 = 0;
            int var4 = 0;
            for (int var5 = 0; var5 < 6; var5++) {
                if (!var2.method188(class130.field2095[var5], -127)) {
                    return null;
                }
                class211 var7 = var2.method190((byte) -89, class130.field2095[var5]);
                int var8 = var7.field2965 ? 64 : 128;
                if (var7.field2980 > 0) {
                    var3 = 1;
                }
                if (var4 < var8) {
                    var4 = var8;
                }
            }
            for (int var6 = 0; var6 < 6; var6++) {
                class628.field9194[var6] = var2.method186(false, class130.field2095[var6], 10350, var4, var4, 1.0F);
            }
            this.field20 = new class403(this.field21, 6407, var4, var3 != 0, class628.field9194);
        }
        int var9 = -4 / ((43 - arg0) / 57);
        return this.field20;
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(II)V")
    public static final void method12(int arg0, int arg1) {
        field32++;
        class537.field7516 = arg1;
        field24.method3246(false);
        if (arg0 != 4) {
            field27 = 5;
        }
    }

    @OriginalMember(owner = "client!ro", name = "<init>", descriptor = "(Lgi;IIIIII)V")
    public class2(class583 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field33 = arg6;
        this.field30 = arg4;
        this.field28 = arg3;
        this.field22 = arg1;
        this.field26 = arg2;
        this.field21 = arg0;
        this.field25 = arg5;
    }
}
