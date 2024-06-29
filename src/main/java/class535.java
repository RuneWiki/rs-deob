import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ts")
public class class535 extends class734 {

    @OriginalMember(owner = "client!ts", name = "z", descriptor = "[I")
    public static int[] field7399 = new int[14];

    @OriginalMember(owner = "client!ts", name = "x", descriptor = "F")
    private float field7397;

    @OriginalMember(owner = "client!ts", name = "L", descriptor = "F")
    private float field7411;

    @OriginalMember(owner = "client!ts", name = "w", descriptor = "I")
    public static int field7396;

    @OriginalMember(owner = "client!ts", name = "y", descriptor = "I")
    public static int field7398;

    @OriginalMember(owner = "client!ts", name = "B", descriptor = "I")
    public static int field7401;

    @OriginalMember(owner = "client!ts", name = "C", descriptor = "I")
    public static int field7402;

    @OriginalMember(owner = "client!ts", name = "D", descriptor = "I")
    private int field7403;

    @OriginalMember(owner = "client!ts", name = "E", descriptor = "I")
    private int field7404;

    @OriginalMember(owner = "client!ts", name = "F", descriptor = "I")
    public static int field7405;

    @OriginalMember(owner = "client!ts", name = "I", descriptor = "I")
    public static int field7408;

    @OriginalMember(owner = "client!ts", name = "J", descriptor = "I")
    public static int field7409;

    @OriginalMember(owner = "client!ts", name = "K", descriptor = "I")
    public static int field7410;

    @OriginalMember(owner = "client!ts", name = "M", descriptor = "I")
    public static int field7412;

    @OriginalMember(owner = "client!ts", name = "A", descriptor = "Ljava/lang/String;")
    private String field7400;

    @OriginalMember(owner = "client!ts", name = "G", descriptor = "Ljava/lang/String;")
    private String field7406;

    @OriginalMember(owner = "client!ts", name = "H", descriptor = "Ljava/lang/String;")
    private String field7407;

    @OriginalMember(owner = "client!ts", name = "<init>", descriptor = "(Ljagtheora/ogg/OggStreamState;)V")
    public class535(OggStreamState arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(B)V")
    public final void method689(byte arg0) {
        ++field7405;
        if (arg0 != 13) {
            this.field7407 = null;
        }
    }

    @OriginalMember(owner = "client!ts", name = "b", descriptor = "(B)F")
    public final float method3080(byte arg0) {
        if (arg0 <= 61) {
            return -0.49539495F;
        } else {
            ++field7401;
            return this.field7411;
        }
    }

    @OriginalMember(owner = "client!ts", name = "e", descriptor = "(B)F")
    public final float method3081(byte arg0) {
        ++field7409;
        if (arg0 != 97) {
            this.field7397 = -0.6790166F;
        }
        return this.field7397;
    }

    @OriginalMember(owner = "client!ts", name = "b", descriptor = "(III)Z")
    public static final boolean method3082(int arg0, int arg1, int arg2) {
        if (arg0 != -31735) {
            method3087((byte) -62);
        }
        ++field7408;
        return ~(256 & arg2) != -1;
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(BLjagtheora/ogg/OggPacket;)V")
    public final void method695(byte arg0, OggPacket arg1) {
        ++field7412;
        if (~super.field9905 >= -1 || "SUB".equals(this.field7406)) {
            class215 var3 = new class215(arg1.getData());
            int var4 = var3.method1535(255);
            if (super.field9905 <= 8) {
                if (~(var4 | 128) == -1) {
                    throw new IllegalStateException();
                }
                if (super.field9905 == 0) {
                    var3.field3109 += 23;
                    this.field7404 = var3.method1507(-89);
                    this.field7403 = var3.method1507(-41);
                    if (~this.field7404 == -1 || this.field7403 == 0) {
                        throw new IllegalStateException();
                    }
                    class215 var5 = new class215(16);
                    var3.method1537(Integer.MAX_VALUE, 0, 16, var5.field3066);
                    this.field7400 = var5.method1525((byte) -91);
                    var5.field3109 = 0;
                    var3.method1537(Integer.MAX_VALUE, 0, 16, var5.field3066);
                    this.field7406 = var5.method1525((byte) -40);
                }
            } else {
                if (var4 == 0) {
                    label70: {
                        long var6 = var3.method1480((byte) 109);
                        long var8 = var3.method1480((byte) 90);
                        long var10 = var3.method1480((byte) 122);
                        if (~var6 <= -1L && ~var8 <= -1L && ~var10 <= -1L && var10 <= var6) {
                            this.field7411 = (float) ((long) this.field7403 * var6) / (float) this.field7404;
                            this.field7397 = (float) ((var6 - -var8) * (long) this.field7403) / (float) this.field7404;
                            int var12 = var3.method1507(-93);
                            if (var12 >= 0 && ~(var3.field3066.length + -var3.field3109) <= ~var12) {
                                this.field7407 = class442.method2657(var3.field3066, var3.field3109, -123, var12);
                                break label70;
                            }
                            throw new IllegalStateException();
                        }
                        throw new IllegalStateException();
                    }
                }
                if ((var4 | 128) != 0) {
                    return;
                }
            }
            if (arg0 >= -91) {
                this.field7404 = 88;
            }
        }
    }

    @OriginalMember(owner = "client!ts", name = "b", descriptor = "(I)Ljava/lang/String;")
    public final String method3083(int arg0) {
        ++field7402;
        if (arg0 < 26) {
            this.method3083(-122);
        }
        return this.field7400;
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(IIIII)V")
    public static final void method3084(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field7396;
        if (arg1 != 8 && ~arg1 != -17) {
            class384 var5 = class649.field8928[arg0][arg4][arg2];
            if (var5 != null) {
                if (arg1 != 1) {
                    if (~arg1 == -3) {
                        var5.field5569 = 0;
                    }
                } else {
                    var5.field5580 = 0;
                }
            }
            class227.method1598(false);
        } else {
            for (int var6 = 0; ~var6 > ~class331.field4631; ++var6) {
                class546 var7 = class49.field1042[var6];
                if (var7.field7529 == arg1 && var7.field7522 == arg4 && var7.field7530 == arg2 || ~var7.field7519 == ~arg4 && ~var7.field7530 == ~arg2) {
                    if (~class331.field4631 != ~var6) {
                        class363.method2317(class49.field1042, var6 + 1, class49.field1042, var6, class49.field1042.length + -var6 - 1);
                    }
                    --class331.field4631;
                    return;
                }
            }
        }
        if (arg3 != -3951) {
            field7399 = null;
        }
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(Z)V")
    public static final void method3085(boolean arg0) {
        class112.field1938.method228(((float) class693.field9368.field4429.method2980(-32350) * 0.1F + 0.7F) * class371.field5292);
        ++field7398;
        class112.field1938.method218(class182.field2758, class638.field8778, class570.field7849, (float) (class569.field7822 << 2), (float) (class51.field1074 << 2), (float) (class447.field6331 << 2));
        class112.field1938.method177(class590.field8054);
        if (!arg0) {
            field7399 = null;
        }
    }

    @OriginalMember(owner = "client!ts", name = "d", descriptor = "(I)Ljava/lang/String;")
    public final String method3086(int arg0) {
        int var2 = 4 / ((arg0 - -63) / 50);
        ++field7410;
        return this.field7407;
    }

    @OriginalMember(owner = "client!ts", name = "f", descriptor = "(B)V")
    public static void method3087(byte arg0) {
        field7399 = null;
        if (arg0 <= 101) {
            field7399 = null;
        }
    }
}
