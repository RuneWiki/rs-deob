import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tm")
public class class80 {

    @OriginalMember(owner = "client!tm", name = "d", descriptor = "[I")
    private int[] field1064;

    @OriginalMember(owner = "client!tm", name = "i", descriptor = "I")
    public static int field1069 = 0;

    @OriginalMember(owner = "client!tm", name = "g", descriptor = "[I")
    public static int[] field1067 = new int[2048];

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "I")
    public static int field1061;

    @OriginalMember(owner = "client!tm", name = "c", descriptor = "I")
    public static int field1063;

    @OriginalMember(owner = "client!tm", name = "f", descriptor = "I")
    public static int field1066;

    @OriginalMember(owner = "client!tm", name = "h", descriptor = "I")
    public static int field1068;

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "Lhl;")
    public static class74 field1062;

    @OriginalMember(owner = "client!tm", name = "e", descriptor = "Ljava/awt/Frame;")
    public static Frame field1065;

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(I)V", line = 4)
    public static void method523(int arg0) {
        if (arg0 != 1) {
            method523(-82);
        }
        field1067 = null;
        field1062 = null;
        field1065 = null;
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(II)I", line = 19)
    public final int method524(int arg0, int arg1) {
        if (arg1 != 15265) {
            field1065 = (Frame) null;
        }
        field1068++;
        int var3 = (this.field1064.length >> 1) - 1;
        int var4 = arg0 & var3;
        while (true) {
            int var5 = this.field1064[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field1064[var4 + var4] == arg0) {
                return var5;
            }
            var4 = var3 & var4 + 1;
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(IBIIIII)V", line = 55)
    public static final void method525(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1063++;
        class323 var7 = class291.method2078(arg4, arg3, 0);
        if (var7 != null && var7.field5126 != null) {
            class185 var8 = new class185();
            var8.field2793 = var7;
            var8.field2789 = var7.field5126;
            class208.method1456(-7155, var8);
        }
        class161.field2479 = arg6;
        int var9 = 86 / ((arg1 - 66) / 53);
        class5.field48 = arg5;
        class196.field2978 = arg3;
        class283.field4515 = arg2;
        class225.field3393 = arg4;
        class139.field2088 = arg0;
        class101.field1371 = true;
        class107.method693(var7, 6);
    }

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "(I)Lch;", line = 88)
    public static final class158 method526(int arg0) {
        field1061++;
        int var1 = class259.field4093[0] * class245.field3855[0];
        byte[] var2 = class14.field145[0];
        int[] var3 = new int[var1];
        for (int var4 = 0; var4 < var1; var4++) {
            var3[var4] = class251.field3978[class261.method1840(var2[var4], 255)];
        }
        int var5 = -75 % ((-arg0) / 60);
        class158 var6 = new class158(class122.field1683, class253.field4004, class110.field1518[0], class33.field392[0], class245.field3855[0], class259.field4093[0], var3);
        class99.method627(3735);
        return var6;
    }

    @OriginalMember(owner = "client!tm", name = "<init>", descriptor = "([I)V", line = 120)
    public class80(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= arg0.length + (arg0.length >> 1); var2 <<= 0x1) {
        }
        this.field1064 = new int[var2 + var2];
        for (int var3 = 0; var3 < (var2 + var2); var3++) {
            this.field1064[var3] = -1;
        }
        int var4 = 0;
        while (arg0.length > var4) {
            int var5;
            for (var5 = var2 - 1 & arg0[var4]; this.field1064[var5 + var5 + 1] != -1; var5 = var5 + 1 & var2 + -1) {
            }
            this.field1064[var5 + var5] = arg0[var4];
            this.field1064[var5 + var5 + 1] = var4++;
        }
    }
}
