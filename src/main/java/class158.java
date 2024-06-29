import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class158 extends class107 {

    @OriginalMember(owner = "client!l", name = "Y", descriptor = "I")
    public static int field2854 = 0;

    @OriginalMember(owner = "client!l", name = "V", descriptor = "Lpj;")
    private static class237 field2851 = class33.method353("Prepared sound engine", 40);

    @OriginalMember(owner = "client!l", name = "ab", descriptor = "Lpj;")
    public static class237 field2856 = field2851;

    @OriginalMember(owner = "client!l", name = "bb", descriptor = "[I")
    public static int[] field2857 = new int[32];

    @OriginalMember(owner = "client!l", name = "P", descriptor = "I")
    public static int field2845;

    @OriginalMember(owner = "client!l", name = "Q", descriptor = "I")
    public static int field2846;

    @OriginalMember(owner = "client!l", name = "R", descriptor = "I")
    public static int field2847;

    @OriginalMember(owner = "client!l", name = "S", descriptor = "I")
    public static int field2848;

    @OriginalMember(owner = "client!l", name = "T", descriptor = "I")
    public static int field2849;

    @OriginalMember(owner = "client!l", name = "U", descriptor = "I")
    public static int field2850;

    @OriginalMember(owner = "client!l", name = "W", descriptor = "I")
    public static int field2852;

    @OriginalMember(owner = "client!l", name = "X", descriptor = "I")
    public static int field2853;

    @OriginalMember(owner = "client!l", name = "Z", descriptor = "I")
    public static int field2855;

    @OriginalMember(owner = "client!l", name = "cb", descriptor = "I")
    public static int field2858;

    @OriginalMember(owner = "client!l", name = "d", descriptor = "(B)V")
    public static final void method1119(byte arg0) {
        ++field2847;
        int var1 = class80.field1507.method1342(class239.field4181);
        for (int var2 = 0; var2 < class271.field4664; ++var2) {
            int var6 = class80.field1507.method1342(class15.method135((byte) -88, var2));
            if (var1 < var6) {
                var1 = var6;
            }
        }
        var1 += 8;
        int var3 = class271.field4664 * 15 + 21;
        int var4 = -(var1 / 2) + class169.field2968;
        if (~(var4 - -var1) < ~class142.field2585) {
            var4 = class142.field2585 - var1;
        }
        int var5 = class126.field2201;
        if (~(var5 - -var3) < ~class119.field2087) {
            var5 = class119.field2087 - var3;
        }
        if (~var5 > -1) {
            var5 = 0;
        }
        if (var4 < 0) {
            var4 = 0;
        }
        if (arg0 != 91) {
            field2854 = -106;
        }
        if (class260.field4465 == 1) {
            if (~class243.field4270 == ~class169.field2968 && ~class3.field39 == ~class126.field2201) {
                class23.field423 = var1;
                class247.field4306 = true;
                class166.field2940 = class271.field4664 * 15 + 22;
                class269.field4599 = var4;
                class176.field3088 = var5;
                class260.field4465 = 0;
                return;
            }
        } else {
            if (~class227.field3891 == ~class169.field2968 && ~class58.field1196 == ~class126.field2201) {
                class23.field423 = var1;
                class269.field4599 = var4;
                class260.field4465 = 0;
                class247.field4306 = true;
                class166.field2940 = class271.field4664 * 15 + 22;
                class176.field3088 = var5;
                return;
            }
            class260.field4465 = 1;
            class243.field4270 = class227.field3891;
            class3.field39 = class58.field1196;
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Lfa;Lfa;Lfa;Lfa;B)V")
    public static final void method1120(class239 arg0, class239 arg1, class239 arg2, class239 arg3, byte arg4) {
        ++field2846;
        class268.field4575 = arg2;
        class203.field3477 = arg0;
        class31.field612 = arg1;
        class107.field1900 = arg3;
        class22.field406 = new class141[class203.field3477.method1640(-1)][];
        class257.field4423 = new boolean[class203.field3477.method1640(-1)];
        if (arg4 < 74) {
            field2856 = null;
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(BI)[[I")
    public final int[][] method240(byte arg0, int arg1) {
        ++field2849;
        int var3 = 42 % ((arg0 - 26) / 45);
        int[][] var4 = super.field1903.method634(arg1, 13012);
        if (super.field1903.field1551) {
            int[][] var5 = this.method802(3, arg1, 0);
            int[] var6 = var5[0];
            int[] var7 = var5[2];
            int[] var8 = var5[1];
            int[] var9 = var4[1];
            int[] var10 = var4[0];
            int[] var11 = var4[2];
            for (int var12 = 0; ~var12 > ~class106.field1862; ++var12) {
                var10[var12] = -var6[var12] + 4096;
                var9[var12] = 4096 - var8[var12];
                var11[var12] = -var7[var12] + 4096;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!l", name = "<init>", descriptor = "()V")
    public class158() {
        super(1, false);
    }

    @OriginalMember(owner = "client!l", name = "h", descriptor = "(I)V")
    public static void method1121(int arg0) {
        if (arg0 != -12118) {
            field2854 = 90;
        }
        field2856 = null;
        field2851 = null;
        field2857 = null;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Lie;II)V")
    public final void method122(class32 arg0, int arg1, int arg2) {
        if (arg2 == -32513) {
            ++field2848;
            if (~arg1 == -1) {
                super.field1897 = arg0.method316((byte) 120) == 1;
            }
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Llh;Lfa;Lfa;Lfa;I)Z")
    public static final boolean method1122(class274 arg0, class239 arg1, class239 arg2, class239 arg3, int arg4) {
        class104.field1843 = arg3;
        class115.field2020 = arg0;
        class51.field1084 = arg1;
        ++field2855;
        if (arg4 != 2) {
            field2857 = null;
        }
        class170.field2981 = arg2;
        return true;
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(BI)[I")
    public final int[] method123(byte arg0, int arg1) {
        ++field2853;
        if (arg0 != -17) {
            method1123((String) null, (byte) 78, (Throwable) null);
        }
        int[] var3 = super.field1921.method1388(arg1, (byte) -26);
        if (super.field1921.field3539) {
            int[] var4 = this.method797(0, arg1, (byte) -22);
            for (int var5 = 0; var5 < class106.field1862; ++var5) {
                var3[var5] = -var4[var5] + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/Throwable;)V")
    public static final void method1123(String arg0, byte arg1, Throwable arg2) {
        ++field2858;
        try {
            String var3 = "";
            if (arg2 != null) {
                var3 = class21.method204(arg2, 63);
            }
            if (arg0 != null) {
                if (arg2 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg0;
            }
            System.out.println("Error: " + var3);
            String var4 = var3.replace(':', '.');
            String var5 = var4.replace('@', '_');
            String var6 = var5.replace('&', '_');
            String var7 = var6.replace('#', '_');
            if (arg1 != -122) {
                method1122((class274) null, (class239) null, (class239) null, (class239) null, 79);
            }
            if (class33.field717.field1306 != null) {
                class103 var8 = class33.field717.method550(-72, new URL(class33.field717.field1306.getCodeBase(), "clienterror.ws?c=" + class127.field2229 + "&u=" + class62.field1254 + "&v1=" + class67.field1313 + "&v2=" + class67.field1305 + "&e=" + var7));
                while (var8.field1823 == 0) {
                    class84.method645(1, 1L);
                }
                if (var8.field1823 == 1) {
                    DataInputStream var9 = (DataInputStream) var8.field1826;
                    var9.read();
                    var9.close();
                }
            }
        } catch (Exception var10) {
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIZ)V")
    public static final void method1124(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (~class36.field788 == -2) {
            class240.field4221[class135.field2351 / 100].method806(class203.field3487 + -8, class36.field796 + -8);
        }
        if (class36.field788 == 2) {
            class240.field4221[4 - -(class135.field2351 / 100)].method806(class203.field3487 + -8, class36.field796 + -8);
        }
        class243.method1679((byte) 11);
        if (!arg4) {
            field2857 = null;
        }
        ++field2850;
    }
}
