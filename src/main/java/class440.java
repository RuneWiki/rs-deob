import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class440 extends class450 {

    @OriginalMember(owner = "client!af", name = "j", descriptor = "I")
    public static int field6075 = 1;

    @OriginalMember(owner = "client!af", name = "f", descriptor = "I")
    public static int field6071;

    @OriginalMember(owner = "client!af", name = "g", descriptor = "I")
    public static int field6072;

    @OriginalMember(owner = "client!af", name = "h", descriptor = "I")
    public static int field6073;

    @OriginalMember(owner = "client!af", name = "i", descriptor = "I")
    public static int field6074;

    @OriginalMember(owner = "client!af", name = "k", descriptor = "I")
    public static int field6076;

    @OriginalMember(owner = "client!af", name = "l", descriptor = "I")
    public static int field6077;

    @OriginalMember(owner = "client!af", name = "m", descriptor = "I")
    public static int field6078;

    @OriginalMember(owner = "client!af", name = "n", descriptor = "I")
    public static int field6079;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(II)I")
    public final int method75(int arg0, int arg1) {
        if (arg0 != 0) {
            return -34;
        } else {
            ++field6078;
            return 1;
        }
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(I)Lup;")
    public static final class278 method2535(int arg0) {
        ++field6073;
        class574 var1 = null;
        class278 var2 = new class278(class683.field9532, 0);
        try {
            class198 var3 = class66.field828.method1309(true, arg0, "");
            while (var3.field2987 == 0) {
                class226.method1447((byte) -124, 1L);
            }
            if (~var3.field2987 == -2) {
                var1 = (class574) var3.field2986;
                byte[] var4 = new byte[(int) var1.method3155(0)];
                int var6;
                for (int var5 = 0; var4.length > var5; var5 += var6) {
                    var6 = var1.method3156(var5, var4.length + -var5, (byte) 125, var4);
                    if (~var6 == 0) {
                        throw new IOException("EOF");
                    }
                }
                var2 = new class278(new class677(var4), class683.field9532, 0);
            }
        } catch (Exception var8) {
        }
        try {
            if (var1 != null) {
                var1.method3157(-122);
            }
        } catch (Exception var7) {
        }
        return var2;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
    public static final String method2536(String arg0, int arg1) {
        if (arg1 <= 11) {
            method2536((String) null, -41);
        }
        ++field6072;
        String var2 = null;
        int var3 = arg0.indexOf("--> ");
        if (~var3 <= -1) {
            var2 = arg0.substring(0, var3 + 4);
            arg0 = arg0.substring(var3 + 4);
        }
        if (arg0.startsWith("directlogin ")) {
            int var4 = arg0.indexOf(" ", "directlogin ".length());
            if (var4 >= 0) {
                int var5 = arg0.length();
                arg0 = arg0.substring(0, var4) + " ";
                for (int var6 = var4 - -1; var6 < var5; ++var6) {
                    arg0 = arg0 + "*";
                }
            }
        }
        return var2 == null ? arg0 : var2 + arg0;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(B)V")
    public final void method73(byte arg0) {
        if (super.field6170 < 1 || ~super.field6170 < -4) {
            super.field6170 = this.method68(false);
        }
        if (arg0 == 98) {
            ++field6074;
        }
    }

    @OriginalMember(owner = "client!af", name = "<init>", descriptor = "(ILup;)V")
    public class440(int arg0, class278 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Z)I")
    public final int method68(boolean arg0) {
        ++field6071;
        if (arg0) {
            this.method75(117, -18);
        }
        return !super.field6171.method1680(-18640).method1230(31029) ? 2 : 3;
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(Z)I")
    public final int method2537(boolean arg0) {
        ++field6079;
        if (!arg0) {
            this.method68(true);
        }
        return super.field6170;
    }

    @OriginalMember(owner = "client!af", name = "<init>", descriptor = "(Lup;)V")
    public class440(class278 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(ZI)V")
    public final void method67(boolean arg0, int arg1) {
        super.field6170 = arg1;
        ++field6077;
        if (!arg0) {
            field6076 = -115;
        }
    }
}
