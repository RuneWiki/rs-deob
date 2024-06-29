import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class136 extends class30 {

    @OriginalMember(owner = "client!li", name = "x", descriptor = "I")
    public int field2428;

    @OriginalMember(owner = "client!li", name = "D", descriptor = "I")
    private int field2434;

    @OriginalMember(owner = "client!li", name = "y", descriptor = "[Z")
    public boolean[] field2429;

    @OriginalMember(owner = "client!li", name = "A", descriptor = "[[I")
    public int[][] field2431;

    @OriginalMember(owner = "client!li", name = "w", descriptor = "[I")
    public int[] field2427;

    @OriginalMember(owner = "client!li", name = "z", descriptor = "Lbd;")
    public static class98 field2430 = null;

    @OriginalMember(owner = "client!li", name = "v", descriptor = "Lsc;")
    public static class56 field2426 = new class56(8);

    @OriginalMember(owner = "client!li", name = "E", descriptor = "Lia;")
    public static class257 field2435 = class28.method234(-41, ")1p");

    @OriginalMember(owner = "client!li", name = "I", descriptor = "Lia;")
    private static class257 field2439 = class28.method234(71, "Your ignore list is full)3 Max of 100 users)3");

    @OriginalMember(owner = "client!li", name = "J", descriptor = "Lia;")
    public static class257 field2440 = class28.method234(80, "Null");

    @OriginalMember(owner = "client!li", name = "G", descriptor = "Lia;")
    public static class257 field2437 = field2439;

    @OriginalMember(owner = "client!li", name = "u", descriptor = "I")
    public static int field2425;

    @OriginalMember(owner = "client!li", name = "B", descriptor = "I")
    public static int field2432;

    @OriginalMember(owner = "client!li", name = "C", descriptor = "I")
    public static int field2433;

    @OriginalMember(owner = "client!li", name = "H", descriptor = "I")
    public static int field2438;

    @OriginalMember(owner = "client!li", name = "F", descriptor = "Lbh;")
    public static class2 field2436;

    @OriginalMember(owner = "client!li", name = "b", descriptor = "(B)V")
    public static void method940(byte arg0) {
        field2437 = null;
        field2435 = null;
        field2430 = null;
        field2440 = null;
        field2436 = null;
        if (arg0 < 70) {
            method942(-123, 99, (byte[]) null, (byte) 17);
        }
        field2426 = null;
        field2439 = null;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(I[B)V")
    public static final void method941(int arg0, byte[] arg1) {
        if (arg0 != 9175) {
            field2440 = null;
        }
        field2425++;
        int var2 = 0;
        while (true) {
            while (arg1.length > var2) {
                int var3 = arg1[var2++] * 64 - class182.field3159;
                int var4 = arg1[var2++] * 64 - class8.field174;
                if (var3 > 0 && var4 > 0 && class252.field4337 > var3 + 64 && class181.field3149 > var4 + 64) {
                    int var5 = var3 >> 6;
                    int var6 = class181.field3149 - var4 - 1 >> 6;
                    for (int var7 = 0; var7 < 64; var7++) {
                        for (int var8 = -64; var8 < 0; var8++) {
                            byte var9 = arg1[var2++];
                            if (var9 != 0) {
                                if ((var9 & 0x1) == 1) {
                                    byte var10 = arg1[var2++];
                                    if (class158.field2779[var5][var6] == null) {
                                        class158.field2779[var5][var6] = new byte[4096];
                                    }
                                    class158.field2779[var5][var6][(-(var8 + 1) << 6) + var7] = (byte) var10;
                                }
                                if ((var9 & 0x2) == 2) {
                                    byte var11 = arg1[var2++];
                                    if (class138.field2476[var5][var6] == null) {
                                        class138.field2476[var5][var6] = new byte[4096];
                                    }
                                    class138.field2476[var5][var6][(-(var8 + 1) << 6) + var7] = (byte) (var11 - 28);
                                }
                                if ((var9 & 0x4) == 4) {
                                    var2 += 3;
                                    int var12 = (arg1[var2 - 3] & 0xFF << 16) + ((arg1[var2 - 2] & 0xFF) << 8) + (arg1[var2 + -1] & 0xFF);
                                    if (class257.field4438[var5][var6] == null) {
                                        class257.field4438[var5][var6] = new int[4096];
                                    }
                                    var12--;
                                    class233 var13 = class5.method96(var12, false);
                                    if (var13.field3952 != null) {
                                        var13 = var13.method1537((byte) 87);
                                        if (var13 == null || var13.field3975 == -1) {
                                            continue;
                                        }
                                    }
                                    class257.field4438[var5][var6][(-(var8 + 1) << 6) + var7] = var13.field4019 + 1;
                                    class227 var14 = new class227();
                                    var14.field3814 = var3;
                                    var14.field3818 = var13.field3975;
                                    var14.field3815 = class181.field3149 - var4;
                                    class241.field4185.method287(var14, 0);
                                }
                            }
                        }
                    }
                } else {
                    for (int var15 = 0; var15 < 64; var15++) {
                        for (int var16 = -64; var16 < 0; var16++) {
                            byte var17 = arg1[var2++];
                            if (var17 != 0) {
                                if ((var17 & 0x1) == 1) {
                                    var2++;
                                }
                                if ((var17 & 0x2) == 2) {
                                    var2++;
                                }
                                if ((var17 & 0x4) == 4) {
                                    var2 += 3;
                                }
                            }
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(II[BB)Z")
    public static final boolean method942(int arg0, int arg1, byte[] arg2, byte arg3) {
        field2432++;
        boolean var4 = true;
        class152 var5 = new class152(arg2);
        int var6 = 6 / ((arg3 + 1) / 32);
        int var7 = -1;
        label68: while (true) {
            int var8 = var5.method1053(32767);
            if (var8 == 0) {
                return var4;
            }
            boolean var9 = false;
            var7 += var8;
            int var10 = 0;
            while (true) {
                int var14;
                class233 var17;
                do {
                    int var15;
                    int var16;
                    do {
                        do {
                            do {
                                do {
                                    while (var9) {
                                        int var18 = var5.method1055(-32768);
                                        if (var18 == 0) {
                                            continue label68;
                                        }
                                        var5.method1051((byte) -40);
                                    }
                                    int var11 = var5.method1055(-32768);
                                    if (var11 == 0) {
                                        continue label68;
                                    }
                                    var10 += var11 - 1;
                                    int var12 = var10 & 0x3F;
                                    int var13 = var10 >> 6 & 0x3F;
                                    var14 = var5.method1051((byte) 100) >> 2;
                                    var15 = arg0 + var13;
                                    var16 = arg1 + var12;
                                } while (var15 <= 0);
                            } while (var16 <= 0);
                        } while (var15 >= 103);
                    } while (var16 >= 103);
                    var17 = class5.method96(var7, false);
                } while (var14 == 22 && !class133.field2387 && var17.field4002 == 0 && var17.field4016 != 1 && !var17.field3981);
                var9 = true;
                if (!var17.method1525(-4772)) {
                    class16.field344++;
                    var4 = false;
                }
            }
        }
    }

    @OriginalMember(owner = "client!li", name = "<init>", descriptor = "(I[B)V")
    public class136(int arg0, byte[] arg1) {
        this.field2428 = arg0;
        class152 var3 = new class152(arg1);
        this.field2434 = var3.method1051((byte) -71);
        this.field2429 = new boolean[this.field2434];
        this.field2431 = new int[this.field2434][];
        this.field2427 = new int[this.field2434];
        for (int var4 = 0; var4 < this.field2434; var4++) {
            this.field2427[var4] = var3.method1051((byte) 93);
        }
        for (int var5 = 0; var5 < this.field2434; var5++) {
            this.field2429[var5] = var3.method1051((byte) 91) == 1;
        }
        for (int var6 = 0; var6 < this.field2434; var6++) {
            this.field2431[var6] = new int[var3.method1051((byte) -113)];
        }
        for (int var7 = 0; var7 < this.field2434; var7++) {
            for (int var8 = 0; var8 < this.field2431[var7].length; var8++) {
                this.field2431[var7][var8] = var3.method1051((byte) -52);
            }
        }
    }
}
