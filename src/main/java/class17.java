import java.awt.Frame;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class17 extends class214 {

    @OriginalMember(owner = "client!db", name = "fb", descriptor = "I")
    public static int field174 = 500;

    @OriginalMember(owner = "client!db", name = "jb", descriptor = "[Ls;")
    public static class245[] field178 = new class245[0];

    @OriginalMember(owner = "client!db", name = "eb", descriptor = "I")
    public static int field173;

    @OriginalMember(owner = "client!db", name = "gb", descriptor = "I")
    public static int field175;

    @OriginalMember(owner = "client!db", name = "ib", descriptor = "I")
    public static int field177;

    @OriginalMember(owner = "client!db", name = "lb", descriptor = "I")
    public static int field180;

    @OriginalMember(owner = "client!db", name = "nb", descriptor = "I")
    public static int field182;

    @OriginalMember(owner = "client!db", name = "pb", descriptor = "I")
    public static int field184;

    @OriginalMember(owner = "client!db", name = "ob", descriptor = "Lse;")
    public static class211 field183;

    @OriginalMember(owner = "client!db", name = "hb", descriptor = "Lhc;")
    public static class235 field176;

    @OriginalMember(owner = "client!db", name = "mb", descriptor = "Lhc;")
    public static class235 field181;

    @OriginalMember(owner = "client!db", name = "kb", descriptor = "Ljava/awt/Frame;")
    public static Frame field179;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IB)[[I")
    public final int[][] method91(int arg0, byte arg1) {
        ++field175;
        int[][] var3 = super.field920.method184((byte) -21, arg0);
        int var4 = 22 / ((arg1 - 63) / 61);
        if (super.field920.field374 && this.method1397((byte) 57)) {
            int[] var5 = var3[1];
            int[] var6 = var3[0];
            int var7 = arg0 % super.field3222 * super.field3222;
            int[] var8 = var3[2];
            for (int var9 = 0; ~class89.field1248 < ~var9; ++var9) {
                int var10 = super.field3220[var9 % super.field3215 + var7];
                var8[var9] = class235.method1572(4080, var10 << 4);
                var5[var9] = class235.method1572(var10 >> 4, 4080);
                var6[var9] = class235.method1572(var10, 16711680) >> 12;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(ILd;)V")
    public static final void method99(int arg0, class244 arg1) {
        class266.field3984 = 3;
        ++field173;
        class91 var2 = null;
        class199.method1270(-1, true);
        class213.field3211 = 2;
        class41.field617 = true;
        class75.field1053 = true;
        class108.field1501 = 0;
        class122.field1701 = 127;
        class111.field1617 = 0;
        class168.field2312 = 255;
        class208.field2951 = true;
        class148.field2048 = true;
        class205.field2860 = 127;
        class29.field390 = true;
        class77.field1079 = 0;
        class245.field3744 = true;
        class30.field408 = 0;
        class141.field1957 = true;
        class261.field3954 = true;
        class212.field3187 = true;
        class246.field3763 = true;
        class86.field1174 = true;
        if (class274.field4236 < 96) {
            class97.method643(0);
        } else {
            class97.method643(2);
        }
        class59.field844 = true;
        class219.field3294 = 0;
        class297.field4681 = false;
        class235.field3553 = false;
        class34.field529 = false;
        class221.field3321 = 0;
        class254.field3899 = 0;
        try {
            if (arg0 != 14262) {
                field174 = -99;
            }
            class117 var3 = arg1.method1635("runescape", false);
            while (~var3.field1663 == -1) {
                class28.method182(1L, arg0 + -14142);
            }
            if (~var3.field1663 == -2) {
                var2 = (class91) var3.field1665;
                int var4 = 0;
                byte[] var5 = new byte[(int) var2.method594(-125)];
                while (var4 < var5.length) {
                    int var6 = var2.method591(var5.length - var4, var4, 55, var5);
                    if (~var6 == 0) {
                        throw new IOException("EOF");
                    }
                    var4 += var6;
                }
                class206.method1312(new class224(var5), 112);
            }
        } catch (Exception var8) {
        }
        try {
            if (var2 != null) {
                var2.method593(0);
            }
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "([Ljava/lang/String;B[S)V")
    public static final void method100(String[] arg0, byte arg1, short[] arg2) {
        ++field182;
        class284.method1903(arg0, arg0.length + -1, 0, (byte) -76, arg2);
        if (arg1 < 10) {
            field179 = null;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(JB)Ljava/lang/String;")
    public static final String method101(long arg0, byte arg1) {
        if (arg1 < 115) {
            field176 = null;
        }
        ++field180;
        return class197.method1258(arg0, (byte) 94);
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "()V")
    public static final void method102() {
        for (int var0 = 0; var0 < class140.field1953; ++var0) {
            class198 var1 = class230.field3484[var0];
            class270.method1787(var1);
            class230.field3484[var0] = null;
        }
        class140.field1953 = 0;
    }

    @OriginalMember(owner = "client!db", name = "h", descriptor = "(I)V")
    public static void method103(int arg0) {
        field178 = null;
        field183 = null;
        field179 = null;
        if (arg0 != 4080) {
            field181 = null;
        }
        field176 = null;
        field181 = null;
    }
}
