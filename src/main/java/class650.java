import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nca")
public class class650 {

    @OriginalMember(owner = "client!nca", name = "g", descriptor = "[Ljava/awt/Color;")
    public static Color[] field9381 = new Color[] { new Color(16777215), new Color(16777215) };

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "I")
    public static int field9375;

    @OriginalMember(owner = "client!nca", name = "b", descriptor = "I")
    public static int field9376;

    @OriginalMember(owner = "client!nca", name = "c", descriptor = "I")
    public static int field9377;

    @OriginalMember(owner = "client!nca", name = "e", descriptor = "I")
    public static int field9379;

    @OriginalMember(owner = "client!nca", name = "i", descriptor = "I")
    public static int field9383;

    @OriginalMember(owner = "client!nca", name = "k", descriptor = "I")
    public static int field9385;

    @OriginalMember(owner = "client!nca", name = "h", descriptor = "[B")
    public byte[] field9382;

    @OriginalMember(owner = "client!nca", name = "d", descriptor = "[S")
    public short[] field9378;

    @OriginalMember(owner = "client!nca", name = "f", descriptor = "[S")
    public short[] field9380;

    @OriginalMember(owner = "client!nca", name = "j", descriptor = "[S")
    public short[] field9384;

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(I)V")
    public static void method3712(int arg0) {
        field9381 = null;
        if (arg0 != 0) {
            field9385 = 49;
        }
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(Z)V")
    public static final void method3713(boolean arg0) {
        field9376++;
        if (!class169.field2063) {
            return;
        }
        class593 var1 = class322.method2103(class238.field3397, false, class405.field6120);
        if (var1 != null && var1.field8646 != null) {
            class86 var2 = new class86();
            var2.field985 = var1.field8646;
            var2.field976 = var1;
            class604.method3516(var2);
        }
        if (!arg0) {
            return;
        }
        class169.field2063 = false;
        class595.field8697 = -1;
        class192.field2529 = -1;
        if (var1 != null) {
            class33.method187(var1, (byte) -113);
        }
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(IBZI)V")
    public static final void method3714(int arg0, byte arg1, boolean arg2, int arg3) {
        field9375++;
        if (arg3 < 8000 || arg3 > 48000) {
            throw new IllegalArgumentException();
        }
        class377.field5732 = arg0;
        class325.field4696 = arg2;
        if (arg1 > -120) {
            field9385 = 83;
        }
        class292.field4050 = arg3;
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(B)V")
    public static final void method3715(byte arg0) {
        field9379++;
        if (class518.field7542 == -1) {
            return;
        }
        int var1 = class32.field369.method778(arg0 + 113);
        int var2 = class32.field369.method777((byte) -51);
        if (arg0 != -107) {
            return;
        }
        class458 var3 = (class458) class187.field2310.method719(false);
        if (var3 != null) {
            var1 = var3.method227(-4915);
            var2 = var3.method230((byte) 54);
        }
        class154.method895(0, 0, 0, var1, var2, 0, class298.field4407, class518.field7542, (byte) 99, class581.field8366);
        if (class50.field537 != null) {
            class588.method3436((byte) 102, var2, var1);
        }
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(ZILeca;)V")
    public static final void method3716(boolean arg0, int arg1, class655 arg2) {
        field9377++;
        if (class111.field1359 >= 400) {
            return;
        }
        if (class439.field6548 != arg2) {
            String var9;
            if (arg2.field9471 == arg1) {
                boolean var3 = true;
                if (class439.field6548.field9446 != -1 && arg2.field9446 != -1) {
                    int var4 = arg2.field9462 >= class439.field6548.field9462 ? arg2.field9462 : class439.field6548.field9462;
                    int var5 = class439.field6548.field9446 < arg2.field9446 ? class439.field6548.field9446 : arg2.field9446;
                    int var6 = (var4 * 10 / 100) + var5 + 5;
                    int var7 = class439.field6548.field9462 - arg2.field9462;
                    if (var7 < 0) {
                        var7 = -var7;
                    }
                    if (var7 > var6) {
                        var3 = false;
                    }
                }
                String var8 = class408.field6151 == class184.field2291 ? class574.field8283.method2902(class35.field396, -20139) : class197.field2670.method2902(class35.field396, -20139);
                if (arg2.field9439 <= arg2.field9462) {
                    var9 = arg2.method3744(107, true) + (var3 ? class365.method2348(class439.field6548.field9462, -10, arg2.field9462) : "<col=ffffff>") + " (" + var8 + arg2.field9462 + ")";
                } else {
                    var9 = arg2.method3744(102, true) + (var3 ? class365.method2348(class439.field6548.field9462, -10, arg2.field9462) : "<col=ffffff>") + " (" + var8 + arg2.field9462 + "+" + (arg2.field9439 - arg2.field9462) + ")";
                }
            } else if (arg2.field9471 == -1) {
                var9 = arg2.method3744(96, true);
            } else {
                var9 = arg2.method3744(108, true) + " (" + class513.field7490.method2902(class35.field396, -20139) + arg2.field9471 + ")";
            }
            if (class169.field2063 && !arg0 && (class580.field8354 & 0x8) != 0) {
                class400.field6062++;
                class36.method198(true, class180.field2210 + " -> <col=ffffff>" + var9, -1, class442.field6600, class259.field3692, true, 0, 0, false, 46, (long) arg2.field2495);
            }
            if (arg0) {
                class36.method198(false, "", 0, "<col=cccccc>" + var9, -1, true, 0, 0, true, -1, 0L);
            } else {
                for (int var10 = 7; var10 >= 0; var10--) {
                    if (class162.field1983[var10] != null) {
                        short var12 = 0;
                        if (class325.field4688 == class184.field2291 && class162.field1983[var10].equalsIgnoreCase(class356.field5059.method2902(class35.field396, arg1 ^ 0xFFFFB155))) {
                            if (class439.field6548.field9462 < arg2.field9462) {
                                var12 = 2000;
                            }
                            if (class439.field6548.field9484 != 0 && arg2.field9484 != 0) {
                                if (class439.field6548.field9484 == arg2.field9484) {
                                    var12 = 2000;
                                } else {
                                    var12 = 0;
                                }
                            }
                        } else if (class625.field9032[var10]) {
                            var12 = 2000;
                        }
                        short var13 = (short) (class403.field6099[var10] + var12);
                        int var14 = class31.field355[var10] == -1 ? class86.field986 : class31.field355[var10];
                        class198.field2674++;
                        class36.method198(true, "<col=ffffff>" + var9, -1, class162.field1983[var10], var14, true, 0, 0, false, var13, (long) arg2.field2495);
                    }
                }
            }
            if (!arg0) {
                for (class631 var11 = (class631) class436.field6487.method719(false); var11 != null; var11 = (class631) class436.field6487.method716(14)) {
                    if (var11.field9100 == 21) {
                        var11.field9107 = "<col=ffffff>" + var9;
                        return;
                    }
                }
            }
        } else if (class169.field2063 && (class580.field8354 & 0x10) != 0) {
            class36.method198(true, class180.field2210 + " -> <col=ffffff>" + class271.field3803.method2902(class35.field396, -20139), -1, class442.field6600, class259.field3692, true, 0, 0, false, 45, 0L);
            class471.field6983++;
        }
    }
}
