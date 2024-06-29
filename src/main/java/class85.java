import java.lang.reflect.Method;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hn")
public class class85 {

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "Z")
    public boolean field1142 = false;

    @OriginalMember(owner = "client!hn", name = "d", descriptor = "I")
    public int field1144 = 64;

    @OriginalMember(owner = "client!hn", name = "e", descriptor = "I")
    public int field1145 = 1;

    @OriginalMember(owner = "client!hn", name = "j", descriptor = "I")
    public int field1150 = 64;

    @OriginalMember(owner = "client!hn", name = "f", descriptor = "Z")
    public boolean field1146 = false;

    @OriginalMember(owner = "client!hn", name = "i", descriptor = "I")
    public int field1149 = -1;

    @OriginalMember(owner = "client!hn", name = "m", descriptor = "I")
    public int field1153 = 2;

    @OriginalMember(owner = "client!hn", name = "k", descriptor = "Lvt;")
    public static class344 field1151 = new class344("Loading shaders", "Lade shaders", "Chargement des nuanceurs", "Carregando sombreamento - ");

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "I")
    public static int field1141;

    @OriginalMember(owner = "client!hn", name = "c", descriptor = "I")
    public static int field1143;

    @OriginalMember(owner = "client!hn", name = "g", descriptor = "I")
    public static int field1147;

    @OriginalMember(owner = "client!hn", name = "h", descriptor = "I")
    public static int field1148;

    @OriginalMember(owner = "client!hn", name = "l", descriptor = "I")
    public static int field1152;

    @OriginalMember(owner = "client!hn", name = "n", descriptor = "I")
    public static int field1154;

    // $FF: synthetic field
    @OriginalMember(owner = "client!hn", name = "p", descriptor = "Ljava/lang/Class;")
    public static Class field1156;

    @OriginalMember(owner = "client!hn", name = "o", descriptor = "Z")
    public static boolean field1155;

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(IB)[B")
    public static final byte[] method478(int arg0, byte arg1) {
        field1147++;
        class1 var2 = (class1) class568.field7953.method2995(791, (long) arg0);
        if (var2 == null) {
            byte[] var3 = new byte[512];
            Random var4 = new Random((long) arg0);
            for (int var5 = 0; var5 < 255; var5++) {
                var3[var5] = (byte) var5;
            }
            for (int var6 = 0; var6 < 255; var6++) {
                int var7 = 255 - var6;
                int var8 = class585.method3373(var4, true, var7);
                byte var9 = var3[var8];
                var3[var8] = var3[var7];
                var3[var7] = var3[511 - var6] = var9;
            }
            var2 = new class1(var3);
            class568.field7953.method2993(0, var2, (long) arg0);
        }
        int var10 = -114 / ((50 - arg1) / 33);
        return var2.field1;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(I)V")
    public static void method479(int arg0) {
        if (arg0 == 96) {
            field1151 = null;
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(Z)V")
    public static final void method480(boolean arg0) {
        if (class279.field3639 == 2) {
            class282.field3697 = 96;
        } else {
            try {
                Method var1 = (field1156 == null ? (field1156 = method485("java.lang.Runtime")) : field1156).getMethod("maxMemory");
                if (var1 != null) {
                    try {
                        Runtime var2 = Runtime.getRuntime();
                        Long var3 = (Long) var1.invoke(var2, (Object[]) null);
                        class282.field3697 = (int) (var3 / 1048576L) + 1;
                    } catch (Throwable var4) {
                    }
                }
            } catch (Exception var5) {
            }
        }
        if (arg0) {
            method479(116);
        }
        field1154++;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(BIIII)V")
    public static final void method481(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < -98) {
            if (class501.field6954.field7856 != 0 && arg4 != 0 && class369.field5138 < 50 && arg1 != -1) {
                class172.field2225[class369.field5138++] = new class201((byte) 2, arg1, arg4, arg3, arg2, 0);
            }
            field1152++;
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(ILge;II)V")
    private final void method482(int arg0, class551 arg1, int arg2, int arg3) {
        if (arg3 > -12) {
            return;
        }
        if (arg0 == 1) {
            this.field1149 = arg1.method3090(-70);
            if (this.field1149 == 65535) {
                this.field1149 = -1;
            }
        } else if (arg0 == 2) {
            this.field1144 = arg1.method3090(-125) + 1;
            this.field1150 = arg1.method3090(-114) + 1;
        } else if (arg0 == 3) {
            arg1.method3051((byte) 103);
        } else if (arg0 == 4) {
            this.field1153 = arg1.method3045(-127);
        } else if (arg0 == 5) {
            this.field1145 = arg1.method3045(-126);
        } else if (arg0 == 6) {
            this.field1142 = true;
        } else if (arg0 == 7) {
            this.field1146 = true;
        }
        field1148++;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(III)V")
    public static final void method483(int arg0, int arg1, int arg2) {
        field1143++;
        class632 var3 = class641.method3699(-114, 13, arg2);
        var3.method3656(0);
        var3.field9198 = arg0;
        if (arg1 < 24) {
            field1151 = null;
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(Lge;II)V")
    public final void method484(class551 arg0, int arg1, int arg2) {
        while (true) {
            int var4 = arg0.method3045(-126);
            if (var4 == 0) {
                field1141++;
                if (arg2 != 16843) {
                    this.field1153 = 75;
                    return;
                }
                return;
            }
            this.method482(var4, arg0, arg1, -118);
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method485(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
