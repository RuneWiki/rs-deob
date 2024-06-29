import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eu")
public class class481 extends class38 {

    @OriginalMember(owner = "client!eu", name = "F", descriptor = "I")
    private int field6962;

    @OriginalMember(owner = "client!eu", name = "H", descriptor = "I")
    public static int field6964 = -1;

    @OriginalMember(owner = "client!eu", name = "D", descriptor = "I")
    public static int field6960;

    @OriginalMember(owner = "client!eu", name = "E", descriptor = "I")
    public static int field6961;

    @OriginalMember(owner = "client!eu", name = "G", descriptor = "I")
    public static int field6963;

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(IILrg;)V")
    public final void method190(int arg0, int arg1, class645 arg2) {
        ++field6963;
        if (arg0 >= 34) {
            if (arg1 == 0) {
                this.field6962 = (arg2.method3745(-6314) << 12) / 255;
            }
        }
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(BI)[I")
    public final int[] method199(byte arg0, int arg1) {
        ++field6961;
        if (arg0 >= -43) {
            method2888((String) null, (String) null, -71);
        }
        int[] var3 = super.field397.method1376(arg1, (byte) 111);
        if (super.field397.field3005) {
            class319.method2021(var3, 0, class729.field10216, this.field6962);
        }
        return var3;
    }

    @OriginalMember(owner = "client!eu", name = "<init>", descriptor = "(I)V")
    public class481(int arg0) {
        super(0, true);
        this.field6962 = 4096;
        this.field6962 = arg0;
    }

    @OriginalMember(owner = "client!eu", name = "<init>", descriptor = "()V")
    public class481() {
        this(4096);
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)V")
    public static final void method2888(String arg0, String arg1, int arg2) {
        ++field6960;
        int var3 = 43 % ((arg2 - 3) / 55);
        class92.field1284 = -1;
        class654.field9174 = 1;
        class112.method836(arg1, false, 0, arg0);
    }
}
