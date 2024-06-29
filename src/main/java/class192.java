import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public class class192 extends class301 {

    @OriginalMember(owner = "client!vk", name = "x", descriptor = "I")
    public static int field3245 = -1;

    @OriginalMember(owner = "client!vk", name = "E", descriptor = "I")
    public static int field3252 = 0;

    @OriginalMember(owner = "client!vk", name = "G", descriptor = "I")
    public static int field3253 = 0;

    @OriginalMember(owner = "client!vk", name = "D", descriptor = "Lsf;")
    public static class124 field3251 = new class124(100);

    @OriginalMember(owner = "client!vk", name = "v", descriptor = "I")
    public static int field3243;

    @OriginalMember(owner = "client!vk", name = "w", descriptor = "I")
    public static int field3244;

    @OriginalMember(owner = "client!vk", name = "y", descriptor = "I")
    public static int field3246;

    @OriginalMember(owner = "client!vk", name = "z", descriptor = "I")
    public static int field3247;

    @OriginalMember(owner = "client!vk", name = "A", descriptor = "I")
    public static int field3248;

    @OriginalMember(owner = "client!vk", name = "B", descriptor = "I")
    public static int field3249;

    @OriginalMember(owner = "client!vk", name = "H", descriptor = "I")
    public static int field3254;

    @OriginalMember(owner = "client!vk", name = "J", descriptor = "I")
    public static int field3255;

    @OriginalMember(owner = "client!vk", name = "L", descriptor = "I")
    public static int field3256;

    @OriginalMember(owner = "client!vk", name = "M", descriptor = "I")
    public static int field3257;

    @OriginalMember(owner = "client!vk", name = "C", descriptor = "Ll;")
    private class328 field3250;

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(III)I", line = 4)
    public final int method1326(int arg0, int arg1, int arg2) {
        if (arg0 != 0) {
            method1331(-29, 25, 54, -106, -7);
        }
        field3244++;
        if (this.field3250 == null) {
            return arg1;
        } else {
            class111 var4 = (class111) this.field3250.method2344(-1, (long) arg2);
            return var4 == null ? arg1 : var4.field2030;
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(Loe;I)V", line = 28)
    public final void method1327(class146 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method1005((byte) 122);
            if (var3 == 0) {
                field3248++;
                if (arg1 != 1) {
                    method1334(-39);
                }
                return;
            }
            this.method1333(arg0, (byte) 123, var3);
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(Ljava/lang/String;II)Ljava/lang/String;", line = 47)
    public final String method1328(String arg0, int arg1, int arg2) {
        field3255++;
        if (arg1 != 6548) {
            return (String) null;
        } else if (this.field3250 == null) {
            return arg0;
        } else {
            class202 var4 = (class202) this.field3250.method2344(-1, (long) arg2);
            return var4 == null ? arg0 : var4.field3389;
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(IIBI)V", line = 75)
    public static final void method1329(int arg0, int arg1, byte arg2, int arg3) {
        field3254++;
        class351 var4 = class19.method179(arg1, arg3, (byte) -119, arg0);
        if (var4 == null) {
            return;
        }
        if (arg2 != 41) {
            field3251 = (class124) null;
        }
        class341.field5403 = new String[var4.field5609];
        class284.field4632 = new int[var4.field5605];
        if (var4.field5617 == 15 || var4.field5617 == 17 || var4.field5617 == 16) {
            int var5 = 0;
            int var6 = 0;
            if (class61.field1193 != null) {
                var5 = class61.field1193.field3125;
                var6 = class61.field1193.field3011;
            }
            class284.field4632[1] = class26.field662 - var6;
            class284.field4632[0] = class73.field1339 - var5;
        }
        class50.method443(var4, 256, 200000);
    }

    @OriginalMember(owner = "client!vk", name = "d", descriptor = "(I)V", line = 111)
    public static void method1330(int arg0) {
        if (arg0 == 0) {
            field3251 = null;
        }
    }

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "(IIIII)V", line = 124)
    public static final void method1331(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = 0;
        if (arg1 != -18359) {
            return;
        }
        while (var5 < class87.field1522) {
            if (class260.field4257[var5] + class220.field3657[var5] > arg0 && class260.field4257[var5] < arg0 + arg4 && class54.field1074[var5] + class83.field1438[var5] > arg3 && class54.field1074[var5] < arg2 + arg3) {
                class117.field2084[var5] = true;
            }
            var5++;
        }
        field3243++;
    }

    @OriginalMember(owner = "client!vk", name = "e", descriptor = "(I)V", line = 146)
    public static final void method1332(int arg0) {
        field3256++;
        class280.field4575.method895(128);
        class108.field1986.method895(128);
        if (arg0 != 15) {
            method1334(8);
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(Loe;BI)V", line = 159)
    private final void method1333(class146 arg0, byte arg1, int arg2) {
        int var4 = -32 / ((arg1 - 83) / 33);
        if (arg2 == 249) {
            int var5 = arg0.method1005((byte) 122);
            if (this.field3250 == null) {
                int var6 = class311.method2264(var5, (byte) -88);
                this.field3250 = new class328(var6);
            }
            for (int var7 = 0; var7 < var5; var7++) {
                boolean var8 = arg0.method1005((byte) 122) == 1;
                int var9 = arg0.method1025((byte) -54);
                class70 var10;
                if (var8) {
                    var10 = new class202(arg0.method1017((byte) -120));
                } else {
                    var10 = new class111(arg0.method1004(3));
                }
                this.field3250.method2337(var10, 709, (long) var9);
            }
        }
        field3247++;
    }

    @OriginalMember(owner = "client!vk", name = "f", descriptor = "(I)V", line = 214)
    public static final void method1334(int arg0) {
        if (class334.field5326 == 10 && class241.field4016) {
            class311.method2260(28, -19880);
        }
        field3249++;
        if (class334.field5326 == 30) {
            class311.method2260(25, arg0 ^ 0xFFFFB258);
        }
        if (arg0 != 0) {
            field3251 = (class124) null;
        }
    }
}
