import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class633 {

    @OriginalMember(owner = "client!cc", name = "g", descriptor = "I")
    public int field9114;

    @OriginalMember(owner = "client!cc", name = "i", descriptor = "Lea;")
    public static class474 field9116;

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "F")
    public static float field9112;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "I")
    public static int field9108;

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "I")
    public static int field9110;

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "I")
    public static int field9111;

    @OriginalMember(owner = "client!cc", name = "f", descriptor = "I")
    public static int field9113;

    @OriginalMember(owner = "client!cc", name = "h", descriptor = "I")
    public static int field9115;

    // $FF: synthetic field
    @OriginalMember(owner = "client!cc", name = "j", descriptor = "Ljava/lang/Class;")
    public static Class field9117;

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "[Lxa;")
    public static class433[] field9109;

    // $FF: synthetic method
    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method3618(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    static {
        new class474("From", "Von:", "De", "De");
        new class474("Unable to send abuse report - system busy.", "Meldung konnte nicht gesendet werden - Systeme überlastet", "Impossible de signaler un abus - Erreur système", "Sistema ocupado. Não foi possível enviar sua denúncia de abuso.");
        field9116 = new class474("Loaded core fonts", "Schriftarten geladen", "Polices chargées", "Fontes principais carregadas");
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(ZII)Z", line = 5)
    public static final boolean method3613(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            field9109 = null;
        }
        field9108++;
        return (arg1 & 0x70000) != 0 | class155.method902(-94, arg2, arg1) || class489.method2938(arg1, arg2, -20661);
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)V", line = 18)
    public static final void method3614(int arg0) {
        try {
            if (arg0 != 0) {
                field9116 = null;
            }
            Method var1 = (field9117 == null ? (field9117 = method3618("java.lang.Runtime")) : field9117).getMethod("availableProcessors");
            if (var1 != null) {
                try {
                    Runtime var2 = Runtime.getRuntime();
                    Integer var3 = (Integer) var1.invoke(var2, (Object[]) null);
                    class510.field7466 = var3;
                } catch (Throwable var4) {
                }
            }
        } catch (Exception var5) {
        }
        field9113++;
    }

    @OriginalMember(owner = "client!cc", name = "toString", descriptor = "()Ljava/lang/String;", line = 45)
    public final String toString() {
        field9110++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(I)V", line = 56)
    public static void method3615(int arg0) {
        field9109 = null;
        if (arg0 == 2132) {
            field9116 = null;
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIBZIILkea;)V", line = 67)
    public static final void method3616(int arg0, int arg1, byte arg2, boolean arg3, int arg4, int arg5, class203 arg6) {
        class438.field6508 = arg3;
        class22.field221 = arg4;
        field9111++;
        class509.field7411 = arg1;
        class332.field4779 = arg0;
        class190.field2345 = arg5;
        if (arg2 < 66) {
            field9116 = null;
        }
        class195.field2647 = arg6;
        class568.field8160 = 1;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(BLeca;[I[I[I)V", line = 88)
    public static final void method3617(byte arg0, class655 arg1, int[] arg2, int[] arg3, int[] arg4) {
        if (arg0 != -123) {
            return;
        }
        for (int var5 = 0; var5 < arg3.length; var5++) {
            int var6 = arg3[var5];
            int var7 = arg2[var5];
            int var8 = arg4[var5];
            for (int var9 = 0; var7 != 0 && arg1.field2428.length > var9; var9++) {
                if ((var7 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg1.field2428[var9] = null;
                    } else {
                        class177 var10 = class259.field3686.method2961(var6, 8);
                        int var11 = var10.field2160;
                        class283 var12 = arg1.field2428[var9];
                        if (var12 != null) {
                            if (var12.field3928 == var6) {
                                if (var11 == 0) {
                                    var12 = arg1.field2428[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field3926 = 1;
                                    var12.field3927 = 0;
                                    var12.field3930 = 0;
                                    var12.field3932 = var8;
                                    var12.field3929 = 0;
                                    class405.method2571(class439.field6548 == arg1, arg1.field1764, -37, arg1.field1768, arg1.field1757, var10, 0);
                                } else if (var11 == 2) {
                                    var12.field3927 = 0;
                                }
                            } else if (var10.field2161 >= class259.field3686.method2961(var12.field3928, 8).field2161) {
                                var12 = arg1.field2428[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class283 var13 = arg1.field2428[var9] = new class283();
                            var13.field3930 = 0;
                            var13.field3928 = var6;
                            var13.field3927 = 0;
                            var13.field3929 = 0;
                            var13.field3926 = 1;
                            var13.field3932 = var8;
                            class405.method2571(class439.field6548 == arg1, arg1.field1764, -96, arg1.field1768, arg1.field1757, var10, 0);
                        }
                    }
                }
                var7 >>>= 0x1;
            }
        }
        field9115++;
    }

    @OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(II)V", line = 185)
    public class633(int arg0, int arg1) {
        this.field9114 = arg0;
    }
}
