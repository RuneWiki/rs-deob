import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class58 {

    @OriginalMember(owner = "client!f", name = "b", descriptor = "B")
    private byte field778;

    @OriginalMember(owner = "client!f", name = "t", descriptor = "I")
    public int field796;

    @OriginalMember(owner = "client!f", name = "l", descriptor = "I")
    public int field788;

    @OriginalMember(owner = "client!f", name = "q", descriptor = "I")
    public int field793;

    @OriginalMember(owner = "client!f", name = "k", descriptor = "I")
    public int field787;

    @OriginalMember(owner = "client!f", name = "j", descriptor = "I")
    public int field786;

    @OriginalMember(owner = "client!f", name = "c", descriptor = "I")
    public static int field779 = -1;

    @OriginalMember(owner = "client!f", name = "g", descriptor = "I")
    public static int field783 = -1;

    @OriginalMember(owner = "client!f", name = "i", descriptor = "[Lfk;")
    public static class208[] field785 = new class208[4];

    @OriginalMember(owner = "client!f", name = "e", descriptor = "Lqj;")
    public static class196 field781 = class80.method502("loc)3dat", -48);

    @OriginalMember(owner = "client!f", name = "d", descriptor = "Lqj;")
    public static class196 field780 = class80.method502("(U0a )2 non)2existant gosub script)2num: ", -48);

    @OriginalMember(owner = "client!f", name = "f", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field782 = new CRC32();

    @OriginalMember(owner = "client!f", name = "m", descriptor = "Ljb;")
    public static class118 field789 = null;

    @OriginalMember(owner = "client!f", name = "n", descriptor = "Lqj;")
    public static class196 field790 = class80.method502("Bitte warten Sie)3)3)3", -48);

    @OriginalMember(owner = "client!f", name = "p", descriptor = "Lea;")
    public static class243 field792 = new class243();

    @OriginalMember(owner = "client!f", name = "r", descriptor = "I")
    public static int field794 = 0;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "I")
    public static int field777;

    @OriginalMember(owner = "client!f", name = "h", descriptor = "I")
    public static int field784;

    @OriginalMember(owner = "client!f", name = "s", descriptor = "I")
    public static int field795;

    @OriginalMember(owner = "client!f", name = "o", descriptor = "[Lec;")
    public static class178[] field791;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(B)I")
    public final int method373(byte arg0) {
        field784++;
        if (arg0 < 33) {
            this.method373((byte) 68);
        }
        return (this.field778 & 0x8) == 8 ? 1 : 0;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(I)V")
    public static void method374(int arg0) {
        field782 = null;
        if (arg0 >= -114) {
            field780 = null;
        }
        field785 = null;
        field792 = null;
        field790 = null;
        field781 = null;
        field791 = null;
        field780 = null;
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(B)I")
    public final int method375(byte arg0) {
        field795++;
        return arg0 == 20 ? this.field778 & 0x7 : 86;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(II)I")
    public static final int method376(int arg0, int arg1) {
        field777++;
        if (arg1 != 127) {
            field783 = -108;
        }
        return arg0 & 0x7F;
    }

    @OriginalMember(owner = "client!f", name = "<init>", descriptor = "()V")
    public class58() {
    }

    @OriginalMember(owner = "client!f", name = "<init>", descriptor = "(Lp;)V")
    public class58(class56 arg0) {
        this.field778 = arg0.method350(16);
        this.field796 = arg0.method318(true);
        this.field788 = arg0.method311(0);
        this.field793 = arg0.method311(0);
        this.field787 = arg0.method311(0);
        this.field786 = arg0.method311(0);
    }
}
