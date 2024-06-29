import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class639 {

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "I")
    private int field8593 = -1;

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "Z")
    private boolean field8592 = false;

    @OriginalMember(owner = "client!qf", name = "n", descriptor = "[Ljava/lang/String;")
    private String[] field8603 = new String[0];

    @OriginalMember(owner = "client!qf", name = "m", descriptor = "I")
    private int field8602;

    @OriginalMember(owner = "client!qf", name = "h", descriptor = "I")
    public static int field8597 = 0;

    @OriginalMember(owner = "client!qf", name = "g", descriptor = "Lcu;")
    public static class206 field8596 = new class206(13, 8);

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "I")
    public static int field8590;

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "I")
    public static int field8591;

    @OriginalMember(owner = "client!qf", name = "e", descriptor = "I")
    public static int field8594;

    @OriginalMember(owner = "client!qf", name = "f", descriptor = "I")
    public static int field8595;

    @OriginalMember(owner = "client!qf", name = "i", descriptor = "I")
    public static int field8598;

    @OriginalMember(owner = "client!qf", name = "j", descriptor = "I")
    public static int field8599;

    @OriginalMember(owner = "client!qf", name = "k", descriptor = "I")
    public static int field8600;

    @OriginalMember(owner = "client!qf", name = "l", descriptor = "I")
    public static int field8601;

    @OriginalMember(owner = "client!qf", name = "o", descriptor = "Lds;")
    public static class14 field8604;

    // $FF: synthetic field
    @OriginalMember(owner = "client!qf", name = "p", descriptor = "Ljava/lang/Class;")
    public static Class field8605;

    // $FF: synthetic method
    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method3530(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Z)V", line = 4)
    public static final void method3522(boolean arg0) {
        if (!arg0) {
            return;
        }
        try {
            Method var1 = (field8605 == null ? (field8605 = method3530("java.lang.Runtime")) : field8605).getMethod("availableProcessors");
            if (var1 != null) {
                try {
                    Runtime var2 = Runtime.getRuntime();
                    Integer var3 = (Integer) var1.invoke(var2, (Object[]) null);
                    class242.field3380 = var3;
                } catch (Throwable var4) {
                }
            }
        } catch (Exception var5) {
        }
        field8600++;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(BLjava/lang/String;I)V", line = 32)
    private final void method3523(byte arg0, String arg1, int arg2) {
        field8598++;
        if (this.field8593 < arg2) {
            this.field8593 = arg2;
        }
        if (this.field8603.length <= arg2) {
            this.method3524(arg2, arg0 ^ 0xFFFFFF8F);
        }
        this.field8603[arg2] = arg1;
        if (arg0 != -113) {
            this.method3528(-127, -29);
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(II)V", line = 51)
    private final void method3524(int arg0, int arg1) {
        field8590++;
        String[] var3 = new String[this.method3528(1, arg0)];
        class83.method685(this.field8603, 0, var3, arg1, this.field8603.length);
        this.field8603 = var3;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(BLoa;)V", line = 69)
    public static final void method3525(byte arg0, class651 arg1) {
        int var2 = -40 / ((78 - arg0) / 43);
        if (class388.field5142) {
            class683.method3806(-58, arg1);
        } else {
            class232.method1451(102, arg1);
        }
        field8599++;
    }

    @OriginalMember(owner = "client!qf", name = "<init>", descriptor = "(IZ)V", line = 200)
    public class639(int arg0, boolean arg1) {
        this.field8592 = arg1;
        this.field8602 = arg0;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(I)[Ljava/lang/String;", line = 90)
    public final String[] method3526(int arg0) {
        field8594++;
        if (arg0 >= -74) {
            return null;
        } else {
            String[] var2 = new String[this.field8593 + 1];
            class83.method685(this.field8603, 0, var2, 0, this.field8593 + 1);
            return var2;
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 107)
    public final void method3527(String arg0, int arg1) {
        this.method3523((byte) -113, arg0, this.field8593 + 1);
        if (arg1 < 84) {
            this.field8592 = false;
        }
        field8595++;
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(II)I", line = 120)
    private final int method3528(int arg0, int arg1) {
        if (arg0 != 1) {
            return 125;
        }
        field8591++;
        int var3 = this.field8603.length;
        while (arg1 >= var3) {
            if (!this.field8592) {
                var3 += this.field8602;
            } else if (var3 == 0) {
                var3 = 1;
            } else {
                var3 = this.field8602 * var3;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qf", name = "toString", descriptor = "()Ljava/lang/String;", line = 150)
    public final String toString() {
        field8601++;
        StringBuffer var1 = new StringBuffer();
        var1.append("[");
        for (int var2 = 0; var2 < this.field8593; var2++) {
            if (var2 != 0) {
                var1.append(", ");
            }
            var1.append(this.field8603[var2]);
        }
        var1.append("]");
        return var1.toString();
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(Z)V", line = 186)
    public static void method3529(boolean arg0) {
        field8596 = null;
        field8604 = null;
        if (!arg0) {
            field8604 = null;
        }
    }
}
