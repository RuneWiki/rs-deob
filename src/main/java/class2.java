import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class2 extends class62 {

    @OriginalMember(owner = "client!aa", name = "db", descriptor = "I")
    public static int field12 = 1;

    @OriginalMember(owner = "client!aa", name = "bb", descriptor = "I")
    public static int field10 = -1;

    @OriginalMember(owner = "client!aa", name = "V", descriptor = "Llc;")
    public static class69 field4 = class69.method470((byte) -127, "You have only just left another world");

    @OriginalMember(owner = "client!aa", name = "ab", descriptor = "Z")
    public static boolean field9 = false;

    @OriginalMember(owner = "client!aa", name = "cb", descriptor = "Llc;")
    public static class69 field11 = class69.method470((byte) -111, "Invalid username or password)3");

    @OriginalMember(owner = "client!aa", name = "hb", descriptor = "Llc;")
    public static class69 field16 = class69.method470((byte) -112, "No response from server");

    @OriginalMember(owner = "client!aa", name = "ib", descriptor = "J")
    public static long field17 = 0L;

    @OriginalMember(owner = "client!aa", name = "kb", descriptor = "I")
    public static int field19 = 0;

    @OriginalMember(owner = "client!aa", name = "eb", descriptor = "I")
    public static int field13;

    @OriginalMember(owner = "client!aa", name = "fb", descriptor = "I")
    public static int field14;

    @OriginalMember(owner = "client!aa", name = "gb", descriptor = "I")
    public static int field15;

    @OriginalMember(owner = "client!aa", name = "jb", descriptor = "I")
    public int field18;

    @OriginalMember(owner = "client!aa", name = "U", descriptor = "I")
    public static int field3;

    @OriginalMember(owner = "client!aa", name = "W", descriptor = "I")
    public static int field5;

    @OriginalMember(owner = "client!aa", name = "X", descriptor = "I")
    public static int field6;

    @OriginalMember(owner = "client!aa", name = "Y", descriptor = "I")
    public int field7;

    @OriginalMember(owner = "client!aa", name = "Z", descriptor = "I")
    public int field8;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IILpd;)V")
    private final void method8(int arg0, int arg1, class94 arg2) {
        field3++;
        if (arg0 == arg1) {
            this.field8 = arg2.method665(8666);
            this.field7 = arg2.method703((byte) 81);
            this.field18 = arg2.method703((byte) -102);
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(B)V")
    public static final void method9(byte arg0) {
        field15++;
        System.out.println("Usage: worldid, [live/office/local], [live/rc/wip], [lowmem/highmem], [free/members],");
        System.exit(1);
        int var1 = 70 % ((arg0 - 46) / 60);
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lpd;I)V")
    public final void method10(class94 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method703((byte) 96);
            if (var3 == 0) {
                if (arg1 != -13772) {
                    field19 = 71;
                }
                field5++;
                return;
            }
            this.method8(var3, 1, arg0);
        }
    }

    @OriginalMember(owner = "client!aa", name = "g", descriptor = "(I)V")
    public static void method11(int arg0) {
        if (arg0 != 1) {
            method12(-110);
        }
        field11 = null;
        field4 = null;
        field16 = null;
    }

    @OriginalMember(owner = "client!aa", name = "h", descriptor = "(I)V")
    public static final void method12(int arg0) {
        class89.field1936.method220((byte) -113);
        field14++;
        if (arg0 < 13) {
            field16 = null;
        }
    }
}
