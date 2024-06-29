import jaggl.OpenGL;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fr")
public class class601 extends class163 implements class228 {

    @OriginalMember(owner = "client!fr", name = "y", descriptor = "I")
    private int field8526;

    @OriginalMember(owner = "client!fr", name = "w", descriptor = "I")
    private int field8524;

    @OriginalMember(owner = "client!fr", name = "x", descriptor = "I")
    private int field8525;

    @OriginalMember(owner = "client!fr", name = "u", descriptor = "Ljava/util/Hashtable;")
    public static Hashtable field8522 = new Hashtable();

    @OriginalMember(owner = "client!fr", name = "A", descriptor = "Luaa;")
    public static class395 field8528 = new class395(8);

    @OriginalMember(owner = "client!fr", name = "B", descriptor = "I")
    public static int field8529;

    @OriginalMember(owner = "client!fr", name = "v", descriptor = "I")
    public static int field8523;

    @OriginalMember(owner = "client!fr", name = "z", descriptor = "I")
    public static int field8527;

    static {
        new class567("Invalid name", "Unzulässiger Name!", "Nom incorrect", "Nome inválido");
        field8529 = 0;
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(IIIIIII)V", line = 6)
    public static final void method3412(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class314 var7 = new class314();
        var7.field4588 = arg1 >> class162.field2401;
        var7.field4592 = arg2 >> class162.field2401;
        var7.field4587 = arg3 >> class162.field2401;
        var7.field4581 = arg4 >> class162.field2401;
        var7.field4572 = arg0;
        var7.field4574 = arg1;
        var7.field4580 = arg2;
        var7.field4578 = arg3;
        var7.field4575 = arg4;
        var7.field4582 = arg5;
        var7.field4583 = arg6;
        class350.field5012[class546.field7593++] = var7;
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(IIB)Lcn;", line = 22)
    public static final class21 method3413(int arg0, int arg1, byte arg2) {
        if (arg2 <= 67) {
            return null;
        } else {
            ++field8527;
            class21 var3 = (class21) class188.field2712.method740(0, (long) arg0 | (long) arg1 << 32);
            if (var3 == null) {
                var3 = new class21(arg1, arg0);
                class188.field2712.method737(var3.field1798, (byte) 92, var3);
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(Z)V", line = 44)
    public static void method3414(boolean arg0) {
        field8528 = null;
        field8522 = null;
        if (!arg0) {
            field8522 = null;
        }
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/String;", line = 64)
    public static final String method3415(boolean arg0, String arg1) {
        ++field8523;
        int var2 = arg1.length();
        int var3 = 0;
        if (!arg0) {
            method3414(true);
        }
        for (int var4 = 0; var2 > var4; ++var4) {
            char var8 = arg1.charAt(var4);
            if (~var8 == -61 || ~var8 == -63) {
                var3 += 3;
            }
        }
        StringBuffer var5 = new StringBuffer(var2 + var3);
        for (int var6 = 0; var2 > var6; ++var6) {
            char var7 = arg1.charAt(var6);
            if (~var7 != -61) {
                if (~var7 != -63) {
                    var5.append(var7);
                } else {
                    var5.append("<gt>");
                }
            } else {
                var5.append("<lt>");
            }
        }
        return var5.toString();
    }

    @OriginalMember(owner = "client!fr", name = "<init>", descriptor = "(Llh;Lkl;III[B)V", line = 113)
    public class601(class125 arg0, class468 arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        super(arg0, 32879, arg1, class343.field4922, arg2 * arg3 * arg4, false);
        this.field8526 = arg2;
        this.field8524 = arg3;
        this.field8525 = arg4;
        super.field2405.method3577(this, true);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage3Dub(super.field2418, 0, this.method1140((byte) 127), this.field8526, this.field8524, this.field8525, 0, class387.method2348(super.field2417, (byte) -121), 5121, arg5, 0);
        OpenGL.glPixelStorei(3317, 4);
    }
}
