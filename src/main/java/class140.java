import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dm")
public class class140 extends class320 {

    @OriginalMember(owner = "client!dm", name = "C", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field2325 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!dm", name = "J", descriptor = "[I")
    public static int[] field2332 = new int[] { 12543016, 15504954, 15914854, 16773818 };

    @OriginalMember(owner = "client!dm", name = "K", descriptor = "Z")
    public static boolean field2333 = false;

    @OriginalMember(owner = "client!dm", name = "M", descriptor = "Ljava/lang/String;")
    public static String field2335 = "glow2:";

    @OriginalMember(owner = "client!dm", name = "H", descriptor = "C")
    private char field2330;

    @OriginalMember(owner = "client!dm", name = "A", descriptor = "I")
    public static int field2323;

    @OriginalMember(owner = "client!dm", name = "B", descriptor = "I")
    public static int field2324;

    @OriginalMember(owner = "client!dm", name = "E", descriptor = "I")
    public static int field2327;

    @OriginalMember(owner = "client!dm", name = "F", descriptor = "I")
    public static int field2328;

    @OriginalMember(owner = "client!dm", name = "G", descriptor = "I")
    public static int field2329;

    @OriginalMember(owner = "client!dm", name = "I", descriptor = "I")
    public static int field2331;

    @OriginalMember(owner = "client!dm", name = "L", descriptor = "I")
    public int field2334;

    @OriginalMember(owner = "client!dm", name = "D", descriptor = "Ljava/lang/String;")
    public String field2326;

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(IBLug;)V", line = 5)
    private final void method1169(int arg0, byte arg1, class25 arg2) {
        if (arg0 == 1) {
            this.field2330 = class221.method1658((byte) -123, arg2.method286((byte) 91));
        } else if (arg0 == 2) {
            this.field2334 = arg2.method262((byte) 46);
        } else if (arg0 == 5) {
            this.field2326 = arg2.method297((byte) -97);
        }
        if (arg1 != 111) {
            method1172((byte) 15);
        }
        field2323++;
    }

    @OriginalMember(owner = "client!dm", name = "f", descriptor = "(I)V", line = 30)
    public static void method1170(int arg0) {
        field2332 = null;
        field2325 = null;
        field2335 = null;
        if (arg0 >= -96) {
            method1170(-71);
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(Z)Z", line = 43)
    public final boolean method1171(boolean arg0) {
        field2328++;
        if (!arg0) {
            this.field2326 = (String) null;
        }
        return this.field2330 == 's';
    }

    @OriginalMember(owner = "client!dm", name = "c", descriptor = "(B)I", line = 56)
    public static final int method1172(byte arg0) {
        int var1 = 118 % ((15 - arg0) / 38);
        field2324++;
        return 6;
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(ZIIII)V", line = 79)
    public static final void method1173(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        field2329++;
        if (arg2 != 15504954) {
            method1172((byte) -35);
        }
        if (class328.method2321(0, arg3)) {
            class283.method2061(-1, class334.field5108[arg3], arg1, arg0, arg4, (byte) -128);
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(Lug;Z)V", line = 102)
    public final void method1174(class25 arg0, boolean arg1) {
        field2327++;
        if (arg1) {
            return;
        }
        while (true) {
            int var3 = arg0.method281(5);
            if (var3 == 0) {
                return;
            }
            this.method1169(var3, (byte) 111, arg0);
        }
    }

    @OriginalMember(owner = "client!dm", name = "g", descriptor = "(I)V", line = 123)
    public static final void method1175(int arg0) {
        field2331++;
        class273.method2002((long) class360.field5718);
        if (class164.field2604 != -1) {
            class222.method1672(8, class164.field2604);
        }
        for (int var1 = 0; var1 < class362.field5732; var1++) {
            if (class227.field3540[var1]) {
                class349.field5544[var1] = true;
            }
            class231.field3605[var1] = class227.field3540[var1];
            class227.field3540[var1] = false;
        }
        if (class240.field3737) {
            class9.field130 = true;
        }
        class327.field5031 = class360.field5718;
        class82.field1193 = -1;
        class150.field2458 = -1;
        class99.field1496 = null;
        if (class164.field2604 != -1) {
            class362.field5732 = 0;
            class167.method1328(4923);
        }
        if (class240.field3737) {
            class213.method1596();
        } else {
            class60.method607();
        }
        class247.field3840 = 0;
        if (arg0 > -32) {
            method1170(-4);
        }
    }
}
