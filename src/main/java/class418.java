import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ls")
public class class418 extends class367 {

    @OriginalMember(owner = "client!ls", name = "l", descriptor = "I")
    public int field6004 = -1;

    @OriginalMember(owner = "client!ls", name = "p", descriptor = "[I")
    public static int[] field6008 = new int[32];

    @OriginalMember(owner = "client!ls", name = "t", descriptor = "[I")
    public static int[] field6012 = new int[6];

    @OriginalMember(owner = "client!ls", name = "n", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field6006 = new BigInteger("a8f660ecca2ae1be81350b0cba0e4d7f9938ad4d977ba8c2517bd9fa697de940c5bf5d853e344309f69aea4b5f1650d4d6e2632bb218a2a4f7ed47b8e6a84939", 16);

    @OriginalMember(owner = "client!ls", name = "k", descriptor = "I")
    public static int field6003;

    @OriginalMember(owner = "client!ls", name = "o", descriptor = "I")
    public static int field6007;

    @OriginalMember(owner = "client!ls", name = "r", descriptor = "I")
    public int field6010;

    @OriginalMember(owner = "client!ls", name = "s", descriptor = "I")
    public static int field6011;

    @OriginalMember(owner = "client!ls", name = "m", descriptor = "Ljava/lang/String;")
    public String field6005;

    @OriginalMember(owner = "client!ls", name = "q", descriptor = "Ljava/lang/String;")
    public String field6009;

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(BII)I")
    public static final int method2482(byte arg0, int arg1, int arg2) {
        ++field6011;
        if (arg0 < 68) {
            return -34;
        } else {
            int var3 = arg2 - -(arg1 * 57);
            int var4 = var3 ^ var3 << 13;
            int var5 = Integer.MAX_VALUE & (var4 * var4 * 15731 + 789221) * var4 + 1376312589;
            return (134137122 & var5) >> 19;
        }
    }

    @OriginalMember(owner = "client!ls", name = "d", descriptor = "(I)Lnm;")
    public final class340 method2483(int arg0) {
        if (arg0 != 15731) {
            this.field6010 = 34;
        }
        ++field6003;
        return class66.field755[super.field5314];
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(III)Z")
    public static final boolean method2484(int arg0, int arg1, int arg2) {
        if (arg2 != 18419) {
            field6006 = null;
        }
        ++field6007;
        return class346.method2126(arg1, arg0, arg2 ^ 18372) | (arg1 & 393216) != 0 || class551.method3227(arg0, (byte) 55, arg1);
    }

    @OriginalMember(owner = "client!ls", name = "e", descriptor = "(I)V")
    public static void method2485(int arg0) {
        if (arg0 > -125) {
            field6008 = null;
        }
        field6008 = null;
        field6006 = null;
        field6012 = null;
    }
}
