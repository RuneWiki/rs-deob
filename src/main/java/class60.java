import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public abstract class class60 extends class387 {

    @OriginalMember(owner = "client!hl", name = "r", descriptor = "Z")
    public static boolean field867 = false;

    @OriginalMember(owner = "client!hl", name = "p", descriptor = "[Lbe;")
    public static class44[] field865 = new class44[50];

    @OriginalMember(owner = "client!hl", name = "m", descriptor = "I")
    public static int field862;

    @OriginalMember(owner = "client!hl", name = "n", descriptor = "I")
    public static int field863;

    @OriginalMember(owner = "client!hl", name = "o", descriptor = "I")
    public static int field864;

    @OriginalMember(owner = "client!hl", name = "q", descriptor = "I")
    public static int field866;

    @OriginalMember(owner = "client!hl", name = "s", descriptor = "I")
    public static int field868;

    @OriginalMember(owner = "client!hl", name = "t", descriptor = "I")
    public int field869;

    @OriginalMember(owner = "client!hl", name = "u", descriptor = "I")
    public int field870;

    @OriginalMember(owner = "client!hl", name = "v", descriptor = "I")
    public int field871;

    @OriginalMember(owner = "client!hl", name = "w", descriptor = "I")
    public static int field872;

    @OriginalMember(owner = "client!hl", name = "y", descriptor = "I")
    public static int field874;

    @OriginalMember(owner = "client!hl", name = "x", descriptor = "Z")
    public boolean field873;

    @OriginalMember(owner = "client!hl", name = "l", descriptor = "[I")
    public static int[] field861;

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(BLnr;IIZLcb;I)V", line = 3)
    public final void method153(byte arg0, class437 arg1, int arg2, int arg3, boolean arg4, class387 arg5, int arg6) {
        if (arg0 < -116) {
            field874++;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!hl", name = "e", descriptor = "(B)Z", line = 15)
    public final boolean method151(byte arg0) {
        field872++;
        if (arg0 != -115) {
            method403((byte) -15);
        }
        return false;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(B)V", line = 26)
    public static void method402(byte arg0) {
        if (arg0 > -29) {
            method403((byte) -77);
        }
        field861 = null;
        field865 = null;
    }

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "(B)V", line = 46)
    public static final void method403(byte arg0) {
        class24.field417.method2063(((float) class357.field5234 * 0.1F + 0.7F) * 1.1523438F);
        field864++;
        class24.field417.method2139(class53.field793, 0.69921875F, 1.2F, -50.0F, -60.0F, -50.0F);
        class24.field417.method2102(class124.field1656, -1);
        class24.field417.method2047(class300.field4316);
        if (arg0 != 57) {
            field865 = null;
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(BI)Z", line = 61)
    public static final boolean method404(byte arg0, int arg1) {
        field862++;
        if (arg1 == 43 || arg1 == 8 || arg1 == 41 || arg1 == 14 || arg1 == 1) {
            return true;
        } else if (arg1 == 23 || arg1 == 13 || arg1 == 1008) {
            return true;
        } else if (arg0 == 45) {
            return false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!hl", name = "d", descriptor = "(I)V", line = 79)
    public final void method163(int arg0) {
        if (arg0 != 0) {
            field861 = null;
        }
        field866++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "([[[Lpm;I)V", line = 90)
    public static final void method405(class10[][][] arg0, int arg1) {
        field863++;
        if (arg1 != -17126) {
            field867 = false;
        }
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class10[][] var3 = arg0[var2];
            for (int var4 = 0; var4 < var3.length; var4++) {
                for (int var5 = 0; var5 < var3[var4].length; var5++) {
                    class10 var6 = var3[var4][var5];
                    if (var6 != null) {
                        if (var6.field124 instanceof class351) {
                            ((class351) var6.field124).method158((byte) 6);
                        }
                        if (var6.field123 instanceof class351) {
                            ((class351) var6.field123).method158((byte) 6);
                        }
                        if (var6.field102 instanceof class351) {
                            ((class351) var6.field102).method158((byte) 6);
                        }
                        if (var6.field117 instanceof class351) {
                            ((class351) var6.field117).method158((byte) 6);
                        }
                        if (var6.field120 instanceof class351) {
                            ((class351) var6.field120).method158((byte) 6);
                        }
                        for (class39 var7 = var6.field109; var7 != null; var7 = var7.field627) {
                            class361 var8 = var7.field621;
                            if (var8 instanceof class351) {
                                ((class351) var8).method158((byte) 6);
                            }
                        }
                    }
                }
            }
        }
    }
}
