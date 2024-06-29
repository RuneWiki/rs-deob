import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class398 {

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "[[[I")
    public static int[][][] field6047 = new int[2][][];

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "I")
    public static int field6048 = -1;

    @OriginalMember(owner = "client!qg", name = "f", descriptor = "I")
    public static int field6051 = 0;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "I")
    public static int field6046;

    @OriginalMember(owner = "client!qg", name = "d", descriptor = "I")
    public static int field6049;

    @OriginalMember(owner = "client!qg", name = "e", descriptor = "I")
    public static int field6050;

    // $FF: synthetic field
    @OriginalMember(owner = "client!qg", name = "g", descriptor = "Ljava/lang/Class;")
    public static Class field6052;

    // $FF: synthetic method
    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method2543(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(I)V", line = 5)
    public static void method2540(int arg0) {
        if (arg0 == 3) {
            field6047 = null;
        }
    }

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "(I)Z", line = 19)
    public final boolean method2541(int arg0) {
        field6049++;
        if (arg0 < 33) {
            field6048 = 23;
        }
        return class481.field7061 == this | class31.field351 == this;
    }

    @OriginalMember(owner = "client!qg", name = "toString", descriptor = "()Ljava/lang/String;", line = 35)
    public final String toString() {
        field6050++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IILoa;IIIBII)V", line = 46)
    public static final void method2542(int arg0, int arg1, class605 arg2, int arg3, int arg4, int arg5, byte arg6, int arg7, int arg8) {
        field6046++;
        class57 var9 = (class57) class491.method2948(arg1, arg5, arg0);
        if (var9 != null) {
            class385 var10 = class575.field8301.method1499(-7532, var9.method89(-93));
            int var11 = var9.method92(arg6 + 9790) & 0x3;
            int var12 = var9.method95(49);
            if (var10.field5850 == -1) {
                int var13 = arg8;
                if (var10.field5806 > 0) {
                    var13 = arg4;
                }
                if (var12 == 0 || var12 == 2) {
                    if (var11 == 0) {
                        arg2.method3525(var13, arg3, arg7, 1, 4);
                    } else if (var11 == 1) {
                        arg2.method3521(arg3, 4, var13, 2, arg7);
                    } else if (var11 == 2) {
                        arg2.method3525(var13, arg3 + 3, arg7, arg6 - 21, 4);
                    } else if (var11 == 3) {
                        arg2.method3521(arg3, 4, var13, 2, arg7 + 3);
                    }
                }
                if (var12 == 3) {
                    if (var11 == 0) {
                        arg2.method3524(1, arg7, (byte) 92, var13, 1, arg3);
                    } else if (var11 == 1) {
                        arg2.method3524(1, arg7, (byte) 92, var13, 1, arg3 + 3);
                    } else if (var11 == 2) {
                        arg2.method3524(1, arg7 + 3, (byte) 92, var13, 1, arg3 + 3);
                    } else if (var11 == 3) {
                        arg2.method3524(1, arg7 + 3, (byte) 92, var13, 1, arg3);
                    }
                }
                if (var12 == 2) {
                    if (var11 == 0) {
                        arg2.method3521(arg3, 4, var13, 2, arg7);
                    } else if (var11 == 1) {
                        arg2.method3525(var13, arg3 + 3, arg7, 1, 4);
                    } else if (var11 == 2) {
                        arg2.method3521(arg3, 4, var13, 2, arg7 + 3);
                    } else if (var11 == 3) {
                        arg2.method3525(var13, arg3, arg7, 1, 4);
                    }
                }
            } else {
                class596.method3475(arg2, arg3, var11, 18160, arg7, var10);
            }
        }
        class57 var14 = (class57) class226.method1473(arg1, arg5, arg0, field6052 == null ? (field6052 = method2543("qn")) : field6052);
        if (var14 != null) {
            class385 var15 = class575.field8301.method1499(-7532, var14.method89(-124));
            int var16 = var14.method92(9812) & 0x3;
            int var17 = var14.method95(-119);
            if (var15.field5850 != -1) {
                class596.method3475(arg2, arg3, var16, arg6 + 18138, arg7, var15);
            } else if (var17 == 9) {
                int var18 = -1118482;
                if (var15.field5806 > 0) {
                    var18 = -1179648;
                }
                if (var16 == 0 || var16 == 2) {
                    arg2.method3520(arg7, arg3, arg7 + 3, (byte) 0, arg3 + 3, var18);
                } else {
                    arg2.method3520(arg7 + 3, arg3, arg7, (byte) 0, arg3 + 3, var18);
                }
            }
        }
        class57 var19 = (class57) class157.method911(arg1, arg5, arg0);
        if (var19 != null) {
            class385 var20 = class575.field8301.method1499(-7532, var19.method89(78));
            int var21 = var19.method92(arg6 ^ 0x2642) & 0x3;
            if (var20.field5850 != -1) {
                class596.method3475(arg2, arg3, var21, 18160, arg7, var20);
            }
        }
        if (arg6 != 22) {
            method2542(40, -61, null, 61, 57, -89, (byte) 116, 96, -27);
        }
    }
}
