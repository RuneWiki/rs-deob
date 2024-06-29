import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!au")
public class class768 extends class577 {

    @OriginalMember(owner = "client!au", name = "m", descriptor = "I")
    public volatile int field10565 = -1;

    @OriginalMember(owner = "client!au", name = "l", descriptor = "Ljava/lang/String;")
    public volatile String field10564;

    @OriginalMember(owner = "client!au", name = "o", descriptor = "Z")
    public static boolean field10567 = true;

    @OriginalMember(owner = "client!au", name = "q", descriptor = "Lbu;")
    public static class21 field10569 = new class21(15, 3);

    @OriginalMember(owner = "client!au", name = "s", descriptor = "I")
    public static int field10571 = 104;

    @OriginalMember(owner = "client!au", name = "t", descriptor = "S")
    public static short field10572 = 256;

    @OriginalMember(owner = "client!au", name = "n", descriptor = "I")
    public static int field10566;

    @OriginalMember(owner = "client!au", name = "p", descriptor = "I")
    public static int field10568;

    @OriginalMember(owner = "client!au", name = "r", descriptor = "I")
    public static int field10570;

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(I)V", line = 3)
    public static void method4239(int arg0) {
        int var1 = 21 % ((arg0 - 54) / 39);
        field10569 = null;
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(IZ)V", line = 21)
    public static final void method4240(int arg0, boolean arg1) {
        field10568++;
        if (arg1) {
            if (class371.field5137 != -1) {
                class584.method3413(-111, class371.field5137);
            }
            for (class744 var2 = (class744) class11.field217.method2243((byte) 100); var2 != null; var2 = (class744) class11.field217.method2248(-15690)) {
                if (!var2.method3386((byte) 122)) {
                    var2 = (class744) class11.field217.method2243((byte) 100);
                    if (var2 == null) {
                        break;
                    }
                }
                class698.method3932((byte) 99, var2, true, false);
            }
            class371.field5137 = -1;
            class11.field217 = new class353(8);
            class581.method3406(-69);
            class371.field5137 = class483.field6809;
            class661.method3773(false, -55);
            class351.method2224((byte) 119);
            class379.method2356(class371.field5137);
        }
        class34.field469 = true;
        if (arg0 != -1) {
            method4242(-117, null, 60, null, -110);
        }
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(IIB)V", line = 68)
    public static final void method4241(int arg0, int arg1, byte arg2) {
        if (arg2 != 71) {
            method4241(50, -65, (byte) -119);
        }
        field10570++;
        if (class90.field1011 != 0) {
            if (arg1 < 0) {
                for (int var3 = 0; var3 < 16; var3++) {
                    class46.field576[var3] = arg0;
                }
            } else {
                class46.field576[arg1] = arg0;
            }
        }
        class686.field9533.method2766((byte) 70, arg1, arg0);
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(ILha;ILmea;I)V", line = 96)
    public static final void method4242(int arg0, class65 arg1, int arg2, class451 arg3, int arg4) {
        field10566++;
        byte var5 = 63;
        if (arg2 <= 64) {
            return;
        }
        byte var6 = 7;
        for (int var7 = 63; var7 >= 0; var7--) {
            int var8 = var7 & 0x3F << 10 | var6 << 7 & 0x380 | var5 & 0x7F;
            class486.method2895(true, false, (byte) 121);
            int var9 = class779.field10694[var8];
            class467.method2791(true, false, (byte) -119);
            arg1.method495(arg0, arg4 + ((63 - var7) * arg3.field6288 >> 6), arg3.field6290, (arg3.field6288 >> 6) + 1, var9, 0);
        }
    }

    @OriginalMember(owner = "client!au", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 141)
    public class768(String arg0) {
        this.field10564 = arg0;
    }
}
