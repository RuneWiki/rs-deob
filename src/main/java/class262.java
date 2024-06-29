import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class262 extends class317 {

    @OriginalMember(owner = "client!ei", name = "T", descriptor = "I")
    private int field3851 = 4096;

    @OriginalMember(owner = "client!ei", name = "O", descriptor = "I")
    private int field3846 = 0;

    @OriginalMember(owner = "client!ei", name = "K", descriptor = "I")
    public static int field3842 = -1;

    @OriginalMember(owner = "client!ei", name = "S", descriptor = "[I")
    public static int[] field3850 = new int[14];

    @OriginalMember(owner = "client!ei", name = "X", descriptor = "Z")
    public static boolean field3855 = false;

    @OriginalMember(owner = "client!ei", name = "Q", descriptor = "[Lfa;")
    public static class259[] field3848 = new class259[0];

    @OriginalMember(owner = "client!ei", name = "U", descriptor = "[I")
    public static int[] field3852 = new int[100];

    @OriginalMember(owner = "client!ei", name = "W", descriptor = "[I")
    public static int[] field3854 = new int[] { 12543016, 15504954, 15914854, 16773818 };

    @OriginalMember(owner = "client!ei", name = "J", descriptor = "I")
    public static int field3841;

    @OriginalMember(owner = "client!ei", name = "L", descriptor = "I")
    public static int field3843;

    @OriginalMember(owner = "client!ei", name = "M", descriptor = "I")
    public static int field3844;

    @OriginalMember(owner = "client!ei", name = "N", descriptor = "I")
    public static int field3845;

    @OriginalMember(owner = "client!ei", name = "P", descriptor = "I")
    public static int field3847;

    @OriginalMember(owner = "client!ei", name = "R", descriptor = "I")
    public static int field3849;

    @OriginalMember(owner = "client!ei", name = "V", descriptor = "I")
    public static int field3853;

    @OriginalMember(owner = "client!ei", name = "Y", descriptor = "I")
    public static int field3856;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(Lcg;I)V", line = 6)
    public static final void method1789(class316 arg0, int arg1) {
        field3856++;
        byte[] var2 = new byte[24];
        if (class255.field3647 != null) {
            try {
                class255.field3647.method388((byte) 105, 0L);
                int var3 = 0;
                class255.field3647.method396(true, var2);
                while (var3 < 24 && var2[var3] == 0) {
                    var3++;
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var6) {
                for (int var5 = 0; var5 < 24; var5++) {
                    var2[var5] = -1;
                }
            }
        }
        arg0.method2218(103, arg1, 24, var2);
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(ZI)V", line = 47)
    public static final void method1790(boolean arg0, int arg1) {
        class143 var2 = class163.method1176((byte) -114, arg1, 7);
        var2.method1038(0);
        if (arg0) {
            field3842 = 63;
        }
        field3843++;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IILbo;)V", line = 59)
    public static final void method1791(int arg0, int arg1, class256 arg2) {
        if (arg0 != -14374) {
            return;
        }
        field3845++;
        if (arg2.field3758 > class329.field4966) {
            class122.method882(-14, arg2);
        } else if (arg2.field3701 < class329.field4966) {
            class154.method1114(-118, arg2);
        } else {
            class339.method2344(-68, arg2);
        }
        if (arg2.field3745 < 128 || arg2.field3679 < 128 || arg2.field3745 >= 13184 || arg2.field3679 >= 13184) {
            arg2.field3701 = 0;
            arg2.field3715 = -1;
            arg2.field3758 = 0;
            arg2.field3668 = -1;
            arg2.field3745 = arg2.field3706[0] * 128 + arg2.method1653(-1) * 64;
            arg2.field3679 = arg2.field3768[0] * 128 + (arg2.method1653(-1) * 64);
            arg2.method1760(23157);
        }
        if (class173.field2356 == arg2 && (arg2.field3745 < 1536 || arg2.field3679 < 1536 || arg2.field3745 >= 11776 || arg2.field3679 >= 11776)) {
            arg2.field3715 = -1;
            arg2.field3668 = -1;
            arg2.field3701 = 0;
            arg2.field3758 = 0;
            arg2.field3745 = arg2.field3706[0] * 128 + arg2.method1653(-1) * 64;
            arg2.field3679 = arg2.field3768[0] * 128 + (arg2.method1653(-1) * 64);
            arg2.method1760(arg0 + 37531);
        }
        class176.method1221(arg2, -92);
        class194.method1358(arg2, false);
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(BJ)V", line = 110)
    public static final void method1792(byte arg0, long arg1) {
        field3849++;
        if (arg1 == 0L || arg0 < 33) {
            return;
        }
        for (int var3 = 0; var3 < class64.field826; var3++) {
            if (class143.field1966[var3] == arg1) {
                class64.field826--;
                for (int var4 = var3; var4 < class64.field826; var4++) {
                    class143.field1966[var4] = class143.field1966[var4 + 1];
                    class231.field3269[var4] = class231.field3269[var4 + 1];
                    class113.field1551[var4] = class113.field1551[var4 + 1];
                }
                class92.field1274++;
                class201.field2856 = class185.field2549;
                class90.field1264.method2238(85, (byte) -128);
                class90.field1264.method2202(arg1, -128);
                break;
            }
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(BLkm;)V", line = 161)
    public static final void method1793(byte arg0, class133 arg1) {
        field3847++;
        class78.field1122 = arg1;
        if (arg0 != 122) {
            method1793((byte) -55, (class133) null);
        }
    }

    @OriginalMember(owner = "client!ei", name = "e", descriptor = "(B)V", line = 182)
    public static void method1794(byte arg0) {
        field3852 = null;
        if (arg0 == -102) {
            field3848 = null;
            field3854 = null;
            field3850 = null;
        }
    }

    @OriginalMember(owner = "client!ei", name = "<init>", descriptor = "()V", line = 197)
    public class262() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(II)[[I", line = 210)
    public final int[][] method53(int arg0, int arg1) {
        int var3 = -95 % ((-arg0 - 31) / 37);
        int[][] var4 = this.field4840.method1625(arg1, -13241);
        if (this.field4840.field3352) {
            int[][] var5 = this.method2227(0, 21, arg1);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var5[2];
            int[] var9 = var4[1];
            int[] var10 = var4[2];
            int[] var11 = var4[0];
            for (int var12 = 0; var12 < class326.field4933; var12++) {
                int var13 = var6[var12];
                int var14 = var7[var12];
                int var15 = var8[var12];
                if (this.field3846 > var13) {
                    var11[var12] = this.field3846;
                } else if (var13 <= this.field3851) {
                    var11[var12] = var13;
                } else {
                    var11[var12] = this.field3851;
                }
                if (var14 < this.field3846) {
                    var9[var12] = this.field3846;
                } else if (this.field3851 < var14) {
                    var9[var12] = this.field3851;
                } else {
                    var9[var12] = var14;
                }
                if (var15 < this.field3846) {
                    var10[var12] = this.field3846;
                } else if (this.field3851 < var15) {
                    var10[var12] = this.field3851;
                } else {
                    var10[var12] = var15;
                }
            }
        }
        field3841++;
        return var4;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(Lcg;II)V", line = 284)
    public final void method60(class316 arg0, int arg1, int arg2) {
        field3844++;
        int var4 = 33 / ((arg1 + 17) / 40);
        if (arg2 == 0) {
            this.field3846 = arg0.method2220((byte) 91);
        } else if (arg2 == 1) {
            this.field3851 = arg0.method2220((byte) 77);
        } else if (arg2 == 2) {
            this.field4835 = arg0.method2219(16448) == 1;
        }
    }

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "(II)[I", line = 333)
    public final int[] method140(int arg0, int arg1) {
        int[] var3 = this.field4847.method1387(arg1, (byte) -30);
        if (this.field4847.field2751) {
            int[] var4 = this.method2225((byte) 66, 0, arg1);
            for (int var5 = 0; var5 < class326.field4933; var5++) {
                int var6 = var4[var5];
                if (this.field3846 > var6) {
                    var3[var5] = this.field3846;
                } else if (var6 > this.field3851) {
                    var3[var5] = this.field3851;
                } else {
                    var3[var5] = var6;
                }
            }
        }
        if (arg0 != 542) {
            method1793((byte) -87, (class133) null);
        }
        field3853++;
        return var3;
    }
}
