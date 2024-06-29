import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class310 {

    @OriginalMember(owner = "client!ef", name = "g", descriptor = "Lmh;")
    public static class128 field5261 = class22.method156(122, "rect_debug=");

    @OriginalMember(owner = "client!ef", name = "h", descriptor = "Lmh;")
    public static class128 field5262 = class22.method156(127, "Hierhin gehen");

    @OriginalMember(owner = "client!ef", name = "i", descriptor = "Lmh;")
    public static class128 field5263 = class22.method156(123, " GMT");

    @OriginalMember(owner = "client!ef", name = "e", descriptor = "I")
    public static int field5259 = 0;

    @OriginalMember(owner = "client!ef", name = "f", descriptor = "Lmh;")
    public static class128 field5260 = class22.method156(124, "titlebg");

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "I")
    public static int field5255;

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "I")
    public static int field5256;

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "I")
    public static int field5258;

    @OriginalMember(owner = "client!ef", name = "j", descriptor = "Ltf;")
    public static class246 field5264;

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "Lbj;")
    public static class51 field5257;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(ZI)I", line = 4)
    public static final int method2110(boolean arg0, int arg1) {
        field5258++;
        if (arg1 != 2) {
            method2110(true, 53);
        }
        long var2 = class71.method470(true);
        for (class215 var4 = arg0 ? (class215) class301.field5114.method729(-91) : (class215) class301.field5114.method732(1); var4 != null; var4 = (class215) class301.field5114.method732(1)) {
            if (var2 > (var4.field3789 & 0x3FFFFFFFFFFFFFFFL)) {
                if ((var4.field3789 & 0x4000000000000000L) != 0L) {
                    int var5 = (int) var4.field4915;
                    class104.field1778[var5] = class34.field732[var5];
                    var4.method1978((byte) 39);
                    return var5;
                }
                var4.method1978((byte) -101);
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Z)V", line = 43)
    public static void method2111(boolean arg0) {
        if (!arg0) {
            return;
        }
        field5261 = null;
        field5260 = null;
        field5264 = null;
        field5257 = null;
        field5262 = null;
        field5263 = null;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(I)V", line = 59)
    public static final void method2112(int arg0) {
        field5256++;
        if (arg0 != 7) {
            return;
        }
        class179.method1223();
        class79.field1441 = new class87[7];
        class79.field1441[1] = new class78();
        class79.field1441[2] = new class272();
        class79.field1441[3] = new class277();
        class79.field1441[4] = new class286();
        class79.field1441[5] = new class263();
        class79.field1441[6] = new class80();
    }
}
