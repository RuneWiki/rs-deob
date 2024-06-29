import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class138 implements class104 {

    @OriginalMember(owner = "client!ib", name = "e", descriptor = "Lmaa;")
    private class435 field1956;

    @OriginalMember(owner = "client!ib", name = "k", descriptor = "Lkp;")
    private class452 field1962;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "I")
    public static int field1952;

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "I")
    public static int field1955;

    @OriginalMember(owner = "client!ib", name = "f", descriptor = "I")
    public static int field1957;

    @OriginalMember(owner = "client!ib", name = "g", descriptor = "I")
    public static int field1958;

    @OriginalMember(owner = "client!ib", name = "h", descriptor = "I")
    public static int field1959;

    @OriginalMember(owner = "client!ib", name = "i", descriptor = "I")
    public static int field1960;

    @OriginalMember(owner = "client!ib", name = "j", descriptor = "I")
    public static int field1961;

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "Lov;")
    public static class171 field1954;

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "Lwca;")
    public static class630 field1953;

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(B)V")
    public static void method963(byte arg0) {
        field1953 = null;
        if (arg0 != -71) {
            method966((byte) -95, null, null);
        }
        field1954 = null;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(I)V")
    public final void method476(int arg0) {
        field1960++;
        if (arg0 != -12935) {
            this.field1956 = null;
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Z)V")
    public static final void method964(boolean arg0) {
        field1958++;
        int var1 = class528.field7160;
        int[] var2 = class439.field6091;
        if (arg0) {
            field1954 = null;
        }
        for (int var3 = 0; var3 < var1; var3++) {
            class677 var9 = class671.field9407[var2[var3]];
            if (var9 != null && var9.field1755 > 0) {
                var9.field1755--;
                if (var9.field1755 == 0) {
                    var9.field1709 = null;
                }
            }
        }
        for (int var4 = 0; var4 < class698.field9912; var4++) {
            long var5 = (long) class636.field8790[var4];
            class393 var7 = (class393) class299.field4071.method970((byte) 89, var5);
            if (var7 != null) {
                class61 var8 = var7.field5552;
                if (var8.field1755 > 0) {
                    var8.field1755--;
                    if (var8.field1755 == 0) {
                        var8.field1709 = null;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lla;ILjava/lang/String;IBI)I")
    private final int method965(class417 arg0, int arg1, String arg2, int arg3, byte arg4, int arg5) {
        if (arg4 >= -69) {
            this.method647(true, false);
        }
        field1957++;
        return arg0.method2427(0, 0, null, 0, arg3 + arg5, 0, null, this.field1962.field6225, 0, arg1 + arg3, -(arg3 * 2) + this.field1962.field6223, (byte) 108, this.field1962.field6231, this.field1962.field6234 - (arg3 * 2), arg2, null);
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(B)Z")
    public final boolean method475(byte arg0) {
        if (arg0 != -90) {
            method963((byte) -8);
        }
        field1955++;
        return this.field1956.method2491(-128);
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(BLlj;[Ln;)Lwba;")
    public static final class46 method966(byte arg0, class565 arg1, class17[] arg2) {
        field1961++;
        for (int var3 = 0; var3 < arg2.length; var3++) {
            if (arg2[var3] == null || arg2[var3].field173 <= 0L) {
                return null;
            }
        }
        long var4 = OpenGL.glCreateProgramObjectARB();
        int var6 = 0;
        if (arg0 != -66) {
            return null;
        }
        while (var6 < arg2.length) {
            OpenGL.glAttachObjectARB(var4, arg2[var6].field173);
            var6++;
        }
        OpenGL.glLinkProgramARB(var4);
        OpenGL.glGetObjectParameterivARB(var4, 35714, class227.field3160, 0);
        if (class227.field3160[0] == 0) {
            if (class227.field3160[0] == 0) {
                System.out.println("Shader linking failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class227.field3160, 1);
            if (class227.field3160[1] > 1) {
                byte[] var7 = new byte[class227.field3160[1]];
                OpenGL.glGetInfoLogARB(var4, class227.field3160[1], class227.field3160, 0, var7, 0);
                System.out.println(new String(var7));
            }
            if (class227.field3160[0] == 0) {
                for (int var8 = 0; var8 < arg2.length; var8++) {
                    OpenGL.glDetachObjectARB(var4, arg2[var8].field173);
                }
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class46(arg1, var4, arg2);
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(ZZ)V")
    public final void method647(boolean arg0, boolean arg1) {
        field1952++;
        if (!arg1) {
            this.method475((byte) -22);
        }
        class98 var3 = this.field1956.method2493(this.field1962.field6224, -31144);
        if (var3 == null) {
            return;
        }
        int var4 = this.field1962.field6227.method3361((byte) -116, this.field1962.field6223, class178.field2581) + this.field1962.field6232;
        int var5 = this.field1962.field6226.method59(1, this.field1962.field6234, class157.field2277) + this.field1962.field6230;
        if (this.field1962.field6229) {
            class334.field4506.method190(var4, var5, this.field1962.field6223, this.field1962.field6234, this.field1962.field6228, 0);
        }
        int var6 = var5 + this.method965(class428.field5986, var4, var3.field1380, 5, (byte) -104, var5) * 12;
        int var9 = var6 + 8;
        if (this.field1962.field6229) {
            class334.field4506.method113(var4, var9, this.field1962.field6223 + var4 - 1, var9, this.field1962.field6228, 0);
        }
        var6 = var9 + 1;
        int var7 = var6 + this.method965(class428.field5986, var4, var3.field1382, 5, (byte) -77, var6) * 12;
        int var10 = var7 + 5;
        int var10000 = var10 + this.method965(class428.field5986, var4, var3.field1379, 5, (byte) -92, var10) * 12;
    }

    @OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(Lmaa;Lkp;)V")
    public class138(class435 arg0, class452 arg1) {
        this.field1956 = arg0;
        this.field1962 = arg1;
    }
}
