import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gm")
public abstract class class75 {

    @OriginalMember(owner = "client!gm", name = "c", descriptor = "Lak;")
    public static class222 field1065 = new class222(9, 0, 4, 1);

    @OriginalMember(owner = "client!gm", name = "h", descriptor = "[[I")
    public static int[][] field1070 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };

    @OriginalMember(owner = "client!gm", name = "g", descriptor = "I")
    public static int field1069 = 1339;

    @OriginalMember(owner = "client!gm", name = "j", descriptor = "[I")
    public static int[] field1072 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "I")
    public static int field1063;

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "I")
    public static int field1064;

    @OriginalMember(owner = "client!gm", name = "f", descriptor = "I")
    public static int field1068;

    @OriginalMember(owner = "client!gm", name = "i", descriptor = "I")
    public static int field1071;

    @OriginalMember(owner = "client!gm", name = "e", descriptor = "Ljn;")
    public static class484 field1067;

    @OriginalMember(owner = "client!gm", name = "d", descriptor = "Ljava/awt/Frame;")
    public static Frame field1066;

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(Z)V")
    public static void method494(boolean arg0) {
        field1072 = null;
        field1067 = null;
        if (!arg0) {
            field1072 = null;
        }
        field1070 = null;
        field1066 = null;
        field1065 = null;
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(ZLjb;)Ljb;")
    public abstract class325 method495(boolean arg0, class325 arg1);

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(ZIBII)Lcq;")
    public static final class311 method496(boolean arg0, int arg1, byte arg2, int arg3, int arg4) {
        field1068++;
        class311 var5 = new class311();
        var5.field4525 = arg1;
        var5.field4526 = arg3;
        class213.field3010.method2317(-1, (long) arg4, var5);
        class149.method920(arg1, (byte) -128);
        class356 var6 = class4.method25(arg4, false);
        if (var6 != null) {
            class170.method1068(-72, var6);
        }
        if (class319.field4688 != null) {
            class170.method1068(-52, class319.field4688);
            class319.field4688 = null;
        }
        class330.method1983(17417);
        if (var6 != null) {
            class53.method393(!arg0, var6, (byte) -81);
        }
        if (!arg0) {
            class396.method2364(arg1);
        }
        if (arg2 <= 59) {
            return null;
        } else {
            if (!arg0 && class465.field6737 != -1) {
                class469.method2743(1, false, class465.field6737);
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(Lhe;Lps;Z)V")
    public static final void method497(class239 arg0, class59 arg1, boolean arg2) {
        if (!arg2) {
            field1072 = null;
        }
        class136.field1758 = arg1;
        field1064++;
        class162.field2103 = arg0;
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(I)V")
    public static final void method498(int arg0) {
        field1063++;
        int var1 = class276.field3953;
        int[] var2 = class330.field4790;
        if (arg0 > -56) {
            field1067 = null;
        }
        for (int var3 = 0; var3 < var1; var3++) {
            class313 var4 = class262.field3742[var2[var3]];
            if (var4 != null) {
                class399.method2381((byte) 103, var4, var4.method1773(-20));
            }
        }
    }
}
