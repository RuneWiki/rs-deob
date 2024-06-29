import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeap;
import jaclib.memory.heap.NativeHeapBuffer;
import jagex3.graphics2.hw.NativeInterface;
import java.awt.Canvas;
import java.awt.Dimension;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fo")
public abstract class class473 extends class635 {

    @OriginalMember(owner = "client!fo", name = "Ed", descriptor = "Lmfa;")
    private class562 field6765 = new class562();

    @OriginalMember(owner = "client!fo", name = "Qd", descriptor = "Z")
    public boolean field6777 = true;

    @OriginalMember(owner = "client!fo", name = "Nd", descriptor = "Lww;")
    public class667 field6774 = new class667();

    @OriginalMember(owner = "client!fo", name = "Sd", descriptor = "Lww;")
    public class667 field6779 = new class667();

    @OriginalMember(owner = "client!fo", name = "Td", descriptor = "Lww;")
    public class667 field6780 = new class667();

    @OriginalMember(owner = "client!fo", name = "Ud", descriptor = "Lww;")
    public class667 field6781 = new class667();

    @OriginalMember(owner = "client!fo", name = "Vd", descriptor = "Lww;")
    private class667 field6782 = new class667();

    @OriginalMember(owner = "client!fo", name = "Wd", descriptor = "Lww;")
    private class667 field6783 = new class667();

    @OriginalMember(owner = "client!fo", name = "ae", descriptor = "I")
    public int field6787 = 512;

    @OriginalMember(owner = "client!fo", name = "ce", descriptor = "Z")
    public boolean field6789 = true;

    @OriginalMember(owner = "client!fo", name = "Yd", descriptor = "I")
    private int field6785 = 0;

    @OriginalMember(owner = "client!fo", name = "pe", descriptor = "I")
    public int field6802 = -1;

    @OriginalMember(owner = "client!fo", name = "Be", descriptor = "I")
    public int field6814 = -1;

    @OriginalMember(owner = "client!fo", name = "qe", descriptor = "I")
    public int field6803 = 0;

    @OriginalMember(owner = "client!fo", name = "Je", descriptor = "Z")
    private boolean field6822 = false;

    @OriginalMember(owner = "client!fo", name = "Ae", descriptor = "Z")
    public boolean field6813 = true;

    @OriginalMember(owner = "client!fo", name = "Ke", descriptor = "I")
    public int field6823 = 50;

    @OriginalMember(owner = "client!fo", name = "Te", descriptor = "Z")
    public boolean field6832 = true;

    @OriginalMember(owner = "client!fo", name = "Ve", descriptor = "I")
    private int field6834 = 1;

    @OriginalMember(owner = "client!fo", name = "Ne", descriptor = "I")
    public int field6826 = 0;

    @OriginalMember(owner = "client!fo", name = "de", descriptor = "Z")
    public boolean field6790 = false;

    @OriginalMember(owner = "client!fo", name = "Ze", descriptor = "I")
    private int field6838 = 0;

    @OriginalMember(owner = "client!fo", name = "Oe", descriptor = "[F")
    public float[] field6827 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

    @OriginalMember(owner = "client!fo", name = "ne", descriptor = "[Lor;")
    private class584[] field6800 = new class584[10];

    @OriginalMember(owner = "client!fo", name = "De", descriptor = "I")
    public int field6816 = 0;

    @OriginalMember(owner = "client!fo", name = "ef", descriptor = "I")
    private int field6843 = -1;

    @OriginalMember(owner = "client!fo", name = "xf", descriptor = "F")
    public float field6861 = 1.0F;

    @OriginalMember(owner = "client!fo", name = "Zd", descriptor = "[F")
    private float[] field6786 = new float[16];

    @OriginalMember(owner = "client!fo", name = "xe", descriptor = "I")
    public int field6810 = 0;

    @OriginalMember(owner = "client!fo", name = "We", descriptor = "Z")
    public boolean field6835 = false;

    @OriginalMember(owner = "client!fo", name = "cf", descriptor = "[F")
    private float[] field6841 = new float[16];

    @OriginalMember(owner = "client!fo", name = "qf", descriptor = "F")
    public float field6854 = -1.0F;

    @OriginalMember(owner = "client!fo", name = "pf", descriptor = "I")
    public int field6853 = 0;

    @OriginalMember(owner = "client!fo", name = "He", descriptor = "Z")
    public boolean field6820 = true;

    @OriginalMember(owner = "client!fo", name = "Ee", descriptor = "F")
    public float field6817 = 1.0F;

    @OriginalMember(owner = "client!fo", name = "nf", descriptor = "I")
    public int field6851 = -1;

    @OriginalMember(owner = "client!fo", name = "Qe", descriptor = "I")
    public int field6829 = 0;

    @OriginalMember(owner = "client!fo", name = "vf", descriptor = "[F")
    public float[] field6859 = new float[] { 0.0F, 0.0F, -1.0F, 0.0F };

    @OriginalMember(owner = "client!fo", name = "of", descriptor = "F")
    public float field6852 = -1.0F;

    @OriginalMember(owner = "client!fo", name = "Se", descriptor = "I")
    private int field6831 = 0;

    @OriginalMember(owner = "client!fo", name = "Cf", descriptor = "F")
    public float field6866 = 3584.0F;

    @OriginalMember(owner = "client!fo", name = "Gf", descriptor = "F")
    public float field6870 = 3584.0F;

    @OriginalMember(owner = "client!fo", name = "ff", descriptor = "Llu;")
    public class651 field6844 = class482.field7053;

    @OriginalMember(owner = "client!fo", name = "Bf", descriptor = "I")
    private int field6865 = 0;

    @OriginalMember(owner = "client!fo", name = "sf", descriptor = "[F")
    private float[] field6856 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!fo", name = "gf", descriptor = "I")
    public int field6845 = 512;

    @OriginalMember(owner = "client!fo", name = "uf", descriptor = "I")
    public int field6858 = 0;

    @OriginalMember(owner = "client!fo", name = "lf", descriptor = "Z")
    private boolean field6849 = false;

    @OriginalMember(owner = "client!fo", name = "kf", descriptor = "F")
    private float field6848 = 3000.0F;

    @OriginalMember(owner = "client!fo", name = "wf", descriptor = "[F")
    private float[] field6860 = new float[16];

    @OriginalMember(owner = "client!fo", name = "ye", descriptor = "[F")
    private float[] field6811 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

    @OriginalMember(owner = "client!fo", name = "Re", descriptor = "Z")
    public boolean field6830 = false;

    @OriginalMember(owner = "client!fo", name = "tf", descriptor = "Z")
    private boolean field6857 = false;

    @OriginalMember(owner = "client!fo", name = "bf", descriptor = "I")
    public int field6840 = 128;

    @OriginalMember(owner = "client!fo", name = "Of", descriptor = "I")
    public int field6878 = 3584;

    @OriginalMember(owner = "client!fo", name = "Kf", descriptor = "Lbd;")
    public class57 field6874 = class361.field4715;

    @OriginalMember(owner = "client!fo", name = "Ye", descriptor = "Z")
    public boolean field6837 = true;

    @OriginalMember(owner = "client!fo", name = "he", descriptor = "Z")
    private boolean field6794 = false;

    @OriginalMember(owner = "client!fo", name = "mf", descriptor = "I")
    public int field6850 = 0;

    @OriginalMember(owner = "client!fo", name = "rf", descriptor = "[F")
    private float[] field6855 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

    @OriginalMember(owner = "client!fo", name = "yf", descriptor = "I")
    public int field6862 = 0;

    @OriginalMember(owner = "client!fo", name = "jf", descriptor = "I")
    private int field6847 = -1;

    @OriginalMember(owner = "client!fo", name = "ze", descriptor = "I")
    public int field6812 = 0;

    @OriginalMember(owner = "client!fo", name = "Af", descriptor = "F")
    public float field6864 = 1.0F;

    @OriginalMember(owner = "client!fo", name = "ie", descriptor = "I")
    public int field6795 = 3;

    @OriginalMember(owner = "client!fo", name = "ee", descriptor = "I")
    public int field6791 = 8;

    @OriginalMember(owner = "client!fo", name = "Ge", descriptor = "Z")
    public boolean field6819 = false;

    @OriginalMember(owner = "client!fo", name = "Jf", descriptor = "F")
    public float field6873 = 1.0F;

    @OriginalMember(owner = "client!fo", name = "Ce", descriptor = "I")
    private int field6815 = 16777215;

    @OriginalMember(owner = "client!fo", name = "Qf", descriptor = "F")
    private float field6880 = 1.0F;

    @OriginalMember(owner = "client!fo", name = "Ff", descriptor = "Z")
    private boolean field6869 = false;

    @OriginalMember(owner = "client!fo", name = "Nf", descriptor = "[F")
    public float[] field6877 = this.field6856;

    @OriginalMember(owner = "client!fo", name = "be", descriptor = "Ljaclib/memory/Stream;")
    private Stream field6788 = new Stream();

    @OriginalMember(owner = "client!fo", name = "fg", descriptor = "Lww;")
    private class667 field6895 = new class667();

    @OriginalMember(owner = "client!fo", name = "Ad", descriptor = "Ljava/awt/Canvas;")
    public Canvas field6761;

    @OriginalMember(owner = "client!fo", name = "Uc", descriptor = "Ljava/awt/Canvas;")
    private Canvas field6729;

    @OriginalMember(owner = "client!fo", name = "ub", descriptor = "Ljo;")
    public class303 field6651;

    @OriginalMember(owner = "client!fo", name = "se", descriptor = "I")
    public int field6805;

    @OriginalMember(owner = "client!fo", name = "ib", descriptor = "Ljava/lang/Object;")
    public Object field6639;

    @OriginalMember(owner = "client!fo", name = "pc", descriptor = "Ljava/lang/Object;")
    private Object field6698;

    @OriginalMember(owner = "client!fo", name = "mc", descriptor = "I")
    private int field6695;

    @OriginalMember(owner = "client!fo", name = "bc", descriptor = "I")
    public int field6684;

    @OriginalMember(owner = "client!fo", name = "p", descriptor = "I")
    private int field6594;

    @OriginalMember(owner = "client!fo", name = "P", descriptor = "I")
    public int field6620;

    @OriginalMember(owner = "client!fo", name = "Me", descriptor = "I")
    public int field6825;

    @OriginalMember(owner = "client!fo", name = "df", descriptor = "Lej;")
    private class109 field6842;

    @OriginalMember(owner = "client!fo", name = "wd", descriptor = "Ljagex3/graphics2/hw/NativeInterface;")
    public NativeInterface field6757;

    @OriginalMember(owner = "client!fo", name = "G", descriptor = "Z")
    public static boolean field6611 = false;

    @OriginalMember(owner = "client!fo", name = "Xd", descriptor = "F")
    public float field6784;

    @OriginalMember(owner = "client!fo", name = "fe", descriptor = "F")
    public float field6792;

    @OriginalMember(owner = "client!fo", name = "ge", descriptor = "F")
    public float field6793;

    @OriginalMember(owner = "client!fo", name = "le", descriptor = "F")
    private float field6798;

    @OriginalMember(owner = "client!fo", name = "re", descriptor = "F")
    public float field6804;

    @OriginalMember(owner = "client!fo", name = "ve", descriptor = "F")
    private float field6808;

    @OriginalMember(owner = "client!fo", name = "Ie", descriptor = "F")
    public float field6821;

    @OriginalMember(owner = "client!fo", name = "af", descriptor = "F")
    private float field6839;

    @OriginalMember(owner = "client!fo", name = "Lf", descriptor = "F")
    public float field6875;

    @OriginalMember(owner = "client!fo", name = "q", descriptor = "I")
    public static int field6595;

    @OriginalMember(owner = "client!fo", name = "r", descriptor = "I")
    public static int field6596;

    @OriginalMember(owner = "client!fo", name = "s", descriptor = "I")
    public static int field6597;

    @OriginalMember(owner = "client!fo", name = "t", descriptor = "I")
    public static int field6598;

    @OriginalMember(owner = "client!fo", name = "u", descriptor = "I")
    public static int field6599;

    @OriginalMember(owner = "client!fo", name = "v", descriptor = "I")
    public static int field6600;

    @OriginalMember(owner = "client!fo", name = "w", descriptor = "I")
    public static int field6601;

    @OriginalMember(owner = "client!fo", name = "x", descriptor = "I")
    public static int field6602;

    @OriginalMember(owner = "client!fo", name = "y", descriptor = "I")
    public static int field6603;

    @OriginalMember(owner = "client!fo", name = "z", descriptor = "I")
    public static int field6604;

    @OriginalMember(owner = "client!fo", name = "A", descriptor = "I")
    public static int field6605;

    @OriginalMember(owner = "client!fo", name = "B", descriptor = "I")
    public static int field6606;

    @OriginalMember(owner = "client!fo", name = "C", descriptor = "I")
    public static int field6607;

    @OriginalMember(owner = "client!fo", name = "D", descriptor = "I")
    public static int field6608;

    @OriginalMember(owner = "client!fo", name = "E", descriptor = "I")
    public static int field6609;

    @OriginalMember(owner = "client!fo", name = "F", descriptor = "I")
    public static int field6610;

    @OriginalMember(owner = "client!fo", name = "H", descriptor = "I")
    public static int field6612;

    @OriginalMember(owner = "client!fo", name = "I", descriptor = "I")
    public static int field6613;

    @OriginalMember(owner = "client!fo", name = "J", descriptor = "I")
    public static int field6614;

    @OriginalMember(owner = "client!fo", name = "K", descriptor = "I")
    public static int field6615;

    @OriginalMember(owner = "client!fo", name = "L", descriptor = "I")
    public static int field6616;

    @OriginalMember(owner = "client!fo", name = "M", descriptor = "I")
    public static int field6617;

    @OriginalMember(owner = "client!fo", name = "N", descriptor = "I")
    public static int field6618;

    @OriginalMember(owner = "client!fo", name = "O", descriptor = "I")
    public static int field6619;

    @OriginalMember(owner = "client!fo", name = "Q", descriptor = "I")
    public static int field6621;

    @OriginalMember(owner = "client!fo", name = "R", descriptor = "I")
    public static int field6622;

    @OriginalMember(owner = "client!fo", name = "S", descriptor = "I")
    public static int field6623;

    @OriginalMember(owner = "client!fo", name = "T", descriptor = "I")
    public static int field6624;

    @OriginalMember(owner = "client!fo", name = "U", descriptor = "I")
    public static int field6625;

    @OriginalMember(owner = "client!fo", name = "V", descriptor = "I")
    public static int field6626;

    @OriginalMember(owner = "client!fo", name = "W", descriptor = "I")
    public static int field6627;

    @OriginalMember(owner = "client!fo", name = "X", descriptor = "I")
    public static int field6628;

