import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ho")
public class class131 extends class607 {

    @OriginalMember(owner = "client!ho", name = "t", descriptor = "[F")
    private float[] field1646 = new float[4];

    @OriginalMember(owner = "client!ho", name = "n", descriptor = "Lle;")
    private class260 field1640;

    @OriginalMember(owner = "client!ho", name = "k", descriptor = "Lle;")
    private class260 field1637;

    @OriginalMember(owner = "client!ho", name = "A", descriptor = "Lle;")
    private class260 field1653;

    @OriginalMember(owner = "client!ho", name = "r", descriptor = "Lle;")
    private class260 field1644;

    @OriginalMember(owner = "client!ho", name = "l", descriptor = "Z")
    private boolean field1638;

    @OriginalMember(owner = "client!ho", name = "i", descriptor = "I")
    public static int field1635;

    @OriginalMember(owner = "client!ho", name = "j", descriptor = "I")
    public static int field1636;

    @OriginalMember(owner = "client!ho", name = "m", descriptor = "I")
    public static int field1639;

    @OriginalMember(owner = "client!ho", name = "o", descriptor = "I")
    public static int field1641;

    @OriginalMember(owner = "client!ho", name = "p", descriptor = "I")
    public static int field1642;

    @OriginalMember(owner = "client!ho", name = "s", descriptor = "I")
    public static int field1645;

    @OriginalMember(owner = "client!ho", name = "u", descriptor = "I")
    public static int field1647;

    @OriginalMember(owner = "client!ho", name = "v", descriptor = "I")
    public static int field1648;

    @OriginalMember(owner = "client!ho", name = "w", descriptor = "I")
    public static int field1649;

    @OriginalMember(owner = "client!ho", name = "x", descriptor = "I")
    public static int field1650;

    @OriginalMember(owner = "client!ho", name = "y", descriptor = "I")
    public static int field1651;

    @OriginalMember(owner = "client!ho", name = "q", descriptor = "Z")
    private boolean field1643;

    @OriginalMember(owner = "client!ho", name = "z", descriptor = "Z")
    private boolean field1652;

    @OriginalMember(owner = "client!ho", name = "b", descriptor = "(III)Z")
    public static final boolean method804(int arg0, int arg1, int arg2) {
        ++field1645;
        int var3 = 27 / ((arg0 - 70) / 46);
        return (34 & arg1) != 0;
    }

    @OriginalMember(owner = "client!ho", name = "c", descriptor = "(B)V")
    public final void method805(byte arg0) {
        if (this.field1643) {
            OpenGL.glBindProgramARB(34336, 0);
            OpenGL.glDisable(34820);
            OpenGL.glDisable(34336);
            this.field1643 = false;
        }
        if (arg0 != -58) {
            this.field1638 = false;
        }
        ++field1649;
    }

    @OriginalMember(owner = "client!ho", name = "<init>", descriptor = "(Lgf;Lkea;)V")
    public class131(class234 arg0, class203 arg1) {
        super(arg0);
        if (arg0.field3370) {
            this.field1640 = class139.method837(arg1.method1281((byte) -37, "uw_ground_unlit", "gl"), 33, 34336, arg0);
            this.field1637 = class139.method837(arg1.method1281((byte) -37, "uw_ground_lit", "gl"), 79, 34336, arg0);
            this.field1653 = class139.method837(arg1.method1281((byte) -37, "uw_model_unlit", "gl"), 46, 34336, arg0);
            this.field1644 = class139.method837(arg1.method1281((byte) -37, "uw_model_lit", "gl"), 109, 34336, arg0);
            this.field1638 = this.field1644 != null & this.field1653 != null & this.field1640 != null & this.field1637 != null;
        } else {
            this.field1638 = false;
        }
    }

