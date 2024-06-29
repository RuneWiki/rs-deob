import java.io.IOException;
import java.math.BigInteger;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bea")
public class class225 extends class702 {

    @OriginalMember(owner = "client!bea", name = "u", descriptor = "Ljava/net/Socket;")
    private Socket field3205;

    @OriginalMember(owner = "client!bea", name = "l", descriptor = "Lgca;")
    private class253 field3196;

    @OriginalMember(owner = "client!bea", name = "h", descriptor = "Lhn;")
    private class722 field3192;

    @OriginalMember(owner = "client!bea", name = "o", descriptor = "I")
    public static int field3199 = 0;

    @OriginalMember(owner = "client!bea", name = "m", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field3197 = new BigInteger("10001", 16);

    @OriginalMember(owner = "client!bea", name = "s", descriptor = "Lhda;")
    public static class752 field3203 = new class752(1, 3);

    @OriginalMember(owner = "client!bea", name = "w", descriptor = "[Lse;")
    public static class259[] field3207 = new class259[16];

    @OriginalMember(owner = "client!bea", name = "v", descriptor = "Lhda;")
    public static class752 field3206 = new class752(99, 4);

    @OriginalMember(owner = "client!bea", name = "g", descriptor = "I")
    public static int field3191;

    @OriginalMember(owner = "client!bea", name = "i", descriptor = "I")
    public static int field3193;

    @OriginalMember(owner = "client!bea", name = "j", descriptor = "I")
    public static int field3194;

    @OriginalMember(owner = "client!bea", name = "k", descriptor = "I")
    public static int field3195;

    @OriginalMember(owner = "client!bea", name = "n", descriptor = "I")
    public static int field3198;

    @OriginalMember(owner = "client!bea", name = "p", descriptor = "I")
    public static int field3200;

    @OriginalMember(owner = "client!bea", name = "q", descriptor = "I")
    public static int field3201;

    @OriginalMember(owner = "client!bea", name = "r", descriptor = "I")
    public static int field3202;

    @OriginalMember(owner = "client!bea", name = "t", descriptor = "I")
    public static int field3204;

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "([BIII)I", line = 5)
    public final int method1435(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        if (arg2 >= -118) {
            this.finalize();
        }
        field3194++;
        return this.field3196.method1547(arg0, true, arg1, arg3);
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(II)Z", line = 16)
    public final boolean method1436(int arg0, int arg1) throws IOException {
        field3202++;
        if (arg0 != 1) {
            this.method1441(38);
        }
        return this.field3196.method1548(-1, arg1);
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(IILvfa;I)V", line = 30)
    public static final void method1437(int arg0, int arg1, class672 arg2, int arg3) {
        if (class142.field2268) {
            class62 var4 = class495.field6680 == -1 ? null : class505.field6754.method4149(-6119, class495.field6680);
            if (client.method1875(arg2).method1346(119) && (class575.field7557 & 0x20) != 0 && (var4 == null || arg2.method3704(0, class495.field6680, var4.field761) != var4.field761)) {
                class588.field7678++;
                class586.method3203(true, (long) (arg2.field9200 | arg2.field9277 << 0), 0L, false, arg2.field9200, 25, false, arg2.field9318, class414.field5733, class719.field10008, (byte) 87, class341.field4808 + " -> " + arg2.field9165, arg2.field9277);
            }
        }
        field3195++;
        for (int var5 = 9; var5 >= 5; var5--) {
            String var10 = class89.method684(arg2, (byte) 94, var5);
            if (var10 != null) {
                class586.method3203(true, (long) (arg2.field9200 | arg2.field9277 << 0), (long) (var5 + 1), false, arg2.field9200, 1003, false, arg2.field9318, class725.method4080(var5, arg2, (byte) -26), var10, (byte) 87, arg2.field9165, arg2.field9277);
                class704.field9767++;
            }
        }
        String var6 = class596.method3239(-1, arg2);
        if (var6 != null) {
            class586.method3203(true, (long) (arg2.field9277 << 0 | arg2.field9200), 0L, false, arg2.field9200, 17, false, arg2.field9318, arg2.field9252, var6, (byte) 87, arg2.field9165, arg2.field9277);
            class12.field184++;
        }
        int var7 = 79 / ((8 - arg0) / 33);
        for (int var8 = 4; var8 >= 0; var8--) {
            String var9 = class89.method684(arg2, (byte) 94, var8);
            if (var9 != null) {
                class704.field9767++;
                class586.method3203(true, (long) (arg2.field9277 << 0 | arg2.field9200), (long) (var8 + 1), false, arg2.field9200, 48, false, arg2.field9318, class725.method4080(var8, arg2, (byte) -26), var9, (byte) 87, arg2.field9165, arg2.field9277);
            }
        }
        if (!client.method1875(arg2).method1350((byte) -96)) {
            return;
        }
        class498.field6704++;
        if (arg2.field9260 == null) {
            class586.method3203(true, (long) (arg2.field9277 << 0 | arg2.field9200), 0L, false, arg2.field9200, 30, false, arg2.field9318, -1, class517.field6849.method2877(class713.field9854, (byte) -108), (byte) 87, "", arg2.field9277);
        } else {
            class586.method3203(true, (long) (arg2.field9200 | arg2.field9277 << 0), 0L, false, arg2.field9200, 30, false, arg2.field9318, -1, arg2.field9260, (byte) 87, "", arg2.field9277);
        }
    }

    @OriginalMember(owner = "client!bea", name = "c", descriptor = "(I)V", line = 107)
    public static void method1438(int arg0) {
        field3207 = null;
        field3203 = null;
        if (arg0 == -1462072736) {
            field3197 = null;
            field3206 = null;
        }
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(I)V", line = 122)
    public final void method1439(int arg0) {
        field3200++;
        try {
            this.field3205.close();
        } catch (IOException var2) {
        }
        this.field3196.method1546(-100);
        this.field3192.method4066(true);
        if (arg0 != -1) {
            this.method1439(25);
        }
    }

    @OriginalMember(owner = "client!bea", name = "finalize", descriptor = "()V", line = 138)
    protected final void finalize() {
        this.method1439(-1);
        field3204++;
    }

    @OriginalMember(owner = "client!bea", name = "d", descriptor = "(I)V", line = 154)
    public static final void method1440(int arg0) {
        class405.field5640 = null;
        if (arg0 != 1003) {
            method1438(-94);
        }
        class308.field4431 = null;
        class679.field9485 = null;
        class199.field2988 = null;
        class743.field10323 = null;
        class432.field5948 = null;
        class659.field8707 = null;
        class148.field2334 = null;
        field3198++;
        class64.field785 = null;
        class290.field4143 = null;
        class308.field4434 = null;
        class491.field6658 = null;
        class512.field6794 = null;
        class275.field3832 = null;
        class630.field8391 = null;
        class240.field3383 = null;
        class250.field3448 = null;
        class288.field4081 = null;
    }

    @OriginalMember(owner = "client!bea", name = "b", descriptor = "(I)V", line = 182)
    public final void method1441(int arg0) {
        if (arg0 != -3200) {
            this.finalize();
        }
        this.field3196.method1545(-110);
        field3193++;
        this.field3192.method4061(-19694);
    }

    @OriginalMember(owner = "client!bea", name = "<init>", descriptor = "(Ljava/net/Socket;I)V", line = 199)
    public class225(Socket arg0, int arg1) throws IOException {
        this.field3205 = arg0;
        this.field3205.setSoTimeout(30000);
        this.field3205.setTcpNoDelay(true);
        this.field3196 = new class253(this.field3205.getInputStream(), arg1);
        this.field3192 = new class722(this.field3205.getOutputStream(), arg1);
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(I[BII)V", line = 211)
    public final void method1442(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field3191++;
        if (arg2 == 1232) {
            this.field3192.method4063(8716, arg3, arg0, arg1);
        }
    }
}
