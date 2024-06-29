import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class51 {

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "I")
    public static int field738 = -1;

    @OriginalMember(owner = "client!ej", name = "f", descriptor = "J")
    public static long field743 = 0L;

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "I")
    public static int field739;

    @OriginalMember(owner = "client!ej", name = "c", descriptor = "I")
    public static int field740;

    @OriginalMember(owner = "client!ej", name = "e", descriptor = "I")
    public static int field742;

    @OriginalMember(owner = "client!ej", name = "d", descriptor = "[I")
    public static int[] field741;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(BZ)V")
    public static final void method389(byte arg0, boolean arg1) {
        field742++;
        if (class266.field4309 == arg1) {
            return;
        }
        class266.field4309 = arg1;
        class225.method1614(-122);
        if (arg0 != 29) {
            field741 = null;
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(I)V")
    public static void method390(int arg0) {
        field741 = null;
        if (arg0 != -104) {
            field738 = -116;
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IBI[B)Z")
    public static final boolean method391(int arg0, byte arg1, int arg2, byte[] arg3) {
        field740++;
        boolean var4 = true;
        class152 var5 = new class152(arg3);
        int var6 = -1;
        label58: while (true) {
            int var7 = var5.method1080(false);
            if (var7 == 0) {
                if (arg1 != -92) {
                    return false;
                }
                return var4;
            }
            var6 += var7;
            int var8 = 0;
            boolean var9 = false;
            while (true) {
                while (!var9) {
                    int var11 = var5.method1103(3);
                    if (var11 == 0) {
                        continue label58;
                    }
                    var8 += var11 - 1;
                    int var12 = var8 & 0x3F;
                    int var13 = var8 >> 6 & 0x3F;
                    int var14 = var5.method1111(255) >> 2;
                    int var15 = arg0 + var12;
                    int var16 = arg2 + var13;
                    if (var16 > 0 && var15 > 0 && var16 < 103 && var15 < 103) {
                        class36 var17 = class134.method970(var6, 0);
                        if (var14 != 22 || class207.field3334 || var17.field481 != 0 || var17.field516 == 1 || var17.field518) {
                            var9 = true;
                            if (!var17.method282((byte) -107)) {
                                var4 = false;
                                class286.field4549++;
                            }
                        }
                    }
                }
                int var10 = var5.method1103(3);
                if (var10 == 0) {
                    break;
                }
                var5.method1111(arg1 ^ 0xFFFFFF5B);
            }
        }
    }
}
