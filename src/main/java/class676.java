import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class676 extends class665 {

    @OriginalMember(owner = "client!hb", name = "p", descriptor = "I")
    public static int field9555 = 0;

    @OriginalMember(owner = "client!hb", name = "D", descriptor = "Z")
    public static boolean field9569 = false;

    @OriginalMember(owner = "client!hb", name = "I", descriptor = "Z")
    public static boolean field9574 = false;

    @OriginalMember(owner = "client!hb", name = "l", descriptor = "I")
    public int field9551;

    @OriginalMember(owner = "client!hb", name = "m", descriptor = "I")
    public int field9552;

    @OriginalMember(owner = "client!hb", name = "n", descriptor = "I")
    public int field9553;

    @OriginalMember(owner = "client!hb", name = "q", descriptor = "I")
    public int field9556;

    @OriginalMember(owner = "client!hb", name = "r", descriptor = "I")
    public int field9557;

    @OriginalMember(owner = "client!hb", name = "s", descriptor = "I")
    public int field9558;

    @OriginalMember(owner = "client!hb", name = "u", descriptor = "I")
    public int field9560;

    @OriginalMember(owner = "client!hb", name = "v", descriptor = "I")
    public int field9561;

    @OriginalMember(owner = "client!hb", name = "w", descriptor = "I")
    public int field9562;

    @OriginalMember(owner = "client!hb", name = "y", descriptor = "I")
    public int field9564;

    @OriginalMember(owner = "client!hb", name = "z", descriptor = "I")
    public int field9565;

    @OriginalMember(owner = "client!hb", name = "A", descriptor = "I")
    public static int field9566;

    @OriginalMember(owner = "client!hb", name = "B", descriptor = "I")
    public int field9567;

    @OriginalMember(owner = "client!hb", name = "C", descriptor = "I")
    public int field9568;

    @OriginalMember(owner = "client!hb", name = "E", descriptor = "I")
    public int field9570;

    @OriginalMember(owner = "client!hb", name = "F", descriptor = "I")
    public int field9571;

    @OriginalMember(owner = "client!hb", name = "G", descriptor = "I")
    public static int field9572;

    @OriginalMember(owner = "client!hb", name = "H", descriptor = "I")
    public int field9573;

    @OriginalMember(owner = "client!hb", name = "K", descriptor = "I")
    public static int field9576;

    @OriginalMember(owner = "client!hb", name = "L", descriptor = "I")
    public int field9577;

    @OriginalMember(owner = "client!hb", name = "J", descriptor = "Lmm;")
    public class250 field9575;

    @OriginalMember(owner = "client!hb", name = "o", descriptor = "Los;")
    public class406 field9554;

    @OriginalMember(owner = "client!hb", name = "x", descriptor = "Lpu;")
    public static class522 field9563;

    @OriginalMember(owner = "client!hb", name = "k", descriptor = "Lcv;")
    public class527 field9550;

    @OriginalMember(owner = "client!hb", name = "t", descriptor = "Lre;")
    public class557 field9559;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(B)V")
    public final void method3757(byte arg0) {
        field9566++;
        this.field9554 = null;
        this.field9575 = null;
        this.field9559 = null;
        if (arg0 >= -22) {
            method3758((byte) 49);
        }
        this.field9550 = null;
    }

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(B)V")
    public static void method3758(byte arg0) {
        int var1 = 56 % ((7 - arg0) / 59);
        field9563 = null;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(I)V")
    public static final void method3759(int arg0) {
        class293.field4322 = arg0;
        for (int var1 = 0; var1 < class302.field4492; var1++) {
            for (int var2 = 0; var2 < class8.field82; var2++) {
                if (class153.field2210[arg0][var1][var2] == null) {
                    class153.field2210[arg0][var1][var2] = new class40(arg0);
                }
            }
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(ILmo;)V")
    public static final void method3760(int arg0, class695 arg1) {
        field9572++;
        if (arg0 > arg1.field9796.length - arg1.field9761) {
            return;
        }
        int var2 = arg1.method3826(false);
        if (var2 < 0 || var2 > 1 || arg1.field9796.length - arg1.field9761 < 2) {
            return;
        }
        int var3 = arg1.method3847((byte) 118);
        if (arg1.field9796.length - arg1.field9761 < var3 * 6) {
            return;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = arg1.method3847((byte) 118);
            int var6 = arg1.method3880(8);
            if (var5 < class524.field7403.length && class591.field8281[var5] && (class278.field4204.method636((byte) -59, var5).field6488 != '1' || var6 >= -1 && var6 <= 1)) {
                class524.field7403[var5] = var6;
            }
        }
    }
}
