import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tv")
public class class483 {

    @OriginalMember(owner = "client!tv", name = "c", descriptor = "I")
    public int field6626 = 0;

    @OriginalMember(owner = "client!tv", name = "h", descriptor = "I")
    public int field6631 = 0;

    @OriginalMember(owner = "client!tv", name = "j", descriptor = "I")
    public int field6633 = 0;

    @OriginalMember(owner = "client!tv", name = "o", descriptor = "I")
    public int field6638 = 0;

    @OriginalMember(owner = "client!tv", name = "p", descriptor = "Z")
    public boolean field6639 = false;

    @OriginalMember(owner = "client!tv", name = "q", descriptor = "Z")
    public boolean field6640 = true;

    @OriginalMember(owner = "client!tv", name = "l", descriptor = "Lwga;")
    public class532 field6635 = new class532();

    @OriginalMember(owner = "client!tv", name = "t", descriptor = "[I")
    public int[] field6643 = new int[64];

    @OriginalMember(owner = "client!tv", name = "z", descriptor = "[I")
    public int[] field6649 = new int[10000];

    @OriginalMember(owner = "client!tv", name = "K", descriptor = "[I")
    public int[] field6660 = new int[class54.field765];

    @OriginalMember(owner = "client!tv", name = "v", descriptor = "[I")
    public int[] field6645 = new int[8];

    @OriginalMember(owner = "client!tv", name = "R", descriptor = "[I")
    public int[] field6666 = new int[10000];

    @OriginalMember(owner = "client!tv", name = "P", descriptor = "[F")
    public float[] field6665 = new float[2];

    @OriginalMember(owner = "client!tv", name = "B", descriptor = "[I")
    public int[] field6651 = new int[class54.field765];

    @OriginalMember(owner = "client!tv", name = "F", descriptor = "[I")
    public int[] field6655 = new int[class54.field765];

    @OriginalMember(owner = "client!tv", name = "G", descriptor = "[I")
    public int[] field6656 = new int[class54.field765];

    @OriginalMember(owner = "client!tv", name = "J", descriptor = "[I")
    public int[] field6659 = new int[8];

    @OriginalMember(owner = "client!tv", name = "X", descriptor = "[I")
    public int[] field6672 = new int[10];

    @OriginalMember(owner = "client!tv", name = "L", descriptor = "[I")
    public int[] field6661 = new int[10];

    @OriginalMember(owner = "client!tv", name = "V", descriptor = "[I")
    public int[] field6670 = new int[10];

    @OriginalMember(owner = "client!tv", name = "ab", descriptor = "[I")
    public int[] field6675 = new int[class54.field765];

    @OriginalMember(owner = "client!tv", name = "x", descriptor = "[I")
    public int[] field6647 = new int[class54.field765];

    @OriginalMember(owner = "client!tv", name = "E", descriptor = "[I")
    public int[] field6654 = new int[10];

    @OriginalMember(owner = "client!tv", name = "S", descriptor = "[I")
    public int[] field6667 = new int[64];

    @OriginalMember(owner = "client!tv", name = "U", descriptor = "[I")
    public int[] field6669 = new int[64];

    @OriginalMember(owner = "client!tv", name = "D", descriptor = "[I")
    public int[] field6653 = new int[class54.field765];

    @OriginalMember(owner = "client!tv", name = "A", descriptor = "[I")
    public int[] field6650 = new int[8];

