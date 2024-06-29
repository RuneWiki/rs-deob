import jaggl.OpenGL;
import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iq")
public abstract class class151 {

    @OriginalMember(owner = "client!iq", name = "n", descriptor = "I")
    private int field2301;

    @OriginalMember(owner = "client!iq", name = "l", descriptor = "I")
    private int field2299;

    @OriginalMember(owner = "client!iq", name = "k", descriptor = "Lvd;")
    public class258 field2298;

    @OriginalMember(owner = "client!iq", name = "c", descriptor = "Z")
    private boolean field2290;

    @OriginalMember(owner = "client!iq", name = "i", descriptor = "I")
    public int field2296;

    @OriginalMember(owner = "client!iq", name = "h", descriptor = "I")
    public static int field2295 = 0;

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "I")
    public static int field2288 = -2;

    @OriginalMember(owner = "client!iq", name = "m", descriptor = "[Lep;")
    public static class311[] field2300 = new class311[4];

    @OriginalMember(owner = "client!iq", name = "b", descriptor = "I")
    public static int field2289;

    @OriginalMember(owner = "client!iq", name = "d", descriptor = "I")
    public static int field2291;

    @OriginalMember(owner = "client!iq", name = "e", descriptor = "I")
    public static int field2292;

    @OriginalMember(owner = "client!iq", name = "g", descriptor = "I")
    public static int field2294;

    @OriginalMember(owner = "client!iq", name = "j", descriptor = "I")
    public static int field2297;

    @OriginalMember(owner = "client!iq", name = "f", descriptor = "Lc;")
    public static class511 field2293;

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(Lvd;B)V", line = 3)
    public static final void method1088(class258 arg0, byte arg1) {
        field2297++;
        if (class459.field6703 == null) {
            class182 var2 = new class182();
            byte[] var3 = var2.method1239(128, 16, (byte) 109, 128);
            class459.field6703 = class295.method1834(false, var3, arg1 + 131);
        }
        if (arg1 != 5) {
            field2288 = -77;
        }
        if (class30.field431 == null) {
            class492 var4 = new class492();
            byte[] var5 = var4.method2935(128, 16, 128, arg1 + 103);
            class30.field431 = class295.method1834(false, var5, 136);
        }
        class230 var6 = arg0.field3708;
        if (var6.method1428((byte) -87) && class530.field7809 == null) {
            byte[] var7 = class445.method2610(new class4(419684), 4.0F, 16.0F, 8, 128, 128, (byte) 21, 4.0F, 16, 0.6F, 0.5F);
            class530.field7809 = class295.method1834(false, var7, 136);
        }
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(Ldr;II)Z", line = 42)
    public static final boolean method1089(class293 arg0, int arg1, int arg2) {
        field2292++;
        int var3 = arg0.method1823(2, 13255);
        if (var3 == 0) {
            if (arg0.method1823(1, 13255) != 0) {
                method1089(arg0, -7687, arg2);
            }
            int var4 = arg0.method1823(6, 13255);
            int var5 = arg0.method1823(6, 13255);
            boolean var6 = arg0.method1823(1, 13255) == 1;
            if (var6) {
                class488.field7283[class491.field7321++] = arg2;
            }
            if (class83.field1327[arg2] != null) {
                throw new RuntimeException("hr:lr");
            }
            class525 var7 = class490.field7297[arg2];
            class480 var8 = class83.field1327[arg2] = new class480();
            var8.field6015 = arg2;
            if (class448.field6609[arg2] != null) {
                var8.method2862(class448.field6609[arg2], false);
            }
            var8.method2413(var7.field7765, 16383);
            var8.field5991 = var7.field7769;
            int var9 = var7.field7770;
            int var10 = var9 >> 28;
            int var11 = var9 >> 14 & 0xFF;
            var8.field7089 = var7.field7764;
            int var12 = var9 & 0xFF;
            var8.field6062[0] = class364.field5564[arg2];
            var8.field7686 = (byte) var10;
            var8.method2863((byte) 108, (var12 << 6) + var5 - class241.field3358, (var11 << 6) + -class267.field3979 + var4);
            var8.field7060 = false;
            class490.field7297[arg2] = null;
            return true;
        } else if (var3 == 1) {
            int var13 = arg0.method1823(2, 13255);
            int var14 = class490.field7297[arg2].field7770;
            class490.field7297[arg2].field7770 = ((var14 >> 28) + var13 & 0x3 << 28) + (var14 & 0xFFFFFFF);
            return false;
        } else if (var3 == 2) {
            int var15 = arg0.method1823(5, 13255);
            int var16 = var15 >> 3;
            int var17 = var15 & 0x7;
            int var18 = class490.field7297[arg2].field7770;
            int var19 = (var18 >> 28) + var16 & 0x3;
            int var20 = var18 >> 14 & 0xFF;
            int var21 = var18 & 0xFF;
            if (var17 == 0) {
                var20--;
                var21--;
            }
            if (var17 == 1) {
                var21--;
            }
            if (var17 == 2) {
                var21--;
                var20++;
            }
            if (var17 == 3) {
                var20--;
            }
            if (var17 == 4) {
                var20++;
            }
            if (var17 == 5) {
                var20--;
                var21++;
            }
            if (var17 == 6) {
                var21++;
            }
            if (var17 == 7) {
                var21++;
                var20++;
            }
            class490.field7297[arg2].field7770 = (var19 << 28) + (var20 << 14) + var21;
            return false;
        } else {
            int var22 = arg0.method1823(18, arg1 + 20942);
            int var23 = var22 >> 16;
            int var24 = (var22 & 0xFF7A) >> 8;
            int var25 = var22 & 0xFF;
            int var26 = class490.field7297[arg2].field7770;
            if (arg1 != -7687) {
                method1088(null, (byte) -98);
            }
            int var27 = (var26 >> 28) + var23 & 0x3;
            int var28 = (var26 >> 14) + var24 & 0xFF;
            int var29 = var25 + var26 & 0xFF;
            class490.field7297[arg2].field7770 = (var28 << 14) + (var27 << 28) + var29;
            return false;
        }
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(ZB)V", line = 202)
    public static final void method1090(boolean arg0, byte arg1) {
        if (arg0 && class137.field2018 != null) {
            class431.field6399 = class137.field2018.field2254;
        } else {
            class431.field6399 = -1;
        }
        field2291++;
        class6.field59 = null;
        class137.field2018 = null;
        class316.field4886 = null;
        class507.field7449 = 0;
        class137.method1007();
        class137.field2025.method2955(2131289328);
        class9.field87 = -1;
        class30.field425 = -1;
        class197.field2886 = null;
        class146.field2194 = null;
        if (arg1 <= 21) {
            field2300 = null;
        }
        class286.field4294 = null;
        class87.field1371 = null;
        class282.field4266 = null;
        class14.field187 = null;
        class266.field3967 = null;
        class314.field4858 = null;
        class414.field6248 = null;
        class137.field2031 = null;
        class137.field2014.method697(-18016);
        class137.field2019.method337(64, (byte) -128, 64);
        class137.field2014.method702(128, -14845, 64);
        class137.field2017.method252(23062, 64);
        class41.field539.method2510(64, (byte) 76);
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "([BII)V", line = 249)
    public final void method1091(byte[] arg0, int arg1, int arg2) {
        field2289++;
        if (arg1 != 1) {
            this.method1093(-2);
        }
        this.method1093(110);
        if (this.field2299 >= arg2) {
            OpenGL.glBufferSubDataARB(this.field2301, 0, arg2, arg0, 0);
        } else {
            OpenGL.glBufferDataARBub(this.field2301, arg2, arg0, 0, this.field2290 ? 35040 : 35044);
            this.field2298.field3719 += arg2 - this.field2299;
            this.field2299 = arg2;
        }
    }

    @OriginalMember(owner = "client!iq", name = "finalize", descriptor = "()V", line = 277)
    protected final void finalize() throws Throwable {
        field2294++;
        this.field2298.method1577(this.field2296, (byte) -40, this.field2299);
        super.finalize();
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(B)V", line = 286)
    public static void method1092(byte arg0) {
        field2300 = null;
        if (arg0 <= 69) {
            field2288 = -79;
        }
        field2293 = null;
    }

    @OriginalMember(owner = "client!iq", name = "<init>", descriptor = "(Lvd;I[BIZ)V", line = 306)
    public class151(class258 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        this.field2301 = arg1;
        this.field2299 = arg3;
        this.field2298 = arg0;
        this.field2290 = arg4;
        OpenGL.glGenBuffersARB(1, class191.field2787, 0);
        this.field2296 = class191.field2787[0];
        this.method1093(115);
        OpenGL.glBufferDataARBub(arg1, this.field2299, arg2, 0, this.field2290 ? 35040 : 35044);
        this.field2298.field3719 += this.field2299;
    }

    @OriginalMember(owner = "client!iq", name = "<init>", descriptor = "(Lvd;ILjaggl/memory/NativeBuffer;IZ)V", line = 325)
    public class151(class258 arg0, int arg1, NativeBuffer arg2, int arg3, boolean arg4) {
        this.field2299 = arg3;
        this.field2301 = arg1;
        this.field2290 = arg4;
        this.field2298 = arg0;
        OpenGL.glGenBuffersARB(1, class191.field2787, 0);
        this.field2296 = class191.field2787[0];
        this.method1093(63);
        OpenGL.glBufferDataARBa(arg1, this.field2299, arg2.method2846(), this.field2290 ? 35040 : 35044);
        this.field2298.field3719 += this.field2299;
    }

    @OriginalMember(owner = "client!iq", name = "d", descriptor = "(I)V")
    public abstract void method1093(int arg0);
}
