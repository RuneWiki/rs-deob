import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kw")
public class class223 {

    @OriginalMember(owner = "client!kw", name = "i", descriptor = "Lmf;")
    private class382 field3147 = new class382(64);

    @OriginalMember(owner = "client!kw", name = "j", descriptor = "Lmf;")
    public class382 field3148 = new class382(60);

    @OriginalMember(owner = "client!kw", name = "c", descriptor = "Lpu;")
    public class522 field3141;

    @OriginalMember(owner = "client!kw", name = "f", descriptor = "Lpu;")
    private class522 field3144;

    @OriginalMember(owner = "client!kw", name = "b", descriptor = "Lnea;")
    public static class664 field3140 = new class664(30, -2);

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "I")
    public static int field3139;

    @OriginalMember(owner = "client!kw", name = "d", descriptor = "I")
    public static int field3142;

    @OriginalMember(owner = "client!kw", name = "e", descriptor = "I")
    public static int field3143;

    @OriginalMember(owner = "client!kw", name = "g", descriptor = "I")
    public static int field3145;

    @OriginalMember(owner = "client!kw", name = "h", descriptor = "I")
    public static int field3146;

    @OriginalMember(owner = "client!kw", name = "k", descriptor = "I")
    public static int field3149;

    @OriginalMember(owner = "client!kw", name = "l", descriptor = "I")
    public int field3150;

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(B)V", line = 3)
    public static void method1471(byte arg0) {
        if (arg0 != -10) {
            field3140 = null;
        }
        field3140 = null;
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(Ljava/lang/String;[BZI)I", line = 16)
    public static final int method1472(String arg0, byte[] arg1, boolean arg2, int arg3) {
        if (!arg2) {
            method1471((byte) 113);
        }
        field3139++;
        int var4 = arg3;
        int var5 = arg0.length();
        for (int var6 = 0; var6 < var5; var6 += 4) {
            int var7 = class505.method2902(false, arg0.charAt(var6));
            int var8 = var6 + 1 >= var5 ? -1 : class505.method2902(false, arg0.charAt(var6 + 1));
            int var9 = var5 > (var6 + 2) ? class505.method2902(false, arg0.charAt(var6 + 2)) : -1;
            int var10 = var6 + 3 < var5 ? class505.method2902(false, arg0.charAt(var6 + 3)) : -1;
            arg1[arg3++] = (byte) class486.method2826(var7 << 2, var8 >>> 4);
            if (var9 == -1) {
                break;
            }
            arg1[arg3++] = (byte) class486.method2826(var9 >>> 2, class689.method3797(15, var8) << 4);
            if (var10 == -1) {
                break;
            }
            arg1[arg3++] = (byte) class486.method2826(class689.method3797(var9 << 6, 192), var10);
        }
        return arg3 - var4;
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(II)V", line = 59)
    public final void method1473(int arg0, int arg1) {
        field3142++;
        if (arg1 >= -38) {
            this.field3148 = null;
        }
        class382 var3 = this.field3147;
        synchronized (this.field3147) {
            this.field3147.method2290(false, arg0);
        }
        class382 var4 = this.field3148;
        synchronized (this.field3148) {
            this.field3148.method2290(false, arg0);
        }
    }

    @OriginalMember(owner = "client!kw", name = "b", descriptor = "(B)V", line = 79)
    public final void method1474(byte arg0) {
        field3143++;
        class382 var2 = this.field3147;
        synchronized (this.field3147) {
            this.field3147.method2279(0);
        }
        if (arg0 != 40) {
            this.method1473(66, -118);
        }
        class382 var3 = this.field3148;
        synchronized (this.field3148) {
            this.field3148.method2279(0);
        }
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(BI)Lcs;", line = 95)
    public final class309 method1475(byte arg0, int arg1) {
        if (arg0 != -74) {
            field3140 = null;
        }
        field3149++;
        class382 var3 = this.field3147;
        class309 var4;
        synchronized (this.field3147) {
            var4 = (class309) this.field3147.method2287(1, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class522 var5 = this.field3144;
        byte[] var6;
        synchronized (this.field3144) {
            var6 = this.field3144.method3007(class595.method3367(arg1, arg0 + 78), class160.method1108(false, arg1), 5);
        }
        class309 var7 = new class309();
        var7.field4588 = arg1;
        var7.field4569 = this;
        if (var6 != null) {
            var7.method1970(new class695(var6), arg0 + 74);
        }
        class382 var8 = this.field3147;
        synchronized (this.field3147) {
            this.field3147.method2291(var7, (long) arg1, 1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!kw", name = "c", descriptor = "(B)V", line = 129)
    public final void method1476(byte arg0) {
        class382 var2 = this.field3147;
        synchronized (this.field3147) {
            this.field3147.method2285((byte) -118);
        }
        field3146++;
        class382 var3 = this.field3148;
        synchronized (this.field3148) {
            if (arg0 != 124) {
                this.method1475((byte) -5, 85);
            }
            this.field3148.method2285((byte) -120);
        }
    }

    @OriginalMember(owner = "client!kw", name = "b", descriptor = "(II)V", line = 145)
    public final void method1477(int arg0, int arg1) {
        this.field3150 = arg0;
        field3145++;
        if (arg1 != -26031) {
            this.field3141 = null;
        }
        class382 var3 = this.field3148;
        synchronized (this.field3148) {
            this.field3148.method2285((byte) -119);
        }
    }

    @OriginalMember(owner = "client!kw", name = "<init>", descriptor = "(Lkr;ILpu;Lpu;)V", line = 174)
    public class223(class693 arg0, int arg1, class522 arg2, class522 arg3) {
        this.field3141 = arg3;
        this.field3144 = arg2;
        int var5 = this.field3144.method2977((byte) -95) - 1;
        this.field3144.method2988(-80, var5);
    }
}
