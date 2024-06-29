import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hm")
public class class166 {

    @OriginalMember(owner = "client!hm", name = "k", descriptor = "I")
    private int field2426 = 0;

    @OriginalMember(owner = "client!hm", name = "p", descriptor = "I")
    private int field2431 = -1;

    @OriginalMember(owner = "client!hm", name = "m", descriptor = "Lnj;")
    private class317 field2428 = new class317();

    @OriginalMember(owner = "client!hm", name = "q", descriptor = "Z")
    public boolean field2432 = false;

    @OriginalMember(owner = "client!hm", name = "n", descriptor = "I")
    private int field2429;

    @OriginalMember(owner = "client!hm", name = "h", descriptor = "I")
    private int field2423;

    @OriginalMember(owner = "client!hm", name = "i", descriptor = "[Lh;")
    private class164[] field2424;

    @OriginalMember(owner = "client!hm", name = "o", descriptor = "[[[I")
    private int[][][] field2430;

    @OriginalMember(owner = "client!hm", name = "g", descriptor = "Lqu;")
    public static class219 field2422 = new class219(60, -1);

    @OriginalMember(owner = "client!hm", name = "f", descriptor = "F")
    public static float field2421;

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "I")
    public static int field2416;

    @OriginalMember(owner = "client!hm", name = "b", descriptor = "I")
    public static int field2417;

    @OriginalMember(owner = "client!hm", name = "c", descriptor = "I")
    public static int field2418;

    @OriginalMember(owner = "client!hm", name = "d", descriptor = "I")
    public static int field2419;

    @OriginalMember(owner = "client!hm", name = "e", descriptor = "I")
    public static int field2420;

    @OriginalMember(owner = "client!hm", name = "j", descriptor = "I")
    public static int field2425;

    @OriginalMember(owner = "client!hm", name = "l", descriptor = "I")
    public static int field2427;

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(IB)Lsd;")
    public static final class202 method1045(int arg0, byte arg1) {
        if (arg1 >= -88) {
            method1047((byte) -8);
        }
        field2427++;
        if (arg0 == 0) {
            return new class188();
        } else if (arg0 == 1) {
            return new class418();
        } else if (arg0 == 2) {
            return new class225();
        } else if (arg0 == 3) {
            return new class7();
        } else if (arg0 == 4) {
            return new class338();
        } else if (arg0 == 5) {
            return new class108();
        } else if (arg0 == 6) {
            return new class9();
        } else if (arg0 == 7) {
            return new class131();
        } else if (arg0 == 8) {
            return new class172();
        } else if (arg0 == 9) {
            return new class84();
        } else if (arg0 == 10) {
            return new class248();
        } else if (arg0 == 11) {
            return new class535();
        } else if (arg0 == 12) {
            return new class5();
        } else if (arg0 == 13) {
            return new class226();
        } else if (arg0 == 14) {
            return new class138();
        } else if (arg0 == 15) {
            return new class159();
        } else if (arg0 == 16) {
            return new class372();
        } else if (arg0 == 17) {
            return new class103();
        } else if (arg0 == 18) {
            return new class271();
        } else if (arg0 == 19) {
            return new class144();
        } else if (arg0 == 20) {
            return new class193();
        } else if (arg0 == 21) {
            return new class24();
        } else if (arg0 == 22) {
            return new class482();
        } else if (arg0 == 23) {
            return new class4();
        } else if (arg0 == 24) {
            return new class155();
        } else if (arg0 == 25) {
            return new class63();
        } else if (arg0 == 26) {
            return new class18();
        } else if (arg0 == 27) {
            return new class460();
        } else if (arg0 == 28) {
            return new class183();
        } else if (arg0 == 29) {
            return new class496();
        } else if (arg0 == 30) {
            return new class243();
        } else if (arg0 == 31) {
            return new class254();
        } else if (arg0 == 32) {
            return new class88();
        } else if (arg0 == 33) {
            return new class541();
        } else if (arg0 == 34) {
            return new class416();
        } else if (arg0 == 35) {
            return new class52();
        } else if (arg0 == 36) {
            return new class181();
        } else if (arg0 == 37) {
            return new class266();
        } else if (arg0 == 38) {
            return new class112();
        } else if (arg0 == 39) {
            return new class509();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(IIIZII)V")
    public static final void method1046(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        class259.field4185 = arg4;
        class71.field1076 = arg0;
        class46.field604 = arg2;
        field2420++;
        if (!arg3) {
            return;
        }
        class240.field3913 = arg1;
        class460.field7101 = arg5;
        if (class240.field3913 >= 100) {
            int var6 = class259.field4185 * 128 + 64;
            int var7 = class71.field1076 * 128 + 64;
            int var8 = class532.method3165(class201.field3057, var6, !arg3, var7) - class46.field604;
            int var9 = var6 - class163.field2367;
            int var10 = var8 - class371.field5703;
            int var11 = var7 - class98.field1404;
            int var12 = (int) Math.sqrt((double) (var9 * var9 + var11 * var11));
            class220.field3723 = (int) (Math.atan2((double) var10, (double) var12) * 2607.5945876176133D) & 0x3FFF;
            class387.field5912 = (int) (Math.atan2((double) var9, (double) var11) * -2607.5945876176133D) & 0x3FFF;
            if (class220.field3723 < 1024) {
                class220.field3723 = 1024;
            }
            class253.field4106 = 0;
            if (class220.field3723 > 3072) {
                class220.field3723 = 3072;
            }
        }
        class334.field5222 = 2;
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(B)V")
    public static final void method1047(byte arg0) {
        class170.field2488.field3162 = 0;
        field2419++;
        class141.field1907 = 0;
        class156.field2156 = 0;
        class279.field4428.field3162 = 0;
        class283.field4460 = null;
        class541.field7900 = null;
        class471.field7212 = null;
        class513.field7615 = 0;
        class414.field6279 = null;
        class524.method3128((byte) 35);
        class247.method1713(-1);
        for (int var1 = 0; var1 < 2048; var1++) {
            class264.field4276[var1] = null;
        }
        class358.field5565 = null;
        for (int var2 = 0; var2 < class78.field1176; var2++) {
            class378 var4 = class14.field150[var2].field378;
            if (var4 != null) {
                var4.field829 = -1;
            }
        }
        if (arg0 != -9) {
            field2421 = 1.1206099F;
        }
        class425.method2694(arg0 ^ 0xFFFFFFF6);
        class334.field5222 = 1;
        class89.method610(9, (byte) -120);
        for (int var3 = 0; var3 < 100; var3++) {
            class520.field7707[var3] = true;
        }
        class411.method2628(arg0 + 9);
        class34.field353 = null;
        class360.field5576 = 0L;
    }

    @OriginalMember(owner = "client!hm", name = "b", descriptor = "(B)[[[I")
    public final int[][][] method1048(byte arg0) {
        int var2 = -42 / ((arg0 - 42) / 42);
        field2418++;
        if (this.field2429 != this.field2423) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var3 = 0; var3 < this.field2423; var3++) {
            this.field2424[var3] = class4.field46;
        }
        return this.field2430;
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(IIIIIZII)V")
    public static final void method1049(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        if (class178.field2609 <= arg6 && class460.field7096 >= arg7 && arg0 >= class462.field7105 && arg2 <= class222.field3750) {
            class162.method1019(arg1, arg7, arg3, (byte) 123, arg2, arg0, arg6, arg4);
        } else {
            class396.method2555(-1, arg0, arg3, arg7, arg2, arg1, arg4, arg6);
        }
        if (!arg5) {
            field2417++;
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(II)[[I")
    public final int[][] method1050(int arg0, int arg1) {
        field2416++;
        int var3 = -4 / ((7 - arg1) / 42);
        if (this.field2429 == this.field2423) {
            this.field2432 = this.field2424[arg0] == null;
            this.field2424[arg0] = class4.field46;
            return this.field2430[arg0];
        } else if (this.field2423 == 1) {
            this.field2432 = this.field2431 != arg0;
            this.field2431 = arg0;
            return this.field2430[0];
        } else {
            class164 var4 = this.field2424[arg0];
            if (var4 == null) {
                this.field2432 = true;
                if (this.field2423 <= this.field2426) {
                    class164 var5 = (class164) this.field2428.method2125(18007);
                    var4 = new class164(arg0, var5.field2375);
                    this.field2424[var5.field2373] = null;
                    var5.method3149(92);
                } else {
                    var4 = new class164(arg0, this.field2426);
                    this.field2426++;
                }
                this.field2424[arg0] = var4;
            } else {
                this.field2432 = false;
            }
            this.field2428.method2116(var4, (byte) -73);
            return this.field2430[var4.field2375];
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(I)V")
    public static void method1051(int arg0) {
        if (arg0 != -2) {
            method1051(121);
        }
        field2422 = null;
    }

    @OriginalMember(owner = "client!hm", name = "b", descriptor = "(I)V")
    public final void method1052(int arg0) {
        field2425++;
        for (int var2 = 0; var2 < this.field2423; var2++) {
            this.field2430[var2][0] = null;
            this.field2430[var2][1] = null;
            this.field2430[var2][2] = null;
            this.field2430[var2] = null;
        }
        this.field2430 = null;
        if (arg0 != -12722) {
            this.field2426 = -6;
        }
        this.field2424 = null;
        this.field2428.method2120((byte) 27);
        this.field2428 = null;
    }

    @OriginalMember(owner = "client!hm", name = "<init>", descriptor = "(III)V")
    public class166(int arg0, int arg1, int arg2) {
        this.field2429 = arg1;
        this.field2423 = arg0;
        this.field2424 = new class164[this.field2429];
        this.field2430 = new int[this.field2423][3][arg2];
    }
}
