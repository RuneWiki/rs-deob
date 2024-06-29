import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hm")
public abstract class class20 {

    @OriginalMember(owner = "client!hm", name = "g", descriptor = "I")
    public int field224;

    @OriginalMember(owner = "client!hm", name = "b", descriptor = "I")
    public int field219;

    @OriginalMember(owner = "client!hm", name = "d", descriptor = "I")
    public int field221;

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "[I")
    public static int[] field218 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!hm", name = "e", descriptor = "I")
    public static int field222 = 0;

    @OriginalMember(owner = "client!hm", name = "f", descriptor = "I")
    public static int field223 = 0;

    @OriginalMember(owner = "client!hm", name = "j", descriptor = "Lek;")
    public static class184 field227 = null;

    @OriginalMember(owner = "client!hm", name = "h", descriptor = "I")
    public static int field225;

    @OriginalMember(owner = "client!hm", name = "i", descriptor = "I")
    public static int field226;

    @OriginalMember(owner = "client!hm", name = "c", descriptor = "[Lvl;")
    public static class80[] field220;

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(II)V", line = 11)
    public static final void method140(int arg0, int arg1) {
        class22.field237.method1429((byte) 127, arg1);
        field226++;
        if (arg0 == 2) {
            class266.field3983.method1429((byte) 127, arg1);
            class79.field1107.method1429((byte) 127, arg1);
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(I)V", line = 25)
    public static void method141(int arg0) {
        if (arg0 != 0) {
            field222 = -57;
        }
        field227 = null;
        field218 = null;
        field220 = null;
    }

    @OriginalMember(owner = "client!hm", name = "b", descriptor = "(I)V", line = 42)
    public static final void method142(int arg0) {
        class122.field1922 = 0;
        field225++;
        class167.field2521 = 0;
        class170.method1248(arg0 + 32);
        class117.method907(arg0 ^ 0x3);
        class108.method829(false);
        class30.method211(1);
        for (int var1 = 0; var1 < class167.field2521; var1++) {
            int var2 = class224.field3493[var1];
            if (class312.field4852 != class319.field4964[var2].field4481) {
                if (class319.field4964[var2].field1898 > 0) {
                    class115.method899(65534, class319.field4964[var2]);
                }
                class319.field4964[var2] = null;
            }
        }
        if (class79.field1112 != class88.field1293.field455) {
            throw new RuntimeException("gpp1 pos:" + class88.field1293.field455 + " psize:" + class79.field1112);
        }
        for (int var3 = arg0; var3 < class262.field3900; var3++) {
            if (class319.field4964[class225.field3504[var3]] == null) {
                throw new RuntimeException("gpp2 pos:" + var3 + " size:" + class262.field3900);
            }
        }
    }

    @OriginalMember(owner = "client!hm", name = "<init>", descriptor = "(III)V", line = 102)
    public class20(int arg0, int arg1, int arg2) {
        this.field224 = arg1;
        this.field219 = arg2;
        this.field221 = arg0;
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(III)V")
    public abstract void method139(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(IBI)V")
    public abstract void method143(int arg0, byte arg1, int arg2);

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(BII)V")
    public abstract void method144(byte arg0, int arg1, int arg2);
}
