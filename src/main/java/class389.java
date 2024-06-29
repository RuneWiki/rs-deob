import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!po")
public abstract class class389 {

    @OriginalMember(owner = "client!po", name = "a", descriptor = "I")
    public static int field5755 = 0;

    @OriginalMember(owner = "client!po", name = "e", descriptor = "I")
    public static int field5759 = 0;

    @OriginalMember(owner = "client!po", name = "g", descriptor = "I")
    public static int field5761 = 0;

    @OriginalMember(owner = "client!po", name = "d", descriptor = "Luj;")
    public static class259 field5758 = new class259();

    @OriginalMember(owner = "client!po", name = "h", descriptor = "I")
    public static int field5762;

    @OriginalMember(owner = "client!po", name = "b", descriptor = "Lvb;")
    public static class130 field5756;

    @OriginalMember(owner = "client!po", name = "c", descriptor = "Lmd;")
    public static class379 field5757;

    @OriginalMember(owner = "client!po", name = "f", descriptor = "Log;")
    public static class456 field5760;

    // $FF: synthetic field
    @OriginalMember(owner = "client!po", name = "i", descriptor = "Ljava/lang/Class;")
    public static Class field5763;

    // $FF: synthetic method
    @OriginalMember(owner = "client!po", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method2444(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(I)V", line = 3)
    public static void method2442(int arg0) {
        if (arg0 >= -103) {
            method2442(79);
        }
        field5757 = null;
        field5756 = null;
        field5760 = null;
        field5758 = null;
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(Z)V", line = 20)
    public static final void method2443(boolean arg0) {
        field5762++;
        if (arg0) {
            method2443(true);
        }
        for (class221 var1 = (class221) class35.field536.method2257((byte) 109); var1 != null; var1 = (class221) class35.field536.method2256(-118)) {
            if (class36.field545 == null) {
                var1.method2663(-109);
            } else if (class180.field2734 >= var1.field3189) {
                int var14 = class113.field1798[var1.field3204];
                if (var14 == 0) {
                    class524 var15 = class396.method2468(var1.field3188, var1.field3191, var1.field3199);
                    if (var15 instanceof class448) {
                        class456.method2741(var1.field3188, var1.field3191, var1.field3199);
                        class448 var16 = (class448) var15;
                        if (var16.field6563 != null) {
                            class430.method2615(var1.field3188, var1.field3191, var1.field3199, var16.field6563, null);
                        }
                    }
                } else if (var14 == 1) {
                    class177 var17 = class7.method52(var1.field3188, var1.field3191, var1.field3199);
                    if (var17 instanceof class385) {
                        class149.method1070(var1.field3188, var1.field3191, var1.field3199);
                        class385 var18 = (class385) var17;
                        if (var18.field5698 != null) {
                            class470.method2805(var1.field3188, var1.field3191, var1.field3199, var18.field5698, null);
                        }
                    }
                } else if (var14 == 2) {
                    class370 var19 = class51.method372(var1.field3188, var1.field3191, var1.field3199, field5763 == null ? (field5763 = method2444("rq")) : field5763);
                    if (var19 instanceof class504) {
                        class86.method699(var1.field3188, var1.field3191, var1.field3199, field5763 == null ? (field5763 = method2444("rq")) : field5763);
                        class504 var20 = (class504) var19;
                        if (var20.field7398 != null) {
                            class333.method2194(var20.field7398, false);
                        }
                    }
                } else if (var14 == 3) {
                    class311 var21 = class358.method2310(var1.field3188, var1.field3191, var1.field3199);
                    if (var21 instanceof class244) {
                        class225.method1496(var1.field3188, var1.field3191, var1.field3199);
                        class244 var22 = (class244) var21;
                        if (var22.field3514 != null) {
                            class507.method2998(var1.field3188, var1.field3191, var1.field3199, var22.field3514);
                        }
                    }
                }
                var1.method2663(-124);
            } else if (class180.field2734 == var1.field3196) {
                int var2 = class113.field1798[var1.field3204];
                if (var2 == 0) {
                    class524 var12 = class396.method2468(var1.field3188, var1.field3191, var1.field3199);
                    if (var12 instanceof class448) {
                        var1.method2663(-123);
                    } else if (class507.method3001(var1.field3188, var1.field3191, var1.field3199) == null) {
                        class448 var13 = new class448(var1.field3204, var1.field3198, var1.field3205, var1.field3187, var1.field3194, var12);
                        class430.method2615(var1.field3188, var1.field3191, var1.field3199, var13, null);
                    } else {
                        var1.method2663(-119);
                    }
                } else if (var2 == 1) {
                    class177 var3 = class7.method52(var1.field3188, var1.field3191, var1.field3199);
                    if (var3 instanceof class385) {
                        var1.method2663(-112);
                    } else if (class93.method751(var1.field3188, var1.field3191, var1.field3199) == null) {
                        class385 var4 = new class385(var1.field3204, var1.field3198, var1.field3205, var1.field3187, var1.field3194, var3);
                        class470.method2805(var1.field3188, var1.field3191, var1.field3199, var4, null);
                    } else {
                        var1.method2663(-109);
                    }
                } else if (var2 == 2) {
                    class370 var7 = class51.method372(var1.field3188, var1.field3191, var1.field3199, field5763 == null ? (field5763 = method2444("rq")) : field5763);
                    if (var7 instanceof class504) {
                        var1.method2663(-128);
                    } else {
                        class86.method699(var1.field3188, var1.field3191, var1.field3199, field5763 == null ? (field5763 = method2444("rq")) : field5763);
                        class510 var8 = class246.field3567.method609(116, var1.field3195);
                        int var9;
                        int var10;
                        if (var1.field3198 == 1 || var1.field3198 == 3) {
                            var10 = var8.field7459;
                            var9 = var8.field7475;
                        } else {
                            var9 = var8.field7459;
                            var10 = var8.field7475;
                        }
                        class504 var11 = new class504(var1.field3204, var1.field3198, var1.field3188, var1.field3205, var1.field3187, var1.field3194, var1.field3191, var1.field3191 + var9 - 1, var1.field3199, var1.field3199 + var10 - 1, var7);
                        class333.method2194(var11, false);
                    }
                } else if (var2 == 3) {
                    class311 var5 = class358.method2310(var1.field3188, var1.field3191, var1.field3199);
                    if (var5 instanceof class244) {
                        var1.method2663(-108);
                    } else {
                        class244 var6 = new class244(var1.field3205, var1.field3187, var1.field3194, var5);
                        class507.method2998(var1.field3188, var1.field3191, var1.field3199, var6);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(Lae;I)Lae;")
    public abstract class163 method1304(class163 arg0, int arg1);
}
