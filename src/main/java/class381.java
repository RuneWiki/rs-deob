import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class381 {

    @OriginalMember(owner = "client!vh", name = "k", descriptor = "Z")
    public boolean field5179 = false;

    @OriginalMember(owner = "client!vh", name = "e", descriptor = "Lpja;")
    private class43 field5173 = new class43(64);

    @OriginalMember(owner = "client!vh", name = "p", descriptor = "Lpja;")
    public class43 field5184 = new class43(500);

    @OriginalMember(owner = "client!vh", name = "t", descriptor = "Lpja;")
    public class43 field5188 = new class43(30);

    @OriginalMember(owner = "client!vh", name = "u", descriptor = "Lpja;")
    public class43 field5189 = new class43(50);

    @OriginalMember(owner = "client!vh", name = "l", descriptor = "Lgj;")
    public class662 field5180;

    @OriginalMember(owner = "client!vh", name = "o", descriptor = "Lgj;")
    private class662 field5183;

    @OriginalMember(owner = "client!vh", name = "m", descriptor = "Z")
    public boolean field5181;

    @OriginalMember(owner = "client!vh", name = "n", descriptor = "Lqs;")
    public static class630 field5182 = new class630(8);

    @OriginalMember(owner = "client!vh", name = "s", descriptor = "I")
    public static int field5187 = 1;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "I")
    public static int field5169;

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "I")
    public static int field5170;

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "I")
    public static int field5171;

    @OriginalMember(owner = "client!vh", name = "d", descriptor = "I")
    public static int field5172;

    @OriginalMember(owner = "client!vh", name = "f", descriptor = "I")
    public static int field5174;

    @OriginalMember(owner = "client!vh", name = "g", descriptor = "I")
    public static int field5175;

    @OriginalMember(owner = "client!vh", name = "h", descriptor = "I")
    public static int field5176;

    @OriginalMember(owner = "client!vh", name = "i", descriptor = "I")
    public static int field5177;

    @OriginalMember(owner = "client!vh", name = "j", descriptor = "I")
    public static int field5178;

    @OriginalMember(owner = "client!vh", name = "r", descriptor = "I")
    public static int field5186;

    @OriginalMember(owner = "client!vh", name = "v", descriptor = "I")
    public int field5190;

    @OriginalMember(owner = "client!vh", name = "q", descriptor = "Lnf;")
    public static class604 field5185;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(ZI)V", line = 5)
    public final void method2313(boolean arg0, int arg1) {
        if (arg1 != -1138181755) {
            this.method2320(-47, -56);
        }
        field5171++;
        if (arg0 != this.field5181) {
            this.field5181 = arg0;
            this.method2314(-63);
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(I)V", line = 20)
    public final void method2314(int arg0) {
        if (arg0 > -51) {
            return;
        }
        field5176++;
        class43 var2 = this.field5173;
        synchronized (this.field5173) {
            this.field5173.method273(127);
        }
        class43 var3 = this.field5184;
        synchronized (this.field5184) {
            this.field5184.method273(17);
        }
        class43 var4 = this.field5188;
        synchronized (this.field5188) {
            this.field5188.method273(-39);
        }
        class43 var5 = this.field5189;
        synchronized (this.field5189) {
            this.field5189.method273(126);
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(II)V", line = 42)
    public final void method2315(int arg0, int arg1) {
        if (arg0 != 0) {
            this.field5181 = false;
        }
        this.field5173 = new class43(arg1);
        field5172++;
    }

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "(I)V", line = 55)
    public static void method2316(int arg0) {
        field5182 = null;
        field5185 = null;
        if (arg0 >= -20) {
            field5182 = null;
        }
    }

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "(I)V", line = 66)
    public final void method2317(int arg0) {
        field5178++;
        class43 var2 = this.field5173;
        synchronized (this.field5173) {
            this.field5173.method272(20);
        }
        class43 var3 = this.field5184;
        synchronized (this.field5184) {
            this.field5184.method272(20);
        }
        class43 var4 = this.field5188;
        synchronized (this.field5188) {
            this.field5188.method272(20);
        }
        if (arg0 != 1) {
            this.field5190 = -72;
        }
        class43 var5 = this.field5189;
        synchronized (this.field5189) {
            this.field5189.method272(20);
        }
    }

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "(II)V", line = 93)
    public final void method2318(int arg0, int arg1) {
        if (arg0 != 21141) {
            this.method2317(-78);
        }
        this.field5190 = arg1;
        field5169++;
        class43 var3 = this.field5184;
        synchronized (this.field5184) {
            this.field5184.method273(126);
        }
        class43 var4 = this.field5188;
        synchronized (this.field5188) {
            this.field5188.method273(127);
        }
        class43 var5 = this.field5189;
        synchronized (this.field5189) {
            this.field5189.method273(127);
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(IZ)Lij;", line = 118)
    public final class445 method2319(int arg0, boolean arg1) {
        field5175++;
        class43 var3 = this.field5173;
        class445 var4;
        synchronized (this.field5173) {
            var4 = (class445) this.field5173.method266((byte) -124, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        if (arg1) {
            this.field5179 = false;
        }
        class662 var5 = this.field5183;
        byte[] var6;
        synchronized (this.field5183) {
            var6 = this.field5183.method3732(class747.method4144(arg0, 97), 8906, class410.method2434(-592809720, arg0));
        }
        class445 var7 = new class445();
        var7.field6104 = arg0;
        var7.field6082 = this;
        if (var6 != null) {
            var7.method2593(-1, new class93(var6));
        }
        var7.method2582((byte) 29);
        if (var7.field6124) {
            var7.field6041 = 0;
            var7.field6068 = false;
        }
        if (!this.field5181 && var7.field6043) {
            var7.field6093 = null;
            var7.field6097 = null;
        }
        class43 var8 = this.field5173;
        synchronized (this.field5173) {
            this.field5173.method270(var7, (long) arg0, -122);
            return var7;
        }
    }

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "(II)V", line = 164)
    public final void method2320(int arg0, int arg1) {
        field5170++;
        class43 var3 = this.field5173;
        synchronized (this.field5173) {
            this.field5173.method265(arg0, -32);
        }
        class43 var4 = this.field5184;
        synchronized (this.field5184) {
            if (arg1 != 30) {
                this.field5183 = null;
            }
            this.field5184.method265(arg0, -87);
        }
        class43 var5 = this.field5188;
        synchronized (this.field5188) {
            this.field5188.method265(arg0, arg1 - 53);
        }
        class43 var6 = this.field5189;
        synchronized (this.field5189) {
            this.field5189.method265(arg0, arg1 - 50);
        }
    }

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "(ZI)V", line = 188)
    public final void method2321(boolean arg0, int arg1) {
        field5174++;
        if (arg1 != 500) {
            this.field5188 = null;
        }
        if (arg0 != this.field5179) {
            this.field5179 = arg0;
            this.method2314(arg1 - 623);
        }
    }

    @OriginalMember(owner = "client!vh", name = "<init>", descriptor = "(Lim;IZLgj;Lgj;)V", line = 256)
    public class381(class598 arg0, int arg1, boolean arg2, class662 arg3, class662 arg4) {
        this.field5180 = arg4;
        this.field5183 = arg3;
        this.field5181 = arg2;
        if (this.field5183 != null) {
            int var6 = this.field5183.method3723(5) - 1;
            this.field5183.method3730((byte) 6, var6);
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(BLjava/lang/String;)J", line = 210)
    public static final long method2322(byte arg0, String arg1) {
        field5177++;
        int var2 = arg1.length();
        long var3 = 0L;
        if (arg0 == 62) {
            for (int var5 = 0; var5 < var2; var5++) {
                var3 = ((var3 << 5) + ((long) arg1.charAt(var5))) - var3;
            }
            return var3;
        } else {
            return -121L;
        }
    }
}
