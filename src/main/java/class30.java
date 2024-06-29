import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wv")
public class class30 {

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "[I")
    private int[] field498;

    @OriginalMember(owner = "client!wv", name = "b", descriptor = "[I")
    public static int[] field499 = new int[2];

    @OriginalMember(owner = "client!wv", name = "c", descriptor = "[I")
    public static int[] field500 = new int[8];

    @OriginalMember(owner = "client!wv", name = "d", descriptor = "I")
    public static int field501;

    @OriginalMember(owner = "client!wv", name = "e", descriptor = "I")
    public static int field502;

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(B)V")
    public static void method314(byte arg0) {
        field499 = null;
        field500 = null;
        if (arg0 != 46) {
            field499 = null;
        }
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(II)I")
    public final int method315(int arg0, int arg1) {
        field502++;
        int var3 = (this.field498.length >> 1) - 1;
        if (arg1 != 1) {
            field499 = null;
        }
        int var4 = arg0 & var3;
        while (true) {
            int var5 = this.field498[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field498[var4 + var4] == arg0) {
                return var5;
            }
            var4 = var3 & var4 + 1;
        }
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "([BILjava/io/File;I)V")
    public static final void method316(byte[] arg0, int arg1, File arg2, int arg3) throws IOException {
        field501++;
        DataInputStream var4 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg2)));
        try {
            var4.readFully(arg0, 0, arg1);
        } catch (EOFException var5) {
        }
        if (arg3 == -1) {
            var4.close();
        }
    }

    @OriginalMember(owner = "client!wv", name = "<init>", descriptor = "([I)V")
    public class30(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= ((arg0.length >> 1) + arg0.length); var2 <<= 0x1) {
        }
        this.field498 = new int[var2 + var2];
        for (int var3 = 0; var3 < (var2 + var2); var3++) {
            this.field498[var3] = -1;
        }
        int var4 = 0;
        while (arg0.length > var4) {
            int var5;
            for (var5 = arg0[var4] & var2 - 1; this.field498[var5 + var5 + 1] != -1; var5 = var5 + 1 & var2 + -1) {
            }
            this.field498[var5 + var5] = arg0[var4];
            this.field498[var5 + var5 + 1] = var4++;
        }
    }
}
