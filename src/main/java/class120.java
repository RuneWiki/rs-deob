import java.awt.event.KeyEvent;
import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class120 extends class137 {

    @OriginalMember(owner = "client!f", name = "L", descriptor = "I")
    private int field2008 = -1;

    @OriginalMember(owner = "client!f", name = "M", descriptor = "I")
    private int field2009 = 0;

    @OriginalMember(owner = "client!f", name = "B", descriptor = "I")
    private int field1998;

    @OriginalMember(owner = "client!f", name = "y", descriptor = "Ltl;")
    private static class59 field1995 = class85.method639("Loaded sprites", 9588);

    @OriginalMember(owner = "client!f", name = "F", descriptor = "[I")
    public static int[] field2002 = new int[25];

    @OriginalMember(owner = "client!f", name = "J", descriptor = "[Lnf;")
    public static class56[] field2006 = new class56[50];

    @OriginalMember(owner = "client!f", name = "z", descriptor = "Ltl;")
    public static class59 field1996 = class85.method639("huffman", 9588);

    @OriginalMember(owner = "client!f", name = "K", descriptor = "Ltl;")
    public static class59 field2007 = field1995;

    @OriginalMember(owner = "client!f", name = "v", descriptor = "I")
    public static int field1992;

    @OriginalMember(owner = "client!f", name = "w", descriptor = "I")
    public static int field1993;

    @OriginalMember(owner = "client!f", name = "x", descriptor = "I")
    public static int field1994;

    @OriginalMember(owner = "client!f", name = "A", descriptor = "I")
    public static int field1997;

    @OriginalMember(owner = "client!f", name = "C", descriptor = "I")
    public static int field1999;

    @OriginalMember(owner = "client!f", name = "D", descriptor = "I")
    public static int field2000;

    @OriginalMember(owner = "client!f", name = "E", descriptor = "I")
    public static int field2001;

    @OriginalMember(owner = "client!f", name = "G", descriptor = "I")
    public static int field2003;

    @OriginalMember(owner = "client!f", name = "H", descriptor = "I")
    public static int field2004;

    @OriginalMember(owner = "client!f", name = "I", descriptor = "I")
    public static int field2005;

    @OriginalMember(owner = "client!f", name = "O", descriptor = "I")
    public static int field2011;

    @OriginalMember(owner = "client!f", name = "N", descriptor = "[[[Lcd;")
    public static class245[][][] field2010;

    @OriginalMember(owner = "client!f", name = "finalize", descriptor = "()V", line = 7)
    protected final void finalize() throws Throwable {
        if (this.field2008 != -1) {
            class104.method785(this.field2008, this.field2009, this.field1998);
            this.field2008 = -1;
            this.field2009 = 0;
        }
        field2004++;
        super.finalize();
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(II)V", line = 32)
    public static final void method893(int arg0, int arg1) {
        if (arg1 != 0) {
            method893(-13, -82);
        }
        class84.field1310.method1486(false, arg0);
        field1997++;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;I)I", line = 68)
    public static final int method894(KeyEvent arg0, int arg1) {
        field1992++;
        int var2 = arg0.getKeyChar();
        if (var2 == 8364) {
            return 128;
        } else {
            if (~var2 >= arg1 || var2 >= 256) {
                var2 = -1;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IBIII)V", line = 86)
    public static final void method895(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        field2011++;
        if (arg1 != 1) {
            method897(false);
        }
        for (int var5 = 0; var5 < class129.field2137; var5++) {
            if (arg4 < class249.field4144[var5] + class40.field599[var5] && class249.field4144[var5] < arg0 + arg4 && class78.field1249[var5] + class229.field3718[var5] > arg2 && arg2 + arg3 > class229.field3718[var5]) {
                class102.field1689[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(JSBLtl;ILtl;I)V", line = 112)
    public static final void method896(long arg0, short arg1, byte arg2, class59 arg3, int arg4, class59 arg5, int arg6) {
        field1994++;
        if (arg2 <= 103 || class85.field1336 || class231.field3803 >= 500) {
            return;
        }
        class93.field1440[class231.field3803] = arg5;
        class294.field5015[class231.field3803] = arg3;
        class27.field363[class231.field3803] = arg1;
        class281.field4843[class231.field3803] = arg0;
        class29.field393[class231.field3803] = arg4;
        class40.field598[class231.field3803] = arg6;
        class231.field3803++;
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(Z)V", line = 149)
    public static final void method897(boolean arg0) {
        class292.field4990.method1484(arg0);
        field2001++;
    }

    @OriginalMember(owner = "client!f", name = "e", descriptor = "(I)V", line = 158)
    public static void method898(int arg0) {
        field2002 = null;
        field1996 = null;
        if (arg0 >= -116) {
            field2000 = 107;
        }
        field1995 = null;
        field2007 = null;
        field2006 = null;
        field2010 = (class245[][][]) null;
    }

    @OriginalMember(owner = "client!f", name = "<init>", descriptor = "(I)V", line = 189)
    public class120(int arg0) {
        GL var2 = class55.field812;
        int[] var3 = new int[1];
        var2.glGenTextures(1, var3, 0);
        this.field1998 = class104.field1712;
        this.field2008 = var3[0];
        class55.method407(this.field2008);
        int var4 = class298.field5102[arg0];
        byte[] var5 = new byte[] { (byte) (var4 >> 16), (byte) (var4 >> 8), (byte) var4, -1 };
        ByteBuffer var6 = ByteBuffer.wrap(var5);
        var2.glTexImage2D(3553, 0, 6408, 1, 1, 0, 6408, 5121, var6);
        var2.glTexParameteri(3553, 10241, 9729);
        var2.glTexParameteri(3553, 10240, 9729);
        class104.field1711 += var6.limit() - this.field2009;
        this.field2009 = var6.limit();
    }

    @OriginalMember(owner = "client!f", name = "f", descriptor = "(I)V", line = 216)
    public final void method899(int arg0) {
        field1993++;
        int var2 = class149.method1078((byte) -106);
        if ((var2 & 0x1) == 0) {
            class55.method407(this.field2008);
        }
        if ((var2 & 0x2) == 0) {
            class55.method386(0);
        }
        if (~(var2 & 0x4) == arg0) {
            class55.method405(0);
        }
    }
}
