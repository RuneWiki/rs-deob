import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class314 {

    @OriginalMember(owner = "client!n", name = "l", descriptor = "I")
    private int field4923 = 0;

    @OriginalMember(owner = "client!n", name = "e", descriptor = "Z")
    public boolean field4916 = false;

    @OriginalMember(owner = "client!n", name = "h", descriptor = "I")
    public int field4919 = -1;

    @OriginalMember(owner = "client!n", name = "o", descriptor = "I")
    private int field4926 = 128;

    @OriginalMember(owner = "client!n", name = "i", descriptor = "I")
    private int field4920 = 128;

    @OriginalMember(owner = "client!n", name = "c", descriptor = "I")
    private int field4914 = 0;

    @OriginalMember(owner = "client!n", name = "j", descriptor = "I")
    private int field4921 = 0;

    @OriginalMember(owner = "client!n", name = "w", descriptor = "Z")
    public boolean field4934 = false;

    @OriginalMember(owner = "client!n", name = "d", descriptor = "Ljava/lang/String;")
    public static String field4915 = " from your ignore list first.";

    @OriginalMember(owner = "client!n", name = "u", descriptor = "I")
    public static int field4932 = -1;

    @OriginalMember(owner = "client!n", name = "t", descriptor = "I")
    public static int field4931 = 0;

    @OriginalMember(owner = "client!n", name = "q", descriptor = "Lfj;")
    public static class266 field4928 = new class266(0, 0);

    @OriginalMember(owner = "client!n", name = "y", descriptor = "I")
    public static int field4936 = 0;

    @OriginalMember(owner = "client!n", name = "x", descriptor = "Llf;")
    public static class143 field4935 = new class143(new byte[5000]);

    @OriginalMember(owner = "client!n", name = "a", descriptor = "I")
    public static int field4912;

    @OriginalMember(owner = "client!n", name = "b", descriptor = "I")
    private int field4913;

    @OriginalMember(owner = "client!n", name = "f", descriptor = "I")
    public static int field4917;

    @OriginalMember(owner = "client!n", name = "n", descriptor = "I")
    public static int field4925;

    @OriginalMember(owner = "client!n", name = "r", descriptor = "I")
    public static int field4929;

    @OriginalMember(owner = "client!n", name = "s", descriptor = "I")
    public static int field4930;

    @OriginalMember(owner = "client!n", name = "v", descriptor = "I")
    public int field4933;

    @OriginalMember(owner = "client!n", name = "g", descriptor = "[S")
    private short[] field4918;

    @OriginalMember(owner = "client!n", name = "k", descriptor = "[S")
    private short[] field4922;

    @OriginalMember(owner = "client!n", name = "m", descriptor = "[S")
    private short[] field4924;

    @OriginalMember(owner = "client!n", name = "p", descriptor = "[S")
    private short[] field4927;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IIII)Lbf;", line = 8)
    public final class362 method2216(int arg0, int arg1, int arg2, int arg3) {
        field4917++;
        class362 var5 = (class362) class332.field5309.method380(0, (long) this.field4933);
        if (var5 == null) {
            class193 var6 = class193.method1319(class334.field5335, this.field4913, 0);
            if (var6 == null) {
                return null;
            }
            if (this.field4918 != null) {
                for (int var7 = 0; var7 < this.field4918.length; var7++) {
                    var6.method1339(this.field4918[var7], this.field4927[var7]);
                }
            }
            if (this.field4922 != null) {
                for (int var8 = 0; var8 < this.field4922.length; var8++) {
                    var6.method1331(this.field4922[var8], this.field4924[var8]);
                }
            }
            var5 = var6.method1324(this.field4921 + 64, this.field4914 + 850, -30, -50, -30);
            class332.field5309.method377((long) this.field4933, var5, -1);
        }
        class362 var9;
        if (this.field4919 == -1 || arg2 == -1) {
            var9 = var5.method797(true, true, true);
        } else {
            var9 = class289.method2067((byte) -72, this.field4919).method722(true, arg0, arg2, var5, arg1);
        }
        if (this.field4926 != 128 || this.field4920 != 128) {
            var9.method831(this.field4926, this.field4920, this.field4926);
        }
        if (arg3 != 41) {
            return (class362) null;
        }
        if (this.field4923 != 0) {
            if (this.field4923 == 90) {
                var9.method826();
            }
            if (this.field4923 == 180) {
                var9.method809();
            }
            if (this.field4923 == 270) {
                var9.method800();
            }
        }
        return var9;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(I)V", line = 91)
    public static final void method2217(int arg0) {
        field4930++;
        class187.field2808.method378(arg0 ^ arg0);
        class303.field4715.method378(0);
        class90.field1185.method378(0);
        class139.field2078.method378(arg0 + 13945);
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "(I)V", line = 109)
    public static void method2218(int arg0) {
        field4928 = null;
        if (arg0 != 0) {
            field4932 = -70;
        }
        field4935 = null;
        field4915 = null;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(II)Lak;", line = 130)
    public static final class344 method2219(int arg0, int arg1) {
        field4929++;
        class344 var2 = (class344) class43.field477.method1998(-1114531641, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class58.field683.method100(class176.method1223((byte) 11, arg1), class192.method1312(arg1, 64), (byte) -107);
        if (arg0 != 128) {
            field4935 = (class143) null;
        }
        class344 var4 = new class344();
        if (var3 != null) {
            var4.method2381(113, new class143(var3));
        }
        class43.field477.method2000(var4, (byte) -113, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Llf;I)V", line = 155)
    public final void method2220(class143 arg0, int arg1) {
        if (arg1 != 180) {
            field4932 = -126;
        }
        field4912++;
        while (true) {
            int var3 = arg0.method1043(true);
            if (var3 == 0) {
                return;
            }
            this.method2221((byte) 101, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(BILlf;)V", line = 175)
    private final void method2221(byte arg0, int arg1, class143 arg2) {
        field4925++;
        if (arg0 < 44) {
            return;
        }
        if (arg1 == 1) {
            this.field4913 = arg2.method1051(1);
        } else if (arg1 == 2) {
            this.field4919 = arg2.method1051(1);
        } else if (arg1 == 4) {
            this.field4926 = arg2.method1051(1);
        } else if (arg1 == 5) {
            this.field4920 = arg2.method1051(1);
        } else if (arg1 == 6) {
            this.field4923 = arg2.method1051(1);
        } else if (arg1 == 7) {
            this.field4921 = arg2.method1043(true);
        } else if (arg1 == 8) {
            this.field4914 = arg2.method1043(true);
        } else if (arg1 == 9) {
            this.field4916 = true;
        } else if (arg1 == 10) {
            this.field4934 = true;
        } else if (arg1 == 40) {
            int var4 = arg2.method1043(true);
            this.field4918 = new short[var4];
            this.field4927 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field4918[var5] = (short) arg2.method1051(1);
                this.field4927[var5] = (short) arg2.method1051(1);
            }
        } else if (arg1 == 41) {
            int var6 = arg2.method1043(true);
            this.field4924 = new short[var6];
            this.field4922 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field4922[var7] = (short) arg2.method1051(1);
                this.field4924[var7] = (short) arg2.method1051(1);
            }
        }
    }
}
