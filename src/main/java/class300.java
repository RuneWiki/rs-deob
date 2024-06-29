import java.awt.event.ActionEvent;
import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public class class300 {

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "I")
    public static int field4717;

    @OriginalMember(owner = "client!fl", name = "c", descriptor = "I")
    public static int field4718;

    @OriginalMember(owner = "client!fl", name = "d", descriptor = "I")
    public static int field4719;

    @OriginalMember(owner = "client!fl", name = "e", descriptor = "I")
    public static int field4720;

    @OriginalMember(owner = "client!fl", name = "f", descriptor = "I")
    public static int field4721;

    @OriginalMember(owner = "client!fl", name = "g", descriptor = "I")
    public static int field4722;

    @OriginalMember(owner = "client!fl", name = "h", descriptor = "I")
    public static int field4723;

    @OriginalMember(owner = "client!fl", name = "i", descriptor = "I")
    public static int field4724;

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field4716;

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(Ljava/lang/Object;BLjh;)V", line = 4)
    public static final void method2137(Object arg0, byte arg1, class124 arg2) {
        field4722++;
        if (arg2.field1945 == null) {
            return;
        }
        for (int var3 = 0; var3 < 50 && arg2.field1945.peekEvent() != null; var3++) {
            class121.method867((byte) -76, 1L);
        }
        if (arg1 == -61 && arg0 != null) {
            arg2.field1945.postEvent(new ActionEvent(arg0, 1001, "dummy"));
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(Lak;B)V", line = 31)
    public static final void method2138(class172 arg0, byte arg1) {
        class39.field504 = arg0.method1298((byte) 105, "p11_full");
        class36.field482 = arg0.method1298((byte) 80, "p12_full");
        field4717++;
        class97.field1339 = arg0.method1298((byte) -67, "b12_full");
        class208.field3426 = arg0.method1298((byte) -117, "mapfunction");
        class311.field4848 = arg0.method1298((byte) -75, "hitmarks");
        class45.field628 = arg0.method1298((byte) -59, "hitbar_default");
        class102.field1492 = arg0.method1298((byte) 99, "headicons_pk");
        class229.field3651 = arg0.method1298((byte) 99, "headicons_prayer");
        class284.field4554 = arg0.method1298((byte) 104, "hint_headicons");
        class231.field3670 = arg0.method1298((byte) 90, "hint_mapmarkers");
        class60.field843 = arg0.method1298((byte) -101, "mapflag");
        class139.field2189 = arg0.method1298((byte) -107, "cross");
        class158.field2621 = arg0.method1298((byte) -93, "mapdots");
        class156.field2412 = arg0.method1298((byte) 102, "scrollbar");
        class81.field1137 = arg0.method1298((byte) 78, "name_icons");
        class274.field4419 = arg0.method1298((byte) -55, "floorshadows");
        int var2 = -33 % ((arg1 + 6) / 61);
        class7.field105 = arg0.method1298((byte) -112, "compass");
        class53.field756 = arg0.method1298((byte) 71, "hint_mapedge");
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(Ljava/lang/String;IC)[Ljava/lang/String;", line = 60)
    public static final String[] method2139(String arg0, int arg1, char arg2) {
        field4718++;
        int var3 = class214.method1540(arg2, arg0, 0);
        int var4 = 0;
        String[] var5 = new String[var3 + 1];
        int var6 = 0;
        int var7 = 0;
        if (arg1 != -12496) {
            return (String[]) null;
        }
        while (var7 < var3) {
            int var8;
            for (var8 = var6; arg0.charAt(var8) != arg2; var8++) {
            }
            var5[var4++] = arg0.substring(var6, var8);
            var6 = var8 + 1;
            var7++;
        }
        var5[var3] = arg0.substring(var6);
        return var5;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "([BLjj;B)V", line = 94)
    public final void method2140(byte[] arg0, class44 arg1, byte arg2) {
        field4723++;
        if (arg1.field573[arg1.field586] != 31 || arg1.field573[arg1.field586 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field4716 == null) {
            this.field4716 = new Inflater(true);
        }
        if (arg2 != 64) {
            this.field4716 = (Inflater) null;
        }
        try {
            this.field4716.setInput(arg1.field573, arg1.field586 + 10, arg1.field573.length + -arg1.field586 - 18);
            this.field4716.inflate(arg0);
        } catch (Exception var5) {
            this.field4716.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field4716.reset();
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(IBI)V", line = 124)
    public static final void method2141(int arg0, byte arg1, int arg2) {
        int var3 = 0;
        if (arg1 < 112) {
            return;
        }
        while (var3 < class36.field479) {
            class278 var4 = class271.method1925((byte) 15, var3);
            if (var4 != null) {
                int var5 = var4.field4490;
                if (var5 >= 0 && !class170.field2814.method963(false, var5)) {
                    var5 = -1;
                }
                int var6;
                if (var4.field4484 >= 0) {
                    int var10 = var4.field4484;
                    int var11 = (var10 & 0x7F) + arg2;
                    if (var11 < 0) {
                        var11 = 0;
                    } else if (var11 > 127) {
                        var11 = 127;
                    }
                    int var12 = (var10 + arg0 & 0xFC00) + (var10 & 0x380) + var11;
                    var6 = class170.field2812[class94.method629(96, var12, (byte) -123)];
                } else if (var5 >= 0) {
                    var6 = class170.field2812[class94.method629(96, class170.field2814.method945(var5, 255), (byte) 19)];
                } else if (var4.field4471 == -1) {
                    var6 = -1;
                } else {
                    int var7 = var4.field4471;
                    int var8 = (var7 & 0x7F) + arg2;
                    if (var8 < 0) {
                        var8 = 0;
                    } else if (var8 > 127) {
                        var8 = 127;
                    }
                    int var9 = (arg0 + var7 & 0xFC00) + ((var7 & 0x380) + var8);
                    var6 = class170.field2812[class94.method629(96, var9, (byte) 19)];
                }
                class110.field1635[var3 + 1] = var6;
            }
            var3++;
        }
        field4720++;
    }

    @OriginalMember(owner = "client!fl", name = "<init>", descriptor = "()V", line = 198)
    public class300() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(Lak;ILak;)V", line = 202)
    public static final void method2142(class172 arg0, int arg1, class172 arg2) {
        class209.field3439 = arg0;
        class116.field1767 = arg2;
        int var3 = (int) (Math.random() * 21.0D) - 10;
        if (arg1 != 26843) {
            return;
        }
        field4719++;
        class116.field1767.method1299(34, (byte) 96);
        int var4 = (int) (Math.random() * 21.0D) - 10;
        int var5 = (int) (Math.random() * 41.0D) - 20;
        int var6 = (int) (Math.random() * 21.0D) - 10;
        class318.field4949 = var3 + var5;
        class252.field4034 = var4 + var5;
        class135.field2150 = var5 + var6;
    }

    @OriginalMember(owner = "client!fl", name = "<init>", descriptor = "(III)V", line = 236)
    private class300(int arg0, int arg1, int arg2) {
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(I)V", line = 256)
    public static final void method2143(int arg0) {
        if (arg0 == 20358) {
            field4724++;
            class176.field2942.method707(0);
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(II)V", line = 268)
    public static final void method2144(int arg0, int arg1) {
        class344 var2 = class110.method759(7, arg1, false);
        if (arg0 == -9) {
            var2.method2384(-27354);
            field4721++;
        }
    }
}
