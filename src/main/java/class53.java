import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class53 {

    @OriginalMember(owner = "client!je", name = "f", descriptor = "Z")
    public boolean field779 = false;

    @OriginalMember(owner = "client!je", name = "n", descriptor = "Lmo;")
    private class336 field787 = new class336(64);

    @OriginalMember(owner = "client!je", name = "u", descriptor = "Lmo;")
    public class336 field794 = new class336(500);

    @OriginalMember(owner = "client!je", name = "v", descriptor = "Lmo;")
    public class336 field795 = new class336(30);

    @OriginalMember(owner = "client!je", name = "w", descriptor = "Lmo;")
    public class336 field796 = new class336(50);

    @OriginalMember(owner = "client!je", name = "t", descriptor = "Z")
    public boolean field793;

    @OriginalMember(owner = "client!je", name = "g", descriptor = "I")
    public int field780;

    @OriginalMember(owner = "client!je", name = "j", descriptor = "Lnl;")
    private class435 field783;

    @OriginalMember(owner = "client!je", name = "m", descriptor = "Lnl;")
    public class435 field786;

    @OriginalMember(owner = "client!je", name = "p", descriptor = "I")
    public static int field789 = 0;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "I")
    public static int field774;

    @OriginalMember(owner = "client!je", name = "b", descriptor = "I")
    public static int field775;

    @OriginalMember(owner = "client!je", name = "c", descriptor = "I")
    public static int field776;

    @OriginalMember(owner = "client!je", name = "d", descriptor = "I")
    public static int field777;

    @OriginalMember(owner = "client!je", name = "e", descriptor = "I")
    public static int field778;

    @OriginalMember(owner = "client!je", name = "h", descriptor = "I")
    public static int field781;

    @OriginalMember(owner = "client!je", name = "i", descriptor = "I")
    public static int field782;

    @OriginalMember(owner = "client!je", name = "k", descriptor = "I")
    public static int field784;

    @OriginalMember(owner = "client!je", name = "q", descriptor = "I")
    public static int field790;

    @OriginalMember(owner = "client!je", name = "r", descriptor = "I")
    public static int field791;

    @OriginalMember(owner = "client!je", name = "s", descriptor = "I")
    public static int field792;

    @OriginalMember(owner = "client!je", name = "x", descriptor = "I")
    public int field797;

    @OriginalMember(owner = "client!je", name = "o", descriptor = "Ltm;")
    public static class380 field788;

    @OriginalMember(owner = "client!je", name = "l", descriptor = "[[S")
    public static short[][] field785;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(ZLjava/lang/String;I)V", line = 3)
    public static final void method498(boolean arg0, String arg1, int arg2) {
        class443.field6301.field6151 = 1;
        field790++;
        String var3 = arg1.toLowerCase();
        short[] var4 = new short[16];
        int var5 = 0;
        for (int var6 = 0; var6 < class373.field5128.field3451; var6++) {
            class156 var9 = class373.field5128.method1644(var6, 120);
            if ((!arg0 || var9.field2168) && var9.field2183 == -1 && var9.field2191 == -1 && var9.field2180 == 0 && var9.field2189.toLowerCase().indexOf(var3) != -1) {
                if (var5 >= 250) {
                    class428.field5968 = null;
                    class487.field6894 = -1;
                    return;
                }
                if (var5 >= var4.length) {
                    short[] var10 = new short[var4.length * 2];
                    for (int var11 = 0; var11 < var5; var11++) {
                        var10[var11] = var4[var11];
                    }
                    var4 = var10;
                }
                var4[var5++] = (short) var6;
            }
        }
        class487.field6894 = var5;
        class103.field1458 = arg2;
        class428.field5968 = var4;
        String[] var7 = new String[class487.field6894];
        for (int var8 = 0; var8 < class487.field6894; var8++) {
            var7[var8] = class373.field5128.method1644(var4[var8], 109).field2189;
        }
        class430.method2572((byte) -22, var7, class428.field5968);
        class443.field6301.method2651(1);
        class443.field6301.field6151 = 2;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Z)V", line = 78)
    public final void method499(boolean arg0) {
        class336 var2 = this.field787;
        synchronized (this.field787) {
            this.field787.method2119(0);
        }
        field784++;
        class336 var3 = this.field794;
        synchronized (this.field794) {
            this.field794.method2119(0);
        }
        if (arg0) {
            this.field780 = 80;
        }
        class336 var4 = this.field795;
        synchronized (this.field795) {
            this.field795.method2119(0);
        }
        class336 var5 = this.field796;
        synchronized (this.field796) {
            this.field796.method2119(0);
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(I)V", line = 100)
    public static void method500(int arg0) {
        field785 = null;
        field788 = null;
        if (arg0 != 128) {
            field788 = null;
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(II)V", line = 121)
    public final void method501(int arg0, int arg1) {
        field791++;
        if (arg0 != 0) {
            this.method502(true, -105);
        }
        class336 var3 = this.field787;
        synchronized (this.field787) {
            this.field787.method2120((byte) -104, arg1);
        }
        class336 var4 = this.field794;
        synchronized (this.field794) {
            this.field794.method2120((byte) 68, arg1);
        }
        class336 var5 = this.field795;
        synchronized (this.field795) {
            this.field795.method2120((byte) 43, arg1);
        }
        class336 var6 = this.field796;
        synchronized (this.field796) {
            this.field796.method2120((byte) 50, arg1);
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(ZI)V", line = 143)
    public final void method502(boolean arg0, int arg1) {
        field777++;
        if (arg1 == 128 && arg0 != this.field779) {
            this.field779 = arg0;
            this.method509((byte) -115);
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IILfo;)V", line = 158)
    public static final void method503(int arg0, int arg1, class418 arg2) {
        field781++;
        int var3 = -1;
        if (arg0 > -106) {
            method500(87);
        }
        int var4 = 0;
        if (class364.field5010 < arg2.field5750) {
            class111.method881(arg2, 128);
        } else if (arg2.field5787 < class364.field5010) {
            class222.method1526(false, arg2, false);
            var3 = class92.field1300;
            var4 = class153.field2125;
        } else {
            class399.method2397(true, arg2);
        }
        if (arg2.field4537 < 128 || arg2.field4530 < 128 || (class36.field388 * 128 - 128) <= arg2.field4537 || arg2.field4530 >= ((class68.field998 - 1) * 128)) {
            arg2.field5787 = 0;
            arg2.field5750 = 0;
            arg2.field5742 = -1;
            var3 = -1;
            var4 = 0;
            arg2.field5759 = -1;
            arg2.field4537 = arg2.field5811[0] * 128 + (arg2.method245(4452) * 64);
            arg2.field4530 = arg2.field5807[0] * 128 + (arg2.method245(4452) * 64);
            arg2.method2508(103);
        }
        if (class262.field3781 == arg2 && (arg2.field4537 < 1536 || arg2.field4530 < 1536 || (class36.field388 * 128 - 1536) <= arg2.field4537 || arg2.field4530 >= (class68.field998 - 12) * 128)) {
            arg2.field5742 = -1;
            var4 = 0;
            arg2.field5750 = 0;
            var3 = -1;
            arg2.field5759 = -1;
            arg2.field5787 = 0;
            arg2.field4537 = arg2.field5811[0] * 128 + (arg2.method245(4452) * 64);
            arg2.field4530 = arg2.field5807[0] * 128 + arg2.method245(4452) * 64;
            arg2.method2508(117);
        }
        int var5 = class218.method1503(-66, arg2);
        class227.method1551(arg2, var4, var3, 0, var5);
        class92.method770((byte) -120, arg2);
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(ZZ)Z", line = 219)
    public static boolean method504(boolean arg0, boolean arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(II)V", line = 226)
    public final void method505(int arg0, int arg1) {
        int var3 = 62 / ((-arg1 - 53) / 36);
        this.field787 = new class336(arg0);
        field792++;
    }

    @OriginalMember(owner = "client!je", name = "c", descriptor = "(II)Lnm;", line = 237)
    public final class267 method506(int arg0, int arg1) {
        if (arg0 > -117) {
            method503(-6, 49, (class418) null);
        }
        field775++;
        class336 var3 = this.field787;
        class267 var4;
        synchronized (this.field787) {
            var4 = (class267) this.field787.method2113(0, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field783.method2633(class89.method750(arg1, (byte) 68), class462.method2764(arg1, 104), 116);
        class267 var6 = new class267();
        var6.field3887 = arg1;
        var6.field3860 = this;
        if (var5 != null) {
            var6.method1802(new class161(var5), false);
        }
        var6.method1809((byte) 113);
        if (var6.field3863) {
            var6.field3847 = 0;
            var6.field3874 = false;
        }
        if (!this.field793 && var6.field3878) {
            var6.field3864 = null;
            var6.field3854 = null;
        }
        class336 var7 = this.field787;
        synchronized (this.field787) {
            this.field787.method2116((long) arg1, (byte) -80, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!je", name = "d", descriptor = "(II)V", line = 283)
    public final void method507(int arg0, int arg1) {
        field776++;
        this.field797 = arg0;
        class336 var3 = this.field794;
        synchronized (this.field794) {
            this.field794.method2109(arg1);
        }
        class336 var4 = this.field795;
        synchronized (this.field795) {
            this.field795.method2109(arg1);
        }
        class336 var5 = this.field796;
        synchronized (this.field796) {
            this.field796.method2109(arg1);
        }
    }

    @OriginalMember(owner = "client!je", name = "<init>", descriptor = "(Llo;IZLnl;Lnl;)V", line = 369)
    public class53(class280 arg0, int arg1, boolean arg2, class435 arg3, class435 arg4) {
        this.field793 = arg2;
        this.field780 = arg1;
        this.field783 = arg3;
        this.field786 = arg4;
        if (this.field783 != null) {
            int var6 = this.field783.method2658(-1) - 1;
            this.field783.method2638(1, var6);
        }
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(ZI)V", line = 308)
    public final void method508(boolean arg0, int arg1) {
        field782++;
        if (this.field793 == arg0) {
            return;
        }
        this.field793 = arg0;
        if (arg1 != 16) {
            method500(-92);
        }
        this.method509((byte) -76);
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(B)V", line = 327)
    public final void method509(byte arg0) {
        class336 var2 = this.field787;
        synchronized (this.field787) {
            this.field787.method2109(-1);
            if (arg0 >= -66) {
                this.method508(false, -110);
            }
        }
        field778++;
        class336 var3 = this.field794;
        synchronized (this.field794) {
            this.field794.method2109(-1);
        }
        class336 var4 = this.field795;
        synchronized (this.field795) {
            this.field795.method2109(-1);
        }
        class336 var5 = this.field796;
        synchronized (this.field796) {
            this.field796.method2109(-1);
        }
    }
}
