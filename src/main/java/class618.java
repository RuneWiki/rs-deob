import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vs")
public class class618 {

    @OriginalMember(owner = "client!vs", name = "d", descriptor = "Ljava/lang/String;")
    private String field8312 = "null";

    @OriginalMember(owner = "client!vs", name = "p", descriptor = "[F")
    public static float[] field8324 = new float[2];

    @OriginalMember(owner = "client!vs", name = "s", descriptor = "I")
    public static int field8327 = 0;

    @OriginalMember(owner = "client!vs", name = "l", descriptor = "C")
    public char field8320;

    @OriginalMember(owner = "client!vs", name = "m", descriptor = "C")
    public char field8321;

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "I")
    public static int field8309;

    @OriginalMember(owner = "client!vs", name = "b", descriptor = "I")
    public static int field8310;

    @OriginalMember(owner = "client!vs", name = "e", descriptor = "I")
    public static int field8313;

    @OriginalMember(owner = "client!vs", name = "f", descriptor = "I")
    public static int field8314;

    @OriginalMember(owner = "client!vs", name = "g", descriptor = "I")
    public static int field8315;

    @OriginalMember(owner = "client!vs", name = "h", descriptor = "I")
    public static int field8316;

    @OriginalMember(owner = "client!vs", name = "i", descriptor = "I")
    public static int field8317;

    @OriginalMember(owner = "client!vs", name = "j", descriptor = "I")
    public static int field8318;

    @OriginalMember(owner = "client!vs", name = "k", descriptor = "I")
    private int field8319;

    @OriginalMember(owner = "client!vs", name = "n", descriptor = "I")
    public static int field8322;

    @OriginalMember(owner = "client!vs", name = "q", descriptor = "I")
    public static int field8325;

    @OriginalMember(owner = "client!vs", name = "r", descriptor = "I")
    private int field8326;

    @OriginalMember(owner = "client!vs", name = "c", descriptor = "Ldj;")
    private class362 field8311;

    @OriginalMember(owner = "client!vs", name = "o", descriptor = "Ldj;")
    public class362 field8323;

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(II)Z")
    public final boolean method3497(int arg0, int arg1) {
        field8322++;
        if (this.field8323 == null) {
            return false;
        }
        if (arg0 != 0) {
            this.field8321 = (char) 65503;
        }
        if (this.field8311 == null) {
            this.method3506(2);
        }
        class365 var3 = (class365) this.field8311.method2121(arg0 ^ 0x76, (long) arg1);
        return var3 != null;
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(ILjava/lang/String;)Z")
    public final boolean method3498(int arg0, String arg1) {
        field8310++;
        if (this.field8323 == null) {
            return false;
        } else if (arg0 == 5) {
            if (this.field8311 == null) {
                this.method3502((byte) 91);
            }
            for (class89 var3 = (class89) this.field8311.method2121(120, class150.method1078(2, arg1)); var3 != null; var3 = (class89) this.field8311.method2118(0)) {
                if (var3.field1185.equals(arg1)) {
                    return true;
                }
            }
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(IB[BLnv;)Lpj;")
    public static final class158 method3499(int arg0, byte arg1, byte[] arg2, class439 arg3) {
        field8318++;
        if (arg2 == null || arg2.length == 0) {
            return null;
        }
        long var4 = OpenGL.glCreateShaderObjectARB(arg0);
        OpenGL.glShaderSourceRawARB(var4, arg2);
        OpenGL.glCompileShaderARB(var4);
        OpenGL.glGetObjectParameterivARB(var4, 35713, class300.field3592, 0);
        if (arg1 != -119) {
            field8327 = -41;
        }
        if (class300.field3592[0] == 0) {
            if (class300.field3592[0] == 0) {
                System.out.println("Shader compile failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class300.field3592, 1);
            if (class300.field3592[1] > 1) {
                byte[] var6 = new byte[class300.field3592[1]];
                OpenGL.glGetInfoLogARB(var4, class300.field3592[1], class300.field3592, 0, var6, 0);
                System.out.println(new String(var6));
            }
            if (class300.field3592[0] == 0) {
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class158(arg3, var4, arg0);
    }

    @OriginalMember(owner = "client!vs", name = "b", descriptor = "(II)Ljava/lang/String;")
    public final String method3500(int arg0, int arg1) {
        field8309++;
        if (this.field8323 == null) {
            return this.field8312;
        }
        class562 var3 = (class562) this.field8323.method2121(101, (long) arg0);
        if (var3 == null) {
            return this.field8312;
        } else {
            if (arg1 != 2) {
                this.field8323 = null;
            }
            return var3.field7772;
        }
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(I)V")
    public static final void method3501(int arg0) {
        if (arg0 == -24313) {
            class130.field1611 = new class450();
            field8317++;
        }
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(B)V")
    private final void method3502(byte arg0) {
        field8313++;
        this.field8311 = new class362(this.field8323.method2120(0));
        if (arg0 > 22) {
            for (class562 var2 = (class562) this.field8323.method2119(-58); var2 != null; var2 = (class562) this.field8323.method2111((byte) 14)) {
                class89 var3 = new class89(var2.field7772, (int) var2.field4809);
                this.field8311.method2112(var3, (byte) 6, class150.method1078(2, var2.field7772));
            }
        }
    }

    @OriginalMember(owner = "client!vs", name = "b", descriptor = "(I)V")
    public static void method3503(int arg0) {
        int var1 = 68 / ((15 - arg0) / 43);
        field8324 = null;
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(ILes;I)V")
    private final void method3504(int arg0, class403 arg1, int arg2) {
        if (arg0 == 1) {
            this.field8320 = class625.method3550(arg1.method2392(118), (byte) 117);
        } else if (arg0 == 2) {
            this.field8321 = class625.method3550(arg1.method2392(-107), (byte) 117);
        } else if (arg0 == 3) {
            this.field8312 = arg1.method2384(-6435);
        } else if (arg0 == 4) {
            this.field8319 = arg1.method2381((byte) 48);
        } else if (arg0 == 5 || arg0 == 6) {
            this.field8326 = arg1.method2390((byte) 26);
            this.field8323 = new class362(class783.method4337(this.field8326, (byte) 62));
            for (int var4 = 0; var4 < this.field8326; var4++) {
                int var5 = arg1.method2381((byte) 95);
                class379 var6;
                if (arg0 == 5) {
                    var6 = new class562(arg1.method2384(-6435));
                } else {
                    var6 = new class365(arg1.method2381((byte) 28));
                }
                this.field8323.method2112(var6, (byte) 6, (long) var5);
            }
        }
        if (arg2 >= 53) {
            field8325++;
        }
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(Les;I)V")
    public final void method3505(class403 arg0, int arg1) {
        field8316++;
        if (arg1 != 0) {
            return;
        }
        while (true) {
            int var3 = arg0.method2396((byte) 63);
            if (var3 == 0) {
                return;
            }
            this.method3504(var3, arg0, arg1 ^ 0x7F);
        }
    }

    @OriginalMember(owner = "client!vs", name = "c", descriptor = "(I)V")
    private final void method3506(int arg0) {
        if (arg0 != 2) {
            this.field8312 = null;
        }
        field8315++;
        this.field8311 = new class362(this.field8323.method2120(0));
        for (class365 var2 = (class365) this.field8323.method2119(-90); var2 != null; var2 = (class365) this.field8323.method2111((byte) -126)) {
            class365 var3 = new class365((int) var2.field4809);
            this.field8311.method2112(var3, (byte) 6, (long) var2.field4537);
        }
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(IZ)I")
    public final int method3507(int arg0, boolean arg1) {
        field8314++;
        if (this.field8323 == null) {
            return this.field8319;
        }
        class365 var3 = (class365) this.field8323.method2121(85, (long) arg0);
        if (var3 == null) {
            return this.field8319;
        } else if (arg1) {
            return var3.field4537;
        } else {
            return 37;
        }
    }
}
