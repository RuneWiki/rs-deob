import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!saa")
public class class507 {

    @OriginalMember(owner = "client!saa", name = "b", descriptor = "I")
    public int field6860;

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "Z")
    public static boolean field6859 = true;

    @OriginalMember(owner = "client!saa", name = "c", descriptor = "I")
    public static int field6861;

    @OriginalMember(owner = "client!saa", name = "d", descriptor = "I")
    public static int field6862;

    @OriginalMember(owner = "client!saa", name = "toString", descriptor = "()Ljava/lang/String;", line = 4)
    public final String toString() {
        field6862++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "([BIILjava/io/File;)V", line = 14)
    public static final void method2867(byte[] arg0, int arg1, int arg2, File arg3) throws IOException {
        field6861++;
        DataInputStream var4 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg3)));
        try {
            var4.readFully(arg0, 0, arg2);
            int var5 = -59 / ((-arg1 - 59) / 58);
        } catch (EOFException var6) {
        }
        var4.close();
    }

    @OriginalMember(owner = "client!saa", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 35)
    public class507(String arg0, int arg1) {
        this.field6860 = arg1;
    }
}
