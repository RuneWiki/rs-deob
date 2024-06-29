import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class410 {

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "I")
    private int field5624;

    @OriginalMember(owner = "client!ug", name = "j", descriptor = "J")
    private long field5633;

    @OriginalMember(owner = "client!ug", name = "i", descriptor = "I")
    public static int field5632 = 0;

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "[Ljava/awt/Color;")
    public static Color[] field5626 = new Color[] { new Color(9179409), new Color(3289650) };

    @OriginalMember(owner = "client!ug", name = "l", descriptor = "Lvt;")
    public static class344 field5635 = new class344("Loaded SW3D", "SW3D geladen", "SW3D chargé", "SW3D carregado");

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "I")
    public static int field5625;

    @OriginalMember(owner = "client!ug", name = "d", descriptor = "I")
    public static int field5627;

    @OriginalMember(owner = "client!ug", name = "e", descriptor = "I")
    public static int field5628;

    @OriginalMember(owner = "client!ug", name = "f", descriptor = "I")
    public static int field5629;

    @OriginalMember(owner = "client!ug", name = "g", descriptor = "I")
    public static int field5630;

    @OriginalMember(owner = "client!ug", name = "h", descriptor = "I")
    public static int field5631;

    @OriginalMember(owner = "client!ug", name = "k", descriptor = "I")
    public static int field5634;

    @OriginalMember(owner = "client!ug", name = "n", descriptor = "Lhd;")
    public static class270 field5637;

    @OriginalMember(owner = "client!ug", name = "m", descriptor = "Lmn;")
    public static class60 field5636;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(I)I")
    public final int method2442(int arg0) {
        field5631++;
        if (arg0 != -1) {
            this.field5624 = 45;
        }
        return this.field5624;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(BZ[B)Ljava/lang/Object;")
    public static final Object method2443(byte arg0, boolean arg1, byte[] arg2) {
        field5629++;
        if (arg0 != -62) {
            field5635 = null;
        }
        if (arg2 == null) {
            return null;
        }
        if (arg2.length > 136 && !class466.field6619) {
            try {
                class18 var3 = (class18) Class.forName("pf").getDeclaredConstructor().newInstance();
                var3.method85(true, arg2);
                return var3;
            } catch (Throwable var4) {
                class466.field6619 = true;
            }
        }
        return arg1 ? class270.method1650(arg2, 0) : arg2;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(II)Lgh;")
    public final class76 method2444(int arg0, int arg1) {
        if (arg1 != 0) {
            method2443((byte) 63, false, null);
        }
        field5628++;
        return class76.method440(arg1 - 123)[this.method2448((byte) 90, arg0)];
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(BLgh;)V")
    private final void method2445(byte arg0, class76 arg1) {
        this.field5633 |= (arg1.field1030 << class76.field1041 * this.field5624++);
        field5630++;
        if (arg0 != 10) {
            field5635 = null;
        }
    }

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(I)V")
    public static void method2446(int arg0) {
        field5635 = null;
        field5637 = null;
        field5626 = null;
        field5636 = null;
        int var1 = 79 % ((-arg0 - 34) / 61);
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Ljava/lang/String;ZILra;)V")
    public static final void method2447(String arg0, boolean arg1, int arg2, class262 arg3) {
        field5625++;
        byte var4 = 4;
        int var5 = var4 + 6;
        int var6 = var4 + 6;
        int var7 = class621.field8953.method862(null, 250, -27128, arg0);
        int var8 = class621.field8953.method858(-28763, null, arg0, 250) * 13;
        class301.field3918.method997(var5 - var4, var6 - var4, var4 + var4 + var7, var4 + var8 + var4, -16777216, 0);
        class301.field3918.method995(var5 - var4, -var4 + var6, var7 - (-var4 - var4), var4 + var8 + var4, -1, 0);
        arg3.method1617(var6, arg0, arg2 ^ arg2, 1, -1, 0, null, 1, var8, null, 0, var5, null, 0, -1, var7);
        class433.method2527(true, var4 + var8 + var4, var4 - -var4 + var7, var5 - var4, var6 - var4);
        if (arg1) {
            try {
                class301.field3918.method934();
            } catch (class487 var9) {
            }
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(BI)I")
    private final int method2448(byte arg0, int arg1) {
        field5627++;
        if (arg0 != 90) {
            field5636 = null;
        }
        return (int) (this.field5633 >> class76.field1041 * arg1) & 0xF;
    }

    @OriginalMember(owner = "client!ug", name = "<init>", descriptor = "(Lgh;)V")
    public class410(class76 arg0) {
        this.field5624 = 1;
        this.field5633 = arg0.field1030;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(III)Z")
    public static final boolean method2449(int arg0, int arg1, int arg2) {
        if (arg2 != -24892) {
            field5636 = null;
        }
        field5634++;
        return (arg1 & 0x8000) != 0;
    }

    @OriginalMember(owner = "client!ug", name = "<init>", descriptor = "([Lgh;)V")
    public class410(class76[] arg0) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.method2445((byte) 10, arg0[var2]);
        }
    }
}
