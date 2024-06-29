import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gn")
public class class700 extends class369 {

    @OriginalMember(owner = "client!gn", name = "q", descriptor = "Llc;")
    private class648 field9474;

    @OriginalMember(owner = "client!gn", name = "l", descriptor = "Ljv;")
    private class80 field9469;

    @OriginalMember(owner = "client!gn", name = "f", descriptor = "I")
    public static int field9463 = -1;

    @OriginalMember(owner = "client!gn", name = "r", descriptor = "[I")
    public static int[] field9475 = new int[1];

    @OriginalMember(owner = "client!gn", name = "g", descriptor = "I")
    public static int field9464;

    @OriginalMember(owner = "client!gn", name = "h", descriptor = "I")
    public static int field9465;

    @OriginalMember(owner = "client!gn", name = "i", descriptor = "I")
    public static int field9466;

    @OriginalMember(owner = "client!gn", name = "j", descriptor = "I")
    public static int field9467;

    @OriginalMember(owner = "client!gn", name = "k", descriptor = "I")
    public static int field9468;

    @OriginalMember(owner = "client!gn", name = "m", descriptor = "I")
    public static int field9470;

    @OriginalMember(owner = "client!gn", name = "n", descriptor = "I")
    public static int field9471;

    @OriginalMember(owner = "client!gn", name = "o", descriptor = "I")
    public static int field9472;

    @OriginalMember(owner = "client!gn", name = "p", descriptor = "I")
    public static int field9473;

    @OriginalMember(owner = "client!gn", name = "s", descriptor = "I")
    public static int field9476;

