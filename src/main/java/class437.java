import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tn")
public class class437 {

    @OriginalMember(owner = "client!tn", name = "o", descriptor = "I")
    public int field6514 = 128;

    @OriginalMember(owner = "client!tn", name = "q", descriptor = "I")
    public int field6516 = 128;

    @OriginalMember(owner = "client!tn", name = "p", descriptor = "I")
    public int field6515;

    @OriginalMember(owner = "client!tn", name = "d", descriptor = "I")
    public int field6503;

    @OriginalMember(owner = "client!tn", name = "b", descriptor = "I")
    public int field6501;

    @OriginalMember(owner = "client!tn", name = "e", descriptor = "I")
    public int field6504;

    @OriginalMember(owner = "client!tn", name = "l", descriptor = "Lpn;")
    public static class49 field6511 = new class49(31, 7);

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "I")
    public int field6500;

    @OriginalMember(owner = "client!tn", name = "f", descriptor = "I")
    public int field6505;

    @OriginalMember(owner = "client!tn", name = "g", descriptor = "I")
    public static int field6506;

    @OriginalMember(owner = "client!tn", name = "h", descriptor = "I")
    public int field6507;

    @OriginalMember(owner = "client!tn", name = "i", descriptor = "I")
    public static int field6508;

    @OriginalMember(owner = "client!tn", name = "j", descriptor = "I")
    public int field6509;

    @OriginalMember(owner = "client!tn", name = "k", descriptor = "I")
    public static int field6510;

    @OriginalMember(owner = "client!tn", name = "m", descriptor = "I")
    public static int field6512;

    @OriginalMember(owner = "client!tn", name = "c", descriptor = "Lo;")
    public static class363 field6502;

    @OriginalMember(owner = "client!tn", name = "n", descriptor = "[Lo;")
    public static class363[] field6513;

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(B)V", line = 4)
    public static void method2707(byte arg0) {
        field6502 = null;
        if (arg0 == 22) {
            field6511 = null;
            field6513 = null;
        }
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(Z)Ltn;", line = 22)
    public final class437 method2708(boolean arg0) {
        field6510++;
        return arg0 ? new class437(this.field6515, this.field6516, this.field6514, this.field6504, this.field6501, this.field6503) : null;
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(I)I", line = 33)
    public static final int method2709(int arg0) {
        field6506++;
        if (arg0 != -25310) {
            field6502 = null;
        }
        if (class374.field5527 == null) {
            if (!class256.field4112 && class540.field7909 > 0) {
                if (class76.field1289 && class259.field4151.method30(-7951, 81) && class540.field7909 > 2) {
                    return ((class376) class154.field2370.field690.field1936.field1936).field5547;
                }
                return ((class376) class154.field2370.field690.field1936).field5547;
            }
            int var1 = class377.field5570.method1475((byte) -119);
            int var2 = class377.field5570.method1484(-22647);
            int var3 = class404.field5975;
            int var4 = class354.field5246;
            int var5 = class304.field4657;
            if (var3 < var1 && var1 < var3 + var5) {
                int var6 = -1;
                for (int var7 = 0; var7 < class540.field7909; var7++) {
                    if (class86.field1411) {
                        int var12 = (class540.field7909 - var7 - 1) * 16 + (var4 + 33);
                        if (var2 > var12 - 13 && var2 <= (var12 + 3)) {
                            var6 = var7;
                        }
                    } else {
                        int var11 = (class540.field7909 - var7 - 1) * 16 + (var4 + 31);
                        if (var11 - 13 < var2 && var11 + 3 >= var2) {
                            var6 = var7;
                        }
                    }
                }
                if (var6 != -1) {
                    int var8 = 0;
                    class265 var9 = new class265(class154.field2370);
                    for (class376 var10 = (class376) var9.method1840(-70); var10 != null; var10 = (class376) var9.method1844(116)) {
                        if (var6 == (var8++)) {
                            return var10.field5547;
                        }
                    }
                }
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(Ltn;B)V", line = 126)
    public final void method2710(class437 arg0, byte arg1) {
        this.field6503 = arg0.field6503;
        this.field6514 = arg0.field6514;
        this.field6501 = arg0.field6501;
        field6512++;
        this.field6515 = arg0.field6515;
        if (arg1 > 37) {
            this.field6504 = arg0.field6504;
            this.field6516 = arg0.field6516;
        }
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(III)V", line = 143)
    public static final void method2711(int arg0, int arg1, int arg2) {
        class2.field19++;
        if (arg0 == 81) {
            class110.method857(4095, class191.field2929);
            field6508++;
            class312.field4752.method1395(-3, arg2);
            class312.field4752.method1362(arg1, arg0 ^ 0xFFFFFFEF);
        }
    }

    @OriginalMember(owner = "client!tn", name = "<init>", descriptor = "(I)V", line = 172)
    public class437(int arg0) {
        this.field6515 = arg0;
    }

    @OriginalMember(owner = "client!tn", name = "<init>", descriptor = "(IIIIII)V", line = 179)
    private class437(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field6514 = arg2;
        this.field6516 = arg1;
        this.field6503 = arg5;
        this.field6501 = arg4;
        this.field6504 = arg3;
        this.field6515 = arg0;
    }
}
