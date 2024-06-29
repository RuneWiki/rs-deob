import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class209 extends class80 {

    @OriginalMember(owner = "client!vc", name = "I", descriptor = "Lmn;")
    public static class249 field3337 = new class249(64);

    @OriginalMember(owner = "client!vc", name = "J", descriptor = "[I")
    public static int[] field3338 = new int[14];

    @OriginalMember(owner = "client!vc", name = "N", descriptor = "I")
    public static int field3342 = 0;

    @OriginalMember(owner = "client!vc", name = "K", descriptor = "Los;")
    public static class309 field3339 = new class309(" from your friends list first.", " zuerst von deiner Freunde-Liste!", " de votre liste d'amis.", " da sua lista de amigos primeiro.");

    @OriginalMember(owner = "client!vc", name = "O", descriptor = "Lkp;")
    public static class341 field3343 = new class341("stellardawn", 1);

    @OriginalMember(owner = "client!vc", name = "M", descriptor = "F")
    public static float field3341;

    @OriginalMember(owner = "client!vc", name = "L", descriptor = "I")
    public static int field3340;

    @OriginalMember(owner = "client!vc", name = "<init>", descriptor = "()V", line = 3)
    public class209() {
        super(1, true);
    }

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "(I)V", line = 8)
    public static void method1429(int arg0) {
        field3339 = null;
        field3338 = null;
        field3343 = null;
        field3337 = null;
        if (arg0 != 11107) {
            method1429(-37);
        }
    }

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(II)[I", line = 22)
    public final int[] method25(int arg0, int arg1) {
        ++field3340;
        int[] var3 = super.field1601.method48(arg0, (byte) 0);
        if (super.field1601.field124) {
            int[][] var4 = this.method713(0, arg1 + 16789, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            for (int var8 = 0; ~class137.field2308 < ~var8; ++var8) {
                var3[var8] = (var5[var8] + var6[var8] + var7[var8]) / 3;
            }
        }
        if (arg1 != -16828) {
            field3339 = null;
        }
        return var3;
    }
}
