import jaggl.OpenGL;
import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tu")
public abstract class class222 {

    @OriginalMember(owner = "client!tu", name = "d", descriptor = "Lbl;")
    public class442 field3425;

    @OriginalMember(owner = "client!tu", name = "j", descriptor = "I")
    private int field3431;

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "Z")
    private boolean field3422;

    @OriginalMember(owner = "client!tu", name = "n", descriptor = "I")
    private int field3435;

    @OriginalMember(owner = "client!tu", name = "i", descriptor = "I")
    public int field3430;

    @OriginalMember(owner = "client!tu", name = "h", descriptor = "Z")
    public static boolean field3429 = false;

    @OriginalMember(owner = "client!tu", name = "l", descriptor = "[I")
    public static int[] field3433 = new int[25];

    @OriginalMember(owner = "client!tu", name = "f", descriptor = "I")
    public static int field3427 = 0;

    @OriginalMember(owner = "client!tu", name = "b", descriptor = "I")
    public static int field3423;

    @OriginalMember(owner = "client!tu", name = "c", descriptor = "I")
    public static int field3424;

    @OriginalMember(owner = "client!tu", name = "g", descriptor = "I")
    public static int field3428;

    @OriginalMember(owner = "client!tu", name = "m", descriptor = "I")
    public static int field3434;

    @OriginalMember(owner = "client!tu", name = "o", descriptor = "I")
    public static int field3436;

    @OriginalMember(owner = "client!tu", name = "p", descriptor = "I")
    public static int field3437;

    @OriginalMember(owner = "client!tu", name = "q", descriptor = "I")
    public static int field3438;

    @OriginalMember(owner = "client!tu", name = "e", descriptor = "Lll;")
    public static class235 field3426;

    @OriginalMember(owner = "client!tu", name = "k", descriptor = "[I")
    public static int[] field3432;

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(IB)I", line = 5)
    public static final int method1348(int arg0, byte arg1) {
        if (arg1 == -80) {
            field3424++;
            return arg0 & 0xFF;
        } else {
            return 58;
        }
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(Llt;I)V", line = 20)
    public static final void method1349(class458 arg0, int arg1) {
        field3423++;
        if (arg1 <= -6) {
            class355.field5294 = arg0;
        }
    }

    @OriginalMember(owner = "client!tu", name = "finalize", descriptor = "()V", line = 32)
    protected final void finalize() throws Throwable {
        field3437++;
        this.field3425.method2617(this.field3430, this.field3435, 0);
        super.finalize();
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(IB[B)V", line = 44)
    public final void method1350(int arg0, byte arg1, byte[] arg2) {
        this.method1352((byte) 93);
        field3436++;
        if (arg1 != 83) {
            this.field3425 = null;
        }
        if (this.field3435 < arg0) {
            OpenGL.glBufferDataARBub(this.field3431, arg0, arg2, 0, this.field3422 ? 35040 : 35044);
            this.field3425.field6703 += arg0 - this.field3435;
            this.field3435 = arg0;
        } else {
            OpenGL.glBufferSubDataARB(this.field3431, 0, arg0, arg2, 0);
        }
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(Lhf;ILha;I)V", line = 74)
    public static final void method1351(class260 arg0, int arg1, class40 arg2, int arg3) {
        field3434++;
        class271 var4 = new class271();
        var4.field4111 = arg2.method257((byte) 29);
        var4.field4110 = arg2.method255((byte) 96);
        var4.field4112 = new class180[var4.field4111];
        var4.field4107 = new int[var4.field4111];
        var4.field4105 = new int[var4.field4111];
        var4.field4106 = new class180[var4.field4111];
        var4.field4104 = new int[var4.field4111];
        var4.field4108 = new byte[var4.field4111][][];
        for (int var5 = arg3; var5 < var4.field4111; var5++) {
            try {
                int var6 = arg2.method257((byte) 59);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    String var7 = arg2.method239(true);
                    String var8 = arg2.method239(true);
                    int var9 = 0;
                    if (var6 == 1) {
                        var9 = arg2.method255((byte) 96);
                    }
                    var4.field4105[var5] = var6;
                    var4.field4104[var5] = var9;
                    var4.field4112[var5] = arg0.method1570(9, class265.method1622(0, var7), var8);
                } else if (var6 == 3 || var6 == 4) {
                    String var10 = arg2.method239(true);
                    String var11 = arg2.method239(true);
                    int var12 = arg2.method257((byte) 47);
                    String[] var13 = new String[var12];
                    for (int var14 = 0; var14 < var12; var14++) {
                        var13[var14] = arg2.method239(true);
                    }
                    byte[][] var15 = new byte[var12][];
                    if (var6 == 3) {
                        for (int var16 = 0; var16 < var12; var16++) {
                            int var17 = arg2.method255((byte) 96);
                            var15[var16] = new byte[var17];
                            arg2.method273(0, 49152, var15[var16], var17);
                        }
                    }
                    var4.field4105[var5] = var6;
                    Class[] var18 = new Class[var12];
                    for (int var19 = 0; var19 < var12; var19++) {
                        var18[var19] = class265.method1622(class103.method764(arg3, 0), var13[var19]);
                    }
                    var4.field4106[var5] = arg0.method1573(class265.method1622(0, var10), (byte) 60, var18, var11);
                    var4.field4108[var5] = var15;
                }
            } catch (ClassNotFoundException var20) {
                var4.field4107[var5] = -1;
            } catch (SecurityException var21) {
                var4.field4107[var5] = -2;
            } catch (NullPointerException var22) {
                var4.field4107[var5] = -3;
            } catch (Exception var23) {
                var4.field4107[var5] = -4;
            } catch (Throwable var24) {
                var4.field4107[var5] = -5;
            }
        }
        class345.field5121.method4(1, var4);
    }

    @OriginalMember(owner = "client!tu", name = "<init>", descriptor = "(Lbl;I[BIZ)V", line = 190)
    public class222(class442 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        this.field3425 = arg0;
        this.field3431 = arg1;
        this.field3422 = arg4;
        this.field3435 = arg3;
        OpenGL.glGenBuffersARB(1, class418.field6027, 0);
        this.field3430 = class418.field6027[0];
        this.method1352((byte) 93);
        OpenGL.glBufferDataARBub(arg1, this.field3435, arg2, 0, this.field3422 ? 35040 : 35044);
        this.field3425.field6703 += this.field3435;
    }

    @OriginalMember(owner = "client!tu", name = "<init>", descriptor = "(Lbl;ILjaggl/memory/NativeBuffer;IZ)V", line = 209)
    public class222(class442 arg0, int arg1, NativeBuffer arg2, int arg3, boolean arg4) {
        this.field3435 = arg3;
        this.field3425 = arg0;
        this.field3431 = arg1;
        this.field3422 = arg4;
        OpenGL.glGenBuffersARB(1, class418.field6027, 0);
        this.field3430 = class418.field6027[0];
        this.method1352((byte) 93);
        OpenGL.glBufferDataARBa(arg1, this.field3435, arg2.method2479(), this.field3422 ? 35040 : 35044);
        this.field3425.field6703 += this.field3435;
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(III)Z", line = 231)
    public static final boolean method1353(int arg0, int arg1, int arg2) {
        int var3 = -106 / ((arg2 - 49) / 36);
        field3428++;
        return (arg0 & 0x8000) != 0;
    }

    @OriginalMember(owner = "client!tu", name = "c", descriptor = "(I)V", line = 246)
    public static void method1354(int arg0) {
        int var1 = -92 % ((-arg0 - 38) / 37);
        field3426 = null;
        field3432 = null;
        field3433 = null;
    }

    @OriginalMember(owner = "client!tu", name = "b", descriptor = "(B)V")
    public abstract void method1352(byte arg0);
}
