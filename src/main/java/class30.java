import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class30 extends class376 {

    @OriginalMember(owner = "client!na", name = "r", descriptor = "Z")
    public static boolean field469 = false;

    @OriginalMember(owner = "client!na", name = "s", descriptor = "[I")
    public static int[] field470 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!na", name = "p", descriptor = "Z")
    public static volatile boolean field467 = true;

    @OriginalMember(owner = "client!na", name = "u", descriptor = "[I")
    public static int[] field472 = new int[500];

    @OriginalMember(owner = "client!na", name = "t", descriptor = "Ljava/lang/String;")
    public static String field471 = "glow3:";

    @OriginalMember(owner = "client!na", name = "o", descriptor = "I")
    public static int field466;

    @OriginalMember(owner = "client!na", name = "q", descriptor = "I")
    public static int field468;

    @OriginalMember(owner = "client!na", name = "m", descriptor = "Llf;")
    public class130 field464;

    @OriginalMember(owner = "client!na", name = "n", descriptor = "Z")
    public boolean field465;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(ILqj;)V")
    public static final void method231(int arg0, class296 arg1) {
        if (arg0 == -3624) {
            field468++;
            class135.field1929 = arg1;
            class382.field5420 = class135.field1929.method1911(arg0 + 3624, 19);
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "([Llf;I)V")
    public static final void method232(class130[] arg0, int arg1) {
        class429.field6158 = arg0.length;
        field466++;
        class135.field1926 = new int[class429.field6158 + 10];
        class28.field444 = new class130[class429.field6158 + 10];
        class150.method1023(arg0, 0, class28.field444, 0, class429.field6158);
        for (int var2 = 0; var2 < class429.field6158; var2++) {
            class135.field1926[var2] = class28.field444[var2].method877();
        }
        for (int var3 = class429.field6158; var3 < class28.field444.length; var3++) {
            class135.field1926[var3] = 12;
        }
        int var4 = 61 / ((-arg1 - 14) / 57);
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Z)Z")
    public static final boolean method233(boolean arg0) {
        for (int var1 = class223.field3011; var1 < class176.field2480; var1++) {
            class142[][] var2 = class5.field79[var1];
            for (int var3 = -class245.field3380; var3 <= 0; var3++) {
                int var4 = class451.field6574 + var3;
                int var5 = class451.field6574 - var3;
                if (var4 >= class265.field3623 || var5 < class350.field4887) {
                    for (int var6 = -class245.field3380; var6 <= 0; var6++) {
                        int var7 = class48.field738 + var6;
                        int var8 = class48.field738 - var6;
                        if (var4 >= class265.field3623) {
                            if (var7 >= class179.field2506) {
                                class142 var9 = var2[var4][var7];
                                if (var9 != null && var9.field2050) {
                                    class8.field122 = arg0;
                                    class165.field2357.method1162((byte) -7, var9);
                                    class165.field2357.method1152((byte) -72);
                                }
                            }
                            if (var8 < class426.field6112) {
                                class142 var10 = var2[var4][var8];
                                if (var10 != null && var10.field2050) {
                                    class8.field122 = arg0;
                                    class165.field2357.method1162((byte) 126, var10);
                                    class165.field2357.method1152((byte) -90);
                                }
                            }
                        }
                        if (var5 < class350.field4887) {
                            if (var7 >= class179.field2506) {
                                class142 var11 = var2[var5][var7];
                                if (var11 != null && var11.field2050) {
                                    class8.field122 = arg0;
                                    class165.field2357.method1162((byte) -94, var11);
                                    class165.field2357.method1152((byte) -109);
                                }
                            }
                            if (var8 < class426.field6112) {
                                class142 var12 = var2[var5][var8];
                                if (var12 != null && var12.field2050) {
                                    class8.field122 = arg0;
                                    class165.field2357.method1162((byte) -40, var12);
                                    class165.field2357.method1152((byte) -85);
                                }
                            }
                        }
                        if (class13.field162 == 0) {
                            if (class105.field1575) {
                                class165.field2357.method1161(0, 24);
                            }
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!na", name = "c", descriptor = "(B)V")
    public static void method234(byte arg0) {
        field471 = null;
        field472 = null;
        if (arg0 <= 92) {
            field471 = null;
        }
        field470 = null;
    }
}
