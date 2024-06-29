import jaclib.memory.Buffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pp")
public abstract class class51 {

    @OriginalMember(owner = "client!pp", name = "e", descriptor = "I")
    private int field671;

    @OriginalMember(owner = "client!pp", name = "i", descriptor = "Z")
    private boolean field675;

    @OriginalMember(owner = "client!pp", name = "k", descriptor = "I")
    private int field677;

    @OriginalMember(owner = "client!pp", name = "d", descriptor = "Lkfa;")
    public class382 field670;

    @OriginalMember(owner = "client!pp", name = "f", descriptor = "I")
    public int field672;

    @OriginalMember(owner = "client!pp", name = "c", descriptor = "Lct;")
    public static class479 field669 = new class479();

    @OriginalMember(owner = "client!pp", name = "j", descriptor = "I")
    public static int field676 = -2;

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "I")
    public static int field667;

    @OriginalMember(owner = "client!pp", name = "b", descriptor = "I")
    public static int field668;

    @OriginalMember(owner = "client!pp", name = "g", descriptor = "I")
    public static int field673;

    @OriginalMember(owner = "client!pp", name = "h", descriptor = "I")
    public static int field674;

    @OriginalMember(owner = "client!pp", name = "l", descriptor = "I")
    public static int field678;

    @OriginalMember(owner = "client!pp", name = "b", descriptor = "(Z)V", line = 5)
    public static void method407(boolean arg0) {
        field669 = null;
        if (!arg0) {
            field678 = 115;
        }
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "([BII)V", line = 18)
    public final void method408(byte[] arg0, int arg1, int arg2) {
        if (arg2 < 100) {
            method409((byte) -81);
        }
        field668++;
        this.method406(34963);
        if (arg1 > this.field671) {
            OpenGL.glBufferDataARBub(this.field677, arg1, arg0, 0, this.field675 ? 35040 : 35044);
            this.field670.field5473 += arg1 - this.field671;
            this.field671 = arg1;
        } else {
            OpenGL.glBufferSubDataARBub(this.field677, 0, arg1, arg0, 0);
        }
    }

    @OriginalMember(owner = "client!pp", name = "b", descriptor = "(B)V", line = 44)
    public static final void method409(byte arg0) {
        field673++;
        if (class525.field7713.method3473(class76.field1182, -19799) != 2) {
            return;
        }
        byte var1 = (byte) (client.field1377 - 4 & 0xFF);
        if (arg0 >= -100) {
            method410((byte) -105, -0.7928305848479115D);
        }
        int var2 = client.field1377 % class430.field6136;
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var18 = 0; var18 < class580.field8504; var18++) {
                class468.field6756[var3][var2][var18] = var1;
            }
        }
        if (class416.field5926 == 3) {
            return;
        }
        for (int var4 = 0; var4 < 2; var4++) {
            class224.field3362[var4] = -1000000;
            class213.field3240[var4] = 1000000;
            class80.field1208[var4] = 0;
            class301.field4225[var4] = 1000000;
            class677.field9636[var4] = 0;
        }
        int var5 = class103.field1708.field3155;
        int var6 = class103.field1708.field3154;
        if (class40.field544 != 1 && class294.field4104 == -1) {
            int var7 = class603.method3433(class322.field4478, class416.field5926, class551.field8078, -109);
            if (var7 - class277.field3933 < 3200 && (class548.field8052[class416.field5926][class551.field8078 >> 9][class322.field4478 >> 9] & 0x4) != 0) {
                class563.method3291(true, class551.field8078 >> 9, class541.field7946, 1, class322.field4478 >> 9, false);
                return;
            }
            return;
        }
        if (class40.field544 != 1) {
            var6 = class76.field1181;
            var5 = class294.field4104;
        }
        if ((class548.field8052[class416.field5926][var5 >> 9][var6 >> 9] & 0x4) != 0) {
            class563.method3291(true, var5 >> 9, class541.field7946, 0, var6 >> 9, false);
        }
        if (class666.field9366 >= 2560) {
            return;
        }
        int var8 = class551.field8078 >> 9;
        int var9 = class322.field4478 >> 9;
        int var10 = var5 >> 9;
        int var11 = var6 >> 9;
        int var12;
        if (var10 <= var8) {
            var12 = var8 - var10;
        } else {
            var12 = var10 - var8;
        }
        int var13;
        if (var11 > var9) {
            var13 = var11 - var9;
        } else {
            var13 = var9 - var11;
        }
        if ((var12 != 0 || var13 != 0) && (-class430.field6136) < var12 && var12 < class430.field6136 && -class580.field8504 < var13 && class580.field8504 > var13) {
            if (var13 < var12) {
                int var14 = var13 * 65536 / var12;
                int var15 = 32768;
                while (var8 != var10) {
                    if (var10 > var8) {
                        var8++;
                    } else if (var10 < var8) {
                        var8--;
                    }
                    if ((class548.field8052[class416.field5926][var8][var9] & 0x4) != 0) {
                        class563.method3291(true, var8, class541.field7946, 1, var9, false);
                        return;
                    }
                    var15 += var14;
                    if (var15 >= 65536) {
                        if (var11 > var9) {
                            var9++;
                        } else if (var11 < var9) {
                            var9--;
                        }
                        var15 -= 65536;
                        if ((class548.field8052[class416.field5926][var8][var9] & 0x4) != 0) {
                            class563.method3291(true, var8, class541.field7946, 1, var9, false);
                            return;
                        }
                    }
                }
                return;
            }
            int var16 = var12 * 65536 / var13;
            int var17 = 32768;
            while (var9 != var11) {
                if (var9 < var11) {
                    var9++;
                } else if (var9 > var11) {
                    var9--;
                }
                if ((class548.field8052[class416.field5926][var8][var9] & 0x4) != 0) {
                    class563.method3291(true, var8, class541.field7946, 1, var9, false);
                    return;
                }
                var17 += var16;
                if (var17 >= 65536) {
                    if (var10 > var8) {
                        var8++;
                    } else if (var8 > var10) {
                        var8--;
                    }
                    var17 -= 65536;
                    if ((class548.field8052[class416.field5926][var8][var9] & 0x4) != 0) {
                        class563.method3291(true, var8, class541.field7946, 1, var9, false);
                        return;
                    }
                }
            }
            return;
        }
        class18.method200("RC: " + var8 + "," + var9 + " " + var10 + "," + var11 + " " + class143.field2474 + "," + class63.field917, null, 10296);
        return;
    }

    @OriginalMember(owner = "client!pp", name = "finalize", descriptor = "()V", line = 246)
    protected final void finalize() throws Throwable {
        this.field670.method2274(0, this.field672, this.field671);
        field674++;
        super.finalize();
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(BD)V", line = 264)
    public static final void method410(byte arg0, double arg1) {
        if (class306.field4263 != arg1) {
            for (int var3 = 0; var3 < 256; var3++) {
                int var4 = (int) (Math.pow((double) var3 / 255.0D, arg1) * 255.0D);
                class535.field7871[var3] = var4 > 255 ? 255 : var4;
            }
            class306.field4263 = arg1;
        }
        if (arg0 != -21) {
            field678 = 47;
        }
        field667++;
    }

    @OriginalMember(owner = "client!pp", name = "<init>", descriptor = "(Lkfa;I[BIZ)V", line = 293)
    public class51(class382 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        this.field671 = arg3;
        this.field675 = arg4;
        this.field677 = arg1;
        this.field670 = arg0;
        OpenGL.glGenBuffersARB(1, class449.field6481, 0);
        this.field672 = class449.field6481[0];
        this.method406(34963);
        OpenGL.glBufferDataARBub(arg1, this.field671, arg2, 0, this.field675 ? 35040 : 35044);
        this.field670.field5473 += this.field671;
    }

    @OriginalMember(owner = "client!pp", name = "<init>", descriptor = "(Lkfa;ILjaclib/memory/Buffer;IZ)V", line = 312)
    public class51(class382 arg0, int arg1, Buffer arg2, int arg3, boolean arg4) {
        this.field677 = arg1;
        this.field675 = arg4;
        this.field671 = arg3;
        this.field670 = arg0;
        OpenGL.glGenBuffersARB(1, class449.field6481, 0);
        this.field672 = class449.field6481[0];
        this.method406(34963);
        OpenGL.glBufferDataARBa(arg1, this.field671, arg2.getAddress(), this.field675 ? 35040 : 35044);
        this.field670.field5473 += this.field671;
    }

    @OriginalMember(owner = "client!pp", name = "c", descriptor = "(I)V")
    public abstract void method406(int arg0);
}
