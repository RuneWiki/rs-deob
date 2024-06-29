import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class14 {

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "Lna;")
    public static class26 field226 = class69.method505("Attaquer", (byte) -126);

    @OriginalMember(owner = "client!kh", name = "g", descriptor = "Lhh;")
    public static class209 field232 = new class209();

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "I")
    public static int field227;

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "I")
    public static int field228;

    @OriginalMember(owner = "client!kh", name = "d", descriptor = "I")
    public static int field229;

    @OriginalMember(owner = "client!kh", name = "e", descriptor = "I")
    public static int field230;

    @OriginalMember(owner = "client!kh", name = "f", descriptor = "I")
    public static int field231;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(B)Lek;", line = 13)
    public static final class183 method105(byte arg0) {
        field227++;
        class183 var1 = new class183(class88.field1445, class37.field607, class58.field936[0], class82.field1281[0], class141.field2149[0], class98.field1596[0], class205.field3203[0], class190.field2975);
        if (arg0 <= 55) {
            method107(86, -88);
        }
        class160.method1088((byte) 127);
        return var1;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(I)V", line = 27)
    public static void method106(int arg0) {
        field232 = null;
        field226 = null;
        if (arg0 <= 96) {
            field231 = 55;
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(II)V", line = 52)
    public static final void method107(int arg0, int arg1) {
        field229++;
        if (arg0 != 104) {
            method108(114, 95, -80, (byte) -90, -2, 56);
        }
        class151.field2373.method1985(arg0 ^ 0xFFFFFFEA, arg1);
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIIBII)V", line = 65)
    public static final void method108(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        field228++;
        int var8 = arg2 + 1;
        class76.method543(class45.field710[arg2], arg5, 92, arg1, arg0);
        int var9 = arg4 - 1;
        class76.method543(class45.field710[arg4], arg5, 97, arg1, arg0);
        if (arg3 >= 23) {
            for (int var6 = var8; var6 <= var9; var6++) {
                int[] var7 = class45.field710[var6];
                var7[arg5] = var7[arg1] = arg0;
            }
        }
    }

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "(I)V", line = 89)
    public static final void method109(int arg0) {
        class59.field957++;
        int var1 = -126 / ((-arg0 - 26) / 52);
        field230++;
        class114.field1789.method1431(0, 104);
        class114.field1789.method579(0L, -2037491440);
    }
}
