import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class641 extends class340 {

    @OriginalMember(owner = "client!hg", name = "m", descriptor = "I")
    private int field9161;

    @OriginalMember(owner = "client!hg", name = "r", descriptor = "I")
    private int field9166;

    @OriginalMember(owner = "client!hg", name = "q", descriptor = "I")
    private int field9165;

    @OriginalMember(owner = "client!hg", name = "s", descriptor = "I")
    private int field9167;

    @OriginalMember(owner = "client!hg", name = "n", descriptor = "I")
    private int field9162;

    @OriginalMember(owner = "client!hg", name = "j", descriptor = "Lkga;")
    private class506 field9158;

    @OriginalMember(owner = "client!hg", name = "o", descriptor = "I")
    private int field9163;

    @OriginalMember(owner = "client!hg", name = "k", descriptor = "I")
    public static int field9159 = 0;

    @OriginalMember(owner = "client!hg", name = "i", descriptor = "Lwo;")
    public static class690 field9157 = new class690(52, 3);

    @OriginalMember(owner = "client!hg", name = "l", descriptor = "I")
    public static int field9160;

    @OriginalMember(owner = "client!hg", name = "p", descriptor = "I")
    public static int field9164;

    @OriginalMember(owner = "client!hg", name = "h", descriptor = "Lsa;")
    private class187 field9156;

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "(I)Lsa;")
    public final class187 method1959(int arg0) {
        field9160++;
        if (arg0 != -1199488062) {
            method3649(91);
        }
        if (this.field9156 == null) {
            class212 var2 = this.field9158.field2023;
            class153.field1893[4] = this.field9162;
            class153.field1893[5] = this.field9166;
            class153.field1893[2] = this.field9165;
            class153.field1893[3] = this.field9161;
            class153.field1893[0] = this.field9163;
            class153.field1893[1] = this.field9167;
            boolean var3 = false;
            int var4 = 0;
            for (int var5 = 0; var5 < 6; var5++) {
                if (!var2.method395(class153.field1893[var5], 28576)) {
                    return null;
                }
                class352 var7 = var2.method397(class153.field1893[var5], (byte) -126);
                int var8 = var7.field4708 ? 64 : 128;
                if (var4 < var8) {
                    var4 = var8;
                }
                if (var7.field4710 > 0) {
                    var3 = true;
                }
            }
            for (int var6 = 0; var6 < 6; var6++) {
                class285.field3865[var6] = var2.method400(var4, false, var4, (byte) -73, class153.field1893[var6], 1.0F);
            }
            this.field9156 = new class187(this.field9158, 6407, var4, var3, class285.field3865);
        }
        return this.field9156;
    }

    @OriginalMember(owner = "client!hg", name = "d", descriptor = "(I)V")
    public static void method3648(int arg0) {
        field9157 = null;
        if (arg0 != 64) {
            field9159 = -45;
        }
    }

    @OriginalMember(owner = "client!hg", name = "e", descriptor = "(I)V")
    public static final void method3649(int arg0) {
        field9164++;
        int var1 = 57 % ((arg0 + 31) / 39);
        class377.field5073.method255(class24.field581, class433.field6219, class133.field1692);
    }

    @OriginalMember(owner = "client!hg", name = "<init>", descriptor = "(Lkga;IIIIII)V")
    public class641(class506 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field9161 = arg4;
        this.field9166 = arg6;
        this.field9165 = arg3;
        this.field9167 = arg2;
        this.field9162 = arg5;
        this.field9158 = arg0;
        this.field9163 = arg1;
    }
}
