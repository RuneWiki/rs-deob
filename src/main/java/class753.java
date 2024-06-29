import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gfa")
public class class753 extends class513 {

    @OriginalMember(owner = "client!gfa", name = "p", descriptor = "I")
    public int field10459 = -1;

    @OriginalMember(owner = "client!gfa", name = "n", descriptor = "Z")
    public boolean field10457 = false;

    @OriginalMember(owner = "client!gfa", name = "q", descriptor = "[F")
    public static float[] field10460 = new float[4];

    @OriginalMember(owner = "client!gfa", name = "z", descriptor = "[Lat;")
    public static class376[] field10469 = new class376[37];

    @OriginalMember(owner = "client!gfa", name = "k", descriptor = "I")
    public static int field10454;

    @OriginalMember(owner = "client!gfa", name = "l", descriptor = "I")
    public int field10455;

    @OriginalMember(owner = "client!gfa", name = "m", descriptor = "I")
    public int field10456;

    @OriginalMember(owner = "client!gfa", name = "o", descriptor = "I")
    public int field10458;

    @OriginalMember(owner = "client!gfa", name = "r", descriptor = "I")
    public int field10461;

    @OriginalMember(owner = "client!gfa", name = "s", descriptor = "I")
    public static int field10462;

    @OriginalMember(owner = "client!gfa", name = "t", descriptor = "I")
    public static int field10463;

    @OriginalMember(owner = "client!gfa", name = "u", descriptor = "I")
    public static int field10464;

    @OriginalMember(owner = "client!gfa", name = "v", descriptor = "I")
    public int field10465;

    @OriginalMember(owner = "client!gfa", name = "w", descriptor = "I")
    public static int field10466;

    @OriginalMember(owner = "client!gfa", name = "x", descriptor = "I")
    public static int field10467;

    @OriginalMember(owner = "client!gfa", name = "y", descriptor = "I")
    public static int field10468;

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "(B)V")
    public static final void method4171(byte arg0) {
        field10468++;
        if (!class699.field9743) {
            return;
        }
        if (arg0 >= -97) {
            field10460 = null;
        }
        while (true) {
            while (class426.field5897 < class571.field8083.length) {
                class183 var1 = class571.field8083[class426.field5897];
                if (var1 != null && var1.field2648 == -1) {
                    if (class245.field3417 == null) {
                        class245.field3417 = class641.field9106.method3729((byte) -121, var1.field2659);
                    }
                    int var2 = class245.field3417.field9454;
                    if (var2 == -1) {
                        return;
                    }
                    var1.field2648 = var2;
                    class426.field5897++;
                    class245.field3417 = null;
                } else {
                    class426.field5897++;
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "(III)I")
    public static final int method4172(int arg0, int arg1, int arg2) {
        field10454++;
        return ~arg0 == arg1 || arg0 == 3 ? class486.field6565[arg2 & 0x3] : class752.field10447[arg2 & 0x3];
    }

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "(IIIIIILha;I)V")
    public static final void method4173(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class545 arg6, int arg7) {
        field10462++;
        class410.field5731 = arg6;
        class19.field237 = class410.field5731.method2141();
        class76.field1051 = class410.field5731.method2141();
        class430.field5926 = class410.field5731.method2141();
        class637.field9052 = arg5;
        class637.field9059 = null;
        class272.field3672 = arg7;
        class459.field6317 = arg2;
        class61.field829 = arg3;
        class589.field8461 = arg4;
        class11.field136 = 0;
        class717.field10140 = 0;
        class259.method1613((byte) -21, arg1, arg0);
    }

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "(ILvj;)Lte;")
    public static final class48 method4174(int arg0, class26 arg1) {
        field10463++;
        if (arg0 >= -102) {
            field10469 = null;
        }
        return new class48(arg1.method173(-3), arg1.method173(-3), arg1.method173(-3), arg1.method173(-3), arg1.method173(-3), arg1.method173(-3), arg1.method173(-3), arg1.method173(-3), arg1.method186((byte) 113), arg1.method194((byte) 119));
    }

    @OriginalMember(owner = "client!gfa", name = "b", descriptor = "(III)Z")
    public static final boolean method4175(int arg0, int arg1, int arg2) {
        field10466++;
        if (arg0 != -12388) {
            method4174(35, null);
        }
        if (arg2 >= 0 && arg1 >= 0 && arg2 < class429.field5916[1].length && arg1 < class429.field5916[1][arg2].length) {
            return (class429.field5916[1][arg2][arg1] & 0x2) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "(Ljava/lang/String;II)V")
    public static final void method4176(String arg0, int arg1, int arg2) {
        field10467++;
        class118 var3 = class126.method814(true, arg1, arg2);
        var3.method771(-30559);
        var3.field1638 = arg0;
    }

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "(IIZ)V")
    public static final void method4177(int arg0, int arg1, boolean arg2) {
        field10464++;
        class118 var3 = class126.method814(arg2, 0, 15);
        var3.method771(-30559);
        var3.field1636 = arg1;
        var3.field1629 = arg0;
    }

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "(I)V")
    public static void method4178(int arg0) {
        if (arg0 > -30) {
            method4174(65, null);
        }
        field10460 = null;
        field10469 = null;
    }

    @OriginalMember(owner = "client!gfa", name = "<init>", descriptor = "(I)V")
    public class753(int arg0) {
        this.field10459 = arg0;
    }
}
