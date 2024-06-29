import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public abstract class class252 {

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "[I")
    public static int[] field4359 = new int[256];

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "Lmb;")
    public static class96 field4362 = class243.method1708("<col=ff3000>", (byte) 106);

    @OriginalMember(owner = "client!ab", name = "g", descriptor = "I")
    public static int field4365 = 0;

    @OriginalMember(owner = "client!ab", name = "i", descriptor = "Lmb;")
    public static class96 field4367 = class243.method1708("Texturen geladen)3", (byte) 122);

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "I")
    public static int field4360;

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "I")
    public static int field4361;

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "I")
    public static int field4363;

    @OriginalMember(owner = "client!ab", name = "f", descriptor = "I")
    public static int field4364;

    @OriginalMember(owner = "client!ab", name = "h", descriptor = "I")
    public static int field4366;

    @OriginalMember(owner = "client!ab", name = "j", descriptor = "I")
    public static int field4368;

    @OriginalMember(owner = "client!ab", name = "k", descriptor = "[Lmj;")
    public static class246[] field4369;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIIIILnb;IJZ)Z")
    public static final boolean method1752(int arg0, int arg1, int arg2, int arg3, int arg4, class108 arg5, int arg6, long arg7, boolean arg8) {
        if (arg5 == null) {
            return true;
        }
        int var10 = arg1 - arg4;
        int var11 = arg2 - arg4;
        int var12 = arg1 + arg4;
        int var13 = arg2 + arg4;
        if (arg8) {
            if (arg6 > 640 && arg6 < 1408) {
                var13 += 128;
            }
            if (arg6 > 1152 && arg6 < 1920) {
                var12 += 128;
            }
            if (arg6 > 1664 || arg6 < 384) {
                var11 -= 128;
            }
            if (arg6 > 128 && arg6 < 896) {
                var10 -= 128;
            }
        }
        int var14 = var10 / 128;
        int var15 = var11 / 128;
        int var16 = var12 / 128;
        int var17 = var13 / 128;
        return class120.method925(arg0, var14, var15, var16 + 1 - var14, var17 - var15 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7);
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIIII)I")
    public static final int method1753(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4360++;
        int var5 = 65536 - class240.field4176[arg3 * 1024 / arg2] >> 1;
        int var6 = -76 / ((28 - arg4) / 62);
        return ((65536 - var5) * arg0 >> 16) + (arg1 * var5 >> 16);
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(ZZ)V")
    public static final void method1754(boolean arg0, boolean arg1) {
        if (arg1) {
            if (class107.field1825 != -1) {
                class52.method400(false, class107.field1825);
            }
            for (class168 var2 = (class168) class34.field606.method1074(!arg0); var2 != null; var2 = (class168) class34.field606.method1087((byte) -63)) {
                class65.method458(var2, -22, true);
            }
            class107.field1825 = -1;
            class34.field606 = new class146(8);
            class268.method1838(-36);
            class107.field1825 = class42.field724;
            class94.method659(false, (byte) 123);
            class202.method1414(5951);
            class137.method1023(class107.field1825, (byte) 37);
        }
        class236.field4047 = new class47();
        field4363++;
        if (!arg0) {
            field4367 = null;
        }
        class236.field4047.field4511 = 3000;
        class236.field4047.field4533 = 3000;
        class186.method1319(class103.field1735, 255);
        class146.method1076(6938, 10);
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)V")
    public static void method1755(int arg0) {
        field4359 = null;
        if (arg0 != 1152) {
            method1752(58, -99, 87, -48, -117, (class108) null, 77, -111L, false);
        }
        field4362 = null;
        field4367 = null;
        field4369 = null;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(II)I")
    public static final int method1756(int arg0, int arg1) {
        if (arg1 > -110) {
            return 105;
        } else {
            field4366++;
            return arg0 >>> 7;
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lh;BLh;)V")
    public static final void method1757(class249 arg0, byte arg1, class249 arg2) {
        if (arg2.field4302 != null) {
            arg2.method1743((byte) 87);
        }
        int var3 = 13 % ((arg1 - 69) / 44);
        field4364++;
        arg2.field4307 = arg0;
        arg2.field4302 = arg0.field4302;
        arg2.field4302.field4307 = arg2;
        arg2.field4307.field4302 = arg2;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(III)I")
    public abstract int method419(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(B)V")
    public abstract void method420(byte arg0);
}
