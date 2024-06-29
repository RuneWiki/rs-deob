import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class60 {

    @OriginalMember(owner = "client!vb", name = "f", descriptor = "I")
    public static int field790 = 0;

    @OriginalMember(owner = "client!vb", name = "g", descriptor = "[S")
    public static short[] field791 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!vb", name = "e", descriptor = "[I")
    public static int[] field789 = new int[2];

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "I")
    public static int field785;

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "I")
    public static int field786;

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "I")
    public static int field787;

    @OriginalMember(owner = "client!vb", name = "h", descriptor = "I")
    public static int field792;

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "[[Lkd;")
    public static class83[][] field788;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(B[B)[B", line = 8)
    public static final byte[] method414(byte arg0, byte[] arg1) {
        field785++;
        if (arg1 == null) {
            return null;
        }
        if (arg0 < 5) {
            field790 = 28;
        }
        byte[] var2 = new byte[arg1.length];
        class213.method1552(arg1, 0, var2, 0, arg1.length);
        return var2;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Ljava/lang/String;ZB)V", line = 30)
    public static final void method415(String arg0, boolean arg1, byte arg2) {
        field792++;
        if (arg1) {
            if (class186.field2991 && class337.field5237) {
                try {
                    class72.method469("openjs", class264.field4183.field68, new Object[] { (new URL(class286.field4519.getCodeBase(), arg0)).toString() }, (byte) 123);
                    return;
                } catch (Throwable var10) {
                }
            }
            try {
                class286.field4519.getAppletContext().showDocument(new URL(class286.field4519.getCodeBase(), arg0), "_blank");
            } catch (Exception var7) {
            }
        } else {
            try {
                class72.method470("loggedout", (byte) -122, class264.field4183.field68);
            } catch (Throwable var9) {
            }
            try {
                class286.field4519.getAppletContext().showDocument(new URL(class286.field4519.getCodeBase(), arg0), "_top");
            } catch (Exception var8) {
            }
        }
        if (arg2 < 118) {
            field790 = 37;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(I)I", line = 81)
    public static final int method416(int arg0) {
        field786++;
        if (class113.field1688 != null) {
            return 3;
        }
        int var1 = 53 % ((63 - arg0) / 62);
        if (class186.field2991 && class131.field1926) {
            return 2;
        } else if (class186.field2991 && !class131.field1926) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(I)V", line = 111)
    public static void method417(int arg0) {
        field788 = (class83[][]) null;
        if (arg0 >= -127) {
            method416(90);
        }
        field789 = null;
        field791 = null;
    }
}
