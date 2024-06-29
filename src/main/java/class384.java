import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aia")
public abstract class class384 {

    @OriginalMember(owner = "client!aia", name = "a", descriptor = "Lbm;")
    public class684 field5337;

    @OriginalMember(owner = "client!aia", name = "j", descriptor = "[[I")
    public static int[][] field5346 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };

    @OriginalMember(owner = "client!aia", name = "f", descriptor = "Lan;")
    public static class182 field5342 = new class182(3, 8);

    @OriginalMember(owner = "client!aia", name = "b", descriptor = "I")
    public static int field5338;

    @OriginalMember(owner = "client!aia", name = "c", descriptor = "I")
    public static int field5339;

    @OriginalMember(owner = "client!aia", name = "d", descriptor = "I")
    public static int field5340;

    @OriginalMember(owner = "client!aia", name = "e", descriptor = "I")
    public static int field5341;

    @OriginalMember(owner = "client!aia", name = "g", descriptor = "I")
    public static int field5343;

    @OriginalMember(owner = "client!aia", name = "h", descriptor = "I")
    public static int field5344;

    @OriginalMember(owner = "client!aia", name = "i", descriptor = "I")
    public static int field5345;

    @OriginalMember(owner = "client!aia", name = "k", descriptor = "I")
    public static int field5347;

    @OriginalMember(owner = "client!aia", name = "l", descriptor = "I")
    public static int field5348;

    @OriginalMember(owner = "client!aia", name = "m", descriptor = "[Lfba;")
    public static class600[] field5349;

    @OriginalMember(owner = "client!aia", name = "a", descriptor = "(B)V", line = 10)
    public static void method2307(byte arg0) {
        if (arg0 != -72) {
            field5346 = null;
        }
        field5346 = null;
        field5349 = null;
        field5342 = null;
    }

    @OriginalMember(owner = "client!aia", name = "a", descriptor = "(I)V", line = 26)
    public static final void method2308(int arg0) {
        if (arg0 >= -35) {
            return;
        }
        field5345++;
        if (class761.field10601 != null) {
            class761.field10601.method1276((byte) 30);
        }
        if (class152.field1853 != null) {
            class152.field1853.method1276((byte) 30);
        }
    }

    @OriginalMember(owner = "client!aia", name = "b", descriptor = "(I)V", line = 43)
    public void method1867(int arg0) {
        int var2 = 73 / ((-arg0 - 45) / 32);
        field5347++;
    }

    @OriginalMember(owner = "client!aia", name = "c", descriptor = "(I)V", line = 52)
    public void method1865(int arg0) {
        if (arg0 != -23163) {
            field5349 = null;
        }
        field5338++;
    }

    @OriginalMember(owner = "client!aia", name = "<init>", descriptor = "(Lbm;)V", line = 63)
    public class384(class684 arg0) {
        this.field5337 = arg0;
    }

    @OriginalMember(owner = "client!aia", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIZ)V", line = 71)
    public static final void method2309(String arg0, String arg1, int arg2, int arg3, boolean arg4) {
        if (arg3 == 6) {
            field5348++;
            class81.method577(arg0, arg1, (byte) -107, true, arg4, -1, arg2);
        }
    }

    @OriginalMember(owner = "client!aia", name = "a", descriptor = "([BIB)[B", line = 82)
    public static final byte[] method2310(byte[] arg0, int arg1, byte arg2) {
        if (arg2 >= -17) {
            field5346 = null;
        }
        field5339++;
        byte[] var3 = new byte[arg1];
        class617.method3389(arg0, 0, var3, 0, arg1);
        return var3;
    }

    @OriginalMember(owner = "client!aia", name = "d", descriptor = "(I)V", line = 98)
    public void method2311(int arg0) {
        field5341++;
        if (arg0 != 1) {
            this.method1018(-47, true);
        }
    }

    @OriginalMember(owner = "client!aia", name = "c", descriptor = "(B)V", line = 109)
    public void method1868(byte arg0) {
        if (arg0 > 91) {
            field5344++;
        }
    }

    @OriginalMember(owner = "client!aia", name = "a", descriptor = "(Z)V", line = 127)
    public void method1866(boolean arg0) {
        if (arg0) {
            field5340++;
        }
    }

    @OriginalMember(owner = "client!aia", name = "e", descriptor = "(B)V", line = 140)
    public void method1023(byte arg0) {
        field5343++;
        if (arg0 != -52) {
            this.method1015(null, (byte) 37, -53);
        }
    }

    @OriginalMember(owner = "client!aia", name = "a", descriptor = "(IZ)V")
    public abstract void method1018(int arg0, boolean arg1);

    @OriginalMember(owner = "client!aia", name = "a", descriptor = "(ZB)V")
    public abstract void method1020(boolean arg0, byte arg1);

    @OriginalMember(owner = "client!aia", name = "b", descriptor = "(B)V")
    public abstract void method1019(byte arg0);

    @OriginalMember(owner = "client!aia", name = "a", descriptor = "(IBI)V")
    public abstract void method1025(int arg0, byte arg1, int arg2);

    @OriginalMember(owner = "client!aia", name = "d", descriptor = "(B)Z")
    public abstract boolean method1021(byte arg0);

    @OriginalMember(owner = "client!aia", name = "a", descriptor = "(Lbia;BI)V")
    public abstract void method1015(class329 arg0, byte arg1, int arg2);
}
