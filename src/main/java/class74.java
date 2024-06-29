import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kca")
public class class74 {

    @OriginalMember(owner = "client!kca", name = "d", descriptor = "Lvg;")
    private class49 field933 = new class49(64);

    @OriginalMember(owner = "client!kca", name = "k", descriptor = "I")
    public int field940 = 0;

    @OriginalMember(owner = "client!kca", name = "c", descriptor = "Lri;")
    private class97 field932;

    @OriginalMember(owner = "client!kca", name = "i", descriptor = "I")
    public int field938;

    @OriginalMember(owner = "client!kca", name = "g", descriptor = "Lqs;")
    public static class560 field936 = new class560();

    @OriginalMember(owner = "client!kca", name = "j", descriptor = "Lrl;")
    public static class672 field939 = new class672(47, 7);

    @OriginalMember(owner = "client!kca", name = "l", descriptor = "Z")
    public static boolean field941 = false;

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "I")
    public static int field930;

    @OriginalMember(owner = "client!kca", name = "b", descriptor = "I")
    public static int field931;

    @OriginalMember(owner = "client!kca", name = "e", descriptor = "I")
    public static int field934;

    @OriginalMember(owner = "client!kca", name = "f", descriptor = "I")
    public static int field935;

    @OriginalMember(owner = "client!kca", name = "h", descriptor = "I")
    public static int field937;

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(ILri;Ljava/lang/String;Z)Lck;")
    public static final class595 method744(int arg0, class97 arg1, String arg2, boolean arg3) {
        field934++;
        if (arg0 <= 120) {
            field941 = true;
        }
        int var4 = arg1.method928(false, arg2);
        if (var4 == -1) {
            return new class595(0);
        }
        int[] var5 = arg1.method919((byte) 54, var4);
        class595 var6 = new class595(var5.length);
        int var7 = 0;
        int var8 = 0;
        while (true) {
            while (var7 < var6.field8438) {
                class6 var9 = new class6(arg1.method926(var4, -128, var5[var8++]));
                int var10 = var9.method72(-84);
                int var11 = var9.method67(12021);
                int var12 = var9.method70(-9059);
                if (!arg3 && var12 == 1) {
                    var6.field8438--;
                } else {
                    var6.field8439[var7] = var10;
                    var6.field8433[var7] = var11;
                    var7++;
                }
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(B)V")
    public static void method745(byte arg0) {
        field939 = null;
        int var1 = -64 % ((arg0 + 57) / 32);
        field936 = null;
    }

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(I)V")
    public final void method746(int arg0) {
        field931++;
        class49 var2 = this.field933;
        synchronized (this.field933) {
            this.field933.method569(arg0 - 4);
        }
        if (arg0 != 4) {
            this.method748(-104, (byte) 12);
        }
    }

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(BI)V")
    public final void method747(byte arg0, int arg1) {
        class49 var3 = this.field933;
        synchronized (this.field933) {
            this.field933.method573((byte) 125, arg1);
            if (arg0 < 53) {
                this.field940 = -88;
            }
        }
        field930++;
    }

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(IB)Lega;")
    public final class661 method748(int arg0, byte arg1) {
        field937++;
        class49 var3 = this.field933;
        class661 var4;
        synchronized (this.field933) {
            var4 = (class661) this.field933.method560(false, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        } else if (arg1 == 24) {
            class97 var5 = this.field932;
            byte[] var6;
            synchronized (this.field932) {
                var6 = this.field932.method926(4, -124, arg0);
            }
            class661 var7 = new class661();
            var7.field9218 = this;
            var7.field9204 = arg0;
            if (var6 != null) {
                var7.method3792(-1, new class6(var6));
            }
            var7.method3796((byte) -116);
            class49 var8 = this.field933;
            synchronized (this.field933) {
                this.field933.method559(var7, (long) arg0, arg1 - 24);
                return var7;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(Z)V")
    public final void method749(boolean arg0) {
        field935++;
        if (arg0) {
            this.field938 = -55;
        }
        class49 var2 = this.field933;
        synchronized (this.field933) {
            this.field933.method563(0);
        }
    }

    @OriginalMember(owner = "client!kca", name = "<init>", descriptor = "(Lei;ILri;)V")
    public class74(class162 arg0, int arg1, class97 arg2) {
        this.field932 = arg2;
        this.field938 = this.field932.method949(4, 0);
    }
}
