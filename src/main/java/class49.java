import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public abstract class class49 extends class75 {

    @OriginalMember(owner = "client!h", name = "J", descriptor = "I")
    public int field1157 = 1000;

    @OriginalMember(owner = "client!h", name = "Q", descriptor = "Lod;")
    public static class101 field1164 = class46.method335(-91, "p11_full");

    @OriginalMember(owner = "client!h", name = "L", descriptor = "Lod;")
    public static class101 field1159 = class46.method335(63, "huffman");

    @OriginalMember(owner = "client!h", name = "K", descriptor = "I")
    public static int field1158 = 0;

    @OriginalMember(owner = "client!h", name = "S", descriptor = "Lod;")
    private static class101 field1166 = class46.method335(-88, "level)2");

    @OriginalMember(owner = "client!h", name = "N", descriptor = "Lod;")
    public static class101 field1161 = field1166;

    @OriginalMember(owner = "client!h", name = "F", descriptor = "I")
    public static int field1153;

    @OriginalMember(owner = "client!h", name = "H", descriptor = "I")
    public static int field1155;

    @OriginalMember(owner = "client!h", name = "I", descriptor = "I")
    public static int field1156;

    @OriginalMember(owner = "client!h", name = "M", descriptor = "I")
    public static int field1160;

    @OriginalMember(owner = "client!h", name = "O", descriptor = "I")
    public static int field1162;

    @OriginalMember(owner = "client!h", name = "P", descriptor = "I")
    public static int field1163;

    @OriginalMember(owner = "client!h", name = "R", descriptor = "Ldd;")
    public static class26 field1165;

    @OriginalMember(owner = "client!h", name = "G", descriptor = "Z")
    private static boolean field1154;

    @OriginalMember(owner = "client!h", name = "f", descriptor = "(I)V")
    public static void method364(int arg0) {
        field1159 = null;
        field1166 = null;
        int var1 = 112 % ((arg0 - 61) / 41);
        field1161 = null;
        field1164 = null;
        field1165 = null;
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(B)Lqb;")
    public class113 method88(byte arg0) {
        field1153++;
        if (arg0 != -93) {
            field1165 = null;
        }
        return null;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIIIIII)V")
    public void method365(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class113 var10 = this.method88((byte) -93);
        field1162++;
        if (var10 != null) {
            this.field1157 = var10.field1157;
            var10.method365(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        }
    }

    @OriginalMember(owner = "client!h", name = "g", descriptor = "(I)Z")
    public static final boolean method366(int arg0) {
        long var1 = class10.method47(18889);
        field1163++;
        int var3 = (int) (var1 - class67.field1521);
        if (var3 > 200) {
            var3 = 200;
        }
        class94.field2030 += var3;
        class67.field1521 = var1;
        if (class121.field2655 == 0 && class87.field1911 == 0 && class35.field901 == 0 && class112.field2417 == 0) {
            return true;
        } else if (class13.field283 == null) {
            return false;
        } else {
            try {
                if (class94.field2030 > 30000) {
                    throw new IOException();
                }
                while (class87.field1911 < 20 && class112.field2417 > 0) {
                    class87 var4 = (class87) class46.field1089.method1142((byte) -112);
                    class138 var5 = new class138(4);
                    var5.method1101(1, (byte) -32);
                    var5.method1081((int) var4.field2723, 215180960);
                    class13.field283.method442(4, -104, 0, var5.field3213);
                    class157.field3602.method1137((byte) -89, var4.field2723, var4);
                    class112.field2417--;
                    class87.field1911++;
                }
                while (class121.field2655 < 20 && class35.field901 > 0) {
                    class87 var6 = (class87) class67.field1504.method685(47);
                    class138 var7 = new class138(4);
                    var7.method1101(0, (byte) -32);
                    var7.method1081((int) var6.field2723, 215180960);
                    class13.field283.method442(4, -116, 0, var7.field3213);
                    var6.method517(80);
                    class29.field766.method1137((byte) -89, var6.field2723, var6);
                    class121.field2655++;
                    class35.field901--;
                }
                for (int var8 = 0; var8 < 100; var8++) {
                    int var9 = class13.field283.method443((byte) -127);
                    if (var9 < 0) {
                        throw new IOException();
                    }
                    if (var9 == 0) {
                        break;
                    }
                    class94.field2030 = 0;
                    byte var10 = 0;
                    if (class40.field945 == null) {
                        var10 = 8;
                    } else if (class126.field2806 == 0) {
                        var10 = 1;
                    }
                    if (var10 <= 0) {
                        int var11 = class142.field3278.field3213.length - class40.field945.field1920;
                        int var12 = 512 - class126.field2806;
                        if (var11 - class142.field3278.field3175 < var12) {
                            var12 = var11 - class142.field3278.field3175;
                        }
                        if (var12 > var9) {
                            var12 = var9;
                        }
                        class13.field283.method440(var12, (byte) 66, class142.field3278.field3175, class142.field3278.field3213);
                        if (class8.field117 != 0) {
                            for (int var13 = 0; var13 < var12; var13++) {
                                class142.field3278.field3213[class142.field3278.field3175 + var13] = (byte) class39.method295(class142.field3278.field3213[class142.field3278.field3175 + var13], class8.field117);
                            }
                        }
                        class126.field2806 += var12;
                        class142.field3278.field3175 += var12;
                        if (class142.field3278.field3175 == var11) {
                            if (class40.field945.field2723 == 16711935L) {
                                class11.field200 = class142.field3278;
                                for (int var15 = 0; var15 < 256; var15++) {
                                    class132 var16 = class89.field1940[var15];
                                    if (var16 != null) {
                                        class11.field200.field3175 = var15 * 8 + 5;
                                        int var17 = class11.field200.method1062(1809568712);
                                        int var18 = class11.field200.method1062(1809568712);
                                        var16.method1025(var17, (byte) 0, var18);
                                    }
                                }
                            } else {
                                class97.field2099.reset();
                                class97.field2099.update(class142.field3278.field3213, 0, var11);
                                int var14 = (int) class97.field2099.getValue();
                                if (class40.field945.field1918 != var14) {
                                    try {
                                        class13.field283.method444((byte) -54);
                                    } catch (Exception var30) {
                                    }
                                    class8.field117 = (byte) (Math.random() * 255.0D + 1.0D);
                                    class13.field283 = null;
                                    class43.field1030++;
                                    return false;
                                }
                                class6.field82 = 0;
                                class43.field1030 = 0;
                                class40.field945.field1914.method1022(class142.field3278.field3213, 24588, (class40.field945.field2723 & 0xFF0000L) == 16711680L, field1154, (int) (class40.field945.field2723 & 0xFFFFL));
                            }
                            class40.field945.method959(11835);
                            if (field1154) {
                                class87.field1911--;
                            } else {
                                class121.field2655--;
                            }
                            class40.field945 = null;
                            class142.field3278 = null;
                            class126.field2806 = 0;
                        } else {
                            if (class126.field2806 != 512) {
                                break;
                            }
                            class126.field2806 = 0;
                        }
                    } else {
                        int var19 = var10 - class3.field51.field3175;
                        if (var19 > var9) {
                            var19 = var9;
                        }
                        class13.field283.method440(var19, (byte) 62, class3.field51.field3175, class3.field51.field3213);
                        if (class8.field117 != 0) {
                            for (int var20 = 0; var20 < var19; var20++) {
                                class3.field51.field3213[class3.field51.field3175 + var20] = (byte) class39.method295(class3.field51.field3213[class3.field51.field3175 + var20], class8.field117);
                            }
                        }
                        class3.field51.field3175 += var19;
                        if (var10 > class3.field51.field3175) {
                            break;
                        }
                        if (class40.field945 == null) {
                            class3.field51.field3175 = 0;
                            int var21 = class3.field51.method1055(110);
                            int var22 = class3.field51.method1098(true);
                            long var23 = (long) ((var21 << 16) + var22);
                            int var25 = class3.field51.method1055(119);
                            int var26 = class3.field51.method1062(1809568712);
                            class87 var27 = (class87) class157.field3602.method1141(var23, -1);
                            field1154 = true;
                            if (var27 == null) {
                                var27 = (class87) class29.field766.method1141(var23, -1);
                                field1154 = false;
                            }
                            if (var27 == null) {
                                throw new IOException();
                            }
                            class40.field945 = var27;
                            int var28 = var25 == 0 ? 5 : 9;
                            class142.field3278 = new class138(class40.field945.field1920 + var26 + var28);
                            class142.field3278.method1101(var25, (byte) -32);
                            class142.field3278.method1090((byte) 38, var26);
                            class126.field2806 = 8;
                            class3.field51.field3175 = 0;
                        } else if (class126.field2806 == 0) {
                            if (class3.field51.field3213[0] == -1) {
                                class126.field2806 = 1;
                                class3.field51.field3175 = 0;
                            } else {
                                class40.field945 = null;
                            }
                        }
                    }
                }
                if (arg0 > -65) {
                    method367(11);
                }
                return true;
            } catch (IOException var31) {
                try {
                    class13.field283.method444((byte) 115);
                } catch (Exception var29) {
                }
                class13.field283 = null;
                class6.field82++;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!h", name = "h", descriptor = "(I)V")
    public static final void method367(int arg0) {
        if (class138.field3150 != null) {
            class138.field3150.method148((byte) 29);
        }
        if (class105.field2259 != null) {
            class105.field2259.method148((byte) 29);
        }
        if (arg0 == 13057) {
            field1160++;
        }
    }

    @OriginalMember(owner = "client!h", name = "i", descriptor = "(I)V")
    public static final void method368(int arg0) {
        if (arg0 != -1) {
            field1164 = null;
        }
        field1155++;
        class13.field277.method135(0);
        class118.field2610.method135(0);
        class150.field3428.method135(0);
    }
}
