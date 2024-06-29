import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class455 {

    @OriginalMember(owner = "client!t", name = "j", descriptor = "I")
    public int field6799;

    @OriginalMember(owner = "client!t", name = "c", descriptor = "I")
    public int field6792;

    @OriginalMember(owner = "client!t", name = "h", descriptor = "I")
    public int field6797;

    @OriginalMember(owner = "client!t", name = "f", descriptor = "I")
    public int field6795;

    @OriginalMember(owner = "client!t", name = "b", descriptor = "Llo;")
    public static class306 field6791 = new class306("wave2:", "welle2:", "ondulation2:", "onda2:");

    @OriginalMember(owner = "client!t", name = "d", descriptor = "I")
    public static int field6793 = 0;

    @OriginalMember(owner = "client!t", name = "i", descriptor = "[I")
    public static int[] field6798 = new int[64];

    @OriginalMember(owner = "client!t", name = "a", descriptor = "I")
    public static int field6790;

    @OriginalMember(owner = "client!t", name = "e", descriptor = "I")
    public static int field6794;

    @OriginalMember(owner = "client!t", name = "g", descriptor = "I")
    public static int field6796;

    @OriginalMember(owner = "client!t", name = "k", descriptor = "I")
    public static int field6800;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "([BIIIII)Z", line = 5)
    public static final boolean method2729(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field6790++;
        boolean var6 = true;
        class23 var7 = new class23(arg0);
        int var8 = arg5;
        label68: while (true) {
            int var9 = var7.method179(-30);
            if (var9 == 0) {
                return var6;
            }
            var8 += var9;
            int var10 = 0;
            boolean var11 = false;
            while (true) {
                int var15;
                class39 var18;
                do {
                    int var16;
                    int var17;
                    do {
                        do {
                            do {
                                do {
                                    while (var11) {
                                        int var19 = var7.method123(false);
                                        if (var19 == 0) {
                                            continue label68;
                                        }
                                        var7.method126((byte) -127);
                                    }
                                    int var12 = var7.method123(false);
                                    if (var12 == 0) {
                                        continue label68;
                                    }
                                    var10 += var12 - 1;
                                    int var13 = var10 & 0x3F;
                                    int var14 = var10 >> 6 & 0x3F;
                                    var15 = var7.method126((byte) -99) >> 2;
                                    var16 = var14 + arg2;
                                    var17 = arg4 + var13;
                                } while (var16 <= 0);
                            } while (var17 <= 0);
                        } while (var16 >= (arg3 - 1));
                    } while (var17 >= arg1 - 1);
                    var18 = class61.field928.method791(var8, true);
                } while (var15 == 22 && !class510.field7403.field5118 && var18.field618 == 0 && var18.field614 != 1 && !var18.field643);
                var11 = true;
                if (!var18.method288(-5506)) {
                    class485.field7117++;
                    var6 = false;
                }
            }
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(II)Lt;", line = 93)
    public final class455 method2730(int arg0, int arg1) {
        if (arg0 != -1) {
            this.method2730(-79, -89);
        }
        field6800++;
        return new class455(this.field6799, arg1, this.field6795, this.field6792);
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(BI)I", line = 104)
    public static final int method2731(byte arg0, int arg1) {
        field6796++;
        if (arg0 > -85) {
            method2729(null, -76, -100, 15, -69, -99);
        }
        if (arg1 < 96) {
            return 0;
        } else if (arg1 < 128) {
            return 2;
        } else {
            return 3;
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(I)V", line = 123)
    public static void method2732(int arg0) {
        field6798 = null;
        if (arg0 != -1) {
            method2732(116);
        }
        field6791 = null;
    }

    @OriginalMember(owner = "client!t", name = "<init>", descriptor = "(IIII)V", line = 149)
    public class455(int arg0, int arg1, int arg2, int arg3) {
        this.field6799 = arg0;
        this.field6792 = arg3;
        this.field6797 = arg1;
        this.field6795 = arg2;
    }
}
