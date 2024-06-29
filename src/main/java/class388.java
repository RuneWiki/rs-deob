import jaggl.OpenGL;
import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rca")
public class class388 extends class516 {

    @OriginalMember(owner = "client!rca", name = "E", descriptor = "[F")
    private float[] field5342 = new float[4];

    @OriginalMember(owner = "client!rca", name = "D", descriptor = "Loba;")
    private class220 field5341;

    @OriginalMember(owner = "client!rca", name = "m", descriptor = "Loba;")
    private class220 field5324;

    @OriginalMember(owner = "client!rca", name = "k", descriptor = "Loba;")
    private class220 field5322;

    @OriginalMember(owner = "client!rca", name = "A", descriptor = "Loba;")
    private class220 field5338;

    @OriginalMember(owner = "client!rca", name = "p", descriptor = "Z")
    private boolean field5327;

    @OriginalMember(owner = "client!rca", name = "u", descriptor = "[I")
    public static int[] field5332 = new int[13];

    @OriginalMember(owner = "client!rca", name = "o", descriptor = "Llu;")
    public static class610 field5326 = new class610(45, 11);

    @OriginalMember(owner = "client!rca", name = "l", descriptor = "I")
    public static int field5323;

    @OriginalMember(owner = "client!rca", name = "q", descriptor = "I")
    public static int field5328;

    @OriginalMember(owner = "client!rca", name = "r", descriptor = "I")
    public static int field5329;

    @OriginalMember(owner = "client!rca", name = "v", descriptor = "I")
    public static int field5333;

    @OriginalMember(owner = "client!rca", name = "w", descriptor = "I")
    public static int field5334;

    @OriginalMember(owner = "client!rca", name = "x", descriptor = "I")
    public static int field5335;

    @OriginalMember(owner = "client!rca", name = "y", descriptor = "I")
    public static int field5336;

    @OriginalMember(owner = "client!rca", name = "z", descriptor = "I")
    public static int field5337;

    @OriginalMember(owner = "client!rca", name = "B", descriptor = "I")
    public static int field5339;

    @OriginalMember(owner = "client!rca", name = "C", descriptor = "I")
    public static int field5340;

    @OriginalMember(owner = "client!rca", name = "F", descriptor = "I")
    public static int field5343;

    @OriginalMember(owner = "client!rca", name = "G", descriptor = "I")
    public static int field5344;

    @OriginalMember(owner = "client!rca", name = "H", descriptor = "I")
    public static int field5345;

    @OriginalMember(owner = "client!rca", name = "J", descriptor = "I")
    public static int field5346;

    @OriginalMember(owner = "client!rca", name = "t", descriptor = "Lkda;")
    public static class328 field5331;

    @OriginalMember(owner = "client!rca", name = "n", descriptor = "Z")
    private boolean field5325;

    @OriginalMember(owner = "client!rca", name = "s", descriptor = "Z")
    private boolean field5330;

