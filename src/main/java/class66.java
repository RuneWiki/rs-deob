import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class66 {

    @OriginalMember(owner = "client!jf", name = "l", descriptor = "Z")
    public boolean field1069 = false;

    @OriginalMember(owner = "client!jf", name = "k", descriptor = "I")
    public int field1068 = -1;

    @OriginalMember(owner = "client!jf", name = "q", descriptor = "[I")
    private int[] field1074 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!jf", name = "j", descriptor = "I")
    public static int field1067 = 127;

    @OriginalMember(owner = "client!jf", name = "p", descriptor = "Ljava/lang/String;")
    public static String field1073 = " from your ignore list first.";

    @OriginalMember(owner = "client!jf", name = "v", descriptor = "J")
    public static long field1079 = 0L;

    @OriginalMember(owner = "client!jf", name = "x", descriptor = "I")
    public static int field1081 = -1;

    @OriginalMember(owner = "client!jf", name = "n", descriptor = "Lnb;")
    public static class223 field1071 = new class223();

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "I")
    public static int field1059;

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "I")
    public static int field1061;

    @OriginalMember(owner = "client!jf", name = "g", descriptor = "I")
    public static int field1064;

    @OriginalMember(owner = "client!jf", name = "h", descriptor = "I")
    public static int field1065;

    @OriginalMember(owner = "client!jf", name = "i", descriptor = "I")
    public static int field1066;

    @OriginalMember(owner = "client!jf", name = "m", descriptor = "I")
    public static int field1070;

    @OriginalMember(owner = "client!jf", name = "o", descriptor = "I")
    public static int field1072;

    @OriginalMember(owner = "client!jf", name = "s", descriptor = "I")
    public static int field1076;

    @OriginalMember(owner = "client!jf", name = "t", descriptor = "I")
    public static int field1077;

    @OriginalMember(owner = "client!jf", name = "u", descriptor = "I")
    public static int field1078;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "[I")
    private int[] field1058;

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "[S")
    private short[] field1060;

    @OriginalMember(owner = "client!jf", name = "e", descriptor = "[S")
    private short[] field1062;

    @OriginalMember(owner = "client!jf", name = "f", descriptor = "[S")
    private short[] field1063;

    @OriginalMember(owner = "client!jf", name = "r", descriptor = "[S")
    private short[] field1075;

    @OriginalMember(owner = "client!jf", name = "w", descriptor = "[[S")
    public static short[][] field1080;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(I)Z")
    public final boolean method432(int arg0) {
        field1065++;
        if (this.field1058 == null) {
            return true;
        }
        boolean var2 = true;
        for (int var3 = arg0; var3 < this.field1058.length; var3++) {
            if (!class254.field4203.method1165(this.field1058[var3], 0, (byte) 122)) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(I[I)[I")
    public static final int[] method433(int arg0, int[] arg1) {
        field1072++;
        if (arg1 == null) {
            return null;
        } else {
            int[] var2 = new int[arg1.length];
            class282.method1923(arg1, 0, var2, 0, arg1.length);
            int var3 = -123 % ((arg0 - 68) / 40);
            return var2;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(B)V")
    public static void method434(byte arg0) {
        int var1 = 3 / ((42 - arg0) / 49);
        field1080 = null;
        field1073 = null;
        field1071 = null;
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(I)Z")
    public final boolean method435(int arg0) {
        boolean var2 = true;
        field1059++;
        if (arg0 != 5) {
            field1073 = null;
        }
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field1074[var3] != -1 && !class254.field4203.method1165(this.field1074[var3], 0, (byte) -111)) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lfj;B)V")
    public final void method436(class274 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method1849(255);
            if (var3 == 0) {
                if (arg1 != -48) {
                    field1081 = 34;
                }
                field1076++;
                return;
            }
            this.method438(arg0, false, var3);
        }
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(B)Lul;")
    public final class201 method437(byte arg0) {
        field1077++;
        if (arg0 != 75) {
            this.field1074 = null;
        }
        class201[] var2 = new class201[5];
        int var3 = 0;
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field1074[var4] != -1) {
                var2[var3++] = class201.method1380(class254.field4203, this.field1074[var4], 0);
            }
        }
        class201 var5 = new class201(var2, var3);
        if (this.field1063 != null) {
            for (int var6 = 0; var6 < this.field1063.length; var6++) {
                var5.method1403(this.field1063[var6], this.field1062[var6]);
            }
        }
        if (this.field1060 != null) {
            for (int var7 = 0; var7 < this.field1060.length; var7++) {
                var5.method1384(this.field1060[var7], this.field1075[var7]);
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lfj;ZI)V")
    private final void method438(class274 arg0, boolean arg1, int arg2) {
        if (arg2 == 1) {
            this.field1068 = arg0.method1849(255);
        } else if (arg2 == 2) {
            int var4 = arg0.method1849(255);
            this.field1058 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1058[var5] = arg0.method1837(252);
            }
        } else if (arg2 == 3) {
            this.field1069 = true;
        } else if (arg2 == 40) {
            int var8 = arg0.method1849(255);
            this.field1062 = new short[var8];
            this.field1063 = new short[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field1063[var9] = (short) arg0.method1837(252);
                this.field1062[var9] = (short) arg0.method1837(252);
            }
        } else if (arg2 == 41) {
            int var6 = arg0.method1849(255);
            this.field1075 = new short[var6];
            this.field1060 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field1060[var7] = (short) arg0.method1837(252);
                this.field1075[var7] = (short) arg0.method1837(252);
            }
        } else if (arg2 >= 60 && arg2 < 70) {
            this.field1074[arg2 - 60] = arg0.method1837(252);
        }
        field1066++;
        if (arg1) {
            method439((byte) 14);
        }
    }

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "(B)V")
    public static final void method439(byte arg0) {
        if (arg0 > -74) {
            field1079 = -46L;
        }
        class146.field2348.method1873(-7401);
        field1061++;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(ILfj;)Luc;")
    public static final class40 method440(int arg0, class274 arg1) {
        if (arg0 < 70) {
            return null;
        } else {
            field1070++;
            return new class40(arg1.method1847(-404), arg1.method1847(-404), arg1.method1847(-404), arg1.method1847(-404), arg1.method1812(true), arg1.method1849(255));
        }
    }

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "(I)V")
    public static final void method441(int arg0) {
        if (class249.field4095 < 0) {
            class208.field3314 = -1;
            class249.field4095 = 0;
            class16.field305 = -1;
        }
        if (class249.field4095 > class262.field4277) {
            class16.field305 = -1;
            class249.field4095 = class262.field4277;
            class208.field3314 = -1;
        }
        if (class45.field667 < 0) {
            class208.field3314 = -1;
            class45.field667 = 0;
            class16.field305 = -1;
        }
        int var1 = 100 % ((arg0 - 2) / 47);
        field1078++;
        if (class45.field667 > class262.field4278) {
            class45.field667 = class262.field4278;
            class16.field305 = -1;
            class208.field3314 = -1;
        }
    }

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "(B)Lul;")
    public final class201 method442(byte arg0) {
        field1064++;
        if (this.field1058 == null) {
            return null;
        }
        class201[] var2 = new class201[this.field1058.length];
        for (int var3 = 0; var3 < this.field1058.length; var3++) {
            var2[var3] = class201.method1380(class254.field4203, this.field1058[var3], 0);
        }
        class201 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class201(var2, var2.length);
        }
        if (this.field1063 != null) {
            for (int var5 = 0; var5 < this.field1063.length; var5++) {
                var4.method1403(this.field1063[var5], this.field1062[var5]);
            }
        }
        if (this.field1060 != null) {
            for (int var6 = 0; var6 < this.field1060.length; var6++) {
                var4.method1384(this.field1060[var6], this.field1075[var6]);
            }
        }
        if (arg0 > -124) {
            method434((byte) 51);
        }
        return var4;
    }
}
