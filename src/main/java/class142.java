import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ls")
public class class142 {

    @OriginalMember(owner = "client!ls", name = "h", descriptor = "Lde;")
    private class534 field2016 = new class534(64);

    @OriginalMember(owner = "client!ls", name = "n", descriptor = "I")
    public int field2022 = 0;

    @OriginalMember(owner = "client!ls", name = "i", descriptor = "Lnd;")
    private class547 field2017;

    @OriginalMember(owner = "client!ls", name = "j", descriptor = "I")
    public int field2018;

    @OriginalMember(owner = "client!ls", name = "b", descriptor = "I")
    public static int field2010 = -1;

    @OriginalMember(owner = "client!ls", name = "c", descriptor = "I")
    public static int field2011 = 0;

    @OriginalMember(owner = "client!ls", name = "e", descriptor = "[I")
    public static int[] field2013 = new int[4096];

    @OriginalMember(owner = "client!ls", name = "f", descriptor = "Lkg;")
    public static class275 field2014 = new class275(91, 10);

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "I")
    public static int field2009;

    @OriginalMember(owner = "client!ls", name = "d", descriptor = "I")
    public static int field2012;

    @OriginalMember(owner = "client!ls", name = "g", descriptor = "I")
    public static int field2015;

    @OriginalMember(owner = "client!ls", name = "k", descriptor = "I")
    public static int field2019;

    @OriginalMember(owner = "client!ls", name = "l", descriptor = "I")
    public static int field2020;

    @OriginalMember(owner = "client!ls", name = "m", descriptor = "I")
    public static int field2021;

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(I)V", line = 6)
    public static void method1025(int arg0) {
        field2014 = null;
        if (arg0 != 4096) {
            method1030(null);
        }
        field2013 = null;
    }

    @OriginalMember(owner = "client!ls", name = "b", descriptor = "(I)V", line = 17)
    public final void method1026(int arg0) {
        field2012++;
        if (arg0 <= 109) {
            this.method1026(-31);
        }
        class534 var2 = this.field2016;
        synchronized (this.field2016) {
            this.field2016.method3065(true);
        }
    }

    @OriginalMember(owner = "client!ls", name = "c", descriptor = "(I)V", line = 39)
    public static final void method1027(int arg0) {
        class676.method3810(1);
        field2015++;
        class14.method102(true);
        if (arg0 != -1) {
            method1030(null);
        }
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(II)Lpia;", line = 54)
    public final class97 method1028(int arg0, int arg1) {
        field2021++;
        class534 var3 = this.field2016;
        class97 var4;
        synchronized (this.field2016) {
            var4 = (class97) this.field2016.method3079((long) arg1, 0);
        }
        if (var4 != null) {
            return var4;
        }
        class547 var5 = this.field2017;
        byte[] var6;
        synchronized (this.field2017) {
            var6 = this.field2017.method3153(arg1, 0, 4);
        }
        class97 var7 = new class97();
        var7.field1347 = this;
        var7.field1345 = arg1;
        if (var6 != null) {
            var7.method775(new class461(var6), true);
        }
        var7.method776(102);
        class534 var8 = this.field2016;
        synchronized (this.field2016) {
            if (arg0 != -5249) {
                this.field2017 = null;
            }
            this.field2016.method3077((byte) 100, (long) arg1, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ls", name = "d", descriptor = "(I)V", line = 92)
    public final void method1029(int arg0) {
        if (arg0 != 16438) {
            return;
        }
        field2019++;
        class534 var2 = this.field2016;
        synchronized (this.field2016) {
            this.field2016.method3064(false);
        }
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(Lda;)V", line = 116)
    public static final void method1030(class61 arg0) {
        class678.field9469 = arg0;
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "([FII)[F", line = 119)
    public static final float[] method1031(float[] arg0, int arg1, int arg2) {
        field2009++;
        float[] var3 = new float[arg1];
        class135.method998(arg0, 0, var3, arg2, arg1);
        return var3;
    }

    @OriginalMember(owner = "client!ls", name = "b", descriptor = "(II)V", line = 131)
    public final void method1032(int arg0, int arg1) {
        class534 var3 = this.field2016;
        synchronized (this.field2016) {
            this.field2016.method3070(arg0, 119);
        }
        if (arg1 != 27970) {
            field2010 = -107;
        }
        field2020++;
    }

    @OriginalMember(owner = "client!ls", name = "<init>", descriptor = "(Lal;ILnd;)V", line = 150)
    public class142(class102 arg0, int arg1, class547 arg2) {
        this.field2017 = arg2;
        this.field2018 = this.field2017.method3178((byte) 118, 4);
    }
}
