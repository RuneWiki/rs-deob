import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public class class213 {

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "Lbf;")
    public static class202 field3677 = new class202(200);

    @OriginalMember(owner = "client!nl", name = "f", descriptor = "I")
    public static int field3682 = -1;

    @OriginalMember(owner = "client!nl", name = "h", descriptor = "Leg;")
    public static class37 field3684 = class174.method1167("Textures charg-Bes", 104);

    @OriginalMember(owner = "client!nl", name = "e", descriptor = "[I")
    public static int[] field3681 = new int[200];

    @OriginalMember(owner = "client!nl", name = "d", descriptor = "Lgj;")
    public static class247 field3680 = new class247(5000);

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "I")
    public static int field3678;

    @OriginalMember(owner = "client!nl", name = "c", descriptor = "I")
    public static int field3679;

    @OriginalMember(owner = "client!nl", name = "g", descriptor = "I")
    public static int field3683;

    @OriginalMember(owner = "client!nl", name = "i", descriptor = "Leg;")
    public static class37 field3685;

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(I)V")
    public static void method1515(int arg0) {
        field3677 = null;
        if (arg0 != -1863420381) {
            field3682 = -128;
        }
        field3685 = null;
        field3684 = null;
        field3681 = null;
        field3680 = null;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(BZ)V")
    public static final void method1516(byte arg0, boolean arg1) {
        field3678++;
        if (arg0 <= 84) {
            method1517(121);
        }
        byte var2 = 4;
        byte[][] var3 = class115.field1941;
        for (int var4 = 0; var4 < var2; var4++) {
            class126.method898((byte) 83);
            for (int var5 = 0; var5 < 13; var5++) {
                for (int var6 = 0; var6 < 13; var6++) {
                    int var7 = class238.field4238[var4][var5][var6];
                    if (var7 != -1) {
                        int var8 = var7 >> 24 & 0x3;
                        if (!arg1 || var8 == 0) {
                            int var9 = var7 >> 1 & 0x3;
                            int var10 = (var7 & 0xFFF027) >> 14;
                            int var11 = (var7 & 0x3FFF) >> 3;
                            int var12 = (var10 / 8 << 8) + var11 / 8;
                            for (int var13 = 0; var13 < class210.field3615.length; var13++) {
                                if (class210.field3615[var13] == var12 && var3[var13] != null) {
                                    class69.method476(class215.field3719, -27952, (var11 & 0x7) * 8, var8, var5 * 8, var6 * 8, (var10 & 0x7) * 8, arg1, var3[var13], var4, var9);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "(I)V")
    public static final void method1517(int arg0) {
        field3679++;
        if (!class72.method492(-2001) && class73.field1149 != class237.field4140) {
            class2.method16(false, false, class82.field1285.field1780[0], class68.field1073, class82.field1285.field1812[0], class260.field4598, class237.field4140);
            return;
        }
        if (class84.field1314 != class237.field4140) {
            class84.field1314 = class237.field4140;
            class156.method1067(class237.field4140, 12929);
            client.method790(-122);
        }
        if (arg0 >= -107) {
            method1516((byte) 7, true);
        }
    }
}
