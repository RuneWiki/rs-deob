import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class83 {

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "I")
    public static int field1199 = 255;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "I")
    public static int field1198;

    @OriginalMember(owner = "client!ob", name = "d", descriptor = "I")
    public static int field1201;

    @OriginalMember(owner = "client!ob", name = "g", descriptor = "I")
    public int field1204;

    @OriginalMember(owner = "client!ob", name = "h", descriptor = "I")
    public static int field1205;

    @OriginalMember(owner = "client!ob", name = "i", descriptor = "I")
    public static int field1206;

    @OriginalMember(owner = "client!ob", name = "j", descriptor = "I")
    public static int field1207;

    @OriginalMember(owner = "client!ob", name = "f", descriptor = "Lkm;")
    public static class133 field1203;

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "Ljl;")
    public class287 field1200;

    @OriginalMember(owner = "client!ob", name = "e", descriptor = "[I")
    public int[] field1202;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(B)V", line = 15)
    public static final void method646(byte arg0) {
        field1201++;
        if (class185.field2545 == 0 || arg0 >= -81) {
            return;
        }
        try {
            if (++class126.field1735 > 1500) {
                if (class39.field442 != null) {
                    class39.field442.method1577((byte) 6);
                    class39.field442 = null;
                }
                if (class168.field2289 >= 1) {
                    class68.field939 = -5;
                    class185.field2545 = 0;
                    return;
                }
                class185.field2545 = 1;
                class126.field1735 = 0;
                class168.field2289++;
                if (class273.field4088 == class137.field1888) {
                    class273.field4088 = class66.field873;
                } else {
                    class273.field4088 = class137.field1888;
                }
            }
            if (class185.field2545 == 1) {
                class125.field1697 = class165.field2258.method618(class273.field4088, class296.field4391, 92);
                class185.field2545 = 2;
            }
            if (class185.field2545 == 2) {
                if (class125.field1697.field4241 == 2) {
                    throw new IOException();
                }
                if (class125.field1697.field4241 != 1) {
                    return;
                }
                class39.field442 = new class223((Socket) class125.field1697.field4244, class165.field2258);
                class125.field1697 = null;
                class39.field442.method1575(class90.field1264.field4777, 0, 5000, class90.field1264.field4798);
                if (class96.field1291 != null) {
                    class96.field1291.method1770((byte) -107);
                }
                if (class344.field5325 != null) {
                    class344.field5325.method1770((byte) -89);
                }
                int var1 = class39.field442.method1570((byte) 32);
                if (class96.field1291 != null) {
                    class96.field1291.method1770((byte) -91);
                }
                if (class344.field5325 != null) {
                    class344.field5325.method1770((byte) -80);
                }
                if (var1 != 101) {
                    class68.field939 = var1;
                    class185.field2545 = 0;
                    class39.field442.method1577((byte) 103);
                    class39.field442 = null;
                    return;
                }
                class185.field2545 = 3;
            }
            if (class185.field2545 == 3) {
                if (class39.field442.method1572(0) < 2) {
                    return;
                }
                int var2 = class39.field442.method1570((byte) 99) << 8 | class39.field442.method1570((byte) 78);
                class242.method1662(var2, (byte) 124);
                if (class199.field2838 == -1) {
                    class68.field939 = 6;
                    class185.field2545 = 0;
                    class39.field442.method1577((byte) 13);
                    class39.field442 = null;
                    return;
                }
                class185.field2545 = 0;
                class39.field442.method1577((byte) -111);
                class39.field442 = null;
                class312.method2140(-105);
                return;
            }
        } catch (IOException var4) {
            if (class39.field442 != null) {
                class39.field442.method1577((byte) -107);
                class39.field442 = null;
            }
            if (class168.field2289 < 1) {
                class126.field1735 = 0;
                class185.field2545 = 1;
                class168.field2289++;
                if (class273.field4088 == class137.field1888) {
                    class273.field4088 = class66.field873;
                } else {
                    class273.field4088 = class137.field1888;
                }
            } else {
                class68.field939 = -4;
                class185.field2545 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(I[ILsc;[I[I)V", line = 163)
    public static final void method647(int arg0, int[] arg1, class329 arg2, int[] arg3, int[] arg4) {
        for (int var5 = arg0; var5 < arg3.length; var5++) {
            int var6 = arg3[var5];
            int var7 = arg4[var5];
            int var8 = arg1[var5];
            for (int var9 = 0; var8 != 0 && arg2.field3674.length > var9; var9++) {
                if ((var8 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg2.field3674[var9] = null;
                    } else {
                        class125 var10 = class52.method361(true, var6);
                        int var11 = var10.field1681;
                        class108 var12 = arg2.field3674[var9];
                        if (var12 != null) {
                            if (var12.field1465 == var6) {
                                if (var11 == 0) {
                                    var12 = arg2.field3674[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field1456 = 0;
                                    var12.field1458 = 0;
                                    var12.field1457 = 0;
                                    var12.field1454 = 1;
                                    var12.field1459 = var7;
                                    class241.method1651(0, false, arg2.field3745, var10, arg2.field3679, arg0 + 90);
                                } else if (var11 == 2) {
                                    var12.field1458 = 0;
                                }
                            } else if (var10.field1684 >= class52.method361(true, var12.field1465).field1684) {
                                var12 = arg2.field3674[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class108 var13 = arg2.field3674[var9] = new class108();
                            var13.field1459 = var7;
                            var13.field1465 = var6;
                            var13.field1457 = 0;
                            var13.field1456 = 0;
                            var13.field1458 = 0;
                            var13.field1454 = 1;
                            class241.method1651(0, false, arg2.field3745, var10, arg2.field3679, 126);
                        }
                    }
                }
                var8 >>>= 0x1;
            }
        }
        field1198++;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(I)V", line = 256)
    public static void method648(int arg0) {
        field1203 = null;
        if (arg0 != 0) {
            field1199 = 111;
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(ZLjava/lang/String;I)I", line = 267)
    public static final int method649(boolean arg0, String arg1, int arg2) {
        field1206++;
        if (arg0) {
            method647(118, (int[]) null, (class329) null, (int[]) null, (int[]) null);
        }
        return class126.method911((byte) -116, arg2, true, arg1);
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(II)V", line = 280)
    public static final void method650(int arg0, int arg1) {
        field1205++;
        class143 var2 = class163.method1176((byte) 86, arg1, 2);
        if (arg0 != 1) {
            field1203 = (class133) null;
        }
        var2.method1038(0);
    }
}
