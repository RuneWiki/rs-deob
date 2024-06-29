import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sfa")
public class class648 {

    @OriginalMember(owner = "client!sfa", name = "j", descriptor = "Laj;")
    private class287 field9342 = new class287(64);

    @OriginalMember(owner = "client!sfa", name = "m", descriptor = "I")
    public int field9345 = 0;

    @OriginalMember(owner = "client!sfa", name = "h", descriptor = "Lom;")
    private class344 field9340;

    @OriginalMember(owner = "client!sfa", name = "d", descriptor = "I")
    public int field9336;

    @OriginalMember(owner = "client!sfa", name = "b", descriptor = "Lsk;")
    public static class578 field9334 = new class578();

    @OriginalMember(owner = "client!sfa", name = "k", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field9343 = new BigInteger("8a8a02db0226b7774997958da05af4aad1692b59e9de3eda96a3f1c4366af5e6b0a656456ed74d217cf0a56e6571f392f9167932ac21fa4519c815d80e7e24b9", 16);

    @OriginalMember(owner = "client!sfa", name = "l", descriptor = "[[Ljava/lang/String;")
    public static String[][] field9344 = new String[][] { { "M1", "M2", "S1", "F" }, { "M1", "M2", "M3", "S1", "S2", "F" }, { "M1", "M2", "M3", "M4", "S1", "S2", "S3", "F" } };

    @OriginalMember(owner = "client!sfa", name = "a", descriptor = "I")
    public static int field9333;

    @OriginalMember(owner = "client!sfa", name = "c", descriptor = "I")
    public static int field9335;

    @OriginalMember(owner = "client!sfa", name = "e", descriptor = "I")
    public static int field9337;

    @OriginalMember(owner = "client!sfa", name = "f", descriptor = "I")
    public static int field9338;

    @OriginalMember(owner = "client!sfa", name = "g", descriptor = "I")
    public static int field9339;

    @OriginalMember(owner = "client!sfa", name = "i", descriptor = "I")
    public static int field9341;

    @OriginalMember(owner = "client!sfa", name = "a", descriptor = "(Z)V")
    public static final void method3696(boolean arg0) {
        field9335++;
        class11.method284(64, false);
        if (class527.field7435 >= 0 && class527.field7435 != 0) {
            class294.method1959((byte) 127, class527.field7435);
            class527.field7435 = -1;
        }
        if (!arg0) {
            method3700(-88);
        }
    }

    @OriginalMember(owner = "client!sfa", name = "a", descriptor = "(BI)Ler;")
    public final class92 method3697(byte arg0, int arg1) {
        field9333++;
        class287 var3 = this.field9342;
        class92 var4;
        synchronized (this.field9342) {
            var4 = (class92) this.field9342.method1900((long) arg1, 95);
        }
        if (var4 != null) {
            return var4;
        }
        class344 var5 = this.field9340;
        byte[] var6;
        synchronized (this.field9340) {
            var6 = this.field9340.method2216(4, arg1, true);
        }
        class92 var7 = new class92();
        var7.field1683 = arg1;
        var7.field1674 = this;
        if (arg0 != -125) {
            return null;
        }
        if (var6 != null) {
            var7.method887(new class61(var6), (byte) 99);
        }
        var7.method886((byte) 123);
        class287 var8 = this.field9342;
        synchronized (this.field9342) {
            this.field9342.method1904(var7, (long) arg1, -1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!sfa", name = "b", descriptor = "(Z)V")
    public final void method3698(boolean arg0) {
        class287 var2 = this.field9342;
        synchronized (this.field9342) {
            if (arg0) {
                method3700(23);
            }
            this.field9342.method1913(true);
        }
        field9337++;
    }

    @OriginalMember(owner = "client!sfa", name = "a", descriptor = "(ZI)V")
    public final void method3699(boolean arg0, int arg1) {
        class287 var3 = this.field9342;
        synchronized (this.field9342) {
            this.field9342.method1908(arg1, (byte) -11);
        }
        if (arg0) {
            field9338++;
        }
    }

    @OriginalMember(owner = "client!sfa", name = "a", descriptor = "(I)V")
    public static void method3700(int arg0) {
        field9334 = null;
        if (arg0 == 4) {
            field9343 = null;
            field9344 = null;
        }
    }

    @OriginalMember(owner = "client!sfa", name = "a", descriptor = "(B)V")
    public final void method3701(byte arg0) {
        if (arg0 != 68) {
            this.field9342 = null;
        }
        class287 var2 = this.field9342;
        synchronized (this.field9342) {
            this.field9342.method1912(-2552);
        }
        field9339++;
    }

    @OriginalMember(owner = "client!sfa", name = "<init>", descriptor = "(Lmea;ILom;)V")
    public class648(class398 arg0, int arg1, class344 arg2) {
        this.field9340 = arg2;
        this.field9336 = this.field9340.method2236(4, 0);
    }
}
