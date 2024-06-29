import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class153 extends class32 {

    @OriginalMember(owner = "client!aa", name = "i", descriptor = "Z")
    public static boolean field2674 = true;

    @OriginalMember(owner = "client!aa", name = "n", descriptor = "Lug;")
    public static class66 field2679 = new class66(0, 0);

    @OriginalMember(owner = "client!aa", name = "q", descriptor = "I")
    public static int field2682 = 0;

    @OriginalMember(owner = "client!aa", name = "p", descriptor = "Lqe;")
    public static class42 field2681 = new class42(64);

    @OriginalMember(owner = "client!aa", name = "x", descriptor = "I")
    public static int field2689 = 0;

    @OriginalMember(owner = "client!aa", name = "v", descriptor = "[I")
    public static int[] field2687 = new int[100];

    @OriginalMember(owner = "client!aa", name = "y", descriptor = "Lda;")
    public static class275 field2690 = class255.method1672(124, "Zugewiesener Speicher)3");

    @OriginalMember(owner = "client!aa", name = "r", descriptor = "F")
    public static float field2683;

    @OriginalMember(owner = "client!aa", name = "h", descriptor = "I")
    public static int field2673;

    @OriginalMember(owner = "client!aa", name = "j", descriptor = "I")
    public static int field2675;

    @OriginalMember(owner = "client!aa", name = "l", descriptor = "I")
    public static int field2677;

    @OriginalMember(owner = "client!aa", name = "m", descriptor = "I")
    public static int field2678;

    @OriginalMember(owner = "client!aa", name = "o", descriptor = "I")
    public static int field2680;

    @OriginalMember(owner = "client!aa", name = "s", descriptor = "I")
    public static int field2684;

    @OriginalMember(owner = "client!aa", name = "u", descriptor = "I")
    public static int field2686;

    @OriginalMember(owner = "client!aa", name = "w", descriptor = "I")
    public static int field2688;

    @OriginalMember(owner = "client!aa", name = "k", descriptor = "Lma;")
    public static class105 field2676;

    @OriginalMember(owner = "client!aa", name = "t", descriptor = "[Lfd;")
    public static class229[] field2685;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Z)V")
    public static void method1078(boolean arg0) {
        if (!arg0) {
            return;
        }
        field2681 = null;
        field2690 = null;
        field2687 = null;
        field2676 = null;
        field2685 = null;
        field2679 = null;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(B)V")
    public static final void method1079(byte arg0) {
        int var1 = 81 % ((arg0 - 2) / 32);
        field2684++;
        class171.field2981.method987((byte) 118);
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IIIB)V")
    public static final void method1080(int arg0, int arg1, int arg2, byte arg3) {
        if (class61.field1019 != 0 && arg1 != 0 && class17.field247 < 50 && arg2 != -1) {
            class270.field4701[class17.field247] = arg2;
            class70.field1146[class17.field247] = arg1;
            class191.field3280[class17.field247] = arg0;
            class25.field414[class17.field247] = null;
            class196.field3350[class17.field247] = 0;
            class17.field247++;
        }
        field2673++;
        if (arg3 > -52) {
            method1078(true);
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "([Lda;III)Lda;")
    public static final class275 method1081(class275[] arg0, int arg1, int arg2, int arg3) {
        field2678++;
        int var4 = 0;
        for (int var5 = 0; var5 < arg1; var5++) {
            if (arg0[arg2 + var5] == null) {
                arg0[arg2 + var5] = class173.field2998;
            }
            var4 += arg0[arg2 + var5].field4752;
        }
        int var6 = 0;
        byte[] var7 = new byte[var4];
        for (int var8 = 0; var8 < arg1; var8++) {
            class275 var10 = arg0[arg2 + var8];
            class154.method1085(var10.field4749, 0, var7, var6, var10.field4752);
            var6 += var10.field4752;
        }
        class275 var9 = new class275();
        if (arg3 != -29817) {
            field2674 = true;
        }
        var9.field4752 = var4;
        var9.field4749 = var7;
        return var9;
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(B)Lna;")
    public static final class255 method1082(byte arg0) {
        if (arg0 <= 96) {
            method1079((byte) -113);
        }
        field2675++;
        try {
            return (class255) Class.forName("lk").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IBI)I")
    public static final int method1083(int arg0, byte arg1, int arg2) {
        field2677++;
        if (arg2 == -2) {
            return 12345678;
        } else if (arg2 == -1) {
            if (arg0 < 2) {
                arg0 = 2;
            } else if (arg0 > 126) {
                arg0 = 126;
            }
            return arg0;
        } else {
            if (arg1 >= -15) {
                method1082((byte) -66);
            }
            int var3 = (arg2 & 0x7F) * arg0 >> 7;
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg2 & 0xFF80) + var3;
        }
    }
}
