import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class6 extends class182 {

    @OriginalMember(owner = "client!ae", name = "B", descriptor = "I")
    public int field121;

    @OriginalMember(owner = "client!ae", name = "u", descriptor = "I")
    public static int field114 = -1;

    @OriginalMember(owner = "client!ae", name = "A", descriptor = "[I")
    public static int[] field120 = new int[2048];

    @OriginalMember(owner = "client!ae", name = "C", descriptor = "Lsg;")
    private static class169 field122 = class165.method1060("Loading interfaces )2 ", 1536);

    @OriginalMember(owner = "client!ae", name = "z", descriptor = "[I")
    public static int[] field119 = new int[2000];

    @OriginalMember(owner = "client!ae", name = "F", descriptor = "Lsg;")
    public static class169 field125 = class165.method1060(" <col=ffffff>", 1536);

    @OriginalMember(owner = "client!ae", name = "v", descriptor = "I")
    public static int field115 = 0;

    @OriginalMember(owner = "client!ae", name = "J", descriptor = "Lsg;")
    public static class169 field128 = class165.method1060("gr-Un:", 1536);

    @OriginalMember(owner = "client!ae", name = "G", descriptor = "Lsg;")
    public static class169 field126 = class165.method1060(")4l", 1536);

    @OriginalMember(owner = "client!ae", name = "L", descriptor = "Lsg;")
    public static class169 field130 = field122;

    @OriginalMember(owner = "client!ae", name = "I", descriptor = "Lua;")
    public static class181 field127 = new class181(5);

    @OriginalMember(owner = "client!ae", name = "P", descriptor = "I")
    public static int field134 = 1;

    @OriginalMember(owner = "client!ae", name = "O", descriptor = "[I")
    public static int[] field133 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!ae", name = "x", descriptor = "I")
    public static int field117;

    @OriginalMember(owner = "client!ae", name = "y", descriptor = "I")
    public static int field118;

    @OriginalMember(owner = "client!ae", name = "D", descriptor = "I")
    public static int field123;

    @OriginalMember(owner = "client!ae", name = "K", descriptor = "I")
    public static int field129;

    @OriginalMember(owner = "client!ae", name = "M", descriptor = "I")
    public static int field131;

    @OriginalMember(owner = "client!ae", name = "E", descriptor = "[Lsg;")
    public static class169[] field124;

    @OriginalMember(owner = "client!ae", name = "N", descriptor = "[Lbg;")
    public static class18[] field132;

    @OriginalMember(owner = "client!ae", name = "w", descriptor = "[S")
    public static short[] field116;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lma;Loa;IB)V")
    public static final void method37(class109 arg0, class127 arg1, int arg2, byte arg3) {
        field118++;
        class90 var4 = new class90();
        var4.field1632 = arg1.method819((byte) 22);
        var4.field1634 = arg1.method814(8);
        var4.field1639 = new int[var4.field1632];
        var4.field1636 = new int[var4.field1632];
        if (arg3 < 8) {
            field126 = null;
        }
        var4.field1649 = new byte[var4.field1632][][];
        var4.field1642 = new class170[var4.field1632];
        var4.field1630 = new class170[var4.field1632];
        var4.field1631 = new int[var4.field1632];
        for (int var5 = 0; var5 < var4.field1632; var5++) {
            try {
                int var6 = arg1.method819((byte) 22);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    String var7 = new String(arg1.method793((byte) -87).method1108((byte) -94));
                    int var8 = 0;
                    String var9 = new String(arg1.method793((byte) -89).method1108((byte) -89));
                    if (var6 == 1) {
                        var8 = arg1.method814(8);
                    }
                    var4.field1631[var5] = var6;
                    var4.field1639[var5] = var8;
                    var4.field1630[var5] = arg0.method678(-3666, var9, class58.method368(var7, 63));
                } else if (var6 == 3 || var6 == 4) {
                    String var10 = new String(arg1.method793((byte) -123).method1108((byte) -120));
                    String var11 = new String(arg1.method793((byte) -94).method1108((byte) -106));
                    int var12 = arg1.method819((byte) 22);
                    String[] var13 = new String[var12];
                    for (int var14 = 0; var14 < var12; var14++) {
                        var13[var14] = new String(arg1.method793((byte) -53).method1108((byte) -117));
                    }
                    byte[][] var15 = new byte[var12][];
                    if (var6 == 3) {
                        for (int var16 = 0; var16 < var12; var16++) {
                            int var17 = arg1.method814(8);
                            var15[var16] = new byte[var17];
                            arg1.method786(419699672, var17, 0, var15[var16]);
                        }
                    }
                    var4.field1631[var5] = var6;
                    Class[] var18 = new Class[var12];
                    for (int var19 = 0; var19 < var12; var19++) {
                        var18[var19] = class58.method368(var13[var19], 86);
                    }
                    var4.field1642[var5] = arg0.method674(false, class58.method368(var10, 53), var18, var11);
                    var4.field1649[var5] = var15;
                }
            } catch (ClassNotFoundException var20) {
                var4.field1636[var5] = -1;
            } catch (SecurityException var21) {
                var4.field1636[var5] = -2;
            } catch (NullPointerException var22) {
                var4.field1636[var5] = -3;
            } catch (Exception var23) {
                var4.field1636[var5] = -4;
            } catch (Throwable var24) {
                var4.field1636[var5] = -5;
            }
        }
        class13.field297.method149(0, var4);
    }

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "(I)V")
    public static void method38(int arg0) {
        field128 = null;
        field130 = null;
        field120 = null;
        field116 = null;
        field133 = null;
        field132 = null;
        field127 = null;
        field124 = null;
        if (arg0 == -1) {
            field125 = null;
            field122 = null;
            field119 = null;
            field126 = null;
        }
    }

    @OriginalMember(owner = "client!ae", name = "<init>", descriptor = "()V")
    public class6() {
    }

    @OriginalMember(owner = "client!ae", name = "<init>", descriptor = "(I)V")
    public class6(int arg0) {
        this.field121 = arg0;
    }
}
