import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ev")
public abstract class class603 implements class542 {

    @OriginalMember(owner = "client!ev", name = "i", descriptor = "I")
    private int field8800 = 0;

    @OriginalMember(owner = "client!ev", name = "j", descriptor = "I")
    private int field8801 = -1;

    @OriginalMember(owner = "client!ev", name = "h", descriptor = "Z")
    private boolean field8799;

    @OriginalMember(owner = "client!ev", name = "n", descriptor = "I")
    private int field8805;

    @OriginalMember(owner = "client!ev", name = "k", descriptor = "Lgf;")
    private class234 field8802;

    @OriginalMember(owner = "client!ev", name = "t", descriptor = "Lig;")
    public static class206 field8811 = new class206(40, 4);

    @OriginalMember(owner = "client!ev", name = "w", descriptor = "F")
    public static float field8814;

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "I")
    public static int field8792;

    @OriginalMember(owner = "client!ev", name = "b", descriptor = "I")
    public static int field8793;

    @OriginalMember(owner = "client!ev", name = "c", descriptor = "I")
    public static int field8794;

    @OriginalMember(owner = "client!ev", name = "d", descriptor = "I")
    public static int field8795;

    @OriginalMember(owner = "client!ev", name = "f", descriptor = "I")
    public static int field8797;

    @OriginalMember(owner = "client!ev", name = "g", descriptor = "I")
    public static int field8798;

    @OriginalMember(owner = "client!ev", name = "l", descriptor = "I")
    public static int field8803;

    @OriginalMember(owner = "client!ev", name = "m", descriptor = "I")
    public static int field8804;

    @OriginalMember(owner = "client!ev", name = "o", descriptor = "I")
    private int field8806;

    @OriginalMember(owner = "client!ev", name = "p", descriptor = "I")
    public static int field8807;

    @OriginalMember(owner = "client!ev", name = "q", descriptor = "I")
    public static int field8808;

    @OriginalMember(owner = "client!ev", name = "r", descriptor = "I")
    public static int field8809;

    @OriginalMember(owner = "client!ev", name = "s", descriptor = "I")
    private int field8810;

    @OriginalMember(owner = "client!ev", name = "u", descriptor = "I")
    public static int field8812;

    @OriginalMember(owner = "client!ev", name = "v", descriptor = "I")
    public static int field8813;

    @OriginalMember(owner = "client!ev", name = "e", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    private NativeHeapBuffer field8796;

    @OriginalMember(owner = "client!ev", name = "y", descriptor = "[Lxa;")
    public static class433[] field8816;

    @OriginalMember(owner = "client!ev", name = "x", descriptor = "[Ljava/lang/String;")
    public static String[] field8815;

    static {
        new class474(null, "die kürzlich gesprochen oder gehandelt haben.", null, null);
    }

    @OriginalMember(owner = "client!ev", name = "b", descriptor = "(I)I", line = 5)
    public int method653(int arg0) {
        if (arg0 != 14173) {
            method3504(-4, -81, (byte) -6);
        }
        field8807++;
        return this.field8806;
    }

    @OriginalMember(owner = "client!ev", name = "finalize", descriptor = "()V", line = 16)
    protected final void finalize() throws Throwable {
        field8804++;
        this.method650(true);
        super.finalize();
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(B)V", line = 29)
    private final void method3498(byte arg0) {
        field8793++;
        if (this.field8801 >= 0) {
            return;
        }
        if (arg0 != -31) {
            this.method653(-110);
        }
        if (this.field8802.field3376) {
            OpenGL.glGenBuffersARB(1, class166.field2041, 0);
            this.field8801 = class166.field2041[0];
            OpenGL.glBindBufferARB(this.field8805, this.field8801);
        } else {
            this.field8801 = 0;
        }
    }

    @OriginalMember(owner = "client!ev", name = "d", descriptor = "(I)V", line = 55)
    public final void method3499(int arg0) {
        if (arg0 < -28) {
            field8809++;
            if (this.field8802.field3376) {
                OpenGL.glBindBufferARB(this.field8805, this.field8801);
            }
        }
    }

    @OriginalMember(owner = "client!ev", name = "e", descriptor = "(I)J", line = 74)
    public final long method3500(int arg0) {
        field8794++;
        if (arg0 != 16383) {
            this.method650(true);
        }
        return this.field8801 == 0 ? this.field8796.getAddress() : 0L;
    }

    @OriginalMember(owner = "client!ev", name = "<init>", descriptor = "(Lgf;IZ)V", line = 371)
    public class603(class234 arg0, int arg1, boolean arg2) {
        this.field8799 = arg2;
        this.field8805 = arg1;
        this.field8802 = arg0;
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(ZI)Ljaclib/memory/Buffer;", line = 89)
    public Buffer method652(boolean arg0, int arg1) {
        field8812++;
        if (arg1 != 31983) {
            this.field8805 = 105;
        }
        if (this.field8800 == 0) {
            this.method3498((byte) -31);
            if (this.field8801 <= 0) {
                this.field8800 = 2;
                return this.field8796;
            }
            OpenGL.glBindBufferARB(this.field8805, this.field8801);
            if (arg0) {
                OpenGL.glBufferDataARBub(this.field8805, this.field8810, null, 0, this.field8799 ? 35040 : 35044);
                if (this.field8806 <= this.field8802.field4105.field8418) {
                    this.field8800 = 1;
                    return this.field8802.field4105;
                }
            }
            MapBuffer var3 = this.field8802.field3366;
            if (!var3.method3150() && var3.method3152(this.field8805, this.field8806, 35001)) {
                this.field8800 = 2;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(I)Z", line = 139)
    public boolean method651(int arg0) {
        field8808++;
        boolean var2 = true;
        if (this.field8800 != 0) {
            if (this.field8801 > 0) {
                OpenGL.glBindBufferARB(this.field8805, this.field8801);
                if (this.field8800 == 1) {
                    OpenGL.glBufferSubDataARBa(this.field8805, 0, this.field8810, this.field8802.field4105.getAddress());
                } else {
                    var2 = this.field8802.field3366.method3151();
                }
            }
            this.field8800 = 0;
        }
        return arg0 == -15045 ? var2 : false;
    }

    @OriginalMember(owner = "client!ev", name = "f", descriptor = "(I)V", line = 171)
    public static void method3501(int arg0) {
        if (arg0 == -1) {
            field8816 = null;
            field8811 = null;
            field8815 = null;
        }
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(BLjaclib/memory/Source;I)Z", line = 183)
    public final boolean method3502(byte arg0, Source arg1, int arg2) {
        field8798++;
        if (this.field8810 >= arg2) {
            if (this.field8801 <= 0) {
                throw new RuntimeException("ARGH!");
            }
            OpenGL.glBindBufferARB(this.field8805, this.field8801);
            OpenGL.glBufferSubDataARBa(this.field8805, 0, this.field8806, arg1.getAddress());
            this.field8802.field4253 += arg2 - this.field8806;
        } else {
            this.method3498((byte) -31);
            if (this.field8801 <= 0) {
                throw new RuntimeException("ARGH!");
            }
            OpenGL.glBindBufferARB(this.field8805, this.field8801);
            OpenGL.glBufferDataARBa(this.field8805, arg2, arg1.getAddress(), this.field8799 ? 35040 : 35044);
            this.field8802.field4253 += arg2 - this.field8806;
            this.field8810 = arg2;
        }
        this.field8806 = arg2;
        return arg0 <= -38;
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(II)V", line = 224)
    public void method654(int arg0, int arg1) {
        field8803++;
        if (arg1 != 9658) {
            this.method653(102);
        }
        if (this.field8810 < arg0) {
            this.method3498((byte) -31);
            if (this.field8801 > 0) {
                OpenGL.glBindBufferARB(this.field8805, this.field8801);
                OpenGL.glBufferDataARBub(this.field8805, arg0, null, 0, this.field8799 ? 35040 : 35044);
                this.field8802.field4253 += arg0 - this.field8810;
            } else {
                this.field8796 = this.field8802.method1974((byte) 56, false, arg0);
            }
            this.field8810 = arg0;
        }
        this.field8806 = arg0;
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(Z)V", line = 257)
    public void method650(boolean arg0) {
        field8795++;
        if (!arg0) {
            this.method652(false, 52);
        }
        if (this.field8801 > 0) {
            this.field8802.method1539(this.field8801, this.field8806, (byte) 24);
            this.field8801 = -1;
        }
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(Lqb;I)I", line = 276)
    public static final int method3503(class191 arg0, int arg1) {
        field8797++;
        if (~arg0.field2505 == arg1) {
            return 0;
        }
        if (arg0.field2469 != -1) {
            class191 var2 = null;
            if (arg0.field2469 < 32768) {
                class411 var3 = (class411) class42.field456.method524((byte) 98, (long) arg0.field2469);
                if (var3 != null) {
                    var2 = var3.field6254;
                }
            } else if (arg0.field2469 >= 32768) {
                var2 = class142.field1749[arg0.field2469 - 32768];
            }
            if (var2 != null) {
                int var4 = arg0.field1764 - var2.field1764;
                int var5 = arg0.field1768 - var2.field1768;
                if (var4 != 0 || var5 != 0) {
                    arg0.method1155((int) (Math.atan2((double) var4, (double) var5) * 2607.5945876176133D) & 0x3FFF, (byte) 79);
                }
            }
        }
        if ((arg0 instanceof class655)) {
            class655 var9 = (class655) arg0;
            if (var9.field9445 != -1 && (var9.field2517 == 0 || var9.field2516 > 0)) {
                var9.method1155(var9.field9445, (byte) 79);
                var9.field9445 = -1;
            }
        } else if (arg0 instanceof class78) {
            class78 var6 = (class78) arg0;
            if (var6.field844 != -1 && (var6.field2517 == 0 || var6.field2516 > 0)) {
                int var7 = var6.field1764 - ((var6.field844 - class287.field3980 - class287.field3980) * 256);
                int var8 = var6.field1768 - (var6.field842 - class250.field3549 - class250.field3549) * 256;
                if (var7 != 0 || var8 != 0) {
                    var6.method1155((int) (Math.atan2((double) var7, (double) var8) * 2607.5945876176133D) & 0x3FFF, (byte) 79);
                }
                var6.field844 = -1;
            }
        }
        return arg0.method1154(-11);
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(IIB)V", line = 350)
    public static final void method3504(int arg0, int arg1, byte arg2) {
        if (arg2 >= -84) {
            field8813 = 112;
        }
        field8792++;
        class467 var3 = class541.method3144(arg0, (byte) -113, 1);
        var3.method2851(true);
        var3.field6926 = arg1;
    }
}
