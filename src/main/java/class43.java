import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public class class43 {

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "Ljava/lang/String;")
    public static String field781 = "shake:";

    @OriginalMember(owner = "client!pk", name = "f", descriptor = "Llj;")
    public static class24 field786 = null;

    @OriginalMember(owner = "client!pk", name = "c", descriptor = "Ljava/lang/String;")
    public static String field783 = "";

    @OriginalMember(owner = "client!pk", name = "g", descriptor = "[I")
    public static int[] field787 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "[I")
    public static int[] field782 = new int[2000];

    @OriginalMember(owner = "client!pk", name = "d", descriptor = "I")
    public static int field784;

    @OriginalMember(owner = "client!pk", name = "h", descriptor = "I")
    public int field788;

    @OriginalMember(owner = "client!pk", name = "k", descriptor = "I")
    public static int field791;

    @OriginalMember(owner = "client!pk", name = "e", descriptor = "Lsb;")
    public static class124 field785;

    @OriginalMember(owner = "client!pk", name = "i", descriptor = "Ljava/lang/String;")
    public String field789;

    @OriginalMember(owner = "client!pk", name = "j", descriptor = "[[[B")
    public static byte[][][] field790;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(Lkj;I)Z")
    public static final boolean method373(class114 arg0, int arg1) {
        field791++;
        if (arg0.field1929 == 205) {
            class292.field4637 = 250;
            return true;
        } else {
            if (arg1 != 23142) {
                method374((byte) -93);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(B)V")
    public static void method374(byte arg0) {
        field785 = null;
        field781 = null;
        field786 = null;
        field782 = null;
        field783 = null;
        if (arg0 != -66) {
            method375((byte[]) null, true, -109, 37, (class13[]) null, -19);
        }
        field787 = null;
        field790 = null;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "([BZII[Lml;I)V")
    public static final void method375(byte[] arg0, boolean arg1, int arg2, int arg3, class13[] arg4, int arg5) {
        field784++;
        class136 var6 = new class136(arg0);
        if (arg2 != -24713) {
            method373((class114) null, 96);
        }
        int var7 = -1;
        while (true) {
            int var8 = var6.method1020(true);
            if (var8 == 0) {
                return;
            }
            var7 += var8;
            int var9 = 0;
            while (true) {
                int var10 = var6.method1004(122);
                if (var10 == 0) {
                    break;
                }
                var9 += var10 - 1;
                int var11 = var9 & 0x3F;
                int var12 = var9 >> 6 & 0x3F;
                int var13 = var9 >> 12;
                int var14 = var6.method1012(4);
                int var15 = var14 >> 2;
                int var16 = var14 & 0x3;
                int var17 = arg3 + var12;
                int var18 = arg5 + var11;
                if (var17 > 0 && var18 > 0 && var17 < 103 && var18 < 103) {
                    class13 var19 = null;
                    if (!arg1) {
                        int var20 = var13;
                        if ((field790[1][var17][var18] & 0x2) == 2) {
                            var20 = var13 - 1;
                        }
                        if (var20 >= 0) {
                            var19 = arg4[var20];
                        }
                    }
                    class290.method1950(!arg1, arg1, var17, var16, var13, var7, var18, 1, var19, var13, var15);
                }
            }
        }
    }
}
