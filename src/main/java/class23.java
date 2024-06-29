import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class23 {

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "[I")
    public static int[] field399 = new int[] { 1, 1, 1, 1 };

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "I")
    public int field397;

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "I")
    public static int field398;

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "I")
    public int field400;

    @OriginalMember(owner = "client!cb", name = "f", descriptor = "I")
    public static int field402;

    @OriginalMember(owner = "client!cb", name = "g", descriptor = "I")
    public static int field403;

    @OriginalMember(owner = "client!cb", name = "h", descriptor = "I")
    public int field404;

    @OriginalMember(owner = "client!cb", name = "i", descriptor = "I")
    public int field405;

    @OriginalMember(owner = "client!cb", name = "l", descriptor = "I")
    public static int field408;

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "Lph;")
    public static class147 field401;

    @OriginalMember(owner = "client!cb", name = "k", descriptor = "Lrf;")
    public class163 field407;

    @OriginalMember(owner = "client!cb", name = "j", descriptor = "Z")
    public boolean field406;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)V")
    public static void method137(int arg0) {
        if (arg0 == 12598) {
            field401 = null;
            field399 = null;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lkg;ZI)V")
    public static final void method138(class102 arg0, boolean arg1, int arg2) {
        field398++;
        if (class199.field3935 != null) {
            try {
                class199.field3935.method694((byte) -94);
            } catch (Exception var8) {
            }
            class199.field3935 = null;
        }
        class199.field3935 = arg0;
        class96.method662(arg1, 88);
        class196.field3892 = null;
        class150.field3108 = null;
        class128.field2619.field1033 = arg2;
        class64.field1359 = 0;
        while (true) {
            class39 var3 = (class39) class196.field3888.method468(1);
            if (var3 == null) {
                while (true) {
                    class39 var4 = (class39) class131.field2742.method468(1);
                    if (var4 == null) {
                        if (class163.field3309 != 0) {
                            try {
                                class52 var5 = new class52(4);
                                var5.method370(4, (byte) 123);
                                var5.method370(class163.field3309, (byte) 123);
                                var5.method346(0, 0);
                                class199.field3935.method697(var5.field1054, 4, (byte) -120, 0);
                            } catch (IOException var7) {
                                try {
                                    class199.field3935.method694((byte) -100);
                                } catch (Exception var6) {
                                }
                                class109.field2265++;
                                class199.field3935 = null;
                            }
                        }
                        class33.field642 = 0;
                        class148.field3050 = class155.method994(arg2 ^ 0x77);
                        return;
                    }
                    class140.field2883.method420(arg2, var4);
                    class150.field3098.method462(117, var4, var4.field1950);
                    class162.field3293++;
                    class89.field1931--;
                }
            }
            class101.field2112.method462(-109, var3, var3.field1950);
            class105.field2198++;
            class39.field797--;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIIII)V")
    public static final void method139(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field408++;
        int var5 = arg2;
        if (arg3 != 0) {
            field401 = null;
        }
        while (arg2 + arg4 >= var5) {
            for (int var6 = arg1; var6 <= arg1 + arg0; var6++) {
                if (var6 >= 0 && var6 < 104 && var5 >= 0 && var5 < 104) {
                    class70.field1473[0][var6][var5] = 127;
                    if (arg1 == var6 && var6 > 0) {
                        class154.field3199[0][var6][var5] = class154.field3199[0][var6 - 1][var5];
                    }
                    if (arg0 + arg1 == var6 && var6 < 103) {
                        class154.field3199[0][var6][var5] = class154.field3199[0][var6 + 1][var5];
                    }
                    if (arg2 == var5 && var5 > 0) {
                        class154.field3199[0][var6][var5] = class154.field3199[0][var6][var5 - 1];
                    }
                    if (arg2 + arg4 == var5 && var5 < 103) {
                        class154.field3199[0][var6][var5] = class154.field3199[0][var6][var5 + 1];
                    }
                }
            }
            var5++;
        }
    }
}
