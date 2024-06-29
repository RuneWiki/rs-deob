import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class1 extends class259 {

    @OriginalMember(owner = "client!aj", name = "mb", descriptor = "I")
    private int field21 = -1;

    @OriginalMember(owner = "client!aj", name = "ab", descriptor = "Lsg;")
    private static class30 field9 = class167.method1221((byte) 33, " more options");

    @OriginalMember(owner = "client!aj", name = "fb", descriptor = "I")
    public static int field14 = 0;

    @OriginalMember(owner = "client!aj", name = "db", descriptor = "Lsg;")
    public static class30 field12 = field9;

    @OriginalMember(owner = "client!aj", name = "ib", descriptor = "Z")
    public static volatile boolean field17 = true;

    @OriginalMember(owner = "client!aj", name = "gb", descriptor = "Lsg;")
    public static class30 field15 = class167.method1221((byte) 33, ":");

    @OriginalMember(owner = "client!aj", name = "Z", descriptor = "Lsg;")
    private static class30 field8 = class167.method1221((byte) 33, "white:");

    @OriginalMember(owner = "client!aj", name = "bb", descriptor = "[I")
    public static int[] field10 = new int[1000];

    @OriginalMember(owner = "client!aj", name = "eb", descriptor = "Lsg;")
    public static class30 field13 = class167.method1221((byte) 33, " )2> <col=00ffff>");

    @OriginalMember(owner = "client!aj", name = "T", descriptor = "Lsg;")
    public static class30 field2 = field8;

    @OriginalMember(owner = "client!aj", name = "ob", descriptor = "Lsg;")
    public static class30 field23 = field8;

    @OriginalMember(owner = "client!aj", name = "S", descriptor = "I")
    public int field1;

    @OriginalMember(owner = "client!aj", name = "jb", descriptor = "I")
    public static int field18;

    @OriginalMember(owner = "client!aj", name = "kb", descriptor = "I")
    public static int field19;

    @OriginalMember(owner = "client!aj", name = "lb", descriptor = "I")
    public static int field20;

    @OriginalMember(owner = "client!aj", name = "nb", descriptor = "I")
    public int field22;

    @OriginalMember(owner = "client!aj", name = "U", descriptor = "I")
    public static int field3;

    @OriginalMember(owner = "client!aj", name = "V", descriptor = "I")
    public static int field4;

    @OriginalMember(owner = "client!aj", name = "W", descriptor = "I")
    public static int field5;

    @OriginalMember(owner = "client!aj", name = "X", descriptor = "I")
    public static int field6;

    @OriginalMember(owner = "client!aj", name = "Y", descriptor = "I")
    public static int field7;

    @OriginalMember(owner = "client!aj", name = "hb", descriptor = "Lmc;")
    public static class151 field16;

    @OriginalMember(owner = "client!aj", name = "cb", descriptor = "[I")
    public int[] field11;

    @OriginalMember(owner = "client!aj", name = "i", descriptor = "(I)I")
    public static final int method1(int arg0) {
        ++field4;
        if (arg0 != 1619113060) {
            field2 = null;
        }
        return class170.field3202;
    }

    @OriginalMember(owner = "client!aj", name = "d", descriptor = "(I)V")
    public final void method2(int arg0) {
        ++field3;
        super.method2(arg0);
        this.field11 = null;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(BI)[[I")
    public int[][] method3(byte arg0, int arg1) {
        int var3 = 43 % ((arg0 - -48) / 42);
        ++field18;
        int[][] var4 = super.field4568.method241(-106, arg1);
        if (super.field4568.field564 && this.method7((byte) -104)) {
            int[] var5 = var4[0];
            int[] var6 = var4[2];
            int[] var7 = var4[1];
            int var8 = this.field22 * (~class94.field1911 != ~this.field1 ? this.field1 * arg1 / class94.field1911 : arg1);
            if (~class223.field3999 != ~this.field22) {
                for (int var9 = 0; ~class223.field3999 < ~var9; ++var9) {
                    int var10 = this.field22 * var9 / class223.field3999;
                    int var11 = this.field11[var8 + var10];
                    var6[var9] = class68.method612(4080, var11 << 4);
                    var7[var9] = class68.method612(4080, var11 >> 4);
                    var5[var9] = class68.method612(4080, var11 >> 12);
                }
            } else {
                for (int var12 = 0; class223.field3999 > var12; ++var12) {
                    int var13 = this.field11[var8++];
                    var6[var12] = class68.method612(var13 << 4, 4080);
                    var7[var12] = class68.method612(65280, var13) >> 4;
                    var5[var12] = class68.method612(var13, 16711680) >> 12;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IILaa;)V")
    public final void method4(int arg0, int arg1, class8 arg2) {
        ++field7;
        if (arg1 != -1586849108) {
            field13 = null;
        }
        if (arg0 == 0) {
            this.field21 = arg2.method65((byte) 112);
        }
    }

    @OriginalMember(owner = "client!aj", name = "e", descriptor = "(I)I")
    public final int method5(int arg0) {
        if (arg0 != -1) {
            return -112;
        } else {
            ++field6;
            return this.field21;
        }
    }

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "(B)V")
    public static void method6(byte arg0) {
        int var1 = -75 % ((arg0 - 3) / 62);
        field23 = null;
        field8 = null;
        field15 = null;
        field10 = null;
        field2 = null;
        field12 = null;
        field13 = null;
        field9 = null;
        field16 = null;
    }

    @OriginalMember(owner = "client!aj", name = "<init>", descriptor = "()V")
    public class1() {
        super(0, false);
    }

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "(B)Z")
    public final boolean method7(byte arg0) {
        if (arg0 >= -95) {
            this.field11 = null;
        }
        ++field5;
        if (this.field11 != null) {
            return true;
        } else if (~this.field21 <= -1) {
            class152 var2 = class9.method105(class132.field2608, -128, this.field21);
            var2.method1135();
            this.field22 = var2.field1049;
            this.field11 = var2.field2904;
            this.field1 = var2.field1043;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!aj", name = "j", descriptor = "(I)V")
    public static final void method8(int arg0) {
        int var1 = class80.field1724;
        int var2 = class40.field1005;
        if (arg0 != 6447) {
            field2 = null;
        }
        ++field20;
        int var3 = class222.field3988 - (class15.field324 + var1);
        int var4 = -class238.field4238 + class93.field1885 + -var2;
        if (~var1 < -1 || ~var3 < -1 || var2 > 0 || var4 > 0) {
            try {
                Container var5;
                if (class259.field4569 != null) {
                    var5 = class259.field4569;
                } else if (class261.field4614 == null) {
                    var5 = class190.field3452.field1449;
                } else {
                    var5 = class261.field4614;
                }
                int var6 = 0;
                int var7 = 0;
                if (class261.field4614 == var5) {
                    Insets var8 = class261.field4614.getInsets();
                    var7 = var8.top;
                    var6 = var8.left;
                }
                Graphics var9 = var5.getGraphics();
                var9.setColor(Color.black);
                if (var1 > 0) {
                    var9.fillRect(var6, var7, var1, class93.field1885);
                }
                if (~var2 < -1) {
                    var9.fillRect(var6, var7, class222.field3988, var2);
                }
                if (~var3 < -1) {
                    var9.fillRect(var6 - (-class222.field3988 + var3), var7, var3, class93.field1885);
                }
                if (var4 > 0) {
                    var9.fillRect(var6, -var4 + var7 - -class93.field1885, class222.field3988, var4);
                    return;
                }
            } catch (Exception var10) {
                return;
            }
        }
    }

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "(IB)Z")
    public static final boolean method9(int arg0, byte arg1) {
        ++field19;
        if (class82.field1750[arg0]) {
            return true;
        } else if (!class236.field4213.method1099(3, arg0)) {
            return false;
        } else {
            int var2 = class236.field4213.method1124(arg0, -98);
            if (~var2 == -1) {
                class82.field1750[arg0] = true;
                return true;
            } else {
                if (class259.field4572[arg0] == null) {
                    class259.field4572[arg0] = new class31[var2];
                }
                for (int var3 = 0; ~var3 > ~var2; ++var3) {
                    if (class259.field4572[arg0][var3] == null) {
                        byte[] var4 = class236.field4213.method1115(var3, (byte) -75, arg0);
                        if (var4 != null) {
                            class259.field4572[arg0][var3] = new class31();
                            class259.field4572[arg0][var3].field638 = (arg0 << 16) + var3;
                            if (var4[0] != -1) {
                                class259.field4572[arg0][var3].method317(new class8(var4), 18756);
                            } else {
                                class259.field4572[arg0][var3].method306(true, new class8(var4));
                            }
                        }
                    }
                }
                if (arg1 != -13) {
                    method6((byte) 54);
                }
                class82.field1750[arg0] = true;
                return true;
            }
        }
    }
}
