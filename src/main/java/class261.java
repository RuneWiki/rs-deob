import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lfa")
public class class261 {

    @OriginalMember(owner = "client!lfa", name = "f", descriptor = "I")
    public int field3715 = 0;

    @OriginalMember(owner = "client!lfa", name = "k", descriptor = "I")
    public int field3720 = 0;

    @OriginalMember(owner = "client!lfa", name = "o", descriptor = "I")
    public int field3724 = 0;

    @OriginalMember(owner = "client!lfa", name = "g", descriptor = "I")
    public int field3716 = 0;

    @OriginalMember(owner = "client!lfa", name = "j", descriptor = "Z")
    public boolean field3719 = true;

    @OriginalMember(owner = "client!lfa", name = "t", descriptor = "Z")
    public boolean field3729 = false;

    @OriginalMember(owner = "client!lfa", name = "m", descriptor = "Lrda;")
    public class447 field3722 = new class447();

    @OriginalMember(owner = "client!lfa", name = "I", descriptor = "[F")
    public float[] field3744 = new float[2];

    @OriginalMember(owner = "client!lfa", name = "E", descriptor = "[I")
    public int[] field3740 = new int[64];

    @OriginalMember(owner = "client!lfa", name = "x", descriptor = "[I")
    public int[] field3733 = new int[10];

    @OriginalMember(owner = "client!lfa", name = "C", descriptor = "[I")
    public int[] field3738 = new int[10];

    @OriginalMember(owner = "client!lfa", name = "P", descriptor = "[I")
    public int[] field3751 = new int[10];

    @OriginalMember(owner = "client!lfa", name = "H", descriptor = "[I")
    public int[] field3743 = new int[64];

    @OriginalMember(owner = "client!lfa", name = "O", descriptor = "[I")
    public int[] field3750 = new int[10000];

    @OriginalMember(owner = "client!lfa", name = "Z", descriptor = "[I")
    public int[] field3761 = new int[64];

    @OriginalMember(owner = "client!lfa", name = "T", descriptor = "[I")
    public int[] field3755 = new int[64];

    @OriginalMember(owner = "client!lfa", name = "S", descriptor = "[I")
    public int[] field3754 = new int[class197.field2941];

    @OriginalMember(owner = "client!lfa", name = "L", descriptor = "[I")
    public int[] field3747 = new int[class197.field2941];

    @OriginalMember(owner = "client!lfa", name = "U", descriptor = "[I")
    public int[] field3756 = new int[class197.field2941];

    @OriginalMember(owner = "client!lfa", name = "W", descriptor = "[I")
    public int[] field3758 = new int[8];

    @OriginalMember(owner = "client!lfa", name = "ab", descriptor = "[I")
    public int[] field3762 = new int[10000];

    @OriginalMember(owner = "client!lfa", name = "R", descriptor = "[I")
    public int[] field3753 = new int[8];

    @OriginalMember(owner = "client!lfa", name = "B", descriptor = "[I")
    public int[] field3737 = new int[10];

    @OriginalMember(owner = "client!lfa", name = "X", descriptor = "[I")
    public int[] field3759 = new int[class197.field2941];

    @OriginalMember(owner = "client!lfa", name = "db", descriptor = "[I")
    public int[] field3765 = new int[8];

    @OriginalMember(owner = "client!lfa", name = "M", descriptor = "[I")
    public int[] field3748 = new int[class197.field2941];

    @OriginalMember(owner = "client!lfa", name = "y", descriptor = "[I")
    public int[] field3734 = new int[class197.field2941];

    @OriginalMember(owner = "client!lfa", name = "bb", descriptor = "[I")
    public int[] field3763 = new int[class197.field2941];

    @OriginalMember(owner = "client!lfa", name = "r", descriptor = "Lsa;")
    private class203 field3727;

    @OriginalMember(owner = "client!lfa", name = "a", descriptor = "I")
    public int field3710;

    @OriginalMember(owner = "client!lfa", name = "D", descriptor = "Luk;")
    public class213 field3739;

    @OriginalMember(owner = "client!lfa", name = "z", descriptor = "Llq;")
    public class197 field3735;

    @OriginalMember(owner = "client!lfa", name = "K", descriptor = "Llq;")
    public class197 field3746;

    @OriginalMember(owner = "client!lfa", name = "Q", descriptor = "Llq;")
    public class197 field3752;

    @OriginalMember(owner = "client!lfa", name = "F", descriptor = "Llq;")
    public class197 field3741;

    @OriginalMember(owner = "client!lfa", name = "J", descriptor = "Llq;")
    public class197 field3745;

    @OriginalMember(owner = "client!lfa", name = "u", descriptor = "Llq;")
    public class197 field3730;

    @OriginalMember(owner = "client!lfa", name = "cb", descriptor = "Llq;")
    public class197 field3764;

    @OriginalMember(owner = "client!lfa", name = "A", descriptor = "Llq;")
    public class197 field3736;

    @OriginalMember(owner = "client!lfa", name = "N", descriptor = "Llq;")
    public class197 field3749;

    @OriginalMember(owner = "client!lfa", name = "w", descriptor = "Llq;")
    public class197 field3732;

