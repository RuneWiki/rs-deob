import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class9 implements Runnable {

    @OriginalMember(owner = "client!ah", name = "i", descriptor = "[Lsd;")
    public volatile class174[] field179 = new class174[2];

    @OriginalMember(owner = "client!ah", name = "l", descriptor = "Z")
    public volatile boolean field182 = false;

    @OriginalMember(owner = "client!ah", name = "o", descriptor = "Z")
    public volatile boolean field185 = false;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "Ldd;")
    public static class35 field171 = class180.method1196((byte) 126, "(U0a )2 via: ");

    @OriginalMember(owner = "client!ah", name = "e", descriptor = "Ldd;")
    private static class35 field175 = class180.method1196((byte) -61, "Loaded fonts");

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "Ldd;")
    public static class35 field173 = field175;

    @OriginalMember(owner = "client!ah", name = "d", descriptor = "I")
    public static int field174 = 1;

    @OriginalMember(owner = "client!ah", name = "g", descriptor = "I")
    public static int field177 = 0;

    @OriginalMember(owner = "client!ah", name = "n", descriptor = "Ldd;")
    public static class35 field184 = class180.method1196((byte) -57, "Bitte laden Sie die Seite neu)3");

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "Ll;")
    public static class107 field172 = new class107(4096);

    @OriginalMember(owner = "client!ah", name = "q", descriptor = "I")
    public static int field187 = 0;

    @OriginalMember(owner = "client!ah", name = "r", descriptor = "Ldd;")
    private static class35 field188 = class180.method1196((byte) 127, "Please subscribe)1 or use a different world)3");

    @OriginalMember(owner = "client!ah", name = "t", descriptor = "Ldd;")
    public static class35 field190 = field188;

    @OriginalMember(owner = "client!ah", name = "f", descriptor = "I")
    public static int field176;

    @OriginalMember(owner = "client!ah", name = "h", descriptor = "I")
    public static int field178;

    @OriginalMember(owner = "client!ah", name = "j", descriptor = "I")
    public static int field180;

    @OriginalMember(owner = "client!ah", name = "k", descriptor = "I")
    public static int field181;

    @OriginalMember(owner = "client!ah", name = "u", descriptor = "Lda;")
    public static class32 field191;

    @OriginalMember(owner = "client!ah", name = "m", descriptor = "Le;")
    public class41 field183;

    @OriginalMember(owner = "client!ah", name = "s", descriptor = "Lag;")
    public static class8 field189;

    @OriginalMember(owner = "client!ah", name = "p", descriptor = "[I")
    public static int[] field186;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Z)V")
    public static void method66(boolean arg0) {
        field189 = null;
        field190 = null;
        field191 = null;
        field173 = null;
        field171 = null;
        field175 = null;
        field188 = null;
        field184 = null;
        field186 = null;
        if (!arg0) {
            field172 = null;
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IIIIIBII)V")
    public static final void method67(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7) {
        field178++;
        if (arg2 >= 1 && arg0 >= 1 && arg2 <= 102 && arg0 <= 102) {
            if (class35.field781 && class175.field3585 != arg4) {
                return;
            }
            boolean var8 = true;
            boolean var9 = false;
            long var10 = 0L;
            boolean var12 = false;
            if (arg1 == 0) {
                var10 = class111.method812(arg4, arg2, arg0);
            }
            if (arg1 == 1) {
                var10 = class55.method484(arg4, arg2, arg0);
            }
            if (arg1 == 2) {
                var10 = class88.method651(arg4, arg2, arg0);
            }
            if (arg1 == 3) {
                var10 = class56.method495(arg4, arg2, arg0);
            }
            if (var10 != 0L) {
                int var13 = Integer.MAX_VALUE & (int) (var10 >>> 32);
                int var14 = (int) var10 >> 14 & 0x1F;
                int var15 = (int) var10 >> 20 & 0x3;
                if (arg1 == 0) {
                    class191.method1257(arg4, arg2, arg0);
                    class145 var16 = class4.method23((byte) -78, var13);
                    if (var16.field3045 != 0) {
                        class167.field3375[arg4].method299(var16.field3076, -123, var15, arg2, var14, arg0);
                    }
                }
                if (arg1 == 1) {
                    class145.method994(arg4, arg2, arg0);
                }
                if (arg1 == 2) {
                    class65.method537(arg4, arg2, arg0);
                    class145 var17 = class4.method23((byte) -71, var13);
                    if (var17.field3017 + arg2 > 103 || var17.field3017 + arg0 > 103 || var17.field3034 + arg2 > 103 || var17.field3034 + arg0 > 103) {
                        return;
                    }
                    if (var17.field3045 != 0) {
                        class167.field3375[arg4].method296(arg2, (byte) -96, var15, var17.field3076, var17.field3017, var17.field3034, arg0);
                    }
                }
                if (arg1 == 3) {
                    class210.method1380(arg4, arg2, arg0);
                    class145 var18 = class4.method23((byte) -120, var13);
                    if (var18.field3045 == 1) {
                        class167.field3375[arg4].method295(arg0, arg5 - 262219, arg2);
                    }
                }
            }
            if (arg7 >= 0) {
                int var19 = arg4;
                if (arg4 < 3 && (class40.field894[1][arg2][arg0] & 0x2) == 2) {
                    var19 = arg4 + 1;
                }
                class4.method21(arg7, arg2, arg0, class167.field3375[arg4], arg4, 2, arg3, arg6, var19);
            }
        }
        if (arg5 != 74) {
            field175 = null;
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IBIII)I")
    public static final int method68(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        if (arg1 == -72) {
            field180++;
            int var5 = 65536 - class11.field201[arg0 * 1024 / arg4] >> 1;
            return ((65536 - var5) * arg3 >> 16) + (arg2 * var5 >> 16);
        } else {
            return 18;
        }
    }

    @OriginalMember(owner = "client!ah", name = "run", descriptor = "()V")
    public final void run() {
        field181++;
        this.field185 = true;
        try {
            while (!this.field182) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class174 var2 = this.field179[var1];
                    if (var2 != null) {
                        var2.method1164(0);
                    }
                }
                class204.method1347(10L, false);
                class51.method453(this.field183, null, (byte) -121);
            }
        } catch (Exception var9) {
            class173.method1145((byte) -65, null, var9);
        } finally {
            Object var6 = null;
            this.field185 = false;
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(ILag;)V")
    public static final void method69(int arg0, class8 arg1) {
        field176++;
        field189 = arg1;
        class130.field2787 = field189.method56((byte) 31, arg0);
    }
}
