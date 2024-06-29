import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mn")
public class class205 {

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "[I")
    public int[] field3283 = new int[257];

    @OriginalMember(owner = "client!mn", name = "d", descriptor = "[I")
    public int[] field3286 = new int[6];

    @OriginalMember(owner = "client!mn", name = "i", descriptor = "[[B")
    public byte[][] field3291 = new byte[6][258];

    @OriginalMember(owner = "client!mn", name = "n", descriptor = "[B")
    public byte[] field3296 = new byte[4096];

    @OriginalMember(owner = "client!mn", name = "q", descriptor = "[B")
    public byte[] field3299 = new byte[256];

    @OriginalMember(owner = "client!mn", name = "m", descriptor = "[Z")
    public boolean[] field3295 = new boolean[16];

    @OriginalMember(owner = "client!mn", name = "y", descriptor = "[I")
    public int[] field3307 = new int[16];

    @OriginalMember(owner = "client!mn", name = "x", descriptor = "[[I")
    public int[][] field3306 = new int[6][258];

    @OriginalMember(owner = "client!mn", name = "j", descriptor = "I")
    public int field3292 = 0;

    @OriginalMember(owner = "client!mn", name = "w", descriptor = "I")
    public int field3305 = 0;

    @OriginalMember(owner = "client!mn", name = "L", descriptor = "[Z")
    public boolean[] field3319 = new boolean[256];

    @OriginalMember(owner = "client!mn", name = "H", descriptor = "[[I")
    public int[][] field3315 = new int[6][258];

    @OriginalMember(owner = "client!mn", name = "K", descriptor = "[I")
    public int[] field3318 = new int[256];

    @OriginalMember(owner = "client!mn", name = "G", descriptor = "[B")
    public byte[] field3314 = new byte[18002];

    @OriginalMember(owner = "client!mn", name = "J", descriptor = "[[I")
    public int[][] field3317 = new int[6][258];

    @OriginalMember(owner = "client!mn", name = "I", descriptor = "[B")
    public byte[] field3316 = new byte[18002];

    @OriginalMember(owner = "client!mn", name = "t", descriptor = "I")
    public static int field3302 = -1;

    @OriginalMember(owner = "client!mn", name = "B", descriptor = "[I")
    public static int[] field3309 = new int[25];

    @OriginalMember(owner = "client!mn", name = "p", descriptor = "I")
    public static int field3298 = 0;

    @OriginalMember(owner = "client!mn", name = "u", descriptor = "B")
    public byte field3303;

    @OriginalMember(owner = "client!mn", name = "b", descriptor = "I")
    public int field3284;

    @OriginalMember(owner = "client!mn", name = "c", descriptor = "I")
    public int field3285;

    @OriginalMember(owner = "client!mn", name = "e", descriptor = "I")
    public int field3287;

    @OriginalMember(owner = "client!mn", name = "f", descriptor = "I")
    public int field3288;

    @OriginalMember(owner = "client!mn", name = "g", descriptor = "I")
    public int field3289;

    @OriginalMember(owner = "client!mn", name = "h", descriptor = "I")
    public int field3290;

    @OriginalMember(owner = "client!mn", name = "l", descriptor = "I")
    public int field3294;

    @OriginalMember(owner = "client!mn", name = "o", descriptor = "I")
    public int field3297;

    @OriginalMember(owner = "client!mn", name = "s", descriptor = "I")
    public static int field3301;

    @OriginalMember(owner = "client!mn", name = "v", descriptor = "I")
    public int field3304;

    @OriginalMember(owner = "client!mn", name = "z", descriptor = "I")
    public int field3308;

    @OriginalMember(owner = "client!mn", name = "C", descriptor = "I")
    public static int field3310;

    @OriginalMember(owner = "client!mn", name = "E", descriptor = "I")
    public static int field3312;

    @OriginalMember(owner = "client!mn", name = "F", descriptor = "I")
    public int field3313;

    @OriginalMember(owner = "client!mn", name = "M", descriptor = "I")
    public int field3320;

    @OriginalMember(owner = "client!mn", name = "N", descriptor = "I")
    public int field3321;

    @OriginalMember(owner = "client!mn", name = "r", descriptor = "Lmo;")
    public static class447 field3300;

    @OriginalMember(owner = "client!mn", name = "k", descriptor = "[B")
    public byte[] field3293;

    @OriginalMember(owner = "client!mn", name = "D", descriptor = "[B")
    public byte[] field3311;

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(I)V")
    public static final void method1451(int arg0) {
        field3310++;
        if (arg0 <= 78) {
            method1453((class312) null, 29, false, 77, (class37) null);
        }
        class52 var1 = class8.field102;
        synchronized (class8.field102) {
            class8.field102.method335((byte) -111);
        }
    }

    @OriginalMember(owner = "client!mn", name = "b", descriptor = "(I)V")
    public static void method1452(int arg0) {
        field3309 = null;
        if (arg0 <= 105) {
            field3302 = 49;
        }
        field3300 = null;
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(Le;IZILbd;)V")
    public static final void method1453(class312 arg0, int arg1, boolean arg2, int arg3, class37 arg4) {
        field3312++;
        if (!arg2) {
            return;
        }
        class315.field4952.method255(-20994);
        if (class104.field1464) {
            return;
        }
        for (class222 var5 = (class222) arg4.method253((byte) -6); var5 != null; var5 = (class222) arg4.method247((byte) 48)) {
            class324 var6 = class288.method1944(36, var5.field3684);
            if (class99.method746(var6, (byte) -106)) {
                boolean var7 = class19.method146(var6, var5, arg1, (byte) -95, arg3, arg0);
                if (var7) {
                    class35.method232(arg0, var5, arg2, var6);
                }
            }
        }
    }
}
