import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public abstract class class230 {

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "Z")
    public static boolean field3098 = true;

    @OriginalMember(owner = "client!ue", name = "f", descriptor = "[I")
    public static int[] field3102 = new int[14];

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "Leh;")
    public static class360 field3099 = new class360();

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "I")
    public static int field3097;

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "I")
    public static int field3100;

    @OriginalMember(owner = "client!ue", name = "e", descriptor = "I")
    public static int field3101;

    @OriginalMember(owner = "client!ue", name = "g", descriptor = "I")
    public int field3103;

    @OriginalMember(owner = "client!ue", name = "h", descriptor = "Ljb;")
    public static class493 field3104;

    @OriginalMember(owner = "client!ue", name = "i", descriptor = "Ljava/lang/String;")
    public String field3105;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(I[BIIBI)Z", line = 3)
    public static final boolean method1490(int arg0, byte[] arg1, int arg2, int arg3, byte arg4, int arg5) {
        field3097++;
        boolean var6 = true;
        class675 var7 = new class675(arg1);
        if (arg4 > -69) {
            field3104 = null;
        }
        int var8 = -1;
        label74: while (true) {
            int var9 = var7.method3755(-2);
            if (var9 == 0) {
                return var6;
            }
            var8 += var9;
            int var10 = 0;
            boolean var11 = false;
            while (true) {
                int var15;
                class10 var18;
                do {
                    int var16;
                    int var17;
                    do {
                        do {
                            do {
                                do {
                                    while (var11) {
                                        int var19 = var7.method3693(98);
                                        if (var19 == 0) {
                                            continue label74;
                                        }
                                        var7.method3750((byte) 35);
                                    }
                                    int var12 = var7.method3693(-59);
                                    if (var12 == 0) {
                                        continue label74;
                                    }
                                    var10 += var12 - 1;
                                    int var13 = var10 & 0x3F;
                                    int var14 = (var10 & 0xFE3) >> 6;
                                    var15 = var7.method3750((byte) 35) >> 2;
                                    var16 = arg5 + var14;
                                    var17 = arg3 + var13;
                                } while (var16 <= 0);
                            } while (var17 <= 0);
                        } while (var16 >= arg0 - 1);
                    } while ((arg2 - 1) <= var17);
                    var18 = class612.field8588.method558((byte) -79, var8);
                } while (var15 == 22 && class557.field7812.field6528.method3559(false) == 0 && var18.field207 == 0 && var18.field228 != 1 && !var18.field147);
                if (!var18.method64(-73)) {
                    class166.field2281++;
                    var6 = false;
                }
                var11 = true;
            }
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(B)Ljava/net/Socket;", line = 91)
    public final Socket method1492(byte arg0) throws IOException {
        if (arg0 <= 18) {
            method1490(-69, null, 70, -59, (byte) -100, -38);
        }
        field3100++;
        return new Socket(this.field3105, this.field3103);
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Lfp;ZLvc;)V", line = 110)
    public static final void method1493(class323 arg0, boolean arg1, class316 arg2) {
        class699.field9760 = "";
        class506.field7250 = arg2;
        if (!arg1) {
            field3102 = null;
        }
        field3101++;
        class552.field7763 = arg0;
        if (class436.field6191.startsWith("win")) {
            class699.field9760 = class699.field9760 + "windows/";
        } else if (class436.field6191.startsWith("linux")) {
            class699.field9760 = class699.field9760 + "linux/";
        } else if (class436.field6191.startsWith("mac")) {
            class699.field9760 = class699.field9760 + "macos/";
        }
        if (class506.field7250.field4367) {
            class699.field9760 = class699.field9760 + "msjava/";
        } else if (class436.field6187.startsWith("amd64") || class436.field6187.startsWith("x86_64")) {
            class699.field9760 = class699.field9760 + "x86_64/";
        } else if (class436.field6187.startsWith("i386") || class436.field6187.startsWith("i486") || class436.field6187.startsWith("i586") || class436.field6187.startsWith("x86")) {
            class699.field9760 = class699.field9760 + "x86/";
        } else if (class436.field6187.startsWith("ppc")) {
            class699.field9760 = class699.field9760 + "ppc/";
        } else {
            class699.field9760 = class699.field9760 + "universal/";
        }
    }

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "(I)V", line = 169)
    public static void method1494(int arg0) {
        if (arg0 == 4067) {
            field3104 = null;
            field3102 = null;
            field3099 = null;
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(I)Ljava/net/Socket;")
    public abstract Socket method1491(int arg0) throws IOException;
}
