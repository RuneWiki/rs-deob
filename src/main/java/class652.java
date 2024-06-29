import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eja")
public class class652 extends class559 {

    @OriginalMember(owner = "client!eja", name = "y", descriptor = "I")
    private int field8729;

    @OriginalMember(owner = "client!eja", name = "C", descriptor = "Lhca;")
    public static class244 field8733 = new class244();

    @OriginalMember(owner = "client!eja", name = "E", descriptor = "Lkr;")
    public static class602 field8735 = new class602(105, 2);

    @OriginalMember(owner = "client!eja", name = "F", descriptor = "Lst;")
    public static class335 field8736 = new class335(50, 3);

    @OriginalMember(owner = "client!eja", name = "x", descriptor = "I")
    public static int field8728;

    @OriginalMember(owner = "client!eja", name = "z", descriptor = "I")
    public static int field8730;

    @OriginalMember(owner = "client!eja", name = "A", descriptor = "I")
    public static int field8731;

    @OriginalMember(owner = "client!eja", name = "B", descriptor = "I")
    public static int field8732;

    @OriginalMember(owner = "client!eja", name = "G", descriptor = "Luu;")
    public static class237 field8737;

    @OriginalMember(owner = "client!eja", name = "D", descriptor = "Lid;")
    public static class467 field8734;

    @OriginalMember(owner = "client!eja", name = "<init>", descriptor = "(Ldw;II[BI)V")
    public class652(class664 arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        super(arg0, 3552, arg1, arg2, false);
        this.field8729 = arg2;
        super.field7765.method3681(this, 0);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage1Dub(super.field7768, 0, super.field7777, this.field8729, 0, arg4, 5121, arg3, 0);
        OpenGL.glPixelStorei(3317, 4);
        this.method3292(3, true);
    }

    @OriginalMember(owner = "client!eja", name = "c", descriptor = "(B)V")
    public static final void method3645(byte arg0) {
        if (arg0 != -99) {
            field8735 = null;
        }
        ++field8732;
        class119.field1570 = 0;
        boolean var1 = class352.field5071.method498(arg0 + 19) == 1;
        int var2 = class352.field5071.method506(-112);
        int var3 = class352.field5071.method455(-69);
        int var4 = class352.field5071.method498(-126);
        class545.method3221(arg0 ^ -10);
        class374.method2349(-10757, var4);
        int var5 = (-class352.field5071.field956 + class357.field5125) / 16;
        class258.field3738 = new int[var5][4];
        for (int var6 = 0; ~var6 > ~var5; ++var6) {
            for (int var10 = 0; var10 < 4; ++var10) {
                class258.field3738[var6][var10] = class352.field5071.method457(class134.method848(arg0, 14497));
            }
        }
        class436.field6089 = new byte[var5][];
        class438.field6117 = new byte[var5][];
        class306.field4308 = new int[var5];
        class101.field1394 = new byte[var5][];
        class290.field4147 = new int[var5];
        class100.field1385 = new int[var5];
        class239.field3580 = null;
        class316.field4364 = new int[var5];
        class510.field7069 = new int[var5];
        class113.field1518 = null;
        class45.field563 = new byte[var5][];
        int var7 = 0;
        for (int var8 = (-(class277.field4036 >> 4) + var3) / 8; ~var8 >= ~((var3 - -(class277.field4036 >> 4)) / 8); ++var8) {
            for (int var9 = (-(class667.field9202 >> 4) + var2) / 8; ((class667.field9202 >> 4) + var2) / 8 >= var9; ++var9) {
                class316.field4364[var7] = (var8 << 8) + var9;
                class290.field4147[var7] = class413.field5861.method1598("m" + var8 + "_" + var9, false);
                class306.field4308[var7] = class413.field5861.method1598("l" + var8 + "_" + var9, false);
                class100.field1385[var7] = class413.field5861.method1598("um" + var8 + "_" + var9, false);
                class510.field7069[var7] = class413.field5861.method1598("ul" + var8 + "_" + var9, false);
                ++var7;
            }
        }
        class581.method3376(var2, var3, 0, 11, var1);
    }

    @OriginalMember(owner = "client!eja", name = "a", descriptor = "(IZLuv;ZI)V")
    public static final void method3646(int arg0, boolean arg1, class755 arg2, boolean arg3, int arg4) {
        ++field8731;
        int var5 = arg2.field10393;
        if (arg2.field10423 == 0) {
            arg2.field10393 = arg2.field10527;
        } else if (~arg2.field10423 == -2) {
            arg2.field10393 = -arg2.field10527 + arg0;
        } else if (arg2.field10423 == 2) {
            arg2.field10393 = arg2.field10527 * arg0 >> 14;
        }
        if (arg3) {
            int var6 = arg2.field10501;
            if (~arg2.field10432 != -1) {
                if (~arg2.field10432 != -2) {
                    if (arg2.field10432 == 2) {
                        arg2.field10501 = arg2.field10550 * arg4 >> 14;
                    }
                } else {
                    arg2.field10501 = -arg2.field10550 + arg4;
                }
            } else {
                arg2.field10501 = arg2.field10550;
            }
            if (~arg2.field10423 == -5) {
                arg2.field10393 = arg2.field10501 * arg2.field10470 / arg2.field10454;
            }
            if (~arg2.field10432 == -5) {
                arg2.field10501 = arg2.field10454 * arg2.field10393 / arg2.field10470;
            }
            if (class498.field6966 && (client.method2738(arg2).field3970 != 0 || arg2.field10416 == 0)) {
                if (~arg2.field10501 > -6 && ~arg2.field10393 > -6) {
                    arg2.field10393 = 5;
                    arg2.field10501 = 5;
                } else {
                    if (~arg2.field10501 >= -1) {
                        arg2.field10501 = 5;
                    }
                    if (~arg2.field10393 >= -1) {
                        arg2.field10393 = 5;
                    }
                }
            }
            if (~class629.field8447 == ~arg2.field10507) {
                class509.field7066 = arg2;
            }
            if (arg1 && arg2.field10418 != null) {
                if (arg2.field10393 != var5 || arg2.field10501 != var6) {
                    class142 var7 = new class142();
                    var7.field2024 = arg2.field10418;
                    var7.field2020 = arg2;
                    class218.field2845.method3610(9289, var7);
                }
            }
        }
    }

    @OriginalMember(owner = "client!eja", name = "a", descriptor = "(ZB)V")
    public final void method3647(boolean arg0, byte arg1) {
        ++field8730;
        if (arg1 < 6) {
            field8733 = null;
        }
        super.field7765.method3681(this, 0);
        OpenGL.glTexParameteri(super.field7768, 10242, !arg0 ? 33071 : 10497);
    }

    @OriginalMember(owner = "client!eja", name = "a", descriptor = "(I)V")
    public final void method2235(int arg0) {
        if (arg0 == 0) {
            ++field8728;
        }
    }

    @OriginalMember(owner = "client!eja", name = "a", descriptor = "(Z)V")
    public static void method3648(boolean arg0) {
        if (arg0) {
            field8736 = null;
        }
        field8736 = null;
        field8734 = null;
        field8735 = null;
        field8733 = null;
        field8737 = null;
    }
}
