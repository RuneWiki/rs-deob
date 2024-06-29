import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class441 {

    @OriginalMember(owner = "client!cb", name = "j", descriptor = "B")
    private byte field6091;

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "I")
    public int field6086;

    @OriginalMember(owner = "client!cb", name = "g", descriptor = "I")
    public int field6088;

    @OriginalMember(owner = "client!cb", name = "k", descriptor = "I")
    public int field6092;

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "I")
    public int field6083;

    @OriginalMember(owner = "client!cb", name = "i", descriptor = "I")
    public int field6090;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "I")
    public static int field6082;

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "I")
    public static int field6084;

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "I")
    public static int field6085;

    @OriginalMember(owner = "client!cb", name = "f", descriptor = "I")
    public static int field6087;

    @OriginalMember(owner = "client!cb", name = "l", descriptor = "I")
    public static int field6093;

    @OriginalMember(owner = "client!cb", name = "h", descriptor = "Loba;")
    public static class218 field6089;

    // $FF: synthetic field
    @OriginalMember(owner = "client!cb", name = "m", descriptor = "Ljava/lang/Class;")
    public static Class field6094;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)V")
    public static final void method2584(int arg0) {
        field6093++;
        class459.field6326 = new class509[class267.field3487.method2565((byte) 120)][];
        class543.field7960 = new class509[class267.field3487.method2565((byte) 6)][];
        class565.field8292 = new boolean[class267.field3487.method2565((byte) 91)];
        if (arg0 != -9) {
            method2589(-101);
        }
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(I)V")
    public static void method2585(int arg0) {
        if (arg0 != -1) {
            field6089 = null;
        }
        field6089 = null;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(JB)V")
    public static final void method2586(long arg0, byte arg1) {
        field6082++;
        int var3 = class308.field3926 + class103.field1265.field8661;
        if (arg1 != -26) {
            field6089 = null;
        }
        int var4 = class466.field6524 + class103.field1265.field8652;
        if ((class485.field6788 - var3) < -500 || class485.field6788 - var3 > 500 || class381.field5051 - var4 < -500 || class381.field5051 - var4 > 500) {
            class485.field6788 = var3;
            class381.field5051 = var4;
        }
        if (class485.field6788 != var3) {
            int var5 = var3 - class485.field6788;
            int var6 = (int) ((long) var5 * arg0 / 320L);
            if (var5 <= 0) {
                if (var6 == 0) {
                    var6 = -1;
                } else if (var6 < var5) {
                    var6 = var5;
                }
            } else if (var6 == 0) {
                var6 = 1;
            } else if (var6 > var5) {
                var6 = var5;
            }
            class485.field6788 += var6;
        }
        if (class381.field5051 != var4) {
            int var7 = var4 - class381.field5051;
            int var8 = (int) ((long) var7 * arg0 / 320L);
            if (var7 > 0) {
                if (var8 == 0) {
                    var8 = 1;
                } else if (var8 > var7) {
                    var8 = var7;
                }
            } else if (var8 == 0) {
                var8 = -1;
            } else if (var8 < var7) {
                var8 = var7;
            }
            class381.field5051 += var8;
        }
        if (!class565.field8299.field2184) {
            class588.field8527 += (float) arg0 * class237.field2969 / 6.0F;
            class558.field8223 += (float) arg0 * class289.field3759 / 6.0F;
        }
        class443.method2596(-7325);
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(B)I")
    public final int method2587(byte arg0) {
        field6087++;
        if (arg0 == -116) {
            return (this.field6091 & 0x8) == 8 ? 1 : 0;
        } else {
            return -111;
        }
    }

    @OriginalMember(owner = "client!cb", name = "<init>", descriptor = "()V")
    public class441() {
    }

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "(I)I")
    public final int method2588(int arg0) {
        field6085++;
        if (arg0 != 1) {
            this.field6088 = 110;
        }
        return this.field6091 & 0x7;
    }

    @OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(Los;)V")
    public class441(class374 arg0) {
        this.field6091 = arg0.method2124(44);
        this.field6086 = arg0.method2136(false);
        this.field6088 = arg0.method2123(false);
        this.field6092 = arg0.method2123(false);
        this.field6083 = arg0.method2123(false);
        this.field6090 = arg0.method2123(false);
    }

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "(I)V")
    public static final void method2589(int arg0) {
        if (class165.field2028 == 2) {
            class252.field3258 = 96;
        } else {
            try {
                Method var1 = (field6094 == null ? (field6094 = method2590("java.lang.Runtime")) : field6094).getMethod("maxMemory");
                if (var1 != null) {
                    try {
                        Runtime var2 = Runtime.getRuntime();
                        Long var3 = (Long) var1.invoke(var2, (Object[]) null);
                        class252.field3258 = (int) (var3 / 1048576L) + 1;
                    } catch (Throwable var4) {
                    }
                }
            } catch (Exception var5) {
            }
        }
        if (arg0 != 0) {
            field6089 = null;
        }
        field6084++;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2590(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
