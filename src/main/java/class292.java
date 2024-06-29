import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class292 {

    @OriginalMember(owner = "client!tg", name = "h", descriptor = "Z")
    public boolean field4924 = false;

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "Luf;")
    public static class168 field4918 = class148.method1019(-1720, " zuerst von Ihrer Freunde)2Liste(Q");

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "I")
    public static int field4917;

    @OriginalMember(owner = "client!tg", name = "d", descriptor = "I")
    public static int field4920;

    @OriginalMember(owner = "client!tg", name = "e", descriptor = "I")
    public static int field4921;

    @OriginalMember(owner = "client!tg", name = "f", descriptor = "I")
    public int field4922;

    @OriginalMember(owner = "client!tg", name = "g", descriptor = "I")
    public int field4923;

    @OriginalMember(owner = "client!tg", name = "i", descriptor = "I")
    public int field4925;

    @OriginalMember(owner = "client!tg", name = "j", descriptor = "J")
    public long field4926;

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "Lf;")
    public class231 field4919;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(ILdk;Ldk;Ldk;)V", line = 7)
    public static final void method2000(int arg0, class241 arg1, class241 arg2, class241 arg3) {
        class52.field638 = arg2;
        class52.field643 = arg3;
        field4917++;
        if (arg0 != 26443) {
            method2001(true);
        }
        class61.field799 = arg1;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Z)V", line = 32)
    public static void method2001(boolean arg0) {
        field4918 = null;
        if (!arg0) {
            method2002(false, (byte) 116);
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(ZB)V", line = 43)
    public static final void method2002(boolean arg0, byte arg1) {
        field4921++;
        byte[][] var2;
        byte var3;
        if (arg0) {
            var2 = class78.field1077;
            var3 = 1;
        } else {
            var3 = 4;
            var2 = class51.field625;
        }
        if (arg1 > -4) {
            method2002(true, (byte) 120);
        }
        for (int var4 = 0; var4 < var3; var4++) {
            class254.method1750((byte) 98);
            for (int var5 = 0; var5 < 13; var5++) {
                for (int var6 = 0; var6 < 13; var6++) {
                    int var7 = class80.field1152[var4][var5][var6];
                    if (var7 != -1) {
                        int var8 = (var7 & 0x32BEEBD) >> 24;
                        if (!arg0 || var8 == 0) {
                            int var9 = (var7 & 0x6) >> 1;
                            int var10 = (var7 & 0x3FFB) >> 3;
                            int var11 = var7 >> 14 & 0x3FF;
                            int var12 = (var11 / 8 << 8) + var10 / 8;
                            for (int var13 = 0; var13 < class303.field5104.length; var13++) {
                                if (class303.field5104[var13] == var12 && var2[var13] != null) {
                                    class219.method1515(class140.field2176, (var11 & 0x7) * 8, var6 * 8, var5 * 8, 7, (var10 & 0x7) * 8, var9, var8, var2[var13], var4, arg0);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
