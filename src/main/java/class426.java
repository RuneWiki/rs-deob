import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class426 extends class316 {

    @OriginalMember(owner = "client!re", name = "i", descriptor = "I")
    public static int field6249;

    @OriginalMember(owner = "client!re", name = "h", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field6248;

    // $FF: synthetic field
    @OriginalMember(owner = "client!re", name = "j", descriptor = "Ljava/lang/Class;")
    public static Class field6250;

    // $FF: synthetic method
    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method2526(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(B)V", line = 8)
    public static final void method2524(byte arg0) {
        field6249++;
        class420 var1 = (class420) class441.field6525.method2818((byte) -13);
        int var2 = 94 % ((arg0 + 83) / 35);
        while (var1 != null) {
            if (class89.field1305 == null) {
                var1.method1565(0);
            } else if (var1.field6143 <= class441.field6516) {
                int var15 = class258.field3594[var1.field6150];
                if (var15 == 0) {
                    class90 var16 = class176.method1135(var1.field6152, var1.field6142, var1.field6146);
                    if (var16 instanceof class372) {
                        class485.method2851(var1.field6152, var1.field6142, var1.field6146);
                        class372 var17 = (class372) var16;
                        if (var17.field5440 != null) {
                            class65.method560(var1.field6152, var1.field6142, var1.field6146, var17.field5440, null);
                        }
                    }
                } else if (var15 == 1) {
                    class147 var18 = class131.method899(var1.field6152, var1.field6142, var1.field6146);
                    if (var18 instanceof class158) {
                        class424.method2521(var1.field6152, var1.field6142, var1.field6146);
                        class158 var19 = (class158) var18;
                        if (var19.field2389 != null) {
                            class79.method639(var1.field6152, var1.field6142, var1.field6146, var19.field2389, null);
                        }
                    }
                } else if (var15 == 2) {
                    class116 var20 = class38.method295(var1.field6152, var1.field6142, var1.field6146, field6250 == null ? (field6250 = method2526("jn")) : field6250);
                    if (var20 instanceof class418) {
                        class224.method1393(var1.field6152, var1.field6142, var1.field6146, field6250 == null ? (field6250 = method2526("jn")) : field6250);
                        class418 var21 = (class418) var20;
                        if (var21.field6066 != null) {
                            class51.method449(var21.field6066, false);
                        }
                    }
                } else if (var15 == 3) {
                    class117 var22 = class509.method3048(var1.field6152, var1.field6142, var1.field6146);
                    if (var22 instanceof class377) {
                        class116.method828(var1.field6152, var1.field6142, var1.field6146);
                        class377 var23 = (class377) var22;
                        if (var23.field5520 != null) {
                            class439.method2609(var1.field6152, var1.field6142, var1.field6146, var23.field5520);
                        }
                    }
                }
                var1.method1565(0);
            } else if (class441.field6516 == var1.field6140) {
                int var3 = class258.field3594[var1.field6150];
                if (var3 == 0) {
                    class90 var13 = class176.method1135(var1.field6152, var1.field6142, var1.field6146);
                    if (var13 instanceof class372) {
                        var1.method1565(0);
                    } else if (class61.method502(var1.field6152, var1.field6142, var1.field6146) == null) {
                        class372 var14 = new class372(var1.field6150, var1.field6133, var1.field6141, var1.field6135, var1.field6139, var13);
                        class65.method560(var1.field6152, var1.field6142, var1.field6146, var14, null);
                    } else {
                        var1.method1565(0);
                    }
                } else if (var3 == 1) {
                    class147 var11 = class131.method899(var1.field6152, var1.field6142, var1.field6146);
                    if (var11 instanceof class158) {
                        var1.method1565(0);
                    } else if (class476.method2794(var1.field6152, var1.field6142, var1.field6146) == null) {
                        class158 var12 = new class158(var1.field6150, var1.field6133, var1.field6141, var1.field6135, var1.field6139, var11);
                        class79.method639(var1.field6152, var1.field6142, var1.field6146, var12, null);
                    } else {
                        var1.method1565(0);
                    }
                } else if (var3 == 2) {
                    class116 var4 = class38.method295(var1.field6152, var1.field6142, var1.field6146, field6250 == null ? (field6250 = method2526("jn")) : field6250);
                    if (var4 instanceof class418) {
                        var1.method1565(0);
                    } else {
                        class224.method1393(var1.field6152, var1.field6142, var1.field6146, field6250 == null ? (field6250 = method2526("jn")) : field6250);
                        class220 var5 = class78.field1141.method2103(var1.field6144, true);
                        int var6;
                        int var7;
                        if (var1.field6133 == 1 || var1.field6133 == 3) {
                            var7 = var5.field3118;
                            var6 = var5.field3143;
                        } else {
                            var6 = var5.field3118;
                            var7 = var5.field3143;
                        }
                        class418 var8 = new class418(var1.field6150, var1.field6133, var1.field6152, var1.field6141, var1.field6135, var1.field6139, var1.field6142, var1.field6142 + var7 - 1, var1.field6146, var1.field6146 - (1 - var6), var4);
                        class51.method449(var8, false);
                    }
                } else if (var3 == 3) {
                    class117 var9 = class509.method3048(var1.field6152, var1.field6142, var1.field6146);
                    if (var9 instanceof class377) {
                        var1.method1565(0);
                    } else {
                        class377 var10 = new class377(var1.field6141, var1.field6135, var1.field6139, var9);
                        class439.method2609(var1.field6152, var1.field6142, var1.field6146, var10);
                    }
                }
            }
            var1 = (class420) class441.field6525.method2820((byte) -58);
        }
    }

    @OriginalMember(owner = "client!re", name = "c", descriptor = "(B)V", line = 220)
    public static void method2525(byte arg0) {
        if (arg0 != -53) {
            method2525((byte) -19);
        }
        field6248 = null;
    }
}
