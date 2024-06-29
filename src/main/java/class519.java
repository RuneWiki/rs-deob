import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cv")
public class class519 extends class270 {

    @OriginalMember(owner = "client!cv", name = "E", descriptor = "I")
    public static int field7418 = 0;

    @OriginalMember(owner = "client!cv", name = "H", descriptor = "F")
    public static float field7421;

    @OriginalMember(owner = "client!cv", name = "m", descriptor = "I")
    public int field7401;

    @OriginalMember(owner = "client!cv", name = "n", descriptor = "I")
    public int field7402;

    @OriginalMember(owner = "client!cv", name = "o", descriptor = "I")
    public int field7403;

    @OriginalMember(owner = "client!cv", name = "p", descriptor = "I")
    public int field7404;

    @OriginalMember(owner = "client!cv", name = "q", descriptor = "I")
    public int field7405;

    @OriginalMember(owner = "client!cv", name = "r", descriptor = "I")
    public static int field7406;

    @OriginalMember(owner = "client!cv", name = "s", descriptor = "I")
    public static int field7407;

    @OriginalMember(owner = "client!cv", name = "t", descriptor = "I")
    public int field7408;

    @OriginalMember(owner = "client!cv", name = "u", descriptor = "I")
    public int field7409;

    @OriginalMember(owner = "client!cv", name = "v", descriptor = "I")
    public static int field7410;

    @OriginalMember(owner = "client!cv", name = "w", descriptor = "I")
    public int field7411;

    @OriginalMember(owner = "client!cv", name = "x", descriptor = "I")
    public int field7412;

    @OriginalMember(owner = "client!cv", name = "y", descriptor = "I")
    public static int field7413;

    @OriginalMember(owner = "client!cv", name = "z", descriptor = "I")
    public int field7414;

    @OriginalMember(owner = "client!cv", name = "A", descriptor = "I")
    public int field7415;

    @OriginalMember(owner = "client!cv", name = "C", descriptor = "I")
    public int field7416;

    @OriginalMember(owner = "client!cv", name = "D", descriptor = "I")
    public int field7417;

    @OriginalMember(owner = "client!cv", name = "F", descriptor = "I")
    public int field7419;

    @OriginalMember(owner = "client!cv", name = "G", descriptor = "I")
    public static int field7420;

    @OriginalMember(owner = "client!cv", name = "I", descriptor = "I")
    public int field7422;

    // $FF: synthetic field
    @OriginalMember(owner = "client!cv", name = "J", descriptor = "Ljava/lang/Class;")
    public static Class field7423;

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "([Ljava/lang/Object;[II)V")
    public static final void method2957(Object[] arg0, int[] arg1, int arg2) {
        class372.method2037(arg1, arg0, true, arg1.length - arg2, 0);
        field7410++;
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(ZLoa;I)Lba;")
    public final class350 method2958(boolean arg0, class635 arg1, int arg2) {
        field7406++;
        if (!arg0) {
            this.field7417 = -13;
        }
        int var4 = class393.field5238[this.field7408];
        class350 var5 = null;
        if (var4 == 0) {
            class244 var12 = class480.method2801(this.field7416, this.field7419, this.field7404);
            if (var12 instanceof class107) {
                class107 var13 = (class107) var12;
                if (var13.field1243 != null) {
                    var5 = ((class670) var13.field1243).method455(arg2, -89, arg1);
                }
            }
        } else if (var4 == 1) {
            class599 var10 = class248.method1430(this.field7416, this.field7419, this.field7404);
            if (var10 instanceof class567) {
                class567 var11 = (class567) var10;
                if (var11.field8037 != null) {
                    var5 = ((class670) var11.field8037).method455(arg2, -65, arg1);
                }
            }
        } else if (var4 == 2) {
            class354 var6 = class396.method2163(this.field7416, this.field7419, this.field7404, field7423 == null ? (field7423 = method2961("ql")) : field7423);
            if (var6 instanceof class557) {
                class557 var7 = (class557) var6;
                if (var7.field7955 != null) {
                    var5 = ((class670) var7.field7955).method455(arg2, -56, arg1);
                }
            }
        } else if (var4 == 3) {
            class344 var8 = class606.method3380(this.field7416, this.field7419, this.field7404);
            if (var8 instanceof class68) {
                class68 var9 = (class68) var8;
                if (var9.field736 != null) {
                    var5 = ((class670) var9.field736).method455(arg2, -104, arg1);
                }
            }
        }
        return var5 == null ? null : var5.method602((byte) 0, arg2, true);
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(BLjava/lang/String;)V")
    public static final void method2959(byte arg0, String arg1) {
        field7420++;
        if (arg1.equals("")) {
            return;
        }
        class318.field4121++;
        class480.method2802(class194.field2334, 16751);
        class334.field4314.method2525(class265.method1504(arg1, (byte) 88), -81849);
        if (arg0 != -66) {
            field7421 = 0.7719738F;
        }
        class334.field4314.method2573(arg1, 16746);
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(Ljava/io/File;II[B)V")
    public static final void method2960(File arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field7407++;
        if (arg2 >= -110) {
            return;
        }
        DataInputStream var4 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));
        try {
            var4.readFully(arg3, 0, arg1);
        } catch (EOFException var5) {
        }
        var4.close();
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2961(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
