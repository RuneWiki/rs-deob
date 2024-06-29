import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!av")
public class class236 {

    @OriginalMember(owner = "client!av", name = "f", descriptor = "Ljo;")
    private class382 field3308 = new class382(256);

    @OriginalMember(owner = "client!av", name = "j", descriptor = "Lok;")
    private class74 field3312;

    @OriginalMember(owner = "client!av", name = "g", descriptor = "J")
    public static long field3309 = 0L;

    @OriginalMember(owner = "client!av", name = "a", descriptor = "I")
    public static int field3303;

    @OriginalMember(owner = "client!av", name = "b", descriptor = "I")
    public static int field3304;

    @OriginalMember(owner = "client!av", name = "e", descriptor = "I")
    public static int field3307;

    @OriginalMember(owner = "client!av", name = "h", descriptor = "I")
    public static int field3310;

    @OriginalMember(owner = "client!av", name = "i", descriptor = "I")
    public static int field3311;

    @OriginalMember(owner = "client!av", name = "d", descriptor = "Lcr;")
    public static class367 field3306;

    @OriginalMember(owner = "client!av", name = "c", descriptor = "[[[Lrr;")
    public static class306[][][] field3305;

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(I)V", line = 3)
    public final void method1452(int arg0) {
        field3304++;
        class382 var2 = this.field3308;
        synchronized (this.field3308) {
            this.field3308.method2287(97);
        }
        int var3 = -63 % ((6 - arg0) / 63);
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(II)Lje;", line = 16)
    public final class191 method1453(int arg0, int arg1) {
        field3307++;
        class382 var3 = this.field3308;
        class191 var4;
        synchronized (this.field3308) {
            var4 = (class191) this.field3308.method2288((long) arg0, arg1 ^ arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class74 var5 = this.field3312;
        byte[] var6;
        synchronized (this.field3312) {
            var6 = this.field3312.method541(arg0, 26, (byte) -122);
        }
        class191 var7 = new class191();
        if (var6 != null) {
            var7.method1273(new class468(var6), arg1 + 11227);
        }
        class382 var8 = this.field3308;
        synchronized (this.field3308) {
            this.field3308.method2290((long) arg0, var7, arg1 + 11890);
            return var7;
        }
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(B)V", line = 49)
    public final void method1454(byte arg0) {
        class382 var2 = this.field3308;
        synchronized (this.field3308) {
            this.field3308.method2293(false);
        }
        field3310++;
        if (arg0 < 108) {
            field3306 = null;
        }
    }

    @OriginalMember(owner = "client!av", name = "b", descriptor = "(I)V", line = 63)
    public static void method1455(int arg0) {
        field3306 = null;
        if (arg0 <= 22) {
            field3305 = null;
        }
        field3305 = null;
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(IB)V", line = 79)
    public final void method1456(int arg0, byte arg1) {
        field3303++;
        class382 var3 = this.field3308;
        synchronized (this.field3308) {
            this.field3308.method2294(arg0, true);
        }
        if (arg1 > -48) {
            this.field3308 = null;
        }
    }

    @OriginalMember(owner = "client!av", name = "<init>", descriptor = "(Lkr;ILok;)V", line = 99)
    public class236(class262 arg0, int arg1, class74 arg2) {
        this.field3312 = arg2;
        this.field3312.method536(false, 26);
    }
}
