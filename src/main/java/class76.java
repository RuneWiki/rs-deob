import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pv")
public class class76 {

    @OriginalMember(owner = "client!pv", name = "d", descriptor = "Z")
    public boolean field859 = true;

    @OriginalMember(owner = "client!pv", name = "l", descriptor = "I")
    private int field867 = -1;

    @OriginalMember(owner = "client!pv", name = "c", descriptor = "I")
    private int field858;

    @OriginalMember(owner = "client!pv", name = "o", descriptor = "Lqfa;")
    private class106 field870;

    @OriginalMember(owner = "client!pv", name = "b", descriptor = "I")
    private int field857;

    @OriginalMember(owner = "client!pv", name = "k", descriptor = "Llea;")
    private class637 field866;

    @OriginalMember(owner = "client!pv", name = "j", descriptor = "I")
    private int field865;

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "Lkda;")
    private class408 field856;

    @OriginalMember(owner = "client!pv", name = "n", descriptor = "Lmga;")
    private class738 field869;

    @OriginalMember(owner = "client!pv", name = "e", descriptor = "Lkm;")
    private class373 field860;

    @OriginalMember(owner = "client!pv", name = "h", descriptor = "B")
    public static byte field863;

    @OriginalMember(owner = "client!pv", name = "f", descriptor = "I")
    public static int field861;

    @OriginalMember(owner = "client!pv", name = "g", descriptor = "I")
    public static int field862;

    @OriginalMember(owner = "client!pv", name = "i", descriptor = "I")
    public static int field864;

    @OriginalMember(owner = "client!pv", name = "m", descriptor = "I")
    public static int field868;

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(B)V", line = 7)
    public final void method595(byte arg0) {
        this.method596(this.field856, this.field865, (byte) -80);
        field868++;
        if (arg0 >= -13) {
            this.field857 = -79;
        }
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(Lkda;IB)V", line = 19)
    private final void method596(class408 arg0, int arg1, byte arg2) {
        if (arg2 >= -21) {
            return;
        }
        field862++;
        if (arg1 != 0) {
            this.method597(118);
            this.field870.method808((byte) 34, this.field860);
            this.field870.method781(5889, 0, arg0, 4, arg1);
        }
    }

    @OriginalMember(owner = "client!pv", name = "<init>", descriptor = "(Lqfa;Llea;Lre;IIIII)V", line = 174)
    public class76(class106 arg0, class637 arg1, class626 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field858 = arg7;
        this.field870 = arg0;
        this.field857 = arg6;
        this.field866 = arg1;
        int var9 = 0x1 << arg5;
        int var10 = 0;
        int var11 = arg3 << arg5;
        int var12 = arg4 << arg5;
        for (int var13 = 0; var13 < var9; var13++) {
            int var25 = (var12 + var13) * arg2.field4289 + var11;
            for (int var26 = 0; var26 < var9; var26++) {
                short[] var27 = arg2.field8792[var25++];
                if (var27 != null) {
                    var10 += var27.length;
                }
            }
        }
        this.field865 = var10;
        if (var10 <= 0) {
            this.field860 = null;
        } else {
            class494 var14 = new class494(var10 * 2);
            if (this.field870.field1514) {
                for (int var15 = 0; var15 < var9; var15++) {
                    int var16 = (var12 + var15) * arg2.field4289 + var11;
                    for (int var17 = 0; var17 < var9; var17++) {
                        short[] var18 = arg2.field8792[var16++];
                        if (var18 != null) {
                            for (int var19 = 0; var19 < var18.length; var19++) {
                                var14.method2957(var18[var19] & 0xFFFF, 1267307848);
                            }
                        }
                    }
                }
            } else {
                for (int var20 = 0; var20 < var9; var20++) {
                    int var21 = (var12 + var20) * arg2.field4289 + var11;
                    for (int var22 = 0; var22 < var9; var22++) {
                        short[] var23 = arg2.field8792[var21++];
                        if (var23 != null) {
                            for (int var24 = 0; var24 < var23.length; var24++) {
                                var14.method2965(var23[var24] & 0xFFFF, (byte) 58);
                            }
                        }
                    }
                }
            }
            this.field856 = this.field870.method793(var14.field7050, var14.field7042, 5123, 64, false);
            this.field869 = new class738(this.field870, 5123, null, 1);
        }
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(I)V", line = 50)
    private final void method597(int arg0) {
        field861++;
        if (!this.field859) {
            return;
        }
        this.field859 = false;
        byte[] var2 = this.field866.field8952;
        byte[] var3 = this.field870.field1587;
        int var4 = 0;
        int var5 = this.field866.field8937;
        int var6 = this.field857 + (this.field866.field8937 * this.field858);
        for (int var7 = -128; var7 < 0; var7++) {
            var4 = (var4 << 8) - var4;
            for (int var13 = -128; var13 < 0; var13++) {
                if (var2[var6++] != 0) {
                    var4++;
                }
            }
            var6 += var5 - 128;
        }
        if (this.field860 != null && this.field867 == var4) {
            this.field859 = false;
            return;
        }
        this.field867 = var4;
        int var8 = this.field858 * var5 + this.field857;
        int var9 = 0;
        for (int var10 = -128; var10 < 0; var10++) {
            for (int var11 = -128; var11 < 0; var11++) {
                if (var2[var8] == 0) {
                    int var12 = 0;
                    if (var2[var8 - 1] != 0) {
                        var12++;
                    }
                    if (var2[var8 + 1] != 0) {
                        var12++;
                    }
                    if (var2[var8 - var5] != 0) {
                        var12++;
                    }
                    if (var2[var5 + var8] != 0) {
                        var12++;
                    }
                    var3[var9++] = (byte) (var12 * 17);
                } else {
                    var3[var9++] = 68;
                }
                var8++;
            }
            var8 += this.field866.field8937 - 128;
        }
        if (arg0 < 105) {
            this.method598(119, 91, 20, null);
        }
        if (this.field860 == null) {
            this.field860 = new class373(this.field870, 3553, 6406, 128, 128, false, this.field870.field1587, 6406, false);
            this.field860.method2314(false, false, 0);
            this.field860.method1312((byte) -79, true);
        } else {
            this.field860.method2313(0, this.field870.field1587, 0, 128, false, 0, 0, 128, 6406, (byte) -50);
        }
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(III[B)V", line = 163)
    public final void method598(int arg0, int arg1, int arg2, byte[] arg3) {
        this.field869.method1240(arg2, (byte) 76, arg3, this.field870.method770(arg2, (byte) 115) * arg0);
        field864++;
        this.method596(this.field869, arg0, (byte) -90);
        if (arg1 != -30020) {
            this.method598(67, -56, -70, null);
        }
    }
}
