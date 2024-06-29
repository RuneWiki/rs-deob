import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cs")
public class class18 extends class28 implements class136 {

    @OriginalMember(owner = "client!cs", name = "l", descriptor = "I")
    public static int field154 = 0;

    @OriginalMember(owner = "client!cs", name = "p", descriptor = "[I")
    public static int[] field158 = new int[5];

    @OriginalMember(owner = "client!cs", name = "u", descriptor = "J")
    public static long field163 = -1L;

    @OriginalMember(owner = "client!cs", name = "w", descriptor = "C")
    public char field165;

    @OriginalMember(owner = "client!cs", name = "j", descriptor = "I")
    public int field152;

    @OriginalMember(owner = "client!cs", name = "m", descriptor = "I")
    public static int field155;

    @OriginalMember(owner = "client!cs", name = "n", descriptor = "I")
    public static int field156;

    @OriginalMember(owner = "client!cs", name = "o", descriptor = "I")
    public int field157;

    @OriginalMember(owner = "client!cs", name = "q", descriptor = "I")
    public int field159;

    @OriginalMember(owner = "client!cs", name = "r", descriptor = "I")
    public static int field160;

    @OriginalMember(owner = "client!cs", name = "s", descriptor = "I")
    public static int field161;

    @OriginalMember(owner = "client!cs", name = "t", descriptor = "I")
    public static int field162;

    @OriginalMember(owner = "client!cs", name = "v", descriptor = "I")
    public static int field164;

    @OriginalMember(owner = "client!cs", name = "k", descriptor = "J")
    public long field153;

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(Z)I", line = 3)
    public final int method97(boolean arg0) {
        if (arg0) {
            field163 = 75L;
        }
        field162++;
        return this.field159;
    }

    @OriginalMember(owner = "client!cs", name = "f", descriptor = "(I)V", line = 27)
    public static void method98(int arg0) {
        field158 = null;
        if (arg0 != 5) {
            field164 = 2;
        }
    }

    @OriginalMember(owner = "client!cs", name = "c", descriptor = "(I)C", line = 38)
    public final char method99(int arg0) {
        field156++;
        return arg0 == 17220 ? this.field165 : '\u0018';
    }

    @OriginalMember(owner = "client!cs", name = "b", descriptor = "(I)I", line = 50)
    public final int method100(int arg0) {
        field160++;
        if (arg0 != 4424) {
            this.method97(true);
        }
        return this.field157;
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(I)I", line = 61)
    public final int method101(int arg0) {
        if (arg0 == -14901) {
            field161++;
            return this.field152;
        } else {
            return -112;
        }
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(B)J", line = 79)
    public final long method102(byte arg0) {
        field155++;
        if (arg0 <= 99) {
            this.method101(53);
        }
        return this.field153;
    }
}
