import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public class class208 extends class253 {

    @OriginalMember(owner = "client!ck", name = "C", descriptor = "[I")
    public int[] field3636 = new int[5];

    @OriginalMember(owner = "client!ck", name = "E", descriptor = "I")
    public int field3638 = 0;

    @OriginalMember(owner = "client!ck", name = "Q", descriptor = "[Lme;")
    public class213[] field3650 = new class213[5];

    @OriginalMember(owner = "client!ck", name = "Z", descriptor = "I")
    public int field3659;

    @OriginalMember(owner = "client!ck", name = "U", descriptor = "I")
    public int field3654;

    @OriginalMember(owner = "client!ck", name = "N", descriptor = "I")
    public int field3647;

    @OriginalMember(owner = "client!ck", name = "Y", descriptor = "I")
    public int field3658;

    @OriginalMember(owner = "client!ck", name = "u", descriptor = "Ljd;")
    public static class85 field3628 = class221.method1499("RuneScape wird geladen )2 bitte warten)3)3)3", (byte) -78);

    @OriginalMember(owner = "client!ck", name = "v", descriptor = "Ljd;")
    public static class85 field3629 = class221.method1499(": ", (byte) -51);

    @OriginalMember(owner = "client!ck", name = "z", descriptor = "[I")
    public static int[] field3633 = new int[32];

    @OriginalMember(owner = "client!ck", name = "F", descriptor = "Ljd;")
    public static class85 field3639 = class221.method1499("<col=ffff00>", (byte) 98);

    @OriginalMember(owner = "client!ck", name = "w", descriptor = "I")
    public static int field3630 = 1;

    @OriginalMember(owner = "client!ck", name = "S", descriptor = "Ljd;")
    public static class85 field3652 = class221.method1499("Art", (byte) 114);

    @OriginalMember(owner = "client!ck", name = "s", descriptor = "I")
    public static int field3626;

    @OriginalMember(owner = "client!ck", name = "t", descriptor = "I")
    public static int field3627;

    @OriginalMember(owner = "client!ck", name = "x", descriptor = "I")
    public static int field3631;

    @OriginalMember(owner = "client!ck", name = "y", descriptor = "I")
    public static int field3632;

    @OriginalMember(owner = "client!ck", name = "A", descriptor = "I")
    public static int field3634;

    @OriginalMember(owner = "client!ck", name = "B", descriptor = "I")
    public int field3635;

    @OriginalMember(owner = "client!ck", name = "D", descriptor = "I")
    public int field3637;

    @OriginalMember(owner = "client!ck", name = "I", descriptor = "I")
    public int field3642;

    @OriginalMember(owner = "client!ck", name = "M", descriptor = "I")
    public int field3646;

    @OriginalMember(owner = "client!ck", name = "V", descriptor = "I")
    public static int field3655;

    @OriginalMember(owner = "client!ck", name = "X", descriptor = "I")
    public static int field3657;

    @OriginalMember(owner = "client!ck", name = "ab", descriptor = "I")
    public int field3660;

    @OriginalMember(owner = "client!ck", name = "O", descriptor = "Lei;")
    public class167 field3648;

    @OriginalMember(owner = "client!ck", name = "K", descriptor = "Lbc;")
    public class170 field3644;

    @OriginalMember(owner = "client!ck", name = "R", descriptor = "Lck;")
    public class208 field3651;

    @OriginalMember(owner = "client!ck", name = "G", descriptor = "Lre;")
    public class212 field3640;

    @OriginalMember(owner = "client!ck", name = "W", descriptor = "Lpe;")
    public class233 field3656;

    @OriginalMember(owner = "client!ck", name = "H", descriptor = "Lrf;")
    public class267 field3641;

    @OriginalMember(owner = "client!ck", name = "T", descriptor = "Lla;")
    public class93 field3653;

    @OriginalMember(owner = "client!ck", name = "J", descriptor = "Z")
    public boolean field3643;

    @OriginalMember(owner = "client!ck", name = "L", descriptor = "Z")
    public boolean field3645;

    @OriginalMember(owner = "client!ck", name = "P", descriptor = "Z")
    public boolean field3649;

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(Lik;B)Lua;")
    public static final class111 method1421(class247 arg0, byte arg1) {
        field3634++;
        return arg1 >= -62 ? null : new class111(arg0.method1677(true), arg0.method1677(true), arg0.method1677(true), arg0.method1677(true), arg0.method1691(19388), arg0.method1691(19388), arg0.method1711((byte) -67));
    }

    @OriginalMember(owner = "client!ck", name = "d", descriptor = "(I)V")
    public static void method1422(int arg0) {
        field3629 = null;
        field3639 = null;
        field3652 = null;
        field3633 = null;
        if (arg0 != 725) {
            method1424((byte) 100, 24, -26, -68);
        }
        field3628 = null;
    }

    @OriginalMember(owner = "client!ck", name = "e", descriptor = "(I)Z")
    public static final boolean method1423(int arg0) {
        field3631++;
        class102 var1 = class79.field1450;
        synchronized (class79.field1450) {
            if (class269.field4786 == class18.field263) {
                return false;
            } else {
                class254.field4379 = class153.field2656[class18.field263];
                class225.field3921 = class117.field2100[class18.field263];
                class18.field263 = class18.field263 + 1 & arg0;
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!ck", name = "<init>", descriptor = "(III)V")
    public class208(int arg0, int arg1, int arg2) {
        this.field3659 = arg2;
        this.field3654 = arg1;
        this.field3658 = this.field3647 = arg0;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(BIII)V")
    public static final void method1424(byte arg0, int arg1, int arg2, int arg3) {
        field3655++;
        class85 var4 = class172.method1150(new class85[] { class122.field2150, class68.method451(arg2, -12572), class5.field49, class68.method451(arg3 >> 6, -12572), class5.field49, class68.method451(arg1 >> 6, -12572), class5.field49, class68.method451(arg3 & 0x3F, -12572), class5.field49, class68.method451(arg1 & 0x3F, -12572) }, 0);
        var4.method584(true);
        int var5 = 98 / ((arg0 + 43) / 34);
        class78.method538(var4, (byte) -79);
    }

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "(BIII)I")
    public static final int method1425(byte arg0, int arg1, int arg2, int arg3) {
        field3657++;
        int var4 = arg1 / arg2;
        int var5 = arg1 & arg2 - 1;
        int var6 = arg3 / arg2;
        int var7 = arg2 - 1 & arg3;
        int var8 = class74.method525(var6, true, var4);
        int var9 = class74.method525(var6, true, var4 + 1);
        int var10 = class74.method525(var6 + 1, true, var4);
        int var11 = class74.method525(var6 + 1, true, var4 + 1);
        int var12 = -62 % ((arg0 + 62) / 35);
        int var13 = class33.method225(-807166032, var8, arg2, var9, var5);
        int var14 = class33.method225(-807166032, var10, arg2, var11, var5);
        return class33.method225(-807166032, var13, arg2, var14, var7);
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(III)V")
    public static final void method1426(int arg0, int arg1, int arg2) {
        class260.field4599[arg2] = arg0;
        field3626++;
        class168 var3 = (class168) class48.field857.method1398(1, (long) arg2);
        if (var3 == null) {
            class168 var4 = new class168(4611686018427387905L);
            class48.field857.method1393(var4, (long) arg2, 817);
        } else if (var3.field2889 != 4611686018427387905L) {
            var3.field2889 = class28.method200(arg1 ^ 0x4B7EE724) + 500L | 0x4000000000000000L;
        }
        if (arg1 != 1266607942) {
            method1421((class247) null, (byte) 1);
        }
    }
}
