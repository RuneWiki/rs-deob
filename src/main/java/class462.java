import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vp")
public class class462 {

    @OriginalMember(owner = "client!vp", name = "c", descriptor = "I")
    public int field6861 = 2;

    @OriginalMember(owner = "client!vp", name = "b", descriptor = "I")
    public int field6860 = 64;

    @OriginalMember(owner = "client!vp", name = "h", descriptor = "Z")
    public boolean field6866 = false;

    @OriginalMember(owner = "client!vp", name = "g", descriptor = "I")
    public int field6865 = 1;

    @OriginalMember(owner = "client!vp", name = "l", descriptor = "I")
    public int field6870 = 64;

    @OriginalMember(owner = "client!vp", name = "m", descriptor = "Z")
    public boolean field6871 = false;

    @OriginalMember(owner = "client!vp", name = "i", descriptor = "I")
    public int field6867 = -1;

    @OriginalMember(owner = "client!vp", name = "n", descriptor = "Lfr;")
    public static class231 field6872 = new class231(4);

    @OriginalMember(owner = "client!vp", name = "o", descriptor = "I")
    public static int field6873 = 2;

    @OriginalMember(owner = "client!vp", name = "p", descriptor = "Llo;")
    public static class306 field6874 = new class306("Unable to find ", "Spieler kann nicht gefunden werden: ", "Impossible de trouver ", "Não é possível encontrar ");

    @OriginalMember(owner = "client!vp", name = "q", descriptor = "Lnk;")
    public static class326 field6875 = new class326(71, -1);

    @OriginalMember(owner = "client!vp", name = "r", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field6876 = new CRC32();

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "I")
    public static int field6859;

    @OriginalMember(owner = "client!vp", name = "d", descriptor = "I")
    public static int field6862;

    @OriginalMember(owner = "client!vp", name = "e", descriptor = "I")
    public static int field6863;

    @OriginalMember(owner = "client!vp", name = "f", descriptor = "I")
    public static int field6864;

    @OriginalMember(owner = "client!vp", name = "j", descriptor = "I")
    public static int field6868;

    @OriginalMember(owner = "client!vp", name = "k", descriptor = "I")
    public static int field6869;

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(JI)Ljava/lang/String;")
    public static final String method2753(long arg0, int arg1) {
        field6864++;
        if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
            return null;
        } else if (arg0 % 37L == 0L) {
            return null;
        } else {
            int var3 = 0;
            long var4 = arg0;
            while (var4 != 0L) {
                var4 /= 37L;
                var3++;
            }
            StringBuffer var6 = new StringBuffer(var3);
            if (arg1 != 22585) {
                field6875 = null;
            }
            while (arg0 != 0L) {
                long var7 = arg0;
                arg0 /= 37L;
                var6.append(class265.field4448[(int) (var7 - (arg0 * 37L))]);
            }
            return var6.reverse().toString();
        }
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(II)V")
    public static final void method2754(int arg0, int arg1) {
        if (arg0 <= 101) {
            field6876 = null;
        }
        class239.field4117.method1603((byte) -125, arg1);
        field6863++;
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(Lia;II)V")
    public final void method2755(class23 arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            field6873 = 80;
        }
        field6859++;
        while (true) {
            int var4 = arg0.method126((byte) -125);
            if (var4 == 0) {
                return;
            }
            this.method2756(arg1 + 1, var4, arg2, arg0);
        }
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(IIILia;)V")
    private final void method2756(int arg0, int arg1, int arg2, class23 arg3) {
        if (arg0 == arg1) {
            this.field6867 = arg3.method132(arg0 ^ 0x1C);
            if (this.field6867 == 65535) {
                this.field6867 = -1;
            }
        } else if (arg1 == 2) {
            this.field6860 = arg3.method132(30) + 1;
            this.field6870 = arg3.method132(arg0 ^ 0x30) + 1;
        } else if (arg1 == 3) {
            arg3.method167(-2);
        } else if (arg1 == 4) {
            this.field6861 = arg3.method126((byte) -72);
        } else if (arg1 == 5) {
            this.field6865 = arg3.method126((byte) -89);
        } else if (arg1 == 6) {
            this.field6871 = true;
        } else if (arg1 == 7) {
            this.field6866 = true;
        }
        field6862++;
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(Lch;I)V")
    public static final void method2757(class166 arg0, int arg1) {
        field6868++;
        class451 var2 = (class451) class101.field1683.method2516((long) arg0.field3130, -1);
        if (var2 == null) {
            class465.method2768(arg0.field4720, (byte) 126, arg0, 0, null, arg0.field3159[0], null, arg0.field3158[0]);
        } else {
            var2.method2702(0);
        }
        if (arg1 <= 85) {
            field6873 = -113;
        }
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(III)V")
    public static final void method2758(int arg0, int arg1, int arg2) {
        field6869++;
        if (class468.method2782(arg1, -24955)) {
            class46.method330((byte) -68, class508.field7389[arg1], arg2);
            int var3 = 44 % ((arg0 + 45) / 63);
        }
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(B)V")
    public static void method2759(byte arg0) {
        field6872 = null;
        field6874 = null;
        field6875 = null;
        field6876 = null;
        int var1 = 123 % ((arg0 - 6) / 50);
    }
}
