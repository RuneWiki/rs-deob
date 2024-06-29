import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public class class208 extends class273 {

    @OriginalMember(owner = "client!ck", name = "S", descriptor = "I")
    public static int field3766 = 0;

    @OriginalMember(owner = "client!ck", name = "Y", descriptor = "[I")
    public static int[] field3772 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!ck", name = "V", descriptor = "I")
    public static int field3769 = -1;

    @OriginalMember(owner = "client!ck", name = "ab", descriptor = "Ljd;")
    public static class86 field3774 = class122.method868(" loggt sich aus)3", true);

    @OriginalMember(owner = "client!ck", name = "W", descriptor = "I")
    public static int field3770 = 0;

    @OriginalMember(owner = "client!ck", name = "bb", descriptor = "[I")
    public static int[] field3775 = new int[2000];

    @OriginalMember(owner = "client!ck", name = "T", descriptor = "I")
    public static int field3767;

    @OriginalMember(owner = "client!ck", name = "U", descriptor = "I")
    public static int field3768;

    @OriginalMember(owner = "client!ck", name = "X", descriptor = "I")
    public static int field3771;

    @OriginalMember(owner = "client!ck", name = "Z", descriptor = "I")
    public static int field3773;

    @OriginalMember(owner = "client!ck", name = "d", descriptor = "(III)Ls;")
    public static final class228 method1478(int arg0, int arg1, int arg2) {
        class249 var3 = class248.field4406[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field4445; var4++) {
            class228 var5 = var3.field4429[var4];
            if ((var5.field4122 >> 29 & 0x3L) == 2L && var5.field4137 == arg1 && var5.field4127 == arg2) {
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IIIZIII)V")
    public static final void method1479(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        field3771++;
        int var7 = 0;
        class20[] var8 = class180.field3247;
        if (!arg3) {
            method1479(69, -20, -80, true, 76, 13, 87);
        }
        while (var7 < var8.length) {
            class20 var9 = var8[var7];
            if (var9 != null && var9.field516 == 2) {
                class4.method20(var9.field525 * 2, -1, arg0, arg6 >> 1, (var9.field535 - class252.field4481 << 7) + var9.field527, (-class79.field1554 + var9.field521 << 7) + var9.field523, arg2, arg1 >> 1);
                if (class54.field1103 > -1 && class236.field4265 % 20 < 10) {
                    class271.field4756[var9.field529].method668(arg5 + class54.field1103 - 12, arg4 - 28 + class56.field1153);
                }
            }
            var7++;
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(ILof;)V")
    public static final void method1480(int arg0, class254 arg1) {
        class21.field547 = 3;
        class134.method965(true, true);
        if (arg0 != -12) {
            field3772 = null;
        }
        class42.field936 = true;
        class133.field2513 = 2;
        class116.field2224 = true;
        class83.field1621 = true;
        class31.field647 = true;
        class139.field2646 = 255;
        field3768++;
        class7.field248 = 0;
        class264.field4672 = 127;
        class64.field1257 = 0;
        class272.field4769 = true;
        class152.field2879 = 127;
        class65.field1286 = 0;
        class194.field3481 = 0;
        class107.field2061 = true;
        class4.field63 = true;
        class103 var2 = null;
        class168.field3114 = true;
        class79.field1555 = true;
        class161.field3029 = true;
        class50.field1045 = false;
        class202.field3655 = true;
        class42.field949 = 0;
        try {
            class26 var3 = arg1.method1713("runescape", (byte) -114);
            while (var3.field613 == 0) {
                class91.method677(0, 1L);
            }
            if (var3.field613 == 1) {
                var2 = (class103) var3.field611;
                byte[] var4 = new byte[(int) var2.method738(-4551)];
                int var6;
                for (int var5 = 0; var5 < var4.length; var5 += var6) {
                    var6 = var2.method742(var5, arg0 ^ 0xFFFFFFF4, var4.length - var5, var4);
                    if (var6 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class1.method8(new class200(var4), true);
            }
        } catch (Exception var8) {
        }
        try {
            if (var2 != null) {
                var2.method740(1);
            }
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(BII)I")
    public static final int method1481(byte arg0, int arg1, int arg2) {
        field3767++;
        if (arg0 != 28) {
            method1480(44, (class254) null);
        }
        int var3 = 0;
        while (arg1 > 0) {
            var3 = arg2 & 0x1 | var3 << 1;
            arg1--;
            arg2 >>>= 0x1;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ck", name = "<init>", descriptor = "()V")
    public class208() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ck", name = "f", descriptor = "(I)V")
    public static void method1482(int arg0) {
        field3775 = null;
        field3772 = null;
        if (arg0 != 0) {
            field3769 = -75;
        }
        field3774 = null;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(II)[I")
    public final int[] method31(int arg0, int arg1) {
        if (arg0 == -7420) {
            field3773++;
            return class114.field2184;
        } else {
            return null;
        }
    }
}
