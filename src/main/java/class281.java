import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class281 extends class336 {

    @OriginalMember(owner = "client!cf", name = "k", descriptor = "[I")
    public int[] field3822;

    @OriginalMember(owner = "client!cf", name = "h", descriptor = "[I")
    public int[] field3819;

    @OriginalMember(owner = "client!cf", name = "m", descriptor = "Z")
    public static boolean field3824 = true;

    @OriginalMember(owner = "client!cf", name = "o", descriptor = "Lew;")
    public static class270 field3826 = new class270(64);

    @OriginalMember(owner = "client!cf", name = "q", descriptor = "I")
    public static int field3828;

    @OriginalMember(owner = "client!cf", name = "i", descriptor = "I")
    public static int field3820;

    @OriginalMember(owner = "client!cf", name = "j", descriptor = "I")
    public static int field3821;

    @OriginalMember(owner = "client!cf", name = "l", descriptor = "I")
    public static int field3823;

    @OriginalMember(owner = "client!cf", name = "n", descriptor = "I")
    public static int field3825;

    @OriginalMember(owner = "client!cf", name = "p", descriptor = "I")
    public static int field3827;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(ILat;)V")
    public static final void method1623(int arg0, class444 arg1) {
        if (arg0 != 5) {
            field3828 = -99;
        }
        field3823++;
        if (class92.field1516 != arg1.field6384) {
            return;
        }
        if (class81.field1158.field7036 == null) {
            arg1.field6414 = 0;
            arg1.field6486 = 0;
            return;
        }
        arg1.field6538 = 150;
        arg1.field6490 = (int) (Math.sin((double) class28.field417 / 40.0D) * 256.0D) & 0x7FF;
        arg1.field6486 = class484.field6972;
        arg1.field6493 = 5;
        arg1.field6414 = class213.method1346(class81.field1158.field7036, arg0 ^ 0x5DCB8EE0);
        arg1.field6484 = class81.field1158.field240;
        arg1.field6492 = 0;
        arg1.field6442 = class81.field1158.field186;
        arg1.field6479 = class81.field1158.field210;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(BI[Ljava/lang/Object;[JI)V")
    public static final void method1624(byte arg0, int arg1, Object[] arg2, long[] arg3, int arg4) {
        if (arg4 < arg1) {
            int var5 = (arg4 + arg1) / 2;
            int var6 = arg4;
            long var7 = arg3[var5];
            arg3[var5] = arg3[arg1];
            arg3[arg1] = var7;
            Object var9 = arg2[var5];
            arg2[var5] = arg2[arg1];
            arg2[arg1] = var9;
            int var10 = ~var7 == Long.MIN_VALUE ? 0 : 1;
            for (int var11 = arg4; var11 < arg1; var11++) {
                if (arg3[var11] < var7 + ((long) (var11 & var10))) {
                    long var12 = arg3[var11];
                    arg3[var11] = arg3[var6];
                    arg3[var6] = var12;
                    Object var14 = arg2[var11];
                    arg2[var11] = arg2[var6];
                    arg2[var6++] = var14;
                }
            }
            arg3[arg1] = arg3[var6];
            arg3[var6] = var7;
            arg2[arg1] = arg2[var6];
            arg2[var6] = var9;
            method1624((byte) 83, var6 - 1, arg2, arg3, arg4);
            method1624((byte) 83, arg1, arg2, arg3, var6 + 1);
        }
        field3820++;
        if (arg0 != 83) {
            field3828 = 95;
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)V")
    public static void method1625(int arg0) {
        field3826 = null;
        if (arg0 != 0) {
            field3826 = null;
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IBI)Z")
    public static final boolean method1626(int arg0, byte arg1, int arg2) {
        field3821++;
        if (arg1 != -22) {
            method1626(-112, (byte) 80, 81);
        }
        return (arg2 & 0x800) != 0 && (arg0 & 0x37) != 0;
    }

    @OriginalMember(owner = "client!cf", name = "<init>", descriptor = "(II[I[I)V")
    public class281(int arg0, int arg1, int[] arg2, int[] arg3) {
        this.field3822 = arg2;
        this.field3819 = arg3;
    }

    static {
        new class157(null, "Spieler nicht auf deiner Freunde-Liste.", null, null);
        field3828 = -1;
    }
}
