import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class46 {

    @OriginalMember(owner = "client!eh", name = "d", descriptor = "I")
    public static int field851 = 1;

    @OriginalMember(owner = "client!eh", name = "f", descriptor = "I")
    public static int field853 = 0;

    @OriginalMember(owner = "client!eh", name = "h", descriptor = "Lsa;")
    public static class163 field855 = new class163(4096);

    @OriginalMember(owner = "client!eh", name = "j", descriptor = "Lsg;")
    private static class169 field857 = class165.method1060("Members object", 1536);

    @OriginalMember(owner = "client!eh", name = "k", descriptor = "[I")
    public static int[] field858 = new int[4000];

    @OriginalMember(owner = "client!eh", name = "l", descriptor = "Lsg;")
    public static class169 field859 = field857;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "I")
    public static int field848;

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "I")
    public static int field850;

    @OriginalMember(owner = "client!eh", name = "e", descriptor = "I")
    public static int field852;

    @OriginalMember(owner = "client!eh", name = "g", descriptor = "I")
    public static int field854;

    @OriginalMember(owner = "client!eh", name = "i", descriptor = "I")
    public static int field856;

    @OriginalMember(owner = "client!eh", name = "m", descriptor = "I")
    public static int field860;

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "Lke;")
    public static class95 field849;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(Z)V")
    public static final void method288(boolean arg0) {
        field856++;
        if (arg0) {
            field858 = null;
        }
        class192.field3787.method1205(!arg0);
        class95.field1808.method1205(true);
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(B)V")
    public static final void method289(byte arg0) {
        field852++;
        class82.field1510 = 0;
        class199.field3895 = 0;
        class140.method934(1);
        class82.method496(30932);
        class51.method316(true);
        if (arg0 > -73) {
            return;
        }
        for (int var1 = 0; var1 < class82.field1510; var1++) {
            int var3 = class35.field699[var1];
            if (class162.field3107 != class54.field992[var3].field3700) {
                class54.field992[var3].field3872 = null;
                class54.field992[var3] = null;
            }
        }
        if (class27.field553 != class85.field1559.field2346) {
            throw new RuntimeException("gnp1 pos:" + class85.field1559.field2346 + " psize:" + class27.field553);
        }
        for (int var2 = 0; var2 < class164.field3149; var2++) {
            if (class54.field992[class182.field3547[var2]] == null) {
                throw new RuntimeException("gnp2 pos:" + var2 + " size:" + class164.field3149);
            }
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(I)V")
    public static void method290(int arg0) {
        field855 = null;
        field858 = null;
        field859 = null;
        if (arg0 != 4) {
            field857 = null;
        }
        field857 = null;
        field849 = null;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIII)I")
    public static final int method291(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 != 0) {
            method289((byte) -63);
        }
        field848++;
        if (arg1 > 179) {
            arg2 /= 2;
        }
        if (arg1 > 192) {
            arg2 /= 2;
        }
        if (arg1 > 217) {
            arg2 /= 2;
        }
        if (arg1 > 243) {
            arg2 /= 2;
        }
        return (arg0 / 4 << 10) + arg1 / 2 + (arg2 / 32 << 7);
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(II)[B")
    public static final synchronized byte[] method292(int arg0, int arg1) {
        field854++;
        if (arg1 == 100 && class181.field3527 > 0) {
            byte[] var2 = class111.field2034[--class181.field3527];
            class111.field2034[class181.field3527] = null;
            return var2;
        } else if (~arg1 == arg0 && class96.field1814 > 0) {
            byte[] var3 = class180.field3509[--class96.field1814];
            class180.field3509[class96.field1814] = null;
            return var3;
        } else if (arg1 == 30000 && class148.field2718 > 0) {
            byte[] var4 = class94.field1759[--class148.field2718];
            class94.field1759[class148.field2718] = null;
            return var4;
        } else {
            return new byte[arg1];
        }
    }
}
