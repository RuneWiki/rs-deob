import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class250 extends class215 {

    @OriginalMember(owner = "client!mh", name = "R", descriptor = "I")
    private int field4087 = 0;

    @OriginalMember(owner = "client!mh", name = "W", descriptor = "I")
    private int field4092 = 4096;

    @OriginalMember(owner = "client!mh", name = "P", descriptor = "I")
    public static int field4085 = 0;

    @OriginalMember(owner = "client!mh", name = "Q", descriptor = "I")
    public static int field4086 = 0;

    @OriginalMember(owner = "client!mh", name = "O", descriptor = "F")
    public static float field4084;

    @OriginalMember(owner = "client!mh", name = "S", descriptor = "I")
    public static int field4088;

    @OriginalMember(owner = "client!mh", name = "T", descriptor = "I")
    public static int field4089;

    @OriginalMember(owner = "client!mh", name = "U", descriptor = "I")
    public static int field4090;

    @OriginalMember(owner = "client!mh", name = "V", descriptor = "I")
    public static int field4091;

    @OriginalMember(owner = "client!mh", name = "N", descriptor = "[I")
    public static int[] field4083;

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "(III)Lbi;")
    public static final class185 method1724(int arg0, int arg1, int arg2) {
        class246 var3 = class46.field585[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class185 var4 = var3.field4042;
            var3.field4042 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Ljava/lang/String;BI)V")
    public static final void method1725(String arg0, byte arg1, int arg2) {
        String var3 = class213.method1493(class141.method974(arg1 + -113, arg0), (byte) -87);
        boolean var4 = false;
        ++field4089;
        if (arg1 == 36) {
            for (int var5 = 0; ~class77.field970 < ~var5; ++var5) {
                class259 var6 = class89.field1113[class27.field385[var5]];
                if (var6 != null && var6.field4208 != null && var6.field4208.equalsIgnoreCase(var3)) {
                    var4 = true;
                    if (~arg2 != -2) {
                        if (arg2 != 4) {
                            if (arg2 == 5) {
                                class4.field57.method1932(false, 34);
                                ++class113.field1629;
                                class4.field57.method561(0, true);
                                class4.field57.method572(true, class27.field385[var5]);
                            } else if (arg2 == 6) {
                                ++class94.field1196;
                                class4.field57.method1932(false, 184);
                                class4.field57.method568(class27.field385[var5], (byte) -117);
                                class4.field57.method543((byte) -83, 0);
                            } else if (~arg2 == -8) {
                                class4.field57.method1932(false, 207);
                                class4.field57.method568(class27.field385[var5], (byte) -118);
                                class4.field57.method561(0, true);
                                ++class47.field596;
                            }
                        } else {
                            ++class22.field296;
                            class4.field57.method1932(false, 157);
                            class4.field57.method580((byte) 71, 0);
                            class4.field57.method568(class27.field385[var5], (byte) 73);
                        }
                    } else {
                        ++class122.field1730;
                        class4.field57.method1932(false, 241);
                        class4.field57.method580((byte) 87, 0);
                        class4.field57.method591(arg1 + 594188804, class27.field385[var5]);
                    }
                    break;
                }
            }
            if (!var4) {
                class211.method1487(class294.field4668 + var3, "", 0, (byte) -121);
            }
        }
    }

    @OriginalMember(owner = "client!mh", name = "<init>", descriptor = "()V")
    public class250() {
        super(1, false);
    }

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "(II)[[I")
    public final int[][] method46(int arg0, int arg1) {
        ++field4088;
        if (arg0 != -1) {
            method1724(-2, 88, -63);
        }
        int[][] var3 = super.field3461.method1126(1, arg1);
        if (super.field3461.field2591) {
            int[][] var4 = this.method1504(-117, 0, arg1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[2];
            int[] var9 = var3[1];
            int[] var10 = var3[0];
            for (int var11 = 0; ~var11 > ~class244.field4015; ++var11) {
                int var12 = var5[var11];
                int var13 = var6[var11];
                int var14 = var7[var11];
                if (var12 < this.field4087) {
                    var10[var11] = this.field4087;
                } else if (~this.field4092 <= ~var12) {
                    var10[var11] = var12;
                } else {
                    var10[var11] = this.field4092;
                }
                if (~this.field4087 >= ~var13) {
                    if (this.field4092 >= var13) {
                        var9[var11] = var13;
                    } else {
                        var9[var11] = this.field4092;
                    }
                } else {
                    var9[var11] = this.field4087;
                }
                if (var14 >= this.field4087) {
                    if (~var14 >= ~this.field4092) {
                        var8[var11] = var14;
                    } else {
                        var8[var11] = this.field4092;
                    }
                } else {
                    var8[var11] = this.field4087;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!mh", name = "g", descriptor = "(I)V")
    public static void method1726(int arg0) {
        if (arg0 < -81) {
            field4083 = null;
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IILpd;)V")
    public final void method45(int arg0, int arg1, class96 arg2) {
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (arg1 == 2) {
                    super.field3453 = arg2.method584(255) == 1;
                }
            } else {
                this.field4092 = arg2.method549(255);
            }
        } else {
            this.field4087 = arg2.method549(arg0 ^ 1521146131);
        }
        if (arg0 != 1521146348) {
            field4084 = 0.5411487F;
        }
        ++field4090;
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(II)[I")
    public final int[] method47(int arg0, int arg1) {
        ++field4091;
        int[] var3 = super.field3445.method1755(arg0, (byte) 110);
        if (arg1 != 255) {
            return null;
        } else {
            if (super.field3445.field4163) {
                int[] var4 = this.method1503(-1, 0, arg0);
                for (int var5 = 0; var5 < class244.field4015; ++var5) {
                    int var6 = var4[var5];
                    if (~this.field4087 >= ~var6) {
                        if (this.field4092 >= var6) {
                            var3[var5] = var6;
                        } else {
                            var3[var5] = this.field4092;
                        }
                    } else {
                        var3[var5] = this.field4087;
                    }
                }
            }
            return var3;
        }
    }
}
