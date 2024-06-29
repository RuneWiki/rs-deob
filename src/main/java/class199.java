import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public abstract class class199 {

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "Liu;")
    public static class390 field2775 = new class390(31, 6);

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "I")
    public static int field2773;

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "I")
    public static int field2774;

    @OriginalMember(owner = "client!ne", name = "f", descriptor = "I")
    public static int field2778;

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "Lru;")
    public static class121 field2777;

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "Ltp;")
    public static class355 field2776;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(I)V", line = 6)
    public static void method1236(int arg0) {
        field2775 = null;
        if (arg0 > -105) {
            method1237(49, 60, 22, -95, 54, -108, null, -6);
        }
        field2776 = null;
        field2777 = null;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIIIILjava/lang/String;I)V", line = 20)
    public static final void method1237(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, String arg6, int arg7) {
        field2773++;
        class154 var8 = new class154();
        var8.field1968 = class263.field3748 + arg7;
        var8.field1969 = arg0;
        var8.field1977 = arg5;
        var8.field1976 = arg1;
        var8.field1970 = arg6;
        var8.field1974 = arg2;
        var8.field1971 = arg4;
        class238.field3325.method250((byte) -72, var8);
        if (arg3 != -594006365) {
            field2778 = 7;
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Z[[BLuo;)V", line = 43)
    public static final void method1238(boolean arg0, byte[][] arg1, class388 arg2) {
        for (int var3 = 0; var3 < arg2.field115; var3++) {
            class498.method2992(0);
            for (int var4 = 0; var4 < class362.field5442 >> 3; var4++) {
                for (int var5 = 0; var5 < class203.field2813 >> 3; var5++) {
                    int var6 = class159.field2072[var3][var4][var5];
                    if (var6 != -1) {
                        int var7 = (var6 & 0x3B9CEB8) >> 24;
                        if (!arg2.field94 || var7 == 0) {
                            int var8 = (var6 & 0x7) >> 1;
                            int var9 = var6 >> 14 & 0x3FF;
                            int var10 = (var6 & 0x3FFF) >> 3;
                            int var11 = (var9 / 8 << 8) + var10 / 8;
                            for (int var12 = 0; var12 < class76.field1081.length; var12++) {
                                if (class76.field1081[var12] == var11 && arg1[var12] != null) {
                                    arg2.method2330(var4 * 8, class169.field2234, var5 * 8, (var10 & 0x7) * 8, var3, class481.field6937, (var9 & 0x7) * 8, var8, arg1[var12], -17281, var7);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        field2774++;
        if (arg0) {
            field2777 = null;
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public abstract void method491(byte arg0, Component arg1);

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public abstract void method490(Component arg0, int arg1);

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(I)I")
    public abstract int method492(int arg0);
}
