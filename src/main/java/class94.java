import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jr")
public class class94 {

    @OriginalMember(owner = "client!jr", name = "c", descriptor = "Lmq;")
    private class472 field1299 = new class472(64);

    @OriginalMember(owner = "client!jr", name = "f", descriptor = "Ljn;")
    private class668 field1302;

    @OriginalMember(owner = "client!jr", name = "e", descriptor = "J")
    public static long field1301 = (long) (Math.random() * 9.999999999E9D);

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "I")
    public static int field1297;

    @OriginalMember(owner = "client!jr", name = "b", descriptor = "I")
    public static int field1298;

    @OriginalMember(owner = "client!jr", name = "d", descriptor = "I")
    public static int field1300;

    @OriginalMember(owner = "client!jr", name = "g", descriptor = "I")
    public static int field1303;

    @OriginalMember(owner = "client!jr", name = "h", descriptor = "I")
    public static int field1304;

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(B)V")
    public final void method726(byte arg0) {
        if (arg0 != 79) {
            return;
        }
        class472 var2 = this.field1299;
        synchronized (this.field1299) {
            this.field1299.method2776(false);
        }
        field1300++;
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(II)Ltl;")
    public final class573 method727(int arg0, int arg1) {
        field1303++;
        class472 var3 = this.field1299;
        class573 var4;
        synchronized (this.field1299) {
            var4 = (class573) this.field1299.method2766(-125, (long) arg0);
            if (arg1 != 64) {
                this.field1302 = null;
            }
        }
        if (var4 != null) {
            return var4;
        }
        class668 var5 = this.field1302;
        byte[] var6;
        synchronized (this.field1302) {
            var6 = this.field1302.method3800(arg0, 32, (byte) -92);
        }
        class573 var7 = new class573();
        if (var6 != null) {
            var7.method3359(0, new class389(var6));
        }
        class472 var8 = this.field1299;
        synchronized (this.field1299) {
            this.field1299.method2772(var7, true, (long) arg0);
            return var7;
        }
    }

    @OriginalMember(owner = "client!jr", name = "b", descriptor = "(B)V")
    public final void method728(byte arg0) {
        field1297++;
        class472 var2 = this.field1299;
        synchronized (this.field1299) {
            int var3 = -50 / ((arg0 + 63) / 47);
            this.field1299.method2778((byte) 114);
        }
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(IB)V")
    public final void method729(int arg0, byte arg1) {
        field1298++;
        class472 var3 = this.field1299;
        synchronized (this.field1299) {
            this.field1299.method2777(arg0, 97);
            int var4 = -23 / ((arg1 - 15) / 46);
        }
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method730(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field1304++;
        if (!class62.method607((byte) -106, arg9)) {
            return;
        }
        if (arg6 < 60) {
            method730(-2, -54, -19, 114, -99, -54, 7, -84, 109, 118);
        }
        if (class362.field4821[arg9] == null) {
            client.method1654(class516.field7555[arg9], -1, arg1, arg3, arg8, arg0, arg2, arg4, arg5, arg7);
        } else {
            client.method1654(class362.field4821[arg9], -1, arg1, arg3, arg8, arg0, arg2, arg4, arg5, arg7);
        }
    }

    @OriginalMember(owner = "client!jr", name = "<init>", descriptor = "(Ler;ILjn;)V")
    public class94(class90 arg0, int arg1, class668 arg2) {
        this.field1302 = arg2;
        this.field1302.method3805(32, false);
    }
}
