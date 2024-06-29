import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!im")
public class class401 extends class439 {

    @OriginalMember(owner = "client!im", name = "t", descriptor = "I")
    public int field5885;

    @OriginalMember(owner = "client!im", name = "v", descriptor = "I")
    public int field5887;

    @OriginalMember(owner = "client!im", name = "q", descriptor = "I")
    public int field5882;

    @OriginalMember(owner = "client!im", name = "r", descriptor = "Z")
    public boolean field5883;

    @OriginalMember(owner = "client!im", name = "u", descriptor = "I")
    public int field5886;

    @OriginalMember(owner = "client!im", name = "p", descriptor = "I")
    public int field5881;

    @OriginalMember(owner = "client!im", name = "w", descriptor = "[Lnr;")
    public static class40[] field5888 = new class40[30];

    @OriginalMember(owner = "client!im", name = "o", descriptor = "I")
    public static int field5880;

    @OriginalMember(owner = "client!im", name = "s", descriptor = "I")
    public static int field5884;

    @OriginalMember(owner = "client!im", name = "x", descriptor = "I")
    public static int field5889;

    @OriginalMember(owner = "client!im", name = "n", descriptor = "Lci;")
    public static class312 field5879;

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(I[B)[B")
    public static final byte[] method2494(int arg0, byte[] arg1) {
        field5884++;
        class303 var2 = new class303(arg1);
        int var3 = var2.method1918((byte) 112);
        if (arg0 != 30) {
            return null;
        }
        int var4 = var2.method1870(-1945262512);
        if (var4 < 0 || !(class373.field5582 == 0 || class373.field5582 >= var4)) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var5 = new byte[var4];
            var2.method1881(0, var5, 9624, var4);
            return var5;
        } else {
            int var6 = var2.method1870(arg0 ^ 0x8C0DA64E);
            if (var6 < 0 || !(class373.field5582 == 0 || class373.field5582 >= var6)) {
                throw new RuntimeException();
            }
            byte[] var7 = new byte[var6];
            if (var3 == 1) {
                class362.method2328(var7, var6, arg1, var4, 9);
            } else {
                class152.field2329.method171(var2, var7, 311);
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!im", name = "c", descriptor = "(I)V")
    public static void method2495(int arg0) {
        if (arg0 == -219366424) {
            field5879 = null;
            field5888 = null;
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(IB)I")
    public static final int method2496(int arg0, byte arg1) {
        field5880++;
        return arg1 == 15 ? arg0 >>> 8 : -100;
    }

    @OriginalMember(owner = "client!im", name = "<init>", descriptor = "(IIIIIZ)V")
    public class401(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.field5885 = arg1;
        this.field5887 = arg4;
        this.field5882 = arg2;
        this.field5883 = arg5;
        this.field5886 = arg3;
        this.field5881 = arg0;
    }
}
