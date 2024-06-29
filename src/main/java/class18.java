import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!j")
public class class18 {

    @OriginalMember(owner = "mapview!j", name = "c", descriptor = "I")
    public static volatile int field261 = 0;

    @OriginalMember(owner = "mapview!j", name = "a", descriptor = "Ln;")
    public static class26 field259 = class9.method82(255, "Cooking Range");

    @OriginalMember(owner = "mapview!j", name = "b", descriptor = "I")
    public static int field260 = 0;

    @OriginalMember(owner = "mapview!j", name = "e", descriptor = "Ln;")
    public static class26 field263 = class9.method82(255, " map");

    @OriginalMember(owner = "mapview!j", name = "d", descriptor = "I")
    public static int field262;

    @OriginalMember(owner = "mapview!j", name = "a", descriptor = "(IB)[B", line = 4)
    public static final synchronized byte[] method135(int arg0, byte arg1) {
        if (arg0 == 100 && class19.field265 > 0) {
            byte[] var2 = class4.field103[--class19.field265];
            class4.field103[class19.field265] = null;
            return var2;
        } else if (arg0 == 5000 && class28.field358 > 0) {
            byte[] var3 = class14.field231[--class28.field358];
            class14.field231[class28.field358] = null;
            return var3;
        } else {
            if (arg1 <= 79) {
                method138(true);
            }
            if (arg0 == 30000 && class23.field323 > 0) {
                byte[] var4 = class28.field366[--class23.field323];
                class28.field366[class23.field323] = null;
                return var4;
            } else {
                return new byte[arg0];
            }
        }
    }

    @OriginalMember(owner = "mapview!j", name = "a", descriptor = "(I)V", line = 40)
    public static final void method136(int arg0) {
        class28 var1 = class35.field419;
        synchronized (class35.field419) {
            if (arg0 != 5000) {
                field259 = null;
            }
            class11.field204 = class36.field460;
            if (class5.field125 < 0) {
                for (int var2 = 0; var2 < 112; var2++) {
                    class5.field137[var2] = false;
                }
                class5.field125 = class4.field118;
            } else {
                while (class5.field125 != class4.field118) {
                    int var3 = class11.field201[class4.field118];
                    class4.field118 = class4.field118 + 1 & 0x7F;
                    if (var3 < 0) {
                        class5.field137[~var3] = false;
                    } else {
                        class5.field137[var3] = true;
                    }
                }
            }
            class36.field460 = class14.field229;
        }
    }

    @OriginalMember(owner = "mapview!j", name = "a", descriptor = "(JB)V", line = 81)
    public static final void method137(long arg0, byte arg1) {
        int var3 = -38 % ((arg1 - 64) / 42);
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L == 0L) {
            class17.method122(-115, arg0 - 1L);
            class17.method122(-107, 1L);
        } else {
            class17.method122(-115, arg0);
        }
    }

    @OriginalMember(owner = "mapview!j", name = "a", descriptor = "(Z)V", line = 103)
    public static void method138(boolean arg0) {
        field259 = null;
        if (arg0) {
            method137(-65L, (byte) 114);
        }
        field263 = null;
    }

    @OriginalMember(owner = "mapview!j", name = "a", descriptor = "([BIZI)I", line = 125)
    public static final int method139(byte[] arg0, int arg1, boolean arg2, int arg3) {
        int var4 = -1;
        for (int var5 = arg3; var5 < arg1; var5++) {
            var4 = var4 >>> 8 ^ class6.field145[(arg0[var5] ^ var4) & 0xFF];
        }
        if (arg2) {
            field263 = null;
        }
        return ~var4;
    }
}
