import java.awt.Component;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class144 {

    @OriginalMember(owner = "client!tc", name = "r", descriptor = "I")
    private int field2625 = 32;

    @OriginalMember(owner = "client!tc", name = "l", descriptor = "J")
    private long field2619 = class261.method1765(16299);

    @OriginalMember(owner = "client!tc", name = "B", descriptor = "J")
    private long field2635 = 0L;

    @OriginalMember(owner = "client!tc", name = "x", descriptor = "J")
    private long field2631 = 0L;

    @OriginalMember(owner = "client!tc", name = "z", descriptor = "[Lmi;")
    private class204[] field2633 = new class204[8];

    @OriginalMember(owner = "client!tc", name = "F", descriptor = "Z")
    private boolean field2639 = true;

    @OriginalMember(owner = "client!tc", name = "G", descriptor = "[Lmi;")
    private class204[] field2640 = new class204[8];

    @OriginalMember(owner = "client!tc", name = "E", descriptor = "I")
    private int field2638 = 0;

    @OriginalMember(owner = "client!tc", name = "y", descriptor = "I")
    private int field2632 = 0;

    @OriginalMember(owner = "client!tc", name = "H", descriptor = "I")
    private int field2641 = 0;

    @OriginalMember(owner = "client!tc", name = "I", descriptor = "I")
    private int field2642 = 0;

    @OriginalMember(owner = "client!tc", name = "k", descriptor = "I")
    public static int field2618 = 0;

    @OriginalMember(owner = "client!tc", name = "m", descriptor = "I")
    public static int field2620 = 50;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "I")
    public static int field2608;

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "I")
    public static int field2609;

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "I")
    public static int field2610;

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "I")
    public static int field2612;

    @OriginalMember(owner = "client!tc", name = "f", descriptor = "I")
    public static int field2613;

    @OriginalMember(owner = "client!tc", name = "g", descriptor = "I")
    public static int field2614;

    @OriginalMember(owner = "client!tc", name = "h", descriptor = "I")
    public static int field2615;

    @OriginalMember(owner = "client!tc", name = "i", descriptor = "I")
    public static int field2616;

    @OriginalMember(owner = "client!tc", name = "j", descriptor = "I")
    public static int field2617;

    @OriginalMember(owner = "client!tc", name = "n", descriptor = "I")
    public static int field2621;

    @OriginalMember(owner = "client!tc", name = "o", descriptor = "I")
    public static int field2622;

    @OriginalMember(owner = "client!tc", name = "p", descriptor = "I")
    public static int field2623;

    @OriginalMember(owner = "client!tc", name = "q", descriptor = "I")
    public static int field2624;

    @OriginalMember(owner = "client!tc", name = "s", descriptor = "I")
    public static int field2626;

    @OriginalMember(owner = "client!tc", name = "t", descriptor = "I")
    public static int field2627;

    @OriginalMember(owner = "client!tc", name = "u", descriptor = "I")
    public static int field2628;

    @OriginalMember(owner = "client!tc", name = "w", descriptor = "I")
    public static int field2630;

    @OriginalMember(owner = "client!tc", name = "A", descriptor = "I")
    public int field2634;

    @OriginalMember(owner = "client!tc", name = "C", descriptor = "I")
    private int field2636;

    @OriginalMember(owner = "client!tc", name = "D", descriptor = "I")
    public int field2637;

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "Lmi;")
    private class204 field2611;

    @OriginalMember(owner = "client!tc", name = "v", descriptor = "[I")
    public int[] field2629;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 13)
    public void method311(Component arg0) throws Exception {
        field2617++;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lmi;IZ)V", line = 20)
    private final void method1045(class204 arg0, int arg1, boolean arg2) {
        field2621++;
        if (!arg2) {
            return;
        }
        int var4 = arg1 >> 5;
        class204 var5 = this.field2633[var4];
        if (var5 == null) {
            this.field2640[var4] = arg0;
        } else {
            var5.field3484 = arg0;
        }
        this.field2633[var4] = arg0;
        arg0.field3486 = arg1;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "([II)V", line = 41)
    private final void method1046(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class142.field2572) {
            var3 = arg1 << 1;
        }
        class230.method1563(arg0, 0, var3);
        this.field2638 -= arg1;
        if (this.field2611 != null && this.field2638 <= 0) {
            this.field2638 += class102.field1633 >> 4;
            class73.method533(0, this.field2611);
            this.method1045(this.field2611, this.field2611.method1435(), true);
            int var4 = 0;
            int var5 = 255;
            int var6 = 7;
            label105: while (var5 != 0) {
                int var7;
                int var8;
                if (var6 < 0) {
                    var7 = var6 & 0x3;
                    var8 = -(var6 >> 2);
                } else {
                    var7 = var6;
                    var8 = 0;
                }
                for (int var9 = var5 >>> var7 & 0x11111111; var9 != 0; var9 >>>= 0x4) {
                    if ((var9 & 0x1) != 0) {
                        var5 &= ~(0x1 << var7);
                        class204 var10 = null;
                        class204 var11 = this.field2640[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class188 var12 = var11.field3487;
                                if (var12 == null || var12.field3238 <= var8) {
                                    var11.field3485 = true;
                                    int var13 = var11.method573();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field3238 += var13;
                                    }
                                    if (var4 >= this.field2625) {
                                        break label105;
                                    }
                                    class204 var14 = var11.method571();
                                    if (var14 != null) {
                                        int var15 = var11.field3486;
                                        while (var14 != null) {
                                            this.method1045(var14, var15 * var14.method1435() >> 8, true);
                                            var14 = var11.method569();
                                        }
                                    }
                                    class204 var16 = var11.field3484;
                                    var11.field3484 = null;
                                    if (var10 == null) {
                                        this.field2640[var7] = var16;
                                    } else {
                                        var10.field3484 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field2633[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field3484;
                                }
                            }
                        }
                    }
                    var7 += 4;
                    var8++;
                }
                var6--;
            }
            for (int var17 = 0; var17 < 8; var17++) {
                class204 var18 = this.field2640[var17];
                this.field2640[var17] = this.field2633[var17] = null;
                while (var18 != null) {
                    class204 var19 = var18.field3484;
                    var18.field3484 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field2638 < 0) {
            this.field2638 = 0;
        }
        if (this.field2611 != null) {
            this.field2611.method564(arg0, 0, arg1);
        }
        this.field2619 = class261.method1765(16299);
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "()I", line = 200)
    public int method314() throws Exception {
        field2608++;
        return this.field2634;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IB)Z", line = 209)
    public static final boolean method1047(int arg0, byte arg1) {
        if (arg1 == 44) {
            field2622++;
            return (arg0 >> 28 & 0x1) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(B)V", line = 220)
    public final void method1048(byte arg0) {
        if (arg0 <= 64) {
            this.method1045((class204) null, -119, false);
        }
        field2626++;
        this.field2639 = true;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(I)V", line = 231)
    public final synchronized void method1049(int arg0) {
        field2628++;
        this.field2639 = true;
        try {
            this.method310();
            int var2 = 32 / ((-arg0 - 70) / 45);
        } catch (Exception var4) {
            this.method313();
            this.field2631 = class261.method1765(16299) + 2000L;
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(III[[[BIBII)V", line = 248)
    public static final void method1050(int arg0, int arg1, int arg2, byte[][][] arg3, int arg4, byte arg5, int arg6, int arg7) {
        class128.field2199++;
        class122.field2034 = 0;
        int var8 = arg6 - 16;
        int var9 = arg6 + 16;
        int var10 = arg7 - 16;
        int var11 = arg7 + 16;
        for (int var12 = class238.field4013; var12 < class228.field3848; var12++) {
            class5[][] var13 = class297.field4940[var12];
            for (int var14 = class300.field4970; var14 < class130.field2226; var14++) {
                for (int var15 = class270.field4558; var15 < class112.field1846; var15++) {
                    class5 var16 = var13[var14][var15];
                    if (var16 != null) {
                        if (class29.field411[var14 + class31.field438 - class175.field3094][var15 + class31.field438 - class169.field3016] && (arg3 == null || var12 < arg4 || arg3[var12][var14][var15] != arg5)) {
                            var16.field39 = true;
                            var16.field50 = true;
                            if (var16.field61 > 0) {
                                var16.field64 = true;
                            } else {
                                var16.field64 = false;
                            }
                            class122.field2034++;
                        } else {
                            var16.field39 = false;
                            var16.field50 = false;
                            var16.field51 = 0;
                            if (var14 >= var8 && var14 <= var9 && var15 >= var10 && var15 <= var11) {
                                if (var16.field46 != null) {
                                    class130 var17 = var16.field46;
                                    var17.field2234.method407(0, var12, var17.field2233, var17.field2228, var17.field2240);
                                    if (var17.field2239 != null) {
                                        var17.field2239.method407(0, var12, var17.field2233, var17.field2228, var17.field2240);
                                    }
                                }
                                if (var16.field49 != null) {
                                    class107 var18 = var16.field49;
                                    var18.field1684.method407(var18.field1685, var12, var18.field1689, var18.field1688, var18.field1681);
                                    if (var18.field1683 != null) {
                                        var18.field1683.method407(var18.field1685, var12, var18.field1689, var18.field1688, var18.field1681);
                                    }
                                }
                                if (var16.field52 != null) {
                                    class8 var19 = var16.field52;
                                    var19.field103.method407(0, var12, var19.field91, var19.field90, var19.field102);
                                }
                                if (var16.field54 != null) {
                                    for (int var20 = 0; var20 < var16.field61; var20++) {
                                        class240 var21 = var16.field54[var20];
                                        var21.field4043.method407(var21.field4055, var12, var21.field4057, var21.field4058, var21.field4047);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        boolean var22 = class264.field4396 == class177.field3122;
        if (class56.field846) {
            GL var23 = class56.field848;
            var23.glPushMatrix();
            var23.glTranslatef((float) (-arg0), (float) (-arg1), (float) (-arg2));
            if (var22) {
                class48.method298();
                class51.method325(3, -1, 26604);
                class182.field3165 = true;
                class42.method271();
                class136.field2364 = -1;
                class18.field248 = -1;
                for (int var24 = 0; var24 < class89.field1398[0].length; var24++) {
                    class201 var25 = class89.field1398[0][var24];
                    float var26 = 251.5F - (var25.field3430 ? 1.0F : 0.5F);
                    if (class136.field2364 != var25.field3447) {
                        class136.field2364 = var25.field3447;
                        class272.method1823(-23, var25.field3447);
                        class235.method1598(class200.method1414(65346));
                    }
                    var25.method1418(class297.field4940, var26, false);
                }
                class42.method268();
            } else {
                int var27 = class238.field4013;
                while (true) {
                    if (var27 >= class228.field3848) {
                        class256.method1736(class175.field3094, class169.field3016, class297.field4940);
                        break;
                    }
                    for (int var28 = 0; var28 < class89.field1398[var27].length; var28++) {
                        class201 var29 = class89.field1398[var27][var28];
                        float var30 = 201.5F - (float) var27 * 50.0F - (var29.field3430 ? 1.0F : 0.5F);
                        if (var29.field3424 != -1 && class236.field3987.method598(true, var29.field3424) == 4 && class40.field640) {
                            class272.method1823(-6, var29.field3447);
                        }
                        var29.method1418(class297.field4940, var30, false);
                    }
                    if (var27 == 0 && class55.field836 > 0) {
                        class56.method355(101.5F);
                        class66.method478(class175.field3094, class169.field3016, class31.field438, arg1, class29.field411, class264.field4396[0]);
                    }
                    var27++;
                }
            }
            var23.glPopMatrix();
        }
        for (int var31 = class238.field4013; var31 < class228.field3848; var31++) {
            class5[][] var32 = class297.field4940[var31];
            for (int var33 = -class31.field438; var33 <= 0; var33++) {
                int var34 = class175.field3094 + var33;
                int var35 = class175.field3094 - var33;
                if (var34 >= class300.field4970 || var35 < class130.field2226) {
                    for (int var36 = -class31.field438; var36 <= 0; var36++) {
                        int var37 = class169.field3016 + var36;
                        int var38 = class169.field3016 - var36;
                        if (var34 >= class300.field4970) {
                            if (var37 >= class270.field4558) {
                                class5 var39 = var32[var34][var37];
                                if (var39 != null && var39.field39) {
                                    class313.method2185(var39, true);
                                }
                            }
                            if (var38 < class112.field1846) {
                                class5 var40 = var32[var34][var38];
                                if (var40 != null && var40.field39) {
                                    class313.method2185(var40, true);
                                }
                            }
                        }
                        if (var35 < class130.field2226) {
                            if (var37 >= class270.field4558) {
                                class5 var41 = var32[var35][var37];
                                if (var41 != null && var41.field39) {
                                    class313.method2185(var41, true);
                                }
                            }
                            if (var38 < class112.field1846) {
                                class5 var42 = var32[var35][var38];
                                if (var42 != null && var42.field39) {
                                    class313.method2185(var42, true);
                                }
                            }
                        }
                        if (class122.field2034 == 0) {
                            if (!var22) {
                                class27.field377 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        for (int var43 = class238.field4013; var43 < class228.field3848; var43++) {
            class5[][] var44 = class297.field4940[var43];
            for (int var45 = -class31.field438; var45 <= 0; var45++) {
                int var46 = class175.field3094 + var45;
                int var47 = class175.field3094 - var45;
                if (var46 >= class300.field4970 || var47 < class130.field2226) {
                    for (int var48 = -class31.field438; var48 <= 0; var48++) {
                        int var49 = class169.field3016 + var48;
                        int var50 = class169.field3016 - var48;
                        if (var46 >= class300.field4970) {
                            if (var49 >= class270.field4558) {
                                class5 var51 = var44[var46][var49];
                                if (var51 != null && var51.field39) {
                                    class313.method2185(var51, false);
                                }
                            }
                            if (var50 < class112.field1846) {
                                class5 var52 = var44[var46][var50];
                                if (var52 != null && var52.field39) {
                                    class313.method2185(var52, false);
                                }
                            }
                        }
                        if (var47 < class130.field2226) {
                            if (var49 >= class270.field4558) {
                                class5 var53 = var44[var47][var49];
                                if (var53 != null && var53.field39) {
                                    class313.method2185(var53, false);
                                }
                            }
                            if (var50 < class112.field1846) {
                                class5 var54 = var44[var47][var50];
                                if (var54 != null && var54.field39) {
                                    class313.method2185(var54, false);
                                }
                            }
                        }
                        if (class122.field2034 == 0) {
                            if (!var22) {
                                class27.field377 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        class27.field377 = false;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lce;I)I", line = 620)
    public static final int method1051(class126 arg0, int arg1) {
        field2630++;
        if (class228.field3852 == null || arg0.method878((byte) 46) == 0) {
            return -1;
        }
        int var2 = 0;
        if (arg1 != 27154) {
            return 47;
        }
        while (var2 < class228.field3852.field887) {
            if (class228.field3852.field885[var2].method863(class23.field322, class301.field4979, -128).method858((byte) -23, arg0)) {
                return var2;
            }
            var2++;
        }
        return -1;
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "()V", line = 648)
    public void method312() throws Exception {
        field2609++;
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(B)V", line = 655)
    public final synchronized void method1052(byte arg0) {
        if (arg0 != 123) {
            this.field2631 = -45L;
        }
        if (class68.field1123 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class68.field1123.field3038[var3] == this) {
                    class68.field1123.field3038[var3] = null;
                }
                if (class68.field1123.field3038[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class68.field1123.field3047 = true;
                while (class68.field1123.field3052) {
                    class313.method2158(50L, true);
                }
                class68.field1123 = null;
            }
        }
        field2624++;
        this.method313();
        this.field2629 = null;
    }

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "()V", line = 697)
    public void method310() throws Exception {
        field2613++;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(ILmi;)V", line = 707)
    public final synchronized void method1053(int arg0, class204 arg1) {
        if (arg0 != 0) {
            this.field2619 = -34L;
        }
        this.field2611 = arg1;
        field2623++;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(BZ)V", line = 721)
    public static final void method1054(byte arg0, boolean arg1) {
        field2610++;
        if (arg1) {
            if (class182.field3162 != -1) {
                class176.method1282(class182.field3162, 4);
            }
            for (class65 var2 = (class65) class16.field222.method1630((byte) 56); var2 != null; var2 = (class65) class16.field222.method1632(-104)) {
                class257.method1744(var2, 1819444368, true);
            }
            class182.field3162 = -1;
            class16.field222 = new class237(8);
            class10.method59(30619);
            class182.field3162 = class85.field1357;
            class100.method679(false, -14575);
            class241.method1652((byte) 34);
            class122.method800(1, class182.field3162);
        }
        if (arg0 != 5) {
            return;
        }
        class202.field3465 = -1;
        class96.method658((byte) -120, class192.field3285);
        class286.field4744 = new class301();
        class286.field4744.field2461 = 3000;
        class286.field4744.field2487 = 3000;
        if (!class56.field846) {
            class139.method1019(-68, class127.field2170);
            class280.method1872(arg0 - 128, 10);
            return;
        }
        if (class254.field4261 == 2) {
            class223.field3755 = class91.field1439 << 7;
            class152.field2780 = class207.field3556 << 7;
        } else {
            class73.method527(2);
        }
        class180.method1291(4064);
        class292.method1934((byte) -51);
        class280.method1872(-112, 28);
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(ZI)I", line = 788)
    public static final int method1055(boolean arg0, int arg1) {
        field2612++;
        if (arg1 < 0) {
            return 0;
        }
        class192 var2 = (class192) class95.field1496.method1631(arg0, (long) arg1);
        if (var2 == null) {
            return class118.method774(arg1, -23393).field4823;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < var2.field3281.length; var4++) {
            if (var2.field3281[var4] == -1) {
                var3++;
            }
        }
        return var3 + class118.method774(arg1, -23393).field4823 - var2.field3281.length;
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(I)V", line = 819)
    public void method315(int arg0) throws Exception {
        field2616++;
    }

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "(B)V", line = 826)
    public final synchronized void method1056(byte arg0) {
        field2615++;
        if (this.field2629 == null) {
            return;
        }
        long var2 = class261.method1765(16299);
        try {
            if (this.field2631 != 0L) {
                if (this.field2631 > var2) {
                    return;
                }
                this.method315(this.field2634);
                this.field2639 = true;
                this.field2631 = 0L;
            }
            int var4 = this.method314();
            if ((this.field2642 - var4) > this.field2632) {
                this.field2632 = this.field2642 - var4;
            }
            int var5 = this.field2637 + this.field2636;
            if ((var5 + 256) > 16384) {
                var5 = 16128;
            }
            if ((var5 + 256) > this.field2634) {
                this.field2634 += 1024;
                if (this.field2634 > 16384) {
                    this.field2634 = 16384;
                }
                this.method313();
                this.method315(this.field2634);
                if (var5 + 256 > this.field2634) {
                    var5 = this.field2634 - 256;
                    this.field2636 = var5 - this.field2637;
                }
                var4 = 0;
                this.field2639 = true;
            }
            if (arg0 != -90) {
                this.field2631 = 20L;
            }
            while (var4 < var5) {
                this.method1046(this.field2629, 256);
                var4 += 256;
                this.method312();
            }
            if (var2 > this.field2635) {
                if (this.field2639) {
                    this.field2639 = false;
                } else if (this.field2632 == 0 && this.field2641 == 0) {
                    this.method313();
                    this.field2631 = var2 + 2000L;
                    return;
                } else {
                    this.field2636 = Math.min(this.field2641, this.field2632);
                    this.field2641 = this.field2632;
                }
                this.field2632 = 0;
                this.field2635 = var2 + 2000L;
            }
            this.field2642 = var4;
        } catch (Exception var9) {
            this.method313();
            this.field2631 = var2 + 2000L;
        }
        try {
            if (this.field2619 + 500000L < var2) {
                var2 = this.field2619;
            }
            while (var2 > this.field2619 + 5000L) {
                this.method1057(256, 256);
                this.field2619 += (long) (256000 / class102.field1633);
            }
        } catch (Exception var8) {
            this.field2619 = var2;
        }
    }

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "()V", line = 947)
    public void method313() {
        field2614++;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(II)V", line = 954)
    private final void method1057(int arg0, int arg1) {
        this.field2638 -= arg1;
        if (arg0 != 256) {
            return;
        }
        if (this.field2638 < 0) {
            this.field2638 = 0;
        }
        if (this.field2611 != null) {
            this.field2611.method568(arg1);
        }
        field2627++;
    }
}
