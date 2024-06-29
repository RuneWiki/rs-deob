import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aq")
public class class110 extends Canvas {

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "Ljava/awt/Component;")
    private Component field1580;

    @OriginalMember(owner = "client!aq", name = "g", descriptor = "[Z")
    public static boolean[] field1586;

    @OriginalMember(owner = "client!aq", name = "b", descriptor = "I")
    public static int field1581;

    @OriginalMember(owner = "client!aq", name = "c", descriptor = "I")
    public static int field1582;

    @OriginalMember(owner = "client!aq", name = "d", descriptor = "I")
    public static int field1583;

    @OriginalMember(owner = "client!aq", name = "e", descriptor = "I")
    public static int field1584;

    @OriginalMember(owner = "client!aq", name = "f", descriptor = "I")
    public static int field1585;

    // $FF: synthetic field
    @OriginalMember(owner = "client!aq", name = "h", descriptor = "Ljava/lang/Class;")
    public static Class field1587;

    @OriginalMember(owner = "client!aq", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class110(Component arg0) {
        this.field1580 = arg0;
    }

    @OriginalMember(owner = "client!aq", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        field1584++;
        this.field1580.paint(arg0);
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(BIIIIIII)V")
    public static final void method761(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1581++;
        if (arg4 >= 0 && arg3 >= 0 && arg4 < class12.field251 - 1 && arg3 < (class289.field3782 - 1)) {
            if (class497.field6886 == null) {
                return;
            }
            if (arg7 == 0) {
                class338 var8 = (class338) class234.method1453(arg5, arg4, arg3);
                class338 var9 = (class338) class335.method1917(arg5, arg4, arg3);
                if (var8 != null && arg2 != 2) {
                    if ((var8 instanceof class47)) {
                        ((class47) var8).field704.method2377(arg1, (byte) 115);
                    } else {
                        class37.method290((byte) -100, arg3, arg5, arg2, var8.method347((byte) -87), arg7, arg6, arg1, arg4);
                    }
                }
                if (var9 != null) {
                    if (var9 instanceof class47) {
                        ((class47) var9).field704.method2377(arg1, (byte) 50);
                    } else {
                        class37.method290((byte) -100, arg3, arg5, arg2, var9.method347((byte) -87), arg7, arg6, arg1, arg4);
                    }
                }
            } else if (arg7 == 1) {
                class338 var10 = (class338) class463.method2642(arg5, arg4, arg3);
                if (var10 != null) {
                    if ((var10 instanceof class478)) {
                        ((class478) var10).field6585.method2377(arg1, (byte) 42);
                    } else {
                        int var11 = var10.method347((byte) -87);
                        if (arg2 == 4 || arg2 == 5) {
                            class37.method290((byte) -100, arg3, arg5, 4, var11, arg7, arg6, arg1, arg4);
                        } else if (arg2 == 6) {
                            class37.method290((byte) -100, arg3, arg5, 4, var11, arg7, arg6 + 4, arg1, arg4);
                        } else if (arg2 == 7) {
                            class37.method290((byte) -100, arg3, arg5, 4, var11, arg7, (arg6 + 2 & 0x3) + 4, arg1, arg4);
                        } else if (arg2 == 8) {
                            class37.method290((byte) -100, arg3, arg5, 4, var11, arg7, arg6 + 4, arg1, arg4);
                            class37.method290((byte) -100, arg3, arg5, 4, var11, arg7, (arg6 + 2 & 0x3) + 4, arg1, arg4);
                        }
                    }
                }
            } else if (arg7 == 2) {
                class338 var12 = (class338) class504.method2874(arg5, arg4, arg3, field1587 == null ? (field1587 = method765("np")) : field1587);
                if (var12 != null) {
                    if (arg2 == 11) {
                        arg2 = 10;
                    }
                    if (var12 instanceof class271) {
                        ((class271) var12).field3567.method2377(arg1, (byte) 74);
                    } else {
                        class37.method290((byte) -100, arg3, arg5, arg2, var12.method347((byte) -87), arg7, arg6, arg1, arg4);
                    }
                }
            } else if (arg7 == 3) {
                class338 var13 = (class338) class466.method2648(arg5, arg4, arg3);
                if (var13 != null) {
                    if ((var13 instanceof class180)) {
                        ((class180) var13).field2597.method2377(arg1, (byte) 54);
                    } else {
                        class37.method290((byte) -100, arg3, arg5, arg2, var13.method347((byte) -87), arg7, arg6, arg1, arg4);
                    }
                }
            }
        }
        int var14 = 101 / ((-arg0 - 73) / 36);
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(I)V")
    public static void method762(int arg0) {
        field1586 = null;
        if (arg0 < 101) {
            method761((byte) -111, -25, 54, 42, 103, -46, -19, -25);
        }
    }

    @OriginalMember(owner = "client!aq", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.field1580.update(arg0);
        field1583++;
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(IJLqa;)V")
    public static final void method763(int arg0, long arg1, class162 arg2) {
        field1582++;
        class132.field1913 = 0;
        class347.field4687 = class232.field3128;
        class232.field3128 = 0;
        long var4 = class498.method2854(-128);
        for (class527 var6 = (class527) class264.field3485.method1771(116); var6 != null; var6 = (class527) class264.field3485.method1774((byte) -55)) {
            if (var6.method3103(arg2, arg1)) {
                class132.field1913++;
            }
        }
        if (arg0 >= -82) {
            method761((byte) -93, 48, -3, -121, 119, -60, 104, -1);
        }
        if (class224.field3021 && (arg1 % 100L) == 0L) {
            System.out.println("Particle system count: " + class264.field3485.method1768(-2245) + ", running: " + class132.field1913 + ". Particles: " + class232.field3128 + ". Time taken: " + (class498.method2854(-113) - var4) + "ms");
        }
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(III)V")
    public static final void method764(int arg0, int arg1, int arg2) {
        class409 var3 = class497.field6886[arg0][arg1][arg2];
        if (var3 != null && var3.field5618 != null) {
            var3.field5618 = null;
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method765(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    static {
        new class304("You do not have permission to kick users in this channel.", "Du darfst keine Benutzer aus diesem Chatraum rauswerfen.", "Vous n'êtes pas autorisé à expulser des utilisateurs de ce canal.", "Você não tem permissão para expulsar usuários neste canal.");
        field1586 = new boolean[100];
        new class304(null, "Dieses System darf nicht missbraucht werden!", null, null);
    }
}
