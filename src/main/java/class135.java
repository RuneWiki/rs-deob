import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public class class135 {

    @OriginalMember(owner = "client!tk", name = "m", descriptor = "I")
    public int field2002;

    @OriginalMember(owner = "client!tk", name = "r", descriptor = "F")
    public float field2007;

    @OriginalMember(owner = "client!tk", name = "g", descriptor = "F")
    public float field1996;

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "F")
    public float field1991;

    @OriginalMember(owner = "client!tk", name = "n", descriptor = "I")
    public int field2003;

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "I")
    public int field1990;

    @OriginalMember(owner = "client!tk", name = "o", descriptor = "I")
    public int field2004;

    @OriginalMember(owner = "client!tk", name = "q", descriptor = "I")
    public int field2006;

    @OriginalMember(owner = "client!tk", name = "f", descriptor = "I")
    public int field1995;

    @OriginalMember(owner = "client!tk", name = "i", descriptor = "Lma;")
    private static class5 field1998 = class12.method119("Loaded input handler", (byte) 62);

    @OriginalMember(owner = "client!tk", name = "d", descriptor = "Lma;")
    public static class5 field1993 = field1998;

    @OriginalMember(owner = "client!tk", name = "h", descriptor = "Z")
    public static boolean field1997 = false;

    @OriginalMember(owner = "client!tk", name = "c", descriptor = "Lma;")
    public static class5 field1992 = class12.method119("Null", (byte) 87);

    @OriginalMember(owner = "client!tk", name = "l", descriptor = "Lma;")
    private static class5 field2001 = class12.method119("Created gameworld", (byte) 53);

    @OriginalMember(owner = "client!tk", name = "e", descriptor = "Lma;")
    public static class5 field1994 = field2001;

    @OriginalMember(owner = "client!tk", name = "j", descriptor = "I")
    public static int field1999;

    @OriginalMember(owner = "client!tk", name = "k", descriptor = "I")
    public static int field2000;

    @OriginalMember(owner = "client!tk", name = "p", descriptor = "I")
    public static int field2005;

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(BIIIIII)V", line = 36)
    public static final void method883(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2005++;
        int var7 = 36 / ((arg0 - 7) / 47);
        int var8 = class76.method533(class294.field4956, arg5, true, class101.field1505);
        int var9 = class76.method533(class294.field4956, arg1, true, class101.field1505);
        int var10 = class76.method533(class57.field899, arg3, true, class301.field5073);
        int var11 = class76.method533(class57.field899, arg4, true, class301.field5073);
        int var12 = class76.method533(class294.field4956, arg5 + arg6, true, class101.field1505);
        int var13 = class76.method533(class294.field4956, arg1 - arg6, true, class101.field1505);
        for (int var14 = var8; var14 < var12; var14++) {
            class239.method1690(var10, 23267, var11, class137.field2032[var14], arg2);
        }
        for (int var15 = var9; var15 > var13; var15--) {
            class239.method1690(var10, 23267, var11, class137.field2032[var15], arg2);
        }
        int var16 = class76.method533(class57.field899, arg3 + arg6, true, class301.field5073);
        int var17 = class76.method533(class57.field899, arg4 - arg6, true, class301.field5073);
        for (int var18 = var12; var18 <= var13; var18++) {
            int[] var19 = class137.field2032[var18];
            class239.method1690(var10, 23267, var16, var19, arg2);
            class239.method1690(var17, 23267, var11, var19, arg2);
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(I)V", line = 88)
    public static void method884(int arg0) {
        if (arg0 != -29100) {
            field1993 = (class5) null;
        }
        field1993 = null;
        field1994 = null;
        field1992 = null;
        field1998 = null;
        field2001 = null;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(Z)V", line = 111)
    public static final void method885(boolean arg0) {
        class170.field2614 = (byte[][][]) null;
        field1999++;
        class230.field3825 = (byte[][][]) null;
        class43.field650 = null;
        class278.field4722 = (int[][][]) null;
        class289.field4912 = (byte[][][]) null;
        class267.field4594 = (byte[][][]) null;
        class276.field4707 = (byte[][][]) null;
        class130.field1948 = 0;
        class248.field4102 = (int[][][]) null;
        class158.field2377 = null;
        class283.field4799 = null;
        class141.field2076 = (short[][][]) null;
        class59.field925.method1474((byte) 71);
        class46.field704 = null;
        class276.field4710 = null;
        class167.field2551 = null;
        if (!arg0) {
            method885(true);
        }
        class70.field1112 = null;
        class96.field1433 = null;
        class69.field1090 = null;
        class50.field787 = null;
        class236.field3905 = null;
        class157.field2335 = null;
        class274.field4678 = null;
        class86.field1307 = null;
    }

    @OriginalMember(owner = "client!tk", name = "<init>", descriptor = "()V", line = 161)
    public class135() {
        this.field2002 = class293.field4951;
        this.field2007 = 1.1523438F;
        this.field1996 = 0.69921875F;
        this.field1991 = 1.2F;
        this.field2003 = -50;
        this.field1990 = 0;
        this.field2004 = -60;
        this.field2006 = class293.field4949;
        this.field1995 = -50;
    }

    @OriginalMember(owner = "client!tk", name = "<init>", descriptor = "(Lii;)V", line = 176)
    public class135(class221 arg0) {
        int var2 = arg0.method1509(true);
        if ((var2 & 0x1) == 0) {
            this.field2002 = class293.field4951;
        } else {
            this.field2002 = arg0.method1517((byte) -126);
        }
        if ((var2 & 0x2) == 0) {
            this.field2007 = 1.1523438F;
        } else {
            this.field2007 = (float) arg0.method1524((byte) 105) / 256.0F;
        }
        if ((var2 & 0x4) == 0) {
            this.field1996 = 0.69921875F;
        } else {
            this.field1996 = (float) arg0.method1524((byte) 97) / 256.0F;
        }
        if ((var2 & 0x8) == 0) {
            this.field1991 = 1.2F;
        } else {
            this.field1991 = (float) arg0.method1524((byte) 79) / 256.0F;
        }
        if ((var2 & 0x10) == 0) {
            this.field2004 = -60;
            this.field2003 = -50;
            this.field1995 = -50;
        } else {
            this.field1995 = arg0.method1505(-122);
            this.field2004 = arg0.method1505(0);
            this.field2003 = arg0.method1505(109);
        }
        if ((var2 & 0x20) == 0) {
            this.field2006 = class293.field4949;
        } else {
            this.field2006 = arg0.method1517((byte) -123);
        }
        if ((var2 & 0x40) == 0) {
            this.field1990 = 0;
        } else {
            this.field1990 = arg0.method1524((byte) 89);
        }
    }
}
