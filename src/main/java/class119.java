import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oda")
public class class119 {

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "Ljr;")
    private class112 field2009 = new class112(64);

    @OriginalMember(owner = "client!oda", name = "n", descriptor = "Ljr;")
    public class112 field2022 = new class112(64);

    @OriginalMember(owner = "client!oda", name = "c", descriptor = "Lin;")
    public class91 field2011;

    @OriginalMember(owner = "client!oda", name = "i", descriptor = "Lin;")
    private class91 field2017;

    @OriginalMember(owner = "client!oda", name = "k", descriptor = "[I")
    public static int[] field2019 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

    @OriginalMember(owner = "client!oda", name = "d", descriptor = "Luw;")
    public static class418 field2012 = new class418("", 18);

    @OriginalMember(owner = "client!oda", name = "m", descriptor = "[I")
    public static int[] field2021 = new int[1];

    @OriginalMember(owner = "client!oda", name = "b", descriptor = "I")
    public static int field2010;

    @OriginalMember(owner = "client!oda", name = "e", descriptor = "I")
    public static int field2013;

    @OriginalMember(owner = "client!oda", name = "f", descriptor = "I")
    public static int field2014;

    @OriginalMember(owner = "client!oda", name = "g", descriptor = "I")
    public static int field2015;

    @OriginalMember(owner = "client!oda", name = "h", descriptor = "I")
    public static int field2016;

    @OriginalMember(owner = "client!oda", name = "j", descriptor = "I")
    public static int field2018;

    @OriginalMember(owner = "client!oda", name = "l", descriptor = "I")
    public static int field2020;

    @OriginalMember(owner = "client!oda", name = "o", descriptor = "Lhs;")
    public static class327 field2023;

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(BI)Lrw;")
    public final class754 method1035(byte arg0, int arg1) {
        field2010++;
        class112 var3 = this.field2009;
        class754 var4;
        synchronized (this.field2009) {
            var4 = (class754) this.field2009.method992((long) arg1, 118);
        }
        if (var4 != null) {
            return var4;
        }
        class91 var5 = this.field2017;
        byte[] var6;
        synchronized (this.field2017) {
            var6 = this.field2017.method863(arg0 - 1891, 34, arg1);
        }
        class754 var7 = new class754();
        if (arg0 != 31) {
            return null;
        }
        var7.field10524 = this;
        if (var6 != null) {
            var7.method4211((byte) -114, new class215(var6));
        }
        class112 var8 = this.field2009;
        synchronized (this.field2009) {
            this.field2009.method991(var7, (long) arg1, (byte) -108);
            return var7;
        }
    }

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(B)V")
    public final void method1036(byte arg0) {
        class112 var2 = this.field2009;
        synchronized (this.field2009) {
            this.field2009.method996(-87);
        }
        field2015++;
        class112 var3 = this.field2022;
        synchronized (this.field2022) {
            if (arg0 <= -89) {
                this.field2022.method996(-79);
            }
        }
    }

    @OriginalMember(owner = "client!oda", name = "b", descriptor = "(B)V")
    public final void method1037(byte arg0) {
        class112 var2 = this.field2009;
        synchronized (this.field2009) {
            this.field2009.method999(arg0 - 125);
        }
        field2013++;
        if (arg0 == 125) {
            class112 var3 = this.field2022;
            synchronized (this.field2022) {
                this.field2022.method999(0);
            }
        }
    }

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(IB)V")
    public final void method1038(int arg0, byte arg1) {
        if (arg1 < 31) {
            method1039((byte) -119);
        }
        class112 var3 = this.field2009;
        synchronized (this.field2009) {
            this.field2009.method987(2, arg0);
        }
        field2014++;
        class112 var4 = this.field2022;
        synchronized (this.field2022) {
            this.field2022.method987(2, arg0);
        }
    }

    @OriginalMember(owner = "client!oda", name = "c", descriptor = "(B)V")
    public static final void method1039(byte arg0) {
        class307.field4254 = class101.method941((byte) 127, 2048, 4, 8, 0.4F, 35, true, 8);
        if (arg0 == 122) {
            field2016++;
        }
    }

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(III)V")
    public final void method1040(int arg0, int arg1, int arg2) {
        field2018++;
        if (arg1 != 1) {
            field2012 = null;
        }
        this.field2009 = new class112(arg2);
        this.field2022 = new class112(arg0);
    }

    @OriginalMember(owner = "client!oda", name = "d", descriptor = "(B)V")
    public static void method1041(byte arg0) {
        field2021 = null;
        field2023 = null;
        field2019 = null;
        field2012 = null;
        if (arg0 >= -111) {
            method1039((byte) 47);
        }
    }

    @OriginalMember(owner = "client!oda", name = "<init>", descriptor = "(Lsj;ILin;Lin;)V")
    public class119(class460 arg0, int arg1, class91 arg2, class91 arg3) {
        this.field2011 = arg3;
        this.field2017 = arg2;
        this.field2017.method860(0, 34);
    }
}
