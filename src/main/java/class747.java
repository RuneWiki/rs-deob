import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class747 {

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "Laf;")
    private class39 field10309 = new class39(64);

    @OriginalMember(owner = "client!qa", name = "n", descriptor = "Laf;")
    public class39 field10321 = new class39(60);

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "Lae;")
    public class283 field10311;

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "Lae;")
    private class283 field10312;

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "Ljn;")
    public static class134 field10313 = new class134(65, 2);

    @OriginalMember(owner = "client!qa", name = "k", descriptor = "Lv;")
    public static class165 field10318 = new class165();

    @OriginalMember(owner = "client!qa", name = "m", descriptor = "I")
    public static int field10320 = 0;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "I")
    public static int field10308;

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "I")
    public static int field10310;

    @OriginalMember(owner = "client!qa", name = "g", descriptor = "I")
    public static int field10314;

    @OriginalMember(owner = "client!qa", name = "h", descriptor = "I")
    public static int field10315;

    @OriginalMember(owner = "client!qa", name = "l", descriptor = "I")
    public static int field10319;

    @OriginalMember(owner = "client!qa", name = "o", descriptor = "I")
    public int field10322;

    @OriginalMember(owner = "client!qa", name = "j", descriptor = "Loo;")
    public static class12 field10317;

    @OriginalMember(owner = "client!qa", name = "i", descriptor = "Z")
    public static boolean field10316;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IB)V", line = 3)
    public final void method4136(int arg0, byte arg1) {
        class39 var3 = this.field10309;
        synchronized (this.field10309) {
            this.field10309.method308(-1, arg0);
        }
        if (arg1 != 90) {
            this.method4140(-105);
        }
        field10315++;
        class39 var4 = this.field10321;
        synchronized (this.field10321) {
            this.field10321.method308(-1, arg0);
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(BI)Llr;", line = 22)
    public final class346 method4137(byte arg0, int arg1) {
        field10310++;
        class39 var3 = this.field10309;
        class346 var4;
        synchronized (this.field10309) {
            var4 = (class346) this.field10309.method312(0, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        } else if (arg0 == -117) {
            class283 var5 = this.field10312;
            byte[] var6;
            synchronized (this.field10312) {
                var6 = this.field10312.method1849(class392.method2420((byte) 18, arg1), (byte) -126, class536.method3184(arg1, true));
            }
            class346 var7 = new class346();
            var7.field5041 = arg1;
            var7.field5019 = this;
            if (var6 != null) {
                var7.method2187(arg0 ^ 0xFFFFFF8A, new class511(var6));
            }
            class39 var8 = this.field10309;
            synchronized (this.field10309) {
                this.field10309.method305(var7, (long) arg1, 18320);
                return var7;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(B)V", line = 55)
    public final void method4138(byte arg0) {
        field10308++;
        class39 var2 = this.field10309;
        synchronized (this.field10309) {
            if (arg0 >= -78) {
                this.method4137((byte) 48, -2);
            }
            this.field10309.method314(-2);
        }
        class39 var3 = this.field10321;
        synchronized (this.field10321) {
            this.field10321.method314(-2);
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(ZI)V", line = 71)
    public final void method4139(boolean arg0, int arg1) {
        this.field10322 = arg1;
        if (arg0) {
            this.method4139(false, 67);
        }
        field10314++;
        class39 var3 = this.field10321;
        synchronized (this.field10321) {
            this.field10321.method314(-2);
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(I)V", line = 85)
    public final void method4140(int arg0) {
        field10319++;
        class39 var2 = this.field10309;
        synchronized (this.field10309) {
            this.field10309.method319(-92);
        }
        class39 var3 = this.field10321;
        synchronized (this.field10321) {
            if (arg0 == 4557) {
                this.field10321.method319(-71);
            }
        }
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(B)V", line = 102)
    public static void method4141(byte arg0) {
        field10318 = null;
        if (arg0 != -97) {
            method4141((byte) -26);
        }
        field10317 = null;
        field10313 = null;
    }

    @OriginalMember(owner = "client!qa", name = "<init>", descriptor = "(Ljk;ILae;Lae;)V", line = 143)
    public class747(class788 arg0, int arg1, class283 arg2, class283 arg3) {
        this.field10311 = arg3;
        this.field10312 = arg2;
        int var5 = this.field10312.method1866((byte) 120) - 1;
        this.field10312.method1867(var5, (byte) 49);
    }
}
