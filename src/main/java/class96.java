import java.awt.Container;
import java.awt.Insets;
import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qu")
public class class96 extends class513 {

    @OriginalMember(owner = "client!qu", name = "e", descriptor = "F")
    public float field1130;

    @OriginalMember(owner = "client!qu", name = "g", descriptor = "F")
    public float field1132;

    @OriginalMember(owner = "client!qu", name = "p", descriptor = "F")
    public float field1141;

    @OriginalMember(owner = "client!qu", name = "t", descriptor = "F")
    public float field1145;

    @OriginalMember(owner = "client!qu", name = "w", descriptor = "F")
    public float field1148;

    @OriginalMember(owner = "client!qu", name = "z", descriptor = "F")
    public float field1151;

    @OriginalMember(owner = "client!qu", name = "A", descriptor = "F")
    public float field1152;

    @OriginalMember(owner = "client!qu", name = "F", descriptor = "F")
    public float field1156;

    @OriginalMember(owner = "client!qu", name = "I", descriptor = "F")
    public float field1159;

    @OriginalMember(owner = "client!qu", name = "K", descriptor = "F")
    public float field1161;

    @OriginalMember(owner = "client!qu", name = "L", descriptor = "F")
    public float field1162;

    @OriginalMember(owner = "client!qu", name = "M", descriptor = "F")
    public float field1163;

    @OriginalMember(owner = "client!qu", name = "f", descriptor = "I")
    public static int field1131;

    @OriginalMember(owner = "client!qu", name = "h", descriptor = "I")
    public static int field1133;

    @OriginalMember(owner = "client!qu", name = "i", descriptor = "I")
    public static int field1134;

    @OriginalMember(owner = "client!qu", name = "j", descriptor = "I")
    public static int field1135;

    @OriginalMember(owner = "client!qu", name = "k", descriptor = "I")
    public static int field1136;

    @OriginalMember(owner = "client!qu", name = "l", descriptor = "I")
    public static int field1137;

    @OriginalMember(owner = "client!qu", name = "m", descriptor = "I")
    public static int field1138;

    @OriginalMember(owner = "client!qu", name = "n", descriptor = "I")
    public static int field1139;

    @OriginalMember(owner = "client!qu", name = "o", descriptor = "I")
    public static int field1140;

    @OriginalMember(owner = "client!qu", name = "q", descriptor = "I")
    public static int field1142;

    @OriginalMember(owner = "client!qu", name = "r", descriptor = "I")
    public static int field1143;

    @OriginalMember(owner = "client!qu", name = "s", descriptor = "I")
    public static int field1144;

    @OriginalMember(owner = "client!qu", name = "u", descriptor = "I")
    public static int field1146;

    @OriginalMember(owner = "client!qu", name = "v", descriptor = "I")
    public static int field1147;

    @OriginalMember(owner = "client!qu", name = "x", descriptor = "I")
    public static int field1149;

    @OriginalMember(owner = "client!qu", name = "y", descriptor = "I")
    public static int field1150;

    @OriginalMember(owner = "client!qu", name = "B", descriptor = "I")
    public static int field1153;

    @OriginalMember(owner = "client!qu", name = "C", descriptor = "I")
    public static int field1154;

    @OriginalMember(owner = "client!qu", name = "E", descriptor = "I")
    public static int field1155;

    @OriginalMember(owner = "client!qu", name = "G", descriptor = "I")
    public static int field1157;

    @OriginalMember(owner = "client!qu", name = "H", descriptor = "I")
    public static int field1158;

    @OriginalMember(owner = "client!qu", name = "J", descriptor = "I")
    public static int field1160;

