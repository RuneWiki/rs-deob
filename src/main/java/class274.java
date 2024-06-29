import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class274 {

    @OriginalMember(owner = "client!df", name = "a", descriptor = "I")
    public int field3935 = 0;

    @OriginalMember(owner = "client!df", name = "o", descriptor = "[I")
    public int[] field3949 = new int[256];

    @OriginalMember(owner = "client!df", name = "l", descriptor = "[[I")
    public int[][] field3946 = new int[6][258];

    @OriginalMember(owner = "client!df", name = "i", descriptor = "[[I")
    public int[][] field3943 = new int[6][258];

    @OriginalMember(owner = "client!df", name = "p", descriptor = "[B")
    public byte[] field3950 = new byte[18002];

    @OriginalMember(owner = "client!df", name = "w", descriptor = "[I")
    public int[] field3957 = new int[6];

    @OriginalMember(owner = "client!df", name = "g", descriptor = "[[B")
    public byte[][] field3941 = new byte[6][258];

    @OriginalMember(owner = "client!df", name = "y", descriptor = "[Z")
    public boolean[] field3959 = new boolean[256];

    @OriginalMember(owner = "client!df", name = "e", descriptor = "[[I")
    public int[][] field3939 = new int[6][258];

    @OriginalMember(owner = "client!df", name = "A", descriptor = "[I")
    public int[] field3961 = new int[257];

    @OriginalMember(owner = "client!df", name = "b", descriptor = "[Z")
    public boolean[] field3936 = new boolean[16];

    @OriginalMember(owner = "client!df", name = "I", descriptor = "[I")
    public int[] field3969 = new int[16];

    @OriginalMember(owner = "client!df", name = "v", descriptor = "[B")
    public byte[] field3956 = new byte[4096];

    @OriginalMember(owner = "client!df", name = "K", descriptor = "[B")
    public byte[] field3971 = new byte[256];

    @OriginalMember(owner = "client!df", name = "H", descriptor = "[B")
    public byte[] field3968 = new byte[18002];

    @OriginalMember(owner = "client!df", name = "F", descriptor = "I")
    public int field3966 = 0;

    @OriginalMember(owner = "client!df", name = "m", descriptor = "Z")
    public static boolean field3947 = true;

    @OriginalMember(owner = "client!df", name = "r", descriptor = "Z")
    public static boolean field3952 = false;

    @OriginalMember(owner = "client!df", name = "C", descriptor = "[Ljava/lang/String;")
    public static String[] field3963 = new String[100];

    @OriginalMember(owner = "client!df", name = "G", descriptor = "Lpi;")
    public static class342 field3967 = new class342("Drop", "Fallen lassen", "Poser", "Largar");

    @OriginalMember(owner = "client!df", name = "N", descriptor = "I")
    public static int field3974 = 0;

    @OriginalMember(owner = "client!df", name = "J", descriptor = "B")
    public byte field3970;

    @OriginalMember(owner = "client!df", name = "c", descriptor = "I")
    public static int field3937;

    @OriginalMember(owner = "client!df", name = "d", descriptor = "I")
    public int field3938;

    @OriginalMember(owner = "client!df", name = "f", descriptor = "I")
    public int field3940;

    @OriginalMember(owner = "client!df", name = "h", descriptor = "I")
    public int field3942;

    @OriginalMember(owner = "client!df", name = "j", descriptor = "I")
    public int field3944;

    @OriginalMember(owner = "client!df", name = "n", descriptor = "I")
    public int field3948;

    @OriginalMember(owner = "client!df", name = "q", descriptor = "I")
    public int field3951;

    @OriginalMember(owner = "client!df", name = "s", descriptor = "I")
    public int field3953;

    @OriginalMember(owner = "client!df", name = "t", descriptor = "I")
    public int field3954;

    @OriginalMember(owner = "client!df", name = "u", descriptor = "I")
    public int field3955;

    @OriginalMember(owner = "client!df", name = "x", descriptor = "I")
    public int field3958;

    @OriginalMember(owner = "client!df", name = "z", descriptor = "I")
    public static int field3960;

    @OriginalMember(owner = "client!df", name = "B", descriptor = "I")
    public int field3962;

    @OriginalMember(owner = "client!df", name = "D", descriptor = "I")
    public int field3964;

    @OriginalMember(owner = "client!df", name = "L", descriptor = "I")
    public static int field3972;

    @OriginalMember(owner = "client!df", name = "M", descriptor = "I")
    public int field3973;

    @OriginalMember(owner = "client!df", name = "k", descriptor = "[B")
    public byte[] field3945;

    @OriginalMember(owner = "client!df", name = "E", descriptor = "[B")
    public byte[] field3965;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(I)V", line = 9)
    public static void method1758(int arg0) {
        if (arg0 == 0) {
            field3967 = null;
            field3963 = null;
        }
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(I)V", line = 57)
    public static final void method1759(int arg0) {
        field3972++;
        if (class388.field5841) {
            return;
        }
        if (class443.field6623.field601) {
            class526.field7779 = ((int) class526.field7779 - 65 & 0xFFFFFF80);
        } else {
            class174.field2668 += (-class174.field2668 - 24.0F) / 2.0F;
        }
        class157.field2461 = true;
        if (arg0 != -128) {
            method1758(68);
        }
        class388.field5841 = true;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Lmq;B)Lmq;", line = 95)
    public static final class350 method1760(class350 arg0, byte arg1) {
        int var2 = -128 / ((arg1 + 2) / 40);
        field3960++;
        class350 var3 = client.method1350(arg0);
        if (var3 == null) {
            var3 = arg0.field5334;
        }
        return var3;
    }
}
