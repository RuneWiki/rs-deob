import jaggl.OpenGL;
import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public abstract class class120 {

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "Z")
    private boolean field1651;

    @OriginalMember(owner = "client!ei", name = "h", descriptor = "I")
    private int field1657;

    @OriginalMember(owner = "client!ei", name = "g", descriptor = "Lih;")
    public class503 field1656;

    @OriginalMember(owner = "client!ei", name = "e", descriptor = "I")
    private int field1654;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "I")
    public int field1650;

    @OriginalMember(owner = "client!ei", name = "k", descriptor = "I")
    public static int field1660;

    @OriginalMember(owner = "client!ei", name = "l", descriptor = "I")
    public static int field1661;

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "I")
    public static int field1652;

    @OriginalMember(owner = "client!ei", name = "d", descriptor = "I")
    public static int field1653;

    @OriginalMember(owner = "client!ei", name = "f", descriptor = "I")
    public static int field1655;

    @OriginalMember(owner = "client!ei", name = "i", descriptor = "I")
    public static int field1658;

    @OriginalMember(owner = "client!ei", name = "j", descriptor = "I")
    public static int field1659;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(BB)C")
    public static final char method805(byte arg0, byte arg1) {
        field1658++;
        int var2 = arg0 & 0xFF;
        if (arg1 > -14) {
            return (char) 65534;
        } else if (var2 == 0) {
            throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(var2, 16) + " provided");
        } else {
            if (var2 >= 128 && var2 < 160) {
                char var3 = class422.field5954[var2 - 128];
                if (var3 == '\u0000') {
                    var3 = '?';
                }
                var2 = var3;
            }
            return (char) var2;
        }
    }

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "(B)V")
    public abstract void method451(byte arg0);

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(Leq;Z)Z")
    public static final boolean method806(class144 arg0, boolean arg1) {
        boolean var2 = class60.field743 == class330.field4818;
        int var3 = 0;
        short var4 = 0;
        byte var5 = 0;
        arg0.method893(32107);
        if (arg0.field1911 < 0 || arg0.field1902 < 0 || arg0.field1898 >= class6.field109 || arg0.field1907 >= class272.field4032) {
            return false;
        }
        for (int var6 = arg0.field1911; var6 <= arg0.field1898; var6++) {
            for (int var9 = arg0.field1902; var9 <= arg0.field1907; var9++) {
                class239 var10 = class104.method713(arg0.field1904, var6, var9);
                if (var10 != null) {
                    int var11 = 0;
                    if (var6 > arg0.field1911) {
                        var11++;
                    }
                    if (var6 < arg0.field1898) {
                        var11 += 4;
                    }
                    if (var9 > arg0.field1902) {
                        var11 += 8;
                    }
                    if (var9 < arg0.field1907) {
                        var11 += 2;
                    }
                    class134 var12 = class194.method1230(var11, 0, arg0);
                    class134 var13 = var10.field3482;
                    if (var13 == null) {
                        var10.field3482 = var12;
                    } else {
                        while (var13.field1755 != null) {
                            var13 = var13.field1755;
                        }
                        var13.field1755 = var12;
                    }
                    var10.field3486 = (byte) (var10.field3486 | var11);
                    if (var2 && (class429.field6048[var6][var9] & 0xFF000000) != 0) {
                        var3 = class429.field6048[var6][var9];
                        var4 = class211.field3059[var6][var9];
                        var5 = class261.field3858[var6][var9];
                    }
                }
            }
        }
        if (var2 && (var3 & 0xFF000000) != 0) {
            for (int var7 = arg0.field1911; var7 <= arg0.field1898; var7++) {
                for (int var8 = arg0.field1902; var8 <= arg0.field1907; var8++) {
                    if ((class429.field6048[var7][var8] & 0xFF000000) == 0) {
                        class429.field6048[var7][var8] = var3;
                        class211.field3059[var7][var8] = var4;
                        class261.field3858[var7][var8] = var5;
                    }
                }
            }
        }
        if (arg1) {
            class521.field7661[class222.field3184++] = arg0;
        }
        return true;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(II)Z")
    public static final boolean method807(int arg0, int arg1) {
        field1653++;
        if (class401.field5640[arg1]) {
            return true;
        } else if (class218.field3157.method445(arg1, (byte) 104)) {
            int var2 = class218.field3157.method435(arg1, 0);
            if (var2 == 0) {
                class401.field5640[arg1] = true;
                return true;
            }
            if (class494.field6988[arg1] == null) {
                class494.field6988[arg1] = new class150[var2];
            }
            int var3 = 0;
            if (arg0 != -8810) {
                field1661 = 76;
            }
            while (var2 > var3) {
                if (class494.field6988[arg1][var3] == null) {
                    byte[] var4 = class218.field3157.method426(arg1, (byte) 9, var3);
                    if (var4 != null) {
                        class150 var5 = class494.field6988[arg1][var3] = new class150();
                        var5.field2134 = (arg1 << 16) + var3;
                        if (var4[0] != -1) {
                            throw new IllegalStateException("if1");
                        }
                        var5.method946(new class403(var4), -20886);
                    }
                }
                var3++;
            }
            class401.field5640[arg1] = true;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "([BII)V")
    public final void method808(byte[] arg0, int arg1, int arg2) {
        field1659++;
        if (arg1 != -467059280) {
            this.field1656 = null;
        }
        this.method451((byte) -28);
        if (this.field1657 < arg2) {
            OpenGL.glBufferDataARBub(this.field1654, arg2, arg0, 0, this.field1651 ? 35040 : 35044);
            this.field1656.field7327 += arg2 - this.field1657;
            this.field1657 = arg2;
        } else {
            OpenGL.glBufferSubDataARB(this.field1654, 0, arg2, arg0, 0);
        }
    }

    @OriginalMember(owner = "client!ei", name = "<init>", descriptor = "(Lih;I[BIZ)V")
    public class120(class503 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        this.field1651 = arg4;
        this.field1657 = arg3;
        this.field1656 = arg0;
        this.field1654 = arg1;
        OpenGL.glGenBuffersARB(1, class380.field5367, 0);
        this.field1650 = class380.field5367[0];
        this.method451((byte) -28);
        OpenGL.glBufferDataARBub(arg1, this.field1657, arg2, 0, this.field1651 ? 35040 : 35044);
        this.field1656.field7327 += this.field1657;
    }

    @OriginalMember(owner = "client!ei", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field1652++;
        this.field1656.method2947(68, this.field1650, this.field1657);
        super.finalize();
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(ILdh;)Ljava/lang/String;")
    public static final String method809(int arg0, class214 arg1) {
        if (arg0 == -32060) {
            field1655++;
            return arg1.field3098 == null || arg1.field3098.length() <= 0 ? arg1.field3099 : arg1.field3099 + class19.field223.method3116(class149.field1979, (byte) 98) + arg1.field3098;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ei", name = "<init>", descriptor = "(Lih;ILjaggl/memory/NativeBuffer;IZ)V")
    public class120(class503 arg0, int arg1, NativeBuffer arg2, int arg3, boolean arg4) {
        this.field1651 = arg4;
        this.field1656 = arg0;
        this.field1657 = arg3;
        this.field1654 = arg1;
        OpenGL.glGenBuffersARB(1, class380.field5367, 0);
        this.field1650 = class380.field5367[0];
        this.method451((byte) -28);
        OpenGL.glBufferDataARBa(arg1, this.field1657, arg2.method2610(), this.field1651 ? 35040 : 35044);
        this.field1656.field7327 += this.field1657;
    }

    static {
        new class530("You can spot a Jagex moderator by the gold crown next to their name.", "Jagex-Mitarbeiter haben eine goldene Krone neben ihrem Namen.", "Vous pouvez reconnaître les modérateurs Jagex à la couronne dorée en regard de leur nom.", "Os moderadores da Jagex são identificados por uma coroa dourada próxima ao \u007fnome.");
        field1660 = 0;
        field1661 = 52;
    }
}
