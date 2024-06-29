import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class190 {

    @OriginalMember(owner = "client!ta", name = "n", descriptor = "J")
    public long field3118 = 0L;

    @OriginalMember(owner = "client!ta", name = "g", descriptor = "[C")
    public static char[] field3111 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    @OriginalMember(owner = "client!ta", name = "i", descriptor = "[I")
    public static int[] field3113 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "I")
    public int field3105;

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "I")
    public int field3107;

    @OriginalMember(owner = "client!ta", name = "d", descriptor = "I")
    public int field3108;

    @OriginalMember(owner = "client!ta", name = "e", descriptor = "I")
    public int field3109;

    @OriginalMember(owner = "client!ta", name = "f", descriptor = "I")
    public int field3110;

    @OriginalMember(owner = "client!ta", name = "h", descriptor = "I")
    public static int field3112;

    @OriginalMember(owner = "client!ta", name = "j", descriptor = "I")
    public int field3114;

    @OriginalMember(owner = "client!ta", name = "k", descriptor = "I")
    public int field3115;

    @OriginalMember(owner = "client!ta", name = "l", descriptor = "I")
    public int field3116;

    @OriginalMember(owner = "client!ta", name = "m", descriptor = "I")
    public int field3117;

    @OriginalMember(owner = "client!ta", name = "p", descriptor = "I")
    public int field3120;

    @OriginalMember(owner = "client!ta", name = "q", descriptor = "I")
    public static int field3121;

    @OriginalMember(owner = "client!ta", name = "r", descriptor = "I")
    public static int field3122;

    @OriginalMember(owner = "client!ta", name = "s", descriptor = "I")
    public int field3123;

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "Lfc;")
    public static class149 field3106;

    @OriginalMember(owner = "client!ta", name = "o", descriptor = "Lci;")
    public class60 field3119;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIIILci;JLci;Lci;)V")
    public static final void method1311(int arg0, int arg1, int arg2, int arg3, class60 arg4, long arg5, class60 arg6, class60 arg7) {
        class192 var9 = new class192();
        var9.field3143 = arg4;
        var9.field3136 = arg1 * 128 + 64;
        var9.field3135 = arg2 * 128 + 64;
        var9.field3150 = arg3;
        var9.field3144 = arg5;
        var9.field3139 = arg6;
        var9.field3145 = arg7;
        int var10 = 0;
        class129 var11 = class26.field455[arg0][arg1][arg2];
        if (var11 != null) {
            for (int var12 = 0; var12 < var11.field2142; var12++) {
                class190 var13 = var11.field2131[var12];
                if ((var13.field3118 & 0x400000L) == 4194304L) {
                    int var14 = var13.field3119.method99();
                    if (var14 != -32768 && var14 < var10) {
                        var10 = var14;
                    }
                }
            }
        }
        var9.field3147 = -var10;
        if (class26.field455[arg0][arg1][arg2] == null) {
            class26.field455[arg0][arg1][arg2] = new class129(arg0, arg1, arg2);
        }
        class26.field455[arg0][arg1][arg2].field2126 = var9;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(B)V")
    public static void method1312(byte arg0) {
        field3111 = null;
        if (arg0 < -107) {
            field3106 = null;
            field3113 = null;
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(ZI)V")
    public static final void method1313(boolean arg0, int arg1) {
        field3112++;
        class45.method395(class137.field2301, true, class223.field3558, class33.field557, arg0);
        if (arg1 != 115) {
            method1311(-125, 56, 14, 115, (class60) null, 93L, (class60) null, (class60) null);
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IB)Lpe;")
    public static final class67 method1314(int arg0, byte arg1) {
        field3122++;
        class67 var2 = (class67) class144.field2383.method1155((long) arg0, true);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class250.field3989.method900(class174.method1251(-2091788216, arg0), class265.method1804((byte) -105, arg0), false);
        class67 var4 = new class67();
        var4.field1136 = arg0;
        if (var3 != null) {
            var4.method526(new class136(var3), (byte) 106);
        }
        var4.method513(arg1 ^ 0x41);
        if (var4.field1108 != -1) {
            var4.method520(56, method1314(var4.field1114, (byte) 68), method1314(var4.field1108, (byte) 68));
        }
        if (arg1 != 68) {
            field3121 = 44;
        }
        if (var4.field1156 != -1) {
            var4.method514(-60, method1314(var4.field1156, (byte) 68), method1314(var4.field1101, (byte) 68));
        }
        if (!class16.field242 && var4.field1161) {
            var4.field1150 = 0;
            var4.field1160 = class246.field3875;
            var4.field1092 = class96.field1491;
            var4.field1155 = class230.field3663;
            var4.field1096 = false;
        }
        class144.field2383.method1161(var4, (byte) -128, (long) arg0);
        return var4;
    }
}
