import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class103 extends class37 {

    @OriginalMember(owner = "client!ke", name = "P", descriptor = "I")
    private int field2292 = 20;

    @OriginalMember(owner = "client!ke", name = "X", descriptor = "I")
    private int field2300 = 1365;

    @OriginalMember(owner = "client!ke", name = "U", descriptor = "I")
    private int field2297 = 0;

    @OriginalMember(owner = "client!ke", name = "Y", descriptor = "I")
    private int field2301 = 0;

    @OriginalMember(owner = "client!ke", name = "Q", descriptor = "Ldd;")
    public static class35 field2293 = class180.method1196((byte) -114, ": ");

    @OriginalMember(owner = "client!ke", name = "V", descriptor = "Ldd;")
    public static class35 field2298 = class180.method1196((byte) 127, "<col=ffff00>");

    @OriginalMember(owner = "client!ke", name = "S", descriptor = "Lld;")
    public static class111 field2295 = new class111(64);

    @OriginalMember(owner = "client!ke", name = "R", descriptor = "I")
    public static int field2294;

    @OriginalMember(owner = "client!ke", name = "T", descriptor = "I")
    public static int field2296;

    @OriginalMember(owner = "client!ke", name = "W", descriptor = "I")
    public static int field2299;

    @OriginalMember(owner = "client!ke", name = "Z", descriptor = "I")
    public static int field2302;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IILce;)V")
    public final void method1(int arg0, int arg1, class26 arg2) {
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (arg0 != 2) {
                    if (~arg0 == -4) {
                        this.field2297 = arg2.method256((byte) -78);
                    }
                } else {
                    this.field2301 = arg2.method256((byte) -78);
                }
            } else {
                this.field2292 = arg2.method256((byte) -78);
            }
        } else {
            this.field2300 = arg2.method256((byte) -78);
        }
        if (arg1 != 1) {
            this.field2301 = 34;
        }
        ++field2294;
    }

    @OriginalMember(owner = "client!ke", name = "<init>", descriptor = "()V")
    public class103() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ke", name = "e", descriptor = "(I)V")
    public static void method766(int arg0) {
        field2293 = null;
        if (arg0 == -28802) {
            field2298 = null;
            field2295 = null;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(BI)[I")
    public final int[] method7(byte arg0, int arg1) {
        int[] var3 = super.field816.method1189((byte) 33, arg1);
        if (arg0 != 75) {
            method767(41, (class135) null, true);
        }
        ++field2302;
        if (super.field816.field3661) {
            for (int var4 = 0; ~class72.field1719 < ~var4; ++var4) {
                int var5 = (class22.field450[arg1] << 12) / this.field2300 + this.field2297;
                int var6 = (class118.field2622[var4] << 12) / this.field2300 + this.field2301;
                int var7 = var6;
                int var8 = var5;
                int var9 = var6;
                int var10 = var5;
                int var11 = var6 * var6 >> 12;
                int var12 = var5 * var5 >> 12;
                int var13 = 0;
                while (var11 + var12 < 16384 && var13 < this.field2292) {
                    var10 = (var9 * var10 >> 12) * 2 + var8;
                    ++var13;
                    var9 = -var12 + var11 + var7;
                    var11 = var9 * var9 >> 12;
                    var12 = var10 * var10 >> 12;
                }
                var3[var4] = this.field2292 + -1 > var13 ? (var13 << 12) / this.field2292 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(ILoa;Z)V")
    public static final void method767(int arg0, class135 arg1, boolean arg2) {
        if (class30.field603 != null) {
            try {
                class30.field603.method920((byte) -92);
            } catch (Exception var8) {
            }
            class30.field603 = null;
        }
        ++field2296;
        class30.field603 = arg1;
        class155.method1045(arg2, true);
        class29.field585 = null;
        class65.field1546 = 0;
        class195.field3882.field527 = 0;
        if (arg0 == -4) {
            class141.field2993 = null;
            while (true) {
                class121 var3 = (class121) class4.field64.method790(-124);
                if (var3 == null) {
                    while (true) {
                        class121 var4 = (class121) class9.field172.method790(-118);
                        if (var4 == null) {
                            if (~class44.field965 != -1) {
                                try {
                                    class26 var5 = new class26(4);
                                    var5.method257((byte) 126, 4);
                                    var5.method257((byte) 126, class44.field965);
                                    var5.method264(0, arg0 + -113);
                                    class30.field603.method924(0, 4, var5.field529, true);
                                } catch (IOException var7) {
                                    try {
                                        class30.field603.method920((byte) -99);
                                    } catch (Exception var6) {
                                    }
                                    ++class35.field777;
                                    class30.field603 = null;
                                }
                            }
                            class52.field1158 = 0;
                            class152.field3145 = class190.method1253((byte) 18);
                            return;
                        }
                        class79.field1843.method1167(false, var4);
                        class113.field2482.method789(var4, true, var4.field2416);
                        ++class106.field2359;
                        --class122.field2690;
                    }
                }
                class34.field694.method789(var3, true, var3.field2416);
                ++class130.field2811;
                --class147.field3098;
            }
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(III[[[I)V")
    public static final void method768(int arg0, int arg1, int arg2, int[][][] arg3) {
        class4.field66 = arg0;
        class113.field2536 = arg1;
        class102.field2272 = arg2;
        class191.field3853 = new class54[arg0][arg1][arg2];
        class57.field1432 = new int[arg0][arg1 + 1][arg2 + 1];
        class126.field2746 = arg3;
        class188.method1244();
    }
}
