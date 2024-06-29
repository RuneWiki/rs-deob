import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class234 {

    @OriginalMember(owner = "client!t", name = "f", descriptor = "Lhj;")
    public class116 field3659 = new class116();

    @OriginalMember(owner = "client!t", name = "g", descriptor = "Ljava/lang/String;")
    public static String field3660 = "wave:";

    @OriginalMember(owner = "client!t", name = "e", descriptor = "Llh;")
    public static class58 field3658 = new class58();

    @OriginalMember(owner = "client!t", name = "a", descriptor = "I")
    public static int field3654;

    @OriginalMember(owner = "client!t", name = "b", descriptor = "I")
    public static int field3655;

    @OriginalMember(owner = "client!t", name = "c", descriptor = "I")
    public static int field3656;

    @OriginalMember(owner = "client!t", name = "d", descriptor = "I")
    public static int field3657;

    @OriginalMember(owner = "client!t", name = "h", descriptor = "I")
    public static int field3661;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Lhj;I)V")
    public final void method1535(class116 arg0, int arg1) {
        field3657++;
        int var3 = -114 / ((arg1 + 55) / 63);
        if (arg0.field1676 != null) {
            arg0.method742((byte) -82);
        }
        arg0.field1679 = this.field3659;
        arg0.field1676 = this.field3659.field1676;
        arg0.field1676.field1679 = arg0;
        arg0.field1679.field1676 = arg0;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IIII)V")
    public static final void method1536(int arg0, int arg1, int arg2, int arg3) {
        field3656++;
        if (arg1 <= 39) {
            return;
        }
        class43 var4 = class149.method933(false, arg2, arg0, arg3);
        if (var4 == null) {
            return;
        }
        class211.field3148 = new int[var4.field648];
        if (var4.field649 == 15 || var4.field649 == 17 || var4.field649 == 16) {
            int var5 = 0;
            int var6 = 0;
            if (class164.field2335 != null) {
                var6 = class164.field2335.field2667;
                var5 = class164.field2335.field2554;
            }
            class211.field3148[0] = class17.field304 - var6;
            class211.field3148[1] = class249.field3891 - var5;
        }
        class131.field1823 = new String[var4.field642];
        class225.method1491(200000, var4, 28670);
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(I)V")
    public static void method1537(int arg0) {
        if (arg0 == -25) {
            field3658 = null;
            field3660 = null;
        }
    }

    @OriginalMember(owner = "client!t", name = "b", descriptor = "(I)V")
    public final void method1538(int arg0) {
        while (true) {
            class116 var2 = this.field3659.field1679;
            if (this.field3659 == var2) {
                int var3 = -114 % ((arg0 + 25) / 43);
                field3661++;
                return;
            }
            var2.method742((byte) -80);
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(ILbj;)V")
    public static final void method1539(int arg0, class215 arg1) {
        if (arg0 > -52) {
            return;
        }
        field3654++;
        byte[] var2 = new byte[24];
        if (class78.field1090 != null) {
            try {
                class78.field1090.method1480(0L, true);
                class78.field1090.method1479(-5988, var2);
                int var3;
                for (var3 = 0; var3 < 24 && var2[var3] == 0; var3++) {
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var5) {
                for (int var4 = 0; var4 < 24; var4++) {
                    var2[var4] = -1;
                }
            }
        }
        arg1.method1365(24, 0, var2, (byte) -62);
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(B)Z")
    public static final boolean method1540(byte arg0) {
        field3655++;
        if (arg0 != -86) {
            field3658 = null;
        }
        if (class48.field695) {
            try {
                class172.method1097("showVideoAd", true, class45.field667.field744);
                return true;
            } catch (Throwable var1) {
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!t", name = "<init>", descriptor = "()V")
    public class234() {
        this.field3659.field1679 = this.field3659;
        this.field3659.field1676 = this.field3659;
    }
}
