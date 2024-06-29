import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class123 extends class435 {

    @OriginalMember(owner = "client!r", name = "u", descriptor = "I")
    public int field1599;

    @OriginalMember(owner = "client!r", name = "n", descriptor = "I")
    public int field1592;

    @OriginalMember(owner = "client!r", name = "s", descriptor = "[Z")
    public boolean[] field1597;

    @OriginalMember(owner = "client!r", name = "v", descriptor = "[I")
    public int[] field1600;

    @OriginalMember(owner = "client!r", name = "y", descriptor = "[[I")
    public int[][] field1603;

    @OriginalMember(owner = "client!r", name = "m", descriptor = "[I")
    public int[] field1591;

    @OriginalMember(owner = "client!r", name = "p", descriptor = "I")
    public static int field1594 = 0;

    @OriginalMember(owner = "client!r", name = "w", descriptor = "Lwc;")
    public static class49 field1601 = new class49();

    @OriginalMember(owner = "client!r", name = "z", descriptor = "I")
    public static int field1604 = 0;

    @OriginalMember(owner = "client!r", name = "l", descriptor = "I")
    public static int field1590;

    @OriginalMember(owner = "client!r", name = "q", descriptor = "I")
    public static int field1595;

    @OriginalMember(owner = "client!r", name = "r", descriptor = "I")
    public static int field1596;

    @OriginalMember(owner = "client!r", name = "t", descriptor = "I")
    public static int field1598;

    @OriginalMember(owner = "client!r", name = "x", descriptor = "I")
    public static int field1602;

    @OriginalMember(owner = "client!r", name = "o", descriptor = "Lfb;")
    public static class478 field1593;

    @OriginalMember(owner = "client!r", name = "c", descriptor = "(I)V")
    public static final void method732(int arg0) {
        field1590++;
        class516.field7506 = null;
        if (arg0 != -2) {
            method734((byte) 35);
        }
        class64.field738 = null;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIILfo;)Lgf;")
    public static final class183 method733(int arg0, int arg1, int arg2, class361 arg3) {
        if (arg2 > -84) {
            method735(-10, -47, -124, -113, 91, 85);
        }
        field1596++;
        byte[] var4 = arg3.method2130(arg1, arg0, -79);
        return var4 == null ? null : new class183(var4);
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(B)V")
    public static void method734(byte arg0) {
        int var1 = 13 / ((-arg0 - 5) / 45);
        field1593 = null;
        field1601 = null;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIII)V")
    public static final void method735(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (class307.field4111 <= arg2 && class91.field1086 >= arg5 && arg3 >= class169.field2184 && arg0 <= class386.field5620) {
            class134.method807((byte) -67, arg0, arg3, arg2, arg4, arg5);
        } else {
            class106.method648(arg5, arg0, arg3, arg4, arg2, (byte) -35);
        }
        if (arg1 > 36) {
            field1602++;
        }
    }

    @OriginalMember(owner = "client!r", name = "<init>", descriptor = "(I[B)V")
    public class123(int arg0, byte[] arg1) {
        this.field1599 = arg0;
        class396 var3 = new class396(arg1);
        this.field1592 = var3.method2388((byte) -123);
        this.field1597 = new boolean[this.field1592];
        this.field1600 = new int[this.field1592];
        this.field1603 = new int[this.field1592][];
        this.field1591 = new int[this.field1592];
        for (int var4 = 0; var4 < this.field1592; var4++) {
            this.field1591[var4] = var3.method2388((byte) -124);
        }
        for (int var5 = 0; var5 < this.field1592; var5++) {
            this.field1597[var5] = var3.method2388((byte) -111) == 1;
        }
        for (int var6 = 0; var6 < this.field1592; var6++) {
            this.field1600[var6] = var3.method2386(-23648);
        }
        for (int var7 = 0; var7 < this.field1592; var7++) {
            this.field1603[var7] = new int[var3.method2388((byte) -128)];
        }
        for (int var8 = 0; var8 < this.field1592; var8++) {
            for (int var9 = 0; var9 < this.field1603[var8].length; var9++) {
                this.field1603[var8][var9] = var3.method2388((byte) -117);
            }
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IBI)V")
    public static final void method736(int arg0, byte arg1, int arg2) {
        field1598++;
        class184 var3 = class277.method1682(arg0, 14, -73);
        var3.method1069(true);
        var3.field2393 = arg2;
        if (arg1 != 11) {
            method735(32, -109, 101, 101, -127, 21);
        }
    }
}
