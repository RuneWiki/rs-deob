import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class458 {

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "Lvg;")
    private class49 field6853 = new class49(64);

    @OriginalMember(owner = "client!jb", name = "l", descriptor = "Lvg;")
    private class49 field6862 = new class49(100);

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "Lri;")
    private class97 field6854;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "Lws;")
    public static class328 field6851 = new class328(13, 8);

    @OriginalMember(owner = "client!jb", name = "h", descriptor = "[F")
    public static float[] field6858 = new float[4];

    @OriginalMember(owner = "client!jb", name = "i", descriptor = "I")
    public static int field6859 = 0;

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "I")
    public static int field6852;

    @OriginalMember(owner = "client!jb", name = "e", descriptor = "I")
    public static int field6855;

    @OriginalMember(owner = "client!jb", name = "g", descriptor = "I")
    public static int field6857;

    @OriginalMember(owner = "client!jb", name = "j", descriptor = "I")
    public static int field6860;

    @OriginalMember(owner = "client!jb", name = "k", descriptor = "I")
    public static int field6861;

    @OriginalMember(owner = "client!jb", name = "f", descriptor = "[Lkj;")
    public static class526[] field6856;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(II)Lpea;")
    public final class675 method2870(int arg0, int arg1) {
        if (arg1 != 28133) {
            this.method2870(0, -18);
        }
        field6852++;
        class49 var3 = this.field6862;
        synchronized (this.field6862) {
            class675 var4 = (class675) this.field6862.method560(false, (long) arg0);
            if (var4 == null) {
                var4 = new class675(arg0);
                this.field6862.method559(var4, (long) arg0, 0);
            }
            return var4.method3864(-1) ? var4 : null;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lha;III[Z)Z")
    public static final boolean method2871(class54 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        boolean var5 = false;
        if (class587.field8346 != class493.field7208) {
            int var6 = class491.field7187[arg1].method477(-1, arg3, arg2);
            for (int var7 = 0; var7 <= arg1; var7++) {
                class37 var8 = class491.field7187[var7];
                if (var8 != null) {
                    int var9 = var6 - var8.method477(-1, arg3, arg2);
                    if (arg4 != null) {
                        arg4[var7] = var8.method481(arg0, arg2, var9, arg3, 0, false);
                        if (!arg4[var7]) {
                            continue;
                        }
                    }
                    var8.method480(arg0, arg2, var9, arg3, 0, false);
                    var5 = true;
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(BI)Lqg;")
    public final class428 method2872(byte arg0, int arg1) {
        field6861++;
        class49 var3 = this.field6853;
        class428 var4;
        synchronized (this.field6853) {
            var4 = (class428) this.field6853.method560(false, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class97 var5 = this.field6854;
        byte[] var6;
        synchronized (this.field6854) {
            var6 = this.field6854.method926(class356.method2395(arg1, -32762), -125, class576.method3378(arg1, 127));
            if (arg0 != 11) {
                field6856 = null;
            }
        }
        class428 var7 = new class428();
        var7.field6529 = arg1;
        var7.field6519 = this;
        if (var6 != null) {
            var7.method2713(0, new class6(var6));
        }
        var7.method2714(0);
        class49 var8 = this.field6853;
        synchronized (this.field6853) {
            this.field6853.method559(var7, (long) arg1, 0);
            return var7;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(B)V")
    public static void method2873(byte arg0) {
        field6851 = null;
        if (arg0 >= -12) {
            method2873((byte) -80);
        }
        field6858 = null;
        field6856 = null;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(ZI)V")
    public final void method2874(boolean arg0, int arg1) {
        class49 var3 = this.field6853;
        synchronized (this.field6853) {
            this.field6853.method573((byte) 126, arg1);
            if (arg0) {
                this.field6854 = null;
            }
        }
        field6855++;
        class49 var4 = this.field6862;
        synchronized (this.field6862) {
            this.field6862.method573((byte) 123, arg1);
        }
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(B)V")
    public final void method2875(byte arg0) {
        class49 var2 = this.field6853;
        synchronized (this.field6853) {
            this.field6853.method563(0);
        }
        field6857++;
        class49 var3 = this.field6862;
        synchronized (this.field6862) {
            this.field6862.method563(0);
        }
        if (arg0 != 119) {
            this.method2872((byte) 85, -62);
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)V")
    public final void method2876(int arg0) {
        if (arg0 != 100) {
            field6856 = null;
        }
        class49 var2 = this.field6853;
        synchronized (this.field6853) {
            this.field6853.method569(0);
        }
        field6860++;
        class49 var3 = this.field6862;
        synchronized (this.field6862) {
            this.field6862.method569(0);
        }
    }

    @OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(Lei;ILri;Lri;Lri;)V")
    public class458(class162 arg0, int arg1, class97 arg2, class97 arg3, class97 arg4) {
        this.field6854 = arg2;
        if (this.field6854 != null) {
            int var6 = this.field6854.method917(true) - 1;
            this.field6854.method949(var6, 0);
        }
        class208.method1590(2, arg3, arg4, (byte) -118);
    }
}
