import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oq")
public class class205 {

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "I")
    public static int field2646;

    @OriginalMember(owner = "client!oq", name = "b", descriptor = "I")
    public static int field2647;

    // $FF: synthetic field
    @OriginalMember(owner = "client!oq", name = "c", descriptor = "Ljava/lang/Class;")
    public static Class field2648;

    // $FF: synthetic method
    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method1325(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(I)V", line = 3)
    public static final void method1323(int arg0) {
        int var1 = -52 / ((arg0 + 10) / 47);
        for (class535 var2 = (class535) class141.field1854.method2090(true); var2 != null; var2 = (class535) class141.field1854.method2088(-152)) {
            if (class483.field6438 == null) {
                var2.method2438((byte) 119);
            } else if (class424.field5503 >= var2.field6969) {
                int var3 = class367.field4731[var2.field6964];
                if (var3 == 0) {
                    class17 var4 = class549.method2909(var2.field6966, var2.field6963, var2.field6974);
                    if (var4 instanceof class13) {
                        class62.method526(var2.field6966, var2.field6963, var2.field6974);
                        class13 var5 = (class13) var4;
                        if (var5.field128 != null) {
                            class133.method966(var2.field6966, var2.field6963, var2.field6974, var5.field128, null);
                        }
                    }
                } else if (var3 == 1) {
                    class237 var6 = class186.method1237(var2.field6966, var2.field6963, var2.field6974);
                    if (var6 instanceof class550) {
                        class126.method921(var2.field6966, var2.field6963, var2.field6974);
                        class550 var7 = (class550) var6;
                        if (var7.field7141 != null) {
                            class577.method3161(var2.field6966, var2.field6963, var2.field6974, var7.field7141, null);
                        }
                    }
                } else if (var3 == 2) {
                    class34 var8 = class47.method432(var2.field6966, var2.field6963, var2.field6974, field2648 == null ? (field2648 = method1325("ut")) : field2648);
                    if (var8 instanceof class166) {
                        class650.method3575(var2.field6966, var2.field6963, var2.field6974, field2648 == null ? (field2648 = method1325("ut")) : field2648);
                        class166 var9 = (class166) var8;
                        if (var9.field2075 != null) {
                            class587.method3203(var9.field2075, false);
                        }
                    }
                } else if (var3 == 3) {
                    class152 var10 = class377.method2155(var2.field6966, var2.field6963, var2.field6974);
                    if (var10 instanceof class469) {
                        class648.method3567(var2.field6966, var2.field6963, var2.field6974);
                        class469 var11 = (class469) var10;
                        if (var11.field6121 != null) {
                            class45.method422(var2.field6966, var2.field6963, var2.field6974, var11.field6121);
                        }
                    }
                }
                var2.method2438((byte) 107);
            } else if (class424.field5503 == var2.field6967) {
                int var12 = class367.field4731[var2.field6964];
                if (var12 == 0) {
                    class17 var22 = class549.method2909(var2.field6966, var2.field6963, var2.field6974);
                    if (var22 instanceof class13) {
                        var2.method2438((byte) 13);
                    } else if (class303.method1775(var2.field6966, var2.field6963, var2.field6974) == null) {
                        class13 var23 = new class13(var2.field6964, var2.field6976, var2.field6957, var2.field6961, var2.field6970, var22);
                        class133.method966(var2.field6966, var2.field6963, var2.field6974, var23, null);
                    } else {
                        var2.method2438((byte) -106);
                    }
                } else if (var12 == 1) {
                    class237 var13 = class186.method1237(var2.field6966, var2.field6963, var2.field6974);
                    if (var13 instanceof class550) {
                        var2.method2438((byte) -119);
                    } else if (class619.method3376(var2.field6966, var2.field6963, var2.field6974) == null) {
                        class550 var14 = new class550(var2.field6964, var2.field6976, var2.field6957, var2.field6961, var2.field6970, var13);
                        class577.method3161(var2.field6966, var2.field6963, var2.field6974, var14, null);
                    } else {
                        var2.method2438((byte) -77);
                    }
                } else if (var12 == 2) {
                    class34 var17 = class47.method432(var2.field6966, var2.field6963, var2.field6974, field2648 == null ? (field2648 = method1325("ut")) : field2648);
                    if (var17 instanceof class166) {
                        var2.method2438((byte) 1);
                    } else {
                        class650.method3575(var2.field6966, var2.field6963, var2.field6974, field2648 == null ? (field2648 = method1325("ut")) : field2648);
                        class698 var18 = class348.field4436.method1900(-114, var2.field6971);
                        int var19;
                        int var20;
                        if (var2.field6976 == 1 || var2.field6976 == 3) {
                            var19 = var18.field9589;
                            var20 = var18.field9654;
                        } else {
                            var19 = var18.field9654;
                            var20 = var18.field9589;
                        }
                        class166 var21 = new class166(var2.field6964, var2.field6976, var2.field6966, var2.field6957, var2.field6961, var2.field6970, var2.field6963, var2.field6963 + var20 - 1, var2.field6974, var2.field6974 + var19 - 1, var17);
                        class587.method3203(var21, false);
                    }
                } else if (var12 == 3) {
                    class152 var15 = class377.method2155(var2.field6966, var2.field6963, var2.field6974);
                    if (var15 instanceof class469) {
                        var2.method2438((byte) 109);
                    } else {
                        class469 var16 = new class469(var2.field6957, var2.field6961, var2.field6970, var15);
                        class45.method422(var2.field6966, var2.field6963, var2.field6974, var16);
                    }
                }
            }
        }
        field2647++;
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(B)Ljm;", line = 215)
    public static final class395 method1324(byte arg0) {
        if (arg0 > -12) {
            return null;
        }
        field2646++;
        try {
            return (class395) Class.forName("ci").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }
}
