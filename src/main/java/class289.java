import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vea")
public class class289 extends class10 {

    @OriginalMember(owner = "client!vea", name = "B", descriptor = "I")
    private int field4119;

    @OriginalMember(owner = "client!vea", name = "y", descriptor = "I")
    private int field4116;

    @OriginalMember(owner = "client!vea", name = "u", descriptor = "I")
    private int field4112;

    @OriginalMember(owner = "client!vea", name = "J", descriptor = "I")
    private int field4126;

    @OriginalMember(owner = "client!vea", name = "x", descriptor = "I")
    public static int field4115 = 0;

    @OriginalMember(owner = "client!vea", name = "K", descriptor = "I")
    public static int field4127 = 0;

    @OriginalMember(owner = "client!vea", name = "A", descriptor = "Leo;")
    public static class313 field4118 = new class313(7, 2);

    @OriginalMember(owner = "client!vea", name = "s", descriptor = "I")
    private int field4110;

    @OriginalMember(owner = "client!vea", name = "t", descriptor = "I")
    public static int field4111;

    @OriginalMember(owner = "client!vea", name = "v", descriptor = "I")
    public static int field4113;

    @OriginalMember(owner = "client!vea", name = "w", descriptor = "I")
    private int field4114;

    @OriginalMember(owner = "client!vea", name = "z", descriptor = "I")
    private int field4117;

    @OriginalMember(owner = "client!vea", name = "C", descriptor = "I")
    public static int field4120;

    @OriginalMember(owner = "client!vea", name = "D", descriptor = "I")
    public static int field4121;

    @OriginalMember(owner = "client!vea", name = "E", descriptor = "I")
    public static int field4122;

    @OriginalMember(owner = "client!vea", name = "F", descriptor = "I")
    private int field4123;

    @OriginalMember(owner = "client!vea", name = "H", descriptor = "I")
    public static int field4124;

    // $FF: synthetic field
    @OriginalMember(owner = "client!vea", name = "L", descriptor = "Ljava/lang/Class;")
    public static Class field4128;

    @OriginalMember(owner = "client!vea", name = "I", descriptor = "[B")
    private byte[] field4125;

