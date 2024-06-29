import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bo")
public class class522 extends InputStream {

    @OriginalMember(owner = "client!bo", name = "g", descriptor = "Z")
    public static boolean field7685 = false;

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "I")
    public static int field7679;

    @OriginalMember(owner = "client!bo", name = "b", descriptor = "I")
    public static int field7680;

    @OriginalMember(owner = "client!bo", name = "c", descriptor = "I")
    public static int field7681;

    @OriginalMember(owner = "client!bo", name = "d", descriptor = "I")
    public static int field7682;

    @OriginalMember(owner = "client!bo", name = "e", descriptor = "I")
    public static int field7683;

    @OriginalMember(owner = "client!bo", name = "f", descriptor = "I")
    public static int field7684;

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(I[B)[B", line = 6)
    public static final byte[] method3084(int arg0, byte[] arg1) {
        field7683++;
        if (arg1 == null) {
            return null;
        } else {
            byte[] var2 = new byte[arg1.length];
            class182.method1135(arg1, 0, var2, arg0, arg1.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!bo", name = "read", descriptor = "()I", line = 22)
    public final int read() {
        field7679++;
        class52.method411(30000L, (byte) 113);
        return -1;
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(II)V", line = 35)
    public static final void method3085(int arg0, int arg1) {
        field7681++;
        if (arg1 != 0) {
            field7685 = true;
        }
        class45 var2 = class354.method2094(arg0, (byte) -101, 6);
        var2.method261(4);
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(B)V", line = 48)
    public static final void method3086(byte arg0) {
        for (int var1 = 0; var1 < 5; var1++) {
            class345.field5006[var1] = false;
        }
        field7680++;
        class504.field7461 = 1;
        int var2 = -96 / ((arg0 + 87) / 33);
        class131.field1729 = -1;
        class350.field5036 = 0;
        class101.field1343 = -1;
        class363.field5199 = 0;
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(I)V", line = 72)
    public static final void method3087(int arg0) {
        if (arg0 != 836) {
            method3084(-25, null);
        }
        field7682++;
        if (class60.field746) {
            return;
        }
        class60.field746 = true;
        class264.field3877 = true;
        if (class4.field81.field1437) {
            class153.field2204 = ((int) class153.field2204 + 191 & 0xFFFFFF80);
        } else {
            class431.field6092 += (24.0F - class431.field6092) / 2.0F;
        }
    }
}
