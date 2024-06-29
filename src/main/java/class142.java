import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class142 extends class320 {

    @OriginalMember(owner = "client!oe", name = "o", descriptor = "I")
    public int field2601;

    @OriginalMember(owner = "client!oe", name = "n", descriptor = "[I")
    public static int[] field2600 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!oe", name = "l", descriptor = "I")
    public static int field2598;

    @OriginalMember(owner = "client!oe", name = "m", descriptor = "I")
    public static int field2599;

    @OriginalMember(owner = "client!oe", name = "p", descriptor = "I")
    public static int field2602;

    @OriginalMember(owner = "client!oe", name = "q", descriptor = "I")
    public static int field2603;

    @OriginalMember(owner = "client!oe", name = "r", descriptor = "I")
    public static int field2604;

    @OriginalMember(owner = "client!oe", name = "s", descriptor = "I")
    public static int field2605;

    @OriginalMember(owner = "client!oe", name = "t", descriptor = "I")
    public static int field2606;

    @OriginalMember(owner = "client!oe", name = "u", descriptor = "I")
    public static int field2607;

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "(I)V", line = 7)
    public static final void method1145(int arg0) {
        class336.field5364.method466(-1);
        field2599++;
        if (arg0 <= 84) {
            field2600 = (int[]) null;
        }
        class58.field899.method466(-1);
        class69.field1130.method466(-1);
    }

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "(I)V", line = 20)
    public static final void method1146(int arg0) {
        field2605++;
        int var1 = class276.field4398.method35(8, (byte) -123);
        if (var1 < class291.field4664) {
            for (int var2 = var1; var2 < class291.field4664; var2++) {
                class180.field3037[class34.field489++] = class119.field2064[var2];
            }
        }
        if (var1 > class291.field4664) {
            throw new RuntimeException("gppov1");
        }
        class291.field4664 = 0;
        if (arg0 != -3) {
            field2598 = -7;
        }
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class119.field2064[var3];
            class205 var5 = class135.field2359[var4];
            int var6 = class276.field4398.method35(1, (byte) 41);
            if (var6 == 0) {
                class119.field2064[class291.field4664++] = var4;
                var5.field2029 = class181.field3045;
            } else {
                int var7 = class276.field4398.method35(2, (byte) -44);
                if (var7 == 0) {
                    class119.field2064[class291.field4664++] = var4;
                    var5.field2029 = class181.field3045;
                    class146.field2641[class119.field2067++] = var4;
                } else if (var7 == 1) {
                    class119.field2064[class291.field4664++] = var4;
                    var5.field2029 = class181.field3045;
                    int var8 = class276.field4398.method35(3, (byte) 115);
                    var5.method978(1, var8, arg0 ^ 0x2);
                    int var9 = class276.field4398.method35(1, (byte) -29);
                    if (var9 == 1) {
                        class146.field2641[class119.field2067++] = var4;
                    }
                } else if (var7 == 2) {
                    class119.field2064[class291.field4664++] = var4;
                    var5.field2029 = class181.field3045;
                    if (class276.field4398.method35(1, (byte) 10) == 1) {
                        int var10 = class276.field4398.method35(3, (byte) -124);
                        var5.method978(2, var10, arg0 + 2);
                        int var11 = class276.field4398.method35(3, (byte) -118);
                        var5.method978(2, var11, -1);
                    } else {
                        int var12 = class276.field4398.method35(3, (byte) -118);
                        var5.method978(0, var12, -1);
                    }
                    int var13 = class276.field4398.method35(1, (byte) -114);
                    if (var13 == 1) {
                        class146.field2641[class119.field2067++] = var4;
                    }
                } else if (var7 == 3) {
                    class180.field3037[class34.field489++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(B)Lta;", line = 134)
    public static final class217 method1147(byte arg0) {
        class217 var1 = new class217(class308.field4901, class4.field58, class352.field5575[0], class104.field1743[0], class39.field585[0], class123.field2138[0], class191.field3205[0], class40.field600);
        class15.method151(0);
        int var2 = 122 / ((arg0 + 21) / 61);
        field2604++;
        return var1;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lcg;Lcg;I)V", line = 147)
    public static final void method1148(class49 arg0, class49 arg1, int arg2) {
        class209.field3541 = arg1;
        class134.field2332 = arg0;
        class110.field1862 = class209.field3541.method455(arg2, true);
        field2602++;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(JB)V", line = 161)
    public static final void method1149(long arg0, byte arg1) {
        field2606++;
        if (arg0 <= 0L) {
            return;
        }
        if (arg1 <= 123) {
            method1150(67);
        }
        if (arg0 % 10L == 0L) {
            class328.method2276((byte) -110, arg0 - 1L);
            class328.method2276((byte) -125, 1L);
        } else {
            class328.method2276((byte) -104, arg0);
        }
    }

    @OriginalMember(owner = "client!oe", name = "<init>", descriptor = "()V", line = 182)
    public class142() {
    }

    @OriginalMember(owner = "client!oe", name = "e", descriptor = "(I)V", line = 186)
    public static void method1150(int arg0) {
        field2600 = null;
        if (arg0 != 2042) {
            field2600 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Ljava/lang/String;I)J", line = 201)
    public static final long method1151(String arg0, int arg1) {
        field2603++;
        int var2 = arg0.length();
        long var3 = 0L;
        if (arg1 > -51) {
            method1150(4);
        }
        for (int var5 = 0; var5 < var2; var5++) {
            var3 *= 37L;
            char var6 = arg0.charAt(var5);
            if (var6 >= 'A' && var6 <= 'Z') {
                var3 += (long) (var6 - 64);
            } else if (var6 >= 'a' && var6 <= 'z') {
                var3 += (long) (var6 + 1 - 97);
            } else if (var6 >= '0' && var6 <= '9') {
                var3 += (long) (27 - (48 - var6));
            }
            if (var3 >= 177917621779460413L) {
                break;
            }
        }
        while ((var3 % 37L) == 0L && var3 != 0L) {
            var3 /= 37L;
        }
        return var3;
    }

    @OriginalMember(owner = "client!oe", name = "<init>", descriptor = "(I)V", line = 242)
    public class142(int arg0) {
        this.field2601 = arg0;
    }
}
