import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class626 implements class107 {

    @OriginalMember(owner = "client!qb", name = "l", descriptor = "Lcb;")
    private class78 field8835 = new class78(128);

    @OriginalMember(owner = "client!qb", name = "j", descriptor = "[I")
    public int[] field8833 = new int[class173.field2515.field7601];

    @OriginalMember(owner = "client!qb", name = "h", descriptor = "[I")
    private int[] field8831 = new int[class173.field2515.field7601];

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "I")
    public static int field8824 = 1405;

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "I")
    public static int field8827 = -1;

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "I")
    public static int field8825;

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "I")
    public static int field8826;

    @OriginalMember(owner = "client!qb", name = "e", descriptor = "I")
    public static int field8828;

    @OriginalMember(owner = "client!qb", name = "f", descriptor = "I")
    public static int field8829;

    @OriginalMember(owner = "client!qb", name = "i", descriptor = "I")
    public static int field8832;

    @OriginalMember(owner = "client!qb", name = "k", descriptor = "I")
    public static int field8834;

    @OriginalMember(owner = "client!qb", name = "m", descriptor = "I")
    public static int field8836;

    @OriginalMember(owner = "client!qb", name = "n", descriptor = "I")
    public static int field8837;

    @OriginalMember(owner = "client!qb", name = "o", descriptor = "I")
    public static int field8838;

    @OriginalMember(owner = "client!qb", name = "g", descriptor = "Lha;")
    public static class116 field8830;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Z)V")
    public final void method3550(boolean arg0) {
        for (int var2 = 0; var2 < class173.field2515.field7601; var2++) {
            class403 var3 = class173.field2515.method3060(-72, var2);
            if (var3 != null && var3.field6016 == 0) {
                this.field8831[var2] = 0;
                this.field8833[var2] = 0;
            }
        }
        if (arg0) {
            this.field8831 = null;
        }
        field8838++;
        this.field8835 = new class78(128);
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IB)I")
    public final int method909(int arg0, byte arg1) {
        field8829++;
        if (arg1 != 67) {
            field8824 = -97;
        }
        return this.field8833[arg0];
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "([Lud;ILjj;)Lvv;")
    public static final class640 method3551(class119[] arg0, int arg1, class66 arg2) {
        field8837++;
        for (int var3 = 0; var3 < arg0.length; var3++) {
            if (arg0[var3] == null || arg0[var3].field1912 <= 0L) {
                return null;
            }
        }
        long var4 = OpenGL.glCreateProgramObjectARB();
        for (int var6 = 0; var6 < arg0.length; var6++) {
            OpenGL.glAttachObjectARB(var4, arg0[var6].field1912);
        }
        OpenGL.glLinkProgramARB(var4);
        OpenGL.glGetObjectParameterivARB(var4, 35714, class327.field4715, 0);
        if (arg1 < 111) {
            field8830 = null;
        }
        if (class327.field4715[0] == 0) {
            if (class327.field4715[0] == 0) {
                System.out.println("Shader linking failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class327.field4715, 1);
            if (class327.field4715[1] > 1) {
                byte[] var7 = new byte[class327.field4715[1]];
                OpenGL.glGetInfoLogARB(var4, class327.field4715[1], class327.field4715, 0, var7, 0);
                System.out.println(new String(var7));
            }
            if (class327.field4715[0] == 0) {
                for (int var8 = 0; var8 < arg0.length; var8++) {
                    OpenGL.glDetachObjectARB(var4, arg0[var8].field1912);
                }
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class640(arg2, var4, arg0);
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(III)V")
    public final void method3552(int arg0, int arg1, int arg2) {
        field8836++;
        class148 var4 = class17.field257.method2701((byte) 85, arg0);
        int var5 = var4.field2257;
        int var6 = var4.field2254;
        int var7 = var4.field2253;
        int var8 = class222.field3348[var7 - var6];
        if (arg1 < ~arg2 || arg2 > var8) {
            arg2 = 0;
        }
        int var9 = var8 << var6;
        this.method3557(var5, (byte) -41, ~var9 & this.field8833[var5] | arg2 << var6 & var9);
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(ZI)I")
    public final int method3553(boolean arg0, int arg1) {
        field8826++;
        long var3 = class508.method2860(false);
        for (class52 var5 = arg0 ? (class52) this.field8835.method734(0) : (class52) this.field8835.method736(arg1); var5 != null; var5 = (class52) this.field8835.method736(-1)) {
            if (var3 > (var5.field764 & 0x3FFFFFFFFFFFFFFFL)) {
                if ((var5.field764 & 0x4000000000000000L) != 0L) {
                    int var6 = (int) var5.field1798;
                    this.field8833[var6] = this.field8831[var6];
                    var5.method911(-52);
                    return var6;
                }
                var5.method911(-52);
            }
        }
        if (arg1 == -1) {
            return -1;
        } else {
            return -39;
        }
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(III)V")
    public final void method3554(int arg0, int arg1, int arg2) {
        field8832++;
        class148 var4 = class17.field257.method2701((byte) 85, arg2);
        int var5 = var4.field2257;
        int var6 = var4.field2254;
        int var7 = var4.field2253;
        int var8 = class222.field3348[var7 - var6];
        if (arg1 < arg0 || arg1 > var8) {
            arg1 = 0;
        }
        int var9 = var8 << var6;
        this.method3555(~var9 & this.field8831[var5] | var9 & arg1 << var6, var5, 122);
    }

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "(III)V")
    public final void method3555(int arg0, int arg1, int arg2) {
        field8828++;
        this.field8831[arg1] = arg0;
        if (arg2 <= 87) {
            this.field8833 = null;
        }
        class52 var4 = (class52) this.field8835.method740(0, (long) arg1);
        if (var4 == null) {
            class52 var5 = new class52(4611686018427387905L);
            this.field8835.method737((long) arg1, (byte) 92, var5);
        } else if (var4.field764 != 4611686018427387905L) {
            var4.field764 = class508.method2860(false) + 500L | 0x4000000000000000L;
            return;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)V")
    public static void method3556(int arg0) {
        field8830 = null;
        if (arg0 != -8520) {
            method3551(null, -47, null);
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IBI)V")
    public final void method3557(int arg0, byte arg1, int arg2) {
        if (arg1 >= -29) {
            this.method910(-104, 102);
        }
        this.field8833[arg0] = arg2;
        field8825++;
        class52 var4 = (class52) this.field8835.method740(0, (long) arg0);
        if (var4 == null) {
            class52 var5 = new class52(class508.method2860(false) + 500L);
            this.field8835.method737((long) arg0, (byte) 92, var5);
        } else {
            var4.field764 = class508.method2860(false) + 500L;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(II)I")
    public final int method910(int arg0, int arg1) {
        int var3 = -123 / ((-arg0 - 65) / 34);
        field8834++;
        class148 var4 = class17.field257.method2701((byte) 85, arg1);
        int var5 = var4.field2257;
        int var6 = var4.field2254;
        int var7 = var4.field2253;
        int var8 = class222.field3348[var7 - var6];
        return this.field8833[var5] >> var6 & var8;
    }
}
