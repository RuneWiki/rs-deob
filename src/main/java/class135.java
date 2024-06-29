import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class135 extends class273 {

    @OriginalMember(owner = "client!pi", name = "bb", descriptor = "I")
    private int field2587 = -1;

    @OriginalMember(owner = "client!pi", name = "Z", descriptor = "Ljd;")
    private static class86 field2585 = class122.method868("green:", true);

    @OriginalMember(owner = "client!pi", name = "ab", descriptor = "Ljd;")
    public static class86 field2586 = class122.method868("(R", true);

    @OriginalMember(owner = "client!pi", name = "W", descriptor = "Ljd;")
    public static class86 field2582 = class122.method868("gleiten:", true);

    @OriginalMember(owner = "client!pi", name = "hb", descriptor = "Ljd;")
    public static class86 field2593 = field2585;

    @OriginalMember(owner = "client!pi", name = "ib", descriptor = "Ljd;")
    public static class86 field2594 = field2585;

    @OriginalMember(owner = "client!pi", name = "kb", descriptor = "Ljd;")
    public static class86 field2596 = class122.method868("Ausw-=hlen", true);

    @OriginalMember(owner = "client!pi", name = "S", descriptor = "I")
    public static int field2578;

    @OriginalMember(owner = "client!pi", name = "T", descriptor = "I")
    public int field2579;

    @OriginalMember(owner = "client!pi", name = "U", descriptor = "I")
    public static int field2580;

    @OriginalMember(owner = "client!pi", name = "V", descriptor = "I")
    public static int field2581;

    @OriginalMember(owner = "client!pi", name = "X", descriptor = "I")
    public static int field2583;

    @OriginalMember(owner = "client!pi", name = "Y", descriptor = "I")
    public static int field2584;

    @OriginalMember(owner = "client!pi", name = "eb", descriptor = "I")
    public static int field2590;

    @OriginalMember(owner = "client!pi", name = "fb", descriptor = "I")
    public int field2591;

    @OriginalMember(owner = "client!pi", name = "gb", descriptor = "I")
    public static int field2592;

    @OriginalMember(owner = "client!pi", name = "jb", descriptor = "I")
    public static int field2595;

    @OriginalMember(owner = "client!pi", name = "cb", descriptor = "Lcj;")
    public static class115 field2588;

    @OriginalMember(owner = "client!pi", name = "db", descriptor = "[I")
    public int[] field2589;

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "(B)V")
    public final void method966(byte arg0) {
        super.method966(arg0);
        this.field2589 = null;
        ++field2595;
    }

    @OriginalMember(owner = "client!pi", name = "f", descriptor = "(I)Z")
    public final boolean method967(int arg0) {
        ++field2578;
        if (this.field2589 != null) {
            return true;
        } else if (~this.field2587 <= -1) {
            class167 var2 = class235.method1631(class230.field4182, this.field2587, false);
            var2.method1201();
            this.field2579 = var2.field1835;
            this.field2591 = var2.field1846;
            this.field2589 = var2.field3098;
            return true;
        } else {
            if (arg0 != -2951) {
                method969((byte[]) null, 44);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IB)[[I")
    public int[][] method29(int arg0, byte arg1) {
        ++field2580;
        int var3 = 5 / ((arg1 - 12) / 58);
        int[][] var4 = super.field4787.method1657(arg0, (byte) -101);
        if (super.field4787.field4355 && this.method967(-2951)) {
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int var8 = this.field2591 * (class96.field1896 == this.field2579 ? arg0 : this.field2579 * arg0 / class96.field1896);
            if (class176.field3200 != this.field2591) {
                for (int var9 = 0; var9 < class176.field3200; ++var9) {
                    int var10 = this.field2591 * var9 / class176.field3200;
                    int var11 = this.field2589[var8 + var10];
                    var7[var9] = class1.method5(255, var11) << 4;
                    var6[var9] = class1.method5(var11 >> 4, 4080);
                    var5[var9] = class1.method5(16711680, var11) >> 12;
                }
            } else {
                for (int var12 = 0; class176.field3200 > var12; ++var12) {
                    int var13 = this.field2589[var8++];
                    var7[var12] = class1.method5(var13 << 4, 4080);
                    var6[var12] = class1.method5(4080, var13 >> 4);
                    var5[var12] = class1.method5(var13, 16711680) >> 12;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(ILqk;I)V")
    public final void method34(int arg0, class200 arg1, int arg2) {
        ++field2590;
        if (arg0 == 0) {
            this.field2587 = arg1.method1410(-72);
        }
        if (arg2 > -16) {
            this.method966((byte) 27);
        }
    }

    @OriginalMember(owner = "client!pi", name = "<init>", descriptor = "()V")
    public class135() {
        super(0, false);
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIIILeh;JLeh;Leh;)V")
    public static final void method968(int arg0, int arg1, int arg2, int arg3, class80 arg4, long arg5, class80 arg6, class80 arg7) {
        class97 var9 = new class97();
        var9.field1924 = arg4;
        var9.field1923 = arg1 * 128 + 64;
        var9.field1925 = arg2 * 128 + 64;
        var9.field1920 = arg3;
        var9.field1934 = arg5;
        var9.field1927 = arg6;
        var9.field1933 = arg7;
        int var10 = 0;
        class249 var11 = class248.field4406[arg0][arg1][arg2];
        if (var11 != null) {
            for (int var12 = 0; var12 < var11.field4445; ++var12) {
                class228 var13 = var11.field4429[var12];
                if ((var13.field4122 & 4194304L) == 4194304L) {
                    int var14 = var13.field4134.method233();
                    if (var14 != -32768 && var14 < var10) {
                        var10 = var14;
                    }
                }
            }
        }
        var9.field1921 = -var10;
        if (class248.field4406[arg0][arg1][arg2] == null) {
            class248.field4406[arg0][arg1][arg2] = new class249(arg0, arg1, arg2);
        }
        class248.field4406[arg0][arg1][arg2].field4443 = var9;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "([BI)[B")
    public static final byte[] method969(byte[] arg0, int arg1) {
        int var2 = arg0.length;
        ++field2584;
        byte[] var3 = new byte[var2];
        class250.method1687(arg0, arg1, var3, 0, var2);
        return var3;
    }

    @OriginalMember(owner = "client!pi", name = "e", descriptor = "(B)I")
    public final int method970(byte arg0) {
        if (arg0 != 116) {
            field2586 = null;
        }
        ++field2581;
        return this.field2587;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(Z)V")
    public static void method971(boolean arg0) {
        field2586 = null;
        if (!arg0) {
            method972((byte) -65, (class200) null);
        }
        field2582 = null;
        field2585 = null;
        field2593 = null;
        field2588 = null;
        field2596 = null;
        field2594 = null;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(BLqk;)V")
    public static final void method972(byte arg0, class200 arg1) {
        if (arg0 <= 99) {
            method969((byte[]) null, -25);
        }
        if (class55.field1109 != null) {
            try {
                class55.field1109.method1135(true, 0L);
                class55.field1109.method1131(arg1.field3565, arg1.field3547, 80, 24);
            } catch (Exception var2) {
            }
        }
        arg1.field3565 += 24;
        ++field2583;
    }
}
