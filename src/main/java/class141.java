import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fn")
public class class141 extends class739 {

    @OriginalMember(owner = "client!fn", name = "K", descriptor = "Lwaa;")
    public static class705 field2002 = new class705("WTI", "office", "_wti", 5);

    @OriginalMember(owner = "client!fn", name = "Q", descriptor = "[I")
    public static int[] field2007 = new int[] { 1, 4, 1, 2 };

    @OriginalMember(owner = "client!fn", name = "P", descriptor = "Lkg;")
    public static class275 field2006 = new class275(14, 8);

    @OriginalMember(owner = "client!fn", name = "E", descriptor = "I")
    private int field1997;

    @OriginalMember(owner = "client!fn", name = "F", descriptor = "I")
    public static int field1998;

    @OriginalMember(owner = "client!fn", name = "G", descriptor = "I")
    public static int field1999;

    @OriginalMember(owner = "client!fn", name = "H", descriptor = "I")
    private int field2000;

    @OriginalMember(owner = "client!fn", name = "J", descriptor = "I")
    public static int field2001;

    @OriginalMember(owner = "client!fn", name = "M", descriptor = "I")
    public static int field2003;

    @OriginalMember(owner = "client!fn", name = "N", descriptor = "I")
    public static int field2004;

    @OriginalMember(owner = "client!fn", name = "O", descriptor = "I")
    private int field2005;

    @OriginalMember(owner = "client!fn", name = "R", descriptor = "[[[I")
    public static int[][][] field2008;

    @OriginalMember(owner = "client!fn", name = "<init>", descriptor = "()V")
    public class141() {
        this(0);
    }

    @OriginalMember(owner = "client!fn", name = "<init>", descriptor = "(I)V")
    private class141(int arg0) {
        super(0, false);
        this.method1024(4080, arg0);
    }

    @OriginalMember(owner = "client!fn", name = "d", descriptor = "(III)I")
    public static final int method1022(int arg0, int arg1, int arg2) {
        ++field2003;
        double var3 = Math.log((double) arg0) / Math.log(2.0D);
        if (arg2 != 2) {
            return 117;
        } else {
            double var5 = Math.log((double) arg1) / Math.log(2.0D);
            double var7 = Math.random() * (-var5 + var3) + var5;
            return (int) (Math.pow(2.0D, var7) + 0.5D);
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(Lsl;II)V")
    public final void method214(class461 arg0, int arg1, int arg2) {
        if (arg2 != -3) {
            field2006 = null;
        }
        ++field2001;
        if (arg1 == 0) {
            this.method1024(4080, arg0.method2576((byte) 67));
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(B)V")
    public static void method1023(byte arg0) {
        int var1 = -68 % ((79 - arg0) / 35);
        field2007 = null;
        field2008 = null;
        field2006 = null;
        field2002 = null;
    }

    @OriginalMember(owner = "client!fn", name = "b", descriptor = "(II)V")
    private final void method1024(int arg0, int arg1) {
        this.field2000 = (65280 & arg1) >> 4;
        this.field2005 = arg0 & arg1 >> 12;
        ++field1999;
        this.field1997 = 4080 & arg1 << 4;
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(BI)[[I")
    public final int[][] method223(byte arg0, int arg1) {
        ++field2004;
        int[][] var3 = super.field10312.method2191((byte) 52, arg1);
        if (super.field10312.field4922) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; var7 < class29.field523; ++var7) {
                var4[var7] = this.field2005;
                var5[var7] = this.field2000;
                var6[var7] = this.field1997;
            }
        }
        if (arg0 <= 26) {
            this.field2000 = -66;
        }
        return var3;
    }
}
