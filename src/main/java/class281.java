import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class281 extends class262 {

    @OriginalMember(owner = "client!oa", name = "W", descriptor = "Lhd;")
    public static class117 field4821 = new class117(4);

    @OriginalMember(owner = "client!oa", name = "bb", descriptor = "Lok;")
    public static class146 field4826 = class235.method1724(-12908, "tbrefresh");

    @OriginalMember(owner = "client!oa", name = "X", descriptor = "Z")
    public static boolean field4822 = true;

    @OriginalMember(owner = "client!oa", name = "ab", descriptor = "Lok;")
    public static class146 field4825 = null;

    @OriginalMember(owner = "client!oa", name = "O", descriptor = "I")
    public static int field4813;

    @OriginalMember(owner = "client!oa", name = "P", descriptor = "I")
    public static int field4814;

    @OriginalMember(owner = "client!oa", name = "Q", descriptor = "I")
    public static int field4815;

    @OriginalMember(owner = "client!oa", name = "R", descriptor = "I")
    public static int field4816;

    @OriginalMember(owner = "client!oa", name = "S", descriptor = "I")
    public static int field4817;

    @OriginalMember(owner = "client!oa", name = "T", descriptor = "I")
    public static int field4818;

    @OriginalMember(owner = "client!oa", name = "V", descriptor = "I")
    public static int field4820;

    @OriginalMember(owner = "client!oa", name = "Z", descriptor = "I")
    public static int field4824;

    @OriginalMember(owner = "client!oa", name = "cb", descriptor = "I")
    public static int field4827;

    @OriginalMember(owner = "client!oa", name = "U", descriptor = "[Lqk;")
    private class57[] field4819;

    @OriginalMember(owner = "client!oa", name = "Y", descriptor = "[[Lhi;")
    public static class286[][] field4823;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "([[II)V", line = 4)
    private final void method2037(int[][] arg0, int arg1) {
        if (arg1 != 7467) {
            field4824 = -8;
        }
        field4814++;
        int var3 = class104.field1676;
        int var4 = class98.field1598;
        class33.method242(arg0, (byte) -96);
        class98.method681(class259.field4297, 0, (byte) -96, class218.field3595, 0);
        if (this.field4819 == null) {
            return;
        }
        for (int var5 = 0; var5 < this.field4819.length; var5++) {
            class57 var6 = this.field4819[var5];
            int var7 = var6.field1001;
            int var8 = var6.field1002;
            if (var7 >= 0) {
                if (var8 >= 0) {
                    var6.method260(var3, var4, (byte) 94);
                } else {
                    var6.method258((byte) -27, var3, var4);
                }
            } else if (var8 >= 0) {
                var6.method259(-27128, var4, var3);
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(III)Lj;", line = 54)
    public static final class278 method2038(int arg0, int arg1, int arg2) {
        class11 var3 = class203.field3382[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class278 var4 = var3.field212;
            var3.field212 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IJSIIILok;Lok;)V", line = 66)
    public static final void method2039(int arg0, long arg1, short arg2, int arg3, int arg4, int arg5, class146 arg6, class146 arg7) {
        field4817++;
        if (arg3 != 12241) {
            field4821 = (class117) null;
        }
        if (class295.field4998 || class45.field763 >= 500) {
            return;
        }
        class227.field3782[class45.field763] = arg7;
        class214.field3525[class45.field763] = arg6;
        class21.field405[class45.field763] = arg4 == -1 ? client.field4085 : arg4;
        class224.field3739[class45.field763] = arg2;
        class37.field675[class45.field763] = arg1;
        class93.field1493[class45.field763] = arg5;
        class259.field4308[class45.field763] = arg0;
        class45.field763++;
    }

    @OriginalMember(owner = "client!oa", name = "<init>", descriptor = "()V", line = 99)
    public class281() {
        super(0, true);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lwe;II)V", line = 105)
    public final void method40(class47 arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            this.field4819 = new class57[arg0.method368(86)];
            for (int var4 = 0; var4 < this.field4819.length; var4++) {
                int var5 = arg0.method368(-103);
                if (var5 == 0) {
                    this.field4819[var4] = class13.method78(arg0, class35.method255(arg1, 2053));
                } else if (var5 == 1) {
                    this.field4819[var4] = class144.method1074((byte) -47, arg0);
                } else if (var5 == 2) {
                    this.field4819[var4] = class122.method848(arg0, -17260);
                } else if (var5 == 3) {
                    this.field4819[var4] = class63.method488((byte) -120, arg0);
                }
            }
        } else if (arg2 == 1) {
            this.field4365 = arg0.method368(43) == 1;
        }
        field4815++;
        if (arg1 != 2048) {
            field4825 = (class146) null;
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Loh;ZLoh;Loh;Loh;)V", line = 180)
    public static final void method2040(class15 arg0, boolean arg1, class15 arg2, class15 arg3, class15 arg4) {
        class156.field2606 = arg2;
        class168.field2846 = arg0;
        if (!arg1) {
            method2040((class15) null, true, (class15) null, (class15) null, (class15) null);
        }
        field4813++;
        class160.field2711 = arg4;
        class32.field600 = arg3;
        class92.field1459 = new class264[class160.field2711.method109(-11129)][];
        class279.field4786 = new boolean[class160.field2711.method109(-11129)];
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(II)[[I", line = 197)
    public final int[][] method87(int arg0, int arg1) {
        field4818++;
        if (arg0 != 7) {
            field4822 = true;
        }
        int[][] var3 = this.field4347.method536(arg1, 4096);
        if (this.field4347.field1202) {
            int var4 = class98.field1598;
            int var5 = class104.field1676;
            int[][][] var6 = this.field4347.method538(0);
            int[][] var7 = new int[var5][var4];
            this.method2037(var7, 7467);
            for (int var8 = 0; var8 < class104.field1676; var8++) {
                int[] var9 = var7[var8];
                int[][] var10 = var6[var8];
                int[] var11 = var10[0];
                int[] var12 = var10[2];
                int[] var13 = var10[1];
                for (int var14 = 0; var14 < class98.field1598; var14++) {
                    int var15 = var9[var14];
                    var12[var14] = class82.method582(4080, var15 << 4);
                    var13[var14] = class82.method582(var15, 65280) >> 4;
                    var11[var14] = class82.method582(4080, var15 >> 12);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(BJ)V", line = 261)
    public static final void method2041(byte arg0, long arg1) {
        if (arg0 < 86) {
            field4827 = -11;
        }
        field4816++;
        if (arg1 <= 0L) {
            return;
        }
        if (arg1 % 10L == 0L) {
            class106.method715(-87, arg1 - 1L);
            class106.method715(-104, 1L);
        } else {
            class106.method715(-85, arg1);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IB)[I", line = 283)
    public final int[] method38(int arg0, byte arg1) {
        field4820++;
        if (arg1 >= -85) {
            return (int[]) null;
        }
        int[] var3 = this.field4350.method1532(arg0, (byte) 106);
        if (this.field4350.field3333) {
            this.method2037(this.field4350.method1533(21819), 7467);
        }
        return var3;
    }

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "(I)V", line = 308)
    public static void method2042(int arg0) {
        field4823 = (class286[][]) null;
        field4825 = null;
        field4826 = null;
        field4821 = null;
        int var1 = 121 / ((51 - arg0) / 39);
    }
}
