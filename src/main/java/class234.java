import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gca")
public class class234 {

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "Z")
    private boolean field3026 = false;

    @OriginalMember(owner = "client!gca", name = "l", descriptor = "I")
    public int field3037 = 443;

    @OriginalMember(owner = "client!gca", name = "f", descriptor = "I")
    public int field3031 = 43594;

    @OriginalMember(owner = "client!gca", name = "m", descriptor = "Z")
    private boolean field3038 = false;

    @OriginalMember(owner = "client!gca", name = "b", descriptor = "I")
    public static int field3027;

    @OriginalMember(owner = "client!gca", name = "c", descriptor = "I")
    public static int field3028;

    @OriginalMember(owner = "client!gca", name = "d", descriptor = "I")
    public static int field3029;

    @OriginalMember(owner = "client!gca", name = "e", descriptor = "I")
    public int field3030;

    @OriginalMember(owner = "client!gca", name = "g", descriptor = "I")
    public static int field3032;

    @OriginalMember(owner = "client!gca", name = "i", descriptor = "I")
    public static int field3034;

    @OriginalMember(owner = "client!gca", name = "k", descriptor = "I")
    public static int field3036;

    @OriginalMember(owner = "client!gca", name = "n", descriptor = "I")
    public static int field3039;

    @OriginalMember(owner = "client!gca", name = "o", descriptor = "I")
    public static int field3040;

    @OriginalMember(owner = "client!gca", name = "j", descriptor = "Ljava/lang/String;")
    public String field3035;

    @OriginalMember(owner = "client!gca", name = "h", descriptor = "[[[B")
    public static byte[][][] field3033;

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(Lqj;I)Lue;", line = 3)
    public final class218 method1409(class476 arg0, int arg1) {
        field3039++;
        int var3 = 117 % ((-arg1 - 72) / 49);
        return arg0.method2590(this.field3026 ? this.field3037 : this.field3031, 0, this.field3035, this.field3038);
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(I)V", line = 18)
    public final void method1410(int arg0) {
        if (arg0 != 35714) {
            this.field3037 = -42;
        }
        if (!this.field3026) {
            this.field3038 = true;
            this.field3026 = true;
        } else if (this.field3038) {
            this.field3038 = false;
        } else {
            this.field3026 = false;
        }
        field3034++;
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(Lji;Z)V", line = 42)
    public static final void method1411(class572 arg0, boolean arg1) {
        field3040++;
        int var2 = arg0.method3033((byte) 91);
        class618.field8384 = new class256[var2];
        if (arg1) {
            field3033 = null;
        }
        for (int var3 = 0; var3 < var2; var3++) {
            class618.field8384[var3] = new class256();
            class618.field8384[var3].field3282 = arg0.method3033((byte) 91);
            class618.field8384[var3].field3283 = arg0.method3057((byte) -120);
        }
        class592.field7946 = arg0.method3033((byte) 91);
        class163.field1921 = arg0.method3033((byte) 91);
        class237.field3067 = arg0.method3033((byte) 91);
        class633.field8584 = new class305[class163.field1921 - (class592.field7946 - 1)];
        for (int var4 = 0; var4 < class237.field3067; var4++) {
            int var5 = arg0.method3033((byte) 91);
            class305 var6 = class633.field8584[var5] = new class305();
            var6.field6644 = arg0.method3097((byte) 12);
            var6.field6643 = arg0.method3064(-2031091464);
            var6.field3865 = class592.field7946 + var5;
            var6.field3860 = arg0.method3057((byte) -122);
            var6.field3869 = arg0.method3057((byte) -126);
        }
        class530.field6694 = arg0.method3064(-2031091464);
        class245.field3162 = true;
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(Lgca;B)Z", line = 94)
    public final boolean method1412(class234 arg0, byte arg1) {
        field3036++;
        int var3 = -115 % ((arg1 - 80) / 41);
        if (arg0 == null) {
            return false;
        } else {
            return this.field3030 == arg0.field3030 && this.field3035.equals(arg0.field3035);
        }
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(ZI)Lfl;", line = 109)
    public static final class692 method1413(boolean arg0, int arg1) {
        field3029++;
        class692 var2 = (class692) class659.field8944.method1221((long) arg1, arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class357.field4609.method1659(86, arg1, 0);
        class692 var4 = new class692();
        if (var3 != null) {
            var4.method3824(arg1, new class572(var3), 88);
        }
        class659.field8944.method1230((byte) 102, (long) arg1, var4);
        return var4;
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(ILmn;)V", line = 130)
    public static final void method1414(int arg0, class341 arg1) {
        field3027++;
        arg1.field4350 = null;
        if (class5.field41 < arg0) {
            class580.field7776.method1714(arg1, (byte) 11);
            class5.field41++;
        }
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(B)V", line = 144)
    public static final void method1415(byte arg0) {
        field3028++;
        if (arg0 >= -44) {
            field3033 = null;
        }
        if (class386.field4955.field5919 && class76.field997.field3030 != -1) {
            class645.method3609(class76.field997.field3030, class76.field997.field3035, -75);
        }
    }

    @OriginalMember(owner = "client!gca", name = "b", descriptor = "(B)V", line = 161)
    public static void method1416(byte arg0) {
        field3033 = null;
        if (arg0 != 99) {
            method1413(false, 72);
        }
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "([Lhr;ILjaa;)Lsh;", line = 172)
    public static final class65 method1417(class491[] arg0, int arg1, class576 arg2) {
        field3032++;
        for (int var3 = 0; var3 < arg0.length; var3++) {
            if (arg0[var3] == null || arg0[var3].field6127 <= 0L) {
                return null;
            }
        }
        long var4 = OpenGL.glCreateProgramObjectARB();
        for (int var6 = 0; var6 < arg0.length; var6++) {
            OpenGL.glAttachObjectARB(var4, arg0[var6].field6127);
        }
        OpenGL.glLinkProgramARB(var4);
        OpenGL.glGetObjectParameterivARB(var4, 35714, class17.field179, 0);
        if (arg1 >= -124) {
            method1416((byte) 0);
        }
        if (class17.field179[0] == 0) {
            if (class17.field179[0] == 0) {
                System.out.println("Shader linking failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class17.field179, 1);
            if (class17.field179[1] > 1) {
                byte[] var7 = new byte[class17.field179[1]];
                OpenGL.glGetInfoLogARB(var4, class17.field179[1], class17.field179, 0, var7, 0);
                System.out.println(new String(var7));
            }
            if (class17.field179[0] == 0) {
                for (int var8 = 0; var8 < arg0.length; var8++) {
                    OpenGL.glDetachObjectARB(var4, arg0[var8].field6127);
                }
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class65(arg2, var4, arg0);
    }
}
