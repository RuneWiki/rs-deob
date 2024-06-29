import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!om")
public class class76 extends class128 {

    @OriginalMember(owner = "client!om", name = "J", descriptor = "[Ljava/lang/String;")
    public static String[] field965 = new String[200];

    @OriginalMember(owner = "client!om", name = "O", descriptor = "Z")
    public static volatile boolean field970 = true;

    @OriginalMember(owner = "client!om", name = "N", descriptor = "[Z")
    public static boolean[] field969 = new boolean[100];

    @OriginalMember(owner = "client!om", name = "M", descriptor = "[I")
    public static int[] field968 = new int[500];

    @OriginalMember(owner = "client!om", name = "H", descriptor = "I")
    public static int field963;

    @OriginalMember(owner = "client!om", name = "I", descriptor = "I")
    public static int field964;

    @OriginalMember(owner = "client!om", name = "K", descriptor = "I")
    public static int field966;

    @OriginalMember(owner = "client!om", name = "L", descriptor = "I")
    public static int field967;

    @OriginalMember(owner = "client!om", name = "Q", descriptor = "I")
    public static int field972;

    @OriginalMember(owner = "client!om", name = "P", descriptor = "Lkb;")
    public static class39 field971;

    @OriginalMember(owner = "client!om", name = "c", descriptor = "(Z)V", line = 6)
    public static void method454(boolean arg0) {
        field969 = null;
        field971 = null;
        field968 = null;
        field965 = null;
        if (!arg0) {
            field968 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!om", name = "b", descriptor = "(BI)[I", line = 25)
    public final int[] method126(byte arg0, int arg1) {
        field963++;
        if (arg0 < 100) {
            this.method126((byte) -53, -103);
        }
        return class334.field5157;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(ZIII)I", line = 42)
    public static final int method455(boolean arg0, int arg1, int arg2, int arg3) {
        field972++;
        int var4 = arg2 / arg1;
        int var5 = arg1 - 1 & arg2;
        int var6 = arg1 - 1 & arg3;
        int var7 = arg3 / arg1;
        int var8 = class223.method1529(var4, var7, (byte) 72);
        int var9 = class223.method1529(var4 + 1, var7, (byte) 127);
        int var10 = class223.method1529(var4, var7 + 1, (byte) 61);
        int var11 = class223.method1529(var4 + 1, var7 + 1, (byte) 114);
        int var12 = class93.method550(var5, var8, var9, -201, arg1);
        int var13 = class93.method550(var5, var10, var11, -201, arg1);
        if (!arg0) {
            method455(true, -19, 110, -99);
        }
        return class93.method550(var6, var12, var13, -201, arg1);
    }

    @OriginalMember(owner = "client!om", name = "<init>", descriptor = "()V", line = 79)
    public class76() {
        super(0, true);
    }

    @OriginalMember(owner = "client!om", name = "b", descriptor = "(B)V", line = 83)
    public static final void method456(byte arg0) {
        field966++;
        class311.field4809.method1241(116);
        if (arg0 < 58) {
            method455(false, -89, 11, 33);
        }
    }

    @OriginalMember(owner = "client!om", name = "g", descriptor = "(I)V", line = 98)
    public static final void method457(int arg0) {
        class291.field4571 = 0;
        class140.field1951 = false;
        class310.field4794 = 0;
        class110.field1538 = 0;
        class308.field4757 = -1;
        class5.field80 = -1;
        class43.field507 = -1;
        class68.field894 = 0;
        field964++;
        class132.field1817 = 0;
        class260.field3938 = arg0;
        class140.field1954.field1400 = 0;
        class90.field1122 = 0;
        class307.field4742.field1400 = 0;
        for (int var1 = 0; var1 < class328.field5009.length; var1++) {
            if (class328.field5009[var1] != null) {
                class328.field5009[var1].field2444 = -1;
            }
        }
        for (int var2 = 0; var2 < class223.field3159.length; var2++) {
            if (class223.field3159[var2] != null) {
                class223.field3159[var2].field2444 = -1;
            }
        }
        class10.method53((byte) -98);
        class118.field1671 = 1;
        class97.method587(-15525, 30);
        for (int var3 = 0; var3 < 100; var3++) {
            class285.field4483[var3] = true;
        }
        class14.method97(false);
    }
}
