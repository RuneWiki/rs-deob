import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class97 {

    @OriginalMember(owner = "client!q", name = "l", descriptor = "I")
    private int field1392 = -1;

    @OriginalMember(owner = "client!q", name = "j", descriptor = "I")
    private int field1390 = 0;

    @OriginalMember(owner = "client!q", name = "h", descriptor = "Lek;")
    private class183 field1388 = new class183();

    @OriginalMember(owner = "client!q", name = "v", descriptor = "Z")
    public boolean field1402 = false;

    @OriginalMember(owner = "client!q", name = "b", descriptor = "I")
    private int field1382;

    @OriginalMember(owner = "client!q", name = "m", descriptor = "[Llf;")
    private class124[] field1393;

    @OriginalMember(owner = "client!q", name = "o", descriptor = "I")
    private int field1395;

    @OriginalMember(owner = "client!q", name = "e", descriptor = "[[[I")
    private int[][][] field1385;

    @OriginalMember(owner = "client!q", name = "i", descriptor = "[I")
    public static int[] field1389 = new int[5];

    @OriginalMember(owner = "client!q", name = "f", descriptor = "Lwm;")
    public static class152 field1386 = class157.method1048("Null", 112);

    @OriginalMember(owner = "client!q", name = "k", descriptor = "I")
    public static int field1391 = 99;

    @OriginalMember(owner = "client!q", name = "w", descriptor = "[I")
    public static int[] field1403 = new int[32768];

    @OriginalMember(owner = "client!q", name = "a", descriptor = "I")
    public static int field1381;

    @OriginalMember(owner = "client!q", name = "c", descriptor = "I")
    public static int field1383;

    @OriginalMember(owner = "client!q", name = "g", descriptor = "I")
    public static int field1387;

    @OriginalMember(owner = "client!q", name = "n", descriptor = "I")
    public static int field1394;

    @OriginalMember(owner = "client!q", name = "p", descriptor = "I")
    public static int field1396;

    @OriginalMember(owner = "client!q", name = "q", descriptor = "I")
    public static int field1397;

    @OriginalMember(owner = "client!q", name = "r", descriptor = "I")
    public static int field1398;

    @OriginalMember(owner = "client!q", name = "s", descriptor = "I")
    public static int field1399;

    @OriginalMember(owner = "client!q", name = "t", descriptor = "I")
    public static int field1400;

    @OriginalMember(owner = "client!q", name = "d", descriptor = "Laa;")
    public static class9 field1384;

    @OriginalMember(owner = "client!q", name = "u", descriptor = "[[[B")
    public static byte[][][] field1401;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IB)Lwm;", line = 4)
    public static final class152 method652(int arg0, byte arg1) {
        field1397++;
        class152 var2 = new class152();
        if (arg1 >= -8) {
            return (class152) null;
        } else {
            var2.field2371 = 0;
            var2.field2389 = new byte[arg0];
            return var2;
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(I)[[[I", line = 21)
    public final int[][][] method653(int arg0) {
        field1400++;
        if (this.field1395 != this.field1382) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = arg0; var2 < this.field1395; var2++) {
            this.field1393[var2] = class232.field3801;
        }
        return this.field1385;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(B)V", line = 42)
    public static void method654(byte arg0) {
        field1401 = (byte[][][]) null;
        field1384 = null;
        if (arg0 == 83) {
            field1403 = null;
            field1389 = null;
            field1386 = null;
        }
    }

    @OriginalMember(owner = "client!q", name = "b", descriptor = "(I)V", line = 60)
    public final void method655(int arg0) {
        int var2 = 0;
        if (arg0 != -16256) {
            this.method656((byte) -4, -43);
        }
        while (var2 < this.field1395) {
            this.field1385[var2][0] = null;
            this.field1385[var2][1] = null;
            this.field1385[var2][2] = null;
            this.field1385[var2] = (int[][]) null;
            var2++;
        }
        field1398++;
        this.field1393 = null;
        this.field1385 = (int[][][]) null;
        this.field1388.method1224((byte) 56);
        this.field1388 = null;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(BI)[[I", line = 87)
    public final int[][] method656(byte arg0, int arg1) {
        field1387++;
        int var3 = 7 % ((53 - arg0) / 57);
        if (this.field1395 == this.field1382) {
            this.field1402 = this.field1393[arg1] == null;
            this.field1393[arg1] = class232.field3801;
            return this.field1385[arg1];
        } else if (this.field1395 == 1) {
            this.field1402 = this.field1392 != arg1;
            this.field1392 = arg1;
            return this.field1385[0];
        } else {
            class124 var4 = this.field1393[arg1];
            if (var4 == null) {
                this.field1402 = true;
                if (this.field1390 >= this.field1395) {
                    class124 var5 = (class124) this.field1388.method1217(-74);
                    var4 = new class124(arg1, var5.field1737);
                    this.field1393[var5.field1739] = null;
                    var5.method1880(-25368);
                } else {
                    var4 = new class124(arg1, this.field1390);
                    this.field1390++;
                }
                this.field1393[arg1] = var4;
            } else {
                this.field1402 = false;
            }
            this.field1388.method1213(var4, -4087);
            return this.field1385[var4.field1737];
        }
    }

    @OriginalMember(owner = "client!q", name = "<init>", descriptor = "(III)V", line = 229)
    public class97(int arg0, int arg1, int arg2) {
        this.field1382 = arg1;
        this.field1393 = new class124[this.field1382];
        this.field1395 = arg0;
        this.field1385 = new int[this.field1395][3][arg2];
    }

    @OriginalMember(owner = "client!q", name = "c", descriptor = "(I)V", line = 178)
    public static final void method657(int arg0) {
        class223.field3631.method1619(11300);
        int var1 = -99 / ((arg0 + 60) / 49);
        field1381++;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(III)V", line = 194)
    public static final void method658(int arg0, int arg1, int arg2) {
        class49 var3 = class38.method279(arg1, false);
        field1399++;
        int var4 = var3.field769;
        int var5 = var3.field761;
        int var6 = var3.field763;
        int var7 = class275.field4710[var6 - var5];
        if (~arg0 > arg2 || arg0 > var7) {
            arg0 = 0;
        }
        int var8 = var7 << var5;
        class199.method1329(var4, ~var8 & class155.field2464[var4] | arg0 << var5 & var8, -30091);
    }
}
