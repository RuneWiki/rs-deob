import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class45 extends class254 {

    @OriginalMember(owner = "client!vb", name = "q", descriptor = "[I")
    public static int[] field633 = new int[1000];

    @OriginalMember(owner = "client!vb", name = "x", descriptor = "Z")
    public static boolean field640 = false;

    @OriginalMember(owner = "client!vb", name = "w", descriptor = "I")
    public static int field639 = 0;

    @OriginalMember(owner = "client!vb", name = "p", descriptor = "I")
    public static int field632;

    @OriginalMember(owner = "client!vb", name = "s", descriptor = "I")
    public static int field635;

    @OriginalMember(owner = "client!vb", name = "u", descriptor = "I")
    public static int field637;

    @OriginalMember(owner = "client!vb", name = "v", descriptor = "I")
    public int field638;

    @OriginalMember(owner = "client!vb", name = "y", descriptor = "I")
    public int field641;

    @OriginalMember(owner = "client!vb", name = "z", descriptor = "I")
    public static int field642;

    @OriginalMember(owner = "client!vb", name = "A", descriptor = "I")
    public int field643;

    @OriginalMember(owner = "client!vb", name = "B", descriptor = "I")
    public static int field644;

    @OriginalMember(owner = "client!vb", name = "r", descriptor = "Lve;")
    public static class233 field634;

    @OriginalMember(owner = "client!vb", name = "t", descriptor = "Lve;")
    public static class233 field636;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIIIILvi;I)V")
    public static final void method299(int arg0, int arg1, int arg2, int arg3, int arg4, class5 arg5, int arg6) {
        int var7 = 85 % ((arg2 - 57) / 47);
        field635++;
        class110.method721(arg1, arg5.field94, arg0, arg4, arg5.field45, (byte) -100, arg6, arg3);
    }

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(III)I")
    public static final int method300(int arg0, int arg1, int arg2) {
        field642++;
        int var3 = class266.method1770(arg0 - 1, arg1 + -1, 84) + class266.method1770(arg0 - 1, arg1 - -1, 83) + class266.method1770(arg0 + 1, arg1 - 1, 70) + class266.method1770(arg0 - -1, arg1 + 1, 93);
        if (arg2 != 9089) {
            field632 = 90;
        }
        int var4 = class266.method1770(arg0, arg1 - 1, 117) + class266.method1770(arg0, arg1 + 1, 119) + class266.method1770(arg0 + -1, arg1, 111) + class266.method1770(arg0 + 1, arg1, arg2 ^ 0x23D9);
        int var5 = class266.method1770(arg0, arg1, 67);
        return var4 / 8 + var3 / 16 + var5 / 4;
    }

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "(I)V")
    public static void method301(int arg0) {
        if (arg0 == 4) {
            field636 = null;
            field634 = null;
            field633 = null;
        }
    }

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "(I)[Lvd;")
    public static final class117[] method302(int arg0) {
        class117[] var1 = new class117[class160.field2321];
        field644++;
        for (int var2 = 0; var2 < class160.field2321; var2++) {
            var1[var2] = new class117(class68.field1056, class141.field2041, class91.field1386[var2], class211.field3035[var2], class246.field3682[var2], class282.field4500[var2], class263.field3965[var2], class128.field1883);
        }
        if (arg0 != 29713) {
            field639 = -4;
        }
        class290.method1935(0);
        return var1;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lvd;B)V")
    public static final void method303(class117 arg0, byte arg1) {
        field637++;
        short var2 = 256;
        for (int var3 = 0; var3 < class220.field3254.length; var3++) {
            class220.field3254[var3] = 0;
        }
        for (int var4 = 0; var4 < 5000; var4++) {
            int var16 = (int) ((double) var2 * Math.random() * 128.0D);
            class220.field3254[var16] = (int) (Math.random() * 284.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var12 = 1; var12 < (var2 - 1); var12++) {
                for (int var14 = 1; var14 < 127; var14++) {
                    int var15 = var14 + (var12 << 7);
                    class81.field1252[var15] = (class220.field3254[var15 - 1] + class220.field3254[var15 + 128] + class220.field3254[var15 - 128] + class220.field3254[var15 + 1]) / 4;
                }
            }
            int[] var13 = class220.field3254;
            class220.field3254 = class81.field1252;
            class81.field1252 = var13;
        }
        if (arg1 >= -42 || arg0 == null) {
            return;
        }
        int var6 = 0;
        for (int var7 = 0; var7 < arg0.field2492; var7++) {
            for (int var8 = 0; var8 < arg0.field2499; var8++) {
                if (arg0.field1725[var6++] != 0) {
                    int var9 = arg0.field2485 + var8 + 16;
                    int var10 = var7 + arg0.field2488 + 16;
                    int var11 = (var10 << 7) + var9;
                    class220.field3254[var11] = 0;
                }
            }
        }
    }
}
