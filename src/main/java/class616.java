import jaggl.OpenGL;
import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaa")
public class class616 implements class716 {

    @OriginalMember(owner = "client!jaa", name = "f", descriptor = "Lwda;")
    private class640 field8501;

    @OriginalMember(owner = "client!jaa", name = "b", descriptor = "Ljg;")
    private class342 field8497;

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "I")
    public static int field8496;

    @OriginalMember(owner = "client!jaa", name = "c", descriptor = "I")
    public static int field8498;

    @OriginalMember(owner = "client!jaa", name = "d", descriptor = "I")
    public static int field8499;

    @OriginalMember(owner = "client!jaa", name = "e", descriptor = "I")
    public static int field8500;

    @OriginalMember(owner = "client!jaa", name = "g", descriptor = "I")
    public static int field8502;

    @OriginalMember(owner = "client!jaa", name = "h", descriptor = "I")
    public static int field8503;

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(ILd;Ljava/awt/Canvas;ILnd;)Lha;")
    public static final class60 method3443(int arg0, class153 arg1, Canvas arg2, int arg3, class547 arg4) {
        field8500++;
        if (arg3 != 12720) {
            return null;
        } else if (!class208.method1344(-128)) {
            throw new RuntimeException("");
        } else if (class633.method3549("jaggl", 99)) {
            OpenGL var5 = new OpenGL();
            long var6 = var5.init(arg2, 8, 8, 8, 24, 0, arg0);
            if (var6 == 0L) {
                throw new RuntimeException("");
            }
            class347 var8 = new class347(var5, arg2, var6, arg1, arg4, arg0);
            var8.method2377(23939);
            return var8;
        } else {
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(I)V")
    public final void method366(int arg0) {
        if (arg0 != 18295) {
            this.method368(false, (byte) -6);
        }
        field8498++;
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(ILjava/lang/String;ILda;II)I")
    private final int method3444(int arg0, String arg1, int arg2, class61 arg3, int arg4, int arg5) {
        field8499++;
        if (arg0 != 0) {
            this.method369(122);
        }
        return arg3.method566(0, arg2 + arg5, this.field8497.field4327, arg4 + arg5, -(arg5 * 2) + this.field8497.field4323, 0, 0, null, arg0 ^ 0x34CE, this.field8497.field4328 - (arg5 * 2), this.field8497.field4326, 0, 0, null, arg1, null);
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(BLbi;[Lpf;)Lit;")
    public static final class648 method3445(byte arg0, class483 arg1, class584[] arg2) {
        field8496++;
        for (int var3 = 0; var3 < arg2.length; var3++) {
            if (arg2[var3] == null || arg2[var3].field8163 <= 0L) {
                return null;
            }
        }
        long var4 = OpenGL.glCreateProgramObjectARB();
        for (int var6 = 0; var6 < arg2.length; var6++) {
            OpenGL.glAttachObjectARB(var4, arg2[var6].field8163);
        }
        OpenGL.glLinkProgramARB(var4);
        OpenGL.glGetObjectParameterivARB(var4, 35714, class631.field8712, 0);
        if (class631.field8712[0] == 0) {
            if (class631.field8712[0] == 0) {
                System.out.println("Shader linking failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class631.field8712, 1);
            if (class631.field8712[1] > 1) {
                byte[] var7 = new byte[class631.field8712[1]];
                OpenGL.glGetInfoLogARB(var4, class631.field8712[1], class631.field8712, 0, var7, 0);
                System.out.println(new String(var7));
            }
            if (class631.field8712[0] == 0) {
                for (int var8 = 0; var8 < arg2.length; var8++) {
                    OpenGL.glDetachObjectARB(var4, arg2[var8].field8163);
                }
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        if (arg0 == -96) {
            return new class648(arg1, var4, arg2);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(ZB)V")
    public final void method368(boolean arg0, byte arg1) {
        field8503++;
        if (arg1 > -57) {
            this.field8497 = null;
        }
        class74 var3 = this.field8501.method3600(0, this.field8497.field4330);
        if (var3 == null) {
            return;
        }
        int var4 = this.field8497.field4329.method735(0, this.field8497.field4323, class482.field6548) + this.field8497.field4321;
        int var5 = this.field8497.field4332.method3397(this.field8497.field4328, class478.field6509, -85) + this.field8497.field4320;
        if (this.field8497.field4319) {
            class386.field4930.method460(var4, var5, this.field8497.field4323, this.field8497.field4328, this.field8497.field4325, 0);
        }
        int var6 = var5 + this.method3444(0, var3.field1057, var5, class242.field3132, var4, 5) * 12;
        int var9 = var6 + 8;
        if (this.field8497.field4319) {
            class386.field4930.method438(var4, var9, this.field8497.field4323 + var4 - 1, var9, this.field8497.field4325, 0);
        }
        var6 = var9 + 1;
        int var7 = var6 + this.method3444(0, var3.field1058, var6, class242.field3132, var4, 5) * 12;
        int var10 = var7 + 5;
        int var10000 = var10 + this.method3444(0, var3.field1053, var10, class242.field3132, var4, 5) * 12;
    }

    @OriginalMember(owner = "client!jaa", name = "b", descriptor = "(I)Z")
    public final boolean method369(int arg0) {
        field8502++;
        if (arg0 != 11107) {
            this.method366(80);
        }
        return this.field8501.method3601(true);
    }

    @OriginalMember(owner = "client!jaa", name = "<init>", descriptor = "(Lwda;Ljg;)V")
    public class616(class640 arg0, class342 arg1) {
        this.field8501 = arg0;
        this.field8497 = arg1;
    }
}
