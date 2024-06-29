import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public class class618 {

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "Leda;")
    public static class116 field8824 = new class116(46, 5);

    @OriginalMember(owner = "client!ji", name = "e", descriptor = "F")
    public static float field8826;

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "I")
    public static int field8823;

    @OriginalMember(owner = "client!ji", name = "d", descriptor = "I")
    public static int field8825;

    @OriginalMember(owner = "client!ji", name = "f", descriptor = "I")
    public static int field8827;

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "Lf;")
    public static class257 field8822;

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Ljava/lang/String;BLkfa;I)Lru;")
    public static final class232 method3492(String arg0, byte arg1, class382 arg2, int arg3) {
        field8827++;
        int var4 = OpenGL.glGenProgramARB();
        OpenGL.glBindProgramARB(arg3, var4);
        OpenGL.glProgramStringARB(arg3, 34933, arg0);
        OpenGL.glGetIntegerv(34379, class464.field6652, 0);
        if (class464.field6652[0] != -1) {
            OpenGL.glBindProgramARB(arg3, 0);
            return null;
        } else if (arg1 == -68) {
            OpenGL.glBindProgramARB(arg3, 0);
            return new class232(arg2, arg3, var4);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(I)V")
    public static void method3493(int arg0) {
        field8824 = null;
        field8822 = null;
        if (arg0 > -37) {
            method3494(36L, 50);
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(JI)Ljava/lang/String;")
    public static final String method3494(long arg0, int arg1) {
        field8825++;
        if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
            return null;
        } else if ((arg0 % 37L) == 0L) {
            return null;
        } else {
            int var3 = 0;
            if (arg1 != -32105) {
                return null;
            }
            for (long var4 = arg0; var4 != 0L; var4 /= 37L) {
                var3++;
            }
            StringBuffer var6 = new StringBuffer(var3);
            while (arg0 != 0L) {
                long var7 = arg0;
                arg0 /= 37L;
                var6.append(class44.field595[(int) (var7 - (arg0 * 37L))]);
            }
            return var6.reverse().toString();
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(B[[BLn;)V")
    public static final void method3495(byte arg0, byte[][] arg1, class678 arg2) {
        field8823++;
        if (arg0 != 96) {
            field8824 = null;
        }
        for (int var3 = 0; var3 < arg2.field1683; var3++) {
            class655.method3701((byte) 38);
            for (int var4 = 0; var4 < class430.field6136 >> 3; var4++) {
                for (int var5 = 0; var5 < class580.field8504 >> 3; var5++) {
                    int var6 = class184.field2920[var3][var4][var5];
                    if (var6 != -1) {
                        int var7 = (var6 & 0x33A1B07) >> 24;
                        if (!arg2.field1679 || var7 == 0) {
                            int var8 = var6 >> 1 & 0x3;
                            int var9 = (var6 & 0xFFCB5C) >> 14;
                            int var10 = var6 >> 3 & 0x7FF;
                            int var11 = (var9 / 8 << 8) + var10 / 8;
                            for (int var12 = 0; var12 < class221.field3306.length; var12++) {
                                if (class221.field3306[var12] == var11 && arg1[var12] != null) {
                                    arg2.method3837(class45.field609, (var10 & 0x7) * 8, var4 * 8, class637.field9048, var5 * 8, -1, (var9 & 0x7) * 8, arg1[var12], var8, var7, var3);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
