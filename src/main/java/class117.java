import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public class class117 {

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "[Lwk;")
    public static class195[] field1681 = new class195[14];

    @OriginalMember(owner = "client!ol", name = "c", descriptor = "Ljava/lang/String;")
    public static String field1683 = "M";

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "I")
    public static int field1682;

    @OriginalMember(owner = "client!ol", name = "d", descriptor = "I")
    public static int field1684;

    @OriginalMember(owner = "client!ol", name = "f", descriptor = "I")
    public static int field1686;

    @OriginalMember(owner = "client!ol", name = "g", descriptor = "I")
    public static int field1687;

    @OriginalMember(owner = "client!ol", name = "e", descriptor = "[[B")
    public static byte[][] field1685;

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(Lhb;BLhb;)V")
    public static final void method746(class154 arg0, byte arg1, class154 arg2) {
        if (arg0.field2137 != null) {
            arg0.method962(128);
        }
        field1687++;
        arg0.field2144 = arg2;
        arg0.field2137 = arg2.field2137;
        arg0.field2137.field2144 = arg0;
        if (arg1 >= 9) {
            arg0.field2144.field2137 = arg0;
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(I)V")
    public static final void method747(int arg0) {
        field1682++;
        class131.field1830.method804(false);
        if (arg0 != 2) {
            field1683 = null;
        }
        int var1 = class131.field1830.method805(8, (byte) -121);
        if (class306.field4921 > var1) {
            for (int var2 = var1; var2 < class306.field4921; var2++) {
                class194.field2959[class19.field322++] = class131.field1834[var2];
            }
        }
        if (var1 > class306.field4921) {
            throw new RuntimeException("gnpov1");
        }
        class306.field4921 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class131.field1834[var3];
            class310 var5 = class88.field1274[var4];
            int var6 = class131.field1830.method805(1, (byte) -117);
            if (var6 == 0) {
                class131.field1834[class306.field4921++] = var4;
                var5.field4119 = class35.field533;
            } else {
                int var7 = class131.field1830.method805(2, (byte) -111);
                if (var7 == 0) {
                    class131.field1834[class306.field4921++] = var4;
                    var5.field4119 = class35.field533;
                    class211.field3131[class102.field1466++] = var4;
                } else if (var7 == 1) {
                    class131.field1834[class306.field4921++] = var4;
                    var5.field4119 = class35.field533;
                    int var8 = class131.field1830.method805(3, (byte) -120);
                    var5.method1675(1, var8, true);
                    int var9 = class131.field1830.method805(1, (byte) -100);
                    if (var9 == 1) {
                        class211.field3131[class102.field1466++] = var4;
                    }
                } else if (var7 == 2) {
                    class131.field1834[class306.field4921++] = var4;
                    var5.field4119 = class35.field533;
                    if (class131.field1830.method805(1, (byte) -113) == 1) {
                        int var11 = class131.field1830.method805(3, (byte) 6);
                        var5.method1675(2, var11, true);
                        int var12 = class131.field1830.method805(3, (byte) -17);
                        var5.method1675(2, var12, true);
                    } else {
                        int var10 = class131.field1830.method805(3, (byte) -121);
                        var5.method1675(0, var10, true);
                    }
                    int var13 = class131.field1830.method805(1, (byte) -103);
                    if (var13 == 1) {
                        class211.field3131[class102.field1466++] = var4;
                    }
                } else if (var7 == 3) {
                    class194.field2959[class19.field322++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "(I)V")
    public static final void method748(int arg0) {
        field1686++;
        if (arg0 < -11) {
            class138.field1903.method1830(true);
            class145.field2006 = null;
            class159.field2208 = 1;
        }
    }

    @OriginalMember(owner = "client!ol", name = "c", descriptor = "(I)V")
    public static final void method749(int arg0) {
        field1684++;
        if (arg0 != 1) {
            field1685 = null;
        }
        int var1 = 0;
        for (int var2 = 0; var2 < 104; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                if (class244.method1601(var3, class246.field3856, var1, (byte) -97, var2, true)) {
                    var1++;
                }
                if (var1 >= 512) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ol", name = "d", descriptor = "(I)V")
    public static void method750(int arg0) {
        field1681 = null;
        if (arg0 > -109) {
            method747(-88);
        }
        field1685 = null;
        field1683 = null;
    }
}
