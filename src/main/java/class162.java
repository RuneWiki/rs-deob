import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class162 {

    @OriginalMember(owner = "client!kh", name = "f", descriptor = "Lfba;")
    private class348 field2318 = new class348(64);

    @OriginalMember(owner = "client!kh", name = "i", descriptor = "Lla;")
    private class423 field2321;

    @OriginalMember(owner = "client!kh", name = "e", descriptor = "Llc;")
    public static class435 field2317 = new class435(61, 16);

    @OriginalMember(owner = "client!kh", name = "h", descriptor = "Lgr;")
    public static class530 field2320 = new class530(30, 7);

    @OriginalMember(owner = "client!kh", name = "j", descriptor = "I")
    public static int field2322 = 0;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "I")
    public static int field2313;

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "I")
    public static int field2314;

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "I")
    public static int field2315;

    @OriginalMember(owner = "client!kh", name = "d", descriptor = "I")
    public static int field2316;

    @OriginalMember(owner = "client!kh", name = "g", descriptor = "I")
    public static int field2319;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IB)V", line = 9)
    public final void method1141(int arg0, byte arg1) {
        class348 var3 = this.field2318;
        synchronized (this.field2318) {
            this.field2318.method2220(false);
            if (arg1 != -89) {
                return;
            }
            this.field2318 = new class348(arg0);
        }
        field2313++;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(I)V", line = 23)
    public final void method1142(int arg0) {
        if (arg0 >= -105) {
            this.method1145(-7, -54);
        }
        field2319++;
        class348 var2 = this.field2318;
        synchronized (this.field2318) {
            this.field2318.method2219(-5300);
        }
    }

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "(I)V", line = 36)
    public static void method1143(int arg0) {
        field2320 = null;
        if (arg0 >= -85) {
            method1143(127);
        }
        field2317 = null;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(II)Ljo;", line = 48)
    public final class20 method1144(int arg0, int arg1) {
        field2315++;
        class348 var3 = this.field2318;
        class20 var4;
        synchronized (this.field2318) {
            var4 = (class20) this.field2318.method2216(0, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class423 var5 = this.field2321;
        byte[] var6;
        synchronized (this.field2321) {
            var6 = this.field2321.method2600(0, class388.method2386(true, arg0), class692.method3906(arg0, false));
        }
        if (arg1 <= 64) {
            return null;
        }
        class20 var7 = new class20();
        if (var6 != null) {
            var7.method96(-88, new class479(var6));
        }
        class348 var8 = this.field2318;
        synchronized (this.field2318) {
            this.field2318.method2213((byte) -16, (long) arg0, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "(II)V", line = 84)
    public final void method1145(int arg0, int arg1) {
        if (arg1 != -19800) {
            this.field2318 = null;
        }
        class348 var3 = this.field2318;
        synchronized (this.field2318) {
            this.field2318.method2207(arg0, arg1 + 19801);
        }
        field2314++;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(B)V", line = 100)
    public final void method1146(byte arg0) {
        if (arg0 != 122) {
            method1143(87);
        }
        field2316++;
        class348 var2 = this.field2318;
        synchronized (this.field2318) {
            this.field2318.method2220(false);
        }
    }

    @OriginalMember(owner = "client!kh", name = "<init>", descriptor = "(Lmp;ILla;)V", line = 119)
    public class162(class315 arg0, int arg1, class423 arg2) {
        this.field2321 = arg2;
        if (this.field2321 != null) {
            int var4 = this.field2321.method2623(-1) - 1;
            this.field2321.method2616(var4, 0);
        }
    }
}