    @OriginalMember(owner = "client!fo", name = "Y", descriptor = "I")
    public static int field6629;

    @OriginalMember(owner = "client!fo", name = "Z", descriptor = "I")
    public static int field6630;

    @OriginalMember(owner = "client!fo", name = "ab", descriptor = "I")
    public static int field6631;

    @OriginalMember(owner = "client!fo", name = "bb", descriptor = "I")
    public static int field6632;

    @OriginalMember(owner = "client!fo", name = "cb", descriptor = "I")
    public static int field6633;

    @OriginalMember(owner = "client!fo", name = "db", descriptor = "I")
    public static int field6634;

    @OriginalMember(owner = "client!fo", name = "eb", descriptor = "I")
    public static int field6635;

    @OriginalMember(owner = "client!fo", name = "fb", descriptor = "I")
    public static int field6636;

    @OriginalMember(owner = "client!fo", name = "gb", descriptor = "I")
    public static int field6637;

    @OriginalMember(owner = "client!fo", name = "hb", descriptor = "I")
    public static int field6638;

    @OriginalMember(owner = "client!fo", name = "jb", descriptor = "I")
    public static int field6640;

    @OriginalMember(owner = "client!fo", name = "kb", descriptor = "I")
    public static int field6641;

    @OriginalMember(owner = "client!fo", name = "lb", descriptor = "I")
    public static int field6642;

    @OriginalMember(owner = "client!fo", name = "mb", descriptor = "I")
    public static int field6643;

    @OriginalMember(owner = "client!fo", name = "nb", descriptor = "I")
    public static int field6644;

    @OriginalMember(owner = "client!fo", name = "ob", descriptor = "I")
    public static int field6645;

    @OriginalMember(owner = "client!fo", name = "pb", descriptor = "I")
    public static int field6646;

    @OriginalMember(owner = "client!fo", name = "qb", descriptor = "I")
    public static int field6647;

    @OriginalMember(owner = "client!fo", name = "rb", descriptor = "I")
    public static int field6648;

    @OriginalMember(owner = "client!fo", name = "sb", descriptor = "I")
    public static int field6649;

    @OriginalMember(owner = "client!fo", name = "tb", descriptor = "I")
    public static int field6650;

    @OriginalMember(owner = "client!fo", name = "vb", descriptor = "I")
    public static int field6652;

    @OriginalMember(owner = "client!fo", name = "wb", descriptor = "I")
    public static int field6653;

    @OriginalMember(owner = "client!fo", name = "xb", descriptor = "I")
    public static int field6654;

    @OriginalMember(owner = "client!fo", name = "yb", descriptor = "I")
    public static int field6655;

    @OriginalMember(owner = "client!fo", name = "zb", descriptor = "I")
    public static int field6656;

    @OriginalMember(owner = "client!fo", name = "Ab", descriptor = "I")
    public static int field6657;

    @OriginalMember(owner = "client!fo", name = "Bb", descriptor = "I")
    public static int field6658;

    @OriginalMember(owner = "client!fo", name = "Cb", descriptor = "I")
    public static int field6659;

    @OriginalMember(owner = "client!fo", name = "Db", descriptor = "I")
    public static int field6660;

    @OriginalMember(owner = "client!fo", name = "Eb", descriptor = "I")
    public static int field6661;

    @OriginalMember(owner = "client!fo", name = "Fb", descriptor = "I")
    public static int field6662;

    @OriginalMember(owner = "client!fo", name = "Gb", descriptor = "I")
    public static int field6663;

    @OriginalMember(owner = "client!fo", name = "Hb", descriptor = "I")
    public static int field6664;

    @OriginalMember(owner = "client!fo", name = "Ib", descriptor = "I")
    public static int field6665;

    @OriginalMember(owner = "client!fo", name = "Jb", descriptor = "I")
    public static int field6666;

    @OriginalMember(owner = "client!fo", name = "Kb", descriptor = "I")
    public static int field6667;

    @OriginalMember(owner = "client!fo", name = "Lb", descriptor = "I")
    public static int field6668;

    @OriginalMember(owner = "client!fo", name = "Mb", descriptor = "I")
    public static int field6669;

    @OriginalMember(owner = "client!fo", name = "Nb", descriptor = "I")
    public static int field6670;

    @OriginalMember(owner = "client!fo", name = "Ob", descriptor = "I")
    public static int field6671;

    @OriginalMember(owner = "client!fo", name = "Pb", descriptor = "I")
    public static int field6672;

    @OriginalMember(owner = "client!fo", name = "Qb", descriptor = "I")
    public static int field6673;

    @OriginalMember(owner = "client!fo", name = "Rb", descriptor = "I")
    public static int field6674;

    @OriginalMember(owner = "client!fo", name = "Sb", descriptor = "I")
    public static int field6675;

    @OriginalMember(owner = "client!fo", name = "Tb", descriptor = "I")
    public static int field6676;

    @OriginalMember(owner = "client!fo", name = "Ub", descriptor = "I")
    public static int field6677;

    @OriginalMember(owner = "client!fo", name = "Vb", descriptor = "I")
    public static int field6678;

    @OriginalMember(owner = "client!fo", name = "Wb", descriptor = "I")
    public static int field6679;

    @OriginalMember(owner = "client!fo", name = "Xb", descriptor = "I")
    public static int field6680;

    @OriginalMember(owner = "client!fo", name = "Yb", descriptor = "I")
    public static int field6681;

    @OriginalMember(owner = "client!fo", name = "Zb", descriptor = "I")
    public static int field6682;

    @OriginalMember(owner = "client!fo", name = "ac", descriptor = "I")
    public static int field6683;

    @OriginalMember(owner = "client!fo", name = "cc", descriptor = "I")
    public static int field6685;

    @OriginalMember(owner = "client!fo", name = "dc", descriptor = "I")
    public static int field6686;

    @OriginalMember(owner = "client!fo", name = "ec", descriptor = "I")
    public static int field6687;

    @OriginalMember(owner = "client!fo", name = "fc", descriptor = "I")
    public static int field6688;

    @OriginalMember(owner = "client!fo", name = "gc", descriptor = "I")
    public static int field6689;

    @OriginalMember(owner = "client!fo", name = "hc", descriptor = "I")
    public static int field6690;

    @OriginalMember(owner = "client!fo", name = "ic", descriptor = "I")
    public static int field6691;

    @OriginalMember(owner = "client!fo", name = "kc", descriptor = "I")
    public static int field6693;

    @OriginalMember(owner = "client!fo", name = "lc", descriptor = "I")
    public static int field6694;

    @OriginalMember(owner = "client!fo", name = "nc", descriptor = "I")
    public static int field6696;

    @OriginalMember(owner = "client!fo", name = "oc", descriptor = "I")
    public static int field6697;

    @OriginalMember(owner = "client!fo", name = "qc", descriptor = "I")
    public static int field6699;

    @OriginalMember(owner = "client!fo", name = "rc", descriptor = "I")
    public static int field6700;

    @OriginalMember(owner = "client!fo", name = "sc", descriptor = "I")
    public static int field6701;

    @OriginalMember(owner = "client!fo", name = "tc", descriptor = "I")
    public static int field6702;

    @OriginalMember(owner = "client!fo", name = "uc", descriptor = "I")
    public static int field6703;

    @OriginalMember(owner = "client!fo", name = "vc", descriptor = "I")
    public static int field6704;

    @OriginalMember(owner = "client!fo", name = "wc", descriptor = "I")
    public static int field6705;

    @OriginalMember(owner = "client!fo", name = "xc", descriptor = "I")
    public static int field6706;

    @OriginalMember(owner = "client!fo", name = "zc", descriptor = "I")
    public static int field6708;

    @OriginalMember(owner = "client!fo", name = "Ac", descriptor = "I")
    public static int field6709;

    @OriginalMember(owner = "client!fo", name = "Bc", descriptor = "I")
    public static int field6710;

    @OriginalMember(owner = "client!fo", name = "Cc", descriptor = "I")
    public static int field6711;

    @OriginalMember(owner = "client!fo", name = "Dc", descriptor = "I")
    public static int field6712;

    @OriginalMember(owner = "client!fo", name = "Ec", descriptor = "I")
    public static int field6713;

    @OriginalMember(owner = "client!fo", name = "Fc", descriptor = "I")
    public static int field6714;

    @OriginalMember(owner = "client!fo", name = "Gc", descriptor = "I")
    public static int field6715;

    @OriginalMember(owner = "client!fo", name = "Hc", descriptor = "I")
    public static int field6716;

    @OriginalMember(owner = "client!fo", name = "Ic", descriptor = "I")
    public static int field6717;

    @OriginalMember(owner = "client!fo", name = "Jc", descriptor = "I")
    public static int field6718;

    @OriginalMember(owner = "client!fo", name = "Kc", descriptor = "I")
    public static int field6719;

    @OriginalMember(owner = "client!fo", name = "Lc", descriptor = "I")
    public static int field6720;

    @OriginalMember(owner = "client!fo", name = "Mc", descriptor = "I")
    public static int field6721;

    @OriginalMember(owner = "client!fo", name = "Nc", descriptor = "I")
    public static int field6722;

    @OriginalMember(owner = "client!fo", name = "Oc", descriptor = "I")
    public static int field6723;

    @OriginalMember(owner = "client!fo", name = "Pc", descriptor = "I")
    public static int field6724;

    @OriginalMember(owner = "client!fo", name = "Qc", descriptor = "I")
    public static int field6725;

    @OriginalMember(owner = "client!fo", name = "Rc", descriptor = "I")
    public static int field6726;

    @OriginalMember(owner = "client!fo", name = "Sc", descriptor = "I")
    public static int field6727;

    @OriginalMember(owner = "client!fo", name = "Tc", descriptor = "I")
    public static int field6728;

    @OriginalMember(owner = "client!fo", name = "Vc", descriptor = "I")
    public static int field6730;

    @OriginalMember(owner = "client!fo", name = "Xc", descriptor = "I")
    public static int field6732;

    @OriginalMember(owner = "client!fo", name = "Yc", descriptor = "I")
    public static int field6733;

    @OriginalMember(owner = "client!fo", name = "Zc", descriptor = "I")
    public static int field6734;

    @OriginalMember(owner = "client!fo", name = "ad", descriptor = "I")
    public static int field6735;

    @OriginalMember(owner = "client!fo", name = "bd", descriptor = "I")
    public static int field6736;

    @OriginalMember(owner = "client!fo", name = "cd", descriptor = "I")
    public static int field6737;

    @OriginalMember(owner = "client!fo", name = "dd", descriptor = "I")
    public static int field6738;

    @OriginalMember(owner = "client!fo", name = "fd", descriptor = "I")
    public static int field6740;

    @OriginalMember(owner = "client!fo", name = "gd", descriptor = "I")
    public static int field6741;

    @OriginalMember(owner = "client!fo", name = "hd", descriptor = "I")
    public static int field6742;

    @OriginalMember(owner = "client!fo", name = "id", descriptor = "I")
    public static int field6743;

    @OriginalMember(owner = "client!fo", name = "jd", descriptor = "I")
    public static int field6744;

    @OriginalMember(owner = "client!fo", name = "kd", descriptor = "I")
    public static int field6745;

    @OriginalMember(owner = "client!fo", name = "ld", descriptor = "I")
    public static int field6746;

    @OriginalMember(owner = "client!fo", name = "md", descriptor = "I")
    public static int field6747;

    @OriginalMember(owner = "client!fo", name = "nd", descriptor = "I")
    public static int field6748;

    @OriginalMember(owner = "client!fo", name = "od", descriptor = "I")
    public static int field6749;

    @OriginalMember(owner = "client!fo", name = "pd", descriptor = "I")
    public static int field6750;

    @OriginalMember(owner = "client!fo", name = "qd", descriptor = "I")
    public static int field6751;

    @OriginalMember(owner = "client!fo", name = "rd", descriptor = "I")
    public static int field6752;

    @OriginalMember(owner = "client!fo", name = "sd", descriptor = "I")
    public static int field6753;

    @OriginalMember(owner = "client!fo", name = "td", descriptor = "I")
    public static int field6754;

    @OriginalMember(owner = "client!fo", name = "ud", descriptor = "I")
    public static int field6755;

    @OriginalMember(owner = "client!fo", name = "vd", descriptor = "I")
    public static int field6756;

    @OriginalMember(owner = "client!fo", name = "xd", descriptor = "I")
    public static int field6758;

    @OriginalMember(owner = "client!fo", name = "yd", descriptor = "I")
    public static int field6759;

    @OriginalMember(owner = "client!fo", name = "zd", descriptor = "I")
    public static int field6760;

    @OriginalMember(owner = "client!fo", name = "Bd", descriptor = "I")
    public static int field6762;

    @OriginalMember(owner = "client!fo", name = "Cd", descriptor = "I")
    public static int field6763;

    @OriginalMember(owner = "client!fo", name = "Dd", descriptor = "I")
    public static int field6764;

    @OriginalMember(owner = "client!fo", name = "Fd", descriptor = "I")
    public static int field6766;

    @OriginalMember(owner = "client!fo", name = "Gd", descriptor = "I")
    public static int field6767;

    @OriginalMember(owner = "client!fo", name = "Hd", descriptor = "I")
    public static int field6768;

    @OriginalMember(owner = "client!fo", name = "Id", descriptor = "I")
    public static int field6769;

    @OriginalMember(owner = "client!fo", name = "Jd", descriptor = "I")
    public static int field6770;

    @OriginalMember(owner = "client!fo", name = "Kd", descriptor = "I")
    public static int field6771;

    @OriginalMember(owner = "client!fo", name = "Ld", descriptor = "I")
    public static int field6772;

    @OriginalMember(owner = "client!fo", name = "Md", descriptor = "I")
    public static int field6773;

    @OriginalMember(owner = "client!fo", name = "Od", descriptor = "I")
    public int field6775;

    @OriginalMember(owner = "client!fo", name = "Pd", descriptor = "I")
    public int field6776;

    @OriginalMember(owner = "client!fo", name = "Rd", descriptor = "I")
    public int field6778;

    @OriginalMember(owner = "client!fo", name = "ke", descriptor = "I")
    public int field6797;

    @OriginalMember(owner = "client!fo", name = "ue", descriptor = "I")
    private int field6807;

    @OriginalMember(owner = "client!fo", name = "Le", descriptor = "I")
    public int field6824;

    @OriginalMember(owner = "client!fo", name = "hf", descriptor = "I")
    private int field6846;

    @OriginalMember(owner = "client!fo", name = "Df", descriptor = "I")
    public int field6867;

    @OriginalMember(owner = "client!fo", name = "Mf", descriptor = "I")
    public int field6876;

    @OriginalMember(owner = "client!fo", name = "Sf", descriptor = "I")
    public int field6882;

    @OriginalMember(owner = "client!fo", name = "Tf", descriptor = "I")
    public int field6883;

