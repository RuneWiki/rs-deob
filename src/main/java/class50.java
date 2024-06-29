import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class50 {

    @OriginalMember(owner = "client!ha", name = "j", descriptor = "I")
    public int field1176;

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "I")
    public int field1172;

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "I")
    public int field1169;

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "I")
    public int field1171;

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "[S")
    public static short[] field1170 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "Lod;")
    public static class101 field1167 = class46.method335(109, "null");

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "I")
    public static int field1168;

    @OriginalMember(owner = "client!ha", name = "g", descriptor = "I")
    public static int field1173;

    @OriginalMember(owner = "client!ha", name = "h", descriptor = "I")
    public static int field1174;

    @OriginalMember(owner = "client!ha", name = "i", descriptor = "I")
    public static int field1175;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IJ)V")
    public static final void method369(int arg0, long arg1) {
        field1175++;
        if (arg1 == 0L) {
            return;
        }
        int var3 = 0;
        if (arg0 < 16) {
            return;
        }
        while (class73.field1579 > var3) {
            if (class29.field768[var3] == arg1) {
                class73.field1579--;
                class40.field977++;
                for (int var4 = var3; var4 < class73.field1579; var4++) {
                    class29.field768[var4] = class29.field768[var4 + 1];
                }
                class10.field148 = class108.field2306;
                class17.field364.method419(1, (byte) 0);
                class17.field364.method1087(arg1, -125);
                return;
            }
            var3++;
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(I)V")
    public static void method370(int arg0) {
        field1167 = null;
        field1170 = null;
        int var1 = 123 % ((arg0 - 45) / 43);
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ltf;I)V")
    public static final void method371(class138 arg0, int arg1) {
        field1173++;
        if (arg1 != 14702) {
            field1168 = 44;
        }
        byte[] var2 = new byte[24];
        if (class95.field2051 != null) {
            try {
                class95.field2051.method213(0L, -1829);
                class95.field2051.method216(var2, (byte) -71);
                int var3;
                for (var3 = 0; var3 < 24 && var2[var3] == 0; var3++) {
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var5) {
                for (int var4 = 0; var4 < 24; var4++) {
                    var2[var4] = -1;
                }
            }
        }
        arg0.method1106(0, var2, 24, true);
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "([BZ)V")
    public static final void method372(byte[] arg0, boolean arg1) {
        field1174++;
        class138 var2 = new class138(arg0);
        var2.field3175 = arg0.length - 2;
        class82.field1781 = var2.method1098(arg1);
        class32.field822 = new int[class82.field1781];
        class150.field3434 = new int[class82.field1781];
        class138.field3173 = new int[class82.field1781];
        class2.field31 = new int[class82.field1781];
        class67.field1503 = new byte[class82.field1781][];
        var2.field3175 = arg0.length - class82.field1781 * 8 - 7;
        class34.field862 = var2.method1098(true);
        class6.field94 = var2.method1098(true);
        int var3 = (var2.method1055(118) & 0xFF) + 1;
        for (int var4 = 0; var4 < class82.field1781; var4++) {
            class2.field31[var4] = var2.method1098(arg1);
        }
        for (int var5 = 0; var5 < class82.field1781; var5++) {
            class32.field822[var5] = var2.method1098(true);
        }
        for (int var6 = 0; var6 < class82.field1781; var6++) {
            class150.field3434[var6] = var2.method1098(true);
        }
        for (int var7 = 0; var7 < class82.field1781; var7++) {
            class138.field3173[var7] = var2.method1098(true);
        }
        var2.field3175 = arg0.length - class82.field1781 * 8 - (var3 + -1) * 3 - 7;
        class93.field1998 = new int[var3];
        for (int var8 = 1; var8 < var3; var8++) {
            class93.field1998[var8] = var2.method1088(255);
            if (class93.field1998[var8] == 0) {
                class93.field1998[var8] = 1;
            }
        }
        var2.field3175 = 0;
        for (int var9 = 0; var9 < class82.field1781; var9++) {
            int var10 = class150.field3434[var9];
            int var11 = class138.field3173[var9];
            int var12 = var10 * var11;
            byte[] var13 = new byte[var12];
            class67.field1503[var9] = var13;
            int var14 = var2.method1055(109);
            if (var14 == 0) {
                for (int var17 = 0; var17 < var12; var17++) {
                    var13[var17] = var2.method1079((byte) 0);
                }
            } else if (var14 == 1) {
                for (int var15 = 0; var15 < var10; var15++) {
                    for (int var16 = 0; var16 < var11; var16++) {
                        var13[var15 + var10 * var16] = var2.method1079((byte) 0);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ha", name = "<init>", descriptor = "()V")
    public class50() {
    }

    @OriginalMember(owner = "client!ha", name = "<init>", descriptor = "(Lha;)V")
    public class50(class50 arg0) {
        this.field1176 = arg0.field1176;
        this.field1172 = arg0.field1172;
        this.field1169 = arg0.field1169;
        this.field1171 = arg0.field1171;
    }
}
