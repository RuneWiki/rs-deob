import jaggl.OpenGL;
import java.io.FileOutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!po")
public class class555 extends class715 {

    @OriginalMember(owner = "client!po", name = "w", descriptor = "Lwv;")
    private class34 field7772;

    @OriginalMember(owner = "client!po", name = "t", descriptor = "Leea;")
    private class132 field7769;

    @OriginalMember(owner = "client!po", name = "x", descriptor = "Ltea;")
    private class237 field7773;

    @OriginalMember(owner = "client!po", name = "z", descriptor = "I")
    public static int field7775 = 0;

    @OriginalMember(owner = "client!po", name = "y", descriptor = "Lnga;")
    public static class510 field7774 = new class510(8);

    @OriginalMember(owner = "client!po", name = "m", descriptor = "I")
    public static int field7762;

    @OriginalMember(owner = "client!po", name = "n", descriptor = "I")
    public static int field7763;

    @OriginalMember(owner = "client!po", name = "o", descriptor = "I")
    public static int field7764;

    @OriginalMember(owner = "client!po", name = "p", descriptor = "I")
    public static int field7765;

    @OriginalMember(owner = "client!po", name = "q", descriptor = "I")
    public static int field7766;

    @OriginalMember(owner = "client!po", name = "s", descriptor = "I")
    public static int field7768;

    @OriginalMember(owner = "client!po", name = "u", descriptor = "I")
    public static int field7770;

    @OriginalMember(owner = "client!po", name = "v", descriptor = "I")
    public static int field7771;

    @OriginalMember(owner = "client!po", name = "A", descriptor = "Lma;")
    public static class12 field7776;

    @OriginalMember(owner = "client!po", name = "r", descriptor = "Ljava/io/FileOutputStream;")
    public static FileOutputStream field7767;

    @OriginalMember(owner = "client!po", name = "B", descriptor = "[Lwj;")
    public static class392[] field7777;

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(ILdu;I)V")
    public final void method693(int arg0, class355 arg1, int arg2) {
        ++field7768;
        int var4 = 68 / ((31 - arg0) / 50);
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(II)I")
    public static int method3246(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(B)Z")
    public final boolean method690(byte arg0) {
        if (arg0 != -3) {
            method3247((byte) -104);
        }
        ++field7762;
        return this.field7773 != null;
    }

    @OriginalMember(owner = "client!po", name = "c", descriptor = "(B)V")
    public static void method3247(byte arg0) {
        if (arg0 == -13) {
            field7774 = null;
            field7776 = null;
            field7777 = null;
            field7767 = null;
        }
    }

    @OriginalMember(owner = "client!po", name = "<init>", descriptor = "(Leea;Leq;Lwv;)V")
    public class555(class132 arg0, class209 arg1, class34 arg2) {
        super(arg0);
        this.field7772 = arg2;
        this.field7769 = arg0;
        if (arg1 != null && this.field7772.method219(-14072) && this.field7769.field2097) {
            this.field7773 = class569.method3325(arg1.method1475("transparent_water", (byte) 116, "gl"), 34336, (byte) 56, this.field7769);
        } else {
            this.field7773 = null;
        }
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(IIILwr;Lwr;)V")
    public static final void method3248(int arg0, int arg1, int arg2, class455 arg3, class455 arg4) {
        class416 var5 = class442.method2653(arg0, arg1, arg2);
        if (var5 != null) {
            var5.field5838 = arg3;
            var5.field5840 = arg4;
            int var6 = class4.field56 == class138.field2153 ? 1 : 0;
            if (arg3.method395((byte) 84)) {
                if (arg3.method399((byte) 38)) {
                    class319.field4524[var6][class444.field6176[var6]++] = arg3;
                } else {
                    class307.field4351[var6][class189.field2729[var6]++] = arg3;
                    class70.field1267 = true;
                }
            } else {
                class598.field8718[var6][class579.field8176[var6]++] = arg3;
            }
            if (arg4 != null) {
                if (arg4.method395((byte) 84)) {
                    if (arg4.method399((byte) 38)) {
                        class319.field4524[var6][class444.field6176[var6]++] = arg4;
                        return;
                    }
                    class307.field4351[var6][class189.field2729[var6]++] = arg4;
                    class70.field1267 = true;
                    return;
                }
                class598.field8718[var6][class579.field8176[var6]++] = arg4;
            }
        }
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(BZ)V")
    public final void method686(byte arg0, boolean arg1) {
        if (arg0 <= -105) {
            super.field9979.method2769(class316.field4492, class140.field2165, 18721);
            ++field7763;
        }
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(III)V")
    public final void method687(int arg0, int arg1, int arg2) {
        if (arg1 == 1782) {
            ++field7771;
            if (!this.field7772.field452) {
                int var4 = super.field9979.field6479 % 4000 * 16 / 4000;
                super.field9979.method2732(arg1 ^ -1675, this.field7772.field443[var4]);
                OpenGL.glProgramLocalParameter4fARB(34336, 0, 0.0F, 0.0F, 0.0F, 1.0F);
            } else {
                float var5 = (float) (super.field9979.field6479 % 4000) / 4000.0F;
                super.field9979.method2732(-78, this.field7772.field440);
                OpenGL.glProgramLocalParameter4fARB(34336, 0, var5, 0.0F, 0.0F, 1.0F);
            }
        }
    }

    @OriginalMember(owner = "client!po", name = "c", descriptor = "(I)V")
    public final void method689(int arg0) {
        ++field7770;
        super.field9979.method2767(0, 25103, class68.field1225);
        OpenGL.glBindProgramARB(34336, 0);
        OpenGL.glDisable(34820);
        int var2 = 101 / ((arg0 - -71) / 42);
        OpenGL.glDisable(34336);
    }

    @OriginalMember(owner = "client!po", name = "b", descriptor = "(III)Z")
    public static final boolean method3249(int arg0, int arg1, int arg2) {
        ++field7764;
        if (arg2 != 34336) {
            field7777 = null;
        }
        return (class377.method2368(arg0, true, arg1) | class453.method2768(arg0, false, arg1) | class368.method2297(arg1, -113, arg0)) & class278.method1823(arg0, arg1, arg2 ^ 36384);
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(ZI)V")
    public final void method691(boolean arg0, int arg1) {
        OpenGL.glBindProgramARB(34336, this.field7773.field3351);
        if (arg1 != 4) {
            method3250(true, true);
        }
        ++field7765;
        OpenGL.glEnable(34336);
        super.field9979.method2767(0, 25103, class44.field665);
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(ZZ)V")
    public static final void method3250(boolean arg0, boolean arg1) {
        ++field7766;
        class483.field6841.method160(class154.field2309.method612());
        int[] var2 = class154.field2309.method547();
        class169.field2483 = var2[0];
        class230.field3279 = var2[1];
        if (!arg1) {
            field7776 = null;
        }
        class522.field7399 = var2[2];
        class393.field5508 = var2[3];
        if (!arg0) {
            class154.field2309.method545(class62.field1135, class677.field9552, class181.field2587, class58.field1092);
            class146.method1138(class700.field9832, 123);
        } else {
            class154.field2309.method545(class687.field9692, class678.field9562, class426.field5955, class117.field1846);
            class146.method1138(class21.field270, 122);
        }
    }
}
