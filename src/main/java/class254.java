import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class254 extends class240 {

    @OriginalMember(owner = "client!t", name = "K", descriptor = "I")
    public int field3940 = 0;

    @OriginalMember(owner = "client!t", name = "L", descriptor = "Ljava/util/Calendar;")
    public static Calendar field3941 = Calendar.getInstance();

    @OriginalMember(owner = "client!t", name = "N", descriptor = "Ljava/lang/String;")
    public static String field3943 = "Connected to update server";

    @OriginalMember(owner = "client!t", name = "P", descriptor = "Ljava/lang/String;")
    public static String field3945 = "flash1:";

    @OriginalMember(owner = "client!t", name = "O", descriptor = "[I")
    public static int[] field3944 = new int[2000];

    @OriginalMember(owner = "client!t", name = "n", descriptor = "I")
    public int field3919;

    @OriginalMember(owner = "client!t", name = "p", descriptor = "I")
    public int field3921;

    @OriginalMember(owner = "client!t", name = "r", descriptor = "I")
    public static int field3923;

    @OriginalMember(owner = "client!t", name = "s", descriptor = "I")
    public static int field3924;

    @OriginalMember(owner = "client!t", name = "v", descriptor = "I")
    public int field3927;

    @OriginalMember(owner = "client!t", name = "w", descriptor = "I")
    public int field3928;

    @OriginalMember(owner = "client!t", name = "x", descriptor = "I")
    public int field3929;

    @OriginalMember(owner = "client!t", name = "y", descriptor = "I")
    public int field3930;

    @OriginalMember(owner = "client!t", name = "B", descriptor = "I")
    public int field3932;

    @OriginalMember(owner = "client!t", name = "C", descriptor = "I")
    public int field3933;

    @OriginalMember(owner = "client!t", name = "D", descriptor = "I")
    public static int field3934;

    @OriginalMember(owner = "client!t", name = "F", descriptor = "I")
    public int field3936;

    @OriginalMember(owner = "client!t", name = "I", descriptor = "I")
    public static int field3938;

    @OriginalMember(owner = "client!t", name = "J", descriptor = "I")
    public int field3939;

    @OriginalMember(owner = "client!t", name = "M", descriptor = "I")
    public static int field3942;

    @OriginalMember(owner = "client!t", name = "Q", descriptor = "I")
    public static int field3946;

    @OriginalMember(owner = "client!t", name = "t", descriptor = "Lel;")
    public class119 field3925;

    @OriginalMember(owner = "client!t", name = "E", descriptor = "Lel;")
    public class119 field3935;

    @OriginalMember(owner = "client!t", name = "o", descriptor = "Lhk;")
    public class305 field3920;

    @OriginalMember(owner = "client!t", name = "z", descriptor = "Lnl;")
    public class30 field3931;

    @OriginalMember(owner = "client!t", name = "G", descriptor = "Lvi;")
    public class6 field3937;

    @OriginalMember(owner = "client!t", name = "q", descriptor = "Z")
    public boolean field3922;

    @OriginalMember(owner = "client!t", name = "u", descriptor = "[I")
    public int[] field3926;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;II)I", line = 5)
    public static final int method1802(String arg0, String arg1, int arg2, int arg3) {
        field3946++;
        int var4 = arg1.length();
        if (arg3 != 19) {
            method1802((String) null, (String) null, 92, 34);
        }
        int var5 = 0;
        int var6 = 0;
        char var7 = 0;
        char var8 = 0;
        int var9 = arg0.length();
        while ((var5 - var8) < var4 || var9 > (var6 - var7)) {
            if (var5 - var8 >= var4) {
                return -1;
            }
            if (var6 - var7 >= var9) {
                return 1;
            }
            char var22;
            if (var8 == '\u0000') {
                var22 = arg1.charAt(var5++);
            } else {
                var22 = var8;
                boolean var23 = false;
            }
            char var24;
            if (var7 == '\u0000') {
                var24 = arg0.charAt(var6++);
            } else {
                var24 = var7;
                boolean var25 = false;
            }
            var8 = class232.method1676(true, var22);
            var7 = class232.method1676(true, var24);
            char var26 = class18.method147(var22, -224, arg2);
            char var27 = class18.method147(var24, -224, arg2);
            if (var26 != var27 && Character.toUpperCase(var26) != Character.toUpperCase(var27)) {
                char var28 = Character.toLowerCase(var26);
                char var29 = Character.toLowerCase(var27);
                if (var28 != var29) {
                    return class173.method1276(arg2, var28, (byte) 14) - class173.method1276(arg2, var29, (byte) 14);
                }
            }
        }
        int var10 = Math.min(var4, var9);
        for (int var11 = 0; var11 < var10; var11++) {
            int var12;
            int var13;
            if (arg2 == 2) {
                var13 = var4 - var11 - 1;
                var12 = var9 - var11 - 1;
            } else {
                var12 = var11;
                var13 = var11;
            }
            char var14 = arg1.charAt(var13);
            char var15 = arg0.charAt(var12);
            if (var14 != var15 && Character.toUpperCase(var14) != Character.toUpperCase(var15)) {
                char var16 = Character.toLowerCase(var14);
                char var17 = Character.toLowerCase(var15);
                if (var16 != var17) {
                    return class173.method1276(arg2, var16, (byte) 14) - class173.method1276(arg2, var17, (byte) 14);
                }
            }
        }
        int var18 = var4 - var9;
        if (var18 != 0) {
            return var18;
        }
        for (int var19 = 0; var19 < var10; var19++) {
            char var20 = arg1.charAt(var19);
            char var21 = arg0.charAt(var19);
            if (var20 != var21) {
                return class173.method1276(arg2, var20, (byte) 14) - class173.method1276(arg2, var21, (byte) 14);
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(II)V", line = 126)
    public static final void method1803(int arg0, int arg1) {
        class240.field3732.method1828(arg0, (byte) 126);
        field3934++;
        if (arg1 != -15252) {
            field3944 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Z)V", line = 151)
    public static void method1804(boolean arg0) {
        field3944 = null;
        if (arg0) {
            field3941 = null;
            field3943 = null;
            field3945 = null;
        }
    }

    @OriginalMember(owner = "client!t", name = "b", descriptor = "(BI)Lqi;", line = 164)
    public static final class303 method1805(byte arg0, int arg1) {
        field3924++;
        if (arg0 != -118) {
            return (class303) null;
        } else if (arg1 == 0) {
            return new class288();
        } else if (arg1 == 1) {
            return new class67();
        } else if (arg1 == 2) {
            return new class25();
        } else if (arg1 == 3) {
            return new class282();
        } else if (arg1 == 4) {
            return new class307();
        } else if (arg1 == 5) {
            return new class138();
        } else if (arg1 == 6) {
            return new class75();
        } else if (arg1 == 7) {
            return new class181();
        } else if (arg1 == 8) {
            return new class35();
        } else if (arg1 == 9) {
            return new class140();
        } else if (arg1 == 10) {
            return new class147();
        } else if (arg1 == 11) {
            return new class95();
        } else if (arg1 == 12) {
            return new class245();
        } else if (arg1 == 13) {
            return new class121();
        } else if (arg1 == 14) {
            return new class50();
        } else if (arg1 == 15) {
            return new class148();
        } else if (arg1 == 16) {
            return new class59();
        } else if (arg1 == 17) {
            return new class301();
        } else if (arg1 == 18) {
            return new class65();
        } else if (arg1 == 19) {
            return new class122();
        } else if (arg1 == 20) {
            return new class212();
        } else if (arg1 == 21) {
            return new class276();
        } else if (arg1 == 22) {
            return new class233();
        } else if (arg1 == 23) {
            return new class12();
        } else if (arg1 == 24) {
            return new class82();
        } else if (arg1 == 25) {
            return new class123();
        } else if (arg1 == 26) {
            return new class273();
        } else if (arg1 == 27) {
            return new class8();
        } else if (arg1 == 28) {
            return new class127();
        } else if (arg1 == 29) {
            return new class291();
        } else if (arg1 == 30) {
            return new class17();
        } else if (arg1 == 31) {
            return new class251();
        } else if (arg1 == 32) {
            return new class252();
        } else if (arg1 == 33) {
            return new class202();
        } else if (arg1 == 34) {
            return new class91();
        } else if (arg1 == 35) {
            return new class145();
        } else if (arg1 == 36) {
            return new class279();
        } else if (arg1 == 37) {
            return new class175();
        } else if (arg1 == 38) {
            return new class40();
        } else if (arg1 == 39) {
            return new class9();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!t", name = "d", descriptor = "(I)V", line = 495)
    public final void method1806(int arg0) {
        if (arg0 != 0) {
            method1805((byte) 65, 52);
        }
        field3923++;
        int var2 = this.field3927;
        if (this.field3937 != null) {
            class6 var5 = this.field3937.method19(false);
            if (var5 == null) {
                this.field3933 = 0;
                this.field3928 = 0;
                this.field3926 = null;
                this.field3927 = -1;
                this.field3930 = 0;
            } else {
                this.field3933 = var5.field62;
                this.field3926 = var5.field68;
                this.field3930 = var5.field42 * 128;
                this.field3928 = var5.field66;
                this.field3927 = var5.field79;
            }
        } else if (this.field3920 != null) {
            int var3 = class151.method1157((byte) -117, this.field3920);
            if (var2 != var3) {
                this.field3927 = var3;
                class208 var4 = this.field3920.field4778;
                if (var4.field3313 != null) {
                    var4 = var4.method1518(-4841);
                }
                if (var4 == null) {
                    this.field3930 = 0;
                } else {
                    this.field3930 = var4.field3315 * 128;
                }
            }
        } else if (this.field3931 != null) {
            this.field3927 = class11.method92((byte) -86, this.field3931);
            this.field3930 = this.field3931.field483 * 128;
        }
        if (this.field3927 != var2 && this.field3925 != null) {
            class128.field2045.method358(this.field3925);
            this.field3925 = null;
        }
    }
}
