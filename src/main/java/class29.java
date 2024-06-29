import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class29 extends class77 {

    @OriginalMember(owner = "client!cf", name = "D", descriptor = "I")
    public int field533 = 0;

    @OriginalMember(owner = "client!cf", name = "G", descriptor = "I")
    public static int field536 = 0;

    @OriginalMember(owner = "client!cf", name = "L", descriptor = "Ldc;")
    public static class37 field541 = class185.method1233((byte) 86, "title_mute");

    @OriginalMember(owner = "client!cf", name = "H", descriptor = "Lbb;")
    public static class14 field537 = new class14(64);

    @OriginalMember(owner = "client!cf", name = "P", descriptor = "Ldc;")
    public static class37 field545 = class185.method1233((byte) 86, "overlay)3dat");

    @OriginalMember(owner = "client!cf", name = "M", descriptor = "I")
    public static int field542 = 0;

    @OriginalMember(owner = "client!cf", name = "O", descriptor = "Z")
    public static boolean field544 = false;

    @OriginalMember(owner = "client!cf", name = "Q", descriptor = "[I")
    public static int[] field546 = new int[50];

    @OriginalMember(owner = "client!cf", name = "E", descriptor = "I")
    public static int field534;

    @OriginalMember(owner = "client!cf", name = "F", descriptor = "I")
    public static int field535;

    @OriginalMember(owner = "client!cf", name = "I", descriptor = "I")
    public static int field538;

    @OriginalMember(owner = "client!cf", name = "J", descriptor = "I")
    public static int field539;

    @OriginalMember(owner = "client!cf", name = "K", descriptor = "I")
    public static int field540;

    @OriginalMember(owner = "client!cf", name = "N", descriptor = "I")
    public static int field543;

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(Z)V")
    public static final void method238(boolean arg0) {
        if (!arg0) {
            field546 = null;
        }
        field540++;
        System.out.println("Usage: worldid, [live/office/local], [live/rc/wip], [lowmem/highmem], [free/members], [english/german], [game0/game1]");
        System.exit(1);
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(BLce;)V")
    public final void method239(byte arg0, class28 arg1) {
        while (true) {
            int var3 = arg1.method215(-1797813752);
            if (var3 == 0) {
                if (arg0 > -14) {
                    field541 = null;
                }
                field535++;
                return;
            }
            this.method243(var3, arg1, -104);
        }
    }

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "(B)V")
    public static void method240(byte arg0) {
        field537 = null;
        field545 = null;
        if (arg0 >= -22) {
            field542 = -113;
        }
        field546 = null;
        field541 = null;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIIILia;IJIIII)Z")
    public static final boolean method241(int arg0, int arg1, int arg2, int arg3, class88 arg4, int arg5, long arg6, int arg7, int arg8, int arg9, int arg10) {
        return arg4 == null ? true : class92.method603(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6);
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IBI[II)V")
    public static final void method242(int arg0, byte arg1, int arg2, int[] arg3, int arg4) {
        arg4--;
        if (arg1 != -30) {
            return;
        }
        field538++;
        int var6 = arg0 - 1;
        int var5 = var6 - 7;
        while (var5 > arg4) {
            int var7 = arg4 + 1;
            arg3[var7] = arg2;
            int var8 = var7 + 1;
            arg3[var8] = arg2;
            int var9 = var8 + 1;
            arg3[var9] = arg2;
            int var10 = var9 + 1;
            arg3[var10] = arg2;
            int var11 = var10 + 1;
            arg3[var11] = arg2;
            int var12 = var11 + 1;
            arg3[var12] = arg2;
            int var13 = var12 + 1;
            arg3[var13] = arg2;
            arg4 = var13 + 1;
            arg3[arg4] = arg2;
        }
        while (var6 > arg4) {
            arg4++;
            arg3[arg4] = arg2;
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(ILce;I)V")
    private final void method243(int arg0, class28 arg1, int arg2) {
        field534++;
        if (arg0 == 5) {
            this.field533 = arg1.method230((byte) -114);
        }
        if (arg2 > -41) {
            method238(true);
        }
    }
}
