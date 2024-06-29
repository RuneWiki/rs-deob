import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class123 extends class248 {

    @OriginalMember(owner = "client!dk", name = "u", descriptor = "Lij;")
    public static class50 field2155 = class78.method578(124, "gelb:");

    @OriginalMember(owner = "client!dk", name = "x", descriptor = "I")
    public static volatile int field2158 = 0;

    @OriginalMember(owner = "client!dk", name = "C", descriptor = "I")
    public static int field2163 = 0;

    @OriginalMember(owner = "client!dk", name = "D", descriptor = "Lpe;")
    public static class100 field2164 = new class100(30);

    @OriginalMember(owner = "client!dk", name = "E", descriptor = "Lij;")
    public static class50 field2165 = class78.method578(125, "hint_mapedge");

    @OriginalMember(owner = "client!dk", name = "F", descriptor = "[[[I")
    public static int[][][] field2166 = new int[2][][];

    @OriginalMember(owner = "client!dk", name = "t", descriptor = "I")
    public static int field2154;

    @OriginalMember(owner = "client!dk", name = "v", descriptor = "I")
    public static int field2156;

    @OriginalMember(owner = "client!dk", name = "w", descriptor = "I")
    public static int field2157;

    @OriginalMember(owner = "client!dk", name = "z", descriptor = "I")
    public static int field2160;

    @OriginalMember(owner = "client!dk", name = "A", descriptor = "I")
    public static int field2161;

    @OriginalMember(owner = "client!dk", name = "B", descriptor = "I")
    public static int field2162;

    @OriginalMember(owner = "client!dk", name = "y", descriptor = "Lkj;")
    private class56 field2159;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IILij;)Lij;")
    public final class50 method890(int arg0, int arg1, class50 arg2) {
        field2156++;
        if (this.field2159 == null) {
            return arg2;
        }
        if (arg0 != 0) {
            field2165 = null;
        }
        class79 var4 = (class79) this.field2159.method443((long) arg1, (byte) 95);
        return var4 == null ? arg2 : var4.field1453;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(II)Lig;")
    public static final class186 method891(int arg0, int arg1) {
        class186 var2 = (class186) class151.field2622.method764((byte) 70, (long) arg1);
        field2154++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class21.field444.method190((byte) -20, class245.method1676(arg1, 127), class241.method1640(arg1, false));
        class186 var4 = new class186();
        if (var3 != null) {
            var4.method1255(0, new class217(var3));
        }
        var4.method1251(arg0 ^ arg0);
        class151.field2622.method765((byte) -125, var4, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "(III)I")
    public final int method892(int arg0, int arg1, int arg2) {
        field2162++;
        if (arg2 != -2) {
            this.field2159 = null;
        }
        if (this.field2159 == null) {
            return arg0;
        } else {
            class199 var4 = (class199) this.field2159.method443((long) arg1, (byte) -82);
            return var4 == null ? arg0 : var4.field3286;
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(B)V")
    public static void method893(byte arg0) {
        field2155 = null;
        field2165 = null;
        field2164 = null;
        if (arg0 >= -18) {
            field2165 = null;
        }
        field2166 = null;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(Lwd;II)V")
    private final void method894(class217 arg0, int arg1, int arg2) {
        if (arg1 == 249) {
            int var4 = arg0.method1487(255);
            if (this.field2159 == null) {
                int var5 = class41.method311(var4, false);
                this.field2159 = new class56(var5);
            }
            for (int var6 = 0; var6 < var4; var6++) {
                boolean var7 = arg0.method1487(255) == 1;
                int var8 = arg0.method1447(-11);
                class32 var9;
                if (var7) {
                    var9 = new class79(arg0.method1469((byte) -107));
                } else {
                    var9 = new class199(arg0.method1466((byte) -15));
                }
                this.field2159.method445(124, (long) var8, var9);
            }
        }
        field2157++;
        int var10 = 60 % ((6 - arg2) / 48);
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(Lwd;I)V")
    public final void method895(class217 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method1487(255);
            if (var3 == 0) {
                field2161++;
                if (arg1 != 30) {
                    this.method895((class217) null, 78);
                    return;
                }
                return;
            }
            this.method894(arg0, var3, -46);
        }
    }
}
