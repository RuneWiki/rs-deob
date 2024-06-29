import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nq")
public class class306 extends class404 {

    @OriginalMember(owner = "client!nq", name = "z", descriptor = "I")
    public static int field4634 = -1;

    @OriginalMember(owner = "client!nq", name = "B", descriptor = "Z")
    public static boolean field4636 = false;

    @OriginalMember(owner = "client!nq", name = "D", descriptor = "Lmu;")
    public static class188 field4638 = new class188();

    @OriginalMember(owner = "client!nq", name = "G", descriptor = "Lhi;")
    public static class131 field4641 = new class131(7, 0, 1, 1);

    @OriginalMember(owner = "client!nq", name = "H", descriptor = "[I")
    public static int[] field4642 = new int[13];

    @OriginalMember(owner = "client!nq", name = "I", descriptor = "Loe;")
    public static class127 field4643 = new class127(13, 3);

    @OriginalMember(owner = "client!nq", name = "A", descriptor = "I")
    public static int field4635;

    @OriginalMember(owner = "client!nq", name = "C", descriptor = "I")
    public static int field4637;

    @OriginalMember(owner = "client!nq", name = "E", descriptor = "I")
    public static int field4639;

    @OriginalMember(owner = "client!nq", name = "F", descriptor = "I")
    public static int field4640;

    @OriginalMember(owner = "client!nq", name = "J", descriptor = "J")
    public static long field4644;

    // $FF: synthetic field
    @OriginalMember(owner = "client!nq", name = "K", descriptor = "Ljava/lang/Class;")
    public static Class field4645;

    @OriginalMember(owner = "client!nq", name = "<init>", descriptor = "()V")
    public class306() {
        super(0, true);
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(B)V")
    public static void method1836(byte arg0) {
        field4641 = null;
        field4642 = null;
        if (arg0 != -77) {
            method1837(60);
        }
        field4643 = null;
        field4638 = null;
    }

    @OriginalMember(owner = "client!nq", name = "h", descriptor = "(I)V")
    public static final void method1837(int arg0) {
        if (arg0 == 1) {
            try {
                Method var1 = (field4645 != null ? field4645 : (field4645 = method1839("java.lang.Runtime"))).getMethod("availableProcessors");
                if (var1 != null) {
                    try {
                        Runtime var2 = Runtime.getRuntime();
                        Integer var3 = (Integer) var1.invoke(var2, (Object[]) null);
                        class463.field7117 = var3;
                    } catch (Throwable var4) {
                    }
                }
            } catch (Exception var5) {
            }
            ++field4639;
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(II)[I")
    public final int[] method90(int arg0, int arg1) {
        ++field4640;
        int[] var3 = super.field5870.method372(arg1, (byte) -22);
        if (arg0 >= -47) {
            this.method90(-58, -48);
        }
        if (super.field5870.field810) {
            class356.method2179(var3, 0, class431.field6348, class289.field4381[arg1]);
        }
        return var3;
    }

    @OriginalMember(owner = "client!nq", name = "b", descriptor = "(III)Z")
    public static final boolean method1838(int arg0, int arg1, int arg2) {
        ++field4635;
        if (arg1 != 0) {
            field4642 = null;
        }
        if (!(~(65536 & arg0) != -1 | class264.method1609(876, arg0, arg2)) && !class295.method1791(arg2, 0, arg0)) {
            return ~(55 & arg2) == -1 && class78.method567(arg0, (byte) -106, arg2);
        } else {
            return true;
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1839(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