    @OriginalMember(owner = "client!tv", name = "db", descriptor = "[I")
    public int[] field6678 = new int[64];

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "Lrp;")
    private class680 field6624;

    @OriginalMember(owner = "client!tv", name = "i", descriptor = "I")
    public int field6632;

    @OriginalMember(owner = "client!tv", name = "u", descriptor = "Ljw;")
    public class476 field6644;

    @OriginalMember(owner = "client!tv", name = "y", descriptor = "Laha;")
    public class54 field6648;

    @OriginalMember(owner = "client!tv", name = "T", descriptor = "Laha;")
    public class54 field6668;

    @OriginalMember(owner = "client!tv", name = "bb", descriptor = "Laha;")
    public class54 field6676;

    @OriginalMember(owner = "client!tv", name = "Z", descriptor = "Laha;")
    public class54 field6674;

    @OriginalMember(owner = "client!tv", name = "W", descriptor = "Laha;")
    public class54 field6671;

    @OriginalMember(owner = "client!tv", name = "s", descriptor = "Laha;")
    public class54 field6642;

    @OriginalMember(owner = "client!tv", name = "C", descriptor = "Laha;")
    public class54 field6652;

    @OriginalMember(owner = "client!tv", name = "w", descriptor = "Laha;")
    public class54 field6646;

    @OriginalMember(owner = "client!tv", name = "M", descriptor = "Laha;")
    public class54 field6662;

    @OriginalMember(owner = "client!tv", name = "r", descriptor = "Laha;")
    public class54 field6641;

    @OriginalMember(owner = "client!tv", name = "H", descriptor = "[I")
    public int[] field6657;

    @OriginalMember(owner = "client!tv", name = "f", descriptor = "[F")
    public static float[] field6629 = new float[16384];

    @OriginalMember(owner = "client!tv", name = "n", descriptor = "[F")
    public static float[] field6637 = new float[16384];

    @OriginalMember(owner = "client!tv", name = "I", descriptor = "Low;")
    public static class665 field6658;

    @OriginalMember(owner = "client!tv", name = "e", descriptor = "I")
    public static int field6628;

    @OriginalMember(owner = "client!tv", name = "g", descriptor = "I")
    public static int field6630;

    @OriginalMember(owner = "client!tv", name = "k", descriptor = "I")
    public static int field6634;

    @OriginalMember(owner = "client!tv", name = "m", descriptor = "I")
    public static int field6636;

    @OriginalMember(owner = "client!tv", name = "N", descriptor = "I")
    public int field6663;

    @OriginalMember(owner = "client!tv", name = "O", descriptor = "I")
    public int field6664;

    @OriginalMember(owner = "client!tv", name = "Y", descriptor = "I")
    public int field6673;

    @OriginalMember(owner = "client!tv", name = "cb", descriptor = "I")
    public static int field6677;

    @OriginalMember(owner = "client!tv", name = "eb", descriptor = "I")
    public static int field6679;

    @OriginalMember(owner = "client!tv", name = "b", descriptor = "Ljava/lang/Runnable;")
    public Runnable field6625;

    @OriginalMember(owner = "client!tv", name = "d", descriptor = "Z")
    public boolean field6627;

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(I)V")
    public final void method2848(int arg0) {
        field6628++;
        this.field6644 = new class476(this.field6624, this);
        if (arg0 != 16384) {
            this.method2848(-10);
        }
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(BLjava/lang/Runnable;)V")
    public final void method2849(byte arg0, Runnable arg1) {
        this.field6625 = arg1;
        field6636++;
        int var3 = -33 % ((arg0 - 12) / 57);
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "([BIILjava/io/File;)V")
    public static final void method2850(byte[] arg0, int arg1, int arg2, File arg3) throws IOException {
        field6630++;
        DataInputStream var4 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg3)));
        try {
            var4.readFully(arg0, arg1, arg2);
        } catch (EOFException var5) {
        }
        var4.close();
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(Z)V")
    public static void method2851(boolean arg0) {
        field6629 = null;
        if (!arg0) {
            field6629 = null;
        }
        field6658 = null;
        field6637 = null;
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(IIIIBIIII)V")
    public static final void method2852(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, int arg8) {
        field6634++;
        class591.method3466(arg8, arg3, arg4 - 69, arg2, arg0, arg5, arg1, 0, arg7, arg6);
        if (arg4 != 69) {
            field6637 = null;
        }
    }

    @OriginalMember(owner = "client!tv", name = "<init>", descriptor = "(Lrp;)V")
    public class483(class680 arg0) {
        this.field6624 = arg0;
        this.field6632 = this.field6624.field9636 - 255;
        this.field6644 = new class476(arg0, this);
        this.field6648 = new class54(this.field6624);
        this.field6668 = new class54(this.field6624);
        this.field6676 = new class54(this.field6624);
        this.field6674 = new class54(this.field6624);
        this.field6671 = new class54(this.field6624);
        this.field6642 = new class54(this.field6624);
        this.field6652 = new class54(this.field6624);
        this.field6646 = new class54(this.field6624);
        this.field6662 = new class54(this.field6624);
        this.field6641 = new class54(this.field6624);
        this.field6657 = new int[class54.field764];
        for (int var2 = 0; var2 < class54.field764; var2++) {
            this.field6657[var2] = -1;
        }
    }

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field6629[var2] = (float) Math.sin((double) var2 * var0);
            field6637[var2] = (float) Math.cos((double) var2 * var0);
        }
        field6658 = new class665();
    }
}
