import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ica")
public class class692 {

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "I")
    public static int field9596 = 50;

    @OriginalMember(owner = "client!ica", name = "g", descriptor = "[I")
    public static int[] field9602 = new int[field9596];

    @OriginalMember(owner = "client!ica", name = "j", descriptor = "[I")
    public static int[] field9605 = new int[field9596];

    @OriginalMember(owner = "client!ica", name = "c", descriptor = "[I")
    public static int[] field9598 = new int[field9596];

    @OriginalMember(owner = "client!ica", name = "b", descriptor = "I")
    public static int field9597 = 0;

    @OriginalMember(owner = "client!ica", name = "m", descriptor = "[I")
    public static int[] field9608 = new int[field9596];

    @OriginalMember(owner = "client!ica", name = "h", descriptor = "[I")
    public static int[] field9603 = new int[field9596];

    @OriginalMember(owner = "client!ica", name = "k", descriptor = "[I")
    public static int[] field9606 = new int[field9596];

    @OriginalMember(owner = "client!ica", name = "l", descriptor = "[Ljava/lang/String;")
    public static String[] field9607 = new String[field9596];

    @OriginalMember(owner = "client!ica", name = "o", descriptor = "B")
    public byte field9610;

    @OriginalMember(owner = "client!ica", name = "d", descriptor = "I")
    public int field9599;

    @OriginalMember(owner = "client!ica", name = "e", descriptor = "I")
    public static int field9600;

    @OriginalMember(owner = "client!ica", name = "i", descriptor = "I")
    public static int field9604;

    @OriginalMember(owner = "client!ica", name = "n", descriptor = "I")
    public static int field9609;

    @OriginalMember(owner = "client!ica", name = "p", descriptor = "I")
    public static int field9611;

    @OriginalMember(owner = "client!ica", name = "f", descriptor = "Ljava/lang/String;")
    public String field9601;

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(B)V", line = 6)
    public static void method3871(byte arg0) {
        field9605 = null;
        field9602 = null;
        field9607 = null;
        field9603 = null;
        if (arg0 != -66) {
            method3872((byte) -18, null, false);
        }
        field9598 = null;
        field9608 = null;
        field9606 = null;
    }

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(BLfl;Z)V", line = 26)
    public static final void method3872(byte arg0, class771 arg1, boolean arg2) {
        field9604++;
        if (class690.field9574 >= 400) {
            return;
        }
        if (class235.field3379 != arg1) {
            if (arg0 != -45) {
                method3872((byte) -64, null, true);
            }
            String var3;
            if (arg1.field10638 == 0) {
                boolean var4 = true;
                if (class235.field3379.field10644 != -1 && arg1.field10644 != -1) {
                    int var5 = arg1.field10644 <= class235.field3379.field10644 ? arg1.field10644 : class235.field3379.field10644;
                    int var6 = class235.field3379.field10647 - arg1.field10647;
                    if (var6 < 0) {
                        var6 = -var6;
                    }
                    if (var6 > var5) {
                        var4 = false;
                    }
                }
                String var7 = class403.field5534 == class177.field2797 ? class641.field8848.method3566((byte) -45, class464.field6309) : class641.field8846.method3566((byte) 120, class464.field6309);
                if (arg1.field10661 <= arg1.field10647) {
                    var3 = arg1.method4235(true, true) + (var4 ? class379.method2307((byte) -71, arg1.field10647, class235.field3379.field10647) : "<col=ffffff>") + " (" + var7 + arg1.field10647 + ")";
                } else {
                    var3 = arg1.method4235(true, true) + (var4 ? class379.method2307((byte) -62, arg1.field10647, class235.field3379.field10647) : "<col=ffffff>") + " (" + var7 + arg1.field10647 + "+" + (arg1.field10661 - arg1.field10647) + ")";
                }
            } else if (arg1.field10638 == -1) {
                var3 = arg1.method4235(true, true);
            } else {
                var3 = arg1.method4235(true, true) + " (" + class641.field8847.method3566((byte) 121, class464.field6309) + arg1.field10638 + ")";
            }
            if (class675.field9384 && !arg2 && (class448.field6148 & 0x8) != 0) {
                class596.method3396(true, false, -1, class340.field4584, 0, (long) arg1.field5288, class420.field5726 + " -> <col=ffffff>" + var3, 17, class508.field6980, (long) arg1.field5288, (byte) 34, false, 0);
                class137.field2347++;
            }
            if (arg2) {
                class596.method3396(false, false, 0, -1, 0, 0L, "", -1, "<col=cccccc>" + var3, (long) arg1.field5288, (byte) 34, true, 0);
            } else {
                for (int var8 = 7; var8 >= 0; var8--) {
                    if (class774.field10708[var8] != null) {
                        short var9 = 0;
                        if (class505.field6887 == class177.field2797 && class774.field10708[var8].equalsIgnoreCase(class641.field8841.method3566((byte) -128, class464.field6309))) {
                            if (class728.field9997 && arg1.field10647 > class235.field3379.field10647) {
                                var9 = 2000;
                            }
                            if (class235.field3379.field10667 == 0 || arg1.field10667 == 0) {
                                if (arg1.field10635) {
                                    var9 = 2000;
                                }
                            } else if (class235.field3379.field10667 == arg1.field10667) {
                                var9 = 2000;
                            } else {
                                var9 = 0;
                            }
                        } else if (class748.field10323[var8]) {
                            var9 = 2000;
                        }
                        short var10 = (short) (class268.field3767[var8] + var9);
                        int var11 = class262.field3671[var8] == -1 ? class412.field5655 : class262.field3671[var8];
                        class129.field2251++;
                        class596.method3396(true, false, -1, var11, 0, (long) arg1.field5288, "<col=ffffff>" + var3, var10, class774.field10708[var8], (long) arg1.field5288, (byte) 34, false, 0);
                    }
                }
            }
            if (!arg2) {
                for (class534 var12 = (class534) class208.field3119.method3589((byte) -128); var12 != null; var12 = (class534) class208.field3119.method3591(arg0 + 45)) {
                    if (var12.field7229 == 16) {
                        var12.field7227 = "<col=ffffff>" + var3;
                        return;
                    }
                }
            }
        } else if (class675.field9384 && (class448.field6148 & 0x10) != 0) {
            class596.method3396(true, false, -1, class340.field4584, 0, 0L, class420.field5726 + " -> <col=ffffff>" + class641.field8855.method3566((byte) 98, class464.field6309), 9, class508.field6980, (long) arg1.field5288, (byte) 34, false, 0);
            class277.field3834++;
        }
    }

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(Ljava/lang/String;ZILhk;)Lhv;", line = 210)
    public static final class546 method3873(String arg0, boolean arg1, int arg2, class111 arg3) {
        field9611++;
        long var4 = OpenGL.glCreateShaderObjectARB(arg2);
        OpenGL.glShaderSourceARB(var4, arg0);
        OpenGL.glCompileShaderARB(var4);
        OpenGL.glGetObjectParameterivARB(var4, 35713, class297.field4057, 0);
        if (!arg1) {
            field9606 = null;
        }
        if (class297.field4057[0] == 0) {
            if (class297.field4057[0] == 0) {
                System.out.println("Shader compile failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class297.field4057, 1);
            if (class297.field4057[1] > 1) {
                byte[] var6 = new byte[class297.field4057[1]];
                OpenGL.glGetInfoLogARB(var4, class297.field4057[1], class297.field4057, 0, var6, 0);
                System.out.println(new String(var6));
            }
            if (class297.field4057[0] == 0) {
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class546(arg3, var4, arg2);
    }
}
