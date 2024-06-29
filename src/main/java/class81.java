import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ut")
public abstract class class81 {

    @OriginalMember(owner = "client!ut", name = "j", descriptor = "Z")
    public boolean field1152 = true;

    @OriginalMember(owner = "client!ut", name = "l", descriptor = "I")
    public int field1154 = 0;

    @OriginalMember(owner = "client!ut", name = "i", descriptor = "Z")
    public boolean field1151 = true;

    @OriginalMember(owner = "client!ut", name = "f", descriptor = "Z")
    public boolean field1148 = true;

    @OriginalMember(owner = "client!ut", name = "t", descriptor = "I")
    public int field1162 = 0;

    @OriginalMember(owner = "client!ut", name = "c", descriptor = "Z")
    public boolean field1145 = true;

    @OriginalMember(owner = "client!ut", name = "h", descriptor = "I")
    public int field1150 = 0;

    @OriginalMember(owner = "client!ut", name = "w", descriptor = "Z")
    public boolean field1165 = true;

    @OriginalMember(owner = "client!ut", name = "d", descriptor = "Z")
    public boolean field1146 = false;

    @OriginalMember(owner = "client!ut", name = "p", descriptor = "I")
    public int field1158 = 0;

    @OriginalMember(owner = "client!ut", name = "A", descriptor = "I")
    public int field1169 = 2;

    @OriginalMember(owner = "client!ut", name = "k", descriptor = "Z")
    public boolean field1153 = true;

    @OriginalMember(owner = "client!ut", name = "C", descriptor = "I")
    public int field1171 = 0;

    @OriginalMember(owner = "client!ut", name = "E", descriptor = "I")
    public int field1173 = 127;

    @OriginalMember(owner = "client!ut", name = "x", descriptor = "I")
    public int field1166 = 3;

    @OriginalMember(owner = "client!ut", name = "m", descriptor = "Z")
    public boolean field1155 = true;

    @OriginalMember(owner = "client!ut", name = "z", descriptor = "Z")
    public boolean field1168 = true;

    @OriginalMember(owner = "client!ut", name = "u", descriptor = "I")
    public int field1163 = 1;

    @OriginalMember(owner = "client!ut", name = "B", descriptor = "I")
    public int field1170 = 2;

    @OriginalMember(owner = "client!ut", name = "s", descriptor = "I")
    public int field1161 = 2;

    @OriginalMember(owner = "client!ut", name = "v", descriptor = "Z")
    public boolean field1164 = true;

    @OriginalMember(owner = "client!ut", name = "J", descriptor = "I")
    public int field1178 = 0;

    @OriginalMember(owner = "client!ut", name = "g", descriptor = "Z")
    public boolean field1149 = false;

    @OriginalMember(owner = "client!ut", name = "G", descriptor = "I")
    public int field1175 = 0;

    @OriginalMember(owner = "client!ut", name = "q", descriptor = "Z")
    public boolean field1159 = true;

    @OriginalMember(owner = "client!ut", name = "I", descriptor = "I")
    public int field1177 = 2;

    @OriginalMember(owner = "client!ut", name = "N", descriptor = "Z")
    public boolean field1182 = true;

    @OriginalMember(owner = "client!ut", name = "O", descriptor = "I")
    public int field1183 = 127;

    @OriginalMember(owner = "client!ut", name = "F", descriptor = "Z")
    public boolean field1174 = true;

    @OriginalMember(owner = "client!ut", name = "M", descriptor = "Z")
    public boolean field1181 = false;

    @OriginalMember(owner = "client!ut", name = "o", descriptor = "I")
    public int field1157 = 127;

    @OriginalMember(owner = "client!ut", name = "y", descriptor = "I")
    public static int field1167 = 0;

    @OriginalMember(owner = "client!ut", name = "K", descriptor = "Lfg;")
    public static class84 field1179 = new class84(9, 0, 4, 1);

