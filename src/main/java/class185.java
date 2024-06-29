import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fq")
public class class185 extends class27 {

    @OriginalMember(owner = "client!fq", name = "f", descriptor = "Z")
    private boolean field2676 = false;

    @OriginalMember(owner = "client!fq", name = "k", descriptor = "Lqm;")
    private class129 field2681;

    @OriginalMember(owner = "client!fq", name = "i", descriptor = "Ljava/lang/String;")
    public static String field2679 = null;

    @OriginalMember(owner = "client!fq", name = "u", descriptor = "[I")
    public static int[] field2691 = new int[2];

    @OriginalMember(owner = "client!fq", name = "g", descriptor = "I")
    public static int field2677;

    @OriginalMember(owner = "client!fq", name = "h", descriptor = "I")
    public static int field2678;

    @OriginalMember(owner = "client!fq", name = "l", descriptor = "I")
    public static int field2682;

    @OriginalMember(owner = "client!fq", name = "m", descriptor = "I")
    public static int field2683;

    @OriginalMember(owner = "client!fq", name = "n", descriptor = "I")
    public static int field2684;

    @OriginalMember(owner = "client!fq", name = "o", descriptor = "I")
    public static int field2685;

    @OriginalMember(owner = "client!fq", name = "p", descriptor = "I")
    public static int field2686;

    @OriginalMember(owner = "client!fq", name = "q", descriptor = "I")
    public static int field2687;

    @OriginalMember(owner = "client!fq", name = "r", descriptor = "I")
    public static int field2688;

    @OriginalMember(owner = "client!fq", name = "s", descriptor = "I")
    public static int field2689;

    @OriginalMember(owner = "client!fq", name = "t", descriptor = "I")
    public static int field2690;

