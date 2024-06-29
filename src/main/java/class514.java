import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public abstract class class514 {

    @OriginalMember(owner = "client!aa", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field7603 = new String[] { method3861(method3860(")Rl1`")), method3861(method3860("3\u001dlX5")), method3861(method3860("&F.\u001a")), method3861(method3860(")Rl?`")), method3861(method3860(")Rl>`")), method3861(method3860(";\t.\u0004")) };

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "I")
    public static int field7601 = -1;

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "Lvn;")
    public static class330 field7600 = new class330(48, -1);

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "I")
    public static int field7599;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "I")
    public static int field7602;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IBLrv;)V", line = 3)
    public static final void method3857(int arg0, byte arg1, class117 arg2) {
        try {
            field7602++;
            if (arg1 != -46) {
                field7600 = null;
            }
            boolean var3 = arg2.method1163(1, -122) == 1;
            if (var3) {
                class594.field8590[class133.field1893++] = arg0;
            }
            int var4 = arg2.method1163(2, 77);
            class738 var5 = class33.field395[arg0];
            if (var4 == 0) {
                if (var3) {
                    var5.field10833 = false;
                } else if (class356.field5733 == arg0) {
                    throw new RuntimeException(field7603[5]);
                } else {
                    class94 var6 = class203.field3191[arg0] = new class94();
                    var6.field1375 = (var5.field1201[0] + class397.field6289 >> 6 << 14) + ((var5.field9975 << 28) + (var5.field1200[0] + class141.field2011 >> 6));
                    if (var5.field10837 == -1) {
                        var6.field1374 = var5.field1118.method4069(true);
                    } else {
                        var6.field1374 = var5.field10837;
                    }
                    var6.field1368 = var5.field10849;
                    var6.field1373 = var5.field10853;
                    var6.field1372 = var5.field1155;
                    if (var5.field10819 > 0) {
                        class713.method5171(var5, -1);
                    }
                    class33.field395[arg0] = null;
                    if (arg2.method1163(1, 51) != 0) {
                        class760.method5492(arg0, arg2, -110);
                    }
                }
            } else if (var4 == 1) {
                int var7 = arg2.method1163(3, 110);
                int var8 = var5.field1201[0];
                int var9 = var5.field1200[0];
                if (var7 == 0) {
                    var9--;
                    var8--;
                } else if (var7 == 1) {
                    var9--;
                } else if (var7 == 2) {
                    var9--;
                    var8++;
                } else if (var7 == 3) {
                    var8--;
                } else if (var7 == 4) {
                    var8++;
                } else if (var7 == 5) {
                    var9++;
                    var8--;
                } else if (var7 == 6) {
                    var9++;
                } else if (var7 == 7) {
                    var9++;
                    var8++;
                }
                if (var3) {
                    var5.field10825 = var9;
                    var5.field10810 = var8;
                    var5.field10833 = true;
                } else {
                    var5.method5363(class284.field4605[arg0], var8, var9, (byte) -58);
                }
            } else if (var4 == 2) {
                int var10 = arg2.method1163(4, arg1 + 67);
                int var11 = var5.field1201[0];
                int var12 = var5.field1200[0];
                if (var10 == 0) {
                    var11 -= 2;
                    var12 -= 2;
                } else if (var10 == 1) {
                    var11--;
                    var12 -= 2;
                } else if (var10 == 2) {
                    var12 -= 2;
                } else if (var10 == 3) {
                    var11++;
                    var12 -= 2;
                } else if (var10 == 4) {
                    var12 -= 2;
                    var11 += 2;
                } else if (var10 == 5) {
                    var11 -= 2;
                    var12--;
                } else if (var10 == 6) {
                    var11 += 2;
                    var12--;
                } else if (var10 == 7) {
                    var11 -= 2;
                } else if (var10 == 8) {
                    var11 += 2;
                } else if (var10 == 9) {
                    var11 -= 2;
                    var12++;
                } else if (var10 == 10) {
                    var12++;
                    var11 += 2;
                } else if (var10 == 11) {
                    var12 += 2;
                    var11 -= 2;
                } else if (var10 == 12) {
                    var12 += 2;
                    var11--;
                } else if (var10 == 13) {
                    var12 += 2;
                } else if (var10 == 14) {
                    var12 += 2;
                    var11++;
                } else if (var10 == 15) {
                    var11 += 2;
                    var12 += 2;
                }
                if (var3) {
                    var5.field10833 = true;
                    var5.field10810 = var11;
                    var5.field10825 = var12;
                } else {
                    var5.method5363(class284.field4605[arg0], var11, var12, (byte) -101);
                }
            } else {
                int var13 = arg2.method1163(1, 104);
                if (var13 == 0) {
                    int var14 = arg2.method1163(12, arg1 ^ 0x49);
                    int var15 = var14 >> 10;
                    int var16 = var14 >> 5 & 0x1F;
                    if (var16 > 15) {
                        var16 -= 32;
                    }
                    int var17 = var14 & 0x1F;
                    if (var17 > 15) {
                        var17 -= 32;
                    }
                    int var18 = var5.field1201[0] + var16;
                    int var19 = var5.field1200[0] + var17;
                    if (var3) {
                        var5.field10833 = true;
                        var5.field10810 = var18;
                        var5.field10825 = var19;
                    } else {
                        var5.method5363(class284.field4605[arg0], var18, var19, (byte) -100);
                    }
                    var5.field9975 = var5.field9974 = (byte) (var5.field9975 + var15 & 0x3);
                    if (class541.method4028(var19, var18, (byte) 113)) {
                        var5.field9974++;
                    }
                    if (class356.field5733 == arg0) {
                        if (class673.field9554 != var5.field9975) {
                            class540.field7961 = true;
                        }
                        class673.field9554 = var5.field9975;
                    }
                } else {
                    int var20 = arg2.method1163(30, 31);
                    int var21 = var20 >> 28;
                    int var22 = (var20 & 0xFFFCAE6) >> 14;
                    int var23 = var20 & 0x3FFF;
                    int var24 = (class397.field6289 + var22 + var5.field1201[0] & 0x3FFF) - class397.field6289;
                    int var25 = (var5.field1200[0] + class141.field2011 + var23 & 0x3FFF) - class141.field2011;
                    if (var3) {
                        var5.field10810 = var24;
                        var5.field10833 = true;
                        var5.field10825 = var25;
                    } else {
                        var5.method5363(class284.field4605[arg0], var24, var25, (byte) -125);
                    }
                    var5.field9975 = var5.field9974 = (byte) (var5.field9975 + var21 & 0x3);
                    if (class541.method4028(var25, var24, (byte) 113)) {
                        var5.field9974++;
                    }
                    if (class356.field5733 == arg0) {
                        class673.field9554 = var5.field9975;
                    }
                }
            }
        } catch (RuntimeException var27) {
            throw class590.method4333(var27, field7603[4] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field7603[2] : field7603[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "([BILjava/io/File;I)V", line = 335)
    public static final void method3858(byte[] arg0, int arg1, File arg2, int arg3) throws IOException {
        try {
            if (arg1 == -12) {
                field7599++;
                DataInputStream var4 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg2)));
                try {
                    var4.readFully(arg0, 0, arg3);
                } catch (EOFException var6) {
                }
                var4.close();
            }
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field7603[3] + (arg0 == null ? field7603[2] : field7603[1]) + ',' + arg1 + ',' + (arg2 == null ? field7603[2] : field7603[1]) + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(B)V", line = 352)
    public static void method3859(byte arg0) {
        try {
            field7600 = null;
            if (arg0 > -91) {
                method3857(12, (byte) 34, null);
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field7603[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!aa", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3860(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x48);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!aa", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3861(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 72;
                    break;
                case 1:
                    var10005 = 51;
                    break;
                case 2:
                    var10005 = 66;
                    break;
                case 3:
                    var10005 = 118;
                    break;
                default:
                    var10005 = 72;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
