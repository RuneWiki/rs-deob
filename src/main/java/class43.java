import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fo")
public class class43 {

    @OriginalMember(owner = "client!fo", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field635 = new String[] { method480(method479(">5\u0016w\f")), method480(method479("#t\u0016\u001aY")), method480(method479("6/TX")), method480(method479(">5\u0016u\f")), method480(method479(">5\u0016v\f")), method480(method479(">5\u0016p\f")) };

    @OriginalMember(owner = "client!fo", name = "d", descriptor = "I")
    public static int field631;

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "I")
    public static int field632;

    @OriginalMember(owner = "client!fo", name = "c", descriptor = "I")
    public static int field633;

    @OriginalMember(owner = "client!fo", name = "b", descriptor = "[I")
    public static int[] field634;

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(I)V")
    public static void method475(int arg0) {
        try {
            if (arg0 != -16) {
                method478(64, null);
            }
            field634 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field635[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!fo", name = "b", descriptor = "(I[B)Lue;")
    public static final class90 method476(int arg0, byte[] arg1) {
        try {
            field632++;
            class90 var2 = new class90();
            class711 var3 = new class711(arg1);
            if (arg0 != -1001) {
                field634 = null;
            }
            var3.field9945 = var3.field9996.length - 2;
            int var4 = var3.method5116((byte) -127);
            int var5 = var3.field9996.length - var4 - 16 - 2;
            var3.field9945 = var5;
            int var6 = var3.method5113(18443);
            var2.field1263 = var3.method5116((byte) -108);
            var2.field1264 = var3.method5116((byte) -121);
            var2.field1265 = var3.method5116((byte) -107);
            var2.field1256 = var3.method5116((byte) -110);
            var2.field1253 = var3.method5116((byte) -109);
            var2.field1259 = var3.method5116((byte) -123);
            int var7 = var3.method5128(arg0 + 1001);
            if (var7 > 0) {
                var2.field1254 = new class477[var7];
                for (int var8 = 0; var8 < var7; var8++) {
                    int var9 = var3.method5116((byte) -108);
                    class477 var10 = new class477(class788.method5671(1282334120, var9));
                    var2.field1254[var8] = var10;
                    while (var9-- > 0) {
                        int var11 = var3.method5113(18443);
                        int var12 = var3.method5113(arg0 ^ 0xFFFFB41C);
                        var10.method3691(new class529(var12), (long) var11, -1);
                    }
                }
            }
            var3.field9945 = 0;
            var2.field1255 = var3.method5084(-67);
            var2.field1251 = new int[var6];
            int var13 = 0;
            while (var5 > var3.field9945) {
                int var14 = var3.method5116((byte) -114);
                if (var14 == 3) {
                    if (var2.field1267 == null) {
                        var2.field1267 = new String[var6];
                    }
                    var2.field1267[var13] = var3.method5144(-16414).intern();
                } else if (var14 == 54) {
                    if (var2.field1266 == null) {
                        var2.field1266 = new long[var6];
                    }
                    var2.field1266[var13] = var3.method5147((byte) 92);
                } else {
                    if (var2.field1261 == null) {
                        var2.field1261 = new int[var6];
                    }
                    if (var14 >= 150 || var14 == 21 || var14 == 38 || var14 == 39) {
                        var2.field1261[var13] = var3.method5128(0);
                    } else {
                        var2.field1261[var13] = var3.method5113(18443);
                    }
                }
                var2.field1251[var13++] = var14;
            }
            return var2;
        } catch (RuntimeException var16) {
            throw class665.method4799(var16, field635[3] + arg0 + ',' + (arg1 == null ? field635[2] : field635[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(IB)[B")
    public static final synchronized byte[] method477(int arg0, byte arg1) {
        try {
            if (arg1 < 14) {
                field634 = null;
            }
            field631++;
            if (arg0 == 100 && class305.field4242 > 0) {
                byte[] var2 = class578.field8379[--class305.field4242];
                class578.field8379[class305.field4242] = null;
                return var2;
            } else if (arg0 == 5000 && class134.field1699 > 0) {
                byte[] var3 = class285.field4005[--class134.field1699];
                class285.field4005[class134.field1699] = null;
                return var3;
            } else if (arg0 == 30000 && class785.field11347 > 0) {
                byte[] var4 = class791.field11511[--class785.field11347];
                class791.field11511[class785.field11347] = null;
                return var4;
            } else {
                if (class709.field9901 != null) {
                    for (int var5 = 0; var5 < class504.field7382.length; var5++) {
                        if (class504.field7382[var5] == arg0 && class35.field428[var5] > 0) {
                            byte[] var6 = class709.field9901[var5][--class35.field428[var5]];
                            class709.field9901[var5][class35.field428[var5]] = null;
                            return var6;
                        }
                    }
                }
                return new byte[arg0];
            }
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field635[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(I[B)V")
    public static final synchronized void method478(int arg0, byte[] arg1) {
        try {
            field633++;
            if (arg1.length == 100 && class305.field4242 < 1000) {
                class578.field8379[class305.field4242++] = arg1;
            } else if (arg1.length == 5000 && class134.field1699 < 250) {
                class285.field4005[class134.field1699++] = arg1;
            } else if (arg1.length == 30000 && class785.field11347 < 50) {
                class791.field11511[class785.field11347++] = arg1;
            } else {
                if (arg0 != -151) {
                    method476(39, null);
                }
                if (class709.field9901 != null) {
                    for (int var2 = 0; var2 < class504.field7382.length; var2++) {
                        if (class504.field7382[var2] == arg1.length && class709.field9901[var2].length > class35.field428[var2]) {
                            class709.field9901[var2][class35.field428[var2]++] = arg1;
                            return;
                        }
                    }
                }
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field635[5] + arg0 + ',' + (arg1 == null ? field635[2] : field635[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!fo", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method479(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x24);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!fo", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method480(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 88;
                    break;
                case 1:
                    var10005 = 90;
                    break;
                case 2:
                    var10005 = 56;
                    break;
                case 3:
                    var10005 = 52;
                    break;
                default:
                    var10005 = 36;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