    @OriginalMember(owner = "client!ho", name = "b", descriptor = "(Z)V")
    public final void method806(boolean arg0) {
        ++field1648;
        int var2 = super.field8870.method1958(-19719);
        class646 var3 = super.field8870.method1977(!arg0);
        var3.method3699(this.field1646, 94, 0.0F, -1.0F, (float) var2, 0.0F);
        if (this.field1652) {
            OpenGL.glBindProgramARB(34336, var2 != Integer.MAX_VALUE ? this.field1644.field3697 : this.field1637.field3697);
        } else {
            OpenGL.glBindProgramARB(34336, var2 == Integer.MAX_VALUE ? this.field1640.field3697 : this.field1653.field3697);
        }
        OpenGL.glEnable(34336);
        this.field1643 = arg0;
        OpenGL.glProgramLocalParameter4fARB(34336, 1, this.field1646[0], this.field1646[1], this.field1646[2], this.field1646[3]);
        this.method813(-8635);
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(BIIIIIIII)V")
    public static final void method807(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg0 != 29) {
            method809(-12);
        }
        ++field1635;
        if (arg6 >= 1 && arg2 >= 1 && arg6 <= class90.field1032 + -2 && arg2 <= class30.field349 + -2) {
            int var9 = arg5;
            if (arg5 < 3 && class647.method3709(arg6, arg2, -17206)) {
                var9 = arg5 + 1;
            }
            if (!class595.field8694.method2426(class81.field908, -5) && !class582.method3378(arg6, (byte) -74, arg2, class394.field6023, var9)) {
                return;
            }
            if (class431.field6408 == null) {
                return;
            }
            class273.field3824.method1763(class413.field6264, class14.field120[arg5], arg2, arg5, arg6, arg0 + -31, arg3);
            if (arg1 >= 0) {
                boolean var10 = class595.field8694.field6549;
                class595.field8694.field6549 = true;
                class273.field3824.method1768(class413.field6264, var9, arg8, arg0 + -23, arg1, arg7, arg2, arg6, arg4, class14.field120[arg5], arg5);
                class595.field8694.field6549 = var10;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(IZ)V")
    public final void method808(int arg0, boolean arg1) {
        ++field1636;
        if (arg0 != 993) {
            method804(-16, -96, 75);
        }
    }

    @OriginalMember(owner = "client!ho", name = "e", descriptor = "(I)V")
    public static final void method809(int arg0) {
        ++field1647;
        int var1 = class162.field1979.length;
        for (int var2 = 0; ~var2 > ~var1; ++var2) {
            if (class162.field1979[var2] != null) {
                int var3 = -1;
                for (int var4 = 0; ~class475.field7024 < ~var4; ++var4) {
                    if (class180.field2219[var4] == class170.field2090[var2]) {
                        var3 = var4;
                        break;
                    }
                }
                if (~var3 == 0) {
                    class180.field2219[class475.field7024] = class170.field2090[var2];
                    var3 = class475.field7024++;
                }
                class194 var5 = new class194(class162.field1979[var2]);
                int var6 = 0;
                while (~var5.field2610 > ~class162.field1979[var2].length && var6 < 511 && class387.field5958 < 1023) {
                    int var7 = var3 | var6++ << 6;
                    int var8 = var5.method1220(-52);
                    int var9 = var8 >> 14;
                    int var10 = var8 >> 7 & 63;
                    int var11 = var8 & 63;
                    int var12 = (class170.field2090[var2] >> 8) * 64 - class287.field3980 - -var10;
                    int var13 = (class170.field2090[var2] & 255) * 64 + -class250.field3549 + var11;
                    class566 var14 = class224.field3151.method1817(-101, var5.method1220(121));
                    class411 var15 = (class411) class42.field456.method524((byte) 122, (long) var7);
                    if (var15 == null && (1 & var14.field8074) > 0 && class394.field6023 == var9 && var12 >= 0 && ~class90.field1032 < ~(var14.field8096 + var12) && ~var13 <= -1 && ~(var14.field8096 + var13) > ~class30.field349) {
                        class78 var16 = new class78();
                        var16.field2495 = var7;
                        class411 var17 = new class411(var16);
                        class42.field456.method520((byte) -90, var17, (long) var7);
                        class599.field8757[class458.field6840++] = var17;
                        class362.field5141[class387.field5958++] = var7;
                        var16.field2455 = class287.field3982;
                        var16.method509(var14, -4);
                        var16.method1157((byte) -113, var16.field864.field8096);
                        var16.field2505 = var16.field864.field8129 << 3;
                        var16.method1149((-195035129 & var16.field864.field8075 - -4) << 11, 108, true);
                        var16.method503(var12, true, var16.method1153(true), var13, -1, var9);
                    }
                }
            }
        }
        if (arg0 <= -48) {
            ;
        }
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(IBLiu;)V")
    public final void method810(int arg0, byte arg1, class502 arg2) {
        ++field1642;
        super.field8870.method1971((byte) -125, arg2);
        if (arg1 >= -73) {
            method809(62);
        }
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(ZB)V")
    public final void method811(boolean arg0, byte arg1) {
        ++field1641;
        if (arg1 != 91) {
            this.field1640 = null;
        }
        this.field1652 = arg0;
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(ILd;)V")
    public static final void method812(int arg0, class132 arg1) {
        class435.field6449[arg0] = arg1;
    }

    @OriginalMember(owner = "client!ho", name = "b", descriptor = "(I)V")
    public final void method813(int arg0) {
        if (this.field1643) {
            OpenGL.glProgramLocalParameter4fARB(34336, 0, (float) (super.field8870.method369() + -1280), (float) (-768 + super.field8870.method369()), 1.0F / (float) super.field8870.method1897(-18644), (float) super.field8870.method1914(0) / 255.0F);
        }
        if (arg0 == -8635) {
            ++field1639;
        }
    }

    @OriginalMember(owner = "client!ho", name = "b", descriptor = "(B)Z")
    public final boolean method814(byte arg0) {
        if (arg0 != -97) {
            return true;
        } else {
            ++field1651;
            return this.field1638;
        }
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(III)V")
    public final void method815(int arg0, int arg1, int arg2) {
        if (arg0 != 12868) {
            this.field1646 = null;
        }
        ++field1650;
    }
}
