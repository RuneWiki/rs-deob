import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class68 {

    @OriginalMember(owner = "client!ng", name = "h", descriptor = "I")
    public static int field1059 = 0;

    @OriginalMember(owner = "client!ng", name = "f", descriptor = "I")
    public static int field1057 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!ng", name = "g", descriptor = "[Lcf;")
    public static class174[] field1058 = new class174[27];

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "I")
    public int field1052;

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "I")
    public int field1053;

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "I")
    public static int field1054;

    @OriginalMember(owner = "client!ng", name = "d", descriptor = "I")
    public int field1055;

    @OriginalMember(owner = "client!ng", name = "i", descriptor = "I")
    public static int field1060;

    @OriginalMember(owner = "client!ng", name = "j", descriptor = "I")
    public static int field1061;

    @OriginalMember(owner = "client!ng", name = "l", descriptor = "I")
    public static int field1063;

    @OriginalMember(owner = "client!ng", name = "n", descriptor = "I")
    public static int field1065;

    @OriginalMember(owner = "client!ng", name = "o", descriptor = "I")
    public static int field1066;

    @OriginalMember(owner = "client!ng", name = "k", descriptor = "Lde;")
    public static class191 field1062;

    @OriginalMember(owner = "client!ng", name = "e", descriptor = "Lwi;")
    public static class23 field1056;

    @OriginalMember(owner = "client!ng", name = "m", descriptor = "Lva;")
    public static class36 field1064;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(JI)Lck;", line = 8)
    public static final class119 method494(long arg0, int arg1) {
        field1054++;
        return arg1 == 10 ? class299.method1993(10, false, arg1 ^ 0xD, arg0) : (class119) null;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IZ)V", line = 46)
    public static final void method495(int arg0, boolean arg1) {
        field1060++;
        if (class124.field1917.field4949 >> 7 == class244.field3952 && class124.field1917.field4991 >> 7 == field1059) {
            class244.field3952 = 0;
        }
        int var2 = class233.field3757;
        if (arg1) {
            var2 = 1;
        }
        for (int var3 = arg0; var3 < var2; var3++) {
            class292 var4;
            long var5;
            if (arg1) {
                var4 = class124.field1917;
                var5 = 8791798054912L;
            } else {
                var4 = class23.field346[class226.field3609[var3]];
                var5 = (long) class226.field3609[var3] << 32;
            }
            if (var4 != null && var4.method1038((byte) -114)) {
                var4.field4839 = false;
                int var7 = var4.field4949 >> 7;
                int var8 = var4.field4991 >> 7;
                if ((class281.field4640 && class233.field3757 > 200 || class233.field3757 > 50) && !arg1 && var4.field4976 == var4.field4948) {
                    var4.field4839 = true;
                }
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var4.field4849 == null || class1.field15 < var4.field4862 || var4.field4845 <= class1.field15) {
                        if ((var4.field4949 & 0x7F) == 64 && (var4.field4991 & 0x7F) == 64) {
                            if (class257.field4131[var7][var8] == class132.field2012) {
                                continue;
                            }
                            class257.field4131[var7][var8] = class132.field2012;
                        }
                        var4.field4981 = class207.method1304(class10.field189, (byte) 104, var4.field4949, var4.field4991);
                        class220.method1397(class10.field189, var4.field4949, var4.field4991, var4.field4981, 60, var4, var4.field5007, var5, var4.field5001);
                    } else {
                        var4.field4839 = false;
                        var4.field4981 = class207.method1304(class10.field189, (byte) 96, var4.field4949, var4.field4991);
                        class27.method196(class10.field189, var4.field4949, var4.field4991, var4.field4981, var4, var4.field5007, var5, var4.field4852, var4.field4866, var4.field4869, var4.field4864);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(ILfj;I)V", line = 147)
    private final void method496(int arg0, class3 arg1, int arg2) {
        if (arg2 == 1) {
            this.field1055 = arg1.method63((byte) 1);
            this.field1053 = arg1.method64((byte) -93);
            this.field1052 = arg1.method64((byte) -123);
        }
        field1061++;
        if (arg0 != 22749) {
            field1062 = (class191) null;
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(ZI)Lck;", line = 167)
    public static final class119 method497(boolean arg0, int arg1) {
        field1065++;
        if (arg0) {
            method494(15L, 24);
        }
        return arg1 < 999999999 ? class234.method1506(arg1, (byte) -79) : class217.field3509;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Lfj;I)V", line = 185)
    public final void method498(class3 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method64((byte) 127);
            if (var3 == 0) {
                field1066++;
                if (arg1 != 26963) {
                    field1063 = 76;
                }
                return;
            }
            this.method496(22749, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(I)V", line = 204)
    public static void method499(int arg0) {
        field1062 = null;
        field1064 = null;
        field1056 = null;
        field1058 = null;
        if (arg0 != -1024122105) {
            method494(-71L, -123);
        }
    }
}
