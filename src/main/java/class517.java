import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hw")
public class class517 {

    @OriginalMember(owner = "client!hw", name = "e", descriptor = "I")
    public static int field7365 = 0;

    @OriginalMember(owner = "client!hw", name = "b", descriptor = "Lkf;")
    public static class287 field7362 = new class287();

    @OriginalMember(owner = "client!hw", name = "h", descriptor = "[Ldda;")
    public static class651[] field7368 = null;

    @OriginalMember(owner = "client!hw", name = "f", descriptor = "I")
    public static int field7366;

    @OriginalMember(owner = "client!hw", name = "g", descriptor = "I")
    public static int field7367;

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "[B")
    public byte[] field7361;

    @OriginalMember(owner = "client!hw", name = "c", descriptor = "[S")
    public short[] field7363;

    @OriginalMember(owner = "client!hw", name = "d", descriptor = "[S")
    public short[] field7364;

    @OriginalMember(owner = "client!hw", name = "i", descriptor = "[S")
    public short[] field7369;

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(I)V", line = 7)
    public static void method2939(int arg0) {
        if (arg0 != 256) {
            method2941(106, null, null, 83, null, -120, -18, -8);
        }
        field7362 = null;
        field7368 = null;
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(IJ)V", line = 18)
    public static final void method2940(int arg0, long arg1) {
        field7367++;
        int var3 = 98 % ((arg0 - 50) / 36);
        int var4 = class196.field2268 + class362.field4859.field5179;
        int var5 = class362.field4859.field5176 + class492.field7141;
        if (class463.field6603 - var4 < -2000 || class463.field6603 - var4 > 2000 || (class307.field3793 - var5) < -2000 || (class307.field3793 - var5) > 2000) {
            class307.field3793 = var5;
            class463.field6603 = var4;
        }
        if (class463.field6603 != var4) {
            int var6 = var4 - class463.field6603;
            int var7 = (int) ((long) var6 * arg1 / 320L);
            if (var6 <= 0) {
                if (var7 == 0) {
                    var7 = -1;
                } else if (var7 < var6) {
                    var7 = var6;
                }
            } else if (var7 == 0) {
                var7 = 1;
            } else if (var6 < var7) {
                var7 = var6;
            }
            class463.field6603 += var7;
        }
        if (!class639.field9075.field6762) {
            class654.field9173 += (float) arg1 * class381.field5158 / 6.0F;
            class508.field7300 += (float) arg1 * class9.field94 / 6.0F;
        }
        if (class307.field3793 != var5) {
            int var8 = var5 - class307.field3793;
            int var9 = (int) ((long) var8 * arg1 / 320L);
            if (var8 <= 0) {
                if (var9 == 0) {
                    var9 = -1;
                } else if (var8 > var9) {
                    var9 = var8;
                }
            } else if (var9 == 0) {
                var9 = 1;
            } else if (var8 < var9) {
                var9 = var8;
            }
            class307.field3793 += var9;
        }
        class61.method327(-126);
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(ILf;Lua;ILwp;III)V", line = 116)
    public static final void method2941(int arg0, class534 arg1, class598 arg2, int arg3, class452 arg4, int arg5, int arg6, int arg7) {
        field7366++;
        if (arg1 == null) {
            return;
        }
        int var8;
        if (class538.field7572 == 4) {
            var8 = (int) class508.field7300 & 0x3FFF;
        } else {
            var8 = (int) class508.field7300 + class302.field3748 & 0x3FFF;
        }
        int var9 = Math.max(arg4.field6483 / 2, arg4.field6443 / 2) + 10;
        int var10 = arg0 * arg0 + arg6 * arg6;
        if (var10 > var9 * var9) {
            return;
        }
        int var11 = class435.field6134[var8];
        int var12 = -51 / ((arg5 - 85) / 38);
        int var13 = class435.field6135[var8];
        if (class538.field7572 != 4) {
            var13 = var13 * 256 / (class373.field5085 + 256);
            var11 = var11 * 256 / (class373.field5085 + 256);
        }
        int var14 = arg0 * var11 + arg6 * var13 >> 14;
        int var15 = arg0 * var13 - (arg6 * var11) >> 14;
        arg1.method301(arg3 + (arg4.field6483 / 2 - (arg1.method312() / 2 - var14)), arg4.field6443 / 2 + arg7 + -var15 + -(arg1.method304() / 2), arg2, arg3, arg7);
    }
}
