import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public abstract class class31 extends class117 {

    @OriginalMember(owner = "client!uf", name = "E", descriptor = "I")
    public int field504;

    @OriginalMember(owner = "client!uf", name = "D", descriptor = "Lsm;")
    public static class249 field503 = new class249();

    @OriginalMember(owner = "client!uf", name = "G", descriptor = "I")
    public static int field506;

    @OriginalMember(owner = "client!uf", name = "C", descriptor = "I")
    public static int field502;

    @OriginalMember(owner = "client!uf", name = "F", descriptor = "Lp;")
    public static class157 field505;

    static {
        new class112("You are temporarily banned from this clan channel.", "Du wurdest temporär aus diesem Chatraum verbannt.", "Vous êtes temporairement exclu de ce canal de clan.", "Você está temporariamente vetado de entrar nesse canal de clã.");
        field506 = 0;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(BLes;)V", line = 7)
    public static final void method246(byte arg0, class75 arg1) {
        field502++;
        arg1.field1065 = false;
        if (arg1.field1089 != -1) {
            class372 var2 = field505.method950(true, arg1.field1089);
            if (var2 == null || var2.field5278 == null) {
                arg1.field1089 = -1;
                arg1.field1127 = false;
            } else {
                label302: {
                    arg1.field1080++;
                    if (var2.field5278.length > arg1.field1062 && arg1.field1080 > var2.field5283[arg1.field1062]) {
                        arg1.field1080 = 1;
                        arg1.field1088++;
                        arg1.field1062++;
                        class272.method1706(arg1.field6766, var2, class2.field21 == arg1, (byte) 31, arg1.field6765, arg1.field6746, arg1.field1062);
                    }
                    if (arg1.field1062 >= var2.field5278.length) {
                        arg1.field1062 = 0;
                        arg1.field1080 = 0;
                        if (arg1.field1127) {
                            arg1.field1089 = arg1.method517(-85).method1917(-13087);
                            if (arg1.field1089 == -1) {
                                arg1.field1127 = false;
                                break label302;
                            }
                            var2 = field505.method950(true, arg1.field1089);
                        }
                        class272.method1706(arg1.field6766, var2, class2.field21 == arg1, (byte) 31, arg1.field6765, arg1.field6746, arg1.field1062);
                    }
                    arg1.field1088 = arg1.field1062 + 1;
                    if (arg1.field1088 >= var2.field5278.length) {
                        arg1.field1088 = 0;
                    }
                }
            }
        }
        if (arg1.field1079 != -1 && class356.field4972 >= arg1.field1121) {
            class321 var3 = class163.field2348.method548(arg1.field1079, (byte) 20);
            int var4 = var3.field4391;
            if (var4 == -1) {
                arg1.field1079 = -1;
            } else {
                label304: {
                    class372 var5 = field505.method950(true, var4);
                    if (var3.field4392) {
                        if (var5.field5258 == 3) {
                            if (arg1.field1138 > 0 && class356.field4972 >= arg1.field1129 && arg1.field1131 < class356.field4972) {
                                arg1.field1079 = -1;
                                break label304;
                            }
                        } else if (var5.field5258 == 1 && arg1.field1138 > 0 && class356.field4972 >= arg1.field1129 && class356.field4972 > arg1.field1131) {
                            arg1.field1121 = class356.field4972 + 1;
                            break label304;
                        }
                    }
                    if (var5 == null || var5.field5278 == null) {
                        arg1.field1079 = -1;
                    } else {
                        if (arg1.field1091 < 0) {
                            arg1.field1091 = 0;
                            class272.method1706(arg1.field6766, var5, class2.field21 == arg1, (byte) 31, arg1.field6765, arg1.field6746, 0);
                        }
                        arg1.field1125++;
                        if (var5.field5278.length > arg1.field1091 && arg1.field1125 > var5.field5283[arg1.field1091]) {
                            arg1.field1091++;
                            arg1.field1125 = 1;
                            class272.method1706(arg1.field6766, var5, class2.field21 == arg1, (byte) 31, arg1.field6765, arg1.field6746, arg1.field1091);
                        }
                        if (var5.field5278.length <= arg1.field1091) {
                            if (var3.field4392) {
                                arg1.field1111++;
                                arg1.field1091 -= var5.field5251;
                                if (arg1.field1111 >= var5.field5269) {
                                    arg1.field1079 = -1;
                                } else if (arg1.field1091 >= 0 && var5.field5278.length > arg1.field1091) {
                                    class272.method1706(arg1.field6766, var5, class2.field21 == arg1, (byte) 31, arg1.field6765, arg1.field6746, arg1.field1091);
                                } else {
                                    arg1.field1079 = -1;
                                }
                            } else {
                                arg1.field1079 = -1;
                            }
                        }
                        arg1.field1074 = arg1.field1091 + 1;
                        if (var5.field5278.length <= arg1.field1074) {
                            if (var3.field4392) {
                                arg1.field1074 -= var5.field5251;
                                if (var5.field5269 <= (arg1.field1111 + 1)) {
                                    arg1.field1074 = -1;
                                } else if (arg1.field1074 < 0 || var5.field5278.length <= arg1.field1074) {
                                    arg1.field1074 = -1;
                                }
                            } else {
                                arg1.field1074 = -1;
                            }
                        }
                    }
                }
            }
        }
        int var6 = -73 % ((-arg0 - 13) / 63);
        if (arg1.field1128 != -1 && arg1.field1110 <= 1) {
            class372 var7 = field505.method950(true, arg1.field1128);
            if (var7.field5258 == 3) {
                if (arg1.field1138 > 0 && class356.field4972 >= arg1.field1129 && arg1.field1131 < class356.field4972) {
                    arg1.field1128 = -1;
                }
            } else if (var7.field5258 == 1 && arg1.field1138 > 0 && class356.field4972 >= arg1.field1129 && arg1.field1131 < class356.field4972) {
                arg1.field1110 = 2;
            }
        }
        if (arg1.field1128 != -1 && arg1.field1110 == 0) {
            class372 var8 = field505.method950(true, arg1.field1128);
            if (var8 == null || var8.field5278 == null) {
                arg1.field1128 = -1;
            } else {
                arg1.field1126++;
                if (var8.field5278.length > arg1.field1064 && arg1.field1126 > var8.field5283[arg1.field1064]) {
                    arg1.field1126 = 1;
                    arg1.field1064++;
                    class272.method1706(arg1.field6766, var8, class2.field21 == arg1, (byte) 31, arg1.field6765, arg1.field6746, arg1.field1064);
                }
                if (arg1.field1064 >= var8.field5278.length) {
                    arg1.field1071++;
                    arg1.field1064 -= var8.field5251;
                    if (arg1.field1071 >= var8.field5269) {
                        arg1.field1128 = -1;
                    } else if (arg1.field1064 >= 0 && var8.field5278.length > arg1.field1064) {
                        class272.method1706(arg1.field6766, var8, class2.field21 == arg1, (byte) 31, arg1.field6765, arg1.field6746, arg1.field1064);
                    } else {
                        arg1.field1128 = -1;
                    }
                }
                arg1.field1124 = arg1.field1064 + 1;
                if (var8.field5278.length <= arg1.field1124) {
                    arg1.field1124 -= var8.field5251;
                    if (var8.field5269 <= (arg1.field1071 + 1)) {
                        arg1.field1124 = -1;
                    } else if (arg1.field1124 < 0 || var8.field5278.length <= arg1.field1124) {
                        arg1.field1124 = -1;
                    }
                }
                arg1.field1065 = var8.field5275;
            }
        }
        if (arg1.field1110 > 0) {
            arg1.field1110--;
        }
        for (int var9 = 0; var9 < arg1.field1086.length; var9++) {
            class60 var10 = arg1.field1086[var9];
            if (var10 != null) {
                if (var10.field932 > 0) {
                    var10.field932--;
                } else {
                    class372 var11 = field505.method950(true, var10.field941);
                    if (var11 == null || var11.field5278 == null) {
                        arg1.field1086[var9] = null;
                    } else {
                        var10.field939++;
                        if (var10.field937 < var11.field5278.length && var10.field939 > var11.field5283[var10.field937]) {
                            var10.field937++;
                            var10.field939 = 1;
                            class272.method1706(arg1.field6766, var11, class2.field21 == arg1, (byte) 31, arg1.field6765, arg1.field6746, var10.field937);
                        }
                        if (var10.field937 >= var11.field5278.length) {
                            var10.field934++;
                            var10.field937 -= var11.field5251;
                            if (var10.field934 >= var11.field5269) {
                                arg1.field1086[var9] = null;
                            } else if (var10.field937 >= 0 && var10.field937 < var11.field5278.length) {
                                class272.method1706(arg1.field6766, var11, class2.field21 == arg1, (byte) 31, arg1.field6765, arg1.field6746, var10.field937);
                            } else {
                                arg1.field1086[var9] = null;
                            }
                        }
                        var10.field938 = var10.field937 + 1;
                        if (var11.field5278.length <= var10.field938) {
                            var10.field938 -= var11.field5251;
                            if (var10.field934 + 1 >= var11.field5269) {
                                var10.field938 = -1;
                            } else if (var10.field938 < 0 || var11.field5278.length <= var10.field938) {
                                var10.field938 = -1;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!uf", name = "g", descriptor = "(I)V", line = 325)
    public static void method247(int arg0) {
        if (arg0 != -12567) {
            field505 = null;
        }
        field505 = null;
        field503 = null;
    }

    @OriginalMember(owner = "client!uf", name = "<init>", descriptor = "(I)V", line = 341)
    public class31(int arg0) {
        this.field504 = arg0;
    }

    @OriginalMember(owner = "client!uf", name = "f", descriptor = "(I)Z")
    public abstract boolean method245(int arg0);

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "(B)Ljava/lang/Object;")
    public abstract Object method248(byte arg0);
}
