import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class132 extends class202 {

    @OriginalMember(owner = "client!ba", name = "X", descriptor = "Lsb;")
    private class98 field2344 = class23.field469;

    @OriginalMember(owner = "client!ba", name = "P", descriptor = "Lsb;")
    public static class98 field2336 = class47.method368("Lade Wordpack )2 ", 0);

    @OriginalMember(owner = "client!ba", name = "T", descriptor = "Z")
    public static volatile boolean field2340 = true;

    @OriginalMember(owner = "client!ba", name = "Z", descriptor = "I")
    public static int field2346 = 0;

    @OriginalMember(owner = "client!ba", name = "gb", descriptor = "I")
    public static int field2353 = 0;

    @OriginalMember(owner = "client!ba", name = "jb", descriptor = "Lsb;")
    public static class98 field2356 = class47.method368("loginscreen", 0);

    @OriginalMember(owner = "client!ba", name = "N", descriptor = "I")
    public static int field2335;

    @OriginalMember(owner = "client!ba", name = "Q", descriptor = "I")
    public static int field2337;

    @OriginalMember(owner = "client!ba", name = "R", descriptor = "I")
    public static int field2338;

    @OriginalMember(owner = "client!ba", name = "S", descriptor = "I")
    public static int field2339;

    @OriginalMember(owner = "client!ba", name = "U", descriptor = "I")
    public static int field2341;

    @OriginalMember(owner = "client!ba", name = "V", descriptor = "I")
    public int field2342;

    @OriginalMember(owner = "client!ba", name = "W", descriptor = "I")
    public static int field2343;

    @OriginalMember(owner = "client!ba", name = "Y", descriptor = "I")
    public static int field2345;

    @OriginalMember(owner = "client!ba", name = "ab", descriptor = "I")
    public static int field2347;

    @OriginalMember(owner = "client!ba", name = "bb", descriptor = "I")
    private int field2348;

    @OriginalMember(owner = "client!ba", name = "db", descriptor = "I")
    public int field2350;

    @OriginalMember(owner = "client!ba", name = "ib", descriptor = "I")
    public static int field2355;

    @OriginalMember(owner = "client!ba", name = "cb", descriptor = "Lwa;")
    private class219 field2349;

    @OriginalMember(owner = "client!ba", name = "hb", descriptor = "Lwa;")
    private class219 field2354;

    @OriginalMember(owner = "client!ba", name = "fb", descriptor = "Lnj;")
    public static class82 field2352;

    @OriginalMember(owner = "client!ba", name = "eb", descriptor = "[I")
    public static int[] field2351;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(ILlj;)V")
    public final void method991(int arg0, class216 arg1) {
        if (arg0 != 0) {
            this.field2348 = -50;
        }
        while (true) {
            int var3 = arg1.method1446(arg0 ^ 0x14E6);
            if (var3 == 0) {
                field2337++;
                return;
            }
            this.method994((byte) 104, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "(II)I")
    public final int method992(int arg0, int arg1) {
        field2339++;
        if (this.field2354 == null) {
            return this.field2348;
        }
        class224 var3 = (class224) this.field2354.method1511((byte) -125, (long) arg1);
        if (var3 == null) {
            return this.field2348;
        } else {
            if (arg0 <= 87) {
                this.method994((byte) -38, (class216) null, 31);
            }
            return var3.field3858;
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lsb;I)Z")
    public final boolean method993(class98 arg0, int arg1) {
        field2345++;
        if (this.field2354 == null) {
            return false;
        }
        if (this.field2349 == null) {
            this.method1000((byte) 93);
        }
        for (class261 var3 = (class261) this.field2349.method1511((byte) -125, arg0.method701(16883)); var3 != null; var3 = (class261) this.field2349.method1516(-97)) {
            if (var3.field4582.method748(true, arg0)) {
                return true;
            }
        }
        if (arg1 != -11472) {
            this.method997(50, -99);
        }
        return false;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(BLlj;I)V")
    private final void method994(byte arg0, class216 arg1, int arg2) {
        if (arg2 == 1) {
            this.field2350 = arg1.method1446(5350);
        } else if (arg2 == 2) {
            this.field2342 = arg1.method1446(5350);
        } else if (arg2 == 3) {
            this.field2344 = arg1.method1445(-3);
        } else if (arg2 == 4) {
            this.field2348 = arg1.method1442(-1330139880);
        } else if (arg2 == 5 || arg2 == 6) {
            int var4 = arg1.method1487(90);
            this.field2354 = new class219(class186.method1286((byte) 113, var4));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg1.method1442(-1330139880);
                class235 var7;
                if (arg2 == 5) {
                    var7 = new class97(arg1.method1445(-3));
                } else {
                    var7 = new class224(arg1.method1442(-1330139880));
                }
                this.field2354.method1513((long) var6, var7, -1);
            }
        }
        if (arg0 < 85) {
            this.field2350 = 110;
        }
        field2347++;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IB)V")
    public static final void method995(int arg0, byte arg1) {
        field2335++;
        if (class141.method1056(arg0, (byte) -59) && arg1 <= -115) {
            class215.method1433(-1, (byte) -75, class33.field585[arg0]);
        }
    }

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "(II)Lsb;")
    public final class98 method996(int arg0, int arg1) {
        field2355++;
        if (this.field2354 == null) {
            return this.field2344;
        }
        class97 var3 = (class97) this.field2354.method1511((byte) -122, (long) arg0);
        if (arg1 < 13) {
            return null;
        } else if (var3 == null) {
            return this.field2344;
        } else {
            return var3.field1667;
        }
    }

    @OriginalMember(owner = "client!ba", name = "e", descriptor = "(II)Z")
    public final boolean method997(int arg0, int arg1) {
        field2338++;
        if (this.field2354 == null) {
            return false;
        }
        if (this.field2349 == null) {
            this.method999((byte) 73);
        }
        class224 var3 = (class224) this.field2349.method1511((byte) -128, (long) arg1);
        if (var3 == null) {
            return false;
        } else if (arg0 <= 6) {
            return true;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(I)V")
    public static void method998(int arg0) {
        field2351 = null;
        int var1 = 67 % ((arg0 - 61) / 45);
        field2352 = null;
        field2336 = null;
        field2356 = null;
    }

    @OriginalMember(owner = "client!ba", name = "g", descriptor = "(B)V")
    private final void method999(byte arg0) {
        field2343++;
        this.field2349 = new class219(this.field2354.method1510((byte) 91));
        for (class224 var2 = (class224) this.field2354.method1514((byte) 115); var2 != null; var2 = (class224) this.field2354.method1515(86)) {
            class224 var4 = new class224((int) var2.field4061);
            this.field2349.method1513((long) var2.field3858, var4, -1);
        }
        int var3 = -3 % ((-arg0 - 38) / 59);
    }

    @OriginalMember(owner = "client!ba", name = "h", descriptor = "(B)V")
    private final void method1000(byte arg0) {
        field2341++;
        this.field2349 = new class219(this.field2354.method1510((byte) 96));
        if (arg0 >= 86) {
            for (class97 var2 = (class97) this.field2354.method1514((byte) 118); var2 != null; var2 = (class97) this.field2354.method1515(104)) {
                class261 var3 = new class261(var2.field1667, (int) var2.field4061);
                this.field2349.method1513(var2.field1667.method701(16883), var3, -1);
            }
        }
    }
}
