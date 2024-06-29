import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class306 {

    @OriginalMember(owner = "client!ti", name = "e", descriptor = "I")
    public int field3907;

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "Lug;")
    private class395 field3904;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "I")
    public static int field3903 = 0;

    @OriginalMember(owner = "client!ti", name = "c", descriptor = "I")
    public static int field3905 = 0;

    @OriginalMember(owner = "client!ti", name = "d", descriptor = "I")
    public static int field3906;

    @OriginalMember(owner = "client!ti", name = "f", descriptor = "I")
    public static int field3908;

    @OriginalMember(owner = "client!ti", name = "g", descriptor = "I")
    public static int field3909;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 9)
    public static final void method1794(String arg0, int arg1) {
        if (class99.field1199 == null) {
            class69.method610((byte) -128);
        }
        if (arg1 != -1) {
            method1794(null, 84);
        }
        field3906++;
        String[] var2 = class335.method1937(-92, arg0, '\n');
        for (int var3 = 0; var3 < var2.length; var3++) {
            for (int var4 = class488.field7109; var4 > 0; var4--) {
                class99.field1199[var4] = class99.field1199[var4 - 1];
            }
            class99.field1199[0] = var2[var3];
            if (class99.field1199.length - 1 > class488.field7109) {
                if (class520.field7512 > 0) {
                    class520.field7512++;
                }
                class488.field7109++;
            }
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IIIIIII)V", line = 58)
    public static final void method1795(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg4 != 5505) {
            field3903 = -73;
        }
        if (arg6 >= class147.field1870 && class237.field3019 >= arg3 && class533.field7845 <= arg1 && class289.field3694 >= arg0) {
            if (arg5 == 1) {
                class433.method2537(arg6, arg1, arg0, arg3, arg2, 12);
            } else {
                class470.method2840(arg1, 0, arg6, arg5, arg3, arg0, arg2);
            }
        } else if (arg5 == 1) {
            class34.method251(arg1, arg2, arg4 ^ 0x15EE, arg3, arg6, arg0);
        } else {
            class407.method2405(arg2, arg0, arg5, arg1, arg6, (byte) 38, arg3);
        }
        field3909++;
    }

    @OriginalMember(owner = "client!ti", name = "<init>", descriptor = "(Lug;II)V", line = 89)
    public class306(class395 arg0, int arg1, int arg2) {
        this.field3907 = arg2;
        this.field3904 = arg0;
    }

    @OriginalMember(owner = "client!ti", name = "finalize", descriptor = "()V", line = 101)
    protected final void finalize() throws Throwable {
        field3908++;
        this.field3904.method2323(this.field3907, 98);
        super.finalize();
    }
}
