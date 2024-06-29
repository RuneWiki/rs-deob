import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class416 {

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "I")
    public static int field5326;

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "I")
    public static int field5327;

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "I")
    public static int field5328;

    @OriginalMember(owner = "client!uf", name = "d", descriptor = "I")
    public static int field5329;

    @OriginalMember(owner = "client!uf", name = "e", descriptor = "[Ljava/lang/String;")
    public static String[] field5330;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Z)V", line = 6)
    public static final void method2314(boolean arg0) {
        class324.field4031 = null;
        class395.field5029 = null;
        class381.field4886 = null;
        class386.field4953 = null;
        class227.field2934 = null;
        class345.field4442 = null;
        field5326++;
        class180.field2122 = null;
        class392.field5014 = null;
        class306.field3871 = null;
        if (arg0) {
            field5330 = null;
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(I)V", line = 32)
    public static void method2315(int arg0) {
        field5330 = null;
        if (arg0 != 6032) {
            method2314(true);
        }
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(Z)V", line = 42)
    public static final void method2316(boolean arg0) {
        field5329++;
        class580.field7774 = null;
        if (!arg0) {
            field5330 = null;
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "([BZI)Ljava/lang/Object;", line = 58)
    public static final Object method2317(byte[] arg0, boolean arg1, int arg2) {
        field5327++;
        if (arg0 == null) {
            return null;
        }
        if (~arg0.length < arg2 && !class642.field8715) {
            try {
                class29 var3 = (class29) Class.forName("caa").getDeclaredConstructor().newInstance();
                var3.method180(arg0, (byte) -124);
                return var3;
            } catch (Throwable var4) {
                class642.field8715 = true;
            }
        }
        return arg1 ? class51.method296(arg0, arg2 + 242) : arg0;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Lji;I)Lvj;", line = 87)
    public static final class410 method2318(class572 arg0, int arg1) {
        field5328++;
        class690 var2 = class555.method2957((byte) 48, arg0);
        int var3 = arg0.method3031(-1);
        if (arg1 > -114) {
            field5330 = null;
        }
        int var4 = arg0.method3031(-1);
        int var5 = arg0.method3031(-1);
        int var6 = arg0.method3031(-1);
        int var7 = arg0.method3031(-1);
        int var8 = arg0.method3031(-1);
        return new class410(var2.field9578, var2.field9576, var2.field9571, var2.field9577, var2.field9574, var2.field9572, var2.field9568, var2.field9570, var2.field9569, var3, var4, var5, var6, var7, var8);
    }
}
