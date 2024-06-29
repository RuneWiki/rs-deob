import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public class class8 extends class134 {

    @OriginalMember(owner = "client!rj", name = "q", descriptor = "I")
    public int field130;

    @OriginalMember(owner = "client!rj", name = "E", descriptor = "I")
    public int field143;

    @OriginalMember(owner = "client!rj", name = "A", descriptor = "[Z")
    public boolean[] field140;

    @OriginalMember(owner = "client!rj", name = "w", descriptor = "[[I")
    public int[][] field136;

    @OriginalMember(owner = "client!rj", name = "z", descriptor = "[I")
    public int[] field139;

    @OriginalMember(owner = "client!rj", name = "s", descriptor = "[I")
    public int[] field132;

    @OriginalMember(owner = "client!rj", name = "n", descriptor = "I")
    public static int field127 = 0;

    @OriginalMember(owner = "client!rj", name = "v", descriptor = "Ljava/lang/String;")
    public static String field135 = "Opened title screen";

    @OriginalMember(owner = "client!rj", name = "p", descriptor = "I")
    public static int field129 = -1;

    @OriginalMember(owner = "client!rj", name = "t", descriptor = "I")
    public static int field133 = 0;

    @OriginalMember(owner = "client!rj", name = "o", descriptor = "I")
    public static int field128;

    @OriginalMember(owner = "client!rj", name = "r", descriptor = "I")
    public static int field131;

    @OriginalMember(owner = "client!rj", name = "u", descriptor = "I")
    public static int field134;

    @OriginalMember(owner = "client!rj", name = "x", descriptor = "I")
    public static int field137;

    @OriginalMember(owner = "client!rj", name = "y", descriptor = "I")
    public static int field138;

    @OriginalMember(owner = "client!rj", name = "B", descriptor = "I")
    public static int field141;

    @OriginalMember(owner = "client!rj", name = "D", descriptor = "I")
    public static int field142;

    @OriginalMember(owner = "client!rj", name = "G", descriptor = "I")
    public static int field145;

    @OriginalMember(owner = "client!rj", name = "F", descriptor = "[[Lcc;")
    public static class222[][] field144;

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "([BZB)Ljava/lang/Object;")
    public static final Object method51(byte[] arg0, boolean arg1, byte arg2) {
        if (arg2 != -9) {
            field135 = null;
        }
        field145++;
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !class20.field276) {
            try {
                class101 var3 = (class101) Class.forName("la").getDeclaredConstructor().newInstance();
                var3.method767(arg0, 86);
                return var3;
            } catch (Throwable var4) {
                class20.field276 = true;
            }
        }
        return arg1 ? class151.method1096((byte) 37, arg0) : arg0;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lqb;")
    public static final class59 method52(Throwable arg0, String arg1) {
        field131++;
        class59 var2;
        if (arg0 instanceof class59) {
            var2 = (class59) arg0;
            var2.field945 = var2.field945 + ' ' + arg1;
        } else {
            var2 = new class59(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!rj", name = "c", descriptor = "(B)V")
    public static void method53(byte arg0) {
        field144 = null;
        field135 = null;
        if (arg0 != -64) {
            field129 = -80;
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(Lub;Lub;B)I")
    public static final int method54(class92 arg0, class92 arg1, byte arg2) {
        field134++;
        int var3 = 0;
        if (arg1.method697(arg2 + 38, class172.field2639)) {
            var3++;
        }
        if (arg1.method697(50, class181.field2831)) {
            var3++;
        }
        if (arg1.method697(107, class297.field4779)) {
            var3++;
        }
        if (arg0.method697(-102, class172.field2639)) {
            var3++;
        }
        if (arg2 != -39) {
            field128 = 55;
        }
        if (arg0.method697(arg2 + 142, class181.field2831)) {
            var3++;
        }
        if (arg0.method697(61, class297.field4779)) {
            var3++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!rj", name = "<init>", descriptor = "(I[B)V")
    public class8(int arg0, byte[] arg1) {
        this.field130 = arg0;
        class31 var3 = new class31(arg1);
        this.field143 = var3.method265(-124);
        this.field140 = new boolean[this.field143];
        this.field136 = new int[this.field143][];
        this.field139 = new int[this.field143];
        this.field132 = new int[this.field143];
        for (int var4 = 0; var4 < this.field143; var4++) {
            this.field132[var4] = var3.method265(-114);
        }
        for (int var5 = 0; var5 < this.field143; var5++) {
            this.field140[var5] = var3.method265(-91) == 1;
        }
        for (int var6 = 0; var6 < this.field143; var6++) {
            this.field139[var6] = var3.method260((byte) -67);
        }
        for (int var7 = 0; var7 < this.field143; var7++) {
            this.field136[var7] = new int[var3.method265(-112)];
        }
        for (int var8 = 0; var8 < this.field143; var8++) {
            for (int var9 = 0; var9 < this.field136[var8].length; var9++) {
                this.field136[var8][var9] = var3.method265(-105);
            }
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IIIIBILhd;)Lhd;")
    public static final class11 method55(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, class11 arg6) {
        long var7 = (long) arg1;
        if (arg4 > -61) {
            field127 = -9;
        }
        field141++;
        class11 var9 = (class11) class98.field1571.method1173(var7, true);
        if (var9 == null) {
            class271 var10 = class271.method1859(class233.field3687, arg1, 0);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method1844(64, 768, -50, -10, -50);
            class98.field1571.method1167((byte) 112, var9, var7);
        }
        int var11 = arg6.method67();
        int var12 = arg6.method89();
        int var13 = arg6.method76();
        int var14 = arg6.method72();
        class11 var15 = var9.method68(true, true, true);
        if (arg0 != 0) {
            var15.method66(arg0);
        }
        class87 var16 = (class87) var15;
        if (class254.method1721(-580808345, class130.field1941, arg5 + var13, arg2 - -var11) != arg3 || class254.method1721(-580808345, class130.field1941, arg5 + var14, arg2 + var12) != arg3) {
            for (int var17 = 0; var17 < var16.field1304; var17++) {
                var16.field1329[var17] += class254.method1721(-580808345, class130.field1941, var16.field1296[var17] + arg5, var16.field1291[var17] - -arg2) - arg3;
            }
            var16.field1307 = false;
        }
        return var15;
    }
}
