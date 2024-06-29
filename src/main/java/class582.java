import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wu")
public class class582 implements class489 {

    @OriginalMember(owner = "client!wu", name = "e", descriptor = "I")
    public int field7366;

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "I")
    public static int field7362 = 328;

    @OriginalMember(owner = "client!wu", name = "d", descriptor = "Leg;")
    public static class336 field7365 = new class336(64);

    @OriginalMember(owner = "client!wu", name = "b", descriptor = "I")
    public static int field7363;

    @OriginalMember(owner = "client!wu", name = "c", descriptor = "I")
    public static int field7364;

    @OriginalMember(owner = "client!wu", name = "f", descriptor = "I")
    public static int field7367;

    @OriginalMember(owner = "client!wu", name = "g", descriptor = "I")
    public static int field7368;

    @OriginalMember(owner = "client!wu", name = "h", descriptor = "I")
    public static int field7369;

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(Ljha;IZ)V", line = 5)
    public static final void method3115(class33 arg0, int arg1, boolean arg2) {
        field7363++;
        if (class628.field7982 >= 400) {
            return;
        }
        if (class422.field5564 == arg0) {
            if (class47.field549 && (class610.field7710 & 0x10) != 0) {
                class48.field634++;
                class259.method1655(class726.field9525, false, -1, class559.field7106, 6070, false, 0L, 0, 49, (long) arg0.field4737, 0, class130.field1732 + " -> <col=ffffff>" + class659.field8581.method3589(class496.field6338, -22395), true);
            }
        } else if (arg1 < -114) {
            String var3;
            if (arg0.field335 == 0) {
                boolean var4 = true;
                if (class422.field5564.field379 != -1 && arg0.field379 != -1) {
                    int var5 = arg0.field379 > class422.field5564.field379 ? class422.field5564.field379 : arg0.field379;
                    int var6 = class422.field5564.field356 - arg0.field356;
                    if (var6 < 0) {
                        var6 = -var6;
                    }
                    if (var5 < var6) {
                        var4 = false;
                    }
                }
                String var7 = class201.field2799 == class186.field2600 ? class659.field8574.method3589(class496.field6338, -22395) : class659.field8572.method3589(class496.field6338, -22395);
                if (arg0.field356 < arg0.field326) {
                    var3 = arg0.method180(true, -115) + (var4 ? class510.method2815(arg0.field356, false, class422.field5564.field356) : "<col=ffffff>") + " (" + var7 + arg0.field356 + "+" + (arg0.field326 - arg0.field356) + ")";
                } else {
                    var3 = arg0.method180(true, -125) + (var4 ? class510.method2815(arg0.field356, false, class422.field5564.field356) : "<col=ffffff>") + " (" + var7 + arg0.field356 + ")";
                }
            } else if (arg0.field335 == -1) {
                var3 = arg0.method180(true, -111);
            } else {
                var3 = arg0.method180(true, -127) + " (" + class659.field8573.method3589(class496.field6338, -22395) + arg0.field335 + ")";
            }
            if (class47.field549 && !arg2 && (class610.field7710 & 0x8) != 0) {
                class259.method1655(class726.field9525, false, -1, class559.field7106, 6070, false, (long) arg0.field4737, 0, 12, (long) arg0.field4737, 0, class130.field1732 + " -> <col=ffffff>" + var3, true);
                class159.field2069++;
            }
            if (arg2) {
                class259.method1655("<col=cccccc>" + var3, true, 0, -1, 6070, false, 0L, 0, -1, (long) arg0.field4737, 0, "", false);
            } else {
                for (int var8 = 7; var8 >= 0; var8--) {
                    if (class193.field2693[var8] != null) {
                        short var9 = 0;
                        if (class433.field5672 == class201.field2799 && class193.field2693[var8].equalsIgnoreCase(class659.field8567.method3589(class496.field6338, -22395))) {
                            if (class528.field6707 && class422.field5564.field356 < arg0.field356) {
                                var9 = 2000;
                            }
                            if (class422.field5564.field337 == 0 || arg0.field337 == 0) {
                                if (arg0.field344) {
                                    var9 = 2000;
                                }
                            } else if (class422.field5564.field337 == arg0.field337) {
                                var9 = 2000;
                            } else {
                                var9 = 0;
                            }
                        } else if (class340.field4174[var8]) {
                            var9 = 2000;
                        }
                        short var10 = (short) (class107.field1451[var8] + var9);
                        int var11 = class87.field1209[var8] == -1 ? class299.field3794 : class87.field1209[var8];
                        class390.field4982++;
                        class259.method1655(class193.field2693[var8], false, -1, var11, 6070, false, (long) arg0.field4737, 0, var10, (long) arg0.field4737, 0, "<col=ffffff>" + var3, true);
                    }
                }
            }
            if (!arg2) {
                for (class765 var12 = (class765) class595.field7563.method3591(0); var12 != null; var12 = (class765) class595.field7563.method3600((byte) 120)) {
                    if (var12.field10412 == 16) {
                        var12.field10410 = "<col=ffffff>" + var3;
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(I)Ltha;", line = 174)
    public static final class390 method3116(int arg0) {
        field7367++;
        try {
            if (arg0 != 8587) {
                method3117((byte) 112, false, -107, 41);
            }
            return (class390) Class.forName("li").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(BZII)I", line = 193)
    public static final int method3117(byte arg0, boolean arg1, int arg2, int arg3) {
        field7364++;
        class148 var4 = class398.method2306(arg3, arg1, (byte) 41);
        if (var4 == null) {
            return 0;
        } else if (arg2 == -1) {
            return 0;
        } else {
            int var5 = 0;
            int var6 = 0;
            if (arg0 != -55) {
                field7369 = -32;
            }
            while (var6 < var4.field1884.length) {
                if (var4.field1892[var6] == arg2) {
                    var5 += var4.field1884[var6];
                }
                var6++;
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!wu", name = "toString", descriptor = "()Ljava/lang/String;", line = 228)
    public final String toString() {
        field7368++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(Z)V", line = 237)
    public static void method3118(boolean arg0) {
        if (!arg0) {
            method3116(0);
        }
        field7365 = null;
    }

    @OriginalMember(owner = "client!wu", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 251)
    public class582(String arg0, int arg1) {
        this.field7366 = arg1;
    }
}
