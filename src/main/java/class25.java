import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!as")
public abstract class class25 extends class508 {

    @OriginalMember(owner = "client!as", name = "y", descriptor = "Lgj;")
    public class96 field381;

    @OriginalMember(owner = "client!as", name = "t", descriptor = "I")
    public int field376;

    @OriginalMember(owner = "client!as", name = "u", descriptor = "[I")
    public static int[] field377 = new int[120];

    @OriginalMember(owner = "client!as", name = "x", descriptor = "[Ldr;")
    public static class395[] field380 = new class395[14];

    @OriginalMember(owner = "client!as", name = "s", descriptor = "I")
    public static int field375;

    @OriginalMember(owner = "client!as", name = "v", descriptor = "I")
    public static int field378;

    @OriginalMember(owner = "client!as", name = "w", descriptor = "I")
    public static int field379;

    @OriginalMember(owner = "client!as", name = "z", descriptor = "I")
    public static int field382;

    // $FF: synthetic field
    @OriginalMember(owner = "client!as", name = "A", descriptor = "Ljava/lang/Class;")
    public static Class field383;

    @OriginalMember(owner = "client!as", name = "b", descriptor = "(B)V")
    public static final void method171(byte arg0) {
        try {
            if (arg0 != 92) {
                return;
            }
            Method var1 = (field383 == null ? (field383 = method177("java.lang.Runtime")) : field383).getMethod("availableProcessors");
            if (var1 != null) {
                try {
                    Runtime var2 = Runtime.getRuntime();
                    Integer var3 = (Integer) var1.invoke(var2, (Object[]) null);
                    class384.field4844 = var3;
                } catch (Throwable var4) {
                }
            }
        } catch (Exception var5) {
        }
        field378++;
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(II)Loj;")
    public static final class543 method172(int arg0, int arg1) {
        if (arg0 != 1) {
            field377 = null;
        }
        field382++;
        if (arg1 == 0) {
            if ((double) class656.field9246 == 3.0D) {
                return class159.field2060;
            }
            if ((double) class656.field9246 == 4.0D) {
                return class458.field5842;
            }
            if ((double) class656.field9246 == 6.0D) {
                return class305.field3770;
            }
            if ((double) class656.field9246 >= 8.0D) {
                return class447.field5737;
            }
        } else if (arg1 == 1) {
            if ((double) class656.field9246 == 3.0D) {
                return class305.field3770;
            }
            if ((double) class656.field9246 == 4.0D) {
                return class447.field5737;
            }
            if ((double) class656.field9246 == 6.0D) {
                return class576.field8039;
            }
            if ((double) class656.field9246 >= 8.0D) {
                return class581.field8131;
            }
        } else if (arg1 == 2) {
            if ((double) class656.field9246 == 3.0D) {
                return class576.field8039;
            }
            if ((double) class656.field9246 == 4.0D) {
                return class581.field8131;
            }
            if ((double) class656.field9246 == 6.0D) {
                return class456.field5828;
            }
            if ((double) class656.field9246 >= 8.0D) {
                return class389.field4912;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!as", name = "c", descriptor = "(B)V")
    public static void method173(byte arg0) {
        field380 = null;
        int var1 = -5 % ((-arg0 - 60) / 49);
        field377 = null;
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(I)Ljava/lang/Object;")
    public abstract Object method174(int arg0);

    @OriginalMember(owner = "client!as", name = "d", descriptor = "(B)Z")
    public abstract boolean method175(byte arg0);

    @OriginalMember(owner = "client!as", name = "<init>", descriptor = "(Lgj;I)V")
    public class25(class96 arg0, int arg1) {
        this.field381 = arg0;
        this.field376 = arg1;
    }

    @OriginalMember(owner = "client!as", name = "e", descriptor = "(B)[Lpk;")
    public static final class104[] method176(byte arg0) {
        field375++;
        if (arg0 != -105) {
            method171((byte) 94);
        }
        return new class104[] { class1.field9, class193.field2404, class468.field5946, class557.field7737, class408.field5117, class512.field6950 };
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!as", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method177(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 120; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) (Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D + (double) var2);
            var0 += var3;
            field377[var1] = var0 / 4;
        }
    }
}