    // $FF: synthetic method
    @OriginalMember(owner = "client!vea", name = "b", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method1858(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!vea", name = "a", descriptor = "(BLjava/lang/String;)Z", line = 5)
    public static final boolean method1854(byte arg0, String arg1) {
        field4122++;
        int var2 = 117 % ((arg0 + 53) / 41);
        return class77.method626((byte) 67, arg1, field4128 == null ? (field4128 = method1858("caa")) : field4128);
    }

    @OriginalMember(owner = "client!vea", name = "a", descriptor = "(B)V", line = 15)
    public final void method70(byte arg0) {
        this.field4123 >>= 0x4;
        int var2 = -104 / ((arg0 - 59) / 42);
        field4124++;
        this.field4126 = this.field4112;
        if (this.field4123 < 0) {
            this.field4123 = 0;
        } else if (this.field4123 > 255) {
            this.field4123 = 255;
        }
        this.method1855((byte) this.field4123, this.field4114++, (byte) 122);
        this.field4123 = 0;
    }

    @OriginalMember(owner = "client!vea", name = "a", descriptor = "(BIB)V", line = 36)
    public void method1855(byte arg0, int arg1, byte arg2) {
        int var4 = 103 / ((78 - arg2) / 43);
        field4111++;
        this.field4125[arg1] = arg0;
    }

    @OriginalMember(owner = "client!vea", name = "c", descriptor = "(B)V", line = 47)
    public static void method1856(byte arg0) {
        if (arg0 != 39) {
            method1854((byte) -77, null);
        }
        field4118 = null;
    }

    @OriginalMember(owner = "client!vea", name = "<init>", descriptor = "(IIIIIFFF)V", line = 62)
    public class289(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, float arg7) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field4119 = (int) (arg6 * 4096.0F);
        this.field4116 = (int) (arg7 * 4096.0F);
        this.field4126 = this.field4112 = (int) (Math.pow(0.5D, (double) (-arg5)) * 4096.0D);
    }

    @OriginalMember(owner = "client!vea", name = "a", descriptor = "(IIB)V", line = 73)
    public final void method73(int arg0, int arg1, byte arg2) {
        field4120++;
        int var4 = 44 % ((32 - arg2) / 46);
        if (arg0 == 0) {
            this.field4110 = this.field4119 - (arg1 < 0 ? -arg1 : arg1);
            this.field4117 = 4096;
            this.field4110 = this.field4110 * this.field4110 >> 12;
            this.field4123 = this.field4110;
            return;
        }
        this.field4117 = this.field4116 * this.field4110 >> 12;
        if (this.field4117 < 0) {
            this.field4117 = 0;
        } else if (this.field4117 > 4096) {
            this.field4117 = 4096;
        }
        this.field4110 = this.field4119 - (arg1 < 0 ? -arg1 : arg1);
        this.field4110 = this.field4110 * this.field4110 >> 12;
        this.field4110 = this.field4117 * this.field4110 >> 12;
        this.field4123 += this.field4126 * this.field4110 >> 12;
        this.field4126 = this.field4126 * this.field4112 >> 12;
    }

    @OriginalMember(owner = "client!vea", name = "b", descriptor = "(I)V", line = 120)
    public final void method68(int arg0) {
        this.field4114 = 0;
        int var2 = -55 / ((arg0 - 58) / 58);
        field4121++;
        this.field4123 = 0;
    }

    @OriginalMember(owner = "client!vea", name = "a", descriptor = "(Lha;I)V", line = 131)
    public static final void method1857(class66 arg0, int arg1) {
        field4113++;
        if (!(class269.field3929 >= 2 || class506.field7094) || class528.field7306 != null) {
            return;
        }
        String var2;
        if (class506.field7094 && class269.field3929 < 2) {
            var2 = class385.field5594 + class58.field729.method365(class55.field647, (byte) 108) + class545.field7534 + " ->";
        } else if (class186.field2437 && class235.field3128.method983(101, 81) && class269.field3929 > 2) {
            var2 = class631.method3482(class191.field2474, (byte) 100);
        } else {
            class478 var3 = class191.field2474;
            if (var3 == null) {
                return;
            }
            var2 = class631.method3482(var3, (byte) 100);
            int[] var4 = null;
            if (class235.method1492(var3.field6718, 29470)) {
                var4 = class16.field156.method2121((int) var3.field6719, 25928).field5366;
            } else if (var3.field6703 != -1) {
                var4 = class16.field156.method2121(var3.field6703, 25928).field5366;
            } else if (class450.method2678(-49, var3.field6718)) {
                class316 var5 = (class316) class176.field2326.method1248(121, (long) ((int) var3.field6719));
                if (var5 != null) {
                    class22 var6 = var5.field4455;
                    class304 var7 = var6.field217;
                    if (var7.field4295 != null) {
                        var7 = var7.method1968(class480.field6740, ~arg1);
                    }
                    if (var7 != null) {
                        var4 = var7.field4340;
                    }
                }
            } else if (class480.method2830(var3.field6718, true)) {
                Object var8 = null;
                class412 var9;
                if (var3.field6718 == 1012) {
                    var9 = class210.field2705.method1362(0, (int) var3.field6719);
                } else {
                    var9 = class210.field2705.method1362(0, (int) (var3.field6719 >>> 32 & 0x7FFFFFFFL));
                }
                if (var9.field5919 != null) {
                    var9 = var9.method2478(class480.field6740, -1);
                }
                if (var9 != null) {
                    var4 = var9.field5920;
                }
            }
            if (var4 != null) {
                var2 = var2 + class493.method2907((byte) 106, var4);
            }
        }
        if (class269.field3929 > 2) {
            var2 = var2 + "<col=ffffff> / " + (class269.field3929 - 2) + class58.field722.method365(class55.field647, (byte) 63);
        }
        if (arg1 != 0) {
            return;
        }
        if (class40.field417 != null) {
            class67 var10 = class40.field417.method2217((byte) 125, arg0);
            if (var10 == null) {
                var10 = class88.field1251;
            }
            var10.method563(class40.field417.field4944, class446.field6413, class639.field8612, class214.field2817, class81.field1115, class36.field382, true, class634.field8573, class584.field7966, class40.field417.field5038, class40.field417.field4940, var2, class40.field417.field5035, class40.field417.field4966, class40.field417.field4986);
            class682.method3741(0, class446.field6413[3], class446.field6413[0], class446.field6413[2], class446.field6413[1]);
        } else if (class474.field6659 != null && class743.field10050 == class426.field6204) {
            int var11 = class88.field1251.method562(var2, class634.field8573, class502.field7071 + 4, (byte) -112, 16777215, 0, class36.field382, class81.field1115, class584.field7966, class570.field7770 + 16);
            class682.method3741(arg1, 16, class502.field7071 + 4, var11 + class643.field8657.method3619((byte) -69, var2), class570.field7770);
        }
    }
}