    @OriginalMember(owner = "client!ut", name = "P", descriptor = "Lwi;")
    public static class330 field1184 = new class330(50);

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "I")
    public static int field1143;

    @OriginalMember(owner = "client!ut", name = "b", descriptor = "I")
    public static int field1144;

    @OriginalMember(owner = "client!ut", name = "e", descriptor = "I")
    public static int field1147;

    @OriginalMember(owner = "client!ut", name = "r", descriptor = "I")
    public static int field1160;

    @OriginalMember(owner = "client!ut", name = "H", descriptor = "I")
    public static int field1176;

    @OriginalMember(owner = "client!ut", name = "Q", descriptor = "I")
    public static int field1185;

    @OriginalMember(owner = "client!ut", name = "R", descriptor = "I")
    public static int field1186;

    @OriginalMember(owner = "client!ut", name = "n", descriptor = "Z")
    public boolean field1156;

    @OriginalMember(owner = "client!ut", name = "D", descriptor = "Z")
    public boolean field1172;

    @OriginalMember(owner = "client!ut", name = "L", descriptor = "Z")
    public boolean field1180;

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(III)V")
    public final void method547(int arg0, int arg1, int arg2) {
        field1143++;
        if (arg0 == 1 || arg0 == 3) {
            this.field1169 = arg1;
        } else {
            this.field1178 = arg1;
        }
        if (arg2 <= 63) {
            method548((byte) -51);
        }
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(B)V")
    public static void method548(byte arg0) {
        field1184 = null;
        if (arg0 <= -34) {
            field1179 = null;
        }
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(BI)Z")
    public final boolean method549(byte arg0, int arg1) {
        if (arg0 > -107) {
            this.field1181 = false;
        }
        field1144++;
        return arg1 == 1 || arg1 == 3 ? this.field1172 : this.field1156;
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(Lnj;II)Ljava/lang/String;")
    public static final String method550(class164 arg0, int arg1, int arg2) {
        field1160++;
        try {
            int var3 = arg0.method1077((byte) -124);
            if (var3 > arg1) {
                var3 = arg1;
            }
            byte[] var4 = new byte[var3];
            arg0.field2185 += class278.field3943.method543(~arg2, arg0.field2219, 0, var4, var3, arg0.field2185);
            return class257.method1653(true, var4, arg2, var3);
        } catch (Exception var6) {
            return "Cabbage";
        }
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(I)[Lsd;")
    public static final class62[] method551(int arg0) {
        if (arg0 != 31237) {
            method550(null, 8, 127);
        }
        if (class61.field877 == null) {
            class62[] var1 = class380.method2386(class312.field4572, 3);
            class62[] var2 = new class62[var1.length];
            int var3 = 0;
            label66: for (int var4 = 0; var4 < var1.length; var4++) {
                class62 var8 = var1[var4];
                if ((var8.field889 <= 0 || var8.field889 >= 24) && var8.field886 >= 800 && var8.field887 >= 600 && (class230.field3289 >= 96 || class378.field5771 != 0 || var8.field886 <= 1024 && var8.field887 <= 768)) {
                    for (int var9 = 0; var9 < var3; var9++) {
                        class62 var10 = var2[var9];
                        if (var8.field886 == var10.field886 && var8.field887 == var10.field887) {
                            if (var10.field889 < var8.field889) {
                                var2[var9] = var8;
                            }
                            continue label66;
                        }
                    }
                    var2[var3] = var8;
                    var3++;
                }
            }
            class61.field877 = new class62[var3];
            class192.method1297(var2, 0, class61.field877, 0, var3);
            int[] var5 = new int[class61.field877.length];
            for (int var6 = 0; var6 < class61.field877.length; var6++) {
                class62 var7 = class61.field877[var6];
                var5[var6] = var7.field887 * var7.field886;
            }
            class335.method2166(var5, true, class61.field877);
        }
        field1186++;
        return class61.field877;
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(II)I")
    public final int method552(int arg0, int arg1) {
        field1147++;
        if (arg0 != -4) {
            this.field1155 = false;
        }
        return arg1 == 1 || arg1 == 3 ? this.field1169 : this.field1178;
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(IIZ)V")
    public final void method553(int arg0, int arg1, boolean arg2) {
        if (arg0 != 16395) {
            this.method552(-78, 89);
        }
        field1176++;
        if (arg1 == 1 || arg1 == 3) {
            this.field1172 = arg2;
        } else {
            this.field1156 = arg2;
        }
    }
}
