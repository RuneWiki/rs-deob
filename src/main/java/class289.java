import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class289 extends class292 {

    @OriginalMember(owner = "client!rf", name = "D", descriptor = "Lll;")
    public static class211 field4545 = new class211(16);

    @OriginalMember(owner = "client!rf", name = "R", descriptor = "[I")
    public static int[] field4559 = new int[256];

    @OriginalMember(owner = "client!rf", name = "S", descriptor = "[I")
    public static int[] field4560 = new int[2500];

    @OriginalMember(owner = "client!rf", name = "T", descriptor = "[I")
    public static int[] field4561 = new int[5];

    @OriginalMember(owner = "client!rf", name = "O", descriptor = "I")
    public static int field4556 = 0;

    @OriginalMember(owner = "client!rf", name = "G", descriptor = "C")
    private char field4548;

    @OriginalMember(owner = "client!rf", name = "E", descriptor = "I")
    public static int field4546;

    @OriginalMember(owner = "client!rf", name = "F", descriptor = "I")
    public static int field4547;

    @OriginalMember(owner = "client!rf", name = "I", descriptor = "I")
    public static int field4550;

    @OriginalMember(owner = "client!rf", name = "J", descriptor = "I")
    public static int field4551;

    @OriginalMember(owner = "client!rf", name = "K", descriptor = "I")
    public static int field4552;

    @OriginalMember(owner = "client!rf", name = "L", descriptor = "I")
    public static int field4553;

    @OriginalMember(owner = "client!rf", name = "P", descriptor = "I")
    public int field4557;

    @OriginalMember(owner = "client!rf", name = "N", descriptor = "Luf;")
    public static class176 field4555;

    @OriginalMember(owner = "client!rf", name = "Q", descriptor = "Luf;")
    public static class176 field4558;

    @OriginalMember(owner = "client!rf", name = "H", descriptor = "Ljava/lang/String;")
    public String field4549;

    @OriginalMember(owner = "client!rf", name = "M", descriptor = "[[B")
    public static byte[][] field4554;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(ILf;I)V")
    private final void method1946(int arg0, class37 arg1, int arg2) {
        if (arg0 == 1) {
            this.field4548 = class11.method121(63, arg1.method322((byte) 46));
        } else if (arg0 == 2) {
            this.field4557 = arg1.method307(arg2 - 4533);
        } else if (arg0 == 5) {
            this.field4549 = arg1.method331(16312);
        }
        field4547++;
        if (arg2 != 4492) {
            field4559 = null;
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(ILjava/lang/String;)I")
    public static final int method1947(int arg0, String arg1) {
        field4552++;
        int var2 = arg1.length();
        int var3 = 0;
        int var4 = 0;
        if (arg0 != -27930) {
            field4559 = null;
        }
        while (var2 > var4) {
            var3 = (var3 << 5) - (var3 - class1.method6(arg1.charAt(var4), false));
            var4++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "(B)Z")
    public final boolean method1948(byte arg0) {
        int var2 = -80 % ((-arg0 - 73) / 45);
        field4551++;
        return this.field4548 == 's';
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(BLf;)V")
    public final void method1949(byte arg0, class37 arg1) {
        field4550++;
        if (arg0 < 67) {
            return;
        }
        while (true) {
            int var3 = arg1.method333((byte) -59);
            if (var3 == 0) {
                return;
            }
            this.method1946(var3, arg1, 4492);
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(BIIIII)V")
    public static final void method1950(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field4546++;
        int var6 = class68.method533(class271.field4289, class113.field1779, arg2, (byte) 120);
        int var7 = class68.method533(class271.field4289, class113.field1779, arg1, (byte) 117);
        int var8 = class68.method533(class75.field1265, class261.field4025, arg3, (byte) 94);
        int var9 = class68.method533(class75.field1265, class261.field4025, arg5, (byte) 102);
        for (int var10 = var6; var10 <= var7; var10++) {
            class263.method1788(var8, -18732, arg4, class156.field2379[var10], var9);
        }
        if (arg0 != 22) {
            method1950((byte) -115, 9, 14, -48, 32, -54);
        }
    }

    @OriginalMember(owner = "client!rf", name = "d", descriptor = "(I)V")
    public static void method1951(int arg0) {
        if (arg0 != -116) {
            method1950((byte) -39, 37, -33, 106, -70, -82);
        }
        field4559 = null;
        field4555 = null;
        field4545 = null;
        field4554 = null;
        field4561 = null;
        field4560 = null;
        field4558 = null;
    }
}