    @OriginalMember(owner = "client!fo", name = "Uf", descriptor = "I")
    public int field6884;

    @OriginalMember(owner = "client!fo", name = "Vf", descriptor = "I")
    public int field6885;

    @OriginalMember(owner = "client!fo", name = "rg", descriptor = "I")
    private int field6907;

    @OriginalMember(owner = "client!fo", name = "peer", descriptor = "J")
    public long peer;

    @OriginalMember(owner = "client!fo", name = "If", descriptor = "Lld;")
    public class155 field6872;

    @OriginalMember(owner = "client!fo", name = "Yf", descriptor = "Ltj;")
    private class180 field6888;

    @OriginalMember(owner = "client!fo", name = "ag", descriptor = "Ltfa;")
    private class31 field6890;

    @OriginalMember(owner = "client!fo", name = "pg", descriptor = "Ltfa;")
    private class31 field6905;

    @OriginalMember(owner = "client!fo", name = "cg", descriptor = "Leh;")
    public class328 field6892;

    @OriginalMember(owner = "client!fo", name = "hg", descriptor = "Leh;")
    private class328 field6897;

    @OriginalMember(owner = "client!fo", name = "ig", descriptor = "Leh;")
    public class328 field6898;

    @OriginalMember(owner = "client!fo", name = "jg", descriptor = "Leh;")
    public class328 field6899;

    @OriginalMember(owner = "client!fo", name = "mg", descriptor = "Leh;")
    public class328 field6902;

    @OriginalMember(owner = "client!fo", name = "og", descriptor = "Leh;")
    private class328 field6904;

    @OriginalMember(owner = "client!fo", name = "we", descriptor = "Lor;")
    private class584 field6809;

    @OriginalMember(owner = "client!fo", name = "Wf", descriptor = "Lge;")
    public class649 field6886;

    @OriginalMember(owner = "client!fo", name = "Xf", descriptor = "Lge;")
    public class649 field6887;

    @OriginalMember(owner = "client!fo", name = "Zf", descriptor = "Lge;")
    public class649 field6889;

    @OriginalMember(owner = "client!fo", name = "bg", descriptor = "Lge;")
    public class649 field6891;

    @OriginalMember(owner = "client!fo", name = "dg", descriptor = "Lge;")
    public class649 field6893;

    @OriginalMember(owner = "client!fo", name = "eg", descriptor = "Lge;")
    public class649 field6894;

    @OriginalMember(owner = "client!fo", name = "gg", descriptor = "Lge;")
    public class649 field6896;

    @OriginalMember(owner = "client!fo", name = "kg", descriptor = "Lge;")
    public class649 field6900;

    @OriginalMember(owner = "client!fo", name = "lg", descriptor = "Lge;")
    public class649 field6901;

    @OriginalMember(owner = "client!fo", name = "ng", descriptor = "Lge;")
    public class649 field6903;

    @OriginalMember(owner = "client!fo", name = "ed", descriptor = "Lie;")
    public class6 field6739;

    @OriginalMember(owner = "client!fo", name = "Pf", descriptor = "Ltt;")
    private class80 field6879;

    @OriginalMember(owner = "client!fo", name = "Ue", descriptor = "Ldba;")
    private class81 field6833;

