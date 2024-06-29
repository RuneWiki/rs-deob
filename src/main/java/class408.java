import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ws")
public class class408 {

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "Ltl;")
    private class400 field5911 = new class400(64);

    @OriginalMember(owner = "client!ws", name = "c", descriptor = "Lui;")
    private class451 field5913;

    @OriginalMember(owner = "client!ws", name = "i", descriptor = "Ljava/util/Random;")
    public static Random field5919 = new Random();

    @OriginalMember(owner = "client!ws", name = "j", descriptor = "Lsh;")
    public static class472 field5920 = new class472(72, 2);

    @OriginalMember(owner = "client!ws", name = "l", descriptor = "I")
    public static int field5922 = 0;

    @OriginalMember(owner = "client!ws", name = "m", descriptor = "[Ljava/lang/String;")
    public static String[] field5923 = new String[] { "en", "de", "fr", "pt", "nl" };

    @OriginalMember(owner = "client!ws", name = "b", descriptor = "I")
    public static int field5912;

    @OriginalMember(owner = "client!ws", name = "d", descriptor = "I")
    public static int field5914;

    @OriginalMember(owner = "client!ws", name = "f", descriptor = "I")
    public static int field5916;

    @OriginalMember(owner = "client!ws", name = "g", descriptor = "I")
    public static int field5917;

    @OriginalMember(owner = "client!ws", name = "h", descriptor = "I")
    public static int field5918;

    @OriginalMember(owner = "client!ws", name = "k", descriptor = "I")
    public static int field5921;

    @OriginalMember(owner = "client!ws", name = "e", descriptor = "[[B")
    public static byte[][] field5915;

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(BI)V", line = 7)
    public final void method2437(byte arg0, int arg1) {
        field5918++;
        class400 var3 = this.field5911;
        synchronized (this.field5911) {
            if (arg0 != 89) {
                this.method2438((byte) 92);
            }
            this.field5911.method2389(false, arg1);
        }
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(B)V", line = 24)
    public final void method2438(byte arg0) {
        if (arg0 != 41) {
            this.method2439(25, -34);
        }
        field5921++;
        class400 var2 = this.field5911;
        synchronized (this.field5911) {
            this.field5911.method2401((byte) -83);
        }
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(II)Ljm;", line = 38)
    public final class197 method2439(int arg0, int arg1) {
        field5917++;
        class400 var3 = this.field5911;
        class197 var4;
        synchronized (this.field5911) {
            var4 = (class197) this.field5911.method2393(-120, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field5913.method2691(arg0, 31, 0);
        class197 var6 = new class197();
        if (var5 != null) {
            var6.method1344((byte) 59, new class446(var5));
        }
        class400 var7 = this.field5911;
        synchronized (this.field5911) {
            int var8 = 127 / ((arg1 + 79) / 46);
            this.field5911.method2395(0, var6, (long) arg0);
            return var6;
        }
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(BILje;I)V", line = 66)
    public static final void method2440(byte arg0, int arg1, class178 arg2, int arg3) {
        class475.field6647 = arg2;
        class307.field4572 = arg3;
        field5914++;
        if (arg0 != 72) {
            method2442(-51);
        }
        class465.field6550 = arg1;
    }

    @OriginalMember(owner = "client!ws", name = "b", descriptor = "(II)I", line = 80)
    public static final int method2441(int arg0, int arg1) {
        if (arg1 != -2006407897) {
            method2441(-32, -67);
        }
        field5912++;
        return arg0 >>> 7;
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(I)V", line = 96)
    public static void method2442(int arg0) {
        field5919 = null;
        field5920 = null;
        field5923 = null;
        field5915 = null;
        if (arg0 != 64) {
            method2441(53, -126);
        }
    }

    @OriginalMember(owner = "client!ws", name = "b", descriptor = "(I)V", line = 109)
    public final void method2443(int arg0) {
        field5916++;
        class400 var2 = this.field5911;
        synchronized (this.field5911) {
            this.field5911.method2388(-41);
        }
        int var3 = 32 / ((arg0 - 28) / 50);
    }

    @OriginalMember(owner = "client!ws", name = "<init>", descriptor = "(Lgp;ILui;)V", line = 140)
    public class408(class430 arg0, int arg1, class451 arg2) {
        this.field5913 = arg2;
        this.field5913.method2662(31, (byte) -7);
    }
}