    @OriginalMember(owner = "client!fq", name = "j", descriptor = "Lhf;")
    public static class361 field2680;

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(Z)Z", line = 3)
    public final boolean method260(boolean arg0) {
        if (arg0) {
            return false;
        } else {
            ++field2689;
            return true;
        }
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(IILvf;)V", line = 14)
    public final void method257(int arg0, int arg1, class136 arg2) {
        ++field2688;
        super.field337.method3206(arg2, (byte) 26);
        super.field337.method3205(5123, arg0);
        if (arg1 != -10479) {
            field2679 = null;
        }
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(BZ)V", line = 29)
    public final void method258(byte arg0, boolean arg1) {
        ++field2685;
        if (arg0 > -80) {
            this.method260(true);
        }
        class696 var3 = super.field337.method3168((byte) -125);
        if (this.field2681 != null && var3 != null && arg1) {
            this.field2681.method918(1, '\u0000');
            super.field337.method3220(0, 1);
            super.field337.method3206(var3, (byte) 26);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadMatrixf(super.field337.field7869.method3139(-24302), 0);
            OpenGL.glMatrixMode(5888);
            super.field337.method3220(0, 0);
            this.field2676 = true;
        } else {
            super.field337.method3198(0, 34168, true, 770);
        }
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(IZI)Z", line = 56)
    public static final boolean method1272(int arg0, boolean arg1, int arg2) {
        ++field2690;
        if (!arg1) {
            field2691 = null;
        }
        return (arg0 & 540800) != 0;
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "()V", line = 68)
    public static final void method1273() {
        class243.method1506(1, class107.field1493);
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 71)
    public static final void method1274(String arg0, int arg1) {
        ++field2687;
        if (arg0 != null) {
            if (arg0.startsWith("*")) {
                arg0 = arg0.substring(1);
            }
            String var2 = class430.method2473(15570, arg0);
            if (var2 != null) {
                for (int var3 = 0; class165.field2390 > var3; ++var3) {
                    String var4 = class356.field4722[var3];
                    if (var4.startsWith("*")) {
                        var4 = var4.substring(1);
                    }
                    String var5 = class430.method2473(15570, var4);
                    if (var5 != null && var5.equals(var2)) {
                        --class165.field2390;
                        for (int var6 = var3; class165.field2390 > var6; ++var6) {
                            class356.field4722[var6] = class356.field4722[var6 - -1];
                            class59.field663[var6] = class59.field663[var6 + 1];
                            class238.field3258[var6] = class238.field3258[var6 + 1];
                            class281.field3845[var6] = class281.field3845[var6 + 1];
                            class355.field4707[var6] = class355.field4707[var6 + 1];
                        }
                        ++class103.field1438;
                        class433.field6034 = class436.field6066;
                        class352 var7 = class290.method1786(arg1 ^ -10896, class199.field2836, class705.field9963);
                        var7.field4686.method2817(class705.method3947((byte) -47, arg0), true);
                        var7.field4686.method2820(-37, arg0);
                        class602.method3388(var7, (byte) 28);
                        break;
                    }
                }
                if (arg1 != -10990) {
                    method1272(-53, false, 58);
                }
            }
        }
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(III)V", line = 133)
    public final void method261(int arg0, int arg1, int arg2) {
        if (arg2 == 4) {
            ++field2678;
        }
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(ZI)V", line = 144)
    public final void method263(boolean arg0, int arg1) {
        ++field2684;
        if (arg1 != 8) {
            this.field2681 = null;
        }
        super.field337.method3210(8448, -101, 7681);
    }

    @OriginalMember(owner = "client!fq", name = "<init>", descriptor = "(Llj;)V", line = 155)
    public class185(class565 arg0) {
        super(arg0);
        if (arg0.field7914) {
            this.field2681 = new class129(arg0, 2);
            this.field2681.method919(0, 4864);
            super.field337.method3220(0, 1);
            super.field337.method3210(34165, 42, 7681);
            super.field337.method3164(34168, 2, (byte) 109, 770);
            super.field337.method3198(0, 34167, true, 770);
            OpenGL.glTexGeni(8192, 9472, 34066);
            OpenGL.glTexGeni(8193, 9472, 34066);
            OpenGL.glTexGeni(8194, 9472, 34066);
            OpenGL.glEnable(3168);
            OpenGL.glEnable(3169);
            OpenGL.glEnable(3170);
            super.field337.method3220(0, 0);
            this.field2681.method915((byte) 95);
            this.field2681.method919(1, 4864);
            super.field337.method3220(0, 1);
            super.field337.method3210(8448, -113, 8448);
            super.field337.method3164(34166, 2, (byte) 112, 770);
            super.field337.method3198(0, 5890, true, 770);
            OpenGL.glDisable(3168);
            OpenGL.glDisable(3169);
            OpenGL.glDisable(3170);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            super.field337.method3220(0, 0);
            this.field2681.method915((byte) 95);
        }
    }

    @OriginalMember(owner = "client!fq", name = "b", descriptor = "(B)V", line = 201)
    public static void method1275(byte arg0) {
        field2680 = null;
        field2679 = null;
        field2691 = null;
        if (arg0 != 10) {
            field2683 = -54;
        }
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(I)V", line = 220)
    public static final void method1276(int arg0) {
        ++field2682;
        if (!class339.field4548) {
            if (arg0 >= -119) {
                field2683 = -49;
            }
            class498.field6773 = true;
            class339.field4548 = true;
            if (class366.field4875.field9367) {
                class228.field3168 = (float) ((int) class228.field3168 + 47 & -16);
            } else {
                class299.field4077 += (12.0F - class299.field4077) / 2.0F;
            }
        }
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(B)V", line = 247)
    public final void method256(byte arg0) {
        if (this.field2676) {
            this.field2681.method918(1, '\u0001');
            super.field337.method3220(0, 1);
            super.field337.method3206((class136) null, (byte) 26);
            super.field337.method3220(0, 0);
        } else {
            super.field337.method3198(0, 5890, true, 770);
        }
        ++field2686;
        super.field337.method3210(8448, 95, 8448);
        if (arg0 != 50) {
            this.method258((byte) -55, true);
        }
        this.field2676 = false;
    }

    @OriginalMember(owner = "client!fq", name = "c", descriptor = "(B)[Lbaa;", line = 270)
    public static final class483[] method1277(byte arg0) {
        if (arg0 > -48) {
            return null;
        } else {
            ++field2677;
            if (class339.field4546 == null) {
                class483[] var1 = class78.method614(class543.field7374, (byte) 43);
                class483[] var2 = new class483[var1.length];
                int var3 = 0;
                int var4 = class366.field4875.method534(1, class503.field6917);
                label73: for (int var5 = 0; ~var5 > ~var1.length; ++var5) {
                    class483 var9 = var1[var5];
                    if ((~var9.field6639 >= -1 || var9.field6639 >= 24) && ~var9.field6634 <= -801 && ~var9.field6642 <= -601 && (~var4 != -3 || var9.field6634 <= 800 && ~var9.field6642 >= -601) && (~var4 != -2 || var9.field6634 <= 1024 && var9.field6642 <= 768)) {
                        for (int var10 = 0; var10 < var3; ++var10) {
                            class483 var11 = var2[var10];
                            if (var9.field6634 == var11.field6634 && var9.field6642 == var11.field6642) {
                                if (~var11.field6639 > ~var9.field6639) {
                                    var2[var10] = var9;
                                }
                                continue label73;
                            }
                        }
                        var2[var3] = var9;
                        ++var3;
                    }
                }
                class339.field4546 = new class483[var3];
                class359.method2052(var2, 0, class339.field4546, 0, var3);
                int[] var6 = new int[class339.field4546.length];
                for (int var7 = 0; var7 < class339.field4546.length; ++var7) {
                    class483 var8 = class339.field4546[var7];
                    var6[var7] = var8.field6642 * var8.field6634;
                }
                class268.method1632(126, class339.field4546, var6);
            }
            return class339.field4546;
        }
    }
}