    @OriginalMember(owner = "client!fo", name = "Wc", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field6731;

    @OriginalMember(owner = "client!fo", name = "jc", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    public NativeHeapBuffer field6692;

    @OriginalMember(owner = "client!fo", name = "yc", descriptor = "Ljava/util/Hashtable;")
    private Hashtable field6707;

    @OriginalMember(owner = "client!fo", name = "me", descriptor = "Z")
    public boolean field6799;

    @OriginalMember(owner = "client!fo", name = "te", descriptor = "Z")
    public boolean field6806;

    @OriginalMember(owner = "client!fo", name = "Xe", descriptor = "Z")
    public boolean field6836;

    @OriginalMember(owner = "client!fo", name = "zf", descriptor = "Z")
    public boolean field6863;

    @OriginalMember(owner = "client!fo", name = "Hf", descriptor = "Z")
    public boolean field6871;

    @OriginalMember(owner = "client!fo", name = "qg", descriptor = "Z")
    public boolean field6906;

    @OriginalMember(owner = "client!fo", name = "Ef", descriptor = "[Lld;")
    private class155[] field6868;

    @OriginalMember(owner = "client!fo", name = "Fe", descriptor = "[Lvw;")
    public class274[] field6818;

    @OriginalMember(owner = "client!fo", name = "je", descriptor = "[Loh;")
    public class368[] field6796;

    @OriginalMember(owner = "client!fo", name = "Pe", descriptor = "[Loh;")
    public class368[] field6828;

    @OriginalMember(owner = "client!fo", name = "oe", descriptor = "[Lod;")
    public class463[] field6801;

    @OriginalMember(owner = "client!fo", name = "Rf", descriptor = "[Lww;")
    public class667[] field6881;

    @OriginalMember(owner = "client!fo", name = "c", descriptor = "(I)I", line = 3)
    public final int method2682(int arg0) {
        if (arg0 < 24) {
            this.field6776 = 44;
        }
        ++field6751;
        return this.field6785;
    }

    @OriginalMember(owner = "client!fo", name = "w", descriptor = "()Z", line = 14)
    public final boolean method276() {
        ++field6679;
        return true;
    }

    @OriginalMember(owner = "client!fo", name = "i", descriptor = "(I)V", line = 26)
    private final void method2683(int arg0) {
        int var2 = 108 % ((-33 - arg0) / 57);
        ++field6637;
        this.field6857 = false;
        this.method2721(96);
        if (class625.field8866 == this.field6844) {
            this.method2704(-25907);
        }
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(I[Lod;)V", line = 42)
    public final void method355(int arg0, class463[] arg1) {
        ++field6754;
        for (int var3 = 0; ~arg0 < ~var3; ++var3) {
            this.field6801[var3] = arg1[var3];
        }
        this.field6876 = arg0;
        if (this.field6844.method3673(-1)) {
            this.method1151((byte) 118);
        }
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(BIZ)Ljaclib/memory/heap/NativeHeapBuffer;", line = 60)
    public final NativeHeapBuffer method2684(byte arg0, int arg1, boolean arg2) {
        int var4 = -128 / ((arg0 - 33) / 40);
        ++field6661;
        return this.field6731.method3431(arg1, arg2);
    }

    @OriginalMember(owner = "client!fo", name = "h", descriptor = "()V", line = 72)
    public void method295() {
        if (!this.field6794) {
            for (class270 var1 = this.field6765.method3174((byte) 49); var1 != null; var1 = this.field6765.method3168(false)) {
                ((class153) var1).method836((byte) 108);
            }
            Enumeration var2 = this.field6707.keys();
            while (var2.hasMoreElements()) {
                Canvas var3 = (Canvas) var2.nextElement();
                this.method1191(this.field6707.get(var3), 121, var3);
            }
            class462.method2627((byte) 83, true, false);
            this.field6757.release();
            this.field6794 = true;
        }
        ++field6604;
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(Led;[Laaa;Z)Lta;", line = 107)
    public final class195 method349(class645 arg0, class563[] arg1, boolean arg2) {
        ++field6663;
        return new class171(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!fo", name = "j", descriptor = "(I)V", line = 116)
    public final void method2685(int arg0) {
        ++field6699;
        Enumeration var2 = this.field6707.keys();
        while (var2.hasMoreElements()) {
            Canvas var3 = (Canvas) var2.nextElement();
            this.method1191(this.field6707.get(var3), arg0 + 123, var3);
        }
        this.field6905.method166((byte) 111);
        this.field6890.method166((byte) -126);
        this.field6900.method3654(0);
        this.field6893.method3654(0);
        this.field6903.method3654(arg0 + -1);
        if (arg0 == 1) {
            this.field6891.method3654(0);
            this.field6887.method3654(0);
            this.field6879.method515(false);
            this.field6888.method166((byte) 80);
        }
    }

    @OriginalMember(owner = "client!fo", name = "k", descriptor = "(I)V", line = 146)
    private final void method2686(int arg0) {
        ++field6720;
        if (arg0 != -8) {
            this.method2717((byte) -28);
        }
        if (class599.field8513 != this.field6844) {
            class651 var2 = this.field6844;
            this.field6844 = class599.field8513;
            if (var2.method3673(-1)) {
                this.method2748((byte) 119);
            }
            this.method2715(arg0 ^ -124);
            this.field6877 = this.field6786;
            this.method2704(arg0 + -25899);
            this.field6846 &= -25;
        }
    }

    @OriginalMember(owner = "client!fo", name = "x", descriptor = "()Z", line = 172)
    public final boolean method360() {
        ++field6693;
        return true;
    }

    @OriginalMember(owner = "client!fo", name = "F", descriptor = "()V", line = 181)
    public final void method378() {
        this.field6858 = 0;
        this.field6826 = this.field6620;
        this.field6853 = 0;
        ++field6697;
        this.field6803 = this.field6684;
        if (this.field6906) {
            this.field6906 = false;
            this.method1184(0);
        }
        this.method2724(120);
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(Laaa;Z)Lxa;", line = 204)
    public final class458 method351(class563 arg0, boolean arg1) {
        ++field6657;
        class458 var10;
        if (arg0.field8002 != 0 && ~arg0.field8005 != -1) {
            int[] var3 = new int[arg0.field8005 * arg0.field8002];
            int var4 = 0;
            int var5 = 0;
            if (arg0.field8001 == null) {
                for (int var6 = 0; var6 < arg0.field8005; ++var6) {
                    for (int var7 = 0; ~var7 > ~arg0.field8002; ++var7) {
                        int var8 = arg0.field8000[arg0.field8006[var4++] & 255];
                        var3[var5++] = var8 != 0 ? class139.method776(var8, -16777216) : 0;
                    }
                }
            } else {
                for (int var9 = 0; arg0.field8005 > var9; ++var9) {
                    for (int var11 = 0; arg0.field8002 > var11; ++var11) {
                        var3[var5++] = class139.method776(arg0.field8001[var4] << 24, arg0.field8000[class203.method1246(arg0.field8006[var4], 255)]);
                        ++var4;
                    }
                }
            }
            var10 = this.method326(var3, 0, arg0.field8002, arg0.field8002, arg0.field8005);
        } else {
            var10 = this.method326(new int[1], 0, 1, 1, 1);
        }
        var10.method409(arg0.field8004, arg0.field8007, arg0.field8003, arg0.field7999);
        return var10;
    }

    @OriginalMember(owner = "client!fo", name = "l", descriptor = "(I)V", line = 271)
    private final void method2687(int arg0) {
        ++field6648;
        if (arg0 == 1) {
            this.field6869 = false;
            if (class599.field8513 == this.field6844) {
                this.method2715(124);
                this.method2704(-25907);
            }
        }
    }

    @OriginalMember(owner = "client!fo", name = "e", descriptor = "(Z)V", line = 291)
    public final void method329(boolean arg0) {
        this.field6820 = arg0;
        ++field6619;
        this.method1199(-44);
    }

    @OriginalMember(owner = "client!fo", name = "YA", descriptor = "(IFFFFF)V", line = 302)
    public final void method320(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        ++field6717;
        boolean var7 = ~this.field6815 != ~arg0;
        if (var7 || this.field6854 != arg1 || this.field6852 != arg2) {
            this.field6815 = arg0;
            this.field6854 = arg1;
            this.field6852 = arg2;
            if (var7) {
                this.field6817 = (float) (255 & this.field6815) / 255.0F;
                this.field6864 = (float) (this.field6815 & 16711680) / 1.671168E7F;
                this.field6861 = (float) (65280 & this.field6815) / 65280.0F;
                this.method1186(20871);
            }
            this.field6757.setSunColour(this.field6864, this.field6861, this.field6817, arg1, arg2);
            this.method1142(3);
        }
        if (this.field6811[0] != arg3 || this.field6811[1] != arg4 || this.field6811[2] != arg5) {
            this.field6811[0] = arg3;
            this.field6811[2] = arg5;
            this.field6811[1] = arg4;
            this.field6855[2] = -arg5;
            this.field6855[1] = -arg4;
            this.field6855[0] = -arg3;
            float var8 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
            this.field6827[0] = arg3 * var8;
            this.field6827[2] = arg5 * var8;
            this.field6827[1] = arg4 * var8;
            this.field6859[2] = -this.field6827[2];
            this.field6859[0] = -this.field6827[0];
            this.field6859[1] = -this.field6827[1];
            this.field6757.setSunDirection(this.field6827[0], this.field6827[1], this.field6827[2]);
            this.method1195((byte) 48);
            this.field6867 = (int) (arg5 * 256.0F / arg4);
            this.field6885 = (int) (arg3 * 256.0F / arg4);
        }
        this.method1155(-123);
    }

    @OriginalMember(owner = "client!fo", name = "U", descriptor = "()I", line = 352)
    public final int method337() {
        ++field6710;
        return this.field6823;
    }

    @OriginalMember(owner = "client!fo", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;Le;Ljo;II)V", line = 360)
    public class473(Canvas arg0, Object arg1, class486 arg2, class303 arg3, int arg4, int arg5) {
        super(arg2);
        this.field6729 = this.field6761 = arg0;
        this.field6651 = arg3;
        this.field6805 = arg4;
        this.field6698 = this.field6639 = arg1;
        Dimension var7 = arg0.getSize();
        this.field6684 = this.field6695 = var7.width;
        this.field6620 = this.field6594 = var7.height;
        this.field6825 = arg5;
        class672.method3769(-116, true, false);
        this.field6842 = new class109(this, super.field8990);
        this.field6757 = new NativeInterface(super.field8990.method850((byte) -67), this.field6825);
        for (int var8 = 0; var8 < super.field8990.method850((byte) 121); ++var8) {
            class414 var9 = super.field8990.method846((byte) -121, var8);
            if (var9 != null) {
                this.field6757.initTextureMetrics(var8, var9.field5484, var9.field5482);
            }
        }
    }

    @OriginalMember(owner = "client!fo", name = "m", descriptor = "(I)I", line = 398)
    public final int method2688(int arg0) {
        ++field6738;
        if (arg0 != 0) {
            this.field6828 = null;
        }
        return this.field6812;
    }

    @OriginalMember(owner = "client!fo", name = "b", descriptor = "(II)I", line = 412)
    public final int method312(int arg0, int arg1) {
        ++field6650;
        return arg1 ^ arg1 & arg0;
    }

    @OriginalMember(owner = "client!fo", name = "l", descriptor = "()Z", line = 420)
    public final boolean method338() {
        ++field6743;
        return true;
    }

    @OriginalMember(owner = "client!fo", name = "e", descriptor = "(IIIIII)V", line = 430)
    public final void method353(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field6606;
        float var7 = (float) (-arg0) + (float) arg2;
        float var8 = (float) arg3 - (float) arg1;
        float var9 = (float) (1.0D / Math.sqrt((double) (var7 * var7 + var8 * var8)));
        float var10 = var7 * var9;
        float var11 = var8 * var9;
        if (this.method2726((float) arg2 + var10, 0.0F, (float) arg1, (float) arg0, (float) arg3 + var11, 0.0F, 28)) {
            this.method2738(0);
            this.method2719(arg4, (byte) -108);
            this.method2757(class521.field7461, (byte) -73, 0);
            this.method2723(class521.field7461, -30892, 0);
            this.method2750(arg5, (byte) -73);
            this.method2712(5);
            this.method1140(true, false);
            this.method2692((byte) 118);
            this.method1140(true, true);
            this.method2723(class67.field708, -30892, 0);
            this.method2757(class67.field708, (byte) -73, 0);
        }
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(Lq;)V", line = 460)
    public final void method311(class389 arg0) {
        this.field6779 = (class667) arg0;
        ++field6616;
        this.field6781.method233(this.field6779);
        this.field6781.method3751(1);
        this.field6782.method3748(this.field6781, 7);
        this.field6780.method3748(this.field6779, 7);
        if (this.field6844.method3673(-1)) {
            this.method2748((byte) 119);
        }
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(IIIIIII)V", line = 476)
    public final void method354(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field6758;
    }

    @OriginalMember(owner = "client!fo", name = "d", descriptor = "(IIIIII)Ldga;", line = 486)
    public final class190 method365(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field6632;
        return new class5(this, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!fo", name = "sa", descriptor = "(II)V", line = 496)
    public final void method342(int arg0, int arg1) {
        ++field6718;
        if (this.field6823 != arg0 || this.field6878 != arg1) {
            this.field6823 = arg0;
            this.field6878 = arg1;
            this.method2683(41);
            this.method2756(8);
            this.method2761(0);
        }
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(ZLvw;)V", line = 512)
    public final void method2689(boolean arg0, class274 arg1) {
        ++field6669;
        this.field6818[this.field6812] = arg1;
        if (arg0) {
            this.method2687(21);
        }
        this.method2695((byte) 125);
    }

    @OriginalMember(owner = "client!fo", name = "c", descriptor = "(II)V", line = 525)
    public final void method2690(int arg0, int arg1) {
        if (arg1 == 5) {
            if (this.field6812 != arg0) {
                this.field6812 = arg0;
                this.method1179(0);
            }
            ++field6625;
        }
    }

    @OriginalMember(owner = "client!fo", name = "d", descriptor = "(Z)V", line = 545)
    public final void method293(boolean arg0) {
        ++field6643;
    }

    @OriginalMember(owner = "client!fo", name = "p", descriptor = "(I)Lww;", line = 552)
    public final class667 method2691(int arg0) {
        ++field6771;
        if (arg0 >= -73) {
            this.method1175(116);
        }
        return this.field6881[this.field6812];
    }

    @OriginalMember(owner = "client!fo", name = "LA", descriptor = "(IIII)V", line = 564)
    public final void method299(int arg0, int arg1, int arg2, int arg3) {
        ++field6735;
        if (!this.field6806) {
            throw new RuntimeException("");
        } else {
            if (~this.field6807 != ~arg0) {
                this.field6807 = arg0;
                if (this.field6809 != null) {
                    this.field6809.method184(-88);
                }
            }
            this.field6843 = arg2;
            this.field6785 = arg3;
            this.field6851 = arg1;
            this.method2761(0);
        }
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(II[[I[[IIII)Ld;", line = 591)
    public final class137 method282(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        ++field6716;
        return new class314(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!fo", name = "o", descriptor = "()Z", line = 600)
    public final boolean method376() {
        ++field6608;
        return true;
    }

    @OriginalMember(owner = "client!fo", name = "c", descriptor = "(B)V", line = 611)
    private final void method2692(byte arg0) {
        ++field6724;
        this.method1198(0, (byte) 123, this.field6890);
        this.method1174(0, this.field6904);
        this.method1176(0, 1768, 1, class645.field9140);
        if (arg0 <= 116) {
            this.field6841 = null;
        }
    }

    @OriginalMember(owner = "client!fo", name = "q", descriptor = "(I)V", line = 625)
    public final void method2693(int arg0) {
        if (arg0 != 28392) {
            this.method312(15, 48);
        }
        this.field6777 = false;
        ++field6687;
        this.method2745((byte) -44);
    }

    @OriginalMember(owner = "client!fo", name = "A", descriptor = "()Z", line = 641)
    public final boolean method315() {
        ++field6600;
        return true;
    }

    @OriginalMember(owner = "client!fo", name = "v", descriptor = "()I", line = 649)
    public final int method302() {
        ++field6630;
        return this.field6776 + this.field6775 + this.field6778;
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 664)
    public final void method325(Canvas arg0) {
        ++field6665;
        Object var2 = null;
        if (arg0 != null && this.field6761 != arg0) {
            if (this.field6707.containsKey(arg0)) {
                var2 = this.field6707.get(arg0);
            }
        } else {
            var2 = this.field6698;
        }
        if (var2 == null) {
            throw new RuntimeException();
        } else {
            this.method1160((byte) -85, var2, arg0);
            if (this.field6729 == arg0) {
                this.method2701(-14933);
            }
        }
    }

    @OriginalMember(owner = "client!fo", name = "u", descriptor = "()Lq;", line = 696)
    public final class389 method371() {
        ++field6678;
        return new class667();
    }

    @OriginalMember(owner = "client!fo", name = "d", descriptor = "(Ljava/awt/Canvas;)V", line = 710)
    public final void method284(Canvas arg0) {
        this.field6698 = null;
        this.field6729 = null;
        ++field6654;
        if (arg0 != null && this.field6761 != arg0) {
            if (this.field6707.containsKey(arg0)) {
                this.field6698 = this.field6707.get(arg0);
                this.field6729 = arg0;
            }
        } else {
            this.field6729 = this.field6761;
            this.field6698 = this.field6639;
        }
        if (this.field6729 != null && this.field6698 != null) {
            this.method1189(-1, this.field6698, this.field6729);
            this.method2701(-14933);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(ZI)V", line = 741)
    public final void method2694(boolean arg0, int arg1) {
        if (!arg0 == this.field6830) {
            this.field6830 = arg0;
            this.method1183((byte) -26);
        }
        if (arg1 <= 113) {
            this.field6853 = -23;
        }
        ++field6742;
    }

    @OriginalMember(owner = "client!fo", name = "e", descriptor = "(IIIII)V", line = 759)
    public final void method361(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method353(arg0, arg1, arg0 + arg2, arg1, arg3, arg4);
        ++field6744;
    }

    @OriginalMember(owner = "client!fo", name = "Q", descriptor = "(IIII)V", line = 768)
    public final void method330(int arg0, int arg1, int arg2, int arg3) {
        ++field6640;
        boolean var5 = false;
        if (this.field6858 < arg0) {
            var5 = true;
            this.field6858 = arg0;
        }
        if (this.field6803 > arg2) {
            this.field6803 = arg2;
            var5 = true;
        }
        if (~this.field6853 > ~arg1) {
            this.field6853 = arg1;
            var5 = true;
        }
        if (this.field6826 > arg3) {
            this.field6826 = arg3;
            var5 = true;
        }
        if (var5) {
            if (!this.field6906) {
                this.field6906 = true;
                this.method1184(0);
            }
            this.method1173((byte) 74);
            this.method2724(120);
        }
    }

    @OriginalMember(owner = "client!fo", name = "ka", descriptor = "(FF)V", line = 815)
    public final void method366(float arg0, float arg1) {
        ++field6725;
        if (this.field6848 != arg0 || this.field6798 != arg1) {
            this.field6848 = arg0;
            this.field6798 = arg1;
            this.method2740(29916);
            this.method2736((byte) -75);
            this.method2756(8);
            this.method2683(46);
        }
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(IIIIIIIIII)V", line = 833)
    public final void method300(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field6748;
    }

    @OriginalMember(owner = "client!fo", name = "e", descriptor = "(B)V", line = 842)
    private final void method2695(byte arg0) {
        if (arg0 < 106) {
            this.field6865 = 94;
        }
        ++field6723;
        this.method1167(5);
        if (this.field6809 != null) {
            this.field6809.method182((byte) 125);
        }
    }

    @OriginalMember(owner = "client!fo", name = "JA", descriptor = "(I)V", line = 859)
    public final void method369(int arg0) {
        ++field6701;
        this.field6795 = 0;
        while (arg0 > 1) {
            ++this.field6795;
            arg0 >>= 1;
        }
        this.field6791 = 1 << this.field6795;
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(ILld;)V", line = 874)
    public final void method2696(int arg0, class155 arg1) {
        if (arg0 != -2) {
            this.method1163(109);
        }
        ++field6638;
        if (this.field6868[this.field6812] != arg1) {
            this.field6868[this.field6812] = arg1;
            if (arg1 == null) {
                this.method1194(true);
            } else {
                arg1.method841(arg0 + -124);
            }
            this.field6846 &= -2;
        }
    }

    @OriginalMember(owner = "client!fo", name = "ma", descriptor = "(IIIIII[BII)V", line = 896)
    public final void method281(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        ++field6711;
    }

    @OriginalMember(owner = "client!fo", name = "b", descriptor = "(Li;)V", line = 904)
    public final void method292(class37 arg0) {
        ++field6668;
        this.field6731 = ((class153) arg0).field1731;
        this.field6692 = this.field6731.method3431(32768, false);
    }

    @OriginalMember(owner = "client!fo", name = "f", descriptor = "(Z)V", line = 915)
    public final void method2697(boolean arg0) {
        if (this.field6846 != 8) {
            this.method2718((byte) 0);
            this.method2755(-32, true);
            this.method2727(true, 57);
            this.method2716(true, true);
            this.method2750(1, (byte) -73);
            this.field6846 = 8;
        }
        if (!arg0) {
            this.field6594 = 72;
        }
        ++field6649;
    }

    @OriginalMember(owner = "client!fo", name = "d", descriptor = "(II)Ltj;", line = 936)
    public final class180 method2698(int arg0, int arg1) {
        if (~this.field6888.method737((byte) -94) > ~(arg1 * 2)) {
            this.field6888.method1024(120, arg1);
        }
        ++field6629;
        return arg0 > -92 ? null : this.field6888;
    }

    @OriginalMember(owner = "client!fo", name = "g", descriptor = "(B)V", line = 951)
    public final void method2699(byte arg0) {
        if (arg0 != -51) {
            this.method1198(47, (byte) -13, (class31) null);
        }
        if (this.field6818[this.field6812] != class67.field721) {
            this.field6818[this.field6812] = class67.field721;
            this.field6881[this.field6812].method232();
            this.method2695((byte) 115);
        }
        ++field6674;
    }

    @OriginalMember(owner = "client!fo", name = "g", descriptor = "(I)V", line = 969)
    public final void method288(int arg0) {
        ++field6673;
    }

    @OriginalMember(owner = "client!fo", name = "s", descriptor = "(I)V", line = 976)
    public final void method2700(int arg0) {
        ++field6662;
        if (arg0 > -62) {
            this.method1189(91, (Object) null, (Canvas) null);
        }
        this.method2744(false);
        this.method2704(-25907);
    }

    @OriginalMember(owner = "client!fo", name = "u", descriptor = "(I)V", line = 991)
    private final void method2701(int arg0) {
        if (arg0 != -14933) {
            this.method2693(34);
        }
        ++field6681;
        if (this.field6729 == null) {
            this.field6695 = this.field6594 = 1;
        } else {
            Dimension var2 = this.field6729.getSize();
            this.field6594 = var2.height;
            this.field6695 = var2.width;
        }
        this.field6620 = this.field6594;
        this.field6684 = this.field6695;
        this.method2687(1);
        this.method2683(54);
        this.method2756(8);
        this.method1175(arg0 ^ -14934);
        this.method2724(115);
        this.method2744(false);
        this.method378();
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "()Z", line = 1027)
    public final boolean method386() {
        ++field6613;
        return false;
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(ZB)V", line = 1035)
    public final void method2702(boolean arg0, byte arg1) {
        if (!arg0 == this.field6835) {
            this.field6835 = arg0;
            this.method1183((byte) 111);
            this.field6846 &= -8;
        }
        ++field6704;
        int var3 = 16 % ((arg1 - -33) / 63);
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(IZ)V", line = 1052)
    public final void method2703(int arg0, boolean arg1) {
        if (arg0 >= -58) {
            this.method2747((byte) -96);
        }
        ++field6772;
        if (this.field6837 != arg1) {
            this.field6837 = arg1;
            this.method1153(29438);
        }
    }

    @OriginalMember(owner = "client!fo", name = "v", descriptor = "(I)V", line = 1070)
    private final void method2704(int arg0) {
        this.method1171(-7);
        if (arg0 == -25907) {
            ++field6752;
            if (this.field6809 != null) {
                this.field6809.method176(arg0 + 46104);
            }
        }
    }

    @OriginalMember(owner = "client!fo", name = "w", descriptor = "(I)V", line = 1091)
    public final void method2705(int arg0) {
        ++field6703;
        if (~this.field6846 != -17) {
            this.method2722(true);
            this.method2755(-32, true);
            this.method2727(true, 59);
            this.method2716(true, true);
            this.method2750(1, (byte) -73);
            this.field6846 = 16;
        }
        if (arg0 < 30) {
            this.field6874 = null;
        }
    }

    @OriginalMember(owner = "client!fo", name = "j", descriptor = "(B)V", line = 1119)
    public final void method2706(byte arg0) {
        if (this.field6846 != 4) {
            this.method2686(-8);
            this.method2755(-32, false);
            this.method2702(false, (byte) 119);
            this.method2727(false, 88);
            this.method2716(true, false);
            this.method2733(-2, 89, false, false);
            this.method2750(1, (byte) -73);
            this.method2725(0, -31628);
            this.field6846 = 4;
        }
        if (arg0 < 46) {
            this.field6826 = -55;
        }
        ++field6659;
    }

    @OriginalMember(owner = "client!fo", name = "ha", descriptor = "(F)V", line = 1142)
    public final void method368(float arg0) {
        ++field6631;
        if (this.field6873 != arg0) {
            this.field6873 = arg0;
            this.field6757.setAmbient(arg0);
            this.method1186(20871);
            this.method1155(-109);
        }
    }

    @OriginalMember(owner = "client!fo", name = "y", descriptor = "(I)I", line = 1158)
    public final int method2707(int arg0) {
        if (arg0 != 1) {
            return -123;
        } else {
            ++field6676;
            return this.field6807;
        }
    }

    @OriginalMember(owner = "client!fo", name = "k", descriptor = "(B)Lww;", line = 1169)
    public final class667 method2708(byte arg0) {
        ++field6653;
        if (arg0 <= 119) {
            this.field6783 = null;
        }
        return this.field6781;
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(IIIIZ)Lxa;", line = 1183)
    public final class458 method279(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        ++field6597;
        class62 var6 = new class62(this, arg2, arg3, arg4);
        var6.method411(0, 0, arg2, arg3, arg0, arg1);
        return var6;
    }

    @OriginalMember(owner = "client!fo", name = "y", descriptor = "()Z", line = 1195)
    public final boolean method316() {
        ++field6746;
        return true;
    }

    @OriginalMember(owner = "client!fo", name = "q", descriptor = "()Z", line = 1208)
    public final boolean method323() {
        ++field6672;
        return true;
    }

    @OriginalMember(owner = "client!fo", name = "B", descriptor = "()Z", line = 1216)
    public final boolean method380() {
        ++field6671;
        return this.field6800[3].method178((byte) -12);
    }

    @OriginalMember(owner = "client!fo", name = "C", descriptor = "(IIIIII)V", line = 1225)
    public final void method286(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field6634;
        this.method2738(0);
        this.method2719(arg4, (byte) -115);
        this.method2757(class521.field7461, (byte) -73, 0);
        this.method2723(class521.field7461, -30892, 0);
        this.method2750(arg5, (byte) -73);
        this.field6774.method3759((float) arg3, (float) arg2, (byte) 43, 1.0F);
        this.field6774.method235(arg0, arg1, 0);
        this.method2693(28392);
        this.method1140(true, false);
        this.method2729((byte) -85);
        this.method1140(true, true);
        this.method2723(class67.field708, -30892, 0);
        this.method2757(class67.field708, (byte) -73, 0);
    }

    @OriginalMember(owner = "client!fo", name = "A", descriptor = "(I)V", line = 1246)
    private final void method2709(int arg0) {
        if (!this.field6849) {
            float[] var2 = this.field6860;
            float var3 = (float) this.field6823 - this.field6798;
            float var4 = (float) this.field6878 + -this.field6798;
            float var5 = (float) (-this.field6829) * this.field6880 / (float) this.field6787;
            float var6 = (float) (-this.field6810) * this.field6880 / (float) this.field6845;
            float var7 = (float) (-this.field6810 + this.field6684) * this.field6880 / (float) this.field6845;
            float var8 = (float) (-this.field6829 + this.field6620) * this.field6880 / (float) this.field6787;
            if (var6 != var7 && var5 != var8) {
                var2[0] = 2.0F / (var7 - var6);
                var2[9] = 0.0F;
                var2[2] = 0.0F;
                var2[7] = 0.0F;
                var2[6] = 0.0F;
                var2[15] = 1.0F;
                var2[8] = 0.0F;
                var2[4] = 0.0F;
                var2[1] = 0.0F;
                var2[10] = 1.0F / (var3 - var4);
                var2[14] = var3 / (var3 - var4);
                var2[12] = (var6 + var7) / (-var7 + var6);
                var2[11] = 0.0F;
                var2[5] = 2.0F / (-var5 + var8);
                var2[3] = 0.0F;
                var2[13] = (var5 + var8) / (-var5 + var8);
            } else {
                var2[6] = 0.0F;
                var2[4] = 0.0F;
                var2[0] = 1.0F;
                var2[13] = 0.0F;
                var2[11] = 0.0F;
                var2[9] = 0.0F;
                var2[12] = 0.0F;
                var2[8] = 0.0F;
                var2[3] = 0.0F;
                var2[14] = 0.0F;
                var2[15] = 1.0F;
                var2[2] = 0.0F;
                var2[1] = 0.0F;
                var2[10] = 1.0F;
                var2[7] = 0.0F;
                var2[5] = 1.0F;
            }
            this.method2740(29916);
            this.field6849 = true;
        }
        ++field6713;
        if (arg0 <= 18) {
            this.field6651 = null;
        }
    }

    @OriginalMember(owner = "client!fo", name = "l", descriptor = "(B)V", line = 1316)
    public void method1151(byte arg0) {
        ++field6664;
        if (arg0 <= 112) {
            this.field6880 = 0.40164015F;
        }
        this.field6882 = this.field6876;
        this.field6876 = 0;
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(BZ)V", line = 1332)
    public final void method2710(byte arg0, boolean arg1) {
        if (arg0 < -11) {
            if (!arg1 == this.field6789) {
                this.field6789 = arg1;
                this.method1147((byte) 104);
            }
            ++field6728;
        }
    }

    @OriginalMember(owner = "client!fo", name = "C", descriptor = "(I)V", line = 1348)
    private final void method2711(int arg0) {
        ++field6690;
        this.method1186(20871);
        this.method1142(3);
        this.method1183((byte) -128);
        int var2 = -60 / ((50 - arg0) / 43);
        this.method1151((byte) 117);
        this.method1195((byte) 48);
        this.method1155(-91);
        this.method1153(29438);
        this.method1166((byte) 31);
        this.method1199(-35);
        this.method1147((byte) 125);
        this.method1141((byte) -103);
        this.method1149(-1);
        this.method1190((byte) 103);
        this.method1164((byte) 100);
        for (int var3 = this.field6824 - 1; var3 >= 0; --var3) {
            this.method2690(var3, 5);
            this.method1162(true);
            this.method1172(-72);
            this.method2699((byte) -51);
        }
        this.method1163(-15973);
        this.method1175(1);
        this.method1171(-120);
        this.method1177(1);
        this.method1143(-84);
    }

    @OriginalMember(owner = "client!fo", name = "E", descriptor = "(I)V", line = 1391)
    public final void method2712(int arg0) {
        if (arg0 == 5) {
            this.field6774.method232();
            ++field6627;
            this.field6777 = true;
            this.method2745((byte) -44);
        }
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "([FI)[F", line = 1404)
    public final float[] method2713(float[] arg0, int arg1) {
        arg0[12] = this.field6877[3];
        arg0[8] = this.field6877[2];
        ++field6740;
        arg0[4] = this.field6877[1];
        arg0[0] = this.field6877[0];
        arg0[1] = this.field6877[4];
        arg0[2] = this.field6877[8];
        arg0[9] = this.field6877[6];
        arg0[5] = this.field6877[5];
        arg0[13] = this.field6877[7];
        arg0[6] = this.field6877[9];
        arg0[14] = this.field6877[11];
        arg0[3] = this.field6877[12];
        arg0[10] = this.field6877[10];
        if (arg1 != 19876) {
            this.field6795 = -17;
        }
        arg0[7] = this.field6877[13];
        arg0[11] = this.field6877[14];
        arg0[15] = this.field6877[15];
        return arg0;
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(Ljaclib/memory/Buffer;B)Ljaclib/memory/Stream;", line = 1432)
    public final Stream method2714(Buffer arg0, byte arg1) {
        int var3 = -90 / ((-66 - arg1) / 32);
        this.field6788.method3446(arg0);
        ++field6599;
        return this.field6788;
    }

    @OriginalMember(owner = "client!fo", name = "X", descriptor = "(III)V", line = 1443)
    public final void method363(int arg0, int arg1, int arg2) {
        ++field6683;
        if (~this.field6814 != ~arg0 || ~this.field6802 != ~arg1 || ~this.field6862 != ~arg2) {
            this.field6814 = arg0;
            this.field6802 = arg1;
            this.field6862 = arg2;
            if (this.field6806) {
                return;
            }
            this.method2761(0);
            this.method1147((byte) 122);
        }
    }

    @OriginalMember(owner = "client!fo", name = "b", descriptor = "(Ljava/awt/Canvas;)V", line = 1465)
    public final void method273(Canvas arg0) {
        ++field6626;
        if (this.field6761 == arg0) {
            throw new RuntimeException();
        } else if (this.field6707.containsKey(arg0)) {
            this.method1191(this.field6707.get(arg0), 7, arg0);
            this.field6707.remove(arg0);
        }
    }

    @OriginalMember(owner = "client!fo", name = "F", descriptor = "(I)V", line = 1486)
    private final void method2715(int arg0) {
        if (!this.field6869) {
            float[] var2 = this.field6786;
            this.field6869 = true;
            if (~this.field6684 != -1 && ~this.field6620 != -1) {
                var2[13] = 1.0F;
                var2[5] = -2.0F / (float) this.field6620;
                var2[7] = 0.0F;
                var2[12] = -1.0F;
                var2[6] = 0.0F;
                var2[10] = 0.5F;
                var2[4] = 0.0F;
                var2[11] = 0.0F;
                var2[8] = 0.0F;
                var2[15] = 1.0F;
                var2[0] = 2.0F / (float) this.field6684;
                var2[9] = 0.0F;
                var2[14] = 0.5F;
                var2[3] = 0.0F;
                var2[2] = 0.0F;
                var2[1] = 0.0F;
            } else {
                var2[1] = 0.0F;
                var2[10] = 1.0F;
                var2[15] = 1.0F;
                var2[5] = 1.0F;
                var2[11] = 0.0F;
                var2[12] = 0.0F;
                var2[2] = 0.0F;
                var2[13] = 0.0F;
                var2[8] = 0.0F;
                var2[4] = 0.0F;
                var2[14] = 0.0F;
                var2[3] = 0.0F;
                var2[9] = 0.0F;
                var2[0] = 1.0F;
                var2[6] = 0.0F;
                var2[7] = 0.0F;
            }
        }
        if (arg0 > 121) {
            ++field6749;
        }
    }

    @OriginalMember(owner = "client!fo", name = "na", descriptor = "(III[I)V", line = 1543)
    public final void method331(int arg0, int arg1, int arg2, int[] arg3) {
        ++field6691;
        float var5 = this.field6779.method3754((float) arg0, (byte) -122, (float) arg1, (float) arg2);
        if (!(var5 < (float) this.field6823) && !(var5 > (float) this.field6878)) {
            int var6 = (int) ((float) this.field6845 * this.field6779.method3758((float) arg2, -7673, (float) arg1, (float) arg0) / var5);
            int var7 = (int) ((float) this.field6787 * this.field6779.method3747((float) arg2, (float) arg0, 0, (float) arg1) / var5);
            if ((float) var6 >= this.field6792 && this.field6784 >= (float) var6 && this.field6793 <= (float) var7 && this.field6804 >= (float) var7) {
                arg3[1] = (int) ((float) var7 + -this.field6793);
                arg3[0] = (int) ((float) var6 - this.field6792);
                arg3[2] = (int) var5;
            } else {
                arg3[0] = arg3[1] = arg3[2] = -1;
            }
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(ZZ)V", line = 1574)
    public final void method2716(boolean arg0, boolean arg1) {
        if (!this.field6790 != !arg1) {
            this.field6790 = arg1;
            this.method1199(126);
            this.field6846 &= -32;
        }
        ++field6706;
        if (!arg0) {
            this.method2734(48);
        }
    }

    @OriginalMember(owner = "client!fo", name = "m", descriptor = "(B)Lvfa;", line = 1592)
    public final class614 method2717(byte arg0) {
        if (arg0 != -49) {
            this.method342(45, -125);
        }
        ++field6666;
        return this.field6833 != null ? this.field6833.method23(false) : null;
    }

    @OriginalMember(owner = "client!fo", name = "e", descriptor = "(II)Lor;", line = 1606)
    public class584 method1145(int arg0, int arg1) {
        ++field6680;
        if (arg0 != 2) {
            this.field6877 = null;
        }
        if (arg1 != 6) {
            if (~arg1 != -2) {
                if (arg1 != 2) {
                    return ~arg1 == -8 ? new class229(this) : new class99(this);
                } else {
                    return new class353(this, this.field6739);
                }
            } else {
                return new class66(this);
            }
        } else {
            return new class453(this);
        }
    }

    @OriginalMember(owner = "client!fo", name = "aa", descriptor = "()I", line = 1660)
    public final int method385() {
        ++field6768;
        return this.field6907;
    }

    @OriginalMember(owner = "client!fo", name = "ya", descriptor = "(IIIII)V", line = 1679)
    public final void method344(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method353(arg0, arg1, arg0, arg1 + arg2, arg3, arg4);
        ++field6652;
    }

    @OriginalMember(owner = "client!fo", name = "n", descriptor = "(B)V", line = 1687)
    private final void method2718(byte arg0) {
        if (arg0 != 0) {
            this.field6890 = null;
        }
        ++field6696;
        if (class625.field8866 != this.field6844) {
            class651 var2 = this.field6844;
            this.field6844 = class625.field8866;
            if (!var2.method3673(arg0 + -1)) {
                this.method2748((byte) 119);
            }
            this.method2721(44);
            this.field6877 = this.field6841;
            this.method2704(-25907);
            this.field6846 &= -8;
        }
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(II)I", line = 1713)
    public final int method372(int arg0, int arg1) {
        ++field6736;
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(IB)V", line = 1724)
    public final void method2719(int arg0, byte arg1) {
        if (~this.field6883 != ~arg0) {
            this.field6883 = arg0;
            this.method1163(-15973);
        }
        if (arg1 > -105) {
            this.field6816 = 127;
        }
        ++field6708;
    }

    @OriginalMember(owner = "client!fo", name = "s", descriptor = "()F", line = 1742)
    public final float method2720() {
        ++field6732;
        return this.field6798;
    }

    @OriginalMember(owner = "client!fo", name = "c", descriptor = "(Ljava/awt/Canvas;)V", line = 1752)
    public final void method374(Canvas arg0) {
        ++field6737;
        if (this.field6761 == arg0) {
            throw new RuntimeException();
        } else if (!this.field6707.containsKey(arg0)) {
            if (!arg0.isShowing()) {
                throw new RuntimeException();
            } else {
                try {
                    Class var2 = Class.forName("java.awt.Canvas");
                    Method var3 = var2.getMethod("setIgnoreRepaint", Boolean.TYPE);
                    var3.invoke(arg0, Boolean.TRUE);
                } catch (Exception var5) {
                }
                Object var4 = this.method1197(arg0, 10);
                if (var4 == null) {
                    throw new RuntimeException();
                } else {
                    this.field6707.put(arg0, var4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!fo", name = "e", descriptor = "(I)V", line = 1792)
    public final void method322(int arg0) {
        ++field6755;
    }

    @OriginalMember(owner = "client!fo", name = "H", descriptor = "(I)V", line = 1802)
    private final void method2721(int arg0) {
        if (!this.field6857) {
            float[] var2 = this.field6841;
            float var3 = (float) (-this.field6810 * this.field6823) / (float) this.field6845;
            float var4 = (float) ((-this.field6810 + this.field6684) * this.field6823) / (float) this.field6845;
            float var5 = (float) (this.field6829 * this.field6823) / (float) this.field6787;
            float var6 = (float) ((-this.field6620 + this.field6829) * this.field6823) / (float) this.field6787;
            if (var3 != var4 && var5 != var6) {
                float var7 = (float) this.field6823 * 2.0F;
                var2[14] = this.field6839 = (float) (this.field6878 * this.field6823) / (float) (-this.field6878 + this.field6823);
                var2[7] = 0.0F;
                var2[0] = var7 / (var4 - var3);
                var2[13] = 0.0F;
                var2[12] = 0.0F;
                var2[2] = 0.0F;
                var2[3] = 0.0F;
                var2[9] = (var5 + var6) / (var5 - var6);
                var2[4] = 0.0F;
                var2[11] = -1.0F;
                var2[5] = var7 / (var5 - var6);
                var2[8] = (var3 + var4) / (-var3 + var4);
                var2[6] = 0.0F;
                var2[15] = 0.0F;
                var2[1] = 0.0F;
                var2[10] = this.field6808 = (float) this.field6878 / (float) (-this.field6878 + this.field6823);
            } else {
                var2[11] = 0.0F;
                var2[10] = 1.0F;
                var2[14] = 0.0F;
                var2[2] = 0.0F;
                var2[12] = 0.0F;
                var2[15] = 1.0F;
                var2[13] = 0.0F;
                var2[0] = 1.0F;
                var2[5] = 1.0F;
                var2[7] = 0.0F;
                var2[1] = 0.0F;
                var2[8] = 0.0F;
                var2[4] = 0.0F;
                var2[9] = 0.0F;
                var2[3] = 0.0F;
                var2[6] = 0.0F;
            }
            this.method2736((byte) -15);
            this.field6857 = true;
        }
        if (arg0 <= 43) {
            this.field6812 = -110;
        }
        ++field6734;
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "([Lba;Ltg;Lq;[Lmr;I)V", line = 1869)
    public final void method373(class350[] arg0, class211 arg1, class389 arg2, class130[] arg3, int arg4) {
        ++field6686;
        this.method381(arg0, arg2, arg3, arg4);
        this.method283(arg1);
    }

    @OriginalMember(owner = "client!fo", name = "h", descriptor = "(Z)V", line = 1878)
    private final void method2722(boolean arg0) {
        if (!arg0) {
            this.method2760(96);
        }
        ++field6607;
        if (class618.field8699 != this.field6844) {
            class651 var2 = this.field6844;
            this.field6844 = class618.field8699;
            if (!var2.method3673(-1)) {
                this.method2748((byte) 119);
            }
            this.method2709(62);
            this.field6877 = this.field6860;
            this.method2704(-25907);
            this.field6846 &= -8;
        }
    }

    @OriginalMember(owner = "client!fo", name = "h", descriptor = "(IIIII)V", line = 1902)
    public final void method370(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field6719;
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(Lcea;II)V", line = 1911)
    public final void method2723(class196 arg0, int arg1, int arg2) {
        ++field6756;
        this.method1188(arg2, arg0, 64, false);
        if (arg1 != -30892) {
            this.field6837 = true;
        }
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "([Lba;Lq;[Lmr;I)V", line = 1922)
    public final void method381(class350[] arg0, class389 arg1, class130[] arg2, int arg3) {
        for (int var5 = 0; ~arg0.length < ~var5; ++var5) {
            if (arg0[var5] != null) {
                arg0[var5].method904(arg1, arg2 != null ? arg2[var5] : null, arg3);
            }
        }
        ++field6609;
    }

    @OriginalMember(owner = "client!fo", name = "I", descriptor = "(I)V", line = 1942)
    private final void method2724(int arg0) {
        this.field6792 = (float) (-this.field6810 + this.field6858);
        this.field6804 = (float) (-this.field6829 + this.field6826);
        this.field6784 = (float) (-this.field6810 + this.field6803);
        if (arg0 < 113) {
            this.field6863 = false;
        }
        ++field6763;
        this.field6793 = (float) (-this.field6829 + this.field6853);
    }

    @OriginalMember(owner = "client!fo", name = "f", descriptor = "(II)V", line = 1956)
    public final void method2725(int arg0, int arg1) {
        if (arg1 != -31628) {
            this.field6877 = null;
        }
        if (~arg0 == -2) {
            this.method2759(class676.field9584, (byte) -5, class676.field9584);
        } else if (arg0 == 0) {
            this.method2759(class193.field2323, (byte) -5, class193.field2323);
        } else if (~arg0 != -3) {
            if (~arg0 == -4) {
                this.method2759(class193.field2323, (byte) -5, class250.field3212);
            } else if (~arg0 == -5) {
                this.method2759(class39.field425, (byte) -5, class39.field425);
            }
        } else {
            this.method2759(class676.field9584, (byte) -5, class471.field6575);
        }
        ++field6770;
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(FFFFFFI)Z", line = 1987)
    private final boolean method2726(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6) {
        if (arg6 != 28) {
            this.field6695 = -95;
        }
        ++field6615;
        Buffer var8 = this.field6890.method167(18829, true);
        if (var8 == null) {
            return false;
        } else {
            Stream var9 = this.method2714(var8, (byte) -126);
            if (Stream.method3440()) {
                var9.method3438(arg3);
                var9.method3438(arg2);
                var9.method3438(arg5);
                var9.method3438(arg0);
                var9.method3438(arg4);
                var9.method3438(arg1);
            } else {
                var9.method3444(arg3);
                var9.method3444(arg2);
                var9.method3444(arg5);
                var9.method3444(arg0);
                var9.method3444(arg4);
                var9.method3444(arg1);
            }
            var9.method3434();
            return this.field6890.method170(9406);
        }
    }

    @OriginalMember(owner = "client!fo", name = "L", descriptor = "(ILfa;II)V", line = 2026)
    public final void method328(int arg0, class213 arg1, int arg2, int arg3) {
        ++field6644;
        class622 var5 = (class622) arg1;
        class228 var6 = var5.field8828;
        this.method2734(-2);
        this.method2696(-2, var6);
        this.method2750(1, (byte) -73);
        this.method2759(class676.field9584, (byte) -5, class676.field9584);
        this.method2757(class521.field7461, (byte) -73, 0);
        this.method2719(arg0, (byte) -120);
        this.field6774.method3759((float) this.field6620, (float) this.field6684, (byte) 43, 0.0F);
        this.method2693(28392);
        this.field6881[0].method3759(var6.method1326(30658, (float) this.field6620), var6.method1332((float) this.field6684, 30994), (byte) 43, 1.0F);
        this.field6881[0].method3756(false, 0.0F, var6.method1326(30658, (float) (-arg3)), var6.method1332((float) (-arg2), 30994));
        this.field6818[0] = class170.field2044;
        this.method2695((byte) 116);
        this.method2729((byte) -85);
        this.method2699((byte) -51);
        this.method2757(class67.field708, (byte) -73, 0);
    }

    @OriginalMember(owner = "client!fo", name = "g", descriptor = "()Lq;", line = 2054)
    public final class389 method297() {
        ++field6622;
        return this.field6895;
    }

    @OriginalMember(owner = "client!fo", name = "i", descriptor = "()V", line = 2064)
    public final void method305() {
        this.field6842.method678(-1);
        ++field6621;
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(I)V", line = 2074)
    public final void method307(int arg0) {
        ++field6603;
        if (~arg0 <= -129 && ~arg0 >= -1025) {
            this.field6840 = arg0;
            this.field6842.method678(-1);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!fo", name = "d", descriptor = "()Z", line = 2089)
    public final boolean method377() {
        ++field6694;
        return true;
    }

    @OriginalMember(owner = "client!fo", name = "AA", descriptor = "(IIII)V", line = 2097)
    public final void method278(int arg0, int arg1, int arg2, int arg3) {
        this.field6807 = arg0;
        this.field6843 = arg2;
        ++field6750;
        this.field6806 = true;
        this.field6851 = arg1;
        this.field6785 = arg3;
        this.method2754(0, 119, false, 0, 3, false);
        if (this.field6809 != null) {
            this.field6809.method184(-53);
        }
        this.method2761(0);
        this.method1147((byte) 113);
    }

    @OriginalMember(owner = "client!fo", name = "b", descriptor = "(ZI)V", line = 2117)
    public final void method2727(boolean arg0, int arg1) {
        ++field6712;
        int var3 = -76 / ((arg1 - 15) / 35);
        if (!this.field6819 == arg0) {
            this.field6819 = arg0;
            this.method1166((byte) 31);
            this.field6846 &= -32;
        }
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(Lqda;IIII)Lba;", line = 2135)
    public final class350 method375(class90 arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field6647;
        return new class649(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!fo", name = "r", descriptor = "()Z", line = 2143)
    public final boolean method275() {
        ++field6747;
        return false;
    }

    @OriginalMember(owner = "client!fo", name = "p", descriptor = "(B)Lww;", line = 2151)
    public final class667 method2728(byte arg0) {
        if (arg0 <= 46) {
            this.field6873 = 1.3952029F;
        }
        ++field6726;
        return this.field6782;
    }

    @OriginalMember(owner = "client!fo", name = "d", descriptor = "(I)Li;", line = 2165)
    public final class37 method308(int arg0) {
        ++field6633;
        class153 var2 = new class153(arg0);
        this.field6765.method3164(var2, 256);
        return var2;
    }

    @OriginalMember(owner = "client!fo", name = "k", descriptor = "()V", line = 2180)
    public final void method339() {
        ++field6656;
        this.field6806 = false;
        this.method2754(0, -55, false, 0, 0, false);
        this.method2761(0);
        this.method1147((byte) 117);
    }

    @OriginalMember(owner = "client!fo", name = "m", descriptor = "(IIII)V", line = 2192)
    public final void method306(int arg0, int arg1, int arg2, int arg3) {
        ++field6605;
        this.field6829 = arg1;
        this.field6845 = arg2;
        this.field6810 = arg0;
        this.field6787 = arg3;
        this.method2756(8);
        this.method2683(112);
        this.method2744(false);
        this.method2724(125);
    }

    @OriginalMember(owner = "client!fo", name = "f", descriptor = "()Z", line = 2214)
    public final boolean method332() {
        ++field6610;
        return false;
    }

    @OriginalMember(owner = "client!fo", name = "q", descriptor = "(B)V", line = 2222)
    public final void method2729(byte arg0) {
        this.method2735(0, class18.field166, 2);
        if (arg0 == -85) {
            ++field6709;
        }
    }

    @OriginalMember(owner = "client!fo", name = "L", descriptor = "(I)Lww;", line = 2236)
    public final class667 method2730(int arg0) {
        if (arg0 <= 91) {
            this.method2744(true);
        }
        ++field6764;
        return this.field6881[this.field6812];
    }

    @OriginalMember(owner = "client!fo", name = "N", descriptor = "(I)V", line = 2249)
    private final void method2731(int arg0) {
        this.field6905 = this.method1203(false, false);
        ++field6612;
        this.field6905.method169(140, 28, 1103);
        if (arg0 == 1) {
            for (int var2 = 0; var2 < 4; ++var2) {
                Buffer var3 = this.field6905.method167(18829, true);
                if (var3 != null) {
                    Stream var4 = this.method2714(var3, (byte) -113);
                    if (!Stream.method3440()) {
                        var4.method3444(0.0F);
                        var4.method3444(0.0F);
                        var4.method3444(0.0F);
                        var4.method3444(0.0F);
                        var4.method3444(0.0F);
                        var4.method3444(0.0F);
                        var4.method3444(0.0F);
                        var4.method3444(0.0F);
                        var4.method3444(1.0F);
                        var4.method3444(0.0F);
                        var4.method3444(0.0F);
                        var4.method3444(1.0F);
                        var4.method3444(0.0F);
                        var4.method3444(1.0F);
                        var4.method3444(1.0F);
                        var4.method3444(1.0F);
                        var4.method3444(0.0F);
                        var4.method3444(1.0F);
                        var4.method3444(1.0F);
                        var4.method3444(1.0F);
                        var4.method3444(1.0F);
                        var4.method3444(1.0F);
                        var4.method3444(0.0F);
                        var4.method3444(0.0F);
                        var4.method3444(1.0F);
                        var4.method3444(0.0F);
                        var4.method3444(1.0F);
                        var4.method3444(0.0F);
                        var4.method3444(0.0F);
                        var4.method3444(0.0F);
                        var4.method3444(0.0F);
                        var4.method3444(0.0F);
                        var4.method3444(0.0F);
                        var4.method3444(0.0F);
                        var4.method3444(0.0F);
                    } else {
                        var4.method3438(0.0F);
                        var4.method3438(0.0F);
                        var4.method3438(0.0F);
                        var4.method3438(0.0F);
                        var4.method3438(0.0F);
                        var4.method3438(0.0F);
                        var4.method3438(0.0F);
                        var4.method3438(0.0F);
                        var4.method3438(1.0F);
                        var4.method3438(0.0F);
                        var4.method3438(0.0F);
                        var4.method3438(1.0F);
                        var4.method3438(0.0F);
                        var4.method3438(1.0F);
                        var4.method3438(1.0F);
                        var4.method3438(1.0F);
                        var4.method3438(0.0F);
                        var4.method3438(1.0F);
                        var4.method3438(1.0F);
                        var4.method3438(1.0F);
                        var4.method3438(1.0F);
                        var4.method3438(1.0F);
                        var4.method3438(0.0F);
                        var4.method3438(0.0F);
                        var4.method3438(1.0F);
                        var4.method3438(0.0F);
                        var4.method3438(1.0F);
                        var4.method3438(0.0F);
                        var4.method3438(0.0F);
                        var4.method3438(0.0F);
                        var4.method3438(0.0F);
                        var4.method3438(0.0F);
                        var4.method3438(0.0F);
                        var4.method3438(0.0F);
                        var4.method3438(0.0F);
                    }
                    var4.method3434();
                    if (this.field6905.method170(9406)) {
                        break;
                    }
                }
            }
            this.field6897 = this.method1161((byte) 96, new class150[] { new class150(new class546[] { class546.field7810, class546.field7817, class546.field7817 }) });
        }
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "([IIZII)Lae;", line = 2365)
    public final class228 method2732(int[] arg0, int arg1, boolean arg2, int arg3, int arg4) {
        if (arg3 != 0) {
            this.field6874 = null;
        }
        ++field6682;
        return this.method1144(0, true, arg4, arg0, arg2, 0, arg1);
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(IIIIIF)Lod;", line = 2394)
    public final class463 method319(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        ++field6762;
        return new class534(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!fo", name = "D", descriptor = "()Z", line = 2402)
    public final boolean method336() {
        ++field6617;
        return this.field6836;
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(IIZZ)V", line = 2410)
    public final void method2733(int arg0, int arg1, boolean arg2, boolean arg3) {
        if (arg1 < 62) {
            this.field6883 = -84;
        }
        if (~this.field6847 != ~arg0) {
            if (arg0 < 0) {
                this.method2699((byte) -51);
                this.method2696(-2, (class155) null);
                this.method2725(0, -31628);
                if (!this.field6806) {
                    this.method2754(0, -119, arg2, 0, 0, arg3);
                }
            } else {
                class228 var5 = this.field6842.method677(arg0, -51);
                class414 var6 = super.field8990.method846((byte) -128, arg0);
                if (~var6.field5491 == -1 && ~var6.field5501 == -1) {
                    this.method2699((byte) -51);
                } else {
                    int var7 = var6.field5499 ? 64 : 128;
                    int var8 = var7 * 50;
                    class667 var9 = this.method2730(102);
                    var9.method3752((float) (this.field6884 % var8 * var6.field5501) / (float) var8, 0.0F, (float) (this.field6884 % var8 * var6.field5491) / (float) var8, (byte) 7);
                    this.method2689(false, class170.field2044);
                }
                if (!this.field6806) {
                    this.method2754(var6.field5488, 121, arg2, var6.field5483, var6.field5486, arg3);
                }
                if (this.field6809 != null) {
                    this.field6809.method185(var6.field5495, var5, (byte) 127);
                } else {
                    this.method2696(-2, var5);
                    this.method2725(var6.field5495, -31628);
                }
            }
            this.field6847 = arg0;
        }
        ++field6655;
        this.field6846 &= -8;
    }

    @OriginalMember(owner = "client!fo", name = "Q", descriptor = "(I)V", line = 2473)
    public final void method2734(int arg0) {
        ++field6646;
        if (~this.field6846 != -3) {
            this.method2686(-8);
            this.method2755(-32, false);
            this.method2702(false, (byte) -97);
            this.method2727(false, arg0 ^ 27);
            this.method2716(true, false);
            this.method2733(-2, 126, false, false);
            this.field6846 = 2;
        }
        if (arg0 != -2) {
            this.method1141((byte) 85);
        }
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(ILvd;I)V", line = 2497)
    private final void method2735(int arg0, class36 arg1, int arg2) {
        ++field6689;
        this.method1198(arg0, (byte) 109, this.field6905);
        this.method1174(0, this.field6897);
        this.method1176(0, 1768, arg2, arg1);
    }

    @OriginalMember(owner = "client!fo", name = "r", descriptor = "(B)V", line = 2507)
    private final void method2736(byte arg0) {
        if (this.field6798 != 0.0F) {
            float var2 = this.field6848 / (this.field6848 + this.field6798);
            float var3 = var2 * var2;
            float var4 = (-var2 + 1.0F) * -this.field6839 * (-var2 + 1.0F) / this.field6798;
            this.field6841[10] = this.field6808 + var4;
            this.field6841[14] = this.field6839 * var3;
        } else {
            this.field6841[14] = this.field6839;
            this.field6841[10] = this.field6808;
        }
        ++field6730;
        if (arg0 > -6) {
            this.field6807 = 80;
        }
        this.field6870 = (this.field6841[14] + (float) (-this.field6878)) / this.field6841[10];
    }

    @OriginalMember(owner = "client!fo", name = "R", descriptor = "(I)Lww;", line = 2537)
    public final class667 method2737(int arg0) {
        ++field6677;
        if (arg0 != 0) {
            this.field6808 = 1.7465099F;
        }
        if (!this.field6822) {
            this.field6783.method3746(this.field6781, this.field6774);
            this.field6822 = true;
        }
        return this.field6783;
    }

    @OriginalMember(owner = "client!fo", name = "A", descriptor = "([I)V", line = 2555)
    public final void method274(int[] arg0) {
        arg0[2] = this.field6803;
        ++field6635;
        arg0[1] = this.field6853;
        arg0[3] = this.field6826;
        arg0[0] = this.field6858;
    }

    @OriginalMember(owner = "client!fo", name = "S", descriptor = "(I)V", line = 2568)
    private final void method2738(int arg0) {
        if (~this.field6846 != -2) {
            this.method2686(-8);
            this.method2755(-32, false);
            this.method2702(false, (byte) -101);
            this.method2727(false, arg0 + 89);
            this.method2716(true, false);
            this.method2733(-2, arg0 + 100, false, false);
            this.method2725(1, arg0 ^ -31628);
            this.method2696(-2, this.field6872);
            this.field6846 = 1;
        }
        if (arg0 != 0) {
            this.field6774 = null;
        }
        ++field6700;
    }

    @OriginalMember(owner = "client!fo", name = "t", descriptor = "(B)I", line = 2599)
    public final int method2739(byte arg0) {
        if (arg0 < 61) {
            return 32;
        } else {
            ++field6741;
            return this.field6843;
        }
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(IIIIIILfa;II)V", line = 2612)
    public final void method313(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class213 arg6, int arg7, int arg8) {
        ++field6721;
    }

    @OriginalMember(owner = "client!fo", name = "T", descriptor = "(I)V", line = 2620)
    private final void method2740(int arg0) {
        if (arg0 != 29916) {
            this.field6883 = 74;
        }
        this.field6866 = (float) this.field6878 - this.field6798;
        ++field6733;
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(Ltg;)V", line = 2635)
    public final void method283(class211 arg0) {
        this.field6879.method513(this, -64, arg0);
        ++field6688;
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(Lvj;Z[BIBI)Lae;", line = 2646)
    public final class228 method2741(class402 arg0, boolean arg1, byte[] arg2, int arg3, byte arg4, int arg5) {
        if (arg4 <= 110) {
            this.method2733(122, 62, true, false);
        }
        ++field6759;
        return this.method1165(arg3, arg2, 0, arg1, 0, arg0, arg5, 0);
    }

    @OriginalMember(owner = "client!fo", name = "ca", descriptor = "(IIII)V", line = 2657)
    public final void method314(int arg0, int arg1, int arg2, int arg3) {
        ++field6769;
        if (arg0 <= 0 && ~arg2 <= ~(this.field6684 + -1) && arg1 <= 0 && arg3 >= this.field6620 + -1) {
            this.method378();
        } else {
            this.field6853 = arg1 < 0 ? 0 : arg1;
            this.field6803 = ~this.field6684 > ~arg2 ? 0 : arg2;
            this.field6826 = ~arg3 < ~this.field6684 ? 0 : arg3;
            this.field6858 = ~arg0 <= -1 ? arg0 : 0;
            if (!this.field6906) {
                this.field6906 = true;
                this.method1184(0);
            }
            this.method1173((byte) 53);
            this.method2724(117);
        }
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(BI)V", line = 2687)
    public final void method2742(byte arg0, int arg1) {
        this.method2719(arg0 | arg0 << 8 | arg0 << 24 | arg0 << 16, (byte) -117);
        ++field6705;
        if (arg1 != -9391) {
            this.field6822 = false;
        }
    }

    @OriginalMember(owner = "client!fo", name = "E", descriptor = "()F", line = 2700)
    public final float method2743() {
        ++field6753;
        return this.field6848;
    }

    @OriginalMember(owner = "client!fo", name = "i", descriptor = "(Z)V", line = 2708)
    public final void method2744(boolean arg0) {
        if (arg0) {
            this.field6777 = true;
        }
        if (class482.field7053 != this.field6844) {
            class651 var2 = this.field6844;
            this.field6844 = class482.field7053;
            if (var2.method3673(-1)) {
                this.method2748((byte) 119);
            }
            this.field6846 &= -32;
            this.field6877 = this.field6856;
        }
        ++field6645;
    }

    @OriginalMember(owner = "client!fo", name = "v", descriptor = "(B)V", line = 2731)
    private final void method2745(byte arg0) {
        if (class599.field8513 == this.field6844) {
            float var2 = this.method1156(26278);
            this.field6774.method3756(false, 0.0F, var2, var2);
        }
        if (arg0 != -44) {
            this.field6843 = -31;
        }
        ++field6685;
        this.field6822 = false;
        this.method1177(1);
        if (this.field6809 != null) {
            this.field6809.method181(108);
        }
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(BF)V", line = 2755)
    public final void method2746(byte arg0, float arg1) {
        ++field6614;
        if (arg0 < -58) {
            if (this.field6880 != arg1) {
                this.field6880 = arg1;
                this.method2756(8);
            }
        }
    }

    @OriginalMember(owner = "client!fo", name = "IA", descriptor = "()I", line = 2773)
    public final int method321() {
        ++field6670;
        return this.field6878;
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(II[I[I)Lfa;", line = 2781)
    public final class213 method362(int arg0, int arg1, int[] arg2, int[] arg3) {
        ++field6641;
        return class518.method2952(this, arg3, (byte) -1, arg2, arg0, arg1);
    }

    @OriginalMember(owner = "client!fo", name = "w", descriptor = "(B)[F", line = 2790)
    public final float[] method2747(byte arg0) {
        ++field6667;
        if (arg0 != -27) {
            this.method2732((int[]) null, 107, false, 70, -127);
        }
        return this.field6856;
    }

    @OriginalMember(owner = "client!fo", name = "x", descriptor = "(B)V", line = 2801)
    private final void method2748(byte arg0) {
        this.field6822 = false;
        ++field6642;
        if (this.field6809 != null) {
            this.field6809.method173(-1);
        }
        this.method1143(-93);
        if (arg0 != 119) {
            this.field6835 = false;
        }
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(ILww;)V", line = 2818)
    public final void method2749(int arg0, class667 arg1) {
        ++field6727;
        this.field6774.method233(arg1);
        this.field6777 = false;
        if (arg0 == 19319) {
            this.method2745((byte) -44);
        }
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "([IIIII)Lxa;", line = 2833)
    public final class458 method326(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field6596;
        return new class62(this, arg3, arg4, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!fo", name = "b", descriptor = "(I)V", line = 2841)
    public final void method333(int arg0) {
        ++field6601;
        if (arg0 != 1) {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!fo", name = "c", descriptor = "(IIIIII)V", line = 2851)
    public final void method334(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field6760;
        float var7 = this.method1156(26278);
        this.method2738(0);
        this.method2719(arg4, (byte) -127);
        this.method2757(class521.field7461, (byte) -73, 0);
        this.method2723(class521.field7461, -30892, 0);
        this.method2750(arg5, (byte) -73);
        this.field6774.method3759((float) (arg3 - 1), (float) (arg2 + -1), (byte) 43, 1.0F);
        this.field6774.method3756(false, 0.0F, (float) arg1 - var7, (float) arg0 - var7);
        this.method2693(28392);
        this.method1140(true, false);
        this.method2735(0, class300.field3926, 4);
        this.method1140(true, true);
        this.method2723(class67.field708, -30892, 0);
        this.method2757(class67.field708, (byte) -73, 0);
    }

    @OriginalMember(owner = "client!fo", name = "f", descriptor = "(I)V", line = 2882)
    public void method304(int arg0) {
        this.field6842.method679(-100);
        ++field6722;
        this.field6884 = Integer.MAX_VALUE & arg0;
    }

    @OriginalMember(owner = "client!fo", name = "X", descriptor = "(I)V", line = 2893)
    public void method1200(int arg0) {
        ++field6636;
        if (arg0 == 0) {
            this.method2711(-10);
        }
    }

    @OriginalMember(owner = "client!fo", name = "b", descriptor = "(IB)V", line = 2906)
    public final void method2750(int arg0, byte arg1) {
        ++field6658;
        if (this.field6834 != arg0) {
            boolean var3;
            class57 var4;
            boolean var5;
            if (arg0 != 1) {
                if (arg0 == 2) {
                    var3 = false;
                    var4 = class254.field3249;
                    var5 = true;
                } else if (arg0 != 128) {
                    var4 = class559.field7959;
                    var3 = false;
                    var5 = false;
                } else {
                    var3 = true;
                    var5 = true;
                    var4 = class421.field5599;
                }
            } else {
                var5 = true;
                var3 = true;
                var4 = class361.field4715;
            }
            if (!this.field6832 != !var3) {
                this.field6832 = var3;
                this.method1164((byte) 125);
            }
            if (!var5 != !this.field6813) {
                this.field6813 = var5;
                this.method1149(arg1 ^ 72);
            }
            if (this.field6874 != var4) {
                this.field6874 = var4;
                this.method1190((byte) 74);
            }
            this.field6846 &= -29;
            this.field6834 = arg0;
        }
        if (arg1 != -73) {
            this.method1144(77, true, 19, (int[]) null, true, -117, -108);
        }
    }

    @OriginalMember(owner = "client!fo", name = "Y", descriptor = "(I)V", line = 2975)
    public final void method2751(int arg0) {
        this.field6818 = new class274[this.field6824];
        this.field6868 = new class155[this.field6824];
        this.field6881 = new class667[this.field6824];
        ++field6675;
        this.field6828 = new class368[this.field6824];
        this.field6796 = new class368[this.field6824];
        for (int var2 = 0; ~var2 > ~this.field6824; ++var2) {
            this.field6796[var2] = class193.field2323;
            this.field6828[var2] = class193.field2323;
            this.field6818[var2] = class67.field721;
            this.field6881[var2] = new class667();
        }
        this.field6801 = new class463[this.field6797 + -2];
        this.field6872 = this.method1185(1, (byte) 69, 1, class581.field8260, class271.field3429);
        this.method292(new class153(262144));
        this.field6892 = this.method1161((byte) 91, new class150[] { new class150(new class546[] { class546.field7810, class546.field7817 }) });
        this.field6898 = this.method1161((byte) 99, new class150[] { new class150(new class546[] { class546.field7810, class546.field7815 }) });
        this.field6899 = this.method1161((byte) 118, new class150[] { new class150(class546.field7810), new class150(class546.field7815), new class150(class546.field7817), new class150(class546.field7813) });
        this.field6902 = this.method1161((byte) 115, new class150[] { new class150(class546.field7810), new class150(class546.field7815), new class150(class546.field7817) });
        this.field6889 = new class649(this, 0, 0, false, false);
        this.field6900 = new class649(this, 0, 0, true, true);
        this.field6901 = new class649(this, 0, 0, false, false);
        this.field6893 = new class649(this, 0, 0, true, true);
        this.field6896 = new class649(this, 0, 0, false, false);
        this.field6903 = new class649(this, 0, 0, true, true);
        this.field6894 = new class649(this, 0, 0, false, false);
        this.field6891 = new class649(this, 0, 0, true, true);
        this.field6886 = new class649(this, 0, 0, false, false);
        this.field6887 = new class649(this, 0, 0, true, true);
        this.field6879 = new class80(this);
        this.field6888 = this.method1181((byte) 111, true);
        this.method2760(1571);
        this.field6739 = new class6(this);
        this.field6800[1] = this.method1145(2, 1);
        this.field6800[2] = this.method1145(2, 2);
        this.field6800[4] = this.method1145(arg0 + -7, 4);
        this.field6800[5] = this.method1145(2, 5);
        this.field6800[6] = this.method1145(arg0 + -7, 6);
        this.field6800[7] = this.method1145(2, 7);
        this.field6800[3] = this.method1145(2, 3);
        this.field6800[8] = this.method1145(2, 8);
        this.field6800[arg0] = this.method1145(2, 9);
        if (!this.field6800[2].method178((byte) -84)) {
            this.field6800[2] = this.method1145(2, 0);
        }
        if (!this.field6800[4].method178((byte) -17)) {
            this.field6800[4] = this.field6800[2];
        }
        if (!this.field6800[8].method178((byte) -46)) {
            this.field6800[8] = this.field6800[4];
        }
        if (!this.field6800[9].method178((byte) -40)) {
            this.field6800[9] = this.field6800[8];
        }
        this.method1200(0);
        this.method378();
    }

    @OriginalMember(owner = "client!fo", name = "y", descriptor = "(B)Lww;", line = 3046)
    public final class667 method2752(byte arg0) {
        ++field6702;
        if (arg0 != 3) {
            this.field6833 = null;
        }
        return this.field6774;
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(Ljava/lang/String;II)V", line = 3064)
    public static final void method2753(String arg0, int arg1, int arg2) {
        ++class662.field9409;
        ++field6628;
        class480.method2802(class404.field5380, 16751);
        class334.field4314.method2525(1 - -class265.method1504(arg0, (byte) 88), -81849);
        class334.field4314.method2573(arg0, arg1 + 16744);
        if (arg1 != 2) {
            field6611 = true;
        }
        class334.field4314.method2546(true, arg2);
    }

    @OriginalMember(owner = "client!fo", name = "m", descriptor = "()I", line = 3079)
    public final int method352() {
        ++field6745;
        return this.field6797 + -2;
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(Ldga;)V", line = 3088)
    public final void method384(class190 arg0) {
        ++field6618;
        this.field6833 = (class81) arg0;
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(IIZIIZ)V", line = 3096)
    private final void method2754(int arg0, int arg1, boolean arg2, int arg3, int arg4, boolean arg5) {
        boolean var7 = arg5 & this.method380();
        ++field6623;
        int var8 = -124 % ((36 - arg1) / 59);
        if (!var7 && (arg4 == 4 || arg4 == 8 || arg4 == 9)) {
            arg4 = 2;
            arg0 = ~arg4 == -5 ? arg3 & 1 : 1;
            arg3 = 0;
        }
        if (arg4 != 0 && arg2) {
            arg4 |= Integer.MIN_VALUE;
        }
        if (this.field6831 != arg4) {
            if (this.field6831 != 0) {
                this.field6800[this.field6831 & Integer.MAX_VALUE].method174(-60);
            }
            if (~arg4 == -1) {
                this.field6809 = null;
            } else {
                this.field6809 = this.field6800[Integer.MAX_VALUE & arg4];
                this.field6809.method180(arg2, -1);
                this.field6809.method177(arg2, true);
                this.field6809.method175(arg3, arg0, 117);
            }
            this.field6865 = arg3;
            this.field6838 = arg0;
            this.field6831 = arg4;
        } else if (this.field6831 != 0) {
            this.field6800[Integer.MAX_VALUE & this.field6831].method177(arg2, true);
            if (~this.field6865 != ~arg3 || ~this.field6838 != ~arg0) {
                this.field6800[this.field6831 & Integer.MAX_VALUE].method175(arg3, arg0, 119);
                this.field6838 = arg0;
                this.field6865 = arg3;
            }
        }
    }

    @OriginalMember(owner = "client!fo", name = "b", descriptor = "(IZ)V", line = 3150)
    public final void method2755(int arg0, boolean arg1) {
        if (this.field6871 != arg1) {
            this.field6871 = arg1;
            this.method1147((byte) 102);
            this.field6846 &= -32;
        }
        if (arg0 == -32) {
            ++field6598;
        }
    }

    @OriginalMember(owner = "client!fo", name = "Z", descriptor = "(I)V", line = 3169)
    private final void method2756(int arg0) {
        ++field6602;
        if (arg0 != 8) {
            this.method2705(45);
        }
        this.field6849 = false;
        if (class618.field8699 == this.field6844) {
            this.method2709(79);
            this.method2704(-25907);
        }
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(Lcea;BI)V", line = 3187)
    public final void method2757(class196 arg0, byte arg1, int arg2) {
        if (arg1 != -73) {
            this.method332();
        }
        ++field6624;
        this.method1168(false, false, arg0, arg2, 4);
    }

    @OriginalMember(owner = "client!fo", name = "ab", descriptor = "(I)V", line = 3198)
    private final void method2758(int arg0) {
        this.field6890 = this.method1203(true, false);
        ++field6715;
        int var2 = -34 / ((50 - arg0) / 47);
        this.field6890.method169(24, 12, 1103);
        this.field6904 = this.method1161((byte) 121, new class150[] { new class150(class546.field7810) });
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(Loh;BLoh;)V", line = 3212)
    public final void method2759(class368 arg0, byte arg1, class368 arg2) {
        ++field6595;
        if (arg1 != -5) {
            this.field6904 = null;
        }
        boolean var4 = false;
        if (this.field6828[this.field6812] != arg2) {
            this.field6828[this.field6812] = arg2;
            this.method1162(true);
            var4 = true;
        }
        if (this.field6796[this.field6812] != arg0) {
            this.field6796[this.field6812] = arg0;
            this.method1172(-107);
            var4 = true;
        }
        if (var4) {
            this.field6846 &= -30;
        }
    }

    @OriginalMember(owner = "client!fo", name = "bb", descriptor = "(I)V", line = 3246)
    public final void method2760(int arg0) {
        ++field6773;
        Hashtable var2 = new Hashtable();
        if (this.field6707 != null && !this.field6707.isEmpty()) {
            Enumeration var3 = this.field6707.keys();
            while (var3.hasMoreElements()) {
                Canvas var4 = (Canvas) var3.nextElement();
                var2.put(var4, this.method1197(var4, 10));
            }
        }
        this.field6707 = var2;
        this.method2731(arg0 ^ 1570);
        this.method2758(-82);
        if (arg0 == 1571) {
            this.field6879.method511(true, this);
        }
    }

    @OriginalMember(owner = "client!fo", name = "FA", descriptor = "(IIIIII)Z", line = 3281)
    public final boolean method357(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field6766;
        float var7 = this.field6779.method3754((float) arg0, (byte) -110, (float) arg1, (float) arg2);
        if (var7 < 1.0F) {
            var7 = 1.0F;
        }
        float var8 = this.field6779.method3754((float) arg3, (byte) -125, (float) arg4, (float) arg5);
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        if ((!((float) this.field6823 > var7) || !((float) this.field6823 > var8)) && (!((float) this.field6878 < var7) || !(var8 > (float) this.field6878))) {
            int var9 = (int) ((float) this.field6845 * this.field6779.method3758((float) arg2, -7673, (float) arg1, (float) arg0) / var7);
            int var10 = (int) ((float) this.field6845 * this.field6779.method3758((float) arg5, -7673, (float) arg4, (float) arg3) / var8);
            if (this.field6792 > (float) var9 && (float) var10 < this.field6792 || (float) var9 > this.field6784 && this.field6784 < (float) var10) {
                return false;
            } else {
                int var11 = (int) ((float) this.field6787 * this.field6779.method3747((float) arg2, (float) arg0, 0, (float) arg1) / var7);
                int var12 = (int) ((float) this.field6787 * this.field6779.method3747((float) arg5, (float) arg3, 0, (float) arg4) / var8);
                return (!(this.field6793 > (float) var11) || !((float) var12 < this.field6793)) && (!((float) var11 > this.field6804) || !((float) var12 > this.field6804));
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(Lba;Ltg;Lq;Lmr;I)V", line = 3321)
    public final void method301(class350 arg0, class211 arg1, class389 arg2, class130 arg3, int arg4) {
        arg0.method904(arg2, arg3, arg4);
        ++field6660;
        this.method283(arg1);
    }

    @OriginalMember(owner = "client!fo", name = "cb", descriptor = "(I)V", line = 3330)
    private final void method2761(int arg0) {
        if (this.field6809 != null) {
            this.field6809.method179((byte) 123);
        }
        ++field6767;
        if (arg0 == 0) {
            this.method1141((byte) -28);
        }
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(ILvj;ZB[FI)Lae;", line = 3350)
    public final class228 method2762(int arg0, class402 arg1, boolean arg2, byte arg3, float[] arg4, int arg5) {
        if (arg3 != -37) {
            this.field6888 = null;
        }
        ++field6714;
        return this.method1201(0, arg4, arg2, arg0, 0, true, arg5, arg1);
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(I[FZIIZILvj;)Lae;")
    public abstract class228 method1201(int arg0, float[] arg1, boolean arg2, int arg3, int arg4, boolean arg5, int arg6, class402 arg7);

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(Z[[III)Lvfa;")
    public abstract class614 method1193(boolean arg0, int[][] arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!fo", name = "b", descriptor = "(B)V")
    public abstract void method1164(byte arg0);

    @OriginalMember(owner = "client!fo", name = "n", descriptor = "(I)V")
    public abstract void method1153(int arg0);

    @OriginalMember(owner = "client!fo", name = "o", descriptor = "(I)V")
    public abstract void method1171(int arg0);

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(ILdj;)V")
    public abstract void method1180(int arg0, class311 arg1);

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(ILjava/lang/Object;Ljava/awt/Canvas;)V")
    public abstract void method1189(int arg0, Object arg1, Canvas arg2);

    @OriginalMember(owner = "client!fo", name = "d", descriptor = "(B)V")
    public abstract void method1173(byte arg0);

    @OriginalMember(owner = "client!fo", name = "r", descriptor = "(I)V")
    public abstract void method1149(int arg0);

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(ZZLcea;II)V")
    public abstract void method1168(boolean arg0, boolean arg1, class196 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(Ljava/awt/Canvas;I)Ljava/lang/Object;")
    public abstract Object method1197(Canvas arg0, int arg1);

    @OriginalMember(owner = "client!fo", name = "f", descriptor = "(B)V")
    public abstract void method1141(byte arg0);

    @OriginalMember(owner = "client!fo", name = "t", descriptor = "(I)V")
    public abstract void method1143(int arg0);

    @OriginalMember(owner = "client!fo", name = "h", descriptor = "(B)V")
    public abstract void method1166(byte arg0);

    @OriginalMember(owner = "client!fo", name = "x", descriptor = "(I)V")
    public abstract void method1184(int arg0);

    @OriginalMember(owner = "client!fo", name = "i", descriptor = "(B)V")
    public abstract void method1183(byte arg0);

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(B[Lada;)Leh;")
    public abstract class328 method1161(byte arg0, class150[] arg1);

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(IBLtfa;)V")
    public abstract void method1198(int arg0, byte arg1, class31 arg2);

    @OriginalMember(owner = "client!fo", name = "z", descriptor = "(I)V")
    public abstract void method1167(int arg0);

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(Lvj;Lnb;I)Z")
    public abstract boolean method1192(class402 arg0, class271 arg1, int arg2);

    @OriginalMember(owner = "client!fo", name = "B", descriptor = "(I)V")
    public abstract void method1179(int arg0);

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(BLjava/lang/Object;Ljava/awt/Canvas;)V")
    public abstract void method1160(byte arg0, Object arg1, Canvas arg2);

    @OriginalMember(owner = "client!fo", name = "b", descriptor = "(ZZ)Ltfa;")
    public abstract class31 method1203(boolean arg0, boolean arg1);

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(IBILvj;Lnb;)Lae;")
    public abstract class228 method1185(int arg0, byte arg1, int arg2, class402 arg3, class271 arg4);

    @OriginalMember(owner = "client!fo", name = "g", descriptor = "(Z)V")
    public abstract void method1194(boolean arg0);

    @OriginalMember(owner = "client!fo", name = "o", descriptor = "(B)V")
    public abstract void method1147(byte arg0);

    @OriginalMember(owner = "client!fo", name = "G", descriptor = "(I)V")
    public abstract void method1177(int arg0);

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(ILeh;)V")
    public abstract void method1174(int arg0, class328 arg1);

    @OriginalMember(owner = "client!fo", name = "c", descriptor = "(ZZ)V")
    public abstract void method1140(boolean arg0, boolean arg1);

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(IIBLvd;Ltj;II)V")
    public abstract void method1154(int arg0, int arg1, byte arg2, class36 arg3, class180 arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(ILcea;IZ)V")
    public abstract void method1188(int arg0, class196 arg1, int arg2, boolean arg3);

    @OriginalMember(owner = "client!fo", name = "J", descriptor = "(I)V")
    public abstract void method1172(int arg0);

    @OriginalMember(owner = "client!fo", name = "b", descriptor = "(BZ)Ltj;")
    public abstract class180 method1181(byte arg0, boolean arg1);

    @OriginalMember(owner = "client!fo", name = "K", descriptor = "(I)V")
    public abstract void method1155(int arg0);

    @OriginalMember(owner = "client!fo", name = "M", descriptor = "(I)V")
    public abstract void method1163(int arg0);

    @OriginalMember(owner = "client!fo", name = "O", descriptor = "(I)V")
    public abstract void method1199(int arg0);

    @OriginalMember(owner = "client!fo", name = "P", descriptor = "(I)V")
    public abstract void method1175(int arg0);

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(IZI[IZII)Lae;")
    public abstract class228 method1144(int arg0, boolean arg1, int arg2, int[] arg3, boolean arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!fo", name = "s", descriptor = "(B)V")
    public abstract void method1195(byte arg0);

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(Lvj;Lnb;B)Z")
    public abstract boolean method1169(class402 arg0, class271 arg1, byte arg2);

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(I[BIZILvj;II)Lae;")
    public abstract class228 method1165(int arg0, byte[] arg1, int arg2, boolean arg3, int arg4, class402 arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(IIILvd;)V")
    public abstract void method1176(int arg0, int arg1, int arg2, class36 arg3);

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "([BILvj;BII)Lte;")
    public abstract class560 method1187(byte[] arg0, int arg1, class402 arg2, byte arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!fo", name = "u", descriptor = "(B)V")
    public abstract void method1190(byte arg0);

    @OriginalMember(owner = "client!fo", name = "U", descriptor = "(I)V")
    public abstract void method1142(int arg0);

    @OriginalMember(owner = "client!fo", name = "V", descriptor = "(I)V")
    public abstract void method1186(int arg0);

    @OriginalMember(owner = "client!fo", name = "W", descriptor = "(I)F")
    public abstract float method1156(int arg0);

    @OriginalMember(owner = "client!fo", name = "g", descriptor = "(II)V")
    public abstract void method1178(int arg0, int arg1);

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(Ljava/lang/Object;ILjava/awt/Canvas;)V")
    public abstract void method1191(Object arg0, int arg1, Canvas arg2);

    @OriginalMember(owner = "client!fo", name = "j", descriptor = "(Z)V")
    public abstract void method1162(boolean arg0);
}
