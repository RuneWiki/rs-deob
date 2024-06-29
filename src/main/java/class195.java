import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public class class195 implements Runnable {

    @OriginalMember(owner = "client!rk", name = "d", descriptor = "Z")
    public boolean field3161 = true;

    @OriginalMember(owner = "client!rk", name = "h", descriptor = "Ljava/lang/Object;")
    public Object field3165 = new Object();

    @OriginalMember(owner = "client!rk", name = "k", descriptor = "[I")
    public int[] field3168 = new int[500];

    @OriginalMember(owner = "client!rk", name = "j", descriptor = "I")
    public int field3167 = 0;

    @OriginalMember(owner = "client!rk", name = "m", descriptor = "[I")
    public int[] field3170 = new int[500];

    @OriginalMember(owner = "client!rk", name = "e", descriptor = "Luf;")
    public static class168 field3162 = class148.method1019(-1720, "Ladevorgang )2 bitte warten Sie)3");

    @OriginalMember(owner = "client!rk", name = "i", descriptor = "[[[I")
    public static int[][][] field3166 = new int[2][][];

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "I")
    public static int field3158;

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "I")
    public static int field3159;

    @OriginalMember(owner = "client!rk", name = "c", descriptor = "I")
    public static int field3160;

    @OriginalMember(owner = "client!rk", name = "l", descriptor = "I")
    public static int field3169;

    @OriginalMember(owner = "client!rk", name = "g", descriptor = "Lfj;")
    public static class283 field3164;

    @OriginalMember(owner = "client!rk", name = "f", descriptor = "[Lgk;")
    public static class265[] field3163;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(B)V", line = 10)
    public static void method1370(byte arg0) {
        field3164 = null;
        field3162 = null;
        field3166 = (int[][][]) null;
        field3163 = null;
        int var1 = -41 % ((arg0 - 11) / 52);
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(I)Lwa;", line = 29)
    public static final class284 method1371(int arg0) {
        field3159++;
        int var1 = class214.field3490[0] * class205.field3374[0];
        byte[] var2 = class236.field3779[0];
        int[] var3 = new int[var1];
        for (int var4 = 0; var4 < var1; var4++) {
            var3[var4] = class123.field1905[class159.method1119(var2[var4], 255)];
        }
        int var5 = 104 % ((arg0 + 33) / 59);
        class258 var6 = new class258(class56.field724, class206.field3381, class154.field2430[0], class254.field4341[0], class205.field3374[0], class214.field3490[0], var3);
        class244.method1679(-14642);
        return var6;
    }

    @OriginalMember(owner = "client!rk", name = "run", descriptor = "()V", line = 58)
    public final void run() {
        while (this.field3161) {
            Object var1 = this.field3165;
            synchronized (this.field3165) {
                if (this.field3167 < 500) {
                    this.field3170[this.field3167] = class262.field4442;
                    this.field3168[this.field3167] = class155.field2457;
                    this.field3167++;
                }
            }
            class300.method2054(10, 50L);
        }
        field3160++;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(II)Lhh;", line = 90)
    public static final class287 method1372(int arg0, int arg1) {
        field3158++;
        class287 var2 = (class287) class144.field2218.method1424((long) arg1, (byte) 82);
        if (var2 != null) {
            return var2;
        }
        if (arg0 >= -19) {
            method1371(-101);
        }
        byte[] var3 = class70.field939.method1647(16, (byte) 123, arg1);
        class287 var4 = new class287();
        if (var3 != null) {
            var4.method1982((byte) -111, new class153(var3));
        }
        class144.field2218.method1430(var4, (long) arg1, 13487);
        return var4;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(BI)V", line = 115)
    public static final void method1373(byte arg0, int arg1) {
        if (arg0 <= -29) {
            class193.field3136.method451(-91453648, new class69(arg1));
            field3169++;
        }
    }
}
