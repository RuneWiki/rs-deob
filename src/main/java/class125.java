import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public class class125 {

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "I")
    public int field2012 = 128;

    @OriginalMember(owner = "client!kk", name = "m", descriptor = "I")
    public int field2023 = 128;

    @OriginalMember(owner = "client!kk", name = "g", descriptor = "I")
    public int field2017;

    @OriginalMember(owner = "client!kk", name = "f", descriptor = "I")
    public int field2016;

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "I")
    public int field2011;

    @OriginalMember(owner = "client!kk", name = "e", descriptor = "I")
    public int field2015;

    @OriginalMember(owner = "client!kk", name = "l", descriptor = "Ljv;")
    public static class55 field2022 = new class55(64);

    @OriginalMember(owner = "client!kk", name = "n", descriptor = "J")
    public static long field2024 = 0L;

    @OriginalMember(owner = "client!kk", name = "c", descriptor = "I")
    public int field2013;

    @OriginalMember(owner = "client!kk", name = "d", descriptor = "I")
    public int field2014;

    @OriginalMember(owner = "client!kk", name = "h", descriptor = "I")
    public static int field2018;

    @OriginalMember(owner = "client!kk", name = "i", descriptor = "I")
    public static int field2019;

    @OriginalMember(owner = "client!kk", name = "j", descriptor = "I")
    public int field2020;

    @OriginalMember(owner = "client!kk", name = "k", descriptor = "I")
    public int field2021;

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(Lkk;B)V")
    public final void method952(class125 arg0, byte arg1) {
        this.field2011 = arg0.field2011;
        this.field2016 = arg0.field2016;
        this.field2015 = arg0.field2015;
        this.field2017 = arg0.field2017;
        this.field2012 = arg0.field2012;
        field2018++;
        this.field2023 = arg0.field2023;
        if (arg1 != -98) {
            this.method955((byte) 21);
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(II)I")
    public static int method953(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(I)V")
    public static void method954(int arg0) {
        field2022 = null;
        if (arg0 != 6779) {
            field2022 = null;
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(B)Lkk;")
    public final class125 method955(byte arg0) {
        field2019++;
        int var2 = 15 / ((80 - arg0) / 46);
        return new class125(this.field2017, this.field2012, this.field2023, this.field2016, this.field2015, this.field2011);
    }

    @OriginalMember(owner = "client!kk", name = "<init>", descriptor = "(I)V")
    public class125(int arg0) {
        this.field2017 = arg0;
    }

    @OriginalMember(owner = "client!kk", name = "<init>", descriptor = "(IIIIII)V")
    private class125(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field2016 = arg3;
        this.field2017 = arg0;
        this.field2012 = arg1;
        this.field2011 = arg5;
        this.field2023 = arg2;
        this.field2015 = arg4;
    }
}
