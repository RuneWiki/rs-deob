import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qn")
public class class439 extends class169 {

    @OriginalMember(owner = "client!qn", name = "z", descriptor = "I")
    private int field6543;

    @OriginalMember(owner = "client!qn", name = "C", descriptor = "Lpu;")
    public static class179 field6546 = new class179("Created gameworld", "Spielwelt erstellt.", "Monde de jeu créé", "Universo de jogo criado");

    @OriginalMember(owner = "client!qn", name = "x", descriptor = "I")
    public static int field6541;

    @OriginalMember(owner = "client!qn", name = "y", descriptor = "I")
    public static int field6542;

    @OriginalMember(owner = "client!qn", name = "A", descriptor = "I")
    public static int field6544;

    @OriginalMember(owner = "client!qn", name = "B", descriptor = "I")
    public static int field6545;

    @OriginalMember(owner = "client!qn", name = "D", descriptor = "I")
    public static int field6547;

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "(ZB)V")
    public final void method2719(boolean arg0, byte arg1) {
        ++field6545;
        super.field2559.method1749(25752, this);
        int var3 = 24 % ((arg1 - 65) / 38);
        OpenGL.glTexParameteri(super.field2564, 10242, !arg0 ? 33071 : 10497);
    }

    @OriginalMember(owner = "client!qn", name = "e", descriptor = "(I)V")
    public static void method2720(int arg0) {
        int var1 = 24 % ((-9 - arg0) / 58);
        field6546 = null;
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(ZLkt;IIBII)V")
    public static final void method2721(boolean arg0, class61 arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        ++field6544;
        if (~class510.field7414 > -51) {
            if (arg1 != null && arg1.field956 != null && arg3 < arg1.field956.length && arg1.field956[arg3] != null) {
                int var7 = arg1.field956[arg3][0];
                int var8 = var7 >> 8;
                int var9 = var7 >> 5 & 7;
                if (arg4 == 116) {
                    if (~arg1.field956[arg3].length < -2) {
                        int var10 = (int) (Math.random() * (double) arg1.field956[arg3].length);
                        if (~var10 < -1) {
                            var8 = arg1.field956[arg3][var10];
                        }
                    }
                    int var11 = 31 & var7;
                    if (var11 == 0) {
                        if (arg0) {
                            class361.method2292(var9, 0, var8, (byte) 127, 255);
                        }
                    } else if (class40.field667.field4222 != 0) {
                        int var12 = arg2 + -64 >> 7;
                        int var13 = arg5 + -64 >> 7;
                        class258.field4135[class510.field7414++] = new class128((byte) 1, var8, var9, 0, 255, (var12 << 16) - -var11 + (arg6 << 24) + (var13 << 8));
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qn", name = "<init>", descriptor = "(Ltt;II[BI)V")
    public class439(class249 arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        super(arg0, 3552, arg1, arg2, false);
        this.field6543 = arg2;
        super.field2559.method1749(25752, this);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage1Dub(super.field2564, 0, super.field2566, this.field6543, 0, arg4, 5121, arg3, 0);
        OpenGL.glPixelStorei(3317, 4);
        this.method1210((byte) -81, true);
    }

    @OriginalMember(owner = "client!qn", name = "f", descriptor = "(I)V")
    public static final void method2722(int arg0) {
        class424.field6231.method2666(-104);
        ++field6542;
        int var1 = class424.field6231.method2671(-128, 8);
        if (class231.field3482 > var1) {
            for (int var2 = var1; var2 < class231.field3482; ++var2) {
                class295.field4547[class401.field5920++] = class234.field3513[var2];
            }
        }
        if (class231.field3482 < var1) {
            throw new RuntimeException("gnpov1");
        } else {
            class231.field3482 = arg0;
            for (int var3 = 0; ~var1 < ~var3; ++var3) {
                int var4 = class234.field3513[var3];
                class46 var5 = ((class5) class366.field5398.method358((byte) 14, (long) var4)).field65;
                int var6 = class424.field6231.method2671(-121, 1);
                if (var6 == 0) {
                    class234.field3513[class231.field3482++] = var4;
                    var5.field7610 = class446.field6625;
                } else {
                    int var7 = class424.field6231.method2671(-125, 2);
                    if (~var7 == -1) {
                        class234.field3513[class231.field3482++] = var4;
                        var5.field7610 = class446.field6625;
                        class471.field6917[class20.field220++] = var4;
                    } else if (var7 == 1) {
                        class234.field3513[class231.field3482++] = var4;
                        var5.field7610 = class446.field6625;
                        int var8 = class424.field6231.method2671(-123, 3);
                        var5.method313(1, (byte) 125, var8);
                        int var9 = class424.field6231.method2671(arg0 ^ -120, 1);
                        if (var9 == 1) {
                            class471.field6917[class20.field220++] = var4;
                        }
                    } else if (var7 == 2) {
                        class234.field3513[class231.field3482++] = var4;
                        var5.field7610 = class446.field6625;
                        if (~class424.field6231.method2671(-125, 1) == -2) {
                            int var10 = class424.field6231.method2671(-119, 3);
                            var5.method313(2, (byte) 125, var10);
                            int var11 = class424.field6231.method2671(arg0 ^ -117, 3);
                            var5.method313(2, (byte) 126, var11);
                        } else {
                            int var12 = class424.field6231.method2671(-116, 3);
                            var5.method313(0, (byte) 125, var12);
                        }
                        int var13 = class424.field6231.method2671(arg0 ^ -117, 1);
                        if (~var13 == -2) {
                            class471.field6917[class20.field220++] = var4;
                        }
                    } else if (~var7 == -4) {
                        class295.field4547[class401.field5920++] = var4;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(I)V")
    public final void method192(int arg0) {
        int var2 = 105 / ((-44 - arg0) / 56);
        ++field6541;
    }
}
