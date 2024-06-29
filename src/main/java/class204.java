import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class204 {

    @OriginalMember(owner = "client!td", name = "g", descriptor = "Lch;")
    public static class117 field3650 = new class117();

    @OriginalMember(owner = "client!td", name = "h", descriptor = "[Ljk;")
    public static class72[] field3651 = new class72[50];

    @OriginalMember(owner = "client!td", name = "k", descriptor = "Lvf;")
    public static class265 field3654 = class87.method582(-46, "cyan:");

    @OriginalMember(owner = "client!td", name = "j", descriptor = "Lvf;")
    public static class265 field3653 = class87.method582(-46, " autres options");

    @OriginalMember(owner = "client!td", name = "l", descriptor = "I")
    public static int field3655 = 0;

    @OriginalMember(owner = "client!td", name = "i", descriptor = "Lvf;")
    public static class265 field3652 = class87.method582(-46, "huffman");

    @OriginalMember(owner = "client!td", name = "m", descriptor = "I")
    public static int field3656 = -1;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "I")
    public static int field3644;

    @OriginalMember(owner = "client!td", name = "b", descriptor = "I")
    public static int field3645;

    @OriginalMember(owner = "client!td", name = "c", descriptor = "I")
    public static int field3646;

    @OriginalMember(owner = "client!td", name = "d", descriptor = "I")
    public static int field3647;

    @OriginalMember(owner = "client!td", name = "e", descriptor = "I")
    public static int field3648;

    @OriginalMember(owner = "client!td", name = "f", descriptor = "I")
    public static int field3649;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Z)Z")
    public static final boolean method1397(boolean arg0) {
        if (!arg0) {
            return true;
        }
        field3649++;
        try {
            return class16.method115(19092);
        } catch (IOException var4) {
            class241.method1608((byte) -119);
            return true;
        } catch (Exception var5) {
            String var2 = "T2 - " + class93.field1650 + "," + class279.field4931 + "," + class178.field3168 + " - " + class221.field3966 + "," + (class214.field3827.field2536[0] + class64.field1248) + "," + (class214.field3827.field2575[0] + class231.field4073) + " - ";
            for (int var3 = 0; var3 < class221.field3966 && var3 < 50; var3++) {
                var2 = var2 + class207.field3730.field2483[var3] + ",";
            }
            class4.method28(-45, var5, var2);
            class270.method1855(-5);
            return true;
        }
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(Z)[Lvj;")
    public static final class88[] method1398(boolean arg0) {
        class88[] var1 = new class88[class43.field958];
        if (arg0) {
            method1399(false);
        }
        field3648++;
        for (int var2 = 0; var2 < class43.field958; var2++) {
            int var3 = class6.field127[var2] * class190.field3417[var2];
            byte[] var4 = class6.field230[var2];
            int[] var5 = new int[var3];
            for (int var6 = 0; var6 < var3; var6++) {
                var5[var6] = class268.field4715[class203.method1395(var4[var6], 255)];
            }
            var1[var2] = new class88(class203.field3643, class14.field429, class207.field3737[var2], class269.field4810[var2], class190.field3417[var2], class6.field127[var2], var5);
        }
        class261.method1739(26);
        return var1;
    }

    @OriginalMember(owner = "client!td", name = "c", descriptor = "(Z)Loa;")
    public static final class245 method1399(boolean arg0) {
        field3645++;
        try {
            if (arg0) {
                field3655 = -112;
            }
            return (class245) Class.forName("wf").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!td", name = "d", descriptor = "(Z)V")
    public static void method1400(boolean arg0) {
        field3653 = null;
        field3651 = null;
        field3652 = null;
        if (!arg0) {
            method1398(true);
        }
        field3654 = null;
        field3650 = null;
    }

    @OriginalMember(owner = "client!td", name = "e", descriptor = "(Z)V")
    public static final void method1401(boolean arg0) {
        if (class101.field1793 < class144.field2687) {
            class101.field1793 = (float) ((double) class101.field1793 / 30.0D + (double) class101.field1793);
            if (class144.field2687 < class101.field1793) {
                class101.field1793 = class144.field2687;
            }
            class30.method246(44);
        } else if (class144.field2687 < class101.field1793) {
            class101.field1793 = (float) ((double) class101.field1793 - (double) class101.field1793 / 30.0D);
            if (class144.field2687 > class101.field1793) {
                class101.field1793 = class144.field2687;
            }
            class30.method246(44);
        }
        if (class36.field842 != -1 && class174.field3125 != -1) {
            int var1 = class36.field842 - class278.field4911;
            if (var1 < 2 || var1 > 2) {
                var1 >>= 0x4;
            }
            int var2 = class174.field3125 - class263.field4590;
            if (var2 < 2 || var2 > 2) {
                var2 >>= 0x4;
            }
            if (var1 == 0 && var2 == 0) {
                class174.field3125 = -1;
                class36.field842 = -1;
            }
            class263.field4590 += var2;
            class278.field4911 -= -var1;
            class30.method246(44);
        }
        field3644++;
        if (!arg0) {
            field3647 = -122;
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "([BI)Lrh;")
    public static final class115 method1402(byte[] arg0, int arg1) {
        field3646++;
        if (arg0 == null) {
            return null;
        } else {
            int var2 = -110 % ((-arg1 - 71) / 47);
            class251 var3 = new class251(arg0, class207.field3737, class269.field4810, class190.field3417, class6.field127, class6.field230);
            class261.method1739(26);
            return var3;
        }
    }
}
