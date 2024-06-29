import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class12 extends class149 {

    @OriginalMember(owner = "client!kh", name = "n", descriptor = "[I")
    public static int[] field165 = new int[99];

    @OriginalMember(owner = "client!kh", name = "p", descriptor = "Ljava/lang/String;")
    public static String field167;

    @OriginalMember(owner = "client!kh", name = "o", descriptor = "Leg;")
    public static class272 field166;

    @OriginalMember(owner = "client!kh", name = "g", descriptor = "I")
    public static int field158;

    @OriginalMember(owner = "client!kh", name = "h", descriptor = "I")
    public static int field159;

    @OriginalMember(owner = "client!kh", name = "i", descriptor = "I")
    public static int field160;

    @OriginalMember(owner = "client!kh", name = "j", descriptor = "I")
    public static int field161;

    @OriginalMember(owner = "client!kh", name = "k", descriptor = "I")
    public static int field162;

    @OriginalMember(owner = "client!kh", name = "l", descriptor = "I")
    public static int field163;

    @OriginalMember(owner = "client!kh", name = "m", descriptor = "I")
    public static int field164;

    @OriginalMember(owner = "client!kh", name = "q", descriptor = "[Lve;")
    public static class240[] field168;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(BI)V")
    public static final void method68(byte arg0, int arg1) {
        class168.field2730.method1832(arg1, (byte) 106);
        if (arg0 == 48) {
            field164++;
            class263.field4165.method1832(arg1, (byte) 109);
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(Z)Lfd;")
    public static final class219 method69(boolean arg0) {
        field163++;
        if (arg0) {
            method69(false);
        }
        return class106.field1853.length > class201.field3238 ? class106.field1853[class201.field3238++] : null;
    }

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "(I)[Lwe;")
    public static final class43[] method70(int arg0) {
        class43[] var1 = new class43[class154.field2484];
        field162++;
        for (int var2 = arg0; var2 < class154.field2484; var2++) {
            int var3 = class263.field4168[var2] * class207.field3348[var2];
            byte[] var4 = class168.field2726[var2];
            int[] var5 = new int[var3];
            for (int var6 = 0; var6 < var3; var6++) {
                var5[var6] = class131.field2187[class204.method1369(var4[var6], 255)];
            }
            var1[var2] = new class43(class88.field1215, class64.field904, class70.field968[var2], class249.field3993[var2], class207.field3348[var2], class263.field4168[var2], var5);
        }
        class111.method804(0);
        return var1;
    }

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "(B)V")
    public static void method71(byte arg0) {
        if (arg0 <= 29) {
            field165 = null;
        }
        field168 = null;
        field166 = null;
        field165 = null;
        field167 = null;
    }

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "(BI)V")
    public static final void method72(byte arg0, int arg1) {
        class204 var2 = (class204) class78.field1067.method457((long) arg1, (byte) -115);
        field160++;
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < var2.field3276.length; var3++) {
            var2.field3276[var3] = -1;
            var2.field3274[var3] = 0;
        }
        int var4 = 22 / ((arg0 - 44) / 60);
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(ILjj;Ljj;Lbc;Ljj;)Z")
    public static final boolean method73(int arg0, class134 arg1, class134 arg2, class105 arg3, class134 arg4) {
        class93.field1326 = arg3;
        class72.field989 = arg2;
        if (arg0 > -80) {
            method69(false);
        }
        class103.field1688 = arg4;
        class202.field3244 = arg1;
        field159++;
        return true;
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) (Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D + (double) var2);
            var0 += var3;
            field165[var1] = var0 / 4;
        }
        field167 = "green:";
        field166 = new class272(16);
    }
}
