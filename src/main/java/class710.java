import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lu")
public class class710 {

    @OriginalMember(owner = "client!lu", name = "l", descriptor = "Lgs;")
    public class43 field9925;

    @OriginalMember(owner = "client!lu", name = "b", descriptor = "B")
    public byte field9915;

    @OriginalMember(owner = "client!lu", name = "k", descriptor = "I")
    public int field9924;

    @OriginalMember(owner = "client!lu", name = "h", descriptor = "I")
    public int field9921;

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "I")
    public int field9914;

    @OriginalMember(owner = "client!lu", name = "n", descriptor = "I")
    public int field9927;

    @OriginalMember(owner = "client!lu", name = "g", descriptor = "I")
    public int field9920;

    @OriginalMember(owner = "client!lu", name = "m", descriptor = "I")
    public int field9926;

    @OriginalMember(owner = "client!lu", name = "o", descriptor = "Lqe;")
    public static class465 field9928 = new class465(88, 6);

    @OriginalMember(owner = "client!lu", name = "p", descriptor = "I")
    public static int field9929 = -1;

    @OriginalMember(owner = "client!lu", name = "e", descriptor = "I")
    public static int field9918;

    @OriginalMember(owner = "client!lu", name = "f", descriptor = "I")
    public static int field9919;

    @OriginalMember(owner = "client!lu", name = "q", descriptor = "Leq;")
    public static class209 field9930;

    @OriginalMember(owner = "client!lu", name = "i", descriptor = "Ltf;")
    public class294 field9922;

    @OriginalMember(owner = "client!lu", name = "d", descriptor = "Ldc;")
    public class5 field9917;

    @OriginalMember(owner = "client!lu", name = "c", descriptor = "Lcj;")
    public class690 field9916;

    @OriginalMember(owner = "client!lu", name = "j", descriptor = "Loia;")
    public class88 field9923;

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(ILjava/io/File;I[B)V")
    public static final void method3966(int arg0, File arg1, int arg2, byte[] arg3) throws IOException {
        field9918++;
        DataInputStream var4 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg1)));
        if (arg2 < 42) {
            field9930 = null;
        }
        try {
            var4.readFully(arg3, 0, arg0);
        } catch (EOFException var5) {
        }
        var4.close();
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(B)Z")
    public final boolean method3967(byte arg0) {
        if (arg0 > -127) {
            this.field9922 = null;
        }
        field9919++;
        return this.field9915 == 2 || this.field9915 == 3;
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(I)V")
    public static void method3968(int arg0) {
        field9928 = null;
        if (arg0 != -5408) {
            method3968(6);
        }
        field9930 = null;
    }

    @OriginalMember(owner = "client!lu", name = "<init>", descriptor = "(BIIIIIILgs;)V")
    public class710(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class43 arg7) {
        this.field9925 = arg7;
        this.field9915 = arg0;
        this.field9924 = arg1;
        this.field9921 = arg6;
        this.field9914 = arg3;
        this.field9927 = arg4;
        this.field9920 = arg2;
        this.field9926 = arg5;
    }
}
