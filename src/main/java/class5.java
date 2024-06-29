import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class5 {

    @OriginalMember(owner = "client!vi", name = "d", descriptor = "I")
    public static int field72 = -1;

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "I")
    public static int field70 = 0;

    @OriginalMember(owner = "client!vi", name = "c", descriptor = "I")
    public static int field71;

    @OriginalMember(owner = "client!vi", name = "f", descriptor = "I")
    public static int field74;

    @OriginalMember(owner = "client!vi", name = "g", descriptor = "I")
    public static int field75;

    @OriginalMember(owner = "client!vi", name = "i", descriptor = "I")
    public static int field77;

    @OriginalMember(owner = "client!vi", name = "j", descriptor = "I")
    public static int field78;

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "Lnj;")
    public static class215 field69;

    @OriginalMember(owner = "client!vi", name = "e", descriptor = "[I")
    public static int[] field73;

    @OriginalMember(owner = "client!vi", name = "h", descriptor = "[Lnj;")
    public static class215[] field76;

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(B)V")
    public static void method29(byte arg0) {
        field76 = null;
        field73 = null;
        field69 = null;
        int var1 = 23 % ((18 - arg0) / 54);
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(ILog;)V")
    public static final void method30(int arg0, class194 arg1) {
        field75++;
        if (arg0 != 116749187) {
            return;
        }
        if (arg1.field3074 != null) {
            arg1.field3074.field1325 = 0;
        }
        arg1.field3071 = false;
        for (class194 var2 = arg1.method988(); var2 != null; var2 = arg1.method947()) {
            method30(arg0, var2);
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(IZ)V")
    public static final void method31(int arg0, boolean arg1) {
        field71++;
        byte[][] var2 = class199.field3148;
        byte var3 = 4;
        for (int var4 = arg0; var4 < var3; var4++) {
            class31.method163(-11565);
            for (int var5 = 0; var5 < 13; var5++) {
                for (int var6 = 0; var6 < 13; var6++) {
                    int var7 = class276.field4478[var4][var5][var6];
                    if (var7 != -1) {
                        int var8 = var7 >> 24 & 0x3;
                        if (!arg1 || var8 == 0) {
                            int var9 = (var7 & 0x6) >> 1;
                            int var10 = (var7 & 0xFFE7D3) >> 14;
                            int var11 = (var7 & 0x3FFD) >> 3;
                            int var12 = (var10 / 8 << 8) + var11 / 8;
                            for (int var13 = 0; var13 < class250.field4072.length; var13++) {
                                if (class250.field4072[var13] == var12 && var2[var13] != null) {
                                    class29.method157(var8, (var10 & 0x7) * 8, var6 * 8, var9, arg1, var5 * 8, (var11 & 0x7) * 8, 101, var4, class312.field4997, var2[var13]);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method32(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field74++;
        if (class190.method1322(arg2, (byte) 97)) {
            if (arg8 != 0) {
                method31(-49, true);
            }
            class237.method1661(arg6, arg7, class68.field1018[arg2], arg5, arg4, arg3, 1, arg0, arg1, -1);
        } else if (arg0 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class302.field4808[var9] = true;
            }
        } else {
            class302.field4808[arg0] = true;
        }
    }
}
