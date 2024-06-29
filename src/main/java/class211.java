import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class211 {

    @OriginalMember(owner = "client!p", name = "a", descriptor = "I")
    public static int field3550;

    @OriginalMember(owner = "client!p", name = "c", descriptor = "I")
    public static int field3552;

    @OriginalMember(owner = "client!p", name = "d", descriptor = "I")
    public static int field3553;

    @OriginalMember(owner = "client!p", name = "e", descriptor = "I")
    public static int field3554;

    @OriginalMember(owner = "client!p", name = "f", descriptor = "Lda;")
    public static class143 field3555;

    @OriginalMember(owner = "client!p", name = "b", descriptor = "[S")
    public static short[] field3551;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Lda;Lda;I)I", line = 4)
    public static final int method1548(class143 arg0, class143 arg1, int arg2) {
        field3550++;
        int var3 = 0;
        if (arg0.method1118(class43.field714, arg2 ^ 0x67AC)) {
            var3++;
        }
        if (arg0.method1118(class173.field3001, arg2 ^ 0x67AC)) {
            var3++;
        }
        if (arg0.method1118(class136.field2428, arg2 + 26540)) {
            var3++;
        }
        if (arg1.method1118(class43.field714, 26604)) {
            var3++;
        }
        if (arg1.method1118(class173.field3001, 26604)) {
            var3++;
        }
        if (arg2 != 64) {
            method1550(true, -22);
        }
        if (arg1.method1118(class136.field2428, 26604)) {
            var3++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IZ)Lqg;", line = 40)
    public static final class278 method1549(int arg0, boolean arg1) {
        field3552++;
        if (!arg1) {
            method1549(53, false);
        }
        class278 var2 = (class278) class70.field1117.method1382((byte) -107, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class90.field1601.method1128(arg0, 0, 11);
        class278 var4 = new class278();
        if (var3 != null) {
            var4.method1914((byte) 60, new class94(var3));
        }
        class70.field1117.method1386(var4, -80, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(ZI)V", line = 78)
    public static final void method1550(boolean arg0, int arg1) {
        byte[][] var2;
        if (class117.field2159 && arg0) {
            var2 = class131.field2361;
        } else {
            var2 = class209.field3542;
        }
        field3554++;
        int var3 = -108 % ((arg1 - 12) / 62);
        int var4 = class147.field2654.length;
        for (int var5 = 0; var5 < var4; var5++) {
            byte[] var6 = var2[var5];
            if (var6 != null) {
                int var7 = (class123.field2230[var5] >> 8) * 64 - class178.field3052;
                int var8 = (class123.field2230[var5] & 0xFF) * 64 - class258.field4294;
                class58.method401((byte) 62);
                class207.method1524(var8, (byte) -98, class267.field4473, var7, arg0, var6);
            }
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(I)V", line = 134)
    public static void method1551(int arg0) {
        field3551 = null;
        if (arg0 != 11) {
            field3551 = (short[]) null;
        }
        field3555 = null;
    }
}
