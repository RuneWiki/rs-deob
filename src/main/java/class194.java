import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class194 extends class417 {

    @OriginalMember(owner = "client!sb", name = "A", descriptor = "Lwi;")
    public static class330 field2585 = new class330(64);

    @OriginalMember(owner = "client!sb", name = "L", descriptor = "I")
    public static int field2596 = -1;

    @OriginalMember(owner = "client!sb", name = "K", descriptor = "I")
    public static int field2595 = 0;

    @OriginalMember(owner = "client!sb", name = "M", descriptor = "Lla;")
    public static class319 field2597 = new class319(6, 11);

    @OriginalMember(owner = "client!sb", name = "B", descriptor = "I")
    public static int field2586;

    @OriginalMember(owner = "client!sb", name = "C", descriptor = "I")
    public static int field2587;

    @OriginalMember(owner = "client!sb", name = "D", descriptor = "I")
    public static int field2588;

    @OriginalMember(owner = "client!sb", name = "F", descriptor = "I")
    public static int field2590;

    @OriginalMember(owner = "client!sb", name = "G", descriptor = "I")
    public static int field2591;

    @OriginalMember(owner = "client!sb", name = "H", descriptor = "I")
    public static int field2592;

    @OriginalMember(owner = "client!sb", name = "I", descriptor = "I")
    public static int field2593;

    @OriginalMember(owner = "client!sb", name = "J", descriptor = "I")
    public static int field2594;

    @OriginalMember(owner = "client!sb", name = "N", descriptor = "I")
    public static int field2598;

    @OriginalMember(owner = "client!sb", name = "O", descriptor = "I")
    public static int field2599;

    @OriginalMember(owner = "client!sb", name = "P", descriptor = "I")
    public static int field2600;

    @OriginalMember(owner = "client!sb", name = "E", descriptor = "[B")
    private byte[] field2589;

    @OriginalMember(owner = "client!sb", name = "Q", descriptor = "[Lhr;")
    public static class370[] field2601;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(B)V")
    public static void method1305(byte arg0) {
        field2585 = null;
        field2597 = null;
        int var1 = -96 / ((39 - arg0) / 54);
        field2601 = null;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lnq;[Lpb;B)Lsu;")
    public static final class142 method1306(class325 arg0, class473[] arg1, byte arg2) {
        field2586++;
        for (int var3 = 0; var3 < arg1.length; var3++) {
            if (arg1[var3] == null || arg1[var3].field7036 <= 0L) {
                return null;
            }
        }
        long var4 = OpenGL.glCreateProgramObjectARB();
        if (arg2 != -114) {
            return null;
        }
        for (int var6 = 0; var6 < arg1.length; var6++) {
            OpenGL.glAttachObjectARB(var4, arg1[var6].field7036);
        }
        OpenGL.glLinkProgramARB(var4);
        OpenGL.glGetObjectParameterivARB(var4, 35714, class289.field4225, 0);
        if (class289.field4225[0] == 0) {
            if (class289.field4225[0] == 0) {
                System.out.println("Shader linking failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class289.field4225, 1);
            if (class289.field4225[1] > 1) {
                byte[] var7 = new byte[class289.field4225[1]];
                OpenGL.glGetInfoLogARB(var4, class289.field4225[1], class289.field4225, 0, var7, 0);
                System.out.println(new String(var7));
            }
            if (class289.field4225[0] == 0) {
                for (int var8 = 0; var8 < arg1.length; var8++) {
                    OpenGL.glDetachObjectARB(var4, arg1[var8].field7036);
                }
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class142(arg0, var4, arg1);
    }

    @OriginalMember(owner = "client!sb", name = "<init>", descriptor = "()V")
    public class194() {
        super(12, 5, 16, 2, 2, 0.45F);
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "([FIB)[F")
    public static final float[] method1307(float[] arg0, int arg1, byte arg2) {
        if (arg2 >= -49) {
            field2595 = 26;
        }
        field2593++;
        float[] var3 = new float[arg1];
        class192.method1302(arg0, 0, var3, 0, arg1);
        return var3;
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(IBI)V")
    public final void method1308(int arg0, byte arg1, int arg2) {
        field2598++;
        byte var4 = (byte) ((arg1 >> 1 & 0x7F) + 127);
        if (arg2 != 0) {
            return;
        }
        int var5 = arg0 * 2;
        int var10001 = var5;
        int var6 = var5 + 1;
        this.field2589[var10001] = var4;
        this.field2589[var6] = var4;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(BIII)[B")
    public final byte[] method1309(byte arg0, int arg1, int arg2, int arg3) {
        this.field2589 = new byte[arg1 * arg2 * arg3 * 2];
        field2592++;
        if (arg0 == -76) {
            this.method1731(arg3, arg1, arg2, (byte) 108);
            return this.field2589;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIB)I")
    public static final int method1310(int arg0, int arg1, byte arg2) {
        field2588++;
        if (arg2 > -51) {
            method1306(null, null, (byte) 55);
        }
        int var3 = arg1 >> 31 & arg0 - 1;
        return ((arg1 >>> 31) + arg1) % arg0 + var3;
    }

    @OriginalMember(owner = "client!sb", name = "g", descriptor = "(I)V")
    public static final void method1311(int arg0) {
        field2599++;
        if (class267.field3712 < 0) {
            class291.field4259 = -1;
            class267.field3712 = 0;
            class376.field5712 = -1;
        }
        if (class267.field3712 > class12.field238) {
            class376.field5712 = -1;
            class291.field4259 = -1;
            class267.field3712 = class12.field238;
        }
        if (class253.field3514 < arg0) {
            class253.field3514 = 0;
            class376.field5712 = -1;
            class291.field4259 = -1;
        }
        if (class253.field3514 > class12.field246) {
            class291.field4259 = -1;
            class376.field5712 = -1;
            class253.field3514 = class12.field246;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIILnq;II[BZ)Lld;")
    public static final class116 method1312(int arg0, int arg1, int arg2, class325 arg3, int arg4, int arg5, byte[] arg6, boolean arg7) {
        if (arg2 <= 21) {
            field2594 = 10;
        }
        field2600++;
        if (!arg3.field4999 && (!class152.method994(arg0, false) || !class152.method994(arg4, false))) {
            return arg3.field5027 ? new class116(arg3, 34037, arg5, arg0, arg4, arg7, arg6, arg1) : new class116(arg3, arg5, arg0, arg4, class475.method2835(arg0, -1), class475.method2835(arg4, -1), arg6, arg1);
        } else {
            return new class116(arg3, 3553, arg5, arg0, arg4, arg7, arg6, arg1);
        }
    }
}