    @OriginalMember(owner = "client!lfa", name = "Y", descriptor = "[I")
    public int[] field3760;

    @OriginalMember(owner = "client!lfa", name = "c", descriptor = "I")
    public static int field3712 = 1407;

    @OriginalMember(owner = "client!lfa", name = "b", descriptor = "I")
    public static int field3711 = 0;

    @OriginalMember(owner = "client!lfa", name = "e", descriptor = "I")
    public static int field3714;

    @OriginalMember(owner = "client!lfa", name = "h", descriptor = "I")
    public static int field3717;

    @OriginalMember(owner = "client!lfa", name = "i", descriptor = "I")
    public static int field3718;

    @OriginalMember(owner = "client!lfa", name = "l", descriptor = "I")
    public static int field3721;

    @OriginalMember(owner = "client!lfa", name = "n", descriptor = "I")
    public static int field3723;

    @OriginalMember(owner = "client!lfa", name = "q", descriptor = "I")
    public static int field3726;

    @OriginalMember(owner = "client!lfa", name = "s", descriptor = "I")
    public static int field3728;

    @OriginalMember(owner = "client!lfa", name = "v", descriptor = "I")
    public int field3731;

    @OriginalMember(owner = "client!lfa", name = "G", descriptor = "I")
    public int field3742;

    @OriginalMember(owner = "client!lfa", name = "V", descriptor = "I")
    public int field3757;

    @OriginalMember(owner = "client!lfa", name = "d", descriptor = "Ljava/lang/Runnable;")
    public Runnable field3713;

    @OriginalMember(owner = "client!lfa", name = "p", descriptor = "Z")
    public boolean field3725;

    @OriginalMember(owner = "client!lfa", name = "a", descriptor = "(II)Z")
    public static final boolean method1728(int arg0, int arg1) {
        field3718++;
        if (arg0 != -24205) {
            field3728 = 123;
        }
        return arg1 == 3 || arg1 == 7 || arg1 == 10;
    }

    @OriginalMember(owner = "client!lfa", name = "a", descriptor = "(B)V")
    public static final void method1729(byte arg0) {
        if (arg0 < 6) {
            method1732(-38);
        }
        if (class160.field2308 != null) {
            for (int var1 = 0; var1 < class445.field6359; var1++) {
                class160.field2308[var1] = null;
            }
            class160.field2308 = null;
        }
        field3723++;
        if (class633.field8932 != null) {
            for (int var2 = 0; var2 < class311.field4226; var2++) {
                class633.field8932[var2] = null;
            }
            class633.field8932 = null;
        }
        if (class43.field733 != null) {
            for (int var3 = 0; var3 < class495.field7114; var3++) {
                class43.field733[var3] = null;
            }
            class43.field733 = null;
        }
        class703.field9910 = null;
        class694.field9823 = null;
        class755.field10518 = null;
        class355.field5240 = -1;
        class165.field2353 = -1;
    }

    @OriginalMember(owner = "client!lfa", name = "a", descriptor = "(ILjava/io/File;I[B)V")
    public static final void method1730(int arg0, File arg1, int arg2, byte[] arg3) throws IOException {
        int var4 = 6 / ((-arg0 - 69) / 43);
        field3714++;
        DataInputStream var5 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg1)));
        try {
            var5.readFully(arg3, 0, arg2);
        } catch (EOFException var6) {
        }
        var5.close();
    }

    @OriginalMember(owner = "client!lfa", name = "b", descriptor = "(B)V")
    public final void method1731(byte arg0) {
        this.field3739 = new class213(this.field3727, this);
        if (arg0 < -49) {
            field3726++;
        }
    }

    @OriginalMember(owner = "client!lfa", name = "a", descriptor = "(I)I")
    public static final int method1732(int arg0) {
        field3717++;
        if (class270.field3833 == 1) {
            return class492.field7090;
        } else {
            if (arg0 != -7569) {
                method1732(47);
            }
            return class327.field4442;
        }
    }

    @OriginalMember(owner = "client!lfa", name = "a", descriptor = "(Ljava/lang/Runnable;B)V")
    public final void method1733(Runnable arg0, byte arg1) {
        int var3 = -54 % ((72 - arg1) / 50);
        this.field3713 = arg0;
        field3721++;
    }

    @OriginalMember(owner = "client!lfa", name = "<init>", descriptor = "(Lsa;)V")
    public class261(class203 arg0) {
        this.field3727 = arg0;
        this.field3710 = this.field3727.field3054 - 255;
        this.field3739 = new class213(arg0, this);
        this.field3735 = new class197(this.field3727);
        this.field3746 = new class197(this.field3727);
        this.field3752 = new class197(this.field3727);
        this.field3741 = new class197(this.field3727);
        this.field3745 = new class197(this.field3727);
        this.field3730 = new class197(this.field3727);
        this.field3764 = new class197(this.field3727);
        this.field3736 = new class197(this.field3727);
        this.field3749 = new class197(this.field3727);
        this.field3732 = new class197(this.field3727);
        this.field3760 = new int[class197.field2939];
        for (int var2 = 0; var2 < class197.field2939; var2++) {
            this.field3760[var2] = -1;
        }
    }
}
