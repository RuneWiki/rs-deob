import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!daa")
public class class407 extends class51 implements class212 {

    @OriginalMember(owner = "client!daa", name = "u", descriptor = "I")
    private int field5841;

    @OriginalMember(owner = "client!daa", name = "q", descriptor = "Z")
    public static boolean field5837 = false;

    @OriginalMember(owner = "client!daa", name = "p", descriptor = "[Lph;")
    public static class699[] field5836 = new class699[300];

    @OriginalMember(owner = "client!daa", name = "v", descriptor = "[I")
    public static int[] field5842 = new int[1];

    @OriginalMember(owner = "client!daa", name = "m", descriptor = "I")
    public static int field5833;

    @OriginalMember(owner = "client!daa", name = "n", descriptor = "I")
    public static int field5834;

    @OriginalMember(owner = "client!daa", name = "o", descriptor = "I")
    public static int field5835;

    @OriginalMember(owner = "client!daa", name = "r", descriptor = "I")
    public static int field5838;

    @OriginalMember(owner = "client!daa", name = "s", descriptor = "I")
    public static int field5839;

    @OriginalMember(owner = "client!daa", name = "t", descriptor = "I")
    public static int field5840;

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(B)I")
    public final int method1450(byte arg0) {
        if (arg0 <= 18) {
            return -67;
        } else {
            ++field5839;
            return this.field5841;
        }
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(I)J")
    public final long method1448(int arg0) {
        if (arg0 != 25844) {
            return 76L;
        } else {
            ++field5834;
            return 0L;
        }
    }

    @OriginalMember(owner = "client!daa", name = "<init>", descriptor = "(Lkfa;I[BIZ)V")
    public class407(class382 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34963, arg2, arg3, arg4);
        this.field5841 = arg1;
    }

    @OriginalMember(owner = "client!daa", name = "c", descriptor = "(I)V")
    public final void method406(int arg0) {
        ++field5840;
        super.field670.method2324(arg0, this);
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(Z)I")
    public final int method1451(boolean arg0) {
        if (arg0) {
            this.method406(17);
        }
        ++field5835;
        return super.field672;
    }

    @OriginalMember(owner = "client!daa", name = "b", descriptor = "(I)V")
    public static void method2441(int arg0) {
        field5836 = null;
        field5842 = null;
        if (arg0 != -1027) {
            field5837 = true;
        }
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "([BIII)V")
    public final void method1449(byte[] arg0, int arg1, int arg2, int arg3) {
        if (arg3 != -17605) {
            field5837 = false;
        }
        ++field5833;
        this.method408(arg0, arg1, arg3 ^ -17598);
        this.field5841 = arg2;
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(I[BBLjava/io/File;)V")
    public static final void method2442(int arg0, byte[] arg1, byte arg2, File arg3) throws IOException {
        if (arg2 != -112) {
            field5842 = null;
        }
        ++field5838;
        DataInputStream var4 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg3)));
        try {
            var4.readFully(arg1, 0, arg0);
        } catch (EOFException var5) {
        }
        var4.close();
    }
}
