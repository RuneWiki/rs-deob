import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ut")
public class class109 {

    @OriginalMember(owner = "client!ut", name = "j", descriptor = "I")
    public static int field1677 = 0;

    @OriginalMember(owner = "client!ut", name = "h", descriptor = "I")
    public static int field1675 = -1;

    @OriginalMember(owner = "client!ut", name = "g", descriptor = "Lnea;")
    public static class664 field1674 = new class664(52, 3);

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "I")
    public static int field1668;

    @OriginalMember(owner = "client!ut", name = "b", descriptor = "I")
    public static int field1669;

    @OriginalMember(owner = "client!ut", name = "c", descriptor = "I")
    public static int field1670;

    @OriginalMember(owner = "client!ut", name = "d", descriptor = "I")
    public static int field1671;

    @OriginalMember(owner = "client!ut", name = "e", descriptor = "I")
    public static int field1672;

    @OriginalMember(owner = "client!ut", name = "f", descriptor = "I")
    public static int field1673;

    @OriginalMember(owner = "client!ut", name = "k", descriptor = "I")
    public static int field1678;

    @OriginalMember(owner = "client!ut", name = "l", descriptor = "I")
    public static int field1679;

    @OriginalMember(owner = "client!ut", name = "i", descriptor = "Lid;")
    public static class541 field1676;

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "([IB[I)V", line = 4)
    public static final void method855(int[] arg0, byte arg1, int[] arg2) {
        if (arg1 != -65) {
            method855(null, (byte) 50, null);
        }
        field1668++;
        if (arg0 == null || arg2 == null) {
            class271.field4085 = null;
            class327.field4850 = null;
            class101.field1577 = null;
            return;
        }
        class271.field4085 = arg0;
        class327.field4850 = new int[arg0.length];
        class101.field1577 = new byte[arg0.length][][];
        for (int var3 = 0; var3 < class271.field4085.length; var3++) {
            class101.field1577[var3] = new byte[arg2[var3]][];
        }
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(I)V", line = 36)
    public static void method856(int arg0) {
        if (arg0 != 52) {
            field1675 = -120;
        }
        field1676 = null;
        field1674 = null;
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(ZZ)V", line = 47)
    public static final void method857(boolean arg0, boolean arg1) {
        field1678++;
        class263.method1730(-1);
        if (!class320.method2003(-101, class420.field6113) || !arg1) {
            return;
        }
        class66.field1222++;
        if (class66.field1222 < 50 && !arg0) {
            return;
        }
        class66.field1222 = 0;
        if (!class48.field839 && class274.field4181 != null) {
            class345.field5040++;
            class135 var2 = class688.method3794(class351.field5066, class583.field8198, (byte) 38);
            class19.method223(var2, 0);
            try {
                class475.method2788(0);
            } catch (IOException var3) {
                class48.field839 = true;
            }
        }
        class263.method1730(-1);
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(B[FI)[F", line = 90)
    public static final float[] method858(byte arg0, float[] arg1, int arg2) {
        if (arg0 != 2) {
            field1675 = -11;
        }
        field1670++;
        float[] var3 = new float[arg2];
        class476.method2795(arg1, 0, var3, 0, arg2);
        return var3;
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(II)V", line = 105)
    public static final void method859(int arg0, int arg1) {
        class112.field1691 = arg1;
        field1671++;
        if (arg0 != -1) {
            field1674 = null;
        }
        class97.field1524.method2285((byte) -91);
    }

    @OriginalMember(owner = "client!ut", name = "toString", descriptor = "()Ljava/lang/String;", line = 120)
    public final String toString() {
        field1673++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(IIB)I", line = 130)
    public final int method860(int arg0, int arg1, byte arg2) {
        field1679++;
        int var4 = class487.field6930 <= arg0 ? arg0 : class487.field6930;
        if (class657.field9221 == this) {
            return 0;
        } else if (arg2 <= 15) {
            return -123;
        } else if (class495.field7028 == this) {
            return var4 - arg1;
        } else if (class413.field6007 == this) {
            return (var4 - arg1) / 2;
        } else {
            return 0;
        }
    }
}
