import java.awt.Component;
import java.io.IOException;
import java.net.Socket;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class165 extends class314 {

    @OriginalMember(owner = "client!eh", name = "w", descriptor = "I")
    public static int field2969 = 0;

    @OriginalMember(owner = "client!eh", name = "J", descriptor = "Z")
    public static boolean field2982 = false;

    @OriginalMember(owner = "client!eh", name = "k", descriptor = "I")
    public int field2957;

    @OriginalMember(owner = "client!eh", name = "l", descriptor = "I")
    public int field2958;

    @OriginalMember(owner = "client!eh", name = "m", descriptor = "I")
    public int field2959;

    @OriginalMember(owner = "client!eh", name = "n", descriptor = "I")
    public static int field2960;

    @OriginalMember(owner = "client!eh", name = "o", descriptor = "I")
    public static int field2961;

    @OriginalMember(owner = "client!eh", name = "p", descriptor = "I")
    public int field2962;

    @OriginalMember(owner = "client!eh", name = "q", descriptor = "I")
    public static int field2963;

    @OriginalMember(owner = "client!eh", name = "s", descriptor = "I")
    public int field2965;

    @OriginalMember(owner = "client!eh", name = "t", descriptor = "I")
    public int field2966;

    @OriginalMember(owner = "client!eh", name = "u", descriptor = "I")
    public static int field2967;

    @OriginalMember(owner = "client!eh", name = "y", descriptor = "I")
    public int field2971;

    @OriginalMember(owner = "client!eh", name = "z", descriptor = "I")
    public static int field2972;

    @OriginalMember(owner = "client!eh", name = "B", descriptor = "I")
    public int field2974;

    @OriginalMember(owner = "client!eh", name = "C", descriptor = "I")
    public int field2975;

    @OriginalMember(owner = "client!eh", name = "D", descriptor = "I")
    public int field2976;

    @OriginalMember(owner = "client!eh", name = "E", descriptor = "I")
    public int field2977;

    @OriginalMember(owner = "client!eh", name = "F", descriptor = "I")
    public int field2978;

    @OriginalMember(owner = "client!eh", name = "G", descriptor = "I")
    public int field2979;

    @OriginalMember(owner = "client!eh", name = "H", descriptor = "I")
    public int field2980;

    @OriginalMember(owner = "client!eh", name = "I", descriptor = "I")
    public int field2981;

    @OriginalMember(owner = "client!eh", name = "K", descriptor = "I")
    public int field2983;

    @OriginalMember(owner = "client!eh", name = "L", descriptor = "I")
    public int field2984;

    @OriginalMember(owner = "client!eh", name = "M", descriptor = "Lf;")
    public class244 field2985;

    @OriginalMember(owner = "client!eh", name = "A", descriptor = "Ltc;")
    public class40 field2973;

    @OriginalMember(owner = "client!eh", name = "r", descriptor = "Lri;")
    public class68 field2964;

    @OriginalMember(owner = "client!eh", name = "v", descriptor = "Lwa;")
    public class82 field2968;

    @OriginalMember(owner = "client!eh", name = "x", descriptor = "[[[I")
    public static int[][][] field2970;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(JI)Lud;", line = 5)
    public static final class279 method1286(long arg0, int arg1) {
        int var3 = 20 / ((arg1 - 35) / 53);
        class306.field5431.setTime(new Date(arg0));
        field2972++;
        int var4 = class306.field5431.get(7);
        int var5 = class306.field5431.get(5);
        int var6 = class306.field5431.get(2);
        int var7 = class306.field5431.get(1);
        int var8 = class306.field5431.get(11);
        int var9 = class306.field5431.get(12);
        int var10 = class306.field5431.get(13);
        return class115.method929(new class279[] { class272.field4842[var4 - 1], class124.field2259, class191.method1447(5, var5 / 10), class191.method1447(5, var5 % 10), class238.field4179, class176.field3166[var6], class238.field4179, class191.method1447(5, var7), class121.field2169, class191.method1447(5, var8 / 10), class191.method1447(5, var8 % 10), class125.field2301, class191.method1447(5, var9 / 10), class191.method1447(5, var9 % 10), class125.field2301, class191.method1447(5, var10 / 10), class191.method1447(5, var10 % 10), class142.field2580 }, (byte) 60);
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(Ljava/awt/Component;III)Lja;", line = 32)
    public static final class64 method1287(Component arg0, int arg1, int arg2, int arg3) {
        field2960++;
        try {
            Class var4 = Class.forName("qk");
            if (arg3 != -4) {
                method1288((byte) 116);
            }
            class64 var5 = (class64) var4.getDeclaredConstructor().newInstance();
            var5.method542(arg2, (byte) -44, arg1, arg0);
            return var5;
        } catch (Throwable var8) {
            class122 var7 = new class122();
            var7.method542(arg2, (byte) -44, arg1, arg0);
            return var7;
        }
    }

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "(B)V", line = 59)
    public static final void method1288(byte arg0) {
        field2961++;
        if (class139.field2516 == 0) {
            return;
        }
        try {
            if ((++class182.field3332) > 2000) {
                if (class202.field3603 != null) {
                    class202.field3603.method2024(arg0 + 85);
                    class202.field3603 = null;
                }
                if (class180.field3280 >= 1) {
                    class73.field1435 = -5;
                    class139.field2516 = 0;
                    return;
                }
                class139.field2516 = 1;
                class182.field3332 = 0;
                class180.field3280++;
                if (class311.field5512 == class260.field4621) {
                    class311.field5512 = class86.field1616;
                } else {
                    class311.field5512 = class260.field4621;
                }
            }
            if (class139.field2516 == 1) {
                class181.field3300 = class110.field2022.method2164(0, class274.field4876, class311.field5512);
                class139.field2516 = 2;
            }
            if (class139.field2516 == 2) {
                if (class181.field3300.field3655 == 2) {
                    throw new IOException();
                }
                if (class181.field3300.field3655 != 1) {
                    return;
                }
                class202.field3603 = new class280((Socket) class181.field3300.field3657, class110.field2022);
                class181.field3300 = null;
                class202.field3603.method2021(class314.field5534.field1142, class314.field5534.field1168, 0, 3);
                if (class80.field1537 != null) {
                    class80.field1537.method747(2512);
                }
                if (class120.field2163 != null) {
                    class120.field2163.method747(2512);
                }
                int var1 = class202.field3603.method2022((byte) -123);
                if (class80.field1537 != null) {
                    class80.field1537.method747(2512);
                }
                if (class120.field2163 != null) {
                    class120.field2163.method747(arg0 ^ 0xFFFFF67A);
                }
                if (var1 != 21) {
                    class139.field2516 = 0;
                    class73.field1435 = var1;
                    class202.field3603.method2024(-1);
                    class202.field3603 = null;
                    return;
                }
                class139.field2516 = 3;
            }
            if (class139.field2516 == 3) {
                if (class202.field3603.method2023(117) < 1) {
                    return;
                }
                class250.field4457 = new class279[class202.field3603.method2022((byte) -107)];
                class139.field2516 = 4;
            }
            if (class139.field2516 == 4) {
                if (class202.field3603.method2023(114) < class250.field4457.length * 8) {
                    return;
                }
                class287.field5106.field1142 = 0;
                class202.field3603.method2026(arg0 + 177, class287.field5106.field1168, class250.field4457.length * 8, 0);
                for (int var2 = 0; var2 < class250.field4457.length; var2++) {
                    class250.field4457[var2] = class72.method631(class287.field5106.method469((byte) 42), 5702);
                }
                class139.field2516 = 0;
                class73.field1435 = 21;
                class202.field3603.method2024(-1);
                class202.field3603 = null;
                return;
            }
        } catch (IOException var4) {
            if (class202.field3603 != null) {
                class202.field3603.method2024(-1);
                class202.field3603 = null;
            }
            if (class180.field3280 < 1) {
                class139.field2516 = 1;
                class182.field3332 = 0;
                if (class311.field5512 == class260.field4621) {
                    class311.field5512 = class86.field1616;
                } else {
                    class311.field5512 = class260.field4621;
                }
                class180.field3280++;
            } else {
                class139.field2516 = 0;
                class73.field1435 = -4;
            }
        }
        if (arg0 != -86) {
            method1289((byte) 92);
        }
    }

    @OriginalMember(owner = "client!eh", name = "d", descriptor = "(B)V", line = 247)
    public static void method1289(byte arg0) {
        field2970 = (int[][][]) null;
        int var1 = -83 / ((arg0 - 60) / 58);
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(I)V", line = 264)
    public final void method1290(int arg0) {
        this.field2985 = null;
        this.field2968 = null;
        this.field2973 = null;
        field2967++;
        this.field2964 = null;
        if (arg0 >= -4) {
            this.field2973 = (class40) null;
        }
    }

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "(Z)V", line = 280)
    public static final void method1291(boolean arg0) {
        if (!arg0) {
            class268.field4808++;
            field2963++;
        }
    }
}
