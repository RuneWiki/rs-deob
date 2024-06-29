import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vu")
public class class677 {

    @OriginalMember(owner = "client!vu", name = "k", descriptor = "Llh;")
    public class205 field9552 = new class205();

    @OriginalMember(owner = "client!vu", name = "h", descriptor = "Ltm;")
    public static class334 field9549 = new class334(30, 6);

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "I")
    public static int field9542;

    @OriginalMember(owner = "client!vu", name = "b", descriptor = "I")
    public static int field9543;

    @OriginalMember(owner = "client!vu", name = "c", descriptor = "I")
    public static int field9544;

    @OriginalMember(owner = "client!vu", name = "d", descriptor = "I")
    public static int field9545;

    @OriginalMember(owner = "client!vu", name = "e", descriptor = "I")
    public static int field9546;

    @OriginalMember(owner = "client!vu", name = "f", descriptor = "I")
    public static int field9547;

    @OriginalMember(owner = "client!vu", name = "g", descriptor = "I")
    public static int field9548;

    @OriginalMember(owner = "client!vu", name = "i", descriptor = "I")
    public static int field9550;

    @OriginalMember(owner = "client!vu", name = "j", descriptor = "I")
    public static int field9551;

    @OriginalMember(owner = "client!vu", name = "l", descriptor = "I")
    public static int field9553;

    @OriginalMember(owner = "client!vu", name = "n", descriptor = "I")
    public static int field9555;

    @OriginalMember(owner = "client!vu", name = "o", descriptor = "I")
    public static int field9556;

    @OriginalMember(owner = "client!vu", name = "m", descriptor = "Llh;")
    private class205 field9554;

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(I)Lle;")
    public static final class736 method3770(int arg0) {
        field9550++;
        int var1 = 56 % ((-arg0 - 26) / 58);
        try {
            return (class736) Class.forName("on").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return null;
        }
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(IB)I")
    public static final int method3771(int arg0, byte arg1) {
        if (arg1 < 41) {
            method3776((byte) 108);
        }
        field9556++;
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(Z)Llh;")
    public final class205 method3772(boolean arg0) {
        field9546++;
        class205 var2 = this.field9552.field3449;
        if (this.field9552 == var2) {
            this.field9554 = null;
            return null;
        }
        this.field9554 = var2.field3449;
        if (!arg0) {
            this.method3780(-7);
        }
        return var2;
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(B)V")
    public final void method3773(byte arg0) {
        field9548++;
        while (true) {
            class205 var2 = this.field9552.field3449;
            if (this.field9552 == var2) {
                this.field9554 = null;
                int var3 = 79 % ((1 - arg0) / 32);
                return;
            }
            var2.method1507(1);
        }
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(Lom;I[BB)Lkea;")
    public static final class74 method3774(class642 arg0, int arg1, byte[] arg2, byte arg3) {
        field9551++;
        if (arg2 == null || arg2.length == 0) {
            return null;
        }
        long var4 = OpenGL.glCreateShaderObjectARB(arg1);
        OpenGL.glShaderSourceRawARB(var4, arg2);
        OpenGL.glCompileShaderARB(var4);
        OpenGL.glGetObjectParameterivARB(var4, 35713, class99.field1470, 0);
        if (arg3 <= 10) {
            field9549 = null;
        }
        if (class99.field1470[0] == 0) {
            if (class99.field1470[0] == 0) {
                System.out.println("Shader compile failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class99.field1470, 1);
            if (class99.field1470[1] > 1) {
                byte[] var6 = new byte[class99.field1470[1]];
                OpenGL.glGetInfoLogARB(var4, class99.field1470[1], class99.field1470, 0, var6, 0);
                System.out.println(new String(var6));
            }
            if (class99.field1470[0] == 0) {
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class74(arg0, var4, arg1);
    }

    @OriginalMember(owner = "client!vu", name = "b", descriptor = "(I)Llh;")
    public final class205 method3775(int arg0) {
        field9553++;
        class205 var2 = this.field9552.field3449;
        if (arg0 != 30) {
            this.method3779(-3, null);
        }
        if (this.field9552 == var2) {
            return null;
        } else {
            var2.method1507(arg0 ^ 0x1F);
            return var2;
        }
    }

    @OriginalMember(owner = "client!vu", name = "b", descriptor = "(B)V")
    public static void method3776(byte arg0) {
        int var1 = -42 / ((arg0 + 36) / 59);
        field9549 = null;
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(ILrf;)V")
    public static final void method3777(int arg0, class750 arg1) {
        field9547++;
        arg1.field10451 = null;
        if (arg0 > class505.field7369) {
            class258.field4046.method3266(arg1, true);
            class505.field7369++;
        }
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(Ljava/lang/String;CLjava/lang/String;I)Ljava/lang/String;")
    public static final String method3778(String arg0, char arg1, String arg2, int arg3) {
        field9543++;
        int var4 = arg2.length();
        int var5 = arg0.length();
        int var6 = var4;
        int var7 = var5 - 1;
        if (var7 != 0) {
            int var8 = 0;
            while (true) {
                var8 = arg2.indexOf(arg1, var8);
                if (var8 < 0) {
                    break;
                }
                var8++;
                var6 += var7;
            }
        }
        StringBuffer var9 = new StringBuffer(var6);
        int var10 = arg3;
        while (true) {
            int var11 = arg2.indexOf(arg1, var10);
            if (var11 < 0) {
                var9.append(arg2.substring(var10));
                return var9.toString();
            }
            var9.append(arg2.substring(var10, var11));
            var10 = var11 + 1;
            var9.append(arg0);
        }
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(ILlh;)V")
    public final void method3779(int arg0, class205 arg1) {
        field9555++;
        if (arg1.field3450 != null) {
            arg1.method1507(arg0 ^ 0xFFFFC90D);
        }
        arg1.field3450 = this.field9552.field3450;
        arg1.field3449 = this.field9552;
        arg1.field3450.field3449 = arg1;
        arg1.field3449.field3450 = arg1;
        if (arg0 != -14068) {
            this.field9552 = null;
        }
    }

    @OriginalMember(owner = "client!vu", name = "c", descriptor = "(I)Llh;")
    public final class205 method3780(int arg0) {
        field9545++;
        class205 var2 = this.field9554;
        if (this.field9552 == var2) {
            this.field9554 = null;
            return null;
        }
        this.field9554 = var2.field3449;
        if (arg0 != 23774) {
            method3770(-84);
        }
        return var2;
    }

    @OriginalMember(owner = "client!vu", name = "d", descriptor = "(I)I")
    public final int method3781(int arg0) {
        field9544++;
        int var2 = arg0;
        for (class205 var3 = this.field9552.field3449; var3 != this.field9552; var3 = var3.field3449) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!vu", name = "<init>", descriptor = "()V")
    public class677() {
        this.field9552.field3449 = this.field9552;
        this.field9552.field3450 = this.field9552;
    }
}
