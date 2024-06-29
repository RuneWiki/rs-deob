import java.math.BigInteger;
import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class84 {

    @OriginalMember(owner = "client!rf", name = "e", descriptor = "Ljava/math/BigInteger;")
    private BigInteger field1013;

    @OriginalMember(owner = "client!rf", name = "q", descriptor = "Ljava/math/BigInteger;")
    private BigInteger field1025;

    @OriginalMember(owner = "client!rf", name = "j", descriptor = "Ltk;")
    private class348 field1018;

    @OriginalMember(owner = "client!rf", name = "d", descriptor = "Leia;")
    private class244 field1012;

    @OriginalMember(owner = "client!rf", name = "i", descriptor = "Lic;")
    private class700 field1017;

    @OriginalMember(owner = "client!rf", name = "k", descriptor = "Ljava/util/Calendar;")
    public static Calendar field1019 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!rf", name = "r", descriptor = "[[B")
    public static byte[][] field1026 = new byte[50][];

    @OriginalMember(owner = "client!rf", name = "p", descriptor = "D")
    public static double field1024;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "I")
    public static int field1009;

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "I")
    public static int field1010;

    @OriginalMember(owner = "client!rf", name = "f", descriptor = "I")
    public static int field1014;

    @OriginalMember(owner = "client!rf", name = "g", descriptor = "I")
    public static int field1015;

    @OriginalMember(owner = "client!rf", name = "l", descriptor = "I")
    public static int field1020;

    @OriginalMember(owner = "client!rf", name = "m", descriptor = "I")
    public static int field1021;

    @OriginalMember(owner = "client!rf", name = "n", descriptor = "I")
    public static int field1022;

    @OriginalMember(owner = "client!rf", name = "o", descriptor = "Lwu;")
    public static class376 field1023;

    @OriginalMember(owner = "client!rf", name = "h", descriptor = "Lee;")
    private class677 field1016;

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "[Lpv;")
    private class71[] field1011;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(III)Lkb;", line = 4)
    public static final class691 method647(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            field1026 = null;
        }
        field1010++;
        class691 var3 = new class691();
        var3.field9625 = arg1 + 1 + 5;
        var3.field9624 = -1;
        var3.field9620 = arg0 + 6;
        var3.field9640 = -1;
        var3.field9639 = new int[var3.field9620][var3.field9625];
        var3.method3888((byte) 12);
        return var3;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(I)V", line = 29)
    public static void method648(int arg0) {
        field1019 = null;
        if (arg0 != -17) {
            method648(-7);
        }
        field1026 = null;
        field1023 = null;
    }

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "(I)Z", line = 44)
    public final boolean method649(int arg0) {
        field1015++;
        if (this.field1016 != null) {
            return true;
        }
        if (this.field1017 == null) {
            if (this.field1018.method2094(0)) {
                return false;
            }
            this.field1017 = this.field1018.method2093(true, (byte) 0, 255, 255, 22013);
        }
        if (this.field1017.field7580) {
            return false;
        }
        class677 var2 = new class677(this.field1017.method3171(0));
        var2.field9419 = 5;
        int var3 = var2.method3821((byte) 111);
        var2.field9419 += var3 * 72;
        byte[] var4 = new byte[var2.field9399.length - var2.field9419];
        int var5 = 108 / ((arg0 + 4) / 55);
        var2.method3801(var4, 0, var4.length, 124);
        byte[] var8;
        if (this.field1013 == null || this.field1025 == null) {
            var8 = var4;
        } else {
            BigInteger var6 = new BigInteger(var4);
            BigInteger var7 = var6.modPow(this.field1013, this.field1025);
            var8 = var7.toByteArray();
        }
        if (var8.length != 65) {
            throw new RuntimeException();
        }
        byte[] var9 = class468.method2643(0, var2.field9399, var2.field9419 - var4.length - 5, 5);
        for (int var10 = 0; var10 < 64; var10++) {
            if (var8[var10 + 1] != var9[var10]) {
                throw new RuntimeException();
            }
        }
        this.field1011 = new class71[var3];
        this.field1016 = var2;
        return true;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IB)Z", line = 118)
    public static final boolean method650(int arg0, byte arg1) {
        field1022++;
        int var2 = 124 / ((arg1 + 57) / 54);
        if (arg0 == 16 || arg0 == 4 || arg0 == 49 || arg0 == 10 || arg0 == 1008) {
            return true;
        } else {
            return arg0 == 46 || arg0 == 1009;
        }
    }

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "(I)[Lhda;", line = 135)
    public static final class752[] method651(int arg0) {
        field1021++;
        if (arg0 != -5) {
            field1026 = null;
        }
        return new class752[] { class256.field3514, class225.field3203, class734.field10158, class378.field5267, class6.field135, class676.field9377, class427.field5893, class55.field661, class104.field1433, class269.field3763, class546.field7222, class551.field7270, class116.field1874, class392.field5473, class128.field2116, class217.field3139, class427.field5881, class446.field6123, class11.field180, class696.field9690, class79.field958, class51.field644, class60.field750, class390.field5471, class708.field9802, class434.field5976, class566.field7444, class100.field1296, class712.field9852, class343.field4825, class480.field6580, class708.field9820, class317.field4523, class251.field3464, class113.field1861, class425.field5851, class5.field128, class537.field7070, class223.field3164, class759.field10561, class354.field4986, class739.field10202, class218.field3144, class103.field1428, class681.field9518, class428.field5898, class650.field8632, class57.field688, class716.field9871, class745.field10374, class178.field2680, class723.field10079, class2.field15, class526.field6979, class14.field207, class104.field1432, class734.field10157, class276.field3850, class573.field7525, class561.field7364, class137.field2174, class105.field1436, class471.field6451, class411.field5708, class47.field599, class228.field3252, class595.field7744, class562.field7368, class359.field5043, class704.field9763, class603.field7923, class11.field177, class50.field636, class392.field5480, class540.field7154, class171.field2621, class322.field4586, class659.field8701, class305.field4386, class183.field2778, class631.field8411, class333.field4732, class359.field5021, class591.field7694, class702.field9748, class180.field2721, class255.field3499, class555.field7293, class128.field2103, class111.field1617, class243.field3402, class110.field1516, class648.field8616, class260.field3628, class250.field3441, class183.field2766, class420.field5782, class47.field597, class347.field4864, class225.field3206, class143.field2289, class506.field6763, class668.field9115, class164.field2487, class307.field4414, class393.field5484, class668.field9125, class276.field3841, class352.field4947, class275.field3834, class370.field5159, class283.field4001, class141.field2260, class445.field6115, class750.field10443, class28.field436, class51.field642, class411.field5698, class343.field4827, class207.field3071, class339.field4794, class563.field7373, class4.field117, class316.field4512 };
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(ZILmi;BLmi;)Lpv;", line = 149)
    private final class71 method652(boolean arg0, int arg1, class498 arg2, byte arg3, class498 arg4) {
        field1009++;
        if (this.field1016 == null) {
            throw new RuntimeException();
        } else if (arg1 < 0 || this.field1011.length <= arg1) {
            throw new RuntimeException();
        } else if (this.field1011[arg1] == null) {
            this.field1016.field9419 = arg1 * 72 + 6;
            int var6 = this.field1016.method3799(false);
            if (arg3 != 53) {
                method647(58, 49, 94);
            }
            int var7 = this.field1016.method3799(false);
            byte[] var8 = new byte[64];
            this.field1016.method3801(var8, 0, 64, 91);
            class71 var9 = new class71(arg1, arg2, arg4, this.field1018, this.field1012, var6, var8, var7, arg0);
            this.field1011[arg1] = var9;
            return var9;
        } else {
            return this.field1011[arg1];
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lmi;ILmi;Z)Lpv;", line = 193)
    public final class71 method653(class498 arg0, int arg1, class498 arg2, boolean arg3) {
        field1020++;
        return arg3 ? null : this.method652(true, arg1, arg2, (byte) 53, arg0);
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(B)V", line = 215)
    public final void method654(byte arg0) {
        field1014++;
        if (this.field1011 == null) {
            return;
        }
        if (arg0 != -43) {
            field1019 = null;
        }
        for (int var2 = 0; var2 < this.field1011.length; var2++) {
            if (this.field1011[var2] != null) {
                this.field1011[var2].method584(arg0 ^ 0xFFFFFFD7);
            }
        }
        for (int var3 = 0; var3 < this.field1011.length; var3++) {
            if (this.field1011[var3] != null) {
                this.field1011[var3].method581(0);
            }
        }
    }

    @OriginalMember(owner = "client!rf", name = "<init>", descriptor = "(Ltk;Leia;Ljava/math/BigInteger;Ljava/math/BigInteger;)V", line = 250)
    public class84(class348 arg0, class244 arg1, BigInteger arg2, BigInteger arg3) {
        this.field1013 = arg2;
        this.field1025 = arg3;
        this.field1018 = arg0;
        this.field1012 = arg1;
        if (!this.field1018.method2094(0)) {
            this.field1017 = this.field1018.method2093(true, (byte) 0, 255, 255, 22013);
        }
    }
}
