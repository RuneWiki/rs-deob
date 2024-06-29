import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class27 extends class96 {

    @OriginalMember(owner = "client!sd", name = "U", descriptor = "I")
    private int field456 = 0;

    @OriginalMember(owner = "client!sd", name = "K", descriptor = "I")
    private int field446 = -1;

    @OriginalMember(owner = "client!sd", name = "L", descriptor = "I")
    private int field447;

    @OriginalMember(owner = "client!sd", name = "M", descriptor = "Lna;")
    private static class26 field448 = class69.method505("Face here", (byte) -117);

    @OriginalMember(owner = "client!sd", name = "P", descriptor = "Lna;")
    public static class26 field451 = class69.method505("Liste der Welten geladen", (byte) -117);

    @OriginalMember(owner = "client!sd", name = "J", descriptor = "Lna;")
    public static class26 field445 = class69.method505("Veuillez patienter )2 tentative de r-Btablissement)3", (byte) -118);

    @OriginalMember(owner = "client!sd", name = "S", descriptor = "I")
    public static int field454 = 100;

    @OriginalMember(owner = "client!sd", name = "X", descriptor = "Z")
    public static boolean field459 = false;

    @OriginalMember(owner = "client!sd", name = "V", descriptor = "[I")
    public static int[] field457 = new int[100];

    @OriginalMember(owner = "client!sd", name = "T", descriptor = "I")
    public static int field455 = 0;

    @OriginalMember(owner = "client!sd", name = "O", descriptor = "Lna;")
    public static class26 field450 = field448;

    @OriginalMember(owner = "client!sd", name = "I", descriptor = "I")
    public static int field444;

    @OriginalMember(owner = "client!sd", name = "N", descriptor = "I")
    public static int field449;

    @OriginalMember(owner = "client!sd", name = "Q", descriptor = "I")
    public static int field452;

    @OriginalMember(owner = "client!sd", name = "R", descriptor = "I")
    public static int field453;

    @OriginalMember(owner = "client!sd", name = "W", descriptor = "I")
    public static int field458;

    @OriginalMember(owner = "client!sd", name = "Y", descriptor = "I")
    public static int field460;

    @OriginalMember(owner = "client!sd", name = "finalize", descriptor = "()V", line = 14)
    protected final void finalize() throws Throwable {
        if (this.field446 != -1) {
            class197.method1322(this.field446, this.field456, this.field447);
            this.field446 = -1;
            this.field456 = 0;
        }
        field452++;
        super.finalize();
    }

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "(II)V", line = 35)
    public static final void method213(int arg0, int arg1) {
        class55 var2 = class36.field585[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class55 var4 = class36.field585[var3][arg0][arg1] = class36.field585[var3 + 1][arg0][arg1];
            if (var4 != null) {
                var4.field900--;
                for (int var5 = 0; var5 < var4.field879; var5++) {
                    class39 var6 = var4.field877[var5];
                    if ((var6.field656 >> 29 & 0x3L) == 2L && var6.field637 == arg0 && var6.field630 == arg1) {
                        var6.field648--;
                    }
                }
            }
        }
        if (class36.field585[0][arg0][arg1] == null) {
            class36.field585[0][arg0][arg1] = new class55(0, arg0, arg1);
        }
        class36.field585[0][arg0][arg1].field891 = var2;
        class36.field585[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!sd", name = "f", descriptor = "(B)V", line = 77)
    public static final void method214(byte arg0) {
        if (arg0 >= 122) {
            class229.field3638.method1986((byte) -104);
            field460++;
        }
    }

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "(I)V", line = 89)
    public static void method215(int arg0) {
        field450 = null;
        field445 = null;
        field457 = null;
        if (arg0 != 1) {
            field448 = (class26) null;
        }
        field451 = null;
        field448 = null;
    }

    @OriginalMember(owner = "client!sd", name = "g", descriptor = "(B)V", line = 105)
    public final void method216(byte arg0) {
        field449++;
        int var2 = class322.method2241(arg0 + 1530);
        if ((var2 & 0x1) == 0) {
            class255.method1790(this.field446);
        }
        if ((var2 & 0x2) == 0) {
            class255.method1796(0);
        }
        if ((var2 & 0x4) == 0) {
            class255.method1787(0);
        }
        if (arg0 != 6) {
            field451 = (class26) null;
        }
    }

    @OriginalMember(owner = "client!sd", name = "e", descriptor = "(I)V", line = 142)
    public static final void method217(int arg0) {
        try {
            Method var1 = Runtime.class.getMethod("maxMemory");
            if (var1 != null) {
                try {
                    Runtime var2 = Runtime.getRuntime();
                    Long var3 = (Long) var1.invoke(var2, (Object[]) null);
                    class293.field4880 = (int) (var3 / 1048576L) + 1;
                } catch (Throwable var6) {
                }
            }
        } catch (Exception var7) {
        }
        field458++;
    }

    @OriginalMember(owner = "client!sd", name = "<init>", descriptor = "(I)V", line = 186)
    public class27(int arg0) {
        GL var2 = class255.field4181;
        int[] var3 = new int[1];
        var2.glGenTextures(1, var3, 0);
        this.field446 = var3[0];
        this.field447 = class197.field3058;
        class255.method1790(this.field446);
        int var4 = class200.field3098[arg0];
        byte[] var5 = new byte[] { (byte) (var4 >> 16), (byte) (var4 >> 8), (byte) var4, -1 };
        ByteBuffer var6 = ByteBuffer.wrap(var5);
        var2.glTexImage2D(3553, 0, 6408, 1, 1, 0, 6408, 5121, var6);
        var2.glTexParameteri(3553, 10241, 9729);
        var2.glTexParameteri(3553, 10240, 9729);
        class197.field3056 += var6.limit() - this.field456;
        this.field456 = var6.limit();
    }
}