    @OriginalMember(owner = "client!rca", name = "K", descriptor = "[[S")
    public static short[][] field5347;

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(ZZ)V", line = 3)
    public final void method195(boolean arg0, boolean arg1) {
        ++field5346;
        if (!arg1) {
            method2310(49, (File) null);
        }
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(Z)V", line = 14)
    public final void method197(boolean arg0) {
        if (arg0) {
            method2309((byte) 108);
        }
        ++field5335;
        if (this.field5325) {
            OpenGL.glBindProgramARB(34336, 0);
            OpenGL.glDisable(34820);
            OpenGL.glDisable(34336);
            this.field5325 = false;
        }
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(ILgba;)V", line = 33)
    public static final void method2308(int arg0, class574 arg1) {
        ++field5339;
        if (arg0 != -1) {
            field5332 = null;
        }
        for (int var2 = 0; ~class580.field8538 < ~var2; ++var2) {
            int var3 = class632.field9279[var2];
            class373 var4 = class293.field4036[var3];
            int var5 = arg1.method1032((byte) -33);
            if (~(var5 & 32) != -1) {
                var5 += arg1.method1032((byte) -33) << 8;
            }
            if (~(4096 & var5) != -1) {
                var5 += arg1.method1032((byte) -33) << 16;
            }
            class22.method136(var5, -6043, var4, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(Lpb;II)V", line = 66)
    public final void method202(class563 arg0, int arg1, int arg2) {
        ++field5334;
        if (arg2 != -1) {
            method2310(125, (File) null);
        }
        super.field7353.method2632(arg0, arg2 + 1);
    }

    @OriginalMember(owner = "client!rca", name = "e", descriptor = "(B)V", line = 77)
    public static final void method2309(byte arg0) {
        if (arg0 != -78) {
            field5326 = null;
        }
        ++field5337;
        for (class210 var1 = (class210) class525.field7519.method124((byte) 42); var1 != null; var1 = (class210) class525.field7519.method120(108)) {
            class319 var2 = var1.field3103;
            if (~class617.field9123 >= ~var2.field4406) {
                if (~class617.field9123 <= ~var2.field4400) {
                    if (var2.field4388 > 0) {
                        class505 var3 = (class505) class510.field7260.method2799((long) (var2.field4388 + -1), true);
                        if (var3 != null) {
                            class571 var4 = var3.field7148;
                            if (~var4.field8496 <= -1 && ~(class146.field2125 * 128) < ~var4.field8496 && ~var4.field8500 <= -1 && var4.field8500 < class410.field5609 * 128) {
                                var2.method1930(0, var4.field8496, class132.method919(var2.field8501, var4.field8500, var4.field8496, (byte) -82) + -var2.field4415, class617.field9123, var4.field8500);
                            }
                        }
                    }
                    if (~var2.field4388 > -1) {
                        int var5 = -var2.field4388 - 1;
                        class373 var6;
                        if (~class183.field2758 == ~var5) {
                            var6 = class541.field8119;
                        } else {
                            var6 = class293.field4036[var5];
                        }
                        if (var6 != null && var6.field8496 >= 0 && ~(class146.field2125 * 128) < ~var6.field8496 && ~var6.field8500 <= -1 && ~var6.field8500 > ~(class410.field5609 * 128)) {
                            var2.method1930(0, var6.field8496, class132.method919(var2.field8501, var6.field8500, var6.field8496, (byte) -82) - var2.field4415, class617.field9123, var6.field8500);
                        }
                    }
                    var2.method1927(class647.field9402, (byte) 67);
                    class320.method1933(var2, true);
                }
            } else {
                var1.method2457(-8422);
                var2.method1932(arg0 + 8);
            }
        }
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(III)V", line = 149)
    public final void method200(int arg0, int arg1, int arg2) {
        int var4 = -127 / ((-41 - arg0) / 57);
        ++field5343;
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(ILjava/io/File;)[B", line = 161)
    public static final byte[] method2310(int arg0, File arg1) {
        if (arg0 <= 4) {
            field5326 = null;
        }
        ++field5345;
        return class495.method2954(17254, (int) arg1.length(), arg1);
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(IBI)Z", line = 172)
    public static final boolean method2311(int arg0, byte arg1, int arg2) {
        int var3 = 94 % ((arg1 - -47) / 44);
        ++field5329;
        return class477.method2874((byte) -5, arg0, arg2) | (arg2 & 2048) != 0 || class286.method1775(arg0, -37, arg2);
    }

    @OriginalMember(owner = "client!rca", name = "d", descriptor = "(I)V", line = 183)
    public static void method2312(int arg0) {
        if (arg0 == 0) {
            field5326 = null;
            field5331 = null;
            field5347 = null;
            field5332 = null;
        }
    }

    @OriginalMember(owner = "client!rca", name = "<init>", descriptor = "(Lag;Lkda;)V", line = 201)
    public class388(class587 arg0, class328 arg1) {
        super(arg0);
        if (arg0.field8707) {
            this.field5341 = class639.method3699(34336, arg0, (byte) 126, arg1.method1990("uw_ground_unlit", 0, "gl"));
            this.field5324 = class639.method3699(34336, arg0, (byte) 121, arg1.method1990("uw_ground_lit", 0, "gl"));
            this.field5322 = class639.method3699(34336, arg0, (byte) 122, arg1.method1990("uw_model_unlit", 0, "gl"));
            this.field5338 = class639.method3699(34336, arg0, (byte) 125, arg1.method1990("uw_model_lit", 0, "gl"));
            this.field5327 = this.field5338 != null & this.field5341 != null & this.field5324 != null & this.field5322 != null;
        } else {
            this.field5327 = false;
        }
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(BZ)V", line = 223)
    public final void method199(byte arg0, boolean arg1) {
        this.field5330 = arg1;
        ++field5333;
        int var3 = -31 % ((63 - arg0) / 38);
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(II)V", line = 234)
    public static final void method2313(int arg0, int arg1) {
        ++field5340;
        class221 var2 = class65.method413(arg1, arg0, (byte) 125);
        var2.method1432(arg1 ^ 7);
    }

    @OriginalMember(owner = "client!rca", name = "d", descriptor = "(B)V", line = 245)
    public final void method1200(byte arg0) {
        int var2 = -106 / ((arg0 - -31) / 61);
        ++field5336;
        if (this.field5325) {
            OpenGL.glProgramLocalParameter4fARB(34336, 0, (float) (super.field7353.method435() - 1280), (float) (-768 + super.field7353.method435()), 1.0F / (float) super.field7353.method2674((byte) 84), (float) super.field7353.method2577((byte) -85) / 255.0F);
        }
    }

    @OriginalMember(owner = "client!rca", name = "b", descriptor = "(B)V", line = 267)
    public final void method1195(byte arg0) {
        ++field5323;
        int var2 = super.field7353.method2672(9);
        class57 var3 = super.field7353.method2599(5);
        if (arg0 < 117) {
            field5347 = null;
        }
        var3.method379(this.field5342, -47, 0.0F, (float) var2, -1.0F, 0.0F);
        if (this.field5330) {
            OpenGL.glBindProgramARB(34336, ~var2 != Integer.MIN_VALUE ? this.field5338.field3200 : this.field5324.field3200);
        } else {
            OpenGL.glBindProgramARB(34336, var2 == Integer.MAX_VALUE ? this.field5341.field3200 : this.field5322.field3200);
        }
        OpenGL.glEnable(34336);
        this.field5325 = true;
        OpenGL.glProgramLocalParameter4fARB(34336, 1, this.field5342[0], this.field5342[1], this.field5342[2], this.field5342[3]);
        this.method1200((byte) -121);
    }

    @OriginalMember(owner = "client!rca", name = "c", descriptor = "(B)Z", line = 297)
    public final boolean method201(byte arg0) {
        ++field5328;
        if (arg0 >= -60) {
            this.field5322 = null;
        }
        return this.field5327;
    }

    @OriginalMember(owner = "client!rca", name = "e", descriptor = "(I)V", line = 309)
    public static final void method2314(int arg0) {
        ++field5344;
        ++class328.field4529;
        class402.method2367(class623.field9186, (byte) 104);
        class112.field1589.method1049(-1, 0);
        if (arg0 != 30235) {
            field5347 = null;
        }
    }
}
