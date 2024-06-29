import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nca")
public class class629 extends class512 {

    @OriginalMember(owner = "client!nca", name = "u", descriptor = "Ljo;")
    private class20 field8983;

    @OriginalMember(owner = "client!nca", name = "q", descriptor = "Lwga;")
    private class484 field8979;

    @OriginalMember(owner = "client!nca", name = "v", descriptor = "Z")
    private boolean field8984;

    @OriginalMember(owner = "client!nca", name = "o", descriptor = "Ljava/lang/String;")
    public static String field8977 = null;

    @OriginalMember(owner = "client!nca", name = "p", descriptor = "I")
    public static int field8978;

    @OriginalMember(owner = "client!nca", name = "r", descriptor = "I")
    public static int field8980;

    @OriginalMember(owner = "client!nca", name = "s", descriptor = "I")
    public static int field8981;

    @OriginalMember(owner = "client!nca", name = "t", descriptor = "I")
    public static int field8982;

    @OriginalMember(owner = "client!nca", name = "w", descriptor = "I")
    public static int field8985;

    @OriginalMember(owner = "client!nca", name = "y", descriptor = "I")
    public static int field8987;

    @OriginalMember(owner = "client!nca", name = "z", descriptor = "I")
    public static int field8988;

    @OriginalMember(owner = "client!nca", name = "x", descriptor = "Z")
    private boolean field8986;

    @OriginalMember(owner = "client!nca", name = "e", descriptor = "(I)Z", line = 3)
    public final boolean method35(int arg0) {
        ++field8978;
        int var2 = -105 / ((-72 - arg0) / 37);
        return this.field8984;
    }

    @OriginalMember(owner = "client!nca", name = "<init>", descriptor = "(Lsb;Lwu;Ljo;)V", line = 13)
    public class629(class93 arg0, class557 arg1, class20 arg2) {
        super(arg0);
        this.field8983 = arg2;
        if (arg1 != null && arg0.field1358 && arg0.field1367) {
            class133 var4 = class487.method2851(arg1.method3330((byte) 67, "environment_mapped_water_v", "gl"), 0, arg0, 35633);
            class133 var5 = class487.method2851(arg1.method3330((byte) 67, "environment_mapped_water_f", "gl"), 0, arg0, 35632);
            this.field8979 = class643.method3730(arg0, new class133[] { var4, var5 }, (byte) 5);
            this.field8984 = this.field8979 != null && this.field8983.method98(-87);
        } else {
            this.field8984 = false;
        }
    }

    @OriginalMember(owner = "client!nca", name = "f", descriptor = "(I)V", line = 35)
    public static void method3671(int arg0) {
        if (arg0 != 2) {
            method3672(-79);
        }
        field8977 = null;
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(IZ)V", line = 45)
    public final void method36(int arg0, boolean arg1) {
        if (arg0 > -62) {
            this.field8983 = null;
        }
        ++field8981;
        class273 var3 = super.field7153.method2898((byte) 94);
        if (this.field8984 && var3 != null) {
            super.field7153.method2949(1, 7544);
            super.field7153.method2933((byte) -8, var3);
            super.field7153.method2949(0, 7544);
            super.field7153.method2933((byte) -35, this.field8983.field243);
            long var4 = this.field8979.field6547;
            OpenGL.glUseProgramObjectARB(var4);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "normalSampler"), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "envMapSampler"), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var4, "sunDir"), -super.field7153.field6861[0], -super.field7153.field6861[1], -super.field7153.field6861[2]);
            OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var4, "sunColour"), super.field7153.field6893, super.field7153.field6810, super.field7153.field6881, 1.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var4, "sunExponent"), 96.0F + 928.0F * Math.abs(super.field7153.field6861[1]));
            this.field8986 = true;
        }
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(IIZ)V", line = 83)
    public final void method38(int arg0, int arg1, boolean arg2) {
        if (this.field8986) {
            int var4 = 1 << (3 & arg0);
            float var5 = (float) (1 << (7 & arg0 >> 3)) / 32.0F;
            int var6 = 65535 & arg1;
            float var7 = (float) ((arg1 & 244142) >> 16) / 8.0F;
            long var8 = this.field8979.field6547;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "time"), (float) (super.field7153.field6811 * var4 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "scale"), var5);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterDepth"), (float) var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterOffset"), var7);
        }
        ++field8987;
        if (arg2) {
            this.method39(-118);
        }
    }

    @OriginalMember(owner = "client!nca", name = "b", descriptor = "(I)V", line = 113)
    public final void method39(int arg0) {
        if (arg0 == 6) {
            ++field8988;
            if (this.field8986) {
                super.field7153.method2949(1, 7544);
                super.field7153.method2933((byte) -53, (class117) null);
                super.field7153.method2949(0, 7544);
                super.field7153.method2933((byte) -98, (class117) null);
                OpenGL.glUseProgramObjectARB(0L);
                this.field8986 = false;
            }
        }
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(IILlo;)V", line = 134)
    public final void method40(int arg0, int arg1, class117 arg2) {
        ++field8982;
        if (!this.field8986) {
            super.field7153.method2933((byte) -82, arg2);
            super.field7153.method2881(arg0, -1);
        }
        if (arg1 != -37) {
            this.field8983 = null;
        }
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(ZZ)V", line = 153)
    public final void method33(boolean arg0, boolean arg1) {
        ++field8985;
        if (!arg0) {
            this.field8986 = true;
        }
    }

    @OriginalMember(owner = "client!nca", name = "g", descriptor = "(I)V", line = 166)
    public static final void method3672(int arg0) {
        ++field8980;
        class204.method1360(0);
        class108.field1547 = null;
        class708.field9899 = 0;
        class545.field7701 = null;
        class669.field9418 = null;
        class658.field9294 = 0;
        class542.field7582 = 0;
        class23.field262 = null;
        class150.field2065.field330 = 0;
        class666.method3820(0);
        class523.method3128((byte) 126);
        for (int var1 = 0; ~var1 > -2049; ++var1) {
            class40.field563[var1] = null;
        }
        class473.field6483 = null;
        for (int var2 = 0; ~class287.field3776 < ~var2; ++var2) {
            class55 var4 = class312.field4003[var2].field204;
            if (var4 != null) {
                var4.field8342 = -1;
            }
        }
        class583.method3466((byte) 122);
        class665.field9377 = 1;
        class374.field5167 = -1;
        class13.field180 = -1;
        class647.method3754(10, true);
        for (int var3 = arg0; var3 < 100; ++var3) {
            class142.field1966[var3] = true;
        }
        class566.method3389(-117);
        class122.field1667 = null;
        class651.field9206 = 0L;
    }
}
