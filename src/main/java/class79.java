import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public class class79 {

    @OriginalMember(owner = "client!fk", name = "h", descriptor = "Lmq;")
    private class104 field1193 = new class104(64);

    @OriginalMember(owner = "client!fk", name = "p", descriptor = "Lmq;")
    public class104 field1201 = new class104(30);

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "Lfc;")
    public class343 field1188;

    @OriginalMember(owner = "client!fk", name = "e", descriptor = "Lfc;")
    private class343 field1190;

    @OriginalMember(owner = "client!fk", name = "i", descriptor = "Z")
    public static volatile boolean field1194 = false;

    @OriginalMember(owner = "client!fk", name = "n", descriptor = "Lfn;")
    public static class52 field1199 = new class52(21, 8);

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "I")
    public static int field1186;

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "I")
    public static int field1187;

    @OriginalMember(owner = "client!fk", name = "d", descriptor = "I")
    public static int field1189;

    @OriginalMember(owner = "client!fk", name = "f", descriptor = "I")
    public static int field1191;

    @OriginalMember(owner = "client!fk", name = "g", descriptor = "I")
    public static int field1192;

    @OriginalMember(owner = "client!fk", name = "j", descriptor = "I")
    public static int field1195;

    @OriginalMember(owner = "client!fk", name = "k", descriptor = "I")
    public static int field1196;

    @OriginalMember(owner = "client!fk", name = "l", descriptor = "I")
    public static int field1197;

    @OriginalMember(owner = "client!fk", name = "m", descriptor = "I")
    public static int field1198;

    @OriginalMember(owner = "client!fk", name = "o", descriptor = "I")
    public static int field1200;

    @OriginalMember(owner = "client!fk", name = "q", descriptor = "I")
    public static int field1202;

    @OriginalMember(owner = "client!fk", name = "s", descriptor = "I")
    public int field1204;

    @OriginalMember(owner = "client!fk", name = "r", descriptor = "J")
    public static long field1203;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(IB)V", line = 8)
    public final void method540(int arg0, byte arg1) {
        field1200++;
        this.field1204 = arg0;
        class104 var3 = this.field1201;
        synchronized (this.field1201) {
            this.field1201.method656(106);
        }
        if (arg1 != 2) {
            field1203 = 15L;
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(BI)V", line = 25)
    public final void method541(byte arg0, int arg1) {
        field1198++;
        if (arg0 > -83) {
            this.method548(11, (byte) -73);
        }
        class104 var3 = this.field1193;
        synchronized (this.field1193) {
            this.field1193.method666(arg1, false);
        }
        class104 var4 = this.field1201;
        synchronized (this.field1201) {
            this.field1201.method666(arg1, false);
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(I)V", line = 42)
    public static final void method542(int arg0) {
        field1189++;
        int var1 = 0;
        for (int var2 = arg0; var2 < class200.field2875; var2++) {
            for (int var3 = 0; var3 < class422.field5811; var3++) {
                if (class330.method1971(true, var1, arg0 ^ 0x438B, class455.field6293, var2, var3)) {
                    var1++;
                }
                if (var1 >= 512) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(B)V", line = 77)
    public final void method543(byte arg0) {
        if (arg0 != 74) {
            field1194 = true;
        }
        field1202++;
        class104 var2 = this.field1193;
        synchronized (this.field1193) {
            this.field1193.method654(false);
        }
        class104 var3 = this.field1201;
        synchronized (this.field1201) {
            this.field1201.method654(false);
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(III)V", line = 93)
    public static final void method544(int arg0, int arg1, int arg2) {
        class275.field3806 = arg1;
        class227.field3212 = arg0;
        field1197++;
        if (class20.field350 == 1) {
            class24.method210(class132.field1859, (byte) 67);
        } else if (class20.field350 == 2) {
            class30.method240(class8.field169.method972(false), -16991, class8.field169.method980(arg2 ^ 0x41));
        }
        class132.field1859 = null;
        class20.field350 = arg2;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(IIIIIB)V", line = 114)
    public static final void method545(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        if (class299.field4121 <= arg4 && class248.field3487 >= arg1 && class53.field874 <= arg2 && arg0 <= class8.field174) {
            class321.method1932(arg2, arg1, arg0, arg4, (byte) 123, arg3);
        } else {
            class394.method2350(arg3, arg1, arg4, (byte) -87, arg0, arg2);
        }
        field1191++;
        if (arg5 != 1) {
            field1203 = 70L;
        }
    }

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "(I)V", line = 131)
    public static final void method546(int arg0) {
        field1186++;
        class388.field5458.method796(-125);
        int var1 = class388.field5458.method801((byte) -87, 8);
        if (class32.field520 > var1) {
            for (int var2 = var1; var2 < class32.field520; var2++) {
                class295.field4082[class36.field625++] = class42.field718[var2];
            }
        }
        if (var1 > class32.field520) {
            throw new RuntimeException("gnpov1");
        }
        class32.field520 = 0;
        for (int var3 = arg0; var3 < var1; var3++) {
            int var4 = class42.field718[var3];
            class196 var5 = class256.field3581[var4];
            int var6 = class388.field5458.method801((byte) -87, 1);
            if (var6 == 0) {
                class42.field718[class32.field520++] = var4;
                var5.field1090 = class356.field4972;
            } else {
                int var7 = class388.field5458.method801((byte) -87, 2);
                if (var7 == 0) {
                    class42.field718[class32.field520++] = var4;
                    var5.field1090 = class356.field4972;
                    class454.field6278[class477.field6744++] = var4;
                } else if (var7 == 1) {
                    class42.field718[class32.field520++] = var4;
                    var5.field1090 = class356.field4972;
                    int var8 = class388.field5458.method801((byte) -87, 3);
                    var5.method1253(-34, 1, var8);
                    int var9 = class388.field5458.method801((byte) -87, 1);
                    if (var9 == 1) {
                        class454.field6278[class477.field6744++] = var4;
                    }
                } else if (var7 == 2) {
                    class42.field718[class32.field520++] = var4;
                    var5.field1090 = class356.field4972;
                    if (class388.field5458.method801((byte) -87, 1) == 1) {
                        int var10 = class388.field5458.method801((byte) -87, 3);
                        var5.method1253(-94, 2, var10);
                        int var11 = class388.field5458.method801((byte) -87, 3);
                        var5.method1253(-101, 2, var11);
                    } else {
                        int var12 = class388.field5458.method801((byte) -87, 3);
                        var5.method1253(arg0 ^ 0xFFFFFFA1, 0, var12);
                    }
                    int var13 = class388.field5458.method801((byte) -87, 1);
                    if (var13 == 1) {
                        class454.field6278[class477.field6744++] = var4;
                    }
                } else if (var7 == 3) {
                    class295.field4082[class36.field625++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "(I)V", line = 242)
    public static void method547(int arg0) {
        int var1 = 124 % ((arg0 - 33) / 54);
        field1199 = null;
    }

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "(IB)Ltl;", line = 251)
    public final class321 method548(int arg0, byte arg1) {
        field1196++;
        int var3 = -83 % ((arg1 + 35) / 38);
        class104 var4 = this.field1193;
        class321 var5;
        synchronized (this.field1193) {
            var5 = (class321) this.field1193.method659((long) arg0, (byte) -1);
        }
        if (var5 != null) {
            return var5;
        }
        byte[] var6 = this.field1190.method2029(class480.method2826(arg0, (byte) 113), class321.method1937(arg0, (byte) -89), 0);
        class321 var7 = new class321();
        var7.field4402 = arg0;
        var7.field4390 = this;
        if (var6 != null) {
            var7.method1940(new class425(var6), 0);
        }
        class104 var8 = this.field1193;
        synchronized (this.field1193) {
            this.field1193.method653(76, (long) arg0, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!fk", name = "d", descriptor = "(I)V", line = 280)
    public final void method549(int arg0) {
        class104 var2 = this.field1193;
        synchronized (this.field1193) {
            if (arg0 != -2) {
                this.method541((byte) 43, -27);
            }
            this.field1193.method656(125);
        }
        field1187++;
        class104 var3 = this.field1201;
        synchronized (this.field1201) {
            this.field1201.method656(110);
        }
    }

    @OriginalMember(owner = "client!fk", name = "<init>", descriptor = "(Ldk;ILfc;Lfc;)V", line = 316)
    public class79(class328 arg0, int arg1, class343 arg2, class343 arg3) {
        this.field1188 = arg3;
        this.field1190 = arg2;
        int var5 = this.field1190.method2027(111) - 1;
        this.field1190.method2054(0, var5);
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(Z)V", line = 334)
    public static final void method550(boolean arg0) {
        class306.field4191 = 0;
        class35.field588 = -1;
        if (!arg0) {
            class372.field5266 = -1;
            field1195++;
            class8.field141 = -1;
        }
    }
}
