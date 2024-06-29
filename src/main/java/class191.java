import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uu")
public class class191 {

    @OriginalMember(owner = "client!uu", name = "i", descriptor = "I")
    public int field3227 = -1;

    @OriginalMember(owner = "client!uu", name = "j", descriptor = "I")
    public int field3228 = -1;

    @OriginalMember(owner = "client!uu", name = "d", descriptor = "Z")
    public static boolean field3222 = false;

    @OriginalMember(owner = "client!uu", name = "e", descriptor = "[J")
    public static long[] field3223 = new long[32];

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "I")
    public static int field3219;

    @OriginalMember(owner = "client!uu", name = "b", descriptor = "I")
    public static int field3220;

    @OriginalMember(owner = "client!uu", name = "f", descriptor = "I")
    public static int field3224;

    @OriginalMember(owner = "client!uu", name = "g", descriptor = "I")
    public static int field3225;

    @OriginalMember(owner = "client!uu", name = "h", descriptor = "I")
    public static int field3226;

    @OriginalMember(owner = "client!uu", name = "c", descriptor = "[I")
    public int[] field3221;

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(ILhp;)V")
    public final void method1337(int arg0, class217 arg1) {
        field3224++;
        if (arg0 >= -93) {
            this.field3228 = 110;
        }
        while (true) {
            int var3 = arg1.method1515((byte) 123);
            if (var3 == 0) {
                return;
            }
            this.method1341((byte) -111, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(Ljava/lang/Object;ZI)[B")
    public static final byte[] method1338(Object arg0, boolean arg1, int arg2) {
        field3219++;
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var3 = (byte[]) arg0;
            return arg1 ? class168.method1130((byte) 126, var3) : var3;
        } else if (arg0 instanceof class200) {
            class200 var4 = (class200) arg0;
            return var4.method1400(-106);
        } else if (arg2 == 0) {
            throw new IllegalArgumentException();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(I)V")
    public static void method1339(int arg0) {
        field3223 = null;
        if (arg0 != 0) {
            field3223 = null;
        }
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(IIBIIII)V")
    public static final void method1340(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        field3220++;
        int var7 = arg5 - arg6;
        int var8 = arg1 + arg6;
        if (arg2 >= -119) {
            return;
        }
        for (int var9 = arg1; var9 < var8; var9++) {
            class359.method2255((byte) -112, class416.field6200[var9], arg3, arg4, arg0);
        }
        int var10 = arg3 - arg6;
        for (int var11 = arg5; var11 > var7; var11--) {
            class359.method2255((byte) -124, class416.field6200[var11], arg3, arg4, arg0);
        }
        int var12 = arg4 + arg6;
        for (int var13 = var8; var13 <= var7; var13++) {
            int[] var14 = class416.field6200[var13];
            class359.method2255((byte) -93, var14, var12, arg4, arg0);
            class359.method2255((byte) -100, var14, arg3, var10, arg0);
        }
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(BILhp;)V")
    private final void method1341(byte arg0, int arg1, class217 arg2) {
        if (arg1 == 1) {
            this.field3227 = arg2.method1511(-123);
        } else if (arg1 == 2) {
            this.field3221 = new int[arg2.method1515((byte) 121)];
            for (int var4 = 0; var4 < this.field3221.length; var4++) {
                this.field3221[var4] = arg2.method1511(79);
            }
        } else if (arg1 == 3) {
            this.field3228 = arg2.method1515((byte) 125);
        }
        field3226++;
        if (arg0 > -56) {
            this.method1337(-39, null);
        }
    }

    @OriginalMember(owner = "client!uu", name = "b", descriptor = "(I)V")
    public static final void method1342(int arg0) {
        field3225++;
        int var1 = 0;
        if (class193.field3258.method2987(false, class96.field1384)) {
            int var2 = var1 | 0x1;
            int var3 = var2 | 0x10;
            int var4 = var3 | 0x20;
            int var5 = var4 | 0x2;
            var1 = var5 | 0x4;
        }
        if (!class193.field3258.field7226) {
            var1 |= 0x40;
        }
        class331.method2096((byte) -45, var1);
        class510.field7458.method2975((byte) -56, var1);
        class390.field5847.method469(var1, 928624627);
        class175.field2605.method2778((byte) -71, var1);
        class123.field1839.method1493(2, var1);
        class6.method35(-1, var1);
        class530.method3139(0, var1);
        class74.method642((byte) 0, var1);
        if (arg0 < 100) {
            field3223 = null;
        }
        class346.method2156(127, var1);
        class505.method3010(-100);
    }

    static {
        new class234(null, "bevor du die Option 'Regelverstoß melden' benutzt.", null, null);
    }
}