    @OriginalMember(owner = "client!gn", name = "e", descriptor = "Ld;")
    public static class152 field9462;

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(B)V", line = 4)
    public static final void method3913(byte arg0) {
        ++field9471;
        int var1 = 0;
        if (class693.field9368 != null) {
            var1 = class693.field9368.field4428.method3678(-32350);
        }
        if (arg0 == 56) {
            if (var1 == 2) {
                int var2 = ~class288.field4004 >= -801 ? class288.field4004 : 800;
                class467.field6559 = var2;
                class688.field9288 = (-var2 + class288.field4004) / 2;
                int var3 = ~class751.field10508 < -601 ? 600 : class751.field10508;
                class582.field7968 = var3;
                class14.field244 = 0;
            } else if (~var1 != -2) {
                class14.field244 = 0;
                class582.field7968 = class751.field10508;
                class688.field9288 = 0;
                class467.field6559 = class288.field4004;
            } else {
                int var4 = class288.field4004 <= 1024 ? class288.field4004 : 1024;
                class688.field9288 = (-var4 + class288.field4004) / 2;
                int var5 = class751.field10508 <= 768 ? class751.field10508 : 768;
                class467.field6559 = var4;
                class14.field244 = 0;
                class582.field7968 = var5;
            }
        }
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(IIB)V", line = 51)
    public final void method372(int arg0, int arg1, byte arg2) {
        ++field9467;
        float var4 = (float) ((arg0 & 3) + 1) * -5.0E-4F;
        float var5 = (float) (((arg0 & 24) >> 3) + 1) * 5.0E-4F;
        float var6 = ~(arg0 & 64) == -1 ? 4.8828125E-4F : 9.765625E-4F;
        boolean var7 = (arg0 & 128) != 0;
        super.field5255.method190(-15039, 1);
        if (var7) {
            class420.field6071[1] = 0.0F;
            class420.field6071[0] = var6;
            class420.field6071[3] = 0.0F;
            class420.field6071[2] = 0.0F;
        } else {
            class420.field6071[1] = 0.0F;
            class420.field6071[0] = 0.0F;
            class420.field6071[2] = var6;
            class420.field6071[3] = 0.0F;
        }
        OpenGL.glTexGenfv(8192, 9474, class420.field6071, 0);
        class420.field6071[0] = 0.0F;
        class420.field6071[1] = var6;
        class420.field6071[3] = (float) super.field5255.field557 * var4 % 1.0F;
        if (arg2 >= -42) {
            this.method372(-27, -15, (byte) -43);
        }
        class420.field6071[2] = 0.0F;
        OpenGL.glTexGenfv(8193, 9474, class420.field6071, 0);
        if (this.field9474.field8913) {
            class420.field6071[0] = 0.0F;
            class420.field6071[3] = (float) super.field5255.field557 * var5 % 1.0F;
            class420.field6071[2] = 0.0F;
            class420.field6071[1] = 0.0F;
            OpenGL.glTexGenfv(8194, 9473, class420.field6071, 0);
        } else {
            int var8 = (int) ((float) super.field5255.field557 * var5 * 16.0F);
            super.field5255.method256((byte) -81, this.field9474.field8919[var8 % 16]);
        }
        super.field5255.method190(-15039, 0);
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(Lud;BI)V", line = 108)
    public final void method373(class36 arg0, byte arg1, int arg2) {
        ++field9472;
        super.field5255.method256((byte) -118, arg0);
        super.field5255.method237(0, arg2);
        if (arg1 > -89) {
            this.method373((class36) null, (byte) 109, -112);
        }
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(I)V", line = 121)
    public final void method371(int arg0) {
        ++field9464;
        this.field9469.method740('\u0001', 28666);
        super.field5255.method190(-15039, 1);
        super.field5255.method256((byte) -113, (class36) null);
        if (arg0 > -75) {
            field9463 = -7;
        }
        super.field5255.method190(-15039, 0);
    }

    @OriginalMember(owner = "client!gn", name = "<init>", descriptor = "(Lqo;Llc;)V", line = 137)
    public class700(class22 arg0, class648 arg1) {
        super(arg0);
        this.field9474 = arg1;
        this.field9469 = new class80(arg0, 2);
        this.field9469.method741((byte) 104, 0);
        super.field5255.method190(-15039, 1);
        if (this.field9474.field8913) {
            OpenGL.glTexGeni(8194, 9472, 9217);
            OpenGL.glEnable(3170);
        }
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glTexGeni(8193, 9472, 9216);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        super.field5255.method190(-15039, 0);
        this.field9469.method737(-1);
        this.field9469.method741((byte) 117, 1);
        super.field5255.method190(-15039, 1);
        if (this.field9474.field8913) {
            OpenGL.glDisable(3170);
        }
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        super.field5255.method190(-15039, 0);
        this.field9469.method737(-1);
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(BLin;)V", line = 172)
    public static final void method3914(byte arg0, class91 arg1) {
        class751.field10513 = arg1.method870("hitmarks", 0);
        ++field9473;
        class62.field1238 = arg1.method870("hitbar_default", 0);
        class61.field1199 = arg1.method870("timerbar_default", 0);
        class59.field1153 = arg1.method870("headicons_pk", 0);
        class549.field7555 = arg1.method870("headicons_prayer", 0);
        class375.field5312 = arg1.method870("hint_headicons", 0);
        class307.field4267 = arg1.method870("hint_mapmarkers", 0);
        class612.field8371 = arg1.method870("mapflag", 0);
        class507.field7060 = arg1.method870("cross", 0);
        class536.field7416 = arg1.method870("mapdots", 0);
        class652.field8956 = arg1.method870("scrollbar", 0);
        class556.field7678 = arg1.method870("name_icons", 0);
        class186.field2804 = arg1.method870("floorshadows", 0);
        class684.field9254 = arg1.method870("compass", 0);
        if (arg0 > -72) {
            method3916((byte) 106, 125L);
        }
        class453.field6394 = arg1.method870("otherlevel", 0);
        class629.field8659 = arg1.method870("hint_mapedge", 0);
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(ZZ)V", line = 200)
    public final void method369(boolean arg0, boolean arg1) {
        ++field9465;
        this.field9469.method740('\u0000', 28666);
        if (this.field9474.field8913) {
            super.field5255.method190(-15039, 1);
            super.field5255.method256((byte) -117, this.field9474.field8917);
            super.field5255.method190(-15039, 0);
        }
        if (arg1) {
            field9463 = -68;
        }
    }

    @OriginalMember(owner = "client!gn", name = "e", descriptor = "(I)V", line = 218)
    public static void method3915(int arg0) {
        if (arg0 == 0) {
            field9462 = null;
            field9475 = null;
        }
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(ZB)V", line = 233)
    public final void method366(boolean arg0, byte arg1) {
        ++field9476;
        int var3 = -52 % ((arg1 - -60) / 38);
    }

    @OriginalMember(owner = "client!gn", name = "c", descriptor = "(I)Z", line = 243)
    public final boolean method368(int arg0) {
        if (arg0 >= -5) {
            field9463 = 124;
        }
        ++field9468;
        return true;
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(BJ)V", line = 256)
    public static final void method3916(byte arg0, long arg1) {
        ++field9466;
        if (arg1 > 0L) {
            if (~(arg1 % 10L) != -1L) {
                class531.method3063(59, arg1);
            } else {
                class531.method3063(-125, arg1 + -1L);
                class531.method3063(-125, 1L);
            }
            int var3 = 70 % ((arg0 - -52) / 32);
        }
    }
}
