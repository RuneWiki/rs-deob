import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ns")
public class class61 extends class102 implements class500 {

    @OriginalMember(owner = "client!ns", name = "k", descriptor = "I")
    private int field790;

    @OriginalMember(owner = "client!ns", name = "m", descriptor = "Ltu;")
    public static class7 field792 = new class7();

    @OriginalMember(owner = "client!ns", name = "w", descriptor = "I")
    public static int field802 = 0;

    @OriginalMember(owner = "client!ns", name = "t", descriptor = "F")
    public static float field799;

    @OriginalMember(owner = "client!ns", name = "l", descriptor = "I")
    public static int field791;

    @OriginalMember(owner = "client!ns", name = "n", descriptor = "I")
    public static int field793;

    @OriginalMember(owner = "client!ns", name = "o", descriptor = "I")
    public static int field794;

    @OriginalMember(owner = "client!ns", name = "p", descriptor = "I")
    public static int field795;

    @OriginalMember(owner = "client!ns", name = "q", descriptor = "I")
    public static int field796;

    @OriginalMember(owner = "client!ns", name = "r", descriptor = "I")
    public static int field797;

    @OriginalMember(owner = "client!ns", name = "s", descriptor = "I")
    public static int field798;

    @OriginalMember(owner = "client!ns", name = "u", descriptor = "I")
    public static int field800;

    @OriginalMember(owner = "client!ns", name = "v", descriptor = "Lpd;")
    public static class319 field801;

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(I[BII)V")
    public final void method343(int arg0, byte[] arg1, int arg2, int arg3) {
        this.method687(arg1, arg2, (byte) 99);
        if (arg3 != 3238) {
            field792 = null;
        }
        ++field798;
        this.field790 = arg0;
    }

    @OriginalMember(owner = "client!ns", name = "<init>", descriptor = "(Lgk;I[BIZ)V")
    public class61(class463 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        this.field790 = arg1;
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(I)I")
    public final int method344(int arg0) {
        if (arg0 != -18156) {
            return -45;
        } else {
            ++field791;
            return this.field790;
        }
    }

    @OriginalMember(owner = "client!ns", name = "c", descriptor = "(B)V")
    public static void method345(byte arg0) {
        field792 = null;
        field801 = null;
        if (arg0 < 53) {
            field799 = -0.3607248F;
        }
    }

    @OriginalMember(owner = "client!ns", name = "b", descriptor = "(B)V")
    public final void method346(byte arg0) {
        ++field793;
        super.field1404.method2758(true, this);
        if (arg0 >= -126) {
            method348(-73, -94, (class423) null, (byte) 45);
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static final String method347(int arg0, String arg1) {
        ++field794;
        if (arg1 == null) {
            return null;
        } else {
            int var2 = 0;
            int var3 = arg1.length();
            while (var2 < var3 && class417.method2454(arg1.charAt(var2), -96)) {
                ++var2;
            }
            while (var3 > var2 && class417.method2454(arg1.charAt(var3 + -1), -96)) {
                --var3;
            }
            int var4 = -var2 + var3;
            if (~var4 <= -2 && ~var4 >= -13) {
                StringBuffer var5 = new StringBuffer(var4);
                for (int var6 = var2; var3 > var6; ++var6) {
                    char var7 = arg1.charAt(var6);
                    if (class446.method2653(var7, 126)) {
                        char var8 = class389.method2320(17270, var7);
                        if (~var8 != -1) {
                            var5.append(var8);
                        }
                    }
                }
                if (arg0 != 31608) {
                    method345((byte) -52);
                }
                if (~var5.length() == -1) {
                    return null;
                } else {
                    return var5.toString();
                }
            } else {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!ns", name = "<init>", descriptor = "(Lgk;ILjaggl/memory/NativeBuffer;IZ)V")
    public class61(class463 arg0, int arg1, NativeBuffer arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        this.field790 = arg1;
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(IILeo;B)V")
    public static final void method348(int arg0, int arg1, class423 arg2, byte arg3) {
        ++field795;
        class113 var4 = arg2.method2498(25733, class512.field7538);
        if (arg3 > 36) {
            if (var4 != null) {
                class512.field7538.method925(arg0, arg1, arg0 - -arg2.field5735, arg2.field5726 + arg1);
                if (class461.field6450 < 3) {
                    class71.field881.method2401((float) arg2.field5735 / 2.0F + (float) arg0, (float) arg2.field5726 / 2.0F + (float) arg1, 4096, (16383 & (int) (-class244.field3138)) << 2, var4, arg0, arg1);
                } else {
                    class512.field7538.method912(-16777216, var4, arg0, arg1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ns", name = "b", descriptor = "(I)J")
    public final long method349(int arg0) {
        ++field797;
        if (arg0 <= 5) {
            field799 = -1.3853817F;
        }
        return 0L;
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(B)I")
    public final int method350(byte arg0) {
        ++field796;
        if (arg0 != -42) {
            this.method349(-98);
        }
        return super.field1401;
    }
}
