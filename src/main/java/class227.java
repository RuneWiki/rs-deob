import jaggl.OpenGL;
import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public abstract class class227 {

    @OriginalMember(owner = "client!ng", name = "e", descriptor = "I")
    private int field3224;

    @OriginalMember(owner = "client!ng", name = "d", descriptor = "Z")
    private boolean field3223;

    @OriginalMember(owner = "client!ng", name = "h", descriptor = "Lef;")
    public class338 field3227;

    @OriginalMember(owner = "client!ng", name = "i", descriptor = "I")
    private int field3228;

    @OriginalMember(owner = "client!ng", name = "g", descriptor = "I")
    public int field3226;

    @OriginalMember(owner = "client!ng", name = "l", descriptor = "Lqp;")
    public static class466 field3231 = new class466("Loaded textures", "Texturen geladen.", "Textures chargées", "Texturas carregadas");

    @OriginalMember(owner = "client!ng", name = "n", descriptor = "Lht;")
    public static class410 field3233 = new class410();

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "I")
    public static int field3220;

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "I")
    public static int field3221;

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "I")
    public static int field3222;

    @OriginalMember(owner = "client!ng", name = "f", descriptor = "I")
    public static int field3225;

    @OriginalMember(owner = "client!ng", name = "j", descriptor = "I")
    public static int field3229;

    @OriginalMember(owner = "client!ng", name = "k", descriptor = "I")
    public static int field3230;

    @OriginalMember(owner = "client!ng", name = "m", descriptor = "Lim;")
    public static class402 field3232;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ng", name = "o", descriptor = "Ljava/lang/Class;")
    public static Class field3234;

    @OriginalMember(owner = "client!ng", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field3227.method1979(-92, this.field3228, this.field3226);
        field3225++;
        super.finalize();
    }

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "(B)V")
    public abstract void method108(byte arg0);

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "(B)V")
    public static void method1409(byte arg0) {
        field3232 = null;
        field3233 = null;
        if (arg0 != 51) {
            field3231 = null;
        }
        field3231 = null;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIIZIIII)V")
    public static final void method1410(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7) {
        if (!arg3) {
            return;
        }
        field3220++;
        if (arg4 < 0 || arg5 < 0 || class527.field7799 - 1 <= arg4 || class422.field6182 - 1 <= arg5) {
            return;
        }
        if (class89.field1305 == null) {
            return;
        }
        if (arg6 != 0) {
            if (arg6 == 1) {
                class503 var10 = (class503) class131.method899(arg7, arg4, arg5);
                if (var10 == null) {
                    return;
                }
                if (!(var10 instanceof class317)) {
                    int var11 = var10.method490(-29679);
                    if (arg0 != 4 && arg0 != 5) {
                        if (arg0 == 6) {
                            class333.method1915(arg7, var11, arg4, arg1, arg5, arg2 + 4, arg6, (byte) 121, 4);
                        } else if (arg0 == 7) {
                            class333.method1915(arg7, var11, arg4, arg1, arg5, (arg2 + 2 & 0x3) + 4, arg6, (byte) 29, 4);
                            return;
                        } else if (arg0 == 8) {
                            class333.method1915(arg7, var11, arg4, arg1, arg5, arg2 + 4, arg6, (byte) -116, 4);
                            class333.method1915(arg7, var11, arg4, arg1, arg5, (arg2 + 2 & 0x3) + 4, arg6, (byte) -124, 4);
                            return;
                        }
                        return;
                    }
                    class333.method1915(arg7, var11, arg4, arg1, arg5, arg2, arg6, (byte) 127, 4);
                    return;
                }
                ((class317) var10).field4348.method1678(125, arg1);
                return;
            }
            if (arg6 == 2) {
                class503 var8 = (class503) class38.method295(arg7, arg4, arg5, field3234 == null ? (field3234 = method1415("jn")) : field3234);
                if (var8 != null) {
                    if (arg0 == 11) {
                        arg0 = 10;
                    }
                    if (!(var8 instanceof class253)) {
                        class333.method1915(arg7, var8.method490(-29679), arg4, arg1, arg5, arg2, arg6, (byte) -119, arg0);
                        return;
                    }
                    ((class253) var8).field3521.method1678(-28, arg1);
                    return;
                }
            } else if (arg6 == 3) {
                class503 var9 = (class503) class509.method3048(arg7, arg4, arg5);
                if (var9 == null) {
                    return;
                }
                if (var9 instanceof class267) {
                    ((class267) var9).field3687.method1678(-5, arg1);
                    return;
                }
                class333.method1915(arg7, var9.method490(-29679), arg4, arg1, arg5, arg2, arg6, (byte) -119, arg0);
            } else {
                return;
            }
            return;
        }
        class503 var12 = (class503) class176.method1135(arg7, arg4, arg5);
        class503 var13 = (class503) class61.method502(arg7, arg4, arg5);
        if (var12 != null && arg0 != 2) {
            if (var12 instanceof class125) {
                ((class125) var12).field1862.method1678(-96, arg1);
            } else {
                class333.method1915(arg7, var12.method490(-29679), arg4, arg1, arg5, arg2, arg6, (byte) -126, arg0);
            }
        }
        if (var13 == null) {
            return;
        }
        if (var13 instanceof class125) {
            ((class125) var13).field1862.method1678(125, arg1);
            return;
        }
        class333.method1915(arg7, var13.method490(-29679), arg4, arg1, arg5, arg2, arg6, (byte) 70, arg0);
        return;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IZ)V")
    public static final void method1411(int arg0, boolean arg1) {
        if (arg0 != 35044) {
            field3233 = null;
        }
        if (arg1) {
            if (class188.field2723 != -1) {
                class265.method1587((byte) -119, class188.field2723);
            }
            for (class295 var2 = (class295) class212.field2960.method1494(0); var2 != null; var2 = (class295) class212.field2960.method1493((byte) 72)) {
                if (!var2.method1564(4)) {
                    var2 = (class295) class212.field2960.method1494(arg0 - 35044);
                    if (var2 == null) {
                        break;
                    }
                }
                class51.method447(var2, true, true, false);
            }
            class188.field2723 = -1;
            class212.field2960 = new class247(8);
            class340.method2024((byte) 124);
            class188.field2723 = class489.field7137;
            class210.method1298(-98, false);
            class361.method2180(true);
            class429.method2548(class188.field2723);
        }
        field3221++;
        class172.method1120(0);
        class226.field3209 = -1;
        class66.method567(79, class297.field4078);
        class316.field4324 = new class438();
        class316.field4324.field1732 = class527.field7799 * 128 / 2;
        class316.field4324.field1735 = class422.field6182 * 128 / 2;
        class316.field4324.field1127[0] = class527.field7799 / 2;
        class316.field4324.field1117[0] = class422.field6182 / 2;
        class373.field5478 = 0;
        class329.field4493 = 0;
        if (class491.field7168 == 2) {
            class329.field4493 = class309.field4203 << 7;
            class373.field5478 = class501.field7377 << 7;
        } else {
            class341.method2027(-31193);
        }
        class136.method920((byte) -1);
        if (class329.field4493 == 0 || class373.field5478 == 0) {
            class448.method2651(10, (byte) 112);
        } else {
            class175.method1129(true);
            class448.method2651(28, (byte) 112);
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(I[BZ)V")
    public final void method1412(int arg0, byte[] arg1, boolean arg2) {
        field3229++;
        if (arg2) {
            this.method108((byte) 126);
        }
        this.method108((byte) -100);
        if (arg0 > this.field3228) {
            OpenGL.glBufferDataARBub(this.field3224, arg0, arg1, 0, this.field3223 ? 35040 : 35044);
            this.field3227.field4759 += arg0 - this.field3228;
            this.field3228 = arg0;
        } else {
            OpenGL.glBufferSubDataARB(this.field3224, 0, arg0, arg1, 0);
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(II)V")
    public static final void method1413(int arg0, int arg1) {
        field3222++;
        class502.field7402 = arg1;
        class162 var2 = class345.field4953;
        synchronized (class345.field4953) {
            if (arg0 != 1153) {
                field3231 = null;
            }
            class345.field4953.method1068(0);
        }
        class162 var3 = class528.field7803;
        synchronized (class528.field7803) {
            class528.field7803.method1068(0);
        }
    }

    @OriginalMember(owner = "client!ng", name = "<init>", descriptor = "(Lef;I[BIZ)V")
    public class227(class338 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        this.field3224 = arg1;
        this.field3223 = arg4;
        this.field3227 = arg0;
        this.field3228 = arg3;
        OpenGL.glGenBuffersARB(1, class299.field4101, 0);
        this.field3226 = class299.field4101[0];
        this.method108((byte) -48);
        OpenGL.glBufferDataARBub(arg1, this.field3228, arg2, 0, this.field3223 ? 35040 : 35044);
        this.field3227.field4759 += this.field3228;
    }

    @OriginalMember(owner = "client!ng", name = "<init>", descriptor = "(Lef;ILjaggl/memory/NativeBuffer;IZ)V")
    public class227(class338 arg0, int arg1, NativeBuffer arg2, int arg3, boolean arg4) {
        this.field3228 = arg3;
        this.field3224 = arg1;
        this.field3223 = arg4;
        this.field3227 = arg0;
        OpenGL.glGenBuffersARB(1, class299.field4101, 0);
        this.field3226 = class299.field4101[0];
        this.method108((byte) 105);
        OpenGL.glBufferDataARBa(arg1, this.field3228, arg2.method2592(), this.field3223 ? 35040 : 35044);
        this.field3227.field4759 += this.field3228;
    }

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "(I)V")
    public static final void method1414(int arg0) {
        field3230++;
        if (class373.field5480) {
            return;
        }
        class446.method2646((byte) 109, class485.field7086);
        if (class382.field5586 != null) {
            class446.method2646((byte) 105, class382.field5586);
        }
        class373.field5480 = true;
        if (arg0 != -4) {
            field3231 = null;
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1415(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