    @OriginalMember(owner = "client!qu", name = "b", descriptor = "(B)V")
    public static final void method705(byte arg0) {
        field1135++;
        client var1 = class499.field7161;
        synchronized (class499.field7161) {
            if (class272.field3891 == null) {
                Container var2;
                if (class387.field5484 != null) {
                    var2 = class387.field5484;
                } else if (class213.field2800 == null) {
                    var2 = class125.field1524;
                } else {
                    var2 = class213.field2800;
                }
                class494.field7122 = var2.getSize().width;
                class261.field3756 = var2.getSize().height;
                if (class387.field5484 == var2) {
                    Insets var3 = class387.field5484.getInsets();
                    class261.field3756 -= var3.top + var3.bottom;
                    class494.field7122 -= var3.right + var3.left;
                }
                if (class605.method3408((byte) 54) == 1) {
                    class172.field2348 = class191.field2553;
                    class446.field6323 = class192.field2561;
                    class633.field8741 = (class494.field7122 - class192.field2561) / 2;
                    class657.field9009 = 0;
                } else {
                    class438.method2645((byte) -27);
                }
                if (class408.field5781 != class277.field3922) {
                    boolean var10000;
                    if (class446.field6323 < 1024 && class172.field2348 < 768) {
                        var10000 = true;
                    } else {
                        var10000 = false;
                    }
                }
                class366.field5196.setSize(class446.field6323, class172.field2348);
                if (class268.field3831 != null) {
                    if (class589.field8295) {
                        class272.method1772(-128, class366.field5196);
                    } else {
                        class268.field3831.method385(class366.field5196, class446.field6323, class172.field2348);
                    }
                }
                if (class387.field5484 == var2) {
                    Insets var4 = class387.field5484.getInsets();
                    class366.field5196.setLocation(var4.left + class633.field8741, class657.field9009 + var4.top);
                } else {
                    class366.field5196.setLocation(class633.field8741, class657.field9009);
                }
                if (class457.field6447 != -1) {
                    class364.method2320(true, -14543);
                }
                if (arg0 >= -122) {
                    field1138 = 48;
                }
                class619.method3481((byte) 42);
            }
        }
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(IIIIII)V")
    public final void method340(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1146++;
        float var7 = class466.field6599[arg3 & 0x3FFF];
        float var8 = class466.field6596[arg3 & 0x3FFF];
        float var9 = class466.field6599[arg4 & 0x3FFF];
        float var10 = class466.field6596[arg4 & 0x3FFF];
        float var11 = class466.field6599[arg5 & 0x3FFF];
        float var12 = class466.field6596[arg5 & 0x3FFF];
        float var13 = var8 * var11;
        float var14 = var8 * var12;
        this.field1152 = var7 * var11;
        this.field1151 = -var8;
        this.field1130 = var9 * var11 + var10 * var14;
        this.field1162 = var7 * var10;
        this.field1161 = var7 * var12;
        this.field1159 = -var10 * var11 + var9 * var14;
        this.field1145 = -var9 * var12 + var10 * var13;
        this.field1148 = var9 * var13 + var10 * var12;
        this.field1132 = var7 * var9;
        this.field1141 = (float) (-arg0) * this.field1162 - (float) arg1 * this.field1151 - ((float) arg2 * this.field1132);
        this.field1156 = (float) (-arg0) * this.field1145 - ((float) arg1 * this.field1152) - (float) arg2 * this.field1148;
        this.field1163 = (float) (-arg0) * this.field1130 - (float) arg1 * this.field1161 - (float) arg2 * this.field1159;
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(III)V")
    public final void method360(int arg0, int arg1, int arg2) {
        this.field1163 += arg0;
        this.field1141 += arg2;
        field1143++;
        this.field1156 += arg1;
    }

    @OriginalMember(owner = "client!qu", name = "c", descriptor = "(B)V")
    public static final void method706(byte arg0) {
        if (class491.field6930 != null) {
            for (int var1 = 0; var1 < class556.field7801; var1++) {
                class491.field6930[var1] = null;
            }
            class491.field6930 = null;
        }
        field1149++;
        if (class642.field8800 != null) {
            for (int var2 = 0; var2 < class593.field8350; var2++) {
                class642.field8800[var2] = null;
            }
            class642.field8800 = null;
        }
        if (class21.field319 != null) {
            for (int var3 = 0; var3 < class626.field8702; var3++) {
                class21.field319[var3] = null;
            }
            class21.field319 = null;
        }
        class686.field9381 = null;
        class246.field3285 = null;
        class615.field8612 = null;
        int var4 = -98 / ((arg0 + 57) / 61);
        class240.field3200 = -1;
        class454.field6415 = -1;
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(ILag;I)Z")
    public static final boolean method707(int arg0, class682 arg1, int arg2) {
        field1134++;
        int var3 = arg1.method3821(2, (byte) 108);
        if (var3 == 0) {
            if (arg1.method3821(1, (byte) 108) != 0) {
                method707(arg0, arg1, 0);
            }
            int var4 = arg1.method3821(6, (byte) 108);
            int var5 = arg1.method3821(6, (byte) 108);
            boolean var6 = arg1.method3821(1, (byte) 108) == 1;
            if (var6) {
                class136.field1976[class319.field4418++] = arg0;
            }
            if (class309.field4311[arg0] != null) {
                throw new RuntimeException("hr:lr");
            }
            class408 var7 = class711.field9886[arg0];
            class280 var8 = class309.field4311[arg0] = new class280();
            var8.field7958 = arg0;
            if (class522.field7398[arg0] != null) {
                var8.method1833(class522.field7398[arg0], 103);
            }
            var8.method3248(true, 115, var7.field5779);
            var8.field8001 = var7.field5778;
            int var9 = var7.field5776;
            int var10 = var9 >> 28;
            int var11 = var9 >> 14 & 0xFF;
            int var12 = var9 & 0xFF;
            int var13 = (var11 << 6) + var4 - class228.field3063;
            int var14 = (var12 << 6) + var5 - class3.field30;
            var8.field3985 = var7.field5782;
            var8.field8011[0] = class471.field6687[arg0];
            var8.field1266 = var8.field1258 = (byte) var10;
            if (class364.method2319((byte) -96, var13, var14)) {
                var8.field1258++;
            }
            var8.method1832(var14, (byte) -125, var13);
            var8.field3958 = false;
            class711.field9886[arg0] = null;
            return true;
        } else if (var3 == 1) {
            int var15 = arg1.method3821(2, (byte) 108);
            int var16 = class711.field9886[arg0].field5776;
            class711.field9886[arg0].field5776 = ((var16 >> 28) + var15 & 0x3 << 28) + (var16 & 0xFFFFFFF);
            return false;
        } else if (var3 == 2) {
            int var17 = arg1.method3821(5, (byte) 108);
            int var18 = var17 >> 3;
            int var19 = var17 & 0x7;
            int var20 = class711.field9886[arg0].field5776;
            int var21 = (var20 >> 28) + var18 & 0x3;
            int var22 = var20 >> 14 & 0xFF;
            int var23 = var20 & 0xFF;
            if (var19 == 0) {
                var23--;
                var22--;
            }
            if (var19 == 1) {
                var23--;
            }
            if (var19 == 2) {
                var23--;
                var22++;
            }
            if (var19 == 3) {
                var22--;
            }
            if (var19 == 4) {
                var22++;
            }
            if (var19 == 5) {
                var22--;
                var23++;
            }
            if (var19 == 6) {
                var23++;
            }
            if (var19 == 7) {
                var22++;
                var23++;
            }
            class711.field9886[arg0].field5776 = (var21 << 28) + (var22 << 14) + var23;
            return false;
        } else {
            int var24 = arg1.method3821(18, (byte) 108);
            int var25 = var24 >> 16;
            int var26 = var24 >> 8 & 0xFF;
            int var27 = var24 & 0xFF;
            int var28 = class711.field9886[arg0].field5776;
            int var29 = (var28 >> 28) + var25 & 0x3;
            int var30 = (var28 >> 14) + var26 & 0xFF;
            int var31 = var27 + var28 & 0xFF;
            if (arg2 == 0) {
                class711.field9886[arg0].field5776 = (var29 << 28) + (var30 << 14) + var31;
                return false;
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!qu", name = "b", descriptor = "(III)V")
    public final void method339(int arg0, int arg1, int arg2) {
        this.field1145 = this.field1162 = this.field1161 = this.field1151 = this.field1159 = this.field1148 = 0.0F;
        this.field1156 = arg1;
        this.field1163 = arg0;
        field1144++;
        this.field1130 = this.field1152 = this.field1132 = 1.0F;
        this.field1141 = arg2;
    }

    @OriginalMember(owner = "client!qu", name = "g", descriptor = "(I)V")
    public final void method350(int arg0) {
        field1155++;
        float var2 = class466.field6599[arg0 & 0x3FFF];
        float var3 = class466.field6596[arg0 & 0x3FFF];
        float var4 = this.field1145;
        float var5 = this.field1152;
        float var6 = this.field1148;
        float var7 = this.field1156;
        this.field1145 = var2 * var4 - (this.field1162 * var3);
        this.field1152 = var2 * var5 - this.field1151 * var3;
        this.field1162 = this.field1162 * var2 + var3 * var4;
        this.field1151 = this.field1151 * var2 + var3 * var5;
        this.field1148 = var2 * var6 - this.field1132 * var3;
        this.field1132 = this.field1132 * var2 + var3 * var6;
        this.field1156 = var2 * var7 - (this.field1141 * var3);
        this.field1141 = this.field1141 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(I)V")
    public final void method362(int arg0) {
        field1157++;
        this.field1130 = 1.0F;
        this.field1152 = this.field1132 = class466.field6599[arg0 & 0x3FFF];
        this.field1151 = class466.field6596[arg0 & 0x3FFF];
        this.field1148 = -this.field1151;
        this.field1161 = this.field1159 = this.field1163 = this.field1145 = this.field1156 = this.field1162 = this.field1141 = 0.0F;
    }

    @OriginalMember(owner = "client!qu", name = "d", descriptor = "(I)V")
    public final void method347(int arg0) {
        field1154++;
        float var2 = class466.field6599[arg0 & 0x3FFF];
        float var3 = class466.field6596[arg0 & 0x3FFF];
        float var4 = this.field1130;
        float var5 = this.field1161;
        float var6 = this.field1159;
        this.field1130 = this.field1162 * var3 + var2 * var4;
        float var7 = this.field1163;
        this.field1161 = this.field1151 * var3 + var2 * var5;
        this.field1162 = this.field1162 * var2 - var3 * var4;
        this.field1151 = this.field1151 * var2 - var3 * var5;
        this.field1159 = this.field1132 * var3 + var2 * var6;
        this.field1132 = this.field1132 * var2 - var3 * var6;
        this.field1163 = this.field1141 * var3 + var2 * var7;
        this.field1141 = this.field1141 * var2 - (var3 * var7);
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(Ljava/io/File;Ljava/lang/String;B)V")
    public static final void method708(File arg0, String arg1, byte arg2) {
        if (arg2 >= -43) {
            method706((byte) 117);
        }
        class197.field2615.put(arg1, arg0);
        field1131++;
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(Lnga;)V")
    public final void method344(class513 arg0) {
        field1158++;
        class96 var2 = (class96) arg0;
        this.field1145 = var2.field1145;
        this.field1162 = var2.field1162;
        this.field1163 = var2.field1163;
        this.field1152 = var2.field1152;
        this.field1130 = var2.field1130;
        this.field1161 = var2.field1161;
        this.field1156 = var2.field1156;
        this.field1141 = var2.field1141;
        this.field1159 = var2.field1159;
        this.field1148 = var2.field1148;
        this.field1151 = var2.field1151;
        this.field1132 = var2.field1132;
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(III[I)V")
    public final void method353(int arg0, int arg1, int arg2, int[] arg3) {
        field1142++;
        int var5 = (int) ((float) arg1 - this.field1156);
        int var6 = (int) ((float) arg0 - this.field1163);
        int var7 = (int) ((float) arg2 - this.field1141);
        arg3[2] = (int) ((float) var7 * this.field1132 + (float) var5 * this.field1148 + (float) var6 * this.field1159);
        arg3[1] = (int) ((float) var7 * this.field1151 + (float) var5 * this.field1152 + (float) var6 * this.field1161);
        arg3[0] = (int) ((float) var7 * this.field1162 + (float) var5 * this.field1145 + (float) var6 * this.field1130);
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "([I)V")
    public final void method348(int[] arg0) {
        field1140++;
        float var2 = (float) arg0[0] - this.field1163;
        float var3 = (float) arg0[1] - this.field1156;
        float var4 = (float) arg0[2] - this.field1141;
        arg0[1] = (int) (this.field1151 * var4 + this.field1161 * var2 + this.field1152 * var3);
        arg0[0] = (int) (this.field1162 * var4 + this.field1145 * var3 + this.field1130 * var2);
        arg0[2] = (int) (this.field1132 * var4 + this.field1159 * var2 + this.field1148 * var3);
    }

    @OriginalMember(owner = "client!qu", name = "b", descriptor = "(I)V")
    public final void method342(int arg0) {
        this.field1132 = 1.0F;
        field1133++;
        this.field1130 = this.field1152 = class466.field6599[arg0 & 0x3FFF];
        this.field1145 = class466.field6596[arg0 & 0x3FFF];
        this.field1159 = this.field1163 = this.field1148 = this.field1156 = this.field1162 = this.field1151 = this.field1141 = 0.0F;
        this.field1161 = -this.field1145;
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(II)V")
    public static final void method709(int arg0, int arg1) {
        if (arg1 != -3311) {
            field1138 = 81;
        }
        field1150++;
        class206.field2719 = -1;
        if (arg0 == 37) {
            class678.field9282 = 3.0F;
        } else if (arg0 == 50) {
            class678.field9282 = 4.0F;
        } else if (arg0 == 75) {
            class678.field9282 = 6.0F;
        } else if (arg0 == 100) {
            class678.field9282 = 8.0F;
        } else if (arg0 == 200) {
            class678.field9282 = 16.0F;
        }
        class206.field2719 = -1;
    }

    @OriginalMember(owner = "client!qu", name = "c", descriptor = "(III[I)V")
    public final void method357(int arg0, int arg1, int arg2, int[] arg3) {
        field1137++;
        arg3[0] = (int) ((float) arg2 * this.field1159 + (float) arg0 * this.field1130 + (float) arg1 * this.field1161 + this.field1163);
        arg3[1] = (int) ((float) arg2 * this.field1148 + (float) arg0 * this.field1145 + (float) arg1 * this.field1152 + this.field1156);
        arg3[2] = (int) ((float) arg2 * this.field1132 + (float) arg0 * this.field1162 + (float) arg1 * this.field1151 + this.field1141);
    }

    @OriginalMember(owner = "client!qu", name = "f", descriptor = "(I)V")
    public final void method363(int arg0) {
        field1153++;
        this.field1152 = 1.0F;
        this.field1130 = this.field1132 = class466.field6599[arg0 & 0x3FFF];
        this.field1159 = class466.field6596[arg0 & 0x3FFF];
        this.field1162 = -this.field1159;
        this.field1161 = this.field1163 = this.field1145 = this.field1148 = this.field1156 = this.field1151 = this.field1141 = 0.0F;
    }

    @OriginalMember(owner = "client!qu", name = "b", descriptor = "(III[I)V")
    public final void method338(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[1] = (int) ((float) arg2 * this.field1148 + (float) arg0 * this.field1145 + (float) arg1 * this.field1152);
        field1139++;
        arg3[0] = (int) ((float) arg2 * this.field1159 + (float) arg0 * this.field1130 + (float) arg1 * this.field1161);
        arg3[2] = (int) ((float) arg2 * this.field1132 + (float) arg0 * this.field1162 + (float) arg1 * this.field1151);
    }

    @OriginalMember(owner = "client!qu", name = "e", descriptor = "(I)V")
    public final void method356(int arg0) {
        field1160++;
        float var2 = class466.field6599[arg0 & 0x3FFF];
        float var3 = class466.field6596[arg0 & 0x3FFF];
        float var4 = this.field1130;
        float var5 = this.field1161;
        float var6 = this.field1159;
        this.field1130 = var2 * var4 - this.field1145 * var3;
        float var7 = this.field1163;
        this.field1161 = var2 * var5 - this.field1152 * var3;
        this.field1145 = this.field1145 * var2 + var3 * var4;
        this.field1159 = var2 * var6 - this.field1148 * var3;
        this.field1152 = this.field1152 * var2 + var3 * var5;
        this.field1163 = var2 * var7 - (this.field1156 * var3);
        this.field1148 = this.field1148 * var2 + var3 * var6;
        this.field1156 = this.field1156 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!qu", name = "b", descriptor = "()Lnga;")
    public final class513 method349() {
        field1147++;
        class96 var1 = new class96();
        var1.field1132 = this.field1132;
        var1.field1151 = this.field1151;
        var1.field1162 = this.field1162;
        var1.field1163 = this.field1163;
        var1.field1152 = this.field1152;
        var1.field1156 = this.field1156;
        var1.field1159 = this.field1159;
        var1.field1145 = this.field1145;
        var1.field1141 = this.field1141;
        var1.field1161 = this.field1161;
        var1.field1130 = this.field1130;
        var1.field1148 = this.field1148;
        return var1;
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "()V")
    public final void method351() {
        this.field1130 = this.field1152 = this.field1132 = 1.0F;
        field1136++;
        this.field1145 = this.field1162 = this.field1161 = this.field1151 = this.field1159 = this.field1148 = this.field1163 = this.field1156 = this.field1141 = 0.0F;
    }

    @OriginalMember(owner = "client!qu", name = "<init>", descriptor = "()V")
    public class96() {
        this.method351();
    }
}
