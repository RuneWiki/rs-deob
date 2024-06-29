import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kca")
public class class372 extends class444 implements class212 {

    @OriginalMember(owner = "client!kca", name = "h", descriptor = "I")
    private int field5160;

    @OriginalMember(owner = "client!kca", name = "j", descriptor = "Z")
    public static boolean field5162 = false;

    @OriginalMember(owner = "client!kca", name = "e", descriptor = "Ljava/util/Hashtable;")
    public static Hashtable field5157 = new Hashtable();

    @OriginalMember(owner = "client!kca", name = "f", descriptor = "F")
    public static float field5158;

    @OriginalMember(owner = "client!kca", name = "g", descriptor = "F")
    public static float field5159;

    @OriginalMember(owner = "client!kca", name = "c", descriptor = "I")
    public static int field5155;

    @OriginalMember(owner = "client!kca", name = "d", descriptor = "I")
    public static int field5156;

    @OriginalMember(owner = "client!kca", name = "i", descriptor = "I")
    public static int field5161;

    @OriginalMember(owner = "client!kca", name = "k", descriptor = "I")
    public static int field5163;

    @OriginalMember(owner = "client!kca", name = "l", descriptor = "I")
    public static int field5164;

    @OriginalMember(owner = "client!kca", name = "m", descriptor = "I")
    public static int field5165;

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(B)I", line = 3)
    public final int method1450(byte arg0) {
        ++field5163;
        if (arg0 < 18) {
            this.field5160 = 2;
        }
        return this.field5160;
    }

    @OriginalMember(owner = "client!kca", name = "b", descriptor = "(I)V", line = 14)
    public static void method2219(int arg0) {
        field5157 = null;
        if (arg0 != -28776) {
            method2220(92);
        }
    }

    @OriginalMember(owner = "client!kca", name = "<init>", descriptor = "(Lkfa;I[BI)V", line = 28)
    public class372(class382 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field5160 = arg1;
    }

    @OriginalMember(owner = "client!kca", name = "c", descriptor = "(I)V", line = 40)
    public static final void method2220(int arg0) {
        ++field5156;
        if (class41.field555) {
            class101 var1 = class620.method3501(class395.field5705, false, class199.field3091);
            if (var1 != null && var1.field1506 != null) {
                class400 var2 = new class400();
                var2.field5783 = var1;
                var2.field5790 = var1.field1506;
                class362.method2171(var2);
            }
            class41.field555 = false;
            class324.field4521 = -1;
            class595.field8622 = -1;
            if (var1 != null) {
                class326.method1948(1, var1);
            }
            if (arg0 != -20585) {
                field5157 = null;
            }
        }
    }

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "([BIII)V", line = 75)
    public final void method1449(byte[] arg0, int arg1, int arg2, int arg3) {
        if (arg3 != -17605) {
            this.method1451(false);
        }
        ++field5155;
        this.method2590(arg0, arg1);
        this.field5160 = arg2;
    }

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(I)J", line = 87)
    public final long method1448(int arg0) {
        ++field5161;
        if (arg0 != 25844) {
            field5164 = 63;
        }
        return super.field6425.getAddress();
    }

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(Z)I", line = 103)
    public final int method1451(boolean arg0) {
        ++field5165;
        if (arg0) {
            this.method1449((byte[]) null, -59, 67, -38);
        }
        return 0;
    }
}
