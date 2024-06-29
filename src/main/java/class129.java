import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public class class129 extends class29 {

    @OriginalMember(owner = "client!da", name = "G", descriptor = "I")
    private int field1918 = 0;

    @OriginalMember(owner = "client!da", name = "A", descriptor = "I")
    private int field1912 = -1;

    @OriginalMember(owner = "client!da", name = "B", descriptor = "I")
    private int field1913;

    @OriginalMember(owner = "client!da", name = "z", descriptor = "Ltl;")
    public static class222 field1911 = new class222(5);

    @OriginalMember(owner = "client!da", name = "C", descriptor = "I")
    public static int field1914;

    @OriginalMember(owner = "client!da", name = "D", descriptor = "I")
    public static int field1915;

    @OriginalMember(owner = "client!da", name = "E", descriptor = "I")
    public static int field1916;

    @OriginalMember(owner = "client!da", name = "F", descriptor = "I")
    public static int field1917;

    @OriginalMember(owner = "client!da", name = "d", descriptor = "(B)V", line = 6)
    public static void method884(byte arg0) {
        if (arg0 <= -127) {
            field1911 = null;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Z)V", line = 16)
    public final void method885(boolean arg0) {
        if (arg0) {
            this.field1918 = 60;
        }
        field1916++;
        int var2 = class182.method1259(108);
        if ((var2 & 0x1) == 0) {
            class186.method1288(this.field1912);
        }
        if ((var2 & 0x2) == 0) {
            class186.method1281(0);
        }
        if ((var2 & 0x4) == 0) {
            class186.method1299(0);
        }
    }

    @OriginalMember(owner = "client!da", name = "finalize", descriptor = "()V", line = 51)
    protected final void finalize() throws Throwable {
        field1917++;
        if (this.field1912 != -1) {
            class275.method1957(this.field1912, this.field1918, this.field1913);
            this.field1912 = -1;
            this.field1918 = 0;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(BI)I", line = 66)
    public static final int method886(byte arg0, int arg1) {
        if (arg0 < 114) {
            field1911 = (class222) null;
        }
        field1915++;
        return arg1 >>> 10;
    }

    @OriginalMember(owner = "client!da", name = "<init>", descriptor = "(I)V", line = 250)
    public class129(int arg0) {
        GL var2 = class186.field2990;
        int[] var3 = new int[1];
        var2.glGenTextures(1, var3, 0);
        this.field1912 = var3[0];
        this.field1913 = class275.field4359;
        class186.method1288(this.field1912);
        int var4 = class25.field368[arg0];
        byte[] var5 = new byte[] { (byte) (var4 >> 16), (byte) (var4 >> 8), (byte) var4, -1 };
        ByteBuffer var6 = ByteBuffer.wrap(var5);
        var2.glTexImage2D(3553, 0, 6408, 1, 1, 0, 6408, 5121, var6);
        var2.glTexParameteri(3553, 10241, 9729);
        var2.glTexParameteri(3553, 10240, 9729);
        class275.field4358 += var6.limit() - this.field1918;
        this.field1918 = var6.limit();
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Z[B)V", line = 88)
    public static final void method887(boolean arg0, byte[] arg1) {
        field1914++;
        if (arg0) {
            method886((byte) -102, 110);
        }
        class192 var2 = new class192(arg1);
        var2.field3129 = arg1.length - 2;
        class56.field740 = var2.method1396(-107);
        class181.field2927 = new boolean[class56.field740];
        class244.field3885 = new int[class56.field740];
        class21.field316 = new int[class56.field740];
        class162.field2647 = new int[class56.field740];
        class163.field2657 = new int[class56.field740];
        class3.field20 = new byte[class56.field740][];
        class269.field4251 = new byte[class56.field740][];
        var2.field3129 = arg1.length - (class56.field740 * 8) - 7;
        class163.field2659 = var2.method1396(-86);
        class113.field1698 = var2.method1396(-17);
        int var3 = (var2.method1399(-1172389784) & 0xFF) + 1;
        for (int var4 = 0; var4 < class56.field740; var4++) {
            class163.field2657[var4] = var2.method1396(-35);
        }
        for (int var5 = 0; var5 < class56.field740; var5++) {
            class162.field2647[var5] = var2.method1396(-44);
        }
        for (int var6 = 0; var6 < class56.field740; var6++) {
            class244.field3885[var6] = var2.method1396(-40);
        }
        for (int var7 = 0; var7 < class56.field740; var7++) {
            class21.field316[var7] = var2.method1396(-88);
        }
        var2.field3129 = arg1.length - (var3 - 1) * 3 - (class56.field740 * 8) - 7;
        class305.field4754 = new int[var3];
        for (int var8 = 1; var8 < var3; var8++) {
            class305.field4754[var8] = var2.method1378(false);
            if (class305.field4754[var8] == 0) {
                class305.field4754[var8] = 1;
            }
        }
        var2.field3129 = 0;
        for (int var9 = 0; var9 < class56.field740; var9++) {
            int var10 = class244.field3885[var9];
            boolean var11 = false;
            int var12 = class21.field316[var9];
            int var13 = var10 * var12;
            byte[] var14 = new byte[var13];
            byte[] var15 = new byte[var13];
            class3.field20[var9] = var15;
            class269.field4251[var9] = var14;
            int var16 = var2.method1399(-1172389784);
            if ((var16 & 0x1) == 0) {
                for (int var22 = 0; var22 < var13; var22++) {
                    var15[var22] = var2.method1377(true);
                }
                if ((var16 & 0x2) != 0) {
                    for (int var23 = 0; var23 < var13; var23++) {
                        byte var24 = var14[var23] = var2.method1377(true);
                        var11 |= var24 != -1;
                    }
                }
            } else {
                int var17 = 0;
                label92: while (true) {
                    if (var10 <= var17) {
                        if ((var16 & 0x2) == 0) {
                            break;
                        }
                        int var19 = 0;
                        while (true) {
                            if (var19 >= var10) {
                                break label92;
                            }
                            for (int var20 = 0; var20 < var12; var20++) {
                                byte var21 = var14[var19 + (var10 * var20)] = var2.method1377(true);
                                var11 |= var21 != -1;
                            }
                            var19++;
                        }
                    }
                    for (int var18 = 0; var18 < var12; var18++) {
                        var15[var10 * var18 + var17] = var2.method1377(true);
                    }
                    var17++;
                }
            }
            class181.field2927[var9] = var11;
        }
    }
}
